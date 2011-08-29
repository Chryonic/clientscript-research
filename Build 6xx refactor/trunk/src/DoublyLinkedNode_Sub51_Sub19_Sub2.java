/* Class59_Sub51_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class DoublyLinkedNode_Sub51_Sub19_Sub2 extends DoublyLinkedNode_Sub51_Sub19
{
    private SoftReference aSoftReference6679;
    
    final Object method1296(byte argument_0_) {
	if (argument_0_ != 20)
	    aSoftReference6679 = null;
	return aSoftReference6679.get();
    }
    
    DoublyLinkedNode_Sub51_Sub19_Sub2(Object argument_1_, int argument_2_) {
	super(argument_2_);
	aSoftReference6679 = new SoftReference(argument_1_);
    }
    
    final boolean method1299(int argument_3_) {
	if (argument_3_ != 14391)
	    aSoftReference6679 = null;
	return true;
    }
}
