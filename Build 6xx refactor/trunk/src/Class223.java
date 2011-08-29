/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class223
{
    int anInt1559 = 2048;
    int anInt1560 = 0;
    int anInt1561 = 2048;
    static int[][] anIntArrayArray1562;
    int anInt1563 = 0;
    
    public static void method3039(boolean argument) {
	anIntArrayArray1562 = null;
    }
    
    public Class223() {
	/* empty */
    }
    
    final void method3040(Packet argument_0_, int argument_1_) {
	for (;;) {
	    int anLocalInt = argument_0_.g1();
	    if (anLocalInt == 0)
		break;
	    method3042(argument_0_, anLocalInt, 3);
	}
    }
    
    static final boolean method3041(int argument, int argument_2_,
				    byte argument_3_) {
	if ((argument & 0x10000) != 0 | Statics.method3679(argument, -545, argument_2_)
	    || Statics.method3911(argument, argument_2_, 16385))
	    return true;
	if ((argument_2_ & 0x37) != 0
	    || !Node_Sub47_Sub11.method1140(argument_2_, 0, argument))
	    return false;
	return true;
    }
    
    private final void method3042(Packet argument_4_, int argument_5_,
				  int argument_6_) {
	if (argument_6_ != 3)
	    anIntArrayArray1562 = null;
	if (argument_5_ != 1) {
	    if (argument_5_ != 2) {
		if (argument_5_ != 3) {
		    if (argument_5_ == 4)
			((Class223) this).anInt1560
			    = argument_4_.g2s();
		} else
		    ((Class223) this).anInt1559 = argument_4_.g2();
	    } else
		((Class223) this).anInt1561 = argument_4_.g2();
	} else
	    ((Class223) this).anInt1563 = argument_4_.g1();
    }
}
