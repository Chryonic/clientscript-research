/* Class386 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class386
{
    int anInt3261;
    private float[][] aFloatArrayArray3262;
    private int anInt3263;
    private int[] anIntArray3264;
    private int[] anIntArray3265;
    private int[] anIntArray3266;
    
    final int method4124() {
	int anLocalInt;
	for (anLocalInt = 0; anIntArray3266[anLocalInt] >= 0;
	     anLocalInt = (Node_Sub25.method754() != 0
			   ? anIntArray3266[anLocalInt] : anLocalInt + 1)) {
	    /* empty */
	}
	return anIntArray3266[anLocalInt] ^ 0xffffffff;
    }
    
    private static final int method4125(int argument, int argument_0_) {
	int anLocalInt;
	for (anLocalInt = (int) Math.pow((double) argument,
					 1.0 / (double) argument_0_) + 1;
	     Class190.method2882(32672, anLocalInt, argument_0_) > argument;
	     anLocalInt--) {
	    /* empty */
	}
	return anLocalInt;
    }
    
    private final void method4126() {
	int[] anLocalInts = new int[anInt3263];
	int[] anLocalInts_1_ = new int[33];
	for (int anLocalInt = 0; anLocalInt < anInt3263; anLocalInt++) {
	    int anLocalInt_2_ = anIntArray3264[anLocalInt];
	    if (anLocalInt_2_ != 0) {
		int anLocalInt_3_ = 1 << 32 - anLocalInt_2_;
		int anLocalInt_4_ = anLocalInts_1_[anLocalInt_2_];
		anLocalInts[anLocalInt] = anLocalInt_4_;
		int anLocalInt_5_;
		if ((anLocalInt_4_ & anLocalInt_3_) != 0)
		    anLocalInt_5_ = anLocalInts_1_[anLocalInt_2_ - 1];
		else {
		    anLocalInt_5_ = anLocalInt_4_ | anLocalInt_3_;
		    for (int anLocalInt_6_ = anLocalInt_2_ - 1;
			 anLocalInt_6_ >= 1; anLocalInt_6_--) {
			int anLocalInt_7_ = anLocalInts_1_[anLocalInt_6_];
			if (anLocalInt_7_ != anLocalInt_4_)
			    break;
			int anLocalInt_8_ = 1 << 32 - anLocalInt_6_;
			if ((anLocalInt_7_ & anLocalInt_8_) != 0) {
			    anLocalInts_1_[anLocalInt_6_]
				= anLocalInts_1_[anLocalInt_6_ - 1];
			    break;
			}
			anLocalInts_1_[anLocalInt_6_]
			    = anLocalInt_7_ | anLocalInt_8_;
		    }
		}
		anLocalInts_1_[anLocalInt_2_] = anLocalInt_5_;
		for (int anLocalInt_9_ = anLocalInt_2_ + 1;
		     anLocalInt_9_ <= 32; anLocalInt_9_++) {
		    int anLocalInt_10_ = anLocalInts_1_[anLocalInt_9_];
		    if (anLocalInt_10_ == anLocalInt_4_)
			anLocalInts_1_[anLocalInt_9_] = anLocalInt_5_;
		}
	    }
	}
	anIntArray3266 = new int[8];
	int anLocalInt = 0;
	for (int anLocalInt_11_ = 0; anLocalInt_11_ < anInt3263;
	     anLocalInt_11_++) {
	    int anLocalInt_12_ = anIntArray3264[anLocalInt_11_];
	    if (anLocalInt_12_ != 0) {
		int anLocalInt_13_ = anLocalInts[anLocalInt_11_];
		int anLocalInt_14_ = 0;
		for (int anLocalInt_15_ = 0; anLocalInt_15_ < anLocalInt_12_;
		     anLocalInt_15_++) {
		    int anLocalInt_16_ = -2147483648 >>> anLocalInt_15_;
		    if ((anLocalInt_13_ & anLocalInt_16_) != 0) {
			if (anIntArray3266[anLocalInt_14_] == 0)
			    anIntArray3266[anLocalInt_14_] = anLocalInt;
			anLocalInt_14_ = anIntArray3266[anLocalInt_14_];
		    } else
			anLocalInt_14_++;
		    if (anLocalInt_14_ >= anIntArray3266.length) {
			int[] anLocalInts_17_
			    = new int[anIntArray3266.length * 2];
			for (int anLocalInt_18_ = 0;
			     anLocalInt_18_ < anIntArray3266.length;
			     anLocalInt_18_++)
			    anLocalInts_17_[anLocalInt_18_]
				= anIntArray3266[anLocalInt_18_];
			anIntArray3266 = anLocalInts_17_;
		    }
		    anLocalInt_16_ >>>= 1;
		}
		anIntArray3266[anLocalInt_14_] = anLocalInt_11_ ^ 0xffffffff;
		if (anLocalInt_14_ >= anLocalInt)
		    anLocalInt = anLocalInt_14_ + 1;
	    }
	}
    }
    
    final float[] method4127() {
	return aFloatArrayArray3262[method4124()];
    }
    
    Class386() {
	Node_Sub25.method762(24);
	((Class386) this).anInt3261 = Node_Sub25.method762(16);
	anInt3263 = Node_Sub25.method762(24);
	anIntArray3264 = new int[anInt3263];
	boolean anLocalBoolean = Node_Sub25.method754() != 0;
	if (anLocalBoolean) {
	    int anLocalInt = 0;
	    int anLocalInt_19_ = Node_Sub25.method762(5) + 1;
	    while (anLocalInt < anInt3263) {
		int anLocalInt_20_
		    = Node_Sub25.method762(DoublyLinkedNode_Sub51_Sub13.method1258(9761, anInt3263 - anLocalInt));
		for (int anLocalInt_21_ = 0; anLocalInt_21_ < anLocalInt_20_;
		     anLocalInt_21_++)
		    anIntArray3264[anLocalInt++] = anLocalInt_19_;
		anLocalInt_19_++;
	    }
	} else {
	    boolean anLocalBoolean_22_ = Node_Sub25.method754() != 0;
	    for (int anLocalInt = 0; anLocalInt < anInt3263; anLocalInt++) {
		if (anLocalBoolean_22_ && Node_Sub25.method754() == 0)
		    anIntArray3264[anLocalInt] = 0;
		else
		    anIntArray3264[anLocalInt]
			= Node_Sub25.method762(5) + 1;
	    }
	}
	method4126();
	int anLocalInt = Node_Sub25.method762(4);
	if (anLocalInt > 0) {
	    float f = Node_Sub25.method759(Node_Sub25.method762(32));
	    float f_23_ = Node_Sub25.method759(Node_Sub25.method762(32));
	    int anLocalInt_24_ = Node_Sub25.method762(4) + 1;
	    boolean anLocalBoolean_25_ = Node_Sub25.method754() != 0;
	    int anLocalInt_26_;
	    if (anLocalInt == 1)
		anLocalInt_26_
		    = method4125(anInt3263, ((Class386) this).anInt3261);
	    else
		anLocalInt_26_ = anInt3263 * ((Class386) this).anInt3261;
	    anIntArray3265 = new int[anLocalInt_26_];
	    for (int anLocalInt_27_ = 0; anLocalInt_27_ < anLocalInt_26_;
		 anLocalInt_27_++)
		anIntArray3265[anLocalInt_27_]
		    = Node_Sub25.method762(anLocalInt_24_);
	    aFloatArrayArray3262
		= new float[anInt3263][((Class386) this).anInt3261];
	    if (anLocalInt == 1) {
		for (int anLocalInt_28_ = 0; anLocalInt_28_ < anInt3263;
		     anLocalInt_28_++) {
		    float f_29_ = 0.0F;
		    int anLocalInt_30_ = 1;
		    for (int anLocalInt_31_ = 0;
			 anLocalInt_31_ < ((Class386) this).anInt3261;
			 anLocalInt_31_++) {
			int anLocalInt_32_
			    = anLocalInt_28_ / anLocalInt_30_ % anLocalInt_26_;
			float f_33_
			    = ((float) anIntArray3265[anLocalInt_32_] * f_23_
			       + f + f_29_);
			aFloatArrayArray3262[anLocalInt_28_][anLocalInt_31_]
			    = f_33_;
			if (anLocalBoolean_25_)
			    f_29_ = f_33_;
			anLocalInt_30_ *= anLocalInt_26_;
		    }
		}
	    } else {
		for (int anLocalInt_34_ = 0; anLocalInt_34_ < anInt3263;
		     anLocalInt_34_++) {
		    float f_35_ = 0.0F;
		    int anLocalInt_36_
			= anLocalInt_34_ * ((Class386) this).anInt3261;
		    for (int anLocalInt_37_ = 0;
			 anLocalInt_37_ < ((Class386) this).anInt3261;
			 anLocalInt_37_++) {
			float f_38_
			    = ((float) anIntArray3265[anLocalInt_36_] * f_23_
			       + f + f_35_);
			aFloatArrayArray3262[anLocalInt_34_][anLocalInt_37_]
			    = f_38_;
			if (anLocalBoolean_25_)
			    f_35_ = f_38_;
			anLocalInt_36_++;
		    }
		}
	    }
	}
    }
}
