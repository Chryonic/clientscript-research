/* Class59_Sub47_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub10 extends Node_Sub47
{
    static int[] anIntArray6204 = { 16, 32, 64, 128 };
    static int anInt6205;
    private String aString6206;
    private int anInt6207;
    
    final void method1109(ClanSettings argument_0_, int argument_1_) {
	if (argument_1_ == 5)
	    argument_0_.method2751(aString6206, anInt6207);
    }
    
    public static void method1137(byte argument) {
	anIntArray6204 = null;
    }
    
    final void method1110(int argument_2_, Packet argument_3_) {
	anInt6207 = argument_3_.g4();
	aString6206 = argument_3_.gstr();
	if (argument_2_ >= -56)
	    aString6206 = null;
    }
}
