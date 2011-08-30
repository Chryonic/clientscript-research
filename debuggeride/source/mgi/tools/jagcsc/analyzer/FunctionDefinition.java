package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.abstractcode.FunctionArgument;
import mgi.tools.jagcsc.compiler.ClientScriptInstruction;

public abstract class FunctionDefinition {

	/**
	 * Contains function name.
	 */
	public String name;
	/**
	 * Contains function return type.
	 */
	public CS2Type returnType;
	/**
	 * Contains function arguments.
	 */
	public FunctionArgument[] arguments;
	/**
	 * Contains information if this function is safe.
	 * Safe means that there's no possibility of stack corruption.
	 */
	public boolean safe;
	/**
	 * Contains write buffer for include assembly instructions.
	 */
	protected ClientScriptInstruction<?>[] writeBuffer;
	/**
	 * Contains pointer to writeBuffer
	 */
	protected int writePointer = 0;
	/**
	 * Contains given function assembly instructions, which 
	 * are required for function to be called.
	 */
	public ClientScriptInstruction<?>[] assembly;
	
	
	public FunctionDefinition(String name, CS2Type returnType,FunctionArgument[] arguments,boolean isSafe) {
		this.name = name;
		this.returnType = returnType;
		this.arguments = arguments;
		this.safe = isSafe;
		this.writeBuffer = new ClientScriptInstruction<?>[5000];
		this.writePointer = 0;
	}
	
	
	protected final void bufferToAssembly() {
	    this.assembly = new ClientScriptInstruction<?>[this.writePointer];
	    for (int i = 0; i < this.writePointer; i++)
	    	this.assembly[i] = this.writeBuffer[i];
	}
	
	
}
