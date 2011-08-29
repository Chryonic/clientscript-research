/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class138
{
    private Class149 aClass149_1086 = new Class149(256);
    private TextureSource anTextureSource_1087;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_1088;
    static Class166 aClass166_1089 = new Class166(105, 8);
    
    final void method2462(int argument_0_) {
	aClass149_1086.method2534(5, (byte) -8);
    }
    
    final Interface7_Impl2 method2463(boolean argument_1_, int argument_2_) {
	Object object = aClass149_1086.get((long) argument_2_);
	if (object != null)
	    return (Interface7_Impl2) object;
	if (!anTextureSource_1087.method9(true, argument_2_))
	    return null;
	TextureDescriptor textureDescriptor = anTextureSource_1087.getDescriptor(argument_2_, true);
	int anLocalInt
	    = (!((TextureDescriptor) textureDescriptor).isHalfSize
	       ? ((GraphicsToolkit_Sub2) aClass_ha_Sub2_1088).anInt4734 : 64);
	Interface7_Impl2 interface7_impl2;
	if (((TextureDescriptor) textureDescriptor).aBoolean850
	    && aClass_ha_Sub2_1088.method2019()) {
	    float[] fs
		= anTextureSource_1087.method12((byte) -13, anLocalInt, false,
					       0.7F, argument_2_, anLocalInt);
	    interface7_impl2
		= aClass_ha_Sub2_1088.method2185(1, anLocalInt, anLocalInt,
						 Applet_Sub1.aClass320_9, fs,
						 (((TextureDescriptor) textureDescriptor)
						  .aByte846) != 0);
	} else {
	    int[] anLocalInts;
	    if (((TextureDescriptor) textureDescriptor).anInt830 != 2
		&& Node_Sub19.method715(((TextureDescriptor) textureDescriptor).aByte834, 99))
		anLocalInts
		    = anTextureSource_1087.method13(anLocalInt, true,
						   anLocalInt, 0.7F,
						   argument_2_, (byte) -93);
	    else
		anLocalInts
		    = anTextureSource_1087.method14(anLocalInt, argument_2_,
						   -119, 0.7F, anLocalInt,
						   false);
	    interface7_impl2
		= aClass_ha_Sub2_1088.method2233((byte) -109, anLocalInt,
						 anLocalInt,
						 (((TextureDescriptor) textureDescriptor)
						  .aByte846) != 0,
						 anLocalInts);
	}
	interface7_impl2.method19(((TextureDescriptor) textureDescriptor).aBoolean841,
				  ((TextureDescriptor) textureDescriptor).aBoolean848, 30135);
	aClass149_1086.put(interface7_impl2, (long) argument_2_);
	return interface7_impl2;
    }
    
    static final boolean method2464(int argument, int argument_3_) {
	if (argument_3_ != 0 && argument_3_ != 2)
	    return false;
	return true;
    }
    
    final void method2465(boolean argument_4_) {
	aClass149_1086.clear((byte) -3);
    }
    
    public static void method2466(byte argument) {
	aClass166_1089 = null;
    }
    
    Class138(GraphicsToolkit_Sub2 argument_5_, TextureSource argument_6_) {
	aClass_ha_Sub2_1088 = argument_5_;
	anTextureSource_1087 = argument_6_;
    }
    
    static final int method2467(int argument, byte argument_7_,
				int argument_8_) {
	if (argument_8_ < argument) {
	    int anLocalInt = argument_8_;
	    argument_8_ = argument;
	    argument = anLocalInt;
	}
	int anLocalInt = -81 / ((-79 - argument_7_) / 46);
	int anLocalInt_9_;
	for (/**/; argument != 0; argument = anLocalInt_9_) {
	    anLocalInt_9_ = argument_8_ % argument;
	    argument_8_ = argument;
	}
	return argument_8_;
    }
    
    static final int method2468(String argument, int argument_10_) {
	return argument.length() + 2;
    }
}
