/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;
import java.lang.ref.ReferenceQueue;

public final class Class394
{
    private WeakReference_Sub1 aWeakReference_Sub1_3306;
    private WeakReference_Sub1 aWeakReference_Sub1_3307;
    ReferenceQueue aReferenceQueue3308 = new ReferenceQueue();
    
    private final void method4171(byte argument_0_) {
	for (;;) {
	    java.lang.ref.Reference reference = aReferenceQueue3308.poll();
	    if (reference == null)
		break;
	    WeakReference_Sub1 weakreference_sub1
		= (WeakReference_Sub1) reference;
	    method4175(116, weakreference_sub1);
	}
	if (argument_0_ >= -32)
	    method4175(-52, null);
    }
    
    public final void method4172(byte argument_1_) {
	method4171((byte) -44);
	while (aWeakReference_Sub1_3307 != null)
	    method4175(117, aWeakReference_Sub1_3307);
	method4171((byte) -72);
    }
    
    public final void method4173(boolean argument_2_) {
	method4171((byte) -56);
    }
    
    final void method4174(WeakReference_Sub1 argument_3_,
			  boolean argument_4_) {
	argument_3_.aWeakReference_Sub1_3420 = null;
	argument_3_.aWeakReference_Sub1_3421 = aWeakReference_Sub1_3307;
	if (aWeakReference_Sub1_3306 == null)
	    aWeakReference_Sub1_3306 = argument_3_;
	else
	    aWeakReference_Sub1_3307.aWeakReference_Sub1_3420 = argument_3_;
	aWeakReference_Sub1_3307 = argument_3_;
    }
    
    private final void method4175(int argument_5_,
				  WeakReference_Sub1 argument_6_) {
	argument_6_.method4217(2450);
	if (aWeakReference_Sub1_3306 == argument_6_)
	    aWeakReference_Sub1_3306 = argument_6_.aWeakReference_Sub1_3420;
	if (aWeakReference_Sub1_3307 == argument_6_)
	    aWeakReference_Sub1_3307 = argument_6_.aWeakReference_Sub1_3421;
	if (argument_5_ >= 26) {
	    if (argument_6_.aWeakReference_Sub1_3420 != null)
		argument_6_.aWeakReference_Sub1_3420.aWeakReference_Sub1_3421
		    = argument_6_.aWeakReference_Sub1_3421;
	    if (argument_6_.aWeakReference_Sub1_3421 != null)
		argument_6_.aWeakReference_Sub1_3421.aWeakReference_Sub1_3420
		    = argument_6_.aWeakReference_Sub1_3420;
	}
    }
}
