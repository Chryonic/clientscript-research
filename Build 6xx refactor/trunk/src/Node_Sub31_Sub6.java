/* Class59_Sub31_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub6 extends Node_Sub31
{
    static Class207 aClass207_5861;
    private int anInt5862 = 4;
    static int anInt5863 = -1;
    private int anInt5864 = 4;

    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (argument_0_ <= 21)
	    method867((byte) 14, 93);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Statics.anInt294 / anInt5864;
	    int anLocalInt_2_ = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 / anInt5862;
	    int[] anLocalInts_3_;
	    if (anLocalInt_2_ > 0) {
		int anLocalInt_4_ = argument_1_ % anLocalInt_2_;
		anLocalInts_3_
		    = this.method864((anLocalInt_4_
				      * DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711
				      / anLocalInt_2_),
				     0, (byte) 33);
	    } else
		anLocalInts_3_ = this.method864(0, 0, (byte) 33);
	    for (int anLocalInt_5_ = 0; Statics.anInt294 > anLocalInt_5_;
		 anLocalInt_5_++) {
		if (anLocalInt <= 0)
		    anLocalInts[anLocalInt_5_] = anLocalInts_3_[0];
		else {
		    int anLocalInt_6_ = anLocalInt_5_ % anLocalInt;
		    anLocalInts[anLocalInt_5_]
			= (anLocalInts_3_
			   [anLocalInt_6_ * Statics.anInt294 / anLocalInt]);
		}
	    }
	}
	return anLocalInts;
    }
    
    final int[][] method870(int argument_7_, byte argument_8_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 113,
							       argument_7_);
	if (argument_8_ != -9)
	    return null;
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int anLocalInt = Statics.anInt294 / anInt5864;
	    int anLocalInt_9_ = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 / anInt5862;
	    int[][] anLocalInts_10_;
	    if (anLocalInt_9_ <= 0)
		anLocalInts_10_ = this.method869(0, argument_8_ + 10, 0);
	    else {
		int anLocalInt_11_ = argument_7_ % anLocalInt_9_;
		anLocalInts_10_
		    = this.method869(0, 1, (DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711
					    * anLocalInt_11_ / anLocalInt_9_));
	    }
	    int[] anLocalInts_12_ = anLocalInts_10_[0];
	    int[] anLocalInts_13_ = anLocalInts_10_[1];
	    int[] anLocalInts_14_ = anLocalInts_10_[2];
	    int[] anLocalInts_15_ = anLocalInts[0];
	    int[] anLocalInts_16_ = anLocalInts[1];
	    int[] anLocalInts_17_ = anLocalInts[2];
	    for (int anLocalInt_18_ = 0; Statics.anInt294 > anLocalInt_18_;
		 anLocalInt_18_++) {
		int anLocalInt_19_;
		if (anLocalInt > 0) {
		    int anLocalInt_20_ = anLocalInt_18_ % anLocalInt;
		    anLocalInt_19_
			= Statics.anInt294 * anLocalInt_20_ / anLocalInt;
		} else
		    anLocalInt_19_ = 0;
		anLocalInts_15_[anLocalInt_18_]
		    = anLocalInts_12_[anLocalInt_19_];
		anLocalInts_16_[anLocalInt_18_]
		    = anLocalInts_13_[anLocalInt_19_];
		anLocalInts_17_[anLocalInt_18_]
		    = anLocalInts_14_[anLocalInt_19_];
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_21_, int argument_22_,
			 byte argument_23_) {
	int anLocalInt = argument_22_;
	do {
	    if (anLocalInt != 0) {
		if (anLocalInt != 1)
		    break;
	    } else {
		anInt5864 = argument_21_.g1();
		break;
	    }
	    anInt5862 = argument_21_.g1();
	} while (false);
	if (argument_23_ >= -41)
	    anInt5863 = -81;
    }
    
    public static void method892(int argument) {
	aClass207_5861 = null;
    }
    
    public Node_Sub31_Sub6() {
	super(1, false);
    }
    
    static {
	aClass207_5861 = new Class207(26, 7);
    }
}
