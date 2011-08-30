package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class Function {

	/**
	 * Contains function name.
	 */
	public String name;
	/**
	 * Contains function type.
	 */
	public CS2Type type;
	/**
	 * Contains function arguments , each arguments contains
	 * it's name and type.
	 */
	public FunctionArgument[] arguments;
	/**
	 * Contains main scope of this function.
	 */
	public ScopeNode firstScope;
	
	
	public Function(String n,CS2Type t,FunctionArgument[] args) {
		this.name = n;
		this.type = t;
		this.arguments = args;
	}
	
	public int numArguments(CS2Type type) {
	    int sum = 0;
	    for (int i = 0; i < arguments.length; i++) {
			if (arguments[i].type.equals(type)) {
			    sum++;
			}
	    }
	    return sum;
	}
	
	public String toString() {
	    StringBuilder bld = new StringBuilder();
	    bld.append(this.type);
	    bld.append(' ');
	    bld.append(this.name);
	    bld.append("(");
	    for (int i = 0; i < this.arguments.length; i++) {
		bld.append(this.arguments[i].toString() + ((i + 1) < this.arguments.length ? "," : ""));
	    }
	    bld.append(") ");
	    bld.append(firstScope.toString());
	    return bld.toString();
	}
}
