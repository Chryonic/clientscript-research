/* Class59_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

abstract class Node_Sub32 extends Node
{
    static Class207 aClass207_4140;
    int anInt4141;
    OggStreamState anOggStreamState4142;
    static ClanSettings aClanSettings_4143;
    static int anInt4144 = 0;
    
    static final DoublyLinkedNode_Sub51_Sub13 method1009
	(int argument, Js5Store argument_0_, int argument_1_, int argument_2_) {
	Packet class59_sub28
	    = new Packet(argument_0_.getData(argument_2_, argument_1_));
	DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13
	    = new DoublyLinkedNode_Sub51_Sub13(argument_1_,
				      class59_sub28.gstr(),
				      class59_sub28.gstr(),
				      class59_sub28.g4(),
				      class59_sub28.g4(),
				      (class59_sub28.g1()
				       == 1),
				      class59_sub28.g1(),
				      class59_sub28.g1());
	int anLocalInt = class59_sub28.g1();
	for (int anLocalInt_3_ = argument; anLocalInt > anLocalInt_3_;
	     anLocalInt_3_++)
	    ((DoublyLinkedNode_Sub51_Sub13) class59_sub51_sub13).aCyclicLinkedList_6295
		.add(new Node_Sub24(class59_sub28.g1(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2(), class59_sub28.g2()));
	class59_sub51_sub13.method1263(argument + 31208);
	return class59_sub51_sub13;
    }
    
    abstract void method1010(OggPacket argument_4_, byte argument_5_);
    
    static final void method1011(boolean argument, byte[][][] argument_6_,
				 int argument_7_, byte argument_8_,
				 int argument_9_, int argument_10_,
				 boolean argument_11_) {
	int anLocalInt = argument ? 1 : 0;
	DoublyLinkedNode_Sub51_Sub3.anInt6229 = 0;
	FileOnDisk.anInt1453 = 0;
	Node_Sub31_Sub9.anInt5876++;
	if ((argument_10_ & 0x2) == 0) {
	    for (DoublyLinkedNodeP2_Sub2 class104_sub2
		     = Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt];
		 class104_sub2 != null;
		 class104_sub2
		     = ((DoublyLinkedNodeP2_Sub2) class104_sub2).aClass104_Sub2_4515) {
		if (!Class298.method3517(class104_sub2, argument, argument_6_,
					 argument_7_, argument_8_)) {
		    Node_Sub49.method1152(class104_sub2);
		    if (((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516 != -1)
			Class221.aClass104_Sub2Array1552
			    [DoublyLinkedNode_Sub51_Sub3.anInt6229++]
			    = class104_sub2;
		}
	    }
	}
	if ((argument_10_ & 0x1) == 0) {
	    for (DoublyLinkedNodeP2_Sub2 class104_sub2
		     = InputStream_Sub2.aClass104_Sub2Array36[anLocalInt];
		 class104_sub2 != null;
		 class104_sub2
		     = ((DoublyLinkedNodeP2_Sub2) class104_sub2).aClass104_Sub2_4515) {
		if (!Class298.method3517(class104_sub2, argument, argument_6_,
					 argument_7_, argument_8_)) {
		    Node_Sub49.method1152(class104_sub2);
		    if (((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516 != -1)
			DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584
			    [FileOnDisk.anInt1453++]
			    = class104_sub2;
		}
	    }
	    for (DoublyLinkedNodeP2_Sub2 class104_sub2
		     = Statics.aClass104_Sub2Array851[anLocalInt];
		 class104_sub2 != null;
		 class104_sub2
		     = ((DoublyLinkedNodeP2_Sub2) class104_sub2).aClass104_Sub2_4515) {
		if (!Class298.method3517(class104_sub2, argument, argument_6_,
					 argument_7_, argument_8_)) {
		    if (class104_sub2.method1772(0)) {
			Node_Sub49.method1152(class104_sub2);
			if (((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516 != -1)
			    DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584
				[FileOnDisk.anInt1453++]
				= class104_sub2;
		    } else {
			Node_Sub49.method1152(class104_sub2);
			if (((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516 != -1)
			    Class221.aClass104_Sub2Array1552
				[DoublyLinkedNode_Sub51_Sub3.anInt6229++]
				= class104_sub2;
		    }
		}
	    }
	    if (!argument) {
		for (int anLocalInt_12_ = 0; anLocalInt_12_ < Class51.anInt383;
		     anLocalInt_12_++) {
		    if (!Class298.method3517((DoublyLinkedNodeP2_Sub3
					      .aClass104_Sub2_Sub2Array4522
					      [anLocalInt_12_]),
					     argument, argument_6_,
					     argument_7_, argument_8_)) {
			Node_Sub49.method1152(DoublyLinkedNodeP2_Sub3
                    .aClass104_Sub2_Sub2Array4522
                    [anLocalInt_12_]);
			if (((DoublyLinkedNodeP2_Sub2) (DoublyLinkedNodeP2_Sub3
					      .aClass104_Sub2_Sub2Array4522
					      [anLocalInt_12_])).anInt4516
			    != -1) {
			    if (DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522
				    [anLocalInt_12_].method1772(0))
				DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584
				    [FileOnDisk.anInt1453++]
				    = (DoublyLinkedNodeP2_Sub3
				       .aClass104_Sub2_Sub2Array4522
				       [anLocalInt_12_]);
			    else
				Class221.aClass104_Sub2Array1552
				    [DoublyLinkedNode_Sub51_Sub3.anInt6229++]
				    = (DoublyLinkedNodeP2_Sub3
				       .aClass104_Sub2_Sub2Array4522
				       [anLocalInt_12_]);
			}
		    }
		}
	    }
	}
	if (DoublyLinkedNode_Sub51_Sub3.anInt6229 > 0) {
	    Class245_Sub2.method3187(Class221.aClass104_Sub2Array1552, 0,
				     DoublyLinkedNode_Sub51_Sub3.anInt6229 - 1);
	    for (int anLocalInt_13_ = 0;
		 anLocalInt_13_ < DoublyLinkedNode_Sub51_Sub3.anInt6229;
		 anLocalInt_13_++)
		Node_Sub31_Sub18.method933((Class221.aClass104_Sub2Array1552
                [anLocalInt_13_]),
                true, argument_11_);
	}
	if (Class128.aBoolean1039)
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.setLights(0, null);
	if ((argument_10_ & 0x2) == 0) {
	    for (int anLocalInt_14_ = Class349.anInt2922;
		 anLocalInt_14_ < LightingManager.yMapSize;
		 anLocalInt_14_++) {
		if (anLocalInt_14_ >= argument_7_ && argument_6_ != null) {
		    int anLocalInt_15_
			= Class242.aBooleanArrayArray1757.length;
		    if ((Class243.anInt3602
			 + Class242.aBooleanArrayArray1757.length)
			> LightingManager.xMapSize)
			anLocalInt_15_
			    -= (Class243.anInt3602
				+ Class242.aBooleanArrayArray1757.length
				- LightingManager.xMapSize);
		    int anLocalInt_16_
			= Class242.aBooleanArrayArray1757[0].length;
		    if ((Statics.anInt6448
			 + Class242.aBooleanArrayArray1757[0].length)
			> LightingManager.zMapSize)
			anLocalInt_16_
			    -= (Statics.anInt6448
				+ Class242.aBooleanArrayArray1757[0].length
				- LightingManager.zMapSize);
		    boolean[][] anLocalBooleans
			= DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319;
		    if (Node_Sub31_Sub16.aBoolean5911) {
			if (Node_Sub31_Sub10.aBoolean5882)
			    anLocalBooleans
				= (Class62_Sub22.aBooleanArrayArrayArray4435
				   [anLocalInt_14_]);
			for (int anLocalInt_17_ = Class140.anInt1094;
			     anLocalInt_17_ < anLocalInt_15_;
			     anLocalInt_17_++) {
			    int anLocalInt_18_
				= (anLocalInt_17_ + Class243.anInt3602
				   - Class140.anInt1094);
			    for (int anLocalInt_19_ = Class268.anInt2140;
				 anLocalInt_19_ < anLocalInt_16_;
				 anLocalInt_19_++) {
				anLocalBooleans[anLocalInt_17_][anLocalInt_19_]
				    = false;
				if (Class242.aBooleanArrayArray1757
				    [anLocalInt_17_][anLocalInt_19_]) {
				    int anLocalInt_20_
					= (anLocalInt_19_
					   + Statics.anInt6448
					   - Class268.anInt2140);
				    for (int anLocalInt_21_ = anLocalInt_14_;
					 anLocalInt_21_ >= 0;
					 anLocalInt_21_--) {
					if ((GraphicsToolkit_Sub2
					     .aClass148ArrayArrayArray4676
					     [anLocalInt_21_][anLocalInt_18_]
					     [anLocalInt_20_]) != null
					    && (((Class148)
						 (GraphicsToolkit_Sub2
						  .aClass148ArrayArrayArray4676
						  [anLocalInt_21_]
						  [anLocalInt_18_]
						  [anLocalInt_20_])).aByte1129
						== anLocalInt_14_)) {
					    if ((anLocalInt_21_ >= argument_7_
						 && ((argument_6_
						      [anLocalInt_21_]
						      [anLocalInt_18_]
						      [anLocalInt_20_])
						     == argument_8_))
						|| (Node_Sub29.method856
                                (anLocalInt_18_,
                                        anLocalInt_20_,
                                        anLocalInt_14_, 19322)))
						anLocalBooleans
						    [anLocalInt_17_]
						    [anLocalInt_19_]
						    = false;
					    else
						anLocalBooleans
						    [anLocalInt_17_]
						    [anLocalInt_19_]
						    = true;
					    break;
					}
				    }
				}
			    }
			}
		    }
		    if (Node_Sub31_Sub10.aBoolean5882) {
			if (argument_9_ >= 0)
			    Node_Sub31_Sub5.aClass_sArray5858
				[anLocalInt_14_].method3539
				(0, 0, 0, null, false, argument_9_,
				 argument_10_);
			else
			    Node_Sub31_Sub5.aClass_sArray5858
				[anLocalInt_14_].method3533
				(0, 0, 0, null, false, argument_10_);
			for (int anLocalInt_22_ = 0;
			     (anLocalInt_22_
			      < DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602);
			     anLocalInt_22_++)
			    Class179_Sub1.aClass130Array5271
				[anLocalInt_22_].method2431
				(new DoublyLinkedNodeP2_Sub3(anLocalInt_14_ + 1), 22951);
		    } else if (argument_9_ >= 0)
			Node_Sub31_Sub5.aClass_sArray5858
			    [anLocalInt_14_].method3539
			    (Class189_Sub2.anInt5642, Class311.anInt2592,
			     Node_Sub35.anInt4158,
			     DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319, false,
			     argument_9_, argument_10_);
		    else
			Node_Sub31_Sub5.aClass_sArray5858
			    [anLocalInt_14_].method3533
			    (Class189_Sub2.anInt5642, Class311.anInt2592,
			     Node_Sub35.anInt4158,
			     DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319, false,
			     argument_10_);
		} else {
		    int anLocalInt_23_
			= Class242.aBooleanArrayArray1757.length;
		    if ((Class243.anInt3602
			 + Class242.aBooleanArrayArray1757.length)
			> LightingManager.xMapSize)
			anLocalInt_23_
			    -= (Class243.anInt3602
				+ Class242.aBooleanArrayArray1757.length
				- LightingManager.xMapSize);
		    int anLocalInt_24_
			= Class242.aBooleanArrayArray1757[0].length;
		    if ((Statics.anInt6448
			 + Class242.aBooleanArrayArray1757[0].length)
			> LightingManager.zMapSize)
			anLocalInt_24_
			    -= (Statics.anInt6448
				+ Class242.aBooleanArrayArray1757[0].length
				- LightingManager.zMapSize);
		    boolean[][] anLocalBooleans
			= DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319;
		    if (Node_Sub31_Sub16.aBoolean5911) {
			if (Node_Sub31_Sub10.aBoolean5882)
			    anLocalBooleans
				= (Class62_Sub22.aBooleanArrayArrayArray4435
				   [anLocalInt_14_]);
			for (int anLocalInt_25_ = Class140.anInt1094;
			     anLocalInt_25_ < anLocalInt_23_;
			     anLocalInt_25_++) {
			    int anLocalInt_26_
				= (anLocalInt_25_ + Class243.anInt3602
				   - Class140.anInt1094);
			    for (int anLocalInt_27_ = Class268.anInt2140;
				 anLocalInt_27_ < anLocalInt_24_;
				 anLocalInt_27_++) {
				if ((Class242.aBooleanArrayArray1757
				     [anLocalInt_25_][anLocalInt_27_])
				    && !(Node_Sub29.method856
                        (anLocalInt_26_,
                                (anLocalInt_27_
                                        + Statics.anInt6448
                                        - Class268.anInt2140),
                                anLocalInt_14_, 19322)))
				    anLocalBooleans[anLocalInt_25_]
					[anLocalInt_27_]
					= true;
				else
				    anLocalBooleans[anLocalInt_25_]
					[anLocalInt_27_]
					= false;
			    }
			}
		    }
		    if (Node_Sub31_Sub10.aBoolean5882) {
			if (argument_9_ >= 0)
			    Node_Sub31_Sub5.aClass_sArray5858
				[anLocalInt_14_].method3539
				(0, 0, 0, null, false, argument_9_,
				 argument_10_);
			else
			    Node_Sub31_Sub5.aClass_sArray5858
				[anLocalInt_14_].method3533
				(0, 0, 0, null, false, argument_10_);
			for (int anLocalInt_28_ = 0;
			     (anLocalInt_28_
			      < DoublyLinkedNodeP2_Sub2_Sub3_Sub1.anInt6602);
			     anLocalInt_28_++)
			    Class179_Sub1.aClass130Array5271
				[anLocalInt_28_].method2431
				(new DoublyLinkedNodeP2_Sub3(anLocalInt_14_ + 1), 22951);
		    } else if (argument_9_ >= 0)
			Node_Sub31_Sub5.aClass_sArray5858
			    [anLocalInt_14_].method3539
			    (Class189_Sub2.anInt5642, Class311.anInt2592,
			     Node_Sub35.anInt4158,
			     DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319, true,
			     argument_9_, argument_10_);
		    else
			Node_Sub31_Sub5.aClass_sArray5858
			    [anLocalInt_14_].method3533
			    (Class189_Sub2.anInt5642, Class311.anInt2592,
			     Node_Sub35.anInt4158,
			     DoublyLinkedNode_Sub51_Sub15.aBooleanArrayArray6319, true,
			     argument_10_);
		}
	    }
	}
	if (FileOnDisk.anInt1453 > 0) {
	    DoublyLinkedNode_Sub51_Sub13.method1264((DoublyLinkedNodeP2_Sub8.aClass104_Sub2Array4584), 0, FileOnDisk.anInt1453 - 1);
	    for (int anLocalInt_29_ = 0; anLocalInt_29_ < FileOnDisk.anInt1453;
		 anLocalInt_29_++)
		Node_Sub31_Sub18.method933((DoublyLinkedNodeP2_Sub8
                .aClass104_Sub2Array4584
                [anLocalInt_29_]),
                true, argument_11_);
	}
    }
    
    abstract void method1012(int argument_30_);
    
    public static void method1013(boolean argument) {
	aClass207_4140 = null;
	aClanSettings_4143 = null;
    }
    
    Node_Sub32(OggStreamState argument_31_) {
	((Node_Sub32) this).anOggStreamState4142 = argument_31_;
    }
    
    final void method1014(boolean argument_32_, OggPacket argument_33_) {
	method1010(argument_33_, (byte) -13);
	((Node_Sub32) this).anInt4141++;
    }
    
    static {
	aClass207_4140 = new Class207(7, 3);
    }
}
