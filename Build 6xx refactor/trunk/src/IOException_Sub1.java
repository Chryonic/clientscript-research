/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class IOException_Sub1 extends IOException
{
    static int anInt39;
    static Class368[] aClass368Array40;
    static int[] anIntArray41;

    static final void method131(byte argument) {
	if (DoublyLinkedNode_Sub51_Sub14.anInt6305 > 1) {
	    DoublyLinkedNode_Sub51_Sub14.anInt6305--;
	    JagexHashMap.anInt490 = Class359.anInt3038;
	}
	if (Statics.aBoolean1173) {
	    Statics.aBoolean1173 = false;
	    Node_Sub11.method685((byte) -54);
	} else {
	    if (!Node_Sub31_Sub39.aBoolean6055)
		Statics.method3267(1024);
	    for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++) {
		if (!Network.method1114())
		    break;
	    }
	    if (Statics.anInt1652 == 10) {
		while (Class245_Sub1.method3176((byte) -14)) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 57,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     GraphicsToolkit_Sub2.aClass207_4684);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1(0);
		    int anLocalInt
			= (((Packet) (((Node_Sub29) class59_sub29)
					     .aClass59_Sub28_Sub1_4129))
			   .pos);
		    Class46_Sub2.method444((((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129),
					   56);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.psize1
                    ((((Packet) (((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129))
                            .pos) - anLocalInt);
		    Class251.method3243(class59_sub29, true);
		}
		if (Class269.aClass59_Sub1_2154 != null) {
		    if (((Node_Sub1) Class269.aClass59_Sub1_2154).anInt3866
			!= -1) {
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 60,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 (Node_Sub37_Sub4
						  .aClass207_6131));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p2
                    (
                            (((Node_Sub1) Class269.aClass59_Sub1_2154)
                                    .anInt3866));
			Class251.method3243(class59_sub29, true);
			Class269.aClass59_Sub1_2154 = null;
			Statics.aLong2229 = Applet_Sub1.getGameTime() + 30000L;
		    }
		} else if (Applet_Sub1.getGameTime() >= Statics.aLong2229)
		    Class269.aClass59_Sub1_2154
			= (Node_Sub24.aClass31_4063.method363
			   ((((GameServer) Statics.aGameServer_6149)
			     .address),
			    true));
		AbstractMouseMessage class59_sub46
		    = ((AbstractMouseMessage)
		       Class376.aCyclicLinkedList_3214.getFirst());
		if (class59_sub46 != null
		    || Class70.aLong480 < Applet_Sub1.getGameTime() + -2000L) {
		    Node_Sub29 class59_sub29 = null;
		    int anLocalInt = 0;
		    for (AbstractMouseMessage class59_sub46_0_
			     = (AbstractMouseMessage) Node_Sub47_Sub12
						   .aCyclicLinkedList_6211
						   .getFirst();
			 class59_sub46_0_ != null;
			 class59_sub46_0_
			     = (AbstractMouseMessage) Node_Sub47_Sub12
						   .aCyclicLinkedList_6211
						   .getNext()) {
			if (class59_sub29 != null
			    && (((Packet)
				 (((Node_Sub29) class59_sub29)
				  .aClass59_Sub28_Sub1_4129)).pos
				- anLocalInt) >= 240)
			    break;
			class59_sub46_0_.unlink();
			int anLocalInt_1_ = class59_sub46_0_.getY();
			if (anLocalInt_1_ < -1)
			    anLocalInt_1_ = -1;
			else if (anLocalInt_1_ > 65534)
			    anLocalInt_1_ = 65534;
			int anLocalInt_2_ = class59_sub46_0_.getX();
			if (anLocalInt_2_ < -1)
			    anLocalInt_2_ = -1;
			else if (anLocalInt_2_ > 65534)
			    anLocalInt_2_ = 65534;
			if (Class316.anInt2611 != anLocalInt_2_
			    || anLocalInt_1_ != Class128.anInt1040) {
			    if (class59_sub29 == null) {
				class59_sub29
				    = Class91.method1683((byte) 40,
							 (Node_Sub31_Sub16
							  .aClass372_5910),
							 (Class209
							  .aClass207_1499));
				((Node_Sub29) class59_sub29)
				    .aClass59_Sub28_Sub1_4129
				    .p1(0);
				anLocalInt
				    = ((Packet)
				       (((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129)).pos;
			    }
			    int anLocalInt_3_
				= -Class316.anInt2611 + anLocalInt_2_;
			    Class316.anInt2611 = anLocalInt_2_;
			    int anLocalInt_4_
				= anLocalInt_1_ - Class128.anInt1040;
			    Class128.anInt1040 = anLocalInt_1_;
			    int anLocalInt_5_
				= (int) ((class59_sub46_0_.getEventTime()
					  + -Class70.aLong480)
					 / 20L);
			    if (anLocalInt_5_ >= 8 || anLocalInt_3_ < -32
				|| anLocalInt_3_ > 31 || anLocalInt_4_ < -32
				|| anLocalInt_4_ > 31) {
				if (anLocalInt_5_ < 32 && anLocalInt_3_ >= -128
				    && anLocalInt_3_ <= 127
				    && anLocalInt_4_ >= -128
				    && anLocalInt_4_ <= 127) {
				    anLocalInt_3_ += 128;
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129
					.p1(anLocalInt_5_ + 128);
				    anLocalInt_4_ += 128;
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129.p2
                            (
                                    (anLocalInt_3_ << 8) + anLocalInt_4_);
				} else if (anLocalInt_5_ >= 32) {
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129.p2
                            (anLocalInt_5_ + 57344);
				    if (anLocalInt_2_ != 1
					&& anLocalInt_1_ != -1)
					((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129.p4
					    ((anLocalInt_1_ << 16
                                | anLocalInt_2_)
                        );
				    else
					((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129
					    .p4(-2147483648);
				} else {
				    ((Node_Sub29) class59_sub29)
					.aClass59_Sub28_Sub1_4129
					.p1(192 + anLocalInt_5_);
				    if (anLocalInt_2_ == 1
					|| anLocalInt_1_ == -1)
					((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129.p4
					    (-2147483648);
				    else
					((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129.p4
					    ((anLocalInt_1_ << 16
                                | anLocalInt_2_)
                        );
				}
			    } else {
				anLocalInt_4_ += 32;
				anLocalInt_3_ += 32;
				((Node_Sub29) class59_sub29)
				    .aClass59_Sub28_Sub1_4129.p2
                        (((anLocalInt_3_ << 6)
                                + (anLocalInt_5_ << 12)
                                + anLocalInt_4_));
			    }
			    Class70.aLong480 = class59_sub46_0_.getEventTime();
			}
		    }
		    if (class59_sub29 != null) {
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.psize1
                    (
                            (((Packet) (((Node_Sub29) class59_sub29)
                                    .aClass59_Sub28_Sub1_4129))
                                    .pos) - anLocalInt);
			Class251.method3243(class59_sub29, true);
		    }
		}
		if (class59_sub46 != null) {
		    long l = ((class59_sub46.getEventTime()
			       + -Node_Sub47_Sub6.aLong6183)
			      / 50L);
		    Node_Sub47_Sub6.aLong6183
			= class59_sub46.getEventTime();
		    if (l > 32767L)
			l = 32767L;
		    int anLocalInt = class59_sub46.getY();
		    if (anLocalInt < 0)
			anLocalInt = 0;
		    else if (anLocalInt > 65535)
			anLocalInt = 65535;
		    int anLocalInt_6_ = class59_sub46.getX();
		    if (anLocalInt_6_ >= 0) {
			if (anLocalInt_6_ > 65535)
			    anLocalInt_6_ = 65535;
		    } else
			anLocalInt_6_ = 0;
		    int anLocalInt_7_ = 0;
		    if (class59_sub46.getAction() == 2)
			anLocalInt_7_ = 1;
		    int anLocalInt_8_ = (int) l;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 62,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Statics.aClass207_4469);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p4i
                    (anLocalInt << 16 | anLocalInt_6_);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p2p128
			(anLocalInt_8_ | anLocalInt_7_ << 15);
		    Class251.method3243(class59_sub29, true);
		}
		if (Node_Sub31_Sub29.anInt5980 > 0) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 117,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class349.aClass207_2920);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129
			.p1(Node_Sub31_Sub29.anInt5980 * 3);
		    for (int anLocalInt = 0;
			 Node_Sub31_Sub29.anInt5980 > anLocalInt;
			 anLocalInt++) {
			IKeyMessage keyMessage
			    = (Node_Sub36_Sub1.keyMessages
			       [anLocalInt]);
			long l = ((keyMessage.getEventTime()
				   - Node_Sub36.aLong4161)
				  / 50L);
			if (l > 65535L)
			    l = 65535L;
			Node_Sub36.aLong4161 = keyMessage.getEventTime();
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .p1(keyMessage.getKeyCode());
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .p2((int) l);
		    }
		    Class251.method3243(class59_sub29, true);
		}
		if (Class1.anInt3503 > 0)
		    Class1.anInt3503--;
		if (Statics.aBoolean3513 && Class1.anInt3503 <= 0) {
		    Statics.aBoolean3513 = false;
		    Class1.anInt3503 = 20;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 47,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class62_Sub26.aClass207_4448);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p2p128
			((int) DoublyLinkedNodeP2_Sub6.aFloat4538 >> 3);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p2
                    ((int) DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6623 >> 3);
		    Class251.method3243(class59_sub29, true);
		}
		if (Class87.aBoolean3551 != Node_Sub31_Sub31.aBoolean5990) {
		    Class87.aBoolean3551 = Node_Sub31_Sub31.aBoolean5990;
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 45,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class131.aClass207_1057);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1
                    (Node_Sub31_Sub31.aBoolean5990 ? 1 : 0);
		    Class251.method3243(class59_sub29, true);
		}
		if (!Class152.aBoolean1149) {
		    Node_Sub29 class59_sub29
			= Class91.method1683((byte) 92,
					     (Node_Sub31_Sub16
					      .aClass372_5910),
					     Class234.aClass207_1710);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.p1(0);
		    int anLocalInt
			= (((Packet) (((Node_Sub29) class59_sub29)
					     .aClass59_Sub28_Sub1_4129))
			   .pos);
		    Packet class59_sub28
			= AthmosphericConditions.aClass59_Sub50_116.method1158((byte) -10);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.pbytes
                    (((Packet) class59_sub28).data,
                            0, ((Packet) class59_sub28).pos);
		    ((Node_Sub29) class59_sub29)
			.aClass59_Sub28_Sub1_4129.psize1
                    ((((Packet) (((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129))
                            .pos) - anLocalInt);
		    Class251.method3243(class59_sub29, true);
		    Class152.aBoolean1149 = true;
		}
		if (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 != null) {
		    if (Statics.anInt1745 == 2)
			LoadingStatus.method373(98);
		    else if (Statics.anInt1745 == 3)
			Class150.method2544(3);
		}
		if (!Class266.aBoolean2105)
		    Statics.aFloat4338 /= 2.0F;
		else
		    Class266.aBoolean2105 = false;
		if (Class80.aBoolean574)
		    Class80.aBoolean574 = false;
		else
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6625 /= 2.0F;
		Statics.method3001((byte) 53);
		if (Statics.anInt1652 == 10) {
		    DoublyLinkedNodeP2_Sub8.method1938(1204339692);
		    Class84.method1616(6594);
		    Class291.method3494(false);
		    Node_Sub31_Sub24.anInt5949++;
		    if (Node_Sub31_Sub24.anInt5949 > 750)
			Node_Sub11.method685((byte) -54);
		    else {
			Statics.method1099(0);
			RuntimeException_Sub2.method4222((byte) -100);
			Node_Sub19.method714(86);
			for (int anLocalInt = ClientVariables
						  .instance
						  .resetOld(true);
			     anLocalInt != -1;
			     anLocalInt = ClientVariables
					      .instance
					      .resetOld(false)) {
			    Node_Sub13.method692(6, anLocalInt);
			    GlImageSkybox.anIntArray838
				[MathStatics
				     .AND(31, ClanChannel.anInt4353++)]
				= anLocalInt;
			}
			for (DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
				 = DoublyLinkedNode_Sub51_Sub5.method1197((byte) 123);
			     class59_sub51_sub3 != null;
			     class59_sub51_sub3
				 = DoublyLinkedNode_Sub51_Sub5.method1197((byte) 127)) {
			    int anLocalInt
				= class59_sub51_sub3.method1183(-3356);
			    long l = class59_sub51_sub3.method1184(71);
			    if (anLocalInt != 1) {
				if (anLocalInt != 2) {
				    if (anLocalInt != 3) {
					if (anLocalInt != 4) {
					    if (anLocalInt != 5) {
						if (anLocalInt != 6) {
						    if (anLocalInt == 7) {
							RsInterface rsInterface
							    = (RsInterface
								   .getByHash((int) l));
							boolean anLocalBoolean
							    = (((DoublyLinkedNode_Sub51_Sub3)
								class59_sub51_sub3)
							       .anInt6231) == 1;
							if (anLocalBoolean
							    == !(((RsInterface) rsInterface)
								 .aBoolean1854)) {
							    ((RsInterface) rsInterface)
								.aBoolean1854
								= anLocalBoolean;
							    Class256.method3280
								(rsInterface,
								 true);
							}
						    } else if (anLocalInt
							       == 8) {
							RsInterface rsInterface
							    = (RsInterface
								   .getByHash((int) l));
							if (((((RsInterface) rsInterface)
							      .anInt1885)
							     != (((DoublyLinkedNode_Sub51_Sub3)
								  class59_sub51_sub3)
								 .anInt6231))
							    || ((((DoublyLinkedNode_Sub51_Sub3)
								  class59_sub51_sub3)
								 .anInt6233)
								!= (((RsInterface) rsInterface)
								    .anInt1884))
							    || ((((RsInterface) rsInterface)
								 .anInt1906)
								!= (((DoublyLinkedNode_Sub51_Sub3)
								     class59_sub51_sub3)
								    .anInt6234))) {
							    ((RsInterface) rsInterface)
								.anInt1906
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6234);
							    ((RsInterface) rsInterface)
								.anInt1884
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6233);
							    ((RsInterface) rsInterface)
								.anInt1885
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							    if ((((RsInterface) rsInterface)
								 .anInt1870)
								!= -1) {
								if ((((RsInterface) rsInterface)
								     .anInt1886)
								    > 0)
								    ((RsInterface) rsInterface)
									.anInt1906
									= (((RsInterface) rsInterface).anInt1906
									   * 32
									   / ((RsInterface) rsInterface).anInt1886);
								else if ((((RsInterface) rsInterface)
									  .width)
									 > 0)
								    ((RsInterface) rsInterface)
									.anInt1906
									= (((RsInterface) rsInterface).anInt1906
									   * 32
									   / ((RsInterface) rsInterface).width);
							    }
							    Class256.method3280
								(rsInterface,
								 true);
							}
						    } else if (anLocalInt
							       == 9) {
							RsInterface rsInterface
							    = (RsInterface
								   .getByHash((int) l));
							if (((((DoublyLinkedNode_Sub51_Sub3)
							       class59_sub51_sub3)
							      .anInt6231)
							     != (((RsInterface) rsInterface)
								 .anInt1870))
							    || ((((DoublyLinkedNode_Sub51_Sub3)
								  class59_sub51_sub3)
								 .anInt6233)
								!= (((RsInterface) rsInterface)
								    .anInt1925))) {
							    ((RsInterface) rsInterface)
								.anInt1870
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							    ((RsInterface) rsInterface)
								.anInt1925
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6233);
							    Class256.method3280
								(rsInterface,
								 true);
							}
						    } else if (anLocalInt
							       == 10) {
							RsInterface rsInterface
							    = (RsInterface
								   .getByHash((int) l));
							if (((((DoublyLinkedNode_Sub51_Sub3)
							       class59_sub51_sub3)
							      .anInt6231)
							     != (((RsInterface) rsInterface)
								 .anInt1937))
							    || ((((RsInterface) rsInterface)
								 .anInt1811)
								!= (((DoublyLinkedNode_Sub51_Sub3)
								     class59_sub51_sub3)
								    .anInt6233))
							    || ((((DoublyLinkedNode_Sub51_Sub3)
								  class59_sub51_sub3)
								 .anInt6234)
								!= (((RsInterface) rsInterface)
								    .anInt1837))) {
							    ((RsInterface) rsInterface)
								.anInt1837
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6234);
							    ((RsInterface) rsInterface)
								.anInt1811
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6233);
							    ((RsInterface) rsInterface)
								.anInt1937
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							    Class256.method3280
								(rsInterface,
								 true);
							}
						    } else if (anLocalInt
							       != 11) {
							if (anLocalInt == 12) {
							    RsInterface rsInterface
								= (RsInterface
								       .getByHash((int) l));
							    int anLocalInt_9_
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							    if ((rsInterface
								 != null)
								&& ((((RsInterface) rsInterface)
								     .type)
								    == 0)) {
								if (((((RsInterface) rsInterface)
								      .anInt1882)
								     - (((RsInterface) rsInterface)
									.renderHeight))
								    < anLocalInt_9_)
								    anLocalInt_9_
									= (((RsInterface) rsInterface).anInt1882
									   - ((RsInterface) rsInterface).renderHeight);
								if (anLocalInt_9_
								    < 0)
								    anLocalInt_9_
									= 0;
								if (anLocalInt_9_
								    != (((RsInterface) rsInterface)
									.anInt1838)) {
								    ((RsInterface) rsInterface)
									.anInt1838
									= anLocalInt_9_;
								    Class256
									.method3280
									(rsInterface,
									 true);
								}
							    }
							} else if (anLocalInt
								   == 14) {
							    RsInterface rsInterface
								= (RsInterface
								       .getByHash((int) l));
							    ((RsInterface) rsInterface)
								.anInt1864
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							} else if (anLocalInt
								   != 15) {
							    if (anLocalInt
								== 16) {
								RsInterface rsInterface
								    = (RsInterface
									   .getByHash((int) l));
								((RsInterface) rsInterface)
								    .anInt1887
								    = (((DoublyLinkedNode_Sub51_Sub3)
									class59_sub51_sub3)
								       .anInt6231);
							    } else if (anLocalInt
								       != 17) {
								if (anLocalInt
								    == 18) {
								    RsInterface rsInterface
									= (RsInterface.getByHash((int) l));
								    int anLocalInt_10_
									= (int) (l >> 32);
								    rsInterface
									.method3214
									(anLocalInt_10_,
									 (short) ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233,
									 (byte) 121,
									 (short) ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231);
								} else if (anLocalInt
									   == 19) {
								    RsInterface rsInterface
									= (RsInterface.getByHash((int) l));
								    int anLocalInt_11_
									= (int) (l >> 32);
								    rsInterface
									.method3227
									(anLocalInt_11_,
									 (short) ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233,
									 false,
									 (short) ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231);
								}
							    } else {
								RsInterface rsInterface
								    = (RsInterface
									   .getByHash((int) l));
								((RsInterface) rsInterface)
								    .anInt1833
								    = (((DoublyLinkedNode_Sub51_Sub3)
									class59_sub51_sub3)
								       .anInt6231);
							    }
							} else {
							    Class18.aBoolean127
								= true;
							    ModeWhatEnum.anInt2310
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6233);
							    Class382.anInt3242
								= (((DoublyLinkedNode_Sub51_Sub3)
								    class59_sub51_sub3)
								   .anInt6231);
							}
						    } else {
							RsInterface rsInterface
							    = (RsInterface
								   .getByHash((int) l));
							((RsInterface) rsInterface)
							    .renderX
							    = ((RsInterface) rsInterface)
								  .x
							    = (((DoublyLinkedNode_Sub51_Sub3)
								class59_sub51_sub3)
							       .anInt6231);
							((RsInterface) rsInterface)
							    .horizontalRepositionMode
							    = (byte) 0;
							((RsInterface) rsInterface)
							    .renderY
							    = ((RsInterface) rsInterface)
								  .y
							    = (((DoublyLinkedNode_Sub51_Sub3)
								class59_sub51_sub3)
							       .anInt6233);
							((RsInterface) rsInterface)
							    .verticalRepositionMode
							    = (byte) 0;
							Class256.method3280
							    (rsInterface, true);
						    }
						} else {
						    int anLocalInt_12_
							= (((DoublyLinkedNode_Sub51_Sub3)
							    class59_sub51_sub3)
							   .anInt6231);
						    int anLocalInt_13_
							= (anLocalInt_12_ >> 10
							   & 0x1f);
						    int anLocalInt_14_
							= ((anLocalInt_12_
							    & 0x3f1)
							   >> 5);
						    int anLocalInt_15_
							= (anLocalInt_12_
							   & 0x1f);
						    int anLocalInt_16_
							= ((anLocalInt_13_
							    << 19)
							   + (anLocalInt_14_
							      << 11)
							   + (anLocalInt_15_
							      << 3));
						    RsInterface rsInterface
							= (RsInterface
							       .getByHash((int) l));
						    if (anLocalInt_16_
							!= (((RsInterface) rsInterface)
							    .colour)) {
							((RsInterface) rsInterface)
							    .colour
							    = anLocalInt_16_;
							Class256.method3280
							    (rsInterface, true);
						    }
						}
					    } else {
						RsInterface rsInterface
						    = (RsInterface.getByHash((int) l));
						if (((((RsInterface) rsInterface)
						      .anInt1812)
						     != (((DoublyLinkedNode_Sub51_Sub3)
							  class59_sub51_sub3)
							 .anInt6231))
						    || (((DoublyLinkedNode_Sub51_Sub3)
							 class59_sub51_sub3)
							.anInt6231) == -1) {
						    ((RsInterface) rsInterface)
							.anInt1812
							= (((DoublyLinkedNode_Sub51_Sub3)
							    class59_sub51_sub3)
							   .anInt6231);
						    ((RsInterface) rsInterface)
							.anInt1853
							= 0;
						    ((RsInterface) rsInterface)
							.anInt1898
							= 1;
						    ((RsInterface) rsInterface)
							.anInt1905
							= 0;
						    Class367 class367
							= ((((RsInterface) rsInterface)
							    .anInt1812) != -1
							   ? (DoublyLinkedNodeP2_Sub2_Sub4
								  .aClass336_6425
								  .method3758
							      ((((RsInterface) rsInterface)
								.anInt1812),
							       0))
							   : null);
						    if (class367 != null)
							Node_Sub47_Sub11
							    .method1138
                                        (0,
                                                (((RsInterface) rsInterface)
                                                        .anInt1853),
                                                class367);
						    Class256.method3280
							(rsInterface, true);
						}
					    }
					} else {
					    RsInterface rsInterface
						= RsInterface
						      .getByHash((int) l);
					    int anLocalInt_17_
						= (((DoublyLinkedNode_Sub51_Sub3)
						    class59_sub51_sub3)
						   .anInt6231);
					    int anLocalInt_18_
						= (((DoublyLinkedNode_Sub51_Sub3)
						    class59_sub51_sub3)
						   .anInt6233);
					    int anLocalInt_19_
						= (((DoublyLinkedNode_Sub51_Sub3)
						    class59_sub51_sub3)
						   .anInt6234);
					    if ((anLocalInt_17_
						 != (((RsInterface) rsInterface)
						     .anInt1822))
						|| (anLocalInt_18_
						    != (((RsInterface) rsInterface)
							.anInt1929))
						|| ((((RsInterface) rsInterface)
						     .anInt1861)
						    != anLocalInt_19_)) {
						((RsInterface) rsInterface).anInt1822
						    = anLocalInt_17_;
						((RsInterface) rsInterface).anInt1861
						    = anLocalInt_19_;
						((RsInterface) rsInterface).anInt1929
						    = anLocalInt_18_;
						Class256.method3280(rsInterface,
								    true);
					    }
					}
				    } else {
					RsInterface rsInterface
					    = RsInterface.getByHash((int) l);
					if (!((DoublyLinkedNode_Sub51_Sub3)
					      class59_sub51_sub3)
						 .aString6230.equals
					     (((RsInterface) rsInterface)
					      .aString1921)) {
					    ((RsInterface) rsInterface).aString1921
						= (((DoublyLinkedNode_Sub51_Sub3)
						    class59_sub51_sub3)
						   .aString6230);
					    Class256.method3280(rsInterface,
								true);
					}
				    }
				} else {
				    Cs2Runtime.stringGlobalVariable[(int) l]
					= ((DoublyLinkedNode_Sub51_Sub3)
					   class59_sub51_sub3).aString6230;
				    Node_Sub29.anIntArray4127
					[(MathStatics.AND(31, Class90.anInt681++))]
					= (int) l;
				}
			    } else {
				Cs2Runtime.integerGlobalVariables[(int) l]
				    = ((DoublyLinkedNode_Sub51_Sub3)
				       class59_sub51_sub3).anInt6231;
				Class242.aBoolean1771
				    |= Class273.aBooleanArray2184[(int) l];
				Class313.anIntArray2599
				    [MathStatics
					 .AND(31, Statics.anInt3587++)]
				    = (int) l;
			    }
			}
			Class350.anInt2930++;
			if (Class131.anInt1058 != 0) {
			    Class134.anInt3613 += 20;
			    if (Class134.anInt3613 >= 400)
				Class131.anInt1058 = 0;
			}
			if (Class2_Sub1.aRsInterface_3762 != null) {
			    Class234.anInt1716++;
			    if (Class234.anInt1716 >= 15) {
				Class256.method3280(Class2_Sub1.aRsInterface_3762,
						    true);
				Class2_Sub1.aRsInterface_3762 = null;
			    }
			}
			MultilanguageString.aRsInterface_2865 = null;
			GlImageSkybox.aBoolean829 = false;
			Class131.aRsInterface_1061 = null;
			Statics.aBoolean1729 = false;
			Class376.method4091(-1, -1, 55, null);
			Class62_Sub5.method1373(-1, -85, null, -1);
			if (!Class353.aBoolean2953)
			    Class62_Sub10.anInt4399 = -1;
			Node_Sub2.method533(-1);
			Class359.anInt3038++;
			if (DxSkybox.aBoolean4473) {
			    Node_Sub29 class59_sub29
				= Class91.method1683((byte) 42,
						     (Node_Sub31_Sub16
						      .aClass372_5910),
						     Class247.aClass207_1798);
			    ((Node_Sub29) class59_sub29)
				.aClass59_Sub28_Sub1_4129.p4m2143
                        ((Class25.anInt168 << 28
                                | Statics.anInt1744 << 14
                                | Class276.anInt2212));
			    Class251.method3243(class59_sub29, true);
			    DxSkybox.aBoolean4473 = false;
			}
			for (;;) {
			    Cs2Trigger class59_sub27
				= ((Cs2Trigger)
				   Class43.aCyclicLinkedList_308.remove());
			    if (class59_sub27 == null)
				break;
			    RsInterface rsInterface
				= (((Cs2Trigger) class59_sub27)
				   .aRsInterface_4115);
			    if (((RsInterface) rsInterface).subId >= 0) {
				RsInterface rsInterface_20_
				    = RsInterface.getByHash((((RsInterface) rsInterface).parentId));
				if (rsInterface_20_ == null
				    || (((RsInterface) rsInterface_20_)
					.children) == null
				    || (((RsInterface) rsInterface).subId
					>= (((RsInterface) rsInterface_20_)
					    .children).length)
				    || ((((RsInterface) rsInterface_20_)
					 .children
					 [((RsInterface) rsInterface).subId])
					!= rsInterface))
				    continue;
			    }
			    Cs2Runtime.executeTrigger(class59_sub27);
			}
			for (;;) {
			    Cs2Trigger class59_sub27
				= ((Cs2Trigger)
				   Class124.aCyclicLinkedList_1012.remove());
			    if (class59_sub27 == null)
				break;
			    RsInterface rsInterface
				= (((Cs2Trigger) class59_sub27)
				   .aRsInterface_4115);
			    if (((RsInterface) rsInterface).subId >= 0) {
				RsInterface rsInterface_21_
				    = RsInterface.getByHash((((RsInterface) rsInterface).parentId));
				if (rsInterface_21_ == null
				    || (((RsInterface) rsInterface_21_)
					.children) == null
				    || (((RsInterface) rsInterface).subId
					>= (((RsInterface) rsInterface_21_)
					    .children).length)
				    || rsInterface != (((RsInterface) rsInterface_21_)
						    .children
						    [(((RsInterface) rsInterface)
						      .subId)]))
				    continue;
			    }
			    Cs2Runtime.executeTrigger(class59_sub27);
			}
			for (;;) {
			    Cs2Trigger class59_sub27
				= ((Cs2Trigger)
				   DoublyLinkedNode_Sub51_Sub19.triggerQueue
				       .remove());
			    if (class59_sub27 == null)
				break;
			    RsInterface rsInterface
				= (((Cs2Trigger) class59_sub27)
				   .aRsInterface_4115);
			    if (((RsInterface) rsInterface).subId >= 0) {
				RsInterface rsInterface_22_
				    = RsInterface.getByHash((((RsInterface) rsInterface).parentId));
				if (rsInterface_22_ == null
				    || (((RsInterface) rsInterface_22_)
					.children) == null
				    || (((RsInterface) rsInterface).subId
					>= (((RsInterface) rsInterface_22_)
					    .children).length)
				    || ((((RsInterface) rsInterface_22_)
					 .children
					 [((RsInterface) rsInterface).subId])
					!= rsInterface))
				    continue;
			    }
			    Cs2Runtime.executeTrigger(class59_sub27);
			}
			if (MultilanguageString.aRsInterface_2865 == null)
			    Class123.anInt1002 = 0;
			if (dba_sub_772.aRsInterface_4345 != null)
			    Class26.method346(-125);
			if (Class15.anInt120 > 0
			    && client.keyHandler.isKeyDown(82)
			    && client.keyHandler.isKeyDown(81)
			    && Class62_Sub8.anInt4396 != 0) {
			    int anLocalInt
				= (-Class62_Sub8.anInt4396
				   + (((DoublyLinkedNodeP2_Sub2)
				       (Class308
					.aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				      .lightingHL));
			    if (anLocalInt >= 0) {
				if (anLocalInt > 3)
				    anLocalInt = 3;
			    } else
				anLocalInt = 0;
			    Class150.method2546
				(anLocalInt, 14328,
				 (((Entity)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .pathZ[0]) + MapRelated.baseZ,
				 (MapRelated.baseX
				  + (((Entity)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .pathX[0])));
			}
			tia_sub_35DoublyLinked.method1215(2);
			for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++)
			    Statics.anIntArray583[anLocalInt]++;
			if (Class242.aBoolean1771
			    && (Node_Sub47_Sub4.aLong6169
				< Applet_Sub1.getGameTime() + -60000L))
			    Node_Sub47_Sub7.method1130((byte) 9);
			for (DoublyLinkedNodeP2_Sub4_Sub2 class104_sub4_sub2
				 = ((DoublyLinkedNodeP2_Sub4_Sub2)
				    Class120.aClass366_977.method3986(0));
			     class104_sub4_sub2 != null;
			     class104_sub4_sub2
				 = ((DoublyLinkedNodeP2_Sub4_Sub2)
				    Class120.aClass366_977
					.method3992((byte) 79))) {
			    if (Applet_Sub1.getGameTime() / 1000L + -5L
				> (long) ((DoublyLinkedNodeP2_Sub4_Sub2)
					  class104_sub4_sub2).anInt6441) {
				if ((((DoublyLinkedNodeP2_Sub4_Sub2) class104_sub4_sub2)
				     .aShort6444)
				    > 0)
				    Class62_Sub12.method1403
					(5, "", "",
					 (((DoublyLinkedNodeP2_Sub4_Sub2)
					   class104_sub4_sub2).aString6442
					  + (MultilanguageString.HAS_LOGGED_IN.getLocalizedString
                             (client.language))),
					 0, "", 16773);
				if ((((DoublyLinkedNodeP2_Sub4_Sub2) class104_sub4_sub2)
				     .aShort6444)
				    == 0)
				    Class62_Sub12.method1403
					(5, "", "",
					 (((DoublyLinkedNodeP2_Sub4_Sub2)
					   class104_sub4_sub2).aString6442
					  + (MultilanguageString.HAS_LOGGED_OUT.getLocalizedString
                             (client.language))),
					 0, "", 16773);
				class104_sub4_sub2.unlink();
			    }
			}
			Node_Sub1.anInt3867++;
			if (Node_Sub1.anInt3867 > 500) {
			    Node_Sub1.anInt3867 = 0;
			    int anLocalInt = (int) (Math.random() * 8.0);
			    if ((anLocalInt & 0x1) == 1)
				Class366.anInt3089
				    += Node_Sub36_Sub1.anInt6098;
			    if ((anLocalInt & 0x4) == 4)
				Node_Sub31_Sub4.anInt5852
				    += Statics.anInt852;
			    if ((anLocalInt & 0x2) == 2)
				Node_Sub31_Sub36.anInt6014
				    += DxSkybox.anInt4475;
			}
			if (Class366.anInt3089 < -50)
			    Node_Sub36_Sub1.anInt6098 = 2;
			if (Class366.anInt3089 > 50)
			    Node_Sub36_Sub1.anInt6098 = -2;
			if (Node_Sub31_Sub36.anInt6014 < -55)
			    DxSkybox.anInt4475 = 2;
			if (Node_Sub31_Sub4.anInt5852 < -40)
			    Statics.anInt852 = 1;
			if (Node_Sub31_Sub36.anInt6014 > 55)
			    DxSkybox.anInt4475 = -2;
			DoublyLinkedNodeP2_Sub8.anInt4585++;
			if (Node_Sub31_Sub4.anInt5852 > 40)
			    Statics.anInt852 = -1;
			if (DoublyLinkedNodeP2_Sub8.anInt4585 > 500) {
			    DoublyLinkedNodeP2_Sub8.anInt4585 = 0;
			    int anLocalInt = (int) (Math.random() * 8.0);
			    if ((anLocalInt & 0x2) == 2)
				Node_Sub11.anInt3945 += Applet_Sub1.anInt8;
			    if ((anLocalInt & 0x1) == 1)
				Class2_Sub10.anInt3824 += Class130.anInt1049;
			}
			if (Class2_Sub10.anInt3824 < -60)
			    Class130.anInt1049 = 2;
			if (Class2_Sub10.anInt3824 > 60)
			    Class130.anInt1049 = -2;
			if (Node_Sub11.anInt3945 < -20)
			    Applet_Sub1.anInt8 = 1;
			Class113.anInt942++;
			if (Node_Sub11.anInt3945 > 10)
			    Applet_Sub1.anInt8 = -1;
			if (Class113.anInt942 > 50) {
			    Class151.anInt1148++;
			    Node_Sub29 class59_sub29
				= Class91.method1683((byte) 37,
						     (Node_Sub31_Sub16
						      .aClass372_5910),
						     Class105.aClass207_862);
			    Class251.method3243(class59_sub29, true);
			}
			if (TexGenEnum.aBoolean75) {
			    Statics.method3258();
			    TexGenEnum.aBoolean75 = false;
			}
			try {
			    Statics.method531((byte) 125);
			} catch (IOException ioexception) {
			    Node_Sub11.method685((byte) -54);
			}
		    }
		}
	    }
	}
    }
    
    public static void method132(int argument) {
	anIntArray41 = null;
	aClass368Array40 = null;
	client.gameServer = null;
    }
    
    IOException_Sub1(String argument_23_) {
	super(argument_23_);
    }

}
