/* Class59_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class Node_Sub21 extends Node
{
    private int anInt4027;
    private Interface4_Impl2 anInterface4_Impl2_4028;
    private Interface4_Impl1 anInterface4_Impl1_4029;
    private JagexHashMap aJagexHashMap_4030;
    private Class_s_Sub1 aClass_s_Sub1_4031;
    private int anInt4032;
    private int anInt4033;
    private float[][] aFloatArrayArray4034;
    static int anInt4035 = 2;
    private float[][] aFloatArrayArray4036;
    private int anInt4037;
    private Stream aStream4038;
    private int anInt4039;
    private Stream aStream4040;
    private float[][] aFloatArrayArray4041;
    private HardwareLight aClass59_Sub3_4042;
    private int anInt4043;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_4044;

    final void method730(boolean[][] argument_0_, int argument_1_,
			 int argument_2_, int argument_3_, int argument_4_) {
	if (anInterface4_Impl1_4029 != null
	    && argument_1_ + argument_2_ >= anInt4037
	    && argument_2_ - argument_1_ <= anInt4039
	    && anInt4043 <= argument_3_ + argument_1_
	    && anInt4027 >= -argument_1_ + argument_3_) {
	    for (int anLocalInt = anInt4043; anLocalInt <= anInt4027;
		 anLocalInt++) {
		for (int anLocalInt_5_ = anInt4037; anLocalInt_5_ <= anInt4039;
		     anLocalInt_5_++) {
		    int anLocalInt_6_ = anLocalInt_5_ - argument_2_;
		    int anLocalInt_7_ = -argument_3_ + anLocalInt;
		    if (-argument_1_ < anLocalInt_6_
			&& argument_1_ > anLocalInt_6_
			&& anLocalInt_7_ > -argument_1_
			&& anLocalInt_7_ < argument_1_
			&& (argument_0_[anLocalInt_6_ + argument_1_]
			    [anLocalInt_7_ + argument_1_])) {
			aClass_ha_Sub2_4044.method2190
			    ((byte) (int) (aClass59_Sub3_4042
					       .getColourIntensity()
					   * 255.0F),
			     (byte) -117);
			aClass_ha_Sub2_4044.method2130(anInterface4_Impl2_4028,
						       0, argument_4_ ^ ~0x39);
			aClass_ha_Sub2_4044.method2179((((GraphicsToolkit_Sub2)
							 aClass_ha_Sub2_4044)
							.aClass222_4821),
						       (byte) -63);
			aClass_ha_Sub2_4044.method2131(anInt4032 / 3, 0,
						       anInterface4_Impl1_4029,
						       0, anInt4033, true,
						       (Class232
							.aClass390_1684));
			return;
		    }
		}
	    }
	    if (argument_4_ != -1)
		method732(2, -124, -128, 38, 7, (byte) 100, -101);
	}
    }
    
    static final void method731(tia_sub_35DoublyLinked argument, int argument_8_,
				int argument_9_, int argument_10_,
				boolean[] argument_11_) {
	if (Node_Sub31_Sub5.aClass_sArray5858 != Class65.aClass_sArray455) {
	    int anLocalInt = Statics.aClass_sArray2713[argument_8_]
				 .method3541(argument_10_, 0, argument_9_);
	    for (int anLocalInt_12_ = 0; anLocalInt_12_ <= argument_8_;
		 anLocalInt_12_++) {
		if (argument_11_ == null || argument_11_[anLocalInt_12_]) {
		    Class_s class_s
			= Statics.aClass_sArray2713[anLocalInt_12_];
		    if (class_s != null)
			class_s.wa(argument, argument_9_,
				   (anLocalInt
				    - class_s.method3541(argument_10_, 0,
							 argument_9_)),
				   argument_10_, 0, false);
		}
	    }
	}
    }
    
    private final void method732(int argument_13_, int argument_14_,
				 int argument_15_, int argument_16_,
				 int argument_17_, byte argument_18_,
				 int argument_19_) {
	long l = -1L;
	int anLocalInt
	    = (argument_17_
	       + (argument_14_ << ((Class_s) aClass_s_Sub1_4031).anInt2548));
	int anLocalInt_20_
	    = ((argument_19_ << ((Class_s) aClass_s_Sub1_4031).anInt2548)
	       + argument_16_);
	int anLocalInt_21_
	    = aClass_s_Sub1_4031.method3541(anLocalInt_20_, 0, anLocalInt);
	if ((argument_17_ & 0x7f) == 0 || (argument_16_ & 0x7f) == 0) {
	    l = (((long) anLocalInt_20_ & 0xffffL) << 16
		 | (long) anLocalInt & 0xffffL);
	    Node node = aJagexHashMap_4030.get(l);
	    if (node != null) {
		method733(((Node_Sub39) (Node_Sub39) node).aShort4197,
			  1);
		return;
	    }
	}
	short anLocalInt_22_ = (short) anInt4033++;
	if (l != -1L)
	    aJagexHashMap_4030.put(l, new Node_Sub39(anLocalInt_22_));
	float f;
	float f_23_;
	float f_24_;
	if (argument_17_ == 0 && argument_16_ == 0) {
	    f_23_ = aFloatArrayArray4041[argument_13_][argument_15_];
	    f_24_ = aFloatArrayArray4036[argument_13_][argument_15_];
	    f = aFloatArrayArray4034[argument_13_][argument_15_];
	} else if (argument_17_ == ((Class_s) aClass_s_Sub1_4031).anInt2547
		   && argument_16_ == 0) {
	    f = aFloatArrayArray4034[argument_13_ + 1][argument_15_];
	    f_23_ = aFloatArrayArray4041[argument_13_ + 1][argument_15_];
	    f_24_ = aFloatArrayArray4036[argument_13_ + 1][argument_15_];
	} else if (argument_17_ == ((Class_s) aClass_s_Sub1_4031).anInt2547
		   && (argument_16_
		       == ((Class_s) aClass_s_Sub1_4031).anInt2547)) {
	    f_23_ = aFloatArrayArray4041[argument_13_ + 1][argument_15_ + 1];
	    f = aFloatArrayArray4034[argument_13_ + 1][argument_15_ + 1];
	    f_24_ = aFloatArrayArray4036[argument_13_ + 1][argument_15_ + 1];
	} else if (argument_17_ == 0
		   && (argument_16_
		       == ((Class_s) aClass_s_Sub1_4031).anInt2547)) {
	    f = aFloatArrayArray4034[argument_13_][argument_15_ + 1];
	    f_23_ = aFloatArrayArray4041[argument_13_][argument_15_ + 1];
	    f_24_ = aFloatArrayArray4036[argument_13_][argument_15_ + 1];
	} else {
	    float f_25_ = ((float) argument_17_
			   / (float) ((Class_s) aClass_s_Sub1_4031).anInt2547);
	    float f_26_ = ((float) argument_16_
			   / (float) ((Class_s) aClass_s_Sub1_4031).anInt2547);
	    float f_27_ = aFloatArrayArray4034[argument_13_][argument_15_];
	    float f_28_ = aFloatArrayArray4041[argument_13_][argument_15_];
	    float f_29_ = aFloatArrayArray4036[argument_13_][argument_15_];
	    float f_30_ = aFloatArrayArray4034[argument_13_ + 1][argument_15_];
	    float f_31_ = aFloatArrayArray4041[argument_13_ + 1][argument_15_];
	    f_29_ += f_25_ * (-f_29_ + (aFloatArrayArray4036[argument_13_]
					[argument_15_ + 1]));
	    f_28_ += (aFloatArrayArray4041[argument_13_][argument_15_ + 1]
		      - f_28_) * f_25_;
	    f_31_ += (-f_31_ + (aFloatArrayArray4041[argument_13_ + 1]
				[argument_15_ + 1])) * f_25_;
	    f_30_ += (-f_30_ + (aFloatArrayArray4034[argument_13_ + 1]
				[argument_15_ + 1])) * f_25_;
	    f_27_ += ((-f_27_
		       + aFloatArrayArray4034[argument_13_][argument_15_ + 1])
		      * f_25_);
	    float f_32_ = aFloatArrayArray4036[argument_13_ + 1][argument_15_];
	    f_23_ = (-f_28_ + f_31_) * f_26_ + f_28_;
	    f = f_27_ + f_26_ * (-f_27_ + f_30_);
	    f_32_ += f_25_ * (-f_32_ + (aFloatArrayArray4036[argument_13_ + 1]
					[argument_15_ + 1]));
	    f_24_ = f_26_ * (f_32_ - f_29_) + f_29_;
	}
	float f_33_
	    = (float) (-anLocalInt + aClass59_Sub3_4042.getX());
	float f_34_
	    = (float) (-anLocalInt_21_ + aClass59_Sub3_4042.getY());
	float f_35_ = (float) (aClass59_Sub3_4042.getZ()
			       - anLocalInt_20_);
	float f_36_
	    = (float) Math.sqrt((double) (f_35_ * f_35_
					  + (f_33_ * f_33_ + f_34_ * f_34_)));
	float f_37_ = 1.0F / f_36_;
	f_33_ *= f_37_;
	f_34_ *= f_37_;
	f_35_ *= f_37_;
	float f_38_
	    = (f_36_
	       / (float) aClass59_Sub3_4042.getRadius());
	float f_39_ = -(f_38_ * f_38_) + 1.0F;
	if (f_39_ < 0.0F)
	    f_39_ = 0.0F;
	float f_40_ = f_34_ * f_23_ + f * f_33_ + f_24_ * f_35_;
	if (f_40_ < 0.0F)
	    f_40_ = 0.0F;
	float f_41_ = f_40_ * f_39_ * 2.0F;
	if (f_41_ > 1.0F)
	    f_41_ = 1.0F;
	int anLocalInt_42_ = aClass59_Sub3_4042.getColour();
	int anLocalInt_43_
	    = (int) ((float) (anLocalInt_42_ >> 16 & 0xff) * f_41_);
	if (anLocalInt_43_ > 255)
	    anLocalInt_43_ = 255;
	int anLocalInt_44_
	    = (int) (f_41_ * (float) (anLocalInt_42_ >> 8 & 0xff));
	if (argument_18_ == -9) {
	    if (anLocalInt_44_ > 255)
		anLocalInt_44_ = 255;
	    int anLocalInt_45_
		= (int) (f_41_ * (float) (anLocalInt_42_ & 0xff));
	    if (!Stream.isBigEndian()) {
		aStream4038.writeFloatLE((float) anLocalInt);
		aStream4038.writeFloatLE((float) anLocalInt_21_);
		aStream4038.writeFloatLE((float) anLocalInt_20_);
	    } else {
		aStream4038.writeFloatBE((float) anLocalInt);
		aStream4038.writeFloatBE((float) anLocalInt_21_);
		aStream4038.writeFloatBE((float) anLocalInt_20_);
	    }
	    if (anLocalInt_45_ > 255)
		anLocalInt_45_ = 255;
	    if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_4044).anInt4774 != 0) {
		aStream4038.writeByte(anLocalInt_43_);
		aStream4038.writeByte(anLocalInt_44_);
		aStream4038.writeByte(anLocalInt_45_);
	    } else {
		aStream4038.writeByte(anLocalInt_45_);
		aStream4038.writeByte(anLocalInt_44_);
		aStream4038.writeByte(anLocalInt_43_);
	    }
	    aStream4038.writeByte(255);
	    method733(anLocalInt_22_, 1);
	}
    }
    
    private final void method733(short argument_46_, int argument_47_) {
	if (!Stream.isBigEndian())
	    aStream4040.writeShortLE(argument_46_);
	else
	    aStream4040.writeShortBE(argument_46_);
	if (argument_47_ != 1)
	    anInt4033 = 52;
    }
    
    Node_Sub21(GraphicsToolkit_Sub2 argument_48_, Class_s_Sub1 argument_49_,
               HardwareLight argument_50_, int[] argument_51_) {
	aClass_s_Sub1_4031 = argument_49_;
	aClass_ha_Sub2_4044 = argument_48_;
	aClass59_Sub3_4042 = argument_50_;
	int anLocalInt = (aClass59_Sub3_4042.getRadius()
			  - (((Class_s) argument_49_).anInt2547 >> 1));
	anInt4037 = (-anLocalInt + aClass59_Sub3_4042.getX()
		     >> ((Class_s) argument_49_).anInt2548);
	anInt4039 = (aClass59_Sub3_4042.getX() + anLocalInt
		     >> ((Class_s) argument_49_).anInt2548);
	anInt4043 = (-anLocalInt + aClass59_Sub3_4042.getZ()
		     >> ((Class_s) argument_49_).anInt2548);
	anInt4027 = (aClass59_Sub3_4042.getZ() + anLocalInt
		     >> ((Class_s) argument_49_).anInt2548);
	int anLocalInt_52_ = anInt4039 - anInt4037 + 1;
	int anLocalInt_53_ = -anInt4043 + (anInt4027 + 1);
	aFloatArrayArray4034
	    = new float[anLocalInt_52_ + 1][anLocalInt_53_ + 1];
	aFloatArrayArray4036
	    = new float[anLocalInt_52_ + 1][anLocalInt_53_ + 1];
	aFloatArrayArray4041
	    = new float[anLocalInt_52_ + 1][anLocalInt_53_ + 1];
	for (int anLocalInt_54_ = 0; anLocalInt_53_ >= anLocalInt_54_;
	     anLocalInt_54_++) {
	    int anLocalInt_55_ = anLocalInt_54_ + anInt4043;
	    if (anLocalInt_55_ > 0
		&& (((Class_s) aClass_s_Sub1_4031).anInt2549 - 1
		    > anLocalInt_55_)) {
		for (int anLocalInt_56_ = 0; anLocalInt_52_ >= anLocalInt_56_;
		     anLocalInt_56_++) {
		    int anLocalInt_57_ = anLocalInt_56_ + anInt4037;
		    if (anLocalInt_57_ > 0
			&& (anLocalInt_57_
			    < ((Class_s) aClass_s_Sub1_4031).anInt2550 - 1)) {
			int anLocalInt_58_
			    = (argument_49_.method3534(anLocalInt_57_ + 1,
						       false, anLocalInt_55_)
			       - argument_49_.method3534(anLocalInt_57_ - 1,
							 false,
							 anLocalInt_55_));
			int anLocalInt_59_
			    = (argument_49_.method3534(anLocalInt_57_, false,
						       anLocalInt_55_ + 1)
			       - argument_49_.method3534(anLocalInt_57_, false,
							 anLocalInt_55_ - 1));
			float f
			    = (float) (1.0
				       / (Math.sqrt
					  ((double) ((anLocalInt_58_
						      * anLocalInt_58_)
						     + 65536
						     + (anLocalInt_59_
							* anLocalInt_59_)))));
			aFloatArrayArray4034[anLocalInt_56_][anLocalInt_54_]
			    = f * (float) anLocalInt_58_;
			aFloatArrayArray4041[anLocalInt_56_][anLocalInt_54_]
			    = f * -256.0F;
			aFloatArrayArray4036[anLocalInt_56_][anLocalInt_54_]
			    = (float) anLocalInt_59_ * f;
		    }
		}
	    }
	}
	int anLocalInt_60_ = 0;
	for (int anLocalInt_61_ = anInt4043; anLocalInt_61_ <= anInt4027;
	     anLocalInt_61_++) {
	    if (anLocalInt_61_ >= 0
		&& ((Class_s) argument_49_).anInt2549 > anLocalInt_61_) {
		for (int anLocalInt_62_ = anInt4037;
		     anInt4039 >= anLocalInt_62_; anLocalInt_62_++) {
		    if (anLocalInt_62_ >= 0
			&& (((Class_s) argument_49_).anInt2550
			    > anLocalInt_62_)) {
			int anLocalInt_63_ = argument_51_[anLocalInt_60_];
			int[] anLocalInts = (((Class_s_Sub1) argument_49_)
					     .anIntArrayArrayArray5339
					     [anLocalInt_62_][anLocalInt_61_]);
			if (anLocalInts != null && anLocalInt_63_ != 0) {
			    if (anLocalInt_63_ == 1) {
				int anLocalInt_64_ = 0;
				while (anLocalInt_64_ < anLocalInts.length) {
				    if (anLocalInts[anLocalInt_64_++] != -1
					&& anLocalInts[anLocalInt_64_++] != -1
					&& anLocalInts[anLocalInt_64_++] != -1)
					anInt4032 += 3;
				}
			    } else
				anInt4032 += 3;
			}
		    }
		    anLocalInt_60_++;
		}
	    } else
		anLocalInt_60_ += -anInt4037 + anInt4039;
	}
	if (anInt4032 > 0) {
	    aJagexHashMap_4030
		= new JagexHashMap(MathStatics.method2589(anInt4032));
	    anInterface4_Impl1_4029
		= aClass_ha_Sub2_4044.method2142(-1, false);
	    anInterface4_Impl1_4029.method45(anInt4032, (byte) -73);
	    NativeHeapBuffer nativeHeapBuffer
		= aClass_ha_Sub2_4044.allocateBuffer(false, anInt4032 * 16);
	    aStream4038 = new Stream(nativeHeapBuffer);
	    for (;;) {
		Buffer buffer
		    = anInterface4_Impl1_4029.method43(true, 3754);
		if (buffer != null) {
		    aStream4040 = new Stream(buffer);
		    int anLocalInt_65_ = 0;
		    anLocalInt_60_ = 0;
		    for (int anLocalInt_66_ = anInt4043;
			 anLocalInt_66_ <= anInt4027; anLocalInt_66_++) {
			if (anLocalInt_66_ < 0
			    || (((Class_s) argument_49_).anInt2549
				<= anLocalInt_66_))
			    anLocalInt_60_ += anInt4039 - anInt4037;
			else {
			    int anLocalInt_67_ = 0;
			    for (int anLocalInt_68_ = anInt4037;
				 anLocalInt_68_ <= anInt4039;
				 anLocalInt_68_++) {
				if (anLocalInt_68_ >= 0
				    && (((Class_s) argument_49_).anInt2550
					> anLocalInt_68_)) {
				    int anLocalInt_69_
					= argument_51_[anLocalInt_60_];
				    int[] anLocalInts
					= (((Class_s_Sub1) argument_49_)
					   .anIntArrayArrayArray5339
					   [anLocalInt_68_][anLocalInt_66_]);
				    if (anLocalInts != null
					&& anLocalInt_69_ != 0) {
					if (anLocalInt_69_ != 1) {
					    if (anLocalInt_69_ != 3) {
						if (anLocalInt_69_ != 2) {
						    if (anLocalInt_69_ != 5) {
							if (anLocalInt_69_
							    == 4) {
							    method732
								(anLocalInt_67_,
								 anLocalInt_68_,
								 anLocalInt_65_,
								 (((Class_s)
								   argument_49_)
								  .anInt2547),
								 0, (byte) -9,
								 anLocalInt_66_);
							    method732
								(anLocalInt_67_,
								 anLocalInt_68_,
								 anLocalInt_65_,
								 0, 0,
								 (byte) -9,
								 anLocalInt_66_);
							    method732
								(anLocalInt_67_,
								 anLocalInt_68_,
								 anLocalInt_65_,
								 (((Class_s)
								   argument_49_)
								  .anInt2547),
								 (((Class_s)
								   argument_49_)
								  .anInt2547),
								 (byte) -9,
								 anLocalInt_66_);
							}
						    } else {
							method732
							    (anLocalInt_67_,
							     anLocalInt_68_,
							     anLocalInt_65_,
							     (((Class_s)
							       argument_49_)
							      .anInt2547),
							     (((Class_s)
							       argument_49_)
							      .anInt2547),
							     (byte) -9,
							     anLocalInt_66_);
							method732
							    (anLocalInt_67_,
							     anLocalInt_68_,
							     anLocalInt_65_,
							     (((Class_s)
							       argument_49_)
							      .anInt2547),
							     0, (byte) -9,
							     anLocalInt_66_);
							method732
							    (anLocalInt_67_,
							     anLocalInt_68_,
							     anLocalInt_65_, 0,
							     (((Class_s)
							       argument_49_)
							      .anInt2547),
							     (byte) -9,
							     anLocalInt_66_);
						    }
						} else {
						    method732(anLocalInt_67_,
							      anLocalInt_68_,
							      anLocalInt_65_,
							      0,
							      (((Class_s)
								argument_49_)
							       .anInt2547),
							      (byte) -9,
							      anLocalInt_66_);
						    method732(anLocalInt_67_,
							      anLocalInt_68_,
							      anLocalInt_65_,
							      (((Class_s)
								argument_49_)
							       .anInt2547),
							      (((Class_s)
								argument_49_)
							       .anInt2547),
							      (byte) -9,
							      anLocalInt_66_);
						    method732(anLocalInt_67_,
							      anLocalInt_68_,
							      anLocalInt_65_,
							      0, 0, (byte) -9,
							      anLocalInt_66_);
						}
					    } else {
						method732(anLocalInt_67_,
							  anLocalInt_68_,
							  anLocalInt_65_, 0, 0,
							  (byte) -9,
							  anLocalInt_66_);
						method732(anLocalInt_67_,
							  anLocalInt_68_,
							  anLocalInt_65_, 0,
							  (((Class_s)
							    argument_49_)
							   .anInt2547),
							  (byte) -9,
							  anLocalInt_66_);
						method732(anLocalInt_67_,
							  anLocalInt_68_,
							  anLocalInt_65_,
							  (((Class_s)
							    argument_49_)
							   .anInt2547),
							  0, (byte) -9,
							  anLocalInt_66_);
					    }
					} else {
					    int[] anLocalInts_70_
						= (((Class_s_Sub1)
						    argument_49_)
						   .anIntArrayArrayArray5320
						   [anLocalInt_68_]
						   [anLocalInt_66_]);
					    int[] anLocalInts_71_
						= (((Class_s_Sub1)
						    argument_49_)
						   .anIntArrayArrayArray5336
						   [anLocalInt_68_]
						   [anLocalInt_66_]);
					    int anLocalInt_72_ = 0;
					    while (anLocalInt_72_
						   < anLocalInts.length) {
						if ((anLocalInts
						     [anLocalInt_72_]) != -1
						    && ((anLocalInts
							 [anLocalInt_72_ + 1])
							!= -1)
						    && ((anLocalInts
							 [anLocalInt_72_ + 2])
							!= -1)) {
						    method732
							(anLocalInt_67_,
							 anLocalInt_68_,
							 anLocalInt_65_,
							 (anLocalInts_71_
							  [anLocalInt_72_]),
							 (anLocalInts_70_
							  [anLocalInt_72_]),
							 (byte) -9,
							 anLocalInt_66_);
						    anLocalInt_72_++;
						    method732
							(anLocalInt_67_,
							 anLocalInt_68_,
							 anLocalInt_65_,
							 (anLocalInts_71_
							  [anLocalInt_72_]),
							 (anLocalInts_70_
							  [anLocalInt_72_]),
							 (byte) -9,
							 anLocalInt_66_);
						    anLocalInt_72_++;
						    method732
							(anLocalInt_67_,
							 anLocalInt_68_,
							 anLocalInt_65_,
							 (anLocalInts_71_
							  [anLocalInt_72_]),
							 (anLocalInts_70_
							  [anLocalInt_72_]),
							 (byte) -9,
							 anLocalInt_66_);
						    anLocalInt_72_++;
						} else
						    anLocalInt_72_ += 3;
					    }
					}
				    }
				}
				anLocalInt_67_++;
				anLocalInt_60_++;
			    }
			}
			anLocalInt_65_++;
		    }
		    aStream4040.upload();
		    if (anInterface4_Impl1_4029.method41(26937))
			break;
		    aStream4038.method4165(0);
		    aJagexHashMap_4030.method1527(0);
		}
	    }
	    aStream4038.upload();
	    anInterface4_Impl2_4028 = aClass_ha_Sub2_4044.method2248(0, false);
	    anInterface4_Impl2_4028.method51(anInt4033 * 16, 16, -959,
                nativeHeapBuffer);
	} else {
	    anInterface4_Impl2_4028 = null;
	    anInterface4_Impl1_4029 = null;
	}
	aFloatArrayArray4034 = aFloatArrayArray4041 = aFloatArrayArray4036
	    = null;
	aJagexHashMap_4030 = null;
	aStream4040 = null;
	aStream4038 = null;
    }
}
