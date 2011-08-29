/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class247
{
    boolean aBoolean1794;
    Interface4_Impl2 anInterface4_Impl2_1795;
    Interface4_Impl2 anInterface4_Impl2_1797;
    static Class207 aClass207_1798 = new Class207(29, 4);
    boolean aBoolean1799;
    
    final void method3201(int argument_0_) {
	if (((Class247) this).anInterface4_Impl2_1795 != null)
	    ((Class247) this).anInterface4_Impl2_1795
		.method44(argument_0_ + 17065);
	if (argument_0_ == -16578)
	    ((Class247) this).aBoolean1794 = false;
    }
    
    public static void method3202(int argument) {
	TexGenEnum.EYE_LINEAR = null;
	aClass207_1798 = null;
    }
    
    static final boolean method3203(int argument, int argument_1_,
				    int argument_2_) {
	if ((argument_1_ & 0x10) == 0)
	    return false;
	return true;
    }
    
    final boolean method3204(int argument_3_) {
	if (!((Class247) this).aBoolean1794 || ((Class247) this).aBoolean1799)
	    return false;
	return true;
    }
    
    Class247(boolean argument_4_) {
	((Class247) this).aBoolean1799 = argument_4_;
    }
}
