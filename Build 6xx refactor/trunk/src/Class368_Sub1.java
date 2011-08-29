/* Class368_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class368_Sub1 extends Class368
{
    private boolean aBoolean5679;
    private int anInt5680;
    private boolean aBoolean5681;
    private int anInt5682 = 0;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_5683;
    private boolean aBoolean5684;
    private int anInt5685;
    private boolean aBoolean5686;
    private int anInt5687;
    static Class44 aClass44_5688 = new Class44();
    private int anInt5689;
    private boolean aBoolean5690;
    private Interface7_Impl2 anInterface7_Impl2_5691;
    private int anInt5692;
    
    static final void method4027(int argument, int argument_0_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument_0_,
            argument_0_ + 13168,
            (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    final int method4019() {
	return anInt5680;
    }
    
    final int method4022() {
	return anInt5689;
    }
    
    private final void method4028
	(int argument_1_, int argument_2_, int argument_3_, int argument_4_,
	 int[] argument_5_, int argument_6_, int argument_7_) {
	anInterface7_Impl2_5691.method15(argument_2_, (byte) 127, argument_3_,
					 argument_5_, argument_7_, argument_4_,
					 argument_6_, argument_1_);
    }
    
    final int method4018() {
	return anInt5682 + anInt5692 + anInt5689;
    }
    
    final void method4017(int[] argument_8_) {
	argument_8_[3] = anInt5682;
	argument_8_[1] = anInt5692;
	argument_8_[0] = anInt5685;
	argument_8_[2] = anInt5687;
    }
    
    public static void method4029(byte argument) {
	aClass44_5688 = null;
    }
    
    final void method4003(int argument_9_, int argument_10_,
			  int argument_11_) {
	int[] anLocalInts = aClass_ha_Sub2_5683.getPixels(argument_9_, argument_10_, anInt5680, anInt5689);
	int[] anLocalInts_12_ = new int[anInt5689 * anInt5680];
	anInterface7_Impl2_5691.method23(0, anInt5689, anInt5680, 0,
					 anLocalInts_12_, 0, 3839);
	if (argument_11_ == 0) {
	    for (int anLocalInt = 0; anLocalInt < anInt5689; anLocalInt++) {
		int anLocalInt_13_ = anLocalInt * anInt5680;
		for (int anLocalInt_14_ = 0; anLocalInt_14_ < anInt5680;
		     anLocalInt_14_++)
		    anLocalInts_12_[anLocalInt_14_ + anLocalInt_13_]
			= (MathStatics.OR(MathStatics.AND(16777215, (anLocalInts_12_[(anLocalInt_13_ + anLocalInt_14_)])), MathStatics.AND((anLocalInts[(anLocalInt_13_ + anLocalInt_14_)]) << 8, -16777053)));
	    }
	} else if (argument_11_ != 1) {
	    if (argument_11_ == 2) {
		for (int anLocalInt = 0; anInt5689 > anLocalInt;
		     anLocalInt++) {
		    int anLocalInt_15_ = anLocalInt * anInt5680;
		    for (int anLocalInt_16_ = 0; anInt5680 > anLocalInt_16_;
			 anLocalInt_16_++)
			anLocalInts_12_[anLocalInt_16_ + anLocalInt_15_]
			    = (MathStatics.OR(MathStatics.AND((anLocalInts_12_[(anLocalInt_15_ + anLocalInt_16_)]), 16777215), (MathStatics.AND(656716287, (anLocalInts[(anLocalInt_16_ + anLocalInt_15_)])) << 24)));
		}
	    } else if (argument_11_ == 3) {
		for (int anLocalInt = 0; anLocalInt < anInt5689;
		     anLocalInt++) {
		    int anLocalInt_17_ = anLocalInt * anInt5680;
		    for (int anLocalInt_18_ = 0; anInt5680 > anLocalInt_18_;
			 anLocalInt_18_++)
			anLocalInts_12_[anLocalInt_18_ + anLocalInt_17_]
			    = (MathStatics.OR((anLocalInts[anLocalInt_17_ + anLocalInt_18_] != 0) ? -16777216 : 0, (MathStatics.AND(16777215, (anLocalInts_12_[anLocalInt_17_ + anLocalInt_18_])))));
		}
	    }
	} else {
	    for (int anLocalInt = 0; anLocalInt < anInt5689; anLocalInt++) {
		int anLocalInt_19_ = anInt5680 * anLocalInt;
		for (int anLocalInt_20_ = 0; anLocalInt_20_ < anInt5680;
		     anLocalInt_20_++)
		    anLocalInts_12_[anLocalInt_20_ + anLocalInt_19_]
			= (MathStatics.OR(MathStatics.AND(16777215, (anLocalInts_12_[(anLocalInt_20_ + anLocalInt_19_)])), MathStatics.AND((anLocalInts[(anLocalInt_19_ + anLocalInt_20_)]), -1686765824) << 16));
	    }
	}
	method4028(0, 0, anInt5680, anInt5689, anLocalInts_12_, 0, anInt5680);
    }
    
    final void method4024(int argument_21_, int argument_22_, int argument_23_,
			  int argument_24_) {
	anInt5687 = argument_23_;
	anInt5682 = argument_24_;
	anInt5685 = argument_21_;
	anInt5692 = argument_22_;
	aBoolean5681 = (anInt5685 != 0 || anInt5692 != 0 || anInt5687 != 0
			|| anInt5682 != 0);
    }
    
    final void method4013(int argument_25_, int argument_26_, int argument_27_,
			  int argument_28_, int argument_29_,
			  int argument_30_) {
	int[] anLocalInts = aClass_ha_Sub2_5683.getPixels(argument_29_, argument_30_, argument_27_, argument_28_);
	if (anLocalInts != null) {
	    for (int anLocalInt = 0; anLocalInts.length > anLocalInt;
		 anLocalInt++)
		anLocalInts[anLocalInt]
		    = MathStatics.OR(anLocalInts[anLocalInt], -16777216);
	    method4028(argument_25_, argument_26_, argument_27_, argument_28_,
		       anLocalInts, 0, argument_27_);
	}
    }
    
    final void method4008(float argument_31_, float argument_32_,
			  float argument_33_, float argument_34_,
			  float argument_35_, float argument_36_,
			  int argument_37_, int argument_38_, int argument_39_,
			  int argument_40_) {
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 119);
	Class350_Sub2 class350_sub2_41_
	    = aClass_ha_Sub2_5683.method2219((byte) -110);
	anInterface7_Impl2_5691.method33(-123, ((!aBoolean5686 && !aBoolean5679
						 && (argument_40_ & 0x1) != 0)
						? Statics.aClass382_854
						: Class388.aClass382_3278));
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, argument_39_);
	aClass_ha_Sub2_5683.method2216((byte) 113, argument_37_);
	aClass_ha_Sub2_5683.method2229((byte) -64, GlMultiTexSourceEnum.CONSTANT,
				       1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.CONSTANT, -111);
	aClass_ha_Sub2_5683.method2246(argument_38_, 1);
	if (aBoolean5681) {
	    float f = (float) getWidth();
	    float f_42_ = (float) method4018();
	    float f_43_ = (argument_33_ - argument_31_) / f;
	    float f_44_ = (argument_34_ - argument_32_) / f;
	    float f_45_ = (argument_35_ - argument_31_) / f_42_;
	    float f_46_ = (-argument_32_ + argument_36_) / f_42_;
	    float f_47_ = (float) anInt5692 * f_45_;
	    float f_48_ = f_46_ * (float) anInt5692;
	    float f_49_ = (float) anInt5685 * f_43_;
	    float f_50_ = (float) anInt5685 * f_44_;
	    float f_51_ = (float) anInt5687 * -f_43_;
	    float f_52_ = (float) anInt5687 * -f_44_;
	    float f_53_ = (float) anInt5682 * -f_45_;
	    float f_54_ = -f_46_ * (float) anInt5682;
	    argument_34_ = f_48_ + (argument_34_ + f_52_);
	    argument_31_ = f_47_ + (f_49_ + argument_31_);
	    argument_33_ = argument_33_ + f_51_ + f_47_;
	    argument_32_ = f_50_ + argument_32_ + f_48_;
	    argument_35_ = f_53_ + (f_49_ + argument_35_);
	    argument_36_ = f_50_ + argument_36_ + f_54_;
	}
	class350_sub2.method3860(0.0F, -argument_31_ + argument_35_,
				 -argument_32_ + argument_34_, 0, 0.0F,
				 argument_36_ - argument_32_, 0.0F, 0.0F,
				 -argument_31_ + argument_33_, 1.0F);
	class350_sub2.method3864(18645, 0.0F, argument_32_, argument_31_);
	class350_sub2_41_.method3853((byte) 125,
				     anInterface7_Impl2_5691
					 .method18(-18982, (float) anInt5680),
				     1.0F,
				     anInterface7_Impl2_5691
					 .method22(122, (float) anInt5689));
	aClass_ha_Sub2_5683.method2171(105, Class95.aClass81_723);
	aClass_ha_Sub2_5683.method2222(11570);
	aClass_ha_Sub2_5683.method2188(-27539);
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) 104,
				       GlMultiTexSourceEnum.PREVIOUS, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.PREVIOUS, -79);
    }
    
    final void method4007(int argument_55_, int argument_56_,
			  Class_aa argument_57_, int argument_58_,
			  int argument_59_) {
	Class_aa_Sub2 class_aa_sub2 = (Class_aa_Sub2) argument_57_;
	Interface7_Impl2 interface7_impl2
	    = ((Class_aa_Sub2) class_aa_sub2).anInterface7_Impl2_3751;
	argument_56_ += anInt5692;
	argument_55_ += anInt5685;
	anInterface7_Impl2_5691.method33(-125, Class388.aClass382_3278);
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, 1);
	aClass_ha_Sub2_5683.method2216((byte) -112, 1);
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 94);
	class350_sub2.method3853((byte) 109, (float) anInt5680, 0.0F,
				 (float) anInt5689);
	class350_sub2.method3835(argument_55_, argument_56_, 0);
	aClass_ha_Sub2_5683.method2222(11570);
	Class350_Sub2 class350_sub2_60_
	    = aClass_ha_Sub2_5683.method2219((byte) -123);
	class350_sub2_60_.method3853((byte) -109,
				     anInterface7_Impl2_5691
					 .method18(-18982, (float) anInt5680),
				     1.0F,
				     anInterface7_Impl2_5691
					 .method22(-13, (float) anInt5689));
	aClass_ha_Sub2_5683.method2171(21, Class95.aClass81_723);
	aClass_ha_Sub2_5683.setActiveTexture(1);
	aClass_ha_Sub2_5683.method2237(true, interface7_impl2);
	aClass_ha_Sub2_5683.method2228(CombineModeEnum.MODULATE,
				       CombineModeEnum.REPLACE, -109);
	aClass_ha_Sub2_5683.method2229((byte) -117,
				       GlMultiTexSourceEnum.PREVIOUS, 0);
	Class350_Sub2 class350_sub2_61_
	    = aClass_ha_Sub2_5683.method2219((byte) -107);
	class350_sub2_61_.method3853
	    ((byte) 127, interface7_impl2.method18(-18982, (float) anInt5680),
	     1.0F, interface7_impl2.method22(-34, (float) anInt5689));
	class350_sub2_61_.method3864
	    (18645, 0.0F,
	     interface7_impl2.method22(122,
				       (float) (argument_56_ - argument_59_)),
	     interface7_impl2.method18(-18982, (float) (-argument_58_
							+ argument_55_)));
	aClass_ha_Sub2_5683.method2171(97, Class95.aClass81_723);
	aClass_ha_Sub2_5683.method2188(-27539);
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) -29,
				       GlMultiTexSourceEnum.TEXTURE, 0);
	aClass_ha_Sub2_5683.method2228(CombineModeEnum.MODULATE,
				       CombineModeEnum.MODULATE, -87);
	aClass_ha_Sub2_5683.method2237(true, null);
	aClass_ha_Sub2_5683.setActiveTexture(0);
	aClass_ha_Sub2_5683.method2217((byte) -57);
    }
    
    final void method4002(int argument_62_, int argument_63_, int argument_64_,
			  int argument_65_, int argument_66_, int argument_67_,
			  int argument_68_) {
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 74);
	Class350_Sub2 class350_sub2_69_
	    = aClass_ha_Sub2_5683.method2219((byte) -103);
	anInterface7_Impl2_5691.method33(-106, Class388.aClass382_3278);
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, argument_68_);
	aClass_ha_Sub2_5683.method2216((byte) 96, argument_66_);
	aClass_ha_Sub2_5683.method2229((byte) -112,
				       GlMultiTexSourceEnum.CONSTANT, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.CONSTANT, -119);
	aClass_ha_Sub2_5683.method2246(argument_67_, 1);
	boolean anLocalBoolean
	    = aBoolean5690 && anInt5692 == 0 && anInt5682 == 0;
	boolean anLocalBoolean_70_
	    = aBoolean5684 && anInt5685 == 0 && anInt5687 == 0;
	if (!(anLocalBoolean_70_ & anLocalBoolean)) {
	    if (!anLocalBoolean_70_) {
		if (anLocalBoolean) {
		    int anLocalInt = argument_64_ + argument_62_;
		    int anLocalInt_71_ = getWidth();
		    class350_sub2_69_.method3853
			((byte) -103,
			 anInterface7_Impl2_5691.method18(-18982,
							  (float) anInt5680),
			 1.0F,
			 anInterface7_Impl2_5691
			     .method22(125, (float) argument_65_));
		    aClass_ha_Sub2_5683.method2171(84, Class95.aClass81_723);
		    int anLocalInt_72_ = argument_62_ + anInt5685;
		    int anLocalInt_73_ = anInt5680 + anLocalInt_72_;
		    while (anLocalInt >= anLocalInt_73_) {
			class350_sub2.method3853((byte) 42, (float) anInt5680,
						 0.0F, (float) argument_65_);
			class350_sub2.method3835(anLocalInt_72_, argument_63_,
						 0);
			aClass_ha_Sub2_5683.method2222(11570);
			anLocalInt_73_ += anLocalInt_71_;
			anLocalInt_72_ += anLocalInt_71_;
			aClass_ha_Sub2_5683.method2188(-27539);
		    }
		    if (anLocalInt_72_ < anLocalInt) {
			int anLocalInt_74_ = anLocalInt - anLocalInt_72_;
			class350_sub2_69_.method3853
			    ((byte) 103,
			     anInterface7_Impl2_5691
				 .method18(-18982, (float) anLocalInt_74_),
			     1.0F,
			     anInterface7_Impl2_5691
				 .method22(124, (float) argument_65_));
			aClass_ha_Sub2_5683.method2171(24,
						       Class95.aClass81_723);
			class350_sub2.method3853((byte) 117,
						 (float) anLocalInt_74_, 0.0F,
						 (float) argument_65_);
			class350_sub2.method3835(anLocalInt_72_, argument_63_,
						 0);
			aClass_ha_Sub2_5683.method2222(11570);
			aClass_ha_Sub2_5683.method2188(-27539);
		    }
		} else {
		    int anLocalInt = argument_63_ + argument_65_;
		    int anLocalInt_75_ = argument_62_ + argument_64_;
		    int anLocalInt_76_ = getWidth();
		    int anLocalInt_77_ = method4018();
		    int anLocalInt_78_ = anInt5692 + argument_63_;
		    for (int anLocalInt_79_ = anInt5689 + anLocalInt_78_;
			 anLocalInt >= anLocalInt_79_;
			 anLocalInt_79_ += anLocalInt_77_) {
			class350_sub2_69_.method3853
			    ((byte) 58,
			     anInterface7_Impl2_5691
				 .method18(-18982, (float) anInt5680),
			     1.0F,
			     anInterface7_Impl2_5691
				 .method22(127, (float) anInt5689));
			aClass_ha_Sub2_5683.method2171(84,
						       Class95.aClass81_723);
			int anLocalInt_80_ = anInt5685 + argument_62_;
			int anLocalInt_81_ = anInt5680 + anLocalInt_80_;
			while (anLocalInt_75_ >= anLocalInt_81_) {
			    class350_sub2.method3853((byte) 103,
						     (float) anInt5680, 0.0F,
						     (float) anInt5689);
			    class350_sub2.method3835(anLocalInt_80_,
						     anLocalInt_78_, 0);
			    aClass_ha_Sub2_5683.method2222(11570);
			    anLocalInt_81_ += anLocalInt_76_;
			    aClass_ha_Sub2_5683.method2188(-27539);
			    anLocalInt_80_ += anLocalInt_76_;
			}
			if (anLocalInt_75_ > anLocalInt_80_) {
			    int anLocalInt_82_
				= -anLocalInt_80_ + anLocalInt_75_;
			    class350_sub2_69_.method3853
				((byte) 45,
				 anInterface7_Impl2_5691
				     .method18(-18982, (float) anLocalInt_82_),
				 1.0F,
				 anInterface7_Impl2_5691
				     .method22(124, (float) anInt5689));
			    aClass_ha_Sub2_5683
				.method2171(76, Class95.aClass81_723);
			    class350_sub2.method3853((byte) 118,
						     (float) anLocalInt_82_,
						     0.0F, (float) anInt5689);
			    class350_sub2.method3835(anLocalInt_80_,
						     anLocalInt_78_, 0);
			    aClass_ha_Sub2_5683.method2222(11570);
			    aClass_ha_Sub2_5683.method2188(-27539);
			}
			anLocalInt_78_ += anLocalInt_77_;
		    }
		    if (anLocalInt_78_ < anLocalInt) {
			int anLocalInt_83_ = -anLocalInt_78_ + anLocalInt;
			class350_sub2_69_.method3853
			    ((byte) -85,
			     anInterface7_Impl2_5691
				 .method18(-18982, (float) anInt5680),
			     1.0F,
			     anInterface7_Impl2_5691
				 .method22(15, (float) anLocalInt_83_));
			aClass_ha_Sub2_5683.method2171(35,
						       Class95.aClass81_723);
			int anLocalInt_84_ = anInt5685 + argument_62_;
			int anLocalInt_85_ = anLocalInt_84_ + anInt5680;
			while (anLocalInt_85_ <= anLocalInt_75_) {
			    class350_sub2.method3853((byte) 98,
						     (float) anInt5680, 0.0F,
						     (float) anLocalInt_83_);
			    class350_sub2.method3835(anLocalInt_84_,
						     anLocalInt_78_, 0);
			    aClass_ha_Sub2_5683.method2222(11570);
			    anLocalInt_85_ += anLocalInt_76_;
			    anLocalInt_84_ += anLocalInt_76_;
			    aClass_ha_Sub2_5683.method2188(-27539);
			}
			if (anLocalInt_84_ < anLocalInt_75_) {
			    int anLocalInt_86_
				= anLocalInt_75_ - anLocalInt_84_;
			    class350_sub2_69_.method3853
				((byte) -103,
				 anInterface7_Impl2_5691
				     .method18(-18982, (float) anLocalInt_86_),
				 1.0F,
				 anInterface7_Impl2_5691
				     .method22(-29, (float) anLocalInt_83_));
			    aClass_ha_Sub2_5683
				.method2171(31, Class95.aClass81_723);
			    class350_sub2.method3853((byte) -125,
						     (float) anLocalInt_86_,
						     0.0F,
						     (float) anLocalInt_83_);
			    class350_sub2.method3835(anLocalInt_84_,
						     anLocalInt_78_, 0);
			    aClass_ha_Sub2_5683.method2222(11570);
			    aClass_ha_Sub2_5683.method2188(-27539);
			}
		    }
		}
	    } else {
		int anLocalInt = argument_63_ + argument_65_;
		int anLocalInt_87_ = method4018();
		class350_sub2_69_.method3853
		    ((byte) -122,
		     anInterface7_Impl2_5691.method18(-18982,
						      (float) argument_64_),
		     1.0F,
		     anInterface7_Impl2_5691.method22(125, (float) anInt5689));
		aClass_ha_Sub2_5683.method2171(112, Class95.aClass81_723);
		int anLocalInt_88_ = argument_63_ + anInt5692;
		for (int anLocalInt_89_ = anLocalInt_88_ + anInt5689;
		     anLocalInt >= anLocalInt_89_;
		     anLocalInt_89_ += anLocalInt_87_) {
		    class350_sub2.method3853((byte) -116, (float) argument_64_,
					     0.0F, (float) anInt5689);
		    class350_sub2.method3835(argument_62_, anLocalInt_88_, 0);
		    aClass_ha_Sub2_5683.method2222(11570);
		    anLocalInt_88_ += anLocalInt_87_;
		    aClass_ha_Sub2_5683.method2188(-27539);
		}
		if (anLocalInt_88_ < anLocalInt) {
		    int anLocalInt_90_ = anLocalInt - anLocalInt_88_;
		    class350_sub2_69_.method3853
			((byte) -115,
			 anInterface7_Impl2_5691
			     .method18(-18982, (float) argument_64_),
			 1.0F,
			 anInterface7_Impl2_5691
			     .method22(-107, (float) anLocalInt_90_));
		    aClass_ha_Sub2_5683.method2171(95, Class95.aClass81_723);
		    class350_sub2.method3853((byte) -119, (float) argument_64_,
					     0.0F, (float) anLocalInt_90_);
		    class350_sub2.method3835(argument_62_, anLocalInt_88_, 0);
		    aClass_ha_Sub2_5683.method2222(11570);
		    aClass_ha_Sub2_5683.method2188(-27539);
		}
	    }
	} else {
	    class350_sub2_69_.method3853
		((byte) 99,
		 anInterface7_Impl2_5691.method18(-18982,
						  (float) argument_64_),
		 1.0F,
		 anInterface7_Impl2_5691.method22(127, (float) argument_65_));
	    class350_sub2.method3853((byte) -78, (float) argument_64_, 0.0F,
				     (float) argument_65_);
	    class350_sub2.method3835(argument_62_, argument_63_, 0);
	    aClass_ha_Sub2_5683.method2171(120, Class95.aClass81_723);
	    aClass_ha_Sub2_5683.method2222(11570);
	    aClass_ha_Sub2_5683.method2188(-27539);
	}
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) 115,
				       GlMultiTexSourceEnum.PREVIOUS, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.PREVIOUS, -77);
    }
    
    final int getWidth() {
	return anInt5680 + anInt5685 + anInt5687;
    }
    
    final void method4010(float argument_91_, float argument_92_,
			  float argument_93_, float argument_94_,
			  float argument_95_, float argument_96_,
			  int argument_97_, Class_aa argument_98_,
			  int argument_99_, int argument_100_) {
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 91);
	Class350_Sub2 class350_sub2_101_
	    = aClass_ha_Sub2_5683.method2219((byte) -116);
	Class_aa_Sub2 class_aa_sub2 = (Class_aa_Sub2) argument_98_;
	Interface7_Impl2 interface7_impl2
	    = ((Class_aa_Sub2) class_aa_sub2).anInterface7_Impl2_3751;
	anInterface7_Impl2_5691.method33(-118, ((aBoolean5686 || aBoolean5679
						 || (argument_97_ & 0x1) == 0)
						? Class388.aClass382_3278
						: Statics.aClass382_854));
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, 1);
	aClass_ha_Sub2_5683.method2216((byte) 37, 1);
	if (!aBoolean5681) {
	    class350_sub2.method3860(0.0F, -argument_91_ + argument_95_,
				     argument_94_ - argument_92_, 0, 0.0F,
				     -argument_92_ + argument_96_, 0.0F, 0.0F,
				     argument_93_ - argument_91_, 1.0F);
	    class350_sub2.method3864(18645, 0.0F, argument_92_, argument_91_);
	} else {
	    float f = (float) anInt5680 / (float) getWidth();
	    float f_102_ = (float) anInt5689 / (float) method4018();
	    class350_sub2.method3860(0.0F,
				     f_102_ * (argument_95_ - argument_91_),
				     (-argument_92_ + argument_94_) * f, 0,
				     0.0F,
				     f_102_ * (argument_96_ - argument_92_),
				     0.0F, 0.0F,
				     (argument_93_ - argument_91_) * f, 1.0F);
	    class350_sub2.method3864(18645, 0.0F,
				     f_102_ * (argument_92_
					       + (float) anInt5692),
				     (argument_91_ + (float) anInt5685) * f);
	}
	class350_sub2_101_.method3853((byte) 43,
				      anInterface7_Impl2_5691
					  .method18(-18982, (float) anInt5680),
				      1.0F,
				      anInterface7_Impl2_5691
					  .method22(124, (float) anInt5689));
	aClass_ha_Sub2_5683.method2171(19, Class95.aClass81_723);
	aClass_ha_Sub2_5683.setActiveTexture(1);
	aClass_ha_Sub2_5683.method2237(true, interface7_impl2);
	aClass_ha_Sub2_5683.method2228(CombineModeEnum.MODULATE,
				       CombineModeEnum.REPLACE, -90);
	aClass_ha_Sub2_5683.method2229((byte) -99,
				       GlMultiTexSourceEnum.PREVIOUS, 0);
	Class350_Sub2 class350_sub2_103_
	    = aClass_ha_Sub2_5683.method2219((byte) -114);
	class350_sub2_103_.method3838(class350_sub2);
	class350_sub2_103_.method3835(-argument_99_, -argument_100_, 0);
	class350_sub2_103_.method3849(-102, 1.0F,
				      interface7_impl2.method22(122, 1.0F),
				      interface7_impl2.method18(-18982, 1.0F));
	aClass_ha_Sub2_5683.method2171(36, Class95.aClass81_723);
	aClass_ha_Sub2_5683.method2222(11570);
	aClass_ha_Sub2_5683.method2188(-27539);
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) 116,
				       GlMultiTexSourceEnum.TEXTURE, 0);
	aClass_ha_Sub2_5683.method2228(CombineModeEnum.MODULATE,
				       CombineModeEnum.MODULATE, 96);
	aClass_ha_Sub2_5683.method2237(true, null);
	aClass_ha_Sub2_5683.setActiveTexture(0);
	aClass_ha_Sub2_5683.method2217((byte) -57);
    }
    
    final void method4004(int argument_104_, int argument_105_,
			  int argument_106_, int argument_107_,
			  int argument_108_) {
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 115);
	Class350_Sub2 class350_sub2_109_
	    = aClass_ha_Sub2_5683.method2219((byte) -118);
	argument_105_ += anInt5692;
	argument_104_ += anInt5685;
	anInterface7_Impl2_5691.method33(-110, Class388.aClass382_3278);
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, argument_108_);
	aClass_ha_Sub2_5683.method2216((byte) 79, argument_106_);
	aClass_ha_Sub2_5683.method2229((byte) -100,
				       GlMultiTexSourceEnum.CONSTANT, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.CONSTANT, -110);
	aClass_ha_Sub2_5683.method2246(argument_107_, 1);
	class350_sub2.method3853((byte) 81, (float) anInt5680, 0.0F,
				 (float) anInt5689);
	class350_sub2.method3835(argument_104_, argument_105_, 0);
	class350_sub2_109_.method3853((byte) -101,
				      anInterface7_Impl2_5691
					  .method18(-18982, (float) anInt5680),
				      1.0F,
				      anInterface7_Impl2_5691
					  .method22(1, (float) anInt5689));
	aClass_ha_Sub2_5683.method2171(76, Class95.aClass81_723);
	aClass_ha_Sub2_5683.method2222(11570);
	aClass_ha_Sub2_5683.method2188(-27539);
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) -128,
				       GlMultiTexSourceEnum.PREVIOUS, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.PREVIOUS,
				       -120);
    }
    
    final void method4012(int argument_110_, int argument_111_,
			  int argument_112_, int argument_113_,
			  int argument_114_, int argument_115_,
			  int argument_116_, int argument_117_) {
	Class350_Sub2 class350_sub2
	    = aClass_ha_Sub2_5683.method2187((byte) 96);
	Class350_Sub2 class350_sub2_118_
	    = aClass_ha_Sub2_5683.method2219((byte) -123);
	anInterface7_Impl2_5691.method33(-107, ((aBoolean5686 || aBoolean5679
						 || (argument_117_ & 0x1) == 0)
						? Class388.aClass382_3278
						: Statics.aClass382_854));
	aClass_ha_Sub2_5683.method2183(4);
	aClass_ha_Sub2_5683.method2237(true, anInterface7_Impl2_5691);
	aClass_ha_Sub2_5683.method2147(0, argument_116_);
	aClass_ha_Sub2_5683.method2216((byte) 72, argument_114_);
	aClass_ha_Sub2_5683.method2229((byte) -56, GlMultiTexSourceEnum.CONSTANT,
				       1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.CONSTANT, -127);
	aClass_ha_Sub2_5683.method2246(argument_115_, 1);
	class350_sub2_118_.method3853((byte) -110,
				      anInterface7_Impl2_5691
					  .method18(-18982, (float) anInt5680),
				      1.0F,
				      anInterface7_Impl2_5691
					  .method22(121, (float) anInt5689));
	if (aBoolean5681) {
	    argument_112_ = argument_112_ * anInt5680 / getWidth();
	    argument_113_ = argument_113_ * anInt5689 / method4018();
	    argument_110_ += argument_112_ * anInt5685 / anInt5680;
	    argument_111_ += argument_113_ * anInt5692 / anInt5689;
	}
	class350_sub2.method3853((byte) -88, (float) argument_112_, 0.0F,
				 (float) argument_113_);
	class350_sub2.method3835(argument_110_, argument_111_, 0);
	aClass_ha_Sub2_5683.method2171(120, Class95.aClass81_723);
	aClass_ha_Sub2_5683.method2222(11570);
	aClass_ha_Sub2_5683.method2188(-27539);
	aClass_ha_Sub2_5683.method2217((byte) -57);
	aClass_ha_Sub2_5683.method2229((byte) 113,
				       GlMultiTexSourceEnum.PREVIOUS, 1);
	aClass_ha_Sub2_5683.method2224(1, GlMultiTexSourceEnum.PREVIOUS,
				       -103);
    }
    
    Class368_Sub1(GraphicsToolkit_Sub2 argument_119_, int argument_120_,
		  int argument_121_, boolean argument_122_) {
	aBoolean5681 = false;
	anInt5685 = 0;
	anInt5687 = 0;
	anInt5692 = 0;
	anInt5680 = argument_120_;
	anInt5689 = argument_121_;
	aClass_ha_Sub2_5683 = argument_119_;
	anInterface7_Impl2_5691
	    = argument_119_.method2242(argument_121_, argument_120_,
				       DataType.BYTE,
				       (!argument_122_
					? Class196.aClass320_1437
					: Applet_Sub1.aClass320_9),
				       18018);
	anInterface7_Impl2_5691.method19(true, true, 30135);
	aBoolean5686
	    = anInterface7_Impl2_5691.method20(false) != argument_120_;
	aBoolean5679
	    = argument_121_ != anInterface7_Impl2_5691.method17((byte) 84);
	aBoolean5684
	    = !aBoolean5686 && anInterface7_Impl2_5691.method16(26244);
	aBoolean5690
	    = !aBoolean5679 && anInterface7_Impl2_5691.method16(26244);
    }
    
    Class368_Sub1(GraphicsToolkit_Sub2 argument_123_, int argument_124_,
		  int argument_125_, int[] argument_126_, int argument_127_,
		  int argument_128_) {
	aBoolean5681 = false;
	anInt5685 = 0;
	anInt5687 = 0;
	anInt5692 = 0;
	anInt5680 = argument_124_;
	anInt5689 = argument_125_;
	aClass_ha_Sub2_5683 = argument_123_;
	anInterface7_Impl2_5691
	    = argument_123_.method2206(argument_128_, argument_126_,
				       argument_124_, argument_127_, false,
				       argument_125_, 9567);
	anInterface7_Impl2_5691.method19(true, true, 30135);
	aBoolean5686
	    = anInterface7_Impl2_5691.method20(false) != argument_124_;
	aBoolean5679
	    = anInterface7_Impl2_5691.method17((byte) 84) != argument_125_;
	aBoolean5684
	    = !aBoolean5686 && anInterface7_Impl2_5691.method16(26244);
	aBoolean5690
	    = !aBoolean5679 && anInterface7_Impl2_5691.method16(26244);
    }
}
