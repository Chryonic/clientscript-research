/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

final class NativeToolkit extends GraphicsToolkit implements Interface3
{
    private ya aYa3466;
    long aLong3467 = 0L;
    private boolean aBoolean3468 = false;
    private CyclicLinkedList aCyclicLinkedList_3469 = new CyclicLinkedList();
    private static int[] anIntArray3470
	= new int[Math.max(Math.max(104, 20), 24573)];
    static int[] anIntArray3471 = new int[6];
    private static int[] anIntArray3472 = new int[8191];
    private static byte[] aByteArray3473 = new byte[8191];
    private static float[] aFloatArray3474;
    private static float[] aFloatArray3475;
    private int anInt3476 = 4096;
    private Class350 aClass350_3477;
    private Class350 aClass350_3478;
    private static short[] aShortArray3479;
    private static int[] anIntArray3480 = anIntArray3470;
    private static int[] anIntArray3481 = new int[8191];
    static int[] anIntArray3482;
    private JagexHashMap aJagexHashMap_3483;
    private static int[] anIntArray3484;
    private p aP3485;
    private int anInt3486 = 4096;
    private boolean aBoolean3487;
    private a[] anAArray3488;
    int anInt3489;
    
    final void method2098() {
	/* empty */
    }
    
    final native void setClip(int argument_0_, int argument_3_, int argument_2_, int argument_1_);
    
    final void drawLine(int argument_4_, int argument_5_, int argument_6_, int argument_7_, int argument_8_, int argument_9_) {
	wa(argument_4_, argument_5_, argument_6_, argument_7_, argument_8_,
	   argument_9_);
    }
    
    private final native void va(dba_sub_772 argument_10_);
    
    final void method2080(boolean argument_11_) {
	/* empty */
    }
    
    private final native void d(int argument_12_);
    
    final Interface21 method2070(int argument_13_, int argument_14_) {
	return method2055(argument_13_, argument_14_, false);
    }
    
    final native void T(int argument_15_, int argument_16_, int argument_17_,
			int argument_18_);
    
    final Skybox method2045(Skybox argument_19_, Skybox argument_20_,
			     float argument_21_, Skybox argument_22_) {
	return null;
    }
    
    final Interface15 method2097(Interface21 argument_23_,
				 Interface17 argument_24_) {
	return new wa(this, (j) argument_23_, (xa) argument_24_);
    }
    
    final void method2059(float argument_25_, float argument_26_,
			  float argument_27_) {
	/* empty */
    }
    
    final boolean method2081() {
	return true;
    }
    
    final void method2043(int argument_28_) {
	anAArray3488[argument_28_].method147();
    }
    
    final native void ra(int argument_29_, int argument_30_, int argument_31_,
			 int argument_32_);
    
    private final void method2355() {
	System.gc();
	System.runFinalization();
	Class346.method3811((byte) -43);
    }
    
    final void setCanvas(Canvas argument_33_, int argument_34_, int argument_35_) {
	p var_p
	    = (p) aJagexHashMap_3483.get((long) argument_33_.hashCode());
	var_p.method1335(argument_33_, argument_34_, argument_35_);
	if (argument_33_ != null && argument_33_ == ((p) aP3485).aCanvas3491)
	    method2018(argument_33_);
    }
    
    final native int JA(int argument_36_, int argument_37_, int argument_38_,
			int argument_39_, int argument_40_, int argument_41_);
    
    final void method2058() {
	method2018(((p) aP3485).aCanvas3491);
    }
    
    final native void clearClip();
    
    private final native void Z
	(int argument_42_, int argument_43_, int argument_44_,
	 int argument_45_, int argument_46_, int argument_47_,
	 Class_aa argument_48_, int argument_49_, int argument_50_);
    
    final int or(int argument_51_, int argument_52_) {
	return argument_51_ | argument_52_;
    }
    
    final native void setSun(int argument_53_, float argument_54_, float argument_55_, float argument_56_, float argument_57_, float argument_58_);
    
    final boolean method2092() {
	return false;
    }
    
    final boolean method2060() {
	return true;
    }
    
    final native int XA();
    
