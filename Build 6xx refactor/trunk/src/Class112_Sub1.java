/* Class112_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class112_Sub1 extends Class112
{
    private static Interface16 anInterface16_4615;
    private int anInt4616;
    
    public static void method2011() {
	anInterface16_4615 = null;
    }
    
    final void method1996() {
	anInterface16_4615.method63(anInt4616,
				    ((Class112) this).anIntArray923);
    }
    
    final int method1995() {
	return anInterface16_4615.method65(0, anInt4616);
    }
    
    final void method1999(int argument_0_) throws Exception {
	if (argument_0_ > 32768)
	    throw new IllegalArgumentException();
	anInterface16_4615.method62(anInt4616, -3227, argument_0_);
    }
    
    final void method2010(Component argument_1_) throws Exception {
	anInterface16_4615.method66(Statics.anInt44, 8000,
				    Class62_Sub3.aBoolean4377, argument_1_);
    }
    
    final void method1997() {
	anInterface16_4615.method64(anInt4616, false);
    }
    
    final void method1998() {
	anInterface16_4615.method67(anInt4616, 0);
    }
    
    Class112_Sub1(Signlink argument_2_, int argument_3_) {
	anInterface16_4615 = (Interface16) argument_2_.getDirectSoundManager();
	anInt4616 = argument_3_;
    }
}
