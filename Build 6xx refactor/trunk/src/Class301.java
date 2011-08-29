/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class301
{
    int anInt2526;
    private GraphicsToolkit_Sub2_Sub1 aClass_ha_Sub2_Sub1_2527;
    static int anInt2528;
    static Interface15[] anInterface15Array2529;
    static char[] aCharArray2530 = { '[', ']', '#' };
    
    public static void method3531(int argument) {
	anInterface15Array2529 = null;
	aCharArray2530 = null;
    }
    
    protected final void finalize() throws Throwable {
	aClass_ha_Sub2_Sub1_2527.requestArbProgramDeletion(((Class301) this).anInt2526);
	super.finalize();
    }
    
    Class301(GraphicsToolkit_Sub2_Sub1 argument_0_, int argument_1_,
	     int argument_2_) {
	((Class301) this).anInt2526 = argument_2_;
	aClass_ha_Sub2_Sub1_2527 = argument_0_;
    }
}
