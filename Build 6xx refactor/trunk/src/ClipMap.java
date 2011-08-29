/* Class240 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClipMap {
    int anInt1743;
    int anInt1746;
    int anInt1747;
    int anInt1749;
    int[][] anIntArrayArray1750;

    final void method3129(int argument_0_, int argument_1_, int argument_2_) {
        argument_1_ -= this.anInt1746;
        argument_0_ -= this.anInt1743;
        this.anIntArrayArray1750[argument_1_][argument_0_] = MathStatics.OR((this.anIntArrayArray1750[argument_1_][argument_0_]), argument_2_);
    }

    final void method3130(int argument_3_, int argument_4_, int argument_5_) {
        argument_3_ -= this.anInt1743;
        argument_5_ -= this.anInt1746;
        this.anIntArrayArray1750[argument_5_][argument_3_] = MathStatics.OR((this.anIntArrayArray1750[argument_5_][argument_3_]), argument_4_);
    }

    final boolean method3131(int argument_6_, int argument_7_, int argument_8_, int argument_9_, int argument_10_, int argument_11_, int argument_12_, int argument_13_, int argument_14_, int argument_15_) {
        int anLocalInt = argument_13_ + argument_7_;
        int anLocalInt_16_ = argument_12_ + argument_8_;
        int anLocalInt_17_ = argument_9_ + argument_6_;
        int anLocalInt_18_ = argument_11_ + argument_15_;
        if (argument_7_ == anLocalInt_17_ && (argument_14_ & 0x2) == 0) {
            int anLocalInt_19_ = argument_11_ >= argument_12_ ? argument_11_ : argument_12_;
            for (int anLocalInt_20_ = (anLocalInt_16_ >= anLocalInt_18_ ? anLocalInt_18_ : anLocalInt_16_); anLocalInt_19_ < anLocalInt_20_; anLocalInt_19_++) {
                if (((this.anIntArrayArray1750[anLocalInt_17_ - 1 - this.anInt1746][-this.anInt1743 + anLocalInt_19_]) & 0x8) == 0)
                    return true;
            }
        } else if (argument_6_ != anLocalInt || (argument_14_ & 0x8) != 0) {
            if (anLocalInt_18_ != argument_12_ || (argument_14_ & 0x1) != 0) {
                if (argument_11_ == anLocalInt_16_ && (argument_14_ & 0x4) == 0) {
                    int anLocalInt_21_ = (argument_7_ <= argument_6_ ? argument_6_ : argument_7_);
                    for (int anLocalInt_22_ = (anLocalInt < anLocalInt_17_ ? anLocalInt : anLocalInt_17_); anLocalInt_22_ > anLocalInt_21_; anLocalInt_21_++) {
                        if (((this.anIntArrayArray1750[anLocalInt_21_ - this.anInt1746][-this.anInt1743 + argument_11_]) & 0x20) == 0)
                            return true;
                    }
                }
            } else {
                int anLocalInt_23_ = argument_6_ >= argument_7_ ? argument_6_ : argument_7_;
                for (int anLocalInt_24_ = (anLocalInt < anLocalInt_17_ ? anLocalInt : anLocalInt_17_); anLocalInt_23_ < anLocalInt_24_; anLocalInt_23_++) {
                    if (((this.anIntArrayArray1750[anLocalInt_23_ - this.anInt1746][-this.anInt1743 + (anLocalInt_18_ - 1)]) & 0x2) == 0)
                        return true;
                }
            }
        } else {
            int anLocalInt_25_ = argument_11_ >= argument_12_ ? argument_11_ : argument_12_;
            for (int anLocalInt_26_ = (anLocalInt_16_ >= anLocalInt_18_ ? anLocalInt_18_ : anLocalInt_16_); anLocalInt_26_ > anLocalInt_25_; anLocalInt_25_++) {
                if (((this.anIntArrayArray1750[-this.anInt1746 + argument_6_][anLocalInt_25_ - this.anInt1743]) & 0x80) == 0)
                    return true;
            }
        }
        return false;
    }

    final boolean method3132(int argument_27_, int argument_28_, byte argument_29_, int argument_30_, int argument_31_, int argument_32_, int argument_33_, int argument_34_) {
        if (argument_32_ != 1) {
            if (argument_34_ <= argument_31_ && argument_34_ + argument_32_ - 1 >= argument_31_ && argument_28_ <= argument_28_ && argument_28_ + (argument_32_ - 1) >= argument_28_)
                return true;
        } else if (argument_34_ == argument_31_ && argument_30_ == argument_28_)
            return true;
        argument_34_ -= this.anInt1746;
        argument_31_ -= this.anInt1746;
        argument_28_ -= this.anInt1743;
        argument_30_ -= this.anInt1743;
        if (argument_32_ != 1) {
            int anLocalInt = argument_32_ + argument_34_ - 1;
            int anLocalInt_35_ = argument_32_ + argument_30_ - 1;
            if (argument_27_ == 0) {
                if (argument_33_ != 0) {
                    if (argument_33_ == 1) {
                        if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && argument_28_ + 1 == argument_30_)
                            return true;
                        if (argument_34_ == -argument_32_ + argument_31_ && argument_30_ <= argument_28_ && argument_28_ <= anLocalInt_35_ && ((this.anIntArrayArray1750[anLocalInt][argument_28_]) & 0x2c0108) == 0)
                            return true;
                        if (argument_31_ + 1 == argument_34_ && argument_30_ <= argument_28_ && anLocalInt_35_ >= argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_28_]) & 0x2c0180) == 0)
                            return true;
                    } else if (argument_33_ != 2) {
                        if (argument_33_ == 3) {
                            if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && (-argument_32_ + argument_28_ == argument_30_))
                                return true;
                            if (argument_34_ == -argument_32_ + argument_31_ && argument_28_ >= argument_30_ && anLocalInt_35_ >= argument_28_ && ((this.anIntArrayArray1750[anLocalInt][argument_28_]) & 0x2c0108) == 0)
                                return true;
                            if (argument_31_ + 1 == argument_34_ && argument_28_ >= argument_30_ && anLocalInt_35_ >= argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_28_]) & 0x2c0180) == 0)
                                return true;
                        }
                    } else {
                        if (argument_31_ + 1 == argument_34_ && argument_30_ <= argument_28_ && anLocalInt_35_ >= argument_28_)
                            return true;
                        if (argument_31_ >= argument_34_ && anLocalInt >= argument_31_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_31_][argument_30_]) & 0x2c0120) == 0)
                            return true;
                        if (argument_31_ >= argument_34_ && argument_31_ <= anLocalInt && -argument_32_ + argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_31_][anLocalInt_35_]) & 0x2c0102) == 0)
                            return true;
                    }
                } else {
                    if (argument_34_ == -argument_32_ + argument_31_ && argument_28_ >= argument_30_ && anLocalInt_35_ >= argument_28_)
                        return true;
                    if (argument_34_ <= argument_31_ && argument_31_ <= anLocalInt && argument_30_ == argument_28_ + 1 && ((this.anIntArrayArray1750[argument_31_][argument_30_]) & 0x2c0120) == 0)
                        return true;
                    if (argument_31_ >= argument_34_ && argument_31_ <= anLocalInt && argument_30_ == -argument_32_ + argument_28_ && ((this.anIntArrayArray1750[argument_31_][anLocalInt_35_]) & 0x2c0102) == 0)
                        return true;
                }
            }
            if (argument_27_ == 2) {
                if (argument_33_ == 0) {
                    if (argument_31_ - argument_32_ == argument_34_ && argument_30_ <= argument_28_ && anLocalInt_35_ >= argument_28_)
                        return true;
                    if (argument_31_ >= argument_34_ && anLocalInt >= argument_31_ && argument_30_ == argument_28_ + 1)
                        return true;
                    if (argument_31_ + 1 == argument_34_ && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_ && ((this.anIntArrayArray1750[argument_34_][argument_28_]) & 0x2c0180) == 0)
                        return true;
                    if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && argument_30_ == -argument_32_ + argument_28_ && ((this.anIntArrayArray1750[argument_31_][anLocalInt_35_]) & 0x2c0102) == 0)
                        return true;
                } else if (argument_33_ == 1) {
                    if (-argument_32_ + argument_31_ == argument_34_ && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_ && ((this.anIntArrayArray1750[anLocalInt][argument_28_]) & 0x2c0108) == 0)
                        return true;
                    if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && argument_28_ + 1 == argument_30_)
                        return true;
                    if (argument_34_ == argument_31_ + 1 && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_)
                        return true;
                    if (argument_34_ <= argument_31_ && argument_31_ <= anLocalInt && argument_28_ - argument_32_ == argument_30_ && ((this.anIntArrayArray1750[argument_31_][anLocalInt_35_]) & 0x2c0102) == 0)
                        return true;
                } else if (argument_33_ != 2) {
                    if (argument_33_ == 3) {
                        if (-argument_32_ + argument_31_ == argument_34_ && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_)
                            return true;
                        if (argument_34_ <= argument_31_ && argument_31_ <= anLocalInt && argument_30_ == argument_28_ + 1 && ((this.anIntArrayArray1750[argument_31_][argument_30_]) & 0x2c0120) == 0)
                            return true;
                        if (argument_31_ + 1 == argument_34_ && argument_28_ >= argument_30_ && anLocalInt_35_ >= argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_28_]) & 0x2c0180) == 0)
                            return true;
                        if (argument_31_ >= argument_34_ && anLocalInt >= argument_31_ && argument_28_ - argument_32_ == argument_30_)
                            return true;
                    }
                } else {
                    if (-argument_32_ + argument_31_ == argument_34_ && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_ && ((this.anIntArrayArray1750[anLocalInt][argument_28_]) & 0x2c0108) == 0)
                        return true;
                    if (argument_31_ >= argument_34_ && argument_31_ <= anLocalInt && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_31_][argument_30_]) & 0x2c0120) == 0)
                        return true;
                    if (argument_31_ + 1 == argument_34_ && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_)
                        return true;
                    if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && argument_28_ - argument_32_ == argument_30_)
                        return true;
                }
            }
            if (argument_27_ == 9) {
                if (argument_34_ <= argument_31_ && anLocalInt >= argument_31_ && argument_30_ == argument_28_ + 1 && ((this.anIntArrayArray1750[argument_31_][argument_30_]) & 0x2c0120) == 0)
                    return true;
                if (argument_34_ <= argument_31_ && argument_31_ <= anLocalInt && argument_28_ - argument_32_ == argument_30_ && ((this.anIntArrayArray1750[argument_31_][anLocalInt_35_]) & 0x2c0102) == 0)
                    return true;
                if (argument_34_ == -argument_32_ + argument_31_ && argument_28_ >= argument_30_ && anLocalInt_35_ >= argument_28_ && ((this.anIntArrayArray1750[anLocalInt][argument_28_]) & 0x2c0108) == 0)
                    return true;
                if (argument_34_ == argument_31_ + 1 && argument_28_ >= argument_30_ && argument_28_ <= anLocalInt_35_ && ((this.anIntArrayArray1750[argument_34_][argument_28_]) & 0x2c0180) == 0)
                    return true;
            }
        } else {
            if (argument_27_ == 0) {
                if (argument_33_ != 0) {
                    if (argument_33_ == 1) {
                        if (argument_31_ == argument_34_ && argument_28_ + 1 == argument_30_)
                            return true;
                        if (argument_34_ == argument_31_ - 1 && argument_30_ == argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0108) == 0)
                            return true;
                        if (argument_34_ == argument_31_ + 1 && argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0180) == 0)
                            return true;
                    } else if (argument_33_ != 2) {
                        if (argument_33_ == 3) {
                            if (argument_31_ == argument_34_ && argument_30_ == argument_28_ - 1)
                                return true;
                            if (argument_31_ - 1 == argument_34_ && argument_30_ == argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0108) == 0)
                                return true;
                            if (argument_31_ + 1 == argument_34_ && argument_30_ == argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0180) == 0)
                                return true;
                        }
                    } else {
                        if (argument_31_ + 1 == argument_34_ && argument_28_ == argument_30_)
                            return true;
                        if (argument_31_ == argument_34_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0120) == 0)
                            return true;
                        if (argument_34_ == argument_31_ && argument_30_ == argument_28_ - 1 && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0102) == 0)
                            return true;
                    }
                } else {
                    if (argument_31_ - 1 == argument_34_ && argument_30_ == argument_28_)
                        return true;
                    if (argument_34_ == argument_31_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0120) == 0)
                        return true;
                    if (argument_31_ == argument_34_ && argument_30_ == argument_28_ - 1 && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0102) == 0)
                        return true;
                }
            }
            if (argument_27_ == 2) {
                if (argument_33_ != 0) {
                    if (argument_33_ != 1) {
                        if (argument_33_ != 2) {
                            if (argument_33_ == 3) {
                                if (argument_34_ == argument_31_ - 1 && argument_30_ == argument_28_)
                                    return true;
                                if (argument_31_ == argument_34_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0120) == 0)
                                    return true;
                                if (argument_34_ == argument_31_ + 1 && argument_30_ == argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0180) == 0)
                                    return true;
                                if (argument_34_ == argument_31_ && argument_28_ - 1 == argument_30_)
                                    return true;
                            }
                        } else {
                            if (argument_34_ == argument_31_ - 1 && argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0108) == 0)
                                return true;
                            if (argument_34_ == argument_31_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0120) == 0)
                                return true;
                            if (argument_34_ == argument_31_ + 1 && argument_28_ == argument_30_)
                                return true;
                            if (argument_34_ == argument_31_ && argument_28_ - 1 == argument_30_)
                                return true;
                        }
                    } else {
                        if (argument_31_ - 1 == argument_34_ && argument_30_ == argument_28_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0108) == 0)
                            return true;
                        if (argument_34_ == argument_31_ && argument_28_ + 1 == argument_30_)
                            return true;
                        if (argument_31_ + 1 == argument_34_ && argument_28_ == argument_30_)
                            return true;
                        if (argument_31_ == argument_34_ && argument_28_ - 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0102) == 0)
                            return true;
                    }
                } else {
                    if (argument_31_ - 1 == argument_34_ && argument_28_ == argument_30_)
                        return true;
                    if (argument_31_ == argument_34_ && argument_30_ == argument_28_ + 1)
                        return true;
                    if (argument_34_ == argument_31_ + 1 && argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0180) == 0)
                        return true;
                    if (argument_34_ == argument_31_ && argument_30_ == argument_28_ - 1 && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2c0102) == 0)
                        return true;
                }
            }
            if (argument_27_ == 9) {
                if (argument_34_ == argument_31_ && argument_28_ + 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x20) == 0)
                    return true;
                if (argument_34_ == argument_31_ && argument_28_ - 1 == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x2) == 0)
                    return true;
                if (argument_34_ == argument_31_ - 1 && argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x8) == 0)
                    return true;
                if (argument_34_ == argument_31_ + 1 && argument_28_ == argument_30_ && ((this.anIntArrayArray1750[argument_34_][argument_30_]) & 0x80) == 0)
                    return true;
            }
        }
        return false;
    }

    final void method3133(int argument_36_, boolean argument_37_, int argument_38_, int argument_39_, boolean argument_40_, int argument_41_, int argument_42_) {
        if (argument_39_ != -15874)
            Statics.anInt1744 = 52;
        argument_36_ -= this.anInt1743;
        argument_42_ -= this.anInt1746;
        if (argument_38_ == 0) {
            if (argument_41_ == 0) {
                method3139(argument_39_ ^ ~0x3e09, 128, argument_42_, argument_36_);
                method3139(8, 8, argument_42_ - 1, argument_36_);
            }
            if (argument_41_ == 1) {
                method3139(argument_39_ ^ ~0x3e09, 2, argument_42_, argument_36_);
                method3139(argument_39_ + 15882, 32, argument_42_, argument_36_ + 1);
            }
            if (argument_41_ == 2) {
                method3139(8, 8, argument_42_, argument_36_);
                method3139(8, 128, argument_42_ + 1, argument_36_);
            }
            if (argument_41_ == 3) {
                method3139(8, 32, argument_42_, argument_36_);
                method3139(8, 2, argument_42_, argument_36_ - 1);
            }
        }
        if (argument_38_ == 1 || argument_38_ == 3) {
            if (argument_41_ == 0) {
                method3139(8, 1, argument_42_, argument_36_);
                method3139(8, 16, argument_42_ - 1, argument_36_ + 1);
            }
            if (argument_41_ == 1) {
                method3139(8, 4, argument_42_, argument_36_);
                method3139(8, 64, argument_42_ + 1, argument_36_ + 1);
            }
            if (argument_41_ == 2) {
                method3139(8, 16, argument_42_, argument_36_);
                method3139(8, 1, argument_42_ + 1, argument_36_ - 1);
            }
            if (argument_41_ == 3) {
                method3139(8, 64, argument_42_, argument_36_);
                method3139(8, 4, argument_42_ - 1, argument_36_ - 1);
            }
        }
        if (argument_38_ == 2) {
            if (argument_41_ == 0) {
                method3139(8, 130, argument_42_, argument_36_);
                method3139(argument_39_ + 15882, 8, argument_42_ - 1, argument_36_);
                method3139(8, 32, argument_42_, argument_36_ + 1);
            }
            if (argument_41_ == 1) {
                method3139(8, 10, argument_42_, argument_36_);
                method3139(8, 32, argument_42_, argument_36_ + 1);
                method3139(8, 128, argument_42_ + 1, argument_36_);
            }
            if (argument_41_ == 2) {
                method3139(8, 40, argument_42_, argument_36_);
                method3139(8, 128, argument_42_ + 1, argument_36_);
                method3139(8, 2, argument_42_, argument_36_ - 1);
            }
            if (argument_41_ == 3) {
                method3139(8, 160, argument_42_, argument_36_);
                method3139(8, 2, argument_42_, argument_36_ - 1);
                method3139(8, 8, argument_42_ - 1, argument_36_);
            }
        }
        if (argument_37_) {
            if (argument_38_ == 0) {
                if (argument_41_ == 0) {
                    method3139(8, 65536, argument_42_, argument_36_);
                    method3139(8, 4096, argument_42_ - 1, argument_36_);
                }
                if (argument_41_ == 1) {
                    method3139(8, 1024, argument_42_, argument_36_);
                    method3139(8, 16384, argument_42_, argument_36_ + 1);
                }
                if (argument_41_ == 2) {
                    method3139(8, 4096, argument_42_, argument_36_);
                    method3139(8, 65536, argument_42_ + 1, argument_36_);
                }
                if (argument_41_ == 3) {
                    method3139(8, 16384, argument_42_, argument_36_);
                    method3139(8, 1024, argument_42_, argument_36_ - 1);
                }
            }
            if (argument_38_ == 1 || argument_38_ == 3) {
                if (argument_41_ == 0) {
                    method3139(8, 512, argument_42_, argument_36_);
                    method3139(argument_39_ + 15882, 8192, argument_42_ - 1, argument_36_ + 1);
                }
                if (argument_41_ == 1) {
                    method3139(8, 2048, argument_42_, argument_36_);
                    method3139(8, 32768, argument_42_ + 1, argument_36_ + 1);
                }
                if (argument_41_ == 2) {
                    method3139(8, 8192, argument_42_, argument_36_);
                    method3139(8, 512, argument_42_ + 1, argument_36_ - 1);
                }
                if (argument_41_ == 3) {
                    method3139(argument_39_ + 15882, 32768, argument_42_, argument_36_);
                    method3139(8, 2048, argument_42_ - 1, argument_36_ - 1);
                }
            }
            if (argument_38_ == 2) {
                if (argument_41_ == 0) {
                    method3139(argument_39_ + 15882, 66560, argument_42_, argument_36_);
                    method3139(8, 4096, argument_42_ - 1, argument_36_);
                    method3139(argument_39_ ^ ~0x3e09, 16384, argument_42_, argument_36_ + 1);
                }
                if (argument_41_ == 1) {
                    method3139(argument_39_ ^ ~0x3e09, 5120, argument_42_, argument_36_);
                    method3139(8, 16384, argument_42_, argument_36_ + 1);
                    method3139(argument_39_ + 15882, 65536, argument_42_ + 1, argument_36_);
                }
                if (argument_41_ == 2) {
                    method3139(8, 20480, argument_42_, argument_36_);
                    method3139(8, 65536, argument_42_ + 1, argument_36_);
                    method3139(argument_39_ + 15882, 1024, argument_42_, argument_36_ - 1);
                }
                if (argument_41_ == 3) {
                    method3139(8, 81920, argument_42_, argument_36_);
                    method3139(8, 1024, argument_42_, argument_36_ - 1);
                    method3139(8, 4096, argument_42_ - 1, argument_36_);
                }
            }
        }
        if (argument_40_) {
            if (argument_38_ == 0) {
                if (argument_41_ == 0) {
                    method3139(8, 536870912, argument_42_, argument_36_);
                    method3139(argument_39_ + 15882, 33554432, argument_42_ - 1, argument_36_);
                }
                if (argument_41_ == 1) {
                    method3139(8, 8388608, argument_42_, argument_36_);
                    method3139(8, 134217728, argument_42_, argument_36_ + 1);
                }
                if (argument_41_ == 2) {
                    method3139(8, 33554432, argument_42_, argument_36_);
                    method3139(8, 536870912, argument_42_ + 1, argument_36_);
                }
                if (argument_41_ == 3) {
                    method3139(8, 134217728, argument_42_, argument_36_);
                    method3139(8, 8388608, argument_42_, argument_36_ - 1);
                }
            }
            if (argument_38_ == 1 || argument_38_ == 3) {
                if (argument_41_ == 0) {
                    method3139(8, 4194304, argument_42_, argument_36_);
                    method3139(8, 67108864, argument_42_ - 1, argument_36_ + 1);
                }
                if (argument_41_ == 1) {
                    method3139(8, 16777216, argument_42_, argument_36_);
                    method3139(8, 268435456, argument_42_ + 1, argument_36_ + 1);
                }
                if (argument_41_ == 2) {
                    method3139(8, 67108864, argument_42_, argument_36_);
                    method3139(8, 4194304, argument_42_ + 1, argument_36_ - 1);
                }
                if (argument_41_ == 3) {
                    method3139(argument_39_ + 15882, 268435456, argument_42_, argument_36_);
                    method3139(8, 16777216, argument_42_ - 1, argument_36_ - 1);
                }
            }
            if (argument_38_ == 2) {
                if (argument_41_ == 0) {
                    method3139(8, 545259520, argument_42_, argument_36_);
                    method3139(8, 33554432, argument_42_ - 1, argument_36_);
                    method3139(8, 134217728, argument_42_, argument_36_ + 1);
                }
                if (argument_41_ == 1) {
                    method3139(8, 41943040, argument_42_, argument_36_);
                    method3139(argument_39_ ^ ~0x3e09, 134217728, argument_42_, argument_36_ + 1);
                    method3139(argument_39_ ^ ~0x3e09, 536870912, argument_42_ + 1, argument_36_);
                }
                if (argument_41_ == 2) {
                    method3139(8, 167772160, argument_42_, argument_36_);
                    method3139(8, 536870912, argument_42_ + 1, argument_36_);
                    method3139(8, 8388608, argument_42_, argument_36_ - 1);
                }
                if (argument_41_ == 3) {
                    method3139(argument_39_ ^ ~0x3e09, 671088640, argument_42_, argument_36_);
                    method3139(8, 8388608, argument_42_, argument_36_ - 1);
                    method3139(8, 33554432, argument_42_ - 1, argument_36_);
                }
            }
        }
    }

    final void method3134(int argument_43_, int argument_44_, byte argument_45_) {
        argument_44_ -= this.anInt1743;
        argument_43_ -= this.anInt1746;
        this.anIntArrayArray1750[argument_43_][argument_44_] = MathStatics.AND((this.anIntArrayArray1750[argument_43_][argument_44_]), -262145);
    }

    final void method3135(boolean argument_46_, int argument_47_, int argument_48_, int argument_49_, int argument_50_, boolean argument_51_) {
        int anLocalInt = 256;
        if (argument_51_)
            anLocalInt |= 0x20000;
        argument_49_ -= this.anInt1746;
        if (argument_46_)
            anLocalInt |= 0x40000000;
        argument_47_ -= this.anInt1743;
        for (int anLocalInt_53_ = argument_49_; argument_50_ + argument_49_ > anLocalInt_53_; anLocalInt_53_++) {
            if (anLocalInt_53_ >= 0 && anLocalInt_53_ < this.anInt1749) {
                for (int anLocalInt_54_ = argument_47_; argument_47_ + argument_48_ > anLocalInt_54_; anLocalInt_54_++) {
                    if (anLocalInt_54_ >= 0 && this.anInt1747 > anLocalInt_54_)
                        method3139(8, anLocalInt, anLocalInt_53_, anLocalInt_54_);
                }
            }
        }
    }

    final void method3136(byte argument_55_, int argument_56_, int argument_57_, int argument_58_, boolean argument_59_, int argument_60_, boolean argument_61_, int argument_62_) {
        int anLocalInt = 256;
        if (argument_61_)
            anLocalInt |= 0x20000;
        argument_62_ -= this.anInt1746;
        if (argument_60_ == 1 || argument_60_ == 3) {
            int anLocalInt_63_ = argument_56_;
            argument_56_ = argument_57_;
            argument_57_ = anLocalInt_63_;
        }
        if (argument_59_)
            anLocalInt |= 0x40000000;
        argument_58_ -= this.anInt1743;
        for (int anLocalInt_64_ = argument_62_; argument_56_ + argument_62_ > anLocalInt_64_; anLocalInt_64_++) {
            if (anLocalInt_64_ >= 0 && this.anInt1749 > anLocalInt_64_) {
                for (int anLocalInt_65_ = argument_58_; anLocalInt_65_ < argument_58_ + argument_57_; anLocalInt_65_++) {
                    if (anLocalInt_65_ >= 0 && anLocalInt_65_ < this.anInt1747)
                        method3143(anLocalInt_64_, 126, anLocalInt_65_, anLocalInt);
                }
            }
        }
    }

    final boolean method3137(int argument_66_, int argument_67_, int argument_68_, int argument_69_, int argument_70_, int argument_71_, int argument_72_, int argument_73_, int argument_74_) {
        if (argument_74_ > 1) {
            if (DoublyLinkedNode_Sub51_Sub19.method1297(argument_67_, argument_73_, argument_70_, -1, argument_68_, argument_71_, argument_74_, argument_74_, argument_66_))
                return true;
            return method3131(argument_70_, argument_71_, argument_74_, argument_67_, -1, argument_73_, argument_66_, argument_74_, argument_69_, argument_68_);
        }
        int anLocalInt = argument_67_ - 1 + argument_70_;
        int anLocalInt_75_ = argument_73_ - 1 + argument_68_;
        if (argument_71_ >= argument_70_ && anLocalInt >= argument_71_ && argument_73_ <= argument_66_ && argument_66_ <= anLocalInt_75_)
            return true;
        if (argument_71_ == argument_70_ - 1 && argument_73_ <= argument_66_ && anLocalInt_75_ >= argument_66_ && ((this.anIntArrayArray1750[-this.anInt1746 + argument_71_][argument_66_ - this.anInt1743]) & 0x8) == 0 && (argument_69_ & 0x8) == 0)
            return true;
        if (argument_71_ == anLocalInt + 1 && argument_66_ >= argument_73_ && anLocalInt_75_ >= argument_66_ && ((this.anIntArrayArray1750[argument_71_ - this.anInt1746][argument_66_ - this.anInt1743]) & 0x80) == 0 && (argument_69_ & 0x2) == 0)
            return true;
        if (argument_73_ - 1 == argument_66_ && argument_70_ <= argument_71_ && argument_71_ <= anLocalInt && ((this.anIntArrayArray1750[argument_71_ - this.anInt1746][-this.anInt1743 + argument_66_]) & 0x2) == 0 && (argument_69_ & 0x4) == 0)
            return true;
        if (argument_66_ == anLocalInt_75_ + 1 && argument_71_ >= argument_70_ && argument_71_ <= anLocalInt && ((this.anIntArrayArray1750[-this.anInt1746 + argument_71_][argument_66_ - this.anInt1743]) & 0x20) == 0 && (argument_69_ & 0x1) == 0)
            return true;
        return false;
    }

    final void method3138(int argument_76_) {
        for (int anLocalInt = 0; anLocalInt < this.anInt1749; anLocalInt++) {
            for (int anLocalInt_77_ = 0; this.anInt1747 > anLocalInt_77_; anLocalInt_77_++) {
                if (anLocalInt == 0 || anLocalInt_77_ == 0 || this.anInt1749 - 5 <= anLocalInt || anLocalInt_77_ >= this.anInt1747 - 5)
                    this.anIntArrayArray1750[anLocalInt][anLocalInt_77_] = -1;
                else
                    this.anIntArrayArray1750[anLocalInt][anLocalInt_77_] = 2097152;
            }
        }
    }

    private final void method3139(int argument_78_, int argument_79_, int argument_80_, int argument_81_) {
        if (argument_78_ != 8)
            this.anInt1746 = -57;
        this.anIntArrayArray1750[argument_80_][argument_81_] = MathStatics.OR((this.anIntArrayArray1750[argument_80_][argument_81_]), argument_79_);
    }

    final boolean method3140(int argument_82_, int argument_83_, int argument_84_, int argument_85_, int argument_86_, int argument_87_, int argument_88_, byte argument_89_) {
        if (argument_88_ == 1) {
            if (argument_84_ == argument_83_ && argument_87_ == argument_86_)
                return true;
        } else if (argument_83_ >= argument_84_ && argument_84_ + argument_88_ - 1 >= argument_83_ && argument_87_ <= argument_87_ && argument_87_ <= argument_87_ - 1 + argument_88_)
            return true;
        argument_87_ -= this.anInt1743;
        argument_83_ -= this.anInt1746;
        argument_84_ -= this.anInt1746;
        argument_86_ -= this.anInt1743;
        if (argument_88_ != 1) {
            int anLocalInt = argument_88_ + (argument_84_ - 1);
            int anLocalInt_90_ = argument_88_ + argument_86_ - 1;
            if (argument_85_ == 6 || argument_85_ == 7) {
                if (argument_85_ == 7)
                    argument_82_ = argument_82_ + 2 & 0x3;
                if (argument_82_ != 0) {
                    if (argument_82_ != 1) {
                        if (argument_82_ != 2) {
                            if (argument_82_ == 3) {
                                if (argument_83_ + 1 == argument_84_ && argument_87_ >= argument_86_ && argument_87_ <= anLocalInt_90_ && ((this.anIntArrayArray1750[argument_84_][argument_87_]) & 0x80) == 0)
                                    return true;
                                if (argument_83_ >= argument_84_ && anLocalInt >= argument_83_ && argument_86_ == argument_87_ + 1 && ((this.anIntArrayArray1750[argument_83_][argument_86_]) & 0x20) == 0)
                                    return true;
                            }
                        } else {
                            if (argument_84_ == argument_83_ - argument_88_ && argument_86_ <= argument_87_ && anLocalInt_90_ >= argument_87_ && ((this.anIntArrayArray1750[anLocalInt][argument_87_]) & 0x8) == 0)
                                return true;
                            if (argument_84_ <= argument_83_ && anLocalInt >= argument_83_ && argument_86_ == argument_87_ + 1 && ((this.anIntArrayArray1750[argument_83_][argument_86_]) & 0x20) == 0)
                                return true;
                        }
                    } else {
                        if (-argument_88_ + argument_83_ == argument_84_ && argument_87_ >= argument_86_ && argument_87_ <= anLocalInt_90_ && ((this.anIntArrayArray1750[anLocalInt][argument_87_]) & 0x8) == 0)
                            return true;
                        if (argument_83_ >= argument_84_ && argument_83_ <= anLocalInt && argument_86_ == argument_87_ - argument_88_ && ((this.anIntArrayArray1750[argument_83_][anLocalInt_90_]) & 0x2) == 0)
                            return true;
                    }
                } else {
                    if (argument_83_ + 1 == argument_84_ && argument_86_ <= argument_87_ && anLocalInt_90_ >= argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_87_]) & 0x80) == 0)
                        return true;
                    if (argument_83_ >= argument_84_ && anLocalInt >= argument_83_ && -argument_88_ + argument_87_ == argument_86_ && ((this.anIntArrayArray1750[argument_83_][anLocalInt_90_]) & 0x2) == 0)
                        return true;
                }
            }
            if (argument_85_ == 8) {
                if (argument_83_ >= argument_84_ && argument_83_ <= anLocalInt && argument_86_ == argument_87_ + 1 && ((this.anIntArrayArray1750[argument_83_][argument_86_]) & 0x20) == 0)
                    return true;
                if (argument_84_ <= argument_83_ && argument_83_ <= anLocalInt && argument_87_ - argument_88_ == argument_86_ && ((this.anIntArrayArray1750[argument_83_][anLocalInt_90_]) & 0x2) == 0)
                    return true;
                if (-argument_88_ + argument_83_ == argument_84_ && argument_87_ >= argument_86_ && anLocalInt_90_ >= argument_87_ && ((this.anIntArrayArray1750[anLocalInt][argument_87_]) & 0x8) == 0)
                    return true;
                if (argument_83_ + 1 == argument_84_ && argument_86_ <= argument_87_ && argument_87_ <= anLocalInt_90_ && ((this.anIntArrayArray1750[argument_84_][argument_87_]) & 0x80) == 0)
                    return true;
            }
        } else {
            if (argument_85_ == 6 || argument_85_ == 7) {
                if (argument_85_ == 7)
                    argument_82_ = argument_82_ + 2 & 0x3;
                if (argument_82_ == 0) {
                    if (argument_84_ == argument_83_ + 1 && argument_86_ == argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x80) == 0)
                        return true;
                    if (argument_83_ == argument_84_ && argument_86_ == argument_87_ - 1 && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x2) == 0)
                        return true;
                } else if (argument_82_ == 1) {
                    if (argument_84_ == argument_83_ - 1 && argument_86_ == argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x8) == 0)
                        return true;
                    if (argument_83_ == argument_84_ && argument_87_ - 1 == argument_86_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x2) == 0)
                        return true;
                } else if (argument_82_ != 2) {
                    if (argument_82_ == 3) {
                        if (argument_84_ == argument_83_ + 1 && argument_87_ == argument_86_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x80) == 0)
                            return true;
                        if (argument_83_ == argument_84_ && argument_86_ == argument_87_ + 1 && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x20) == 0)
                            return true;
                    }
                } else {
                    if (argument_83_ - 1 == argument_84_ && argument_86_ == argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x8) == 0)
                        return true;
                    if (argument_84_ == argument_83_ && argument_87_ + 1 == argument_86_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x20) == 0)
                        return true;
                }
            }
            if (argument_85_ == 8) {
                if (argument_84_ == argument_83_ && argument_87_ + 1 == argument_86_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x20) == 0)
                    return true;
                if (argument_83_ == argument_84_ && argument_86_ == argument_87_ - 1 && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x2) == 0)
                    return true;
                if (argument_84_ == argument_83_ - 1 && argument_86_ == argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x8) == 0)
                    return true;
                if (argument_84_ == argument_83_ + 1 && argument_86_ == argument_87_ && ((this.anIntArrayArray1750[argument_84_][argument_86_]) & 0x80) == 0)
                    return true;
            }
        }
        return false;
    }

    final void method3142(int argument_92_, int argument_94_) {
        argument_94_ -= this.anInt1746;
        argument_92_ -= this.anInt1743;
        this.anIntArrayArray1750[argument_94_][argument_92_] = MathStatics.AND((this.anIntArrayArray1750[argument_94_][argument_92_]), -2097153);
    }

    private final void method3143(int argument_95_, int argument_96_, int argument_97_, int argument_98_) {
        if (argument_96_ <= 107)
            method3131(-118, -23, -3, 23, -2, 6, 59, -38, 66, 13);
        this.anIntArrayArray1750[argument_95_][argument_97_] = MathStatics.AND((this.anIntArrayArray1750[argument_95_][argument_97_]), argument_98_ ^ 0xffffffff);
    }

    final void method3144(int argument_99_, int argument_100_, int argument_101_, byte argument_102_, boolean argument_103_, int argument_104_, boolean argument_105_) {
        argument_101_ -= this.anInt1746;
        argument_104_ -= this.anInt1743;
        if (argument_102_ != -84)
            this.anInt1747 = 106;
        if (argument_100_ == 0) {
            if (argument_99_ == 0) {
                method3143(argument_101_, 127, argument_104_, 128);
                method3143(argument_101_ - 1, 112, argument_104_, 8);
            }
            if (argument_99_ == 1) {
                method3143(argument_101_, 123, argument_104_, 2);
                method3143(argument_101_, 123, argument_104_ + 1, 32);
            }
            if (argument_99_ == 2) {
                method3143(argument_101_, argument_102_ ^ ~0x29, argument_104_, 8);
                method3143(argument_101_ + 1, 121, argument_104_, 128);
            }
            if (argument_99_ == 3) {
                method3143(argument_101_, argument_102_ ^ ~0x2b, argument_104_, 32);
                method3143(argument_101_, 118, argument_104_ - 1, 2);
            }
        }
        if (argument_100_ == 1 || argument_100_ == 3) {
            if (argument_99_ == 0) {
                method3143(argument_101_, 110, argument_104_, 1);
                method3143(argument_101_ - 1, 121, argument_104_ + 1, 16);
            }
            if (argument_99_ == 1) {
                method3143(argument_101_, 123, argument_104_, 4);
                method3143(argument_101_ + 1, 126, argument_104_ + 1, 64);
            }
            if (argument_99_ == 2) {
                method3143(argument_101_, 119, argument_104_, 16);
                method3143(argument_101_ + 1, 110, argument_104_ - 1, 1);
            }
            if (argument_99_ == 3) {
                method3143(argument_101_, 123, argument_104_, 64);
                method3143(argument_101_ - 1, 120, argument_104_ - 1, 4);
            }
        }
        if (argument_100_ == 2) {
            if (argument_99_ == 0) {
                method3143(argument_101_, 118, argument_104_, 130);
                method3143(argument_101_ - 1, 124, argument_104_, 8);
                method3143(argument_101_, 113, argument_104_ + 1, 32);
            }
            if (argument_99_ == 1) {
                method3143(argument_101_, 119, argument_104_, 10);
                method3143(argument_101_, 114, argument_104_ + 1, 32);
                method3143(argument_101_ + 1, 125, argument_104_, 128);
            }
            if (argument_99_ == 2) {
                method3143(argument_101_, 110, argument_104_, 40);
                method3143(argument_101_ + 1, argument_102_ + 207, argument_104_, 128);
                method3143(argument_101_, 121, argument_104_ - 1, 2);
            }
            if (argument_99_ == 3) {
                method3143(argument_101_, 120, argument_104_, 160);
                method3143(argument_101_, 108, argument_104_ - 1, 2);
                method3143(argument_101_ - 1, argument_102_ ^ ~0x3e, argument_104_, 8);
            }
        }
        if (argument_105_) {
            if (argument_100_ == 0) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, argument_102_ ^ ~0x3c, argument_104_, 65536);
                    method3143(argument_101_ - 1, argument_102_ ^ ~0x28, argument_104_, 4096);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, 122, argument_104_, 1024);
                    method3143(argument_101_, 120, argument_104_ + 1, 16384);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, argument_102_ + 193, argument_104_, 4096);
                    method3143(argument_101_ + 1, 125, argument_104_, 65536);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, 118, argument_104_, 16384);
                    method3143(argument_101_, 119, argument_104_ - 1, 1024);
                }
            }
            if (argument_100_ == 1 || argument_100_ == 3) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, 117, argument_104_, 512);
                    method3143(argument_101_ - 1, 123, argument_104_ + 1, 8192);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, argument_102_ ^ ~0x21, argument_104_, 2048);
                    method3143(argument_101_ + 1, 121, argument_104_ + 1, 32768);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, argument_102_ + 207, argument_104_, 8192);
                    method3143(argument_101_ + 1, 110, argument_104_ - 1, 512);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, 122, argument_104_, 32768);
                    method3143(argument_101_ - 1, 112, argument_104_ - 1, 2048);
                }
            }
            if (argument_100_ == 2) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, 120, argument_104_, 66560);
                    method3143(argument_101_ - 1, argument_102_ + 192, argument_104_, 4096);
                    method3143(argument_101_, 123, argument_104_ + 1, 16384);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, 118, argument_104_, 5120);
                    method3143(argument_101_, argument_102_ ^ ~0x23, argument_104_ + 1, 16384);
                    method3143(argument_101_ + 1, argument_102_ ^ ~0x25, argument_104_, 65536);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, 121, argument_104_, 20480);
                    method3143(argument_101_ + 1, 125, argument_104_, 65536);
                    method3143(argument_101_, 108, argument_104_ - 1, 1024);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, 121, argument_104_, 81920);
                    method3143(argument_101_, argument_102_ + 207, argument_104_ - 1, 1024);
                    method3143(argument_101_ - 1, 112, argument_104_, 4096);
                }
            }
        }
        if (argument_103_) {
            if (argument_100_ == 0) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, 124, argument_104_, 536870912);
                    method3143(argument_101_ - 1, 108, argument_104_, 33554432);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, 120, argument_104_, 8388608);
                    method3143(argument_101_, argument_102_ + 209, argument_104_ + 1, 134217728);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, 111, argument_104_, 33554432);
                    method3143(argument_101_ + 1, 117, argument_104_, 536870912);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, 124, argument_104_, 134217728);
                    method3143(argument_101_, argument_102_ ^ ~0x20, argument_104_ - 1, 8388608);
                }
            }
            if (argument_100_ == 1 || argument_100_ == 3) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, 127, argument_104_, 4194304);
                    method3143(argument_101_ - 1, argument_102_ + 197, argument_104_ + 1, 67108864);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, 109, argument_104_, 16777216);
                    method3143(argument_101_ + 1, 115, argument_104_ + 1, 268435456);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, 115, argument_104_, 67108864);
                    method3143(argument_101_ + 1, 122, argument_104_ - 1, 4194304);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, 123, argument_104_, 268435456);
                    method3143(argument_101_ - 1, 115, argument_104_ - 1, 16777216);
                }
            }
            if (argument_100_ == 2) {
                if (argument_99_ == 0) {
                    method3143(argument_101_, 114, argument_104_, 545259520);
                    method3143(argument_101_ - 1, 122, argument_104_, 33554432);
                    method3143(argument_101_, 115, argument_104_ + 1, 134217728);
                }
                if (argument_99_ == 1) {
                    method3143(argument_101_, 118, argument_104_, 41943040);
                    method3143(argument_101_, 108, argument_104_ + 1, 134217728);
                    method3143(argument_101_ + 1, argument_102_ + 203, argument_104_, 536870912);
                }
                if (argument_99_ == 2) {
                    method3143(argument_101_, 127, argument_104_, 167772160);
                    method3143(argument_101_ + 1, 122, argument_104_, 536870912);
                    method3143(argument_101_, argument_102_ ^ ~0x25, argument_104_ - 1, 8388608);
                }
                if (argument_99_ == 3) {
                    method3143(argument_101_, argument_102_ ^ ~0x2e, argument_104_, 671088640);
                    method3143(argument_101_, 115, argument_104_ - 1, 8388608);
                    method3143(argument_101_ - 1, argument_102_ + 192, argument_104_, 33554432);
                }
            }
        }
    }
}