    final void method2067(Class72 argument_59_) {
	if (((Class72) argument_59_).aClass119_497.method2378((byte) 101)
	    != 0) {
	    method2356(argument_59_, false);
	    method2357().method157(this, anIntArray3484, anIntArray3472,
				   anIntArray3481, aShortArray3479,
				   ((Class72) argument_59_).aClass119_497
				       .method2378((byte) 104));
	}
    }
    
    final void method2068(int argument_60_, int argument_61_, int argument_62_,
			  int argument_63_, int argument_64_, int argument_65_,
			  Class_aa argument_66_, int argument_67_,
			  int argument_68_, int argument_69_, int argument_70_,
			  int argument_71_) {
	/* empty */
    }
    
    final void getViewportSize(int[] argument_72_) {
	Dimension dimension = ((p) aP3485).aCanvas3491.getSize();
	argument_72_[0] = dimension.width;
	argument_72_[1] = dimension.height;
    }
    
    private final native void ma(long argument_73_);
    
    final Class350 method2029() {
	return new ja();
    }
    
    final native void getScissor(int[] argument_74_);
    
    final boolean method2075() {
	return true;
    }
    
    final native void pa();
    
    final Class_aa method2066(int argument_75_, int argument_76_,
			      int[] argument_77_, int[] argument_78_) {
	return new na(this, aYa3466, argument_75_, argument_76_, argument_77_,
		      argument_78_);
    }
    
    public final native void w(boolean argument_79_);
    
    final native int M();
    
    final boolean method2064() {
	return true;
    }
    
    final native void EA(int argument_80_, int argument_81_, int argument_82_,
			 int argument_83_);
    
    final int method2016() {
	return 4;
    }
    
    final native void C(boolean argument_84_);
    
    final Class167 method2057(Class101 argument_85_, int argument_86_,
			      int argument_87_, int argument_88_,
			      int argument_89_) {
	return new i(this, aYa3466, argument_85_, argument_86_, argument_87_,
		     argument_88_, argument_89_);
    }
    
    private final native void wa(int argument_90_, int argument_91_,
				 int argument_92_, int argument_93_,
				 int argument_94_, int argument_95_);
    
    final native void da(int argument_96_, int argument_97_, int argument_98_,
			 int[] argument_99_);
    
    final int andPow(int argument_100_, int argument_101_) {
	int anLocalInt = argument_100_ & 0xfffff;
	int anLocalInt_102_ = argument_101_ & 0xfffff;
	return anLocalInt & anLocalInt_102_ ^ anLocalInt_102_;
    }
    
    final native void clearDepthBuffer();
    
    private final void method2356(Class72 argument_103_,
				  boolean argument_104_) {
	int anLocalInt = 0;
	int anLocalInt_105_ = 0;
	int anLocalInt_106_ = 0;
	int anLocalInt_107_ = 0;
	int anLocalInt_108_ = 0;
	for (DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
		 = ((DoublyLinkedNodeP2_Sub4_Sub1)
		    ((Class72) argument_103_).aClass119_497.method2382(-116));
	     class104_sub4_sub1 != null;
	     class104_sub4_sub1
		 = (DoublyLinkedNodeP2_Sub4_Sub1) ((Class72) argument_103_)
					    .aClass119_497.method2379(false)) {
	    anIntArray3484[anLocalInt++]
		= ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6435;
	    anIntArray3484[anLocalInt++]
		= ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6430;
	    anIntArray3484[anLocalInt++]
		= ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6432;
	    anIntArray3472[anLocalInt_105_++]
		= ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6439;
	    aShortArray3479[anLocalInt_107_++]
		= (short) ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6438;
	    anIntArray3481[anLocalInt_106_++]
		= ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).anInt6431;
	    if (argument_104_)
		aByteArray3473[anLocalInt_108_++]
		    = ((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1).aByte6434;
	}
    }
    
    final void method2062(int argument_109_, int argument_110_,
			  int argument_111_, int argument_112_) {
	/* empty */
    }
    
    final native void fillRect(int argument_113_, int argument_114_, int argument_115_, int argument_116_, int argument_117_, int argument_118_);
    
    final void method2073(boolean argument_119_) {
	/* empty */
    }
    
