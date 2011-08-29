/* Class2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;

final class Class2_Sub9 extends Class2
{
    private IDirect3DPixelShader anIDirect3DPixelShader3806;
    private Class191 aClass191_3807;
    private GraphicsToolkit_Sub2_Sub2 aClass_ha_Sub2_Sub2_3808;
    private boolean aBoolean3809;
    private IDirect3DVertexShader anIDirect3DVertexShader3810;
    private boolean aBoolean3811;
    private static float[] aFloatArray3812 = new float[16];
    
    final void method190(byte argument_0_) {
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    if ((((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		 .fogThickness)
		> 0) {
		float f
		    = (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		       .fogEnd);
		float f_1_
		    = (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		       .fogStart);
		idirect3ddevice.method4197(16, f, 1.0F / (f - f_1_), 0.0F,
					   0.0F);
	    } else
		idirect3ddevice.method4197(16, 0.0F, 0.0F, 0.0F, 0.0F);
	    idirect3ddevice.method4196
		(0,
		 (float) ((((GraphicsToolkit_Sub2)
			    ((Class2_Sub9) this).aClass_ha_Sub2_56).fogColour
			   & 0xfffb7a)
			  >> 16) / 255.0F,
		 (float) ((((GraphicsToolkit_Sub2)
			    ((Class2_Sub9) this).aClass_ha_Sub2_56).fogColour
			   & 0xffcf)
			  >> 8) / 255.0F,
		 (float) (((GraphicsToolkit_Sub2)
			   ((Class2_Sub9) this).aClass_ha_Sub2_56).fogColour
			  & 0xff) / 255.0F,
		 0.0F);
	}
	if (argument_0_ > -126)
	    aClass191_3807 = null;
    }
    
    final boolean method185(int argument_2_) {
	if (argument_2_ < 53)
	    aFloatArray3812 = null;
	return aBoolean3809;
    }
    
    final void method188(byte argument_3_) {
	if (argument_3_ != -56)
	    method194(26);
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= ((Class2_Sub9) this).aClass_ha_Sub2_56.method2127((byte) 13);
	    idirect3ddevice.SetVertexShaderConstantF
		(12, class350_sub2.getFirst2Rows(aFloatArray3812),
		 2);
	}
    }
    
    final void method189(int argument_4_, boolean argument_5_) {
	if (argument_4_ != 22789)
	    aFloatArray3812 = null;
    }
    
    final void method195(byte argument_6_) {
	if (argument_6_ < 54)
	    anIDirect3DPixelShader3806 = null;
	if (aBoolean3811) {
	    aClass_ha_Sub2_Sub2_3808.method2261(-1, null);
	    aClass_ha_Sub2_Sub2_3808.method2262((byte) -122, null);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.method2237(true, null);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.method2237(true, null);
	    aBoolean3811 = false;
	}
    }
    
    final void method193(boolean argument_7_, int argument_8_) {
	Interface7_Impl3 interface7_impl3
	    = ((Class2_Sub9) this).aClass_ha_Sub2_56.method2236();
	if (aBoolean3809 && interface7_impl3 != null) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    aClass_ha_Sub2_Sub2_3808.method2261(argument_8_ ^ ~0x2,
						anIDirect3DVertexShader3810);
	    aClass_ha_Sub2_Sub2_3808.method2262((byte) -116,
						anIDirect3DPixelShader3806);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.setActiveTexture(1);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56
		.method2237(true, interface7_impl3);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.setActiveTexture(0);
	    ((Class2_Sub9) this).aClass_ha_Sub2_56.method2237
		(true, ((Class191) aClass191_3807).anInterface7_Impl1_1399);
	    aBoolean3811 = true;
	    method184((byte) -114);
	    method188((byte) -56);
	    method194(1);
	    method190((byte) -127);
	    idirect3ddevice.method4196
		(1,
		 -(((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		   .sunLight0Position[0]),
		 -(((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		   .sunLight0Position[1]),
		 -(((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		   .sunLight0Position[2]),
		 0.0F);
	    idirect3ddevice.method4196
		(2,
		 (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		  .sunRed),
		 (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		  .sunGreen),
		 (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		  .sunBlue),
		 1.0F);
	    idirect3ddevice.method4196(3,
				       (Math.abs(((GraphicsToolkit_Sub2)
						  (((Class2_Sub9) this)
						   .aClass_ha_Sub2_56))
						 .sunLight0Position[1]) * 928.0F
					+ 96.0F),
				       0.0F, 0.0F, 0.0F);
	}
	if (argument_8_ != 2)
	    method184((byte) -107);
    }
    
    final void method196(int argument_9_, byte argument_10_,
			 Interface7 argument_11_) {
	int anLocalInt = -93 % ((60 - argument_10_) / 61);
    }
    
    Class2_Sub9(GraphicsToolkit_Sub2_Sub2 argument_12_, Js5Store argument_13_,
		Class191 argument_14_) {
	super(argument_12_);
	aClass_ha_Sub2_Sub2_3808 = argument_12_;
	aClass191_3807 = argument_14_;
	if (argument_13_ != null
	    && (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		.hasCubeMap)
	    && (((GraphicsToolkit_Sub2) ((Class2_Sub9) this).aClass_ha_Sub2_56)
		.hasTexture3D)
	    && ((((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808).aD3DCAPS6492
		 .anInt3361)
		& 0xffff) >= 257) {
	    anIDirect3DVertexShader3810
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		       .anIDirect3DDevice6491.method4198
		   (argument_13_.getData("dx", "environment_mapped_water_v")));
	    anIDirect3DPixelShader3806
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		       .anIDirect3DDevice6491.method4188
		   (argument_13_.getData("dx", "environment_mapped_water_f")));
	    aBoolean3809 = (anIDirect3DVertexShader3810 != null
			    && anIDirect3DPixelShader3806 != null
			    && aClass191_3807.method2885((byte) -21));
	} else {
	    anIDirect3DPixelShader3806 = null;
	    anIDirect3DVertexShader3810 = null;
	    aBoolean3809 = false;
	}
    }
    
    final void method194(int argument_15_) {
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    idirect3ddevice.method4186
		(8, ((Class2_Sub9) this).aClass_ha_Sub2_56
			.method2118(argument_15_ ^ ~0x4f, aFloatArray3812));
	}
	if (argument_15_ != 1)
	    aBoolean3811 = true;
    }
    
    final void method184(byte argument_16_) {
	int anLocalInt = -28 / ((argument_16_ + 16) / 47);
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3808.method2119(0);
	    Class350_Sub2 class350_sub2_17_
		= aClass_ha_Sub2_Sub2_3808.method2138(-1690);
	    idirect3ddevice.method4186
		(0,
		 class350_sub2_17_.method3856(aFloatArray3812, (byte) -105));
	    idirect3ddevice.method4186
		(4, class350_sub2.method3852((byte) 124, aFloatArray3812));
	}
    }
    
    final void method192(int argument_18_) {
	if (argument_18_ < 70)
	    method189(-61, true);
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    Class350_Sub2 class350_sub2
		= aClass_ha_Sub2_Sub2_3808.method2138(-1690);
	    idirect3ddevice.method4186
		(0, class350_sub2.method3856(aFloatArray3812, (byte) -111));
	}
    }
    
    final void method186(int argument_19_, int argument_20_,
			 boolean argument_21_) {
	if (argument_21_ != true)
	    method185(-116);
	if (aBoolean3811) {
	    IDirect3DDevice idirect3ddevice
		= (((GraphicsToolkit_Sub2_Sub2) aClass_ha_Sub2_Sub2_3808)
		   .anIDirect3DDevice6491);
	    int anLocalInt = 1 << (argument_19_ & 0x3);
	    float f = (float) (1 << ((argument_19_ & 0x3e) >> 3)) / 32.0F;
	    int anLocalInt_22_ = argument_20_ & 0xffff;
	    float f_23_ = (float) (argument_20_ >> 16 & 0x3) / 8.0F;
	    idirect3ddevice.method4197(14,
				       (float) (anLocalInt
						* (((GraphicsToolkit_Sub2)
						    (((Class2_Sub9) this)
						     .aClass_ha_Sub2_56))
						   .anInt4757)
						% 40000) / 40000.0F,
				       0.0F, 0.0F, 0.0F);
	    idirect3ddevice.method4197(15, f, 0.0F, 0.0F, 0.0F);
	    idirect3ddevice.method4196(4, (float) anLocalInt_22_, 0.0F, 0.0F,
				       0.0F);
	    idirect3ddevice.method4196(5, f_23_, 0.0F, 0.0F, 0.0F);
	}
    }
}
