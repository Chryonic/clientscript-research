/* Class235 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class235
{
    static RsInterface aRsInterface_1717;
    static int[] anIntArray1718;
    static int[] anIntArray1719 = new int[2048];
    
    public static void method3112(int argument) {
	aRsInterface_1717 = null;
	anIntArray1719 = null;
	anIntArray1718 = null;
    }
    
    static final void method3113
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_) {
	int anLocalInt
	    = Node_Sub31_Sub8.method897(argument_6_, Class209.anInt1504,
            124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_7_
	    = Node_Sub31_Sub8.method897(argument_1_, Class209.anInt1504,
            argument_2_ + 124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_8_
	    = Node_Sub31_Sub8.method897(argument, Node_Sub35.anInt4156,
            124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_9_
	    = Node_Sub31_Sub8.method897(argument_4_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_10_
	    = Node_Sub31_Sub8.method897(argument_6_ + argument_3_,
            Class209.anInt1504, 124915076,
            Node_Sub31_Sub13.anInt5896);
	int anLocalInt_11_
	    = Node_Sub31_Sub8.method897(-argument_3_ + argument_1_,
            Class209.anInt1504, 124915076,
            Node_Sub31_Sub13.anInt5896);
	for (int anLocalInt_12_ = anLocalInt; anLocalInt_12_ < anLocalInt_10_;
	     anLocalInt_12_++)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_12_], (byte) -127, anLocalInt_8_, anLocalInt_9_, argument_0_);
	if (argument_2_ != 0)
	    aRsInterface_1717 = null;
	for (int anLocalInt_13_ = anLocalInt_7_;
	     anLocalInt_13_ > anLocalInt_11_; anLocalInt_13_--)
	    Statics.method3364(Class223.anIntArrayArray1562[anLocalInt_13_], (byte) 110, anLocalInt_8_, anLocalInt_9_, argument_0_);
	int anLocalInt_14_
	    = Node_Sub31_Sub8.method897(argument + argument_3_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_15_
	    = Node_Sub31_Sub8.method897(-argument_3_ + argument_4_,
            Node_Sub35.anInt4156, 124915076,
            Node_Sub9_Sub2.anInt5776);
	for (int anLocalInt_16_ = anLocalInt_10_;
	     anLocalInt_11_ >= anLocalInt_16_; anLocalInt_16_++) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[anLocalInt_16_];
	    Statics.method3364(anLocalInts, (byte) 105, anLocalInt_8_, anLocalInt_14_, argument_0_);
	    Statics.method3364(anLocalInts, (byte) 119, anLocalInt_14_, anLocalInt_15_, argument_5_);
	    Statics.method3364(anLocalInts, (byte) -128, anLocalInt_15_, anLocalInt_9_, argument_0_);
	}
    }

    static final Class253_Sub1 method3115(byte argument,
					  Packet argument_29_) {
	Class253 class253 = Node_Sub31_Sub1.method876(argument_29_, false);
	int anLocalInt = argument_29_.g2();
	int anLocalInt_30_ = argument_29_.g2();
	int anLocalInt_31_ = argument_29_.g2();
	int anLocalInt_32_ = argument_29_.g2();
	int anLocalInt_33_ = argument_29_.g2();
	int anLocalInt_34_ = argument_29_.g2();
	return new Class253_Sub1(((Class253) class253).aClass349_3712,
				 ((Class253) class253).aClass44_3710,
				 ((Class253) class253).anInt3716,
				 ((Class253) class253).anInt3713,
				 ((Class253) class253).anInt3718,
				 ((Class253) class253).anInt3711,
				 ((Class253) class253).anInt3714,
				 ((Class253) class253).anInt3719,
				 ((Class253) class253).anInt3717, anLocalInt,
				 anLocalInt_30_, anLocalInt_31_,
				 anLocalInt_32_, anLocalInt_33_,
				 anLocalInt_34_);
    }
    
    static {
	aRsInterface_1717 = null;
	anIntArray1718 = new int[14];
    }
}
