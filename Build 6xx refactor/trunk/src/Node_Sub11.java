/* Class59_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub11 extends Node
{
    int anInt3939;
    int[] anIntArray3940;
    boolean[] aBooleanArray3941;
    int anInt3942;
    int[][] anIntArrayArray3943;
    int[] anIntArray3944;
    static int anInt3945 = 0;
    static Class166 aClass166_3947 = new Class166(109, 0);
    
    static final void method685(byte argument) {
	if (Statics.anInt1652 == 7)
	    Class44.method429(103, false);
	else {
	    Class350_Sub2.aClass307_5453 = Statics.aClass307_2632;
	    Statics.aClass307_2632 = null;
	    Class316.method3638(13, 2);
	}
    }
    
    public static void method686(int argument) {
	aClass166_3947 = null;
    }
    
    Node_Sub11(int argument_0_, byte[] argument_1_) {
	((Node_Sub11) this).anInt3939 = argument_0_;
	Packet class59_sub28 = new Packet(argument_1_);
	((Node_Sub11) this).anInt3942
	    = class59_sub28.g1();
	((Node_Sub11) this).anIntArrayArray3943
	    = new int[((Node_Sub11) this).anInt3942][];
	((Node_Sub11) this).anIntArray3940
	    = new int[((Node_Sub11) this).anInt3942];
	((Node_Sub11) this).anIntArray3944
	    = new int[((Node_Sub11) this).anInt3942];
	((Node_Sub11) this).aBooleanArray3941
	    = new boolean[((Node_Sub11) this).anInt3942];
	for (int anLocalInt = 0; anLocalInt < ((Node_Sub11) this).anInt3942;
	     anLocalInt++) {
	    ((Node_Sub11) this).anIntArray3944[anLocalInt]
		= class59_sub28.g1();
	    if (((Node_Sub11) this).anIntArray3944[anLocalInt] == 6)
		((Node_Sub11) this).anIntArray3944[anLocalInt] = 2;
	}
	for (int anLocalInt = 0; ((Node_Sub11) this).anInt3942 > anLocalInt;
	     anLocalInt++)
	    ((Node_Sub11) this).aBooleanArray3941[anLocalInt]
		= class59_sub28.g1() == 1;
	for (int anLocalInt = 0; ((Node_Sub11) this).anInt3942 > anLocalInt;
	     anLocalInt++)
	    ((Node_Sub11) this).anIntArray3940[anLocalInt]
		= class59_sub28.g2();
	for (int anLocalInt = 0; ((Node_Sub11) this).anInt3942 > anLocalInt;
	     anLocalInt++)
	    ((Node_Sub11) this).anIntArrayArray3943[anLocalInt]
		= new int[class59_sub28.g1()];
	for (int anLocalInt = 0; ((Node_Sub11) this).anInt3942 > anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_2_ = 0;
		 (((Node_Sub11) this).anIntArrayArray3943[anLocalInt].length
		  > anLocalInt_2_);
		 anLocalInt_2_++)
		((Node_Sub11) this).anIntArrayArray3943[anLocalInt]
		    [anLocalInt_2_]
		    = class59_sub28.g1();
	}
    }

}
