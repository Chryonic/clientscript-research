package mgi.tools.jagcsc.compiler;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.analyzer.CS2Type;
import mgi.utilities.ByteBuffer;

public class AssemblyWriter {

    /**
     * Our compiler instance, from where we pick needed information.
     */
    public Compiler compiler;
    /**
     * Our assembly generator instance, from where we pick generated assembly.
     */
    public AssemblyGenerator generator;
    

    public AssemblyWriter(Compiler compiler,AssemblyGenerator generator) {
    	this.compiler = compiler;
		this.generator = generator;
    }
    
    
    public byte[] writeAssembly() throws CompilerException {
	
		ByteBuffer csBuff = new ByteBuffer();
	
		csBuff.writeString(generator.scriptTree.function.name);
		
		for (int i = 0; i < generator.assembly.length; i++) {
		    ClientScriptInstruction<?> instr = generator.assembly[i];
		    csBuff.writeShort(instr.getOpcode());
		    if (instr.getOpcode() == Opcodes.PUSH_STRING)
		    	csBuff.writeString((String)instr.getAttachment());
		    else if (instr.getOpcode() == Opcodes.PUSH_LONG)
		    	csBuff.writeLong((Long)instr.getAttachment());
		    else if (instr.getOpcode() < 150 && instr.getOpcode() != Opcodes.RETURN  && instr.getOpcode() != Opcodes.POP_INT && instr.getOpcode() != Opcodes.POP_STRING)
		    	csBuff.writeInt((Integer)instr.getAttachment());
		    else
		    	csBuff.writeByte(((Boolean)instr.getAttachment()).booleanValue() ? (byte)1 : (byte)0);
		}	
		int csLength = csBuff.getPosition();
		int switchBlocksSize = 0; // TODO implement switch blocks encoding
		
		csBuff.writeInt(csLength);
		csBuff.writeShort(generator.localsRegister.calculateMaxLocals(0)); // max int locals
		csBuff.writeShort(generator.localsRegister.calculateMaxLocals(1)); // max string locals
		if (!compiler.flagEnabled(0x100)) {
		    csBuff.writeShort(generator.localsRegister.calculateMaxLocals(2)); // max long locals
		}
		csBuff.writeShort(generator.scriptTree.function.numArguments(CS2Type.int_type) + generator.scriptTree.function.numArguments(CS2Type.boolean_type) + generator.scriptTree.function.numArguments(CS2Type.char_type));
		csBuff.writeShort(generator.scriptTree.function.numArguments(CS2Type.string_type));
		if (!compiler.flagEnabled(0x100)) {
		    csBuff.writeShort(generator.scriptTree.function.numArguments(CS2Type.long_type));
		}
		csBuff.writeByte(0); // num switch blocks TODO
		
		csBuff.writeShort(switchBlocksSize);
		
		
		return csBuff.toArray(0, csBuff.getPosition());
    }
	
}
