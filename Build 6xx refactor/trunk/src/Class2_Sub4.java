/* Class2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub4 extends Class2
{
    private GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_3783;
    private Class191 aClass191_3784;
    private IDirect3DVertexShader anIDirect3DVertexShader3785;
    private static float[] aFloatArray3786 = new float[16];
    
    final void method189(int argument_0_, boolean argument_1_) {
	if (argument_0_ == 22789)
	    ((Class2_Sub4) this).aClass_ha_Sub2_56.method2228
		(CombineModeEnum.ADD, CombineModeEnum.INTERPOLATE, 90);
    }
    
    final void method186(int argument_2_, int argument_3_,
			 boolean argument_4_) {
	if (argument_4_ != true)
	    aClass191_3784 = null;
	IDirect3DDevice idirect3ddevice
	    = (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
	       .anIDirect3DDevice6491);
	if (!((Class191) aClass191_3784).aBoolean1408) {
	    int anLocalInt
		= ((((GraphicsToolkit_Sub2) ((Class2_Sub4) this).aClass_ha_Sub2_56)
		    .anInt4757)
		   % 4000 * 16 / 4000);
	    ((Class2_Sub4) this).aClass_ha_Sub2_56.method2237
		(true, (((Class191) aClass191_3784).anInterface7_Impl2Array1400
			[anLocalInt]));
	    idirect3ddevice.method4197(11, 0.0F, 0.0F, 0.0F, 0.0F);
	} else {
	    float f = (float) (((GraphicsToolkit_Sub2) (((Class2_Sub4) this)
						 .aClass_ha_Sub2_56)).anInt4757
			       % 4000) / 4000.0F;
	    ((Class2_Sub4) this).aClass_ha_Sub2_56.method2237
		(true, ((Class191) aClass191_3784).anInterface7_Impl1_1403);
	    idirect3ddevice.method4197(11, f, 0.0F, 0.0F, 0.0F);
	}
    }
    
    final void method192(int argument_5_) {
	if (argument_5_ < 70)
	    aClass191_3784 = null;
	if (anIDirect3DVertexShader3785 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3783.method2138(-1690);
	    idirect3ddevice.method4186
		(0, class350_sub2.method3856(aFloatArray3786, (byte) -125));
	}
    }
    
    final void method193(boolean argument_6_, int argument_7_) {
	((Class2_Sub4) this).aClass_ha_Sub2_56
	    .method2229((byte) -109, GlMultiTexSourceEnum.TEXTURE, 0);
	((Class2_Sub4) this).aClass_ha_Sub2_56
	    .method2229((byte) -65, GlMultiTexSourceEnum.CONSTANT, 1);
	((Class2_Sub4) this).aClass_ha_Sub2_56.setMultiTexRgbSource(argument_7_, false, true, (GlMultiTexSourceEnum.PRIMARY_COLOUR), (byte) -67);
	((Class2_Sub4) this).aClass_ha_Sub2_56.method2191(argument_7_ + 6,
							  false);
	aClass_ha_Sub2_Sub2_3783.method2261(argument_7_ - 3,
					    anIDirect3DVertexShader3785);
	method192(argument_7_ + 110);
	method188((byte) -56);
	method194(1);
	method190((byte) -128);
    }
    
    Class2_Sub4(GraphicsToolkit_Sub2_Sub2 argument_8_, Js5Store argument_9_,
		Class191 argument_10_) {
	super(argument_8_);
	aClass_ha_Sub2_Sub2_3783 = argument_8_;
	aClass191_3784 = argument_10_;
	if (argument_9_ == null || !aClass191_3784.method2883(29925)
	    || ((((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783).aD3DCAPS6492
		 .anInt3361)
		& 0xffff) < 257)
	    anIDirect3DVertexShader3785 = null;
	else
	    anIDirect3DVertexShader3785
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		       .anIDirect3DDevice6491.method4198
		   (argument_9_.getData("dx", "transparent_water")));
    }
    
    final void method190(byte argument_11_) {
	if (anIDirect3DVertexShader3785 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		   .anIDirect3DDevice6491);
	    if ((((GraphicsToolkit_Sub2) ((Class2_Sub4) this).aClass_ha_Sub2_56)
		 .fogThickness)
		> 0) {
		float f
		    = (((GraphicsToolkit_Sub2) ((Class2_Sub4) this).aClass_ha_Sub2_56)
		       .fogEnd);
		float f_12_
		    = (((GraphicsToolkit_Sub2) ((Class2_Sub4) this).aClass_ha_Sub2_56)
		       .fogStart);
		float f_13_ = f_12_ + -512.0F;
		idirect3ddevice.method4197(10, f_13_, 1.0F / (-f_13_ + f_12_),
					   f_12_, 1.0F / (f - f_12_));
	    } else
		idirect3ddevice.method4197(10, 0.0F, 0.0F, 0.0F, 0.0F);
	    ((Class2_Sub4) this).aClass_ha_Sub2_56.method2246
		((((GraphicsToolkit_Sub2) ((Class2_Sub4) this).aClass_ha_Sub2_56)
		  .fogColour),
		 1);
	}
	if (argument_11_ >= -126)
	    aClass_ha_Sub2_Sub2_3783 = null;
    }
    
    final void method188(byte argument_14_) {
	if (argument_14_ != -56)
	    method193(false, 75);
	if (anIDirect3DVertexShader3785 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= ((Class2_Sub4) this).aClass_ha_Sub2_56.method2127((byte) 13);
	    class350_sub2.getFirst2Rows(aFloatArray3786);
	    aFloatArray3786[7] *= 0.25F;
	    aFloatArray3786[6] *= 0.25F;
	    aFloatArray3786[5] *= 0.25F;
	    aFloatArray3786[0] *= 0.25F;
	    aFloatArray3786[2] *= 0.25F;
	    aFloatArray3786[4] *= 0.25F;
	    aFloatArray3786[3] *= 0.25F;
	    aFloatArray3786[1] *= 0.25F;
	    idirect3ddevice.SetVertexShaderConstantF(8, aFloatArray3786, 2);
	}
    }
    
    final void method184(byte argument_15_) {
	int anLocalInt = -121 % ((-16 - argument_15_) / 47);
	if (anIDirect3DVertexShader3785 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3783.method2138(-1690);
	    idirect3ddevice.method4186
		(0, class350_sub2.method3856(aFloatArray3786, (byte) -31));
	}
    }
    
    final void method194(int argument_16_) {
	if (anIDirect3DVertexShader3785 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3783)
		   .anIDirect3DDevice6491);
	    idirect3ddevice.method4186(4,
				       ((Class2_Sub4) this)
					   .aClass_ha_Sub2_56
					   .method2118(-61, aFloatArray3786));
	}
	if (argument_16_ != 1)
	    method195((byte) -95);
    }
    
    final void method196(int argument_17_, byte argument_18_,
			 Interface7 argument_19_) {
	int anLocalInt = -118 % ((60 - argument_18_) / 61);
    }
    
    final boolean method185(int argument_20_) {
	if (argument_20_ <= 53)
	    aFloatArray3786 = null;
	return anIDirect3DVertexShader3785 != null;
    }
    
    final void method195(byte argument_21_) {
	aClass_ha_Sub2_Sub2_3783.method2261(-1, null);
	((Class2_Sub4) this).aClass_ha_Sub2_56
	    .method2229((byte) 110, GlMultiTexSourceEnum.TEXTURE, 0);
	((Class2_Sub4) this).aClass_ha_Sub2_56
	    .method2229((byte) -77, GlMultiTexSourceEnum.PRIMARY_COLOUR, 1);
	((Class2_Sub4) this).aClass_ha_Sub2_56
	    .method2229((byte) -65, GlMultiTexSourceEnum.CONSTANT, 2);
	if (argument_21_ <= 54)
	    method194(111);
	((Class2_Sub4) this).aClass_ha_Sub2_56.method2191(8, true);
    }
}
