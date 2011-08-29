/* RuntimeException_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub2 extends RuntimeException
{
    String aString3424;
    static int[] anIntArray3425 = new int[8];
    Throwable aThrowable3426;
    static int[] anIntArray3427;
    static int anInt3428 = 1406;

    public static void method4221(int argument) {
	FileStore.crc = null;
	anIntArray3427 = null;
	anIntArray3425 = null;
    }
    
    static final void method4222(byte argument) {
	for (int anLocalInt = 0; anLocalInt < dba_sub_772_Sub2.anInt6369;
	     anLocalInt++) {
	    int anLocalInt_1_
		= DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt];
	    Node_Sub35 class59_sub35
		= ((Node_Sub35)
		   Class294.aJagexHashMap_2453.get((long) anLocalInt_1_));
	    if (class59_sub35 != null) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		    = (((Node_Sub35) class59_sub35)
		       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		Class80.method1585(((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
						 class104_sub2_sub2_sub5_sub1)
						.aClass291_6832)).anInt2344,
				   -57, class104_sub2_sub2_sub5_sub1);
	    }
	}
    }
    
    RuntimeException_Sub2(Throwable argument_2_, String argument_3_) {
	((RuntimeException_Sub2) this).aString3424 = argument_3_;
	((RuntimeException_Sub2) this).aThrowable3426 = argument_2_;
    }
    
    static {
	anIntArray3427 = new int[4096];
    }
}
