/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

abstract class Class256 implements Interface7
{
    static Class166 aClass166_3526 = new Class166(53, 3);
    private int anInt3527;
    private Class382 aClass382_3528 = Statics.aClass382_854;
    DataType aDataType_3529;
    private int anInt3530;
    GraphicsToolkit_Sub2_Sub1 aClass_ha_Sub2_Sub1_3531;
    private boolean aBoolean3532;
    int anInt3533;
    Class320 aClass320_3534;
    
    private final void method3268(byte argument_0_) {
	((Class256) this).aClass_ha_Sub2_Sub1_3531.method2237(true, this);
	if (argument_0_ < -53) {
	    if (aClass382_3528 == Statics.aClass382_854) {
		OpenGL.glTexParameteri(((Class256) this).anInt3533, 10241,
				       aBoolean3532 ? 9987 : 9729);
		OpenGL.glTexParameteri(((Class256) this).anInt3533, 10240,
				       9729);
	    } else {
		OpenGL.glTexParameteri(((Class256) this).anInt3533, 10241,
				       !aBoolean3532 ? 9728 : 9984);
		OpenGL.glTexParameteri(((Class256) this).anInt3533, 10240,
				       9728);
	    }
	}
    }
    
    static final void method3269(int argument) {
	int anLocalInt = 0;
	for (int anLocalInt_1_ = 0; MapRelated.mapWidth > anLocalInt_1_;
	     anLocalInt_1_++) {
	    for (int anLocalInt_2_ = 0;
		 anLocalInt_2_ < MapRelated.mapDepth;
		 anLocalInt_2_++) {
		if (Node_Sub47_Sub3.method1121
                (anLocalInt, true, anLocalInt_2_, 110,
                        GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676,
                        anLocalInt_1_))
		    anLocalInt++;
		if (anLocalInt >= 512)
		    return;
	    }
	}
    }
    
    public final void method34(int argument_3_) {
	int anLocalInt
	    = ((Class256) this).aClass_ha_Sub2_Sub1_3531.method2180(-97);
	int anLocalInt_4_ = (((GraphicsToolkit_Sub2_Sub1)
			      ((Class256) this).aClass_ha_Sub2_Sub1_3531)
			     .textureTarget[anLocalInt]);
	if (((Class256) this).anInt3533 != anLocalInt_4_) {
	    if (anLocalInt_4_ != 0) {
		OpenGL.glBindTexture(anLocalInt_4_, 0);
		OpenGL.glDisable(anLocalInt_4_);
	    }
	    OpenGL.glEnable(((Class256) this).anInt3533);
	    ((GraphicsToolkit_Sub2_Sub1) ((Class256) this).aClass_ha_Sub2_Sub1_3531)
		.textureTarget[anLocalInt]
		= ((Class256) this).anInt3533;
	}
	OpenGL.glBindTexture(((Class256) this).anInt3533, anInt3530);
	if (argument_3_ != 20464)
	    method3271(56);
    }
    
    private final void method3270(byte argument_5_) {
	if (anInt3530 > 0) {
	    ((Class256) this).aClass_ha_Sub2_Sub1_3531
		.requestTextureDeletion(anInt3530, method3274(40));
	    anInt3530 = 0;
	}
	if (argument_5_ < 28)
	    method3269(-27);
    }
    
    public static void method3271(int argument) {
	aClass166_3526 = null;
    }
    
    private final void method3272(int argument_6_, boolean argument_7_) {
	if (argument_7_)
	    ((Class256) this).aDataType_3529 = null;
	((GraphicsToolkit_Sub2) ((Class256) this).aClass_ha_Sub2_Sub1_3531).textureMemoryUsage
	    -= argument_6_;
	((GraphicsToolkit_Sub2) ((Class256) this).aClass_ha_Sub2_Sub1_3531).textureMemoryUsage
	    += method3274(-128);
    }
    
