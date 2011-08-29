/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55
{
    static float[] aFloatArray395;
    int anInt396;
    int anInt397;
    int anInt398;
    boolean aBoolean399;
    int anInt400;
    short aShort401;
    byte aByte402;
    static float[] aFloatArray403 = new float[16384];
    int anInt404;
    short aShort405;
    static Class166 aClass166_406;
    short aShort407;
    static int anInt408;
    static int anInt409;
    
    public static void method491(byte argument) {
	aClass166_406 = null;
	aFloatArray403 = null;
	aFloatArray395 = null;
    }
    
    Class55(int argument_0_, int argument_1_, int argument_2_, int argument_3_,
	    int argument_4_, int argument_5_, int argument_6_, int argument_7_,
	    int argument_8_, boolean argument_9_, boolean argument_10_,
	    int argument_11_) {
	((Class55) this).anInt398 = argument_3_;
	((Class55) this).anInt396 = argument_0_;
	((Class55) this).anInt397 = argument_2_;
	((Class55) this).aBoolean399 = argument_10_;
	((Class55) this).aShort401 = (short) argument_6_;
	((Class55) this).aShort405 = (short) argument_4_;
	((Class55) this).aByte402 = (byte) argument_8_;
	((Class55) this).aShort407 = (short) argument_5_;
	((Class55) this).anInt404 = argument_1_;
	((Class55) this).anInt400 = argument_11_;
    }
    
    static {
	aFloatArray395 = new float[16384];
	double d = 3.834951969714103E-4;
	for (int anLocalInt = 0; anLocalInt < 16384; anLocalInt++) {
	    aFloatArray403[anLocalInt]
		= (float) Math.sin((double) anLocalInt * d);
	    aFloatArray395[anLocalInt]
		= (float) Math.cos(d * (double) anLocalInt);
	}
	aClass166_406 = new Class166(22, 6);
	anInt409 = -1;
    }
}
