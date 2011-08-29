/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CombineModeEnum
{

    static CombineModeEnum REPLACE = new CombineModeEnum();
    static CombineModeEnum MODULATE = new CombineModeEnum();
    static CombineModeEnum INTERPOLATE = new CombineModeEnum();
    static CombineModeEnum ADD = new CombineModeEnum();
    static CombineModeEnum SUBTRACT = new CombineModeEnum();

    public CombineModeEnum() {
	/* empty */
    }

    static int toGLConstant(CombineModeEnum argument_2_) {
        if (argument_2_ == REPLACE)
            return 7681;
        if (MODULATE == argument_2_)
            return 8448;
        if (argument_2_ == INTERPOLATE )
            return 34165;
        if (ADD == argument_2_)
            return 260;
        if (argument_2_ == SUBTRACT)
            return 34023;
        throw new IllegalArgumentException();
    }
}
