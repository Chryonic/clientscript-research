/* Class62_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub25 extends Class62
{
    static short[][] aShortArrayArray4443;
    static int anInt4444;
    
    Class62_Sub25(int argument_0_, Node_Sub50 argument_1_) {
	super(argument_0_, argument_1_);
    }
    
    public static void method1456(int argument) {
	aShortArrayArray4443 = null;
    }
    
    Class62_Sub25(Node_Sub50 argument_2_) {
	super(argument_2_);
    }
    
    final int method1342(int argument_3_, byte argument_4_) {
	int anLocalInt = 10 / ((-53 - argument_4_) / 50);
	return 3;
    }
    
    final void method1346(boolean argument_5_) {
	if (!argument_5_)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final void method1457(String argument, byte argument_6_,
				 String argument_7_) {
	if (argument_7_.length() <= 320 && Class295.method3505((byte) -48)) {
	    if (Statics.aClass307_2632 != null) {
		Statics.aClass307_2632.method3601(2);
		Statics.aClass307_2632 = null;
	    }
	    Class206.method2943((byte) 83);
	    Class276.aString2215 = argument;
	    Statics.aString2295 = argument_7_;
	    Class316.method3638(5, 2);
	}
    }
    
    final void method1343(int argument_8_, byte argument_9_) {
	if (argument_9_ == -107)
	    ((Class62) this).anInt441 = argument_8_;
    }
    
    final int method1458(int argument_10_) {
	return ((Class62) this).anInt441;
    }
    
    final int method1344(byte argument_11_) {
	if (argument_11_ != 4)
	    aShortArrayArray4443 = null;
	if ((((Class62) this).aClass59_Sub50_440.method1161(false)
	     == GameEnum.RUNESCAPE)
	    && ((Class62) this).aClass59_Sub50_440.method1164((byte) -112))
	    return 0;
	return 1;
    }
}
