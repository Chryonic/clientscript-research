/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;

import jagex3.jagmisc.jagmisc;

final class Class31 implements Runnable
{
    private Thread aThread207;
    static Class166 aClass166_208 = new Class166(30, -1);
    private CyclicLinkedList aCyclicLinkedList_209 = new CyclicLinkedList();
    
    private final void method361(boolean argument_0_, Node argument_1_) {
	if (argument_0_ != true)
	    method365(84, 98, true, -89, -117, -44, false);
	synchronized (aCyclicLinkedList_209) {
	    aCyclicLinkedList_209.add(argument_1_);
	    aCyclicLinkedList_209.notify();
	}
    }
    
    public static void method362(int argument) {
	aClass166_208 = null;
    }
    
    final Node_Sub1 method363(String argument_2_, boolean argument_3_) {
	if (aThread207 == null)
	    throw new IllegalStateException("");
	if (argument_2_ == null)
	    throw new IllegalArgumentException("");
	Node_Sub1 class59_sub1 = new Node_Sub1(argument_2_);
	method361(argument_3_, class59_sub1);
	return class59_sub1;
    }
    
    final void method364(int argument_4_) {
	if (aThread207 != null) {
	    method361(true, new Node());
	    try {
		aThread207.join();
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	    aThread207 = null;
	    int anLocalInt = -91 / ((argument_4_ - 65) / 59);
	}
    }
    
    public final void run() {
	for (;;) {
	    Node_Sub1 class59_sub1;
	    synchronized (aCyclicLinkedList_209) {
		Node node;
		for (node = aCyclicLinkedList_209.remove();
		     node == null;
		     node = aCyclicLinkedList_209.remove()) {
		    try {
			aCyclicLinkedList_209.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		if (!(node instanceof Node_Sub1))
		    break;
		class59_sub1 = (Node_Sub1) node;
	    }
	    int anLocalInt;
	    try {
		byte[] anLocalInts
		    = InetAddress.getByName
			  (((Node_Sub1) class59_sub1).aString3869)
			  .getAddress();
		anLocalInt = jagmisc.ping(anLocalInts[0], anLocalInts[1],
                anLocalInts[2], anLocalInts[3],
                1000L);
	    } catch (Throwable throwable) {
		anLocalInt = 1000;
	    }
	    ((Node_Sub1) class59_sub1).anInt3866 = anLocalInt;
	}
    }
    
    static final void method365
	(int argument, int argument_5_, boolean argument_6_, int argument_7_,
	 int argument_8_, int argument_9_, boolean argument_10_) {
	if (argument_7_ > argument) {
	    int anLocalInt = (argument + argument_7_) / 2;
	    int anLocalInt_11_ = argument;
	    Class84_Sub1 class84_sub1
		= Class384.aClass84_Sub1Array3251[anLocalInt];
	    Class384.aClass84_Sub1Array3251[anLocalInt]
		= Class384.aClass84_Sub1Array3251[argument_7_];
	    Class384.aClass84_Sub1Array3251[argument_7_] = class84_sub1;
	    for (int anLocalInt_12_ = argument; anLocalInt_12_ < argument_7_;
		 anLocalInt_12_++) {
		if (Class243.method3156(argument_6_, class84_sub1,
					argument_10_, argument_8_,
					(Class384.aClass84_Sub1Array3251
					 [anLocalInt_12_]),
					argument_5_, 6906)
		    <= 0) {
		    Class84_Sub1 class84_sub1_13_
			= Class384.aClass84_Sub1Array3251[anLocalInt_12_];
		    Class384.aClass84_Sub1Array3251[anLocalInt_12_]
			= Class384.aClass84_Sub1Array3251[anLocalInt_11_];
		    Class384.aClass84_Sub1Array3251[anLocalInt_11_++]
			= class84_sub1_13_;
		}
	    }
	    Class384.aClass84_Sub1Array3251[argument_7_]
		= Class384.aClass84_Sub1Array3251[anLocalInt_11_];
	    Class384.aClass84_Sub1Array3251[anLocalInt_11_] = class84_sub1;
	    method365(argument, argument_5_, argument_6_, anLocalInt_11_ - 1,
		      argument_8_, -18, argument_10_);
	    method365(anLocalInt_11_ + 1, argument_5_, argument_6_,
		      argument_7_, argument_8_, -35, argument_10_);
	}
	int anLocalInt = -104 % ((argument_9_ + 76) / 34);
    }
    
    public Class31() {
	aThread207 = new Thread(this);
	aThread207.setDaemon(true);
	aThread207.start();
    }
}
