/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181
{
    int anInt1371;
    int anInt1372;
    Class374 aClass374_1373;
    boolean aBoolean1374 = false;
    
    final Class368 method2840(int argument_0_, int argument_1_,
			      boolean argument_2_, GraphicsToolkit argument_3_) {
	long l = (long) (((GraphicsToolkit) argument_3_).anInt939 << 19
			 | (((Class181) this).anInt1371 | argument_0_ << 16
			    | (!argument_2_ ? 0 : 262144)));
	Class368 class368
	    = (Class368) ((Class374) ((Class181) this).aClass374_1373)
			     .aClass149_3211.get(l);
	if (class368 != null)
	    return class368;
	if (!((Class374) ((Class181) this).aClass374_1373).aJs5Store_3209
		 .isFlatFile(((Class181) this).anInt1371))
	    return null;
	Class83 class83
	    = Class83.method1612((((Class374) ((Class181) this).aClass374_1373)
				  .aJs5Store_3209),
				 ((Class181) this).anInt1371, 0);
	if (class83 != null) {
	    ((Class83) class83).anInt594 = ((Class83) class83).anInt593
		= ((Class83) class83).anInt588 = ((Class83) class83).anInt589
		= 0;
	    if (argument_2_)
		class83.method1611();
	    for (int anLocalInt = 0; anLocalInt < argument_0_; anLocalInt++)
		class83.method1610();
	}
	class368 = argument_3_.method2033(class83, true);
	if (class368 != null)
	    ((Class374) ((Class181) this).aClass374_1373).aClass149_3211
		.put(class368, l);
	return class368;
    }
    
    final boolean method2841(int argument_4_) {
	return ((Class374) ((Class181) this).aClass374_1373).aJs5Store_3209
		   .isFlatFile(((Class181) this).anInt1371);
    }
    
    private final void method2842(int argument_5_, Packet argument_6_,
				  int argument_7_) {
	if (argument_7_ == 1)
	    ((Class181) this).anInt1371 = argument_6_.g2();
	else if (argument_7_ == 2)
	    ((Class181) this).anInt1372 = argument_6_.g3_dupl();
	else if (argument_7_ != 3) {
	    if (argument_7_ == 4)
		((Class181) this).anInt1371 = -1;
	} else
	    ((Class181) this).aBoolean1374 = true;
	int anLocalInt = 57 % ((-39 - argument_5_) / 54);
    }

    final void method2844(byte argument_11_, Packet argument_12_) {
	if (argument_11_ != -19)
	    method2841(-12);
	for (;;) {
	    int anLocalInt = argument_12_.g1();
	    if (anLocalInt == 0)
		break;
	    method2842(112, argument_12_, anLocalInt);
	}
    }
    
    public Class181() {
	/* empty */
    }
}
