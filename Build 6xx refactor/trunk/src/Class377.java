/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

final class Class377
{
    int[] anIntArray3215;
    int anInt3216 = -1;
    int anInt3217 = -1;
    static Class166 aClass166_3218 = new Class166(86, -1);
    
    private final void method4092(int argument_0_, boolean argument_1_,
				  Packet argument_2_) {
	if (argument_0_ == 1)
	    ((Class377) this).anInt3217 = argument_2_.g2();
	else if (argument_0_ != 2) {
	    if (argument_0_ == 3)
		((Class377) this).anInt3216
		    = argument_2_.g1();
	} else {
	    ((Class377) this).anIntArray3215
		= new int[argument_2_.g1()];
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class377) this).anIntArray3215.length;
		 anLocalInt++)
		((Class377) this).anIntArray3215[anLocalInt]
		    = argument_2_.g2();
	}
	if (argument_1_ != true) {
	    /* empty */
	}
    }
    
    final void method4093(byte argument_3_, Packet argument_4_) {
	for (;;) {
	    int anLocalInt = argument_4_.g1();
	    if (anLocalInt == 0)
		break;
	    method4092(anLocalInt, true, argument_4_);
	}
    }
    
    public static void method4094(int argument) {
	aClass166_3218 = null;
    }

    public Class377() {
	/* empty */
    }
}
