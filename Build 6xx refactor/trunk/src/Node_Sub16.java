/* Class59_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub16 extends Node
{
    int anInt3994;
    static int anInt3995;
    int anInt3996;
    static boolean aBoolean3997 = false;
    int anInt3998;
    static Class207 aClass207_3999;
    int anInt4000;
    int anInt4001;
    boolean aBoolean4002;
    
    static final void method698(int argument, int argument_0_) {
	if (Class353_Sub6.anInt5507 == 1)
	    Class264.anInt2046 = argument;
	else if (Class353_Sub6.anInt5507 == 2)
	    Node_Sub47.anInt4283 = argument;
    }
    
    static final void method699
	(int argument, float[] argument_1_, int argument_2_, float argument_3_,
	 int argument_4_, int argument_5_, float argument_6_, int argument_7_,
	 int argument_8_, float[] argument_9_, int argument_10_,
	 int argument_11_) {
	argument_5_ -= argument_4_;
	argument_8_ -= argument_7_;
	argument_10_ -= argument;
	float f = (argument_1_[0] * (float) argument_10_
		   + argument_1_[1] * (float) argument_5_
		   + argument_1_[2] * (float) argument_8_);
	float f_12_ = (argument_1_[5] * (float) argument_8_
		       + ((float) argument_10_ * argument_1_[3]
			  + argument_1_[4] * (float) argument_5_));
	float f_13_ = ((float) argument_8_ * argument_1_[8]
		       + ((float) argument_10_ * argument_1_[6]
			  + (float) argument_5_ * argument_1_[7]));
	float f_14_
	    = ((float) Math.atan2((double) f, (double) f_13_) / 6.2831855F
	       + 0.5F);
	if (argument_6_ != 1.0F)
	    f_14_ *= argument_6_;
	float f_15_ = f_12_ + 0.5F + argument_3_;
	if (argument_2_ != 1) {
	    if (argument_2_ == 2) {
		f_15_ = -f_15_;
		f_14_ = -f_14_;
	    } else if (argument_2_ == 3) {
		float f_16_ = f_14_;
		f_14_ = f_15_;
		f_15_ = -f_16_;
	    }
	} else {
	    float f_17_ = f_14_;
	    f_14_ = -f_15_;
	    f_15_ = f_17_;
	}
	argument_9_[0] = f_14_;
	argument_9_[1] = f_15_;
    }
    
    static final int method700(boolean argument) {
	return Class118.anInt967;
    }
    
    static final void method701(int argument, int argument_18_) {
	if (Class295.method3505((byte) -48)) {
	    if (argument_18_ != Class141.anInt1099)
		Node_Sub31_Sub1.aString5837 = "";
	    Class141.anInt1099 = argument_18_;
	    if (Statics.aClass307_2632 != null) {
		Statics.aClass307_2632.method3601(2);
		Statics.aClass307_2632 = null;
	    }
	    Class316.method3638(5, 2);
	}
    }
    
    public static void method702(int argument) {
	aClass207_3999 = null;
    }
    
    Node_Sub16(int argument_19_, int argument_20_, int argument_21_,
               int argument_22_, int argument_23_, boolean argument_24_) {
	((Node_Sub16) this).anInt3998 = argument_23_;
	((Node_Sub16) this).anInt4001 = argument_22_;
	((Node_Sub16) this).anInt3996 = argument_20_;
	((Node_Sub16) this).anInt4000 = argument_19_;
	((Node_Sub16) this).aBoolean4002 = argument_24_;
	((Node_Sub16) this).anInt3994 = argument_21_;
    }
    
    static {
	anInt3995 = -1;
	aClass207_3999 = new Class207(14, 8);
    }
}
