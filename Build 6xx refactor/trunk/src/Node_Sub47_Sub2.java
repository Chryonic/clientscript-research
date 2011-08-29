/* Class59_Sub47_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub2 extends Node_Sub47
{
    private int anInt6157;
    private int anInt6158 = -1;
    private int anInt6159;
    static Class207 aClass207_6160;
    private int anInt6161;
    static int anInt6162 = 0;
    
    final void method1110(int argument_0_, Packet argument_1_) {
	anInt6158 = argument_1_.g2();
	anInt6161 = argument_1_.g4();
	anInt6159 = argument_1_.g1();
	anInt6157 = argument_1_.g1();
	if (argument_0_ > -56)
	    aClass207_6160 = null;
    }
    
    final void method1109(ClanSettings argument_2_, int argument_3_) {
	if (argument_3_ == 5)
	    argument_2_.method2745(anInt6158, anInt6159, anInt6157,
				   anInt6161);
    }
    
    public static void method1118(int argument) {
	Class211.aClass211_6156 = null;
	aClass207_6160 = null;
    }
    
    static {
	aClass207_6160 = new Class207(11, 16);
    }
}
