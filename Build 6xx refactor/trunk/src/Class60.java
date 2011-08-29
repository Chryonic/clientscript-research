/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class60
{
    static int[][] anIntArrayArray432 = new int[128][128];
    static long aLong433 = 0L;
    static Class166 aClass166_434 = new Class166(25, 0);
    static int[] anIntArray435 = new int[2];
    static int anInt436 = 0;
    
    static final boolean method1336(int argument, byte argument_0_,
				    int argument_1_) {
	return ((Class277.method3403(argument, 113, argument_1_)
		 | Class38.method392(argument, argument_1_, 0)
		 | Class352.method3879(argument_1_, argument, -66))
		& Class224.method3043(argument_1_, argument, -32183));
    }
    
    static final int method1337(float argument, float argument_2_,
				float argument_3_, int argument_4_) {
	float f = argument < 0.0F ? -argument : argument;
	float f_5_ = argument_2_ < 0.0F ? -argument_2_ : argument_2_;
	float f_6_ = !(argument_3_ < 0.0F) ? argument_3_ : -argument_3_;
	if (!(f < f_5_) || !(f_5_ > f_6_)) {
	    if (f_6_ > f && f_5_ < f_6_) {
		if (argument_3_ > 0.0F)
		    return 2;
		return 3;
	    }
	    if (!(argument > 0.0F))
		return 5;
	    return 4;
	}
	if (argument_2_ > 0.0F)
	    return 0;
	return 1;
    }
    
    static final boolean method1338(byte argument, int argument_7_,
				    int argument_8_) {
	if ((argument_7_ & 0x20) == 0)
	    return false;
	return true;
    }
    
    public static void method1339(byte argument) {
	anIntArrayArray432 = null;
	aClass166_434 = null;
	anIntArray435 = null;
    }
}
