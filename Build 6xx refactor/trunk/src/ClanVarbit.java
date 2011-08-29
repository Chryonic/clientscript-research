/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanVarbit {
    int index;
    char type;
    int shift1;
    int shift2;

    private final void readData(Packet packet, int opcode) {
        if (opcode == 1) {
            this.type = JagexStringUtils.parseCharacter(packet.g1s());
        } else if (opcode== 2) {
            this.index = packet.g2();
            this.shift2 = packet.g1();
            this.shift1 = packet.g1();
        }
    }

    final void read(Packet packet) {
        for (; ; ) {
            int opcode = packet.g1();
            if (opcode == 0)
                break;
            readData(packet, opcode);
        }
    }

    public ClanVarbit() {
        /* empty */
    }
}
