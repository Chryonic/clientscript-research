/* Class59_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class DoublyLinkedNode extends Node {
    long id;
    DoublyLinkedNode prevD;
    DoublyLinkedNode nextD;

    final void unlinkD() {
        if (this.prevD != null) {
            this.prevD.nextD = this.nextD;
            this.nextD.prevD = this.prevD;
            this.nextD = null;
            this.prevD = null;
        }
    }

    final boolean isLinkedD() {
        return this.prevD != null;
    }

    public DoublyLinkedNode() {
        /* empty */
    }
}
