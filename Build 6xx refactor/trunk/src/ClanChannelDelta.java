/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanChannelDelta {
    private long clanHash;
    private long updateNum = -1L;
    private CyclicLinkedList aCyclicLinkedList_1180 = new CyclicLinkedList();

    private final void decode(Packet packet) {
        clanHash = packet.g8();
        updateNum = packet.g8();
        for (int anLocalInt = packet.g1(); anLocalInt != 0; anLocalInt = packet.g1()) {
            Node_Sub37 class59_sub37;
            if (anLocalInt != 1) {
                if (anLocalInt == 4)
                    class59_sub37 = new Node_Sub37_Sub1();
                else if (anLocalInt != 3) {
                    if (anLocalInt != 2)
                        throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
                    class59_sub37 = new Node_Sub37_Sub3();
                } else
                    class59_sub37 = new Node_Sub37_Sub2();
            } else
                class59_sub37 = new Node_Sub37_Sub4();
            class59_sub37.method1058(3, packet);
            aCyclicLinkedList_1180.add(class59_sub37);
        }
    }

    final void applyToClanChannel(ClanChannel argument_17_) {
        if (clanHash != argument_17_.hash || argument_17_.updateNum != updateNum)
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + argument_17_.hash + " updateNum:" + argument_17_.updateNum + " delta.clanHash:" + clanHash + " updateNum:" + updateNum);
        for (Node_Sub37 class59_sub37 = (Node_Sub37) aCyclicLinkedList_1180.getFirst(); class59_sub37 != null; class59_sub37 = (Node_Sub37) aCyclicLinkedList_1180.getNext())
            class59_sub37.method1059((byte) -116, argument_17_);
        argument_17_.updateNum++;
    }

    ClanChannelDelta(Packet argument_18_) {
        decode(argument_18_);
    }

    static {
    }
}
