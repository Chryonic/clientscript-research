/* Class233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class233
{
    static int anInt1696 = 0;
    private byte[] aByteArray1697;
    private int[] anIntArray1698;
    private int[] anIntArray1699;
    
    final int method3096(int argument_0_, int argument_1_, int argument_2_,
			 int argument_3_, byte[] argument_4_,
			 byte[] argument_5_) {
	if (argument_0_ == 0)
	    return 0;
	int anLocalInt = 0;
	argument_0_ += argument_2_;
	int anLocalInt_6_ = argument_3_;
	for (;;) {
	    byte anLocalInt_7_ = argument_5_[anLocalInt_6_];
	    if (anLocalInt_7_ < 0)
		anLocalInt = anIntArray1698[anLocalInt];
	    else
		anLocalInt++;
	    int anLocalInt_8_;
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x40) == 0)
		anLocalInt++;
	    else
		anLocalInt = anIntArray1698[anLocalInt];
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x20) == 0)
		anLocalInt++;
	    else
		anLocalInt = anIntArray1698[anLocalInt];
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x10) != 0)
		anLocalInt = anIntArray1698[anLocalInt];
	    else
		anLocalInt++;
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x8) == 0)
		anLocalInt++;
	    else
		anLocalInt = anIntArray1698[anLocalInt];
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_2_ >= argument_0_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x4) == 0)
		anLocalInt++;
	    else
		anLocalInt = anIntArray1698[anLocalInt];
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x2) != 0)
		anLocalInt = anIntArray1698[anLocalInt];
	    else
		anLocalInt++;
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    if ((anLocalInt_7_ & 0x1) != 0)
		anLocalInt = anIntArray1698[anLocalInt];
	    else
		anLocalInt++;
	    if ((anLocalInt_8_ = anIntArray1698[anLocalInt]) < 0) {
		argument_4_[argument_2_++]
		    = (byte) (anLocalInt_8_ ^ 0xffffffff);
		if (argument_0_ <= argument_2_)
		    break;
		anLocalInt = 0;
	    }
	    anLocalInt_6_++;
	}
	return -argument_3_ + (anLocalInt_6_ + 1);
    }
    
    static final void method3097(int argument, int argument_9_,
				 boolean argument_10_, boolean argument_11_,
				 int argument_12_) {
	Class31.method365(0, argument_12_, argument_11_,
			  Class384.aClass84_Sub1Array3251.length - 1,
			  argument_9_, 14, argument_10_);
	Node_Sub47_Sub6.anInt6184 = 0;
	Class360.aClass59_Sub1_3049 = null;
    }
    
    static final boolean method3098(int argument, int argument_13_,
				    int argument_14_) {
	return false;
    }
    
    final int method3099(int argument_15_, byte[] argument_16_,
			 byte[] argument_17_, int argument_18_,
			 int argument_19_, int argument_20_) {
	int anLocalInt = argument_15_;
	int anLocalInt_21_ = argument_20_ << 3;
	for (argument_18_ += argument_19_; argument_18_ > argument_19_;
	     argument_19_++) {
	    int anLocalInt_22_ = argument_17_[argument_19_] & 0xff;
	    int anLocalInt_23_ = anIntArray1699[anLocalInt_22_];
	    int anLocalInt_24_ = aByteArray1697[anLocalInt_22_];
	    if (anLocalInt_24_ == 0)
		throw new RuntimeException("No codeword for data value "
					   + anLocalInt_22_);
	    int anLocalInt_25_ = anLocalInt_21_ >> 3;
	    int anLocalInt_26_ = anLocalInt_21_ & 0x7;
	    anLocalInt &= -anLocalInt_26_ >> 31;
	    int anLocalInt_27_
		= (anLocalInt_26_ + anLocalInt_24_ - 1 >> 3) + anLocalInt_25_;
	    anLocalInt_26_ += 24;
	    argument_16_[anLocalInt_25_]
		= (byte) (anLocalInt
			  = MathStatics.OR(anLocalInt, (anLocalInt_23_ >>> anLocalInt_26_)));
	    if (anLocalInt_25_ < anLocalInt_27_) {
		anLocalInt_26_ -= 8;
		anLocalInt_25_++;
		argument_16_[anLocalInt_25_]
		    = (byte) (anLocalInt = anLocalInt_23_ >>> anLocalInt_26_);
		if (anLocalInt_27_ > anLocalInt_25_) {
		    anLocalInt_25_++;
		    anLocalInt_26_ -= 8;
		    argument_16_[anLocalInt_25_]
			= (byte) (anLocalInt
				  = anLocalInt_23_ >>> anLocalInt_26_);
		    if (anLocalInt_27_ > anLocalInt_25_) {
			anLocalInt_25_++;
			anLocalInt_26_ -= 8;
			argument_16_[anLocalInt_25_]
			    = (byte) (anLocalInt
				      = anLocalInt_23_ >>> anLocalInt_26_);
			if (anLocalInt_25_ < anLocalInt_27_) {
			    anLocalInt_25_++;
			    anLocalInt_26_ -= 8;
			    argument_16_[anLocalInt_25_]
				= (byte) (anLocalInt
					  = anLocalInt_23_ << -anLocalInt_26_);
			}
		    }
		}
	    }
	    anLocalInt_21_ += anLocalInt_24_;
	}
	return (anLocalInt_21_ + 7 >> 3) - argument_20_;
    }
    
    Class233(byte[] argument_28_) {
	int anLocalInt = argument_28_.length;
	anIntArray1699 = new int[anLocalInt];
	aByteArray1697 = argument_28_;
	anIntArray1698 = new int[8];
	int[] anLocalInts = new int[33];
	int anLocalInt_29_ = 0;
	for (int anLocalInt_30_ = 0; anLocalInt_30_ < anLocalInt;
	     anLocalInt_30_++) {
	    int anLocalInt_31_ = argument_28_[anLocalInt_30_];
	    if (anLocalInt_31_ != 0) {
		int anLocalInt_32_ = 1 << -anLocalInt_31_ + 32;
		int anLocalInt_33_ = anLocalInts[anLocalInt_31_];
		anIntArray1699[anLocalInt_30_] = anLocalInt_33_;
		int anLocalInt_34_;
		if ((anLocalInt_33_ & anLocalInt_32_) == 0) {
		    for (int anLocalInt_35_ = anLocalInt_31_ - 1;
			 anLocalInt_35_ >= 1; anLocalInt_35_--) {
			int anLocalInt_36_ = anLocalInts[anLocalInt_35_];
			if (anLocalInt_33_ != anLocalInt_36_)
			    break;
			int anLocalInt_37_ = 1 << -anLocalInt_35_ + 32;
			if ((anLocalInt_36_ & anLocalInt_37_) != 0) {
			    anLocalInts[anLocalInt_35_]
				= anLocalInts[anLocalInt_35_ - 1];
			    break;
			}
			anLocalInts[anLocalInt_35_]
			    = MathStatics.OR(anLocalInt_37_, anLocalInt_36_);
		    }
		    anLocalInt_34_ = anLocalInt_32_ | anLocalInt_33_;
		} else
		    anLocalInt_34_ = anLocalInts[anLocalInt_31_ - 1];
		anLocalInts[anLocalInt_31_] = anLocalInt_34_;
		for (int anLocalInt_38_ = anLocalInt_31_ + 1;
		     anLocalInt_38_ <= 32; anLocalInt_38_++) {
		    if (anLocalInt_33_ == anLocalInts[anLocalInt_38_])
			anLocalInts[anLocalInt_38_] = anLocalInt_34_;
		}
		int anLocalInt_39_ = 0;
		for (int anLocalInt_40_ = 0; anLocalInt_40_ < anLocalInt_31_;
		     anLocalInt_40_++) {
		    int anLocalInt_41_ = -2147483648 >>> anLocalInt_40_;
		    if ((anLocalInt_41_ & anLocalInt_33_) == 0)
			anLocalInt_39_++;
		    else {
			if (anIntArray1698[anLocalInt_39_] == 0)
			    anIntArray1698[anLocalInt_39_] = anLocalInt_29_;
			anLocalInt_39_ = anIntArray1698[anLocalInt_39_];
		    }
		    if (anIntArray1698.length <= anLocalInt_39_) {
			int[] anLocalInts_42_
			    = new int[anIntArray1698.length * 2];
			for (int anLocalInt_43_ = 0;
			     anLocalInt_43_ < anIntArray1698.length;
			     anLocalInt_43_++)
			    anLocalInts_42_[anLocalInt_43_]
				= anIntArray1698[anLocalInt_43_];
			anIntArray1698 = anLocalInts_42_;
		    }
		    anLocalInt_41_ >>>= 1;
		}
		anIntArray1698[anLocalInt_39_] = anLocalInt_30_ ^ 0xffffffff;
		if (anLocalInt_29_ <= anLocalInt_39_)
		    anLocalInt_29_ = anLocalInt_39_ + 1;
	    }
	}
    }
}
