/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class18
{
    static boolean aBoolean124 = true;
    static Class368 aClass368_125;
    static String[] aStringArray126 = new String[100];
    static boolean aBoolean127 = true;
    
    static final Frame method307(Signlink argument, int argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	if (!argument.isInitialized())
	    return null;
	if ((argument_2_ ^ 0xffffffff) == argument_0_) {
	    Class259[] class259s
		= Statics.method1191(-128, argument);
	    if (class259s == null)
		return null;
	    boolean anLocalBoolean = false;
	    for (int anLocalInt = 0; anLocalInt < class259s.length;
		 anLocalInt++) {
		if (((Class259) class259s[anLocalInt]).anInt2019 == argument_1_
		    && (argument_3_
			== ((Class259) class259s[anLocalInt]).anInt2018)
		    && (argument_4_ == 0
			|| (argument_4_
			    == ((Class259) class259s[anLocalInt]).anInt2024))
		    && (!anLocalBoolean
			|| (argument_2_
			    < ((Class259) class259s[anLocalInt]).anInt2017))) {
		    anLocalBoolean = true;
		    argument_2_ = ((Class259) class259s[anLocalInt]).anInt2017;
		}
	    }
	    if (!anLocalBoolean)
		return null;
	}
	SignlinkRequest signlinkRequest = argument.requestFullScreenWindow(argument_1_, argument_4_, argument_2_, argument_3_);
	while (signlinkRequest.status == 0)
	    Timing.sleep(10L);
	Frame frame = (Frame) signlinkRequest.result;
	if (frame == null)
	    return null;
	if (signlinkRequest.status == 2) {
	    RsInterface.method3210(argument, 119, frame);
	    return null;
	}
	return frame;
    }

    public static void method309(int argument) {
	aStringArray126 = null;
	aClass368_125 = null;
    }
    
    static final int method310(int argument) {
	return client.bootDataFITCRC;
    }
}
