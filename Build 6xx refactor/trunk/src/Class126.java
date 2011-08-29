/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class126 {
    private short[] aShortArray1020;
    private int anInt1021;
    byte aByte1022 = 0;
    private short[] aShortArray1023;
    private int anInt1024;
    private int anInt1025;
    private short[] aShortArray1027;
    private int anInt1028;
    int anInt1029;
    private int anInt1030;
    private int anInt1031;
    static int anInt1032 = 0;
    Class225 aClass225_1033;
    int anInt1034;
    boolean aBoolean1035;
    private short[] aShortArray1036;
    private int anInt1037;

    private final void method2404(Packet argument_0_, byte argument_1_,
                                  int argument_2_) {
        int anLocalInt = -39 / ((-20 - argument_1_) / 52);
        if (argument_2_ == 1)
            anInt1030 = argument_0_.g2();
        else if (argument_2_ != 2) {
            if (argument_2_ == 4)
                anInt1037 = argument_0_.g2();
            else if (argument_2_ == 5)
                anInt1025 = argument_0_.g2();
            else if (argument_2_ == 6)
                anInt1028 = argument_0_.g2();
            else if (argument_2_ == 7)
                anInt1021 = argument_0_.g1();
            else if (argument_2_ == 8)
                anInt1024 = argument_0_.g1();
            else if (argument_2_ != 9) {
                if (argument_2_ == 10)
                    ((Class126) this).aBoolean1035 = true;
                else if (argument_2_ != 11) {
                    if (argument_2_ != 12) {
                        if (argument_2_ != 13) {
                            if (argument_2_ != 14) {
                                if (argument_2_ != 15) {
                                    if (argument_2_ != 16) {
                                        if (argument_2_ == 40) {
                                            int anLocalInt_3_
                                                    = argument_0_
                                                    .g1();
                                            aShortArray1036
                                                    = new short[anLocalInt_3_];
                                            aShortArray1027
                                                    = new short[anLocalInt_3_];
                                            for (int anLocalInt_4_ = 0;
                                                 anLocalInt_4_ < anLocalInt_3_;
                                                 anLocalInt_4_++) {
                                                aShortArray1036[anLocalInt_4_]
                                                        = (short) (argument_0_
                                                        .g2
                                                                ());
                                                aShortArray1027[anLocalInt_4_]
                                                        = (short) (argument_0_
                                                        .g2
                                                                ());
                                            }
                                        } else if (argument_2_ == 41) {
                                            int anLocalInt_5_
                                                    = argument_0_
                                                    .g1();
                                            aShortArray1023
                                                    = new short[anLocalInt_5_];
                                            aShortArray1020
                                                    = new short[anLocalInt_5_];
                                            for (int anLocalInt_6_ = 0;
                                                 anLocalInt_5_ > anLocalInt_6_;
                                                 anLocalInt_6_++) {
                                                aShortArray1020[anLocalInt_6_]
                                                        = (short) (argument_0_
                                                        .g2
                                                                ());
                                                aShortArray1023[anLocalInt_6_]
                                                        = (short) (argument_0_
                                                        .g2
                                                                ());
                                            }
                                        }
                                    } else {
                                        ((Class126) this).aByte1022 = (byte) 3;
                                        anInt1031 = argument_0_.g4();
                                    }
                                } else {
                                    ((Class126) this).aByte1022 = (byte) 3;
                                    anInt1031 = argument_0_.g2();
                                }
                            } else {
                                ((Class126) this).aByte1022 = (byte) 2;
                                anInt1031
                                        = argument_0_.g1() * 256;
                            }
                        } else
                            ((Class126) this).aByte1022 = (byte) 5;
                    } else
                        ((Class126) this).aByte1022 = (byte) 4;
                } else
                    ((Class126) this).aByte1022 = (byte) 1;
            } else {
                ((Class126) this).aByte1022 = (byte) 3;
                anInt1031 = 8224;
            }
        } else
            ((Class126) this).anInt1034 = argument_0_.g2();
    }

    final Class167 method2405
            (byte argument_7_, boolean argument_8_, int argument_9_,
             int argument_10_, int argument_11_, int argument_12_,
             int argument_13_, int argument_14_, Class336 argument_15_,
             Class_s argument_16_, int argument_17_, Class_s argument_18_,
             GraphicsToolkit argument_19_) {
        return method2406(-14, argument_15_, argument_18_, argument_12_,
                argument_13_, argument_19_, argument_14_,
                argument_9_, argument_8_, argument_11_, argument_10_,
                (byte) 2, argument_16_, argument_17_);
    }

    private final Class167 method2406
            (int argument_20_, Class336 argument_21_, Class_s argument_22_,
             int argument_23_, int argument_24_, GraphicsToolkit argument_25_,
             int argument_26_, int argument_27_, boolean argument_28_,
             int argument_29_, int argument_30_, byte argument_31_,
             Class_s argument_32_, int argument_33_) {
        int anLocalInt = argument_30_;
        Class367 class367
                = (((Class126) this).anInt1034 == -1 || argument_26_ == -1 ? null
                : argument_21_.method3758(((Class126) this).anInt1034,
                argument_20_ ^ ~0xd));
        argument_28_ = argument_28_ & ((Class126) this).aByte1022 != 0;
        if (argument_20_ != -14)
            return null;
        if (class367 != null)
            anLocalInt |= class367.method3997(false, argument_24_, 27123,
                    argument_26_);
        if (argument_28_)
            anLocalInt
                    = anLocalInt | (((Class126) this).aByte1022 == 3 ? 7 : 2);
        if (anInt1025 != 128)
            anLocalInt |= 0x2;
        if (anInt1037 != 128 || anInt1028 != 0)
            anLocalInt |= 0x5;
        Class167 class167;
        synchronized (((Class225) ((Class126) this).aClass225_1033)
                .aClass149_1636) {
            class167
                    = ((Class167)
                    (((Class225) ((Class126) this).aClass225_1033)
                            .aClass149_1636.get((long) (((Class126) this).anInt1029 |= ((GraphicsToolkit) argument_25_).anInt939 << 29))));
        }
        if (class167 == null
                || argument_25_.andPow(class167.ua(), anLocalInt) != 0) {
            if (class167 != null)
                anLocalInt
                        = argument_25_.or(anLocalInt, class167.ua());
            int anLocalInt_34_ = anLocalInt;
            if (aShortArray1036 != null)
                anLocalInt_34_ |= 0x4000;
            if (aShortArray1020 != null)
                anLocalInt_34_ |= 0x8000;
            Class101 class101
                    = tia_sub_35_Sub1DoublyLinked.method1219(argument_20_ ^ ~0x7c5207fd, (((Class225) (((Class126) this).aClass225_1033)).aJs5Store_1631), anInt1030, 0);
            if (class101 == null)
                return null;
            if (((Class101) class101).anInt820 < 13)
                class101.method1733(17496, 2);
            class167
                    = argument_25_.method2057(class101, anLocalInt_34_,
                    (((Class225)
                            ((Class126) this).aClass225_1033)
                            .anInt1637),
                    anInt1021 + 64, anInt1024 + 850);
            if (aShortArray1036 != null) {
                for (int anLocalInt_35_ = 0;
                     anLocalInt_35_ < aShortArray1036.length; anLocalInt_35_++)
                    class167.ia(aShortArray1036[anLocalInt_35_],
                            aShortArray1027[anLocalInt_35_]);
            }
            if (aShortArray1020 != null) {
                for (int anLocalInt_36_ = 0;
                     anLocalInt_36_ < aShortArray1020.length; anLocalInt_36_++)
                    class167.aa(aShortArray1020[anLocalInt_36_],
                            aShortArray1023[anLocalInt_36_]);
            }
            class167.s(anLocalInt);
            synchronized (((Class225) ((Class126) this).aClass225_1033)
                    .aClass149_1636) {
                ((Class225) ((Class126) this).aClass225_1033)
                        .aClass149_1636.put(class167, (long) (((Class126) this).anInt1029 |= ((GraphicsToolkit) argument_25_).anInt939 << 29));
            }
        }
        Class167 class167_37_
                = (class367 != null
                ? class367.method3996(anLocalInt, argument_24_, argument_29_,
                argument_31_, class167, 256, 0,
                argument_26_)
                : class167.method2651(argument_31_, anLocalInt, true));
        if (anInt1037 != 128 || anInt1025 != 128)
            class167_37_.O(anInt1037, anInt1025, anInt1037);
        if (anInt1028 != 0) {
            if (anInt1028 == 90)
                class167_37_.a(4096);
            if (anInt1028 == 180)
                class167_37_.a(8192);
            if (anInt1028 == 270)
                class167_37_.a(12288);
        }
        if (argument_28_)
            class167_37_.p(((Class126) this).aByte1022, anInt1031,
                    argument_32_, argument_22_, argument_23_,
                    argument_27_, argument_33_);
        class167_37_.s(argument_30_);
        return class167_37_;
    }

    static final void method2407(byte argument) {
        Node_Sub47.anInt4283 = -2;
        DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
        Class264.anInt2046 = -2;
    }

    final void method2408(Packet argument_38_, boolean argument_39_) {
        for (; ; ) {
            int anLocalInt = argument_38_.g1();
            if (anLocalInt == 0)
                break;
            method2404(argument_38_, (byte) -88, anLocalInt);
        }
    }

    static final void method2409(String argument, int argument_40_) {
        if (Class353.aBoolean2953
                && (Node_Sub31_Sub4.anInt5855 & 0x18) != 0) {
            boolean anLocalBoolean = false;
            if (argument_40_ != 24)
                anInt1032 = -47;
            int anLocalInt = Class224.anInt1578;
            int[] anLocalInts = Class242.anIntArray1769;
            for (int anLocalInt_41_ = 0; anLocalInt_41_ < anLocalInt;
                 anLocalInt_41_++) {
                DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
                        = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
                        [anLocalInts[anLocalInt_41_]]);
                if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
                        class104_sub2_sub2_sub5_sub2).aString6836 != null
                        && ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
                        class104_sub2_sub2_sub5_sub2)
                        .aString6836.equalsIgnoreCase(argument)
                        && (((class104_sub2_sub2_sub5_sub2
                        == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
                        && (Node_Sub31_Sub4.anInt5855 & 0x10) != 0)
                        || (class104_sub2_sub2_sub5_sub2 != null
                        && (Node_Sub31_Sub4.anInt5855 & 0x8) != 0))) {
                    Class246.anInt1793++;
                    Node_Sub29 class59_sub29
                            = Class91.method1683((byte) 37,
                            (Node_Sub31_Sub16
                                    .aClass372_5910),
                            Class360.aClass207_3047);
                    ((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129.p4i
                            (Class297.anInt2472);
                    ((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129
                            .p2p128(Statics.anInt1181);
                    ((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129
                            .p2p128(anLocalInts[anLocalInt_41_]);
                    ((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129
                            .p2i_dupl(Statics.anInt4519);
                    ((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129.p1(0);
                    Class251.method3243(class59_sub29, true);
                    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-126), -2, (byte) -26, ((Entity) class104_sub2_sub2_sub5_sub2).pathZ[0], ((Entity) class104_sub2_sub2_sub5_sub2).pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
                    anLocalBoolean = true;
                    break;
                }
            }
            if (!anLocalBoolean)
                Class214.method2986
                        ((byte) 113,
                                (MultilanguageString.UNABLE_TO_FIND.getLocalizedString(
                                        client.language)
                                        + argument),
                                4);
            if (Class353.aBoolean2953)
                Class362.method3964(0);
        }
    }

    final Class167 method2411(int argument_43_, byte argument_44_,
                              GraphicsToolkit argument_45_, int argument_46_,
                              int argument_47_, Class336 argument_48_,
                              int argument_49_, int argument_50_) {
        return method2406(-14, argument_48_, null, 0, argument_47_,
                argument_45_, argument_46_, 0, false, argument_50_,
                argument_49_, argument_44_, null, 0);
    }

    public static void method2412(byte argument) {
        LightingManager.virtualLightMap = null;
    }

    static final int method2413(int argument, String argument_51_,
                                int argument_52_, int argument_53_,
                                boolean argument_54_, byte[] argument_55_) {
        int anLocalInt = -argument_52_ + argument;
        for (int anLocalInt_56_ = 0; anLocalInt_56_ < anLocalInt;
             anLocalInt_56_++) {
            char anLocalChar
                    = argument_51_.charAt(anLocalInt_56_ + argument_52_);
            if (anLocalChar > 0 && anLocalChar < '\u0080'
                    || anLocalChar >= '\u00a0' && anLocalChar <= '\u00ff')
                argument_55_[anLocalInt_56_ + argument_53_]
                        = (byte) anLocalChar;
            else if (anLocalChar != '\u20ac') {
                if (anLocalChar != '\u201a') {
                    if (anLocalChar != '\u0192') {
                        if (anLocalChar != '\u201e') {
                            if (anLocalChar == '\u2026')
                                argument_55_[argument_53_ + anLocalInt_56_]
                                        = (byte) -123;
                            else if (anLocalChar == '\u2020')
                                argument_55_[argument_53_ + anLocalInt_56_]
                                        = (byte) -122;
                            else if (anLocalChar == '\u2021')
                                argument_55_[argument_53_ + anLocalInt_56_]
                                        = (byte) -121;
                            else if (anLocalChar == '\u02c6')
                                argument_55_[anLocalInt_56_ + argument_53_]
                                        = (byte) -120;
                            else if (anLocalChar != '\u2030') {
                                if (anLocalChar != '\u0160') {
                                    if (anLocalChar == '\u2039')
                                        argument_55_[(anLocalInt_56_
                                                + argument_53_)]
                                                = (byte) -117;
                                    else if (anLocalChar == '\u0152')
                                        argument_55_[(anLocalInt_56_
                                                + argument_53_)]
                                                = (byte) -116;
                                    else if (anLocalChar == '\u017d')
                                        argument_55_[(anLocalInt_56_
                                                + argument_53_)]
                                                = (byte) -114;
                                    else if (anLocalChar == '\u2018')
                                        argument_55_[(argument_53_
                                                + anLocalInt_56_)]
                                                = (byte) -111;
                                    else if (anLocalChar == '\u2019')
                                        argument_55_[(anLocalInt_56_
                                                + argument_53_)]
                                                = (byte) -110;
                                    else if (anLocalChar != '\u201c') {
                                        if (anLocalChar != '\u201d') {
                                            if (anLocalChar == '\u2022')
                                                argument_55_[(anLocalInt_56_
                                                        + argument_53_)]
                                                        = (byte) -107;
                                            else if (anLocalChar != '\u2013') {
                                                if (anLocalChar == '\u2014')
                                                    argument_55_
                                                            [(argument_53_
                                                            + anLocalInt_56_)]
                                                            = (byte) -105;
                                                else if (anLocalChar
                                                        == '\u02dc')
                                                    argument_55_
                                                            [(anLocalInt_56_
                                                            + argument_53_)]
                                                            = (byte) -104;
                                                else if (anLocalChar
                                                        == '\u2122')
                                                    argument_55_
                                                            [(argument_53_
                                                            + anLocalInt_56_)]
                                                            = (byte) -103;
                                                else if (anLocalChar
                                                        != '\u0161') {
                                                    if (anLocalChar
                                                            != '\u203a') {
                                                        if (anLocalChar
                                                                == '\u0153')
                                                            argument_55_
                                                                    [(argument_53_
                                                                    + anLocalInt_56_)]
                                                                    = (byte) -100;
                                                        else if (anLocalChar
                                                                == '\u017e')
                                                            argument_55_
                                                                    [(argument_53_
                                                                    + anLocalInt_56_)]
                                                                    = (byte) -98;
                                                        else if (anLocalChar
                                                                == '\u0178')
                                                            argument_55_
                                                                    [(argument_53_
                                                                    + anLocalInt_56_)]
                                                                    = (byte) -97;
                                                        else
                                                            argument_55_
                                                                    [(argument_53_
                                                                    + anLocalInt_56_)]
                                                                    = (byte) 63;
                                                    } else
                                                        argument_55_
                                                                [(anLocalInt_56_
                                                                + argument_53_)]
                                                                = (byte) -101;
                                                } else
                                                    argument_55_
                                                            [(anLocalInt_56_
                                                            + argument_53_)]
                                                            = (byte) -102;
                                            } else
                                                argument_55_[(anLocalInt_56_
                                                        + argument_53_)]
                                                        = (byte) -106;
                                        } else
                                            argument_55_[(argument_53_
                                                    + anLocalInt_56_)]
                                                    = (byte) -108;
                                    } else
                                        argument_55_[(argument_53_
                                                + anLocalInt_56_)]
                                                = (byte) -109;
                                } else
                                    argument_55_[anLocalInt_56_ + argument_53_]
                                            = (byte) -118;
                            } else
                                argument_55_[anLocalInt_56_ + argument_53_]
                                        = (byte) -119;
                        } else
                            argument_55_[anLocalInt_56_ + argument_53_]
                                    = (byte) -124;
                    } else
                        argument_55_[argument_53_ + anLocalInt_56_]
                                = (byte) -125;
                } else
                    argument_55_[anLocalInt_56_ + argument_53_] = (byte) -126;
            } else
                argument_55_[argument_53_ + anLocalInt_56_] = (byte) -128;
        }
        return anLocalInt;
    }

    final Class167 method2414(int argument_57_, GraphicsToolkit argument_58_,
                              int argument_59_, Class336 argument_60_,
                              int argument_61_, int argument_62_,
                              int argument_63_) {
        return method2406(-14, argument_60_, null, 0, argument_63_,
                argument_58_, argument_59_, 0, false, argument_61_,
                argument_57_, (byte) 2, null, 0);
    }

    public Class126() {
        anInt1021 = 0;
        anInt1025 = 128;
        ((Class126) this).anInt1034 = -1;
        ((Class126) this).aBoolean1035 = false;
        anInt1031 = -1;
        anInt1037 = 128;
        anInt1024 = 0;
        anInt1028 = 0;
    }
}
