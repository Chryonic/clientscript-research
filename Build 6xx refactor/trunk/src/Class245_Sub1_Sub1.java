/* Class245_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class245_Sub1_Sub1 extends Class245_Sub1
{
    static Class128 aClass128_6511 = new Class128(3, 2);
    private byte[] aByteArray6512;
    static int anInt6513 = 0;
    static Class81 aClass81_6514;
    static short aShort6515 = 320;
    static int[] anIntArray6516 = new int[14];
    static int anInt6517;
    
    static final void method3179(int argument, int argument_0_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument, 13175,
            (long) argument_0_);
	class59_sub51_sub3.method1181(585134072);
    }
    
    final byte[] method3180(int argument_1_, int argument_2_, int argument_3_,
			    int argument_4_) {
	aByteArray6512 = new byte[argument_2_ * argument_3_ * argument_4_ * 2];
	this.method3174((byte) -63, argument_4_, argument_2_, argument_3_);
	return aByteArray6512;
    }
    
    public static void method3181(byte argument) {
	anIntArray6516 = null;
	aClass128_6511 = null;
	aClass81_6514 = null;
    }
    
    static final void method3182(int argument) {
	Node_Sub29 class59_sub29
	    = Class91.method1683((byte) 37, Node_Sub31_Sub16.aClass372_5910,
				 Class165.aClass207_1202);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(DoublyLinkedNode_Sub51_Sub13.method1262(72));
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(Applet_Sub1.canvasWidth);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(Applet_Sub1.canvasHeight);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
            (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
                    .aClass62_Sub6_4296.method1377(4));
	Class251.method3243(class59_sub29, true);
    }
    
    final void method3177(int argument_5_, byte argument_6_,
			  byte argument_7_) {
	argument_7_ = (byte) (((argument_7_ & 0xff) >> 1) + 127);
	int anLocalInt = -93 % ((-75 - argument_6_) / 40);
	int anLocalInt_8_ = argument_5_ * 2;
	aByteArray6512[anLocalInt_8_++] = argument_7_;
	aByteArray6512[anLocalInt_8_] = argument_7_;
    }
    
    public Class245_Sub1_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
    
    static final Class_aa_Sub2 method3183
	(int[] argument, int[] argument_9_, GraphicsToolkit_Sub2 argument_10_,
	 int argument_11_, int argument_12_, int argument_13_) {
	if (argument_10_.method2132(Node_Sub31_Sub23.aClass320_5942, -2,
				    DataType.BYTE)) {
	    byte[] anLocalInts = new byte[argument_11_ * argument_12_];
	    for (int anLocalInt = 0; anLocalInt < argument_11_; anLocalInt++) {
		int anLocalInt_14_
		    = argument_9_[anLocalInt] + argument_12_ * anLocalInt;
		for (int anLocalInt_15_ = 0;
		     anLocalInt_15_ < argument[anLocalInt]; anLocalInt_15_++)
		    anLocalInts[anLocalInt_14_++] = (byte) -1;
	    }
	    return new Class_aa_Sub2(argument_10_, argument_12_, argument_11_,
				     anLocalInts);
	}
	int[] anLocalInts = new int[argument_12_ * argument_11_];
	for (int anLocalInt = 0; argument_11_ > anLocalInt; anLocalInt++) {
	    int anLocalInt_16_
		= argument_9_[anLocalInt] + anLocalInt * argument_12_;
	    for (int anLocalInt_17_ = 0; anLocalInt_17_ < argument[anLocalInt];
		 anLocalInt_17_++)
		anLocalInts[anLocalInt_16_++] = -16777216;
	}
	return new Class_aa_Sub2(argument_10_, argument_12_, argument_11_,
				 anLocalInts);
    }
    
    static {
	aClass81_6514 = new Class81();
    }
}
