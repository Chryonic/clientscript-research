/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class163
{
    static int anInt1190 = 0;
    int anInt1191 = 128;
    int anInt1192;
    int anInt1193;
    int anInt1194;
    int anInt1195 = 128;
    int anInt1196;

    final void method2619(byte argument_2_, Class163 argument_3_) {
	((Class163) this).anInt1193 = ((Class163) argument_3_).anInt1193;
	((Class163) this).anInt1195 = ((Class163) argument_3_).anInt1195;
	((Class163) this).anInt1191 = ((Class163) argument_3_).anInt1191;
	((Class163) this).anInt1192 = ((Class163) argument_3_).anInt1192;
	((Class163) this).anInt1196 = ((Class163) argument_3_).anInt1196;
	((Class163) this).anInt1194 = ((Class163) argument_3_).anInt1194;
    }
    
    public static void method2620(byte argument) {
	GlImageSkybox.anIntArrayArray1197 = null;
    }
    
    final Class163 method2621(int argument_4_) {
	int anLocalInt = 2 % ((-61 - argument_4_) / 46);
	return new Class163(((Class163) this).anInt1196,
			    ((Class163) this).anInt1195,
			    ((Class163) this).anInt1191,
			    ((Class163) this).anInt1192,
			    ((Class163) this).anInt1193,
			    ((Class163) this).anInt1194);
    }
    
    static final void method2622(GraphicsToolkit argument, int argument_5_) {
	int anLocalInt = 0;
	int anLocalInt_6_ = 0;
	if (Class52.aBoolean391) {
	    anLocalInt = Node_Sub52.method1319(argument_5_ + 16777315);
	    anLocalInt_6_ = Class82.method1596(-2);
	}
	int anLocalInt_7_ = anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320;
	int anLocalInt_8_ = anLocalInt_6_ + Node_Sub47_Sub6.anInt6177;
	int anLocalInt_9_ = Class204.anInt1457;
	int anLocalInt_10_ = Class356.anInt3016 - 3;
	if (argument_5_ == -16777216) {
	    int anLocalInt_11_ = 20;
	    Class349.method3821(anLocalInt_6_ + Node_Sub47_Sub6.anInt6177,
				Class204.anInt1457, false, Class356.anInt3016,
				DoublyLinkedNode_Sub51_Sub15.anInt6320 + anLocalInt,
				argument, anLocalInt_11_,
				MultilanguageString.CHOOSE_OPTION
				    .getLocalizedString(client.language));
	    int anLocalInt_12_
		= client.mouseHandler.getX() + anLocalInt;
	    int anLocalInt_13_
		= anLocalInt_6_ + client.mouseHandler.getY();
	    if (RsInterface.aBoolean1949) {
		int anLocalInt_14_ = 0;
		for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920
				.getFirst());
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
		    int anLocalInt_15_ = (anLocalInt_14_ * 16 + 13
					  + (anLocalInt_11_ + anLocalInt_8_));
		    if ((anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320
			 < anLocalInt_12_)
			&& (DoublyLinkedNode_Sub51_Sub15.anInt6320 + anLocalInt
			    + Class204.anInt1457) > anLocalInt_12_
			&& anLocalInt_15_ - 13 < anLocalInt_13_
			&& anLocalInt_15_ + 4 > anLocalInt_13_
			&& ((((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
			     .anInt6249) > 1
			    || ((MenuAction) (MenuAction)
				(((DoublyLinkedNode)
				  ((DCyclicLinkedList)
				   (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
				    .aDCyclicLinkedList_6250)).rootNode)
				 .nextD)).aBoolean6273))
			argument.fillRect(anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320, anLocalInt_15_ - 12, Class204.anInt1457, 16, (-Class9.anInt84 + 255 << 24 | Class301.anInt2528), 1);
		    anLocalInt_14_++;
		}
		if (Statics.aClass59_Sub51_Sub7_581 != null) {
		    Class349.method3821(Statics.anInt5520,
					Statics.anInt6645,
					false, DoublyLinkedNode_Sub51_Sub13.anInt6296,
					Node_Sub20.anInt4026, argument,
					anLocalInt_11_,
					(((DoublyLinkedNode_Sub51_Sub7)
					  Statics.aClass59_Sub51_Sub7_581)
					 .aString6248));
		    anLocalInt_14_ = 0;
		    for (MenuAction class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250.getFirst());
			 class59_sub51_sub9 != null;
			 class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250.getNext())) {
			int anLocalInt_16_
			    = (Statics.anInt5520 + 13
			       - (-anLocalInt_11_ - anLocalInt_14_ * 16));
			if (anLocalInt_12_ > Node_Sub20.anInt4026
			    && (anLocalInt_12_
				< (Statics.anInt6645
				   + Node_Sub20.anInt4026))
			    && anLocalInt_16_ - 13 < anLocalInt_13_
			    && anLocalInt_16_ + 4 > anLocalInt_13_
			    && (((MenuAction) class59_sub51_sub9)
				.aBoolean6273))
			    argument.fillRect(Node_Sub20.anInt4026, anLocalInt_16_ - 12, Statics.anInt6645, 16, (-Class9.anInt84 + 255 << 24 | Class301.anInt2528), 1);
			anLocalInt_14_++;
		    }
		    Statics.method3365(Statics.anInt6645, DoublyLinkedNode_Sub51_Sub13.anInt6296, anLocalInt_11_, Statics.anInt5520, Node_Sub20.anInt4026, argument, false);
		}
	    } else {
		int anLocalInt_17_ = 0;
		for (MenuAction class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getFirst();
		     class59_sub51_sub9 != null;
		     class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getNext()) {
		    int anLocalInt_18_
			= ((-anLocalInt_17_ - 1 + Class62_Sub12.anInt4402) * 16
			   + anLocalInt_8_ + (anLocalInt_11_ + 13));
		    if ((DoublyLinkedNode_Sub51_Sub15.anInt6320 + anLocalInt
			 < anLocalInt_12_)
			&& anLocalInt_12_ < (Class204.anInt1457
					     + (DoublyLinkedNode_Sub51_Sub15.anInt6320
						+ anLocalInt))
			&& anLocalInt_18_ - 13 < anLocalInt_13_
			&& anLocalInt_18_ + 4 > anLocalInt_13_
			&& (((MenuAction) class59_sub51_sub9)
			    .aBoolean6273))
			argument.fillRect(anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320, anLocalInt_18_ - 12, Class204.anInt1457, 16, (Class301.anInt2528 | -Class9.anInt84 + 255 << 24), 1);
		    anLocalInt_17_++;
		}
	    }
	    Statics.method3365(Class204.anInt1457, Class356.anInt3016, anLocalInt_11_, Node_Sub47_Sub6.anInt6177 + anLocalInt_6_, anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320, argument, false);
	    if (RsInterface.aBoolean1949) {
		int anLocalInt_19_ = 0;
		for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getFirst());
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
		    int anLocalInt_20_
			= (anLocalInt_19_ * 16
			   + (anLocalInt_6_ + Node_Sub47_Sub6.anInt6177
			      + anLocalInt_11_)
			   + 13);
		    anLocalInt_19_++;
		    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7).anInt6249
			!= 1)
			Class183.method2850
			    (anLocalInt_13_,
			     anLocalInt_6_ + Node_Sub47_Sub6.anInt6177,
			     argument,
			     anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320,
			     DxSkybox.anInt4472 | ~0xffffff,
			     Class93.anInt716 | ~0xffffff, Class204.anInt1457,
			     Class356.anInt3016, anLocalInt_12_,
			     class59_sub51_sub7, anLocalInt_20_, false);
		    else
			Class_aa.method162
			    (Class204.anInt1457, anLocalInt_20_,
			     anLocalInt_13_,
			     anLocalInt_6_ + Node_Sub47_Sub6.anInt6177,
			     argument,
			     ((MenuAction)
			      ((DoublyLinkedNode)
			       (((DCyclicLinkedList) ((DoublyLinkedNode_Sub51_Sub7)
					    class59_sub51_sub7).aDCyclicLinkedList_6250)
				.rootNode)).nextD),
			     anLocalInt_12_,
			     DxSkybox.anInt4472 | ~0xffffff,
			     anLocalInt + DoublyLinkedNode_Sub51_Sub15.anInt6320,
			     Class93.anInt716 | ~0xffffff, Class356.anInt3016,
			     true);
		}
		if (Statics.aClass59_Sub51_Sub7_581 != null) {
		    anLocalInt_19_ = 0;
		    for (MenuAction class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250.getFirst());
			 class59_sub51_sub9 != null;
			 class59_sub51_sub9
			     = ((MenuAction)
				((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581)
				    .aDCyclicLinkedList_6250.getNext())) {
			int anLocalInt_21_
			    = (anLocalInt_19_ * 16 + 13
			       + Statics.anInt5520 + anLocalInt_11_);
			Class_aa.method162(Statics.anInt6645,
					   anLocalInt_21_, anLocalInt_13_,
					   Statics.anInt5520, argument,
					   class59_sub51_sub9, anLocalInt_12_,
					   DxSkybox.anInt4472 | ~0xffffff,
					   Node_Sub20.anInt4026,
					   Class93.anInt716 | ~0xffffff,
					   DoublyLinkedNode_Sub51_Sub13.anInt6296,
					   true);
			anLocalInt_19_++;
		    }
		    Node_Sub13.method690(DoublyLinkedNode_Sub51_Sub13.anInt6296,
                    Statics.anInt6645,
                    Statics.anInt5520,
                    argument_5_ + 16777215,
                    Node_Sub20.anInt4026);
		}
	    } else {
		int anLocalInt_22_ = 0;
		for (MenuAction class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getFirst();
		     class59_sub51_sub9 != null;
		     class59_sub51_sub9
			 = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
						    .aCyclicLinkedList_6404
						    .getNext()) {
		    int anLocalInt_23_
			= (anLocalInt_8_ + 13
			   + (anLocalInt_11_
			      + (-anLocalInt_22_ - 1
				 + Class62_Sub12.anInt4402) * 16));
		    anLocalInt_22_++;
		    Class_aa.method162(anLocalInt_9_, anLocalInt_23_,
				       anLocalInt_13_, anLocalInt_8_, argument,
				       class59_sub51_sub9, anLocalInt_12_,
				       DxSkybox.anInt4472 | ~0xffffff,
				       anLocalInt_7_,
				       Class93.anInt716 | ~0xffffff,
				       anLocalInt_10_, true);
		}
	    }
	    Node_Sub13.method690(Class356.anInt3016, Class204.anInt1457,
                (anLocalInt_6_
                        + Node_Sub47_Sub6.anInt6177),
                -1,
                (DoublyLinkedNode_Sub51_Sub15.anInt6320
                        + anLocalInt));
	}
    }
    
    Class163(int argument_24_) {
	((Class163) this).anInt1196 = argument_24_;
    }
    
    private Class163(int argument_25_, int argument_26_, int argument_27_,
		     int argument_28_, int argument_29_, int argument_30_) {
	((Class163) this).anInt1195 = argument_26_;
	((Class163) this).anInt1192 = argument_28_;
	((Class163) this).anInt1196 = argument_25_;
	((Class163) this).anInt1193 = argument_29_;
	((Class163) this).anInt1191 = argument_27_;
	((Class163) this).anInt1194 = argument_30_;
    }
}
