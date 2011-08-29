/* Class142_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlTexture_Sub4_Sub1 extends GlTexture_Sub4 {
    int anInt6545;
    static Node_Sub9_Sub2 aClass59_Sub9_Sub2_6546;
    boolean aBoolean6547;
    static int anInt6548;
    float tileH;
    float tileW;
    static int anInt6551 = -1;
    int anInt6552;

    GlTexture_Sub4_Sub1(GlToolkit argument_0_, int argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_) {
        super(argument_0_, 3553, argument_1_, argument_4_, argument_5_);
        this.anInt6552 = argument_2_;
        this.tileW = (float) argument_2_ / (float) argument_4_;
        this.aBoolean6547 = false;
        this.tileH = (float) argument_3_ / (float) argument_5_;
        this.anInt6545 = argument_3_;
        this.setWrappingMode(false, false);
    }

    public static void method2506(int argument) {
        aClass59_Sub9_Sub2_6546 = null;
    }

    static byte[][][] method2507(int argument, int argument_6_) {
        byte[][][] anLocalInts = new byte[argument_6_][4][];
        byte[] anLocalInts_8_ = new byte[argument * argument];
        int anLocalInt_9_ = 0;
        for (int anLocalInt_10_ = 0; argument > anLocalInt_10_; anLocalInt_10_++) {
            for (int anLocalInt_11_ = 0; argument > anLocalInt_11_; anLocalInt_11_++) {
                if (anLocalInt_11_ <= anLocalInt_10_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[0][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_12_ = argument - 1; anLocalInt_12_ >= 0; anLocalInt_12_--) {
            for (int anLocalInt_13_ = 0; argument > anLocalInt_13_; anLocalInt_13_++) {
                if (anLocalInt_12_ >= anLocalInt_13_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[0][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_14_ = 0; anLocalInt_14_ < argument; anLocalInt_14_++) {
            for (int anLocalInt_15_ = 0; argument > anLocalInt_15_; anLocalInt_15_++) {
                if (anLocalInt_15_ >= anLocalInt_14_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[0][2] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_16_ = argument - 1; anLocalInt_16_ >= 0; anLocalInt_16_--) {
            for (int anLocalInt_17_ = 0; anLocalInt_17_ < argument; anLocalInt_17_++) {
                if (anLocalInt_16_ <= anLocalInt_17_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[0][3] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_18_ = argument - 1; anLocalInt_18_ >= 0; anLocalInt_18_--) {
            for (int anLocalInt_19_ = 0; anLocalInt_19_ < argument; anLocalInt_19_++) {
                if (anLocalInt_18_ >> 1 >= anLocalInt_19_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[1][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_20_ = 0; argument > anLocalInt_20_; anLocalInt_20_++) {
            for (int anLocalInt_21_ = 0; argument > anLocalInt_21_; anLocalInt_21_++) {
                if (anLocalInt_9_ < 0 || anLocalInts_8_.length <= anLocalInt_9_)
                    anLocalInt_9_++;
                else {
                    if (anLocalInt_20_ << 1 <= anLocalInt_21_)
                        anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                    anLocalInt_9_++;
                }
            }
        }
        anLocalInts[1][1] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_22_ = 0; anLocalInt_22_ < argument; anLocalInt_22_++) {
            for (int anLocalInt_23_ = argument - 1; anLocalInt_23_ >= 0; anLocalInt_23_--) {
                if (anLocalInt_23_ <= anLocalInt_22_ >> 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[1][2] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_24_ = argument - 1; anLocalInt_24_ >= 0; anLocalInt_24_--) {
            for (int anLocalInt_25_ = argument - 1; anLocalInt_25_ >= 0; anLocalInt_25_--) {
                if (anLocalInt_25_ >= anLocalInt_24_ << 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[1][3] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_26_ = argument - 1; anLocalInt_26_ >= 0; anLocalInt_26_--) {
            for (int anLocalInt_27_ = argument - 1; anLocalInt_27_ >= 0; anLocalInt_27_--) {
                if (anLocalInt_26_ >> 1 >= anLocalInt_27_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[2][0] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_28_ = argument - 1; anLocalInt_28_ >= 0; anLocalInt_28_--) {
            for (int anLocalInt_29_ = 0; anLocalInt_29_ < argument; anLocalInt_29_++) {
                if (anLocalInt_28_ << 1 <= anLocalInt_29_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[2][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_30_ = 0; anLocalInt_30_ < argument; anLocalInt_30_++) {
            for (int anLocalInt_31_ = 0; anLocalInt_31_ < argument; anLocalInt_31_++) {
                if (anLocalInt_31_ <= anLocalInt_30_ >> 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[2][2] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_32_ = 0; argument > anLocalInt_32_; anLocalInt_32_++) {
            for (int anLocalInt_33_ = argument - 1; anLocalInt_33_ >= 0; anLocalInt_33_--) {
                if (anLocalInt_33_ >= anLocalInt_32_ << 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[2][3] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_34_ = argument - 1; anLocalInt_34_ >= 0; anLocalInt_34_--) {
            for (int anLocalInt_35_ = 0; argument > anLocalInt_35_; anLocalInt_35_++) {
                if (anLocalInt_35_ >= anLocalInt_34_ >> 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[3][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_36_ = 0; argument > anLocalInt_36_; anLocalInt_36_++) {
            for (int anLocalInt_37_ = 0; argument > anLocalInt_37_; anLocalInt_37_++) {
                if (anLocalInt_37_ <= anLocalInt_36_ << 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[3][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_38_ = 0; argument > anLocalInt_38_; anLocalInt_38_++) {
            for (int anLocalInt_39_ = argument - 1; anLocalInt_39_ >= 0; anLocalInt_39_--) {
                if (anLocalInt_38_ >> 1 <= anLocalInt_39_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[3][2] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_40_ = argument - 1; anLocalInt_40_ >= 0; anLocalInt_40_--) {
            for (int anLocalInt_41_ = argument - 1; anLocalInt_41_ >= 0; anLocalInt_41_--) {
                if (anLocalInt_40_ << 1 >= anLocalInt_41_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[3][3] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_42_ = argument - 1; anLocalInt_42_ >= 0; anLocalInt_42_--) {
            for (int anLocalInt_43_ = argument - 1; anLocalInt_43_ >= 0; anLocalInt_43_--) {
                if (anLocalInt_43_ >= anLocalInt_42_ >> 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[4][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_44_ = argument - 1; anLocalInt_44_ >= 0; anLocalInt_44_--) {
            for (int anLocalInt_45_ = 0; anLocalInt_45_ < argument; anLocalInt_45_++) {
                if (anLocalInt_45_ <= anLocalInt_44_ << 1)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[4][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_46_ = 0; argument > anLocalInt_46_; anLocalInt_46_++) {
            for (int anLocalInt_47_ = 0; argument > anLocalInt_47_; anLocalInt_47_++) {
                if (anLocalInt_46_ >> 1 <= anLocalInt_47_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[4][2] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_48_ = 0; argument > anLocalInt_48_; anLocalInt_48_++) {
            for (int anLocalInt_49_ = argument - 1; anLocalInt_49_ >= 0; anLocalInt_49_--) {
                if (anLocalInt_48_ << 1 >= anLocalInt_49_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[4][3] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_50_ = 0; anLocalInt_50_ < argument; anLocalInt_50_++) {
            for (int anLocalInt_51_ = 0; argument > anLocalInt_51_; anLocalInt_51_++) {
                if (argument / 2 >= anLocalInt_51_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[5][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_52_ = 0; argument > anLocalInt_52_; anLocalInt_52_++) {
            for (int anLocalInt_53_ = 0; anLocalInt_53_ < argument; anLocalInt_53_++) {
                if (anLocalInt_52_ <= argument / 2)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[5][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_54_ = 0; anLocalInt_54_ < argument; anLocalInt_54_++) {
            for (int anLocalInt_55_ = 0; argument > anLocalInt_55_; anLocalInt_55_++) {
                if (argument / 2 <= anLocalInt_55_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[5][2] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_56_ = 0; anLocalInt_56_ < argument; anLocalInt_56_++) {
            for (int anLocalInt_57_ = 0; argument > anLocalInt_57_; anLocalInt_57_++) {
                if (argument / 2 <= anLocalInt_56_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[5][3] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_58_ = 0; anLocalInt_58_ < argument; anLocalInt_58_++) {
            for (int anLocalInt_59_ = 0; argument > anLocalInt_59_; anLocalInt_59_++) {
                if (-(argument / 2) + anLocalInt_58_ >= anLocalInt_59_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[6][0] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_60_ = argument - 1; anLocalInt_60_ >= 0; anLocalInt_60_--) {
            for (int anLocalInt_61_ = 0; argument > anLocalInt_61_; anLocalInt_61_++) {
                if (anLocalInt_61_ <= anLocalInt_60_ - argument / 2)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[6][1] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_62_ = argument - 1; anLocalInt_62_ >= 0; anLocalInt_62_--) {
            for (int anLocalInt_63_ = argument - 1; anLocalInt_63_ >= 0; anLocalInt_63_--) {
                if (anLocalInt_63_ <= anLocalInt_62_ - argument / 2)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[6][2] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_64_ = 0; argument > anLocalInt_64_; anLocalInt_64_++) {
            for (int anLocalInt_65_ = argument - 1; anLocalInt_65_ >= 0; anLocalInt_65_--) {
                if (-(argument / 2) + anLocalInt_64_ >= anLocalInt_65_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[6][3] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_66_ = 0; argument > anLocalInt_66_; anLocalInt_66_++) {
            for (int anLocalInt_67_ = 0; argument > anLocalInt_67_; anLocalInt_67_++) {
                if (anLocalInt_66_ - argument / 2 <= anLocalInt_67_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[7][0] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_68_ = argument - 1; anLocalInt_68_ >= 0; anLocalInt_68_--) {
            for (int anLocalInt_69_ = 0; anLocalInt_69_ < argument; anLocalInt_69_++) {
                if (-(argument / 2) + anLocalInt_68_ <= anLocalInt_69_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[7][1] = anLocalInts_8_;
        anLocalInts_8_ = new byte[argument * argument];
        anLocalInt_9_ = 0;
        for (int anLocalInt_70_ = argument - 1; anLocalInt_70_ >= 0; anLocalInt_70_--) {
            for (int anLocalInt_71_ = argument - 1; anLocalInt_71_ >= 0; anLocalInt_71_--) {
                if (-(argument / 2) + anLocalInt_70_ <= anLocalInt_71_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[7][2] = anLocalInts_8_;
        anLocalInt_9_ = 0;
        anLocalInts_8_ = new byte[argument * argument];
        for (int anLocalInt_72_ = 0; argument > anLocalInt_72_; anLocalInt_72_++) {
            for (int anLocalInt_73_ = argument - 1; anLocalInt_73_ >= 0; anLocalInt_73_--) {
                if (anLocalInt_72_ - argument / 2 <= anLocalInt_73_)
                    anLocalInts_8_[anLocalInt_9_] = (byte) -1;
                anLocalInt_9_++;
            }
        }
        anLocalInts[7][3] = anLocalInts_8_;
        return anLocalInts;
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_74_, int argument_75_, int argument_76_, int argument_77_, int argument_78_, int[] argument_79_) {
        super(argument_74_, 3553, 6408, argument_77_, argument_78_);
        this.anInt6552 = argument_75_;
        this.anInt6545 = argument_76_;
        this.method2505(argument_79_, true, 0, -128, 0, argument_76_, 0, argument_75_, 0);
        this.aBoolean6547 = false;
        this.tileH = (float) argument_76_ / (float) argument_78_;
        this.tileW = (float) argument_75_ / (float) argument_77_;
        this.setWrappingMode(false, false);
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_80_, int argument_81_, int argument_82_, int argument_83_, int argument_84_, boolean argument_85_, byte[] bytes, int argument_87_) {
        super(argument_80_, argument_81_, argument_82_, argument_83_, argument_84_, argument_85_, bytes, argument_87_, true);
        this.anInt6545 = argument_84_;
        this.anInt6552 = argument_83_;
        if (this.type != 34037) {
            this.aBoolean6547 = true;
            this.tileW = this.tileH = 1.0F;
        } else {
            this.tileH = (float) argument_84_;
            this.tileW = (float) argument_83_;
            this.aBoolean6547 = false;
        }
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_88_, int argument_89_, int argument_90_, int argument_91_, int argument_92_, int argument_93_, boolean argument_94_) {
        super(argument_88_, argument_89_, argument_90_, argument_91_, argument_92_, argument_93_);
        this.anInt6552 = argument_92_;
        if (this.type == 34037) {
            this.tileH = (float) argument_93_;
            this.tileW = (float) argument_92_;
            this.aBoolean6547 = false;
        } else {
            this.tileW = this.tileH = 1.0F;
            this.aBoolean6547 = true;
        }
        this.anInt6545 = argument_93_;
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_95_, int argument_96_, int argument_97_, int argument_98_, boolean argument_99_, int[] argument_100_, int argument_101_, int argument_102_) {
        super(argument_95_, argument_96_, 6408, argument_97_, argument_98_, argument_99_, argument_100_, argument_101_, argument_102_, true);
        if (this.type != 34037) {
            this.aBoolean6547 = true;
            this.tileW = this.tileH = 1.0F;
        } else {
            this.tileW = (float) argument_97_;
            this.aBoolean6547 = false;
            this.tileH = (float) argument_98_;
        }
        this.anInt6552 = argument_97_;
        this.anInt6545 = argument_98_;
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_103_, int argument_104_, int argument_105_, int argument_106_, int argument_107_) {
        super(argument_103_, argument_104_, argument_105_, argument_106_, argument_107_);
        if (this.type == 34037) {
            this.tileH = (float) argument_107_;
            this.tileW = (float) argument_106_;
            this.aBoolean6547 = false;
        } else {
            this.aBoolean6547 = true;
            this.tileW = this.tileH = 1.0F;
        }
        this.anInt6545 = argument_107_;
        this.anInt6552 = argument_106_;
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_108_, int argument_109_, int argument_110_, int argument_111_, int argument_112_, int argument_113_, byte[] argument_114_, int argument_115_) {
        super(argument_108_, 3553, argument_109_, argument_112_, argument_113_);
        this.anInt6552 = argument_110_;
        this.anInt6545 = argument_111_;
        this.method2501(argument_110_, 0, true, -69, argument_111_, argument_114_, argument_115_, 0, 0, 0);
        this.aBoolean6547 = false;
        this.tileH = (float) argument_111_ / (float) argument_113_;
        this.tileW = (float) argument_110_ / (float) argument_112_;
        this.setWrappingMode(false, false);
    }

    GlTexture_Sub4_Sub1(GlToolkit argument_116_, int argument_117_, int argument_118_, int argument_119_, int argument_120_, int argument_121_, int argument_122_) {
        super(argument_116_, 3553, argument_117_, argument_118_, argument_121_, argument_122_);
        this.tileH = (float) argument_120_ / (float) argument_122_;
        this.aBoolean6547 = false;
        this.anInt6545 = argument_120_;
        this.tileW = (float) argument_119_ / (float) argument_121_;
        this.anInt6552 = argument_119_;
        this.setWrappingMode(false, false);
    }
}
