/* Class59_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub39 extends Node
{
    static int anInt4196;
    short aShort4197;
    static int anInt4198 = 1338;
    
    static final void method1072(String argument, int argument_0_,
				 boolean argument_1_) {
	argument = argument.toLowerCase();
	short[] anLocalInts = new short[16];
	int anLocalInt = 0;
	int anLocalInt_2_ = argument_1_ ? 32768 : 0;
	int anLocalInt_3_
	    = ((argument_1_
		? ((Class66) DoublyLinkedNode_Sub51_Sub5.aClass66_6242).anInt469
		: ((Class66) DoublyLinkedNode_Sub51_Sub5.aClass66_6242).anInt465)
	       + anLocalInt_2_);
	for (int anLocalInt_4_ = anLocalInt_2_; anLocalInt_4_ < anLocalInt_3_;
	     anLocalInt_4_++) {
	    DoublyLinkedNode_Sub51_Sub16 class59_sub51_sub16
		= DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt_4_,
							      17408);
	    if (((DoublyLinkedNode_Sub51_Sub16) class59_sub51_sub16).aBoolean6323
		&& class59_sub51_sub16.method1278(80).toLowerCase()
		       .indexOf(argument) != -1) {
		if (anLocalInt >= 50) {
		    Node_Sub47_Sub6.aShortArray6178 = null;
		    Class62_Sub26.anInt4447 = -1;
		    return;
		}
		if (anLocalInts.length <= anLocalInt) {
		    short[] anLocalInts_5_ = new short[anLocalInts.length * 2];
		    for (int anLocalInt_6_ = 0; anLocalInt > anLocalInt_6_;
			 anLocalInt_6_++)
			anLocalInts_5_[anLocalInt_6_]
			    = anLocalInts[anLocalInt_6_];
		    anLocalInts = anLocalInts_5_;
		}
		anLocalInts[anLocalInt++] = (short) anLocalInt_4_;
	    }
	}
	Class276.anInt2218 = 0;
	Node_Sub47_Sub6.aShortArray6178 = anLocalInts;
	Class62_Sub26.anInt4447 = anLocalInt;
	String[] strings = new String[Class62_Sub26.anInt4447];
	for (int anLocalInt_7_ = 0; anLocalInt_7_ < Class62_Sub26.anInt4447;
	     anLocalInt_7_++)
	    strings[anLocalInt_7_]
		= DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496
		      (anLocalInts[anLocalInt_7_], 17408).method1278(80);
	Statics.method2489(strings, 94, Node_Sub47_Sub6.aShortArray6178);
    }
    
    static final void method1073(int argument, byte argument_8_) {
	Class353_Sub6.anInt5507 = 2;
	Node_Sub13.anInt3978 = argument;
	String string = null;
	if (Class201.aByteArray1448 != null) {
	    Packet class59_sub28
		= new Packet(Class201.aByteArray1448);
	    string = JagexStringEncoding.decode(class59_sub28.g8());
	    Class62_Sub19.aLong4427 = class59_sub28.g8();
	}
	if (argument_8_ != -43)
	    method1072(null, -109, false);
	if (string == null)
	    Node_Sub16.method698(35, argument_8_ + 45);
	else
	    Class62_Sub4.method1367("", false, 0, string, true);
    }
    
    public Node_Sub39() {
	/* empty */
    }
    
    Node_Sub39(short argument_9_) {
	((Node_Sub39) this).aShort4197 = argument_9_;
    }
}
