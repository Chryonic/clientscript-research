/* Class363 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class363
{
    AbstractFont aAbstractFont_3062 = null;
    static Class241 aClass241_3064;
    static Class166 aClass166_3065;
    Class76 aClass76_3066 = null;
    static boolean aBoolean3068 = false;

    public static void method3967(int argument) {
	aClass241_3064 = null;
	client.loadingBarBorderColour = null;
	aClass166_3065 = null;
    }
    
    Class363(AbstractFont argument_0_) {
	((Class363) this).aAbstractFont_3062 = argument_0_;
    }
    
    Class363(AbstractFont argument_1_, Class76 argument_2_) {
	((Class363) this).aClass76_3066 = argument_2_;
	((Class363) this).aAbstractFont_3062 = argument_1_;
    }
    
    static {
	aClass166_3065 = new Class166(102, 10);
    }
}