    final Class_s method2085(int argument_120_, int argument_121_,
			     int[][] argument_122_, int[][] argument_123_,
			     int argument_124_, int argument_125_,
			     int argument_126_) {
	return new t(this, aYa3466, argument_120_, argument_121_,
		     argument_122_, argument_123_, argument_124_,
		     argument_125_, argument_126_);
    }
    
    final void processDeletions(int argument_127_) {
	Class346.method3811((byte) -43);
	d(argument_127_);
	for (ya var_ya = (ya) aCyclicLinkedList_3469.getFirst();
	     var_ya != null; var_ya = (ya) aCyclicLinkedList_3469.getNext())
	    var_ya.r();
    }
    
    final boolean method2039() {
	return false;
    }
    
    final native void X(int argument_128_);
    
    final void method2014(dba_sub_772 argument_129_) {
	aYa3466 = (ya) argument_129_;
	va(argument_129_);
    }
    
    final native int I();
    
    final a method2357() {
	for (int anLocalInt = 0; anLocalInt < ((NativeToolkit) this).anInt3489;
	     anLocalInt++) {
	    if (((a) anAArray3488[anLocalInt]).aRunnable3452
		== Thread.currentThread())
		return anAArray3488[anLocalInt];
	}
	return null;
    }
    
    final native void F(int argument_130_, int argument_131_);
    
    final ToolkitInfo getDescriptor() {
	return new ToolkitInfo(0, "SSE", 1, "CPU", 0L);
    }
    
    final void removeCanvas(Canvas argument_132_) {
	if (((p) aP3485).aCanvas3491 == argument_132_)
	    method2018(null);
	p var_p = (p) aJagexHashMap_3483.get((long) argument_132_.hashCode());
	if (var_p != null) {
	    var_p.unlink();
	    var_p.method1333();
	}
    }
    
    final void method2017(int argument_133_) {
	anInt3486 = anInt3476 = argument_133_;
	if (((NativeToolkit) this).anInt3489 > 1)
	    throw new IllegalStateException("No MT");
	method2089(((NativeToolkit) this).anInt3489);
	assignThread(0);
    }
    
    final Class368 method2094(int argument_134_, int argument_135_,
			      int argument_136_, int argument_137_,
			      boolean argument_138_) {
	return new j(this, argument_134_, argument_135_, argument_136_,
		     argument_137_, !argument_138_);
    }
    
    final native void drawHLine(int argument_139_, int argument_140_, int argument_141_, int argument_142_, int argument_143_);
    
    final native int[] getPixels(int argument_144_, int argument_145_, int argument_146_, int argument_147_);
    
    final native int getMemoryUsage();
    
    final void drawRect(int argument_148_, int argument_149_, int argument_150_, int argument_151_, int argument_152_, int argument_153_) {
	drawHLine(argument_148_, argument_149_, argument_150_, argument_152_, argument_153_);
	drawHLine(argument_148_, argument_149_ + argument_151_ - 1, argument_150_, argument_152_, argument_153_);
	drawVLine(argument_148_, argument_149_ + 1, argument_151_ - 1, argument_152_, argument_153_);
	drawVLine(argument_148_ + argument_150_ - 1, argument_149_ + 1, argument_151_ - 1, argument_152_, argument_153_);
    }
    
    final native void b(int argument_154_, int argument_155_,
			int argument_156_, int argument_157_,
			double argument_158_);
    
    final native void drawDot(int argument_159_, int argument_160_, int argument_161_, int argument_162_, int argument_163_);
    
    final native void A(int argument_164_, Class_aa argument_165_,
			int argument_166_, int argument_167_);
    
    private final native void FA();
    
    final void method2031
	(int argument_168_, int argument_169_, int argument_170_,
	 int argument_171_, int argument_172_, int argument_173_,
	 Class_aa argument_174_, int argument_175_, int argument_176_) {
	Z(argument_168_, argument_169_, argument_170_, argument_171_,
	  argument_172_, argument_173_, argument_174_, argument_175_,
	  argument_176_);
    }
    
    final void method2041(Rectangle[] argument_177_, int argument_178_,
			  int argument_179_,
			  int argument_180_) throws Exception_Sub1 {
	if (aP3485 == null)
	    throw new IllegalStateException("off");
	aP3485.method1332(argument_177_, argument_178_, argument_179_,
			  argument_180_);
    }
    
    private final native void t(p argument_181_);
    
