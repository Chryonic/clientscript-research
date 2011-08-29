/* Class59_Sub47_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub1 extends Node_Sub47
{
    static Class166 aClass166_6153;
    private int anInt6154 = -1;
    static int anInt6155 = 0;
    
    final void method1110(int argument_0_, Packet argument_1_) {
	if (argument_0_ > -56)
	    anInt6155 = -74;
	anInt6154 = argument_1_.g2();
    }
    
    static final void method1115(int argument, int argument_2_) {
	Class62_Sub21.anInt4432 = argument;
	synchronized (Class165.aClass149_1210) {
	    Class165.aClass149_1210.clear((byte) -3);
	}
	synchronized (Node_Sub38.aClass149_4190) {
	    if (argument_2_ != 0) {
		/* empty */
	    } else
		Node_Sub38.aClass149_4190.clear((byte) -3);
	}
    }
    
    final void method1109(ClanSettings argument_3_, int argument_4_) {
	if (argument_4_ != 5)
	    method1116(true, true, false);
	argument_3_.doDeleteMember(anInt6154);
    }
    
    static final void method1116(boolean argument, boolean argument_5_,
				 boolean argument_6_) {
	if (argument_5_) {
	    Statics.anInt6650++;
	    HslToRgb.method3467();
	}
	if (argument_6_ != true)
	    aClass166_6153 = null;
	if (argument) {
	    Statics.anInt2580++;
	    HslToRgb.generateTable();
	}
    }
    
    public static void method1117(boolean argument) {
	aClass166_6153 = null;
    }
    
    static {
	aClass166_6153 = new Class166(91, 0);
    }
}
