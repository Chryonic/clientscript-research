/* Class59_Sub51_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNode_Sub51_Sub12 extends DoublyLinkedNode
{
    static int anInt6286 = 0;
    static byte[] aByteArray6287;
    int anInt6288;
    Interface9 anInterface9_6289;
    
    abstract Object method1253(boolean argument_0_);
    
    abstract boolean method1254(int argument_1_);
    
    static final int method1255(int argument, int argument_2_) {
	if (Statics.aByteArrayArray297 != null)
	    return Statics.aByteArrayArray297[argument][argument_2_] & 0xff;
	return 0;
    }
    
    public static void method1256(byte argument) {
	ByteArrayManager.byteArrayPoolSize5000 = null;
	aByteArray6287 = null;
    }
    
    DoublyLinkedNode_Sub51_Sub12(Interface9 argument_3_, int argument_4_) {
	((DoublyLinkedNode_Sub51_Sub12) this).anInt6288 = argument_4_;
	((DoublyLinkedNode_Sub51_Sub12) this).anInterface9_6289 = argument_3_;
    }
}