    final int method3273(int argument_8_) {
	if (((Class256) this).aDataType_3529 == DataType.BYTE) {
	    if (Class196.aClass320_1437 != ((Class256) this).aClass320_3534) {
		if (((Class256) this).aClass320_3534
		    == Applet_Sub1.aClass320_9)
		    return 6408;
		if (((Class256) this).aClass320_3534
		    == Node_Sub31_Sub23.aClass320_5942)
		    return 6406;
		if (Class62_Sub19.aClass320_4426
		    != ((Class256) this).aClass320_3534) {
		    if (Class188.aClass320_1394
			!= ((Class256) this).aClass320_3534) {
			if (Node_Sub5.aClass320_3896
			    == ((Class256) this).aClass320_3534)
			    return 6145;
		    } else
			return 6410;
		} else
		    return 6409;
	    } else
		return 6407;
	} else if (DataType.aDataType_1077
		   != ((Class256) this).aDataType_3529) {
	    if (((Class256) this).aDataType_3529 == DataType.FLOAT) {
		if (Class196.aClass320_1437
		    != ((Class256) this).aClass320_3534) {
		    if (Applet_Sub1.aClass320_9
			== ((Class256) this).aClass320_3534)
			return 34836;
		    if (Node_Sub31_Sub23.aClass320_5942
			== ((Class256) this).aClass320_3534)
			return 34838;
		    if (((Class256) this).aClass320_3534
			!= Class62_Sub19.aClass320_4426) {
			if (Class188.aClass320_1394
			    == ((Class256) this).aClass320_3534)
			    return 34841;
			if (Node_Sub5.aClass320_3896
			    == ((Class256) this).aClass320_3534)
			    return 6145;
		    } else
			return 34840;
		} else
		    return 34837;
	    }
	} else {
	    if (((Class256) this).aClass320_3534 == Class196.aClass320_1437)
		return 34843;
	    if (Applet_Sub1.aClass320_9 == ((Class256) this).aClass320_3534)
		return 34842;
	    if (Node_Sub31_Sub23.aClass320_5942
		== ((Class256) this).aClass320_3534)
		return 34844;
	    if (((Class256) this).aClass320_3534
		== Class62_Sub19.aClass320_4426)
		return 34846;
	    if (((Class256) this).aClass320_3534 == Class188.aClass320_1394)
		return 34847;
	    if (Node_Sub5.aClass320_3896
		== ((Class256) this).aClass320_3534)
		return 6145;
	}
	throw new IllegalStateException();
    }
    
    private final int method3274(int argument_9_) {
	int anLocalInt = -41 % ((argument_9_ + 60) / 51);
	int anLocalInt_10_
	    = (anInt3527
	       * ((DataType) ((Class256) this).aDataType_3529).length
	       * ((Class320) ((Class256) this).aClass320_3534).anInt2633);
	if (aBoolean3532)
	    return anLocalInt_10_ * 4 / 3;
	return anLocalInt_10_;
    }
    
