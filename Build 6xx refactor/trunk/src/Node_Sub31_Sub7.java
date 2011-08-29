/* Class59_Sub31_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub7 extends Node_Sub31
{
    private int[] anIntArray5866;
    static Class207 aClass207_5867 = new Class207(54, 4);
    private int[] anIntArray5868;
    private int anInt5869 = 10;
    private int anInt5870 = 2048;
    private int anInt5871 = 0;
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	if (argument_2_ >= -41)
	    method868(null, 55, (byte) 24);
	int anLocalInt = argument_1_;
    while_127_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_127_;
		    }
		} else {
		    anInt5869 = argument_0_.g1();
		    break while_127_;
		}
		anInt5870 = argument_0_.g2();
		break while_127_;
	    } while (false);
	    anInt5871 = argument_0_.g1();
	} while (false);
    }
    
    static final int method893(int argument, int argument_3_) {
	return argument >>> 7;
    }
    
    final void method865(boolean argument_4_) {
	method896(124);
	if (argument_4_ != true)
	    anIntArray5868 = null;
    }
    
    public Node_Sub31_Sub7() {
	super(0, true);
    }
    
    public static void method894(int argument) {
	aClass207_5867 = null;
    }
    
    static final void method895
	(int argument, int argument_5_, byte argument_6_, int argument_7_,
	 int argument_8_, int argument_9_, int argument_10_) {
	Node_Sub31_Sub15_Sub1.method919(argument_6_ ^ ~0x364f, argument_7_);
	int anLocalInt = 0;
	if (argument_6_ != 114)
	    method894(-85);
	int anLocalInt_11_ = argument_7_ - argument_9_;
	if (anLocalInt_11_ < 0)
	    anLocalInt_11_ = 0;
	int anLocalInt_12_ = argument_7_;
	int anLocalInt_13_ = -argument_7_;
	int anLocalInt_14_ = anLocalInt_11_;
	int anLocalInt_15_ = -anLocalInt_11_;
	int anLocalInt_16_ = -1;
	if (Class209.anInt1504 <= argument
	    && argument <= Node_Sub31_Sub13.anInt5896) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[argument];
	    int anLocalInt_17_
		= Node_Sub31_Sub8.method897(argument_10_ - argument_7_,
                Node_Sub35.anInt4156,
                argument_6_ + 124914962,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_18_
		= Node_Sub31_Sub8.method897(argument_10_ + argument_7_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_19_
		= Node_Sub31_Sub8.method897(argument_10_ - anLocalInt_11_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_20_
		= Node_Sub31_Sub8.method897(argument_10_ + anLocalInt_11_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    Statics.method3364(anLocalInts, (byte) 116, anLocalInt_17_, anLocalInt_19_, argument_8_);
	    Statics.method3364(anLocalInts, (byte) 119, anLocalInt_19_, anLocalInt_20_, argument_5_);
	    Statics.method3364(anLocalInts, (byte) -118, anLocalInt_20_, anLocalInt_18_, argument_8_);
	}
	int anLocalInt_21_ = -1;
	while (anLocalInt < anLocalInt_12_) {
	    anLocalInt_21_ += 2;
	    anLocalInt_16_ += 2;
	    anLocalInt_15_ += anLocalInt_21_;
	    anLocalInt_13_ += anLocalInt_16_;
	    if (anLocalInt_15_ >= 0 && anLocalInt_14_ >= 1) {
		anLocalInt_14_--;
		Exception_Sub1.anIntArray48[anLocalInt_14_] = anLocalInt;
		anLocalInt_15_ -= anLocalInt_14_ << 1;
	    }
	    anLocalInt++;
	    if (anLocalInt_13_ >= 0) {
		anLocalInt_12_--;
		anLocalInt_13_ -= anLocalInt_12_ << 1;
		int anLocalInt_22_ = argument - anLocalInt_12_;
		int anLocalInt_23_ = anLocalInt_12_ + argument;
		if (anLocalInt_23_ >= Class209.anInt1504
		    && anLocalInt_22_ <= Node_Sub31_Sub13.anInt5896) {
		    if (anLocalInt_12_ < anLocalInt_11_) {
			int anLocalInt_24_
			    = Exception_Sub1.anIntArray48[anLocalInt_12_];
			int anLocalInt_25_
			    = (Node_Sub31_Sub8.method897
			       (argument_10_ + anLocalInt,
                           Node_Sub35.anInt4156, 124915076,
                           Node_Sub9_Sub2.anInt5776));
			int anLocalInt_26_ = (Node_Sub31_Sub8.method897
					      (argument_10_ - anLocalInt,
                                  Node_Sub35.anInt4156,
                                  argument_6_ + 124914962,
                                  Node_Sub9_Sub2.anInt5776));
			int anLocalInt_27_ = (Node_Sub31_Sub8.method897
					      (anLocalInt_24_ + argument_10_,
                                  Node_Sub35.anInt4156,
                                  argument_6_ ^ 0x7720df6,
                                  Node_Sub9_Sub2.anInt5776));
			int anLocalInt_28_
			    = (Node_Sub31_Sub8.method897
			       (argument_10_ - anLocalInt_24_,
                           Node_Sub35.anInt4156, 124915076,
                           Node_Sub9_Sub2.anInt5776));
			if (Node_Sub31_Sub13.anInt5896 >= anLocalInt_23_) {
			    int[] anLocalInts
				= Class223.anIntArrayArray1562[anLocalInt_23_];
			    Statics.method3364(anLocalInts, (byte) -81, anLocalInt_26_, anLocalInt_28_, argument_8_);
			    Statics.method3364(anLocalInts, (byte) -69, anLocalInt_28_, anLocalInt_27_, argument_5_);
			    Statics.method3364(anLocalInts, (byte) 86, anLocalInt_27_, anLocalInt_25_, argument_8_);
			}
			if (Class209.anInt1504 <= anLocalInt_22_) {
			    int[] anLocalInts
				= Class223.anIntArrayArray1562[anLocalInt_22_];
			    Statics.method3364(anLocalInts, (byte) -99, anLocalInt_26_, anLocalInt_28_, argument_8_);
			    Statics.method3364(anLocalInts, (byte) 96, anLocalInt_28_, anLocalInt_27_, argument_5_);
			    Statics.method3364(anLocalInts, (byte) 122, anLocalInt_27_, anLocalInt_25_, argument_8_);
			}
		    } else {
			int anLocalInt_29_
			    = (Node_Sub31_Sub8.method897
			       (argument_10_ + anLocalInt,
                           Node_Sub35.anInt4156, 124915076,
                           Node_Sub9_Sub2.anInt5776));
			int anLocalInt_30_
			    = (Node_Sub31_Sub8.method897
			       (argument_10_ - anLocalInt,
                           Node_Sub35.anInt4156, 124915076,
                           Node_Sub9_Sub2.anInt5776));
			if (Node_Sub31_Sub13.anInt5896 >= anLocalInt_23_)
			    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_23_]), (byte) 76, anLocalInt_30_, anLocalInt_29_, argument_8_);
			if (anLocalInt_22_ >= Class209.anInt1504)
			    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_22_]), (byte) 104, anLocalInt_30_, anLocalInt_29_, argument_8_);
		    }
		}
	    }
	    int anLocalInt_31_ = -anLocalInt + argument;
	    int anLocalInt_32_ = anLocalInt + argument;
	    if (Class209.anInt1504 <= anLocalInt_32_
		&& anLocalInt_31_ <= Node_Sub31_Sub13.anInt5896) {
		int anLocalInt_33_ = argument_10_ + anLocalInt_12_;
		int anLocalInt_34_ = -anLocalInt_12_ + argument_10_;
		if (Node_Sub35.anInt4156 <= anLocalInt_33_
		    && Node_Sub9_Sub2.anInt5776 >= anLocalInt_34_) {
		    anLocalInt_33_
			= Node_Sub31_Sub8.method897(anLocalInt_33_,
                    Node_Sub35.anInt4156,
                    124915076,
                    (Node_Sub9_Sub2
                            .anInt5776));
		    anLocalInt_34_
			= Node_Sub31_Sub8.method897(anLocalInt_34_,
                    Node_Sub35.anInt4156,
                    124915076,
                    (Node_Sub9_Sub2
                            .anInt5776));
		    if (anLocalInt >= anLocalInt_11_) {
			if (Node_Sub31_Sub13.anInt5896 >= anLocalInt_32_)
			    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_32_]), (byte) 81, anLocalInt_34_, anLocalInt_33_, argument_8_);
			if (anLocalInt_31_ >= Class209.anInt1504)
			    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_31_]), (byte) -53, anLocalInt_34_, anLocalInt_33_, argument_8_);
		    } else {
			int anLocalInt_35_
			    = (anLocalInt <= anLocalInt_14_ ? anLocalInt_14_
			       : Exception_Sub1.anIntArray48[anLocalInt]);
			int anLocalInt_36_ = (Node_Sub31_Sub8.method897
					      (argument_10_ + anLocalInt_35_,
                                  Node_Sub35.anInt4156,
                                  argument_6_ + 124914962,
                                  Node_Sub9_Sub2.anInt5776));
			int anLocalInt_37_ = (Node_Sub31_Sub8.method897
					      (-anLocalInt_35_ + argument_10_,
                                  Node_Sub35.anInt4156,
                                  argument_6_ + 124914962,
                                  Node_Sub9_Sub2.anInt5776));
			if (anLocalInt_32_ <= Node_Sub31_Sub13.anInt5896) {
			    int[] anLocalInts
				= Class223.anIntArrayArray1562[anLocalInt_32_];
			    Statics.method3364(anLocalInts, (byte) -80, anLocalInt_34_, anLocalInt_37_, argument_8_);
			    Statics.method3364(anLocalInts, (byte) -115, anLocalInt_37_, anLocalInt_36_, argument_5_);
			    Statics.method3364(anLocalInts, (byte) -124, anLocalInt_36_, anLocalInt_33_, argument_8_);
			}
			if (anLocalInt_31_ >= Class209.anInt1504) {
			    int[] anLocalInts
				= Class223.anIntArrayArray1562[anLocalInt_31_];
			    Statics.method3364(anLocalInts, (byte) 83, anLocalInt_34_, anLocalInt_37_, argument_8_);
			    Statics.method3364(anLocalInts, (byte) -37, anLocalInt_37_, anLocalInt_36_, argument_5_);
			    Statics.method3364(anLocalInts, (byte) 114, anLocalInt_36_, anLocalInt_33_, argument_8_);
			}
		    }
		}
	    }
	}
    }
    
    final int[] method867(byte argument_38_, int argument_39_) {
	if (argument_38_ < 21)
	    return null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_39_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Class82.anIntArray585[argument_39_];
	    if (anInt5871 == 0) {
		int anLocalInt_40_ = 0;
		for (int anLocalInt_41_ = 0; anLocalInt_41_ < anInt5869;
		     anLocalInt_41_++) {
		    if (anIntArray5866[anLocalInt_41_] <= anLocalInt
			&& anLocalInt < anIntArray5866[anLocalInt_41_ + 1]) {
			if (anLocalInt < anIntArray5868[anLocalInt_41_])
			    anLocalInt_40_ = 4096;
			break;
		    }
		}
		JagStrings.memset(anLocalInts, 0, Statics.anInt294, anLocalInt_40_);
	    } else {
		for (int anLocalInt_42_ = 0; anLocalInt_42_ < Statics.anInt294;
		     anLocalInt_42_++) {
		    int anLocalInt_43_ = 0;
		    int anLocalInt_44_ = 0;
		    int anLocalInt_45_
			= Class130.anIntArray1053[anLocalInt_42_];
		    int anLocalInt_46_ = anInt5871;
		while_128_:
		    do {
			do {
			    if (anLocalInt_46_ != 1) {
				if (anLocalInt_46_ != 2) {
				    if (anLocalInt_46_ == 3)
					break;
				    break while_128_;
				}
			    } else {
				anLocalInt_43_ = anLocalInt_45_;
				break while_128_;
			    }
			    anLocalInt_43_
				= ((anLocalInt_45_ + anLocalInt - 4096 >> 1)
				   + 2048);
			    break while_128_;
			} while (false);
			anLocalInt_43_
			    = (-anLocalInt + anLocalInt_45_ >> 1) + 2048;
		    } while (false);
		    for (anLocalInt_46_ = 0; anLocalInt_46_ < anInt5869;
			 anLocalInt_46_++) {
			if (anLocalInt_43_ >= anIntArray5866[anLocalInt_46_]
			    && (anLocalInt_43_
				< anIntArray5866[anLocalInt_46_ + 1])) {
			    if (anIntArray5868[anLocalInt_46_]
				> anLocalInt_43_)
				anLocalInt_44_ = 4096;
			    break;
			}
		    }
		    anLocalInts[anLocalInt_42_] = anLocalInt_44_;
		}
	    }
	}
	return anLocalInts;
    }
    
    private final void method896(int argument_47_) {
	anIntArray5868 = new int[anInt5869 + 1];
	int anLocalInt = 0;
	anIntArray5866 = new int[anInt5869 + 1];
	if (argument_47_ >= 109) {
	    int anLocalInt_48_ = 4096 / anInt5869;
	    int anLocalInt_49_ = anInt5870 * anLocalInt_48_ >> 12;
	    for (int anLocalInt_50_ = 0; anInt5869 > anLocalInt_50_;
		 anLocalInt_50_++) {
		anIntArray5866[anLocalInt_50_] = anLocalInt;
		anIntArray5868[anLocalInt_50_] = anLocalInt_49_ + anLocalInt;
		anLocalInt += anLocalInt_48_;
	    }
	    anIntArray5866[anInt5869] = 4096;
	    anIntArray5868[anInt5869] = anIntArray5868[0] + 4096;
	}
    }
}
