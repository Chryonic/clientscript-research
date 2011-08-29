/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65
{
    private Class353[] aClass353Array454;
    static Class_s[] aClass_sArray455;
    Class353_Sub1 aClass353_Sub1_456;
    private int anInt457 = 0;
    private int anInt459 = 0;
    private GlToolkit aClass_ha_Sub3_460;
    private Class208 aClass208_461;
    private int anInt462 = 0;
    
    final boolean method1488(GlTexture argument_0_, int argument_2_) {
	if (anInt462 == 0)
	    return false;
	aClass353Array454[anInt462 & 0x7fffffff].method3882(9, argument_0_,
							    argument_2_);
	return true;
    }
    
    final void method1489(int argument_3_, int argument_4_,
			  boolean argument_5_, int argument_6_,
			  int argument_7_, boolean argument_8_) {
	argument_5_ &= aClass_ha_Sub3_460.method2075();
	if (!argument_5_
	    && (argument_6_ == 4 || argument_6_ == 8 || argument_6_ == 9)) {
	    if (argument_6_ == 4)
		argument_7_ = argument_3_;
	    argument_6_ = 2;
	}
	if (argument_6_ != 0 && argument_8_)
	    argument_6_ |= ~0x7fffffff;
	if (argument_6_ != anInt462) {
	    if (anInt462 != 0)
		aClass353Array454[anInt462 & 0x7fffffff].method3891(-1756);
	    if (argument_6_ != 0) {
		aClass353Array454[argument_6_ & 0x7fffffff]
		    .bind(argument_8_, false);
		aClass353Array454[argument_6_ & 0x7fffffff]
		    .method3885(argument_4_ ^ ~0xf47, argument_8_);
		aClass353Array454[argument_6_ & 0x7fffffff]
		    .configure(126, argument_3_, argument_7_);
	    }
	    anInt457 = argument_3_;
	    anInt462 = argument_6_;
	    anInt459 = argument_7_;
	} else if (anInt462 != 0) {
	    aClass353Array454[anInt462 & 0x7fffffff]
		.method3885(argument_4_ ^ ~0xf47, argument_8_);
	    if (anInt457 != argument_3_ || anInt459 != argument_7_) {
		aClass353Array454[anInt462 & 0x7fffffff]
		    .configure(argument_4_ + 4037, argument_3_, argument_7_);
		anInt457 = argument_3_;
		anInt459 = argument_7_;
	    }
	}
	if (argument_4_ != -3912)
	    aClass_ha_Sub3_460 = null;
    }
    
    public static void method1490(int argument) {
	aClass_sArray455 = null;
    }
    
    final boolean method1491(byte argument_9_, int argument_10_) {
	return aClass353Array454[argument_10_].method3890(-6808);
    }
    
    Class65(GlToolkit argument_11_) {
	aClass_ha_Sub3_460 = argument_11_;
	aClass208_461 = new Class208(argument_11_);
	aClass353Array454 = new Class353[10];
	aClass353Array454[1] = new Class353_Sub5(argument_11_);
	aClass353Array454[2] = new Class353_Sub3(argument_11_, aClass208_461);
	aClass353Array454[4] = new Class353_Sub7(argument_11_, aClass208_461);
	aClass353Array454[5] = new Class353_Sub6(argument_11_, aClass208_461);
	aClass353Array454[6] = new Class353_Sub9(argument_11_);
	aClass353Array454[7] = new Class353_Sub2(argument_11_);
	aClass353Array454[3] = ((Class65) this).aClass353_Sub1_456
	    = new Class353_Sub1(argument_11_);
	aClass353Array454[8] = new GlWaterType1(argument_11_, aClass208_461);
	aClass353Array454[9] = new GlWaterType0(argument_11_, aClass208_461);
	if (!aClass353Array454[8].method3890(-6808))
	    aClass353Array454[8] = aClass353Array454[4];
	if (!aClass353Array454[9].method3890(-6808))
	    aClass353Array454[9] = aClass353Array454[8];
    }
}
