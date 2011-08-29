/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3DEventQuery extends IUnknown
{
    public final native int Issue();
    
    IDirect3DEventQuery(Class394 argument_0_) {
	super(argument_0_);
    }
    
    public final native int IsSignaled();
}
