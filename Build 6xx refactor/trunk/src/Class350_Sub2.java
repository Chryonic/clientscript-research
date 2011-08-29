/* Class350_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class350_Sub2 extends Class350 {
    static Class149 aClass149_5436;
    float v5;
    float v6;
    float v1;
    float v7;
    float v3;
    float v0;
    float aFloat5443;
    float aFloat5444;
    float aFloat5445;
    static int anInt5446 = 0;
    float v4;
    float aFloat5448;
    float v2;
    static Class207 aClass207_5450;
    static Class75 aClass75_5451;
    static boolean aBoolean5452;
    static Class307 aClass307_5453;

    final void method3828(int argument_0_, int argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_) {
        float f = Class55.aFloatArray395[argument_3_ & 0x3fff];
        float f_6_ = Class55.aFloatArray403[argument_3_ & 0x3fff];
        float f_7_ = Class55.aFloatArray395[argument_4_ & 0x3fff];
        float f_8_ = Class55.aFloatArray403[argument_4_ & 0x3fff];
        float f_9_ = Class55.aFloatArray395[argument_5_ & 0x3fff];
        float f_10_ = Class55.aFloatArray403[argument_5_ & 0x3fff];
        float f_11_ = f_6_ * f_9_;
        float f_12_ = f_6_ * f_10_;
        this.aFloat5444 = f * f_7_;
        this.v0 = f_8_ * f_12_ + f_7_ * f_9_;
        this.v4 = f_8_ * f_11_ + -f_7_ * f_10_;
        this.v6 = f_7_ * f_11_ + f_10_ * f_8_;
        this.v5 = f_9_ * f;
        this.v1 = f_10_ * f;
        this.v2 = f_9_ * -f_8_ + f_7_ * f_12_;
        this.aFloat5448 = -f_6_;
        this.aFloat5445 = f * f_8_;
        this.v7 = (-((float) argument_2_ * this.v6) + (this.v4 * (float) -argument_0_ - this.v5 * (float) argument_1_));
        this.v3 = (-((float) argument_2_ * this.v2) + (-((float) argument_1_ * this.v1) + this.v0 * (float) -argument_0_));
        this.aFloat5443 = (this.aFloat5445 * (float) -argument_0_ - this.aFloat5448 * (float) argument_1_ - this.aFloat5444 * (float) argument_2_);
    }

    final float[] method3844(float[] argument_13_, int argument_14_) {
        argument_13_[1] = this.v4;
        argument_13_[8] = this.v3;
        argument_13_[7] = 0.0F;
        argument_13_[2] = 0.0F;
        argument_13_[9] = this.v7;
        argument_13_[6] = 0.0F;
        argument_13_[11] = 0.0F;
        argument_13_[10] = this.aFloat5443;
        argument_13_[5] = this.v5;
        argument_13_[14] = 0.0F;
        argument_13_[4] = this.v1;
        argument_13_[12] = 0.0F;
        argument_13_[3] = 0.0F;
        argument_13_[13] = 0.0F;
        argument_13_[0] = this.v0;
        argument_13_[15] = 1.0F;
        return argument_13_;
    }

    final void method3845(Class350 argument_15_, int argument_16_) {
        Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_15_;
        float f = this.v0;
        float f_17_ = this.v4;
        float f_18_ = this.v1;
        float f_19_ = this.v5;
        float f_20_ = this.v2;
        float f_21_ = this.v6;
        float f_22_ = this.v3;
        this.v0 = ((this.aFloat5445 * class350_sub2.v2) + (class350_sub2.v1 * f_17_ + f * class350_sub2.v0));
        float f_23_ = this.v7;
        this.v4 = ((class350_sub2.v6 * this.aFloat5445) + (class350_sub2.v4 * f + f_17_ * class350_sub2.v5));
        this.aFloat5445 = (class350_sub2.aFloat5448 * f_17_ + class350_sub2.aFloat5445 * f + (this.aFloat5445 * class350_sub2.aFloat5444));
        this.v5 = ((this.aFloat5448 * class350_sub2.v6) + (f_19_ * class350_sub2.v5 + class350_sub2.v4 * f_18_));
        this.v1 = ((this.aFloat5448 * class350_sub2.v2) + (f_19_ * class350_sub2.v1 + class350_sub2.v0 * f_18_));
        this.aFloat5448 = (f_18_ * class350_sub2.aFloat5445 + class350_sub2.aFloat5448 * f_19_ + (class350_sub2.aFloat5444 * this.aFloat5448));
        this.v2 = ((this.aFloat5444 * class350_sub2.v2) + (class350_sub2.v1 * f_21_ + class350_sub2.v0 * f_20_));
        this.v6 = (f_20_ * class350_sub2.v4 + f_21_ * class350_sub2.v5 + (class350_sub2.v6 * this.aFloat5444));
        this.aFloat5444 = ((this.aFloat5444 * class350_sub2.aFloat5444) + (class350_sub2.aFloat5448 * f_21_ + f_20_ * class350_sub2.aFloat5445));
        this.v3 = (class350_sub2.v1 * f_23_ + class350_sub2.v0 * f_22_ + (class350_sub2.v2 * this.aFloat5443) + class350_sub2.v3);
        this.v7 = (class350_sub2.v7 + ((class350_sub2.v6 * this.aFloat5443) + (class350_sub2.v5 * f_23_ + class350_sub2.v4 * f_22_)));
        this.aFloat5443 = (f_22_ * class350_sub2.aFloat5445 + class350_sub2.aFloat5448 * f_23_ + (this.aFloat5443 * class350_sub2.aFloat5444) + class350_sub2.aFloat5443);
    }

    final float method3846(float argument_24_, float argument_25_, byte argument_26_, float argument_27_) {
        return (this.v2 * argument_27_ + (this.v0 * argument_24_ + this.v1 * argument_25_) + this.v3);
    }

    final void method3833(int argument_28_) {
        float f = Class55.aFloatArray395[argument_28_ & 0x3fff];
        float f_29_ = Class55.aFloatArray403[argument_28_ & 0x3fff];
        float f_30_ = this.v4;
        float f_31_ = this.v5;
        float f_32_ = this.v6;
        this.v4 = -(this.aFloat5445 * f_29_) + f * f_30_;
        float f_33_ = this.v7;
        this.aFloat5445 = f * this.aFloat5445 + f_29_ * f_30_;
        this.v5 = f_31_ * f - this.aFloat5448 * f_29_;
        this.v6 = f_32_ * f - f_29_ * this.aFloat5444;
        this.aFloat5448 = f_31_ * f_29_ + f * this.aFloat5448;
        this.v7 = f * f_33_ - f_29_ * this.aFloat5443;
        this.aFloat5444 = f_32_ * f_29_ + this.aFloat5444 * f;
        this.aFloat5443 = f_29_ * f_33_ + this.aFloat5443 * f;
    }

    final void method3847(int argument_34_, Class350 argument_35_) {
        Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_35_;
        this.v1 = class350_sub2.v4;
        this.v2 = class350_sub2.aFloat5445;
        this.v0 = class350_sub2.v0;
        this.v4 = class350_sub2.v1;
        this.v6 = class350_sub2.aFloat5448;
        this.aFloat5445 = class350_sub2.v2;
        this.v5 = class350_sub2.v5;
        this.aFloat5444 = class350_sub2.aFloat5444;
        this.v3 = -((this.v2 * class350_sub2.aFloat5443) + ((this.v1 * class350_sub2.v7) + (class350_sub2.v3 * this.v0)));
        this.aFloat5448 = class350_sub2.v6;
        this.v7 = -((this.v5 * class350_sub2.v7) + (this.v4 * class350_sub2.v3) + (class350_sub2.aFloat5443 * this.v6));
        this.aFloat5443 = -((this.aFloat5445 * class350_sub2.v3) + (this.aFloat5448 * class350_sub2.v7) + (this.aFloat5444 * class350_sub2.aFloat5443));
    }

    final void method3829(int argument_36_, int argument_37_, int argument_38_, int[] argument_39_) {
        argument_39_[1] = (int) (this.v7 + (((float) argument_38_ * this.v6) + ((this.v5 * (float) argument_37_) + ((float) argument_36_ * this.v4))));
        argument_39_[0] = (int) (this.v3 + ((this.v0 * (float) argument_36_) + (this.v1 * (float) argument_37_) + (this.v2 * (float) argument_38_)));
        argument_39_[2] = (int) (this.aFloat5443 + (((float) argument_38_ * this.aFloat5444) + (((float) argument_36_ * this.aFloat5445) + ((float) argument_37_ * this.aFloat5448))));
    }

    final void method3848(Class350 argument_40_, byte argument_41_) {
        Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_40_;
        this.v3 = 0.0F;
        this.aFloat5445 = class350_sub2.aFloat5445;
        this.aFloat5444 = class350_sub2.aFloat5444;
        this.aFloat5448 = class350_sub2.aFloat5448;
        this.v0 = class350_sub2.v0;
        this.aFloat5443 = 0.0F;
        this.v2 = class350_sub2.v2;
        this.v7 = 0.0F;
        this.v6 = class350_sub2.v6;
        this.v4 = class350_sub2.v4;
        this.v1 = class350_sub2.v1;
        this.v5 = class350_sub2.v5;
    }

    final void method3849(int argument_42_, float argument_43_, float argument_44_, float argument_45_) {
        this.aFloat5443 *= argument_43_;
        this.v4 *= argument_44_;
        this.aFloat5448 *= argument_43_;
        this.v3 *= argument_45_;
        this.v2 *= argument_45_;
        this.v0 *= argument_45_;
        this.v7 *= argument_44_;
        this.aFloat5444 *= argument_43_;
        this.v5 *= argument_44_;
        this.v1 *= argument_45_;
        this.aFloat5445 *= argument_43_;
        this.v6 *= argument_44_;
    }

    final void method3831(int argument_46_, int argument_47_, int argument_48_, int[] argument_49_) {
        argument_47_ -= this.v7;
        argument_48_ -= this.aFloat5443;
        argument_46_ -= this.v3;
        argument_49_[1] = (int) ((float) argument_48_ * this.aFloat5448 + (((float) argument_46_ * this.v1) + (this.v5 * (float) argument_47_)));
        argument_49_[0] = (int) (this.aFloat5445 * (float) argument_48_ + (((float) argument_47_ * this.v4) + (this.v0 * (float) argument_46_)));
        argument_49_[2] = (int) ((float) argument_46_ * this.v2 + (float) argument_47_ * this.v6 + ((float) argument_48_ * this.aFloat5444));
    }

    final void method3834(int argument_50_) {
        float f = Class55.aFloatArray395[argument_50_ & 0x3fff];
        float f_51_ = Class55.aFloatArray403[argument_50_ & 0x3fff];
        float f_52_ = this.v0;
        float f_53_ = this.v1;
        float f_54_ = this.v2;
        float f_55_ = this.v3;
        this.v0 = f_52_ * f + this.aFloat5445 * f_51_;
        this.aFloat5445 = this.aFloat5445 * f - f_51_ * f_52_;
        this.v1 = f_53_ * f + this.aFloat5448 * f_51_;
        this.aFloat5448 = -(f_53_ * f_51_) + f * this.aFloat5448;
        this.v2 = f_54_ * f + this.aFloat5444 * f_51_;
        this.v3 = f_51_ * this.aFloat5443 + f * f_55_;
        this.aFloat5444 = this.aFloat5444 * f - f_51_ * f_54_;
        this.aFloat5443 = this.aFloat5443 * f - f_55_ * f_51_;
    }

    final void method3835(int argument_56_, int argument_57_, int argument_58_) {
        this.v3 += (float) argument_56_;
        this.v7 += (float) argument_57_;
        this.aFloat5443 += (float) argument_58_;
    }

    final float method3850(float argument_59_, float argument_60_, int argument_61_, float argument_62_) {
        return (this.aFloat5445 * argument_60_ + this.aFloat5448 * argument_59_ + this.aFloat5444 * argument_62_ + this.aFloat5443);
    }

    final void method3824(int argument_63_) {
        this.v5 = 1.0F;
        this.v0 = this.aFloat5444 = Class55.aFloatArray395[argument_63_ & 0x3fff];
        this.v2 = Class55.aFloatArray403[argument_63_ & 0x3fff];
        this.v1 = this.v3 = this.v4 = this.v6 = this.v7 = this.aFloat5448 = this.aFloat5443 = 0.0F;
        this.aFloat5445 = -this.v2;
    }

    public static void method3851(int argument) {
        aClass149_5436 = null;
        aClass307_5453 = null;
        aClass207_5450 = null;
        aClass75_5451 = null;
    }

    final float[] method3852(byte argument_64_, float[] argument_65_) {
        argument_65_[4] = this.v4;
        argument_65_[10] = this.aFloat5444;
        argument_65_[14] = 0.0F;
        argument_65_[5] = this.v5;
        argument_65_[2] = this.v2;
        argument_65_[12] = 0.0F;
        argument_65_[9] = this.aFloat5448;
        argument_65_[1] = this.v1;
        argument_65_[6] = this.v6;
        argument_65_[13] = 0.0F;
        argument_65_[3] = 0.0F;
        argument_65_[7] = 0.0F;
        argument_65_[15] = 0.0F;
        argument_65_[0] = this.v0;
        argument_65_[11] = 0.0F;
        argument_65_[8] = this.aFloat5445;
        return argument_65_;
    }

    final void method3853(byte argument_66_, float argument_67_, float argument_68_, float argument_69_) {
        this.v0 = argument_67_;
        this.v3 = 0.0F;
        this.v2 = 0.0F;
        this.v7 = 0.0F;
        this.v1 = 0.0F;
        this.v5 = argument_69_;
        this.aFloat5443 = 0.0F;
        this.aFloat5445 = 0.0F;
        this.aFloat5448 = 0.0F;
        this.v6 = 0.0F;
        this.aFloat5444 = argument_68_;
        this.v4 = 0.0F;
    }

    final void method3839(int argument_70_) {
        this.aFloat5444 = 1.0F;
        this.v0 = this.v5 = Class55.aFloatArray395[argument_70_ & 0x3fff];
        this.v4 = Class55.aFloatArray403[argument_70_ & 0x3fff];
        this.v1 = -this.v4;
        this.v2 = this.v3 = this.v6 = this.v7 = this.aFloat5445 = this.aFloat5448 = this.aFloat5443 = 0.0F;
    }

    final void method3840() {
        this.v0 = this.v5 = this.aFloat5444 = 1.0F;
        this.v4 = this.aFloat5445 = this.v1 = this.aFloat5448 = this.v2 = this.v6 = this.v3 = this.v7 = this.aFloat5443 = 0.0F;
    }

    final void method3838(Class350 argument_71_) {
        Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_71_;
        this.v5 = class350_sub2.v5;
        this.aFloat5444 = class350_sub2.aFloat5444;
        this.v4 = class350_sub2.v4;
        this.v7 = class350_sub2.v7;
        this.v2 = class350_sub2.v2;
        this.aFloat5445 = class350_sub2.aFloat5445;
        this.v0 = class350_sub2.v0;
        this.v6 = class350_sub2.v6;
        this.aFloat5448 = class350_sub2.aFloat5448;
        this.v1 = class350_sub2.v1;
        this.aFloat5443 = class350_sub2.aFloat5443;
        this.v3 = class350_sub2.v3;
    }

    final void method3837(int argument_72_) {
        float f = Class55.aFloatArray395[argument_72_ & 0x3fff];
        float f_73_ = Class55.aFloatArray403[argument_72_ & 0x3fff];
        float f_74_ = this.v0;
        float f_75_ = this.v1;
        float f_76_ = this.v2;
        float f_77_ = this.v3;
        this.v0 = -(f_73_ * this.v4) + f_74_ * f;
        this.v4 = f * this.v4 + f_73_ * f_74_;
        this.v1 = -(this.v5 * f_73_) + f_75_ * f;
        this.v2 = f * f_76_ - f_73_ * this.v6;
        this.v5 = f * this.v5 + f_73_ * f_75_;
        this.v6 = this.v6 * f + f_73_ * f_76_;
        this.v3 = f_77_ * f - f_73_ * this.v7;
        this.v7 = f_77_ * f_73_ + f * this.v7;
    }

    final void method3854(Class350 argument_78_, Class350 argument_79_) {
        Class350_Sub2 class350_sub2 = (Class350_Sub2) argument_78_;
        Class350_Sub2 class350_sub2_80_ = (Class350_Sub2) argument_79_;
        this.v0 = ((class350_sub2.v0 * class350_sub2_80_.v0) + (class350_sub2.v1 * class350_sub2_80_.v4) + (class350_sub2.v2 * class350_sub2_80_.aFloat5445));
        this.v4 = ((class350_sub2_80_.aFloat5445 * class350_sub2.v6) + ((class350_sub2_80_.v0 * class350_sub2.v4) + (class350_sub2.v5 * class350_sub2_80_.v4)));
        this.v1 = ((class350_sub2_80_.aFloat5448 * class350_sub2.v2) + ((class350_sub2.v0 * class350_sub2_80_.v1) + (class350_sub2.v1 * class350_sub2_80_.v5)));
        this.aFloat5445 = ((class350_sub2_80_.aFloat5445 * class350_sub2.aFloat5444) + ((class350_sub2_80_.v4 * class350_sub2.aFloat5448) + (class350_sub2_80_.v0 * class350_sub2.aFloat5445)));
        this.v5 = ((class350_sub2.v6 * class350_sub2_80_.aFloat5448) + ((class350_sub2_80_.v1 * class350_sub2.v4) + (class350_sub2_80_.v5 * class350_sub2.v5)));
        this.aFloat5448 = ((class350_sub2_80_.aFloat5448 * class350_sub2.aFloat5444) + ((class350_sub2_80_.v1 * class350_sub2.aFloat5445) + (class350_sub2.aFloat5448 * class350_sub2_80_.v5)));
        this.v2 = ((class350_sub2_80_.v6 * class350_sub2.v1) + (class350_sub2.v0 * class350_sub2_80_.v2) + (class350_sub2_80_.aFloat5444 * class350_sub2.v2));
        this.v6 = ((class350_sub2.v6 * class350_sub2_80_.aFloat5444) + ((class350_sub2_80_.v6 * class350_sub2.v5) + (class350_sub2_80_.v2 * class350_sub2.v4)));
        this.v3 = ((class350_sub2.v0 * class350_sub2_80_.v3) + (class350_sub2_80_.v7 * class350_sub2.v1) + (class350_sub2_80_.aFloat5443 * class350_sub2.v2) + class350_sub2.v3);
        this.aFloat5444 = ((class350_sub2.aFloat5444 * class350_sub2_80_.aFloat5444) + ((class350_sub2.aFloat5445 * class350_sub2_80_.v2) + (class350_sub2.aFloat5448 * class350_sub2_80_.v6)));
        this.v7 = ((class350_sub2_80_.aFloat5443 * class350_sub2.v6) + ((class350_sub2.v5 * class350_sub2_80_.v7) + (class350_sub2_80_.v3 * class350_sub2.v4)) + class350_sub2.v7);
        this.aFloat5443 = (class350_sub2.aFloat5443 + ((class350_sub2.aFloat5444 * class350_sub2_80_.aFloat5443) + ((class350_sub2.aFloat5448 * class350_sub2_80_.v7) + (class350_sub2.aFloat5445 * class350_sub2_80_.v3))));
    }

    final void method3855(float argument_81_, float argument_82_, int argument_83_, float argument_84_, float[] argument_85_) {
        argument_85_[argument_83_] = (this.aFloat5444 * argument_82_ + (this.aFloat5445 * argument_84_ + this.aFloat5448 * argument_81_));
        argument_85_[0] = (this.v2 * argument_82_ + (argument_84_ * this.v0 + this.v1 * argument_81_));
        argument_85_[1] = (this.v6 * argument_82_ + (argument_81_ * this.v5 + argument_84_ * this.v4));
    }

    final float[] method3856(float[] argument_86_, byte argument_87_) {
        argument_86_[13] = 0.0F;
        argument_86_[12] = 0.0F;
        argument_86_[11] = this.aFloat5443;
        argument_86_[15] = 1.0F;
        argument_86_[7] = this.v7;
        argument_86_[5] = this.v5;
        argument_86_[3] = this.v3;
        argument_86_[4] = this.v4;
        argument_86_[2] = this.v2;
        argument_86_[8] = this.aFloat5445;
        argument_86_[1] = this.v1;
        argument_86_[10] = this.aFloat5444;
        argument_86_[14] = 0.0F;
        argument_86_[0] = this.v0;
        argument_86_[9] = this.aFloat5448;
        argument_86_[6] = this.v6;
        return argument_86_;
    }

    final float[] getFirst2Rows(float[] argument_89_) {
        argument_89_[0] = this.v0;
        argument_89_[1] = this.v1;
        argument_89_[2] = this.v2;
        argument_89_[3] = this.v3;
        argument_89_[4] = this.v4;
        argument_89_[5] = this.v5;
        argument_89_[6] = this.v6;
        argument_89_[7] = this.v7;
        return argument_89_;
    }

    static final Class307 method3858(int argument, Socket argument_90_, int argument_91_) throws IOException {
        return new Class307_Sub1(argument_90_, argument_91_);
    }

    final float[] getMatrixArray(float[] argument_92_) {
        argument_92_[12] = this.v3;
        argument_92_[3] = 0.0F;
        argument_92_[0] = this.v0;
        argument_92_[13] = this.v7;
        argument_92_[15] = 1.0F;
        argument_92_[5] = this.v5;
        argument_92_[7] = 0.0F;
        argument_92_[14] = this.aFloat5443;
        argument_92_[1] = this.v4;
        argument_92_[9] = this.v6;
        argument_92_[4] = this.v1;
        argument_92_[8] = this.v2;
        argument_92_[6] = this.aFloat5448;
        argument_92_[11] = 0.0F;
        argument_92_[2] = this.aFloat5445;
        argument_92_[10] = this.aFloat5444;
        return argument_92_;
    }

    final Class350 method3826() {
        Class350_Sub2 class350_sub2 = new Class350_Sub2();
        class350_sub2.aFloat5444 = this.aFloat5444;
        class350_sub2.v5 = this.v5;
        class350_sub2.v6 = this.v6;
        class350_sub2.aFloat5448 = this.aFloat5448;
        class350_sub2.v2 = this.v2;
        class350_sub2.aFloat5445 = this.aFloat5445;
        class350_sub2.aFloat5443 = this.aFloat5443;
        class350_sub2.v1 = this.v1;
        class350_sub2.v0 = this.v0;
        class350_sub2.v7 = this.v7;
        class350_sub2.v4 = this.v4;
        class350_sub2.v3 = this.v3;
        return class350_sub2;
    }

    final void method3841(int argument_94_) {
        this.v0 = 1.0F;
        this.v5 = this.aFloat5444 = Class55.aFloatArray395[argument_94_ & 0x3fff];
        this.aFloat5448 = Class55.aFloatArray403[argument_94_ & 0x3fff];
        this.v1 = this.v2 = this.v3 = this.v4 = this.v7 = this.aFloat5445 = this.aFloat5443 = 0.0F;
        this.v6 = -this.aFloat5448;
    }

    final void method3860(float argument_95_, float argument_96_, float argument_97_, int argument_98_, float argument_99_, float argument_100_, float argument_101_, float argument_102_, float argument_103_, float argument_104_) {
        this.v7 = 0.0F;
        this.aFloat5445 = argument_102_;
        this.aFloat5443 = (float) argument_98_;
        this.v4 = argument_97_;
        this.v2 = argument_95_;
        this.v6 = argument_99_;
        this.v1 = argument_96_;
        this.aFloat5448 = argument_101_;
        this.aFloat5444 = argument_104_;
        this.v0 = argument_103_;
        this.v3 = 0.0F;
        this.v5 = argument_100_;
    }

    final void method3861(int argument_105_, float argument_106_, boolean argument_107_, float argument_108_, float argument_109_, int argument_110_, int argument_111_) {
        if (argument_105_ != 0) {
            float f = Class55.aFloatArray395[argument_105_ & 0x3fff];
            float f_112_ = Class55.aFloatArray403[argument_105_ & 0x3fff];
            this.v3 = (argument_108_ + (f_112_ * 0.5F - f * 0.5F) * (float) (argument_110_ * 2));
            this.v4 = (float) argument_110_ * (f_112_ * 2.0F);
            this.v1 = (float) argument_111_ * (f_112_ * -2.0F);
            this.aFloat5443 = argument_109_;
            this.aFloat5445 = this.aFloat5448 = this.v2 = this.v6 = 0.0F;
            this.v7 = ((f_112_ * -0.5F - f * 0.5F) * (float) (argument_111_ * 2) + argument_106_);
            this.v0 = f * 2.0F * (float) argument_110_;
            this.aFloat5444 = 1.0F;
            this.v5 = (float) argument_111_ * (f * 2.0F);
        } else {
            this.v5 = (float) (argument_111_ * 2);
            this.v3 = argument_108_ - (float) argument_110_;
            this.v4 = this.aFloat5445 = this.v1 = this.aFloat5448 = this.v2 = this.v6 = 0.0F;
            this.v7 = argument_106_ - (float) argument_111_;
            this.aFloat5444 = 1.0F;
            this.aFloat5443 = argument_109_;
            this.v0 = (float) (argument_110_ * 2);
        }
    }

    final void method3825(int argument_113_, int argument_114_, int argument_115_) {
        this.v0 = this.v5 = this.aFloat5444 = 1.0F;
        this.v3 = (float) argument_113_;
        this.v7 = (float) argument_114_;
        this.aFloat5443 = (float) argument_115_;
        this.v4 = this.aFloat5445 = this.v1 = this.aFloat5448 = this.v2 = this.v6 = 0.0F;
    }

    final void method3830(int argument_116_, int argument_117_, int argument_118_, int[] argument_119_) {
        argument_119_[2] = (int) ((float) argument_118_ * this.aFloat5444 + (((float) argument_116_ * this.aFloat5445) + ((float) argument_117_ * this.aFloat5448)));
        argument_119_[1] = (int) ((float) argument_116_ * this.v4 + ((float) argument_117_ * this.v5) + ((float) argument_118_ * this.v6));
        argument_119_[0] = (int) ((float) argument_118_ * this.v2 + ((this.v0 * (float) argument_116_) + ((float) argument_117_ * this.v1)));
    }

    final void method3832(int[] argument_120_) {
        float f = (float) argument_120_[0] - this.v3;
        float f_121_ = (float) argument_120_[1] - this.v7;
        float f_122_ = -this.aFloat5443 + (float) argument_120_[2];
        argument_120_[1] = (int) (f_122_ * this.aFloat5448 + (f * this.v1 + f_121_ * this.v5));
        argument_120_[0] = (int) (this.aFloat5445 * f_122_ + (this.v4 * f_121_ + f * this.v0));
        argument_120_[2] = (int) (this.aFloat5444 * f_122_ + (f_121_ * this.v6 + f * this.v2));
    }

    final void method3862(int argument_123_) {
        this.v6 = -this.v6;
        this.v5 = -this.v5;
        this.v7 = -this.v7;
        this.aFloat5444 = -this.aFloat5444;
        this.v4 = -this.v4;
        this.aFloat5443 = -this.aFloat5443;
        this.aFloat5445 = -this.aFloat5445;
        this.aFloat5448 = -this.aFloat5448;
    }

    final void method3863(float argument_124_, int argument_125_, float argument_126_, float argument_127_, float argument_128_, float[] argument_129_) {
        argument_129_[argument_125_] = (this.v6 * argument_126_ + (argument_128_ * this.v4 + this.v5 * argument_124_));
        float f;
        float f_130_;
        float f_131_;
        if (argument_128_ > 0.00390625F || argument_128_ < -0.00390625F) {
            float f_132_ = -argument_127_ / argument_128_;
            f = (f_132_ * this.aFloat5445 + this.aFloat5443);
            f_130_ = (this.v0 * f_132_ + this.v3);
            f_131_ = (this.v7 + f_132_ * this.v4);
        } else if (!(argument_124_ > 0.00390625F) && !(argument_124_ < -0.00390625F)) {
            float f_133_ = -argument_127_ / argument_126_;
            f = (this.aFloat5443 + this.aFloat5444 * f_133_);
            f_130_ = (f_133_ * this.v2 + this.v3);
            f_131_ = (f_133_ * this.v6 + this.v7);
        } else {
            float f_134_ = -argument_127_ / argument_124_;
            f_131_ = (this.v7 + f_134_ * this.v5);
            f_130_ = (this.v3 + f_134_ * this.v1);
            f = (f_134_ * this.aFloat5448 + this.aFloat5443);
        }
        argument_129_[0] = (argument_126_ * this.v2 + (this.v1 * argument_124_ + argument_128_ * this.v0));
        argument_129_[2] = (argument_128_ * this.aFloat5445 + this.aFloat5448 * argument_124_ + this.aFloat5444 * argument_126_);
        argument_129_[3] = -(argument_129_[2] * f + (f_131_ * argument_129_[1] + f_130_ * argument_129_[0]));
    }

    final void method3864(int argument_135_, float argument_136_, float argument_137_, float argument_138_) {
        this.v3 += argument_138_;
        this.aFloat5443 += argument_136_;
        this.v7 += argument_137_;
    }

    final float method3865(boolean argument_139_, float argument_140_, float argument_141_, float argument_142_) {
        return (this.v7 + (this.v6 * argument_140_ + (this.v4 * argument_142_ + this.v5 * argument_141_)));
    }

    public Class350_Sub2() {
        method3840();
    }

    final void method3866(float argument_143_, float argument_144_, float argument_145_, byte argument_146_) {
        this.v4 = this.aFloat5445 = this.v1 = this.aFloat5448 = this.v2 = this.v6 = 0.0F;
        this.v0 = this.v5 = this.aFloat5444 = 1.0F;
        this.v7 = argument_145_;
        this.aFloat5443 = argument_143_;
        this.v3 = argument_144_;
    }

    static {
        aClass149_5436 = new Class149(4);
        aClass207_5450 = new Class207(88, -1);
        aBoolean5452 = false;
    }
}
