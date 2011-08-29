/* Class59_Sub47_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub11 extends Node_Sub47
{
    private int anInt6208;
    static int anInt6209 = 0;
    private int anInt6210;
    
    static final void method1138(int argument, int argument_0_,
				 Class367 argument_1_) {
	if (Class105.anInt861 < 50
	    && (argument_1_ != null
		&& ((Class367) argument_1_).anIntArrayArray3100 != null
		&& (argument_0_
		    < ((Class367) argument_1_).anIntArrayArray3100.length)
		&& (((Class367) argument_1_).anIntArrayArray3100[argument_0_]
		    != null))) {
	    int anLocalInt = (((Class367) argument_1_).anIntArrayArray3100
			      [argument_0_][argument]);
	    int anLocalInt_2_ = anLocalInt >> 8;
	    int anLocalInt_3_ = anLocalInt >> 5 & 0x7;
	    if ((((Class367) argument_1_).anIntArrayArray3100
		 [argument_0_]).length
		> 1) {
		int anLocalInt_4_
		    = (int) (Math.random() * (double) (((Class367) argument_1_)
						       .anIntArrayArray3100
						       [argument_0_]).length);
		if (anLocalInt_4_ > 0)
		    anLocalInt_2_
			= (((Class367) argument_1_).anIntArrayArray3100
			   [argument_0_][anLocalInt_4_]);
	    }
	    int anLocalInt_5_ = 256;
	    if (((Class367) argument_1_).anIntArray3111 != null
		&& ((Class367) argument_1_).anIntArray3093 != null)
		anLocalInt_5_
		    = Class384.method4119((((Class367) argument_1_)
					   .anIntArray3111[argument_0_]),
					  (((Class367) argument_1_)
					   .anIntArray3093[argument_0_]),
					  2);
	    if (((Class367) argument_1_).aBoolean3102)
		Statics.method2520(false, 0, anLocalInt_3_, 99, anLocalInt_2_, 255, anLocalInt_5_);
	    else
		Class165.method2629(255, anLocalInt_2_, 0, anLocalInt_3_,
				    anLocalInt_5_, argument ^ 0xac8);
	}
    }
    
    final void method1110(int argument_6_, Packet argument_7_) {
	anInt6208 = argument_7_.g4();
	anInt6210 = argument_7_.g4();
	if (argument_6_ >= -56)
	    anInt6208 = -110;
    }
    
    final void method1109(ClanSettings argument_8_, int argument_9_) {
	if (argument_9_ == 5)
	    argument_8_.method2744(anInt6208, anInt6210);
    }
    
    static final void method1139(int argument) {
	if (Class361.aGraphicsToolkit3057 != null) {
	    Class361.aGraphicsToolkit3057.method2027((byte) 69);
	    Class284.aAbstractFont_2280 = null;
	    Class361.aGraphicsToolkit3057 = null;
	}
    }
    
    static final boolean method1140(int argument, int argument_10_,
				    int argument_11_) {
	if (argument_10_ != 0)
	    anInt6209 = -43;
	if (!DoublyLinkedNode_Sub51_Sub6.method1203(argument, (byte) -1, argument_11_))
	    return false;
	if ((argument_11_ & 0xb000) != 0
	    | Class361.method3956(argument, argument_11_, true)
	    | DoublyLinkedNode_Sub51_Sub13.method1265(argument, (byte) 22, argument_11_))
	    return true;
	return ((argument & 0x37) == 0
		& (Statics.method3679(argument_11_, argument_10_ ^ ~0x220, argument)
		   | Class72.method1533(11816, argument_11_, argument)));
    }
}
