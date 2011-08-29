/* Class350_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class350_Sub3 extends Class350 {
    static Class207 aClass207_5454 = new Class207(2, -1);
    float aFloat5455;
    float aFloat5456;
    float aFloat5457;
    float aFloat5458;
    float aFloat5459;
    float aFloat5460;
    float aFloat5461;
    float aFloat5462;
    float aFloat5463;
    static Class166 aClass166_5464 = new Class166(125, 8);
    float aFloat5465;
    float aFloat5466;
    float aFloat5467;
    static int anInt5468 = -1;

    final Class350 method3826() {
        Class350_Sub3 class350_sub3 = new Class350_Sub3();
        class350_sub3.aFloat5462 = this.aFloat5462;
        class350_sub3.aFloat5455 = this.aFloat5455;
        class350_sub3.aFloat5463 = this.aFloat5463;
        class350_sub3.aFloat5457 = this.aFloat5457;
        class350_sub3.aFloat5460 = this.aFloat5460;
        class350_sub3.aFloat5465 = this.aFloat5465;
        class350_sub3.aFloat5466 = this.aFloat5466;
        class350_sub3.aFloat5458 = this.aFloat5458;
        class350_sub3.aFloat5459 = this.aFloat5459;
        class350_sub3.aFloat5456 = this.aFloat5456;
        class350_sub3.aFloat5461 = this.aFloat5461;
        class350_sub3.aFloat5467 = this.aFloat5467;
        return class350_sub3;
    }

    public static void method3867(int argument) {
        aClass207_5454 = null;
        aClass166_5464 = null;
    }

    final void method3868(byte argument_0_, float argument_1_, float argument_2_, float argument_3_, int argument_4_, int argument_5_, int argument_6_) {
        if (argument_6_ == 0) {
            this.aFloat5457 = this.aFloat5455 = this.aFloat5460 = this.aFloat5465 = this.aFloat5463 = this.aFloat5466 = 0.0F;
            this.aFloat5458 = (float) argument_4_;
            this.aFloat5461 = 1.0F;
            this.aFloat5456 = (float) argument_5_;
        } else {
            float f = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_6_ & 0x3fff];
            float f_7_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_6_ & 0x3fff];
            this.aFloat5457 = (float) argument_4_ * f_7_;
            this.aFloat5460 = (float) argument_5_ * -f_7_;
            this.aFloat5461 = 1.0F;
            this.aFloat5458 = (float) argument_4_ * f;
            this.aFloat5455 = this.aFloat5465 = this.aFloat5463 = this.aFloat5466 = 0.0F;
            this.aFloat5456 = (float) argument_5_ * f;
        }
        this.aFloat5459 = argument_3_;
        this.aFloat5467 = argument_1_;
        this.aFloat5462 = argument_2_;
    }

    final void method3869(byte argument_8_, Class350 argument_9_) {
        Class350_Sub3 class350_sub3 = (Class350_Sub3) argument_9_;
        this.aFloat5460 = class350_sub3.aFloat5457;
        this.aFloat5458 = class350_sub3.aFloat5458;
        this.aFloat5463 = class350_sub3.aFloat5455;
        this.aFloat5466 = class350_sub3.aFloat5465;
        this.aFloat5457 = class350_sub3.aFloat5460;
        this.aFloat5455 = class350_sub3.aFloat5463;
        this.aFloat5456 = class350_sub3.aFloat5456;
        this.aFloat5459 = -((class350_sub3.aFloat5467 * this.aFloat5460) + (this.aFloat5458 * class350_sub3.aFloat5459) + (this.aFloat5463 * class350_sub3.aFloat5462));
        this.aFloat5465 = class350_sub3.aFloat5466;
        this.aFloat5461 = class350_sub3.aFloat5461;
        this.aFloat5467 = -((this.aFloat5456 * class350_sub3.aFloat5467) + (class350_sub3.aFloat5459 * this.aFloat5457) + (this.aFloat5466 * class350_sub3.aFloat5462));
        this.aFloat5462 = -((class350_sub3.aFloat5459 * this.aFloat5455) + (this.aFloat5465 * class350_sub3.aFloat5467) + (this.aFloat5461 * class350_sub3.aFloat5462));
    }

    final void method3840() {
        this.aFloat5458 = this.aFloat5456 = this.aFloat5461 = 1.0F;
        this.aFloat5457 = this.aFloat5455 = this.aFloat5460 = this.aFloat5465 = this.aFloat5463 = this.aFloat5466 = this.aFloat5459 = this.aFloat5467 = this.aFloat5462 = 0.0F;
    }

    final void method3837(int argument_10_) {
        float f = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_10_ & 0x3fff];
        float f_11_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_10_ & 0x3fff];
        float f_12_ = this.aFloat5458;
        float f_13_ = this.aFloat5460;
        float f_14_ = this.aFloat5463;
        float f_15_ = this.aFloat5459;
        this.aFloat5458 = f * f_12_ - this.aFloat5457 * f_11_;
        this.aFloat5457 = this.aFloat5457 * f + f_12_ * f_11_;
        this.aFloat5460 = -(this.aFloat5456 * f_11_) + f_13_ * f;
        this.aFloat5463 = -(f_11_ * this.aFloat5466) + f_14_ * f;
        this.aFloat5456 = f * this.aFloat5456 + f_13_ * f_11_;
        this.aFloat5466 = f_11_ * f_14_ + f * this.aFloat5466;
        this.aFloat5459 = -(this.aFloat5467 * f_11_) + f * f_15_;
        this.aFloat5467 = f_11_ * f_15_ + this.aFloat5467 * f;
    }

    final void method3834(int argument_16_) {
        float f = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_16_ & 0x3fff];
        float f_17_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_16_ & 0x3fff];
        float f_18_ = this.aFloat5458;
        float f_19_ = this.aFloat5460;
        float f_20_ = this.aFloat5463;
        float f_21_ = this.aFloat5459;
        this.aFloat5458 = f_17_ * this.aFloat5455 + f * f_18_;
        this.aFloat5460 = f * f_19_ + f_17_ * this.aFloat5465;
        this.aFloat5455 = -(f_18_ * f_17_) + this.aFloat5455 * f;
        this.aFloat5465 = -(f_19_ * f_17_) + f * this.aFloat5465;
        this.aFloat5463 = this.aFloat5461 * f_17_ + f_20_ * f;
        this.aFloat5461 = f * this.aFloat5461 - f_20_ * f_17_;
        this.aFloat5459 = f_17_ * this.aFloat5462 + f * f_21_;
        this.aFloat5462 = this.aFloat5462 * f - f_17_ * f_21_;
    }

    final void method3835(int argument_22_, int argument_23_, int argument_24_) {
        this.aFloat5459 += (float) argument_22_;
        this.aFloat5462 += (float) argument_24_;
        this.aFloat5467 += (float) argument_23_;
    }

    final void method3870(int argument_25_, float[] argument_26_, float argument_27_, float argument_28_, float argument_29_, float argument_30_) {
        argument_26_[2] = (argument_29_ * this.aFloat5461 + (this.aFloat5455 * argument_28_ + this.aFloat5465 * argument_27_));
        float f;
        float f_31_;
        float f_32_;
        if (argument_28_ > 0.00390625F || argument_28_ < -0.00390625F) {
            float f_33_ = -argument_30_ / argument_28_;
            f_31_ = (this.aFloat5457 * f_33_ + this.aFloat5467);
            f_32_ = (this.aFloat5462 + this.aFloat5455 * f_33_);
            f = (this.aFloat5459 + f_33_ * this.aFloat5458);
        } else if (argument_27_ > 0.00390625F || argument_27_ < -0.00390625F) {
            float f_34_ = -argument_30_ / argument_27_;
            f = (f_34_ * this.aFloat5460 + this.aFloat5459);
            f_31_ = (this.aFloat5467 + this.aFloat5456 * f_34_);
            f_32_ = (this.aFloat5462 + this.aFloat5465 * f_34_);
        } else {
            float f_35_ = -argument_30_ / argument_29_;
            f = (f_35_ * this.aFloat5463 + this.aFloat5459);
            f_32_ = (this.aFloat5462 + f_35_ * this.aFloat5461);
            f_31_ = (this.aFloat5467 + f_35_ * this.aFloat5466);
        }
        argument_26_[1] = (this.aFloat5456 * argument_27_ + this.aFloat5457 * argument_28_ + argument_29_ * this.aFloat5466);
        argument_26_[0] = (this.aFloat5458 * argument_28_ + this.aFloat5460 * argument_27_ + this.aFloat5463 * argument_29_);
        argument_26_[3] = -(argument_26_[1] * f_31_ + f * argument_26_[0] + argument_26_[2] * f_32_);
    }

    final void method3841(int argument_36_) {
        this.aFloat5458 = 1.0F;
        this.aFloat5456 = this.aFloat5461 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_36_ & 0x3fff];
        this.aFloat5465 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_36_ & 0x3fff];
        this.aFloat5466 = -this.aFloat5465;
        this.aFloat5460 = this.aFloat5463 = this.aFloat5459 = this.aFloat5457 = this.aFloat5467 = this.aFloat5455 = this.aFloat5462 = 0.0F;
    }

    static final void method3871(int argument, int argument_37_, int argument_38_) {
        Class353_Sub9.anInt5523 = argument;
        Class349.anInt2921 = argument_37_;
        if (Class50.anInt365 == 0) {
            Class189_Sub3.anInt5647 = Class353_Sub9.anInt5523 + Class344.anInt3590 * 2;
            dba_sub_772_Sub2.anInt6366 = Node_Sub18.anInt4006 * 2 + Class349.anInt2921;
        } else if (Class50.anInt365 == 1) {
            Class24.anInt161 = (Class154.anInt3615 + (Class353_Sub9.anInt5523 / Class5.anInt67 + 2));
            Class85.anInt604 = (Class349.anInt2921 / Node_Sub31_Sub2.anInt5844 + 2 + Class4.anInt60);
            Class189_Sub3.anInt5647 = Class5.anInt67 * Class24.anInt161;
            dba_sub_772_Sub2.anInt6366 = Node_Sub31_Sub2.anInt5844 * Class85.anInt604;
            Class344.anInt3590 = Class189_Sub3.anInt5647 - Class353_Sub9.anInt5523 >> 1;
            Node_Sub18.anInt4006 = -Class349.anInt2921 + dba_sub_772_Sub2.anInt6366 >> 1;
        } else if (Class50.anInt365 == 2) {
            Class189_Sub3.anInt5647 = Class353_Sub9.anInt5523;
            dba_sub_772_Sub2.anInt6366 = Class349.anInt2921;
        }
    }

    final void method3830(int argument_39_, int argument_40_, int argument_41_, int[] argument_42_) {
        argument_42_[1] = (int) ((float) argument_40_ * this.aFloat5456 + (float) argument_39_ * this.aFloat5457 + ((float) argument_41_ * this.aFloat5466));
        argument_42_[2] = (int) ((float) argument_41_ * this.aFloat5461 + ((this.aFloat5465 * (float) argument_40_) + ((float) argument_39_ * this.aFloat5455)));
        argument_42_[0] = (int) (this.aFloat5458 * (float) argument_39_ + this.aFloat5460 * (float) argument_40_ + ((float) argument_41_ * this.aFloat5463));
    }

    final void method3829(int argument_43_, int argument_44_, int argument_45_, int[] argument_46_) {
        argument_46_[0] = (int) (this.aFloat5459 + (((float) argument_44_ * this.aFloat5460) + (this.aFloat5458 * (float) argument_43_) + (this.aFloat5463 * (float) argument_45_)));
        argument_46_[1] = (int) ((float) argument_45_ * this.aFloat5466 + (((float) argument_44_ * this.aFloat5456) + (this.aFloat5457 * (float) argument_43_)) + this.aFloat5467);
        argument_46_[2] = (int) (this.aFloat5465 * (float) argument_44_ + (float) argument_43_ * this.aFloat5455 + (float) argument_45_ * this.aFloat5461 + this.aFloat5462);
    }

    final void method3839(int argument_47_) {
        this.aFloat5461 = 1.0F;
        this.aFloat5458 = this.aFloat5456 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_47_ & 0x3fff];
        this.aFloat5457 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_47_ & 0x3fff];
        this.aFloat5460 = -this.aFloat5457;
        this.aFloat5463 = this.aFloat5459 = this.aFloat5466 = this.aFloat5467 = this.aFloat5455 = this.aFloat5465 = this.aFloat5462 = 0.0F;
    }

    final float[] method3872(byte argument_48_) {
        Class_aa.aFloatArray54[12] = 0.0F;
        Class_aa.aFloatArray54[1] = this.aFloat5457;
        Class_aa.aFloatArray54[2] = this.aFloat5455;
        Class_aa.aFloatArray54[10] = this.aFloat5461;
        Class_aa.aFloatArray54[6] = this.aFloat5465;
        Class_aa.aFloatArray54[5] = this.aFloat5456;
        Class_aa.aFloatArray54[14] = 0.0F;
        Class_aa.aFloatArray54[0] = this.aFloat5458;
        Class_aa.aFloatArray54[8] = this.aFloat5463;
        Class_aa.aFloatArray54[4] = this.aFloat5460;
        Class_aa.aFloatArray54[13] = 0.0F;
        Class_aa.aFloatArray54[9] = this.aFloat5466;
        return Class_aa.aFloatArray54;
    }

    final void method3833(int argument_49_) {
        float f = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_49_ & 0x3fff];
        float f_50_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_49_ & 0x3fff];
        float f_51_ = this.aFloat5457;
        float f_52_ = this.aFloat5456;
        float f_53_ = this.aFloat5466;
        this.aFloat5457 = -(f_50_ * this.aFloat5455) + f_51_ * f;
        float f_54_ = this.aFloat5467;
        this.aFloat5455 = f_51_ * f_50_ + this.aFloat5455 * f;
        this.aFloat5456 = f * f_52_ - f_50_ * this.aFloat5465;
        this.aFloat5465 = this.aFloat5465 * f + f_50_ * f_52_;
        this.aFloat5466 = f_53_ * f - f_50_ * this.aFloat5461;
        this.aFloat5461 = f * this.aFloat5461 + f_50_ * f_53_;
        this.aFloat5467 = f_54_ * f - this.aFloat5462 * f_50_;
        this.aFloat5462 = f_50_ * f_54_ + this.aFloat5462 * f;
    }

    final void method3831(int argument_55_, int argument_56_, int argument_57_, int[] argument_58_) {
        argument_56_ -= this.aFloat5467;
        argument_55_ -= this.aFloat5459;
        argument_57_ -= this.aFloat5462;
        argument_58_[1] = (int) (this.aFloat5465 * (float) argument_57_ + (((float) argument_56_ * this.aFloat5456) + (this.aFloat5460 * (float) argument_55_)));
        argument_58_[0] = (int) (this.aFloat5455 * (float) argument_57_ + (((float) argument_55_ * this.aFloat5458) + ((float) argument_56_ * this.aFloat5457)));
        argument_58_[2] = (int) (this.aFloat5461 * (float) argument_57_ + (((float) argument_56_ * this.aFloat5466) + (this.aFloat5463 * (float) argument_55_)));
    }

    final void method3873(int argument_59_) {
        this.aFloat5461 = -this.aFloat5461;
        this.aFloat5467 = -this.aFloat5467;
        this.aFloat5465 = -this.aFloat5465;
        this.aFloat5456 = -this.aFloat5456;
        this.aFloat5462 = -this.aFloat5462;
        this.aFloat5455 = -this.aFloat5455;
        this.aFloat5466 = -this.aFloat5466;
        this.aFloat5457 = -this.aFloat5457;
    }

    public Class350_Sub3() {
        method3840();
    }

    final void method3825(int argument_60_, int argument_61_, int argument_62_) {
        this.aFloat5467 = (float) argument_61_;
        this.aFloat5458 = this.aFloat5456 = this.aFloat5461 = 1.0F;
        this.aFloat5462 = (float) argument_62_;
        this.aFloat5457 = this.aFloat5455 = this.aFloat5460 = this.aFloat5465 = this.aFloat5463 = this.aFloat5466 = 0.0F;
        this.aFloat5459 = (float) argument_60_;
    }

    final void method3832(int[] argument_63_) {
        float f = -this.aFloat5459 + (float) argument_63_[0];
        float f_64_ = (float) argument_63_[1] - this.aFloat5467;
        float f_65_ = -this.aFloat5462 + (float) argument_63_[2];
        argument_63_[1] = (int) (f_64_ * this.aFloat5456 + f * this.aFloat5460 + this.aFloat5465 * f_65_);
        argument_63_[0] = (int) (f * this.aFloat5458 + f_64_ * this.aFloat5457 + f_65_ * this.aFloat5455);
        argument_63_[2] = (int) (this.aFloat5461 * f_65_ + (this.aFloat5463 * f + f_64_ * this.aFloat5466));
    }

    final float[] method3874(boolean argument_66_) {
        Class_aa.aFloatArray54[13] = this.aFloat5467;
        Class_aa.aFloatArray54[6] = this.aFloat5465;
        Class_aa.aFloatArray54[8] = this.aFloat5463;
        Class_aa.aFloatArray54[0] = this.aFloat5458;
        Class_aa.aFloatArray54[4] = this.aFloat5460;
        Class_aa.aFloatArray54[12] = this.aFloat5459;
        Class_aa.aFloatArray54[2] = this.aFloat5455;
        Class_aa.aFloatArray54[10] = this.aFloat5461;
        Class_aa.aFloatArray54[9] = this.aFloat5466;
        Class_aa.aFloatArray54[14] = this.aFloat5462;
        Class_aa.aFloatArray54[5] = this.aFloat5456;
        Class_aa.aFloatArray54[1] = this.aFloat5457;
        return Class_aa.aFloatArray54;
    }

    final void method3828(int argument_67_, int argument_68_, int argument_69_, int argument_70_, int argument_71_, int argument_72_) {
        float f = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_70_ & 0x3fff];
        float f_73_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_70_ & 0x3fff];
        float f_74_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_71_ & 0x3fff];
        float f_75_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_71_ & 0x3fff];
        float f_76_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_72_ & 0x3fff];
        float f_77_ = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_72_ & 0x3fff];
        float f_78_ = f_73_ * f_76_;
        float f_79_ = f_73_ * f_77_;
        this.aFloat5465 = -f_73_;
        this.aFloat5466 = f_75_ * f_77_ + f_74_ * f_78_;
        this.aFloat5463 = f_76_ * -f_75_ + f_79_ * f_74_;
        this.aFloat5461 = f_74_ * f;
        this.aFloat5455 = f_75_ * f;
        this.aFloat5456 = f * f_76_;
        this.aFloat5457 = f_78_ * f_75_ + f_77_ * -f_74_;
        this.aFloat5458 = f_76_ * f_74_ + f_79_ * f_75_;
        this.aFloat5460 = f_77_ * f;
        this.aFloat5459 = (this.aFloat5458 * (float) -argument_67_ - this.aFloat5460 * (float) argument_68_ - (float) argument_69_ * this.aFloat5463);
        this.aFloat5467 = (-((float) argument_68_ * this.aFloat5456) + this.aFloat5457 * (float) -argument_67_ - this.aFloat5466 * (float) argument_69_);
        this.aFloat5462 = (-((float) argument_69_ * this.aFloat5461) + (this.aFloat5455 * (float) -argument_67_ - (float) argument_68_ * this.aFloat5465));
    }

    final void method3824(int argument_80_) {
        this.aFloat5456 = 1.0F;
        this.aFloat5458 = this.aFloat5461 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6226[argument_80_ & 0x3fff];
        this.aFloat5463 = DoublyLinkedNode_Sub51_Sub2.aFloatArray6224[argument_80_ & 0x3fff];
        this.aFloat5460 = this.aFloat5459 = this.aFloat5457 = this.aFloat5466 = this.aFloat5467 = this.aFloat5465 = this.aFloat5462 = 0.0F;
        this.aFloat5455 = -this.aFloat5463;
    }

    final void method3838(Class350 argument_81_) {
        Class350_Sub3 class350_sub3 = (Class350_Sub3) argument_81_;
        this.aFloat5460 = class350_sub3.aFloat5460;
        this.aFloat5462 = class350_sub3.aFloat5462;
        this.aFloat5459 = class350_sub3.aFloat5459;
        this.aFloat5456 = class350_sub3.aFloat5456;
        this.aFloat5461 = class350_sub3.aFloat5461;
        this.aFloat5467 = class350_sub3.aFloat5467;
        this.aFloat5457 = class350_sub3.aFloat5457;
        this.aFloat5465 = class350_sub3.aFloat5465;
        this.aFloat5463 = class350_sub3.aFloat5463;
        this.aFloat5455 = class350_sub3.aFloat5455;
        this.aFloat5458 = class350_sub3.aFloat5458;
        this.aFloat5466 = class350_sub3.aFloat5466;
    }
}
