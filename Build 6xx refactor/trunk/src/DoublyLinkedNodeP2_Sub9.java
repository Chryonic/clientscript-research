/* Class104_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub9 extends DoublyLinkedNodeP2
{
    int anInt4586;
    int anInt4587;
    int anInt4588;
    int anInt4589;
    int anInt4590;
    boolean aBoolean4591 = false;
    
    final boolean method1942(int argument_0_, int argument_1_) {
	if (!((DoublyLinkedNodeP2_Sub9) this).aBoolean4591)
	    return false;
	int anLocalInt = (((DoublyLinkedNodeP2_Sub9) this).anInt4590
			  - ((DoublyLinkedNodeP2_Sub9) this).anInt4588);
	int anLocalInt_2_ = (((DoublyLinkedNodeP2_Sub9) this).anInt4587
			     - ((DoublyLinkedNodeP2_Sub9) this).anInt4589);
	int anLocalInt_3_
	    = anLocalInt * anLocalInt + anLocalInt_2_ * anLocalInt_2_;
	int anLocalInt_4_
	    = (argument_0_ * anLocalInt + argument_1_ * anLocalInt_2_
	       - (((DoublyLinkedNodeP2_Sub9) this).anInt4588 * anLocalInt
		  + ((DoublyLinkedNodeP2_Sub9) this).anInt4589 * anLocalInt_2_));
	if (anLocalInt_4_ <= 0) {
	    int anLocalInt_5_ = ((DoublyLinkedNodeP2_Sub9) this).anInt4588 - argument_0_;
	    int anLocalInt_6_ = ((DoublyLinkedNodeP2_Sub9) this).anInt4589 - argument_1_;
	    if (anLocalInt_5_ * anLocalInt_5_ + anLocalInt_6_ * anLocalInt_6_
		>= (((DoublyLinkedNodeP2_Sub9) this).anInt4586
		    * ((DoublyLinkedNodeP2_Sub9) this).anInt4586))
		return false;
	    return true;
	}
	if (anLocalInt_4_ > anLocalInt_3_) {
	    int anLocalInt_7_ = ((DoublyLinkedNodeP2_Sub9) this).anInt4590 - argument_0_;
	    int anLocalInt_8_ = ((DoublyLinkedNodeP2_Sub9) this).anInt4587 - argument_1_;
	    if (anLocalInt_7_ * anLocalInt_7_ + anLocalInt_8_ * anLocalInt_8_
		>= (((DoublyLinkedNodeP2_Sub9) this).anInt4586
		    * ((DoublyLinkedNodeP2_Sub9) this).anInt4586))
		return false;
	    return true;
	}
	anLocalInt_4_ = (anLocalInt_4_ << 10) / anLocalInt_3_;
	int anLocalInt_9_
	    = (((DoublyLinkedNodeP2_Sub9) this).anInt4588
	       + (anLocalInt * anLocalInt_4_ >> 10) - argument_0_);
	int anLocalInt_10_
	    = (((DoublyLinkedNodeP2_Sub9) this).anInt4589
	       + (anLocalInt_2_ * anLocalInt_4_ >> 10) - argument_1_);
	if (anLocalInt_9_ * anLocalInt_9_ + anLocalInt_10_ * anLocalInt_10_
	    >= (((DoublyLinkedNodeP2_Sub9) this).anInt4586
		* ((DoublyLinkedNodeP2_Sub9) this).anInt4586))
	    return false;
	return true;
    }
    
    public DoublyLinkedNodeP2_Sub9() {
	/* empty */
    }
}
