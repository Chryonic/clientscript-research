/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class147
{
    int anInt1114;
    int anInt1115;
    static Js5Store aJs5Store_1116;
    static CyclicLinkedList aCyclicLinkedList_1117 = new CyclicLinkedList();
    int anInt1118;
    int anInt1119;
    static long aLong1120;
    
    public static void method2523(int argument) {
	aCyclicLinkedList_1117 = null;
	aJs5Store_1116 = null;
    }
    
    static final Node_Sub9_Sub2 method2524(Node_Sub9_Sub2 argument,
					      int argument_0_) {
	Node_Sub9_Sub2 class59_sub9_sub2
	    = (argument == null ? new Node_Sub9_Sub2()
	       : new Node_Sub9_Sub2(argument));
	class59_sub9_sub2.method601(128, (byte) -90, 9);
	return class59_sub9_sub2;
    }
    
    static final boolean method2525(int argument, int argument_1_,
				    byte argument_2_) {
	if (argument_1_ >= 1000 && argument < 1000)
	    return true;
	if (argument_1_ < 1000 && argument < 1000) {
	    if (Class150.method2545(2, argument))
		return true;
	    if (Class150.method2545(2, argument_1_))
		return false;
	    return true;
	}
	if (argument_1_ >= 1000 && argument >= 1000)
	    return true;
	return false;
    }
    
    final Class147 method2526(int argument_3_, boolean argument_4_) {
	return new Class147(((Class147) this).anInt1118, argument_3_,
			    ((Class147) this).anInt1119,
			    ((Class147) this).anInt1114);
    }
    
    Class147(int argument_5_, int argument_6_, int argument_7_,
	     int argument_8_) {
	((Class147) this).anInt1118 = argument_5_;
	((Class147) this).anInt1114 = argument_8_;
	((Class147) this).anInt1119 = argument_7_;
	((Class147) this).anInt1115 = argument_6_;
    }
}
