/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class124
{
    int anInt1003;
    int anInt1004;
    int anInt1005 = -1;
    int anInt1006;
    int anInt1007;
    int anInt1008;
    int anInt1009;
    int anInt1010;
    int anInt1011;
    static CyclicLinkedList aCyclicLinkedList_1012 = new CyclicLinkedList();
    
    public static void method2398(byte argument) {
	aCyclicLinkedList_1012 = null;
    }
    
    static final void method2399
	(Entity argument, int argument_0_, int argument_1_,
	 byte argument_2_, int argument_3_, int argument_4_, int argument_5_,
	 int argument_6_, int argument_7_,
	 Entity argument_8_) {
	int anLocalInt = argument_8_.method1834(-1);
	if (anLocalInt != -1) {
	    Object object = null;
	    Class368 class368
		= ((Class368)
		   Statics.aClass149_4512.get((long) anLocalInt));
	    if (class368 == null) {
		Class83[] class83s = Class83.method1608(Class205.aJs5Store_1472,
							anLocalInt, 0);
		if (class83s == null)
		    return;
		class368
		    = Class389.aGraphicsToolkit3281.method2033(class83s[0], true);
		Statics.aClass149_4512.put(class368, (long) anLocalInt);
	    }
	    Class189_Sub1.method2875(((DoublyLinkedNodeP2_Sub2) argument).worldZ, 0,
				     ((DoublyLinkedNodeP2_Sub2) argument).worldX,
				     argument_7_, argument_3_, true,
				     argument_6_ >> 1,
				     ((DoublyLinkedNodeP2_Sub2) argument).lightingHL,
				     argument.method1830(-126) * 256,
				     argument_5_ >> 1);
	    int anLocalInt_9_
		= argument_1_ + (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] - 18);
	    int anLocalInt_10_
		= DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1] + argument_0_ - 70;
	    anLocalInt_9_ += argument_4_ / 4 * 18;
	    anLocalInt_10_ += argument_4_ % 4 * 18;
	    class368.method4014(anLocalInt_9_, anLocalInt_10_);
	    if (argument == argument_8_)
		Class389.aGraphicsToolkit3281.method2028(anLocalInt_10_ - 1,
						  (byte) 40, 18, -256,
						  anLocalInt_9_ - 1, 18);
	    Canvas_Sub1.method125(anLocalInt_9_ + 18, (byte) -102,
				  anLocalInt_10_ + 18, anLocalInt_10_ - 1,
				  anLocalInt_9_ - 1);
	    DoublyLinkedNodeP2_Sub5 class104_sub5 = Class168.method2730((byte) -18);
	    ((DoublyLinkedNodeP2_Sub5) class104_sub5).anInt4532 = anLocalInt_9_;
	    ((DoublyLinkedNodeP2_Sub5) class104_sub5).anInt4531 = anLocalInt_10_ + 16;
	    ((DoublyLinkedNodeP2_Sub5) class104_sub5).anInt4537 = anLocalInt_10_;
	    ((DoublyLinkedNodeP2_Sub5) class104_sub5).aEntity_4533
		= argument_8_;
	    ((DoublyLinkedNodeP2_Sub5) class104_sub5).anInt4530 = anLocalInt_9_ + 16;
	    Class70.aClass366_481.method3983(class104_sub5, (byte) 119);
	}
    }
    
    static final void method2400(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument,
				 int[] argument_11_, int argument_12_,
				 boolean argument_13_) {
	if (((Entity) argument).anIntArray6735 != null) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0;
		 (((Entity) argument).anIntArray6735.length
		  > anLocalInt);
		 anLocalInt++) {
		if (argument_11_[anLocalInt]
		    != (((Entity) argument).anIntArray6735
			[anLocalInt])) {
		    anLocalBoolean = false;
		    break;
		}
	    }
	    if (anLocalBoolean
		&& ((Entity) argument).anInt6754 != -1) {
		Class367 class367
		    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
		       (((Entity) argument).anInt6754, 0));
		int anLocalInt = ((Class367) class367).anInt3106;
		if (anLocalInt == 1) {
		    ((Entity) argument).anInt6740 = 0;
		    ((Entity) argument).anInt6755
			= argument_12_;
		    ((Entity) argument).anInt6732 = 0;
		    ((Entity) argument).anInt6747 = 0;
		    ((Entity) argument).anInt6787 = 1;
		    if (!((Entity) argument).aBoolean6751)
			Class313.method3622(argument, 0, class367,
					    ((Entity)
					     argument).anInt6732);
		}
		if (anLocalInt == 2)
		    ((Entity) argument).anInt6747 = 0;
	    }
	}
	boolean anLocalBoolean = true;
	for (int anLocalInt = 0; argument_11_.length > anLocalInt;
	     anLocalInt++) {
	    if (argument_11_[anLocalInt] != -1)
		anLocalBoolean = false;
	    if (((Entity) argument).anIntArray6735 == null
		|| (((Entity) argument).anIntArray6735
		    [anLocalInt]) == -1
		|| ((((Class367) DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
				     .method3758(argument_11_[anLocalInt], 0))
		     .anInt3099)
		    >= ((Class367) (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					.method3758
				    ((((Entity) argument)
				      .anIntArray6735[anLocalInt]),
				     0))).anInt3099)) {
		((Entity) argument).anIntArray6735
		    = argument_11_;
		((Entity) argument).anInt6803
		    = ((Entity) argument).anInt6798;
		((Entity) argument).anInt6755 = argument_12_;
	    }
	}
	if (anLocalBoolean) {
	    ((Entity) argument).anInt6755 = argument_12_;
	    ((Entity) argument).anIntArray6735 = argument_11_;
	    ((Entity) argument).anInt6803
		= ((Entity) argument).anInt6798;
	}
    }
    
    public Class124() {
	/* empty */
    }
}
