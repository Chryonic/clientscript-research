/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class97
{
    private int anInt750;
    private int anInt751 = -1;
    private int[][] anIntArrayArray752;
    private Node_Sub33[] aClass59_Sub33Array753;
    private CyclicLinkedList aCyclicLinkedList_754;
    private int anInt755;
    private int anInt756 = 0;
    static Class244 aClass244_757;
    boolean aBoolean758;
    
    public static void method1716(byte argument) {
	aClass244_757 = null;
    }
    
    final int[][] method1717(int argument_0_) {
	if (anInt755 != anInt750)
	    throw new RuntimeException("Can only retrieve a full image cache");
	for (int anLocalInt = argument_0_; anInt755 > anLocalInt; anLocalInt++)
	    aClass59_Sub33Array753[anLocalInt] = Class354.aClass59_Sub33_3002;
	return anIntArrayArray752;
    }
    
    final int[] method1718(int argument_1_, int argument_2_) {
	if (anInt755 == anInt750) {
	    ((Class97) this).aBoolean758
		= aClass59_Sub33Array753[argument_1_] == null;
	    aClass59_Sub33Array753[argument_1_] = Class354.aClass59_Sub33_3002;
	    return anIntArrayArray752[argument_1_];
	}
	if (anInt755 != 1) {
	    Node_Sub33 class59_sub33 = aClass59_Sub33Array753[argument_1_];
	    if (class59_sub33 != null)
		((Class97) this).aBoolean758 = false;
	    else {
		((Class97) this).aBoolean758 = true;
		if (anInt755 <= anInt756) {
		    Node_Sub33 class59_sub33_3_
			= (Node_Sub33) aCyclicLinkedList_754.getEnd();
		    class59_sub33
			= new Node_Sub33(argument_1_,
					    (((Node_Sub33) class59_sub33_3_)
					     .anInt4147));
		    aClass59_Sub33Array753[(((Node_Sub33) class59_sub33_3_)
					    .anInt4148)]
			= null;
		    class59_sub33_3_.unlink();
		} else {
		    class59_sub33 = new Node_Sub33(argument_1_, anInt756);
		    anInt756++;
		}
		aClass59_Sub33Array753[argument_1_] = class59_sub33;
	    }
	    aCyclicLinkedList_754.addBegin(class59_sub33);
	    return (anIntArrayArray752
		    [((Node_Sub33) class59_sub33).anInt4147]);
	}
	((Class97) this).aBoolean758 = anInt751 != argument_1_;
	anInt751 = argument_1_;
	return anIntArrayArray752[0];
    }
    
    final void method1719(byte argument_4_) {
	for (int anLocalInt = 0; anInt755 > anLocalInt; anLocalInt++)
	    anIntArrayArray752[anLocalInt] = null;
	aClass59_Sub33Array753 = null;
	anIntArrayArray752 = null;
	aCyclicLinkedList_754.clear();
	aCyclicLinkedList_754 = null;
    }
    
    static final DoublyLinkedNode_Sub51_Sub13 method1720(int argument) {
	return Class179.aClass59_Sub51_Sub13_1320;
    }
    
    Class97(int argument_5_, int argument_6_, int argument_7_) {
	aCyclicLinkedList_754 = new CyclicLinkedList();
	((Class97) this).aBoolean758 = false;
	anInt750 = argument_6_;
	anInt755 = argument_5_;
	aClass59_Sub33Array753 = new Node_Sub33[anInt750];
	anIntArrayArray752 = new int[anInt755][argument_7_];
    }
}
