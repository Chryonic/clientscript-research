/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class150 implements Interface18
{
    int anInt3677;

    static final void method2544(int argument) {
	if (Class146.anInt1111 != -1 && Class76.anInt516 != -1) {
	    int anLocalInt
		= (((-DoublyLinkedNodeP2_Sub4_Sub1.anInt6433
		     + Node_Sub47_Sub11.anInt6209) * Statics.anInt1081
		    >> 16)
		   + DoublyLinkedNodeP2_Sub4_Sub1.anInt6433);
	    Statics.anInt1081 += anLocalInt;
	    if (Statics.anInt1081 < 65535) {
		Node_Sub45.aBoolean4270 = false;
		Class263.aBoolean3633 = false;
	    } else {
		if (!Node_Sub45.aBoolean4270)
		    Class263.aBoolean3633 = true;
		else
		    Class263.aBoolean3633 = false;
		Statics.anInt1081 = 65535;
		Node_Sub45.aBoolean4270 = true;
	    }
	    float f = (float) Statics.anInt1081 / 65535.0F;
	    float[] fs = new float[3];
	    int anLocalInt_0_ = DoublyLinkedNode_Sub51_Sub19.anInt6354 * 2;
	    for (int anLocalInt_1_ = 0; anLocalInt_1_ < 3; anLocalInt_1_++) {
		int anLocalInt_2_
		    = ((Class164.anIntArrayArrayArray1198[Class146.anInt1111]
			[anLocalInt_0_][anLocalInt_1_])
		       * 3);
		int anLocalInt_3_
		    = ((Class164.anIntArrayArrayArray1198[Class146.anInt1111]
			[anLocalInt_0_ + 1][anLocalInt_1_])
		       * 3);
		int anLocalInt_4_
		    = (((Class164.anIntArrayArrayArray1198[Class146.anInt1111]
			 [anLocalInt_0_ + 2][anLocalInt_1_])
			- ((Class164.anIntArrayArrayArray1198
			    [Class146.anInt1111][anLocalInt_0_ + 3]
			    [anLocalInt_1_])
			   - (Class164.anIntArrayArrayArray1198
			      [Class146.anInt1111][anLocalInt_0_ + 2]
			      [anLocalInt_1_])))
		       * 3);
		int anLocalInt_5_
		    = (Class164.anIntArrayArrayArray1198[Class146.anInt1111]
		       [anLocalInt_0_][anLocalInt_1_]);
		int anLocalInt_6_ = anLocalInt_3_ - anLocalInt_2_;
		int anLocalInt_7_
		    = anLocalInt_4_ + (-(anLocalInt_3_ * 2) + anLocalInt_2_);
		int anLocalInt_8_
		    = anLocalInt_3_ + (-anLocalInt_5_
				       + ((Class164.anIntArrayArrayArray1198
					   [Class146.anInt1111]
					   [anLocalInt_0_ + 2][anLocalInt_1_])
					  - anLocalInt_4_));
		fs[anLocalInt_1_]
		    = ((float) anLocalInt_6_
		       + (((float) anLocalInt_7_ + f * (float) anLocalInt_8_)
			  * f)) * f + (float) anLocalInt_5_;
	    }
	    Class287.anInt2299 = -(MapRelated.baseX * 512) + (int) fs[0];
	    Class2_Sub2.anInt3763 = (int) fs[1] * -1;
	    Node_Sub31_Sub30.anInt5987
		= -(MapRelated.baseZ * 512) + (int) fs[2];
	    float[] fs_9_ = new float[3];
	    int anLocalInt_10_ = Class137.anInt1084 * 2;
	    for (int anLocalInt_11_ = 0; anLocalInt_11_ < 3;
		 anLocalInt_11_++) {
		int anLocalInt_12_
		    = ((Class164.anIntArrayArrayArray1198[Class76.anInt516]
			[anLocalInt_10_][anLocalInt_11_])
		       * 3);
		int anLocalInt_13_
		    = ((Class164.anIntArrayArrayArray1198[Class76.anInt516]
			[anLocalInt_10_ + 1][anLocalInt_11_])
		       * 3);
		int anLocalInt_14_
		    = (((Class164.anIntArrayArrayArray1198[Class76.anInt516]
			 [anLocalInt_10_ + 2][anLocalInt_11_])
			+ (Class164.anIntArrayArrayArray1198[Class76.anInt516]
			   [anLocalInt_10_ + 2][anLocalInt_11_])
			- (Class164.anIntArrayArrayArray1198[Class76.anInt516]
			   [anLocalInt_10_ + 3][anLocalInt_11_]))
		       * 3);
		int anLocalInt_15_
		    = (Class164.anIntArrayArrayArray1198[Class76.anInt516]
		       [anLocalInt_10_][anLocalInt_11_]);
		int anLocalInt_16_ = anLocalInt_13_ - anLocalInt_12_;
		int anLocalInt_17_ = anLocalInt_12_ + (-(anLocalInt_13_ * 2)
						       + anLocalInt_14_);
		int anLocalInt_18_
		    = (anLocalInt_13_
		       + (Class164.anIntArrayArrayArray1198[Class76.anInt516]
			  [anLocalInt_10_ + 2][anLocalInt_11_])
		       - (anLocalInt_15_ + anLocalInt_14_));
		fs_9_[anLocalInt_11_] = (((float) anLocalInt_16_
					  + f * ((float) anLocalInt_17_
						 + f * (float) anLocalInt_18_))
					 * f) + (float) anLocalInt_15_;
	    }
	    float f_19_ = -fs[0] + fs_9_[0];
	    float f_20_ = (-fs[1] + fs_9_[1]) * -1.0F;
	    float f_21_ = fs_9_[2] - fs[2];
	    double d = Math.sqrt((double) (f_19_ * f_19_ + f_21_ * f_21_));
	    Class293.anInt2404 = (int) (Math.atan2((double) f_20_, d)
					* 2607.5945876176133) & 0x3fff;
	    Node_Sub47_Sub3.anInt6167
		= (int) (-Math.atan2((double) f_19_, (double) f_21_)
			 * 2607.5945876176133) & 0x3fff;
	    Class361.anInt3055
		= ((Class164.anIntArrayArrayArray1198[Class146.anInt1111]
		    [anLocalInt_0_][argument])
		   + ((Statics.anInt1081
		       * ((Class164.anIntArrayArrayArray1198
			   [Class146.anInt1111][anLocalInt_0_ + 2][3])
			  - (Class164.anIntArrayArrayArray1198
			     [Class146.anInt1111][anLocalInt_0_][3])))
		      >> 16));
	}
    }
    
    Class150(int argument_22_) {
	((Class150) this).anInt3677 = argument_22_;
    }
    
    static final boolean method2545(int argument, int argument_23_) {
	if (argument_23_ != 2 && argument_23_ != 22 && argument_23_ != 5
	    && argument_23_ != 10 && argument_23_ != 49 && argument_23_ != 60
	    && argument_23_ != 8)
	    return false;
	return true;
    }
    
    static final void method2546(int argument, int argument_24_,
				 int argument_25_, int argument_26_) {
	String string = ("tele " + argument + "," + (argument_26_ >> 6) + ","
			 + (argument_25_ >> 6) + "," + (argument_26_ & 0x3f)
			 + "," + (argument_25_ & 0x3f));
	System.out.println(string);
	Class207.method2948(string, true, false, -1);
    }
    
    public final Class128 method68(byte argument_27_) {
	if (argument_27_ > -35)
	    ((Class150) this).anInt3677 = -66;
	return Class107.aClass128_874;
    }
}
