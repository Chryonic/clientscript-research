/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151
{
    static int anInt1143;
    private Node aNode_1144;
    static Class166 aClass166_1145 = new Class166(113, 0);
    static CyclicLinkedList aCyclicLinkedList_1146 = new CyclicLinkedList();
    private CyclicLinkedList aCyclicLinkedList_1147;
    static int anInt1148;
    
    final Node method2547(int argument_0_) {
	Node node
	    = (((Node) ((CyclicLinkedList) aCyclicLinkedList_1147).rootNode)
	       .next);
	if (((CyclicLinkedList) aCyclicLinkedList_1147).rootNode == node) {
	    aNode_1144 = null;
	    return null;
	}
	aNode_1144 = ((Node) node).next;
	return node;
    }
    
    public static void method2548(int argument) {
	aClass166_1145 = null;
	aCyclicLinkedList_1146 = null;
    }
    
    final Node method2549(byte argument_1_) {
	Node node = aNode_1144;
	if (((CyclicLinkedList) aCyclicLinkedList_1147).rootNode == node) {
	    aNode_1144 = null;
	    return null;
	}
	aNode_1144 = ((Node) node).next;
	return node;
    }
    
    final void method2550(CyclicLinkedList argument_2_, int argument_3_) {
	aCyclicLinkedList_1147 = argument_2_;
    }
    
    public Class151() {
	/* empty */
    }
    
    Class151(CyclicLinkedList argument_4_) {
	aCyclicLinkedList_1147 = argument_4_;
    }
}
