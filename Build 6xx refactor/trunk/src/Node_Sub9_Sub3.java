/* Class59_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub9_Sub3 extends Node_Sub9
{
    private CyclicLinkedList aCyclicLinkedList_5788 = new CyclicLinkedList();
    private CyclicLinkedList aCyclicLinkedList_5789 = new CyclicLinkedList();
    private int anInt5790 = 0;
    private int anInt5791 = -1;
    
    private final void method623(int[] argument_0_, int argument_1_,
				 int argument_2_) {
	for (Node_Sub9 class59_sub9
		 = (Node_Sub9) aCyclicLinkedList_5788.getFirst();
	     class59_sub9 != null;
	     class59_sub9 = (Node_Sub9) aCyclicLinkedList_5788.getNext())
	    class59_sub9.method579(argument_0_, argument_1_, argument_2_);
    }
    
    private final void method624(Node_Sub42 argument_3_) {
	argument_3_.unlink();
	argument_3_.method1079();
	Node node
	    = (((Node) ((CyclicLinkedList) aCyclicLinkedList_5789).rootNode)
	       .next);
	if (node == ((CyclicLinkedList) aCyclicLinkedList_5789).rootNode)
	    anInt5791 = -1;
	else
	    anInt5791 = ((Node_Sub42) (Node_Sub42) node).anInt4206;
    }
    
    private final void method625(Node argument_4_,
				 Node_Sub42 argument_5_) {
	for (/**/;
	     (argument_4_ != ((CyclicLinkedList) aCyclicLinkedList_5789).rootNode
	      && (((Node_Sub42) (Node_Sub42) argument_4_).anInt4206
		  <= ((Node_Sub42) argument_5_).anInt4206));
	     argument_4_ = ((Node) argument_4_).next) {
	    /* empty */
	}
	Class62_Sub21.method1441(argument_5_, 9476, argument_4_);
	anInt5791 = ((Node_Sub42) (Node_Sub42)
		     (((Node) ((CyclicLinkedList) aCyclicLinkedList_5789).rootNode)
		      .next)).anInt4206;
    }
    
    final synchronized void method626(Node_Sub9 argument_6_) {
	argument_6_.unlink();
    }
    
    final int method575() {
	return 0;
    }
    
    final Node_Sub9 method577() {
	return (Node_Sub9) aCyclicLinkedList_5788.getNext();
    }
    
    final synchronized void method578(int[] argument_7_, int argument_8_,
				      int argument_9_) {
	do {
	    if (anInt5791 < 0) {
		method623(argument_7_, argument_8_, argument_9_);
		break;
	    }
	    if (anInt5790 + argument_9_ < anInt5791) {
		anInt5790 += argument_9_;
		method623(argument_7_, argument_8_, argument_9_);
		break;
	    }
	    int anLocalInt = anInt5791 - anInt5790;
	    method623(argument_7_, argument_8_, anLocalInt);
	    argument_8_ += anLocalInt;
	    argument_9_ -= anLocalInt;
	    anInt5790 += anLocalInt;
	    method630();
	    Node_Sub42 class59_sub42
		= (Node_Sub42) aCyclicLinkedList_5789.getFirst();
	    synchronized (class59_sub42) {
		int anLocalInt_10_ = class59_sub42.method1078(this);
		if (anLocalInt_10_ < 0) {
		    ((Node_Sub42) class59_sub42).anInt4206 = 0;
		    method624(class59_sub42);
		} else {
		    ((Node_Sub42) class59_sub42).anInt4206 = anLocalInt_10_;
		    method625(((Node) class59_sub42).next,
			      class59_sub42);
		}
	    }
	} while (argument_9_ != 0);
    }
    
    final synchronized int method627() {
	return aCyclicLinkedList_5788.getSize();
    }
    
    final Node_Sub9 method573() {
	return (Node_Sub9) aCyclicLinkedList_5788.getFirst();
    }
    
    final synchronized void method574(int argument_11_) {
	do {
	    if (anInt5791 < 0) {
		method628(argument_11_);
		break;
	    }
	    if (anInt5790 + argument_11_ < anInt5791) {
		anInt5790 += argument_11_;
		method628(argument_11_);
		break;
	    }
	    int anLocalInt = anInt5791 - anInt5790;
	    method628(anLocalInt);
	    argument_11_ -= anLocalInt;
	    anInt5790 += anLocalInt;
	    method630();
	    Node_Sub42 class59_sub42
		= (Node_Sub42) aCyclicLinkedList_5789.getFirst();
	    synchronized (class59_sub42) {
		int anLocalInt_12_ = class59_sub42.method1078(this);
		if (anLocalInt_12_ < 0) {
		    ((Node_Sub42) class59_sub42).anInt4206 = 0;
		    method624(class59_sub42);
		} else {
		    ((Node_Sub42) class59_sub42).anInt4206 = anLocalInt_12_;
		    method625(((Node) class59_sub42).next,
			      class59_sub42);
		}
	    }
	} while (argument_11_ != 0);
    }
    
    private final void method628(int argument_13_) {
	for (Node_Sub9 class59_sub9
		 = (Node_Sub9) aCyclicLinkedList_5788.getFirst();
	     class59_sub9 != null;
	     class59_sub9 = (Node_Sub9) aCyclicLinkedList_5788.getNext())
	    class59_sub9.method574(argument_13_);
    }
    
    final synchronized void method629(Node_Sub9 argument_14_) {
	aCyclicLinkedList_5788.addBegin(argument_14_);
    }
    
    private final void method630() {
	if (anInt5790 > 0) {
	    for (Node_Sub42 class59_sub42
		     = (Node_Sub42) aCyclicLinkedList_5789.getFirst();
		 class59_sub42 != null;
		 class59_sub42
		     = (Node_Sub42) aCyclicLinkedList_5789.getNext())
		((Node_Sub42) class59_sub42).anInt4206 -= anInt5790;
	    anInt5791 -= anInt5790;
	    anInt5790 = 0;
	}
    }
    
    public Node_Sub9_Sub3() {
	/* empty */
    }
}