    final void method3275(byte argument_11_, byte[] argument_12_,
			  int argument_13_, int argument_14_,
			  int argument_15_) {
	if (argument_13_ > 0 && !Class2_Sub1.method198(argument_13_))
	    throw new IllegalArgumentException("");
	if (argument_14_ > 0 && !Class2_Sub1.method198(argument_14_))
	    throw new IllegalArgumentException("");
	int anLocalInt
	    = ((Class320) ((Class256) this).aClass320_3534).anInt2633;
	int anLocalInt_16_ = 0;
	int anLocalInt_17_
	    = argument_13_ < argument_14_ ? argument_13_ : argument_14_;
	int anLocalInt_18_ = argument_13_ >> 1;
	int anLocalInt_19_ = argument_14_ >> 1;
	byte[] anLocalInts = argument_12_;
	byte[] anLocalInts_20_
	    = new byte[anLocalInt * (anLocalInt_19_ * anLocalInt_18_)];
	for (;;) {
	    OpenGL.glTexImage2Dub(argument_15_, anLocalInt_16_,
				  method3273(-11391), argument_13_,
				  argument_14_, 0,
				  Class157.method2592(39, (((Class256) this)
							   .aClass320_3534)),
				  5121, anLocalInts, 0);
	    if (anLocalInt_17_ <= 1)
		break;
	    int anLocalInt_21_ = argument_13_ * anLocalInt;
	    for (int anLocalInt_22_ = 0; anLocalInt_22_ < anLocalInt;
		 anLocalInt_22_++) {
		int anLocalInt_23_ = anLocalInt_22_;
		int anLocalInt_24_ = anLocalInt_22_;
		int anLocalInt_25_ = anLocalInt_21_ + anLocalInt_24_;
		for (int anLocalInt_26_ = 0; anLocalInt_19_ > anLocalInt_26_;
		     anLocalInt_26_++) {
		    for (int anLocalInt_27_ = 0;
			 anLocalInt_18_ > anLocalInt_27_; anLocalInt_27_++) {
			int anLocalInt_28_ = anLocalInts[anLocalInt_24_];
			anLocalInt_24_ += anLocalInt;
			anLocalInt_28_ += anLocalInts[anLocalInt_24_];
			anLocalInt_24_ += anLocalInt;
			anLocalInt_28_ += anLocalInts[anLocalInt_25_];
			anLocalInt_25_ += anLocalInt;
			anLocalInt_28_ += anLocalInts[anLocalInt_25_];
			anLocalInt_25_ += anLocalInt;
			anLocalInts_20_[anLocalInt_23_]
			    = (byte) (anLocalInt_28_ >> 2);
			anLocalInt_23_ += anLocalInt;
		    }
		    anLocalInt_24_ += anLocalInt_21_;
		    anLocalInt_25_ += anLocalInt_21_;
		}
	    }
	    byte[] anLocalInts_29_ = anLocalInts_20_;
	    anLocalInts_20_ = anLocalInts;
	    anLocalInts = anLocalInts_29_;
	    argument_13_ = anLocalInt_18_;
	    argument_14_ = anLocalInt_19_;
	    anLocalInt_17_ >>= 1;
	    anLocalInt_18_ >>= 1;
	    anLocalInt_16_++;
	    anLocalInt_19_ >>= 1;
	}
    }
    
    public final void method33(int argument_30_, Class382 argument_31_) {
	if (argument_30_ > -104)
	    method3276(-29, 33, null, -69, -109);
	if (argument_31_ != aClass382_3528) {
	    aClass382_3528 = argument_31_;
	    method3268((byte) -109);
	}
    }
    
    final void method3276(int argument_32_, int argument_33_,
			  float[] argument_34_, int argument_35_,
			  int argument_36_) {
	if (argument_33_ > 0 && !Class2_Sub1.method198(argument_33_))
	    throw new IllegalArgumentException("");
	if (argument_32_ > 0 && !Class2_Sub1.method198(argument_32_))
	    throw new IllegalArgumentException("");
	int anLocalInt
	    = ((Class320) ((Class256) this).aClass320_3534).anInt2633;
	int anLocalInt_37_ = 0;
	int anLocalInt_38_
	    = argument_32_ <= argument_33_ ? argument_32_ : argument_33_;
	int anLocalInt_39_ = argument_33_ >> 1;
	int anLocalInt_40_ = argument_32_ >> 1;
	float[] fs = argument_34_;
	float[] fs_41_
	    = new float[anLocalInt * anLocalInt_39_ * anLocalInt_40_];
	for (;;) {
	    OpenGL.glTexImage2Df(argument_36_, anLocalInt_37_,
				 method3273(-11391), argument_33_,
				 argument_32_, 0,
				 Class157.method2592(53, (((Class256) this)
							  .aClass320_3534)),
				 5126, fs, 0);
	    if (anLocalInt_38_ <= 1)
		break;
	    int anLocalInt_42_ = argument_33_ * anLocalInt;
	    for (int anLocalInt_43_ = 0; anLocalInt_43_ < anLocalInt;
		 anLocalInt_43_++) {
		int anLocalInt_44_ = anLocalInt_43_;
		int anLocalInt_45_ = anLocalInt_43_;
		int anLocalInt_46_ = anLocalInt_42_ + anLocalInt_45_;
		for (int anLocalInt_47_ = 0; anLocalInt_40_ > anLocalInt_47_;
		     anLocalInt_47_++) {
		    for (int anLocalInt_48_ = 0;
			 anLocalInt_48_ < anLocalInt_39_; anLocalInt_48_++) {
			float f = fs[anLocalInt_45_];
			anLocalInt_45_ += anLocalInt;
			f += fs[anLocalInt_45_];
			f += fs[anLocalInt_46_];
			anLocalInt_45_ += anLocalInt;
			anLocalInt_46_ += anLocalInt;
			f += fs[anLocalInt_46_];
			anLocalInt_46_ += anLocalInt;
			fs_41_[anLocalInt_44_] = f * 0.25F;
			anLocalInt_44_ += anLocalInt;
		    }
		    anLocalInt_46_ += anLocalInt_42_;
		    anLocalInt_45_ += anLocalInt_42_;
		}
	    }
	    float[] fs_49_ = fs_41_;
	    fs_41_ = fs;
	    fs = fs_49_;
	    argument_33_ = anLocalInt_39_;
	    argument_32_ = anLocalInt_40_;
	    anLocalInt_38_ >>= 1;
	    anLocalInt_40_ >>= 1;
	    anLocalInt_39_ >>= 1;
	    anLocalInt_37_++;
	}
    }
    
