/* Class2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2_Sub11 extends Class2
{
    private boolean aBoolean3825 = false;
    static int anInt3826 = 1;
    static int anInt3827 = 0;
    static Class215 aClass215_3829;
    
    Class2_Sub11(GraphicsToolkit_Sub2 argument_0_) {
	super(argument_0_);
    }
    
    final void method186(int argument_1_, int argument_2_,
			 boolean argument_3_) {
	if (argument_3_ != true)
	    method195((byte) 67);
    }
    
    final void method189(int argument_4_, boolean argument_5_) {
	((Class2) this).aClass_ha_Sub2_56.method2228((CombineModeEnum
						      .REPLACE),
						     CombineModeEnum.MODULATE,
						     -58);
	if (argument_4_ != 22789)
	    method189(58, false);
    }
    
    final void method193(boolean argument_6_, int argument_7_) {
	Interface7_Impl3 interface7_impl3
	    = ((Class2) this).aClass_ha_Sub2_56.method2236();
	if (argument_7_ != 2)
	    method215(126, (byte) 73, -24, 112, -99, 44);
	if (interface7_impl3 != null && argument_6_) {
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56.method2237(true,
							 interface7_impl3);
	    ((Class2) this).aClass_ha_Sub2_56
		.setupTexcoordGeneration(58, TexGenEnum.REFLECTION_MAP);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56.method2228
		(CombineModeEnum.REPLACE, CombineModeEnum.INTERPOLATE, -39);
	    ((Class2) this).aClass_ha_Sub2_56.setMultiTexRgbSource(2, true, false, (GlMultiTexSourceEnum.PREVIOUS), (byte) -67);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, -96);
	    Class350_Sub2 class350_sub2
		= ((Class2) this).aClass_ha_Sub2_56.method2219((byte) -124);
	    class350_sub2.method3848(((Class2) this).aClass_ha_Sub2_56
					 .method2144(0),
				     (byte) 88);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2171(argument_7_ ^ 0x55, Class253_Sub3.aClass81_5677);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    aBoolean3825 = true;
	} else
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.PRIMARY_COLOUR, -103);
    }
    
    static final void method213(int argument) {
	FileOnDisk.aClass59_Sub51_Sub9_1454
	    = new MenuAction(MultilanguageString.CANCEL
					 .getLocalizedString(client.language),
				     "", Class62_Sub10.anInt4399, 1004, -1, 0L,
				     0, 0, true, false, 0L, true);
    }
    
    final void method195(byte argument_8_) {
	if (!aBoolean3825)
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.TEXTURE, -107);
	else {
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2) this).aClass_ha_Sub2_56
		.setupTexcoordGeneration(110, TexGenEnum.DISABLED);
	    ((Class2) this).aClass_ha_Sub2_56.method2228
		(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, -30);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2229((byte) -81, GlMultiTexSourceEnum.CONSTANT, 2);
	    ((Class2) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.TEXTURE, -77);
	    ((Class2) this).aClass_ha_Sub2_56.method2217((byte) -57);
	    ((Class2) this).aClass_ha_Sub2_56.method2237(true, null);
	    ((Class2) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    aBoolean3825 = false;
	}
	if (argument_8_ < 54)
	    method186(-95, 104, true);
	((Class2) this).aClass_ha_Sub2_56
	    .method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, 122);
    }
    
    public static void method214(byte argument) {
	aClass215_3829 = null;
    }
    
    static final void method215(int argument, byte argument_9_,
				int argument_10_, int argument_11_,
				int argument_12_, int argument_13_) {
	int anLocalInt = 0;
	int anLocalInt_14_ = argument_13_;
	int anLocalInt_15_ = argument * argument;
	int anLocalInt_16_ = argument_13_ * argument_13_;
	int anLocalInt_17_ = anLocalInt_16_ << 1;
	int anLocalInt_18_ = anLocalInt_15_ << 1;
	int anLocalInt_19_ = argument_13_ << 1;
	int anLocalInt_20_
	    = anLocalInt_17_ + anLocalInt_15_ * (-anLocalInt_19_ + 1);
	int anLocalInt_21_
	    = -((anLocalInt_19_ - 1) * anLocalInt_18_) + anLocalInt_16_;
	int anLocalInt_22_ = anLocalInt_15_ << 2;
	int anLocalInt_23_ = anLocalInt_16_ << 2;
	int anLocalInt_24_ = ((anLocalInt << 1) + 3) * anLocalInt_17_;
	int anLocalInt_25_ = ((anLocalInt_14_ << 1) - 3) * anLocalInt_18_;
	int anLocalInt_26_ = (anLocalInt + 1) * anLocalInt_23_;
	int anLocalInt_27_ = (anLocalInt_14_ - 1) * anLocalInt_22_;
	Statics.method3364(Class223.anIntArrayArray1562[argument_12_], (byte) 86, -argument + argument_11_, argument + argument_11_, argument_10_);
	while (anLocalInt_14_ > 0) {
	    if (anLocalInt_20_ < 0) {
		while (anLocalInt_20_ < 0) {
		    anLocalInt_21_ += anLocalInt_26_;
		    anLocalInt_20_ += anLocalInt_24_;
		    anLocalInt_26_ += anLocalInt_23_;
		    anLocalInt_24_ += anLocalInt_23_;
		    anLocalInt++;
		}
	    }
	    if (anLocalInt_21_ < 0) {
		anLocalInt_20_ += anLocalInt_24_;
		anLocalInt_21_ += anLocalInt_26_;
		anLocalInt_26_ += anLocalInt_23_;
		anLocalInt_24_ += anLocalInt_23_;
		anLocalInt++;
	    }
	    anLocalInt_21_ -= anLocalInt_25_;
	    anLocalInt_20_ -= anLocalInt_27_;
	    anLocalInt_25_ -= anLocalInt_22_;
	    anLocalInt_27_ -= anLocalInt_22_;
	    anLocalInt_14_--;
	    int anLocalInt_28_ = argument_12_ - anLocalInt_14_;
	    int anLocalInt_29_ = argument_12_ + anLocalInt_14_;
	    int anLocalInt_30_ = anLocalInt + argument_11_;
	    int anLocalInt_31_ = -anLocalInt + argument_11_;
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_28_], (byte) 116, anLocalInt_31_, anLocalInt_30_, argument_10_);
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_29_], (byte) -85, anLocalInt_31_, anLocalInt_30_, argument_10_);
	}
    }
    
    final boolean method185(int argument_32_) {
	if (argument_32_ < 53)
	    method186(27, 100, false);
	return true;
    }
    
    final void method196(int argument_33_, byte argument_34_,
			 Interface7 argument_35_) {
	((Class2) this).aClass_ha_Sub2_56.method2237(true, argument_35_);
	int anLocalInt = 86 % ((argument_34_ - 60) / 61);
	((Class2) this).aClass_ha_Sub2_56.method2216((byte) -97, argument_33_);
    }
}
