/* Class62_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub23 extends Class62
{
    static int anInt4437;
    
    Class62_Sub23(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final void method1343(int argument_1_, byte argument_2_) {
	if (argument_2_ != -107)
	    method1343(-117, (byte) 74);
	((Class62) this).anInt441 = argument_1_;
    }
    
    final void method1346(boolean argument_3_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -115))
	    ((Class62) this).anInt441 = 2;
	if (argument_3_)
	    anInt4437 = -25;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 2)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final void method1448(Node_Sub9 argument, int argument_4_) {
	((Node_Sub9) argument).aBoolean3931 = false;
	if (((Node_Sub9) argument).aClass59_Sub40_3930 != null)
	    ((Node_Sub40) ((Node_Sub9) argument).aClass59_Sub40_3930)
		.anInt4199
		= 0;
	for (Node_Sub9 class59_sub9 = argument.method573();
	     class59_sub9 != null; class59_sub9 = argument.method577())
	    method1448(class59_sub9, 1);
    }
    
    final int method1342(int argument_5_, byte argument_6_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -102))
	    return 3;
	return 1;
    }
    
    final int method1344(byte argument_7_) {
	if (argument_7_ != 4)
	    anInt4437 = -75;
	if (!((Class62) this).aClass59_Sub50_440.method1164((byte) -126)) {
	    if (!((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		     .aClass62_Sub26_4295.method1462(8192)
		|| !GlTexture_Sub3.method2497(((Node_Sub50) (((Class62) this).aClass59_Sub50_440)).aClass62_Sub26_4295.method1464(98), -1))
		return 0;
	    return 1;
	}
	return 2;
    }
    
    final int method1449(int argument_8_) {
	return ((Class62) this).anInt441;
    }
    
    Class62_Sub23(int argument_9_, Node_Sub50 argument_10_) {
	super(argument_9_, argument_10_);
    }
    
    final boolean method1450(int argument_11_) {
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -116))
	    return false;
	return true;
    }
}
