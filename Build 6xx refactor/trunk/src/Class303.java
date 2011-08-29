/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class303 {
    static byte[][][] tileSettings;
    int mapHeight;
    byte[][][] aByteArrayArrayArray2553;
    private byte[][][] tileShape;
    int mapWidth;
    private byte[][][] tileOverlay;
    private int[] anIntArray2557;
    byte[][][] aByteArrayArrayArray2558;
    private Class297 aClass297_2559;
    private int[] anIntArray2560 = {0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256};
    boolean aBoolean2561;
    int[][][] heightMap;
    private byte[][][] tileShapeRotation;
    int mapDepth;
    private byte[][][] tileUnderlay;
    private Class51 aClass51_2566;
    static Class114 aClass114_2567;

    public static void method3563(byte argument) {
        aClass114_2567 = null;
    }

    final void method3564(int argument_0_, int argument_1_, int argument_2_, int argument_3_, boolean argument_4_) {
        for (int anLocalInt = 0; anLocalInt < this.mapHeight; anLocalInt++)
            method3571(argument_3_, argument_2_, anLocalInt, argument_0_, argument_1_, (byte) 111);
    }

    private final void method3565(int[][] argument_5_, Class_s argument_6_, int argument_7_, GraphicsToolkit argument_8_, int argument_9_, Class_s argument_10_, Class_s argument_11_) {
        byte[][] anLocalInts = tileShape[argument_7_];
        byte[][] anLocalInts_12_ = tileShapeRotation[argument_7_];
        int anLocalInt = -43 / ((argument_9_ + 79) / 37);
        byte[][] anLocalInts_13_ = tileUnderlay[argument_7_];
        byte[][] anLocalInts_14_ = tileOverlay[argument_7_];
        for (int anLocalInt_15_ = 0; this.mapWidth > anLocalInt_15_; anLocalInt_15_++) {
            int anLocalInt_16_ = (anLocalInt_15_ < this.mapWidth - 1 ? anLocalInt_15_ + 1 : anLocalInt_15_);
            for (int anLocalInt_17_ = 0; this.mapDepth > anLocalInt_17_; anLocalInt_17_++) {
                int anLocalInt_18_ = (anLocalInt_17_ >= this.mapDepth - 1 ? anLocalInt_17_ : anLocalInt_17_ + 1);
                if (Class2_Sub6.anInt3790 == -1 || Class239.method3126(anLocalInt_17_, anLocalInt_15_, Class2_Sub6.anInt3790, false, argument_7_)) {
                    boolean anLocalBoolean = false;
                    boolean anLocalBoolean_19_ = false;
                    boolean[] anLocalBooleans = new boolean[4];
                    byte anLocalInt_20_ = anLocalInts[anLocalInt_15_][anLocalInt_17_];
                    int anLocalInt_21_ = anLocalInts_12_[anLocalInt_15_][anLocalInt_17_];
                    int anLocalInt_22_ = (anLocalInts_14_[anLocalInt_15_][anLocalInt_17_] & 0xff);
                    int anLocalInt_23_ = (anLocalInts_13_[anLocalInt_15_][anLocalInt_17_] & 0xff);
                    int anLocalInt_24_ = (anLocalInts_13_[anLocalInt_15_][anLocalInt_18_] & 0xff);
                    int anLocalInt_25_ = (anLocalInts_13_[anLocalInt_16_][anLocalInt_18_] & 0xff);
                    int anLocalInt_26_ = (anLocalInts_13_[anLocalInt_16_][anLocalInt_17_] & 0xff);
                    if (anLocalInt_22_ != 0 || anLocalInt_23_ != 0) {
                        Class50 class50 = (anLocalInt_22_ != 0 ? aClass51_2566.method476(anLocalInt_22_ - 1, (byte) 87) : null);
                        Class260 class260 = (anLocalInt_23_ != 0 ? aClass297_2559.method3512(18912, anLocalInt_23_ - 1) : null);
                        if (anLocalInt_20_ == 0 && class50 == null)
                            anLocalInt_20_ = (byte) 12;
                        Class50 class50_27_ = class50;
                        if (class50 != null) {
                            if (class50.anInt376 != -1 || class50.anInt378 != -1) {
                                if (class260 != null && anLocalInt_20_ != 0)
                                    anLocalBoolean_19_ = class50.aBoolean375;
                            } else {
                                class50_27_ = class50;
                                class50 = null;
                            }
                        }
                        if ((anLocalInt_20_ == 0 || anLocalInt_20_ == 12) && anLocalInt_15_ > 0 && anLocalInt_17_ > 0 && this.mapWidth > anLocalInt_15_ && this.mapDepth > anLocalInt_17_) {
                            int anLocalInt_28_ = 0;
                            int anLocalInt_29_ = 0;
                            int anLocalInt_30_ = 0;
                            int anLocalInt_31_ = 0;
                            anLocalInt_29_ = (anLocalInt_29_ - (anLocalInt_23_ != (anLocalInts_13_[anLocalInt_16_][anLocalInt_17_ - 1]) ? 1 : 1));
                            anLocalInt_28_ = (anLocalInt_28_ - ((anLocalInts_13_[anLocalInt_15_ - 1][anLocalInt_17_ - 1]) != anLocalInt_23_ ? 1 : 1));
                            anLocalInt_30_ = (anLocalInt_30_ - ((anLocalInts_13_[anLocalInt_16_][anLocalInt_18_]) != anLocalInt_23_ ? 1 : 1));
                            if ((anLocalInts_13_[anLocalInt_15_][anLocalInt_17_ - 1]) == anLocalInt_23_) {
                                anLocalInt_28_++;
                                anLocalInt_29_++;
                            } else {
                                anLocalInt_28_--;
                                anLocalInt_29_--;
                            }
                            anLocalInt_31_ = (anLocalInt_31_ - (anLocalInt_23_ != (anLocalInts_13_[anLocalInt_15_ - 1][anLocalInt_18_]) ? 1 : 1));
                            if (anLocalInt_23_ != (anLocalInts_13_[anLocalInt_16_][anLocalInt_17_])) {
                                anLocalInt_29_--;
                                anLocalInt_30_--;
                            } else {
                                anLocalInt_30_++;
                                anLocalInt_29_++;
                            }
                            if (anLocalInt_23_ == (anLocalInts_13_[anLocalInt_15_][anLocalInt_18_])) {
                                anLocalInt_31_++;
                                anLocalInt_30_++;
                            } else {
                                anLocalInt_31_--;
                                anLocalInt_30_--;
                            }
                            if (anLocalInt_23_ != (anLocalInts_13_[anLocalInt_15_ - 1][anLocalInt_17_])) {
                                anLocalInt_31_--;
                                anLocalInt_28_--;
                            } else {
                                anLocalInt_28_++;
                                anLocalInt_31_++;
                            }
                            int anLocalInt_32_ = anLocalInt_28_ - anLocalInt_30_;
                            if (anLocalInt_32_ < 0)
                                anLocalInt_32_ = -anLocalInt_32_;
                            int anLocalInt_33_ = -anLocalInt_31_ + anLocalInt_29_;
                            if (anLocalInt_33_ < 0)
                                anLocalInt_33_ = -anLocalInt_33_;
                            if (anLocalInt_33_ == anLocalInt_32_) {
                                anLocalInt_32_ = (argument_6_.method3534(anLocalInt_15_, false, anLocalInt_17_) - (argument_6_.method3534(anLocalInt_16_, false, anLocalInt_18_)));
                                anLocalInt_33_ = (argument_6_.method3534(anLocalInt_16_, false, anLocalInt_17_) - (argument_6_.method3534(anLocalInt_15_, false, anLocalInt_18_)));
                                if (anLocalInt_32_ < 0)
                                    anLocalInt_32_ = -anLocalInt_32_;
                                if (anLocalInt_33_ < 0)
                                    anLocalInt_33_ = -anLocalInt_33_;
                            }
                            anLocalInt_21_ = anLocalInt_33_ > anLocalInt_32_ ? 1 : 0;
                        }
                        for (int anLocalInt_34_ = 0; anLocalInt_34_ < 13; anLocalInt_34_++) {
                            Node_Sub31_Sub38.anIntArray6044[anLocalInt_34_] = -1;
                            Class6.anIntArray74[anLocalInt_34_] = 1;
                        }
                        boolean[] anLocalBooleans_35_ = ((class50 == null || !class50.aBoolean375) ? (Class194.aBooleanArrayArray1417[anLocalInt_20_]) : (Node_Sub9_Sub5.aBooleanArrayArray5808[anLocalInt_20_]));
                        method3569(anLocalInt_21_, this.mapDepth, this.mapWidth, anLocalInt_15_, anLocalInt_20_, class260, anLocalInts, argument_8_, 126, anLocalBooleans, class50, anLocalInts_14_, anLocalInt_17_, anLocalInts_12_);
                        boolean anLocalBoolean_36_ = (class50 != null && (class50.anInt376 != class50.anInt378));
                        if (!anLocalBoolean_36_) {
                            for (int anLocalInt_37_ = 0; anLocalInt_37_ < 8; anLocalInt_37_++) {
                                if ((Node_Sub31_Sub38.anIntArray6044[anLocalInt_37_]) >= 0 && (Class315.anIntArray2610[anLocalInt_37_] != (Node_Sub47_Sub7.anIntArray6192[anLocalInt_37_]))) {
                                    anLocalBoolean_36_ = true;
                                    break;
                                }
                            }
                        }
                        if (!anLocalBooleans_35_[anLocalInt_21_ + 1 & 0x3])
                            anLocalBooleans[1] = Class353.method3883(anLocalBooleans[1], (MathStatics.AND(Class6.anIntArray74[4], (Class6.anIntArray74[2]))) == 0);
                        if (!anLocalBooleans_35_[3 + anLocalInt_21_ & 0x3])
                            anLocalBooleans[3] = Class353.method3883(anLocalBooleans[3], (MathStatics.AND(Class6.anIntArray74[6], (Class6.anIntArray74[0]))) == 0);
                        if (!anLocalBooleans_35_[anLocalInt_21_ & 0x3])
                            anLocalBooleans[0] = Class353.method3883(anLocalBooleans[0], (MathStatics.AND(Class6.anIntArray74[2], (Class6.anIntArray74[0]))) == 0);
                        if (!anLocalBooleans_35_[anLocalInt_21_ + 2 & 0x3])
                            anLocalBooleans[2] = Class353.method3883(anLocalBooleans[2], (MathStatics.AND(Class6.anIntArray74[6], (Class6.anIntArray74[4]))) == 0);
                        if (!anLocalBoolean_19_ && (anLocalInt_20_ == 0 || anLocalInt_20_ == 12)) {
                            if (!anLocalBooleans[0] || anLocalBooleans[1] || anLocalBooleans[2] || !anLocalBooleans[3]) {
                                if (anLocalBooleans[0] && anLocalBooleans[1] && !anLocalBooleans[2] && !anLocalBooleans[3]) {
                                    anLocalInt_20_ = (anLocalInt_20_ == 0 ? (byte) 13 : (byte) 14);
                                    anLocalBooleans[0] = anLocalBooleans[1] = false;
                                    anLocalInt_21_ = 3;
                                } else if (!anLocalBooleans[0] && anLocalBooleans[1] && anLocalBooleans[2] && !anLocalBooleans[3]) {
                                    anLocalInt_21_ = 2;
                                    anLocalBooleans[1] = anLocalBooleans[2] = false;
                                    anLocalInt_20_ = (anLocalInt_20_ == 0 ? (byte) 13 : (byte) 14);
                                } else if (!anLocalBooleans[0] && !anLocalBooleans[1] && anLocalBooleans[2] && anLocalBooleans[3]) {
                                    anLocalInt_21_ = 1;
                                    anLocalInt_20_ = (anLocalInt_20_ == 0 ? (byte) 13 : (byte) 14);
                                    anLocalBooleans[2] = anLocalBooleans[3] = false;
                                }
                            } else {
                                anLocalInt_20_ = (anLocalInt_20_ == 0 ? (byte) 13 : (byte) 14);
                                anLocalInt_21_ = 0;
                                anLocalBooleans[0] = anLocalBooleans[3] = false;
                            }
                        }
                        boolean anLocalBoolean_38_ = (!anLocalBoolean_19_ && !anLocalBooleans[0] && !anLocalBooleans[2] && !anLocalBooleans[1] && !anLocalBooleans[3]);
                        int[] anLocalInts_39_ = null;
                        int[] anLocalInts_40_;
                        int anLocalInt_41_;
                        int[] anLocalInts_42_;
                        int[] anLocalInts_43_;
                        int anLocalInt_44_;
                        if (!anLocalBoolean_38_) {
                            if (anLocalBoolean_19_) {
                                anLocalInts_42_ = (Statics.anIntArrayArray1047[anLocalInt_20_]);
                                anLocalInts_39_ = (Class28.anIntArrayArray204[anLocalInt_20_]);
                                anLocalInt_41_ = class50 == null ? 0 : (Class253_Sub2.anIntArray5669[anLocalInt_20_]);
                                anLocalInts_43_ = (Class209.anIntArrayArray1496[anLocalInt_20_]);
                                anLocalInts_40_ = (Statics.anIntArrayArray6382[anLocalInt_20_]);
                                anLocalInt_44_ = (class260 == null ? 0 : (DoublyLinkedNodeP2_Sub4_Sub1.anIntArray6428[anLocalInt_20_]));
                            } else {
                                anLocalInt_41_ = class50 != null ? (Class297.anIntArray2471[anLocalInt_20_]) : 0;
                                anLocalInts_39_ = (Node_Sub37_Sub4.anIntArrayArray6133[anLocalInt_20_]);
                                anLocalInts_40_ = (Class22.anIntArrayArray146[anLocalInt_20_]);
                                anLocalInts_42_ = (Class37.anIntArrayArray273[anLocalInt_20_]);
                                anLocalInts_43_ = (Class112.anIntArrayArray922[anLocalInt_20_]);
                                anLocalInt_44_ = (class260 != null ? (Class373.anIntArray3202[anLocalInt_20_]) : 0);
                            }
                        } else {
                            anLocalInts_40_ = Class162.anIntArrayArray1189[anLocalInt_20_];
                            anLocalInt_41_ = class50 != null ? (Node_Sub37.anIntArray4167[anLocalInt_20_]) : 0;
                            anLocalInts_42_ = (Class62_Sub5.anIntArrayArray4382[anLocalInt_20_]);
                            anLocalInts_43_ = Statics.anIntArrayArray134[anLocalInt_20_];
                            anLocalInt_44_ = (class260 == null ? 0 : Class361.anIntArray3053[anLocalInt_20_]);
                        }
                        int anLocalInt_45_ = anLocalInt_41_ + anLocalInt_44_;
                        if (anLocalInt_45_ <= 0)
                            Class15.method301(argument_7_, anLocalInt_15_, anLocalInt_17_);
                        else {
                            if (anLocalBooleans[0])
                                anLocalInt_45_++;
                            if (anLocalBooleans[2])
                                anLocalInt_45_++;
                            if (anLocalBooleans[1])
                                anLocalInt_45_++;
                            if (anLocalBooleans[3])
                                anLocalInt_45_++;
                            int anLocalInt_46_ = 0;
                            int anLocalInt_47_ = 0;
                            int anLocalInt_48_ = anLocalInt_45_ * 3;
                            int[] anLocalInts_49_ = (!anLocalBoolean_36_ ? null : new int[anLocalInt_48_]);
                            int[] anLocalInts_50_ = new int[anLocalInt_48_];
                            int[] anLocalInts_51_ = new int[anLocalInt_48_];
                            int[] anLocalInts_52_ = new int[anLocalInt_48_];
                            int[] anLocalInts_53_ = new int[anLocalInt_48_];
                            int[] anLocalInts_54_ = new int[anLocalInt_48_];
                            int[] anLocalInts_55_ = (argument_10_ == null ? null : new int[anLocalInt_48_]);
                            int[] anLocalInts_56_ = (argument_10_ != null || argument_11_ != null ? new int[anLocalInt_48_] : null);
                            int anLocalInt_57_ = -1;
                            int anLocalInt_58_ = -1;
                            int anLocalInt_59_ = 256;
                            if (class50 != null) {
                                anLocalInt_58_ = class50.anInt369;
                                anLocalInt_57_ = class50.anInt376;
                                anLocalInt_59_ = class50.anInt367;
                                int anLocalInt_60_ = Statics.method3125(true, argument_8_, class50);
                                for (int anLocalInt_61_ = 0; anLocalInt_61_ < anLocalInt_41_; anLocalInt_61_++) {
                                    boolean anLocalBoolean_62_ = false;
                                    int anLocalInt_63_;
                                    if (anLocalBooleans[-anLocalInt_21_ & 0x3] && (anLocalInts_39_[0] == anLocalInt_46_)) {
                                        Node_Sub47_Sub7.anIntArray6187[0] = anLocalInts_42_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[1] = 1;
                                        Node_Sub47_Sub7.anIntArray6187[2] = anLocalInts_43_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[3] = 1;
                                        Node_Sub47_Sub7.anIntArray6187[4] = anLocalInts_40_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[5] = anLocalInts_43_[anLocalInt_46_];
                                        anLocalInt_63_ = 6;
                                    } else if ((anLocalBooleans[-anLocalInt_21_ + 2 & 0x3]) && (anLocalInts_39_[2] == anLocalInt_46_)) {
                                        Node_Sub47_Sub7.anIntArray6187[0] = anLocalInts_42_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[1] = 5;
                                        Node_Sub47_Sub7.anIntArray6187[2] = anLocalInts_43_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[3] = 5;
                                        Node_Sub47_Sub7.anIntArray6187[4] = anLocalInts_40_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[5] = anLocalInts_43_[anLocalInt_46_];
                                        anLocalInt_63_ = 6;
                                    } else if (!(anLocalBooleans[-anLocalInt_21_ + 1 & 0x3]) || (anLocalInt_46_ != anLocalInts_39_[1])) {
                                        if ((anLocalBooleans[-anLocalInt_21_ + 3 & 0x3]) && (anLocalInt_46_ == anLocalInts_39_[3])) {
                                            Node_Sub47_Sub7.anIntArray6187[0] = (anLocalInts_42_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[1] = 7;
                                            Node_Sub47_Sub7.anIntArray6187[2] = (anLocalInts_43_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[3] = 7;
                                            Node_Sub47_Sub7.anIntArray6187[4] = (anLocalInts_40_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[5] = (anLocalInts_43_[anLocalInt_46_]);
                                            anLocalInt_63_ = 6;
                                        } else {
                                            Node_Sub47_Sub7.anIntArray6187[0] = (anLocalInts_42_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[1] = (anLocalInts_40_[anLocalInt_46_]);
                                            anLocalInt_63_ = 3;
                                            Node_Sub47_Sub7.anIntArray6187[2] = (anLocalInts_43_[anLocalInt_46_]);
                                        }
                                    } else {
                                        Node_Sub47_Sub7.anIntArray6187[0] = anLocalInts_42_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[1] = 3;
                                        Node_Sub47_Sub7.anIntArray6187[2] = anLocalInts_43_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[3] = 3;
                                        Node_Sub47_Sub7.anIntArray6187[4] = anLocalInts_40_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[5] = anLocalInts_43_[anLocalInt_46_];
                                        anLocalInt_63_ = 6;
                                    }
                                    for (int anLocalInt_64_ = 0; anLocalInt_63_ > anLocalInt_64_; anLocalInt_64_++) {
                                        int anLocalInt_65_ = (Node_Sub47_Sub7.anIntArray6187[anLocalInt_64_]);
                                        int anLocalInt_66_ = ((-(anLocalInt_21_ * 2) + anLocalInt_65_) & 0x7);
                                        int anLocalInt_67_ = anIntArray2557[anLocalInt_65_];
                                        int anLocalInt_68_ = anIntArray2560[anLocalInt_65_];
                                        int anLocalInt_69_;
                                        int anLocalInt_70_;
                                        if (anLocalInt_21_ == 1) {
                                            anLocalInt_70_ = -anLocalInt_67_ + 512;
                                            anLocalInt_69_ = anLocalInt_68_;
                                        } else if (anLocalInt_21_ == 2) {
                                            anLocalInt_69_ = -anLocalInt_67_ + 512;
                                            anLocalInt_70_ = -anLocalInt_68_ + 512;
                                        } else if (anLocalInt_21_ != 3) {
                                            anLocalInt_69_ = anLocalInt_67_;
                                            anLocalInt_70_ = anLocalInt_68_;
                                        } else {
                                            anLocalInt_70_ = anLocalInt_67_;
                                            anLocalInt_69_ = -anLocalInt_68_ + 512;
                                        }
                                        anLocalInts_50_[anLocalInt_47_] = anLocalInt_69_;
                                        anLocalInts_51_[anLocalInt_47_] = anLocalInt_70_;
                                        if (anLocalInts_55_ != null && (Class369.aBooleanArrayArray3115[anLocalInt_20_][anLocalInt_65_])) {
                                            int anLocalInt_71_ = ((anLocalInt_15_ << 9) + anLocalInt_69_);
                                            int anLocalInt_72_ = (anLocalInt_70_ + (anLocalInt_17_ << 9));
                                            anLocalInts_55_[anLocalInt_47_] = ((argument_10_.method3541(anLocalInt_72_, 0, anLocalInt_71_)) - (argument_6_.method3541(anLocalInt_72_, 0, anLocalInt_71_)));
                                        }
                                        if (anLocalInts_56_ != null) {
                                            if (argument_10_ == null || (Class369.aBooleanArrayArray3115[anLocalInt_20_][anLocalInt_65_])) {
                                                if (argument_11_ != null && !(DoublyLinkedNode_Sub51_Sub19.aBooleanArrayArray6353[anLocalInt_20_][anLocalInt_65_])) {
                                                    int anLocalInt_73_ = ((anLocalInt_15_ << 9) + anLocalInt_69_);
                                                    int anLocalInt_74_ = (anLocalInt_70_ + (anLocalInt_17_ << 9));
                                                    anLocalInts_56_[anLocalInt_47_] = ((argument_11_.method3541(anLocalInt_74_, 0, anLocalInt_73_)) - (argument_6_.method3541(anLocalInt_74_, 0, anLocalInt_73_)));
                                                }
                                            } else {
                                                int anLocalInt_75_ = (anLocalInt_69_ + (anLocalInt_15_ << 9));
                                                int anLocalInt_76_ = (anLocalInt_70_ + (anLocalInt_17_ << 9));
                                                anLocalInts_56_[anLocalInt_47_] = ((argument_6_.method3541(anLocalInt_76_, 0, anLocalInt_75_)) - (argument_10_.method3541(anLocalInt_76_, 0, anLocalInt_75_)));
                                            }
                                        }
                                        if (anLocalInt_65_ < 8 && ((Node_Sub31_Sub38.anIntArray6044[anLocalInt_66_]) > (class50.anInt379))) {
                                            if (anLocalInts_49_ != null)
                                                anLocalInts_49_[anLocalInt_47_] = (Class315.anIntArray2610[anLocalInt_66_]);
                                            anLocalInts_54_[anLocalInt_47_] = (Class303_Sub1.anIntArray5409[anLocalInt_66_]);
                                            anLocalInts_53_[anLocalInt_47_] = (Class222.anIntArray1557[anLocalInt_66_]);
                                            anLocalInts_52_[anLocalInt_47_] = (Node_Sub47_Sub7.anIntArray6192[anLocalInt_66_]);
                                        } else {
                                            if (anLocalInts_49_ != null)
                                                anLocalInts_49_[anLocalInt_47_] = anLocalInt_60_;
                                            anLocalInts_53_[anLocalInt_47_] = class50.anInt369;
                                            anLocalInts_54_[anLocalInt_47_] = class50.anInt367;
                                            anLocalInts_52_[anLocalInt_47_] = anLocalInt_57_;
                                        }
                                        anLocalInt_47_++;
                                    }
                                    anLocalInt_46_++;
                                }
                                if (!this.aBoolean2561 && argument_7_ == 0)
                                    Node_Sub31_Sub3.method885(anLocalInt_15_, anLocalInt_17_, class50.anInt377, class50.anInt374 * 8, class50.anInt366);
                                if (anLocalInt_20_ != 12 && class50.anInt376 != -1 && class50.aBoolean370)
                                    anLocalBoolean = true;
                            } else if (anLocalBoolean_38_)
                                anLocalInt_46_ += (Node_Sub37.anIntArray4167[anLocalInt_20_]);
                            else if (!anLocalBoolean_19_)
                                anLocalInt_46_ += Class297.anIntArray2471[anLocalInt_20_];
                            else
                                anLocalInt_46_ += (Class253_Sub2.anIntArray5669[anLocalInt_20_]);
                            if (class260 != null) {
                                if (anLocalInt_24_ == 0)
                                    anLocalInt_24_ = anLocalInt_23_;
                                if (anLocalInt_26_ == 0)
                                    anLocalInt_26_ = anLocalInt_23_;
                                if (anLocalInt_25_ == 0)
                                    anLocalInt_25_ = anLocalInt_23_;
                                Class260 class260_77_ = aClass297_2559.method3512(18912, (anLocalInt_23_ - 1));
                                Class260 class260_78_ = aClass297_2559.method3512(18912, (anLocalInt_24_ - 1));
                                Class260 class260_79_ = aClass297_2559.method3512(18912, (anLocalInt_25_ - 1));
                                Class260 class260_80_ = aClass297_2559.method3512(18912, (anLocalInt_26_ - 1));
                                for (int anLocalInt_81_ = 0; anLocalInt_44_ > anLocalInt_81_; anLocalInt_81_++) {
                                    boolean anLocalBoolean_82_ = false;
                                    int anLocalInt_83_;
                                    if (anLocalBooleans[-anLocalInt_21_ & 0x3] && (anLocalInt_46_ == anLocalInts_39_[0])) {
                                        Node_Sub47_Sub7.anIntArray6187[0] = anLocalInts_42_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[1] = 1;
                                        Node_Sub47_Sub7.anIntArray6187[2] = anLocalInts_43_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[3] = 1;
                                        Node_Sub47_Sub7.anIntArray6187[4] = anLocalInts_40_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[5] = anLocalInts_43_[anLocalInt_46_];
                                        anLocalInt_83_ = 6;
                                    } else if (!(anLocalBooleans[-anLocalInt_21_ + 2 & 0x3]) || (anLocalInts_39_[2] != anLocalInt_46_)) {
                                        if ((anLocalBooleans[1 - anLocalInt_21_ & 0x3]) && (anLocalInt_46_ == anLocalInts_39_[1])) {
                                            Node_Sub47_Sub7.anIntArray6187[0] = (anLocalInts_42_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[1] = 3;
                                            Node_Sub47_Sub7.anIntArray6187[2] = (anLocalInts_43_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[3] = 3;
                                            Node_Sub47_Sub7.anIntArray6187[4] = (anLocalInts_40_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[5] = (anLocalInts_43_[anLocalInt_46_]);
                                            anLocalInt_83_ = 6;
                                        } else if (!(anLocalBooleans[(-anLocalInt_21_ + 3 & 0x3)]) || (anLocalInt_46_ != (anLocalInts_39_[3]))) {
                                            Node_Sub47_Sub7.anIntArray6187[0] = (anLocalInts_42_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[1] = (anLocalInts_40_[anLocalInt_46_]);
                                            anLocalInt_83_ = 3;
                                            Node_Sub47_Sub7.anIntArray6187[2] = (anLocalInts_43_[anLocalInt_46_]);
                                        } else {
                                            Node_Sub47_Sub7.anIntArray6187[0] = (anLocalInts_42_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[1] = 7;
                                            Node_Sub47_Sub7.anIntArray6187[2] = (anLocalInts_43_[anLocalInt_46_]);
                                            Node_Sub47_Sub7.anIntArray6187[3] = 7;
                                            Node_Sub47_Sub7.anIntArray6187[4] = (anLocalInts_40_[anLocalInt_46_]);
                                            anLocalInt_83_ = 6;
                                            Node_Sub47_Sub7.anIntArray6187[5] = (anLocalInts_43_[anLocalInt_46_]);
                                        }
                                    } else {
                                        Node_Sub47_Sub7.anIntArray6187[0] = anLocalInts_42_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[1] = 5;
                                        Node_Sub47_Sub7.anIntArray6187[2] = anLocalInts_43_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[3] = 5;
                                        Node_Sub47_Sub7.anIntArray6187[4] = anLocalInts_40_[anLocalInt_46_];
                                        Node_Sub47_Sub7.anIntArray6187[5] = anLocalInts_43_[anLocalInt_46_];
                                        anLocalInt_83_ = 6;
                                    }
                                    for (int anLocalInt_84_ = 0; anLocalInt_83_ > anLocalInt_84_; anLocalInt_84_++) {
                                        int anLocalInt_85_ = (Node_Sub47_Sub7.anIntArray6187[anLocalInt_84_]);
                                        int anLocalInt_86_ = ((-(anLocalInt_21_ * 2) + anLocalInt_85_) & 0x7);
                                        int anLocalInt_87_ = anIntArray2557[anLocalInt_85_];
                                        int anLocalInt_88_ = anIntArray2560[anLocalInt_85_];
                                        int anLocalInt_89_;
                                        int anLocalInt_90_;
                                        if (anLocalInt_21_ != 1) {
                                            if (anLocalInt_21_ != 2) {
                                                if (anLocalInt_21_ == 3) {
                                                    anLocalInt_90_ = 512 - anLocalInt_88_;
                                                    anLocalInt_89_ = anLocalInt_87_;
                                                } else {
                                                    anLocalInt_90_ = anLocalInt_87_;
                                                    anLocalInt_89_ = anLocalInt_88_;
                                                }
                                            } else {
                                                anLocalInt_89_ = -anLocalInt_88_ + 512;
                                                anLocalInt_90_ = 512 - anLocalInt_87_;
                                            }
                                        } else {
                                            anLocalInt_89_ = -anLocalInt_87_ + 512;
                                            anLocalInt_90_ = anLocalInt_88_;
                                        }
                                        anLocalInts_50_[anLocalInt_47_] = anLocalInt_90_;
                                        anLocalInts_51_[anLocalInt_47_] = anLocalInt_89_;
                                        if (anLocalInts_55_ != null && (Class369.aBooleanArrayArray3115[anLocalInt_20_][anLocalInt_85_])) {
                                            int anLocalInt_91_ = ((anLocalInt_15_ << 9) + anLocalInt_90_);
                                            int anLocalInt_92_ = (anLocalInt_89_ + (anLocalInt_17_ << 9));
                                            anLocalInts_55_[anLocalInt_47_] = ((argument_10_.method3541(anLocalInt_92_, 0, anLocalInt_91_)) - (argument_6_.method3541(anLocalInt_92_, 0, anLocalInt_91_)));
                                        }
                                        if (anLocalInts_56_ != null) {
                                            if (argument_10_ != null && !(Class369.aBooleanArrayArray3115[anLocalInt_20_][anLocalInt_85_])) {
                                                int anLocalInt_93_ = (anLocalInt_90_ + (anLocalInt_15_ << 9));
                                                int anLocalInt_94_ = (anLocalInt_89_ + (anLocalInt_17_ << 9));
                                                anLocalInts_56_[anLocalInt_47_] = ((argument_6_.method3541(anLocalInt_94_, 0, anLocalInt_93_)) - (argument_10_.method3541(anLocalInt_94_, 0, anLocalInt_93_)));
                                            } else if (argument_11_ != null && !(DoublyLinkedNode_Sub51_Sub19.aBooleanArrayArray6353[anLocalInt_20_][anLocalInt_85_])) {
                                                int anLocalInt_95_ = ((anLocalInt_15_ << 9) + anLocalInt_90_);
                                                int anLocalInt_96_ = ((anLocalInt_17_ << 9) + anLocalInt_89_);
                                                anLocalInts_56_[anLocalInt_47_] = ((argument_11_.method3541(anLocalInt_96_, 0, anLocalInt_95_)) - (argument_6_.method3541(anLocalInt_96_, 0, anLocalInt_95_)));
                                            }
                                        }
                                        if (anLocalInt_85_ < 8 && (Node_Sub31_Sub38.anIntArray6044[anLocalInt_86_]) >= 0) {
                                            if (anLocalInts_49_ != null)
                                                anLocalInts_49_[anLocalInt_47_] = (Class315.anIntArray2610[anLocalInt_86_]);
                                            anLocalInts_54_[anLocalInt_47_] = (Class303_Sub1.anIntArray5409[anLocalInt_86_]);
                                            anLocalInts_53_[anLocalInt_47_] = (Class222.anIntArray1557[anLocalInt_86_]);
                                            anLocalInts_52_[anLocalInt_47_] = (Node_Sub47_Sub7.anIntArray6192[anLocalInt_86_]);
                                        } else {
                                            if (anLocalBoolean_19_ && (Class369.aBooleanArrayArray3115[anLocalInt_20_][anLocalInt_85_])) {
                                                anLocalInts_53_[anLocalInt_47_] = anLocalInt_58_;
                                                anLocalInts_54_[anLocalInt_47_] = anLocalInt_59_;
                                                anLocalInts_52_[anLocalInt_47_] = anLocalInt_57_;
                                            } else if (anLocalInt_90_ == 0 && (anLocalInt_89_ == 0)) {
                                                anLocalInts_52_[anLocalInt_47_] = (argument_5_[anLocalInt_15_][anLocalInt_17_]);
                                                anLocalInts_53_[anLocalInt_47_] = class260_77_.anInt2029;
                                                anLocalInts_54_[anLocalInt_47_] = class260_77_.anInt2037;
                                            } else if (anLocalInt_90_ != 0 || (anLocalInt_89_ != 512)) {
                                                if (anLocalInt_90_ != 512 || anLocalInt_89_ != 512) {
                                                    if (anLocalInt_90_ == 512 && (anLocalInt_89_ == 0)) {
                                                        anLocalInts_52_[anLocalInt_47_] = (argument_5_[anLocalInt_16_][anLocalInt_17_]);
                                                        anLocalInts_53_[anLocalInt_47_] = (class260_80_.anInt2029);
                                                        anLocalInts_54_[anLocalInt_47_] = (class260_80_.anInt2037);
                                                    } else {
                                                        if (anLocalInt_90_ < 256) {
                                                            if (anLocalInt_89_ >= 256) {
                                                                anLocalInts_53_[anLocalInt_47_] = (class260_78_.anInt2029);
                                                                anLocalInts_54_[anLocalInt_47_] = (class260_78_.anInt2037);
                                                            } else {
                                                                anLocalInts_53_[anLocalInt_47_] = (class260_77_.anInt2029);
                                                                anLocalInts_54_[anLocalInt_47_] = (class260_77_.anInt2037);
                                                            }
                                                        } else if (anLocalInt_89_ < 256) {
                                                            anLocalInts_53_[anLocalInt_47_] = (class260_80_.anInt2029);
                                                            anLocalInts_54_[anLocalInt_47_] = (class260_80_.anInt2037);
                                                        } else {
                                                            anLocalInts_53_[anLocalInt_47_] = (class260_79_.anInt2029);
                                                            anLocalInts_54_[anLocalInt_47_] = (class260_79_.anInt2037);
                                                        }
                                                        int anLocalInt_97_ = (Statics.method1497((argument_5_[anLocalInt_15_][anLocalInt_17_]), (anLocalInt_90_ << 7 >> 9), -22459, (argument_5_[anLocalInt_16_][anLocalInt_17_])));
                                                        int anLocalInt_98_ = (Statics.method1497((argument_5_[anLocalInt_15_][anLocalInt_18_]), (anLocalInt_90_ << 7 >> 9), -22459, (argument_5_[anLocalInt_16_][anLocalInt_18_])));
                                                        anLocalInts_52_[anLocalInt_47_] = (Statics.method1497(anLocalInt_97_, (anLocalInt_89_ << 7 >> 9), -22459, anLocalInt_98_));
                                                    }
                                                } else {
                                                    anLocalInts_52_[anLocalInt_47_] = (argument_5_[anLocalInt_16_][anLocalInt_18_]);
                                                    anLocalInts_53_[anLocalInt_47_] = (class260_79_.anInt2029);
                                                    anLocalInts_54_[anLocalInt_47_] = (class260_79_.anInt2037);
                                                }
                                            } else {
                                                anLocalInts_52_[anLocalInt_47_] = (argument_5_[anLocalInt_15_][anLocalInt_18_]);
                                                anLocalInts_53_[anLocalInt_47_] = class260_78_.anInt2029;
                                                anLocalInts_54_[anLocalInt_47_] = class260_78_.anInt2037;
                                            }
                                            if (anLocalInts_49_ != null)
                                                anLocalInts_49_[anLocalInt_47_] = (anLocalInts_52_[anLocalInt_47_]);
                                        }
                                        anLocalInt_47_++;
                                    }
                                    anLocalInt_46_++;
                                }
                                if (anLocalInt_20_ != 0 && class260.aBoolean2032)
                                    anLocalBoolean = true;
                            }
                            int anLocalInt_99_ = argument_6_.method3534(anLocalInt_15_, false, anLocalInt_17_);
                            int anLocalInt_100_ = argument_6_.method3534(anLocalInt_16_, false, anLocalInt_17_);
                            int anLocalInt_101_ = argument_6_.method3534(anLocalInt_16_, false, anLocalInt_18_);
                            int anLocalInt_102_ = argument_6_.method3534(anLocalInt_15_, false, anLocalInt_18_);
                            boolean anLocalBoolean_103_ = Class274.method3388(anLocalInt_15_, anLocalInt_17_, 1);
                            if (anLocalBoolean_103_ && argument_7_ > 1 || !anLocalBoolean_103_ && argument_7_ > 0) {
                                boolean anLocalBoolean_104_ = true;
                                if (class260 != null && !class260.aBoolean2035)
                                    anLocalBoolean_104_ = false;
                                else if (anLocalInt_23_ == 0 && anLocalInt_20_ != 0)
                                    anLocalBoolean_104_ = false;
                                else if (anLocalInt_22_ > 0 && class50_27_ != null && !(class50_27_.aBoolean364))
                                    anLocalBoolean_104_ = false;
                                if (anLocalBoolean_104_ && anLocalInt_100_ == anLocalInt_99_ && anLocalInt_99_ == anLocalInt_101_ && anLocalInt_99_ == anLocalInt_102_)
                                    this.aByteArrayArrayArray2558[argument_7_][anLocalInt_15_][anLocalInt_17_] = (byte) (MathStatics.OR((this.aByteArrayArrayArray2558[argument_7_][anLocalInt_15_][anLocalInt_17_]), 4));
                            }
                            int anLocalInt_105_ = 0;
                            int anLocalInt_106_ = 0;
                            int anLocalInt_107_ = 0;
                            if (this.aBoolean2561) {
                                anLocalInt_105_ = (Node_Sub47_Sub6.method1127(anLocalInt_15_, anLocalInt_17_));
                                anLocalInt_106_ = Class62_Sub2.method1352(anLocalInt_15_, anLocalInt_17_);
                                anLocalInt_107_ = (DoublyLinkedNode_Sub51_Sub12.method1255(anLocalInt_15_, anLocalInt_17_));
                            }
                            argument_6_.U(anLocalInt_15_, anLocalInt_17_, anLocalInts_50_, anLocalInts_55_, anLocalInts_51_, anLocalInts_56_, anLocalInts_52_, anLocalInts_49_, anLocalInts_53_, anLocalInts_54_, anLocalInt_105_, anLocalInt_106_, anLocalInt_107_, anLocalBoolean);
                            Class15.method301(argument_7_, anLocalInt_15_, anLocalInt_17_);
                        }
                    }
                }
            }
        }
    }

    static final String method3566(Packet argument, int argument_108_) {
        return Class201.method2915(false, 32767, argument);
    }

    final void method3567(Class_s argument_109_, Class_s argument_110_, int argument_111_, GraphicsToolkit argument_112_) {
        if (Class101.anIntArray823 == null || Class101.anIntArray823.length != this.mapDepth) {
            DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446 = new int[this.mapDepth];
            Class111_Sub1.anIntArray4613 = new int[this.mapDepth];
            Node_Sub31_Sub29.anIntArray5979 = new int[this.mapDepth];
            Class101.anIntArray823 = new int[this.mapDepth];
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859 = new int[this.mapDepth];
        }
        int[][] anLocalInts = (new int[this.mapWidth]
                [this.mapDepth]);
        for (int anLocalInt = 0; this.mapHeight > anLocalInt; anLocalInt++) {
            for (int anLocalInt_113_ = 0; anLocalInt_113_ < this.mapDepth; anLocalInt_113_++) {
                Class101.anIntArray823[anLocalInt_113_] = 0;
                Node_Sub31_Sub29.anIntArray5979[anLocalInt_113_] = 0;
                DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446[anLocalInt_113_] = 0;
                Class111_Sub1.anIntArray4613[anLocalInt_113_] = 0;
                DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859[anLocalInt_113_] = 0;
            }
            for (int anLocalInt_114_ = -5; this.mapWidth > anLocalInt_114_; anLocalInt_114_++) {
                for (int anLocalInt_115_ = 0; anLocalInt_115_ < this.mapDepth; anLocalInt_115_++) {
                    int anLocalInt_116_ = anLocalInt_114_ + 5;
                    if (anLocalInt_116_ < this.mapWidth) {
                        int anLocalInt_117_ = ((tileUnderlay[anLocalInt][anLocalInt_116_][anLocalInt_115_]) & 0xff);
                        if (anLocalInt_117_ > 0) {
                            Class260 class260 = aClass297_2559.method3512(18912, anLocalInt_117_ - 1);
                            Class101.anIntArray823[anLocalInt_115_] += class260.anInt2030;
                            Node_Sub31_Sub29.anIntArray5979[anLocalInt_115_] += class260.anInt2036;
                            DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446[anLocalInt_115_] += class260.anInt2028;
                            Class111_Sub1.anIntArray4613[anLocalInt_115_] += class260.anInt2033;
                            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859[anLocalInt_115_]++;
                        }
                    }
                    int anLocalInt_118_ = anLocalInt_114_ - 5;
                    if (anLocalInt_118_ >= 0) {
                        int anLocalInt_119_ = ((tileUnderlay[anLocalInt][anLocalInt_118_][anLocalInt_115_]) & 0xff);
                        if (anLocalInt_119_ > 0) {
                            Class260 class260 = aClass297_2559.method3512(18912, anLocalInt_119_ - 1);
                            Class101.anIntArray823[anLocalInt_115_] -= class260.anInt2030;
                            Node_Sub31_Sub29.anIntArray5979[anLocalInt_115_] -= class260.anInt2036;
                            DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446[anLocalInt_115_] -= class260.anInt2028;
                            Class111_Sub1.anIntArray4613[anLocalInt_115_] -= class260.anInt2033;
                            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859[anLocalInt_115_]--;
                        }
                    }
                }
                if (anLocalInt_114_ >= 0) {
                    int anLocalInt_120_ = 0;
                    int anLocalInt_121_ = 0;
                    int anLocalInt_122_ = 0;
                    int anLocalInt_123_ = 0;
                    int anLocalInt_124_ = 0;
                    for (int anLocalInt_125_ = -5; anLocalInt_125_ < this.mapDepth; anLocalInt_125_++) {
                        int anLocalInt_126_ = anLocalInt_125_ + 5;
                        if (anLocalInt_126_ < this.mapDepth) {
                            anLocalInt_120_ += Class101.anIntArray823[anLocalInt_126_];
                            anLocalInt_122_ += (DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446[anLocalInt_126_]);
                            anLocalInt_121_ += (Node_Sub31_Sub29.anIntArray5979[anLocalInt_126_]);
                            anLocalInt_124_ += (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859[anLocalInt_126_]);
                            anLocalInt_123_ += (Class111_Sub1.anIntArray4613[anLocalInt_126_]);
                        }
                        int anLocalInt_127_ = anLocalInt_125_ - 5;
                        if (anLocalInt_127_ >= 0) {
                            anLocalInt_121_ -= (Node_Sub31_Sub29.anIntArray5979[anLocalInt_127_]);
                            anLocalInt_124_ -= (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anIntArray6859[anLocalInt_127_]);
                            anLocalInt_122_ -= (DoublyLinkedNodeP2_Sub4_Sub2.anIntArray6446[anLocalInt_127_]);
                            anLocalInt_120_ -= Class101.anIntArray823[anLocalInt_127_];
                            anLocalInt_123_ -= (Class111_Sub1.anIntArray4613[anLocalInt_127_]);
                        }
                        if (anLocalInt_125_ >= 0 && anLocalInt_123_ > 0 && anLocalInt_124_ > 0)
                            anLocalInts[anLocalInt_114_][anLocalInt_125_] = (Node_Sub31_Sub22.method944(anLocalInt_122_ / anLocalInt_124_, anLocalInt_120_ * 256 / anLocalInt_123_, (byte) 104, anLocalInt_121_ / anLocalInt_124_));
                    }
                }
            }
            if (Class374.aBoolean3210)
                method3565(anLocalInts, Node_Sub31_Sub5.aClass_sArray5858[anLocalInt], anLocalInt, argument_112_, -124, anLocalInt == 0 ? argument_110_ : null, anLocalInt != 0 ? null : argument_109_);
            else
                method3572(anLocalInt == 0 ? argument_110_ : null, anLocalInts, anLocalInt != 0 ? null : argument_109_, argument_112_, -1, Node_Sub31_Sub5.aClass_sArray5858[anLocalInt], anLocalInt);
            tileUnderlay[anLocalInt] = null;
            tileOverlay[anLocalInt] = null;
            tileShape[anLocalInt] = null;
            tileShapeRotation[anLocalInt] = null;
        }
        if (!this.aBoolean2561) {
            if (Node_Sub44.anInt4252 != 0)
                Class73.method1540();
            if (Class305.aBoolean3641)
                BufferedFile.method3771();
        }
        for (int anLocalInt = 0; anLocalInt < this.mapHeight; anLocalInt++)
            Node_Sub31_Sub5.aClass_sArray5858[anLocalInt].YA();
    }

    final void method3568(ClipMap[] argument_128_, int[][][] argument_129_, int argument_130_, GraphicsToolkit argument_131_) {
        if (!this.aBoolean2561) {
            for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++) {
                for (int anLocalInt_132_ = 0; anLocalInt_132_ < this.mapWidth; anLocalInt_132_++) {
                    for (int anLocalInt_133_ = 0; this.mapDepth > anLocalInt_133_; anLocalInt_133_++) {
                        if (((tileSettings[anLocalInt][anLocalInt_132_][anLocalInt_133_]) & 0x1) != 0) {
                            int anLocalInt_134_ = anLocalInt;
                            if (((tileSettings[1][anLocalInt_132_][anLocalInt_133_]) & 0x2) != 0)
                                anLocalInt_134_--;
                            if (anLocalInt_134_ >= 0)
                                argument_128_[anLocalInt_134_].method3130(anLocalInt_133_, 2097152, anLocalInt_132_);
                        }
                    }
                }
            }
        }
        for (int anLocalInt = 0; anLocalInt < this.mapHeight; anLocalInt++) {
            int anLocalInt_135_ = 0;
            int anLocalInt_136_ = 0;
            if (!this.aBoolean2561) {
                if (Class50.aBoolean373)
                    anLocalInt_136_ |= 0x8;
                if (Class305.aBoolean3641)
                    anLocalInt_135_ |= 0x2;
                if (Node_Sub44.anInt4252 != 0) {
                    if (Node_Sub16.aBoolean3997 | anLocalInt == 0)
                        anLocalInt_136_ |= 0x10;
                    anLocalInt_135_ |= 0x1;
                }
            }
            if (Class305.aBoolean3641)
                anLocalInt_136_ |= 0x7;
            if (!tia_sub_35DoublyLinked.aBoolean6253)
                anLocalInt_136_ |= 0x20;
            int[][] anLocalInts = (argument_129_ == null || argument_129_.length <= anLocalInt ? this.heightMap[anLocalInt] : argument_129_[anLocalInt]);
            Class46_Sub2.method442(anLocalInt, argument_131_.method2085(this.mapWidth, this.mapDepth, (this.heightMap[anLocalInt]), anLocalInts, 512, anLocalInt_135_, anLocalInt_136_));
        }
    }

    private final void method3569(int argument_137_, int argument_138_, int argument_139_, int argument_140_, int argument_141_, Class260 argument_142_, byte[][] argument_143_, GraphicsToolkit argument_144_, int argument_145_, boolean[] argument_146_, Class50 argument_147_, byte[][] argument_148_, int argument_149_, byte[][] argument_150_) {
        boolean[] anLocalBooleans = (argument_147_ == null || !argument_147_.aBoolean375 ? Class194.aBooleanArrayArray1417[argument_141_] : Node_Sub9_Sub5.aBooleanArrayArray5808[argument_141_]);
        if (argument_149_ > 0) {
            if (argument_140_ > 0) {
                int anLocalInt = (argument_148_[argument_140_ - 1][argument_149_ - 1] & 0xff);
                if (anLocalInt > 0) {
                    Class50 class50 = aClass51_2566.method476(anLocalInt - 1, (byte) 82);
                    if (class50.anInt376 != -1 && class50.aBoolean375) {
                        byte anLocalInt_151_ = (argument_143_[argument_140_ - 1][argument_149_ - 1]);
                        int anLocalInt_152_ = (4 + (argument_150_[argument_140_ - 1][argument_149_ - 1]) * 2 & 0x7);
                        int anLocalInt_153_ = Statics.method3125(true, argument_144_, class50);
                        if (Class369.aBooleanArrayArray3115[anLocalInt_151_][anLocalInt_152_]) {
                            Node_Sub47_Sub7.anIntArray6192[0] = class50.anInt376;
                            Class315.anIntArray2610[0] = anLocalInt_153_;
                            Class222.anIntArray1557[0] = class50.anInt369;
                            Class303_Sub1.anIntArray5409[0] = class50.anInt367;
                            Node_Sub31_Sub38.anIntArray6044[0] = class50.anInt379;
                            Class6.anIntArray74[0] = 256;
                        }
                    }
                }
            }
            if (argument_140_ < argument_139_ - 1) {
                int anLocalInt = (argument_148_[argument_140_ + 1][argument_149_ - 1] & 0xff);
                if (anLocalInt > 0) {
                    Class50 class50 = aClass51_2566.method476(anLocalInt - 1, (byte) 107);
                    if (class50.anInt376 != -1 && class50.aBoolean375) {
                        byte anLocalInt_154_ = (argument_143_[argument_140_ + 1][argument_149_ - 1]);
                        int anLocalInt_155_ = (6 + (argument_150_[argument_140_ + 1][argument_149_ - 1]) * 2 & 0x7);
                        int anLocalInt_156_ = Statics.method3125(true, argument_144_, class50);
                        if (Class369.aBooleanArrayArray3115[anLocalInt_154_][anLocalInt_155_]) {
                            Node_Sub47_Sub7.anIntArray6192[2] = class50.anInt376;
                            Class315.anIntArray2610[2] = anLocalInt_156_;
                            Class222.anIntArray1557[2] = class50.anInt369;
                            Class303_Sub1.anIntArray5409[2] = class50.anInt367;
                            Node_Sub31_Sub38.anIntArray6044[2] = class50.anInt379;
                            Class6.anIntArray74[2] = 512;
                        }
                    }
                }
            }
        }
        if (argument_138_ - 1 > argument_149_) {
            if (argument_140_ > 0) {
                int anLocalInt = (argument_148_[argument_140_ - 1][argument_149_ + 1] & 0xff);
                if (anLocalInt > 0) {
                    Class50 class50 = aClass51_2566.method476(anLocalInt - 1, (byte) 122);
                    if (class50.anInt376 != -1 && class50.aBoolean375) {
                        byte anLocalInt_157_ = (argument_143_[argument_140_ - 1][argument_149_ + 1]);
                        int anLocalInt_158_ = ((argument_150_[argument_140_ - 1][argument_149_ + 1]) * 2 + 2 & 0x7);
                        int anLocalInt_159_ = Statics.method3125(true, argument_144_, class50);
                        if (Class369.aBooleanArrayArray3115[anLocalInt_157_][anLocalInt_158_]) {
                            Node_Sub47_Sub7.anIntArray6192[6] = class50.anInt376;
                            Class315.anIntArray2610[6] = anLocalInt_159_;
                            Class222.anIntArray1557[6] = class50.anInt369;
                            Class303_Sub1.anIntArray5409[6] = class50.anInt367;
                            Node_Sub31_Sub38.anIntArray6044[6] = class50.anInt379;
                            Class6.anIntArray74[6] = 64;
                        }
                    }
                }
            }
            if (argument_139_ - 1 > argument_140_) {
                int anLocalInt = (argument_148_[argument_140_ + 1][argument_149_ + 1] & 0xff);
                if (anLocalInt > 0) {
                    Class50 class50 = aClass51_2566.method476(anLocalInt - 1, (byte) 127);
                    if (class50.anInt376 != -1 && class50.aBoolean375) {
                        byte anLocalInt_160_ = (argument_143_[argument_140_ + 1][argument_149_ + 1]);
                        int anLocalInt_161_ = (argument_150_[argument_140_ + 1][argument_149_ + 1]) * 2 & 0x7;
                        int anLocalInt_162_ = Statics.method3125(true, argument_144_, class50);
                        if (Class369.aBooleanArrayArray3115[anLocalInt_160_][anLocalInt_161_]) {
                            Node_Sub47_Sub7.anIntArray6192[4] = class50.anInt376;
                            Class315.anIntArray2610[4] = anLocalInt_162_;
                            Class222.anIntArray1557[4] = class50.anInt369;
                            Class303_Sub1.anIntArray5409[4] = class50.anInt367;
                            Node_Sub31_Sub38.anIntArray6044[4] = class50.anInt379;
                            Class6.anIntArray74[4] = 128;
                        }
                    }
                }
            }
        }
        int anLocalInt = -117 / ((83 - argument_145_) / 34);
        if (argument_149_ > 0) {
            int anLocalInt_163_ = argument_148_[argument_140_][argument_149_ - 1] & 0xff;
            if (anLocalInt_163_ > 0) {
                Class50 class50 = aClass51_2566.method476(anLocalInt_163_ - 1, (byte) 94);
                if (class50.anInt376 != -1) {
                    byte anLocalInt_164_ = argument_143_[argument_140_][argument_149_ - 1];
                    int anLocalInt_165_ = argument_150_[argument_140_][argument_149_ - 1];
                    if (class50.aBoolean375) {
                        int anLocalInt_166_ = 2;
                        int anLocalInt_167_ = anLocalInt_165_ * 2 + 4;
                        int anLocalInt_168_ = Statics.method3125(true, argument_144_, class50);
                        for (int anLocalInt_169_ = 0; anLocalInt_169_ < 3; anLocalInt_169_++) {
                            anLocalInt_166_ &= 0x7;
                            anLocalInt_167_ &= 0x7;
                            if ((Class369.aBooleanArrayArray3115[anLocalInt_164_][anLocalInt_167_]) && (class50.anInt379 >= (Node_Sub31_Sub38.anIntArray6044[anLocalInt_166_]))) {
                                Node_Sub47_Sub7.anIntArray6192[anLocalInt_166_] = class50.anInt376;
                                Class315.anIntArray2610[anLocalInt_166_] = anLocalInt_168_;
                                Class222.anIntArray1557[anLocalInt_166_] = class50.anInt369;
                                Class303_Sub1.anIntArray5409[anLocalInt_166_] = class50.anInt367;
                                if ((Node_Sub31_Sub38.anIntArray6044[anLocalInt_166_]) == class50.anInt379)
                                    Class6.anIntArray74[anLocalInt_166_] = (MathStatics.OR((Class6.anIntArray74[anLocalInt_166_]), 32));
                                else
                                    Class6.anIntArray74[anLocalInt_166_] = 32;
                                Node_Sub31_Sub38.anIntArray6044[anLocalInt_166_] = class50.anInt379;
                            }
                            anLocalInt_166_--;
                            anLocalInt_167_++;
                        }
                        if (!anLocalBooleans[--argument_137_ & 0x3])
                            argument_146_[0] = (Node_Sub9_Sub5.aBooleanArrayArray5808[anLocalInt_164_][MathStatics.AND(3, anLocalInt_165_ + 2)]);
                    } else if (!anLocalBooleans[argument_137_ & 0x3])
                        argument_146_[0] = (Class194.aBooleanArrayArray1417[anLocalInt_164_][MathStatics.AND(3, anLocalInt_165_ + 2)]);
                }
            }
        }
        if (argument_138_ - 1 > argument_149_) {
            int anLocalInt_170_ = argument_148_[argument_140_][argument_149_ + 1] & 0xff;
            if (anLocalInt_170_ > 0) {
                Class50 class50 = aClass51_2566.method476(anLocalInt_170_ - 1, (byte) 92);
                if (class50.anInt376 != -1) {
                    byte anLocalInt_171_ = argument_143_[argument_140_][argument_149_ + 1];
                    int anLocalInt_172_ = argument_150_[argument_140_][argument_149_ + 1];
                    if (class50.aBoolean375) {
                        int anLocalInt_173_ = 4;
                        int anLocalInt_174_ = 2 + anLocalInt_172_ * 2;
                        int anLocalInt_175_ = Statics.method3125(true, argument_144_, class50);
                        for (int anLocalInt_176_ = 0; anLocalInt_176_ < 3; anLocalInt_176_++) {
                            anLocalInt_174_ &= 0x7;
                            anLocalInt_173_ &= 0x7;
                            if ((Class369.aBooleanArrayArray3115[anLocalInt_171_][anLocalInt_174_]) && (class50.anInt379 >= (Node_Sub31_Sub38.anIntArray6044[anLocalInt_173_]))) {
                                Node_Sub47_Sub7.anIntArray6192[anLocalInt_173_] = class50.anInt376;
                                Class315.anIntArray2610[anLocalInt_173_] = anLocalInt_175_;
                                Class222.anIntArray1557[anLocalInt_173_] = class50.anInt369;
                                Class303_Sub1.anIntArray5409[anLocalInt_173_] = class50.anInt367;
                                if (class50.anInt379 == (Node_Sub31_Sub38.anIntArray6044[anLocalInt_173_]))
                                    Class6.anIntArray74[anLocalInt_173_] = (MathStatics.OR((Class6.anIntArray74[anLocalInt_173_]), 16));
                                else
                                    Class6.anIntArray74[anLocalInt_173_] = 16;
                                Node_Sub31_Sub38.anIntArray6044[anLocalInt_173_] = class50.anInt379;
                            }
                            anLocalInt_173_++;
                            anLocalInt_174_--;
                        }
                        if (!anLocalBooleans[argument_137_ + 2 & 0x3])
                            argument_146_[2] = (Node_Sub9_Sub5.aBooleanArrayArray5808[anLocalInt_171_][MathStatics.AND(anLocalInt_172_, 3)]);
                    } else if (!anLocalBooleans[2 + argument_137_ & 0x3])
                        argument_146_[2] = (Class194.aBooleanArrayArray1417[anLocalInt_171_][MathStatics.AND(3, anLocalInt_172_)]);
                }
            }
        }
        if (argument_140_ > 0) {
            int anLocalInt_177_ = argument_148_[argument_140_ - 1][argument_149_] & 0xff;
            if (anLocalInt_177_ > 0) {
                Class50 class50 = aClass51_2566.method476(anLocalInt_177_ - 1, (byte) 82);
                if (class50.anInt376 != -1) {
                    byte anLocalInt_178_ = argument_143_[argument_140_ - 1][argument_149_];
                    int anLocalInt_179_ = argument_150_[argument_140_ - 1][argument_149_];
                    if (!class50.aBoolean375) {
                        if (!anLocalBooleans[argument_137_ + 3 & 0x3])
                            argument_146_[3] = (Class194.aBooleanArrayArray1417[anLocalInt_178_][MathStatics.AND(1 + anLocalInt_179_, 3)]);
                    } else {
                        int anLocalInt_180_ = 6;
                        int anLocalInt_181_ = 4 + anLocalInt_179_ * 2;
                        int anLocalInt_182_ = Statics.method3125(true, argument_144_, class50);
                        for (int anLocalInt_183_ = 0; anLocalInt_183_ < 3; anLocalInt_183_++) {
                            anLocalInt_180_ &= 0x7;
                            anLocalInt_181_ &= 0x7;
                            if ((Class369.aBooleanArrayArray3115[anLocalInt_178_][anLocalInt_181_]) && ((Node_Sub31_Sub38.anIntArray6044[anLocalInt_180_]) <= class50.anInt379)) {
                                Node_Sub47_Sub7.anIntArray6192[anLocalInt_180_] = class50.anInt376;
                                Class315.anIntArray2610[anLocalInt_180_] = anLocalInt_182_;
                                Class222.anIntArray1557[anLocalInt_180_] = class50.anInt369;
                                Class303_Sub1.anIntArray5409[anLocalInt_180_] = class50.anInt367;
                                if ((Node_Sub31_Sub38.anIntArray6044[anLocalInt_180_]) == class50.anInt379)
                                    Class6.anIntArray74[anLocalInt_180_] = (MathStatics.OR((Class6.anIntArray74[anLocalInt_180_]), 8));
                                else
                                    Class6.anIntArray74[anLocalInt_180_] = 8;
                                Node_Sub31_Sub38.anIntArray6044[anLocalInt_180_] = class50.anInt379;
                            }
                            anLocalInt_180_++;
                            anLocalInt_181_--;
                        }
                        if (!anLocalBooleans[3 + argument_137_ & 0x3])
                            argument_146_[3] = (Node_Sub9_Sub5.aBooleanArrayArray5808[anLocalInt_178_][MathStatics.AND(anLocalInt_179_ + 1, 3)]);
                    }
                }
            }
        }
        if (argument_140_ < argument_139_ - 1) {
            int anLocalInt_184_ = argument_148_[argument_140_ + 1][argument_149_] & 0xff;
            if (anLocalInt_184_ > 0) {
                Class50 class50 = aClass51_2566.method476(anLocalInt_184_ - 1, (byte) 87);
                if (class50.anInt376 != -1) {
                    byte anLocalInt_185_ = argument_143_[argument_140_ + 1][argument_149_];
                    int anLocalInt_186_ = argument_150_[argument_140_ + 1][argument_149_];
                    if (!class50.aBoolean375) {
                        if (!anLocalBooleans[argument_137_ + 1 & 0x3])
                            argument_146_[1] = (Class194.aBooleanArrayArray1417[anLocalInt_185_][MathStatics.AND(anLocalInt_186_ + 3, 3)]);
                    } else {
                        int anLocalInt_187_ = 4;
                        int anLocalInt_188_ = anLocalInt_186_ * 2 + 6;
                        int anLocalInt_189_ = Statics.method3125(true, argument_144_, class50);
                        for (int anLocalInt_190_ = 0; anLocalInt_190_ < 3; anLocalInt_190_++) {
                            anLocalInt_187_ &= 0x7;
                            anLocalInt_188_ &= 0x7;
                            if ((Class369.aBooleanArrayArray3115[anLocalInt_185_][anLocalInt_188_]) && (class50.anInt379 >= (Node_Sub31_Sub38.anIntArray6044[anLocalInt_187_]))) {
                                Node_Sub47_Sub7.anIntArray6192[anLocalInt_187_] = class50.anInt376;
                                Class315.anIntArray2610[anLocalInt_187_] = anLocalInt_189_;
                                Class222.anIntArray1557[anLocalInt_187_] = class50.anInt369;
                                Class303_Sub1.anIntArray5409[anLocalInt_187_] = class50.anInt367;
                                if (class50.anInt379 == (Node_Sub31_Sub38.anIntArray6044[anLocalInt_187_]))
                                    Class6.anIntArray74[anLocalInt_187_] = (MathStatics.OR((Class6.anIntArray74[anLocalInt_187_]), 4));
                                else
                                    Class6.anIntArray74[anLocalInt_187_] = 4;
                                Node_Sub31_Sub38.anIntArray6044[anLocalInt_187_] = class50.anInt379;
                            }
                            anLocalInt_187_--;
                            anLocalInt_188_++;
                        }
                        if (!anLocalBooleans[argument_137_ + 1 & 0x3])
                            argument_146_[1] = (Node_Sub9_Sub5.aBooleanArrayArray5808[anLocalInt_185_][MathStatics.AND(3, anLocalInt_186_ + 3)]);
                    }
                }
            }
        }
        if (argument_147_ != null) {
            int anLocalInt_191_ = Statics.method3125(true, argument_144_, argument_147_);
            if (argument_147_.aBoolean375) {
                for (int anLocalInt_192_ = 0; anLocalInt_192_ < 8; anLocalInt_192_++) {
                    int anLocalInt_193_ = -(argument_137_ * 2) + anLocalInt_192_ & 0x7;
                    if ((Class369.aBooleanArrayArray3115[argument_141_][anLocalInt_192_]) && (Node_Sub31_Sub38.anIntArray6044[anLocalInt_193_] <= argument_147_.anInt379)) {
                        Node_Sub47_Sub7.anIntArray6192[anLocalInt_193_] = argument_147_.anInt376;
                        Class315.anIntArray2610[anLocalInt_193_] = anLocalInt_191_;
                        Class222.anIntArray1557[anLocalInt_193_] = argument_147_.anInt369;
                        Class303_Sub1.anIntArray5409[anLocalInt_193_] = argument_147_.anInt367;
                        if (argument_147_.anInt379 == (Node_Sub31_Sub38.anIntArray6044[anLocalInt_193_]))
                            Class6.anIntArray74[anLocalInt_193_] = (MathStatics.OR(Class6.anIntArray74[anLocalInt_193_], 2));
                        else
                            Class6.anIntArray74[anLocalInt_193_] = 2;
                        Node_Sub31_Sub38.anIntArray6044[anLocalInt_193_] = argument_147_.anInt379;
                    }
                }
            }
        }
    }

    final void readTerrainMap(Packet argument_194_, ClipMap[] clipMaps, int mapLocalX, int baseX, int baseZ, int mapLocalZ) {
        if (!this.aBoolean2561) {
            for (int tileY = 0; tileY < 4; tileY++) {
                ClipMap clipMap = clipMaps[tileY];
                for (int tileX = 0; tileX < 64; tileX++) {
                    for (int tileZ = 0; tileZ < 64; tileZ++) {
                        int localX = mapLocalX + tileX;
                        int localZ = mapLocalZ + tileZ;
                        if (localX >= 0 && localX < this.mapWidth && localZ >= 0 && localZ < this.mapDepth)
                            clipMap.method3142(localZ, localX);
                    }
                }
            }
        }
        int mapAbsX = baseX + mapLocalX;
        int mapAbsZ = baseZ + mapLocalZ;
        for (int tileY = 0; tileY < this.mapHeight; tileY++) {
            for (int tileX = 0; tileX < 64; tileX++) {
                for (int tileZ = 0; tileZ < 64; tileZ++)
                    readTile(tileY, mapLocalX + tileX, mapLocalZ + tileZ, mapAbsX + tileX, mapAbsZ + tileZ, 0, 0, 0, false, argument_194_);
            }
        }
    }

    final void method3571(int argument_209_, int argument_210_, int argument_211_, int argument_212_, int argument_213_, byte argument_214_) {
        for (int anLocalInt = argument_209_; anLocalInt < argument_209_ + argument_210_; anLocalInt++) {
            for (int anLocalInt_215_ = argument_212_; anLocalInt_215_ < argument_212_ + argument_213_; anLocalInt_215_++) {
                if (anLocalInt_215_ >= 0 && anLocalInt_215_ < this.mapWidth && anLocalInt >= 0 && anLocalInt < this.mapDepth)
                    this.heightMap[argument_211_][anLocalInt_215_][anLocalInt] = (argument_211_ <= 0 ? 0 : (this.heightMap[argument_211_ - 1][anLocalInt_215_][anLocalInt]) - 960);
            }
        }
        if (argument_212_ > 0 && this.mapWidth > argument_212_) {
            for (int anLocalInt = argument_209_ + 1; anLocalInt < argument_210_ + argument_209_; anLocalInt++) {
                if (anLocalInt >= 0 && this.mapDepth > anLocalInt)
                    this.heightMap[argument_211_][argument_212_][anLocalInt] = (this.heightMap[argument_211_][argument_212_ - 1][anLocalInt]);
            }
        }
        if (argument_209_ > 0 && argument_209_ < this.mapDepth) {
            for (int anLocalInt = argument_212_ + 1; anLocalInt < argument_212_ + argument_213_; anLocalInt++) {
                if (anLocalInt >= 0 && anLocalInt < this.mapWidth)
                    this.heightMap[argument_211_][anLocalInt][argument_209_] = (this.heightMap[argument_211_][anLocalInt][argument_209_ - 1]);
            }
        }
        do {
            if (argument_212_ >= 0 && argument_209_ >= 0 && this.mapWidth > argument_212_ && this.mapDepth > argument_209_) {
                if (argument_211_ == 0) {
                    if (argument_212_ > 0 && ((this.heightMap[argument_211_][argument_212_ - 1][argument_209_]) != 0))
                        this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_ - 1][argument_209_]);
                    else if (argument_209_ <= 0 || (this.heightMap[argument_211_][argument_212_][argument_209_ - 1]) == 0) {
                        if (argument_212_ > 0 && argument_209_ > 0 && (this.heightMap[argument_211_][argument_212_ - 1][argument_209_ - 1]) != 0)
                            this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_ - 1][argument_209_ - 1]);
                    } else
                        this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_][argument_209_ - 1]);
                } else if (argument_212_ <= 0 || ((this.heightMap[argument_211_][argument_212_ - 1][argument_209_]) == (this.heightMap[argument_211_ - 1][argument_212_ - 1][argument_209_]))) {
                    if (argument_209_ > 0 && ((this.heightMap[argument_211_ - 1][argument_212_][argument_209_ - 1]) != (this.heightMap[argument_211_][argument_212_][argument_209_ - 1])))
                        this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_][argument_209_ - 1]);
                    else {
                        if (argument_212_ > 0 && argument_209_ > 0 && ((this.heightMap[argument_211_ - 1][argument_212_ - 1][argument_209_ - 1]) != (this.heightMap[argument_211_][argument_212_ - 1][argument_209_ - 1])))
                            this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_ - 1][argument_209_ - 1]);
                        break;
                    }
                } else
                    this.heightMap[argument_211_][argument_212_][argument_209_] = (this.heightMap[argument_211_][argument_212_ - 1][argument_209_]);
                break;
            }
        } while (false);
    }

    private final void method3572(Class_s argument_216_, int[][] argument_217_, Class_s argument_218_, GraphicsToolkit argument_219_, int argument_220_, Class_s argument_221_, int argument_222_) {
        for (int anLocalInt = 0; anLocalInt < this.mapWidth; anLocalInt++) {
            for (int anLocalInt_223_ = 0; anLocalInt_223_ < this.mapDepth; anLocalInt_223_++) {
                if (Class2_Sub6.anInt3790 == -1 || Class239.method3126(anLocalInt_223_, anLocalInt, Class2_Sub6.anInt3790, false, argument_222_)) {
                    byte anLocalInt_224_ = (tileShape[argument_222_][anLocalInt][anLocalInt_223_]);
                    byte anLocalInt_225_ = (tileShapeRotation[argument_222_][anLocalInt][anLocalInt_223_]);
                    int anLocalInt_226_ = ((tileOverlay[argument_222_][anLocalInt][anLocalInt_223_]) & 0xff);
                    int anLocalInt_227_ = ((tileUnderlay[argument_222_][anLocalInt][anLocalInt_223_]) & 0xff);
                    Class50 class50 = (anLocalInt_226_ != 0 ? aClass51_2566.method476(anLocalInt_226_ - 1, (byte) 96) : null);
                    Class260 class260 = (anLocalInt_227_ != 0 ? aClass297_2559.method3512(18912, anLocalInt_227_ - 1) : null);
                    if (anLocalInt_224_ == 0 && class50 == null)
                        anLocalInt_224_ = (byte) 12;
                    Class50 class50_228_ = class50;
                    if (class50 != null && class50.anInt376 == -1 && class50.anInt378 == -1) {
                        class50_228_ = class50;
                        class50 = null;
                    }
                    if (class50 != null || class260 != null) {
                        int anLocalInt_229_ = Class361.anIntArray3053[anLocalInt_224_];
                        int anLocalInt_230_ = Node_Sub37.anIntArray4167[anLocalInt_224_];
                        int anLocalInt_231_ = ((class260 == null ? 0 : anLocalInt_229_) + (class50 == null ? 0 : anLocalInt_230_));
                        int anLocalInt_232_ = 0;
                        int anLocalInt_233_ = 0;
                        int anLocalInt_234_ = (class50 == null ? -1 : class50.anInt369);
                        int anLocalInt_235_ = (class260 != null ? class260.anInt2029 : -1);
                        int[] anLocalInts = new int[anLocalInt_231_];
                        int[] anLocalInts_236_ = new int[anLocalInt_231_];
                        int[] anLocalInts_237_ = new int[anLocalInt_231_];
                        int[] anLocalInts_238_ = new int[anLocalInt_231_];
                        int[] anLocalInts_239_ = new int[anLocalInt_231_];
                        int[] anLocalInts_240_ = new int[anLocalInt_231_];
                        int[] anLocalInts_241_ = ((class50 != null && class50.anInt378 != -1) ? new int[anLocalInt_231_] : null);
                        if (class50 != null) {
                            for (int anLocalInt_242_ = 0; anLocalInt_242_ < anLocalInt_230_; anLocalInt_242_++) {
                                anLocalInts[anLocalInt_232_] = (Class62_Sub5.anIntArrayArray4382[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_236_[anLocalInt_232_] = (Class162.anIntArrayArray1189[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_237_[anLocalInt_232_] = (Statics.anIntArrayArray134[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_239_[anLocalInt_232_] = anLocalInt_234_;
                                anLocalInts_240_[anLocalInt_232_] = class50.anInt367;
                                anLocalInts_238_[anLocalInt_232_] = class50.anInt376;
                                if (anLocalInts_241_ != null)
                                    anLocalInts_241_[anLocalInt_232_] = class50.anInt378;
                                anLocalInt_233_++;
                                anLocalInt_232_++;
                            }
                            if (!this.aBoolean2561 && argument_222_ == 0)
                                Node_Sub31_Sub3.method885(anLocalInt, anLocalInt_223_, class50.anInt377, class50.anInt374 * 8, class50.anInt366);
                        } else
                            anLocalInt_233_ += anLocalInt_230_;
                        if (class260 != null) {
                            for (int anLocalInt_243_ = 0; anLocalInt_243_ < anLocalInt_229_; anLocalInt_243_++) {
                                anLocalInts[anLocalInt_232_] = (Class62_Sub5.anIntArrayArray4382[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_236_[anLocalInt_232_] = (Class162.anIntArrayArray1189[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_237_[anLocalInt_232_] = (Statics.anIntArrayArray134[anLocalInt_224_][anLocalInt_233_]);
                                anLocalInts_239_[anLocalInt_232_] = anLocalInt_235_;
                                anLocalInts_240_[anLocalInt_232_] = class260.anInt2037;
                                anLocalInts_238_[anLocalInt_232_] = (argument_217_[anLocalInt][anLocalInt_223_]);
                                if (anLocalInts_241_ != null)
                                    anLocalInts_241_[anLocalInt_232_] = anLocalInts_238_[anLocalInt_232_];
                                anLocalInt_232_++;
                                anLocalInt_233_++;
                            }
                        }
                        int anLocalInt_244_ = anIntArray2557.length;
                        int[] anLocalInts_245_ = new int[anLocalInt_244_];
                        int[] anLocalInts_246_ = new int[anLocalInt_244_];
                        int[] anLocalInts_247_ = (argument_216_ != null ? new int[anLocalInt_244_] : null);
                        int[] anLocalInts_248_ = (argument_216_ == null && argument_218_ == null ? null : new int[anLocalInt_244_]);
                        for (int anLocalInt_249_ = 0; anLocalInt_244_ > anLocalInt_249_; anLocalInt_249_++) {
                            int anLocalInt_250_ = anIntArray2557[anLocalInt_249_];
                            int anLocalInt_251_ = anIntArray2560[anLocalInt_249_];
                            if (anLocalInt_225_ == 0) {
                                anLocalInts_245_[anLocalInt_249_] = anLocalInt_250_;
                                anLocalInts_246_[anLocalInt_249_] = anLocalInt_251_;
                            } else if (anLocalInt_225_ != 1) {
                                if (anLocalInt_225_ == 2) {
                                    anLocalInts_245_[anLocalInt_249_] = -anLocalInt_250_ + 512;
                                    anLocalInts_246_[anLocalInt_249_] = -anLocalInt_251_ + 512;
                                } else if (anLocalInt_225_ == 3) {
                                    anLocalInts_245_[anLocalInt_249_] = -anLocalInt_251_ + 512;
                                    int anLocalInt_252_ = anLocalInt_250_;
                                    anLocalInts_246_[anLocalInt_249_] = anLocalInt_252_;
                                }
                            } else {
                                int anLocalInt_253_ = anLocalInt_250_;
                                anLocalInts_245_[anLocalInt_249_] = anLocalInt_251_;
                                anLocalInts_246_[anLocalInt_249_] = -anLocalInt_253_ + 512;
                            }
                            if (anLocalInts_247_ != null && (Class369.aBooleanArrayArray3115[anLocalInt_224_][anLocalInt_249_])) {
                                int anLocalInt_254_ = ((anLocalInt << 9) + anLocalInts_245_[anLocalInt_249_]);
                                int anLocalInt_255_ = ((anLocalInt_223_ << 9) + anLocalInts_246_[anLocalInt_249_]);
                                anLocalInts_247_[anLocalInt_249_] = ((argument_216_.method3541(anLocalInt_255_, MathStatics.XOR(argument_220_, -1), anLocalInt_254_)) - (argument_221_.method3541(anLocalInt_255_, 0, anLocalInt_254_)));
                            }
                            if (anLocalInts_248_ != null) {
                                if (argument_216_ == null || (Class369.aBooleanArrayArray3115[anLocalInt_224_][anLocalInt_249_])) {
                                    if (argument_218_ != null && !(DoublyLinkedNode_Sub51_Sub19.aBooleanArrayArray6353[anLocalInt_224_][anLocalInt_249_])) {
                                        int anLocalInt_256_ = ((anLocalInt << 9) + (anLocalInts_245_[anLocalInt_249_]));
                                        int anLocalInt_257_ = ((anLocalInts_246_[anLocalInt_249_]) + (anLocalInt_223_ << 9));
                                        anLocalInts_248_[anLocalInt_249_] = ((argument_218_.method3541(anLocalInt_257_, 0, anLocalInt_256_)) - (argument_221_.method3541(anLocalInt_257_, 0, anLocalInt_256_)));
                                    }
                                } else {
                                    int anLocalInt_258_ = (anLocalInts_245_[anLocalInt_249_] + (anLocalInt << 9));
                                    int anLocalInt_259_ = (anLocalInts_246_[anLocalInt_249_] + (anLocalInt_223_ << 9));
                                    anLocalInts_248_[anLocalInt_249_] = ((argument_221_.method3541(anLocalInt_259_, 0, anLocalInt_258_)) - (argument_216_.method3541(anLocalInt_259_, 0, anLocalInt_258_)));
                                }
                            }
                        }
                        int anLocalInt_260_ = argument_221_.method3534(anLocalInt, false, anLocalInt_223_);
                        int anLocalInt_261_ = argument_221_.method3534(anLocalInt + 1, false, anLocalInt_223_);
                        int anLocalInt_262_ = argument_221_.method3534(anLocalInt + 1, false, anLocalInt_223_ + 1);
                        int anLocalInt_263_ = argument_221_.method3534(anLocalInt, false, anLocalInt_223_ + 1);
                        boolean anLocalBoolean = Class274.method3388(anLocalInt, anLocalInt_223_, argument_220_ ^ ~0x1);
                        if (anLocalBoolean && argument_222_ > 1 || !anLocalBoolean && argument_222_ > 0) {
                            boolean anLocalBoolean_264_ = true;
                            if (class260 != null && !class260.aBoolean2035)
                                anLocalBoolean_264_ = false;
                            else if (anLocalInt_227_ != 0 || anLocalInt_224_ == 0) {
                                if (anLocalInt_226_ > 0 && class50_228_ != null && !class50_228_.aBoolean364)
                                    anLocalBoolean_264_ = false;
                            } else
                                anLocalBoolean_264_ = false;
                            if (anLocalBoolean_264_ && anLocalInt_260_ == anLocalInt_261_ && anLocalInt_260_ == anLocalInt_262_ && anLocalInt_260_ == anLocalInt_263_)
                                this.aByteArrayArrayArray2558[argument_222_][anLocalInt][anLocalInt_223_] = (byte) (MathStatics.OR((this.aByteArrayArrayArray2558[argument_222_][anLocalInt][anLocalInt_223_]), 4));
                        }
                        int anLocalInt_265_ = 0;
                        int anLocalInt_266_ = 0;
                        int anLocalInt_267_ = 0;
                        if (this.aBoolean2561) {
                            anLocalInt_265_ = Node_Sub47_Sub6.method1127(anLocalInt, anLocalInt_223_);
                            anLocalInt_266_ = Class62_Sub2.method1352(anLocalInt, anLocalInt_223_);
                            anLocalInt_267_ = DoublyLinkedNode_Sub51_Sub12.method1255(anLocalInt, anLocalInt_223_);
                        }
                        argument_221_.method3538(anLocalInt, anLocalInt_223_, anLocalInts_245_, anLocalInts_247_, anLocalInts_246_, anLocalInts_248_, anLocalInts, anLocalInts_236_, anLocalInts_237_, anLocalInts_238_, anLocalInts_241_, anLocalInts_239_, anLocalInts_240_, anLocalInt_265_, anLocalInt_266_, anLocalInt_267_, false);
                        Class15.method301(argument_222_, anLocalInt, anLocalInt_223_);
                    }
                }
            }
        }
        if (argument_220_ != -1) {
            /* empty */
        }
    }

    final void method3573(int argument_268_, int[][] argument_269_, int argument_270_) {
        int[][] anLocalInts = this.heightMap[argument_268_];
        for (int anLocalInt = 0; this.mapWidth + 1 > anLocalInt; anLocalInt++) {
            for (int anLocalInt_271_ = 0; anLocalInt_271_ < this.mapDepth + 1; anLocalInt_271_++)
                anLocalInts[anLocalInt][anLocalInt_271_] += argument_269_[anLocalInt][anLocalInt_271_];
        }
    }

    static final boolean method3574(int argument) {
        if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 0)
            return false;
        return true;
    }

    final void method3575(int argument_272_, int argument_273_, int argument_274_, ClipMap[] argument_275_, int argument_276_, int argument_277_, int argument_278_, Packet argument_279_, int argument_280_, int argument_281_) {
        int anLocalInt = (argument_278_ & 0x7) * 8;
        int anLocalInt_282_ = (argument_280_ & 0x7) * 8;
        if (!this.aBoolean2561) {
            ClipMap clipMap = argument_275_[argument_277_];
            for (int anLocalInt_283_ = 0; anLocalInt_283_ < 8; anLocalInt_283_++) {
                for (int anLocalInt_284_ = 0; anLocalInt_284_ < 8; anLocalInt_284_++) {
                    int anLocalInt_285_ = (Node_Sub19.method716(anLocalInt_284_ & 0x7, argument_281_ ^ ~0x427b, anLocalInt_283_ & 0x7, argument_272_) + argument_273_);
                    int anLocalInt_286_ = (argument_274_ + BufferedFile.method3770(argument_272_, anLocalInt_284_ & 0x7, anLocalInt_283_ & 0x7));
                    if (anLocalInt_285_ > 0 && this.mapWidth - 1 > anLocalInt_285_ && anLocalInt_286_ > 0 && anLocalInt_286_ < this.mapDepth - 1)
                        clipMap.method3142(anLocalInt_286_, anLocalInt_285_);
                }
            }
        }
        int anLocalInt_287_ = argument_278_ << 3 & ~0x3f;
        int anLocalInt_288_ = (argument_280_ & ~0x7) << 3;
        int anLocalInt_289_ = 0;
        int anLocalInt_290_ = 0;
        if (argument_272_ != 1) {
            if (argument_272_ == 2) {
                anLocalInt_290_ = 1;
                anLocalInt_289_ = 1;
            } else if (argument_272_ == 3)
                anLocalInt_289_ = 1;
        } else
            anLocalInt_290_ = 1;
        for (int anLocalInt_291_ = argument_281_; this.mapHeight > anLocalInt_291_; anLocalInt_291_++) {
            for (int anLocalInt_292_ = 0; anLocalInt_292_ < 64; anLocalInt_292_++) {
                for (int anLocalInt_293_ = 0; anLocalInt_293_ < 64; anLocalInt_293_++) {
                    if (anLocalInt_291_ != argument_276_ || anLocalInt_292_ < anLocalInt || anLocalInt_292_ > anLocalInt + 8 || anLocalInt_282_ > anLocalInt_293_ || anLocalInt_282_ + 8 < anLocalInt_293_)
                        readTile(0, -1, -1, 0, 0, 0, 0, 0, false, argument_279_);
                    else {
                        int anLocalInt_294_;
                        int anLocalInt_295_;
                        if (anLocalInt + 8 != anLocalInt_292_ && anLocalInt_293_ != anLocalInt_282_ + 8) {
                            anLocalInt_295_ = (Node_Sub19.method716((anLocalInt_293_ & 0x7), -17020, (anLocalInt_292_ & 0x7), argument_272_) + argument_273_);
                            anLocalInt_294_ = (argument_274_ + BufferedFile.method3770(argument_272_, anLocalInt_293_ & 0x7, (anLocalInt_292_ & 0x7)));
                            readTile(argument_277_, anLocalInt_295_, anLocalInt_294_, anLocalInt_292_ + anLocalInt_287_, anLocalInt_288_ + anLocalInt_293_, anLocalInt_290_, argument_272_, anLocalInt_289_, false, argument_279_);
                        } else {
                            if (argument_272_ != 0) {
                                if (argument_272_ != 1) {
                                    if (argument_272_ == 2) {
                                        anLocalInt_294_ = (argument_274_ + 8 + (anLocalInt_282_ - anLocalInt_293_));
                                        anLocalInt_295_ = (argument_273_ - anLocalInt_292_ + 8 + anLocalInt);
                                    } else {
                                        anLocalInt_294_ = (anLocalInt_292_ - anLocalInt + argument_274_);
                                        anLocalInt_295_ = (-anLocalInt_293_ - (-anLocalInt_282_ - (argument_273_ + 8)));
                                    }
                                } else {
                                    anLocalInt_294_ = (argument_274_ + 8 + anLocalInt - anLocalInt_292_);
                                    anLocalInt_295_ = argument_273_ - (anLocalInt_282_ - anLocalInt_293_);
                                }
                            } else {
                                anLocalInt_294_ = -anLocalInt_282_ + (anLocalInt_293_ + argument_274_);
                                anLocalInt_295_ = (-anLocalInt + anLocalInt_292_ + argument_273_);
                            }
                            readTile(argument_277_, anLocalInt_295_, anLocalInt_294_, anLocalInt_292_ + anLocalInt_287_, anLocalInt_293_ + anLocalInt_288_, 0, 0, 0, true, argument_279_);
                        }
                        if (anLocalInt_292_ == 63 || anLocalInt_293_ == 63) {
                            int anLocalInt_296_ = 1;
                            if (anLocalInt_292_ == 63 && anLocalInt_293_ == 63)
                                anLocalInt_296_ = 3;
                            for (int anLocalInt_297_ = 0; anLocalInt_296_ > anLocalInt_297_; anLocalInt_297_++) {
                                int anLocalInt_298_ = anLocalInt_292_;
                                int anLocalInt_299_ = anLocalInt_293_;
                                if (anLocalInt_297_ == 0) {
                                    anLocalInt_299_ = (anLocalInt_293_ == 63 ? 64 : anLocalInt_293_);
                                    anLocalInt_298_ = (anLocalInt_292_ == 63 ? 64 : anLocalInt_292_);
                                } else if (anLocalInt_297_ != 1) {
                                    if (anLocalInt_297_ == 2)
                                        anLocalInt_299_ = 64;
                                } else
                                    anLocalInt_298_ = 64;
                                int anLocalInt_300_;
                                int anLocalInt_301_;
                                if (argument_272_ == 0) {
                                    anLocalInt_301_ = (anLocalInt_298_ - anLocalInt + argument_273_);
                                    anLocalInt_300_ = -anLocalInt_282_ + (anLocalInt_299_ + argument_274_);
                                } else if (argument_272_ != 1) {
                                    if (argument_272_ == 2) {
                                        anLocalInt_300_ = (-anLocalInt_299_ + (anLocalInt_282_ + 8 + argument_274_));
                                        anLocalInt_301_ = anLocalInt + (-anLocalInt_298_ + argument_273_ + 8);
                                    } else {
                                        anLocalInt_301_ = (argument_273_ + 8 + anLocalInt_282_ - anLocalInt_299_);
                                        anLocalInt_300_ = (anLocalInt_298_ - anLocalInt + argument_274_);
                                    }
                                } else {
                                    anLocalInt_301_ = -anLocalInt_282_ - (-anLocalInt_299_ - argument_273_);
                                    anLocalInt_300_ = (anLocalInt + (-anLocalInt_298_ + 8) + argument_274_);
                                }
                                if (anLocalInt_301_ >= 0 && (this.mapWidth > anLocalInt_301_) && anLocalInt_300_ >= 0 && (this.mapDepth > anLocalInt_300_))
                                    this.heightMap[argument_277_][anLocalInt_301_][anLocalInt_300_] = (this.heightMap[argument_277_][anLocalInt_289_ + anLocalInt_295_][(anLocalInt_294_ + anLocalInt_290_)]);
                            }
                        }
                    }
                }
            }
        }
    }

    Class303(int argument_302_, int argument_303_, int argument_304_, boolean argument_305_, Class51 argument_306_, Class297 argument_307_) {
        anIntArray2557 = new int[]{0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256};
        this.mapHeight = argument_302_;
        aClass297_2559 = argument_307_;
        this.mapWidth = argument_303_;
        this.mapDepth = argument_304_;
        aClass51_2566 = argument_306_;
        this.aBoolean2561 = argument_305_;
        tileOverlay = (new byte[this.mapHeight][this.mapWidth][this.mapDepth]);
        tileShapeRotation = (new byte[this.mapHeight][this.mapWidth][this.mapDepth]);
        tileShape = (new byte[this.mapHeight][this.mapWidth][this.mapDepth]);
        this.aByteArrayArrayArray2558 = (new byte[this.mapHeight][this.mapWidth + 1][this.mapDepth + 1]);
        this.heightMap = (new int[this.mapHeight][this.mapWidth + 1][this.mapDepth + 1]);
        tileUnderlay = (new byte[this.mapHeight][this.mapWidth][this.mapDepth]);
    }

    private void readTile(int tileY, int tileLocalX, int tileLocalZ, int tileAbsX, int tileAbsZ, int appearingZOffset, int tileRotation, int appearingXOffset, boolean underworld, Packet packet) {
        switch (tileRotation) {
            case 1:
                appearingZOffset = 1;
                break;
            case 2:
                appearingXOffset = 1;
                appearingZOffset = 1;
                break;
            case 3:
                appearingXOffset = 1;
                break;
        }
        if (tileLocalX < 0 || tileLocalX >= this.mapWidth || tileLocalZ < 0 || tileLocalZ >= this.mapDepth) {
            for (; ; ) {
                int value = packet.g1();
                if (value == 0)
                    break;
                if (value == 1) {
                    packet.g1();
                    break;
                }
                if (value <= 49)
                    packet.g1();
            }
        } else {
            if (!this.aBoolean2561 && !underworld)
                tileSettings[tileY][tileLocalX][tileLocalZ] = (byte) 0;
            for (; ; ) {
                int value = packet.g1();
                if (value == 0) {
                    if (this.aBoolean2561)
                        this.heightMap[0][tileLocalX + appearingXOffset][(tileLocalZ + appearingZOffset)] = 0;
                    else {
                        if (tileY == 0) {
                            this.heightMap[0][(tileLocalX + appearingXOffset)][tileLocalZ + appearingZOffset] = -HeightmapGenerator.calculateTileHeight(tileAbsX + 932731, 556238 + tileAbsZ, 95) * 8 << 2;
                            break;
                        } else {
                            this.heightMap[tileY][tileLocalX + appearingXOffset][(tileLocalZ + appearingZOffset)] = (this.heightMap[tileY - 1][(tileLocalX + appearingXOffset)][(tileLocalZ + appearingZOffset)]) - 960;
                        }
                        break;
                    }
                    break;
                }
                if (value == 1) {
                    int height = packet.g1();
                    if (this.aBoolean2561)
                        this.heightMap[0][tileLocalX + appearingXOffset][tileLocalZ + appearingZOffset] = height * 8 << 2;
                    else {
                        if (height == 1)
                            height = 0;
                        if (tileY == 0)
                            this.heightMap[0][tileLocalX + appearingXOffset][appearingZOffset + tileLocalZ] = -height * 8 << 2;
                        else {
                            this.heightMap[tileY][tileLocalX + appearingXOffset][appearingZOffset + tileLocalZ] = (-(height * 8 << 2) + (this.heightMap[tileY - 1][appearingXOffset + tileLocalX][tileLocalZ + appearingZOffset]));
                            break;
                        }
                        break;
                    }
                    break;
                }
                if (value <= 49) {
                    if (underworld)
                        packet.g1();
                    else {
                        tileOverlay[tileY][tileLocalX][tileLocalZ] = packet.g1s();
                        tileShape[tileY][tileLocalX][tileLocalZ] = (byte) ((value - 2) / 4);
                        tileShapeRotation[tileY][tileLocalX][tileLocalZ] = (byte) (MathStatics.AND(3, tileRotation - 2 + value));
                    }
                } else if (value <= 81) {
                    if (!this.aBoolean2561 && !underworld)
                        tileSettings[tileY][tileLocalX][tileLocalZ] = (byte) (value - 49);
                } else if (!underworld)
                    tileUnderlay[tileY][tileLocalX][tileLocalZ] = (byte) (value - 81);
            }
        }
    }
}
