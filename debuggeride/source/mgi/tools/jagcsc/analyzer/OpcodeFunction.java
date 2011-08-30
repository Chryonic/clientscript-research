package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.abstractcode.FunctionArgument;
import mgi.tools.jagcsc.compiler.ClientScriptInstruction;

public class OpcodeFunction extends FunctionDefinition {

	/**
	 * Contains opcode of this function.
	 */
	private int opcode;
	/**
	 * Contains call instruction of this function.
	 */
	private ClientScriptInstruction<?> callInstruction;
	/**
	 * Contains constant argument.
	 */
	private FunctionArgument constantArgument;
	
	/**
	 * Constructs new opcode function with given arguments.
	 * @param name
	 * Name of this function.
	 * @param arguments
	 * Arguments of this function.
	 * @param returnType
	 * Return type of this function.
	 * @param isSafe
	 * Whether this function is safe. ( No stack corruption possibility).
	 * @param opcode
	 * Opcode in runtime of this function.
	 * @throws CompilerException
	 * If there's no const arguments.
	 */
	public OpcodeFunction(String name, FunctionArgument[] arguments, CS2Type returnType, boolean isSafe,int opcode) throws CompilerException {
		super(name, returnType, arguments, isSafe);
		this.opcode = opcode;
		int constArgs = 0;
		for (int i = 0; i < arguments.length; i++) {
			if (arguments[i].isConst) {
				this.makeInstruction(arguments[i]);
				constArgs++;
			}
		}
		if (constArgs < 0 || constArgs > 1) {
			throw new CompilerException("Found:" + constArgs + " constant arguments, expected 0 or 1.");
		}
		if (constArgs == 0) {
			this.makeInstruction(new FunctionArgument("__autoconst__",CS2Type.boolean_type,true));
		}
		this.bufferToAssembly();
	}

	public int getOpcode() {
		return opcode;
	}
	
	/**
	 * Make's call instruction with given Constant Argument.
	 * If given constant argument is null then 
	 * @param constArgument
	 * 
	 */
	private void makeInstruction(FunctionArgument constArgument) {
		this.constantArgument = constArgument;
		if (constArgument.type == CS2Type.boolean_type) {
			this.callInstruction = new ClientScriptInstruction<Boolean>(this.opcode,false);
		}
		else if (constArgument.type == CS2Type.int_type || constArgument.type == CS2Type.char_type) {
			this.callInstruction = new ClientScriptInstruction<Integer>(this.opcode,0);
		}
		else if (constArgument.type == CS2Type.string_type) {
			this.callInstruction = new ClientScriptInstruction<String>(this.opcode,"");
		}
		else if (constArgument.type == CS2Type.long_type) {
			this.callInstruction = new ClientScriptInstruction<Long>(this.opcode,0L);
		}
		this.writeBuffer[0] = this.callInstruction;
		this.writePointer = 1;
		
		
	}


	public FunctionArgument getConstantArgument() {
		return constantArgument;
	}

	
	@Override
	public String toString() {
		StringBuilder buff = new StringBuilder();
		
		if (!this.safe) {
			buff.append("unsafe ");
		}
		buff.append(this.returnType + " ");
		buff.append(this.name);
		buff.append("(");
		for (int i = 0; i < this.arguments.length; i++) {
			boolean last = i + 1 >= this.arguments.length;
			if (this.arguments[i].isConst)
				buff.append("const ");
			buff.append(this.arguments[i].type + " ");
			buff.append(this.arguments[i].name);
			buff.append(last ? ") " : ", ");
		}
		buff.append("opcode ");
		buff.append(this.opcode);
		
		
		return buff.toString();
	}
	
	
}
