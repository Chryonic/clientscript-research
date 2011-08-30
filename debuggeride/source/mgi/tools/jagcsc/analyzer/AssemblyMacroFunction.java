package mgi.tools.jagcsc.analyzer;

import mgi.tools.jagcsc.abstractcode.FunctionArgument;

public class AssemblyMacroFunction extends FunctionDefinition {

	/**
	 * Contains boolean if this function is already finished.
	 */
	private boolean finished = false;
	
	/**
	 * Constructs new assembly macro function with given arguments.
	 * isSafe for IncludeFunction is set to false because assembly macros are very unsafe.
	 * @param name
	 * Name of this macro.
	 * @param returnType
	 * Return type of this macro.
	 */
	public AssemblyMacroFunction(String name, CS2Type returnType) {
		super(name, returnType, new FunctionArgument[0], false);
	}
	
	
	/**
	 * Finishes this macro function, this
	 * method can be called only once.
	 */
	public void finish() {
		if (this.finished) {
			throw new RuntimeException("Already finished!");
		}
		this.finished = true;
		this.bufferToAssembly();
		
	}

}
