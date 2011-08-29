/* Class59_Sub51_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub5 extends DoublyLinkedNode
{
    int anInt6241 = 0;
    static Class66 aClass66_6242;
    
    final void method1196(int argument_0_, Packet argument_1_) {
	for (;;) {
	    int anLocalInt = argument_1_.g1();
	    if (anLocalInt == 0)
		break;
	    method1201(argument_1_, anLocalInt, 74);
	}
    }
    
    static final DoublyLinkedNode_Sub51_Sub3 method1197(byte argument) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = ((DoublyLinkedNode_Sub51_Sub3)
	       Statics.aDCyclicLinkedList_6734.getFirst());
	if (class59_sub51_sub3 != null) {
	    class59_sub51_sub3.unlink();
	    class59_sub51_sub3.unlinkD();
	    return class59_sub51_sub3;
	}
	do {
	    class59_sub51_sub3
		= ((DoublyLinkedNode_Sub51_Sub3)
		   DoublyLinkedNodeP2_Sub2_Sub3_Sub1.aDCyclicLinkedList_6591.getFirst());
	    if (class59_sub51_sub3 == null)
		return null;
	    if (class59_sub51_sub3.method1180(7) > Applet_Sub1.getGameTime())
		return null;
	    class59_sub51_sub3.unlink();
	    class59_sub51_sub3.unlinkD();
	} while ((((DoublyLinkedNode) class59_sub51_sub3).id
		  & ~0x7fffffffffffffffL)
		 == 0L);
	return class59_sub51_sub3;
    }
    
    static final void method1198
	(int argument, int argument_2_, int argument_3_, int argument_4_,
	 int argument_5_, int argument_6_, int argument_7_, byte argument_8_) {
	int anLocalInt = argument_5_ - 334;
	if (anLocalInt < 0)
	    anLocalInt = 0;
	else if (anLocalInt > 100)
	    anLocalInt = 100;
	int anLocalInt_9_
	    = Class25.aShort165 + (Class245_Sub1_Sub1.aShort6515
				   - Class25.aShort165) * anLocalInt / 100;
	argument_7_ = argument_7_ * anLocalInt_9_ >> 8;
	Class390.anInt3285 = Class390.anInt3284 * anLocalInt_9_ >> 8;
	int anLocalInt_10_ = -argument_4_ + 16384 & 0x3fff;
	int anLocalInt_11_ = -argument_2_ + 16384 & 0x3fff;
	int anLocalInt_12_ = 0;
	int anLocalInt_13_ = 0;
	int anLocalInt_14_ = argument_7_;
	if (anLocalInt_10_ != 0) {
	    anLocalInt_13_ = -anLocalInt_14_ * (Node_Sub6.SINETABLE
						[anLocalInt_10_]) >> 14;
	    anLocalInt_14_
		= (Node_Sub6.COSINETABLE[anLocalInt_10_] * anLocalInt_14_
		   >> 14);
	}
	if (anLocalInt_11_ != 0) {
	    anLocalInt_12_
		= (anLocalInt_14_ * Node_Sub6.SINETABLE[anLocalInt_11_]
		   >> 14);
	    anLocalInt_14_
		= (anLocalInt_14_ * Node_Sub6.COSINETABLE[anLocalInt_11_]
		   >> 14);
	}
	Class287.anInt2299 = argument_6_ - anLocalInt_12_;
	Class2_Sub2.anInt3763 = -anLocalInt_13_ + argument_3_;
	Node_Sub47_Sub3.anInt6167 = argument_2_;
	Class361.anInt3055 = 0;
	Class293.anInt2404 = argument_4_;
	Node_Sub31_Sub30.anInt5987 = -anLocalInt_14_ + argument;
    }
    
    public static void method1199(byte argument) {
	aClass66_6242 = null;
    }
    
    static final void method1200(int argument, int argument_15_,
				 Class120 argument_16_, int argument_17_,
				 int argument_18_, int argument_19_) {
	if (argument_17_ != 9288)
	    method1200(44, -127, null, -27, -55, 88);
	Node_Sub2 class59_sub2 = null;
	for (Node_Sub2 class59_sub2_20_
		 = ((Node_Sub2)
		    Class88.aCyclicLinkedList_643.getFirst());
	     class59_sub2_20_ != null;
	     class59_sub2_20_
		 = (Node_Sub2) Class88.aCyclicLinkedList_643
				      .getNext()) {
	    if (((Node_Sub2) class59_sub2_20_).anInt3871 == argument_19_
		&& argument_15_ == ((Node_Sub2) class59_sub2_20_).anInt3883
		&& ((Node_Sub2) class59_sub2_20_).anInt3882 == argument
		&& (((Node_Sub2) class59_sub2_20_).anInt3881
		    == argument_18_)) {
		class59_sub2 = class59_sub2_20_;
		break;
	    }
	}
	if (class59_sub2 == null) {
	    class59_sub2 = new Node_Sub2();
	    ((Node_Sub2) class59_sub2).anInt3882 = argument;
	    ((Node_Sub2) class59_sub2).anInt3881 = argument_18_;
	    ((Node_Sub2) class59_sub2).anInt3871 = argument_19_;
	    ((Node_Sub2) class59_sub2).anInt3883 = argument_15_;
	    Class88.aCyclicLinkedList_643.add(class59_sub2);
	}
	((Node_Sub2) class59_sub2).aBoolean3873 = false;
	((Node_Sub2) class59_sub2).aBoolean3875 = true;
	((Node_Sub2) class59_sub2).aClass120_3877 = argument_16_;
    }
    
    public DoublyLinkedNode_Sub51_Sub5() {
	/* empty */
    }
    
    private final void method1201(Packet argument_21_, int argument_22_,
				  int argument_23_) {
	if (argument_23_ < 25)
	    ((DoublyLinkedNode_Sub51_Sub5) this).anInt6241 = -73;
	if (argument_22_ == 2)
	    ((DoublyLinkedNode_Sub51_Sub5) this).anInt6241 = argument_21_.g2();
    }
    
    static final Class167 method1202
	(int argument, int argument_24_, int argument_25_, byte argument_26_,
	 int argument_27_, int argument_28_, GraphicsToolkit argument_29_) {
	long l = (long) argument_27_;
	Class167 class167
	    = (Class167) Class350_Sub2.aClass149_5436.get(l);
	int anLocalInt = 2055;
	if (class167 == null) {
	    Class101 class101
		= tia_sub_35_Sub1DoublyLinked.method1219(2085750768, Node_Sub49.aJs5Store_4292, argument_27_, 0);
	    if (class101 == null)
		return null;
	    if (((Class101) class101).anInt820 < 13)
		class101.method1733(17496, 2);
	    class167 = argument_29_.method2057(class101, anLocalInt,
					       Class389.anInt3280, 64, 768);
	    Class350_Sub2.aClass149_5436.put(class167, l);
	}
	class167 = class167.method2651((byte) 2, anLocalInt, true);
	if (argument_28_ != 0)
	    class167.a(argument_28_);
	if (argument_24_ != 0)
	    class167.FA(argument_24_);
	if (argument_25_ != 0)
	    class167.VA(argument_25_);
	if (argument != 0)
	    class167.H(0, argument, 0);
	return class167;
    }
}
