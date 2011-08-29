/* Class59_Sub31_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub19 extends Node_Sub31
{
    static Class217 aClass217_5923 = new Class217(7, 0, 1, 1);
    private int anInt5924 = 2048;
    private int anInt5925 = 3072;
    private int anInt5926 = 1024;
    static int anInt5927 = 0;
    static int anInt5928;
    
    public static void method935(int argument) {
	aClass217_5923 = null;
    }
    
    public Node_Sub31_Sub19() {
	super(1, false);
    }
    
    final void method865(boolean argument_0_) {
	anInt5924 = anInt5925 - anInt5926;
	if (argument_0_ != true)
	    method868(null, -112, (byte) -64);
    }
    
    static long method936(long argument, long argument_1_) {
	return argument | argument_1_;
    }
    
    final int[][] method870(int argument_2_, byte argument_3_) {
	if (argument_3_ != -9)
	    return null;
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 117,
							       argument_2_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[][] anLocalInts_4_
		= this.method869(0, argument_3_ ^ ~0x9, argument_2_);
	    int[] anLocalInts_5_ = anLocalInts_4_[0];
	    int[] anLocalInts_6_ = anLocalInts_4_[1];
	    int[] anLocalInts_7_ = anLocalInts_4_[2];
	    int[] anLocalInts_8_ = anLocalInts[0];
	    int[] anLocalInts_9_ = anLocalInts[1];
	    int[] anLocalInts_10_ = anLocalInts[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		anLocalInts_8_[anLocalInt]
		    = anInt5926 + (anLocalInts_5_[anLocalInt] * anInt5924
				   >> 12);
		anLocalInts_9_[anLocalInt]
		    = ((anInt5924 * anLocalInts_6_[anLocalInt] >> 12)
		       + anInt5926);
		anLocalInts_10_[anLocalInt]
		    = anInt5926 + (anInt5924 * anLocalInts_7_[anLocalInt]
				   >> 12);
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_11_, int argument_12_,
			 byte argument_13_) {
	if (argument_13_ < -41) {
	    int anLocalInt = argument_12_;
	while_145_:
	    do {
		do {
		    if (anLocalInt != 0) {
			if (anLocalInt != 1) {
			    if (anLocalInt == 2)
				break;
			    break while_145_;
			}
		    } else {
			anInt5926 = argument_11_.g2();
			return;
		    }
		    anInt5925 = argument_11_.g2();
		    return;
		} while (false);
		((Node_Sub31) this).aBoolean4138
		    = argument_11_.g1() == 1;
		break;
	    } while (false);
	}
    }
    
    final int[] method867(byte argument_14_, int argument_15_) {
	if (argument_14_ < 21)
	    return null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_15_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_16_ = this.method864(argument_15_, 0, (byte) 33);
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++)
		anLocalInts[anLocalInt]
		    = anInt5926 + (anLocalInts_16_[anLocalInt] * anInt5924
				   >> 12);
	}
	return anLocalInts;
    }
}
