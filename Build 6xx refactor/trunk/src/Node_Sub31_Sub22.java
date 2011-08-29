/* Class59_Sub31_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub22 extends Node_Sub31
{
    private int[] anIntArray5934 = new int[3];
    private int anInt5935;
    private int anInt5936;
    private int anInt5937 = 409;
    private int anInt5938;
    
    final int[][] method870(int argument_0_, byte argument_1_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 109,
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
		int anLocalInt_10_ = -anIntArray5934[0] + anLocalInt_9_;
		if (anLocalInt_10_ < 0)
		    anLocalInt_10_ = -anLocalInt_10_;
		if (anInt5937 < anLocalInt_10_) {
		    anLocalInts_6_[anLocalInt] = anLocalInt_9_;
		    anLocalInts_7_[anLocalInt] = anLocalInts_4_[anLocalInt];
		    anLocalInts_8_[anLocalInt] = anLocalInts_5_[anLocalInt];
		} else {
		    int anLocalInt_11_ = anLocalInts_4_[anLocalInt];
		    anLocalInt_10_ = anLocalInt_11_ - anIntArray5934[1];
		    if (anLocalInt_10_ < 0)
			anLocalInt_10_ = -anLocalInt_10_;
		    if (anLocalInt_10_ > anInt5937) {
			anLocalInts_6_[anLocalInt] = anLocalInt_9_;
			anLocalInts_7_[anLocalInt] = anLocalInt_11_;
			anLocalInts_8_[anLocalInt]
			    = anLocalInts_5_[anLocalInt];
		    } else {
			int anLocalInt_12_ = anLocalInts_5_[anLocalInt];
			anLocalInt_10_ = -anIntArray5934[2] + anLocalInt_12_;
			if (anLocalInt_10_ < 0)
			    anLocalInt_10_ = -anLocalInt_10_;
			if (anInt5937 < anLocalInt_10_) {
			    anLocalInts_6_[anLocalInt] = anLocalInt_9_;
			    anLocalInts_7_[anLocalInt] = anLocalInt_11_;
			    anLocalInts_8_[anLocalInt] = anLocalInt_12_;
			} else {
			    anLocalInts_6_[anLocalInt]
				= anLocalInt_9_ * anInt5936 >> 12;
			    anLocalInts_7_[anLocalInt]
				= anLocalInt_11_ * anInt5938 >> 12;
			    anLocalInts_8_[anLocalInt]
				= anInt5935 * anLocalInt_12_ >> 12;
			}
		    }
		}
	    }
	}
	if (argument_1_ != -9)
	    return null;
	return anLocalInts;
    }
    
    static final int method943(boolean argument, byte argument_13_) {
	if (argument_13_ <= 101)
	    return 85;
	int anLocalInt = Class50.anInt365;
    while_150_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_150_;
		    }
		} else {
		    if (!argument)
			return Statics.anInt3831;
		    return 0;
		}
		return Statics.anInt3831;
	    } while (false);
	    return 0;
	} while (false);
	return 0;
    }
    
    static final int method944(int argument, int argument_14_,
			       byte argument_15_, int argument_16_) {
	if (argument > 243)
	    argument_16_ >>= 4;
	else if (argument > 217)
	    argument_16_ >>= 3;
	else if (argument <= 192) {
	    if (argument > 179)
		argument_16_ >>= 1;
	} else
	    argument_16_ >>= 2;
	return (((argument_14_ & 0xff) >> 2 << 10)
		- (-(argument_16_ >> 5 << 7) - (argument >> 1)));
    }

    static final int method946(int argument, int argument_23_,
			       int argument_24_, byte argument_25_,
			       int argument_26_) {
	int anLocalInt = argument_23_ & 0xf;
	int anLocalInt_27_ = anLocalInt < 8 ? argument_26_ : argument_24_;
	int anLocalInt_28_
	    = (anLocalInt >= 4
	       ? anLocalInt == 12 || anLocalInt == 14 ? argument_26_ : argument
	       : argument_24_);
	return (((anLocalInt & 0x1) != 0 ? -anLocalInt_27_ : anLocalInt_27_)
		+ ((anLocalInt & 0x2) == 0 ? anLocalInt_28_
		   : -anLocalInt_28_));
    }
    
    public Node_Sub31_Sub22() {
	super(1, false);
	anInt5936 = 4096;
	anInt5935 = 4096;
	anInt5938 = 4096;
    }
    
    final void method868(Packet argument_29_, int argument_30_,
			 byte argument_31_) {
	if (argument_31_ > -41)
	    anInt5935 = 2;
	int anLocalInt = argument_30_;
    while_153_:
	do {
	while_152_:
	    do {
	    while_151_:
		do {
		    do {
			if (anLocalInt != 0) {
			    if (anLocalInt != 1) {
				if (anLocalInt != 2) {
				    if (anLocalInt != 3) {
					if (anLocalInt == 4)
					    break while_152_;
					break while_153_;
				    }
				} else
				    break;
				break while_151_;
			    }
			} else {
			    anInt5937 = argument_29_.g2();
			    break while_153_;
			}
			anInt5935 = argument_29_.g2();
			break while_153_;
		    } while (false);
		    anInt5938 = argument_29_.g2();
		    break while_153_;
		} while (false);
		anInt5936 = argument_29_.g2();
		break while_153_;
	    } while (false);
	    int anLocalInt_32_ = argument_29_.g3_dupl();
	    anIntArray5934[2]
		= MathStatics.AND(255, anLocalInt_32_) >> 12;
	    anIntArray5934[1]
		= MathStatics.AND(4080, anLocalInt_32_ >> 4);
	    anIntArray5934[0]
		= MathStatics.AND(anLocalInt_32_, 16711680) << 4;
	} while (false);
    }
}
