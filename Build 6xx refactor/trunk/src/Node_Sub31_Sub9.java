/* Class59_Sub31_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub9 extends Node_Sub31
{
    private boolean aBoolean5874;
    private int anInt5875 = 4096;
    static int anInt5876;
    static boolean aBoolean5877 = false;
    
    public Node_Sub31_Sub9() {
	super(1, false);
	aBoolean5874 = true;
    }
    
    final int[][] method870(int argument_0_, byte argument_1_) {
	if (argument_1_ != -9)
	    method901((byte) 51);
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 42,
							       argument_0_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_2_
		= this.method864(argument_0_ - 1 & Exception_Sub1.anInt49, 0,
				 (byte) 33);
	    int[] anLocalInts_3_ = this.method864(argument_0_, 0, (byte) 33);
	    int[] anLocalInts_4_
		= this.method864(Exception_Sub1.anInt49 & argument_0_ + 1, 0,
				 (byte) 33);
	    int[] anLocalInts_5_ = anLocalInts[0];
	    int[] anLocalInts_6_ = anLocalInts[1];
	    int[] anLocalInts_7_ = anLocalInts[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		int anLocalInt_8_ = ((-anLocalInts_2_[anLocalInt]
				      + anLocalInts_4_[anLocalInt])
				     * anInt5875);
		int anLocalInt_9_
		    = (anInt5875
		       * (-anLocalInts_3_[anLocalInt - 1 & Statics.anInt1269]
			  + (anLocalInts_3_
			     [anLocalInt + 1 & Statics.anInt1269])));
		int anLocalInt_10_ = anLocalInt_9_ >> 12;
		int anLocalInt_11_ = anLocalInt_8_ >> 12;
		int anLocalInt_12_ = anLocalInt_10_ * anLocalInt_10_ >> 12;
		int anLocalInt_13_ = anLocalInt_11_ * anLocalInt_11_ >> 12;
		int anLocalInt_14_
		    = (int) (Math.sqrt((double) ((float) (anLocalInt_12_
							  + anLocalInt_13_
							  + 4096)
						 / 4096.0F))
			     * 4096.0);
		int anLocalInt_15_;
		int anLocalInt_16_;
		int anLocalInt_17_;
		if (anLocalInt_14_ != 0) {
		    anLocalInt_17_ = anLocalInt_8_ / anLocalInt_14_;
		    anLocalInt_15_ = anLocalInt_9_ / anLocalInt_14_;
		    anLocalInt_16_ = 16777216 / anLocalInt_14_;
		} else {
		    anLocalInt_15_ = 0;
		    anLocalInt_16_ = 0;
		    anLocalInt_17_ = 0;
		}
		if (aBoolean5874) {
		    anLocalInt_16_ = (anLocalInt_16_ >> 1) + 2048;
		    anLocalInt_17_ = (anLocalInt_17_ >> 1) + 2048;
		    anLocalInt_15_ = (anLocalInt_15_ >> 1) + 2048;
		}
		anLocalInts_5_[anLocalInt] = anLocalInt_15_;
		anLocalInts_6_[anLocalInt] = anLocalInt_17_;
		anLocalInts_7_[anLocalInt] = anLocalInt_16_;
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_18_, int argument_19_,
			 byte argument_20_) {
	int anLocalInt = argument_19_;
	do {
	    if (anLocalInt != 0) {
		if (anLocalInt != 1)
		    break;
	    } else {
		anInt5875 = argument_18_.g2();
		break;
	    }
	    aBoolean5874 = argument_18_.g1() == 1;
	} while (false);
	if (argument_20_ >= -41)
	    anInt5875 = -43;
    }
    
    static final void method901(byte argument) {
	while (Network.stream
		   .method843(Network.anInt4454, 113)
	       >= 15) {
	    int anLocalInt
		= Network.stream.method850(-1, 15);
	    if (anLocalInt == 32767)
		break;
	    boolean anLocalBoolean = false;
	    Node_Sub35 class59_sub35
		= ((Node_Sub35)
		   Class294.aJagexHashMap_2453.get((long) anLocalInt));
	    if (class59_sub35 == null) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		    = new DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6745
		    = anLocalInt;
		class59_sub35
		    = new Node_Sub35(class104_sub2_sub2_sub5_sub1);
		Class294.aJagexHashMap_2453.put((long) anLocalInt, class59_sub35);
		Node_Sub31_Sub13.aClass59_Sub35Array5900
		    [Statics.anInt5573++]
		    = class59_sub35;
		anLocalBoolean = true;
	    }
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		= (((Node_Sub35) class59_sub35)
		   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616
		[dba_sub_772_Sub2.anInt6369++]
		= anLocalInt;
	    ((Entity) class104_sub2_sub2_sub5_sub1).anInt6769
		= Class62_Sub6.anInt4389;
	    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		 .aClass291_6832) != null
		&& ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		    class104_sub2_sub2_sub5_sub1)
		       .aClass291_6832.method3495(true))
		Class385.method4123(class104_sub2_sub2_sub5_sub1, (byte) -123);
	    int anLocalInt_21_
		= Network.stream.method850(-1, 5);
	    if (anLocalInt_21_ > 15)
		anLocalInt_21_ -= 32;
	    int anLocalInt_22_
		= Network.stream.method850(-1, 1);
	    int anLocalInt_23_
		= Network.stream.method850(-1, 2);
	    int anLocalInt_24_
		= Network.stream.method850(-1, 1);
	    if (anLocalInt_24_ == 1)
		Node_Sub31_Sub24.anIntArray5950[JagexStringEncoding.anInt128++]
		    = anLocalInt;
	    class104_sub2_sub2_sub5_sub1.method1851
		(DiskBackedCache.aClass26_2709.method343((byte) 118,
						  Network
						      .stream
						      .method850(-1, 14)),
		 false);
	    int anLocalInt_25_
		= (Network.stream.method850(-1, 3) + 4 << 11
		   & 0x3f59);
	    int anLocalInt_26_
		= Network.stream.method850(-1, 5);
	    if (anLocalInt_26_ > 15)
		anLocalInt_26_ -= 32;
	    class104_sub2_sub2_sub5_sub1.method1838
		(-1, ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				   class104_sub2_sub2_sub5_sub1)
				  .aClass291_6832)).anInt2344);
	    ((Entity) class104_sub2_sub2_sub5_sub1).anInt6727
		= (((Class291) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				class104_sub2_sub2_sub5_sub1).aClass291_6832)
		   .anInt2345) << 3;
	    if (anLocalBoolean)
		class104_sub2_sub2_sub5_sub1.method1840(16383, true,
							anLocalInt_25_);
	    class104_sub2_sub2_sub5_sub1.method1850
		(anLocalInt_23_, (byte) -62,
		 (((Entity)
		   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		  .pathX[0]) + anLocalInt_26_,
		 (anLocalInt_21_
		  + (((Entity)
		      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		     .pathZ[0])),
		 class104_sub2_sub2_sub5_sub1.method1830(-128),
		 anLocalInt_22_ == 1);
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		    .aClass291_6832.method3495(true))
		Class245_Sub2.method3192
		    ((((Entity) class104_sub2_sub2_sub5_sub1)
		      .pathX[0]),
		     (((Entity) class104_sub2_sub2_sub5_sub1)
		      .pathZ[0]),
		     class104_sub2_sub2_sub5_sub1, null, null, 0, -114,
		     ((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).lightingHL);
	}
	Network.stream.method841(-97);
    }
}
