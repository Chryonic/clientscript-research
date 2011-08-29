/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64
{
    static int anInt448 = 0;
    static int anInt449 = 0;
    static int anInt450 = 0;
    static int anInt451 = -1;
    private Class149 aClass149_452 = new Class149(16);
    private Js5Store aJs5Store_453;
    
    final Class117 method1484(int argument_0_, int argument_1_) {
	Class117 class117;
	synchronized (aClass149_452) {
	    class117
		= (Class117) aClass149_452.get((long) argument_0_);
	}
	if (class117 != null)
	    return class117;
	byte[] anLocalInts;
	synchronized (aJs5Store_453) {
	    anLocalInts = aJs5Store_453.getData(30, argument_0_);
	}
	class117 = new Class117();
	if (anLocalInts != null)
	    class117.method2374((byte) 123, new Packet(anLocalInts));
	synchronized (aClass149_452) {
	    aClass149_452.put(class117, (long) argument_0_);
	}
	return class117;
    }
    
    final void method1485(byte argument_2_, int argument_3_) {
	synchronized (aClass149_452) {
	    aClass149_452.method2534(argument_3_, (byte) -8);
	}
    }
    
    final void method1486(int argument_4_) {
	synchronized (aClass149_452) {
	    aClass149_452.method2540(-128);
	}
    }
    
    final void method1487(byte argument_5_) {
	synchronized (aClass149_452) {
	    aClass149_452.clear((byte) -3);
	}
    }
    
    Class64(GameEnum argument_6_, int argument_7_, Js5Store argument_8_) {
	aJs5Store_453 = argument_8_;
	aJs5Store_453.getSubFileCount(30);
    }
}
