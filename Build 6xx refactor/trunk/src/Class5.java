/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5
{
    static int[] anIntArray65;
    static int anInt66 = 100;
    static int anInt67;
    
    static final void method220
	(int argument, int argument_0_, byte argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_) {
	if (argument_2_ >= Node_Sub35.anInt4156
	    && argument_2_ <= Node_Sub9_Sub2.anInt5776
	    && Node_Sub35.anInt4156 <= argument_3_
	    && Node_Sub9_Sub2.anInt5776 >= argument_3_
	    && Node_Sub35.anInt4156 <= argument_0_
	    && argument_0_ <= Node_Sub9_Sub2.anInt5776
	    && argument_5_ >= Node_Sub35.anInt4156
	    && argument_5_ <= Node_Sub9_Sub2.anInt5776
	    && argument >= Class209.anInt1504
	    && Node_Sub31_Sub13.anInt5896 >= argument
	    && argument_4_ >= Class209.anInt1504
	    && Node_Sub31_Sub13.anInt5896 >= argument_4_
	    && Class209.anInt1504 <= argument_7_
	    && Node_Sub31_Sub13.anInt5896 >= argument_7_
	    && Class209.anInt1504 <= argument_6_
	    && Node_Sub31_Sub13.anInt5896 >= argument_6_)
	    Class251.method3239(argument_4_, argument_5_, argument_2_,
				argument_7_, argument_3_, 120, argument_0_,
				argument_8_, argument_6_, argument);
	else
	    Class345.method3804(argument_5_, argument_4_, argument_3_, 11922,
				argument_6_, argument, argument_7_,
				argument_0_, argument_8_, argument_2_);
    }
    
    static final boolean method221
	(int argument, int argument_9_, int argument_10_, int argument_11_,
	 int argument_12_, int argument_13_, int argument_14_,
	 int argument_15_, int argument_16_, int argument_17_) {
	if (!Node_Sub24.method753(argument_13_, argument, argument_12_,
            argument_14_))
	    return false;
	argument = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[1];
	argument_13_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2];
	argument_12_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0];
	if (!Node_Sub24.method753(argument_16_, argument_15_, argument_11_,
            1))
	    return false;
	argument_16_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2];
	argument_11_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0];
	argument_15_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[argument_14_];
	if (!Node_Sub24.method753(argument_17_, argument_10_, argument_9_,
            1))
	    return false;
	argument_10_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[1];
	argument_17_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2];
	argument_9_ = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0];
	return Class217.method3015(argument_12_, argument_9_, argument_11_,
				   argument_16_, 0, argument_17_, argument_10_,
				   argument, argument_15_, argument_13_);
    }
    
    static final void method222(int argument, int argument_18_,
				int argument_19_, int argument_20_,
				int argument_21_, int argument_22_,
				int argument_23_, int argument_24_) {
	int anLocalInt = argument - argument_19_;
	int anLocalInt_25_ = argument_24_ + argument_19_;
	for (int anLocalInt_26_ = argument_24_;
	     anLocalInt_25_ > anLocalInt_26_; anLocalInt_26_++)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_26_], (byte) 114, argument_22_, argument_23_, argument_20_);
	int anLocalInt_27_ = -argument_19_ + argument_23_;
	for (int anLocalInt_28_ = argument; anLocalInt < anLocalInt_28_;
	     anLocalInt_28_--)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_28_], (byte) -49, argument_22_, argument_23_, argument_20_);
	int anLocalInt_29_ = argument_19_ + argument_22_;
	for (int anLocalInt_30_ = anLocalInt_25_; anLocalInt_30_ <= anLocalInt;
	     anLocalInt_30_++) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[anLocalInt_30_];
	    Statics.method3364(anLocalInts, (byte) 82, argument_22_, anLocalInt_29_, argument_20_);
	    Statics.method3364(anLocalInts, (byte) -112, anLocalInt_29_, anLocalInt_27_, argument_21_);
	    Statics.method3364(anLocalInts, (byte) 76, anLocalInt_27_, argument_23_, argument_20_);
	}
    }
    
    static final void method223(Js5Store argument, int[] argument_31_,
				Js5Store argument_32_, byte argument_33_) {
	if (argument_31_ != null)
	    Class298.anIntArray2476 = argument_31_;
	Node_Sub33.aJs5Store_4149 = argument;
	Statics.aJs5Store_5741 = argument_32_;
    }
    
    public static void method224(int argument) {
	anIntArray65 = null;
    }
    
    static final void method225(byte argument) {
	synchronized (Node_Sub38.aClass149_4190) {
	    Node_Sub38.aClass149_4190.clear((byte) -3);
	}
	synchronized (Class165.aClass149_1210) {
	    Class165.aClass149_1210.clear((byte) -3);
	}
    }
    
    static final void method226
	(float[] argument, int argument_34_, int argument_35_,
	 int argument_36_, int argument_37_, int argument_38_,
	 float[] argument_39_, int argument_40_, boolean argument_41_,
	 int argument_42_, float argument_43_) {
	argument_38_ -= argument_36_;
	argument_37_ -= argument_40_;
	argument_35_ -= argument_34_;
	float f = ((float) argument_37_ * argument_39_[2]
		   + ((float) argument_35_ * argument_39_[0]
		      + argument_39_[1] * (float) argument_38_));
	float f_44_ = (argument_39_[5] * (float) argument_37_
		       + ((float) argument_35_ * argument_39_[3]
			  + argument_39_[4] * (float) argument_38_));
	float f_45_ = (argument_39_[8] * (float) argument_37_
		       + ((float) argument_38_ * argument_39_[7]
			  + argument_39_[6] * (float) argument_35_));
	float f_46_ = (float) Math.sqrt((double) (f_44_ * f_44_ + f * f
						  + f_45_ * f_45_));
	float f_47_
	    = ((float) Math.atan2((double) f, (double) f_45_) / 6.2831855F
	       + 0.5F);
	float f_48_
	    = (argument_43_
	       + ((float) Math.asin((double) (f_44_ / f_46_)) / 3.1415927F
		  + 0.5F));
	if (argument_42_ == 1) {
	    float f_49_ = f_47_;
	    f_47_ = -f_48_;
	    f_48_ = f_49_;
	} else if (argument_42_ != 2) {
	    if (argument_42_ == 3) {
		float f_50_ = f_47_;
		f_47_ = f_48_;
		f_48_ = -f_50_;
	    }
	} else {
	    f_48_ = -f_48_;
	    f_47_ = -f_47_;
	}
	argument[0] = f_47_;
	argument[1] = f_48_;
    }
}
