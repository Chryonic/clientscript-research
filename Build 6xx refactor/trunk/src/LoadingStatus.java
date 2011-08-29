/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LoadingStatus {
    int finishedPercentage;
    boolean showPercentageString;
    MultilanguageString busyStatusText;
    private int index;
    boolean usePercentageRange;
    static LoadingStatus aLoadingStatus_229 = new LoadingStatus(0, MultilanguageString.CHECKING_FOR_UPDATES, MultilanguageString.CHECKING_FOR_UPDATES, 0, 1);
    int startPercentage;
    static LoadingStatus aLoadingStatus_231 = new LoadingStatus(1, MultilanguageString.CHECKING_FOR_UPDATES, 2);
    MultilanguageString finishedStatusText;
    static LoadingStatus aLoadingStatus_233 = new LoadingStatus(2, MultilanguageString.CHECKING_FOR_UPDATES,
            MultilanguageString.CHECKING_FOR_UPDATES, 2, 3);
    static LoadingStatus aLoadingStatus_234 = new LoadingStatus(3, MultilanguageString.CHECKING_FOR_UPDATES, 3);
    static LoadingStatus aLoadingStatus_235 = new LoadingStatus(4, MultilanguageString.CHECKING_FOR_UPDATES,
            MultilanguageString.CHECKING_FOR_UPDATES, 3, 4);
    static LoadingStatus aLoadingStatus_236 = new LoadingStatus(5, MultilanguageString.CHECKING_FOR_UPDATES, 4);
    static LoadingStatus aLoadingStatus_237 = new LoadingStatus(6, MultilanguageString.CHECKING_FOR_UPDATES, 4);
    static LoadingStatus aLoadingStatus_238 = new LoadingStatus(7, MultilanguageString.CHECKING_FOR_UPDATES,
            MultilanguageString.CHECKING_FOR_UPDATES, 4, 5);
    static LoadingStatus aLoadingStatus_239
            = new LoadingStatus(8, MultilanguageString.CHECKING_FOR_UPDATES, MultilanguageString.CHECKING_FOR_UPDATES, 5,
            98, true, true);
    static LoadingStatus aLoadingStatus_240 = new LoadingStatus(9, MultilanguageString.CHECKING_FOR_UPDATES, 99);
    static LoadingStatus aLoadingStatus_241
            = new LoadingStatus(10, MultilanguageString.CHECKING_FOR_UPDATES, 100);
    static LoadingStatus aLoadingStatus_242
            = new LoadingStatus(11, MultilanguageString.FETCHING_UPDATES, MultilanguageString.FETCHING_UPDATES, 0,
            92, true, true);
    static LoadingStatus aLoadingStatus_243 = new LoadingStatus(12, MultilanguageString.FETCHING_UPDATES,
            MultilanguageString.FETCHING_UPDATES, 92, 92);
    private static LoadingStatus aLoadingStatus_244
            = new LoadingStatus(13, MultilanguageString.FETCHING_UPDATES, MultilanguageString.FETCHING_UPDATES, 92,
            93);
    static LoadingStatus aLoadingStatus_245 = new LoadingStatus(14, MultilanguageString.FETCHING_UPDATES,
            MultilanguageString.FETCHING_UPDATES, 94, 95);
    static LoadingStatus aLoadingStatus_246 = new LoadingStatus(15, MultilanguageString.FETCHING_UPDATES,
            MultilanguageString.FETCHING_UPDATES, 96, 97);
    static LoadingStatus aLoadingStatus_247 = new LoadingStatus(16, MultilanguageString.FETCHING_UPDATES, 97);
    static LoadingStatus aLoadingStatus_248 = new LoadingStatus(17, MultilanguageString.FETCHING_UPDATES, 97);
    static LoadingStatus aLoadingStatus_249 = new LoadingStatus(18, MultilanguageString.FETCHING_UPDATES, 100);
    static LoadingStatus aLoadingStatus_250 = new LoadingStatus(19, MultilanguageString.FETCHING_UPDATES, 100);
    static LoadingStatus aLoadingStatus_251 = new LoadingStatus(20, MultilanguageString.FETCHING_UPDATES, 100);

    static final void method373(int argument) {
        int anLocalInt = Class311.anInt2591 * 512 + 256;
        int anLocalInt_0_ = InputStream_Sub2.anInt38 * 512 + 256;
        int anLocalInt_1_
                = (Node_Sub31_Sub36.method993(Class176.anInt1308, anLocalInt,
                -12040, anLocalInt_0_)
                - Class299.anInt2495);
        if (Class353_Sub5.anInt5499 < 100) {
            if (anLocalInt > Class287.anInt2299) {
                Class287.anInt2299
                        += (Class317.anInt2623
                        + (Class353_Sub5.anInt5499
                        * (anLocalInt - Class287.anInt2299) / 1000));
                if (anLocalInt < Class287.anInt2299)
                    Class287.anInt2299 = anLocalInt;
            }
            if (Class287.anInt2299 > anLocalInt) {
                Class287.anInt2299 -= (Class353_Sub5.anInt5499
                        * (Class287.anInt2299 - anLocalInt)
                        / 1000) + Class317.anInt2623;
                if (anLocalInt > Class287.anInt2299)
                    Class287.anInt2299 = anLocalInt;
            }
            if (anLocalInt_1_ > Class2_Sub2.anInt3763) {
                Class2_Sub2.anInt3763
                        += ((Class353_Sub5.anInt5499
                        * (-Class2_Sub2.anInt3763 + anLocalInt_1_) / 1000)
                        + Class317.anInt2623);
                if (anLocalInt_1_ < Class2_Sub2.anInt3763)
                    Class2_Sub2.anInt3763 = anLocalInt_1_;
            }
            if (Node_Sub31_Sub30.anInt5987 < anLocalInt_0_) {
                Node_Sub31_Sub30.anInt5987
                        += Class317.anInt2623 + ((anLocalInt_0_
                        - Node_Sub31_Sub30.anInt5987)
                        * Class353_Sub5.anInt5499 / 1000);
                if (Node_Sub31_Sub30.anInt5987 > anLocalInt_0_)
                    Node_Sub31_Sub30.anInt5987 = anLocalInt_0_;
            }
            if (anLocalInt_1_ < Class2_Sub2.anInt3763) {
                Class2_Sub2.anInt3763
                        -= Class317.anInt2623 + ((Class2_Sub2.anInt3763
                        - anLocalInt_1_)
                        * Class353_Sub5.anInt5499 / 1000);
                if (Class2_Sub2.anInt3763 < anLocalInt_1_)
                    Class2_Sub2.anInt3763 = anLocalInt_1_;
            }
            if (anLocalInt_0_ < Node_Sub31_Sub30.anInt5987) {
                Node_Sub31_Sub30.anInt5987
                        -= (Class353_Sub5.anInt5499
                        * (-anLocalInt_0_ + Node_Sub31_Sub30.anInt5987)
                        / 1000) + Class317.anInt2623;
                if (Node_Sub31_Sub30.anInt5987 < anLocalInt_0_)
                    Node_Sub31_Sub30.anInt5987 = anLocalInt_0_;
            }
        } else {
            Class287.anInt2299 = Class311.anInt2591 * 512 + 256;
            Node_Sub31_Sub30.anInt5987
                    = InputStream_Sub2.anInt38 * 512 + 256;
            Class2_Sub2.anInt3763
                    = (Node_Sub31_Sub36.method993(Class176.anInt1308,
                    Class287.anInt2299, -12040,
                    Node_Sub31_Sub30.anInt5987)
                    - Class299.anInt2495);
        }
        anLocalInt = Class120.anInt980 * 512 + 256;
        anLocalInt_0_ = Class298.anInt2475 * 512 + 256;
        anLocalInt_1_
                = (Node_Sub31_Sub36.method993(Class176.anInt1308, anLocalInt,
                -12040, anLocalInt_0_)
                - Class182.anInt1378);
        int anLocalInt_2_ = anLocalInt - Class287.anInt2299;
        int anLocalInt_3_ = anLocalInt_1_ - Class2_Sub2.anInt3763;
        int anLocalInt_4_ = anLocalInt_0_ - Node_Sub31_Sub30.anInt5987;
        int anLocalInt_5_
                = (int) Math.sqrt((double) (anLocalInt_4_ * anLocalInt_4_
                + anLocalInt_2_ * anLocalInt_2_));
        int anLocalInt_6_
                = (int) (Math.atan2((double) anLocalInt_3_, (double) anLocalInt_5_)
                * 2607.5945876176133) & 0x3fff;
        int anLocalInt_7_
                = (int) (Math.atan2((double) anLocalInt_2_, (double) anLocalInt_4_)
                * -2607.5945876176133) & 0x3fff;
        if (anLocalInt_6_ < 1024)
            anLocalInt_6_ = 1024;
        if (anLocalInt_6_ > 3072)
            anLocalInt_6_ = 3072;
        if (Class293.anInt2404 < anLocalInt_6_) {
            Class293.anInt2404
                    += Class391.anInt3291 + (anLocalInt_6_ - Class293.anInt2404
                    >> 3) * Class47.anInt336 / 1000 << 3;
            if (Class293.anInt2404 > anLocalInt_6_)
                Class293.anInt2404 = anLocalInt_6_;
        }
        if (Class293.anInt2404 > anLocalInt_6_) {
            Class293.anInt2404
                    -= (Class391.anInt3291
                    + Class47.anInt336 * (Class293.anInt2404 - anLocalInt_6_
                    >> 3) / 1000) << 3;
            if (anLocalInt_6_ > Class293.anInt2404)
                Class293.anInt2404 = anLocalInt_6_;
        }
        int anLocalInt_8_ = -Node_Sub47_Sub3.anInt6167 + anLocalInt_7_;
        if (anLocalInt_8_ > 8192)
            anLocalInt_8_ -= 16384;
        if (anLocalInt_8_ < -8192)
            anLocalInt_8_ += 16384;
        anLocalInt_8_ >>= 3;
        if (anLocalInt_8_ > 0) {
            Node_Sub47_Sub3.anInt6167
                    += (Class47.anInt336 * anLocalInt_8_ / 1000
                    + Class391.anInt3291) << 3;
            Node_Sub47_Sub3.anInt6167 &= 0x3fff;
        }
        if (anLocalInt_8_ < 0) {
            Node_Sub47_Sub3.anInt6167
                    -= (-anLocalInt_8_ * Class47.anInt336 / 1000
                    + Class391.anInt3291) << 3;
            Node_Sub47_Sub3.anInt6167 &= 0x3fff;
        }
        int anLocalInt_9_ = -Node_Sub47_Sub3.anInt6167 + anLocalInt_7_;
        if (anLocalInt_9_ > 8192)
            anLocalInt_9_ -= 16384;
        if (anLocalInt_9_ < -8192)
            anLocalInt_9_ += 16384;
        Class361.anInt3055 = 0;
        if (anLocalInt_9_ < 0 && anLocalInt_8_ > 0
                || anLocalInt_9_ > 0 && anLocalInt_8_ < 0)
            Node_Sub47_Sub3.anInt6167 = anLocalInt_7_;
    }

    static final String method374(byte[] argument, int argument_10_,
                                  int argument_11_, int argument_12_) {
        char[] anLocalChars = new char[argument_10_];
        int anLocalInt = 0;
        int anLocalInt_13_ = argument_11_;
        int anLocalInt_14_ = argument_10_ + argument_11_;
        while (anLocalInt_13_ < anLocalInt_14_) {
            int anLocalInt_15_ = argument[anLocalInt_13_++] & 0xff;
            int anLocalInt_16_;
            if (anLocalInt_15_ < 128) {
                if (anLocalInt_15_ == 0)
                    anLocalInt_16_ = 65533;
                else
                    anLocalInt_16_ = anLocalInt_15_;
            } else if (anLocalInt_15_ < 192)
                anLocalInt_16_ = 65533;
            else if (anLocalInt_15_ < 224) {
                if (anLocalInt_13_ >= anLocalInt_14_
                        || (argument[anLocalInt_13_] & 0xc0) != 128)
                    anLocalInt_16_ = 65533;
                else {
                    anLocalInt_16_ = ((anLocalInt_15_ & 0x1f) << 6
                            | argument[anLocalInt_13_++] & 0x3f);
                    if (anLocalInt_16_ < 128)
                        anLocalInt_16_ = 65533;
                }
            } else if (anLocalInt_15_ < 240) {
                if (anLocalInt_14_ > anLocalInt_13_ + 1
                        && (argument[anLocalInt_13_] & 0xc0) == 128
                        && (argument[anLocalInt_13_ + 1] & 0xc0) == 128) {
                    anLocalInt_16_ = (argument[anLocalInt_13_++] << 6 & 0xfc0
                            | (anLocalInt_15_ & 0xf) << 12
                            | argument[anLocalInt_13_++] & 0x3f);
                    if (anLocalInt_16_ < 2048)
                        anLocalInt_16_ = 65533;
                } else
                    anLocalInt_16_ = 65533;
            } else if (anLocalInt_15_ >= 248)
                anLocalInt_16_ = 65533;
            else if (anLocalInt_13_ + 2 >= anLocalInt_14_
                    || (argument[anLocalInt_13_] & 0xc0) != 128
                    || (argument[anLocalInt_13_ + 1] & 0xc0) != 128
                    || (argument[anLocalInt_13_ + 2] & 0xc0) != 128)
                anLocalInt_16_ = 65533;
            else {
                anLocalInt_16_ = (argument[anLocalInt_13_++] << 12 & 0x3f000
                        | anLocalInt_15_ << 18 & 0x1c0000
                        | (argument[anLocalInt_13_++] & 0x3f) << 6
                        | argument[anLocalInt_13_++] & 0x3f);
                if (anLocalInt_16_ < 65536 || anLocalInt_16_ > 1114111)
                    anLocalInt_16_ = 65533;
                else
                    anLocalInt_16_ = 65533;
            }
            anLocalChars[anLocalInt++] = (char) anLocalInt_16_;
        }
        return new String(anLocalChars, 0, anLocalInt);
    }

    final int getIndex() {
        return index;
    }

    private LoadingStatus(int argument_18_, MultilanguageString argument_19_,
                          int argument_20_) {
        this(argument_18_, argument_19_, argument_19_, argument_20_,
                argument_20_, true, false);
    }

    public static void cleanStatics() {
        aLoadingStatus_247 = null;
        aLoadingStatus_229 = null;
        aLoadingStatus_245 = null;
        aLoadingStatus_239 = null;
        aLoadingStatus_243 = null;
        aLoadingStatus_248 = null;
        aLoadingStatus_240 = null;
        client.selectedGame = null;
        aLoadingStatus_250 = null;
        aLoadingStatus_249 = null;
        aLoadingStatus_237 = null;
        aLoadingStatus_251 = null;
        aLoadingStatus_246 = null;
        aLoadingStatus_236 = null;
        aLoadingStatus_234 = null;
        aLoadingStatus_238 = null;
        aLoadingStatus_235 = null;
        aLoadingStatus_231 = null;
        aLoadingStatus_241 = null;
        aLoadingStatus_244 = null;
        aLoadingStatus_233 = null;
        aLoadingStatus_242 = null;
    }

    private LoadingStatus(int index, MultilanguageString busyStatusText,
                          MultilanguageString finishedStatusText, int startPercentage,
                          int finishedPercentage) {
        this(index, busyStatusText, finishedStatusText, startPercentage, finishedPercentage, true, false);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static final LoadingStatus[] generateArray() {
        return (new LoadingStatus[]
                {aLoadingStatus_229, aLoadingStatus_231, aLoadingStatus_233, aLoadingStatus_234,
                        aLoadingStatus_235, aLoadingStatus_236, aLoadingStatus_237, aLoadingStatus_238,
                        aLoadingStatus_239, aLoadingStatus_240, aLoadingStatus_241, aLoadingStatus_242,
                        aLoadingStatus_243, aLoadingStatus_244, aLoadingStatus_245, aLoadingStatus_246,
                        aLoadingStatus_247, aLoadingStatus_248, aLoadingStatus_249, aLoadingStatus_250,
                        aLoadingStatus_251});
    }

    private LoadingStatus(int index, MultilanguageString busyStatusText,
                          MultilanguageString finishedStatusText, int startPercentage, int finishedPercentage,
                          boolean argument_31_, boolean argument_32_) {
        this.busyStatusText = busyStatusText;
        this.startPercentage = startPercentage;
        this.finishedPercentage = finishedPercentage;
        this.showPercentageString = argument_31_;
        this.index = index;
        this.finishedStatusText = finishedStatusText;
        this.usePercentageRange = argument_32_;
    }
}
