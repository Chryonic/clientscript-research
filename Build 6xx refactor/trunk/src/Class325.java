/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class325
{
    private long aLong2676;
    private int anInt2677;
    private DoublyLinkedNode[] aClass59_Array2678DoublyLinked;
    private DoublyLinkedNode aClass59__2679DoublyLinked;
    
    static final int method3682(int argument) {
	if (Node_Sub31_Sub39.aBoolean6055)
	    return 6;
	if (Class84.aClass59_Sub51_Sub9_601 == null)
	    return 0;
	int anLocalInt
	    = ((MenuAction) Class84.aClass59_Sub51_Sub9_601).action;
	if (Statics.method2568(anLocalInt, (byte) -79))
	    return 1;
	if (Class9.method243((byte) 6, anLocalInt))
	    return 2;
	if (Class200.method2912(anLocalInt, -1))
	    return 3;
	if (Statics.method3411(anLocalInt, -13))
	    return 4;
	return 5;
    }
    
    final DoublyLinkedNode method3683(byte argument_0_) {
	if (aClass59__2679DoublyLinked == null)
	    return null;
	for (DoublyLinkedNode class59_DoublyLinked
		 = aClass59_Array2678DoublyLinked[(int) (aLong2676
						  & (long) (anInt2677 - 1))];
	     aClass59__2679DoublyLinked != class59_DoublyLinked;
	     aClass59__2679DoublyLinked
		 = ((DoublyLinkedNode) aClass59__2679DoublyLinked).nextD) {
	    if (aLong2676 == ((DoublyLinkedNode) aClass59__2679DoublyLinked).id) {
		DoublyLinkedNode class59__1_DoublyLinked_ = aClass59__2679DoublyLinked;
		aClass59__2679DoublyLinked = (((DoublyLinkedNode) aClass59__2679DoublyLinked)
				       .nextD);
		return class59__1_DoublyLinked_;
	    }
	}
	aClass59__2679DoublyLinked = null;
	return null;
    }
    
    final void method3684(DoublyLinkedNode argument_2_, byte argument_3_,
			  long argument_4_) {
	if (((DoublyLinkedNode) argument_2_).prevD != null)
	    argument_2_.unlinkD();
	DoublyLinkedNode class59_DoublyLinked
	    = (aClass59_Array2678DoublyLinked
	       [(int) (argument_4_ & (long) (anInt2677 - 1))]);
	((DoublyLinkedNode) argument_2_).prevD
	    = ((DoublyLinkedNode) class59_DoublyLinked).prevD;
	((DoublyLinkedNode) argument_2_).nextD = class59_DoublyLinked;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument_2_).prevD)
	    .nextD
	    = argument_2_;
	((DoublyLinkedNode) argument_2_).id = argument_4_;
	((DoublyLinkedNode) ((DoublyLinkedNode) argument_2_).nextD)
	    .prevD
	    = argument_2_;
    }
    
    final DoublyLinkedNode method3685(int argument_5_, long argument_6_) {
	aLong2676 = argument_6_;
	DoublyLinkedNode class59_DoublyLinked
	    = (aClass59_Array2678DoublyLinked
	       [(int) ((long) (anInt2677 - 1) & argument_6_)]);
	for (aClass59__2679DoublyLinked
		 = ((DoublyLinkedNode) class59_DoublyLinked).nextD;
	     class59_DoublyLinked != aClass59__2679DoublyLinked;
	     aClass59__2679DoublyLinked
		 = ((DoublyLinkedNode) aClass59__2679DoublyLinked).nextD) {
	    if (((DoublyLinkedNode) aClass59__2679DoublyLinked).id
		== argument_6_) {
		DoublyLinkedNode class59__7_DoublyLinked_ = aClass59__2679DoublyLinked;
		aClass59__2679DoublyLinked = (((DoublyLinkedNode) aClass59__2679DoublyLinked)
				       .nextD);
		return class59__7_DoublyLinked_;
	    }
	}
	aClass59__2679DoublyLinked = null;
	return null;
    }
    
    Class325(int argument_8_) {
	aClass59_Array2678DoublyLinked = new DoublyLinkedNode[argument_8_];
	anInt2677 = argument_8_;
	for (int anLocalInt = 0; anLocalInt < argument_8_; anLocalInt++) {
	    DoublyLinkedNode class59_DoublyLinked
		= aClass59_Array2678DoublyLinked[anLocalInt] = new DoublyLinkedNode();
	    ((DoublyLinkedNode) class59_DoublyLinked).prevD
		= class59_DoublyLinked;
	    ((DoublyLinkedNode) class59_DoublyLinked).nextD
		= class59_DoublyLinked;
	}
    }
}
