/* Class104_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class DoublyLinkedNodeP2_Sub4 extends DoublyLinkedNodeP2
{
    static Class166 aClass166_4525;
    DoublyLinkedNodeP2_Sub4 aClass104_Sub4_4526;
    DoublyLinkedNodeP2_Sub4 aClass104_Sub4_4527;
    static String[] aStringArray4528 = new String[100];
    static Class166 aClass166_4529;
    
    static final void method1900(int argument, int argument_0_,
				 String argument_1_) {
	if (argument_0_ != 1706)
	    aStringArray4528 = null;
	Node_Sub29 class59_sub29
	    = Class91.method1683((byte) 101,
				 Node_Sub31_Sub16.aClass372_5910,
				 Class62_Sub14.aClass207_4408);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
            (1 + JagexStringUtils.strlenp1(argument_1_, (byte) 121));
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(argument);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .pjstr(argument_1_);
	Class251.method3243(class59_sub29, true);
    }
    
    final void method1901(byte argument_2_) {
	if (((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4527 != null) {
	    ((DoublyLinkedNodeP2_Sub4) ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4527)
		.aClass104_Sub4_4526
		= ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4526;
	    ((DoublyLinkedNodeP2_Sub4) ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4526)
		.aClass104_Sub4_4527
		= ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4527;
	    ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4527 = null;
	    ((DoublyLinkedNodeP2_Sub4) this).aClass104_Sub4_4526 = null;
	}
    }
    
    public static void method1902(int argument) {
	aStringArray4528 = null;
	aClass166_4529 = null;
	aClass166_4525 = null;
    }
    
    public DoublyLinkedNodeP2_Sub4() {
	/* empty */
    }
    
    static {
	aClass166_4525 = new Class166(95, 3);
	aClass166_4529 = new Class166(67, -2);
    }
}
