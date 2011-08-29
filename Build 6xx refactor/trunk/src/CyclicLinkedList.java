/* Class331 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CyclicLinkedList {
    Node rootNode = new Node();
    private Node currentNode;

    final int getSize() {
        int size = 0;
        for (Node node = this.rootNode.next; this.rootNode != node; node = node.next)
            size++;
        return size;
    }

    final boolean isEmpty() {
        return this.rootNode == this.rootNode.next;
    }

    final Node getEnd() {
        Node node = this.rootNode.prev;
        if (node == this.rootNode) {
            currentNode = null;
            return null;
        }
        currentNode = node.prev;
        return node;
    }

    final Node getNext() {
        Node node = currentNode;
        if (this.rootNode == node) {
            currentNode = null;
            return null;
        }
        currentNode = node.next;
        return node;
    }

    final Node remove() {
        Node node = this.rootNode.next;
        if (this.rootNode == node)
            return null;
        node.unlink();
        return node;
    }

    final void add(Node node) {
        if (node.prev != null)
            node.unlink();
        node.next = this.rootNode;
        node.prev = this.rootNode.prev;
        node.prev.next = node;
        node.next.prev = node;
    }

    final void addBegin(Node node) {
        if (node.prev != null)
            node.unlink();
        node.prev = this.rootNode;
        node.next = this.rootNode.next;
        node.prev.next = node;
        node.next.prev = node;
    }

    final void method3716(CyclicLinkedList argument_9_) {
        method3717(this.rootNode.next, argument_9_);
    }

    private void method3717(Node _node, CyclicLinkedList list) {
        Node lastNode = this.rootNode.prev;
        this.rootNode.prev = _node.prev;
        _node.prev.next = this.rootNode;
        if (_node != this.rootNode) {
                _node.prev = (list.rootNode.prev);
                _node.prev.next = _node;
                list.rootNode.prev = lastNode;
                lastNode.next = list.rootNode;
        }
    }

    final Node get() {
        Node node = currentNode;
        if (this.rootNode == node) {
            currentNode = null;
            return null;
        }
        currentNode = node.prev;
        return node;
    }

    final void clear() {
        for (; ; ) {
            Node node = this.rootNode.next;
            if (node == this.rootNode)
                break;
            node.unlink();
        }
        currentNode = null;
    }

    final Node getFirst() {
        Node node = this.rootNode.next;
        if (node == this.rootNode) {
            currentNode = null;
            return null;
        }
        currentNode = node.next;
        return node;
    }

    public CyclicLinkedList() {
        this.rootNode.next = this.rootNode;
        this.rootNode.prev = this.rootNode;
    }
}
