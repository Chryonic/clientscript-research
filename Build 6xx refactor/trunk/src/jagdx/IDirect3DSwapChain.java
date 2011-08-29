/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3DSwapChain extends IUnknown
{
    private Class394 aClass394_6543;
    
    IDirect3DSwapChain(Class394 argument_0_) {
	super(argument_0_);
	aClass394_6543 = argument_0_;
    }
    
    public final native int Present(int argument_1_);
    
    private final native int _GetBackBuffer(int argument_2_, int argument_3_,
					    IDirect3DSurface argument_4_);
    
    public final IDirect3DSurface method4203(int argument_5_,
					     int argument_6_) {
	IDirect3DSurface idirect3dsurface
	    = new IDirect3DSurface(aClass394_6543);
	int anLocalInt
	    = _GetBackBuffer(argument_5_, argument_6_, idirect3dsurface);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dsurface;
    }
}
