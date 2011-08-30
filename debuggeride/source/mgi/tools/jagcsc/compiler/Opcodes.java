package mgi.tools.jagcsc.compiler;

import java.lang.reflect.Field;

public class Opcodes {

    public static final int PUSH_INT = 0;
    public static final int PUSH_STRING = 3;
    public static final int PUSH_LONG = 54;
    public static final int POP_INT = 38;
    public static final int POP_STRING = 39;
    public static final int POP_LONG = 55;
    public static final int RETURN = 21;
    public static final int LOAD_INT = 33;
    public static final int STORE_INT = 34;
    public static final int LOAD_STRING = 35;
    public static final int STORE_STRING = 36;
    public static final int STORE_LONG = 66;
    public static final int LOAD_LONG = 67;
    public static final int CALL_CS = 40;
    public static final int GOTO = 6;
    public static final int INT_EQ = 8;
    public static final int INT_NE = 7;
    public static final int INT_LT = 9;
    public static final int INT_GT = 10;
    public static final int INT_LE = 31;
    public static final int INT_GE = 32;
    public static final int LONG_EQ = 69;
    public static final int LONG_NE = 68;
    public static final int LONG_LT = 70;
    public static final int LONG_GT = 71;
    public static final int LONG_LE = 72;
    public static final int LONG_GE = 73;
    
    
    
    public static int getOpcode(String name) {
    	try {
		    Field[] flds = Opcodes.class.getFields();
		    for (Field f : flds) {
		    	if (!f.getName().equals(name)) {
		    		continue;
			    }
			    return f.getInt(null);
			}
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return -1;
	}
    
    public static String getOpcodeName(int opcode) {
    	try {
		    Field[] flds = Opcodes.class.getFields();
		    for (Field f : flds) {
		    	if (f.getInt(null) != opcode) {
		    		continue;
			    }
			    return (f.getName());
			}
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return "n/a:" + opcode;
	}
}
