/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class144
{

    public static void method2514(int argument) {
	TexGenEnum.NORMAL_MAP = null;
    }
    
    static final String method2515(int argument, boolean argument_10_,
				   long argument_11_) {
	Statics.method292((byte) -106, argument_11_);
	int anLocalInt = Class212.aCalendar1507.get(5);
	int anLocalInt_12_ = Class212.aCalendar1507.get(2);
	int anLocalInt_13_ = Class212.aCalendar1507.get(1);
	if (argument == 3)
	    return Class256_Sub3.method3289((byte) -110, argument_11_,
					    argument);
	return (Integer.toString(anLocalInt / 10) + anLocalInt % 10 + "-"
		+ Class256_Sub2.aStringArrayArray5625[argument][anLocalInt_12_]
		+ "-" + anLocalInt_13_);
    }
}
