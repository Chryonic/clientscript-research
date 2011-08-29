/* Class370_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class395;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;

final class Class370_Sub1 extends Class370 implements Interface7_Impl2
{
    private IDirect3DTexture anIDirect3DTexture5525;
    boolean aBoolean5526;
    boolean aBoolean5527;
    private int anInt5528;
    private int anInt5529;
    
    public final void method15
	(int argument_0_, byte argument_1_, int argument_2_, int[] argument_3_,
	 int argument_4_, int argument_5_, int argument_6_, int argument_7_) {
	if (((Class370_Sub1) this).aClass320_3121 != Applet_Sub1.aClass320_9
	    || (((Class370_Sub1) this).aDataType_3118
		!= DataType.BYTE))
	    throw new RuntimeException();
	int anLocalInt = 82 / ((52 - argument_1_) / 59);
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	int anLocalInt_8_
	    = anIDirect3DTexture5525.LockRect(0, argument_7_, argument_0_,
					      argument_2_, argument_5_, 0,
					      pixelbuffer);
	if (Class395.method4207(0, anLocalInt_8_)) {
	    int anLocalInt_9_ = pixelbuffer.getRowPitch();
	    if (argument_2_ * 4 != anLocalInt_9_
		|| argument_4_ != argument_2_) {
		for (int anLocalInt_10_ = 0; argument_5_ > anLocalInt_10_;
		     anLocalInt_10_++)
		    pixelbuffer.method4205(argument_3_,
					   (argument_6_
					    + argument_4_ * anLocalInt_10_),
					   anLocalInt_9_ * anLocalInt_10_,
					   argument_2_);
	    } else
		pixelbuffer.method4205(argument_3_, argument_6_, 0,
				       argument_5_ * argument_2_);
	    anIDirect3DTexture5525.UnlockRect(0);
	}
    }
    
    Class370_Sub1(GraphicsToolkit_Sub2_Sub2 argument_11_, Class320 argument_12_,
		  DataType argument_13_, int argument_14_, int argument_15_) {
	super(argument_11_, argument_12_, argument_13_, false,
	      argument_15_ * argument_14_);
	if (!((GraphicsToolkit_Sub2_Sub2)
	      ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122).aBoolean6505) {
	    anInt5528 = MathStatics.method2589(argument_14_);
	    anInt5529 = MathStatics.method2589(argument_15_);
	} else {
	    anInt5528 = argument_14_;
	    anInt5529 = argument_15_;
	}
	anIDirect3DTexture5525
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		   .anIDirect3DDevice6491.method4199
	       (argument_14_, argument_15_, 1, 0,
		GraphicsToolkit_Sub2_Sub2.method2269((((Class370_Sub1) this).aClass320_3121), (((Class370_Sub1) this).aDataType_3118), (byte) 19),
		1));
    }
    
    public final int method17(byte argument_16_) {
	if (argument_16_ != 84)
	    return 8;
	return anInt5529;
    }
    
    Class370_Sub1(GraphicsToolkit_Sub2_Sub2 argument_17_, Class320 argument_18_,
		  int argument_19_, int argument_20_, boolean argument_21_,
		  byte[] argument_22_, int argument_23_, int argument_24_) {
	super(argument_17_, argument_18_, DataType.BYTE,
	      argument_21_ && ((GraphicsToolkit_Sub2_Sub2) argument_17_).aBoolean6501,
	      argument_19_ * argument_20_);
	if (!((GraphicsToolkit_Sub2_Sub2)
	      ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122).aBoolean6505) {
	    anInt5528 = MathStatics.method2589(argument_19_);
	    anInt5529 = MathStatics.method2589(argument_20_);
	} else {
	    anInt5528 = argument_19_;
	    anInt5529 = argument_20_;
	}
	if (!argument_21_)
	    anIDirect3DTexture5525
		= (((GraphicsToolkit_Sub2_Sub2)
		    ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		       .anIDirect3DDevice6491.method4199
		   (anInt5528, anInt5529, 1, 0,
		    GraphicsToolkit_Sub2_Sub2.method2269((((Class370_Sub1) this).aClass320_3121), DataType.BYTE, (byte) 19),
		    1));
	else
	    anIDirect3DTexture5525
		= (((GraphicsToolkit_Sub2_Sub2)
		    ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		       .anIDirect3DDevice6491.method4199
		   (anInt5528, anInt5529, 0, 1024,
		    GraphicsToolkit_Sub2_Sub2.method2269((((Class370_Sub1) this).aClass320_3121), DataType.BYTE, (byte) 19),
		    1));
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	int anLocalInt
	    = anIDirect3DTexture5525.LockRect(0, 0, 0, argument_19_,
					      argument_20_, 0, pixelbuffer);
	if (Class395.method4207(0, anLocalInt)) {
	    if (argument_24_ == 0)
		argument_24_ = argument_19_;
	    argument_24_ *= (((Class320) ((Class370_Sub1) this).aClass320_3121)
			     .anInt2633);
	    argument_19_ *= (((Class320) ((Class370_Sub1) this).aClass320_3121)
			     .anInt2633);
	    int anLocalInt_25_ = pixelbuffer.getRowPitch();
	    if (anLocalInt_25_ != argument_19_
		|| argument_24_ != argument_19_) {
		for (int anLocalInt_26_ = 0; anLocalInt_26_ < argument_20_;
		     anLocalInt_26_++)
		    pixelbuffer.put(argument_22_, (argument_24_ * anLocalInt_26_ + argument_23_), anLocalInt_26_ * anLocalInt_25_, argument_19_);
	    } else
		pixelbuffer.put(argument_22_, argument_23_, 0, argument_19_ * argument_20_);
	    anIDirect3DTexture5525.UnlockRect(0);
	}
    }
    
    public final void method19(boolean argument_27_, boolean argument_28_,
			       int argument_29_) {
	((Class370_Sub1) this).aBoolean5527 = argument_28_;
	if (argument_29_ == 30135)
	    ((Class370_Sub1) this).aBoolean5526 = argument_27_;
    }
    
    public final boolean method16(int argument_30_) {
	if (argument_30_ != 26244)
	    method16(124);
	return true;
    }
    
    Class370_Sub1(GraphicsToolkit_Sub2_Sub2 argument_31_, int argument_32_,
		  int argument_33_, boolean argument_34_, int[] argument_35_,
		  int argument_36_, int argument_37_) {
	super(argument_31_, Applet_Sub1.aClass320_9, DataType.BYTE,
	      argument_34_ && ((GraphicsToolkit_Sub2_Sub2) argument_31_).aBoolean6501,
	      argument_32_ * argument_33_);
	if (!((GraphicsToolkit_Sub2_Sub2)
	      ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122).aBoolean6505) {
	    anInt5528 = MathStatics.method2589(argument_32_);
	    anInt5529 = MathStatics.method2589(argument_33_);
	} else {
	    anInt5528 = argument_32_;
	    anInt5529 = argument_33_;
	}
	if (!argument_34_)
	    anIDirect3DTexture5525
		= ((GraphicsToolkit_Sub2_Sub2)
		   ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		      .anIDirect3DDevice6491
		      .method4199(anInt5528, anInt5529, 1, 0, 21, 1);
	else
	    anIDirect3DTexture5525
		= ((GraphicsToolkit_Sub2_Sub2)
		   ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		      .anIDirect3DDevice6491
		      .method4199(anInt5528, anInt5529, 0, 1024, 21, 1);
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	int anLocalInt
	    = anIDirect3DTexture5525.LockRect(0, 0, 0, argument_32_,
					      argument_33_, 0, pixelbuffer);
	if (Class395.method4207(0, anLocalInt)) {
	    if (argument_37_ == 0)
		argument_37_ = argument_32_;
	    int anLocalInt_38_ = pixelbuffer.getRowPitch();
	    if (argument_32_ * 4 == anLocalInt_38_
		&& argument_37_ == argument_32_)
		pixelbuffer.method4205(argument_35_, argument_36_, 0,
				       argument_33_ * argument_32_);
	    else {
		for (int anLocalInt_39_ = 0; anLocalInt_39_ < argument_33_;
		     anLocalInt_39_++)
		    pixelbuffer.method4205(argument_35_,
					   (argument_36_
					    + argument_37_ * anLocalInt_39_),
					   anLocalInt_38_ * anLocalInt_39_,
					   argument_32_);
	    }
	    anIDirect3DTexture5525.UnlockRect(0);
	}
    }
    
    public final int method20(boolean argument_40_) {
	if (argument_40_)
	    anIDirect3DTexture5525 = null;
	return anInt5528;
    }
    
    public final float method22(int argument_41_, float argument_42_) {
	int anLocalInt = 47 / ((argument_41_ - 68) / 53);
	return argument_42_ / (float) anInt5529;
    }
    
    public final void method34(int argument_43_) {
	if (argument_43_ != 20464)
	    anIDirect3DTexture5525 = null;
	((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122.method2267(this, 34);
    }
    
    public final void method21
	(Class320 argument_44_, int argument_45_, int argument_46_,
	 int argument_47_, int argument_48_, byte[] argument_49_,
	 int argument_50_, int argument_51_, int argument_52_) {
	if (((Class370_Sub1) this).aClass320_3121 != argument_44_
	    || (DataType.BYTE
		!= ((Class370_Sub1) this).aDataType_3118))
	    throw new RuntimeException();
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	if (argument_45_ == 5259) {
	    int anLocalInt
		= anIDirect3DTexture5525.LockRect(0, argument_50_,
						  argument_46_, argument_48_,
						  argument_52_, 0,
						  pixelbuffer);
	    if (Class395.method4207(0, anLocalInt)) {
		argument_51_
		    *= (((Class320) ((Class370_Sub1) this).aClass320_3121)
			.anInt2633);
		argument_48_
		    *= (((Class320) ((Class370_Sub1) this).aClass320_3121)
			.anInt2633);
		int anLocalInt_53_ = pixelbuffer.getRowPitch();
		if (anLocalInt_53_ != argument_48_
		    || argument_51_ != argument_48_) {
		    for (int anLocalInt_54_ = 0; argument_52_ > anLocalInt_54_;
			 anLocalInt_54_++)
			pixelbuffer.put(argument_49_, (anLocalInt_54_ * argument_51_ + argument_47_), anLocalInt_53_ * anLocalInt_54_, argument_48_);
		} else
		    pixelbuffer.put(argument_49_, argument_47_, 0, argument_52_ * argument_48_);
		anIDirect3DTexture5525.UnlockRect(0);
	    }
	}
    }
    
    final IDirect3DBaseTexture method4046(int argument_55_) {
	if (argument_55_ != 15901)
	    return null;
	return anIDirect3DTexture5525;
    }
    
    public final void method23(int argument_56_, int argument_57_,
			       int argument_58_, int argument_59_,
			       int[] argument_60_, int argument_61_,
			       int argument_62_) {
	if (((Class370_Sub1) this).aClass320_3121 != Applet_Sub1.aClass320_9
	    || (((Class370_Sub1) this).aDataType_3118
		!= DataType.BYTE))
	    throw new RuntimeException();
	if (argument_62_ == 3839) {
	    PixelBuffer pixelbuffer
		= (((GraphicsToolkit_Sub2_Sub2)
		    ((Class370_Sub1) this).aClass_ha_Sub2_Sub2_3122)
		   .aPixelBuffer6490);
	    int anLocalInt
		= anIDirect3DTexture5525.LockRect(0, argument_56_,
						  argument_59_, argument_58_,
						  argument_57_, 16,
						  pixelbuffer);
	    if (Class395.method4207(0, anLocalInt)) {
		int anLocalInt_63_ = pixelbuffer.getRowPitch();
		if (anLocalInt_63_ == argument_58_ * 4)
		    pixelbuffer.method4206(argument_60_, argument_61_, 0,
					   argument_60_.length);
		else {
		    for (int anLocalInt_64_ = 0; anLocalInt_64_ < argument_57_;
			 anLocalInt_64_++)
			pixelbuffer.method4206(argument_60_,
					       argument_61_ + (anLocalInt_64_
							       * argument_58_),
					       anLocalInt_63_ * anLocalInt_64_,
					       argument_58_);
		}
		anIDirect3DTexture5525.UnlockRect(0);
	    }
	}
    }
    
    public final float method18(int argument_65_, float argument_66_) {
	if (argument_65_ != -18982)
	    return 0.6968257F;
	return argument_66_ / (float) anInt5528;
    }
    
    public final void method33(int argument_67_, Class382 argument_68_) {
	if (argument_67_ > -104)
	    method19(true, false, -89);
	super.method33(-109, argument_68_);
    }
}
