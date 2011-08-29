/* Class59_Sub31_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub34 extends Node_Sub31
{
    private int anInt6005 = 0;
    static boolean aBoolean6006;
    private int anInt6007 = 1;
    static int[] anIntArray6008 = new int[3];
    private int anInt6009 = 0;
    
    static final int[] method981(byte argument, Node_Sub29 argument_0_) {
	Packet class59_sub28 = new Packet(518);
	int[] anLocalInts = new int[4];
	for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++)
	    anLocalInts[anLocalInt] = (int) (Math.random() * 9.9999999E7);
	class59_sub28.p1(10);
	class59_sub28.p4(anLocalInts[0]);
	class59_sub28.p4(anLocalInts[1]);
	class59_sub28.p4(anLocalInts[2]);
	class59_sub28.p4(anLocalInts[3]);
	for (int anLocalInt = 0; anLocalInt < 10; anLocalInt++)
	    class59_sub28.p4((int) (Math.random() * 9.9999999E7)
        );
	class59_sub28.p2((int) (Math.random() * 9.9999999E7));
	class59_sub28.decryptRSA(Node_Sub31_Sub32.aBigInteger6000,
            Class62_Sub1.aBigInteger4362);
	((Node_Sub29) argument_0_).aClass59_Sub28_Sub1_4129.pbytes
            (((Packet) class59_sub28).data,
                    0, ((Packet) class59_sub28).pos);
	return anLocalInts;
    }
    
    final void method865(boolean argument_1_) {
	Class344.method3799(argument_1_);
	if (argument_1_ != true) {
	    /* empty */
	}
    }
    
    static final boolean method982(int argument, int argument_2_,
				   byte argument_3_) {
	if ((argument_2_ & 0x800) == 0)
	    return false;
	return true;
    }
    
    public Node_Sub31_Sub34() {
	super(0, true);
    }
    
    static final void method983(Node_Sub28_Sub1 argument,
				boolean argument_4_) {
	argument.method847(argument_4_);
	int anLocalInt = Class64.anInt451;
	DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
	    = (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
	       = Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt]
	       = new DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2());
	((Entity) class104_sub2_sub2_sub5_sub2).anInt6745
	    = anLocalInt;
	int anLocalInt_5_ = argument.method850(-1, 30);
	byte anLocalInt_6_ = (byte) (anLocalInt_5_ >> 28);
	int anLocalInt_7_ = (anLocalInt_5_ & 0xfffc2b5) >> 14;
	((Entity) class104_sub2_sub2_sub5_sub2)
	    .pathX[0]
	    = -MapRelated.baseX + anLocalInt_7_;
	int anLocalInt_8_ = anLocalInt_5_ & 0x3fff;
	((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).worldX
	    = ((((Entity) class104_sub2_sub2_sub5_sub2)
		.pathX[0])
	       << 9) + (class104_sub2_sub2_sub5_sub2.method1830(-128) << 8);
	((Entity) class104_sub2_sub2_sub5_sub2)
	    .pathZ[0]
	    = anLocalInt_8_ - MapRelated.baseZ;
	((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).worldZ
	    = ((((Entity) class104_sub2_sub2_sub5_sub2)
		.pathZ[0])
	       << 9) + (class104_sub2_sub2_sub5_sub2.method1830(-127) << 8);
	Class176.anInt1308
	    = ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).lightingHL
	    = ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509
	    = anLocalInt_6_;
	if (Class274.method3388((((Entity)
				  class104_sub2_sub2_sub5_sub2)
				 .pathX[0]),
				(((Entity)
				  class104_sub2_sub2_sub5_sub2)
				 .pathZ[0]),
				1))
	    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).aByte4509++;
	if (DoublyLinkedNode_Sub51_Sub7.aClass59_Sub28Array6247[anLocalInt] != null)
	    class104_sub2_sub2_sub5_sub2.method1856((DoublyLinkedNode_Sub51_Sub7
						     .aClass59_Sub28Array6247
						     [anLocalInt]),
						    true);
	Class224.anInt1578 = 0;
	Class242.anIntArray1769[Class224.anInt1578++] = anLocalInt;
	Statics.aByteArray199[anLocalInt] = (byte) 0;
	Class189.anInt3624 = 0;
	for (int anLocalInt_9_ = 1; anLocalInt_9_ < 2048; anLocalInt_9_++) {
	    if (anLocalInt != anLocalInt_9_) {
		int anLocalInt_10_ = argument.method850(-1, 18);
		int anLocalInt_11_ = anLocalInt_10_ >> 16;
		int anLocalInt_12_ = (anLocalInt_10_ & 0xff13) >> 8;
		int anLocalInt_13_ = anLocalInt_10_ & 0xff;
		Class239 class239 = (Node_Sub31_Sub15_Sub1
					 .aClass239Array6640[anLocalInt_9_]
				     = new Class239());
		((Class239) class239).anInt1739 = -1;
		((Class239) class239).aBoolean1737 = false;
		((Class239) class239).anInt1738 = 0;
		((Class239) class239).anInt1740
		    = anLocalInt_13_ + (anLocalInt_12_ << 14) + (anLocalInt_11_
								 << 28);
		((Class239) class239).aBoolean1741 = false;
		Class235.anIntArray1719[Class189.anInt3624++] = anLocalInt_9_;
		Statics.aByteArray199[anLocalInt_9_] = (byte) 0;
	    }
	}
	argument.method841(-128);
    }
    
    final int[] method867(byte argument_14_, int argument_15_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_15_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Class82.anIntArray585[argument_15_];
	    int anLocalInt_16_ = anLocalInt - 2048 >> 1;
	    for (int anLocalInt_17_ = 0; Statics.anInt294 > anLocalInt_17_;
		 anLocalInt_17_++) {
		int anLocalInt_18_ = Class130.anIntArray1053[anLocalInt_17_];
		int anLocalInt_19_ = anLocalInt_18_ - 2048 >> 1;
		int anLocalInt_20_;
		if (anInt6005 == 0)
		    anLocalInt_20_ = anInt6007 * (anLocalInt_18_ - anLocalInt);
		else {
		    int anLocalInt_21_ = ((anLocalInt_16_ * anLocalInt_16_
					   + anLocalInt_19_ * anLocalInt_19_)
					  >> 12);
		    anLocalInt_20_
			= (int) (Math.sqrt((double) ((float) anLocalInt_21_
						     / 4096.0F))
				 * 4096.0);
		    anLocalInt_20_
			= (int) ((double) (anLocalInt_20_ * anInt6007)
				 * 3.141592653589793);
		}
		anLocalInt_20_ -= anLocalInt_20_ & ~0xfff;
		if (anInt6009 != 0) {
		    if (anInt6009 == 2) {
			anLocalInt_20_ -= 2048;
			if (anLocalInt_20_ < 0)
			    anLocalInt_20_ = -anLocalInt_20_;
			anLocalInt_20_ = 2048 - anLocalInt_20_ << 1;
		    }
		} else
		    anLocalInt_20_
			= (FloatPacket.anIntArray5834
			   [anLocalInt_20_ >> 4 & 0xff]) + 4096 >> 1;
		anLocalInts[anLocalInt_17_] = anLocalInt_20_;
	    }
	}
	if (argument_14_ <= 21)
	    anInt6007 = -120;
	return anLocalInts;
    }
    
    public static void method984(int argument) {
	anIntArray6008 = null;
    }
    
    static final boolean method985(Class112 argument, Js5Store argument_22_,
				   Node_Sub9_Sub2 argument_23_,
				   Js5Store argument_24_, Js5Store argument_25_,
				   int argument_26_) {
	DoublyLinkedNode_Sub51_Sub8.aJs5Store_6261 = argument_22_;
	Class123.anIntArray998 = new int[16];
	GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546 = argument_23_;
	Node_Sub31_Sub35.aJs5Store_6012 = argument_24_;
	Class338.aJs5Store_2766 = argument_25_;
	Node_Sub47_Sub7.aClass112_6191 = argument;
	for (int anLocalInt = 0; anLocalInt < 16; anLocalInt++)
	    Class123.anIntArray998[anLocalInt] = 255;
	return true;
    }
    
    final void method868(Packet argument_27_, int argument_28_,
			 byte argument_29_) {
	if (argument_29_ >= -41)
	    method986(56);
	int anLocalInt = argument_28_;
    while_167_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 3)
			    break;
			break while_167_;
		    }
		} else {
		    anInt6005 = argument_27_.g1();
		    break while_167_;
		}
		anInt6009 = argument_27_.g1();
		break while_167_;
	    } while (false);
	    anInt6007 = argument_27_.g1();
	} while (false);
    }
    
    static final void method986(int argument) {
	Node_Sub35.aClass363Array4160 = null;
    }
    
    static {
	aBoolean6006 = false;
    }
}
