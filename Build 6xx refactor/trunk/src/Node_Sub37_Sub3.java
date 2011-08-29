/* Class59_Sub37_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub37_Sub3 extends Node_Sub37
{
    private int anInt6122;
    private String aString6123;
    private int anInt6124 = -1;
    private byte aByte6125;
    static int anInt6126;

    public static void method1062(int argument) {
	MapRelated.underworldMData = null;
    }
    
    static final void method1063(int argument) {
	synchronized (Node_Sub31_Sub17.aClass366Array5915) {
	    for (int anLocalInt = 0;
		 Node_Sub31_Sub17.aClass366Array5915.length > anLocalInt;
		 anLocalInt++) {
		Node_Sub31_Sub17.aClass366Array5915[anLocalInt]
		    = new Class366();
		Class350.anIntArray2924[anLocalInt] = 0;
	    }
	}
    }
    
    final void method1058(int argument_0_, Packet argument_1_) {
	anInt6124 = argument_1_.g2();
	aByte6125 = argument_1_.g1s();
	anInt6122 = argument_1_.g2();
	argument_1_.g8();
	aString6123 = argument_1_.gstr();
	if (argument_0_ != 3)
	    MapRelated.underworldMData = null;
    }
    
    static final void method1064(byte argument) {
	Class_s_Sub2.anInt5367
	    = (int) ((double) MapRelated.mapWidth * 34.46);
	Class252.anInt1980 = 200;
	Class_s_Sub2.anInt5367 <<= 2;
	if (Class389.aGraphicsToolkit3281.method2081())
	    Class_s_Sub2.anInt5367 += 512;
	DoublyLinkedNodeP2_Sub4_Sub2.method1913(false, (byte) -102);
    }
    
    final void method1059(byte argument_2_, ClanChannel argument_3_) {
	Class388 class388
	    = ((ClanChannel) argument_3_).aClass388Array4354[anInt6124];
	((Class388) class388).aString3272 = aString6123;
	((Class388) class388).aByte3274 = aByte6125;
	int anLocalInt = 86 / ((-58 - argument_2_) / 57);
	((Class388) class388).anInt3275 = anInt6122;
    }
}
