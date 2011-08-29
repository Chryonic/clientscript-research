/* Class362 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class362
{
    static boolean aBoolean3058;
    static int[] anIntArray3059 = new int[8];
    private Class149 aClass149_3060 = new Class149(64);
    private Js5Store aJs5Store_3061;
    
    public static void method3959(int argument) {
	anIntArray3059 = null;
    }
    
    final Class315 method3960(boolean argument_0_, int argument_1_) {
	Class315 class315;
	synchronized (aClass149_3060) {
	    class315
		= (Class315) aClass149_3060.get((long) argument_1_);
	}
	if (class315 != null)
	    return class315;
	byte[] anLocalInts;
	synchronized (aJs5Store_3061) {
	    anLocalInts = aJs5Store_3061.getData(11, argument_1_);
	}
	class315 = new Class315();
	if (anLocalInts != null)
	    class315.method3629(new Packet(anLocalInts), -23621);
	synchronized (aClass149_3060) {
	    aClass149_3060.put(class315, (long) argument_1_);
	}
	return class315;
    }
    
    final void method3961(byte argument_2_) {
	synchronized (aClass149_3060) {
	    if (argument_2_ != -6) {
		/* empty */
	    } else
		aClass149_3060.clear((byte) -3);
	}
    }
    
    static final Node_Sub50 method3962(int argument) {
	FileOnDisk fileOnDisk = null;
	Node_Sub50 class59_sub50
	    = new Node_Sub50(client.selectedGame, argument);
	try {
	    SignlinkRequest signlinkRequest
		= Applet_Sub1.baseSignlink.requestPreferencesFile("", true);
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
                    (-anLocalInt_3_
                            + anLocalInts.length)
            );
		    if (anLocalInt == -1)
			throw new IOException("EOF");
		}
		class59_sub50
		    = new Node_Sub50(new Packet(anLocalInts),
					client.selectedGame, 0);
	    }
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (fileOnDisk != null)
		fileOnDisk.close();
	} catch (Exception exception) {
	    /* empty */
	}
	return class59_sub50;
    }
    
    final void method3963(int argument_4_) {
	synchronized (aClass149_3060) {
	    aClass149_3060.method2540(-127);
	}
    }
    
    static final void method3964(int argument) {
	if (Class353.aBoolean2953) {
	    if (argument != 0)
		method3964(-82);
	    RsInterface rsInterface
		= RsInterface.getCreatedChild(Class297.anInt2472, Statics.anInt1181);
	    if (rsInterface != null
		&& ((RsInterface) rsInterface).anObjectArray1828 != null) {
		Cs2Trigger class59_sub27 = new Cs2Trigger();
		((Cs2Trigger) class59_sub27).parameters
		    = ((RsInterface) rsInterface).anObjectArray1828;
		((Cs2Trigger) class59_sub27).aRsInterface_4115 = rsInterface;
		Cs2Runtime.executeTrigger(class59_sub27);
	    }
	    Class62_Sub10.anInt4399 = -1;
	    Statics.anInt4519 = -1;
	    Class353.aBoolean2953 = false;
	    if (rsInterface != null)
		Class256.method3280(rsInterface, true);
	}
    }
    
    final void method3965(int argument_5_, int argument_6_) {
	synchronized (aClass149_3060) {
	    aClass149_3060.method2534(argument_5_, (byte) -8);
	}
    }
    
    Class362(GameEnum argument_7_, int argument_8_, Js5Store argument_9_) {
	aJs5Store_3061 = argument_9_;
	if (aJs5Store_3061 != null)
	    aJs5Store_3061.getSubFileCount(11);
    }
    
    static {
	aBoolean3058 = true;
    }
}
