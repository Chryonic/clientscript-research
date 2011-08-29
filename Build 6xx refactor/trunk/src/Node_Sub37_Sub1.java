/* Class59_Sub37_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub37_Sub1 extends Node_Sub37
{
    static JagexHashMap aJagexHashMap_6114 = new JagexHashMap(4);
    private byte aByte6115;
    private String aString6116;
    private byte aByte6117;
    
    public static void method1060(int argument) {
	aJagexHashMap_6114 = null;
    }
    
    final void method1058(int argument_0_, Packet argument_1_) {
	if (argument_0_ == 3) {
	    aString6116 = argument_1_.fastgstr((byte) 95);
	    if (aString6116 != null) {
		argument_1_.g1();
		aByte6115 = argument_1_.g1s();
		aByte6117 = argument_1_.g1s();
	    }
	}
    }
    
    final void method1059(byte argument_2_, ClanChannel argument_3_) {
	if (aString6116 != null) {
	    ((ClanChannel) argument_3_).aByte4358 = aByte6117;
	    ((ClanChannel) argument_3_).aByte4352 = aByte6115;
	}
	((ClanChannel) argument_3_).aString4357 = aString6116;
	int anLocalInt = 55 / ((-58 - argument_2_) / 57);
    }
}
