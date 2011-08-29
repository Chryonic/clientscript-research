/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class TexGenEnum
{
    static boolean aBoolean75 = false;
    static TexGenEnum DISABLED = new TexGenEnum();
    static TexGenEnum EYE_LINEAR = new TexGenEnum();
    static TexGenEnum REFLECTION_MAP = new TexGenEnum();
    static TexGenEnum NORMAL_MAP = new TexGenEnum();

    static int toGLConstant(TexGenEnum argument_38_) {
        if (argument_38_ == EYE_LINEAR)
            return 9216;
        else if (argument_38_ == NORMAL_MAP)
            return 34065;
        else if (REFLECTION_MAP == argument_38_)
            return 34066;
        else
            throw new IllegalArgumentException();
    }

    public final String toString() {
	throw new IllegalStateException();
    }
    
    public TexGenEnum() {
	/* empty */
    }
}
