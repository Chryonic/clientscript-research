/* Class46_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

class Class46_Sub1 extends Class46
{
    static int anInt3836;
    static float aFloat3837 = 1.0F;
    
    static final void method436(int argument) {
	synchronized (client.clientInstance) {
	    if (argument != 2445) {
		/* empty */
	    } else if (Applet_Sub1.overridingFrame != null) {
		/* empty */
	    } else {
		java.awt.Container container;
		if (Applet_Sub1.gameFrame == null) {
		    if (Signlink.mainapp == null)
			container = Applet_Sub1.currentInstance;
		    else
			container = Signlink.mainapp;
		} else
		    container = Applet_Sub1.gameFrame;
		Applet_Sub1.containerWidth = container.getSize().width;
		Applet_Sub1.containerHeight = container.getSize().height;
		if (Applet_Sub1.gameFrame == container) {
		    Insets insets = Applet_Sub1.gameFrame.getInsets();
		    Applet_Sub1.containerWidth -= insets.left + insets.right;
		    Applet_Sub1.containerHeight -= insets.top + insets.bottom;
		}
		if (DoublyLinkedNode_Sub51_Sub13.method1262(-72) == 1) {
		    Applet_Sub1.canvasHeight = client.gameHeight;
		    Applet_Sub1.canvasWidth
			= client.gameWidth;
		    Applet_Sub1.canvasX
			= (Applet_Sub1.containerWidth
			   - client.gameWidth) / 2;
		    Applet_Sub1.canvasY = 0;
		} else
		    Statics.method321((byte) 104);
		if (client.modeWhere != TestingStageEnum.LIVE) {
		    if (Applet_Sub1.canvasWidth < 1024
			&& Applet_Sub1.canvasHeight < 768) {
			/* empty */
		    }
		}
		Applet_Sub1.gameCanvas.setSize(Applet_Sub1.canvasWidth,
					   Applet_Sub1.canvasHeight);
		if (Class389.aGraphicsToolkit3281 != null) {
		    if (!Class52.aBoolean391)
			Class389.aGraphicsToolkit3281.setCanvas(Applet_Sub1.gameCanvas, (Applet_Sub1.canvasWidth), Applet_Sub1.canvasHeight);
		    else
			Class373.method4072(Applet_Sub1.gameCanvas, (byte) -71);
		}
		if (container == Applet_Sub1.gameFrame) {
		    Insets insets = Applet_Sub1.gameFrame.getInsets();
		    Applet_Sub1.gameCanvas.setLocation((insets.left
						    + Applet_Sub1.canvasX),
						   (Applet_Sub1.canvasY
						    + insets.top));
		} else
		    Applet_Sub1.gameCanvas.setLocation(Applet_Sub1.canvasX,
						   Applet_Sub1.canvasY);
		if (Class66.anInt467 != -1)
		    Statics.method1760(-97, true);
		Node_Sub31_Sub31.method970(true);
	    }
	}
    }
    
    static final void method437(int argument, int argument_0_,
				int argument_1_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(5, 13175, (long) argument);
	class59_sub51_sub3.method1182(-55);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_1_;
    }
}
