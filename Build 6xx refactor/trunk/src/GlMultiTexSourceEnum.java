/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlMultiTexSourceEnum
{

    static GlMultiTexSourceEnum TEXTURE = new GlMultiTexSourceEnum();
    static GlMultiTexSourceEnum PRIMARY_COLOUR = new GlMultiTexSourceEnum();
    static GlMultiTexSourceEnum PREVIOUS = new GlMultiTexSourceEnum();
    static GlMultiTexSourceEnum CONSTANT = new GlMultiTexSourceEnum();

    static int toGLConstant(GlMultiTexSourceEnum argument_13_) {
        if (argument_13_ == TEXTURE)  //Texture
            return 5890;
        if (PRIMARY_COLOUR == argument_13_)        //Primary colour
            return 34167;
        if (argument_13_ == PREVIOUS)          //Previous
            return 34168;
        if (CONSTANT == argument_13_)        //Constant
            return 34166;
        throw new IllegalArgumentException();
    }

    public final String toString() {
	throw new IllegalStateException();
    }

    public GlMultiTexSourceEnum() {
	/* empty */
    }

}
