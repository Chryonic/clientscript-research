/* Class59_Sub51_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub8 extends DoublyLinkedNode
{
    int[] anIntArray6255;
    char[] aCharArray6256;
    String aString6257;
    char[] aCharArray6258;
    static Class217 aClass217_6259 = new Class217(6, 0, 4, 2);
    int[] anIntArray6260;
    static Js5Store aJs5Store_6261;
    static boolean aBoolean6262;
    static int[] anIntArray6263;
    static int anInt6264;
    
    static final void method1229(int argument, int argument_0_,
				 int argument_1_, int argument_2_) {
	int anLocalInt = MapRelated.baseX + argument_2_;
	int anLocalInt_3_ = argument_0_ + MapRelated.baseZ;
	if (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 != null
	    && argument_2_ >= 0 && argument_0_ >= 0
	    && argument_2_ < MapRelated.mapWidth
	    && argument_0_ < MapRelated.mapDepth
	    && (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		    .aClass62_Sub25_4332.method1458(107) != 0
		|| (argument_1_
		    == (((DoublyLinkedNodeP2_Sub2)
			 Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			.lightingHL)))) {
	    long l = (long) (anLocalInt
			     | (argument_1_ << 28 | anLocalInt_3_ << 14));
	    Node_Sub15 class59_sub15
		= ((Node_Sub15)
		   tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.get(l));
	    if (class59_sub15 == null)
		Class72.method1532(argument_1_, argument_2_, argument_0_);
	    else {
		Node_Sub10 class59_sub10
		    = ((Node_Sub10)
		       ((Node_Sub15) class59_sub15).aCyclicLinkedList_3993
			   .getFirst());
		if (class59_sub10 == null)
		    Class72.method1532(argument_1_, argument_2_, argument_0_);
		else {
		    DoublyLinkedNodeP2_Sub2_Sub5_Sub1 class104_sub2_sub5_sub1
			= ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
			   Class72.method1532(argument_1_, argument_2_,
					      argument_0_));
		    if (class104_sub2_sub5_sub1 == null)
			class104_sub2_sub5_sub1
			    = (new DoublyLinkedNodeP2_Sub2_Sub5_Sub1
			       (argument_2_ << 9,
				(Node_Sub31_Sub5.aClass_sArray5858
				     [argument_1_].method3534
				 (argument_2_, false, argument_0_)),
				argument_0_ << 9, argument_1_, argument_1_));
		    else
			((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
			    .anInt6807
			    = ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
			       class104_sub2_sub5_sub1).anInt6812
			    = -1;
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
			.anInt6808
			= ((Node_Sub10) class59_sub10).anInt3934;
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
			.anInt6806
			= ((Node_Sub10) class59_sub10).anInt3936;
		    for (;;) {
			Node_Sub10 class59_sub10_4_
			    = ((Node_Sub10)
			       ((Node_Sub15) class59_sub15)
				   .aCyclicLinkedList_3993.getNext());
			if (class59_sub10_4_ == null)
			    break;
			if (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
			     class104_sub2_sub5_sub1).anInt6808
			    != ((Node_Sub10) class59_sub10_4_).anInt3934) {
			    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
				.anInt6810
				= ((Node_Sub10) class59_sub10_4_).anInt3936;
			    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
				.anInt6807
				= ((Node_Sub10) class59_sub10_4_).anInt3934;
			    for (;;) {
				Node_Sub10 class59_sub10_5_
				    = ((Node_Sub10)
				       ((Node_Sub15) class59_sub15)
					   .aCyclicLinkedList_3993.getNext());
				if (class59_sub10_5_ == null)
				    break;
				if ((((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
				      class104_sub2_sub5_sub1).anInt6808
				     != (((Node_Sub10) class59_sub10_5_)
					 .anInt3934))
				    && (((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
					 class104_sub2_sub5_sub1).anInt6807
					!= (((Node_Sub10) class59_sub10_5_)
					    .anInt3934))) {
				    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
				     class104_sub2_sub5_sub1).anInt6811
					= (((Node_Sub10) class59_sub10_5_)
					   .anInt3936);
				    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1)
				     class104_sub2_sub5_sub1).anInt6812
					= (((Node_Sub10) class59_sub10_5_)
					   .anInt3934);
				}
			    }
			    break;
			}
		    }
		    int anLocalInt_6_
			= (Node_Sub31_Sub36.method993
                    (argument_1_, (argument_2_ << 9) + 256, -12040,
                            (argument_0_ << 9) + 256));
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).worldZ
			= argument_0_ << 9;
		    ((DoublyLinkedNodeP2_Sub2_Sub5_Sub1) class104_sub2_sub5_sub1)
			.anInt6815
			= 0;
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).aByte4509
			= (byte) argument_1_;
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).worldX
			= argument_2_ << 9;
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).lightingHL
			= (byte) argument_1_;
		    ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).anInt4511
			= anLocalInt_6_;
		    if (Class274.method3388(argument_2_, argument_0_, 1))
			((DoublyLinkedNodeP2_Sub2) class104_sub2_sub5_sub1).aByte4509++;
		    Class62_Sub28.method1471(argument_1_, argument_2_,
					     argument_0_, anLocalInt_6_,
					     class104_sub2_sub5_sub1);
		}
	    }
	}
    }
    
    final int method1230(char argument_7_, int argument_8_) {
	if (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260 == null)
	    return -1;
	int anLocalInt = 0;
	if (argument_8_ < 90)
	    method1239(null, -111, (byte) -87);
	for (/**/;
	     anLocalInt < ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260.length;
	     anLocalInt++) {
	    if (argument_7_
		== ((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6258[anLocalInt])
		return ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260[anLocalInt];
	}
	return -1;
    }
    
    static long method1231(long argument, long argument_9_) {
	return argument ^ argument_9_;
    }
    
    static final boolean method1232(byte argument, int argument_10_,
				    int argument_11_) {
	return (argument_10_ & 0x18) != 0 | (argument_10_ & 0x220) == 544;
    }
    
    final void method1233(int argument_12_, Packet argument_13_) {
	for (;;) {
	    int anLocalInt = argument_13_.g1();
	    if (anLocalInt == 0)
		break;
	    method1239(argument_13_, anLocalInt, (byte) 86);
	}
    }
    
    static final boolean method1234(int argument, int argument_14_,
				    int argument_15_) {
	if (!(Class352.method3879(argument_14_, argument_15_, -72)
	      | (argument_15_ & 0x70000) != 0)
	    && !Class60.method1336(argument_15_, (byte) -125, argument_14_))
	    return false;
	return true;
    }
    
    static final void method1235(int argument, int argument_16_,
				 byte argument_17_, int argument_18_,
				 int argument_19_, int argument_20_) {
	Statics.method3364(Class223.anIntArrayArray1562[argument++], (byte) 121, argument_16_, argument_18_, argument_19_);
	Statics.method3364(Class223.anIntArrayArray1562[argument_20_--], (byte) 119, argument_16_, argument_18_, argument_19_);
	for (int anLocalInt = argument; anLocalInt <= argument_20_;
	     anLocalInt++) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[anLocalInt];
	    anLocalInts[argument_16_] = anLocalInts[argument_18_]
		= argument_19_;
	}
    }
    
    final int method1236(int argument_21_, char argument_22_) {
	if (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255 == null)
	    return -1;
	for (int anLocalInt = 0;
	     ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255.length > anLocalInt;
	     anLocalInt++) {
	    if (((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6256[anLocalInt]
		== argument_22_)
		return ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255[anLocalInt];
	}
	return -1;
    }
    
    final void method1237(int argument_23_) {
	if (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260 != null) {
	    for (int anLocalInt = 0;
		 (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260.length
		  > anLocalInt);
		 anLocalInt++)
		((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260[anLocalInt]
		    = MathStatics.OR((((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260[anLocalInt]), 32768);
	}
	if (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255 != null) {
	    for (int anLocalInt = 0;
		 (((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255.length
		  > anLocalInt);
		 anLocalInt++)
		((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255[anLocalInt]
		    = MathStatics.OR((((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255[anLocalInt]), 32768);
	}
    }
    
    public static void method1238(byte argument) {
	aClass217_6259 = null;
	anIntArray6263 = null;
	aJs5Store_6261 = null;
    }
    
    public DoublyLinkedNode_Sub51_Sub8() {
	/* empty */
    }
    
    private final void method1239(Packet argument_24_, int argument_25_,
				  byte argument_26_) {
	if (argument_25_ != 1) {
	    if (argument_25_ == 2) {
		int anLocalInt = argument_24_.g1();
		((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6256
		    = new char[anLocalInt];
		((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255
		    = new int[anLocalInt];
		for (int anLocalInt_27_ = 0; anLocalInt_27_ < anLocalInt;
		     anLocalInt_27_++) {
		    ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6255[anLocalInt_27_]
			= argument_24_.g2();
		    byte anLocalInt_28_ = argument_24_.g1s();
		    ((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6256[anLocalInt_27_]
			= (anLocalInt_28_ == 0 ? '\0'
			   : JagexStringUtils.parseCharacter(anLocalInt_28_));
		}
	    } else if (argument_25_ == 3) {
		int anLocalInt = argument_24_.g1();
		((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260
		    = new int[anLocalInt];
		((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6258
		    = new char[anLocalInt];
		for (int anLocalInt_29_ = 0; anLocalInt > anLocalInt_29_;
		     anLocalInt_29_++) {
		    ((DoublyLinkedNode_Sub51_Sub8) this).anIntArray6260[anLocalInt_29_]
			= argument_24_.g2();
		    byte anLocalInt_30_ = argument_24_.g1s();
		    ((DoublyLinkedNode_Sub51_Sub8) this).aCharArray6258[anLocalInt_29_]
			= (anLocalInt_30_ != 0
			   ? JagexStringUtils.parseCharacter(anLocalInt_30_)
			   : '\0');
		}
	    }
	} else
	    ((DoublyLinkedNode_Sub51_Sub8) this).aString6257
		= argument_24_.gstr();
	int anLocalInt = 44 % ((-30 - argument_26_) / 49);
    }
}
