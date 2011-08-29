/* Class59_Sub31_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub12 extends Node_Sub31
{
    static SignlinkRequest aSignlinkRequest_5894;
    private int anInt5895 = 32768;
    
    public Node_Sub31_Sub12() {
	super(3, false);
    }
    
    final void method865(boolean argument_0_) {
	Class344.method3799(argument_0_);
    }
    
    final int[] method867(byte argument_1_, int argument_2_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_2_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[] anLocalInts_3_ = this.method864(argument_2_, 1, (byte) 33);
	    int[] anLocalInts_4_ = this.method864(argument_2_, 2, (byte) 33);
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		int anLocalInt_5_ = (anLocalInts_3_[anLocalInt] & 0xff9) >> 4;
		int anLocalInt_6_
		    = anInt5895 * anLocalInts_4_[anLocalInt] >> 12;
		int anLocalInt_7_
		    = ((anLocalInt_6_
			* Class62_Sub7.anIntArray4392[anLocalInt_5_])
		       >> 12);
		int anLocalInt_8_
		    = ((anLocalInt_6_
			* FloatPacket.anIntArray5834[anLocalInt_5_])
		       >> 12);
		int anLocalInt_9_
		    = Statics.anInt1269 & anLocalInt + (anLocalInt_7_ >> 12);
		int anLocalInt_10_ = (Exception_Sub1.anInt49
				      & (anLocalInt_8_ >> 12) + argument_2_);
		int[] anLocalInts_11_
		    = this.method864(anLocalInt_10_, 0, (byte) 33);
		anLocalInts[anLocalInt] = anLocalInts_11_[anLocalInt_9_];
	    }
	}
	if (argument_1_ < 21)
	    aSignlinkRequest_5894 = null;
	return anLocalInts;
    }
    
    static final void method912(int argument) {
	Class105.anInt861 = argument;
	Class131.aClass169Array1059 = new Class169[50];
    }
    
    public static void method913(byte argument) {
	aSignlinkRequest_5894 = null;
    }
    
    final int[][] method870(int argument_12_, byte argument_13_) {
	if (argument_13_ != -9)
	    method913((byte) -95);
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 114,
							       argument_12_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int[] anLocalInts_14_ = this.method864(argument_12_, 1, (byte) 33);
	    int[] anLocalInts_15_ = this.method864(argument_12_, 2, (byte) 33);
	    int[] anLocalInts_16_ = anLocalInts[0];
	    int[] anLocalInts_17_ = anLocalInts[1];
	    int[] anLocalInts_18_ = anLocalInts[2];
	    for (int anLocalInt = 0; anLocalInt < Statics.anInt294;
		 anLocalInt++) {
		int anLocalInt_19_
		    = (anLocalInts_14_[anLocalInt] * 255 & 0xff5d5) >> 12;
		int anLocalInt_20_
		    = anInt5895 * anLocalInts_15_[anLocalInt] >> 12;
		int anLocalInt_21_
		    = ((Class62_Sub7.anIntArray4392[anLocalInt_19_]
			* anLocalInt_20_)
		       >> 12);
		int anLocalInt_22_
		    = ((anLocalInt_20_
			* FloatPacket.anIntArray5834[anLocalInt_19_])
		       >> 12);
		int anLocalInt_23_
		    = anLocalInt + (anLocalInt_21_ >> 12) & Statics.anInt1269;
		int anLocalInt_24_ = (Exception_Sub1.anInt49
				      & (anLocalInt_22_ >> 12) + argument_12_);
		int[][] anLocalInts_25_ = this.method869(0, 1, anLocalInt_24_);
		anLocalInts_16_[anLocalInt]
		    = anLocalInts_25_[0][anLocalInt_23_];
		anLocalInts_17_[anLocalInt]
		    = anLocalInts_25_[1][anLocalInt_23_];
		anLocalInts_18_[anLocalInt]
		    = anLocalInts_25_[2][anLocalInt_23_];
	    }
	}
	return anLocalInts;
    }
    
    final void method868(Packet argument_26_, int argument_27_,
			 byte argument_28_) {
	int anLocalInt = argument_27_;
	do {
	    if (anLocalInt != 0) {
		if (anLocalInt != 1)
		    break;
	    } else {
		anInt5895 = argument_26_.g2() << 4;
		break;
	    }
	    ((Node_Sub31) this).aBoolean4138
		= argument_26_.g1() == 1;
	} while (false);
	if (argument_28_ > -41)
	    aSignlinkRequest_5894 = null;
    }
}
