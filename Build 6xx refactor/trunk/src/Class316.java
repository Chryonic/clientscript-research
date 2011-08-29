/* Class316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class316 {
    static int anInt2611 = -1;
    private Js5Store aJs5Store_2612;
    private Class149 aClass149_2613 = new Class149(64);
    static Class166 aClass166_2614 = new Class166(103, 6);
    static String aString2615;
    private Js5Store aJs5Store_2616;
    static int anInt2617;

    final DoublyLinkedNode_Sub51_Sub8 method3634(byte argument_0_, int argument_1_) {
        DoublyLinkedNode_Sub51_Sub8 class59_sub51_sub8 = ((DoublyLinkedNode_Sub51_Sub8) aClass149_2613.get((long) argument_1_));
        if (class59_sub51_sub8 != null)
            return class59_sub51_sub8;
        byte[] anLocalInts;
        if (argument_1_ >= 32768)
            anLocalInts = aJs5Store_2612.getData(0, argument_1_ & 0x7fff);
        else
            anLocalInts = aJs5Store_2616.getData(0, argument_1_);
        class59_sub51_sub8 = new DoublyLinkedNode_Sub51_Sub8();
        if (argument_0_ != -96)
            RsInterface.doAutoLayout(null);
        if (anLocalInts != null)
            class59_sub51_sub8.method1233(argument_0_ ^ 0x5419, new Packet(anLocalInts));
        if (argument_1_ >= 32768)
            class59_sub51_sub8.method1237(-98);
        aClass149_2613.put(class59_sub51_sub8, (long) argument_1_);
        return class59_sub51_sub8;
    }

    public static void method3636(int argument) {
        aString2615 = null;
        aClass166_2614 = null;
    }

    static final int method3637(DoublyLinkedNode_Sub51_Sub7 argument, int argument_4_) {
        if (argument_4_ != 2)
            return -128;
        String string = DoublyLinkedNode_Sub51_Sub6.method1207(argument, 76);
        return Class37.aClass76_274.method1558(argument_4_ ^ 0x490e, (dba_sub_772_Sub2.aClass368Array6368), string);
    }

    static final void method3638(int argument, int argument_5_) {
        if (argument != Statics.anInt1652) {
            if (argument == 13)
                Class313.method3615((byte) 116);
            if (argument != 13 && Class350_Sub2.aClass307_5453 != null) {
                Class350_Sub2.aClass307_5453.method3601(2);
                Class350_Sub2.aClass307_5453 = null;
            }
            if (argument == 3)
                Class6.method230(client.loginscreenId != Class66.anInt467, (byte) -46);
            else if (argument == 7)
                GlToolkitNr2Program.method3236(-127, (Class66.anInt467 != client.lobbyscreenId));
            else if (argument == 5 || argument == 12)
                Class353_Sub7.method3909((byte) -67);
            else if (argument == 6 || argument == 9)
                Class313.method3615((byte) 97);
            if (Class159.method2597(Statics.anInt1652, -31175)) {
                Statics.aJs5Store_1153.discardUnpacked = 2;
                Statics.aJs5Store_3520.discardUnpacked = 2;
                Statics.aJs5Store_4343.discardUnpacked = 2;
                Class245_Sub1.aJs5Store_5307.discardUnpacked = 2;
                tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.discardUnpacked = 2;
                Class200.aJs5Store_1447.discardUnpacked = 2;
                Class62_Sub16.aJs5Store_4416.discardUnpacked = 2;
            }
            if (Class159.method2597(argument, argument_5_ - 31177)) {
                Class373.anInt3201 = 1;
                MapRelated.missingFileType = 0;
                Class2_Sub2.anInt3770 = 1;
                Class164.anInt1199 = 0;
                MapRelated.missingFileCount = 0;
                Class259.method3307(true, (byte) -123);
                Statics.aJs5Store_1153.discardUnpacked = 1;
                Statics.aJs5Store_3520.discardUnpacked = 1;
                Statics.aJs5Store_4343.discardUnpacked = 1;
                Class245_Sub1.aJs5Store_5307.discardUnpacked = 1;
                tia_sub_35_Sub2DoublyLinked.aJs5Store_6667.discardUnpacked = 1;
                Class200.aJs5Store_1447.discardUnpacked = 1;
                Class62_Sub16.aJs5Store_4416.discardUnpacked = 1;
            }
            if (argument == 11 || argument == 3)
                Node_Sub23.method745(argument_5_ - 2);
            boolean anLocalBoolean = (argument_5_ == argument || Class282.method3446(argument, (byte) 91) || Class382.method4108(argument, 89));
            boolean anLocalBoolean_6_ = (Statics.anInt1652 == 2 || Class282.method3446(Statics.anInt1652, (byte) 53) || Class382.method4108(Statics.anInt1652, 113));
            if (!anLocalBoolean == anLocalBoolean_6_) {
                if (!anLocalBoolean) {
                    Class336.method3757((byte) -58, 2);
                    client.js5client.send3or2(true);
                } else {
                    Statics.anInt3514 = Statics.anInt472;
                    if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4324.method1446(90) != 0) {
                        Class3.method217(Statics.anInt472, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4324.method1446(118), 0, false, false, Class341.aJs5Store_2881, 2);
                        Node_Sub49.method1149(0);
                    } else
                        Class336.method3757((byte) 96, 2);
                    client.js5client.send3or2(false);
                }
            }
            if (Class159.method2597(argument, argument_5_ ^ ~0x79c4) || argument == 13)
                Class389.aGraphicsToolkit3281.method2048();
            Statics.anInt1652 = argument;
        }
    }

    Class316(int argument_7_, Js5Store argument_8_, Js5Store argument_9_) {
        aJs5Store_2616 = argument_8_;
        aJs5Store_2612 = argument_9_;
        if (aJs5Store_2616 != null)
            aJs5Store_2616.getSubFileCount(0);
        if (aJs5Store_2612 != null)
            aJs5Store_2612.getSubFileCount(0);
    }
}
