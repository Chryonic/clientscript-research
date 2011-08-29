/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class188 {
    static Class320 aClass320_1394 = new Class320(2);

    public static void method2867(int argument) {
        aClass320_1394 = null;
    }

    static final GlTexture_Sub4_Sub1 method2868(byte[] argument, int argument_0_, int argument_1_, GlToolkit argument_2_, int argument_3_, int argument_4_, boolean argument_5_, byte argument_6_) {
        if (argument_2_.aBoolean4927 || (Class2_Sub1.method198(argument_3_) && Class2_Sub1.method198(argument_1_)))
            return new GlTexture_Sub4_Sub1(argument_2_, 3553, argument_0_, argument_3_, argument_1_, argument_5_, argument, argument_4_);
        if (!argument_2_.haveTextureRectangle)
            return new GlTexture_Sub4_Sub1(argument_2_, argument_0_, argument_3_, argument_1_, MathStatics.method2589(argument_3_), MathStatics.method2589(argument_1_), argument, argument_4_);
        return new GlTexture_Sub4_Sub1(argument_2_, 34037, argument_0_, argument_3_, argument_1_, argument_5_, argument, argument_4_);
    }
}
