/* Class245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class245
{
    static double aDouble1780;
    private short[] aShortArray1781;
    int anInt1782 = 4;
    private int anInt1783 = 4;
    static int anInt1784 = 0;
    static Class166 aClass166_1785 = new Class166(13, -2);
    private short[] aShortArray1786;
    static Class112 aClass112_1787;
    private int anInt1788 = 0;
    private int anInt1789 = 4;
    private int anInt1790;
    static Class48[] aClass48Array1791;
    
    static final long method3167(String argument, int argument_0_) {
	int anLocalInt = argument.length();
	long l = 0L;
	for (int anLocalInt_1_ = 0; anLocalInt_1_ < anLocalInt;
	     anLocalInt_1_++)
	    l = (long) argument.charAt(anLocalInt_1_) + (-l + (l << 5));
	return l;
    }
    
    private final void method3168(int argument_2_) {
	Random random = new Random((long) anInt1788);
	if (argument_2_ != 25585)
	    aDouble1780 = -0.4693745956794794;
	for (int anLocalInt = 0; anLocalInt < 255; anLocalInt++)
	    aShortArray1786[anLocalInt] = (short) anLocalInt;
	for (int anLocalInt = 0; anLocalInt < 255; anLocalInt++) {
	    int anLocalInt_3_ = -anLocalInt + 255;
	    int anLocalInt_4_ = Class207.method2945(random, 5, anLocalInt_3_);
	    short anLocalInt_5_ = aShortArray1786[anLocalInt_4_];
	    aShortArray1786[anLocalInt_4_] = aShortArray1786[anLocalInt_3_];
	    aShortArray1786[anLocalInt_3_]
		= aShortArray1786[anLocalInt_3_ + 256] = anLocalInt_5_;
	}
    }
    
    abstract void method3169(int argument_6_);
    
    public static void method3170(int argument) {
	aClass48Array1791 = null;
	aClass166_1785 = null;
	aClass112_1787 = null;
    }
    
    abstract void method3171(int argument_7_, int argument_8_,
			     int argument_9_);
    
    private final void method3172(byte argument_10_) {
	aShortArray1781 = new short[((Class245) this).anInt1782];
	for (int anLocalInt = 0; anLocalInt < ((Class245) this).anInt1782;
	     anLocalInt++)
	    aShortArray1781[anLocalInt]
		= (short) (int) Math.pow(2.0, (double) anLocalInt);
	if (argument_10_ != 10)
	    ((Class245) this).anInt1782 = 20;
    }
    
    abstract void method3173(int argument_11_);
    
    final void method3174(byte argument_12_, int argument_13_,
			  int argument_14_, int argument_15_) {
	int[] anLocalInts = new int[argument_15_];
	int[] anLocalInts_16_ = new int[argument_14_];
	for (int anLocalInt = 0; anLocalInt < argument_15_; anLocalInt++)
	    anLocalInts[anLocalInt] = (anLocalInt << 12) / argument_15_;
	int[] anLocalInts_17_ = new int[argument_13_];
	for (int anLocalInt = 0; anLocalInt < argument_14_; anLocalInt++)
	    anLocalInts_16_[anLocalInt] = (anLocalInt << 12) / argument_14_;
	for (int anLocalInt = 0; anLocalInt < argument_13_; anLocalInt++)
	    anLocalInts_17_[anLocalInt] = (anLocalInt << 12) / argument_13_;
	method3173(29373);
	for (int anLocalInt = 0; anLocalInt < argument_13_; anLocalInt++) {
	    for (int anLocalInt_18_ = 0; anLocalInt_18_ < argument_14_;
		 anLocalInt_18_++) {
		for (int anLocalInt_19_ = 0; anLocalInt_19_ < argument_15_;
		     anLocalInt_19_++) {
		    for (int anLocalInt_20_ = 0;
			 anLocalInt_20_ < ((Class245) this).anInt1782;
			 anLocalInt_20_++) {
			int anLocalInt_21_
			    = aShortArray1781[anLocalInt_20_] << 12;
			int anLocalInt_22_ = anLocalInt_21_ * anInt1783 >> 12;
			int anLocalInt_23_
			    = (anLocalInts[anLocalInt_19_] * anLocalInt_21_
			       >> 12);
			int anLocalInt_24_ = anLocalInt_21_ * anInt1789 >> 12;
			int anLocalInt_25_
			    = (anLocalInts_17_[anLocalInt] * anLocalInt_21_
			       >> 12);
			int anLocalInt_26_
			    = (anLocalInts_16_[anLocalInt_18_] * anLocalInt_21_
			       >> 12);
			int anLocalInt_27_ = anLocalInt_21_ * anInt1790 >> 12;
			anLocalInt_23_ *= anInt1789;
			anLocalInt_25_ *= anInt1783;
			anLocalInt_26_ *= anInt1790;
			int anLocalInt_28_ = anLocalInt_23_ >> 12;
			int anLocalInt_29_ = anLocalInt_28_ + 1;
			int anLocalInt_30_ = anLocalInt_26_ >> 12;
			anLocalInt_28_ &= 0xff;
			int anLocalInt_31_ = anLocalInt_30_ + 1;
			int anLocalInt_32_ = anLocalInt_25_ >> 12;
			anLocalInt_30_ &= 0xff;
			int anLocalInt_33_ = anLocalInt_32_ + 1;
			if (anLocalInt_24_ <= anLocalInt_29_)
			    anLocalInt_29_ = 0;
			else
			    anLocalInt_29_ &= 0xff;
			if (anLocalInt_31_ >= anLocalInt_27_)
			    anLocalInt_31_ = 0;
			else
			    anLocalInt_31_ &= 0xff;
			anLocalInt_23_ &= 0xfff;
			anLocalInt_26_ &= 0xfff;
			anLocalInt_25_ &= 0xfff;
			anLocalInt_32_ &= 0xff;
			if (anLocalInt_22_ > anLocalInt_33_)
			    anLocalInt_33_ &= 0xff;
			else
			    anLocalInt_33_ = 0;
			int anLocalInt_34_ = anLocalInt_23_ - 4096;
			int anLocalInt_35_ = aShortArray1786[anLocalInt_32_];
			int anLocalInt_36_
			    = Class62_Sub11.anIntArray4401[anLocalInt_25_];
			int anLocalInt_37_ = anLocalInt_25_ - 4096;
			int anLocalInt_38_ = aShortArray1786[anLocalInt_33_];
			int anLocalInt_39_ = anLocalInt_26_ - 4096;
			int anLocalInt_40_
			    = Class62_Sub11.anIntArray4401[anLocalInt_26_];
			int anLocalInt_41_
			    = Class62_Sub11.anIntArray4401[anLocalInt_23_];
			int anLocalInt_42_
			    = aShortArray1786[anLocalInt_30_ + anLocalInt_38_];
			int anLocalInt_43_
			    = aShortArray1786[anLocalInt_35_ + anLocalInt_30_];
			int anLocalInt_44_
			    = aShortArray1786[anLocalInt_38_ + anLocalInt_31_];
			int anLocalInt_45_
			    = aShortArray1786[anLocalInt_35_ + anLocalInt_31_];
			int anLocalInt_46_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_25_,
                            (aShortArray1786
                                    [anLocalInt_28_ + anLocalInt_43_]),
                            anLocalInt_26_, (byte) -61, anLocalInt_23_));
			int anLocalInt_47_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_25_,
                            (aShortArray1786
                                    [anLocalInt_29_ + anLocalInt_43_]),
                            anLocalInt_26_, (byte) -61, anLocalInt_34_));
			int anLocalInt_48_
			    = ((anLocalInt_41_ * (-anLocalInt_46_
						  + anLocalInt_47_)
				>> 12)
			       + anLocalInt_46_);
			anLocalInt_46_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_25_,
                            (aShortArray1786
                                    [anLocalInt_45_ + anLocalInt_28_]),
                            anLocalInt_39_, (byte) -61, anLocalInt_23_));
			anLocalInt_47_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_25_,
                            (aShortArray1786
                                    [anLocalInt_29_ + anLocalInt_45_]),
                            anLocalInt_39_, (byte) -61, anLocalInt_34_));
			int anLocalInt_49_
			    = (anLocalInt_46_
			       + (((anLocalInt_47_ - anLocalInt_46_)
				   * anLocalInt_41_)
				  >> 12));
			anLocalInt_46_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_37_,
                            (aShortArray1786
                                    [anLocalInt_42_ + anLocalInt_28_]),
                            anLocalInt_26_, (byte) -61, anLocalInt_23_));
			int anLocalInt_50_
			    = ((((-anLocalInt_48_ + anLocalInt_49_)
				 * anLocalInt_40_)
				>> 12)
			       + anLocalInt_48_);
			anLocalInt_47_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_37_,
                            (aShortArray1786
                                    [anLocalInt_42_ + anLocalInt_29_]),
                            anLocalInt_26_, (byte) -61, anLocalInt_34_));
			anLocalInt_48_ = anLocalInt_46_ + (((-anLocalInt_46_
							     + anLocalInt_47_)
							    * anLocalInt_41_)
							   >> 12);
			anLocalInt_46_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_37_,
                            (aShortArray1786
                                    [anLocalInt_44_ + anLocalInt_28_]),
                            anLocalInt_39_, (byte) -61, anLocalInt_23_));
			anLocalInt_47_
			    = (Node_Sub31_Sub22.method946
                    (anLocalInt_37_,
                            (aShortArray1786
                                    [anLocalInt_29_ + anLocalInt_44_]),
                            anLocalInt_39_, (byte) -61, anLocalInt_34_));
			anLocalInt_49_ = (anLocalInt_41_ * (-anLocalInt_46_
							    + anLocalInt_47_)
					  >> 12) + anLocalInt_46_;
			int anLocalInt_51_
			    = (anLocalInt_48_
			       + (anLocalInt_40_ * (anLocalInt_49_
						    - anLocalInt_48_)
				  >> 12));
			method3171(0,
				   (anLocalInt_36_ * (-anLocalInt_50_
						      + anLocalInt_51_)
				    >> 12) + anLocalInt_50_,
				   anLocalInt_20_);
		    }
		    method3169(1029024876);
		}
	    }
	}
    }
    
    Class245(int argument_52_, int argument_53_, int argument_54_,
	     int argument_55_, int argument_56_) {
	aShortArray1786 = new short[512];
	anInt1790 = 4;
	anInt1788 = argument_52_;
	anInt1783 = argument_56_;
	anInt1789 = argument_54_;
	anInt1790 = argument_55_;
	((Class245) this).anInt1782 = argument_53_;
	method3172((byte) 10);
	method3168(25585);
    }
}
