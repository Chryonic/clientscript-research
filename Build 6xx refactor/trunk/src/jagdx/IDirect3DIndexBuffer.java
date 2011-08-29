/* IDirect3DIndexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3DIndexBuffer extends IUnknown
{
    public final native int Lock(int argument_0_, int argument_1_,
				 int argument_2_, GeometryBuffer argument_3_);
    
    public final native int Unlock();
    
    IDirect3DIndexBuffer(Class394 argument_4_) {
	super(argument_4_);
    }
    
    private final native boolean _Update(long argument_5_, int argument_6_,
					 int argument_7_);
    
    protected final long method4177() {
	return super.method4177();
    }
}
