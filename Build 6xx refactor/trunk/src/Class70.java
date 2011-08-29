/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class70
{
    static long aLong480 = -1L;
    static Class366 aClass366_481 = new Class366();
    static short[] aShortArray483 = new short[256];
    
    static final void method1517(TextureSource argument, byte argument_0_,
				 int argument_1_, int argument_2_,
				 GraphicsToolkit argument_3_, int argument_4_,
				 int argument_5_) {
	if (Class392.anInt3295 < 100)
	    Class82.method1597(argument, argument_3_, (byte) -84);
	argument_3_.setClip(argument_1_, argument_5_ + argument_2_, argument_1_ + argument_4_, argument_5_);
	if (Class392.anInt3295 < 100) {
	    int anLocalInt = 20;
	    int anLocalInt_6_ = argument_4_ / 2 + argument_1_;
	    int anLocalInt_7_
		= -anLocalInt - 18 + argument_5_ + argument_2_ / 2;
	    argument_3_.fillRect(argument_1_, argument_5_, argument_4_, argument_2_, -16777216, 0);
	    argument_3_.drawRect(anLocalInt_6_ - 152, anLocalInt_7_, 304, 34, client.loadingBarBorderColour[client.colourId].getRGB(), 0);
	    argument_3_.fillRect(anLocalInt_6_ - 150, anLocalInt_7_ + 2, Class392.anInt3295 * 3, 30, client.loadingBarFillColour[client.colourId].getRGB(), 0);
	    Class173.aAbstractFont_1286.method503
		(anLocalInt_6_, -1,
		 client.loadingBarTextColour
		     [client.colourId].getRGB(),
		 (byte) 109,
		 MultilanguageString.LOADING.getLocalizedString(client.language),
		 anLocalInt + anLocalInt_7_);
	} else {
	    int anLocalInt
		= (-(int) ((float) argument_4_ / Class179.aFloat1335)
		   + Node_Sub31_Sub21.anInt5930);
	    int anLocalInt_8_
		= (AbstractFont.anInt418
		   + (int) ((float) argument_2_ / Class179.aFloat1335));
	    int anLocalInt_9_
		= ((int) ((float) argument_4_ / Class179.aFloat1335)
		   + Node_Sub31_Sub21.anInt5930);
	    Class42.anInt3542
		= (int) ((float) (argument_4_ * 2) / Class179.aFloat1335);
	    int anLocalInt_10_
		= (-(int) ((float) argument_2_ / Class179.aFloat1335)
		   + AbstractFont.anInt418);
	    Node_Sub47_Sub8.anInt6198
		= (-(int) ((float) argument_4_ / Class179.aFloat1335)
		   + Node_Sub31_Sub21.anInt5930);
	    Class99.anInt778
		= AbstractFont.anInt418 - (int) ((float) argument_2_
					    / Class179.aFloat1335);
	    Node_Sub47_Sub5.anInt6172
		= (int) ((float) (argument_2_ * 2) / Class179.aFloat1335);
	    Class179.method2819(anLocalInt + Class179.anInt1353,
				anLocalInt_8_ + Class179.anInt1340,
				anLocalInt_9_ + Class179.anInt1353,
				anLocalInt_10_ + Class179.anInt1340,
				argument_1_, argument_5_,
				argument_4_ + argument_1_,
				argument_2_ + (argument_5_ + 1));
	    Class179.method2801(argument_3_);
	    CyclicLinkedList cyclicLinkedList = Class179.method2813(argument_3_);
	    Node_Sub50.method1162(cyclicLinkedList, 0, 0, argument_3_, true);
	    if (Class68.anInt3583 > 0) {
		Node_Sub31_Sub39.anInt6051--;
		if (Node_Sub31_Sub39.anInt6051 == 0) {
		    Node_Sub31_Sub39.anInt6051 = 20;
		    Class68.anInt3583--;
		}
	    }
	    if (Node_Sub31_Sub27.aBoolean5959) {
		int anLocalInt_11_ = argument_1_ - 5 + argument_4_;
		int anLocalInt_12_ = argument_5_ + argument_2_ - 8;
		Node_Sub47_Sub9.aAbstractFont_6203.method492
		    (16776960, "Fps:" + Class350_Sub1.anInt5433, -1,
		     anLocalInt_11_, anLocalInt_12_, -1);
		anLocalInt_12_ -= 15;
		Runtime runtime = Runtime.getRuntime();
		int anLocalInt_13_
		    = (int) ((runtime.totalMemory() + -runtime.freeMemory())
			     / 1024L);
		int anLocalInt_14_ = 16776960;
		if (anLocalInt_13_ > 65536)
		    anLocalInt_14_ = 16711680;
		Node_Sub47_Sub9.aAbstractFont_6203.method492(anLocalInt_14_,
							   ("Mem:"
							    + anLocalInt_13_
							    + "k"),
							   -1, anLocalInt_11_,
							   anLocalInt_12_, -1);
		anLocalInt_12_ -= 15;
	    }
	}
    }
    
    public static void method1518(int argument) {
	aClass366_481 = null;
	Signlink.mainapp = null;
	aShortArray483 = null;
    }
    
    static final void method1519(int argument, int argument_15_) {
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub28_4305.method1470(111)
	    == 0)
	    argument_15_ = -1;
	if (argument_15_ != Node_Sub31_Sub6.anInt5863) {
	    if (argument != -101)
		method1519(102, 61);
	    if (argument_15_ != -1) {
		Class279 class279
		    = Class363.aClass241_3064.method3149(argument + 197,
							 argument_15_);
		Class83 class83 = class279.method3421(0);
		if (class83 == null)
		    argument_15_ = -1;
		else {
		    Applet_Sub1.baseSignlink.requestSetCursor(class83.method1600(), class83.method1606(), class83.method1598(), Applet_Sub1.gameCanvas, new Point(((Class279) class279).anInt2239, ((Class279) class279).anInt2238));
		    Node_Sub31_Sub6.anInt5863 = argument_15_;
		}
	    }
	    if (argument_15_ == -1 && Node_Sub31_Sub6.anInt5863 != -1) {
		Applet_Sub1.baseSignlink.requestSetCursor(-1, null, -1, Applet_Sub1.gameCanvas, new Point());
		Node_Sub31_Sub6.anInt5863 = -1;
	    }
	}
    }
}
