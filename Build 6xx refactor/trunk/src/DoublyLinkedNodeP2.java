/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class DoublyLinkedNodeP2 {
    DoublyLinkedNodeP2 aClass104_855;
    DoublyLinkedNodeP2 aClass104_858;

    final void unlink() {
        if (this.aClass104_855 != null) {
            this.aClass104_855.aClass104_858 = this.aClass104_858;
            this.aClass104_858.aClass104_855 = this.aClass104_855;
            this.aClass104_855 = null;
            this.aClass104_858 = null;
        }
    }

    public DoublyLinkedNodeP2() {
        /* empty */
    }

    static {
    }
}
