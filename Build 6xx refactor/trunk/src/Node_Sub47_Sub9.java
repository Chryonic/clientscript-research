/* Class59_Sub47_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;
import java.net.URL;

final class Node_Sub47_Sub9 extends Node_Sub47
{
    private int anInt6199;
    private int anInt6200;
    private int anInt6201;
    private int anInt6202;
    static AbstractFont aAbstractFont_6203;
    
    final void method1110(int argument_0_, Packet argument_1_) {
	anInt6201 = argument_1_.g4();
	anInt6202 = argument_1_.g4();
	if (argument_0_ <= -56) {
	    anInt6200 = argument_1_.g1();
	    anInt6199 = argument_1_.g1();
	}
    }
    
    final void method1109(ClanSettings argument_2_, int argument_3_) {
	argument_2_.method2763(anInt6201, anInt6202, anInt6199, true,
			       anInt6200);
	if (argument_3_ != 5)
	    anInt6202 = -89;
    }
    
    static final void method1134(int argument) {
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub29_4328.method1477(68)
	    == 2) {
	    byte anLocalInt = (byte) (Statics.anInt264 - 4 & 0xff);
	    int anLocalInt_4_ = Statics.anInt264 % MapRelated.mapWidth;
	    for (int anLocalInt_5_ = 0; anLocalInt_5_ < 4; anLocalInt_5_++) {
		for (int anLocalInt_6_ = 0;
		     anLocalInt_6_ < MapRelated.mapDepth;
		     anLocalInt_6_++)
		    Statics.aByteArrayArrayArray1279[anLocalInt_5_]
			[anLocalInt_4_][anLocalInt_6_]
			= anLocalInt;
	    }
	    if (Class176.anInt1308 != 3) {
		for (int anLocalInt_7_ = 0; anLocalInt_7_ < 2;
		     anLocalInt_7_++) {
		    Class227.anIntArray1642[anLocalInt_7_] = -1000000;
		    Statics.anIntArray1179[anLocalInt_7_] = 1000000;
		    DiskBackedCache.anIntArray2706[anLocalInt_7_] = 0;
		    DxSkybox.anIntArray4477[anLocalInt_7_] = 1000000;
		    Class60.anIntArray435[anLocalInt_7_] = 0;
		}
		int anLocalInt_8_
		    = (((DoublyLinkedNodeP2_Sub2)
			Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		       .worldX);
		int anLocalInt_9_
		    = (((DoublyLinkedNodeP2_Sub2)
			Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		       .worldZ);
		do {
		    if (Statics.anInt1745 != 1
			&& DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 == -1) {
			int anLocalInt_10_
			    = (Node_Sub31_Sub36.method993
			       (Class176.anInt1308, Class287.anInt2299, -12040,
                           Node_Sub31_Sub30.anInt5987));
			if (-Class2_Sub2.anInt3763 + anLocalInt_10_ < 3200
			    && ((Class303.tileSettings
				 [Class176.anInt1308][Class287.anInt2299 >> 9]
				 [Node_Sub31_Sub30.anInt5987 >> 9])
				& 0x4) != 0)
			    Node_Sub47_Sub3.method1121
				(1, false, Node_Sub31_Sub30.anInt5987 >> 9,
                        118,
                        GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676,
                        Class287.anInt2299 >> 9);
		    } else {
			if (Statics.anInt1745 != 1) {
			    anLocalInt_8_ = DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573;
			    anLocalInt_9_ = Class85.anInt607;
			}
			if (((Class303.tileSettings
			      [Class176.anInt1308][anLocalInt_8_ >> 9]
			      [anLocalInt_9_ >> 9])
			     & 0x4)
			    != 0)
			    Node_Sub47_Sub3.method1121
                        (0, false, anLocalInt_9_ >> 9, 114,
                                GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676,
                                anLocalInt_8_ >> 9);
			if (Class293.anInt2404 >= 2560)
			    break;
			int anLocalInt_11_ = Class287.anInt2299 >> 9;
			int anLocalInt_12_
			    = Node_Sub31_Sub30.anInt5987 >> 9;
			int anLocalInt_13_ = anLocalInt_8_ >> 9;
			int anLocalInt_14_ = anLocalInt_9_ >> 9;
			int anLocalInt_15_;
			if (anLocalInt_13_ <= anLocalInt_11_)
			    anLocalInt_15_ = -anLocalInt_13_ + anLocalInt_11_;
			else
			    anLocalInt_15_ = anLocalInt_13_ - anLocalInt_11_;
			int anLocalInt_16_;
			if (anLocalInt_12_ < anLocalInt_14_)
			    anLocalInt_16_ = anLocalInt_14_ - anLocalInt_12_;
			else
			    anLocalInt_16_ = -anLocalInt_14_ + anLocalInt_12_;
			if (anLocalInt_15_ == 0 && anLocalInt_16_ == 0
			    || anLocalInt_15_ <= -MapRelated.mapWidth
			    || anLocalInt_15_ >= MapRelated.mapWidth
			    || -MapRelated.mapDepth >= anLocalInt_16_
			    || MapRelated.mapDepth <= anLocalInt_16_)
			    ErrorReporting.reportError(("RC: " + anLocalInt_11_ + "," + anLocalInt_12_ + " " + anLocalInt_13_ + "," + anLocalInt_14_ + " " + MapRelated.baseX + "," + MapRelated.baseZ), null);
			else if (anLocalInt_16_ >= anLocalInt_15_) {
			    int anLocalInt_17_
				= anLocalInt_15_ * 65536 / anLocalInt_16_;
			    int anLocalInt_18_ = 32768;
			    while (anLocalInt_14_ != anLocalInt_12_) {
				if (anLocalInt_12_ < anLocalInt_14_)
				    anLocalInt_12_++;
				else if (anLocalInt_12_ > anLocalInt_14_)
				    anLocalInt_12_--;
				if (((Class303.tileSettings
				      [Class176.anInt1308][anLocalInt_11_]
				      [anLocalInt_12_])
				     & 0x4)
				    != 0) {
				    Node_Sub47_Sub3.method1121
                            (1, false, anLocalInt_12_, 120,
                                    (GraphicsToolkit_Sub2
                                            .aClass148ArrayArrayArray4676),
                                    anLocalInt_11_);
				    break;
				}
				anLocalInt_18_ += anLocalInt_17_;
				if (anLocalInt_18_ >= 65536) {
				    anLocalInt_18_ -= 65536;
				    if (anLocalInt_13_ > anLocalInt_11_)
					anLocalInt_11_++;
				    else if (anLocalInt_13_ < anLocalInt_11_)
					anLocalInt_11_--;
				    if (((Class303.tileSettings
					  [Class176.anInt1308][anLocalInt_11_]
					  [anLocalInt_12_])
					 & 0x4)
					!= 0) {
					Node_Sub47_Sub3.method1121
                            (1, false, anLocalInt_12_, 121,
                                    (GraphicsToolkit_Sub2
                                            .aClass148ArrayArrayArray4676),
                                    anLocalInt_11_);
					break;
				    }
				}
			    }
			} else {
			    int anLocalInt_19_
				= anLocalInt_16_ * 65536 / anLocalInt_15_;
			    int anLocalInt_20_ = 32768;
			    while (anLocalInt_13_ != anLocalInt_11_) {
				if (anLocalInt_11_ < anLocalInt_13_)
				    anLocalInt_11_++;
				else if (anLocalInt_13_ < anLocalInt_11_)
				    anLocalInt_11_--;
				if (((Class303.tileSettings
				      [Class176.anInt1308][anLocalInt_11_]
				      [anLocalInt_12_])
				     & 0x4)
				    != 0) {
				    Node_Sub47_Sub3.method1121
                            (1, false, anLocalInt_12_, 122,
                                    (GraphicsToolkit_Sub2
                                            .aClass148ArrayArrayArray4676),
                                    anLocalInt_11_);
				    break;
				}
				anLocalInt_20_ += anLocalInt_19_;
				if (anLocalInt_20_ >= 65536) {
				    if (anLocalInt_14_ > anLocalInt_12_)
					anLocalInt_12_++;
				    else if (anLocalInt_14_ < anLocalInt_12_)
					anLocalInt_12_--;
				    anLocalInt_20_ -= 65536;
				    if (((Class303.tileSettings
					  [Class176.anInt1308][anLocalInt_11_]
					  [anLocalInt_12_])
					 & 0x4)
					!= 0) {
					Node_Sub47_Sub3.method1121
                            (1, false, anLocalInt_12_, 107,
                                    (GraphicsToolkit_Sub2
                                            .aClass148ArrayArrayArray4676),
                                    anLocalInt_11_);
					break;
				    }
				}
			    }
			}
		    }
		    break;
		} while (false);
	    }
	}
    }
    
    static final void method1135(int argument) {
	if (DoublyLinkedNode_Sub51_Sub12.anInt6286 != 0
	    && DoublyLinkedNode_Sub51_Sub12.anInt6286 != 10) {
	    try {
		int anLocalInt;
		if (Class163.anInt1190 == 0)
		    anLocalInt = 250;
		else
		    anLocalInt = 2000;
		if (Node_Sub7.aBoolean3917
		    && DoublyLinkedNode_Sub51_Sub12.anInt6286 >= 6)
		    anLocalInt = 6000;
		if (++Statics.anInt4107 > anLocalInt) {
		    if (Statics.aClass307_2632 != null) {
			Statics.aClass307_2632.method3601(argument + 19575);
			Statics.aClass307_2632 = null;
		    }
		    if (Class163.anInt1190 < 3) {
			if (Class353_Sub6.anInt5507 != 2)
			    client.lobbyServer.method3749(43594);
			else
			    Statics.aGameServer_6149
				.method3749(argument ^ ~0xe63e);
			Statics.anInt4107 = 0;
			Class163.anInt1190++;
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 1;
		    } else {
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			Node_Sub16.method698(-5, 2);
			return;
		    }
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 1) {
		    if (Class353_Sub6.anInt5507 == 2)
			Class93.aSignlinkRequest_715
			    = (Statics.aGameServer_6149.method3746
			       ((byte) 104, Applet_Sub1.baseSignlink));
		    else
			Class93.aSignlinkRequest_715
			    = (client.lobbyServer.method3746
			       ((byte) 104, Applet_Sub1.baseSignlink));
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 2;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 2) {
		    if (Class93.aSignlinkRequest_715.status == 2)
			throw new IOException();
		    if (Class93.aSignlinkRequest_715.status != 1)
			return;
		    Statics.aClass307_2632
			= Class350_Sub2.method3858(103,
						   (Socket) (Class93
							     .aSignlinkRequest_715
							     .result),
						   15000);
		    Class93.aSignlinkRequest_715 = null;
		    Class154.method2577(1);
		    Node_Sub29 class59_sub29 = Class253_Sub1.method3249(77);
		    if (!Node_Sub7.aBoolean3917)
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            (((Class212) Class245_Sub2_Sub2.aClass212_6523)
                                    .anInt1505));
		    else {
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            (((Class212) Class245_Sub2_Sub2.aClass212_6536)
                                    .anInt1505));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p2(0);
			int anLocalInt_21_ = (((Packet)
					       (((Node_Sub29) class59_sub29)
						.aClass59_Sub28_Sub1_4129))
					      .pos);
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129
			    .p4(649);
			if (Class353_Sub6.anInt5507 == 2)
			    ((Node_Sub29) class59_sub29)
				.aClass59_Sub28_Sub1_4129.p1
                        (Statics.anInt1652 == 13 ? 1 : 0);
			Packet class59_sub28
			    = Class107.method1960((byte) -68);
			class59_sub28.p1(
                    Class141.anInt1099);
			class59_sub28.p2((int) (Math.random()
                    * 9.9999999E7));
			class59_sub28.p1(
                    client.language);
			class59_sub28.p4(client.affiliateId
            );
			for (int anLocalInt_22_ = 0; anLocalInt_22_ < 6;
			     anLocalInt_22_++)
			    class59_sub28.p4((int) (Math.random()
                        * 9.9999999E7)
                );
			class59_sub28.p8(
                    Class341.aLong2879);
			class59_sub28.p1((((GameEnum)
                    client.selectedGame)
                    .id));
			class59_sub28.p1(
                    (int) (Math.random()
                            * 9.9999999E7));
			class59_sub28.decryptRSA((Node_Sub31_Sub32
                    .aBigInteger6000),
                    Class62_Sub1.aBigInteger4362
            );
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.pbytes
                    (((Packet) class59_sub28).data,
                            0, ((Packet) class59_sub28).pos
                    );
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.psize2
                    ((((Packet) (((Node_Sub29) class59_sub29)
                            .aClass59_Sub28_Sub1_4129))
                            .pos) - anLocalInt_21_
                    );
		    }
		    Class251.method3243(class59_sub29, true);
		    Statics.method531((byte) -40);
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 3;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 3) {
		    if (!Statics.aClass307_2632.method3603(1, 55))
			return;
		    Statics.aClass307_2632.method3606
			(-87, 1,
			 (((Packet) Network.stream)
			  .data),
			 0);
		    int anLocalInt_23_
			= ((((Packet) Network.stream)
			    .data[0])
			   & 0xff);
		    if (anLocalInt_23_ != 0) {
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			Node_Sub16.method698(anLocalInt_23_, 2);
			Statics.aClass307_2632.method3601(2);
			Statics.aClass307_2632 = null;
			Class365.method3971(116);
			return;
		    }
		    if (!Node_Sub7.aBoolean3917)
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 8;
		    else
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 4;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 4) {
		    if (!Statics.aClass307_2632.method3603(2,
							    argument + 19628))
			return;
		    Statics.aClass307_2632.method3606
			(-116, 2,
			 (((Packet) Network.stream)
			  .data),
			 0);
		    ((Packet) Network.stream)
			.pos
			= 0;
		    ((Packet) Network.stream)
			.pos
			= Network.stream.g2();
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 5;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 5) {
		    if (!Statics.aClass307_2632.method3603
			 ((((Packet) Network.stream)
			   .pos),
			  55))
			return;
		    Statics.aClass307_2632.method3606
			(-85,
			 (((Packet) Network.stream)
			  .pos),
			 (((Packet) Network.stream)
			  .data),
			 0);
		    Network.stream.method808
			(Node_Sub31_Sub11.anIntArray5889, (byte) 87);
		    ((Packet) Network.stream)
			.pos
			= 0;
		    String string
			= Network.stream.gjstr2();
		    ((Packet) Network.stream)
			.pos
			= 0;
		    String string_24_ = "opensn";
		    if (!Applet_Sub1.useJavaScript
			|| Class279.method3416((byte) 7, string,
					       Applet_Sub1.baseSignlink,
					       string_24_, 1).status == 2)
			Statics.method3262(argument ^ ~0x4c74, true, Applet_Sub1.baseSignlink, string_24_, string, ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295.method1464(7) == 1);
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 6;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 6) {
		    if (!Statics.aClass307_2632.method3603(1, 55))
			return;
		    Statics.aClass307_2632.method3606
			(argument + 19677, 1,
			 (((Packet) Network.stream)
			  .data),
			 0);
		    if (((((Packet) Network.stream)
			  .data[0])
			 & 0xff)
			== 1)
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 7;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 7) {
		    if (!Statics.aClass307_2632.method3603(16, 55))
			return;
		    Statics.aClass307_2632.method3606
			(101, 16,
			 (((Packet) Network.stream)
			  .data),
			 0);
		    ((Packet) Network.stream)
			.pos
			= 16;
		    Network.stream.method808
			(Node_Sub31_Sub11.anIntArray5889, (byte) 93);
		    ((Packet) Network.stream)
			.pos
			= 0;
		    Statics.aString2295 = Node_Sub31_Sub1.aString5837
			= JagexStringEncoding.decode(Network.stream.g8());
		    Class62_Sub19.aLong4427
			= Network.stream.g8();
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 8;
		}
		if (argument != -19573)
		    aAbstractFont_6203 = null;
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 8) {
		    ((Packet) Network.stream)
			.pos
			= 0;
		    Class154.method2577(1);
		    Node_Sub29 class59_sub29
			= Class253_Sub1.method3249(argument + 19649);
		    Node_Sub28_Sub1 class59_sub28_sub1
			= (((Node_Sub29) class59_sub29)
			   .aClass59_Sub28_Sub1_4129);
		    if (Class353_Sub6.anInt5507 != 2) {
			Class212 class212;
			if (!Node_Sub7.aBoolean3917)
			    class212 = Class245_Sub2_Sub2.aClass212_6529;
			else
			    class212 = Class245_Sub2_Sub2.aClass212_6537;
			class59_sub28_sub1
			    .p1(((Class212) class212).anInt1505);
			class59_sub28_sub1.p2(0);
			int anLocalInt_25_
			    = ((Packet) class59_sub28_sub1).pos;
			int anLocalInt_26_
			    = ((Packet) class59_sub28_sub1).pos;
			if (!Node_Sub7.aBoolean3917) {
			    class59_sub28_sub1.p4(649);
			    Packet class59_sub28
				= Statics.method2483((byte) 69);
			    class59_sub28_sub1.pbytes
                        ((((Packet) class59_sub28)
                                .data),
                                0, ((Packet) class59_sub28).pos
                        );
			    anLocalInt_26_
				= (((Packet) class59_sub28_sub1)
				   .pos);
			    class59_sub28_sub1.pjstr(
                        Statics.aString2295);
			}
			class59_sub28_sub1.p1(
                    (((GameEnum)
                            client.selectedGame)
                            .id));
			class59_sub28_sub1.p1(
                    client.language);
			Class389.method4132(24, class59_sub28_sub1);
			class59_sub28_sub1.pjstr(client.settingsString);
			class59_sub28_sub1.p4(client.affiliateId
            );
			Class146.method2522(class59_sub28_sub1, -81);
			class59_sub28_sub1.decryptXTEA
			    (
                        anLocalInt_26_, ((Packet) class59_sub28_sub1).pos,
                        Node_Sub31_Sub11.anIntArray5889);
			class59_sub28_sub1.psize2((-anLocalInt_25_
                    + (((Packet)
                    class59_sub28_sub1)
                    .pos))
            );
		    } else {
			Class212 class212;
			if (Node_Sub7.aBoolean3917)
			    class212 = Class245_Sub2_Sub2.aClass212_6537;
			else
			    class212 = Class245_Sub2_Sub2.aClass212_6527;
			class59_sub28_sub1.p1(
                    (((Class212) class212)
                            .anInt1505));
			class59_sub28_sub1.p2(0);
			int anLocalInt_27_
			    = ((Packet) class59_sub28_sub1).pos;
			int anLocalInt_28_
			    = ((Packet) class59_sub28_sub1).pos;
			if (!Node_Sub7.aBoolean3917) {
			    class59_sub28_sub1.p4(649);
			    class59_sub28_sub1.p1(
                        (Statics.anInt1652
                                == 13) ? 1 : 0);
			    anLocalInt_28_
				= (((Packet) class59_sub28_sub1)
				   .pos);
			    Packet class59_sub28
				= Statics.method2483((byte) 69);
			    class59_sub28_sub1.pbytes
                        ((((Packet) class59_sub28)
                                .data),
                                0, ((Packet) class59_sub28).pos
                        );
			    anLocalInt_28_
				= (((Packet) class59_sub28_sub1)
				   .pos);
			    class59_sub28_sub1.pjstr(
                        Statics.aString2295);
			}
			class59_sub28_sub1.p1(
                    Node_Sub13.anInt3978);
			class59_sub28_sub1.p1(
                    DoublyLinkedNode_Sub51_Sub13
                            .method1262(-99));
			class59_sub28_sub1.p2(
                    Applet_Sub1.canvasWidth);
			class59_sub28_sub1.p2(Applet_Sub1.canvasHeight);
			class59_sub28_sub1.p1(
                    ((Node_Sub50)
                            (AthmosphericConditions
                                    .aClass59_Sub50_116))
                            .aClass62_Sub6_4296
                            .method1377(115));
			Class389.method4132(24, class59_sub28_sub1);
			class59_sub28_sub1.pjstr(
                    client.settingsString);
			class59_sub28_sub1.p4(client.affiliateId
            );
			Packet class59_sub28
			    = AthmosphericConditions.aClass59_Sub50_116
				  .method1158((byte) -10);
			class59_sub28_sub1.p1((((Packet)
                    class59_sub28)
                    .pos));
			class59_sub28_sub1.pbytes
                    (((Packet) class59_sub28).data,
                            0, ((Packet) class59_sub28).pos
                    );
			Class152.aBoolean1149 = true;
			Packet class59_sub28_29_
			    = new Packet(Statics
						    .aClass59_Sub44_1064
						    .method1084(115));
			Statics.aClass59_Sub44_1064
			    .method1083(class59_sub28_29_, -112);
			class59_sub28_sub1.pbytes((((Packet)
                    class59_sub28_29_)
                    .data),
                    0, (((Packet)
                            class59_sub28_29_)
                            .data).length
            );
			class59_sub28_sub1.p2(
                    Class345.anInt2906);
			class59_sub28_sub1.p8(
                    client.userFlow);
			class59_sub28_sub1.p1(
                    (client.additionalInfo
                            != null) ? 1 : 0);
			if (client.additionalInfo != null)
			    class59_sub28_sub1.pjstr(
                        (client
                                .additionalInfo));
			class59_sub28_sub1.p1
                    (
                            !Class368_Sub3.method4041("jagtheora",
                                    (byte) -118) ? 0 : 1);
			class59_sub28_sub1.p1(
                    (Applet_Sub1
                            .useJavaScript) ? 1 : 0);
			Class146.method2522(class59_sub28_sub1, -91);
			class59_sub28_sub1.decryptXTEA
			    (
                        anLocalInt_28_, ((Packet) class59_sub28_sub1).pos,
                        Node_Sub31_Sub11.anIntArray5889);
			class59_sub28_sub1.psize2((-anLocalInt_27_
                    + (((Packet)
                    class59_sub28_sub1)
                    .pos))
            );
		    }
		    Class251.method3243(class59_sub29, true);
		    Statics.method531((byte) -90);
		    Node_Sub31_Sub16.aClass372_5910
			= new Class372(Node_Sub31_Sub11.anIntArray5889);
		    for (int anLocalInt_30_ = 0; anLocalInt_30_ < 4;
			 anLocalInt_30_++)
			Node_Sub31_Sub11.anIntArray5889[anLocalInt_30_]
			    += 50;
		    Network.stream.method839
			((byte) 119, Node_Sub31_Sub11.anIntArray5889);
		    Node_Sub31_Sub11.anIntArray5889 = null;
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 9;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 9) {
		    if (!Statics.aClass307_2632.method3603(1, 55))
			return;
		    Statics.aClass307_2632.method3606
			(91, 1,
			 (((Packet) Network.stream)
			  .data),
			 0);
		    int anLocalInt_31_
			= ((((Packet) Network.stream)
			    .data[0])
			   & 0xff);
		    if (anLocalInt_31_ != 21) {
			if (anLocalInt_31_ != 29) {
			    if (anLocalInt_31_ == 1) {
				DoublyLinkedNode_Sub51_Sub12.anInt6286 = 10;
				Node_Sub16.method698(anLocalInt_31_,
                        argument ^ ~0x4c76);
				return;
			    }
			    if (anLocalInt_31_ == 2)
				DoublyLinkedNode_Sub51_Sub12.anInt6286 = 13;
			    else if (anLocalInt_31_ == 15) {
				Network.anInt4454 = -2;
				DoublyLinkedNode_Sub51_Sub12.anInt6286 = 19;
			    } else {
				if (anLocalInt_31_ != 23
				    || Class163.anInt1190 >= 3) {
				    if (Node_Sub9_Sub1.aBoolean5749
					&& !Node_Sub7.aBoolean3917
					&& Class141.anInt1099 != -1
					&& anLocalInt_31_ == 35) {
					Node_Sub7.aBoolean3917 = true;
					DoublyLinkedNode_Sub51_Sub12.anInt6286 = 1;
					Statics.anInt4107 = 0;
					Statics.aClass307_2632.method3601(2);
					Statics.aClass307_2632 = null;
				    } else {
					DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
					Node_Sub16.method698(anLocalInt_31_,
                            (argument
                                    + 19575));
					Statics.aClass307_2632.method3601(2);
					Statics.aClass307_2632 = null;
					Class365.method3971(96);
				    }
				} else {
				    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 1;
				    Class163.anInt1190++;
				    Statics.anInt4107 = 0;
				    Statics.aClass307_2632.method3601(2);
				    Statics.aClass307_2632 = null;
				    return;
				}
				return;
			    }
			} else
			    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 18;
		    } else
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 12;
		}
		if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 11) {
		    Class154.method2577(1);
		    Node_Sub29 class59_sub29
			= Class253_Sub1.method3249(-57);
		    Node_Sub28_Sub1 class59_sub28_sub1
			= (((Node_Sub29) class59_sub29)
			   .aClass59_Sub28_Sub1_4129);
		    class59_sub28_sub1
			.method845(Node_Sub31_Sub16.aClass372_5910, -7860);
		    class59_sub28_sub1.method840(103, (((Class212)
							(Class245_Sub2_Sub2
							 .aClass212_6533))
						       .anInt1505));
		    Class251.method3243(class59_sub29, true);
		    Statics.method531((byte) 88);
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 9;
		} else if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 12) {
		    if (Statics.aClass307_2632
			    .method3603(1, argument ^ ~0x4c43)) {
			Statics.aClass307_2632.method3606
			    (argument ^ ~0x4c1c, 1,
			     ((Packet)
			      Network.stream).data,
			     0);
			int anLocalInt_32_
			    = ((((Packet)
				 Network.stream)
				.data[0])
			       & 0xff);
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			Class245_Sub1_Sub1.anInt6513 = anLocalInt_32_ * 50;
			Node_Sub16.method698(21, 2);
			Statics.aClass307_2632.method3601(2);
			Statics.aClass307_2632 = null;
			Class365.method3971(115);
		    }
		} else if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 18) {
		    if (Statics.aClass307_2632.method3603(1, 55)) {
			Statics.aClass307_2632.method3606
			    (-83, 1,
			     ((Packet)
			      Network.stream).data,
			     0);
			Node_Sub16.anInt3995
			    = (((Packet)
				Network.stream)
			       .data[0]) & 0xff;
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			Node_Sub16.method698(29, 2);
			Statics.aClass307_2632.method3601(argument ^ ~0x4c76);
			Statics.aClass307_2632 = null;
			Class365.method3971(68);
		    }
		} else if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 13) {
		    if (Statics.aClass307_2632.method3603(1, 55)) {
			Statics.aClass307_2632.method3606
			    (-67, 1,
			     ((Packet)
			      Network.stream).data,
			     0);
			Class80.anInt579 = (((Packet)
					     Network.stream)
					    .data[0]) & 0xff;
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 14;
		    }
		} else {
		    if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 14) {
			Node_Sub28_Sub1 class59_sub28_sub1
			    = Network.stream;
			if (Class353_Sub6.anInt5507 == 2) {
			    if (!Statics.aClass307_2632
				     .method3603(Class80.anInt579, 55))
				return;
			    Statics.aClass307_2632.method3606
				(argument + 19501, Class80.anInt579,
				 (((Packet) class59_sub28_sub1)
				  .data),
				 0);
			    ((Packet) class59_sub28_sub1).pos = 0;
			    Class15.anInt120
				= class59_sub28_sub1.g1();
			    Class128.anInt1044
				= class59_sub28_sub1.g1();
			    Class207.aBoolean1485
				= (class59_sub28_sub1.g1()
				   == 1);
			    Class190.aBoolean1395
				= (class59_sub28_sub1.g1()
				   == 1);
			    Statics.aBoolean1254
				= (class59_sub28_sub1.g1()
				   == 1);
			    Class128.aBoolean1042
				= (class59_sub28_sub1.g1()
				   == 1);
			    Class64.anInt451
				= class59_sub28_sub1.g2();
			    Node_Sub31_Sub10.aBoolean5880
				= (class59_sub28_sub1.g1()
				   == 1);
			    Class289.anInt2303
				= class59_sub28_sub1.g3s();
			    Statics.aBoolean5559
				= (class59_sub28_sub1.g1()
				   == 1);
			    Node_Sub31_Sub30.aClass257_5983
				.method3303(79, Statics.aBoolean5559);
			    Class253_Sub1_Sub1.aClass365_6632.method3974
				(Statics.aBoolean5559, (byte) -23);
			    DiskBackedCache.aClass26_2709.method351((byte) 102,
							     (Statics
							      .aBoolean5559));
			} else {
			    if (!Statics.aClass307_2632
				     .method3603(Class80.anInt579, 55))
				return;
			    Statics.aClass307_2632.method3606
				(-68, Class80.anInt579,
				 (((Packet) class59_sub28_sub1)
				  .data),
				 0);
			    ((Packet) class59_sub28_sub1).pos = 0;
			    Class15.anInt120
				= class59_sub28_sub1
				      .g1();
			    Class128.anInt1044
				= class59_sub28_sub1.g1();
			    Class207.aBoolean1485
				= class59_sub28_sub1
				      .g1() == 1;
			    Class190.aBoolean1395
				= (class59_sub28_sub1.g1()
				   == 1);
			    Statics.aBoolean1254
				= (class59_sub28_sub1.g1()
				   == 1);
			    Class143.aLong1102
				= class59_sub28_sub1.g8();
			    Class147.aLong1120
				= (Class143.aLong1102
				   - (Applet_Sub1.getGameTime()
				      + class59_sub28_sub1
					    .g5((byte) -125)));
			    int anLocalInt_33_
				= class59_sub28_sub1
				      .g1();
			    Node_Sub31_Sub10.aBoolean5880
				= (anLocalInt_33_ & 0x1) != 0;
			    Class383.aBoolean3243
				= (anLocalInt_33_ & 0x2) != 0;
			    Class205.anInt1473
				= class59_sub28_sub1.g4();
			    Class387.anInt3269
				= class59_sub28_sub1.g2();
			    Class353_Sub5.anInt5500
				= class59_sub28_sub1
				      .g2();
			    Node_Sub2.anInt3885
				= class59_sub28_sub1
				      .g2();
			    Class122.anInt986
				= class59_sub28_sub1.g4();
			    Class62_Sub2.aSignlinkRequest_4365
				= (Applet_Sub1.baseSignlink.requestHostnameForIP(Class122.anInt986));
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anInt6861
				= class59_sub28_sub1.g1();
			    Class269.anInt2155
				= class59_sub28_sub1.g2();
			    IOException_Sub1.anInt39
				= class59_sub28_sub1.g2();
			    Node_Sub35.aBoolean4159
				= (class59_sub28_sub1.g1()
				   == 1);
			    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				.aString6836
				= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				      .aString6847
				= Exception_Sub1.aString47
				= class59_sub28_sub1.gjstr2();
			    Class221.anInt1554
				= class59_sub28_sub1.g1();
			    Statics.anInt6447
				= class59_sub28_sub1.g4();
			    tia_sub_35_Sub2DoublyLinked.aBoolean6662
				= class59_sub28_sub1
				      .g1() == 1;
			    DoublyLinkedNode_Sub51_Sub15.aGameServer_6318
				= new GameServer();
			    ((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318)
				.id
				= class59_sub28_sub1.g2();
			    if (((GameServer)
				 DoublyLinkedNode_Sub51_Sub15.aGameServer_6318).id
				== 65535)
				((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318)
				    .id
				    = -1;
			    ((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318)
				.address
				= class59_sub28_sub1.gjstr2();
			    if (client.modeWhere
				!= TestingStageEnum.LIVE) {
				((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318)
				    .secundaryPort
				    = 50000 + (((GameServer) (DoublyLinkedNode_Sub51_Sub15
							    .aGameServer_6318))
					       .id);
				((GameServer) DoublyLinkedNode_Sub51_Sub15.aGameServer_6318)
				    .primaryPort
				    = (((GameServer) (DoublyLinkedNode_Sub51_Sub15
						    .aGameServer_6318)).id
				       + 40000);
			    }
			    if ((TestingStageEnum.LOCAL
				 != client.modeWhere)
				&& ((TestingStageEnum.WTQA
				     != client.modeWhere)
				    || Class15.anInt120 < 2)
				&& ((Statics.aGameServer_6149
					 .method3748
				     (client.gameServer,
				      argument ^ 0x4c07))
				    || (Statics.aGameServer_6149
					    .method3748
					(client.demoServer, 64))))
				Class109_Sub1.method1983(argument ^ ~0x4c44);
			}
			if (Class207.aBoolean1485 && !Statics.aBoolean1254
			    || Node_Sub31_Sub10.aBoolean5880) {
			    try {
				Class328.method3698(Signlink.mainapp, "zap",
						    (byte) 123);
			    } catch (Throwable throwable) {
				if (client.useAdvertising) {
				    try {
					Signlink.mainapp.getAppletContext
					    ().showDocument
					    (new URL(Signlink.mainapp
							 .getCodeBase(),
						     "blank.ws"),
					     "tbi");
				    } catch (Exception exception) {
					/* empty */
				    }
				}
			    }
			} else {
			    try {
				Class328.method3698(Signlink.mainapp,
						    "unzap", (byte) 116);
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			if (TestingStageEnum.LIVE
			    == client.modeWhere) {
			    try {
				Class328.method3698(Signlink.mainapp,
						    "loggedin", (byte) 122);
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
			if (Class353_Sub6.anInt5507 != 2) {
			    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			    Node_Sub16.method698(2, argument ^ ~0x4c76);
			    Class62_Sub24.method1454((byte) 118);
			    Class316.method3638(7, 2);
			    Class93.aClass166_714 = null;
			    return;
			}
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 16;
		    }
		    if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 16) {
			if (!Statics.aClass307_2632.method3603(3, 55))
			    return;
			Statics.aClass307_2632.method3606
			    (-93, 3,
			     ((Packet)
			      Network.stream).data,
			     0);
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 17;
		    }
		    if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 17) {
			Node_Sub28_Sub1 class59_sub28_sub1
			    = Network.stream;
			((Packet) class59_sub28_sub1).pos = 0;
			if (class59_sub28_sub1.method842(92)) {
			    if (!Statics.aClass307_2632
				     .method3603(1, argument + 19628))
				return;
			    Statics.aClass307_2632.method3606
				(87, 1, (((Packet) class59_sub28_sub1)
					 .data), 3);
			}
			Class93.aClass166_714
			    = (Statics.method1146(argument + 19460)
			       [class59_sub28_sub1.method844(99)]);
			Network.anInt4454
			    = class59_sub28_sub1.g2();
			DoublyLinkedNode_Sub51_Sub12.anInt6286 = 15;
		    }
		    if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 15) {
			if (Statics.aClass307_2632
				.method3603(Network.anInt4454, 55)) {
			    Statics.aClass307_2632.method3606
				(-122, Network.anInt4454,
				 (((Packet)
				   Network.stream)
				  .data),
				 0);
			    ((Packet) Network.stream)
				.pos
				= 0;
			    int anLocalInt_34_ = Network.anInt4454;
			    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			    Node_Sub16.method698(2, 2);
			    Class385.method4120(0);
			    Node_Sub31_Sub34.method983
                        (Network.stream, false);
			    MapRelated.regionX = -1;
			    if (Class93.aClass166_714
				== Class298.aClass166_2474)
				MapRelated.readMapGenerationPacket();
			    else
				MapRelated.readRegionPacket();
			    if (anLocalInt_34_
				!= (((Packet)
				     Network.stream)
				    .pos))
				throw new RuntimeException
					  ("lswp pos:"
					   + (((Packet)
					       (Network
						.stream))
					      .pos)
					   + " psize:" + anLocalInt_34_);
			    Class93.aClass166_714 = null;
			}
		    } else if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 19) {
			if (Network.anInt4454 == -2) {
			    if (!Statics.aClass307_2632.method3603(2, 55))
				return;
			    Statics.aClass307_2632.method3606
				(argument + 19522, 2,
				 (((Packet)
				   Network.stream)
				  .data),
				 0);
			    ((Packet) Network.stream)
				.pos
				= 0;
			    Network.anInt4454
				= Network.stream
				      .g2();
			}
			if (Statics.aClass307_2632
				.method3603(Network.anInt4454, 55)) {
			    Statics.aClass307_2632.method3606
				(96, Network.anInt4454,
				 (((Packet)
				   Network.stream)
				  .data),
				 0);
			    ((Packet) Network.stream)
				.pos
				= 0;
			    int anLocalInt_35_ = Network.anInt4454;
			    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
			    Node_Sub16.method698(15, 2);
			    Statics.method1778((byte) 16);
			    Node_Sub31_Sub34.method983
                        (Network.stream, false);
			    if (((Packet)
				 Network.stream).pos
				!= anLocalInt_35_)
				throw new RuntimeException
					  ("lswpr pos:"
					   + (((Packet)
					       (Network
						.stream))
					      .pos)
					   + " psize:" + anLocalInt_35_);
			    Class93.aClass166_714 = null;
			}
		    }
		}
	    } catch (IOException ioexception) {
		if (Statics.aClass307_2632 != null) {
		    Statics.aClass307_2632.method3601(2);
		    Statics.aClass307_2632 = null;
		}
		if (Class163.anInt1190 >= 3) {
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 0;
		    Node_Sub16.method698(-4, 2);
		    Class365.method3971(88);
		} else {
		    if (Class353_Sub6.anInt5507 == 2)
			Statics.aGameServer_6149.method3749(43594);
		    else
			client.lobbyServer.method3749(43594);
		    Class163.anInt1190++;
		    Statics.anInt4107 = 0;
		    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 1;
		}
	    }
	}
    }
    
    public static void method1136(int argument) {
	aAbstractFont_6203 = null;
    }
}
