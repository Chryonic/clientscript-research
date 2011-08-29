/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Insets;

final class Class381
{
    static int anInt3239 = 0;
    static short[] aShortArray3240 = { 6, 52, 4, 11, 16, 20, 59, 47 };

    static final void method4106(int argument, int argument_0_,
				 boolean argument_1_, int argument_2_,
				 int argument_3_, int argument_4_) {
	if (Applet_Sub1.overridingFrame != null
	    && (argument_3_ != 3 || Node_Sub9_Sub2.anInt5777 != argument_2_
		|| Class_aa_Sub1.anInt3750 != argument_4_)) {
	    RsInterface.method3210(Applet_Sub1.baseSignlink, -34, Applet_Sub1.overridingFrame);
	    Applet_Sub1.overridingFrame = null;
	}
	if (argument_3_ == 3 && Applet_Sub1.overridingFrame == null) {
	    Applet_Sub1.overridingFrame
		= Class18.method307(Applet_Sub1.baseSignlink, -1, argument_2_,
				    0, argument_4_, 0);
	    if (Applet_Sub1.overridingFrame != null) {
		Class_aa_Sub1.anInt3750 = argument_4_;
		Node_Sub9_Sub2.anInt5777 = argument_2_;
		Class251.method3240(false);
	    }
	}
	if (argument_3_ == 3 && Applet_Sub1.overridingFrame == null)
	    method4106(113, argument_0_, true, -1,
		       ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			   .aClass62_Sub4_4300.method1368(78),
		       -1);
	else {
	    java.awt.Container container;
	    if (Applet_Sub1.overridingFrame != null) {
		Applet_Sub1.containerWidth = argument_2_;
		Applet_Sub1.containerHeight = argument_4_;
		container = Applet_Sub1.overridingFrame;
	    } else if (Applet_Sub1.gameFrame == null) {
		if (Signlink.mainapp == null)
		    container = Applet_Sub1.currentInstance;
		else
		    container = Signlink.mainapp;
		Applet_Sub1.containerWidth = container.getSize().width;
		Applet_Sub1.containerHeight = container.getSize().height;
	    } else {
		Insets insets = Applet_Sub1.gameFrame.getInsets();
		Applet_Sub1.containerWidth = (Applet_Sub1.gameFrame.getSize().width
					   - insets.left - insets.right);
		Applet_Sub1.containerHeight
		    = (Applet_Sub1.gameFrame.getSize().height - insets.bottom
		       - insets.top);
		container = Applet_Sub1.gameFrame;
	    }
	    if (argument_3_ == 1) {
		Applet_Sub1.canvasY = 0;
		Applet_Sub1.canvasWidth = client.gameWidth;
		Applet_Sub1.canvasHeight = client.gameHeight;
		Applet_Sub1.canvasX = (Applet_Sub1.containerWidth
				      - client.gameWidth) / 2;
	    } else
		Statics.method321((byte) 104);
	    if (client.modeWhere != TestingStageEnum.LIVE) {
		if (Applet_Sub1.canvasWidth < 1024
		    && Applet_Sub1.canvasHeight < 768) {
		    /* empty */
		}
	    }
	    if (argument_1_)
		Statics.method2726(7349);
	    else {
		Applet_Sub1.gameCanvas.setSize(Applet_Sub1.canvasWidth,
					   Applet_Sub1.canvasHeight);
		if (!Class52.aBoolean391)
		    Class389.aGraphicsToolkit3281.setCanvas(Applet_Sub1.gameCanvas, Applet_Sub1.canvasWidth, Applet_Sub1.canvasHeight);
		else
		    Class373.method4072(Applet_Sub1.gameCanvas, (byte) -32);
		if (container == Applet_Sub1.gameFrame) {
		    Insets insets = Applet_Sub1.gameFrame.getInsets();
		    Applet_Sub1.gameCanvas.setLocation((Applet_Sub1.canvasX
						    + insets.left),
						   (Applet_Sub1.canvasY
						    + insets.top));
		} else
		    Applet_Sub1.gameCanvas.setLocation(Applet_Sub1.canvasX,
						   Applet_Sub1.canvasY);
	    }
	    if (argument_3_ >= 2)
		Class362.aBoolean3058 = true;
	    else
		Class362.aBoolean3058 = false;
	    if (Class66.anInt467 != -1)
		Statics.method1760(-68, true);
	    if (Statics.aClass307_2632 != null
		&& Class230.method3070(true, Statics.anInt1652))
		Class245_Sub1_Sub1.method3182(1624);
	    for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++)
		Class109_Sub1.aBooleanArray4604[anLocalInt] = true;
	    Node_Sub49.aBoolean4293 = true;
	}
    }
    
    public static void method4107(int argument) {
	TexGenEnum.REFLECTION_MAP = null;
	aShortArray3240 = null;
    }
}
