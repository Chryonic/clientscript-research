/* Class59_Sub47_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub4 extends Node_Sub47
{
    static long aLong6169 = -1L;
    private int anInt6170 = -1;
    
    final void method1110(int argument_0_, Packet argument_1_) {
	anInt6170 = argument_1_.g2();
	if (argument_0_ >= -56)
	    aLong6169 = 31L;
    }
    
    final void method1109(ClanSettings argument_2_, int argument_3_) {
	if (argument_3_ != 5)
	    aLong6169 = 30L;
	argument_2_.method2752(anInt6170);
    }
    
    static final boolean method1122(Interface2 argument, int argument_4_) {
	Class266 class266
	    = Node_Sub31_Sub30.aClass257_5983
		  .method3298((byte) 103, argument.method7(-23356));
	if (((Class266) class266).anInt2058 == -1)
	    return true;
	Class181 class181
	    = Class206.aClass374_1482
		  .method4083(((Class266) class266).anInt2058, (byte) -104);
	if (((Class181) class181).anInt1371 == -1)
	    return true;
	return class181.method2841(0);
    }
}
