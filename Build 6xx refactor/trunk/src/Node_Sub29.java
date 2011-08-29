/* Class59_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub29 extends Node
{
    int anInt4125;
    static int[] anIntArray4126;
    static int[] anIntArray4127 = new int[32];
    Class207 aClass207_4128;
    Node_Sub28_Sub1 aClass59_Sub28_Sub1_4129;
    static Class368 aClass368_4130;
    int anInt4131;
    
    final void method855(byte argument_0_) {
	if (Statics.anInt2001
	    < Node_Sub31_Sub30.aClass59_Sub29Array5988.length)
	    Node_Sub31_Sub30.aClass59_Sub29Array5988[Statics.anInt2001++]
		= this;
    }
    
    static final boolean method856(int argument, int argument_1_,
				   int argument_2_, int argument_3_) {
	if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223 || !Class384.aBoolean3255)
	    return false;
	if (Class253_Sub3.anInt5675 < 100)
	    return false;
	int anLocalInt = (Class157.anIntArrayArrayArray1162[argument_2_]
			  [argument][argument_1_]);
	if (-Node_Sub31_Sub9.anInt5876 == anLocalInt)
	    return false;
	if (anLocalInt == Node_Sub31_Sub9.anInt5876)
	    return true;
	if (Class65.aClass_sArray455 == Node_Sub31_Sub5.aClass_sArray5858)
	    return false;
	int anLocalInt_4_ = argument << LightingManager.lightCoordRShift;
	int anLocalInt_5_ = argument_1_ << LightingManager.lightCoordRShift;
	if (!(Class5.method221
	      (Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		   .method3534(argument, false, argument_1_),
	       anLocalInt_4_ + 1,
	       Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		   .method3534(argument, false, argument_1_ + 1),
	       anLocalInt_4_ + Class110.anInt909 - 1, anLocalInt_4_ + 1,
	       anLocalInt_5_ + 1, 1,
	       Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		   .method3534(argument + 1, false, argument_1_ + 1),
	       Class110.anInt909 - 1 + anLocalInt_5_,
	       Class110.anInt909 + (anLocalInt_5_ - 1)))
	    || !(Class5.method221
		 (Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		      .method3534(argument, false, argument_1_),
		  Class110.anInt909 + anLocalInt_4_ - 1,
		  Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		      .method3534(argument + 1, false, argument_1_ + 1),
		  anLocalInt_4_ - (-Class110.anInt909 + 1), anLocalInt_4_ + 1,
		  anLocalInt_5_ + 1, 1,
		  Node_Sub31_Sub5.aClass_sArray5858[argument_2_]
		      .method3534(argument + 1, false, argument_1_),
		  anLocalInt_5_ + 1, anLocalInt_5_ + Class110.anInt909 - 1))) {
	    Class157.anIntArrayArrayArray1162[argument_2_][argument]
		[argument_1_]
		= -Node_Sub31_Sub9.anInt5876;
	    return false;
	}
	Class353_Sub5.anInt5504++;
	Class157.anIntArrayArrayArray1162[argument_2_][argument][argument_1_]
	    = Node_Sub31_Sub9.anInt5876;
	return true;
    }
    
    static final void method857(Class368[] argument, int argument_6_) {
	Node_Sub47.anInt4287 = argument.length;
	dba_sub_772_Sub2.aClass368Array6368
	    = new Class368[Node_Sub47.anInt4287 + 10];
	Class283.anIntArray2277 = new int[Node_Sub47.anInt4287 + 10];
	JagStrings.memcpy(argument, 0, dba_sub_772_Sub2.aClass368Array6368, 0, Node_Sub47.anInt4287);
	for (int anLocalInt = 0; anLocalInt < Node_Sub47.anInt4287;
	     anLocalInt++)
	    Class283.anIntArray2277[anLocalInt]
		= dba_sub_772_Sub2.aClass368Array6368[anLocalInt].method4018();
	for (int anLocalInt = Node_Sub47.anInt4287;
	     dba_sub_772_Sub2.aClass368Array6368.length > anLocalInt;
	     anLocalInt++)
	    Class283.anIntArray2277[anLocalInt] = 12;
    }
    
    public static void method858(int argument) {
	anIntArray4126 = null;
	anIntArray4127 = null;
	aClass368_4130 = null;
    }
    
    static {
	anIntArray4126 = new int[500];
    }
}
