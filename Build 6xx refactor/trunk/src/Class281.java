/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class281
{
    static int anInt2272;
    static boolean aBoolean2273 = true;
    static Js5Store aJs5Store_2274;
    
    public static void method3443(int argument) {
	aJs5Store_2274 = null;
    }
    
    static final void method3444(int argument, int argument_0_,
				 int argument_1_, boolean argument_2_,
				 boolean argument_3_) {
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub26_4295.method1464(40)
	    == 0)
	    Class259.method3307(false, (byte) -95);
	else {
	    Class385.anInt3575 = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				     .aClass62_Sub26_4295.method1464(6);
	    Class215.method2991((byte) -41, true, 0);
	}
	Class45.anInt314 = argument_1_;
	Class62_Sub28.aBoolean4461 = argument_2_;
	Class182.anInt1377 = argument_0_;
	Class179.method2810(argument);
    }
    
    static final Class301 method3445(byte argument, byte[] argument_4_,
				     int argument_5_,
				     GraphicsToolkit_Sub2_Sub1 argument_6_) {
	if (argument_4_ == null)
	    return null;
	int anLocalInt = OpenGL.glGenProgramARB();
	OpenGL.glBindProgramARB(argument_5_, anLocalInt);
	OpenGL.glProgramRawARB(argument_5_, 34933, argument_4_);
	OpenGL.glGetIntegerv(34379, RsInterface.anIntArray1940, 0);
	if (RsInterface.anIntArray1940[0] != -1) {
	    OpenGL.glBindProgramARB(argument_5_, 0);
	    return null;
	}
	OpenGL.glBindProgramARB(argument_5_, 0);
	return new Class301(argument_6_, argument_5_, anLocalInt);
    }
}
