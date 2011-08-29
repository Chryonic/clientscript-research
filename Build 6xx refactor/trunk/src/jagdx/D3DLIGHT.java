/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.Peer_Sub1;

public class D3DLIGHT extends Peer_Sub1
{
    public final native void SetAmbient(float argument_0_, float argument_1_,
					float argument_2_, float argument_3_);
    
    public final native void SetDiffuse(float argument_4_, float argument_5_,
					float argument_6_, float argument_7_);
    
    public final native void SetRange(float argument_8_);
    
    public final native void SetPosition(float argument_9_, float argument_10_,
					 float argument_11_);
    
    private final native void Init();
    
    public D3DLIGHT(Class394 argument_12_) {
	super(argument_12_);
	Init();
    }
    
    public final native void SetType(int argument_13_);
    
    public final native void SetSpotParams
	(float argument_14_, float argument_15_, float argument_16_);
    
    public final native void SetAttenuation
	(float argument_17_, float argument_18_, float argument_19_);
    
    public final native void SetSpecular
	(float argument_20_, float argument_21_, float argument_22_,
	 float argument_23_);
    
    public final native void SetDirection
	(float argument_24_, float argument_25_, float argument_26_);
}
