/* Class2_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub6 extends Class2
{
    static int anInt3789;
    static int anInt3790 = -1;
    private boolean aBoolean3791 = false;
    private boolean aBoolean3792;
    private Interface7_Impl3[] anInterface7_Impl3Array3794;
    
    Class2_Sub6(GraphicsToolkit_Sub2 argument_0_) {
	super(argument_0_);
	if (((GraphicsToolkit_Sub2) argument_0_).hasCubeMap) {
	    aBoolean3792 = ((GraphicsToolkit_Sub2) argument_0_).maxTextureUnits < 3;
	    int anLocalInt = !aBoolean3792 ? 127 : 48;
	    int[][] anLocalInts = new int[6][4096];
	    int[][] anLocalInts_1_ = new int[6][4096];
	    int[][] anLocalInts_2_ = new int[6][4096];
	    int anLocalInt_3_ = 0;
	    for (int anLocalInt_4_ = 0; anLocalInt_4_ < 64; anLocalInt_4_++) {
		for (int anLocalInt_5_ = 0; anLocalInt_5_ < 64;
		     anLocalInt_5_++) {
		    float f = (float) anLocalInt_5_ * 2.0F / 64.0F + -1.0F;
		    float f_6_ = (float) anLocalInt_4_ * 2.0F / 64.0F + -1.0F;
		    float f_7_
			= (float) (1.0 / Math.sqrt((double) (f * f + 1.0F
							     + f_6_ * f_6_)));
		    f_6_ *= f_7_;
		    f *= f_7_;
		    for (int anLocalInt_8_ = 0; anLocalInt_8_ < 6;
			 anLocalInt_8_++) {
			float f_9_;
			if (anLocalInt_8_ != 0) {
			    if (anLocalInt_8_ == 1)
				f_9_ = f;
			    else if (anLocalInt_8_ != 2) {
				if (anLocalInt_8_ != 3) {
				    if (anLocalInt_8_ != 4)
					f_9_ = -f_7_;
				    else
					f_9_ = f_7_;
				} else
				    f_9_ = -f_6_;
			    } else
				f_9_ = f_6_;
			} else
			    f_9_ = -f;
			int anLocalInt_10_;
			int anLocalInt_11_;
			int anLocalInt_12_;
			if (f_9_ > 0.0F) {
			    anLocalInt_10_
				= (int) ((double) anLocalInt
					 * Math.pow((double) f_9_, 96.0));
			    anLocalInt_11_
				= (int) (Math.pow((double) f_9_, 36.0)
					 * (double) anLocalInt);
			    anLocalInt_12_
				= (int) (Math.pow((double) f_9_, 12.0)
					 * (double) anLocalInt);
			} else
			    anLocalInt_10_ = anLocalInt_11_
				= anLocalInt_12_ = 0;
			anLocalInts_1_[anLocalInt_8_][anLocalInt_3_]
			    = anLocalInt_10_ << 24;
			anLocalInts_2_[anLocalInt_8_][anLocalInt_3_]
			    = anLocalInt_11_ << 24;
			anLocalInts[anLocalInt_8_][anLocalInt_3_]
			    = anLocalInt_12_ << 24;
		    }
		    anLocalInt_3_++;
		}
	    }
	    anInterface7_Impl3Array3794 = new Interface7_Impl3[3];
	    anInterface7_Impl3Array3794[0]
		= ((Class2) this).aClass_ha_Sub2_56
		      .method2220((byte) 106, false, 64, anLocalInts_1_);
	    anInterface7_Impl3Array3794[1]
		= ((Class2) this).aClass_ha_Sub2_56
		      .method2220((byte) 94, false, 64, anLocalInts_2_);
	    anInterface7_Impl3Array3794[2]
		= ((Class2) this).aClass_ha_Sub2_56
		      .method2220((byte) 102, false, 64, anLocalInts);
	}
    }
    
    final void method186(int argument_13_, int argument_14_,
			 boolean argument_15_) {
	if (aBoolean3791) {
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56.method2237
		(true, anInterface7_Impl3Array3794[argument_13_ - 1]);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	}
	if (argument_15_ != true)
	    anInt3789 = 53;
    }
    
    public static void method203(int argument) {
	client.randomFile = null;
    }
    
    static final Class77 method204(int argument, int argument_16_) {
	if (argument < 0 || argument >= 100)
	    return null;
	return Class62_Sub1.aClass77Array4363[argument];
    }
    
    final void method189(int argument_17_, boolean argument_18_) {
	((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
						      .REPLACE),
						     CombineModeEnum.MODULATE,
						     70);
	if (argument_17_ != 22789)
	    anInt3789 = -120;
    }
    
    final void method196(int argument_19_, byte argument_20_,
			 Interface7 argument_21_) {
	((Class2) this).aClass_ha_Sub2_56.method2237(true, argument_21_);
	((Class2) this).aClass_ha_Sub2_56.method2216((byte) -99, argument_19_);
	int anLocalInt = 109 / ((60 - argument_20_) / 61);
    }
    
    final void method193(boolean argument_22_, int argument_23_) {
	if (argument_23_ != 2)
	    method196(66, (byte) -12, null);
	if (anInterface7_Impl3Array3794 != null && argument_22_) {
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56
		.setupTexcoordGeneration(58, TexGenEnum.NORMAL_MAP);
	    Class350_Sub2 class350_sub2
		= ((Class2) this).aClass_ha_Sub2_56.method2219((byte) -111);
	    class350_sub2.method3841(1024);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2171(40, Class253_Sub3.aClass81_5677);
	    if (aBoolean3792) {
		((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
							      .REPLACE),
							     (CombineModeEnum
							      .ADD),
							     -63);
		((Class2) this).aClass_ha_Sub2_56.setMultiTexRgbSource(0, true, false, GlMultiTexSourceEnum.TEXTURE, (byte) -67);
		((Class2) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, argument_23_ - 122);
	    } else {
		((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
							      .MODULATE),
							     (CombineModeEnum
							      .REPLACE),
							     -58);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) 97, GlMultiTexSourceEnum.PREVIOUS, 0);
		((Class2) this).aClass_ha_Sub2_56.setActiveTexture(2);
		((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
							      .REPLACE),
							     (CombineModeEnum
							      .ADD),
							     -64);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) 103, GlMultiTexSourceEnum.PREVIOUS, 0);
		((Class2) this).aClass_ha_Sub2_56.setMultiTexRgbSource(1, true, false, (GlMultiTexSourceEnum.PREVIOUS), (byte) -67);
		((Class2) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, argument_23_ - 113);
		((Class2) this).aClass_ha_Sub2_56.method2237
		    (true, (((GraphicsToolkit_Sub2) ((Class2) this).aClass_ha_Sub2_56)
			    .anInterface7_4741));
	    }
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    aBoolean3791 = true;
	} else
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, argument_23_ ^ ~0x62);
    }
    
    final boolean method185(int argument_24_) {
	if (argument_24_ <= 53)
	    method186(82, 12, false);
	return true;
    }
    
    final void method195(byte argument_25_) {
	if (!aBoolean3791)
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.TEXTURE, -84);
	else {
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	    ((Class2) this).aClass_ha_Sub2_56
		.setupTexcoordGeneration(114, TexGenEnum.DISABLED);
	    ((Class2) this).aClass_ha_Sub2_56.method2217((byte) -57);
	    if (aBoolean3792) {
		((Class2) this).aClass_ha_Sub2_56.method2228
		    (CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, 74);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) 112, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class2) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -121);
	    } else {
		((Class2) this).aClass_ha_Sub2_56.method2228
		    (CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, -26);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) 127, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class2) this).aClass_ha_Sub2_56.setActiveTexture(2);
		((Class2) this).aClass_ha_Sub2_56.method2228
		    (CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, -20);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) 96, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class2) this).aClass_ha_Sub2_56
		    .method2229((byte) -90, GlMultiTexSourceEnum.PREVIOUS, 1);
		((Class2) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -123);
		((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	    }
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    aBoolean3791 = false;
	}
	if (argument_25_ < 54)
	    aBoolean3791 = false;
	((Class2) this).aClass_ha_Sub2_56
	    .method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, 83);
    }
    
    static {
	anInt3789 = 0;
    }
}
