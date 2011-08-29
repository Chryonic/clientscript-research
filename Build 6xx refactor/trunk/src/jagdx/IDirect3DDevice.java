/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.Class394;
import jaclib.peer.IUnknown;

public final class IDirect3DDevice extends IUnknown
{
    private Class394 aClass394_6541;
    private static float[] aFloatArray6542 = new float[4];
    
    public final IDirect3DEventQuery method4185() {
	IDirect3DEventQuery idirect3deventquery
	    = new IDirect3DEventQuery(aClass394_6541);
	if (Class395.method4207(0, _CreateEventQuery(idirect3deventquery)))
	    return (!idirect3deventquery.method4176((byte) -91) ? null
		    : idirect3deventquery);
	return null;
    }
    
    private final native int _CreateIndexBuffer
	(int argument_0_, int argument_1_, int argument_2_, int argument_3_,
	 IDirect3DIndexBuffer argument_4_);
    
    public final native int SetVertexDeclaration
	(IDirect3DVertexDeclaration argument_5_);
    
    private final native int _CreateVertexBuffer
	(int argument_6_, int argument_7_, int argument_8_, int argument_9_,
	 IDirect3DVertexBuffer argument_10_);
    
    public final int method4186(int argument_11_, float[] argument_12_) {
	return SetVertexShaderConstantF(argument_11_, argument_12_,
					argument_12_.length / 4);
    }
    
    public final native int SetTextureStageState
	(int argument_13_, int argument_14_, int argument_15_);
    
    public final native int SetSamplerState(int argument_16_, int argument_17_,
					    int argument_18_);
    
    public final native int _CreateVertexShader
	(byte[] argument_19_, IDirect3DVertexShader argument_20_);
    
    private final native int _GetSwapChain(int argument_21_,
					   IDirect3DSwapChain argument_22_);
    
    public final native int Reset(D3DPRESENT_PARAMETERS argument_23_);
    
    public final native int SetLight(int argument_24_, D3DLIGHT argument_25_);
    
    public final native int _CreateCubeTexture
	(int argument_26_, int argument_27_, int argument_28_,
	 int argument_29_, int argument_30_,
	 IDirect3DCubeTexture argument_31_);
    
    public final IDirect3DVolumeTexture method4187
	(int argument_32_, int argument_33_, int argument_34_,
	 int argument_35_, int argument_36_, int argument_37_,
	 int argument_38_) {
	IDirect3DVolumeTexture idirect3dvolumetexture
	    = new IDirect3DVolumeTexture(aClass394_6541);
	int anLocalInt
	    = _CreateVolumeTexture(argument_32_, argument_33_, argument_34_,
				   argument_35_, argument_36_, argument_37_,
				   argument_38_, idirect3dvolumetexture);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dvolumetexture;
    }
    
    public final native int Clear(int argument_39_, int argument_40_,
				  float argument_41_, int argument_42_);
    
    public final IDirect3DPixelShader method4188(byte[] argument_43_) {
	if (argument_43_ == null)
	    return null;
	IDirect3DPixelShader idirect3dpixelshader
	    = new IDirect3DPixelShader(aClass394_6541);
	int anLocalInt
	    = _CreatePixelShader(argument_43_, idirect3dpixelshader);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dpixelshader;
    }
    
    public final IDirect3DCubeTexture method4189
	(int argument_44_, int argument_45_, int argument_46_,
	 int argument_47_, int argument_48_) {
	IDirect3DCubeTexture idirect3dcubetexture
	    = new IDirect3DCubeTexture(aClass394_6541);
	int anLocalInt
	    = _CreateCubeTexture(argument_44_, argument_45_, argument_46_,
				 argument_47_, argument_48_,
				 idirect3dcubetexture);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dcubetexture;
    }
    
    public final int method4190(int argument_49_, float argument_50_) {
	return SetRenderStatef(argument_49_, argument_50_);
    }
    
    public final native int SetPixelShader(IDirect3DPixelShader argument_51_);
    
    public final native int DrawIndexedPrimitive
	(int argument_52_, int argument_53_, int argument_54_,
	 int argument_55_, int argument_56_, int argument_57_);
    
    private final native int _CreateVertexDeclaration
	(VertexElementCollection argument_58_,
	 IDirect3DVertexDeclaration argument_59_);
    
