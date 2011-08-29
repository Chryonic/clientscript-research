/* IDirect3DCubeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;

public class IDirect3DCubeTexture extends IDirect3DBaseTexture
{
    IDirect3DCubeTexture(Class394 argument_0_) {
	super(argument_0_);
    }
    
    public final native boolean UnlockRect(int argument_1_, int argument_2_);
    
    public final native int LockRect
	(int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int argument_9_,
	 PixelBuffer argument_10_);
}
