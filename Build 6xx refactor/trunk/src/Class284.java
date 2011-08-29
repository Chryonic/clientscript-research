/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class284 {
    short[] aShortArray2278;
    static int anInt2279;
    static AbstractFont aAbstractFont_2280;
    short[] aShortArray2281;
    byte[] aByteArray2282;
    static int anInt2283;
    short[] aShortArray2284;
    /*synthetic*/ static Class aClass2285;

    static final void method3453(int argument, int argument_0_, GraphicsToolkit argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_, int argument_6_, int argument_7_) {
        if (argument_6_ != -4)
            method3454();
        Interface2 interface2 = ((Interface2) Node_Sub31_Sub15_Sub1.method921(argument_3_, argument_4_, argument));
        if (interface2 != null) {
            Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 49, interface2.method7(-23356));
            int anLocalInt = interface2.method3(-2132) & 0x3;
            int anLocalInt_8_ = interface2.method2(-10908);
            if (class266.anInt2058 != -1)
                Node_Sub24.method747(class266, argument_1_, anLocalInt, argument_2_, -24334, argument_0_);
            else {
                int anLocalInt_9_ = argument_5_;
                if (class266.anInt2123 > 0)
                    anLocalInt_9_ = argument_7_;
                if (anLocalInt_8_ == 0 || anLocalInt_8_ == 2) {
                    if (anLocalInt == 0)
                        argument_1_.method2050(4, 45, argument_0_, argument_2_, anLocalInt_9_);
                    else if (anLocalInt != 1) {
                        if (anLocalInt == 2)
                            argument_1_.method2050(4, argument_6_ ^ ~0x25, argument_0_ + 3, argument_2_, anLocalInt_9_);
                        else if (anLocalInt == 3)
                            argument_1_.method2061(argument_2_ + 3, argument_0_, anLocalInt_9_, 4, (byte) -72);
                    } else
                        argument_1_.method2061(argument_2_, argument_0_, anLocalInt_9_, 4, (byte) -102);
                }
                if (anLocalInt_8_ == 3) {
                    if (anLocalInt == 0)
                        argument_1_.method2020(argument_6_ - 107, 1, argument_2_, 1, argument_0_, anLocalInt_9_);
                    else if (anLocalInt != 1) {
                        if (anLocalInt != 2) {
                            if (anLocalInt == 3)
                                argument_1_.method2020(-120, 1, argument_2_ + 3, 1, argument_0_, anLocalInt_9_);
                        } else
                            argument_1_.method2020(-127, 1, argument_2_ + 3, 1, argument_0_ + 3, anLocalInt_9_);
                    } else
                        argument_1_.method2020(argument_6_ - 107, 1, argument_2_, 1, argument_0_ + 3, anLocalInt_9_);
                }
                if (anLocalInt_8_ == 2) {
                    if (anLocalInt != 0) {
                        if (anLocalInt != 1) {
                            if (anLocalInt == 2)
                                argument_1_.method2061(argument_2_ + 3, argument_0_, anLocalInt_9_, 4, (byte) -86);
                            else if (anLocalInt == 3)
                                argument_1_.method2050(4, -126, argument_0_, argument_2_, anLocalInt_9_);
                        } else
                            argument_1_.method2050(4, 62, argument_0_ + 3, argument_2_, anLocalInt_9_);
                    } else
                        argument_1_.method2061(argument_2_, argument_0_, anLocalInt_9_, 4, (byte) -64);
                }
            }
        }
        interface2 = ((Interface2) LoadingBar.method2831(argument_3_, argument_4_, argument, (aClass2285 != null ? aClass2285 : (aClass2285 = method3459("Interface2")))));
        if (interface2 != null) {
            Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 60, interface2.method7(-23356));
            int anLocalInt = interface2.method3(-2132) & 0x3;
            int anLocalInt_10_ = interface2.method2(-10908);
            if (class266.anInt2058 != -1)
                Node_Sub24.method747(class266, argument_1_, anLocalInt, argument_2_, -24334, argument_0_);
            else if (anLocalInt_10_ == 9) {
                int anLocalInt_11_ = -1118482;
                if (class266.anInt2123 > 0)
                    anLocalInt_11_ = -1179648;
                if (anLocalInt == 0 || anLocalInt == 2)
                    argument_1_.method2035(anLocalInt_11_, (byte) -46, argument_2_ + 3, argument_0_ + 3, argument_2_, argument_0_);
                else
                    argument_1_.method2035(anLocalInt_11_, (byte) -99, argument_2_, argument_0_ + 3, argument_2_ + 3, argument_0_);
            }
        }
        interface2 = (Interface2) Statics.method1330(argument_3_, argument_4_, argument);
        if (interface2 != null) {
            Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 39, interface2.method7(-23356));
            int anLocalInt = interface2.method3(argument_6_ ^ 0x850) & 0x3;
            if (class266.anInt2058 != -1)
                Node_Sub24.method747(class266, argument_1_, anLocalInt, argument_2_, argument_6_ ^ 0x5f0e, argument_0_);
        }
    }

    static final void method3454() {
        for (int anLocalInt = 0; anLocalInt < Node_Sub32_Sub4.aClass380Array6085.length; anLocalInt++)
            Node_Sub32_Sub4.aClass380Array6085[anLocalInt].method4102();
        Node_Sub32_Sub4.aClass380Array6085 = null;
    }

    static final void method3455(int argument) {
        Class23.aJagexHashMap_153.method1527(0);
    }

    public static void method3456(int argument) {
        aAbstractFont_2280 = null;
    }

    static final void method3457(int argument, int argument_12_) {
        Class245_Sub2_Sub1.aLong6521 = 1000000000L / (long) argument_12_;
    }

    /*synthetic*/
    static Class method3459(String argument) {
        try {
            return Class.forName(argument);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
