/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140
{
    static float aFloat1093;
    static int anInt1094;
    private Js5Store aJs5Store_1095;
    private Class149 aClass149_1097 = new Class149(64);
    
    final DoublyLinkedNode_Sub51_Sub5 method2472(byte argument_0_, int argument_1_) {
	DoublyLinkedNode_Sub51_Sub5 class59_sub51_sub5;
	synchronized (aClass149_1097) {
	    class59_sub51_sub5
		= ((DoublyLinkedNode_Sub51_Sub5)
		   aClass149_1097.get((long) argument_1_));
	}
	if (class59_sub51_sub5 != null)
	    return class59_sub51_sub5;
	byte[] anLocalInts;
	synchronized (aJs5Store_1095) {
	    anLocalInts = aJs5Store_1095.getData(5, argument_1_);
	}
	class59_sub51_sub5 = new DoublyLinkedNode_Sub51_Sub5();
	if (anLocalInts != null)
	    class59_sub51_sub5.method1196(0, new Packet(anLocalInts));
	synchronized (aClass149_1097) {
	    aClass149_1097.put(class59_sub51_sub5, (long) argument_1_);
	}
	return class59_sub51_sub5;
    }
    
    public static void method2473(int argument) {
	MapRelated.mapFileLId = null;
	RsInterface.aJs5Store_1092 = null;
    }
    
    Class140(GameEnum argument_2_, int argument_3_, Js5Store argument_4_) {
	aJs5Store_1095 = argument_4_;
	aJs5Store_1095.getSubFileCount(5);
    }
}
