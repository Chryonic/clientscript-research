/* Class57_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AbstractFont_Sub5 extends AbstractFont
{
    private JavaToolkit aClass_ha__3860;
    private byte[][] aByteArrayArray3861;
    private int[] anIntArray3862;
    private int[] anIntArray3863;
    private int[] anIntArray3864;
    private int[] anIntArray3865;
    
    private final void method517
	(byte[] argument_0_, int[] argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int argument_9_, int argument_10_,
	 int argument_11_, Class_aa argument_12_, int argument_13_,
	 int argument_14_) {
	Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_12_;
	int[] anLocalInts = ((Class_aa_Sub3) class_aa_sub3).anIntArray3757;
	int[] anLocalInts_15_ = ((Class_aa_Sub3) class_aa_sub3).anIntArray3755;
	int anLocalInt = argument_10_;
	if (argument_14_ > anLocalInt) {
	    anLocalInt = argument_14_;
	    argument_4_ += ((argument_14_ - argument_10_)
			    * ((JavaToolkit) aClass_ha__3860).width);
	    argument_3_ += (argument_14_ - argument_10_) * argument_11_;
	}
	int anLocalInt_16_
	    = (argument_14_ + anLocalInts.length < argument_10_ + argument_6_
	       ? argument_14_ + anLocalInts.length
	       : argument_10_ + argument_6_);
	for (int anLocalInt_17_ = anLocalInt; anLocalInt_17_ < anLocalInt_16_;
	     anLocalInt_17_++) {
	    int anLocalInt_18_
		= argument_13_ + anLocalInts[anLocalInt_17_ - argument_14_];
	    int anLocalInt_19_
		= anLocalInts_15_[anLocalInt_17_ - argument_14_];
	    int anLocalInt_20_ = argument_5_;
	    if (argument_9_ > anLocalInt_18_) {
		int anLocalInt_21_ = argument_9_ - anLocalInt_18_;
		if (anLocalInt_21_ >= anLocalInt_19_) {
		    argument_3_ += argument_5_ + argument_8_;
		    argument_4_ += argument_5_ + argument_7_;
		    continue;
		}
		anLocalInt_19_ -= anLocalInt_21_;
	    } else {
		int anLocalInt_22_ = anLocalInt_18_ - argument_9_;
		if (anLocalInt_22_ >= argument_5_) {
		    argument_3_ += argument_5_ + argument_8_;
		    argument_4_ += argument_5_ + argument_7_;
		    continue;
		}
		argument_3_ += anLocalInt_22_;
		anLocalInt_20_ -= anLocalInt_22_;
		argument_4_ += anLocalInt_22_;
	    }
	    int anLocalInt_23_ = 0;
	    if (anLocalInt_20_ < anLocalInt_19_)
		anLocalInt_19_ = anLocalInt_20_;
	    else
		anLocalInt_23_ = anLocalInt_20_ - anLocalInt_19_;
	    for (int anLocalInt_24_ = 0; anLocalInt_24_ < anLocalInt_19_;
		 anLocalInt_24_++) {
		if (argument_0_[argument_3_++] != 0)
		    argument_1_[argument_4_++] = argument_2_;
		else
		    argument_4_++;
	    }
	    argument_3_ += anLocalInt_23_ + argument_8_;
	    argument_4_ += anLocalInt_23_ + argument_7_;
	}
    }
    
    private final void method518
	(byte[] argument_25_, int[] argument_26_, int argument_27_,
	 int argument_28_, int argument_29_, int argument_30_,
	 int argument_31_, int argument_32_, int argument_33_) {
	int anLocalInt = argument_27_ >>> 24;
	int anLocalInt_34_ = 255 - anLocalInt;
	for (int anLocalInt_35_ = -argument_31_; anLocalInt_35_ < 0;
	     anLocalInt_35_++) {
	    for (int anLocalInt_36_ = -argument_30_; anLocalInt_36_ < 0;
		 anLocalInt_36_++) {
		if (argument_25_[argument_28_++] != 0) {
		    int anLocalInt_37_
			= (((argument_27_ & 0xff00ff) * anLocalInt & ~0xff00ff)
			   + ((argument_27_ & 0xff00) * anLocalInt
			      & 0xff0000)) >> 8;
		    int anLocalInt_38_ = argument_26_[argument_29_];
		    argument_26_[argument_29_++]
			= ((((anLocalInt_38_ & 0xff00ff) * anLocalInt_34_
			     & ~0xff00ff)
			    + ((anLocalInt_38_ & 0xff00) * anLocalInt_34_
			       & 0xff0000))
			   >> 8) + anLocalInt_37_;
		} else
		    argument_29_++;
	    }
	    argument_29_ += argument_32_;
	    argument_28_ += argument_33_;
	}
    }
    
    final void drawCharacter(char character_, int x_, int y_, int argument_42_, boolean argument_43_, Class_aa argument_44_, int argument_45_, int argument_46_) {
	if (argument_44_ == null)
	    drawCharacter2(character_, x_, y_, argument_42_, argument_43_);
	else {
	    x_ += anIntArray3865[character_];
	    y_ += anIntArray3863[character_];
	    int anLocalInt = anIntArray3864[character_];
	    int anLocalInt_47_ = anIntArray3862[character_];
	    int anLocalInt_48_
		= ((JavaToolkit) aClass_ha__3860).width;
	    int anLocalInt_49_ = x_ + y_ * anLocalInt_48_;
	    int anLocalInt_50_ = anLocalInt_48_ - anLocalInt;
	    int anLocalInt_51_ = 0;
	    int anLocalInt_52_ = 0;
	    if (y_
		< ((JavaToolkit) aClass_ha__3860).clipTop) {
		int anLocalInt_53_
		    = (((JavaToolkit) aClass_ha__3860).clipTop
		       - y_);
		anLocalInt_47_ -= anLocalInt_53_;
		y_ = ((JavaToolkit) aClass_ha__3860).clipTop;
		anLocalInt_52_ += anLocalInt_53_ * anLocalInt;
		anLocalInt_49_ += anLocalInt_53_ * anLocalInt_48_;
	    }
	    if (y_ + anLocalInt_47_
		> ((JavaToolkit) aClass_ha__3860).clipBottom)
		anLocalInt_47_
		    -= (y_ + anLocalInt_47_
			- ((JavaToolkit) aClass_ha__3860).clipBottom);
	    if (x_
		< ((JavaToolkit) aClass_ha__3860).clipLeft) {
		int anLocalInt_54_
		    = (((JavaToolkit) aClass_ha__3860).clipLeft
		       - x_);
		anLocalInt -= anLocalInt_54_;
		x_ = ((JavaToolkit) aClass_ha__3860).clipLeft;
		anLocalInt_52_ += anLocalInt_54_;
		anLocalInt_49_ += anLocalInt_54_;
		anLocalInt_51_ += anLocalInt_54_;
		anLocalInt_50_ += anLocalInt_54_;
	    }
	    if (x_ + anLocalInt
		> ((JavaToolkit) aClass_ha__3860).clipRight) {
		int anLocalInt_55_
		    = (x_ + anLocalInt
		       - ((JavaToolkit) aClass_ha__3860).clipRight);
		anLocalInt -= anLocalInt_55_;
		anLocalInt_51_ += anLocalInt_55_;
		anLocalInt_50_ += anLocalInt_55_;
	    }
	    if (anLocalInt > 0 && anLocalInt_47_ > 0) {
		if ((argument_42_ & ~0xffffff) == -16777216)
		    method517(aByteArrayArray3861[character_],
			      (((JavaToolkit) aClass_ha__3860)
			       .pixels),
			      argument_42_, anLocalInt_52_, anLocalInt_49_,
			      anLocalInt, anLocalInt_47_, anLocalInt_50_,
			      anLocalInt_51_, x_, y_,
			      anIntArray3864[character_], argument_44_,
			      argument_45_, argument_46_);
		else
		    method520(aByteArrayArray3861[character_],
			      (((JavaToolkit) aClass_ha__3860)
			       .pixels),
			      argument_42_, anLocalInt_52_, anLocalInt_49_,
			      anLocalInt, anLocalInt_47_, anLocalInt_50_,
			      anLocalInt_51_, x_, y_,
			      anIntArray3864[character_], argument_44_,
			      argument_45_, argument_46_);
	    }
	}
    }
    
    private final void method519
	(byte[] argument_56_, int[] argument_57_, int argument_58_,
	 int argument_59_, int argument_60_, int argument_61_,
	 int argument_62_, int argument_63_, int argument_64_) {
	int anLocalInt = -(argument_61_ >> 2);
	argument_61_ = -(argument_61_ & 0x3);
	for (int anLocalInt_65_ = -argument_62_; anLocalInt_65_ < 0;
	     anLocalInt_65_++) {
	    for (int anLocalInt_66_ = anLocalInt; anLocalInt_66_ < 0;
		 anLocalInt_66_++) {
		if (argument_56_[argument_59_++] != 0)
		    argument_57_[argument_60_++] = argument_58_;
		else
		    argument_60_++;
		if (argument_56_[argument_59_++] != 0)
		    argument_57_[argument_60_++] = argument_58_;
		else
		    argument_60_++;
		if (argument_56_[argument_59_++] != 0)
		    argument_57_[argument_60_++] = argument_58_;
		else
		    argument_60_++;
		if (argument_56_[argument_59_++] != 0)
		    argument_57_[argument_60_++] = argument_58_;
		else
		    argument_60_++;
	    }
	    for (int anLocalInt_67_ = argument_61_; anLocalInt_67_ < 0;
		 anLocalInt_67_++) {
		if (argument_56_[argument_59_++] != 0)
		    argument_57_[argument_60_++] = argument_58_;
		else
		    argument_60_++;
	    }
	    argument_60_ += argument_63_;
	    argument_59_ += argument_64_;
	}
    }
    
    final void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_72_) {
	x_ += anIntArray3865[character_];
	y_ += anIntArray3863[character_];
	int anLocalInt = anIntArray3864[character_];
	int anLocalInt_73_ = anIntArray3862[character_];
	int anLocalInt_74_ = ((JavaToolkit) aClass_ha__3860).width;
	int anLocalInt_75_ = x_ + y_ * anLocalInt_74_;
	int anLocalInt_76_ = anLocalInt_74_ - anLocalInt;
	int anLocalInt_77_ = 0;
	int anLocalInt_78_ = 0;
	if (y_ < ((JavaToolkit) aClass_ha__3860).clipTop) {
	    int anLocalInt_79_
		= (((JavaToolkit) aClass_ha__3860).clipTop
		   - y_);
	    anLocalInt_73_ -= anLocalInt_79_;
	    y_ = ((JavaToolkit) aClass_ha__3860).clipTop;
	    anLocalInt_78_ += anLocalInt_79_ * anLocalInt;
	    anLocalInt_75_ += anLocalInt_79_ * anLocalInt_74_;
	}
	if (y_ + anLocalInt_73_
	    > ((JavaToolkit) aClass_ha__3860).clipBottom)
	    anLocalInt_73_
		-= (y_ + anLocalInt_73_
		    - ((JavaToolkit) aClass_ha__3860).clipBottom);
	if (x_ < ((JavaToolkit) aClass_ha__3860).clipLeft) {
	    int anLocalInt_80_
		= (((JavaToolkit) aClass_ha__3860).clipLeft
		   - x_);
	    anLocalInt -= anLocalInt_80_;
	    x_ = ((JavaToolkit) aClass_ha__3860).clipLeft;
	    anLocalInt_78_ += anLocalInt_80_;
	    anLocalInt_75_ += anLocalInt_80_;
	    anLocalInt_77_ += anLocalInt_80_;
	    anLocalInt_76_ += anLocalInt_80_;
	}
	if (x_ + anLocalInt
	    > ((JavaToolkit) aClass_ha__3860).clipRight) {
	    int anLocalInt_81_
		= (x_ + anLocalInt
		   - ((JavaToolkit) aClass_ha__3860).clipRight);
	    anLocalInt -= anLocalInt_81_;
	    anLocalInt_77_ += anLocalInt_81_;
	    anLocalInt_76_ += anLocalInt_81_;
	}
	if (anLocalInt > 0 && anLocalInt_73_ > 0) {
	    if ((colour_ & ~0xffffff) == -16777216)
		method519(aByteArrayArray3861[character_],
			  ((JavaToolkit) aClass_ha__3860).pixels, colour_, anLocalInt_78_, anLocalInt_75_,
			  anLocalInt, anLocalInt_73_, anLocalInt_76_,
			  anLocalInt_77_);
	    else if ((colour_ & ~0xffffff) != 0)
		method518(aByteArrayArray3861[character_],
			  ((JavaToolkit) aClass_ha__3860).pixels, colour_, anLocalInt_78_, anLocalInt_75_,
			  anLocalInt, anLocalInt_73_, anLocalInt_76_,
			  anLocalInt_77_);
	}
    }
    
    AbstractFont_Sub5(JavaToolkit argument_82_, Class76 argument_83_, Class83[] argument_84_, int[] argument_85_, int[] argument_86_) {
	super(argument_82_, argument_83_);
	aClass_ha__3860 = argument_82_;
	anIntArray3864 = argument_85_;
	anIntArray3862 = argument_86_;
	aByteArrayArray3861 = new byte[argument_84_.length][];
	anIntArray3863 = new int[argument_84_.length];
	anIntArray3865 = new int[argument_84_.length];
	for (int anLocalInt = 0; anLocalInt < argument_84_.length;
	     anLocalInt++) {
	    aByteArrayArray3861[anLocalInt]
		= ((Class83) argument_84_[anLocalInt]).aByteArray591;
	    anIntArray3863[anLocalInt]
		= ((Class83) argument_84_[anLocalInt]).anInt589;
	    anIntArray3865[anLocalInt]
		= ((Class83) argument_84_[anLocalInt]).anInt593;
	}
    }
    
    private final void method520
	(byte[] argument_87_, int[] argument_88_, int argument_89_,
	 int argument_90_, int argument_91_, int argument_92_,
	 int argument_93_, int argument_94_, int argument_95_,
	 int argument_96_, int argument_97_, int argument_98_,
	 Class_aa argument_99_, int argument_100_, int argument_101_) {
	Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_99_;
	int[] anLocalInts = ((Class_aa_Sub3) class_aa_sub3).anIntArray3757;
	int[] anLocalInts_102_
	    = ((Class_aa_Sub3) class_aa_sub3).anIntArray3755;
	int anLocalInt
	    = argument_96_ - ((JavaToolkit) aClass_ha__3860).clipLeft;
	int anLocalInt_103_ = argument_97_;
	if (argument_101_ > anLocalInt_103_) {
	    anLocalInt_103_ = argument_101_;
	    argument_91_
		+= ((argument_101_ - argument_97_)
		    * ((JavaToolkit) aClass_ha__3860).width);
	    argument_90_ += (argument_101_ - argument_97_) * argument_98_;
	}
	int anLocalInt_104_
	    = (argument_101_ + anLocalInts.length < argument_97_ + argument_93_
	       ? argument_101_ + anLocalInts.length
	       : argument_97_ + argument_93_);
	int anLocalInt_105_ = argument_89_ >>> 24;
	int anLocalInt_106_ = 255 - anLocalInt_105_;
	for (int anLocalInt_107_ = anLocalInt_103_;
	     anLocalInt_107_ < anLocalInt_104_; anLocalInt_107_++) {
	    int anLocalInt_108_
		= anLocalInts[anLocalInt_107_ - argument_101_] + argument_100_;
	    int anLocalInt_109_
		= anLocalInts_102_[anLocalInt_107_ - argument_101_];
	    int anLocalInt_110_ = argument_92_;
	    if (anLocalInt > anLocalInt_108_) {
		int anLocalInt_111_ = anLocalInt - anLocalInt_108_;
		if (anLocalInt_111_ >= anLocalInt_109_) {
		    argument_90_ += argument_92_ + argument_95_;
		    argument_91_ += argument_92_ + argument_94_;
		    continue;
		}
		anLocalInt_109_ -= anLocalInt_111_;
	    } else {
		int anLocalInt_112_ = anLocalInt_108_ - anLocalInt;
		if (anLocalInt_112_ >= argument_92_) {
		    argument_90_ += argument_92_ + argument_95_;
		    argument_91_ += argument_92_ + argument_94_;
		    continue;
		}
		argument_90_ += anLocalInt_112_;
		anLocalInt_110_ -= anLocalInt_112_;
		argument_91_ += anLocalInt_112_;
	    }
	    int anLocalInt_113_ = 0;
	    if (anLocalInt_110_ < anLocalInt_109_)
		anLocalInt_109_ = anLocalInt_110_;
	    else
		anLocalInt_113_ = anLocalInt_110_ - anLocalInt_109_;
	    for (int anLocalInt_114_ = -anLocalInt_109_; anLocalInt_114_ < 0;
		 anLocalInt_114_++) {
		if (argument_87_[argument_90_++] != 0) {
		    int anLocalInt_115_
			= ((((argument_89_ & 0xff00ff) * anLocalInt_105_
			     & ~0xff00ff)
			    + ((argument_89_ & 0xff00) * anLocalInt_105_
			       & 0xff0000))
			   >> 8);
		    int anLocalInt_116_ = argument_88_[argument_91_];
		    argument_88_[argument_91_++]
			= ((((anLocalInt_116_ & 0xff00ff) * anLocalInt_106_
			     & ~0xff00ff)
			    + ((anLocalInt_116_ & 0xff00) * anLocalInt_106_
			       & 0xff0000))
			   >> 8) + anLocalInt_115_;
		} else
		    argument_91_++;
	    }
	    argument_90_ += anLocalInt_113_ + argument_95_;
	    argument_91_ += anLocalInt_113_ + argument_94_;
	}
    }
}
