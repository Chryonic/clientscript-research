/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class343 {
    private int anInt2887;
    private int anInt2888;
    private int anInt2889;
    int anInt2890;
    private static int[] anIntArray2891 = new int[4];
    private int anInt2892;
    private int sunAngleX;
    private Class368 aClass368_2894;
    private static Class368 aClass368_2895;
    private int anInt2896;
    private int anInt2897;
    private int sunAngleY;
    private int anInt2899;
    private int anInt2900;
    private static Class368 aClass368_2901;
    private boolean aBoolean2902;
    private static Class167 aClass167_2903;
    private int sunAngleZ;

    private final boolean method3788(GraphicsToolkit argument_0_, Class343 argument_1_) {
        if (aClass368_2894 == null) {
            if (anInt2887 == 0) {
                if (Statics.anTextureSource_4470.method9(true, anInt2896)) {
                    int[] anLocalInts = Statics.anTextureSource_4470.method14(anInt2897, anInt2896, -115, 0.7F, anInt2897, false);
                    aClass368_2894 = argument_0_.method2047(anInt2897, anLocalInts, 0, anInt2897, anInt2897);
                }
            } else if (anInt2887 == 2)
                method3791(argument_0_, argument_1_);
            else if (anInt2887 == 1)
                method3795(argument_0_, argument_1_);
        }
        if (aClass368_2894 == null)
            return false;
        return true;
    }

    final boolean method3789(int argument_2_, int argument_3_, int argument_4_, int argument_5_) {
        int anLocalInt;
        int anLocalInt_6_;
        int anLocalInt_7_;
        if (!aBoolean2902) {
            anLocalInt = sunAngleX - argument_2_;
            anLocalInt_6_ = sunAngleY - argument_3_;
            anLocalInt_7_ = sunAngleZ - argument_4_;
            ((Class343) this).anInt2890 = (int) Math.sqrt((double) (anLocalInt * anLocalInt + anLocalInt_6_ * anLocalInt_6_ + anLocalInt_7_ * anLocalInt_7_));
            if (((Class343) this).anInt2890 == 0)
                ((Class343) this).anInt2890 = 1;
            anLocalInt = (anLocalInt << 8) / ((Class343) this).anInt2890;
            anLocalInt_6_ = (anLocalInt_6_ << 8) / ((Class343) this).anInt2890;
            anLocalInt_7_ = (anLocalInt_7_ << 8) / ((Class343) this).anInt2890;
        } else {
            ((Class343) this).anInt2890 = 1073741823;
            anLocalInt = sunAngleX;
            anLocalInt_6_ = sunAngleY;
            anLocalInt_7_ = sunAngleZ;
        }
        int anLocalInt_8_ = (int) (Math.sqrt((double) (anLocalInt * anLocalInt + anLocalInt_6_ * anLocalInt_6_ + anLocalInt_7_ * anLocalInt_7_)) * 256.0);
        if (anLocalInt_8_ > 128) {
            anLocalInt = (anLocalInt << 16) / anLocalInt_8_;
            anLocalInt_6_ = (anLocalInt_6_ << 16) / anLocalInt_8_;
            anLocalInt_7_ = (anLocalInt_7_ << 16) / anLocalInt_8_;
            anInt2889 = anInt2888 * argument_5_ / (aBoolean2902 ? 1024 : ((Class343) this).anInt2890);
        } else
            anInt2889 = 0;
        if (anInt2889 < 8) {
            aClass368_2894 = null;
            return false;
        }
        int anLocalInt_9_ = MathStatics.method2589(anInt2889);
        if (anLocalInt_9_ > argument_5_)
            anLocalInt_9_ = Class392.method4142(argument_5_, false);
        if (anLocalInt_9_ > 512)
            anLocalInt_9_ = 512;
        if (anLocalInt_9_ != anInt2897)
            anInt2897 = anLocalInt_9_;
        anInt2900 = (int) (Math.asin((double) ((float) anLocalInt_6_ / 256.0F)) * 2607.5945876176133) & 0x3fff;
        anInt2899 = (int) (Math.atan2((double) anLocalInt, (double) -anLocalInt_7_) * 2607.5945876176133) & 0x3fff;
        aClass368_2894 = null;
        return true;
    }

    final void method3790(GraphicsToolkit argument_10_, int argument_11_, int argument_12_, int argument_13_, int argument_14_, int argument_15_, int argument_16_) {
        if (aClass368_2894 != null) {
            int anLocalInt = anInt2900 - argument_15_ & 0x3fff;
            int anLocalInt_17_ = anInt2899 - argument_16_ & 0x3fff;
            if (anLocalInt_17_ > 8192)
                anLocalInt_17_ -= 16384;
            if (anLocalInt > 8192)
                anLocalInt -= 16384;
            int anLocalInt_18_ = (anLocalInt * argument_14_ / 4096 + (argument_14_ - anInt2889) / 2);
            int anLocalInt_19_ = (anLocalInt_17_ * argument_14_ / -4096 + (argument_13_ - anInt2889) / 2);
            if (anLocalInt_18_ < argument_14_ && anLocalInt_18_ + anInt2889 > 0 && anLocalInt_19_ < argument_13_ && anLocalInt_19_ + anInt2889 > 0)
                aClass368_2894.method4011(anLocalInt_19_ + argument_11_, anLocalInt_18_ + argument_12_, anInt2889, anInt2889);
        }
    }

    private final void method3791(GraphicsToolkit argument_20_, Class343 argument_21_) {
        Class101 class101 = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, Class179_Sub1.aJs5Store_5270, anInt2896, 0);
        if (class101 != null) {
            argument_20_.getScissor(anIntArray2891);
            argument_20_.setClip(0, anInt2897, anInt2897, 0);
            argument_20_.fillRect(0, 0, anInt2897, anInt2897, 0, 0);
            int sunAngleX = 0;
            int sunAngleY = 0;
            int sunAngleZ = 256;
            if (argument_21_ != null) {
                if (argument_21_.aBoolean2902) {
                    sunAngleX = -argument_21_.sunAngleX;
                    sunAngleY = -argument_21_.sunAngleY;
                    sunAngleZ = -argument_21_.sunAngleZ;
                } else {
                    sunAngleX = this.sunAngleX - argument_21_.sunAngleX;
                    sunAngleY = this.sunAngleY - argument_21_.sunAngleY;
                    sunAngleZ = this.sunAngleZ - argument_21_.sunAngleZ;
                }
            }
            if (anInt2900 != 0) {
                int anLocalInt_24_ = -anInt2900 & 0x3fff;
                int anLocalInt_25_ = Node_Sub6.SINETABLE[anLocalInt_24_];
                int anLocalInt_26_ = Node_Sub6.COSINETABLE[anLocalInt_24_];
                int anLocalInt_27_ = ((sunAngleY * anLocalInt_26_ - sunAngleZ * anLocalInt_25_) >> 14);
                sunAngleZ = (sunAngleY * anLocalInt_25_ + sunAngleZ * anLocalInt_26_) >> 14;
                sunAngleY = anLocalInt_27_;
            }
            if (anInt2899 != 0) {
                int anLocalInt_28_ = -anInt2899 & 0x3fff;
                int anLocalInt_29_ = Node_Sub6.SINETABLE[anLocalInt_28_];
                int anLocalInt_30_ = Node_Sub6.COSINETABLE[anLocalInt_28_];
                int anLocalInt_31_ = ((sunAngleZ * anLocalInt_29_ + sunAngleX * anLocalInt_30_) >> 14);
                sunAngleZ = (sunAngleZ * anLocalInt_30_ - sunAngleX * anLocalInt_29_) >> 14;
                sunAngleX = anLocalInt_31_;
            }
            argument_20_.setAmbientIntensity(1.0F);
            argument_20_.setSun(16777215, 1.0F, 1.0F, (float) sunAngleX, (float) sunAngleY, (float) sunAngleZ);
            Class167 class167 = argument_20_.method2057(class101, 2048, 0, 64, 768);
            int anLocalInt_32_ = class167.RA() - class167.V();
            int anLocalInt_33_ = class167.EA() - class167.fa();
            int anLocalInt_34_ = class167.V() + anLocalInt_32_ / 2;
            int anLocalInt_35_ = class167.fa() + anLocalInt_33_ / 2;
            int anLocalInt_36_ = (anLocalInt_32_ > anLocalInt_33_ ? anLocalInt_32_ : anLocalInt_33_);
            argument_20_.DA(anLocalInt_34_, anLocalInt_35_, anLocalInt_36_, anLocalInt_36_);
            argument_20_.method2069(argument_20_.method2029());
            Class350 class350 = argument_20_.method2015();
            class350.method3825(0, 0, argument_20_.i() - class167.HA());
            class167.method2646(class350, null, argument_20_.i(), 1);
            aClass368_2894 = argument_20_.method2094(0, 0, anInt2897, anInt2897, true);
            aClass368_2894.method4003(0, 0, 3);
            argument_20_.setClip(anIntArray2891[0], anIntArray2891[3], anIntArray2891[2], anIntArray2891[1]);
        }
    }

    public static void method3792() {
        aClass167_2903 = null;
        aClass368_2901 = null;
        aClass368_2895 = null;
        anIntArray2891 = null;
    }

    private static final void method3793(GraphicsToolkit argument) {
        if (aClass167_2903 == null) {
            Class101 class101 = new Class101(580, 1104, 1);
            class101.method1742((short) 1024, (byte) 0, (byte) 88, (short) 0, (short) 0, (byte) 0, (byte) 0, (short) 1024, (short) 32767, (short) 1024);
            class101.method1750(128, 0, 0, (byte) 101);
            class101.method1750(-128, 0, 0, (byte) 101);
            for (int anLocalInt = 0; anLocalInt <= 24; anLocalInt++) {
                int anLocalInt_37_ = anLocalInt * 8192 / 24;
                int anLocalInt_38_ = Node_Sub6.SINETABLE[anLocalInt_37_];
                int anLocalInt_39_ = Node_Sub6.COSINETABLE[anLocalInt_37_];
                for (int anLocalInt_40_ = 1; anLocalInt_40_ < 24; anLocalInt_40_++) {
                    int anLocalInt_41_ = anLocalInt_40_ * 8192 / 24;
                    int anLocalInt_42_ = Node_Sub6.COSINETABLE[anLocalInt_41_] >> 7;
                    int anLocalInt_43_ = ((Node_Sub6.SINETABLE[anLocalInt_41_] * anLocalInt_38_) >> 21);
                    int anLocalInt_44_ = ((Node_Sub6.SINETABLE[anLocalInt_41_] * anLocalInt_39_) >> 21);
                    class101.method1750(anLocalInt_42_, anLocalInt_44_, -anLocalInt_43_, (byte) 101);
                }
                if (anLocalInt > 0) {
                    int anLocalInt_45_ = anLocalInt * 23 + 2;
                    int anLocalInt_46_ = anLocalInt_45_ - 23;
                    class101.method1745(0, (byte) 0, anLocalInt_46_, (short) 127, anLocalInt_45_, (byte) 0, (short) 0, 0, (byte) 0);
                    for (int anLocalInt_47_ = 1; anLocalInt_47_ < 23; anLocalInt_47_++) {
                        int anLocalInt_48_ = anLocalInt_46_ + 1;
                        int anLocalInt_49_ = anLocalInt_45_ + 1;
                        class101.method1745(0, (byte) 0, anLocalInt_48_, (short) 127, anLocalInt_45_, (byte) 0, (short) 0, anLocalInt_46_, (byte) 0);
                        class101.method1745(0, (byte) 0, anLocalInt_49_, (short) 127, anLocalInt_45_, (byte) 0, (short) 0, anLocalInt_48_, (byte) 0);
                        anLocalInt_46_ = anLocalInt_48_;
                        anLocalInt_45_ = anLocalInt_49_;
                    }
                    class101.method1745(0, (byte) 0, anLocalInt_46_, (short) 127, 1, (byte) 0, (short) 0, anLocalInt_45_, (byte) 0);
                }
            }
            ((Class101) class101).anInt797 = ((Class101) class101).anInt792;
            ((Class101) class101).anIntArray809 = null;
            ((Class101) class101).anIntArray796 = null;
            ((Class101) class101).aByteArray790 = null;
            aClass167_2903 = argument.method2057(class101, 51200, 33, 64, 768);
        }
    }

    private static final void method3794(GraphicsToolkit argument) {
        if (aClass368_2895 == null) {
            int[] anLocalInts = new int[16384];
            int[] anLocalInts_50_ = new int[16384];
            for (int anLocalInt = 0; anLocalInt < 64; anLocalInt++) {
                int anLocalInt_51_ = 64 - anLocalInt;
                anLocalInt_51_ *= anLocalInt_51_;
                int anLocalInt_52_ = 128 - anLocalInt - 1;
                int anLocalInt_53_ = anLocalInt * 128;
                int anLocalInt_54_ = anLocalInt_52_ * 128;
                for (int anLocalInt_55_ = 0; anLocalInt_55_ < 64; anLocalInt_55_++) {
                    int anLocalInt_56_ = 64 - anLocalInt_55_;
                    anLocalInt_56_ *= anLocalInt_56_;
                    int anLocalInt_57_ = 128 - anLocalInt_55_ - 1;
                    int anLocalInt_58_ = 256 - (anLocalInt_56_ + anLocalInt_51_ << 8) / 4096;
                    anLocalInt_58_ = anLocalInt_58_ * 16 * 192 / 1536;
                    if (anLocalInt_58_ < 0)
                        anLocalInt_58_ = 0;
                    else if (anLocalInt_58_ > 255)
                        anLocalInt_58_ = 255;
                    int anLocalInt_59_ = anLocalInt_58_ / 2;
                    anLocalInts_50_[anLocalInt_53_ + anLocalInt_55_] = anLocalInts_50_[anLocalInt_53_ + anLocalInt_57_] = anLocalInts_50_[anLocalInt_54_ + anLocalInt_55_] = anLocalInts_50_[anLocalInt_54_ + anLocalInt_57_] = anLocalInt_58_ << 16 | ~0xffffff;
                    anLocalInts[anLocalInt_53_ + anLocalInt_55_] = anLocalInts[anLocalInt_53_ + anLocalInt_57_] = anLocalInts[anLocalInt_54_ + anLocalInt_55_] = anLocalInts[anLocalInt_54_ + anLocalInt_57_] = 127 - anLocalInt_59_ << 24 | 0xffffff;
                }
            }
            aClass368_2895 = argument.method2047(128, anLocalInts_50_, 0, 128, 128);
            aClass368_2901 = argument.method2047(128, anLocalInts, 0, 128, 128);
        }
    }

    private final void method3795(GraphicsToolkit argument_60_, Class343 argument_61_) {
        method3793(argument_60_);
        method3794(argument_60_);
        argument_60_.getScissor(anIntArray2891);
        argument_60_.setClip(0, anInt2897, anInt2897, 0);
        argument_60_.clearDepthBuffer();
        argument_60_.fillRect(0, 0, anInt2897, anInt2897, anInt2892 | ~0xffffff, 0);
        int anLocalInt = 0;
        int anLocalInt_62_ = 0;
        int anLocalInt_63_ = 256;
        if (argument_61_ != null) {
            if (argument_61_.aBoolean2902) {
                anLocalInt = -argument_61_.sunAngleX;
                anLocalInt_62_ = -argument_61_.sunAngleY;
                anLocalInt_63_ = -argument_61_.sunAngleZ;
            } else {
                anLocalInt = argument_61_.sunAngleX - sunAngleX;
                anLocalInt_62_ = argument_61_.sunAngleY - sunAngleY;
                anLocalInt_63_ = argument_61_.sunAngleZ - sunAngleZ;
            }
        }
        if (anInt2900 != 0) {
            int anLocalInt_64_ = Node_Sub6.SINETABLE[anInt2900];
            int anLocalInt_65_ = Node_Sub6.COSINETABLE[anInt2900];
            int anLocalInt_66_ = ((anLocalInt_62_ * anLocalInt_65_ - anLocalInt_63_ * anLocalInt_64_) >> 14);
            anLocalInt_63_ = (anLocalInt_62_ * anLocalInt_64_ + anLocalInt_63_ * anLocalInt_65_) >> 14;
            anLocalInt_62_ = anLocalInt_66_;
        }
        if (anInt2899 != 0) {
            int anLocalInt_67_ = Node_Sub6.SINETABLE[anInt2899];
            int anLocalInt_68_ = Node_Sub6.COSINETABLE[anInt2899];
            int anLocalInt_69_ = ((anLocalInt_63_ * anLocalInt_67_ + anLocalInt * anLocalInt_68_) >> 14);
            anLocalInt_63_ = (anLocalInt_63_ * anLocalInt_68_ - anLocalInt * anLocalInt_67_) >> 14;
            anLocalInt = anLocalInt_69_;
        }
        Class167 class167 = aClass167_2903.method2651((byte) 0, 51200, true);
        class167.aa((short) 0, (short) anInt2896);
        argument_60_.setAmbientIntensity(1.0F);
        argument_60_.setSun(16777215, 1.0F, 1.0F, (float) anLocalInt, (float) anLocalInt_62_, (float) anLocalInt_63_);
        int anLocalInt_70_ = anInt2897 * 1024 / (class167.RA() - class167.V());
        if (anInt2892 != 0)
            anLocalInt_70_ = anLocalInt_70_ * 13 / 16;
        argument_60_.DA(anInt2897 / 2, anInt2897 / 2, anLocalInt_70_, anLocalInt_70_);
        argument_60_.method2069(argument_60_.method2029());
        Class350 class350 = argument_60_.method2029();
        class350.method3825(0, 0, argument_60_.i() - class167.HA());
        class167.method2646(class350, null, 1024, 1);
        int anLocalInt_71_ = anInt2897 * 13 / 16;
        int anLocalInt_72_ = (anInt2897 - anLocalInt_71_) / 2;
        aClass368_2901.method4016(anLocalInt_72_, anLocalInt_72_, anLocalInt_71_, anLocalInt_71_, 0, anInt2892 | ~0xffffff, 1);
        aClass368_2894 = argument_60_.method2094(0, 0, anInt2897, anInt2897, true);
        argument_60_.clearDepthBuffer();
        argument_60_.fillRect(0, 0, anInt2897, anInt2897, 0, 0);
        aClass368_2895.method4016(0, 0, anInt2897, anInt2897, 1, 0, 0);
        aClass368_2894.method4003(0, 0, 0);
        argument_60_.setClip(anIntArray2891[0], anIntArray2891[3], anIntArray2891[2], anIntArray2891[1]);
    }

    final boolean method3796(GraphicsToolkit argument_73_, Class343 argument_74_) {
        if (aClass368_2894 == null && !method3788(argument_73_, argument_74_))
            return false;
        return true;
    }

    static final void method3797() {
        aClass167_2903 = null;
        aClass368_2895 = null;
    }

    final void method3798() {
        aClass368_2894 = null;
    }

    Class343(int argument_75_, int argument_76_, int argument_77_, int argument_78_, int argument_79_, int argument_80_, int argument_81_, boolean argument_82_) {
        sunAngleX = argument_77_;
        sunAngleY = argument_78_;
        sunAngleZ = argument_79_;
        aBoolean2902 = argument_82_;
        anInt2896 = argument_76_;
        anInt2892 = argument_81_;
        anInt2888 = argument_80_;
        anInt2887 = argument_75_;
    }
}
