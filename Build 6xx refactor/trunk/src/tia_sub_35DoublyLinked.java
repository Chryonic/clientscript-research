/* tia_sub_35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class tia_sub_35DoublyLinked extends DoublyLinkedNode
{
    static Class166 aClass166_6251 = new Class166(132, 6);
    static Class329 aClass329_6252;
    static boolean aBoolean6253 = false;
    static int[] anIntArray6254;
    
    public tia_sub_35DoublyLinked() {
	/* empty */
    }
    
    static final boolean method1214(int argument, int argument_0_,
				    int argument_1_) {
	if (!((argument_0_ & 0x40000) != 0
	      | Class46.method435(-1, argument_1_, argument_0_))
	    && !Class245_Sub2.method3191(argument_0_, argument_1_, (byte) -49))
	    return false;
	return true;
    }
    
    static final void method1215(int argument) {
	if (!Node_Sub31_Sub39.aBoolean6055)
	    RsInterface.aBoolean1949
		= ((Statics.anInt4835 != -1
		    && Class62_Sub12.anInt4402 >= Statics.anInt4835)
		   || (Class62_Sub12.anInt4402 * 16 + (Class344.aBoolean3593
						       ? 26 : 22)
		       > Applet_Sub1.canvasHeight));
	if (argument == 2) {
	    Class62_Sub28.aCyclicLinkedList_4463.clear();
	    Class147.aCyclicLinkedList_1117.clear();
	    for (MenuAction class59_sub51_sub9
		     = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						.aCyclicLinkedList_6404
						.getFirst();
		 class59_sub51_sub9 != null;
		 class59_sub51_sub9
		     = ((MenuAction)
			DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getNext())) {
		int anLocalInt
		    = ((MenuAction) class59_sub51_sub9).action;
		if (anLocalInt < 1000) {
		    class59_sub51_sub9.unlink();
		    if (anLocalInt == 2 || anLocalInt == 22 || anLocalInt == 5
			|| anLocalInt == 10 || anLocalInt == 49
			|| anLocalInt == 60 || anLocalInt == 8)
			Class147.aCyclicLinkedList_1117.add(class59_sub51_sub9);
		    else
			Class62_Sub28.aCyclicLinkedList_4463
			    .add(class59_sub51_sub9);
		}
	    }
	    Class62_Sub28.aCyclicLinkedList_4463
		.method3716(DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404);
	    Class147.aCyclicLinkedList_1117
		.method3716(DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404);
	    if (Class62_Sub12.anInt4402 <= 1) {
		Class84.aClass59_Sub51_Sub9_601 = null;
		Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188 = null;
	    } else {
		if (Statics.aBoolean1392
		    && client.keyHandler.isKeyDown(81)
		    && Class62_Sub12.anInt4402 > 2)
		    Class84.aClass59_Sub51_Sub9_601
			= ((MenuAction)
			   ((Node)
			    ((Node)
			     (((CyclicLinkedList) DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404)
			      .rootNode)).prev).prev);
		else
		    Class84.aClass59_Sub51_Sub9_601
			= ((MenuAction)
			   ((Node)
			    (((CyclicLinkedList) DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404)
			     .rootNode)).prev);
		Node_Sub47_Sub7.aClass59_Sub51_Sub9_6188
		    = ((MenuAction)
		       ((Node)
			(((CyclicLinkedList) DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404)
			 .rootNode)).prev);
	    }
	    int anLocalInt = -1;
	    AbstractMouseMessage class59_sub46
		= ((AbstractMouseMessage)
		   Class376.aCyclicLinkedList_3214.getFirst());
	    if (class59_sub46 != null)
		anLocalInt = class59_sub46.getAction();
	    do {
		if (Node_Sub31_Sub39.aBoolean6055) {
		    if (anLocalInt == -1) {
			int anLocalInt_2_ = client.mouseHandler.getX();
			int anLocalInt_3_
			    = client.mouseHandler.getY();
			boolean anLocalBoolean = false;
			if (Statics.aClass59_Sub51_Sub7_581 != null) {
			    if (anLocalInt_2_ >= Node_Sub20.anInt4026 - 10
				&& (anLocalInt_2_
				    <= (Statics.anInt6645
					+ (Node_Sub20.anInt4026 + 10)))
				&& (Statics.anInt5520 - 10
				    <= anLocalInt_3_)
				&& ((DoublyLinkedNode_Sub51_Sub13.anInt6296 + 10
				     + Statics.anInt5520)
				    >= anLocalInt_3_))
				anLocalBoolean = true;
			    else
				Class154_Sub1.method2578(argument ^ ~0x6);
			}
			if (!anLocalBoolean) {
			    if ((DoublyLinkedNode_Sub51_Sub15.anInt6320 - 10
				 > anLocalInt_2_)
				|| (anLocalInt_2_
				    > (DoublyLinkedNode_Sub51_Sub15.anInt6320
				       + Class204.anInt1457 + 10))
				|| (anLocalInt_3_
				    < Node_Sub47_Sub6.anInt6177 - 10)
				|| (Node_Sub47_Sub6.anInt6177
				    + Class356.anInt3016 + 10) < anLocalInt_3_)
				Statics.method2600(0);
			    else if (RsInterface.aBoolean1949) {
				int anLocalInt_4_ = -1;
				int anLocalInt_5_ = -1;
				for (int anLocalInt_6_ = 0;
				     anLocalInt_6_ < Class62_Sub8.anInt4394;
				     anLocalInt_6_++) {
				    if (Class344.aBoolean3593) {
					int anLocalInt_7_
					    = (Node_Sub47_Sub6.anInt6177
					       + (33 + anLocalInt_6_ * 16));
					if (anLocalInt_7_ - 13 < anLocalInt_3_
					    && (anLocalInt_7_ + 4
						> anLocalInt_3_)) {
					    anLocalInt_4_ = anLocalInt_6_;
					    anLocalInt_5_ = anLocalInt_7_ - 13;
					    break;
					}
				    } else {
					int anLocalInt_8_
					    = (anLocalInt_6_ * 16
					       + (Node_Sub47_Sub6.anInt6177
						  + 31));
					if (anLocalInt_3_ > anLocalInt_8_ - 13
					    && (anLocalInt_3_
						< anLocalInt_8_ + 3)) {
					    anLocalInt_4_ = anLocalInt_6_;
					    anLocalInt_5_ = anLocalInt_8_ - 13;
					    break;
					}
				    }
				}
				if (anLocalInt_4_ != -1) {
				    int anLocalInt_9_ = 0;
				    Class23 class23
					= new Class23(Node_Sub7
						      .aDCyclicLinkedList_3920);
				    for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
					     = ((DoublyLinkedNode_Sub51_Sub7)
						class23.method334((byte) 94));
					 class59_sub51_sub7 != null;
					 class59_sub51_sub7
					     = ((DoublyLinkedNode_Sub51_Sub7)
						class23.method336(7782))) {
					if (anLocalInt_9_ == anLocalInt_4_) {
					    if (((DoublyLinkedNode_Sub51_Sub7)
						 class59_sub51_sub7).anInt6249
						> 1)
						Class368_Sub3.method4034
                                (anLocalInt_5_,
                                        class59_sub51_sub7, 107,
                                        anLocalInt_3_);
					    break;
					}
					anLocalInt_9_++;
				    }
				}
			    }
			}
		    }
		    if (anLocalInt == 0) {
			int anLocalInt_10_ = class59_sub46.getX();
			int anLocalInt_11_ = class59_sub46.getY();
			if (Statics.aClass59_Sub51_Sub7_581 != null
			    && anLocalInt_10_ >= Node_Sub20.anInt4026
			    && (Statics.anInt6645
				+ Node_Sub20.anInt4026) >= anLocalInt_10_
			    && anLocalInt_11_ >= Statics.anInt5520
			    && ((Statics.anInt5520
				 + DoublyLinkedNode_Sub51_Sub13.anInt6296)
				>= anLocalInt_11_)) {
			    int anLocalInt_12_ = -1;
			    for (int anLocalInt_13_ = 0;
				 (((DoublyLinkedNode_Sub51_Sub7)
				   Statics.aClass59_Sub51_Sub7_581).anInt6249
				  > anLocalInt_13_);
				 anLocalInt_13_++) {
				if (!Class344.aBoolean3593) {
				    int anLocalInt_14_
					= (Statics.anInt5520
					   + anLocalInt_13_ * 16 + 31);
				    if (anLocalInt_11_ > anLocalInt_14_ - 13
					&& anLocalInt_11_ < anLocalInt_14_ + 3)
					anLocalInt_12_ = anLocalInt_13_;
				} else {
				    int anLocalInt_15_
					= (Statics.anInt5520
					   - (-(anLocalInt_13_ * 16) - 33));
				    if (anLocalInt_15_ - 13 < anLocalInt_11_
					&& anLocalInt_15_ + 4 > anLocalInt_11_)
					anLocalInt_12_ = anLocalInt_13_;
				}
			    }
			    if (anLocalInt_12_ != -1) {
				int anLocalInt_16_ = 0;
				Class23 class23
				    = new Class23(((DoublyLinkedNode_Sub51_Sub7)
						   (Statics
						    .aClass59_Sub51_Sub7_581))
						  .aDCyclicLinkedList_6250);
				for (MenuAction class59_sub51_sub9
					 = ((MenuAction)
					    class23.method334((byte) 84));
				     class59_sub51_sub9 != null;
				     class59_sub51_sub9
					 = ((MenuAction)
					    class23.method336(argument
                                ^ 0x1e64))) {
				    if (anLocalInt_16_ == anLocalInt_12_) {
					Class133.method2445(class59_sub51_sub9,
                            anLocalInt_11_,
                            114,
                            anLocalInt_10_);
					break;
				    }
				    anLocalInt_16_++;
				}
			    }
			    Statics.method2600(0);
			} else if ((DoublyLinkedNode_Sub51_Sub15.anInt6320
				    <= anLocalInt_10_)
				   && (DoublyLinkedNode_Sub51_Sub15.anInt6320
				       + Class204.anInt1457) >= anLocalInt_10_
				   && (anLocalInt_11_
				       >= Node_Sub47_Sub6.anInt6177)
				   && ((Node_Sub47_Sub6.anInt6177
					+ Class356.anInt3016)
				       >= anLocalInt_11_)) {
			    if (!RsInterface.aBoolean1949) {
				int anLocalInt_17_ = -1;
				for (int anLocalInt_18_ = 0;
				     anLocalInt_18_ < Class62_Sub12.anInt4402;
				     anLocalInt_18_++) {
				    if (!Class344.aBoolean3593) {
					int anLocalInt_19_
					    = ((Class62_Sub12.anInt4402
						- anLocalInt_18_ - 1) * 16
					       + (Node_Sub47_Sub6.anInt6177
						  + 31));
					if ((anLocalInt_19_ - 13
					     < anLocalInt_11_)
					    && (anLocalInt_19_ + 3
						> anLocalInt_11_))
					    anLocalInt_17_ = anLocalInt_18_;
				    } else {
					int anLocalInt_20_
					    = (Node_Sub47_Sub6.anInt6177
					       + 33
					       + (-anLocalInt_18_
						  + (Class62_Sub12.anInt4402
						     - 1)) * 16);
					if ((anLocalInt_11_
					     > anLocalInt_20_ - 13)
					    && (anLocalInt_11_
						< anLocalInt_20_ + 4))
					    anLocalInt_17_ = anLocalInt_18_;
				    }
				}
				if (anLocalInt_17_ != -1) {
				    int anLocalInt_21_ = 0;
				    Class151 class151
					= new Class151(DoublyLinkedNodeP2_Sub2_Sub1
						       .aCyclicLinkedList_6404);
				    for (MenuAction class59_sub51_sub9
					     = ((MenuAction)
						class151.method2547(3530));
					 class59_sub51_sub9 != null;
					 class59_sub51_sub9
					     = ((MenuAction)
						class151
						    .method2549((byte) 17))) {
					if (anLocalInt_21_ == anLocalInt_17_) {
					    Class133.method2445
                                (class59_sub51_sub9,
                                        anLocalInt_11_, 117,
                                        anLocalInt_10_);
					    break;
					}
					anLocalInt_21_++;
				    }
				}
				Statics.method2600(0);
			    } else {
				int anLocalInt_22_ = -1;
				for (int anLocalInt_23_ = 0;
				     anLocalInt_23_ < Class62_Sub8.anInt4394;
				     anLocalInt_23_++) {
				    if (Class344.aBoolean3593) {
					int anLocalInt_24_
					    = (anLocalInt_23_ * 16
					       + Node_Sub47_Sub6.anInt6177
					       + 33);
					if ((anLocalInt_24_ - 13
					     < anLocalInt_11_)
					    && (anLocalInt_24_ + 4
						> anLocalInt_11_)) {
					    anLocalInt_22_ = anLocalInt_23_;
					    break;
					}
				    } else {
					int anLocalInt_25_
					    = (anLocalInt_23_ * 16
					       + Node_Sub47_Sub6.anInt6177
					       + 31);
					if ((anLocalInt_25_ - 13
					     < anLocalInt_11_)
					    && (anLocalInt_11_
						< anLocalInt_25_ + 3)) {
					    anLocalInt_22_ = anLocalInt_23_;
					    break;
					}
				    }
				}
				if (anLocalInt_22_ != -1) {
				    int anLocalInt_26_ = 0;
				    Class23 class23
					= new Class23(Node_Sub7
						      .aDCyclicLinkedList_3920);
				    for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
					     = ((DoublyLinkedNode_Sub51_Sub7)
						class23.method334((byte) 97));
					 class59_sub51_sub7 != null;
					 class59_sub51_sub7
					     = ((DoublyLinkedNode_Sub51_Sub7)
						class23.method336(7782))) {
					if (anLocalInt_22_ == anLocalInt_26_) {
					    Class133.method2445
                                (((MenuAction)
                                        (((DoublyLinkedNode)
                                                (((DCyclicLinkedList)
                                                        (((DoublyLinkedNode_Sub51_Sub7)
                                                                class59_sub51_sub7)
                                                                .aDCyclicLinkedList_6250))
                                                        .rootNode))
                                                .nextD)),
                                        anLocalInt_11_, 115,
                                        anLocalInt_10_);
					    Statics
						.method2600(argument ^ 0x2);
					    break;
					}
					anLocalInt_26_++;
				    }
				}
			    }
			}
		    }
		} else {
		    if (anLocalInt == 0 && ((Class121.anInt983 == 1
					     && Class62_Sub12.anInt4402 > 2)
					    || Class62_Sub20.method1438(-121)))
			anLocalInt = 2;
		    if (anLocalInt == 2 && Class62_Sub12.anInt4402 > 0
			&& class59_sub46 != null) {
			if (dba_sub_772.aRsInterface_4345 != null
			    || Class123.anInt1002 != 0)
			    Node_Sub31_Sub27.anInt5961 = 2;
			else
			    Class156.method2587(class59_sub46.getY(),
                        class59_sub46
                                .getX(),
                        -112);
		    }
		    if (anLocalInt == 0) {
			if (Class84.aClass59_Sub51_Sub9_601 != null)
			    Class32.method366((byte) 58);
			else if (Class353.aBoolean2953)
			    Class362.method3964(0);
		    }
		    if (dba_sub_772.aRsInterface_4345 != null
			|| Class123.anInt1002 != 0)
			break;
		    Node_Sub31_Sub27.anInt5961 = 0;
		    Node_Sub32_Sub4.aClass59_Sub51_Sub9_6087 = null;
		}
		break;
	    } while (false);
	}
    }
    
    public static void method1216(byte argument) {
	aClass329_6252 = null;
	anIntArray6254 = null;
	aClass166_6251 = null;
    }
    
    static {
	aClass329_6252 = new Class329(2, 7);
	anIntArray6254 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1,
				     4096, 6144, 2048 };
    }
}
