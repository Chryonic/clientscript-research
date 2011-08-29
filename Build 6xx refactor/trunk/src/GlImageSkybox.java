/* Class67_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlImageSkybox extends GlSkybox {
    static int[][] anIntArrayArray1197 = new int[6][];
    static int[] textureIds = new int[6];
    static float aFloat827;
    static boolean aBoolean829 = false;
    static int[] anIntArray838 = new int[32];
    static int anInt839 = 0;
    private GlToolkit toolkit;
    private int part2Texture;
    private int part4Texture;
    private GlCubeMap cubemap;
    private int part5Texture;
    private int part0Texture;
    private int part3Texture;
    private int part1Texture;

    public static void method1755(boolean argument) {
	anIntArray838 = null;
    }

    static final Class356 method1756(byte argument) {
	if (argument != 52)
	    anIntArray838 = null;
	return Class72.method1534(argument - 55, 1);
    }

    static final void method1757
	(byte[] argument, int argument_0_, int argument_1_, byte[] argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 boolean argument_7_) {
	int anLocalInt = -(argument_4_ >> 2);
	argument_4_ = -(argument_4_ & 0x3);
	for (int anLocalInt_8_ = -argument_6_; anLocalInt_8_ < 0;
	     anLocalInt_8_++) {
	    for (int anLocalInt_9_ = anLocalInt; anLocalInt_9_ < 0;
		 anLocalInt_9_++) {
		argument_2_[argument_3_++] -= argument[argument_5_++];
		argument_2_[argument_3_++] -= argument[argument_5_++];
		argument_2_[argument_3_++] -= argument[argument_5_++];
		argument_2_[argument_3_++] -= argument[argument_5_++];
	    }
	    for (int anLocalInt_10_ = argument_4_; anLocalInt_10_ < 0;
		 anLocalInt_10_++)
		argument_2_[argument_3_++] -= argument[argument_5_++];
	    argument_5_ += argument_1_;
	    argument_3_ += argument_0_;
	}
    }

    static final int method1758(byte argument,
				Node_Sub28_Sub1 argument_11_) {
	int anLocalInt = argument_11_.method850(-1, 2);
	int anLocalInt_12_;
	if (anLocalInt != 0) {
	    if (anLocalInt != 1) {
		if (anLocalInt == 2)
		    anLocalInt_12_ = argument_11_.method850(-1, 8);
		else
		    anLocalInt_12_ = argument_11_.method850(-1, 11);
	    } else
		anLocalInt_12_ = argument_11_.method850(-1, 5);
	} else
	    anLocalInt_12_ = 0;
	return anLocalInt_12_;
    }

    final GlCubeMap getCubeMap() {
        if (cubemap == null) {
            TextureSource textureSource = toolkit.textureSource;
            textureIds[4] = part4Texture;
            textureIds[2] = part2Texture;
            textureIds[3] = part3Texture;
            textureIds[5] = part5Texture;
            textureIds[1] = part1Texture;
            textureIds[0] = part0Texture;
            boolean useMipmaps = false;
            int size = 0;
            for (int cubePArt = 0; cubePArt < 6; cubePArt++) {
                if (!textureSource.method9(true, textureIds[cubePArt]))
                    return null;
                TextureDescriptor textureDescriptor = textureSource.getDescriptor((textureIds[cubePArt]), true);
                int anLocalInt_2_ = textureDescriptor.isHalfSize ? 64 : 128;
                if (textureDescriptor.aByte846 > 0)
                    useMipmaps = true;
                if (anLocalInt_2_ > size)
                    size = anLocalInt_2_;
            }
            for (int cubePart = 0; cubePart < 6; cubePart++)
                anIntArrayArray1197[cubePart] = textureSource.method13(size, false, size, 1.0F, (textureIds[cubePart]), (byte) -117);
            cubemap = new GlCubeMap(toolkit, 6407, size, useMipmaps, anIntArrayArray1197);
        }
        return cubemap;
    }

    GlImageSkybox(GlToolkit toolkit, int argument_6_, int argument_7_, int argument_8_, int argument_9_, int argument_10_, int argument_11_) {
        part5Texture = argument_11_;
        this.toolkit = toolkit;
        part1Texture = argument_7_;
        part3Texture = argument_9_;
        part0Texture = argument_6_;
        part4Texture = argument_10_;
        part2Texture = argument_8_;
    }

    static {
    }
}
