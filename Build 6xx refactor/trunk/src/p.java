/* p - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

final class p extends Node implements Interface3
{
    int anInt3490;
    Canvas aCanvas3491;
    private static boolean aBoolean3492 = false;
    long aLong3493;
    int anInt3494;
    private static long aLong3495;
    
    final void method1331(int argument_0_, int argument_1_) {
	try {
	    synchronized (((p) this).aCanvas3491.getTreeLock()) {
		Dimension dimension = ((p) this).aCanvas3491.getSize();
		H(argument_0_, argument_1_, dimension.width, dimension.height);
		aBoolean3492 = false;
	    }
	} catch (Exception exception) {
	    method1334(exception);
	}
    }
    
    private final native void oa(Canvas argument_2_, int argument_3_,
				 int argument_4_);
    
    public final native void w(boolean argument_5_);
    
    final void method1332(Rectangle[] argument_6_, int argument_7_,
			  int argument_8_, int argument_9_) {
	try {
	    synchronized (((p) this).aCanvas3491.getTreeLock()) {
		for (int anLocalInt = 0; anLocalInt < argument_7_;
		     anLocalInt++) {
		    Rectangle rectangle = argument_6_[anLocalInt];
		    if (rectangle.width > 0 && rectangle.height > 0)
			K(rectangle.x, rectangle.y, rectangle.width,
			  rectangle.height, argument_8_, argument_9_);
		}
		aBoolean3492 = false;
	    }
	} catch (Exception exception) {
	    method1334(exception);
	}
    }
    
    final void method1333() {
	w(true);
	((p) this).aLong3493 = 0L;
	((p) this).aCanvas3491 = null;
    }
    
    protected final void finalize() {
	if (((p) this).aLong3493 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    private final void method1334(Exception argument_10_) {
	if (!aBoolean3492) {
	    aLong3495 = Applet_Sub1.getGameTime();
	    aBoolean3492 = true;
	} else if (Applet_Sub1.getGameTime() - aLong3495 < 30000L)
	    ((p) this).aCanvas3491.repaint();
	else
	    throw new RuntimeException(argument_10_.getMessage());
    }
    
    final void method1335(Canvas argument_11_, int argument_12_,
			  int argument_13_) {
	((p) this).anInt3494 = argument_12_;
	((p) this).anInt3490 = argument_13_;
	oa(argument_11_, argument_12_, argument_13_);
    }
    
    private final native void K(int argument_14_, int argument_15_,
				int argument_16_, int argument_17_,
				int argument_18_, int argument_19_);
    
    private final native void H(int argument_20_, int argument_21_,
				int argument_22_, int argument_23_);
    
    private final native void sa(NativeToolkit argument_24_, Canvas argument_25_,
				 int argument_26_, int argument_27_);
    
    p(NativeToolkit argument_28_, Canvas argument_29_, int argument_30_,
      int argument_31_) {
	((p) this).aCanvas3491 = argument_29_;
	((p) this).anInt3494 = argument_30_;
	((p) this).anInt3490 = argument_31_;
	sa(argument_28_, ((p) this).aCanvas3491, argument_30_, argument_31_);
    }
}