    public final native int SetPixelShaderConstantF
	(int argument_60_, float[] argument_61_, int argument_62_);
    
    private final native int _CreateRenderTarget
	(int argument_63_, int argument_64_, int argument_65_,
	 int argument_66_, int argument_67_, boolean argument_68_,
	 IDirect3DSurface argument_69_);
    
    public final IDirect3DSurface method4191(int argument_70_) {
	IDirect3DSurface idirect3dsurface
	    = new IDirect3DSurface(aClass394_6541);
	int anLocalInt = _GetRenderTarget(argument_70_, idirect3dsurface);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dsurface;
    }
    
    public final IDirect3DVertexDeclaration method4192
	(VertexElementCollection argument_71_,
	 IDirect3DVertexDeclaration argument_72_) {
	if (argument_72_ != null)
	    argument_72_.method4179((byte) -70);
	else
	    argument_72_ = new IDirect3DVertexDeclaration(aClass394_6541);
	int anLocalInt = _CreateVertexDeclaration(argument_71_, argument_72_);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return argument_72_;
    }
    
    public final IDirect3DSurface method4193() {
	IDirect3DSurface idirect3dsurface
	    = new IDirect3DSurface(aClass394_6541);
	int anLocalInt = _GetDepthStencilSurface(idirect3dsurface);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dsurface;
    }
    
    public final native int SetFVF(int argument_73_);
    
    public final IDirect3DVertexBuffer method4194
	(int argument_74_, int argument_75_, int argument_76_,
	 int argument_77_, IDirect3DVertexBuffer argument_78_) {
	if (argument_78_ != null)
	    argument_78_.method4179((byte) -70);
	else
	    argument_78_ = new IDirect3DVertexBuffer(aClass394_6541);
	int anLocalInt
	    = _CreateVertexBuffer(argument_74_, argument_75_, argument_76_,
				  argument_77_, argument_78_);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	argument_78_.anInt6544 = argument_74_;
	return argument_78_;
    }
    
    public final native int SetTransform(int argument_79_,
					 float[] argument_80_);
    
    public final native int SetStreamSource
	(int argument_81_, IDirect3DVertexBuffer argument_82_,
	 int argument_83_, int argument_84_);
    
    public final native int _CreateTexture(int argument_85_, int argument_86_,
					   int argument_87_, int argument_88_,
					   int argument_89_, int argument_90_,
					   IDirect3DTexture argument_91_);
    
    public final native boolean LightEnable(int argument_92_,
					    boolean argument_93_);
    
    public final native int _CreateVolumeTexture
	(int argument_94_, int argument_95_, int argument_96_,
	 int argument_97_, int argument_98_, int argument_99_,
	 int argument_100_, IDirect3DVolumeTexture argument_101_);
    
    private final native int SetRenderStateb(int argument_102_,
					     boolean argument_103_);
    
    public final native int SetVertexShaderConstantF
	(int argument_104_, float[] argument_105_, int argument_106_);
    
    public final native int SetRenderState(int argument_107_,
					   int argument_108_);
    
    public final IDirect3DSurface method4195
	(int argument_109_, int argument_110_, int argument_111_,
	 int argument_112_, int argument_113_, boolean argument_114_) {
	IDirect3DSurface idirect3dsurface
	    = new IDirect3DSurface(aClass394_6541);
	int anLocalInt
	    = _CreateRenderTarget(argument_109_, argument_110_, argument_111_,
				  argument_112_, argument_113_, argument_114_,
				  idirect3dsurface);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dsurface;
    }
    
    private final native int _CreateOffscreenPlainSurface
	(int argument_115_, int argument_116_, int argument_117_,
	 int argument_118_, IDirect3DSurface argument_119_);
    
    public final int method4196(int argument_120_, float argument_121_,
				float argument_122_, float argument_123_,
				float argument_124_) {
	aFloatArray6542[1] = argument_122_;
	aFloatArray6542[3] = argument_124_;
	aFloatArray6542[2] = argument_123_;
	aFloatArray6542[0] = argument_121_;
	return SetPixelShaderConstantF(argument_120_, aFloatArray6542, 1);
    }
    
    public final native int SetIndices(IDirect3DIndexBuffer argument_125_);
    
    public final native int BeginScene();
    
