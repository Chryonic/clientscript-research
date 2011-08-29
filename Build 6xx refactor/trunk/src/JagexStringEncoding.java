/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexStringEncoding
{
    static int anInt128 = 0;
    
    static final String decode(long argument_0_) {
	if (argument_0_ <= 0L || argument_0_ >= 6582952005840035281L)
	    return null;
	if (argument_0_ % 37L == 0L)
	    return null;
	int anLocalInt = 0;
	for (long l = argument_0_; l != 0L; l /= 37L)
	    anLocalInt++;
	StringBuffer stringbuffer = new StringBuffer(anLocalInt);
	while (argument_0_ != 0L) {
	    long l = argument_0_;
	    argument_0_ /= 37L;
	    stringbuffer.append(Class79.aCharArray565
				[(int) (-(argument_0_ * 37L) + l)]);
	}
	return stringbuffer.reverse().toString();
    }
}
