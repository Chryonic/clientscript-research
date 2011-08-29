/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NameTable {
    private int[] nameHashes;

    final int getIDForHash(int searchHash) {
        int anLocalInt = (nameHashes.length >> 1) - 1;
        int nhPtr = anLocalInt & searchHash;
        for (; ; ) {
            int ptr = nameHashes[nhPtr + (nhPtr + 1)];
            if (ptr == -1)
                return -1;
            if (nameHashes[nhPtr + nhPtr] == searchHash)
                return ptr;
            nhPtr = nhPtr + 1 & anLocalInt;
        }
    }

    NameTable(int[] hashes) {
        int anLocalInt;
        for (anLocalInt = 1; anLocalInt <= (hashes.length >> 1) + hashes.length; anLocalInt <<= 1) {
            /* empty */
        }
        nameHashes = new int[anLocalInt + anLocalInt];
        for (int anLocalInt_5_ = 0; anLocalInt + anLocalInt > anLocalInt_5_; anLocalInt_5_++)
            nameHashes[anLocalInt_5_] = -1;
        for (int ptr = 0; ptr < hashes.length; ptr++) {
            int anLocalInt_7_;
            for (anLocalInt_7_ = hashes[ptr] & anLocalInt - 1; nameHashes[anLocalInt_7_ + anLocalInt_7_ + 1] != -1; anLocalInt_7_ = anLocalInt - 1 & anLocalInt_7_ + 1) {
                /* empty */
            }
            nameHashes[anLocalInt_7_ + anLocalInt_7_] = hashes[ptr];
            nameHashes[anLocalInt_7_ - (-anLocalInt_7_ - 1)] = ptr;
        }
    }

}
