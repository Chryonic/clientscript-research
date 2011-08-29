/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100
{
    static Class166 aClass166_780 = new Class166(28, 8);
    static int anInt781;
    static int anInt782 = -2;
    
    static final void method1730(int argument, int argument_0_,
				 int argument_1_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 != null) {
	    Class191
		.method2886(((Class148) class148).aClass104_Sub2_Sub3_1124);
	    Class191
		.method2886(((Class148) class148).aClass104_Sub2_Sub3_1123);
	    if (((Class148) class148).aClass104_Sub2_Sub3_1124 != null)
		((Class148) class148).aClass104_Sub2_Sub3_1124 = null;
	    if (((Class148) class148).aClass104_Sub2_Sub3_1123 != null)
		((Class148) class148).aClass104_Sub2_Sub3_1123 = null;
	}
    }
    
    public static void method1731(byte argument) {
	aClass166_780 = null;
    }
    
    static final void method1732(int argument, int argument_2_,
				 int argument_3_,
				 DoublyLinkedNodeP2_Sub2_Sub4 argument_4_) {
	Class148 class148
	    = Node_Sub9_Sub5.method675(argument, argument_2_, argument_3_);
	if (class148 != null) {
	    ((Class148) class148).aClass104_Sub2_Sub4_1134 = argument_4_;
	    int anLocalInt = ((Node_Sub31_Sub5.aClass_sArray5858
			       == Class65.aClass_sArray455)
			      ? 1 : 0);
	    if (argument_4_.method1766(-116)) {
		if (argument_4_.method1772(0)) {
		    ((DoublyLinkedNodeP2_Sub2) argument_4_).aClass104_Sub2_4515
			= InputStream_Sub2.aClass104_Sub2Array36[anLocalInt];
		    InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			= argument_4_;
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_4_).aClass104_Sub2_4515
			= (Node_Sub31_Sub33.aClass104_Sub2Array6004
			   [anLocalInt]);
		    Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			= argument_4_;
		    Class18.aBoolean124 = true;
		}
	    } else {
		((DoublyLinkedNodeP2_Sub2) argument_4_).aClass104_Sub2_4515
		    = Statics.aClass104_Sub2Array851[anLocalInt];
		Statics.aClass104_Sub2Array851[anLocalInt] = argument_4_;
	    }
	}
    }
}
