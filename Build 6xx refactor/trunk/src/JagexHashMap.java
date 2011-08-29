/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexHashMap {
    Node[] aNodeArray485;
    int anInt486;
    private long aLong487;
    static int[] anIntArray488 = new int[14];
    static int anInt489;
    static int anInt490 = 0;
    private Node aNode_491;
    private Node aNode_492;
    private int anInt493 = 0;

    final int method1520(int argument_0_, Node[] argument_1_) {
        int anLocalInt = argument_0_;
        for (int anLocalInt_2_ = 0; this.anInt486 > anLocalInt_2_; anLocalInt_2_++) {
            Node node = this.aNodeArray485[anLocalInt_2_];
            for (Node node_3_ = node.next; node_3_ != node; node_3_ = node_3_.next)
                argument_1_[anLocalInt++] = node_3_;
        }
        return anLocalInt;
    }

    final Node get(long argument_4_) {
        aLong487 = argument_4_;
        Node node = (this.aNodeArray485[(int) (argument_4_ & (long) (this.anInt486 - 1))]);
        for (aNode_491 = node.next; node != aNode_491; aNode_491 = aNode_491.next) {
            if (argument_4_ == aNode_491.hash) {
                Node node_6_ = aNode_491;
                aNode_491 = aNode_491.next;
                return node_6_;
            }
        }
        aNode_491 = null;
        return null;
    }

    static final Class349[] method1522() {
        return (new Class349[]{Class226.aClass349_1639, Class131.aClass349_1062, Class209.aClass349_1501});
    }

    final Node next() {
        if (anInt493 > 0 && aNode_492 != (this.aNodeArray485[anInt493 - 1])) {
            Node node = aNode_492;
            aNode_492 = node.next;
            return node;
        }
        while (anInt493 < this.anInt486) {
            Node node = (this.aNodeArray485[anInt493++].next);
            if (node != this.aNodeArray485[anInt493 - 1]) {
                aNode_492 = node.next;
                return node;
            }
        }
        return null;
    }

    final int method1524() {
        return this.anInt486;
    }

    public static void method1525() {
        anIntArray488 = null;
        Applet_Sub1.gameCanvas = null;
    }

    final Node method1526() {
        if (aNode_491 == null)
            return null;
        for (Node node = (this.aNodeArray485[(int) ((long) (this.anInt486 - 1) & aLong487)]); node != aNode_491; aNode_491 = aNode_491.next) {
            if (aNode_491.hash == aLong487) {
                Node node_10_ = aNode_491;
                aNode_491 = aNode_491.next;
                return node_10_;
            }
        }
        aNode_491 = null;
        return null;
    }

    final void method1527(int argument_11_) {
        for (int anLocalInt = argument_11_; this.anInt486 > anLocalInt; anLocalInt++) {
            Node node = this.aNodeArray485[anLocalInt];
            for (; ; ) {
                Node node_12_ = node.next;
                if (node_12_ == node)
                    break;
                node_12_.unlink();
            }
        }
        aNode_492 = null;
        aNode_491 = null;
    }

    final Node first(int argument_13_) {
        anInt493 = argument_13_;
        return next();
    }

    static final void method1529(Node_Sub9_Sub2 argument, int argument_14_, boolean argument_15_) {
        if (argument_14_ >= 20) {
            tia_sub_35_Sub1DoublyLinked.aClass112_6659.method2003(argument, (byte) 114);
            if (argument_15_)
                Node_Sub31_Sub34.method985(tia_sub_35_Sub1DoublyLinked.aClass112_6659, ClanSettingsDelta.aJs5Store_1546, argument, Class314.aJs5Store_2603, Node_Sub31_Sub4.aJs5Store_5856, 1158);
        }
    }

    JagexHashMap(int argument_16_) {
        this.anInt486 = argument_16_;
        this.aNodeArray485 = new Node[argument_16_];
        for (int anLocalInt = 0; argument_16_ > anLocalInt; anLocalInt++) {
            Node node = (this.aNodeArray485[anLocalInt] = new Node());
            node.prev = node;
            node.next = node;
        }
    }

    final void put(long id, Node argument_18_) {
        if (argument_18_.prev != null)
            argument_18_.unlink();
        Node node = (this.aNodeArray485[(int) ((long) (this.anInt486 - 1) & id)]);
        argument_18_.next = node;
        argument_18_.prev = node.prev;
        argument_18_.prev.next = argument_18_;
        argument_18_.hash = id;
        argument_18_.next.prev = argument_18_;
    }

    final int count() {
        int anLocalInt = 0;
        for (int anLocalInt_21_ = 0; anLocalInt_21_ < this.anInt486; anLocalInt_21_++) {
            Node node = this.aNodeArray485[anLocalInt_21_];
            for (Node node_22_ = node.next; node != node_22_; node_22_ = node_22_.next)
                anLocalInt++;
        }
        return anLocalInt;
    }
}
