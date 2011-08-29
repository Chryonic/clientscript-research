/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class47
{
    int anInt322;
    int anInt323;
    long aLong324;
    int anInt325;
    int anInt326;
    int anInt327;
    int anInt328;
    int anInt329;
    private boolean aBoolean330;
    static int anInt331;
    int anInt332 = 0;
    int anInt333;
    int anInt334;
    private int anInt335;
    static int anInt336;
    int anInt337;
    static Class166 aClass166_338 = new Class166(52, 3);

    final void method448(int argument_0_) {
	((Class47) this).anInt327 = Node_Sub6.COSINETABLE[anInt335 << 3];
	long l = (long) ((Class47) this).anInt333;
	long l_1_ = (long) ((Class47) this).anInt323;
	long l_2_ = (long) ((Class47) this).anInt322;
	((Class47) this).anInt329
	    = (int) Math.sqrt((double) (l_2_ * l_2_ + l_1_ * l_1_ + l * l));
	if (((Class47) this).anInt328 == 0)
	    ((Class47) this).anInt328 = 1;
	if (((Class47) this).anInt326 != 0) {
	    if (((Class47) this).anInt326 == 1) {
		((Class47) this).aLong324
		    = (long) (((Class47) this).anInt329 * 8
			      / ((Class47) this).anInt328);
		((Class47) this).aLong324 *= ((Class47) this).aLong324;
	    } else if (((Class47) this).anInt326 == 2)
		((Class47) this).aLong324
		    = (long) (((Class47) this).anInt329 * 8
			      / ((Class47) this).anInt328);
	} else
	    ((Class47) this).aLong324 = 2147483647L;
	if (aBoolean330)
	    ((Class47) this).anInt329 *= -1;
    }
    
    static final boolean method449(byte argument, int argument_3_,
				   int argument_4_) {
	if (!((argument_3_ & 0x70000) != 0
	      | Node_Sub31_Sub26.method959(argument_4_, (byte) 113,
            argument_3_))
	    && !Statics.method544(argument_4_, argument_3_, 0))
	    return false;
	return true;
    }
    
    private final void method450(int argument_5_, Packet argument_6_,
				 int argument_7_) {
	if (argument_5_ == 1)
	    anInt335 = argument_6_.g2();
	else if (argument_5_ == 2)
	    argument_6_.g1();
	else if (argument_5_ != 3) {
	    if (argument_5_ != 4) {
		if (argument_5_ != 6) {
		    if (argument_5_ != 8) {
			if (argument_5_ != 9) {
			    if (argument_5_ == 10)
				aBoolean330 = true;
			} else
			    ((Class47) this).anInt337 = 1;
		    } else
			((Class47) this).anInt332 = 1;
		} else
		    ((Class47) this).anInt334
			= argument_6_.g1();
	    } else {
		((Class47) this).anInt326 = argument_6_.g1();
		((Class47) this).anInt328 = argument_6_.g4();
	    }
	} else {
	    ((Class47) this).anInt333 = argument_6_.g4();
	    ((Class47) this).anInt323
		= argument_6_.g4();
	    ((Class47) this).anInt322 = argument_6_.g4();
	}
	if (argument_7_ != 8)
	    method448(34);
    }
    
    public static void method451(boolean argument) {
	aClass166_338 = null;
    }
    
    static final void method452(Packet argument, int argument_8_) {
	for (int anLocalInt = 0; Class141.anInt1100 > anLocalInt;
	     anLocalInt++) {
	    int anLocalInt_9_ = argument.gsmart(-2);
	    int anLocalInt_10_ = argument.g2();
	    if (anLocalInt_10_ == 65535)
		anLocalInt_10_ = -1;
	    if (Statics.aClass84_Sub1Array6752[anLocalInt_9_]
		!= null)
		((Class84) (Statics.aClass84_Sub1Array6752
			    [anLocalInt_9_])).anInt596
		    = anLocalInt_10_;
	}
    }
    
    static final void method453(byte argument) {
	if (tia_sub_35_Sub1DoublyLinked.aClass112_6659 != null)
	    tia_sub_35_Sub1DoublyLinked.aClass112_6659.method2002((byte) -115);
	if (Class245.aClass112_1787 != null)
	    Class245.aClass112_1787.method2002((byte) 66);
    }
    
    final void method454(byte argument_11_, Packet argument_12_) {
	for (;;) {
	    int anLocalInt = argument_12_.g1();
	    if (anLocalInt == 0)
		break;
	    method450(anLocalInt, argument_12_, 8);
	}
    }
    
    public Class47() {
	aBoolean330 = false;
	((Class47) this).anInt337 = 0;
    }
}
