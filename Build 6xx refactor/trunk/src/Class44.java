/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;

final class Class44 {
    static int anInt312;

    static final void method429(int argument, boolean argument_1_) {
        if (Statics.aClass307_2632 != null) {
            Statics.aClass307_2632.method3601(2);
            Statics.aClass307_2632 = null;
        }
        Class126.method2407((byte) -109);
        Class241.method3151((byte) -106);
        LightingManager.method945();
        for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
            MapRelated.clippingMaps[anLocalInt].method3138(2097152);
        Class259.method3307(false, (byte) -110);
        System.gc();
        Class336.method3757((byte) -34, 2);
        Statics.anInt3514 = -1;
        Class154.aBoolean3618 = false;
        Node_Sub49.method1149(0);
        DoublyLinkedNodeP2_Sub3.method1899(true, -79);
        DiskBackedCache.anInt2701 = MapRelated.anInt5582 = 0;
        MapRelated.baseZ = 0;
        MapRelated.regionZ = 0;
        MapRelated.regionX = 0;
        MapRelated.baseX = 0;
        for (int anLocalInt = 0;
             anLocalInt < Class166.aClass124Array1216.length; anLocalInt++)
            Class166.aClass124Array1216[anLocalInt] = null;
        DoublyLinkedNodeP2_Sub2_Sub4_Sub2.method1888(16741381);
        for (int anLocalInt = 0; anLocalInt < 2048; anLocalInt++)
            Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt] = null;
        dba_sub_772_Sub2.anInt6369 = 0;
        Class294.aJagexHashMap_2453.method1527(0);
        Statics.anInt5573 = 0;
        tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.method1527(0);
        Class80.method1586(27315);
        Class345.anInt2906 = 0;
        ClientVariables.instance.resetAll();
        Statics.method770((byte) 121);
        Statics.method2423((byte) 64);
        Node_Sub32.aClanSettings_4143 = null;
        Statics.aLong2229 = 0L;
        Node_Sub31_Sub13.aClanSettings_5899 = null;
        GameEnum.aClass59_Sub53_825 = null;
        AbstractFont.aClass59_Sub53_420 = null;
        Class269.aClass59_Sub1_2154 = null;
        if (argument_1_)
            Class316.method3638(12, 2);
        else {
            Class316.method3638(3, 2);
            try {
                Class328.method3698(Signlink.mainapp, "loggedout",
                        (byte) 127);
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    public Class44() {
        /* empty */
    }

    static final GraphicsToolkit method430(int argument, TextureSource argument_2_,
                                    int argument_3_, int argument_4_,
                                    Canvas argument_5_) {
        return new JavaToolkit(argument_5_, argument_2_, argument_4_,
                argument);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final int method431(int argument_6_, int argument_7_, int argument_8_) {
        int anLocalInt = (Applet_Sub1.canvasHeight <= argument_7_ ? argument_7_
                : Applet_Sub1.canvasHeight);
        if (this == Class96.aClass44_746)
            return 0;
        if (Class45.aClass44_321 == this)
            return -argument_8_ + anLocalInt;
        if (Class368_Sub1.aClass44_5688 == this)
            return (-argument_8_ + anLocalInt) / 2;
        return 0;
    }
}
