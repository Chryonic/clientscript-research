/* dba_sub_772_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

final class dba_sub_772_Sub1 extends dba_sub_772
{
    static Class166 aClass166_6362 = new Class166(16, -2);
    NativeHeap aNativeHeap6363;
    
    final void method1308(byte argument_0_) {
	((dba_sub_772_Sub1) this).aNativeHeap6363.safeDeallocate();
    }
    
    static final void method1309(int argument, int argument_1_,
				 int argument_2_, int argument_3_,
				 int argument_4_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument_1_, 13175,
            (long) argument);
	class59_sub51_sub3.method1182(-78);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_2_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_4_;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6234 = argument_3_;
    }
    
    static final void method1310
	(int argument, int argument_5_, int argument_6_, int argument_7_,
	 boolean argument_8_, int argument_9_, int argument_10_) {
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub22_4298.method1446(70) != 0
	    && argument != 0 && Class105.anInt861 < 50 && argument_10_ != -1)
	    Class131.aClass169Array1059[Class105.anInt861++]
		= new Class169((byte) 1, argument_10_, argument, argument_7_,
			       argument_5_, argument_9_, argument_6_, null);
    }
    
    public static void method1311(int argument) {
	aClass166_6362 = null;
    }
    
    static final boolean method1312
	(int argument, int argument_11_, int argument_12_, int argument_13_,
	 int argument_14_, ClipMap argument_15_, int argument_16_,
	 int argument_17_, int argument_18_, int argument_19_,
	 int argument_20_, int argument_21_) {
	int anLocalInt = argument_19_;
	int anLocalInt_22_ = argument;
	int anLocalInt_23_ = 64;
	int anLocalInt_24_ = 64;
	int anLocalInt_25_ = argument_19_ - anLocalInt_23_;
	Class105.anIntArrayArray863[anLocalInt_23_][anLocalInt_24_] = 99;
	int anLocalInt_26_ = -anLocalInt_24_ + argument;
	Class60.anIntArrayArray432[anLocalInt_23_][anLocalInt_24_] = 0;
	int anLocalInt_27_ = 0;
	int anLocalInt_28_ = argument_17_;
	RuntimeException_Sub2.anIntArray3427[anLocalInt_27_] = anLocalInt;
	Class275.anIntArray2203[anLocalInt_27_++] = anLocalInt_22_;
	int[][] anLocalInts = ((ClipMap) argument_15_).anIntArrayArray1750;
    while_242_:
	while (anLocalInt_27_ != anLocalInt_28_) {
	    anLocalInt = RuntimeException_Sub2.anIntArray3427[anLocalInt_28_];
	    anLocalInt_22_ = Class275.anIntArray2203[anLocalInt_28_];
	    anLocalInt_23_ = -anLocalInt_25_ + anLocalInt;
	    anLocalInt_24_ = -anLocalInt_26_ + anLocalInt_22_;
	    anLocalInt_28_ = anLocalInt_28_ + 1 & 0xfff;
	    int anLocalInt_29_
		= anLocalInt - ((ClipMap) argument_15_).anInt1746;
	    int anLocalInt_30_
		= -((ClipMap) argument_15_).anInt1743 + anLocalInt_22_;
	    int anLocalInt_31_ = argument_14_;
	while_234_:
	    do {
	    while_233_:
		do {
		while_232_:
		    do {
		    while_231_:
			do {
			    do {
				if (anLocalInt_31_ != -4) {
				    if (anLocalInt_31_ != -3) {
					if (anLocalInt_31_ != -2) {
					    if (anLocalInt_31_ != -1) {
						if (anLocalInt_31_ == 0
						    || anLocalInt_31_ == 1
						    || anLocalInt_31_ == 2
						    || anLocalInt_31_ == 3
						    || anLocalInt_31_ == 9)
						    break while_232_;
						break while_233_;
					    }
					} else
					    break;
					break while_231_;
				    }
				} else {
				    if (argument_13_ == anLocalInt
					&& anLocalInt_22_ == argument_12_) {
					dba_sub_772_Sub2.anInt6367
					    = anLocalInt_22_;
					MenuAction.anInt6278
					    = anLocalInt;
					return true;
				    }
				    break while_234_;
				}
				if (DoublyLinkedNode_Sub51_Sub19.method1297(argument_20_, argument_12_, argument_13_, -1, argument_21_, anLocalInt, argument_18_, argument_18_, anLocalInt_22_)) {
				    dba_sub_772_Sub2.anInt6367
					= anLocalInt_22_;
				    MenuAction.anInt6278 = anLocalInt;
				    return true;
				}
				break while_234_;
			    } while (false);
			    if (argument_15_.method3131(argument_13_,
							anLocalInt,
							argument_18_,
							argument_20_, -1,
							argument_12_,
							anLocalInt_22_,
							argument_18_,
							argument_16_,
							argument_21_)) {
				MenuAction.anInt6278 = anLocalInt;
				dba_sub_772_Sub2.anInt6367 = anLocalInt_22_;
				return true;
			    }
			    break while_234_;
			} while (false);
			if (argument_15_.method3137(anLocalInt_22_,
						    argument_20_, argument_21_,
						    argument_16_, argument_13_,
						    anLocalInt,
						    argument_17_ - 118,
						    argument_12_,
						    argument_18_)) {
			    dba_sub_772_Sub2.anInt6367 = anLocalInt_22_;
			    MenuAction.anInt6278 = anLocalInt;
			    return true;
			}
			break while_234_;
		    } while (false);
		    if (argument_15_.method3132(argument_14_, argument_12_,
						(byte) 122, anLocalInt_22_,
						argument_13_, argument_18_,
						argument_11_, anLocalInt)) {
			MenuAction.anInt6278 = anLocalInt;
			dba_sub_772_Sub2.anInt6367 = anLocalInt_22_;
			return true;
		    }
		    break while_234_;
		} while (false);
		if (argument_15_.method3140(argument_11_, argument_13_,
					    anLocalInt, argument_14_,
					    anLocalInt_22_, argument_12_,
					    argument_18_, (byte) -127)) {
		    dba_sub_772_Sub2.anInt6367 = anLocalInt_22_;
		    MenuAction.anInt6278 = anLocalInt;
		    return true;
		}
	    } while (false);
	    anLocalInt_31_
		= (Class60.anIntArrayArray432[anLocalInt_23_][anLocalInt_24_]
		   + 1);
	while_235_:
	    do {
		if (anLocalInt_23_ > 0
		    && (Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_]) == 0
		    && (anLocalInts[anLocalInt_29_ - 1][anLocalInt_30_]
			& 0x43a40000) == 0
		    && ((anLocalInts[anLocalInt_29_ - 1]
			 [anLocalInt_30_ + (argument_18_ - 1)])
			& 0x4e240000) == 0) {
		    for (int anLocalInt_32_ = 1;
			 anLocalInt_32_ < argument_18_ - 1; anLocalInt_32_++) {
			if (((anLocalInts[anLocalInt_29_ - 1]
			      [anLocalInt_30_ + anLocalInt_32_])
			     & 0x4fa40000)
			    != 0)
			    break while_235_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt - 1;
		    Class275.anIntArray2203[anLocalInt_27_] = anLocalInt_22_;
		    Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_]
			= 2;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class60.anIntArrayArray432[anLocalInt_23_ - 1]
			[anLocalInt_24_]
			= anLocalInt_31_;
		}
	    } while (false);
	while_236_:
	    do {
		if (128 - argument_18_ > anLocalInt_23_
		    && (Class105.anIntArrayArray863[anLocalInt_23_ + 1]
			[anLocalInt_24_]) == 0
		    && ((anLocalInts[anLocalInt_29_ + argument_18_]
			 [anLocalInt_30_])
			& 0x60e40000) == 0
		    && ((anLocalInts[argument_18_ + anLocalInt_29_]
			 [anLocalInt_30_ - 1 + argument_18_])
			& 0x78240000) == 0) {
		    for (int anLocalInt_33_ = 1;
			 argument_18_ - 1 > anLocalInt_33_; anLocalInt_33_++) {
			if (((anLocalInts[anLocalInt_29_ + argument_18_]
			      [anLocalInt_33_ + anLocalInt_30_])
			     & 0x78e40000)
			    != 0)
			    break while_236_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt + 1;
		    Class275.anIntArray2203[anLocalInt_27_] = anLocalInt_22_;
		    Class105.anIntArrayArray863[anLocalInt_23_ + 1]
			[anLocalInt_24_]
			= 8;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class60.anIntArrayArray432[anLocalInt_23_ + 1]
			[anLocalInt_24_]
			= anLocalInt_31_;
		}
	    } while (false);
	while_237_:
	    do {
		if (anLocalInt_24_ > 0
		    && (Class105.anIntArrayArray863[anLocalInt_23_]
			[anLocalInt_24_ - 1]) == 0
		    && (anLocalInts[anLocalInt_29_][anLocalInt_30_ - 1]
			& 0x43a40000) == 0
		    && ((anLocalInts[anLocalInt_29_ + (argument_18_ - 1)]
			 [anLocalInt_30_ - 1])
			& 0x60e40000) == 0) {
		    for (int anLocalInt_34_ = 1;
			 argument_18_ - 1 > anLocalInt_34_; anLocalInt_34_++) {
			if (((anLocalInts[anLocalInt_34_ + anLocalInt_29_]
			      [anLocalInt_30_ - 1])
			     & 0x63e40000)
			    != 0)
			    break while_237_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt;
		    Class275.anIntArray2203[anLocalInt_27_]
			= anLocalInt_22_ - 1;
		    Class105.anIntArrayArray863[anLocalInt_23_][(anLocalInt_24_
								 - 1)]
			= 1;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class60.anIntArrayArray432[anLocalInt_23_][(anLocalInt_24_
								- 1)]
			= anLocalInt_31_;
		}
	    } while (false);
	while_238_:
	    do {
		if (anLocalInt_24_ < -argument_18_ + 128
		    && (Class105.anIntArrayArray863[anLocalInt_23_]
			[anLocalInt_24_ + 1]) == 0
		    && ((anLocalInts[anLocalInt_29_]
			 [anLocalInt_30_ + argument_18_])
			& 0x4e240000) == 0
		    && ((anLocalInts[anLocalInt_29_ + argument_18_ - 1]
			 [argument_18_ + anLocalInt_30_])
			& 0x78240000) == 0) {
		    for (int anLocalInt_35_ = 1;
			 argument_18_ - 1 > anLocalInt_35_; anLocalInt_35_++) {
			if (((anLocalInts[anLocalInt_29_ + anLocalInt_35_]
			      [argument_18_ + anLocalInt_30_])
			     & 0x7e240000)
			    != 0)
			    break while_238_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt;
		    Class275.anIntArray2203[anLocalInt_27_]
			= anLocalInt_22_ + 1;
		    Class105.anIntArrayArray863[anLocalInt_23_][(anLocalInt_24_
								 + 1)]
			= 4;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class60.anIntArrayArray432[anLocalInt_23_][(anLocalInt_24_
								+ 1)]
			= anLocalInt_31_;
		}
	    } while (false);
	while_239_:
	    do {
		if (anLocalInt_23_ > 0 && anLocalInt_24_ > 0
		    && (Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_ - 1]) == 0
		    && (anLocalInts[anLocalInt_29_ - 1][anLocalInt_30_ - 1]
			& 0x43a40000) == 0) {
		    for (int anLocalInt_36_ = 1; anLocalInt_36_ < argument_18_;
			 anLocalInt_36_++) {
			if (((anLocalInts[anLocalInt_29_ - 1]
			      [anLocalInt_30_ + anLocalInt_36_ - 1])
			     & 0x4fa40000) != 0
			    || ((anLocalInts
				 [anLocalInt_29_ - (-anLocalInt_36_ + 1)]
				 [anLocalInt_30_ - 1])
				& 0x63e40000) != 0)
			    break while_239_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt - 1;
		    Class275.anIntArray2203[anLocalInt_27_]
			= anLocalInt_22_ - 1;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_ - 1]
			= 3;
		    Class60.anIntArrayArray432[anLocalInt_23_ - 1]
			[anLocalInt_24_ - 1]
			= anLocalInt_31_;
		}
	    } while (false);
	while_240_:
	    do {
		if (anLocalInt_23_ < -argument_18_ + 128 && anLocalInt_24_ > 0
		    && (Class105.anIntArrayArray863[anLocalInt_23_ + 1]
			[anLocalInt_24_ - 1]) == 0
		    && ((anLocalInts[argument_18_ + anLocalInt_29_]
			 [anLocalInt_30_ - 1])
			& 0x60e40000) == 0) {
		    for (int anLocalInt_37_ = 1; argument_18_ > anLocalInt_37_;
			 anLocalInt_37_++) {
			if (((anLocalInts[argument_18_ + anLocalInt_29_]
			      [anLocalInt_37_ + (anLocalInt_30_ - 1)])
			     & 0x78e40000) != 0
			    || ((anLocalInts[anLocalInt_29_ + anLocalInt_37_]
				 [anLocalInt_30_ - 1])
				& 0x63e40000) != 0)
			    break while_240_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt + 1;
		    Class275.anIntArray2203[anLocalInt_27_]
			= anLocalInt_22_ - 1;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class105.anIntArrayArray863[anLocalInt_23_ + 1]
			[anLocalInt_24_ - 1]
			= 9;
		    Class60.anIntArrayArray432[anLocalInt_23_ + 1]
			[anLocalInt_24_ - 1]
			= anLocalInt_31_;
		}
	    } while (false);
	while_241_:
	    do {
		if (anLocalInt_23_ > 0 && anLocalInt_24_ < -argument_18_ + 128
		    && (Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_ + 1]) == 0
		    && ((anLocalInts[anLocalInt_29_ - 1]
			 [anLocalInt_30_ + argument_18_])
			& 0x4e240000) == 0) {
		    for (int anLocalInt_38_ = 1; anLocalInt_38_ < argument_18_;
			 anLocalInt_38_++) {
			if (((anLocalInts[anLocalInt_29_ - 1]
			      [anLocalInt_38_ + anLocalInt_30_])
			     & 0x4fa40000) != 0
			    || ((anLocalInts
				 [anLocalInt_38_ + (anLocalInt_29_ - 1)]
				 [anLocalInt_30_ + argument_18_])
				& 0x7e240000) != 0)
			    break while_241_;
		    }
		    RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
			= anLocalInt - 1;
		    Class275.anIntArray2203[anLocalInt_27_]
			= anLocalInt_22_ + 1;
		    anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		    Class105.anIntArrayArray863[anLocalInt_23_ - 1]
			[anLocalInt_24_ + 1]
			= 6;
		    Class60.anIntArrayArray432[anLocalInt_23_ - 1]
			[anLocalInt_24_ + 1]
			= anLocalInt_31_;
		}
	    } while (false);
	    if (-argument_18_ + 128 > anLocalInt_23_
		&& 128 - argument_18_ > anLocalInt_24_
		&& (Class105.anIntArrayArray863[anLocalInt_23_ + 1]
		    [anLocalInt_24_ + 1]) == 0
		&& ((anLocalInts[argument_18_ + anLocalInt_29_]
		     [anLocalInt_30_ + argument_18_])
		    & 0x78240000) == 0) {
		for (int anLocalInt_39_ = 1; argument_18_ > anLocalInt_39_;
		     anLocalInt_39_++) {
		    if (((anLocalInts[anLocalInt_29_ + anLocalInt_39_]
			  [argument_18_ + anLocalInt_30_])
			 & 0x7e240000) != 0
			|| ((anLocalInts[anLocalInt_29_ + argument_18_]
			     [anLocalInt_39_ + anLocalInt_30_])
			    & 0x78e40000) != 0)
			continue while_242_;
		}
		RuntimeException_Sub2.anIntArray3427[anLocalInt_27_]
		    = anLocalInt + 1;
		Class275.anIntArray2203[anLocalInt_27_] = anLocalInt_22_ + 1;
		Class105.anIntArrayArray863[anLocalInt_23_ + 1][(anLocalInt_24_
								 + 1)]
		    = 12;
		anLocalInt_27_ = anLocalInt_27_ + 1 & 0xfff;
		Class60.anIntArrayArray432[anLocalInt_23_ + 1][(anLocalInt_24_
								+ 1)]
		    = anLocalInt_31_;
	    }
	}
	MenuAction.anInt6278 = anLocalInt;
	dba_sub_772_Sub2.anInt6367 = anLocalInt_22_;
	return false;
    }
    
    dba_sub_772_Sub1(int argument_40_) {
	((dba_sub_772_Sub1) this).aNativeHeap6363
	    = new NativeHeap(argument_40_);
    }
}
