/* Class389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class389
{
    static int anInt3280;
    static GraphicsToolkit aGraphicsToolkit3281;

    public static void method4131(int argument) {
	aGraphicsToolkit3281 = null;
    }
    
    static final void method4132(int argument, Packet argument_0_) {
	byte[] anLocalInts = new byte[argument];
	if (client.randomFile != null) {
	    try {
		client.randomFile.seek(0L);
		client.randomFile.read(anLocalInts);
		int anLocalInt;
		for (anLocalInt = 0; anLocalInt < 24; anLocalInt++) {
		    if (anLocalInts[anLocalInt] != 0)
			break;
		}
		if (anLocalInt >= 24)
		    throw new IOException();
	    } catch (Exception exception) {
		for (int anLocalInt = 0; anLocalInt < 24; anLocalInt++)
		    anLocalInts[anLocalInt] = (byte) -1;
	    }
	}
	argument_0_.pbytes(anLocalInts, 0, 24);
    }
    
    static final void method4133(int argument, double argument_1_) {
	if (argument_1_ != Class305.aDouble3645) {
	    for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
		int anLocalInt_2_
		    = (int) (Math.pow((double) anLocalInt / 255.0, argument_1_)
			     * 255.0);
		Statics.anIntArray5209[anLocalInt]
		    = anLocalInt_2_ > 255 ? 255 : anLocalInt_2_;
	    }
	    Class305.aDouble3645 = argument_1_;
	}
    }

    static final void method4135(int argument, int argument_22_) {
	Node_Sub23 class59_sub23
	    = ((Node_Sub23)
	       Node_Sub37_Sub1.aJagexHashMap_6114.get((long) argument_22_));
	if (class59_sub23 != null) {
	    ((Node_Sub23) class59_sub23).aClass109_Sub1_4050.method1966(-2);
	    Statics.method2861(102, ((Node_Sub23) class59_sub23).anInt4053, ((Node_Sub23) class59_sub23).aBoolean4051);
	    class59_sub23.unlink();
	}
    }
}
