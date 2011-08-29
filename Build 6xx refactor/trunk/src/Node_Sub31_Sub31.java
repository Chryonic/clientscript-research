/* Class59_Sub31_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

final class Node_Sub31_Sub31 extends Node_Sub31
{
    static boolean aBoolean5990;
    private int anInt5991;
    private int[] anIntArray5992;
    private int anInt5993;
    static Class329 aClass329_5994 = new Class329(0, 16);
    static Class128 aClass128_5995 = new Class128(6, 1);
    private int anInt5996 = -1;
    
    static final void method969
	(int argument, boolean argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_) {
	if (Node_Sub35.anInt4156 <= -argument_1_ + argument
	    && argument_1_ + argument <= Node_Sub9_Sub2.anInt5776
	    && Class209.anInt1504 <= -argument_1_ + argument_2_
	    && Node_Sub31_Sub13.anInt5896 >= argument_1_ + argument_2_)
	    Class9.method240(argument_1_, argument_4_, 0, argument_2_,
			     argument_3_, argument, argument_5_);
	else
	    Node_Sub31_Sub7.method895(argument_2_, argument_5_, (byte) 114,
                argument_1_, argument_4_, argument_3_,
                argument);
    }
    
    final void method866(int argument_6_, int argument_7_, int argument_8_) {
	super.method866(argument_6_, argument_7_, argument_8_);
	if (anInt5996 >= 0 && Class62_Sub24.anTextureSource_4439 != null) {
	    int anLocalInt
		= (((TextureDescriptor) Class62_Sub24.anTextureSource_4439
				   .getDescriptor(anInt5996, true)).isHalfSize
		   ? 64 : 128);
	    anIntArray5992
		= Class62_Sub24.anTextureSource_4439.method13(anLocalInt, false,
							     anLocalInt, 1.0F,
							     anInt5996,
							     (byte) -104);
	    anInt5991 = anLocalInt;
	    anInt5993 = anLocalInt;
	}
    }
    
    static final void method970(boolean argument) {
	if (Applet_Sub1.overridingFrame == null) {
	    int anLocalInt = Applet_Sub1.canvasX;
	    int anLocalInt_9_ = Applet_Sub1.canvasY;
	    int anLocalInt_10_ = (-Applet_Sub1.canvasWidth
				  + Applet_Sub1.containerWidth - anLocalInt);
	    int anLocalInt_11_
		= (-anLocalInt_9_
		   + (-Applet_Sub1.canvasHeight + Applet_Sub1.containerHeight));
	    do {
		if (anLocalInt > 0 || anLocalInt_10_ > 0 || anLocalInt_9_ > 0
		    || anLocalInt_11_ > 0) {
		    try {
			java.awt.Container container;
			if (Applet_Sub1.gameFrame == null) {
			    if (Signlink.mainapp != null)
				container = Signlink.mainapp;
			    else
				container = Applet_Sub1.currentInstance;
			} else
			    container = Applet_Sub1.gameFrame;
			int anLocalInt_12_ = 0;
			int anLocalInt_13_ = 0;
			if (Applet_Sub1.gameFrame == container) {
			    Insets insets = Applet_Sub1.gameFrame.getInsets();
			    anLocalInt_13_ = insets.top;
			    anLocalInt_12_ = insets.left;
			}
			Graphics graphics = container.getGraphics();
			graphics.setColor(Color.black);
			if (anLocalInt > 0)
			    graphics.fillRect(anLocalInt_12_, anLocalInt_13_,
					      anLocalInt,
					      Applet_Sub1.containerHeight);
			if (anLocalInt_9_ > 0)
			    graphics.fillRect(anLocalInt_12_, anLocalInt_13_,
					      Applet_Sub1.containerWidth,
					      anLocalInt_9_);
			if (anLocalInt_10_ > 0)
			    graphics.fillRect((-anLocalInt_10_
					       + (Applet_Sub1.containerWidth
						  + anLocalInt_12_)),
					      anLocalInt_13_, anLocalInt_10_,
					      Applet_Sub1.containerHeight);
			if (anLocalInt_11_ <= 0)
			    break;
			graphics.fillRect(anLocalInt_12_,
					  (anLocalInt_13_
					   + Applet_Sub1.containerHeight
					   - anLocalInt_11_),
					  Applet_Sub1.containerWidth,
					  anLocalInt_11_);
		    } catch (Exception exception) {
			/* empty */
		    }
		    break;
		}
	    } while (false);
	}
    }
    
    public Node_Sub31_Sub31() {
	super(0, false);
    }
    
    final void method868(Packet argument_14_, int argument_15_,
			 byte argument_16_) {
	if (argument_16_ >= -41)
	    method969(60, true, -109, 95, 89, 83, 30);
	if (argument_15_ == 0)
	    anInt5996 = argument_14_.g2();
    }
    
    final int method872(byte argument_17_) {
	if (argument_17_ >= -74)
	    method866(-82, -1, -90);
	return anInt5996;
    }
    
    final int[][] method870(int argument_18_, byte argument_19_) {
	if (argument_19_ != -9)
	    method872((byte) 64);
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 106,
							       argument_18_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int anLocalInt = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 == anInt5991
			       ? argument_18_
			       : (anInt5991 * argument_18_
				  / DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711))
			      * anInt5993);
	    int[] anLocalInts_20_ = anLocalInts[0];
	    int[] anLocalInts_21_ = anLocalInts[1];
	    int[] anLocalInts_22_ = anLocalInts[2];
	    if (Statics.anInt294 == anInt5993) {
		for (int anLocalInt_23_ = 0; anLocalInt_23_ < Statics.anInt294;
		     anLocalInt_23_++) {
		    int anLocalInt_24_ = anIntArray5992[anLocalInt++];
		    anLocalInts_22_[anLocalInt_23_]
			= MathStatics.AND(anLocalInt_24_ << 4, 4080);
		    anLocalInts_21_[anLocalInt_23_]
			= MathStatics.AND(65280, anLocalInt_24_) >> 4;
		    anLocalInts_20_[anLocalInt_23_]
			= (MathStatics.AND(anLocalInt_24_, 16711680)
			   >> 12);
		}
	    } else {
		for (int anLocalInt_25_ = 0; Statics.anInt294 > anLocalInt_25_;
		     anLocalInt_25_++) {
		    int anLocalInt_26_
			= anLocalInt_25_ * anInt5993 / Statics.anInt294;
		    int anLocalInt_27_
			= anIntArray5992[anLocalInt_26_ + anLocalInt];
		    anLocalInts_22_[anLocalInt_25_]
			= MathStatics.AND(255, anLocalInt_27_) << 4;
		    anLocalInts_21_[anLocalInt_25_]
			= MathStatics.AND(4080, anLocalInt_27_ >> 4);
		    anLocalInts_20_[anLocalInt_25_]
			= MathStatics.AND(anLocalInt_27_ >> 12, 4080);
		}
	    }
	}
	return anLocalInts;
    }
    
    final void method873(int argument_28_) {
	super.method873(argument_28_);
	anIntArray5992 = null;
    }
    
    public static void method971(boolean argument) {
	aClass128_5995 = null;
	aClass329_5994 = null;
    }
}
