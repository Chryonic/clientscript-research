/* Class62_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub12 extends Class62
{
    static int anInt4402 = 0;
    
    Class62_Sub12(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final int method1401(int argument_1_) {
	return ((Class62) this).anInt441;
    }
    
    Class62_Sub12(int argument_2_, Node_Sub50 argument_3_) {
	super(argument_2_, argument_3_);
    }
    
    static final boolean method1402(int argument, boolean argument_4_,
				    int argument_5_) {
	if ((argument & 0x22) == 0)
	    return false;
	return true;
    }
    
    static final void method1403(int argument, String argument_6_,
				 String argument_7_, String argument_8_,
				 int argument_9_, String argument_10_,
				 int argument_11_) {
	Class266.method3343(argument, true, argument_10_, argument_6_, -1,
			    argument_7_, argument_9_, argument_8_, null);
    }
    
    final void method1346(boolean argument_12_) {
	if (argument_12_)
	    method1401(117);
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    final int method1342(int argument_13_, byte argument_14_) {
	int anLocalInt = 26 % ((-53 - argument_14_) / 50);
	return 1;
    }
    
    final void method1343(int argument_15_, byte argument_16_) {
	((Class62) this).anInt441 = argument_15_;
	if (argument_16_ != -107)
	    anInt4402 = 66;
    }
    
    final int method1344(byte argument_17_) {
	if (argument_17_ != 4)
	    return -27;
	return 1;
    }
}
