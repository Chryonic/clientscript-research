/* Class62_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub11 extends Class62
{
    static int[] anIntArray4401 = new int[4096];
    
    final int method1342(int argument_0_, byte argument_1_) {
	int anLocalInt = 121 % ((-53 - argument_1_) / 50);
	return 1;
    }
    
    static final void method1398(int argument, int argument_2_,
				 int argument_3_) {
	if (Class295.method3505((byte) -48)) {
	    if (Class141.anInt1099 != argument_2_)
		Node_Sub31_Sub1.aString5837 = "";
	    Node_Sub13.anInt3978 = argument;
	    Class141.anInt1099 = argument_2_;
	    Class316.method3638(6, 2);
	}
    }
    
    final int method1344(byte argument_4_) {
	if (argument_4_ != 4)
	    anIntArray4401 = null;
	return 3;
    }
    
    final void method1346(boolean argument_5_) {
	if (argument_5_)
	    method1342(-21, (byte) 91);
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 4)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    Class62_Sub11(int argument_6_, Node_Sub50 argument_7_) {
	super(argument_6_, argument_7_);
    }
    
    final void method1343(int argument_8_, byte argument_9_) {
	if (argument_9_ == -107)
	    ((Class62) this).anInt441 = argument_8_;
    }
    
    final int getAnInt441() {
	return this.anInt441;
    }
    
    public static void method1400(int argument) {
	anIntArray4401 = null;
    }
    
    Class62_Sub11(Node_Sub50 argument_11_) {
	super(argument_11_);
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < 4096; anLocalInt++)
	    anIntArray4401[anLocalInt]
		= Class62_Sub2.method1356(anLocalInt, 0);
    }
}
