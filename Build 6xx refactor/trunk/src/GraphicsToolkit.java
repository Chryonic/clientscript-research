/* Class_ha - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Rectangle;

abstract class GraphicsToolkit
{
    TextureSource textureSource;
    int anInt939;
    static int anInt940;
    static int[] anIntArray941 = new int[200];
    
    abstract void b(int argument_0_, int argument_1_, int argument_2_,
		    int argument_3_, double argument_4_);
    
    abstract void setCanvas(Canvas argument_5_, int argument_6_, int argument_7_);
    
    abstract void method2014(dba_sub_772 argument_8_);
    
    abstract Class350 method2015();
    
    abstract int method2016();
    
    abstract void setAmbientIntensity(float argument_9_);
    
    abstract int M();
    
    abstract int r(int argument_10_, int argument_11_, int argument_12_,
		   int argument_13_, int argument_14_, int argument_15_,
		   int argument_16_);
    
    abstract void da(int argument_17_, int argument_18_, int argument_19_,
		     int[] argument_20_);
    
    abstract void setClip(int argument_21_, int argument_24_, int argument_23_, int argument_22_);
    
    abstract int XA();
    
    abstract void clear(int argument_25_);
    
    abstract void method2017(int argument_26_);
    
    abstract void method2018(Canvas argument_27_);
    
    abstract boolean method2019();
    
    final void method2020(int argument_28_, int argument_29_, int argument_30_,
			  int argument_31_, int argument_32_,
			  int argument_33_) {
	fillRect(argument_32_, argument_30_, argument_29_, argument_31_, argument_33_, 1);
    }
    
    static final synchronized GraphicsToolkit method2021
	(int argument, int argument_34_, Canvas argument_35_,
	 byte argument_36_, int argument_37_, TextureSource argument_38_,
	 int argument_39_, Js5Store argument_40_) {
	if (argument_37_ == 0)
	    return Class44.method430(argument_39_, argument_38_, 3,
				     argument_34_, argument_35_);
	if (argument_37_ == 2)
	    return Class84.method1620(argument_34_, argument_38_, argument_35_,
				      (byte) -64, argument_39_);
	if (argument_37_ == 1)
	    return DoublyLinkedNode_Sub51_Sub13.method1257(argument_38_, false, argument, argument_35_);
	if (argument_37_ == 5)
	    return Class133_Sub1.method2449(argument, argument_40_, 0,
					    argument_38_, argument_35_);
	if (argument_37_ == 3)
	    return Class258.method3304(argument_40_, argument_35_, -8992,
				       argument, argument_38_);
	throw new IllegalArgumentException("UM");
    }
    
    public static void method2022(byte argument) {
	anIntArray941 = null;
    }
    
    abstract void method2023();
    
    abstract void f(int argument_41_, int argument_42_);
    
    abstract Skybox createSkybox(int argument_43_, int argument_44_, int argument_45_, int argument_46_, int argument_47_, int argument_48_);
    
    abstract void finish();
    
    abstract void assignThread(int argument_49_);
    
    final void method2027(byte argument_50_) {
	Class361.aBooleanArray3051[((GraphicsToolkit) this).anInt939] = false;
	method2023();
    }
    
    final void method2028(int argument_51_, byte argument_52_,
			  int argument_53_, int argument_54_, int argument_55_,
			  int argument_56_) {
	drawRect(argument_55_, argument_51_, argument_56_, argument_53_, argument_54_, 1);
    }
    
    abstract Class350 method2029();
    
    abstract void method2030(Skybox argument_57_);
    
    abstract void C(boolean argument_58_);
    
    abstract void method2031
	(int argument_59_, int argument_60_, int argument_61_,
	 int argument_62_, int argument_63_, int argument_64_,
	 Class_aa argument_65_, int argument_66_, int argument_67_);
    
    abstract void removeCanvas(Canvas argument_68_);
    
    abstract Class368 method2033(Class83 argument_69_, boolean argument_70_);
    
    abstract boolean method2034();
    
    final void method2035(int argument_71_, byte argument_72_,
			  int argument_73_, int argument_74_, int argument_75_,
			  int argument_76_) {
	drawLine(argument_76_, argument_73_, argument_74_, argument_75_, argument_71_, 1);
    }
    
    abstract void method2036(Canvas argument_77_, int argument_78_,
			     int argument_79_);
    
    abstract void X(int argument_80_);
    
    abstract dba_sub_772 method2037(int argument_81_);
    
    abstract void clearDepthBuffer();
    
    abstract boolean method2038();
    
    abstract boolean method2039();
    
    abstract void setLights(int argument_82_, HardwareLight[] argument_83_);
    
    abstract void method2041(Rectangle[] argument_84_, int argument_85_,
			     int argument_86_,
			     int argument_87_) throws Exception_Sub1;
    
    abstract void drawHLine(int argument_88_, int argument_89_, int argument_90_, int argument_91_, int argument_92_);
    
    abstract void drawImage(int argument_93_, int argument_94_, int argument_95_, int argument_96_, int argument_97_, int argument_98_, byte[] argument_99_, int argument_100_, int argument_101_);
    
    abstract int I();
    
    abstract boolean method2042();
    
    abstract void F(int argument_102_, int argument_103_);
    
    abstract void method2043(int argument_104_);
    
    abstract void getScissor(int[] argument_105_);
    
    final void method2044(boolean argument_106_, Class368 argument_107_) {
	method2087(method2097(argument_107_,
			      method2077(argument_107_.method4019(),
					 argument_107_.method4022())));
    }
    
    abstract int[] Y();
    
    abstract Skybox method2045(Skybox argument_108_, Skybox argument_109_,
				float argument_110_, Skybox argument_111_);
    
    abstract int or(int argument_112_, int argument_113_);
    
    final Class368 method2047(int argument_114_, int[] argument_115_, int argument_117_, int argument_118_, int argument_119_) {
	    return method2082(argument_115_, argument_117_, argument_114_, argument_119_, argument_118_, true);
    }
    
    abstract void method2048();
    
    abstract boolean method2049();
    
    final void method2050(int argument_120_, int argument_121_,
			  int argument_122_, int argument_123_,
			  int argument_124_) {
	drawVLine(argument_122_, argument_123_, argument_120_, argument_124_, 1);
    }
    
    abstract void method2051();
    
    abstract void swapBuffers(int argument_125_, int argument_126_)
	throws Exception_Sub1;
    
    abstract int JA(int argument_127_, int argument_128_, int argument_129_,
		    int argument_130_, int argument_131_, int argument_132_);
    
    abstract void method2053(int argument_133_);
    
    abstract void method2054
	(int argument_134_, int argument_135_, int argument_136_,
	 int argument_137_, int argument_138_, int argument_139_,
	 int argument_140_, int argument_141_, int argument_142_);
    
    abstract Class368 method2055(int argument_143_, int argument_144_,
				 boolean argument_145_);
    
    final void method2056(Rectangle[] argument_146_, int argument_147_,
			  boolean argument_148_) throws Exception_Sub1 {
	if (argument_148_)
	    anInt940 = -66;
	method2041(argument_146_, argument_147_, 0, 0);
    }
    
    abstract Class167 method2057(Class101 argument_149_, int argument_150_,
				 int argument_151_, int argument_152_,
				 int argument_153_);
    
    abstract void method2058();
    
    abstract void method2059(float argument_154_, float argument_155_,
			     float argument_156_);
    
    abstract boolean method2060();
    
    final void method2061(int argument_157_, int argument_158_,
			  int argument_159_, int argument_160_,
			  byte argument_161_) {
	drawHLine(argument_158_, argument_157_, argument_160_, argument_159_, 1);
    }
    
    abstract void drawDot(int argument_162_, int argument_163_, int argument_164_, int argument_165_, int argument_166_);
    
    abstract void method2062(int argument_167_, int argument_168_,
			     int argument_169_, int argument_170_);
    
    abstract int andPow(int argument_171_, int argument_172_);
    
    abstract void A(int argument_173_, Class_aa argument_174_,
		    int argument_175_, int argument_176_);
    
    protected void finalize() {
	method2027((byte) 105);
    }
    
    abstract boolean method2064();
    
    abstract void drawVLine(int argument_177_, int argument_178_, int argument_179_, int argument_180_, int argument_181_);
    
    abstract int[] getPixels(int argument_182_, int argument_183_, int argument_184_, int argument_185_);
    
    abstract boolean method2065();
    
    abstract Class_aa method2066(int argument_186_, int argument_187_,
				 int[] argument_188_, int[] argument_189_);
    
    abstract void method2067(Class72 argument_190_);
    
    abstract void method2068
	(int argument_191_, int argument_192_, int argument_193_,
	 int argument_194_, int argument_195_, int argument_196_,
	 Class_aa argument_197_, int argument_198_, int argument_199_,
	 int argument_200_, int argument_201_, int argument_202_);
    
    abstract void method2069(Class350 argument_203_);
    
    abstract void HA(int argument_204_, int argument_205_, int argument_206_,
		     int argument_207_, int[] argument_208_);
    
    abstract Interface21 method2070(int argument_209_, int argument_210_);
    
    abstract void method2071();
    
    abstract HardwareLight createLight(int argument_211_, int argument_212_, int argument_213_, int argument_214_, int argument_215_, float argument_216_);
    
    abstract void method2073(boolean argument_217_);
    
    abstract void method2074(Class72 argument_218_, int argument_219_);
    
    abstract void setSun(int argument_220_, float argument_221_, float argument_222_, float argument_223_, float argument_224_, float argument_225_);
    
    abstract boolean method2075();
    
    abstract boolean method2076();
    
    abstract Interface17 method2077(int argument_226_, int argument_227_);
    
    abstract void draw3DTriangle(int argument_228_, int argument_229_, int argument_230_, int argument_231_, int argument_232_, int argument_233_, int argument_234_, int argument_235_, int argument_236_, int argument_237_, int argument_238_, int argument_239_, int argument_240_);
    
    abstract void drawRect(int argument_241_, int argument_242_, int argument_243_, int argument_244_, int argument_245_, int argument_246_);
    
    abstract int i();
    
    abstract void DA(int argument_247_, int argument_248_, int argument_249_,
		     int argument_250_);
    
    abstract void method2080(boolean argument_251_);
    
    abstract boolean method2081();
    
    abstract void clearClip();
    
    abstract Class368 method2082(int[] argument_252_, int argument_253_,
				 int argument_254_, int argument_255_,
				 int argument_256_, boolean argument_257_);
    
    abstract AbstractFont method2083(Class76 argument_258_, Class83[] argument_259_,
				boolean argument_260_);
    
    abstract void processDeletions(int argument_261_);
    
    abstract Class_s method2085(int argument_262_, int argument_263_,
				int[][] argument_264_, int[][] argument_265_,
				int argument_266_, int argument_267_,
				int argument_268_);
    
    final void method2086(byte argument_269_) throws Exception_Sub1 {
	swapBuffers(0, 0);
    }
    
    abstract void method2087(Interface15 argument_270_);
    
    abstract void setFog(int argument_271_, int argument_272_, int argument_273_);
    
    abstract void H(int argument_274_, int argument_275_, int argument_276_,
		    int[] argument_277_);
    
    abstract void ra(int argument_278_, int argument_279_, int argument_280_,
		     int argument_281_);
    
    final void method2088(int argument_282_, int argument_283_,
			  int argument_284_, int argument_285_,
			  int argument_286_) {
	drawDot(argument_286_, argument_282_, argument_283_, argument_285_, argument_284_);
    }
    
    abstract void method2089(int argument_287_);
    
    abstract void pa();
    
    abstract void T(int argument_288_, int argument_289_, int argument_290_,
		    int argument_291_);
    
    GraphicsToolkit(TextureSource argument_292_) {
	((GraphicsToolkit) this).textureSource = argument_292_;
	int anLocalInt = -1;
	for (int anLocalInt_293_ = 0; anLocalInt_293_ < 8; anLocalInt_293_++) {
	    if (!Class361.aBooleanArray3051[anLocalInt_293_]) {
		Class361.aBooleanArray3051[anLocalInt_293_] = true;
		anLocalInt = anLocalInt_293_;
		break;
	    }
	}
	if (anLocalInt == -1)
	    throw new IllegalStateException("NFTI");
	((GraphicsToolkit) this).anInt939 = anLocalInt;
    }
    
    abstract void EA(int argument_294_, int argument_295_, int argument_296_,
		     int argument_297_);
    
    abstract ToolkitInfo getDescriptor();
    
    abstract void drawLine(int argument_298_, int argument_299_, int argument_300_, int argument_301_, int argument_302_, int argument_303_);
    
    abstract boolean method2092();
    
    abstract void getViewportSize(int[] argument_304_);
    
    abstract Class368 method2094(int argument_305_, int argument_306_,
				 int argument_307_, int argument_308_,
				 boolean argument_309_);
    
    abstract void fillRect(int argument_310_, int argument_311_, int argument_312_, int argument_313_, int argument_314_, int argument_315_);
    
    abstract void method2095(int argument_316_, int argument_317_,
			     int argument_318_, int argument_319_,
			     int argument_320_, int argument_321_,
			     int argument_322_);
    
    abstract Class350 method2096();
    
    abstract Interface15 method2097(Interface21 argument_323_,
				    Interface17 argument_324_);
    
    abstract int getMemoryUsage();
    
    abstract void method2098();
}
