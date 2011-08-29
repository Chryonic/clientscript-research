/* Class368_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class368_Sub2 extends Class368
{
    static int anInt5693;
    private static int anInt5694;
    static int anInt5695;
    static int anInt5696;
    static int anInt5697 = 0;
    int anInt5698;
    private static int anInt5699;
    static int anInt5700;
    static int anInt5701;
    static int anInt5702;
    private static int anInt5703 = 0;
    static int anInt5704;
    private int[] anIntArray5705;
    private static int anInt5706;
    private static int anInt5707;
    int anInt5708;
    static int anInt5709;
    static int anInt5710;
    static int anInt5711;
    static int anInt5712;
    static int anInt5713;
    static int anInt5714;
    int anInt5715;
    int height;
    static int anInt5717;
    int width;
    int anInt5719;
    JavaToolkit toolkit;
    static int anInt5721;
    private static int anInt5722;
    static int anInt5723;
    static int anInt5724;
    static int anInt5725;
    
    abstract void method4030(int[] argument_0_, int[] argument_1_,
			     int argument_2_, int argument_3_);
    
    final void method4017(int[] argument_4_) {
	argument_4_[0] = this.anInt5698;
	argument_4_[1] = this.anInt5719;
	argument_4_[2] = this.anInt5715;
	argument_4_[3] = this.anInt5708;
    }
    
    final void method4010(float argument_5_, float argument_6_,
			  float argument_7_, float argument_8_,
			  float argument_9_, float argument_10_,
			  int argument_11_, Class_aa argument_12_,
			  int argument_13_, int argument_14_) {
	if (this.toolkit.method2100())
	    throw new IllegalStateException();
	if (method4033(argument_5_, argument_6_, argument_7_, argument_8_,
		       argument_9_, argument_10_)) {
	    Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_12_;
	    method4030(class_aa_sub3.anIntArray3757,
		       class_aa_sub3.anIntArray3755,
		       anInt5706 - argument_13_,
		       -argument_14_ - (anInt5700 - anInt5722));
	}
    }
    
    final int method4022() {
	return this.height;
    }
    
    final void method4024(int argument_15_, int argument_16_, int argument_17_,
			  int argument_18_) {
	this.anInt5698 = argument_15_;
	this.anInt5719 = argument_16_;
	this.anInt5715 = argument_17_;
	this.anInt5708 = argument_18_;
    }
    
    abstract void method4004(int argument_19_, int argument_20_,
			     int argument_21_, int argument_22_,
			     int argument_23_);
    
    abstract void method4031(int argument_24_, int argument_25_);
    
    final int method4018() {
	return (this.anInt5719
		+ this.height
		+ this.anInt5708);
    }
    
    final void method4008(float argument_26_, float argument_27_,
			  float argument_28_, float argument_29_,
			  float argument_30_, float argument_31_,
			  int argument_32_, int argument_33_, int argument_34_,
			  int argument_35_) {
	if (this.toolkit.method2100())
	    throw new IllegalStateException();
	if (method4033(argument_26_, argument_27_, argument_28_, argument_29_,
		       argument_30_, argument_31_)) {
	    anInt5693 = argument_33_;
	    if (argument_32_ != 1) {
		anInt5695 = argument_33_ >>> 24;
		anInt5711 = 256 - anInt5695;
		if (argument_32_ == 0) {
		    anInt5702 = (argument_33_ & 0xff0000) >> 16;
		    anInt5714 = (argument_33_ & 0xff00) >> 8;
		    anInt5701 = argument_33_ & 0xff;
		} else if (argument_32_ == 2) {
		    anInt5703 = argument_33_ >>> 24;
		    anInt5694 = 256 - anInt5703;
		    int anLocalInt
			= (argument_33_ & 0xff00ff) * anInt5694 & ~0xff00ff;
		    int anLocalInt_36_
			= (argument_33_ & 0xff00) * anInt5694 & 0xff0000;
		    anInt5697 = (anLocalInt | anLocalInt_36_) >>> 8;
		}
	    }
	    if (argument_32_ == 1) {
		if (argument_34_ == 0)
		    method4031(1, 0);
		else if (argument_34_ == 1)
		    method4031(1, 1);
		else if (argument_34_ == 2)
		    method4031(1, 2);
	    } else if (argument_32_ == 0) {
		if (argument_34_ == 0)
		    method4031(0, 0);
		else if (argument_34_ == 1)
		    method4031(0, 1);
		else if (argument_34_ == 2)
		    method4031(0, 2);
	    } else if (argument_32_ == 3) {
		if (argument_34_ == 0)
		    method4031(3, 0);
		else if (argument_34_ == 1)
		    method4031(3, 1);
		else if (argument_34_ == 2)
		    method4031(3, 2);
	    } else if (argument_32_ == 2) {
		if (argument_34_ == 0)
		    method4031(2, 0);
		else if (argument_34_ == 1)
		    method4031(2, 1);
		else if (argument_34_ == 2)
		    method4031(2, 2);
	    }
	}
    }
    
    final void method4002(int argument_37_, int argument_38_, int argument_39_,
			  int argument_40_, int argument_41_, int argument_42_,
			  int argument_43_) {
	if (this.toolkit.method2100())
	    throw new IllegalStateException();
	if (anIntArray5705 == null)
	    anIntArray5705 = new int[4];
	this.toolkit.getScissor(anIntArray5705);
	this.toolkit.T
	    ((this.toolkit
	      .clipLeft),
	     (this.toolkit
	      .clipTop),
	     argument_37_ + argument_39_, argument_38_ + argument_40_);
	int anLocalInt = getWidth();
	int anLocalInt_44_ = method4018();
	int anLocalInt_45_ = (argument_39_ + anLocalInt - 1) / anLocalInt;
	int anLocalInt_46_
	    = (argument_40_ + anLocalInt_44_ - 1) / anLocalInt_44_;
	for (int anLocalInt_47_ = 0; anLocalInt_47_ < anLocalInt_46_;
	     anLocalInt_47_++) {
	    int anLocalInt_48_ = anLocalInt_47_ * anLocalInt_44_;
	    for (int anLocalInt_49_ = 0; anLocalInt_49_ < anLocalInt_45_;
		 anLocalInt_49_++)
		method4004(argument_37_ + anLocalInt_49_ * anLocalInt,
			   argument_38_ + anLocalInt_48_, argument_41_,
			   argument_42_, argument_43_);
	}
	this.toolkit.setClip(anIntArray5705[0], anIntArray5705[3], anIntArray5705[2], anIntArray5705[1]);
    }
    
    abstract void method4007(int argument_50_, int argument_51_,
			     Class_aa argument_52_, int argument_53_,
			     int argument_54_);
    
    final int getWidth() {
	return (this.anInt5698
		+ this.width
		+ this.anInt5715);
    }
    
    abstract void method4012(int argument_55_, int argument_56_,
			     int argument_57_, int argument_58_,
			     int argument_59_, int argument_60_,
			     int argument_61_, int argument_62_);
    
    abstract void method4032
	(int argument_63_, int argument_64_, int argument_65_,
	 int argument_66_, int argument_67_, int argument_68_,
	 int argument_69_, int argument_70_, int argument_71_);
    
    final int method4019() {
	return this.width;
    }
    
    private final boolean method4033(float argument_72_, float argument_73_,
				     float argument_74_, float argument_75_,
				     float argument_76_, float argument_77_) {
	int anLocalInt = (this.anInt5698
			  + this.width
			  + this.anInt5715);
	int anLocalInt_78_ = (this.anInt5719
			      + this.height
			      + this.anInt5708);
	if (anLocalInt != this.width
	    || anLocalInt_78_ != this.height) {
	    float f = (argument_74_ - argument_72_) / (float) anLocalInt;
	    float f_79_ = (argument_75_ - argument_73_) / (float) anLocalInt;
	    float f_80_
		= (argument_76_ - argument_72_) / (float) anLocalInt_78_;
	    float f_81_
		= (argument_77_ - argument_73_) / (float) anLocalInt_78_;
	    float f_82_ = f_80_ * (float) this.anInt5719;
	    float f_83_ = f_81_ * (float) this.anInt5719;
	    float f_84_ = f * (float) this.anInt5698;
	    float f_85_ = f_79_ * (float) this.anInt5698;
	    float f_86_ = -f * (float) this.anInt5715;
	    float f_87_ = -f_79_ * (float) this.anInt5715;
	    float f_88_ = -f_80_ * (float) this.anInt5708;
	    float f_89_ = -f_81_ * (float) this.anInt5708;
	    argument_72_ += f_84_ + f_82_;
	    argument_73_ += f_85_ + f_83_;
	    argument_74_ += f_86_ + f_82_;
	    argument_75_ += f_87_ + f_83_;
	    argument_76_ += f_84_ + f_88_;
	    argument_77_ += f_85_ + f_89_;
	}
	float f = argument_76_ + (argument_74_ - argument_72_);
	float f_90_ = argument_75_ + (argument_77_ - argument_73_);
	float f_91_;
	float f_92_;
	if (argument_72_ < argument_74_) {
	    f_91_ = argument_72_;
	    f_92_ = argument_74_;
	} else {
	    f_91_ = argument_74_;
	    f_92_ = argument_72_;
	}
	if (argument_76_ < f_91_)
	    f_91_ = argument_76_;
	if (f < f_91_)
	    f_91_ = f;
	if (argument_76_ > f_92_)
	    f_92_ = argument_76_;
	if (f > f_92_)
	    f_92_ = f;
	float f_93_;
	float f_94_;
	if (argument_73_ < argument_75_) {
	    f_93_ = argument_73_;
	    f_94_ = argument_75_;
	} else {
	    f_93_ = argument_75_;
	    f_94_ = argument_73_;
	}
	if (argument_77_ < f_93_)
	    f_93_ = argument_77_;
	if (f_90_ < f_93_)
	    f_93_ = f_90_;
	if (argument_77_ > f_94_)
	    f_94_ = argument_77_;
	if (f_90_ > f_94_)
	    f_94_ = f_90_;
	if (f_91_ < (float) this
					      .toolkit.clipLeft)
	    f_91_ = (float) this
					      .toolkit.clipLeft;
	if (f_92_ > (float) this
					      .toolkit.clipRight)
	    f_92_ = (float) this
					      .toolkit.clipRight;
	if (f_93_ < (float) this
					      .toolkit.clipTop)
	    f_93_ = (float) this
					      .toolkit.clipTop;
	if (f_94_ > (float) this
					      .toolkit.clipBottom)
	    f_94_ = (float) this
					      .toolkit.clipBottom;
	f_92_ = f_91_ - f_92_;
	if (f_92_ >= 0.0F)
	    return false;
	f_94_ = f_93_ - f_94_;
	if (f_94_ >= 0.0F)
	    return false;
	anInt5696
	    = (this.toolkit
	       .width);
	anInt5724 = (int) ((float) ((int) f_93_ * anInt5696) + f_91_);
	float f_95_
	    = ((argument_74_ - argument_72_) * (argument_77_ - argument_73_)
	       - (argument_75_ - argument_73_) * (argument_76_
						  - argument_72_));
	float f_96_
	    = ((argument_76_ - argument_72_) * (argument_75_ - argument_73_)
	       - (argument_77_ - argument_73_) * (argument_74_
						  - argument_72_));
	anInt5717 = (int) ((argument_77_ - argument_73_) * 4096.0F
			   * (float) this.width / f_95_);
	anInt5712 = (int) ((argument_75_ - argument_73_) * 4096.0F
			   * (float) this.height / f_96_);
	anInt5709 = (int) ((argument_76_ - argument_72_) * 4096.0F
			   * (float) this.width / f_96_);
	anInt5723 = (int) ((argument_74_ - argument_72_) * 4096.0F
			   * (float) this.height / f_95_);
	anInt5707 = (int) (f_91_ * 16.0F + 8.0F
			   - ((argument_72_ + argument_74_ + argument_76_ + f)
			      / 4.0F * 16.0F));
	anInt5699 = (int) (f_93_ * 16.0F + 8.0F
			   - (argument_73_ + argument_75_ + argument_77_
			      + f_90_) / 4.0F * 16.0F);
	anInt5710 = ((this.width >> 1 << 12)
		     + (anInt5699 * anInt5709 >> 4));
	anInt5704 = ((this.height >> 1 << 12)
		     + (anInt5699 * anInt5723 >> 4));
	anInt5721 = anInt5707 * anInt5717 >> 4;
	anInt5725 = anInt5707 * anInt5712 >> 4;
	anInt5706 = (int) f_91_;
	anInt5713 = (int) f_92_;
	anInt5722 = (int) f_93_;
	anInt5700 = (int) f_94_;
	return true;
    }
    
    Class368_Sub2(JavaToolkit toolkit, int argument_98_,
		  int argument_99_) {
	this.toolkit = toolkit;
	this.width = argument_98_;
	this.height = argument_99_;
    }
    
    static {
	anInt5701 = 0;
	anInt5702 = 0;
	anInt5711 = 0;
	anInt5694 = 0;
	anInt5695 = 0;
	anInt5714 = 0;
    }
}
