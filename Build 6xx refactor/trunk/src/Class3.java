/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class3
{
    static final DoublyLinkedNodeP2_Sub10 method216(boolean argument, int argument_0_,
					  int argument_1_) {
	synchronized (Node_Sub31_Sub17.aClass366Array5915) {
	    if (argument_0_ != 0)
		method217(-43, -112, -61, true, false, null, -51);
	    DoublyLinkedNodeP2_Sub10 class104_sub10;
	    if (Node_Sub31_Sub17.aClass366Array5915.length > argument_1_
		&& !Node_Sub31_Sub17.aClass366Array5915[argument_1_]
			.method3987(0)) {
		class104_sub10
		    = (DoublyLinkedNodeP2_Sub10) Node_Sub31_Sub17
					   .aClass366Array5915[argument_1_]
					   .method3993((byte) 118);
		class104_sub10.unlink();
		Class350.anIntArray2924[argument_1_]--;
	    } else {
		class104_sub10 = new DoublyLinkedNodeP2_Sub10();
		((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub9Array4595
		    = new DoublyLinkedNodeP2_Sub9[argument_1_];
		for (int anLocalInt = 0; argument_1_ > anLocalInt;
		     anLocalInt++)
		    ((DoublyLinkedNodeP2_Sub10) class104_sub10)
			.aClass104_Sub9Array4595[anLocalInt]
			= new DoublyLinkedNodeP2_Sub9();
	    }
	    ((DoublyLinkedNodeP2_Sub10) class104_sub10).aBoolean4592 = argument;
	    return class104_sub10;
	}
    }
    
    static final void method217(int argument, int argument_2_, int argument_3_,
				boolean argument_4_, boolean argument_5_,
				Js5Store argument_6_, int argument_7_) {
	Class281.anInt2272 = argument_3_;
	Statics.anInt5035 = 1;
	Class350_Sub1.aJs5Store_5432 = argument_6_;
	Statics.aBoolean4155 = argument_4_;
	DoublyLinkedNode_Sub51_Sub16.anInt6324 = argument_7_;
	Statics.anInt3525 = argument;
	Class316.anInt2617 = argument_2_;
	Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
    }
}
