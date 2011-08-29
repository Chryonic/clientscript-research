/* Class59_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub15 extends Node
{
    static long aLong3991;
    static Class128 aClass128_3992 = new Class128(1, 2);
    CyclicLinkedList aCyclicLinkedList_3993 = new CyclicLinkedList();
    
    static final void method693(int argument, int argument_0_,
				int argument_1_) {
	if (Node_Sub31_Sub27.anInt5961 == 1)
	    Class133.method2445(Node_Sub32_Sub4.aClass59_Sub51_Sub9_6087,
				argument, 114, argument_0_);
	else if (Node_Sub31_Sub27.anInt5961 == 2) {
	    if (!Class52.aBoolean391)
		Class156.method2587(argument, argument_0_, -118);
	    else
		Class156.method2587(Class82.method1596(-2) + argument,
				    Node_Sub52.method1319(99) + argument_0_,
				    -81);
	}
	Node_Sub31_Sub27.anInt5961 = 0;
	Node_Sub32_Sub4.aClass59_Sub51_Sub9_6087 = null;
    }
    
    static final void method694(int argument, int argument_2_, int argument_3_,
				int argument_4_, int argument_5_,
				int argument_6_) {
	for (int anLocalInt = argument_4_; anLocalInt <= argument_6_;
	     anLocalInt++)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt], (byte) -38, argument, argument_3_, argument_5_);
    }
    
    public static void method695(byte argument) {
	aClass128_3992 = null;
    }
    
    static final void method696(int argument, byte[] argument_7_) {
	Packet class59_sub28 = new Packet(argument_7_);
	for (;;) {
	    int anLocalInt = class59_sub28.g1();
	    if (anLocalInt == 0)
		break;
	    if (anLocalInt != 1) {
		if (anLocalInt != 4) {
		    if (anLocalInt == 5) {
			int anLocalInt_8_
			    = class59_sub28.g1();
			Statics.anIntArray5746
			    = new int[anLocalInt_8_];
			for (int anLocalInt_9_ = 0;
			     anLocalInt_8_ > anLocalInt_9_; anLocalInt_9_++) {
			    Statics.anIntArray5746[anLocalInt_9_]
				= class59_sub28.g2();
			    if (Statics.anIntArray5746[anLocalInt_9_]
				== 65535)
				Statics.anIntArray5746[anLocalInt_9_]
				    = -1;
			}
		    }
		} else {
		    int anLocalInt_10_
			= class59_sub28.g1();
		    Statics.anIntArray1154 = new int[anLocalInt_10_];
		    for (int anLocalInt_11_ = 0;
			 anLocalInt_10_ > anLocalInt_11_; anLocalInt_11_++) {
			Statics.anIntArray1154[anLocalInt_11_]
			    = class59_sub28.g2();
			if (Statics.anIntArray1154[anLocalInt_11_] == 65535)
			    Statics.anIntArray1154[anLocalInt_11_] = -1;
		    }
		}
	    } else {
		int[] anLocalInts = AthmosphericConditions.defaultSkyboxTextures = new int[6];
		anLocalInts[0] = class59_sub28.g2();
		anLocalInts[1] = class59_sub28.g2();
		anLocalInts[2] = class59_sub28.g2();
		anLocalInts[3] = class59_sub28.g2();
		anLocalInts[4] = class59_sub28.g2();
		anLocalInts[5] = class59_sub28.g2();
	    }
	}
	if (argument != 0)
	    method695((byte) 94);
    }
    
    static final boolean method697(byte argument, int argument_12_,
				   int argument_13_) {
	if ((argument_13_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    public Node_Sub15() {
	/* empty */
    }
}
