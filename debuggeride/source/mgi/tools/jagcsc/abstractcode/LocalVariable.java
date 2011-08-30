package mgi.tools.jagcsc.abstractcode;

import mgi.tools.jagcsc.analyzer.CS2Type;

public class LocalVariable {

	public String name;
	public CS2Type type;
	
	public LocalVariable(String name,CS2Type type) {
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
	    return this.type + " " + this.name;
	}
}
