/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

final class Class37
{
    static Class207 aClass207_272 = new Class207(12, 7);
    static int[][] anIntArrayArray273
	= { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 },
	    { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 },
	    { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 },
	    { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
    static Class76 aClass76_274;
    
    static final long method386(byte argument, String argument_0_) {
	long l = 0L;
	int anLocalInt = argument_0_.length();
	for (int anLocalInt_1_ = 0; anLocalInt > anLocalInt_1_;
	     anLocalInt_1_++) {
	    l *= 37L;
	    char anLocalChar = argument_0_.charAt(anLocalInt_1_);
	    if (anLocalChar < 'A' || anLocalChar > 'Z') {
		if (anLocalChar < 'a' || anLocalChar > 'z') {
		    if (anLocalChar >= '0' && anLocalChar <= '9')
			l += (long) (anLocalChar - '0' + '\033');
		} else
		    l += (long) (anLocalChar - '`');
	    } else
		l += (long) (anLocalChar + '\001' - 'A');
	    if (l >= 177917621779460413L)
		break;
	}
	for (/**/; l % 37L == 0L && l != 0L; l /= 37L) {
	    /* empty */
	}
	return l;
    }
    
    static final int method387(byte argument) {
	return Node_Sub13.anInt3978;
    }
    
    static final byte[] method388(boolean argument, byte[] argument_2_) {
	if (argument_2_ == null)
	    return null;
	byte[] anLocalInts = new byte[argument_2_.length];
	JagStrings.memcpy(argument_2_, 0, anLocalInts, 0, argument_2_.length);
	return anLocalInts;
    }
    
    public static void method389(int argument) {
	aClass76_274 = null;
	aClass207_272 = null;
	anIntArrayArray273 = null;
    }
    
    static final String method390(int argument, boolean argument_3_,
				  byte argument_4_, long argument_5_) {
	Calendar calendar;
	if (!argument_3_) {
	    Statics.method292((byte) -124, argument_5_);
	    calendar = Class212.aCalendar1507;
	} else {
	    Class379.method4098(-17062, argument_5_);
	    calendar = Class212.aCalendar1506;
	}
	int anLocalInt = calendar.get(5);
	int anLocalInt_6_ = calendar.get(2) + 1;
	int anLocalInt_7_ = calendar.get(1);
	int anLocalInt_8_ = calendar.get(11);
	int anLocalInt_9_ = calendar.get(12);
	return (Integer.toString(anLocalInt / 10) + anLocalInt % 10 + "/"
		+ anLocalInt_6_ / 10 + anLocalInt_6_ % 10 + "/"
		+ anLocalInt_7_ % 100 / 10 + anLocalInt_7_ % 10 + " "
		+ anLocalInt_8_ / 10 + anLocalInt_8_ % 10 + ":"
		+ anLocalInt_9_ / 10 + anLocalInt_9_ % 10);
    }
}
