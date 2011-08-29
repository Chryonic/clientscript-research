/* Class59_Sub31_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub17 extends Node_Sub31
{
    static Class366[] aClass366Array5915 = new Class366[5];
    
    static final void method929(int argument, int argument_0_, int argument_1_,
				boolean argument_2_, int argument_3_,
				int argument_4_, int argument_5_,
				String argument_6_) {
	DoublyLinkedNodeP2_Sub8 class104_sub8 = new DoublyLinkedNodeP2_Sub8();
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4583 = argument_5_;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4576 = argument_4_;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).aString4578 = argument_6_;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4577 = argument_1_;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4579 = argument_0_;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4580
	    = Class333.anInt2720 + argument;
	((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4575 = argument_3_;
	Node_Sub49.aClass366_4290.method3983(class104_sub8, (byte) 119);
    }
    
    public Node_Sub31_Sub17() {
	super(3, false);
    }
    
    final int[] method867(byte argument_7_, int argument_8_) {
	if (argument_7_ < 21)
	    aClass366Array5915 = null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_8_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_9_ = this.method864(argument_8_, 0, (byte) 33);
	    int[] anLocalInts_10_ = this.method864(argument_8_, 1, (byte) 33);
	    int[] anLocalInts_11_ = this.method864(argument_8_, 2, (byte) 33);
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		int anLocalInt_12_ = anLocalInts_11_[anLocalInt];
		if (anLocalInt_12_ != 4096) {
		    if (anLocalInt_12_ == 0)
			anLocalInts[anLocalInt] = anLocalInts_10_[anLocalInt];
		    else
			anLocalInts[anLocalInt]
			    = (anLocalInt_12_ * anLocalInts_9_[anLocalInt]
			       + ((-anLocalInt_12_ + 4096)
				  * anLocalInts_10_[anLocalInt])) >> 12;
		} else
		    anLocalInts[anLocalInt] = anLocalInts_9_[anLocalInt];
	    }
	}
	return anLocalInts;
    }
    
    static final void method930(GraphicsToolkit argument, byte argument_13_) {
	if (!Class344.aBoolean3593)
	    Class348.method3816(argument, 18075);
	else
	    Class163.method2622(argument, -16777216);
    }
    
    final void method868(Packet argument_14_, int argument_15_,
			 byte argument_16_) {
	if (argument_15_ == 0)
	    ((Node_Sub31) this).aBoolean4138
		= argument_14_.g1() == 1;
	if (argument_16_ > -41) {
	    /* empty */
	}
    }
    
    final int[][] method870(int argument_17_, byte argument_18_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 117,
							       argument_17_);
	if (argument_18_ != -9)
	    aClass366Array5915 = null;
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_19_ = this.method864(argument_17_, 2, (byte) 33);
	    int[][] anLocalInts_20_ = this.method869(0, 1, argument_17_);
	    int[][] anLocalInts_21_ = this.method869(1, 1, argument_17_);
	    int[] anLocalInts_22_ = anLocalInts[0];
	    int[] anLocalInts_23_ = anLocalInts[1];
	    int[] anLocalInts_24_ = anLocalInts[2];
	    int[] anLocalInts_25_ = anLocalInts_20_[0];
	    int[] anLocalInts_26_ = anLocalInts_20_[1];
	    int[] anLocalInts_27_ = anLocalInts_20_[2];
	    int[] anLocalInts_28_ = anLocalInts_21_[0];
	    int[] anLocalInts_29_ = anLocalInts_21_[1];
	    int[] anLocalInts_30_ = anLocalInts_21_[2];
	    for (int anLocalInt = 0; Statics.anInt294 > anLocalInt;
		 anLocalInt++) {
		int anLocalInt_31_ = anLocalInts_19_[anLocalInt];
		if (anLocalInt_31_ != 4096) {
		    if (anLocalInt_31_ != 0) {
			int anLocalInt_32_ = -anLocalInt_31_ + 4096;
			anLocalInts_22_[anLocalInt]
			    = ((anLocalInt_32_ * anLocalInts_28_[anLocalInt]
				+ anLocalInt_31_ * anLocalInts_25_[anLocalInt])
			       >> 12);
			anLocalInts_23_[anLocalInt]
			    = ((anLocalInt_31_ * anLocalInts_26_[anLocalInt]
				+ anLocalInts_29_[anLocalInt] * anLocalInt_32_)
			       >> 12);
			anLocalInts_24_[anLocalInt]
			    = ((anLocalInt_31_ * anLocalInts_27_[anLocalInt]
				+ anLocalInts_30_[anLocalInt] * anLocalInt_32_)
			       >> 12);
		    } else {
			anLocalInts_22_[anLocalInt]
			    = anLocalInts_28_[anLocalInt];
			anLocalInts_23_[anLocalInt]
			    = anLocalInts_29_[anLocalInt];
			anLocalInts_24_[anLocalInt]
			    = anLocalInts_30_[anLocalInt];
		    }
		} else {
		    anLocalInts_22_[anLocalInt] = anLocalInts_25_[anLocalInt];
		    anLocalInts_23_[anLocalInt] = anLocalInts_26_[anLocalInt];
		    anLocalInts_24_[anLocalInt] = anLocalInts_27_[anLocalInt];
		}
	    }
	}
	return anLocalInts;
    }
    
    public static void method931(int argument) {
	aClass366Array5915 = null;
    }
    
    static final int method932(int argument) {
	if (Class50.anInt365 == 1)
	    return Class189_Sub3.anInt5647;
	return Class353_Sub9.anInt5523;
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < aClass366Array5915.length;
	     anLocalInt++)
	    aClass366Array5915[anLocalInt] = new Class366();
    }
}
