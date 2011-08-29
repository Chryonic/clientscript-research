/* Class2_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub8 extends Class2
{
    private Class191 aClass191_3802;
    static int anInt3803 = 0;
    private float aFloat3804 = 0.0F;
    static Class207 aClass207_3805 = new Class207(17, 8);
    
    static final void method208(int argument) {
	Class382.anInt3242 = -1;
	Node_Sub1.anInt3868 = argument;
	ModeWhatEnum.anInt2310 = -1;
    }
    
    final void method196(int argument_0_, byte argument_1_,
			 Interface7 argument_2_) {
	((Class2) this).aClass_ha_Sub2_56.method2237(true, argument_2_);
	int anLocalInt = 94 / ((60 - argument_1_) / 61);
    }
    
    final void method195(byte argument_3_) {
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2) this).aClass_ha_Sub2_56
	    .method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, 126);
	((Class2) this).aClass_ha_Sub2_56
	    .method2229((byte) -112, GlMultiTexSourceEnum.TEXTURE, 0);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -128);
	if (argument_3_ <= 54)
	    anInt3803 = 53;
	((Class2) this).aClass_ha_Sub2_56.method2234(1, 0);
	((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -95);
    }
    
    final void method189(int argument_4_, boolean argument_5_) {
	((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
						      .REPLACE),
						     CombineModeEnum.MODULATE,
						     argument_4_ ^ ~0x5975);
	if (argument_4_ != 22789)
	    method189(98, false);
    }
    
    Class2_Sub8(GraphicsToolkit_Sub2 argument_6_, Class191 argument_7_) {
	super(argument_6_);
	aClass191_3802 = argument_7_;
    }
    
    static final boolean method209(int argument, int argument_8_,
				   boolean argument_9_) {
	if (!(Class352.method3880(argument_8_, argument, -13222)
	      | (argument_8_ & 0x70000) != 0)
	    && !Statics.method544(argument, argument_8_, 0))
	    return false;
	return true;
    }
    
    final boolean method185(int argument_10_) {
	if (argument_10_ <= 53)
	    return true;
	return aClass191_3802.method2883(29925);
    }
    
    static final byte[] method210(byte argument, byte[] argument_11_) {
	int anLocalInt = argument_11_.length;
	byte[] anLocalInts = new byte[anLocalInt];
	JagStrings.memcpy(argument_11_, 0, anLocalInts, 0, anLocalInt);
	return anLocalInts;
    }
    
    final void method193(boolean argument_12_, int argument_13_) {
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2) this).aClass_ha_Sub2_56.method2228
	    (CombineModeEnum.REPLACE, CombineModeEnum.ADD, -50);
	((Class2) this).aClass_ha_Sub2_56.setMultiTexRgbSource(0, true, false, (GlMultiTexSourceEnum.TEXTURE), (byte) -67);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.PREVIOUS, -82);
	((Class2) this).aClass_ha_Sub2_56
	    .method2234(0, argument_13_ ^ argument_13_);
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	((Class2) this).aClass_ha_Sub2_56.method2246(-16777216,
						     argument_13_ ^ 0x3);
	((Class2) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.CONSTANT, argument_13_ ^ ~0x54);
	method188((byte) -56);
    }
    
    final void method186(int argument_14_, int argument_15_,
			 boolean argument_16_) {
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	if (argument_16_ != true)
	    method209(47, 14, false);
	if ((argument_14_ & 0x80) != 0)
	    ((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	else if ((argument_15_ & 0x1) != 1) {
	    if (!((Class191) aClass191_3802).aBoolean1408)
		((Class2) this).aClass_ha_Sub2_56.method2237
		    (argument_16_, (((Class191) aClass191_3802)
				    .anInterface7_Impl2Array1400[0]));
	    else
		((Class2) this).aClass_ha_Sub2_56.method2237
		    (argument_16_,
		     ((Class191) aClass191_3802).anInterface7_Impl1_1403);
	} else if (((Class191) aClass191_3802).aBoolean1408) {
	    aFloat3804
		= (float) ((((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
			    .anInt4757)
			   % 4000) / 4000.0F;
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, ((Class191) aClass191_3802).anInterface7_Impl1_1403);
	} else {
	    int anLocalInt
		= ((((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
		    .anInt4757)
		   % 4000 * 16 / 4000);
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, (((Class191) aClass191_3802).anInterface7_Impl2Array1400
			[anLocalInt]));
	}
	((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
    }
    
    public static void method211(int argument) {
	aClass207_3805 = null;
    }
    
    final void method188(byte argument_17_) {
	if (argument_17_ != -56)
	    aFloat3804 = 0.3830559F;
	if (((Class2) this).aClass_ha_Sub2_56.method2180(argument_17_ - 38)
	    == 0) {
	    Class350_Sub2 class350_sub2
		= ((Class2) this).aClass_ha_Sub2_56.method2127((byte) 13);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    Class350_Sub2 class350_sub2_18_
		= ((Class2) this).aClass_ha_Sub2_56.method2219((byte) -112);
	    class350_sub2_18_.method3838(class350_sub2);
	    class350_sub2_18_.method3849(-100, 1.0F, 0.125F, 0.125F);
	    class350_sub2_18_.method3864(argument_17_ + 18701, aFloat3804,
					 0.0F, 0.0F);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2171(52, Class253_Sub3.aClass81_5677);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	}
    }
}
