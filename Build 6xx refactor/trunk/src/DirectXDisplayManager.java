/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

final class DirectXDisplayManager implements IEnumModesCallback
{
    private DirectDraw aDirectDraw2626 = new DirectDraw();
    private static int anInt2627;
    private static int[] anIntArray2628;
    
    public final void method3641(DDSurfaceDesc argument_0_,
				 IUnknown argument_1_) {
	if (anIntArray2628 != null) {
	    anIntArray2628[anInt2627++] = argument_0_.width;
	    anIntArray2628[anInt2627++] = argument_0_.height;
	    anIntArray2628[anInt2627++] = argument_0_.rgbBitCount;
	    anIntArray2628[anInt2627++] = argument_0_.refreshRate;
	} else
	    anInt2627 += 4;
    }
    
    final int[] getDisplayModeHashes(int argument_2_) {
	aDirectDraw2626.enumDisplayModes(0, null, null, this);
	anIntArray2628 = new int[anInt2627];
	anInt2627 = 0;
	aDirectDraw2626.enumDisplayModes(0, null, null, this);
	int[] anLocalInts = anIntArray2628;
	anInt2627 = 0;
	anIntArray2628 = null;
	return anLocalInts;
    }
    
    public DirectXDisplayManager() {
	aDirectDraw2626.initialize(null);
    }
    
    final void restoreDisplayMode(Frame argument_3_, int argument_4_) {
	aDirectDraw2626.restoreDisplayMode();
	aDirectDraw2626.setCooperativeLevel(argument_3_, 8);
    }
    
    final void setFullScreenDisplayMode(int argument_5_, Frame argument_6_, int argument_7_, int argument_8_, int argument_9_, int argument_10_) {
	argument_6_.setVisible(true);
	WComponentPeer wcomponentpeer = (WComponentPeer) argument_6_.getPeer();
	int anLocalInt = wcomponentpeer.getHwnd();
	User32.SetWindowLong(anLocalInt, -16, -2147483648);
	User32.SetWindowLong(anLocalInt, -20, 8);
	aDirectDraw2626.setCooperativeLevel(argument_6_, 17);
	aDirectDraw2626.setDisplayMode(argument_9_, argument_5_, argument_7_,
				       argument_8_, 0);
	argument_6_.setBounds(0, argument_10_, argument_9_, argument_5_);
	argument_6_.toFront();
	argument_6_.requestFocus();
    }
}
