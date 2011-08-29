/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class251
{
    static Class149 aClass149_1974;

    static final boolean method3238
	(byte argument, int argument_0_, ClipMap argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int argument_9_) {
	int anLocalInt = argument_3_;
	int anLocalInt_10_ = argument_4_;
	int anLocalInt_11_ = 64;
	int anLocalInt_12_ = 64;
	int anLocalInt_13_ = argument_3_ - anLocalInt_11_;
	Class105.anIntArrayArray863[anLocalInt_11_][anLocalInt_12_] = 99;
	int anLocalInt_14_ = -anLocalInt_12_ + argument_4_;
	Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_] = 0;
	int anLocalInt_15_ = 0;
	RuntimeException_Sub2.anIntArray3427[anLocalInt_15_] = anLocalInt;
	int anLocalInt_16_ = 0;
	Class275.anIntArray2203[anLocalInt_15_++] = anLocalInt_10_;
	int[][] anLocalInts = ((ClipMap) argument_1_).anIntArrayArray1750;
	while (anLocalInt_16_ != anLocalInt_15_) {
	    anLocalInt = RuntimeException_Sub2.anIntArray3427[anLocalInt_16_];
	    anLocalInt_10_ = Class275.anIntArray2203[anLocalInt_16_];
	    anLocalInt_11_ = -anLocalInt_13_ + anLocalInt;
	    anLocalInt_16_ = anLocalInt_16_ + 1 & 0xfff;
	    int anLocalInt_17_
		= -((ClipMap) argument_1_).anInt1743 + anLocalInt_10_;
	    int anLocalInt_18_
		= -((ClipMap) argument_1_).anInt1746 + anLocalInt;
	    anLocalInt_12_ = anLocalInt_10_ - anLocalInt_14_;
	    int anLocalInt_19_ = argument_2_;
	while_71_:
	    do {
	    while_70_:
		do {
		while_69_:
		    do {
		    while_68_:
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
						    break while_69_;
						break while_70_;
					    }
					} else
					    break;
					break while_68_;
				    }
				} else {
				    if (anLocalInt == argument_7_
					&& argument_5_ == anLocalInt_10_) {
					MenuAction.anInt6278
					    = anLocalInt;
					dba_sub_772_Sub2.anInt6367
					    = anLocalInt_10_;
					return true;
				    }
				    break while_71_;
				}
				if (DoublyLinkedNode_Sub51_Sub19.method1297(argument_9_, argument_5_, argument_7_, -1, argument_0_, anLocalInt, 1, 1, anLocalInt_10_)) {
				    dba_sub_772_Sub2.anInt6367
					= anLocalInt_10_;
				    MenuAction.anInt6278 = anLocalInt;
				    return true;
				}
				break while_71_;
			    } while (false);
			    if (argument_1_.method3131(argument_7_, anLocalInt,
						       1, argument_9_, -1,
						       argument_5_,
						       anLocalInt_10_, 1,
						       argument_8_,
						       argument_0_)) {
				dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
				MenuAction.anInt6278 = anLocalInt;
				return true;
			    }
			    break while_71_;
			} while (false);
			if (argument_1_.method3137(anLocalInt_10_, argument_9_,
						   argument_0_, argument_8_,
						   argument_7_, anLocalInt,
						   -104, argument_5_, 1)) {
			    MenuAction.anInt6278 = anLocalInt;
			    dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
			    return true;
			}
			break while_71_;
		    } while (false);
		    if (argument_1_.method3132(argument_2_, argument_5_,
					       (byte) 14, anLocalInt_10_,
					       argument_7_, 1, argument_6_,
					       anLocalInt)) {
			MenuAction.anInt6278 = anLocalInt;
			dba_sub_772_Sub2.anInt6367 = anLocalInt_10_;
			return true;
		    }
		    break while_71_;
		} while (false);
		if (argument_1_.method3140(argument_6_, argument_7_,
					   anLocalInt, argument_2_,
					   anLocalInt_10_, argument_5_, 1,
					   (byte) -82)) {
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
		&& (anLocalInts[anLocalInt_18_ - 1][anLocalInt_17_]
		    & 0x42240000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt - 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class105.anIntArrayArray863[anLocalInt_11_ - 1][anLocalInt_12_]
		    = 2;
		Class60.anIntArrayArray432[anLocalInt_11_ - 1][anLocalInt_12_]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ < 127
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_]) == 0
		&& (anLocalInts[anLocalInt_18_ + 1][anLocalInt_17_]
		    & 0x60240000) == 0) {
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
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ - 1]
		    & 0x40a40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ - 1;
		Class105.anIntArrayArray863[anLocalInt_11_][anLocalInt_12_ - 1]
		    = 1;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_][anLocalInt_12_ - 1]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_12_ < 127
		&& (Class105.anIntArrayArray863[anLocalInt_11_]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ + 1]
		    & 0x48240000) == 0) {
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
		&& (anLocalInts[anLocalInt_18_ - 1][anLocalInt_17_ - 1]
		    & 0x43a40000) == 0
		&& (anLocalInts[anLocalInt_18_ - 1][anLocalInt_17_]
		    & 0x42240000) == 0
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ - 1]
		    & 0x40a40000) == 0) {
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
	    if (anLocalInt_11_ < 127 && anLocalInt_12_ > 0
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_ - 1]) == 0
		&& (anLocalInts[anLocalInt_18_ + 1][anLocalInt_17_ - 1]
		    & 0x60e40000) == 0
		&& (anLocalInts[anLocalInt_18_ + 1][anLocalInt_17_]
		    & 0x60240000) == 0
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ - 1]
		    & 0x40a40000) == 0) {
		RuntimeException_Sub2.anIntArray3427[anLocalInt_15_]
		    = anLocalInt + 1;
		Class275.anIntArray2203[anLocalInt_15_] = anLocalInt_10_ - 1;
		Class105.anIntArrayArray863[anLocalInt_11_ + 1][(anLocalInt_12_
								 - 1)]
		    = 9;
		anLocalInt_15_ = anLocalInt_15_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_11_ + 1][(anLocalInt_12_
								- 1)]
		    = anLocalInt_19_;
	    }
	    if (anLocalInt_11_ > 0 && anLocalInt_12_ < 127
		&& (Class105.anIntArrayArray863[anLocalInt_11_ - 1]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_18_ - 1][anLocalInt_17_ + 1]
		    & 0x4e240000) == 0
		&& (anLocalInts[anLocalInt_18_ - 1][anLocalInt_17_]
		    & 0x42240000) == 0
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ + 1]
		    & 0x48240000) == 0) {
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
	    if (anLocalInt_11_ < 127 && anLocalInt_12_ < 127
		&& (Class105.anIntArrayArray863[anLocalInt_11_ + 1]
		    [anLocalInt_12_ + 1]) == 0
		&& (anLocalInts[anLocalInt_18_ + 1][anLocalInt_17_ + 1]
		    & 0x78240000) == 0
		&& (anLocalInts[anLocalInt_18_ + 1][anLocalInt_17_]
		    & 0x60240000) == 0
		&& (anLocalInts[anLocalInt_18_][anLocalInt_17_ + 1]
		    & 0x48240000) == 0) {
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
    
    static final void method3239
	(int argument, int argument_20_, int argument_21_, int argument_22_,
	 int argument_23_, int argument_24_, int argument_25_,
	 int argument_26_, int argument_27_, int argument_28_) {
	if (argument_21_ != argument_23_ || argument != argument_28_
	    || argument_20_ != argument_25_ || argument_22_ != argument_27_) {
	    int anLocalInt = argument_21_;
	    int anLocalInt_29_ = argument_28_;
	    int anLocalInt_30_ = argument_21_ * 3;
	    int anLocalInt_31_ = argument_28_ * 3;
	    int anLocalInt_32_ = argument_23_ * 3;
	    int anLocalInt_33_ = argument * 3;
	    int anLocalInt_34_ = argument_25_ * 3;
	    int anLocalInt_35_ = argument_22_ * 3;
	    int anLocalInt_36_
		= (-argument_21_ + (argument_20_ - anLocalInt_34_)
		   + anLocalInt_32_);
	    int anLocalInt_37_
		= (-argument_28_
		   + (anLocalInt_33_ + (-anLocalInt_35_ + argument_27_)));
	    int anLocalInt_38_
		= (anLocalInt_30_
		   + (-anLocalInt_32_ + anLocalInt_34_ - anLocalInt_32_));
	    int anLocalInt_39_ = (anLocalInt_31_ - anLocalInt_33_
				  + (anLocalInt_35_ - anLocalInt_33_));
	    int anLocalInt_40_ = -anLocalInt_30_ + anLocalInt_32_;
	    int anLocalInt_41_ = anLocalInt_33_ - anLocalInt_31_;
	    for (int anLocalInt_42_ = 128; anLocalInt_42_ <= 4096;
		 anLocalInt_42_ += 128) {
		int anLocalInt_43_ = anLocalInt_42_ * anLocalInt_42_ >> 12;
		int anLocalInt_44_ = anLocalInt_42_ * anLocalInt_43_ >> 12;
		int anLocalInt_45_ = anLocalInt_44_ * anLocalInt_36_;
		int anLocalInt_46_ = anLocalInt_37_ * anLocalInt_44_;
		int anLocalInt_47_ = anLocalInt_43_ * anLocalInt_38_;
		int anLocalInt_48_ = anLocalInt_43_ * anLocalInt_39_;
		int anLocalInt_49_ = anLocalInt_40_ * anLocalInt_42_;
		int anLocalInt_50_ = anLocalInt_41_ * anLocalInt_42_;
		int anLocalInt_51_
		    = (argument_21_
		       + (anLocalInt_45_ + anLocalInt_47_ + anLocalInt_49_
			  >> 12));
		int anLocalInt_52_
		    = ((anLocalInt_46_ + anLocalInt_48_ + anLocalInt_50_ >> 12)
		       + argument_28_);
		Class_s.method3532(argument_26_, true, anLocalInt_29_,
				   anLocalInt_52_, anLocalInt_51_, anLocalInt);
		anLocalInt = anLocalInt_51_;
		anLocalInt_29_ = anLocalInt_52_;
	    }
	} else
	    Class_s.method3532(argument_26_, true, argument_28_, argument_27_,
			       argument_20_, argument_21_);
    }
    
    static final void method3240(boolean argument) {
	if (argument)
	    method3241(-116);
	FileOnDisk fileOnDisk = null;
	try {
	    SignlinkRequest signlinkRequest
		= Applet_Sub1.baseSignlink.requestPreferencesFile("", true);
	    while (signlinkRequest.status == 0)
		Timing.sleep(1L);
	    if (signlinkRequest.status == 1) {
		fileOnDisk = (FileOnDisk) signlinkRequest.result;
		Packet class59_sub28
		    = AthmosphericConditions.aClass59_Sub50_116.method1158((byte) -10);
		fileOnDisk.write((((Packet) class59_sub28)
         .data), 0,
                ((Packet) class59_sub28).pos);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (fileOnDisk == null)
		    break;
		fileOnDisk.close();
	    } catch (Exception exception) {
		/* empty */
	    }
	    break;
	} while (false);
    }
    
    public static void method3241(int argument) {
	aClass149_1974 = null;
	GraphicsToolkit_Sub2_Sub1.matrixBuffer = null;
    }
    
    static final void method3242(byte argument, int[] argument_53_,
				 Object[] argument_54_) {
	Class51.method468(argument_53_, 0, argument_54_, 62,
			  argument_53_.length - 1);
    }
    
    static final void method3243(Node_Sub29 argument,
				 boolean argument_55_) {
	if (argument_55_ != true)
	    method3241(-98);
	DoublyLinkedNodeP2_Sub3.aCyclicLinkedList_4521.add(argument);
	((Node_Sub29) argument).anInt4131
	    = ((Packet)
	       ((Node_Sub29) argument).aClass59_Sub28_Sub1_4129).pos;
	((Packet) ((Node_Sub29) argument).aClass59_Sub28_Sub1_4129)
	    .pos
	    = 0;
	Node_Sub47_Sub3.anInt6164 += ((Node_Sub29) argument).anInt4131;
    }
    
    static {
	aClass149_1974 = new Class149(20);
    }
}
