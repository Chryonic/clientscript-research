/* Class59_Sub51_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub11 extends DoublyLinkedNode
{
    private JagexHashMap aJagexHashMap_6283;
    static Class166 aClass166_6284 = new Class166(114, 4);
    
    final int method1246(int argument_0_, int argument_1_, int argument_2_) {
	if (aJagexHashMap_6283 == null)
	    return argument_0_;
	IntegerNode class59_sub54
	    = (IntegerNode) aJagexHashMap_6283.get((long) argument_2_);
	if (class59_sub54 == null)
	    return argument_0_;
	return ((IntegerNode) class59_sub54).value;
    }
    
    public static void method1247(boolean argument) {
	aClass166_6284 = null;
    }
    
    static final void method1248(int argument, int argument_3_,
				 RsInterface[] argument_4_) {
	if (argument != -10943)
	    aClass166_6284 = null;
	for (int anLocalInt = 0; anLocalInt < argument_4_.length;
	     anLocalInt++) {
	    RsInterface rsInterface = argument_4_[anLocalInt];
	    if (rsInterface != null) {
		if (((RsInterface) rsInterface).type == 0) {
		    if (((RsInterface) rsInterface).children != null)
			method1248(argument, argument_3_,
				   ((RsInterface) rsInterface).children);
		    Node_Sub49 class59_sub49
			= ((Node_Sub49)
			   (Class2_Sub5.aJagexHashMap_3787.get((long) ((RsInterface) rsInterface).idHash)));
		    if (class59_sub49 != null)
			Class62_Sub21.method1442((byte) -47, argument_3_,
						 ((Node_Sub49)
						  class59_sub49).anInt4291);
		}
		if (argument_3_ == 0
		    && ((RsInterface) rsInterface).anObjectArray1956 != null) {
		    Cs2Trigger class59_sub27 = new Cs2Trigger();
		    ((Cs2Trigger) class59_sub27).aRsInterface_4115 = rsInterface;
		    ((Cs2Trigger) class59_sub27).parameters
			= ((RsInterface) rsInterface).anObjectArray1956;
		    Cs2Runtime.executeTrigger(class59_sub27);
		}
		if (argument_3_ == 1
		    && ((RsInterface) rsInterface).anObjectArray1824 != null) {
		    if (((RsInterface) rsInterface).subId >= 0) {
			RsInterface rsInterface_5_
			    = RsInterface.getByHash((((RsInterface) rsInterface).idHash));
			if (rsInterface_5_ == null
			    || (((RsInterface) rsInterface_5_).children
				== null)
			    || (((RsInterface) rsInterface).subId
				>= (((RsInterface) rsInterface_5_)
				    .children).length)
			    || (((RsInterface) rsInterface_5_).children
				[((RsInterface) rsInterface).subId]) != rsInterface)
			    continue;
		    }
		    Cs2Trigger class59_sub27 = new Cs2Trigger();
		    ((Cs2Trigger) class59_sub27).parameters
			= ((RsInterface) rsInterface).anObjectArray1824;
		    ((Cs2Trigger) class59_sub27).aRsInterface_4115 = rsInterface;
		    Cs2Runtime.executeTrigger(class59_sub27);
		}
	    }
	}
    }
    
    final void method1249(Packet argument_6_, int argument_7_) {
	for (;;) {
	    int anLocalInt = argument_6_.g1();
	    if (anLocalInt == 0)
		break;
	    method1250(anLocalInt, argument_6_, 125);
	}
    }
    
    public DoublyLinkedNode_Sub51_Sub11() {
	/* empty */
    }
    
    private final void method1250(int argument_8_, Packet argument_9_,
				  int argument_10_) {
	int anLocalInt = 0 / ((argument_10_ - 64) / 32);
	if (argument_8_ == 249) {
	    int anLocalInt_11_ = argument_9_.g1();
	    if (aJagexHashMap_6283 == null) {
		int anLocalInt_12_
		    = MathStatics.method2589(anLocalInt_11_);
		aJagexHashMap_6283 = new JagexHashMap(anLocalInt_12_);
	    }
	    for (int anLocalInt_13_ = 0; anLocalInt_11_ > anLocalInt_13_;
		 anLocalInt_13_++) {
		boolean anLocalBoolean
		    = argument_9_.g1() == 1;
		int anLocalInt_14_ = argument_9_.g3_dupl();
		Node node;
		if (!anLocalBoolean)
		    node = new IntegerNode(argument_9_.g4());
		else
		    node
			= new StringNode(argument_9_.gstr());
		aJagexHashMap_6283.put((long) anLocalInt_14_, node);
	    }
	}
    }
    
    static final void method1251(byte argument, Js5Store argument_15_) {
	Class62_Sub3.anInt4375 = 0;
	Class109.anInt904 = 0;
	Statics.aClass366_5518 = new Class366();
	Class253_Sub3.aClass104_Sub4_Sub1_Sub1Array5678
	    = new DoublyLinkedNodeP2_Sub4_Sub1_Sub1[1024];
	Class62_Sub5.aClass104_Sub7Array4384
	    = (new DoublyLinkedNodeP2_Sub7
	       [Class166.anIntArray1217[Node_Sub21.anInt4035] + 1]);
	Statics.anInt1997 = 0;
	Statics.anInt860 = 0;
	Class276.method3400((byte) 86, argument_15_);
	Class245_Sub2_Sub2.method3197((byte) -128, argument_15_);
    }
    
    final String method1252(int argument_16_, String argument_17_,
			    int argument_18_) {
	if (aJagexHashMap_6283 == null)
	    return argument_17_;
	StringNode class59_sub34
	    = ((StringNode)
	       aJagexHashMap_6283.get((long) argument_18_));
	if (class59_sub34 == null)
	    return argument_17_;
	return ((StringNode) class59_sub34).value;
    }
}
