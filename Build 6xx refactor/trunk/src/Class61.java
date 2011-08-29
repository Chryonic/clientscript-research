/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61
{
    static int anInt437 = 0;
    static int[] anIntArray438 = new int[1000];
    int[] anIntArray439;
    
    public static void method1340(int argument) {
	anIntArray438 = null;
    }
    
    private final void method1341(byte argument_0_,
				  Packet argument_1_) {
	if (argument_0_ <= -42) {
	    for (;;) {
		int anLocalInt = argument_1_.g1();
		if (anLocalInt == 0)
		    break;
		if (anLocalInt == 1) {
		    int anLocalInt_2_ = argument_1_.g1();
		    ((Class61) this).anIntArray439 = new int[anLocalInt_2_];
		    for (int anLocalInt_3_ = 0;
			 anLocalInt_3_ < ((Class61) this).anIntArray439.length;
			 anLocalInt_3_++)
			((Class61) this).anIntArray439[anLocalInt_3_]
			    = argument_1_.g1();
		}
	    }
	}
    }
    
    Class61(Js5Store argument_4_) {
	byte[] anLocalInts = argument_4_.getFlatData(6);
	method1341((byte) -76, new Packet(anLocalInts));
	if (((Class61) this).anIntArray439 == null)
	    throw new RuntimeException("");
    }
    
    protected Class61() {
	((Class61) this).anIntArray439 = new int[0];
    }
}
