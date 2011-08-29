/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class229
{
    private int[] anIntArray1653 = new int[2];
    private static float[][] aFloatArrayArray1654;
    static int anInt1655;
    private int[][][] anIntArrayArrayArray1656;
    static int[][] anIntArrayArray1657 = new int[2][8];
    int[] anIntArray1658 = new int[2];
    private int[][][] anIntArrayArrayArray1659 = new int[2][2][4];
    private static float aFloat1660;
    
    public static void method3064() {
	aFloatArrayArray1654 = null;
	anIntArrayArray1657 = null;
    }
    
    final int method3065(int argument_0_, float argument_1_) {
	if (argument_0_ == 0) {
	    float f = ((float) anIntArray1653[0]
		       + ((float) (anIntArray1653[1] - anIntArray1653[0])
			  * argument_1_));
	    f *= 0.0030517578F;
	    aFloat1660 = (float) Math.pow(0.1, (double) (f / 20.0F));
	    anInt1655 = (int) (aFloat1660 * 65536.0F);
	}
	if (((Class229) this).anIntArray1658[argument_0_] == 0)
	    return 0;
	float f = method3066(argument_0_, 0, argument_1_);
	aFloatArrayArray1654[argument_0_][0]
	    = f * -2.0F * (float) Math.cos((double) method3068(argument_0_, 0,
							       argument_1_));
	aFloatArrayArray1654[argument_0_][1] = f * f;
	for (int anLocalInt = 1;
	     anLocalInt < ((Class229) this).anIntArray1658[argument_0_];
	     anLocalInt++) {
	    f = method3066(argument_0_, anLocalInt, argument_1_);
	    float f_2_
		= (f * -2.0F
		   * (float) Math.cos((double) method3068(argument_0_,
							  anLocalInt,
							  argument_1_)));
	    float f_3_ = f * f;
	    aFloatArrayArray1654[argument_0_][anLocalInt * 2 + 1]
		= aFloatArrayArray1654[argument_0_][anLocalInt * 2 - 1] * f_3_;
	    aFloatArrayArray1654[argument_0_][anLocalInt * 2]
		= (aFloatArrayArray1654[argument_0_][anLocalInt * 2 - 1] * f_2_
		   + (aFloatArrayArray1654[argument_0_][anLocalInt * 2 - 2]
		      * f_3_));
	    for (int anLocalInt_4_ = anLocalInt * 2 - 1; anLocalInt_4_ >= 2;
		 anLocalInt_4_--)
		aFloatArrayArray1654[argument_0_][anLocalInt_4_]
		    += ((aFloatArrayArray1654[argument_0_][anLocalInt_4_ - 1]
			 * f_2_)
			+ (aFloatArrayArray1654[argument_0_][anLocalInt_4_ - 2]
			   * f_3_));
	    aFloatArrayArray1654[argument_0_][1]
		+= aFloatArrayArray1654[argument_0_][0] * f_2_ + f_3_;
	    aFloatArrayArray1654[argument_0_][0] += f_2_;
	}
	if (argument_0_ == 0) {
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class229) this).anIntArray1658[0] * 2;
		 anLocalInt++)
		aFloatArrayArray1654[0][anLocalInt] *= aFloat1660;
	}
	for (int anLocalInt = 0;
	     anLocalInt < ((Class229) this).anIntArray1658[argument_0_] * 2;
	     anLocalInt++)
	    anIntArrayArray1657[argument_0_][anLocalInt]
		= (int) (aFloatArrayArray1654[argument_0_][anLocalInt]
			 * 65536.0F);
	return ((Class229) this).anIntArray1658[argument_0_] * 2;
    }
    
    private final float method3066(int argument_5_, int argument_6_,
				   float argument_7_) {
	float f
	    = ((float) anIntArrayArrayArray1656[argument_5_][0][argument_6_]
	       + argument_7_ * (float) ((anIntArrayArrayArray1656[argument_5_]
					 [1][argument_6_])
					- (anIntArrayArrayArray1656
					   [argument_5_][0][argument_6_])));
	f *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
    }
    
    final void method3067(Packet argument_8_, Class357 argument_9_) {
	int anLocalInt = argument_8_.g1();
	((Class229) this).anIntArray1658[0] = anLocalInt >> 4;
	((Class229) this).anIntArray1658[1] = anLocalInt & 0xf;
	if (anLocalInt != 0) {
	    anIntArray1653[0] = argument_8_.g2();
	    anIntArray1653[1] = argument_8_.g2();
	    int anLocalInt_10_ = argument_8_.g1();
	    for (int anLocalInt_11_ = 0; anLocalInt_11_ < 2;
		 anLocalInt_11_++) {
		for (int anLocalInt_12_ = 0;
		     (anLocalInt_12_
		      < ((Class229) this).anIntArray1658[anLocalInt_11_]);
		     anLocalInt_12_++) {
		    anIntArrayArrayArray1659[anLocalInt_11_][0][anLocalInt_12_]
			= argument_8_.g2();
		    anIntArrayArrayArray1656[anLocalInt_11_][0][anLocalInt_12_]
			= argument_8_.g2();
		}
	    }
	    for (int anLocalInt_13_ = 0; anLocalInt_13_ < 2;
		 anLocalInt_13_++) {
		for (int anLocalInt_14_ = 0;
		     (anLocalInt_14_
		      < ((Class229) this).anIntArray1658[anLocalInt_13_]);
		     anLocalInt_14_++) {
		    if ((anLocalInt_10_
			 & 1 << anLocalInt_13_ * 4 << anLocalInt_14_)
			!= 0) {
			anIntArrayArrayArray1659[anLocalInt_13_][1]
			    [anLocalInt_14_]
			    = argument_8_.g2();
			anIntArrayArrayArray1656[anLocalInt_13_][1]
			    [anLocalInt_14_]
			    = argument_8_.g2();
		    } else {
			anIntArrayArrayArray1659[anLocalInt_13_][1]
			    [anLocalInt_14_]
			    = (anIntArrayArrayArray1659[anLocalInt_13_][0]
			       [anLocalInt_14_]);
			anIntArrayArrayArray1656[anLocalInt_13_][1]
			    [anLocalInt_14_]
			    = (anIntArrayArrayArray1656[anLocalInt_13_][0]
			       [anLocalInt_14_]);
		    }
		}
	    }
	    if (anLocalInt_10_ != 0 || anIntArray1653[1] != anIntArray1653[0])
		argument_9_.method3937(argument_8_);
	} else
	    anIntArray1653[0] = anIntArray1653[1] = 0;
    }
    
    private final float method3068(int argument_15_, int argument_16_,
				   float argument_17_) {
	float f
	    = ((float) anIntArrayArrayArray1659[argument_15_][0][argument_16_]
	       + argument_17_ * (float) ((anIntArrayArrayArray1659
					  [argument_15_][1][argument_16_])
					 - (anIntArrayArrayArray1659
					    [argument_15_][0][argument_16_])));
	f *= 1.2207031E-4F;
	return method3069(f);
    }
    
    private static final float method3069(float argument) {
	float f = (float) Math.pow(2.0, (double) argument) * 32.703197F;
	return f * 3.1415927F / 11025.0F;
    }
    
    public Class229() {
	anIntArrayArrayArray1656 = new int[2][2][4];
    }
    
    static {
	aFloatArrayArray1654 = new float[2][8];
    }
}
