/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class122
{
    static Class166 aClass166_985 = new Class166(37, -1);
    static int anInt986;
    
    static final boolean method2388
	(int argument, int argument_0_, Class80 argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_) {
	if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223 || !Class384.aBoolean3255)
	    return false;
	if ((Class253_Sub3.anInt5675 ^ 0xffffffff) > argument_0_)
	    return false;
	if (argument == argument_5_ && argument_2_ == argument_3_) {
	    if (!Node_Sub29.method856(argument_5_, argument_2_, argument_4_,
                19322))
		return false;
	    if (Statics.method1763((byte) 58, argument_1_)) {
		Class356.anInt3011++;
		return true;
	    }
	    return false;
	}
	for (int anLocalInt = argument_5_; argument >= anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_6_ = argument_2_; argument_3_ >= anLocalInt_6_;
		 anLocalInt_6_++) {
		if ((Class157.anIntArrayArrayArray1162[argument_4_][anLocalInt]
		     [anLocalInt_6_])
		    == -Node_Sub31_Sub9.anInt5876)
		    return false;
	    }
	}
	if (!Statics.method1763((byte) 58, argument_1_))
	    return false;
	Class356.anInt3011++;
	return true;
    }
    
    public static void method2389(int argument) {
	aClass166_985 = null;
    }
    
    static final void method2390(int argument, int argument_7_,
				 int argument_8_, int argument_9_,
				 int argument_10_, int argument_11_,
				 int argument_12_, int argument_13_) {
	if (argument_10_ == argument_12_)
	    Node_Sub31_Sub31.method969(argument_13_, false, argument_12_,
                argument_11_, argument_7_, argument,
                argument_8_);
	else if (argument_13_ - argument_12_ < Node_Sub35.anInt4156
		 || Node_Sub9_Sub2.anInt5776 < argument_13_ + argument_12_
		 || Class209.anInt1504 > -argument_10_ + argument_11_
		 || (argument_10_ + argument_11_
		     > Node_Sub31_Sub13.anInt5896))
	    Class345.method3802(argument_12_, argument_8_, argument, 3,
				argument_13_, argument_11_, argument_10_,
				argument_7_);
	else
	    Rs2DPainter.method737(argument_11_, 3, argument_8_, argument_13_, argument, argument_7_, argument_12_, argument_10_);
    }
    
    static final void method2391(int argument, int argument_14_,
				 int argument_15_) {
	if (Statics.anInt294 != argument) {
	    Class130.anIntArray1053 = new int[argument];
	    for (int anLocalInt = 0; argument > anLocalInt; anLocalInt++)
		Class130.anIntArray1053[anLocalInt]
		    = (anLocalInt << 12) / argument;
	    Statics.anInt1269 = argument - 1;
	    DoublyLinkedNode_Sub51_Sub8.anInt6264 = argument * 32;
	    Statics.anInt294 = argument;
	}
	int anLocalInt = 109 % ((argument_15_ - 17) / 40);
	if (argument_14_ != DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711) {
	    if (Statics.anInt294 == argument_14_)
		Class82.anIntArray585 = Class130.anIntArray1053;
	    else {
		Class82.anIntArray585 = new int[argument_14_];
		for (int anLocalInt_16_ = 0; argument_14_ > anLocalInt_16_;
		     anLocalInt_16_++)
		    Class82.anIntArray585[anLocalInt_16_]
			= (anLocalInt_16_ << 12) / argument_14_;
	    }
	    Exception_Sub1.anInt49 = argument_14_ - 1;
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 = argument_14_;
	}
    }
}
