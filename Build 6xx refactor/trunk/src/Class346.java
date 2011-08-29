/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class346
{
    private static int anInt2909 = 0;
    private static CyclicLinkedList aCyclicLinkedList_2910;
    private static boolean aBoolean2911 = false;
    
    static final synchronized void method3807(int argument) {
	anInt2909--;
	if (anInt2909 == 0)
	    method3811((byte) -43);
    }
    
    static final synchronized void method3808(int argument,
					      boolean argument_0_) {
	aBoolean2911 = argument_0_;
    }
    
    static final synchronized void method3809(Interface3 argument,
					      byte argument_1_) {
	if (!aBoolean2911) {
	    if (anInt2909 <= 0)
		argument.w(false);
	    else {
		Node_Sub4 class59_sub4 = new Node_Sub4();
		((Node_Sub4) class59_sub4).anInterface3_3894 = argument;
		aCyclicLinkedList_2910.add(class59_sub4);
	    }
	}
    }
    
    static final synchronized void method3810(byte argument) {
	anInt2909++;
    }
    
    static final synchronized void method3811(byte argument) {
	for (;;) {
	    Node_Sub4 class59_sub4
		= (Node_Sub4) aCyclicLinkedList_2910.remove();
	    if (class59_sub4 == null)
		break;
	    ((Node_Sub4) class59_sub4).anInterface3_3894.w(true);
	    class59_sub4.unlink();
	}
    }
    
    static {
	aCyclicLinkedList_2910 = new CyclicLinkedList();
    }
}
