/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class170
{
    static int anInt1248 = 0;
    
    static final Node_Sub6 method2735(int argument, int argument_0_,
					 Js5Store argument_1_) {
	byte[] anLocalInts = argument_1_.getFlatData(argument_0_);
	if (anLocalInts == null)
	    return null;
	return new Node_Sub6(anLocalInts);
    }
    
    static final Class214_Sub1 method2736(Packet argument,
					  int argument_2_) {
	Class214 class214 = Node_Sub31_Sub23.method950(argument, -93);
	int anLocalInt = argument.g3s();
	if (argument_2_ != 21157)
	    return null;
	return new Class214_Sub1(((Class214) class214).anInt3706,
				 ((Class214) class214).aClass349_3705,
				 ((Class214) class214).aClass44_3709,
				 ((Class214) class214).anInt3707,
				 ((Class214) class214).anInt3708, anLocalInt);
    }
}
