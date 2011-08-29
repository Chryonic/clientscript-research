/* IDirect3DVolumeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;

public class IDirect3DVolumeTexture extends IDirect3DBaseTexture
{
    public final native int LockBox
	(int argument_0_, int argument_1_, int argument_2_, int argument_3_,
	 int argument_4_, int argument_5_, int argument_6_, int argument_7_,
	 PixelBuffer argument_8_);
    
    IDirect3DVolumeTexture(Class394 argument_9_) {
	super(argument_9_);
    }
    
    public final native boolean UnlockBox(int argument_10_);
}
