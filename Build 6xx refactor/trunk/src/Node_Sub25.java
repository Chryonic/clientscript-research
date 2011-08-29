/* Class59_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub25 extends Node
{
    private static int[] anIntArray4069;
    private static float[] aFloatArray4070;
    private static boolean[] aBooleanArray4071;
    private int anInt4072;
    private static Class300[] aClass300Array4073;
    private int anInt4074;
    private static int[] anIntArray4075;
    private static float[] aFloatArray4076;
    private static float[] aFloatArray4077;
    static Class386[] aClass386Array4078;
    private static float[] aFloatArray4079;
    private static int anInt4080;
    private static byte[] aByteArray4081;
    private static float[] aFloatArray4082;
    private byte[][] aByteArrayArray4083;
    private float[] aFloatArray4084;
    private static float[] aFloatArray4085;
    private int anInt4086;
    private boolean aBoolean4087;
    private static int anInt4088;
    private static boolean aBoolean4089 = false;
    private static float[] aFloatArray4090;
    private int anInt4091;
    private static int anInt4092;
    private static Class218[] aClass218Array4093;
    private static int[] anIntArray4094;
    private boolean aBoolean4095;
    private int anInt4096;
    private static Class265[] aClass265Array4097;
    private int anInt4098;
    private static int anInt4099;
    private byte[] aByteArray4100;
    private int anInt4101;
    private int anInt4102;
    
    static final int method754() {
	int anLocalInt = aByteArray4081[anInt4099] >> anInt4080 & 0x1;
	anInt4080++;
	anInt4099 += anInt4080 >> 3;
	anInt4080 &= 0x7;
	return anLocalInt;
    }
    
    static final Node_Sub25 method755(Js5Store argument, int argument_0_) {
	if (!method765(argument)) {
	    argument.isFlatFile(argument_0_);
	    return null;
	}
	byte[] anLocalInts = argument.getFlatData(argument_0_);
	if (anLocalInts == null)
	    return null;
	return new Node_Sub25(anLocalInts);
    }
    
    static final Node_Sub25 method756(Js5Store argument, int argument_1_,
					 int argument_2_) {
	if (!method765(argument)) {
	    argument.isLoaded(argument_1_, argument_2_);
	    return null;
	}
	byte[] anLocalInts = argument.getData(argument_1_, argument_2_);
	if (anLocalInts == null)
	    return null;
	return new Node_Sub25(anLocalInts);
    }
    
    private final void method757(byte[] argument_3_) {
	Packet class59_sub28 = new Packet(argument_3_);
	anInt4074 = class59_sub28.g4();
	anInt4091 = class59_sub28.g4();
	anInt4096 = class59_sub28.g4();
	anInt4072 = class59_sub28.g4();
	if (anInt4072 < 0) {
	    anInt4072 = anInt4072 ^ 0xffffffff;
	    aBoolean4087 = true;
	}
	int anLocalInt = class59_sub28.g4();
	aByteArrayArray4083 = new byte[anLocalInt][];
	for (int anLocalInt_4_ = 0; anLocalInt_4_ < anLocalInt;
	     anLocalInt_4_++) {
	    int anLocalInt_5_ = 0;
	    int anLocalInt_6_;
	    do {
		anLocalInt_6_ = class59_sub28.g1();
		anLocalInt_5_ += anLocalInt_6_;
	    } while (anLocalInt_6_ >= 255);
	    byte[] anLocalInts = new byte[anLocalInt_5_];
	    class59_sub28.gbytes(anLocalInts, 0, anLocalInt_5_);
	    aByteArrayArray4083[anLocalInt_4_] = anLocalInts;
	}
    }
    
    final Node_Sub40_Sub1 method758(int[] argument_7_) {
	if (argument_7_ != null && argument_7_[0] <= 0)
	    return null;
	if (aByteArray4100 == null) {
	    anInt4086 = 0;
	    aFloatArray4084 = new float[anInt4088];
	    aByteArray4100 = new byte[anInt4091];
	    anInt4102 = 0;
	    anInt4101 = 0;
	}
	for (/**/; anInt4101 < aByteArrayArray4083.length; anInt4101++) {
	    if (argument_7_ != null && argument_7_[0] <= 0)
		return null;
	    float[] fs = method761(anInt4101);
	    if (fs != null) {
		int anLocalInt = anInt4102;
		int anLocalInt_8_ = fs.length;
		if (anLocalInt_8_ > anInt4091 - anLocalInt)
		    anLocalInt_8_ = anInt4091 - anLocalInt;
		for (int anLocalInt_9_ = 0; anLocalInt_9_ < anLocalInt_8_;
		     anLocalInt_9_++) {
		    int anLocalInt_10_
			= (int) (fs[anLocalInt_9_] * 128.0F + 128.0F);
		    if ((anLocalInt_10_ & ~0xff) != 0)
			anLocalInt_10_ = (anLocalInt_10_ ^ 0xffffffff) >> 31;
		    aByteArray4100[anLocalInt++]
			= (byte) (anLocalInt_10_ - 128);
		}
		if (argument_7_ != null)
		    argument_7_[0] -= anLocalInt - anInt4102;
		anInt4102 = anLocalInt;
	    }
	}
	aFloatArray4084 = null;
	byte[] anLocalInts = aByteArray4100;
	aByteArray4100 = null;
	return new Node_Sub40_Sub1(anInt4074, anLocalInts, anInt4096,
				      anInt4072, aBoolean4087);
    }
    
    static final float method759(int argument) {
	int anLocalInt = argument & 0x1fffff;
	int anLocalInt_11_ = argument & ~0x7fffffff;
	int anLocalInt_12_ = (argument & 0x7fe00000) >> 21;
	if (anLocalInt_11_ != 0)
	    anLocalInt = -anLocalInt;
	return (float) ((double) anLocalInt
			* Math.pow(2.0, (double) (anLocalInt_12_ - 788)));
    }
    
    public static void method760() {
	aByteArray4081 = null;
	aClass386Array4078 = null;
	aClass218Array4093 = null;
	aClass300Array4073 = null;
	aClass265Array4097 = null;
	aBooleanArray4071 = null;
	anIntArray4069 = null;
	aFloatArray4076 = null;
	aFloatArray4079 = null;
	aFloatArray4090 = null;
	aFloatArray4077 = null;
	aFloatArray4085 = null;
	aFloatArray4070 = null;
	aFloatArray4082 = null;
	anIntArray4075 = null;
	anIntArray4094 = null;
    }
    
    private final float[] method761(int argument_13_) {
	method763(aByteArrayArray4083[argument_13_], 0);
	method754();
	int anLocalInt
	    = method762(DoublyLinkedNode_Sub51_Sub13
			    .method1258(9761, anIntArray4069.length - 1));
	boolean anLocalBoolean = aBooleanArray4071[anLocalInt];
	int anLocalInt_14_ = anLocalBoolean ? anInt4088 : anInt4092;
	boolean anLocalBoolean_15_ = false;
	boolean anLocalBoolean_16_ = false;
	if (anLocalBoolean) {
	    anLocalBoolean_15_ = method754() != 0;
	    anLocalBoolean_16_ = method754() != 0;
	}
	int anLocalInt_17_ = anLocalInt_14_ >> 1;
	int anLocalInt_18_;
	int anLocalInt_19_;
	int anLocalInt_20_;
	if (anLocalBoolean && !anLocalBoolean_15_) {
	    anLocalInt_18_ = (anLocalInt_14_ >> 2) - (anInt4092 >> 2);
	    anLocalInt_19_ = (anLocalInt_14_ >> 2) + (anInt4092 >> 2);
	    anLocalInt_20_ = anInt4092 >> 1;
	} else {
	    anLocalInt_18_ = 0;
	    anLocalInt_19_ = anLocalInt_17_;
	    anLocalInt_20_ = anLocalInt_14_ >> 1;
	}
	int anLocalInt_21_;
	int anLocalInt_22_;
	int anLocalInt_23_;
	if (anLocalBoolean && !anLocalBoolean_16_) {
	    anLocalInt_21_
		= anLocalInt_14_ - (anLocalInt_14_ >> 2) - (anInt4092 >> 2);
	    anLocalInt_22_
		= anLocalInt_14_ - (anLocalInt_14_ >> 2) + (anInt4092 >> 2);
	    anLocalInt_23_ = anInt4092 >> 1;
	} else {
	    anLocalInt_21_ = anLocalInt_17_;
	    anLocalInt_22_ = anLocalInt_14_;
	    anLocalInt_23_ = anLocalInt_14_ >> 1;
	}
	Class265 class265 = aClass265Array4097[anIntArray4069[anLocalInt]];
	int anLocalInt_24_ = ((Class265) class265).anInt2050;
	int anLocalInt_25_
	    = ((Class265) class265).anIntArray2052[anLocalInt_24_];
	boolean anLocalBoolean_26_
	    = !aClass218Array4093[anLocalInt_25_].method3016();
	boolean anLocalBoolean_27_ = anLocalBoolean_26_;
	for (int anLocalInt_28_ = 0;
	     anLocalInt_28_ < ((Class265) class265).anInt2051;
	     anLocalInt_28_++) {
	    Class300 class300
		= (aClass300Array4073
		   [((Class265) class265).anIntArray2053[anLocalInt_28_]]);
	    float[] fs = aFloatArray4076;
	    class300.method3530(fs, anLocalInt_14_ >> 1, anLocalBoolean_27_);
	}
	if (!anLocalBoolean_26_) {
	    int anLocalInt_29_ = ((Class265) class265).anInt2050;
	    int anLocalInt_30_
		= ((Class265) class265).anIntArray2052[anLocalInt_29_];
	    aClass218Array4093[anLocalInt_30_].method3022(aFloatArray4076,
							  anLocalInt_14_ >> 1);
	}
	if (anLocalBoolean_26_) {
	    for (int anLocalInt_31_ = anLocalInt_14_ >> 1;
		 anLocalInt_31_ < anLocalInt_14_; anLocalInt_31_++)
		aFloatArray4076[anLocalInt_31_] = 0.0F;
	} else {
	    int anLocalInt_32_ = anLocalInt_14_ >> 1;
	    int anLocalInt_33_ = anLocalInt_14_ >> 2;
	    int anLocalInt_34_ = anLocalInt_14_ >> 3;
	    float[] fs = aFloatArray4076;
	    for (int anLocalInt_35_ = 0; anLocalInt_35_ < anLocalInt_32_;
		 anLocalInt_35_++)
		fs[anLocalInt_35_] *= 0.5F;
	    for (int anLocalInt_36_ = anLocalInt_32_;
		 anLocalInt_36_ < anLocalInt_14_; anLocalInt_36_++)
		fs[anLocalInt_36_] = -fs[anLocalInt_14_ - anLocalInt_36_ - 1];
	    float[] fs_37_
		= anLocalBoolean ? aFloatArray4085 : aFloatArray4079;
	    float[] fs_38_
		= anLocalBoolean ? aFloatArray4070 : aFloatArray4090;
	    float[] fs_39_
		= anLocalBoolean ? aFloatArray4082 : aFloatArray4077;
	    int[] anLocalInts
		= anLocalBoolean ? anIntArray4094 : anIntArray4075;
	    for (int anLocalInt_40_ = 0; anLocalInt_40_ < anLocalInt_33_;
		 anLocalInt_40_++) {
		float f = (fs[anLocalInt_40_ * 4]
			   - fs[anLocalInt_14_ - anLocalInt_40_ * 4 - 1]);
		float f_41_ = (fs[anLocalInt_40_ * 4 + 2]
			       - fs[anLocalInt_14_ - anLocalInt_40_ * 4 - 3]);
		float f_42_ = fs_37_[anLocalInt_40_ * 2];
		float f_43_ = fs_37_[anLocalInt_40_ * 2 + 1];
		fs[anLocalInt_14_ - anLocalInt_40_ * 4 - 1]
		    = f * f_42_ - f_41_ * f_43_;
		fs[anLocalInt_14_ - anLocalInt_40_ * 4 - 3]
		    = f * f_43_ + f_41_ * f_42_;
	    }
	    for (int anLocalInt_44_ = 0; anLocalInt_44_ < anLocalInt_34_;
		 anLocalInt_44_++) {
		float f = fs[anLocalInt_32_ + 3 + anLocalInt_44_ * 4];
		float f_45_ = fs[anLocalInt_32_ + 1 + anLocalInt_44_ * 4];
		float f_46_ = fs[anLocalInt_44_ * 4 + 3];
		float f_47_ = fs[anLocalInt_44_ * 4 + 1];
		fs[anLocalInt_32_ + 3 + anLocalInt_44_ * 4] = f + f_46_;
		fs[anLocalInt_32_ + 1 + anLocalInt_44_ * 4] = f_45_ + f_47_;
		float f_48_ = fs_37_[anLocalInt_32_ - 4 - anLocalInt_44_ * 4];
		float f_49_ = fs_37_[anLocalInt_32_ - 3 - anLocalInt_44_ * 4];
		fs[anLocalInt_44_ * 4 + 3]
		    = (f - f_46_) * f_48_ - (f_45_ - f_47_) * f_49_;
		fs[anLocalInt_44_ * 4 + 1]
		    = (f_45_ - f_47_) * f_48_ + (f - f_46_) * f_49_;
	    }
	    int anLocalInt_50_
		= DoublyLinkedNode_Sub51_Sub13.method1258(9761, anLocalInt_14_ - 1);
	    for (int anLocalInt_51_ = 0; anLocalInt_51_ < anLocalInt_50_ - 3;
		 anLocalInt_51_++) {
		int anLocalInt_52_ = anLocalInt_14_ >> anLocalInt_51_ + 2;
		int anLocalInt_53_ = 8 << anLocalInt_51_;
		for (int anLocalInt_54_ = 0;
		     anLocalInt_54_ < 2 << anLocalInt_51_; anLocalInt_54_++) {
		    int anLocalInt_55_
			= anLocalInt_14_ - anLocalInt_52_ * 2 * anLocalInt_54_;
		    int anLocalInt_56_
			= (anLocalInt_14_
			   - anLocalInt_52_ * (anLocalInt_54_ * 2 + 1));
		    for (int anLocalInt_57_ = 0;
			 anLocalInt_57_ < anLocalInt_14_ >> anLocalInt_51_ + 4;
			 anLocalInt_57_++) {
			int anLocalInt_58_ = anLocalInt_57_ * 4;
			float f = fs[anLocalInt_55_ - 1 - anLocalInt_58_];
			float f_59_ = fs[anLocalInt_55_ - 3 - anLocalInt_58_];
			float f_60_ = fs[anLocalInt_56_ - 1 - anLocalInt_58_];
			float f_61_ = fs[anLocalInt_56_ - 3 - anLocalInt_58_];
			fs[anLocalInt_55_ - 1 - anLocalInt_58_] = f + f_60_;
			fs[anLocalInt_55_ - 3 - anLocalInt_58_]
			    = f_59_ + f_61_;
			float f_62_ = fs_37_[anLocalInt_57_ * anLocalInt_53_];
			float f_63_
			    = fs_37_[anLocalInt_57_ * anLocalInt_53_ + 1];
			fs[anLocalInt_56_ - 1 - anLocalInt_58_]
			    = (f - f_60_) * f_62_ - (f_59_ - f_61_) * f_63_;
			fs[anLocalInt_56_ - 3 - anLocalInt_58_]
			    = (f_59_ - f_61_) * f_62_ + (f - f_60_) * f_63_;
		    }
		}
	    }
	    for (int anLocalInt_64_ = 1; anLocalInt_64_ < anLocalInt_34_ - 1;
		 anLocalInt_64_++) {
		int anLocalInt_65_ = anLocalInts[anLocalInt_64_];
		if (anLocalInt_64_ < anLocalInt_65_) {
		    int anLocalInt_66_ = anLocalInt_64_ * 8;
		    int anLocalInt_67_ = anLocalInt_65_ * 8;
		    float f = fs[anLocalInt_66_ + 1];
		    fs[anLocalInt_66_ + 1] = fs[anLocalInt_67_ + 1];
		    fs[anLocalInt_67_ + 1] = f;
		    f = fs[anLocalInt_66_ + 3];
		    fs[anLocalInt_66_ + 3] = fs[anLocalInt_67_ + 3];
		    fs[anLocalInt_67_ + 3] = f;
		    f = fs[anLocalInt_66_ + 5];
		    fs[anLocalInt_66_ + 5] = fs[anLocalInt_67_ + 5];
		    fs[anLocalInt_67_ + 5] = f;
		    f = fs[anLocalInt_66_ + 7];
		    fs[anLocalInt_66_ + 7] = fs[anLocalInt_67_ + 7];
		    fs[anLocalInt_67_ + 7] = f;
		}
	    }
	    for (int anLocalInt_68_ = 0; anLocalInt_68_ < anLocalInt_32_;
		 anLocalInt_68_++)
		fs[anLocalInt_68_] = fs[anLocalInt_68_ * 2 + 1];
	    for (int anLocalInt_69_ = 0; anLocalInt_69_ < anLocalInt_34_;
		 anLocalInt_69_++) {
		fs[anLocalInt_14_ - 1 - anLocalInt_69_ * 2]
		    = fs[anLocalInt_69_ * 4];
		fs[anLocalInt_14_ - 2 - anLocalInt_69_ * 2]
		    = fs[anLocalInt_69_ * 4 + 1];
		fs[anLocalInt_14_ - anLocalInt_33_ - 1 - anLocalInt_69_ * 2]
		    = fs[anLocalInt_69_ * 4 + 2];
		fs[anLocalInt_14_ - anLocalInt_33_ - 2 - anLocalInt_69_ * 2]
		    = fs[anLocalInt_69_ * 4 + 3];
	    }
	    for (int anLocalInt_70_ = 0; anLocalInt_70_ < anLocalInt_34_;
		 anLocalInt_70_++) {
		float f = fs_39_[anLocalInt_70_ * 2];
		float f_71_ = fs_39_[anLocalInt_70_ * 2 + 1];
		float f_72_ = fs[anLocalInt_32_ + anLocalInt_70_ * 2];
		float f_73_ = fs[anLocalInt_32_ + anLocalInt_70_ * 2 + 1];
		float f_74_ = fs[anLocalInt_14_ - 2 - anLocalInt_70_ * 2];
		float f_75_ = fs[anLocalInt_14_ - 1 - anLocalInt_70_ * 2];
		float f_76_ = f_71_ * (f_72_ - f_74_) + f * (f_73_ + f_75_);
		fs[anLocalInt_32_ + anLocalInt_70_ * 2]
		    = (f_72_ + f_74_ + f_76_) * 0.5F;
		fs[anLocalInt_14_ - 2 - anLocalInt_70_ * 2]
		    = (f_72_ + f_74_ - f_76_) * 0.5F;
		f_76_ = f_71_ * (f_73_ + f_75_) - f * (f_72_ - f_74_);
		fs[anLocalInt_32_ + anLocalInt_70_ * 2 + 1]
		    = (f_73_ - f_75_ + f_76_) * 0.5F;
		fs[anLocalInt_14_ - 1 - anLocalInt_70_ * 2]
		    = (-f_73_ + f_75_ + f_76_) * 0.5F;
	    }
	    for (int anLocalInt_77_ = 0; anLocalInt_77_ < anLocalInt_33_;
		 anLocalInt_77_++) {
		fs[anLocalInt_77_]
		    = ((fs[anLocalInt_77_ * 2 + anLocalInt_32_]
			* fs_38_[anLocalInt_77_ * 2])
		       + (fs[anLocalInt_77_ * 2 + 1 + anLocalInt_32_]
			  * fs_38_[anLocalInt_77_ * 2 + 1]));
		fs[anLocalInt_32_ - 1 - anLocalInt_77_]
		    = ((fs[anLocalInt_77_ * 2 + anLocalInt_32_]
			* fs_38_[anLocalInt_77_ * 2 + 1])
		       - (fs[anLocalInt_77_ * 2 + 1 + anLocalInt_32_]
			  * fs_38_[anLocalInt_77_ * 2]));
	    }
	    for (int anLocalInt_78_ = 0; anLocalInt_78_ < anLocalInt_33_;
		 anLocalInt_78_++)
		fs[anLocalInt_14_ - anLocalInt_33_ + anLocalInt_78_]
		    = -fs[anLocalInt_78_];
	    for (int anLocalInt_79_ = 0; anLocalInt_79_ < anLocalInt_33_;
		 anLocalInt_79_++)
		fs[anLocalInt_79_] = fs[anLocalInt_33_ + anLocalInt_79_];
	    for (int anLocalInt_80_ = 0; anLocalInt_80_ < anLocalInt_33_;
		 anLocalInt_80_++)
		fs[anLocalInt_33_ + anLocalInt_80_]
		    = -fs[anLocalInt_33_ - anLocalInt_80_ - 1];
	    for (int anLocalInt_81_ = 0; anLocalInt_81_ < anLocalInt_33_;
		 anLocalInt_81_++)
		fs[anLocalInt_32_ + anLocalInt_81_]
		    = fs[anLocalInt_14_ - anLocalInt_81_ - 1];
	    for (int anLocalInt_82_ = anLocalInt_18_;
		 anLocalInt_82_ < anLocalInt_19_; anLocalInt_82_++) {
		float f = (float) Math.sin(((double) (anLocalInt_82_
						      - anLocalInt_18_)
					    + 0.5)
					   / (double) anLocalInt_20_ * 0.5
					   * 3.141592653589793);
		aFloatArray4076[anLocalInt_82_]
		    *= (float) Math.sin((double) f * 1.5707963267948966
					* (double) f);
	    }
	    for (int anLocalInt_83_ = anLocalInt_21_;
		 anLocalInt_83_ < anLocalInt_22_; anLocalInt_83_++) {
		float f = (float) Math.sin((((double) (anLocalInt_83_
						       - anLocalInt_21_)
					     + 0.5)
					    / (double) anLocalInt_23_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		aFloatArray4076[anLocalInt_83_]
		    *= (float) Math.sin((double) f * 1.5707963267948966
					* (double) f);
	    }
	}
	float[] fs = null;
	if (anInt4086 > 0) {
	    int anLocalInt_84_ = anInt4086 + anLocalInt_14_ >> 2;
	    fs = new float[anLocalInt_84_];
	    if (!aBoolean4095) {
		for (int anLocalInt_85_ = 0; anLocalInt_85_ < anInt4098;
		     anLocalInt_85_++) {
		    int anLocalInt_86_ = (anInt4086 >> 1) + anLocalInt_85_;
		    fs[anLocalInt_85_] += aFloatArray4084[anLocalInt_86_];
		}
	    }
	    if (!anLocalBoolean_26_) {
		for (int anLocalInt_87_ = anLocalInt_18_;
		     anLocalInt_87_ < anLocalInt_14_ >> 1; anLocalInt_87_++) {
		    int anLocalInt_88_
			= fs.length - (anLocalInt_14_ >> 1) + anLocalInt_87_;
		    fs[anLocalInt_88_] += aFloatArray4076[anLocalInt_87_];
		}
	    }
	}
	float[] fs_89_ = aFloatArray4084;
	aFloatArray4084 = aFloatArray4076;
	aFloatArray4076 = fs_89_;
	anInt4086 = anLocalInt_14_;
	anInt4098 = anLocalInt_22_ - (anLocalInt_14_ >> 1);
	aBoolean4095 = anLocalBoolean_26_;
	return fs;
    }
    
    static final int method762(int argument) {
	int anLocalInt = 0;
	int anLocalInt_90_ = 0;
	int anLocalInt_91_;
	for (/**/; argument >= 8 - anInt4080; argument -= anLocalInt_91_) {
	    anLocalInt_91_ = 8 - anInt4080;
	    int anLocalInt_92_ = (1 << anLocalInt_91_) - 1;
	    anLocalInt += (aByteArray4081[anInt4099] >> anInt4080
			   & anLocalInt_92_) << anLocalInt_90_;
	    anInt4080 = 0;
	    anInt4099++;
	    anLocalInt_90_ += anLocalInt_91_;
	}
	if (argument > 0) {
	    anLocalInt_91_ = (1 << argument) - 1;
	    anLocalInt += (aByteArray4081[anInt4099] >> anInt4080
			   & anLocalInt_91_) << anLocalInt_90_;
	    anInt4080 += argument;
	}
	return anLocalInt;
    }
    
    private static final void method763(byte[] argument, int argument_93_) {
	aByteArray4081 = argument;
	anInt4099 = argument_93_;
	anInt4080 = 0;
    }
    
    private static final void method764(byte[] argument) {
	method763(argument, 0);
	anInt4092 = 1 << method762(4);
	anInt4088 = 1 << method762(4);
	aFloatArray4076 = new float[anInt4088];
	for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++) {
	    int anLocalInt_94_ = anLocalInt != 0 ? anInt4088 : anInt4092;
	    int anLocalInt_95_ = anLocalInt_94_ >> 1;
	    int anLocalInt_96_ = anLocalInt_94_ >> 2;
	    int anLocalInt_97_ = anLocalInt_94_ >> 3;
	    float[] fs = new float[anLocalInt_95_];
	    for (int anLocalInt_98_ = 0; anLocalInt_98_ < anLocalInt_96_;
		 anLocalInt_98_++) {
		fs[anLocalInt_98_ * 2]
		    = (float) Math.cos((double) (anLocalInt_98_ * 4)
				       * 3.141592653589793
				       / (double) anLocalInt_94_);
		fs[anLocalInt_98_ * 2 + 1]
		    = -(float) Math.sin((double) (anLocalInt_98_ * 4)
					* 3.141592653589793
					/ (double) anLocalInt_94_);
	    }
	    float[] fs_99_ = new float[anLocalInt_95_];
	    for (int anLocalInt_100_ = 0; anLocalInt_100_ < anLocalInt_96_;
		 anLocalInt_100_++) {
		fs_99_[anLocalInt_100_ * 2]
		    = (float) Math.cos((double) (anLocalInt_100_ * 2 + 1)
				       * 3.141592653589793
				       / (double) (anLocalInt_94_ * 2));
		fs_99_[anLocalInt_100_ * 2 + 1]
		    = (float) Math.sin((double) (anLocalInt_100_ * 2 + 1)
				       * 3.141592653589793
				       / (double) (anLocalInt_94_ * 2));
	    }
	    float[] fs_101_ = new float[anLocalInt_96_];
	    for (int anLocalInt_102_ = 0; anLocalInt_102_ < anLocalInt_97_;
		 anLocalInt_102_++) {
		fs_101_[anLocalInt_102_ * 2]
		    = (float) Math.cos((double) (anLocalInt_102_ * 4 + 2)
				       * 3.141592653589793
				       / (double) anLocalInt_94_);
		fs_101_[anLocalInt_102_ * 2 + 1]
		    = -(float) Math.sin((double) (anLocalInt_102_ * 4 + 2)
					* 3.141592653589793
					/ (double) anLocalInt_94_);
	    }
	    int[] anLocalInts = new int[anLocalInt_97_];
	    int anLocalInt_103_
		= DoublyLinkedNode_Sub51_Sub13.method1258(9761, anLocalInt_97_ - 1);
	    for (int anLocalInt_104_ = 0; anLocalInt_104_ < anLocalInt_97_;
		 anLocalInt_104_++)
		anLocalInts[anLocalInt_104_]
		    = Class295.method3507(8443, anLocalInt_104_,
					  anLocalInt_103_);
	    if (anLocalInt != 0) {
		aFloatArray4085 = fs;
		aFloatArray4070 = fs_99_;
		aFloatArray4082 = fs_101_;
		anIntArray4094 = anLocalInts;
	    } else {
		aFloatArray4079 = fs;
		aFloatArray4090 = fs_99_;
		aFloatArray4077 = fs_101_;
		anIntArray4075 = anLocalInts;
	    }
	}
	int anLocalInt = method762(8) + 1;
	aClass386Array4078 = new Class386[anLocalInt];
	for (int anLocalInt_105_ = 0; anLocalInt_105_ < anLocalInt;
	     anLocalInt_105_++)
	    aClass386Array4078[anLocalInt_105_] = new Class386();
	int anLocalInt_106_ = method762(6) + 1;
	for (int anLocalInt_107_ = 0; anLocalInt_107_ < anLocalInt_106_;
	     anLocalInt_107_++)
	    method762(16);
	int anLocalInt_108_ = method762(6) + 1;
	aClass218Array4093 = new Class218[anLocalInt_108_];
	for (int anLocalInt_109_ = 0; anLocalInt_109_ < anLocalInt_108_;
	     anLocalInt_109_++)
	    aClass218Array4093[anLocalInt_109_] = new Class218();
	int anLocalInt_110_ = method762(6) + 1;
	aClass300Array4073 = new Class300[anLocalInt_110_];
	for (int anLocalInt_111_ = 0; anLocalInt_111_ < anLocalInt_110_;
	     anLocalInt_111_++)
	    aClass300Array4073[anLocalInt_111_] = new Class300();
	int anLocalInt_112_ = method762(6) + 1;
	aClass265Array4097 = new Class265[anLocalInt_112_];
	for (int anLocalInt_113_ = 0; anLocalInt_113_ < anLocalInt_112_;
	     anLocalInt_113_++)
	    aClass265Array4097[anLocalInt_113_] = new Class265();
	int anLocalInt_114_ = method762(6) + 1;
	aBooleanArray4071 = new boolean[anLocalInt_114_];
	anIntArray4069 = new int[anLocalInt_114_];
	for (int anLocalInt_115_ = 0; anLocalInt_115_ < anLocalInt_114_;
	     anLocalInt_115_++) {
	    aBooleanArray4071[anLocalInt_115_] = method754() != 0;
	    method762(16);
	    method762(16);
	    anIntArray4069[anLocalInt_115_] = method762(8);
	}
	aBoolean4089 = true;
    }
    
    private static final boolean method765(Js5Store argument) {
	if (!aBoolean4089) {
	    byte[] anLocalInts = argument.getData(0, 0);
	    if (anLocalInts == null)
		return false;
	    method764(anLocalInts);
	}
	return true;
    }
    
    private Node_Sub25(byte[] argument_116_) {
	method757(argument_116_);
    }
}
