package mgi.tools.jagcsc.analyzer;

public class CS2Type {

	/**
	 * Contains void type.
	 * This should be declared only in method return types.
	 */
	public static CS2Type void_type = new CS2Type("void",-1);
	/**
	 * Contains int type.
	 */
	public static CS2Type int_type = new CS2Type("int",0);
	/**
	 * Contans boolean type.
	 */
	public static CS2Type boolean_type = new CS2Type("boolean",0);
	/**
	 * Contains character type.
	 */
	public static CS2Type char_type = new CS2Type("char",0);
	/**
	 * Contains string type.
	 */
	public static CS2Type string_type = new CS2Type("string",1);
	/**
	 * Contains long type.
	 */
	public static CS2Type long_type = new CS2Type("long",2);
	/**
	 * Contains all types.
	 */
	private static CS2Type[] types = new CS2Type[] { void_type, int_type, boolean_type, char_type, string_type, long_type };
	
	/**
	 * Contains runtime stack type of this type.
	 * -1 - not suitable for stack.
	 * 0 - int stack
	 * 1 - string stack
	 * 2 - long stack
	 */
	public int runtimeStackType;
	/**
	 * Contains type name of this type.
	 */
	public String typeName;
	/**
	 * Contains hash of this type.
	 */
	private int hash;
	
	public CS2Type(String typeName,int stackType) {
		this.typeName = typeName;
		this.runtimeStackType = stackType;
		this.addNameToHash();
		
	}
	
	/**
	 * Get's type from the name of type.
	 * @param typeName
	 * Name of the type to get.
	 * @return
	 * Return's type or null if it's not found.
	 */
	public static CS2Type getType(String typeName) {
		for (int i = 0; i < types.length; i++) {
			if (types[i].typeName.equals(typeName)) {
				return types[i];
			}
		}
		return null;
	}
	
	@Override
	public int hashCode() {
		return this.getHash();
	}
	
	private void addNameToHash() {
		for (int i = 0; i < this.typeName.length(); i++)
			this.hash = ((byte)this.typeName.charAt(i)) + ((this.hash << 5) - this.hash);
	}
	
	@Override
	public boolean equals(Object other) {
		if (other != null && other instanceof CS2Type) {
			return ((CS2Type)other).typeName.equals(this.typeName);
		}
		return false;
	}
	
	/**
	 * Get's if two types matches.
	 * Return's true if types are SAME or one type is char or int and 
	 * other type is char or int too.
	 * @param other
	 * Other type to check matching with.
	 * @return
	 * Return's true if types match.
	 */
	public boolean matches(CS2Type other) {
		if (this == other)
			return true;
		if ((this == CS2Type.int_type) && (other == CS2Type.char_type))
			return true;
		return false;
	}
	
	/**
	 * Get's if this type is comparable to 'other' type.
	 * @param other
	 * Type to check comparing with.
	 * @return
	 * If types are comparable.
	 */
	public boolean comparable(CS2Type other,int conditional) {
		if (this == CS2Type.string_type || other == CS2Type.string_type)
			return false;
		if (this == CS2Type.void_type || other == CS2Type.void_type)
			return false;
		if (this.runtimeStackType != other.runtimeStackType)
			return false;
		if (conditional > 6 && (this == CS2Type.boolean_type || other == CS2Type.boolean_type))
			return false;
		return true;
		
	}

	public int getHash() {
		return hash;
	}
	
	@Override
	public String toString() {
		return this.typeName;
	}
}
