/* Class368_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class java_sprite_24 extends Class368_Sub2 {
    int[] pixels;

    final void method4012(int argument_0_, int argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_, int argument_6_, int argument_7_) {
        if (this.toolkit.method2100())
            throw new IllegalStateException();
        if (argument_2_ > 0 && argument_3_ > 0) {
            int anLocalInt = 0;
            int anLocalInt_8_ = 0;
            int anLocalInt_9_ = (this.toolkit.width);
            int anLocalInt_10_ = (this.anInt5698 + this.width + this.anInt5715);
            int anLocalInt_11_ = (this.anInt5719 + this.height + this.anInt5708);
            int anLocalInt_12_ = (anLocalInt_10_ << 16) / argument_2_;
            int anLocalInt_13_ = (anLocalInt_11_ << 16) / argument_3_;
            if (this.anInt5698 > 0) {
                int anLocalInt_14_ = (((this.anInt5698 << 16) + anLocalInt_12_ - 1) / anLocalInt_12_);
                argument_0_ += anLocalInt_14_;
                anLocalInt += (anLocalInt_14_ * anLocalInt_12_ - (this.anInt5698 << 16));
            }
            if (this.anInt5719 > 0) {
                int anLocalInt_15_ = (((this.anInt5719 << 16) + anLocalInt_13_ - 1) / anLocalInt_13_);
                argument_1_ += anLocalInt_15_;
                anLocalInt_8_ += (anLocalInt_15_ * anLocalInt_13_ - (this.anInt5719 << 16));
            }
            if (this.width < anLocalInt_10_)
                argument_2_ = ((this.width << 16) - anLocalInt + anLocalInt_12_ - 1) / anLocalInt_12_;
            if (this.height < anLocalInt_11_)
                argument_3_ = ((this.height << 16) - anLocalInt_8_ + anLocalInt_13_ - 1) / anLocalInt_13_;
            int anLocalInt_16_ = argument_0_ + argument_1_ * anLocalInt_9_;
            int anLocalInt_17_ = anLocalInt_9_ - argument_2_;
            if (argument_1_ + argument_3_ > (this.toolkit.clipBottom))
                argument_3_ -= (argument_1_ + argument_3_ - this.toolkit.clipBottom);
            if (argument_1_ < (this.toolkit.clipTop)) {
                int anLocalInt_18_ = (this.toolkit.clipTop - argument_1_);
                argument_3_ -= anLocalInt_18_;
                anLocalInt_16_ += anLocalInt_18_ * anLocalInt_9_;
                anLocalInt_8_ += anLocalInt_13_ * anLocalInt_18_;
            }
            if (argument_0_ + argument_2_ > (this.toolkit.clipRight)) {
                int anLocalInt_19_ = (argument_0_ + argument_2_ - this.toolkit.clipRight);
                argument_2_ -= anLocalInt_19_;
                anLocalInt_17_ += anLocalInt_19_;
            }
            if (argument_0_ < (this.toolkit.clipLeft)) {
                int anLocalInt_20_ = (this.toolkit.clipLeft - argument_0_);
                argument_2_ -= anLocalInt_20_;
                anLocalInt_16_ += anLocalInt_20_;
                anLocalInt += anLocalInt_12_ * anLocalInt_20_;
                anLocalInt_17_ += anLocalInt_20_;
            }
            int[] anLocalInts = (this.toolkit.pixels);
            if (argument_6_ == 0) {
                if (argument_4_ == 1) {
                    int anLocalInt_21_ = anLocalInt;
                    for (int anLocalInt_22_ = -argument_3_; anLocalInt_22_ < 0; anLocalInt_22_++) {
                        int anLocalInt_23_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_24_ = -argument_2_; anLocalInt_24_ < 0; anLocalInt_24_++) {
                            anLocalInts[anLocalInt_16_++] = (this.pixels[(anLocalInt >> 16) + anLocalInt_23_]);
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_21_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 0) {
                    int anLocalInt_25_ = (argument_5_ & 0xff0000) >> 16;
                    int anLocalInt_26_ = (argument_5_ & 0xff00) >> 8;
                    int anLocalInt_27_ = argument_5_ & 0xff;
                    int anLocalInt_28_ = anLocalInt;
                    for (int anLocalInt_29_ = -argument_3_; anLocalInt_29_ < 0; anLocalInt_29_++) {
                        int anLocalInt_30_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_31_ = -argument_2_; anLocalInt_31_ < 0; anLocalInt_31_++) {
                            int anLocalInt_32_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_30_]);
                            int anLocalInt_33_ = ((anLocalInt_32_ & 0xff0000) * anLocalInt_25_ & ~0xffffff);
                            int anLocalInt_34_ = ((anLocalInt_32_ & 0xff00) * anLocalInt_26_ & 0xff0000);
                            int anLocalInt_35_ = ((anLocalInt_32_ & 0xff) * anLocalInt_27_ & 0xff00);
                            anLocalInts[anLocalInt_16_++] = (anLocalInt_33_ | anLocalInt_34_ | anLocalInt_35_) >>> 8;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_28_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 3) {
                    int anLocalInt_36_ = anLocalInt;
                    for (int anLocalInt_37_ = -argument_3_; anLocalInt_37_ < 0; anLocalInt_37_++) {
                        int anLocalInt_38_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_39_ = -argument_2_; anLocalInt_39_ < 0; anLocalInt_39_++) {
                            int anLocalInt_40_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_38_]);
                            int anLocalInt_41_ = anLocalInt_40_ + argument_5_;
                            int anLocalInt_42_ = ((anLocalInt_40_ & 0xff00ff) + (argument_5_ & 0xff00ff));
                            int anLocalInt_43_ = ((anLocalInt_42_ & 0x1000100) + (anLocalInt_41_ - anLocalInt_42_ & 0x10000));
                            anLocalInts[anLocalInt_16_++] = (anLocalInt_41_ - anLocalInt_43_ | anLocalInt_43_ - (anLocalInt_43_ >>> 8));
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_36_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 2) {
                    int anLocalInt_44_ = argument_5_ >>> 24;
                    int anLocalInt_45_ = 256 - anLocalInt_44_;
                    int anLocalInt_46_ = ((argument_5_ & 0xff00ff) * anLocalInt_45_ & ~0xff00ff);
                    int anLocalInt_47_ = (argument_5_ & 0xff00) * anLocalInt_45_ & 0xff0000;
                    argument_5_ = (anLocalInt_46_ | anLocalInt_47_) >>> 8;
                    int anLocalInt_48_ = anLocalInt;
                    for (int anLocalInt_49_ = -argument_3_; anLocalInt_49_ < 0; anLocalInt_49_++) {
                        int anLocalInt_50_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_51_ = -argument_2_; anLocalInt_51_ < 0; anLocalInt_51_++) {
                            int anLocalInt_52_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_50_]);
                            anLocalInt_46_ = ((anLocalInt_52_ & 0xff00ff) * anLocalInt_44_ & ~0xff00ff);
                            anLocalInt_47_ = ((anLocalInt_52_ & 0xff00) * anLocalInt_44_ & 0xff0000);
                            anLocalInts[anLocalInt_16_++] = (((anLocalInt_46_ | anLocalInt_47_) >>> 8) + argument_5_);
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_48_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_6_ == 1) {
                if (argument_4_ == 1) {
                    int anLocalInt_53_ = anLocalInt;
                    for (int anLocalInt_54_ = -argument_3_; anLocalInt_54_ < 0; anLocalInt_54_++) {
                        int anLocalInt_55_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_56_ = -argument_2_; anLocalInt_56_ < 0; anLocalInt_56_++) {
                            int anLocalInt_57_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_55_]);
                            if (anLocalInt_57_ != 0)
                                anLocalInts[anLocalInt_16_++] = anLocalInt_57_;
                            else
                                anLocalInt_16_++;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_53_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 0) {
                    int anLocalInt_58_ = anLocalInt;
                    if ((argument_5_ & 0xffffff) == 16777215) {
                        int anLocalInt_59_ = argument_5_ >>> 24;
                        int anLocalInt_60_ = 256 - anLocalInt_59_;
                        for (int anLocalInt_61_ = -argument_3_; anLocalInt_61_ < 0; anLocalInt_61_++) {
                            int anLocalInt_62_ = ((anLocalInt_8_ >> 16) * this.width);
                            for (int anLocalInt_63_ = -argument_2_; anLocalInt_63_ < 0; anLocalInt_63_++) {
                                int anLocalInt_64_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_62_]);
                                if (anLocalInt_64_ != 0) {
                                    int anLocalInt_65_ = anLocalInts[anLocalInt_16_];
                                    anLocalInts[anLocalInt_16_++] = (((((anLocalInt_64_ & 0xff00ff) * anLocalInt_59_) + ((anLocalInt_65_ & 0xff00ff) * anLocalInt_60_)) & ~0xff00ff) + ((((anLocalInt_64_ & 0xff00) * anLocalInt_59_) + ((anLocalInt_65_ & 0xff00) * anLocalInt_60_)) & 0xff0000)) >> 8;
                                } else
                                    anLocalInt_16_++;
                                anLocalInt += anLocalInt_12_;
                            }
                            anLocalInt_8_ += anLocalInt_13_;
                            anLocalInt = anLocalInt_58_;
                            anLocalInt_16_ += anLocalInt_17_;
                        }
                    } else {
                        int anLocalInt_66_ = (argument_5_ & 0xff0000) >> 16;
                        int anLocalInt_67_ = (argument_5_ & 0xff00) >> 8;
                        int anLocalInt_68_ = argument_5_ & 0xff;
                        int anLocalInt_69_ = argument_5_ >>> 24;
                        int anLocalInt_70_ = 256 - anLocalInt_69_;
                        for (int anLocalInt_71_ = -argument_3_; anLocalInt_71_ < 0; anLocalInt_71_++) {
                            int anLocalInt_72_ = ((anLocalInt_8_ >> 16) * this.width);
                            for (int anLocalInt_73_ = -argument_2_; anLocalInt_73_ < 0; anLocalInt_73_++) {
                                int anLocalInt_74_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_72_]);
                                if (anLocalInt_74_ != 0) {
                                    if (anLocalInt_69_ != 255) {
                                        int anLocalInt_75_ = (((anLocalInt_74_ & 0xff0000) * anLocalInt_66_) & ~0xffffff);
                                        int anLocalInt_76_ = (((anLocalInt_74_ & 0xff00) * anLocalInt_67_) & 0xff0000);
                                        int anLocalInt_77_ = (((anLocalInt_74_ & 0xff) * anLocalInt_68_) & 0xff00);
                                        anLocalInt_74_ = (anLocalInt_75_ | anLocalInt_76_ | anLocalInt_77_) >>> 8;
                                        int anLocalInt_78_ = anLocalInts[anLocalInt_16_];
                                        anLocalInts[anLocalInt_16_++] = (((((anLocalInt_74_ & 0xff00ff) * anLocalInt_69_) + ((anLocalInt_78_ & 0xff00ff) * anLocalInt_70_)) & ~0xff00ff) + ((((anLocalInt_74_ & 0xff00) * anLocalInt_69_) + ((anLocalInt_78_ & 0xff00) * anLocalInt_70_)) & 0xff0000)) >> 8;
                                    } else {
                                        int anLocalInt_79_ = (((anLocalInt_74_ & 0xff0000) * anLocalInt_66_) & ~0xffffff);
                                        int anLocalInt_80_ = (((anLocalInt_74_ & 0xff00) * anLocalInt_67_) & 0xff0000);
                                        int anLocalInt_81_ = (((anLocalInt_74_ & 0xff) * anLocalInt_68_) & 0xff00);
                                        anLocalInts[anLocalInt_16_++] = (anLocalInt_79_ | anLocalInt_80_ | anLocalInt_81_) >>> 8;
                                    }
                                } else
                                    anLocalInt_16_++;
                                anLocalInt += anLocalInt_12_;
                            }
                            anLocalInt_8_ += anLocalInt_13_;
                            anLocalInt = anLocalInt_58_;
                            anLocalInt_16_ += anLocalInt_17_;
                        }
                        return;
                    }
                    return;
                }
                if (argument_4_ == 3) {
                    int anLocalInt_82_ = anLocalInt;
                    int anLocalInt_83_ = argument_5_ >>> 24;
                    int anLocalInt_84_ = 256 - anLocalInt_83_;
                    for (int anLocalInt_85_ = -argument_3_; anLocalInt_85_ < 0; anLocalInt_85_++) {
                        int anLocalInt_86_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_87_ = -argument_2_; anLocalInt_87_ < 0; anLocalInt_87_++) {
                            int anLocalInt_88_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_86_]);
                            int anLocalInt_89_ = anLocalInt_88_ + argument_5_;
                            int anLocalInt_90_ = ((anLocalInt_88_ & 0xff00ff) + (argument_5_ & 0xff00ff));
                            int anLocalInt_91_ = ((anLocalInt_90_ & 0x1000100) + (anLocalInt_89_ - anLocalInt_90_ & 0x10000));
                            anLocalInt_91_ = (anLocalInt_89_ - anLocalInt_91_ | anLocalInt_91_ - (anLocalInt_91_ >>> 8));
                            if (anLocalInt_88_ == 0 && anLocalInt_83_ != 255) {
                                anLocalInt_88_ = anLocalInt_91_;
                                anLocalInt_91_ = anLocalInts[anLocalInt_16_];
                                anLocalInt_91_ = (((((anLocalInt_88_ & 0xff00ff) * anLocalInt_83_) + ((anLocalInt_91_ & 0xff00ff) * anLocalInt_84_)) & ~0xff00ff) + ((((anLocalInt_88_ & 0xff00) * anLocalInt_83_) + ((anLocalInt_91_ & 0xff00) * anLocalInt_84_)) & 0xff0000)) >> 8;
                            }
                            anLocalInts[anLocalInt_16_++] = anLocalInt_91_;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_82_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 2) {
                    int anLocalInt_92_ = argument_5_ >>> 24;
                    int anLocalInt_93_ = 256 - anLocalInt_92_;
                    int anLocalInt_94_ = ((argument_5_ & 0xff00ff) * anLocalInt_93_ & ~0xff00ff);
                    int anLocalInt_95_ = (argument_5_ & 0xff00) * anLocalInt_93_ & 0xff0000;
                    argument_5_ = (anLocalInt_94_ | anLocalInt_95_) >>> 8;
                    int anLocalInt_96_ = anLocalInt;
                    for (int anLocalInt_97_ = -argument_3_; anLocalInt_97_ < 0; anLocalInt_97_++) {
                        int anLocalInt_98_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_99_ = -argument_2_; anLocalInt_99_ < 0; anLocalInt_99_++) {
                            int anLocalInt_100_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_98_]);
                            if (anLocalInt_100_ != 0) {
                                anLocalInt_94_ = ((anLocalInt_100_ & 0xff00ff) * anLocalInt_92_) & ~0xff00ff;
                                anLocalInt_95_ = ((anLocalInt_100_ & 0xff00) * anLocalInt_92_) & 0xff0000;
                                anLocalInts[anLocalInt_16_++] = ((anLocalInt_94_ | anLocalInt_95_) >>> 8) + argument_5_;
                            } else
                                anLocalInt_16_++;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_96_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_6_ == 2) {
                if (argument_4_ == 1) {
                    int anLocalInt_101_ = anLocalInt;
                    for (int anLocalInt_102_ = -argument_3_; anLocalInt_102_ < 0; anLocalInt_102_++) {
                        int anLocalInt_103_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_104_ = -argument_2_; anLocalInt_104_ < 0; anLocalInt_104_++) {
                            int anLocalInt_105_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_103_]);
                            if (anLocalInt_105_ != 0) {
                                int anLocalInt_106_ = anLocalInts[anLocalInt_16_];
                                int anLocalInt_107_ = anLocalInt_105_ + anLocalInt_106_;
                                int anLocalInt_108_ = ((anLocalInt_105_ & 0xff00ff) + (anLocalInt_106_ & 0xff00ff));
                                anLocalInt_106_ = ((anLocalInt_108_ & 0x1000100) + (anLocalInt_107_ - anLocalInt_108_ & 0x10000));
                                anLocalInts[anLocalInt_16_++] = (anLocalInt_107_ - anLocalInt_106_ | anLocalInt_106_ - (anLocalInt_106_ >>> 8));
                            } else
                                anLocalInt_16_++;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_101_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 0) {
                    int anLocalInt_109_ = anLocalInt;
                    int anLocalInt_110_ = (argument_5_ & 0xff0000) >> 16;
                    int anLocalInt_111_ = (argument_5_ & 0xff00) >> 8;
                    int anLocalInt_112_ = argument_5_ & 0xff;
                    for (int anLocalInt_113_ = -argument_3_; anLocalInt_113_ < 0; anLocalInt_113_++) {
                        int anLocalInt_114_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_115_ = -argument_2_; anLocalInt_115_ < 0; anLocalInt_115_++) {
                            int anLocalInt_116_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_114_]);
                            if (anLocalInt_116_ != 0) {
                                int anLocalInt_117_ = (((anLocalInt_116_ & 0xff0000) * anLocalInt_110_) & ~0xffffff);
                                int anLocalInt_118_ = (((anLocalInt_116_ & 0xff00) * anLocalInt_111_) & 0xff0000);
                                int anLocalInt_119_ = (((anLocalInt_116_ & 0xff) * anLocalInt_112_) & 0xff00);
                                anLocalInt_116_ = (anLocalInt_117_ | anLocalInt_118_ | anLocalInt_119_) >>> 8;
                                int anLocalInt_120_ = anLocalInts[anLocalInt_16_];
                                int anLocalInt_121_ = anLocalInt_116_ + anLocalInt_120_;
                                int anLocalInt_122_ = ((anLocalInt_116_ & 0xff00ff) + (anLocalInt_120_ & 0xff00ff));
                                anLocalInt_120_ = ((anLocalInt_122_ & 0x1000100) + (anLocalInt_121_ - anLocalInt_122_ & 0x10000));
                                anLocalInts[anLocalInt_16_++] = (anLocalInt_121_ - anLocalInt_120_ | anLocalInt_120_ - (anLocalInt_120_ >>> 8));
                            } else
                                anLocalInt_16_++;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_109_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 3) {
                    int anLocalInt_123_ = anLocalInt;
                    for (int anLocalInt_124_ = -argument_3_; anLocalInt_124_ < 0; anLocalInt_124_++) {
                        int anLocalInt_125_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_126_ = -argument_2_; anLocalInt_126_ < 0; anLocalInt_126_++) {
                            int anLocalInt_127_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_125_]);
                            int anLocalInt_128_ = anLocalInt_127_ + argument_5_;
                            int anLocalInt_129_ = ((anLocalInt_127_ & 0xff00ff) + (argument_5_ & 0xff00ff));
                            int anLocalInt_130_ = ((anLocalInt_129_ & 0x1000100) + (anLocalInt_128_ - anLocalInt_129_ & 0x10000));
                            anLocalInt_127_ = (anLocalInt_128_ - anLocalInt_130_ | anLocalInt_130_ - (anLocalInt_130_ >>> 8));
                            anLocalInt_130_ = anLocalInts[anLocalInt_16_];
                            anLocalInt_128_ = anLocalInt_127_ + anLocalInt_130_;
                            anLocalInt_129_ = ((anLocalInt_127_ & 0xff00ff) + (anLocalInt_130_ & 0xff00ff));
                            anLocalInt_130_ = ((anLocalInt_129_ & 0x1000100) + (anLocalInt_128_ - anLocalInt_129_ & 0x10000));
                            anLocalInts[anLocalInt_16_++] = (anLocalInt_128_ - anLocalInt_130_ | anLocalInt_130_ - (anLocalInt_130_ >>> 8));
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_123_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                if (argument_4_ == 2) {
                    int anLocalInt_131_ = argument_5_ >>> 24;
                    int anLocalInt_132_ = 256 - anLocalInt_131_;
                    int anLocalInt_133_ = ((argument_5_ & 0xff00ff) * anLocalInt_132_ & ~0xff00ff);
                    int anLocalInt_134_ = (argument_5_ & 0xff00) * anLocalInt_132_ & 0xff0000;
                    argument_5_ = (anLocalInt_133_ | anLocalInt_134_) >>> 8;
                    int anLocalInt_135_ = anLocalInt;
                    for (int anLocalInt_136_ = -argument_3_; anLocalInt_136_ < 0; anLocalInt_136_++) {
                        int anLocalInt_137_ = ((anLocalInt_8_ >> 16) * this.width);
                        for (int anLocalInt_138_ = -argument_2_; anLocalInt_138_ < 0; anLocalInt_138_++) {
                            int anLocalInt_139_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_137_]);
                            if (anLocalInt_139_ != 0) {
                                anLocalInt_133_ = ((anLocalInt_139_ & 0xff00ff) * anLocalInt_131_) & ~0xff00ff;
                                anLocalInt_134_ = ((anLocalInt_139_ & 0xff00) * anLocalInt_131_) & 0xff0000;
                                anLocalInt_139_ = ((anLocalInt_133_ | anLocalInt_134_) >>> 8) + argument_5_;
                                int anLocalInt_140_ = anLocalInts[anLocalInt_16_];
                                int anLocalInt_141_ = anLocalInt_139_ + anLocalInt_140_;
                                int anLocalInt_142_ = ((anLocalInt_139_ & 0xff00ff) + (anLocalInt_140_ & 0xff00ff));
                                anLocalInt_140_ = ((anLocalInt_142_ & 0x1000100) + (anLocalInt_141_ - anLocalInt_142_ & 0x10000));
                                anLocalInts[anLocalInt_16_++] = (anLocalInt_141_ - anLocalInt_140_ | anLocalInt_140_ - (anLocalInt_140_ >>> 8));
                            } else
                                anLocalInt_16_++;
                            anLocalInt += anLocalInt_12_;
                        }
                        anLocalInt_8_ += anLocalInt_13_;
                        anLocalInt = anLocalInt_135_;
                        anLocalInt_16_ += anLocalInt_17_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method4003(int argument_143_, int argument_144_, int argument_145_) {
        throw new IllegalStateException("Can't capture alpha into a java_sprite_24");
    }

    final void method4013(int argument_146_, int argument_147_, int argument_148_, int argument_149_, int argument_150_, int argument_151_) {
        int[] anLocalInts = (this.toolkit.pixels);
        for (int anLocalInt = 0; anLocalInt < argument_149_; anLocalInt++) {
            int anLocalInt_152_ = (((argument_147_ + anLocalInt) * this.width) + argument_146_);
            int anLocalInt_153_ = (((argument_151_ + anLocalInt) * this.toolkit.width) + argument_150_);
            for (int anLocalInt_154_ = 0; anLocalInt_154_ < argument_148_; anLocalInt_154_++)
                this.pixels[(anLocalInt_152_ + anLocalInt_154_)] = anLocalInts[anLocalInt_153_ + anLocalInt_154_];
        }
    }

    java_sprite_24(JavaToolkit toolkit   , int w, int h) {
        super(toolkit, w, h);
        this.pixels = new int[w * h];
    }

    final void method4032(int argument_158_, int argument_159_, int argument_160_, int argument_161_, int argument_162_, int argument_163_, int argument_164_, int argument_165_, int argument_166_) {
        if (argument_161_ > 0 && argument_162_ > 0) {
            int anLocalInt = 0;
            int anLocalInt_167_ = 0;
            int anLocalInt_168_ = (this.anInt5698 + this.width + this.anInt5715);
            int anLocalInt_169_ = (this.anInt5719 + this.height + this.anInt5708);
            int anLocalInt_170_ = (anLocalInt_168_ << 16) / argument_161_;
            int anLocalInt_171_ = (anLocalInt_169_ << 16) / argument_162_;
            if (this.anInt5698 > 0) {
                int anLocalInt_172_ = (((this.anInt5698 << 16) + anLocalInt_170_ - 1) / anLocalInt_170_);
                argument_158_ += anLocalInt_172_;
                anLocalInt += (anLocalInt_172_ * anLocalInt_170_ - (this.anInt5698 << 16));
            }
            if (this.anInt5719 > 0) {
                int anLocalInt_173_ = (((this.anInt5719 << 16) + anLocalInt_171_ - 1) / anLocalInt_171_);
                argument_159_ += anLocalInt_173_;
                anLocalInt_167_ += (anLocalInt_173_ * anLocalInt_171_ - (this.anInt5719 << 16));
            }
            if (this.width < anLocalInt_168_)
                argument_161_ = ((this.width << 16) - anLocalInt + anLocalInt_170_ - 1) / anLocalInt_170_;
            if (this.height < anLocalInt_169_)
                argument_162_ = (((this.height << 16) - anLocalInt_167_ + anLocalInt_171_ - 1) / anLocalInt_171_);
            int anLocalInt_174_ = (argument_158_ + argument_159_ * (this.toolkit.width));
            int anLocalInt_175_ = (this.toolkit.width) - argument_161_;
            if (argument_159_ + argument_162_ > (this.toolkit.clipBottom))
                argument_162_ -= (argument_159_ + argument_162_ - this.toolkit.clipBottom);
            if (argument_159_ < (this.toolkit.clipTop)) {
                int anLocalInt_176_ = (this.toolkit.clipTop - argument_159_);
                argument_162_ -= anLocalInt_176_;
                anLocalInt_174_ += (anLocalInt_176_ * this.toolkit.width);
                anLocalInt_167_ += anLocalInt_171_ * anLocalInt_176_;
            }
            if (argument_158_ + argument_161_ > (this.toolkit.clipRight)) {
                int anLocalInt_177_ = (argument_158_ + argument_161_ - this.toolkit.clipRight);
                argument_161_ -= anLocalInt_177_;
                anLocalInt_175_ += anLocalInt_177_;
            }
            if (argument_158_ < (this.toolkit.clipLeft)) {
                int anLocalInt_178_ = (this.toolkit.clipLeft - argument_158_);
                argument_161_ -= anLocalInt_178_;
                anLocalInt_174_ += anLocalInt_178_;
                anLocalInt += anLocalInt_170_ * anLocalInt_178_;
                anLocalInt_175_ += anLocalInt_178_;
            }
            float[] fs = (this.toolkit.aFloatArray4667);
            int[] anLocalInts = (this.toolkit.pixels);
            if (argument_165_ == 0) {
                if (argument_163_ == 1) {
                    int anLocalInt_179_ = anLocalInt;
                    for (int anLocalInt_180_ = -argument_162_; anLocalInt_180_ < 0; anLocalInt_180_++) {
                        int anLocalInt_181_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_182_ = -argument_161_; anLocalInt_182_ < 0; anLocalInt_182_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                anLocalInts[anLocalInt_174_] = (this.pixels[(anLocalInt >> 16) + anLocalInt_181_]);
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_179_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 0) {
                    int anLocalInt_183_ = (argument_164_ & 0xff0000) >> 16;
                    int anLocalInt_184_ = (argument_164_ & 0xff00) >> 8;
                    int anLocalInt_185_ = argument_164_ & 0xff;
                    int anLocalInt_186_ = anLocalInt;
                    for (int anLocalInt_187_ = -argument_162_; anLocalInt_187_ < 0; anLocalInt_187_++) {
                        int anLocalInt_188_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_189_ = -argument_161_; anLocalInt_189_ < 0; anLocalInt_189_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_190_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_188_]);
                                int anLocalInt_191_ = (((anLocalInt_190_ & 0xff0000) * anLocalInt_183_) & ~0xffffff);
                                int anLocalInt_192_ = (((anLocalInt_190_ & 0xff00) * anLocalInt_184_) & 0xff0000);
                                int anLocalInt_193_ = (((anLocalInt_190_ & 0xff) * anLocalInt_185_) & 0xff00);
                                anLocalInts[anLocalInt_174_] = (anLocalInt_191_ | anLocalInt_192_ | anLocalInt_193_) >>> 8;
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_186_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 3) {
                    int anLocalInt_194_ = anLocalInt;
                    for (int anLocalInt_195_ = -argument_162_; anLocalInt_195_ < 0; anLocalInt_195_++) {
                        int anLocalInt_196_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_197_ = -argument_161_; anLocalInt_197_ < 0; anLocalInt_197_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_198_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_196_]);
                                int anLocalInt_199_ = anLocalInt_198_ + argument_164_;
                                int anLocalInt_200_ = ((anLocalInt_198_ & 0xff00ff) + (argument_164_ & 0xff00ff));
                                int anLocalInt_201_ = ((anLocalInt_200_ & 0x1000100) + (anLocalInt_199_ - anLocalInt_200_ & 0x10000));
                                anLocalInts[anLocalInt_174_] = (anLocalInt_199_ - anLocalInt_201_ | anLocalInt_201_ - (anLocalInt_201_ >>> 8));
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_194_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 2) {
                    int anLocalInt_202_ = argument_164_ >>> 24;
                    int anLocalInt_203_ = 256 - anLocalInt_202_;
                    int anLocalInt_204_ = ((argument_164_ & 0xff00ff) * anLocalInt_203_ & ~0xff00ff);
                    int anLocalInt_205_ = ((argument_164_ & 0xff00) * anLocalInt_203_ & 0xff0000);
                    argument_164_ = (anLocalInt_204_ | anLocalInt_205_) >>> 8;
                    int anLocalInt_206_ = anLocalInt;
                    for (int anLocalInt_207_ = -argument_162_; anLocalInt_207_ < 0; anLocalInt_207_++) {
                        int anLocalInt_208_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_209_ = -argument_161_; anLocalInt_209_ < 0; anLocalInt_209_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_210_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_208_]);
                                anLocalInt_204_ = ((anLocalInt_210_ & 0xff00ff) * anLocalInt_202_) & ~0xff00ff;
                                anLocalInt_205_ = ((anLocalInt_210_ & 0xff00) * anLocalInt_202_) & 0xff0000;
                                anLocalInts[anLocalInt_174_] = ((anLocalInt_204_ | anLocalInt_205_) >>> 8) + argument_164_;
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_206_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_165_ == 1) {
                if (argument_163_ == 1) {
                    int anLocalInt_211_ = anLocalInt;
                    for (int anLocalInt_212_ = -argument_162_; anLocalInt_212_ < 0; anLocalInt_212_++) {
                        int anLocalInt_213_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_214_ = -argument_161_; anLocalInt_214_ < 0; anLocalInt_214_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_215_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_213_]);
                                if (anLocalInt_215_ != 0) {
                                    anLocalInts[anLocalInt_174_] = anLocalInt_215_;
                                    fs[anLocalInt_174_] = (float) argument_160_;
                                }
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_211_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 0) {
                    int anLocalInt_216_ = anLocalInt;
                    if ((argument_164_ & 0xffffff) == 16777215) {
                        int anLocalInt_217_ = argument_164_ >>> 24;
                        int anLocalInt_218_ = 256 - anLocalInt_217_;
                        for (int anLocalInt_219_ = -argument_162_; anLocalInt_219_ < 0; anLocalInt_219_++) {
                            int anLocalInt_220_ = ((anLocalInt_167_ >> 16) * this.width);
                            for (int anLocalInt_221_ = -argument_161_; anLocalInt_221_ < 0; anLocalInt_221_++) {
                                if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                    int anLocalInt_222_ = (this.pixels[((anLocalInt >> 16) + anLocalInt_220_)]);
                                    if (anLocalInt_222_ != 0) {
                                        int anLocalInt_223_ = anLocalInts[anLocalInt_174_];
                                        anLocalInts[anLocalInt_174_] = (((((anLocalInt_222_ & 0xff00ff) * anLocalInt_217_) + ((anLocalInt_223_ & 0xff00ff) * anLocalInt_218_)) & ~0xff00ff) + ((((anLocalInt_222_ & 0xff00) * anLocalInt_217_) + ((anLocalInt_223_ & 0xff00) * anLocalInt_218_)) & 0xff0000)) >> 8;
                                        fs[anLocalInt_174_] = (float) argument_160_;
                                    }
                                }
                                anLocalInt += anLocalInt_170_;
                                anLocalInt_174_++;
                            }
                            anLocalInt_167_ += anLocalInt_171_;
                            anLocalInt = anLocalInt_216_;
                            anLocalInt_174_ += anLocalInt_175_;
                        }
                    } else {
                        int anLocalInt_224_ = (argument_164_ & 0xff0000) >> 16;
                        int anLocalInt_225_ = (argument_164_ & 0xff00) >> 8;
                        int anLocalInt_226_ = argument_164_ & 0xff;
                        int anLocalInt_227_ = argument_164_ >>> 24;
                        int anLocalInt_228_ = 256 - anLocalInt_227_;
                        for (int anLocalInt_229_ = -argument_162_; anLocalInt_229_ < 0; anLocalInt_229_++) {
                            int anLocalInt_230_ = ((anLocalInt_167_ >> 16) * this.width);
                            for (int anLocalInt_231_ = -argument_161_; anLocalInt_231_ < 0; anLocalInt_231_++) {
                                if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                    int anLocalInt_232_ = (this.pixels[((anLocalInt >> 16) + anLocalInt_230_)]);
                                    if (anLocalInt_232_ != 0) {
                                        if (anLocalInt_227_ != 255) {
                                            int anLocalInt_233_ = (((anLocalInt_232_ & 0xff0000) * anLocalInt_224_) & ~0xffffff);
                                            int anLocalInt_234_ = (((anLocalInt_232_ & 0xff00) * anLocalInt_225_) & 0xff0000);
                                            int anLocalInt_235_ = (((anLocalInt_232_ & 0xff) * anLocalInt_226_) & 0xff00);
                                            anLocalInt_232_ = (anLocalInt_233_ | anLocalInt_234_ | anLocalInt_235_) >>> 8;
                                            int anLocalInt_236_ = anLocalInts[anLocalInt_174_];
                                            anLocalInts[anLocalInt_174_] = (((((anLocalInt_232_ & 0xff00ff) * anLocalInt_227_) + ((anLocalInt_236_ & 0xff00ff) * anLocalInt_228_)) & ~0xff00ff) + ((((anLocalInt_232_ & 0xff00) * anLocalInt_227_) + ((anLocalInt_236_ & 0xff00) * anLocalInt_228_)) & 0xff0000)) >> 8;
                                            fs[anLocalInt_174_] = (float) argument_160_;
                                        } else {
                                            int anLocalInt_237_ = (((anLocalInt_232_ & 0xff0000) * anLocalInt_224_) & ~0xffffff);
                                            int anLocalInt_238_ = (((anLocalInt_232_ & 0xff00) * anLocalInt_225_) & 0xff0000);
                                            int anLocalInt_239_ = (((anLocalInt_232_ & 0xff) * anLocalInt_226_) & 0xff00);
                                            anLocalInts[anLocalInt_174_] = (anLocalInt_237_ | anLocalInt_238_ | anLocalInt_239_) >>> 8;
                                            fs[anLocalInt_174_] = (float) argument_160_;
                                        }
                                    }
                                }
                                anLocalInt += anLocalInt_170_;
                                anLocalInt_174_++;
                            }
                            anLocalInt_167_ += anLocalInt_171_;
                            anLocalInt = anLocalInt_216_;
                            anLocalInt_174_ += anLocalInt_175_;
                        }
                        return;
                    }
                    return;
                }
                if (argument_163_ == 3) {
                    int anLocalInt_240_ = anLocalInt;
                    int anLocalInt_241_ = argument_164_ >>> 24;
                    int anLocalInt_242_ = 256 - anLocalInt_241_;
                    for (int anLocalInt_243_ = -argument_162_; anLocalInt_243_ < 0; anLocalInt_243_++) {
                        int anLocalInt_244_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_245_ = -argument_161_; anLocalInt_245_ < 0; anLocalInt_245_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_246_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_244_]);
                                int anLocalInt_247_ = anLocalInt_246_ + argument_164_;
                                int anLocalInt_248_ = ((anLocalInt_246_ & 0xff00ff) + (argument_164_ & 0xff00ff));
                                int anLocalInt_249_ = ((anLocalInt_248_ & 0x1000100) + (anLocalInt_247_ - anLocalInt_248_ & 0x10000));
                                anLocalInt_249_ = (anLocalInt_247_ - anLocalInt_249_ | anLocalInt_249_ - (anLocalInt_249_ >>> 8));
                                if (anLocalInt_246_ == 0 && anLocalInt_241_ != 255) {
                                    anLocalInt_246_ = anLocalInt_249_;
                                    anLocalInt_249_ = anLocalInts[anLocalInt_174_];
                                    anLocalInt_249_ = (((((anLocalInt_246_ & 0xff00ff) * anLocalInt_241_) + ((anLocalInt_249_ & 0xff00ff) * anLocalInt_242_)) & ~0xff00ff) + ((((anLocalInt_246_ & 0xff00) * anLocalInt_241_) + ((anLocalInt_249_ & 0xff00) * anLocalInt_242_)) & 0xff0000)) >> 8;
                                }
                                anLocalInts[anLocalInt_174_] = anLocalInt_249_;
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_240_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 2) {
                    int anLocalInt_250_ = argument_164_ >>> 24;
                    int anLocalInt_251_ = 256 - anLocalInt_250_;
                    int anLocalInt_252_ = ((argument_164_ & 0xff00ff) * anLocalInt_251_ & ~0xff00ff);
                    int anLocalInt_253_ = ((argument_164_ & 0xff00) * anLocalInt_251_ & 0xff0000);
                    argument_164_ = (anLocalInt_252_ | anLocalInt_253_) >>> 8;
                    int anLocalInt_254_ = anLocalInt;
                    for (int anLocalInt_255_ = -argument_162_; anLocalInt_255_ < 0; anLocalInt_255_++) {
                        int anLocalInt_256_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_257_ = -argument_161_; anLocalInt_257_ < 0; anLocalInt_257_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_258_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_256_]);
                                if (anLocalInt_258_ != 0) {
                                    anLocalInt_252_ = ((anLocalInt_258_ & 0xff00ff) * anLocalInt_250_) & ~0xff00ff;
                                    anLocalInt_253_ = ((anLocalInt_258_ & 0xff00) * anLocalInt_250_) & 0xff0000;
                                    anLocalInts[anLocalInt_174_] = ((anLocalInt_252_ | anLocalInt_253_) >>> 8) + argument_164_;
                                    fs[anLocalInt_174_] = (float) argument_160_;
                                }
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_254_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_165_ == 2) {
                if (argument_163_ == 1) {
                    int anLocalInt_259_ = anLocalInt;
                    for (int anLocalInt_260_ = -argument_162_; anLocalInt_260_ < 0; anLocalInt_260_++) {
                        int anLocalInt_261_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_262_ = -argument_161_; anLocalInt_262_ < 0; anLocalInt_262_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_263_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_261_]);
                                if (anLocalInt_263_ != 0) {
                                    int anLocalInt_264_ = anLocalInts[anLocalInt_174_];
                                    int anLocalInt_265_ = anLocalInt_263_ + anLocalInt_264_;
                                    int anLocalInt_266_ = ((anLocalInt_263_ & 0xff00ff) + (anLocalInt_264_ & 0xff00ff));
                                    anLocalInt_264_ = ((anLocalInt_266_ & 0x1000100) + (anLocalInt_265_ - anLocalInt_266_ & 0x10000));
                                    anLocalInts[anLocalInt_174_] = (anLocalInt_265_ - anLocalInt_264_ | anLocalInt_264_ - (anLocalInt_264_ >>> 8));
                                    fs[anLocalInt_174_] = (float) argument_160_;
                                }
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_259_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 0) {
                    int anLocalInt_267_ = anLocalInt;
                    int anLocalInt_268_ = (argument_164_ & 0xff0000) >> 16;
                    int anLocalInt_269_ = (argument_164_ & 0xff00) >> 8;
                    int anLocalInt_270_ = argument_164_ & 0xff;
                    for (int anLocalInt_271_ = -argument_162_; anLocalInt_271_ < 0; anLocalInt_271_++) {
                        int anLocalInt_272_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_273_ = -argument_161_; anLocalInt_273_ < 0; anLocalInt_273_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_274_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_272_]);
                                if (anLocalInt_274_ != 0) {
                                    int anLocalInt_275_ = (((anLocalInt_274_ & 0xff0000) * anLocalInt_268_) & ~0xffffff);
                                    int anLocalInt_276_ = (((anLocalInt_274_ & 0xff00) * anLocalInt_269_) & 0xff0000);
                                    int anLocalInt_277_ = (((anLocalInt_274_ & 0xff) * anLocalInt_270_) & 0xff00);
                                    anLocalInt_274_ = (anLocalInt_275_ | anLocalInt_276_ | anLocalInt_277_) >>> 8;
                                    int anLocalInt_278_ = anLocalInts[anLocalInt_174_];
                                    int anLocalInt_279_ = anLocalInt_274_ + anLocalInt_278_;
                                    int anLocalInt_280_ = ((anLocalInt_274_ & 0xff00ff) + (anLocalInt_278_ & 0xff00ff));
                                    anLocalInt_278_ = ((anLocalInt_280_ & 0x1000100) + (anLocalInt_279_ - anLocalInt_280_ & 0x10000));
                                    anLocalInts[anLocalInt_174_] = (anLocalInt_279_ - anLocalInt_278_ | anLocalInt_278_ - (anLocalInt_278_ >>> 8));
                                    fs[anLocalInt_174_] = (float) argument_160_;
                                }
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_267_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 3) {
                    int anLocalInt_281_ = anLocalInt;
                    for (int anLocalInt_282_ = -argument_162_; anLocalInt_282_ < 0; anLocalInt_282_++) {
                        int anLocalInt_283_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_284_ = -argument_161_; anLocalInt_284_ < 0; anLocalInt_284_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_285_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_283_]);
                                int anLocalInt_286_ = anLocalInt_285_ + argument_164_;
                                int anLocalInt_287_ = ((anLocalInt_285_ & 0xff00ff) + (argument_164_ & 0xff00ff));
                                int anLocalInt_288_ = ((anLocalInt_287_ & 0x1000100) + (anLocalInt_286_ - anLocalInt_287_ & 0x10000));
                                anLocalInt_285_ = (anLocalInt_286_ - anLocalInt_288_ | anLocalInt_288_ - (anLocalInt_288_ >>> 8));
                                anLocalInt_288_ = anLocalInts[anLocalInt_174_];
                                anLocalInt_286_ = anLocalInt_285_ + anLocalInt_288_;
                                anLocalInt_287_ = ((anLocalInt_285_ & 0xff00ff) + (anLocalInt_288_ & 0xff00ff));
                                anLocalInt_288_ = ((anLocalInt_287_ & 0x1000100) + (anLocalInt_286_ - anLocalInt_287_ & 0x10000));
                                anLocalInts[anLocalInt_174_] = (anLocalInt_286_ - anLocalInt_288_ | anLocalInt_288_ - (anLocalInt_288_ >>> 8));
                                fs[anLocalInt_174_] = (float) argument_160_;
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_281_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                if (argument_163_ == 2) {
                    int anLocalInt_289_ = argument_164_ >>> 24;
                    int anLocalInt_290_ = 256 - anLocalInt_289_;
                    int anLocalInt_291_ = ((argument_164_ & 0xff00ff) * anLocalInt_290_ & ~0xff00ff);
                    int anLocalInt_292_ = ((argument_164_ & 0xff00) * anLocalInt_290_ & 0xff0000);
                    argument_164_ = (anLocalInt_291_ | anLocalInt_292_) >>> 8;
                    int anLocalInt_293_ = anLocalInt;
                    for (int anLocalInt_294_ = -argument_162_; anLocalInt_294_ < 0; anLocalInt_294_++) {
                        int anLocalInt_295_ = ((anLocalInt_167_ >> 16) * this.width);
                        for (int anLocalInt_296_ = -argument_161_; anLocalInt_296_ < 0; anLocalInt_296_++) {
                            if ((float) argument_160_ < fs[anLocalInt_174_]) {
                                int anLocalInt_297_ = (this.pixels[(anLocalInt >> 16) + anLocalInt_295_]);
                                if (anLocalInt_297_ != 0) {
                                    anLocalInt_291_ = ((anLocalInt_297_ & 0xff00ff) * anLocalInt_289_) & ~0xff00ff;
                                    anLocalInt_292_ = ((anLocalInt_297_ & 0xff00) * anLocalInt_289_) & 0xff0000;
                                    anLocalInt_297_ = ((anLocalInt_291_ | anLocalInt_292_) >>> 8) + argument_164_;
                                    int anLocalInt_298_ = anLocalInts[anLocalInt_174_];
                                    int anLocalInt_299_ = anLocalInt_297_ + anLocalInt_298_;
                                    int anLocalInt_300_ = ((anLocalInt_297_ & 0xff00ff) + (anLocalInt_298_ & 0xff00ff));
                                    anLocalInt_298_ = ((anLocalInt_300_ & 0x1000100) + (anLocalInt_299_ - anLocalInt_300_ & 0x10000));
                                    anLocalInts[anLocalInt_174_] = (anLocalInt_299_ - anLocalInt_298_ | anLocalInt_298_ - (anLocalInt_298_ >>> 8));
                                    fs[anLocalInt_174_] = (float) argument_160_;
                                }
                            }
                            anLocalInt += anLocalInt_170_;
                            anLocalInt_174_++;
                        }
                        anLocalInt_167_ += anLocalInt_171_;
                        anLocalInt = anLocalInt_293_;
                        anLocalInt_174_ += anLocalInt_175_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    java_sprite_24(JavaToolkit argument_301_, int[] pixels, int argument_303_, int argument_304_, int w, int h, boolean createNew) {
        super(argument_301_, w, h);
        if (createNew)
            this.pixels = new int[w * h];
        else
            this.pixels = pixels;
        argument_304_ -= this.width;
        int anLocalInt = 0;
        for (int anLocalInt_308_ = 0; anLocalInt_308_ < h; anLocalInt_308_++) {
            for (int anLocalInt_309_ = 0; anLocalInt_309_ < w; anLocalInt_309_++) {
                int anLocalInt_310_ = pixels[argument_303_++];
                if (anLocalInt_310_ >>> 24 == 255)
                    this.pixels[anLocalInt++] = ((anLocalInt_310_ & 0xffffff) == 0 ? -16777215 : anLocalInt_310_);
                else
                    this.pixels[anLocalInt++] = 0;
            }
            argument_303_ += argument_304_;
        }
    }

    java_sprite_24(JavaToolkit argument_311_, int[] argument_312_, int argument_313_, int argument_314_) {
        super(argument_311_, argument_313_, argument_314_);
        this.pixels = argument_312_;
    }

    final void method4004(int argument_315_, int argument_316_, int argument_317_, int argument_318_, int argument_319_) {
        if (this.toolkit.method2100())
            throw new IllegalStateException();
        int anLocalInt = (this.toolkit.width);
        argument_315_ += this.anInt5698;
        argument_316_ += this.anInt5719;
        int anLocalInt_320_ = argument_316_ * anLocalInt + argument_315_;
        int anLocalInt_321_ = 0;
        int anLocalInt_322_ = this.height;
        int anLocalInt_323_ = this.width;
        int anLocalInt_324_ = anLocalInt - anLocalInt_323_;
        int anLocalInt_325_ = 0;
        if (argument_316_ < (this.toolkit.clipTop)) {
            int anLocalInt_326_ = (this.toolkit.clipTop) - argument_316_;
            anLocalInt_322_ -= anLocalInt_326_;
            argument_316_ = (this.toolkit.clipTop);
            anLocalInt_321_ += anLocalInt_326_ * anLocalInt_323_;
            anLocalInt_320_ += anLocalInt_326_ * anLocalInt;
        }
        if (argument_316_ + anLocalInt_322_ > (this.toolkit.clipBottom))
            anLocalInt_322_ -= (argument_316_ + anLocalInt_322_ - this.toolkit.clipBottom);
        if (argument_315_ < (this.toolkit.clipLeft)) {
            int anLocalInt_327_ = (this.toolkit.clipLeft) - argument_315_;
            anLocalInt_323_ -= anLocalInt_327_;
            argument_315_ = (this.toolkit.clipLeft);
            anLocalInt_321_ += anLocalInt_327_;
            anLocalInt_320_ += anLocalInt_327_;
            anLocalInt_325_ += anLocalInt_327_;
            anLocalInt_324_ += anLocalInt_327_;
        }
        if (argument_315_ + anLocalInt_323_ > (this.toolkit.clipRight)) {
            int anLocalInt_328_ = (argument_315_ + anLocalInt_323_ - this.toolkit.clipRight);
            anLocalInt_323_ -= anLocalInt_328_;
            anLocalInt_325_ += anLocalInt_328_;
            anLocalInt_324_ += anLocalInt_328_;
        }
        if (anLocalInt_323_ > 0 && anLocalInt_322_ > 0) {
            int[] anLocalInts = (this.toolkit.pixels);
            if (argument_319_ == 0) {
                if (argument_317_ == 1) {
                    for (int anLocalInt_329_ = -anLocalInt_322_; anLocalInt_329_ < 0; anLocalInt_329_++) {
                        int anLocalInt_330_ = anLocalInt_320_ + anLocalInt_323_ - 3;
                        while (anLocalInt_320_ < anLocalInt_330_) {
                            anLocalInts[anLocalInt_320_++] = (this.pixels[anLocalInt_321_++]);
                            anLocalInts[anLocalInt_320_++] = (this.pixels[anLocalInt_321_++]);
                            anLocalInts[anLocalInt_320_++] = (this.pixels[anLocalInt_321_++]);
                            anLocalInts[anLocalInt_320_++] = (this.pixels[anLocalInt_321_++]);
                        }
                        anLocalInt_330_ += 3;
                        while (anLocalInt_320_ < anLocalInt_330_)
                            anLocalInts[anLocalInt_320_++] = (this.pixels[anLocalInt_321_++]);
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 0) {
                    int anLocalInt_331_ = (argument_318_ & 0xff0000) >> 16;
                    int anLocalInt_332_ = (argument_318_ & 0xff00) >> 8;
                    int anLocalInt_333_ = argument_318_ & 0xff;
                    for (int anLocalInt_334_ = -anLocalInt_322_; anLocalInt_334_ < 0; anLocalInt_334_++) {
                        for (int anLocalInt_335_ = -anLocalInt_323_; anLocalInt_335_ < 0; anLocalInt_335_++) {
                            int anLocalInt_336_ = (this.pixels[anLocalInt_321_++]);
                            int anLocalInt_337_ = (((anLocalInt_336_ & 0xff0000) * anLocalInt_331_) & ~0xffffff);
                            int anLocalInt_338_ = ((anLocalInt_336_ & 0xff00) * anLocalInt_332_ & 0xff0000);
                            int anLocalInt_339_ = ((anLocalInt_336_ & 0xff) * anLocalInt_333_ & 0xff00);
                            anLocalInts[anLocalInt_320_++] = (anLocalInt_337_ | anLocalInt_338_ | anLocalInt_339_) >>> 8;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 3) {
                    for (int anLocalInt_340_ = -anLocalInt_322_; anLocalInt_340_ < 0; anLocalInt_340_++) {
                        for (int anLocalInt_341_ = -anLocalInt_323_; anLocalInt_341_ < 0; anLocalInt_341_++) {
                            int anLocalInt_342_ = (this.pixels[anLocalInt_321_++]);
                            int anLocalInt_343_ = anLocalInt_342_ + argument_318_;
                            int anLocalInt_344_ = ((anLocalInt_342_ & 0xff00ff) + (argument_318_ & 0xff00ff));
                            int anLocalInt_345_ = ((anLocalInt_344_ & 0x1000100) + (anLocalInt_343_ - anLocalInt_344_ & 0x10000));
                            anLocalInts[anLocalInt_320_++] = (anLocalInt_343_ - anLocalInt_345_ | anLocalInt_345_ - (anLocalInt_345_ >>> 8));
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 2) {
                    int anLocalInt_346_ = argument_318_ >>> 24;
                    int anLocalInt_347_ = 256 - anLocalInt_346_;
                    int anLocalInt_348_ = ((argument_318_ & 0xff00ff) * anLocalInt_347_ & ~0xff00ff);
                    int anLocalInt_349_ = ((argument_318_ & 0xff00) * anLocalInt_347_ & 0xff0000);
                    argument_318_ = (anLocalInt_348_ | anLocalInt_349_) >>> 8;
                    for (int anLocalInt_350_ = -anLocalInt_322_; anLocalInt_350_ < 0; anLocalInt_350_++) {
                        for (int anLocalInt_351_ = -anLocalInt_323_; anLocalInt_351_ < 0; anLocalInt_351_++) {
                            int anLocalInt_352_ = (this.pixels[anLocalInt_321_++]);
                            anLocalInt_348_ = ((anLocalInt_352_ & 0xff00ff) * anLocalInt_346_) & ~0xff00ff;
                            anLocalInt_349_ = ((anLocalInt_352_ & 0xff00) * anLocalInt_346_ & 0xff0000);
                            anLocalInts[anLocalInt_320_++] = (((anLocalInt_348_ | anLocalInt_349_) >>> 8) + argument_318_);
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_319_ == 1) {
                if (argument_317_ == 1) {
                    for (int anLocalInt_353_ = -anLocalInt_322_; anLocalInt_353_ < 0; anLocalInt_353_++) {
                        int anLocalInt_354_ = anLocalInt_320_ + anLocalInt_323_ - 3;
                        while (anLocalInt_320_ < anLocalInt_354_) {
                            int anLocalInt_355_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_355_ != 0)
                                anLocalInts[anLocalInt_320_++] = anLocalInt_355_;
                            else
                                anLocalInt_320_++;
                            anLocalInt_355_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_355_ != 0)
                                anLocalInts[anLocalInt_320_++] = anLocalInt_355_;
                            else
                                anLocalInt_320_++;
                            anLocalInt_355_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_355_ != 0)
                                anLocalInts[anLocalInt_320_++] = anLocalInt_355_;
                            else
                                anLocalInt_320_++;
                            anLocalInt_355_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_355_ != 0)
                                anLocalInts[anLocalInt_320_++] = anLocalInt_355_;
                            else
                                anLocalInt_320_++;
                        }
                        anLocalInt_354_ += 3;
                        while (anLocalInt_320_ < anLocalInt_354_) {
                            int anLocalInt_356_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_356_ != 0)
                                anLocalInts[anLocalInt_320_++] = anLocalInt_356_;
                            else
                                anLocalInt_320_++;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 0) {
                    if ((argument_318_ & 0xffffff) == 16777215) {
                        int anLocalInt_357_ = argument_318_ >>> 24;
                        int anLocalInt_358_ = 256 - anLocalInt_357_;
                        for (int anLocalInt_359_ = -anLocalInt_322_; anLocalInt_359_ < 0; anLocalInt_359_++) {
                            for (int anLocalInt_360_ = -anLocalInt_323_; anLocalInt_360_ < 0; anLocalInt_360_++) {
                                int anLocalInt_361_ = (this.pixels[anLocalInt_321_++]);
                                if (anLocalInt_361_ != 0) {
                                    int anLocalInt_362_ = anLocalInts[anLocalInt_320_];
                                    anLocalInts[anLocalInt_320_++] = (((((anLocalInt_361_ & 0xff00ff) * anLocalInt_357_) + ((anLocalInt_362_ & 0xff00ff) * anLocalInt_358_)) & ~0xff00ff) + ((((anLocalInt_361_ & 0xff00) * anLocalInt_357_) + ((anLocalInt_362_ & 0xff00) * anLocalInt_358_)) & 0xff0000)) >> 8;
                                } else
                                    anLocalInt_320_++;
                            }
                            anLocalInt_320_ += anLocalInt_324_;
                            anLocalInt_321_ += anLocalInt_325_;
                        }
                    } else {
                        int anLocalInt_363_ = (argument_318_ & 0xff0000) >> 16;
                        int anLocalInt_364_ = (argument_318_ & 0xff00) >> 8;
                        int anLocalInt_365_ = argument_318_ & 0xff;
                        int anLocalInt_366_ = argument_318_ >>> 24;
                        int anLocalInt_367_ = 256 - anLocalInt_366_;
                        for (int anLocalInt_368_ = -anLocalInt_322_; anLocalInt_368_ < 0; anLocalInt_368_++) {
                            for (int anLocalInt_369_ = -anLocalInt_323_; anLocalInt_369_ < 0; anLocalInt_369_++) {
                                int anLocalInt_370_ = (this.pixels[anLocalInt_321_++]);
                                if (anLocalInt_370_ != 0) {
                                    if (anLocalInt_366_ != 255) {
                                        int anLocalInt_371_ = (((anLocalInt_370_ & 0xff0000) * anLocalInt_363_) & ~0xffffff);
                                        int anLocalInt_372_ = (((anLocalInt_370_ & 0xff00) * anLocalInt_364_) & 0xff0000);
                                        int anLocalInt_373_ = (((anLocalInt_370_ & 0xff) * anLocalInt_365_) & 0xff00);
                                        anLocalInt_370_ = (anLocalInt_371_ | anLocalInt_372_ | anLocalInt_373_) >>> 8;
                                        int anLocalInt_374_ = anLocalInts[anLocalInt_320_];
                                        anLocalInts[anLocalInt_320_++] = (((((anLocalInt_370_ & 0xff00ff) * anLocalInt_366_) + ((anLocalInt_374_ & 0xff00ff) * anLocalInt_367_)) & ~0xff00ff) + ((((anLocalInt_370_ & 0xff00) * anLocalInt_366_) + ((anLocalInt_374_ & 0xff00) * anLocalInt_367_)) & 0xff0000)) >> 8;
                                    } else {
                                        int anLocalInt_375_ = (((anLocalInt_370_ & 0xff0000) * anLocalInt_363_) & ~0xffffff);
                                        int anLocalInt_376_ = (((anLocalInt_370_ & 0xff00) * anLocalInt_364_) & 0xff0000);
                                        int anLocalInt_377_ = (((anLocalInt_370_ & 0xff) * anLocalInt_365_) & 0xff00);
                                        anLocalInts[anLocalInt_320_++] = (anLocalInt_375_ | anLocalInt_376_ | anLocalInt_377_) >>> 8;
                                    }
                                } else
                                    anLocalInt_320_++;
                            }
                            anLocalInt_320_ += anLocalInt_324_;
                            anLocalInt_321_ += anLocalInt_325_;
                        }
                        return;
                    }
                    return;
                }
                if (argument_317_ == 3) {
                    int anLocalInt_378_ = argument_318_ >>> 24;
                    int anLocalInt_379_ = 256 - anLocalInt_378_;
                    for (int anLocalInt_380_ = -anLocalInt_322_; anLocalInt_380_ < 0; anLocalInt_380_++) {
                        for (int anLocalInt_381_ = -anLocalInt_323_; anLocalInt_381_ < 0; anLocalInt_381_++) {
                            int anLocalInt_382_ = (this.pixels[anLocalInt_321_++]);
                            int anLocalInt_383_ = anLocalInt_382_ + argument_318_;
                            int anLocalInt_384_ = ((anLocalInt_382_ & 0xff00ff) + (argument_318_ & 0xff00ff));
                            int anLocalInt_385_ = ((anLocalInt_384_ & 0x1000100) + (anLocalInt_383_ - anLocalInt_384_ & 0x10000));
                            anLocalInt_385_ = (anLocalInt_383_ - anLocalInt_385_ | anLocalInt_385_ - (anLocalInt_385_ >>> 8));
                            if (anLocalInt_382_ == 0 && anLocalInt_378_ != 255) {
                                anLocalInt_382_ = anLocalInt_385_;
                                anLocalInt_385_ = anLocalInts[anLocalInt_320_];
                                anLocalInt_385_ = (((((anLocalInt_382_ & 0xff00ff) * anLocalInt_378_) + ((anLocalInt_385_ & 0xff00ff) * anLocalInt_379_)) & ~0xff00ff) + ((((anLocalInt_382_ & 0xff00) * anLocalInt_378_) + ((anLocalInt_385_ & 0xff00) * anLocalInt_379_)) & 0xff0000)) >> 8;
                            }
                            anLocalInts[anLocalInt_320_++] = anLocalInt_385_;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 2) {
                    int anLocalInt_386_ = argument_318_ >>> 24;
                    int anLocalInt_387_ = 256 - anLocalInt_386_;
                    int anLocalInt_388_ = ((argument_318_ & 0xff00ff) * anLocalInt_387_ & ~0xff00ff);
                    int anLocalInt_389_ = ((argument_318_ & 0xff00) * anLocalInt_387_ & 0xff0000);
                    argument_318_ = (anLocalInt_388_ | anLocalInt_389_) >>> 8;
                    for (int anLocalInt_390_ = -anLocalInt_322_; anLocalInt_390_ < 0; anLocalInt_390_++) {
                        for (int anLocalInt_391_ = -anLocalInt_323_; anLocalInt_391_ < 0; anLocalInt_391_++) {
                            int anLocalInt_392_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_392_ != 0) {
                                anLocalInt_388_ = ((anLocalInt_392_ & 0xff00ff) * anLocalInt_386_) & ~0xff00ff;
                                anLocalInt_389_ = ((anLocalInt_392_ & 0xff00) * anLocalInt_386_) & 0xff0000;
                                anLocalInts[anLocalInt_320_++] = ((anLocalInt_388_ | anLocalInt_389_) >>> 8) + argument_318_;
                            } else
                                anLocalInt_320_++;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            if (argument_319_ == 2) {
                if (argument_317_ == 1) {
                    for (int anLocalInt_393_ = -anLocalInt_322_; anLocalInt_393_ < 0; anLocalInt_393_++) {
                        for (int anLocalInt_394_ = -anLocalInt_323_; anLocalInt_394_ < 0; anLocalInt_394_++) {
                            int anLocalInt_395_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_395_ != 0) {
                                int anLocalInt_396_ = anLocalInts[anLocalInt_320_];
                                int anLocalInt_397_ = anLocalInt_395_ + anLocalInt_396_;
                                int anLocalInt_398_ = ((anLocalInt_395_ & 0xff00ff) + (anLocalInt_396_ & 0xff00ff));
                                anLocalInt_396_ = ((anLocalInt_398_ & 0x1000100) + (anLocalInt_397_ - anLocalInt_398_ & 0x10000));
                                anLocalInts[anLocalInt_320_++] = (anLocalInt_397_ - anLocalInt_396_ | anLocalInt_396_ - (anLocalInt_396_ >>> 8));
                            } else
                                anLocalInt_320_++;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 0) {
                    int anLocalInt_399_ = (argument_318_ & 0xff0000) >> 16;
                    int anLocalInt_400_ = (argument_318_ & 0xff00) >> 8;
                    int anLocalInt_401_ = argument_318_ & 0xff;
                    for (int anLocalInt_402_ = -anLocalInt_322_; anLocalInt_402_ < 0; anLocalInt_402_++) {
                        for (int anLocalInt_403_ = -anLocalInt_323_; anLocalInt_403_ < 0; anLocalInt_403_++) {
                            int anLocalInt_404_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_404_ != 0) {
                                int anLocalInt_405_ = (((anLocalInt_404_ & 0xff0000) * anLocalInt_399_) & ~0xffffff);
                                int anLocalInt_406_ = (((anLocalInt_404_ & 0xff00) * anLocalInt_400_) & 0xff0000);
                                int anLocalInt_407_ = (((anLocalInt_404_ & 0xff) * anLocalInt_401_) & 0xff00);
                                anLocalInt_404_ = (anLocalInt_405_ | anLocalInt_406_ | anLocalInt_407_) >>> 8;
                                int anLocalInt_408_ = anLocalInts[anLocalInt_320_];
                                int anLocalInt_409_ = anLocalInt_404_ + anLocalInt_408_;
                                int anLocalInt_410_ = ((anLocalInt_404_ & 0xff00ff) + (anLocalInt_408_ & 0xff00ff));
                                anLocalInt_408_ = ((anLocalInt_410_ & 0x1000100) + (anLocalInt_409_ - anLocalInt_410_ & 0x10000));
                                anLocalInts[anLocalInt_320_++] = (anLocalInt_409_ - anLocalInt_408_ | anLocalInt_408_ - (anLocalInt_408_ >>> 8));
                            } else
                                anLocalInt_320_++;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 3) {
                    for (int anLocalInt_411_ = -anLocalInt_322_; anLocalInt_411_ < 0; anLocalInt_411_++) {
                        for (int anLocalInt_412_ = -anLocalInt_323_; anLocalInt_412_ < 0; anLocalInt_412_++) {
                            int anLocalInt_413_ = (this.pixels[anLocalInt_321_++]);
                            int anLocalInt_414_ = anLocalInt_413_ + argument_318_;
                            int anLocalInt_415_ = ((anLocalInt_413_ & 0xff00ff) + (argument_318_ & 0xff00ff));
                            int anLocalInt_416_ = ((anLocalInt_415_ & 0x1000100) + (anLocalInt_414_ - anLocalInt_415_ & 0x10000));
                            anLocalInt_413_ = (anLocalInt_414_ - anLocalInt_416_ | anLocalInt_416_ - (anLocalInt_416_ >>> 8));
                            anLocalInt_416_ = anLocalInts[anLocalInt_320_];
                            anLocalInt_414_ = anLocalInt_413_ + anLocalInt_416_;
                            anLocalInt_415_ = ((anLocalInt_413_ & 0xff00ff) + (anLocalInt_416_ & 0xff00ff));
                            anLocalInt_416_ = ((anLocalInt_415_ & 0x1000100) + (anLocalInt_414_ - anLocalInt_415_ & 0x10000));
                            anLocalInts[anLocalInt_320_++] = (anLocalInt_414_ - anLocalInt_416_ | anLocalInt_416_ - (anLocalInt_416_ >>> 8));
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                if (argument_317_ == 2) {
                    int anLocalInt_417_ = argument_318_ >>> 24;
                    int anLocalInt_418_ = 256 - anLocalInt_417_;
                    int anLocalInt_419_ = ((argument_318_ & 0xff00ff) * anLocalInt_418_ & ~0xff00ff);
                    int anLocalInt_420_ = ((argument_318_ & 0xff00) * anLocalInt_418_ & 0xff0000);
                    argument_318_ = (anLocalInt_419_ | anLocalInt_420_) >>> 8;
                    for (int anLocalInt_421_ = -anLocalInt_322_; anLocalInt_421_ < 0; anLocalInt_421_++) {
                        for (int anLocalInt_422_ = -anLocalInt_323_; anLocalInt_422_ < 0; anLocalInt_422_++) {
                            int anLocalInt_423_ = (this.pixels[anLocalInt_321_++]);
                            if (anLocalInt_423_ != 0) {
                                anLocalInt_419_ = ((anLocalInt_423_ & 0xff00ff) * anLocalInt_417_) & ~0xff00ff;
                                anLocalInt_420_ = ((anLocalInt_423_ & 0xff00) * anLocalInt_417_) & 0xff0000;
                                anLocalInt_423_ = ((anLocalInt_419_ | anLocalInt_420_) >>> 8) + argument_318_;
                                int anLocalInt_424_ = anLocalInts[anLocalInt_320_];
                                int anLocalInt_425_ = anLocalInt_423_ + anLocalInt_424_;
                                int anLocalInt_426_ = ((anLocalInt_423_ & 0xff00ff) + (anLocalInt_424_ & 0xff00ff));
                                anLocalInt_424_ = ((anLocalInt_426_ & 0x1000100) + (anLocalInt_425_ - anLocalInt_426_ & 0x10000));
                                anLocalInts[anLocalInt_320_++] = (anLocalInt_425_ - anLocalInt_424_ | anLocalInt_424_ - (anLocalInt_424_ >>> 8));
                            } else
                                anLocalInt_320_++;
                        }
                        anLocalInt_320_ += anLocalInt_324_;
                        anLocalInt_321_ += anLocalInt_325_;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    final void method4030(int[] argument_427_, int[] argument_428_, int argument_429_, int argument_430_) {
        int[] anLocalInts = (this.toolkit.pixels);
        if (Class368_Sub2.anInt5717 == 0) {
            if (Class368_Sub2.anInt5712 == 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_431_ = anLocalInt + argument_430_;
                    if (anLocalInt_431_ >= 0) {
                        if (anLocalInt_431_ >= argument_427_.length)
                            break;
                        int anLocalInt_432_ = Class368_Sub2.anInt5724;
                        int anLocalInt_433_ = Class368_Sub2.anInt5710;
                        int anLocalInt_434_ = Class368_Sub2.anInt5704;
                        int anLocalInt_435_ = Class368_Sub2.anInt5713;
                        if (anLocalInt_433_ >= 0 && anLocalInt_434_ >= 0 && (anLocalInt_433_ - (this.width << 12)) < 0 && ((anLocalInt_434_ - (this.height << 12)) < 0)) {
                            int anLocalInt_436_ = (argument_427_[anLocalInt_431_] - argument_429_);
                            int anLocalInt_437_ = -argument_428_[anLocalInt_431_];
                            int anLocalInt_438_ = (anLocalInt_436_ - (anLocalInt_432_ - Class368_Sub2.anInt5724));
                            if (anLocalInt_438_ > 0) {
                                anLocalInt_432_ += anLocalInt_438_;
                                anLocalInt_435_ += anLocalInt_438_;
                                anLocalInt_433_ += (Class368_Sub2.anInt5717 * anLocalInt_438_);
                                anLocalInt_434_ += (Class368_Sub2.anInt5712 * anLocalInt_438_);
                            } else
                                anLocalInt_437_ -= anLocalInt_438_;
                            if (anLocalInt_435_ < anLocalInt_437_)
                                anLocalInt_435_ = anLocalInt_437_;
                            for (/**/; anLocalInt_435_ < 0; anLocalInt_435_++) {
                                int anLocalInt_439_ = (this.pixels[(((anLocalInt_434_ >> 12) * this.width) + (anLocalInt_433_ >> 12))]);
                                if (anLocalInt_439_ != 0)
                                    anLocalInts[anLocalInt_432_++] = anLocalInt_439_;
                                else
                                    anLocalInt_432_++;
                            }
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else if (Class368_Sub2.anInt5712 < 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_440_ = anLocalInt + argument_430_;
                    if (anLocalInt_440_ >= 0) {
                        if (anLocalInt_440_ >= argument_427_.length)
                            break;
                        int anLocalInt_441_ = Class368_Sub2.anInt5724;
                        int anLocalInt_442_ = Class368_Sub2.anInt5710;
                        int anLocalInt_443_ = (Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725);
                        int anLocalInt_444_ = Class368_Sub2.anInt5713;
                        if (anLocalInt_442_ >= 0 && ((anLocalInt_442_ - (this.width << 12)) < 0)) {
                            int anLocalInt_445_;
                            if ((anLocalInt_445_ = (anLocalInt_443_ - (this.height << 12))) >= 0) {
                                anLocalInt_445_ = ((Class368_Sub2.anInt5712 - anLocalInt_445_) / Class368_Sub2.anInt5712);
                                anLocalInt_444_ += anLocalInt_445_;
                                anLocalInt_443_ += (Class368_Sub2.anInt5712 * anLocalInt_445_);
                                anLocalInt_441_ += anLocalInt_445_;
                            }
                            if ((anLocalInt_445_ = ((anLocalInt_443_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_444_)
                                anLocalInt_444_ = anLocalInt_445_;
                            int anLocalInt_446_ = (argument_427_[anLocalInt_440_] - argument_429_);
                            int anLocalInt_447_ = -argument_428_[anLocalInt_440_];
                            int anLocalInt_448_ = (anLocalInt_446_ - (anLocalInt_441_ - Class368_Sub2.anInt5724));
                            if (anLocalInt_448_ > 0) {
                                anLocalInt_441_ += anLocalInt_448_;
                                anLocalInt_444_ += anLocalInt_448_;
                                anLocalInt_442_ += (Class368_Sub2.anInt5717 * anLocalInt_448_);
                                anLocalInt_443_ += (Class368_Sub2.anInt5712 * anLocalInt_448_);
                            } else
                                anLocalInt_447_ -= anLocalInt_448_;
                            if (anLocalInt_444_ < anLocalInt_447_)
                                anLocalInt_444_ = anLocalInt_447_;
                            for (/**/; anLocalInt_444_ < 0; anLocalInt_444_++) {
                                int anLocalInt_449_ = (this.pixels[(((anLocalInt_443_ >> 12) * this.width) + (anLocalInt_442_ >> 12))]);
                                if (anLocalInt_449_ != 0)
                                    anLocalInts[anLocalInt_441_++] = anLocalInt_449_;
                                else
                                    anLocalInt_441_++;
                                anLocalInt_443_ += Class368_Sub2.anInt5712;
                            }
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_450_ = anLocalInt + argument_430_;
                    if (anLocalInt_450_ >= 0) {
                        if (anLocalInt_450_ >= argument_427_.length)
                            break;
                        int anLocalInt_451_ = Class368_Sub2.anInt5724;
                        int anLocalInt_452_ = Class368_Sub2.anInt5710;
                        int anLocalInt_453_ = (Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725);
                        int anLocalInt_454_ = Class368_Sub2.anInt5713;
                        if (anLocalInt_452_ >= 0 && ((anLocalInt_452_ - (this.width << 12)) < 0)) {
                            if (anLocalInt_453_ < 0) {
                                int anLocalInt_455_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_453_) / Class368_Sub2.anInt5712);
                                anLocalInt_454_ += anLocalInt_455_;
                                anLocalInt_453_ += (Class368_Sub2.anInt5712 * anLocalInt_455_);
                                anLocalInt_451_ += anLocalInt_455_;
                            }
                            int anLocalInt_456_;
                            if ((anLocalInt_456_ = ((anLocalInt_453_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_454_)
                                anLocalInt_454_ = anLocalInt_456_;
                            int anLocalInt_457_ = (argument_427_[anLocalInt_450_] - argument_429_);
                            int anLocalInt_458_ = -argument_428_[anLocalInt_450_];
                            int anLocalInt_459_ = (anLocalInt_457_ - (anLocalInt_451_ - Class368_Sub2.anInt5724));
                            if (anLocalInt_459_ > 0) {
                                anLocalInt_451_ += anLocalInt_459_;
                                anLocalInt_454_ += anLocalInt_459_;
                                anLocalInt_452_ += (Class368_Sub2.anInt5717 * anLocalInt_459_);
                                anLocalInt_453_ += (Class368_Sub2.anInt5712 * anLocalInt_459_);
                            } else
                                anLocalInt_458_ -= anLocalInt_459_;
                            if (anLocalInt_454_ < anLocalInt_458_)
                                anLocalInt_454_ = anLocalInt_458_;
                            for (/**/; anLocalInt_454_ < 0; anLocalInt_454_++) {
                                int anLocalInt_460_ = (this.pixels[(((anLocalInt_453_ >> 12) * this.width) + (anLocalInt_452_ >> 12))]);
                                if (anLocalInt_460_ != 0)
                                    anLocalInts[anLocalInt_451_++] = anLocalInt_460_;
                                else
                                    anLocalInt_451_++;
                                anLocalInt_453_ += Class368_Sub2.anInt5712;
                            }
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            }
        } else if (Class368_Sub2.anInt5717 < 0) {
            if (Class368_Sub2.anInt5712 == 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_461_ = anLocalInt + argument_430_;
                    if (anLocalInt_461_ >= 0) {
                        if (anLocalInt_461_ >= argument_427_.length)
                            break;
                        int anLocalInt_462_ = Class368_Sub2.anInt5724;
                        int anLocalInt_463_ = (Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721);
                        int anLocalInt_464_ = Class368_Sub2.anInt5704;
                        int anLocalInt_465_ = Class368_Sub2.anInt5713;
                        if (anLocalInt_464_ >= 0 && ((anLocalInt_464_ - (this.height << 12)) < 0)) {
                            int anLocalInt_466_;
                            if ((anLocalInt_466_ = (anLocalInt_463_ - (this.width << 12))) >= 0) {
                                anLocalInt_466_ = ((Class368_Sub2.anInt5717 - anLocalInt_466_) / Class368_Sub2.anInt5717);
                                anLocalInt_465_ += anLocalInt_466_;
                                anLocalInt_463_ += (Class368_Sub2.anInt5717 * anLocalInt_466_);
                                anLocalInt_462_ += anLocalInt_466_;
                            }
                            if ((anLocalInt_466_ = ((anLocalInt_463_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_465_)
                                anLocalInt_465_ = anLocalInt_466_;
                            int anLocalInt_467_ = (argument_427_[anLocalInt_461_] - argument_429_);
                            int anLocalInt_468_ = -argument_428_[anLocalInt_461_];
                            int anLocalInt_469_ = (anLocalInt_467_ - (anLocalInt_462_ - Class368_Sub2.anInt5724));
                            if (anLocalInt_469_ > 0) {
                                anLocalInt_462_ += anLocalInt_469_;
                                anLocalInt_465_ += anLocalInt_469_;
                                anLocalInt_463_ += (Class368_Sub2.anInt5717 * anLocalInt_469_);
                                anLocalInt_464_ += (Class368_Sub2.anInt5712 * anLocalInt_469_);
                            } else
                                anLocalInt_468_ -= anLocalInt_469_;
                            if (anLocalInt_465_ < anLocalInt_468_)
                                anLocalInt_465_ = anLocalInt_468_;
                            for (/**/; anLocalInt_465_ < 0; anLocalInt_465_++) {
                                int anLocalInt_470_ = (this.pixels[(((anLocalInt_464_ >> 12) * this.width) + (anLocalInt_463_ >> 12))]);
                                if (anLocalInt_470_ != 0)
                                    anLocalInts[anLocalInt_462_++] = anLocalInt_470_;
                                else
                                    anLocalInt_462_++;
                                anLocalInt_463_ += Class368_Sub2.anInt5717;
                            }
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else if (Class368_Sub2.anInt5712 < 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_471_ = anLocalInt + argument_430_;
                    if (anLocalInt_471_ >= 0) {
                        if (anLocalInt_471_ >= argument_427_.length)
                            break;
                        int anLocalInt_472_ = Class368_Sub2.anInt5724;
                        int anLocalInt_473_ = (Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721);
                        int anLocalInt_474_ = (Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725);
                        int anLocalInt_475_ = Class368_Sub2.anInt5713;
                        int anLocalInt_476_;
                        if ((anLocalInt_476_ = (anLocalInt_473_ - (this.width << 12))) >= 0) {
                            anLocalInt_476_ = ((Class368_Sub2.anInt5717 - anLocalInt_476_) / Class368_Sub2.anInt5717);
                            anLocalInt_475_ += anLocalInt_476_;
                            anLocalInt_473_ += Class368_Sub2.anInt5717 * anLocalInt_476_;
                            anLocalInt_474_ += Class368_Sub2.anInt5712 * anLocalInt_476_;
                            anLocalInt_472_ += anLocalInt_476_;
                        }
                        if ((anLocalInt_476_ = ((anLocalInt_473_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_475_)
                            anLocalInt_475_ = anLocalInt_476_;
                        if ((anLocalInt_476_ = (anLocalInt_474_ - (this.height << 12))) >= 0) {
                            anLocalInt_476_ = ((Class368_Sub2.anInt5712 - anLocalInt_476_) / Class368_Sub2.anInt5712);
                            anLocalInt_475_ += anLocalInt_476_;
                            anLocalInt_473_ += Class368_Sub2.anInt5717 * anLocalInt_476_;
                            anLocalInt_474_ += Class368_Sub2.anInt5712 * anLocalInt_476_;
                            anLocalInt_472_ += anLocalInt_476_;
                        }
                        if ((anLocalInt_476_ = ((anLocalInt_474_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_475_)
                            anLocalInt_475_ = anLocalInt_476_;
                        int anLocalInt_477_ = argument_427_[anLocalInt_471_] - argument_429_;
                        int anLocalInt_478_ = -argument_428_[anLocalInt_471_];
                        int anLocalInt_479_ = (anLocalInt_477_ - (anLocalInt_472_ - Class368_Sub2.anInt5724));
                        if (anLocalInt_479_ > 0) {
                            anLocalInt_472_ += anLocalInt_479_;
                            anLocalInt_475_ += anLocalInt_479_;
                            anLocalInt_473_ += Class368_Sub2.anInt5717 * anLocalInt_479_;
                            anLocalInt_474_ += Class368_Sub2.anInt5712 * anLocalInt_479_;
                        } else
                            anLocalInt_478_ -= anLocalInt_479_;
                        if (anLocalInt_475_ < anLocalInt_478_)
                            anLocalInt_475_ = anLocalInt_478_;
                        for (/**/; anLocalInt_475_ < 0; anLocalInt_475_++) {
                            int anLocalInt_480_ = (this.pixels[(((anLocalInt_474_ >> 12) * this.width) + (anLocalInt_473_ >> 12))]);
                            if (anLocalInt_480_ != 0)
                                anLocalInts[anLocalInt_472_++] = anLocalInt_480_;
                            else
                                anLocalInt_472_++;
                            anLocalInt_473_ += Class368_Sub2.anInt5717;
                            anLocalInt_474_ += Class368_Sub2.anInt5712;
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_481_ = anLocalInt + argument_430_;
                    if (anLocalInt_481_ >= 0) {
                        if (anLocalInt_481_ >= argument_427_.length)
                            break;
                        int anLocalInt_482_ = Class368_Sub2.anInt5724;
                        int anLocalInt_483_ = (Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721);
                        int anLocalInt_484_ = (Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725);
                        int anLocalInt_485_ = Class368_Sub2.anInt5713;
                        int anLocalInt_486_;
                        if ((anLocalInt_486_ = (anLocalInt_483_ - (this.width << 12))) >= 0) {
                            anLocalInt_486_ = ((Class368_Sub2.anInt5717 - anLocalInt_486_) / Class368_Sub2.anInt5717);
                            anLocalInt_485_ += anLocalInt_486_;
                            anLocalInt_483_ += Class368_Sub2.anInt5717 * anLocalInt_486_;
                            anLocalInt_484_ += Class368_Sub2.anInt5712 * anLocalInt_486_;
                            anLocalInt_482_ += anLocalInt_486_;
                        }
                        if ((anLocalInt_486_ = ((anLocalInt_483_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_485_)
                            anLocalInt_485_ = anLocalInt_486_;
                        if (anLocalInt_484_ < 0) {
                            anLocalInt_486_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_484_) / Class368_Sub2.anInt5712);
                            anLocalInt_485_ += anLocalInt_486_;
                            anLocalInt_483_ += Class368_Sub2.anInt5717 * anLocalInt_486_;
                            anLocalInt_484_ += Class368_Sub2.anInt5712 * anLocalInt_486_;
                            anLocalInt_482_ += anLocalInt_486_;
                        }
                        if ((anLocalInt_486_ = ((anLocalInt_484_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_485_)
                            anLocalInt_485_ = anLocalInt_486_;
                        int anLocalInt_487_ = argument_427_[anLocalInt_481_] - argument_429_;
                        int anLocalInt_488_ = -argument_428_[anLocalInt_481_];
                        int anLocalInt_489_ = (anLocalInt_487_ - (anLocalInt_482_ - Class368_Sub2.anInt5724));
                        if (anLocalInt_489_ > 0) {
                            anLocalInt_482_ += anLocalInt_489_;
                            anLocalInt_485_ += anLocalInt_489_;
                            anLocalInt_483_ += Class368_Sub2.anInt5717 * anLocalInt_489_;
                            anLocalInt_484_ += Class368_Sub2.anInt5712 * anLocalInt_489_;
                        } else
                            anLocalInt_488_ -= anLocalInt_489_;
                        if (anLocalInt_485_ < anLocalInt_488_)
                            anLocalInt_485_ = anLocalInt_488_;
                        for (/**/; anLocalInt_485_ < 0; anLocalInt_485_++) {
                            int anLocalInt_490_ = (this.pixels[(((anLocalInt_484_ >> 12) * this.width) + (anLocalInt_483_ >> 12))]);
                            if (anLocalInt_490_ != 0)
                                anLocalInts[anLocalInt_482_++] = anLocalInt_490_;
                            else
                                anLocalInt_482_++;
                            anLocalInt_483_ += Class368_Sub2.anInt5717;
                            anLocalInt_484_ += Class368_Sub2.anInt5712;
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            }
        } else if (Class368_Sub2.anInt5712 == 0) {
            int anLocalInt = Class368_Sub2.anInt5700;
            while (anLocalInt < 0) {
                int anLocalInt_491_ = anLocalInt + argument_430_;
                if (anLocalInt_491_ >= 0) {
                    if (anLocalInt_491_ >= argument_427_.length)
                        break;
                    int anLocalInt_492_ = Class368_Sub2.anInt5724;
                    int anLocalInt_493_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_494_ = Class368_Sub2.anInt5704;
                    int anLocalInt_495_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_494_ >= 0 && anLocalInt_494_ - (this.height << 12) < 0) {
                        if (anLocalInt_493_ < 0) {
                            int anLocalInt_496_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_493_) / Class368_Sub2.anInt5717);
                            anLocalInt_495_ += anLocalInt_496_;
                            anLocalInt_493_ += Class368_Sub2.anInt5717 * anLocalInt_496_;
                            anLocalInt_492_ += anLocalInt_496_;
                        }
                        int anLocalInt_497_;
                        if ((anLocalInt_497_ = ((anLocalInt_493_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_495_)
                            anLocalInt_495_ = anLocalInt_497_;
                        int anLocalInt_498_ = argument_427_[anLocalInt_491_] - argument_429_;
                        int anLocalInt_499_ = -argument_428_[anLocalInt_491_];
                        int anLocalInt_500_ = (anLocalInt_498_ - (anLocalInt_492_ - Class368_Sub2.anInt5724));
                        if (anLocalInt_500_ > 0) {
                            anLocalInt_492_ += anLocalInt_500_;
                            anLocalInt_495_ += anLocalInt_500_;
                            anLocalInt_493_ += Class368_Sub2.anInt5717 * anLocalInt_500_;
                            anLocalInt_494_ += Class368_Sub2.anInt5712 * anLocalInt_500_;
                        } else
                            anLocalInt_499_ -= anLocalInt_500_;
                        if (anLocalInt_495_ < anLocalInt_499_)
                            anLocalInt_495_ = anLocalInt_499_;
                        for (/**/; anLocalInt_495_ < 0; anLocalInt_495_++) {
                            int anLocalInt_501_ = (this.pixels[(((anLocalInt_494_ >> 12) * this.width) + (anLocalInt_493_ >> 12))]);
                            if (anLocalInt_501_ != 0)
                                anLocalInts[anLocalInt_492_++] = anLocalInt_501_;
                            else
                                anLocalInt_492_++;
                            anLocalInt_493_ += Class368_Sub2.anInt5717;
                        }
                    }
                }
                anLocalInt++;
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        } else if (Class368_Sub2.anInt5712 < 0) {
            int anLocalInt = Class368_Sub2.anInt5700;
            while (anLocalInt < 0) {
                int anLocalInt_502_ = anLocalInt + argument_430_;
                if (anLocalInt_502_ >= 0) {
                    if (anLocalInt_502_ >= argument_427_.length)
                        break;
                    int anLocalInt_503_ = Class368_Sub2.anInt5724;
                    int anLocalInt_504_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_505_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_506_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_504_ < 0) {
                        int anLocalInt_507_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_504_) / Class368_Sub2.anInt5717);
                        anLocalInt_506_ += anLocalInt_507_;
                        anLocalInt_504_ += Class368_Sub2.anInt5717 * anLocalInt_507_;
                        anLocalInt_505_ += Class368_Sub2.anInt5712 * anLocalInt_507_;
                        anLocalInt_503_ += anLocalInt_507_;
                    }
                    int anLocalInt_508_;
                    if ((anLocalInt_508_ = ((anLocalInt_504_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_506_)
                        anLocalInt_506_ = anLocalInt_508_;
                    if ((anLocalInt_508_ = anLocalInt_505_ - (this.height << 12)) >= 0) {
                        anLocalInt_508_ = ((Class368_Sub2.anInt5712 - anLocalInt_508_) / Class368_Sub2.anInt5712);
                        anLocalInt_506_ += anLocalInt_508_;
                        anLocalInt_504_ += Class368_Sub2.anInt5717 * anLocalInt_508_;
                        anLocalInt_505_ += Class368_Sub2.anInt5712 * anLocalInt_508_;
                        anLocalInt_503_ += anLocalInt_508_;
                    }
                    if ((anLocalInt_508_ = ((anLocalInt_505_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_506_)
                        anLocalInt_506_ = anLocalInt_508_;
                    int anLocalInt_509_ = argument_427_[anLocalInt_502_] - argument_429_;
                    int anLocalInt_510_ = -argument_428_[anLocalInt_502_];
                    int anLocalInt_511_ = (anLocalInt_509_ - (anLocalInt_503_ - Class368_Sub2.anInt5724));
                    if (anLocalInt_511_ > 0) {
                        anLocalInt_503_ += anLocalInt_511_;
                        anLocalInt_506_ += anLocalInt_511_;
                        anLocalInt_504_ += Class368_Sub2.anInt5717 * anLocalInt_511_;
                        anLocalInt_505_ += Class368_Sub2.anInt5712 * anLocalInt_511_;
                    } else
                        anLocalInt_510_ -= anLocalInt_511_;
                    if (anLocalInt_506_ < anLocalInt_510_)
                        anLocalInt_506_ = anLocalInt_510_;
                    for (/**/; anLocalInt_506_ < 0; anLocalInt_506_++) {
                        int anLocalInt_512_ = (this.pixels[(((anLocalInt_505_ >> 12) * this.width) + (anLocalInt_504_ >> 12))]);
                        if (anLocalInt_512_ != 0)
                            anLocalInts[anLocalInt_503_++] = anLocalInt_512_;
                        else
                            anLocalInt_503_++;
                        anLocalInt_504_ += Class368_Sub2.anInt5717;
                        anLocalInt_505_ += Class368_Sub2.anInt5712;
                    }
                }
                anLocalInt++;
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        } else {
            int anLocalInt = Class368_Sub2.anInt5700;
            while (anLocalInt < 0) {
                int anLocalInt_513_ = anLocalInt + argument_430_;
                if (anLocalInt_513_ >= 0) {
                    if (anLocalInt_513_ >= argument_427_.length)
                        break;
                    int anLocalInt_514_ = Class368_Sub2.anInt5724;
                    int anLocalInt_515_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_516_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_517_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_515_ < 0) {
                        int anLocalInt_518_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_515_) / Class368_Sub2.anInt5717);
                        anLocalInt_517_ += anLocalInt_518_;
                        anLocalInt_515_ += Class368_Sub2.anInt5717 * anLocalInt_518_;
                        anLocalInt_516_ += Class368_Sub2.anInt5712 * anLocalInt_518_;
                        anLocalInt_514_ += anLocalInt_518_;
                    }
                    int anLocalInt_519_;
                    if ((anLocalInt_519_ = ((anLocalInt_515_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_517_)
                        anLocalInt_517_ = anLocalInt_519_;
                    if (anLocalInt_516_ < 0) {
                        anLocalInt_519_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_516_) / Class368_Sub2.anInt5712);
                        anLocalInt_517_ += anLocalInt_519_;
                        anLocalInt_515_ += Class368_Sub2.anInt5717 * anLocalInt_519_;
                        anLocalInt_516_ += Class368_Sub2.anInt5712 * anLocalInt_519_;
                        anLocalInt_514_ += anLocalInt_519_;
                    }
                    if ((anLocalInt_519_ = ((anLocalInt_516_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_517_)
                        anLocalInt_517_ = anLocalInt_519_;
                    int anLocalInt_520_ = argument_427_[anLocalInt_513_] - argument_429_;
                    int anLocalInt_521_ = -argument_428_[anLocalInt_513_];
                    int anLocalInt_522_ = (anLocalInt_520_ - (anLocalInt_514_ - Class368_Sub2.anInt5724));
                    if (anLocalInt_522_ > 0) {
                        anLocalInt_514_ += anLocalInt_522_;
                        anLocalInt_517_ += anLocalInt_522_;
                        anLocalInt_515_ += Class368_Sub2.anInt5717 * anLocalInt_522_;
                        anLocalInt_516_ += Class368_Sub2.anInt5712 * anLocalInt_522_;
                    } else
                        anLocalInt_521_ -= anLocalInt_522_;
                    if (anLocalInt_517_ < anLocalInt_521_)
                        anLocalInt_517_ = anLocalInt_521_;
                    for (/**/; anLocalInt_517_ < 0; anLocalInt_517_++) {
                        int anLocalInt_523_ = (this.pixels[(((anLocalInt_516_ >> 12) * this.width) + (anLocalInt_515_ >> 12))]);
                        if (anLocalInt_523_ != 0)
                            anLocalInts[anLocalInt_514_++] = anLocalInt_523_;
                        else
                            anLocalInt_514_++;
                        anLocalInt_515_ += Class368_Sub2.anInt5717;
                        anLocalInt_516_ += Class368_Sub2.anInt5712;
                    }
                }
                anLocalInt++;
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        }
    }

    final void method4031(int argument_524_, int argument_525_) {
        int[] targetPixels = (this.toolkit.pixels);
        if (Class368_Sub2.anInt5717 == 0) {
            if (Class368_Sub2.anInt5712 == 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_526_ = Class368_Sub2.anInt5724;
                    int anLocalInt_527_ = Class368_Sub2.anInt5710;
                    int anLocalInt_528_ = Class368_Sub2.anInt5704;
                    int anLocalInt_529_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_527_ >= 0 && anLocalInt_528_ >= 0 && anLocalInt_527_ - (this.width << 12) < 0 && anLocalInt_528_ - (this.height << 12) < 0) {
                        for (/**/; anLocalInt_529_ < 0; anLocalInt_529_++) {
                            int anLocalInt_530_ = (((anLocalInt_528_ >> 12) * this.width) + (anLocalInt_527_ >> 12));
                            int anLocalInt_531_ = anLocalInt_526_++;
                            if (argument_525_ == 0) {
                                if (argument_524_ == 1)
                                    targetPixels[anLocalInt_531_] = (this.pixels[anLocalInt_530_]);
                                else if (argument_524_ == 0) {
                                    int srcPixel = (this.pixels[anLocalInt_530_++]);
                                    int anLocalInt_536_ = (((srcPixel & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_537_ = (((srcPixel & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_538_ = (((srcPixel & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    targetPixels[anLocalInt_531_] = (anLocalInt_536_ | anLocalInt_537_ | anLocalInt_538_) >>> 8;
                                } else if (argument_524_ == 3) {
                                    int srcPixel = (this.pixels[anLocalInt_530_++]);
                                    int anLocalInt_540_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_541_ = srcPixel + anLocalInt_540_;
                                    int anLocalInt_542_ = ((srcPixel & 0xff00ff) + (anLocalInt_540_ & 0xff00ff));
                                    int anLocalInt_543_ = ((anLocalInt_542_ & 0x1000100) + (anLocalInt_541_ - anLocalInt_542_ & 0x10000));
                                    targetPixels[anLocalInt_531_] = (anLocalInt_541_ - anLocalInt_543_ | anLocalInt_543_ - (anLocalInt_543_ >>> 8));
                                } else if (argument_524_ == 2) {
                                    int anLocalInt_544_ = (this.pixels[anLocalInt_530_]);
                                    int anLocalInt_545_ = (((anLocalInt_544_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_546_ = (((anLocalInt_544_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    targetPixels[anLocalInt_531_] = ((anLocalInt_545_ | anLocalInt_546_) >>> 8) + Class368_Sub2.anInt5697;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (argument_525_ == 1) {
                                if (argument_524_ == 1) {
                                    int anLocalInt_547_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_547_ != 0)
                                        targetPixels[anLocalInt_531_] = anLocalInt_547_;
                                } else if (argument_524_ == 0) {
                                    int anLocalInt_548_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_548_ != 0) {
                                        if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                            int anLocalInt_549_ = (Class368_Sub2.anInt5693 >>> 24);
                                            int anLocalInt_550_ = 256 - anLocalInt_549_;
                                            int anLocalInt_551_ = (targetPixels[anLocalInt_531_]);
                                            targetPixels[anLocalInt_531_] = (((((anLocalInt_548_ & 0xff00ff) * anLocalInt_549_) + ((anLocalInt_551_ & 0xff00ff) * anLocalInt_550_)) & ~0xff00ff) + ((((anLocalInt_548_ & 0xff00) * anLocalInt_549_) + ((anLocalInt_551_ & 0xff00) * anLocalInt_550_)) & 0xff0000)) >> 8;
                                        } else if (Class368_Sub2.anInt5695 != 255) {
                                            int anLocalInt_552_ = (((anLocalInt_548_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_553_ = (((anLocalInt_548_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_554_ = (((anLocalInt_548_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInt_548_ = (anLocalInt_552_ | anLocalInt_553_ | anLocalInt_554_) >>> 8;
                                            int anLocalInt_555_ = (targetPixels[anLocalInt_531_]);
                                            targetPixels[anLocalInt_531_] = (((((anLocalInt_548_ & 0xff00ff) * (Class368_Sub2.anInt5695)) + ((anLocalInt_555_ & 0xff00ff) * (Class368_Sub2.anInt5711))) & ~0xff00ff) + ((((anLocalInt_548_ & 0xff00) * (Class368_Sub2.anInt5695)) + ((anLocalInt_555_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                        } else {
                                            int anLocalInt_556_ = (((anLocalInt_548_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_557_ = (((anLocalInt_548_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_558_ = (((anLocalInt_548_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            targetPixels[anLocalInt_531_] = (anLocalInt_556_ | anLocalInt_557_ | anLocalInt_558_) >>> 8;
                                        }
                                    }
                                } else if (argument_524_ == 3) {
                                    int anLocalInt_559_ = (this.pixels[anLocalInt_530_]);
                                    int anLocalInt_560_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_561_ = anLocalInt_559_ + anLocalInt_560_;
                                    int anLocalInt_562_ = ((anLocalInt_559_ & 0xff00ff) + (anLocalInt_560_ & 0xff00ff));
                                    int anLocalInt_563_ = ((anLocalInt_562_ & 0x1000100) + (anLocalInt_561_ - anLocalInt_562_ & 0x10000));
                                    anLocalInt_563_ = (anLocalInt_561_ - anLocalInt_563_ | anLocalInt_563_ - (anLocalInt_563_ >>> 8));
                                    if (anLocalInt_559_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                        anLocalInt_559_ = anLocalInt_563_;
                                        anLocalInt_563_ = (targetPixels[anLocalInt_531_]);
                                        anLocalInt_563_ = (((((anLocalInt_559_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_563_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_559_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_563_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    }
                                    targetPixels[anLocalInt_531_] = anLocalInt_563_;
                                } else if (argument_524_ == 2) {
                                    int anLocalInt_564_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_564_ != 0) {
                                        int anLocalInt_565_ = (((anLocalInt_564_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_566_ = (((anLocalInt_564_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        targetPixels[anLocalInt_531_++] = (((anLocalInt_565_ | anLocalInt_566_) >>> 8) + Class368_Sub2.anInt5697);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (argument_525_ == 2) {
                                if (argument_524_ == 1) {
                                    int anLocalInt_567_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_567_ != 0) {
                                        int anLocalInt_568_ = (targetPixels[anLocalInt_531_]);
                                        int anLocalInt_569_ = (anLocalInt_567_ + anLocalInt_568_);
                                        int anLocalInt_570_ = ((anLocalInt_567_ & 0xff00ff) + (anLocalInt_568_ & 0xff00ff));
                                        anLocalInt_568_ = ((anLocalInt_570_ & 0x1000100) + ((anLocalInt_569_ - anLocalInt_570_) & 0x10000));
                                        targetPixels[anLocalInt_531_] = ((anLocalInt_569_ - anLocalInt_568_) | (anLocalInt_568_ - (anLocalInt_568_ >>> 8)));
                                    }
                                } else if (argument_524_ == 0) {
                                    int anLocalInt_571_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_571_ != 0) {
                                        int anLocalInt_572_ = (((anLocalInt_571_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_573_ = (((anLocalInt_571_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_574_ = (((anLocalInt_571_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_571_ = (anLocalInt_572_ | anLocalInt_573_ | anLocalInt_574_) >>> 8;
                                        int anLocalInt_575_ = (targetPixels[anLocalInt_531_]);
                                        int anLocalInt_576_ = (anLocalInt_571_ + anLocalInt_575_);
                                        int anLocalInt_577_ = ((anLocalInt_571_ & 0xff00ff) + (anLocalInt_575_ & 0xff00ff));
                                        anLocalInt_575_ = ((anLocalInt_577_ & 0x1000100) + ((anLocalInt_576_ - anLocalInt_577_) & 0x10000));
                                        targetPixels[anLocalInt_531_] = ((anLocalInt_576_ - anLocalInt_575_) | (anLocalInt_575_ - (anLocalInt_575_ >>> 8)));
                                    }
                                } else if (argument_524_ == 3) {
                                    int anLocalInt_578_ = (this.pixels[anLocalInt_530_]);
                                    int anLocalInt_579_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_580_ = anLocalInt_578_ + anLocalInt_579_;
                                    int anLocalInt_581_ = ((anLocalInt_578_ & 0xff00ff) + (anLocalInt_579_ & 0xff00ff));
                                    int anLocalInt_582_ = ((anLocalInt_581_ & 0x1000100) + (anLocalInt_580_ - anLocalInt_581_ & 0x10000));
                                    anLocalInt_578_ = (anLocalInt_580_ - anLocalInt_582_ | anLocalInt_582_ - (anLocalInt_582_ >>> 8));
                                    anLocalInt_582_ = targetPixels[anLocalInt_531_];
                                    anLocalInt_580_ = anLocalInt_578_ + anLocalInt_582_;
                                    anLocalInt_581_ = ((anLocalInt_578_ & 0xff00ff) + (anLocalInt_582_ & 0xff00ff));
                                    anLocalInt_582_ = ((anLocalInt_581_ & 0x1000100) + (anLocalInt_580_ - anLocalInt_581_ & 0x10000));
                                    targetPixels[anLocalInt_531_] = (anLocalInt_580_ - anLocalInt_582_ | anLocalInt_582_ - (anLocalInt_582_ >>> 8));
                                } else if (argument_524_ == 2) {
                                    int anLocalInt_583_ = (this.pixels[anLocalInt_530_]);
                                    if (anLocalInt_583_ != 0) {
                                        int anLocalInt_584_ = (((anLocalInt_583_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_585_ = (((anLocalInt_583_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInt_583_ = (((anLocalInt_584_ | anLocalInt_585_) >>> 8) + Class368_Sub2.anInt5697);
                                        int anLocalInt_586_ = (targetPixels[anLocalInt_531_]);
                                        int anLocalInt_587_ = (anLocalInt_583_ + anLocalInt_586_);
                                        int anLocalInt_588_ = ((anLocalInt_583_ & 0xff00ff) + (anLocalInt_586_ & 0xff00ff));
                                        anLocalInt_586_ = ((anLocalInt_588_ & 0x1000100) + ((anLocalInt_587_ - anLocalInt_588_) & 0x10000));
                                        targetPixels[anLocalInt_531_] = ((anLocalInt_587_ - anLocalInt_586_) | (anLocalInt_586_ - (anLocalInt_586_ >>> 8)));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else if (Class368_Sub2.anInt5712 < 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_589_ = Class368_Sub2.anInt5724;
                    int anLocalInt_590_ = Class368_Sub2.anInt5710;
                    int anLocalInt_591_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_592_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_590_ >= 0 && anLocalInt_590_ - (this.width << 12) < 0) {
                        int anLocalInt_593_;
                        if ((anLocalInt_593_ = (anLocalInt_591_ - (this.height << 12))) >= 0) {
                            anLocalInt_593_ = ((Class368_Sub2.anInt5712 - anLocalInt_593_) / Class368_Sub2.anInt5712);
                            anLocalInt_592_ += anLocalInt_593_;
                            anLocalInt_591_ += Class368_Sub2.anInt5712 * anLocalInt_593_;
                            anLocalInt_589_ += anLocalInt_593_;
                        }
                        if ((anLocalInt_593_ = ((anLocalInt_591_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_592_)
                            anLocalInt_592_ = anLocalInt_593_;
                        for (/**/; anLocalInt_592_ < 0; anLocalInt_592_++) {
                            int anLocalInt_594_ = (((anLocalInt_591_ >> 12) * this.width) + (anLocalInt_590_ >> 12));
                            int anLocalInt_595_ = anLocalInt_589_++;
                            int[] anLocalInts_596_ = targetPixels;
                            int anLocalInt_597_ = argument_524_;
                            int anLocalInt_598_ = argument_525_;
                            if (anLocalInt_598_ == 0) {
                                if (anLocalInt_597_ == 1)
                                    anLocalInts_596_[anLocalInt_595_] = (this.pixels[anLocalInt_594_]);
                                else if (anLocalInt_597_ == 0) {
                                    int anLocalInt_599_ = (this.pixels[anLocalInt_594_++]);
                                    int anLocalInt_600_ = (((anLocalInt_599_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_601_ = (((anLocalInt_599_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_602_ = (((anLocalInt_599_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInts_596_[anLocalInt_595_] = (anLocalInt_600_ | anLocalInt_601_ | anLocalInt_602_) >>> 8;
                                } else if (anLocalInt_597_ == 3) {
                                    int anLocalInt_603_ = (this.pixels[anLocalInt_594_++]);
                                    int anLocalInt_604_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_605_ = anLocalInt_603_ + anLocalInt_604_;
                                    int anLocalInt_606_ = ((anLocalInt_603_ & 0xff00ff) + (anLocalInt_604_ & 0xff00ff));
                                    int anLocalInt_607_ = ((anLocalInt_606_ & 0x1000100) + (anLocalInt_605_ - anLocalInt_606_ & 0x10000));
                                    anLocalInts_596_[anLocalInt_595_] = (anLocalInt_605_ - anLocalInt_607_ | anLocalInt_607_ - (anLocalInt_607_ >>> 8));
                                } else if (anLocalInt_597_ == 2) {
                                    int anLocalInt_608_ = (this.pixels[anLocalInt_594_]);
                                    int anLocalInt_609_ = (((anLocalInt_608_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_610_ = (((anLocalInt_608_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_596_[anLocalInt_595_] = ((anLocalInt_609_ | anLocalInt_610_) >>> 8) + Class368_Sub2.anInt5697;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_598_ == 1) {
                                if (anLocalInt_597_ == 1) {
                                    int anLocalInt_611_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_611_ != 0)
                                        anLocalInts_596_[anLocalInt_595_] = anLocalInt_611_;
                                } else if (anLocalInt_597_ == 0) {
                                    int anLocalInt_612_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_612_ != 0) {
                                        if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                            int anLocalInt_613_ = (Class368_Sub2.anInt5693 >>> 24);
                                            int anLocalInt_614_ = 256 - anLocalInt_613_;
                                            int anLocalInt_615_ = (anLocalInts_596_[anLocalInt_595_]);
                                            anLocalInts_596_[anLocalInt_595_] = (((((anLocalInt_612_ & 0xff00ff) * anLocalInt_613_) + ((anLocalInt_615_ & 0xff00ff) * anLocalInt_614_)) & ~0xff00ff) + ((((anLocalInt_612_ & 0xff00) * anLocalInt_613_) + ((anLocalInt_615_ & 0xff00) * anLocalInt_614_)) & 0xff0000)) >> 8;
                                        } else if (Class368_Sub2.anInt5695 != 255) {
                                            int anLocalInt_616_ = (((anLocalInt_612_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_617_ = (((anLocalInt_612_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_618_ = (((anLocalInt_612_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInt_612_ = (anLocalInt_616_ | anLocalInt_617_ | anLocalInt_618_) >>> 8;
                                            int anLocalInt_619_ = (anLocalInts_596_[anLocalInt_595_]);
                                            anLocalInts_596_[anLocalInt_595_] = (((((anLocalInt_612_ & 0xff00ff) * (Class368_Sub2.anInt5695)) + ((anLocalInt_619_ & 0xff00ff) * (Class368_Sub2.anInt5711))) & ~0xff00ff) + ((((anLocalInt_612_ & 0xff00) * (Class368_Sub2.anInt5695)) + ((anLocalInt_619_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                        } else {
                                            int anLocalInt_620_ = (((anLocalInt_612_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_621_ = (((anLocalInt_612_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_622_ = (((anLocalInt_612_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInts_596_[anLocalInt_595_] = (anLocalInt_620_ | anLocalInt_621_ | anLocalInt_622_) >>> 8;
                                        }
                                    }
                                } else if (anLocalInt_597_ == 3) {
                                    int anLocalInt_623_ = (this.pixels[anLocalInt_594_]);
                                    int anLocalInt_624_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_625_ = anLocalInt_623_ + anLocalInt_624_;
                                    int anLocalInt_626_ = ((anLocalInt_623_ & 0xff00ff) + (anLocalInt_624_ & 0xff00ff));
                                    int anLocalInt_627_ = ((anLocalInt_626_ & 0x1000100) + (anLocalInt_625_ - anLocalInt_626_ & 0x10000));
                                    anLocalInt_627_ = (anLocalInt_625_ - anLocalInt_627_ | anLocalInt_627_ - (anLocalInt_627_ >>> 8));
                                    if (anLocalInt_623_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                        anLocalInt_623_ = anLocalInt_627_;
                                        anLocalInt_627_ = (anLocalInts_596_[anLocalInt_595_]);
                                        anLocalInt_627_ = (((((anLocalInt_623_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_627_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_623_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_627_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    }
                                    anLocalInts_596_[anLocalInt_595_] = anLocalInt_627_;
                                } else if (anLocalInt_597_ == 2) {
                                    int anLocalInt_628_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_628_ != 0) {
                                        int anLocalInt_629_ = (((anLocalInt_628_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_630_ = (((anLocalInt_628_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInts_596_[anLocalInt_595_++] = (((anLocalInt_629_ | anLocalInt_630_) >>> 8) + Class368_Sub2.anInt5697);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_598_ == 2) {
                                if (anLocalInt_597_ == 1) {
                                    int anLocalInt_631_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_631_ != 0) {
                                        int anLocalInt_632_ = (anLocalInts_596_[anLocalInt_595_]);
                                        int anLocalInt_633_ = (anLocalInt_631_ + anLocalInt_632_);
                                        int anLocalInt_634_ = ((anLocalInt_631_ & 0xff00ff) + (anLocalInt_632_ & 0xff00ff));
                                        anLocalInt_632_ = ((anLocalInt_634_ & 0x1000100) + ((anLocalInt_633_ - anLocalInt_634_) & 0x10000));
                                        anLocalInts_596_[anLocalInt_595_] = ((anLocalInt_633_ - anLocalInt_632_) | (anLocalInt_632_ - (anLocalInt_632_ >>> 8)));
                                    }
                                } else if (anLocalInt_597_ == 0) {
                                    int anLocalInt_635_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_635_ != 0) {
                                        int anLocalInt_636_ = (((anLocalInt_635_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_637_ = (((anLocalInt_635_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_638_ = (((anLocalInt_635_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_635_ = (anLocalInt_636_ | anLocalInt_637_ | anLocalInt_638_) >>> 8;
                                        int anLocalInt_639_ = (anLocalInts_596_[anLocalInt_595_]);
                                        int anLocalInt_640_ = (anLocalInt_635_ + anLocalInt_639_);
                                        int anLocalInt_641_ = ((anLocalInt_635_ & 0xff00ff) + (anLocalInt_639_ & 0xff00ff));
                                        anLocalInt_639_ = ((anLocalInt_641_ & 0x1000100) + ((anLocalInt_640_ - anLocalInt_641_) & 0x10000));
                                        anLocalInts_596_[anLocalInt_595_] = ((anLocalInt_640_ - anLocalInt_639_) | (anLocalInt_639_ - (anLocalInt_639_ >>> 8)));
                                    }
                                } else if (anLocalInt_597_ == 3) {
                                    int anLocalInt_642_ = (this.pixels[anLocalInt_594_]);
                                    int anLocalInt_643_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_644_ = anLocalInt_642_ + anLocalInt_643_;
                                    int anLocalInt_645_ = ((anLocalInt_642_ & 0xff00ff) + (anLocalInt_643_ & 0xff00ff));
                                    int anLocalInt_646_ = ((anLocalInt_645_ & 0x1000100) + (anLocalInt_644_ - anLocalInt_645_ & 0x10000));
                                    anLocalInt_642_ = (anLocalInt_644_ - anLocalInt_646_ | anLocalInt_646_ - (anLocalInt_646_ >>> 8));
                                    anLocalInt_646_ = anLocalInts_596_[anLocalInt_595_];
                                    anLocalInt_644_ = anLocalInt_642_ + anLocalInt_646_;
                                    anLocalInt_645_ = ((anLocalInt_642_ & 0xff00ff) + (anLocalInt_646_ & 0xff00ff));
                                    anLocalInt_646_ = ((anLocalInt_645_ & 0x1000100) + (anLocalInt_644_ - anLocalInt_645_ & 0x10000));
                                    anLocalInts_596_[anLocalInt_595_] = (anLocalInt_644_ - anLocalInt_646_ | anLocalInt_646_ - (anLocalInt_646_ >>> 8));
                                } else if (anLocalInt_597_ == 2) {
                                    int anLocalInt_647_ = (this.pixels[anLocalInt_594_]);
                                    if (anLocalInt_647_ != 0) {
                                        int anLocalInt_648_ = (((anLocalInt_647_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_649_ = (((anLocalInt_647_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInt_647_ = (((anLocalInt_648_ | anLocalInt_649_) >>> 8) + Class368_Sub2.anInt5697);
                                        int anLocalInt_650_ = (anLocalInts_596_[anLocalInt_595_]);
                                        int anLocalInt_651_ = (anLocalInt_647_ + anLocalInt_650_);
                                        int anLocalInt_652_ = ((anLocalInt_647_ & 0xff00ff) + (anLocalInt_650_ & 0xff00ff));
                                        anLocalInt_650_ = ((anLocalInt_652_ & 0x1000100) + ((anLocalInt_651_ - anLocalInt_652_) & 0x10000));
                                        anLocalInts_596_[anLocalInt_595_] = ((anLocalInt_651_ - anLocalInt_650_) | (anLocalInt_650_ - (anLocalInt_650_ >>> 8)));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            anLocalInt_591_ += Class368_Sub2.anInt5712;
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_653_ = Class368_Sub2.anInt5724;
                    int anLocalInt_654_ = Class368_Sub2.anInt5710;
                    int anLocalInt_655_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_656_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_654_ >= 0 && anLocalInt_654_ - (this.width << 12) < 0) {
                        if (anLocalInt_655_ < 0) {
                            int anLocalInt_657_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_655_) / Class368_Sub2.anInt5712);
                            anLocalInt_656_ += anLocalInt_657_;
                            anLocalInt_655_ += Class368_Sub2.anInt5712 * anLocalInt_657_;
                            anLocalInt_653_ += anLocalInt_657_;
                        }
                        int anLocalInt_658_;
                        if ((anLocalInt_658_ = ((anLocalInt_655_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_656_)
                            anLocalInt_656_ = anLocalInt_658_;
                        for (/**/; anLocalInt_656_ < 0; anLocalInt_656_++) {
                            int anLocalInt_659_ = (((anLocalInt_655_ >> 12) * this.width) + (anLocalInt_654_ >> 12));
                            int anLocalInt_660_ = anLocalInt_653_++;
                            int[] anLocalInts_661_ = targetPixels;
                            int anLocalInt_662_ = argument_524_;
                            int anLocalInt_663_ = argument_525_;
                            if (anLocalInt_663_ == 0) {
                                if (anLocalInt_662_ == 1)
                                    anLocalInts_661_[anLocalInt_660_] = (this.pixels[anLocalInt_659_]);
                                else if (anLocalInt_662_ == 0) {
                                    int anLocalInt_664_ = (this.pixels[anLocalInt_659_++]);
                                    int anLocalInt_665_ = (((anLocalInt_664_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_666_ = (((anLocalInt_664_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_667_ = (((anLocalInt_664_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInts_661_[anLocalInt_660_] = (anLocalInt_665_ | anLocalInt_666_ | anLocalInt_667_) >>> 8;
                                } else if (anLocalInt_662_ == 3) {
                                    int anLocalInt_668_ = (this.pixels[anLocalInt_659_++]);
                                    int anLocalInt_669_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_670_ = anLocalInt_668_ + anLocalInt_669_;
                                    int anLocalInt_671_ = ((anLocalInt_668_ & 0xff00ff) + (anLocalInt_669_ & 0xff00ff));
                                    int anLocalInt_672_ = ((anLocalInt_671_ & 0x1000100) + (anLocalInt_670_ - anLocalInt_671_ & 0x10000));
                                    anLocalInts_661_[anLocalInt_660_] = (anLocalInt_670_ - anLocalInt_672_ | anLocalInt_672_ - (anLocalInt_672_ >>> 8));
                                } else if (anLocalInt_662_ == 2) {
                                    int anLocalInt_673_ = (this.pixels[anLocalInt_659_]);
                                    int anLocalInt_674_ = (((anLocalInt_673_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_675_ = (((anLocalInt_673_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_661_[anLocalInt_660_] = ((anLocalInt_674_ | anLocalInt_675_) >>> 8) + Class368_Sub2.anInt5697;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_663_ == 1) {
                                if (anLocalInt_662_ == 1) {
                                    int anLocalInt_676_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_676_ != 0)
                                        anLocalInts_661_[anLocalInt_660_] = anLocalInt_676_;
                                } else if (anLocalInt_662_ == 0) {
                                    int anLocalInt_677_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_677_ != 0) {
                                        if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                            int anLocalInt_678_ = (Class368_Sub2.anInt5693 >>> 24);
                                            int anLocalInt_679_ = 256 - anLocalInt_678_;
                                            int anLocalInt_680_ = (anLocalInts_661_[anLocalInt_660_]);
                                            anLocalInts_661_[anLocalInt_660_] = (((((anLocalInt_677_ & 0xff00ff) * anLocalInt_678_) + ((anLocalInt_680_ & 0xff00ff) * anLocalInt_679_)) & ~0xff00ff) + ((((anLocalInt_677_ & 0xff00) * anLocalInt_678_) + ((anLocalInt_680_ & 0xff00) * anLocalInt_679_)) & 0xff0000)) >> 8;
                                        } else if (Class368_Sub2.anInt5695 != 255) {
                                            int anLocalInt_681_ = (((anLocalInt_677_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_682_ = (((anLocalInt_677_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_683_ = (((anLocalInt_677_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInt_677_ = (anLocalInt_681_ | anLocalInt_682_ | anLocalInt_683_) >>> 8;
                                            int anLocalInt_684_ = (anLocalInts_661_[anLocalInt_660_]);
                                            anLocalInts_661_[anLocalInt_660_] = (((((anLocalInt_677_ & 0xff00ff) * (Class368_Sub2.anInt5695)) + ((anLocalInt_684_ & 0xff00ff) * (Class368_Sub2.anInt5711))) & ~0xff00ff) + ((((anLocalInt_677_ & 0xff00) * (Class368_Sub2.anInt5695)) + ((anLocalInt_684_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                        } else {
                                            int anLocalInt_685_ = (((anLocalInt_677_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_686_ = (((anLocalInt_677_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_687_ = (((anLocalInt_677_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInts_661_[anLocalInt_660_] = (anLocalInt_685_ | anLocalInt_686_ | anLocalInt_687_) >>> 8;
                                        }
                                    }
                                } else if (anLocalInt_662_ == 3) {
                                    int anLocalInt_688_ = (this.pixels[anLocalInt_659_]);
                                    int anLocalInt_689_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_690_ = anLocalInt_688_ + anLocalInt_689_;
                                    int anLocalInt_691_ = ((anLocalInt_688_ & 0xff00ff) + (anLocalInt_689_ & 0xff00ff));
                                    int anLocalInt_692_ = ((anLocalInt_691_ & 0x1000100) + (anLocalInt_690_ - anLocalInt_691_ & 0x10000));
                                    anLocalInt_692_ = (anLocalInt_690_ - anLocalInt_692_ | anLocalInt_692_ - (anLocalInt_692_ >>> 8));
                                    if (anLocalInt_688_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                        anLocalInt_688_ = anLocalInt_692_;
                                        anLocalInt_692_ = (anLocalInts_661_[anLocalInt_660_]);
                                        anLocalInt_692_ = (((((anLocalInt_688_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_692_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_688_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_692_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    }
                                    anLocalInts_661_[anLocalInt_660_] = anLocalInt_692_;
                                } else if (anLocalInt_662_ == 2) {
                                    int anLocalInt_693_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_693_ != 0) {
                                        int anLocalInt_694_ = (((anLocalInt_693_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_695_ = (((anLocalInt_693_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInts_661_[anLocalInt_660_++] = (((anLocalInt_694_ | anLocalInt_695_) >>> 8) + Class368_Sub2.anInt5697);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_663_ == 2) {
                                if (anLocalInt_662_ == 1) {
                                    int anLocalInt_696_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_696_ != 0) {
                                        int anLocalInt_697_ = (anLocalInts_661_[anLocalInt_660_]);
                                        int anLocalInt_698_ = (anLocalInt_696_ + anLocalInt_697_);
                                        int anLocalInt_699_ = ((anLocalInt_696_ & 0xff00ff) + (anLocalInt_697_ & 0xff00ff));
                                        anLocalInt_697_ = ((anLocalInt_699_ & 0x1000100) + ((anLocalInt_698_ - anLocalInt_699_) & 0x10000));
                                        anLocalInts_661_[anLocalInt_660_] = ((anLocalInt_698_ - anLocalInt_697_) | (anLocalInt_697_ - (anLocalInt_697_ >>> 8)));
                                    }
                                } else if (anLocalInt_662_ == 0) {
                                    int anLocalInt_700_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_700_ != 0) {
                                        int anLocalInt_701_ = (((anLocalInt_700_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_702_ = (((anLocalInt_700_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_703_ = (((anLocalInt_700_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_700_ = (anLocalInt_701_ | anLocalInt_702_ | anLocalInt_703_) >>> 8;
                                        int anLocalInt_704_ = (anLocalInts_661_[anLocalInt_660_]);
                                        int anLocalInt_705_ = (anLocalInt_700_ + anLocalInt_704_);
                                        int anLocalInt_706_ = ((anLocalInt_700_ & 0xff00ff) + (anLocalInt_704_ & 0xff00ff));
                                        anLocalInt_704_ = ((anLocalInt_706_ & 0x1000100) + ((anLocalInt_705_ - anLocalInt_706_) & 0x10000));
                                        anLocalInts_661_[anLocalInt_660_] = ((anLocalInt_705_ - anLocalInt_704_) | (anLocalInt_704_ - (anLocalInt_704_ >>> 8)));
                                    }
                                } else if (anLocalInt_662_ == 3) {
                                    int anLocalInt_707_ = (this.pixels[anLocalInt_659_]);
                                    int anLocalInt_708_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_709_ = anLocalInt_707_ + anLocalInt_708_;
                                    int anLocalInt_710_ = ((anLocalInt_707_ & 0xff00ff) + (anLocalInt_708_ & 0xff00ff));
                                    int anLocalInt_711_ = ((anLocalInt_710_ & 0x1000100) + (anLocalInt_709_ - anLocalInt_710_ & 0x10000));
                                    anLocalInt_707_ = (anLocalInt_709_ - anLocalInt_711_ | anLocalInt_711_ - (anLocalInt_711_ >>> 8));
                                    anLocalInt_711_ = anLocalInts_661_[anLocalInt_660_];
                                    anLocalInt_709_ = anLocalInt_707_ + anLocalInt_711_;
                                    anLocalInt_710_ = ((anLocalInt_707_ & 0xff00ff) + (anLocalInt_711_ & 0xff00ff));
                                    anLocalInt_711_ = ((anLocalInt_710_ & 0x1000100) + (anLocalInt_709_ - anLocalInt_710_ & 0x10000));
                                    anLocalInts_661_[anLocalInt_660_] = (anLocalInt_709_ - anLocalInt_711_ | anLocalInt_711_ - (anLocalInt_711_ >>> 8));
                                } else if (anLocalInt_662_ == 2) {
                                    int anLocalInt_712_ = (this.pixels[anLocalInt_659_]);
                                    if (anLocalInt_712_ != 0) {
                                        int anLocalInt_713_ = (((anLocalInt_712_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_714_ = (((anLocalInt_712_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInt_712_ = (((anLocalInt_713_ | anLocalInt_714_) >>> 8) + Class368_Sub2.anInt5697);
                                        int anLocalInt_715_ = (anLocalInts_661_[anLocalInt_660_]);
                                        int anLocalInt_716_ = (anLocalInt_712_ + anLocalInt_715_);
                                        int anLocalInt_717_ = ((anLocalInt_712_ & 0xff00ff) + (anLocalInt_715_ & 0xff00ff));
                                        anLocalInt_715_ = ((anLocalInt_717_ & 0x1000100) + ((anLocalInt_716_ - anLocalInt_717_) & 0x10000));
                                        anLocalInts_661_[anLocalInt_660_] = ((anLocalInt_716_ - anLocalInt_715_) | (anLocalInt_715_ - (anLocalInt_715_ >>> 8)));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            anLocalInt_655_ += Class368_Sub2.anInt5712;
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            }
        } else if (Class368_Sub2.anInt5717 < 0) {
            if (Class368_Sub2.anInt5712 == 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_718_ = Class368_Sub2.anInt5724;
                    int anLocalInt_719_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_720_ = Class368_Sub2.anInt5704;
                    int anLocalInt_721_ = Class368_Sub2.anInt5713;
                    if (anLocalInt_720_ >= 0 && anLocalInt_720_ - (this.height << 12) < 0) {
                        int anLocalInt_722_;
                        if ((anLocalInt_722_ = (anLocalInt_719_ - (this.width << 12))) >= 0) {
                            anLocalInt_722_ = ((Class368_Sub2.anInt5717 - anLocalInt_722_) / Class368_Sub2.anInt5717);
                            anLocalInt_721_ += anLocalInt_722_;
                            anLocalInt_719_ += Class368_Sub2.anInt5717 * anLocalInt_722_;
                            anLocalInt_718_ += anLocalInt_722_;
                        }
                        if ((anLocalInt_722_ = ((anLocalInt_719_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_721_)
                            anLocalInt_721_ = anLocalInt_722_;
                        for (/**/; anLocalInt_721_ < 0; anLocalInt_721_++) {
                            int anLocalInt_723_ = (((anLocalInt_720_ >> 12) * this.width) + (anLocalInt_719_ >> 12));
                            int anLocalInt_724_ = anLocalInt_718_++;
                            int[] anLocalInts_725_ = targetPixels;
                            int anLocalInt_726_ = argument_524_;
                            int anLocalInt_727_ = argument_525_;
                            if (anLocalInt_727_ == 0) {
                                if (anLocalInt_726_ == 1)
                                    anLocalInts_725_[anLocalInt_724_] = (this.pixels[anLocalInt_723_]);
                                else if (anLocalInt_726_ == 0) {
                                    int anLocalInt_728_ = (this.pixels[anLocalInt_723_++]);
                                    int anLocalInt_729_ = (((anLocalInt_728_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_730_ = (((anLocalInt_728_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_731_ = (((anLocalInt_728_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInts_725_[anLocalInt_724_] = (anLocalInt_729_ | anLocalInt_730_ | anLocalInt_731_) >>> 8;
                                } else if (anLocalInt_726_ == 3) {
                                    int anLocalInt_732_ = (this.pixels[anLocalInt_723_++]);
                                    int anLocalInt_733_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_734_ = anLocalInt_732_ + anLocalInt_733_;
                                    int anLocalInt_735_ = ((anLocalInt_732_ & 0xff00ff) + (anLocalInt_733_ & 0xff00ff));
                                    int anLocalInt_736_ = ((anLocalInt_735_ & 0x1000100) + (anLocalInt_734_ - anLocalInt_735_ & 0x10000));
                                    anLocalInts_725_[anLocalInt_724_] = (anLocalInt_734_ - anLocalInt_736_ | anLocalInt_736_ - (anLocalInt_736_ >>> 8));
                                } else if (anLocalInt_726_ == 2) {
                                    int anLocalInt_737_ = (this.pixels[anLocalInt_723_]);
                                    int anLocalInt_738_ = (((anLocalInt_737_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_739_ = (((anLocalInt_737_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_725_[anLocalInt_724_] = ((anLocalInt_738_ | anLocalInt_739_) >>> 8) + Class368_Sub2.anInt5697;
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_727_ == 1) {
                                if (anLocalInt_726_ == 1) {
                                    int anLocalInt_740_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_740_ != 0)
                                        anLocalInts_725_[anLocalInt_724_] = anLocalInt_740_;
                                } else if (anLocalInt_726_ == 0) {
                                    int anLocalInt_741_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_741_ != 0) {
                                        if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                            int anLocalInt_742_ = (Class368_Sub2.anInt5693 >>> 24);
                                            int anLocalInt_743_ = 256 - anLocalInt_742_;
                                            int anLocalInt_744_ = (anLocalInts_725_[anLocalInt_724_]);
                                            anLocalInts_725_[anLocalInt_724_] = (((((anLocalInt_741_ & 0xff00ff) * anLocalInt_742_) + ((anLocalInt_744_ & 0xff00ff) * anLocalInt_743_)) & ~0xff00ff) + ((((anLocalInt_741_ & 0xff00) * anLocalInt_742_) + ((anLocalInt_744_ & 0xff00) * anLocalInt_743_)) & 0xff0000)) >> 8;
                                        } else if (Class368_Sub2.anInt5695 != 255) {
                                            int anLocalInt_745_ = (((anLocalInt_741_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_746_ = (((anLocalInt_741_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_747_ = (((anLocalInt_741_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInt_741_ = (anLocalInt_745_ | anLocalInt_746_ | anLocalInt_747_) >>> 8;
                                            int anLocalInt_748_ = (anLocalInts_725_[anLocalInt_724_]);
                                            anLocalInts_725_[anLocalInt_724_] = (((((anLocalInt_741_ & 0xff00ff) * (Class368_Sub2.anInt5695)) + ((anLocalInt_748_ & 0xff00ff) * (Class368_Sub2.anInt5711))) & ~0xff00ff) + ((((anLocalInt_741_ & 0xff00) * (Class368_Sub2.anInt5695)) + ((anLocalInt_748_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                        } else {
                                            int anLocalInt_749_ = (((anLocalInt_741_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                            int anLocalInt_750_ = (((anLocalInt_741_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                            int anLocalInt_751_ = (((anLocalInt_741_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                            anLocalInts_725_[anLocalInt_724_] = (anLocalInt_749_ | anLocalInt_750_ | anLocalInt_751_) >>> 8;
                                        }
                                    }
                                } else if (anLocalInt_726_ == 3) {
                                    int anLocalInt_752_ = (this.pixels[anLocalInt_723_]);
                                    int anLocalInt_753_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_754_ = anLocalInt_752_ + anLocalInt_753_;
                                    int anLocalInt_755_ = ((anLocalInt_752_ & 0xff00ff) + (anLocalInt_753_ & 0xff00ff));
                                    int anLocalInt_756_ = ((anLocalInt_755_ & 0x1000100) + (anLocalInt_754_ - anLocalInt_755_ & 0x10000));
                                    anLocalInt_756_ = (anLocalInt_754_ - anLocalInt_756_ | anLocalInt_756_ - (anLocalInt_756_ >>> 8));
                                    if (anLocalInt_752_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                        anLocalInt_752_ = anLocalInt_756_;
                                        anLocalInt_756_ = (anLocalInts_725_[anLocalInt_724_]);
                                        anLocalInt_756_ = (((((anLocalInt_752_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_756_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_752_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_756_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    }
                                    anLocalInts_725_[anLocalInt_724_] = anLocalInt_756_;
                                } else if (anLocalInt_726_ == 2) {
                                    int anLocalInt_757_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_757_ != 0) {
                                        int anLocalInt_758_ = (((anLocalInt_757_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_759_ = (((anLocalInt_757_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInts_725_[anLocalInt_724_++] = (((anLocalInt_758_ | anLocalInt_759_) >>> 8) + Class368_Sub2.anInt5697);
                                    }
                                } else
                                    throw new IllegalArgumentException();
                            } else if (anLocalInt_727_ == 2) {
                                if (anLocalInt_726_ == 1) {
                                    int anLocalInt_760_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_760_ != 0) {
                                        int anLocalInt_761_ = (anLocalInts_725_[anLocalInt_724_]);
                                        int anLocalInt_762_ = (anLocalInt_760_ + anLocalInt_761_);
                                        int anLocalInt_763_ = ((anLocalInt_760_ & 0xff00ff) + (anLocalInt_761_ & 0xff00ff));
                                        anLocalInt_761_ = ((anLocalInt_763_ & 0x1000100) + ((anLocalInt_762_ - anLocalInt_763_) & 0x10000));
                                        anLocalInts_725_[anLocalInt_724_] = ((anLocalInt_762_ - anLocalInt_761_) | (anLocalInt_761_ - (anLocalInt_761_ >>> 8)));
                                    }
                                } else if (anLocalInt_726_ == 0) {
                                    int anLocalInt_764_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_764_ != 0) {
                                        int anLocalInt_765_ = (((anLocalInt_764_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_766_ = (((anLocalInt_764_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_767_ = (((anLocalInt_764_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_764_ = (anLocalInt_765_ | anLocalInt_766_ | anLocalInt_767_) >>> 8;
                                        int anLocalInt_768_ = (anLocalInts_725_[anLocalInt_724_]);
                                        int anLocalInt_769_ = (anLocalInt_764_ + anLocalInt_768_);
                                        int anLocalInt_770_ = ((anLocalInt_764_ & 0xff00ff) + (anLocalInt_768_ & 0xff00ff));
                                        anLocalInt_768_ = ((anLocalInt_770_ & 0x1000100) + ((anLocalInt_769_ - anLocalInt_770_) & 0x10000));
                                        anLocalInts_725_[anLocalInt_724_] = ((anLocalInt_769_ - anLocalInt_768_) | (anLocalInt_768_ - (anLocalInt_768_ >>> 8)));
                                    }
                                } else if (anLocalInt_726_ == 3) {
                                    int anLocalInt_771_ = (this.pixels[anLocalInt_723_]);
                                    int anLocalInt_772_ = Class368_Sub2.anInt5693;
                                    int anLocalInt_773_ = anLocalInt_771_ + anLocalInt_772_;
                                    int anLocalInt_774_ = ((anLocalInt_771_ & 0xff00ff) + (anLocalInt_772_ & 0xff00ff));
                                    int anLocalInt_775_ = ((anLocalInt_774_ & 0x1000100) + (anLocalInt_773_ - anLocalInt_774_ & 0x10000));
                                    anLocalInt_771_ = (anLocalInt_773_ - anLocalInt_775_ | anLocalInt_775_ - (anLocalInt_775_ >>> 8));
                                    anLocalInt_775_ = anLocalInts_725_[anLocalInt_724_];
                                    anLocalInt_773_ = anLocalInt_771_ + anLocalInt_775_;
                                    anLocalInt_774_ = ((anLocalInt_771_ & 0xff00ff) + (anLocalInt_775_ & 0xff00ff));
                                    anLocalInt_775_ = ((anLocalInt_774_ & 0x1000100) + (anLocalInt_773_ - anLocalInt_774_ & 0x10000));
                                    anLocalInts_725_[anLocalInt_724_] = (anLocalInt_773_ - anLocalInt_775_ | anLocalInt_775_ - (anLocalInt_775_ >>> 8));
                                } else if (anLocalInt_726_ == 2) {
                                    int anLocalInt_776_ = (this.pixels[anLocalInt_723_]);
                                    if (anLocalInt_776_ != 0) {
                                        int anLocalInt_777_ = (((anLocalInt_776_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                        int anLocalInt_778_ = (((anLocalInt_776_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                        anLocalInt_776_ = (((anLocalInt_777_ | anLocalInt_778_) >>> 8) + Class368_Sub2.anInt5697);
                                        int anLocalInt_779_ = (anLocalInts_725_[anLocalInt_724_]);
                                        int anLocalInt_780_ = (anLocalInt_776_ + anLocalInt_779_);
                                        int anLocalInt_781_ = ((anLocalInt_776_ & 0xff00ff) + (anLocalInt_779_ & 0xff00ff));
                                        anLocalInt_779_ = ((anLocalInt_781_ & 0x1000100) + ((anLocalInt_780_ - anLocalInt_781_) & 0x10000));
                                        anLocalInts_725_[anLocalInt_724_] = ((anLocalInt_780_ - anLocalInt_779_) | (anLocalInt_779_ - (anLocalInt_779_ >>> 8)));
                                    }
                                }
                            } else
                                throw new IllegalArgumentException();
                            anLocalInt_719_ += Class368_Sub2.anInt5717;
                        }
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else if (Class368_Sub2.anInt5712 < 0) {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_782_ = Class368_Sub2.anInt5724;
                    int anLocalInt_783_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_784_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_785_ = Class368_Sub2.anInt5713;
                    int anLocalInt_786_;
                    if ((anLocalInt_786_ = anLocalInt_783_ - (this.width << 12)) >= 0) {
                        anLocalInt_786_ = ((Class368_Sub2.anInt5717 - anLocalInt_786_) / Class368_Sub2.anInt5717);
                        anLocalInt_785_ += anLocalInt_786_;
                        anLocalInt_783_ += Class368_Sub2.anInt5717 * anLocalInt_786_;
                        anLocalInt_784_ += Class368_Sub2.anInt5712 * anLocalInt_786_;
                        anLocalInt_782_ += anLocalInt_786_;
                    }
                    if ((anLocalInt_786_ = ((anLocalInt_783_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_785_)
                        anLocalInt_785_ = anLocalInt_786_;
                    if ((anLocalInt_786_ = anLocalInt_784_ - (this.height << 12)) >= 0) {
                        anLocalInt_786_ = ((Class368_Sub2.anInt5712 - anLocalInt_786_) / Class368_Sub2.anInt5712);
                        anLocalInt_785_ += anLocalInt_786_;
                        anLocalInt_783_ += Class368_Sub2.anInt5717 * anLocalInt_786_;
                        anLocalInt_784_ += Class368_Sub2.anInt5712 * anLocalInt_786_;
                        anLocalInt_782_ += anLocalInt_786_;
                    }
                    if ((anLocalInt_786_ = ((anLocalInt_784_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_785_)
                        anLocalInt_785_ = anLocalInt_786_;
                    for (/**/; anLocalInt_785_ < 0; anLocalInt_785_++) {
                        int anLocalInt_787_ = (((anLocalInt_784_ >> 12) * this.width) + (anLocalInt_783_ >> 12));
                        int anLocalInt_788_ = anLocalInt_782_++;
                        int[] anLocalInts_789_ = targetPixels;
                        int anLocalInt_790_ = argument_524_;
                        int anLocalInt_791_ = argument_525_;
                        if (anLocalInt_791_ == 0) {
                            if (anLocalInt_790_ == 1)
                                anLocalInts_789_[anLocalInt_788_] = (this.pixels[anLocalInt_787_]);
                            else if (anLocalInt_790_ == 0) {
                                int anLocalInt_792_ = (this.pixels[anLocalInt_787_++]);
                                int anLocalInt_793_ = (((anLocalInt_792_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                int anLocalInt_794_ = (((anLocalInt_792_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                int anLocalInt_795_ = (((anLocalInt_792_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                anLocalInts_789_[anLocalInt_788_] = (anLocalInt_793_ | anLocalInt_794_ | anLocalInt_795_) >>> 8;
                            } else if (anLocalInt_790_ == 3) {
                                int anLocalInt_796_ = (this.pixels[anLocalInt_787_++]);
                                int anLocalInt_797_ = Class368_Sub2.anInt5693;
                                int anLocalInt_798_ = anLocalInt_796_ + anLocalInt_797_;
                                int anLocalInt_799_ = ((anLocalInt_796_ & 0xff00ff) + (anLocalInt_797_ & 0xff00ff));
                                int anLocalInt_800_ = ((anLocalInt_799_ & 0x1000100) + (anLocalInt_798_ - anLocalInt_799_ & 0x10000));
                                anLocalInts_789_[anLocalInt_788_] = (anLocalInt_798_ - anLocalInt_800_ | anLocalInt_800_ - (anLocalInt_800_ >>> 8));
                            } else if (anLocalInt_790_ == 2) {
                                int anLocalInt_801_ = (this.pixels[anLocalInt_787_]);
                                int anLocalInt_802_ = (((anLocalInt_801_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_803_ = (((anLocalInt_801_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInts_789_[anLocalInt_788_] = ((anLocalInt_802_ | anLocalInt_803_) >>> 8) + Class368_Sub2.anInt5697;
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_791_ == 1) {
                            if (anLocalInt_790_ == 1) {
                                int anLocalInt_804_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_804_ != 0)
                                    anLocalInts_789_[anLocalInt_788_] = anLocalInt_804_;
                            } else if (anLocalInt_790_ == 0) {
                                int anLocalInt_805_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_805_ != 0) {
                                    if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                        int anLocalInt_806_ = Class368_Sub2.anInt5693 >>> 24;
                                        int anLocalInt_807_ = 256 - anLocalInt_806_;
                                        int anLocalInt_808_ = (anLocalInts_789_[anLocalInt_788_]);
                                        anLocalInts_789_[anLocalInt_788_] = (((((anLocalInt_805_ & 0xff00ff) * anLocalInt_806_) + ((anLocalInt_808_ & 0xff00ff) * anLocalInt_807_)) & ~0xff00ff) + ((((anLocalInt_805_ & 0xff00) * anLocalInt_806_) + ((anLocalInt_808_ & 0xff00) * anLocalInt_807_)) & 0xff0000)) >> 8;
                                    } else if (Class368_Sub2.anInt5695 != 255) {
                                        int anLocalInt_809_ = (((anLocalInt_805_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_810_ = (((anLocalInt_805_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_811_ = (((anLocalInt_805_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_805_ = (anLocalInt_809_ | anLocalInt_810_ | anLocalInt_811_) >>> 8;
                                        int anLocalInt_812_ = (anLocalInts_789_[anLocalInt_788_]);
                                        anLocalInts_789_[anLocalInt_788_] = (((((anLocalInt_805_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_812_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_805_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_812_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    } else {
                                        int anLocalInt_813_ = (((anLocalInt_805_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_814_ = (((anLocalInt_805_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_815_ = (((anLocalInt_805_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInts_789_[anLocalInt_788_] = (anLocalInt_813_ | anLocalInt_814_ | anLocalInt_815_) >>> 8;
                                    }
                                }
                            } else if (anLocalInt_790_ == 3) {
                                int anLocalInt_816_ = (this.pixels[anLocalInt_787_]);
                                int anLocalInt_817_ = Class368_Sub2.anInt5693;
                                int anLocalInt_818_ = anLocalInt_816_ + anLocalInt_817_;
                                int anLocalInt_819_ = ((anLocalInt_816_ & 0xff00ff) + (anLocalInt_817_ & 0xff00ff));
                                int anLocalInt_820_ = ((anLocalInt_819_ & 0x1000100) + (anLocalInt_818_ - anLocalInt_819_ & 0x10000));
                                anLocalInt_820_ = (anLocalInt_818_ - anLocalInt_820_ | anLocalInt_820_ - (anLocalInt_820_ >>> 8));
                                if (anLocalInt_816_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                    anLocalInt_816_ = anLocalInt_820_;
                                    anLocalInt_820_ = anLocalInts_789_[anLocalInt_788_];
                                    anLocalInt_820_ = (((((anLocalInt_816_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_820_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_816_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_820_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                                }
                                anLocalInts_789_[anLocalInt_788_] = anLocalInt_820_;
                            } else if (anLocalInt_790_ == 2) {
                                int anLocalInt_821_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_821_ != 0) {
                                    int anLocalInt_822_ = (((anLocalInt_821_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_823_ = (((anLocalInt_821_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_789_[anLocalInt_788_++] = ((anLocalInt_822_ | anLocalInt_823_) >>> 8) + Class368_Sub2.anInt5697;
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_791_ == 2) {
                            if (anLocalInt_790_ == 1) {
                                int anLocalInt_824_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_824_ != 0) {
                                    int anLocalInt_825_ = anLocalInts_789_[anLocalInt_788_];
                                    int anLocalInt_826_ = anLocalInt_824_ + anLocalInt_825_;
                                    int anLocalInt_827_ = ((anLocalInt_824_ & 0xff00ff) + (anLocalInt_825_ & 0xff00ff));
                                    anLocalInt_825_ = ((anLocalInt_827_ & 0x1000100) + (anLocalInt_826_ - anLocalInt_827_ & 0x10000));
                                    anLocalInts_789_[anLocalInt_788_] = (anLocalInt_826_ - anLocalInt_825_ | anLocalInt_825_ - (anLocalInt_825_ >>> 8));
                                }
                            } else if (anLocalInt_790_ == 0) {
                                int anLocalInt_828_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_828_ != 0) {
                                    int anLocalInt_829_ = (((anLocalInt_828_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_830_ = (((anLocalInt_828_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_831_ = (((anLocalInt_828_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInt_828_ = (anLocalInt_829_ | anLocalInt_830_ | anLocalInt_831_) >>> 8;
                                    int anLocalInt_832_ = anLocalInts_789_[anLocalInt_788_];
                                    int anLocalInt_833_ = anLocalInt_828_ + anLocalInt_832_;
                                    int anLocalInt_834_ = ((anLocalInt_828_ & 0xff00ff) + (anLocalInt_832_ & 0xff00ff));
                                    anLocalInt_832_ = ((anLocalInt_834_ & 0x1000100) + (anLocalInt_833_ - anLocalInt_834_ & 0x10000));
                                    anLocalInts_789_[anLocalInt_788_] = (anLocalInt_833_ - anLocalInt_832_ | anLocalInt_832_ - (anLocalInt_832_ >>> 8));
                                }
                            } else if (anLocalInt_790_ == 3) {
                                int anLocalInt_835_ = (this.pixels[anLocalInt_787_]);
                                int anLocalInt_836_ = Class368_Sub2.anInt5693;
                                int anLocalInt_837_ = anLocalInt_835_ + anLocalInt_836_;
                                int anLocalInt_838_ = ((anLocalInt_835_ & 0xff00ff) + (anLocalInt_836_ & 0xff00ff));
                                int anLocalInt_839_ = ((anLocalInt_838_ & 0x1000100) + (anLocalInt_837_ - anLocalInt_838_ & 0x10000));
                                anLocalInt_835_ = (anLocalInt_837_ - anLocalInt_839_ | anLocalInt_839_ - (anLocalInt_839_ >>> 8));
                                anLocalInt_839_ = anLocalInts_789_[anLocalInt_788_];
                                anLocalInt_837_ = anLocalInt_835_ + anLocalInt_839_;
                                anLocalInt_838_ = ((anLocalInt_835_ & 0xff00ff) + (anLocalInt_839_ & 0xff00ff));
                                anLocalInt_839_ = ((anLocalInt_838_ & 0x1000100) + (anLocalInt_837_ - anLocalInt_838_ & 0x10000));
                                anLocalInts_789_[anLocalInt_788_] = (anLocalInt_837_ - anLocalInt_839_ | anLocalInt_839_ - (anLocalInt_839_ >>> 8));
                            } else if (anLocalInt_790_ == 2) {
                                int anLocalInt_840_ = (this.pixels[anLocalInt_787_]);
                                if (anLocalInt_840_ != 0) {
                                    int anLocalInt_841_ = (((anLocalInt_840_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_842_ = (((anLocalInt_840_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInt_840_ = ((anLocalInt_841_ | anLocalInt_842_) >>> 8) + Class368_Sub2.anInt5697;
                                    int anLocalInt_843_ = anLocalInts_789_[anLocalInt_788_];
                                    int anLocalInt_844_ = anLocalInt_840_ + anLocalInt_843_;
                                    int anLocalInt_845_ = ((anLocalInt_840_ & 0xff00ff) + (anLocalInt_843_ & 0xff00ff));
                                    anLocalInt_843_ = ((anLocalInt_845_ & 0x1000100) + (anLocalInt_844_ - anLocalInt_845_ & 0x10000));
                                    anLocalInts_789_[anLocalInt_788_] = (anLocalInt_844_ - anLocalInt_843_ | anLocalInt_843_ - (anLocalInt_843_ >>> 8));
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        anLocalInt_783_ += Class368_Sub2.anInt5717;
                        anLocalInt_784_ += Class368_Sub2.anInt5712;
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            } else {
                int anLocalInt = Class368_Sub2.anInt5700;
                while (anLocalInt < 0) {
                    int anLocalInt_846_ = Class368_Sub2.anInt5724;
                    int anLocalInt_847_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                    int anLocalInt_848_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                    int anLocalInt_849_ = Class368_Sub2.anInt5713;
                    int anLocalInt_850_;
                    if ((anLocalInt_850_ = anLocalInt_847_ - (this.width << 12)) >= 0) {
                        anLocalInt_850_ = ((Class368_Sub2.anInt5717 - anLocalInt_850_) / Class368_Sub2.anInt5717);
                        anLocalInt_849_ += anLocalInt_850_;
                        anLocalInt_847_ += Class368_Sub2.anInt5717 * anLocalInt_850_;
                        anLocalInt_848_ += Class368_Sub2.anInt5712 * anLocalInt_850_;
                        anLocalInt_846_ += anLocalInt_850_;
                    }
                    if ((anLocalInt_850_ = ((anLocalInt_847_ - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_849_)
                        anLocalInt_849_ = anLocalInt_850_;
                    if (anLocalInt_848_ < 0) {
                        anLocalInt_850_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_848_) / Class368_Sub2.anInt5712);
                        anLocalInt_849_ += anLocalInt_850_;
                        anLocalInt_847_ += Class368_Sub2.anInt5717 * anLocalInt_850_;
                        anLocalInt_848_ += Class368_Sub2.anInt5712 * anLocalInt_850_;
                        anLocalInt_846_ += anLocalInt_850_;
                    }
                    if ((anLocalInt_850_ = ((anLocalInt_848_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_849_)
                        anLocalInt_849_ = anLocalInt_850_;
                    for (/**/; anLocalInt_849_ < 0; anLocalInt_849_++) {
                        int anLocalInt_851_ = (((anLocalInt_848_ >> 12) * this.width) + (anLocalInt_847_ >> 12));
                        int anLocalInt_852_ = anLocalInt_846_++;
                        int[] anLocalInts_853_ = targetPixels;
                        int anLocalInt_854_ = argument_524_;
                        int anLocalInt_855_ = argument_525_;
                        if (anLocalInt_855_ == 0) {
                            if (anLocalInt_854_ == 1)
                                anLocalInts_853_[anLocalInt_852_] = (this.pixels[anLocalInt_851_]);
                            else if (anLocalInt_854_ == 0) {
                                int anLocalInt_856_ = (this.pixels[anLocalInt_851_++]);
                                int anLocalInt_857_ = (((anLocalInt_856_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                int anLocalInt_858_ = (((anLocalInt_856_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                int anLocalInt_859_ = (((anLocalInt_856_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                anLocalInts_853_[anLocalInt_852_] = (anLocalInt_857_ | anLocalInt_858_ | anLocalInt_859_) >>> 8;
                            } else if (anLocalInt_854_ == 3) {
                                int anLocalInt_860_ = (this.pixels[anLocalInt_851_++]);
                                int anLocalInt_861_ = Class368_Sub2.anInt5693;
                                int anLocalInt_862_ = anLocalInt_860_ + anLocalInt_861_;
                                int anLocalInt_863_ = ((anLocalInt_860_ & 0xff00ff) + (anLocalInt_861_ & 0xff00ff));
                                int anLocalInt_864_ = ((anLocalInt_863_ & 0x1000100) + (anLocalInt_862_ - anLocalInt_863_ & 0x10000));
                                anLocalInts_853_[anLocalInt_852_] = (anLocalInt_862_ - anLocalInt_864_ | anLocalInt_864_ - (anLocalInt_864_ >>> 8));
                            } else if (anLocalInt_854_ == 2) {
                                int anLocalInt_865_ = (this.pixels[anLocalInt_851_]);
                                int anLocalInt_866_ = (((anLocalInt_865_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_867_ = (((anLocalInt_865_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInts_853_[anLocalInt_852_] = ((anLocalInt_866_ | anLocalInt_867_) >>> 8) + Class368_Sub2.anInt5697;
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_855_ == 1) {
                            if (anLocalInt_854_ == 1) {
                                int anLocalInt_868_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_868_ != 0)
                                    anLocalInts_853_[anLocalInt_852_] = anLocalInt_868_;
                            } else if (anLocalInt_854_ == 0) {
                                int anLocalInt_869_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_869_ != 0) {
                                    if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                        int anLocalInt_870_ = Class368_Sub2.anInt5693 >>> 24;
                                        int anLocalInt_871_ = 256 - anLocalInt_870_;
                                        int anLocalInt_872_ = (anLocalInts_853_[anLocalInt_852_]);
                                        anLocalInts_853_[anLocalInt_852_] = (((((anLocalInt_869_ & 0xff00ff) * anLocalInt_870_) + ((anLocalInt_872_ & 0xff00ff) * anLocalInt_871_)) & ~0xff00ff) + ((((anLocalInt_869_ & 0xff00) * anLocalInt_870_) + ((anLocalInt_872_ & 0xff00) * anLocalInt_871_)) & 0xff0000)) >> 8;
                                    } else if (Class368_Sub2.anInt5695 != 255) {
                                        int anLocalInt_873_ = (((anLocalInt_869_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_874_ = (((anLocalInt_869_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_875_ = (((anLocalInt_869_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_869_ = (anLocalInt_873_ | anLocalInt_874_ | anLocalInt_875_) >>> 8;
                                        int anLocalInt_876_ = (anLocalInts_853_[anLocalInt_852_]);
                                        anLocalInts_853_[anLocalInt_852_] = (((((anLocalInt_869_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_876_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_869_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_876_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    } else {
                                        int anLocalInt_877_ = (((anLocalInt_869_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_878_ = (((anLocalInt_869_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_879_ = (((anLocalInt_869_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInts_853_[anLocalInt_852_] = (anLocalInt_877_ | anLocalInt_878_ | anLocalInt_879_) >>> 8;
                                    }
                                }
                            } else if (anLocalInt_854_ == 3) {
                                int anLocalInt_880_ = (this.pixels[anLocalInt_851_]);
                                int anLocalInt_881_ = Class368_Sub2.anInt5693;
                                int anLocalInt_882_ = anLocalInt_880_ + anLocalInt_881_;
                                int anLocalInt_883_ = ((anLocalInt_880_ & 0xff00ff) + (anLocalInt_881_ & 0xff00ff));
                                int anLocalInt_884_ = ((anLocalInt_883_ & 0x1000100) + (anLocalInt_882_ - anLocalInt_883_ & 0x10000));
                                anLocalInt_884_ = (anLocalInt_882_ - anLocalInt_884_ | anLocalInt_884_ - (anLocalInt_884_ >>> 8));
                                if (anLocalInt_880_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                    anLocalInt_880_ = anLocalInt_884_;
                                    anLocalInt_884_ = anLocalInts_853_[anLocalInt_852_];
                                    anLocalInt_884_ = (((((anLocalInt_880_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_884_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_880_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_884_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                                }
                                anLocalInts_853_[anLocalInt_852_] = anLocalInt_884_;
                            } else if (anLocalInt_854_ == 2) {
                                int anLocalInt_885_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_885_ != 0) {
                                    int anLocalInt_886_ = (((anLocalInt_885_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_887_ = (((anLocalInt_885_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_853_[anLocalInt_852_++] = ((anLocalInt_886_ | anLocalInt_887_) >>> 8) + Class368_Sub2.anInt5697;
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_855_ == 2) {
                            if (anLocalInt_854_ == 1) {
                                int anLocalInt_888_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_888_ != 0) {
                                    int anLocalInt_889_ = anLocalInts_853_[anLocalInt_852_];
                                    int anLocalInt_890_ = anLocalInt_888_ + anLocalInt_889_;
                                    int anLocalInt_891_ = ((anLocalInt_888_ & 0xff00ff) + (anLocalInt_889_ & 0xff00ff));
                                    anLocalInt_889_ = ((anLocalInt_891_ & 0x1000100) + (anLocalInt_890_ - anLocalInt_891_ & 0x10000));
                                    anLocalInts_853_[anLocalInt_852_] = (anLocalInt_890_ - anLocalInt_889_ | anLocalInt_889_ - (anLocalInt_889_ >>> 8));
                                }
                            } else if (anLocalInt_854_ == 0) {
                                int anLocalInt_892_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_892_ != 0) {
                                    int anLocalInt_893_ = (((anLocalInt_892_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_894_ = (((anLocalInt_892_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_895_ = (((anLocalInt_892_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInt_892_ = (anLocalInt_893_ | anLocalInt_894_ | anLocalInt_895_) >>> 8;
                                    int anLocalInt_896_ = anLocalInts_853_[anLocalInt_852_];
                                    int anLocalInt_897_ = anLocalInt_892_ + anLocalInt_896_;
                                    int anLocalInt_898_ = ((anLocalInt_892_ & 0xff00ff) + (anLocalInt_896_ & 0xff00ff));
                                    anLocalInt_896_ = ((anLocalInt_898_ & 0x1000100) + (anLocalInt_897_ - anLocalInt_898_ & 0x10000));
                                    anLocalInts_853_[anLocalInt_852_] = (anLocalInt_897_ - anLocalInt_896_ | anLocalInt_896_ - (anLocalInt_896_ >>> 8));
                                }
                            } else if (anLocalInt_854_ == 3) {
                                int anLocalInt_899_ = (this.pixels[anLocalInt_851_]);
                                int anLocalInt_900_ = Class368_Sub2.anInt5693;
                                int anLocalInt_901_ = anLocalInt_899_ + anLocalInt_900_;
                                int anLocalInt_902_ = ((anLocalInt_899_ & 0xff00ff) + (anLocalInt_900_ & 0xff00ff));
                                int anLocalInt_903_ = ((anLocalInt_902_ & 0x1000100) + (anLocalInt_901_ - anLocalInt_902_ & 0x10000));
                                anLocalInt_899_ = (anLocalInt_901_ - anLocalInt_903_ | anLocalInt_903_ - (anLocalInt_903_ >>> 8));
                                anLocalInt_903_ = anLocalInts_853_[anLocalInt_852_];
                                anLocalInt_901_ = anLocalInt_899_ + anLocalInt_903_;
                                anLocalInt_902_ = ((anLocalInt_899_ & 0xff00ff) + (anLocalInt_903_ & 0xff00ff));
                                anLocalInt_903_ = ((anLocalInt_902_ & 0x1000100) + (anLocalInt_901_ - anLocalInt_902_ & 0x10000));
                                anLocalInts_853_[anLocalInt_852_] = (anLocalInt_901_ - anLocalInt_903_ | anLocalInt_903_ - (anLocalInt_903_ >>> 8));
                            } else if (anLocalInt_854_ == 2) {
                                int anLocalInt_904_ = (this.pixels[anLocalInt_851_]);
                                if (anLocalInt_904_ != 0) {
                                    int anLocalInt_905_ = (((anLocalInt_904_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_906_ = (((anLocalInt_904_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInt_904_ = ((anLocalInt_905_ | anLocalInt_906_) >>> 8) + Class368_Sub2.anInt5697;
                                    int anLocalInt_907_ = anLocalInts_853_[anLocalInt_852_];
                                    int anLocalInt_908_ = anLocalInt_904_ + anLocalInt_907_;
                                    int anLocalInt_909_ = ((anLocalInt_904_ & 0xff00ff) + (anLocalInt_907_ & 0xff00ff));
                                    anLocalInt_907_ = ((anLocalInt_909_ & 0x1000100) + (anLocalInt_908_ - anLocalInt_909_ & 0x10000));
                                    anLocalInts_853_[anLocalInt_852_] = (anLocalInt_908_ - anLocalInt_907_ | anLocalInt_907_ - (anLocalInt_907_ >>> 8));
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        anLocalInt_847_ += Class368_Sub2.anInt5717;
                        anLocalInt_848_ += Class368_Sub2.anInt5712;
                    }
                    anLocalInt++;
                    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
                }
            }
        } else if (Class368_Sub2.anInt5712 == 0) {
            int anLocalInt = Class368_Sub2.anInt5700;
            while (anLocalInt < 0) {
                int anLocalInt_910_ = Class368_Sub2.anInt5724;
                int anLocalInt_911_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                int anLocalInt_912_ = Class368_Sub2.anInt5704;
                int anLocalInt_913_ = Class368_Sub2.anInt5713;
                if (anLocalInt_912_ >= 0 && anLocalInt_912_ - (this.height << 12) < 0) {
                    if (anLocalInt_911_ < 0) {
                        int anLocalInt_914_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_911_) / Class368_Sub2.anInt5717);
                        anLocalInt_913_ += anLocalInt_914_;
                        anLocalInt_911_ += Class368_Sub2.anInt5717 * anLocalInt_914_;
                        anLocalInt_910_ += anLocalInt_914_;
                    }
                    int anLocalInt_915_;
                    if ((anLocalInt_915_ = ((anLocalInt_911_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)) > anLocalInt_913_)
                        anLocalInt_913_ = anLocalInt_915_;
                    for (/**/; anLocalInt_913_ < 0; anLocalInt_913_++) {
                        int anLocalInt_916_ = (((anLocalInt_912_ >> 12) * this.width) + (anLocalInt_911_ >> 12));
                        int anLocalInt_917_ = anLocalInt_910_++;
                        int[] anLocalInts_918_ = targetPixels;
                        int anLocalInt_919_ = argument_524_;
                        int anLocalInt_920_ = argument_525_;
                        if (anLocalInt_920_ == 0) {
                            if (anLocalInt_919_ == 1)
                                anLocalInts_918_[anLocalInt_917_] = (this.pixels[anLocalInt_916_]);
                            else if (anLocalInt_919_ == 0) {
                                int anLocalInt_921_ = (this.pixels[anLocalInt_916_++]);
                                int anLocalInt_922_ = (((anLocalInt_921_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                int anLocalInt_923_ = (((anLocalInt_921_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                int anLocalInt_924_ = (((anLocalInt_921_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                anLocalInts_918_[anLocalInt_917_] = (anLocalInt_922_ | anLocalInt_923_ | anLocalInt_924_) >>> 8;
                            } else if (anLocalInt_919_ == 3) {
                                int anLocalInt_925_ = (this.pixels[anLocalInt_916_++]);
                                int anLocalInt_926_ = Class368_Sub2.anInt5693;
                                int anLocalInt_927_ = anLocalInt_925_ + anLocalInt_926_;
                                int anLocalInt_928_ = ((anLocalInt_925_ & 0xff00ff) + (anLocalInt_926_ & 0xff00ff));
                                int anLocalInt_929_ = ((anLocalInt_928_ & 0x1000100) + (anLocalInt_927_ - anLocalInt_928_ & 0x10000));
                                anLocalInts_918_[anLocalInt_917_] = (anLocalInt_927_ - anLocalInt_929_ | anLocalInt_929_ - (anLocalInt_929_ >>> 8));
                            } else if (anLocalInt_919_ == 2) {
                                int anLocalInt_930_ = (this.pixels[anLocalInt_916_]);
                                int anLocalInt_931_ = (((anLocalInt_930_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_932_ = (((anLocalInt_930_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInts_918_[anLocalInt_917_] = ((anLocalInt_931_ | anLocalInt_932_) >>> 8) + Class368_Sub2.anInt5697;
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_920_ == 1) {
                            if (anLocalInt_919_ == 1) {
                                int anLocalInt_933_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_933_ != 0)
                                    anLocalInts_918_[anLocalInt_917_] = anLocalInt_933_;
                            } else if (anLocalInt_919_ == 0) {
                                int anLocalInt_934_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_934_ != 0) {
                                    if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                        int anLocalInt_935_ = Class368_Sub2.anInt5693 >>> 24;
                                        int anLocalInt_936_ = 256 - anLocalInt_935_;
                                        int anLocalInt_937_ = (anLocalInts_918_[anLocalInt_917_]);
                                        anLocalInts_918_[anLocalInt_917_] = (((((anLocalInt_934_ & 0xff00ff) * anLocalInt_935_) + ((anLocalInt_937_ & 0xff00ff) * anLocalInt_936_)) & ~0xff00ff) + ((((anLocalInt_934_ & 0xff00) * anLocalInt_935_) + ((anLocalInt_937_ & 0xff00) * anLocalInt_936_)) & 0xff0000)) >> 8;
                                    } else if (Class368_Sub2.anInt5695 != 255) {
                                        int anLocalInt_938_ = (((anLocalInt_934_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_939_ = (((anLocalInt_934_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_940_ = (((anLocalInt_934_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInt_934_ = (anLocalInt_938_ | anLocalInt_939_ | anLocalInt_940_) >>> 8;
                                        int anLocalInt_941_ = (anLocalInts_918_[anLocalInt_917_]);
                                        anLocalInts_918_[anLocalInt_917_] = (((((anLocalInt_934_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_941_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_934_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_941_ & 0xff00) * (Class368_Sub2.anInt5711))) & 0xff0000)) >> 8;
                                    } else {
                                        int anLocalInt_942_ = (((anLocalInt_934_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                        int anLocalInt_943_ = (((anLocalInt_934_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                        int anLocalInt_944_ = (((anLocalInt_934_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                        anLocalInts_918_[anLocalInt_917_] = (anLocalInt_942_ | anLocalInt_943_ | anLocalInt_944_) >>> 8;
                                    }
                                }
                            } else if (anLocalInt_919_ == 3) {
                                int anLocalInt_945_ = (this.pixels[anLocalInt_916_]);
                                int anLocalInt_946_ = Class368_Sub2.anInt5693;
                                int anLocalInt_947_ = anLocalInt_945_ + anLocalInt_946_;
                                int anLocalInt_948_ = ((anLocalInt_945_ & 0xff00ff) + (anLocalInt_946_ & 0xff00ff));
                                int anLocalInt_949_ = ((anLocalInt_948_ & 0x1000100) + (anLocalInt_947_ - anLocalInt_948_ & 0x10000));
                                anLocalInt_949_ = (anLocalInt_947_ - anLocalInt_949_ | anLocalInt_949_ - (anLocalInt_949_ >>> 8));
                                if (anLocalInt_945_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                    anLocalInt_945_ = anLocalInt_949_;
                                    anLocalInt_949_ = anLocalInts_918_[anLocalInt_917_];
                                    anLocalInt_949_ = (((((anLocalInt_945_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_949_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_945_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_949_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                                }
                                anLocalInts_918_[anLocalInt_917_] = anLocalInt_949_;
                            } else if (anLocalInt_919_ == 2) {
                                int anLocalInt_950_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_950_ != 0) {
                                    int anLocalInt_951_ = (((anLocalInt_950_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_952_ = (((anLocalInt_950_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInts_918_[anLocalInt_917_++] = ((anLocalInt_951_ | anLocalInt_952_) >>> 8) + Class368_Sub2.anInt5697;
                                }
                            } else
                                throw new IllegalArgumentException();
                        } else if (anLocalInt_920_ == 2) {
                            if (anLocalInt_919_ == 1) {
                                int anLocalInt_953_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_953_ != 0) {
                                    int anLocalInt_954_ = anLocalInts_918_[anLocalInt_917_];
                                    int anLocalInt_955_ = anLocalInt_953_ + anLocalInt_954_;
                                    int anLocalInt_956_ = ((anLocalInt_953_ & 0xff00ff) + (anLocalInt_954_ & 0xff00ff));
                                    anLocalInt_954_ = ((anLocalInt_956_ & 0x1000100) + (anLocalInt_955_ - anLocalInt_956_ & 0x10000));
                                    anLocalInts_918_[anLocalInt_917_] = (anLocalInt_955_ - anLocalInt_954_ | anLocalInt_954_ - (anLocalInt_954_ >>> 8));
                                }
                            } else if (anLocalInt_919_ == 0) {
                                int anLocalInt_957_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_957_ != 0) {
                                    int anLocalInt_958_ = (((anLocalInt_957_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_959_ = (((anLocalInt_957_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_960_ = (((anLocalInt_957_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInt_957_ = (anLocalInt_958_ | anLocalInt_959_ | anLocalInt_960_) >>> 8;
                                    int anLocalInt_961_ = anLocalInts_918_[anLocalInt_917_];
                                    int anLocalInt_962_ = anLocalInt_957_ + anLocalInt_961_;
                                    int anLocalInt_963_ = ((anLocalInt_957_ & 0xff00ff) + (anLocalInt_961_ & 0xff00ff));
                                    anLocalInt_961_ = ((anLocalInt_963_ & 0x1000100) + (anLocalInt_962_ - anLocalInt_963_ & 0x10000));
                                    anLocalInts_918_[anLocalInt_917_] = (anLocalInt_962_ - anLocalInt_961_ | anLocalInt_961_ - (anLocalInt_961_ >>> 8));
                                }
                            } else if (anLocalInt_919_ == 3) {
                                int anLocalInt_964_ = (this.pixels[anLocalInt_916_]);
                                int anLocalInt_965_ = Class368_Sub2.anInt5693;
                                int anLocalInt_966_ = anLocalInt_964_ + anLocalInt_965_;
                                int anLocalInt_967_ = ((anLocalInt_964_ & 0xff00ff) + (anLocalInt_965_ & 0xff00ff));
                                int anLocalInt_968_ = ((anLocalInt_967_ & 0x1000100) + (anLocalInt_966_ - anLocalInt_967_ & 0x10000));
                                anLocalInt_964_ = (anLocalInt_966_ - anLocalInt_968_ | anLocalInt_968_ - (anLocalInt_968_ >>> 8));
                                anLocalInt_968_ = anLocalInts_918_[anLocalInt_917_];
                                anLocalInt_966_ = anLocalInt_964_ + anLocalInt_968_;
                                anLocalInt_967_ = ((anLocalInt_964_ & 0xff00ff) + (anLocalInt_968_ & 0xff00ff));
                                anLocalInt_968_ = ((anLocalInt_967_ & 0x1000100) + (anLocalInt_966_ - anLocalInt_967_ & 0x10000));
                                anLocalInts_918_[anLocalInt_917_] = (anLocalInt_966_ - anLocalInt_968_ | anLocalInt_968_ - (anLocalInt_968_ >>> 8));
                            } else if (anLocalInt_919_ == 2) {
                                int anLocalInt_969_ = (this.pixels[anLocalInt_916_]);
                                if (anLocalInt_969_ != 0) {
                                    int anLocalInt_970_ = (((anLocalInt_969_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                    int anLocalInt_971_ = (((anLocalInt_969_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                    anLocalInt_969_ = ((anLocalInt_970_ | anLocalInt_971_) >>> 8) + Class368_Sub2.anInt5697;
                                    int anLocalInt_972_ = anLocalInts_918_[anLocalInt_917_];
                                    int anLocalInt_973_ = anLocalInt_969_ + anLocalInt_972_;
                                    int anLocalInt_974_ = ((anLocalInt_969_ & 0xff00ff) + (anLocalInt_972_ & 0xff00ff));
                                    anLocalInt_972_ = ((anLocalInt_974_ & 0x1000100) + (anLocalInt_973_ - anLocalInt_974_ & 0x10000));
                                    anLocalInts_918_[anLocalInt_917_] = (anLocalInt_973_ - anLocalInt_972_ | anLocalInt_972_ - (anLocalInt_972_ >>> 8));
                                }
                            }
                        } else
                            throw new IllegalArgumentException();
                        anLocalInt_911_ += Class368_Sub2.anInt5717;
                    }
                }
                anLocalInt++;
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        } else if (Class368_Sub2.anInt5712 < 0) {
            for (int anLocalInt = Class368_Sub2.anInt5700; anLocalInt < 0; anLocalInt++) {
                int anLocalInt_975_ = Class368_Sub2.anInt5724;
                int anLocalInt_976_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                int anLocalInt_977_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                int anLocalInt_978_ = Class368_Sub2.anInt5713;
                if (anLocalInt_976_ < 0) {
                    int anLocalInt_979_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_976_) / Class368_Sub2.anInt5717);
                    anLocalInt_978_ += anLocalInt_979_;
                    anLocalInt_976_ += Class368_Sub2.anInt5717 * anLocalInt_979_;
                    anLocalInt_977_ += Class368_Sub2.anInt5712 * anLocalInt_979_;
                    anLocalInt_975_ += anLocalInt_979_;
                }
                int anLocalInt_980_;
                if ((anLocalInt_980_ = (anLocalInt_976_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717) > anLocalInt_978_)
                    anLocalInt_978_ = anLocalInt_980_;
                if ((anLocalInt_980_ = anLocalInt_977_ - (this.height << 12)) >= 0) {
                    anLocalInt_980_ = ((Class368_Sub2.anInt5712 - anLocalInt_980_) / Class368_Sub2.anInt5712);
                    anLocalInt_978_ += anLocalInt_980_;
                    anLocalInt_976_ += Class368_Sub2.anInt5717 * anLocalInt_980_;
                    anLocalInt_977_ += Class368_Sub2.anInt5712 * anLocalInt_980_;
                    anLocalInt_975_ += anLocalInt_980_;
                }
                if ((anLocalInt_980_ = ((anLocalInt_977_ - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)) > anLocalInt_978_)
                    anLocalInt_978_ = anLocalInt_980_;
                for (/**/; anLocalInt_978_ < 0; anLocalInt_978_++) {
                    int anLocalInt_981_ = (((anLocalInt_977_ >> 12) * this.width) + (anLocalInt_976_ >> 12));
                    int anLocalInt_982_ = anLocalInt_975_++;
                    int[] anLocalInts_983_ = targetPixels;
                    int anLocalInt_984_ = argument_524_;
                    int anLocalInt_985_ = argument_525_;
                    if (anLocalInt_985_ == 0) {
                        if (anLocalInt_984_ == 1)
                            anLocalInts_983_[anLocalInt_982_] = (this.pixels[anLocalInt_981_]);
                        else if (anLocalInt_984_ == 0) {
                            int anLocalInt_986_ = (this.pixels[anLocalInt_981_++]);
                            int anLocalInt_987_ = (((anLocalInt_986_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                            int anLocalInt_988_ = (((anLocalInt_986_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                            int anLocalInt_989_ = (((anLocalInt_986_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                            anLocalInts_983_[anLocalInt_982_] = (anLocalInt_987_ | anLocalInt_988_ | anLocalInt_989_) >>> 8;
                        } else if (anLocalInt_984_ == 3) {
                            int anLocalInt_990_ = (this.pixels[anLocalInt_981_++]);
                            int anLocalInt_991_ = Class368_Sub2.anInt5693;
                            int anLocalInt_992_ = anLocalInt_990_ + anLocalInt_991_;
                            int anLocalInt_993_ = ((anLocalInt_990_ & 0xff00ff) + (anLocalInt_991_ & 0xff00ff));
                            int anLocalInt_994_ = ((anLocalInt_993_ & 0x1000100) + (anLocalInt_992_ - anLocalInt_993_ & 0x10000));
                            anLocalInts_983_[anLocalInt_982_] = (anLocalInt_992_ - anLocalInt_994_ | anLocalInt_994_ - (anLocalInt_994_ >>> 8));
                        } else if (anLocalInt_984_ == 2) {
                            int anLocalInt_995_ = (this.pixels[anLocalInt_981_]);
                            int anLocalInt_996_ = (((anLocalInt_995_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                            int anLocalInt_997_ = (((anLocalInt_995_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                            anLocalInts_983_[anLocalInt_982_] = (((anLocalInt_996_ | anLocalInt_997_) >>> 8) + Class368_Sub2.anInt5697);
                        } else
                            throw new IllegalArgumentException();
                    } else if (anLocalInt_985_ == 1) {
                        if (anLocalInt_984_ == 1) {
                            int anLocalInt_998_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_998_ != 0)
                                anLocalInts_983_[anLocalInt_982_] = anLocalInt_998_;
                        } else if (anLocalInt_984_ == 0) {
                            int anLocalInt_999_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_999_ != 0) {
                                if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                    int anLocalInt_1000_ = Class368_Sub2.anInt5693 >>> 24;
                                    int anLocalInt_1001_ = 256 - anLocalInt_1000_;
                                    int anLocalInt_1002_ = anLocalInts_983_[anLocalInt_982_];
                                    anLocalInts_983_[anLocalInt_982_] = (((((anLocalInt_999_ & 0xff00ff) * anLocalInt_1000_) + ((anLocalInt_1002_ & 0xff00ff) * anLocalInt_1001_)) & ~0xff00ff) + ((((anLocalInt_999_ & 0xff00) * anLocalInt_1000_) + ((anLocalInt_1002_ & 0xff00) * anLocalInt_1001_)) & 0xff0000)) >> 8;
                                } else if (Class368_Sub2.anInt5695 != 255) {
                                    int anLocalInt_1003_ = (((anLocalInt_999_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_1004_ = (((anLocalInt_999_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_1005_ = (((anLocalInt_999_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInt_999_ = (anLocalInt_1003_ | anLocalInt_1004_ | anLocalInt_1005_) >>> 8;
                                    int anLocalInt_1006_ = anLocalInts_983_[anLocalInt_982_];
                                    anLocalInts_983_[anLocalInt_982_] = (((((anLocalInt_999_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_1006_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_999_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_1006_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                                } else {
                                    int anLocalInt_1007_ = (((anLocalInt_999_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_1008_ = (((anLocalInt_999_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_1009_ = (((anLocalInt_999_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInts_983_[anLocalInt_982_] = (anLocalInt_1007_ | anLocalInt_1008_ | anLocalInt_1009_) >>> 8;
                                }
                            }
                        } else if (anLocalInt_984_ == 3) {
                            int anLocalInt_1010_ = (this.pixels[anLocalInt_981_]);
                            int anLocalInt_1011_ = Class368_Sub2.anInt5693;
                            int anLocalInt_1012_ = anLocalInt_1010_ + anLocalInt_1011_;
                            int anLocalInt_1013_ = ((anLocalInt_1010_ & 0xff00ff) + (anLocalInt_1011_ & 0xff00ff));
                            int anLocalInt_1014_ = ((anLocalInt_1013_ & 0x1000100) + (anLocalInt_1012_ - anLocalInt_1013_ & 0x10000));
                            anLocalInt_1014_ = (anLocalInt_1012_ - anLocalInt_1014_ | anLocalInt_1014_ - (anLocalInt_1014_ >>> 8));
                            if (anLocalInt_1010_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                anLocalInt_1010_ = anLocalInt_1014_;
                                anLocalInt_1014_ = anLocalInts_983_[anLocalInt_982_];
                                anLocalInt_1014_ = (((((anLocalInt_1010_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_1014_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_1010_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_1014_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                            }
                            anLocalInts_983_[anLocalInt_982_] = anLocalInt_1014_;
                        } else if (anLocalInt_984_ == 2) {
                            int anLocalInt_1015_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_1015_ != 0) {
                                int anLocalInt_1016_ = (((anLocalInt_1015_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_1017_ = (((anLocalInt_1015_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInts_983_[anLocalInt_982_++] = ((anLocalInt_1016_ | anLocalInt_1017_) >>> 8) + Class368_Sub2.anInt5697;
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (anLocalInt_985_ == 2) {
                        if (anLocalInt_984_ == 1) {
                            int anLocalInt_1018_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_1018_ != 0) {
                                int anLocalInt_1019_ = anLocalInts_983_[anLocalInt_982_];
                                int anLocalInt_1020_ = anLocalInt_1018_ + anLocalInt_1019_;
                                int anLocalInt_1021_ = ((anLocalInt_1018_ & 0xff00ff) + (anLocalInt_1019_ & 0xff00ff));
                                anLocalInt_1019_ = ((anLocalInt_1021_ & 0x1000100) + (anLocalInt_1020_ - anLocalInt_1021_ & 0x10000));
                                anLocalInts_983_[anLocalInt_982_] = (anLocalInt_1020_ - anLocalInt_1019_ | anLocalInt_1019_ - (anLocalInt_1019_ >>> 8));
                            }
                        } else if (anLocalInt_984_ == 0) {
                            int anLocalInt_1022_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_1022_ != 0) {
                                int anLocalInt_1023_ = (((anLocalInt_1022_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                int anLocalInt_1024_ = (((anLocalInt_1022_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                int anLocalInt_1025_ = (((anLocalInt_1022_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                anLocalInt_1022_ = (anLocalInt_1023_ | anLocalInt_1024_ | anLocalInt_1025_) >>> 8;
                                int anLocalInt_1026_ = anLocalInts_983_[anLocalInt_982_];
                                int anLocalInt_1027_ = anLocalInt_1022_ + anLocalInt_1026_;
                                int anLocalInt_1028_ = ((anLocalInt_1022_ & 0xff00ff) + (anLocalInt_1026_ & 0xff00ff));
                                anLocalInt_1026_ = ((anLocalInt_1028_ & 0x1000100) + (anLocalInt_1027_ - anLocalInt_1028_ & 0x10000));
                                anLocalInts_983_[anLocalInt_982_] = (anLocalInt_1027_ - anLocalInt_1026_ | anLocalInt_1026_ - (anLocalInt_1026_ >>> 8));
                            }
                        } else if (anLocalInt_984_ == 3) {
                            int anLocalInt_1029_ = (this.pixels[anLocalInt_981_]);
                            int anLocalInt_1030_ = Class368_Sub2.anInt5693;
                            int anLocalInt_1031_ = anLocalInt_1029_ + anLocalInt_1030_;
                            int anLocalInt_1032_ = ((anLocalInt_1029_ & 0xff00ff) + (anLocalInt_1030_ & 0xff00ff));
                            int anLocalInt_1033_ = ((anLocalInt_1032_ & 0x1000100) + (anLocalInt_1031_ - anLocalInt_1032_ & 0x10000));
                            anLocalInt_1029_ = (anLocalInt_1031_ - anLocalInt_1033_ | anLocalInt_1033_ - (anLocalInt_1033_ >>> 8));
                            anLocalInt_1033_ = anLocalInts_983_[anLocalInt_982_];
                            anLocalInt_1031_ = anLocalInt_1029_ + anLocalInt_1033_;
                            anLocalInt_1032_ = ((anLocalInt_1029_ & 0xff00ff) + (anLocalInt_1033_ & 0xff00ff));
                            anLocalInt_1033_ = ((anLocalInt_1032_ & 0x1000100) + (anLocalInt_1031_ - anLocalInt_1032_ & 0x10000));
                            anLocalInts_983_[anLocalInt_982_] = (anLocalInt_1031_ - anLocalInt_1033_ | anLocalInt_1033_ - (anLocalInt_1033_ >>> 8));
                        } else if (anLocalInt_984_ == 2) {
                            int anLocalInt_1034_ = (this.pixels[anLocalInt_981_]);
                            if (anLocalInt_1034_ != 0) {
                                int anLocalInt_1035_ = (((anLocalInt_1034_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_1036_ = (((anLocalInt_1034_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInt_1034_ = ((anLocalInt_1035_ | anLocalInt_1036_) >>> 8) + Class368_Sub2.anInt5697;
                                int anLocalInt_1037_ = anLocalInts_983_[anLocalInt_982_];
                                int anLocalInt_1038_ = anLocalInt_1034_ + anLocalInt_1037_;
                                int anLocalInt_1039_ = ((anLocalInt_1034_ & 0xff00ff) + (anLocalInt_1037_ & 0xff00ff));
                                anLocalInt_1037_ = ((anLocalInt_1039_ & 0x1000100) + (anLocalInt_1038_ - anLocalInt_1039_ & 0x10000));
                                anLocalInts_983_[anLocalInt_982_] = (anLocalInt_1038_ - anLocalInt_1037_ | anLocalInt_1037_ - (anLocalInt_1037_ >>> 8));
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    anLocalInt_976_ += Class368_Sub2.anInt5717;
                    anLocalInt_977_ += Class368_Sub2.anInt5712;
                }
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        } else {
            for (int anLocalInt = Class368_Sub2.anInt5700; anLocalInt < 0; anLocalInt++) {
                int anLocalInt_1040_ = Class368_Sub2.anInt5724;
                int anLocalInt_1041_ = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
                int anLocalInt_1042_ = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
                int anLocalInt_1043_ = Class368_Sub2.anInt5713;
                if (anLocalInt_1041_ < 0) {
                    int anLocalInt_1044_ = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_1041_) / Class368_Sub2.anInt5717);
                    anLocalInt_1043_ += anLocalInt_1044_;
                    anLocalInt_1041_ += Class368_Sub2.anInt5717 * anLocalInt_1044_;
                    anLocalInt_1042_ += Class368_Sub2.anInt5712 * anLocalInt_1044_;
                    anLocalInt_1040_ += anLocalInt_1044_;
                }
                int anLocalInt_1045_;
                if ((anLocalInt_1045_ = (anLocalInt_1041_ + 1 - (this.width << 12) - Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717) > anLocalInt_1043_)
                    anLocalInt_1043_ = anLocalInt_1045_;
                if (anLocalInt_1042_ < 0) {
                    anLocalInt_1045_ = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_1042_) / Class368_Sub2.anInt5712);
                    anLocalInt_1043_ += anLocalInt_1045_;
                    anLocalInt_1041_ += Class368_Sub2.anInt5717 * anLocalInt_1045_;
                    anLocalInt_1042_ += Class368_Sub2.anInt5712 * anLocalInt_1045_;
                    anLocalInt_1040_ += anLocalInt_1045_;
                }
                if ((anLocalInt_1045_ = (anLocalInt_1042_ + 1 - (this.height << 12) - Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712) > anLocalInt_1043_)
                    anLocalInt_1043_ = anLocalInt_1045_;
                for (/**/; anLocalInt_1043_ < 0; anLocalInt_1043_++) {
                    int anLocalInt_1046_ = (((anLocalInt_1042_ >> 12) * this.width) + (anLocalInt_1041_ >> 12));
                    int anLocalInt_1047_ = anLocalInt_1040_++;
                    int[] anLocalInts_1048_ = targetPixels;
                    int anLocalInt_1049_ = argument_524_;
                    int anLocalInt_1050_ = argument_525_;
                    if (anLocalInt_1050_ == 0) {
                        if (anLocalInt_1049_ == 1)
                            anLocalInts_1048_[anLocalInt_1047_] = (this.pixels[anLocalInt_1046_]);
                        else if (anLocalInt_1049_ == 0) {
                            int anLocalInt_1051_ = (this.pixels[anLocalInt_1046_++]);
                            int anLocalInt_1052_ = (((anLocalInt_1051_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                            int anLocalInt_1053_ = (((anLocalInt_1051_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                            int anLocalInt_1054_ = (((anLocalInt_1051_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                            anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1052_ | anLocalInt_1053_ | anLocalInt_1054_) >>> 8;
                        } else if (anLocalInt_1049_ == 3) {
                            int anLocalInt_1055_ = (this.pixels[anLocalInt_1046_++]);
                            int anLocalInt_1056_ = Class368_Sub2.anInt5693;
                            int anLocalInt_1057_ = anLocalInt_1055_ + anLocalInt_1056_;
                            int anLocalInt_1058_ = ((anLocalInt_1055_ & 0xff00ff) + (anLocalInt_1056_ & 0xff00ff));
                            int anLocalInt_1059_ = ((anLocalInt_1058_ & 0x1000100) + (anLocalInt_1057_ - anLocalInt_1058_ & 0x10000));
                            anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1057_ - anLocalInt_1059_ | anLocalInt_1059_ - (anLocalInt_1059_ >>> 8));
                        } else if (anLocalInt_1049_ == 2) {
                            int anLocalInt_1060_ = (this.pixels[anLocalInt_1046_]);
                            int anLocalInt_1061_ = (((anLocalInt_1060_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                            int anLocalInt_1062_ = (((anLocalInt_1060_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                            anLocalInts_1048_[anLocalInt_1047_] = ((anLocalInt_1061_ | anLocalInt_1062_) >>> 8) + Class368_Sub2.anInt5697;
                        } else
                            throw new IllegalArgumentException();
                    } else if (anLocalInt_1050_ == 1) {
                        if (anLocalInt_1049_ == 1) {
                            int anLocalInt_1063_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1063_ != 0)
                                anLocalInts_1048_[anLocalInt_1047_] = anLocalInt_1063_;
                        } else if (anLocalInt_1049_ == 0) {
                            int anLocalInt_1064_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1064_ != 0) {
                                if ((Class368_Sub2.anInt5693 & 0xffffff) == 16777215) {
                                    int anLocalInt_1065_ = Class368_Sub2.anInt5693 >>> 24;
                                    int anLocalInt_1066_ = 256 - anLocalInt_1065_;
                                    int anLocalInt_1067_ = anLocalInts_1048_[anLocalInt_1047_];
                                    anLocalInts_1048_[anLocalInt_1047_] = (((((anLocalInt_1064_ & 0xff00ff) * anLocalInt_1065_) + ((anLocalInt_1067_ & 0xff00ff) * anLocalInt_1066_)) & ~0xff00ff) + ((((anLocalInt_1064_ & 0xff00) * anLocalInt_1065_) + ((anLocalInt_1067_ & 0xff00) * anLocalInt_1066_)) & 0xff0000)) >> 8;
                                } else if (Class368_Sub2.anInt5695 != 255) {
                                    int anLocalInt_1068_ = (((anLocalInt_1064_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_1069_ = (((anLocalInt_1064_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_1070_ = (((anLocalInt_1064_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInt_1064_ = (anLocalInt_1068_ | anLocalInt_1069_ | anLocalInt_1070_) >>> 8;
                                    int anLocalInt_1071_ = anLocalInts_1048_[anLocalInt_1047_];
                                    anLocalInts_1048_[anLocalInt_1047_] = (((((anLocalInt_1064_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_1071_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_1064_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_1071_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                                } else {
                                    int anLocalInt_1072_ = (((anLocalInt_1064_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                    int anLocalInt_1073_ = (((anLocalInt_1064_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                    int anLocalInt_1074_ = (((anLocalInt_1064_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                    anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1072_ | anLocalInt_1073_ | anLocalInt_1074_) >>> 8;
                                }
                            }
                        } else if (anLocalInt_1049_ == 3) {
                            int anLocalInt_1075_ = (this.pixels[anLocalInt_1046_]);
                            int anLocalInt_1076_ = Class368_Sub2.anInt5693;
                            int anLocalInt_1077_ = anLocalInt_1075_ + anLocalInt_1076_;
                            int anLocalInt_1078_ = ((anLocalInt_1075_ & 0xff00ff) + (anLocalInt_1076_ & 0xff00ff));
                            int anLocalInt_1079_ = ((anLocalInt_1078_ & 0x1000100) + (anLocalInt_1077_ - anLocalInt_1078_ & 0x10000));
                            anLocalInt_1079_ = (anLocalInt_1077_ - anLocalInt_1079_ | anLocalInt_1079_ - (anLocalInt_1079_ >>> 8));
                            if (anLocalInt_1075_ == 0 && Class368_Sub2.anInt5695 != 255) {
                                anLocalInt_1075_ = anLocalInt_1079_;
                                anLocalInt_1079_ = anLocalInts_1048_[anLocalInt_1047_];
                                anLocalInt_1079_ = (((((anLocalInt_1075_ & 0xff00ff) * Class368_Sub2.anInt5695) + ((anLocalInt_1079_ & 0xff00ff) * Class368_Sub2.anInt5711)) & ~0xff00ff) + ((((anLocalInt_1075_ & 0xff00) * Class368_Sub2.anInt5695) + ((anLocalInt_1079_ & 0xff00) * Class368_Sub2.anInt5711)) & 0xff0000)) >> 8;
                            }
                            anLocalInts_1048_[anLocalInt_1047_] = anLocalInt_1079_;
                        } else if (anLocalInt_1049_ == 2) {
                            int anLocalInt_1080_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1080_ != 0) {
                                int anLocalInt_1081_ = (((anLocalInt_1080_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_1082_ = (((anLocalInt_1080_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInts_1048_[anLocalInt_1047_++] = ((anLocalInt_1081_ | anLocalInt_1082_) >>> 8) + Class368_Sub2.anInt5697;
                            }
                        } else
                            throw new IllegalArgumentException();
                    } else if (anLocalInt_1050_ == 2) {
                        if (anLocalInt_1049_ == 1) {
                            int anLocalInt_1083_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1083_ != 0) {
                                int anLocalInt_1084_ = anLocalInts_1048_[anLocalInt_1047_];
                                int anLocalInt_1085_ = anLocalInt_1083_ + anLocalInt_1084_;
                                int anLocalInt_1086_ = ((anLocalInt_1083_ & 0xff00ff) + (anLocalInt_1084_ & 0xff00ff));
                                anLocalInt_1084_ = ((anLocalInt_1086_ & 0x1000100) + (anLocalInt_1085_ - anLocalInt_1086_ & 0x10000));
                                anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1085_ - anLocalInt_1084_ | anLocalInt_1084_ - (anLocalInt_1084_ >>> 8));
                            }
                        } else if (anLocalInt_1049_ == 0) {
                            int anLocalInt_1087_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1087_ != 0) {
                                int anLocalInt_1088_ = (((anLocalInt_1087_ & 0xff0000) * Class368_Sub2.anInt5702) & ~0xffffff);
                                int anLocalInt_1089_ = (((anLocalInt_1087_ & 0xff00) * Class368_Sub2.anInt5714) & 0xff0000);
                                int anLocalInt_1090_ = (((anLocalInt_1087_ & 0xff) * Class368_Sub2.anInt5701) & 0xff00);
                                anLocalInt_1087_ = (anLocalInt_1088_ | anLocalInt_1089_ | anLocalInt_1090_) >>> 8;
                                int anLocalInt_1091_ = anLocalInts_1048_[anLocalInt_1047_];
                                int anLocalInt_1092_ = anLocalInt_1087_ + anLocalInt_1091_;
                                int anLocalInt_1093_ = ((anLocalInt_1087_ & 0xff00ff) + (anLocalInt_1091_ & 0xff00ff));
                                anLocalInt_1091_ = ((anLocalInt_1093_ & 0x1000100) + (anLocalInt_1092_ - anLocalInt_1093_ & 0x10000));
                                anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1092_ - anLocalInt_1091_ | anLocalInt_1091_ - (anLocalInt_1091_ >>> 8));
                            }
                        } else if (anLocalInt_1049_ == 3) {
                            int anLocalInt_1094_ = (this.pixels[anLocalInt_1046_]);
                            int anLocalInt_1095_ = Class368_Sub2.anInt5693;
                            int anLocalInt_1096_ = anLocalInt_1094_ + anLocalInt_1095_;
                            int anLocalInt_1097_ = ((anLocalInt_1094_ & 0xff00ff) + (anLocalInt_1095_ & 0xff00ff));
                            int anLocalInt_1098_ = ((anLocalInt_1097_ & 0x1000100) + (anLocalInt_1096_ - anLocalInt_1097_ & 0x10000));
                            anLocalInt_1094_ = (anLocalInt_1096_ - anLocalInt_1098_ | anLocalInt_1098_ - (anLocalInt_1098_ >>> 8));
                            anLocalInt_1098_ = anLocalInts_1048_[anLocalInt_1047_];
                            anLocalInt_1096_ = anLocalInt_1094_ + anLocalInt_1098_;
                            anLocalInt_1097_ = ((anLocalInt_1094_ & 0xff00ff) + (anLocalInt_1098_ & 0xff00ff));
                            anLocalInt_1098_ = ((anLocalInt_1097_ & 0x1000100) + (anLocalInt_1096_ - anLocalInt_1097_ & 0x10000));
                            anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1096_ - anLocalInt_1098_ | anLocalInt_1098_ - (anLocalInt_1098_ >>> 8));
                        } else if (anLocalInt_1049_ == 2) {
                            int anLocalInt_1099_ = (this.pixels[anLocalInt_1046_]);
                            if (anLocalInt_1099_ != 0) {
                                int anLocalInt_1100_ = (((anLocalInt_1099_ & 0xff00ff) * Class368_Sub2.anInt5695) & ~0xff00ff);
                                int anLocalInt_1101_ = (((anLocalInt_1099_ & 0xff00) * Class368_Sub2.anInt5695) & 0xff0000);
                                anLocalInt_1099_ = ((anLocalInt_1100_ | anLocalInt_1101_) >>> 8) + Class368_Sub2.anInt5697;
                                int anLocalInt_1102_ = anLocalInts_1048_[anLocalInt_1047_];
                                int anLocalInt_1103_ = anLocalInt_1099_ + anLocalInt_1102_;
                                int anLocalInt_1104_ = ((anLocalInt_1099_ & 0xff00ff) + (anLocalInt_1102_ & 0xff00ff));
                                anLocalInt_1102_ = ((anLocalInt_1104_ & 0x1000100) + (anLocalInt_1103_ - anLocalInt_1104_ & 0x10000));
                                anLocalInts_1048_[anLocalInt_1047_] = (anLocalInt_1103_ - anLocalInt_1102_ | anLocalInt_1102_ - (anLocalInt_1102_ >>> 8));
                            }
                        }
                    } else
                        throw new IllegalArgumentException();
                    anLocalInt_1041_ += Class368_Sub2.anInt5717;
                    anLocalInt_1042_ += Class368_Sub2.anInt5712;
                }
                Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
                Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
                Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
            }
        }
    }

    final void method4007(int argument_1105_, int argument_1106_, Class_aa argument_1107_, int argument_1108_, int argument_1109_) {
        if (this.toolkit.method2100())
            throw new IllegalStateException();
        argument_1105_ += this.anInt5698;
        argument_1106_ += this.anInt5719;
        int anLocalInt = 0;
        int anLocalInt_1110_ = (this.toolkit.width);
        int anLocalInt_1111_ = this.width;
        int anLocalInt_1112_ = this.height;
        int anLocalInt_1113_ = anLocalInt_1110_ - anLocalInt_1111_;
        int anLocalInt_1114_ = 0;
        int anLocalInt_1115_ = argument_1105_ + argument_1106_ * anLocalInt_1110_;
        if (argument_1106_ < (this.toolkit.clipTop)) {
            int anLocalInt_1116_ = (this.toolkit.clipTop) - argument_1106_;
            anLocalInt_1112_ -= anLocalInt_1116_;
            argument_1106_ = (this.toolkit.clipTop);
            anLocalInt += anLocalInt_1116_ * anLocalInt_1111_;
            anLocalInt_1115_ += anLocalInt_1116_ * anLocalInt_1110_;
        }
        if (argument_1106_ + anLocalInt_1112_ > (this.toolkit.clipBottom))
            anLocalInt_1112_ -= (argument_1106_ + anLocalInt_1112_ - this.toolkit.clipBottom);
        if (argument_1105_ < (this.toolkit.clipLeft)) {
            int anLocalInt_1117_ = (this.toolkit.clipLeft) - argument_1105_;
            anLocalInt_1111_ -= anLocalInt_1117_;
            argument_1105_ = (this.toolkit.clipLeft);
            anLocalInt += anLocalInt_1117_;
            anLocalInt_1115_ += anLocalInt_1117_;
            anLocalInt_1114_ += anLocalInt_1117_;
            anLocalInt_1113_ += anLocalInt_1117_;
        }
        if (argument_1105_ + anLocalInt_1111_ > (this.toolkit.clipRight)) {
            int anLocalInt_1118_ = (argument_1105_ + anLocalInt_1111_ - this.toolkit.clipRight);
            anLocalInt_1111_ -= anLocalInt_1118_;
            anLocalInt_1114_ += anLocalInt_1118_;
            anLocalInt_1113_ += anLocalInt_1118_;
        }
        if (anLocalInt_1111_ > 0 && anLocalInt_1112_ > 0) {
            Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_1107_;
            int[] anLocalInts = class_aa_sub3.anIntArray3757;
            int[] anLocalInts_1119_ = class_aa_sub3.anIntArray3755;
            int[] anLocalInts_1120_ = (this.toolkit.pixels);
            int anLocalInt_1121_ = argument_1106_;
            if (argument_1109_ > anLocalInt_1121_) {
                anLocalInt_1121_ = argument_1109_;
                anLocalInt_1115_ += (argument_1109_ - argument_1106_) * anLocalInt_1110_;
                anLocalInt += ((argument_1109_ - argument_1106_) * this.width);
            }
            int anLocalInt_1122_ = ((argument_1109_ + anLocalInts.length < argument_1106_ + anLocalInt_1112_) ? argument_1109_ + anLocalInts.length : argument_1106_ + anLocalInt_1112_);
            for (int anLocalInt_1123_ = anLocalInt_1121_; anLocalInt_1123_ < anLocalInt_1122_; anLocalInt_1123_++) {
                int anLocalInt_1124_ = (anLocalInts[anLocalInt_1123_ - argument_1109_] + argument_1108_);
                int anLocalInt_1125_ = anLocalInts_1119_[anLocalInt_1123_ - argument_1109_];
                int anLocalInt_1126_ = anLocalInt_1111_;
                if (argument_1105_ > anLocalInt_1124_) {
                    int anLocalInt_1127_ = argument_1105_ - anLocalInt_1124_;
                    if (anLocalInt_1127_ >= anLocalInt_1125_) {
                        anLocalInt += anLocalInt_1111_ + anLocalInt_1114_;
                        anLocalInt_1115_ += anLocalInt_1111_ + anLocalInt_1113_;
                        continue;
                    }
                    anLocalInt_1125_ -= anLocalInt_1127_;
                } else {
                    int anLocalInt_1128_ = anLocalInt_1124_ - argument_1105_;
                    if (anLocalInt_1128_ >= anLocalInt_1111_) {
                        anLocalInt += anLocalInt_1111_ + anLocalInt_1114_;
                        anLocalInt_1115_ += anLocalInt_1111_ + anLocalInt_1113_;
                        continue;
                    }
                    anLocalInt += anLocalInt_1128_;
                    anLocalInt_1126_ -= anLocalInt_1128_;
                    anLocalInt_1115_ += anLocalInt_1128_;
                }
                int anLocalInt_1129_ = 0;
                if (anLocalInt_1126_ < anLocalInt_1125_)
                    anLocalInt_1125_ = anLocalInt_1126_;
                else
                    anLocalInt_1129_ = anLocalInt_1126_ - anLocalInt_1125_;
                for (int anLocalInt_1130_ = -anLocalInt_1125_; anLocalInt_1130_ < 0; anLocalInt_1130_++) {
                    int anLocalInt_1131_ = (this.pixels[anLocalInt++]);
                    if (anLocalInt_1131_ != 0)
                        anLocalInts_1120_[anLocalInt_1115_++] = anLocalInt_1131_;
                    else
                        anLocalInt_1115_++;
                }
                anLocalInt += anLocalInt_1129_ + anLocalInt_1114_;
                anLocalInt_1115_ += anLocalInt_1129_ + anLocalInt_1113_;
            }
        }
    }
}
