/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class315
{
    boolean aBoolean2605 = true;
    String aString2606;
    int anInt2607;
    private char aChar2608;
    static Class166 aClass166_2609 = new Class166(41, 3);
    static int[] anIntArray2610 = new int[13];
    
    final void method3629(Packet argument_0_, int argument_1_) {
	for (;;) {
	    int anLocalInt = argument_0_.g1();
	    if (anLocalInt == 0)
		break;
	    method3633(argument_0_, 125, anLocalInt);
	}
    }
    
    static final int method3630(int argument, boolean argument_2_,
				int argument_3_, int argument_4_) {
	Node_Sub5 class59_sub5
	    = Class365.method3969((byte) 103, argument_4_, argument_2_);
	if (class59_sub5 == null)
	    return 0;
	if (argument < argument_3_
	    || argument >= ((Node_Sub5) class59_sub5).anIntArray3895.length)
	    return 0;
	return ((Node_Sub5) class59_sub5).anIntArray3895[argument];
    }
    
    final boolean method3631(int argument_5_) {
	if (aChar2608 != 's')
	    return false;
	return true;
    }
    
    public Class315() {
	/* empty */
    }
    
    public static void method3632(int argument) {
	aClass166_2609 = null;
	anIntArray2610 = null;
    }
    
    private final void method3633(Packet argument_6_, int argument_7_,
				  int argument_8_) {
	if (argument_7_ < 96)
	    method3633(null, -111, 76);
	if (argument_8_ != 1) {
	    if (argument_8_ == 2)
		((Class315) this).anInt2607 = argument_6_.g4();
	    else if (argument_8_ != 4) {
		if (argument_8_ == 5)
		    ((Class315) this).aString2606
			= argument_6_.gstr();
	    } else
		((Class315) this).aBoolean2605 = false;
	} else
	    aChar2608 = JagexStringUtils.parseCharacter(argument_6_.g1s());
    }
}
