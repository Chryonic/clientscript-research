/* Class59_Sub37_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub37_Sub2 extends Node_Sub37
{
    static Class207 aClass207_6118 = new Class207(77, -1);
    private int anInt6120 = -1;
    static Class168[] aClass168Array6121;
    
    final void method1058(int argument_0_, Packet argument_1_) {
	anInt6120 = argument_1_.g2();
	if (argument_0_ == 3) {
	    argument_1_.g1();
	    if (argument_1_.g1() != 255) {
		((Packet) argument_1_).pos--;
		argument_1_.g8();
	    }
	}
    }
    
    public static void method1061(int argument) {
	aClass168Array6121 = null;
	aClass207_6118 = null;
    }
    
    final void method1059(byte argument_2_, ClanChannel argument_3_) {
	argument_3_.method1325(-1, anInt6120);
	int anLocalInt = 13 % ((argument_2_ + 58) / 57);
    }
}
