/* Class257 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class257
{
    boolean aBoolean2003 = false;
    Js5Store aJs5Store_2005;
    private Js5Store aJs5Store_2006;
    static int anInt2007 = -1;
    boolean aBoolean2008;
    private Class149 aClass149_2009 = new Class149(64);
    static int[] anIntArray2010;
    Class149 aClass149_2011 = new Class149(500);
    Class149 aClass149_2012 = new Class149(30);
    static int anInt2013 = 0;
    Class149 aClass149_2014 = new Class149(50);
    int anInt2015;
    
    final void method3295(byte argument_0_, int argument_1_) {
	synchronized (aClass149_2009) {
	    aClass149_2009.method2534(argument_1_, (byte) -8);
	}
	synchronized (((Class257) this).aClass149_2011) {
	    ((Class257) this).aClass149_2011.method2534(argument_1_,
							(byte) -8);
	}
	synchronized (((Class257) this).aClass149_2012) {
	    ((Class257) this).aClass149_2012.method2534(argument_1_,
							(byte) -8);
	}
	synchronized (((Class257) this).aClass149_2014) {
	    ((Class257) this).aClass149_2014.method2534(argument_1_,
							(byte) -8);
	}
    }
    
    final void method3296(int argument_2_, int argument_3_) {
	((Class257) this).anInt2015 = argument_3_;
	synchronized (((Class257) this).aClass149_2011) {
	    ((Class257) this).aClass149_2011.clear((byte) -3);
	}
	synchronized (((Class257) this).aClass149_2012) {
	    ((Class257) this).aClass149_2012.clear((byte) -3);
	}
	synchronized (((Class257) this).aClass149_2014) {
	    ((Class257) this).aClass149_2014.clear((byte) -3);
	}
    }
    
    final void method3297(byte argument_4_) {
	synchronized (aClass149_2009) {
	    aClass149_2009.clear((byte) -3);
	}
	synchronized (((Class257) this).aClass149_2011) {
	    ((Class257) this).aClass149_2011.clear((byte) -3);
	}
	synchronized (((Class257) this).aClass149_2012) {
	    ((Class257) this).aClass149_2012.clear((byte) -3);
	}
	synchronized (((Class257) this).aClass149_2014) {
	    ((Class257) this).aClass149_2014.clear((byte) -3);
	}
    }
    
    final Class266 method3298(byte argument_5_, int argument_6_) {
	Class266 class266;
	synchronized (aClass149_2009) {
	    class266
		= (Class266) aClass149_2009.get((long) argument_6_);
	}
	if (class266 != null)
	    return class266;
	byte[] anLocalInts;
	synchronized (aJs5Store_2006) {
	    anLocalInts
		= aJs5Store_2006.getData(Class62_Sub24.method1452(argument_6_, -531999640), Class133_Sub1.method2448(-7636, argument_6_));
	}
	class266 = new Class266();
	((Class266) class266).aClass257_2073 = this;
	((Class266) class266).anInt2059 = argument_6_;
	if (anLocalInts != null)
	    class266.method3342(0, new Packet(anLocalInts));
	class266.method3338((byte) 79);
	if (!((Class257) this).aBoolean2008
	    && ((Class266) class266).aBoolean2090) {
	    ((Class266) class266).anIntArray2054 = null;
	    ((Class266) class266).aStringArray2096 = null;
	}
	if (((Class266) class266).aBoolean2056) {
	    ((Class266) class266).aBoolean2085 = false;
	    ((Class266) class266).anInt2068 = 0;
	}
	synchronized (aClass149_2009) {
	    aClass149_2009.put(class266, (long) argument_6_);
	}
	return class266;
    }
    
    final void method3299(int argument_7_, boolean argument_8_) {
	if (!((Class257) this).aBoolean2003 != !argument_8_) {
	    ((Class257) this).aBoolean2003 = argument_8_;
	    method3297((byte) 80);
	}
    }
    
    public static void method3300(int argument) {
	anIntArray2010 = null;
	ByteArrayManager.byteArrayPool = null;
    }
    
    final void method3301(int argument_9_, int argument_10_) {
	aClass149_2009 = new Class149(argument_10_);
    }
    
    final void method3302(byte argument_11_) {
	synchronized (aClass149_2009) {
	    aClass149_2009.method2540(argument_11_ ^ ~0x73);
	}
	synchronized (((Class257) this).aClass149_2011) {
	    ((Class257) this).aClass149_2011.method2540(88);
	}
	synchronized (((Class257) this).aClass149_2012) {
	    ((Class257) this).aClass149_2012.method2540(-124);
	}
	synchronized (((Class257) this).aClass149_2014) {
	    ((Class257) this).aClass149_2014.method2540(52);
	    if (argument_11_ != -46)
		anInt2007 = 32;
	}
    }
    
    final void method3303(int argument_12_, boolean argument_13_) {
	if (!((Class257) this).aBoolean2008 != !argument_13_) {
	    ((Class257) this).aBoolean2008 = argument_13_;
	    method3297((byte) 111);
	}
    }
    
    Class257(GameEnum argument_14_, int argument_15_, boolean argument_16_,
	     Js5Store argument_17_, Js5Store argument_18_) {
	((Class257) this).aJs5Store_2005 = argument_18_;
	aJs5Store_2006 = argument_17_;
	((Class257) this).aBoolean2008 = argument_16_;
	if (aJs5Store_2006 != null) {
	    int anLocalInt = aJs5Store_2006.getRealSubFileCount() - 1;
	    aJs5Store_2006.getSubFileCount(anLocalInt);
	}
    }
    
    static {
	anIntArray2010 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
    }
}
