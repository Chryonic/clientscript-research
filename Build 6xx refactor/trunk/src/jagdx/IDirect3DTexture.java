/* IDirect3DTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;

public class IDirect3DTexture extends IDirect3DBaseTexture
{
    public final native boolean UnlockRect(int argument_0_);
    
    public final native int LockRect
	(int argument_1_, int argument_2_, int argument_3_, int argument_4_,
	 int argument_5_, int argument_6_, PixelBuffer argument_7_);
    
    IDirect3DTexture(Class394 argument_8_) {
	super(argument_8_);
    }
}
