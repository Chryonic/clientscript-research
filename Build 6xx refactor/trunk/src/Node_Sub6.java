/* Class59_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub6 extends Node {
    byte[] aByteArray3898;
    int anInt3899;
    static int[] COSINETABLE = new int[16384];
    Class384[] aClass384Array3901;
    Node_Sub40_Sub1[] aClass59_Sub40_Sub1Array3902;
    private int[] anIntArray3903;
    static int[] SINETABLE = new int[16384];
    byte[] aByteArray3905;
    byte[] aByteArray3906;
    static boolean[] aBooleanArray3907;
    short[] aShortArray3908;

    public static void method559(byte argument) {
        aBooleanArray3907 = null;
        COSINETABLE = null;
        SINETABLE = null;
    }

    static final void method560(int argument, int argument_0_, int argument_1_, boolean argument_2_) {
        argument_0_ <<= 3;
        argument <<= 3;
        argument_1_ <<= 3;
        DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6623 = (float) argument;
        DoublyLinkedNodeP2_Sub6.aFloat4538 = (float) argument_1_;
        if (Statics.anInt1745 == 2) {
            Class293.anInt2404 = argument;
            Node_Sub47_Sub3.anInt6167 = argument_1_;
            Class361.anInt3055 = argument_0_;
        }
        Statics.method383((byte) 59);
        Statics.aBoolean3513 = true;
    }

    final boolean method561(byte argument_3_, byte[] argument_4_, int[] argument_5_, Class215 argument_6_) {
        boolean anLocalBoolean = true;
        int anLocalInt = 0;
        Node_Sub40_Sub1 class59_sub40_sub1 = null;
        for (int anLocalInt_7_ = 0; anLocalInt_7_ < 128; anLocalInt_7_++) {
            if (argument_4_ == null || argument_4_[anLocalInt_7_] != 0) {
                int anLocalInt_8_ = anIntArray3903[anLocalInt_7_];
                if (anLocalInt_8_ != 0) {
                    if (anLocalInt_8_ != anLocalInt) {
                        anLocalInt = anLocalInt_8_;
                        if ((--anLocalInt_8_ & 0x1) != 0)
                            class59_sub40_sub1 = argument_6_.method2993(argument_5_, anLocalInt_8_ >> 2, (byte) 47);
                        else
                            class59_sub40_sub1 = argument_6_.method2995((byte) -122, argument_5_, anLocalInt_8_ >> 2);
                        if (class59_sub40_sub1 == null)
                            anLocalBoolean = false;
                    }
                    if (class59_sub40_sub1 != null) {
                        this.aClass59_Sub40_Sub1Array3902[anLocalInt_7_] = class59_sub40_sub1;
                        anIntArray3903[anLocalInt_7_] = 0;
                    }
                }
            }
        }
        return anLocalBoolean;
    }

    final void method562(int argument_9_) {
        anIntArray3903 = null;
    }

    static final void method564(int argument) {
        Statics.aClass51_1250.method475(5, -31533);
        Statics.aClass297_3521.method3514(5, -3000);
        DoublyLinkedNodeP2_Sub5.aClass383_4536.method4110((byte) -96, 5);
        Node_Sub31_Sub30.aClass257_5983.method3295((byte) -43, 5);
        DiskBackedCache.aClass26_2709.method348(124, 5);
        Class253_Sub1_Sub1.aClass365_6632.method3972(5, true);
        DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3752(5, (byte) -123);
        Class194.aClass225_1414.method3053((byte) -25, 5);
        ClientVariables.varbitSource.method1696(5);
        JagexHash.aClass58_1682.method522((byte) -126, 5);
        Class111.aClanVarbitSource_916.method2864(5);
        Class157.aClass41_1159.method420((byte) 68, 5);
        Node_Sub31_Sub13.aClass20_5897.method315((byte) 114, 5);
        Class206.aClass374_1482.method4077((byte) 92, 5);
        Class62_Sub27.aClass362_4457.method3965(5, -10301);
        Class349.aClass313_2918.method3618(5, (byte) 55);
        Statics.aClass333_2631.method3729(5, (byte) -43);
        InputStream_Sub2.aClass64_35.method1485((byte) 64, 5);
        Class48.aClass73_343.method1542(5, true);
        Class363.aClass241_3064.method3145(-84, 5);
        Class86.aClass264_638.method3329((byte) 93, 5);
        Class79.aClass115_561.method2367(5, (byte) 63);
        Statics.method2488(80, 5);
        Statics.method2971(-120, 50);
        Class376.method4089(50, (byte) -117);
        Class28.method357((byte) -86, 5);
        Class77.method1565(9339, 5);
        Rs2DPainter.aClass149_4048.method2534(5, (byte) -8);
        Class165.aClass149_1208.method2534(5, (byte) -8);
        Statics.aClass149_4512.method2534(5, (byte) -8);
        Class350_Sub1.aClass149_5423.method2534(5, (byte) -8);
        Cs2Runtime.aClass149_2651.method2534(5, (byte) -8);
    }

    static final void method565(int argument, byte argument_11_) {
        DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3 = Node_Sub31_Sub15_Sub1.method922(10, 13175, (long) argument);
        class59_sub51_sub3.method1181(585134072);
    }

    static final void method566(byte argument, int argument_12_) {
        Statics.anInt5820 = argument_12_;
        synchronized (Class167_Sub2.aClass149_5165) {
            Class167_Sub2.aClass149_5165.clear((byte) -3);
        }
    }

    public Node_Sub6() {
        /* empty */
    }

    Node_Sub6(byte[] argument_13_) {
        this.aByteArray3906 = new byte[128];
        this.aShortArray3908 = new short[128];
        this.aByteArray3905 = new byte[128];
        this.aClass384Array3901 = new Class384[128];
        this.aClass59_Sub40_Sub1Array3902 = new Node_Sub40_Sub1[128];
        this.aByteArray3898 = new byte[128];
        anIntArray3903 = new int[128];
        Packet class59_sub28 = new Packet(argument_13_);
        int anLocalInt;
        for (anLocalInt = 0; ((class59_sub28.data[class59_sub28.pos + anLocalInt]) != 0); anLocalInt++) {
            /* empty */
        }
        byte[] anLocalInts = new byte[anLocalInt];
        for (int anLocalInt_14_ = 0; anLocalInt > anLocalInt_14_; anLocalInt_14_++)
            anLocalInts[anLocalInt_14_] = class59_sub28.g1s();
        anLocalInt++;
        class59_sub28.pos++;
        int anLocalInt_15_ = class59_sub28.pos;
        class59_sub28.pos += anLocalInt;
        int anLocalInt_16_;
        for (anLocalInt_16_ = 0; ((class59_sub28.data[anLocalInt_16_ + class59_sub28.pos]) != 0); anLocalInt_16_++) {
            /* empty */
        }
        byte[] anLocalInts_17_ = new byte[anLocalInt_16_];
        for (int anLocalInt_18_ = 0; anLocalInt_18_ < anLocalInt_16_; anLocalInt_18_++)
            anLocalInts_17_[anLocalInt_18_] = class59_sub28.g1s();
        anLocalInt_16_++;
        class59_sub28.pos++;
        int anLocalInt_19_ = class59_sub28.pos;
        class59_sub28.pos += anLocalInt_16_;
        int anLocalInt_20_;
        for (anLocalInt_20_ = 0; ((class59_sub28.data[anLocalInt_20_ + class59_sub28.pos]) != 0); anLocalInt_20_++) {
            /* empty */
        }
        byte[] anLocalInts_21_ = new byte[anLocalInt_20_];
        for (int anLocalInt_22_ = 0; anLocalInt_20_ > anLocalInt_22_; anLocalInt_22_++)
            anLocalInts_21_[anLocalInt_22_] = class59_sub28.g1s();
        anLocalInt_20_++;
        class59_sub28.pos++;
        byte[] anLocalInts_23_ = new byte[anLocalInt_20_];
        int anLocalInt_24_;
        if (anLocalInt_20_ <= 1)
            anLocalInt_24_ = anLocalInt_20_;
        else {
            anLocalInts_23_[1] = (byte) 1;
            anLocalInt_24_ = 2;
            int anLocalInt_25_ = 1;
            for (int anLocalInt_26_ = 2; anLocalInt_20_ > anLocalInt_26_; anLocalInt_26_++) {
                int anLocalInt_27_ = class59_sub28.g1();
                if (anLocalInt_27_ != 0) {
                    if (anLocalInt_27_ <= anLocalInt_25_)
                        anLocalInt_27_--;
                    anLocalInt_25_ = anLocalInt_27_;
                } else
                    anLocalInt_25_ = anLocalInt_24_++;
                anLocalInts_23_[anLocalInt_26_] = (byte) anLocalInt_25_;
            }
        }
        Class384[] class384s = new Class384[anLocalInt_24_];
        for (int anLocalInt_28_ = 0; class384s.length > anLocalInt_28_; anLocalInt_28_++) {
            Class384 class384 = class384s[anLocalInt_28_] = new Class384();
            int anLocalInt_29_ = class59_sub28.g1();
            if (anLocalInt_29_ > 0)
                class384.aByteArray3250 = new byte[anLocalInt_29_ * 2];
            anLocalInt_29_ = class59_sub28.g1();
            if (anLocalInt_29_ > 0) {
                class384.aByteArray3256 = new byte[anLocalInt_29_ * 2 + 2];
                class384.aByteArray3256[1] = (byte) 64;
            }
        }
        int anLocalInt_30_ = class59_sub28.g1();
        byte[] anLocalInts_31_ = anLocalInt_30_ > 0 ? new byte[anLocalInt_30_ * 2] : null;
        anLocalInt_30_ = class59_sub28.g1();
        byte[] anLocalInts_32_ = anLocalInt_30_ > 0 ? new byte[anLocalInt_30_ * 2] : null;
        int anLocalInt_33_;
        for (anLocalInt_33_ = 0; ((class59_sub28.data[class59_sub28.pos + anLocalInt_33_]) != 0); anLocalInt_33_++) {
            /* empty */
        }
        byte[] anLocalInts_34_ = new byte[anLocalInt_33_];
        for (int anLocalInt_35_ = 0; anLocalInt_33_ > anLocalInt_35_; anLocalInt_35_++)
            anLocalInts_34_[anLocalInt_35_] = class59_sub28.g1s();
        anLocalInt_33_++;
        class59_sub28.pos++;
        int anLocalInt_36_ = 0;
        for (int anLocalInt_37_ = 0; anLocalInt_37_ < 128; anLocalInt_37_++) {
            anLocalInt_36_ += class59_sub28.g1();
            this.aShortArray3908[anLocalInt_37_] = (short) anLocalInt_36_;
        }
        anLocalInt_36_ = 0;
        for (int anLocalInt_38_ = 0; anLocalInt_38_ < 128; anLocalInt_38_++) {
            anLocalInt_36_ += class59_sub28.g1();
            this.aShortArray3908[anLocalInt_38_] += anLocalInt_36_ << 8;
        }
        int anLocalInt_39_ = 0;
        int anLocalInt_40_ = 0;
        int anLocalInt_41_ = 0;
        for (int anLocalInt_42_ = 0; anLocalInt_42_ < 128; anLocalInt_42_++) {
            if (anLocalInt_39_ == 0) {
                if (anLocalInt_40_ >= anLocalInts_34_.length)
                    anLocalInt_39_ = -1;
                else
                    anLocalInt_39_ = anLocalInts_34_[anLocalInt_40_++];
                anLocalInt_41_ = class59_sub28.gMultiSomething();
            }
            this.aShortArray3908[anLocalInt_42_] += MathStatics.AND(anLocalInt_41_ - 1, 2) << 14;
            anIntArray3903[anLocalInt_42_] = anLocalInt_41_;
            anLocalInt_39_--;
        }
        anLocalInt_39_ = 0;
        anLocalInt_40_ = 0;
        int anLocalInt_43_ = 0;
        for (int anLocalInt_44_ = 0; anLocalInt_44_ < 128; anLocalInt_44_++) {
            if (anIntArray3903[anLocalInt_44_] != 0) {
                if (anLocalInt_39_ == 0) {
                    anLocalInt_43_ = (class59_sub28.data[anLocalInt_15_++]) - 1;
                    if (anLocalInt_40_ >= anLocalInts.length)
                        anLocalInt_39_ = -1;
                    else
                        anLocalInt_39_ = anLocalInts[anLocalInt_40_++];
                }
                anLocalInt_39_--;
                this.aByteArray3905[anLocalInt_44_] = (byte) anLocalInt_43_;
            }
        }
        anLocalInt_40_ = 0;
        anLocalInt_39_ = 0;
        int anLocalInt_45_ = 0;
        for (int anLocalInt_46_ = 0; anLocalInt_46_ < 128; anLocalInt_46_++) {
            if (anIntArray3903[anLocalInt_46_] != 0) {
                if (anLocalInt_39_ == 0) {
                    if (anLocalInt_40_ < anLocalInts_17_.length)
                        anLocalInt_39_ = anLocalInts_17_[anLocalInt_40_++];
                    else
                        anLocalInt_39_ = -1;
                    anLocalInt_45_ = (class59_sub28.data[anLocalInt_19_++]) + 16 << 2;
                }
                this.aByteArray3906[anLocalInt_46_] = (byte) anLocalInt_45_;
                anLocalInt_39_--;
            }
        }
        anLocalInt_39_ = 0;
        anLocalInt_40_ = 0;
        Class384 class384 = null;
        for (int anLocalInt_47_ = 0; anLocalInt_47_ < 128; anLocalInt_47_++) {
            if (anIntArray3903[anLocalInt_47_] != 0) {
                if (anLocalInt_39_ == 0) {
                    class384 = class384s[anLocalInts_23_[anLocalInt_40_]];
                    if (anLocalInts_21_.length > anLocalInt_40_)
                        anLocalInt_39_ = anLocalInts_21_[anLocalInt_40_++];
                    else
                        anLocalInt_39_ = -1;
                }
                anLocalInt_39_--;
                this.aClass384Array3901[anLocalInt_47_] = class384;
            }
        }
        anLocalInt_40_ = 0;
        anLocalInt_39_ = 0;
        int anLocalInt_48_ = 0;
        for (int anLocalInt_49_ = 0; anLocalInt_49_ < 128; anLocalInt_49_++) {
            if (anLocalInt_39_ == 0) {
                if (anLocalInts_34_.length > anLocalInt_40_)
                    anLocalInt_39_ = anLocalInts_34_[anLocalInt_40_++];
                else
                    anLocalInt_39_ = -1;
                if (anIntArray3903[anLocalInt_49_] > 0)
                    anLocalInt_48_ = class59_sub28.g1() + 1;
            }
            anLocalInt_39_--;
            this.aByteArray3898[anLocalInt_49_] = (byte) anLocalInt_48_;
        }
        this.anInt3899 = class59_sub28.g1() + 1;
        for (int anLocalInt_50_ = 0; anLocalInt_24_ > anLocalInt_50_; anLocalInt_50_++) {
            Class384 class384_51_ = class384s[anLocalInt_50_];
            if (class384_51_.aByteArray3250 != null) {
                for (int anLocalInt_52_ = 1; (anLocalInt_52_ < class384_51_.aByteArray3250.length); anLocalInt_52_ += 2)
                    class384_51_.aByteArray3250[anLocalInt_52_] = class59_sub28.g1s();
            }
            if (class384_51_.aByteArray3256 != null) {
                for (int anLocalInt_53_ = 3; (anLocalInt_53_ < class384_51_.aByteArray3256.length - 2); anLocalInt_53_ += 2)
                    class384_51_.aByteArray3256[anLocalInt_53_] = class59_sub28.g1s();
            }
        }
        if (anLocalInts_31_ != null) {
            for (int anLocalInt_54_ = 1; anLocalInts_31_.length > anLocalInt_54_; anLocalInt_54_ += 2)
                anLocalInts_31_[anLocalInt_54_] = class59_sub28.g1s();
        }
        if (anLocalInts_32_ != null) {
            for (int anLocalInt_55_ = 1; anLocalInts_32_.length > anLocalInt_55_; anLocalInt_55_ += 2)
                anLocalInts_32_[anLocalInt_55_] = class59_sub28.g1s();
        }
        for (int anLocalInt_56_ = 0; anLocalInt_24_ > anLocalInt_56_; anLocalInt_56_++) {
            Class384 class384_57_ = class384s[anLocalInt_56_];
            if (class384_57_.aByteArray3256 != null) {
                anLocalInt_36_ = 0;
                for (int anLocalInt_58_ = 2; (anLocalInt_58_ < class384_57_.aByteArray3256.length); anLocalInt_58_ += 2) {
                    anLocalInt_36_ = (class59_sub28.g1() + (anLocalInt_36_ + 1));
                    class384_57_.aByteArray3256[anLocalInt_58_] = (byte) anLocalInt_36_;
                }
            }
        }
        for (int anLocalInt_59_ = 0; anLocalInt_59_ < anLocalInt_24_; anLocalInt_59_++) {
            Class384 class384_60_ = class384s[anLocalInt_59_];
            if (class384_60_.aByteArray3250 != null) {
                anLocalInt_36_ = 0;
                for (int anLocalInt_61_ = 2; (class384_60_.aByteArray3250.length > anLocalInt_61_); anLocalInt_61_ += 2) {
                    anLocalInt_36_ = (class59_sub28.g1() + (anLocalInt_36_ + 1));
                    class384_60_.aByteArray3250[anLocalInt_61_] = (byte) anLocalInt_36_;
                }
            }
        }
        if (anLocalInts_31_ != null) {
            anLocalInt_36_ = class59_sub28.g1();
            anLocalInts_31_[0] = (byte) anLocalInt_36_;
            for (int anLocalInt_62_ = 2; anLocalInt_62_ < anLocalInts_31_.length; anLocalInt_62_ += 2) {
                anLocalInt_36_ = (class59_sub28.g1() + 1 + anLocalInt_36_);
                anLocalInts_31_[anLocalInt_62_] = (byte) anLocalInt_36_;
            }
            int anLocalInt_63_ = anLocalInts_31_[0];
            int anLocalInt_64_ = anLocalInts_31_[1];
            for (int anLocalInt_65_ = 0; anLocalInt_65_ < anLocalInt_63_; anLocalInt_65_++)
                this.aByteArray3898[anLocalInt_65_] = (byte) (anLocalInt_64_ * (this.aByteArray3898[anLocalInt_65_]) + 32 >> 6);
            for (int anLocalInt_66_ = 2; anLocalInt_66_ < anLocalInts_31_.length; anLocalInt_66_ += 2) {
                int anLocalInt_67_ = anLocalInts_31_[anLocalInt_66_];
                int anLocalInt_68_ = anLocalInts_31_[anLocalInt_66_ + 1];
                int anLocalInt_69_ = ((-anLocalInt_63_ + anLocalInt_67_) / 2 + (anLocalInt_67_ - anLocalInt_63_) * anLocalInt_64_);
                for (int anLocalInt_70_ = anLocalInt_63_; anLocalInt_67_ > anLocalInt_70_; anLocalInt_70_++) {
                    int anLocalInt_71_ = Exception_Sub1.method141((anLocalInt_67_ - anLocalInt_63_), -1682735553, anLocalInt_69_);
                    this.aByteArray3898[anLocalInt_70_] = (byte) (anLocalInt_71_ * (this.aByteArray3898[anLocalInt_70_]) + 32 >> 6);
                    anLocalInt_69_ += anLocalInt_68_ - anLocalInt_64_;
                }
                anLocalInt_64_ = anLocalInt_68_;
                anLocalInt_63_ = anLocalInt_67_;
            }
            Object object = null;
            for (int anLocalInt_72_ = anLocalInt_63_; anLocalInt_72_ < 128; anLocalInt_72_++)
                this.aByteArray3898[anLocalInt_72_] = (byte) (anLocalInt_64_ * (this.aByteArray3898[anLocalInt_72_]) + 32 >> 6);
        }
        if (anLocalInts_32_ != null) {
            anLocalInt_36_ = class59_sub28.g1();
            anLocalInts_32_[0] = (byte) anLocalInt_36_;
            for (int anLocalInt_73_ = 2; anLocalInts_32_.length > anLocalInt_73_; anLocalInt_73_ += 2) {
                anLocalInt_36_ = (class59_sub28.g1() + 1 + anLocalInt_36_);
                anLocalInts_32_[anLocalInt_73_] = (byte) anLocalInt_36_;
            }
            int anLocalInt_74_ = anLocalInts_32_[0];
            int anLocalInt_75_ = anLocalInts_32_[1] << 1;
            for (int anLocalInt_76_ = 0; anLocalInt_74_ > anLocalInt_76_; anLocalInt_76_++) {
                int anLocalInt_77_ = (anLocalInt_75_ + (this.aByteArray3906[anLocalInt_76_] & 0xff));
                if (anLocalInt_77_ < 0)
                    anLocalInt_77_ = 0;
                if (anLocalInt_77_ > 128)
                    anLocalInt_77_ = 128;
                this.aByteArray3906[anLocalInt_76_] = (byte) anLocalInt_77_;
            }
            int anLocalInt_78_ = 2;
            while (anLocalInts_32_.length > anLocalInt_78_) {
                int anLocalInt_79_ = anLocalInts_32_[anLocalInt_78_];
                int anLocalInt_80_ = anLocalInts_32_[anLocalInt_78_ + 1] << 1;
                int anLocalInt_81_ = ((anLocalInt_79_ - anLocalInt_74_) / 2 + (anLocalInt_79_ - anLocalInt_74_) * anLocalInt_75_);
                for (int anLocalInt_82_ = anLocalInt_74_; anLocalInt_82_ < anLocalInt_79_; anLocalInt_82_++) {
                    int anLocalInt_83_ = Exception_Sub1.method141((-anLocalInt_74_ + anLocalInt_79_), -1682735553, anLocalInt_81_);
                    int anLocalInt_84_ = anLocalInt_83_ + ((this.aByteArray3906[anLocalInt_82_]) & 0xff);
                    if (anLocalInt_84_ < 0)
                        anLocalInt_84_ = 0;
                    if (anLocalInt_84_ > 128)
                        anLocalInt_84_ = 128;
                    this.aByteArray3906[anLocalInt_82_] = (byte) anLocalInt_84_;
                    anLocalInt_81_ += -anLocalInt_75_ + anLocalInt_80_;
                }
                anLocalInt_78_ += 2;
                anLocalInt_75_ = anLocalInt_80_;
                anLocalInt_74_ = anLocalInt_79_;
            }
            Object object = null;
            for (int anLocalInt_85_ = anLocalInt_74_; anLocalInt_85_ < 128; anLocalInt_85_++) {
                int anLocalInt_86_ = ((this.aByteArray3906[anLocalInt_85_] & 0xff) + anLocalInt_75_);
                if (anLocalInt_86_ < 0)
                    anLocalInt_86_ = 0;
                if (anLocalInt_86_ > 128)
                    anLocalInt_86_ = 128;
                this.aByteArray3906[anLocalInt_85_] = (byte) anLocalInt_86_;
            }
        }
        for (int anLocalInt_87_ = 0; anLocalInt_24_ > anLocalInt_87_; anLocalInt_87_++)
            class384s[anLocalInt_87_].anInt3253 = class59_sub28.g1();
        for (int anLocalInt_88_ = 0; anLocalInt_88_ < anLocalInt_24_; anLocalInt_88_++) {
            Class384 class384_89_ = class384s[anLocalInt_88_];
            if (class384_89_.aByteArray3250 != null)
                class384_89_.anInt3257 = class59_sub28.g1();
            if (class384_89_.aByteArray3256 != null)
                class384_89_.anInt3247 = class59_sub28.g1();
            if (class384_89_.anInt3253 > 0)
                class384_89_.anInt3258 = class59_sub28.g1();
        }
        for (int anLocalInt_90_ = 0; anLocalInt_24_ > anLocalInt_90_; anLocalInt_90_++)
            class384s[anLocalInt_90_].anInt3252 = class59_sub28.g1();
        for (int anLocalInt_91_ = 0; anLocalInt_91_ < anLocalInt_24_; anLocalInt_91_++) {
            Class384 class384_92_ = class384s[anLocalInt_91_];
            if (class384_92_.anInt3252 > 0)
                class384_92_.anInt3254 = class59_sub28.g1();
        }
        for (int anLocalInt_93_ = 0; anLocalInt_93_ < anLocalInt_24_; anLocalInt_93_++) {
            Class384 class384_94_ = class384s[anLocalInt_93_];
            if (class384_94_.anInt3254 > 0)
                class384_94_.anInt3248 = class59_sub28.g1();
        }
    }

    static {
        double d = 3.834951969714103E-4;
        for (int anLocalInt = 0; anLocalInt < 16384; anLocalInt++) {
            SINETABLE[anLocalInt] = (int) (Math.sin(d * (double) anLocalInt) * 16384.0);
            COSINETABLE[anLocalInt] = (int) (Math.cos((double) anLocalInt * d) * 16384.0);
        }
        aBooleanArray3907 = new boolean[100];
    }
}
