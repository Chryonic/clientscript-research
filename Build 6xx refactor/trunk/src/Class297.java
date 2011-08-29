/* Class297 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class297
{
    private Js5Store aJs5Store_2468;
    static Class166 aClass166_2469;
    private Class149 aClass149_2470 = new Class149(128);
    static int[] anIntArray2471 = { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    static int anInt2472;
    
    final Class260 method3512(int argument_0_, int argument_1_) {
	Class260 class260;
	synchronized (aClass149_2470) {
	    class260
		= (Class260) aClass149_2470.get((long) argument_1_);
	}
	if (class260 != null)
	    return class260;
	byte[] anLocalInts;
	synchronized (aJs5Store_2468) {
	    anLocalInts = aJs5Store_2468.getData(1, argument_1_);
	}
	class260 = new Class260();
	if (anLocalInts != null)
	    class260.method3315(2, new Packet(anLocalInts));
	synchronized (aClass149_2470) {
	    aClass149_2470.put(class260, (long) argument_1_);
	}
	return class260;
    }
    
    public static void method3513(int argument) {
	aClass166_2469 = null;
	anIntArray2471 = null;
    }
    
    final void method3514(int argument_2_, int argument_3_) {
	synchronized (aClass149_2470) {
	    aClass149_2470.method2534(argument_2_, (byte) -8);
	}
    }
    
    final void method3515(int argument_4_) {
	synchronized (aClass149_2470) {
	    if (argument_4_ != 1)
		aClass149_2470 = null;
	    aClass149_2470.method2540(argument_4_ - 123);
	}
    }
    
    Class297(GameEnum argument_5_, int argument_6_, Js5Store argument_7_) {
	aJs5Store_2468 = argument_7_;
	aJs5Store_2468.getSubFileCount(1);
    }
    
    final void method3516(int argument_8_) {
	synchronized (aClass149_2470) {
	    if (argument_8_ > -61) {
		/* empty */
	    } else
		aClass149_2470.clear((byte) -3);
	}
    }
    
    static {
	aClass166_2469 = new Class166(20, 10);
    }
}
