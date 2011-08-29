/* Class344 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class344 implements Interface10
{
    static int anInt3590;
    private Js5Store aJs5Store_3591;
    static boolean aBoolean3593 = false;
    
    static final void method3799(boolean argument) {
	if (argument != true)
	    method3800(1.9383951F, -0.23207028F, 64, 1.1540762F, -17);
	if (FloatPacket.anIntArray5834 == null
	    || Class62_Sub7.anIntArray4392 == null) {
	    FloatPacket.anIntArray5834 = new int[256];
	    Class62_Sub7.anIntArray4392 = new int[256];
	    for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
		double d = (double) anLocalInt / 255.0 * 6.283185307179586;
		FloatPacket.anIntArray5834[anLocalInt]
		    = (int) (Math.sin(d) * 4096.0);
		Class62_Sub7.anIntArray4392[anLocalInt]
		    = (int) (Math.cos(d) * 4096.0);
	    }
	}
    }
    
    static final float method3800(float argument, float argument_0_,
				  int argument_1_, float argument_2_,
				  int argument_3_) {
	float[] fs = Statics.aFloatArrayArray6455[argument_3_];
	return argument_0_ * fs[0] + fs[1] * argument + fs[2] * argument_2_;
    }
    
    public final Class160 method48(int argument_4_) {
	if (argument_4_ != -12696)
	    method3801(1, -117, 95, 90, 1);
	return Class160.aClass160_1169;
    }
    
    public final int method49(byte argument_5_) {
	int anLocalInt = 6 / ((argument_5_ - 6) / 59);
	if (aJs5Store_3591.preloadAll())
	    return 100;
	return aJs5Store_3591.getProgress();
    }
    
    Class344(Js5Store argument_6_) {
	aJs5Store_3591 = argument_6_;
    }
    
    static final void method3801(int argument, int argument_7_,
				 int argument_8_, int argument_9_,
				 int argument_10_) {
	for (int anLocalInt = 0; Node_Sub47_Sub8.anInt6193 > anLocalInt;
	     anLocalInt++) {
	    Rectangle rectangle = Class_s.aRectangleArray2545[anLocalInt];
	    if (rectangle.x + rectangle.width > argument_7_
		&& argument_10_ + argument_7_ > rectangle.x
		&& rectangle.y + rectangle.height > argument_9_
		&& argument_8_ + argument_9_ > rectangle.y)
		Class109_Sub1.aBooleanArray4604[anLocalInt] = true;
	}
	Canvas_Sub1.method125(argument_10_ + argument_7_, (byte) -102,
			      argument_8_ + argument_9_, argument_9_,
			      argument_7_);
    }
}
