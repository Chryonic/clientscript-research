/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

final class DirectXCursorManager extends Callback
{
    private volatile int anInt1;
    private int anInt2;
    private volatile boolean aBoolean3 = true;
    private boolean aBoolean4;
    private volatile int anInt5;
    
    final synchronized int method81(int argument_0_, int argument_1_,
				    int argument_2_, int argument_3_) {
	if (anInt1 != argument_0_) {
	    int anLocalInt = User32.GetWindowLong(argument_0_, -4);
	    return User32.CallWindowProc(anLocalInt, argument_0_, argument_1_,
					 argument_2_, argument_3_);
	}
	if (argument_1_ == 32) {
	    int anLocalInt = argument_3_ & 0xffff;
	    if (anLocalInt == 1) {
		User32.SetCursor(aBoolean3 ? anInt2 : 0);
		return 0;
	    }
	}
	if (argument_1_ == 101024) {
	    User32.SetCursor(aBoolean3 ? anInt2 : 0);
	    return 0;
	}
	if (argument_1_ == 1) {
	    anInt1 = 0;
	    aBoolean3 = true;
	}
	return User32.CallWindowProc(anInt5, argument_0_, argument_1_,
				     argument_2_, argument_3_);
    }
    
    final void mouseMove(int argument_4_, int argument_5_, int argument_6_) {
	User32.SetCursorPos(argument_5_, argument_6_);
    }
    
    final void setComponent(Component argument_7_, boolean argument_8_, int argument_9_) {
	WComponentPeer wcomponentpeer = (WComponentPeer) argument_7_.getPeer();
	int anLocalInt = wcomponentpeer.getTopHwnd();
	if (anLocalInt != anInt1 || !argument_8_ == aBoolean3) {
	    if (!aBoolean4) {
		anInt2 = User32.LoadCursor(0, 32512);
		Root.alloc(this);
		aBoolean4 = true;
	    }
	    if (anLocalInt != anInt1) {
		if (anInt1 != 0) {
		    aBoolean3 = true;
		    User32.SendMessage(anLocalInt, 101024, 0, 0);
		    synchronized (this) {
			User32.SetWindowLong(anInt1, -4, anInt5);
		    }
		}
		synchronized (this) {
		    anInt1 = anLocalInt;
		    anInt5 = User32.SetWindowLong(anInt1, -4, this);
		}
	    }
	    aBoolean3 = argument_8_;
	    User32.SendMessage(anLocalInt, 101024, 0, 0);
	}
    }
}
