/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class273
{
    private int anInt2175;
    private GlToolkit aClass_ha_Sub3_2176;
    private int anInt2177;
    private int anInt2178;
    private Class275[][] aClass275ArrayArray2179;
    private Class_s_Sub2 aClass_s_Sub2_2180;
    int anInt2182;
    byte[] aByteArray2183;
    static boolean[] aBooleanArray2184;
    private int anInt2185;
    
    static final boolean method3376(int argument, int argument_0_,
				    int argument_1_, int argument_2_,
				    int argument_3_, int argument_4_) {
	for (int anLocalInt = argument_0_; argument_4_ >= anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_5_ = argument_1_; argument >= anLocalInt_5_;
		 anLocalInt_5_++) {
		if (argument_3_ == (Class133.anIntArrayArray1066[anLocalInt]
				    [anLocalInt_5_])
		    && (Class119.anIntArrayArray970[anLocalInt][anLocalInt_5_]
			<= 1))
		    return true;
	    }
	}
	return false;
    }
    
    final void method3377(int argument_6_, int argument_7_,
			  boolean[][] argument_8_, int argument_9_,
			  boolean argument_10_, boolean argument_11_) {
	aClass_ha_Sub3_2176.setLightingEnabled(false);
	aClass_ha_Sub3_2176.method2276(false);
	aClass_ha_Sub3_2176.method2333(-2);
	aClass_ha_Sub3_2176.setCombineMode(1);
	aClass_ha_Sub3_2176.setBlendingConfiguration(1);
	float f
	    = 1.0F / (float) (((GlToolkit) aClass_ha_Sub3_2176).anInt4852
			      * 128);
	if (argument_11_) {
	    for (int anLocalInt = 0; anLocalInt < anInt2178; anLocalInt++) {
		int anLocalInt_12_ = anLocalInt << anInt2175;
		int anLocalInt_13_ = anLocalInt + 1 << anInt2175;
		for (int anLocalInt_14_ = 0; anLocalInt_14_ < anInt2177;
		     anLocalInt_14_++) {
		    int anLocalInt_15_ = anLocalInt_14_ << anInt2175;
		    int anLocalInt_16_ = anLocalInt_14_ + 1 << anInt2175;
		while_90_:
		    for (int anLocalInt_17_ = anLocalInt_15_;
			 anLocalInt_17_ < anLocalInt_16_; anLocalInt_17_++) {
			if (anLocalInt_17_ - argument_6_ >= -argument_9_
			    && -argument_6_ + anLocalInt_17_ <= argument_9_) {
			    for (int anLocalInt_18_ = anLocalInt_12_;
				 anLocalInt_18_ < anLocalInt_13_;
				 anLocalInt_18_++) {
				if ((-argument_9_
				     <= -argument_7_ + anLocalInt_18_)
				    && (argument_9_
					>= -argument_7_ + anLocalInt_18_)
				    && (argument_8_
					[(argument_9_ - argument_6_
					  + anLocalInt_17_)]
					[(argument_9_ - argument_7_
					  + anLocalInt_18_)])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef
					((float) -anLocalInt_14_ / f,
					 (float) -anLocalInt / f, 1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass275ArrayArray2179[anLocalInt_14_]
					[anLocalInt].method3394(0);
				    break while_90_;
				}
			    }
			}
		    }
		}
	    }
	} else {
	    for (int anLocalInt = 0; anLocalInt < anInt2178; anLocalInt++) {
		int anLocalInt_19_ = anLocalInt << anInt2175;
		int anLocalInt_20_ = anLocalInt + 1 << anInt2175;
		for (int anLocalInt_21_ = 0; anInt2177 > anLocalInt_21_;
		     anLocalInt_21_++) {
		    int anLocalInt_22_ = 0;
		    int anLocalInt_23_ = anLocalInt_21_ << anInt2175;
		    int anLocalInt_24_ = anLocalInt_21_ + 1 << anInt2175;
		    FloatPacket class59_sub28_sub2
			= (((GlToolkit) aClass_ha_Sub3_2176)
			   .aClass59_Sub28_Sub2_4957);
		    ((Packet) class59_sub28_sub2).pos = 0;
		    for (int anLocalInt_25_ = anLocalInt_19_;
			 anLocalInt_25_ < anLocalInt_20_; anLocalInt_25_++) {
			if (anLocalInt_25_ - argument_7_ >= -argument_9_
			    && argument_9_ >= anLocalInt_25_ - argument_7_) {
			    int anLocalInt_26_
				= (anLocalInt_23_
				   + (anLocalInt_25_
				      * (((Class_s) aClass_s_Sub2_2180)
					 .anInt2550)));
			    for (int anLocalInt_27_ = anLocalInt_23_;
				 anLocalInt_24_ > anLocalInt_27_;
				 anLocalInt_27_++) {
				if ((-argument_6_ + anLocalInt_27_
				     >= -argument_9_)
				    && (-argument_6_ + anLocalInt_27_
					<= argument_9_)
				    && (argument_8_
					[argument_9_ + (-argument_6_
							+ anLocalInt_27_)]
					[argument_9_ + (anLocalInt_25_
							- argument_7_)])) {
				    short[] anLocalInts
					= (((Class_s_Sub2) aClass_s_Sub2_2180)
					   .aShortArrayArray5351
					   [anLocalInt_26_]);
				    if (anLocalInts != null) {
					if (((GlToolkit)
					     aClass_ha_Sub3_2176)
					    .isBigEndian) {
					    for (int anLocalInt_28_ = 0;
						 (anLocalInt_28_
						  < anLocalInts.length);
						 anLocalInt_28_++) {
						anLocalInt_22_++;
						class59_sub28_sub2.p2
                                (((anLocalInts
                                        [anLocalInt_28_])
                                        & 0xffff));
					    }
					} else {
					    for (int anLocalInt_29_ = 0;
						 (anLocalInts.length
						  > anLocalInt_29_);
						 anLocalInt_29_++) {
						class59_sub28_sub2.p2i
                                (((anLocalInts
                                        [anLocalInt_29_])
                                        & 0xffff));
						anLocalInt_22_++;
					    }
					}
				    }
				}
				anLocalInt_26_++;
			    }
			}
		    }
		    if (anLocalInt_22_ > 0) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -anLocalInt_21_ / f,
					    (float) -anLocalInt / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass275ArrayArray2179[anLocalInt_21_][anLocalInt]
			    .method3395
			    (5123, 28752, anLocalInt_22_,
			     (((Packet) class59_sub28_sub2)
			      .data));
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    final boolean method3378(tia_sub_35DoublyLinked argument_30_, int argument_31_,
			     int argument_32_, int argument_33_) {
	tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2 = (tia_sub_35_Sub2DoublyLinked) argument_30_;
	argument_33_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6669 + 1;
	argument_32_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6668 + 1;
	int anLocalInt
	    = argument_32_ + ((Class273) this).anInt2182 * argument_33_;
	int anLocalInt_34_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6661;
	int anLocalInt_35_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6663;
	int anLocalInt_36_ = ((Class273) this).anInt2182 - anLocalInt_35_;
	if (argument_33_ <= 0) {
	    int anLocalInt_37_ = -argument_33_ + 1;
	    anLocalInt += ((Class273) this).anInt2182 * anLocalInt_37_;
	    argument_33_ = 1;
	    anLocalInt_34_ -= anLocalInt_37_;
	}
	if (anLocalInt_34_ + argument_33_ >= anInt2185) {
	    int anLocalInt_38_
		= -anInt2185 + argument_33_ + anLocalInt_34_ + 1;
	    anLocalInt_34_ -= anLocalInt_38_;
	}
	if (argument_32_ <= 0) {
	    int anLocalInt_39_ = -argument_32_ + 1;
	    argument_32_ = 1;
	    anLocalInt_36_ += anLocalInt_39_;
	    anLocalInt += anLocalInt_39_;
	    anLocalInt_35_ -= anLocalInt_39_;
	}
	if (anLocalInt_35_ + argument_32_ >= ((Class273) this).anInt2182) {
	    int anLocalInt_40_ = (-((Class273) this).anInt2182 + argument_32_
				  + anLocalInt_35_ + 1);
	    anLocalInt_35_ -= anLocalInt_40_;
	    anLocalInt_36_ += anLocalInt_40_;
	}
	if (anLocalInt_35_ <= 0 || anLocalInt_34_ <= 0)
	    return false;
	int anLocalInt_41_ = 8;
	anLocalInt_36_
	    += (anLocalInt_41_ - argument_31_) * ((Class273) this).anInt2182;
	return Node_Sub20.method719(anLocalInt_34_, anLocalInt_36_,
            ((Class273) this).aByteArray2183,
            (byte) 113, anLocalInt_41_, anLocalInt,
            anLocalInt_35_);
    }
    
    public static void method3379(byte argument) {
	aBooleanArray2184 = null;
	TestingStageEnum.LIVE = null;
    }
    
    private final void method3380(int argument_42_, int argument_43_,
				  int argument_44_, int argument_45_,
				  int argument_46_) {
	if (aClass275ArrayArray2179 != null && argument_46_ == 22345) {
	    int anLocalInt = argument_45_ - 1 >> 7;
	    int anLocalInt_47_ = argument_42_ + (argument_45_ - 1 - 1) >> 7;
	    int anLocalInt_48_ = argument_44_ - 1 >> 7;
	    int anLocalInt_49_ = argument_44_ - 1 - (-argument_43_ + 1) >> 7;
	    for (int anLocalInt_50_ = anLocalInt;
		 anLocalInt_50_ <= anLocalInt_47_; anLocalInt_50_++) {
		Class275[] class275s = aClass275ArrayArray2179[anLocalInt_50_];
		for (int anLocalInt_51_ = anLocalInt_48_;
		     anLocalInt_49_ >= anLocalInt_51_; anLocalInt_51_++)
		    ((Class275) class275s[anLocalInt_51_]).aBoolean2201 = true;
	    }
	}
    }
    
    final void method3381(int argument_52_, int argument_53_,
			  tia_sub_35DoublyLinked argument_54_, int argument_55_) {
	tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2 = (tia_sub_35_Sub2DoublyLinked) argument_54_;
	argument_52_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6669 + 1;
	argument_55_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6668 + 1;
	int anLocalInt
	    = argument_55_ + ((Class273) this).anInt2182 * argument_52_;
	int anLocalInt_56_ = 0;
	int anLocalInt_57_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6661;
	int anLocalInt_58_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6663;
	int anLocalInt_59_ = ((Class273) this).anInt2182 - anLocalInt_58_;
	if (argument_52_ <= 0) {
	    int anLocalInt_60_ = 1 - argument_52_;
	    argument_52_ = 1;
	    anLocalInt += anLocalInt_60_ * ((Class273) this).anInt2182;
	    anLocalInt_56_ += anLocalInt_60_ * anLocalInt_58_;
	    anLocalInt_57_ -= anLocalInt_60_;
	}
	int anLocalInt_61_ = 0;
	if (anInt2185 <= anLocalInt_57_ + argument_52_) {
	    int anLocalInt_62_
		= anLocalInt_57_ + (argument_52_ + 1) - anInt2185;
	    anLocalInt_57_ -= anLocalInt_62_;
	}
	if (argument_55_ <= 0) {
	    int anLocalInt_63_ = 1 - argument_55_;
	    anLocalInt_59_ += anLocalInt_63_;
	    argument_55_ = 1;
	    anLocalInt_56_ += anLocalInt_63_;
	    anLocalInt_61_ += anLocalInt_63_;
	    anLocalInt_58_ -= anLocalInt_63_;
	    anLocalInt += anLocalInt_63_;
	}
	if (((Class273) this).anInt2182 <= anLocalInt_58_ + argument_55_) {
	    int anLocalInt_64_ = (-((Class273) this).anInt2182 + anLocalInt_58_
				  + argument_55_ + 1);
	    anLocalInt_58_ -= anLocalInt_64_;
	    anLocalInt_61_ += anLocalInt_64_;
	    anLocalInt_59_ += anLocalInt_64_;
	}
	if (anLocalInt_58_ > 0 && anLocalInt_57_ > 0) {
	    Node_Sub30.method862(anLocalInt, anLocalInt_61_, anLocalInt_58_,
                ((Class273) this).aByteArray2183,
                anLocalInt_56_, anLocalInt_59_,
                anLocalInt_57_,
                (((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2)
                        .aByteArray6666),
                123);
	    method3380(anLocalInt_58_, anLocalInt_57_, argument_52_,
		       argument_55_, 22345);
	}
    }
    
    final void method3382(int argument_65_, tia_sub_35DoublyLinked argument_66_,
			  int argument_67_, int argument_68_) {
	tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2 = (tia_sub_35_Sub2DoublyLinked) argument_66_;
	argument_67_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6669 + 1;
	argument_68_ += ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6668 + 1;
	int anLocalInt
	    = argument_68_ + argument_67_ * ((Class273) this).anInt2182;
	int anLocalInt_69_ = 0;
	int anLocalInt_70_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6661;
	int anLocalInt_71_ = ((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2).anInt6663;
	int anLocalInt_72_ = ((Class273) this).anInt2182 - anLocalInt_71_;
	if (argument_67_ <= 0) {
	    int anLocalInt_73_ = -argument_67_ + 1;
	    anLocalInt_70_ -= anLocalInt_73_;
	    anLocalInt += ((Class273) this).anInt2182 * anLocalInt_73_;
	    anLocalInt_69_ += anLocalInt_73_ * anLocalInt_71_;
	    argument_67_ = 1;
	}
	int anLocalInt_74_ = 0;
	if (anInt2185 <= anLocalInt_70_ + argument_67_) {
	    int anLocalInt_75_
		= -anInt2185 + 1 + (anLocalInt_70_ + argument_67_);
	    anLocalInt_70_ -= anLocalInt_75_;
	}
	if (argument_68_ <= 0) {
	    int anLocalInt_76_ = 1 - argument_68_;
	    anLocalInt_71_ -= anLocalInt_76_;
	    anLocalInt += anLocalInt_76_;
	    anLocalInt_72_ += anLocalInt_76_;
	    anLocalInt_74_ += anLocalInt_76_;
	    argument_68_ = 1;
	    anLocalInt_69_ += anLocalInt_76_;
	}
	if (argument_68_ + anLocalInt_71_ >= ((Class273) this).anInt2182) {
	    int anLocalInt_77_ = (-((Class273) this).anInt2182 + 1
				  + (anLocalInt_71_ + argument_68_));
	    anLocalInt_74_ += anLocalInt_77_;
	    anLocalInt_71_ -= anLocalInt_77_;
	    anLocalInt_72_ += anLocalInt_77_;
	}
	if (anLocalInt_71_ > 0 && anLocalInt_70_ > 0) {
	    Class66.method1494(-852,
			       (((tia_sub_35_Sub2DoublyLinked) var_tia_sub_35_Sub2)
				.aByteArray6666),
			       anLocalInt_72_, anLocalInt_74_, anLocalInt,
			       anLocalInt_70_, anLocalInt_69_, anLocalInt_71_,
			       ((Class273) this).aByteArray2183);
	    method3380(anLocalInt_71_, anLocalInt_70_, argument_67_,
		       argument_68_, 22345);
	}
    }
    
    Class273(GlToolkit argument_78_, Class_s_Sub2 argument_79_) {
	aClass_ha_Sub3_2176 = argument_78_;
	aClass_s_Sub2_2180 = argument_79_;
	((Class273) this).anInt2182
	    = ((((Class_s) aClass_s_Sub2_2180).anInt2547
		* ((Class_s) aClass_s_Sub2_2180).anInt2550)
	       >> ((GlToolkit) aClass_ha_Sub3_2176).anInt4847) + 2;
	anInt2185 = 2 + ((((Class_s) aClass_s_Sub2_2180).anInt2547
			  * ((Class_s) aClass_s_Sub2_2180).anInt2549)
			 >> ((GlToolkit) aClass_ha_Sub3_2176).anInt4847);
	((Class273) this).aByteArray2183
	    = new byte[((Class273) this).anInt2182 * anInt2185];
	anInt2175 = (((GlToolkit) aClass_ha_Sub3_2176).anInt4847 + 7
		     - ((Class_s) aClass_s_Sub2_2180).anInt2548);
	anInt2177 = ((Class_s) aClass_s_Sub2_2180).anInt2550 >> anInt2175;
	anInt2178 = ((Class_s) aClass_s_Sub2_2180).anInt2549 >> anInt2175;
    }
    
    final void method3383(int argument_80_) {
	aClass275ArrayArray2179 = new Class275[anInt2177][anInt2178];
	for (int anLocalInt = 0; anLocalInt < anInt2178; anLocalInt++) {
	    for (int anLocalInt_81_ = 0; anInt2177 > anLocalInt_81_;
		 anLocalInt_81_++)
		aClass275ArrayArray2179[anLocalInt_81_][anLocalInt]
		    = new Class275(aClass_ha_Sub3_2176, this,
				   aClass_s_Sub2_2180, anLocalInt_81_,
				   anLocalInt, anInt2175,
				   anLocalInt_81_ * 128 + 1,
				   anLocalInt * 128 + 1);
	}
    }
}