    static final Class253_Sub1_Sub1 method3277(int argument,
					       Packet argument_50_) {
	Class253_Sub1 class253_sub1
	    = Class235.method3115((byte) -71, argument_50_);
	int anLocalInt = argument_50_.g2s();
	return (new Class253_Sub1_Sub1
		(((Class253) class253_sub1).aClass349_3712,
		 ((Class253) class253_sub1).aClass44_3710,
		 ((Class253) class253_sub1).anInt3716,
		 ((Class253) class253_sub1).anInt3713,
		 ((Class253) class253_sub1).anInt3718,
		 ((Class253) class253_sub1).anInt3711,
		 ((Class253) class253_sub1).anInt3714,
		 ((Class253) class253_sub1).anInt3719,
		 ((Class253) class253_sub1).anInt3717,
		 ((Class253_Sub1) class253_sub1).anInt5658,
		 ((Class253_Sub1) class253_sub1).anInt5657,
		 ((Class253_Sub1) class253_sub1).anInt5661,
		 ((Class253_Sub1) class253_sub1).anInt5659,
		 ((Class253_Sub1) class253_sub1).anInt5662,
		 ((Class253_Sub1) class253_sub1).anInt5660, anLocalInt));
    }
    
    static final void method3278() {
	Class62_Sub20.aClass314_4431 = Class62_Sub20.aClass314_4430;
    }
    
