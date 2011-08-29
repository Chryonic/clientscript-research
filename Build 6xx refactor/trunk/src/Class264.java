/* Class264 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class264
{
    static int[] anIntArray2044;
    private Class149 aClass149_2045 = new Class149(256);
    static int anInt2046 = -2;
    private Js5Store aJs5Store_2047;
    static int[] anIntArray2048 = new int[14];

    final void method3328(byte argument_0_) {
	synchronized (aClass149_2045) {
	    aClass149_2045.method2540(64);
	}
    }
    
    final void method3329(byte argument_1_, int argument_2_) {
	synchronized (aClass149_2045) {
	    aClass149_2045.method2534(argument_2_, (byte) -8);
	}
    }
    
    public static void method3330(byte argument) {
	anIntArray2048 = null;
	anIntArray2044 = null;
	client.interfaceFetcher = null;
    }
    
    final void method3331(int argument_3_) {
	synchronized (aClass149_2045) {
	    aClass149_2045.clear((byte) -3);
	}
    }
    
    final DoublyLinkedNode_Sub51_Sub11 method3332(int argument_4_, int argument_5_) {
	DoublyLinkedNode_Sub51_Sub11 class59_sub51_sub11;
	synchronized (aClass149_2045) {
	    class59_sub51_sub11
		= ((DoublyLinkedNode_Sub51_Sub11)
		   aClass149_2045.get((long) argument_4_));
	}
	if (class59_sub51_sub11 != null)
	    return class59_sub51_sub11;
	byte[] anLocalInts;
	synchronized (aJs5Store_2047) {
	    anLocalInts = aJs5Store_2047.getData(26, argument_4_);
	}
	class59_sub51_sub11 = new DoublyLinkedNode_Sub51_Sub11();
	if (anLocalInts != null)
	    class59_sub51_sub11.method1249(new Packet(anLocalInts),
					   114);
	synchronized (aClass149_2045) {
	    aClass149_2045.put(class59_sub51_sub11, (long) argument_4_);
	}
	return class59_sub51_sub11;
    }
    
    Class264(GameEnum argument_6_, int argument_7_, Js5Store argument_8_) {
	aJs5Store_2047 = argument_8_;
	aJs5Store_2047.getSubFileCount(26);
    }
    
    static {
	anIntArray2044 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }
}
