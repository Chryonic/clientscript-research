/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class225
{
    Js5Store aJs5Store_1631;
    private Js5Store aJs5Store_1632;
    static float aFloat1633;
    static int anInt1634 = -1;
    private Class149 aClass149_1635 = new Class149(64);
    Class149 aClass149_1636 = new Class149(60);
    int anInt1637;
    
    final void method3048(byte argument_0_) {
	if (argument_0_ == 100) {
	    synchronized (aClass149_1635) {
		aClass149_1635.method2540(115);
	    }
	    synchronized (((Class225) this).aClass149_1636) {
		((Class225) this).aClass149_1636
		    .method2540(argument_0_ ^ 0x38);
	    }
	}
    }
    
    final void method3049(int argument_1_, byte argument_2_) {
	((Class225) this).anInt1637 = argument_1_;
	synchronized (((Class225) this).aClass149_1636) {
	    ((Class225) this).aClass149_1636.clear((byte) -3);
	}
    }
    
    final void method3050(boolean argument_3_) {
	synchronized (aClass149_1635) {
	    aClass149_1635.clear((byte) -3);
	}
	synchronized (((Class225) this).aClass149_1636) {
	    ((Class225) this).aClass149_1636.clear((byte) -3);
	}
    }
    
    static final Class44[] method3051(int argument) {
	return (new Class44[]
		{ Class96.aClass44_746, Class368_Sub1.aClass44_5688,
		  Class45.aClass44_321 });
    }
    
    static final boolean method3052(int argument, int argument_4_,
				    int argument_5_, int argument_6_,
				    byte argument_7_) {
	if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223 || !Class384.aBoolean3255)
	    return false;
	if (Class253_Sub3.anInt5675 < 100)
	    return false;
	if (!Node_Sub29.method856(argument_5_, argument_4_, argument_6_,
            19322))
	    return false;
	int anLocalInt = argument_5_ << LightingManager.lightCoordRShift;
	int anLocalInt_8_ = argument_4_ << LightingManager.lightCoordRShift;
	if (Class53.method483(Node_Sub31_Sub5.aClass_sArray5858
				  [argument_6_]
				  .method3534(argument_5_, false, argument_4_),
			      argument, Class110.anInt909, Class110.anInt909,
			      -7515, anLocalInt_8_, anLocalInt)) {
	    Class356.anInt3011++;
	    return true;
	}
	return false;
    }
    
    final void method3053(byte argument_9_, int argument_10_) {
	synchronized (aClass149_1635) {
	    aClass149_1635.method2534(argument_10_, (byte) -8);
	}
	synchronized (((Class225) this).aClass149_1636) {
	    ((Class225) this).aClass149_1636.method2534(argument_10_,
							(byte) -8);
	}
    }
    
    final Class126 method3054(byte argument_11_, int argument_12_) {
	Class126 class126;
	synchronized (aClass149_1635) {
	    class126
		= (Class126) aClass149_1635.get((long) argument_12_);
	}
	if (class126 != null)
	    return class126;
	byte[] anLocalInts;
	synchronized (aJs5Store_1632) {
	    anLocalInts
		= aJs5Store_1632.getData(JagexHash.method3080(argument_12_, 115), Class32.method367(argument_12_, (byte) 107));
	}
	class126 = new Class126();
	((Class126) class126).aClass225_1033 = this;
	((Class126) class126).anInt1029 = argument_12_;
	if (anLocalInts != null)
	    class126.method2408(new Packet(anLocalInts), true);
	synchronized (aClass149_1635) {
	    aClass149_1635.put(class126, (long) argument_12_);
	}
	return class126;
    }
    
    Class225(GameEnum argument_13_, int argument_14_, Js5Store argument_15_,
	     Js5Store argument_16_) {
	((Class225) this).aJs5Store_1631 = argument_16_;
	aJs5Store_1632 = argument_15_;
	int anLocalInt = aJs5Store_1632.getRealSubFileCount() - 1;
	aJs5Store_1632.getSubFileCount(anLocalInt);
    }
}
