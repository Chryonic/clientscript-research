/* Class62_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class62_Sub7 extends Class62
{
    static Class390 aClass390_4390 = new Class390();
    static Class166 aClass166_4391 = new Class166(45, 2);
    static int[] anIntArray4392;

    final int method1344(byte argument_20_) {
	if (argument_20_ != 4)
	    return -25;
	return 1;
    }
    
    final boolean method1381(int argument_21_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -108))
	    return false;
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE)
	    return true;
	return false;
    }
    
    final void method1346(boolean argument_22_) {
	if (((Class62) this).aClass59_Sub50_440.method1161(argument_22_)
	    != GameEnum.RUNESCAPE)
	    ((Class62) this).anInt441 = 1;
	else if (((Class62) this).aClass59_Sub50_440.method1164((byte) -121))
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 != 0 && ((Class62) this).anInt441 != 1)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final int method1382(int argument, int argument_23_) {
	int anLocalInt = argument & 0x3f;
	int anLocalInt_24_ = (argument & 0xc6) >> 6;
	if (anLocalInt != 18) {
	    if (anLocalInt == 19 || anLocalInt == 21) {
		if (anLocalInt_24_ == 0)
		    return 16;
		if (anLocalInt_24_ == 1)
		    return 32;
		if (anLocalInt_24_ == 2)
		    return 64;
		if (anLocalInt_24_ == 3)
		    return 128;
	    }
	} else {
	    if (anLocalInt_24_ == 0)
		return 1;
	    if (anLocalInt_24_ == 1)
		return 2;
	    if (anLocalInt_24_ == 2)
		return 4;
	    if (anLocalInt_24_ == 3)
		return 8;
	}
	return 0;
    }
    
    public static void method1383(boolean argument) {
	anIntArray4392 = null;
	aClass390_4390 = null;
	aClass166_4391 = null;
    }
    
    Class62_Sub7(int argument_25_, Node_Sub50 argument_26_) {
	super(argument_25_, argument_26_);
    }
    
    final int method1342(int argument_27_, byte argument_28_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -126))
	    return 3;
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE)
	    return 1;
	return 3;
    }
    
    final void method1343(int argument_29_, byte argument_30_) {
	((Class62) this).anInt441 = argument_29_;
	if (argument_30_ != -107)
	    aClass166_4391 = null;
    }
    
    Class62_Sub7(Node_Sub50 argument_31_) {
	super(argument_31_);
    }
    
    final int method1384(int argument_32_) {
	return ((Class62) this).anInt441;
    }
}
