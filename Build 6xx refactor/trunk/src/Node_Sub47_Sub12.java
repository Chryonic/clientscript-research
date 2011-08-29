/* Class59_Sub47_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub12 extends Node_Sub47
{
    static CyclicLinkedList aCyclicLinkedList_6211 = new CyclicLinkedList();
    static Class207 aClass207_6212;
    private int anInt6213;
    static int[] anIntArray6214;
    static int anInt6215 = 0;
    private long aLong6216;
    static Class325 aClass325_6217;
    
    static final boolean method1141(int argument, int argument_0_,
				    int argument_1_) {
	if ((argument_1_ & 0x37) == 0)
	    return false;
	return true;
    }
    
    public static void method1142(byte argument) {
	aClass207_6212 = null;
	aClass325_6217 = null;
	aCyclicLinkedList_6211 = null;
	anIntArray6214 = null;
    }
    
    final void method1110(int argument_2_, Packet argument_3_) {
	anInt6213 = argument_3_.g4();
	aLong6216 = argument_3_.g8();
	if (argument_2_ > -56)
	    anInt6213 = 102;
    }
    
    final void method1109(ClanSettings argument_4_, int argument_5_) {
	if (argument_5_ != 5)
	    method1142((byte) -27);
	argument_4_.method2758(aLong6216, argument_5_ ^ 0x66, anInt6213);
    }
    
    static {
	aClass207_6212 = new Class207(71, 3);
	aClass325_6217 = new Class325(8);
    }
}
