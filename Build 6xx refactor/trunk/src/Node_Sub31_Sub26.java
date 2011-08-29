/* Class59_Sub31_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub26 extends Node_Sub31
{
    private int anInt5954 = 0;
    static int[] anIntArray5955
	= { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
    private int anInt5956 = 4096;
    
    public Node_Sub31_Sub26() {
	super(1, false);
    }
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_2_ > -41)
	    method867((byte) 100, -33);
	int anLocalInt = argument_1_;
    while_155_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_155_;
		    }
		} else {
		    anInt5954 = argument_0_.g2();
		    return;
		}
		anInt5956 = argument_0_.g2();
		return;
	    } while (false);
	    ((Node_Sub31) this).aBoolean4138
		= argument_0_.g1() == 1;
	    break;
	} while (false);
    }
    
    final int[][] method870(int argument_3_, byte argument_4_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 84,
							       argument_3_);
	if (argument_4_ != -9)
	    anIntArray5955 = null;
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_5_ = this.method869(0, 1, argument_3_);
	    int[] anLocalInts_6_ = anLocalInts_5_[0];
	    int[] anLocalInts_7_ = anLocalInts_5_[1];
	    int[] anLocalInts_8_ = anLocalInts_5_[2];
	    int[] anLocalInts_9_ = anLocalInts[0];
	    int[] anLocalInts_10_ = anLocalInts[1];
	    int[] anLocalInts_11_ = anLocalInts[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_12_ = anLocalInts_6_[anLocalInt];
		int anLocalInt_13_ = anLocalInts_7_[anLocalInt];
		int anLocalInt_14_ = anLocalInts_8_[anLocalInt];
		if (anLocalInt_12_ >= anInt5954) {
		    if (anLocalInt_12_ <= anInt5956)
			anLocalInts_9_[anLocalInt] = anLocalInt_12_;
		    else
			anLocalInts_9_[anLocalInt] = anInt5956;
		} else
		    anLocalInts_9_[anLocalInt] = anInt5954;
		if (anLocalInt_13_ >= anInt5954) {
		    if (anInt5956 < anLocalInt_13_)
			anLocalInts_10_[anLocalInt] = anInt5956;
		    else
			anLocalInts_10_[anLocalInt] = anLocalInt_13_;
		} else
		    anLocalInts_10_[anLocalInt] = anInt5954;
		if (anInt5954 > anLocalInt_14_)
		    anLocalInts_11_[anLocalInt] = anInt5954;
		else if (anInt5956 < anLocalInt_14_)
		    anLocalInts_11_[anLocalInt] = anInt5956;
		else
		    anLocalInts_11_[anLocalInt] = anLocalInt_14_;
	    }
	}
	return anLocalInts;
    }
    
    final int[] method867(byte argument_15_, int argument_16_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_16_,
							      -13476);
	if (argument_15_ <= 21)
	    anInt5954 = -87;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_17_ = this.method864(argument_16_, 0, (byte) 33);
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_18_ = anLocalInts_17_[anLocalInt];
		if (anInt5954 <= anLocalInt_18_) {
		    if (anLocalInt_18_ > anInt5956)
			anLocalInts[anLocalInt] = anInt5956;
		    else
			anLocalInts[anLocalInt] = anLocalInt_18_;
		} else
		    anLocalInts[anLocalInt] = anInt5954;
	    }
	}
	return anLocalInts;
    }
    
    public static void method958(int argument) {
	anIntArray5955 = null;
    }
    
    static final boolean method959(int argument, byte argument_19_,
				   int argument_20_) {
	if ((argument_20_ & 0x21) == 0)
	    return false;
	return true;
    }
}
