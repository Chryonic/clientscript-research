/* Class62_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub15 extends Class62
{
    static int[] anIntArray4413 = new int[8];
    
    final void method1343(int argument_0_, byte argument_1_) {
	((Class62) this).anInt441 = argument_0_;
	if (argument_1_ != -107) {
	    /* empty */
	}
    }
    
    Class62_Sub15(Node_Sub50 argument_2_) {
	super(argument_2_);
    }
    
    final void method1346(boolean argument_3_) {
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_3_) {
	    /* empty */
	}
    }
    
    Class62_Sub15(int argument_4_, Node_Sub50 argument_5_) {
	super(argument_4_, argument_5_);
    }
    
    public static void method1415(int argument) {
	anIntArray4413 = null;
    }
    
    final int method1342(int argument_6_, byte argument_7_) {
	int anLocalInt = -100 / ((-53 - argument_7_) / 50);
	return 1;
    }
    
    final int method1344(byte argument_8_) {
	if (argument_8_ != 4)
	    method1343(-1, (byte) -87);
	return 0;
    }
    
    final int method1416(int argument_9_) {
	return ((Class62) this).anInt441;
    }
    
    static final void method1417(byte argument) {
	if (Class275.anObject2206 == null) {
	    Class245_Sub2_Sub2 class245_sub2_sub2 = new Class245_Sub2_Sub2();
	    byte[] anLocalInts
		= class245_sub2_sub2.method3196(16, -31095, 128, 128);
	    Class275.anObject2206
		= Class183_Sub1.wrap(anLocalInts, false, -137);
	}
	if (Statics.anObject5494 == null) {
	    Class245_Sub1_Sub1 class245_sub1_sub1 = new Class245_Sub1_Sub1();
	    byte[] anLocalInts
		= class245_sub1_sub1.method3180(-93, 128, 128, 16);
	    Statics.anObject5494
		= Class183_Sub1.wrap(anLocalInts, false, -137);
	}
    }
}
