/* Class59_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub37_Sub4 extends Node_Sub37
{
    private int anInt6128;
    private long memberhash = -1L;
    private byte aByte6130;
    static Class207 aClass207_6131;
    private String membername = null;
    static int[][] anIntArrayArray6133
	= { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 },
	    { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 },
	    { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 },
	    { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
    static int[] anIntArray6134;
    
    final void method1059(byte argument_0_, ClanChannel argument_1_) {
	Class388 class388 = new Class388();
	((Class388) class388).aString3272 = membername;
	((Class388) class388).aByte3274 = aByte6130;
	int anLocalInt = 8 % ((argument_0_ + 58) / 57);
	((Class388) class388).anInt3275 = anInt6128;
	argument_1_.method1328(class388, -111);
    }
    
    final void method1058(int argument_2_, Packet argument_3_) {
	if (argument_3_.g1() != 255) {
	    ((Packet) argument_3_).pos--;
	    memberhash = argument_3_.g8();
	}
	membername = argument_3_.fastgstr((byte) 122);
	anInt6128 = argument_3_.g2();
	aByte6130 = argument_3_.g1s();
	if (argument_2_ != 3)
	    method1065((byte) -12);
	argument_3_.g8();
	if (Class62_Sub28.aBoolean4464)
	    System.out.println("memberhash:" + memberhash + " membername:"
			       + membername);
    }
    
    public static void method1065(byte argument) {
	anIntArray6134 = null;
	aClass207_6131 = null;
	anIntArrayArray6133 = null;
    }
    
    static {
	aClass207_6131 = new Class207(90, 2);
	anIntArray6134 = new int[1];
    }
}