    final Class350 method2015() {
	return aClass350_3477;
    }
    
    private final native void N(int argument_182_, int[] argument_183_,
				float[] argument_184_);
    
    final native void drawImage(int argument_185_, int argument_186_, int argument_187_, int argument_188_, int argument_189_, int argument_190_, byte[] argument_191_, int argument_192_, int argument_193_);
    
    final boolean method2019() {
	return false;
    }
    
    final dba_sub_772 method2037(int argument_194_) {
	ya var_ya = new ya(this, argument_194_);
	aCyclicLinkedList_3469.add(var_ya);
	return var_ya;
    }
    
    final void method2074(Class72 argument_195_, int argument_196_) {
	method2356(argument_195_, false);
	method2357().method157(this, anIntArray3484, anIntArray3472,
			       anIntArray3481, aShortArray3479,
			       ((Class72) argument_195_).aClass119_497
				   .method2378((byte) 125));
    }
    
    private final native void AA
	(short argument_197_, short argument_198_, int argument_199_,
	 byte argument_200_, byte argument_201_, int argument_202_,
	 boolean argument_203_, byte argument_204_, byte argument_205_,
	 byte argument_206_, byte argument_207_, boolean argument_208_,
	 boolean argument_209_, boolean argument_210_, boolean argument_211_,
	 boolean argument_212_, byte argument_213_, boolean argument_214_,
	 boolean argument_215_, int argument_216_);
    
    final void method2030(Skybox argument_217_) {
	/* empty */
    }
    
    final void swapBuffers(int argument_218_, int argument_219_)
	throws Exception_Sub1 {
	if (aP3485 == null)
	    throw new IllegalStateException("off");
	aP3485.method1331(argument_218_, argument_219_);
    }
    
    final native int i();
    
    final native void setAmbientIntensity(float argument_220_);
    
    private final Object method2358() {
	return new ba(this);
    }
    
    final void method2053(int argument_221_) {
	throw new IllegalStateException();
    }
    
    final Skybox createSkybox(int argument_222_, int argument_223_, int argument_224_, int argument_225_, int argument_226_, int argument_227_) {
	return null;
    }
    
    final void method2089(int argument_228_) {
	((NativeToolkit) this).anInt3489 = argument_228_;
	anAArray3488 = new a[((NativeToolkit) this).anInt3489];
	for (int anLocalInt = 0; anLocalInt < ((NativeToolkit) this).anInt3489;
	     anLocalInt++)
	    anAArray3488[anLocalInt] = new a(this, anInt3486, anInt3476);
    }
    
    final AbstractFont method2083(Class76 argument_229_, Class83[] argument_230_,
			     boolean argument_231_) {
	int[] anLocalInts = new int[argument_230_.length];
	int[] anLocalInts_232_ = new int[argument_230_.length];
	boolean anLocalBoolean = false;
	for (int anLocalInt = 0; anLocalInt < argument_230_.length;
	     anLocalInt++) {
	    anLocalInts[anLocalInt]
		= ((Class83) argument_230_[anLocalInt]).anInt590;
	    anLocalInts_232_[anLocalInt]
		= ((Class83) argument_230_[anLocalInt]).anInt587;
	    if (((Class83) argument_230_[anLocalInt]).aByteArray592 != null)
		anLocalBoolean = true;
	}
	if (argument_231_) {
	    if (anLocalBoolean)
		throw new IllegalArgumentException
			  ("Cannot specify alpha with non-mono font unless someone writes it");
	    return new h(this, aYa3466, argument_229_, argument_230_, null);
	}
	if (anLocalBoolean)
	    throw new IllegalArgumentException
		      ("Cannot specify alpha with non-mono font unless someone writes it");
	return new n(this, aYa3466, argument_229_, argument_230_, null);
    }
    
