/* Class133_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class133_Sub2 extends Class133
{
    private int anInt5012;
    static Class166 aClass166_5013 = new Class166(100, 1);
    private int anInt5014;
    private int anInt5015;
    private int anInt5016;
    static int anInt5017 = -1;
    
    Class133_Sub2(int argument_0_, int argument_1_, int argument_2_,
		  int argument_3_, int argument_4_, int argument_5_) {
	super(-1, argument_4_, argument_5_);
	anInt5014 = argument_1_;
	anInt5016 = argument_2_;
	anInt5015 = argument_0_;
	anInt5012 = argument_3_;
    }
    
    public static void method2451(int argument) {
	aClass166_5013 = null;
    }
    
    final void method2439(int argument_6_, int argument_7_, int argument_8_) {
	if (argument_8_ != -7895)
	    aClass166_5013 = null;
    }
    
    final void method2444(byte argument_9_, int argument_10_,
			  int argument_11_) {
	if (argument_9_ != 85) {
	    /* empty */
	}
    }
    
    final void method2441(byte argument_12_, int argument_13_,
			  int argument_14_) {
	int anLocalInt = argument_14_ * anInt5015 >> 12;
	if (argument_12_ != 101)
	    method2451(91);
	int anLocalInt_15_ = argument_14_ * anInt5016 >> 12;
	int anLocalInt_16_ = argument_13_ * anInt5014 >> 12;
	int anLocalInt_17_ = anInt5012 * argument_13_ >> 12;
	Class92.method1690(argument_12_ - 31, anLocalInt_17_, anLocalInt_15_,
			   anLocalInt_16_, anLocalInt,
			   ((Class133) this).anInt1067);
    }
}
