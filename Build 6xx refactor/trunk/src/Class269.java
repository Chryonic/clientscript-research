/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class269
{
    int anInt2146;
    static int anInt2147;
    int anInt2148;
    static int[] anIntArray2149;
    int anInt2150 = -1;
    int anInt2151;
    int anInt2152;
    static int[] anIntArray2153 = new int[1000];
    static Node_Sub1 aClass59_Sub1_2154;
    static int anInt2155;
    int anInt2156;
    int anInt2157;
    int anInt2158;
    int anInt2159;
    
    static final int method3360(int argument, int argument_0_, int argument_1_,
				int argument_2_, int argument_3_,
				int argument_4_, int argument_5_) {
	argument_2_ &= 0x3;
	if ((argument_0_ & 0x1) == 1) {
	    int anLocalInt = argument_4_;
	    argument_4_ = argument;
	    argument = anLocalInt;
	}
	if (argument_2_ == 0)
	    return argument_5_;
	if (argument_2_ == 1)
	    return -argument_4_ + 1 + (-argument_3_ + 7);
	if (argument_2_ == 2)
	    return -argument - argument_5_ + 1 + 7;
	return argument_3_;
    }
    
    public static void method3361(boolean argument) {
	anIntArray2153 = null;
	anIntArray2149 = null;
	aClass59_Sub1_2154 = null;
    }
    
    Class269(Entity argument_6_) {
	((Class269) this).anInt2148 = -1;
	((Class269) this).anInt2158 = -1;
    }
}
