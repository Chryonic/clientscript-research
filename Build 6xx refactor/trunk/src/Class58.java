/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class58
{
    private Js5Store aJs5Store_421;
    static int anInt422 = 0;
    private Class149 aClass149_423 = new Class149(64);
    int anInt424;
    
    final Class79 method521(int argument_0_, byte argument_1_) {
	Class79 class79;
	synchronized (aClass149_423) {
	    class79
		= (Class79) aClass149_423.get((long) argument_0_);
	}
	if (class79 != null)
	    return class79;
	byte[] anLocalInts;
	synchronized (aJs5Store_421) {
	    anLocalInts = aJs5Store_421.getData(16, argument_0_);
	}
	class79 = new Class79();
	if (anLocalInts != null)
	    class79.method1580((byte) -50, new Packet(anLocalInts));
	synchronized (aClass149_423) {
	    aClass149_423.put(class79, (long) argument_0_);
	}
	return class79;
    }
    
    final void method522(byte argument_2_, int argument_3_) {
	synchronized (aClass149_423) {
	    aClass149_423.method2534(argument_3_, (byte) -8);
	}
    }
    
    final void method523(int argument_4_) {
	synchronized (aClass149_423) {
	    aClass149_423.clear((byte) -3);
	}
    }
    
    final void method524(byte argument_5_) {
	synchronized (aClass149_423) {
	    if (argument_5_ != -86) {
		/* empty */
	    } else
		aClass149_423.method2540(-125);
	}
    }
    
    Class58(GameEnum argument_6_, int argument_7_, Js5Store argument_8_) {
	aJs5Store_421 = argument_8_;
	if (aJs5Store_421 != null)
	    ((Class58) this).anInt424 = aJs5Store_421.getSubFileCount(16);
	else
	    ((Class58) this).anInt424 = 0;
    }
}
