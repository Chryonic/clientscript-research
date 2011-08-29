/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class91
{
    static Class165 aClass165_697 = new Class165(64);
    int anInt698;
    int anInt699;
    int anInt700;
    int anInt701;
    int anInt702;
    static Node_Sub17 aClass59_Sub17_703;
    int anInt704;
    
    static final Node_Sub29 method1683(byte argument, Class372 argument_0_,
					  Class207 argument_1_) {
	Node_Sub29 class59_sub29 = Node_Sub31_Sub11.method910(-2);
	((Node_Sub29) class59_sub29).anInt4125
	    = ((Class207) argument_1_).anInt1487;
	((Node_Sub29) class59_sub29).aClass207_4128 = argument_1_;
	if (((Node_Sub29) class59_sub29).anInt4125 != -1) {
	    if (((Node_Sub29) class59_sub29).anInt4125 != -2) {
		if (((Node_Sub29) class59_sub29).anInt4125 <= 18)
		    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
			= new Node_Sub28_Sub1(20);
		else if (((Node_Sub29) class59_sub29).anInt4125 > 98)
		    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
			= new Node_Sub28_Sub1(260);
		else
		    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
			= new Node_Sub28_Sub1(100);
	    } else
		((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		    = new Node_Sub28_Sub1(10000);
	} else
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		= new Node_Sub28_Sub1(260);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .method845(argument_0_, -7860);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.method840
	    (-110, ((Node_Sub29) class59_sub29).aClass207_4128
		       .method2947((byte) -68));
	((Node_Sub29) class59_sub29).anInt4131 = 0;
	return class59_sub29;
    }
    
    public static void method1684(int argument) {
	aClass59_Sub17_703 = null;
	aClass165_697 = null;
    }
    
    static final boolean method1685(int argument, int argument_2_,
				    int argument_3_) {
	if ((argument_2_ & 0x20) == 0)
	    return false;
	return true;
    }
    
    static final int method1686(long argument, byte argument_4_) {
	return (int) (argument / 86400000L) - 11745;
    }
    
    public Class91() {
	/* empty */
    }
    
    static final int method1687(int argument, long argument_5_) {
	Statics.method292((byte) -120, argument_5_);
	return Class212.aCalendar1507.get(1);
    }
}
