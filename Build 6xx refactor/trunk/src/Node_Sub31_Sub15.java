/* Class59_Sub31_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Node_Sub31_Sub15 extends Node_Sub31
{
    static Class244 aClass244_5901;
    int anInt5903;
    int anInt5904;
    int[] anIntArray5905;
    private int anInt5906 = -1;
    
    static final boolean method916
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, ClipMap argument_8_, int argument_9_) {
	if (argument_6_ != -2878)
	    return true;
	int anLocalInt = argument_7_;
	int anLocalInt_10_ = argument_0_;
	int anLocalInt_11_ = 64;
	int anLocalInt_12_ = 64;
	int anLocalInt_13_ = argument_7_ - anLocalInt_11_;
	Class105.anIntArrayArray863[anLocalInt_11_][anLocalInt_12_] = 99;
	int anLocalInt_14_ = -anLocalInt_12_ + argument_0_;
	Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_] = 0;
	int anLocalInt_15_ = 0;
	int anLocalInt_16_ = 0;
	RuntimeException_Sub2.anIntArray3427[anLocalInt_15_] = anLocalInt;
	Class275.anIntArray2203[anLocalInt_15_++] = anLocalInt_10_;
	int[][] anLocalInts = ((ClipMap) argument_8_).anIntArrayArray1750;
	while (anLocalInt_16_ != anLocalInt_15_) {
	    anLocalInt_10_ = Class275.anIntArray2203[anLocalInt_16_];
	    anLocalInt = RuntimeException_Sub2.anIntArray3427[anLocalInt_16_];
	    anLocalInt_11_ = -anLocalInt_13_ + anLocalInt;
	    anLocalInt_12_ = -anLocalInt_14_ + anLocalInt_10_;
	    anLocalInt_16_ = anLocalInt_16_ + 1 & 0xfff;
	    int anLocalInt_17_
		= -((ClipMap) argument_8_).anInt1746 + anLocalInt;
	    int anLocalInt_18_
		= anLocalInt_10_ - ((ClipMap) argument_8_).anInt1743;
	    int anLocalInt_19_ = argument;
	while_141_:
	    do {
	    while_140_:
		do {
		while_139_:
		    do {
		    while_138_:
			do {
			    do {
				if (anLocalInt_19_ != -4) {
				    if (anLocalInt_19_ != -3) {
					if (anLocalInt_19_ != -2) {
					    if (anLocalInt_19_ != -1) {
						if (anLocalInt_19_ == 0
						    || anLocalInt_19_ == 1
						    || anLocalInt_19_ == 2
						    || anLocalInt_19_ == 3
						    || anLocalInt_19_ == 9)
						    break while_139_;
						break while_140_;
					    }
					} else
					    break;
					break while_138_;
				    }
				} else {
				    if (anLocalInt == argument_9_
					&& anLocalInt_10_ == argument_4_) {
					dba_sub_772_Sub2.anInt6367
					    = anLocalInt_10_;
					MenuAction.anInt6278
					    = anLocalInt;
					return true;
				    }
				    break while_141_;
				}
				if (DoublyLinkedNode_Sub51_Sub19.method1297(argument_2_, argument_4_, argument_9_, argument_6_ ^ 0xb3d, argument_1_, anLocalInt, 2, 2, anLocalInt_10_)) {
				    dba_sub_772_Sub2.anInt6367
					= anLocalInt_10_;
				    MenuAction.anInt6278 = anLocalInt;
				    return true;
				}
				break while_141_;
			    } while (false);
			    if (argument_8_.method3131(argument_9_, anLocalInt,
						       2, argument_2_, -1,
						       argument_4_,
						       anLocalInt_10_, 2,
						       argument_3_,
						       argument_1_)) {
				dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
				MenuAction.anInt6278 = anLocalInt;
				return true;
			    }
			    break while_141_;
			} while (false);
			if (argument_8_.method3137(anLocalInt_10_, argument_2_,
						   argument_1_, argument_3_,
						   argument_9_, anLocalInt,
						   argument_6_ ^ 0xb73,
						   argument_4_, 2)) {
			    MenuAction.anInt6278 = anLocalInt;
			    dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
			    return true;
			}
			break while_141_;
		    } while (false);
		    if (argument_8_.method3132(argument, argument_4_,
					       (byte) 124, anLocalInt_10_,
					       argument_9_, 2, argument_5_,
					       anLocalInt)) {
			dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
			MenuAction.anInt6278 = anLocalInt;
			return true;
		    }
		    break while_141_;
		} while (false);
		if (argument_8_.method3140(argument_5_, argument_9_,
					   anLocalInt, argument,
					   anLocalInt_10_, argument_4_, 2,
					   (byte) -87)) {
		    MenuAction.anInt6278 = anLocalInt;
		    dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
		    return true;
		}
	    } while (false);
	    anLocalInt_19_
		= (Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_]
		   + 1);
	    if (anLocalInt_11_ > 0
		&& (Class105.anIntArrayArray863[anLocalInt_11_ - 1]
		    [anLocalInt_12_]) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_]
		    & 0x43a40000) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_ + 1]
		    & 0x4e240000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt - 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class105.anIntArrayArray863[anLocalInt_11_ - 1][anLocalInt_12_]
		    = 2;
		Class60.anIntArrayArray432[anLocalInt_11_ - 1][anLocalInt_12_]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ < 126
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_]) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_]
		    & 0x60e40000) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_ + 1]
		    & 0x78240000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt + 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_;
		Class105.anIntArrayArray863[anLocalInt_11_ + 1][anLocalInt_12_]
		    = 8;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_ + 1][anLocalInt_12_]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_12_ > 0
		&& (Class105.anIntArrayArray863[anLocalInt_11_]
		    [anLocalInt_12_ - 1]) == 0
		&& (anLocalInts[anLocalInt_17_][anLocalInt_18_ - 1]
		    & 0x43a40000) == 0
		&& (anLocalInts[anLocalInt_17_ + 1][anLocalInt_18_ - 1]
		    & 0x60e40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ - 1;
		Class105.anIntArrayArray863[anLocalInt_11_][anLocalInt_12_ - 1]
		    = 1;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_ - 1]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_12_ < 126
		&& (Class105.anIntArrayArray863[anLocalInt_11_]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_17_][anLocalInt_18_ + 2]
		    & 0x4e240000) == 0
		&& (anLocalInts[anLocalInt_17_ + 1][anLocalInt_18_ + 2]
		    & 0x78240000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ + 1;
		Class105.anIntArrayArray863[anLocalInt_11_][anLocalInt_12_ + 1]
		    = 4;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_ + 1]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ > 0 && anLocalInt_12_ > 0
		&& (Class105.anIntArrayArray863[anLocalInt_11_ - 1]
		    [anLocalInt_12_ - 1]) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_]
		    & 0x4fa40000) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_ - 1]
		    & 0x43a40000) == 0
		&& (anLocalInts[anLocalInt_17_][anLocalInt_18_ - 1]
		    & 0x63e40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt - 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ - 1;
		Class105.anIntArrayArray863[anLocalInt_11_ - 1][(anLocalInt_12_
								 - 1)]
		    = 3;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_ - 1][(anLocalInt_12_
								- 1)]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ < 126 && anLocalInt_12_ > 0
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_ - 1]) == 0
		&& (anLocalInts[anLocalInt_17_ + 1][anLocalInt_18_ - 1]
		    & 0x63e40000) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_ - 1]
		    & 0x60e40000) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_]
		    & 0x78e40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt + 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ - 1;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class105.anIntArrayArray863[anLocalInt_11_ + 1][(anLocalInt_12_
								 - 1)]
		    = 9;
		Class60.anIntArrayArray432[anLocalInt_11_ + 1][(anLocalInt_12_
								- 1)]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ > 0 && anLocalInt_12_ < 126
		&& (Class105.anIntArrayArray863[anLocalInt_11_ - 1]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_ + 1]
		    & 0x4fa40000) == 0
		&& (anLocalInts[anLocalInt_17_ - 1][anLocalInt_18_ + 2]
		    & 0x4e240000) == 0
		&& (anLocalInts[anLocalInt_17_][anLocalInt_18_ + 2]
		    & 0x7e240000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt - 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ + 1;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class105.anIntArrayArray863[anLocalInt_11_ - 1][(anLocalInt_12_
								 + 1)]
		    = 6;
		Class60.anIntArrayArray432[anLocalInt_11_ - 1][(anLocalInt_12_
								+ 1)]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ < 126 && anLocalInt_12_ < 126
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_17_ + 1][anLocalInt_18_ + 2]
		    & 0x7e240000) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_ + 2]
		    & 0x78240000) == 0
		&& (anLocalInts[anLocalInt_17_ + 2][anLocalInt_18_ + 1]
		    & 0x78e40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt + 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ + 1;
		Class105.anIntArrayArray863[anLocalInt_11_ + 1][(anLocalInt_12_
								 + 1)]
		    = 12;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_ + 1][(anLocalInt_12_
								+ 1)]
		    = anLocalInt_19_;
	    }
	}
	dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
	MenuAction.anInt6278 = anLocalInt;
	return false;
    }
    
    int[][] method870(int argument_20_, byte argument_21_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 114,
							       argument_20_);
	if (argument_21_ != -9)
	    return null;
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882
	    && method917(-26298)) {
	    int[] anLocalInts_22_ = anLocalInts[0];
	    int[] anLocalInts_23_ = anLocalInts[1];
	    int[] anLocalInts_24_ = anLocalInts[2];
	    int anLocalInt
		= (((Node_Sub31_Sub15) this).anInt5904
		   * ((((Node_Sub31_Sub15) this).anInt5903
		       == DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711)
		      ? argument_20_
		      : (argument_20_ * ((Node_Sub31_Sub15) this).anInt5903
			 / DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711)));
	    if (((Node_Sub31_Sub15) this).anInt5904 != Statics.anInt294) {
		for (int anLocalInt_25_ = 0; Statics.anInt294 > anLocalInt_25_;
		     anLocalInt_25_++) {
		    int anLocalInt_26_
			= (((Node_Sub31_Sub15) this).anInt5904
			   * anLocalInt_25_ / Statics.anInt294);
		    int anLocalInt_27_
			= (((Node_Sub31_Sub15) this).anIntArray5905
			   [anLocalInt_26_ + anLocalInt]);
		    anLocalInts_24_[anLocalInt_25_]
			= MathStatics.AND(anLocalInt_27_, 255) << 4;
		    anLocalInts_23_[anLocalInt_25_]
			= MathStatics.AND(4080, anLocalInt_27_ >> 4);
		    anLocalInts_22_[anLocalInt_25_]
			= (MathStatics.AND(anLocalInt_27_, 16711680)
			   >> 12);
		}
	    } else {
		for (int anLocalInt_28_ = 0; anLocalInt_28_ < Statics.anInt294;
		     anLocalInt_28_++) {
		    int anLocalInt_29_ = (((Node_Sub31_Sub15) this)
					  .anIntArray5905[anLocalInt++]);
		    anLocalInts_24_[anLocalInt_28_]
			= MathStatics.AND(anLocalInt_29_ << 4, 4080);
		    anLocalInts_23_[anLocalInt_28_]
			= MathStatics.AND(65280, anLocalInt_29_) >> 4;
		    anLocalInts_22_[anLocalInt_28_]
			= MathStatics.AND(anLocalInt_29_ >> 12, 4080);
		}
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_30_, int argument_31_,
			 byte argument_32_) {
	if (argument_31_ == 0)
	    anInt5906 = argument_30_.g2();
	if (argument_32_ >= -41)
	    method918((byte) 97);
    }
    
    final boolean method917(int argument_33_) {
	if (((Node_Sub31_Sub15) this).anIntArray5905 != null)
	    return true;
	if (anInt5906 >= 0) {
	    Class83 class83
		= (Node_Sub23.anInt4056 < 0
		   ? Class83.method1609(Class366.aJs5Store_3087, anInt5906)
		   : Class83.method1612(Class366.aJs5Store_3087,
					Node_Sub23.anInt4056, anInt5906));
	    class83.method1599();
	    ((Node_Sub31_Sub15) this).anIntArray5905 = class83.method1606();
	    ((Node_Sub31_Sub15) this).anInt5903
		= ((Class83) class83).anInt587;
	    ((Node_Sub31_Sub15) this).anInt5904
		= ((Class83) class83).anInt590;
	    return true;
	}
	return false;
    }
    
    public Node_Sub31_Sub15() {
	super(0, false);
    }
    
    final int method871(byte argument_34_) {
	if (argument_34_ != -17)
	    return 100;
	return anInt5906;
    }
    
    final void method873(int argument_35_) {
	super.method873(argument_35_);
	((Node_Sub31_Sub15) this).anIntArray5905 = null;
    }
    
    public static void method918(byte argument) {
	aClass244_5901 = null;
    }
}
