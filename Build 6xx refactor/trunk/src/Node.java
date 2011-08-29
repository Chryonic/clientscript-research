/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node {
    long hash;
    Node next;
    Node prev;

    final boolean isLinked() {
        return this.prev != null;
    }

    final void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
    }

    public Node() {
        /* empty */
    }
}
