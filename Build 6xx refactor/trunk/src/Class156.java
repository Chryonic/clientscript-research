/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class156 implements Interface18
{
    int anInt3679;
    int anInt3680;
    int anInt3682;
    int anInt3683;
    String aString3684;
    int anInt3685;
    static int[] anIntArray3686 = new int[25];
    int anInt3687;
    int anInt3688;
    Class349 aClass349_3689;
    Class44 aClass44_3690;
    int anInt3691;
    int anInt3692;
    int anInt3693;
    
    public final Class128 method68(byte argument_0_) {
	if (argument_0_ >= -35)
	    ((Class156) this).aString3684 = null;
	return Class276.aClass128_2211;
    }
    
    public static void method2585(int argument) {
	anIntArray3686 = null;
	MapRelated.underworldLId = null;
    }
    
    static final boolean method2586(byte argument, int argument_1_,
				    int argument_2_) {
	if ((argument_2_ & 0xc580) == 0)
	    return false;
	return true;
    }
    
    static final void method2587(int argument, int argument_3_,
				 int argument_4_) {
	int anLocalInt
	    = (Class37.aClass76_274.method1552
	       (MultilanguageString.CHOOSE_OPTION.getLocalizedString(client.language),
		0));
	int anLocalInt_5_;
	if (RsInterface.aBoolean1949) {
	    for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
		     = ((DoublyLinkedNode_Sub51_Sub7)
			Node_Sub7.aDCyclicLinkedList_3920.getFirst());
		 class59_sub51_sub7 != null;
		 class59_sub51_sub7
		     = ((DoublyLinkedNode_Sub51_Sub7)
			Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
		int anLocalInt_6_;
		if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).anInt6249 == 1)
		    anLocalInt_6_
			= (Statics.method1287(((MenuAction) ((DoublyLinkedNode) (((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).aDCyclicLinkedList_6250).rootNode)).nextD), (byte) -93));
		else
		    anLocalInt_6_ = Class316.method3637(class59_sub51_sub7, 2);
		if (anLocalInt_6_ > anLocalInt)
		    anLocalInt = anLocalInt_6_;
	    }
	    anLocalInt_5_ = Class62_Sub8.anInt4394 * 16 + 21;
	    anLocalInt += 8;
	    Class356.anInt3016 = ((Class344.aBoolean3593 ? 26 : 22)
				  + Class62_Sub8.anInt4394 * 16);
	} else {
	    for (MenuAction class59_sub51_sub9
		     = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						.aCyclicLinkedList_6404
						.getFirst();
		 class59_sub51_sub9 != null;
		 class59_sub51_sub9
		     = ((MenuAction)
			DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getNext())) {
		int anLocalInt_7_
		    = Statics.method1287(class59_sub51_sub9, (byte) -58);
		if (anLocalInt_7_ > anLocalInt)
		    anLocalInt = anLocalInt_7_;
	    }
	    anLocalInt += 8;
	    Class356.anInt3016
		= Class62_Sub12.anInt4402 * 16 + (Class344.aBoolean3593 ? 26
						  : 22);
	    anLocalInt_5_ = Class62_Sub12.anInt4402 * 16 + 21;
	}
	int anLocalInt_8_ = argument_3_ - anLocalInt / 2;
	if (Applet_Sub1.canvasWidth < anLocalInt + anLocalInt_8_)
	    anLocalInt_8_ = -anLocalInt + Applet_Sub1.canvasWidth;
	if (anLocalInt_8_ < 0)
	    anLocalInt_8_ = 0;
	int anLocalInt_9_ = argument;
	if (Applet_Sub1.canvasHeight < anLocalInt_5_ + anLocalInt_9_)
	    anLocalInt_9_ = -anLocalInt_5_ + Applet_Sub1.canvasHeight;
	if (anLocalInt_9_ < 0)
	    anLocalInt_9_ = 0;
	DoublyLinkedNode_Sub51_Sub15.anInt6320 = anLocalInt_8_;
	Node_Sub47_Sub6.anInt6177 = anLocalInt_9_;
	Class204.anInt1457 = anLocalInt;
	Node_Sub31_Sub39.aBoolean6055 = true;
    }
    
    Class156(String argument_10_, Class349 argument_11_, Class44 argument_12_,
	     int argument_13_, int argument_14_, int argument_15_,
	     int argument_16_, int argument_17_, int argument_18_,
	     int argument_19_, int argument_20_, int argument_21_,
	     int argument_22_) {
	((Class156) this).aClass349_3689 = argument_11_;
	((Class156) this).anInt3679 = argument_14_;
	((Class156) this).anInt3682 = argument_13_;
	((Class156) this).anInt3691 = argument_19_;
	((Class156) this).aClass44_3690 = argument_12_;
	((Class156) this).anInt3680 = argument_22_;
	((Class156) this).anInt3683 = argument_15_;
	((Class156) this).aString3684 = argument_10_;
	((Class156) this).anInt3693 = argument_16_;
	((Class156) this).anInt3685 = argument_20_;
	((Class156) this).anInt3692 = argument_17_;
	((Class156) this).anInt3688 = argument_21_;
	((Class156) this).anInt3687 = argument_18_;
    }
}
