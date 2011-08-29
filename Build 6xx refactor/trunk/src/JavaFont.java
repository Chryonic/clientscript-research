/* Class57_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JavaFont extends AbstractFont
{
    private int[] anIntArray3839;
    private int[] anIntArray3840;
    private JavaToolkit javaToolkit;
    private byte[][] aByteArrayArray3842;
    private int[] anIntArray3843;
    private int[] anIntArray3844;
    private int[] anIntArray3845;
    
    final void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_4_) {
	x_ += anIntArray3844[character_];
	y_ += anIntArray3843[character_];
	int anLocalInt = anIntArray3839[character_];
	int anLocalInt_5_ = anIntArray3845[character_];
	int anLocalInt_6_ = javaToolkit.width;
	int anLocalInt_7_ = x_ + y_ * anLocalInt_6_;
	int anLocalInt_8_ = anLocalInt_6_ - anLocalInt;
	int anLocalInt_9_ = 0;
	int anLocalInt_10_ = 0;
	if (y_ < javaToolkit.clipTop) {
	    int anLocalInt_11_
		= (javaToolkit.clipTop
		   - y_);
	    anLocalInt_5_ -= anLocalInt_11_;
	    y_ = javaToolkit.clipTop;
	    anLocalInt_10_ += anLocalInt_11_ * anLocalInt;
	    anLocalInt_7_ += anLocalInt_11_ * anLocalInt_6_;
	}
	if (y_ + anLocalInt_5_
	    > javaToolkit.clipBottom)
	    anLocalInt_5_
		-= (y_ + anLocalInt_5_
		    - javaToolkit.clipBottom);
	if (x_ < javaToolkit.clipLeft) {
	    int anLocalInt_12_
		= (javaToolkit.clipLeft
		   - x_);
	    anLocalInt -= anLocalInt_12_;
	    x_ = javaToolkit.clipLeft;
	    anLocalInt_10_ += anLocalInt_12_;
	    anLocalInt_7_ += anLocalInt_12_;
	    anLocalInt_9_ += anLocalInt_12_;
	    anLocalInt_8_ += anLocalInt_12_;
	}
	if (x_ + anLocalInt
	    > javaToolkit.clipRight) {
	    int anLocalInt_13_
		= (x_ + anLocalInt
		   - javaToolkit.clipRight);
	    anLocalInt -= anLocalInt_13_;
	    anLocalInt_9_ += anLocalInt_13_;
	    anLocalInt_8_ += anLocalInt_13_;
	}
	if (anLocalInt > 0 && anLocalInt_5_ > 0) {
	    if (argument_4_)
		method511(aByteArrayArray3842[character_],
			  javaToolkit.pixels, colour_, anLocalInt_10_, anLocalInt_7_,
			  anLocalInt, anLocalInt_5_, anLocalInt_8_,
			  anLocalInt_9_);
	    else
		method514(aByteArrayArray3842[character_],
			  javaToolkit.pixels,
			  anIntArray3840, anLocalInt_10_, anLocalInt_7_,
			  anLocalInt, anLocalInt_5_, anLocalInt_8_,
			  anLocalInt_9_);
	}
    }
    
    JavaFont(JavaToolkit argument_14_, Class76 argument_15_, Class83[] argument_16_, int[] argument_17_, int[] argument_18_) {
	super(argument_14_, argument_15_);
	javaToolkit = argument_14_;
	javaToolkit = argument_14_;
	anIntArray3839 = argument_17_;
	anIntArray3845 = argument_18_;
	aByteArrayArray3842 = new byte[argument_16_.length][];
	anIntArray3843 = new int[argument_16_.length];
	anIntArray3844 = new int[argument_16_.length];
	for (int anLocalInt = 0; anLocalInt < argument_16_.length;
	     anLocalInt++) {
	    aByteArrayArray3842[anLocalInt]
		= argument_16_[anLocalInt].aByteArray591;
	    anIntArray3843[anLocalInt]
		= argument_16_[anLocalInt].anInt589;
	    anIntArray3844[anLocalInt]
		= argument_16_[anLocalInt].anInt593;
	}
	anIntArray3840 = argument_16_[0].anIntArray586;
    }
    
    private final void method511
	(byte[] argument_19_, int[] argument_20_, int argument_21_,
	 int argument_22_, int argument_23_, int argument_24_,
	 int argument_25_, int argument_26_, int argument_27_) {
	int anLocalInt = -(argument_24_ >> 2);
	argument_24_ = -(argument_24_ & 0x3);
	for (int anLocalInt_28_ = -argument_25_; anLocalInt_28_ < 0;
	     anLocalInt_28_++) {
	    for (int anLocalInt_29_ = anLocalInt; anLocalInt_29_ < 0;
		 anLocalInt_29_++) {
		if (argument_19_[argument_22_++] != 0)
		    argument_20_[argument_23_++] = argument_21_;
		else
		    argument_23_++;
		if (argument_19_[argument_22_++] != 0)
		    argument_20_[argument_23_++] = argument_21_;
		else
		    argument_23_++;
		if (argument_19_[argument_22_++] != 0)
		    argument_20_[argument_23_++] = argument_21_;
		else
		    argument_23_++;
		if (argument_19_[argument_22_++] != 0)
		    argument_20_[argument_23_++] = argument_21_;
		else
		    argument_23_++;
	    }
	    for (int anLocalInt_30_ = argument_24_; anLocalInt_30_ < 0;
		 anLocalInt_30_++) {
		if (argument_19_[argument_22_++] != 0)
		    argument_20_[argument_23_++] = argument_21_;
		else
		    argument_23_++;
	    }
	    argument_23_ += argument_26_;
	    argument_22_ += argument_27_;
	}
    }
    
    final void drawCharacter(char character_, int x_, int y_, int argument_34_, boolean argument_35_, Class_aa argument_36_, int argument_37_, int argument_38_) {
	if (argument_36_ == null)
	    drawCharacter2(character_, x_, y_, argument_34_, argument_35_);
	else {
	    x_ += anIntArray3844[character_];
	    y_ += anIntArray3843[character_];
	    int anLocalInt = anIntArray3839[character_];
	    int anLocalInt_39_ = anIntArray3845[character_];
	    int anLocalInt_40_
		= javaToolkit.width;
	    int anLocalInt_41_ = x_ + y_ * anLocalInt_40_;
	    int anLocalInt_42_ = anLocalInt_40_ - anLocalInt;
	    int anLocalInt_43_ = 0;
	    int anLocalInt_44_ = 0;
	    if (y_
		< javaToolkit.clipTop) {
		int anLocalInt_45_
		    = (javaToolkit.clipTop
		       - y_);
		anLocalInt_39_ -= anLocalInt_45_;
		y_ = javaToolkit.clipTop;
		anLocalInt_44_ += anLocalInt_45_ * anLocalInt;
		anLocalInt_41_ += anLocalInt_45_ * anLocalInt_40_;
	    }
	    if (y_ + anLocalInt_39_
		> javaToolkit.clipBottom)
		anLocalInt_39_
		    -= (y_ + anLocalInt_39_
			- javaToolkit.clipBottom);
	    if (x_
		< javaToolkit.clipLeft) {
		int anLocalInt_46_
		    = (javaToolkit.clipLeft
		       - x_);
		anLocalInt -= anLocalInt_46_;
		x_ = javaToolkit.clipLeft;
		anLocalInt_44_ += anLocalInt_46_;
		anLocalInt_41_ += anLocalInt_46_;
		anLocalInt_43_ += anLocalInt_46_;
		anLocalInt_42_ += anLocalInt_46_;
	    }
	    if (x_ + anLocalInt
		> javaToolkit.clipRight) {
		int anLocalInt_47_
		    = (x_ + anLocalInt
		       - javaToolkit.clipRight);
		anLocalInt -= anLocalInt_47_;
		anLocalInt_43_ += anLocalInt_47_;
		anLocalInt_42_ += anLocalInt_47_;
	    }
	    if (anLocalInt > 0 && anLocalInt_39_ > 0) {
		if (argument_35_)
		    method512(aByteArrayArray3842[character_],
			      (javaToolkit
			       .pixels),
			      argument_34_, anLocalInt_44_, anLocalInt_41_,
			      anLocalInt, anLocalInt_39_, anLocalInt_42_,
			      anLocalInt_43_, x_, y_,
			      anIntArray3839[character_], argument_36_,
			      argument_37_, argument_38_);
		else
		    method513(aByteArrayArray3842[character_],
			      (javaToolkit
			       .pixels),
			      anIntArray3840, argument_34_, anLocalInt_44_,
			      anLocalInt_41_, anLocalInt, anLocalInt_39_,
			      anLocalInt_42_, anLocalInt_43_, x_, y_, anIntArray3839[character_],
			      argument_36_, argument_37_, argument_38_);
	    }
	}
    }
    
    private final void method512
	(byte[] argument_48_, int[] argument_49_, int argument_50_,
	 int argument_51_, int argument_52_, int argument_53_,
	 int argument_54_, int argument_55_, int argument_56_,
	 int argument_57_, int argument_58_, int argument_59_,
	 Class_aa argument_60_, int argument_61_, int argument_62_) {
	Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_60_;
	int[] anLocalInts = class_aa_sub3.anIntArray3757;
	int[] anLocalInts_63_ = class_aa_sub3.anIntArray3755;
	int anLocalInt
	    = argument_57_ - javaToolkit.clipLeft;
	int anLocalInt_64_ = argument_58_;
	if (argument_62_ > anLocalInt_64_) {
	    anLocalInt_64_ = argument_62_;
	    argument_52_
		+= ((argument_62_ - argument_58_)
		    * javaToolkit.width);
	    argument_51_ += (argument_62_ - argument_58_) * argument_59_;
	}
	int anLocalInt_65_
	    = (argument_62_ + anLocalInts.length < argument_58_ + argument_54_
	       ? argument_62_ + anLocalInts.length
	       : argument_58_ + argument_54_);
	for (int anLocalInt_66_ = anLocalInt_64_;
	     anLocalInt_66_ < anLocalInt_65_; anLocalInt_66_++) {
	    int anLocalInt_67_
		= anLocalInts[anLocalInt_66_ - argument_62_] + argument_61_;
	    int anLocalInt_68_
		= anLocalInts_63_[anLocalInt_66_ - argument_62_];
	    int anLocalInt_69_ = argument_53_;
	    if (anLocalInt > anLocalInt_67_) {
		int anLocalInt_70_ = anLocalInt - anLocalInt_67_;
		if (anLocalInt_70_ >= anLocalInt_68_) {
		    argument_51_ += argument_53_ + argument_56_;
		    argument_52_ += argument_53_ + argument_55_;
		    continue;
		}
		anLocalInt_68_ -= anLocalInt_70_;
	    } else {
		int anLocalInt_71_ = anLocalInt_67_ - anLocalInt;
		if (anLocalInt_71_ >= argument_53_) {
		    argument_51_ += argument_53_ + argument_56_;
		    argument_52_ += argument_53_ + argument_55_;
		    continue;
		}
		argument_51_ += anLocalInt_71_;
		anLocalInt_69_ -= anLocalInt_71_;
		argument_52_ += anLocalInt_71_;
	    }
	    int anLocalInt_72_ = 0;
	    if (anLocalInt_69_ < anLocalInt_68_)
		anLocalInt_68_ = anLocalInt_69_;
	    else
		anLocalInt_72_ = anLocalInt_69_ - anLocalInt_68_;
	    for (int anLocalInt_73_ = -anLocalInt_68_; anLocalInt_73_ < 0;
		 anLocalInt_73_++) {
		if (argument_48_[argument_51_++] != 0)
		    argument_49_[argument_52_++] = argument_50_;
		else
		    argument_52_++;
	    }
	    argument_51_ += anLocalInt_72_ + argument_51_;
	    argument_52_ += anLocalInt_72_ + argument_55_;
	}
    }
    
    private final void method513
	(byte[] argument_74_, int[] argument_75_, int[] argument_76_,
	 int argument_77_, int argument_78_, int argument_79_,
	 int argument_80_, int argument_81_, int argument_82_,
	 int argument_83_, int argument_84_, int argument_85_,
	 int argument_86_, Class_aa argument_87_, int argument_88_,
	 int argument_89_) {
	Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_87_;
	int[] anLocalInts = class_aa_sub3.anIntArray3757;
	int[] anLocalInts_90_ = class_aa_sub3.anIntArray3755;
	int anLocalInt
	    = argument_84_ - javaToolkit.clipLeft;
	int anLocalInt_91_ = argument_85_;
	if (argument_89_ > anLocalInt_91_) {
	    anLocalInt_91_ = argument_89_;
	    argument_79_
		+= ((argument_89_ - argument_85_)
		    * javaToolkit.width);
	    argument_78_ += (argument_89_ - argument_85_) * argument_86_;
	}
	int anLocalInt_92_
	    = (argument_89_ + anLocalInts.length < argument_85_ + argument_81_
	       ? argument_89_ + anLocalInts.length
	       : argument_85_ + argument_81_);
	boolean anLocalBoolean = false;
	for (int anLocalInt_93_ = anLocalInt_91_;
	     anLocalInt_93_ < anLocalInt_92_; anLocalInt_93_++) {
	    int anLocalInt_94_
		= anLocalInts[anLocalInt_93_ - argument_89_] + argument_88_;
	    int anLocalInt_95_
		= anLocalInts_90_[anLocalInt_93_ - argument_89_];
	    int anLocalInt_96_ = argument_80_;
	    if (anLocalInt > anLocalInt_94_) {
		int anLocalInt_97_ = anLocalInt - anLocalInt_94_;
		if (anLocalInt_97_ >= anLocalInt_95_) {
		    argument_78_ += argument_80_ + argument_83_;
		    argument_79_ += argument_80_ + argument_82_;
		    continue;
		}
		anLocalInt_95_ -= anLocalInt_97_;
	    } else {
		int anLocalInt_98_ = anLocalInt_94_ - anLocalInt;
		if (anLocalInt_98_ >= argument_80_) {
		    argument_78_ += argument_80_ + argument_83_;
		    argument_79_ += argument_80_ + argument_82_;
		    continue;
		}
		argument_78_ += anLocalInt_98_;
		anLocalInt_96_ -= anLocalInt_98_;
		argument_79_ += anLocalInt_98_;
	    }
	    int anLocalInt_99_ = 0;
	    if (anLocalInt_96_ < anLocalInt_95_)
		anLocalInt_95_ = anLocalInt_96_;
	    else
		anLocalInt_99_ = anLocalInt_96_ - anLocalInt_95_;
	    for (int anLocalInt_100_ = -anLocalInt_95_; anLocalInt_100_ < 0;
		 anLocalInt_100_++) {
		int anLocalInt_101_;
		if ((anLocalInt_101_ = argument_74_[argument_78_++]) != 0)
		    argument_75_[argument_79_++]
			= argument_76_[anLocalInt_101_ & 0xff];
		else
		    argument_79_++;
	    }
	    argument_78_ += anLocalInt_99_ + argument_83_;
	    argument_79_ += anLocalInt_99_ + argument_82_;
	}
    }
    
    private final void method514
	(byte[] argument_102_, int[] argument_103_, int[] argument_104_,
	 int argument_105_, int argument_106_, int argument_107_,
	 int argument_108_, int argument_109_, int argument_110_) {
	int anLocalInt = -(argument_107_ >> 2);
	argument_107_ = -(argument_107_ & 0x3);
	boolean anLocalBoolean = false;
	for (int anLocalInt_111_ = -argument_108_; anLocalInt_111_ < 0;
	     anLocalInt_111_++) {
	    for (int anLocalInt_112_ = anLocalInt; anLocalInt_112_ < 0;
		 anLocalInt_112_++) {
		int anLocalInt_113_;
		if ((anLocalInt_113_ = argument_102_[argument_105_++]) != 0)
		    argument_103_[argument_106_++]
			= argument_104_[anLocalInt_113_ & 0xff];
		else
		    argument_106_++;
		if ((anLocalInt_113_ = argument_102_[argument_105_++]) != 0)
		    argument_103_[argument_106_++]
			= argument_104_[anLocalInt_113_ & 0xff];
		else
		    argument_106_++;
		if ((anLocalInt_113_ = argument_102_[argument_105_++]) != 0)
		    argument_103_[argument_106_++]
			= argument_104_[anLocalInt_113_ & 0xff];
		else
		    argument_106_++;
		if ((anLocalInt_113_ = argument_102_[argument_105_++]) != 0)
		    argument_103_[argument_106_++]
			= argument_104_[anLocalInt_113_ & 0xff];
		else
		    argument_106_++;
	    }
	    for (int anLocalInt_114_ = argument_107_; anLocalInt_114_ < 0;
		 anLocalInt_114_++) {
		int anLocalInt_115_;
		if ((anLocalInt_115_ = argument_102_[argument_105_++]) != 0)
		    argument_103_[argument_106_++]
			= argument_104_[anLocalInt_115_ & 0xff];
		else
		    argument_106_++;
	    }
	    argument_106_ += argument_109_;
	    argument_105_ += argument_110_;
	}
    }
}
