/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class133
{
    static RsInterface aRsInterface_1065 = null;
    static int[][] anIntArrayArray1066;
    int anInt1067;
    int anInt1068;
    int anInt1069;
    
    abstract void method2439(int argument_0_, int argument_1_,
			     int argument_2_);
    
    static final void method2440
	(int argument, int argument_3_, int argument_4_, int argument_5_,
	 int argument_6_, int argument_7_, int argument_8_) {
	if (Node_Sub35.anInt4156 <= argument_4_
	    && argument_5_ <= Node_Sub9_Sub2.anInt5776
	    && Class209.anInt1504 <= argument_8_
	    && Node_Sub31_Sub13.anInt5896 >= argument) {
	    if (argument_6_ == 1)
		DoublyLinkedNode_Sub51_Sub8.method1235(argument_8_, argument_4_, (byte) -11, argument_5_, argument_3_, argument);
	    else
		Class204.method2936(argument_3_, argument_4_, -1, argument_5_,
				    argument_8_, argument_6_, argument);
	} else if (argument_6_ == 1)
	    Class6.method227(argument, argument_4_, argument_3_, argument_5_,
			     argument_8_, -3145);
	else
	    Class256_Sub2.method3285(3314, argument, argument_4_, argument_6_,
				     argument_8_, argument_5_, argument_3_);
    }
    
    abstract void method2441(byte argument_9_, int argument_10_,
			     int argument_11_);
    
    public static void method2442(int argument) {
	aRsInterface_1065 = null;
	anIntArrayArray1066 = null;
    }
    
    static final boolean method2443(int argument, int argument_12_,
				    byte argument_13_) {
	if (!((argument_12_ & 0x70000) != 0
	      | Class38.method392(argument_12_, argument, 0))
	    && !Class60.method1336(argument_12_, (byte) -69, argument))
	    return false;
	return true;
    }
    
    abstract void method2444(byte argument_14_, int argument_15_,
			     int argument_16_);
    
    static final void method2445(MenuAction argument, int argument_17_,
				 int argument_18_, int argument_19_) {
	if (argument != null
	    && argument != (DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404
			    .rootNode)) {
	    int p1 = argument.parameter2;
	    int anLocalInt_20_ = argument.anInt6269;
	    int action = argument.action;
	    int p2 = (int) argument.parameter1;
	    if (action >= 2000)
		    action -= 2000;
	    long l = argument.parameter1;
	    if (action == 17) {
		Class134.anInt3613 = 0;
		Class199.anInt1443 = argument_19_;
		Class131.anInt1058 = 2;
		Node_Sub32.anInt4144 = argument_17_;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 38,
					 Node_Sub31_Sub16.aClass372_5910,
					 Rs2DPainter.aClass207_4049);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128(anLocalInt_20_ + MapRelated.baseZ);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p1p128
                    (!client.keyHandler.isKeyDown(82) ? 0 : 1);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(MapRelated.baseX + p1);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2ip128((int) (l >>> 32) & 0x7fffffff);
		Class251.method3243(class59_sub29, true);
		Class53.method480(78, p1, l, anLocalInt_20_);
	    }
	    if (action == 11) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Class354.anInt2974++;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 53,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Node_Sub47.aClass207_4284);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1m128
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-126), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
		}
	    }
	    if (action == 12) {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Class131.anInt1058 = 2;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 68,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class85.aClass207_606);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1m128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-128), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-126), 0, true);
		}
	    }
	    if (action == 45) {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 34,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class62_Sub27.aClass207_4455);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(p2);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-127), 0, true);
		}
	    }
	    if (action == 47) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Node_Sub32.anInt4144 = argument_17_;
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub47_Sub6.anInt6185++;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 34,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (Statics
					      .aClass207_6409));
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-128), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
		}
	    }
	    if (action == 30 || action == 1001)
		Node_Sub47.method1111(true, p1, anLocalInt_20_,
                (argument
                        .aString6276),
                p2);
	    if (action == 8) {
		RsInterface rsInterface
		    = RsInterface.getCreatedChild(anLocalInt_20_, p1);
		if (rsInterface != null)
		    Class24.method340(rsInterface, (byte) -97);
	    }
	    if (action == 53) {
		Class131.anInt1058 = 2;
		Class134.anInt3613 = 0;
		Node_Sub32.anInt4144 = argument_17_;
		Class199.anInt1443 = argument_19_;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 70,
					 Node_Sub31_Sub16.aClass372_5910,
					 Node_Sub31_Sub6.aClass207_5861);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p1m128
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(anLocalInt_20_ + MapRelated.baseZ);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(p2);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(MapRelated.baseX + p1);
		Class251.method3243(class59_sub29, true);
		Statics.method2740(p1, (byte) 71, anLocalInt_20_);
	    }
	    if (action == 21) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub47_Sub6.anInt6185++;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 51,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class323.aClass207_2665);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1m128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-125), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-126), 0, true);
		}
	    }
	    if (action == 2) {
		Node_Sub32.anInt4144 = argument_17_;
		Class134.anInt3613 = 0;
		Class131.anInt1058 = 1;
		Class199.anInt1443 = argument_19_;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 48,
					 Node_Sub31_Sub16.aClass372_5910,
					 Class294.aClass207_2455);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2i_dupl(p1 + MapRelated.baseX);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2ip128(Statics.anInt4519);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p4m3412(Class297.anInt2472);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(anLocalInt_20_ + MapRelated.baseZ);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2ip128(Statics.anInt1181);
		Class251.method3243(class59_sub29, true);
		Statics.method3357(0, 1, -4, (byte) -26, anLocalInt_20_, p1, 1, 0, true);
	    }
	    if (action == 1009) {
		Class199.anInt1443 = argument_19_;
		Node_Sub32.anInt4144 = argument_17_;
		Class131.anInt1058 = 2;
		Class134.anInt3613 = 0;
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Class291 class291 = (class104_sub2_sub2_sub5_sub1
					 .aClass291_6832);
		    if (class291.anIntArray2374 != null)
			class291 = class291.method3485((ClientVariables
							.instance),
						       -1);
		    if (class291 != null) {
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 124,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class341.aClass207_2873);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2(class291.anInt2375);
			Class251.method3243(class59_sub29, true);
		    }
		}
	    }
	    if (action == 1010 || action == 1002
		|| action == 1011 || action == 1006
		|| action == 1007)
		Cs2Runtime.method1473(p1, p2, action);
	    if (action == 5) {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    Class131.anInt1058 = 2;
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 118,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_2712);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(Statics.anInt1181);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(Statics.anInt4519);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p4(Class297.anInt2472);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-125), 0, true);
		}
	    }
	    if (action == 49) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Class199.anInt1443 = argument_19_;
		    Class246.anInt1793++;
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 64,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class360.aClass207_3047);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p4i(Class297.anInt2472);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(Statics.anInt1181);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(Statics.anInt4519);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-128), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
		}
	    }
	    if (action == 10) {
		Node_Sub32.anInt4144 = argument_17_;
		Class134.anInt3613 = 0;
		Class131.anInt1058 = 2;
		Class199.anInt1443 = argument_19_;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 109,
					 Node_Sub31_Sub16.aClass372_5910,
					 Class200.aClass207_1446);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p1
                    (client.keyHandler.isKeyDown(82) ? 1 : 0);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2i_dupl(p2);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p4m3412(Class297.anInt2472);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2ip128(MapRelated.baseX + p1);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128(anLocalInt_20_ + MapRelated.baseZ);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(Statics.anInt4519);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128(Statics.anInt1181);
		Class251.method3243(class59_sub29, true);
		Statics.method2740(p1, (byte) 83, anLocalInt_20_);
	    }
	    if (action == 57) {
		if (Class15.anInt120 > 0
		    && client.keyHandler.isKeyDown(82)
		    && client.keyHandler.isKeyDown(81))
		    Class150.method2546
			((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			  .lightingHL),
			 14328, MapRelated.baseZ + anLocalInt_20_,
			 p1 + MapRelated.baseX);
		else {
		    Class199.anInt1443 = argument_19_;
		    Class131.anInt1058 = 1;
		    Class134.anInt3613 = 0;
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 32,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class2_Sub10.aClass207_3823);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(MapRelated.baseZ + anLocalInt_20_);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(MapRelated.baseX + p1);
		    Class251.method3243(class59_sub29, true);
		}
	    }
	    if (action == 4) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Node_Sub32.anInt4144 = argument_17_;
		    Class199.anInt1443 = argument_19_;
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 111,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class62_Sub27.aClass207_4450);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-128), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-127), 0, true);
		}
	    }
	    if (action == 13) {
		Class131.anInt1058 = 2;
		Class199.anInt1443 = argument_19_;
		Node_Sub32.anInt4144 = argument_17_;
		Class134.anInt3613 = 0;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 85,
					 Node_Sub31_Sub16.aClass372_5910,
					 Class37.aClass207_272);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128((int) (l >>> 32) & 0x7fffffff);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128(p1 + MapRelated.baseX);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2p128(MapRelated.baseZ + anLocalInt_20_);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p1n
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		Class251.method3243(class59_sub29, true);
		Class53.method480(76, p1, l, anLocalInt_20_);
	    }
	    if (action == 25) {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    Node_Sub32.anInt4144 = argument_17_;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 108,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_265);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(p2);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-126), 0, true);
		}
	    }
	    if (action == 3) {
		Node_Sub32.anInt4144 = argument_17_;
		Class199.anInt1443 = argument_19_;
		Class131.anInt1058 = 2;
		Class134.anInt3613 = 0;
		Node_Sub29 class59_sub29
		    = Class91.method1683((byte) 66,
					 Node_Sub31_Sub16.aClass372_5910,
					 Class62_Sub22.aClass207_4434);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2ip128(p2);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p1p128
                    (client.keyHandler.isKeyDown(82) ? 1 : 0);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(MapRelated.baseX + p1);
		class59_sub29.aClass59_Sub28_Sub1_4129
		    .p2(anLocalInt_20_ + MapRelated.baseZ);
		Class251.method3243(class59_sub29, true);
		Statics.method2740(p1, (byte) 105, anLocalInt_20_);
	    }
	    if (action == 59) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Class154_Sub1.anInt5637++;
		    Class199.anInt1443 = argument_19_;
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 88,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (Node_Sub47_Sub12
					      .aClass207_6212));
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(p2);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-125), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
		}
	    }
	    if (action == 52) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [p2]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 39,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_1727);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-126), 0, true);
		}
	    }
	    if (action == 19 && Gl2Water0.aRsInterface_3801 == null) {
		Class341.method3780(1442, anLocalInt_20_, p1);
		Gl2Water0.aRsInterface_3801
		    = RsInterface.getCreatedChild(anLocalInt_20_, p1);
		Class256.method3280(Gl2Water0.aRsInterface_3801, true);
	    }
	    if (action == 50) {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       Class294.aJagexHashMap_2453.get((long) p2));
		if (class59_sub35 != null) {
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub32.anInt4144 = argument_17_;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (class59_sub35
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 40,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class266.aClass207_2136);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-125), 0, true);
		}
	    }
	    if (action == 18) {
		RsInterface rsInterface
		    = RsInterface.getCreatedChild(anLocalInt_20_, p1);
		if (rsInterface != null) {
		    Class362.method3964(0);
		    Node_Sub18 class59_sub18 = client.method122(rsInterface);
		    Class123.method2392((class59_sub18
					 .anInt4008), rsInterface, -114,
					class59_sub18.method709(0));
		    AbstractFont.aString416
			= Class62_Sub9.method1391(rsInterface, (byte) -64);
		    Statics.aString6376
			= rsInterface.aString1968 + "<col=ffffff>";
		    if (AbstractFont.aString416 == null)
			AbstractFont.aString416 = "Null";
		}
	    } else {
		if (action == 9) {
		    Node_Sub35 class59_sub35
			= ((Node_Sub35)
			   Class294.aJagexHashMap_2453
			       .get((long) p2));
		    if (class59_sub35 != null) {
			Class134.anInt3613 = 0;
			Class199.anInt1443 = argument_19_;
			DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			    = (class59_sub35
			       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
			Node_Sub32.anInt4144 = argument_17_;
			Class131.anInt1058 = 2;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 123,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class62_Sub13.aClass207_4404);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129.p1p128
                    ((!client.keyHandler.isKeyDown(82)
                            ? 0 : 1));
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2p128(p2);
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, class104_sub2_sub2_sub5_sub1.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub1.pathZ[0], class104_sub2_sub2_sub5_sub1.pathX[0], class104_sub2_sub2_sub5_sub1.method1830(-126), 0, true);
		    }
		}
		if (action == 60) {
		    Class131.anInt1058 = 2;
		    Class246.anInt1793++;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class134.anInt3613 = 0;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 99,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class360.aClass207_3047);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p4i(Class297.anInt2472);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(Statics.anInt1181);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p2p128
			(
                    (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
                            .anInt6745));
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(Statics.anInt4519);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		}
		if (action == 51) {
		    if (Class15.anInt120 > 0
			&& client.keyHandler.isKeyDown(82)
			&& client.keyHandler.isKeyDown(81))
			Class150.method2546
			    ((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			      .lightingHL),
			     14328, anLocalInt_20_ + MapRelated.baseZ,
			     MapRelated.baseX + p1);
		    else {
			Node_Sub29 class59_sub29
			    = Class298.method3518(p1, p2,
						  anLocalInt_20_, 255);
			if (p2 != 1) {
			    Class199.anInt1443 = argument_19_;
			    Class131.anInt1058 = 1;
			    Node_Sub32.anInt4144 = argument_17_;
			    Class134.anInt3613 = 0;
			} else {
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p1(-1);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p1(-1);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p2
                        ((int) DoublyLinkedNodeP2_Sub6.aFloat4538);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p1(57);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129
				.p1(Class2_Sub10.anInt3824);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129
				.p1(Node_Sub11.anInt3945);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p1(89);
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p2
                        (
                                (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
                                        .worldX));
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p2
                        (
                                (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
                                        .worldZ));
			    class59_sub29
				.aClass59_Sub28_Sub1_4129.p1(63);
			}
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, 1, -4, (byte) -26, anLocalInt_20_, p1, 1, 0, true);
		    }
		}
		if (action == 23) {
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 125,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class77.aClass207_532);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(anLocalInt_20_ + MapRelated.baseZ);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(MapRelated.baseX + p1);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128((int) (l >>> 32) & 0x7fffffff);
		    Class251.method3243(class59_sub29, true);
		    Class53.method480(106, p1, l, anLocalInt_20_);
		}
		if (action == 48) {
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 58,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (Node_Sub31_Sub3
					      .aClass207_5849));
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(MapRelated.baseX + p1);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p2p128
			(anLocalInt_20_ + MapRelated.baseZ);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            !client.keyHandler.isKeyDown(82) ? 0 : 1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method2740(p1, (byte) 94, anLocalInt_20_);
		}
		if (action == 6) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [p2]);
		    if (class104_sub2_sub2_sub5_sub2 != null) {
			Node_Sub32.anInt4144 = argument_17_;
			Class199.anInt1443 = argument_19_;
			Class134.anInt3613 = 0;
			Node_Sub31_Sub27.anInt5962++;
			Class131.anInt1058 = 2;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 93,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 (DoublyLinkedNode_Sub51_Sub15
						  .aClass207_6315));
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2ip128(p2);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129.p1p128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-125), 0, true);
		    }
		}
		if (action == 20) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [p2]);
		    if (class104_sub2_sub2_sub5_sub2 != null) {
			Class46_Sub3_Sub1.anInt5739++;
			Class134.anInt3613 = 0;
			Node_Sub32.anInt4144 = argument_17_;
			Class131.anInt1058 = 2;
			Class199.anInt1443 = argument_19_;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 39,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class253_Sub1.aClass207_5656);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2ip128(p2);
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-126), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-128), 0, true);
		    }
		}
		if (action == 44) {
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 39,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class371.aClass207_3184);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p2p128
			(MapRelated.baseX + p1);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(MapRelated.baseZ + anLocalInt_20_);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1p128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    Class251.method3243(class59_sub29, true);
		    Statics.method2740(p1, (byte) 75, anLocalInt_20_);
		}
		if (action == 58) {
		    Class131.anInt1058 = 2;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class199.anInt1443 = argument_19_;
		    Class134.anInt3613 = 0;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 119,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class99.aClass207_773);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1p128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2p128((int) (l >>> 32) & 0x7fffffff);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(MapRelated.baseX + p1);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p2p128
			(MapRelated.baseZ + anLocalInt_20_);
		    Class251.method3243(class59_sub29, true);
		    Class53.method480(93, p1, l, anLocalInt_20_);
		}
		if (action == 46) {
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class134.anInt3613 = 0;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 68,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class62_Sub9.aClass207_4398);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(MapRelated.baseZ + anLocalInt_20_);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1n
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(p2);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl(MapRelated.baseX + p1);
		    Class251.method3243(class59_sub29, true);
		    Statics.method2740(p1, (byte) 120, anLocalInt_20_);
		}
		if (action == 1008) {
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 44,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     (MenuAction
					      .aClass207_6281));
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    Class251.method3243(class59_sub29, true);
		}
		if (action == 1003) {
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub32.anInt4144 = argument_17_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 90,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_271);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p2);
		    Class251.method3243(class59_sub29, true);
		}
		if (action == 16) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [p2]);
		    if (class104_sub2_sub2_sub5_sub2 != null) {
			Node_Sub31_Sub18.anInt5919++;
			Class131.anInt1058 = 2;
			Class199.anInt1443 = argument_19_;
			Node_Sub32.anInt4144 = argument_17_;
			Class134.anInt3613 = 0;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 52,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Class133_Sub4.aClass207_5030);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129.p1
                    ((!client.keyHandler.isKeyDown(82)
                            ? 0 : 1));
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2(p2);
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-125), 0, true);
		    }
		}
		if (action == 22) {
		    Node_Sub32.anInt4144 = argument_17_;
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Class199.anInt1443 = argument_19_;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 53,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class196.aClass207_1435);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(Statics.anInt4519);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1m128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p2p128
			(p1 + MapRelated.baseX);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(Statics.anInt1181);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2i_dupl((int) (l >>> 32) & 0x7fffffff);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(MapRelated.baseZ + anLocalInt_20_);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p4(Class297.anInt2472);
		    Class251.method3243(class59_sub29, true);
		    Class53.method480(111, p1, l, anLocalInt_20_);
		}
		if (action == 15) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [p2]);
		    if (class104_sub2_sub2_sub5_sub2 != null) {
			Node_Sub32.anInt4144 = argument_17_;
			Class131.anInt1058 = 2;
			Node_Sub47_Sub6.anInt6185++;
			Class134.anInt3613 = 0;
			Class199.anInt1443 = argument_19_;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 42,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 Node_Sub32.aClass207_4140);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129
			    .p2i_dupl(p2);
			class59_sub29
			    .aClass59_Sub28_Sub1_4129.p1m128
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
			Class251.method3243(class59_sub29, true);
			Statics.method3357(0, class104_sub2_sub2_sub5_sub2.method1830(-127), -2, (byte) -26, class104_sub2_sub2_sub5_sub2.pathZ[0], class104_sub2_sub2_sub5_sub2.pathX[0], class104_sub2_sub2_sub5_sub2.method1830(-125), 0, true);
		    }
		}
		if (action == 1012) {
		    Node_Sub32.anInt4144 = argument_17_;
		    Class199.anInt1443 = argument_19_;
		    Class131.anInt1058 = 2;
		    Class134.anInt3613 = 0;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 69,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class262.aClass207_2041);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129.p1
                    (
                            client.keyHandler.isKeyDown(82) ? 1 : 0);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2(p1 + MapRelated.baseX);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2((int) (l >>> 32) & 0x7fffffff);
		    class59_sub29
			.aClass59_Sub28_Sub1_4129
			.p2ip128(anLocalInt_20_ + MapRelated.baseZ);
		    Class251.method3243(class59_sub29, true);
		    Class53.method480(126, p1, l, anLocalInt_20_);
		}
		if (Class353.aBoolean2953)
		    Class362.method3964(0);
		if (Class2_Sub1.aRsInterface_3762 != null
		    && Class234.anInt1716 == 0)
		    Class256.method3280(Class2_Sub1.aRsInterface_3762, true);
	    }
	}
    }
    
    Class133(int argument_23_, int argument_24_, int argument_25_) {
	this.anInt1069 = argument_23_;
	this.anInt1068 = argument_25_;
	this.anInt1067 = argument_24_;
    }
}
