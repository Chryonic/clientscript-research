/* Class59_Sub31_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

final class Node_Sub31_Sub14 extends Node_Sub31
{
    public Node_Sub31_Sub14() {
	super(0, true);
    }
    
    static final String method915(boolean argument, int argument_0_,
				  long argument_1_, int argument_2_) {
	Calendar calendar;
	if (argument) {
	    Class379.method4098(-17062, argument_1_);
	    calendar = Class212.aCalendar1506;
	} else {
	    Statics.method292((byte) -105, argument_1_);
	    calendar = Class212.aCalendar1507;
	}
	int anLocalInt = calendar.get(5);
	int anLocalInt_3_ = calendar.get(2);
	int anLocalInt_4_ = calendar.get(1);
	int anLocalInt_5_ = calendar.get(11);
	int anLocalInt_6_ = calendar.get(12);
	if (argument_0_ == 3)
	    return Class37.method390(argument_0_, argument, (byte) 70,
				     argument_1_);
	return (Integer.toString(anLocalInt / 10) + anLocalInt % 10 + "-"
		+ (Class256_Sub2.aStringArrayArray5625[argument_0_]
		   [anLocalInt_3_])
		+ "-" + anLocalInt_4_ + " " + anLocalInt_5_ / 10
		+ anLocalInt_5_ % 10 + ":" + anLocalInt_6_ / 10
		+ anLocalInt_6_ % 10);
    }
    
    final int[] method867(byte argument_7_, int argument_8_) {
	if (argument_7_ <= 21)
	    return null;
	return Class130.anIntArray1053;
    }
}