    final void method2036(Canvas argument_233_, int argument_234_,
			  int argument_235_) {
	p var_p = (p) aJagexHashMap_3483.get((long) argument_233_.hashCode());
	if (var_p == null) {
	    try {
		Class var_class = Class.forName("java.awt.Canvas");
		Method method
		    = var_class.getMethod("setIgnoreRepaint",
					  new Class[] { Boolean.TYPE });
		method.invoke(argument_233_, new Object[] { Boolean.TRUE });
	    } catch (Exception exception) {
		/* empty */
	    }
	    var_p = new p(this, argument_233_, argument_234_, argument_235_);
	    aJagexHashMap_3483.put((long) argument_233_.hashCode(), var_p);
	} else if (((p) var_p).anInt3494 != argument_234_
		   || ((p) var_p).anInt3490 != argument_235_)
	    var_p.method1335(argument_233_, argument_234_, argument_235_);
    }
    
    final boolean method2042() {
	return true;
    }
    
    final void draw3DTriangle(int argument_236_, int argument_237_, int argument_238_, int argument_239_, int argument_240_, int argument_241_, int argument_242_, int argument_243_, int argument_244_, int argument_245_, int argument_246_, int argument_247_, int argument_248_) {
	/* empty */
    }
    
    final boolean method2049() {
	return true;
    }
    
    final void method2048() {
	/* empty */
    }
    
    final Class368 method2082(int[] argument_249_, int argument_250_,
			      int argument_251_, int argument_252_,
			      int argument_253_, boolean argument_254_) {
	return new j(this, argument_249_, argument_250_, argument_251_,
		     argument_252_, argument_253_, false);
    }
    
    final native void DA(int argument_255_, int argument_256_,
			 int argument_257_, int argument_258_);
    
    final native void H(int argument_259_, int argument_260_,
			int argument_261_, int[] argument_262_);
    
    final void finish() {
	/* empty */
    }
    
    final void assignThread(int argument_263_) {
	anAArray3488[argument_263_].method146();
    }
    
    final void method2087(Interface15 argument_264_) {
	wa var_wa = (wa) argument_264_;
	n(((j) ((wa) var_wa).aJ3655).aLong5595,
	  ((xa) ((wa) var_wa).aXa3653).aLong3500);
    }
    
    final boolean method2038() {
	return true;
    }
    
    final native void HA(int argument_265_, int argument_266_,
			 int argument_267_, int argument_268_,
			 int[] argument_269_);
    
    public NativeToolkit(Canvas argument_270_, TextureSource argument_271_, int argument_272_, int argument_273_) {
	super(argument_271_);
	aJagexHashMap_3483 = new JagexHashMap(4);
	aBoolean3487 = false;
	do {
	    try {
		if (!NativeManager.method2978("sw3d"))
		    throw new RuntimeException("");
		Class346.method3810((byte) 87);
		MA(((GraphicsToolkit) this).textureSource, 0, 0);
		Node_Sub47_Sub1.method1116(true, false, true);
		aBoolean3487 = true;
		aClass350_3477 = new ja();
		method2069(new ja());
		method2089(1);
		assignThread(0);
		if (argument_270_ == null)
		    break;
		method2036(argument_270_, argument_272_, argument_273_);
		method2018(argument_270_);
	    } catch (Throwable throwable) {
		this.method2027((byte) -110);
		throw new RuntimeException();
	    }
	    break;
	} while (false);
    }
    
    private final boolean method2359(short argument_274_) {
	synchronized (((GraphicsToolkit) this).textureSource) {
	    if (!((GraphicsToolkit) this).textureSource.method9(true,
							      argument_274_))
		return false;
	    TextureDescriptor textureDescriptor
		= ((GraphicsToolkit) this).textureSource.getDescriptor(argument_274_, true);
	    if (textureDescriptor == null)
		return false;
	    int[] anLocalInts;
	    if (((TextureDescriptor) textureDescriptor).anInt830 != 2)
		anLocalInts
		    = (((GraphicsToolkit) this).textureSource.method13
		       (128, true, 128, 0.7F, argument_274_, (byte) -101));
	    else
		anLocalInts
		    = ((GraphicsToolkit) this).textureSource
			  .method14(128, argument_274_, -107, 0.7F, 128, true);
	    CA(argument_274_, anLocalInts, ((TextureDescriptor) textureDescriptor).aShort831,
	       ((TextureDescriptor) textureDescriptor).anInt830, ((TextureDescriptor) textureDescriptor).aByte834,
	       ((TextureDescriptor) textureDescriptor).aByte842, ((TextureDescriptor) textureDescriptor).anInt847,
	       ((TextureDescriptor) textureDescriptor).isHalfSize,
	       ((TextureDescriptor) textureDescriptor).aByte840, ((TextureDescriptor) textureDescriptor).aByte828,
	       ((TextureDescriptor) textureDescriptor).aByte845, ((TextureDescriptor) textureDescriptor).aByte849,
	       ((TextureDescriptor) textureDescriptor).aBoolean836,
	       ((TextureDescriptor) textureDescriptor).aBoolean843,
	       ((TextureDescriptor) textureDescriptor).aBoolean833,
	       ((TextureDescriptor) textureDescriptor).aBoolean848,
	       ((TextureDescriptor) textureDescriptor).aBoolean841,
	       ((TextureDescriptor) textureDescriptor).aByte846,
	       ((TextureDescriptor) textureDescriptor).aBoolean850,
	       ((TextureDescriptor) textureDescriptor).aBoolean832,
	       ((TextureDescriptor) textureDescriptor).anInt835);
	}
	return true;
    }
    
