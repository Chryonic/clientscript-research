/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DCyclicLinkedList {
    DoublyLinkedNode rootNode = new DoublyLinkedNode();
    static long aLong446 = 0L;
    private DoublyLinkedNode currentNode;

    final void add(DoublyLinkedNode node) {
        if (node.prevD != null)
            node.unlinkD();
        node.nextD = this.rootNode;
        node.prevD = (this.rootNode.prevD);
        node.prevD.nextD = node;
        node.nextD.prevD = node;
    }

    final int size() {
        int count = 0;
        for (DoublyLinkedNode node = (this.rootNode.nextD); this.rootNode != node; node = node.nextD)
            count++;
        return count;
    }

    final DoublyLinkedNode getFirst() {
        DoublyLinkedNode class59_DoublyLinked = (this.rootNode.nextD);
        if (this.rootNode == class59_DoublyLinked) {
            currentNode = null;
            return null;
        }
        currentNode = class59_DoublyLinked.nextD;
        return class59_DoublyLinked;
    }

    final DoublyLinkedNode remove() {
        DoublyLinkedNode node = (this.rootNode.nextD);
        if (this.rootNode == node)
            return null;
        node.unlinkD();
        return node;
    }

    final DoublyLinkedNode getNext() {
        DoublyLinkedNode node = currentNode;
        if (node == this.rootNode) {
            currentNode = null;
            return null;
        }
        currentNode = node.nextD;
        return node;
    }

    final void clear() {
        for (; ; ) {
            DoublyLinkedNode class59_DoublyLinked = (this.rootNode.nextD);
            if (class59_DoublyLinked == this.rootNode)
                break;
            class59_DoublyLinked.unlinkD();
        }
        currentNode = null;
    }

    public DCyclicLinkedList() {
        this.rootNode.prevD = this.rootNode;
        this.rootNode.nextD = this.rootNode;
    }
}
