/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48
{
    short aShort340;
    byte aByte341;
    short[] aShortArray342;
    static Class73 aClass73_343;
    static RsInterface[] aRsInterfaceArray344;
    int[] anIntArray345;
    short[] aShortArray346;
    int[] anIntArray347 = new int[4];
    int[] anIntArray348;
    static float aFloat349;
    short aShort350;
    short aShort352;
    short aShort353;
    byte aByte354;
    short[] aShortArray355;
    
    public static void method455(byte argument) {
	GlToolkitNr2Shader.anIntArray351 = null;
	aRsInterfaceArray344 = null;
	aClass73_343 = null;
    }
    
    static final void method456(String argument, String argument_0_,
				int argument_1_, int argument_2_) {
	Node_Sub13.anInt3978 = argument_1_;
	Class353_Sub6.anInt5507 = 2;
	Class62_Sub4.method1367(argument, false, 0, argument_0_, false);
    }
    
    Class48(int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	    int argument_7_, int argument_8_, int argument_9_,
	    int argument_10_, int argument_11_, int argument_12_,
	    int argument_13_, int argument_14_, int argument_15_,
	    int argument_16_) {
	((Class48) this).aByte341 = (byte) argument_3_;
	((Class48) this).anIntArray345 = new int[4];
	((Class48) this).anIntArray348 = new int[4];
	((Class48) this).aByte354 = (byte) argument_4_;
	((Class48) this).anIntArray347[3] = argument_8_;
	((Class48) this).anIntArray347[2] = argument_7_;
	((Class48) this).anIntArray347[1] = argument_6_;
	((Class48) this).anIntArray347[0] = argument_5_;
	((Class48) this).anIntArray348[0] = argument_9_;
	((Class48) this).anIntArray348[2] = argument_11_;
	((Class48) this).anIntArray348[3] = argument_12_;
	((Class48) this).anIntArray348[1] = argument_10_;
	((Class48) this).anIntArray345[2] = argument_15_;
	((Class48) this).aShort352
	    = (short) (argument_5_ >> LightingManager.lightCoordRShift);
	((Class48) this).anIntArray345[1] = argument_14_;
	((Class48) this).anIntArray345[3] = argument_16_;
	((Class48) this).anIntArray345[0] = argument_13_;
	((Class48) this).aShort350
	    = (short) (argument_7_ >> LightingManager.lightCoordRShift);
	((Class48) this).aShort353
	    = (short) (argument_13_ >> LightingManager.lightCoordRShift);
	((Class48) this).aShort340
	    = (short) (argument_15_ >> LightingManager.lightCoordRShift);
	((Class48) this).aShortArray342 = new short[4];
	((Class48) this).aShortArray355 = new short[4];
	((Class48) this).aShortArray346 = new short[4];
    }
}
