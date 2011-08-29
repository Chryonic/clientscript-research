/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class41
{
    static int anInt298;
    private Class149 aClass149_299 = new Class149(64);
    private Js5Store aJs5Store_300;
    static Class306 aClass306_301 = new Class306(1);
    static Class166 aClass166_302;
    static float aFloat303;
    static Class350 aClass350_304;
    Class61 aClass61_305;
    static int anInt306 = 0;
    static int[] anIntArray307;
    
    final void method415(boolean argument_0_) {
	synchronized (aClass149_299) {
	    aClass149_299.clear((byte) -3);
	}
    }

    public static void method418(int argument) {
	aClass166_302 = null;
	anIntArray307 = null;
	aClass306_301 = null;
	aClass350_304 = null;
    }
    
    final void method419(boolean argument_3_) {
	synchronized (aClass149_299) {
	    aClass149_299.method2540(14);
	}
    }
    
    final void method420(byte argument_4_, int argument_5_) {
	synchronized (aClass149_299) {
	    aClass149_299.method2534(argument_5_, (byte) -8);
	}
    }
    
    final Class354 method421(byte argument_6_, int argument_7_) {
	Class354 class354;
	synchronized (aClass149_299) {
	    class354
		= (Class354) aClass149_299.get((long) argument_7_);
	}
	if (class354 != null)
	    return class354;
	byte[] anLocalInts;
	synchronized (aJs5Store_300) {
	    anLocalInts = aJs5Store_300.getData(32, argument_7_);
	}
	class354 = new Class354();
	((Class354) class354).aClass41_2955 = this;
	if (anLocalInts != null)
	    class354.method3925(76, new Packet(anLocalInts));
	synchronized (aClass149_299) {
	    aClass149_299.put(class354, (long) argument_7_);
	}
	return class354;
    }
    
    Class41(GameEnum argument_8_, int argument_9_, Js5Store argument_10_,
	    Class61 argument_11_) {
	aJs5Store_300 = argument_10_;
	aJs5Store_300.getSubFileCount(32);
	((Class41) this).aClass61_305 = argument_11_;
    }
    
    static {
	aClass166_302 = new Class166(55, -2);
	anIntArray307 = new int[] { -1, -1, 1, 1 };
    }
}
