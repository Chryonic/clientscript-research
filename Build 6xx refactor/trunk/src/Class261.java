/* Class261 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class261
{
    static float aFloat2038;
    static Class207 aClass207_2039 = new Class207(37, 2);
    
    static final void method3320(boolean argument, int argument_0_) {
	if (Class85.aString605.length() != 0) {
	    Statics.method2425((byte) -112, "--> " + Class85.aString605);
	    Class207.method2948(Class85.aString605, false, argument, -1);
	    Class133_Sub1.anInt5010 = 0;
	    Class85.aString605 = "";
	    Class205.anInt1471 = 0;
	}
    }
    
    public static void method3321(int argument) {
	aClass207_2039 = null;
    }
    
    static final void method3322(int argument, int argument_1_,
				 int argument_2_, int argument_3_,
				 int argument_4_, int argument_5_) {
	int anLocalInt = 0;
	int anLocalInt_6_ = argument_3_;
	int anLocalInt_7_ = argument_1_ * argument_1_;
	int anLocalInt_8_ = argument_3_ * argument_3_;
	int anLocalInt_9_ = anLocalInt_8_ << 1;
	int anLocalInt_10_ = anLocalInt_7_ << 1;
	int anLocalInt_11_ = argument_3_ << 1;
	int anLocalInt_12_
	    = (-anLocalInt_11_ + 1) * anLocalInt_7_ + anLocalInt_9_;
	int anLocalInt_13_
	    = anLocalInt_8_ - (anLocalInt_11_ - 1) * anLocalInt_10_;
	int anLocalInt_14_ = anLocalInt_7_ << 2;
	int anLocalInt_15_ = anLocalInt_8_ << 2;
	int anLocalInt_16_ = anLocalInt_9_ * ((anLocalInt << 1) + 3);
	int anLocalInt_17_ = ((anLocalInt_6_ << 1) - 3) * anLocalInt_10_;
	int anLocalInt_18_ = anLocalInt_15_ * (anLocalInt + 1);
	int anLocalInt_19_ = anLocalInt_14_ * (anLocalInt_6_ - 1);
	if (argument >= Class209.anInt1504
	    && argument <= Node_Sub31_Sub13.anInt5896) {
	    int anLocalInt_20_
		= Node_Sub31_Sub8.method897(argument_4_ + argument_1_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_21_
		= Node_Sub31_Sub8.method897(argument_4_ - argument_1_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    Statics.method3364(Class223.anIntArrayArray1562[argument], (byte) 88, anLocalInt_21_, anLocalInt_20_, argument_5_);
	}
	while (anLocalInt_6_ > 0) {
	    if (anLocalInt_12_ < 0) {
		while (anLocalInt_12_ < 0) {
		    anLocalInt_12_ += anLocalInt_16_;
		    anLocalInt_13_ += anLocalInt_18_;
		    anLocalInt_18_ += anLocalInt_15_;
		    anLocalInt++;
		    anLocalInt_16_ += anLocalInt_15_;
		}
	    }
	    if (anLocalInt_13_ < 0) {
		anLocalInt_12_ += anLocalInt_16_;
		anLocalInt_13_ += anLocalInt_18_;
		anLocalInt++;
		anLocalInt_18_ += anLocalInt_15_;
		anLocalInt_16_ += anLocalInt_15_;
	    }
	    anLocalInt_13_ -= anLocalInt_17_;
	    anLocalInt_12_ -= anLocalInt_19_;
	    anLocalInt_19_ -= anLocalInt_14_;
	    anLocalInt_17_ -= anLocalInt_14_;
	    int anLocalInt_22_ = -anLocalInt_6_ + argument;
	    int anLocalInt_23_ = anLocalInt_6_ + argument;
	    if (Class209.anInt1504 <= anLocalInt_23_
		&& anLocalInt_22_ <= Node_Sub31_Sub13.anInt5896) {
		int anLocalInt_24_
		    = Node_Sub31_Sub8.method897(argument_4_ + anLocalInt,
                Node_Sub35.anInt4156,
                124915076,
                (Node_Sub9_Sub2
                        .anInt5776));
		int anLocalInt_25_
		    = Node_Sub31_Sub8.method897(-anLocalInt + argument_4_,
                Node_Sub35.anInt4156,
                124915076,
                (Node_Sub9_Sub2
                        .anInt5776));
		if (Class209.anInt1504 <= anLocalInt_22_)
		    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_22_]), (byte) 90, anLocalInt_25_, anLocalInt_24_, argument_5_);
		if (anLocalInt_23_ <= Node_Sub31_Sub13.anInt5896)
		    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_23_]), (byte) 124, anLocalInt_25_, anLocalInt_24_, argument_5_);
	    }
	}
    }
}
