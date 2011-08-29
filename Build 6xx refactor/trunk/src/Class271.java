/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class271
{
    private int anInt2164;
    static Class207 aClass207_2165 = new Class207(89, 18);
    int anInt2166;
    
    public static void method3367(int argument) {
	aClass207_2165 = null;
    }
    
    static final boolean method3368(byte argument, int argument_0_) {
	if (argument_0_ < 12 || argument_0_ > 17)
	    return false;
	return true;
    }
    
    final void method3369(int argument_1_) {
	((Class271) this).anInt2166 &= 0x3fff;
    }
    
    final boolean method3370(int argument_2_, int argument_3_, int argument_4_,
			     byte argument_5_) {
	int anLocalInt = anInt2164;
	if (((Class271) this).anInt2166 == argument_3_ && anInt2164 == 0)
	    return false;
	boolean anLocalBoolean;
	if (anInt2164 != 0) {
	    if (anInt2164 <= 0 || ((Class271) this).anInt2166 >= argument_3_) {
		if (anInt2164 >= 0
		    || ((Class271) this).anInt2166 <= argument_3_)
		    anLocalBoolean = false;
		else {
		    int anLocalInt_6_
			= anInt2164 * anInt2164 / (argument_2_ * 2);
		    int anLocalInt_7_
			= ((Class271) this).anInt2166 - anLocalInt_6_;
		    if (anLocalInt_7_ > argument_3_
			&& anLocalInt_7_ <= ((Class271) this).anInt2166)
			anLocalBoolean = true;
		    else
			anLocalBoolean = false;
		}
	    } else {
		int anLocalInt_8_ = anInt2164 * anInt2164 / (argument_2_ * 2);
		int anLocalInt_9_
		    = anLocalInt_8_ + ((Class271) this).anInt2166;
		if (anLocalInt_9_ >= argument_3_
		    || anLocalInt_9_ < ((Class271) this).anInt2166)
		    anLocalBoolean = false;
		else
		    anLocalBoolean = true;
	    }
	} else {
	    if ((argument_3_ > ((Class271) this).anInt2166
		 && argument_2_ + ((Class271) this).anInt2166 >= argument_3_)
		|| (((Class271) this).anInt2166 > argument_3_
		    && (argument_3_
			>= -argument_2_ + ((Class271) this).anInt2166))) {
		((Class271) this).anInt2166 = argument_3_;
		return false;
	    }
	    anLocalBoolean = true;
	}
	if (!anLocalBoolean) {
	    if (anInt2164 > 0) {
		anInt2164 -= argument_2_;
		if (anInt2164 < 0)
		    anInt2164 = 0;
	    } else {
		anInt2164 += argument_2_;
		if (anInt2164 > 0)
		    anInt2164 = 0;
	    }
	} else {
	    if (argument_3_ <= ((Class271) this).anInt2166) {
		anInt2164 -= argument_2_;
		if (argument_4_ != 0 && anInt2164 < -argument_4_)
		    anInt2164 = -argument_4_;
	    } else {
		anInt2164 += argument_2_;
		if (argument_4_ != 0 && argument_4_ < anInt2164)
		    anInt2164 = argument_4_;
	    }
	    if (anLocalInt != anInt2164) {
		int anLocalInt_10_ = anInt2164 * anInt2164 / (argument_2_ * 2);
		if (((Class271) this).anInt2166 < argument_3_) {
		    if (anLocalInt_10_ + ((Class271) this).anInt2166
			> argument_3_)
			anInt2164 = anLocalInt;
		} else if (argument_3_ < ((Class271) this).anInt2166
			   && (((Class271) this).anInt2166 - anLocalInt_10_
			       < argument_3_))
		    anInt2164 = anLocalInt;
	    }
	}
	int anLocalInt_11_ = 37 % ((argument_5_ + 39) / 53);
	((Class271) this).anInt2166 += anLocalInt + anInt2164 >> 1;
	return anLocalBoolean;
    }
    
    final void method3371(int argument_12_, byte argument_13_) {
	anInt2164 = 0;
	((Class271) this).anInt2166 = argument_12_;
    }
    
    public Class271() {
	/* empty */
    }
    
    final int method3372(int argument_14_) {
	if (argument_14_ != 2)
	    return 10;
	return ((Class271) this).anInt2166 & 0x3fff;
    }
}
