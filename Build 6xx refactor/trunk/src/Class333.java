/* Class333 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class333
{
    private Js5Store aJs5Store_2719;
    public static int anInt2720 = 0;
    private Class149 aClass149_2721 = new Class149(16);
    
    final void method3725(int argument_0_) {
	synchronized (aClass149_2721) {
	    aClass149_2721.clear((byte) -3);
	}
    }
    
    final void method3726(int argument_1_) {
	synchronized (aClass149_2721) {
	    aClass149_2721.method2540(-121);
	}
    }
    
    final Class195 method3727(int argument_2_, int argument_3_,
			      Class64 argument_4_, int argument_5_,
			      int argument_6_, int argument_7_) {
	if (argument_2_ != -18085)
	    anInt2720 = 72;
	Class343[] class343s = null;
	Class377 class377 = method3728(argument_7_, (byte) 90);
	if (class377.anIntArray3215 != null) {
	    class343s
		= new Class343[class377.anIntArray3215.length];
	    for (int anLocalInt = 0; anLocalInt < class343s.length;
		 anLocalInt++) {
		Class117 class117
		    = argument_4_.method1484((class377
					      .anIntArray3215[anLocalInt]),
					     argument_2_ ^ 0x46c3);
		class343s[anLocalInt]
		    = new Class343(class117.anInt960,
				   class117.anInt963,
				   class117.anInt962,
				   class117.anInt959,
				   class117.anInt957,
				   class117.anInt958,
				   class117.anInt964,
				   class117.aBoolean956);
	    }
	}
	return new Class195(class377.anInt3217, class343s,
			    class377.anInt3216, argument_6_,
			    argument_3_, argument_5_);
    }
    
    private final Class377 method3728(int argument_8_, byte argument_9_) {
	Class377 class377;
	synchronized (aClass149_2721) {
	    class377
		= (Class377) aClass149_2721.get((long) argument_8_);
	}
	if (class377 != null)
	    return class377;
	byte[] anLocalInts;
	synchronized (aJs5Store_2719) {
	    anLocalInts
		= aJs5Store_2719.getData(29, argument_8_);
	}
	class377 = new Class377();
	if (anLocalInts != null)
	    class377.method4093((byte) 102, new Packet(anLocalInts));
	synchronized (aClass149_2721) {
	    if (argument_9_ != 90)
		return null;
	    aClass149_2721.put(class377, (long) argument_8_);
	}
	return class377;
    }
    
    final void method3729(int argument_10_, byte argument_11_) {
	synchronized (aClass149_2721) {
	    aClass149_2721.method2534(argument_10_, (byte) -8);
	}
    }
    
    Class333(GameEnum argument_12_, int argument_13_, Js5Store argument_14_) {
	aJs5Store_2719 = argument_14_;
	aJs5Store_2719.getSubFileCount(29);
    }
}
