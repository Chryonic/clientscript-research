/* Class62_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub19 extends Class62
{
    static int anInt4425;
    static Class320 aClass320_4426 = new Class320(1);
    static long aLong4427;
    static int anInt4428 = -1;
    static int anInt4429 = 0;
    
    Class62_Sub19(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final void method1343(int argument_1_, byte argument_2_) {
	if (argument_2_ != -107)
	    aLong4427 = -75L;
	((Class62) this).anInt441 = argument_1_;
    }
    
    public static void method1431(boolean argument) {
	aClass320_4426 = null;
    }
    
    final void method1346(boolean argument_3_) {
	if (((Class62) this).aClass59_Sub50_440.method1161(argument_3_)
	    == GameEnum.RUNESCAPE) {
	    if (((Class62) this).aClass59_Sub50_440.method1164((byte) -123))
		((Class62) this).anInt441 = 0;
	} else
	    ((Class62) this).anInt441 = 1;
	if (((Class62) this).anInt441 != 0 && ((Class62) this).anInt441 != 1)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    Class62_Sub19(int argument_4_, Node_Sub50 argument_5_) {
	super(argument_4_, argument_5_);
    }
    
    final int method1432(int argument_6_) {
	return ((Class62) this).anInt441;
    }
    
    final int method1344(byte argument_7_) {
	if (argument_7_ != 4)
	    return -112;
	return 1;
    }
    
    final boolean method1433(int argument_8_) {
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE) {
	    if (((Class62) this).aClass59_Sub50_440.method1164((byte) -113))
		return false;
	    return true;
	}
	return false;
    }
    
    final int method1342(int argument_9_, byte argument_10_) {
	int anLocalInt = -79 / ((argument_10_ + 53) / 50);
	if (((Class62) this).aClass59_Sub50_440.method1161(false)
	    == GameEnum.RUNESCAPE) {
	    if (((Class62) this).aClass59_Sub50_440.method1164((byte) -107))
		return 3;
	    if (argument_9_ == 0
		|| ((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		       .aClass62_Sub3_4318.method1365(62) == 1)
		return 1;
	    return 2;
	}
	return 3;
    }
    
    static {
	aLong4427 = 0L;
    }
}
