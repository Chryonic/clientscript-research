/* Class59_Sub52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub52 extends Node
{
    byte[] aByteArray4346;
    static int[] anIntArray4347
	= { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
	    99, 99, 99, 99, 99, 99, 99, 120 };
    static int anInt4348;
    
    public static void method1317(byte argument) {
	anIntArray4347 = null;
    }
    
    static final int method1318(byte argument, DataType argument_0_) {
	if (argument_0_ != DataType.aDataType_1070) {
	    if (argument_0_ == DataType.aDataType_1072)
		return 5122;
	    if (DataType.aDataType_1073 != argument_0_) {
		if (argument_0_ == DataType.BYTE)
		    return 5121;
		if (DataType.aDataType_1075 == argument_0_)
		    return 5123;
		if (DataType.aDataType_1076 != argument_0_) {
		    if (argument_0_ == DataType.aDataType_1077)
			return 5131;
		    if (DataType.FLOAT == argument_0_)
			return 5126;
		} else
		    return 5125;
	    } else
		return 5124;
	} else
	    return 5120;
	throw new IllegalArgumentException("");
    }
    
    static final int method1319(int argument) {
	if (Class50.anInt365 == 1)
	    return Statics.anInt3831;
	return 0;
    }
    
    Node_Sub52(byte[] argument_1_) {
	((Node_Sub52) this).aByteArray4346 = argument_1_;
    }
    
    static {
	new Class211("", 73);
    }
}
