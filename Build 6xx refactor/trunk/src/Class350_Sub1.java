/* Class350_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class350_Sub1 extends Class350
{
    float aFloat5418;
    float aFloat5419;
    float aFloat5420;
    float aFloat5421;
    float aFloat5422;
    static Class149 aClass149_5423 = new Class149(8);
    float aFloat5424;
    float aFloat5425;
    float aFloat5426;
    float aFloat5427;
    float aFloat5428;
    float aFloat5429;
    float aFloat5430;
    static Class221 aClass221_5431 = new Class221();
    static Js5Store aJs5Store_5432;
    static int anInt5433 = 0;
    static int anInt5434 = 0;
    static short aShort5435 = 256;
    
    final void method3832(int[] argument_0_) {
	float f = -((Class350_Sub1) this).aFloat5426 + (float) argument_0_[0];
	float f_1_
	    = -((Class350_Sub1) this).aFloat5424 + (float) argument_0_[1];
	float f_2_
	    = (float) argument_0_[2] - ((Class350_Sub1) this).aFloat5427;
	argument_0_[1] = (int) (((Class350_Sub1) this).aFloat5422 * f_2_
				+ (f_1_ * ((Class350_Sub1) this).aFloat5430
				   + f * ((Class350_Sub1) this).aFloat5425));
	argument_0_[2] = (int) (((Class350_Sub1) this).aFloat5429 * f_1_
				+ f * ((Class350_Sub1) this).aFloat5428
				+ ((Class350_Sub1) this).aFloat5419 * f_2_);
	argument_0_[0]
	    = (int) (((Class350_Sub1) this).aFloat5418 * f_2_
		     + (((Class350_Sub1) this).aFloat5421 * f
			+ ((Class350_Sub1) this).aFloat5420 * f_1_));
    }
    
    final void method3830(int argument_3_, int argument_4_, int argument_5_,
			  int[] argument_6_) {
	argument_6_[1]
	    = (int) ((float) argument_3_ * ((Class350_Sub1) this).aFloat5420
		     + (float) argument_4_ * ((Class350_Sub1) this).aFloat5430
		     + ((float) argument_5_
			* ((Class350_Sub1) this).aFloat5429));
	argument_6_[0]
	    = (int) (((Class350_Sub1) this).aFloat5425 * (float) argument_4_
		     + (float) argument_3_ * ((Class350_Sub1) this).aFloat5421
		     + (((Class350_Sub1) this).aFloat5428
			* (float) argument_5_));
	argument_6_[2]
	    = (int) (((Class350_Sub1) this).aFloat5418 * (float) argument_3_
		     + (float) argument_4_ * ((Class350_Sub1) this).aFloat5422
		     + ((float) argument_5_
			* ((Class350_Sub1) this).aFloat5419));
    }
    
    public static void method3842(int argument) {
	aClass149_5423 = null;
	aJs5Store_5432 = null;
	aClass221_5431 = null;
    }
    
    static final Class112 method3843(int argument, Component argument_7_,
				     int argument_8_, Signlink argument_9_,
				     int argument_10_) {
	if (Statics.anInt44 == 0)
	    throw new IllegalStateException();
	if (argument_8_ < 0 || argument_8_ >= 2)
	    throw new IllegalArgumentException();
	if (argument_10_ < 256)
	    argument_10_ = 256;
	try {
	    Class112 class112
		= (Class112) Class.forName("Class112_Sub2").newInstance();
	    ((Class112) class112).anInt937 = argument_10_;
	    ((Class112) class112).anIntArray923
		= new int[(Class62_Sub3.aBoolean4377 ? 2 : 1) * 256];
	    class112.method2010(argument_7_);
	    ((Class112) class112).anInt927 = (argument_10_ & ~0x3ff) + 1024;
	    if (((Class112) class112).anInt927 > 16384)
		((Class112) class112).anInt927 = 16384;
	    class112.method1999(((Class112) class112).anInt927);
	    if (Node_Sub31_Sub16.anInt5909 > 0
		&& MultilanguageString.aClass146_2866 == null) {
		MultilanguageString.aClass146_2866 = new Class146();
		((Class146) MultilanguageString.aClass146_2866).aSignlink_1112
		    = argument_9_;
		argument_9_.requestThreadStart(MultilanguageString.aClass146_2866, Node_Sub31_Sub16.anInt5909);
	    }
	    if (MultilanguageString.aClass146_2866 != null) {
		if ((((Class146) MultilanguageString.aClass146_2866).aClass112Array1109
		     [argument_8_])
		    != null)
		    throw new IllegalArgumentException();
		((Class146) MultilanguageString.aClass146_2866).aClass112Array1109
		    [argument_8_]
		    = class112;
	    }
	    return class112;
	} catch (Throwable throwable) {
	    try {
		Class112_Sub1 class112_sub1
		    = new Class112_Sub1(argument_9_, argument_8_);
		((Class112) class112_sub1).anIntArray923
		    = new int[(!Class62_Sub3.aBoolean4377 ? 1 : 2) * 256];
		((Class112) class112_sub1).anInt937 = argument_10_;
		class112_sub1.method2010(argument_7_);
		((Class112) class112_sub1).anInt927 = 16384;
		class112_sub1.method1999(((Class112) class112_sub1).anInt927);
		if (Node_Sub31_Sub16.anInt5909 > 0
		    && MultilanguageString.aClass146_2866 == null) {
		    MultilanguageString.aClass146_2866 = new Class146();
		    ((Class146) MultilanguageString.aClass146_2866).aSignlink_1112
			= argument_9_;
		    argument_9_.requestThreadStart(MultilanguageString.aClass146_2866, Node_Sub31_Sub16.anInt5909);
		}
		if (MultilanguageString.aClass146_2866 != null) {
		    if ((((Class146) MultilanguageString.aClass146_2866)
			 .aClass112Array1109[argument_8_])
			!= null)
			throw new IllegalArgumentException();
		    ((Class146) MultilanguageString.aClass146_2866).aClass112Array1109
			[argument_8_]
			= class112_sub1;
		}
		return class112_sub1;
	    } catch (Throwable throwable_11_) {
		return new Class112();
	    }
	}
    }
    
    final void method3837(int argument_12_) {
	float f = Class55.aFloatArray395[argument_12_ & 0x3fff];
	float f_13_ = Class55.aFloatArray403[argument_12_ & 0x3fff];
	float f_14_ = ((Class350_Sub1) this).aFloat5421;
	float f_15_ = ((Class350_Sub1) this).aFloat5425;
	float f_16_ = ((Class350_Sub1) this).aFloat5428;
	float f_17_ = ((Class350_Sub1) this).aFloat5426;
	((Class350_Sub1) this).aFloat5421
	    = -(((Class350_Sub1) this).aFloat5420 * f_13_) + f * f_14_;
	((Class350_Sub1) this).aFloat5425
	    = f * f_15_ - f_13_ * ((Class350_Sub1) this).aFloat5430;
	((Class350_Sub1) this).aFloat5420
	    = f * ((Class350_Sub1) this).aFloat5420 + f_13_ * f_14_;
	((Class350_Sub1) this).aFloat5430
	    = ((Class350_Sub1) this).aFloat5430 * f + f_15_ * f_13_;
	((Class350_Sub1) this).aFloat5428
	    = -(f_13_ * ((Class350_Sub1) this).aFloat5429) + f * f_16_;
	((Class350_Sub1) this).aFloat5429
	    = ((Class350_Sub1) this).aFloat5429 * f + f_16_ * f_13_;
	((Class350_Sub1) this).aFloat5426
	    = f * f_17_ - f_13_ * ((Class350_Sub1) this).aFloat5424;
	((Class350_Sub1) this).aFloat5424
	    = f_13_ * f_17_ + f * ((Class350_Sub1) this).aFloat5424;
    }
    
    final Class350 method3826() {
	Class350_Sub1 class350_sub1 = new Class350_Sub1();
	((Class350_Sub1) class350_sub1).aFloat5430
	    = ((Class350_Sub1) this).aFloat5430;
	((Class350_Sub1) class350_sub1).aFloat5425
	    = ((Class350_Sub1) this).aFloat5425;
	((Class350_Sub1) class350_sub1).aFloat5429
	    = ((Class350_Sub1) this).aFloat5429;
	((Class350_Sub1) class350_sub1).aFloat5422
	    = ((Class350_Sub1) this).aFloat5422;
	((Class350_Sub1) class350_sub1).aFloat5428
	    = ((Class350_Sub1) this).aFloat5428;
	((Class350_Sub1) class350_sub1).aFloat5424
	    = ((Class350_Sub1) this).aFloat5424;
	((Class350_Sub1) class350_sub1).aFloat5421
	    = ((Class350_Sub1) this).aFloat5421;
	((Class350_Sub1) class350_sub1).aFloat5419
	    = ((Class350_Sub1) this).aFloat5419;
	((Class350_Sub1) class350_sub1).aFloat5418
	    = ((Class350_Sub1) this).aFloat5418;
	((Class350_Sub1) class350_sub1).aFloat5426
	    = ((Class350_Sub1) this).aFloat5426;
	((Class350_Sub1) class350_sub1).aFloat5420
	    = ((Class350_Sub1) this).aFloat5420;
	((Class350_Sub1) class350_sub1).aFloat5427
	    = ((Class350_Sub1) this).aFloat5427;
	return class350_sub1;
    }
    
    final void method3841(int argument_18_) {
	((Class350_Sub1) this).aFloat5421 = 1.0F;
	((Class350_Sub1) this).aFloat5430
	    = ((Class350_Sub1) this).aFloat5419
	    = Class55.aFloatArray395[argument_18_ & 0x3fff];
	((Class350_Sub1) this).aFloat5422
	    = Class55.aFloatArray403[argument_18_ & 0x3fff];
	((Class350_Sub1) this).aFloat5429 = -((Class350_Sub1) this).aFloat5422;
	((Class350_Sub1) this).aFloat5425
	    = ((Class350_Sub1) this).aFloat5428
	    = ((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) this).aFloat5420
	    = ((Class350_Sub1) this).aFloat5424
	    = ((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) this).aFloat5427 = 0.0F;
    }
    
    final void method3833(int argument_19_) {
	float f = Class55.aFloatArray395[argument_19_ & 0x3fff];
	float f_20_ = Class55.aFloatArray403[argument_19_ & 0x3fff];
	float f_21_ = ((Class350_Sub1) this).aFloat5420;
	float f_22_ = ((Class350_Sub1) this).aFloat5430;
	float f_23_ = ((Class350_Sub1) this).aFloat5429;
	((Class350_Sub1) this).aFloat5420
	    = f * f_21_ - f_20_ * ((Class350_Sub1) this).aFloat5418;
	float f_24_ = ((Class350_Sub1) this).aFloat5424;
	((Class350_Sub1) this).aFloat5430
	    = f_22_ * f - ((Class350_Sub1) this).aFloat5422 * f_20_;
	((Class350_Sub1) this).aFloat5418
	    = f_21_ * f_20_ + f * ((Class350_Sub1) this).aFloat5418;
	((Class350_Sub1) this).aFloat5429
	    = f * f_23_ - f_20_ * ((Class350_Sub1) this).aFloat5419;
	((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) this).aFloat5422 * f + f_20_ * f_22_;
	((Class350_Sub1) this).aFloat5419
	    = f_23_ * f_20_ + f * ((Class350_Sub1) this).aFloat5419;
	((Class350_Sub1) this).aFloat5424
	    = f * f_24_ - f_20_ * ((Class350_Sub1) this).aFloat5427;
	((Class350_Sub1) this).aFloat5427
	    = f_20_ * f_24_ + f * ((Class350_Sub1) this).aFloat5427;
    }
    
    final void method3839(int argument_25_) {
	((Class350_Sub1) this).aFloat5419 = 1.0F;
	((Class350_Sub1) this).aFloat5421
	    = ((Class350_Sub1) this).aFloat5430
	    = Class55.aFloatArray395[argument_25_ & 0x3fff];
	((Class350_Sub1) this).aFloat5420
	    = Class55.aFloatArray403[argument_25_ & 0x3fff];
	((Class350_Sub1) this).aFloat5428
	    = ((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) this).aFloat5429
	    = ((Class350_Sub1) this).aFloat5424
	    = ((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) this).aFloat5427 = 0.0F;
	((Class350_Sub1) this).aFloat5425 = -((Class350_Sub1) this).aFloat5420;
    }
    
    final void method3834(int argument_26_) {
	float f = Class55.aFloatArray395[argument_26_ & 0x3fff];
	float f_27_ = Class55.aFloatArray403[argument_26_ & 0x3fff];
	float f_28_ = ((Class350_Sub1) this).aFloat5421;
	float f_29_ = ((Class350_Sub1) this).aFloat5425;
	float f_30_ = ((Class350_Sub1) this).aFloat5428;
	((Class350_Sub1) this).aFloat5421
	    = f * f_28_ + ((Class350_Sub1) this).aFloat5418 * f_27_;
	float f_31_ = ((Class350_Sub1) this).aFloat5426;
	((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) this).aFloat5418 * f - f_27_ * f_28_;
	((Class350_Sub1) this).aFloat5425
	    = f_27_ * ((Class350_Sub1) this).aFloat5422 + f * f_29_;
	((Class350_Sub1) this).aFloat5428
	    = f_27_ * ((Class350_Sub1) this).aFloat5419 + f * f_30_;
	((Class350_Sub1) this).aFloat5422
	    = f * ((Class350_Sub1) this).aFloat5422 - f_29_ * f_27_;
	((Class350_Sub1) this).aFloat5419
	    = f * ((Class350_Sub1) this).aFloat5419 - f_27_ * f_30_;
	((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) this).aFloat5427 * f_27_ + f_31_ * f;
	((Class350_Sub1) this).aFloat5427
	    = -(f_27_ * f_31_) + ((Class350_Sub1) this).aFloat5427 * f;
    }
    
    final void method3829(int argument_32_, int argument_33_, int argument_34_,
			  int[] argument_35_) {
	argument_35_[2] = (int) (((Class350_Sub1) this).aFloat5427
				 + (((float) argument_33_
				     * ((Class350_Sub1) this).aFloat5422)
				    + ((float) argument_32_
				       * ((Class350_Sub1) this).aFloat5418)
				    + ((float) argument_34_
				       * ((Class350_Sub1) this).aFloat5419)));
	argument_35_[0]
	    = (int) (((Class350_Sub1) this).aFloat5428 * (float) argument_34_
		     + ((((Class350_Sub1) this).aFloat5425
			 * (float) argument_33_)
			+ ((float) argument_32_
			   * ((Class350_Sub1) this).aFloat5421))
		     + ((Class350_Sub1) this).aFloat5426);
	argument_35_[1] = (int) (((Class350_Sub1) this).aFloat5424
				 + (((float) argument_34_
				     * ((Class350_Sub1) this).aFloat5429)
				    + (((float) argument_32_
					* ((Class350_Sub1) this).aFloat5420)
				       + (((Class350_Sub1) this).aFloat5430
					  * (float) argument_33_))));
    }
    
    final void method3831(int argument_36_, int argument_37_, int argument_38_,
			  int[] argument_39_) {
	argument_37_ -= ((Class350_Sub1) this).aFloat5424;
	argument_36_ -= ((Class350_Sub1) this).aFloat5426;
	argument_38_ -= ((Class350_Sub1) this).aFloat5427;
	argument_39_[2]
	    = (int) ((float) argument_37_ * ((Class350_Sub1) this).aFloat5429
		     + (float) argument_36_ * ((Class350_Sub1) this).aFloat5428
		     + (((Class350_Sub1) this).aFloat5419
			* (float) argument_38_));
	argument_39_[1]
	    = (int) (((Class350_Sub1) this).aFloat5430 * (float) argument_37_
		     + (float) argument_36_ * ((Class350_Sub1) this).aFloat5425
		     + (((Class350_Sub1) this).aFloat5422
			* (float) argument_38_));
	argument_39_[0]
	    = (int) (((Class350_Sub1) this).aFloat5418 * (float) argument_38_
		     + (((float) argument_37_
			 * ((Class350_Sub1) this).aFloat5420)
			+ (((Class350_Sub1) this).aFloat5421
			   * (float) argument_36_)));
    }
    
    final void method3824(int argument_40_) {
	((Class350_Sub1) this).aFloat5430 = 1.0F;
	((Class350_Sub1) this).aFloat5421
	    = ((Class350_Sub1) this).aFloat5419
	    = Class55.aFloatArray395[argument_40_ & 0x3fff];
	((Class350_Sub1) this).aFloat5428
	    = Class55.aFloatArray403[argument_40_ & 0x3fff];
	((Class350_Sub1) this).aFloat5418 = -((Class350_Sub1) this).aFloat5428;
	((Class350_Sub1) this).aFloat5425
	    = ((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) this).aFloat5420
	    = ((Class350_Sub1) this).aFloat5429
	    = ((Class350_Sub1) this).aFloat5424
	    = ((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) this).aFloat5427 = 0.0F;
    }
    
    final void method3828(int argument_41_, int argument_42_, int argument_43_,
			  int argument_44_, int argument_45_,
			  int argument_46_) {
	float f = Class55.aFloatArray395[argument_44_ & 0x3fff];
	float f_47_ = Class55.aFloatArray403[argument_44_ & 0x3fff];
	float f_48_ = Class55.aFloatArray395[argument_45_ & 0x3fff];
	float f_49_ = Class55.aFloatArray403[argument_45_ & 0x3fff];
	float f_50_ = Class55.aFloatArray395[argument_46_ & 0x3fff];
	float f_51_ = Class55.aFloatArray403[argument_46_ & 0x3fff];
	float f_52_ = f_47_ * f_50_;
	float f_53_ = f_47_ * f_51_;
	((Class350_Sub1) this).aFloat5430 = f * f_50_;
	((Class350_Sub1) this).aFloat5420 = f_51_ * -f_48_ + f_52_ * f_49_;
	((Class350_Sub1) this).aFloat5422 = -f_47_;
	((Class350_Sub1) this).aFloat5429 = f_49_ * f_51_ + f_52_ * f_48_;
	((Class350_Sub1) this).aFloat5421 = f_53_ * f_49_ + f_50_ * f_48_;
	((Class350_Sub1) this).aFloat5419 = f * f_48_;
	((Class350_Sub1) this).aFloat5418 = f * f_49_;
	((Class350_Sub1) this).aFloat5425 = f_51_ * f;
	((Class350_Sub1) this).aFloat5428 = -f_49_ * f_50_ + f_53_ * f_48_;
	((Class350_Sub1) this).aFloat5424
	    = (-(((Class350_Sub1) this).aFloat5429 * (float) argument_43_)
	       + ((float) -argument_41_ * ((Class350_Sub1) this).aFloat5420
		  - (float) argument_42_ * ((Class350_Sub1) this).aFloat5430));
	((Class350_Sub1) this).aFloat5426
	    = (-((float) argument_43_ * ((Class350_Sub1) this).aFloat5428)
	       + (-(((Class350_Sub1) this).aFloat5425 * (float) argument_42_)
		  + ((float) -argument_41_
		     * ((Class350_Sub1) this).aFloat5421)));
	((Class350_Sub1) this).aFloat5427
	    = (((Class350_Sub1) this).aFloat5418 * (float) -argument_41_
	       - (float) argument_42_ * ((Class350_Sub1) this).aFloat5422
	       - (float) argument_43_ * ((Class350_Sub1) this).aFloat5419);
    }
    
    final void method3840() {
	((Class350_Sub1) this).aFloat5420
	    = ((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) this).aFloat5425
	    = ((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) this).aFloat5428
	    = ((Class350_Sub1) this).aFloat5429
	    = ((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) this).aFloat5424
	    = ((Class350_Sub1) this).aFloat5427 = 0.0F;
	((Class350_Sub1) this).aFloat5421
	    = ((Class350_Sub1) this).aFloat5430
	    = ((Class350_Sub1) this).aFloat5419 = 1.0F;
    }
    
    final void method3825(int argument_54_, int argument_55_,
			  int argument_56_) {
	((Class350_Sub1) this).aFloat5421
	    = ((Class350_Sub1) this).aFloat5430
	    = ((Class350_Sub1) this).aFloat5419 = 1.0F;
	((Class350_Sub1) this).aFloat5420
	    = ((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) this).aFloat5425
	    = ((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) this).aFloat5428
	    = ((Class350_Sub1) this).aFloat5429 = 0.0F;
	((Class350_Sub1) this).aFloat5427 = (float) argument_56_;
	((Class350_Sub1) this).aFloat5426 = (float) argument_54_;
	((Class350_Sub1) this).aFloat5424 = (float) argument_55_;
    }
    
    public Class350_Sub1() {
	method3840();
    }
    
    final void method3835(int argument_57_, int argument_58_,
			  int argument_59_) {
	((Class350_Sub1) this).aFloat5424 += (float) argument_58_;
	((Class350_Sub1) this).aFloat5426 += (float) argument_57_;
	((Class350_Sub1) this).aFloat5427 += (float) argument_59_;
    }
    
    final void method3838(Class350 argument_60_) {
	Class350_Sub1 class350_sub1 = (Class350_Sub1) argument_60_;
	((Class350_Sub1) this).aFloat5420
	    = ((Class350_Sub1) class350_sub1).aFloat5420;
	((Class350_Sub1) this).aFloat5425
	    = ((Class350_Sub1) class350_sub1).aFloat5425;
	((Class350_Sub1) this).aFloat5429
	    = ((Class350_Sub1) class350_sub1).aFloat5429;
	((Class350_Sub1) this).aFloat5419
	    = ((Class350_Sub1) class350_sub1).aFloat5419;
	((Class350_Sub1) this).aFloat5430
	    = ((Class350_Sub1) class350_sub1).aFloat5430;
	((Class350_Sub1) this).aFloat5422
	    = ((Class350_Sub1) class350_sub1).aFloat5422;
	((Class350_Sub1) this).aFloat5421
	    = ((Class350_Sub1) class350_sub1).aFloat5421;
	((Class350_Sub1) this).aFloat5424
	    = ((Class350_Sub1) class350_sub1).aFloat5424;
	((Class350_Sub1) this).aFloat5418
	    = ((Class350_Sub1) class350_sub1).aFloat5418;
	((Class350_Sub1) this).aFloat5427
	    = ((Class350_Sub1) class350_sub1).aFloat5427;
	((Class350_Sub1) this).aFloat5426
	    = ((Class350_Sub1) class350_sub1).aFloat5426;
	((Class350_Sub1) this).aFloat5428
	    = ((Class350_Sub1) class350_sub1).aFloat5428;
    }
}
