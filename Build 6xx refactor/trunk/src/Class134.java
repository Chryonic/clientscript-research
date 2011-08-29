/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 implements Interface14
{
    static Class149 aClass149_3607;
    private Class150 aClass150_3609;
    private Js5Store aJs5Store_3610;
    private Class368 aClass368_3611;
    static int anInt3612;
    static int anInt3613 = 0;

    public final void method59(int argument_2_, boolean argument_3_) {
	if (argument_2_ > -93)
	    aJs5Store_3610 = null;
	if (argument_3_) {
	    int anLocalInt
		= (Applet_Sub1.canvasWidth > client.gameWidth
		   ? Applet_Sub1.canvasWidth
		   : client.gameWidth);
	    int anLocalInt_4_
		= (client.gameHeight >= Applet_Sub1.canvasHeight
		   ? client.gameHeight : Applet_Sub1.canvasHeight);
	    int anLocalInt_5_ = aClass368_3611.getWidth();
	    int anLocalInt_6_ = aClass368_3611.method4018();
	    int anLocalInt_7_ = 0;
	    int anLocalInt_8_ = anLocalInt;
	    int anLocalInt_9_ = anLocalInt * anLocalInt_6_ / anLocalInt_5_;
	    int anLocalInt_10_ = (anLocalInt_4_ - anLocalInt_9_) / 2;
	    if (anLocalInt_4_ < anLocalInt_9_) {
		anLocalInt_10_ = 0;
		anLocalInt_8_ = anLocalInt_4_ * anLocalInt_5_ / anLocalInt_6_;
		anLocalInt_9_ = anLocalInt_4_;
		anLocalInt_7_ = (anLocalInt - anLocalInt_8_) / 2;
	    }
	    aClass368_3611.method4011(anLocalInt_7_, anLocalInt_10_,
				      anLocalInt_8_, anLocalInt_9_);
	}
    }
    
    public final boolean method58(int argument_11_) {
	if (argument_11_ != 20662)
	    anInt3613 = -114;
	return aJs5Store_3610.isFlatFile(aClass150_3609.anInt3677);
    }
    
    public static void method2454(byte argument) {
	AthmosphericConditions.defaultAthmosphereDefinition = null;
	aClass149_3607 = null;
    }
    
    Class134(Js5Store argument_12_, Class150 argument_13_) {
	aJs5Store_3610 = argument_12_;
	aClass150_3609 = argument_13_;
    }
    
    public final void method57(int argument_14_) {
	if (argument_14_ < 36)
	    anInt3612 = 54;
	aClass368_3611
	    = Node_Sub47_Sub7.method1128(47, aJs5Store_3610,
            (aClass150_3609
                    .anInt3677));
    }
    
    static {
	aClass149_3607 = new Class149(128, 4);
    }
}
