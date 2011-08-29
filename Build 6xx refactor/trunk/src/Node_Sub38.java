/* Class59_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub38 extends Node
{
    private GlToolkit aClass_ha_Sub3_4169;
    private float[][] aFloatArrayArray4170;
    private float[][] aFloatArrayArray4171;
    private float[][] aFloatArrayArray4172;
    private JagexHashMap aJagexHashMap_4173;
    static int anInt4174 = 0;
    private int anInt4175;
    private GlInterleavedArray aGlInterleavedArray_4176;
    static short[][] aShortArrayArray4177;
    private Class_s_Sub2 aClass_s_Sub2_4178;
    private static short[] aShortArray4179
	= { 957, 20418, -21587, 11209, -10300 };
    private int anInt4180;
    private int anInt4181;
    private GlArrayBuffer anGlArrayBuffer_4182;
    private int anInt4183;
    private static short[] aShortArray4184;
    private FloatPacket aClass59_Sub28_Sub2_4185;
    private Packet aClass59_Sub28_4186;
    private GlElementBuffer anGlElementBuffer_4187;
    private int anInt4188;
    private int anInt4189;
    static Class149 aClass149_4190;
    private static short[] aShortArray4191
	= { 952, 20413, -21592, 11204, -10305 };
    private HardwareLight aClass59_Sub3_4192;
    private GlInterleavedArray aGlInterleavedArray_4193;
    private static short[] aShortArray4194;
    static int[] anIntArray4195;
    
    private final void method1066(int argument_0_, short argument_1_) {
	if (argument_0_ != -1)
	    anInt4189 = -95;
	if (!((GlToolkit) aClass_ha_Sub3_4169).isBigEndian)
	    aClass59_Sub28_4186.p2i(argument_1_);
	else
	    aClass59_Sub28_4186.p2(argument_1_);
    }
    
    static final void method1067(int argument) {
	Class227.method3057(-1);
	int anLocalInt = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			     .aClass62_Sub10_4335.method1393(39);
	do {
	    if (anLocalInt != 2) {
		if (anLocalInt != 3)
		    break;
	    } else {
		Node_Sub31_Sub30.method967((byte) -126, 100, 100,
                Class389.aGraphicsToolkit3281,
                Applet_Sub1.canvasHeight,
                Applet_Sub1.canvasWidth);
		break;
	    }
	    ModeWhatEnum.method3481(Applet_Sub1.canvasHeight,
                Node_Sub31_Sub29.anInt5981, 2,
                Class389.aGraphicsToolkit3281, 53, Class5.anInt66,
                Applet_Sub1.canvasWidth, 2);
	} while (false);
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub10_4335.method1397((byte) 39))
	    Class373.method4072(Applet_Sub1.gameCanvas, (byte) -122);
	if (Class389.aGraphicsToolkit3281 != null)
	    Node_Sub37_Sub3.method1064((byte) -109);
	DoublyLinkedNodeP2_Sub3.aBoolean4523
	    = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		  .aClass62_Sub10_4335.method1393(25) != 0;
	Class52.aBoolean391 = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				  .aClass62_Sub10_4335.method1397((byte) -120);
    }
    
    final void method1068(int argument_2_, int argument_3_,
			  boolean[][] argument_4_, int argument_5_,
			  int argument_6_) {
	if (anGlElementBuffer_4187 != null && argument_5_ + argument_3_ >= anInt4189
	    && anInt4180 >= -argument_3_ + argument_5_
	    && anInt4181 <= argument_3_ + argument_6_
	    && anInt4175 >= -argument_3_ + argument_6_) {
	    for (int anLocalInt = anInt4181; anInt4175 >= anLocalInt;
		 anLocalInt++) {
		for (int anLocalInt_7_ = anInt4189; anLocalInt_7_ <= anInt4180;
		     anLocalInt_7_++) {
		    int anLocalInt_8_ = -argument_5_ + anLocalInt_7_;
		    int anLocalInt_9_ = anLocalInt - argument_6_;
		    if (anLocalInt_8_ > -argument_3_
			&& anLocalInt_8_ < argument_3_
			&& anLocalInt_9_ > -argument_3_
			&& anLocalInt_9_ < argument_3_
			&& (argument_4_[anLocalInt_8_ + argument_3_]
			    [anLocalInt_9_ + argument_3_])) {
			aClass_ha_Sub3_4169.setTexEnvColour((int) (aClass59_Sub3_4192.getColourIntensity() * 255.0F) << 24);
			aClass_ha_Sub3_4169.bindArrays(null, aGlInterleavedArray_4176, aGlInterleavedArray_4193, null);
			aClass_ha_Sub3_4169.drawElements(anGlElementBuffer_4187, anInt4188, 4, 0);
			return;
		    }
		}
	    }
	}
    }
    
    public static void method1069(int argument) {
	aShortArray4179 = null;
	aShortArray4184 = null;
	aClass149_4190 = null;
	anIntArray4195 = null;
	aShortArray4191 = null;
	aShortArray4194 = null;
	aShortArrayArray4177 = null;
    }
    
    private final void method1070(int argument_10_, int argument_11_,
				  int argument_12_, int argument_13_,
				  int argument_14_, int argument_15_,
				  int argument_16_) {
	if (argument_12_ == -12551) {
	    long l = -1L;
	    int anLocalInt
		= ((argument_13_ << ((Class_s) aClass_s_Sub2_4178).anInt2548)
		   + argument_10_);
	    int anLocalInt_17_
		= argument_16_ + (argument_14_
				  << ((Class_s) aClass_s_Sub2_4178).anInt2548);
	    int anLocalInt_18_
		= aClass_s_Sub2_4178.method3541(anLocalInt_17_, 0, anLocalInt);
	    if ((argument_10_ & 0x7f) == 0 || (argument_16_ & 0x7f) == 0) {
		l = ((long) anLocalInt_17_ << 16 & 65535L << 16
		     | (long) anLocalInt & 0xffffL);
		Node node = aJagexHashMap_4173.get(l);
		if (node != null) {
		    method1066(-1, (((Node_Sub39) (Node_Sub39) node)
				    .aShort4197));
		    return;
		}
	    }
	    short anLocalInt_19_ = (short) anInt4183++;
	    if (l != -1L)
		aJagexHashMap_4173.put(l, new Node_Sub39(anLocalInt_19_));
	    float f;
	    float f_20_;
	    float f_21_;
	    if (argument_10_ != 0 || argument_16_ != 0) {
		if (((Class_s) aClass_s_Sub2_4178).anInt2547 == argument_10_
		    && argument_16_ == 0) {
		    f_21_
			= aFloatArrayArray4171[argument_15_ + 1][argument_11_];
		    f = aFloatArrayArray4172[argument_15_ + 1][argument_11_];
		    f_20_
			= aFloatArrayArray4170[argument_15_ + 1][argument_11_];
		} else if ((argument_10_
			    == ((Class_s) aClass_s_Sub2_4178).anInt2547)
			   && (((Class_s) aClass_s_Sub2_4178).anInt2547
			       == argument_16_)) {
		    f = (aFloatArrayArray4172[argument_15_ + 1]
			 [argument_11_ + 1]);
		    f_20_ = (aFloatArrayArray4170[argument_15_ + 1]
			     [argument_11_ + 1]);
		    f_21_ = (aFloatArrayArray4171[argument_15_ + 1]
			     [argument_11_ + 1]);
		} else if (argument_10_ == 0
			   && (((Class_s) aClass_s_Sub2_4178).anInt2547
			       == argument_16_)) {
		    f_21_
			= aFloatArrayArray4171[argument_15_][argument_11_ + 1];
		    f_20_
			= aFloatArrayArray4170[argument_15_][argument_11_ + 1];
		    f = aFloatArrayArray4172[argument_15_][argument_11_ + 1];
		} else {
		    float f_22_
			= ((float) argument_10_
			   / (float) ((Class_s) aClass_s_Sub2_4178).anInt2547);
		    float f_23_
			= ((float) argument_16_
			   / (float) ((Class_s) aClass_s_Sub2_4178).anInt2547);
		    float f_24_
			= aFloatArrayArray4171[argument_15_][argument_11_];
		    float f_25_
			= aFloatArrayArray4172[argument_15_][argument_11_];
		    float f_26_
			= aFloatArrayArray4170[argument_15_][argument_11_];
		    float f_27_
			= aFloatArrayArray4171[argument_15_ + 1][argument_11_];
		    float f_28_
			= aFloatArrayArray4172[argument_15_ + 1][argument_11_];
		    f_27_ += f_22_ * ((aFloatArrayArray4171[argument_15_ + 1]
				       [argument_11_ + 1])
				      - f_27_);
		    float f_29_
			= aFloatArrayArray4170[argument_15_ + 1][argument_11_];
		    f_25_ += f_22_ * (-f_25_
				      + (aFloatArrayArray4172[argument_15_]
					 [argument_11_ + 1]));
		    f_26_ += f_22_ * (-f_26_
				      + (aFloatArrayArray4170[argument_15_]
					 [argument_11_ + 1]));
		    f_24_ += f_22_ * (-f_24_
				      + (aFloatArrayArray4171[argument_15_]
					 [argument_11_ + 1]));
		    f_28_ += ((aFloatArrayArray4172[argument_15_ + 1]
			       [argument_11_ + 1])
			      - f_28_) * f_22_;
		    f = f_23_ * (f_28_ - f_25_) + f_25_;
		    f_21_ = f_23_ * (f_27_ - f_24_) + f_24_;
		    f_29_ += ((aFloatArrayArray4170[argument_15_ + 1]
			       [argument_11_ + 1])
			      - f_29_) * f_22_;
		    f_20_ = f_26_ + f_23_ * (-f_26_ + f_29_);
		}
	    } else {
		f = aFloatArrayArray4172[argument_15_][argument_11_];
		f_20_ = aFloatArrayArray4170[argument_15_][argument_11_];
		f_21_ = aFloatArrayArray4171[argument_15_][argument_11_];
	    }
	    float f_30_
		= (float) (-anLocalInt + aClass59_Sub3_4192.getX());
	    float f_31_ = (float) (-anLocalInt_18_
				   + aClass59_Sub3_4192
					 .getY());
	    float f_32_ = (float) (aClass59_Sub3_4192.getZ()
				   - anLocalInt_17_);
	    float f_33_ = (float) Math.sqrt((double) (f_32_ * f_32_
						      + (f_30_ * f_30_
							 + f_31_ * f_31_)));
	    float f_34_ = 1.0F / f_33_;
	    f_31_ *= f_34_;
	    f_30_ *= f_34_;
	    f_32_ *= f_34_;
	    float f_35_ = f_33_ / (float) aClass59_Sub3_4192
					      .getRadius();
	    float f_36_ = 1.0F - f_35_ * f_35_;
	    if (f_36_ < 0.0F)
		f_36_ = 0.0F;
	    float f_37_ = f_32_ * f_20_ + (f_21_ * f_30_ + f * f_31_);
	    if (f_37_ < 0.0F)
		f_37_ = 0.0F;
	    float f_38_ = f_36_ * f_37_ * 2.0F;
	    if (f_38_ > 1.0F)
		f_38_ = 1.0F;
	    int anLocalInt_39_ = aClass59_Sub3_4192.getColour();
	    int anLocalInt_40_
		= (int) ((float) (anLocalInt_39_ >> 16 & 0xff) * f_38_);
	    if (anLocalInt_40_ > 255)
		anLocalInt_40_ = 255;
	    int anLocalInt_41_
		= (int) ((float) ((anLocalInt_39_ & 0xff00) >> 8) * f_38_);
	    if (anLocalInt_41_ > 255)
		anLocalInt_41_ = 255;
	    int anLocalInt_42_
		= (int) ((float) (anLocalInt_39_ & 0xff) * f_38_);
	    if (((GlToolkit) aClass_ha_Sub3_4169).isBigEndian) {
		aClass59_Sub28_Sub2_4185.pfloat((float) anLocalInt);
		aClass59_Sub28_Sub2_4185.pfloat((float) anLocalInt_18_);
		aClass59_Sub28_Sub2_4185.pfloat((float) anLocalInt_17_);
	    } else {
		aClass59_Sub28_Sub2_4185.ipfloat((float) anLocalInt);
		aClass59_Sub28_Sub2_4185.ipfloat((float) anLocalInt_18_);
		aClass59_Sub28_Sub2_4185.ipfloat((float) anLocalInt_17_);
	    }
	    if (anLocalInt_42_ > 255)
		anLocalInt_42_ = 255;
	    aClass59_Sub28_Sub2_4185.p1(anLocalInt_40_);
	    aClass59_Sub28_Sub2_4185.p1(anLocalInt_41_);
	    aClass59_Sub28_Sub2_4185.p1(anLocalInt_42_);
	    aClass59_Sub28_Sub2_4185.p1(255);
	    method1066(-1, anLocalInt_19_);
	}
    }

    Node_Sub38(GlToolkit argument_50_, Class_s_Sub2 argument_51_,
               HardwareLight argument_52_, int[] argument_53_) {
	aClass_s_Sub2_4178 = argument_51_;
	aClass59_Sub3_4192 = argument_52_;
	aClass_ha_Sub3_4169 = argument_50_;
	int anLocalInt = (aClass59_Sub3_4192.getRadius()
			  - (((Class_s) argument_51_).anInt2547 >> 1));
	anInt4189 = (-anLocalInt + aClass59_Sub3_4192.getX()
		     >> ((Class_s) argument_51_).anInt2548);
	anInt4180 = (aClass59_Sub3_4192.getX() + anLocalInt
		     >> ((Class_s) argument_51_).anInt2548);
	anInt4181 = (aClass59_Sub3_4192.getZ() - anLocalInt
		     >> ((Class_s) argument_51_).anInt2548);
	anInt4175 = (anLocalInt + aClass59_Sub3_4192.getZ()
		     >> ((Class_s) argument_51_).anInt2548);
	int anLocalInt_54_ = -anInt4189 + (anInt4180 + 1);
	int anLocalInt_55_ = -anInt4181 + anInt4175 + 1;
	aFloatArrayArray4172
	    = new float[anLocalInt_54_ + 1][anLocalInt_55_ + 1];
	aFloatArrayArray4170
	    = new float[anLocalInt_54_ + 1][anLocalInt_55_ + 1];
	aFloatArrayArray4171
	    = new float[anLocalInt_54_ + 1][anLocalInt_55_ + 1];
	for (int anLocalInt_56_ = 0; anLocalInt_56_ <= anLocalInt_55_;
	     anLocalInt_56_++) {
	    int anLocalInt_57_ = anInt4181 + anLocalInt_56_;
	    if (anLocalInt_57_ > 0
		&& (((Class_s) aClass_s_Sub2_4178).anInt2549 - 1
		    > anLocalInt_57_)) {
		for (int anLocalInt_58_ = 0; anLocalInt_58_ <= anLocalInt_54_;
		     anLocalInt_58_++) {
		    int anLocalInt_59_ = anInt4189 + anLocalInt_58_;
		    if (anLocalInt_59_ > 0
			&& (((Class_s) aClass_s_Sub2_4178).anInt2550 - 1
			    > anLocalInt_59_)) {
			int anLocalInt_60_
			    = (argument_51_.method3534(anLocalInt_59_ + 1,
						       false, anLocalInt_57_)
			       - argument_51_.method3534(anLocalInt_59_ - 1,
							 false,
							 anLocalInt_57_));
			int anLocalInt_61_
			    = (argument_51_.method3534(anLocalInt_59_, false,
						       anLocalInt_57_ + 1)
			       - argument_51_.method3534(anLocalInt_59_, false,
							 anLocalInt_57_ - 1));
			float f
			    = (float) (1.0 / (Math.sqrt
					      ((double) ((anLocalInt_61_
							  * anLocalInt_61_)
							 + ((anLocalInt_60_
							     * anLocalInt_60_)
							    + 65536)))));
			aFloatArrayArray4171[anLocalInt_58_][anLocalInt_56_]
			    = f * (float) anLocalInt_60_;
			aFloatArrayArray4172[anLocalInt_58_][anLocalInt_56_]
			    = f * -256.0F;
			aFloatArrayArray4170[anLocalInt_58_][anLocalInt_56_]
			    = f * (float) anLocalInt_61_;
		    }
		}
	    }
	}
	int anLocalInt_62_ = 0;
	for (int anLocalInt_63_ = anInt4181; anLocalInt_63_ <= anInt4175;
	     anLocalInt_63_++) {
	    if (anLocalInt_63_ >= 0
		&& ((Class_s) argument_51_).anInt2549 > anLocalInt_63_) {
		for (int anLocalInt_64_ = anInt4189;
		     anInt4180 >= anLocalInt_64_; anLocalInt_64_++) {
		    if (anLocalInt_64_ >= 0
			&& (anLocalInt_64_
			    < ((Class_s) argument_51_).anInt2550)) {
			int anLocalInt_65_ = argument_53_[anLocalInt_62_];
			int[] anLocalInts = (((Class_s_Sub2) argument_51_)
					     .anIntArrayArrayArray5365
					     [anLocalInt_64_][anLocalInt_63_]);
			if (anLocalInts != null && anLocalInt_65_ != 0) {
			    if (anLocalInt_65_ == 1) {
				int anLocalInt_66_ = 0;
				while (anLocalInt_66_ < anLocalInts.length) {
				    if (anLocalInts[anLocalInt_66_++] != -1
					&& anLocalInts[anLocalInt_66_++] != -1
					&& anLocalInts[anLocalInt_66_++] != -1)
					anInt4188 += 3;
				}
			    } else
				anInt4188 += 3;
			}
		    }
		    anLocalInt_62_++;
		}
	    } else
		anLocalInt_62_ += anInt4180 - anInt4189;
	}
	if (anInt4188 > 0) {
	    aClass59_Sub28_4186 = new Packet(anInt4188 * 2);
	    aClass59_Sub28_Sub2_4185 = new FloatPacket(anInt4188 * 16);
	    aJagexHashMap_4173
		= new JagexHashMap(MathStatics.method2589(anInt4188));
	    int anLocalInt_67_ = 0;
	    anLocalInt_62_ = 0;
	    for (int anLocalInt_68_ = anInt4181; anLocalInt_68_ <= anInt4175;
		 anLocalInt_68_++) {
		if (anLocalInt_68_ < 0
		    || anLocalInt_68_ >= ((Class_s) argument_51_).anInt2549)
		    anLocalInt_62_ += anInt4180 - anInt4189;
		else {
		    int anLocalInt_69_ = 0;
		    for (int anLocalInt_70_ = anInt4189;
			 anLocalInt_70_ <= anInt4180; anLocalInt_70_++) {
			if (anLocalInt_70_ >= 0
			    && (((Class_s) argument_51_).anInt2550
				> anLocalInt_70_)) {
			    int anLocalInt_71_ = argument_53_[anLocalInt_62_];
			    int[] anLocalInts
				= (((Class_s_Sub2) argument_51_)
				   .anIntArrayArrayArray5365[anLocalInt_70_]
				   [anLocalInt_68_]);
			    if (anLocalInts != null && anLocalInt_71_ != 0) {
				if (anLocalInt_71_ == 1) {
				    int[] anLocalInts_72_
					= (((Class_s_Sub2) argument_51_)
					   .anIntArrayArrayArray5356
					   [anLocalInt_70_][anLocalInt_68_]);
				    int[] anLocalInts_73_
					= (((Class_s_Sub2) argument_51_)
					   .anIntArrayArrayArray5354
					   [anLocalInt_70_][anLocalInt_68_]);
				    int anLocalInt_74_ = 0;
				    while (anLocalInts.length
					   > anLocalInt_74_) {
					if (anLocalInts[anLocalInt_74_] != -1
					    && (anLocalInts[anLocalInt_74_ + 1]
						!= -1)
					    && (anLocalInts[anLocalInt_74_ + 2]
						!= -1)) {
					    method1070((anLocalInts_72_
							[anLocalInt_74_]),
						       anLocalInt_67_, -12551,
						       anLocalInt_70_,
						       anLocalInt_68_,
						       anLocalInt_69_,
						       (anLocalInts_73_
							[anLocalInt_74_]));
					    anLocalInt_74_++;
					    method1070((anLocalInts_72_
							[anLocalInt_74_]),
						       anLocalInt_67_, -12551,
						       anLocalInt_70_,
						       anLocalInt_68_,
						       anLocalInt_69_,
						       (anLocalInts_73_
							[anLocalInt_74_]));
					    anLocalInt_74_++;
					    method1070((anLocalInts_72_
							[anLocalInt_74_]),
						       anLocalInt_67_, -12551,
						       anLocalInt_70_,
						       anLocalInt_68_,
						       anLocalInt_69_,
						       (anLocalInts_73_
							[anLocalInt_74_]));
					    anLocalInt_74_++;
					} else
					    anLocalInt_74_ += 3;
				    }
				} else if (anLocalInt_71_ == 3) {
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				} else if (anLocalInt_71_ == 2) {
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				} else if (anLocalInt_71_ == 5) {
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				} else if (anLocalInt_71_ == 4) {
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				    method1070(0, anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_, 0);
				    method1070((((Class_s) argument_51_)
						.anInt2547),
					       anLocalInt_67_, -12551,
					       anLocalInt_70_, anLocalInt_68_,
					       anLocalInt_69_,
					       (((Class_s) argument_51_)
						.anInt2547));
				}
			    }
			}
			anLocalInt_69_++;
			anLocalInt_62_++;
		    }
		}
		anLocalInt_67_++;
	    }
	    anGlElementBuffer_4187
		= (aClass_ha_Sub3_4169.method2290
		   (((Packet) aClass59_Sub28_4186).pos, false,
		    5123, false,
		    ((Packet) aClass59_Sub28_4186).data));
	    anGlArrayBuffer_4182
		= (aClass_ha_Sub3_4169.method2289
		   (0, ((Packet) aClass59_Sub28_Sub2_4185).pos,
		    ((Packet) aClass59_Sub28_Sub2_4185).data,
		    false, 16));
	    aGlInterleavedArray_4193 = new GlInterleavedArray(anGlArrayBuffer_4182, 5126, 3, 0);
	    aGlInterleavedArray_4176 = new GlInterleavedArray(anGlArrayBuffer_4182, 5121, 4, 12);
	} else {
	    anGlArrayBuffer_4182 = null;
	    anGlElementBuffer_4187 = null;
	    aGlInterleavedArray_4193 = null;
	    aGlInterleavedArray_4176 = null;
	}
	aFloatArrayArray4171 = aFloatArrayArray4172 = aFloatArrayArray4170
	    = null;
	aJagexHashMap_4173 = null;
	aClass59_Sub28_4186 = null;
	aClass59_Sub28_Sub2_4185 = null;
    }
    
    static {
	aShortArray4184 = new short[] { 967, 20428, -21577, 11219, -10290 };
	aShortArray4194 = new short[] { 962, 20423, -21582, 11214, -10295 };
	aShortArrayArray4177
	    = new short[][] { aShortArray4184, aShortArray4194,
			      aShortArray4179, aShortArray4191 };
	aClass149_4190 = new Class149(260);
	anIntArray4195 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2,
				     2, 2, 2, 2, 2, 2, 2, 2, 3 };
    }
}
