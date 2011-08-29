/* Class59_Sub31_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub3 extends Node_Sub31
{
    private int anInt5848 = 4096;
    static Class207 aClass207_5849 = new Class207(45, 7);
    static CyclicLinkedList aCyclicLinkedList_5850 = new CyclicLinkedList();
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_1_ == 0)
	    anInt5848 = argument_0_.g2();
	if (argument_2_ > -41)
	    method884(-124);
    }
    
    public static void method884(int argument) {
	aClass207_5849 = null;
	aCyclicLinkedList_5850 = null;
    }
    
    final int[] method867(byte argument_3_, int argument_4_) {
	if (argument_3_ <= 21)
	    anInt5848 = 34;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_4_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_5_
		= this.method864(argument_4_ - 1 & Exception_Sub1.anInt49, 0,
				 (byte) 33);
	    int[] anLocalInts_6_ = this.method864(argument_4_, 0, (byte) 33);
	    int[] anLocalInts_7_
		= this.method864(argument_4_ + 1 & Exception_Sub1.anInt49, 0,
				 (byte) 33);
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		int anLocalInt_8_ = anInt5848 * (anLocalInts_7_[anLocalInt]
						 - anLocalInts_5_[anLocalInt]);
		int anLocalInt_9_
		    = (anInt5848
		       * (anLocalInts_6_[Statics.anInt1269 & anLocalInt + 1]
			  - (anLocalInts_6_
			     [anLocalInt - 1 & Statics.anInt1269])));
		int anLocalInt_10_ = anLocalInt_9_ >> 12;
		int anLocalInt_11_ = anLocalInt_8_ >> 12;
		int anLocalInt_12_ = anLocalInt_10_ * anLocalInt_10_ >> 12;
		int anLocalInt_13_ = anLocalInt_11_ * anLocalInt_11_ >> 12;
		int anLocalInt_14_
		    = (int) (Math.sqrt((double) ((float) (anLocalInt_13_
							  + anLocalInt_12_
							  + 4096)
						 / 4096.0F))
			     * 4096.0);
		int anLocalInt_15_
		    = anLocalInt_14_ != 0 ? 16777216 / anLocalInt_14_ : 0;
		anLocalInts[anLocalInt] = -anLocalInt_15_ + 4096;
	    }
	}
	return anLocalInts;
    }
    
    static final void method885(int argument, int argument_16_,
				int argument_17_, int argument_18_,
				int argument_19_) {
	if (DoublyLinkedNodeP2_Sub10.anIntArrayArray4599 != null)
	    DoublyLinkedNodeP2_Sub10.anIntArrayArray4599[argument][argument_16_]
		= argument_17_ | ~0xffffff;
	if (Class62_Sub25.aShortArrayArray4443 != null)
	    Class62_Sub25.aShortArrayArray4443[argument][argument_16_]
		= (short) argument_18_;
	if (Statics.aByteArrayArray297 != null)
	    Statics.aByteArrayArray297[argument][argument_16_]
		= (byte) argument_19_;
    }
    
    public Node_Sub31_Sub3() {
	super(1, true);
    }
}
