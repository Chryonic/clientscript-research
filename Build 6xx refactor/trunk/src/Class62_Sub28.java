/* Class62_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub28 extends Class62
{
    static int anInt4458;
    static Packet aClass59_Sub28_4459 = new Packet(1350);
    static boolean aBoolean4461 = false;
    static boolean aBoolean4462 = false;
    static CyclicLinkedList aCyclicLinkedList_4463 = new CyclicLinkedList();
    static boolean aBoolean4464 = false;
    
    Class62_Sub28(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final int method1342(int argument_1_, byte argument_2_) {
	int anLocalInt = -3 / ((-53 - argument_2_) / 50);
	return 1;
    }
    
    final int method1470(int argument_3_) {
	return ((Class62) this).anInt441;
    }
    
    Class62_Sub28(int argument_4_, Node_Sub50 argument_5_) {
	super(argument_5_);
    }
    
    final int method1344(byte argument_6_) {
	if (argument_6_ != 4)
	    method1471(-57, 106, -90, -47, null);
	return 1;
    }
    
    final void method1346(boolean argument_7_) {
	if (argument_7_)
	    method1470(62);
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final void method1471(int argument, int argument_8_,
				 int argument_9_, int argument_10_,
				 DoublyLinkedNodeP2_Sub2_Sub5 argument_11_) {
	Class148 class148
	    = Node_Sub9_Sub5.method675(argument, argument_8_, argument_9_);
	if (class148 != null) {
	    ((DoublyLinkedNodeP2_Sub2) argument_11_).worldX
		= (argument_8_ << LightingManager.lightCoordRShift) + LightingManager.attenuationOffset;
	    ((DoublyLinkedNodeP2_Sub2) argument_11_).anInt4511 = argument_10_;
	    ((DoublyLinkedNodeP2_Sub2) argument_11_).worldZ
		= (argument_9_ << LightingManager.lightCoordRShift) + LightingManager.attenuationOffset;
	    ((Class148) class148).aClass104_Sub2_Sub5_1132 = argument_11_;
	    int anLocalInt = ((Node_Sub31_Sub5.aClass_sArray5858
			       == Class65.aClass_sArray455)
			      ? 1 : 0);
	    if (argument_11_.method1766(-98)) {
		if (argument_11_.method1772(0)) {
		    ((DoublyLinkedNodeP2_Sub2) argument_11_).aClass104_Sub2_4515
			= InputStream_Sub2.aClass104_Sub2Array36[anLocalInt];
		    InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			= argument_11_;
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_11_).aClass104_Sub2_4515
			= (Node_Sub31_Sub33.aClass104_Sub2Array6004
			   [anLocalInt]);
		    Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			= argument_11_;
		    Class18.aBoolean124 = true;
		}
	    } else {
		((DoublyLinkedNodeP2_Sub2) argument_11_).aClass104_Sub2_4515
		    = Statics.aClass104_Sub2Array851[anLocalInt];
		Statics.aClass104_Sub2Array851[anLocalInt] = argument_11_;
	    }
	}
    }
    
    public static void method1472(byte argument) {
	aClass59_Sub28_4459 = null;
	GraphicsToolkit_Sub2_Sub1.deletionArray = null;
	aCyclicLinkedList_4463 = null;
    }

    final void method1343(int argument_15_, byte argument_16_) {
	if (argument_16_ == -107)
	    ((Class62) this).anInt441 = argument_15_;
    }
    
    static {
    }
}
