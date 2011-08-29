/* Class213 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class213
{
    private int anInt1511;
    private int anInt1514;
    private int[][] anIntArrayArray1515;
    
    final short[] method2980(short[] argument_0_, int argument_1_) {
	if (anIntArrayArray1515 != null) {
	    int anLocalInt
		= ((int) ((long) anInt1511 * (long) argument_0_.length
			  / (long) anInt1514)
		   + 14);
	    int[] anLocalInts = new int[anLocalInt];
	    int anLocalInt_2_ = 0;
	    int anLocalInt_3_ = 0;
	    for (int anLocalInt_4_ = 0; anLocalInt_4_ < argument_0_.length;
		 anLocalInt_4_++) {
		int anLocalInt_5_ = argument_0_[anLocalInt_4_];
		int[] anLocalInts_6_ = anIntArrayArray1515[anLocalInt_3_];
		for (int anLocalInt_7_ = 0; anLocalInt_7_ < 14;
		     anLocalInt_7_++)
		    anLocalInts[anLocalInt_7_ + anLocalInt_2_]
			+= anLocalInt_5_ * anLocalInts_6_[anLocalInt_7_] >> 2;
		anLocalInt_3_ += anInt1511;
		int anLocalInt_8_ = anLocalInt_3_ / anInt1514;
		anLocalInt_2_ += anLocalInt_8_;
		anLocalInt_3_ -= anInt1514 * anLocalInt_8_;
	    }
	    argument_0_ = new short[anLocalInt];
	    for (int anLocalInt_9_ = 0; anLocalInt_9_ < anLocalInt;
		 anLocalInt_9_++) {
		int anLocalInt_10_ = anLocalInts[anLocalInt_9_] + 8192 >> 14;
		if (anLocalInt_10_ >= -32768) {
		    if (anLocalInt_10_ > 32767)
			argument_0_[anLocalInt_9_] = (short) 32767;
		    else
			argument_0_[anLocalInt_9_] = (short) anLocalInt_10_;
		} else
		    argument_0_[anLocalInt_9_] = (short) -32768;
	    }
	}
	return argument_0_;
    }
    
    static final void method2981(int argument, int argument_11_,
				 boolean argument_12_, int argument_13_,
				 int argument_14_, int argument_15_) {
	long l = (long) ((argument_12_ ? -2147483648 : 0) | argument_13_);
	Node_Sub5 class59_sub5
	    = (Node_Sub5) Class23.aJagexHashMap_153.get(l);
	if (class59_sub5 == null) {
	    class59_sub5 = new Node_Sub5();
	    Class23.aJagexHashMap_153.put(l, class59_sub5);
	}
	if (argument >= ((Node_Sub5) class59_sub5).anIntArray3897.length) {
	    int[] anLocalInts = new int[argument + 1];
	    int[] anLocalInts_16_ = new int[argument + 1];
	    for (int anLocalInt = 0;
		 (((Node_Sub5) class59_sub5).anIntArray3897.length
		  > anLocalInt);
		 anLocalInt++) {
		anLocalInts[anLocalInt]
		    = ((Node_Sub5) class59_sub5).anIntArray3897[anLocalInt];
		anLocalInts_16_[anLocalInt]
		    = ((Node_Sub5) class59_sub5).anIntArray3895[anLocalInt];
	    }
	    for (int anLocalInt
		     = ((Node_Sub5) class59_sub5).anIntArray3897.length;
		 anLocalInt < argument; anLocalInt++) {
		anLocalInts[anLocalInt] = -1;
		anLocalInts_16_[anLocalInt] = 0;
	    }
	    ((Node_Sub5) class59_sub5).anIntArray3895 = anLocalInts_16_;
	    ((Node_Sub5) class59_sub5).anIntArray3897 = anLocalInts;
	}
	((Node_Sub5) class59_sub5).anIntArray3897[argument] = argument_14_;
	((Node_Sub5) class59_sub5).anIntArray3895[argument] = argument_15_;
    }
    
    final int method2982(int argument_17_, byte argument_18_) {
	if (anIntArrayArray1515 != null)
	    argument_17_ = (int) ((long) anInt1511 * (long) argument_17_
				  / (long) anInt1514);
	return argument_17_;
    }
    
    final byte[] method2983(byte[] argument_19_, int argument_20_) {
	if (anIntArrayArray1515 != null) {
	    int anLocalInt = ((int) ((long) argument_19_.length
				     * (long) anInt1511 / (long) anInt1514)
			      + 14);
	    int[] anLocalInts = new int[anLocalInt];
	    int anLocalInt_21_ = 0;
	    int anLocalInt_22_ = 0;
	    for (int anLocalInt_23_ = 0; argument_19_.length > anLocalInt_23_;
		 anLocalInt_23_++) {
		int anLocalInt_24_ = argument_19_[anLocalInt_23_];
		int[] anLocalInts_25_ = anIntArrayArray1515[anLocalInt_22_];
		for (int anLocalInt_26_ = 0; anLocalInt_26_ < 14;
		     anLocalInt_26_++)
		    anLocalInts[anLocalInt_26_ + anLocalInt_21_]
			+= anLocalInt_24_ * anLocalInts_25_[anLocalInt_26_];
		anLocalInt_22_ += anInt1511;
		int anLocalInt_27_ = anLocalInt_22_ / anInt1514;
		anLocalInt_22_ -= anLocalInt_27_ * anInt1514;
		anLocalInt_21_ += anLocalInt_27_;
	    }
	    argument_19_ = new byte[anLocalInt];
	    for (int anLocalInt_28_ = 0; anLocalInt_28_ < anLocalInt;
		 anLocalInt_28_++) {
		int anLocalInt_29_ = anLocalInts[anLocalInt_28_] + 32768 >> 16;
		if (anLocalInt_29_ < -128)
		    argument_19_[anLocalInt_28_] = (byte) -128;
		else if (anLocalInt_29_ > 127)
		    argument_19_[anLocalInt_28_] = (byte) 127;
		else
		    argument_19_[anLocalInt_28_] = (byte) anLocalInt_29_;
	    }
	}
	return argument_19_;
    }
    
    final int method2984(byte argument_30_, int argument_31_) {
	if (anIntArrayArray1515 != null)
	    argument_31_ = (int) ((long) argument_31_ * (long) anInt1511
				  / (long) anInt1514) + 6;
	return argument_31_;
    }
    
    public static void method2985(boolean argument) {
	Applet_Sub1.gameFrame = null;
	client.gzipInflater = null;
    }
    
    Class213(int argument_32_, int argument_33_) {
	if (argument_33_ != argument_32_) {
	    int anLocalInt
		= Class138.method2467(argument_33_, (byte) 41, argument_32_);
	    argument_33_ /= anLocalInt;
	    argument_32_ /= anLocalInt;
	    anInt1514 = argument_32_;
	    anIntArrayArray1515 = new int[argument_32_][14];
	    anInt1511 = argument_33_;
	    for (int anLocalInt_34_ = 0; anLocalInt_34_ < argument_32_;
		 anLocalInt_34_++) {
		int[] anLocalInts = anIntArrayArray1515[anLocalInt_34_];
		double d
		    = (double) anLocalInt_34_ / (double) argument_32_ + 6.0;
		int anLocalInt_35_ = (int) Math.floor(d - 7.0 + 1.0);
		if (anLocalInt_35_ < 0)
		    anLocalInt_35_ = 0;
		int anLocalInt_36_ = (int) Math.ceil(d + 7.0);
		if (anLocalInt_36_ > 14)
		    anLocalInt_36_ = 14;
		double d_37_ = (double) argument_33_ / (double) argument_32_;
		for (/**/; anLocalInt_35_ < anLocalInt_36_; anLocalInt_35_++) {
		    double d_38_
			= (-d + (double) anLocalInt_35_) * 3.141592653589793;
		    double d_39_ = d_37_;
		    if (d_38_ < -1.0E-4 || d_38_ > 1.0E-4)
			d_39_ *= Math.sin(d_38_) / d_38_;
		    d_39_ *= Math.cos((-d + (double) anLocalInt_35_)
				      * 0.2243994752564138) * 0.46 + 0.54;
		    anLocalInts[anLocalInt_35_]
			= (int) Math.floor(d_39_ * 65536.0 + 0.5);
		}
	    }
	}
    }
}
