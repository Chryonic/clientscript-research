package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.abstractcode.FunctionArgument;
import mgi.tools.jagcsc.compiler.ClientScriptInstruction;
import mgi.tools.jagcsc.compiler.Opcodes;

public class CS2Function extends FunctionDefinition {

	/**
	 * Contains id of the script that is being called.
	 */
	private int cs2_id;
	/**
	 * Contains call instruction of this function.
	 */
	private ClientScriptInstruction<?> callInstruction;
	
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
	 * @param id
	 * ID of this cs2 function.
	 */
	public CS2Function(String name, FunctionArgument[] arguments, CS2Type returnType, boolean isSafe,int id) {
		super(name, returnType, arguments, isSafe);
		this.cs2_id = id;
		this.callInstruction = new ClientScriptInstruction<Integer>(Opcodes.CALL_CS,this.cs2_id);
		this.writeBuffer[0] = this.callInstruction;
		this.writePointer = 1;
		this.bufferToAssembly();
	}

	public int getID() {
		return this.cs2_id;
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
		buff.append("cs2 ");
		buff.append(this.cs2_id);
		
		
		return buff.toString();
	}

}
