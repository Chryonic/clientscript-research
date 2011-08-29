/* Class59_Sub31_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub16 extends Node_Sub31
{
    private int anInt5907 = 1;
    static boolean[] aBooleanArray5908 = new boolean[8];
    static int anInt5909;
    static Class372 aClass372_5910;
    static boolean aBoolean5911;
    static Interface15 anInterface15_5912;
    static volatile boolean aBoolean5913 = true;
    private int anInt5914 = 1;
    
    public static void method926(int argument) {
	aBooleanArray5908 = null;
	aClass372_5910 = null;
	anInterface15_5912 = null;
    }
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = anInt5914 + 1 + anInt5914;
	    int anLocalInt_2_ = 65536 / anLocalInt;
	    int anLocalInt_3_ = anInt5907 + (anInt5907 + 1);
	    int anLocalInt_4_ = 65536 / anLocalInt_3_;
	    int[][] anLocalInts_5_ = new int[anLocalInt][];
	    for (int anLocalInt_6_ = argument_1_ - anInt5914;
		 anInt5914 + argument_1_ >= anLocalInt_6_; anLocalInt_6_++) {
		int[] anLocalInts_7_
		    = this.method864(Exception_Sub1.anInt49 & anLocalInt_6_, 0,
				     (byte) 33);
		int[] anLocalInts_8_ = new int[Statics.anInt294];
		int anLocalInt_9_ = 0;
		for (int anLocalInt_10_ = -anInt5907;
		     anInt5907 >= anLocalInt_10_; anLocalInt_10_++)
		    anLocalInt_9_
			+= anLocalInts_7_[anLocalInt_10_ & Statics.anInt1269];
		int anLocalInt_11_ = 0;
		while (anLocalInt_11_ < Statics.anInt294) {
		    anLocalInts_8_[anLocalInt_11_]
			= anLocalInt_4_ * anLocalInt_9_ >> 16;
		    anLocalInt_9_
			-= (anLocalInts_7_
			    [Statics.anInt1269 & anLocalInt_11_ - anInt5907]);
		    anLocalInt_11_++;
		    anLocalInt_9_
			+= (anLocalInts_7_
			    [Statics.anInt1269 & anLocalInt_11_ + anInt5907]);
		}
		anLocalInts_5_[-argument_1_ + anInt5914 + anLocalInt_6_]
		    = anLocalInts_8_;
	    }
	    for (int anLocalInt_12_ = 0; anLocalInt_12_ < Statics.anInt294;
		 anLocalInt_12_++) {
		int anLocalInt_13_ = 0;
		for (int anLocalInt_14_ = 0; anLocalInt > anLocalInt_14_;
		     anLocalInt_14_++)
		    anLocalInt_13_
			+= anLocalInts_5_[anLocalInt_14_][anLocalInt_12_];
		anLocalInts[anLocalInt_12_]
		    = anLocalInt_2_ * anLocalInt_13_ >> 16;
	    }
	}
	if (argument_0_ <= 21)
	    return null;
	return anLocalInts;
    }
    
    final int[][] method870(int argument_15_, byte argument_16_) {
	if (argument_16_ != -9)
	    method867((byte) 114, 36);
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 74,
							       argument_15_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int anLocalInt = anInt5914 + anInt5914 + 1;
	    int anLocalInt_17_ = 65536 / anLocalInt;
	    int anLocalInt_18_ = anInt5907 + anInt5907 + 1;
	    int anLocalInt_19_ = 65536 / anLocalInt_18_;
	    int[][][] anLocalInts_20_ = new int[anLocalInt][][];
	    for (int anLocalInt_21_ = -anInt5914 + argument_15_;
		 anLocalInt_21_ <= argument_15_ + anInt5914;
		 anLocalInt_21_++) {
		int[][] anLocalInts_22_
		    = this.method869(0, argument_16_ + 10,
				     Exception_Sub1.anInt49 & anLocalInt_21_);
		int[][] anLocalInts_23_ = new int[3][Statics.anInt294];
		int anLocalInt_24_ = 0;
		int anLocalInt_25_ = 0;
		int anLocalInt_26_ = 0;
		int[] anLocalInts_27_ = anLocalInts_22_[0];
		int[] anLocalInts_28_ = anLocalInts_22_[1];
		int[] anLocalInts_29_ = anLocalInts_22_[2];
		for (int anLocalInt_30_ = -anInt5907;
		     anLocalInt_30_ <= anInt5907; anLocalInt_30_++) {
		    int anLocalInt_31_ = Statics.anInt1269 & anLocalInt_30_;
		    anLocalInt_24_ += anLocalInts_27_[anLocalInt_31_];
		    anLocalInt_25_ += anLocalInts_28_[anLocalInt_31_];
		    anLocalInt_26_ += anLocalInts_29_[anLocalInt_31_];
		}
		int[] anLocalInts_32_ = anLocalInts_23_[0];
		int[] anLocalInts_33_ = anLocalInts_23_[1];
		int[] anLocalInts_34_ = anLocalInts_23_[2];
		int anLocalInt_35_ = 0;
		while (anLocalInt_35_ < Statics.anInt294) {
		    anLocalInts_32_[anLocalInt_35_]
			= anLocalInt_19_ * anLocalInt_24_ >> 16;
		    anLocalInts_33_[anLocalInt_35_]
			= anLocalInt_25_ * anLocalInt_19_ >> 16;
		    anLocalInts_34_[anLocalInt_35_]
			= anLocalInt_19_ * anLocalInt_26_ >> 16;
		    int anLocalInt_36_
			= Statics.anInt1269 & anLocalInt_35_ - anInt5907;
		    anLocalInt_35_++;
		    anLocalInt_26_ -= anLocalInts_29_[anLocalInt_36_];
		    anLocalInt_24_ -= anLocalInts_27_[anLocalInt_36_];
		    anLocalInt_25_ -= anLocalInts_28_[anLocalInt_36_];
		    anLocalInt_36_
			= Statics.anInt1269 & anInt5907 + anLocalInt_35_;
		    anLocalInt_24_ += anLocalInts_27_[anLocalInt_36_];
		    anLocalInt_25_ += anLocalInts_28_[anLocalInt_36_];
		    anLocalInt_26_ += anLocalInts_29_[anLocalInt_36_];
		}
		anLocalInts_20_[anLocalInt_21_ + anInt5914 - argument_15_]
		    = anLocalInts_23_;
	    }
	    int[] anLocalInts_37_ = anLocalInts[0];
	    int[] anLocalInts_38_ = anLocalInts[1];
	    int[] anLocalInts_39_ = anLocalInts[2];
	    for (int anLocalInt_40_ = 0; anLocalInt_40_ < Statics.anInt294;
		 anLocalInt_40_++) {
		int anLocalInt_41_ = 0;
		int anLocalInt_42_ = 0;
		int anLocalInt_43_ = 0;
		for (int anLocalInt_44_ = 0; anLocalInt > anLocalInt_44_;
		     anLocalInt_44_++) {
		    int[][] anLocalInts_45_ = anLocalInts_20_[anLocalInt_44_];
		    anLocalInt_41_ += anLocalInts_45_[0][anLocalInt_40_];
		    anLocalInt_43_ += anLocalInts_45_[2][anLocalInt_40_];
		    anLocalInt_42_ += anLocalInts_45_[1][anLocalInt_40_];
		}
		anLocalInts_37_[anLocalInt_40_]
		    = anLocalInt_17_ * anLocalInt_41_ >> 16;
		anLocalInts_38_[anLocalInt_40_]
		    = anLocalInt_17_ * anLocalInt_42_ >> 16;
		anLocalInts_39_[anLocalInt_40_]
		    = anLocalInt_43_ * anLocalInt_17_ >> 16;
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_46_, int argument_47_,
			 byte argument_48_) {
	int anLocalInt = argument_47_;
    while_142_:
	do {
	    do {
		if (anLocalInt != 0) {
		    if (anLocalInt != 1) {
			if (anLocalInt == 2)
			    break;
			break while_142_;
		    }
		} else {
		    anInt5907 = argument_46_.g1();
		    break while_142_;
		}
		anInt5914 = argument_46_.g1();
		break while_142_;
	    } while (false);
	    ((Node_Sub31) this).aBoolean4138
		= argument_46_.g1() == 1;
	} while (false);
	if (argument_48_ > -41)
	    method868(null, -45, (byte) 109);
    }
    
    static final void method927
	(int argument, int argument_49_, int argument_50_,
	 DoublyLinkedNodeP2_Sub2_Sub1 argument_51_, DoublyLinkedNodeP2_Sub2_Sub1 argument_52_) {
	Class148 class148 = Node_Sub9_Sub5.method675(argument, argument_49_,
            argument_50_);
	if (class148 != null) {
	    ((Class148) class148).aClass104_Sub2_Sub1_1131 = argument_51_;
	    ((Class148) class148).aClass104_Sub2_Sub1_1128 = argument_52_;
	    int anLocalInt = ((Node_Sub31_Sub5.aClass_sArray5858
			       == Class65.aClass_sArray455)
			      ? 1 : 0);
	    if (argument_51_.method1766(-105)) {
		if (argument_51_.method1772(0)) {
		    ((DoublyLinkedNodeP2_Sub2) argument_51_).aClass104_Sub2_4515
			= InputStream_Sub2.aClass104_Sub2Array36[anLocalInt];
		    InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			= argument_51_;
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_51_).aClass104_Sub2_4515
			= (Node_Sub31_Sub33.aClass104_Sub2Array6004
			   [anLocalInt]);
		    Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			= argument_51_;
		    Class18.aBoolean124 = true;
		}
	    } else {
		((DoublyLinkedNodeP2_Sub2) argument_51_).aClass104_Sub2_4515
		    = Statics.aClass104_Sub2Array851[anLocalInt];
		Statics.aClass104_Sub2Array851[anLocalInt] = argument_51_;
	    }
	    if (argument_52_ != null) {
		if (argument_52_.method1766(-122)) {
		    if (argument_52_.method1772(0)) {
			((DoublyLinkedNodeP2_Sub2) argument_52_).aClass104_Sub2_4515
			    = (InputStream_Sub2.aClass104_Sub2Array36
			       [anLocalInt]);
			InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			    = argument_52_;
		    } else {
			((DoublyLinkedNodeP2_Sub2) argument_52_).aClass104_Sub2_4515
			    = (Node_Sub31_Sub33.aClass104_Sub2Array6004
			       [anLocalInt]);
			Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			    = argument_52_;
			Class18.aBoolean124 = true;
		    }
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_52_).aClass104_Sub2_4515
			= Statics.aClass104_Sub2Array851[anLocalInt];
		    Statics.aClass104_Sub2Array851[anLocalInt] = argument_52_;
		}
	    }
	}
    }
    
    static final void method928(int argument, int argument_53_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(14, 13175, (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    public Node_Sub31_Sub16() {
	super(1, false);
    }
}
