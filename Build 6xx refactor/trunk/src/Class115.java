/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115
{
    static Class166 aClass166_950 = new Class166(34, 7);
    private Js5Store aJs5Store_951;
    Js5Store aJs5Store_952;
    Class149 aClass149_953 = new Class149(20);
    private Class149 aClass149_954 = new Class149(64);
    
    final void method2364(int argument_0_) {
	synchronized (aClass149_954) {
	    aClass149_954.clear((byte) -3);
	}
	synchronized (((Class115) this).aClass149_953) {
	    ((Class115) this).aClass149_953.clear((byte) -3);
	}
    }
    
    public static void method2365(int argument) {
	aClass166_950 = null;
    }
    
    static final int method2366(RsInterface argument, int argument_1_,
				int argument_2_) {
	if (!client.method122(argument).method712(19061, argument_2_)
	    && ((RsInterface) argument).anObjectArray1841 == null)
	    return -1;
	if (((RsInterface) argument).anIntArray1817 != null
	    && ((RsInterface) argument).anIntArray1817.length > argument_2_)
	    return ((RsInterface) argument).anIntArray1817[argument_2_];
	return -1;
    }
    
    final void method2367(int argument_3_, byte argument_4_) {
	synchronized (aClass149_954) {
	    aClass149_954.method2534(argument_3_, (byte) -8);
	}
	synchronized (((Class115) this).aClass149_953) {
	    ((Class115) this).aClass149_953.method2534(argument_3_, (byte) -8);
	}
    }
    
    final Class234 method2368(int argument_5_, int argument_6_) {
	Class234 class234;
	synchronized (aClass149_954) {
	    class234
		= (Class234) aClass149_954.get((long) argument_5_);
	    if (argument_6_ != -18112)
		((Class115) this).aJs5Store_952 = null;
	}
	if (class234 != null)
	    return class234;
	byte[] anLocalInts;
	synchronized (aJs5Store_951) {
	    anLocalInts
		= aJs5Store_951.getData(46, argument_5_);
	}
	class234 = new Class234();
	((Class234) class234).aClass115_1712 = this;
	if (anLocalInts != null)
	    class234.method3107(new Packet(anLocalInts), (byte) 73);
	synchronized (aClass149_954) {
	    aClass149_954.put(class234, (long) argument_5_);
	}
	return class234;
    }
    
    static final Class84_Sub1 method2369(int argument, int argument_7_) {
	if (!Class183.aBoolean1381 || DoublyLinkedNode_Sub51_Sub10.anInt5585 > argument
	    || Class62_Sub25.anInt4444 < argument)
	    return null;
	return (Statics.aClass84_Sub1Array6752
		[argument - DoublyLinkedNode_Sub51_Sub10.anInt5585]);
    }
    
    final void method2370(int argument_8_) {
	synchronized (aClass149_954) {
	    aClass149_954.method2540(-126);
	}
	synchronized (((Class115) this).aClass149_953) {
	    ((Class115) this).aClass149_953.method2540(-125);
	}
    }
    
    Class115(GameEnum argument_9_, int argument_10_, Js5Store argument_11_,
	     Js5Store argument_12_) {
	aJs5Store_951 = argument_11_;
	((Class115) this).aJs5Store_952 = argument_12_;
	aJs5Store_951.getSubFileCount(46);
    }
}
