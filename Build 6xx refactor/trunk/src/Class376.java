/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class376
{
    static CyclicLinkedList aCyclicLinkedList_3214 = new CyclicLinkedList();
    
    public static void method4088(int argument) {
	aCyclicLinkedList_3214 = null;
    }
    
    static final void method4089(int argument, byte argument_0_) {
	Class251.aClass149_1974.method2534(argument, (byte) -8);
    }
    
    static final void method4090(int argument, boolean argument_1_,
				 int argument_2_, int argument_3_,
				 int argument_4_) {
	if (argument < argument_4_) {
	    for (int anLocalInt = argument; argument_4_ > anLocalInt;
		 anLocalInt++)
		Class223.anIntArrayArray1562[anLocalInt][argument_3_]
		    = argument_2_;
	} else {
	    for (int anLocalInt = argument_4_; argument > anLocalInt;
		 anLocalInt++)
		Class223.anIntArrayArray1562[anLocalInt][argument_3_]
		    = argument_2_;
	}
    }
    
    static final void method4091(int argument, int argument_5_,
				 int argument_6_, RsInterface argument_7_) {
	DoublyLinkedNode_Sub51_Sub6.anInt6245 = argument;
	Node_Sub45.aRsInterface_4277 = argument_7_;
	Class373.anInt3204 = argument_5_;
    }
}
