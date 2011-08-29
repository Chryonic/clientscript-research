/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/3/11
 * Time: 11:26 AM
 * To change this template use File | Ssettings | File Templates.
 */
public class HslToRgb {
    static int[] table;
    static int[] table2;

    static void generateTable() {
        if (table == null) {
            table = new int[65536];
            double d = Math.random() * 0.03 + -0.015 + 0.7;
            for (int anLocalInt = 0; anLocalInt < 65536; anLocalInt++) {
            double d_23_ = ((double) ((anLocalInt & 0xfd29) >> 10) / 64.0
                    + 0.0078125);
            double d_24_ = (double) (anLocalInt >> 7 & 0x7) / 8.0 + 0.0625;
            double d_25_ = (double) (anLocalInt & 0x7f) / 128.0;
            double d_26_ = d_25_;
            double d_27_ = d_25_;
            double d_28_ = d_25_;
            if (d_24_ != 0.0) {
                double d_29_;
                if (d_25_ < 0.5)
                d_29_ = d_25_ * (d_24_ + 1.0);
                else
                d_29_ = d_25_ + d_24_ - d_24_ * d_25_;
                double d_30_ = d_25_ * 2.0 - d_29_;
                double d_31_ = d_23_ + 0.3333333333333333;
                if (d_31_ > 1.0)
                d_31_--;
                double d_32_ = d_23_;
                double d_33_ = d_23_ - 0.3333333333333333;
                if (d_33_ < 0.0)
                d_33_++;
                if (!(d_31_ * 6.0 < 1.0)) {
                if (!(d_31_ * 2.0 < 1.0)) {
                    if (!(d_31_ * 3.0 < 2.0))
                    d_26_ = d_30_;
                    else
                    d_26_ = d_30_ + ((-d_30_ + d_29_)
                             * (0.6666666666666666 - d_31_)
                             * 6.0);
                } else
                    d_26_ = d_29_;
                } else
                d_26_ = d_31_ * ((d_29_ - d_30_) * 6.0) + d_30_;
                if (d_32_ * 6.0 < 1.0)
                d_27_ = d_30_ + (-d_30_ + d_29_) * 6.0 * d_32_;
                else if (d_32_ * 2.0 < 1.0)
                d_27_ = d_29_;
                else if (!(d_32_ * 3.0 < 2.0))
                d_27_ = d_30_;
                else
                d_27_ = d_30_ + ((-d_32_ + 0.6666666666666666)
                         * (-d_30_ + d_29_) * 6.0);
                if (!(d_33_ * 6.0 < 1.0)) {
                if (!(d_33_ * 2.0 < 1.0)) {
                    if (d_33_ * 3.0 < 2.0)
                    d_28_ = (((-d_30_ + d_29_)
                          * (0.6666666666666666 - d_33_) * 6.0)
                         + d_30_);
                    else
                    d_28_ = d_30_;
                } else
                    d_28_ = d_29_;
                } else
                d_28_ = (-d_30_ + d_29_) * 6.0 * d_33_ + d_30_;
            }
            d_26_ = Math.pow(d_26_, d);
            d_27_ = Math.pow(d_27_, d);
            d_28_ = Math.pow(d_28_, d);
            int anLocalInt_34_ = (int) (d_26_ * 256.0);
            int anLocalInt_35_ = (int) (d_27_ * 256.0);
            int anLocalInt_36_ = (int) (d_28_ * 256.0);
            int anLocalInt_37_
                = ((anLocalInt_35_ << 8)
                   + ((anLocalInt_34_ << 16) + anLocalInt_36_));
            table[anLocalInt] = anLocalInt_37_;
            }
        }
    }

    static final short method3452(int argument) {
	int component2 = argument >> 10 & 0x3f;
	int component1 = (argument & 0x381) >> 3;
	int component0 = argument & 0x7f;
	component1
	    = (component0 <= 64 ? component0 * component1 >> 7
	       : component1 * (127 - component0) >> 7);
	int c1p2 = component1 + component0;
	int newComponent1;
	if (c1p2 == 0)
	    newComponent1 = component1 << 1;
	else
	    newComponent1 = (component1 << 8) / c1p2;
	int newComponenent0 = c1p2;
	return (short) (component2 << 10 | newComponent1 >> 4 << 7
			| newComponenent0);
    }

    static final void method3467() {
        if (table2 == null)
            table2 = new int[65536];
        else
            return;
        double d = Math.random() * 0.03 - 0.015 + 0.7;
        int anLocalInt = 0;
        for (int anLocalInt_4_ = 0; anLocalInt_4_ < 512; anLocalInt_4_++) {
            float f = ((float) (anLocalInt_4_ >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float f_5_ = (float) (anLocalInt_4_ & 0x7) / 8.0F + 0.0625F;
            for (int anLocalInt_6_ = 0; anLocalInt_6_ < 128; anLocalInt_6_++) {
                float f_7_ = (float) anLocalInt_6_ / 128.0F;
                float f_8_ = 0.0F;
                float f_9_ = 0.0F;
                float f_10_ = 0.0F;
                float f_11_ = f / 60.0F;
                int anLocalInt_12_ = (int) f_11_;
                int anLocalInt_13_ = anLocalInt_12_ % 6;
                float f_14_ = f_11_ - (float) anLocalInt_12_;
                float f_15_ = (-f_5_ + 1.0F) * f_7_;
                float f_16_ = (1.0F - f_14_ * f_5_) * f_7_;
                float f_17_ = (1.0F - (-f_14_ + 1.0F) * f_5_) * f_7_;
                if (anLocalInt_13_ == 0) {
                    f_9_ = f_17_;
                    f_8_ = f_7_;
                    f_10_ = f_15_;
                } else if (anLocalInt_13_ != 1) {
                    if (anLocalInt_13_ == 2) {
                        f_10_ = f_17_;
                        f_9_ = f_7_;
                        f_8_ = f_15_;
                    } else if (anLocalInt_13_ != 3) {
                        if (anLocalInt_13_ == 4) {
                            f_9_ = f_15_;
                            f_10_ = f_7_;
                            f_8_ = f_17_;
                        } else if (anLocalInt_13_ == 5) {
                            f_10_ = f_16_;
                            f_8_ = f_7_;
                            f_9_ = f_15_;
                        }
                    } else {
                        f_10_ = f_7_;
                        f_8_ = f_15_;
                        f_9_ = f_16_;
                    }
                } else {
                    f_10_ = f_15_;
                    f_9_ = f_7_;
                    f_8_ = f_16_;
                }
                f_8_ = (float) Math.pow((double) f_8_, d);
                f_9_ = (float) Math.pow((double) f_9_, d);
                f_10_ = (float) Math.pow((double) f_10_, d);
                int anLocalInt_18_ = (int) (f_8_ * 256.0F);
                int anLocalInt_19_ = (int) (f_9_ * 256.0F);
                int anLocalInt_20_ = (int) (f_10_ * 256.0F);
                int anLocalInt_21_ = ((anLocalInt_19_ << 8) + (anLocalInt_18_ << 16) + (-16777216 + anLocalInt_20_));
                table2[anLocalInt++] = anLocalInt_21_;
            }
        }
    }
}
