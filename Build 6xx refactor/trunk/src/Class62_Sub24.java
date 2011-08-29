/* Class62_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub24 extends Class62
{
    private static short[] aShortArray4438 = { -1, -1, -1, -1, -1 };
    static TextureSource anTextureSource_4439;
    static short[][] aShortArrayArray4440;
    private static short[] aShortArray4441 = { 6798, 8741, 25238, 4626, 4550 };
    private static short[] aShortArray4442 = { -1, -1, -1, -1, -1 };
    
    final int method1451(int argument_0_) {
	return ((Class62) this).anInt441;
    }
    
    final void method1346(boolean argument_1_) {
	if (((Class62) this).aClass59_Sub50_440.method1161(argument_1_)
	    == GameEnum.STELLARDAWN)
	    ((Class62) this).anInt441 = 2;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 2)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final int method1452(int argument, int argument_2_) {
	return argument >>> 8;
    }
    
    final int method1342(int argument_3_, byte argument_4_) {
	int anLocalInt = 105 / ((argument_4_ + 53) / 50);
	return 1;
    }
    
    public static void method1453(int argument) {
	aShortArray4442 = null;
	aShortArray4438 = null;
	aShortArrayArray4440 = null;
	aShortArray4441 = null;
	anTextureSource_4439 = null;
    }
    
    static final void method1454(byte argument) {
	Class342.method3787(false);
    }
    
    static final void method1455(int argument) {
	for (int anLocalInt = 0; anLocalInt < Class105.anInt861;
	     anLocalInt++) {
	    Class169 class169 = Class131.aClass169Array1059[anLocalInt];
	    if (((Class169) class169).aByte1241 == 3) {
		if (((Class169) class169).aClass59_Sub9_Sub4_1240 != null)
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Class169) class169).aClass59_Sub9_Sub4_1240);
		else
		    ((Class169) class169).anInt1236 = -2147483648;
	    }
	}
    }
    
    final int method1344(byte argument_5_) {
	if (argument_5_ != 4)
	    aShortArrayArray4440 = null;
	return 1;
    }
    
    Class62_Sub24(int argument_6_, Node_Sub50 argument_7_) {
	super(argument_6_, argument_7_);
    }
    
    final void method1343(int argument_8_, byte argument_9_) {
	if (argument_9_ == -107)
	    ((Class62) this).anInt441 = argument_8_;
    }
    
    Class62_Sub24(Node_Sub50 argument_10_) {
	super(argument_10_);
    }
    
    static {
	aShortArrayArray4440
	    = new short[][] { aShortArray4441, aShortArray4438,
			      aShortArray4442 };
    }
}
