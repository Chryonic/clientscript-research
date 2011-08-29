/* Class368 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class368 implements Interface21
{
    abstract void method4002(int argument_0_, int argument_1_, int argument_2_,
			     int argument_3_, int argument_4_, int argument_5_,
			     int argument_6_);
    
    abstract void method4003(int argument_7_, int argument_8_,
			     int argument_9_);
    
    abstract void method4004(int argument_10_, int argument_11_,
			     int argument_12_, int argument_13_,
			     int argument_14_);
    
    abstract int getWidth();
    
    final void method4006(float argument_15_, float argument_16_,
			  int argument_17_, int argument_18_, int argument_19_,
			  int argument_20_, int argument_21_) {
	method4026(argument_15_, argument_16_, (float) getWidth() / 2.0F,
		   (float) method4018() / 2.0F, argument_17_, argument_18_,
		   argument_19_, argument_20_, argument_21_);
    }
    
    abstract void method4007(int argument_22_, int argument_23_,
			     Class_aa argument_24_, int argument_25_,
			     int argument_26_);
    
    abstract void method4008(float argument_27_, float argument_28_,
			     float argument_29_, float argument_30_,
			     float argument_31_, float argument_32_,
			     int argument_33_, int argument_34_,
			     int argument_35_, int argument_36_);
    
    final void method4009(float argument_37_, float argument_38_,
			  int argument_39_, int argument_40_,
			  Class_aa argument_41_, int argument_42_,
			  int argument_43_) {
	method4015(argument_37_, argument_38_, (float) getWidth() / 2.0F,
		   (float) method4018() / 2.0F, argument_39_, argument_40_,
		   argument_41_, argument_42_, argument_43_);
    }
    
    abstract void method4010(float argument_44_, float argument_45_,
			     float argument_46_, float argument_47_,
			     float argument_48_, float argument_49_,
			     int argument_50_, Class_aa argument_51_,
			     int argument_52_, int argument_53_);
    
    final void method4011(int argument_54_, int argument_55_, int argument_56_,
			  int argument_57_) {
	method4012(argument_54_, argument_55_, argument_56_, argument_57_, 1,
		   0, 1, 1);
    }
    
    abstract void method4012(int argument_58_, int argument_59_,
			     int argument_60_, int argument_61_,
			     int argument_62_, int argument_63_,
			     int argument_64_, int argument_65_);
    
    abstract void method4013(int argument_66_, int argument_67_,
			     int argument_68_, int argument_69_,
			     int argument_70_, int argument_71_);
    
    final void method4014(int argument_72_, int argument_73_) {
	method4004(argument_72_, argument_73_, 1, 0, 1);
    }
    
    final void method4015
	(float argument_74_, float argument_75_, float argument_76_,
	 float argument_77_, int argument_78_, int argument_79_,
	 Class_aa argument_80_, int argument_81_, int argument_82_) {
	if (argument_78_ != 0) {
	    double d = (double) (argument_79_ & 0xffff) * 9.587379924285257E-5;
	    float f = (float) Math.sin(d) * (float) argument_78_;
	    float f_83_ = (float) Math.cos(d) * (float) argument_78_;
	    float f_84_
		= ((-argument_76_ * f_83_ + -argument_77_ * f) / 4096.0F
		   + argument_74_);
	    float f_85_ = ((argument_76_ * f + -argument_77_ * f_83_) / 4096.0F
			   + argument_75_);
	    float f_86_ = ((((float) getWidth() - argument_76_) * f_83_
			    + -argument_77_ * f) / 4096.0F
			   + argument_74_);
	    float f_87_ = ((-((float) getWidth() - argument_76_) * f
			    + -argument_77_ * f_83_) / 4096.0F
			   + argument_75_);
	    float f_88_
		= ((-argument_76_ * f_83_
		    + ((float) method4018() - argument_77_) * f) / 4096.0F
		   + argument_74_);
	    float f_89_
		= ((argument_76_ * f
		    + ((float) method4018() - argument_77_) * f_83_) / 4096.0F
		   + argument_75_);
	    method4025(f_84_, f_85_, f_86_, f_87_, f_88_, f_89_, argument_80_,
		       argument_81_, argument_82_);
	}
    }
    
    final void method4016(int argument_90_, int argument_91_, int argument_92_,
			  int argument_93_, int argument_94_, int argument_95_,
			  int argument_96_) {
	method4012(argument_90_, argument_91_, argument_92_, argument_93_,
		   argument_94_, argument_95_, argument_96_, 1);
    }
    
    abstract void method4017(int[] argument_97_);
    
    abstract int method4018();
    
    public Class368() {
	/* empty */
    }
    
    abstract int method4019();
    
    private final void method4020
	(float argument_98_, float argument_99_, float argument_100_,
	 float argument_101_, float argument_102_, float argument_103_,
	 int argument_104_, int argument_105_, int argument_106_) {
	method4008(argument_98_, argument_99_, argument_100_, argument_101_,
		   argument_102_, argument_103_, argument_104_, argument_105_,
		   argument_106_, 1);
    }
    
    final void method4021(float argument_107_, float argument_108_,
			  int argument_109_, int argument_110_) {
	method4026(argument_107_, argument_108_, (float) getWidth() / 2.0F,
		   (float) method4018() / 2.0F, argument_109_, argument_110_,
		   1, 0, 1);
    }
    
    abstract int method4022();
    
    final void method4023(int argument_111_, int argument_112_,
			  int argument_113_, int argument_114_) {
	method4002(argument_111_, argument_112_, argument_113_, argument_114_,
		   1, 0, 1);
    }
    
    abstract void method4024(int argument_115_, int argument_116_,
			     int argument_117_, int argument_118_);
    
    private final void method4025
	(float argument_119_, float argument_120_, float argument_121_,
	 float argument_122_, float argument_123_, float argument_124_,
	 Class_aa argument_125_, int argument_126_, int argument_127_) {
	method4010(argument_119_, argument_120_, argument_121_, argument_122_,
		   argument_123_, argument_124_, 1, argument_125_,
		   argument_126_, argument_127_);
    }
    
    private final void method4026
	(float argument_128_, float argument_129_, float argument_130_,
	 float argument_131_, int argument_132_, int argument_133_,
	 int argument_134_, int argument_135_, int argument_136_) {
	if (argument_132_ != 0) {
	    double d
		= (double) (argument_133_ & 0xffff) * 9.587379924285257E-5;
	    float f = (float) Math.sin(d) * (float) argument_132_;
	    float f_137_ = (float) Math.cos(d) * (float) argument_132_;
	    float f_138_
		= ((-argument_130_ * f_137_ + -argument_131_ * f) / 4096.0F
		   + argument_128_);
	    float f_139_
		= ((argument_130_ * f + -argument_131_ * f_137_) / 4096.0F
		   + argument_129_);
	    float f_140_ = ((((float) getWidth() - argument_130_) * f_137_
			     + -argument_131_ * f) / 4096.0F
			    + argument_128_);
	    float f_141_ = ((-((float) getWidth() - argument_130_) * f
			     + -argument_131_ * f_137_) / 4096.0F
			    + argument_129_);
	    float f_142_
		= ((-argument_130_ * f_137_
		    + ((float) method4018() - argument_131_) * f) / 4096.0F
		   + argument_128_);
	    float f_143_ = ((argument_130_ * f
			     + ((float) method4018() - argument_131_) * f_137_)
			    / 4096.0F) + argument_129_;
	    method4020(f_138_, f_139_, f_140_, f_141_, f_142_, f_143_,
		       argument_134_, argument_135_, argument_136_);
	}
    }
}
