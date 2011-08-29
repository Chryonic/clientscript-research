/* Class59_Sub51_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub7 extends DoublyLinkedNode
{
    static Packet[] aClass59_Sub28Array6247 = new Packet[2048];
    String aString6248;
    int anInt6249;
    DCyclicLinkedList aDCyclicLinkedList_6250;
    
    static final void method1209(GraphicsToolkit argument, int argument_0_,
				 int argument_1_) {
	if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223 || !Class384.aBoolean3255)
	    Class186.anInt1390 = 0;
	else {
	    if (Class45.aBoolean315)
		Statics.aLong3728
		    = Class350_Sub2.aClass75_5451.method1550((byte) 81);
	    Class356.anInt3011 = 0;
	    Class353_Sub5.anInt5504 = 0;
	    Node_Sub31_Sub2.anInt5847 = 0;
	    int[] anLocalInts = argument.Y();
	    Exception_Sub1.anInt50 = (int) ((float) anLocalInts[2] / 3.0F);
	    Class332.anInt2716 = (int) ((float) anLocalInts[3] / 3.0F);
	    argument.getViewportSize(Statics.anIntArray4282);
	    if (((int) ((float) Statics.anIntArray4282[0] / 3.0F)
		 != Class25.anInt164)
		|| (Class62_Sub16.anInt4414
		    != (int) ((float) Statics.anIntArray4282[1]
			      / 3.0F))) {
		Class25.anInt164
		    = (int) ((float) Statics.anIntArray4282[0] / 3.0F);
		Class62_Sub16.anInt4414
		    = (int) ((float) Statics.anIntArray4282[1] / 3.0F);
		Class245_Sub1_Sub1.anInt6517 = Class62_Sub16.anInt4414 >> 1;
		Class_aa_Sub1.anInt3749 = Class25.anInt164 >> 1;
		DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406
		    = new int[Class62_Sub16.anInt4414 * Class25.anInt164];
	    }
	    Statics.aClass350_2673 = argument.method2096();
	    Class186.anInt1390 = 0;
	    for (int anLocalInt = 0; DoublyLinkedNodeP2_Sub6.anInt4547 > anLocalInt;
		 anLocalInt++)
		Class336.method3753((byte) -125, argument_1_,
				    Class114.aClass48Array943[anLocalInt],
				    argument);
	    for (int anLocalInt = 0; anLocalInt < Node_Sub32_Sub4.anInt6088;
		 anLocalInt++)
		Class336.method3753((byte) -100, argument_1_,
				    (Node_Sub47_Sub5.aClass48Array6171
				     [anLocalInt]),
				    argument);
	    for (int anLocalInt = 0; Class90.anInt689 > anLocalInt;
		 anLocalInt++)
		Class336.method3753((byte) -114, argument_1_,
				    Class276.aClass48Array2217[anLocalInt],
				    argument);
	    Class253_Sub3.anInt5675 = 0;
	    if (Class186.anInt1390 > 0) {
		int anLocalInt = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406.length;
		int anLocalInt_2_ = anLocalInt - anLocalInt & 0x7;
		int anLocalInt_3_ = 0;
		while (anLocalInt_2_ > anLocalInt_3_) {
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		}
		while (anLocalInt_3_ < anLocalInt)
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_3_++]
			= 2147483647;
		GraphicsToolkit_Sub2.anInt4679 = 1;
		for (int anLocalInt_4_ = 0; Class186.anInt1390 > anLocalInt_4_;
		     anLocalInt_4_++) {
		    Class48 class48
			= Class245.aClass48Array1791[anLocalInt_4_];
		    Class217.method3015(((Class48) class48).aShortArray342[0],
					((Class48) class48).aShortArray342[3],
					((Class48) class48).aShortArray342[1],
					((Class48) class48).aShortArray346[1],
					0,
					((Class48) class48).aShortArray346[3],
					((Class48) class48).aShortArray355[3],
					((Class48) class48).aShortArray355[0],
					((Class48) class48).aShortArray355[1],
					((Class48) class48).aShortArray346[0]);
		    Class217.method3015(((Class48) class48).aShortArray342[1],
					((Class48) class48).aShortArray342[3],
					((Class48) class48).aShortArray342[2],
					((Class48) class48).aShortArray346[2],
					0,
					((Class48) class48).aShortArray346[3],
					((Class48) class48).aShortArray355[3],
					((Class48) class48).aShortArray355[1],
					((Class48) class48).aShortArray355[2],
					((Class48) class48).aShortArray346[1]);
		}
		GraphicsToolkit_Sub2.anInt4679 = 2;
	    }
	    if (Class45.aBoolean315)
		Class305.aLong3642
		    = (Class350_Sub2.aClass75_5451.method1550((byte) 42)
		       - Statics.aLong3728);
	}
    }
    
    final int method1210(boolean argument_5_) {
	if ((((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250)
	     .rootNode)
	    != ((DoublyLinkedNode)
		(((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250)
		 .rootNode)).nextD)
	    return (((MenuAction) (MenuAction)
		     ((DoublyLinkedNode)
		      (((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250)
		       .rootNode)).nextD)
		    .action);
	return -1;
    }
    
    public static void method1211(byte argument) {
	aClass59_Sub28Array6247 = null;
    }
    
    final boolean method1212(int argument_6_, MenuAction argument_7_) {
	int anLocalInt = method1210(true);
	argument_7_.unlinkD();
	((DoublyLinkedNode_Sub51_Sub7) this).anInt6249--;
	if (((DoublyLinkedNode_Sub51_Sub7) this).anInt6249 != 0) {
	    if (anLocalInt == method1210(true))
		return false;
	    return true;
	}
	this.unlink();
	this.unlinkD();
	Class62_Sub8.anInt4394--;
	Class111_Sub1.aClass149_4614.put(this, ((MenuAction) argument_7_).aLong6279);
	return false;
    }
    
    final boolean method1213(int argument_8_, MenuAction argument_9_) {
	argument_9_.unlinkD();
	boolean anLocalBoolean = true;
	for (MenuAction class59_sub51_sub9
		 = ((MenuAction)
		    ((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250.getFirst());
	     class59_sub51_sub9 != null;
	     class59_sub51_sub9
		 = (MenuAction) ((DoublyLinkedNode_Sub51_Sub7) this)
					    .aDCyclicLinkedList_6250.getNext()) {
	    if (Class147.method2525((((MenuAction) argument_9_)
				     .action),
				    (((MenuAction) class59_sub51_sub9)
				     .action),
				    (byte) 119)) {
		Class384.method4118(argument_9_, class59_sub51_sub9, -103);
		((DoublyLinkedNode_Sub51_Sub7) this).anInt6249++;
		if (anLocalBoolean)
		    return false;
		return true;
	    }
	    anLocalBoolean = false;
	}
	((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250.add(argument_9_);
	((DoublyLinkedNode_Sub51_Sub7) this).anInt6249++;
	return anLocalBoolean;
    }
    
    DoublyLinkedNode_Sub51_Sub7(String argument_10_) {
	((DoublyLinkedNode_Sub51_Sub7) this).aString6248 = argument_10_;
	((DoublyLinkedNode_Sub51_Sub7) this).aDCyclicLinkedList_6250 = new DCyclicLinkedList();
    }
}
