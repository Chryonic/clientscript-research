/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class329
{
    static int anInt2699;
    static Class166 aClass166_2700 = new Class166(18, -1);
    
    public static void method3699(int argument) {
	aClass166_2700 = null;
    }

    static final int method3701(int argument, int argument_5_,
				int argument_6_) {
	if ((argument_6_ ^ 0xffffffff) == argument || argument_6_ == 3)
	    return Node_Sub47_Sub10.anIntArray6204[argument_5_ & 0x3];
	return Class1_Sub1.anIntArray5601[argument_5_ & 0x3];
    }
    
    static final void method3702(int[] argument, boolean argument_7_,
				 String[] argument_8_) {
	Statics.method2477(0, argument_8_, argument, argument_8_.length - 1, 1);
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    Class329(int argument_9_, int argument_10_) {
	/* empty */
    }
}
