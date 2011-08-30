package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class FunctionArgument {

	public String name;
	public CS2Type type;
	public boolean isConst;
	
	public FunctionArgument(String name,CS2Type type,boolean isConst) {
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
	    return (this.isConst ? "const " : "") + this.type + " " + this.name;
	}
}
