/* Class370_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class395;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;

final class Class370_Sub2 extends Class370 implements Interface7_Impl1
{
    private int anInt5530;
    private IDirect3DVolumeTexture anIDirect3DVolumeTexture5531;
    private int anInt5532;
    private int anInt5533;
    
    final IDirect3DBaseTexture method4046(int argument_0_) {
	if (argument_0_ != 15901)
	    method4046(102);
	return anIDirect3DVolumeTexture5531;
    }
    
    Class370_Sub2(GraphicsToolkit_Sub2_Sub2 argument_1_, Class320 argument_2_,
		  int argument_3_, int argument_4_, int argument_5_,
		  byte[] argument_6_) {
	super(argument_1_, argument_2_, DataType.BYTE, false,
	      argument_3_ * argument_4_ * argument_5_);
	anInt5532 = argument_4_;
	anInt5530 = argument_3_;
	anInt5533 = argument_5_;
	anIDirect3DVolumeTexture5531
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub2) this).aClass_ha_Sub2_Sub2_3122)
		   .anIDirect3DDevice6491.method4187
	       (argument_3_, argument_4_, argument_5_, 1, 0,
		GraphicsToolkit_Sub2_Sub2.method2269(argument_2_, (((Class370_Sub2) this).aDataType_3118), (byte) 19),
		1));
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub2) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	int anLocalInt
	    = anIDirect3DVolumeTexture5531.LockBox(0, 0, 0, 0, argument_3_,
						   argument_4_, argument_5_, 0,
						   pixelbuffer);
	if (Class395.method4207(0, anLocalInt)) {
	    int anLocalInt_7_
		= (((Class320) ((Class370_Sub2) this).aClass320_3121).anInt2633
		   * anInt5530);
	    int anLocalInt_8_ = anLocalInt_7_ * anInt5532;
	    int anLocalInt_9_ = pixelbuffer.getSlicePitch();
	    if (anLocalInt_9_ != anLocalInt_8_) {
		int anLocalInt_10_ = pixelbuffer.getRowPitch();
		if (anLocalInt_10_ == anLocalInt_7_) {
		    for (int anLocalInt_11_ = 0; anLocalInt_11_ < anInt5533;
			 anLocalInt_11_++)
			pixelbuffer.put(argument_6_, anLocalInt_8_ * anLocalInt_11_, anLocalInt_9_ * anLocalInt_11_, anLocalInt_8_);
		} else {
		    for (int anLocalInt_12_ = 0; anLocalInt_12_ < anInt5533;
			 anLocalInt_12_++) {
			for (int anLocalInt_13_ = 0;
			     anInt5532 > anLocalInt_13_; anLocalInt_13_++)
			    pixelbuffer.put(argument_6_, (anLocalInt_12_ * anLocalInt_8_ + anLocalInt_13_ * anLocalInt_7_), (anLocalInt_9_ * anLocalInt_12_ + anLocalInt_13_ * anLocalInt_10_), anLocalInt_7_);
		    }
		}
	    } else
		pixelbuffer.put(argument_6_, 0, 0, anInt5533 * anInt5532 * anLocalInt_7_);
	    anIDirect3DVolumeTexture5531.UnlockBox(0);
	}
    }
    
    public final void method33(int argument_14_, Class382 argument_15_) {
	super.method33(-119, argument_15_);
	if (argument_14_ > -104)
	    method34(-9);
    }
    
    public final void method34(int argument_16_) {
	((Class370_Sub2) this).aClass_ha_Sub2_Sub2_3122.method2272(this, -110);
	if (argument_16_ != 20464)
	    method4046(-43);
    }
}
