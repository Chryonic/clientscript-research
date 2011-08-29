/* Class59_Sub41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub41 extends Node
{
    int anInt4200;
    boolean aBoolean4201;
    int anInt4202;
    private int anInt4203;
    private static int[] anIntArray4204;
    private int[] anIntArray4205;
    
    public static void method1075() {
	anIntArray4204 = null;
    }
    
    final int[] method1076() {
	return anIntArray4205;
    }
    
    final void method1077(int argument_0_, int argument_1_) {
	if (argument_0_ != 0 || argument_1_ != 0) {
	    if (anIntArray4204 == null
		|| anIntArray4204.length != anIntArray4205.length)
		anIntArray4204 = new int[anIntArray4205.length];
	    int anLocalInt = anIntArray4205.length;
	    int anLocalInt_2_ = argument_0_;
	    int anLocalInt_3_ = anInt4203 - 1;
	    int anLocalInt_4_ = anInt4203 * argument_1_;
	    int anLocalInt_5_ = anLocalInt - 1;
	    for (int anLocalInt_6_ = 0; anLocalInt_6_ < anLocalInt;
		 anLocalInt_6_ += anInt4203) {
		int anLocalInt_7_
		    = anLocalInt_6_ + anLocalInt_4_ & anLocalInt_5_;
		for (int anLocalInt_8_ = 0; anLocalInt_8_ < anInt4203;
		     anLocalInt_8_++) {
		    int anLocalInt_9_ = anLocalInt_6_ + anLocalInt_8_;
		    int anLocalInt_10_
			= (anLocalInt_7_
			   + (anLocalInt_8_ + anLocalInt_2_ & anLocalInt_3_));
		    anIntArray4204[anLocalInt_9_]
			= anIntArray4205[anLocalInt_10_];
		}
	    }
	    int[] anLocalInts = anIntArray4205;
	    anIntArray4205 = anIntArray4204;
	    anIntArray4204 = anLocalInts;
	}
    }
    
    Node_Sub41(int argument_11_, int argument_12_, int[] argument_13_,
               boolean argument_14_) {
	((Node_Sub41) this).anInt4200 = argument_11_;
	anInt4203 = argument_12_;
	anIntArray4205 = argument_13_;
	if (argument_14_) {
	    int[] anLocalInts = new int[anInt4203];
	    int[] anLocalInts_15_ = new int[anInt4203];
	    int[] anLocalInts_16_ = new int[anInt4203];
	    int[] anLocalInts_17_ = new int[anInt4203];
	    if (anIntArray4204 == null
		|| anIntArray4204.length != anIntArray4205.length)
		anIntArray4204 = new int[anIntArray4205.length];
	    int anLocalInt = anInt4203;
	    int anLocalInt_18_ = anInt4203;
	    int anLocalInt_19_ = anLocalInt - 1;
	    int anLocalInt_20_ = anLocalInt_18_ - 1;
	    int anLocalInt_21_ = anLocalInt * anLocalInt_18_;
	    int anLocalInt_23_;
	    int anLocalInt_22_ = anLocalInt_23_ = anLocalInt;
	    for (int anLocalInt_24_ = 2; anLocalInt_24_ >= 0;
		 anLocalInt_24_--) {
		for (int anLocalInt_25_ = anLocalInt_19_; anLocalInt_25_ >= 0;
		     anLocalInt_25_--) {
		    int anLocalInt_26_ = anIntArray4205[--anLocalInt_23_];
		    anLocalInts[anLocalInt_25_] += anLocalInt_26_ >> 24 & 0xff;
		    anLocalInts_15_[anLocalInt_25_]
			+= anLocalInt_26_ >> 16 & 0xff;
		    anLocalInts_16_[anLocalInt_25_]
			+= anLocalInt_26_ >> 8 & 0xff;
		    anLocalInts_17_[anLocalInt_25_] += anLocalInt_26_ & 0xff;
		}
		if (anLocalInt_23_ == 0)
		    anLocalInt_23_ = anLocalInt_21_;
	    }
	    int anLocalInt_27_ = anLocalInt_21_;
	    for (int anLocalInt_28_ = anLocalInt_20_; anLocalInt_28_ >= 0;
		 anLocalInt_28_--) {
		int anLocalInt_29_ = 1;
		int anLocalInt_30_ = 1;
		int anLocalInt_32_;
		int anLocalInt_33_;
		int anLocalInt_34_;
		int anLocalInt_31_
		    = anLocalInt_32_ = anLocalInt_33_ = anLocalInt_34_ = 0;
		for (int anLocalInt_35_ = 2; anLocalInt_35_ >= 0;
		     anLocalInt_35_--) {
		    anLocalInt_30_--;
		    anLocalInt_31_ += anLocalInts[anLocalInt_30_];
		    anLocalInt_32_ += anLocalInts_15_[anLocalInt_30_];
		    anLocalInt_34_ += anLocalInts_16_[anLocalInt_30_];
		    anLocalInt_33_ += anLocalInts_17_[anLocalInt_30_];
		    if (anLocalInt_30_ == 0)
			anLocalInt_30_ = anLocalInt;
		}
		for (int anLocalInt_36_ = anLocalInt_19_; anLocalInt_36_ >= 0;
		     anLocalInt_36_--) {
		    anLocalInt_30_--;
		    anLocalInt_29_--;
		    int anLocalInt_37_ = anLocalInt_31_ / 9;
		    int anLocalInt_38_ = anLocalInt_32_ / 9;
		    int anLocalInt_39_ = anLocalInt_34_ / 9;
		    int anLocalInt_40_ = anLocalInt_33_ / 9;
		    anIntArray4204[--anLocalInt_27_]
			= (anLocalInt_37_ << 24 | anLocalInt_38_ << 16
			   | anLocalInt_39_ << 8 | anLocalInt_40_);
		    anLocalInt_31_ += (anLocalInts[anLocalInt_30_]
				       - anLocalInts[anLocalInt_29_]);
		    anLocalInt_32_ += (anLocalInts_15_[anLocalInt_30_]
				       - anLocalInts_15_[anLocalInt_29_]);
		    anLocalInt_33_ += (anLocalInts_17_[anLocalInt_30_]
				       - anLocalInts_17_[anLocalInt_29_]);
		    anLocalInt_34_ += (anLocalInts_16_[anLocalInt_30_]
				       - anLocalInts_16_[anLocalInt_29_]);
		    if (anLocalInt_30_ == 0)
			anLocalInt_30_ = anLocalInt;
		    if (anLocalInt_29_ == 0)
			anLocalInt_29_ = anLocalInt;
		}
		for (int anLocalInt_41_ = anLocalInt_19_; anLocalInt_41_ >= 0;
		     anLocalInt_41_--) {
		    int anLocalInt_42_ = anIntArray4205[--anLocalInt_23_];
		    int anLocalInt_43_ = anIntArray4205[--anLocalInt_22_];
		    anLocalInts[anLocalInt_41_]
			+= ((anLocalInt_42_ >> 24 & 0xff)
			    - (anLocalInt_43_ >> 24 & 0xff));
		    anLocalInts_15_[anLocalInt_41_]
			+= ((anLocalInt_42_ >> 16 & 0xff)
			    - (anLocalInt_43_ >> 16 & 0xff));
		    anLocalInts_16_[anLocalInt_41_]
			+= (anLocalInt_42_ >> 8 & 0xff) - (anLocalInt_43_ >> 8
							   & 0xff);
		    anLocalInts_17_[anLocalInt_41_]
			+= (anLocalInt_42_ & 0xff) - (anLocalInt_43_ & 0xff);
		}
		if (anLocalInt_23_ == 0)
		    anLocalInt_23_ = anLocalInt_21_;
		if (anLocalInt_22_ == 0)
		    anLocalInt_22_ = anLocalInt_21_;
	    }
	    int[] anLocalInts_44_ = anIntArray4205;
	    anIntArray4205 = anIntArray4204;
	    anIntArray4204 = anLocalInts_44_;
	}
    }
}
