/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class165
{
    static Class207 aClass207_1202 = new Class207(34, 6);
    private DoublyLinkedNode aClass59__1203DoublyLinked = new DoublyLinkedNode();
    static int anInt1204;
    private DCyclicLinkedList aDCyclicLinkedList_1205 = new DCyclicLinkedList();
    private int anInt1207;
    static Class149 aClass149_1208 = new Class149(4);
    private int anInt1209;
    static Class149 aClass149_1210 = new Class149(5);
    private JagexHashMap aJagexHashMap_1211;
    
    public static void method2626(int argument) {
	aClass207_1202 = null;
	aClass149_1210 = null;
	aClass149_1208 = null;
	Class1.genArray = null;
    }
    
    final DoublyLinkedNode get(long argument_0_, int argument_1_) {
	DoublyLinkedNode class59_DoublyLinked
	    = (DoublyLinkedNode) aJagexHashMap_1211.get(argument_0_);
	if (class59_DoublyLinked != null)
	    aDCyclicLinkedList_1205.add(class59_DoublyLinked);
	return class59_DoublyLinked;
    }
    
    static final void method2628(MenuAction argument,
				 byte argument_2_) {
	if (!Node_Sub31_Sub39.aBoolean6055) {
	    argument.unlink();
	    Class62_Sub12.anInt4402--;
	    if (!((MenuAction) argument).aBoolean6265) {
		long l = ((MenuAction) argument).aLong6279;
		DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7;
		for (class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Class205.aJagexHashMap_1470.get(l));
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Class205.aJagexHashMap_1470.method1526())) {
		    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
			    .aString6248.equals
			(((MenuAction) argument).aString6276))
			break;
		}
		if (class59_sub51_sub7 != null
		    && class59_sub51_sub7.method1212(53, argument))
		    Node_Sub50.method1160(class59_sub51_sub7, (byte) 3);
	    } else {
		for (DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getFirst());
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Node_Sub7.aDCyclicLinkedList_3920.getNext())) {
		    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
			    .aString6248.equals
			(((MenuAction) argument).aString6276)) {
			boolean anLocalBoolean = false;
			for (MenuAction class59_sub51_sub9
				 = ((MenuAction)
				    ((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
					.aDCyclicLinkedList_6250.getFirst());
			     class59_sub51_sub9 != null;
			     class59_sub51_sub9
				 = ((MenuAction)
				    ((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
					.aDCyclicLinkedList_6250.getNext())) {
			    if (class59_sub51_sub9 == argument) {
				anLocalBoolean = true;
				if (class59_sub51_sub7.method1212(-85,
								  argument))
				    Node_Sub50.method1160
                            (class59_sub51_sub7, (byte) 3);
				break;
			    }
			}
			if (anLocalBoolean)
			    break;
		    }
		}
	    }
	}
    }
    
    static final void method2629(int argument, int argument_3_,
				 int argument_4_, int argument_5_,
				 int argument_6_, int argument_7_) {
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub22_4298.method1446(7) != 0
	    && argument_5_ != 0 && Class105.anInt861 < 50 && argument_3_ != -1)
	    Class131.aClass169Array1059[Class105.anInt861++]
		= new Class169((byte) 1, argument_3_, argument_5_, argument_4_,
			       argument, 0, argument_6_, null);
    }
    
    final void method2630(long argument_8_, int argument_9_) {
	if (argument_9_ == 0) {
	    DoublyLinkedNode class59_DoublyLinked
		= (DoublyLinkedNode) aJagexHashMap_1211.get(argument_8_);
	    if (class59_DoublyLinked != null) {
		class59_DoublyLinked.unlink();
		class59_DoublyLinked.unlinkD();
		anInt1207++;
	    }
	}
    }
    
    final void put(DoublyLinkedNode argument_10_, int argument_11_, long argument_12_) {
	if (anInt1207 != 0)
	    anInt1207--;
	else {
	    DoublyLinkedNode class59_DoublyLinked = aDCyclicLinkedList_1205.remove();
	    class59_DoublyLinked.unlink();
	    class59_DoublyLinked.unlinkD();
	    if (class59_DoublyLinked == aClass59__1203DoublyLinked) {
		class59_DoublyLinked = aDCyclicLinkedList_1205.remove();
		class59_DoublyLinked.unlink();
		class59_DoublyLinked.unlinkD();
	    }
	}
	aJagexHashMap_1211.put(argument_12_, argument_10_);
	aDCyclicLinkedList_1205.add(argument_10_);
    }
    
    final void method2632(byte argument_13_) {
	aDCyclicLinkedList_1205.clear();
	aJagexHashMap_1211.method1527(0);
	aClass59__1203DoublyLinked = new DoublyLinkedNode();
	anInt1207 = anInt1209;
    }
    
    Class165(int argument_14_) {
	anInt1209 = argument_14_;
	anInt1207 = argument_14_;
	int anLocalInt;
	for (anLocalInt = 1; argument_14_ > anLocalInt + anLocalInt;
	     anLocalInt += anLocalInt) {
	    /* empty */
	}
	aJagexHashMap_1211 = new JagexHashMap(anLocalInt);
    }
}
