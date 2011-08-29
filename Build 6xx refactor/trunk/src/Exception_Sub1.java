/* Exception_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Exception_Sub1 extends Exception
{
    static String aString47;
    static int[] anIntArray48;
    static int anInt49;
    static int anInt50;
    
    static final int method140(int argument) {
	int anLocalInt = -1;
	for (int anLocalInt_0_ = 0; anLocalInt_0_ < Statics.anInt1650 - 1;
	     anLocalInt_0_++) {
	    if (argument < (Class62_Sub3.anIntArray4373[anLocalInt_0_]
			    + IOException_Sub1.anIntArray41[anLocalInt_0_])) {
		anLocalInt = anLocalInt_0_;
		break;
	    }
	}
	if (anLocalInt == -1)
	    anLocalInt = Statics.anInt1650 - 1;
	return anLocalInt;
    }
    
    public Exception_Sub1() {
	/* empty */
    }
    
    static final int method141(int argument, int argument_1_,
			       int argument_2_) {
	int anLocalInt = argument_2_ >>> 31;
	return (anLocalInt + argument_2_) / argument - anLocalInt;
    }
    
    public static void method142(int argument) {
	aString47 = null;
	anIntArray48 = null;
    }
}
