/* Class62_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub14 extends Class62 {
    static Class207 aClass207_4408 = new Class207(30, -1);
    static Class220 aClass220_4409;
    static int anInt4411;
    static int anInt4412;

    final boolean method1408(int argument_0_) {
        if (!Node_Sub31_Sub39.method1002(this.aClass59_Sub50_440.aClass62_Sub26_4295.method1464(36), (byte) 52))
            return false;
        return true;
    }

    final int method1344(byte argument_1_) {
        if (argument_1_ != 4)
            aClass207_4408 = null;
        return 0;
    }

    static final void method1409(byte argument) {
        if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 10)
            DoublyLinkedNode_Sub51_Sub12.anInt6286 = 11;
    }

    Class62_Sub14(int argument_2_, Node_Sub50 argument_3_) {
        super(argument_2_, argument_3_);
    }

    Class62_Sub14(Node_Sub50 argument_4_) {
        super(argument_4_);
    }

    final void method1343(int argument_5_, byte argument_6_) {
        ((Class62) this).anInt441 = argument_5_;
        if (argument_6_ != -107)
            method1343(-5, (byte) -64);
    }

    static final int method1410(boolean argument, int argument_7_, byte argument_8_, Class84_Sub1 argument_9_, Class84_Sub1 argument_10_) {
        if (argument_7_ == 1) {
            int anLocalInt = argument_9_.anInt596;
            int anLocalInt_11_ = argument_10_.anInt596;
            if (!argument) {
                if (anLocalInt_11_ == -1)
                    anLocalInt_11_ = 2001;
                if (anLocalInt == -1)
                    anLocalInt = 2001;
            }
            return anLocalInt - anLocalInt_11_;
        }
        if (argument_7_ == 2)
            return (Class212.method2976(argument_9_.method1622(-1).aString1232, false, argument_10_.method1622(-1).aString1232, client.language));
        if (argument_7_ == 3) {
            if (!argument_9_.aString4478.equals("-")) {
                if (argument_10_.aString4478.equals("-")) {
                    if (!argument)
                        return -1;
                    return 1;
                }
            } else {
                if (argument_10_.aString4478.equals("-"))
                    return 0;
                if (!argument)
                    return 1;
                return -1;
            }
            return Class212.method2976((argument_9_.aString4478), false, (argument_10_.aString4478), client.language);
        }
        if (argument_7_ == 4) {
            if (!argument_9_.method1617(-115)) {
                if (argument_10_.method1617(-122))
                    return -1;
                return 0;
            }
            if (argument_10_.method1617(-89))
                return 0;
            return 1;
        }
        if (argument_7_ == 5) {
            if (argument_9_.method1614((byte) 48)) {
                if (!argument_10_.method1614((byte) 48))
                    return 1;
                return 0;
            }
            if (argument_10_.method1614((byte) 48))
                return -1;
            return 0;
        }
        if (argument_7_ == 6) {
            if (argument_9_.method1613(64)) {
                if (argument_10_.method1613(64))
                    return 0;
                return 1;
            }
            if (argument_10_.method1613(64))
                return -1;
            return 0;
        }
        if (argument_7_ == 7) {
            if (!argument_9_.method1621((byte) 16)) {
                if (!argument_10_.method1621((byte) 16))
                    return 0;
                return -1;
            }
            if (!argument_10_.method1621((byte) 16))
                return 1;
            return 0;
        }
        if (argument_7_ == 8) {
            int anLocalInt = argument_9_.anInt4479;
            int anLocalInt_12_ = argument_10_.anInt4479;
            if (argument) {
                if (anLocalInt_12_ == 1000)
                    anLocalInt_12_ = -1;
                if (anLocalInt == 1000)
                    anLocalInt = -1;
            } else {
                if (anLocalInt == -1)
                    anLocalInt = 1000;
                if (anLocalInt_12_ == -1)
                    anLocalInt_12_ = 1000;
            }
            return anLocalInt - anLocalInt_12_;
        }
        return (argument_9_.anInt4481 - argument_10_.anInt4481);
    }

    public static void method1412(int argument) {
        aClass220_4409 = null;
        aClass207_4408 = null;
    }

    static final Class236 method1413(int argument, int argument_16_, String argument_17_) {
        Class236 class236;
        try {
            class236 = (Class236) Class.forName("Class236_Sub1").newInstance();
        } catch (Throwable throwable) {
            class236 = new Class236_Sub2();
        }
        class236.anInt1720 = argument_16_;
        class236.aString1721 = argument_17_;
        return class236;
    }

    final int method1414(int argument_18_) {
        return this.anInt441;
    }

    final int method1342(int argument_19_, byte argument_20_) {
        if (!Node_Sub31_Sub39.method1002(this.aClass59_Sub50_440.aClass62_Sub26_4295.method1464(112), (byte) 119))
            return 3;
        return 1;
    }

    final void method1346(boolean argument_21_) {
        if (this.aClass59_Sub50_440.aClass62_Sub26_4295.method1462(8192) && !Node_Sub31_Sub39.method1002(this.aClass59_Sub50_440.aClass62_Sub26_4295.method1464(67), (byte) 27))
            ((Class62) this).anInt441 = 0;
        if (argument_21_)
            aClass220_4409 = null;
        if (this.anInt441 < 0 || this.anInt441 > 1)
            ((Class62) this).anInt441 = method1344((byte) 4);
    }
}
