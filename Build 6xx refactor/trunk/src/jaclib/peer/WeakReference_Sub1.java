/* WeakReference_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.WeakReference;

abstract class WeakReference_Sub1 extends WeakReference
{
    WeakReference_Sub1 aWeakReference_Sub1_3420;
    WeakReference_Sub1 aWeakReference_Sub1_3421;
    private long aLong3422;
    
    protected abstract long releasePeer(long argument_0_);
    
    WeakReference_Sub1(Peer argument_1_, Class394 argument_2_) {
	super(argument_1_, argument_2_.aReferenceQueue3308);
	argument_2_.method4174(this, true);
    }
    
    final long method4217(int argument_3_) {
	if (argument_3_ != 2450)
	    aWeakReference_Sub1_3420 = null;
	long l;
	if (0L != aLong3422) {
	    l = releasePeer(aLong3422);
	    aLong3422 = 0L;
	} else
	    l = 0L;
	return l;
    }
    
    final boolean method4218(int argument_4_) {
	return aLong3422 != 0L;
    }
    
    final void method4219(long argument_5_) {
	method4217(2450);
	aLong3422 = argument_5_;
    }
}
