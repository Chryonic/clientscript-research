/* Class59_Sub51_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub3 extends DoublyLinkedNode
{
    static int anInt6229;
    String aString6230;
    int anInt6231;
    static Js5Store aJs5Store_6232;
    int anInt6233;
    int anInt6234;
    static int anInt6235 = -1;
    
    final long method1180(int argument_0_) {
	return ((DoublyLinkedNode) this).id & 0x7fffffffffffffffL;
    }
    
    final void method1181(int argument_1_) {
	((DoublyLinkedNode) this).id
	    = (Applet_Sub1.getGameTime() + 500L
	       | ((DoublyLinkedNode) this).id & ~0x7fffffffffffffffL);
	DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aDCyclicLinkedList_6591.add(this);
    }
    
    final void method1182(int argument_2_) {
	((DoublyLinkedNode) this).id |= ~0x7fffffffffffffffL;
	if (method1180(7) == 0L)
	    Statics.aDCyclicLinkedList_6734.add(this);
    }
    
    final int method1183(int argument_3_) {
	return (int) (((Node) this).hash >>> 56 & 0xffL);
    }
    
    final long method1184(int argument_4_) {
	return ((Node) this).hash & 0xffffffffffffffL;
    }
    
    DoublyLinkedNode_Sub51_Sub3(int argument_5_, long argument_6_) {
	((Node) this).hash = (long) argument_5_ << 56 | argument_6_;
    }
    
    static final boolean method1185(int argument, int argument_7_) {
	if (argument_7_ != 3 && argument_7_ != 7 && argument_7_ != 10)
	    return false;
	return true;
    }
    
    public static void method1186(byte argument) {
	aJs5Store_6232 = null;
    }
}
