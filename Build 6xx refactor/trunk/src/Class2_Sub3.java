/* Class2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub3 extends Class2
{
    private IDirect3DVertexShader anIDirect3DVertexShader3771;
    private IDirect3DVertexShader anIDirect3DVertexShader3772;
    private IDirect3DVertexShader anIDirect3DVertexShader3773;
    private IDirect3DVertexShader anIDirect3DVertexShader3774;
    private static float[] aFloatArray3775 = new float[4];
    private GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_3776;
    private static float[] aFloatArray3777 = new float[16];
    private IDirect3DVertexShader anIDirect3DVertexShader3778;
    private boolean aBoolean3779;
    private boolean aBoolean3780 = false;
    private boolean aBoolean3781;
    private Interface7_Impl2 anInterface7_Impl2_3782;
    
    Class2_Sub3(GraphicsToolkit_Sub2_Sub2 argument_0_, Js5Store argument_1_) {
	super(argument_0_);
	aClass_ha_Sub2_Sub2_3776 = argument_0_;
	if (argument_1_ != null
	    && ((((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776).aD3DCAPS6492
		 .anInt3361)
		& 0xffff) >= 257) {
	    anIDirect3DVertexShader3774
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		       .anIDirect3DDevice6491.method4198
		   (argument_1_.getData("dx", "uw_ground_unlit")));
	    anIDirect3DVertexShader3778
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		       .anIDirect3DDevice6491.method4198
		   (argument_1_.getData("dx", "uw_ground_lit")));
	    anIDirect3DVertexShader3773
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		       .anIDirect3DDevice6491.method4198
		   (argument_1_.getData("dx", "uw_model_unlit")));
	    anIDirect3DVertexShader3772
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		       .anIDirect3DDevice6491.method4198
		   (argument_1_.getData("dx", "uw_model_lit")));
	    if (!(anIDirect3DVertexShader3772 != null
		  & (anIDirect3DVertexShader3778 != null
		     & anIDirect3DVertexShader3774 != null
		     & anIDirect3DVertexShader3773 != null)))
		aBoolean3781 = false;
	    else {
		anInterface7_Impl2_3782
		    = (((Class2_Sub3) this).aClass_ha_Sub2_56.method2233
		       ((byte) -120, 2, 1, false, new int[] { 0, -1 }));
		anInterface7_Impl2_3782.method19(false, false, 30135);
		aBoolean3781 = true;
	    }
	} else
	    aBoolean3781 = false;
    }
    
    private final void method201(byte argument_2_) {
	if (anIDirect3DVertexShader3771 != null && aBoolean3779) {
	    Class350_Sub2 class350_sub2
		= ((Class2_Sub3) this).aClass_ha_Sub2_56.method2144(0);
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    idirect3ddevice.method4197
		(13,
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .ambientModelIntensity)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunRed)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .ambientModelIntensity)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunGreen)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunBlue)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .ambientModelIntensity)),
		 1.0F);
	    idirect3ddevice.method4197
		(14,
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunRed)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunLight0Intensity)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunGreen)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunLight0Intensity)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunLight0Intensity)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunBlue)),
		 1.0F);
	    idirect3ddevice.method4197
		(16,
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunRed)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunLight1Intensity)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunLight1Intensity)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunGreen)),
		 ((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		   .sunLight1Intensity)
		  * (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		     .sunBlue)),
		 1.0F);
	    class350_sub2.method3855
		((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight0Position[1]),
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight0Position[2]),
		 2,
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight0Position[0]),
		 aFloatArray3775);
	    idirect3ddevice.SetVertexShaderConstantF(15, aFloatArray3775, 1);
	    class350_sub2.method3855
		((((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight1Position[1]),
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight1Position[2]),
		 2,
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .sunLight1Position[0]),
		 aFloatArray3775);
	    idirect3ddevice.SetVertexShaderConstantF(17, aFloatArray3775, 1);
	}
	if (argument_2_ >= -1)
	    aFloatArray3777 = null;
    }
    
    final void method196(int argument_3_, byte argument_4_,
			 Interface7 argument_5_) {
	if (argument_5_ != null) {
	    if (aBoolean3780) {
		((Class2_Sub3) this).aClass_ha_Sub2_56
		    .method2229((byte) -105, GlMultiTexSourceEnum.TEXTURE, 0);
		((Class2_Sub3) this).aClass_ha_Sub2_56
		    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -98);
		aBoolean3780 = false;
	    }
	    ((Class2_Sub3) this).aClass_ha_Sub2_56.method2237(true,
							      argument_5_);
	    ((Class2_Sub3) this).aClass_ha_Sub2_56.method2216((byte) 107,
							      argument_3_);
	} else if (!aBoolean3780) {
	    ((Class2_Sub3) this).aClass_ha_Sub2_56.method2237
		(true,
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .anInterface7_4741));
	    ((Class2_Sub3) this).aClass_ha_Sub2_56.method2216((byte) -99, 1);
	    ((Class2_Sub3) this).aClass_ha_Sub2_56
		.method2229((byte) 120, GlMultiTexSourceEnum.PREVIOUS, 0);
	    ((Class2_Sub3) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.PREVIOUS, -89);
	    aBoolean3780 = true;
	}
	int anLocalInt = 53 / ((60 - argument_4_) / 61);
    }
    
    final boolean method185(int argument_6_) {
	if (argument_6_ < 53)
	    method192(-89);
	return aBoolean3781;
    }
    
    final void method190(byte argument_7_) {
	if (argument_7_ >= -126)
	    method186(-118, 122, false);
	if (anIDirect3DVertexShader3771 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    int anLocalInt = ((Class2_Sub3) this).aClass_ha_Sub2_56.XA();
	    int anLocalInt_8_ = ((Class2_Sub3) this).aClass_ha_Sub2_56.i();
	    float f = ((float) anLocalInt
		       - (float) (-anLocalInt_8_ + anLocalInt) * 0.125F);
	    float f_9_ = (-((float) (anLocalInt - anLocalInt_8_) * 0.25F)
			  + (float) anLocalInt);
	    idirect3ddevice.method4197(10, f_9_, 1.0F / (-f_9_ + f), f,
				       1.0F / ((float) anLocalInt - f));
	    idirect3ddevice.method4197
		(11,
		 1.0F / (float) ((Class2_Sub3) this).aClass_ha_Sub2_56
				    .method2121((byte) 127),
		 (float) ((Class2_Sub3) this).aClass_ha_Sub2_56
			     .method2136((byte) 97) / 255.0F,
		 (((GraphicsToolkit_Sub2) ((Class2_Sub3) this).aClass_ha_Sub2_56)
		  .fogEnd),
		 1.0F / (-((GraphicsToolkit_Sub2)
			   ((Class2_Sub3) this).aClass_ha_Sub2_56).fogStart
			 + ((GraphicsToolkit_Sub2) (((Class2_Sub3) this)
					     .aClass_ha_Sub2_56)).fogEnd));
	    ((Class2_Sub3) this).aClass_ha_Sub2_56.method2246
		(((Class2_Sub3) this).aClass_ha_Sub2_56.method2174(false), 1);
	}
    }
    
    final void method195(byte argument_10_) {
	((Class2_Sub3) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2_Sub3) this).aClass_ha_Sub2_56.method2237(true, null);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2228(CombineModeEnum.MODULATE, CombineModeEnum.MODULATE, -90);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2229((byte) 125, GlMultiTexSourceEnum.TEXTURE, 0);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2229((byte) 105, GlMultiTexSourceEnum.CONSTANT, 2);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.TEXTURE, -77);
	if (argument_10_ <= 54)
	    anIDirect3DVertexShader3778 = null;
	((Class2_Sub3) this).aClass_ha_Sub2_56.setActiveTexture(0);
	if (aBoolean3780) {
	    ((Class2_Sub3) this).aClass_ha_Sub2_56
		.method2229((byte) 118, GlMultiTexSourceEnum.TEXTURE, 0);
	    ((Class2_Sub3) this).aClass_ha_Sub2_56
		.method2224(0, GlMultiTexSourceEnum.TEXTURE, -85);
	    aBoolean3780 = false;
	}
	if (anIDirect3DVertexShader3771 != null) {
	    aClass_ha_Sub2_Sub2_3776.method2261(-1, null);
	    anIDirect3DVertexShader3771 = null;
	}
    }
    
    final void method189(int argument_11_, boolean argument_12_) {
	if (argument_11_ != 22789)
	    method190((byte) 18);
    }
    
    final void method188(byte argument_13_) {
	if (argument_13_ != -56)
	    method196(106, (byte) -78, null);
	if (anIDirect3DVertexShader3771 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= ((Class2_Sub3) this).aClass_ha_Sub2_56.method2127((byte) 13);
	    idirect3ddevice.SetVertexShaderConstantF
		(8, class350_sub2.getFirst2Rows(aFloatArray3777), 2);
	}
    }
    
    final void method192(int argument_14_) {
	if (anIDirect3DVertexShader3771 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3776.method2138(-1690);
	    idirect3ddevice.method4186
		(0, class350_sub2.method3856(aFloatArray3777, (byte) -45));
	}
	if (argument_14_ < 70)
	    method195((byte) 29);
    }
    
    final void method184(byte argument_15_) {
	if (anIDirect3DVertexShader3771 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3776.method2138(-1690);
	    idirect3ddevice.method4186
		(0, class350_sub2.method3856(aFloatArray3777, (byte) -98));
	}
	int anLocalInt = -78 / ((-16 - argument_15_) / 47);
    }
    
    final void method194(int argument_16_) {
	if (argument_16_ != 1)
	    method190((byte) 124);
	if (anIDirect3DVertexShader3771 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
		   .anIDirect3DDevice6491);
	    idirect3ddevice.method4186(4,
				       ((Class2_Sub3) this)
					   .aClass_ha_Sub2_56
					   .method2118(-115, aFloatArray3777));
	}
    }
    
    final void method191(byte argument_17_) {
	IDirect3DDevice idirect3ddevice
	    = (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3776)
	       .anIDirect3DDevice6491);
	int anLocalInt = ((Class2_Sub3) this).aClass_ha_Sub2_56.method2239();
	if (argument_17_ == -36) {
	    Class350_Sub2 class350_sub2
		= ((Class2_Sub3) this).aClass_ha_Sub2_56.method2119(0);
	    IDirect3DVertexShader idirect3dvertexshader;
	    if (!aBoolean3779)
		idirect3dvertexshader
		    = (anLocalInt == 2147483647 ? anIDirect3DVertexShader3774
		       : anIDirect3DVertexShader3773);
	    else
		idirect3dvertexshader
		    = (anLocalInt == 2147483647 ? anIDirect3DVertexShader3778
		       : anIDirect3DVertexShader3772);
	    if (idirect3dvertexshader != anIDirect3DVertexShader3771) {
		anIDirect3DVertexShader3771 = idirect3dvertexshader;
		aClass_ha_Sub2_Sub2_3776.method2261(-1, idirect3dvertexshader);
		method201((byte) -47);
		method194(1);
		method188((byte) -56);
		method192(124);
		method184((byte) 93);
		method190((byte) -127);
	    }
	    class350_sub2.method3863(-1.0F, argument_17_ ^ ~0x22, 0.0F,
				     (float) anLocalInt, 0.0F,
				     aFloatArray3775);
	    idirect3ddevice.method4186(12, aFloatArray3775);
	}
    }
    
    final void method193(boolean argument_18_, int argument_19_) {
	aBoolean3779 = argument_18_;
	((Class2_Sub3) this).aClass_ha_Sub2_56.setActiveTexture(1);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2237(true, anInterface7_Impl2_3782);
	((Class2_Sub3) this).aClass_ha_Sub2_56.method2228
	    (CombineModeEnum.REPLACE, CombineModeEnum.INTERPOLATE, 118);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2229((byte) -117, GlMultiTexSourceEnum.CONSTANT, 0);
	((Class2_Sub3) this).aClass_ha_Sub2_56.setMultiTexRgbSource(argument_19_, true, false, (GlMultiTexSourceEnum.TEXTURE), (byte) -67);
	((Class2_Sub3) this).aClass_ha_Sub2_56
	    .method2224(0, GlMultiTexSourceEnum.PREVIOUS, argument_19_ - 95);
	((Class2_Sub3) this).aClass_ha_Sub2_56.setActiveTexture(0);
	method191((byte) -36);
    }
    
    final void method186(int argument_20_, int argument_21_,
			 boolean argument_22_) {
	if (argument_22_ != true)
	    anIDirect3DVertexShader3771 = null;
    }
}
