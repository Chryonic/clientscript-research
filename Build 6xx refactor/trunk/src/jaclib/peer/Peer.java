/* Peer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

abstract class Peer
{
    protected WeakReference_Sub1 aWeakReference_Sub1_3309;
    /*synthetic*/ static Class aClass3310;
    
    private static final native void init(Class argument);
    
    protected Peer() {
	/* empty */
    }
    
    public final boolean method4176(byte argument_0_) {
	if (argument_0_ != -91)
	    method4177();
	return aWeakReference_Sub1_3309.method4218(-70);
    }
    
    protected long method4177() {
	return aWeakReference_Sub1_3309.method4217(2450);
    }
    
    /*synthetic*/ static Class method4178(String argument) {
	Class var_class;
	try {
	    var_class = Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
	return var_class;
    }
    
    static {
	init(aClass3310 == null
	     ? aClass3310 = method4178("jaclib.peer.WeakReference_Sub1")
	     : aClass3310);
    }
}
