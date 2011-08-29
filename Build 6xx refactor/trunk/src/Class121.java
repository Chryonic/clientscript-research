/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121
{
    static Class86[] aClass86Array981;
    GlElementBuffer anGlElementBuffer_982;
    static int anInt983 = 0;
    static int anInt984;
    
    public static void method2386(boolean argument) {
	aClass86Array981 = null;
    }
    
    static final int method2387(int argument, int argument_0_, int argument_1_,
				int argument_2_) {
	if (((Class303.tileSettings[argument_2_][argument_1_]
	      [argument])
	     & 0x8)
	    != 0)
	    return 0;
	if (argument_2_ > 0
	    && (Class303.tileSettings[1][argument_1_][argument]
		& 0x2) != 0)
	    return argument_2_ - 1;
	return argument_2_;
    }
}
