/* Class59_Sub31_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub33 extends Node_Sub31
{
    static int anInt6003 = -1;
    static DoublyLinkedNodeP2_Sub2[] aClass104_Sub2Array6004;
    
    public static void method980(boolean argument) {
	aClass104_Sub2Array6004 = null;
    }
    
    public Node_Sub31_Sub33() {
	super(1, false);
    }
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_1_ == 0)
	    ((Node_Sub31) this).aBoolean4138
		= argument_0_.g1() == 1;
	if (argument_2_ > -41)
	    method870(-71, (byte) 42);
    }
    
    final int[] method867(byte argument_3_, int argument_4_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_4_,
							      -13476);
	if (argument_3_ <= 21)
	    return null;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_5_ = this.method864(argument_4_, 0, (byte) 33);
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++)
		anLocalInts[anLocalInt] = -anLocalInts_5_[anLocalInt] + 4096;
	}
	return anLocalInts;
    }
    
    final int[][] method870(int argument_6_, byte argument_7_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 82,
							       argument_6_);
	if (argument_7_ != -9)
	    aClass104_Sub2Array6004 = null;
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_8_ = this.method869(0, 1, argument_6_);
	    int[] anLocalInts_9_ = anLocalInts_8_[0];
	    int[] anLocalInts_10_ = anLocalInts_8_[1];
	    int[] anLocalInts_11_ = anLocalInts_8_[2];
	    int[] anLocalInts_12_ = anLocalInts[0];
	    int[] anLocalInts_13_ = anLocalInts[1];
	    int[] anLocalInts_14_ = anLocalInts[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		anLocalInts_12_[anLocalInt]
		    = -anLocalInts_9_[anLocalInt] + 4096;
		anLocalInts_13_[anLocalInt]
		    = -anLocalInts_10_[anLocalInt] + 4096;
		anLocalInts_14_[anLocalInt]
		    = -anLocalInts_11_[anLocalInt] + 4096;
	    }
	}
	return anLocalInts;
    }
}