    final boolean method2065() {
	return true;
    }
    
    final void method2023() {
	if (!aBoolean3468) {
	    anAArray3488 = null;
	    aP3485 = null;
	    aYa3466 = null;
	    aClass350_3477 = null;
	    aJagexHashMap_3483.method1527(0);
	    for (ya var_ya = (ya) aCyclicLinkedList_3469.getFirst();
		 var_ya != null; var_ya = (ya) aCyclicLinkedList_3469.getNext())
		var_ya.ga();
	    aCyclicLinkedList_3469.clear();
	    FA();
	    if (aBoolean3487) {
		Class112.method2009(true, -11692, false);
		aBoolean3487 = false;
	    }
	    method2355();
	    Class346.method3807(0);
	    aBoolean3468 = true;
	}
    }
    
    private final native void n(long argument_275_, long argument_276_);
    
    final void method2051() {
	/* empty */
    }
    
    final void setLights(int argument_277_, HardwareLight[] argument_278_) {
	int anLocalInt = 0;
	for (int anLocalInt_279_ = 0; anLocalInt_279_ < argument_277_;
	     anLocalInt_279_++) {
	    anIntArray3480[anLocalInt++]
		= argument_278_[anLocalInt_279_].getX();
	    anIntArray3480[anLocalInt++]
		= argument_278_[anLocalInt_279_].getY();
	    anIntArray3480[anLocalInt++]
		= argument_278_[anLocalInt_279_].getZ();
	    anIntArray3480[anLocalInt++]
		= argument_278_[anLocalInt_279_].getRadius();
	    aFloatArray3475[anLocalInt_279_]
		= argument_278_[anLocalInt_279_].getColourIntensity();
	    anIntArray3480[anLocalInt++]
		= argument_278_[anLocalInt_279_].getColour();
	}
	N(argument_277_, anIntArray3480, aFloatArray3475);
    }
    
    final boolean method2034() {
	return false;
    }
    
    final native void f(int argument_280_, int argument_281_);
    
    final Interface17 method2077(int argument_282_, int argument_283_) {
	return new xa(argument_282_, argument_283_);
    }
    
    final void method2095(int argument_284_, int argument_285_,
			  int argument_286_, int argument_287_,
			  int argument_288_, int argument_289_,
			  int argument_290_) {
	method2357().method151(this, argument_284_, argument_285_,
			       argument_286_, argument_287_, argument_288_,
			       argument_289_, argument_290_);
    }
    
    final native void drawVLine(int argument_291_, int argument_292_, int argument_293_, int argument_294_, int argument_295_);
    
    final native void setFog(int argument_296_, int argument_297_, int argument_298_);
    
    final void method2071() {
	/* empty */
    }
    
    final native void clear(int argument_299_);
    
    final Class350 method2096() {
	return aClass350_3478;
    }
    
    final Class368 method2033(Class83 argument_300_, boolean argument_301_) {
	j var_j = new j(this, ((Class83) argument_300_).anIntArray586,
			((Class83) argument_300_).aByteArray591,
			((Class83) argument_300_).aByteArray592, 0,
			((Class83) argument_300_).anInt590,
			((Class83) argument_300_).anInt590,
			((Class83) argument_300_).anInt587);
	var_j.method4024(((Class83) argument_300_).anInt593,
			 ((Class83) argument_300_).anInt589,
			 ((Class83) argument_300_).anInt588,
			 ((Class83) argument_300_).anInt594);
	return var_j;
    }
    
