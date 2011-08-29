/* Class189_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189_Sub3_Sub1 extends Class189_Sub3
{
    static Class166 aClass166_6630 = new Class166(120, 6);
    
    public static void method2880(byte argument) {
	aClass166_6630 = null;
    }
    
    Class189_Sub3_Sub1(Js5Store argument_0_, Js5Store argument_1_,
		       Class253_Sub1_Sub1 argument_2_) {
	super(argument_0_, argument_1_, (Class253_Sub1) argument_2_);
    }
    
    final void method2878(int argument_3_, boolean argument_4_,
			  int argument_5_, int argument_6_, int argument_7_) {
	int anLocalInt = ((Class189_Sub3) this).aClass368_5648.getWidth();
	int anLocalInt_8_ = (((Class253_Sub1_Sub1) (Class253_Sub1_Sub1)
			      ((Class189) this).aClass253_3621).anInt6631
			     * Class208.method2952(13363) / 10 % anLocalInt);
	if (argument_4_ != true)
	    aClass166_6630 = null;
	((Class189_Sub3) this).aClass368_5648.method4023
	    (-anLocalInt + argument_6_ + anLocalInt_8_, argument_5_,
	     anLocalInt + argument_3_ - anLocalInt_8_, argument_7_);
    }
}
