package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.Compiler;
import mgi.tools.jagcsc.CompilerException;
import mgi.tools.jagcsc.OutputMessage;
import mgi.tools.jagcsc.analyzer.FunctionDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Script {

	/**
	 * Our compiler instance.
	 */
	public Compiler compiler;
	/**
	 * Contains our function definitions.
	 */
	public Map<String,FunctionDefinition> functionDefinitions = new HashMap<String,FunctionDefinition>();
	/**
	 * Contains script function.
	 */
	public Function function;
	
	
	public Script(Compiler compiler) {
		this.compiler = compiler;
	}
	
	/**
	 * Get's function definition.
	 * @param name
	 * Name of the function.
	 * @return
	 * Return's definition with given name.
	 * @throws CompilerException
	 * If there's no function with given name defined.
	 */
	public FunctionDefinition getDefinition(String name) throws CompilerException {
		if (!this.functionDefinitions.containsKey(name))
			throw new CompilerException("Function definition " + name + " is not declared!");
		return this.functionDefinitions.get(name);
	}

	/**
	 * Declare's function definition.
	 * @param definition
	 * Definition which should be declared.
	 * @throws CompilerException
	 * If there's function or definition with the same name declared.
	 */
	public void declareDefinition(FunctionDefinition definition) throws CompilerException {
		if ((this.function != null && this.function.name.equals(definition.name)) || this.functionDefinitions.containsKey(definition.name))
			throw new CompilerException("There's already definition or function with the same name declared!");
		this.functionDefinitions.put(definition.name, definition);
	}
	
	/**
	 * Declare's given function to this script.
	 * @param function
	 * Function which should be declared.
	 * @throws CompilerException
	 * If there's already one function declared or there's definition with same name 
	 * as the function declared.
	 */
	public void declareFunction(Function function) throws CompilerException {
		if (this.function != null) {
			throw new CompilerException("Script does already have declared function!");
		}
		else if (this.functionDefinitions.containsKey(function.name)) {
			throw new CompilerException("There's already definition declared with the same name as the function itself!");
		}
		this.function = function;
	}
	
	public String toString() {
	    StringBuilder bld = new StringBuilder();
	    for (FunctionDefinition definition : this.functionDefinitions.values()) {
	    	bld.append(definition.toString() + "\n");
	    }
	    bld.append(this.function.toString());
	    return bld.toString();
	}
	
	
	
	
	
}
