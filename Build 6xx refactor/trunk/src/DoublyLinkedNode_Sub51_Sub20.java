/* Class59_Sub51_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub20 extends DoublyLinkedNode
{
    double aDouble6356;
    short[][] aShortArrayArray6357;
    static Class166 aClass166_6358 = new Class166(110, -2);

    static final boolean method1303(byte argument, int argument_0_) {
	if (argument_0_ != 2 && argument_0_ != 3)
	    return false;
	return true;
    }
    
    final long method1304(int argument_1_) {
	return (long) ((((DoublyLinkedNode_Sub51_Sub20) this).aShortArrayArray6357
			[0]).length
		       | (((DoublyLinkedNode_Sub51_Sub20) this)
			  .aShortArrayArray6357).length << 0);
    }
    
    public static void method1305(int argument) {
	GlToolkit.lightValueBuffer = null;
	aClass166_6358 = null;
    }
    
    DoublyLinkedNode_Sub51_Sub20(short[][] argument_2_, double argument_3_) {
	((DoublyLinkedNode_Sub51_Sub20) this).aShortArrayArray6357 = argument_2_;
	((DoublyLinkedNode_Sub51_Sub20) this).aDouble6356 = argument_3_;
    }
}
