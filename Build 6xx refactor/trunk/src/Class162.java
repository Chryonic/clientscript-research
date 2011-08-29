/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class162
{
    private JagexHashMap aJagexHashMap_1182;
    private int anInt1183;
    static Class207 aClass207_1184 = new Class207(65, 2);
    private DCyclicLinkedList aDCyclicLinkedList_1185 = new DCyclicLinkedList();
    private int anInt1186;
    static Class368 aClass368_1187;
    static int[][] anIntArrayArray1189
	= { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 },
	    { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 },
	    { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 },
	    { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 },
	    { 1, 6, 7, 1 } };
    
    private final void method2607(int argument_0_,
				  DoublyLinkedNode_Sub51_Sub12 argument_1_) {
	if (argument_0_ != 2)
	    anInt1183 = 99;
	if (argument_1_ != null) {
	    argument_1_.unlink();
	    argument_1_.unlinkD();
	    anInt1183 += ((DoublyLinkedNode_Sub51_Sub12) argument_1_).anInt6288;
	}
    }
    
    final void method2608(int argument_2_, int argument_3_) {
	if (Class86.aClass283_639 != null) {
	    for (DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12
		     = (DoublyLinkedNode_Sub51_Sub12) aDCyclicLinkedList_1185.getFirst();
		 class59_sub51_sub12 != null;
		 class59_sub51_sub12
		     = (DoublyLinkedNode_Sub51_Sub12) aDCyclicLinkedList_1185.getNext()) {
		if (class59_sub51_sub12.method1254(102)) {
		    if (class59_sub51_sub12.method1253(true) == null) {
			class59_sub51_sub12.unlink();
			class59_sub51_sub12.unlinkD();
			anInt1183
			    += (((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12)
				.anInt6288);
		    }
		} else if (++((DoublyLinkedNode) class59_sub51_sub12).id
			   > (long) argument_3_) {
		    DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12_4_
			= Class86.aClass283_639
			      .method3449((byte) 42, class59_sub51_sub12);
		    aJagexHashMap_1182.put((((Node) class59_sub51_sub12).hash), class59_sub51_sub12_4_);
		    OutputStream_Sub2.method139(class59_sub51_sub12, false,
						class59_sub51_sub12_4_);
		    class59_sub51_sub12.unlink();
		    class59_sub51_sub12.unlinkD();
		}
	    }
	}
    }
    
    final void method2609(byte argument_5_) {
	aDCyclicLinkedList_1185.clear();
	aJagexHashMap_1182.method1527(0);
	anInt1183 = anInt1186;
    }
    
    private final void method2610(int argument_6_, int argument_7_,
				  Interface9 argument_8_, Object argument_9_) {
	int anLocalInt = 121 / ((argument_6_ - 70) / 47);
	if (argument_7_ > anInt1186)
	    throw new IllegalStateException("s>cs");
	method2615(8, argument_8_);
	anInt1183 -= argument_7_;
	while (anInt1183 < 0) {
	    DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12
		= (DoublyLinkedNode_Sub51_Sub12) aDCyclicLinkedList_1185.remove();
	    method2607(2, class59_sub51_sub12);
	}
	DoublyLinkedNode_Sub51_Sub12_Sub1 class59_sub51_sub12_sub1
	    = new DoublyLinkedNode_Sub51_Sub12_Sub1(argument_8_, argument_9_,
					   argument_7_);
	aJagexHashMap_1182.put(argument_8_.method46(false), class59_sub51_sub12_sub1);
	aDCyclicLinkedList_1185.add(class59_sub51_sub12_sub1);
	((DoublyLinkedNode) class59_sub51_sub12_sub1).id = 0L;
    }
    
    final Object method2611(int argument_10_, Interface9 argument_11_) {
	long l = argument_11_.method46(false);
	DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12
	    = (DoublyLinkedNode_Sub51_Sub12) aJagexHashMap_1182.get(l);
	if (argument_10_ != 7)
	    anInt1186 = -32;
	for (/**/; class59_sub51_sub12 != null;
	     class59_sub51_sub12
		 = (DoublyLinkedNode_Sub51_Sub12) aJagexHashMap_1182.method1526()) {
	    if (((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12)
		    .anInterface9_6289
		    .method47(argument_11_, argument_10_ - 29334)) {
		Object object = class59_sub51_sub12.method1253(true);
		if (object == null) {
		    class59_sub51_sub12.unlink();
		    class59_sub51_sub12.unlinkD();
		    anInt1183 += (((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12)
				  .anInt6288);
		} else {
		    if (!class59_sub51_sub12.method1254(argument_10_ ^ 0x7c)) {
			aDCyclicLinkedList_1185.add(class59_sub51_sub12);
			((DoublyLinkedNode) class59_sub51_sub12).id = 0L;
		    } else {
			DoublyLinkedNode_Sub51_Sub12_Sub1 class59_sub51_sub12_sub1
			    = (new DoublyLinkedNode_Sub51_Sub12_Sub1
			       (argument_11_, object,
				(((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12)
				 .anInt6288)));
			aJagexHashMap_1182.put((((Node) class59_sub51_sub12).hash), class59_sub51_sub12_sub1);
			aDCyclicLinkedList_1185.add(class59_sub51_sub12_sub1);
			((DoublyLinkedNode) class59_sub51_sub12_sub1).id
			    = 0L;
			class59_sub51_sub12.unlink();
			class59_sub51_sub12.unlinkD();
		    }
		    return object;
		}
	    }
	}
	return null;
    }
    
    final int method2612(int argument_12_) {
	return anInt1183;
    }
    
    final void method2613(Object argument_13_, Interface9 argument_14_,
			  byte argument_15_) {
	method2610(-62, 1, argument_14_, argument_13_);
    }
    
    public static void method2614(int argument) {
	aClass368_1187 = null;
	aClass207_1184 = null;
	anIntArrayArray1189 = null;
    }
    
    private final void method2615(int argument_16_, Interface9 argument_17_) {
	long l = argument_17_.method46(false);
	for (DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12
		 = ((DoublyLinkedNode_Sub51_Sub12)
		    aJagexHashMap_1182.get(l));
	     class59_sub51_sub12 != null;
	     class59_sub51_sub12
		 = ((DoublyLinkedNode_Sub51_Sub12)
		    aJagexHashMap_1182.method1526())) {
	    if (((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12)
		    .anInterface9_6289.method47(argument_17_, -29327)) {
		method2607(2, class59_sub51_sub12);
		break;
	    }
	}
	if (argument_16_ != 8)
	    aDCyclicLinkedList_1185 = null;
    }
    
    final void method2616(boolean argument_18_) {
	for (DoublyLinkedNode_Sub51_Sub12 class59_sub51_sub12
		 = (DoublyLinkedNode_Sub51_Sub12) aDCyclicLinkedList_1185.getFirst();
	     class59_sub51_sub12 != null;
	     class59_sub51_sub12
		 = (DoublyLinkedNode_Sub51_Sub12) aDCyclicLinkedList_1185.getNext()) {
	    if (class59_sub51_sub12.method1254(125)) {
		class59_sub51_sub12.unlink();
		class59_sub51_sub12.unlinkD();
		anInt1183
		    += ((DoublyLinkedNode_Sub51_Sub12) class59_sub51_sub12).anInt6288;
	    }
	}
    }
    
    final int method2617(boolean argument_19_) {
	if (argument_19_)
	    method2615(27, null);
	return anInt1186;
    }
    
    Class162(int argument_20_) {
	anInt1183 = argument_20_;
	anInt1186 = argument_20_;
	int anLocalInt;
	for (anLocalInt = 1; argument_20_ > anLocalInt + anLocalInt;
	     anLocalInt += anLocalInt) {
	    /* empty */
	}
	aJagexHashMap_1182 = new JagexHashMap(anLocalInt);
    }
}
