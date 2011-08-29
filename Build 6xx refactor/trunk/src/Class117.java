/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class117
{
    boolean aBoolean956;
    int anInt957;
    int anInt958 = 8;
    int anInt959;
    int anInt960;
    static Class207 aClass207_961 = new Class207(73, 0);
    int anInt962;
    int anInt963;
    int anInt964 = 16777215;
    static Class329 aClass329_966 = new Class329(13, 7);
    
    private final void method2373(Packet argument_0_, int argument_1_,
				  boolean argument_2_) {
	if (argument_2_ != true)
	    aClass329_966 = null;
	if (argument_1_ == 1)
	    ((Class117) this).anInt958 = argument_0_.g2();
	else if (argument_1_ != 2) {
	    if (argument_1_ == 3) {
		((Class117) this).anInt962 = argument_0_.g2s();
		((Class117) this).anInt959 = argument_0_.g2s();
		((Class117) this).anInt957 = argument_0_.g2s();
	    } else if (argument_1_ != 4) {
		if (argument_1_ != 5) {
		    if (argument_1_ == 6)
			((Class117) this).anInt964
			    = argument_0_.g3_dupl();
		} else
		    ((Class117) this).anInt963 = argument_0_.g2();
	    } else
		((Class117) this).anInt960
		    = argument_0_.g1();
	} else
	    ((Class117) this).aBoolean956 = true;
    }
    
    final void method2374(byte argument_3_, Packet argument_4_) {
	for (;;) {
	    int anLocalInt = argument_4_.g1();
	    if (anLocalInt == 0)
		break;
	    method2373(argument_4_, anLocalInt, true);
	}
    }
    
    public static void method2375(int argument) {
	aClass329_966 = null;
	aClass207_961 = null;
    }
    
    public Class117() {
	/* empty */
    }
}
