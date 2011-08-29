/* Class62_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub4 extends Class62
{
    static String[] aStringArray4378;

    public static void method1366(int argument) {
	CombineModeEnum.ADD = null;
	aStringArray4378 = null;
    }
    
    final int method1344(byte argument_0_) {
	if (argument_0_ != 4)
	    return 116;
	if (!((Class62) this).aClass59_Sub50_440.method1157(-127).method231(0))
	    return 2;
	return 3;
    }
    
    final void method1346(boolean argument_1_) {
	if (((Class62) this).anInt441 < 1 || ((Class62) this).anInt441 > 3)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_1_)
	    method1369(62, null, true, -95, null, 26);
    }
    
    static final void method1367(String argument, boolean argument_2_,
				 int argument_3_, String argument_4_,
				 boolean argument_5_) {
	Statics.aString2295 = argument_4_;
	Node_Sub9_Sub1.aBoolean5749 = argument_5_;
	Class276.aString2215 = argument;
	if (!argument_5_)
	    Class141.anInt1099 = -1;
	Node_Sub7.aBoolean3917 = argument_2_;
	if (!Node_Sub9_Sub1.aBoolean5749
	    && (Statics.aString2295.equals("")
		|| Class276.aString2215.equals("")))
	    Node_Sub16.method698(3, 2);
	else {
	    if (Class353_Sub6.anInt5507 != 1) {
		Node_Sub16.anInt3995 = -1;
		Class245_Sub1_Sub1.anInt6513 = 0;
	    }
	    Statics.aBoolean1173 = false;
	    Node_Sub16.method698(-3, argument_3_ + 2);
	    DoublyLinkedNode_Sub51_Sub12.anInt6286 = 1;
	    Statics.anInt4107 = argument_3_;
	    Class163.anInt1190 = 0;
	}
    }
    
    final int method1342(int argument_6_, byte argument_7_) {
	int anLocalInt = -16 % ((argument_7_ + 53) / 50);
	return 1;
    }
    
    final int method1368(int argument_8_) {
	return ((Class62) this).anInt441;
    }
    
    static final void method1369(int argument, GraphicsToolkit argument_9_,
				 boolean argument_10_, int argument_11_,
				 RsInterface argument_12_, int argument_13_) {
	for (int anLocalInt = 7; anLocalInt >= 0; anLocalInt--) {
	    for (int anLocalInt_14_ = 127; anLocalInt_14_ >= 0;
		 anLocalInt_14_--) {
		int anLocalInt_15_
		    = ((argument_11_ & 0x3f) << 10 | anLocalInt << 7 & 0x380
		       | anLocalInt_14_ & 0x7f);
		Node_Sub47_Sub1.method1116(true, false, true);
		int anLocalInt_16_ = HslToRgb.table[anLocalInt_15_];
		Class112.method2009(true, -11692, false);
		argument_9_.fillRect(((anLocalInt_14_ * ((RsInterface) argument_12_).renderWidth) >> 7) + argument, (argument_13_ + (((-anLocalInt + 7) * ((RsInterface) argument_12_).renderHeight) >> 3)), (((RsInterface) argument_12_).renderWidth >> 7) + 1, (((RsInterface) argument_12_).renderHeight >> 3) + 1, anLocalInt_16_, 0);
	    }
	}
    }
    
    static final int method1370(int argument, int argument_17_,
				int argument_18_, int argument_19_) {
	int anLocalInt = argument_18_ / argument_17_;
	if (argument != 0)
	    CombineModeEnum.ADD = null;
	int anLocalInt_20_ = argument_17_ - 1 & argument_18_;
	int anLocalInt_21_ = argument_19_ / argument_17_;
	int anLocalInt_22_ = argument_17_ - 1 & argument_19_;
	int anLocalInt_23_
	    = Class220.method3027((byte) 121, anLocalInt, anLocalInt_21_);
	int anLocalInt_24_
	    = Class220.method3027((byte) -31, anLocalInt + 1, anLocalInt_21_);
	int anLocalInt_25_
	    = Class220.method3027((byte) -59, anLocalInt, anLocalInt_21_ + 1);
	int anLocalInt_26_ = Class220.method3027((byte) 89, anLocalInt + 1,
						 anLocalInt_21_ + 1);
	int anLocalInt_27_
	    = Class385.method4122(anLocalInt_20_, anLocalInt_23_, argument_17_,
				  argument + 65536, anLocalInt_24_);
	int anLocalInt_28_
	    = Class385.method4122(anLocalInt_20_, anLocalInt_25_, argument_17_,
				  65536, anLocalInt_26_);
	return Class385.method4122(anLocalInt_22_, anLocalInt_27_,
				   argument_17_, argument + 65536,
				   anLocalInt_28_);
    }
    
    Class62_Sub4(int argument_29_, Node_Sub50 argument_30_) {
	super(argument_29_, argument_30_);
    }
    
    Class62_Sub4(Node_Sub50 argument_31_) {
	super(argument_31_);
    }
    
    final void method1343(int argument_32_, byte argument_33_) {
	((Class62) this).anInt441 = argument_32_;
	if (argument_33_ != -107)
	    aStringArray4378 = null;
    }
}
