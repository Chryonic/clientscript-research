/* Class59_Sub31_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub29 extends Node_Sub31
{
    private int anInt5978 = 585;
    static int[] anIntArray5979;
    static int anInt5980 = 0;
    static int anInt5981 = 100;
    
    static final void method963(boolean argument) {
	Cs2Script.scriptCache.method2632((byte) 124);
    }
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	int anLocalInt = argument_1_;
	if (anLocalInt == 0)
	    anInt5978 = argument_0_.g2();
	if (argument_2_ >= -41)
	    anInt5981 = -56;
    }
    
    static final boolean method964(int argument, int argument_3_,
				   int argument_4_) {
	if ((argument & 0x400) == 0)
	    return false;
	return true;
    }
    
    public static void method965(int argument) {
	anIntArray5979 = null;
    }
    
    final int[] method867(byte argument_5_, int argument_6_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_6_,
							      -13476);
	if (argument_5_ < 21)
	    anInt5978 = -86;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Class82.anIntArray585[argument_6_];
	    for (int anLocalInt_7_ = 0; Statics.anInt294 > anLocalInt_7_;
		 anLocalInt_7_++) {
		int anLocalInt_8_ = Class130.anIntArray1053[anLocalInt_7_];
		if (anLocalInt_8_ > anInt5978
		    && anLocalInt_8_ < -anInt5978 + 4096
		    && anLocalInt > -anInt5978 + 2048
		    && 2048 + anInt5978 > anLocalInt) {
		    int anLocalInt_9_ = -anLocalInt_8_ + 2048;
		    anLocalInt_9_
			= anLocalInt_9_ >= 0 ? anLocalInt_9_ : -anLocalInt_9_;
		    anLocalInt_9_ <<= 12;
		    anLocalInt_9_ /= -anInt5978 + 2048;
		    anLocalInts[anLocalInt_7_] = -anLocalInt_9_ + 4096;
		} else if (-anInt5978 + 2048 < anLocalInt_8_
			   && anLocalInt_8_ < anInt5978 + 2048) {
		    int anLocalInt_10_ = anLocalInt - 2048;
		    anLocalInt_10_ = (anLocalInt_10_ < 0 ? -anLocalInt_10_
				      : anLocalInt_10_);
		    anLocalInt_10_ -= anInt5978;
		    anLocalInt_10_ <<= 12;
		    anLocalInts[anLocalInt_7_]
			= anLocalInt_10_ / (-anInt5978 + 2048);
		} else if (anInt5978 > anLocalInt
			   || -anInt5978 + 4096 < anLocalInt) {
		    int anLocalInt_11_ = anLocalInt_8_ - 2048;
		    anLocalInt_11_ = (anLocalInt_11_ < 0 ? -anLocalInt_11_
				      : anLocalInt_11_);
		    anLocalInt_11_ -= anInt5978;
		    anLocalInt_11_ <<= 12;
		    anLocalInts[anLocalInt_7_]
			= anLocalInt_11_ / (-anInt5978 + 2048);
		} else if (anInt5978 > anLocalInt_8_
			   || -anInt5978 + 4096 < anLocalInt_8_) {
		    int anLocalInt_12_ = -anLocalInt + 2048;
		    anLocalInt_12_ = (anLocalInt_12_ >= 0 ? anLocalInt_12_
				      : -anLocalInt_12_);
		    anLocalInt_12_ <<= 12;
		    anLocalInt_12_ /= 2048 - anInt5978;
		    anLocalInts[anLocalInt_7_] = -anLocalInt_12_ + 4096;
		} else
		    anLocalInts[anLocalInt_7_] = 0;
	    }
	}
	return anLocalInts;
    }
    
    static final void method966(byte argument, String argument_13_) {
	Class62_Sub12.method1403(0, "", "", argument_13_, 0, "", 16773);
    }
    
    public Node_Sub31_Sub29() {
	super(0, true);
    }
}
