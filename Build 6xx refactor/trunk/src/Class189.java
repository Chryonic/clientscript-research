/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class189 implements Interface14
{
    static float aFloat3620;
    Class253 aClass253_3621;
    Js5Store aJs5Store_3622;
    static int anInt3624 = 0;
    private int anInt3625;
    private AbstractFont aAbstractFont_3626;
    private long aLong3627;
    private Js5Store aJs5Store_3629;
    
    abstract void method2869(int argument_0_, boolean argument_1_,
			     int argument_2_, int argument_3_);
    
    public void method57(int argument_4_) {
	Class76 class76
	    = Class359.method3944(aJs5Store_3629, -5707,
				  ((Class253) (((Class189) this)
					       .aClass253_3621)).anInt3719);
	aAbstractFont_3626
	    = (Class389.aGraphicsToolkit3281.method2083
	       (class76,
		Class83.method1605(((Class189) this).aJs5Store_3622,
				   ((Class253) (((Class189) this)
						.aClass253_3621)).anInt3719),
		true));
    }
    
    public final void method59(int argument_5_, boolean argument_6_) {
	int anLocalInt
	    = ((((Class253) ((Class189) this).aClass253_3621)
		    .aClass349_3712.method3823
		(((Class253) ((Class189) this).aClass253_3621).anInt3718,
		 client.gameWidth, (byte) -91))
	       + ((Class253) ((Class189) this).aClass253_3621).anInt3716);
	int anLocalInt_7_
	    = ((((Class253) ((Class189) this).aClass253_3621).aClass44_3710
		    .method431
		(0, client.gameHeight,
		 ((Class253) ((Class189) this).aClass253_3621).anInt3711))
	       + ((Class253) ((Class189) this).aClass253_3621).anInt3713);
	method2873(argument_6_, (byte) 28, anLocalInt, anLocalInt_7_);
	if (argument_5_ >= -93)
	    ((Class189) this).aClass253_3621 = null;
	method2869(anLocalInt_7_, argument_6_, 118, anLocalInt);
	String string = client.currentLoadingBar.getText();
	if (Applet_Sub1.getGameTime() - aLong3627 > 10000L)
	    string += " (" + client.currentLoadingBar.getClass34().getIndex() + ")";
	aAbstractFont_3626.method503
	    ((anLocalInt
	      + ((Class253) ((Class189) this).aClass253_3621).anInt3718 / 2),
	     -1, ((Class253) ((Class189) this).aClass253_3621).anInt3717,
	     (byte) 85, string,
	     (((Class253) ((Class189) this).aClass253_3621).anInt3711 / 2
	      + (anLocalInt_7_ + 4
		 + ((Class253) ((Class189) this).aClass253_3621).anInt3714)));
    }
    
    public static void method2870(int argument) {
	client.cacheDataFile = null;
    }
    
    final int method2871(int argument_8_) {
	int anLocalInt = client.currentLoadingBar.getStartPercentage();
	int anLocalInt_9_ = anLocalInt * 100;
	if (anLocalInt != anInt3625 || anLocalInt == 0) {
	    anInt3625 = anLocalInt;
	    aLong3627 = Applet_Sub1.getGameTime();
	} else {
	    int anLocalInt_10_ = client.currentLoadingBar.getProgress();
	    if (anLocalInt_10_ > anLocalInt) {
		long l
		    = aLong3627 - client.currentLoadingBar.method2838();
		if (l > 0L) {
		    long l_11_ = ((long) (anLocalInt_10_ - anLocalInt)
				  * (l * 10000L / (long) anLocalInt));
		    long l_12_ = ((-aLong3627
				   + Applet_Sub1.getGameTime())
				  * 10000L);
		    if (l_12_ >= l_11_)
			anLocalInt_9_ = anLocalInt_10_ * 100;
		    else
			anLocalInt_9_
			    = (int) (((long) (-anLocalInt + anLocalInt_10_)
				      * (l_12_ * 100L) / l_11_)
				     - -(long) (anLocalInt * 100));
		}
	    }
	}
	if (argument_8_ != 2048)
	    method2869(-108, true, 123, -95);
	return anLocalInt_9_;
    }
    
    static final boolean method2872(int argument, int argument_13_,
				    int argument_14_) {
	if (!(Class107.method1959(argument_14_, argument, 19)
	      | (argument & 0x800) != 0)
	    && !Node_Sub47_Sub11.method1140(argument_14_, 0, argument))
	    return false;
	return true;
    }
    
    public boolean method58(int argument_15_) {
	if (argument_15_ != 20662)
	    method2871(-128);
	boolean anLocalBoolean = true;
	if (!((Class189) this).aJs5Store_3622.isFlatFile((((Class253) (((Class189) this).aClass253_3621)).anInt3719)))
	    anLocalBoolean = false;
	if (!aJs5Store_3629.isFlatFile(((Class253) (((Class189) this).aClass253_3621)).anInt3719))
	    anLocalBoolean = false;
	return anLocalBoolean;
    }
    
    abstract void method2873(boolean argument_16_, byte argument_17_,
			     int argument_18_, int argument_19_);
    
    Class189(Js5Store argument_20_, Js5Store argument_21_,
	     Class253 argument_22_) {
	((Class189) this).aClass253_3621 = argument_22_;
	aJs5Store_3629 = argument_21_;
	((Class189) this).aJs5Store_3622 = argument_20_;
    }
}
