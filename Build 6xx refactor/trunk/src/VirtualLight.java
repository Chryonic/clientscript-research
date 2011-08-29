/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VirtualLight {
    boolean fromFloorToMax;
    private int anInt1987;
    short[] shape;
    private int anInt1989;
    private int anInt1990;
    private int anInt1992;
    private int anInt1993;
    int anInt1995;
    int tileZ;
    HardwareLight hardwareLight;
    boolean fromGroundToFloor;

    private final void method3263() {
        int anLocalInt = this.anInt1995;
        while_85_:
        do {
            while_84_:
            do {
                while_83_:
                do {
                    while_82_:
                    do {
                        while_81_:
                        do {
                            while_80_:
                            do {
                                while_79_:
                                do {
                                    while_78_:
                                    do {
                                        while_77_:
                                        do {
                                            while_76_:
                                            do {
                                                while_75_:
                                                do {
                                                    while_74_:
                                                    do {
                                                        while_73_:
                                                        do {
                                                            while_72_:
                                                            do {
                                                                do {
                                                                    if (anLocalInt != 2) {
                                                                        if (anLocalInt != 3) {
                                                                            if (anLocalInt != 4) {
                                                                                if (anLocalInt != 5) {
                                                                                    if (anLocalInt != 12) {
                                                                                        if (anLocalInt != 13) {
                                                                                            if (anLocalInt != 10) {
                                                                                                if (anLocalInt != 11) {
                                                                                                    if (anLocalInt != 6) {
                                                                                                        if (anLocalInt != 7) {
                                                                                                            if (anLocalInt != 8) {
                                                                                                                if (anLocalInt != 9) {
                                                                                                                    if (anLocalInt != 14) {
                                                                                                                        if (anLocalInt != 15) {
                                                                                                                            if (anLocalInt == 16)
                                                                                                                                break while_83_;
                                                                                                                            break while_84_;
                                                                                                                        }
                                                                                                                    } else
                                                                                                                        break while_81_;
                                                                                                                    break while_82_;
                                                                                                                }
                                                                                                            } else
                                                                                                                break while_79_;
                                                                                                            break while_80_;
                                                                                                        }
                                                                                                    } else
                                                                                                        break while_77_;
                                                                                                    break while_78_;
                                                                                                }
                                                                                            } else
                                                                                                break while_75_;
                                                                                            break while_76_;
                                                                                        }
                                                                                    } else
                                                                                        break while_73_;
                                                                                    break while_74_;
                                                                                }
                                                                            } else
                                                                                break;
                                                                            break while_72_;
                                                                        }
                                                                    } else {
                                                                        anInt1989 = 1;
                                                                        anInt1992 = 0;
                                                                        anInt1993 = 2048;
                                                                        anInt1990 = 2048;
                                                                        break while_85_;
                                                                    }
                                                                    anInt1989 = 1;
                                                                    anInt1990 = 4096;
                                                                    anInt1992 = 0;
                                                                    anInt1993 = 2048;
                                                                    break while_85_;
                                                                } while (false);
                                                                anInt1992 = 0;
                                                                anInt1990 = 2048;
                                                                anInt1989 = 4;
                                                                anInt1993 = 2048;
                                                                break while_85_;
                                                            } while (false);
                                                            anInt1989 = 4;
                                                            anInt1990 = 8192;
                                                            anInt1993 = 2048;
                                                            anInt1992 = 0;
                                                            break while_85_;
                                                        } while (false);
                                                        anInt1989 = 2;
                                                        anInt1993 = 2048;
                                                        anInt1990 = 2048;
                                                        anInt1992 = 0;
                                                        break while_85_;
                                                    } while (false);
                                                    anInt1993 = 2048;
                                                    anInt1992 = 0;
                                                    anInt1990 = 8192;
                                                    anInt1989 = 2;
                                                    break while_85_;
                                                } while (false);
                                                anInt1993 = 512;
                                                anInt1992 = 1536;
                                                anInt1989 = 3;
                                                anInt1990 = 2048;
                                                break while_85_;
                                            } while (false);
                                            anInt1993 = 512;
                                            anInt1992 = 1536;
                                            anInt1989 = 3;
                                            anInt1990 = 4096;
                                            break while_85_;
                                        } while (false);
                                        anInt1989 = 3;
                                        anInt1992 = 1280;
                                        anInt1990 = 2048;
                                        anInt1993 = 768;
                                        break while_85_;
                                    } while (false);
                                    anInt1992 = 1280;
                                    anInt1989 = 3;
                                    anInt1993 = 768;
                                    anInt1990 = 4096;
                                    break while_85_;
                                } while (false);
                                anInt1993 = 1024;
                                anInt1992 = 1024;
                                anInt1990 = 2048;
                                anInt1989 = 3;
                                break while_85_;
                            } while (false);
                            anInt1992 = 1024;
                            anInt1989 = 3;
                            anInt1993 = 1024;
                            anInt1990 = 4096;
                            break while_85_;
                        } while (false);
                        anInt1992 = 1280;
                        anInt1993 = 768;
                        anInt1990 = 2048;
                        anInt1989 = 1;
                        break while_85_;
                    } while (false);
                    anInt1989 = 1;
                    anInt1992 = 1536;
                    anInt1993 = 512;
                    anInt1990 = 4096;
                    break while_85_;
                } while (false);
                anInt1989 = 1;
                anInt1990 = 8192;
                anInt1993 = 256;
                anInt1992 = 1792;
                break while_85_;
            } while (false);
            anInt1990 = 2048;
            anInt1993 = 2048;
            anInt1992 = 0;
            anInt1989 = 0;
        } while (false);
    }

    final void method3264(int argument_10_, int argument_11_, int argument_12_, boolean argument_13_, int argument_14_) {
        anInt1992 = argument_12_;
        anInt1990 = argument_11_;
        anInt1993 = argument_10_;
        anInt1989 = argument_14_;
    }

    private void createLight(int x, int y, int z, int attenuation, int colour, GraphicsToolkit toolkit) {
        this.hardwareLight = toolkit.createLight(x, y, z, attenuation, colour, 1.0F);
    }

    protected VirtualLight() {
        if (MultilanguageString.anIntArray2863 == null)
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1852((byte) -128);
        method3263();
    }

    VirtualLight(GraphicsToolkit toolkit, Packet packet) {
        if (MultilanguageString.anIntArray2863 == null)
            DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.method1852((byte) -128);
        this.tileZ = packet.g1();
        this.fromFloorToMax = (this.tileZ & 0x8) != 0;
        this.fromGroundToFloor = (this.tileZ & 0x10) != 0;
        this.tileZ = this.tileZ & 0x7;
        int x = packet.g2() << 2;
        int z = packet.g2() << 2;
        int y = packet.g2() << 2;
        int attenuation = packet.g1();
        int radius = attenuation * 2 + 1;
        this.shape = new short[radius];
        for (int anLocalInt_29_ = 0; this.shape.length > anLocalInt_29_; anLocalInt_29_++) {
            int anLocalInt_30_ = (short) packet.g2();
            int anLocalInt_31_ = anLocalInt_30_ >>> 8;
            int anLocalInt_32_ = anLocalInt_30_ & 0xff;
            if (anLocalInt_31_ >= radius)
                anLocalInt_31_ = radius - 1;
            if (radius - anLocalInt_31_ < anLocalInt_32_)
                anLocalInt_32_ = radius - anLocalInt_31_;
            this.shape[anLocalInt_29_] = (short) MathStatics.OR(anLocalInt_32_, anLocalInt_31_ << 8);
        }
        attenuation = LightingManager.attenuationOffset + (attenuation << LightingManager.lightCoordRShift);
        int colour = (HslToRgb.table == null ? (HslToRgb.table2[(HslToRgb.method3452(packet.g2()) & 0xffff)])
                                                       : HslToRgb.table[packet.g2()]);
        int anLocalInt_34_ = packet.g1();
        anInt1987 = (anLocalInt_34_ & 0xe0) << 3;
        this.anInt1995 = anLocalInt_34_ & 0x1f;
        if (this.anInt1995 != 31)
            method3263();
        createLight(x, y, z, attenuation, colour, toolkit);
    }

    final void calculateIntensity(int p, boolean tieTo2048) {
        int intensityRelated;
        highest:
        do {
            if (tieTo2048) {
                intensityRelated = 2048;
            } else {
                int parameter = anInt1987 + p * anInt1990 / 50 & 0x7ff;
                int action = anInt1989;
                while_88_:
                do {
                    while_87_:
                    do {
                        while_86_:
                        do {
                            do {
                                if (action == 1) {
                                    intensityRelated = ((Node_Sub6.SINETABLE[parameter << 3]) >> 4) + 1024;
                                    break highest;
                                } else {
                                    if (action != 3) {
                                        if (action == 4) {
                                            break;
                                        } else {
                                            if (action != 2) {
                                                if (action == 5)
                                                    break while_87_;
                                                break while_88_;
                                            }
                                        }
                                        break while_86_;
                                    } else {

                                    }
                                }
                                intensityRelated = (MultilanguageString.anIntArray2863[parameter] >> 1);
                                break highest;
                            } while (false);
                            intensityRelated = parameter >> 10 << 11;
                            break highest;
                        } while (false);
                        intensityRelated = parameter;
                        break highest;
                    } while (false);
                    intensityRelated = (parameter >= 1024 ? 2048 - parameter : parameter) << 1;
                    break highest;
                } while (false);
                intensityRelated = 2048;
            }
        } while (false);
        this.hardwareLight.setIntensity((float) ((anInt1993 * intensityRelated >> 11) + anInt1992) / 2048.0F);
    }

    static {
    }
}
