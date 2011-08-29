/* Class59_Sub9_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub9_Sub5 extends Node_Sub9
{
    private CyclicLinkedList aCyclicLinkedList_5807 = new CyclicLinkedList();
    static boolean[][] aBooleanArrayArray5808
	= { new boolean[4], { false, true, true, false },
	    { true, false, true, false }, { true, false, true, false },
	    { false, false, true, false }, { false, false, true, false },
	    { true, false, true, false }, { true, false, false, true },
	    { true, false, false, true }, { true, true, false, false },
	    new boolean[4], { false, true, false, true }, new boolean[4] };
    private int anInt5809;
    private boolean aBoolean5810;
    private int anInt5811 = 0;
    private int anInt5812;
    private boolean aBoolean5813;
    private int anInt5814 = 256;
    private int anInt5815;
    
    final DoublyLinkedNode_Sub51_Sub20 method671(int argument_0_, double argument_1_,
					int argument_2_) {
	long l = (long) (argument_2_ | anInt5809 << 0);
	if (argument_0_ != 12398)
	    return null;
	DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20
	    = (DoublyLinkedNode_Sub51_Sub20) Class91.aClass165_697.get(l, 82);
	if (class59_sub51_sub20 == null)
	    class59_sub51_sub20
		= new DoublyLinkedNode_Sub51_Sub20(new short[anInt5809][argument_2_],
					  argument_1_);
	else {
	    ((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20).aDouble6356
		= argument_1_;
	    Class91.aClass165_697.method2630(l, argument_0_ - 12398);
	}
	return class59_sub51_sub20;
    }
    
    final int method575() {
	return 1;
    }
    
    final Node_Sub9 method577() {
	return null;
    }
    
    final void method672(int argument_3_, byte argument_4_) {
	anInt5814 = argument_3_;
	anInt5812 = argument_3_;
    }
    
    final synchronized void method574(int argument_5_) {
	if (!aBoolean5813) {
	    for (;;) {
		DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20 = method681(-16087);
		if (class59_sub51_sub20 == null) {
		    if (aBoolean5810) {
			this.unlink();
			Class91.aClass165_697.method2632((byte) 123);
		    }
		    break;
		}
		if (argument_5_
		    < (((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20)
		       .aShortArrayArray6357[0]).length - anInt5815) {
		    anInt5815 += argument_5_;
		    break;
		}
		argument_5_ -= (((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20)
				.aShortArrayArray6357[0]).length - anInt5815;
		method683(1);
	    }
	}
    }
    
    final synchronized int method673(byte argument_6_) {
	return anInt5811;
    }
    
    final synchronized void method578(int[] argument_7_, int argument_8_,
				      int argument_9_) {
	if (!aBoolean5813) {
	    if (method681(-16087) == null) {
		if (aBoolean5810) {
		    this.unlink();
		    Class91.aClass165_697.method2632((byte) 126);
		}
	    } else {
		int anLocalInt = argument_9_ + argument_8_;
		if (Class62_Sub3.aBoolean4377)
		    anLocalInt <<= 1;
		int anLocalInt_10_ = 0;
		int anLocalInt_11_ = 0;
		if (anInt5809 == 2)
		    anLocalInt_11_ = 1;
		while (argument_8_ < anLocalInt) {
		    DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20
			= method681(-16087);
		    if (class59_sub51_sub20 == null)
			break;
		    short[][] anLocalInts;
		    for (anLocalInts
			     = (((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20)
				.aShortArrayArray6357);
			 (argument_8_ < anLocalInt
			  && anLocalInts[0].length > anInt5815);
			 anInt5815++) {
			if (!Class62_Sub3.aBoolean4377)
			    argument_7_[argument_8_++]
				+= ((anInt5812
				     * anLocalInts[anLocalInt_10_][anInt5815])
				    + (anLocalInts[anLocalInt_11_][anInt5815]
				       * anInt5814));
			else {
			    argument_7_[argument_8_++]
				= (anInt5812
				   * anLocalInts[anLocalInt_10_][anInt5815]);
			    argument_7_[argument_8_++]
				= (anInt5814
				   * anLocalInts[anLocalInt_11_][anInt5815]);
			}
		    }
		    if (anInt5815 >= anLocalInts[0].length)
			method683(1);
		}
	    }
	}
    }
    
    final synchronized void method674(int argument_12_) {
	aBoolean5810 = true;
    }
    
    static final Class148 method675(int argument, int argument_13_,
				    int argument_14_) {
	if ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[argument][argument_13_]
	     [argument_14_])
	    == null) {
	    boolean anLocalBoolean
		= ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0][argument_13_]
		    [argument_14_]) != null
		   && (((Class148) (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				    [0][argument_13_][argument_14_]))
		       .aClass148_1135) != null);
	    if (anLocalBoolean && argument >= LightingManager.yMapSize - 1)
		return null;
	    Class15.method301(argument, argument_13_, argument_14_);
	}
	return (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[argument]
		[argument_13_][argument_14_]);
    }
    
    public static void method676(byte argument) {
	aBooleanArrayArray5808 = null;
    }
    
    static final void method677(byte argument) {
	Node_Sub47_Sub12.aClass325_6217 = new Class325(8);
	Class62_Sub21.anInt4433 = 0;
	for (DoublyLinkedNodeP2_Sub7 class104_sub7
		 = (DoublyLinkedNodeP2_Sub7) Statics.aClass366_5518.method3986(0);
	     class104_sub7 != null;
	     class104_sub7 = (DoublyLinkedNodeP2_Sub7) Statics.aClass366_5518
						 .method3992((byte) 22))
	    class104_sub7.method1926();
    }
    
    final synchronized void method678(int argument_15_,
				      DoublyLinkedNode_Sub51_Sub20 argument_16_) {
	for (/**/; anInt5811 >= 100; anInt5811--)
	    aCyclicLinkedList_5807.remove();
	if (argument_15_ < -83) {
	    aCyclicLinkedList_5807.add(argument_16_);
	    anInt5811++;
	}
    }
    
    final synchronized double method679(int argument_17_) {
	if (anInt5811 < 1)
	    return -1.0;
	DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20
	    = (DoublyLinkedNode_Sub51_Sub20) aCyclicLinkedList_5807.getFirst();
	if (class59_sub51_sub20 == null)
	    return -1.0;
	return (((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20).aDouble6356
		- (double) ((float) (((DoublyLinkedNode_Sub51_Sub20)
				      class59_sub51_sub20)
				     .aShortArrayArray6357[0]).length
			    / (float) Statics.anInt44));
    }
    
    final Node_Sub9 method573() {
	return null;
    }
    
    static final boolean method680(byte argument, char argument_18_) {
	if (argument_18_ != '\u00a0' && argument_18_ != ' '
	    && argument_18_ != '_' && argument_18_ != '-')
	    return false;
	return true;
    }
    
    private final synchronized DoublyLinkedNode_Sub51_Sub20 method681
	(int argument_19_) {
	if (argument_19_ != -16087)
	    return null;
	return (DoublyLinkedNode_Sub51_Sub20) aCyclicLinkedList_5807.getFirst();
    }
    
    final synchronized void method682(boolean argument_20_, int argument_21_) {
	aBoolean5813 = argument_20_;
    }
    
    private final synchronized void method683(int argument_22_) {
	if (argument_22_ == 1) {
	    DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20 = method681(-16087);
	    if (class59_sub51_sub20 != null) {
		class59_sub51_sub20.unlink();
		anInt5815 = 0;
		anInt5811--;
		Class91.aClass165_697.put(class59_sub51_sub20, 104, class59_sub51_sub20.method1304(-78));
	    }
	}
    }
    
    Node_Sub9_Sub5(int argument_23_) {
	anInt5812 = 256;
	anInt5809 = argument_23_;
    }
}
