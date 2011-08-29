/* Class62_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub27 extends Class62
{
    static short[] aShortArray4449 = new short[256];
    static Class207 aClass207_4450;
    static int[] anIntArray4452 = new int[4096];
    static int anInt4453 = 4;
    static Class207 aClass207_4455;
    static double aDouble4456;
    static Class362 aClass362_4457;
    
    final int method1467(int argument_0_) {
	if (argument_0_ < 3)
	    aClass362_4457 = null;
	return ((Class62) this).anInt441;
    }
    
    final void method1346(boolean argument_1_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -121))
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_1_)
	    DiskBackedCache.ioBuffer = null;
    }
    
    final boolean method1468(int argument_2_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -104))
	    return false;
	return true;
    }
    
    final int method1342(int argument_3_, byte argument_4_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -118))
	    return 3;
	return 1;
    }
    
    final void method1343(int argument_5_, byte argument_6_) {
	((Class62) this).anInt441 = argument_5_;
	if (argument_6_ != -107)
	    method1344((byte) -125);
    }
    
    final int method1344(byte argument_7_) {
	if (argument_7_ != 4)
	    anIntArray4452 = null;
	return 1;
    }
    
    Class62_Sub27(int argument_8_, Node_Sub50 argument_9_) {
	super(argument_8_, argument_9_);
    }
    
    public static void method1469(int argument) {
	DiskBackedCache.ioBuffer = null;
	aClass362_4457 = null;
	aShortArray4449 = null;
	aClass207_4455 = null;
	anIntArray4452 = null;
	aClass207_4450 = null;
    }
    
    Class62_Sub27(Node_Sub50 argument_10_) {
	super(argument_10_);
    }
    
    static {
	DiskBackedCache.ioBuffer = new byte[520];
	aClass207_4450 = new Class207(9, 3);
	aClass207_4455 = new Class207(4, 3);
    }
}
