/* Class111_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class111_Sub1 extends Class111
{
    private int[] anIntArray4611 = new int[512];
    static Class166 aClass166_4612 = new Class166(78, 1);
    static int[] anIntArray4613;
    static Class149 aClass149_4614 = new Class149(30);
    
    public static void method1993(int argument) {
	anIntArray4613 = null;
	aClass149_4614 = null;
	aClass166_4612 = null;
    }
    
    final void method1992(float argument_0_, int argument_1_,
			  float argument_2_, int argument_3_, int argument_4_,
			  float argument_5_, int argument_6_, int argument_7_,
			  float argument_8_, float[] argument_9_,
			  int argument_10_) {
	int anLocalInt = (int) (argument_0_ * (float) argument_1_ + -1.0F);
	anLocalInt &= 0xff;
	int anLocalInt_11_ = (int) (argument_5_ * (float) argument_6_ + -1.0F);
	anLocalInt_11_ &= 0xff;
	int anLocalInt_12_
	    = (int) ((float) argument_10_ * argument_2_ + -1.0F);
	anLocalInt_12_ &= 0xff;
	float f = argument_2_ * (float) argument_3_;
	int anLocalInt_13_ = (int) f;
	int anLocalInt_14_ = anLocalInt_13_ + 1;
	float f_15_ = f - (float) anLocalInt_13_;
	float f_16_ = -f_15_ + 1.0F;
	float f_17_ = Class52.method477((byte) -6, f_15_);
	anLocalInt_14_ &= anLocalInt_12_;
	anLocalInt_13_ &= anLocalInt_12_;
	if (argument_7_ > -74)
	    anIntArray4611 = null;
	int anLocalInt_18_ = anIntArray4611[anLocalInt_13_];
	int anLocalInt_19_ = anIntArray4611[anLocalInt_14_];
	for (int anLocalInt_20_ = 0; anLocalInt_20_ < argument_6_;
	     anLocalInt_20_++) {
	    float f_21_ = argument_5_ * (float) anLocalInt_20_;
	    int anLocalInt_22_ = (int) f_21_;
	    int anLocalInt_23_ = anLocalInt_22_ + 1;
	    float f_24_ = (float) -anLocalInt_22_ + f_21_;
	    float f_25_ = 1.0F - f_24_;
	    anLocalInt_23_ &= anLocalInt_11_;
	    float f_26_ = Class52.method477((byte) -6, f_24_);
	    anLocalInt_22_ &= anLocalInt_11_;
	    int anLocalInt_27_
		= anIntArray4611[anLocalInt_18_ + anLocalInt_22_];
	    int anLocalInt_28_
		= anIntArray4611[anLocalInt_23_ + anLocalInt_18_];
	    int anLocalInt_29_
		= anIntArray4611[anLocalInt_22_ + anLocalInt_19_];
	    int anLocalInt_30_
		= anIntArray4611[anLocalInt_23_ + anLocalInt_19_];
	    for (int anLocalInt_31_ = 0; argument_1_ > anLocalInt_31_;
		 anLocalInt_31_++) {
		float f_32_ = (float) anLocalInt_31_ * argument_0_;
		int anLocalInt_33_ = (int) f_32_;
		int anLocalInt_34_ = anLocalInt_33_ + 1;
		float f_35_ = (float) -anLocalInt_33_ + f_32_;
		float f_36_ = -f_35_ + 1.0F;
		anLocalInt_33_ &= anLocalInt;
		float f_37_ = Class52.method477((byte) -6, f_35_);
		anLocalInt_34_ &= anLocalInt;
		argument_9_[argument_4_++]
		    = (argument_8_
		       * (Node_Sub49.method1156
			  ((Node_Sub49.method1156
                      ((Node_Sub49.method1156
                              ((Class344.method3800
                                      (f_25_, f_36_, -5853, f_16_,
                                              MathStatics.AND((anIntArray4611[(anLocalInt_27_ + anLocalInt_33_)]), 7))),
                                      0, f_37_,
                                      (Class344.method3800
                                              (f_25_, f_35_, -5853, f_16_,
                                                      MathStatics.AND((anIntArray4611[(anLocalInt_27_ + anLocalInt_34_)]), 7))))),
                              0, f_26_,
                              (Node_Sub49.method1156
                                      ((Class344.method3800
                                              (f_24_, f_36_, -5853, f_16_,
                                                      MathStatics.AND((anIntArray4611[(anLocalInt_33_ + anLocalInt_28_)]), 7))),
                                              0, f_37_,
                                              (Class344.method3800
                                                      (f_24_, f_35_, -5853, f_16_,
                                                              MathStatics.AND((anIntArray4611[(anLocalInt_28_ + anLocalInt_34_)]), 7))))))),
                      0, f_17_,
                      (Node_Sub49.method1156
                              ((Node_Sub49.method1156
                                      (Class344.method3800(f_25_, f_36_, -5853, f_15_,
                                              (MathStatics.AND(7, (anIntArray4611[(anLocalInt_33_ + anLocalInt_29_)])))),
                                              0, f_37_,
                                              (Class344.method3800
                                                      (f_25_, f_35_, -5853, f_15_,
                                                              MathStatics.AND((anIntArray4611[(anLocalInt_34_ + anLocalInt_29_)]), 7))))),
                                      0, f_26_,
                                      (Node_Sub49.method1156
                                              (Class344.method3800(f_24_, f_36_, -5853, f_15_,
                                                      (MathStatics.AND(7, (anIntArray4611[(anLocalInt_30_ + anLocalInt_33_)])))),
                                                      0, f_37_,
                                                      (Class344.method3800
                                                              (f_24_, f_35_, -5853, f_15_,
                                                                      MathStatics.AND((anIntArray4611[(anLocalInt_34_ + anLocalInt_30_)]), 7))))))))));
	    }
	}
    }
    
    Class111_Sub1(int argument_38_) {
	Random random = new Random((long) argument_38_);
	for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++)
	    anIntArray4611[anLocalInt] = anIntArray4611[anLocalInt + 256]
		= anLocalInt;
	for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
	    int anLocalInt_39_ = random.nextInt() & 0xff;
	    int anLocalInt_40_ = anIntArray4611[anLocalInt_39_];
	    anIntArray4611[anLocalInt_39_]
		= anIntArray4611[anLocalInt_39_ + 256]
		= anIntArray4611[anLocalInt];
	    anIntArray4611[anLocalInt] = anIntArray4611[anLocalInt + 256]
		= anLocalInt_40_;
	}
    }
    
    static final void method1994
	(RsInterface argument, int argument_41_, long argument_42_,
	 byte argument_43_, int argument_44_, int argument_45_,
	 int argument_46_, Class_aa argument_47_, int argument_48_) {
	int anLocalInt
	    = argument_44_ * argument_44_ + argument_48_ * argument_48_;
	if ((long) anLocalInt <= argument_42_) {
	    int anLocalInt_49_ = Math.min(((RsInterface) argument).renderWidth / 2,
					  ((RsInterface) argument).renderHeight / 2);
	    if (anLocalInt_49_ * anLocalInt_49_ >= anLocalInt)
		Class128.method2420(argument_44_, argument_48_, argument_41_,
				    argument, argument_47_,
				    (Class62_Sub3.aClass368Array4370
				     [argument_45_]),
				    argument_46_, 2);
	    else {
		anLocalInt_49_ -= 10;
		int anLocalInt_50_;
		if (Statics.anInt1745 == 4)
		    anLocalInt_50_ = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
		else
		    anLocalInt_50_
			= (Class2_Sub10.anInt3824
			   + (int) DoublyLinkedNodeP2_Sub6.aFloat4538) & 0x3fff;
		int anLocalInt_51_
		    = Node_Sub6.SINETABLE[anLocalInt_50_];
		int anLocalInt_52_
		    = Node_Sub6.COSINETABLE[anLocalInt_50_];
		if (Statics.anInt1745 != 4) {
		    anLocalInt_52_
			= anLocalInt_52_ * 256 / (Node_Sub11.anInt3945
						  + 256);
		    anLocalInt_51_
			= anLocalInt_51_ * 256 / (Node_Sub11.anInt3945
						  + 256);
		}
		int anLocalInt_53_ = ((argument_48_ * anLocalInt_51_
				       + argument_44_ * anLocalInt_52_)
				      >> 14);
		int anLocalInt_54_ = ((-(argument_44_ * anLocalInt_51_)
				       + argument_48_ * anLocalInt_52_)
				      >> 14);
		double d = Math.atan2((double) anLocalInt_53_,
				      (double) anLocalInt_54_);
		int anLocalInt_55_
		    = (int) ((double) anLocalInt_49_ * Math.sin(d));
		int anLocalInt_56_
		    = (int) (Math.cos(d) * (double) anLocalInt_49_);
		Node_Sub32_Sub2.aClass368Array6063[argument_45_].method4021
		    (((float) anLocalInt_55_
		      + ((float) argument_46_
			 + (float) ((RsInterface) argument).renderWidth / 2.0F)),
		     ((float) -anLocalInt_56_
		      + ((float) ((RsInterface) argument).renderHeight / 2.0F
			 + (float) argument_41_)),
		     4096, (int) (-d / 6.283185307179586 * 65535.0));
	    }
	}
    }
}
