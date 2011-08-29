/* Class310 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

final class Class310
{
    private IDirect3DSurface anIDirect3DSurface2588;
    private IDirect3DSwapChain anIDirect3DSwapChain2589;
    private IDirect3DSurface anIDirect3DSurface2590;
    
    final boolean method3609(int argument_0_) {
	return anIDirect3DSwapChain2589 != null;
    }
    
    final void method3610(byte argument_1_, IDirect3DSwapChain argument_2_,
			  IDirect3DSurface argument_3_) {
	anIDirect3DSwapChain2589 = argument_2_;
	anIDirect3DSurface2588 = argument_3_;
	anIDirect3DSurface2590 = anIDirect3DSwapChain2589.method4203(0, 0);
    }
    
    final void method3611(int argument_4_) {
	if (argument_4_ != -32387)
	    method3610((byte) -22, null, null);
	if (anIDirect3DSurface2590 != null) {
	    anIDirect3DSurface2590.method4179((byte) -70);
	    anIDirect3DSurface2590 = null;
	}
	if (anIDirect3DSurface2588 != null) {
	    anIDirect3DSurface2588.method4179((byte) -70);
	    anIDirect3DSurface2588 = null;
	}
	if (anIDirect3DSwapChain2589 != null) {
	    anIDirect3DSwapChain2589.method4179((byte) -70);
	    anIDirect3DSwapChain2589 = null;
	}
    }
    
    final int method3612(int argument_5_, int argument_6_) {
	return anIDirect3DSwapChain2589.Present(argument_6_);
    }
    
    Class310(IDirect3DSwapChain argument_7_, IDirect3DSurface argument_8_) {
	method3610((byte) -63, argument_7_, argument_8_);
    }
}
