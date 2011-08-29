/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

final class Class33 {
    private int anInt216;
    private boolean[] aBooleanArray217;
    private Js5Store myStore;
    static Class217 aClass217_219 = new Class217(2, 4, 4, 0);
    private int[][] anIntArrayArray220;
    static Class166 aClass166_221 = new Class166(66, 4);
    static Class368[] aClass368Array222;
    static Packet aClass59_Sub28_223;

    public static void method368(int argument) {
        aClass166_221 = null;
        aClass59_Sub28_223 = null;
        aClass368Array222 = null;
        aClass217_219 = null;
    }

    final boolean method370(int argument_1_) {
        if (anInt216 == -1)
            return false;
        return true;
    }

    final Class158 method371(int argument_2_, int argument_3_) {
        byte[] anLocalInts = myStore.getData(1, argument_3_);
        Class158 class158 = new Class158();
        class158.method2594(new Packet(anLocalInts), (byte) 83);
        return class158;
    }

    final int[] method372(int argument_4_, boolean argument_5_) {
        if (argument_4_ < 0 || anIntArrayArray220.length <= argument_4_) {
            if (anInt216 == -1)
                return new int[0];
            return new int[]{anInt216};
        }
        if (!aBooleanArray217[argument_4_] || anIntArrayArray220[argument_4_].length <= 1)
            return anIntArrayArray220[argument_4_];
        int anLocalInt = anInt216 != -1 ? 1 : 0;
        Random random = new Random();
        int[] anLocalInts = new int[anIntArrayArray220[argument_4_].length];
        JagStrings.memcpy(anIntArrayArray220[argument_4_], 0, anLocalInts, 0, anLocalInts.length);
        for (int anLocalInt_6_ = anLocalInt; anLocalInts.length > anLocalInt_6_; anLocalInt_6_++) {
            int anLocalInt_7_ = (anLocalInt + Class207.method2945(random, 79, -anLocalInt + anLocalInts.length));
            int anLocalInt_8_ = anLocalInts[anLocalInt_6_];
            anLocalInts[anLocalInt_6_] = anLocalInts[anLocalInt_7_];
            anLocalInts[anLocalInt_7_] = anLocalInt_8_;
        }
        return anLocalInts;
    }

    Class33(GameEnum game, int language, Js5Store store) {
        myStore = store;
        myStore.getSubFileCount(1);
        Packet packet = new Packet(myStore.getData(0, 0));
        int anLocalInt = packet.g1();
        if (anLocalInt <= 3) {
            int anLocalInt_12_ = packet.g1();
            Class128[] class128s = Class107.method1961(-65);
            boolean anLocalBoolean = true;
            if (class128s.length == anLocalInt_12_) {
                for (int anLocalInt_13_ = 0; class128s.length > anLocalInt_13_; anLocalInt_13_++) {
                    int anLocalInt_14_ = packet.g1();
                    if (anLocalInt_14_ != ((Class128) class128s[anLocalInt_13_]).anInt1041) {
                        anLocalBoolean = false;
                        break;
                    }
                }
            } else
                anLocalBoolean = false;
            if (!anLocalBoolean) {
                anInt216 = -1;
                aBooleanArray217 = new boolean[0];
                anIntArrayArray220 = new int[0][];
            } else {
                int anLocalInt_15_ = packet.g1();
                int anLocalInt_16_ = packet.g1();
                if (anLocalInt <= 2)
                    anInt216 = -1;
                else
                    anInt216 = packet.g2s();
                aBooleanArray217 = new boolean[anLocalInt_16_ + 1];
                anIntArrayArray220 = new int[anLocalInt_16_ + 1][];
                for (int anLocalInt_17_ = 0; anLocalInt_15_ > anLocalInt_17_; anLocalInt_17_++) {
                    int anLocalInt_18_ = packet.g1();
                    aBooleanArray217[anLocalInt_18_] = packet.g1() == 1;
                    int anLocalInt_19_ = packet.g2();
                    if (anInt216 != -1) {
                        anIntArrayArray220[anLocalInt_18_] = new int[anLocalInt_19_ + 1];
                        anIntArrayArray220[anLocalInt_18_][0] = anInt216;
                        for (int anLocalInt_20_ = 0; anLocalInt_20_ < anLocalInt_19_; anLocalInt_20_++)
                            anIntArrayArray220[anLocalInt_18_][(anLocalInt_20_ + 1)] = packet.g2();
                    } else {
                        anIntArrayArray220[anLocalInt_18_] = new int[anLocalInt_19_];
                        for (int anLocalInt_21_ = 0; anLocalInt_19_ > anLocalInt_21_; anLocalInt_21_++)
                            anIntArrayArray220[anLocalInt_18_][anLocalInt_21_] = packet.g2();
                    }
                }
                for (int anLocalInt_22_ = 0; anLocalInt_22_ < anLocalInt_16_ + 1; anLocalInt_22_++) {
                    if (anIntArrayArray220[anLocalInt_22_] == null) {
                        if (anInt216 != -1)
                            anIntArrayArray220[anLocalInt_22_] = new int[]{anInt216};
                        else
                            anIntArrayArray220[anLocalInt_22_] = new int[0];
                    }
                }
            }
        } else {
            anInt216 = -1;
            anIntArrayArray220 = new int[0][];
            aBooleanArray217 = new boolean[0];
        }
    }
}
