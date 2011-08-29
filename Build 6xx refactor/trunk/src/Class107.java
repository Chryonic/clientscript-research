/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class107
{
    private GlToolkit aClass_ha_Sub3_871;
    static Class207 aClass207_872 = new Class207(39, -1);
    private Class149 aClass149_873 = new Class149(256);
    static Class128 aClass128_874;
    static int[] anIntArray875 = new int[8];
    private TextureSource anTextureSource_876;
    static int anInt878;
    static int[] anIntArray879;
    
    public static void method1953(boolean argument) {
	anIntArray875 = null;
	anIntArray879 = null;
	aClass128_874 = null;
	aClass207_872 = null;
	GlToolkit.deletionBuffer = null;
    }
    
    static final void method1954
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_) {
	for (DoublyLinkedNodeP2_Sub8 class104_sub8
		 = (DoublyLinkedNodeP2_Sub8) Node_Sub49.aClass366_4290.method3986(0);
	     class104_sub8 != null;
	     class104_sub8 = (DoublyLinkedNodeP2_Sub8) Node_Sub49.aClass366_4290
						 .method3992((byte) -104)) {
	    if (Class333.anInt2720
		>= ((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4580)
		class104_sub8.unlink();
	    else {
		Statics.method741((((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4575 << 9) + 256, argument_0_ >> 1, 67, argument_3_ >> 1, argument_5_, ((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4576 * 2, argument, ((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4579, (((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4577 << 9) + 256);
		Class173.aAbstractFont_1286.method503
		    (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] + argument_2_, 0,
		     ((DoublyLinkedNodeP2_Sub8) class104_sub8).anInt4583 | ~0xffffff,
		     (byte) 38, ((DoublyLinkedNodeP2_Sub8) class104_sub8).aString4578,
		     argument_4_ + DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1]);
	    }
	}
    }
    
    static final float[] method1955(int argument, float[] argument_6_,
				    int argument_7_) {
	float[] fs = new float[argument_7_];
	JagStrings.memcpy(argument_6_, argument, fs, 0, argument_7_);
	return fs;
    }
    
    final void method1956(byte argument_8_) {
	aClass149_873.clear((byte) -3);
    }
    
    final void method1957(int argument_9_) {
	aClass149_873.method2534(5, (byte) -8);
    }
    
    final GlTexture_Sub4 method1958(int argument_10_, byte argument_11_) {
	Object object = aClass149_873.get((long) argument_10_);
	if (object != null)
	    return (GlTexture_Sub4) object;
	if (!anTextureSource_876.method9(true, argument_10_))
	    return null;
	TextureDescriptor textureDescriptor = anTextureSource_876.getDescriptor(argument_10_, true);
	int anLocalInt
	    = (!((TextureDescriptor) textureDescriptor).isHalfSize
	       ? ((GlToolkit) aClass_ha_Sub3_871).anInt4841 : 64);
	GlTexture_Sub4 class142_sub4;
	if (((TextureDescriptor) textureDescriptor).aBoolean850
	    && aClass_ha_Sub3_871.method2019()) {
	    float[] fs
		= anTextureSource_876.method12((byte) -13, anLocalInt, false,
					      0.7F, argument_10_, anLocalInt);
	    class142_sub4
		= new GlTexture_Sub4(aClass_ha_Sub3_871, 3553, 34842,
				    anLocalInt, anLocalInt,
				    ((TextureDescriptor) textureDescriptor).aByte846 != 0, fs,
				    6408);
	} else {
	    int[] anLocalInts;
	    if (((TextureDescriptor) textureDescriptor).anInt830 == 2
		|| !Node_Sub19.method715(((TextureDescriptor) textureDescriptor).aByte834,
                33))
		anLocalInts
		    = anTextureSource_876.method14(anLocalInt, argument_10_,
						  -99, 0.7F, anLocalInt,
						  false);
	    else
		anLocalInts
		    = anTextureSource_876.method13(anLocalInt, true, anLocalInt,
						  0.7F, argument_10_,
						  (byte) -117);
	    class142_sub4
		= new GlTexture_Sub4(aClass_ha_Sub3_871, 3553, 6408, anLocalInt,
				    anLocalInt,
				    ((TextureDescriptor) textureDescriptor).aByte846 != 0,
				    anLocalInts, 0, 0, false);
	}
	class142_sub4.setWrappingMode(((TextureDescriptor) textureDescriptor).aBoolean841, ((TextureDescriptor) textureDescriptor).aBoolean848);
	aClass149_873.put(class142_sub4, (long) argument_10_);
	return class142_sub4;
    }
    
    static final boolean method1959(int argument, int argument_12_,
				    int argument_13_) {
	if ((argument_12_ & 0x8000) == 0)
	    return false;
	return true;
    }
    
    static final Packet method1960(byte argument) {
	Packet class59_sub28 = new Packet(518);
	Node_Sub31_Sub11.anIntArray5889 = new int[4];
	Node_Sub31_Sub11.anIntArray5889[1]
	    = (int) (Math.random() * 9.9999999E7);
	Node_Sub31_Sub11.anIntArray5889[2]
	    = (int) (Math.random() * 9.9999999E7);
	Node_Sub31_Sub11.anIntArray5889[3]
	    = (int) (Math.random() * 9.9999999E7);
	Node_Sub31_Sub11.anIntArray5889[0]
	    = (int) (Math.random() * 9.9999999E7);
	class59_sub28.p1(10);
	class59_sub28.p4(Node_Sub31_Sub11.anIntArray5889[0]
    );
	class59_sub28.p4(Node_Sub31_Sub11.anIntArray5889[1]
    );
	class59_sub28.p4(Node_Sub31_Sub11.anIntArray5889[2]
    );
	class59_sub28.p4(Node_Sub31_Sub11.anIntArray5889[3]
    );
	return class59_sub28;
    }
    
    static final Class128[] method1961(int argument) {
	return (new Class128[]
		{ Statics.aClass128_859, Node_Sub15.aClass128_3992,
		  Class_aa_Sub1.aClass128_3747,
		  Class245_Sub1_Sub1.aClass128_6511, Class84.aClass128_599,
		  DoublyLinkedNode_Sub51_Sub1.aClass128_6219,
		  Node_Sub31_Sub31.aClass128_5995, Class276.aClass128_2211,
		  aClass128_874, Class28.aClass128_203 });
    }
    
    Class107(GlToolkit argument_14_, TextureSource argument_15_) {
	anTextureSource_876 = argument_15_;
	aClass_ha_Sub3_871 = argument_14_;
    }
    
    static {
	aClass128_874 = new Class128(8, 1);
	anInt878 = 1401;
	anIntArray879 = new int[128];
	for (int anLocalInt = 0; anLocalInt < anIntArray879.length;
	     anLocalInt++)
	    anIntArray879[anLocalInt] = -1;
	for (int anLocalInt = 65; anLocalInt <= 90; anLocalInt++)
	    anIntArray879[anLocalInt] = anLocalInt - 65;
	for (int anLocalInt = 97; anLocalInt <= 122; anLocalInt++)
	    anIntArray879[anLocalInt] = anLocalInt - 97 + 26;
	for (int anLocalInt = 48; anLocalInt <= 57; anLocalInt++)
	    anIntArray879[anLocalInt] = anLocalInt - 48 + 52;
	anIntArray879[45] = anIntArray879[47] = 63;
	anIntArray879[42] = anIntArray879[43] = 62;
    }
}
