/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166
{
    int anInt1212;
    private int anInt1213;
    static byte[][] aByteArrayArray1214;
    static Class166 aClass166_1215 = new Class166(3, 1);
    static Class124[] aClass124Array1216 = new Class124[8];
    static int[] anIntArray1217 = { 3, 7, 15 };
    static Class166 aClass166_1218 = new Class166(9, 0);
    
    final int method2633(byte argument_0_) {
	return anInt1213;
    }
    
    static final Class167 method2634
	(int argument, int argument_1_, Class167 argument_2_, int argument_3_,
	 Class367 argument_4_, int argument_5_, int argument_6_,
	 GraphicsToolkit argument_7_, int argument_8_, int argument_9_,
	 boolean argument_10_, int argument_11_, int argument_12_,
	 int argument_13_) {
	if (argument_2_ == null)
	    return null;
	int anLocalInt = 2055;
	if (argument_4_ != null) {
	    anLocalInt
		|= argument_4_.method3997(false, -1, 27123, argument_6_);
	    anLocalInt &= ~0x200;
	}
	long l = (((long) argument_5_ << 48)
		  + (long) (argument_13_ + (argument_8_ << 16)
			    + (argument_12_ << 24))
		  - -((long) argument_11_ << 32));
	Class167 class167;
	synchronized (Class167_Sub2.aClass149_5165) {
	    if (argument_10_ != true)
		return null;
	    class167
		= (Class167) Class167_Sub2.aClass149_5165.get(l);
	}
	if (class167 == null
	    || argument_7_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt = argument_7_.or(anLocalInt, class167.ua());
	    int anLocalInt_14_;
	    if (argument_13_ == 1)
		anLocalInt_14_ = 9;
	    else if (argument_13_ != 2) {
		if (argument_13_ != 3) {
		    if (argument_13_ != 4)
			anLocalInt_14_ = 21;
		    else
			anLocalInt_14_ = 18;
		} else
		    anLocalInt_14_ = 15;
	    } else
		anLocalInt_14_ = 12;
	    int anLocalInt_15_ = 3;
	    int[] anLocalInts = { 64, 96, 128 };
	    Class101 class101
		= new Class101(anLocalInt_15_ * anLocalInt_14_ + 1,
			       (anLocalInt_15_ * (anLocalInt_14_ * 2)
				- anLocalInt_14_),
			       0);
	    int anLocalInt_16_ = class101.method1750(0, 0, 0, (byte) 101);
	    int[][] anLocalInts_17_ = new int[anLocalInt_15_][anLocalInt_14_];
	    for (int anLocalInt_18_ = 0; anLocalInt_18_ < anLocalInt_15_;
		 anLocalInt_18_++) {
		int anLocalInt_19_ = anLocalInts[anLocalInt_18_];
		int anLocalInt_20_ = anLocalInts[anLocalInt_18_];
		for (int anLocalInt_21_ = 0; anLocalInt_14_ > anLocalInt_21_;
		     anLocalInt_21_++) {
		    int anLocalInt_22_
			= (anLocalInt_21_ << 14) / anLocalInt_14_;
		    int anLocalInt_23_
			= ((anLocalInt_19_
			    * Node_Sub6.SINETABLE[anLocalInt_22_])
			   >> 14);
		    int anLocalInt_24_
			= ((anLocalInt_20_
			    * Node_Sub6.COSINETABLE[anLocalInt_22_])
			   >> 14);
		    anLocalInts_17_[anLocalInt_18_][anLocalInt_21_]
			= class101.method1750(0, anLocalInt_23_,
					      anLocalInt_24_, (byte) 101);
		}
	    }
	    for (int anLocalInt_25_ = 0; anLocalInt_15_ > anLocalInt_25_;
		 anLocalInt_25_++) {
		int anLocalInt_26_
		    = (anLocalInt_25_ * 256 + 128) / anLocalInt_15_;
		int anLocalInt_27_ = 256 - anLocalInt_26_;
		byte anLocalInt_28_ = (byte) ((anLocalInt_27_ * argument_8_
					       + anLocalInt_26_ * argument_12_)
					      >> 8);
		short anLocalInt_29_
		    = (short) ((((anLocalInt_26_ * (argument_5_ & 0x7f)
				  + (argument_11_ & 0x7f) * anLocalInt_27_)
				 & 0x7f00)
				+ (((argument_11_ & 0xfc00) * anLocalInt_27_
				    + anLocalInt_26_ * (argument_5_ & 0xfc00))
				   & 0xfc0000)
				+ ((anLocalInt_26_ * (argument_5_ & 0x380)
				    + anLocalInt_27_ * (argument_11_ & 0x380))
				   & 0x38000))
			       >> 8);
		for (int anLocalInt_30_ = 0; anLocalInt_30_ < anLocalInt_14_;
		     anLocalInt_30_++) {
		    if (anLocalInt_25_ != 0) {
			class101.method1745
			    (0, (byte) -1,
			     (anLocalInts_17_[anLocalInt_25_ - 1]
			      [(anLocalInt_30_ + 1) % anLocalInt_14_]),
			     anLocalInt_29_,
			     (anLocalInts_17_[anLocalInt_25_]
			      [(anLocalInt_30_ + 1) % anLocalInt_14_]),
			     anLocalInt_28_, (short) -1,
			     (anLocalInts_17_[anLocalInt_25_ - 1]
			      [anLocalInt_30_]),
			     (byte) 1);
			class101.method1745(0, (byte) -1,
					    (anLocalInts_17_[anLocalInt_25_]
					     [((anLocalInt_30_ + 1)
					       % anLocalInt_14_)]),
					    anLocalInt_29_,
					    (anLocalInts_17_[anLocalInt_25_]
					     [anLocalInt_30_]),
					    anLocalInt_28_, (short) -1,
					    (anLocalInts_17_
					     [anLocalInt_25_ - 1]
					     [anLocalInt_30_]),
					    (byte) 1);
		    } else
			class101.method1745(0, (byte) -1,
					    (anLocalInts_17_[0]
					     [((anLocalInt_30_ + 1)
					       % anLocalInt_14_)]),
					    anLocalInt_29_,
					    anLocalInts_17_[0][anLocalInt_30_],
					    anLocalInt_28_, (short) -1,
					    anLocalInt_16_, (byte) 1);
		}
	    }
	    class167 = argument_7_.method2057(class101, anLocalInt,
					      Statics.anInt5820, 64,
					      768);
	    synchronized (Class167_Sub2.aClass149_5165) {
		Class167_Sub2.aClass149_5165.put(class167, l);
	    }
	}
	int anLocalInt_31_ = argument_2_.V();
	int anLocalInt_32_ = argument_2_.RA();
	int anLocalInt_33_ = argument_2_.HA();
	int anLocalInt_34_ = argument_2_.G();
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6 = null;
	if (argument_4_ != null) {
	    argument_6_ = ((Class367) argument_4_).anIntArray3096[argument_6_];
	    class59_sub51_sub6 = DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
				     .method3754(-4849, argument_6_ >> 16);
	    argument_6_ &= 0xffff;
	}
	if (class59_sub51_sub6 != null) {
	    class167 = class167.method2651((byte) 3, anLocalInt, true);
	    class167.O(-anLocalInt_31_ + anLocalInt_32_ >> 1, 128,
		       anLocalInt_34_ - anLocalInt_33_ >> 1);
	    class167.H(anLocalInt_31_ + anLocalInt_32_ >> 1, 0,
		       anLocalInt_34_ + anLocalInt_33_ >> 1);
	    class167.method2638(argument_6_, class59_sub51_sub6, 0);
	} else {
	    class167 = class167.method2651((byte) 3, anLocalInt, true);
	    class167.O(-anLocalInt_31_ + anLocalInt_32_ >> 1, 128,
		       anLocalInt_34_ - anLocalInt_33_ >> 1);
	    class167.H(anLocalInt_32_ + anLocalInt_31_ >> 1, 0,
		       anLocalInt_34_ + anLocalInt_33_ >> 1);
	}
	if (argument_1_ != 0)
	    class167.FA(argument_1_);
	if (argument_9_ != 0)
	    class167.VA(argument_9_);
	if (argument_3_ != 0)
	    class167.H(0, argument_3_, 0);
	return class167;
    }
    
    public static void method2635(byte argument) {
	aClass166_1218 = null;
	aClass166_1215 = null;
	aClass124Array1216 = null;
	aByteArrayArray1214 = null;
	anIntArray1217 = null;
    }
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    Class166(int argument_35_, int argument_36_) {
	anInt1213 = argument_35_;
	((Class166) this).anInt1212 = argument_36_;
    }
    
    static final int method2636(byte argument) {
	if (dba_sub_772.aRsInterface_4345 == null) {
	    if (Node_Sub31_Sub39.aBoolean6055
		|| Class84.aClass59_Sub51_Sub9_601 == null) {
		int anLocalInt = client.mouseHandler.getX();
		int anLocalInt_37_
		    = client.mouseHandler.getY();
		if (RsInterface.aBoolean1949) {
		    if (DoublyLinkedNode_Sub51_Sub15.anInt6320 < anLocalInt
			&& anLocalInt < (Class204.anInt1457
					 + DoublyLinkedNode_Sub51_Sub15.anInt6320)) {
			int anLocalInt_38_ = -1;
			for (int anLocalInt_39_ = 0;
			     Class62_Sub8.anInt4394 > anLocalInt_39_;
			     anLocalInt_39_++) {
			    if (Class344.aBoolean3593) {
				int anLocalInt_40_
				    = (anLocalInt_39_ * 16 + 33
				       + Node_Sub47_Sub6.anInt6177);
				if (anLocalInt_37_ > anLocalInt_40_ - 13
				    && anLocalInt_40_ + 3 >= anLocalInt_37_)
				    anLocalInt_38_ = anLocalInt_39_;
			    } else {
				int anLocalInt_41_
				    = (anLocalInt_39_ * 16
				       + Node_Sub47_Sub6.anInt6177 + 31);
				if (anLocalInt_37_ > anLocalInt_41_ - 13
				    && anLocalInt_37_ <= anLocalInt_41_ + 3)
				    anLocalInt_38_ = anLocalInt_39_;
			    }
			}
			if (anLocalInt_38_ != -1) {
			    int anLocalInt_42_ = 0;
			    Class23 class23
				= new Class23(Node_Sub7.aDCyclicLinkedList_3920);
			    for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
				     = ((DoublyLinkedNode_Sub51_Sub7)
					class23.method334((byte) 126));
				 class59_sub51_sub7 != null;
				 class59_sub51_sub7
				     = ((DoublyLinkedNode_Sub51_Sub7)
					class23.method336(7782))) {
				if (anLocalInt_38_ == anLocalInt_42_++)
				    return (((MenuAction)
					     (MenuAction)
					     (((DoublyLinkedNode)
					       (((DCyclicLinkedList)
						 (((DoublyLinkedNode_Sub51_Sub7)
						   class59_sub51_sub7)
						  .aDCyclicLinkedList_6250))
						.rootNode))
					      .nextD))
					    .anInt6275);
			    }
			}
		    } else if (Statics.aClass59_Sub51_Sub7_581 != null
			       && Node_Sub20.anInt4026 < anLocalInt
			       && ((Node_Sub20.anInt4026
				    + Statics.anInt6645)
				   > anLocalInt)) {
			int anLocalInt_43_ = -1;
			for (int anLocalInt_44_ = 0;
			     (anLocalInt_44_
			      < ((DoublyLinkedNode_Sub51_Sub7)
				 Statics.aClass59_Sub51_Sub7_581).anInt6249);
			     anLocalInt_44_++) {
			    if (Class344.aBoolean3593) {
				int anLocalInt_45_
				    = (Statics.anInt5520
				       + anLocalInt_44_ * 16 + 33);
				if (anLocalInt_37_ > anLocalInt_45_ - 13
				    && anLocalInt_37_ <= anLocalInt_45_ + 3)
				    anLocalInt_43_ = anLocalInt_44_;
			    } else {
				int anLocalInt_46_
				    = (anLocalInt_44_ * 16
				       + Statics.anInt5520 + 31);
				if (anLocalInt_46_ - 13 < anLocalInt_37_
				    && anLocalInt_46_ + 3 >= anLocalInt_37_)
				    anLocalInt_43_ = anLocalInt_44_;
			    }
			}
			if (anLocalInt_43_ != -1) {
			    int anLocalInt_47_ = 0;
			    Class23 class23
				= new Class23(((DoublyLinkedNode_Sub51_Sub7)
					       Statics.aClass59_Sub51_Sub7_581)
					      .aDCyclicLinkedList_6250);
			    for (MenuAction class59_sub51_sub9
				     = ((MenuAction)
					class23.method334((byte) 80));
				 class59_sub51_sub9 != null;
				 class59_sub51_sub9
				     = ((MenuAction)
					class23.method336(7782))) {
				if (anLocalInt_43_ == anLocalInt_47_++)
				    return (((MenuAction)
					     class59_sub51_sub9)
					    .anInt6275);
			    }
			}
		    }
		} else if (anLocalInt > DoublyLinkedNode_Sub51_Sub15.anInt6320
			   && (DoublyLinkedNode_Sub51_Sub15.anInt6320
			       + Class204.anInt1457) > anLocalInt) {
		    int anLocalInt_48_ = -1;
		    for (int anLocalInt_49_ = 0;
			 Class62_Sub12.anInt4402 > anLocalInt_49_;
			 anLocalInt_49_++) {
			if (Class344.aBoolean3593) {
			    int anLocalInt_50_
				= (Node_Sub47_Sub6.anInt6177 + 33
				   + (-anLocalInt_49_ - 1
				      + Class62_Sub12.anInt4402) * 16);
			    if (anLocalInt_50_ - 13 < anLocalInt_37_
				&& anLocalInt_50_ + 3 >= anLocalInt_37_)
				anLocalInt_48_ = anLocalInt_49_;
			} else {
			    int anLocalInt_51_
				= (Node_Sub47_Sub6.anInt6177
				   + (-anLocalInt_49_ - 1
				      + Class62_Sub12.anInt4402) * 16
				   + 31);
			    if (anLocalInt_51_ - 13 < anLocalInt_37_
				&& anLocalInt_51_ + 3 >= anLocalInt_37_)
				anLocalInt_48_ = anLocalInt_49_;
			}
		    }
		    if (anLocalInt_48_ != -1) {
			int anLocalInt_52_ = 0;
			Class151 class151
			    = new Class151(DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404);
			for (MenuAction class59_sub51_sub9
				 = ((MenuAction)
				    class151.method2547(3530));
			     class59_sub51_sub9 != null;
			     class59_sub51_sub9
				 = ((MenuAction)
				    class151.method2549((byte) 17))) {
			    if (anLocalInt_48_ == anLocalInt_52_++)
				return (((MenuAction)
					 class59_sub51_sub9)
					.anInt6275);
			}
		    }
		}
	    } else
		return (((MenuAction) Class84.aClass59_Sub51_Sub9_601)
			.anInt6275);
	}
	return -1;
    }
}
