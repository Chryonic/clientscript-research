/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

abstract class Class62
{
    Node_Sub50 aClass59_Sub50_440;
    int anInt441;
    static Calendar aCalendar442
	= Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    static Class166 aClass166_443 = new Class166(7, 1);
    static boolean aBoolean444 = false;
    
    abstract int method1342(int argument_0_, byte argument_1_);
    
    abstract void method1343(int argument_2_, byte argument_3_);
    
    abstract int method1344(byte argument_4_);
    
    public static void method1345(int argument) {
	aCalendar442 = null;
	aClass166_443 = null;
    }
    
    abstract void method1346(boolean argument_5_);
    
    Class62(Node_Sub50 argument_6_) {
	((Class62) this).aClass59_Sub50_440 = argument_6_;
	((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    Class62(int argument_7_, Node_Sub50 argument_8_) {
	((Class62) this).anInt441 = argument_7_;
	((Class62) this).aClass59_Sub50_440 = argument_8_;
    }
    
    final void method1347(int argument_9_, int argument_10_) {
	if (argument_9_
	    != (method1342(argument_10_, (byte) -119) ^ 0xffffffff))
	    method1343(argument_10_, (byte) -107);
    }
}
