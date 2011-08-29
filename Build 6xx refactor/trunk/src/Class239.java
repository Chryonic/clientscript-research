/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239
{
    boolean aBoolean1737;
    int anInt1738;
    int anInt1739;
    int anInt1740;
    boolean aBoolean1741;
    static Object anObject1742;
    
    static final boolean method3126(int argument, int argument_0_,
				    int argument_1_, boolean argument_2_,
				    int argument_3_) {
	if ((Class303.tileSettings[0][argument_0_][argument] & 0x2)
	    != 0)
	    return true;
	if (((Class303.tileSettings[argument_3_][argument_0_]
	      [argument])
	     & 0x10)
	    != 0)
	    return false;
	if (argument_1_
	    == Class121.method2387(argument, 2, argument_0_, argument_3_))
	    return true;
	return false;
    }
    
    static final String method3127(byte[] argument, int argument_4_,
				   int argument_5_, int argument_6_) {
	char[] anLocalChars = new char[argument_6_];
	int anLocalInt = 0;
	for (int anLocalInt_7_ = 0; argument_6_ > anLocalInt_7_;
	     anLocalInt_7_++) {
	    int anLocalInt_8_ = argument[argument_5_ + anLocalInt_7_] & 0xff;
	    if (anLocalInt_8_ != 0) {
		if (anLocalInt_8_ >= 128 && anLocalInt_8_ < 160) {
		    int anLocalInt_9_
			= KeyHandler.miscPrintableChars[anLocalInt_8_ - 128];
		    if (anLocalInt_9_ == 0)
			anLocalInt_9_ = 63;
		    anLocalInt_8_ = anLocalInt_9_;
		}
		anLocalChars[anLocalInt++] = (char) anLocalInt_8_;
	    }
	}
	return new String(anLocalChars, 0, anLocalInt);
    }
    
    public Class239() {
	/* empty */
    }
    
    public static void method3128(int argument) {
	anObject1742 = null;
    }
}
