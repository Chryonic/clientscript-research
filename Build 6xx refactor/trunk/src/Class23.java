/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class23
{
    private DCyclicLinkedList aDCyclicLinkedList_151;
    private DoublyLinkedNode aClass59__152DoublyLinked;
    static JagexHashMap aJagexHashMap_153;
    static long aLong154 = 1L;
    static Class213 aClass213_155;
    
    final DoublyLinkedNode method334(byte argument_0_) {
	DoublyLinkedNode class59_DoublyLinked
	    = (((DoublyLinkedNode) ((DCyclicLinkedList) aDCyclicLinkedList_151).rootNode)
	       .nextD);
	if (class59_DoublyLinked == ((DCyclicLinkedList) aDCyclicLinkedList_151).rootNode) {
	    aClass59__152DoublyLinked = null;
	    return null;
	}
	aClass59__152DoublyLinked
	    = ((DoublyLinkedNode) class59_DoublyLinked).nextD;
	return class59_DoublyLinked;
    }
    
    public static void method335(int argument) {
	aJagexHashMap_153 = null;
	aClass213_155 = null;
    }
    
    final DoublyLinkedNode method336(int argument_1_) {
	DoublyLinkedNode class59_DoublyLinked = aClass59__152DoublyLinked;
	if (((DCyclicLinkedList) aDCyclicLinkedList_151).rootNode == class59_DoublyLinked) {
	    aClass59__152DoublyLinked = null;
	    return null;
	}
	aClass59__152DoublyLinked
	    = ((DoublyLinkedNode) class59_DoublyLinked).nextD;
	return class59_DoublyLinked;
    }
    
    public Class23() {
	/* empty */
    }
    
    Class23(DCyclicLinkedList argument_2_) {
	aDCyclicLinkedList_151 = argument_2_;
    }
    
    static {
	aJagexHashMap_153 = new JagexHashMap(32);
    }
}
