/* Class219 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanSettingsDelta {
    static int anInt1544 = 64;
    private long owner;
    static Js5Store aJs5Store_1546;
    static short aShort1547 = 205;
    private CyclicLinkedList aCyclicLinkedList_1548;
    private int updateNum = -1;

    private final void decode(Packet packet, int argument_1_) {
        owner = packet.g8();
        updateNum = packet.g4();
        int t = packet.g1();
        if (argument_1_ != -4)
            applyToClanSettings(null);
        for (/**/; t != 0; t = packet.g1()) {
            if (Class195.aBoolean1424)
                System.out.println("t:" + t);
            Node_Sub47 class59_sub47;
            if (t == 3)
                class59_sub47 = new Node_Sub47_Sub7();
            else if (t == 1)
                class59_sub47 = new Node_Sub47_Sub3();
            else if (t != 4) {
                if (t != 6) {
                    if (t == 5)
                        class59_sub47 = new Node_Sub47_Sub1();
                    else if (t == 2)
                        class59_sub47 = new Node_Sub47_Sub8();
                    else if (t != 7) {
                        if (t != 8) {
                            if (t != 9) {
                                if (t == 10)
                                    class59_sub47 = new Node_Sub47_Sub10();
                                else if (t == 11)
                                    class59_sub47 = new Node_Sub47_Sub9();
                                else if (t == 12)
                                    class59_sub47 = new Node_Sub47_Sub5();
                                else
                                    throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
                            } else
                                class59_sub47 = new Node_Sub47_Sub12();
                        } else
                            class59_sub47 = new Node_Sub47_Sub11();
                    } else
                        class59_sub47 = new Node_Sub47_Sub2();
                } else
                    class59_sub47 = new Node_Sub47_Sub4();
            } else
                class59_sub47 = new Node_Sub47_Sub6();
            class59_sub47.method1110(argument_1_ - 94, packet);
            aCyclicLinkedList_1548.add(class59_sub47);
        }
    }

    public static void method3025(byte argument) {
        aJs5Store_1546 = null;
    }

    final void applyToClanSettings(ClanSettings settings) {
        if (settings.owner != owner || updateNum != settings.updateNum)
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + JagexStringEncoding.decode(settings.owner) + " updateNum:" + settings.updateNum + " delta.owner:" + JagexStringEncoding.decode(owner) + " updateNum:" + updateNum);
        for (Node_Sub47 class59_sub47 = (Node_Sub47) aCyclicLinkedList_1548.getFirst(); class59_sub47 != null; class59_sub47 = (Node_Sub47) aCyclicLinkedList_1548.getNext())
            class59_sub47.method1109(settings, 5);
        settings.updateNum++;
    }

    ClanSettingsDelta(Packet argument_4_) {
        aCyclicLinkedList_1548 = new CyclicLinkedList();
        decode(argument_4_, -4);
    }
}
