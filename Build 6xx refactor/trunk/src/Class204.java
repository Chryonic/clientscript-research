/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class204
{
    static int anInt1457;
    static float aFloat1458 = 1.0F;

    static final void method2936
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_) {
	int anLocalInt = -argument_4_ + argument_5_;
	int anLocalInt_6_ = argument_4_ + argument_3_;
	for (int anLocalInt_7_ = argument_3_; anLocalInt_7_ < anLocalInt_6_;
	     anLocalInt_7_++)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_7_], (byte) -113, argument_0_, argument_2_, argument);
	int anLocalInt_8_ = -argument_4_ + argument_2_;
	int anLocalInt_9_ = argument_0_ + argument_4_;
	for (int anLocalInt_10_ = argument_5_; anLocalInt < anLocalInt_10_;
	     anLocalInt_10_--)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_10_], (byte) -48, argument_0_, argument_2_, argument);
	for (int anLocalInt_11_ = anLocalInt_6_; anLocalInt_11_ <= anLocalInt;
	     anLocalInt_11_++) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[anLocalInt_11_];
	    Statics.method3364(anLocalInts, (byte) 93, argument_0_, anLocalInt_9_, argument);
	    Statics.method3364(anLocalInts, (byte) 91, anLocalInt_8_, argument_2_, argument);
	}
    }
}
