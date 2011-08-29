/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class341
{
    private Node_Sub19[] aClass59_Sub19Array2870;
    private int anInt2871;
    private int anInt2872 = 0;
    static Class207 aClass207_2873 = new Class207(75, 2);
    private CyclicLinkedList aCyclicLinkedList_2874;
    private int[][][] anIntArrayArrayArray2875;
    static int anInt2876;
    private int anInt2877 = -1;
    static Class368[] aClass368Array2878;
    static long aLong2879;
    private int anInt2880;
    static Js5Store aJs5Store_2881;
    boolean aBoolean2882;
    static DoublyLinkedNode_Sub51_Sub13 aClass59_Sub51_Sub13_2883;

    static final void method3780(int argument, int argument_0_,
				 int argument_1_) {
	Node_Sub29 class59_sub29
	    = Class91.method1683((byte) 113,
				 Node_Sub31_Sub16.aClass372_5910,
				 Class245_Sub1.aClass207_5303);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p4i(argument_0_);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2p128(argument_1_);
	Class251.method3243(class59_sub29, true);
    }
    
    public static void method3781(byte argument) {
	aClass59_Sub51_Sub13_2883 = null;
	aJs5Store_2881 = null;
	aClass368Array2878 = null;
	aClass207_2873 = null;
    }
    
    static final void method3782(int argument) {
	Class75.method1549(17381);
	if (argument != 0)
	    method3781((byte) -109);
	Class47.method453((byte) -50);
    }
    
    final int[][][] method3783(byte argument_2_) {
	if (anInt2880 != anInt2871)
	    throw new RuntimeException("Can only retrieve a full image cache");
	for (int anLocalInt = 0; anLocalInt < anInt2880; anLocalInt++)
	    aClass59_Sub19Array2870[anLocalInt]
		= Node_Sub47_Sub6.aClass59_Sub19_6180;
	return anIntArrayArrayArray2875;
    }
    
    final void method3784(int argument_3_) {
	for (int anLocalInt = 0; anInt2880 > anLocalInt; anLocalInt++) {
	    anIntArrayArrayArray2875[anLocalInt][0] = null;
	    anIntArrayArrayArray2875[anLocalInt][1] = null;
	    anIntArrayArrayArray2875[anLocalInt][2] = null;
	    anIntArrayArrayArray2875[anLocalInt] = null;
	}
	aClass59_Sub19Array2870 = null;
	anIntArrayArrayArray2875 = null;
	aCyclicLinkedList_2874.clear();
	aCyclicLinkedList_2874 = null;
    }
    
    final int[][] method3785(byte argument_4_, int argument_5_) {
	if (anInt2880 != anInt2871) {
	    if (anInt2880 == 1) {
		((Class341) this).aBoolean2882 = argument_5_ != anInt2877;
		anInt2877 = argument_5_;
		return anIntArrayArrayArray2875[0];
	    }
	    Node_Sub19 class59_sub19 = aClass59_Sub19Array2870[argument_5_];
	    if (class59_sub19 == null) {
		((Class341) this).aBoolean2882 = true;
		if (anInt2872 >= anInt2880) {
		    Node_Sub19 class59_sub19_6_
			= (Node_Sub19) aCyclicLinkedList_2874.getEnd();
		    class59_sub19
			= new Node_Sub19(argument_5_,
					    (((Node_Sub19) class59_sub19_6_)
					     .anInt4011));
		    aClass59_Sub19Array2870[(((Node_Sub19) class59_sub19_6_)
					     .anInt4012)]
			= null;
		    class59_sub19_6_.unlink();
		} else {
		    class59_sub19 = new Node_Sub19(argument_5_, anInt2872);
		    anInt2872++;
		}
		aClass59_Sub19Array2870[argument_5_] = class59_sub19;
	    } else
		((Class341) this).aBoolean2882 = false;
	    aCyclicLinkedList_2874.addBegin(class59_sub19);
	    return (anIntArrayArrayArray2875
		    [((Node_Sub19) class59_sub19).anInt4011]);
	}
	((Class341) this).aBoolean2882
	    = aClass59_Sub19Array2870[argument_5_] == null;
	aClass59_Sub19Array2870[argument_5_]
	    = Node_Sub47_Sub6.aClass59_Sub19_6180;
	return anIntArrayArrayArray2875[argument_5_];
    }
    
    Class341(int argument_7_, int argument_8_, int argument_9_) {
	aCyclicLinkedList_2874 = new CyclicLinkedList();
	((Class341) this).aBoolean2882 = false;
	anInt2880 = argument_7_;
	anInt2871 = argument_8_;
	aClass59_Sub19Array2870 = new Node_Sub19[anInt2871];
	anIntArrayArrayArray2875 = new int[anInt2880][3][argument_9_];
    }
    
    static {
	aLong2879 = (long) (Math.random() * 9.999999999E9);
    }
}
