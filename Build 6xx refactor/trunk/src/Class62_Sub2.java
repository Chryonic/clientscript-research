/* Class62_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class62_Sub2 extends Class62
{
    static SignlinkRequest aSignlinkRequest_4365;
    static Class329 aClass329_4366 = new Class329(3, 4);
    private static char[] aCharArray4367 = new char[64];
    static Class166 aClass166_4368;

    final void method1346(boolean argument_0_) {
	if (!argument_0_)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final int method1352(int argument, int argument_1_) {
	if (Class62_Sub25.aShortArrayArray4443 != null)
	    return (Class62_Sub25.aShortArrayArray4443[argument][argument_1_]
		    & 0xffff);
	return 0;
    }
    
    final int method1353(int argument_2_) {
	return ((Class62) this).anInt441;
    }
    
    static final void method1354(int argument) {
	FileOnDisk fileOnDisk = null;
	if (argument != 4)
	    method1352(-66, -25);
	try {
	    SignlinkRequest signlinkRequest
		= Applet_Sub1.baseSignlink.requestPreferencesFile("2", true);
	    while (signlinkRequest.status == 0)
		Timing.sleep(1L);
	    if (signlinkRequest.status == 1) {
		fileOnDisk = (FileOnDisk) signlinkRequest.result;
		byte[] anLocalInts
		    = new byte[(int) fileOnDisk.length()];
		int anLocalInt;
		for (int anLocalInt_3_ = 0; anLocalInts.length > anLocalInt_3_;
		     anLocalInt_3_ += anLocalInt) {
		    anLocalInt
			= fileOnDisk.read(anLocalInts, anLocalInt_3_,
                    (anLocalInts.length
                            - anLocalInt_3_)
            );
		    if (anLocalInt == -1)
			throw new IOException("EOF");
		}
		Statics.method294(argument, new Packet(anLocalInts));
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	do {
	    try {
		if (fileOnDisk == null)
		    break;
		fileOnDisk.close();
	    } catch (Exception exception) {
		/* empty */
	    }
	    break;
	} while (false);
    }
    
    public static void method1355(int argument) {
	aCharArray4367 = null;
	aClass166_4368 = null;
	aClass329_4366 = null;
	aSignlinkRequest_4365 = null;
    }
    
    final int method1342(int argument_4_, byte argument_5_) {
	int anLocalInt = 117 % ((-53 - argument_5_) / 50);
	return 3;
    }
    
    final void method1343(int argument_6_, byte argument_7_) {
	if (argument_7_ != -107)
	    method1355(37);
	((Class62) this).anInt441 = argument_6_;
    }
    
    static final int method1356(int argument, int argument_8_) {
	int anLocalInt = (argument * argument >> 12) * argument >> 12;
	int anLocalInt_9_ = argument * 6 - 61440;
	int anLocalInt_10_ = (anLocalInt_9_ * argument >> 12) + 40960;
	return anLocalInt_10_ * anLocalInt >> 12;
    }
    
    Class62_Sub2(int argument_11_, Node_Sub50 argument_12_) {
	super(argument_11_, argument_12_);
    }
    
    final int method1344(byte argument_13_) {
	if (argument_13_ != 4)
	    return 32;
	if (((Class62) this).aClass59_Sub50_440.method1164((byte) -116))
	    return 1;
	return 0;
    }
    
    Class62_Sub2(Node_Sub50 argument_14_) {
	super(argument_14_);
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < 26; anLocalInt++)
	    aCharArray4367[anLocalInt] = (char) (anLocalInt + 65);
	for (int anLocalInt = 26; anLocalInt < 52; anLocalInt++)
	    aCharArray4367[anLocalInt] = (char) (anLocalInt + 71);
	for (int anLocalInt = 52; anLocalInt < 62; anLocalInt++)
	    aCharArray4367[anLocalInt] = (char) (anLocalInt - 4);
	aCharArray4367[63] = '/';
	aCharArray4367[62] = '+';
	aClass166_4368 = new Class166(59, 1);
    }
}
