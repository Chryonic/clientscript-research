/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class9
{
    static int anInt84;

    static final void method240(int argument, int argument_3_, int argument_4_,
				int argument_5_, int argument_6_,
				int argument_7_, int argument_8_) {
	Node_Sub31_Sub15_Sub1.method919(-13886, argument);
	int anLocalInt = argument_4_;
	int anLocalInt_9_ = -argument_6_ + argument;
	if (anLocalInt_9_ < 0)
	    anLocalInt_9_ = 0;
	int anLocalInt_10_ = argument;
	int anLocalInt_11_ = -argument;
	int anLocalInt_12_ = anLocalInt_9_;
	int anLocalInt_13_ = -anLocalInt_9_;
	int anLocalInt_14_ = -1;
	int anLocalInt_15_ = -1;
	int[] anLocalInts = Class223.anIntArrayArray1562[argument_5_];
	int anLocalInt_16_ = argument_7_ - anLocalInt_9_;
	Statics.method3364(anLocalInts, (byte) 113, -argument + argument_7_, anLocalInt_16_, argument_3_);
	int anLocalInt_17_ = anLocalInt_9_ + argument_7_;
	Statics.method3364(anLocalInts, (byte) -67, anLocalInt_16_, anLocalInt_17_, argument_8_);
	Statics.method3364(anLocalInts, (byte) -43, anLocalInt_17_, argument + argument_7_, argument_3_);
	while (anLocalInt_10_ > anLocalInt) {
	    anLocalInt_15_ += 2;
	    anLocalInt_14_ += 2;
	    anLocalInt_13_ += anLocalInt_15_;
	    anLocalInt_11_ += anLocalInt_14_;
	    if (anLocalInt_13_ >= 0 && anLocalInt_12_ >= 1) {
		Exception_Sub1.anIntArray48[anLocalInt_12_] = anLocalInt;
		anLocalInt_12_--;
		anLocalInt_13_ -= anLocalInt_12_ << 1;
	    }
	    anLocalInt++;
	    if (anLocalInt_11_ >= 0) {
		if (--anLocalInt_10_ >= anLocalInt_9_) {
		    int[] anLocalInts_18_ = (Class223.anIntArrayArray1562
					     [anLocalInt_10_ + argument_5_]);
		    int[] anLocalInts_19_ = (Class223.anIntArrayArray1562
					     [argument_5_ - anLocalInt_10_]);
		    int anLocalInt_20_ = anLocalInt + argument_7_;
		    int anLocalInt_21_ = argument_7_ - anLocalInt;
		    Statics.method3364(anLocalInts_18_, (byte) 125, anLocalInt_21_, anLocalInt_20_, argument_3_);
		    Statics.method3364(anLocalInts_19_, (byte) 123, anLocalInt_21_, anLocalInt_20_, argument_3_);
		} else {
		    int[] anLocalInts_22_ = (Class223.anIntArrayArray1562
					     [anLocalInt_10_ + argument_5_]);
		    int[] anLocalInts_23_ = (Class223.anIntArrayArray1562
					     [argument_5_ - anLocalInt_10_]);
		    int anLocalInt_24_
			= Exception_Sub1.anIntArray48[anLocalInt_10_];
		    int anLocalInt_25_ = argument_7_ + anLocalInt;
		    int anLocalInt_26_ = -anLocalInt + argument_7_;
		    int anLocalInt_27_ = anLocalInt_24_ + argument_7_;
		    int anLocalInt_28_ = -anLocalInt_24_ + argument_7_;
		    Statics.method3364(anLocalInts_22_, (byte) -113, anLocalInt_26_, anLocalInt_28_, argument_3_);
		    Statics.method3364(anLocalInts_22_, (byte) -77, anLocalInt_28_, anLocalInt_27_, argument_8_);
		    Statics.method3364(anLocalInts_22_, (byte) 108, anLocalInt_27_, anLocalInt_25_, argument_3_);
		    Statics.method3364(anLocalInts_23_, (byte) 82, anLocalInt_26_, anLocalInt_28_, argument_3_);
		    Statics.method3364(anLocalInts_23_, (byte) 92, anLocalInt_28_, anLocalInt_27_, argument_8_);
		    Statics.method3364(anLocalInts_23_, (byte) 127, anLocalInt_27_, anLocalInt_25_, argument_3_);
		}
		anLocalInt_11_ -= anLocalInt_10_ << 1;
	    }
	    int[] anLocalInts_29_
		= Class223.anIntArrayArray1562[anLocalInt + argument_5_];
	    int[] anLocalInts_30_
		= Class223.anIntArrayArray1562[-anLocalInt + argument_5_];
	    int anLocalInt_31_ = anLocalInt_10_ + argument_7_;
	    int anLocalInt_32_ = -anLocalInt_10_ + argument_7_;
	    if (anLocalInt < anLocalInt_9_) {
		int anLocalInt_33_
		    = (anLocalInt <= anLocalInt_12_ ? anLocalInt_12_
		       : Exception_Sub1.anIntArray48[anLocalInt]);
		int anLocalInt_34_ = anLocalInt_33_ + argument_7_;
		int anLocalInt_35_ = -anLocalInt_33_ + argument_7_;
		Statics.method3364(anLocalInts_29_, (byte) 79, anLocalInt_32_, anLocalInt_35_, argument_3_);
		Statics.method3364(anLocalInts_29_, (byte) -81, anLocalInt_35_, anLocalInt_34_, argument_8_);
		Statics.method3364(anLocalInts_29_, (byte) 106, anLocalInt_34_, anLocalInt_31_, argument_3_);
		Statics.method3364(anLocalInts_30_, (byte) -42, anLocalInt_32_, anLocalInt_35_, argument_3_);
		Statics.method3364(anLocalInts_30_, (byte) -34, anLocalInt_35_, anLocalInt_34_, argument_8_);
		Statics.method3364(anLocalInts_30_, (byte) 112, anLocalInt_34_, anLocalInt_31_, argument_3_);
	    } else {
		Statics.method3364(anLocalInts_29_, (byte) 83, anLocalInt_32_, anLocalInt_31_, argument_3_);
		Statics.method3364(anLocalInts_30_, (byte) 97, anLocalInt_32_, anLocalInt_31_, argument_3_);
	    }
	}
    }
    
    public static void method241(byte argument) {
	client.modeWhat = null;
    }
    
    static final String method242(int argument, boolean argument_36_) {
	String string = Integer.toString(argument);
	for (int anLocalInt = string.length() - 3; anLocalInt > 0;
	     anLocalInt -= 3)
	    string = (string.substring(0, anLocalInt) + ","
		      + string.substring(anLocalInt));
	if (string.length() > 9)
	    return (" <col=00ff80>" + string.substring(0, string.length() - 8)
		    + MultilanguageString.MILLION_SUFFIX.getLocalizedString(
                client.language)
		    + " (" + string + ")</col>");
	if (string.length() > 6)
	    return (" <col=ffffff>" + string.substring(0, string.length() - 4)
		    + MultilanguageString.KILO_SUFFIX.getLocalizedString(
                client.language)
		    + " (" + string + ")</col>");
	return " <col=ffff00>" + string + "</col>";
    }
    
    static final boolean method243(byte argument, int argument_37_) {
	if (argument_37_ == 44 || argument_37_ == 3 || argument_37_ == 46
	    || argument_37_ == 48 || argument_37_ == 53)
	    return true;
	if (argument_37_ == 10 || argument_37_ == 1003)
	    return true;
	return false;
    }
    
    static final void method244(int argument, byte argument_38_,
				int argument_39_) {
	if (Statics.aGraphicsToolkit5822 != null) {
	    int anLocalInt = Class85.anInt604;
	    int anLocalInt_40_ = Class24.anInt161;
	    Class350_Sub3.method3871(argument, argument_39_, 103);
	    if (Class50.anInt365 != 0) {
		if (Class50.anInt365 == 1
		    && (Class301.anInterface15Array2529 == null
			|| anLocalInt != Class85.anInt604
			|| Class24.anInt161 != anLocalInt_40_)) {
		    Class301.anInterface15Array2529
			= new Interface15[Class24.anInt161 * Class85.anInt604];
		    for (int anLocalInt_41_ = 0;
			 (Class301.anInterface15Array2529.length
			  > anLocalInt_41_);
			 anLocalInt_41_++)
			Class301.anInterface15Array2529[anLocalInt_41_]
			    = (Statics.aGraphicsToolkit5822.method2097
			       ((Statics.aGraphicsToolkit5822.method2070
				 (Node_Sub31_Sub2.anInt5844,
				  Class5.anInt67)),
				(Statics.aGraphicsToolkit5822.method2077
				 (Node_Sub31_Sub2.anInt5844,
				  Class5.anInt67))));
		    Class5.anIntArray65
			= new int[Class85.anInt604 * Class24.anInt161];
		    Class392.anInt3293 = 1;
		}
	    } else {
		Node_Sub31_Sub16.anInterface15_5912 = null;
		Node_Sub31_Sub16.anInterface15_5912
		    = (Statics.aGraphicsToolkit5822.method2097
		       ((Statics.aGraphicsToolkit5822.method2070
			 (dba_sub_772_Sub2.anInt6366,
			  Class189_Sub3.anInt5647)),
			(Statics.aGraphicsToolkit5822.method2077
			 (dba_sub_772_Sub2.anInt6366,
			  Class189_Sub3.anInt5647))));
	    }
	    Class18.aBoolean124 = true;
	}
    }
}
