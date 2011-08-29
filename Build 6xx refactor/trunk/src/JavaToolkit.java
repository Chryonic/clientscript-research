/* Class_ha_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

final class JavaToolkit extends GraphicsToolkit {
    private int anInt4623;
    private Canvas currentCanvas;
    private int anInt4625;
    Rs2DPainter currentPainter;
    private boolean nullified;
    private boolean aBoolean4628 = false;
    private int anInt4629;
    private JagexHashMap painterMap;
    private int anInt4631;
    int anInt4632;
    int anInt4633;
    int anInt4634;
    int anInt4635;
    private Class149 aClass149_4636;
    int clipRight;
    int anInt4638;
    private boolean aBoolean4639;
    private int anInt4640;
    int anInt4641;
    int anInt4642;
    int anInt4643;
    float[] aFloatArray4644;
    int anInt4645;
    int anInt4646;
    int clipBottom;
    Class350_Sub1 aClass350_Sub1_4648;
    int clipLeft;
    private int anInt4650;
    int anInt4651;
    int anInt4652;
    int anInt4653;
    int[] pixels;
    int anInt4655;
    int width;
    private int anInt4657;
    private Class293[] aClass293Array4658;
    int anInt4659;
    private Class149 aClass149_4660;
    int anInt4661;
    private int height;
    private int anInt4663;
    private int anInt4664;
    int anInt4665;
    int clipTop;
    float[] aFloatArray4667;
    int anInt4668;
    private Class364 aClass364_4669;
    private Class368 aClass368_4670;
    private int anInt4671;

    final void f(int argument_0_, int argument_1_) {
        Class293 class293 = method2112(Thread.currentThread());
        this.anInt4643 = argument_0_;
        this.anInt4641 = argument_1_;
        class293.anInt2405 = this.anInt4641 - 255;
    }

    final int i() {
        return this.anInt4643;
    }

    final void method2043(int argument_2_) {
        aClass293Array4658[argument_2_].method3501(null, -106);
    }

    final int XA() {
        return this.anInt4641;
    }

    final void method2062(int argument_3_, int argument_4_, int argument_5_, int argument_6_) {
        /* empty */
    }

    private final void method2099() {
        for (int anLocalInt = 0; anLocalInt < this.anInt4659; anLocalInt++)
            aClass293Array4658[anLocalInt].method3502(0);
        clearClip();
    }

    final Class368 method2094(int argument_7_, int argument_8_, int argument_9_, int argument_10_, boolean argument_11_) {
        int[] anLocalInts = new int[argument_9_ * argument_10_];
        int anLocalInt = argument_8_ * this.width + argument_7_;
        int anLocalInt_12_ = this.width - argument_9_;
        for (int anLocalInt_13_ = 0; anLocalInt_13_ < argument_10_; anLocalInt_13_++) {
            int anLocalInt_14_ = anLocalInt_13_ * argument_9_;
            for (int anLocalInt_15_ = 0; anLocalInt_15_ < argument_9_; anLocalInt_15_++)
                anLocalInts[anLocalInt_14_ + anLocalInt_15_] = this.pixels[anLocalInt++];
            anLocalInt += anLocalInt_12_;
        }
        if (argument_11_)
            return new Class368_Sub2_Sub2(this, anLocalInts, argument_9_, argument_10_);
        return new java_sprite_24(this, anLocalInts, argument_9_, argument_10_);
    }

    final int r(int argument_16_, int argument_17_, int argument_18_, int argument_19_, int argument_20_, int argument_21_, int argument_22_) {
        float f = ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_16_ + (this.aClass350_Sub1_4648.aFloat5422) * (float) argument_17_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) argument_18_ + (this.aClass350_Sub1_4648.aFloat5427));
        float f_23_ = ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_19_ + (this.aClass350_Sub1_4648.aFloat5422) * (float) argument_20_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) argument_21_ + (this.aClass350_Sub1_4648.aFloat5427));
        int anLocalInt = 0;
        if (f < (float) this.anInt4643 && f_23_ < (float) this.anInt4643)
            anLocalInt |= 0x10;
        else if (f > (float) this.anInt4641 && f_23_ > (float) this.anInt4641)
            anLocalInt |= 0x20;
        int anLocalInt_24_ = (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5421 * (float) argument_16_) + (this.aClass350_Sub1_4648.aFloat5425 * (float) argument_17_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) argument_18_) + this.aClass350_Sub1_4648.aFloat5426) / (float) argument_22_);
        int anLocalInt_25_ = (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5421 * (float) argument_19_) + (this.aClass350_Sub1_4648.aFloat5425 * (float) argument_20_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) argument_21_) + this.aClass350_Sub1_4648.aFloat5426) / (float) argument_22_);
        if (anLocalInt_24_ < this.anInt4635 && anLocalInt_25_ < this.anInt4635)
            anLocalInt |= 0x1;
        else if (anLocalInt_24_ > this.anInt4638 && anLocalInt_25_ > this.anInt4638)
            anLocalInt |= 0x2;
        int anLocalInt_26_ = (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5420 * (float) argument_16_) + (this.aClass350_Sub1_4648.aFloat5430 * (float) argument_17_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) argument_18_) + this.aClass350_Sub1_4648.aFloat5424) / (float) argument_22_);
        int anLocalInt_27_ = (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5420 * (float) argument_19_) + (this.aClass350_Sub1_4648.aFloat5430 * (float) argument_20_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) argument_21_) + this.aClass350_Sub1_4648.aFloat5424) / (float) argument_22_);
        if (anLocalInt_26_ < this.anInt4633 && anLocalInt_27_ < this.anInt4633)
            anLocalInt |= 0x4;
        else if (anLocalInt_26_ > this.anInt4652 && anLocalInt_27_ > this.anInt4652)
            anLocalInt |= 0x8;
        return anLocalInt;
    }

    final Class_aa method2066(int argument_28_, int argument_29_, int[] argument_30_, int[] argument_31_) {
        return new Class_aa_Sub3(argument_28_, argument_29_, argument_30_, argument_31_);
    }

    final void HA(int argument_32_, int argument_33_, int argument_34_, int argument_35_, int[] argument_36_) {
        float f = ((this.aClass350_Sub1_4648.aFloat5427) + ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_32_ + (this.aClass350_Sub1_4648.aFloat5422 * (float) argument_33_) + (this.aClass350_Sub1_4648.aFloat5419 * (float) argument_34_)));
        if (f < (float) this.anInt4643 || f > (float) this.anInt4641)
            argument_36_[0] = argument_36_[1] = argument_36_[2] = -1;
        else {
            int anLocalInt = (int) ((float) this.anInt4653 * (this.aClass350_Sub1_4648.aFloat5426 + ((this.aClass350_Sub1_4648.aFloat5421) * (float) argument_32_ + (this.aClass350_Sub1_4648.aFloat5425) * (float) argument_33_ + (this.aClass350_Sub1_4648.aFloat5428) * (float) argument_34_)) / (float) argument_35_);
            int anLocalInt_37_ = (int) ((float) this.anInt4645 * (this.aClass350_Sub1_4648.aFloat5424 + ((this.aClass350_Sub1_4648.aFloat5420) * (float) argument_32_ + (this.aClass350_Sub1_4648.aFloat5430) * (float) argument_33_ + (this.aClass350_Sub1_4648.aFloat5429) * (float) argument_34_)) / (float) argument_35_);
            if (anLocalInt >= this.anInt4635 && anLocalInt <= this.anInt4638 && anLocalInt_37_ >= this.anInt4633 && anLocalInt_37_ <= this.anInt4652) {
                argument_36_[0] = anLocalInt - this.anInt4635;
                argument_36_[1] = anLocalInt_37_ - this.anInt4633;
                argument_36_[2] = (int) f;
            } else
                argument_36_[0] = argument_36_[1] = argument_36_[2] = -1;
        }
    }

    final boolean method2042() {
        return false;
    }

    final Class368 method2033(Class83 argument_38_, boolean argument_39_) {
        int[] anLocalInts = argument_38_.anIntArray586;
        byte[] anLocalInts_40_ = argument_38_.aByteArray591;
        int anLocalInt = argument_38_.anInt590;
        int anLocalInt_41_ = argument_38_.anInt587;
        Class368_Sub2 class368_sub2;
        if (argument_39_ && argument_38_.aByteArray592 == null) {
            int[] anLocalInts_42_ = new int[anLocalInts.length];
            byte[] anLocalInts_43_ = new byte[anLocalInt * anLocalInt_41_];
            for (int anLocalInt_44_ = 0; anLocalInt_44_ < anLocalInt_41_; anLocalInt_44_++) {
                int anLocalInt_45_ = anLocalInt_44_ * anLocalInt;
                for (int anLocalInt_46_ = 0; anLocalInt_46_ < anLocalInt; anLocalInt_46_++)
                    anLocalInts_43_[anLocalInt_45_ + anLocalInt_46_] = anLocalInts_40_[anLocalInt_45_ + anLocalInt_46_];
            }
            for (int anLocalInt_47_ = 0; anLocalInt_47_ < anLocalInts.length; anLocalInt_47_++)
                anLocalInts_42_[anLocalInt_47_] = anLocalInts[anLocalInt_47_];
            class368_sub2 = new Class368_Sub2_Sub1(this, anLocalInts_43_, anLocalInts_42_, anLocalInt, anLocalInt_41_);
        } else {
            int[] anLocalInts_48_ = new int[anLocalInt * anLocalInt_41_];
            byte[] anLocalInts_49_ = argument_38_.aByteArray592;
            if (anLocalInts_49_ != null) {
                for (int anLocalInt_50_ = 0; anLocalInt_50_ < anLocalInt_41_; anLocalInt_50_++) {
                    int anLocalInt_51_ = anLocalInt_50_ * anLocalInt;
                    for (int anLocalInt_52_ = 0; anLocalInt_52_ < anLocalInt; anLocalInt_52_++)
                        anLocalInts_48_[anLocalInt_51_ + anLocalInt_52_] = (anLocalInts[((anLocalInts_40_[anLocalInt_51_ + anLocalInt_52_]) & 0xff)] | (anLocalInts_49_[anLocalInt_51_ + anLocalInt_52_]) << 24);
                }
                class368_sub2 = new Class368_Sub2_Sub2(this, anLocalInts_48_, anLocalInt, anLocalInt_41_);
            } else {
                for (int anLocalInt_53_ = 0; anLocalInt_53_ < anLocalInt_41_; anLocalInt_53_++) {
                    int anLocalInt_54_ = anLocalInt_53_ * anLocalInt;
                    for (int anLocalInt_55_ = 0; anLocalInt_55_ < anLocalInt; anLocalInt_55_++) {
                        int anLocalInt_56_ = (anLocalInts[(anLocalInts_40_[anLocalInt_54_ + anLocalInt_55_]) & 0xff]);
                        anLocalInts_48_[anLocalInt_54_ + anLocalInt_55_] = (anLocalInt_56_ != 0 ? anLocalInt_56_ | ~0xffffff : 0);
                    }
                }
                class368_sub2 = new java_sprite_24(this, anLocalInts_48_, anLocalInt, anLocalInt_41_);
            }
        }
        class368_sub2.method4024(argument_38_.anInt593, argument_38_.anInt589, argument_38_.anInt588, argument_38_.anInt594);
        return class368_sub2;
    }

    final void DA(int argument_57_, int argument_58_, int argument_59_, int argument_60_) {
        this.anInt4668 = argument_57_;
        this.anInt4642 = argument_58_;
        this.anInt4653 = argument_59_;
        this.anInt4645 = argument_60_;
        method2106();
    }

    final void F(int argument_61_, int argument_62_) {
        int anLocalInt = argument_62_ * this.width + argument_61_;
        int anLocalInt_63_ = argument_62_ * anInt4640 + argument_61_;
        if (anLocalInt != 0 || anLocalInt_63_ != 0) {
            int[] anLocalInts = this.pixels;
            float[] fs = this.aFloatArray4667;
            if (anLocalInt < 0) {
                int anLocalInt_64_ = anLocalInts.length + anLocalInt;
                JagStrings.memcpy(anLocalInts, -anLocalInt, anLocalInts, 0, anLocalInt_64_);
            } else if (anLocalInt > 0) {
                int anLocalInt_65_ = anLocalInts.length - anLocalInt;
                JagStrings.memcpy(anLocalInts, 0, anLocalInts, anLocalInt, anLocalInt_65_);
            }
            if (anLocalInt_63_ < 0) {
                int anLocalInt_66_ = fs.length + anLocalInt_63_;
                JagStrings.memcpy(fs, -anLocalInt_63_, fs, 0, anLocalInt_66_);
            } else if (anLocalInt_63_ > 0) {
                int anLocalInt_67_ = fs.length - anLocalInt_63_;
                JagStrings.memcpy(fs, 0, fs, anLocalInt_63_, anLocalInt_67_);
            }
        }
    }

    final void EA(int argument_68_, int argument_69_, int argument_70_, int argument_71_) {
        Class293 class293 = method2112(Thread.currentThread());
        class293.anInt2413 = argument_68_;
        class293.anInt2408 = argument_69_;
        class293.anInt2407 = argument_70_;
    }

    final void setCanvas(Canvas canvas, int w, int h) {
        Rs2DPainter painter = ((Rs2DPainter) painterMap.get((long) canvas.hashCode()));
        if (painter != null) {
            painter.unlink();
            painter = Rs2DPainter.create(w, h, canvas);
            painterMap.put((long) canvas.hashCode(), painter);
            if (currentCanvas == canvas && aClass364_4669 == null) {
                Dimension dimension = canvas.getSize();
                this.anInt4629 = dimension.width;
                this.anInt4623 = dimension.height;
                this.currentPainter = painter;
                this.pixels = painter.myPixels;
                this.width = painter.width;
                this.height = painter.height;
                if (this.width != anInt4640 || height != anInt4650) {
                    anInt4657 = anInt4640 = this.width;
                    anInt4631 = anInt4650 = height;
                    this.aFloatArray4644 = this.aFloatArray4667 = new float[anInt4640 * anInt4650];
                }
                method2099();
            }
        }
    }

    final boolean method2060() {
        return false;
    }

    final boolean method2019() {
        return false;
    }

    final boolean method2100() {
        return nullified;
    }

    final int or(int argument_75_, int argument_76_) {
        return argument_75_ | argument_76_;
    }

    final boolean method2076() {
        return false;
    }

    private final void method2101(int argument_77_, int argument_78_, int argument_79_, int argument_80_, int argument_81_, int argument_82_) {
        if (argument_80_ < 0)
            argument_80_ = -argument_80_;
        int anLocalInt = argument_78_ - argument_80_;
        if (anLocalInt < this.clipTop)
            anLocalInt = this.clipTop;
        int anLocalInt_83_ = argument_78_ + argument_80_ + 1;
        if (anLocalInt_83_ > this.clipBottom)
            anLocalInt_83_ = this.clipBottom;
        int anLocalInt_84_ = anLocalInt;
        int anLocalInt_85_ = argument_80_ * argument_80_;
        int anLocalInt_86_ = 0;
        int anLocalInt_87_ = argument_78_ - anLocalInt_84_;
        int anLocalInt_88_ = anLocalInt_87_ * anLocalInt_87_;
        int anLocalInt_89_ = anLocalInt_88_ - anLocalInt_87_;
        if (argument_78_ > anLocalInt_83_)
            argument_78_ = anLocalInt_83_;
        int anLocalInt_90_ = argument_81_ >>> 24;
        if (argument_82_ == 0 || argument_82_ == 1 && anLocalInt_90_ == 255) {
            while (anLocalInt_84_ < argument_78_) {
                for (/**/; (anLocalInt_89_ <= anLocalInt_85_ || anLocalInt_88_ <= anLocalInt_85_); anLocalInt_89_ += anLocalInt_86_++ + anLocalInt_86_)
                    anLocalInt_88_ += anLocalInt_86_ + anLocalInt_86_;
                int anLocalInt_91_ = argument_77_ - anLocalInt_86_ + 1;
                if (anLocalInt_91_ < this.clipLeft)
                    anLocalInt_91_ = this.clipLeft;
                int anLocalInt_92_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_92_ > this.clipRight)
                    anLocalInt_92_ = this.clipRight;
                int anLocalInt_93_ = (anLocalInt_91_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_94_ = anLocalInt_91_; anLocalInt_94_ < anLocalInt_92_; anLocalInt_94_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_93_]))
                        this.pixels[anLocalInt_93_] = argument_81_;
                    anLocalInt_93_++;
                }
                anLocalInt_84_++;
                anLocalInt_88_ -= anLocalInt_87_-- + anLocalInt_87_;
                anLocalInt_89_ -= anLocalInt_87_ + anLocalInt_87_;
            }
            anLocalInt_86_ = argument_80_;
            anLocalInt_87_ = anLocalInt_84_ - argument_78_;
            anLocalInt_89_ = anLocalInt_87_ * anLocalInt_87_ + anLocalInt_85_;
            anLocalInt_88_ = anLocalInt_89_ - anLocalInt_86_;
            anLocalInt_89_ -= anLocalInt_87_;
            while (anLocalInt_84_ < anLocalInt_83_) {
                for (/**/; (anLocalInt_89_ > anLocalInt_85_ && anLocalInt_88_ > anLocalInt_85_); anLocalInt_88_ -= anLocalInt_86_ + anLocalInt_86_)
                    anLocalInt_89_ -= anLocalInt_86_-- + anLocalInt_86_;
                int anLocalInt_95_ = argument_77_ - anLocalInt_86_;
                if (anLocalInt_95_ < this.clipLeft)
                    anLocalInt_95_ = this.clipLeft;
                int anLocalInt_96_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_96_ > this.clipRight - 1)
                    anLocalInt_96_ = this.clipRight - 1;
                int anLocalInt_97_ = (anLocalInt_95_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_98_ = anLocalInt_95_; anLocalInt_98_ <= anLocalInt_96_; anLocalInt_98_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_97_]))
                        this.pixels[anLocalInt_97_] = argument_81_;
                    anLocalInt_97_++;
                }
                anLocalInt_84_++;
                anLocalInt_89_ += anLocalInt_87_ + anLocalInt_87_;
                anLocalInt_88_ += anLocalInt_87_++ + anLocalInt_87_;
            }
        } else if (argument_82_ == 1) {
            argument_81_ = (((argument_81_ & 0xff00ff) * anLocalInt_90_ >> 8 & 0xff00ff) + ((argument_81_ & 0xff00) * anLocalInt_90_ >> 8 & 0xff00) + (anLocalInt_90_ << 24));
            int anLocalInt_99_ = 256 - anLocalInt_90_;
            while (anLocalInt_84_ < argument_78_) {
                for (/**/; (anLocalInt_89_ <= anLocalInt_85_ || anLocalInt_88_ <= anLocalInt_85_); anLocalInt_89_ += anLocalInt_86_++ + anLocalInt_86_)
                    anLocalInt_88_ += anLocalInt_86_ + anLocalInt_86_;
                int anLocalInt_100_ = argument_77_ - anLocalInt_86_ + 1;
                if (anLocalInt_100_ < this.clipLeft)
                    anLocalInt_100_ = this.clipLeft;
                int anLocalInt_101_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_101_ > this.clipRight)
                    anLocalInt_101_ = this.clipRight;
                int anLocalInt_102_ = (anLocalInt_100_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_103_ = anLocalInt_100_; anLocalInt_103_ < anLocalInt_101_; anLocalInt_103_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_102_])) {
                        int anLocalInt_104_ = (this.pixels[anLocalInt_102_]);
                        anLocalInt_104_ = ((((anLocalInt_104_ & 0xff00ff) * anLocalInt_99_ >> 8) & 0xff00ff) + (((anLocalInt_104_ & 0xff00) * anLocalInt_99_ >> 8) & 0xff00));
                        this.pixels[anLocalInt_102_] = argument_81_ + anLocalInt_104_;
                    }
                    anLocalInt_102_++;
                }
                anLocalInt_84_++;
                anLocalInt_88_ -= anLocalInt_87_-- + anLocalInt_87_;
                anLocalInt_89_ -= anLocalInt_87_ + anLocalInt_87_;
            }
            anLocalInt_86_ = argument_80_;
            anLocalInt_87_ = -anLocalInt_87_;
            anLocalInt_89_ = anLocalInt_87_ * anLocalInt_87_ + anLocalInt_85_;
            anLocalInt_88_ = anLocalInt_89_ - anLocalInt_86_;
            anLocalInt_89_ -= anLocalInt_87_;
            while (anLocalInt_84_ < anLocalInt_83_) {
                for (/**/; (anLocalInt_89_ > anLocalInt_85_ && anLocalInt_88_ > anLocalInt_85_); anLocalInt_88_ -= anLocalInt_86_ + anLocalInt_86_)
                    anLocalInt_89_ -= anLocalInt_86_-- + anLocalInt_86_;
                int anLocalInt_105_ = argument_77_ - anLocalInt_86_;
                if (anLocalInt_105_ < this.clipLeft)
                    anLocalInt_105_ = this.clipLeft;
                int anLocalInt_106_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_106_ > this.clipRight - 1)
                    anLocalInt_106_ = this.clipRight - 1;
                int anLocalInt_107_ = (anLocalInt_105_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_108_ = anLocalInt_105_; anLocalInt_108_ <= anLocalInt_106_; anLocalInt_108_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_107_])) {
                        int anLocalInt_109_ = (this.pixels[anLocalInt_107_]);
                        anLocalInt_109_ = ((((anLocalInt_109_ & 0xff00ff) * anLocalInt_99_ >> 8) & 0xff00ff) + (((anLocalInt_109_ & 0xff00) * anLocalInt_99_ >> 8) & 0xff00));
                        this.pixels[anLocalInt_107_] = argument_81_ + anLocalInt_109_;
                    }
                    anLocalInt_107_++;
                }
                anLocalInt_84_++;
                anLocalInt_89_ += anLocalInt_87_ + anLocalInt_87_;
                anLocalInt_88_ += anLocalInt_87_++ + anLocalInt_87_;
            }
        } else if (argument_82_ == 2) {
            while (anLocalInt_84_ < argument_78_) {
                for (/**/; (anLocalInt_89_ <= anLocalInt_85_ || anLocalInt_88_ <= anLocalInt_85_); anLocalInt_89_ += anLocalInt_86_++ + anLocalInt_86_)
                    anLocalInt_88_ += anLocalInt_86_ + anLocalInt_86_;
                int anLocalInt_110_ = argument_77_ - anLocalInt_86_ + 1;
                if (anLocalInt_110_ < this.clipLeft)
                    anLocalInt_110_ = this.clipLeft;
                int anLocalInt_111_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_111_ > this.clipRight)
                    anLocalInt_111_ = this.clipRight;
                int anLocalInt_112_ = (anLocalInt_110_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_113_ = anLocalInt_110_; anLocalInt_113_ < anLocalInt_111_; anLocalInt_113_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_112_])) {
                        int anLocalInt_114_ = (this.pixels[anLocalInt_112_]);
                        int anLocalInt_115_ = argument_81_ + anLocalInt_114_;
                        int anLocalInt_116_ = ((argument_81_ & 0xff00ff) + (anLocalInt_114_ & 0xff00ff));
                        anLocalInt_114_ = ((anLocalInt_116_ & 0x1000100) + (anLocalInt_115_ - anLocalInt_116_ & 0x10000));
                        this.pixels[anLocalInt_112_] = (anLocalInt_115_ - anLocalInt_114_ | anLocalInt_114_ - (anLocalInt_114_ >>> 8));
                    }
                    anLocalInt_112_++;
                }
                anLocalInt_84_++;
                anLocalInt_88_ -= anLocalInt_87_-- + anLocalInt_87_;
                anLocalInt_89_ -= anLocalInt_87_ + anLocalInt_87_;
            }
            anLocalInt_86_ = argument_80_;
            anLocalInt_87_ = -anLocalInt_87_;
            anLocalInt_89_ = anLocalInt_87_ * anLocalInt_87_ + anLocalInt_85_;
            anLocalInt_88_ = anLocalInt_89_ - anLocalInt_86_;
            anLocalInt_89_ -= anLocalInt_87_;
            while (anLocalInt_84_ < anLocalInt_83_) {
                for (/**/; (anLocalInt_89_ > anLocalInt_85_ && anLocalInt_88_ > anLocalInt_85_); anLocalInt_88_ -= anLocalInt_86_ + anLocalInt_86_)
                    anLocalInt_89_ -= anLocalInt_86_-- + anLocalInt_86_;
                int anLocalInt_117_ = argument_77_ - anLocalInt_86_;
                if (anLocalInt_117_ < this.clipLeft)
                    anLocalInt_117_ = this.clipLeft;
                int anLocalInt_118_ = argument_77_ + anLocalInt_86_;
                if (anLocalInt_118_ > this.clipRight - 1)
                    anLocalInt_118_ = this.clipRight - 1;
                int anLocalInt_119_ = (anLocalInt_117_ + anLocalInt_84_ * this.width);
                for (int anLocalInt_120_ = anLocalInt_117_; anLocalInt_120_ <= anLocalInt_118_; anLocalInt_120_++) {
                    if ((float) argument_79_ < (this.aFloatArray4667[anLocalInt_119_])) {
                        int anLocalInt_121_ = (this.pixels[anLocalInt_119_]);
                        int anLocalInt_122_ = argument_81_ + anLocalInt_121_;
                        int anLocalInt_123_ = ((argument_81_ & 0xff00ff) + (anLocalInt_121_ & 0xff00ff));
                        anLocalInt_121_ = ((anLocalInt_123_ & 0x1000100) + (anLocalInt_122_ - anLocalInt_123_ & 0x10000));
                        this.pixels[anLocalInt_119_] = (anLocalInt_122_ - anLocalInt_121_ | anLocalInt_121_ - (anLocalInt_121_ >>> 8));
                    }
                    anLocalInt_119_++;
                }
                anLocalInt_84_++;
                anLocalInt_89_ += anLocalInt_87_ + anLocalInt_87_;
                anLocalInt_88_ += anLocalInt_87_++ + anLocalInt_87_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final void drawImage(int argument_124_, int argument_125_, int argument_126_, int argument_127_, int argument_128_, int argument_129_, byte[] argument_130_, int argument_131_, int argument_132_) {
        if (argument_126_ > 0 && argument_127_ > 0) {
            int anLocalInt = 0;
            int anLocalInt_133_ = 0;
            int anLocalInt_134_ = (argument_131_ << 16) / argument_126_;
            int anLocalInt_135_ = (argument_130_.length / argument_131_ << 16) / argument_127_;
            int anLocalInt_136_ = (argument_124_ + argument_125_ * this.width);
            int anLocalInt_137_ = this.width - argument_126_;
            if (argument_125_ + argument_127_ > this.clipBottom)
                argument_127_ -= (argument_125_ + argument_127_ - this.clipBottom);
            if (argument_125_ < this.clipTop) {
                int anLocalInt_138_ = this.clipTop - argument_125_;
                argument_127_ -= anLocalInt_138_;
                anLocalInt_136_ += anLocalInt_138_ * this.width;
                anLocalInt_133_ += anLocalInt_135_ * anLocalInt_138_;
            }
            if (argument_124_ + argument_126_ > this.clipRight) {
                int anLocalInt_139_ = (argument_124_ + argument_126_ - this.clipRight);
                argument_126_ -= anLocalInt_139_;
                anLocalInt_137_ += anLocalInt_139_;
            }
            if (argument_124_ < this.clipLeft) {
                int anLocalInt_140_ = this.clipLeft - argument_124_;
                argument_126_ -= anLocalInt_140_;
                anLocalInt_136_ += anLocalInt_140_;
                anLocalInt += anLocalInt_134_ * anLocalInt_140_;
                anLocalInt_137_ += anLocalInt_140_;
            }
            int anLocalInt_141_ = argument_128_ >>> 24;
            int anLocalInt_142_ = argument_129_ >>> 24;
            if (argument_132_ == 0 || (argument_132_ == 1 && anLocalInt_141_ == 255 && anLocalInt_142_ == 255)) {
                int anLocalInt_143_ = anLocalInt;
                for (int anLocalInt_144_ = -argument_127_; anLocalInt_144_ < 0; anLocalInt_144_++) {
                    int anLocalInt_145_ = (anLocalInt_133_ >> 16) * argument_131_;
                    for (int anLocalInt_146_ = -argument_126_; anLocalInt_146_ < 0; anLocalInt_146_++) {
                        if (argument_130_[(anLocalInt >> 16) + anLocalInt_145_] != 0)
                            this.pixels[anLocalInt_136_++] = argument_129_;
                        else
                            this.pixels[anLocalInt_136_++] = argument_128_;
                        anLocalInt += anLocalInt_134_;
                    }
                    anLocalInt_133_ += anLocalInt_135_;
                    anLocalInt = anLocalInt_143_;
                    anLocalInt_136_ += anLocalInt_137_;
                }
            } else if (argument_132_ == 1) {
                int anLocalInt_147_ = anLocalInt;
                for (int anLocalInt_148_ = -argument_127_; anLocalInt_148_ < 0; anLocalInt_148_++) {
                    int anLocalInt_149_ = (anLocalInt_133_ >> 16) * argument_131_;
                    for (int anLocalInt_150_ = -argument_126_; anLocalInt_150_ < 0; anLocalInt_150_++) {
                        int anLocalInt_151_ = argument_128_;
                        if (argument_130_[(anLocalInt >> 16) + anLocalInt_149_] != 0)
                            anLocalInt_151_ = argument_129_;
                        int anLocalInt_152_ = anLocalInt_151_ >>> 24;
                        int anLocalInt_153_ = 255 - anLocalInt_152_;
                        int anLocalInt_154_ = (this.pixels[anLocalInt_136_]);
                        this.pixels[anLocalInt_136_++] = ((((anLocalInt_151_ & 0xff00ff) * anLocalInt_152_ + ((anLocalInt_154_ & 0xff00ff) * anLocalInt_153_)) & ~0xff00ff) + (((anLocalInt_151_ & 0xff00) * anLocalInt_152_ + ((anLocalInt_154_ & 0xff00) * anLocalInt_153_)) & 0xff0000)) >> 8;
                        anLocalInt += anLocalInt_134_;
                    }
                    anLocalInt_133_ += anLocalInt_135_;
                    anLocalInt = anLocalInt_147_;
                    anLocalInt_136_ += anLocalInt_137_;
                }
            } else if (argument_132_ == 2) {
                int anLocalInt_155_ = anLocalInt;
                for (int anLocalInt_156_ = -argument_127_; anLocalInt_156_ < 0; anLocalInt_156_++) {
                    int anLocalInt_157_ = (anLocalInt_133_ >> 16) * argument_131_;
                    for (int anLocalInt_158_ = -argument_126_; anLocalInt_158_ < 0; anLocalInt_158_++) {
                        int anLocalInt_159_ = argument_128_;
                        if (argument_130_[(anLocalInt >> 16) + anLocalInt_157_] != 0)
                            anLocalInt_159_ = argument_129_;
                        if (anLocalInt_159_ != 0) {
                            int anLocalInt_160_ = (this.pixels[anLocalInt_136_]);
                            int anLocalInt_161_ = anLocalInt_159_ + anLocalInt_160_;
                            int anLocalInt_162_ = ((anLocalInt_159_ & 0xff00ff) + (anLocalInt_160_ & 0xff00ff));
                            anLocalInt_160_ = ((anLocalInt_162_ & 0x1000100) + (anLocalInt_161_ - anLocalInt_162_ & 0x10000));
                            this.pixels[anLocalInt_136_++] = (anLocalInt_161_ - anLocalInt_160_ | anLocalInt_160_ - (anLocalInt_160_ >>> 8));
                        } else
                            anLocalInt_136_++;
                        anLocalInt += anLocalInt_134_;
                    }
                    anLocalInt_133_ += anLocalInt_135_;
                    anLocalInt = anLocalInt_155_;
                    anLocalInt_136_ += anLocalInt_137_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final boolean method2075() {
        return true;
    }

    final Class350 method2029() {
        return new Class350_Sub1();
    }

    final void A(int argument_163_, Class_aa argument_164_, int argument_165_, int argument_166_) {
        Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_164_;
        int[] anLocalInts = class_aa_sub3.anIntArray3757;
        int[] anLocalInts_167_ = class_aa_sub3.anIntArray3755;
        int anLocalInt;
        if (this.clipBottom < argument_166_ + anLocalInts.length)
            anLocalInt = this.clipBottom - argument_166_;
        else
            anLocalInt = anLocalInts.length;
        int anLocalInt_168_;
        if (this.clipTop > argument_166_) {
            anLocalInt_168_ = this.clipTop - argument_166_;
            argument_166_ = this.clipTop;
        } else
            anLocalInt_168_ = 0;
        if (anLocalInt - anLocalInt_168_ > 0) {
            int anLocalInt_169_ = argument_166_ * this.width;
            for (int anLocalInt_170_ = anLocalInt_168_; anLocalInt_170_ < anLocalInt; anLocalInt_170_++) {
                int anLocalInt_171_ = argument_165_ + anLocalInts[anLocalInt_170_];
                int anLocalInt_172_ = anLocalInts_167_[anLocalInt_170_];
                if (this.clipLeft > anLocalInt_171_) {
                    anLocalInt_172_ -= this.clipLeft - anLocalInt_171_;
                    anLocalInt_171_ = this.clipLeft;
                }
                if (this.clipRight < anLocalInt_171_ + anLocalInt_172_)
                    anLocalInt_172_ = this.clipRight - anLocalInt_171_;
                anLocalInt_171_ += anLocalInt_169_;
                for (int anLocalInt_173_ = -anLocalInt_172_; anLocalInt_173_ < 0; anLocalInt_173_++)
                    this.pixels[anLocalInt_171_++] = argument_163_;
                anLocalInt_169_ += this.width;
            }
        }
    }

    final void pa() {
        for (int anLocalInt = 0; anLocalInt < aClass293Array4658.length; anLocalInt++) {
            aClass293Array4658[anLocalInt].anInt2408 = aClass293Array4658[anLocalInt].anInt2406;
            aClass293Array4658[anLocalInt].aBoolean2412 = false;
        }
    }

    private final void method2102(DoublyLinkedNodeP2_Sub4_Sub1 argument_174_, int argument_175_, int argument_176_, int argument_177_, int argument_178_) {
        int anLocalInt = argument_174_.anInt6438;
        int anLocalInt_179_ = argument_178_;
        argument_178_ <<= 1;
        if (anLocalInt == -1)
            method2101(argument_175_, argument_176_, argument_177_, anLocalInt_179_, argument_174_.anInt6439, 1);
        else {
            if (anInt4671 != anLocalInt) {
                Class368 class368 = ((Class368) aClass149_4636.get((long) anLocalInt));
                if (class368 == null) {
                    int[] anLocalInts = method2108(anLocalInt);
                    if (anLocalInts != null) {
                        int anLocalInt_180_ = (method2111(anLocalInt) ? 64 : this.anInt4655);
                        class368 = this.method2047(anLocalInt_180_, anLocalInts, 0, anLocalInt_180_, anLocalInt_180_);
                        aClass149_4636.put(class368, (long) anLocalInt);
                    } else
                        return;
                }
                anInt4671 = anLocalInt;
                aClass368_4670 = class368;
            }
            argument_178_++;
            ((Class368_Sub2) aClass368_4670).method4032(argument_175_ - anLocalInt_179_, argument_176_ - anLocalInt_179_, argument_177_, argument_178_, argument_178_, 0, argument_174_.anInt6439, 1, 1);
        }
    }

    final int andPow(int argument_181_, int argument_182_) {
        argument_181_ |= 0x20800;
        return argument_181_ & argument_182_ ^ argument_182_;
    }

    final void ra(int argument_183_, int argument_184_, int argument_185_, int argument_186_) {
        for (int anLocalInt = 0; anLocalInt < aClass293Array4658.length; anLocalInt++) {
            aClass293Array4658[anLocalInt].anInt2406 = aClass293Array4658[anLocalInt].anInt2408;
            aClass293Array4658[anLocalInt].anInt2413 = argument_183_;
            aClass293Array4658[anLocalInt].anInt2408 = argument_184_;
            aClass293Array4658[anLocalInt].anInt2407 = argument_185_;
            aClass293Array4658[anLocalInt].aBoolean2412 = true;
        }
    }

    final void H(int argument_187_, int argument_188_, int argument_189_, int[] argument_190_) {
        float f = ((this.aClass350_Sub1_4648.aFloat5427) + ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_187_ + (this.aClass350_Sub1_4648.aFloat5422 * (float) argument_188_) + (this.aClass350_Sub1_4648.aFloat5419 * (float) argument_189_)));
        if (f == 0.0F)
            argument_190_[0] = argument_190_[1] = argument_190_[2] = -1;
        else {
            int anLocalInt = (int) ((float) this.anInt4653 * (this.aClass350_Sub1_4648.aFloat5426 + ((this.aClass350_Sub1_4648.aFloat5421) * (float) argument_187_ + (this.aClass350_Sub1_4648.aFloat5425) * (float) argument_188_ + (this.aClass350_Sub1_4648.aFloat5428) * (float) argument_189_)) / f);
            int anLocalInt_191_ = (int) ((float) this.anInt4645 * (this.aClass350_Sub1_4648.aFloat5424 + ((this.aClass350_Sub1_4648.aFloat5420) * (float) argument_187_ + (this.aClass350_Sub1_4648.aFloat5430) * (float) argument_188_ + (this.aClass350_Sub1_4648.aFloat5429) * (float) argument_189_)) / f);
            argument_190_[0] = anLocalInt - this.anInt4635;
            argument_190_[1] = anLocalInt_191_ - this.anInt4633;
            argument_190_[2] = (int) f;
        }
    }

    final void T(int argument_192_, int argument_193_, int argument_194_, int argument_195_) {
        if (this.clipLeft < argument_192_)
            this.clipLeft = argument_192_;
        if (this.clipTop < argument_193_)
            this.clipTop = argument_193_;
        if (this.clipRight > argument_194_)
            this.clipRight = argument_194_;
        if (this.clipBottom > argument_195_)
            this.clipBottom = argument_195_;
        method2106();
    }

    final void method2080(boolean argument_196_) {
        /* empty */
    }

    final void removeCanvas(Canvas argument_197_) {
        if (currentCanvas == argument_197_)
            method2018(null);
        Rs2DPainter class59_sub22 = ((Rs2DPainter) painterMap.get((long) argument_197_.hashCode()));
        if (class59_sub22 != null)
            class59_sub22.unlink();
    }

    final void method2048() {
        /* empty */
    }

    final void clearDepthBuffer() {
        if (this.clipLeft == 0 && (this.clipRight == this.width) && this.clipTop == 0 && this.clipBottom == height) {
            int anLocalInt = this.aFloatArray4667.length;
            int anLocalInt_198_ = anLocalInt - (anLocalInt & 0x7);
            int anLocalInt_199_ = 0;
            while (anLocalInt_199_ < anLocalInt_198_) {
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
            }
            while (anLocalInt_199_ < anLocalInt)
                this.aFloatArray4667[anLocalInt_199_++] = 2.14748365E9F;
        } else {
            int anLocalInt = (this.clipRight - this.clipLeft);
            int anLocalInt_200_ = (this.clipBottom - this.clipTop);
            int anLocalInt_201_ = this.width - anLocalInt;
            int anLocalInt_202_ = (this.clipLeft + (this.clipTop * this.width));
            int anLocalInt_203_ = anLocalInt >> 3;
            int anLocalInt_204_ = anLocalInt & 0x7;
            anLocalInt = anLocalInt_202_ - 1;
            for (int anLocalInt_205_ = -anLocalInt_200_; anLocalInt_205_ < 0; anLocalInt_205_++) {
                if (anLocalInt_203_ > 0) {
                    int anLocalInt_206_ = anLocalInt_203_;
                    do {
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                    } while (--anLocalInt_206_ > 0);
                }
                if (anLocalInt_204_ > 0) {
                    int anLocalInt_207_ = anLocalInt_204_;
                    do
                        this.aFloatArray4667[++anLocalInt] = 2.14748365E9F;
                    while (--anLocalInt_207_ > 0);
                }
                anLocalInt += anLocalInt_201_;
            }
        }
    }

    final int method2103(int argument_208_) {
        return (this.textureSource.getDescriptor(argument_208_, true).aShort831 & 0xffff);
    }

    final void method2067(Class72 argument_209_) {
        Class293 class293 = method2112(Thread.currentThread());
        DoublyLinkedNodeP2_Sub4 class104_sub4 = (argument_209_.aClass119_497.aClass104_Sub4_971);
        for (DoublyLinkedNodeP2_Sub4 class104_sub4_210_ = class104_sub4.aClass104_Sub4_4526; class104_sub4_210_ != class104_sub4; class104_sub4_210_ = class104_sub4_210_.aClass104_Sub4_4526) {
            DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1 = (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_210_;
            int anLocalInt = class104_sub4_sub1.anInt6435 >> 12;
            int anLocalInt_211_ = class104_sub4_sub1.anInt6430 >> 12;
            int anLocalInt_212_ = class104_sub4_sub1.anInt6432 >> 12;
            float f = (this.aClass350_Sub1_4648.aFloat5427 + ((this.aClass350_Sub1_4648.aFloat5418 * (float) anLocalInt) + (this.aClass350_Sub1_4648.aFloat5422) * (float) anLocalInt_211_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) anLocalInt_212_));
            if (!(f < (float) this.anInt4643) && !(f > (float) class293.anInt2405)) {
                int anLocalInt_213_ = (this.anInt4668 + (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5426) + ((this.aClass350_Sub1_4648.aFloat5421) * (float) anLocalInt + (this.aClass350_Sub1_4648.aFloat5425 * (float) anLocalInt_211_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) anLocalInt_212_))) / f));
                int anLocalInt_214_ = (this.anInt4642 + (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5424) + ((this.aClass350_Sub1_4648.aFloat5420) * (float) anLocalInt + (this.aClass350_Sub1_4648.aFloat5430 * (float) anLocalInt_211_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) anLocalInt_212_))) / f));
                if (anLocalInt_213_ >= this.clipLeft && anLocalInt_213_ <= this.clipRight && anLocalInt_214_ >= this.clipTop && anLocalInt_214_ <= this.clipBottom) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method2102(class104_sub4_sub1, anLocalInt_213_, anLocalInt_214_, (int) f, (int) ((float) ((class104_sub4_sub1.anInt6431 * (this.anInt4653)) >> 12) / f));
                }
            }
        }
    }

    final int getMemoryUsage() {
        return 0;
    }

    final boolean method2092() {
        return false;
    }

    final void processDeletions(int argument_215_) {
        int anLocalInt = argument_215_ - anInt4625;
        for (Object object = aClass149_4660.method2542(false); object != null; object = aClass149_4660.method2531(-73)) {
            Node_Sub41 class59_sub41 = (Node_Sub41) object;
            if (class59_sub41.aBoolean4201) {
                class59_sub41.anInt4202 += anLocalInt;
                int anLocalInt_216_ = class59_sub41.anInt4202 / 20;
                if (anLocalInt_216_ > 0) {
                    TextureDescriptor textureDescriptor = (this.textureSource.getDescriptor(class59_sub41.anInt4200, true));
                    class59_sub41.method1077((textureDescriptor.aByte845 * anLocalInt * 50 / 1000), (textureDescriptor.aByte849 * anLocalInt * 50 / 1000));
                    class59_sub41.anInt4202 -= anLocalInt_216_ * 20;
                }
                class59_sub41.aBoolean4201 = false;
            }
        }
        anInt4625 = argument_215_;
        aClass149_4636.method2534(5, (byte) -8);
        aClass149_4660.method2534(5, (byte) -8);
    }

    final ToolkitInfo getDescriptor() {
        return new ToolkitInfo(0, "Pure Java", 1, "CPU", 0L);
    }

    final Skybox method2045(Skybox argument_217_, Skybox argument_218_, float argument_219_, Skybox argument_220_) {
        return null;
    }

    final boolean method2104(int argument_221_) {
        if (!this.textureSource.getDescriptor(argument_221_, true).aBoolean848 && !this.textureSource.getDescriptor(argument_221_, true).aBoolean841)
            return false;
        return true;
    }

    final void method2051() {
        /* empty */
    }

    private final void method2105(int argument_222_, int argument_223_, int argument_224_, int argument_225_, int argument_226_, int argument_227_, int argument_228_, int argument_229_) {
        if (argument_222_ >= this.clipLeft && argument_222_ < this.clipRight) {
            int anLocalInt = (argument_222_ + argument_223_ * this.width);
            int anLocalInt_230_ = argument_225_ >>> 24;
            int anLocalInt_231_ = argument_227_ + argument_228_;
            int anLocalInt_232_ = argument_229_ % anLocalInt_231_;
            if (argument_226_ == 0 || argument_226_ == 1 && anLocalInt_230_ == 255) {
                int anLocalInt_233_ = 0;
                while (anLocalInt_233_ < argument_224_) {
                    if ((argument_223_ + anLocalInt_233_ >= this.clipTop) && (argument_223_ + anLocalInt_233_ < this.clipBottom) && anLocalInt_232_ < argument_227_)
                        this.pixels[anLocalInt + (anLocalInt_233_ * this.width)] = argument_225_;
                    anLocalInt_233_++;
                    anLocalInt_232_ = ++anLocalInt_232_ % anLocalInt_231_;
                }
            } else if (argument_226_ == 1) {
                argument_225_ = (((argument_225_ & 0xff00ff) * anLocalInt_230_ >> 8 & 0xff00ff) + ((argument_225_ & 0xff00) * anLocalInt_230_ >> 8 & 0xff00) + (anLocalInt_230_ << 24));
                int anLocalInt_234_ = 256 - anLocalInt_230_;
                int anLocalInt_235_ = 0;
                while (anLocalInt_235_ < argument_224_) {
                    if ((argument_223_ + anLocalInt_235_ >= this.clipTop) && (argument_223_ + anLocalInt_235_ < this.clipBottom) && anLocalInt_232_ < argument_227_) {
                        int anLocalInt_236_ = (anLocalInt + (anLocalInt_235_ * this.width));
                        int anLocalInt_237_ = (this.pixels[anLocalInt_236_]);
                        anLocalInt_237_ = ((((anLocalInt_237_ & 0xff00ff) * anLocalInt_234_ >> 8) & 0xff00ff) + (((anLocalInt_237_ & 0xff00) * anLocalInt_234_ >> 8) & 0xff00));
                        this.pixels[anLocalInt_236_] = argument_225_ + anLocalInt_237_;
                    }
                    anLocalInt_235_++;
                    anLocalInt_232_ = ++anLocalInt_232_ % anLocalInt_231_;
                }
            } else if (argument_226_ == 2) {
                int anLocalInt_238_ = 0;
                while (anLocalInt_238_ < argument_224_) {
                    if ((argument_223_ + anLocalInt_238_ >= this.clipTop) && (argument_223_ + anLocalInt_238_ < this.clipBottom) && anLocalInt_232_ < argument_227_) {
                        int anLocalInt_239_ = (anLocalInt + (anLocalInt_238_ * this.width));
                        int anLocalInt_240_ = (this.pixels[anLocalInt_239_]);
                        int anLocalInt_241_ = argument_225_ + anLocalInt_240_;
                        int anLocalInt_242_ = ((argument_225_ & 0xff00ff) + (anLocalInt_240_ & 0xff00ff));
                        anLocalInt_240_ = ((anLocalInt_242_ & 0x1000100) + (anLocalInt_241_ - anLocalInt_242_ & 0x10000));
                        this.pixels[anLocalInt_239_] = (anLocalInt_241_ - anLocalInt_240_ | anLocalInt_240_ - (anLocalInt_240_ >>> 8));
                    }
                    anLocalInt_238_++;
                    anLocalInt_232_ = ++anLocalInt_232_ % anLocalInt_231_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method2087(Interface15 argument_243_) {
        Class364 class364 = (Class364) argument_243_;
        this.width = class364.anInt3650;
        height = class364.anInt3648;
        this.pixels = class364.anIntArray3652;
        aClass364_4669 = class364;
        anInt4640 = class364.anInt3650;
        anInt4650 = class364.anInt3648;
        this.aFloatArray4667 = class364.aFloatArray3646;
        method2099();
    }

    final void swapBuffers(int argument_244_, int argument_245_) throws Exception_Sub1 {
        if (currentCanvas == null || this.currentPainter == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = currentCanvas.getGraphics();
            this.currentPainter.draw(0, 0, anInt4629, anInt4623, argument_244_, argument_245_, graphics);
        } catch (Exception exception) {
            currentCanvas.repaint();
        }
    }

    final boolean method2038() {
        return false;
    }

    final void da(int argument_246_, int argument_247_, int argument_248_, int[] argument_249_) {
        float f = ((this.aClass350_Sub1_4648.aFloat5427) + ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_246_ + (this.aClass350_Sub1_4648.aFloat5422 * (float) argument_247_) + (this.aClass350_Sub1_4648.aFloat5419 * (float) argument_248_)));
        if (f < (float) this.anInt4643 || f > (float) this.anInt4641)
            argument_249_[0] = argument_249_[1] = argument_249_[2] = -1;
        else {
            int anLocalInt = (int) ((float) this.anInt4653 * (this.aClass350_Sub1_4648.aFloat5426 + ((this.aClass350_Sub1_4648.aFloat5421) * (float) argument_246_ + (this.aClass350_Sub1_4648.aFloat5425) * (float) argument_247_ + (this.aClass350_Sub1_4648.aFloat5428) * (float) argument_248_)) / f);
            int anLocalInt_250_ = (int) ((float) this.anInt4645 * (this.aClass350_Sub1_4648.aFloat5424 + ((this.aClass350_Sub1_4648.aFloat5420) * (float) argument_246_ + (this.aClass350_Sub1_4648.aFloat5430) * (float) argument_247_ + (this.aClass350_Sub1_4648.aFloat5429) * (float) argument_248_)) / f);
            if (anLocalInt >= this.anInt4635 && anLocalInt <= this.anInt4638 && anLocalInt_250_ >= this.anInt4633 && anLocalInt_250_ <= this.anInt4652) {
                argument_249_[0] = anLocalInt - this.anInt4635;
                argument_249_[1] = anLocalInt_250_ - this.anInt4633;
                argument_249_[2] = (int) f;
            } else
                argument_249_[0] = argument_249_[1] = argument_249_[2] = -1;
        }
    }

    final void method2030(Skybox argument_251_) {
        /* empty */
    }

    private final void method2106() {
        this.anInt4635 = (this.clipLeft - this.anInt4668);
        this.anInt4638 = (this.clipRight - this.anInt4668);
        this.anInt4633 = (this.clipTop - this.anInt4642);
        this.anInt4652 = (this.clipBottom - this.anInt4642);
        for (int anLocalInt = 0; anLocalInt < this.anInt4659; anLocalInt++) {
            Class89 class89 = aClass293Array4658[anLocalInt].aClass89_2448;
            class89.anInt655 = (this.anInt4668 - this.clipLeft);
            class89.anInt648 = (this.anInt4642 - this.clipTop);
            class89.anInt650 = (this.clipRight - this.clipLeft);
            class89.anInt653 = (this.clipBottom - this.clipTop);
        }
        int anLocalInt = ((this.clipTop * this.width) + this.clipLeft);
        for (int anLocalInt_252_ = this.clipTop; anLocalInt_252_ < this.clipBottom; anLocalInt_252_++) {
            for (int anLocalInt_253_ = 0; anLocalInt_253_ < this.anInt4659; anLocalInt_253_++)
                aClass293Array4658[anLocalInt_253_].aClass89_2448.anIntArray658[anLocalInt_252_ - this.clipTop] = anLocalInt;
            anLocalInt += this.width;
        }
    }

    final Interface17 method2077(int argument_254_, int argument_255_) {
        return new Class159(argument_254_, argument_255_);
    }

    final void setAmbientIntensity(float argument_256_) {
        this.anInt4634 = (int) (argument_256_ * 65535.0F);
    }

    final void assignThread(int argument_257_) {
        aClass293Array4658[argument_257_].method3501(Thread.currentThread(), -45);
    }

    final Interface21 method2070(int argument_258_, int argument_259_) {
        return method2055(argument_258_, argument_259_, false);
    }

    private JavaToolkit(TextureSource argument_260_) {
        super(argument_260_);
        nullified = false;
        painterMap = new JagexHashMap(4);
        this.anInt4643 = 50;
        this.anInt4645 = 512;
        this.anInt4651 = 78642;
        aBoolean4639 = false;
        this.clipLeft = 0;
        this.clipBottom = 0;
        this.anInt4653 = 512;
        this.anInt4634 = 75518;
        this.clipRight = 0;
        this.anInt4641 = 3500;
        anInt4663 = 0;
        this.anInt4655 = 128;
        anInt4664 = 0;
        this.anInt4665 = 45823;
        this.clipTop = 0;
        aClass149_4636 = new Class149(16);
        anInt4671 = -1;
        try {
            aClass149_4660 = new Class149(256);
            this.aClass350_Sub1_4648 = new Class350_Sub1();
            method2089(1);
            assignThread(0);
            Node_Sub47_Sub1.method1116(true, true, true);
            aBoolean4628 = true;
            anInt4625 = (int) Applet_Sub1.getGameTime();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method2027((byte) 23);
            throw new RuntimeException("");
        }
    }

    final int I() {
        int anLocalInt = anInt4664;
        anInt4664 = 0;
        return anLocalInt;
    }

    final int[] method2107(int argument_261_) {
        Node_Sub41 class59_sub41;
        synchronized (aClass149_4660) {
            class59_sub41 = ((Node_Sub41) aClass149_4660.get((long) argument_261_));
            if (class59_sub41 == null) {
                if (!this.textureSource.method9(true, argument_261_))
                    return null;
                TextureDescriptor textureDescriptor = this.textureSource.getDescriptor(argument_261_, true);
                int anLocalInt = (textureDescriptor.isHalfSize || aBoolean4639 ? 64 : this.anInt4655);
                class59_sub41 = new Node_Sub41(argument_261_, anLocalInt, (this.textureSource.method13(anLocalInt, true, anLocalInt, 0.7F, argument_261_, (byte) -122)), textureDescriptor.anInt830 != 1);
                aClass149_4660.put(class59_sub41, (long) argument_261_);
            }
        }
        class59_sub41.aBoolean4201 = true;
        return class59_sub41.method1076();
    }

    final boolean method2081() {
        return false;
    }

    final AbstractFont method2083(Class76 argument_262_, Class83[] argument_263_, boolean argument_264_) {
        int[] anLocalInts = new int[argument_263_.length];
        int[] anLocalInts_265_ = new int[argument_263_.length];
        boolean anLocalBoolean = false;
        for (int anLocalInt = 0; anLocalInt < argument_263_.length; anLocalInt++) {
            anLocalInts[anLocalInt] = argument_263_[anLocalInt].anInt590;
            anLocalInts_265_[anLocalInt] = argument_263_[anLocalInt].anInt587;
            if (argument_263_[anLocalInt].aByteArray592 != null)
                anLocalBoolean = true;
        }
        if (argument_264_) {
            if (anLocalBoolean)
                return new AbstractFont_Sub2(this, argument_262_, argument_263_, anLocalInts, anLocalInts_265_);
            return new AbstractFont_Sub5(this, argument_262_, argument_263_, anLocalInts, anLocalInts_265_);
        }
        if (anLocalBoolean)
            throw new IllegalArgumentException("");
        return new JavaFont(this, argument_262_, argument_263_, anLocalInts, anLocalInts_265_);
    }

    final void fillRect(int x, int y, int argument_268_, int argument_269_, int argument_270_, int argument_271_) {
        if (x < this.clipLeft) {
            argument_268_ -= this.clipLeft - x;
            x = this.clipLeft;
        }
        if (y < this.clipTop) {
            argument_269_ -= this.clipTop - y;
            y = this.clipTop;
        }
        if (x + argument_268_ > this.clipRight)
            argument_268_ = this.clipRight - x;
        if (y + argument_269_ > this.clipBottom)
            argument_269_ = this.clipBottom - y;
        if (argument_268_ > 0 && argument_269_ > 0 && x <= this.clipRight && y <= this.clipBottom) {
            int anLocalInt = this.width - argument_268_;
            int anLocalInt_272_ = (x + y * this.width);
            int anLocalInt_273_ = argument_270_ >>> 24;
            if (argument_271_ == 0 || argument_271_ == 1 && anLocalInt_273_ == 255) {
                int anLocalInt_274_ = argument_268_ >> 3;
                int anLocalInt_275_ = argument_268_ & 0x7;
                argument_268_ = anLocalInt_272_ - 1;
                for (int anLocalInt_276_ = -argument_269_; anLocalInt_276_ < 0; anLocalInt_276_++) {
                    if (anLocalInt_274_ > 0) {
                        x = anLocalInt_274_;
                        do {
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                            this.pixels[++argument_268_] = argument_270_;
                        } while (--x > 0);
                    }
                    if (anLocalInt_275_ > 0) {
                        x = anLocalInt_275_;
                        do
                            this.pixels[++argument_268_] = argument_270_;
                        while (--x > 0);
                    }
                    argument_268_ += anLocalInt;
                }
            } else if (argument_271_ == 1) {
                argument_270_ = (((argument_270_ & 0xff00ff) * anLocalInt_273_ >> 8 & 0xff00ff) + (((argument_270_ & ~0xff00ff) >>> 8) * anLocalInt_273_ & ~0xff00ff));
                int anLocalInt_277_ = 256 - anLocalInt_273_;
                for (int anLocalInt_278_ = 0; anLocalInt_278_ < argument_269_; anLocalInt_278_++) {
                    for (int anLocalInt_279_ = -argument_268_; anLocalInt_279_ < 0; anLocalInt_279_++) {
                        int anLocalInt_280_ = (this.pixels[anLocalInt_272_]);
                        anLocalInt_280_ = ((((anLocalInt_280_ & 0xff00ff) * anLocalInt_277_ >> 8) & 0xff00ff) + ((((anLocalInt_280_ & ~0xff00ff) >>> 8) * anLocalInt_277_) & ~0xff00ff));
                        this.pixels[anLocalInt_272_++] = argument_270_ + anLocalInt_280_;
                    }
                    anLocalInt_272_ += anLocalInt;
                }
            } else if (argument_271_ == 2) {
                for (int anLocalInt_281_ = 0; anLocalInt_281_ < argument_269_; anLocalInt_281_++) {
                    for (int anLocalInt_282_ = -argument_268_; anLocalInt_282_ < 0; anLocalInt_282_++) {
                        int anLocalInt_283_ = (this.pixels[anLocalInt_272_]);
                        int anLocalInt_284_ = argument_270_ + anLocalInt_283_;
                        int anLocalInt_285_ = ((argument_270_ & 0xff00ff) + (anLocalInt_283_ & 0xff00ff));
                        anLocalInt_283_ = ((anLocalInt_285_ & 0x1000100) + (anLocalInt_284_ - anLocalInt_285_ & 0x10000));
                        this.pixels[anLocalInt_272_++] = (anLocalInt_284_ - anLocalInt_283_ | anLocalInt_283_ - (anLocalInt_283_ >>> 8));
                    }
                    anLocalInt_272_ += anLocalInt;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void clearClip() {
        this.clipLeft = 0;
        this.clipTop = 0;
        this.clipRight = this.width;
        this.clipBottom = height;
        method2106();
    }

    final void getViewportSize(int[] argument_286_) {
        argument_286_[0] = this.width;
        argument_286_[1] = height;
    }

    final void setSun(int argument_287_, float argument_288_, float argument_289_, float argument_290_, float argument_291_, float argument_292_) {
        this.anInt4665 = (int) (argument_288_ * 65535.0F);
        this.anInt4651 = (int) (argument_289_ * 65535.0F);
        float f = (float) Math.sqrt((double) (argument_290_ * argument_290_ + argument_291_ * argument_291_ + argument_292_ * argument_292_));
        this.anInt4646 = (int) (argument_290_ * 65535.0F / f);
        this.anInt4632 = (int) (argument_291_ * 65535.0F / f);
        this.anInt4661 = (int) (argument_292_ * 65535.0F / f);
    }

    final int[] Y() {
        return new int[]{this.anInt4668, this.anInt4642, this.anInt4653, this.anInt4645};
    }

    final int JA(int argument_293_, int argument_294_, int argument_295_, int argument_296_, int argument_297_, int argument_298_) {
        int anLocalInt = 0;
        float f = ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_293_ + (this.aClass350_Sub1_4648.aFloat5422) * (float) argument_294_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) argument_295_ + (this.aClass350_Sub1_4648.aFloat5427));
        if (f < 1.0F)
            f = 1.0F;
        float f_299_ = ((this.aClass350_Sub1_4648.aFloat5418) * (float) argument_296_ + (this.aClass350_Sub1_4648.aFloat5422) * (float) argument_297_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) argument_298_ + (this.aClass350_Sub1_4648.aFloat5427));
        if (f_299_ < 1.0F)
            f_299_ = 1.0F;
        if (f < (float) this.anInt4643 && f_299_ < (float) this.anInt4643)
            anLocalInt |= 0x10;
        else if (f > (float) this.anInt4641 && f_299_ > (float) this.anInt4641)
            anLocalInt |= 0x20;
        int anLocalInt_300_ = (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5421 * (float) argument_293_) + (this.aClass350_Sub1_4648.aFloat5425 * (float) argument_294_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) argument_295_) + this.aClass350_Sub1_4648.aFloat5426) / f);
        int anLocalInt_301_ = (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5421 * (float) argument_296_) + (this.aClass350_Sub1_4648.aFloat5425 * (float) argument_297_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) argument_298_) + this.aClass350_Sub1_4648.aFloat5426) / f_299_);
        if (anLocalInt_300_ < this.anInt4635 && anLocalInt_301_ < this.anInt4635)
            anLocalInt |= 0x1;
        else if (anLocalInt_300_ > this.anInt4638 && anLocalInt_301_ > this.anInt4638)
            anLocalInt |= 0x2;
        int anLocalInt_302_ = (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5420 * (float) argument_293_) + (this.aClass350_Sub1_4648.aFloat5430 * (float) argument_294_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) argument_295_) + this.aClass350_Sub1_4648.aFloat5424) / f);
        int anLocalInt_303_ = (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5420 * (float) argument_296_) + (this.aClass350_Sub1_4648.aFloat5430 * (float) argument_297_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) argument_298_) + this.aClass350_Sub1_4648.aFloat5424) / f_299_);
        if (anLocalInt_302_ < this.anInt4633 && anLocalInt_303_ < this.anInt4633)
            anLocalInt |= 0x4;
        else if (anLocalInt_302_ > this.anInt4652 && anLocalInt_303_ > this.anInt4652)
            anLocalInt |= 0x8;
        return anLocalInt;
    }

    final int[] method2108(int argument_304_) {
        Node_Sub41 class59_sub41;
        synchronized (aClass149_4660) {
            class59_sub41 = ((Node_Sub41) aClass149_4660.get(((long) argument_304_ | ~0x7fffffffffffffffL)));
            if (class59_sub41 == null) {
                if (!this.textureSource.method9(true, argument_304_))
                    return null;
                TextureDescriptor textureDescriptor = this.textureSource.getDescriptor(argument_304_, true);
                int anLocalInt = (textureDescriptor.isHalfSize || aBoolean4639 ? 64 : this.anInt4655);
                class59_sub41 = new Node_Sub41(argument_304_, anLocalInt, (this.textureSource.method14(anLocalInt, argument_304_, -123, 0.7F, anLocalInt, true)), textureDescriptor.anInt830 != 1);
                aClass149_4660.put(class59_sub41, ((long) argument_304_ | ~0x7fffffffffffffffL));
            }
        }
        class59_sub41.aBoolean4201 = true;
        return class59_sub41.method1076();
    }

    final Class_s method2085(int argument_305_, int argument_306_, int[][] argument_307_, int[][] argument_308_, int argument_309_, int argument_310_, int argument_311_) {
        return new Class_s_Sub3(this, argument_310_, argument_311_, argument_305_, argument_306_, argument_307_, argument_308_, argument_309_);
    }

    final void clear(int clearColour) {
        fillRect(0, 0, this.width, height, clearColour, 0);
    }

    final void draw3DTriangle(int argument_313_, int argument_314_, int argument_315_, int argument_316_, int argument_317_, int argument_318_, int argument_319_, int argument_320_, int argument_321_, int argument_322_, int argument_323_, int argument_324_, int argument_325_) {
        Class293 class293 = method2112(Thread.currentThread());
        Class89 class89 = class293.aClass89_2448;
        class89.aBoolean647 = false;
        argument_313_ -= this.anInt4635;
        argument_316_ -= this.anInt4635;
        argument_319_ -= this.anInt4635;
        argument_314_ -= this.anInt4633;
        argument_317_ -= this.anInt4633;
        argument_320_ -= this.anInt4633;
        class89.aBoolean661 = (argument_313_ < 0 || argument_313_ > class89.anInt650 || argument_316_ < 0 || argument_316_ > class89.anInt650 || argument_319_ < 0 || argument_319_ > class89.anInt650);
        int anLocalInt = argument_322_ >>> 24;
        if (argument_325_ == 0 || argument_325_ == 1 && anLocalInt == 255) {
            class89.anInt646 = 0;
            class89.aBoolean659 = false;
            class89.method1656((float) argument_314_, (float) argument_317_, (float) argument_320_, (float) argument_313_, (float) argument_316_, (float) argument_319_, (float) argument_315_, (float) argument_318_, (float) argument_321_, argument_322_, argument_323_, argument_324_);
        } else if (argument_325_ == 1) {
            class89.anInt646 = 255 - anLocalInt;
            class89.aBoolean659 = false;
            class89.method1656((float) argument_314_, (float) argument_317_, (float) argument_320_, (float) argument_313_, (float) argument_316_, (float) argument_319_, (float) argument_315_, (float) argument_318_, (float) argument_321_, argument_322_, argument_323_, argument_324_);
        } else if (argument_325_ == 2) {
            class89.anInt646 = 128;
            class89.aBoolean659 = true;
            class89.method1656((float) argument_314_, (float) argument_317_, (float) argument_320_, (float) argument_313_, (float) argument_316_, (float) argument_319_, (float) argument_315_, (float) argument_318_, (float) argument_321_, argument_322_, argument_323_, argument_324_);
        } else
            throw new IllegalArgumentException();
        class89.aBoolean647 = true;
    }

    final void method2017(int argument_326_) {
        Class167_Sub1.anInt5055 = Class167_Sub1.anInt5060 = argument_326_;
        if (this.anInt4659 > 1)
            throw new IllegalStateException("No MT");
        method2089(this.anInt4659);
        assignThread(0);
    }

    final void b(int argument_327_, int argument_328_, int argument_329_, int argument_330_, double argument_331_) {
        int anLocalInt = anInt4640 - argument_329_;
        int anLocalInt_332_ = argument_328_ * anInt4640 + argument_327_;
        float[] fs = this.aFloatArray4667;
        int anLocalInt_333_ = 0;
        while (anLocalInt_333_ < argument_330_) {
            int anLocalInt_334_ = 0;
            while (anLocalInt_334_ < argument_329_) {
                float f = fs[anLocalInt_332_];
                if (f != 2.14748365E9F)
                    fs[anLocalInt_332_] = (float) ((double) f + argument_331_);
                anLocalInt_334_++;
                anLocalInt_332_++;
            }
            anLocalInt_333_++;
            anLocalInt_332_ += anLocalInt;
        }
    }

    final void method2014(dba_sub_772 argument_335_) {
        /* empty */
    }

    final void method2023() {
        if (aBoolean4628) {
            Class112.method2009(false, -11692, true);
            aBoolean4628 = false;
        }
        this.currentPainter = null;
        currentCanvas = null;
        anInt4629 = 0;
        anInt4623 = 0;
        painterMap = null;
        nullified = true;
    }

    final void C(boolean argument_336_) {
        Class293 class293 = method2112(Thread.currentThread());
        class293.aBoolean2415 = argument_336_;
    }

    final void method2089(int argument_337_) {
        this.anInt4659 = argument_337_;
        aClass293Array4658 = new Class293[this.anInt4659];
        for (int anLocalInt = 0; anLocalInt < this.anInt4659; anLocalInt++)
            aClass293Array4658[anLocalInt] = new Class293(this);
    }

    final void drawLine(int argument_338_, int argument_339_, int argument_340_, int argument_341_, int argument_342_, int argument_343_) {
        argument_340_ -= argument_338_;
        argument_341_ -= argument_339_;
        if (argument_341_ == 0) {
            if (argument_340_ >= 0)
                drawHLine(argument_338_, argument_339_, argument_340_ + 1, argument_342_, argument_343_);
            else
                drawHLine(argument_338_ + argument_340_, argument_339_, -argument_340_ + 1, argument_342_, argument_343_);
        } else if (argument_340_ == 0) {
            if (argument_341_ >= 0)
                drawVLine(argument_338_, argument_339_, argument_341_ + 1, argument_342_, argument_343_);
            else
                drawVLine(argument_338_, argument_339_ + argument_341_, -argument_341_ + 1, argument_342_, argument_343_);
        } else {
            if (argument_340_ + argument_341_ < 0) {
                argument_338_ += argument_340_;
                argument_340_ = -argument_340_;
                argument_339_ += argument_341_;
                argument_341_ = -argument_341_;
            }
            if (argument_340_ > argument_341_) {
                argument_339_ <<= 16;
                argument_339_ += 32768;
                argument_341_ <<= 16;
                int anLocalInt = (int) Math.floor(((double) argument_341_ / (double) argument_340_) + 0.5);
                argument_340_ += argument_338_;
                if (argument_338_ < this.clipLeft) {
                    argument_339_ += anLocalInt * (this.clipLeft - argument_338_);
                    argument_338_ = this.clipLeft;
                }
                if (argument_340_ >= this.clipRight)
                    argument_340_ = this.clipRight - 1;
                int anLocalInt_344_ = argument_342_ >>> 24;
                if (argument_343_ == 0 || argument_343_ == 1 && anLocalInt_344_ == 255) {
                    for (/**/; argument_338_ <= argument_340_; argument_338_++) {
                        int anLocalInt_345_ = argument_339_ >> 16;
                        if (anLocalInt_345_ >= this.clipTop && (anLocalInt_345_ < this.clipBottom))
                            this.pixels[(argument_338_ + (anLocalInt_345_ * this.width))] = argument_342_;
                        argument_339_ += anLocalInt;
                    }
                    return;
                }
                if (argument_343_ == 1) {
                    argument_342_ = (((argument_342_ & 0xff00ff) * anLocalInt_344_ >> 8 & 0xff00ff) + ((argument_342_ & 0xff00) * anLocalInt_344_ >> 8 & 0xff00) + (anLocalInt_344_ << 24));
                    int anLocalInt_346_ = 256 - anLocalInt_344_;
                    for (/**/; argument_338_ <= argument_340_; argument_338_++) {
                        int anLocalInt_347_ = argument_339_ >> 16;
                        if (anLocalInt_347_ >= this.clipTop && (anLocalInt_347_ < this.clipBottom)) {
                            int anLocalInt_348_ = (argument_338_ + (anLocalInt_347_ * this.width));
                            int anLocalInt_349_ = (this.pixels[anLocalInt_348_]);
                            anLocalInt_349_ = ((((anLocalInt_349_ & 0xff00ff) * anLocalInt_346_) >> 8 & 0xff00ff) + (((anLocalInt_349_ & 0xff00) * anLocalInt_346_) >> 8 & 0xff00));
                            this.pixels[anLocalInt_348_] = argument_342_ + anLocalInt_349_;
                        }
                        argument_339_ += anLocalInt;
                    }
                    return;
                }
                if (argument_343_ == 2) {
                    for (/**/; argument_338_ <= argument_340_; argument_338_++) {
                        int anLocalInt_350_ = argument_339_ >> 16;
                        if (anLocalInt_350_ >= this.clipTop && (anLocalInt_350_ < this.clipBottom)) {
                            int anLocalInt_351_ = (argument_338_ + (anLocalInt_350_ * this.width));
                            int anLocalInt_352_ = (this.pixels[anLocalInt_351_]);
                            int anLocalInt_353_ = argument_342_ + anLocalInt_352_;
                            int anLocalInt_354_ = ((argument_342_ & 0xff00ff) + (anLocalInt_352_ & 0xff00ff));
                            anLocalInt_352_ = ((anLocalInt_354_ & 0x1000100) + (anLocalInt_353_ - anLocalInt_354_ & 0x10000));
                            this.pixels[anLocalInt_351_] = (anLocalInt_353_ - anLocalInt_352_ | anLocalInt_352_ - (anLocalInt_352_ >>> 8));
                        }
                        argument_339_ += anLocalInt;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            argument_338_ <<= 16;
            argument_338_ += 32768;
            argument_340_ <<= 16;
            int anLocalInt = (int) Math.floor(((double) argument_340_ / (double) argument_341_) + 0.5);
            argument_341_ += argument_339_;
            if (argument_339_ < this.clipTop) {
                argument_338_ += anLocalInt * (this.clipTop - argument_339_);
                argument_339_ = this.clipTop;
            }
            if (argument_341_ >= this.clipBottom)
                argument_341_ = this.clipBottom - 1;
            int anLocalInt_355_ = argument_342_ >>> 24;
            if (argument_343_ == 0 || argument_343_ == 1 && anLocalInt_355_ == 255) {
                for (/**/; argument_339_ <= argument_341_; argument_339_++) {
                    int anLocalInt_356_ = argument_338_ >> 16;
                    if (anLocalInt_356_ >= this.clipLeft && anLocalInt_356_ < this.clipRight)
                        this.pixels[(anLocalInt_356_ + (argument_339_ * this.width))] = argument_342_;
                    argument_338_ += anLocalInt;
                }
            } else if (argument_343_ == 1) {
                argument_342_ = (((argument_342_ & 0xff00ff) * anLocalInt_355_ >> 8 & 0xff00ff) + ((argument_342_ & 0xff00) * anLocalInt_355_ >> 8 & 0xff00) + (anLocalInt_355_ << 24));
                int anLocalInt_357_ = 256 - anLocalInt_355_;
                for (/**/; argument_339_ <= argument_341_; argument_339_++) {
                    int anLocalInt_358_ = argument_338_ >> 16;
                    if (anLocalInt_358_ >= this.clipLeft && (anLocalInt_358_ < this.clipRight)) {
                        int anLocalInt_359_ = (anLocalInt_358_ + (argument_339_ * this.width));
                        int anLocalInt_360_ = (this.pixels[anLocalInt_359_]);
                        anLocalInt_360_ = ((((anLocalInt_360_ & 0xff00ff) * anLocalInt_357_ >> 8) & 0xff00ff) + (((anLocalInt_360_ & 0xff00) * anLocalInt_357_ >> 8) & 0xff00));
                        this.pixels[(anLocalInt_358_ + (argument_339_ * this.width))] = argument_342_ + anLocalInt_360_;
                    }
                    argument_338_ += anLocalInt;
                }
            } else if (argument_343_ == 2) {
                for (/**/; argument_339_ <= argument_341_; argument_339_++) {
                    int anLocalInt_361_ = argument_338_ >> 16;
                    if (anLocalInt_361_ >= this.clipLeft && (anLocalInt_361_ < this.clipRight)) {
                        int anLocalInt_362_ = (anLocalInt_361_ + (argument_339_ * this.width));
                        int anLocalInt_363_ = (this.pixels[anLocalInt_362_]);
                        int anLocalInt_364_ = argument_342_ + anLocalInt_363_;
                        int anLocalInt_365_ = ((argument_342_ & 0xff00ff) + (anLocalInt_363_ & 0xff00ff));
                        anLocalInt_363_ = ((anLocalInt_365_ & 0x1000100) + (anLocalInt_364_ - anLocalInt_365_ & 0x10000));
                        this.pixels[anLocalInt_362_] = (anLocalInt_364_ - anLocalInt_363_ | anLocalInt_363_ - (anLocalInt_363_ >>> 8));
                    }
                    argument_338_ += anLocalInt;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final Skybox createSkybox(int argument_366_, int argument_367_, int argument_368_, int argument_369_, int argument_370_, int argument_371_) {
        return null;
    }

    JavaToolkit(Canvas argument_372_, TextureSource argument_373_, int argument_374_, int argument_375_) {
        this(argument_373_);
        try {
            method2036(argument_372_, argument_374_, argument_375_);
            method2018(argument_372_);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            this.method2027((byte) -113);
            throw new RuntimeException("");
        }
    }

    final boolean method2039() {
        return false;
    }

    final Class167 method2057(Class101 argument_376_, int argument_377_, int argument_378_, int argument_379_, int argument_380_) {
        return new Class167_Sub1(this, argument_376_, argument_377_, argument_379_, argument_380_, argument_378_);
    }
    final void setClip(int x, int y, int xb, int yb) {
        if (x < 0)
            x = 0;
        if (yb < 0)
            yb = 0;
        if (xb > this.width)
            xb = this.width;
        if (y > height)
            y = height;
        this.clipLeft = x;
        this.clipRight = xb;
        this.clipTop = yb;
        this.clipBottom = y;
        method2106();
    }

    final void method2074(Class72 argument_385_, int argument_386_) {
        Class293 class293 = method2112(Thread.currentThread());
        DoublyLinkedNodeP2_Sub4 class104_sub4 = (argument_385_.aClass119_497.aClass104_Sub4_971);
        for (DoublyLinkedNodeP2_Sub4 class104_sub4_387_ = class104_sub4.aClass104_Sub4_4526; class104_sub4_387_ != class104_sub4; class104_sub4_387_ = class104_sub4_387_.aClass104_Sub4_4526) {
            DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1 = (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_387_;
            int anLocalInt = class104_sub4_sub1.anInt6435 >> 12;
            int anLocalInt_388_ = class104_sub4_sub1.anInt6430 >> 12;
            int anLocalInt_389_ = class104_sub4_sub1.anInt6432 >> 12;
            float f = (this.aClass350_Sub1_4648.aFloat5427 + ((this.aClass350_Sub1_4648.aFloat5418 * (float) anLocalInt) + (this.aClass350_Sub1_4648.aFloat5422) * (float) anLocalInt_388_ + (this.aClass350_Sub1_4648.aFloat5419) * (float) anLocalInt_389_));
            if (!(f < (float) this.anInt4643) && !(f > (float) class293.anInt2405)) {
                int anLocalInt_390_ = (this.anInt4668 + (int) ((float) this.anInt4653 * ((this.aClass350_Sub1_4648.aFloat5426) + ((this.aClass350_Sub1_4648.aFloat5421) * (float) anLocalInt + (this.aClass350_Sub1_4648.aFloat5425 * (float) anLocalInt_388_) + (this.aClass350_Sub1_4648.aFloat5428 * (float) anLocalInt_389_))) / (float) argument_386_));
                int anLocalInt_391_ = (this.anInt4642 + (int) ((float) this.anInt4645 * ((this.aClass350_Sub1_4648.aFloat5424) + ((this.aClass350_Sub1_4648.aFloat5420) * (float) anLocalInt + (this.aClass350_Sub1_4648.aFloat5430 * (float) anLocalInt_388_) + (this.aClass350_Sub1_4648.aFloat5429 * (float) anLocalInt_389_))) / (float) argument_386_));
                if (anLocalInt_390_ >= this.clipLeft && anLocalInt_390_ <= this.clipRight && anLocalInt_391_ >= this.clipTop && anLocalInt_391_ <= this.clipBottom) {
                    if (f == 0.0F)
                        f = 1.0F;
                    method2102(class104_sub4_sub1, anLocalInt_390_, anLocalInt_391_, (int) f, ((class104_sub4_sub1.anInt6431) * this.anInt4653 >> 12) / argument_386_);
                }
            }
        }
    }

    final void method2071() {
        aClass149_4660.clear((byte) -3);
        aClass149_4636.clear((byte) -3);
    }

    final int[] getPixels(int argument_392_, int argument_393_, int argument_394_, int argument_395_) {
        int[] anLocalInts = new int[argument_394_ * argument_395_];
        int anLocalInt = 0;
        for (int anLocalInt_396_ = 0; anLocalInt_396_ < argument_395_; anLocalInt_396_++) {
            int anLocalInt_397_ = (((argument_393_ + anLocalInt_396_) * this.width) + argument_392_);
            for (int anLocalInt_398_ = 0; anLocalInt_398_ < argument_394_; anLocalInt_398_++)
                anLocalInts[anLocalInt++] = (this.pixels[anLocalInt_397_ + anLocalInt_398_]);
        }
        return anLocalInts;
    }

    final HardwareLight createLight(int argument_399_, int argument_400_, int argument_401_, int argument_402_, int argument_403_, float argument_404_) {
        return null;
    }

    final void method2069(Class350 argument_405_) {
        this.aClass350_Sub1_4648 = (Class350_Sub1) argument_405_;
    }

    private final void method2109(int argument_406_, int argument_407_, int argument_408_, int argument_409_, int argument_410_, int argument_411_, int argument_412_, int argument_413_) {
        if (argument_407_ >= this.clipTop && argument_407_ < this.clipBottom) {
            int anLocalInt = (argument_406_ + argument_407_ * this.width);
            int anLocalInt_414_ = argument_409_ >>> 24;
            int anLocalInt_415_ = argument_411_ + argument_412_;
            int anLocalInt_416_ = argument_413_ % anLocalInt_415_;
            if (argument_410_ == 0 || argument_410_ == 1 && anLocalInt_414_ == 255) {
                int anLocalInt_417_ = 0;
                while (anLocalInt_417_ < argument_408_) {
                    if ((argument_406_ + anLocalInt_417_ >= this.clipLeft) && (argument_406_ + anLocalInt_417_ < this.clipRight) && anLocalInt_416_ < argument_411_)
                        this.pixels[anLocalInt + anLocalInt_417_] = argument_409_;
                    anLocalInt_417_++;
                    anLocalInt_416_ = ++anLocalInt_416_ % anLocalInt_415_;
                }
            } else if (argument_410_ == 1) {
                argument_409_ = (((argument_409_ & 0xff00ff) * anLocalInt_414_ >> 8 & 0xff00ff) + ((argument_409_ & 0xff00) * anLocalInt_414_ >> 8 & 0xff00) + (anLocalInt_414_ << 24));
                int anLocalInt_418_ = 256 - anLocalInt_414_;
                int anLocalInt_419_ = 0;
                while (anLocalInt_419_ < argument_408_) {
                    if ((argument_406_ + anLocalInt_419_ >= this.clipLeft) && (argument_406_ + anLocalInt_419_ < this.clipRight) && anLocalInt_416_ < argument_411_) {
                        int anLocalInt_420_ = (this.pixels[anLocalInt + anLocalInt_419_]);
                        anLocalInt_420_ = ((((anLocalInt_420_ & 0xff00ff) * anLocalInt_418_ >> 8) & 0xff00ff) + (((anLocalInt_420_ & 0xff00) * anLocalInt_418_ >> 8) & 0xff00));
                        this.pixels[anLocalInt + anLocalInt_419_] = argument_409_ + anLocalInt_420_;
                    }
                    anLocalInt_419_++;
                    anLocalInt_416_ = ++anLocalInt_416_ % anLocalInt_415_;
                }
            } else if (argument_410_ == 2) {
                int anLocalInt_421_ = 0;
                while (anLocalInt_421_ < argument_408_) {
                    if ((argument_406_ + anLocalInt_421_ >= this.clipLeft) && (argument_406_ + anLocalInt_421_ < this.clipRight) && anLocalInt_416_ < argument_411_) {
                        int anLocalInt_422_ = (this.pixels[anLocalInt + anLocalInt_421_]);
                        int anLocalInt_423_ = argument_409_ + anLocalInt_422_;
                        int anLocalInt_424_ = ((argument_409_ & 0xff00ff) + (anLocalInt_422_ & 0xff00ff));
                        anLocalInt_422_ = ((anLocalInt_424_ & 0x1000100) + (anLocalInt_423_ - anLocalInt_424_ & 0x10000));
                        this.pixels[anLocalInt + anLocalInt_421_] = (anLocalInt_423_ - anLocalInt_422_ | anLocalInt_422_ - (anLocalInt_422_ >>> 8));
                    }
                    anLocalInt_421_++;
                    anLocalInt_416_ = ++anLocalInt_416_ % anLocalInt_415_;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method2068(int argument_425_, int argument_426_, int argument_427_, int argument_428_, int argument_429_, int argument_430_, Class_aa argument_431_, int argument_432_, int argument_433_, int argument_434_, int argument_435_, int argument_436_) {
        Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_431_;
        int[] anLocalInts = class_aa_sub3.anIntArray3757;
        int[] anLocalInts_437_ = class_aa_sub3.anIntArray3755;
        int anLocalInt = (this.clipTop > argument_433_ ? this.clipTop : argument_433_);
        int anLocalInt_438_ = ((this.clipBottom < argument_433_ + anLocalInts.length) ? this.clipBottom : argument_433_ + anLocalInts.length);
        argument_436_ <<= 8;
        argument_434_ <<= 8;
        argument_435_ <<= 8;
        int anLocalInt_439_ = argument_434_ + argument_435_;
        argument_436_ %= anLocalInt_439_;
        argument_427_ -= argument_425_;
        argument_428_ -= argument_426_;
        if (argument_427_ + argument_428_ < 0) {
            int anLocalInt_440_ = (int) (Math.sqrt((double) (argument_427_ * argument_427_ + argument_428_ * argument_428_)) * 256.0);
            int anLocalInt_441_ = anLocalInt_440_ % anLocalInt_439_;
            argument_436_ = (anLocalInt_439_ + argument_434_ - argument_436_ - anLocalInt_441_);
            argument_436_ %= anLocalInt_439_;
            if (argument_436_ < 0)
                argument_436_ += anLocalInt_439_;
            argument_425_ += argument_427_;
            argument_427_ = -argument_427_;
            argument_426_ += argument_428_;
            argument_428_ = -argument_428_;
        }
        if (argument_427_ > argument_428_) {
            argument_426_ <<= 16;
            argument_426_ += 32768;
            argument_428_ <<= 16;
            int anLocalInt_442_ = (int) Math.floor(((double) argument_428_ / (double) argument_427_) + 0.5);
            argument_427_ += argument_425_;
            int anLocalInt_443_ = argument_429_ >>> 24;
            int anLocalInt_444_ = (int) Math.sqrt((double) (((anLocalInt_442_ >> 8) * (anLocalInt_442_ >> 8)) + 65536));
            if (argument_430_ == 0 || argument_430_ == 1 && anLocalInt_443_ == 255) {
                while (argument_425_ <= argument_427_) {
                    int anLocalInt_445_ = argument_426_ >> 16;
                    int anLocalInt_446_ = anLocalInt_445_ - argument_433_;
                    if (argument_425_ >= this.clipLeft && argument_425_ < this.clipRight && anLocalInt_445_ >= anLocalInt && anLocalInt_445_ < anLocalInt_438_ && argument_436_ < argument_434_) {
                        int anLocalInt_447_ = argument_432_ + anLocalInts[anLocalInt_446_];
                        if (argument_425_ >= anLocalInt_447_ && (argument_425_ < (anLocalInt_447_ + anLocalInts_437_[anLocalInt_446_])))
                            this.pixels[(argument_425_ + (anLocalInt_445_ * this.width))] = argument_429_;
                    }
                    argument_426_ += anLocalInt_442_;
                    argument_425_++;
                    argument_436_ += anLocalInt_444_;
                    argument_436_ %= anLocalInt_439_;
                }
                return;
            }
            if (argument_430_ == 1) {
                argument_429_ = (((argument_429_ & 0xff00ff) * anLocalInt_443_ >> 8 & 0xff00ff) + ((argument_429_ & 0xff00) * anLocalInt_443_ >> 8 & 0xff00) + (anLocalInt_443_ << 24));
                int anLocalInt_448_ = 256 - anLocalInt_443_;
                while (argument_425_ <= argument_427_) {
                    int anLocalInt_449_ = argument_426_ >> 16;
                    int anLocalInt_450_ = anLocalInt_449_ - argument_433_;
                    if (argument_425_ >= this.clipLeft && argument_425_ < this.clipRight && anLocalInt_449_ >= anLocalInt && anLocalInt_449_ < anLocalInt_438_ && argument_436_ < argument_434_) {
                        int anLocalInt_451_ = argument_432_ + anLocalInts[anLocalInt_450_];
                        if (argument_425_ >= anLocalInt_451_ && (argument_425_ < (anLocalInt_451_ + anLocalInts_437_[anLocalInt_450_]))) {
                            int anLocalInt_452_ = (argument_425_ + (anLocalInt_449_ * this.width));
                            int anLocalInt_453_ = (this.pixels[anLocalInt_452_]);
                            anLocalInt_453_ = ((((anLocalInt_453_ & 0xff00ff) * anLocalInt_448_) >> 8 & 0xff00ff) + (((anLocalInt_453_ & 0xff00) * anLocalInt_448_) >> 8 & 0xff00));
                            this.pixels[anLocalInt_452_] = argument_429_ + anLocalInt_453_;
                        }
                    }
                    argument_426_ += anLocalInt_442_;
                    argument_425_++;
                    argument_436_ += anLocalInt_444_;
                    argument_436_ %= anLocalInt_439_;
                }
                return;
            }
            if (argument_430_ == 2) {
                while (argument_425_ <= argument_427_) {
                    int anLocalInt_454_ = argument_426_ >> 16;
                    int anLocalInt_455_ = anLocalInt_454_ - argument_433_;
                    if (argument_425_ >= this.clipLeft && argument_425_ < this.clipRight && anLocalInt_454_ >= anLocalInt && anLocalInt_454_ < anLocalInt_438_ && argument_436_ < argument_434_) {
                        int anLocalInt_456_ = argument_432_ + anLocalInts[anLocalInt_455_];
                        if (argument_425_ >= anLocalInt_456_ && (argument_425_ < (anLocalInt_456_ + anLocalInts_437_[anLocalInt_455_]))) {
                            int anLocalInt_457_ = (argument_425_ + (anLocalInt_454_ * this.width));
                            int anLocalInt_458_ = (this.pixels[anLocalInt_457_]);
                            int anLocalInt_459_ = argument_429_ + anLocalInt_458_;
                            int anLocalInt_460_ = ((argument_429_ & 0xff00ff) + (anLocalInt_458_ & 0xff00ff));
                            anLocalInt_458_ = ((anLocalInt_460_ & 0x1000100) + (anLocalInt_459_ - anLocalInt_460_ & 0x10000));
                            this.pixels[anLocalInt_457_] = (anLocalInt_459_ - anLocalInt_458_ | anLocalInt_458_ - (anLocalInt_458_ >>> 8));
                        }
                    }
                    argument_426_ += anLocalInt_442_;
                    argument_425_++;
                    argument_436_ += anLocalInt_444_;
                    argument_436_ %= anLocalInt_439_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        argument_425_ <<= 16;
        argument_425_ += 32768;
        argument_427_ <<= 16;
        int anLocalInt_461_ = (int) Math.floor((double) argument_427_ / (double) argument_428_ + 0.5);
        int anLocalInt_462_ = (int) Math.sqrt((double) (((anLocalInt_461_ >> 8) * (anLocalInt_461_ >> 8)) + 65536));
        argument_428_ += argument_426_;
        int anLocalInt_463_ = argument_429_ >>> 24;
        if (argument_430_ == 0 || argument_430_ == 1 && anLocalInt_463_ == 255) {
            while (argument_426_ <= argument_428_) {
                int anLocalInt_464_ = argument_425_ >> 16;
                int anLocalInt_465_ = argument_426_ - argument_433_;
                if (argument_426_ >= anLocalInt && argument_426_ < anLocalInt_438_ && anLocalInt_464_ >= this.clipLeft && anLocalInt_464_ < this.clipRight && argument_436_ < argument_434_ && (anLocalInt_464_ >= argument_432_ + anLocalInts[anLocalInt_465_]) && anLocalInt_464_ < (argument_432_ + anLocalInts[anLocalInt_465_] + anLocalInts_437_[anLocalInt_465_]))
                    this.pixels[(anLocalInt_464_ + argument_426_ * this.width)] = argument_429_;
                argument_425_ += anLocalInt_461_;
                argument_426_++;
                argument_436_ += anLocalInt_462_;
                argument_436_ %= anLocalInt_439_;
            }
        } else if (argument_430_ == 1) {
            argument_429_ = (((argument_429_ & 0xff00ff) * anLocalInt_463_ >> 8 & 0xff00ff) + ((argument_429_ & 0xff00) * anLocalInt_463_ >> 8 & 0xff00) + (anLocalInt_463_ << 24));
            int anLocalInt_466_ = 256 - anLocalInt_463_;
            while (argument_426_ <= argument_428_) {
                int anLocalInt_467_ = argument_425_ >> 16;
                int anLocalInt_468_ = argument_426_ - argument_433_;
                if (argument_426_ >= anLocalInt && argument_426_ < anLocalInt_438_ && anLocalInt_467_ >= this.clipLeft && anLocalInt_467_ < this.clipRight && argument_436_ < argument_434_ && (anLocalInt_467_ >= argument_432_ + anLocalInts[anLocalInt_468_]) && (anLocalInt_467_ < (argument_432_ + anLocalInts[anLocalInt_468_] + anLocalInts_437_[anLocalInt_468_]))) {
                    int anLocalInt_469_ = (anLocalInt_467_ + argument_426_ * this.width);
                    int anLocalInt_470_ = (this.pixels[anLocalInt_469_]);
                    anLocalInt_470_ = (((anLocalInt_470_ & 0xff00ff) * anLocalInt_466_ >> 8 & 0xff00ff) + ((anLocalInt_470_ & 0xff00) * anLocalInt_466_ >> 8 & 0xff00));
                    this.pixels[(anLocalInt_467_ + argument_426_ * this.width)] = argument_429_ + anLocalInt_470_;
                }
                argument_425_ += anLocalInt_461_;
                argument_426_++;
                argument_436_ += anLocalInt_462_;
                argument_436_ %= anLocalInt_439_;
            }
        } else if (argument_430_ == 2) {
            while (argument_426_ <= argument_428_) {
                int anLocalInt_471_ = argument_425_ >> 16;
                int anLocalInt_472_ = argument_426_ - argument_433_;
                if (argument_426_ >= anLocalInt && argument_426_ < anLocalInt_438_ && anLocalInt_471_ >= this.clipLeft && anLocalInt_471_ < this.clipRight && argument_436_ < argument_434_ && (anLocalInt_471_ >= argument_432_ + anLocalInts[anLocalInt_472_]) && (anLocalInt_471_ < (argument_432_ + anLocalInts[anLocalInt_472_] + anLocalInts_437_[anLocalInt_472_]))) {
                    int anLocalInt_473_ = (anLocalInt_471_ + argument_426_ * this.width);
                    int anLocalInt_474_ = (this.pixels[anLocalInt_473_]);
                    int anLocalInt_475_ = argument_429_ + anLocalInt_474_;
                    int anLocalInt_476_ = ((argument_429_ & 0xff00ff) + (anLocalInt_474_ & 0xff00ff));
                    anLocalInt_474_ = ((anLocalInt_476_ & 0x1000100) + (anLocalInt_475_ - anLocalInt_476_ & 0x10000));
                    this.pixels[anLocalInt_473_] = (anLocalInt_475_ - anLocalInt_474_ | anLocalInt_474_ - (anLocalInt_474_ >>> 8));
                }
                argument_425_ += anLocalInt_461_;
                argument_426_++;
                argument_436_ += anLocalInt_462_;
                argument_436_ %= anLocalInt_439_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final void method2018(Canvas argument_477_) {
        if (argument_477_ != null) {
            Rs2DPainter class59_sub22 = ((Rs2DPainter) painterMap.get((long) argument_477_.hashCode()));
            if (class59_sub22 != null) {
                currentCanvas = argument_477_;
                Dimension dimension = argument_477_.getSize();
                anInt4629 = dimension.width;
                anInt4623 = dimension.height;
                this.currentPainter = class59_sub22;
                if (aClass364_4669 == null) {
                    this.pixels = class59_sub22.myPixels;
                    this.width = class59_sub22.width;
                    height = class59_sub22.height;
                    if (this.width != anInt4640 || height != anInt4650) {
                        anInt4657 = anInt4640 = this.width;
                        anInt4631 = anInt4650 = height;
                        this.aFloatArray4644 = this.aFloatArray4667 = new float[anInt4640 * anInt4650];
                    }
                    method2099();
                }
            }
        } else {
            currentCanvas = null;
            this.currentPainter = null;
            if (aClass364_4669 == null) {
                this.pixels = null;
                this.width = height = 1;
                anInt4640 = anInt4650 = 1;
                method2099();
            }
        }
    }

    final void method2073(boolean argument_478_) {
        aBoolean4639 = argument_478_;
        aClass149_4660.clear((byte) -3);
    }

    final boolean method2049() {
        return true;
    }

    final void drawDot(int argument_479_, int argument_480_, int argument_481_, int argument_482_, int argument_483_) {
        if (argument_481_ < 0)
            argument_481_ = -argument_481_;
        int anLocalInt = argument_480_ - argument_481_;
        if (anLocalInt < this.clipTop)
            anLocalInt = this.clipTop;
        int anLocalInt_484_ = argument_480_ + argument_481_ + 1;
        if (anLocalInt_484_ > this.clipBottom)
            anLocalInt_484_ = this.clipBottom;
        int anLocalInt_485_ = anLocalInt;
        int anLocalInt_486_ = argument_481_ * argument_481_;
        int anLocalInt_487_ = 0;
        int anLocalInt_488_ = argument_480_ - anLocalInt_485_;
        int anLocalInt_489_ = anLocalInt_488_ * anLocalInt_488_;
        int anLocalInt_490_ = anLocalInt_489_ - anLocalInt_488_;
        if (argument_480_ > anLocalInt_484_)
            argument_480_ = anLocalInt_484_;
        int anLocalInt_491_ = argument_482_ >>> 24;
        if (argument_483_ == 0 || argument_483_ == 1 && anLocalInt_491_ == 255) {
            while (anLocalInt_485_ < argument_480_) {
                for (/**/; (anLocalInt_490_ <= anLocalInt_486_ || anLocalInt_489_ <= anLocalInt_486_); anLocalInt_490_ += anLocalInt_487_++ + anLocalInt_487_)
                    anLocalInt_489_ += anLocalInt_487_ + anLocalInt_487_;
                int anLocalInt_492_ = argument_479_ - anLocalInt_487_ + 1;
                if (anLocalInt_492_ < this.clipLeft)
                    anLocalInt_492_ = this.clipLeft;
                int anLocalInt_493_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_493_ > this.clipRight)
                    anLocalInt_493_ = this.clipRight;
                int anLocalInt_494_ = (anLocalInt_492_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_495_ = anLocalInt_492_; anLocalInt_495_ < anLocalInt_493_; anLocalInt_495_++)
                    this.pixels[anLocalInt_494_++] = argument_482_;
                anLocalInt_485_++;
                anLocalInt_489_ -= anLocalInt_488_-- + anLocalInt_488_;
                anLocalInt_490_ -= anLocalInt_488_ + anLocalInt_488_;
            }
            anLocalInt_487_ = argument_481_;
            anLocalInt_488_ = anLocalInt_485_ - argument_480_;
            anLocalInt_490_ = anLocalInt_488_ * anLocalInt_488_ + anLocalInt_486_;
            anLocalInt_489_ = anLocalInt_490_ - anLocalInt_487_;
            anLocalInt_490_ -= anLocalInt_488_;
            while (anLocalInt_485_ < anLocalInt_484_) {
                for (/**/; (anLocalInt_490_ > anLocalInt_486_ && anLocalInt_489_ > anLocalInt_486_); anLocalInt_489_ -= anLocalInt_487_ + anLocalInt_487_)
                    anLocalInt_490_ -= anLocalInt_487_-- + anLocalInt_487_;
                int anLocalInt_496_ = argument_479_ - anLocalInt_487_;
                if (anLocalInt_496_ < this.clipLeft)
                    anLocalInt_496_ = this.clipLeft;
                int anLocalInt_497_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_497_ > this.clipRight - 1)
                    anLocalInt_497_ = this.clipRight - 1;
                int anLocalInt_498_ = (anLocalInt_496_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_499_ = anLocalInt_496_; anLocalInt_499_ <= anLocalInt_497_; anLocalInt_499_++)
                    this.pixels[anLocalInt_498_++] = argument_482_;
                anLocalInt_485_++;
                anLocalInt_490_ += anLocalInt_488_ + anLocalInt_488_;
                anLocalInt_489_ += anLocalInt_488_++ + anLocalInt_488_;
            }
        } else if (argument_483_ == 1) {
            argument_482_ = (((argument_482_ & 0xff00ff) * anLocalInt_491_ >> 8 & 0xff00ff) + ((argument_482_ & 0xff00) * anLocalInt_491_ >> 8 & 0xff00) + (anLocalInt_491_ << 24));
            int anLocalInt_500_ = 256 - anLocalInt_491_;
            while (anLocalInt_485_ < argument_480_) {
                for (/**/; (anLocalInt_490_ <= anLocalInt_486_ || anLocalInt_489_ <= anLocalInt_486_); anLocalInt_490_ += anLocalInt_487_++ + anLocalInt_487_)
                    anLocalInt_489_ += anLocalInt_487_ + anLocalInt_487_;
                int anLocalInt_501_ = argument_479_ - anLocalInt_487_ + 1;
                if (anLocalInt_501_ < this.clipLeft)
                    anLocalInt_501_ = this.clipLeft;
                int anLocalInt_502_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_502_ > this.clipRight)
                    anLocalInt_502_ = this.clipRight;
                int anLocalInt_503_ = (anLocalInt_501_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_504_ = anLocalInt_501_; anLocalInt_504_ < anLocalInt_502_; anLocalInt_504_++) {
                    int anLocalInt_505_ = (this.pixels[anLocalInt_503_]);
                    anLocalInt_505_ = (((anLocalInt_505_ & 0xff00ff) * anLocalInt_500_ >> 8 & 0xff00ff) + ((anLocalInt_505_ & 0xff00) * anLocalInt_500_ >> 8 & 0xff00));
                    this.pixels[anLocalInt_503_++] = argument_482_ + anLocalInt_505_;
                }
                anLocalInt_485_++;
                anLocalInt_489_ -= anLocalInt_488_-- + anLocalInt_488_;
                anLocalInt_490_ -= anLocalInt_488_ + anLocalInt_488_;
            }
            anLocalInt_487_ = argument_481_;
            anLocalInt_488_ = -anLocalInt_488_;
            anLocalInt_490_ = anLocalInt_488_ * anLocalInt_488_ + anLocalInt_486_;
            anLocalInt_489_ = anLocalInt_490_ - anLocalInt_487_;
            anLocalInt_490_ -= anLocalInt_488_;
            while (anLocalInt_485_ < anLocalInt_484_) {
                for (/**/; (anLocalInt_490_ > anLocalInt_486_ && anLocalInt_489_ > anLocalInt_486_); anLocalInt_489_ -= anLocalInt_487_ + anLocalInt_487_)
                    anLocalInt_490_ -= anLocalInt_487_-- + anLocalInt_487_;
                int anLocalInt_506_ = argument_479_ - anLocalInt_487_;
                if (anLocalInt_506_ < this.clipLeft)
                    anLocalInt_506_ = this.clipLeft;
                int anLocalInt_507_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_507_ > this.clipRight - 1)
                    anLocalInt_507_ = this.clipRight - 1;
                int anLocalInt_508_ = (anLocalInt_506_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_509_ = anLocalInt_506_; anLocalInt_509_ <= anLocalInt_507_; anLocalInt_509_++) {
                    int anLocalInt_510_ = (this.pixels[anLocalInt_508_]);
                    anLocalInt_510_ = (((anLocalInt_510_ & 0xff00ff) * anLocalInt_500_ >> 8 & 0xff00ff) + ((anLocalInt_510_ & 0xff00) * anLocalInt_500_ >> 8 & 0xff00));
                    this.pixels[anLocalInt_508_++] = argument_482_ + anLocalInt_510_;
                }
                anLocalInt_485_++;
                anLocalInt_490_ += anLocalInt_488_ + anLocalInt_488_;
                anLocalInt_489_ += anLocalInt_488_++ + anLocalInt_488_;
            }
        } else if (argument_483_ == 2) {
            while (anLocalInt_485_ < argument_480_) {
                for (/**/; (anLocalInt_490_ <= anLocalInt_486_ || anLocalInt_489_ <= anLocalInt_486_); anLocalInt_490_ += anLocalInt_487_++ + anLocalInt_487_)
                    anLocalInt_489_ += anLocalInt_487_ + anLocalInt_487_;
                int anLocalInt_511_ = argument_479_ - anLocalInt_487_ + 1;
                if (anLocalInt_511_ < this.clipLeft)
                    anLocalInt_511_ = this.clipLeft;
                int anLocalInt_512_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_512_ > this.clipRight)
                    anLocalInt_512_ = this.clipRight;
                int anLocalInt_513_ = (anLocalInt_511_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_514_ = anLocalInt_511_; anLocalInt_514_ < anLocalInt_512_; anLocalInt_514_++) {
                    int anLocalInt_515_ = (this.pixels[anLocalInt_513_]);
                    int anLocalInt_516_ = argument_482_ + anLocalInt_515_;
                    int anLocalInt_517_ = ((argument_482_ & 0xff00ff) + (anLocalInt_515_ & 0xff00ff));
                    anLocalInt_515_ = ((anLocalInt_517_ & 0x1000100) + (anLocalInt_516_ - anLocalInt_517_ & 0x10000));
                    this.pixels[anLocalInt_513_++] = (anLocalInt_516_ - anLocalInt_515_ | anLocalInt_515_ - (anLocalInt_515_ >>> 8));
                }
                anLocalInt_485_++;
                anLocalInt_489_ -= anLocalInt_488_-- + anLocalInt_488_;
                anLocalInt_490_ -= anLocalInt_488_ + anLocalInt_488_;
            }
            anLocalInt_487_ = argument_481_;
            anLocalInt_488_ = -anLocalInt_488_;
            anLocalInt_490_ = anLocalInt_488_ * anLocalInt_488_ + anLocalInt_486_;
            anLocalInt_489_ = anLocalInt_490_ - anLocalInt_487_;
            anLocalInt_490_ -= anLocalInt_488_;
            while (anLocalInt_485_ < anLocalInt_484_) {
                for (/**/; (anLocalInt_490_ > anLocalInt_486_ && anLocalInt_489_ > anLocalInt_486_); anLocalInt_489_ -= anLocalInt_487_ + anLocalInt_487_)
                    anLocalInt_490_ -= anLocalInt_487_-- + anLocalInt_487_;
                int anLocalInt_518_ = argument_479_ - anLocalInt_487_;
                if (anLocalInt_518_ < this.clipLeft)
                    anLocalInt_518_ = this.clipLeft;
                int anLocalInt_519_ = argument_479_ + anLocalInt_487_;
                if (anLocalInt_519_ > this.clipRight - 1)
                    anLocalInt_519_ = this.clipRight - 1;
                int anLocalInt_520_ = (anLocalInt_518_ + anLocalInt_485_ * this.width);
                for (int anLocalInt_521_ = anLocalInt_518_; anLocalInt_521_ <= anLocalInt_519_; anLocalInt_521_++) {
                    int anLocalInt_522_ = (this.pixels[anLocalInt_520_]);
                    int anLocalInt_523_ = argument_482_ + anLocalInt_522_;
                    int anLocalInt_524_ = ((argument_482_ & 0xff00ff) + (anLocalInt_522_ & 0xff00ff));
                    anLocalInt_522_ = ((anLocalInt_524_ & 0x1000100) + (anLocalInt_523_ - anLocalInt_524_ & 0x10000));
                    this.pixels[anLocalInt_520_++] = (anLocalInt_523_ - anLocalInt_522_ | anLocalInt_522_ - (anLocalInt_522_ >>> 8));
                }
                anLocalInt_485_++;
                anLocalInt_490_ += anLocalInt_488_ + anLocalInt_488_;
                anLocalInt_489_ += anLocalInt_488_++ + anLocalInt_488_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final int method2110(int argument_525_) {
        return (this.textureSource.getDescriptor(argument_525_, true).anInt830);
    }

    final void drawVLine(int x, int y, int h, int colour, int combineConfig) {
        if (x >= this.clipLeft && x < this.clipRight) {
            if (y < this.clipTop) {
                h -= this.clipTop - y;
                y = this.clipTop;
            }
            if (y + h > this.clipBottom)
                h = this.clipBottom - y;
            int _drawOff = (x + y * this.width);
            int alpha = colour >>> 24;
            if (combineConfig == 0 || combineConfig == 1 && alpha == 255) {
                for (int _y = 0; _y < h; _y++)
                    this.pixels[_drawOff + (_y * this.width)] = colour;
            } else if (combineConfig == 1) {
                colour = (((colour & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((colour & 0xff00) * alpha >> 8 & 0xff00) + (alpha << 24));
                int anLocalInt_533_ = 256 - alpha;
                for (int anLocalInt_534_ = 0; anLocalInt_534_ < h; anLocalInt_534_++) {
                    int anLocalInt_535_ = _drawOff + (anLocalInt_534_ * this.width);
                    int anLocalInt_536_ = (this.pixels[anLocalInt_535_]);
                    anLocalInt_536_ = (((anLocalInt_536_ & 0xff00ff) * anLocalInt_533_ >> 8 & 0xff00ff) + ((anLocalInt_536_ & 0xff00) * anLocalInt_533_ >> 8 & 0xff00));
                    this.pixels[anLocalInt_535_] = colour + anLocalInt_536_;
                }
            } else if (combineConfig == 2) {
                for (int anLocalInt_537_ = 0; anLocalInt_537_ < h; anLocalInt_537_++) {
                    int anLocalInt_538_ = _drawOff + (anLocalInt_537_ * this.width);
                    int anLocalInt_539_ = (this.pixels[anLocalInt_538_]);
                    int anLocalInt_540_ = colour + anLocalInt_539_;
                    int anLocalInt_541_ = ((colour & 0xff00ff) + (anLocalInt_539_ & 0xff00ff));
                    anLocalInt_539_ = ((anLocalInt_541_ & 0x1000100) + (anLocalInt_540_ - anLocalInt_541_ & 0x10000));
                    this.pixels[anLocalInt_538_] = (anLocalInt_540_ - anLocalInt_539_ | anLocalInt_539_ - (anLocalInt_539_ >>> 8));
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void method2098() {
        /* empty */
    }

    final int M() {
        int anLocalInt = anInt4663;
        anInt4663 = 0;
        return anLocalInt;
    }

    final void drawHLine(int x, int y, int w, int colour, int combineConfig) {
        if (y >= this.clipTop && y < this.clipBottom) {
            if (x < this.clipLeft) {
                w -= this.clipLeft - x;
                x = this.clipLeft;
            }
            if (x + w > this.clipRight)
                w = this.clipRight - x;
            int _drawOff = (x + y * this.width);
            int alpha = colour >>> 24;
            if (combineConfig == 0 || combineConfig == 1 && alpha == 255) {
                for (int _x = 0; _x < w; _x++)
                    this.pixels[(_drawOff + _x)] = colour;
            } else if (combineConfig == 1) {
                colour = (((colour & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((colour & 0xff00) * alpha >> 8 & 0xff00) + (alpha << 24));
                int anLocalInt_549_ = 256 - alpha;
                for (int anLocalInt_550_ = 0; anLocalInt_550_ < w; anLocalInt_550_++) {
                    int anLocalInt_551_ = (this.pixels[_drawOff + anLocalInt_550_]);
                    anLocalInt_551_ = (((anLocalInt_551_ & 0xff00ff) * anLocalInt_549_ >> 8 & 0xff00ff) + ((anLocalInt_551_ & 0xff00) * anLocalInt_549_ >> 8 & 0xff00));
                    this.pixels[(_drawOff + anLocalInt_550_)] = colour + anLocalInt_551_;
                }
            } else if (combineConfig == 2) {
                for (int anLocalInt_552_ = 0; anLocalInt_552_ < w; anLocalInt_552_++) {
                    int anLocalInt_553_ = (this.pixels[_drawOff + anLocalInt_552_]);
                    int anLocalInt_554_ = colour + anLocalInt_553_;
                    int anLocalInt_555_ = ((colour & 0xff00ff) + (anLocalInt_553_ & 0xff00ff));
                    anLocalInt_553_ = ((anLocalInt_555_ & 0x1000100) + (anLocalInt_554_ - anLocalInt_555_ & 0x10000));
                    this.pixels[(_drawOff + anLocalInt_552_)] = (anLocalInt_554_ - anLocalInt_553_ | anLocalInt_553_ - (anLocalInt_553_ >>> 8));
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final void finish() {
        /* empty */
    }

    final void method2054(int argument_556_, int _y, int argument_558_, int argument_559_, int colour, int combineConfig, int argument_562_, int argument_563_, int argument_564_) {
        argument_558_ -= argument_556_;
        argument_559_ -= _y;
        if (argument_559_ == 0) {
            if (argument_558_ >= 0)
                method2109(argument_556_, _y, argument_558_ + 1, colour, combineConfig, argument_562_, argument_563_, argument_564_);
            else {
                int anLocalInt = argument_562_ + argument_563_;
                argument_564_ %= anLocalInt;
                argument_564_ = (anLocalInt + argument_562_ - argument_564_ - (-argument_558_ + 1) % anLocalInt);
                argument_564_ %= anLocalInt;
                if (argument_564_ < 0)
                    argument_564_ += anLocalInt;
                method2109(argument_556_ + argument_558_, _y, -argument_558_ + 1, colour, combineConfig, argument_562_, argument_563_, argument_564_);
            }
        } else if (argument_558_ == 0) {
            if (argument_559_ >= 0)
                method2105(argument_556_, _y, argument_559_ + 1, colour, combineConfig, argument_562_, argument_563_, argument_564_);
            else {
                int anLocalInt = argument_562_ + argument_563_;
                argument_564_ %= anLocalInt;
                argument_564_ = (anLocalInt + argument_562_ - argument_564_ - (-argument_559_ + 1) % anLocalInt);
                argument_564_ %= anLocalInt;
                if (argument_564_ < 0)
                    argument_564_ += anLocalInt;
                method2105(argument_556_, _y + argument_559_, -argument_559_ + 1, colour, combineConfig, argument_562_, argument_563_, argument_564_);
            }
        } else {
            argument_564_ <<= 8;
            argument_562_ <<= 8;
            argument_563_ <<= 8;
            int anLocalInt = argument_562_ + argument_563_;
            argument_564_ %= anLocalInt;
            if (argument_558_ + argument_559_ < 0) {
                int anLocalInt_565_ = (int) (Math.sqrt((double) (argument_558_ * argument_558_ + (argument_559_ * argument_559_))) * 256.0);
                int anLocalInt_566_ = anLocalInt_565_ % anLocalInt;
                argument_564_ = (anLocalInt + argument_562_ - argument_564_ - anLocalInt_566_);
                argument_564_ %= anLocalInt;
                if (argument_564_ < 0)
                    argument_564_ += anLocalInt;
                argument_556_ += argument_558_;
                argument_558_ = -argument_558_;
                _y += argument_559_;
                argument_559_ = -argument_559_;
            }
            if (argument_558_ > argument_559_) {
                _y <<= 16;
                _y += 32768;
                argument_559_ <<= 16;
                int anLocalInt_567_ = (int) Math.floor(((double) argument_559_ / (double) argument_558_) + 0.5);
                argument_558_ += argument_556_;
                int anLocalInt_568_ = colour >>> 24;
                int anLocalInt_569_ = (int) Math.sqrt((double) (((anLocalInt_567_ >> 8) * (anLocalInt_567_ >> 8)) + 65536));
                if (combineConfig == 0 || combineConfig == 1 && anLocalInt_568_ == 255) {
                    while (argument_556_ <= argument_558_) {
                        int anLocalInt_570_ = _y >> 16;
                        if (argument_556_ >= this.clipLeft && argument_556_ < this.clipRight && (anLocalInt_570_ >= this.clipTop) && (anLocalInt_570_ < this.clipBottom) && argument_564_ < argument_562_)
                            this.pixels[(argument_556_ + (anLocalInt_570_ * this.width))] = colour;
                        _y += anLocalInt_567_;
                        argument_556_++;
                        argument_564_ += anLocalInt_569_;
                        argument_564_ %= anLocalInt;
                    }
                    return;
                }
                if (combineConfig == 1) {
                    colour = (((colour & 0xff00ff) * anLocalInt_568_ >> 8 & 0xff00ff) + ((colour & 0xff00) * anLocalInt_568_ >> 8 & 0xff00) + (anLocalInt_568_ << 24));
                    int anLocalInt_571_ = 256 - anLocalInt_568_;
                    while (argument_556_ <= argument_558_) {
                        int anLocalInt_572_ = _y >> 16;
                        if (argument_556_ >= this.clipLeft && argument_556_ < this.clipRight && (anLocalInt_572_ >= this.clipTop) && (anLocalInt_572_ < this.clipBottom) && argument_564_ < argument_562_) {
                            int anLocalInt_573_ = (argument_556_ + (anLocalInt_572_ * this.width));
                            int anLocalInt_574_ = (this.pixels[anLocalInt_573_]);
                            anLocalInt_574_ = ((((anLocalInt_574_ & 0xff00ff) * anLocalInt_571_) >> 8 & 0xff00ff) + (((anLocalInt_574_ & 0xff00) * anLocalInt_571_) >> 8 & 0xff00));
                            this.pixels[anLocalInt_573_] = colour + anLocalInt_574_;
                        }
                        _y += anLocalInt_567_;
                        argument_556_++;
                        argument_564_ += anLocalInt_569_;
                        argument_564_ %= anLocalInt;
                    }
                    return;
                }
                if (combineConfig == 2) {
                    while (argument_556_ <= argument_558_) {
                        int anLocalInt_575_ = _y >> 16;
                        if (argument_556_ >= this.clipLeft && argument_556_ < this.clipRight && (anLocalInt_575_ >= this.clipTop) && (anLocalInt_575_ < this.clipBottom) && argument_564_ < argument_562_) {
                            int anLocalInt_576_ = (argument_556_ + (anLocalInt_575_ * this.width));
                            int anLocalInt_577_ = (this.pixels[anLocalInt_576_]);
                            int anLocalInt_578_ = colour + anLocalInt_577_;
                            int anLocalInt_579_ = ((colour & 0xff00ff) + (anLocalInt_577_ & 0xff00ff));
                            anLocalInt_577_ = ((anLocalInt_579_ & 0x1000100) + (anLocalInt_578_ - anLocalInt_579_ & 0x10000));
                            this.pixels[anLocalInt_576_] = (anLocalInt_578_ - anLocalInt_577_ | anLocalInt_577_ - (anLocalInt_577_ >>> 8));
                        }
                        _y += anLocalInt_567_;
                        argument_556_++;
                        argument_564_ += anLocalInt_569_;
                        argument_564_ %= anLocalInt;
                    }
                    return;
                }
                throw new IllegalArgumentException();
            }
            argument_556_ <<= 16;
            argument_556_ += 32768;
            argument_558_ <<= 16;
            int anLocalInt_580_ = (int) Math.floor(((double) argument_558_ / (double) argument_559_) + 0.5);
            argument_559_ += _y;
            int alpha = colour >>> 24;
            int anLocalInt_582_ = (int) Math.sqrt((double) (((anLocalInt_580_ >> 8) * (anLocalInt_580_ >> 8)) + 65536));
            if (combineConfig == 0 || combineConfig == 1 && alpha == 255) {
                while (_y <= argument_559_) {
                    int _x = argument_556_ >> 16;
                    if (_y >= this.clipTop && _y < this.clipBottom && _x >= this.clipLeft && _x < this.clipRight && argument_564_ < argument_562_)
                        this.pixels[(_x + (_y * this.width))] = colour;
                    argument_556_ += anLocalInt_580_;
                    _y++;
                    argument_564_ += anLocalInt_582_;
                    argument_564_ %= anLocalInt;
                }
            } else if (combineConfig == 1) {
                colour = (((colour & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((colour & 0xff00) * alpha >> 8 & 0xff00) + (alpha << 24));
                int anLocalInt_584_ = 256 - alpha;
                while (_y <= argument_559_) {
                    int anLocalInt_585_ = argument_556_ >> 16;
                    if (_y >= this.clipTop && _y < this.clipBottom && anLocalInt_585_ >= this.clipLeft && anLocalInt_585_ < this.clipRight && argument_564_ < argument_562_) {
                        int anLocalInt_586_ = (anLocalInt_585_ + (_y * this.width));
                        int anLocalInt_587_ = (this.pixels[anLocalInt_586_]);
                        anLocalInt_587_ = ((((anLocalInt_587_ & 0xff00ff) * anLocalInt_584_ >> 8) & 0xff00ff) + (((anLocalInt_587_ & 0xff00) * anLocalInt_584_ >> 8) & 0xff00));
                        this.pixels[(anLocalInt_585_ + (_y * this.width))] = colour + anLocalInt_587_;
                    }
                    argument_556_ += anLocalInt_580_;
                    _y++;
                    argument_564_ += anLocalInt_582_;
                    argument_564_ %= anLocalInt;
                }
            } else if (combineConfig == 2) {
                while (_y <= argument_559_) {
                    int anLocalInt_588_ = argument_556_ >> 16;
                    if (_y >= this.clipTop && _y < this.clipBottom && anLocalInt_588_ >= this.clipLeft && anLocalInt_588_ < this.clipRight && argument_564_ < argument_562_) {
                        int anLocalInt_589_ = (anLocalInt_588_ + (_y * this.width));
                        int anLocalInt_590_ = (this.pixels[anLocalInt_589_]);
                        int anLocalInt_591_ = colour + anLocalInt_590_;
                        int anLocalInt_592_ = ((colour & 0xff00ff) + (anLocalInt_590_ & 0xff00ff));
                        anLocalInt_590_ = ((anLocalInt_592_ & 0x1000100) + (anLocalInt_591_ - anLocalInt_592_ & 0x10000));
                        this.pixels[anLocalInt_589_] = (anLocalInt_591_ - anLocalInt_590_ | anLocalInt_590_ - (anLocalInt_590_ >>> 8));
                    }
                    argument_556_ += anLocalInt_580_;
                    _y++;
                    argument_564_ += anLocalInt_582_;
                    argument_564_ %= anLocalInt;
                }
            } else
                throw new IllegalArgumentException();
        }
    }

    final boolean method2065() {
        return true;
    }

    final void setLights(int argument_593_, HardwareLight[] argument_594_) {
        /* empty */
    }

    final void method2053(int argument_595_) {
        this.anInt4655 = argument_595_;
        aClass149_4660.clear((byte) -3);
    }

    final Class350 method2096() {
        return this.aClass350_Sub1_4648;
    }

    final boolean method2064() {
        return true;
    }

    final void drawRect(int argument_596_, int argument_597_, int argument_598_, int argument_599_, int argument_600_, int argument_601_) {
        drawHLine(argument_596_, argument_597_, argument_598_, argument_600_, argument_601_);
        drawHLine(argument_596_, argument_597_ + argument_599_ - 1, argument_598_, argument_600_, argument_601_);
        drawVLine(argument_596_, argument_597_ + 1, argument_599_ - 2, argument_600_, argument_601_);
        drawVLine(argument_596_ + argument_598_ - 1, argument_597_ + 1, argument_599_ - 2, argument_600_, argument_601_);
    }

    final void method2041(Rectangle[] argument_602_, int argument_603_, int argument_604_, int argument_605_) throws Exception_Sub1 {
        if (currentCanvas == null || this.currentPainter == null)
            throw new IllegalStateException("off");
        try {
            Graphics graphics = currentCanvas.getGraphics();
            for (int anLocalInt = 0; anLocalInt < argument_603_; anLocalInt++) {
                Rectangle rectangle = argument_602_[anLocalInt];
                if ((rectangle.x + argument_604_ <= this.width) && rectangle.y + argument_605_ <= height && rectangle.x + argument_604_ + rectangle.width > 0 && rectangle.y + argument_605_ + rectangle.height > 0)
                    this.currentPainter.draw(rectangle.x, rectangle.y, rectangle.width, rectangle.height, rectangle.x + argument_604_, rectangle.y + argument_605_, graphics);
            }
        } catch (Exception exception) {
            currentCanvas.repaint();
        }
    }

    final int method2016() {
        return 0;
    }

    final dba_sub_772 method2037(int argument_606_) {
        return null;
    }

    final boolean method2111(int argument_607_) {
        if (aBoolean4639 || this.textureSource.getDescriptor(argument_607_, true).isHalfSize)
            return true;
        return false;
    }

    final Class368 method2055(int argument_608_, int argument_609_, boolean argument_610_) {
        if (argument_610_)
            return new Class368_Sub2_Sub2(this, argument_608_, argument_609_);
        return new java_sprite_24(this, argument_608_, argument_609_);
    }

    final void method2058() {
        if (currentCanvas != null) {
            this.pixels = (this.currentPainter.myPixels);
            this.width = (this.currentPainter.width);
            height = (this.currentPainter.height);
            this.aFloatArray4667 = this.aFloatArray4644;
            anInt4640 = anInt4657;
            anInt4650 = anInt4631;
        } else {
            this.width = 1;
            height = 1;
            this.pixels = null;
            anInt4640 = 1;
            anInt4650 = 1;
            this.aFloatArray4667 = null;
        }
        aClass364_4669 = null;
        method2099();
    }

    final void setFog(int argument_611_, int argument_612_, int argument_613_) {
        for (int anLocalInt = 0; anLocalInt < aClass293Array4658.length; anLocalInt++) {
            Class293 class293 = aClass293Array4658[anLocalInt];
            class293.anInt2408 = argument_611_ & 0xffffff;
            int anLocalInt_614_ = class293.anInt2408 >>> 16 & 0xff;
            if (anLocalInt_614_ < 2)
                anLocalInt_614_ = 2;
            int anLocalInt_615_ = class293.anInt2408 >> 8 & 0xff;
            if (anLocalInt_615_ < 2)
                anLocalInt_615_ = 2;
            int anLocalInt_616_ = class293.anInt2408 & 0xff;
            if (anLocalInt_616_ < 2)
                anLocalInt_616_ = 2;
            class293.anInt2408 = (anLocalInt_614_ << 16 | anLocalInt_615_ << 8 | anLocalInt_616_);
            if (argument_612_ < 0)
                class293.aBoolean2409 = false;
            else
                class293.aBoolean2409 = true;
        }
    }

    final void method2036(Canvas argument_617_, int argument_618_, int argument_619_) {
        Rs2DPainter class59_sub22 = ((Rs2DPainter) painterMap.get((long) argument_617_.hashCode()));
        if (class59_sub22 == null) {
            class59_sub22 = Rs2DPainter.create(argument_618_, argument_619_, argument_617_);
            painterMap.put((long) argument_617_.hashCode(), class59_sub22);
        } else if (class59_sub22.width != argument_618_ || (class59_sub22.height != argument_619_))
            setCanvas(argument_617_, argument_618_, argument_619_);
    }

    final void method2031(int argument_620_, int argument_621_, int argument_622_, int argument_623_, int argument_624_, int argument_625_, Class_aa argument_626_, int argument_627_, int argument_628_) {
        Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_626_;
        int[] anLocalInts = class_aa_sub3.anIntArray3757;
        int[] anLocalInts_629_ = class_aa_sub3.anIntArray3755;
        int anLocalInt = (this.clipTop > argument_628_ ? this.clipTop : argument_628_);
        int anLocalInt_630_ = ((this.clipBottom < argument_628_ + anLocalInts.length) ? this.clipBottom : argument_628_ + anLocalInts.length);
        argument_622_ -= argument_620_;
        argument_623_ -= argument_621_;
        if (argument_622_ + argument_623_ < 0) {
            argument_620_ += argument_622_;
            argument_622_ = -argument_622_;
            argument_621_ += argument_623_;
            argument_623_ = -argument_623_;
        }
        if (argument_622_ > argument_623_) {
            argument_621_ <<= 16;
            argument_621_ += 32768;
            argument_623_ <<= 16;
            int anLocalInt_631_ = (int) Math.floor(((double) argument_623_ / (double) argument_622_) + 0.5);
            argument_622_ += argument_620_;
            if (argument_620_ < this.clipLeft) {
                argument_621_ += anLocalInt_631_ * (this.clipLeft - argument_620_);
                argument_620_ = this.clipLeft;
            }
            if (argument_622_ >= this.clipRight)
                argument_622_ = this.clipRight - 1;
            int anLocalInt_632_ = argument_624_ >>> 24;
            if (argument_625_ == 0 || argument_625_ == 1 && anLocalInt_632_ == 255) {
                for (/**/; argument_620_ <= argument_622_; argument_620_++) {
                    int anLocalInt_633_ = argument_621_ >> 16;
                    int anLocalInt_634_ = anLocalInt_633_ - argument_628_;
                    if (anLocalInt_633_ >= anLocalInt && anLocalInt_633_ < anLocalInt_630_) {
                        int anLocalInt_635_ = argument_627_ + anLocalInts[anLocalInt_634_];
                        if (argument_620_ >= anLocalInt_635_ && (argument_620_ < (anLocalInt_635_ + anLocalInts_629_[anLocalInt_634_])))
                            this.pixels[(argument_620_ + (anLocalInt_633_ * this.width))] = argument_624_;
                    }
                    argument_621_ += anLocalInt_631_;
                }
                return;
            }
            if (argument_625_ == 1) {
                argument_624_ = (((argument_624_ & 0xff00ff) * anLocalInt_632_ >> 8 & 0xff00ff) + ((argument_624_ & 0xff00) * anLocalInt_632_ >> 8 & 0xff00) + (anLocalInt_632_ << 24));
                int anLocalInt_636_ = 256 - anLocalInt_632_;
                for (/**/; argument_620_ <= argument_622_; argument_620_++) {
                    int anLocalInt_637_ = argument_621_ >> 16;
                    int anLocalInt_638_ = anLocalInt_637_ - argument_628_;
                    if (anLocalInt_637_ >= anLocalInt && anLocalInt_637_ < anLocalInt_630_) {
                        int anLocalInt_639_ = argument_627_ + anLocalInts[anLocalInt_638_];
                        if (argument_620_ >= anLocalInt_639_ && (argument_620_ < (anLocalInt_639_ + anLocalInts_629_[anLocalInt_638_]))) {
                            int anLocalInt_640_ = (argument_620_ + (anLocalInt_637_ * this.width));
                            int anLocalInt_641_ = (this.pixels[anLocalInt_640_]);
                            anLocalInt_641_ = ((((anLocalInt_641_ & 0xff00ff) * anLocalInt_636_) >> 8 & 0xff00ff) + (((anLocalInt_641_ & 0xff00) * anLocalInt_636_) >> 8 & 0xff00));
                            this.pixels[anLocalInt_640_] = argument_624_ + anLocalInt_641_;
                        }
                    }
                    argument_621_ += anLocalInt_631_;
                }
                return;
            }
            if (argument_625_ == 2) {
                for (/**/; argument_620_ <= argument_622_; argument_620_++) {
                    int anLocalInt_642_ = argument_621_ >> 16;
                    int anLocalInt_643_ = anLocalInt_642_ - argument_628_;
                    if (anLocalInt_642_ >= anLocalInt && anLocalInt_642_ < anLocalInt_630_) {
                        int anLocalInt_644_ = argument_627_ + anLocalInts[anLocalInt_643_];
                        if (argument_620_ >= anLocalInt_644_ && (argument_620_ < (anLocalInt_644_ + anLocalInts_629_[anLocalInt_643_]))) {
                            int anLocalInt_645_ = (argument_620_ + (anLocalInt_642_ * this.width));
                            int anLocalInt_646_ = (this.pixels[anLocalInt_645_]);
                            int anLocalInt_647_ = argument_624_ + anLocalInt_646_;
                            int anLocalInt_648_ = ((argument_624_ & 0xff00ff) + (anLocalInt_646_ & 0xff00ff));
                            anLocalInt_646_ = ((anLocalInt_648_ & 0x1000100) + (anLocalInt_647_ - anLocalInt_648_ & 0x10000));
                            this.pixels[anLocalInt_645_] = (anLocalInt_647_ - anLocalInt_646_ | anLocalInt_646_ - (anLocalInt_646_ >>> 8));
                        }
                    }
                    argument_621_ += anLocalInt_631_;
                }
                return;
            }
            throw new IllegalArgumentException();
        }
        argument_620_ <<= 16;
        argument_620_ += 32768;
        argument_622_ <<= 16;
        int anLocalInt_649_ = (int) Math.floor((double) argument_622_ / (double) argument_623_ + 0.5);
        argument_623_ += argument_621_;
        if (argument_621_ < anLocalInt) {
            argument_620_ += anLocalInt_649_ * (anLocalInt - argument_621_);
            argument_621_ = anLocalInt;
        }
        if (argument_623_ >= anLocalInt_630_)
            argument_623_ = anLocalInt_630_ - 1;
        int anLocalInt_650_ = argument_624_ >>> 24;
        if (argument_625_ == 0 || argument_625_ == 1 && anLocalInt_650_ == 255) {
            for (/**/; argument_621_ <= argument_623_; argument_621_++) {
                int anLocalInt_651_ = argument_620_ >> 16;
                int anLocalInt_652_ = argument_621_ - argument_628_;
                int anLocalInt_653_ = argument_627_ + anLocalInts[anLocalInt_652_];
                if (anLocalInt_651_ >= this.clipLeft && anLocalInt_651_ < this.clipRight && anLocalInt_651_ >= anLocalInt_653_ && (anLocalInt_651_ < anLocalInt_653_ + anLocalInts_629_[anLocalInt_652_]))
                    this.pixels[(anLocalInt_651_ + argument_621_ * this.width)] = argument_624_;
                argument_620_ += anLocalInt_649_;
            }
        } else if (argument_625_ == 1) {
            argument_624_ = (((argument_624_ & 0xff00ff) * anLocalInt_650_ >> 8 & 0xff00ff) + ((argument_624_ & 0xff00) * anLocalInt_650_ >> 8 & 0xff00) + (anLocalInt_650_ << 24));
            int anLocalInt_654_ = 256 - anLocalInt_650_;
            for (/**/; argument_621_ <= argument_623_; argument_621_++) {
                int anLocalInt_655_ = argument_620_ >> 16;
                int anLocalInt_656_ = argument_621_ - argument_628_;
                int anLocalInt_657_ = argument_627_ + anLocalInts[anLocalInt_656_];
                if (anLocalInt_655_ >= this.clipLeft && anLocalInt_655_ < this.clipRight && anLocalInt_655_ >= anLocalInt_657_ && (anLocalInt_655_ < (anLocalInt_657_ + anLocalInts_629_[anLocalInt_656_]))) {
                    int anLocalInt_658_ = (anLocalInt_655_ + argument_621_ * this.width);
                    int anLocalInt_659_ = (this.pixels[anLocalInt_658_]);
                    anLocalInt_659_ = (((anLocalInt_659_ & 0xff00ff) * anLocalInt_654_ >> 8 & 0xff00ff) + ((anLocalInt_659_ & 0xff00) * anLocalInt_654_ >> 8 & 0xff00));
                    this.pixels[(anLocalInt_655_ + argument_621_ * this.width)] = argument_624_ + anLocalInt_659_;
                }
                argument_620_ += anLocalInt_649_;
            }
        } else if (argument_625_ == 2) {
            for (/**/; argument_621_ <= argument_623_; argument_621_++) {
                int anLocalInt_660_ = argument_620_ >> 16;
                int anLocalInt_661_ = argument_621_ - argument_628_;
                int anLocalInt_662_ = argument_627_ + anLocalInts[anLocalInt_661_];
                if (anLocalInt_660_ >= this.clipLeft && anLocalInt_660_ < this.clipRight && anLocalInt_660_ >= anLocalInt_662_ && (anLocalInt_660_ < (anLocalInt_662_ + anLocalInts_629_[anLocalInt_661_]))) {
                    int anLocalInt_663_ = (anLocalInt_660_ + argument_621_ * this.width);
                    int anLocalInt_664_ = (this.pixels[anLocalInt_663_]);
                    int anLocalInt_665_ = argument_624_ + anLocalInt_664_;
                    int anLocalInt_666_ = ((argument_624_ & 0xff00ff) + (anLocalInt_664_ & 0xff00ff));
                    anLocalInt_664_ = ((anLocalInt_666_ & 0x1000100) + (anLocalInt_665_ - anLocalInt_666_ & 0x10000));
                    this.pixels[anLocalInt_663_] = (anLocalInt_665_ - anLocalInt_664_ | anLocalInt_664_ - (anLocalInt_664_ >>> 8));
                }
                argument_620_ += anLocalInt_649_;
            }
        } else
            throw new IllegalArgumentException();
    }

    final Class293 method2112(Runnable argument_667_) {
        for (int anLocalInt = 0; anLocalInt < this.anInt4659; anLocalInt++) {
            if (aClass293Array4658[anLocalInt].aRunnable2411 == argument_667_)
                return aClass293Array4658[anLocalInt];
        }
        return null;
    }

    final boolean method2113(int argument_668_) {
        return this.textureSource.method9(true, argument_668_);
    }

    final Class350 method2015() {
        Class293 class293 = method2112(Thread.currentThread());
        return class293.aClass350_Sub1_2414;
    }

    final Class368 method2082(int[] argument_669_, int argument_670_, int argument_671_, int argument_672_, int argument_673_, boolean argument_674_) {
        boolean anLocalBoolean = false;
        int anLocalInt = argument_670_;
        while_118_:
        for (int anLocalInt_675_ = 0; anLocalInt_675_ < argument_673_; anLocalInt_675_++) {
            for (int anLocalInt_676_ = 0; anLocalInt_676_ < argument_672_; anLocalInt_676_++) {
                int anLocalInt_677_ = argument_669_[anLocalInt++] >>> 24;
                if (anLocalInt_677_ != 0 && anLocalInt_677_ != 255) {
                    anLocalBoolean = true;
                    break while_118_;
                }
            }
        }
        if (anLocalBoolean)
            return new Class368_Sub2_Sub2(this, argument_669_, argument_670_, argument_671_, argument_672_, argument_673_, argument_674_);
        return new java_sprite_24(this, argument_669_, argument_670_, argument_671_, argument_672_, argument_673_, argument_674_);
    }

    final void X(int argument_678_) {
        /* empty */
    }

    final void method2059(float argument_679_, float argument_680_, float argument_681_) {
        /* empty */
    }

    final Interface15 method2097(Interface21 argument_682_, Interface17 argument_683_) {
        return new Class364(this, (Class368) argument_682_, (Class159) argument_683_);
    }

    final void method2114(int argument_684_, int argument_685_, int argument_686_, int argument_687_, int argument_688_, int argument_689_, int argument_690_, int argument_691_, int argument_692_, int argument_693_) {
        if (argument_687_ != 0 && argument_688_ != 0) {
            if (argument_690_ != 65535 && !(this.textureSource.getDescriptor(argument_690_, true).aBoolean836)) {
                if (anInt4671 != argument_690_) {
                    Class368 class368 = ((Class368) aClass149_4636.get((long) argument_690_));
                    if (class368 == null) {
                        int[] anLocalInts = method2108(argument_690_);
                        if (anLocalInts == null)
                            return;
                        int anLocalInt = (method2111(argument_690_) ? 64 : this.anInt4655);
                        class368 = this.method2047(anLocalInt, anLocalInts, 0, anLocalInt, anLocalInt);
                        aClass149_4636.put(class368, (long) argument_690_);
                    }
                    anInt4671 = argument_690_;
                    aClass368_4670 = class368;
                }
                ((Class368_Sub2) aClass368_4670).method4032(argument_684_ - argument_687_, argument_685_ - argument_688_, argument_686_, argument_687_ << 1, argument_688_ << 1, argument_692_, argument_691_, argument_693_, 1);
            } else
                method2101(argument_684_, argument_685_, argument_686_, argument_687_, argument_691_, argument_693_);
        }
    }

    final void getScissor(int[] argument_694_) {
        argument_694_[0] = this.clipLeft;
        argument_694_[1] = this.clipTop;
        argument_694_[2] = this.clipRight;
        argument_694_[3] = this.clipBottom;
    }

    final boolean method2034() {
        return false;
    }

    final void method2095(int argument_695_, int argument_696_, int argument_697_, int argument_698_, int argument_699_, int argument_700_, int argument_701_) {
        Class293 class293 = method2112(Thread.currentThread());
        Class89 class89 = class293.aClass89_2448;
        int anLocalInt = argument_697_ - argument_695_;
        int anLocalInt_702_ = argument_698_ - argument_696_;
        int anLocalInt_703_ = anLocalInt >= 0 ? anLocalInt : -anLocalInt;
        int anLocalInt_704_ = anLocalInt_702_ >= 0 ? anLocalInt_702_ : -anLocalInt_702_;
        int anLocalInt_705_ = anLocalInt_703_;
        if (anLocalInt_705_ < anLocalInt_704_)
            anLocalInt_705_ = anLocalInt_704_;
        if (anLocalInt_705_ != 0) {
            int anLocalInt_706_ = (anLocalInt << 16) / anLocalInt_705_;
            int anLocalInt_707_ = (anLocalInt_702_ << 16) / anLocalInt_705_;
            anLocalInt += anLocalInt_706_ >> 16;
            anLocalInt_702_ += anLocalInt_707_ >> 16;
            if (anLocalInt_707_ <= anLocalInt_706_)
                anLocalInt_706_ = -anLocalInt_706_;
            else
                anLocalInt_707_ = -anLocalInt_707_;
            int anLocalInt_708_ = argument_700_ * anLocalInt_707_ >> 17;
            int anLocalInt_709_ = argument_700_ * anLocalInt_707_ + 1 >> 17;
            int anLocalInt_710_ = argument_700_ * anLocalInt_706_ >> 17;
            int anLocalInt_711_ = argument_700_ * anLocalInt_706_ + 1 >> 17;
            argument_695_ -= class89.method1657();
            argument_696_ -= class89.method1658();
            int anLocalInt_712_ = argument_695_ + anLocalInt_708_;
            int anLocalInt_713_ = argument_695_ - anLocalInt_709_;
            int anLocalInt_714_ = argument_695_ + anLocalInt - anLocalInt_709_;
            int anLocalInt_715_ = argument_695_ + anLocalInt + anLocalInt_708_;
            int anLocalInt_716_ = argument_696_ + anLocalInt_710_;
            int anLocalInt_717_ = argument_696_ - anLocalInt_711_;
            int anLocalInt_718_ = argument_696_ + anLocalInt_702_ - anLocalInt_711_;
            int anLocalInt_719_ = argument_696_ + anLocalInt_702_ + anLocalInt_710_;
            if (argument_701_ == 0)
                class89.anInt646 = 0;
            else if (argument_701_ == 1)
                class89.anInt646 = 255 - (argument_699_ >>> 24);
            else
                throw new IllegalArgumentException();
            C(false);
            class89.aBoolean661 = (anLocalInt_712_ < 0 || anLocalInt_712_ > class89.anInt650 || anLocalInt_713_ < 0 || anLocalInt_713_ > class89.anInt650 || anLocalInt_714_ < 0 || anLocalInt_714_ > class89.anInt650);
            class89.method1660((float) anLocalInt_716_, (float) anLocalInt_717_, (float) anLocalInt_718_, (float) anLocalInt_712_, (float) anLocalInt_713_, (float) anLocalInt_714_, 100.0F, 100.0F, 100.0F, argument_699_);
            class89.aBoolean661 = (anLocalInt_712_ < 0 || anLocalInt_712_ > class89.anInt650 || anLocalInt_714_ < 0 || anLocalInt_714_ > class89.anInt650 || anLocalInt_715_ < 0 || anLocalInt_715_ > class89.anInt650);
            class89.method1660((float) anLocalInt_716_, (float) anLocalInt_718_, (float) anLocalInt_719_, (float) anLocalInt_712_, (float) anLocalInt_714_, (float) anLocalInt_715_, 100.0F, 100.0F, 100.0F, argument_699_);
            C(true);
        }
    }
}
