/* Class62_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub22 extends Class62
{
    static Class207 aClass207_4434 = new Class207(6, 7);
    static boolean[][][] aBooleanArrayArrayArray4435;
    static Class244 aClass244_4436;
    
    public static void method1445(int argument) {
	aBooleanArrayArrayArray4435 = null;
	aClass244_4436 = null;
	aClass207_4434 = null;
    }
    
    Class62_Sub22(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final int method1446(int argument_1_) {
	return ((Class62) this).anInt441;
    }
    
    final int method1342(int argument_2_, byte argument_3_) {
	int anLocalInt = 36 / ((-53 - argument_3_) / 50);
	return 1;
    }
    
    final void method1346(boolean argument_4_) {
	if (!argument_4_) {
	    if (((Class62) this).anInt441 < 0
		&& ((Class62) this).anInt441 > 127)
		((Class62) this).anInt441 = method1344((byte) 4);
	}
    }
    
    Class62_Sub22(int argument_5_, Node_Sub50 argument_6_) {
	super(argument_5_, argument_6_);
    }
    
    final int method1344(byte argument_7_) {
	if (argument_7_ != 4)
	    aClass207_4434 = null;
	return 127;
    }
    
    final void method1343(int argument_8_, byte argument_9_) {
	((Class62) this).anInt441 = argument_8_;
	if (argument_9_ != -107)
	    method1344((byte) 86);
    }
    
    static final int method1447(boolean argument) {
	if (Class298.anIntArray2476 == null)
	    return 0;
	return Class298.anIntArray2476.length * 2;
    }
}
