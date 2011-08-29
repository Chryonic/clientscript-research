/* Class370_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.Class395;
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;

final class Class370_Sub3 extends Class370 implements Interface7_Impl3
{
    private IDirect3DCubeTexture anIDirect3DCubeTexture5534;
    private int anInt5535;
    
    Class370_Sub3(GraphicsToolkit_Sub2_Sub2 argument_0_, int argument_1_,
		  boolean argument_2_, int[][] argument_3_) {
	super(argument_0_, Applet_Sub1.aClass320_9, DataType.BYTE,
	      argument_2_ && ((GraphicsToolkit_Sub2_Sub2) argument_0_).aBoolean6488,
	      argument_1_ * 6 * argument_1_);
	anInt5535 = argument_1_;
	if (((Class370_Sub3) this).aBoolean3119)
	    anIDirect3DCubeTexture5534
		= ((GraphicsToolkit_Sub2_Sub2)
		   ((Class370_Sub3) this).aClass_ha_Sub2_Sub2_3122)
		      .anIDirect3DDevice6491
		      .method4189(anInt5535, 0, 1024, 21, 1);
	else
	    anIDirect3DCubeTexture5534
		= ((GraphicsToolkit_Sub2_Sub2)
		   ((Class370_Sub3) this).aClass_ha_Sub2_Sub2_3122)
		      .anIDirect3DDevice6491
		      .method4189(anInt5535, 1, 0, 21, 1);
	PixelBuffer pixelbuffer
	    = (((GraphicsToolkit_Sub2_Sub2)
		((Class370_Sub3) this).aClass_ha_Sub2_Sub2_3122)
	       .aPixelBuffer6490);
	for (int anLocalInt = 0; anLocalInt < 6; anLocalInt++) {
	    int anLocalInt_4_
		= anIDirect3DCubeTexture5534.LockRect(anLocalInt, 0, 0, 0,
						      anInt5535, anInt5535, 0,
						      pixelbuffer);
	    if (Class395.method4207(0, anLocalInt_4_)) {
		int anLocalInt_5_ = pixelbuffer.getRowPitch();
		if (anLocalInt_5_ != anInt5535 * 4) {
		    for (int anLocalInt_6_ = 0; anInt5535 > anLocalInt_6_;
			 anLocalInt_6_++)
			pixelbuffer.method4205(argument_3_[anLocalInt],
					       anLocalInt_6_ * anInt5535,
					       anLocalInt_5_ * anLocalInt_6_,
					       anInt5535);
		} else
		    pixelbuffer.method4205(argument_3_[anLocalInt], 0, 0,
					   anInt5535 * anInt5535);
		anIDirect3DCubeTexture5534.UnlockRect(anLocalInt, 0);
	    }
	}
    }
    
    final IDirect3DBaseTexture method4046(int argument_7_) {
	if (argument_7_ != 15901)
	    return null;
	return anIDirect3DCubeTexture5534;
    }
    
    public final void method33(int argument_8_, Class382 argument_9_) {
	if (argument_8_ < -104)
	    super.method33(-124, argument_9_);
    }
    
    public final void method34(int argument_10_) {
	if (argument_10_ == 20464)
	    ((Class370_Sub3) this).aClass_ha_Sub2_Sub2_3122
		.method2266(this, argument_10_ ^ 0x4ff7);
    }
}
