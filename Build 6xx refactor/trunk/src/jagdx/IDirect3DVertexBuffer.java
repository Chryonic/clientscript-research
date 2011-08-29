/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Source;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3DVertexBuffer extends IUnknown
{
    int anInt6544;
    
    public final native int Lock(int argument_0_, int argument_1_,
				 int argument_2_, GeometryBuffer argument_3_);
    
    protected final long method4177() {
	anInt6544 = 0;
	return super.method4177();
    }
    
    IDirect3DVertexBuffer(Class394 argument_4_) {
	super(argument_4_);
    }
    
    public final boolean method4204(Source argument_5_, int argument_6_,
				    int argument_7_, int argument_8_,
				    int argument_9_) {
	if (argument_5_ == null || argument_6_ < 0
	    || argument_8_ > argument_6_ + argument_5_.getSize())
	    throw new RuntimeException_Sub1("");
	if (argument_7_ < 0 || anInt6544 + argument_7_ < argument_8_)
	    throw new RuntimeException_Sub1("");
	return _Update((long) argument_6_ + argument_5_.getAddress(),
		       argument_7_, argument_8_, argument_9_);
    }
    
    private final native boolean _Update(long argument_10_, int argument_11_,
					 int argument_12_, int argument_13_);
    
    public final native int Unlock();
}
