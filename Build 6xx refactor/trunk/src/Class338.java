/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class338
{
    int[][] anIntArrayArray2763;
    int anInt2764;
    int anInt2765;
    static Js5Store aJs5Store_2766;
    int[] anIntArray2767;
    int anInt2768 = 0;
    byte[] aByteArray2769;
    int anInt2770;
    int anInt2771;
    int[][] anIntArrayArray2772;
    int anInt2773;
    int[][] anIntArrayArray2774;
    byte[] aByteArray2775;
    byte[] aByteArray2776;
    boolean[] aBooleanArray2777;
    int anInt2778;
    byte aByte2779;
    int anInt2780;
    int anInt2781;
    byte[] aByteArray2782;
    byte[] aByteArray2783;
    byte[][] aByteArrayArray2785;
    static int[] anIntArray2786 = new int[50];
    byte[] aByteArray2787;
    int anInt2788;
    int anInt2789;
    int[] anIntArray2790;
    int[] anIntArray2791;
    int[] anIntArray2792;
    int anInt2793;
    int anInt2794;
    boolean[] aBooleanArray2795;
    int anInt2796;
    int anInt2798;
    
    static final void method3773(int[] argument, int argument_0_,
				 int argument_1_, long[] argument_2_,
				 byte argument_3_) {
	if (argument_1_ > argument_0_) {
	    int anLocalInt = (argument_1_ + argument_0_) / 2;
	    int anLocalInt_4_ = argument_0_;
	    long l = argument_2_[anLocalInt];
	    argument_2_[anLocalInt] = argument_2_[argument_1_];
	    argument_2_[argument_1_] = l;
	    int anLocalInt_5_ = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_1_];
	    argument[argument_1_] = anLocalInt_5_;
	    int anLocalInt_6_ = l != 9223372036854775807L ? 1 : 0;
	    for (int anLocalInt_7_ = argument_0_; argument_1_ > anLocalInt_7_;
		 anLocalInt_7_++) {
		if (l + (long) (anLocalInt_6_ & anLocalInt_7_)
		    > argument_2_[anLocalInt_7_]) {
		    long l_8_ = argument_2_[anLocalInt_7_];
		    argument_2_[anLocalInt_7_] = argument_2_[anLocalInt_4_];
		    argument_2_[anLocalInt_4_] = l_8_;
		    int anLocalInt_9_ = argument[anLocalInt_7_];
		    argument[anLocalInt_7_] = argument[anLocalInt_4_];
		    argument[anLocalInt_4_++] = anLocalInt_9_;
		}
	    }
	    argument_2_[argument_1_] = argument_2_[anLocalInt_4_];
	    argument_2_[anLocalInt_4_] = l;
	    argument[argument_1_] = argument[anLocalInt_4_];
	    argument[anLocalInt_4_] = anLocalInt_5_;
	    method3773(argument, argument_0_, anLocalInt_4_ - 1, argument_2_,
		       (byte) 24);
	    method3773(argument, anLocalInt_4_ + 1, argument_1_, argument_2_,
		       (byte) 58);
	}
    }
    
    public static void method3774(byte argument) {
	MapRelated.mapKeys = null;
	anIntArray2786 = null;
	aJs5Store_2766 = null;
    }
    
    static final int method3775(byte argument, int argument_10_) {
	return argument_10_ & 0x7f;
    }
    
    Class338() {
	((Class338) this).anIntArray2767 = new int[256];
	((Class338) this).anIntArrayArray2772 = new int[6][258];
	((Class338) this).aBooleanArray2777 = new boolean[256];
	((Class338) this).anInt2765 = 0;
	((Class338) this).anIntArrayArray2763 = new int[6][258];
	((Class338) this).aByteArray2775 = new byte[18002];
	((Class338) this).aByteArray2787 = new byte[4096];
	((Class338) this).aByteArray2783 = new byte[256];
	((Class338) this).anIntArray2791 = new int[257];
	((Class338) this).aByteArrayArray2785 = new byte[6][258];
	((Class338) this).aByteArray2776 = new byte[18002];
	((Class338) this).anIntArray2790 = new int[16];
	((Class338) this).anIntArrayArray2774 = new int[6][258];
	((Class338) this).anIntArray2792 = new int[6];
	((Class338) this).aBooleanArray2795 = new boolean[16];
    }
}
