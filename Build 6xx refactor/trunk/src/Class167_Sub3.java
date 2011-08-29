/* Class167_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

import jaggl.OpenGL;

final class Class167_Sub3 extends Class167 {
    private short aShort5208;
    private Class173[] aClass173Array5210;
    private int anInt5211;
    private short[] aShortArray5212;
    private int anInt5213 = 0;
    private GlElementBuffer anGlElementBuffer_5214;
    private short[] aShortArray5215;
    private int[] anIntArray5216;
    private boolean aBoolean5217;
    private int anInt5218;
    private short[] aShortArray5219;
    private short[] aShortArray5220;
    private short[] aShortArray5221;
    private short aShort5222;
    private short[] aShortArray5223;
    private int anInt5224;
    private GlInterleavedArray aGlInterleavedArray_5225;
    private boolean aBoolean5226 = true;
    private int[][] anIntArrayArray5227;
    private int[][] anIntArrayArray5228;
    private short aShort5229;
    private byte[] aByteArray5230;
    private int anInt5231;
    private short aShort5232;
    private short[] aShortArray5233;
    private float[] aFloatArray5234;
    private short aShort5235;
    private GlInterleavedArray aGlInterleavedArray_5236;
    private int anInt5237;
    private short[] aShortArray5238;
    private short[] aShortArray5239;
    private GlInterleavedArray aGlInterleavedArray_5241;
    private short aShort5242;
    private Class185[] aClass185Array5243;
    private int[][] anIntArrayArray5244;
    private int anInt5245;
    private Class359[] aClass359Array5246;
    private boolean aBoolean5247 = false;
    private short[] aShortArray5248;
    private Class121 aClass121_5249;
    private short[] aShortArray5250;
    private short aShort5251;
    private byte aByte5252;
    private byte[] aByteArray5253;
    private GlInterleavedArray aGlInterleavedArray_5254;
    private int[] anIntArray5255;
    private float[] aFloatArray5256;
    private GlToolkit aClass_ha_Sub3_5257;
    private GlArrayBuffer anGlArrayBuffer_5258;
    private Class317 aClass317_5259;
    private int[] anIntArray5260;
    private short aShort5261;
    private Class38[] aClass38Array5263;
    private boolean aBoolean5264;
    private short aShort5265;
    private int[] anIntArray5266;
    private int[] anIntArray5267;
    private int anInt5268;
    private short aShort5269;

    final void wa() {
        for (int anLocalInt = 0; anInt5224 > anLocalInt; anLocalInt++) {
            anIntArray5255[anLocalInt] = anIntArray5255[anLocalInt] + 7 >> 4;
            anIntArray5267[anLocalInt] = anIntArray5267[anLocalInt] + 7 >> 4;
            anIntArray5216[anLocalInt] = anIntArray5216[anLocalInt] + 7 >> 4;
        }
        aBoolean5247 = false;
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
    }

    final void method2659(int argument_0_, int[] argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_, boolean argument_6_) {
        int anLocalInt = argument_1_.length;
        if (argument_0_ == 0) {
            argument_4_ <<= 4;
            argument_3_ <<= 4;
            argument_2_ <<= 4;
            Node_Sub47_Sub8.anInt6194 = 0;
            Class62_Sub16.anInt4415 = 0;
            Node_Sub31_Sub23.anInt5945 = 0;
            int anLocalInt_7_ = 0;
            for (int anLocalInt_8_ = 0; anLocalInt_8_ < anLocalInt; anLocalInt_8_++) {
                int anLocalInt_9_ = argument_1_[anLocalInt_8_];
                if (anLocalInt_9_ < anIntArrayArray5244.length) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_9_];
                    for (int anLocalInt_10_ = 0; anLocalInts.length > anLocalInt_10_; anLocalInt_10_++) {
                        int anLocalInt_11_ = anLocalInts[anLocalInt_10_];
                        Node_Sub31_Sub23.anInt5945 += anIntArray5255[anLocalInt_11_];
                        Node_Sub47_Sub8.anInt6194 += anIntArray5267[anLocalInt_11_];
                        Class62_Sub16.anInt4415 += anIntArray5216[anLocalInt_11_];
                        anLocalInt_7_++;
                    }
                }
            }
            if (anLocalInt_7_ > 0) {
                Node_Sub31_Sub23.anInt5945 = (argument_2_ + Node_Sub31_Sub23.anInt5945 / anLocalInt_7_);
                Class62_Sub16.anInt4415 = Class62_Sub16.anInt4415 / anLocalInt_7_ + argument_4_;
                Node_Sub47_Sub8.anInt6194 = (Node_Sub47_Sub8.anInt6194 / anLocalInt_7_ + argument_3_);
            } else {
                Node_Sub47_Sub8.anInt6194 = argument_3_;
                Class62_Sub16.anInt4415 = argument_4_;
                Node_Sub31_Sub23.anInt5945 = argument_2_;
            }
        } else if (argument_0_ == 1) {
            argument_2_ <<= 4;
            argument_3_ <<= 4;
            argument_4_ <<= 4;
            for (int anLocalInt_12_ = 0; anLocalInt > anLocalInt_12_; anLocalInt_12_++) {
                int anLocalInt_13_ = argument_1_[anLocalInt_12_];
                if (anIntArrayArray5244.length > anLocalInt_13_) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_13_];
                    for (int anLocalInt_14_ = 0; anLocalInts.length > anLocalInt_14_; anLocalInt_14_++) {
                        int anLocalInt_15_ = anLocalInts[anLocalInt_14_];
                        anIntArray5255[anLocalInt_15_] += argument_2_;
                        anIntArray5267[anLocalInt_15_] += argument_3_;
                        anIntArray5216[anLocalInt_15_] += argument_4_;
                    }
                }
            }
        } else if (argument_0_ == 2) {
            for (int anLocalInt_16_ = 0; anLocalInt_16_ < anLocalInt; anLocalInt_16_++) {
                int anLocalInt_17_ = argument_1_[anLocalInt_16_];
                if (anLocalInt_17_ < anIntArrayArray5244.length) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_17_];
                    if ((argument_5_ & 0x1) != 0) {
                        for (int anLocalInt_18_ = 0; anLocalInt_18_ < anLocalInts.length; anLocalInt_18_++) {
                            int anLocalInt_19_ = anLocalInts[anLocalInt_18_];
                            anIntArray5255[anLocalInt_19_] -= Node_Sub31_Sub23.anInt5945;
                            anIntArray5267[anLocalInt_19_] -= Node_Sub47_Sub8.anInt6194;
                            anIntArray5216[anLocalInt_19_] -= Class62_Sub16.anInt4415;
                            if (argument_2_ != 0) {
                                int anLocalInt_20_ = Node_Sub6.SINETABLE[argument_2_];
                                int anLocalInt_21_ = Node_Sub6.COSINETABLE[argument_2_];
                                int anLocalInt_22_ = (((anIntArray5267[anLocalInt_19_] * anLocalInt_21_) - (anLocalInt_20_ * anIntArray5216[anLocalInt_19_]) + 16383) >> 14);
                                anIntArray5216[anLocalInt_19_] = ((anIntArray5267[anLocalInt_19_] * anLocalInt_20_) + (anIntArray5216[anLocalInt_19_] * anLocalInt_21_) + 16383) >> 14;
                                anIntArray5267[anLocalInt_19_] = anLocalInt_22_;
                            }
                            if (argument_4_ != 0) {
                                int anLocalInt_23_ = Node_Sub6.SINETABLE[argument_4_];
                                int anLocalInt_24_ = Node_Sub6.COSINETABLE[argument_4_];
                                int anLocalInt_25_ = (((anIntArray5255[anLocalInt_19_] * anLocalInt_24_) + (anLocalInt_23_ * anIntArray5267[anLocalInt_19_]) + 16383) >> 14);
                                anIntArray5267[anLocalInt_19_] = (((anIntArray5267[anLocalInt_19_] * anLocalInt_24_) + 16383 - (anLocalInt_23_ * anIntArray5255[anLocalInt_19_])) >> 14);
                                anIntArray5255[anLocalInt_19_] = anLocalInt_25_;
                            }
                            if (argument_3_ != 0) {
                                int anLocalInt_26_ = Node_Sub6.SINETABLE[argument_3_];
                                int anLocalInt_27_ = Node_Sub6.COSINETABLE[argument_3_];
                                int anLocalInt_28_ = (((anIntArray5255[anLocalInt_19_] * anLocalInt_27_) + (anLocalInt_26_ * anIntArray5216[anLocalInt_19_]) + 16383) >> 14);
                                anIntArray5216[anLocalInt_19_] = ((anIntArray5216[anLocalInt_19_] * anLocalInt_27_) + 16383 - (anIntArray5255[anLocalInt_19_] * anLocalInt_26_)) >> 14;
                                anIntArray5255[anLocalInt_19_] = anLocalInt_28_;
                            }
                            anIntArray5255[anLocalInt_19_] += Node_Sub31_Sub23.anInt5945;
                            anIntArray5267[anLocalInt_19_] += Node_Sub47_Sub8.anInt6194;
                            anIntArray5216[anLocalInt_19_] += Class62_Sub16.anInt4415;
                        }
                    } else {
                        for (int anLocalInt_29_ = 0; anLocalInt_29_ < anLocalInts.length; anLocalInt_29_++) {
                            int anLocalInt_30_ = anLocalInts[anLocalInt_29_];
                            anIntArray5255[anLocalInt_30_] -= Node_Sub31_Sub23.anInt5945;
                            anIntArray5267[anLocalInt_30_] -= Node_Sub47_Sub8.anInt6194;
                            anIntArray5216[anLocalInt_30_] -= Class62_Sub16.anInt4415;
                            if (argument_4_ != 0) {
                                int anLocalInt_31_ = Node_Sub6.SINETABLE[argument_4_];
                                int anLocalInt_32_ = Node_Sub6.COSINETABLE[argument_4_];
                                int anLocalInt_33_ = (((anIntArray5267[anLocalInt_30_] * anLocalInt_31_) + ((anLocalInt_32_ * anIntArray5255[anLocalInt_30_]) + 16383)) >> 14);
                                anIntArray5267[anLocalInt_30_] = (-(anLocalInt_31_ * anIntArray5255[anLocalInt_30_]) + ((anIntArray5267[anLocalInt_30_] * anLocalInt_32_) + 16383)) >> 14;
                                anIntArray5255[anLocalInt_30_] = anLocalInt_33_;
                            }
                            if (argument_2_ != 0) {
                                int anLocalInt_34_ = Node_Sub6.SINETABLE[argument_2_];
                                int anLocalInt_35_ = Node_Sub6.COSINETABLE[argument_2_];
                                int anLocalInt_36_ = ((-(anLocalInt_34_ * anIntArray5216[anLocalInt_30_]) + ((anIntArray5267[anLocalInt_30_] * anLocalInt_35_) + 16383)) >> 14);
                                anIntArray5216[anLocalInt_30_] = (((anLocalInt_34_ * anIntArray5267[anLocalInt_30_]) + 16383 + (anLocalInt_35_ * anIntArray5216[anLocalInt_30_])) >> 14);
                                anIntArray5267[anLocalInt_30_] = anLocalInt_36_;
                            }
                            if (argument_3_ != 0) {
                                int anLocalInt_37_ = Node_Sub6.SINETABLE[argument_3_];
                                int anLocalInt_38_ = Node_Sub6.COSINETABLE[argument_3_];
                                int anLocalInt_39_ = (((anIntArray5216[anLocalInt_30_] * anLocalInt_37_) - (-(anIntArray5255[anLocalInt_30_] * anLocalInt_38_) - 16383)) >> 14);
                                anIntArray5216[anLocalInt_30_] = (-(anIntArray5255[anLocalInt_30_] * anLocalInt_37_) + (anLocalInt_38_ * anIntArray5216[anLocalInt_30_]) + 16383) >> 14;
                                anIntArray5255[anLocalInt_30_] = anLocalInt_39_;
                            }
                            anIntArray5255[anLocalInt_30_] += Node_Sub31_Sub23.anInt5945;
                            anIntArray5267[anLocalInt_30_] += Node_Sub47_Sub8.anInt6194;
                            anIntArray5216[anLocalInt_30_] += Class62_Sub16.anInt4415;
                        }
                    }
                }
            }
            if (argument_6_) {
                for (int anLocalInt_40_ = 0; anLocalInt > anLocalInt_40_; anLocalInt_40_++) {
                    int anLocalInt_41_ = argument_1_[anLocalInt_40_];
                    if (anLocalInt_41_ < anIntArrayArray5244.length) {
                        int[] anLocalInts = anIntArrayArray5244[anLocalInt_41_];
                        for (int anLocalInt_42_ = 0; anLocalInts.length > anLocalInt_42_; anLocalInt_42_++) {
                            int anLocalInt_43_ = anLocalInts[anLocalInt_42_];
                            int anLocalInt_44_ = anIntArray5260[anLocalInt_43_];
                            int anLocalInt_45_ = anIntArray5260[anLocalInt_43_ + 1];
                            for (int anLocalInt_46_ = anLocalInt_44_; anLocalInt_45_ > anLocalInt_46_; anLocalInt_46_++) {
                                int anLocalInt_47_ = aShortArray5248[anLocalInt_46_] - 1;
                                if (anLocalInt_47_ == -1)
                                    break;
                                if (argument_4_ != 0) {
                                    int anLocalInt_48_ = (Node_Sub6.SINETABLE[argument_4_]);
                                    int anLocalInt_49_ = (Node_Sub6.COSINETABLE[argument_4_]);
                                    int anLocalInt_50_ = (((aShortArray5219[anLocalInt_47_] * anLocalInt_48_) + (anLocalInt_49_ * (aShortArray5233[anLocalInt_47_])) + 16383) >> 14);
                                    aShortArray5219[anLocalInt_47_] = (short) ((-(anLocalInt_48_ * (aShortArray5233[anLocalInt_47_])) + ((anLocalInt_49_ * (aShortArray5219[anLocalInt_47_])) + 16383)) >> 14);
                                    aShortArray5233[anLocalInt_47_] = (short) anLocalInt_50_;
                                }
                                if (argument_2_ != 0) {
                                    int anLocalInt_51_ = (Node_Sub6.SINETABLE[argument_2_]);
                                    int anLocalInt_52_ = (Node_Sub6.COSINETABLE[argument_2_]);
                                    int anLocalInt_53_ = ((-(aShortArray5239[anLocalInt_47_] * anLocalInt_51_) + ((aShortArray5219[anLocalInt_47_] * anLocalInt_52_) + 16383)) >> 14);
                                    aShortArray5239[anLocalInt_47_] = (short) ((((aShortArray5239[anLocalInt_47_]) * anLocalInt_52_) + 16383 + ((aShortArray5219[anLocalInt_47_]) * anLocalInt_51_)) >> 14);
                                    aShortArray5219[anLocalInt_47_] = (short) anLocalInt_53_;
                                }
                                if (argument_3_ != 0) {
                                    int anLocalInt_54_ = (Node_Sub6.SINETABLE[argument_3_]);
                                    int anLocalInt_55_ = (Node_Sub6.COSINETABLE[argument_3_]);
                                    int anLocalInt_56_ = (((aShortArray5233[anLocalInt_47_] * anLocalInt_55_) + (aShortArray5239[anLocalInt_47_] * anLocalInt_54_) + 16383) >> 14);
                                    aShortArray5239[anLocalInt_47_] = (short) ((-((aShortArray5233[anLocalInt_47_]) * anLocalInt_54_) + ((anLocalInt_55_ * (aShortArray5239[anLocalInt_47_])) + 16383)) >> 14);
                                    aShortArray5233[anLocalInt_47_] = (short) anLocalInt_56_;
                                }
                            }
                        }
                    }
                }
                if (aGlInterleavedArray_5236 == null && aGlInterleavedArray_5254 != null)
                    ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                if (aGlInterleavedArray_5236 != null)
                    ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
            }
        } else if (argument_0_ == 3) {
            for (int anLocalInt_57_ = 0; anLocalInt > anLocalInt_57_; anLocalInt_57_++) {
                int anLocalInt_58_ = argument_1_[anLocalInt_57_];
                if (anLocalInt_58_ < anIntArrayArray5244.length) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_58_];
                    for (int anLocalInt_59_ = 0; anLocalInt_59_ < anLocalInts.length; anLocalInt_59_++) {
                        int anLocalInt_60_ = anLocalInts[anLocalInt_59_];
                        anIntArray5255[anLocalInt_60_] -= Node_Sub31_Sub23.anInt5945;
                        anIntArray5267[anLocalInt_60_] -= Node_Sub47_Sub8.anInt6194;
                        anIntArray5216[anLocalInt_60_] -= Class62_Sub16.anInt4415;
                        anIntArray5255[anLocalInt_60_] = (anIntArray5255[anLocalInt_60_] * argument_2_ >> 7);
                        anIntArray5267[anLocalInt_60_] = (anIntArray5267[anLocalInt_60_] * argument_3_ >> 7);
                        anIntArray5216[anLocalInt_60_] = (argument_4_ * anIntArray5216[anLocalInt_60_] >> 7);
                        anIntArray5255[anLocalInt_60_] += Node_Sub31_Sub23.anInt5945;
                        anIntArray5267[anLocalInt_60_] += Node_Sub47_Sub8.anInt6194;
                        anIntArray5216[anLocalInt_60_] += Class62_Sub16.anInt4415;
                    }
                }
            }
        } else if (argument_0_ == 5) {
            if (anIntArrayArray5228 != null) {
                for (int anLocalInt_61_ = 0; anLocalInt_61_ < anLocalInt; anLocalInt_61_++) {
                    int anLocalInt_62_ = argument_1_[anLocalInt_61_];
                    if (anIntArrayArray5228.length > anLocalInt_62_) {
                        int[] anLocalInts = anIntArrayArray5228[anLocalInt_62_];
                        for (int anLocalInt_63_ = 0; anLocalInt_63_ < anLocalInts.length; anLocalInt_63_++) {
                            int anLocalInt_64_ = anLocalInts[anLocalInt_63_];
                            int anLocalInt_65_ = (argument_2_ * 8 + (aByteArray5230[anLocalInt_64_] & 0xff));
                            if (anLocalInt_65_ < 0)
                                anLocalInt_65_ = 0;
                            else if (anLocalInt_65_ > 255)
                                anLocalInt_65_ = 255;
                            aByteArray5230[anLocalInt_64_] = (byte) anLocalInt_65_;
                        }
                        if (anLocalInts.length > 0 && aGlInterleavedArray_5254 != null)
                            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                    }
                }
                if (aClass173Array5210 != null) {
                    for (int anLocalInt_66_ = 0; anInt5237 > anLocalInt_66_; anLocalInt_66_++) {
                        Class173 class173 = aClass173Array5210[anLocalInt_66_];
                        Class359 class359 = aClass359Array5246[anLocalInt_66_];
                        ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & 0xffffff | -((aByteArray5230[((Class173) class173).anInt1282]) & 0xff) + 255 << 24);
                    }
                }
            }
        } else if (argument_0_ == 7) {
            if (anIntArrayArray5228 != null) {
                for (int anLocalInt_67_ = 0; anLocalInt_67_ < anLocalInt; anLocalInt_67_++) {
                    int anLocalInt_68_ = argument_1_[anLocalInt_67_];
                    if (anLocalInt_68_ < anIntArrayArray5228.length) {
                        int[] anLocalInts = anIntArrayArray5228[anLocalInt_68_];
                        for (int anLocalInt_69_ = 0; anLocalInt_69_ < anLocalInts.length; anLocalInt_69_++) {
                            int anLocalInt_70_ = anLocalInts[anLocalInt_69_];
                            int anLocalInt_71_ = aShortArray5212[anLocalInt_70_] & 0xffff;
                            int anLocalInt_72_ = anLocalInt_71_ >> 10 & 0x3f;
                            int anLocalInt_73_ = anLocalInt_71_ >> 7 & 0x7;
                            int anLocalInt_74_ = anLocalInt_71_ & 0x7f;
                            anLocalInt_72_ = argument_2_ + anLocalInt_72_ & 0x3f;
                            anLocalInt_73_ += argument_3_ / 4;
                            anLocalInt_74_ += argument_4_;
                            if (anLocalInt_73_ < 0)
                                anLocalInt_73_ = 0;
                            else if (anLocalInt_73_ > 7)
                                anLocalInt_73_ = 7;
                            if (anLocalInt_74_ < 0)
                                anLocalInt_74_ = 0;
                            else if (anLocalInt_74_ > 127)
                                anLocalInt_74_ = 127;
                            aShortArray5212[anLocalInt_70_] = (short) (MathStatics.OR(anLocalInt_74_, (MathStatics.OR(anLocalInt_72_ << 10, anLocalInt_73_ << 7))));
                        }
                        if (anLocalInts.length > 0 && aGlInterleavedArray_5254 != null)
                            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                    }
                }
                if (aClass173Array5210 != null) {
                    for (int anLocalInt_75_ = 0; anLocalInt_75_ < anInt5237; anLocalInt_75_++) {
                        Class173 class173 = aClass173Array5210[anLocalInt_75_];
                        Class359 class359 = aClass359Array5246[anLocalInt_75_];
                        ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & ~0xffffff | ((HslToRgb.table[aShortArray5212[(((Class173) class173).anInt1282)] & 0xffff]) & 0xffffff));
                    }
                }
            }
        } else if (argument_0_ == 8) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_76_ = 0; anLocalInt_76_ < anLocalInt; anLocalInt_76_++) {
                    int anLocalInt_77_ = argument_1_[anLocalInt_76_];
                    if (anIntArrayArray5227.length > anLocalInt_77_) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_77_];
                        for (int anLocalInt_78_ = 0; anLocalInt_78_ < anLocalInts.length; anLocalInt_78_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_78_]]);
                            ((Class359) class359).anInt3043 += argument_3_;
                            ((Class359) class359).anInt3039 += argument_2_;
                        }
                    }
                }
            }
        } else if (argument_0_ == 10) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_79_ = 0; anLocalInt_79_ < anLocalInt; anLocalInt_79_++) {
                    int anLocalInt_80_ = argument_1_[anLocalInt_79_];
                    if (anLocalInt_80_ < anIntArrayArray5227.length) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_80_];
                        for (int anLocalInt_81_ = 0; anLocalInts.length > anLocalInt_81_; anLocalInt_81_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_81_]]);
                            ((Class359) class359).anInt3036 = (((Class359) class359).anInt3036 * argument_2_) >> 7;
                            ((Class359) class359).anInt3041 = (((Class359) class359).anInt3041 * argument_3_) >> 7;
                        }
                    }
                }
            }
        } else if (argument_0_ == 9) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_82_ = 0; anLocalInt_82_ < anLocalInt; anLocalInt_82_++) {
                    int anLocalInt_83_ = argument_1_[anLocalInt_82_];
                    if (anIntArrayArray5227.length > anLocalInt_83_) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_83_];
                        for (int anLocalInt_84_ = 0; anLocalInt_84_ < anLocalInts.length; anLocalInt_84_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_84_]]);
                            ((Class359) class359).anInt3040 = (((Class359) class359).anInt3040 + argument_2_) & 0x3fff;
                        }
                    }
                }
            }
        }
    }

    final boolean method2645(int argument_85_, int argument_86_, Class350 argument_87_, boolean argument_88_, int argument_89_) {
        return method2716(argument_88_, argument_86_, -1, (byte) -114, argument_85_, argument_89_, argument_87_);
    }

    final Class167 method2651(byte argument_90_, int argument_91_, boolean argument_92_) {
        Class167_Sub3 class167_sub3;
        Class167_Sub3 class167_sub3_93_;
        if (argument_90_ == 1) {
            class167_sub3_93_ = ((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4928;
            class167_sub3 = ((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4987;
        } else if (argument_90_ != 2) {
            if (argument_90_ == 3) {
                class167_sub3 = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4962);
                class167_sub3_93_ = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4985);
            } else if (argument_90_ == 4) {
                class167_sub3_93_ = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4958);
                class167_sub3 = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4910);
            } else if (argument_90_ == 5) {
                class167_sub3 = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4912);
                class167_sub3_93_ = (((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4919);
            } else
                class167_sub3_93_ = class167_sub3 = new Class167_Sub3(aClass_ha_Sub3_5257);
        } else {
            class167_sub3 = ((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4973;
            class167_sub3_93_ = ((GlToolkit) aClass_ha_Sub3_5257).aClass167_Sub3_4925;
        }
        return method2724(class167_sub3, argument_92_, class167_sub3_93_, argument_90_ != 0, 8, argument_91_);
    }

    final boolean r() {
        return aBoolean5264;
    }

    final void v() {
        for (int anLocalInt = 0; anInt5211 > anLocalInt; anLocalInt++)
            anIntArray5216[anLocalInt] = -anIntArray5216[anLocalInt];
        for (int anLocalInt = 0; anLocalInt < anInt5268; anLocalInt++)
            aShortArray5239[anLocalInt] = (short) -aShortArray5239[anLocalInt];
        for (int anLocalInt = 0; anInt5245 > anLocalInt; anLocalInt++) {
            short anLocalInt_94_ = aShortArray5250[anLocalInt];
            aShortArray5250[anLocalInt] = aShortArray5223[anLocalInt];
            aShortArray5223[anLocalInt] = anLocalInt_94_;
        }
        if (aGlInterleavedArray_5236 == null && aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
        if (aGlInterleavedArray_5236 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
        if (aClass121_5249 != null)
            ((Class121) aClass121_5249).anGlElementBuffer_982 = null;
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        aBoolean5247 = false;
    }

    final void O(int argument_95_, int argument_96_, int argument_97_) {
        for (int anLocalInt = 0; anLocalInt < anInt5211; anLocalInt++) {
            if (argument_95_ != 128)
                anIntArray5255[anLocalInt] = anIntArray5255[anLocalInt] * argument_95_ >> 7;
            if (argument_96_ != 128)
                anIntArray5267[anLocalInt] = argument_96_ * anIntArray5267[anLocalInt] >> 7;
            if (argument_97_ != 128)
                anIntArray5216[anLocalInt] = argument_97_ * anIntArray5216[anLocalInt] >> 7;
        }
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        aBoolean5247 = false;
    }

    final boolean F() {
        return aBoolean5217;
    }

    final void method2643(Class350 argument_98_, int argument_99_, boolean argument_100_) {
        if (aShortArray5215 != null) {
            int[] anLocalInts = new int[3];
            for (int anLocalInt = 0; anInt5211 > anLocalInt; anLocalInt++) {
                if ((aShortArray5215[anLocalInt] & argument_99_) != 0) {
                    if (argument_100_)
                        argument_98_.method3831(anIntArray5255[anLocalInt], anIntArray5267[anLocalInt], anIntArray5216[anLocalInt], anLocalInts);
                    else
                        argument_98_.method3829(anIntArray5255[anLocalInt], anIntArray5267[anLocalInt], anIntArray5216[anLocalInt], anLocalInts);
                    anIntArray5255[anLocalInt] = anLocalInts[0];
                    anIntArray5267[anLocalInt] = anLocalInts[1];
                    anIntArray5216[anLocalInt] = anLocalInts[2];
                }
            }
        }
    }

    final int HA() {
        if (!aBoolean5247)
            method2718(-100);
        return aShort5269;
    }

    final int da() {
        return aShort5232;
    }

    private final boolean method2716(boolean argument_101_, int argument_102_, int argument_103_, byte argument_104_, int argument_105_, int argument_106_, Class350 argument_107_) {
        Class350_Sub3 class350_sub3 = (Class350_Sub3) argument_107_;
        Class350_Sub3 class350_sub3_108_ = ((GlToolkit) aClass_ha_Sub3_5257).aClass350_Sub3_4881;
        float f = ((((Class350_Sub3) class350_sub3_108_).aFloat5460 * ((Class350_Sub3) class350_sub3).aFloat5467) + (((Class350_Sub3) class350_sub3).aFloat5459 * ((Class350_Sub3) class350_sub3_108_).aFloat5458) + (((Class350_Sub3) class350_sub3_108_).aFloat5463 * ((Class350_Sub3) class350_sub3).aFloat5462) + ((Class350_Sub3) class350_sub3_108_).aFloat5459);
        float f_109_ = ((((Class350_Sub3) class350_sub3).aFloat5462 * ((Class350_Sub3) class350_sub3_108_).aFloat5466) + ((((Class350_Sub3) class350_sub3_108_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5467) + (((Class350_Sub3) class350_sub3).aFloat5459 * ((Class350_Sub3) class350_sub3_108_).aFloat5457)) + ((Class350_Sub3) class350_sub3_108_).aFloat5467);
        Class347.aFloat3598 = ((((Class350_Sub3) class350_sub3_108_).aFloat5460 * ((Class350_Sub3) class350_sub3).aFloat5466) + (((Class350_Sub3) class350_sub3).aFloat5463 * ((Class350_Sub3) class350_sub3_108_).aFloat5458) + (((Class350_Sub3) class350_sub3).aFloat5461 * ((Class350_Sub3) class350_sub3_108_).aFloat5463));
        Statics.aFloat6387 = ((((Class350_Sub3) class350_sub3).aFloat5465 * ((Class350_Sub3) class350_sub3_108_).aFloat5466) + ((((Class350_Sub3) class350_sub3).aFloat5456 * ((Class350_Sub3) class350_sub3_108_).aFloat5456) + (((Class350_Sub3) class350_sub3).aFloat5460 * ((Class350_Sub3) class350_sub3_108_).aFloat5457)));
        float f_110_ = (((Class350_Sub3) class350_sub3_108_).aFloat5462 + ((((Class350_Sub3) class350_sub3_108_).aFloat5461 * ((Class350_Sub3) class350_sub3).aFloat5462) + ((((Class350_Sub3) class350_sub3_108_).aFloat5465 * ((Class350_Sub3) class350_sub3).aFloat5467) + (((Class350_Sub3) class350_sub3_108_).aFloat5455 * ((Class350_Sub3) class350_sub3).aFloat5459))));
        Class307_Sub1.aFloat5415 = ((((Class350_Sub3) class350_sub3_108_).aFloat5458 * ((Class350_Sub3) class350_sub3).aFloat5458) + (((Class350_Sub3) class350_sub3).aFloat5457 * ((Class350_Sub3) class350_sub3_108_).aFloat5460) + (((Class350_Sub3) class350_sub3_108_).aFloat5463 * ((Class350_Sub3) class350_sub3).aFloat5455));
        Class140.aFloat1093 = ((((Class350_Sub3) class350_sub3).aFloat5461 * ((Class350_Sub3) class350_sub3_108_).aFloat5466) + ((((Class350_Sub3) class350_sub3_108_).aFloat5457 * ((Class350_Sub3) class350_sub3).aFloat5463) + (((Class350_Sub3) class350_sub3_108_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5466)));
        Class48.aFloat349 = ((((Class350_Sub3) class350_sub3_108_).aFloat5461 * ((Class350_Sub3) class350_sub3).aFloat5465) + ((((Class350_Sub3) class350_sub3_108_).aFloat5465 * ((Class350_Sub3) class350_sub3).aFloat5456) + (((Class350_Sub3) class350_sub3).aFloat5460 * ((Class350_Sub3) class350_sub3_108_).aFloat5455)));
        DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677 = ((((Class350_Sub3) class350_sub3_108_).aFloat5461 * ((Class350_Sub3) class350_sub3).aFloat5455) + ((((Class350_Sub3) class350_sub3).aFloat5457 * ((Class350_Sub3) class350_sub3_108_).aFloat5465) + (((Class350_Sub3) class350_sub3_108_).aFloat5455 * ((Class350_Sub3) class350_sub3).aFloat5458)));
        Class373.aFloat3200 = ((((Class350_Sub3) class350_sub3_108_).aFloat5463 * ((Class350_Sub3) class350_sub3).aFloat5465) + ((((Class350_Sub3) class350_sub3).aFloat5460 * ((Class350_Sub3) class350_sub3_108_).aFloat5458) + (((Class350_Sub3) class350_sub3_108_).aFloat5460 * ((Class350_Sub3) class350_sub3).aFloat5456)));
        Class4.aFloat59 = ((((Class350_Sub3) class350_sub3_108_).aFloat5461 * ((Class350_Sub3) class350_sub3).aFloat5461) + ((((Class350_Sub3) class350_sub3).aFloat5463 * ((Class350_Sub3) class350_sub3_108_).aFloat5455) + (((Class350_Sub3) class350_sub3_108_).aFloat5465 * ((Class350_Sub3) class350_sub3).aFloat5466)));
        Class225.aFloat1633 = ((((Class350_Sub3) class350_sub3_108_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5457) + (((Class350_Sub3) class350_sub3_108_).aFloat5457 * ((Class350_Sub3) class350_sub3).aFloat5458) + (((Class350_Sub3) class350_sub3_108_).aFloat5466 * ((Class350_Sub3) class350_sub3).aFloat5455));
        boolean anLocalBoolean = false;
        float f_111_ = 3.4028235E38F;
        float f_112_ = -3.4028235E38F;
        float f_113_ = 3.4028235E38F;
        float f_114_ = -3.4028235E38F;
        int anLocalInt = ((GlToolkit) aClass_ha_Sub3_5257).anInt4900;
        int anLocalInt_115_ = ((GlToolkit) aClass_ha_Sub3_5257).anInt4956;
        if (!aBoolean5247)
            method2718(-109);
        int anLocalInt_116_ = aShort5229 - aShort5242 >> 1;
        int anLocalInt_117_ = aShort5222 - aShort5208 >> 1;
        int anLocalInt_118_ = -aShort5269 + aShort5235 >> 1;
        int anLocalInt_119_ = anLocalInt_116_ + aShort5242;
        int anLocalInt_120_ = aShort5208 + anLocalInt_117_;
        int anLocalInt_121_ = anLocalInt_118_ + aShort5269;
        int anLocalInt_122_ = -(anLocalInt_116_ << argument_106_) + anLocalInt_119_;
        int anLocalInt_123_ = anLocalInt_120_ - (anLocalInt_117_ << argument_106_);
        if (argument_104_ != -114)
            return false;
        int anLocalInt_124_ = -(anLocalInt_118_ << argument_106_) + anLocalInt_121_;
        int anLocalInt_125_ = anLocalInt_119_ + (anLocalInt_116_ << argument_106_);
        int anLocalInt_126_ = (anLocalInt_117_ << argument_106_) + anLocalInt_120_;
        Class101.anIntArray788[0] = anLocalInt_122_;
        int anLocalInt_127_ = (anLocalInt_118_ << argument_106_) + anLocalInt_121_;
        Class107.anIntArray875[0] = anLocalInt_123_;
        Class62_Sub15.anIntArray4413[0] = anLocalInt_124_;
        Class101.anIntArray788[1] = anLocalInt_125_;
        Class107.anIntArray875[1] = anLocalInt_123_;
        Class62_Sub15.anIntArray4413[1] = anLocalInt_124_;
        Class101.anIntArray788[2] = anLocalInt_122_;
        Class107.anIntArray875[2] = anLocalInt_126_;
        Class62_Sub15.anIntArray4413[2] = anLocalInt_124_;
        Class101.anIntArray788[3] = anLocalInt_125_;
        Class107.anIntArray875[3] = anLocalInt_126_;
        Class101.anIntArray788[4] = anLocalInt_122_;
        Class62_Sub15.anIntArray4413[3] = anLocalInt_124_;
        Class107.anIntArray875[4] = anLocalInt_123_;
        Class62_Sub15.anIntArray4413[4] = anLocalInt_127_;
        Class101.anIntArray788[5] = anLocalInt_125_;
        Class107.anIntArray875[5] = anLocalInt_123_;
        Class101.anIntArray788[6] = anLocalInt_122_;
        Class62_Sub15.anIntArray4413[5] = anLocalInt_127_;
        Class107.anIntArray875[6] = anLocalInt_126_;
        Class62_Sub15.anIntArray4413[6] = anLocalInt_127_;
        Class101.anIntArray788[7] = anLocalInt_125_;
        Class107.anIntArray875[7] = anLocalInt_126_;
        Class62_Sub15.anIntArray4413[7] = anLocalInt_127_;
        for (int anLocalInt_128_ = 0; anLocalInt_128_ < 8; anLocalInt_128_++) {
            float f_129_ = (float) Class101.anIntArray788[anLocalInt_128_];
            float f_130_ = (float) Class62_Sub15.anIntArray4413[anLocalInt_128_];
            float f_131_ = (float) Class107.anIntArray875[anLocalInt_128_];
            float f_132_ = f + (f_131_ * Class373.aFloat3200 + Class307_Sub1.aFloat5415 * f_129_ + f_130_ * Class347.aFloat3598);
            float f_133_ = (Class140.aFloat1093 * f_130_ + (f_129_ * Class225.aFloat1633 + Statics.aFloat6387 * f_131_) + f_109_);
            float f_134_ = (f_110_ + (Class4.aFloat59 * f_130_ + (Class48.aFloat349 * f_131_ + f_129_ * DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677)));
            if ((float) ((GlToolkit) aClass_ha_Sub3_5257).anInt4920 <= f_134_) {
                if (argument_103_ > 0)
                    f_134_ = (float) argument_103_;
                float f_135_ = ((float) ((GlToolkit) aClass_ha_Sub3_5257).anInt4993 + (float) anLocalInt * f_132_ / f_134_);
                if (f_135_ < f_111_)
                    f_111_ = f_135_;
                float f_136_ = ((float) ((GlToolkit) aClass_ha_Sub3_5257).anInt4972 + f_133_ * (float) anLocalInt_115_ / f_134_);
                if (f_135_ > f_112_)
                    f_112_ = f_135_;
                if (f_136_ < f_113_)
                    f_113_ = f_136_;
                anLocalBoolean = true;
                if (f_114_ < f_136_)
                    f_114_ = f_136_;
            }
        }
        if (anLocalBoolean && f_111_ < (float) argument_105_ && (float) argument_105_ < f_112_ && f_113_ < (float) argument_102_ && f_114_ > (float) argument_102_) {
            if (argument_101_)
                return true;
            if (((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997.length < anInt5268) {
                ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997 = new int[anInt5268];
                ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4999 = new int[anInt5268];
            }
            int[] anLocalInts = ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997;
            int[] anLocalInts_137_ = ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4999;
            for (int anLocalInt_138_ = 0; anLocalInt_138_ < anInt5211; anLocalInt_138_++) {
                float f_139_ = (float) anIntArray5267[anLocalInt_138_];
                float f_140_ = (float) anIntArray5255[anLocalInt_138_];
                float f_141_ = (float) anIntArray5216[anLocalInt_138_];
                float f_142_ = (Class4.aFloat59 * f_141_ + (Class48.aFloat349 * f_139_ + DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677 * f_140_) + f_110_);
                float f_143_ = (Class307_Sub1.aFloat5415 * f_140_ + Class373.aFloat3200 * f_139_ + Class347.aFloat3598 * f_141_ + f);
                float f_144_ = f_109_ + (f_139_ * Statics.aFloat6387 + f_140_ * Class225.aFloat1633 + Class140.aFloat1093 * f_141_);
                if (f_142_ >= (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4920)) {
                    if (argument_103_ > 0)
                        f_142_ = (float) argument_103_;
                    int anLocalInt_145_ = (int) ((float) anLocalInt * f_143_ / f_142_ + (float) ((GlToolkit) aClass_ha_Sub3_5257).anInt4993);
                    int anLocalInt_146_ = (int) ((float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4972) + f_144_ * (float) anLocalInt_115_ / f_142_);
                    int anLocalInt_147_ = anIntArray5260[anLocalInt_138_];
                    int anLocalInt_148_ = anIntArray5260[anLocalInt_138_ + 1];
                    for (int anLocalInt_149_ = anLocalInt_147_; anLocalInt_148_ > anLocalInt_149_; anLocalInt_149_++) {
                        int anLocalInt_150_ = aShortArray5248[anLocalInt_149_] - 1;
                        if (anLocalInt_150_ == -1)
                            break;
                        anLocalInts[anLocalInt_150_] = anLocalInt_145_;
                        anLocalInts_137_[anLocalInt_150_] = anLocalInt_146_;
                    }
                } else {
                    int anLocalInt_151_ = anIntArray5260[anLocalInt_138_];
                    int anLocalInt_152_ = anIntArray5260[anLocalInt_138_ + 1];
                    for (int anLocalInt_153_ = anLocalInt_151_; anLocalInt_153_ < anLocalInt_152_; anLocalInt_153_++) {
                        int anLocalInt_154_ = aShortArray5248[anLocalInt_153_] - 1;
                        if (anLocalInt_154_ == -1)
                            break;
                        anLocalInts[aShortArray5248[anLocalInt_153_] - 1] = -999999;
                    }
                }
            }
            for (int anLocalInt_155_ = 0; anInt5245 > anLocalInt_155_; anLocalInt_155_++) {
                if (anLocalInts[aShortArray5250[anLocalInt_155_]] != -999999 && anLocalInts[aShortArray5220[anLocalInt_155_]] != -999999 && anLocalInts[aShortArray5223[anLocalInt_155_]] != -999999 && (method2727(argument_105_, (byte) -115, anLocalInts_137_[aShortArray5250[anLocalInt_155_]], anLocalInts[aShortArray5220[anLocalInt_155_]], anLocalInts[aShortArray5223[anLocalInt_155_]], anLocalInts_137_[aShortArray5220[anLocalInt_155_]], argument_102_, anLocalInts[aShortArray5250[anLocalInt_155_]], anLocalInts_137_[aShortArray5223[anLocalInt_155_]])))
                    return true;
            }
        }
        return false;
    }

    final void FA(int argument_156_) {
        int anLocalInt = Node_Sub6.SINETABLE[argument_156_];
        int anLocalInt_157_ = Node_Sub6.COSINETABLE[argument_156_];
        for (int anLocalInt_158_ = 0; anLocalInt_158_ < anInt5211; anLocalInt_158_++) {
            int anLocalInt_159_ = ((anLocalInt_157_ * anIntArray5267[anLocalInt_158_] - anLocalInt * anIntArray5216[anLocalInt_158_]) >> 14);
            anIntArray5216[anLocalInt_158_] = (anLocalInt_157_ * anIntArray5216[anLocalInt_158_] + anLocalInt * anIntArray5267[anLocalInt_158_]) >> 14;
            anIntArray5267[anLocalInt_158_] = anLocalInt_159_;
        }
        aBoolean5247 = false;
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
    }

    final int na() {
        if (!aBoolean5247)
            method2718(-57);
        return aShort5265;
    }

    final void VA(int argument_160_) {
        int anLocalInt = Node_Sub6.SINETABLE[argument_160_];
        int anLocalInt_161_ = Node_Sub6.COSINETABLE[argument_160_];
        for (int anLocalInt_162_ = 0; anInt5211 > anLocalInt_162_; anLocalInt_162_++) {
            int anLocalInt_163_ = ((anIntArray5255[anLocalInt_162_] * anLocalInt_161_ + anLocalInt * anIntArray5267[anLocalInt_162_]) >> 14);
            anIntArray5267[anLocalInt_162_] = (anLocalInt_161_ * anIntArray5267[anLocalInt_162_] - anIntArray5255[anLocalInt_162_] * anLocalInt) >> 14;
            anIntArray5255[anLocalInt_162_] = anLocalInt_163_;
        }
        aBoolean5247 = false;
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
    }

    final boolean NA() {
        if (anIntArrayArray5244 == null)
            return false;
        for (int anLocalInt = 0; anLocalInt < anInt5224; anLocalInt++) {
            anIntArray5255[anLocalInt] <<= 4;
            anIntArray5267[anLocalInt] <<= 4;
            anIntArray5216[anLocalInt] <<= 4;
        }
        Node_Sub31_Sub23.anInt5945 = 0;
        Class62_Sub16.anInt4415 = 0;
        Node_Sub47_Sub8.anInt6194 = 0;
        return true;
    }

    final void s(int argument_164_) {
        anInt5218 = argument_164_;
        if (aClass317_5259 != null && (anInt5218 & 0x10000) == 0) {
            aByteArray5253 = ((Class317) aClass317_5259).aByteArray2618;
            aShortArray5219 = ((Class317) aClass317_5259).aShortArray2621;
            aShortArray5233 = ((Class317) aClass317_5259).aShortArray2622;
            aShortArray5239 = ((Class317) aClass317_5259).aShortArray2620;
            aClass317_5259 = null;
        }
        aBoolean5226 = true;
        method2723(true);
    }

    final boolean method2637(int argument_165_, int argument_166_, Class350 argument_167_, boolean argument_168_, int argument_169_, int argument_170_) {
        return method2716(argument_168_, argument_166_, argument_170_, (byte) -114, argument_165_, argument_169_, argument_167_);
    }

    final Class185[] method2655() {
        return aClass185Array5243;
    }

    private final void method2717(int argument_171_) {
        if (anInt5213 != 0) {
            if (aByte5252 != 0)
                method2725((byte) 49, true);
            if (argument_171_ != 1559402986)
                method2725((byte) 33, true);
            method2725((byte) 124, false);
            if (aClass121_5249 != null) {
                if (((Class121) aClass121_5249).anGlElementBuffer_982 == null)
                    method2720((aByte5252 & 0x10) != 0, (byte) 107);
                if (((Class121) aClass121_5249).anGlElementBuffer_982 != null) {
                    aClass_ha_Sub3_5257.setLightingEnabled(aGlInterleavedArray_5236 != null);
                    aClass_ha_Sub3_5257.bindArrays(aGlInterleavedArray_5236, aGlInterleavedArray_5254, aGlInterleavedArray_5241, aGlInterleavedArray_5225);
                    int anLocalInt = anIntArray5266.length - 1;
                    for (int anLocalInt_172_ = 0; anLocalInt > anLocalInt_172_; anLocalInt_172_++) {
                        int anLocalInt_173_ = anIntArray5266[anLocalInt_172_];
                        int anLocalInt_174_ = anIntArray5266[anLocalInt_172_ + 1];
                        int anLocalInt_175_ = aShortArray5238[anLocalInt_173_] & 0xffff;
                        if (anLocalInt_175_ == 65535)
                            anLocalInt_175_ = -1;
                        aClass_ha_Sub3_5257.method2307(aGlInterleavedArray_5236 != null, anLocalInt_175_);
                        aClass_ha_Sub3_5257.drawElements(((Class121) aClass121_5249).anGlElementBuffer_982, (anLocalInt_174_ - anLocalInt_173_) * 3, 4, anLocalInt_173_ * 3);
                    }
                }
            }
            method2723(true);
        }
    }

    final int ua() {
        return anInt5218;
    }

    final void P(int argument_176_, int argument_177_, int argument_178_, int argument_179_) {
        if (argument_176_ == 0) {
            Node_Sub31_Sub23.anInt5945 = 0;
            int anLocalInt = 0;
            Class62_Sub16.anInt4415 = 0;
            Node_Sub47_Sub8.anInt6194 = 0;
            for (int anLocalInt_180_ = 0; anInt5211 > anLocalInt_180_; anLocalInt_180_++) {
                Node_Sub31_Sub23.anInt5945 += anIntArray5255[anLocalInt_180_];
                Node_Sub47_Sub8.anInt6194 += anIntArray5267[anLocalInt_180_];
                Class62_Sub16.anInt4415 += anIntArray5216[anLocalInt_180_];
                anLocalInt++;
            }
            if (anLocalInt <= 0) {
                Node_Sub31_Sub23.anInt5945 = argument_177_;
                Node_Sub47_Sub8.anInt6194 = argument_178_;
                Class62_Sub16.anInt4415 = argument_179_;
            } else {
                Node_Sub31_Sub23.anInt5945 = (argument_177_ + Node_Sub31_Sub23.anInt5945 / anLocalInt);
                Node_Sub47_Sub8.anInt6194 = (Node_Sub47_Sub8.anInt6194 / anLocalInt + argument_178_);
                Class62_Sub16.anInt4415 = Class62_Sub16.anInt4415 / anLocalInt + argument_179_;
            }
        } else if (argument_176_ == 1) {
            for (int anLocalInt = 0; anInt5211 > anLocalInt; anLocalInt++) {
                anIntArray5255[anLocalInt] += argument_177_;
                anIntArray5267[anLocalInt] += argument_178_;
                anIntArray5216[anLocalInt] += argument_179_;
            }
        } else if (argument_176_ == 2) {
            for (int anLocalInt = 0; anInt5211 > anLocalInt; anLocalInt++) {
                anIntArray5255[anLocalInt] -= Node_Sub31_Sub23.anInt5945;
                anIntArray5267[anLocalInt] -= Node_Sub47_Sub8.anInt6194;
                anIntArray5216[anLocalInt] -= Class62_Sub16.anInt4415;
                if (argument_179_ != 0) {
                    int anLocalInt_181_ = Node_Sub6.SINETABLE[argument_179_];
                    int anLocalInt_182_ = Node_Sub6.COSINETABLE[argument_179_];
                    int anLocalInt_183_ = ((anLocalInt_181_ * anIntArray5267[anLocalInt] + anLocalInt_182_ * anIntArray5255[anLocalInt] + 16383) >> 14);
                    anIntArray5267[anLocalInt] = (anLocalInt_182_ * anIntArray5267[anLocalInt] - anLocalInt_181_ * anIntArray5255[anLocalInt] + 16383) >> 14;
                    anIntArray5255[anLocalInt] = anLocalInt_183_;
                }
                if (argument_177_ != 0) {
                    int anLocalInt_184_ = Node_Sub6.SINETABLE[argument_177_];
                    int anLocalInt_185_ = Node_Sub6.COSINETABLE[argument_177_];
                    int anLocalInt_186_ = ((-(anLocalInt_184_ * anIntArray5216[anLocalInt]) + anLocalInt_185_ * anIntArray5267[anLocalInt] + 16383) >> 14);
                    anIntArray5216[anLocalInt] = (anIntArray5216[anLocalInt] * anLocalInt_185_ + anLocalInt_184_ * anIntArray5267[anLocalInt] + 16383) >> 14;
                    anIntArray5267[anLocalInt] = anLocalInt_186_;
                }
                if (argument_178_ != 0) {
                    int anLocalInt_187_ = Node_Sub6.SINETABLE[argument_178_];
                    int anLocalInt_188_ = Node_Sub6.COSINETABLE[argument_178_];
                    int anLocalInt_189_ = ((anIntArray5255[anLocalInt] * anLocalInt_188_ + anLocalInt_187_ * anIntArray5216[anLocalInt] + 16383) >> 14);
                    anIntArray5216[anLocalInt] = (anLocalInt_188_ * anIntArray5216[anLocalInt] - anLocalInt_187_ * anIntArray5255[anLocalInt] + 16383) >> 14;
                    anIntArray5255[anLocalInt] = anLocalInt_189_;
                }
                anIntArray5255[anLocalInt] += Node_Sub31_Sub23.anInt5945;
                anIntArray5267[anLocalInt] += Node_Sub47_Sub8.anInt6194;
                anIntArray5216[anLocalInt] += Class62_Sub16.anInt4415;
            }
        } else if (argument_176_ == 3) {
            for (int anLocalInt = 0; anLocalInt < anInt5211; anLocalInt++) {
                anIntArray5255[anLocalInt] -= Node_Sub31_Sub23.anInt5945;
                anIntArray5267[anLocalInt] -= Node_Sub47_Sub8.anInt6194;
                anIntArray5216[anLocalInt] -= Class62_Sub16.anInt4415;
                anIntArray5255[anLocalInt] = anIntArray5255[anLocalInt] * argument_177_ / 128;
                anIntArray5267[anLocalInt] = anIntArray5267[anLocalInt] * argument_178_ / 128;
                anIntArray5216[anLocalInt] = argument_179_ * anIntArray5216[anLocalInt] / 128;
                anIntArray5255[anLocalInt] += Node_Sub31_Sub23.anInt5945;
                anIntArray5267[anLocalInt] += Node_Sub47_Sub8.anInt6194;
                anIntArray5216[anLocalInt] += Class62_Sub16.anInt4415;
            }
        } else if (argument_176_ == 5) {
            for (int anLocalInt = 0; anInt5245 > anLocalInt; anLocalInt++) {
                int anLocalInt_190_ = argument_177_ * 8 + (aByteArray5230[anLocalInt] & 0xff);
                if (anLocalInt_190_ >= 0) {
                    if (anLocalInt_190_ > 255)
                        anLocalInt_190_ = 255;
                } else
                    anLocalInt_190_ = 0;
                aByteArray5230[anLocalInt] = (byte) anLocalInt_190_;
            }
            if (aGlInterleavedArray_5254 != null)
                ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
            if (aClass173Array5210 != null) {
                for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++) {
                    Class173 class173 = aClass173Array5210[anLocalInt];
                    Class359 class359 = aClass359Array5246[anLocalInt];
                    ((Class359) class359).anInt3037 = (-(aByteArray5230[((Class173) class173).anInt1282] & 0xff) + 255 << 24 | ((Class359) class359).anInt3037 & 0xffffff);
                }
            }
        } else if (argument_176_ == 7) {
            for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++) {
                int anLocalInt_191_ = aShortArray5212[anLocalInt] & 0xffff;
                int anLocalInt_192_ = anLocalInt_191_ >> 10 & 0x3f;
                int anLocalInt_193_ = (anLocalInt_191_ & 0x3f3) >> 7;
                int anLocalInt_194_ = anLocalInt_191_ & 0x7f;
                anLocalInt_192_ = anLocalInt_192_ + argument_177_ & 0x3f;
                anLocalInt_193_ += argument_178_ / 4;
                if (anLocalInt_193_ >= 0) {
                    if (anLocalInt_193_ > 7)
                        anLocalInt_193_ = 7;
                } else
                    anLocalInt_193_ = 0;
                anLocalInt_194_ += argument_179_;
                if (anLocalInt_194_ >= 0) {
                    if (anLocalInt_194_ > 127)
                        anLocalInt_194_ = 127;
                } else
                    anLocalInt_194_ = 0;
                aShortArray5212[anLocalInt] = (short) (MathStatics.OR(anLocalInt_194_, MathStatics.OR((anLocalInt_193_ << 7), (anLocalInt_192_ << 10))));
            }
            if (aGlInterleavedArray_5254 != null)
                ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
            if (aClass173Array5210 != null) {
                for (int anLocalInt = 0; anLocalInt < anInt5237; anLocalInt++) {
                    Class173 class173 = aClass173Array5210[anLocalInt];
                    Class359 class359 = aClass359Array5246[anLocalInt];
                    ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & ~0xffffff | ((HslToRgb.table[(aShortArray5212[((Class173) class173).anInt1282]) & 0xffff]) & 0xffffff));
                }
            }
        } else if (argument_176_ == 8) {
            for (int anLocalInt = 0; anLocalInt < anInt5237; anLocalInt++) {
                Class359 class359 = aClass359Array5246[anLocalInt];
                ((Class359) class359).anInt3043 += argument_178_;
                ((Class359) class359).anInt3039 += argument_177_;
            }
        } else if (argument_176_ == 10) {
            for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++) {
                Class359 class359 = aClass359Array5246[anLocalInt];
                ((Class359) class359).anInt3041 = ((Class359) class359).anInt3041 * argument_178_ >> 7;
                ((Class359) class359).anInt3036 = argument_177_ * ((Class359) class359).anInt3036 >> 7;
            }
        } else if (argument_176_ == 9) {
            for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++) {
                Class359 class359 = aClass359Array5246[anLocalInt];
                ((Class359) class359).anInt3040 = argument_177_ + ((Class359) class359).anInt3040 & 0x3fff;
            }
        }
    }

    final void method2654() {
        /* empty */
    }

    final int ma() {
        if (!aBoolean5247)
            method2718(-107);
        return aShort5251;
    }

    final Class38[] method2641() {
        return aClass38Array5263;
    }

    final void method2649(int argument_195_, int argument_196_, int argument_197_, int argument_198_) {
        for (int anLocalInt = 0; anInt5245 > anLocalInt; anLocalInt++) {
            int anLocalInt_199_ = aShortArray5212[anLocalInt] & 0xffff;
            int anLocalInt_200_ = (anLocalInt_199_ & 0xfc54) >> 10;
            int anLocalInt_201_ = (anLocalInt_199_ & 0x3ac) >> 7;
            int anLocalInt_202_ = anLocalInt_199_ & 0x7f;
            if (argument_195_ != -1)
                anLocalInt_200_ = (argument_198_ * (-anLocalInt_200_ + argument_195_) >> 7) + anLocalInt_200_;
            if (argument_196_ != -1)
                anLocalInt_201_ = (((argument_196_ - anLocalInt_201_) * argument_198_ >> 7) + anLocalInt_201_);
            if (argument_197_ != -1)
                anLocalInt_202_ = (argument_198_ * (-anLocalInt_202_ + argument_197_) >> 7) + anLocalInt_202_;
            aShortArray5212[anLocalInt] = (short) (MathStatics.OR(anLocalInt_202_, MathStatics.OR(anLocalInt_201_ << 7, (anLocalInt_200_ << 10))));
        }
        if (aClass173Array5210 != null) {
            for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++) {
                Class173 class173 = aClass173Array5210[anLocalInt];
                Class359 class359 = aClass359Array5246[anLocalInt];
                ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & ~0xffffff | (HslToRgb.table[(aShortArray5212[((Class173) class173).anInt1282] & 0xffff)]) & 0xffffff);
            }
        }
        if (aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
    }

    final void method2652() {
        if (anInt5268 > 0 && anInt5213 > 0) {
            method2725((byte) 119, false);
            if ((aByte5252 & 0x10) == 0 && ((Class121) aClass121_5249).anGlElementBuffer_982 == null)
                method2720(false, (byte) 118);
            method2723(true);
        }
    }

    private final void method2718(int argument_203_) {
        int anLocalInt = 32767;
        int anLocalInt_204_ = 32767;
        int anLocalInt_205_ = 32767;
        int anLocalInt_206_ = -32768;
        int anLocalInt_207_ = -32768;
        int anLocalInt_208_ = -32768;
        if (argument_203_ > -26)
            anIntArrayArray5227 = null;
        int anLocalInt_209_ = 0;
        int anLocalInt_210_ = 0;
        for (int anLocalInt_211_ = 0; anLocalInt_211_ < anInt5211; anLocalInt_211_++) {
            int anLocalInt_212_ = anIntArray5255[anLocalInt_211_];
            int anLocalInt_213_ = anIntArray5267[anLocalInt_211_];
            int anLocalInt_214_ = anIntArray5216[anLocalInt_211_];
            if (anLocalInt_212_ > anLocalInt_206_)
                anLocalInt_206_ = anLocalInt_212_;
            if (anLocalInt_213_ > anLocalInt_207_)
                anLocalInt_207_ = anLocalInt_213_;
            if (anLocalInt_213_ < anLocalInt_204_)
                anLocalInt_204_ = anLocalInt_213_;
            if (anLocalInt > anLocalInt_212_)
                anLocalInt = anLocalInt_212_;
            if (anLocalInt_208_ < anLocalInt_214_)
                anLocalInt_208_ = anLocalInt_214_;
            if (anLocalInt_214_ < anLocalInt_205_)
                anLocalInt_205_ = anLocalInt_214_;
            int anLocalInt_215_ = (anLocalInt_212_ * anLocalInt_212_ + anLocalInt_214_ * anLocalInt_214_);
            if (anLocalInt_215_ > anLocalInt_209_)
                anLocalInt_209_ = anLocalInt_215_;
            anLocalInt_215_ = (anLocalInt_213_ * anLocalInt_213_ + (anLocalInt_214_ * anLocalInt_214_ + anLocalInt_212_ * anLocalInt_212_));
            if (anLocalInt_215_ > anLocalInt_210_)
                anLocalInt_210_ = anLocalInt_215_;
        }
        aShort5242 = (short) anLocalInt;
        aShort5269 = (short) anLocalInt_205_;
        aShort5222 = (short) anLocalInt_207_;
        aShort5208 = (short) anLocalInt_204_;
        aShort5235 = (short) anLocalInt_208_;
        aShort5229 = (short) anLocalInt_206_;
        aShort5265 = (short) (int) (Math.sqrt((double) anLocalInt_209_) + 0.99);
        aShort5251 = (short) (int) (Math.sqrt((double) anLocalInt_210_) + 0.99);
        aBoolean5247 = true;
    }

    final void LA(int argument_216_) {
        if (aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
        aShort5232 = (short) argument_216_;
        if (aGlInterleavedArray_5236 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
    }

    final void H(int argument_217_, int argument_218_, int argument_219_) {
        for (int anLocalInt = 0; anInt5211 > anLocalInt; anLocalInt++) {
            if (argument_217_ != 0)
                anIntArray5255[anLocalInt] += argument_217_;
            if (argument_218_ != 0)
                anIntArray5267[anLocalInt] += argument_218_;
            if (argument_219_ != 0)
                anIntArray5216[anLocalInt] += argument_219_;
        }
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        aBoolean5247 = false;
    }

    final void aa(short argument_220_, short argument_221_) {
        TextureSource textureSource = ((GraphicsToolkit) aClass_ha_Sub3_5257).textureSource;
        for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++) {
            if (aShortArray5238[anLocalInt] == argument_220_)
                aShortArray5238[anLocalInt] = argument_221_;
        }
        byte anLocalInt = 0;
        byte anLocalInt_222_ = 0;
        if (argument_220_ != -1) {
            TextureDescriptor textureDescriptor = textureSource.getDescriptor(argument_220_ & 0xffff, true);
            anLocalInt_222_ = ((TextureDescriptor) textureDescriptor).aByte828;
            anLocalInt = ((TextureDescriptor) textureDescriptor).aByte840;
        }
        byte anLocalInt_223_ = 0;
        byte anLocalInt_224_ = 0;
        if (argument_221_ != -1) {
            TextureDescriptor textureDescriptor = textureSource.getDescriptor(argument_221_ & 0xffff, true);
            if (((TextureDescriptor) textureDescriptor).aByte845 != 0 || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
                aBoolean5264 = true;
            anLocalInt_224_ = ((TextureDescriptor) textureDescriptor).aByte828;
            anLocalInt_223_ = ((TextureDescriptor) textureDescriptor).aByte840;
        }
        if (anLocalInt_224_ != anLocalInt_222_ | anLocalInt != anLocalInt_223_) {
            if (aClass173Array5210 != null) {
                for (int anLocalInt_225_ = 0; anLocalInt_225_ < anInt5237; anLocalInt_225_++) {
                    Class173 class173 = aClass173Array5210[anLocalInt_225_];
                    Class359 class359 = aClass359Array5246[anLocalInt_225_];
                    ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & ~0xffffff | ((HslToRgb.table[(aShortArray5212[((Class173) class173).anInt1282]) & 0xffff]) & 0xffffff));
                }
            }
            if (aGlInterleavedArray_5254 != null)
                ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
        }
    }

    final void method2660(Class167 argument_226_, int argument_227_, int argument_228_, int argument_229_, boolean argument_230_) {
        Class167_Sub3 class167_sub3 = (Class167_Sub3) argument_226_;
        if (anInt5245 != 0 && class167_sub3.anInt5245 != 0) {
            int anLocalInt = class167_sub3.anInt5211;
            int[] anLocalInts = class167_sub3.anIntArray5255;
            int[] anLocalInts_231_ = class167_sub3.anIntArray5267;
            int[] anLocalInts_232_ = class167_sub3.anIntArray5216;
            short[] anLocalInts_233_ = class167_sub3.aShortArray5233;
            short[] anLocalInts_234_ = class167_sub3.aShortArray5219;
            short[] anLocalInts_235_ = class167_sub3.aShortArray5239;
            byte[] anLocalInts_236_ = class167_sub3.aByteArray5253;
            short[] anLocalInts_237_;
            short[] anLocalInts_238_;
            short[] anLocalInts_239_;
            byte[] anLocalInts_240_;
            if (aClass317_5259 != null) {
                anLocalInts_238_ = ((Class317) aClass317_5259).aShortArray2620;
                anLocalInts_237_ = ((Class317) aClass317_5259).aShortArray2622;
                anLocalInts_240_ = ((Class317) aClass317_5259).aByteArray2618;
                anLocalInts_239_ = ((Class317) aClass317_5259).aShortArray2621;
            } else {
                anLocalInts_237_ = null;
                anLocalInts_238_ = null;
                anLocalInts_239_ = null;
                anLocalInts_240_ = null;
            }
            short[] anLocalInts_241_;
            short[] anLocalInts_242_;
            byte[] anLocalInts_243_;
            short[] anLocalInts_244_;
            if (class167_sub3.aClass317_5259 == null) {
                anLocalInts_241_ = null;
                anLocalInts_244_ = null;
                anLocalInts_242_ = null;
                anLocalInts_243_ = null;
            } else {
                anLocalInts_241_ = (((Class317) class167_sub3.aClass317_5259).aShortArray2622);
                anLocalInts_242_ = (((Class317) class167_sub3.aClass317_5259).aShortArray2620);
                anLocalInts_243_ = ((Class317) class167_sub3.aClass317_5259).aByteArray2618;
                anLocalInts_244_ = (((Class317) class167_sub3.aClass317_5259).aShortArray2621);
            }
            int[] anLocalInts_245_ = class167_sub3.anIntArray5260;
            short[] anLocalInts_246_ = class167_sub3.aShortArray5248;
            if (!class167_sub3.aBoolean5247)
                class167_sub3.method2718(-75);
            int anLocalInt_247_ = class167_sub3.aShort5208;
            int anLocalInt_248_ = class167_sub3.aShort5222;
            int anLocalInt_249_ = class167_sub3.aShort5242;
            int anLocalInt_250_ = class167_sub3.aShort5229;
            int anLocalInt_251_ = class167_sub3.aShort5269;
            int anLocalInt_252_ = class167_sub3.aShort5235;
            for (int anLocalInt_253_ = 0; anLocalInt_253_ < anInt5211; anLocalInt_253_++) {
                int anLocalInt_254_ = -argument_228_ + anIntArray5267[anLocalInt_253_];
                if (anLocalInt_254_ >= anLocalInt_247_ && anLocalInt_248_ >= anLocalInt_254_) {
                    int anLocalInt_255_ = anIntArray5255[anLocalInt_253_] - argument_227_;
                    if (anLocalInt_249_ <= anLocalInt_255_ && anLocalInt_250_ >= anLocalInt_255_) {
                        int anLocalInt_256_ = -argument_229_ + anIntArray5216[anLocalInt_253_];
                        if (anLocalInt_256_ >= anLocalInt_251_ && anLocalInt_256_ <= anLocalInt_252_) {
                            int anLocalInt_257_ = -1;
                            int anLocalInt_258_ = anIntArray5260[anLocalInt_253_];
                            int anLocalInt_259_ = anIntArray5260[anLocalInt_253_ + 1];
                            for (int anLocalInt_260_ = anLocalInt_258_; anLocalInt_260_ < anLocalInt_259_; anLocalInt_260_++) {
                                anLocalInt_257_ = aShortArray5248[anLocalInt_260_] - 1;
                                if (anLocalInt_257_ == -1 || aByteArray5253[anLocalInt_257_] != 0)
                                    break;
                            }
                            if (anLocalInt_257_ != -1) {
                                for (int anLocalInt_261_ = 0; anLocalInt_261_ < anLocalInt; anLocalInt_261_++) {
                                    if ((anLocalInt_255_ == anLocalInts[anLocalInt_261_]) && (anLocalInt_256_ == (anLocalInts_232_[anLocalInt_261_])) && (anLocalInts_231_[anLocalInt_261_] == anLocalInt_254_)) {
                                        anLocalInt_259_ = (anLocalInts_245_[anLocalInt_261_ + 1]);
                                        anLocalInt_258_ = (anLocalInts_245_[anLocalInt_261_]);
                                        int anLocalInt_262_ = -1;
                                        for (int anLocalInt_263_ = anLocalInt_258_; anLocalInt_259_ > anLocalInt_263_; anLocalInt_263_++) {
                                            anLocalInt_262_ = (anLocalInts_246_[anLocalInt_263_]) - 1;
                                            if (anLocalInt_262_ == -1 || (anLocalInts_236_[anLocalInt_262_]) != 0)
                                                break;
                                        }
                                        if (anLocalInt_262_ != -1) {
                                            if (anLocalInts_237_ == null) {
                                                aClass317_5259 = new Class317();
                                                anLocalInts_237_ = ((Class317) aClass317_5259).aShortArray2622 = (Class46.method433(-29647, aShortArray5233));
                                                anLocalInts_239_ = ((Class317) aClass317_5259).aShortArray2621 = (Class46.method433(-29647, aShortArray5219));
                                                anLocalInts_238_ = ((Class317) aClass317_5259).aShortArray2620 = (Class46.method433(-29647, aShortArray5239));
                                                anLocalInts_240_ = ((Class317) aClass317_5259).aByteArray2618 = (Class37.method388(false, aByteArray5253));
                                            }
                                            if (anLocalInts_241_ == null) {
                                                Class317 class317 = (class167_sub3.aClass317_5259 = new Class317());
                                                anLocalInts_241_ = ((Class317) class317).aShortArray2622 = (Class46.method433(-29647, anLocalInts_233_));
                                                anLocalInts_244_ = ((Class317) class317).aShortArray2621 = (Class46.method433(-29647, anLocalInts_234_));
                                                anLocalInts_242_ = ((Class317) class317).aShortArray2620 = (Class46.method433(-29647, anLocalInts_235_));
                                                anLocalInts_243_ = ((Class317) class317).aByteArray2618 = (Class37.method388(false, anLocalInts_236_));
                                            }
                                            short anLocalInt_264_ = (aShortArray5233[anLocalInt_257_]);
                                            short anLocalInt_265_ = (aShortArray5219[anLocalInt_257_]);
                                            short anLocalInt_266_ = (aShortArray5239[anLocalInt_257_]);
                                            byte anLocalInt_267_ = (aByteArray5253[anLocalInt_257_]);
                                            anLocalInt_259_ = (anLocalInts_245_[anLocalInt_261_ + 1]);
                                            anLocalInt_258_ = (anLocalInts_245_[anLocalInt_261_]);
                                            for (int anLocalInt_268_ = anLocalInt_258_; (anLocalInt_259_ > anLocalInt_268_); anLocalInt_268_++) {
                                                int anLocalInt_269_ = ((anLocalInts_246_[anLocalInt_268_]) - 1);
                                                if (anLocalInt_269_ == -1)
                                                    break;
                                                if ((anLocalInts_243_[anLocalInt_269_]) != 0) {
                                                    anLocalInts_241_[anLocalInt_269_] += anLocalInt_264_;
                                                    anLocalInts_244_[anLocalInt_269_] += anLocalInt_265_;
                                                    anLocalInts_242_[anLocalInt_269_] += anLocalInt_266_;
                                                    anLocalInts_243_[anLocalInt_269_] += anLocalInt_267_;
                                                }
                                            }
                                            anLocalInt_266_ = (anLocalInts_235_[anLocalInt_262_]);
                                            anLocalInt_265_ = (anLocalInts_234_[anLocalInt_262_]);
                                            anLocalInt_259_ = (anIntArray5260[anLocalInt_253_ + 1]);
                                            anLocalInt_258_ = (anIntArray5260[anLocalInt_253_]);
                                            anLocalInt_264_ = (anLocalInts_233_[anLocalInt_262_]);
                                            anLocalInt_267_ = (anLocalInts_236_[anLocalInt_262_]);
                                            for (int anLocalInt_270_ = anLocalInt_258_; (anLocalInt_270_ < anLocalInt_259_); anLocalInt_270_++) {
                                                int anLocalInt_271_ = ((aShortArray5248[anLocalInt_270_]) - 1);
                                                if (anLocalInt_271_ == -1)
                                                    break;
                                                if ((anLocalInts_240_[anLocalInt_271_]) != 0) {
                                                    anLocalInts_237_[anLocalInt_271_] += anLocalInt_264_;
                                                    anLocalInts_239_[anLocalInt_271_] += anLocalInt_265_;
                                                    anLocalInts_238_[anLocalInt_271_] += anLocalInt_266_;
                                                    anLocalInts_240_[anLocalInt_271_] += anLocalInt_267_;
                                                }
                                            }
                                            if (aGlInterleavedArray_5236 == null && aGlInterleavedArray_5254 != null)
                                                ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                                            if (aGlInterleavedArray_5236 != null)
                                                ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
                                            if ((class167_sub3.aGlInterleavedArray_5236 == null) && (class167_sub3.aGlInterleavedArray_5254) != null)
                                                ((GlInterleavedArray) class167_sub3.aGlInterleavedArray_5254).arrayBuffer = null;
                                            if (class167_sub3.aGlInterleavedArray_5236 != null)
                                                ((GlInterleavedArray) class167_sub3.aGlInterleavedArray_5236).arrayBuffer = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void method2646(Class350 argument_272_, DoublyLinkedNodeP2_Sub9 argument_273_, int argument_274_, int argument_275_) {
        if (anInt5268 != 0) {
            Class350_Sub3 class350_sub3 = ((GlToolkit) aClass_ha_Sub3_5257).aClass350_Sub3_4881;
            Class350_Sub3 class350_sub3_276_ = (Class350_Sub3) argument_272_;
            if (!aBoolean5247)
                method2718(-99);
            Class48.aFloat349 = ((((Class350_Sub3) class350_sub3_276_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5465) + (((Class350_Sub3) class350_sub3).aFloat5455 * ((Class350_Sub3) class350_sub3_276_).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5461 * ((Class350_Sub3) class350_sub3_276_).aFloat5465));
            Statics.aFloat5821 = ((((Class350_Sub3) class350_sub3).aFloat5455 * ((Class350_Sub3) class350_sub3_276_).aFloat5459) + (((Class350_Sub3) class350_sub3).aFloat5465 * ((Class350_Sub3) class350_sub3_276_).aFloat5467) + (((Class350_Sub3) class350_sub3).aFloat5461 * ((Class350_Sub3) class350_sub3_276_).aFloat5462) + ((Class350_Sub3) class350_sub3).aFloat5462);
            float f = (Class48.aFloat349 * (float) aShort5208 + Statics.aFloat5821);
            float f_277_ = (Statics.aFloat5821 + Class48.aFloat349 * (float) aShort5222);
            float f_278_;
            float f_279_;
            if (f_277_ < f) {
                f_278_ = f_277_ - (float) aShort5265;
                f_279_ = (float) aShort5265 + f;
            } else {
                f_278_ = f - (float) aShort5265;
                f_279_ = (float) aShort5265 + f_277_;
            }
            if (!(((GlToolkit) aClass_ha_Sub3_5257).aFloat4991 <= f_278_) && !((float) ((GlToolkit) aClass_ha_Sub3_5257).anInt4920 >= f_279_)) {
                Statics.aFloat95 = (((Class350_Sub3) class350_sub3).aFloat5459 + ((((Class350_Sub3) class350_sub3_276_).aFloat5462 * ((Class350_Sub3) class350_sub3).aFloat5463) + ((((Class350_Sub3) class350_sub3_276_).aFloat5459 * ((Class350_Sub3) class350_sub3).aFloat5458) + (((Class350_Sub3) class350_sub3).aFloat5460 * (((Class350_Sub3) class350_sub3_276_).aFloat5467)))));
                Class373.aFloat3200 = ((((Class350_Sub3) class350_sub3).aFloat5458 * ((Class350_Sub3) class350_sub3_276_).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5460 * ((Class350_Sub3) class350_sub3_276_).aFloat5456) + (((Class350_Sub3) class350_sub3).aFloat5463 * ((Class350_Sub3) class350_sub3_276_).aFloat5465));
                float f_280_ = (Class373.aFloat3200 * (float) aShort5208 + Statics.aFloat95);
                float f_281_ = (Statics.aFloat95 + Class373.aFloat3200 * (float) aShort5222);
                float f_282_;
                float f_283_;
                if (f_281_ < f_280_) {
                    f_282_ = (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * (f_280_ + (float) aShort5265);
                    f_283_ = ((f_281_ - (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900));
                } else {
                    f_282_ = (((float) aShort5265 + f_281_) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900));
                    f_283_ = ((f_280_ - (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900));
                }
                if (!(f_283_ / (float) argument_274_ >= ((GlToolkit) aClass_ha_Sub3_5257).aFloat4915) && !(((GlToolkit) aClass_ha_Sub3_5257).aFloat4952 >= f_282_ / (float) argument_274_)) {
                    Statics.aFloat6387 = ((((Class350_Sub3) class350_sub3_276_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5456) + (((Class350_Sub3) class350_sub3).aFloat5457 * (((Class350_Sub3) class350_sub3_276_).aFloat5460)) + (((Class350_Sub3) class350_sub3).aFloat5466 * (((Class350_Sub3) class350_sub3_276_).aFloat5465)));
                    Class41.aFloat303 = (((Class350_Sub3) class350_sub3).aFloat5467 + ((((Class350_Sub3) class350_sub3).aFloat5466 * (((Class350_Sub3) class350_sub3_276_).aFloat5462)) + (((((Class350_Sub3) class350_sub3_276_).aFloat5459) * ((Class350_Sub3) class350_sub3).aFloat5457) + (((Class350_Sub3) class350_sub3).aFloat5456 * (((Class350_Sub3) class350_sub3_276_).aFloat5467)))));
                    float f_284_ = Class41.aFloat303 + ((float) aShort5208 * Statics.aFloat6387);
                    float f_285_ = Class41.aFloat303 + ((float) aShort5222 * Statics.aFloat6387);
                    float f_286_;
                    float f_287_;
                    if (!(f_285_ < f_284_)) {
                        f_287_ = ((f_284_ - (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956));
                        f_286_ = ((float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * (f_285_ + (float) aShort5265));
                    } else {
                        f_286_ = ((f_284_ + (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956));
                        f_287_ = ((float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * (f_285_ - (float) aShort5265));
                    }
                    if (!(f_287_ / (float) argument_274_ >= ((GlToolkit) aClass_ha_Sub3_5257).aFloat4899) && !(((GlToolkit) aClass_ha_Sub3_5257).aFloat4934 >= f_286_ / (float) argument_274_)) {
                        if (argument_273_ != null || aClass173Array5210 != null) {
                            DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677 = (((((Class350_Sub3) class350_sub3_276_).aFloat5455) * (((Class350_Sub3) class350_sub3).aFloat5461)) + (((((Class350_Sub3) class350_sub3).aFloat5455) * (((Class350_Sub3) class350_sub3_276_).aFloat5458)) + ((((Class350_Sub3) class350_sub3).aFloat5465) * ((Class350_Sub3) class350_sub3_276_).aFloat5457)));
                            Class4.aFloat59 = ((((Class350_Sub3) class350_sub3).aFloat5461 * (((Class350_Sub3) class350_sub3_276_).aFloat5461)) + (((((Class350_Sub3) class350_sub3).aFloat5465) * (((Class350_Sub3) class350_sub3_276_).aFloat5466)) + ((((Class350_Sub3) class350_sub3).aFloat5455) * ((Class350_Sub3) class350_sub3_276_).aFloat5463)));
                            Class347.aFloat3598 = ((((Class350_Sub3) class350_sub3).aFloat5458 * (((Class350_Sub3) class350_sub3_276_).aFloat5463)) + ((((Class350_Sub3) class350_sub3_276_).aFloat5466) * (((Class350_Sub3) class350_sub3).aFloat5460)) + ((((Class350_Sub3) class350_sub3_276_).aFloat5461) * (((Class350_Sub3) class350_sub3).aFloat5463)));
                            Class225.aFloat1633 = (((((Class350_Sub3) class350_sub3_276_).aFloat5455) * (((Class350_Sub3) class350_sub3).aFloat5466)) + (((((Class350_Sub3) class350_sub3).aFloat5456) * (((Class350_Sub3) class350_sub3_276_).aFloat5457)) + ((((Class350_Sub3) class350_sub3_276_).aFloat5458) * (((Class350_Sub3) class350_sub3).aFloat5457))));
                            Class307_Sub1.aFloat5415 = ((((Class350_Sub3) class350_sub3).aFloat5463 * (((Class350_Sub3) class350_sub3_276_).aFloat5455)) + (((((Class350_Sub3) class350_sub3_276_).aFloat5457) * (((Class350_Sub3) class350_sub3).aFloat5460)) + ((((Class350_Sub3) class350_sub3).aFloat5458) * ((Class350_Sub3) class350_sub3_276_).aFloat5458)));
                            Class140.aFloat1093 = (((((Class350_Sub3) class350_sub3_276_).aFloat5461) * (((Class350_Sub3) class350_sub3).aFloat5466)) + (((((Class350_Sub3) class350_sub3_276_).aFloat5466) * (((Class350_Sub3) class350_sub3).aFloat5456)) + ((((Class350_Sub3) class350_sub3_276_).aFloat5463) * (((Class350_Sub3) class350_sub3).aFloat5457))));
                        }
                        if (argument_273_ != null) {
                            int anLocalInt = aShort5229 + aShort5242 >> 1;
                            int anLocalInt_288_ = aShort5235 + aShort5269 >> 1;
                            int anLocalInt_289_ = (int) (((float) aShort5208 * Class373.aFloat3200) + (((float) anLocalInt * Class307_Sub1.aFloat5415) + Statics.aFloat95) + (Class347.aFloat3598 * (float) anLocalInt_288_));
                            int anLocalInt_290_ = (int) (((float) anLocalInt_288_ * Class140.aFloat1093) + (Class41.aFloat303 + (Class225.aFloat1633 * (float) anLocalInt) + ((float) aShort5208 * (Statics.aFloat6387))));
                            int anLocalInt_291_ = (int) ((Class4.aFloat59 * (float) anLocalInt_288_) + (Statics.aFloat5821 + ((DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677) * (float) anLocalInt) + (Class48.aFloat349 * (float) aShort5208)));
                            int anLocalInt_292_ = (int) ((Class373.aFloat3200 * (float) aShort5222) + (Statics.aFloat95 + (Class307_Sub1.aFloat5415 * (float) anLocalInt)) + ((float) anLocalInt_288_ * Class347.aFloat3598));
                            int anLocalInt_293_ = (int) ((Class225.aFloat1633 * (float) anLocalInt) + Class41.aFloat303 + ((float) aShort5222 * Statics.aFloat6387) + ((float) anLocalInt_288_ * Class140.aFloat1093));
                            int anLocalInt_294_ = (int) ((Class4.aFloat59 * (float) anLocalInt_288_) + (((float) anLocalInt * (DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677)) + Statics.aFloat5821 + ((float) aShort5222 * Class48.aFloat349)));
                            ((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4587 = ((((GlToolkit) aClass_ha_Sub3_5257).anInt4972) + ((((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * anLocalInt_293_ / argument_274_));
                            ((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4589 = ((anLocalInt_290_ * (((GlToolkit) aClass_ha_Sub3_5257).anInt4956) / argument_274_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4972));
                            ((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4590 = ((((GlToolkit) aClass_ha_Sub3_5257).anInt4993) + ((((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * anLocalInt_292_ / argument_274_));
                            ((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4588 = (((((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * anLocalInt_289_ / argument_274_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4993));
                            if ((((GlToolkit) aClass_ha_Sub3_5257).anInt4920) <= anLocalInt_291_ || (anLocalInt_294_ >= (((GlToolkit) aClass_ha_Sub3_5257).anInt4920))) {
                                ((DoublyLinkedNodeP2_Sub9) argument_273_).aBoolean4591 = true;
                                ((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4586 = (((anLocalInt_289_ + aShort5265) * ((GlToolkit) aClass_ha_Sub3_5257).anInt4900 / argument_274_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4993 - (((DoublyLinkedNodeP2_Sub9) argument_273_).anInt4588)));
                            }
                        }
                        aClass_ha_Sub3_5257.method2306((float) argument_274_);
                        aClass_ha_Sub3_5257.method2343();
                        aClass_ha_Sub3_5257.method2336(-119, class350_sub3_276_);
                        method2717(1559402986);
                        aClass_ha_Sub3_5257.popMatrix();
                        method2721(38);
                    }
                }
            }
        }
    }

    final int WA() {
        return aShort5261;
    }

    private final short method2719(Class101 argument_295_, long argument_296_, int argument_297_, float argument_298_, int argument_299_, int argument_300_, int argument_301_, float argument_302_, int argument_303_, int argument_304_) {
        int anLocalInt = anIntArray5260[argument_304_];
        if (argument_301_ < 80)
            return (short) -36;
        int anLocalInt_305_ = anIntArray5260[argument_304_ + 1];
        int anLocalInt_306_ = 0;
        for (int anLocalInt_307_ = anLocalInt; anLocalInt_305_ > anLocalInt_307_; anLocalInt_307_++) {
            short anLocalInt_308_ = aShortArray5248[anLocalInt_307_];
            if (anLocalInt_308_ == 0) {
                anLocalInt_306_ = anLocalInt_307_;
                break;
            }
            if (DoublyLinkedNode_Sub51_Sub19_Sub1.aLongArray6675[anLocalInt_307_] == argument_296_)
                return (short) (anLocalInt_308_ - 1);
        }
        aShortArray5248[anLocalInt_306_] = (short) (anInt5268 + 1);
        DoublyLinkedNode_Sub51_Sub19_Sub1.aLongArray6675[anLocalInt_306_] = argument_296_;
        aShortArray5233[anInt5268] = (short) argument_299_;
        aShortArray5219[anInt5268] = (short) argument_300_;
        aShortArray5239[anInt5268] = (short) argument_297_;
        aByteArray5253[anInt5268] = (byte) argument_303_;
        aFloatArray5234[anInt5268] = argument_298_;
        aFloatArray5256[anInt5268] = argument_302_;
        return (short) anInt5268++;
    }

    final void a(int argument_309_) {
        int anLocalInt = Node_Sub6.SINETABLE[argument_309_];
        int anLocalInt_310_ = Node_Sub6.COSINETABLE[argument_309_];
        for (int anLocalInt_311_ = 0; anLocalInt_311_ < anInt5211; anLocalInt_311_++) {
            int anLocalInt_312_ = ((anIntArray5255[anLocalInt_311_] * anLocalInt_310_ + anIntArray5216[anLocalInt_311_] * anLocalInt) >> 14);
            anIntArray5216[anLocalInt_311_] = (-(anIntArray5255[anLocalInt_311_] * anLocalInt) + anIntArray5216[anLocalInt_311_] * anLocalInt_310_) >> 14;
            anIntArray5255[anLocalInt_311_] = anLocalInt_312_;
        }
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        aBoolean5247 = false;
    }

    final int G() {
        if (!aBoolean5247)
            method2718(-102);
        return aShort5235;
    }

    final tia_sub_35DoublyLinked ba(tia_sub_35DoublyLinked argument_313_) {
        if (anInt5268 == 0)
            return null;
        if (!aBoolean5247)
            method2718(-124);
        int anLocalInt;
        int anLocalInt_314_;
        if (((GlToolkit) aClass_ha_Sub3_5257).anInt4886 <= 0) {
            anLocalInt = (aShort5242 - ((((GlToolkit) aClass_ha_Sub3_5257).anInt4886) * aShort5208 >> 8) >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
            anLocalInt_314_ = (aShort5229 - ((((GlToolkit) aClass_ha_Sub3_5257).anInt4886) * aShort5222 >> 8) >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
        } else {
            anLocalInt = (-((aShort5222 * ((GlToolkit) aClass_ha_Sub3_5257).anInt4886) >> 8) + aShort5242 >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
            anLocalInt_314_ = (aShort5229 - ((((GlToolkit) aClass_ha_Sub3_5257).anInt4886) * aShort5208 >> 8) >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
        }
        int anLocalInt_315_;
        int anLocalInt_316_;
        if (((GlToolkit) aClass_ha_Sub3_5257).anInt4930 > 0) {
            anLocalInt_315_ = (-((((GlToolkit) aClass_ha_Sub3_5257).anInt4930 * aShort5222) >> 8) + aShort5269 >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
            anLocalInt_316_ = (aShort5235 - ((((GlToolkit) aClass_ha_Sub3_5257).anInt4930) * aShort5208 >> 8) >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
        } else {
            anLocalInt_315_ = (-((aShort5208 * ((GlToolkit) aClass_ha_Sub3_5257).anInt4930) >> 8) + aShort5269 >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
            anLocalInt_316_ = (-((((GlToolkit) aClass_ha_Sub3_5257).anInt4930 * aShort5222) >> 8) + aShort5235 >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847);
        }
        int anLocalInt_317_ = -anLocalInt + anLocalInt_314_ + 1;
        int anLocalInt_318_ = anLocalInt_316_ - (anLocalInt_315_ - 1);
        tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2 = (tia_sub_35_Sub2DoublyLinked) argument_313_;
        tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2_319_;
        if (var_tia_sub_35_Sub2 != null && var_tia_sub_35_Sub2.method1224(-128, anLocalInt_318_, anLocalInt_317_)) {
            var_tia_sub_35_Sub2_319_ = var_tia_sub_35_Sub2;
            var_tia_sub_35_Sub2_319_.method1227(0);
        } else
            var_tia_sub_35_Sub2_319_ = new tia_sub_35_Sub2DoublyLinked(aClass_ha_Sub3_5257, anLocalInt_317_, anLocalInt_318_);
        var_tia_sub_35_Sub2_319_.method1228((byte) 57, anLocalInt, anLocalInt_314_, anLocalInt_316_, anLocalInt_315_);
        method2722(84, var_tia_sub_35_Sub2_319_);
        return var_tia_sub_35_Sub2_319_;
    }

    final int RA() {
        if (!aBoolean5247)
            method2718(-47);
        return aShort5229;
    }

    final void ia(short argument_320_, short argument_321_) {
        for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++) {
            if (argument_320_ == aShortArray5212[anLocalInt])
                aShortArray5212[anLocalInt] = argument_321_;
        }
        if (aClass173Array5210 != null) {
            for (int anLocalInt = 0; anLocalInt < anInt5237; anLocalInt++) {
                Class173 class173 = aClass173Array5210[anLocalInt];
                Class359 class359 = aClass359Array5246[anLocalInt];
                ((Class359) class359).anInt3037 = (((Class359) class359).anInt3037 & ~0xffffff | (HslToRgb.table[(aShortArray5212[((Class173) class173).anInt1282] & 0xffff)]) & 0xffffff);
            }
        }
        if (aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
    }

    final void C(int argument_322_) {
        aShort5261 = (short) argument_322_;
        if (aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
    }

    final void method2647() {
        /* empty */
    }

    final void method2656(Class350 argument_323_) {
        Class350_Sub3 class350_sub3 = (Class350_Sub3) argument_323_;
        if (aClass38Array5263 != null) {
            for (int anLocalInt = 0; aClass38Array5263.length > anLocalInt; anLocalInt++) {
                Class38 class38 = aClass38Array5263[anLocalInt];
                Class38 class38_324_ = class38;
                if (((Class38) class38).aClass38_278 != null)
                    class38_324_ = ((Class38) class38).aClass38_278;
                ((Class38) class38_324_).anInt282 = (int) (((Class350_Sub3) class350_sub3).aFloat5459 + ((((Class350_Sub3) class350_sub3).aFloat5463 * (float) (anIntArray5216[((Class38) class38).anInt286])) + ((((Class350_Sub3) class350_sub3).aFloat5460 * (float) (anIntArray5267[((Class38) class38).anInt286])) + ((float) (anIntArray5255[((Class38) class38).anInt286]) * (((Class350_Sub3) class350_sub3).aFloat5458)))));
                ((Class38) class38_324_).anInt279 = (int) ((((Class350_Sub3) class350_sub3).aFloat5466 * (float) (anIntArray5216[((Class38) class38).anInt286])) + (((float) (anIntArray5267[((Class38) class38).anInt286]) * ((Class350_Sub3) class350_sub3).aFloat5456) + (((Class350_Sub3) class350_sub3).aFloat5457 * (float) (anIntArray5255[((Class38) class38).anInt286]))) + ((Class350_Sub3) class350_sub3).aFloat5467);
                ((Class38) class38_324_).anInt280 = (int) (((Class350_Sub3) class350_sub3).aFloat5462 + ((((Class350_Sub3) class350_sub3).aFloat5461 * (float) (anIntArray5216[((Class38) class38).anInt286])) + ((((Class350_Sub3) class350_sub3).aFloat5465 * (float) (anIntArray5267[((Class38) class38).anInt286])) + ((float) (anIntArray5255[((Class38) class38).anInt286]) * (((Class350_Sub3) class350_sub3).aFloat5455)))));
                ((Class38) class38_324_).anInt283 = (int) (((float) (anIntArray5216[((Class38) class38).anInt284]) * ((Class350_Sub3) class350_sub3).aFloat5463) + (((float) (anIntArray5267[((Class38) class38).anInt284]) * ((Class350_Sub3) class350_sub3).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5458 * (float) (anIntArray5255[((Class38) class38).anInt284]))) + ((Class350_Sub3) class350_sub3).aFloat5459);
                ((Class38) class38_324_).anInt276 = (int) (((Class350_Sub3) class350_sub3).aFloat5467 + ((((Class350_Sub3) class350_sub3).aFloat5457 * (float) (anIntArray5255[((Class38) class38).anInt284])) + (((Class350_Sub3) class350_sub3).aFloat5456 * (float) (anIntArray5267[((Class38) class38).anInt284])) + ((float) (anIntArray5216[((Class38) class38).anInt284]) * (((Class350_Sub3) class350_sub3).aFloat5466))));
                ((Class38) class38_324_).anInt289 = (int) (((float) (anIntArray5255[((Class38) class38).anInt284]) * ((Class350_Sub3) class350_sub3).aFloat5455) + (((Class350_Sub3) class350_sub3).aFloat5465 * (float) (anIntArray5267[((Class38) class38).anInt284])) + (((Class350_Sub3) class350_sub3).aFloat5461 * (float) (anIntArray5216[((Class38) class38).anInt284])) + ((Class350_Sub3) class350_sub3).aFloat5462);
                ((Class38) class38_324_).anInt277 = (int) (((Class350_Sub3) class350_sub3).aFloat5459 + ((((Class350_Sub3) class350_sub3).aFloat5463 * (float) (anIntArray5216[((Class38) class38).anInt281])) + (((float) (anIntArray5255[((Class38) class38).anInt281]) * (((Class350_Sub3) class350_sub3).aFloat5458)) + ((((Class350_Sub3) class350_sub3).aFloat5460) * (float) (anIntArray5267[(((Class38) class38).anInt281)])))));
                ((Class38) class38_324_).anInt288 = (int) ((((Class350_Sub3) class350_sub3).aFloat5457 * (float) (anIntArray5255[((Class38) class38).anInt281])) + ((float) (anIntArray5267[((Class38) class38).anInt281]) * ((Class350_Sub3) class350_sub3).aFloat5456) + ((float) (anIntArray5216[((Class38) class38).anInt281]) * ((Class350_Sub3) class350_sub3).aFloat5466) + ((Class350_Sub3) class350_sub3).aFloat5467);
                ((Class38) class38_324_).anInt290 = (int) ((((Class350_Sub3) class350_sub3).aFloat5455 * (float) (anIntArray5255[((Class38) class38).anInt281])) + (((Class350_Sub3) class350_sub3).aFloat5465 * (float) (anIntArray5267[((Class38) class38).anInt281])) + (((Class350_Sub3) class350_sub3).aFloat5461 * (float) (anIntArray5216[((Class38) class38).anInt281])) + ((Class350_Sub3) class350_sub3).aFloat5462);
            }
        }
        if (aClass185Array5243 != null) {
            for (int anLocalInt = 0; aClass185Array5243.length > anLocalInt; anLocalInt++) {
                Class185 class185 = aClass185Array5243[anLocalInt];
                Class185 class185_325_ = class185;
                if (((Class185) class185).aClass185_1387 != null)
                    class185_325_ = ((Class185) class185).aClass185_1387;
                if (((Class185) class185).aClass350_1383 == null)
                    ((Class185) class185).aClass350_1383 = class350_sub3.method3826();
                else
                    ((Class185) class185).aClass350_1383.method3838(class350_sub3);
                ((Class185) class185_325_).anInt1384 = (int) (((Class350_Sub3) class350_sub3).aFloat5459 + ((((Class350_Sub3) class350_sub3).aFloat5460 * (float) (anIntArray5267[((Class185) class185).anInt1389])) + (((Class350_Sub3) class350_sub3).aFloat5458 * (float) (anIntArray5255[(((Class185) class185).anInt1389)])) + ((float) (anIntArray5216[((Class185) class185).anInt1389]) * (((Class350_Sub3) class350_sub3).aFloat5463))));
                ((Class185) class185_325_).anInt1388 = (int) (((Class350_Sub3) class350_sub3).aFloat5467 + ((((Class350_Sub3) class350_sub3).aFloat5456 * (float) (anIntArray5267[((Class185) class185).anInt1389])) + (((Class350_Sub3) class350_sub3).aFloat5457 * (float) (anIntArray5255[(((Class185) class185).anInt1389)])) + ((float) (anIntArray5216[((Class185) class185).anInt1389]) * (((Class350_Sub3) class350_sub3).aFloat5466))));
                ((Class185) class185_325_).anInt1385 = (int) (((Class350_Sub3) class350_sub3).aFloat5462 + (((float) (anIntArray5267[((Class185) class185).anInt1389]) * ((Class350_Sub3) class350_sub3).aFloat5465) + (((Class350_Sub3) class350_sub3).aFloat5455 * (float) (anIntArray5255[(((Class185) class185).anInt1389)])) + ((float) (anIntArray5216[((Class185) class185).anInt1389]) * (((Class350_Sub3) class350_sub3).aFloat5461))));
            }
        }
    }

    private final void method2720(boolean argument_326_, byte argument_327_) {
        if (anInt5213 * 6 > (((Packet) ((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957).data).length)
            ((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957 = new FloatPacket((anInt5213 + 100) * 6);
        else
            ((Packet) (((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957)).pos = 0;
        FloatPacket class59_sub28_sub2 = ((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957;
        if (((GlToolkit) aClass_ha_Sub3_5257).isBigEndian) {
            for (int anLocalInt = 0; anInt5213 > anLocalInt; anLocalInt++) {
                class59_sub28_sub2.p2(aShortArray5250[anLocalInt]);
                class59_sub28_sub2.p2(aShortArray5220[anLocalInt]);
                class59_sub28_sub2.p2(aShortArray5223[anLocalInt]);
            }
        } else {
            for (int anLocalInt = 0; anLocalInt < anInt5213; anLocalInt++) {
                class59_sub28_sub2.p2i(aShortArray5250[anLocalInt]);
                class59_sub28_sub2.p2i(aShortArray5220[anLocalInt]);
                class59_sub28_sub2.p2i(aShortArray5223[anLocalInt]);
            }
        }
        if (((Packet) class59_sub28_sub2).pos != 0) {
            if (argument_326_) {
                if (anGlElementBuffer_5214 != null)
                    anGlElementBuffer_5214.setData(((Packet) class59_sub28_sub2).pos, 5123, ((Packet) class59_sub28_sub2).data);
                else
                    anGlElementBuffer_5214 = aClass_ha_Sub3_5257.method2290((((Packet) class59_sub28_sub2).pos), true, 5123, false, (((Packet) class59_sub28_sub2).data));
                ((Class121) aClass121_5249).anGlElementBuffer_982 = anGlElementBuffer_5214;
            } else
                ((Class121) aClass121_5249).anGlElementBuffer_982 = (aClass_ha_Sub3_5257.method2290(((Packet) class59_sub28_sub2).pos, false, 5123, false, ((Packet) class59_sub28_sub2).data));
            if (!argument_326_)
                aBoolean5226 = true;
            int anLocalInt = 36 / ((argument_327_ - 25) / 56);
        }
    }

    private final void method2721(int argument_328_) {
        if (aClass173Array5210 != null) {
            Class350_Sub3 class350_sub3 = ((GlToolkit) aClass_ha_Sub3_5257).aClass350_Sub3_4846;
            aClass_ha_Sub3_5257.glPushMatrix();
            aClass_ha_Sub3_5257.C(!aBoolean5217);
            aClass_ha_Sub3_5257.setLightingEnabled(false);
            aClass_ha_Sub3_5257.bindArrays(null, null, ((GlToolkit) aClass_ha_Sub3_5257).aGlInterleavedArray_4905, ((GlToolkit) aClass_ha_Sub3_5257).aGlInterleavedArray_4897);
            for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++) {
                Class173 class173 = aClass173Array5210[anLocalInt];
                Class359 class359 = aClass359Array5246[anLocalInt];
                if (!((Class173) class173).aBoolean1284 || !aClass_ha_Sub3_5257.method2019()) {
                    float f = ((float) ((anIntArray5255[((Class173) class173).anInt1289]) + (anIntArray5255[((Class173) class173).anInt1285]) + (anIntArray5255[((Class173) class173).anInt1283])) * 0.3333333F);
                    float f_329_ = ((float) ((anIntArray5267[((Class173) class173).anInt1283]) + ((anIntArray5267[((Class173) class173).anInt1289]) + (anIntArray5267[((Class173) class173).anInt1285]))) * 0.3333333F);
                    float f_330_ = ((float) ((anIntArray5216[((Class173) class173).anInt1289]) + ((anIntArray5216[((Class173) class173).anInt1285]) + (anIntArray5216[((Class173) class173).anInt1283]))) * 0.3333333F);
                    float f_331_ = (f_330_ * Class347.aFloat3598 + (Class373.aFloat3200 * f_329_ + f * Class307_Sub1.aFloat5415) + Statics.aFloat95);
                    float f_332_ = (f_330_ * Class140.aFloat1093 + (Statics.aFloat6387 * f_329_ + Class225.aFloat1633 * f) + Class41.aFloat303);
                    float f_333_ = (Statics.aFloat5821 + (f_329_ * Class48.aFloat349 + DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677 * f + f_330_ * Class4.aFloat59));
                    float f_334_ = ((float) (1.0 / Math.sqrt((double) (f_333_ * f_333_ + (f_332_ * f_332_ + (f_331_ * f_331_))))) * (float) ((Class173) class173).anInt1287);
                    class350_sub3.method3868((byte) -124, (-f_332_ + (float) ((Class359) class359).anInt3043 + f_332_ * f_334_), f_334_ * f_333_ + -f_333_, (-(f_334_ * f_331_) + ((float) ((Class359) class359).anInt3039 + f_331_)), (((Class173) class173).aShort1293 * ((Class359) class359).anInt3036) >> 7, (((Class173) class173).aShort1288 * ((Class359) class359).anInt3041) >> 7, ((Class359) class359).anInt3040);
                    aClass_ha_Sub3_5257.method2353(class350_sub3);
                    int anLocalInt_335_ = ((Class359) class359).anInt3037;
                    OpenGL.glColor4ub((byte) (anLocalInt_335_ >> 16), (byte) (anLocalInt_335_ >> 8), (byte) anLocalInt_335_, (byte) (anLocalInt_335_ >> 24));
                    aClass_ha_Sub3_5257.method2333(((Class173) class173).aShort1292);
                    aClass_ha_Sub3_5257.setBlendingConfiguration(((Class173) class173).aByte1291);
                    aClass_ha_Sub3_5257.drawArrays(7, 0, 4);
                }
            }
            aClass_ha_Sub3_5257.C(true);
            aClass_ha_Sub3_5257.popMatrix();
        }
        if (argument_328_ <= 28) {
            /* empty */
        }
    }

    private final void method2722(int argument_336_, tia_sub_35_Sub2DoublyLinked argument_337_) {
        if (((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997.length < anInt5268) {
            ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4999 = new int[anInt5268];
            ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997 = new int[anInt5268];
        }
        int[] anLocalInts = ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4997;
        int[] anLocalInts_338_ = ((GlToolkit) aClass_ha_Sub3_5257).anIntArray4999;
        for (int anLocalInt = 0; anLocalInt < anInt5211; anLocalInt++) {
            int anLocalInt_339_ = (((anIntArray5255[anLocalInt] - ((((GlToolkit) aClass_ha_Sub3_5257).anInt4886 * anIntArray5267[anLocalInt]) >> 8)) >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847) - ((tia_sub_35_Sub2DoublyLinked) argument_337_).anInt6668);
            int anLocalInt_340_ = ((-((anIntArray5267[anLocalInt] * ((GlToolkit) aClass_ha_Sub3_5257).anInt4930) >> 8) + anIntArray5216[anLocalInt] >> ((GlToolkit) aClass_ha_Sub3_5257).anInt4847) - ((tia_sub_35_Sub2DoublyLinked) argument_337_).anInt6669);
            int anLocalInt_341_ = anIntArray5260[anLocalInt];
            int anLocalInt_342_ = anIntArray5260[anLocalInt + 1];
            for (int anLocalInt_343_ = anLocalInt_341_; anLocalInt_343_ < anLocalInt_342_; anLocalInt_343_++) {
                int anLocalInt_344_ = aShortArray5248[anLocalInt_343_] - 1;
                if (anLocalInt_344_ == -1)
                    break;
                anLocalInts[anLocalInt_344_] = anLocalInt_339_;
                anLocalInts_338_[anLocalInt_344_] = anLocalInt_340_;
            }
        }
        if (argument_336_ < 58)
            wa();
        for (int anLocalInt = 0; anInt5213 > anLocalInt; anLocalInt++) {
            if (aByteArray5230 == null || aByteArray5230[anLocalInt] <= 128) {
                short anLocalInt_345_ = aShortArray5250[anLocalInt];
                short anLocalInt_346_ = aShortArray5220[anLocalInt];
                short anLocalInt_347_ = aShortArray5223[anLocalInt];
                int anLocalInt_348_ = anLocalInts[anLocalInt_345_];
                int anLocalInt_349_ = anLocalInts[anLocalInt_346_];
                int anLocalInt_350_ = anLocalInts[anLocalInt_347_];
                int anLocalInt_351_ = anLocalInts_338_[anLocalInt_345_];
                int anLocalInt_352_ = anLocalInts_338_[anLocalInt_346_];
                int anLocalInt_353_ = anLocalInts_338_[anLocalInt_347_];
                if ((-((anLocalInt_350_ - anLocalInt_349_) * (anLocalInt_352_ - anLocalInt_351_)) + ((anLocalInt_352_ - anLocalInt_353_) * (anLocalInt_348_ - anLocalInt_349_))) > 0)
                    argument_337_.method1225(false, anLocalInt_352_, anLocalInt_349_, anLocalInt_350_, anLocalInt_353_, anLocalInt_348_, anLocalInt_351_);
            }
        }
    }

    final void I(int argument_354_, int[] argument_355_, int argument_356_, int argument_357_, int argument_358_, boolean argument_359_, int argument_360_, int[] argument_361_) {
        int anLocalInt = argument_355_.length;
        if (argument_354_ == 0) {
            argument_356_ <<= 4;
            argument_358_ <<= 4;
            argument_357_ <<= 4;
            Node_Sub47_Sub8.anInt6194 = 0;
            Node_Sub31_Sub23.anInt5945 = 0;
            Class62_Sub16.anInt4415 = 0;
            int anLocalInt_362_ = 0;
            for (int anLocalInt_363_ = 0; anLocalInt > anLocalInt_363_; anLocalInt_363_++) {
                int anLocalInt_364_ = argument_355_[anLocalInt_363_];
                if (anIntArrayArray5244.length > anLocalInt_364_) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_364_];
                    for (int anLocalInt_365_ = 0; anLocalInt_365_ < anLocalInts.length; anLocalInt_365_++) {
                        int anLocalInt_366_ = anLocalInts[anLocalInt_365_];
                        if (aShortArray5215 == null || (aShortArray5215[anLocalInt_366_] & argument_360_) != 0) {
                            Node_Sub31_Sub23.anInt5945 += anIntArray5255[anLocalInt_366_];
                            Node_Sub47_Sub8.anInt6194 += anIntArray5267[anLocalInt_366_];
                            Class62_Sub16.anInt4415 += anIntArray5216[anLocalInt_366_];
                            anLocalInt_362_++;
                        }
                    }
                }
            }
            if (anLocalInt_362_ <= 0) {
                Node_Sub31_Sub23.anInt5945 = argument_356_;
                Class62_Sub16.anInt4415 = argument_358_;
                Node_Sub47_Sub8.anInt6194 = argument_357_;
            } else {
                Node_Sub47_Sub8.anInt6194 = (argument_357_ + Node_Sub47_Sub8.anInt6194 / anLocalInt_362_);
                Node_Sub31_Sub18.aBoolean5920 = true;
                Node_Sub31_Sub23.anInt5945 = (argument_356_ + Node_Sub31_Sub23.anInt5945 / anLocalInt_362_);
                Class62_Sub16.anInt4415 = (Class62_Sub16.anInt4415 / anLocalInt_362_ + argument_358_);
            }
        } else if (argument_354_ == 1) {
            if (argument_361_ != null) {
                int anLocalInt_367_ = ((argument_357_ * argument_361_[1] + argument_361_[0] * argument_356_ + argument_361_[2] * argument_358_ + 8192) >> 14);
                int anLocalInt_368_ = ((argument_358_ * argument_361_[5] + argument_356_ * argument_361_[3] - (-(argument_361_[4] * argument_357_) - 8192)) >> 14);
                int anLocalInt_369_ = ((argument_361_[7] * argument_357_ + 8192 + (argument_356_ * argument_361_[6] + argument_358_ * argument_361_[8])) >> 14);
                argument_358_ = anLocalInt_369_;
                argument_357_ = anLocalInt_368_;
                argument_356_ = anLocalInt_367_;
            }
            argument_358_ <<= 4;
            argument_357_ <<= 4;
            argument_356_ <<= 4;
            for (int anLocalInt_370_ = 0; anLocalInt_370_ < anLocalInt; anLocalInt_370_++) {
                int anLocalInt_371_ = argument_355_[anLocalInt_370_];
                if (anIntArrayArray5244.length > anLocalInt_371_) {
                    int[] anLocalInts = anIntArrayArray5244[anLocalInt_371_];
                    for (int anLocalInt_372_ = 0; anLocalInt_372_ < anLocalInts.length; anLocalInt_372_++) {
                        int anLocalInt_373_ = anLocalInts[anLocalInt_372_];
                        if (aShortArray5215 == null || (aShortArray5215[anLocalInt_373_] & argument_360_) != 0) {
                            anIntArray5255[anLocalInt_373_] += argument_356_;
                            anIntArray5267[anLocalInt_373_] += argument_357_;
                            anIntArray5216[anLocalInt_373_] += argument_358_;
                        }
                    }
                }
            }
        } else if (argument_354_ == 2) {
            if (argument_361_ == null) {
                for (int anLocalInt_374_ = 0; anLocalInt > anLocalInt_374_; anLocalInt_374_++) {
                    int anLocalInt_375_ = argument_355_[anLocalInt_374_];
                    if (anLocalInt_375_ < anIntArrayArray5244.length) {
                        int[] anLocalInts = anIntArrayArray5244[anLocalInt_375_];
                        for (int anLocalInt_376_ = 0; anLocalInt_376_ < anLocalInts.length; anLocalInt_376_++) {
                            int anLocalInt_377_ = anLocalInts[anLocalInt_376_];
                            if (aShortArray5215 == null || (argument_360_ & aShortArray5215[anLocalInt_377_]) != 0) {
                                anIntArray5255[anLocalInt_377_] -= Node_Sub31_Sub23.anInt5945;
                                anIntArray5267[anLocalInt_377_] -= Node_Sub47_Sub8.anInt6194;
                                anIntArray5216[anLocalInt_377_] -= Class62_Sub16.anInt4415;
                                if (argument_358_ != 0) {
                                    int anLocalInt_378_ = (Node_Sub6.SINETABLE[argument_358_]);
                                    int anLocalInt_379_ = (Node_Sub6.COSINETABLE[argument_358_]);
                                    int anLocalInt_380_ = (((anLocalInt_378_ * anIntArray5267[anLocalInt_377_]) + (anLocalInt_379_ * (anIntArray5255[anLocalInt_377_])) + 16383) >> 14);
                                    anIntArray5267[anLocalInt_377_] = ((anLocalInt_379_ * anIntArray5267[anLocalInt_377_]) - (anIntArray5255[anLocalInt_377_] * anLocalInt_378_) + 16383) >> 14;
                                    anIntArray5255[anLocalInt_377_] = anLocalInt_380_;
                                }
                                if (argument_356_ != 0) {
                                    int anLocalInt_381_ = (Node_Sub6.SINETABLE[argument_356_]);
                                    int anLocalInt_382_ = (Node_Sub6.COSINETABLE[argument_356_]);
                                    int anLocalInt_383_ = ((-(anIntArray5216[anLocalInt_377_] * anLocalInt_381_) + ((anIntArray5267[anLocalInt_377_] * anLocalInt_382_) + 16383)) >> 14);
                                    anIntArray5216[anLocalInt_377_] = ((anLocalInt_381_ * anIntArray5267[anLocalInt_377_]) + ((anLocalInt_382_ * (anIntArray5216[anLocalInt_377_])) + 16383)) >> 14;
                                    anIntArray5267[anLocalInt_377_] = anLocalInt_383_;
                                }
                                if (argument_357_ != 0) {
                                    int anLocalInt_384_ = (Node_Sub6.SINETABLE[argument_357_]);
                                    int anLocalInt_385_ = (Node_Sub6.COSINETABLE[argument_357_]);
                                    int anLocalInt_386_ = (((anLocalInt_385_ * anIntArray5255[anLocalInt_377_]) + (anLocalInt_384_ * (anIntArray5216[anLocalInt_377_])) + 16383) >> 14);
                                    anIntArray5216[anLocalInt_377_] = (-(anIntArray5255[anLocalInt_377_] * anLocalInt_384_) + (anLocalInt_385_ * (anIntArray5216[anLocalInt_377_])) + 16383) >> 14;
                                    anIntArray5255[anLocalInt_377_] = anLocalInt_386_;
                                }
                                anIntArray5255[anLocalInt_377_] += Node_Sub31_Sub23.anInt5945;
                                anIntArray5267[anLocalInt_377_] += Node_Sub47_Sub8.anInt6194;
                                anIntArray5216[anLocalInt_377_] += Class62_Sub16.anInt4415;
                            }
                        }
                    }
                }
                if (argument_359_) {
                    for (int anLocalInt_387_ = 0; anLocalInt > anLocalInt_387_; anLocalInt_387_++) {
                        int anLocalInt_388_ = argument_355_[anLocalInt_387_];
                        if (anIntArrayArray5244.length > anLocalInt_388_) {
                            int[] anLocalInts = anIntArrayArray5244[anLocalInt_388_];
                            for (int anLocalInt_389_ = 0; anLocalInts.length > anLocalInt_389_; anLocalInt_389_++) {
                                int anLocalInt_390_ = anLocalInts[anLocalInt_389_];
                                if (aShortArray5215 == null || ((argument_360_ & aShortArray5215[anLocalInt_390_]) != 0)) {
                                    int anLocalInt_391_ = anIntArray5260[anLocalInt_390_];
                                    int anLocalInt_392_ = anIntArray5260[anLocalInt_390_ + 1];
                                    for (int anLocalInt_393_ = anLocalInt_391_; anLocalInt_393_ < anLocalInt_392_; anLocalInt_393_++) {
                                        int anLocalInt_394_ = (aShortArray5248[anLocalInt_393_] - 1);
                                        if (anLocalInt_394_ == -1)
                                            break;
                                        if (argument_358_ != 0) {
                                            int anLocalInt_395_ = (Node_Sub6.SINETABLE[argument_358_]);
                                            int anLocalInt_396_ = (Node_Sub6.COSINETABLE[argument_358_]);
                                            int anLocalInt_397_ = ((((aShortArray5219[anLocalInt_394_]) * anLocalInt_395_) + 16383 + (anLocalInt_396_ * (aShortArray5233[anLocalInt_394_]))) >> 14);
                                            aShortArray5219[anLocalInt_394_] = (short) ((-(anLocalInt_395_ * (aShortArray5233[anLocalInt_394_])) + ((anLocalInt_396_ * (aShortArray5219[anLocalInt_394_])) + 16383)) >> 14);
                                            aShortArray5233[anLocalInt_394_] = (short) anLocalInt_397_;
                                        }
                                        if (argument_356_ != 0) {
                                            int anLocalInt_398_ = (Node_Sub6.SINETABLE[argument_356_]);
                                            int anLocalInt_399_ = (Node_Sub6.COSINETABLE[argument_356_]);
                                            int anLocalInt_400_ = ((((aShortArray5219[anLocalInt_394_]) * anLocalInt_399_) + (-((aShortArray5239[anLocalInt_394_]) * anLocalInt_398_) + 16383)) >> 14);
                                            aShortArray5239[anLocalInt_394_] = (short) (((anLocalInt_398_ * (aShortArray5219[anLocalInt_394_])) + ((aShortArray5239[anLocalInt_394_]) * anLocalInt_399_) + 16383) >> 14);
                                            aShortArray5219[anLocalInt_394_] = (short) anLocalInt_400_;
                                        }
                                        if (argument_357_ != 0) {
                                            int anLocalInt_401_ = (Node_Sub6.SINETABLE[argument_357_]);
                                            int anLocalInt_402_ = (Node_Sub6.COSINETABLE[argument_357_]);
                                            int anLocalInt_403_ = ((((aShortArray5233[anLocalInt_394_]) * anLocalInt_402_) + 16383 + ((aShortArray5239[anLocalInt_394_]) * anLocalInt_401_)) >> 14);
                                            aShortArray5239[anLocalInt_394_] = (short) ((((aShortArray5239[anLocalInt_394_]) * anLocalInt_402_) + (-(anLocalInt_401_ * (aShortArray5233[anLocalInt_394_])) + 16383)) >> 14);
                                            aShortArray5233[anLocalInt_394_] = (short) anLocalInt_403_;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aGlInterleavedArray_5236 == null && aGlInterleavedArray_5254 != null)
                        ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                    if (aGlInterleavedArray_5236 != null)
                        ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
                }
            } else {
                int anLocalInt_404_ = argument_361_[9] << 4;
                int anLocalInt_405_ = argument_361_[10] << 4;
                int anLocalInt_406_ = argument_361_[11] << 4;
                int anLocalInt_407_ = argument_361_[12] << 4;
                int anLocalInt_408_ = argument_361_[13] << 4;
                int anLocalInt_409_ = argument_361_[14] << 4;
                if (Node_Sub31_Sub18.aBoolean5920) {
                    int anLocalInt_410_ = ((Node_Sub47_Sub8.anInt6194 * argument_361_[3] + 8192 + (argument_361_[0] * Node_Sub31_Sub23.anInt5945 + Class62_Sub16.anInt4415 * argument_361_[6])) >> 14);
                    int anLocalInt_411_ = ((argument_361_[4] * Node_Sub47_Sub8.anInt6194 + (Node_Sub31_Sub23.anInt5945 * argument_361_[1] - (-(Class62_Sub16.anInt4415 * argument_361_[7]) - 8192))) >> 14);
                    int anLocalInt_412_ = ((Node_Sub47_Sub8.anInt6194 * argument_361_[5] + Node_Sub31_Sub23.anInt5945 * argument_361_[2] - (-(Class62_Sub16.anInt4415 * argument_361_[8]) - 8192)) >> 14);
                    anLocalInt_410_ += anLocalInt_407_;
                    anLocalInt_411_ += anLocalInt_408_;
                    Node_Sub47_Sub8.anInt6194 = anLocalInt_411_;
                    Node_Sub31_Sub23.anInt5945 = anLocalInt_410_;
                    anLocalInt_412_ += anLocalInt_409_;
                    Node_Sub31_Sub18.aBoolean5920 = false;
                    Class62_Sub16.anInt4415 = anLocalInt_412_;
                }
                int[] anLocalInts = new int[9];
                int anLocalInt_413_ = Node_Sub6.COSINETABLE[argument_356_];
                int anLocalInt_414_ = Node_Sub6.SINETABLE[argument_356_];
                int anLocalInt_415_ = Node_Sub6.COSINETABLE[argument_357_];
                int anLocalInt_416_ = Node_Sub6.SINETABLE[argument_357_];
                int anLocalInt_417_ = Node_Sub6.COSINETABLE[argument_358_];
                int anLocalInt_418_ = Node_Sub6.SINETABLE[argument_358_];
                int anLocalInt_419_ = anLocalInt_417_ * anLocalInt_414_ + 8192 >> 14;
                int anLocalInt_420_ = anLocalInt_418_ * anLocalInt_414_ + 8192 >> 14;
                anLocalInts[3] = anLocalInt_418_ * anLocalInt_413_ + 8192 >> 14;
                anLocalInts[6] = (anLocalInt_420_ * anLocalInt_415_ + 8192 + -anLocalInt_416_ * anLocalInt_417_) >> 14;
                anLocalInts[7] = (anLocalInt_418_ * anLocalInt_416_ + anLocalInt_415_ * anLocalInt_419_ + 8192) >> 14;
                anLocalInts[5] = -anLocalInt_414_;
                anLocalInts[0] = (anLocalInt_420_ * anLocalInt_416_ + 8192 + anLocalInt_415_ * anLocalInt_417_) >> 14;
                anLocalInts[8] = anLocalInt_413_ * anLocalInt_415_ + 8192 >> 14;
                anLocalInts[4] = anLocalInt_417_ * anLocalInt_413_ + 8192 >> 14;
                anLocalInts[1] = (anLocalInt_419_ * anLocalInt_416_ + anLocalInt_418_ * -anLocalInt_415_ + 8192) >> 14;
                anLocalInts[2] = anLocalInt_413_ * anLocalInt_416_ + 8192 >> 14;
                int anLocalInt_421_ = ((anLocalInts[1] * -Node_Sub47_Sub8.anInt6194 + (-Node_Sub31_Sub23.anInt5945 * anLocalInts[0] + anLocalInts[2] * -Class62_Sub16.anInt4415 + 8192)) >> 14);
                int anLocalInt_422_ = ((-Node_Sub47_Sub8.anInt6194 * anLocalInts[4] + (-Node_Sub31_Sub23.anInt5945 * anLocalInts[3] + -Class62_Sub16.anInt4415 * anLocalInts[5]) + 8192) >> 14);
                int anLocalInt_423_ = ((-Node_Sub31_Sub23.anInt5945 * anLocalInts[6] + 8192 + -Node_Sub47_Sub8.anInt6194 * anLocalInts[7] + anLocalInts[8] * -Class62_Sub16.anInt4415) >> 14);
                int anLocalInt_424_ = Node_Sub31_Sub23.anInt5945 + anLocalInt_421_;
                int anLocalInt_425_ = Node_Sub47_Sub8.anInt6194 + anLocalInt_422_;
                int anLocalInt_426_ = Class62_Sub16.anInt4415 + anLocalInt_423_;
                int[] anLocalInts_427_ = new int[9];
                for (int anLocalInt_428_ = 0; anLocalInt_428_ < 3; anLocalInt_428_++) {
                    for (int anLocalInt_429_ = 0; anLocalInt_429_ < 3; anLocalInt_429_++) {
                        int anLocalInt_430_ = 0;
                        for (int anLocalInt_431_ = 0; anLocalInt_431_ < 3; anLocalInt_431_++)
                            anLocalInt_430_ += ((argument_361_[anLocalInt_431_ + anLocalInt_429_ * 3]) * anLocalInts[(anLocalInt_431_ + anLocalInt_428_ * 3)]);
                        anLocalInts_427_[anLocalInt_429_ + anLocalInt_428_ * 3] = anLocalInt_430_ + 8192 >> 14;
                    }
                }
                int anLocalInt_432_ = ((anLocalInts[2] * anLocalInt_409_ + (anLocalInt_407_ * anLocalInts[0] + anLocalInt_408_ * anLocalInts[1]) + 8192) >> 14);
                int anLocalInt_433_ = ((anLocalInt_408_ * anLocalInts[4] + (anLocalInts[3] * anLocalInt_407_ + anLocalInts[5] * anLocalInt_409_) + 8192) >> 14);
                int anLocalInt_434_ = ((anLocalInt_409_ * anLocalInts[8] + 8192 + (anLocalInts[7] * anLocalInt_408_ + anLocalInts[6] * anLocalInt_407_)) >> 14);
                anLocalInt_433_ += anLocalInt_425_;
                anLocalInt_432_ += anLocalInt_424_;
                anLocalInt_434_ += anLocalInt_426_;
                int[] anLocalInts_435_ = new int[9];
                for (int anLocalInt_436_ = 0; anLocalInt_436_ < 3; anLocalInt_436_++) {
                    for (int anLocalInt_437_ = 0; anLocalInt_437_ < 3; anLocalInt_437_++) {
                        int anLocalInt_438_ = 0;
                        for (int anLocalInt_439_ = 0; anLocalInt_439_ < 3; anLocalInt_439_++)
                            anLocalInt_438_ += ((argument_361_[anLocalInt_439_ + anLocalInt_436_ * 3]) * anLocalInts_427_[(anLocalInt_439_ * 3 + anLocalInt_437_)]);
                        anLocalInts_435_[anLocalInt_436_ * 3 + anLocalInt_437_] = anLocalInt_438_ + 8192 >> 14;
                    }
                }
                int anLocalInt_440_ = (anLocalInt_434_ * argument_361_[2] + (argument_361_[0] * anLocalInt_432_ + argument_361_[1] * anLocalInt_433_) + 8192) >> 14;
                int anLocalInt_441_ = ((anLocalInt_434_ * argument_361_[5] + anLocalInt_432_ * argument_361_[3] + argument_361_[4] * anLocalInt_433_ + 8192) >> 14);
                anLocalInt_441_ += anLocalInt_405_;
                anLocalInt_440_ += anLocalInt_404_;
                int anLocalInt_442_ = (argument_361_[8] * anLocalInt_434_ + (anLocalInt_432_ * argument_361_[6] + argument_361_[7] * anLocalInt_433_) + 8192) >> 14;
                anLocalInt_442_ += anLocalInt_406_;
                for (int anLocalInt_443_ = 0; anLocalInt_443_ < anLocalInt; anLocalInt_443_++) {
                    int anLocalInt_444_ = argument_355_[anLocalInt_443_];
                    if (anLocalInt_444_ < anIntArrayArray5244.length) {
                        int[] anLocalInts_445_ = anIntArrayArray5244[anLocalInt_444_];
                        for (int anLocalInt_446_ = 0; anLocalInt_446_ < anLocalInts_445_.length; anLocalInt_446_++) {
                            int anLocalInt_447_ = anLocalInts_445_[anLocalInt_446_];
                            if (aShortArray5215 == null || (argument_360_ & aShortArray5215[anLocalInt_447_]) != 0) {
                                int anLocalInt_448_ = (((anLocalInts_435_[0] * anIntArray5255[anLocalInt_447_]) + 8192 + (anIntArray5267[anLocalInt_447_] * anLocalInts_435_[1]) + (anLocalInts_435_[2] * anIntArray5216[anLocalInt_447_])) >> 14);
                                int anLocalInt_449_ = (((anIntArray5216[anLocalInt_447_] * anLocalInts_435_[5]) + ((anLocalInts_435_[4] * anIntArray5267[anLocalInt_447_]) + (anIntArray5255[anLocalInt_447_] * anLocalInts_435_[3])) + 8192) >> 14);
                                anLocalInt_449_ += anLocalInt_441_;
                                int anLocalInt_450_ = (((anLocalInts_435_[6] * anIntArray5255[anLocalInt_447_]) + 8192 + (anIntArray5267[anLocalInt_447_] * anLocalInts_435_[7]) + (anLocalInts_435_[8] * anIntArray5216[anLocalInt_447_])) >> 14);
                                anLocalInt_448_ += anLocalInt_440_;
                                anIntArray5255[anLocalInt_447_] = anLocalInt_448_;
                                anLocalInt_450_ += anLocalInt_442_;
                                anIntArray5267[anLocalInt_447_] = anLocalInt_449_;
                                anIntArray5216[anLocalInt_447_] = anLocalInt_450_;
                            }
                        }
                    }
                }
            }
        } else if (argument_354_ == 3) {
            if (argument_361_ != null) {
                int anLocalInt_451_ = argument_361_[9] << 4;
                int anLocalInt_452_ = argument_361_[10] << 4;
                int anLocalInt_453_ = argument_361_[11] << 4;
                int anLocalInt_454_ = argument_361_[12] << 4;
                int anLocalInt_455_ = argument_361_[13] << 4;
                int anLocalInt_456_ = argument_361_[14] << 4;
                if (Node_Sub31_Sub18.aBoolean5920) {
                    int anLocalInt_457_ = ((Class62_Sub16.anInt4415 * argument_361_[6] + argument_361_[0] * Node_Sub31_Sub23.anInt5945 - (-(argument_361_[3] * Node_Sub47_Sub8.anInt6194) - 8192)) >> 14);
                    int anLocalInt_458_ = (argument_361_[7] * Class62_Sub16.anInt4415 + (argument_361_[1] * Node_Sub31_Sub23.anInt5945 + argument_361_[4] * Node_Sub47_Sub8.anInt6194 + 8192)) >> 14;
                    anLocalInt_458_ += anLocalInt_455_;
                    int anLocalInt_459_ = ((argument_361_[2] * Node_Sub31_Sub23.anInt5945 - (-(Node_Sub47_Sub8.anInt6194 * argument_361_[5]) - argument_361_[8] * Class62_Sub16.anInt4415) + 8192) >> 14);
                    anLocalInt_457_ += anLocalInt_454_;
                    anLocalInt_459_ += anLocalInt_456_;
                    Node_Sub47_Sub8.anInt6194 = anLocalInt_458_;
                    Node_Sub31_Sub23.anInt5945 = anLocalInt_457_;
                    Node_Sub31_Sub18.aBoolean5920 = false;
                    Class62_Sub16.anInt4415 = anLocalInt_459_;
                }
                int anLocalInt_460_ = argument_356_ << 15 >> 7;
                int anLocalInt_461_ = argument_357_ << 15 >> 7;
                int anLocalInt_462_ = argument_358_ << 15 >> 7;
                int anLocalInt_463_ = (-Node_Sub31_Sub23.anInt5945 * anLocalInt_460_ + 8192 >> 14);
                int anLocalInt_464_ = (anLocalInt_461_ * -Node_Sub47_Sub8.anInt6194 + 8192 >> 14);
                int anLocalInt_465_ = -Class62_Sub16.anInt4415 * anLocalInt_462_ + 8192 >> 14;
                int anLocalInt_466_ = anLocalInt_463_ + Node_Sub31_Sub23.anInt5945;
                int anLocalInt_467_ = anLocalInt_464_ + Node_Sub47_Sub8.anInt6194;
                int anLocalInt_468_ = Class62_Sub16.anInt4415 + anLocalInt_465_;
                int[] anLocalInts = new int[9];
                anLocalInts[1] = argument_361_[3] * anLocalInt_460_ + 8192 >> 14;
                anLocalInts[2] = anLocalInt_460_ * argument_361_[6] + 8192 >> 14;
                anLocalInts[0] = argument_361_[0] * anLocalInt_460_ + 8192 >> 14;
                anLocalInts[4] = argument_361_[4] * anLocalInt_461_ + 8192 >> 14;
                anLocalInts[3] = anLocalInt_461_ * argument_361_[1] + 8192 >> 14;
                anLocalInts[6] = argument_361_[2] * anLocalInt_462_ + 8192 >> 14;
                anLocalInts[5] = argument_361_[7] * anLocalInt_461_ + 8192 >> 14;
                anLocalInts[7] = argument_361_[5] * anLocalInt_462_ + 8192 >> 14;
                anLocalInts[8] = anLocalInt_462_ * argument_361_[8] + 8192 >> 14;
                int anLocalInt_469_ = anLocalInt_454_ * anLocalInt_460_ + 8192 >> 14;
                int anLocalInt_470_ = anLocalInt_455_ * anLocalInt_461_ + 8192 >> 14;
                anLocalInt_469_ += anLocalInt_466_;
                anLocalInt_470_ += anLocalInt_467_;
                int anLocalInt_471_ = anLocalInt_462_ * anLocalInt_456_ + 8192 >> 14;
                anLocalInt_471_ += anLocalInt_468_;
                int[] anLocalInts_472_ = new int[9];
                for (int anLocalInt_473_ = 0; anLocalInt_473_ < 3; anLocalInt_473_++) {
                    for (int anLocalInt_474_ = 0; anLocalInt_474_ < 3; anLocalInt_474_++) {
                        int anLocalInt_475_ = 0;
                        for (int anLocalInt_476_ = 0; anLocalInt_476_ < 3; anLocalInt_476_++)
                            anLocalInt_475_ += ((argument_361_[anLocalInt_473_ * 3 + anLocalInt_476_]) * anLocalInts[(anLocalInt_476_ * 3 + anLocalInt_474_)]);
                        anLocalInts_472_[anLocalInt_474_ + anLocalInt_473_ * 3] = anLocalInt_475_ + 8192 >> 14;
                    }
                }
                int anLocalInt_477_ = (anLocalInt_471_ * argument_361_[2] + (anLocalInt_469_ * argument_361_[0] + anLocalInt_470_ * argument_361_[1]) + 8192) >> 14;
                int anLocalInt_478_ = ((argument_361_[3] * anLocalInt_469_ - (-(anLocalInt_470_ * argument_361_[4]) - anLocalInt_471_ * argument_361_[5] - 8192)) >> 14);
                anLocalInt_477_ += anLocalInt_451_;
                anLocalInt_478_ += anLocalInt_452_;
                int anLocalInt_479_ = (argument_361_[8] * anLocalInt_471_ + (argument_361_[6] * anLocalInt_469_ + anLocalInt_470_ * argument_361_[7]) + 8192) >> 14;
                anLocalInt_479_ += anLocalInt_453_;
                for (int anLocalInt_480_ = 0; anLocalInt > anLocalInt_480_; anLocalInt_480_++) {
                    int anLocalInt_481_ = argument_355_[anLocalInt_480_];
                    if (anLocalInt_481_ < anIntArrayArray5244.length) {
                        int[] anLocalInts_482_ = anIntArrayArray5244[anLocalInt_481_];
                        for (int anLocalInt_483_ = 0; anLocalInt_483_ < anLocalInts_482_.length; anLocalInt_483_++) {
                            int anLocalInt_484_ = anLocalInts_482_[anLocalInt_483_];
                            if (aShortArray5215 == null || (argument_360_ & aShortArray5215[anLocalInt_484_]) != 0) {
                                int anLocalInt_485_ = (((anLocalInts_472_[1] * anIntArray5267[anLocalInt_484_]) + ((anLocalInts_472_[0] * anIntArray5255[anLocalInt_484_]) - (-(anIntArray5216[anLocalInt_484_] * anLocalInts_472_[2]) - 8192))) >> 14);
                                int anLocalInt_486_ = ((anLocalInts_472_[3] * anIntArray5255[anLocalInt_484_]) + ((anLocalInts_472_[4] * anIntArray5267[anLocalInt_484_]) + (anLocalInts_472_[5] * anIntArray5216[anLocalInt_484_]) + 8192)) >> 14;
                                anLocalInt_486_ += anLocalInt_478_;
                                int anLocalInt_487_ = (((anIntArray5267[anLocalInt_484_] * anLocalInts_472_[7]) + (anLocalInts_472_[6] * anIntArray5255[anLocalInt_484_]) + ((anIntArray5216[anLocalInt_484_] * anLocalInts_472_[8]) + 8192)) >> 14);
                                anLocalInt_485_ += anLocalInt_477_;
                                anIntArray5255[anLocalInt_484_] = anLocalInt_485_;
                                anLocalInt_487_ += anLocalInt_479_;
                                anIntArray5267[anLocalInt_484_] = anLocalInt_486_;
                                anIntArray5216[anLocalInt_484_] = anLocalInt_487_;
                            }
                        }
                    }
                }
            } else {
                for (int anLocalInt_488_ = 0; anLocalInt > anLocalInt_488_; anLocalInt_488_++) {
                    int anLocalInt_489_ = argument_355_[anLocalInt_488_];
                    if (anLocalInt_489_ < anIntArrayArray5244.length) {
                        int[] anLocalInts = anIntArrayArray5244[anLocalInt_489_];
                        for (int anLocalInt_490_ = 0; anLocalInt_490_ < anLocalInts.length; anLocalInt_490_++) {
                            int anLocalInt_491_ = anLocalInts[anLocalInt_490_];
                            if (aShortArray5215 == null || (argument_360_ & aShortArray5215[anLocalInt_491_]) != 0) {
                                anIntArray5255[anLocalInt_491_] -= Node_Sub31_Sub23.anInt5945;
                                anIntArray5267[anLocalInt_491_] -= Node_Sub47_Sub8.anInt6194;
                                anIntArray5216[anLocalInt_491_] -= Class62_Sub16.anInt4415;
                                anIntArray5255[anLocalInt_491_] = (argument_356_ * anIntArray5255[anLocalInt_491_]) >> 7;
                                anIntArray5267[anLocalInt_491_] = (anIntArray5267[anLocalInt_491_] * argument_357_) >> 7;
                                anIntArray5216[anLocalInt_491_] = (anIntArray5216[anLocalInt_491_] * argument_358_) >> 7;
                                anIntArray5255[anLocalInt_491_] += Node_Sub31_Sub23.anInt5945;
                                anIntArray5267[anLocalInt_491_] += Node_Sub47_Sub8.anInt6194;
                                anIntArray5216[anLocalInt_491_] += Class62_Sub16.anInt4415;
                            }
                        }
                    }
                }
            }
        } else if (argument_354_ == 5) {
            if (anIntArrayArray5228 != null) {
                for (int anLocalInt_492_ = 0; anLocalInt_492_ < anLocalInt; anLocalInt_492_++) {
                    int anLocalInt_493_ = argument_355_[anLocalInt_492_];
                    if (anLocalInt_493_ < anIntArrayArray5228.length) {
                        int[] anLocalInts = anIntArrayArray5228[anLocalInt_493_];
                        for (int anLocalInt_494_ = 0; anLocalInt_494_ < anLocalInts.length; anLocalInt_494_++) {
                            int anLocalInt_495_ = anLocalInts[anLocalInt_494_];
                            if (aShortArray5221 == null || (argument_360_ & aShortArray5221[anLocalInt_495_]) != 0) {
                                int anLocalInt_496_ = (argument_356_ * 8 + (aByteArray5230[anLocalInt_495_] & 0xff));
                                if (anLocalInt_496_ >= 0) {
                                    if (anLocalInt_496_ > 255)
                                        anLocalInt_496_ = 255;
                                } else
                                    anLocalInt_496_ = 0;
                                aByteArray5230[anLocalInt_495_] = (byte) anLocalInt_496_;
                                if (aGlInterleavedArray_5254 != null)
                                    ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                            }
                        }
                    }
                }
                if (aClass173Array5210 != null) {
                    for (int anLocalInt_497_ = 0; anLocalInt_497_ < anInt5237; anLocalInt_497_++) {
                        Class173 class173 = aClass173Array5210[anLocalInt_497_];
                        Class359 class359 = aClass359Array5246[anLocalInt_497_];
                        ((Class359) class359).anInt3037 = (-((aByteArray5230[((Class173) class173).anInt1282]) & 0xff) + 255 << 24 | ((Class359) class359).anInt3037 & 0xffffff);
                    }
                }
            }
        } else if (argument_354_ == 7) {
            if (anIntArrayArray5228 != null) {
                for (int anLocalInt_498_ = 0; anLocalInt_498_ < anLocalInt; anLocalInt_498_++) {
                    int anLocalInt_499_ = argument_355_[anLocalInt_498_];
                    if (anIntArrayArray5228.length > anLocalInt_499_) {
                        int[] anLocalInts = anIntArrayArray5228[anLocalInt_499_];
                        for (int anLocalInt_500_ = 0; anLocalInts.length > anLocalInt_500_; anLocalInt_500_++) {
                            int anLocalInt_501_ = anLocalInts[anLocalInt_500_];
                            if (aShortArray5221 == null || (argument_360_ & aShortArray5221[anLocalInt_501_]) != 0) {
                                int anLocalInt_502_ = (aShortArray5212[anLocalInt_501_] & 0xffff);
                                int anLocalInt_503_ = (anLocalInt_502_ & 0xfd1f) >> 10;
                                int anLocalInt_504_ = anLocalInt_502_ >> 7 & 0x7;
                                anLocalInt_504_ += argument_357_ / 4;
                                int anLocalInt_505_ = anLocalInt_502_ & 0x7f;
                                anLocalInt_503_ = argument_356_ + anLocalInt_503_ & 0x3f;
                                if (anLocalInt_504_ < 0)
                                    anLocalInt_504_ = 0;
                                else if (anLocalInt_504_ > 7)
                                    anLocalInt_504_ = 7;
                                anLocalInt_505_ += argument_358_;
                                if (anLocalInt_505_ >= 0) {
                                    if (anLocalInt_505_ > 127)
                                        anLocalInt_505_ = 127;
                                } else
                                    anLocalInt_505_ = 0;
                                aShortArray5212[anLocalInt_501_] = (short) (MathStatics.OR((MathStatics.OR(anLocalInt_504_ << 7, anLocalInt_503_ << 10)), anLocalInt_505_));
                                if (aGlInterleavedArray_5254 != null)
                                    ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
                            }
                        }
                    }
                }
                if (aClass173Array5210 != null) {
                    for (int anLocalInt_506_ = 0; anInt5237 > anLocalInt_506_; anLocalInt_506_++) {
                        Class173 class173 = aClass173Array5210[anLocalInt_506_];
                        Class359 class359 = aClass359Array5246[anLocalInt_506_];
                        ((Class359) class359).anInt3037 = (((HslToRgb.table[aShortArray5212[(((Class173) class173).anInt1282)] & 0xffff]) & 0xffffff) | ((Class359) class359).anInt3037 & ~0xffffff);
                    }
                }
            }
        } else if (argument_354_ == 8) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_507_ = 0; anLocalInt_507_ < anLocalInt; anLocalInt_507_++) {
                    int anLocalInt_508_ = argument_355_[anLocalInt_507_];
                    if (anLocalInt_508_ < anIntArrayArray5227.length) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_508_];
                        for (int anLocalInt_509_ = 0; anLocalInts.length > anLocalInt_509_; anLocalInt_509_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_509_]]);
                            ((Class359) class359).anInt3039 += argument_356_;
                            ((Class359) class359).anInt3043 += argument_357_;
                        }
                    }
                }
            }
        } else if (argument_354_ == 10) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_510_ = 0; anLocalInt > anLocalInt_510_; anLocalInt_510_++) {
                    int anLocalInt_511_ = argument_355_[anLocalInt_510_];
                    if (anLocalInt_511_ < anIntArrayArray5227.length) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_511_];
                        for (int anLocalInt_512_ = 0; anLocalInt_512_ < anLocalInts.length; anLocalInt_512_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_512_]]);
                            ((Class359) class359).anInt3041 = (((Class359) class359).anInt3041 * argument_357_) >> 7;
                            ((Class359) class359).anInt3036 = (argument_356_ * ((Class359) class359).anInt3036) >> 7;
                        }
                    }
                }
            }
        } else if (argument_354_ == 9) {
            if (anIntArrayArray5227 != null) {
                for (int anLocalInt_513_ = 0; anLocalInt_513_ < anLocalInt; anLocalInt_513_++) {
                    int anLocalInt_514_ = argument_355_[anLocalInt_513_];
                    if (anIntArrayArray5227.length > anLocalInt_514_) {
                        int[] anLocalInts = anIntArrayArray5227[anLocalInt_514_];
                        for (int anLocalInt_515_ = 0; anLocalInt_515_ < anLocalInts.length; anLocalInt_515_++) {
                            Class359 class359 = (aClass359Array5246[anLocalInts[anLocalInt_515_]]);
                            ((Class359) class359).anInt3040 = (((Class359) class359).anInt3040 + argument_356_) & 0x3fff;
                        }
                    }
                }
            }
        }
    }

    private final void method2723(boolean argument_516_) {
        if (aBoolean5226) {
            aBoolean5226 = false;
            if (aClass38Array5263 == null && aClass185Array5243 == null && aClass173Array5210 == null && !Node_Sub47_Sub12.method1141(anInt5231, -16730, anInt5218)) {
                boolean anLocalBoolean = false;
                boolean anLocalBoolean_517_ = false;
                if (anIntArray5255 != null && !Class47.method449((byte) -58, anInt5218, anInt5231)) {
                    if (aGlInterleavedArray_5241 == null || (((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer != null)) {
                        anLocalBoolean = true;
                        if (!aBoolean5247)
                            method2718(-101);
                    } else
                        aBoolean5226 = true;
                }
                boolean anLocalBoolean_518_ = false;
                if (anIntArray5267 != null && !DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1866(anInt5218, -87, anInt5231)) {
                    if (aGlInterleavedArray_5241 != null && (((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer == null))
                        aBoolean5226 = true;
                    else {
                        anLocalBoolean_517_ = true;
                        if (!aBoolean5247)
                            method2718(-87);
                    }
                }
                if (anIntArray5216 != null && !Class2_Sub8.method209(anInt5231, anInt5218, false)) {
                    if (aGlInterleavedArray_5241 == null || (((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer != null)) {
                        anLocalBoolean_518_ = true;
                        if (!aBoolean5247)
                            method2718(-101);
                    } else
                        aBoolean5226 = true;
                }
                if (anLocalBoolean_518_)
                    anIntArray5216 = null;
                if (anLocalBoolean_517_)
                    anIntArray5267 = null;
                if (anLocalBoolean)
                    anIntArray5255 = null;
            }
            if (aShortArray5248 != null && anIntArray5255 == null && anIntArray5267 == null && anIntArray5216 == null) {
                aShortArray5248 = null;
                anIntArray5260 = null;
            }
            if (aByteArray5253 != null && !Class223.method3041(anInt5218, anInt5231, (byte) 83)) {
                if (aGlInterleavedArray_5236 != null) {
                    if (((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer != null) {
                        aShortArray5233 = aShortArray5219 = aShortArray5239 = null;
                        aByteArray5253 = null;
                    } else
                        aBoolean5226 = true;
                } else if (aGlInterleavedArray_5254 != null && (((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer == null))
                    aBoolean5226 = true;
                else {
                    aByteArray5253 = null;
                    aShortArray5233 = aShortArray5219 = aShortArray5239 = null;
                }
            }
            if (aShortArray5212 != null && !Class53.method479(anInt5218, anInt5231, (byte) 126)) {
                if (aGlInterleavedArray_5254 != null && ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer == null)
                    aBoolean5226 = true;
                else
                    aShortArray5212 = null;
            }
            if (aByteArray5230 != null && !Statics.method3904(anInt5218, 43, anInt5231)) {
                if (aGlInterleavedArray_5254 == null || ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer != null)
                    aByteArray5230 = null;
                else
                    aBoolean5226 = true;
            }
            if (aFloatArray5234 != null && !Class62_Sub29.method1475(0, anInt5231, anInt5218)) {
                if (aGlInterleavedArray_5225 != null && ((GlInterleavedArray) aGlInterleavedArray_5225).arrayBuffer == null)
                    aBoolean5226 = true;
                else
                    aFloatArray5234 = aFloatArray5256 = null;
            }
            if (aShortArray5238 != null && !Class189.method2872(anInt5218, 69, anInt5231)) {
                if (aGlInterleavedArray_5254 == null || ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer != null)
                    aShortArray5238 = null;
                else
                    aBoolean5226 = true;
            }
            if (aShortArray5250 != null && !Class143.method2510(anInt5231, (byte) 27, anInt5218)) {
                if ((aClass121_5249 != null && ((Class121) aClass121_5249).anGlElementBuffer_982 == null) || aGlInterleavedArray_5254 != null && (((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer) == null)
                    aBoolean5226 = true;
                else
                    aShortArray5250 = aShortArray5220 = aShortArray5223 = null;
            }
            if (anIntArrayArray5228 != null && !Class385.method4121(anInt5218, anInt5231, -1)) {
                anIntArrayArray5228 = null;
                aShortArray5221 = null;
            }
            if (anIntArrayArray5244 != null && !Class91.method1685(32, anInt5218, anInt5231)) {
                aShortArray5215 = null;
                anIntArrayArray5244 = null;
            }
            if (anIntArrayArray5227 != null && !DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1864(anInt5231, (byte) -119, anInt5218))
                anIntArrayArray5227 = null;
            if (argument_516_ != true)
                aBoolean5247 = true;
            if (anIntArray5266 != null && (anInt5218 & 0x800) == 0 && (anInt5218 & 0x40000) == 0)
                anIntArray5266 = null;
        }
    }

    final void method2640(Class350 argument_519_, DoublyLinkedNodeP2_Sub9 argument_520_, int argument_521_) {
        if (anInt5268 != 0) {
            Class350_Sub3 class350_sub3 = ((GlToolkit) aClass_ha_Sub3_5257).aClass350_Sub3_4881;
            if (!aBoolean5247)
                method2718(-86);
            Class350_Sub3 class350_sub3_522_ = (Class350_Sub3) argument_519_;
            Statics.aFloat5821 = ((((Class350_Sub3) class350_sub3).aFloat5461 * ((Class350_Sub3) class350_sub3_522_).aFloat5462) + ((((Class350_Sub3) class350_sub3_522_).aFloat5467 * ((Class350_Sub3) class350_sub3).aFloat5465) + (((Class350_Sub3) class350_sub3).aFloat5455 * ((Class350_Sub3) class350_sub3_522_).aFloat5459)) + ((Class350_Sub3) class350_sub3).aFloat5462);
            Class48.aFloat349 = ((((Class350_Sub3) class350_sub3_522_).aFloat5465 * ((Class350_Sub3) class350_sub3).aFloat5461) + ((((Class350_Sub3) class350_sub3).aFloat5455 * ((Class350_Sub3) class350_sub3_522_).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5465 * ((Class350_Sub3) class350_sub3_522_).aFloat5456)));
            float f = (Statics.aFloat5821 + (float) aShort5208 * Class48.aFloat349);
            float f_523_ = (Statics.aFloat5821 + Class48.aFloat349 * (float) aShort5222);
            float f_524_;
            float f_525_;
            if (!(f > f_523_)) {
                f_524_ = (float) -aShort5265 + f;
                f_525_ = (float) aShort5265 + f_523_;
            } else {
                f_524_ = f_523_ - (float) aShort5265;
                f_525_ = f + (float) aShort5265;
            }
            if (!(f_524_ >= ((GlToolkit) aClass_ha_Sub3_5257).aFloat4964) && !(f_525_ <= (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4920))) {
                Class373.aFloat3200 = ((((Class350_Sub3) class350_sub3).aFloat5458 * ((Class350_Sub3) class350_sub3_522_).aFloat5460) + (((Class350_Sub3) class350_sub3_522_).aFloat5456 * ((Class350_Sub3) class350_sub3).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5463 * ((Class350_Sub3) class350_sub3_522_).aFloat5465));
                Statics.aFloat95 = ((((Class350_Sub3) class350_sub3).aFloat5458 * ((Class350_Sub3) class350_sub3_522_).aFloat5459) + (((Class350_Sub3) class350_sub3_522_).aFloat5467 * ((Class350_Sub3) class350_sub3).aFloat5460) + (((Class350_Sub3) class350_sub3).aFloat5463 * ((Class350_Sub3) class350_sub3_522_).aFloat5462) + ((Class350_Sub3) class350_sub3).aFloat5459);
                float f_526_ = (Class373.aFloat3200 * (float) aShort5208 + Statics.aFloat95);
                float f_527_ = (Class373.aFloat3200 * (float) aShort5222 + Statics.aFloat95);
                float f_528_;
                float f_529_;
                if (!(f_527_ < f_526_)) {
                    f_528_ = (((float) -aShort5265 + f_526_) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900));
                    f_529_ = (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * (f_527_ + (float) aShort5265);
                } else {
                    f_528_ = ((f_527_ - (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900));
                    f_529_ = (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * ((float) aShort5265 + f_526_);
                }
                if (!(((GlToolkit) aClass_ha_Sub3_5257).aFloat4915 <= f_528_ / f_525_) && !(f_529_ / f_525_ <= (((GlToolkit) aClass_ha_Sub3_5257).aFloat4952))) {
                    Statics.aFloat6387 = ((((Class350_Sub3) class350_sub3).aFloat5456 * ((Class350_Sub3) class350_sub3_522_).aFloat5456) + (((Class350_Sub3) class350_sub3_522_).aFloat5460 * ((Class350_Sub3) class350_sub3).aFloat5457) + (((Class350_Sub3) class350_sub3).aFloat5466 * (((Class350_Sub3) class350_sub3_522_).aFloat5465)));
                    Class41.aFloat303 = (((Class350_Sub3) class350_sub3).aFloat5467 + ((((Class350_Sub3) class350_sub3_522_).aFloat5467 * ((Class350_Sub3) class350_sub3).aFloat5456) + ((((Class350_Sub3) class350_sub3_522_).aFloat5459) * ((Class350_Sub3) class350_sub3).aFloat5457) + (((Class350_Sub3) class350_sub3).aFloat5466 * (((Class350_Sub3) class350_sub3_522_).aFloat5462))));
                    float f_530_ = Class41.aFloat303 + (Statics.aFloat6387 * (float) aShort5208);
                    float f_531_ = ((float) aShort5222 * Statics.aFloat6387 + Class41.aFloat303);
                    float f_532_;
                    float f_533_;
                    if (!(f_530_ > f_531_)) {
                        f_533_ = ((f_530_ - (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956));
                        f_532_ = ((float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * (f_531_ + (float) aShort5265));
                    } else {
                        f_532_ = ((f_530_ + (float) aShort5265) * (float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956));
                        f_533_ = ((float) (((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * (f_531_ - (float) aShort5265));
                    }
                    if (!(((GlToolkit) aClass_ha_Sub3_5257).aFloat4899 <= f_533_ / f_525_) && !(((GlToolkit) aClass_ha_Sub3_5257).aFloat4934 >= f_532_ / f_525_)) {
                        if (argument_520_ != null || aClass173Array5210 != null) {
                            DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677 = (((((Class350_Sub3) class350_sub3_522_).aFloat5455) * (((Class350_Sub3) class350_sub3).aFloat5461)) + (((((Class350_Sub3) class350_sub3).aFloat5455) * (((Class350_Sub3) class350_sub3_522_).aFloat5458)) + ((((Class350_Sub3) class350_sub3_522_).aFloat5457) * (((Class350_Sub3) class350_sub3).aFloat5465))));
                            Class225.aFloat1633 = (((((Class350_Sub3) class350_sub3_522_).aFloat5455) * (((Class350_Sub3) class350_sub3).aFloat5466)) + (((((Class350_Sub3) class350_sub3).aFloat5457) * (((Class350_Sub3) class350_sub3_522_).aFloat5458)) + ((((Class350_Sub3) class350_sub3).aFloat5456) * ((Class350_Sub3) class350_sub3_522_).aFloat5457)));
                            Class307_Sub1.aFloat5415 = (((((Class350_Sub3) class350_sub3_522_).aFloat5455) * (((Class350_Sub3) class350_sub3).aFloat5463)) + (((((Class350_Sub3) class350_sub3_522_).aFloat5457) * (((Class350_Sub3) class350_sub3).aFloat5460)) + ((((Class350_Sub3) class350_sub3).aFloat5458) * ((Class350_Sub3) class350_sub3_522_).aFloat5458)));
                            Class140.aFloat1093 = ((((Class350_Sub3) class350_sub3).aFloat5456 * (((Class350_Sub3) class350_sub3_522_).aFloat5466)) + ((((Class350_Sub3) class350_sub3_522_).aFloat5463) * (((Class350_Sub3) class350_sub3).aFloat5457)) + ((((Class350_Sub3) class350_sub3).aFloat5466) * (((Class350_Sub3) class350_sub3_522_).aFloat5461)));
                            Class347.aFloat3598 = (((((Class350_Sub3) class350_sub3_522_).aFloat5461) * (((Class350_Sub3) class350_sub3).aFloat5463)) + (((((Class350_Sub3) class350_sub3_522_).aFloat5466) * (((Class350_Sub3) class350_sub3).aFloat5460)) + ((((Class350_Sub3) class350_sub3_522_).aFloat5463) * (((Class350_Sub3) class350_sub3).aFloat5458))));
                            Class4.aFloat59 = (((((Class350_Sub3) class350_sub3_522_).aFloat5466) * (((Class350_Sub3) class350_sub3).aFloat5465)) + ((((Class350_Sub3) class350_sub3_522_).aFloat5463) * (((Class350_Sub3) class350_sub3).aFloat5455)) + ((((Class350_Sub3) class350_sub3_522_).aFloat5461) * (((Class350_Sub3) class350_sub3).aFloat5461)));
                        }
                        if (argument_520_ != null) {
                            boolean anLocalBoolean = false;
                            boolean anLocalBoolean_534_ = true;
                            int anLocalInt = aShort5229 + aShort5242 >> 1;
                            int anLocalInt_535_ = aShort5235 + aShort5269 >> 1;
                            int anLocalInt_536_ = (int) (((float) anLocalInt_535_ * Class347.aFloat3598) + (((float) aShort5208 * Class373.aFloat3200) + (((float) anLocalInt * Class307_Sub1.aFloat5415) + Statics.aFloat95)));
                            int anLocalInt_537_ = (int) (((float) aShort5208 * Statics.aFloat6387) + (((float) anLocalInt * Class225.aFloat1633) + Class41.aFloat303) + ((float) anLocalInt_535_ * Class140.aFloat1093));
                            int anLocalInt_538_ = (int) (((float) anLocalInt_535_ * Class4.aFloat59) + (Statics.aFloat5821 + ((DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677) * (float) anLocalInt) + (Class48.aFloat349 * (float) aShort5208)));
                            if (((GlToolkit) aClass_ha_Sub3_5257).anInt4920 <= anLocalInt_538_) {
                                ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4589 = (((((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * anLocalInt_537_ / anLocalInt_538_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4972));
                                ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4588 = ((anLocalInt_536_ * ((GlToolkit) aClass_ha_Sub3_5257).anInt4900 / anLocalInt_538_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4993));
                            } else
                                anLocalBoolean = true;
                            int anLocalInt_539_ = (int) (((float) anLocalInt_535_ * Class347.aFloat3598) + ((Class373.aFloat3200 * (float) aShort5222) + (Statics.aFloat95 + (Class307_Sub1.aFloat5415 * (float) anLocalInt))));
                            int anLocalInt_540_ = (int) (((float) anLocalInt_535_ * Class140.aFloat1093) + (Class41.aFloat303 + (Class225.aFloat1633 * (float) anLocalInt) + (Statics.aFloat6387 * (float) aShort5222)));
                            int anLocalInt_541_ = (int) (Statics.aFloat5821 + ((float) anLocalInt * (DoublyLinkedNode_Sub51_Sub19_Sub1.aFloat6677)) + (Class48.aFloat349 * (float) aShort5222) + (Class4.aFloat59 * (float) anLocalInt_535_));
                            if (anLocalInt_541_ < (((GlToolkit) aClass_ha_Sub3_5257).anInt4920))
                                anLocalBoolean = true;
                            else {
                                ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4590 = ((anLocalInt_539_ * ((GlToolkit) aClass_ha_Sub3_5257).anInt4900 / anLocalInt_541_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4993));
                                ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4587 = (((((GlToolkit) aClass_ha_Sub3_5257).anInt4956) * anLocalInt_540_ / anLocalInt_541_) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4972));
                            }
                            if (anLocalBoolean) {
                                if ((anLocalInt_538_ < (((GlToolkit) aClass_ha_Sub3_5257).anInt4920)) && anLocalInt_541_ < (((GlToolkit) aClass_ha_Sub3_5257).anInt4920))
                                    anLocalBoolean_534_ = false;
                                else if ((((GlToolkit) aClass_ha_Sub3_5257).anInt4920) > anLocalInt_538_) {
                                    int anLocalInt_542_ = (((anLocalInt_541_ - ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) << 16) / (-anLocalInt_538_ + anLocalInt_541_));
                                    int anLocalInt_543_ = (anLocalInt_539_ + ((anLocalInt_542_ * (-anLocalInt_536_ + anLocalInt_539_)) >> 16));
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4588 = ((anLocalInt_543_ * ((GlToolkit) aClass_ha_Sub3_5257).anInt4900 / ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) + ((GlToolkit) aClass_ha_Sub3_5257).anInt4993);
                                    int anLocalInt_544_ = (((anLocalInt_542_ * (-anLocalInt_537_ + anLocalInt_540_)) >> 16) + anLocalInt_540_);
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4589 = ((((GlToolkit) aClass_ha_Sub3_5257).anInt4956 * anLocalInt_544_ / ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) + ((GlToolkit) aClass_ha_Sub3_5257).anInt4972);
                                } else if (anLocalInt_541_ < ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) {
                                    int anLocalInt_545_ = (((anLocalInt_538_ - ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) << 16) / (-anLocalInt_541_ + anLocalInt_538_));
                                    int anLocalInt_546_ = ((((-anLocalInt_539_ + anLocalInt_536_) * anLocalInt_545_) >> 16) + anLocalInt_536_);
                                    int anLocalInt_547_ = ((((-anLocalInt_540_ + anLocalInt_537_) * anLocalInt_545_) >> 16) + anLocalInt_537_);
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4588 = ((((GlToolkit) aClass_ha_Sub3_5257).anInt4900 * anLocalInt_546_ / ((GlToolkit) aClass_ha_Sub3_5257).anInt4920) + ((GlToolkit) aClass_ha_Sub3_5257).anInt4993);
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4589 = (((GlToolkit) aClass_ha_Sub3_5257).anInt4972 + (((GlToolkit) aClass_ha_Sub3_5257).anInt4956 * anLocalInt_547_ / (((GlToolkit) aClass_ha_Sub3_5257).anInt4920)));
                                }
                            }
                            if (anLocalBoolean_534_) {
                                ((DoublyLinkedNodeP2_Sub9) argument_520_).aBoolean4591 = true;
                                if (anLocalInt_538_ <= anLocalInt_541_)
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4586 = (-(((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4590) + ((GlToolkit) aClass_ha_Sub3_5257).anInt4993 + (((GlToolkit) aClass_ha_Sub3_5257).anInt4900 * (aShort5265 + anLocalInt_539_) / anLocalInt_541_));
                                else
                                    ((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4586 = (-(((DoublyLinkedNodeP2_Sub9) argument_520_).anInt4588) + (((GlToolkit) aClass_ha_Sub3_5257).anInt4993 + ((((GlToolkit) aClass_ha_Sub3_5257).anInt4900) * (anLocalInt_536_ + aShort5265) / anLocalInt_538_)));
                            }
                        }
                        aClass_ha_Sub3_5257.setupConfig8();
                        aClass_ha_Sub3_5257.method2336(45, class350_sub3_522_);
                        method2717(1559402986);
                        aClass_ha_Sub3_5257.popMatrix();
                        method2721(58);
                    }
                }
            }
        }
    }

    final boolean method2653() {
        if (aShortArray5238 == null)
            return true;
        for (int anLocalInt = 0; anLocalInt < aShortArray5238.length; anLocalInt++) {
            if (aShortArray5238[anLocalInt] != -1 && !((GraphicsToolkit) aClass_ha_Sub3_5257).textureSource.method9(true, aShortArray5238[anLocalInt]))
                return false;
        }
        return true;
    }

    private final Class167 method2724(Class167_Sub3 argument_548_, boolean argument_549_, Class167_Sub3 argument_550_, boolean argument_551_, int argument_552_, int argument_553_) {
        argument_550_.aBoolean5264 = aBoolean5264;
        argument_550_.anInt5224 = anInt5224;
        argument_550_.anInt5211 = anInt5211;
        argument_550_.anInt5231 = anInt5231;
        argument_550_.anInt5213 = anInt5213;
        argument_550_.anInt5218 = argument_553_;
        argument_550_.anInt5245 = anInt5245;
        argument_550_.anInt5237 = anInt5237;
        argument_550_.anInt5268 = anInt5268;
        if ((argument_553_ & 0x100) != 0)
            argument_550_.aBoolean5217 = true;
        else
            argument_550_.aBoolean5217 = aBoolean5217;
        argument_550_.aShort5261 = aShort5261;
        argument_550_.aShort5232 = aShort5232;
        argument_550_.aByte5252 = (byte) 0;
        boolean anLocalBoolean = Node_Sub31_Sub26.method959(anInt5231, (byte) 113, argument_553_);
        boolean anLocalBoolean_554_ = Class62_Sub12.method1402(argument_553_, true, anInt5231);
        boolean anLocalBoolean_555_ = Class352.method3880(argument_553_, anInt5231, argument_552_ - 13230);
        boolean anLocalBoolean_556_ = anLocalBoolean | anLocalBoolean_554_ | anLocalBoolean_555_;
        if (!anLocalBoolean_556_) {
            argument_550_.anIntArray5255 = anIntArray5255;
            argument_550_.anIntArray5216 = anIntArray5216;
            argument_550_.anIntArray5267 = anIntArray5267;
        } else {
            if (anLocalBoolean) {
                if (argument_548_.anIntArray5255 == null || argument_548_.anIntArray5255.length < anInt5224)
                    argument_550_.anIntArray5255 = argument_548_.anIntArray5255 = new int[anInt5224];
                else
                    argument_550_.anIntArray5255 = argument_548_.anIntArray5255;
            } else
                argument_550_.anIntArray5255 = anIntArray5255;
            if (anLocalBoolean_554_) {
                if (argument_548_.anIntArray5267 == null || argument_548_.anIntArray5267.length < anInt5224)
                    argument_550_.anIntArray5267 = argument_548_.anIntArray5267 = new int[anInt5224];
                else
                    argument_550_.anIntArray5267 = argument_548_.anIntArray5267;
            } else
                argument_550_.anIntArray5267 = anIntArray5267;
            if (anLocalBoolean_555_) {
                if (argument_548_.anIntArray5216 == null || argument_548_.anIntArray5216.length < anInt5224)
                    argument_550_.anIntArray5216 = argument_548_.anIntArray5216 = new int[anInt5224];
                else
                    argument_550_.anIntArray5216 = argument_548_.anIntArray5216;
            } else
                argument_550_.anIntArray5216 = anIntArray5216;
            for (int anLocalInt = 0; anLocalInt < anInt5224; anLocalInt++) {
                if (anLocalBoolean)
                    argument_550_.anIntArray5255[anLocalInt] = anIntArray5255[anLocalInt];
                if (anLocalBoolean_554_)
                    argument_550_.anIntArray5267[anLocalInt] = anIntArray5267[anLocalInt];
                if (anLocalBoolean_555_)
                    argument_550_.anIntArray5216[anLocalInt] = anIntArray5216[anLocalInt];
            }
        }
        if (Statics.method544(anInt5231, argument_553_, 0)) {
            argument_550_.aGlInterleavedArray_5241 = argument_548_.aGlInterleavedArray_5241;
            if (argument_551_)
                argument_550_.aByte5252 |= 0x1;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5241).offset = ((GlInterleavedArray) aGlInterleavedArray_5241).offset;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5241).arrayBuffer = ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer;
        } else if (Statics.method1501(35716, anInt5231, argument_553_))
            argument_550_.aGlInterleavedArray_5241 = aGlInterleavedArray_5241;
        else
            argument_550_.aGlInterleavedArray_5241 = null;
        if (Class361.method3956(anInt5231, argument_553_, true)) {
            if (argument_548_.aShortArray5212 != null && argument_548_.aShortArray5212.length >= anInt5245)
                argument_550_.aShortArray5212 = argument_548_.aShortArray5212;
            else
                argument_550_.aShortArray5212 = argument_548_.aShortArray5212 = new short[anInt5245];
            for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++)
                argument_550_.aShortArray5212[anLocalInt] = aShortArray5212[anLocalInt];
        } else
            argument_550_.aShortArray5212 = aShortArray5212;
        if (DoublyLinkedNode_Sub51_Sub13.method1265(anInt5231, (byte) 22, argument_553_)) {
            if (argument_548_.aByteArray5230 == null || argument_548_.aByteArray5230.length < anInt5245)
                argument_550_.aByteArray5230 = argument_548_.aByteArray5230 = new byte[anInt5245];
            else
                argument_550_.aByteArray5230 = argument_548_.aByteArray5230;
            for (int anLocalInt = 0; anInt5245 > anLocalInt; anLocalInt++)
                argument_550_.aByteArray5230[anLocalInt] = aByteArray5230[anLocalInt];
        } else
            argument_550_.aByteArray5230 = aByteArray5230;
        if (!Node_Sub47_Sub11.method1140(anInt5231, 0, argument_553_)) {
            if (DoublyLinkedNode_Sub51_Sub6.method1203(anInt5231, (byte) -1, argument_553_))
                argument_550_.aGlInterleavedArray_5254 = aGlInterleavedArray_5254;
            else
                argument_550_.aGlInterleavedArray_5254 = null;
        } else {
            argument_550_.aGlInterleavedArray_5254 = argument_548_.aGlInterleavedArray_5254;
            if (argument_551_)
                argument_550_.aByte5252 |= 0x2;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5254).arrayBuffer = ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5254).offset = ((GlInterleavedArray) aGlInterleavedArray_5254).offset;
        }
        if (!Statics.method3679(argument_553_, -545, anInt5231)) {
            argument_550_.aByteArray5253 = aByteArray5253;
            argument_550_.aShortArray5239 = aShortArray5239;
            argument_550_.aClass317_5259 = aClass317_5259;
            argument_550_.aShortArray5233 = aShortArray5233;
            argument_550_.aShortArray5219 = aShortArray5219;
        } else {
            if (argument_548_.aShortArray5233 != null && anInt5268 <= argument_548_.aShortArray5233.length) {
                argument_550_.aShortArray5219 = argument_548_.aShortArray5219;
                argument_550_.aShortArray5239 = argument_548_.aShortArray5239;
                argument_550_.aShortArray5233 = argument_548_.aShortArray5233;
            } else {
                int anLocalInt = anInt5268;
                argument_550_.aShortArray5233 = argument_548_.aShortArray5233 = new short[anLocalInt];
                argument_550_.aShortArray5219 = argument_548_.aShortArray5219 = new short[anLocalInt];
                argument_550_.aShortArray5239 = argument_548_.aShortArray5239 = new short[anLocalInt];
            }
            if (aClass317_5259 != null) {
                if (argument_548_.aClass317_5259 == null)
                    argument_548_.aClass317_5259 = new Class317();
                Class317 class317 = (argument_550_.aClass317_5259 = argument_548_.aClass317_5259);
                if (((Class317) class317).aShortArray2622 == null || (((Class317) class317).aShortArray2622.length < anInt5268)) {
                    int anLocalInt = anInt5268;
                    ((Class317) class317).aByteArray2618 = new byte[anLocalInt];
                    ((Class317) class317).aShortArray2620 = new short[anLocalInt];
                    ((Class317) class317).aShortArray2621 = new short[anLocalInt];
                    ((Class317) class317).aShortArray2622 = new short[anLocalInt];
                }
                for (int anLocalInt = 0; anLocalInt < anInt5268; anLocalInt++) {
                    argument_550_.aShortArray5233[anLocalInt] = aShortArray5233[anLocalInt];
                    argument_550_.aShortArray5219[anLocalInt] = aShortArray5219[anLocalInt];
                    argument_550_.aShortArray5239[anLocalInt] = aShortArray5239[anLocalInt];
                    ((Class317) class317).aShortArray2622[anLocalInt] = (((Class317) aClass317_5259).aShortArray2622[anLocalInt]);
                    ((Class317) class317).aShortArray2621[anLocalInt] = (((Class317) aClass317_5259).aShortArray2621[anLocalInt]);
                    ((Class317) class317).aShortArray2620[anLocalInt] = (((Class317) aClass317_5259).aShortArray2620[anLocalInt]);
                    ((Class317) class317).aByteArray2618[anLocalInt] = (((Class317) aClass317_5259).aByteArray2618[anLocalInt]);
                }
            } else {
                for (int anLocalInt = 0; anLocalInt < anInt5268; anLocalInt++) {
                    argument_550_.aShortArray5233[anLocalInt] = aShortArray5233[anLocalInt];
                    argument_550_.aShortArray5219[anLocalInt] = aShortArray5219[anLocalInt];
                    argument_550_.aShortArray5239[anLocalInt] = aShortArray5239[anLocalInt];
                }
            }
            argument_550_.aByteArray5253 = aByteArray5253;
        }
        if (!Statics.method3911(argument_553_, anInt5231, 16385)) {
            if (!DoublyLinkedNodeP2_Sub6.method1918((byte) 127, argument_553_, anInt5231))
                argument_550_.aGlInterleavedArray_5236 = null;
            else
                argument_550_.aGlInterleavedArray_5236 = aGlInterleavedArray_5236;
        } else {
            if (argument_551_)
                argument_550_.aByte5252 |= 0x4;
            argument_550_.aGlInterleavedArray_5236 = argument_548_.aGlInterleavedArray_5236;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5236).offset = ((GlInterleavedArray) aGlInterleavedArray_5236).offset;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5236).arrayBuffer = ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer;
        }
        if (!Class233.method3098(argument_553_, 9209, anInt5231)) {
            argument_550_.aFloatArray5256 = aFloatArray5256;
            argument_550_.aFloatArray5234 = aFloatArray5234;
        } else {
            if (argument_548_.aFloatArray5234 == null || anInt5245 > argument_548_.aFloatArray5234.length) {
                int anLocalInt = anInt5268;
                argument_550_.aFloatArray5234 = argument_548_.aFloatArray5234 = new float[anLocalInt];
                argument_550_.aFloatArray5256 = argument_548_.aFloatArray5256 = new float[anLocalInt];
            } else {
                argument_550_.aFloatArray5234 = argument_548_.aFloatArray5234;
                argument_550_.aFloatArray5256 = argument_548_.aFloatArray5256;
            }
            for (int anLocalInt = 0; anLocalInt < anInt5268; anLocalInt++) {
                argument_550_.aFloatArray5234[anLocalInt] = aFloatArray5234[anLocalInt];
                argument_550_.aFloatArray5256[anLocalInt] = aFloatArray5256[anLocalInt];
            }
        }
        if (Node_Sub20.method717(argument_553_, anInt5231, argument_552_ + 99)) {
            argument_550_.aGlInterleavedArray_5225 = argument_548_.aGlInterleavedArray_5225;
            if (argument_551_)
                argument_550_.aByte5252 |= 0x8;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5225).arrayBuffer = ((GlInterleavedArray) aGlInterleavedArray_5225).arrayBuffer;
            ((GlInterleavedArray) argument_550_.aGlInterleavedArray_5225).offset = ((GlInterleavedArray) aGlInterleavedArray_5225).offset;
        } else if (!Class90.method1680(argument_553_, anInt5231, argument_552_ + 2040))
            argument_550_.aGlInterleavedArray_5225 = null;
        else
            argument_550_.aGlInterleavedArray_5225 = aGlInterleavedArray_5225;
        if (Statics.method2958(argument_553_, (byte) -11, anInt5231)) {
            if (argument_548_.aShortArray5250 == null || argument_548_.aShortArray5250.length < anInt5245) {
                int anLocalInt = anInt5245;
                argument_550_.aShortArray5223 = argument_548_.aShortArray5223 = new short[anLocalInt];
                argument_550_.aShortArray5250 = argument_548_.aShortArray5250 = new short[anLocalInt];
                argument_550_.aShortArray5220 = argument_548_.aShortArray5220 = new short[anLocalInt];
            } else {
                argument_550_.aShortArray5250 = argument_548_.aShortArray5250;
                argument_550_.aShortArray5220 = argument_548_.aShortArray5220;
                argument_550_.aShortArray5223 = argument_548_.aShortArray5223;
            }
            for (int anLocalInt = 0; anInt5245 > anLocalInt; anLocalInt++) {
                argument_550_.aShortArray5250[anLocalInt] = aShortArray5250[anLocalInt];
                argument_550_.aShortArray5220[anLocalInt] = aShortArray5220[anLocalInt];
                argument_550_.aShortArray5223[anLocalInt] = aShortArray5223[anLocalInt];
            }
        } else {
            argument_550_.aShortArray5250 = aShortArray5250;
            argument_550_.aShortArray5220 = aShortArray5220;
            argument_550_.aShortArray5223 = aShortArray5223;
        }
        if (Class373.method4073(argument_553_, argument_552_ - 5, anInt5231)) {
            if (argument_551_)
                argument_550_.aByte5252 |= 0x10;
            argument_550_.aClass121_5249 = argument_548_.aClass121_5249;
            ((Class121) argument_550_.aClass121_5249).anGlElementBuffer_982 = ((Class121) aClass121_5249).anGlElementBuffer_982;
        } else if (Node_Sub13.method689(0, argument_553_, anInt5231))
            argument_550_.aClass121_5249 = aClass121_5249;
        else
            argument_550_.aClass121_5249 = null;
        if (argument_552_ != 8)
            P(29, -22, 69, -53);
        if (Class107.method1959(anInt5231, argument_553_, argument_552_ + 75)) {
            if (argument_548_.aShortArray5238 != null && anInt5245 <= argument_548_.aShortArray5238.length)
                argument_550_.aShortArray5238 = argument_548_.aShortArray5238;
            else {
                int anLocalInt = anInt5245;
                argument_550_.aShortArray5238 = argument_548_.aShortArray5238 = new short[anLocalInt];
            }
            for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++)
                argument_550_.aShortArray5238[anLocalInt] = aShortArray5238[anLocalInt];
        } else
            argument_550_.aShortArray5238 = aShortArray5238;
        if (Statics.method526(anInt5231, -1, argument_553_)) {
            if (argument_548_.aClass359Array5246 == null || argument_548_.aClass359Array5246.length < anInt5237) {
                int anLocalInt = anInt5237;
                argument_550_.aClass359Array5246 = argument_548_.aClass359Array5246 = new Class359[anLocalInt];
                for (int anLocalInt_557_ = 0; anInt5237 > anLocalInt_557_; anLocalInt_557_++)
                    argument_550_.aClass359Array5246[anLocalInt_557_] = aClass359Array5246[anLocalInt_557_].method3946(false);
            } else {
                argument_550_.aClass359Array5246 = argument_548_.aClass359Array5246;
                for (int anLocalInt = 0; anInt5237 > anLocalInt; anLocalInt++)
                    argument_550_.aClass359Array5246[anLocalInt].method3945(aClass359Array5246[anLocalInt], (byte) -41);
            }
        } else
            argument_550_.aClass359Array5246 = aClass359Array5246;
        argument_550_.anIntArrayArray5227 = anIntArrayArray5227;
        argument_550_.aClass38Array5263 = aClass38Array5263;
        argument_550_.aShortArray5248 = aShortArray5248;
        argument_550_.anIntArray5260 = anIntArray5260;
        if (aBoolean5247) {
            argument_550_.aShort5242 = aShort5242;
            argument_550_.aBoolean5247 = true;
            argument_550_.aShort5208 = aShort5208;
            argument_550_.aShort5265 = aShort5265;
            argument_550_.aShort5222 = aShort5222;
            argument_550_.aShort5269 = aShort5269;
            argument_550_.aShort5251 = aShort5251;
            argument_550_.aShort5235 = aShort5235;
            argument_550_.aShort5229 = aShort5229;
        } else
            argument_550_.aBoolean5247 = false;
        argument_550_.aClass185Array5243 = aClass185Array5243;
        argument_550_.aShortArray5215 = aShortArray5215;
        argument_550_.anIntArrayArray5228 = anIntArrayArray5228;
        argument_550_.aClass173Array5210 = aClass173Array5210;
        argument_550_.anIntArrayArray5244 = anIntArrayArray5244;
        argument_550_.anIntArray5266 = anIntArray5266;
        argument_550_.aShortArray5221 = aShortArray5221;
        return argument_550_;
    }

    private final void method2725(byte argument_558_, boolean argument_559_) {
        boolean anLocalBoolean = (aGlInterleavedArray_5254 != null && ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer == null);
        boolean anLocalBoolean_560_ = (aGlInterleavedArray_5236 != null && ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer == null);
        boolean anLocalBoolean_561_ = (aGlInterleavedArray_5241 != null && ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer == null);
        boolean anLocalBoolean_562_ = (aGlInterleavedArray_5225 != null && ((GlInterleavedArray) aGlInterleavedArray_5225).arrayBuffer == null);
        if (argument_559_) {
            anLocalBoolean = anLocalBoolean & (aByte5252 & 0x2) != 0;
            anLocalBoolean_561_ = anLocalBoolean_561_ & (aByte5252 & 0x1) != 0;
            anLocalBoolean_560_ = anLocalBoolean_560_ & (aByte5252 & 0x4) != 0;
            anLocalBoolean_562_ = anLocalBoolean_562_ & (aByte5252 & 0x8) != 0;
        }
        byte anLocalInt = 0;
        byte anLocalInt_563_ = 0;
        byte anLocalInt_564_ = 0;
        byte anLocalInt_565_ = 0;
        byte anLocalInt_566_ = 0;
        if (anLocalBoolean_561_) {
            anLocalInt_563_ = anLocalInt;
            anLocalInt += 12;
        }
        if (argument_558_ < 38)
            anInt5268 = -30;
        if (anLocalBoolean) {
            anLocalInt_564_ = anLocalInt;
            anLocalInt += 4;
        }
        if (anLocalBoolean_560_) {
            anLocalInt_565_ = anLocalInt;
            anLocalInt += 12;
        }
        if (anLocalBoolean_562_) {
            anLocalInt_566_ = anLocalInt;
            anLocalInt += 8;
        }
        if (anLocalInt != 0) {
            if ((((Packet) (((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957)).data).length >= anLocalInt * anInt5268)
                ((Packet) (((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957)).pos = 0;
            else
                ((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957 = new FloatPacket((anInt5268 + 100) * anLocalInt);
            FloatPacket class59_sub28_sub2 = (((GlToolkit) aClass_ha_Sub3_5257).aClass59_Sub28_Sub2_4957);
            if (anLocalBoolean_561_) {
                if (((GlToolkit) aClass_ha_Sub3_5257).isBigEndian) {
                    for (int anLocalInt_567_ = 0; anLocalInt_567_ < anInt5211; anLocalInt_567_++) {
                        int anLocalInt_568_ = (Stream.floatToRawIntBits((float) anIntArray5255[anLocalInt_567_]));
                        int anLocalInt_569_ = (Stream.floatToRawIntBits((float) anIntArray5267[anLocalInt_567_]));
                        int anLocalInt_570_ = (Stream.floatToRawIntBits((float) anIntArray5216[anLocalInt_567_]));
                        int anLocalInt_571_ = anIntArray5260[anLocalInt_567_];
                        int anLocalInt_572_ = anIntArray5260[anLocalInt_567_ + 1];
                        for (int anLocalInt_573_ = anLocalInt_571_; anLocalInt_572_ > anLocalInt_573_; anLocalInt_573_++) {
                            int anLocalInt_574_ = aShortArray5248[anLocalInt_573_] - 1;
                            if (anLocalInt_574_ == -1)
                                break;
                            ((Packet) class59_sub28_sub2).pos = anLocalInt_574_ * anLocalInt;
                            class59_sub28_sub2.p4(anLocalInt_568_);
                            class59_sub28_sub2.p4(anLocalInt_569_);
                            class59_sub28_sub2.p4(anLocalInt_570_);
                        }
                    }
                } else {
                    for (int anLocalInt_575_ = 0; anInt5211 > anLocalInt_575_; anLocalInt_575_++) {
                        int anLocalInt_576_ = (Stream.floatToRawIntBits((float) anIntArray5255[anLocalInt_575_]));
                        int anLocalInt_577_ = (Stream.floatToRawIntBits((float) anIntArray5267[anLocalInt_575_]));
                        int anLocalInt_578_ = (Stream.floatToRawIntBits((float) anIntArray5216[anLocalInt_575_]));
                        int anLocalInt_579_ = anIntArray5260[anLocalInt_575_];
                        int anLocalInt_580_ = anIntArray5260[anLocalInt_575_ + 1];
                        for (int anLocalInt_581_ = anLocalInt_579_; anLocalInt_581_ < anLocalInt_580_; anLocalInt_581_++) {
                            int anLocalInt_582_ = aShortArray5248[anLocalInt_581_] - 1;
                            if (anLocalInt_582_ == -1)
                                break;
                            ((Packet) class59_sub28_sub2).pos = anLocalInt * anLocalInt_582_;
                            class59_sub28_sub2.p4i_dupl(anLocalInt_576_);
                            class59_sub28_sub2.p4i_dupl(anLocalInt_577_);
                            class59_sub28_sub2.p4i_dupl(anLocalInt_578_);
                        }
                    }
                }
            }
            if (anLocalBoolean) {
                if (aGlInterleavedArray_5236 != null) {
                    for (int anLocalInt_583_ = 0; anInt5245 > anLocalInt_583_; anLocalInt_583_++) {
                        int anLocalInt_584_ = method2728(aByteArray5230[anLocalInt_583_], -1, aShort5261, aShortArray5238[anLocalInt_583_], aShortArray5212[anLocalInt_583_]);
                        ((Packet) class59_sub28_sub2).pos = (anLocalInt_564_ + (anLocalInt * aShortArray5250[anLocalInt_583_]));
                        class59_sub28_sub2.p4(anLocalInt_584_);
                        ((Packet) class59_sub28_sub2).pos = (anLocalInt_564_ + (aShortArray5220[anLocalInt_583_] * anLocalInt));
                        class59_sub28_sub2.p4(anLocalInt_584_);
                        ((Packet) class59_sub28_sub2).pos = (aShortArray5223[anLocalInt_583_] * anLocalInt + anLocalInt_564_);
                        class59_sub28_sub2.p4(anLocalInt_584_);
                    }
                } else {
                    byte[] anLocalInts;
                    short[] anLocalInts_585_;
                    short[] anLocalInts_586_;
                    short[] anLocalInts_587_;
                    if (aClass317_5259 == null) {
                        anLocalInts = aByteArray5253;
                        anLocalInts_585_ = aShortArray5239;
                        anLocalInts_586_ = aShortArray5233;
                        anLocalInts_587_ = aShortArray5219;
                    } else {
                        anLocalInts = ((Class317) aClass317_5259).aByteArray2618;
                        anLocalInts_585_ = ((Class317) aClass317_5259).aShortArray2620;
                        anLocalInts_586_ = ((Class317) aClass317_5259).aShortArray2622;
                        anLocalInts_587_ = ((Class317) aClass317_5259).aShortArray2621;
                    }
                    float f = (((GlToolkit) aClass_ha_Sub3_5257).sunDirection[0]);
                    float f_588_ = (((GlToolkit) aClass_ha_Sub3_5257).sunDirection[1]);
                    float f_589_ = (((GlToolkit) aClass_ha_Sub3_5257).sunDirection[2]);
                    float f_590_ = ((GlToolkit) aClass_ha_Sub3_5257).modelIntensity;
                    float f_591_ = (((GlToolkit) aClass_ha_Sub3_5257).light1Intensity * 768.0F / (float) aShort5232);
                    float f_592_ = (((GlToolkit) aClass_ha_Sub3_5257).light2NegIntensity * 768.0F / (float) aShort5232);
                    for (int anLocalInt_593_ = 0; anInt5245 > anLocalInt_593_; anLocalInt_593_++) {
                        int anLocalInt_594_ = method2728(aByteArray5230[anLocalInt_593_], -1, aShort5261, aShortArray5238[anLocalInt_593_], aShortArray5212[anLocalInt_593_]);
                        float f_595_ = ((float) (anLocalInt_594_ >>> 24) * (((GlToolkit) aClass_ha_Sub3_5257).lightRed));
                        float f_596_ = ((float) ((anLocalInt_594_ & 0xfff316) >> 16) * (((GlToolkit) aClass_ha_Sub3_5257).lightGreen));
                        float f_597_ = ((float) ((anLocalInt_594_ & 0xff87) >> 8) * (((GlToolkit) aClass_ha_Sub3_5257).lightBlue));
                        int anLocalInt_598_ = aShortArray5250[anLocalInt_593_];
                        short anLocalInt_599_ = (short) anLocalInts[anLocalInt_598_];
                        float f_600_;
                        if (anLocalInt_599_ != 0)
                            f_600_ = ((((float) anLocalInts_585_[anLocalInt_598_] * f_589_) + ((float) (anLocalInts_587_[anLocalInt_598_]) * f_588_ + (float) (anLocalInts_586_[anLocalInt_598_]) * f)) / (float) (anLocalInt_599_ * 256));
                        else
                            f_600_ = ((f * (float) (anLocalInts_586_[anLocalInt_598_]) + (float) (anLocalInts_587_[anLocalInt_598_]) * f_588_ + f_589_ * (float) (anLocalInts_585_[anLocalInt_598_])) * 0.0026041667F);
                        float f_601_ = (f_600_ * (f_600_ < 0.0F ? f_592_ : f_591_) + f_590_);
                        int anLocalInt_602_ = (int) (f_601_ * f_595_);
                        int anLocalInt_603_ = (int) (f_596_ * f_601_);
                        if (anLocalInt_602_ < 0)
                            anLocalInt_602_ = 0;
                        else if (anLocalInt_602_ > 255)
                            anLocalInt_602_ = 255;
                        int anLocalInt_604_ = (int) (f_601_ * f_597_);
                        if (anLocalInt_603_ >= 0) {
                            if (anLocalInt_603_ > 255)
                                anLocalInt_603_ = 255;
                        } else
                            anLocalInt_603_ = 0;
                        ((Packet) class59_sub28_sub2).pos = anLocalInt_564_ + anLocalInt * anLocalInt_598_;
                        if (anLocalInt_604_ < 0)
                            anLocalInt_604_ = 0;
                        else if (anLocalInt_604_ > 255)
                            anLocalInt_604_ = 255;
                        class59_sub28_sub2.p1(anLocalInt_602_);
                        class59_sub28_sub2.p1(anLocalInt_603_);
                        class59_sub28_sub2.p1(anLocalInt_604_);
                        class59_sub28_sub2.p1(-((aByteArray5230[anLocalInt_593_]) & 0xff) + 255);
                        anLocalInt_598_ = aShortArray5220[anLocalInt_593_];
                        anLocalInt_599_ = (short) anLocalInts[anLocalInt_598_];
                        if (anLocalInt_599_ == 0)
                            f_600_ = ((((float) anLocalInts_585_[anLocalInt_598_] * f_589_) + ((float) (anLocalInts_586_[anLocalInt_598_]) * f + (float) (anLocalInts_587_[anLocalInt_598_]) * f_588_)) * 0.0026041667F);
                        else
                            f_600_ = ((((float) anLocalInts_587_[anLocalInt_598_] * f_588_) + (float) (anLocalInts_586_[anLocalInt_598_]) * f + (float) (anLocalInts_585_[anLocalInt_598_]) * f_589_) / (float) (anLocalInt_599_ * 256));
                        f_601_ = ((f_600_ < 0.0F ? f_592_ : f_591_) * f_600_ + f_590_);
                        anLocalInt_602_ = (int) (f_601_ * f_595_);
                        if (anLocalInt_602_ >= 0) {
                            if (anLocalInt_602_ > 255)
                                anLocalInt_602_ = 255;
                        } else
                            anLocalInt_602_ = 0;
                        anLocalInt_603_ = (int) (f_596_ * f_601_);
                        if (anLocalInt_603_ < 0)
                            anLocalInt_603_ = 0;
                        else if (anLocalInt_603_ > 255)
                            anLocalInt_603_ = 255;
                        anLocalInt_604_ = (int) (f_601_ * f_597_);
                        ((Packet) class59_sub28_sub2).pos = anLocalInt * anLocalInt_598_ + anLocalInt_564_;
                        if (anLocalInt_604_ < 0)
                            anLocalInt_604_ = 0;
                        else if (anLocalInt_604_ > 255)
                            anLocalInt_604_ = 255;
                        class59_sub28_sub2.p1(anLocalInt_602_);
                        class59_sub28_sub2.p1(anLocalInt_603_);
                        class59_sub28_sub2.p1(anLocalInt_604_);
                        class59_sub28_sub2.p1(-((aByteArray5230[anLocalInt_593_]) & 0xff) + 255);
                        anLocalInt_598_ = aShortArray5223[anLocalInt_593_];
                        anLocalInt_599_ = (short) anLocalInts[anLocalInt_598_];
                        if (anLocalInt_599_ == 0)
                            f_600_ = (f * (float) (anLocalInts_586_[anLocalInt_598_]) + f_588_ * (float) (anLocalInts_587_[anLocalInt_598_]) + ((float) anLocalInts_585_[anLocalInt_598_] * f_589_)) * 0.0026041667F;
                        else
                            f_600_ = ((f * (float) (anLocalInts_586_[anLocalInt_598_]) + (float) (anLocalInts_587_[anLocalInt_598_]) * f_588_ + f_589_ * (float) (anLocalInts_585_[anLocalInt_598_])) / (float) (anLocalInt_599_ * 256));
                        f_601_ = ((f_600_ < 0.0F ? f_592_ : f_591_) * f_600_ + f_590_);
                        anLocalInt_602_ = (int) (f_595_ * f_601_);
                        anLocalInt_603_ = (int) (f_596_ * f_601_);
                        if (anLocalInt_602_ < 0)
                            anLocalInt_602_ = 0;
                        else if (anLocalInt_602_ > 255)
                            anLocalInt_602_ = 255;
                        if (anLocalInt_603_ < 0)
                            anLocalInt_603_ = 0;
                        else if (anLocalInt_603_ > 255)
                            anLocalInt_603_ = 255;
                        anLocalInt_604_ = (int) (f_601_ * f_597_);
                        ((Packet) class59_sub28_sub2).pos = anLocalInt_564_ + anLocalInt * anLocalInt_598_;
                        if (anLocalInt_604_ >= 0) {
                            if (anLocalInt_604_ > 255)
                                anLocalInt_604_ = 255;
                        } else
                            anLocalInt_604_ = 0;
                        class59_sub28_sub2.p1(anLocalInt_602_);
                        class59_sub28_sub2.p1(anLocalInt_603_);
                        class59_sub28_sub2.p1(anLocalInt_604_);
                        class59_sub28_sub2.p1(-((aByteArray5230[anLocalInt_593_]) & 0xff) + 255);
                    }
                }
            }
            if (anLocalBoolean_560_) {
                byte[] anLocalInts;
                short[] anLocalInts_605_;
                short[] anLocalInts_606_;
                short[] anLocalInts_607_;
                if (aClass317_5259 != null) {
                    anLocalInts_605_ = ((Class317) aClass317_5259).aShortArray2621;
                    anLocalInts_607_ = ((Class317) aClass317_5259).aShortArray2622;
                    anLocalInts = ((Class317) aClass317_5259).aByteArray2618;
                    anLocalInts_606_ = ((Class317) aClass317_5259).aShortArray2620;
                } else {
                    anLocalInts = aByteArray5253;
                    anLocalInts_605_ = aShortArray5219;
                    anLocalInts_606_ = aShortArray5239;
                    anLocalInts_607_ = aShortArray5233;
                }
                float f = 3.0F / (float) aShort5232;
                ((Packet) class59_sub28_sub2).pos = anLocalInt_565_;
                float f_608_ = 3.0F / (float) (aShort5232 + aShort5232 / 2);
                if (((GlToolkit) aClass_ha_Sub3_5257).isBigEndian) {
                    for (int anLocalInt_609_ = 0; anLocalInt_609_ < anInt5268; anLocalInt_609_++) {
                        int anLocalInt_610_ = anLocalInts[anLocalInt_609_] & 0xff;
                        if (anLocalInt_610_ != 0) {
                            float f_611_ = f / (float) anLocalInt_610_;
                            class59_sub28_sub2.pfloat(f_611_ * (float) (anLocalInts_607_[anLocalInt_609_]));
                            class59_sub28_sub2.pfloat(((float) anLocalInts_605_[anLocalInt_609_] * f_611_));
                            class59_sub28_sub2.pfloat(f_611_ * (float) (anLocalInts_606_[anLocalInt_609_]));
                        } else {
                            class59_sub28_sub2.pfloat(((float) anLocalInts_607_[anLocalInt_609_] * f_608_));
                            class59_sub28_sub2.pfloat(f_608_ * (float) (anLocalInts_605_[anLocalInt_609_]));
                            class59_sub28_sub2.pfloat(f_608_ * (float) (anLocalInts_606_[anLocalInt_609_]));
                        }
                        ((Packet) class59_sub28_sub2).pos += anLocalInt - 12;
                    }
                } else {
                    for (int anLocalInt_612_ = 0; anInt5268 > anLocalInt_612_; anLocalInt_612_++) {
                        int anLocalInt_613_ = anLocalInts[anLocalInt_612_] & 0xff;
                        if (anLocalInt_613_ != 0) {
                            float f_614_ = f / (float) anLocalInt_613_;
                            class59_sub28_sub2.ipfloat(((float) anLocalInts_607_[anLocalInt_612_] * f_614_));
                            class59_sub28_sub2.ipfloat(f_614_ * (float) (anLocalInts_605_[anLocalInt_612_]));
                            class59_sub28_sub2.ipfloat(((float) anLocalInts_606_[anLocalInt_612_] * f_614_));
                        } else {
                            class59_sub28_sub2.ipfloat(((float) anLocalInts_607_[anLocalInt_612_] * f_608_));
                            class59_sub28_sub2.ipfloat(((float) anLocalInts_605_[anLocalInt_612_] * f_608_));
                            class59_sub28_sub2.ipfloat(((float) anLocalInts_606_[anLocalInt_612_] * f_608_));
                        }
                        ((Packet) class59_sub28_sub2).pos += anLocalInt - 12;
                    }
                }
            }
            if (anLocalBoolean_562_) {
                ((Packet) class59_sub28_sub2).pos = anLocalInt_566_;
                if (!((GlToolkit) aClass_ha_Sub3_5257).isBigEndian) {
                    for (int anLocalInt_615_ = 0; anInt5268 > anLocalInt_615_; anLocalInt_615_++) {
                        class59_sub28_sub2.ipfloat(aFloatArray5234[anLocalInt_615_]);
                        class59_sub28_sub2.ipfloat(aFloatArray5256[anLocalInt_615_]);
                        ((Packet) class59_sub28_sub2).pos += anLocalInt - 8;
                    }
                } else {
                    for (int anLocalInt_616_ = 0; anLocalInt_616_ < anInt5268; anLocalInt_616_++) {
                        class59_sub28_sub2.pfloat((aFloatArray5234[anLocalInt_616_]));
                        class59_sub28_sub2.pfloat((aFloatArray5256[anLocalInt_616_]));
                        ((Packet) class59_sub28_sub2).pos += anLocalInt - 8;
                    }
                }
            }
            ((Packet) class59_sub28_sub2).pos = anLocalInt * anInt5268;
            GlArrayBuffer glArrayBuffer;
            if (!argument_559_) {
                glArrayBuffer = (aClass_ha_Sub3_5257.method2289(0, ((Packet) class59_sub28_sub2).pos, ((Packet) class59_sub28_sub2).data, false, anLocalInt));
                aBoolean5226 = true;
            } else {
                if (anGlArrayBuffer_5258 != null)
                    anGlArrayBuffer_5258.setData(((Packet) class59_sub28_sub2).data, anLocalInt, ((Packet) class59_sub28_sub2).pos);
                else
                    anGlArrayBuffer_5258 = (aClass_ha_Sub3_5257.method2289(0, ((Packet) class59_sub28_sub2).pos, (((Packet) class59_sub28_sub2).data), true, anLocalInt));
                aByte5252 = (byte) 0;
                glArrayBuffer = anGlArrayBuffer_5258;
            }
            if (anLocalBoolean_561_) {
                ((GlInterleavedArray) aGlInterleavedArray_5241).offset = anLocalInt_563_;
                ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = glArrayBuffer;
            }
            if (anLocalBoolean_562_) {
                ((GlInterleavedArray) aGlInterleavedArray_5225).arrayBuffer = glArrayBuffer;
                ((GlInterleavedArray) aGlInterleavedArray_5225).offset = anLocalInt_566_;
            }
            if (anLocalBoolean) {
                ((GlInterleavedArray) aGlInterleavedArray_5254).offset = anLocalInt_564_;
                ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = glArrayBuffer;
            }
            if (anLocalBoolean_560_) {
                ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = glArrayBuffer;
                ((GlInterleavedArray) aGlInterleavedArray_5236).offset = anLocalInt_565_;
            }
        }
    }

    final int V() {
        if (!aBoolean5247)
            method2718(-114);
        return aShort5242;
    }

    final int fa() {
        if (!aBoolean5247)
            method2718(-47);
        return aShort5208;
    }

    private final boolean method2727(int argument_617_, byte argument_618_, int argument_619_, int argument_620_, int argument_621_, int argument_622_, int argument_623_, int argument_624_, int argument_625_) {
        if (argument_618_ > -76)
            return true;
        if (argument_619_ > argument_623_ && argument_622_ > argument_623_ && argument_623_ < argument_625_)
            return false;
        if (argument_623_ > argument_619_ && argument_623_ > argument_622_ && argument_623_ > argument_625_)
            return false;
        if (argument_624_ > argument_617_ && argument_620_ > argument_617_ && argument_617_ < argument_621_)
            return false;
        if (argument_624_ < argument_617_ && argument_617_ > argument_620_ && argument_617_ > argument_621_)
            return false;
        return true;
    }

    final void k(int argument_626_) {
        int anLocalInt = Node_Sub6.SINETABLE[argument_626_];
        int anLocalInt_627_ = Node_Sub6.COSINETABLE[argument_626_];
        for (int anLocalInt_628_ = 0; anLocalInt_628_ < anInt5211; anLocalInt_628_++) {
            int anLocalInt_629_ = ((anIntArray5216[anLocalInt_628_] * anLocalInt + anIntArray5255[anLocalInt_628_] * anLocalInt_627_) >> 14);
            anIntArray5216[anLocalInt_628_] = (anIntArray5216[anLocalInt_628_] * anLocalInt_627_ - anLocalInt * anIntArray5255[anLocalInt_628_]) >> 14;
            anIntArray5255[anLocalInt_628_] = anLocalInt_629_;
        }
        for (int anLocalInt_630_ = 0; anInt5268 > anLocalInt_630_; anLocalInt_630_++) {
            int anLocalInt_631_ = ((anLocalInt_627_ * aShortArray5233[anLocalInt_630_] + aShortArray5239[anLocalInt_630_] * anLocalInt) >> 14);
            aShortArray5239[anLocalInt_630_] = (short) ((anLocalInt_627_ * aShortArray5239[anLocalInt_630_] - anLocalInt * aShortArray5233[anLocalInt_630_]) >> 14);
            aShortArray5233[anLocalInt_630_] = (short) anLocalInt_631_;
        }
        if (aGlInterleavedArray_5236 == null && aGlInterleavedArray_5254 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5254).arrayBuffer = null;
        if (aGlInterleavedArray_5236 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5236).arrayBuffer = null;
        if (aGlInterleavedArray_5241 != null)
            ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        aBoolean5247 = false;
    }

    final int EA() {
        if (!aBoolean5247)
            method2718(-58);
        return aShort5222;
    }

    private final int method2728(byte argument_632_, int argument_633_, int argument_634_, short argument_635_, int argument_636_) {
        int anLocalInt = (HslToRgb.table[Class260.method3316((byte) 13, argument_634_, argument_636_)]);
        if (argument_635_ != argument_633_) {
            TextureDescriptor textureDescriptor = ((GraphicsToolkit) aClass_ha_Sub3_5257).textureSource.getDescriptor(argument_635_ & 0xffff, true);
            int anLocalInt_637_ = ((TextureDescriptor) textureDescriptor).aByte840 & 0xff;
            if (anLocalInt_637_ != 0) {
                int anLocalInt_638_;
                if (argument_634_ >= 0) {
                    if (argument_634_ > 127)
                        anLocalInt_638_ = 16777215;
                    else
                        anLocalInt_638_ = argument_634_ * 131586;
                } else
                    anLocalInt_638_ = 0;
                if (anLocalInt_637_ != 256) {
                    int anLocalInt_639_ = anLocalInt_637_;
                    int anLocalInt_640_ = 256 - anLocalInt_637_;
                    anLocalInt = (((anLocalInt_639_ * (anLocalInt_638_ & 0xff00) + anLocalInt_640_ * (anLocalInt & 0xff00)) & 0xff0000) + (((anLocalInt & 0xff00ff) * anLocalInt_640_ + anLocalInt_639_ * (anLocalInt_638_ & 0xff00ff)) & ~0xff00ff)) >> 8;
                } else
                    anLocalInt = anLocalInt_638_;
            }
            int anLocalInt_641_ = ((TextureDescriptor) textureDescriptor).aByte828 & 0xff;
            if (anLocalInt_641_ != 0) {
                anLocalInt_641_ += 256;
                int anLocalInt_642_ = anLocalInt_641_ * (anLocalInt >> 16 & 0xff);
                if (anLocalInt_642_ > 65535)
                    anLocalInt_642_ = 65535;
                int anLocalInt_643_ = ((anLocalInt & 0xff00) >> 8) * anLocalInt_641_;
                if (anLocalInt_643_ > 65535)
                    anLocalInt_643_ = 65535;
                int anLocalInt_644_ = anLocalInt_641_ * (anLocalInt & 0xff);
                if (anLocalInt_644_ > 65535)
                    anLocalInt_644_ = 65535;
                anLocalInt = ((anLocalInt_644_ >> 8) + (((anLocalInt_642_ & ~0x10ff00ff) << 8) + (anLocalInt_643_ & 0xff00)));
            }
        }
        return -(argument_632_ & 0xff) + 255 + (anLocalInt << 8);
    }

    final void p(int argument_645_, int argument_646_, Class_s argument_647_, Class_s argument_648_, int argument_649_, int argument_650_, int argument_651_) {
        if (!aBoolean5247)
            method2718(-98);
        int anLocalInt = argument_649_ + aShort5242;
        int anLocalInt_652_ = argument_649_ + aShort5229;
        int anLocalInt_653_ = aShort5269 + argument_651_;
        int anLocalInt_654_ = aShort5235 + argument_651_;
        if ((argument_645_ != 1 && argument_645_ != 2 && argument_645_ != 3 && argument_645_ != 5) || (anLocalInt >= 0 && ((((Class_s) argument_647_).anInt2547 + anLocalInt_652_ >> ((Class_s) argument_647_).anInt2548) < ((Class_s) argument_647_).anInt2550) && anLocalInt_653_ >= 0 && (((Class_s) argument_647_).anInt2549 > (((Class_s) argument_647_).anInt2547 + anLocalInt_654_ >> ((Class_s) argument_647_).anInt2548)))) {
            if (argument_645_ != 4 && argument_645_ != 5) {
                anLocalInt >>= ((Class_s) argument_647_).anInt2548;
                anLocalInt_652_ = (anLocalInt_652_ + (((Class_s) argument_647_).anInt2547 - 1) >> ((Class_s) argument_647_).anInt2548);
                anLocalInt_653_ >>= ((Class_s) argument_647_).anInt2548;
                anLocalInt_654_ = (anLocalInt_654_ + ((Class_s) argument_647_).anInt2547 - 1) >> ((Class_s) argument_647_).anInt2548;
                if (argument_647_.method3534(anLocalInt, false, anLocalInt_653_) == argument_650_ && (argument_650_ == argument_647_.method3534(anLocalInt_652_, false, anLocalInt_653_)) && (argument_650_ == argument_647_.method3534(anLocalInt, false, anLocalInt_654_)) && (argument_647_.method3534(anLocalInt_652_, false, anLocalInt_654_) == argument_650_))
                    return;
            } else if (argument_648_ == null || (anLocalInt < 0 || (((anLocalInt_652_ + ((Class_s) argument_648_).anInt2547) >> ((Class_s) argument_648_).anInt2548) >= ((Class_s) argument_648_).anInt2550) || anLocalInt_653_ < 0 || (((((Class_s) argument_648_).anInt2547 + anLocalInt_654_) >> ((Class_s) argument_648_).anInt2548) >= ((Class_s) argument_648_).anInt2549)))
                return;
            if (argument_645_ == 1) {
                for (int anLocalInt_655_ = 0; anInt5211 > anLocalInt_655_; anLocalInt_655_++)
                    anIntArray5267[anLocalInt_655_] = (-argument_650_ + anIntArray5267[anLocalInt_655_] + argument_647_.method3541((argument_651_ + (anIntArray5216[anLocalInt_655_])), 0, ((anIntArray5255[anLocalInt_655_]) + argument_649_)));
            } else if (argument_645_ == 2) {
                int anLocalInt_656_ = aShort5208;
                if (anLocalInt_656_ == 0)
                    return;
                for (int anLocalInt_657_ = 0; anInt5211 > anLocalInt_657_; anLocalInt_657_++) {
                    int anLocalInt_658_ = ((anIntArray5267[anLocalInt_657_] << 16) / anLocalInt_656_);
                    if (argument_646_ > anLocalInt_658_)
                        anIntArray5267[anLocalInt_657_] = (anIntArray5267[anLocalInt_657_] + ((-argument_650_ + (argument_647_.method3541((anIntArray5216[anLocalInt_657_] + argument_651_), 0, (anIntArray5255[anLocalInt_657_] + argument_649_)))) * (-anLocalInt_658_ + argument_646_) / argument_646_));
                }
            } else if (argument_645_ == 3) {
                int anLocalInt_659_ = (argument_646_ & 0xff) * 4;
                int anLocalInt_660_ = ((argument_646_ & 0xffff) >> 8) * 4;
                int anLocalInt_661_ = (argument_646_ >> 16 & 0xff) << 6;
                int anLocalInt_662_ = (argument_646_ >> 24 & 0xff) << 6;
                if (-(anLocalInt_659_ >> 1) + argument_649_ < 0 || ((((Class_s) argument_647_).anInt2550 << ((Class_s) argument_647_).anInt2548) <= (argument_649_ - (-(anLocalInt_659_ >> 1) - ((Class_s) argument_647_).anInt2547))) || -(anLocalInt_660_ >> 1) + argument_651_ < 0 || ((((Class_s) argument_647_).anInt2547 + (argument_651_ + (anLocalInt_660_ >> 1))) >= (((Class_s) argument_647_).anInt2549 << ((Class_s) argument_647_).anInt2548)))
                    return;
                this.method2642(argument_650_, argument_647_, -11, anLocalInt_661_, anLocalInt_662_, anLocalInt_659_, anLocalInt_660_, argument_649_, argument_651_);
            } else if (argument_645_ != 4) {
                if (argument_645_ == 5) {
                    int anLocalInt_663_ = -aShort5208 + aShort5222;
                    for (int anLocalInt_664_ = 0; anLocalInt_664_ < anInt5211; anLocalInt_664_++) {
                        int anLocalInt_665_ = anIntArray5255[anLocalInt_664_] + argument_649_;
                        int anLocalInt_666_ = argument_651_ + anIntArray5216[anLocalInt_664_];
                        int anLocalInt_667_ = argument_647_.method3541(anLocalInt_666_, 0, anLocalInt_665_);
                        int anLocalInt_668_ = argument_648_.method3541(anLocalInt_666_, 0, anLocalInt_665_);
                        int anLocalInt_669_ = (-argument_646_ - anLocalInt_668_ + anLocalInt_667_);
                        anIntArray5267[anLocalInt_664_] = (anLocalInt_667_ - (argument_650_ - (((anIntArray5267[anLocalInt_664_] << 8) / anLocalInt_663_ * anLocalInt_669_) >> 8)));
                    }
                }
            } else {
                int anLocalInt_670_ = -aShort5208 + aShort5222;
                for (int anLocalInt_671_ = 0; anLocalInt_671_ < anInt5211; anLocalInt_671_++)
                    anIntArray5267[anLocalInt_671_] = (anLocalInt_670_ + (anIntArray5267[anLocalInt_671_] + ((argument_648_.method3541((anIntArray5216[anLocalInt_671_] + argument_651_), 0, (argument_649_ + anIntArray5255[anLocalInt_671_]))) - argument_650_)));
            }
            aBoolean5247 = false;
            if (aGlInterleavedArray_5241 != null)
                ((GlInterleavedArray) aGlInterleavedArray_5241).arrayBuffer = null;
        }
    }

    Class167_Sub3(GlToolkit argument_672_) {
        anInt5224 = 0;
        anInt5245 = 0;
        anInt5211 = 0;
        aBoolean5264 = false;
        aBoolean5217 = false;
        anInt5268 = 0;
        aClass_ha_Sub3_5257 = argument_672_;
        aGlInterleavedArray_5241 = new GlInterleavedArray(null, 5126, 3, 0);
        aGlInterleavedArray_5225 = new GlInterleavedArray(null, 5126, 2, 0);
        aGlInterleavedArray_5236 = new GlInterleavedArray(null, 5126, 3, 0);
        aGlInterleavedArray_5254 = new GlInterleavedArray(null, 5121, 4, 0);
        aClass121_5249 = new Class121();
    }

    Class167_Sub3(GlToolkit argument_673_, Class101 argument_674_, int argument_675_, int argument_676_, int argument_677_, int argument_678_) {
        anInt5224 = 0;
        anInt5245 = 0;
        anInt5211 = 0;
        aBoolean5264 = false;
        aBoolean5217 = false;
        anInt5268 = 0;
        aClass_ha_Sub3_5257 = argument_673_;
        anInt5218 = argument_675_;
        anInt5231 = argument_678_;
        if (Statics.method1501(35716, argument_678_, argument_675_))
            aGlInterleavedArray_5241 = new GlInterleavedArray(null, 5126, 3, 0);
        if (Class90.method1680(argument_675_, argument_678_, 2048))
            aGlInterleavedArray_5225 = new GlInterleavedArray(null, 5126, 2, 0);
        if (DoublyLinkedNodeP2_Sub6.method1918((byte) 94, argument_675_, argument_678_))
            aGlInterleavedArray_5236 = new GlInterleavedArray(null, 5126, 3, 0);
        if (DoublyLinkedNode_Sub51_Sub6.method1203(argument_678_, (byte) -1, argument_675_))
            aGlInterleavedArray_5254 = new GlInterleavedArray(null, 5121, 4, 0);
        if (Node_Sub13.method689(0, argument_675_, argument_678_))
            aClass121_5249 = new Class121();
        TextureSource textureSource = ((GraphicsToolkit) argument_673_).textureSource;
        anIntArray5260 = new int[((Class101) argument_674_).anInt797 + 1];
        int[] anLocalInts = new int[((Class101) argument_674_).anInt795];
        for (int anLocalInt = 0; ((Class101) argument_674_).anInt795 > anLocalInt; anLocalInt++) {
            if (((Class101) argument_674_).aByteArray813 == null || ((Class101) argument_674_).aByteArray813[anLocalInt] != 2) {
                if (((Class101) argument_674_).aShortArray815 != null && (((Class101) argument_674_).aShortArray815[anLocalInt] != -1)) {
                    TextureDescriptor textureDescriptor = textureSource.getDescriptor(((((Class101) argument_674_).aShortArray815[anLocalInt]) & 0xffff), true);
                    if (((anInt5231 & 0x40) == 0 || !((TextureDescriptor) textureDescriptor).aBoolean836) && ((TextureDescriptor) textureDescriptor).aBoolean843)
                        continue;
                }
                anLocalInts[anInt5245++] = anLocalInt;
                anIntArray5260[(((Class101) argument_674_).aShortArray798[anLocalInt])]++;
                anIntArray5260[(((Class101) argument_674_).aShortArray807[anLocalInt])]++;
                anIntArray5260[(((Class101) argument_674_).aShortArray793[anLocalInt])]++;
            }
        }
        anInt5213 = anInt5245;
        long[] ls = new long[anInt5245];
        boolean anLocalBoolean = (anInt5218 & 0x100) != 0;
        for (int anLocalInt = 0; anLocalInt < anInt5245; anLocalInt++) {
            int anLocalInt_679_ = anLocalInts[anLocalInt];
            TextureDescriptor textureDescriptor = null;
            int anLocalInt_680_ = 0;
            int anLocalInt_681_ = 0;
            int anLocalInt_682_ = 0;
            int anLocalInt_683_ = 0;
            if (((Class101) argument_674_).aClass147Array784 != null) {
                boolean anLocalBoolean_684_ = false;
                for (int anLocalInt_685_ = 0; (((Class101) argument_674_).aClass147Array784.length > anLocalInt_685_); anLocalInt_685_++) {
                    Class147 class147 = (((Class101) argument_674_).aClass147Array784[anLocalInt_685_]);
                    if (anLocalInt_679_ == ((Class147) class147).anInt1115) {
                        Class125 class125 = Node_Sub31_Sub4.method887((byte) 113, (((Class147) class147).anInt1118));
                        if (((Class125) class125).aBoolean1016)
                            anLocalBoolean_684_ = true;
                        if (((Class125) class125).anInt1014 != -1) {
                            TextureDescriptor textureDescriptor_686_ = textureSource.getDescriptor((((Class125) class125).anInt1014), true);
                            if (((TextureDescriptor) textureDescriptor_686_).anInt830 == 2)
                                aBoolean5217 = true;
                        }
                    }
                }
                if (anLocalBoolean_684_) {
                    ls[anLocalInt] = 9223372036854775807L;
                    anInt5213--;
                    continue;
                }
            }
            int anLocalInt_687_ = -1;
            if (((Class101) argument_674_).aShortArray815 != null) {
                anLocalInt_687_ = (((Class101) argument_674_).aShortArray815[anLocalInt_679_]);
                if (anLocalInt_687_ != -1) {
                    textureDescriptor = textureSource.getDescriptor(anLocalInt_687_ & 0xffff, true);
                    if ((anInt5231 & 0x40) == 0 || !((TextureDescriptor) textureDescriptor).aBoolean836) {
                        if (((TextureDescriptor) textureDescriptor).aByte845 != 0 || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
                            aBoolean5264 = true;
                        anLocalInt_682_ = ((TextureDescriptor) textureDescriptor).aByte834;
                        anLocalInt_683_ = ((TextureDescriptor) textureDescriptor).aByte842;
                    } else {
                        textureDescriptor = null;
                        anLocalInt_687_ = -1;
                    }
                }
            }
            boolean anLocalBoolean_688_ = ((((Class101) argument_674_).aByteArray816 != null && (((Class101) argument_674_).aByteArray816[anLocalInt_679_]) != 0) || textureDescriptor != null && ((TextureDescriptor) textureDescriptor).anInt830 != 0);
            if ((anLocalBoolean || anLocalBoolean_688_) && ((Class101) argument_674_).aByteArray790 != null)
                anLocalInt_680_ += (((Class101) argument_674_).aByteArray790[anLocalInt_679_]) << 17;
            if (anLocalBoolean_688_)
                anLocalInt_680_ += 65536;
            anLocalInt_680_ += (anLocalInt_682_ & 0xff) << 8;
            anLocalInt_680_ += anLocalInt_683_ & 0xff;
            anLocalInt_681_ += (anLocalInt_687_ & 0xffff) << 16;
            anLocalInt_681_ += anLocalInt & 0xffff;
            ls[anLocalInt] = ((long) anLocalInt_680_ << 32) - -(long) anLocalInt_681_;
            Class167_Sub3 class167_sub3 = this;
            class167_sub3.aBoolean5264 = (class167_sub3.aBoolean5264 | (textureDescriptor != null && (((TextureDescriptor) textureDescriptor).aByte845 != 0 || ((TextureDescriptor) textureDescriptor).aByte849 != 0)));
            aBoolean5217 |= anLocalBoolean_688_;
        }
        Class62_Sub16.method1419(anLocalInts, (byte) -68, ls);
        anIntArray5255 = ((Class101) argument_674_).anIntArray814;
        anInt5224 = ((Class101) argument_674_).anInt792;
        anIntArray5267 = ((Class101) argument_674_).anIntArray810;
        anInt5211 = ((Class101) argument_674_).anInt797;
        anIntArray5216 = ((Class101) argument_674_).anIntArray785;
        aShortArray5215 = ((Class101) argument_674_).aShortArray789;
        aClass38Array5263 = ((Class101) argument_674_).aClass38Array787;
        aClass185Array5243 = ((Class101) argument_674_).aClass185Array817;
        Class106[] class106s = new Class106[anInt5211];
        if (((Class101) argument_674_).aClass147Array784 != null) {
            anInt5237 = ((Class101) argument_674_).aClass147Array784.length;
            aClass359Array5246 = new Class359[anInt5237];
            aClass173Array5210 = new Class173[anInt5237];
            for (int anLocalInt = 0; anLocalInt < anInt5237; anLocalInt++) {
                Class147 class147 = ((Class101) argument_674_).aClass147Array784[anLocalInt];
                Class125 class125 = Node_Sub31_Sub4.method887((byte) 113, (((Class147) class147).anInt1118));
                int anLocalInt_689_ = -1;
                for (int anLocalInt_690_ = 0; anLocalInt_690_ < anInt5245; anLocalInt_690_++) {
                    if (anLocalInts[anLocalInt_690_] == ((Class147) class147).anInt1115) {
                        anLocalInt_689_ = anLocalInt_690_;
                        break;
                    }
                }
                if (anLocalInt_689_ == -1)
                    throw new RuntimeException();
                int anLocalInt_691_ = ((HslToRgb.table[(((Class101) argument_674_).aShortArray783[((Class147) class147).anInt1115]) & 0xffff]) & 0xffffff);
                anLocalInt_691_ = (anLocalInt_691_ | -(((Class101) argument_674_).aByteArray816 == null ? (int) 0 : (((Class101) argument_674_).aByteArray816[((Class147) class147).anInt1115])) + 255 << 24);
                aClass173Array5210[anLocalInt] = new Class173(anLocalInt_689_, (((Class101) argument_674_).aShortArray798[((Class147) class147).anInt1115]), (((Class101) argument_674_).aShortArray807[((Class147) class147).anInt1115]), (((Class101) argument_674_).aShortArray793[((Class147) class147).anInt1115]), ((Class125) class125).anInt1018, ((Class125) class125).anInt1019, ((Class125) class125).anInt1014, ((Class125) class125).anInt1017, ((Class125) class125).anInt1015, ((Class125) class125).aBoolean1016, ((Class125) class125).aBoolean1013, ((Class147) class147).anInt1114);
                aClass359Array5246[anLocalInt] = new Class359(anLocalInt_691_);
            }
        }
        int anLocalInt = anInt5245 * 3;
        aFloatArray5256 = new float[anLocalInt];
        aShortArray5233 = new short[anLocalInt];
        aShortArray5223 = new short[anInt5245];
        aByteArray5230 = new byte[anInt5245];
        aShortArray5248 = new short[anLocalInt];
        aShort5232 = (short) argument_677_;
        aShortArray5219 = new short[anLocalInt];
        aShortArray5220 = new short[anInt5245];
        aFloatArray5234 = new float[anLocalInt];
        aShortArray5239 = new short[anLocalInt];
        aShortArray5250 = new short[anInt5245];
        aShort5261 = (short) argument_676_;
        if (((Class101) argument_674_).aShortArray794 != null)
            aShortArray5221 = new short[anInt5245];
        aShortArray5212 = new short[anInt5245];
        aShortArray5238 = new short[anInt5245];
        aByteArray5253 = new byte[anLocalInt];
        DoublyLinkedNode_Sub51_Sub19_Sub1.aLongArray6675 = new long[anLocalInt];
        int anLocalInt_692_ = 0;
        for (int anLocalInt_693_ = 0; anLocalInt_693_ < ((Class101) argument_674_).anInt797; anLocalInt_693_++) {
            int anLocalInt_694_ = anIntArray5260[anLocalInt_693_];
            anIntArray5260[anLocalInt_693_] = anLocalInt_692_;
            anLocalInt_692_ += anLocalInt_694_;
            class106s[anLocalInt_693_] = new Class106();
        }
        anIntArray5260[((Class101) argument_674_).anInt797] = anLocalInt_692_;
        Class358 class358 = Statics.method2485(argument_674_, true, anInt5245, anLocalInts);
        Class45[] class45s = new Class45[((Class101) argument_674_).anInt795];
        for (int anLocalInt_695_ = 0; ((Class101) argument_674_).anInt795 > anLocalInt_695_; anLocalInt_695_++) {
            short anLocalInt_696_ = ((Class101) argument_674_).aShortArray798[anLocalInt_695_];
            short anLocalInt_697_ = ((Class101) argument_674_).aShortArray807[anLocalInt_695_];
            short anLocalInt_698_ = ((Class101) argument_674_).aShortArray793[anLocalInt_695_];
            int anLocalInt_699_ = (-anIntArray5255[anLocalInt_696_] + anIntArray5255[anLocalInt_697_]);
            int anLocalInt_700_ = (-anIntArray5267[anLocalInt_696_] + anIntArray5267[anLocalInt_697_]);
            int anLocalInt_701_ = (-anIntArray5216[anLocalInt_696_] + anIntArray5216[anLocalInt_697_]);
            int anLocalInt_702_ = (-anIntArray5255[anLocalInt_696_] + anIntArray5255[anLocalInt_698_]);
            int anLocalInt_703_ = (anIntArray5267[anLocalInt_698_] - anIntArray5267[anLocalInt_696_]);
            int anLocalInt_704_ = (-anIntArray5216[anLocalInt_696_] + anIntArray5216[anLocalInt_698_]);
            int anLocalInt_705_ = (anLocalInt_704_ * anLocalInt_700_ - anLocalInt_701_ * anLocalInt_703_);
            int anLocalInt_706_ = (anLocalInt_701_ * anLocalInt_702_ - anLocalInt_704_ * anLocalInt_699_);
            int anLocalInt_707_;
            for (anLocalInt_707_ = (anLocalInt_703_ * anLocalInt_699_ - anLocalInt_700_ * anLocalInt_702_); (anLocalInt_705_ > 8192 || anLocalInt_706_ > 8192 || anLocalInt_707_ > 8192 || anLocalInt_705_ < -8192 || anLocalInt_706_ < -8192 || anLocalInt_707_ < -8192); anLocalInt_706_ >>= 1) {
                anLocalInt_705_ >>= 1;
                anLocalInt_707_ >>= 1;
            }
            int anLocalInt_708_ = (int) Math.sqrt((double) (anLocalInt_707_ * anLocalInt_707_ + anLocalInt_706_ * anLocalInt_706_ + (anLocalInt_705_ * anLocalInt_705_)));
            if (anLocalInt_708_ <= 0)
                anLocalInt_708_ = 1;
            anLocalInt_707_ = anLocalInt_707_ * 256 / anLocalInt_708_;
            anLocalInt_705_ = anLocalInt_705_ * 256 / anLocalInt_708_;
            anLocalInt_706_ = anLocalInt_706_ * 256 / anLocalInt_708_;
            byte anLocalInt_709_ = (((Class101) argument_674_).aByteArray813 == null ? (byte) 0 : (((Class101) argument_674_).aByteArray813[anLocalInt_695_]));
            if (anLocalInt_709_ == 0) {
                Class106 class106 = class106s[anLocalInt_696_];
                ((Class106) class106).anInt866 += anLocalInt_706_;
                ((Class106) class106).anInt868++;
                ((Class106) class106).anInt870 += anLocalInt_707_;
                ((Class106) class106).anInt869 += anLocalInt_705_;
                class106 = class106s[anLocalInt_697_];
                ((Class106) class106).anInt866 += anLocalInt_706_;
                ((Class106) class106).anInt869 += anLocalInt_705_;
                ((Class106) class106).anInt870 += anLocalInt_707_;
                ((Class106) class106).anInt868++;
                class106 = class106s[anLocalInt_698_];
                ((Class106) class106).anInt866 += anLocalInt_706_;
                ((Class106) class106).anInt869 += anLocalInt_705_;
                ((Class106) class106).anInt870 += anLocalInt_707_;
                ((Class106) class106).anInt868++;
            } else if (anLocalInt_709_ == 1) {
                Class45 class45 = class45s[anLocalInt_695_] = new Class45();
                ((Class45) class45).anInt317 = anLocalInt_707_;
                ((Class45) class45).anInt313 = anLocalInt_705_;
                ((Class45) class45).anInt318 = anLocalInt_706_;
            }
        }
        for (int anLocalInt_710_ = 0; anLocalInt_710_ < anInt5245; anLocalInt_710_++) {
            int anLocalInt_711_ = anLocalInts[anLocalInt_710_];
            int anLocalInt_712_ = (((Class101) argument_674_).aShortArray783[anLocalInt_711_] & 0xffff);
            int anLocalInt_713_;
            if (((Class101) argument_674_).aByteArray818 == null)
                anLocalInt_713_ = -1;
            else
                anLocalInt_713_ = (((Class101) argument_674_).aByteArray818[anLocalInt_711_]);
            int anLocalInt_714_;
            if (((Class101) argument_674_).aByteArray816 != null)
                anLocalInt_714_ = (((Class101) argument_674_).aByteArray816[anLocalInt_711_]) & 0xff;
            else
                anLocalInt_714_ = 0;
            short anLocalInt_715_ = (((Class101) argument_674_).aShortArray815 != null ? ((Class101) argument_674_).aShortArray815[anLocalInt_711_] : (short) -1);
            if (anLocalInt_715_ != -1 && (anInt5231 & 0x40) != 0) {
                TextureDescriptor textureDescriptor = textureSource.getDescriptor(anLocalInt_715_ & 0xffff, true);
                if (((TextureDescriptor) textureDescriptor).aBoolean836)
                    anLocalInt_715_ = (short) -1;
            }
            float f = 0.0F;
            float f_716_ = 0.0F;
            float f_717_ = 0.0F;
            float f_718_ = 0.0F;
            float f_719_ = 0.0F;
            float f_720_ = 0.0F;
            int anLocalInt_721_ = 0;
            int anLocalInt_722_ = 0;
            int anLocalInt_723_ = 0;
            if (anLocalInt_715_ != -1) {
                if (anLocalInt_713_ == -1) {
                    f_718_ = 1.0F;
                    f_720_ = 0.0F;
                    f_717_ = 1.0F;
                    f = 0.0F;
                    anLocalInt_721_ = 1;
                    f_716_ = 1.0F;
                    anLocalInt_722_ = 2;
                    f_719_ = 0.0F;
                } else {
                    anLocalInt_713_ &= 0xff;
                    byte anLocalInt_724_ = (((Class101) argument_674_).aByteArray800[anLocalInt_713_]);
                    if (anLocalInt_724_ == 0) {
                        short anLocalInt_725_ = (((Class101) argument_674_).aShortArray798[anLocalInt_711_]);
                        short anLocalInt_726_ = (((Class101) argument_674_).aShortArray807[anLocalInt_711_]);
                        short anLocalInt_727_ = (((Class101) argument_674_).aShortArray793[anLocalInt_711_]);
                        short anLocalInt_728_ = (((Class101) argument_674_).aShortArray821[anLocalInt_713_]);
                        short anLocalInt_729_ = (((Class101) argument_674_).aShortArray803[anLocalInt_713_]);
                        short anLocalInt_730_ = (((Class101) argument_674_).aShortArray799[anLocalInt_713_]);
                        float f_731_ = (float) (((Class101) argument_674_).anIntArray814[anLocalInt_728_]);
                        float f_732_ = (float) (((Class101) argument_674_).anIntArray810[anLocalInt_728_]);
                        float f_733_ = (float) (((Class101) argument_674_).anIntArray785[anLocalInt_728_]);
                        float f_734_ = ((float) (((Class101) argument_674_).anIntArray814[anLocalInt_729_]) - f_731_);
                        float f_735_ = ((float) (((Class101) argument_674_).anIntArray810[anLocalInt_729_]) - f_732_);
                        float f_736_ = (-f_733_ + (float) (((Class101) argument_674_).anIntArray785[anLocalInt_729_]));
                        float f_737_ = ((float) (((Class101) argument_674_).anIntArray814[anLocalInt_730_]) - f_731_);
                        float f_738_ = (-f_732_ + (float) (((Class101) argument_674_).anIntArray810[anLocalInt_730_]));
                        float f_739_ = (-f_733_ + (float) (((Class101) argument_674_).anIntArray785[anLocalInt_730_]));
                        float f_740_ = ((float) (((Class101) argument_674_).anIntArray814[anLocalInt_725_]) - f_731_);
                        float f_741_ = (-f_732_ + (float) (((Class101) argument_674_).anIntArray810[anLocalInt_725_]));
                        float f_742_ = (-f_733_ + (float) (((Class101) argument_674_).anIntArray785[anLocalInt_725_]));
                        float f_743_ = ((float) (((Class101) argument_674_).anIntArray814[anLocalInt_726_]) - f_731_);
                        float f_744_ = (-f_732_ + (float) (((Class101) argument_674_).anIntArray810[anLocalInt_726_]));
                        float f_745_ = ((float) (((Class101) argument_674_).anIntArray785[anLocalInt_726_]) - f_733_);
                        float f_746_ = ((float) (((Class101) argument_674_).anIntArray814[anLocalInt_727_]) - f_731_);
                        float f_747_ = ((float) (((Class101) argument_674_).anIntArray810[anLocalInt_727_]) - f_732_);
                        float f_748_ = (-f_733_ + (float) (((Class101) argument_674_).anIntArray785[anLocalInt_727_]));
                        float f_749_ = -(f_738_ * f_736_) + f_739_ * f_735_;
                        float f_750_ = f_737_ * f_736_ - f_739_ * f_734_;
                        float f_751_ = -(f_735_ * f_737_) + f_734_ * f_738_;
                        float f_752_ = -(f_750_ * f_739_) + f_751_ * f_738_;
                        float f_753_ = -(f_737_ * f_751_) + f_749_ * f_739_;
                        float f_754_ = -(f_738_ * f_749_) + f_750_ * f_737_;
                        float f_755_ = 1.0F / (f_754_ * f_736_ + (f_753_ * f_735_ + f_752_ * f_734_));
                        f_719_ = (f_748_ * f_754_ + (f_746_ * f_752_ + f_753_ * f_747_)) * f_755_;
                        f = f_755_ * (f_752_ * f_740_ + f_741_ * f_753_ + f_754_ * f_742_);
                        f_717_ = f_755_ * (f_745_ * f_754_ + (f_743_ * f_752_ + f_753_ * f_744_));
                        f_752_ = f_735_ * f_751_ - f_736_ * f_750_;
                        f_754_ = -(f_749_ * f_735_) + f_750_ * f_734_;
                        f_753_ = -(f_734_ * f_751_) + f_749_ * f_736_;
                        f_755_ = 1.0F / (f_737_ * f_752_ + f_738_ * f_753_ + f_754_ * f_739_);
                        f_720_ = (f_746_ * f_752_ + f_747_ * f_753_ + f_748_ * f_754_) * f_755_;
                        f_716_ = f_755_ * (f_742_ * f_754_ + (f_753_ * f_741_ + f_740_ * f_752_));
                        f_718_ = f_755_ * (f_753_ * f_744_ + f_752_ * f_743_ + f_754_ * f_745_);
                    } else {
                        short anLocalInt_756_ = (((Class101) argument_674_).aShortArray798[anLocalInt_711_]);
                        short anLocalInt_757_ = (((Class101) argument_674_).aShortArray807[anLocalInt_711_]);
                        short anLocalInt_758_ = (((Class101) argument_674_).aShortArray793[anLocalInt_711_]);
                        int anLocalInt_759_ = (((Class358) class358).anIntArray3034[anLocalInt_713_]);
                        int anLocalInt_760_ = (((Class358) class358).anIntArray3035[anLocalInt_713_]);
                        int anLocalInt_761_ = (((Class358) class358).anIntArray3030[anLocalInt_713_]);
                        float[] fs = (((Class358) class358).aFloatArrayArray3032[anLocalInt_713_]);
                        byte anLocalInt_762_ = (((Class101) argument_674_).aByteArray786[anLocalInt_713_]);
                        float f_763_ = ((float) (((Class101) argument_674_).anIntArray819[anLocalInt_713_]) / 256.0F);
                        if (anLocalInt_724_ == 1) {
                            float f_764_ = ((float) (((Class101) argument_674_).anIntArray791[anLocalInt_713_]) / 1024.0F);
                            Node_Sub16.method699(anLocalInt_759_, fs, anLocalInt_762_, f_763_, anLocalInt_760_, (((Class101) argument_674_).anIntArray810[anLocalInt_756_]), f_764_, anLocalInt_761_, (((Class101) argument_674_).anIntArray785[anLocalInt_756_]), DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, (((Class101) argument_674_).anIntArray814[anLocalInt_756_]), -111);
                            f_716_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            Node_Sub16.method699(anLocalInt_759_, fs, anLocalInt_762_, f_763_, anLocalInt_760_, (((Class101) argument_674_).anIntArray810[anLocalInt_757_]), f_764_, anLocalInt_761_, (((Class101) argument_674_).anIntArray785[anLocalInt_757_]), DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, (((Class101) argument_674_).anIntArray814[anLocalInt_757_]), -118);
                            f_717_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            f_718_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            Node_Sub16.method699(anLocalInt_759_, fs, anLocalInt_762_, f_763_, anLocalInt_760_, (((Class101) argument_674_).anIntArray810[anLocalInt_758_]), f_764_, anLocalInt_761_, (((Class101) argument_674_).anIntArray785[anLocalInt_758_]), DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, (((Class101) argument_674_).anIntArray814[anLocalInt_758_]), -105);
                            f_720_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f_719_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            float f_765_ = f_764_ / 2.0F;
                            if ((anLocalInt_762_ & 0x1) != 0) {
                                if (!(f_765_ < f_720_ - f_716_)) {
                                    if (f_716_ - f_720_ > f_765_) {
                                        anLocalInt_722_ = 2;
                                        f_720_ += f_764_;
                                    }
                                } else {
                                    f_720_ -= f_764_;
                                    anLocalInt_722_ = 1;
                                }
                                if (!(f_765_ < -f_716_ + f_718_)) {
                                    if (f_765_ < -f_718_ + f_716_) {
                                        f_718_ += f_764_;
                                        anLocalInt_721_ = 2;
                                    }
                                } else {
                                    anLocalInt_721_ = 1;
                                    f_718_ -= f_764_;
                                }
                            } else {
                                if (-f + f_719_ > f_765_) {
                                    anLocalInt_722_ = 1;
                                    f_719_ -= f_764_;
                                } else if (f_765_ < f - f_719_) {
                                    f_719_ += f_764_;
                                    anLocalInt_722_ = 2;
                                }
                                if (!(f_765_ < -f + f_717_)) {
                                    if (f_765_ < -f_717_ + f) {
                                        f_717_ += f_764_;
                                        anLocalInt_721_ = 2;
                                    }
                                } else {
                                    f_717_ -= f_764_;
                                    anLocalInt_721_ = 1;
                                }
                            }
                        } else if (anLocalInt_724_ == 2) {
                            float f_766_ = ((float) (((Class101) argument_674_).anIntArray805[anLocalInt_713_]) / 256.0F);
                            float f_767_ = ((float) (((Class101) argument_674_).anIntArray801[anLocalInt_713_]) / 256.0F);
                            int anLocalInt_768_ = (-(((Class101) argument_674_).anIntArray814[anLocalInt_756_]) + (((Class101) argument_674_).anIntArray814[anLocalInt_757_]));
                            int anLocalInt_769_ = ((((Class101) argument_674_).anIntArray810[anLocalInt_757_]) - (((Class101) argument_674_).anIntArray810[anLocalInt_756_]));
                            int anLocalInt_770_ = (-(((Class101) argument_674_).anIntArray785[anLocalInt_756_]) + (((Class101) argument_674_).anIntArray785[anLocalInt_757_]));
                            int anLocalInt_771_ = (-(((Class101) argument_674_).anIntArray814[anLocalInt_756_]) + (((Class101) argument_674_).anIntArray814[anLocalInt_758_]));
                            int anLocalInt_772_ = ((((Class101) argument_674_).anIntArray810[anLocalInt_758_]) - (((Class101) argument_674_).anIntArray810[anLocalInt_756_]));
                            int anLocalInt_773_ = ((((Class101) argument_674_).anIntArray785[anLocalInt_758_]) - (((Class101) argument_674_).anIntArray785[anLocalInt_756_]));
                            int anLocalInt_774_ = (anLocalInt_773_ * anLocalInt_769_ - anLocalInt_772_ * anLocalInt_770_);
                            int anLocalInt_775_ = (-(anLocalInt_773_ * anLocalInt_768_) + anLocalInt_771_ * anLocalInt_770_);
                            int anLocalInt_776_ = (-(anLocalInt_769_ * anLocalInt_771_) + anLocalInt_768_ * anLocalInt_772_);
                            float f_777_ = 64.0F / (float) (((Class101) argument_674_).anIntArray804[anLocalInt_713_]);
                            float f_778_ = 64.0F / (float) (((Class101) argument_674_).anIntArray811[anLocalInt_713_]);
                            float f_779_ = 64.0F / (float) (((Class101) argument_674_).anIntArray791[anLocalInt_713_]);
                            float f_780_ = ((fs[0] * (float) anLocalInt_774_ + (float) anLocalInt_775_ * fs[1] + (float) anLocalInt_776_ * fs[2]) / f_777_);
                            float f_781_ = (((float) anLocalInt_774_ * fs[3] + (float) anLocalInt_775_ * fs[4] + (float) anLocalInt_776_ * fs[5]) / f_778_);
                            float f_782_ = ((fs[6] * (float) anLocalInt_774_ + fs[7] * (float) anLocalInt_775_ + (float) anLocalInt_776_ * fs[8]) / f_779_);
                            anLocalInt_723_ = Class60.method1337(f_780_, f_781_, f_782_, -12855);
                            Class92.method1689(anLocalInt_723_, DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, anLocalInt_762_, anLocalInt_760_, anLocalInt_761_, (((Class101) argument_674_).anIntArray814[anLocalInt_756_]), anLocalInt_759_, 0, fs, f_767_, (((Class101) argument_674_).anIntArray785[anLocalInt_756_]), (((Class101) argument_674_).anIntArray810[anLocalInt_756_]), f_763_, f_766_);
                            f_716_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            Class92.method1689(anLocalInt_723_, DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, anLocalInt_762_, anLocalInt_760_, anLocalInt_761_, (((Class101) argument_674_).anIntArray814[anLocalInt_757_]), anLocalInt_759_, 0, fs, f_767_, (((Class101) argument_674_).anIntArray785[anLocalInt_757_]), (((Class101) argument_674_).anIntArray810[anLocalInt_757_]), f_763_, f_766_);
                            f_718_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f_717_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            Class92.method1689(anLocalInt_723_, DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596, anLocalInt_762_, anLocalInt_760_, anLocalInt_761_, (((Class101) argument_674_).anIntArray814[anLocalInt_758_]), anLocalInt_759_, 0, fs, f_767_, (((Class101) argument_674_).anIntArray785[anLocalInt_758_]), (((Class101) argument_674_).anIntArray810[anLocalInt_758_]), f_763_, f_766_);
                            f_719_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            f_720_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                        } else if (anLocalInt_724_ == 3) {
                            Class5.method226((DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596), anLocalInt_759_, (((Class101) argument_674_).anIntArray814[anLocalInt_756_]), anLocalInt_760_, (((Class101) argument_674_).anIntArray785[anLocalInt_756_]), (((Class101) argument_674_).anIntArray810[anLocalInt_756_]), fs, anLocalInt_761_, true, anLocalInt_762_, f_763_);
                            f_716_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            Class5.method226((DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596), anLocalInt_759_, (((Class101) argument_674_).anIntArray814[anLocalInt_757_]), anLocalInt_760_, (((Class101) argument_674_).anIntArray785[anLocalInt_757_]), (((Class101) argument_674_).anIntArray810[anLocalInt_757_]), fs, anLocalInt_761_, true, anLocalInt_762_, f_763_);
                            f_717_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            f_718_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            Class5.method226((DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596), anLocalInt_759_, (((Class101) argument_674_).anIntArray814[anLocalInt_758_]), anLocalInt_760_, (((Class101) argument_674_).anIntArray785[anLocalInt_758_]), (((Class101) argument_674_).anIntArray810[anLocalInt_758_]), fs, anLocalInt_761_, true, anLocalInt_762_, f_763_);
                            f_720_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[1];
                            f_719_ = DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aFloatArray6596[0];
                            if ((anLocalInt_762_ & 0x1) == 0) {
                                if (!(f_717_ - f > 0.5F)) {
                                    if (f - f_717_ > 0.5F) {
                                        anLocalInt_721_ = 2;
                                        f_717_++;
                                    }
                                } else {
                                    anLocalInt_721_ = 1;
                                    f_717_--;
                                }
                                if (!(-f + f_719_ > 0.5F)) {
                                    if (-f_719_ + f > 0.5F) {
                                        anLocalInt_722_ = 2;
                                        f_719_++;
                                    }
                                } else {
                                    anLocalInt_722_ = 1;
                                    f_719_--;
                                }
                            } else {
                                if (-f_716_ + f_720_ > 0.5F) {
                                    anLocalInt_722_ = 1;
                                    f_720_--;
                                } else if (f_716_ - f_720_ > 0.5F) {
                                    f_720_++;
                                    anLocalInt_722_ = 2;
                                }
                                if (f_718_ - f_716_ > 0.5F) {
                                    anLocalInt_721_ = 1;
                                    f_718_--;
                                } else if (-f_718_ + f_716_ > 0.5F) {
                                    anLocalInt_721_ = 2;
                                    f_718_++;
                                }
                            }
                        }
                    }
                }
            }
            byte anLocalInt_783_;
            if (((Class101) argument_674_).aByteArray813 != null)
                anLocalInt_783_ = (((Class101) argument_674_).aByteArray813[anLocalInt_711_]);
            else
                anLocalInt_783_ = (byte) 0;
            if (anLocalInt_783_ != 0) {
                if (anLocalInt_783_ == 1) {
                    Class45 class45 = class45s[anLocalInt_711_];
                    long l = ((long) ((((Class45) class45).anInt317 + 256 << 22) + ((anLocalInt_713_ << 2) + (((Class45) class45).anInt313 > 0 ? 1024 : 2048)) + (((Class45) class45).anInt318 + 256 << 12)) + (((long) anLocalInt_714_ + (long) (anLocalInt_723_ << 24) + (long) (anLocalInt_712_ << 8)) << 32));
                    aShortArray5250[anLocalInt_710_] = method2719(argument_674_, l, ((Class45) class45).anInt317, f, ((Class45) class45).anInt313, ((Class45) class45).anInt318, 118, f_716_, 0, (((Class101) argument_674_).aShortArray798[anLocalInt_711_]));
                    aShortArray5220[anLocalInt_710_] = method2719(argument_674_, (long) anLocalInt_721_ + l, ((Class45) class45).anInt317, f_717_, ((Class45) class45).anInt313, ((Class45) class45).anInt318, 124, f_718_, 0, (((Class101) argument_674_).aShortArray807[anLocalInt_711_]));
                    aShortArray5223[anLocalInt_710_] = method2719(argument_674_, (long) anLocalInt_722_ + l, ((Class45) class45).anInt317, f_719_, ((Class45) class45).anInt313, ((Class45) class45).anInt318, 98, f_720_, 0, (((Class101) argument_674_).aShortArray793[anLocalInt_711_]));
                }
            } else {
                long l = ((((long) (anLocalInt_723_ << 24) + (long) (anLocalInt_712_ << 8) - -(long) anLocalInt_714_) << 32) + (long) (anLocalInt_713_ << 2));
                short anLocalInt_784_ = (((Class101) argument_674_).aShortArray798[anLocalInt_711_]);
                short anLocalInt_785_ = (((Class101) argument_674_).aShortArray807[anLocalInt_711_]);
                short anLocalInt_786_ = (((Class101) argument_674_).aShortArray793[anLocalInt_711_]);
                Class106 class106 = class106s[anLocalInt_784_];
                aShortArray5250[anLocalInt_710_] = method2719(argument_674_, l, ((Class106) class106).anInt870, f, ((Class106) class106).anInt869, ((Class106) class106).anInt866, 112, f_716_, ((Class106) class106).anInt868, anLocalInt_784_);
                class106 = class106s[anLocalInt_785_];
                aShortArray5220[anLocalInt_710_] = method2719(argument_674_, (long) anLocalInt_721_ + l, ((Class106) class106).anInt870, f_717_, ((Class106) class106).anInt869, ((Class106) class106).anInt866, 127, f_718_, ((Class106) class106).anInt868, anLocalInt_785_);
                class106 = class106s[anLocalInt_786_];
                aShortArray5223[anLocalInt_710_] = method2719(argument_674_, (long) anLocalInt_722_ + l, ((Class106) class106).anInt870, f_719_, ((Class106) class106).anInt869, ((Class106) class106).anInt866, 112, f_720_, ((Class106) class106).anInt868, anLocalInt_786_);
            }
            if (((Class101) argument_674_).aByteArray816 != null)
                aByteArray5230[anLocalInt_710_] = (((Class101) argument_674_).aByteArray816[anLocalInt_711_]);
            if (((Class101) argument_674_).aShortArray794 != null)
                aShortArray5221[anLocalInt_710_] = (((Class101) argument_674_).aShortArray794[anLocalInt_711_]);
            aShortArray5212[anLocalInt_710_] = ((Class101) argument_674_).aShortArray783[anLocalInt_711_];
            aShortArray5238[anLocalInt_710_] = anLocalInt_715_;
        }
        int anLocalInt_787_ = 0;
        short anLocalInt_788_ = -10000;
        for (int anLocalInt_789_ = 0; anInt5213 > anLocalInt_789_; anLocalInt_789_++) {
            short anLocalInt_790_ = aShortArray5238[anLocalInt_789_];
            if (anLocalInt_790_ != anLocalInt_788_) {
                anLocalInt_787_++;
                anLocalInt_788_ = anLocalInt_790_;
            }
        }
        anIntArray5266 = new int[anLocalInt_787_ + 1];
        anLocalInt_787_ = 0;
        anLocalInt_788_ = (short) -10000;
        for (int anLocalInt_791_ = 0; anLocalInt_791_ < anInt5213; anLocalInt_791_++) {
            short anLocalInt_792_ = aShortArray5238[anLocalInt_791_];
            if (anLocalInt_792_ != anLocalInt_788_) {
                anLocalInt_788_ = anLocalInt_792_;
                anIntArray5266[anLocalInt_787_++] = anLocalInt_791_;
            }
        }
        anIntArray5266[anLocalInt_787_] = anInt5213;
        DoublyLinkedNode_Sub51_Sub19_Sub1.aLongArray6675 = null;
        aShortArray5233 = Class368_Sub3.method4040(0, aShortArray5233, anInt5268);
        aShortArray5219 = Class368_Sub3.method4040(0, aShortArray5219, anInt5268);
        aShortArray5239 = Class368_Sub3.method4040(0, aShortArray5239, anInt5268);
        aByteArray5253 = Node_Sub33.method1038(anInt5268, aByteArray5253, true);
        aFloatArray5234 = Class107.method1955(0, aFloatArray5234, anInt5268);
        aFloatArray5256 = Class107.method1955(0, aFloatArray5256, anInt5268);
        if (((Class101) argument_674_).anIntArray796 != null && Class91.method1685(32, argument_675_, anInt5231))
            anIntArrayArray5244 = argument_674_.method1743(0, false);
        if (((Class101) argument_674_).aClass147Array784 != null && DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1864(anInt5231, (byte) -81, argument_675_))
            anIntArrayArray5227 = argument_674_.method1737(-127);
        if (((Class101) argument_674_).anIntArray809 != null && Class385.method4121(argument_675_, anInt5231, -1)) {
            int anLocalInt_793_ = 0;
            int[] anLocalInts_794_ = new int[256];
            for (int anLocalInt_795_ = 0; anInt5245 > anLocalInt_795_; anLocalInt_795_++) {
                int anLocalInt_796_ = (((Class101) argument_674_).anIntArray809[anLocalInts[anLocalInt_795_]]);
                if (anLocalInt_796_ >= 0) {
                    if (anLocalInt_796_ > anLocalInt_793_)
                        anLocalInt_793_ = anLocalInt_796_;
                    anLocalInts_794_[anLocalInt_796_]++;
                }
            }
            anIntArrayArray5228 = new int[anLocalInt_793_ + 1][];
            for (int anLocalInt_797_ = 0; anLocalInt_793_ >= anLocalInt_797_; anLocalInt_797_++) {
                anIntArrayArray5228[anLocalInt_797_] = new int[anLocalInts_794_[anLocalInt_797_]];
                anLocalInts_794_[anLocalInt_797_] = 0;
            }
            for (int anLocalInt_798_ = 0; anInt5245 > anLocalInt_798_; anLocalInt_798_++) {
                int anLocalInt_799_ = (((Class101) argument_674_).anIntArray809[anLocalInts[anLocalInt_798_]]);
                if (anLocalInt_799_ >= 0)
                    anIntArrayArray5228[anLocalInt_799_][anLocalInts_794_[anLocalInt_799_]++] = anLocalInt_798_;
            }
        }
    }
}
