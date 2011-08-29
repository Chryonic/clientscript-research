/* Class59_Sub51_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class DoublyLinkedNode_Sub51_Sub12_Sub2 extends DoublyLinkedNode_Sub51_Sub12
{
    private SoftReference aSoftReference6674;
    
    DoublyLinkedNode_Sub51_Sub12_Sub2(Interface9 argument_0_, Object argument_1_, int argument_2_) {
	super(argument_0_, argument_2_);
	aSoftReference6674 = new SoftReference(argument_1_);
    }
    
    final boolean method1254(int argument_3_) {
	if (argument_3_ <= 101)
	    method1253(true);
	return true;
    }
    
    final Object method1253(boolean argument_4_) {
	if (argument_4_ != true)
	    return null;
	return aSoftReference6674.get();
    }
}