    final void method3279(int[] argument_51_, int argument_52_,
			  int argument_53_, boolean argument_54_,
			  int argument_55_) {
	if (argument_53_ > 0 && !Class2_Sub1.method198(argument_53_))
	    throw new IllegalArgumentException("");
	if (argument_55_ > 0 && !Class2_Sub1.method198(argument_55_))
	    throw new IllegalArgumentException("");
	if (((Class256) this).aClass320_3534 != Applet_Sub1.aClass320_9)
	    throw new IllegalArgumentException("");
	int anLocalInt = 0;
	int anLocalInt_56_
	    = argument_55_ <= argument_53_ ? argument_55_ : argument_53_;
	int anLocalInt_57_ = argument_53_ >> 1;
	int anLocalInt_58_ = argument_55_ >> 1;
	int[] anLocalInts = argument_51_;
	int[] anLocalInts_59_ = new int[anLocalInt_58_ * anLocalInt_57_];
	for (;;) {
	    OpenGL.glTexImage2Di(argument_52_, anLocalInt, method3273(-11391),
				 argument_53_, argument_55_, 0, 32993,
				 (((GraphicsToolkit_Sub2_Sub1)
				   ((Class256) this).aClass_ha_Sub2_Sub1_3531)
				  .anInt6476),
				 anLocalInts, 0);
	    if (anLocalInt_56_ <= 1)
		break;
	    int anLocalInt_60_ = 0;
	    int anLocalInt_61_ = 0;
	    int anLocalInt_62_ = anLocalInt_61_ + argument_53_;
	    int[] anLocalInts_63_ = anLocalInts_59_;
	    for (int anLocalInt_64_ = 0; anLocalInt_64_ < anLocalInt_58_;
		 anLocalInt_64_++) {
		for (int anLocalInt_65_ = 0; anLocalInt_65_ < anLocalInt_57_;
		     anLocalInt_65_++) {
		    int anLocalInt_66_ = anLocalInts[anLocalInt_61_++];
		    int anLocalInt_67_ = anLocalInts[anLocalInt_62_++];
		    int anLocalInt_68_ = anLocalInts[anLocalInt_61_++];
		    int anLocalInt_69_ = anLocalInt_66_ >> 24 & 0xff;
		    int anLocalInt_70_ = (anLocalInt_66_ & 0xffb0) >> 8;
		    int anLocalInt_71_ = (anLocalInt_66_ & 0xff75b2) >> 16;
		    int anLocalInt_72_ = anLocalInts[anLocalInt_62_++];
		    int anLocalInt_73_ = anLocalInt_66_ & 0xff;
		    anLocalInt_69_ += anLocalInt_68_ >> 24 & 0xff;
		    anLocalInt_70_ += anLocalInt_68_ >> 8 & 0xff;
		    anLocalInt_73_ += anLocalInt_68_ & 0xff;
		    anLocalInt_71_ += anLocalInt_68_ >> 16 & 0xff;
		    anLocalInt_71_ += (anLocalInt_67_ & 0xffa167) >> 16;
		    anLocalInt_69_ += anLocalInt_67_ >> 24 & 0xff;
		    anLocalInt_73_ += anLocalInt_67_ & 0xff;
		    anLocalInt_70_ += (anLocalInt_67_ & 0xff3a) >> 8;
		    anLocalInt_70_ += anLocalInt_72_ >> 8 & 0xff;
		    anLocalInt_69_ += anLocalInt_72_ >> 24 & 0xff;
		    anLocalInt_71_ += (anLocalInt_72_ & 0xff69d5) >> 16;
		    anLocalInt_73_ += anLocalInt_72_ & 0xff;
		    anLocalInts_59_[anLocalInt_60_++]
			= (MathStatics.OR
			   ((MathStatics.OR((MathStatics.OR((MathStatics.AND(1020, anLocalInt_71_) << 14), (MathStatics.AND(1020, anLocalInt_69_) << 22))), MathStatics.AND(65280, anLocalInt_70_ << 6))), MathStatics.AND(255, anLocalInt_73_ >> 2)));
		}
		anLocalInt_62_ += argument_53_;
		anLocalInt_61_ += argument_53_;
	    }
	    anLocalInts_59_ = anLocalInts;
	    anLocalInts = anLocalInts_63_;
	    argument_53_ = anLocalInt_57_;
	    argument_55_ = anLocalInt_58_;
	    anLocalInt_56_ >>= 1;
	    anLocalInt_58_ >>= 1;
	    anLocalInt_57_ >>= 1;
	    anLocalInt++;
	}
    }
    
    protected final void finalize() throws Throwable {
	method3270((byte) 71);
	super.finalize();
    }
    
    static final void method3280(RsInterface argument, boolean argument_74_) {
	if (Class100.anInt782 == ((RsInterface) argument).anInt1924)
	    Class109_Sub1.aBooleanArray4604[((RsInterface) argument).anInt1932]
		= true;
    }
    
    Class256(GraphicsToolkit_Sub2_Sub1 argument_75_, int argument_76_,
	     Class320 argument_77_, DataType argument_78_, int argument_79_,
	     boolean argument_80_) {
	anInt3527 = argument_79_;
	((Class256) this).aClass320_3534 = argument_77_;
	((Class256) this).aClass_ha_Sub2_Sub1_3531 = argument_75_;
	((Class256) this).aDataType_3529 = argument_78_;
	aBoolean3532 = argument_80_;
	((Class256) this).anInt3533 = argument_76_;
	OpenGL.glGenTextures(1, DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.anIntArray6827,
			     0);
	anInt3530 = DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.anIntArray6827[0];
	method3268((byte) -69);
	method3272(0, false);
    }
}
