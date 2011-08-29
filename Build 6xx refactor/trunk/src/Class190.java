/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class190
{
    static boolean aBoolean1395 = false;
    static Class166 aClass166_1396;
    
    public static void method2881(boolean argument) {
	aClass166_1396 = null;
    }
    
    static final int method2882(int argument, int argument_0_,
				int argument_1_) {
	int anLocalInt = 1;
	for (/**/; argument_1_ > 1; argument_1_ >>= 1) {
	    if ((argument_1_ & 0x1) != 0)
		anLocalInt *= argument_0_;
	    argument_0_ *= argument_0_;
	}
	if (argument_1_ == 1)
	    return anLocalInt * argument_0_;
	return anLocalInt;
    }
}
