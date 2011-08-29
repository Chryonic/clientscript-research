/* Class_ha_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;

import jaclib.peer.Class394;

import jagdx.Class395;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.RuntimeException_Sub1;

public final class GraphicsToolkit_Sub2_Sub2 extends GraphicsToolkit_Sub2
{
    private D3DLIGHT aD3DLIGHT6483;
    private int[] anIntArray6484;
    private D3DLIGHT aD3DLIGHT6485;
    private IDirect3DVertexShader anIDirect3DVertexShader6486;
    private int anInt6487;
    boolean aBoolean6488;
    private boolean[] aBooleanArray6489;
    PixelBuffer aPixelBuffer6490;
    IDirect3DDevice anIDirect3DDevice6491;
    D3DCAPS aD3DCAPS6492;
    Class394 aClass394_6493;
    private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS6494;
    private Class310 aClass310_6495;
    GeometryBuffer aGeometryBuffer6496;
    private int anInt6497;
    private IDirect3D anIDirect3D6498;
    private int anInt6499 = 0;
    private Class382[] aClass382Array6500;
    boolean aBoolean6501;
    private D3DLIGHT aD3DLIGHT6502;
    private boolean[] aBooleanArray6503;
    private static int[] anIntArray6504;
    boolean aBoolean6505;
    private static float[] aFloatArray6506 = new float[16];
    private boolean aBoolean6507 = false;
    private static int[] anIntArray6508 = { 77, 80 };
    private boolean[] aBooleanArray6509;
    private boolean[] aBooleanArray6510;
    
    final void loadLights(boolean argument_0_) {
	int anLocalInt;
	for (anLocalInt = 0;
	     anLocalInt < ((GraphicsToolkit_Sub2_Sub2) this).activeLightCount;
	     anLocalInt++) {
	    HardwareLight class59_sub3 = (((GraphicsToolkit_Sub2_Sub2) this)
					 .activeLights[anLocalInt]);
	    int anLocalInt_1_ = anLocalInt + 2;
	    int anLocalInt_2_ = class59_sub3.getColour();
	    float f = class59_sub3.getColourIntensity() / 255.0F;
	    aD3DLIGHT6483.SetPosition((float) class59_sub3.getX(),
				      (float) class59_sub3.getY(),
				      (float) class59_sub3
						  .getZ());
	    aD3DLIGHT6483.SetDiffuse((float) ((anLocalInt_2_ & 0xff2323)
					      >> 16) * f,
				     (float) (anLocalInt_2_ >> 8 & 0xff) * f,
				     f * (float) (anLocalInt_2_ & 0xff), 0.0F);
	    aD3DLIGHT6483.SetAttenuation
		(0.0F, 0.0F, 1.0F / (float) (class59_sub3.getRadius()
					     * class59_sub3.getRadius()));
	    aD3DLIGHT6483.SetRange((float) class59_sub3.getRadius());
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetLight(anLocalInt_1_, aD3DLIGHT6483);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.LightEnable(anLocalInt_1_, true);
	}
	for (/**/; anLocalInt < ((GraphicsToolkit_Sub2_Sub2) this).previousActiveLightCount;
	     anLocalInt++)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.LightEnable(anLocalInt + 2, false);
	super.loadLights(argument_0_);
    }
    
    final void F(int argument_3_, int argument_4_) {
	/* empty */
    }
    
    private static final int method2259(int argument, Class382 argument_5_) {
	int anLocalInt = 124 / ((81 - argument) / 45);
	if (Statics.aClass382_854 == argument_5_)
	    return 2;
	if (argument_5_ == Class388.aClass382_3278)
	    return 1;
	throw new IllegalArgumentException();
    }
    
    final int[] getPixels(int argument_6_, int argument_7_, int argument_8_, int argument_9_) {
	int[] anLocalInts = null;
	IDirect3DSurface idirect3dsurface
	    = ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4191(0);
	IDirect3DSurface idirect3dsurface_10_
	    = ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		  .method4195(argument_8_, argument_9_, 21, 0, 0, true);
	if (Class395.method4207(0, (((GraphicsToolkit_Sub2_Sub2) this)
					.anIDirect3DDevice6491.StretchRect
				    (idirect3dsurface, argument_6_,
				     argument_7_, argument_8_, argument_9_,
				     idirect3dsurface_10_, 0, 0, argument_8_,
				     argument_9_, 0)))
	    && Class395.method4207(0, (idirect3dsurface_10_.LockRect
				       (0, 0, argument_8_, argument_9_, 16,
					(((GraphicsToolkit_Sub2_Sub2) this)
					 .aPixelBuffer6490))))) {
	    anLocalInts = new int[argument_8_ * argument_9_];
	    int anLocalInt
		= ((GraphicsToolkit_Sub2_Sub2) this).aPixelBuffer6490.getRowPitch();
	    if (anLocalInt == argument_8_ * 4)
		((GraphicsToolkit_Sub2_Sub2) this).aPixelBuffer6490
		    .method4206(anLocalInts, 0, 0, argument_9_ * argument_8_);
	    else {
		for (int anLocalInt_11_ = 0; anLocalInt_11_ < argument_9_;
		     anLocalInt_11_++)
		    ((GraphicsToolkit_Sub2_Sub2) this).aPixelBuffer6490.method4206
			(anLocalInts, anLocalInt_11_ * argument_8_,
			 anLocalInt_11_ * anLocalInt, argument_8_);
	    }
	    idirect3dsurface_10_.UnlockRect();
	}
	idirect3dsurface.method4179((byte) -70);
	idirect3dsurface_10_.method4179((byte) -70);
	return anLocalInts;
    }
    
    final void method2156(Class390 argument_12_, int argument_13_,
			  int argument_14_, byte argument_15_) {
	if (argument_15_ > 38)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.DrawPrimitive
		(method2268(argument_12_, 6), argument_14_, argument_13_);
    }
    
    final void method2148(int argument_16_) {
	if (!((GraphicsToolkit_Sub2_Sub2) this).aClass221_4801.method3029(49)) {
	    aFloatArray6506[10] = 1.0F;
	    aFloatArray6506[14] = 0.0F;
	    aFloatArray6506[12] = 0.0F;
	    aFloatArray6506[13] = 0.0F;
	    aFloatArray6506[0] = 1.0F;
	    aFloatArray6506[15] = 1.0F;
	    aFloatArray6506[2] = 0.0F;
	    aFloatArray6506[4] = 0.0F;
	    aFloatArray6506[1] = 0.0F;
	    aFloatArray6506[3] = 0.0F;
	    aFloatArray6506[6] = 0.0F;
	    aFloatArray6506[7] = 0.0F;
	    aFloatArray6506[11] = 0.0F;
	    aFloatArray6506[5] = 1.0F;
	    aFloatArray6506[9] = 0.0F;
	    aFloatArray6506[8] = 0.0F;
	} else
	    ((GraphicsToolkit_Sub2_Sub2) this).aClass350_Sub2_4698
		.getMatrixArray(aFloatArray6506);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetTransform(2, aFloatArray6506);
	if (argument_16_ != 24)
	    aBoolean6507 = false;
    }
    
    final Interface7_Impl2 method2206(int argument_17_, int[] argument_18_,
				      int argument_19_, int argument_20_,
				      boolean argument_21_, int argument_22_,
				      int argument_23_) {
	if (argument_23_ != 9567)
	    anIDirect3DVertexShader6486 = null;
	return new Class370_Sub1(this, argument_19_, argument_22_,
				 argument_21_, argument_18_, argument_20_,
				 argument_17_);
    }
    
    final Interface15 method2097(Interface21 argument_24_,
				 Interface17 argument_25_) {
	return null;
    }
    
    final void clearDepthBuffer() {
	method2212((byte) 126, true);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.Clear(2, 0, 1.0F, 0);
    }
    
    final Interface7_Impl2 method2163(int argument_26_, float[] argument_27_,
				      Class320 argument_28_, int argument_29_,
				      int argument_30_, int argument_31_,
				      int argument_32_, boolean argument_33_) {
	if (argument_32_ != 0)
	    anInt6499 = 11;
	return null;
    }
    
    static final GraphicsToolkit method2260
	(Canvas argument, TextureSource argument_34_, Js5Store argument_35_,
	 Integer argument_36_) {
	Object object = null;
	int anLocalInt = 0;
	int anLocalInt_37_ = 1;
	Class394 class394 = new Class394();
	IDirect3D idirect3d = IDirect3D.method4180(-2147483616, class394);
	D3DCAPS d3dcaps = idirect3d.method4184(anLocalInt, anLocalInt_37_);
	if ((d3dcaps.anInt3339 & 0x1000000) == 0)
	    throw new RuntimeException("");
	if (d3dcaps.anInt3337 < 2)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3355 & 0x2) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3355 & 0x8) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3355 & 0x40) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3355 & 0x200) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3355 & 0x2000000) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3321 & d3dcaps.anInt3371 & 0x10) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3371 & d3dcaps.anInt3321 & 0x20) == 0)
	    throw new RuntimeException("");
	if ((d3dcaps.anInt3371 & d3dcaps.anInt3321 & 0x2) == 0)
	    throw new RuntimeException("");
	if (d3dcaps.anInt3350 > 0 && d3dcaps.anInt3350 < 2)
	    throw new RuntimeException("");
	if (d3dcaps.anInt3354 < 5)
	    throw new RuntimeException("");
	D3DPRESENT_PARAMETERS d3dpresent_parameters
	    = new D3DPRESENT_PARAMETERS(argument);
	if (!method2270(d3dpresent_parameters, anLocalInt_37_, (byte) -84,
			idirect3d, anLocalInt, argument_36_.intValue()))
	    throw new RuntimeException("");
	d3dpresent_parameters.anInt3395 = -2147483648;
	d3dpresent_parameters.aBoolean3401 = true;
	d3dpresent_parameters.aBoolean3399 = true;
	int anLocalInt_38_ = 2;
	if ((d3dcaps.anInt3334 & 0x100000) != 0)
	    anLocalInt_38_ |= 0x10;
	Object object_39_ = null;
	IDirect3DDevice idirect3ddevice;
	try {
	    idirect3ddevice
		= idirect3d.method4182(anLocalInt, anLocalInt_37_, argument,
				       anLocalInt_38_ | 0x40,
				       d3dpresent_parameters);
	} catch (RuntimeException_Sub1 runtimeexception_sub1) {
	    idirect3ddevice
		= idirect3d.method4182(anLocalInt, anLocalInt_37_, argument,
				       anLocalInt_38_ | 0x20,
				       d3dpresent_parameters);
	}
	Class310 class310 = new Class310(idirect3ddevice.method4200(0),
					 idirect3ddevice.method4193());
	GraphicsToolkit_Sub2_Sub2 class_ha_sub2_sub2
	    = new GraphicsToolkit_Sub2_Sub2(anLocalInt, anLocalInt_37_, argument,
				     class394, idirect3d, idirect3ddevice,
				     class310, d3dpresent_parameters, d3dcaps,
				     argument_34_, argument_35_,
				     argument_36_.intValue());
	class_ha_sub2_sub2.method2128(0);
	return class_ha_sub2_sub2;
    }
    
    final float method2165(int argument_40_) {
	int anLocalInt = 19 % ((-7 - argument_40_) / 56);
	return -0.5F;
    }
    
    final void applyActiveTextureRgbCombineMode(int argument_41_) {
	if (argument_41_ == 13608) {
	    int anLocalInt
		= (!aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		   ? 1
		   : method2263(-1,
				(((GraphicsToolkit_Sub2_Sub2) this).rgbCombinationModes
				 [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit])));
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetTextureStageState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 1, anLocalInt);
	}
    }
    
    final void enableSun(int argument_42_) {
	if (argument_42_ == 0) {
	    if (!aBoolean6507) {
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .LightEnable(0, false);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .LightEnable(1, false);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .SetLight(0, aD3DLIGHT6485);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .SetLight(1, aD3DLIGHT6502);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .LightEnable(0, true);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .LightEnable(1, true);
		aBoolean6507 = true;
	    }
	}
    }
    
    final void method2058() {
	/* empty */
    }
    
    final void applyFog(byte argument_43_) {
	((GraphicsToolkit_Sub2_Sub2) this).fogEnd
	    = (float) (((GraphicsToolkit_Sub2_Sub2) this).farPlane
		       - ((GraphicsToolkit_Sub2_Sub2) this).fogDistance);
	((GraphicsToolkit_Sub2_Sub2) this).fogStart
	    = ((float) -((GraphicsToolkit_Sub2_Sub2) this).fogThickness
	       + ((GraphicsToolkit_Sub2_Sub2) this).fogEnd);
	if (((GraphicsToolkit_Sub2_Sub2) this).fogStart
	    < (float) ((GraphicsToolkit_Sub2_Sub2) this).anInt4749)
	    ((GraphicsToolkit_Sub2_Sub2) this).fogStart
		= (float) ((GraphicsToolkit_Sub2_Sub2) this).anInt4749;
	if (argument_43_ == 58) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.method4190(36, ((GraphicsToolkit_Sub2_Sub2) this).fogStart);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.method4190(37, ((GraphicsToolkit_Sub2_Sub2) this).fogEnd);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(34, ((GraphicsToolkit_Sub2_Sub2) this).fogColour);
	}
    }
    
    final boolean method2132(Class320 argument_44_, int argument_45_,
			     DataType argument_46_) {
	if (argument_45_ != -2)
	    aClass382Array6500 = null;
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class395.method4207(0,
				    anIDirect3D6498.method4183(anInt6487,
							       d3ddisplaymode))
		&& Class395.method4207(argument_45_ + 2,
				       (anIDirect3D6498.CheckDeviceFormat
					(anInt6487, anInt6497,
					 d3ddisplaymode.anInt3389, 0, 3,
					 method2269(argument_44_, argument_46_,
						    (byte) 19)))));
    }
    
    final void method2131(int argument_47_, int argument_48_,
			  Interface4_Impl1 argument_49_, int argument_50_,
			  int argument_51_, boolean argument_52_,
			  Class390 argument_53_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetIndices
	    (((Class309) (Class309) argument_49_).anIDirect3DIndexBuffer5610);
	if (argument_52_ != true)
	    method2080(true);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.DrawIndexedPrimitive
	    (method2268(argument_53_, 6), 0, argument_50_, argument_51_,
	     argument_48_, argument_47_);
    }
    
    final void method2261(int argument_54_,
			  IDirect3DVertexShader argument_55_) {
	anIDirect3DVertexShader6486 = argument_55_;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetVertexShader(argument_55_);
	method2126((byte) -73);
    }
    
    final void method2262(byte argument_56_,
			  IDirect3DPixelShader argument_57_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetPixelShader(argument_57_);
    }
    
    final void method2051() {
	/* empty */
    }
    
    private static final int method2263(int argument, CombineModeEnum argument_58_) {
	if (argument_58_ == CombineModeEnum.REPLACE)
	    return 2;
	if (CombineModeEnum.MODULATE == argument_58_)
	    return 4;
	if (argument_58_ == CombineModeEnum.INTERPOLATE)
	    return 26;
	if (argument_58_ != CombineModeEnum.ADD) {
	    if (CombineModeEnum.SUBTRACT == argument_58_)
		return 10;
	} else
	    return 7;
	if (argument != -1)
	    return -19;
	throw new IllegalArgumentException();
    }
    
    private static final int method2264(Class81 argument,
					boolean argument_59_) {
	if (argument_59_ != true)
	    return -41;
	if (argument != Class245_Sub1_Sub1.aClass81_6514) {
	    if (Class95.aClass81_723 != argument) {
		if (Class253_Sub3.aClass81_5677 == argument)
		    return 3;
		if (argument != Class50.aClass81_372) {
		    if (Class133_Sub1.aClass81_5011 == argument)
			return 256;
		} else
		    return 4;
	    } else
		return 2;
	} else
	    return 1;
	return 0;
    }
    
    final Interface17 method2077(int argument_60_, int argument_61_) {
	return null;
    }
    
    final Interface7_Impl3 method2220(byte argument_62_, boolean argument_63_,
				      int argument_64_, int[][] argument_65_) {
	if (argument_62_ <= 92)
	    ((GraphicsToolkit_Sub2_Sub2) this).aBoolean6501 = false;
	return new Class370_Sub3(this, argument_64_, argument_63_,
				 argument_65_);
    }
    
    final boolean method2092() {
	return false;
    }
    
    final ToolkitInfo getDescriptor() {
	D3DADAPTER_IDENTIFIER d3dadapter_identifier
	    = anIDirect3D6498.method4181(anInt6487, 0);
	return new ToolkitInfo(d3dadapter_identifier.VendorID, "Direct3D", 9,
			   d3dadapter_identifier.Description,
			   d3dadapter_identifier.DriverVersion);
    }
    
    final void setupTexcoordGeneration(int argument_66_, TexGenEnum argument_67_) {
	int anLocalInt = 0;
	if (TexGenEnum.NORMAL_MAP != argument_67_) {
	    if (TexGenEnum.EYE_LINEAR == argument_67_)
		anLocalInt = 131072;
	    else if (TexGenEnum.REFLECTION_MAP == argument_67_)
		anLocalInt = 196608;
	} else
	    anLocalInt = 65536;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTextureStageState
	    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 11,
	     ((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit | anLocalInt);
	if (argument_66_ < 40)
	    setMultiTexRgbSource(-26, false, true, null, (byte) 15);
    }
    
    final void swapBuffers(int argument_68_, int argument_69_)
	throws Exception_Sub1 {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.EndScene();
	if (aClass310_6495.method3609(-29727)) {
	    anInt6499 = 0;
	    if (Class395.method4208(aClass310_6495.method3612(-43, 0),
				    (byte) -100))
		method2271(64);
	} else {
	    if (++anInt6499 > 50)
		throw new Exception_Sub1();
	    method2271(64);
	}
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.BeginScene();
    }
    
    final void loadScissor(int argument_70_) {
	if (argument_70_ != -2)
	    aD3DLIGHT6485 = null;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetScissorRect
	    ((((GraphicsToolkit_Sub2_Sub2) this).scissorX
	      + ((GraphicsToolkit_Sub2_Sub2) this).viewportX),
	     (((GraphicsToolkit_Sub2_Sub2) this).scissorBottom
	      + ((GraphicsToolkit_Sub2_Sub2) this).viewportY),
	     ((GraphicsToolkit_Sub2_Sub2) this).scissorRight,
	     ((GraphicsToolkit_Sub2_Sub2) this).scissorY);
    }
    
    final void method2126(byte argument_71_) {
	if (anIDirect3DVertexShader6486 != null
	    || ((((GraphicsToolkit_Sub2_Sub2) this).aClass81Array4744
		 [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit])
		== Node_Sub7.aClass81_3915)) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetTextureStageState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 24, 0);
	    anIntArray6484[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit] = 0;
	} else {
	    if (Class95.aClass81_723
		== (((GraphicsToolkit_Sub2_Sub2) this).aClass81Array4744
		    [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]))
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTransform
		    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit + 16,
		     ((GraphicsToolkit_Sub2_Sub2) this).textureMatrix
			 [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
			 .method3844(aFloatArray6506, -12847));
	    else
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTransform
		    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit + 16,
		     ((GraphicsToolkit_Sub2_Sub2) this).textureMatrix
			 [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
			 .getMatrixArray(aFloatArray6506));
	    int anLocalInt
		= method2264((((GraphicsToolkit_Sub2_Sub2) this).aClass81Array4744
			      [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]),
			     true);
	    if (anLocalInt
		!= anIntArray6484[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .SetTextureStageState
		    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 24, anLocalInt);
		anIntArray6484[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		    = anLocalInt;
	    }
	}
	int anLocalInt = -15 / ((49 - argument_71_) / 63);
    }
    
    final Interface21 method2070(int argument_72_, int argument_73_) {
	return null;
    }
    
    final void method2098() {
	/* empty */
    }
    
    final Interface7_Impl2 method2125
	(boolean argument_74_, Class320 argument_75_, int argument_76_,
	 int argument_77_, byte[] argument_78_, int argument_79_,
	 int argument_80_, int argument_81_) {
	if (argument_79_ != 8)
	    return null;
	return new Class370_Sub1(this, argument_75_, argument_80_,
				 argument_76_, argument_74_, argument_78_,
				 argument_77_, argument_81_);
    }
    
    final void applyLightingToggle(boolean argument_82_) {
	if (argument_82_)
	    aBooleanArray6509 = null;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4202
	    (137, (((GraphicsToolkit_Sub2_Sub2) this).aBoolean4789
		   && !((GraphicsToolkit_Sub2_Sub2) this).aBoolean4784));
    }
    
    final Object method2245(byte argument_83_, Canvas argument_84_) {
	if (argument_83_ <= 61)
	    return null;
	return null;
    }
    
    private static final int method2265(int argument, GlMultiTexSourceEnum argument_85_) {
	if (GlMultiTexSourceEnum.TEXTURE != argument_85_) {
	    if (GlMultiTexSourceEnum.PRIMARY_COLOUR != argument_85_) {
		if (argument_85_ != GlMultiTexSourceEnum.PREVIOUS) {
		    if (GlMultiTexSourceEnum.CONSTANT == argument_85_)
			return 3;
		} else
		    return 1;
	    } else
		return 0;
	} else
	    return 2;
	if (argument != 0)
	    method2268(null, 92);
	throw new IllegalArgumentException();
    }
    
    final void b(int argument_86_, int argument_87_, int argument_88_,
		 int argument_89_, double argument_90_) {
	/* empty */
    }
    
    final void method2266(Class370 argument_91_, int argument_92_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTexture
	    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit,
	     argument_91_.method4046(15901));
	if (aClass382Array6500[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
	    == ((Class370) argument_91_).aClass382_3120) {
	    if (!((Class370) argument_91_).aBoolean3119
		!= !aBooleanArray6489[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .SetSamplerState
		    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 7,
		     (!((Class370) argument_91_).aBoolean3119 ? 0
		      : method2259(-49,
				   ((Class370) argument_91_).aClass382_3120)));
		aBooleanArray6489[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		    = ((Class370) argument_91_).aBoolean3119;
	    }
	} else {
	    int anLocalInt
		= method2259(argument_92_ - 109,
			     ((Class370) argument_91_).aClass382_3120);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetSamplerState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 6, anLocalInt);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetSamplerState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 5, anLocalInt);
	    aClass382Array6500[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		= ((Class370) argument_91_).aClass382_3120;
	    if (aBooleanArray6489[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		!= ((Class370) argument_91_).aBoolean3119) {
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		    .SetSamplerState
		    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 7,
		     (!((Class370) argument_91_).aBoolean3119 ? 0
		      : method2259(-30,
				   ((Class370) argument_91_).aClass382_3120)));
		aBooleanArray6489[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		    = ((Class370) argument_91_).aBoolean3119;
	    }
	}
	if (!aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit] = true;
	    applyActiveTextureAlphaCombineMode(argument_92_ + 0);
	    applyActiveTextureRgbCombineMode(13608);
	}
	if (argument_92_ != 7)
	    aD3DLIGHT6483 = null;
    }
    
    final void method2137(int argument_93_, Canvas argument_94_,
			  Object argument_95_) {
	if (argument_93_ < 92)
	    method2178((byte) 22);
    }
    
    final void method2062(int argument_96_, int argument_97_, int argument_98_,
			  int argument_99_) {
	/* empty */
    }
    
    final void applySunLightPosition(int argument_100_) {
	aD3DLIGHT6485.SetDirection
	    (-((GraphicsToolkit_Sub2_Sub2) this).sunLight0Position[0],
	     -((GraphicsToolkit_Sub2_Sub2) this).sunLight0Position[1],
	     -((GraphicsToolkit_Sub2_Sub2) this).sunLight0Position[2]);
	aD3DLIGHT6502.SetDirection
	    (-((GraphicsToolkit_Sub2_Sub2) this).sunLight1Position[0],
	     -((GraphicsToolkit_Sub2_Sub2) this).sunLight1Position[1],
	     -((GraphicsToolkit_Sub2_Sub2) this).sunLight1Position[2]);
	aBoolean6507 = false;
	if (argument_100_ >= -75)
	    applyActiveTextureRgbCombineMode(-86);
    }
    
    final void method2267(Class370_Sub1 argument_101_, int argument_102_) {
	method2266(argument_101_, 7);
	if (!((Class370_Sub1) argument_101_).aBoolean5527
	    != !aBooleanArray6510[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetSamplerState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 1,
		 !((Class370_Sub1) argument_101_).aBoolean5527 ? 3 : 1);
	    aBooleanArray6510[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		= ((Class370_Sub1) argument_101_).aBoolean5527;
	}
	if (!((Class370_Sub1) argument_101_).aBoolean5526
	    != !aBooleanArray6503[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetSamplerState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 2,
		 ((Class370_Sub1) argument_101_).aBoolean5526 ? 1 : 3);
	    aBooleanArray6503[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
		= ((Class370_Sub1) argument_101_).aBoolean5526;
	}
    }
    
    private static final int method2268(Class390 argument, int argument_103_) {
	if (LoadingBar.aClass390_1359 != argument) {
	    if (Statics.aClass390_1649 != argument) {
		if (Class62_Sub7.aClass390_4390 != argument) {
		    if (argument == Class232.aClass390_1684)
			return 4;
		    if (argument == Class387.aClass390_3267)
			return 6;
		    if (argument == Class276.aClass390_2213)
			return 5;
		} else
		    return 1;
	    } else
		return 3;
	} else
	    return 2;
	if (argument_103_ != 6)
	    anIntArray6508 = null;
	throw new IllegalArgumentException("");
    }
    
    final void method2175(byte argument_104_) {
	if (Class245_Sub2.aClass85_5310
	    == ((GraphicsToolkit_Sub2_Sub2) this).aClass85_4707) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(19, 5);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(20, 6);
	} else if (Node_Sub31_Sub15_Sub1.aClass85_6639
		   == ((GraphicsToolkit_Sub2_Sub2) this).aClass85_4707) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(19, 2);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(20, 2);
	} else if (Class195.aClass85_1419
		   == ((GraphicsToolkit_Sub2_Sub2) this).aClass85_4707) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(19, 9);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetRenderState(20, 2);
	}
	int anLocalInt = 52 % ((argument_104_ + 18) / 37);
    }
    
    final void method2130(Interface4_Impl2 argument_105_, int argument_106_,
			  int argument_107_) {
	Class288 class288 = (Class288) argument_105_;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetStreamSource
	    (argument_106_, ((Class288) class288).anIDirect3DVertexBuffer5615,
	     0, class288.method3472(-84));
	int anLocalInt = -46 / ((argument_107_ + 35) / 38);
    }
    
    static final int method2269(Class320 argument, DataType argument_108_,
				byte argument_109_) {
	if (DataType.BYTE == argument_108_) {
	    if (argument == Class196.aClass320_1437)
		return 22;
	    if (argument == Applet_Sub1.aClass320_9)
		return 21;
	    if (argument != Node_Sub31_Sub23.aClass320_5942) {
		if (Class62_Sub19.aClass320_4426 != argument) {
		    if (argument == Class188.aClass320_1394)
			return 51;
		    if (Node_Sub5.aClass320_3896 == argument)
			return 77;
		} else
		    return 50;
	    } else
		return 28;
	}
	if (argument_109_ != 19)
	    anIntArray6504 = null;
	throw new IllegalArgumentException("");
    }
    
    final void loadViewport(byte argument_110_) {
	if (argument_110_ == -30)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetViewport
		(((GraphicsToolkit_Sub2_Sub2) this).viewportX,
		 ((GraphicsToolkit_Sub2_Sub2) this).viewportY,
		 ((GraphicsToolkit_Sub2_Sub2) this).viewportW,
		 ((GraphicsToolkit_Sub2_Sub2) this).viewportH, 0.0F, 1.0F);
    }
    
    private static final boolean method2270
	(D3DPRESENT_PARAMETERS argument, int argument_111_, byte argument_112_,
	 IDirect3D argument_113_, int argument_114_, int argument_115_) {
	if (argument_112_ != -84)
	    aFloatArray6506 = null;
	int anLocalInt = 0;
	int anLocalInt_116_ = 0;
	int anLocalInt_117_ = 0;
	boolean anLocalBoolean;
	try {
	    D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	    if (Class395.method4208(argument_113_.method4183(argument_114_,
							     d3ddisplaymode),
				    (byte) -100))
		return false;
	while_2_:
	    for (/**/; argument_115_ >= 0; argument_115_--) {
		if (argument_115_ != 1) {
		    anLocalInt_117_ = argument_115_ + 0;
		    for (int anLocalInt_118_ = 0;
			 anLocalInt_118_ < anIntArray6504.length;
			 anLocalInt_118_++) {
			if (argument_113_.CheckDeviceType(argument_114_,
							  argument_111_,
							  (d3ddisplaymode
							   .anInt3389),
							  (anIntArray6504
							   [anLocalInt_118_]),
							  true) == 0
			    && (argument_113_.CheckDeviceFormat
				(argument_114_, argument_111_,
				 d3ddisplaymode.anInt3389, 1, 1,
				 anIntArray6504[anLocalInt_118_])) == 0
			    && (argument_115_ == 0
				|| (argument_113_.CheckDeviceMultiSampleType
				    (argument_114_, argument_111_,
				     anIntArray6504[anLocalInt_118_], true,
				     anLocalInt_117_)) == 0)) {
			    for (int anLocalInt_119_ = 0;
				 anLocalInt_119_ < anIntArray6508.length;
				 anLocalInt_119_++) {
				if ((argument_113_.CheckDeviceFormat
				     (argument_114_, argument_111_,
				      d3ddisplaymode.anInt3389, 2, 1,
				      anIntArray6508[anLocalInt_119_])) == 0
				    && (argument_113_.CheckDepthStencilMatch
					(argument_114_, argument_111_,
					 d3ddisplaymode.anInt3389,
					 anIntArray6504[anLocalInt_118_],
					 anIntArray6508[anLocalInt_119_])) == 0
				    && (argument_115_ == 0
					|| (argument_113_
						.CheckDeviceMultiSampleType
					    (argument_114_, argument_111_,
					     anIntArray6508[anLocalInt_118_],
					     true, anLocalInt_117_)) == 0)) {
				    anLocalInt_116_
					= anIntArray6504[anLocalInt_118_];
				    anLocalInt
					= anIntArray6508[anLocalInt_119_];
				    break while_2_;
				}
			    }
			}
		    }
		}
	    }
	    if (argument_115_ < 0 || anLocalInt_116_ == 0 || anLocalInt == 0)
		return false;
	    argument.anInt3400 = 0;
	    argument.anInt3403 = anLocalInt_116_;
	    argument.anInt3404 = anLocalInt_117_;
	    argument.anInt3393 = anLocalInt;
	    anLocalBoolean = true;
	} catch (Throwable throwable) {
	    return false;
	}
	return anLocalBoolean;
    }
    
    final void applyScissorTestToggle(int argument_120_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .method4202(174, ((GraphicsToolkit_Sub2_Sub2) this).scissorEnabled);
	int anLocalInt = -36 % ((argument_120_ + 54) / 38);
    }
    
    final void method2080(boolean argument_121_) {
	/* empty */
    }
    
    final void method2041(Rectangle[] argument_122_, int argument_123_,
			  int argument_124_,
			  int argument_125_) throws Exception_Sub1 {
	swapBuffers(argument_124_, argument_125_);
    }
    
    final int I() {
	return 0;
    }
    
    private final boolean method2271(int argument_126_) {
	if (argument_126_ != 64)
	    return false;
	int anLocalInt = ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
			     .TestCooperativeLevel();
	if (anLocalInt == 0 || anLocalInt == -2005530519) {
	    Class310 class310
		= (Class310) ((GraphicsToolkit_Sub2_Sub2) this).anObject4688;
	    method2160((byte) 54);
	    class310.method3611(-32387);
	    aD3DPRESENT_PARAMETERS6494.anInt3392 = 0;
	    aD3DPRESENT_PARAMETERS6494.anInt3396 = 0;
	    if (method2270(aD3DPRESENT_PARAMETERS6494, anInt6497, (byte) -84,
			   anIDirect3D6498, anInt6487,
			   ((GraphicsToolkit_Sub2_Sub2) this).anInt4765)) {
		int anLocalInt_127_
		    = ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
			  .Reset(aD3DPRESENT_PARAMETERS6494);
		if (Class395.method4207(0, anLocalInt_127_)) {
		    class310.method3610((byte) -128,
					((GraphicsToolkit_Sub2_Sub2) this)
					    .anIDirect3DDevice6491
					    .method4200(0),
					((GraphicsToolkit_Sub2_Sub2) this)
					    .anIDirect3DDevice6491
					    .method4193());
		    method2235(argument_126_ - 191);
		    method2149(29906);
		    return true;
		}
	    }
	}
	return false;
    }
    
    final void method2213(int argument_128_) {
	if (argument_128_ < 94)
	    method2268(null, 68);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetTransform(3, ((GraphicsToolkit_Sub2_Sub2) this).aFloatArray4755);
    }
    
    final void applyAmbientLightModel(int argument_129_) {
	aD3DLIGHT6485.SetAmbient((((GraphicsToolkit_Sub2_Sub2) this).sunRed
				  * ((GraphicsToolkit_Sub2_Sub2) this).ambientModelIntensity),
				 (((GraphicsToolkit_Sub2_Sub2) this).sunGreen
				  * ((GraphicsToolkit_Sub2_Sub2) this).ambientModelIntensity),
				 (((GraphicsToolkit_Sub2_Sub2) this).ambientModelIntensity
				  * ((GraphicsToolkit_Sub2_Sub2) this).sunBlue),
				 0.0F);
	aBoolean6507 = false;
	if (argument_129_ != 1)
	    method2234(0, -15);
    }
    
    final boolean method2019() {
	return false;
    }
    
    final void method2170(Canvas argument_130_, byte argument_131_,
			  Object argument_132_) {
	aClass310_6495 = (Class310) argument_132_;
	if (argument_131_ != 109)
	    method2267(null, 123);
    }
    
    final Interface7_Impl2 method2242
	(int argument_133_, int argument_134_, DataType argument_135_,
	 Class320 argument_136_, int argument_137_) {
	if (argument_137_ != 18018)
	    setupTexcoordGeneration(53, null);
	return new Class370_Sub1(this, argument_136_, argument_135_,
				 argument_134_, argument_133_);
    }
    
    final Class222 method2134(Class289[] argument_138_, byte argument_139_) {
	int anLocalInt = 8 % ((argument_139_ + 87) / 37);
	return new Class222_Sub1(this, argument_138_);
    }
    
    final void applyActiveTextureAlphaCombineMode(int argument_140_) {
	int anLocalInt
	    = (aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]
	       ? method2263(-1, (((GraphicsToolkit_Sub2_Sub2) this).alphaCombinationModes
				 [((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]))
	       : 1);
	if (argument_140_ == 7)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetTextureStageState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 4, anLocalInt);
    }
    
    final void method2238(int argument_141_, boolean argument_142_) {
	if (argument_141_ <= -103)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.method4202(161, argument_142_);
    }
    
    final Interface7_Impl1 method2154
	(Class320 argument_143_, int argument_144_, int argument_145_,
	 int argument_146_, byte[] argument_147_, int argument_148_) {
	if (argument_148_ != 0)
	    aBooleanArray6509 = null;
	return new Class370_Sub2(this, argument_143_, argument_145_,
				 argument_144_, argument_146_, argument_147_);
    }
    
    private GraphicsToolkit_Sub2_Sub2(int argument_149_, int argument_150_, Canvas argument_151_, Class394 argument_152_, IDirect3D argument_153_, IDirect3DDevice argument_154_, Class310 argument_155_, D3DPRESENT_PARAMETERS argument_156_, D3DCAPS argument_157_, TextureSource argument_158_, Js5Store argument_159_, int argument_160_) {
	super(argument_151_, argument_155_, argument_158_, argument_159_,
	      argument_160_, 0);
	try {
	    anInt6497 = argument_150_;
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491 = argument_154_;
	    ((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493 = argument_152_;
	    anIDirect3D6498 = argument_153_;
	    anInt6487 = argument_149_;
	    ((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492 = argument_157_;
	    aD3DPRESENT_PARAMETERS6494 = argument_156_;
	    aClass310_6495 = argument_155_;
	    aD3DLIGHT6485
		= new D3DLIGHT(((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493);
	    aD3DLIGHT6502
		= new D3DLIGHT(((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493);
	    aD3DLIGHT6483
		= new D3DLIGHT(((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493);
	    ((GraphicsToolkit_Sub2_Sub2) this).aPixelBuffer6490
		= new PixelBuffer(((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493);
	    ((GraphicsToolkit_Sub2_Sub2) this).aGeometryBuffer6496
		= new GeometryBuffer(((GraphicsToolkit_Sub2_Sub2) this)
				     .aClass394_6493);
	    new GeometryBuffer(((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493);
	    ((GraphicsToolkit_Sub2_Sub2) this).aBoolean6488
		= (((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3331
		   & 0x10000) != 0;
	    ((GraphicsToolkit_Sub2_Sub2) this).hasCubeMap
		= ((((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3331 & 0x800)
		   != 0);
	    ((GraphicsToolkit_Sub2_Sub2) this).hasTexture3D
		= (((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3331
		   & 0x2000) != 0;
	    ((GraphicsToolkit_Sub2_Sub2) this).anInt4756
		= (((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3350 > 0
		   ? ((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3350 : 8);
	    ((GraphicsToolkit_Sub2_Sub2) this).aBoolean6501
		= (((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3331
		   & 0x4000) != 0;
	    ((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits
		= ((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3337;
	    ((GraphicsToolkit_Sub2_Sub2) this).aBoolean6505
		= ((((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492.anInt3331 & 0x2)
		   == 0);
	    ((GraphicsToolkit_Sub2_Sub2) this).hasMultiSample
		= (((GraphicsToolkit_Sub2_Sub2) this).anInt4765 > 0
		   || (anIDirect3D6498.CheckDeviceMultiSampleType
		       (anInt6487, anInt6497,
			aD3DPRESENT_PARAMETERS6494.anInt3403, true, 2)) == 0);
	    anIntArray6484 = new int[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    aBooleanArray6503
		= new boolean[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    aBooleanArray6509
		= new boolean[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    aBooleanArray6489
		= new boolean[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    aClass382Array6500
		= new Class382[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    aBooleanArray6510
		= new boolean[((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits];
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.BeginScene();
	} catch (Throwable throwable) {
	    throwable.printStackTrace();
	    method2027((byte) 107);
	    throw new RuntimeException("");
	}
    }
    
    final void setTexEnvColour(int argument_161_) {
	if (argument_161_ != 0)
	    aD3DLIGHT6485 = null;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetRenderState(60, ((GraphicsToolkit_Sub2_Sub2) this).anInt4762);
    }
    
    final void method2195(byte argument_162_, Canvas argument_163_,
			  Object argument_164_) {
	int anLocalInt = -105 / ((21 - argument_162_) / 47);
	if (argument_163_ == ((GraphicsToolkit_Sub2_Sub2) this).aCanvas4680) {
	    Dimension dimension = argument_163_.getSize();
	    if (dimension.width > 0 && dimension.height > 0) {
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.EndScene();
		method2271(64);
		((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.BeginScene();
	    }
	}
    }
    
    final Class2 method2247(int argument_165_, int argument_166_) {
	if (argument_166_ != 2)
	    aD3DLIGHT6485 = null;
	int anLocalInt = argument_165_;
    while_3_:
	do {
	    do {
		if (anLocalInt != 3) {
		    if (anLocalInt != 4) {
			if (anLocalInt == 8)
			    break;
			break while_3_;
		    }
		} else
		    return new Class2_Sub3(this, (((GraphicsToolkit_Sub2_Sub2) this)
						  .aJs5Store_4673));
		return new Class2_Sub4(this,
				       (((GraphicsToolkit_Sub2_Sub2) this)
					.aJs5Store_4673),
				       (((GraphicsToolkit_Sub2_Sub2) this)
					.aClass191_4677));
	    } while (false);
	    return new Class2_Sub9(this,
				   ((GraphicsToolkit_Sub2_Sub2) this).aJs5Store_4673,
				   ((GraphicsToolkit_Sub2_Sub2) this).aClass191_4677);
	} while (false);
	return super.method2247(argument_165_, 2);
    }
    
    final void method2244(int argument_167_) {
	if (((GraphicsToolkit_Sub2_Sub2) this).aBoolean4694) {
	    aFloatArray6506[8] = 0.0F;
	    aFloatArray6506[12] = 0.0F;
	    aFloatArray6506[0] = 1.0F;
	    aFloatArray6506[7] = 0.0F;
	    aFloatArray6506[5] = 1.0F;
	    aFloatArray6506[3] = 0.0F;
	    aFloatArray6506[6] = 0.0F;
	    aFloatArray6506[2] = 0.0F;
	    aFloatArray6506[4] = 0.0F;
	    aFloatArray6506[1] = 0.0F;
	    aFloatArray6506[9] = 0.0F;
	    aFloatArray6506[11] = 0.0F;
	    aFloatArray6506[14] = 0.0F;
	    aFloatArray6506[13] = 0.0F;
	    aFloatArray6506[15] = 1.0F;
	    aFloatArray6506[10] = 1.0F;
	} else
	    ((GraphicsToolkit_Sub2_Sub2) this).aClass350_Sub2_4695
		.getMatrixArray(aFloatArray6506);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetTransform(256, aFloatArray6506);
	if (argument_167_ != 11)
	    applyDepthMaskToggle(-68);
    }
    
    final void method2272(Class370_Sub2 argument_168_, int argument_169_) {
	method2266(argument_168_, 7);
	if (!aBooleanArray6510[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 1, 1);
	    aBooleanArray6510[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit] = true;
	}
	if (!aBooleanArray6503[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 2, 1);
	    aBooleanArray6503[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit] = true;
	}
    }
    
    final Interface4_Impl2 method2248(int argument_170_,
				      boolean argument_171_) {
	if (argument_170_ != 0)
	    method2261(74, null);
	return new Class288(this, argument_171_);
    }
    
    final void method2178(byte argument_172_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4202
	    (28, (((GraphicsToolkit_Sub2_Sub2) this).aBoolean4706
		  && ((GraphicsToolkit_Sub2_Sub2) this).aBoolean4728
		  && ((GraphicsToolkit_Sub2_Sub2) this).fogThickness >= 0));
	if (argument_172_ != 82)
	    anIDirect3D6498 = null;
    }
    
    final void method2059(float argument_173_, float argument_174_,
			  float argument_175_) {
	/* empty */
    }
    
    final void method2087(Interface15 argument_176_) {
	/* empty */
    }
    
    final void method2023() {
	((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493.method4172((byte) 83);
	super.method2023();
    }
    
    final void method2139(int argument_177_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .method4202(27, ((GraphicsToolkit_Sub2_Sub2) this).aBoolean4783);
	if (argument_177_ != 0)
	    method2271(106);
    }
    
    final void clear(int argument_178_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .Clear(1, argument_178_, 0.0F, 0);
    }
    
    final void finish() {
	IDirect3DEventQuery idirect3deventquery
	    = ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4185();
	if (Class395.method4207(0, idirect3deventquery.Issue())) {
	    for (;;) {
		int anLocalInt = idirect3deventquery.IsSignaled();
		if (anLocalInt != 1)
		    break;
		Thread.yield();
	    }
	}
	idirect3deventquery.method4179((byte) -70);
    }
    
    final void method2234(int argument_179_, int argument_180_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTextureStageState
	    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, 11, argument_179_);
	if (argument_180_ != 0)
	    method2247(46, 9);
    }
    
    final Skybox method2045(Skybox argument_181_, Skybox argument_182_,
			     float argument_183_, Skybox argument_184_) {
	return !(0.5F > argument_183_) ? argument_182_ : argument_181_;
    }
    
    final void method2177(boolean argument_185_) {
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .method4202(7, ((GraphicsToolkit_Sub2_Sub2) this).aBoolean4721);
	if (argument_185_ != true)
	    ((GraphicsToolkit_Sub2_Sub2) this).aBoolean6505 = false;
    }
    
    final void setMultiTexRgbSource(int argument_189_, boolean argument_186_, boolean argument_187_, GlMultiTexSourceEnum argument_190_, byte argument_188_) {
	int anLocalInt = argument_189_;
	int anLocalInt_191_;
    while_4_:
	do {
	    do {
		if (anLocalInt != 1) {
		    if (anLocalInt != 2)
			break;
		} else {
		    anLocalInt_191_ = 3;
		    break while_4_;
		}
		anLocalInt_191_ = 26;
		break while_4_;
	    } while (false);
	    anLocalInt_191_ = 2;
	} while (false);
	int anLocalInt_192_ = 0;
	if (argument_186_)
	    anLocalInt_192_ |= 0x20;
	if (argument_188_ == -67) {
	    if (argument_187_)
		anLocalInt_192_ |= 0x10;
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetTextureStageState
		(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, anLocalInt_191_,
		 (method2265(argument_188_ + 67, argument_190_)
		  | anLocalInt_192_));
	}
    }
    
    final Interface4_Impl1 method2142(int argument_193_,
				      boolean argument_194_) {
	if (argument_193_ != -1)
	    return null;
	return new Class309(this, DataType.aDataType_1075, argument_194_);
    }
    
    final void method2149(int argument_195_) {
	for (int anLocalInt = 0;
	     anLocalInt < ((GraphicsToolkit_Sub2_Sub2) this).maxTextureUnits;
	     anLocalInt++) {
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(anLocalInt, 7, 0);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(anLocalInt, 6, 2);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(anLocalInt, 5, 2);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(anLocalInt, 1, 1);
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetSamplerState(anLocalInt, 2, 1);
	    aClass382Array6500[anLocalInt] = Statics.aClass382_854;
	    aBooleanArray6510[anLocalInt] = aBooleanArray6503[anLocalInt]
		= true;
	    aBooleanArray6489[anLocalInt] = false;
	    anIntArray6484[anLocalInt] = 0;
	}
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
	    .SetTextureStageState(0, 6, 1);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(9, 2);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(23,
									 4);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(25,
									 5);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(24,
									 0);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(22,
									 2);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(147,
									 1);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(145,
									 1);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4190(38,
								     0.95F);
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetRenderState(140,
									 3);
	if (argument_195_ == 29906) {
	    aD3DLIGHT6485.SetType(3);
	    aD3DLIGHT6502.SetType(3);
	    aD3DLIGHT6483.SetType(1);
	    aBoolean6507 = false;
	    super.method2149(argument_195_ + 0);
	}
    }
    
    final boolean method2155(Class320 argument_196_, DataType argument_197_,
			     boolean argument_198_) {
	if (argument_198_ != true)
	    aBooleanArray6503 = null;
	D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
	return (Class395.method4207(0,
				    anIDirect3D6498.method4183(anInt6487,
							       d3ddisplaymode))
		&& Class395.method4207(0, (anIDirect3D6498.CheckDeviceFormat
					   (anInt6487, anInt6497,
					    d3ddisplaymode.anInt3389, 0, 4,
					    method2269(argument_196_,
						       argument_197_,
						       (byte) 19)))));
    }
    
    final void applyActiveTexture(byte argument_199_) {
	if (argument_199_ != 123)
	    anIDirect3DVertexShader6486 = null;
    }
    
    final void applySunLightColours(byte argument_200_) {
	if (argument_200_ <= -56) {
	    float f = (((GraphicsToolkit_Sub2_Sub2) this).aBoolean4719
		       ? ((GraphicsToolkit_Sub2_Sub2) this).sunLight0Intensity : 0.0F);
	    float f_201_ = (!((GraphicsToolkit_Sub2_Sub2) this).aBoolean4719 ? 0.0F
			    : -((GraphicsToolkit_Sub2_Sub2) this).sunLight1Intensity);
	    aD3DLIGHT6485.SetDiffuse
		(f * ((GraphicsToolkit_Sub2_Sub2) this).sunRed,
		 ((GraphicsToolkit_Sub2_Sub2) this).sunGreen * f,
		 ((GraphicsToolkit_Sub2_Sub2) this).sunBlue * f, 0.0F);
	    aD3DLIGHT6502.SetDiffuse
		(f_201_ * ((GraphicsToolkit_Sub2_Sub2) this).sunRed,
		 f_201_ * ((GraphicsToolkit_Sub2_Sub2) this).sunGreen,
		 ((GraphicsToolkit_Sub2_Sub2) this).sunBlue * f_201_, 0.0F);
	    aBoolean6507 = false;
	}
    }
    
    final synchronized void processDeletions(int argument_202_) {
	((GraphicsToolkit_Sub2_Sub2) this).aClass394_6493.method4173(true);
	super.processDeletions(argument_202_);
    }
    
    final void method2048() {
	/* empty */
    }
    
    final void method2179(Class222 argument_203_, byte argument_204_) {
	if (argument_204_ == -63) {
	    Class222_Sub1 class222_sub1 = (Class222_Sub1) argument_203_;
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetVertexDeclaration
		(((Class222_Sub1) class222_sub1)
		 .anIDirect3DVertexDeclaration5294);
	}
    }
    
    final void method2122(int argument_205_) {
	applySunLightColours((byte) -61);
	enableSun(0);
	if (argument_205_ != 4)
	    ((GraphicsToolkit_Sub2_Sub2) this).aD3DCAPS6492 = null;
    }
    
    final void applyAlphaTestToggle(int argument_206_) {
	if (argument_206_ >= 121)
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.method4202(15, ((GraphicsToolkit_Sub2_Sub2) this).useAlphaTest);
    }
    
    final void setMultiTexAlphaSource(int argument_210_, GlMultiTexSourceEnum argument_207_, boolean argument_208_, boolean argument_209_) {
	int anLocalInt = argument_210_;
	int anLocalInt_211_;
    while_5_:
	do {
	    do {
		if (anLocalInt != 1) {
		    if (anLocalInt != 2)
			break;
		} else {
		    anLocalInt_211_ = 6;
		    break while_5_;
		}
		anLocalInt_211_ = 27;
		break while_5_;
	    } while (false);
	    anLocalInt_211_ = 5;
	} while (false);
	int anLocalInt_212_ = 0;
	if (argument_208_)
	    anLocalInt_212_ |= 0x10;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.SetTextureStageState
	    (((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, anLocalInt_211_,
	     method2265(0, argument_207_) | anLocalInt_212_);
	if (argument_209_ != true)
	    aBoolean6507 = false;
    }
    
    final void unbindActiveTexture(byte argument_213_) {
	if (argument_213_ > -85)
	    applyActiveTextureAlphaCombineMode(-40);
	if (aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit]) {
	    aBooleanArray6509[((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit] = false;
	    ((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491
		.SetTexture(((GraphicsToolkit_Sub2_Sub2) this).activeTexUnit, null);
	    applyActiveTextureAlphaCombineMode(7);
	    applyActiveTextureRgbCombineMode(13608);
	}
    }
    
    final void applyDepthMaskToggle(int argument_214_) {
	if (argument_214_ != 0)
	    aBoolean6507 = true;
	((GraphicsToolkit_Sub2_Sub2) this).anIDirect3DDevice6491.method4202
	    (14, (((GraphicsToolkit_Sub2_Sub2) this).aBoolean4786
		  && ((GraphicsToolkit_Sub2_Sub2) this).aBoolean4715));
    }
    
    static {
	anIntArray6504 = new int[] { 22, 23 };
    }
}
