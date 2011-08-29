/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class209
{
    static int[][] anIntArrayArray1496
	= { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 },
	    { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 },
	    { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 },
	    { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 },
	    { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
    static Class149 aClass149_1497 = new Class149(64);
    int anInt1498 = 1;
    static Class207 aClass207_1499 = new Class207(3, -1);
    char aChar1500;
    static Class349 aClass349_1501 = new Class349();
    static Class166 aClass166_1502 = new Class166(83, 2);
    static int anInt1503;
    static int anInt1504 = 0;
    
    public static void method2953(int argument) {
	aClass349_1501 = null;
	aClass166_1502 = null;
	aClass149_1497 = null;
	anIntArrayArray1496 = null;
	aClass207_1499 = null;
    }
    
    static final boolean method2954(int argument, int argument_0_) {
	if (argument != 7 && argument != 9)
	    return false;
	return true;
    }

    private final void method2956(int argument_1_, Packet argument_2_,
				  int argument_3_) {
	if (argument_3_ != 9)
	    method2956(69, null, 104);
	if (argument_1_ != 1) {
	    if (argument_1_ == 2)
		((Class209) this).anInt1498 = 0;
	} else
	    ((Class209) this).aChar1500
		= JagexStringUtils.parseCharacter(argument_2_.g1s());
    }
    
    final void method2957(Packet argument_4_, int argument_5_) {
	if (argument_5_ != 0)
	    method2956(-104, null, 68);
	for (;;) {
	    int anLocalInt = argument_4_.g1();
	    if (anLocalInt == 0)
		break;
	    method2956(anLocalInt, argument_4_, 9);
	}
    }
    
    public Class209() {
	/* empty */
    }
}
