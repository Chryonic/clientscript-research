/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125
{
    boolean aBoolean1013;
    int anInt1014;
    int anInt1015 = 2;
    boolean aBoolean1016;
    int anInt1017;
    int anInt1018;
    int anInt1019;
    
    private final void method2401(int argument_0_, int argument_1_,
				  Packet argument_2_, int argument_3_) {
	if (argument_1_ != 1) {
	    if (argument_1_ == 2) {
		((Class125) this).anInt1018
		    = argument_2_.g2() + 1;
		((Class125) this).anInt1019
		    = argument_2_.g2() + 1;
	    } else if (argument_1_ == 3)
		argument_2_.g1s();
	    else if (argument_1_ == 4)
		((Class125) this).anInt1015
		    = argument_2_.g1();
	    else if (argument_1_ == 5)
		((Class125) this).anInt1017
		    = argument_2_.g1();
	    else if (argument_1_ != 6) {
		if (argument_1_ == 7)
		    ((Class125) this).aBoolean1016 = true;
	    } else
		((Class125) this).aBoolean1013 = true;
	} else {
	    ((Class125) this).anInt1014
		= argument_2_.g2();
	    if (((Class125) this).anInt1014 == 65535)
		((Class125) this).anInt1014 = -1;
	}
	if (argument_3_ != 32579)
	    ((Class125) this).anInt1018 = -16;
    }
    
    final void method2402(int argument_4_, Packet argument_5_,
			  int argument_6_) {
	for (;;) {
	    int anLocalInt = argument_5_.g1();
	    if (anLocalInt == 0)
		break;
	    method2401(argument_6_, anLocalInt, argument_5_, 32579);
	}
    }
    
    static final void method2403(AbstractFont argument) {
	Class1.aAbstractFont_3510 = argument;
    }
    
    public Class125() {
	((Class125) this).aBoolean1013 = false;
	((Class125) this).aBoolean1016 = false;
	((Class125) this).anInt1017 = 1;
	((Class125) this).anInt1014 = -1;
	((Class125) this).anInt1019 = 64;
	((Class125) this).anInt1018 = 64;
    }
}
