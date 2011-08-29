/* Class326 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class326
{
    private static int anInt2680;
    private static int anInt2681;
    private static int anInt2682;
    private static int anInt2683;
    private static int anInt2684;
    private static int anInt2685;
    private static int anInt2686;
    private static int[] anIntArray2687;
    
    static final void method3686(GraphicsToolkit argument, int[] argument_0_,
				 int argument_1_, int[] argument_2_,
				 int[] argument_3_) {
	method3687(argument, argument_0_, 0, argument_0_.length, argument_1_,
		   argument_2_, argument_3_);
    }
    
    private static final void method3687(GraphicsToolkit argument, int[] argument_4_,
					 int argument_5_, int argument_6_,
					 int argument_7_, int[] argument_8_,
					 int[] argument_9_) {
	int[] anLocalInts = new int[4];
	argument.getScissor(anLocalInts);
	if (argument_8_ != null
	    && anLocalInts[3] - anLocalInts[1] != argument_8_.length)
	    throw new IllegalStateException();
	method3692();
	method3694(argument_4_, argument_5_, argument_6_);
	method3693(anLocalInts[1]);
	while (method3690(anLocalInts[3])) {
	    int anLocalInt = anInt2680;
	    int anLocalInt_10_ = anInt2683;
	    int anLocalInt_11_ = anInt2682;
	    if (argument_8_ != null) {
		int anLocalInt_12_ = anLocalInt_11_ - anLocalInts[1];
		if (anLocalInt < argument_8_[anLocalInt_12_] + anLocalInts[0])
		    anLocalInt = argument_8_[anLocalInt_12_] + anLocalInts[0];
		if (anLocalInt_10_
		    > (argument_8_[anLocalInt_12_]
		       + argument_9_[anLocalInt_12_] + anLocalInts[0]))
		    anLocalInt_10_
			= (argument_8_[anLocalInt_12_]
			   + argument_9_[anLocalInt_12_] + anLocalInts[0]);
		if (anLocalInt_10_ - anLocalInt <= 0)
		    continue;
	    }
	    argument.drawHLine(anLocalInt, anLocalInt_11_, anLocalInt_10_ - anLocalInt, argument_7_, 1);
	}
    }
    
    private static final void method3688(int argument, int argument_13_) {
	for (/**/; argument_13_ >= argument + 8; argument_13_ -= 4) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = argument + 4; anLocalInt < argument_13_;
		 anLocalInt += 4) {
		int anLocalInt_14_ = anIntArray2687[anLocalInt - 4];
		int anLocalInt_15_ = anIntArray2687[anLocalInt];
		if (anLocalInt_14_ > anLocalInt_15_) {
		    anLocalBoolean = false;
		    anIntArray2687[anLocalInt - 4] = anLocalInt_15_;
		    anIntArray2687[anLocalInt] = anLocalInt_14_;
		    anLocalInt_14_ = anIntArray2687[anLocalInt - 2];
		    anIntArray2687[anLocalInt - 2]
			= anIntArray2687[anLocalInt + 2];
		    anIntArray2687[anLocalInt + 2] = anLocalInt_14_;
		    anLocalInt_14_ = anIntArray2687[anLocalInt - 1];
		    anIntArray2687[anLocalInt - 1]
			= anIntArray2687[anLocalInt + 3];
		    anIntArray2687[anLocalInt + 3] = anLocalInt_14_;
		}
	    }
	    if (anLocalBoolean)
		break;
	}
    }
    
    static final void method3689(GraphicsToolkit argument, int[] argument_16_,
				 int argument_17_) {
	method3687(argument, argument_16_, 0, argument_16_.length,
		   argument_17_, null, null);
    }
    
    private static final boolean method3690(int argument) {
	int anLocalInt = anInt2685;
	int anLocalInt_18_ = anInt2684;
	int anLocalInt_19_ = anInt2682;
	int anLocalInt_20_;
	for (/**/; anLocalInt_18_ >= anLocalInt;
	     anLocalInt_18_ = anLocalInt_20_) {
	    anInt2682 = ++anLocalInt_19_;
	    if (anLocalInt_19_ >= argument)
		return false;
	    anLocalInt_20_ = anInt2686;
	    for (/**/; anLocalInt < anInt2681; anLocalInt += 4) {
		int anLocalInt_21_ = anIntArray2687[anLocalInt + 1];
		if (anLocalInt_19_ < anLocalInt_21_)
		    break;
		int anLocalInt_22_ = anIntArray2687[anLocalInt];
		int anLocalInt_23_ = anIntArray2687[anLocalInt + 2];
		int anLocalInt_24_ = anIntArray2687[anLocalInt + 3];
		int anLocalInt_25_ = ((anLocalInt_23_ - anLocalInt_22_ << 16)
				      / (anLocalInt_24_ - anLocalInt_21_));
		int anLocalInt_26_ = (anLocalInt_22_ << 16) + 32768;
		anIntArray2687[anLocalInt] = anLocalInt_26_;
		anIntArray2687[anLocalInt + 2] = anLocalInt_25_;
	    }
	    for (int anLocalInt_27_ = anLocalInt_20_;
		 anLocalInt_27_ < anLocalInt; anLocalInt_27_ += 4) {
		int anLocalInt_28_ = anIntArray2687[anLocalInt_27_ + 3];
		if (anLocalInt_19_ >= anLocalInt_28_) {
		    anIntArray2687[anLocalInt_27_]
			= anIntArray2687[anLocalInt_20_];
		    anIntArray2687[anLocalInt_27_ + 1]
			= anIntArray2687[anLocalInt_20_ + 1];
		    anIntArray2687[anLocalInt_27_ + 2]
			= anIntArray2687[anLocalInt_20_ + 2];
		    anIntArray2687[anLocalInt_27_ + 3]
			= anIntArray2687[anLocalInt_20_ + 3];
		    anLocalInt_20_ += 4;
		}
	    }
	    if (anLocalInt_20_ == anInt2681) {
		anInt2681 = 0;
		return false;
	    }
	    method3688(anLocalInt_20_, anLocalInt);
	    anInt2686 = anLocalInt_20_;
	    anInt2685 = anLocalInt;
	}
	anInt2680 = anIntArray2687[anLocalInt_18_] >> 16;
	anInt2683 = anIntArray2687[anLocalInt_18_ + 4] >> 16;
	anIntArray2687[anLocalInt_18_] += anIntArray2687[anLocalInt_18_ + 2];
	anIntArray2687[anLocalInt_18_ + 4]
	    += anIntArray2687[anLocalInt_18_ + 6];
	anLocalInt_18_ += 8;
	anInt2684 = anLocalInt_18_;
	return true;
    }
    
    public static void method3691() {
	anIntArray2687 = null;
    }
    
    private static final void method3692() {
	anInt2681 = 0;
    }
    
    private static final void method3693(int argument) {
	if (anInt2681 < 0) {
	    anInt2686 = anInt2685 = anInt2684 = 0;
	    anInt2682 = 2147483646;
	} else {
	    method3695(0, anInt2681);
	    int anLocalInt = anIntArray2687[1];
	    if (anLocalInt < argument)
		anLocalInt = argument;
	    int anLocalInt_29_ = 0;
	    int anLocalInt_30_;
	    for (anLocalInt_30_ = 0; anLocalInt_30_ < anInt2681;
		 anLocalInt_30_ += 4) {
		int anLocalInt_31_ = anIntArray2687[anLocalInt_30_ + 1];
		if (anLocalInt < anLocalInt_31_)
		    break;
		int anLocalInt_32_ = anIntArray2687[anLocalInt_30_];
		int anLocalInt_33_ = anIntArray2687[anLocalInt_30_ + 2];
		int anLocalInt_34_ = anIntArray2687[anLocalInt_30_ + 3];
		int anLocalInt_35_ = ((anLocalInt_33_ - anLocalInt_32_ << 16)
				      / (anLocalInt_34_ - anLocalInt_31_));
		int anLocalInt_36_ = (anLocalInt_32_ << 16) + 32768;
		anIntArray2687[anLocalInt_30_]
		    = (anLocalInt_36_
		       + (anLocalInt - anLocalInt_31_) * anLocalInt_35_);
		anIntArray2687[anLocalInt_30_ + 2] = anLocalInt_35_;
	    }
	    anInt2686 = anLocalInt_29_;
	    anInt2685 = anLocalInt_30_;
	    anInt2684 = anLocalInt_30_;
	    anInt2682 = anLocalInt - 1;
	}
    }
    
    private static final void method3694(int[] argument, int argument_37_,
					 int argument_38_) {
	int anLocalInt = anInt2681 + (argument_38_ << 1);
	if (anIntArray2687 == null || anIntArray2687.length < anLocalInt) {
	    int[] anLocalInts = new int[anLocalInt];
	    for (int anLocalInt_39_ = 0; anLocalInt_39_ < anInt2681;
		 anLocalInt_39_++)
		anLocalInts[anLocalInt_39_] = anIntArray2687[anLocalInt_39_];
	    anIntArray2687 = anLocalInts;
	}
	argument_38_ += argument_37_;
	int anLocalInt_40_ = argument_38_ - 2;
	for (int anLocalInt_41_ = argument_37_; anLocalInt_41_ < argument_38_;
	     anLocalInt_41_ += 2) {
	    int anLocalInt_42_ = argument[anLocalInt_40_ + 1];
	    int anLocalInt_43_ = argument[anLocalInt_41_ + 1];
	    if (anLocalInt_42_ < anLocalInt_43_) {
		anIntArray2687[anInt2681++] = argument[anLocalInt_40_];
		anIntArray2687[anInt2681++] = anLocalInt_42_;
		anIntArray2687[anInt2681++] = argument[anLocalInt_41_];
		anIntArray2687[anInt2681++] = anLocalInt_43_;
	    } else if (anLocalInt_43_ < anLocalInt_42_) {
		anIntArray2687[anInt2681++] = argument[anLocalInt_41_];
		anIntArray2687[anInt2681++] = anLocalInt_43_;
		anIntArray2687[anInt2681++] = argument[anLocalInt_40_];
		anIntArray2687[anInt2681++] = anLocalInt_42_;
	    }
	    anLocalInt_40_ = anLocalInt_41_;
	}
    }
    
    private static final void method3695(int argument, int argument_44_) {
	if (argument_44_ > argument + 4) {
	    int anLocalInt = argument;
	    int anLocalInt_45_ = anIntArray2687[anLocalInt];
	    int anLocalInt_46_ = anIntArray2687[anLocalInt + 1];
	    int anLocalInt_47_ = anIntArray2687[anLocalInt + 2];
	    int anLocalInt_48_ = anIntArray2687[anLocalInt + 3];
	    for (int anLocalInt_49_ = argument + 4;
		 anLocalInt_49_ < argument_44_; anLocalInt_49_ += 4) {
		int anLocalInt_50_ = anIntArray2687[anLocalInt_49_ + 1];
		if (anLocalInt_50_ < anLocalInt_46_) {
		    anIntArray2687[anLocalInt]
			= anIntArray2687[anLocalInt_49_];
		    anIntArray2687[anLocalInt + 1] = anLocalInt_50_;
		    anIntArray2687[anLocalInt + 2]
			= anIntArray2687[anLocalInt_49_ + 2];
		    anIntArray2687[anLocalInt + 3]
			= anIntArray2687[anLocalInt_49_ + 3];
		    anLocalInt += 4;
		    anIntArray2687[anLocalInt_49_]
			= anIntArray2687[anLocalInt];
		    anIntArray2687[anLocalInt_49_ + 1]
			= anIntArray2687[anLocalInt + 1];
		    anIntArray2687[anLocalInt_49_ + 2]
			= anIntArray2687[anLocalInt + 2];
		    anIntArray2687[anLocalInt_49_ + 3]
			= anIntArray2687[anLocalInt + 3];
		}
	    }
	    anIntArray2687[anLocalInt] = anLocalInt_45_;
	    anIntArray2687[anLocalInt + 1] = anLocalInt_46_;
	    anIntArray2687[anLocalInt + 2] = anLocalInt_47_;
	    anIntArray2687[anLocalInt + 3] = anLocalInt_48_;
	    method3695(argument, anLocalInt);
	    method3695(anLocalInt + 4, argument_44_);
	}
    }
}
