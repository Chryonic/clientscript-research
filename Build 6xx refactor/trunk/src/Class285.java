/* Class285 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class285 implements Interface14
{
    static int anInt3635 = 0;
    private Class156 aClass156_3636;
    private AbstractFont aAbstractFont_3637;
    private Js5Store aJs5Store_3638;
    private Js5Store aJs5Store_3639;
    
    static final int method3460(int argument) {
	return Node_Sub21.anInt4035;
    }
    
    public final void method59(int argument_0_, boolean argument_1_) {
	if (argument_1_) {
	    int anLocalInt
		= ((((Class156) aClass156_3636).aClass349_3689.method3823
		    (((Class156) aClass156_3636).anInt3687,
		     client.gameWidth, (byte) -91))
		   + ((Class156) aClass156_3636).anInt3682);
	    int anLocalInt_2_
		= ((((Class156) aClass156_3636).aClass44_3690.method431
		    (0, client.gameHeight,
		     ((Class156) aClass156_3636).anInt3691))
		   + ((Class156) aClass156_3636).anInt3679);
	    aAbstractFont_3637.method498(((Class156) aClass156_3636).aString3684, 0,
				    0, null, anLocalInt, -1,
				    ((Class156) aClass156_3636).anInt3688,
				    ((Class156) aClass156_3636).anInt3683,
				    ((Class156) aClass156_3636).anInt3687,
				    ((Class156) aClass156_3636).anInt3691,
				    ((Class156) aClass156_3636).anInt3692,
				    ((Class156) aClass156_3636).anInt3693,
				    ((Class156) aClass156_3636).anInt3680,
				    null, null, anLocalInt_2_);
	}
	if (argument_0_ >= -93)
	    method57(82);
    }
    
    public final boolean method58(int argument_3_) {
	boolean anLocalBoolean = true;
	if (argument_3_ != 20662)
	    aAbstractFont_3637 = null;
	if (!aJs5Store_3639.isFlatFile(((Class156) aClass156_3636).anInt3685))
	    anLocalBoolean = false;
	if (!aJs5Store_3638.isFlatFile(((Class156) aClass156_3636).anInt3685))
	    anLocalBoolean = false;
	return anLocalBoolean;
    }
    
    Class285(Js5Store argument_4_, Js5Store argument_5_, Class156 argument_6_) {
	aJs5Store_3639 = argument_4_;
	aJs5Store_3638 = argument_5_;
	aClass156_3636 = argument_6_;
    }
    
    public final void method57(int argument_7_) {
	Class76 class76
	    = Class359.method3944(aJs5Store_3638, -5707,
				  ((Class156) aClass156_3636).anInt3685);
	aAbstractFont_3637
	    = (Class389.aGraphicsToolkit3281.method2083
	       (class76,
		Class83.method1605(aJs5Store_3639,
				   ((Class156) aClass156_3636).anInt3685),
		true));
	if (argument_7_ <= 36)
	    anInt3635 = -105;
    }
}
