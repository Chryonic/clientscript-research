/* Class57_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AbstractFont_Sub2 extends AbstractFont
{
    private int[] anIntArray3846;
    private JavaToolkit aClass_ha__3847;
    private int[] anIntArray3848;
    private int[] anIntArray3849;
    private int[] anIntArray3850;
    private byte[][] aByteArrayArray3851;
    
    final void drawCharacter2(char character_, int x_, int y_, int colour_, boolean argument_4_) {
	x_ += anIntArray3848[character_];
	y_ += anIntArray3846[character_];
	int anLocalInt = anIntArray3849[character_];
	int anLocalInt_5_ = anIntArray3850[character_];
	int anLocalInt_6_ = ((JavaToolkit) aClass_ha__3847).width;
	int anLocalInt_7_ = x_ + y_ * anLocalInt_6_;
	int anLocalInt_8_ = anLocalInt_6_ - anLocalInt;
	int anLocalInt_9_ = 0;
	int anLocalInt_10_ = 0;
	if (y_ < ((JavaToolkit) aClass_ha__3847).clipTop) {
	    int anLocalInt_11_
		= (((JavaToolkit) aClass_ha__3847).clipTop
		   - y_);
	    anLocalInt_5_ -= anLocalInt_11_;
	    y_ = ((JavaToolkit) aClass_ha__3847).clipTop;
	    anLocalInt_10_ += anLocalInt_11_ * anLocalInt;
	    anLocalInt_7_ += anLocalInt_11_ * anLocalInt_6_;
	}
	if (y_ + anLocalInt_5_
	    > ((JavaToolkit) aClass_ha__3847).clipBottom)
	    anLocalInt_5_
		-= (y_ + anLocalInt_5_
		    - ((JavaToolkit) aClass_ha__3847).clipBottom);
	if (x_ < ((JavaToolkit) aClass_ha__3847).clipLeft) {
	    int anLocalInt_12_
		= (((JavaToolkit) aClass_ha__3847).clipLeft
		   - x_);
	    anLocalInt -= anLocalInt_12_;
	    x_ = ((JavaToolkit) aClass_ha__3847).clipLeft;
	    anLocalInt_10_ += anLocalInt_12_;
	    anLocalInt_7_ += anLocalInt_12_;
	    anLocalInt_9_ += anLocalInt_12_;
	    anLocalInt_8_ += anLocalInt_12_;
	}
	if (x_ + anLocalInt
	    > ((JavaToolkit) aClass_ha__3847).clipRight) {
	    int anLocalInt_13_
		= (x_ + anLocalInt
		   - ((JavaToolkit) aClass_ha__3847).clipRight);
	    anLocalInt -= anLocalInt_13_;
	    anLocalInt_9_ += anLocalInt_13_;
	    anLocalInt_8_ += anLocalInt_13_;
	}
	if (anLocalInt > 0 && anLocalInt_5_ > 0)
	    method516(aByteArrayArray3851[character_],
		      ((JavaToolkit) aClass_ha__3847).pixels, colour_, anLocalInt_10_, anLocalInt_7_, anLocalInt,
		      anLocalInt_5_, anLocalInt_8_, anLocalInt_9_);
    }
    
    AbstractFont_Sub2(JavaToolkit argument_14_, Class76 argument_15_, Class83[] argument_16_, int[] argument_17_, int[] argument_18_) {
	super(argument_14_, argument_15_);
	aClass_ha__3847 = argument_14_;
	aClass_ha__3847 = argument_14_;
	anIntArray3849 = argument_17_;
	anIntArray3850 = argument_18_;
	aByteArrayArray3851 = new byte[argument_16_.length][];
	anIntArray3846 = new int[argument_16_.length];
	anIntArray3848 = new int[argument_16_.length];
	for (int anLocalInt = 0; anLocalInt < argument_16_.length;
	     anLocalInt++) {
	    Class83 class83 = argument_16_[anLocalInt];
	    if (((Class83) class83).aByteArray592 != null)
		aByteArrayArray3851[anLocalInt]
		    = ((Class83) class83).aByteArray592;
	    else {
		byte[] anLocalInts = ((Class83) class83).aByteArray591;
		byte[] anLocalInts_19_ = (aByteArrayArray3851[anLocalInt]
					  = new byte[anLocalInts.length]);
		for (int anLocalInt_20_ = 0;
		     anLocalInt_20_ < anLocalInts.length; anLocalInt_20_++)
		    anLocalInts_19_[anLocalInt_20_]
			= (byte) (anLocalInts[anLocalInt_20_] == 0 ? 0 : -1);
	    }
	    anIntArray3846[anLocalInt] = ((Class83) class83).anInt589;
	    anIntArray3848[anLocalInt] = ((Class83) class83).anInt593;
	}
    }
    
    final void drawCharacter(char character_, int x_, int y_, int argument_24_, boolean argument_25_, Class_aa argument_26_, int argument_27_, int argument_28_) {
	if (argument_26_ == null)
	    drawCharacter2(character_, x_, y_, argument_24_, argument_25_);
	else {
	    x_ += anIntArray3848[character_];
	    y_ += anIntArray3846[character_];
	    int anLocalInt = anIntArray3849[character_];
	    int anLocalInt_29_ = anIntArray3850[character_];
	    int anLocalInt_30_
		= ((JavaToolkit) aClass_ha__3847).width;
	    int anLocalInt_31_ = x_ + y_ * anLocalInt_30_;
	    int anLocalInt_32_ = anLocalInt_30_ - anLocalInt;
	    int anLocalInt_33_ = 0;
	    int anLocalInt_34_ = 0;
	    if (y_
		< ((JavaToolkit) aClass_ha__3847).clipTop) {
		int anLocalInt_35_
		    = (((JavaToolkit) aClass_ha__3847).clipTop
		       - y_);
		anLocalInt_29_ -= anLocalInt_35_;
		y_ = ((JavaToolkit) aClass_ha__3847).clipTop;
		anLocalInt_34_ += anLocalInt_35_ * anLocalInt;
		anLocalInt_31_ += anLocalInt_35_ * anLocalInt_30_;
	    }
	    if (y_ + anLocalInt_29_
		> ((JavaToolkit) aClass_ha__3847).clipBottom)
		anLocalInt_29_
		    -= (y_ + anLocalInt_29_
			- ((JavaToolkit) aClass_ha__3847).clipBottom);
	    if (x_
		< ((JavaToolkit) aClass_ha__3847).clipLeft) {
		int anLocalInt_36_
		    = (((JavaToolkit) aClass_ha__3847).clipLeft
		       - x_);
		anLocalInt -= anLocalInt_36_;
		x_ = ((JavaToolkit) aClass_ha__3847).clipLeft;
		anLocalInt_34_ += anLocalInt_36_;
		anLocalInt_31_ += anLocalInt_36_;
		anLocalInt_33_ += anLocalInt_36_;
		anLocalInt_32_ += anLocalInt_36_;
	    }
	    if (x_ + anLocalInt
		> ((JavaToolkit) aClass_ha__3847).clipRight) {
		int anLocalInt_37_
		    = (x_ + anLocalInt
		       - ((JavaToolkit) aClass_ha__3847).clipRight);
		anLocalInt -= anLocalInt_37_;
		anLocalInt_33_ += anLocalInt_37_;
		anLocalInt_32_ += anLocalInt_37_;
	    }
	    if (anLocalInt > 0 && anLocalInt_29_ > 0)
		method515(aByteArrayArray3851[character_],
			  ((JavaToolkit) aClass_ha__3847).pixels,
			  argument_24_, anLocalInt_34_, anLocalInt_31_,
			  anLocalInt, anLocalInt_29_, anLocalInt_32_,
			  anLocalInt_33_, x_, y_,
			  anIntArray3849[character_], argument_26_,
			  argument_27_, argument_28_);
	}
    }
    
    private final void method515
	(byte[] argument_38_, int[] argument_39_, int argument_40_,
	 int argument_41_, int argument_42_, int argument_43_,
	 int argument_44_, int argument_45_, int argument_46_,
	 int argument_47_, int argument_48_, int argument_49_,
	 Class_aa argument_50_, int argument_51_, int argument_52_) {
	Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_50_;
	int[] anLocalInts = ((Class_aa_Sub3) class_aa_sub3).anIntArray3757;
	int[] anLocalInts_53_ = ((Class_aa_Sub3) class_aa_sub3).anIntArray3755;
	int anLocalInt
	    = argument_47_ - ((JavaToolkit) aClass_ha__3847).clipLeft;
	int anLocalInt_54_ = argument_48_;
	if (argument_52_ > anLocalInt_54_) {
	    anLocalInt_54_ = argument_52_;
	    argument_42_
		+= ((argument_52_ - argument_48_)
		    * ((JavaToolkit) aClass_ha__3847).width);
	    argument_41_ += (argument_52_ - argument_48_) * argument_49_;
	}
	int anLocalInt_55_
	    = (argument_52_ + anLocalInts.length < argument_48_ + argument_44_
	       ? argument_52_ + anLocalInts.length
	       : argument_48_ + argument_44_);
	for (int anLocalInt_56_ = anLocalInt_54_;
	     anLocalInt_56_ < anLocalInt_55_; anLocalInt_56_++) {
	    int anLocalInt_57_
		= anLocalInts[anLocalInt_56_ - argument_52_] + argument_51_;
	    int anLocalInt_58_
		= anLocalInts_53_[anLocalInt_56_ - argument_52_];
	    int anLocalInt_59_ = argument_43_;
	    if (anLocalInt > anLocalInt_57_) {
		int anLocalInt_60_ = anLocalInt - anLocalInt_57_;
		if (anLocalInt_60_ >= anLocalInt_58_) {
		    argument_41_ += argument_43_ + argument_46_;
		    argument_42_ += argument_43_ + argument_45_;
		    continue;
		}
		anLocalInt_58_ -= anLocalInt_60_;
	    } else {
		int anLocalInt_61_ = anLocalInt_57_ - anLocalInt;
		if (anLocalInt_61_ >= argument_43_) {
		    argument_41_ += argument_43_ + argument_46_;
		    argument_42_ += argument_43_ + argument_45_;
		    continue;
		}
		argument_41_ += anLocalInt_61_;
		anLocalInt_59_ -= anLocalInt_61_;
		argument_42_ += anLocalInt_61_;
	    }
	    int anLocalInt_62_ = 0;
	    if (anLocalInt_59_ < anLocalInt_58_)
		anLocalInt_58_ = anLocalInt_59_;
	    else
		anLocalInt_62_ = anLocalInt_59_ - anLocalInt_58_;
	    for (int anLocalInt_63_ = -anLocalInt_58_; anLocalInt_63_ < 0;
		 anLocalInt_63_++) {
		int anLocalInt_64_ = argument_38_[argument_41_++] & 0xff;
		if (anLocalInt_64_ != 0) {
		    int anLocalInt_65_
			= ((((argument_40_ & 0xff00ff) * anLocalInt_64_
			     & ~0xff00ff)
			    + ((argument_40_ & 0xff00) * anLocalInt_64_
			       & 0xff0000))
			   >> 8);
		    anLocalInt_64_ = 256 - anLocalInt_64_;
		    int anLocalInt_66_ = argument_39_[argument_42_];
		    argument_39_[argument_42_++]
			= ((((anLocalInt_66_ & 0xff00ff) * anLocalInt_64_
			     & ~0xff00ff)
			    + ((anLocalInt_66_ & 0xff00) * anLocalInt_64_
			       & 0xff0000))
			   >> 8) + anLocalInt_65_;
		} else
		    argument_42_++;
	    }
	    argument_41_ += anLocalInt_62_ + argument_46_;
	    argument_42_ += anLocalInt_62_ + argument_45_;
	}
    }
    
    private final void method516
	(byte[] argument_67_, int[] argument_68_, int argument_69_,
	 int argument_70_, int argument_71_, int argument_72_,
	 int argument_73_, int argument_74_, int argument_75_) {
	for (int anLocalInt = -argument_73_; anLocalInt < 0; anLocalInt++) {
	    for (int anLocalInt_76_ = -argument_72_; anLocalInt_76_ < 0;
		 anLocalInt_76_++) {
		int anLocalInt_77_ = argument_67_[argument_70_++] & 0xff;
		if (anLocalInt_77_ != 0) {
		    int anLocalInt_78_
			= ((((argument_69_ & 0xff00ff) * anLocalInt_77_
			     & ~0xff00ff)
			    + ((argument_69_ & 0xff00) * anLocalInt_77_
			       & 0xff0000))
			   >> 8);
		    anLocalInt_77_ = 256 - anLocalInt_77_;
		    int anLocalInt_79_ = argument_68_[argument_71_];
		    argument_68_[argument_71_++]
			= ((((anLocalInt_79_ & 0xff00ff) * anLocalInt_77_
			     & ~0xff00ff)
			    + ((anLocalInt_79_ & 0xff00) * anLocalInt_77_
			       & 0xff0000))
			   >> 8) + anLocalInt_78_;
		} else
		    argument_71_++;
	    }
	    argument_71_ += argument_74_;
	    argument_70_ += argument_75_;
	}
    }
}