    private final native int _CreateDepthStencilSurface
	(int argument_126_, int argument_127_, int argument_128_,
	 int argument_129_, int argument_130_, boolean argument_131_,
	 IDirect3DSurface argument_132_);
    
    IDirect3DDevice(Class394 argument_133_) {
	super(argument_133_);
	aClass394_6541 = argument_133_;
    }
    
    public final native int DrawPrimitive(int argument_134_, int argument_135_,
					  int argument_136_);
    
    public final native int StretchRect
	(IDirect3DSurface argument_137_, int argument_138_, int argument_139_,
	 int argument_140_, int argument_141_, IDirect3DSurface argument_142_,
	 int argument_143_, int argument_144_, int argument_145_,
	 int argument_146_, int argument_147_);
    
    public final native int EndScene();
    
    public final native int _CreatePixelShader
	(byte[] argument_148_, IDirect3DPixelShader argument_149_);
    
    private final native int _GetRenderTarget(int argument_150_,
					      IDirect3DSurface argument_151_);
    
    public final int method4197(int argument_152_, float argument_153_,
				float argument_154_, float argument_155_,
				float argument_156_) {
	aFloatArray6542[0] = argument_153_;
	aFloatArray6542[3] = argument_156_;
	aFloatArray6542[2] = argument_155_;
	aFloatArray6542[1] = argument_154_;
	return SetVertexShaderConstantF(argument_152_, aFloatArray6542, 1);
    }
    
    private final native int _GetDepthStencilSurface
	(IDirect3DSurface argument_157_);
    
    public final IDirect3DVertexShader method4198(byte[] argument_158_) {
	if (argument_158_ == null)
	    return null;
	IDirect3DVertexShader idirect3dvertexshader
	    = new IDirect3DVertexShader(aClass394_6541);
	int anLocalInt
	    = _CreateVertexShader(argument_158_, idirect3dvertexshader);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dvertexshader;
    }
    
    public final IDirect3DTexture method4199
	(int argument_159_, int argument_160_, int argument_161_,
	 int argument_162_, int argument_163_, int argument_164_) {
	IDirect3DTexture idirect3dtexture
	    = new IDirect3DTexture(aClass394_6541);
	int anLocalInt
	    = _CreateTexture(argument_159_, argument_160_, argument_161_,
			     argument_162_, argument_163_, argument_164_,
			     idirect3dtexture);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dtexture;
    }
    
    public final IDirect3DSwapChain method4200(int argument_165_) {
	IDirect3DSwapChain idirect3dswapchain
	    = new IDirect3DSwapChain(aClass394_6541);
	int anLocalInt = _GetSwapChain(argument_165_, idirect3dswapchain);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return idirect3dswapchain;
    }
    
    public final native int SetVertexShader
	(IDirect3DVertexShader argument_166_);
    
    private final native int _CreateEventQuery
	(IDirect3DEventQuery argument_167_);
    
    public final native int SetViewport
	(int argument_168_, int argument_169_, int argument_170_,
	 int argument_171_, float argument_172_, float argument_173_);
    
    public final native int SetTexture(int argument_174_,
				       IDirect3DBaseTexture argument_175_);
    
    public final IDirect3DIndexBuffer method4201
	(int argument_176_, int argument_177_, int argument_178_,
	 int argument_179_, IDirect3DIndexBuffer argument_180_) {
	if (argument_180_ == null)
	    argument_180_ = new IDirect3DIndexBuffer(aClass394_6541);
	else
	    argument_180_.method4179((byte) -70);
	int anLocalInt
	    = _CreateIndexBuffer(argument_176_, argument_177_, argument_178_,
				 argument_179_, argument_180_);
	if (Class395.method4208(anLocalInt, (byte) -100))
	    throw new RuntimeException_Sub1(String.valueOf(anLocalInt));
	return argument_180_;
    }
    
    public final native int TestCooperativeLevel();
    
    public final int method4202(int argument_181_, boolean argument_182_) {
	return SetRenderStateb(argument_181_, argument_182_);
    }
    
    private final native int SetRenderStatef(int argument_183_,
					     float argument_184_);
    
    private final native int _GetBackBuffer
	(int argument_185_, int argument_186_, int argument_187_,
	 IDirect3DSurface argument_188_);
    
    public final native int SetScissorRect
	(int argument_189_, int argument_190_, int argument_191_,
	 int argument_192_);
}
