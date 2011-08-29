/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3DSurface extends IUnknown
{
    public final native boolean UnlockRect();
    
    IDirect3DSurface(Class394 argument_0_) {
	super(argument_0_);
    }
    
    public final native int LockRect(int argument_1_, int argument_2_,
				     int argument_3_, int argument_4_,
				     int argument_5_, PixelBuffer argument_6_);
}
