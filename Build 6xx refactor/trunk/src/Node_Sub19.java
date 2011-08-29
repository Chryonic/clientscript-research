/* Class59_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub19 extends Node
{
    static Class217 aClass217_4009;
    int anInt4011;
    int anInt4012;
    
    public static void method713(int argument) {
	aClass217_4009 = null;
    }
    
    static final void method714(int argument) {
	int anLocalInt = Class224.anInt1578;
	int[] anLocalInts = Class242.anIntArray1769;
	for (int anLocalInt_0_ = 0; anLocalInt > anLocalInt_0_;
	     anLocalInt_0_++) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		   [anLocalInts[anLocalInt_0_]]);
	    if (class104_sub2_sub2_sub5_sub2 != null
		&& (((Entity) class104_sub2_sub2_sub5_sub2)
		    .anInt6791) > 0) {
		((Entity) class104_sub2_sub2_sub5_sub2)
		    .anInt6791--;
		if ((((Entity) class104_sub2_sub2_sub5_sub2)
		     .anInt6791)
		    == 0)
		    ((Entity) class104_sub2_sub2_sub5_sub2)
			.aString6733
			= null;
	    }
	}
	for (int anLocalInt_1_ = 0; dba_sub_772_Sub2.anInt6369 > anLocalInt_1_;
	     anLocalInt_1_++) {
	    long l
		= (long) DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_1_];
	    Node_Sub35 class59_sub35
		= (Node_Sub35) Class294.aJagexHashMap_2453.get(l);
	    if (class59_sub35 != null) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		    = (((Node_Sub35) class59_sub35)
		       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		if ((((Entity) class104_sub2_sub2_sub5_sub1)
		     .anInt6791)
		    > 0) {
		    ((Entity) class104_sub2_sub2_sub5_sub1)
			.anInt6791--;
		    if (((Entity)
			 class104_sub2_sub2_sub5_sub1).anInt6791
			== 0)
			((Entity)
			 class104_sub2_sub2_sub5_sub1).aString6733
			    = null;
		}
	    }
	}
    }
    
    static final boolean method715(int argument, int argument_2_) {
	if (argument == 1 || argument == 7)
	    return false;
	return true;
    }
    
    static final int method716(int argument, int argument_3_, int argument_4_,
			       int argument_5_) {
	argument_5_ &= 0x3;
	if (argument_5_ == 0)
	    return argument_4_;
	if (argument_5_ == 1)
	    return argument;
	if (argument_5_ == 2)
	    return 7 - argument_4_;
	return -argument + 7;
    }
    
    Node_Sub19(int argument_6_, int argument_7_) {
	((Node_Sub19) this).anInt4012 = argument_6_;
	((Node_Sub19) this).anInt4011 = argument_7_;
    }
    
    static {
	aClass217_4009 = new Class217(11, 0, 1, 2);
    }
}
