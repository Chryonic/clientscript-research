/* Class212 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

final class Class212
{
    int anInt1505;
    static Calendar aCalendar1506;
    static Calendar aCalendar1507 = Calendar.getInstance();
    static int anInt1508;
    static Class166 aClass166_1509;
    /*synthetic*/ static Class aClass1510;
    
    public final String toString() {
	throw new IllegalStateException();
    }
    
    static final int method2976(String argument, boolean argument_0_,
				String argument_1_, int argument_2_) {
	int anLocalInt = argument.length();
	int anLocalInt_3_ = argument_1_.length();
	int anLocalInt_4_ = 0;
	int anLocalInt_5_ = 0;
	char anLocalChar = '\0';
	char anLocalChar_6_ = '\0';
    while_65_:
	do {
	    char anLocalChar_7_;
	    char anLocalChar_8_;
	    for (;;) {
		if (-anLocalChar + anLocalInt_4_ >= anLocalInt
		    && -anLocalChar_6_ + anLocalInt_5_ >= anLocalInt_3_)
		    break while_65_;
		if (anLocalInt <= anLocalInt_4_ - anLocalChar)
		    return -1;
		if (anLocalInt_3_ <= -anLocalChar_6_ + anLocalInt_5_)
		    return 1;
		if (anLocalChar != 0) {
		    anLocalChar_7_ = anLocalChar;
		    boolean anLocalBoolean = false;
		} else
		    anLocalChar_7_ = argument.charAt(anLocalInt_4_++);
		if (anLocalChar_6_ == 0)
		    anLocalChar_8_ = argument_1_.charAt(anLocalInt_5_++);
		else {
		    anLocalChar_8_ = anLocalChar_6_;
		    boolean anLocalBoolean = false;
		}
		anLocalChar
		    = Statics.method1796(anLocalChar_7_, false);
		anLocalChar_6_
		    = Statics.method1796(anLocalChar_8_, false);
		anLocalChar_7_ = Class207.method2946(anLocalChar_7_,
						     (byte) -124, argument_2_);
		anLocalChar_8_ = Class207.method2946(anLocalChar_8_,
						     (byte) -115, argument_2_);
		if (anLocalChar_7_ != anLocalChar_8_
		    && (Character.toUpperCase(anLocalChar_7_)
			!= Character.toUpperCase(anLocalChar_8_))) {
		    anLocalChar_7_ = Character.toLowerCase(anLocalChar_7_);
		    anLocalChar_8_ = Character.toLowerCase(anLocalChar_8_);
		    if (anLocalChar_8_ != anLocalChar_7_)
			break;
		}
	    }
	    return (Class295.method3504(anLocalChar_7_, argument_2_, (byte) 76)
		    - Class295.method3504(anLocalChar_8_, argument_2_,
					  (byte) 56));
	} while (false);
	int anLocalInt_9_ = Math.min(anLocalInt, anLocalInt_3_);
	for (int anLocalInt_10_ = 0; anLocalInt_10_ < anLocalInt_9_;
	     anLocalInt_10_++) {
	    if (argument_2_ == 2) {
		anLocalInt_4_ = -anLocalInt_10_ - 1 + anLocalInt;
		anLocalInt_5_ = anLocalInt_3_ - 1 - anLocalInt_10_;
	    } else
		anLocalInt_4_ = anLocalInt_5_ = anLocalInt_10_;
	    char anLocalChar_11_ = argument.charAt(anLocalInt_4_);
	    char anLocalChar_12_ = argument_1_.charAt(anLocalInt_5_);
	    if (anLocalChar_11_ != anLocalChar_12_
		&& (Character.toUpperCase(anLocalChar_11_)
		    != Character.toUpperCase(anLocalChar_12_))) {
		anLocalChar_11_ = Character.toLowerCase(anLocalChar_11_);
		anLocalChar_12_ = Character.toLowerCase(anLocalChar_12_);
		if (anLocalChar_12_ != anLocalChar_11_)
		    return (Class295.method3504(anLocalChar_11_, argument_2_,
						(byte) 108)
			    - Class295.method3504(anLocalChar_12_, argument_2_,
						  (byte) 68));
	    }
	}
	int anLocalInt_13_ = anLocalInt - anLocalInt_3_;
	if (anLocalInt_13_ != 0)
	    return anLocalInt_13_;
	for (int anLocalInt_14_ = 0; anLocalInt_14_ < anLocalInt_9_;
	     anLocalInt_14_++) {
	    char anLocalChar_15_ = argument.charAt(anLocalInt_14_);
	    char anLocalChar_16_ = argument_1_.charAt(anLocalInt_14_);
	    if (anLocalChar_15_ != anLocalChar_16_)
		return (Class295.method3504(anLocalChar_15_, argument_2_,
					    (byte) 78)
			- Class295.method3504(anLocalChar_16_, argument_2_,
					      (byte) 58));
	}
	return 0;
    }
    
    public static void method2977(int argument) {
	aCalendar1507 = null;
	aCalendar1506 = null;
	aClass166_1509 = null;
    }
    
    Class212(int argument_17_, int argument_18_) {
	((Class212) this).anInt1505 = argument_17_;
    }

    /*synthetic*/ static Class method2979(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aCalendar1506 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	anInt1508 = -1;
	aClass166_1509 = new Class166(76, -1);
    }
}
