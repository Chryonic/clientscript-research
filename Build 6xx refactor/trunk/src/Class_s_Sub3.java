/* Class_s_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class_s_Sub3 extends Class_s
{
    private int anInt5385;
    private byte[][] aByteArrayArray5386;
    private float aFloat5387;
    private float aFloat5388;
    private Class302[][] aClass302ArrayArray5389;
    private float aFloat5390;
    private Class98[][] aClass98ArrayArray5391;
    private float aFloat5392;
    private float aFloat5393;
    private float aFloat5394;
    private float aFloat5395;
    private float aFloat5396;
    private float aFloat5397;
    private float aFloat5398;
    private Class327[][] aClass327ArrayArray5399;
    private Class296[][] aClass296ArrayArray5400;
    private Class238[][] aClass238ArrayArray5401;
    private int anInt5402 = -1;
    private byte[][] aByteArrayArray5403;
    private JavaToolkit aClass_ha__5404;
    private float aFloat5405;
    private float aFloat5406;
    
    private static final int method3555(int argument, int argument_0_) {
	int anLocalInt = (argument & 0xff0000) * argument_0_ >> 23;
	if (anLocalInt < 2)
	    anLocalInt = 2;
	else if (anLocalInt > 253)
	    anLocalInt = 253;
	int anLocalInt_1_ = (argument & 0xff00) * argument_0_ >> 15;
	if (anLocalInt_1_ < 2)
	    anLocalInt_1_ = 2;
	else if (anLocalInt_1_ > 253)
	    anLocalInt_1_ = 253;
	int anLocalInt_2_ = (argument & 0xff) * argument_0_ >> 7;
	if (anLocalInt_2_ < 2)
	    anLocalInt_2_ = 2;
	else if (anLocalInt_2_ > 253)
	    anLocalInt_2_ = 253;
	return anLocalInt << 16 | anLocalInt_1_ << 8 | anLocalInt_2_;
    }
    
    final void method3536(HardwareLight argument_3_, int[] argument_4_) {
	/* empty */
    }
    
    final void method3533(int argument_5_, int argument_6_, int argument_7_,
			  boolean[][] argument_8_, boolean argument_9_,
			  int argument_10_) {
	Class350_Sub1 class350_sub1
	    = ((JavaToolkit) aClass_ha__5404).aClass350_Sub1_4648;
	anInt5402 = -1;
	aFloat5398 = ((Class350_Sub1) class350_sub1).aFloat5421;
	aFloat5394 = ((Class350_Sub1) class350_sub1).aFloat5425;
	aFloat5397 = ((Class350_Sub1) class350_sub1).aFloat5428;
	aFloat5396 = ((Class350_Sub1) class350_sub1).aFloat5426;
	aFloat5390 = ((Class350_Sub1) class350_sub1).aFloat5420;
	aFloat5395 = ((Class350_Sub1) class350_sub1).aFloat5430;
	aFloat5392 = ((Class350_Sub1) class350_sub1).aFloat5429;
	aFloat5406 = ((Class350_Sub1) class350_sub1).aFloat5424;
	aFloat5388 = ((Class350_Sub1) class350_sub1).aFloat5418;
	aFloat5387 = ((Class350_Sub1) class350_sub1).aFloat5422;
	aFloat5393 = ((Class350_Sub1) class350_sub1).aFloat5419;
	aFloat5405 = ((Class350_Sub1) class350_sub1).aFloat5427;
	for (int anLocalInt = 0; anLocalInt < argument_7_ + argument_7_;
	     anLocalInt++) {
	    for (int anLocalInt_11_ = 0;
		 anLocalInt_11_ < argument_7_ + argument_7_;
		 anLocalInt_11_++) {
		if (argument_8_[anLocalInt][anLocalInt_11_]) {
		    int anLocalInt_12_
			= argument_5_ - argument_7_ + anLocalInt;
		    int anLocalInt_13_
			= argument_6_ - argument_7_ + anLocalInt_11_;
		    if (anLocalInt_12_ >= 0
			&& anLocalInt_12_ < ((Class_s) this).anInt2550
			&& anLocalInt_13_ >= 0
			&& anLocalInt_13_ < ((Class_s) this).anInt2549)
			method3561(anLocalInt_12_, anLocalInt_13_,
				   argument_10_);
		}
	    }
	}
    }
    
    final void YA() {
	aByteArrayArray5386 = null;
	aByteArrayArray5403 = null;
    }
    
    final void wa(tia_sub_35DoublyLinked argument_14_, int argument_15_, int argument_16_,
		  int argument_17_, int argument_18_, boolean argument_19_) {
	/* empty */
    }
    
    private final boolean method3556(int argument_20_) {
	if ((anInt5385 & 0x8) == 0)
	    return false;
	if (argument_20_ == 4)
	    return true;
	if (argument_20_ == 8)
	    return true;
	if (argument_20_ == 9)
	    return true;
	return false;
    }
    
    private final void method3557(int argument_21_, int argument_22_,
				  Class89 argument_23_, int[] argument_24_,
				  int[] argument_25_, int[] argument_26_,
				  int[] argument_27_, int argument_28_) {
	Class238 class238
	    = aClass238ArrayArray5401[argument_21_][argument_22_];
	if (class238 != null) {
	    if ((((Class238) class238).aByte1730 & 0x2) == 0) {
		if (argument_28_ != 0) {
		    if ((((Class238) class238).aByte1730 & 0x4) != 0) {
			if ((argument_28_ & 0x1) != 0)
			    return;
		    } else if ((argument_28_ & 0x2) != 0)
			return;
		}
		int anLocalInt = argument_21_ * ((Class_s) this).anInt2547;
		int anLocalInt_29_ = anLocalInt + ((Class_s) this).anInt2547;
		int anLocalInt_30_ = argument_22_ * ((Class_s) this).anInt2547;
		int anLocalInt_31_
		    = anLocalInt_30_ + ((Class_s) this).anInt2547;
		float f;
		float f_32_;
		float f_33_;
		float f_34_;
		int anLocalInt_35_;
		int anLocalInt_36_;
		int anLocalInt_37_;
		int anLocalInt_38_;
		int anLocalInt_39_;
		int anLocalInt_40_;
		int anLocalInt_41_;
		int anLocalInt_42_;
		if ((((Class238) class238).aByte1730 & 0x1) != 0) {
		    int anLocalInt_43_ = (((Class_s) this).anIntArrayArray2546
					  [argument_21_][argument_22_]);
		    float f_44_ = aFloat5387 * (float) anLocalInt_43_;
		    if (anInt5402 == -1) {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt + f_44_
				+ aFloat5393 * (float) anLocalInt_30_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			f_32_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_ + f_44_
				    + aFloat5393 * (float) anLocalInt_30_));
			if (f_32_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_33_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_ + f_44_
				    + aFloat5393 * (float) anLocalInt_31_));
			if (f_33_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_34_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt + f_44_
				    + aFloat5393 * (float) anLocalInt_31_));
			if (f_34_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
		    } else {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt + f_44_
				+ aFloat5393 * (float) anLocalInt_30_));
			f_32_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_ + f_44_
				    + aFloat5393 * (float) anLocalInt_30_));
			f_33_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_ + f_44_
				    + aFloat5393 * (float) anLocalInt_31_));
			f_34_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt + f_44_
				    + aFloat5393 * (float) anLocalInt_31_));
		    }
		    float f_45_ = aFloat5394 * (float) anLocalInt_43_;
		    float f_46_ = aFloat5395 * (float) anLocalInt_43_;
		    if (anInt5402 == -1) {
			float f_47_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_45_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_35_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_47_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f));
			float f_48_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_46_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_36_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_48_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f));
			float f_49_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_ + f_45_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_37_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_49_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_32_));
			float f_50_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_ + f_46_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_38_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_50_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_32_));
			float f_51_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_ + f_45_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_39_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_51_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_33_));
			float f_52_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_ + f_46_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_40_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_52_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_33_));
			float f_53_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_45_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_41_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_53_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_34_));
			float f_54_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_46_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_42_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_54_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_34_));
		    } else {
			float f_55_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_45_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_35_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_55_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_56_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_46_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_36_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_56_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_57_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_ + f_45_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_37_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_57_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_58_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_ + f_46_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_38_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_58_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_59_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_ + f_45_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_39_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_59_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_60_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_ + f_46_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_40_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_60_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_61_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_45_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_41_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_61_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_62_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_46_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_42_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_62_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
		    }
		} else {
		    int anLocalInt_63_ = (((Class_s) this).anIntArrayArray2546
					  [argument_21_][argument_22_]);
		    int anLocalInt_64_ = (((Class_s) this).anIntArrayArray2546
					  [argument_21_ + 1][argument_22_]);
		    int anLocalInt_65_
			= (((Class_s) this).anIntArrayArray2546
			   [argument_21_ + 1][argument_22_ + 1]);
		    int anLocalInt_66_ = (((Class_s) this).anIntArrayArray2546
					  [argument_21_][argument_22_ + 1]);
		    if (anInt5402 == -1) {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt
				+ aFloat5387 * (float) anLocalInt_63_
				+ aFloat5393 * (float) anLocalInt_30_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			f_32_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_
				    + aFloat5387 * (float) anLocalInt_64_
				    + aFloat5393 * (float) anLocalInt_30_));
			if (f_32_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_33_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_
				    + aFloat5387 * (float) anLocalInt_65_
				    + aFloat5393 * (float) anLocalInt_31_));
			if (f_33_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_34_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt
				    + aFloat5387 * (float) anLocalInt_66_
				    + aFloat5393 * (float) anLocalInt_31_));
			if (f_34_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			float f_67_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_63_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_35_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_67_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f));
			float f_68_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_63_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_36_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_68_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f));
			float f_69_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_
				  + aFloat5394 * (float) anLocalInt_64_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_37_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_69_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_32_));
			float f_70_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_
				  + aFloat5395 * (float) anLocalInt_64_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_38_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_70_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_32_));
			float f_71_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_
				  + aFloat5394 * (float) anLocalInt_65_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_39_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_71_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_33_));
			float f_72_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_
				  + aFloat5395 * (float) anLocalInt_65_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_40_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_72_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_33_));
			float f_73_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_66_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_41_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_73_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f_34_));
			float f_74_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_66_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_42_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_74_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f_34_));
		    } else {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt
				+ aFloat5387 * (float) anLocalInt_63_
				+ aFloat5393 * (float) anLocalInt_30_));
			f_32_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_
				    + aFloat5387 * (float) anLocalInt_64_
				    + aFloat5393 * (float) anLocalInt_30_));
			f_33_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt_29_
				    + aFloat5387 * (float) anLocalInt_65_
				    + aFloat5393 * (float) anLocalInt_31_));
			f_34_ = (aFloat5405
				 + (aFloat5388 * (float) anLocalInt
				    + aFloat5387 * (float) anLocalInt_66_
				    + aFloat5393 * (float) anLocalInt_31_));
			float f_75_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_63_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_35_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_75_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_76_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_63_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_36_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_76_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_77_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_
				  + aFloat5394 * (float) anLocalInt_64_
				  + aFloat5397 * (float) anLocalInt_30_));
			anLocalInt_37_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_77_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_78_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_
				  + aFloat5395 * (float) anLocalInt_64_
				  + aFloat5392 * (float) anLocalInt_30_));
			anLocalInt_38_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_78_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_79_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_29_
				  + aFloat5394 * (float) anLocalInt_65_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_39_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_79_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_80_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_29_
				  + aFloat5395 * (float) anLocalInt_65_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_40_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_80_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_81_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_66_
				  + aFloat5397 * (float) anLocalInt_31_));
			anLocalInt_41_
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_81_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_82_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_66_
				  + aFloat5392 * (float) anLocalInt_31_));
			anLocalInt_42_
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_82_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
		    }
		}
		if (anInt5402 == -1) {
		    if (((anLocalInt_39_ - anLocalInt_41_) * (anLocalInt_38_
							      - anLocalInt_42_)
			 - ((anLocalInt_40_ - anLocalInt_42_)
			    * (anLocalInt_37_ - anLocalInt_41_)))
			> 0) {
			((Class89) argument_23_).aBoolean661
			    = (anLocalInt_39_ < 0 || anLocalInt_41_ < 0
			       || anLocalInt_37_ < 0
			       || (anLocalInt_39_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_41_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_37_
				   > ((Class89) argument_23_).anInt650));
			if (((Class238) class238).aShort1735 >= 0)
			    argument_23_.method1668
				((float) anLocalInt_40_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_39_,
				 (float) anLocalInt_41_,
				 (float) anLocalInt_37_, f_33_, f_34_, f_32_,
				 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1731 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1736 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1732 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 0, 0, 0, 0, ((Class238) class238).aShort1735);
			else
			    argument_23_.method1663
				((float) anLocalInt_40_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_39_,
				 (float) anLocalInt_41_,
				 (float) anLocalInt_37_, (float) (int) f_33_,
				 (float) (int) f_34_, (float) (int) f_32_,
				 (float) (((Class238) class238).aShort1731
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff));
		    }
		    if (((anLocalInt_35_ - anLocalInt_37_) * (anLocalInt_42_
							      - anLocalInt_38_)
			 - ((anLocalInt_36_ - anLocalInt_38_)
			    * (anLocalInt_41_ - anLocalInt_37_)))
			> 0) {
			((Class89) argument_23_).aBoolean661
			    = (anLocalInt_35_ < 0 || anLocalInt_37_ < 0
			       || anLocalInt_41_ < 0
			       || (anLocalInt_35_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_37_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_41_
				   > ((Class89) argument_23_).anInt650));
			if (((Class238) class238).aShort1735 >= 0)
			    argument_23_.method1668
				((float) anLocalInt_36_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_35_,
				 (float) anLocalInt_37_,
				 (float) anLocalInt_41_, f, f_32_, f_34_, 0.0F,
				 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1733 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1732 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1736 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 0, 0, 0, 0, ((Class238) class238).aShort1735);
			else
			    argument_23_.method1663
				((float) anLocalInt_36_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_35_,
				 (float) anLocalInt_37_,
				 (float) anLocalInt_41_, (float) (int) f,
				 (float) (int) f_32_, (float) (int) f_34_,
				 (float) (((Class238) class238).aShort1733
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff));
		    }
		} else {
		    if (((anLocalInt_39_ - anLocalInt_41_) * (anLocalInt_38_
							      - anLocalInt_42_)
			 - ((anLocalInt_40_ - anLocalInt_42_)
			    * (anLocalInt_37_ - anLocalInt_41_)))
			> 0) {
			((Class89) argument_23_).aBoolean661
			    = (anLocalInt_39_ < 0 || anLocalInt_41_ < 0
			       || anLocalInt_37_ < 0
			       || (anLocalInt_39_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_41_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_37_
				   > ((Class89) argument_23_).anInt650));
			if (((Class238) class238).aShort1735 >= 0)
			    argument_23_.method1668
				((float) anLocalInt_40_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_39_,
				 (float) anLocalInt_41_,
				 (float) anLocalInt_37_, f_33_, f_34_, f_32_,
				 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1731 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1736 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1732 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 0, 0, 0, 0, ((Class238) class238).aShort1735);
			else
			    argument_23_.method1663
				((float) anLocalInt_40_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_39_,
				 (float) anLocalInt_41_,
				 (float) anLocalInt_37_, (float) (int) f_33_,
				 (float) (int) f_34_, (float) (int) f_32_,
				 (float) (((Class238) class238).aShort1731
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff));
		    }
		    if (((anLocalInt_35_ - anLocalInt_37_) * (anLocalInt_42_
							      - anLocalInt_38_)
			 - ((anLocalInt_36_ - anLocalInt_38_)
			    * (anLocalInt_41_ - anLocalInt_37_)))
			> 0) {
			((Class89) argument_23_).aBoolean661
			    = (anLocalInt_35_ < 0 || anLocalInt_37_ < 0
			       || anLocalInt_41_ < 0
			       || (anLocalInt_35_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_37_
				   > ((Class89) argument_23_).anInt650)
			       || (anLocalInt_41_
				   > ((Class89) argument_23_).anInt650));
			if (((Class238) class238).aShort1735 >= 0)
			    argument_23_.method1668
				((float) anLocalInt_36_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_35_,
				 (float) anLocalInt_37_,
				 (float) anLocalInt_41_, f, f_32_, f_34_, 0.0F,
				 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1733 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1732 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 ((HslToRgb.table2
				   [((Class238) class238).aShort1736 & 0xffff])
				  & 0xffffff) | ~0xffffff,
				 0, 0, 0, 0, ((Class238) class238).aShort1735);
			else
			    argument_23_.method1663
				((float) anLocalInt_36_,
				 (float) anLocalInt_38_,
				 (float) anLocalInt_42_,
				 (float) anLocalInt_35_,
				 (float) anLocalInt_37_,
				 (float) anLocalInt_41_, (float) (int) f,
				 (float) (int) f_32_, (float) (int) f_34_,
				 (float) (((Class238) class238).aShort1733
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff));
		    }
		}
	    }
	} else {
	    Class302 class302
		= aClass302ArrayArray5389[argument_21_][argument_22_];
	    if (class302 != null) {
		if (argument_28_ != 0) {
		    if ((((Class302) class302).aByte2541 & 0x4) != 0) {
			if ((argument_28_ & 0x1) != 0)
			    return;
		    } else if ((argument_28_ & 0x2) != 0)
			return;
		}
		if (anInt5402 == -1) {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class302) class302).aShort2534;
			 anLocalInt++) {
			int anLocalInt_83_
			    = ((((Class302) class302).aShortArray2544
				[anLocalInt])
			       + (argument_21_ << ((Class_s) this).anInt2548));
			short anLocalInt_84_ = (((Class302) class302)
						.aShortArray2535[anLocalInt]);
			int anLocalInt_85_
			    = ((((Class302) class302).aShortArray2543
				[anLocalInt])
			       + (argument_22_ << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_83_
				      + aFloat5387 * (float) anLocalInt_84_
				      + aFloat5393 * (float) anLocalInt_85_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			float f_86_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_83_
				  + aFloat5394 * (float) anLocalInt_84_
				  + aFloat5397 * (float) anLocalInt_85_));
			float f_87_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_83_
				  + aFloat5395 * (float) anLocalInt_84_
				  + aFloat5392 * (float) anLocalInt_85_));
			argument_24_[anLocalInt]
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_86_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4653) / f));
			argument_25_[anLocalInt]
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_87_ * (float) (((JavaToolkit) aClass_ha__5404)
							 .anInt4645) / f));
			argument_26_[anLocalInt] = (int) f;
		    }
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class302) class302).aShort2534;
			 anLocalInt++) {
			int anLocalInt_88_
			    = ((((Class302) class302).aShortArray2544
				[anLocalInt])
			       + (argument_21_ << ((Class_s) this).anInt2548));
			short anLocalInt_89_ = (((Class302) class302)
						.aShortArray2535[anLocalInt]);
			int anLocalInt_90_
			    = ((((Class302) class302).aShortArray2543
				[anLocalInt])
			       + (argument_22_ << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_88_
				      + aFloat5387 * (float) anLocalInt_89_
				      + aFloat5393 * (float) anLocalInt_90_));
			float f_91_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_88_
				  + aFloat5394 * (float) anLocalInt_89_
				  + aFloat5397 * (float) anLocalInt_90_));
			float f_92_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_88_
				  + aFloat5395 * (float) anLocalInt_89_
				  + aFloat5392 * (float) anLocalInt_90_));
			argument_24_[anLocalInt]
			    = (((Class89) argument_23_).anInt655
			       + (int) (f_91_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			argument_25_[anLocalInt]
			    = (((Class89) argument_23_).anInt648
			       + (int) (f_92_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			argument_26_[anLocalInt] = (int) f;
		    }
		}
		if (((Class302) class302).aShortArray2531 != null) {
		    if (anInt5402 == -1) {
			for (int anLocalInt = 0;
			     anLocalInt < ((Class302) class302).aShort2538;
			     anLocalInt++) {
			    short anLocalInt_93_
				= (((Class302) class302).aShortArray2542
				   [anLocalInt]);
			    short anLocalInt_94_
				= (((Class302) class302).aShortArray2539
				   [anLocalInt]);
			    short anLocalInt_95_
				= (((Class302) class302).aShortArray2540
				   [anLocalInt]);
			    int anLocalInt_96_ = argument_24_[anLocalInt_93_];
			    int anLocalInt_97_ = argument_24_[anLocalInt_94_];
			    int anLocalInt_98_ = argument_24_[anLocalInt_95_];
			    int anLocalInt_99_ = argument_25_[anLocalInt_93_];
			    int anLocalInt_100_ = argument_25_[anLocalInt_94_];
			    int anLocalInt_101_ = argument_25_[anLocalInt_95_];
			    if ((((anLocalInt_96_ - anLocalInt_97_)
				  * (anLocalInt_101_ - anLocalInt_100_))
				 - ((anLocalInt_99_ - anLocalInt_100_)
				    * (anLocalInt_98_ - anLocalInt_97_)))
				> 0) {
				((Class89) argument_23_).aBoolean661
				    = (anLocalInt_96_ < 0 || anLocalInt_97_ < 0
				       || anLocalInt_98_ < 0
				       || (anLocalInt_96_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_97_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_98_
					   > (((Class89) argument_23_)
					      .anInt650)));
				short anLocalInt_102_
				    = (((Class302) class302).aShortArray2531
				       [anLocalInt]);
				if (anLocalInt_102_ != -1)
				    argument_23_.method1668
					((float) anLocalInt_99_,
					 (float) anLocalInt_100_,
					 (float) anLocalInt_101_,
					 (float) anLocalInt_96_,
					 (float) anLocalInt_97_,
					 (float) anLocalInt_98_,
					 (float) argument_26_[anLocalInt_93_],
					 (float) argument_26_[anLocalInt_94_],
					 (float) argument_26_[anLocalInt_95_],
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_93_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_94_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_95_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_93_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_94_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_95_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_93_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_94_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_95_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 0, 0, 0, 0, anLocalInt_102_);
				else {
				    int anLocalInt_103_
					= (((Class302) class302).anIntArray2532
					   [anLocalInt]);
				    if (anLocalInt_103_ != -1)
					argument_23_.method1663
					    ((float) anLocalInt_99_,
					     (float) anLocalInt_100_,
					     (float) anLocalInt_101_,
					     (float) anLocalInt_96_,
					     (float) anLocalInt_97_,
					     (float) anLocalInt_98_,
					     (float) (argument_26_
						      [anLocalInt_93_]),
					     (float) (argument_26_
						      [anLocalInt_94_]),
					     (float) (argument_26_
						      [anLocalInt_95_]),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_93_]),
						       anLocalInt_103_,
						       (byte) -42)),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_94_]),
						       anLocalInt_103_,
						       (byte) -15)),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_95_]),
						       anLocalInt_103_,
						       (byte) -123)));
				}
			    }
			}
		    } else {
			for (int anLocalInt = 0;
			     anLocalInt < ((Class302) class302).aShort2538;
			     anLocalInt++) {
			    short anLocalInt_104_
				= (((Class302) class302).aShortArray2542
				   [anLocalInt]);
			    short anLocalInt_105_
				= (((Class302) class302).aShortArray2539
				   [anLocalInt]);
			    short anLocalInt_106_
				= (((Class302) class302).aShortArray2540
				   [anLocalInt]);
			    int anLocalInt_107_
				= argument_24_[anLocalInt_104_];
			    int anLocalInt_108_
				= argument_24_[anLocalInt_105_];
			    int anLocalInt_109_
				= argument_24_[anLocalInt_106_];
			    int anLocalInt_110_
				= argument_25_[anLocalInt_104_];
			    int anLocalInt_111_
				= argument_25_[anLocalInt_105_];
			    int anLocalInt_112_
				= argument_25_[anLocalInt_106_];
			    if ((((anLocalInt_107_ - anLocalInt_108_)
				  * (anLocalInt_112_ - anLocalInt_111_))
				 - ((anLocalInt_110_ - anLocalInt_111_)
				    * (anLocalInt_109_ - anLocalInt_108_)))
				> 0) {
				((Class89) argument_23_).aBoolean661
				    = (anLocalInt_107_ < 0
				       || anLocalInt_108_ < 0
				       || anLocalInt_109_ < 0
				       || (anLocalInt_107_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_108_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_109_
					   > (((Class89) argument_23_)
					      .anInt650)));
				short anLocalInt_113_
				    = (((Class302) class302).aShortArray2531
				       [anLocalInt]);
				if (anLocalInt_113_ != -1)
				    argument_23_.method1668
					((float) anLocalInt_110_,
					 (float) anLocalInt_111_,
					 (float) anLocalInt_112_,
					 (float) anLocalInt_107_,
					 (float) anLocalInt_108_,
					 (float) anLocalInt_109_,
					 (float) argument_26_[anLocalInt_104_],
					 (float) argument_26_[anLocalInt_105_],
					 (float) argument_26_[anLocalInt_106_],
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_104_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_105_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2544
						   [anLocalInt_106_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_104_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_105_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 ((float) (((Class302) class302)
						   .aShortArray2543
						   [anLocalInt_106_])
					  / (float) (((Class_s) this)
						     .anInt2547)),
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_104_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_105_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 (HslToRgb.table2
					  [((((Class302) class302)
					     .aShortArray2537[anLocalInt_106_])
					    & 0xffff)]) & 0xffffff | ~0xffffff,
					 0, 0, 0, 0, anLocalInt_113_);
				else {
				    int anLocalInt_114_
					= (((Class302) class302).anIntArray2532
					   [anLocalInt]);
				    if (anLocalInt_114_ != -1)
					argument_23_.method1663
					    ((float) anLocalInt_110_,
					     (float) anLocalInt_111_,
					     (float) anLocalInt_112_,
					     (float) anLocalInt_107_,
					     (float) anLocalInt_108_,
					     (float) anLocalInt_109_,
					     (float) (argument_26_
						      [anLocalInt_104_]),
					     (float) (argument_26_
						      [anLocalInt_105_]),
					     (float) (argument_26_
						      [anLocalInt_106_]),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_104_]),
						       anLocalInt_114_,
						       (byte) -97)),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_105_]),
						       anLocalInt_114_,
						       (byte) -27)),
					     (float) (Class383.method4111
						      ((((Class302) class302)
							.aShortArray2537
							[anLocalInt_106_]),
						       anLocalInt_114_,
						       (byte) -17)));
				}
			    }
			}
		    }
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class302) class302).aShort2538;
			 anLocalInt++) {
			short anLocalInt_115_ = (((Class302) class302)
						 .aShortArray2542[anLocalInt]);
			short anLocalInt_116_ = (((Class302) class302)
						 .aShortArray2539[anLocalInt]);
			short anLocalInt_117_ = (((Class302) class302)
						 .aShortArray2540[anLocalInt]);
			int anLocalInt_118_ = argument_24_[anLocalInt_115_];
			int anLocalInt_119_ = argument_24_[anLocalInt_116_];
			int anLocalInt_120_ = argument_24_[anLocalInt_117_];
			int anLocalInt_121_ = argument_25_[anLocalInt_115_];
			int anLocalInt_122_ = argument_25_[anLocalInt_116_];
			int anLocalInt_123_ = argument_25_[anLocalInt_117_];
			if ((((anLocalInt_118_ - anLocalInt_119_)
			      * (anLocalInt_123_ - anLocalInt_122_))
			     - ((anLocalInt_121_ - anLocalInt_122_)
				* (anLocalInt_120_ - anLocalInt_119_)))
			    > 0) {
			    int anLocalInt_124_
				= (((Class302) class302).anIntArray2532
				   [anLocalInt]);
			    if (anLocalInt_124_ != -1) {
				((Class89) argument_23_).aBoolean661
				    = (anLocalInt_118_ < 0
				       || anLocalInt_119_ < 0
				       || anLocalInt_120_ < 0
				       || (anLocalInt_118_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_119_
					   > ((Class89) argument_23_).anInt650)
				       || (anLocalInt_120_
					   > (((Class89) argument_23_)
					      .anInt650)));
				argument_23_.method1663
				    ((float) anLocalInt_121_,
				     (float) anLocalInt_122_,
				     (float) anLocalInt_123_,
				     (float) anLocalInt_118_,
				     (float) anLocalInt_119_,
				     (float) anLocalInt_120_,
				     (float) argument_26_[anLocalInt_115_],
				     (float) argument_26_[anLocalInt_116_],
				     (float) argument_26_[anLocalInt_117_],
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_115_]),
					       anLocalInt_124_, (byte) -75)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_116_]),
					       anLocalInt_124_, (byte) -35)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_117_]),
					       anLocalInt_124_, (byte) -127)));
			    }
			}
		    }
		}
	    }
	}
    }
    
    private final void method3558
	(int argument_125_, int argument_126_, int argument_127_,
	 int argument_128_, int argument_129_, int argument_130_,
	 int argument_131_, boolean[][] argument_132_, Class293 argument_133_,
	 Class89 argument_134_, int[] argument_135_, int[] argument_136_) {
	int anLocalInt = (argument_131_ - argument_129_) * argument_127_ / 256;
	int anLocalInt_137_ = argument_127_ >> 8;
	boolean anLocalBoolean = ((Class293) argument_133_).aBoolean2415;
	aClass_ha__5404.C(false);
	((Class89) argument_134_).aBoolean647 = false;
	((Class89) argument_134_).aBoolean659 = false;
	int anLocalInt_138_ = argument_125_;
	int anLocalInt_139_ = argument_126_ + anLocalInt;
	for (int anLocalInt_140_ = argument_128_;
	     anLocalInt_140_ < argument_130_; anLocalInt_140_++) {
	    for (int anLocalInt_141_ = argument_129_;
		 anLocalInt_141_ < argument_131_; anLocalInt_141_++) {
		if (argument_132_[anLocalInt_140_ - argument_128_]
		    [anLocalInt_141_ - argument_129_]) {
		    if ((aClass238ArrayArray5401[anLocalInt_140_]
			 [anLocalInt_141_])
			!= null) {
			Class238 class238
			    = (aClass238ArrayArray5401[anLocalInt_140_]
			       [anLocalInt_141_]);
			if (((Class238) class238).aShort1735 != -1
			    && (((Class238) class238).aByte1730 & 0x2) == 0
			    && ((Class238) class238).anInt1734 == -1) {
			    int anLocalInt_142_
				= aClass_ha__5404.method2103(((Class238)
								  class238)
								 .aShort1735);
			    argument_134_.method1663
				((float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 100.0F, 100.0F, 100.0F,
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1731)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -37),
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1736)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -70),
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1732)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -115));
			    argument_134_.method1663
				((float) anLocalInt_139_,
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_, 100.0F, 100.0F,
				 100.0F,
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1733)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -4),
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1732)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -75),
				 (float) Class383.method4111(((((Class238)
								class238)
							       .aShort1736)
							      & 0xffff),
							     anLocalInt_142_,
							     (byte) -95));
			} else if (((Class238) class238).anInt1734 == -1) {
			    argument_134_.method1663
				((float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 100.0F, 100.0F, 100.0F,
				 (float) (((Class238) class238).aShort1731
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff));
			    argument_134_.method1663
				((float) anLocalInt_139_,
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_, 100.0F, 100.0F,
				 100.0F,
				 (float) (((Class238) class238).aShort1733
					  & 0xffff),
				 (float) (((Class238) class238).aShort1732
					  & 0xffff),
				 (float) (((Class238) class238).aShort1736
					  & 0xffff));
			} else {
			    int anLocalInt_143_
				= ((Class238) class238).anInt1734;
			    argument_134_.method1663
				((float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 100.0F, 100.0F, 100.0F,
				 (float) anLocalInt_143_,
				 (float) anLocalInt_143_,
				 (float) anLocalInt_143_);
			    argument_134_.method1663
				((float) anLocalInt_139_,
				 (float) anLocalInt_139_,
				 (float) (anLocalInt_139_ - anLocalInt_137_),
				 (float) anLocalInt_138_,
				 (float) (anLocalInt_138_ + anLocalInt_137_),
				 (float) anLocalInt_138_, 100.0F, 100.0F,
				 100.0F, (float) anLocalInt_143_,
				 (float) anLocalInt_143_,
				 (float) anLocalInt_143_);
			}
		    } else if ((aClass302ArrayArray5389[anLocalInt_140_]
				[anLocalInt_141_])
			       != null) {
			Class302 class302
			    = (aClass302ArrayArray5389[anLocalInt_140_]
			       [anLocalInt_141_]);
			for (int anLocalInt_144_ = 0;
			     (anLocalInt_144_
			      < ((Class302) class302).aShort2534);
			     anLocalInt_144_++) {
			    argument_135_[anLocalInt_144_]
				= (anLocalInt_138_
				   + ((((Class302) class302).aShortArray2544
				       [anLocalInt_144_])
				      * anLocalInt_137_
				      / ((Class_s) this).anInt2547));
			    argument_136_[anLocalInt_144_]
				= (anLocalInt_139_
				   - ((((Class302) class302).aShortArray2543
				       [anLocalInt_144_])
				      * anLocalInt_137_
				      / ((Class_s) this).anInt2547));
			}
			for (int anLocalInt_145_ = 0;
			     (anLocalInt_145_
			      < ((Class302) class302).aShort2538);
			     anLocalInt_145_++) {
			    short anLocalInt_146_
				= (((Class302) class302).aShortArray2542
				   [anLocalInt_145_]);
			    short anLocalInt_147_
				= (((Class302) class302).aShortArray2539
				   [anLocalInt_145_]);
			    short anLocalInt_148_
				= (((Class302) class302).aShortArray2540
				   [anLocalInt_145_]);
			    int anLocalInt_149_
				= argument_135_[anLocalInt_146_];
			    int anLocalInt_150_
				= argument_135_[anLocalInt_147_];
			    int anLocalInt_151_
				= argument_135_[anLocalInt_148_];
			    int anLocalInt_152_
				= argument_136_[anLocalInt_146_];
			    int anLocalInt_153_
				= argument_136_[anLocalInt_147_];
			    int anLocalInt_154_
				= argument_136_[anLocalInt_148_];
			    if (((Class302) class302).anIntArray2536 != null
				&& (((Class302) class302).anIntArray2536
				    [anLocalInt_145_]) != -1) {
				int anLocalInt_155_
				    = (((Class302) class302).anIntArray2536
				       [anLocalInt_145_]);
				argument_134_.method1663
				    ((float) anLocalInt_152_,
				     (float) anLocalInt_153_,
				     (float) anLocalInt_154_,
				     (float) anLocalInt_149_,
				     (float) anLocalInt_150_,
				     (float) anLocalInt_151_, 100.0F, 100.0F,
				     100.0F,
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_146_]),
					       anLocalInt_155_, (byte) -120)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_147_]),
					       anLocalInt_155_, (byte) -37)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_148_]),
					       anLocalInt_155_, (byte) -32)));
			    } else if ((((Class302) class302).aShortArray2531
					!= null)
				       && ((((Class302) class302)
					    .aShortArray2531[anLocalInt_145_])
					   != -1)) {
				int anLocalInt_156_
				    = (aClass_ha__5404.method2103
				       (((Class302) class302).aShortArray2531
					[anLocalInt_145_]));
				argument_134_.method1663
				    ((float) anLocalInt_152_,
				     (float) anLocalInt_153_,
				     (float) anLocalInt_154_,
				     (float) anLocalInt_149_,
				     (float) anLocalInt_150_,
				     (float) anLocalInt_151_, 100.0F, 100.0F,
				     100.0F,
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_146_]),
					       anLocalInt_156_, (byte) -40)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_147_]),
					       anLocalInt_156_, (byte) -110)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_148_]),
					       anLocalInt_156_, (byte) -42)));
			    } else {
				int anLocalInt_157_
				    = (((Class302) class302).anIntArray2532
				       [anLocalInt_145_]);
				argument_134_.method1663
				    ((float) anLocalInt_152_,
				     (float) anLocalInt_153_,
				     (float) anLocalInt_154_,
				     (float) anLocalInt_149_,
				     (float) anLocalInt_150_,
				     (float) anLocalInt_151_, 100.0F, 100.0F,
				     100.0F,
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_146_]),
					       anLocalInt_157_, (byte) -43)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_147_]),
					       anLocalInt_157_, (byte) -4)),
				     (float) (Class383.method4111
					      ((((Class302) class302)
						.aShortArray2537
						[anLocalInt_148_]),
					       anLocalInt_157_, (byte) -61)));
			    }
			}
		    }
		}
		anLocalInt_139_ -= anLocalInt_137_;
	    }
	    anLocalInt_139_ = argument_126_ + anLocalInt;
	    anLocalInt_138_ += anLocalInt_137_;
	}
	((Class89) argument_134_).aBoolean647 = true;
	aClass_ha__5404.C(anLocalBoolean);
    }
    
    final void method3535(int argument_158_, int argument_159_,
			  int argument_160_, int argument_161_,
			  int argument_162_, int argument_163_,
			  int argument_164_, boolean[][] argument_165_) {
	Class293 class293
	    = aClass_ha__5404.method2112(Thread.currentThread());
	Class89 class89 = ((Class293) class293).aClass89_2448;
	((Class89) class89).anInt646 = 0;
	((Class89) class89).aBoolean661 = true;
	aClass_ha__5404.clearDepthBuffer();
	if (aClass327ArrayArray5399 != null || aClass296ArrayArray5400 != null)
	    method3560(argument_158_, argument_159_, argument_160_,
		       argument_161_, argument_162_, argument_163_,
		       argument_164_, argument_165_, class293, class89,
		       ((Class293) class293).anIntArray2432,
		       ((Class293) class293).anIntArray2426);
	else if (aClass238ArrayArray5401 != null)
	    method3558(argument_158_, argument_159_, argument_160_,
		       argument_161_, argument_162_, argument_163_,
		       argument_164_, argument_165_, class293, class89,
		       ((Class293) class293).anIntArray2432,
		       ((Class293) class293).anIntArray2426);
    }
    
    final void method3538
	(int argument_166_, int argument_167_, int[] argument_168_,
	 int[] argument_169_, int[] argument_170_, int[] argument_171_,
	 int[] argument_172_, int[] argument_173_, int[] argument_174_,
	 int[] argument_175_, int[] argument_176_, int[] argument_177_,
	 int[] argument_178_, int argument_179_, int argument_180_,
	 int argument_181_, boolean argument_182_) {
	if (aClass238ArrayArray5401 == null) {
	    aClass238ArrayArray5401 = (new Class238[((Class_s) this).anInt2550]
				       [((Class_s) this).anInt2549]);
	    aClass302ArrayArray5389 = (new Class302[((Class_s) this).anInt2550]
				       [((Class_s) this).anInt2549]);
	} else if (aClass327ArrayArray5399 != null
		   || aClass296ArrayArray5400 != null)
	    throw new IllegalStateException();
	boolean anLocalBoolean = false;
	if (argument_175_.length == 2 && argument_172_.length == 2
	    && (argument_175_[0] == argument_175_[1]
		|| (argument_177_[0] != -1
		    && argument_177_[0] == argument_177_[1]))) {
	    anLocalBoolean = true;
	    for (int anLocalInt = 1; anLocalInt < 2; anLocalInt++) {
		int anLocalInt_183_ = argument_168_[argument_172_[anLocalInt]];
		int anLocalInt_184_ = argument_170_[argument_172_[anLocalInt]];
		if ((anLocalInt_183_ != 0
		     && anLocalInt_183_ != ((Class_s) this).anInt2547)
		    || (anLocalInt_184_ != 0
			&& anLocalInt_184_ != ((Class_s) this).anInt2547)) {
		    anLocalBoolean = false;
		    break;
		}
	    }
	}
	if (!anLocalBoolean) {
	    Class302 class302 = new Class302();
	    short anLocalInt = (short) argument_168_.length;
	    int anLocalInt_185_ = (short) argument_175_.length;
	    ((Class302) class302).aShort2534 = anLocalInt;
	    ((Class302) class302).aShortArray2537 = new short[anLocalInt];
	    ((Class302) class302).aShortArray2544 = new short[anLocalInt];
	    ((Class302) class302).aShortArray2535 = new short[anLocalInt];
	    ((Class302) class302).aShortArray2543 = new short[anLocalInt];
	    for (int anLocalInt_186_ = 0; anLocalInt_186_ < anLocalInt;
		 anLocalInt_186_++) {
		int anLocalInt_187_ = argument_168_[anLocalInt_186_];
		int anLocalInt_188_ = argument_170_[anLocalInt_186_];
		if (anLocalInt_187_ == 0 && anLocalInt_188_ == 0)
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) ((aByteArrayArray5386[argument_166_]
				    [argument_167_])
				   - (aByteArrayArray5403[argument_166_]
				      [argument_167_]));
		else if (anLocalInt_187_ == 0
			 && anLocalInt_188_ == ((Class_s) this).anInt2547)
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) ((aByteArrayArray5386[argument_166_]
				    [argument_167_ + 1])
				   - (aByteArrayArray5403[argument_166_]
				      [argument_167_ + 1]));
		else if (anLocalInt_187_ == ((Class_s) this).anInt2547
			 && anLocalInt_188_ == ((Class_s) this).anInt2547)
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) ((aByteArrayArray5386[argument_166_ + 1]
				    [argument_167_ + 1])
				   - (aByteArrayArray5403[argument_166_ + 1]
				      [argument_167_ + 1]));
		else if (anLocalInt_187_ == ((Class_s) this).anInt2547
			 && anLocalInt_188_ == 0)
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) ((aByteArrayArray5386[argument_166_ + 1]
				    [argument_167_])
				   - (aByteArrayArray5403[argument_166_ + 1]
				      [argument_167_]));
		else {
		    int anLocalInt_189_
			= (((aByteArrayArray5386[argument_166_][argument_167_]
			     - (aByteArrayArray5403[argument_166_]
				[argument_167_]))
			    * (((Class_s) this).anInt2547 - anLocalInt_187_))
			   + ((aByteArrayArray5386[argument_166_ + 1]
			       [argument_167_])
			      - (aByteArrayArray5403[argument_166_ + 1]
				 [argument_167_])) * anLocalInt_187_);
		    int anLocalInt_190_
			= ((((aByteArrayArray5386[argument_166_]
			      [argument_167_ + 1])
			     - (aByteArrayArray5403[argument_166_]
				[argument_167_ + 1]))
			    * (((Class_s) this).anInt2547 - anLocalInt_187_))
			   + ((aByteArrayArray5386[argument_166_ + 1]
			       [argument_167_ + 1])
			      - (aByteArrayArray5403[argument_166_ + 1]
				 [argument_167_ + 1])) * anLocalInt_187_);
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) (((anLocalInt_189_
				     * (((Class_s) this).anInt2547
					- anLocalInt_188_))
				    + anLocalInt_190_ * anLocalInt_188_)
				   >> ((Class_s) this).anInt2548 * 2);
		}
		int anLocalInt_191_
		    = ((argument_166_ << ((Class_s) this).anInt2548)
		       + anLocalInt_187_);
		int anLocalInt_192_
		    = ((argument_167_ << ((Class_s) this).anInt2548)
		       + anLocalInt_188_);
		((Class302) class302).aShortArray2544[anLocalInt_186_]
		    = (short) anLocalInt_187_;
		((Class302) class302).aShortArray2543[anLocalInt_186_]
		    = (short) anLocalInt_188_;
		((Class302) class302).aShortArray2535[anLocalInt_186_]
		    = (short) (this.method3541(anLocalInt_192_, 0,
					       anLocalInt_191_)
			       + (argument_169_ != null
				  ? argument_169_[anLocalInt_186_] : 0));
		if (((Class302) class302).aShortArray2537[anLocalInt_186_] < 2)
		    ((Class302) class302).aShortArray2537[anLocalInt_186_]
			= (short) 2;
	    }
	    boolean anLocalBoolean_193_ = false;
	    int anLocalInt_194_ = 0;
	    for (int anLocalInt_195_ = 0; anLocalInt_195_ < anLocalInt_185_;
		 anLocalInt_195_++) {
		if (argument_175_[anLocalInt_195_] >= 0
		    || (argument_176_ != null
			&& argument_176_[anLocalInt_195_] >= 0))
		    anLocalInt_194_++;
		int anLocalInt_196_ = argument_177_[anLocalInt_195_];
		if (anLocalInt_196_ != -1) {
		    TextureDescriptor textureDescriptor
			= ((GraphicsToolkit) aClass_ha__5404)
			      .textureSource
			      .getDescriptor(anLocalInt_196_, true);
		    if (!((TextureDescriptor) textureDescriptor).aBoolean836) {
			anLocalBoolean_193_ = true;
			if (method3556(((TextureDescriptor) textureDescriptor).aByte834)
			    || ((TextureDescriptor) textureDescriptor).aByte845 != 0
			    || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
			    ((Class302) class302).aByte2541 |= 0x4;
		    }
		}
	    }
	    ((Class302) class302).anIntArray2532 = new int[anLocalInt_194_];
	    if (argument_176_ != null)
		((Class302) class302).anIntArray2536
		    = new int[anLocalInt_194_];
	    ((Class302) class302).aShortArray2542 = new short[anLocalInt_194_];
	    ((Class302) class302).aShortArray2539 = new short[anLocalInt_194_];
	    ((Class302) class302).aShortArray2540 = new short[anLocalInt_194_];
	    if (anLocalBoolean_193_) {
		((Class302) class302).aShortArray2531
		    = new short[anLocalInt_194_];
		((Class302) class302).aShortArray2533
		    = new short[anLocalInt_194_];
	    }
	    for (int anLocalInt_197_ = 0; anLocalInt_197_ < anLocalInt_185_;
		 anLocalInt_197_++) {
		if (argument_175_[anLocalInt_197_] >= 0
		    || (argument_176_ != null
			&& argument_176_[anLocalInt_197_] >= 0)) {
		    if (argument_175_[anLocalInt_197_] >= 0)
			((Class302) class302).anIntArray2532
			    [((Class302) class302).aShort2538]
			    = HslToRgb.method3452((argument_175_[anLocalInt_197_]));
		    else
			((Class302) class302).anIntArray2532
			    [((Class302) class302).aShort2538]
			    = -1;
		    if (argument_176_ != null) {
			if (argument_176_[anLocalInt_197_] != -1)
			    ((Class302) class302).anIntArray2536
				[((Class302) class302).aShort2538]
				= HslToRgb.method3452((argument_176_[anLocalInt_197_]));
			else
			    ((Class302) class302).anIntArray2536
				[((Class302) class302).aShort2538]
				= -1;
		    }
		    ((Class302) class302).aShortArray2542
			[((Class302) class302).aShort2538]
			= (short) argument_172_[anLocalInt_197_];
		    ((Class302) class302).aShortArray2539
			[((Class302) class302).aShort2538]
			= (short) argument_173_[anLocalInt_197_];
		    ((Class302) class302).aShortArray2540
			[((Class302) class302).aShort2538]
			= (short) argument_174_[anLocalInt_197_];
		    if (anLocalBoolean_193_) {
			if (argument_177_[anLocalInt_197_] != -1
			    && !((TextureDescriptor) (((GraphicsToolkit) aClass_ha__5404)
						 .textureSource.getDescriptor(argument_177_[anLocalInt_197_], true))).aBoolean836) {
			    ((Class302) class302).aShortArray2531
				[((Class302) class302).aShort2538]
				= (short) argument_177_[anLocalInt_197_];
			    ((Class302) class302).aShortArray2533
				[((Class302) class302).aShort2538]
				= (short) argument_178_[anLocalInt_197_];
			} else
			    ((Class302) class302).aShortArray2531
				[((Class302) class302).aShort2538]
				= (short) -1;
		    }
		    ((Class302) class302).aShort2538++;
		}
	    }
	    aClass302ArrayArray5389[argument_166_][argument_167_] = class302;
	} else if (argument_175_[0] >= 0
		   || argument_176_ != null && argument_176_[0] >= 0) {
	    Class238 class238 = new Class238();
	    int anLocalInt = argument_175_[0];
	    int anLocalInt_198_ = argument_177_[0];
	    if (argument_176_ != null) {
		((Class238) class238).anInt1734
		    = Class383.method4111(((aByteArrayArray5386[argument_166_]
					    [argument_167_])
					   - (aByteArrayArray5403
					      [argument_166_][argument_167_])),
					  HslToRgb.method3452(argument_176_[0]),
					  (byte) -21);
		if (anLocalInt == -1)
		    ((Class238) class238).aByte1730 |= 0x2;
	    }
	    if (((((Class_s) this).anIntArrayArray2546[argument_166_]
		  [argument_167_])
		 == (((Class_s) this).anIntArrayArray2546[argument_166_ + 1]
		     [argument_167_]))
		&& ((((Class_s) this).anIntArrayArray2546[argument_166_]
		     [argument_167_])
		    == (((Class_s) this).anIntArrayArray2546[argument_166_ + 1]
			[argument_167_ + 1]))
		&& ((((Class_s) this).anIntArrayArray2546[argument_166_]
		     [argument_167_])
		    == (((Class_s) this).anIntArrayArray2546[argument_166_]
			[argument_167_ + 1])))
		((Class238) class238).aByte1730 |= 0x1;
	    TextureDescriptor textureDescriptor = null;
	    if (anLocalInt_198_ != -1)
		textureDescriptor = ((GraphicsToolkit) aClass_ha__5404)
			       .textureSource
			       .getDescriptor(anLocalInt_198_, true);
	    if (textureDescriptor != null
		&& (((Class238) class238).aByte1730 & 0x2) == 0
		&& !((TextureDescriptor) textureDescriptor).aBoolean836) {
		((Class238) class238).aShort1733
		    = (short) ((aByteArrayArray5386[argument_166_]
				[argument_167_])
			       - (aByteArrayArray5403[argument_166_]
				  [argument_167_]));
		((Class238) class238).aShort1732
		    = (short) ((aByteArrayArray5386[argument_166_ + 1]
				[argument_167_])
			       - (aByteArrayArray5403[argument_166_ + 1]
				  [argument_167_]));
		((Class238) class238).aShort1731
		    = (short) ((aByteArrayArray5386[argument_166_ + 1]
				[argument_167_ + 1])
			       - (aByteArrayArray5403[argument_166_ + 1]
				  [argument_167_ + 1]));
		((Class238) class238).aShort1736
		    = (short) ((aByteArrayArray5386[argument_166_]
				[argument_167_ + 1])
			       - (aByteArrayArray5403[argument_166_]
				  [argument_167_ + 1]));
		((Class238) class238).aShort1735 = (short) anLocalInt_198_;
		if (method3556(((TextureDescriptor) textureDescriptor).aByte834)
		    || ((TextureDescriptor) textureDescriptor).aByte845 != 0
		    || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
		    ((Class238) class238).aByte1730 |= 0x4;
	    } else {
		short anLocalInt_199_
		    = HslToRgb.method3452(anLocalInt);
		((Class238) class238).aShort1733
		    = (short) Class383.method4111(((aByteArrayArray5386
						    [argument_166_]
						    [argument_167_])
						   - (aByteArrayArray5403
						      [argument_166_]
						      [argument_167_])),
						  anLocalInt_199_,
						  (byte) -114);
		((Class238) class238).aShort1732
		    = (short) Class383.method4111(((aByteArrayArray5386
						    [argument_166_ + 1]
						    [argument_167_])
						   - (aByteArrayArray5403
						      [argument_166_ + 1]
						      [argument_167_])),
						  anLocalInt_199_, (byte) -35);
		((Class238) class238).aShort1731
		    = (short) Class383.method4111(((aByteArrayArray5386
						    [argument_166_ + 1]
						    [argument_167_ + 1])
						   - (aByteArrayArray5403
						      [argument_166_ + 1]
						      [argument_167_ + 1])),
						  anLocalInt_199_,
						  (byte) -120);
		((Class238) class238).aShort1736
		    = (short) Class383.method4111(((aByteArrayArray5386
						    [argument_166_]
						    [argument_167_ + 1])
						   - (aByteArrayArray5403
						      [argument_166_]
						      [argument_167_ + 1])),
						  anLocalInt_199_, (byte) -75);
		((Class238) class238).aShort1735 = (short) -1;
	    }
	    aClass238ArrayArray5401[argument_166_][argument_167_] = class238;
	}
    }
    
    final void U(int argument_200_, int argument_201_, int[] argument_202_,
		 int[] argument_203_, int[] argument_204_, int[] argument_205_,
		 int[] argument_206_, int[] argument_207_, int[] argument_208_,
		 int[] argument_209_, int argument_210_, int argument_211_,
		 int argument_212_, boolean argument_213_) {
	boolean anLocalBoolean = (anInt5385 & 0x20) == 0;
	if (aClass327ArrayArray5399 == null && !anLocalBoolean) {
	    aClass327ArrayArray5399 = (new Class327[((Class_s) this).anInt2550]
				       [((Class_s) this).anInt2549]);
	    aClass98ArrayArray5391 = (new Class98[((Class_s) this).anInt2550]
				      [((Class_s) this).anInt2549]);
	} else if (aClass296ArrayArray5400 == null && anLocalBoolean)
	    aClass296ArrayArray5400 = (new Class296[((Class_s) this).anInt2550]
				       [((Class_s) this).anInt2549]);
	else if (aClass238ArrayArray5401 != null)
	    throw new IllegalStateException();
	if (argument_202_ != null && argument_202_.length != 0) {
	    for (int anLocalInt = 0; anLocalInt < argument_206_.length;
		 anLocalInt++) {
		if (argument_206_[anLocalInt] == -1)
		    argument_206_[anLocalInt] = 0;
		else
		    argument_206_[anLocalInt]
			= ((HslToRgb.table2
			    [HslToRgb.method3452(argument_206_[anLocalInt]) & 0xffff]) << 8
			   | 0xff);
	    }
	    if (argument_207_ != null) {
		for (int anLocalInt = 0; anLocalInt < argument_207_.length;
		     anLocalInt++) {
		    if (argument_207_[anLocalInt] == -1)
			argument_207_[anLocalInt] = 0;
		    else
			argument_207_[anLocalInt]
			    = ((HslToRgb.table2
				[HslToRgb.method3452(argument_207_[anLocalInt]) & 0xffff])
			       << 8) | 0xff;
		}
	    }
	    if (anLocalBoolean) {
		Class296 class296 = new Class296();
		((Class296) class296).aShort2465
		    = (short) argument_202_.length;
		((Class296) class296).aShort2462
		    = (short) (argument_202_.length / 3);
		((Class296) class296).aShortArray2464
		    = new short[((Class296) class296).aShort2465];
		((Class296) class296).aShortArray2459
		    = new short[((Class296) class296).aShort2465];
		((Class296) class296).aShortArray2458
		    = new short[((Class296) class296).aShort2465];
		((Class296) class296).anIntArray2460
		    = new int[((Class296) class296).aShort2465];
		((Class296) class296).aShortArray2463
		    = new short[((Class296) class296).aShort2465];
		((Class296) class296).aShortArray2461
		    = new short[((Class296) class296).aShort2465];
		((Class296) class296).aByteArray2467
		    = new byte[((Class296) class296).aShort2465];
		if (argument_205_ != null)
		    ((Class296) class296).aShortArray2466
			= new short[((Class296) class296).aShort2465];
		for (int anLocalInt = 0;
		     anLocalInt < ((Class296) class296).aShort2465;
		     anLocalInt++) {
		    int anLocalInt_214_ = argument_202_[anLocalInt];
		    int anLocalInt_215_ = argument_204_[anLocalInt];
		    boolean anLocalBoolean_216_ = false;
		    int anLocalInt_217_;
		    if (anLocalInt_214_ == 0 && anLocalInt_215_ == 0)
			anLocalInt_217_ = ((aByteArrayArray5386[argument_200_]
					    [argument_201_])
					   - (aByteArrayArray5403
					      [argument_200_][argument_201_]));
		    else if (anLocalInt_214_ == 0
			     && anLocalInt_215_ == ((Class_s) this).anInt2547)
			anLocalInt_217_
			    = ((aByteArrayArray5386[argument_200_]
				[argument_201_ + 1])
			       - (aByteArrayArray5403[argument_200_]
				  [argument_201_ + 1]));
		    else if (anLocalInt_214_ == ((Class_s) this).anInt2547
			     && anLocalInt_215_ == ((Class_s) this).anInt2547)
			anLocalInt_217_
			    = ((aByteArrayArray5386[argument_200_ + 1]
				[argument_201_ + 1])
			       - (aByteArrayArray5403[argument_200_ + 1]
				  [argument_201_ + 1]));
		    else if (anLocalInt_214_ == ((Class_s) this).anInt2547
			     && anLocalInt_215_ == 0)
			anLocalInt_217_
			    = ((aByteArrayArray5386[argument_200_ + 1]
				[argument_201_])
			       - (aByteArrayArray5403[argument_200_ + 1]
				  [argument_201_]));
		    else {
			int anLocalInt_218_
			    = ((((aByteArrayArray5386[argument_200_]
				  [argument_201_])
				 - (aByteArrayArray5403[argument_200_]
				    [argument_201_]))
				* (((Class_s) this).anInt2547
				   - anLocalInt_214_))
			       + ((aByteArrayArray5386[argument_200_ + 1]
				   [argument_201_])
				  - (aByteArrayArray5403[argument_200_ + 1]
				     [argument_201_])) * anLocalInt_214_);
			int anLocalInt_219_
			    = ((((aByteArrayArray5386[argument_200_]
				  [argument_201_ + 1])
				 - (aByteArrayArray5403[argument_200_]
				    [argument_201_ + 1]))
				* (((Class_s) this).anInt2547
				   - anLocalInt_214_))
			       + ((aByteArrayArray5386[argument_200_ + 1]
				   [argument_201_ + 1])
				  - (aByteArrayArray5403[argument_200_ + 1]
				     [argument_201_ + 1])) * anLocalInt_214_);
			anLocalInt_217_
			    = ((anLocalInt_218_ * (((Class_s) this).anInt2547
						   - anLocalInt_215_)
				+ anLocalInt_219_ * anLocalInt_215_)
			       >> ((Class_s) this).anInt2548 * 2);
		    }
		    int anLocalInt_220_
			= ((argument_200_ << ((Class_s) this).anInt2548)
			   + anLocalInt_214_);
		    int anLocalInt_221_
			= ((argument_201_ << ((Class_s) this).anInt2548)
			   + anLocalInt_215_);
		    ((Class296) class296).aShortArray2464[anLocalInt]
			= (short) anLocalInt_214_;
		    ((Class296) class296).aShortArray2458[anLocalInt]
			= (short) anLocalInt_215_;
		    ((Class296) class296).aShortArray2459[anLocalInt]
			= (short) (this.method3541(anLocalInt_221_, 0,
						   anLocalInt_220_)
				   + (argument_203_ != null
				      ? argument_203_[anLocalInt] : 0));
		    if (anLocalInt_217_ < 0)
			anLocalInt_217_ = 0;
		    if (argument_206_[anLocalInt] == 0) {
			((Class296) class296).anIntArray2460[anLocalInt] = 0;
			if (argument_207_ != null)
			    ((Class296) class296).aByteArray2467[anLocalInt]
				= (byte) anLocalInt_217_;
		    } else {
			int anLocalInt_222_ = 0;
			if (argument_205_ != null) {
			    int anLocalInt_223_
				= (((Class296) class296).aShortArray2466
				       [anLocalInt]
				   = (short) argument_205_[anLocalInt]);
			    if (argument_211_ != 0) {
				anLocalInt_222_
				    = anLocalInt_223_ * 255 / argument_211_;
				if (anLocalInt_222_ < 0)
				    anLocalInt_222_ = 0;
				else if (anLocalInt_222_ > 255)
				    anLocalInt_222_ = 255;
			    }
			}
			int anLocalInt_224_ = -16777216;
			if (argument_208_[anLocalInt] != -1
			    && method3556(((TextureDescriptor)
					   (((GraphicsToolkit) aClass_ha__5404)
						.textureSource.getDescriptor(argument_208_[anLocalInt], true)))
					  .aByte834))
			    anLocalInt_224_ = -1694498816;
			((Class296) class296).anIntArray2460[anLocalInt]
			    = (anLocalInt_224_
			       | (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
				  (argument_210_, 255,
				   method3555(argument_206_[anLocalInt] >> 8,
					      anLocalInt_217_),
				   anLocalInt_222_)));
			if (argument_207_ != null)
			    ((Class296) class296).aByteArray2467[anLocalInt]
				= (byte) anLocalInt_217_;
		    }
		    ((Class296) class296).aShortArray2463[anLocalInt]
			= (short) argument_208_[anLocalInt];
		    ((Class296) class296).aShortArray2461[anLocalInt]
			= (short) argument_209_[anLocalInt];
		}
		if (argument_207_ != null)
		    ((Class296) class296).anIntArray2457
			= new int[((Class296) class296).aShort2462];
		for (int anLocalInt = 0;
		     anLocalInt < ((Class296) class296).aShort2462;
		     anLocalInt++) {
		    int anLocalInt_225_ = anLocalInt * 3;
		    if (argument_207_ != null
			&& argument_207_[anLocalInt_225_] != 0)
			((Class296) class296).anIntArray2457[anLocalInt]
			    = argument_207_[anLocalInt_225_] >> 8 | ~0xffffff;
		}
		aClass296ArrayArray5400[argument_200_][argument_201_]
		    = class296;
	    } else {
		boolean anLocalBoolean_226_ = true;
		int anLocalInt = -1;
		int anLocalInt_227_ = -1;
		int anLocalInt_228_ = -1;
		int anLocalInt_229_ = -1;
		if (argument_202_.length == 6) {
		    for (int anLocalInt_230_ = 0; anLocalInt_230_ < 6;
			 anLocalInt_230_++) {
			if (argument_202_[anLocalInt_230_] == 0
			    && argument_204_[anLocalInt_230_] == 0) {
			    if (anLocalInt != -1
				&& (argument_206_[anLocalInt]
				    != argument_206_[anLocalInt_230_])) {
				anLocalBoolean_226_ = false;
				break;
			    }
			    anLocalInt = anLocalInt_230_;
			} else if ((argument_202_[anLocalInt_230_]
				    == ((Class_s) this).anInt2547)
				   && argument_204_[anLocalInt_230_] == 0) {
			    if (anLocalInt_227_ != -1
				&& (argument_206_[anLocalInt_227_]
				    != argument_206_[anLocalInt_230_])) {
				anLocalBoolean_226_ = false;
				break;
			    }
			    anLocalInt_227_ = anLocalInt_230_;
			} else if ((argument_202_[anLocalInt_230_]
				    == ((Class_s) this).anInt2547)
				   && (argument_204_[anLocalInt_230_]
				       == ((Class_s) this).anInt2547)) {
			    if (anLocalInt_228_ != -1
				&& (argument_206_[anLocalInt_228_]
				    != argument_206_[anLocalInt_230_])) {
				anLocalBoolean_226_ = false;
				break;
			    }
			    anLocalInt_228_ = anLocalInt_230_;
			} else if (argument_202_[anLocalInt_230_] == 0
				   && (argument_204_[anLocalInt_230_]
				       == ((Class_s) this).anInt2547)) {
			    if (anLocalInt_229_ != -1
				&& (argument_206_[anLocalInt_229_]
				    != argument_206_[anLocalInt_230_])) {
				anLocalBoolean_226_ = false;
				break;
			    }
			    anLocalInt_229_ = anLocalInt_230_;
			}
		    }
		    if (anLocalInt == -1 || anLocalInt_227_ == -1
			|| anLocalInt_228_ == -1 || anLocalInt_229_ == -1)
			anLocalBoolean_226_ = false;
		    if (anLocalBoolean_226_) {
			if (argument_203_ != null) {
			    for (int anLocalInt_231_ = 0; anLocalInt_231_ < 4;
				 anLocalInt_231_++) {
				if (argument_203_[anLocalInt_231_] != 0) {
				    anLocalBoolean_226_ = false;
				    break;
				}
			    }
			}
			if (anLocalBoolean_226_) {
			    for (int anLocalInt_232_ = 1; anLocalInt_232_ < 4;
				 anLocalInt_232_++) {
				if ((argument_202_[anLocalInt_232_]
				     != argument_202_[0])
				    && (argument_202_[anLocalInt_232_]
					!= (argument_202_[0]
					    + ((Class_s) this).anInt2547))
				    && (argument_202_[anLocalInt_232_]
					!= (argument_202_[0]
					    - ((Class_s) this).anInt2547))) {
				    anLocalBoolean_226_ = false;
				    break;
				}
				if ((argument_204_[anLocalInt_232_]
				     != argument_204_[0])
				    && (argument_204_[anLocalInt_232_]
					!= (argument_204_[0]
					    + ((Class_s) this).anInt2547))
				    && (argument_204_[anLocalInt_232_]
					!= (argument_204_[0]
					    - ((Class_s) this).anInt2547))) {
				    anLocalBoolean_226_ = false;
				    break;
				}
			    }
			}
		    }
		} else
		    anLocalBoolean_226_ = false;
		if (anLocalBoolean_226_) {
		    Class327 class327 = new Class327();
		    int anLocalInt_233_ = argument_206_[0];
		    int anLocalInt_234_ = argument_208_[0];
		    if (argument_207_ != null) {
			((Class327) class327).anInt2691
			    = argument_207_[0] >> 8;
			if (anLocalInt_233_ == 0)
			    ((Class327) class327).aByte2697 |= 0x2;
		    } else if (anLocalInt_233_ == 0)
			return;
		    if (((((Class_s) this).anIntArrayArray2546[argument_200_]
			  [argument_201_])
			 == (((Class_s) this).anIntArrayArray2546
			     [argument_200_ + 1][argument_201_]))
			&& ((((Class_s) this).anIntArrayArray2546
			     [argument_200_][argument_201_])
			    == (((Class_s) this).anIntArrayArray2546
				[argument_200_ + 1][argument_201_ + 1]))
			&& ((((Class_s) this).anIntArrayArray2546
			     [argument_200_][argument_201_])
			    == (((Class_s) this).anIntArrayArray2546
				[argument_200_][argument_201_ + 1])))
			((Class327) class327).aByte2697 |= 0x1;
		    if (anLocalInt_234_ != -1
			&& (((Class327) class327).aByte2697 & 0x2) == 0
			&& !(((TextureDescriptor) ((GraphicsToolkit) aClass_ha__5404)
					     .textureSource
					     .getDescriptor(anLocalInt_234_, true))
			     .aBoolean836)) {
			int anLocalInt_235_;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_235_ = (argument_205_[anLocalInt] * 255
					       / argument_211_);
			    if (anLocalInt_235_ < 0)
				anLocalInt_235_ = 0;
			    else if (anLocalInt_235_ > 255)
				anLocalInt_235_ = 255;
			} else
			    anLocalInt_235_ = 0;
			((Class327) class327).anInt2692
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt] >> 8,
					   ((aByteArrayArray5386[argument_200_]
					     [argument_201_])
					    - (aByteArrayArray5403
					       [argument_200_]
					       [argument_201_]))),
				anLocalInt_235_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2692
				|= 255 - ((aByteArrayArray5386[argument_200_]
					   [argument_201_])
					  - (aByteArrayArray5403[argument_200_]
					     [argument_201_])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_235_ = (argument_205_[anLocalInt_227_]
					       * 255 / argument_211_);
			    if (anLocalInt_235_ < 0)
				anLocalInt_235_ = 0;
			    else if (anLocalInt_235_ > 255)
				anLocalInt_235_ = 255;
			} else
			    anLocalInt_235_ = 0;
			((Class327) class327).anInt2693
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_227_] >> 8,
					   ((aByteArrayArray5386
					     [argument_200_ + 1]
					     [argument_201_])
					    - (aByteArrayArray5403
					       [argument_200_ + 1]
					       [argument_201_]))),
				anLocalInt_235_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2693
				|= 255 - ((aByteArrayArray5386
					   [argument_200_ + 1][argument_201_])
					  - (aByteArrayArray5403
					     [argument_200_ + 1]
					     [argument_201_])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_235_ = (argument_205_[anLocalInt_228_]
					       * 255 / argument_211_);
			    if (anLocalInt_235_ < 0)
				anLocalInt_235_ = 0;
			    else if (anLocalInt_235_ > 255)
				anLocalInt_235_ = 255;
			} else
			    anLocalInt_235_ = 0;
			((Class327) class327).anInt2698
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_228_] >> 8,
					   ((aByteArrayArray5386
					     [argument_200_ + 1]
					     [argument_201_ + 1])
					    - (aByteArrayArray5403
					       [argument_200_ + 1]
					       [argument_201_ + 1]))),
				anLocalInt_235_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2698
				|= 255 - ((aByteArrayArray5386
					   [argument_200_ + 1]
					   [argument_201_ + 1])
					  - (aByteArrayArray5403
					     [argument_200_ + 1]
					     [argument_201_ + 1])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_235_ = (argument_205_[anLocalInt_229_]
					       * 255 / argument_211_);
			    if (anLocalInt_235_ < 0)
				anLocalInt_235_ = 0;
			    else if (anLocalInt_235_ > 255)
				anLocalInt_235_ = 255;
			} else
			    anLocalInt_235_ = 0;
			((Class327) class327).anInt2696
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_229_] >> 8,
					   ((aByteArrayArray5386[argument_200_]
					     [argument_201_ + 1])
					    - (aByteArrayArray5403
					       [argument_200_]
					       [argument_201_ + 1]))),
				anLocalInt_235_));
			((Class327) class327).aShort2695
			    = (short) anLocalInt_234_;
		    } else {
			int anLocalInt_236_;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_236_ = (argument_205_[anLocalInt] * 255
					       / argument_211_);
			    if (anLocalInt_236_ < 0)
				anLocalInt_236_ = 0;
			    else if (anLocalInt_236_ > 255)
				anLocalInt_236_ = 255;
			} else
			    anLocalInt_236_ = 0;
			((Class327) class327).anInt2692
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt] >> 8,
					   ((aByteArrayArray5386[argument_200_]
					     [argument_201_])
					    - (aByteArrayArray5403
					       [argument_200_]
					       [argument_201_]))),
				anLocalInt_236_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2692
				|= 255 - ((aByteArrayArray5386[argument_200_]
					   [argument_201_])
					  - (aByteArrayArray5403[argument_200_]
					     [argument_201_])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_236_ = (argument_205_[anLocalInt_227_]
					       * 255 / argument_211_);
			    if (anLocalInt_236_ < 0)
				anLocalInt_236_ = 0;
			    else if (anLocalInt_236_ > 255)
				anLocalInt_236_ = 255;
			} else
			    anLocalInt_236_ = 0;
			((Class327) class327).anInt2693
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_227_] >> 8,
					   ((aByteArrayArray5386
					     [argument_200_ + 1]
					     [argument_201_])
					    - (aByteArrayArray5403
					       [argument_200_ + 1]
					       [argument_201_]))),
				anLocalInt_236_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2693
				|= 255 - ((aByteArrayArray5386
					   [argument_200_ + 1][argument_201_])
					  - (aByteArrayArray5403
					     [argument_200_ + 1]
					     [argument_201_])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_236_ = (argument_205_[anLocalInt_228_]
					       * 255 / argument_211_);
			    if (anLocalInt_236_ < 0)
				anLocalInt_236_ = 0;
			    else if (anLocalInt_236_ > 255)
				anLocalInt_236_ = 255;
			} else
			    anLocalInt_236_ = 0;
			((Class327) class327).anInt2698
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_228_] >> 8,
					   ((aByteArrayArray5386
					     [argument_200_ + 1]
					     [argument_201_ + 1])
					    - (aByteArrayArray5403
					       [argument_200_ + 1]
					       [argument_201_ + 1]))),
				anLocalInt_236_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2698
				|= 255 - ((aByteArrayArray5386
					   [argument_200_ + 1]
					   [argument_201_ + 1])
					  - (aByteArrayArray5403
					     [argument_200_ + 1]
					     [argument_201_ + 1])) << 25;
			if (argument_205_ != null && argument_211_ != 0) {
			    anLocalInt_236_ = (argument_205_[anLocalInt_229_]
					       * 255 / argument_211_);
			    if (anLocalInt_236_ < 0)
				anLocalInt_236_ = 0;
			    else if (anLocalInt_236_ > 255)
				anLocalInt_236_ = 255;
			} else
			    anLocalInt_236_ = 0;
			((Class327) class327).anInt2696
			    = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
			       (argument_210_, 255,
				method3555(argument_206_[anLocalInt_229_] >> 8,
					   ((aByteArrayArray5386[argument_200_]
					     [argument_201_ + 1])
					    - (aByteArrayArray5403
					       [argument_200_]
					       [argument_201_ + 1]))),
				anLocalInt_236_));
			if (((Class327) class327).anInt2691 != 0)
			    ((Class327) class327).anInt2696
				|= 255 - ((aByteArrayArray5386[argument_200_]
					   [argument_201_ + 1])
					  - (aByteArrayArray5403[argument_200_]
					     [argument_201_ + 1])) << 25;
			((Class327) class327).aShort2695 = (short) -1;
		    }
		    if (argument_205_ != null) {
			((Class327) class327).aShort2689
			    = (short) argument_205_[anLocalInt_228_];
			((Class327) class327).aShort2690
			    = (short) argument_205_[anLocalInt_229_];
			((Class327) class327).aShort2694
			    = (short) argument_205_[anLocalInt_227_];
			((Class327) class327).aShort2688
			    = (short) argument_205_[anLocalInt];
		    }
		    aClass327ArrayArray5399[argument_200_][argument_201_]
			= class327;
		} else {
		    Class98 class98 = new Class98();
		    ((Class98) class98).aShort761
			= (short) argument_202_.length;
		    ((Class98) class98).aShort760
			= (short) (argument_202_.length / 3);
		    ((Class98) class98).aShortArray764
			= new short[((Class98) class98).aShort761];
		    ((Class98) class98).aShortArray767
			= new short[((Class98) class98).aShort761];
		    ((Class98) class98).aShortArray762
			= new short[((Class98) class98).aShort761];
		    ((Class98) class98).anIntArray759
			= new int[((Class98) class98).aShort761];
		    if (argument_205_ != null)
			((Class98) class98).aShortArray765
			    = new short[((Class98) class98).aShort761];
		    for (int anLocalInt_237_ = 0;
			 anLocalInt_237_ < ((Class98) class98).aShort761;
			 anLocalInt_237_++) {
			int anLocalInt_238_ = argument_202_[anLocalInt_237_];
			int anLocalInt_239_ = argument_204_[anLocalInt_237_];
			boolean anLocalBoolean_240_ = false;
			int anLocalInt_241_;
			if (anLocalInt_238_ == 0 && anLocalInt_239_ == 0)
			    anLocalInt_241_
				= ((aByteArrayArray5386[argument_200_]
				    [argument_201_])
				   - (aByteArrayArray5403[argument_200_]
				      [argument_201_]));
			else if (anLocalInt_238_ == 0
				 && (anLocalInt_239_
				     == ((Class_s) this).anInt2547))
			    anLocalInt_241_
				= ((aByteArrayArray5386[argument_200_]
				    [argument_201_ + 1])
				   - (aByteArrayArray5403[argument_200_]
				      [argument_201_ + 1]));
			else if (anLocalInt_238_ == ((Class_s) this).anInt2547
				 && (anLocalInt_239_
				     == ((Class_s) this).anInt2547))
			    anLocalInt_241_
				= ((aByteArrayArray5386[argument_200_ + 1]
				    [argument_201_ + 1])
				   - (aByteArrayArray5403[argument_200_ + 1]
				      [argument_201_ + 1]));
			else if (anLocalInt_238_ == ((Class_s) this).anInt2547
				 && anLocalInt_239_ == 0)
			    anLocalInt_241_
				= ((aByteArrayArray5386[argument_200_ + 1]
				    [argument_201_])
				   - (aByteArrayArray5403[argument_200_ + 1]
				      [argument_201_]));
			else {
			    int anLocalInt_242_
				= ((((aByteArrayArray5386[argument_200_]
				      [argument_201_])
				     - (aByteArrayArray5403[argument_200_]
					[argument_201_]))
				    * (((Class_s) this).anInt2547
				       - anLocalInt_238_))
				   + ((aByteArrayArray5386[argument_200_ + 1]
				       [argument_201_])
				      - (aByteArrayArray5403[argument_200_ + 1]
					 [argument_201_])) * anLocalInt_238_);
			    int anLocalInt_243_
				= ((((aByteArrayArray5386[argument_200_]
				      [argument_201_ + 1])
				     - (aByteArrayArray5403[argument_200_]
					[argument_201_ + 1]))
				    * (((Class_s) this).anInt2547
				       - anLocalInt_238_))
				   + (((aByteArrayArray5386[argument_200_ + 1]
					[argument_201_ + 1])
				       - (aByteArrayArray5403
					  [argument_200_ + 1]
					  [argument_201_ + 1]))
				      * anLocalInt_238_));
			    anLocalInt_241_
				= (((anLocalInt_242_
				     * (((Class_s) this).anInt2547
					- anLocalInt_239_))
				    + anLocalInt_243_ * anLocalInt_239_)
				   >> ((Class_s) this).anInt2548 * 2);
			}
			int anLocalInt_244_
			    = ((argument_200_ << ((Class_s) this).anInt2548)
			       + anLocalInt_238_);
			int anLocalInt_245_
			    = ((argument_201_ << ((Class_s) this).anInt2548)
			       + anLocalInt_239_);
			((Class98) class98).aShortArray764[anLocalInt_237_]
			    = (short) anLocalInt_238_;
			((Class98) class98).aShortArray762[anLocalInt_237_]
			    = (short) anLocalInt_239_;
			((Class98) class98).aShortArray767[anLocalInt_237_]
			    = (short) (this.method3541(anLocalInt_245_, 0,
						       anLocalInt_244_)
				       + (argument_203_ != null
					  ? argument_203_[anLocalInt_237_]
					  : 0));
			if (anLocalInt_241_ < 0)
			    anLocalInt_241_ = 0;
			if (argument_206_[anLocalInt_237_] == 0) {
			    if (argument_207_ != null)
				((Class98) class98).anIntArray759
				    [anLocalInt_237_]
				    = anLocalInt_241_ << 25;
			    else
				((Class98) class98).anIntArray759
				    [anLocalInt_237_]
				    = 0;
			} else {
			    int anLocalInt_246_ = 0;
			    if (argument_205_ != null) {
				int anLocalInt_247_
				    = (((Class98) class98).aShortArray765
					   [anLocalInt_237_]
				       = (short) (argument_205_
						  [anLocalInt_237_]));
				if (argument_211_ != 0) {
				    anLocalInt_246_ = (anLocalInt_247_ * 255
						       / argument_211_);
				    if (anLocalInt_246_ < 0)
					anLocalInt_246_ = 0;
				    else if (anLocalInt_246_ > 255)
					anLocalInt_246_ = 255;
				}
			    }
			    ((Class98) class98).anIntArray759[anLocalInt_237_]
				= (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1793
				   (argument_210_, 255,
				    method3555((argument_206_[anLocalInt_237_]
						>> 8),
					       anLocalInt_241_),
				    anLocalInt_246_));
			    if (argument_207_ != null)
				((Class98) class98).anIntArray759
				    [anLocalInt_237_]
				    |= anLocalInt_241_ << 25;
			}
		    }
		    boolean anLocalBoolean_248_ = false;
		    for (int anLocalInt_249_ = 0;
			 anLocalInt_249_ < ((Class98) class98).aShort760;
			 anLocalInt_249_++) {
			if (argument_208_[anLocalInt_249_ * 3] != -1
			    && !(((TextureDescriptor)
				  (((GraphicsToolkit) aClass_ha__5404)
				       .textureSource.getDescriptor(argument_208_[anLocalInt_249_ * 3], true)))
				 .aBoolean836))
			    anLocalBoolean_248_ = true;
		    }
		    if (argument_207_ != null)
			((Class98) class98).anIntArray768
			    = new int[((Class98) class98).aShort760];
		    if (anLocalBoolean_248_) {
			((Class98) class98).aShortArray763
			    = new short[((Class98) class98).aShort760];
			((Class98) class98).aShortArray769
			    = new short[((Class98) class98).aShort760];
		    }
		    for (int anLocalInt_250_ = 0;
			 anLocalInt_250_ < ((Class98) class98).aShort760;
			 anLocalInt_250_++) {
			int anLocalInt_251_ = anLocalInt_250_ * 3;
			if (argument_207_ != null
			    && argument_207_[anLocalInt_251_] != 0)
			    ((Class98) class98).anIntArray768[anLocalInt_250_]
				= argument_207_[anLocalInt_251_] >> 8;
			if (anLocalBoolean_248_) {
			    int anLocalInt_252_ = anLocalInt_251_ + 1;
			    int anLocalInt_253_ = anLocalInt_252_ + 1;
			    boolean anLocalBoolean_254_ = false;
			    boolean anLocalBoolean_255_ = true;
			    int anLocalInt_256_
				= argument_208_[anLocalInt_251_];
			    if (anLocalInt_256_ == -1
				|| (((TextureDescriptor)
				     ((GraphicsToolkit) aClass_ha__5404)
					 .textureSource
					 .getDescriptor(anLocalInt_256_, true))
				    .aBoolean836))
				anLocalBoolean_255_ = false;
			    else
				anLocalBoolean_254_ = true;
			    anLocalInt_256_ = argument_208_[anLocalInt_252_];
			    if (anLocalInt_256_ == -1
				|| (((TextureDescriptor)
				     ((GraphicsToolkit) aClass_ha__5404)
					 .textureSource
					 .getDescriptor(anLocalInt_256_, true))
				    .aBoolean836))
				anLocalBoolean_255_ = false;
			    else
				anLocalBoolean_254_ = true;
			    anLocalInt_256_ = argument_208_[anLocalInt_253_];
			    if (anLocalInt_256_ == -1
				|| (((TextureDescriptor)
				     ((GraphicsToolkit) aClass_ha__5404)
					 .textureSource
					 .getDescriptor(anLocalInt_256_, true))
				    .aBoolean836))
				anLocalBoolean_255_ = false;
			    else
				anLocalBoolean_254_ = true;
			    if (anLocalBoolean_255_) {
				((Class98) class98).aShortArray763
				    [anLocalInt_250_]
				    = (short) anLocalInt_256_;
				((Class98) class98).aShortArray769
				    [anLocalInt_250_]
				    = (short) argument_209_[anLocalInt_251_];
			    } else {
				if (anLocalBoolean_254_) {
				    anLocalInt_256_
					= argument_208_[anLocalInt_251_];
				    if (anLocalInt_256_ != -1
					&& !(((TextureDescriptor)
					      (((GraphicsToolkit) aClass_ha__5404)
						   .textureSource.getDescriptor(anLocalInt_256_, true)))
					     .aBoolean836))
					((Class98) class98).anIntArray759
					    [anLocalInt_251_]
					    = (HslToRgb.table2
					       [(HslToRgb.method3452((((TextureDescriptor) (((GraphicsToolkit) aClass_ha__5404).textureSource.getDescriptor(anLocalInt_256_, true))).aShort831) & 0xffff)) & 0xffff]);
				    anLocalInt_256_
					= argument_208_[anLocalInt_252_];
				    if (anLocalInt_256_ != -1
					&& !(((TextureDescriptor)
					      (((GraphicsToolkit) aClass_ha__5404)
						   .textureSource.getDescriptor(anLocalInt_256_, true)))
					     .aBoolean836))
					((Class98) class98).anIntArray759
					    [anLocalInt_252_]
					    = (HslToRgb.table2
					       [(HslToRgb.method3452((((TextureDescriptor) (((GraphicsToolkit) aClass_ha__5404).textureSource.getDescriptor(anLocalInt_256_, true))).aShort831) & 0xffff)) & 0xffff]);
				    anLocalInt_256_
					= argument_208_[anLocalInt_253_];
				    if (anLocalInt_256_ != -1
					&& !(((TextureDescriptor)
					      (((GraphicsToolkit) aClass_ha__5404)
						   .textureSource.getDescriptor(anLocalInt_256_, true)))
					     .aBoolean836))
					((Class98) class98).anIntArray759
					    [anLocalInt_253_]
					    = (HslToRgb.table2
					       [(HslToRgb.method3452((((TextureDescriptor) (((GraphicsToolkit) aClass_ha__5404).textureSource.getDescriptor(anLocalInt_256_, true))).aShort831) & 0xffff)) & 0xffff]);
				}
				((Class98) class98).aShortArray763
				    [anLocalInt_250_]
				    = (short) -1;
			    }
			}
		    }
		    aClass98ArrayArray5391[argument_200_][argument_201_]
			= class98;
		}
	    }
	}
    }
    
    private final void method3559
	(int argument_257_, int argument_258_, boolean argument_259_,
	 Class293 argument_260_, Class89 argument_261_, int[] argument_262_,
	 int[] argument_263_, int[] argument_264_, int[] argument_265_,
	 int argument_266_) {
	Class327 class327
	    = aClass327ArrayArray5399[argument_257_][argument_258_];
	if (class327 != null) {
	    if ((((Class327) class327).aByte2697 & 0x2) == 0) {
		if (argument_266_ != 0) {
		    if ((((Class327) class327).aByte2697 & 0x4) != 0) {
			if ((argument_266_ & 0x1) != 0)
			    return;
		    } else if ((argument_266_ & 0x2) != 0)
			return;
		}
		int anLocalInt = argument_257_ * ((Class_s) this).anInt2547;
		int anLocalInt_267_ = anLocalInt + ((Class_s) this).anInt2547;
		int anLocalInt_268_
		    = argument_258_ * ((Class_s) this).anInt2547;
		int anLocalInt_269_
		    = anLocalInt_268_ + ((Class_s) this).anInt2547;
		int anLocalInt_270_ = 0;
		int anLocalInt_271_ = 0;
		int anLocalInt_272_ = 0;
		int anLocalInt_273_ = 0;
		float f;
		float f_274_;
		float f_275_;
		float f_276_;
		int anLocalInt_277_;
		int anLocalInt_278_;
		int anLocalInt_279_;
		int anLocalInt_280_;
		int anLocalInt_281_;
		int anLocalInt_282_;
		int anLocalInt_283_;
		int anLocalInt_284_;
		if ((((Class327) class327).aByte2697 & 0x1) != 0
		    && !argument_259_) {
		    int anLocalInt_285_ = (((Class_s) this).anIntArrayArray2546
					   [argument_257_][argument_258_]);
		    float f_286_ = aFloat5387 * (float) anLocalInt_285_;
		    if (anInt5402 == -1) {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt + f_286_
				+ aFloat5393 * (float) anLocalInt_268_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			f_274_
			    = (aFloat5405
			       + (aFloat5388 * (float) anLocalInt_267_ + f_286_
				  + aFloat5393 * (float) anLocalInt_268_));
			if (f_274_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_275_
			    = (aFloat5405
			       + (aFloat5388 * (float) anLocalInt_267_ + f_286_
				  + aFloat5393 * (float) anLocalInt_269_));
			if (f_275_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_276_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt + f_286_
				     + aFloat5393 * (float) anLocalInt_269_));
			if (f_276_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
		    } else {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt + f_286_
				+ aFloat5393 * (float) anLocalInt_268_));
			f_274_
			    = (aFloat5405
			       + (aFloat5388 * (float) anLocalInt_267_ + f_286_
				  + aFloat5393 * (float) anLocalInt_268_));
			f_275_
			    = (aFloat5405
			       + (aFloat5388 * (float) anLocalInt_267_ + f_286_
				  + aFloat5393 * (float) anLocalInt_269_));
			f_276_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt + f_286_
				     + aFloat5393 * (float) anLocalInt_269_));
		    }
		    if (((Class293) argument_260_).aBoolean2409) {
			int anLocalInt_287_
			    = (int) (f - (float) (((Class293) argument_260_)
						  .anInt2405));
			if (anLocalInt_287_ > 0) {
			    anLocalInt_270_ = anLocalInt_287_;
			    if (anLocalInt_270_ > 255)
				anLocalInt_270_ = 255;
			}
			anLocalInt_287_
			    = (int) (f_274_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_287_ > 0) {
			    anLocalInt_271_ = anLocalInt_287_;
			    if (anLocalInt_271_ > 255)
				anLocalInt_271_ = 255;
			}
			anLocalInt_287_
			    = (int) (f_275_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_287_ > 0) {
			    anLocalInt_272_ = anLocalInt_287_;
			    if (anLocalInt_272_ > 255)
				anLocalInt_272_ = 255;
			}
			anLocalInt_287_
			    = (int) (f_276_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_287_ > 0) {
			    anLocalInt_273_ = anLocalInt_287_;
			    if (anLocalInt_273_ > 255)
				anLocalInt_273_ = 255;
			}
		    }
		    float f_288_ = aFloat5394 * (float) anLocalInt_285_;
		    float f_289_ = aFloat5395 * (float) anLocalInt_285_;
		    if (anInt5402 == -1) {
			float f_290_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_288_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_277_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_290_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4653) / f));
			float f_291_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_289_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_278_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_291_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4645) / f));
			float f_292_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_ + f_288_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_279_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_292_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_274_));
			float f_293_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_ + f_289_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_280_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_293_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_274_));
			float f_294_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_ + f_288_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_281_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_294_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_275_));
			float f_295_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_ + f_289_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_282_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_295_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_275_));
			float f_296_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_288_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_283_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_296_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_276_));
			float f_297_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_289_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_284_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_297_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_276_));
		    } else {
			float f_298_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_288_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_277_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_298_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_299_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_289_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_278_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_299_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_300_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_ + f_288_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_279_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_300_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_301_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_ + f_289_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_280_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_301_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_302_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_ + f_288_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_281_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_302_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_303_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_ + f_289_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_282_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_303_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_304_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt + f_288_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_283_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_304_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_305_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt + f_289_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_284_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_305_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
		    }
		} else {
		    int anLocalInt_306_ = (((Class_s) this).anIntArrayArray2546
					   [argument_257_][argument_258_]);
		    int anLocalInt_307_ = (((Class_s) this).anIntArrayArray2546
					   [argument_257_ + 1][argument_258_]);
		    int anLocalInt_308_
			= (((Class_s) this).anIntArrayArray2546
			   [argument_257_ + 1][argument_258_ + 1]);
		    int anLocalInt_309_ = (((Class_s) this).anIntArrayArray2546
					   [argument_257_][argument_258_ + 1]);
		    if (anInt5402 == -1) {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt
				+ aFloat5387 * (float) anLocalInt_306_
				+ aFloat5393 * (float) anLocalInt_268_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			f_274_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt_267_
				     + aFloat5387 * (float) anLocalInt_307_
				     + aFloat5393 * (float) anLocalInt_268_));
			if (f_274_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_275_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt_267_
				     + aFloat5387 * (float) anLocalInt_308_
				     + aFloat5393 * (float) anLocalInt_269_));
			if (f_275_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
			f_276_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt
				     + aFloat5387 * (float) anLocalInt_309_
				     + aFloat5393 * (float) anLocalInt_269_));
			if (f_276_
			    <= (float) (((JavaToolkit) aClass_ha__5404)
					.anInt4643))
			    return;
		    } else {
			f = (aFloat5405
			     + (aFloat5388 * (float) anLocalInt
				+ aFloat5387 * (float) anLocalInt_306_
				+ aFloat5393 * (float) anLocalInt_268_));
			f_274_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt_267_
				     + aFloat5387 * (float) anLocalInt_307_
				     + aFloat5393 * (float) anLocalInt_268_));
			f_275_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt_267_
				     + aFloat5387 * (float) anLocalInt_308_
				     + aFloat5393 * (float) anLocalInt_269_));
			f_276_ = (aFloat5405
				  + (aFloat5388 * (float) anLocalInt
				     + aFloat5387 * (float) anLocalInt_309_
				     + aFloat5393 * (float) anLocalInt_269_));
		    }
		    if (argument_259_) {
			int anLocalInt_310_
			    = (int) (f - (float) (((Class293) argument_260_)
						  .anInt2405));
			if (anLocalInt_310_ > 255)
			    anLocalInt_310_ = 255;
			if (anLocalInt_310_ > 0) {
			    anLocalInt_270_ = anLocalInt_310_;
			    int anLocalInt_311_
				= (((Class327) class327).aShort2688
				   * anLocalInt_310_ / 255);
			    if (anLocalInt_311_ > 0)
				anLocalInt_306_ -= anLocalInt_311_;
			}
			anLocalInt_310_
			    = (int) (f_274_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_310_ > 255)
			    anLocalInt_310_ = 255;
			if (anLocalInt_310_ > 0) {
			    anLocalInt_271_ = anLocalInt_310_;
			    int anLocalInt_312_
				= (((Class327) class327).aShort2694
				   * anLocalInt_310_ / 255);
			    if (anLocalInt_312_ > 0)
				anLocalInt_307_ -= anLocalInt_312_;
			}
			anLocalInt_310_
			    = (int) (f_275_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_310_ > 255)
			    anLocalInt_310_ = 255;
			if (anLocalInt_310_ > 0) {
			    anLocalInt_272_ = anLocalInt_310_;
			    int anLocalInt_313_
				= (((Class327) class327).aShort2689
				   * anLocalInt_310_ / 255);
			    if (anLocalInt_313_ > 0)
				anLocalInt_308_ -= anLocalInt_313_;
			}
			anLocalInt_310_
			    = (int) (f_276_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_310_ > 255)
			    anLocalInt_310_ = 255;
			if (anLocalInt_310_ > 0) {
			    anLocalInt_273_ = anLocalInt_310_;
			    int anLocalInt_314_
				= (((Class327) class327).aShort2690
				   * anLocalInt_310_ / 255);
			    if (anLocalInt_314_ > 0)
				anLocalInt_309_ -= anLocalInt_314_;
			}
		    } else if (((Class293) argument_260_).aBoolean2409) {
			int anLocalInt_315_
			    = (int) (f - (float) (((Class293) argument_260_)
						  .anInt2405));
			if (anLocalInt_315_ > 0) {
			    anLocalInt_270_ = anLocalInt_315_;
			    if (anLocalInt_270_ > 255)
				anLocalInt_270_ = 255;
			}
			anLocalInt_315_
			    = (int) (f_274_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_315_ > 0) {
			    anLocalInt_271_ = anLocalInt_315_;
			    if (anLocalInt_271_ > 255)
				anLocalInt_271_ = 255;
			}
			anLocalInt_315_
			    = (int) (f_275_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_315_ > 0) {
			    anLocalInt_272_ = anLocalInt_315_;
			    if (anLocalInt_272_ > 255)
				anLocalInt_272_ = 255;
			}
			anLocalInt_315_
			    = (int) (f_276_
				     - (float) (((Class293) argument_260_)
						.anInt2405));
			if (anLocalInt_315_ > 0) {
			    anLocalInt_273_ = anLocalInt_315_;
			    if (anLocalInt_273_ > 255)
				anLocalInt_273_ = 255;
			}
		    }
		    if (anInt5402 == -1) {
			float f_316_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_306_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_277_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_316_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4653) / f));
			float f_317_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_306_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_278_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_317_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4645) / f));
			float f_318_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_
				  + aFloat5394 * (float) anLocalInt_307_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_279_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_318_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_274_));
			float f_319_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_
				  + aFloat5395 * (float) anLocalInt_307_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_280_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_319_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_274_));
			float f_320_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_
				  + aFloat5394 * (float) anLocalInt_308_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_281_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_320_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_275_));
			float f_321_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_
				  + aFloat5395 * (float) anLocalInt_308_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_282_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_321_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_275_));
			float f_322_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_309_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_283_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_322_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ f_276_));
			float f_323_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_309_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_284_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_323_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ f_276_));
		    } else {
			float f_324_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_306_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_277_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_324_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_325_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_306_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_278_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_325_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_326_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_
				  + aFloat5394 * (float) anLocalInt_307_
				  + aFloat5397 * (float) anLocalInt_268_));
			anLocalInt_279_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_326_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_327_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_
				  + aFloat5395 * (float) anLocalInt_307_
				  + aFloat5392 * (float) anLocalInt_268_));
			anLocalInt_280_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_327_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_328_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_267_
				  + aFloat5394 * (float) anLocalInt_308_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_281_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_328_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_329_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_267_
				  + aFloat5395 * (float) anLocalInt_308_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_282_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_329_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			float f_330_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt
				  + aFloat5394 * (float) anLocalInt_309_
				  + aFloat5397 * (float) anLocalInt_269_));
			anLocalInt_283_
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_330_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			float f_331_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt
				  + aFloat5395 * (float) anLocalInt_309_
				  + aFloat5392 * (float) anLocalInt_269_));
			anLocalInt_284_
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_331_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
		    }
		}
		boolean anLocalBoolean
		    = (((Class327) class327).aShort2695 != -1
		       && method3556(((TextureDescriptor)
				      (((GraphicsToolkit) aClass_ha__5404)
					   .textureSource.getDescriptor(((Class327) class327).aShort2695, true))).aByte834));
		if (anInt5402 == -1) {
		    int anLocalInt_332_
			= anLocalInt_271_ + anLocalInt_272_ + anLocalInt_273_;
		    if ((((anLocalInt_281_ - anLocalInt_283_)
			  * (anLocalInt_280_ - anLocalInt_284_))
			 - ((anLocalInt_282_ - anLocalInt_284_)
			    * (anLocalInt_279_ - anLocalInt_283_)))
			> 0) {
			((Class89) argument_261_).aBoolean661
			    = (anLocalInt_281_ < 0 || anLocalInt_283_ < 0
			       || anLocalInt_279_ < 0
			       || (anLocalInt_281_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_283_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_279_
				   > ((Class89) argument_261_).anInt650));
			if (anLocalInt_332_ < 765) {
			    if (anLocalInt_332_ > 0) {
				if (((Class327) class327).aShort2695 >= 0) {
				    int anLocalInt_333_ = -16777216;
				    if (anLocalBoolean)
					anLocalInt_333_ = -1694498816;
				    argument_261_.method1668
					((float) anLocalInt_282_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_281_,
					 (float) anLocalInt_283_,
					 (float) anLocalInt_279_, f_275_,
					 f_276_, f_274_, 1.0F, 0.0F, 1.0F,
					 1.0F, 1.0F, 0.0F,
					 (anLocalInt_333_
					  | (((Class327) class327).anInt2698
					     & 0xffffff)),
					 (anLocalInt_333_
					  | (((Class327) class327).anInt2696
					     & 0xffffff)),
					 (anLocalInt_333_
					  | (((Class327) class327).anInt2693
					     & 0xffffff)),
					 ((Class293) argument_260_).anInt2408,
					 anLocalInt_272_, anLocalInt_273_,
					 anLocalInt_271_,
					 ((Class327) class327).aShort2695);
				} else {
				    if (anLocalBoolean)
					((Class89) argument_261_).anInt646
					    = 100;
				    argument_261_.method1656
					((float) anLocalInt_282_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_281_,
					 (float) anLocalInt_283_,
					 (float) anLocalInt_279_,
					 (float) (int) f_275_,
					 (float) (int) f_276_,
					 (float) (int) f_274_,
					 (Statics.method2255((anLocalInt_272_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2698)),
					 (Statics.method2255((anLocalInt_273_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2696)),
					 (Statics.method2255((anLocalInt_271_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2693)));
				    ((Class89) argument_261_).anInt646 = 0;
				}
			    } else if (((Class327) class327).aShort2695 >= 0) {
				int anLocalInt_334_ = -16777216;
				if (anLocalBoolean)
				    anLocalInt_334_ = -1694498816;
				argument_261_.method1668
				    ((float) anLocalInt_282_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_281_,
				     (float) anLocalInt_283_,
				     (float) anLocalInt_279_, f_275_, f_276_,
				     f_274_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
				     0.0F,
				     anLocalInt_334_ | (((Class327) class327)
							.anInt2698) & 0xffffff,
				     anLocalInt_334_ | (((Class327) class327)
							.anInt2696) & 0xffffff,
				     anLocalInt_334_ | (((Class327) class327)
							.anInt2693) & 0xffffff,
				     0, 0, 0, 0,
				     ((Class327) class327).aShort2695);
			    } else {
				if (anLocalBoolean)
				    ((Class89) argument_261_).anInt646 = 100;
				argument_261_.method1656
				    ((float) anLocalInt_282_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_281_,
				     (float) anLocalInt_283_,
				     (float) anLocalInt_279_,
				     (float) (int) f_275_,
				     (float) (int) f_276_,
				     (float) (int) f_274_,
				     ((Class327) class327).anInt2698,
				     ((Class327) class327).anInt2696,
				     ((Class327) class327).anInt2693);
				((Class89) argument_261_).anInt646 = 0;
			    }
			} else
			    argument_261_.method1660
				((float) anLocalInt_282_,
				 (float) anLocalInt_284_,
				 (float) anLocalInt_280_,
				 (float) anLocalInt_281_,
				 (float) anLocalInt_283_,
				 (float) anLocalInt_279_, (float) (int) f_275_,
				 (float) (int) f_276_, (float) (int) f_274_,
				 ((Class293) argument_260_).anInt2408);
		    }
		    anLocalInt_332_
			= anLocalInt_270_ + anLocalInt_271_ + anLocalInt_273_;
		    if ((((anLocalInt_277_ - anLocalInt_279_)
			  * (anLocalInt_284_ - anLocalInt_280_))
			 - ((anLocalInt_278_ - anLocalInt_280_)
			    * (anLocalInt_283_ - anLocalInt_279_)))
			> 0) {
			((Class89) argument_261_).aBoolean661
			    = (anLocalInt_277_ < 0 || anLocalInt_279_ < 0
			       || anLocalInt_283_ < 0
			       || (anLocalInt_277_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_279_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_283_
				   > ((Class89) argument_261_).anInt650));
			if (anLocalInt_332_ < 765) {
			    if (anLocalBoolean)
				((Class89) argument_261_).anInt646
				    = -1694498816;
			    if (anLocalInt_332_ > 0) {
				if (((Class327) class327).aShort2695 >= 0) {
				    int anLocalInt_335_ = -16777216;
				    if (anLocalBoolean)
					anLocalInt_335_ = -1694498816;
				    argument_261_.method1668
					((float) anLocalInt_278_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_277_,
					 (float) anLocalInt_279_,
					 (float) anLocalInt_283_, f, f_274_,
					 f_276_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
					 1.0F,
					 (anLocalInt_335_
					  | (((Class327) class327).anInt2692
					     & 0xffffff)),
					 (anLocalInt_335_
					  | (((Class327) class327).anInt2693
					     & 0xffffff)),
					 (anLocalInt_335_
					  | (((Class327) class327).anInt2696
					     & 0xffffff)),
					 ((Class293) argument_260_).anInt2408,
					 anLocalInt_270_, anLocalInt_271_,
					 anLocalInt_273_,
					 ((Class327) class327).aShort2695);
				} else {
				    if (anLocalBoolean)
					((Class89) argument_261_).anInt646
					    = 100;
				    argument_261_.method1656
					((float) anLocalInt_278_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_277_,
					 (float) anLocalInt_279_,
					 (float) anLocalInt_283_,
					 (float) (int) f, (float) (int) f_274_,
					 (float) (int) f_276_,
					 (Statics.method2255((anLocalInt_270_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2692)),
					 (Statics.method2255((anLocalInt_271_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2693)),
					 (Statics.method2255((anLocalInt_273_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2696)));
				    ((Class89) argument_261_).anInt646 = 0;
				}
			    } else if (((Class327) class327).aShort2695 >= 0) {
				int anLocalInt_336_ = -16777216;
				if (anLocalBoolean)
				    anLocalInt_336_ = -1694498816;
				argument_261_.method1668
				    ((float) anLocalInt_278_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_277_,
				     (float) anLocalInt_279_,
				     (float) anLocalInt_283_, f, f_274_,
				     f_276_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
				     1.0F,
				     anLocalInt_336_ | (((Class327) class327)
							.anInt2692) & 0xffffff,
				     anLocalInt_336_ | (((Class327) class327)
							.anInt2693) & 0xffffff,
				     anLocalInt_336_ | (((Class327) class327)
							.anInt2696) & 0xffffff,
				     0, 0, 0, 0,
				     ((Class327) class327).aShort2695);
			    } else {
				if (anLocalBoolean)
				    ((Class89) argument_261_).anInt646 = 100;
				argument_261_.method1656
				    ((float) anLocalInt_278_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_277_,
				     (float) anLocalInt_279_,
				     (float) anLocalInt_283_, (float) (int) f,
				     (float) (int) f_274_,
				     (float) (int) f_276_,
				     ((Class327) class327).anInt2692,
				     ((Class327) class327).anInt2693,
				     ((Class327) class327).anInt2696);
				((Class89) argument_261_).anInt646 = 0;
			    }
			} else
			    argument_261_.method1660
				((float) anLocalInt_278_,
				 (float) anLocalInt_280_,
				 (float) anLocalInt_284_,
				 (float) anLocalInt_277_,
				 (float) anLocalInt_279_,
				 (float) anLocalInt_283_, (float) (int) f,
				 (float) (int) f_274_, (float) (int) f_276_,
				 ((Class293) argument_260_).anInt2408);
		    }
		} else {
		    int anLocalInt_337_
			= anLocalInt_271_ + anLocalInt_272_ + anLocalInt_273_;
		    if ((((anLocalInt_281_ - anLocalInt_283_)
			  * (anLocalInt_280_ - anLocalInt_284_))
			 - ((anLocalInt_282_ - anLocalInt_284_)
			    * (anLocalInt_279_ - anLocalInt_283_)))
			> 0) {
			((Class89) argument_261_).aBoolean661
			    = (anLocalInt_281_ < 0 || anLocalInt_283_ < 0
			       || anLocalInt_279_ < 0
			       || (anLocalInt_281_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_283_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_279_
				   > ((Class89) argument_261_).anInt650));
			if (anLocalInt_337_ < 765) {
			    if (anLocalBoolean)
				((Class89) argument_261_).anInt646
				    = -1694498816;
			    if (anLocalInt_337_ > 0) {
				if (((Class327) class327).aShort2695 >= 0) {
				    int anLocalInt_338_ = -16777216;
				    if (anLocalBoolean)
					anLocalInt_338_ = -1694498816;
				    argument_261_.method1668
					((float) anLocalInt_282_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_281_,
					 (float) anLocalInt_283_,
					 (float) anLocalInt_279_, f_275_,
					 f_276_, f_274_, 1.0F, 0.0F, 1.0F,
					 1.0F, 1.0F, 0.0F,
					 (anLocalInt_338_
					  | (((Class327) class327).anInt2698
					     & 0xffffff)),
					 (anLocalInt_338_
					  | (((Class327) class327).anInt2696
					     & 0xffffff)),
					 (anLocalInt_338_
					  | (((Class327) class327).anInt2693
					     & 0xffffff)),
					 ((Class293) argument_260_).anInt2408,
					 anLocalInt_272_, anLocalInt_273_,
					 anLocalInt_271_,
					 ((Class327) class327).aShort2695);
				} else {
				    if (anLocalBoolean)
					((Class89) argument_261_).anInt646
					    = 100;
				    argument_261_.method1656
					((float) anLocalInt_282_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_281_,
					 (float) anLocalInt_283_,
					 (float) anLocalInt_279_,
					 (float) (int) f_275_,
					 (float) (int) f_276_,
					 (float) (int) f_274_,
					 (Statics.method2255((anLocalInt_272_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2698)),
					 (Statics.method2255((anLocalInt_273_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2696)),
					 (Statics.method2255((anLocalInt_271_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2693)));
				    ((Class89) argument_261_).anInt646 = 0;
				}
			    } else if (((Class327) class327).aShort2695 >= 0) {
				int anLocalInt_339_ = -16777216;
				if (anLocalBoolean)
				    anLocalInt_339_ = -1694498816;
				argument_261_.method1668
				    ((float) anLocalInt_282_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_281_,
				     (float) anLocalInt_283_,
				     (float) anLocalInt_279_, f_275_, f_276_,
				     f_274_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
				     0.0F,
				     anLocalInt_339_ | (((Class327) class327)
							.anInt2698) & 0xffffff,
				     anLocalInt_339_ | (((Class327) class327)
							.anInt2696) & 0xffffff,
				     anLocalInt_339_ | (((Class327) class327)
							.anInt2693) & 0xffffff,
				     0, 0, 0, 0,
				     ((Class327) class327).aShort2695);
			    } else {
				if (anLocalBoolean)
				    ((Class89) argument_261_).anInt646 = 100;
				argument_261_.method1656
				    ((float) anLocalInt_282_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_281_,
				     (float) anLocalInt_283_,
				     (float) anLocalInt_279_,
				     (float) (int) f_275_,
				     (float) (int) f_276_,
				     (float) (int) f_274_,
				     ((Class327) class327).anInt2698,
				     ((Class327) class327).anInt2696,
				     ((Class327) class327).anInt2693);
				((Class89) argument_261_).anInt646 = 0;
			    }
			} else
			    argument_261_.method1660
				((float) anLocalInt_282_,
				 (float) anLocalInt_284_,
				 (float) anLocalInt_280_,
				 (float) anLocalInt_281_,
				 (float) anLocalInt_283_,
				 (float) anLocalInt_279_, (float) (int) f_275_,
				 (float) (int) f_276_, (float) (int) f_274_,
				 ((Class293) argument_260_).anInt2408);
		    }
		    anLocalInt_337_
			= anLocalInt_270_ + anLocalInt_271_ + anLocalInt_273_;
		    if ((((anLocalInt_277_ - anLocalInt_279_)
			  * (anLocalInt_284_ - anLocalInt_280_))
			 - ((anLocalInt_278_ - anLocalInt_280_)
			    * (anLocalInt_283_ - anLocalInt_279_)))
			> 0) {
			((Class89) argument_261_).aBoolean661
			    = (anLocalInt_277_ < 0 || anLocalInt_279_ < 0
			       || anLocalInt_283_ < 0
			       || (anLocalInt_277_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_279_
				   > ((Class89) argument_261_).anInt650)
			       || (anLocalInt_283_
				   > ((Class89) argument_261_).anInt650));
			if (anLocalInt_337_ < 765) {
			    if (anLocalBoolean)
				((Class89) argument_261_).anInt646
				    = -1694498816;
			    if (anLocalInt_337_ > 0) {
				if (((Class327) class327).aShort2695 >= 0) {
				    int anLocalInt_340_ = -16777216;
				    if (anLocalBoolean)
					anLocalInt_340_ = -1694498816;
				    argument_261_.method1668
					((float) anLocalInt_278_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_277_,
					 (float) anLocalInt_279_,
					 (float) anLocalInt_283_, f, f_274_,
					 f_276_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
					 1.0F,
					 (anLocalInt_340_
					  | (((Class327) class327).anInt2692
					     & 0xffffff)),
					 (anLocalInt_340_
					  | (((Class327) class327).anInt2693
					     & 0xffffff)),
					 (anLocalInt_340_
					  | (((Class327) class327).anInt2696
					     & 0xffffff)),
					 ((Class293) argument_260_).anInt2408,
					 anLocalInt_270_, anLocalInt_271_,
					 anLocalInt_273_,
					 ((Class327) class327).aShort2695);
				} else {
				    if (anLocalBoolean)
					((Class89) argument_261_).anInt646
					    = 100;
				    argument_261_.method1656
					((float) anLocalInt_278_,
					 (float) anLocalInt_280_,
					 (float) anLocalInt_284_,
					 (float) anLocalInt_277_,
					 (float) anLocalInt_279_,
					 (float) anLocalInt_283_,
					 (float) (int) f, (float) (int) f_274_,
					 (float) (int) f_276_,
					 (Statics.method2255((anLocalInt_270_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2692)),
					 (Statics.method2255((anLocalInt_271_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2693)),
					 (Statics.method2255((anLocalInt_273_ << 24 | (((Class293) argument_260_).anInt2408)), ((Class327) class327).anInt2696)));
				    ((Class89) argument_261_).anInt646 = 0;
				}
			    } else if (((Class327) class327).aShort2695 >= 0) {
				int anLocalInt_341_ = -16777216;
				if (anLocalBoolean)
				    anLocalInt_341_ = -1694498816;
				argument_261_.method1668
				    ((float) anLocalInt_278_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_277_,
				     (float) anLocalInt_279_,
				     (float) anLocalInt_283_, f, f_274_,
				     f_276_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
				     1.0F,
				     anLocalInt_341_ | (((Class327) class327)
							.anInt2692) & 0xffffff,
				     anLocalInt_341_ | (((Class327) class327)
							.anInt2693) & 0xffffff,
				     anLocalInt_341_ | (((Class327) class327)
							.anInt2696) & 0xffffff,
				     0, 0, 0, 0,
				     ((Class327) class327).aShort2695);
			    } else {
				if (anLocalBoolean)
				    ((Class89) argument_261_).anInt646 = 100;
				argument_261_.method1656
				    ((float) anLocalInt_278_,
				     (float) anLocalInt_280_,
				     (float) anLocalInt_284_,
				     (float) anLocalInt_277_,
				     (float) anLocalInt_279_,
				     (float) anLocalInt_283_, (float) (int) f,
				     (float) (int) f_274_,
				     (float) (int) f_276_,
				     ((Class327) class327).anInt2692,
				     ((Class327) class327).anInt2693,
				     ((Class327) class327).anInt2696);
				((Class89) argument_261_).anInt646 = 0;
			    }
			} else
			    argument_261_.method1660
				((float) anLocalInt_278_,
				 (float) anLocalInt_280_,
				 (float) anLocalInt_284_,
				 (float) anLocalInt_277_,
				 (float) anLocalInt_279_,
				 (float) anLocalInt_283_, (float) (int) f,
				 (float) (int) f_274_, (float) (int) f_276_,
				 ((Class293) argument_260_).anInt2408);
		    }
		}
	    }
	} else {
	    Class98 class98
		= aClass98ArrayArray5391[argument_257_][argument_258_];
	    if (class98 != null) {
		if (argument_266_ != 0) {
		    if ((((Class98) class98).aByte766 & 0x4) != 0) {
			if ((argument_266_ & 0x1) != 0)
			    return;
		    } else if ((argument_266_ & 0x2) != 0)
			return;
		}
		if (anInt5402 == -1) {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class98) class98).aShort761;
			 anLocalInt++) {
			int anLocalInt_342_
			    = (((Class98) class98).aShortArray764[anLocalInt]
			       + (argument_257_
				  << ((Class_s) this).anInt2548));
			int anLocalInt_343_
			    = ((Class98) class98).aShortArray767[anLocalInt];
			int anLocalInt_344_
			    = (((Class98) class98).aShortArray762[anLocalInt]
			       + (argument_258_
				  << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_342_
				      + aFloat5387 * (float) anLocalInt_343_
				      + aFloat5393 * (float) anLocalInt_344_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			argument_265_[anLocalInt] = 0;
			if (argument_259_) {
			    int anLocalInt_345_
				= (int) (f
					 - (float) (((Class293) argument_260_)
						    .anInt2405));
			    if (anLocalInt_345_ > 255)
				anLocalInt_345_ = 255;
			    if (anLocalInt_345_ > 0) {
				argument_265_[anLocalInt] = anLocalInt_345_;
				int anLocalInt_346_
				    = ((((Class98) class98).aShortArray765
					[anLocalInt])
				       * anLocalInt_345_ / 255);
				if (anLocalInt_346_ > 0)
				    anLocalInt_343_ -= anLocalInt_346_;
			    }
			} else if (((Class293) argument_260_).aBoolean2409) {
			    int anLocalInt_347_
				= (int) (f
					 - (float) (((Class293) argument_260_)
						    .anInt2405));
			    if (anLocalInt_347_ > 0) {
				argument_265_[anLocalInt] = anLocalInt_347_;
				if (argument_265_[anLocalInt] > 255)
				    argument_265_[anLocalInt] = 255;
			    }
			}
			float f_348_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_342_
				  + aFloat5394 * (float) anLocalInt_343_
				  + aFloat5397 * (float) anLocalInt_344_));
			float f_349_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_342_
				  + aFloat5395 * (float) anLocalInt_343_
				  + aFloat5392 * (float) anLocalInt_344_));
			argument_262_[anLocalInt]
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_348_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4653) / f));
			argument_263_[anLocalInt]
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_349_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4645) / f));
			argument_264_[anLocalInt] = (int) f;
		    }
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class98) class98).aShort761;
			 anLocalInt++) {
			int anLocalInt_350_
			    = (((Class98) class98).aShortArray764[anLocalInt]
			       + (argument_257_
				  << ((Class_s) this).anInt2548));
			int anLocalInt_351_
			    = ((Class98) class98).aShortArray767[anLocalInt];
			int anLocalInt_352_
			    = (((Class98) class98).aShortArray762[anLocalInt]
			       + (argument_258_
				  << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_350_
				      + aFloat5387 * (float) anLocalInt_351_
				      + aFloat5393 * (float) anLocalInt_352_));
			argument_265_[anLocalInt] = 0;
			if (argument_259_) {
			    int anLocalInt_353_
				= (anInt5402
				   - ((Class293) argument_260_).anInt2405);
			    if (anLocalInt_353_ > 255)
				anLocalInt_353_ = 255;
			    if (anLocalInt_353_ > 0) {
				argument_265_[anLocalInt] = anLocalInt_353_;
				int anLocalInt_354_
				    = ((((Class98) class98).aShortArray765
					[anLocalInt])
				       * anLocalInt_353_ / 255);
				if (anLocalInt_354_ > 0)
				    anLocalInt_351_ -= anLocalInt_354_;
			    }
			} else if (((Class293) argument_260_).aBoolean2409) {
			    int anLocalInt_355_
				= (anInt5402
				   - ((Class293) argument_260_).anInt2405);
			    if (anLocalInt_355_ > 0) {
				argument_265_[anLocalInt] = anLocalInt_355_;
				if (argument_265_[anLocalInt] > 255)
				    argument_265_[anLocalInt] = 255;
			    }
			}
			float f_356_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_350_
				  + aFloat5394 * (float) anLocalInt_351_
				  + aFloat5397 * (float) anLocalInt_352_));
			float f_357_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_350_
				  + aFloat5395 * (float) anLocalInt_351_
				  + aFloat5392 * (float) anLocalInt_352_));
			argument_262_[anLocalInt]
			    = (((Class89) argument_261_).anInt655
			       + (int) (f_356_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			argument_263_[anLocalInt]
			    = (((Class89) argument_261_).anInt648
			       + (int) (f_357_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			argument_264_[anLocalInt] = (int) f;
		    }
		}
		if (((Class98) class98).aShortArray763 != null) {
		    if (anInt5402 == -1) {
			for (int anLocalInt = 0;
			     anLocalInt < ((Class98) class98).aShort760;
			     anLocalInt++) {
			    int anLocalInt_358_ = anLocalInt * 3;
			    int anLocalInt_359_ = anLocalInt_358_ + 1;
			    int anLocalInt_360_ = anLocalInt_359_ + 1;
			    int anLocalInt_361_
				= argument_262_[anLocalInt_358_];
			    int anLocalInt_362_
				= argument_262_[anLocalInt_359_];
			    int anLocalInt_363_
				= argument_262_[anLocalInt_360_];
			    int anLocalInt_364_
				= argument_263_[anLocalInt_358_];
			    int anLocalInt_365_
				= argument_263_[anLocalInt_359_];
			    int anLocalInt_366_
				= argument_263_[anLocalInt_360_];
			    int anLocalInt_367_
				= (argument_265_[anLocalInt_358_]
				   + argument_265_[anLocalInt_359_]
				   + argument_265_[anLocalInt_360_]);
			    if ((((anLocalInt_361_ - anLocalInt_362_)
				  * (anLocalInt_366_ - anLocalInt_365_))
				 - ((anLocalInt_364_ - anLocalInt_365_)
				    * (anLocalInt_363_ - anLocalInt_362_)))
				> 0) {
				((Class89) argument_261_).aBoolean661
				    = (anLocalInt_361_ < 0
				       || anLocalInt_362_ < 0
				       || anLocalInt_363_ < 0
				       || (anLocalInt_361_
					   > (((Class89) argument_261_)
					      .anInt650))
				       || (anLocalInt_362_
					   > (((Class89) argument_261_)
					      .anInt650))
				       || (anLocalInt_363_
					   > (((Class89) argument_261_)
					      .anInt650)));
				short anLocalInt_368_
				    = (((Class98) class98).aShortArray763
				       [anLocalInt]);
				if (anLocalInt_367_ < 765) {
				    if (anLocalInt_367_ > 0) {
					if (anLocalInt_368_ != -1) {
					    int anLocalInt_369_ = -16777216;
					    if (anLocalInt_368_ != -1
						&& (method3556
						    (((TextureDescriptor)
						      (((GraphicsToolkit) aClass_ha__5404)
							   .textureSource
							   .getDescriptor(anLocalInt_368_, true))).aByte834)))
						anLocalInt_369_ = -1694498816;
					    argument_261_.method1668
						((float) anLocalInt_364_,
						 (float) anLocalInt_365_,
						 (float) anLocalInt_366_,
						 (float) anLocalInt_361_,
						 (float) anLocalInt_362_,
						 (float) anLocalInt_363_,
						 (float) (argument_264_
							  [anLocalInt_358_]),
						 (float) (argument_264_
							  [anLocalInt_359_]),
						 (float) (argument_264_
							  [anLocalInt_360_]),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_358_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_359_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_360_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_358_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_359_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_360_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 (anLocalInt_369_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_358_])
						     & 0xffffff)),
						 (anLocalInt_369_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_359_])
						     & 0xffffff)),
						 (anLocalInt_369_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_360_])
						     & 0xffffff)),
						 (((Class293) argument_260_)
						  .anInt2408),
						 (argument_265_
						  [anLocalInt_358_]),
						 (argument_265_
						  [anLocalInt_359_]),
						 (argument_265_
						  [anLocalInt_360_]),
						 anLocalInt_368_);
					} else if (((((Class98) class98)
						     .anIntArray759
						     [anLocalInt_358_])
						    & 0xffffff)
						   != 0) {
					    if (anLocalInt_368_ != -1
						&& (method3556
						    (((TextureDescriptor)
						      (((GraphicsToolkit) aClass_ha__5404)
							   .textureSource
							   .getDescriptor(anLocalInt_368_, true))).aByte834)))
						((Class89) argument_261_)
						    .anInt646
						    = -1694498816;
					    argument_261_.method1656
						((float) anLocalInt_364_,
						 (float) anLocalInt_365_,
						 (float) anLocalInt_366_,
						 (float) anLocalInt_361_,
						 (float) anLocalInt_362_,
						 (float) anLocalInt_363_,
						 (float) (argument_264_
							  [anLocalInt_358_]),
						 (float) (argument_264_
							  [anLocalInt_359_]),
						 (float) (argument_264_
							  [anLocalInt_360_]),
						 (Statics.method2255(((argument_265_[anLocalInt_358_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_358_]))),
						 (Statics.method2255(((argument_265_[anLocalInt_359_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_359_]))),
						 (Statics.method2255(((argument_265_[anLocalInt_360_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_360_]))));
					    ((Class89) argument_261_).anInt646
						= 0;
					}
				    } else if (anLocalInt_368_ != -1) {
					int anLocalInt_370_ = -16777216;
					if (anLocalInt_368_ != -1
					    && (method3556
						(((TextureDescriptor)
						  (((GraphicsToolkit) aClass_ha__5404)
						       .textureSource
						       .getDescriptor(anLocalInt_368_, true)))
						 .aByte834)))
					    anLocalInt_370_ = -1694498816;
					argument_261_.method1668
					    ((float) anLocalInt_364_,
					     (float) anLocalInt_365_,
					     (float) anLocalInt_366_,
					     (float) anLocalInt_361_,
					     (float) anLocalInt_362_,
					     (float) anLocalInt_363_,
					     (float) (argument_264_
						      [anLocalInt_358_]),
					     (float) (argument_264_
						      [anLocalInt_359_]),
					     (float) (argument_264_
						      [anLocalInt_360_]),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_358_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_359_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_360_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_358_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_359_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_360_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     (anLocalInt_370_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_358_])
						 & 0xffffff)),
					     (anLocalInt_370_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_359_])
						 & 0xffffff)),
					     (anLocalInt_370_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_360_])
						 & 0xffffff)),
					     0, 0, 0, 0, anLocalInt_368_);
				    } else if (((((Class98) class98)
						 .anIntArray759
						 [anLocalInt_358_])
						& 0xffffff)
					       != 0) {
					if (anLocalInt_368_ != -1
					    && (method3556
						(((TextureDescriptor)
						  (((GraphicsToolkit) aClass_ha__5404)
						       .textureSource
						       .getDescriptor(anLocalInt_368_, true)))
						 .aByte834)))
					    ((Class89) argument_261_).anInt646
						= -1694498816;
					argument_261_.method1656
					    ((float) anLocalInt_364_,
					     (float) anLocalInt_365_,
					     (float) anLocalInt_366_,
					     (float) anLocalInt_361_,
					     (float) anLocalInt_362_,
					     (float) anLocalInt_363_,
					     (float) (argument_264_
						      [anLocalInt_358_]),
					     (float) (argument_264_
						      [anLocalInt_359_]),
					     (float) (argument_264_
						      [anLocalInt_360_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_358_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_359_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_360_]));
					((Class89) argument_261_).anInt646 = 0;
				    }
				} else
				    argument_261_.method1660
					((float) anLocalInt_364_,
					 (float) anLocalInt_365_,
					 (float) anLocalInt_366_,
					 (float) anLocalInt_361_,
					 (float) anLocalInt_362_,
					 (float) anLocalInt_363_,
					 (float) (argument_264_
						  [anLocalInt_358_]),
					 (float) (argument_264_
						  [anLocalInt_359_]),
					 (float) (argument_264_
						  [anLocalInt_360_]),
					 ((Class293) argument_260_).anInt2408);
			    }
			}
		    } else {
			for (int anLocalInt = 0;
			     anLocalInt < ((Class98) class98).aShort760;
			     anLocalInt++) {
			    int anLocalInt_371_ = anLocalInt * 3;
			    int anLocalInt_372_ = anLocalInt_371_ + 1;
			    int anLocalInt_373_ = anLocalInt_372_ + 1;
			    int anLocalInt_374_
				= argument_262_[anLocalInt_371_];
			    int anLocalInt_375_
				= argument_262_[anLocalInt_372_];
			    int anLocalInt_376_
				= argument_262_[anLocalInt_373_];
			    int anLocalInt_377_
				= argument_263_[anLocalInt_371_];
			    int anLocalInt_378_
				= argument_263_[anLocalInt_372_];
			    int anLocalInt_379_
				= argument_263_[anLocalInt_373_];
			    int anLocalInt_380_
				= (argument_265_[anLocalInt_371_]
				   + argument_265_[anLocalInt_372_]
				   + argument_265_[anLocalInt_373_]);
			    if ((((anLocalInt_374_ - anLocalInt_375_)
				  * (anLocalInt_379_ - anLocalInt_378_))
				 - ((anLocalInt_377_ - anLocalInt_378_)
				    * (anLocalInt_376_ - anLocalInt_375_)))
				> 0) {
				((Class89) argument_261_).aBoolean661
				    = (anLocalInt_374_ < 0
				       || anLocalInt_375_ < 0
				       || anLocalInt_376_ < 0
				       || (anLocalInt_374_
					   > (((Class89) argument_261_)
					      .anInt650))
				       || (anLocalInt_375_
					   > (((Class89) argument_261_)
					      .anInt650))
				       || (anLocalInt_376_
					   > (((Class89) argument_261_)
					      .anInt650)));
				short anLocalInt_381_
				    = (((Class98) class98).aShortArray763
				       [anLocalInt]);
				if (anLocalInt_380_ < 765) {
				    if (anLocalInt_381_ != -1
					&& method3556(((TextureDescriptor)
						       (((GraphicsToolkit) aClass_ha__5404)
							    .textureSource
							    .getDescriptor(anLocalInt_381_, true))).aByte834))
					((Class89) argument_261_).anInt646
					    = -1694498816;
				    if (anLocalInt_380_ > 0) {
					if (anLocalInt_381_ != -1) {
					    int anLocalInt_382_ = -16777216;
					    if (anLocalInt_381_ != -1
						&& (method3556
						    (((TextureDescriptor)
						      (((GraphicsToolkit) aClass_ha__5404)
							   .textureSource
							   .getDescriptor(anLocalInt_381_, true))).aByte834)))
						anLocalInt_382_ = -1694498816;
					    argument_261_.method1668
						((float) anLocalInt_377_,
						 (float) anLocalInt_378_,
						 (float) anLocalInt_379_,
						 (float) anLocalInt_374_,
						 (float) anLocalInt_375_,
						 (float) anLocalInt_376_,
						 (float) (argument_264_
							  [anLocalInt_371_]),
						 (float) (argument_264_
							  [anLocalInt_372_]),
						 (float) (argument_264_
							  [anLocalInt_373_]),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_371_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_372_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray764
							   [anLocalInt_373_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_371_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_372_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 ((float) (((Class98) class98)
							   .aShortArray762
							   [anLocalInt_373_])
						  / (float) (((Class_s) this)
							     .anInt2547)),
						 (anLocalInt_382_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_371_])
						     & 0xffffff)),
						 (anLocalInt_382_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_372_])
						     & 0xffffff)),
						 (anLocalInt_382_
						  | ((((Class98) class98)
						      .anIntArray759
						      [anLocalInt_373_])
						     & 0xffffff)),
						 (((Class293) argument_260_)
						  .anInt2408),
						 (argument_265_
						  [anLocalInt_371_]),
						 (argument_265_
						  [anLocalInt_372_]),
						 (argument_265_
						  [anLocalInt_373_]),
						 anLocalInt_381_);
					} else if (((((Class98) class98)
						     .anIntArray759
						     [anLocalInt_371_])
						    & 0xffffff)
						   != 0) {
					    if (anLocalInt_381_ != -1
						&& (method3556
						    (((TextureDescriptor)
						      (((GraphicsToolkit) aClass_ha__5404)
							   .textureSource
							   .getDescriptor(anLocalInt_381_, true))).aByte834)))
						((Class89) argument_261_)
						    .anInt646
						    = -1694498816;
					    argument_261_.method1656
						((float) anLocalInt_377_,
						 (float) anLocalInt_378_,
						 (float) anLocalInt_379_,
						 (float) anLocalInt_374_,
						 (float) anLocalInt_375_,
						 (float) anLocalInt_376_,
						 (float) (argument_264_
							  [anLocalInt_371_]),
						 (float) (argument_264_
							  [anLocalInt_372_]),
						 (float) (argument_264_
							  [anLocalInt_373_]),
						 (Statics.method2255(((argument_265_[anLocalInt_371_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_371_]))),
						 (Statics.method2255(((argument_265_[anLocalInt_372_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_372_]))),
						 (Statics.method2255(((argument_265_[anLocalInt_373_]) << 24 | (((Class293) argument_260_).anInt2408)), (((Class98) class98).anIntArray759[anLocalInt_373_]))));
					    ((Class89) argument_261_).anInt646
						= 0;
					}
				    } else if (anLocalInt_381_ != -1) {
					int anLocalInt_383_ = -16777216;
					if (anLocalInt_381_ != -1
					    && (method3556
						(((TextureDescriptor)
						  (((GraphicsToolkit) aClass_ha__5404)
						       .textureSource
						       .getDescriptor(anLocalInt_381_, true)))
						 .aByte834)))
					    anLocalInt_383_ = -1694498816;
					argument_261_.method1668
					    ((float) anLocalInt_377_,
					     (float) anLocalInt_378_,
					     (float) anLocalInt_379_,
					     (float) anLocalInt_374_,
					     (float) anLocalInt_375_,
					     (float) anLocalInt_376_,
					     (float) (argument_264_
						      [anLocalInt_371_]),
					     (float) (argument_264_
						      [anLocalInt_372_]),
					     (float) (argument_264_
						      [anLocalInt_373_]),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_371_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_372_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray764
						       [anLocalInt_373_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_371_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_372_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     ((float) (((Class98) class98)
						       .aShortArray762
						       [anLocalInt_373_])
					      / (float) (((Class_s) this)
							 .anInt2547)),
					     (anLocalInt_383_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_371_])
						 & 0xffffff)),
					     (anLocalInt_383_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_372_])
						 & 0xffffff)),
					     (anLocalInt_383_
					      | ((((Class98) class98)
						  .anIntArray759
						  [anLocalInt_373_])
						 & 0xffffff)),
					     0, 0, 0, 0, anLocalInt_381_);
				    } else if (((((Class98) class98)
						 .anIntArray759
						 [anLocalInt_371_])
						& 0xffffff)
					       != 0) {
					if (anLocalInt_381_ != -1
					    && (method3556
						(((TextureDescriptor)
						  (((GraphicsToolkit) aClass_ha__5404)
						       .textureSource
						       .getDescriptor(anLocalInt_381_, true)))
						 .aByte834)))
					    ((Class89) argument_261_).anInt646
						= -1694498816;
					argument_261_.method1656
					    ((float) anLocalInt_377_,
					     (float) anLocalInt_378_,
					     (float) anLocalInt_379_,
					     (float) anLocalInt_374_,
					     (float) anLocalInt_375_,
					     (float) anLocalInt_376_,
					     (float) (argument_264_
						      [anLocalInt_371_]),
					     (float) (argument_264_
						      [anLocalInt_372_]),
					     (float) (argument_264_
						      [anLocalInt_373_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_371_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_372_]),
					     (((Class98) class98).anIntArray759
					      [anLocalInt_373_]));
					((Class89) argument_261_).anInt646 = 0;
				    }
				    ((Class89) argument_261_).anInt646 = 0;
				} else
				    argument_261_.method1660
					((float) anLocalInt_377_,
					 (float) anLocalInt_378_,
					 (float) anLocalInt_379_,
					 (float) anLocalInt_374_,
					 (float) anLocalInt_375_,
					 (float) anLocalInt_376_,
					 (float) (argument_264_
						  [anLocalInt_371_]),
					 (float) (argument_264_
						  [anLocalInt_372_]),
					 (float) (argument_264_
						  [anLocalInt_373_]),
					 ((Class293) argument_260_).anInt2408);
			    }
			}
		    }
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class98) class98).aShort760;
			 anLocalInt++) {
			int anLocalInt_384_ = anLocalInt * 3;
			int anLocalInt_385_ = anLocalInt_384_ + 1;
			int anLocalInt_386_ = anLocalInt_385_ + 1;
			int anLocalInt_387_ = argument_262_[anLocalInt_384_];
			int anLocalInt_388_ = argument_262_[anLocalInt_385_];
			int anLocalInt_389_ = argument_262_[anLocalInt_386_];
			int anLocalInt_390_ = argument_263_[anLocalInt_384_];
			int anLocalInt_391_ = argument_263_[anLocalInt_385_];
			int anLocalInt_392_ = argument_263_[anLocalInt_386_];
			int anLocalInt_393_
			    = (argument_265_[anLocalInt_384_]
			       + argument_265_[anLocalInt_385_]
			       + argument_265_[anLocalInt_386_]);
			if ((((anLocalInt_387_ - anLocalInt_388_)
			      * (anLocalInt_392_ - anLocalInt_391_))
			     - ((anLocalInt_390_ - anLocalInt_391_)
				* (anLocalInt_389_ - anLocalInt_388_)))
			    > 0) {
			    ((Class89) argument_261_).aBoolean661
				= (anLocalInt_387_ < 0 || anLocalInt_388_ < 0
				   || anLocalInt_389_ < 0
				   || (anLocalInt_387_
				       > ((Class89) argument_261_).anInt650)
				   || (anLocalInt_388_
				       > ((Class89) argument_261_).anInt650)
				   || (anLocalInt_389_
				       > ((Class89) argument_261_).anInt650));
			    if (anLocalInt_393_ < 765) {
				if (anLocalInt_393_ > 0) {
				    if (((((Class98) class98).anIntArray759
					  [anLocalInt_384_])
					 & 0xffffff)
					!= 0)
					argument_261_.method1656
					    ((float) anLocalInt_390_,
					     (float) anLocalInt_391_,
					     (float) anLocalInt_392_,
					     (float) anLocalInt_387_,
					     (float) anLocalInt_388_,
					     (float) anLocalInt_389_,
					     (float) (argument_264_
						      [anLocalInt_384_]),
					     (float) (argument_264_
						      [anLocalInt_385_]),
					     (float) (argument_264_
						      [anLocalInt_386_]),
					     (DoublyLinkedNodeP2_Sub2_Sub1_Sub2
						  .method1793
					      ((((Class293) argument_260_)
						.anInt2408),
					       255,
					       (((Class98) class98)
						.anIntArray759
						[anLocalInt_384_]),
					       (argument_265_
						[anLocalInt_384_]))),
					     (DoublyLinkedNodeP2_Sub2_Sub1_Sub2
						  .method1793
					      ((((Class293) argument_260_)
						.anInt2408),
					       255,
					       (((Class98) class98)
						.anIntArray759
						[anLocalInt_385_]),
					       (argument_265_
						[anLocalInt_385_]))),
					     (DoublyLinkedNodeP2_Sub2_Sub1_Sub2
						  .method1793
					      ((((Class293) argument_260_)
						.anInt2408),
					       255,
					       (((Class98) class98)
						.anIntArray759
						[anLocalInt_386_]),
					       (argument_265_
						[anLocalInt_386_]))));
				} else if (((((Class98) class98).anIntArray759
					     [anLocalInt_384_])
					    & 0xffffff)
					   != 0)
				    argument_261_.method1656
					((float) anLocalInt_390_,
					 (float) anLocalInt_391_,
					 (float) anLocalInt_392_,
					 (float) anLocalInt_387_,
					 (float) anLocalInt_388_,
					 (float) anLocalInt_389_,
					 (float) (argument_264_
						  [anLocalInt_384_]),
					 (float) (argument_264_
						  [anLocalInt_385_]),
					 (float) (argument_264_
						  [anLocalInt_386_]),
					 (((Class98) class98).anIntArray759
					  [anLocalInt_384_]),
					 (((Class98) class98).anIntArray759
					  [anLocalInt_385_]),
					 (((Class98) class98).anIntArray759
					  [anLocalInt_386_]));
			    } else
				argument_261_.method1660
				    ((float) anLocalInt_390_,
				     (float) anLocalInt_391_,
				     (float) anLocalInt_392_,
				     (float) anLocalInt_387_,
				     (float) anLocalInt_388_,
				     (float) anLocalInt_389_,
				     (float) argument_264_[anLocalInt_384_],
				     (float) argument_264_[anLocalInt_385_],
				     (float) argument_264_[anLocalInt_386_],
				     ((Class293) argument_260_).anInt2408);
			}
		    }
		}
	    }
	}
    }
    
    final void ka(int argument_394_, int argument_395_, int argument_396_) {
	if (aByteArrayArray5403[argument_394_][argument_395_] < argument_396_)
	    aByteArrayArray5403[argument_394_][argument_395_]
		= (byte) argument_396_;
    }
    
    private final void method3560
	(int argument_397_, int argument_398_, int argument_399_,
	 int argument_400_, int argument_401_, int argument_402_,
	 int argument_403_, boolean[][] argument_404_, Class293 argument_405_,
	 Class89 argument_406_, int[] argument_407_, int[] argument_408_) {
	int anLocalInt = (argument_403_ - argument_401_) * argument_399_ / 256;
	int anLocalInt_409_ = argument_399_ >> 8;
	boolean anLocalBoolean = ((Class293) argument_405_).aBoolean2415;
	aClass_ha__5404.C(false);
	((Class89) argument_406_).aBoolean647 = false;
	((Class89) argument_406_).aBoolean659 = false;
	int anLocalInt_410_ = argument_397_;
	int anLocalInt_411_ = argument_398_ + anLocalInt;
	for (int anLocalInt_412_ = argument_400_;
	     anLocalInt_412_ < argument_402_; anLocalInt_412_++) {
	    for (int anLocalInt_413_ = argument_401_;
		 anLocalInt_413_ < argument_403_; anLocalInt_413_++) {
		if (argument_404_[anLocalInt_412_ - argument_400_]
		    [anLocalInt_413_ - argument_401_]) {
		    if (aClass327ArrayArray5399 != null) {
			if ((aClass327ArrayArray5399[anLocalInt_412_]
			     [anLocalInt_413_])
			    != null) {
			    Class327 class327
				= (aClass327ArrayArray5399[anLocalInt_412_]
				   [anLocalInt_413_]);
			    if (((Class327) class327).aShort2695 != -1
				&& (((Class327) class327).aByte2697 & 0x2) == 0
				&& ((Class327) class327).anInt2691 == 0) {
				int anLocalInt_414_
				    = (aClass_ha__5404.method2103
				       (((Class327) class327).aShort2695));
				argument_406_.method1663
				    ((float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     100.0F, 100.0F, 100.0F,
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2698,
					       anLocalInt_414_, (byte) -117)),
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2696,
					       anLocalInt_414_, (byte) -105)),
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2693,
					       anLocalInt_414_, (byte) -92)));
				argument_406_.method1663
				    ((float) anLocalInt_411_,
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_, 100.0F, 100.0F,
				     100.0F,
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2692,
					       anLocalInt_414_, (byte) -108)),
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2693,
					       anLocalInt_414_, (byte) -31)),
				     (float) (Class383.method4111
					      (((Class327) class327).anInt2696,
					       anLocalInt_414_, (byte) -114)));
			    } else if (((Class327) class327).anInt2691 == 0) {
				argument_406_.method1656
				    ((float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     100.0F, 100.0F, 100.0F,
				     ((Class327) class327).anInt2698,
				     ((Class327) class327).anInt2696,
				     ((Class327) class327).anInt2693);
				argument_406_.method1656
				    ((float) anLocalInt_411_,
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_, 100.0F, 100.0F,
				     100.0F, ((Class327) class327).anInt2692,
				     ((Class327) class327).anInt2693,
				     ((Class327) class327).anInt2696);
			    } else {
				int anLocalInt_415_
				    = ((Class327) class327).anInt2691;
				argument_406_.method1656
				    ((float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     100.0F, 100.0F, 100.0F,
				     (Statics.method2255((((Class327) class327).anInt2698 & ~0xffffff), anLocalInt_415_)),
				     (Statics.method2255((((Class327) class327).anInt2696 & ~0xffffff), anLocalInt_415_)),
				     (Statics.method2255((((Class327) class327).anInt2693 & ~0xffffff), anLocalInt_415_)));
				argument_406_.method1656
				    ((float) anLocalInt_411_,
				     (float) anLocalInt_411_,
				     (float) (anLocalInt_411_
					      - anLocalInt_409_),
				     (float) anLocalInt_410_,
				     (float) (anLocalInt_410_
					      + anLocalInt_409_),
				     (float) anLocalInt_410_, 100.0F, 100.0F,
				     100.0F,
				     (Statics.method2255((((Class327) class327).anInt2692 & ~0xffffff), anLocalInt_415_)),
				     (Statics.method2255((((Class327) class327).anInt2693 & ~0xffffff), anLocalInt_415_)),
				     (Statics.method2255((((Class327) class327).anInt2696 & ~0xffffff), anLocalInt_415_)));
			    }
			} else if ((aClass98ArrayArray5391[anLocalInt_412_]
				    [anLocalInt_413_])
				   != null) {
			    Class98 class98
				= (aClass98ArrayArray5391[anLocalInt_412_]
				   [anLocalInt_413_]);
			    for (int anLocalInt_416_ = 0;
				 (anLocalInt_416_
				  < ((Class98) class98).aShort761);
				 anLocalInt_416_++) {
				argument_407_[anLocalInt_416_]
				    = (anLocalInt_410_
				       + ((((Class98) class98).aShortArray764
					   [anLocalInt_416_])
					  * anLocalInt_409_
					  / ((Class_s) this).anInt2547));
				argument_408_[anLocalInt_416_]
				    = (anLocalInt_411_
				       - ((((Class98) class98).aShortArray762
					   [anLocalInt_416_])
					  * anLocalInt_409_
					  / ((Class_s) this).anInt2547));
			    }
			    for (int anLocalInt_417_ = 0;
				 (anLocalInt_417_
				  < ((Class98) class98).aShort760);
				 anLocalInt_417_++) {
				int anLocalInt_418_ = anLocalInt_417_ * 3;
				int anLocalInt_419_ = anLocalInt_418_ + 1;
				int anLocalInt_420_ = anLocalInt_419_ + 1;
				int anLocalInt_421_
				    = argument_407_[anLocalInt_418_];
				int anLocalInt_422_
				    = argument_407_[anLocalInt_419_];
				int anLocalInt_423_
				    = argument_407_[anLocalInt_420_];
				int anLocalInt_424_
				    = argument_408_[anLocalInt_418_];
				int anLocalInt_425_
				    = argument_408_[anLocalInt_419_];
				int anLocalInt_426_
				    = argument_408_[anLocalInt_420_];
				if (((Class98) class98).anIntArray768 != null
				    && (((Class98) class98).anIntArray768
					[anLocalInt_417_]) != 0
				    && ((((Class98) class98).aShortArray763
					 == null)
					|| ((((Class98) class98).aShortArray763
					     != null)
					    && (((Class98) class98)
						.aShortArray763
						[anLocalInt_417_]) == -1))) {
				    int anLocalInt_427_
					= (((Class98) class98).anIntArray768
					   [anLocalInt_417_]);
				    argument_406_.method1656
					((float) anLocalInt_424_,
					 (float) anLocalInt_425_,
					 (float) anLocalInt_426_,
					 (float) anLocalInt_421_,
					 (float) anLocalInt_422_,
					 (float) anLocalInt_423_, 100.0F,
					 100.0F, 100.0F,
					 (Statics.method2255(-16777216 - ((((Class98) class98).anIntArray759[anLocalInt_418_]) & ~0xffffff), anLocalInt_427_)),
					 (Statics.method2255(-16777216 - ((((Class98) class98).anIntArray759[anLocalInt_419_]) & ~0xffffff), anLocalInt_427_)),
					 (Statics.method2255(-16777216 - ((((Class98) class98).anIntArray759[anLocalInt_420_]) & ~0xffffff), anLocalInt_427_)));
				} else if ((((Class98) class98).aShortArray763
					    != null)
					   && (((Class98) class98)
					       .aShortArray763
					       [anLocalInt_417_]) != -1) {
				    int anLocalInt_428_
					= (aClass_ha__5404.method2103
					   (((Class98) class98).aShortArray763
					    [anLocalInt_417_]));
				    argument_406_.method1663
					((float) anLocalInt_424_,
					 (float) anLocalInt_425_,
					 (float) anLocalInt_426_,
					 (float) anLocalInt_421_,
					 (float) anLocalInt_422_,
					 (float) anLocalInt_423_, 100.0F,
					 100.0F, 100.0F,
					 (float) anLocalInt_428_,
					 (float) anLocalInt_428_,
					 (float) anLocalInt_428_);
				} else
				    argument_406_.method1656
					((float) anLocalInt_424_,
					 (float) anLocalInt_425_,
					 (float) anLocalInt_426_,
					 (float) anLocalInt_421_,
					 (float) anLocalInt_422_,
					 (float) anLocalInt_423_, 100.0F,
					 100.0F, 100.0F,
					 (((Class98) class98).anIntArray759
					  [anLocalInt_418_]),
					 (((Class98) class98).anIntArray759
					  [anLocalInt_419_]),
					 (((Class98) class98).anIntArray759
					  [anLocalInt_420_]));
			    }
			}
		    } else if ((aClass296ArrayArray5400[anLocalInt_412_]
				[anLocalInt_413_])
			       != null) {
			Class296 class296
			    = (aClass296ArrayArray5400[anLocalInt_412_]
			       [anLocalInt_413_]);
			for (int anLocalInt_429_ = 0;
			     (anLocalInt_429_
			      < ((Class296) class296).aShort2465);
			     anLocalInt_429_++) {
			    argument_407_[anLocalInt_429_]
				= (anLocalInt_410_
				   + ((((Class296) class296).aShortArray2464
				       [anLocalInt_429_])
				      * anLocalInt_409_
				      / ((Class_s) this).anInt2547));
			    argument_408_[anLocalInt_429_]
				= (anLocalInt_411_
				   - ((((Class296) class296).aShortArray2458
				       [anLocalInt_429_])
				      * anLocalInt_409_
				      / ((Class_s) this).anInt2547));
			}
			for (int anLocalInt_430_ = 0;
			     (anLocalInt_430_
			      < ((Class296) class296).aShort2462);
			     anLocalInt_430_++) {
			    int anLocalInt_431_ = anLocalInt_430_ * 3;
			    int anLocalInt_432_ = anLocalInt_431_ + 1;
			    int anLocalInt_433_ = anLocalInt_432_ + 1;
			    int anLocalInt_434_
				= argument_407_[anLocalInt_431_];
			    int anLocalInt_435_
				= argument_407_[anLocalInt_432_];
			    int anLocalInt_436_
				= argument_407_[anLocalInt_433_];
			    int anLocalInt_437_
				= argument_408_[anLocalInt_431_];
			    int anLocalInt_438_
				= argument_408_[anLocalInt_432_];
			    int anLocalInt_439_
				= argument_408_[anLocalInt_433_];
			    if (((Class296) class296).anIntArray2457 != null
				&& (((Class296) class296).anIntArray2457
				    [anLocalInt_430_]) != 0) {
				int anLocalInt_440_
				    = (((Class296) class296).anIntArray2457
				       [anLocalInt_430_]);
				argument_406_.method1656
				    ((float) anLocalInt_437_,
				     (float) anLocalInt_438_,
				     (float) anLocalInt_439_,
				     (float) anLocalInt_434_,
				     (float) anLocalInt_435_,
				     (float) anLocalInt_436_, 100.0F, 100.0F,
				     100.0F, anLocalInt_440_, anLocalInt_440_,
				     anLocalInt_440_);
			    } else
				argument_406_.method1656
				    ((float) anLocalInt_437_,
				     (float) anLocalInt_438_,
				     (float) anLocalInt_439_,
				     (float) anLocalInt_434_,
				     (float) anLocalInt_435_,
				     (float) anLocalInt_436_, 100.0F, 100.0F,
				     100.0F,
				     (((Class296) class296).anIntArray2460
				      [anLocalInt_431_]),
				     (((Class296) class296).anIntArray2460
				      [anLocalInt_432_]),
				     (((Class296) class296).anIntArray2460
				      [anLocalInt_433_]));
			}
		    }
		}
		anLocalInt_411_ -= anLocalInt_409_;
	    }
	    anLocalInt_411_ = argument_398_ + anLocalInt;
	    anLocalInt_410_ += anLocalInt_409_;
	}
	((Class89) argument_406_).aBoolean647 = true;
	aClass_ha__5404.C(anLocalBoolean);
    }
    
    final void method3539(int argument_441_, int argument_442_,
			  int argument_443_, boolean[][] argument_444_,
			  boolean argument_445_, int argument_446_,
			  int argument_447_) {
	Class350_Sub1 class350_sub1
	    = ((JavaToolkit) aClass_ha__5404).aClass350_Sub1_4648;
	anInt5402 = argument_446_;
	aFloat5398 = ((Class350_Sub1) class350_sub1).aFloat5421;
	aFloat5394 = ((Class350_Sub1) class350_sub1).aFloat5425;
	aFloat5397 = ((Class350_Sub1) class350_sub1).aFloat5428;
	aFloat5396 = ((Class350_Sub1) class350_sub1).aFloat5426;
	aFloat5390 = ((Class350_Sub1) class350_sub1).aFloat5420;
	aFloat5395 = ((Class350_Sub1) class350_sub1).aFloat5430;
	aFloat5392 = ((Class350_Sub1) class350_sub1).aFloat5429;
	aFloat5406 = ((Class350_Sub1) class350_sub1).aFloat5424;
	aFloat5388 = ((Class350_Sub1) class350_sub1).aFloat5418;
	aFloat5387 = ((Class350_Sub1) class350_sub1).aFloat5422;
	aFloat5393 = ((Class350_Sub1) class350_sub1).aFloat5419;
	aFloat5405 = ((Class350_Sub1) class350_sub1).aFloat5427;
	for (int anLocalInt = 0; anLocalInt < argument_443_ + argument_443_;
	     anLocalInt++) {
	    for (int anLocalInt_448_ = 0;
		 anLocalInt_448_ < argument_443_ + argument_443_;
		 anLocalInt_448_++) {
		if (argument_444_[anLocalInt][anLocalInt_448_]) {
		    int anLocalInt_449_
			= argument_441_ - argument_443_ + anLocalInt;
		    int anLocalInt_450_
			= argument_442_ - argument_443_ + anLocalInt_448_;
		    if (anLocalInt_449_ >= 0
			&& anLocalInt_449_ < ((Class_s) this).anInt2550
			&& anLocalInt_450_ >= 0
			&& anLocalInt_450_ < ((Class_s) this).anInt2549)
			method3561(anLocalInt_449_, anLocalInt_450_,
				   argument_447_);
		}
	    }
	}
    }
    
    final boolean method3542(tia_sub_35DoublyLinked argument_451_, int argument_452_,
			     int argument_453_, int argument_454_,
			     int argument_455_, boolean argument_456_) {
	return false;
    }
    
    Class_s_Sub3(JavaToolkit argument_457_, int argument_458_,
		 int argument_459_, int argument_460_, int argument_461_,
		 int[][] argument_462_, int[][] argument_463_,
		 int argument_464_) {
	super(argument_460_, argument_461_, argument_464_, argument_462_);
	aClass_ha__5404 = argument_457_;
	anInt5385 = argument_459_;
	aByteArrayArray5386 = new byte[argument_460_ + 1][argument_461_ + 1];
	int anLocalInt = ((JavaToolkit) aClass_ha__5404).anInt4634 >> 9;
	for (int anLocalInt_465_ = 1; anLocalInt_465_ < argument_461_;
	     anLocalInt_465_++) {
	    for (int anLocalInt_466_ = 1; anLocalInt_466_ < argument_460_;
		 anLocalInt_466_++) {
		int anLocalInt_467_ = anLocalInt;
		int anLocalInt_468_
		    = (argument_463_[anLocalInt_466_ + 1][anLocalInt_465_]
		       - argument_463_[anLocalInt_466_ - 1][anLocalInt_465_]);
		int anLocalInt_469_
		    = (argument_463_[anLocalInt_466_][anLocalInt_465_ + 1]
		       - argument_463_[anLocalInt_466_][anLocalInt_465_ - 1]);
		int anLocalInt_470_
		    = (int) Math.sqrt((double) ((anLocalInt_468_
						 * anLocalInt_468_)
						+ argument_464_ * 512
						+ (anLocalInt_469_
						   * anLocalInt_469_)));
		int anLocalInt_471_ = (anLocalInt_468_ << 8) / anLocalInt_470_;
		int anLocalInt_472_ = argument_464_ * -512 / anLocalInt_470_;
		int anLocalInt_473_ = (anLocalInt_469_ << 8) / anLocalInt_470_;
		anLocalInt_467_
		    += ((((JavaToolkit) aClass_ha__5404).anInt4646
			 * anLocalInt_471_)
			+ (((JavaToolkit) aClass_ha__5404).anInt4632
			   * anLocalInt_472_)
			+ (((JavaToolkit) aClass_ha__5404).anInt4661
			   * anLocalInt_473_)) >> 17;
		anLocalInt_467_ >>= 1;
		if (anLocalInt_467_ < 2)
		    anLocalInt_467_ = 2;
		else if (anLocalInt_467_ > 126)
		    anLocalInt_467_ = 126;
		aByteArrayArray5386[anLocalInt_466_][anLocalInt_465_]
		    = (byte) anLocalInt_467_;
	    }
	}
	aByteArrayArray5403 = new byte[argument_460_ + 1][argument_461_ + 1];
    }
    
    private final void method3561(int argument_474_, int argument_475_,
				  int argument_476_) {
	Class293 class293
	    = aClass_ha__5404.method2112(Thread.currentThread());
	((Class89) ((Class293) class293).aClass89_2448).anInt646 = 0;
	if (aClass327ArrayArray5399 != null)
	    method3559(argument_474_, argument_475_,
		       ((Class293) class293).aBoolean2412, class293,
		       ((Class293) class293).aClass89_2448,
		       ((Class293) class293).anIntArray2432,
		       ((Class293) class293).anIntArray2426,
		       ((Class293) class293).anIntArray2434,
		       ((Class293) class293).anIntArray2417, argument_476_);
	else if (aClass238ArrayArray5401 != null)
	    method3557(argument_474_, argument_475_,
		       ((Class293) class293).aClass89_2448,
		       ((Class293) class293).anIntArray2432,
		       ((Class293) class293).anIntArray2426,
		       ((Class293) class293).anIntArray2434,
		       ((Class293) class293).anIntArray2417, argument_476_);
	else if (aClass296ArrayArray5400 != null)
	    method3562(argument_474_, argument_475_,
		       ((Class293) class293).aBoolean2412, class293,
		       ((Class293) class293).aClass89_2448,
		       ((Class293) class293).anIntArray2432,
		       ((Class293) class293).anIntArray2426,
		       ((Class293) class293).anIntArray2434,
		       ((Class293) class293).anIntArray2417, argument_476_);
    }
    
    final tia_sub_35DoublyLinked fa(int argument_477_, int argument_478_,
			tia_sub_35DoublyLinked argument_479_) {
	return null;
    }
    
    final void CA(tia_sub_35DoublyLinked argument_480_, int argument_481_,
		  int argument_482_, int argument_483_, int argument_484_,
		  boolean argument_485_) {
	/* empty */
    }
    
    final void method3540(int argument_486_, int argument_487_) {
	method3561(argument_486_, argument_487_, 0);
    }
    
    private final void method3562
	(int argument_488_, int argument_489_, boolean argument_490_,
	 Class293 argument_491_, Class89 argument_492_, int[] argument_493_,
	 int[] argument_494_, int[] argument_495_, int[] argument_496_,
	 int argument_497_) {
	Class296 class296
	    = aClass296ArrayArray5400[argument_488_][argument_489_];
	if (argument_497_ == 0 || (argument_497_ & 0x2) == 0) {
	    if (class296 != null) {
		if (anInt5402 == -1) {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class296) class296).aShort2465;
			 anLocalInt++) {
			int anLocalInt_498_
			    = ((((Class296) class296).aShortArray2464
				[anLocalInt])
			       + (argument_488_
				  << ((Class_s) this).anInt2548));
			int anLocalInt_499_ = (((Class296) class296)
					       .aShortArray2459[anLocalInt]);
			int anLocalInt_500_
			    = ((((Class296) class296).aShortArray2458
				[anLocalInt])
			       + (argument_489_
				  << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_498_
				      + aFloat5387 * (float) anLocalInt_499_
				      + aFloat5393 * (float) anLocalInt_500_));
			if (f <= (float) (((JavaToolkit) aClass_ha__5404)
					  .anInt4643))
			    return;
			argument_496_[anLocalInt] = 0;
			if (argument_490_) {
			    int anLocalInt_501_
				= (int) (f
					 - (float) (((Class293) argument_491_)
						    .anInt2405));
			    if (anLocalInt_501_ > 255)
				anLocalInt_501_ = 255;
			    if (anLocalInt_501_ > 0) {
				argument_496_[anLocalInt] = anLocalInt_501_;
				int anLocalInt_502_
				    = ((((Class296) class296).aShortArray2466
					[anLocalInt])
				       * anLocalInt_501_ / 255);
				if (anLocalInt_502_ > 0)
				    anLocalInt_499_ -= anLocalInt_502_;
			    }
			} else if (((Class293) argument_491_).aBoolean2409) {
			    int anLocalInt_503_
				= (int) (f
					 - (float) (((Class293) argument_491_)
						    .anInt2405));
			    if (anLocalInt_503_ > 0) {
				argument_496_[anLocalInt] = anLocalInt_503_;
				if (argument_496_[anLocalInt] > 255)
				    argument_496_[anLocalInt] = 255;
			    }
			}
			float f_504_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_498_
				  + aFloat5394 * (float) anLocalInt_499_
				  + aFloat5397 * (float) anLocalInt_500_));
			float f_505_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_498_
				  + aFloat5395 * (float) anLocalInt_499_
				  + aFloat5392 * (float) anLocalInt_500_));
			argument_493_[anLocalInt]
			    = (((Class89) argument_492_).anInt655
			       + (int) (f_504_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4653) / f));
			argument_494_[anLocalInt]
			    = (((Class89) argument_492_).anInt648
			       + (int) (f_505_ * (float) (((JavaToolkit) aClass_ha__5404)
							  .anInt4645) / f));
			argument_495_[anLocalInt] = (int) f;
		    }
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < ((Class296) class296).aShort2465;
			 anLocalInt++) {
			int anLocalInt_506_
			    = ((((Class296) class296).aShortArray2464
				[anLocalInt])
			       + (argument_488_
				  << ((Class_s) this).anInt2548));
			int anLocalInt_507_ = (((Class296) class296)
					       .aShortArray2459[anLocalInt]);
			int anLocalInt_508_
			    = ((((Class296) class296).aShortArray2458
				[anLocalInt])
			       + (argument_489_
				  << ((Class_s) this).anInt2548));
			float f = (aFloat5405
				   + (aFloat5388 * (float) anLocalInt_506_
				      + aFloat5387 * (float) anLocalInt_507_
				      + aFloat5393 * (float) anLocalInt_508_));
			argument_496_[anLocalInt] = 0;
			if (argument_490_) {
			    int anLocalInt_509_
				= (anInt5402
				   - ((Class293) argument_491_).anInt2405);
			    if (anLocalInt_509_ > 255)
				anLocalInt_509_ = 255;
			    if (anLocalInt_509_ > 0) {
				argument_496_[anLocalInt] = anLocalInt_509_;
				int anLocalInt_510_
				    = ((((Class296) class296).aShortArray2466
					[anLocalInt])
				       * anLocalInt_509_ / 255);
				if (anLocalInt_510_ > 0)
				    anLocalInt_507_ -= anLocalInt_510_;
			    }
			} else if (((Class293) argument_491_).aBoolean2409) {
			    int anLocalInt_511_
				= (anInt5402
				   - ((Class293) argument_491_).anInt2405);
			    if (anLocalInt_511_ > 0) {
				argument_496_[anLocalInt] = anLocalInt_511_;
				if (argument_496_[anLocalInt] > 255)
				    argument_496_[anLocalInt] = 255;
			    }
			}
			float f_512_
			    = (aFloat5396
			       + (aFloat5398 * (float) anLocalInt_506_
				  + aFloat5394 * (float) anLocalInt_507_
				  + aFloat5397 * (float) anLocalInt_508_));
			float f_513_
			    = (aFloat5406
			       + (aFloat5390 * (float) anLocalInt_506_
				  + aFloat5395 * (float) anLocalInt_507_
				  + aFloat5392 * (float) anLocalInt_508_));
			argument_493_[anLocalInt]
			    = (((Class89) argument_492_).anInt655
			       + (int) (f_512_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4653)
					/ (float) anInt5402));
			argument_494_[anLocalInt]
			    = (((Class89) argument_492_).anInt648
			       + (int) (f_513_
					* (float) (((JavaToolkit) aClass_ha__5404)
						   .anInt4645)
					/ (float) anInt5402));
			argument_495_[anLocalInt] = (int) f;
		    }
		}
		float f = (float) ((Class_s) this).anInt2547;
		for (int anLocalInt = 0;
		     anLocalInt < ((Class296) class296).aShort2462;
		     anLocalInt++) {
		    int anLocalInt_514_ = anLocalInt * 3;
		    int anLocalInt_515_ = anLocalInt_514_ + 1;
		    int anLocalInt_516_ = anLocalInt_515_ + 1;
		    int anLocalInt_517_ = argument_493_[anLocalInt_514_];
		    int anLocalInt_518_ = argument_493_[anLocalInt_515_];
		    int anLocalInt_519_ = argument_493_[anLocalInt_516_];
		    int anLocalInt_520_ = argument_494_[anLocalInt_514_];
		    int anLocalInt_521_ = argument_494_[anLocalInt_515_];
		    int anLocalInt_522_ = argument_494_[anLocalInt_516_];
		    if ((((anLocalInt_517_ - anLocalInt_518_)
			  * (anLocalInt_522_ - anLocalInt_521_))
			 - ((anLocalInt_520_ - anLocalInt_521_)
			    * (anLocalInt_519_ - anLocalInt_518_)))
			> 0) {
			((Class89) argument_492_).aBoolean661
			    = (anLocalInt_517_ < 0 || anLocalInt_518_ < 0
			       || anLocalInt_519_ < 0
			       || (anLocalInt_517_
				   > ((Class89) argument_492_).anInt650)
			       || (anLocalInt_518_
				   > ((Class89) argument_492_).anInt650)
			       || (anLocalInt_519_
				   > ((Class89) argument_492_).anInt650));
			if ((argument_496_[anLocalInt_514_]
			     + argument_496_[anLocalInt_515_]
			     + argument_496_[anLocalInt_516_])
			    < 765) {
			    int anLocalInt_523_
				= argument_488_ << ((Class_s) this).anInt2548;
			    int anLocalInt_524_
				= argument_489_ << ((Class_s) this).anInt2548;
			    if (((((Class296) class296).anIntArray2460
				  [anLocalInt_514_])
				 & 0xffffff)
				!= 0) {
				if (((((Class296) class296).aShortArray2463
				      [anLocalInt_514_])
				     == (((Class296) class296).aShortArray2463
					 [anLocalInt_515_]))
				    && ((((Class296) class296).aShortArray2463
					 [anLocalInt_514_])
					== (((Class296) class296)
					    .aShortArray2463[anLocalInt_516_]))
				    && ((((Class296) class296).aShortArray2461
					 [anLocalInt_514_])
					== (((Class296) class296)
					    .aShortArray2461[anLocalInt_515_]))
				    && ((((Class296) class296).aShortArray2461
					 [anLocalInt_514_])
					== (((Class296) class296)
					    .aShortArray2461
					    [anLocalInt_516_])))
				    argument_492_.method1668
					((float) anLocalInt_520_,
					 (float) anLocalInt_521_,
					 (float) anLocalInt_522_,
					 (float) anLocalInt_517_,
					 (float) anLocalInt_518_,
					 (float) anLocalInt_519_,
					 (float) (argument_495_
						  [anLocalInt_514_]),
					 (float) (argument_495_
						  [anLocalInt_515_]),
					 (float) (argument_495_
						  [anLocalInt_516_]),
					 ((float) (anLocalInt_523_
						   + (((Class296) class296)
						      .aShortArray2464
						      [anLocalInt_514_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_514_])),
					 ((float) (anLocalInt_523_
						   + (((Class296) class296)
						      .aShortArray2464
						      [anLocalInt_515_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_515_])),
					 ((float) (anLocalInt_523_
						   + (((Class296) class296)
						      .aShortArray2464
						      [anLocalInt_516_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_516_])),
					 ((float) (anLocalInt_524_
						   + (((Class296) class296)
						      .aShortArray2458
						      [anLocalInt_514_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_514_])),
					 ((float) (anLocalInt_524_
						   + (((Class296) class296)
						      .aShortArray2458
						      [anLocalInt_515_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_515_])),
					 ((float) (anLocalInt_524_
						   + (((Class296) class296)
						      .aShortArray2458
						      [anLocalInt_516_]))
					  / (float) (((Class296) class296)
						     .aShortArray2461
						     [anLocalInt_516_])),
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_514_]),
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_515_]),
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_516_]),
					 ((Class293) argument_491_).anInt2408,
					 argument_496_[anLocalInt_514_],
					 argument_496_[anLocalInt_515_],
					 argument_496_[anLocalInt_516_],
					 (((Class296) class296).aShortArray2463
					  [anLocalInt_514_]));
				else
				    argument_492_.method1666
					((float) anLocalInt_520_,
					 (float) anLocalInt_521_,
					 (float) anLocalInt_522_,
					 (float) anLocalInt_517_,
					 (float) anLocalInt_518_,
					 (float) anLocalInt_519_,
					 (float) (argument_495_
						  [anLocalInt_514_]),
					 (float) (argument_495_
						  [anLocalInt_515_]),
					 (float) (argument_495_
						  [anLocalInt_516_]),
					 (float) (anLocalInt_523_
						  + (((Class296) class296)
						     .aShortArray2464
						     [anLocalInt_514_])) / f,
					 (float) (anLocalInt_523_
						  + (((Class296) class296)
						     .aShortArray2464
						     [anLocalInt_515_])) / f,
					 (float) (anLocalInt_523_
						  + (((Class296) class296)
						     .aShortArray2464
						     [anLocalInt_516_])) / f,
					 (float) (anLocalInt_524_
						  + (((Class296) class296)
						     .aShortArray2458
						     [anLocalInt_514_])) / f,
					 (float) (anLocalInt_524_
						  + (((Class296) class296)
						     .aShortArray2458
						     [anLocalInt_515_])) / f,
					 (float) (anLocalInt_524_
						  + (((Class296) class296)
						     .aShortArray2458
						     [anLocalInt_516_])) / f,
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_514_]),
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_515_]),
					 (((Class296) class296).anIntArray2460
					  [anLocalInt_516_]),
					 ((Class293) argument_491_).anInt2408,
					 argument_496_[anLocalInt_514_],
					 argument_496_[anLocalInt_515_],
					 argument_496_[anLocalInt_516_],
					 (((Class296) class296).aShortArray2463
					  [anLocalInt_514_]),
					 f / (float) (((Class296) class296)
						      .aShortArray2461
						      [anLocalInt_514_]),
					 (((Class296) class296).aShortArray2463
					  [anLocalInt_515_]),
					 f / (float) (((Class296) class296)
						      .aShortArray2461
						      [anLocalInt_515_]),
					 (((Class296) class296).aShortArray2463
					  [anLocalInt_516_]),
					 f / (float) (((Class296) class296)
						      .aShortArray2461
						      [anLocalInt_516_]));
			    }
			} else
			    argument_492_.method1660
				((float) anLocalInt_520_,
				 (float) anLocalInt_521_,
				 (float) anLocalInt_522_,
				 (float) anLocalInt_517_,
				 (float) anLocalInt_518_,
				 (float) anLocalInt_519_,
				 (float) argument_495_[anLocalInt_514_],
				 (float) argument_495_[anLocalInt_515_],
				 (float) argument_495_[anLocalInt_516_],
				 ((Class293) argument_491_).anInt2408);
		    }
		}
	    }
	}
    }
}
