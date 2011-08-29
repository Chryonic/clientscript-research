/* Class62_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub8 extends Class62
{
    static Js5Store aJs5Store_4393;
    static int anInt4394;
    static int anInt4395 = 0;
    static int anInt4396 = 0;

    final int method1342(int argument_0_, byte argument_1_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -107))
	    return 3;
	if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		.aClass62_Sub19_4323.method1432(110)
	    == 0)
	    return 3;
	return 1;
    }
    
    final void method1343(int argument_2_, byte argument_3_) {
	if (argument_3_ != -107)
	    anInt4396 = 48;
	((Class62) this).anInt441 = argument_2_;
    }
    
    final int method1344(byte argument_4_) {
	if (argument_4_ != 4)
	    return 29;
	return 2;
    }
    
    public static void method1385(int argument) {
	aJs5Store_4393 = null;
    }
    
    final boolean method1386(int argument_5_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -102))
	    return false;
	if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		.aClass62_Sub19_4323.method1432(103)
	    == 0)
	    return false;
	return true;
    }
    
    Class62_Sub8(Node_Sub50 argument_6_) {
	super(argument_6_);
    }

    final void method1346(boolean argument_9_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -110))
	    ((Class62) this).anInt441 = 0;
	if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		.aClass62_Sub19_4323.method1432(35)
	    == 0)
	    ((Class62) this).anInt441 = 0;
	if (argument_9_)
	    method1343(25, (byte) 65);
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 2)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    final int method1388(int argument_10_) {
	return ((Class62) this).anInt441;
    }
    
    Class62_Sub8(int argument_11_, Node_Sub50 argument_12_) {
	super(argument_11_, argument_12_);
    }

    static {
	anInt4394 = 0;
    }
}
