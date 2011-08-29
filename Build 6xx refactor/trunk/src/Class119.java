/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class119
{
    static int[][] anIntArrayArray970;
    DoublyLinkedNodeP2_Sub4 aClass104_Sub4_971 = new DoublyLinkedNodeP2_Sub4();
    static Object anObject972;
    private DoublyLinkedNodeP2_Sub4 aClass104_Sub4_973;
    
    final void method2377(byte argument_0_, DoublyLinkedNodeP2_Sub4 argument_1_) {
	if (((DoublyLinkedNodeP2_Sub4) argument_1_).aClass104_Sub4_4527 != null)
	    argument_1_.method1901((byte) 112);
	((DoublyLinkedNodeP2_Sub4) argument_1_).aClass104_Sub4_4527
	    = (((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
	       .aClass104_Sub4_4527);
	((DoublyLinkedNodeP2_Sub4) argument_1_).aClass104_Sub4_4526
	    = ((Class119) this).aClass104_Sub4_971;
	((DoublyLinkedNodeP2_Sub4) ((DoublyLinkedNodeP2_Sub4) argument_1_).aClass104_Sub4_4527)
	    .aClass104_Sub4_4526
	    = argument_1_;
	((DoublyLinkedNodeP2_Sub4) ((DoublyLinkedNodeP2_Sub4) argument_1_).aClass104_Sub4_4526)
	    .aClass104_Sub4_4527
	    = argument_1_;
    }
    
    final int method2378(byte argument_2_) {
	int anLocalInt = 0;
	for (DoublyLinkedNodeP2_Sub4 class104_sub4
		 = (((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
		    .aClass104_Sub4_4526);
	     class104_sub4 != ((Class119) this).aClass104_Sub4_971;
	     class104_sub4
		 = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526)
	    anLocalInt++;
	return anLocalInt;
    }
    
    final DoublyLinkedNodeP2_Sub4 method2379(boolean argument_3_) {
	DoublyLinkedNodeP2_Sub4 class104_sub4 = aClass104_Sub4_973;
	if (((Class119) this).aClass104_Sub4_971 == class104_sub4) {
	    aClass104_Sub4_973 = null;
	    return null;
	}
	aClass104_Sub4_973
	    = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
	return class104_sub4;
    }
    
    final void method2380(int argument_4_) {
	for (;;) {
	    DoublyLinkedNodeP2_Sub4 class104_sub4
		= (((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
		   .aClass104_Sub4_4526);
	    if (class104_sub4 == ((Class119) this).aClass104_Sub4_971)
		break;
	    class104_sub4.method1901((byte) 54);
	}
	aClass104_Sub4_973 = null;
    }
    
    public static void method2381(int argument) {
	anIntArrayArray970 = null;
	anObject972 = null;
    }
    
    final DoublyLinkedNodeP2_Sub4 method2382(int argument_5_) {
	DoublyLinkedNodeP2_Sub4 class104_sub4
	    = (((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
	       .aClass104_Sub4_4526);
	if (class104_sub4 == ((Class119) this).aClass104_Sub4_971) {
	    aClass104_Sub4_973 = null;
	    return null;
	}
	aClass104_Sub4_973
	    = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
	return class104_sub4;
    }
    
    public Class119() {
	((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
	    .aClass104_Sub4_4527
	    = ((Class119) this).aClass104_Sub4_971;
	((DoublyLinkedNodeP2_Sub4) ((Class119) this).aClass104_Sub4_971)
	    .aClass104_Sub4_4526
	    = ((Class119) this).aClass104_Sub4_971;
    }
}
