/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import java.awt.Canvas;

import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public class IDirect3D extends IUnknown
{
    private Class394 aClass394_6540;
    
    public static final IDirect3D method4180(int argument,
					     Class394 argument_0_) {
	IDirect3D idirect3d = new IDirect3D(argument_0_);
	int anLocalInt = _Direct3DCreate(argument, idirect3d);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3d;
    }
    
    public final D3DADAPTER_IDENTIFIER method4181(int argument_1_,
						  int argument_2_) {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = new D3DADAPTER_IDENTIFIER();
	int anLocalInt = _GetAdapterIdentifier(argument_1_, argument_2_,
					       d3dadapter_identifier);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return d3dadapter_identifier;
    }
    
    public final native int CheckDeviceFormat
	(int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_);
    
    private final native int _GetAdapterDisplayMode
	(int argument_9_, D3DDISPLAYMODE argument_10_);
    
    private final native int _GetDeviceCaps(int argument_11_, int argument_12_,
					    D3DCAPS argument_13_);
    
    public final native int CheckDeviceMultiSampleType
	(int argument_14_, int argument_15_, int argument_16_,
	 boolean argument_17_, int argument_18_);
    
    private IDirect3D(Class394 argument_19_) {
	super(argument_19_);
	aClass394_6540 = argument_19_;
    }
    
    public final IDirect3DDevice method4182
	(int argument_20_, int argument_21_, Canvas argument_22_,
	 int argument_23_, D3DPRESENT_PARAMETERS argument_24_) {
	IDirect3DDevice idirect3ddevice = new IDirect3DDevice(aClass394_6540);
	int anLocalInt
	    = _CreateDevice(argument_20_, argument_21_, argument_22_,
			    argument_23_, argument_24_, idirect3ddevice);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3ddevice;
    }
    
    public final native int CheckDepthStencilMatch
	(int argument_25_, int argument_26_, int argument_27_,
	 int argument_28_, int argument_29_);
    
    private final native int _GetAdapterIdentifier
	(int argument_30_, int argument_31_,
	 D3DADAPTER_IDENTIFIER argument_32_);
    
    public final int method4183(int argument_33_,
				D3DDISPLAYMODE argument_34_) {
	return _GetAdapterDisplayMode(argument_33_, argument_34_);
    }
    
    private static final native int _Direct3DCreate(int argument,
						    IDirect3D argument_35_);
    
    public final native int CheckDeviceType(int argument_36_, int argument_37_,
					    int argument_38_, int argument_39_,
					    boolean argument_40_);
    
    public final D3DCAPS method4184(int argument_41_, int argument_42_) {
	D3DCAPS d3dcaps = new D3DCAPS();
	int anLocalInt = _GetDeviceCaps(argument_41_, argument_42_, d3dcaps);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return d3dcaps;
    }
    
    private final native int _CreateDevice
	(int argument_43_, int argument_44_, Canvas argument_45_,
	 int argument_46_, D3DPRESENT_PARAMETERS argument_47_,
	 IDirect3DDevice argument_48_);
}
