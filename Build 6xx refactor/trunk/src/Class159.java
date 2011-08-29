/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 implements Interface17
{
    int anInt3669;
    static float aFloat3670;
    int anInt3672;
    static boolean aBoolean3673 = false;
    float[] aFloatArray3674;
    static int[] anIntArray3675
	= { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191,
	    16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151,
	    4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
	    268435455, 536870911, 1073741823, 2147483647, -1 };
    
    static final boolean method2597(int argument, int argument_0_) {
	if (argument != 4 && argument != 8 && argument != 11)
	    return false;
	return true;
    }
    
    Class159(int argument_1_, int argument_2_) {
	((Class159) this).anInt3669 = argument_1_;
	((Class159) this).anInt3672 = argument_2_;
	((Class159) this).aFloatArray3674
	    = new float[argument_1_ * argument_2_];
    }
    
    public static void method2598(byte argument) {
	client.bootData = null;
	anIntArray3675 = null;
    }
}
