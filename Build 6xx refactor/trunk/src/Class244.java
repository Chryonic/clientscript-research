/* Class244 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class244
{
    private Class368[] aClass368Array1772;
    private int[] anIntArray1773 = new int[4];
    private int anInt1774;
    private static int anInt1775
	= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
	      .length();
    private int anInt1776;
    private boolean aBoolean1777 = false;
    private static int[] anIntArray1778 = new int[256];
    private int[] anIntArray1779;
    
    private final void method3160(GraphicsToolkit argument_0_, String argument_1_,
				  int[] argument_2_, int argument_3_,
				  int argument_4_, int argument_5_,
				  boolean argument_6_) {
	if (argument_5_ == 0)
	    argument_6_ = false;
	argument_5_ |= ~0xffffff;
	for (int anLocalInt = 0; anLocalInt < argument_1_.length();
	     anLocalInt++) {
	    int anLocalInt_7_ = anIntArray1778[argument_1_.charAt(anLocalInt)];
	    if (argument_6_)
		aClass368Array1772[anLocalInt_7_].method4004(argument_3_ + 1,
							     argument_4_ + 1,
							     0, -16777216, 1);
	    aClass368Array1772[anLocalInt_7_]
		.method4004(argument_3_, argument_4_, 0, argument_5_, 1);
	    argument_3_ += anIntArray1779[anLocalInt_7_];
	}
    }
    
    final int method3161() {
	return anInt1776 - 1;
    }
    
    final int method3162(String argument_8_) {
	int anLocalInt = 0;
	for (int anLocalInt_9_ = 0; anLocalInt_9_ < argument_8_.length();
	     anLocalInt_9_++) {
	    int anLocalInt_10_
		= anIntArray1778[argument_8_.charAt(anLocalInt_9_)];
	    anLocalInt += anIntArray1779[anLocalInt_10_];
	}
	return anLocalInt;
    }
    
    public static void method3163() {
	anIntArray1778 = null;
    }
    
    final void method3164(GraphicsToolkit argument_11_, String argument_12_,
			  int argument_13_, int argument_14_, int argument_15_,
			  boolean argument_16_) {
	int anLocalInt = method3162(argument_12_) / 2;
	argument_11_.getScissor(anIntArray1773);
	if (argument_13_ - anLocalInt <= anIntArray1773[2]
	    && argument_13_ + anLocalInt >= anIntArray1773[0]
	    && argument_14_ - anInt1774 <= anIntArray1773[3]
	    && argument_14_ + anInt1776 >= anIntArray1773[1])
	    method3160(argument_11_, argument_12_, anIntArray1773,
		       argument_13_ - anLocalInt, argument_14_, argument_15_,
		       argument_16_);
    }
    
    final int method3165() {
	return anInt1774;
    }
    
    private final void method3166(GraphicsToolkit argument_17_, Font argument_18_,
				  FontMetrics argument_19_, char argument_20_,
				  int argument_21_, boolean argument_22_) {
	int anLocalInt = argument_19_.charWidth(argument_20_);
	int anLocalInt_23_ = anLocalInt;
	if (argument_22_) {
	    try {
		if (argument_20_ == '/')
		    argument_22_ = false;
		if (argument_20_ == 'f' || argument_20_ == 't'
		    || argument_20_ == 'w' || argument_20_ == 'v'
		    || argument_20_ == 'k' || argument_20_ == 'x'
		    || argument_20_ == 'y' || argument_20_ == 'A'
		    || argument_20_ == 'V' || argument_20_ == 'W')
		    anLocalInt++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int anLocalInt_24_ = argument_19_.getMaxAscent();
	int anLocalInt_25_
	    = argument_19_.getMaxAscent() + argument_19_.getMaxDescent();
	int anLocalInt_26_ = argument_19_.getHeight();
	Image image
	    = Applet_Sub1.gameCanvas.createImage(anLocalInt, anLocalInt_25_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, anLocalInt, anLocalInt_25_);
	graphics.setColor(Color.white);
	graphics.setFont(argument_18_);
	graphics.drawString(String.valueOf(argument_20_), 0, anLocalInt_24_);
	if (argument_22_)
	    graphics.drawString(String.valueOf(argument_20_), 1,
				anLocalInt_24_);
	int[] anLocalInts = new int[anLocalInt * anLocalInt_25_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, anLocalInt, anLocalInt_25_,
			       anLocalInts, 0, anLocalInt);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int anLocalInt_27_ = 0;
    while_67_:
	for (int anLocalInt_28_ = 0; anLocalInt_28_ < anLocalInt_25_;
	     anLocalInt_28_++) {
	    for (int anLocalInt_29_ = 0; anLocalInt_29_ < anLocalInt;
		 anLocalInt_29_++) {
		int anLocalInt_30_
		    = (anLocalInts
		       [anLocalInt_29_ + anLocalInt_28_ * anLocalInt]);
		if ((anLocalInt_30_ & 0xffffff) != 0) {
		    anLocalInt_27_ = anLocalInt_28_;
		    break while_67_;
		}
	    }
	}
	for (int anLocalInt_31_ = 0; anLocalInt_31_ < anLocalInts.length;
	     anLocalInt_31_++) {
	    if ((anLocalInts[anLocalInt_31_] & 0xffffff) == 0)
		anLocalInts[anLocalInt_31_] = 0;
	}
	anInt1774 = anLocalInt_24_ - anLocalInt_27_;
	anInt1776 = anLocalInt_26_;
	anIntArray1779[argument_21_] = anLocalInt_23_;
	aClass368Array1772[argument_21_]
	    = argument_17_.method2047(anLocalInt, anLocalInts, 0,
				      anLocalInt_25_, anLocalInt);
    }
    
    Class244(GraphicsToolkit argument_32_, int argument_33_, boolean argument_34_,
	     Component argument_35_) {
	aBoolean1777 = false;
	aClass368Array1772 = new Class368[256];
	anIntArray1779 = new int[256];
	Font font = new Font("Helvetica", argument_34_ ? 1 : 0, argument_33_);
	FontMetrics fontmetrics = argument_35_.getFontMetrics(font);
	for (int anLocalInt = 0; anLocalInt < anInt1775; anLocalInt++)
	    method3166
		(argument_32_, font, fontmetrics,
		 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		     .charAt(anLocalInt),
		 anLocalInt, false);
	if (argument_34_ && aBoolean1777) {
	    aBoolean1777 = false;
	    font = new Font("Helvetica", 0, argument_33_);
	    fontmetrics = argument_35_.getFontMetrics(font);
	    for (int anLocalInt = 0; anLocalInt < anInt1775; anLocalInt++)
		method3166
		    (argument_32_, font, fontmetrics,
		     "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			 .charAt(anLocalInt),
		     anLocalInt, false);
	    if (!aBoolean1777) {
		aBoolean1777 = false;
		for (int anLocalInt = 0; anLocalInt < anInt1775; anLocalInt++)
		    method3166
			(argument_32_, font, fontmetrics,
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			     .charAt(anLocalInt),
			 anLocalInt, true);
	    }
	}
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
	    int anLocalInt_36_
		= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
		      .indexOf(anLocalInt);
	    if (anLocalInt_36_ == -1)
		anLocalInt_36_ = 74;
	    anIntArray1778[anLocalInt] = anLocalInt_36_;
	}
    }
}
