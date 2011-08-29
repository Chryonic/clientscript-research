/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73
{
    private Class149 aClass149_499 = new Class149(64);
    static int anInt500;
    static int anInt501;
    private Js5Store aJs5Store_502;
    
    static final int method1538(int argument, byte argument_0_,
				int argument_1_) {
	int anLocalInt;
	if (argument_1_ <= 20000) {
	    if (argument_1_ > 10000) {
		anLocalInt = 3;
		Node_Sub7.method569(0);
	    } else if (argument_1_ > 5000) {
		anLocalInt = 2;
		Class62_Sub29.method1476(1);
	    } else {
		Statics.method413(true, (byte) -120);
		anLocalInt = 1;
	    }
	} else {
	    Class2_Sub1.method199(-18861);
	    anLocalInt = 4;
	}
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub26_4295.method1464(113)
	    != argument) {
	    AthmosphericConditions.aClass59_Sub50_116.method1159(argument,
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub26_4316),
						  98);
	    Class215.method2991((byte) -41, false, argument);
	}
	Class251.method3240(false);
	return anLocalInt;
    }
    
    final Class223 method1539(int argument_2_, byte argument_3_) {
	Class223 class223;
	synchronized (aClass149_499) {
	    if (argument_3_ != -59)
		anInt501 = 80;
	    class223
		= (Class223) aClass149_499.get((long) argument_2_);
	}
	if (class223 != null)
	    return class223;
	byte[] anLocalInts;
	synchronized (aJs5Store_502) {
	    anLocalInts
		= aJs5Store_502.getData(31, argument_2_);
	}
	class223 = new Class223();
	if (anLocalInts != null)
	    class223.method3040(new Packet(anLocalInts), -1);
	synchronized (aClass149_499) {
	    aClass149_499.put(class223, (long) argument_2_);
	}
	return class223;
    }
    
    static final void method1540() {
	Statics.method2456(1, LightingManager.yMapSize);
    }

    final void method1542(int argument_5_, boolean argument_6_) {
	synchronized (aClass149_499) {
	    aClass149_499.method2534(argument_5_, (byte) -8);
	}
    }
    
    final void method1543(int argument_7_) {
	synchronized (aClass149_499) {
	    aClass149_499.clear((byte) -3);
	}
    }
    
    final void method1544(boolean argument_8_) {
	synchronized (aClass149_499) {
	    aClass149_499.method2540(-125);
	}
    }
    
    Class73(GameEnum argument_9_, int argument_10_, Js5Store argument_11_) {
	aJs5Store_502 = argument_11_;
	aJs5Store_502.getSubFileCount(31);
    }
}
