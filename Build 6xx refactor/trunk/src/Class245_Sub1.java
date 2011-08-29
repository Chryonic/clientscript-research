/* Class245_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class245_Sub1 extends Class245
{
    private int anInt5301;
    static int anInt5302;
    static Class207 aClass207_5303 = new Class207(76, 6);
    private byte[] aByteArray5304;
    private int[] anIntArray5305 = new int[((Class245) this).anInt1782];
    private int anInt5306;
    static Js5Store aJs5Store_5307;
    
    final void method3169(int argument_0_) {
	if (argument_0_ != 1029024876)
	    method3178(-3);
	anInt5301 = Math.abs(anInt5301);
	if (anInt5301 >= 4096)
	    anInt5301 = 4095;
	method3177(anInt5306++, (byte) 103, (byte) (anInt5301 >> 4));
	anInt5301 = 0;
    }
    
    final void method3173(int argument_1_) {
	if (argument_1_ != 29373)
	    method3173(3);
	anInt5306 = 0;
	anInt5301 = 0;
    }
    
    Class245_Sub1(int argument_2_, int argument_3_, int argument_4_,
		  int argument_5_, int argument_6_, float argument_7_) {
	super(argument_2_, argument_3_, argument_4_, argument_5_, argument_6_);
	for (int anLocalInt = 0; anLocalInt < ((Class245) this).anInt1782;
	     anLocalInt++)
	    anIntArray5305[anLocalInt]
		= (short) (int) (Math.pow((double) argument_7_,
					  (double) anLocalInt)
				 * 4096.0);
    }
    
    public static void method3175(boolean argument) {
	aClass207_5303 = null;
	aJs5Store_5307 = null;
    }
    
    static final boolean method3176(byte argument) {
	Node_Sub14 class59_sub14
	    = (Node_Sub14) Class151.aCyclicLinkedList_1146.getFirst();
	if (class59_sub14 == null)
	    return false;
	for (int anLocalInt = 0;
	     anLocalInt < ((Node_Sub14) class59_sub14).anInt3989;
	     anLocalInt++) {
	    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3984[anLocalInt]
		 != null)
		&& (((Node_Sub14) class59_sub14).aSignlinkRequestArray3984
		    [anLocalInt].status) == 0)
		return false;
	    if ((((Node_Sub14) class59_sub14).aSignlinkRequestArray3987[anLocalInt]
		 != null)
		&& (((Node_Sub14) class59_sub14).aSignlinkRequestArray3987
		    [anLocalInt].status) == 0)
		return false;
	}
	return true;
    }
    
    void method3177(int argument_8_, byte argument_9_, byte argument_10_) {
	int anLocalInt = -121 / ((-75 - argument_9_) / 40);
	aByteArray5304[anInt5306++]
	    = (byte) ((MathStatics.AND(argument_10_, 255) >> 1) + 127);
    }
    
    final void method3171(int argument_11_, int argument_12_,
			  int argument_13_) {
	if (argument_11_ != 0)
	    anIntArray5305 = null;
	anInt5301 += argument_12_ * anIntArray5305[argument_13_] >> 12;
    }
    
    static final void method3178(int argument) {
	if (argument != 16175)
	    aJs5Store_5307 = null;
	Class279.method3419(2,
			    ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				.aClass62_Sub12_4313.method1401(69) == 1,
			    (byte) 0, 22050);
	tia_sub_35_Sub1DoublyLinked.aClass112_6659
	    = Class350_Sub1.method3843(16036, Applet_Sub1.gameCanvas, 0,
				       Applet_Sub1.baseSignlink, 22050);
	JagexHashMap.method1529(Class147.method2524(null, -125), 57, true);
	Class245.aClass112_1787
	    = Class350_Sub1.method3843(16036, Applet_Sub1.gameCanvas, 1,
				       Applet_Sub1.baseSignlink, 2048);
	Class353_Sub2.aClass59_Sub9_Sub3_5483 = new Node_Sub9_Sub3();
	Class245.aClass112_1787
	    .method2003(Class353_Sub2.aClass59_Sub9_Sub3_5483, (byte) 112);
	Class23.aClass213_155 = new Class213(22050, Statics.anInt44);
	Node_Sub49.method1149(argument - 16175);
    }
}
