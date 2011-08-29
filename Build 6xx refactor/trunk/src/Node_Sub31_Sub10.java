/* Class59_Sub31_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub10 extends Node_Sub31
{
    private int anInt5878 = 4096;
    static Class166 aClass166_5879 = new Class166(54, -1);
    static boolean aBoolean5880;
    private int anInt5881 = 4096;
    static boolean aBoolean5882 = false;
    private int anInt5883 = 4096;
    
    public static void method902(boolean argument) {
	aClass166_5879 = null;
    }
    
    final int[][] method870(int argument_0_, byte argument_1_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 82,
							       argument_0_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_2_ = this.method869(0, 1, argument_0_);
	    int[] anLocalInts_3_ = anLocalInts_2_[0];
	    int[] anLocalInts_4_ = anLocalInts_2_[1];
	    int[] anLocalInts_5_ = anLocalInts_2_[2];
	    int[] anLocalInts_6_ = anLocalInts[0];
	    int[] anLocalInts_7_ = anLocalInts[1];
	    int[] anLocalInts_8_ = anLocalInts[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_9_ = anLocalInts_3_[anLocalInt];
		int anLocalInt_10_ = anLocalInts_5_[anLocalInt];
		int anLocalInt_11_ = anLocalInts_4_[anLocalInt];
		if (anLocalInt_9_ != anLocalInt_10_
		    || anLocalInt_11_ != anLocalInt_10_) {
		    anLocalInts_6_[anLocalInt] = anInt5881;
		    anLocalInts_7_[anLocalInt] = anInt5878;
		    anLocalInts_8_[anLocalInt] = anInt5883;
		} else {
		    anLocalInts_6_[anLocalInt]
			= anLocalInt_9_ * anInt5881 >> 12;
		    anLocalInts_7_[anLocalInt]
			= anLocalInt_10_ * anInt5878 >> 12;
		    anLocalInts_8_[anLocalInt]
			= anLocalInt_11_ * anInt5883 >> 12;
		}
	    }
	}
	if (argument_1_ != -9)
	    method902(false);
	return anLocalInts;
    }
    
    final void method868(Packet argument_12_, int argument_13_,
			 byte argument_14_) {
	if (argument_14_ > -41)
	    method868(null, 49, (byte) -49);
	int anLocalInt = argument_13_;
    while_132_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_132_;
		    }
		} else {
		    anInt5881 = argument_12_.g2();
		    break while_132_;
		}
		anInt5878 = argument_12_.g2();
		break while_132_;
	    } while (false);
	    anInt5883 = argument_12_.g2();
	} while (false);
    }
    
    public Node_Sub31_Sub10() {
	super(1, false);
    }
    
    static {
	aBoolean5880 = false;
    }
}
