/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class137
{
    static int anInt1083 = 0;
    static int anInt1084;

    public static void method2459(int argument) {
	Applet_Sub1.baseSignlink = null;
    }
    
    static final void method2460
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, float[] argument_5_) {
	if (argument > 0 && !Class2_Sub1.method198(argument))
	    throw new IllegalArgumentException("");
	if (argument_1_ > 0 && !Class2_Sub1.method198(argument_1_))
	    throw new IllegalArgumentException("");
	int anLocalInt = GlToolkit.method883(argument_0_);
	int anLocalInt_6_ = 0;
	int anLocalInt_7_ = argument >= argument_1_ ? argument_1_ : argument;
	int anLocalInt_8_ = argument >> 1;
	int anLocalInt_9_ = argument_1_ >> 1;
	float[] fs = argument_5_;
	float[] fs_10_
	    = new float[anLocalInt * (anLocalInt_9_ * anLocalInt_8_)];
	for (;;) {
	    OpenGL.glTexImage2Df(argument_2_, anLocalInt_6_, argument_3_,
				 argument, argument_1_, 0, argument_0_, 5126,
				 fs, 0);
	    if (anLocalInt_7_ <= 1)
		break;
	    int anLocalInt_11_ = anLocalInt * argument;
	    float[] fs_12_ = fs_10_;
	    for (int anLocalInt_13_ = 0; anLocalInt_13_ < anLocalInt;
		 anLocalInt_13_++) {
		int anLocalInt_14_ = anLocalInt_13_;
		int anLocalInt_15_ = anLocalInt_13_;
		int anLocalInt_16_ = anLocalInt_11_ + anLocalInt_15_;
		for (int anLocalInt_17_ = 0; anLocalInt_9_ > anLocalInt_17_;
		     anLocalInt_17_++) {
		    for (int anLocalInt_18_ = 0;
			 anLocalInt_8_ > anLocalInt_18_; anLocalInt_18_++) {
			float f = fs[anLocalInt_15_];
			anLocalInt_15_ += anLocalInt;
			f += fs[anLocalInt_15_];
			f += fs[anLocalInt_16_];
			anLocalInt_15_ += anLocalInt;
			anLocalInt_16_ += anLocalInt;
			f += fs[anLocalInt_16_];
			fs_10_[anLocalInt_14_] = f * 0.25F;
			anLocalInt_16_ += anLocalInt;
			anLocalInt_14_ += anLocalInt;
		    }
		    anLocalInt_16_ += anLocalInt_11_;
		    anLocalInt_15_ += anLocalInt_11_;
		}
	    }
	    fs_10_ = fs;
	    argument_1_ = anLocalInt_9_;
	    fs = fs_12_;
	    argument = anLocalInt_8_;
	    anLocalInt_6_++;
	    anLocalInt_8_ >>= 1;
	    anLocalInt_9_ >>= 1;
	    anLocalInt_7_ >>= 1;
	}
    }
    
    static final void method2461(int argument, byte argument_19_) {
	Class20.anInt131 = -1;
	Class68.anInt3583 = 3;
	Node_Sub31_Sub39.anInt6051 = 100;
	Statics.anInt1080 = argument;
    }
    
    static {
	anInt1084 = 0;
    }
}
