/* Class59_Sub51_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub6 extends DoublyLinkedNode
{
    private byte[][] aByteArrayArray6243;
    private int anInt6244;
    static int anInt6245 = -1;
    Class14[] aClass14Array6246;
    
    static final boolean method1203(int argument, byte argument_0_,
				    int argument_1_) {
	if ((argument_1_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    final boolean method1204(int argument_2_, int argument_3_) {
	return (((Class14)
		 ((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246[argument_2_])
		.aBoolean107);
    }
    
    final boolean method1205(byte argument_4_, int argument_5_) {
	return (((Class14)
		 ((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246[argument_5_])
		.aBoolean111);
    }
    
    final boolean method1206(boolean argument_6_, int argument_7_) {
	if (argument_6_)
	    anInt6245 = -117;
	return (((Class14)
		 ((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246[argument_7_])
		.aBoolean114);
    }
    
    static final String method1207(DoublyLinkedNode_Sub51_Sub7 argument,
				   int argument_8_) {
	return ((DoublyLinkedNode_Sub51_Sub7) argument).aString6248 + " <col=ffffff>>";
    }
    
    DoublyLinkedNode_Sub51_Sub6(int argument_9_) {
	anInt6244 = argument_9_;
    }
    
    final boolean method1208(byte argument_10_) {
	if (((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246 != null)
	    return true;
	if (aByteArrayArray6243 == null) {
	    synchronized (Class281.aJs5Store_2274) {
		if (!Class281.aJs5Store_2274.isLoaded(anInt6244))
		    return false;
		int[] anLocalInts
		    = Class281.aJs5Store_2274.getSubFilePtr(anInt6244);
		aByteArrayArray6243 = new byte[anLocalInts.length][];
		for (int anLocalInt = 0; anLocalInt < anLocalInts.length;
		     anLocalInt++)
		    aByteArrayArray6243[anLocalInt]
			= Class281.aJs5Store_2274.getData(anInt6244, (anLocalInts[anLocalInt]));
	    }
	}
	boolean anLocalBoolean = true;
	for (int anLocalInt = 0; anLocalInt < aByteArrayArray6243.length;
	     anLocalInt++) {
	    byte[] anLocalInts = aByteArrayArray6243[anLocalInt];
	    Packet class59_sub28 = new Packet(anLocalInts);
	    ((Packet) class59_sub28).pos = 1;
	    int anLocalInt_11_ = class59_sub28.g2();
	    synchronized (Class391.aJs5Store_3290) {
		anLocalBoolean
		    &= Class391.aJs5Store_3290.isFlatFile(anLocalInt_11_);
	    }
	}
	if (!anLocalBoolean)
	    return false;
	CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
	int[] anLocalInts;
	synchronized (Class281.aJs5Store_2274) {
	    int anLocalInt
		= Class281.aJs5Store_2274.getSubFileCount(anInt6244);
	    ((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246
		= new Class14[anLocalInt];
	    anLocalInts = Class281.aJs5Store_2274.getSubFilePtr(anInt6244);
	}
	for (int anLocalInt = 0; anLocalInt < anLocalInts.length;
	     anLocalInt++) {
	    byte[] anLocalInts_12_ = aByteArrayArray6243[anLocalInt];
	    Packet class59_sub28 = new Packet(anLocalInts_12_);
	    ((Packet) class59_sub28).pos = 1;
	    int anLocalInt_13_ = class59_sub28.g2();
	    Node_Sub11 class59_sub11 = null;
	    for (Node_Sub11 class59_sub11_14_
		     = (Node_Sub11) cyclicLinkedList.getFirst();
		 class59_sub11_14_ != null;
		 class59_sub11_14_
		     = (Node_Sub11) cyclicLinkedList.getNext()) {
		if (((Node_Sub11) class59_sub11_14_).anInt3939
		    == anLocalInt_13_) {
		    class59_sub11 = class59_sub11_14_;
		    break;
		}
	    }
	    if (class59_sub11 == null) {
		synchronized (Class391.aJs5Store_3290) {
		    class59_sub11
			= new Node_Sub11(anLocalInt_13_,
					    (Class391.aJs5Store_3290.getFlatData(anLocalInt_13_)));
		}
		cyclicLinkedList.add(class59_sub11);
	    }
	    ((DoublyLinkedNode_Sub51_Sub6) this).aClass14Array6246[(anLocalInts
							   [anLocalInt])]
		= new Class14(anLocalInts_12_, class59_sub11);
	}
	aByteArrayArray6243 = null;
	return true;
    }
}