    protected final synchronized void finalize() {
	this.method2027((byte) -76);
	if (((NativeToolkit) this).aLong3467 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    final void method2069(Class350 argument_302_) {
	aClass350_3478 = argument_302_;
	ma(((ja) (ja) argument_302_).aLong3463);
    }
    
    private final boolean method2360(short argument_303_) {
	synchronized (this) {
	    TextureDescriptor textureDescriptor
		= ((GraphicsToolkit) this).textureSource.getDescriptor(argument_303_, true);
	    if (textureDescriptor == null)
		return false;
	    AA(argument_303_, ((TextureDescriptor) textureDescriptor).aShort831,
	       ((TextureDescriptor) textureDescriptor).anInt830, ((TextureDescriptor) textureDescriptor).aByte834,
	       ((TextureDescriptor) textureDescriptor).aByte842, ((TextureDescriptor) textureDescriptor).anInt847,
	       ((TextureDescriptor) textureDescriptor).isHalfSize,
	       ((TextureDescriptor) textureDescriptor).aByte840, ((TextureDescriptor) textureDescriptor).aByte828,
	       ((TextureDescriptor) textureDescriptor).aByte845, ((TextureDescriptor) textureDescriptor).aByte849,
	       ((TextureDescriptor) textureDescriptor).aBoolean836,
	       ((TextureDescriptor) textureDescriptor).aBoolean843,
	       ((TextureDescriptor) textureDescriptor).aBoolean833,
	       ((TextureDescriptor) textureDescriptor).aBoolean848,
	       ((TextureDescriptor) textureDescriptor).aBoolean841,
	       ((TextureDescriptor) textureDescriptor).aByte846,
	       ((TextureDescriptor) textureDescriptor).aBoolean850,
	       ((TextureDescriptor) textureDescriptor).aBoolean832,
	       ((TextureDescriptor) textureDescriptor).anInt835);
	}
	return true;
    }
    
    final native int[] Y();
    
    final native int r(int argument_304_, int argument_305_, int argument_306_,
		       int argument_307_, int argument_308_, int argument_309_,
		       int argument_310_);
    
    final void method2054
	(int argument_311_, int argument_312_, int argument_313_,
	 int argument_314_, int argument_315_, int argument_316_,
	 int argument_317_, int argument_318_, int argument_319_) {
	/* empty */
    }
    
    final boolean method2076() {
	return true;
    }
    
    private final native void CA
	(short argument_320_, int[] argument_321_, short argument_322_,
	 int argument_323_, byte argument_324_, byte argument_325_,
	 int argument_326_, boolean argument_327_, byte argument_328_,
	 byte argument_329_, byte argument_330_, byte argument_331_,
	 boolean argument_332_, boolean argument_333_, boolean argument_334_,
	 boolean argument_335_, boolean argument_336_, byte argument_337_,
	 boolean argument_338_, boolean argument_339_, int argument_340_);
    
    final void method2018(Canvas argument_341_) {
	if (argument_341_ != null) {
	    p var_p
		= (p) aJagexHashMap_3483.get((long) argument_341_.hashCode());
	    aP3485 = var_p;
	    t(var_p);
	} else {
	    aP3485 = null;
	    t(null);
	}
    }
    
    final Class368 method2055(int argument_342_, int argument_343_,
			      boolean argument_344_) {
	return new j(this, argument_342_, argument_343_);
    }
    
    private final native void MA(TextureSource argument_345_, int argument_346_,
				 int argument_347_);
    
    final HardwareLight createLight(int argument_348_, int argument_349_, int argument_350_, int argument_351_, int argument_352_, float argument_353_) {
	return new NativeHardwareLight(argument_348_, argument_349_,
				     argument_350_, argument_351_,
				     argument_352_, argument_353_);
    }
    
    static {
	aShortArray3479 = new short[8191];
	anIntArray3484 = anIntArray3470;
	aFloatArray3474 = new float[20];
	aFloatArray3475 = aFloatArray3474;
	anIntArray3482 = anIntArray3470;
    }
}
