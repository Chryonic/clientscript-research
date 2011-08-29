/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class VarBit {
    int index;
    int startBitIndex;
    int endBitIndex;

    private void readData(Packet packet, int opcode) {
        if (opcode == 1) {
            this.index = packet.g2();
            this.startBitIndex = packet.g1();
            this.endBitIndex = packet.g1();
        }
    }

    public VarBit() {
        /* empty */
    }

    final void read(Packet packet) {
        for (; ; ) {
            int opcode = packet.g1();
            if (opcode == 0)
                break;
            readData(packet, opcode);
        }
    }
}
