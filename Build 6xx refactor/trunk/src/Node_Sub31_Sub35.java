/* Class59_Sub31_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub35 extends Node_Sub31
{
    private int anInt6010;
    private int anInt6011;
    static Js5Store aJs5Store_6012;
    private int anInt6013;
    
    final int[][] method870(int argument_0_, byte argument_1_) {
	if (argument_1_ != -9)
	    return null;
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 84,
							       argument_0_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_2_ = anLocalInts[0];
	    int[] anLocalInts_3_ = anLocalInts[1];
	    int[] anLocalInts_4_ = anLocalInts[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		anLocalInts_2_[anLocalInt] = anInt6011;
		anLocalInts_3_[anLocalInt] = anInt6013;
		anLocalInts_4_[anLocalInt] = anInt6010;
	    }
	}
	return anLocalInts;
    }
    
    private Node_Sub31_Sub35(int argument_5_) {
	super(0, false);
	method991(0, argument_5_);
    }
    
    public Node_Sub31_Sub35() {
	this(0);
    }
    
    static final void method987(int argument,
				Entity argument_6_) {
	if (((Entity) argument_6_).anIntArray6783 != null
	    || (((Entity) argument_6_).anIntArray6792
		!= null)) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0;
		 (((Entity) argument_6_).anIntArray6783.length
		  > anLocalInt);
		 anLocalInt++) {
		int anLocalInt_7_ = -1;
		if (((Entity) argument_6_).anIntArray6783
		    != null)
		    anLocalInt_7_ = (((Entity) argument_6_)
				     .anIntArray6783[anLocalInt]);
		if (anLocalInt_7_ == -1) {
		    if (!argument_6_.method1832(anLocalInt, (byte) 71, -1))
			anLocalBoolean = false;
		} else {
		    anLocalBoolean = false;
		    boolean anLocalBoolean_8_ = false;
		    boolean anLocalBoolean_9_ = false;
		    int anLocalInt_10_;
		    int anLocalInt_11_;
		    if ((anLocalInt_7_ & ~0x3fffffff) == -1073741824) {
			int anLocalInt_12_ = anLocalInt_7_ & 0xfffffff;
			int anLocalInt_13_ = anLocalInt_12_ >> 14;
			int anLocalInt_14_ = anLocalInt_12_ & 0x3fff;
			anLocalInt_11_
			    = (((DoublyLinkedNodeP2_Sub2) argument_6_).worldX
			       - (anLocalInt_13_ - MapRelated.baseX) * 512
			       - 256);
			anLocalInt_10_
			    = (((DoublyLinkedNodeP2_Sub2) argument_6_).worldZ
			       - ((anLocalInt_14_ - MapRelated.baseZ) * 512
				  + 256));
		    } else if ((anLocalInt_7_ & 0x8000) == 0) {
			Node_Sub35 class59_sub35
			    = ((Node_Sub35)
			       Class294.aJagexHashMap_2453
				   .get((long) anLocalInt_7_));
			if (class59_sub35 != null) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				= (((Node_Sub35) class59_sub35)
				   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
			    anLocalInt_10_
				= (((DoublyLinkedNodeP2_Sub2) argument_6_).worldZ
				   - ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub1).worldZ);
			    anLocalInt_11_
				= (((DoublyLinkedNodeP2_Sub2) argument_6_).worldX
				   - ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub1).worldX);
			} else {
			    argument_6_.method1832(anLocalInt, (byte) 71, -1);
			    continue;
			}
		    } else {
			int anLocalInt_15_ = anLocalInt_7_ & 0x7fff;
			DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			       [anLocalInt_15_]);
			if (class104_sub2_sub2_sub5_sub2 != null) {
			    anLocalInt_11_
				= (-((DoublyLinkedNodeP2_Sub2)
				     class104_sub2_sub2_sub5_sub2).worldX
				   + ((DoublyLinkedNodeP2_Sub2) argument_6_).worldX);
			    anLocalInt_10_
				= (((DoublyLinkedNodeP2_Sub2) argument_6_).worldZ
				   - ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldZ);
			} else {
			    argument_6_.method1832(anLocalInt, (byte) 71, -1);
			    continue;
			}
		    }
		    if (anLocalInt_11_ != 0 || anLocalInt_10_ != 0)
			argument_6_.method1832
			    (anLocalInt, (byte) 71,
			     (int) (Math.atan2((double) anLocalInt_11_,
					       (double) anLocalInt_10_)
				    * 2607.5945876176133) & 0x3fff);
		}
	    }
	    if (anLocalBoolean) {
		((Entity) argument_6_).anIntArray6783 = null;
		((Entity) argument_6_).anIntArray6792 = null;
	    }
	}
    }
    
    static final void method988(int argument, byte argument_16_,
				int argument_17_) {
	Class51.method473(0, argument, argument_17_);
    }
    
    public static void method989(byte argument) {
	aJs5Store_6012 = null;
    }
    
    final void method868(Packet argument_18_, int argument_19_,
			 byte argument_20_) {
	int anLocalInt = argument_19_;
	if (anLocalInt == 0)
	    method991(0, argument_18_.g3_dupl());
	if (argument_20_ >= -41)
	    aJs5Store_6012 = null;
    }
    
    static final boolean method990
	(int argument, int argument_21_, int argument_22_, int argument_23_,
	 int argument_24_, int argument_25_, byte[] argument_26_) {
	int anLocalInt = argument % argument_22_;
	int anLocalInt_27_;
	if (anLocalInt != 0)
	    anLocalInt_27_ = -anLocalInt + argument_22_;
	else
	    anLocalInt_27_ = 0;
	int anLocalInt_28_
	    = -((argument_21_ - (-argument_22_ + 1)) / argument_22_);
	int anLocalInt_29_ = -((argument + (argument_22_ - 1)) / argument_22_);
	for (int anLocalInt_30_ = anLocalInt_28_; anLocalInt_30_ < 0;
	     anLocalInt_30_++) {
	    for (int anLocalInt_31_ = anLocalInt_29_; anLocalInt_31_ < 0;
		 anLocalInt_31_++) {
		if (argument_26_[argument_24_] == 0)
		    return true;
		argument_24_ += argument_22_;
	    }
	    argument_24_ -= anLocalInt_27_;
	    if (argument_26_[argument_24_ - 1] == 0)
		return true;
	    argument_24_ += argument_23_;
	}
	return false;
    }
    
    private final void method991(int argument_32_, int argument_33_) {
	anInt6013 = argument_33_ >> 4 & 0xff0;
	anInt6011 = (argument_33_ & 0xff0000) >> 12;
	anInt6010 = argument_33_ << 4 & 0xff0;
	if (argument_32_ != 0)
	    method989((byte) 69);
    }
}
