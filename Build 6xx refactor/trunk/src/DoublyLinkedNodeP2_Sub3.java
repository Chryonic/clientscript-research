/* Class104_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub3 extends DoublyLinkedNodeP2
{
    static CyclicLinkedList aCyclicLinkedList_4521 = new CyclicLinkedList();
    static DoublyLinkedNodeP2_Sub2_Sub2[] aClass104_Sub2_Sub2Array4522;
    static boolean aBoolean4523 = false;
    int anInt4524;
    
    public static void method1897(int argument) {
	aClass104_Sub2_Sub2Array4522 = null;
	aCyclicLinkedList_4521 = null;
    }
    
    static final void method1898
	(int argument, int argument_0_, int argument_1_,
	 DoublyLinkedNodeP2_Sub2_Sub3 argument_2_, DoublyLinkedNodeP2_Sub2_Sub3 argument_3_) {
	Class148 class148
	    = Node_Sub9_Sub5.method675(argument, argument_0_, argument_1_);
	if (class148 != null) {
	    ((Class148) class148).aClass104_Sub2_Sub3_1124 = argument_2_;
	    ((Class148) class148).aClass104_Sub2_Sub3_1123 = argument_3_;
	    int anLocalInt = ((Node_Sub31_Sub5.aClass_sArray5858
			       == Class65.aClass_sArray455)
			      ? 1 : 0);
	    if (argument_2_.method1766(-119)) {
		if (argument_2_.method1772(0)) {
		    ((DoublyLinkedNodeP2_Sub2) argument_2_).aClass104_Sub2_4515
			= InputStream_Sub2.aClass104_Sub2Array36[anLocalInt];
		    InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			= argument_2_;
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_2_).aClass104_Sub2_4515
			= (Node_Sub31_Sub33.aClass104_Sub2Array6004
			   [anLocalInt]);
		    Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			= argument_2_;
		    Class18.aBoolean124 = true;
		}
	    } else {
		((DoublyLinkedNodeP2_Sub2) argument_2_).aClass104_Sub2_4515
		    = Statics.aClass104_Sub2Array851[anLocalInt];
		Statics.aClass104_Sub2Array851[anLocalInt] = argument_2_;
	    }
	    if (argument_3_ != null) {
		if (argument_3_.method1766(-95)) {
		    if (argument_3_.method1772(0)) {
			((DoublyLinkedNodeP2_Sub2) argument_3_).aClass104_Sub2_4515
			    = (InputStream_Sub2.aClass104_Sub2Array36
			       [anLocalInt]);
			InputStream_Sub2.aClass104_Sub2Array36[anLocalInt]
			    = argument_3_;
		    } else {
			((DoublyLinkedNodeP2_Sub2) argument_3_).aClass104_Sub2_4515
			    = (Node_Sub31_Sub33.aClass104_Sub2Array6004
			       [anLocalInt]);
			Node_Sub31_Sub33.aClass104_Sub2Array6004[anLocalInt]
			    = argument_3_;
			Class18.aBoolean124 = true;
		    }
		} else {
		    ((DoublyLinkedNodeP2_Sub2) argument_3_).aClass104_Sub2_4515
			= Statics.aClass104_Sub2Array851[anLocalInt];
		    Statics.aClass104_Sub2Array851[anLocalInt] = argument_3_;
		}
	    }
	}
    }
    
    static final void method1899(boolean argument, int argument_4_) {
	for (Node_Sub13 class59_sub13
		 = ((Node_Sub13)
		    Class76.aCyclicLinkedList_519.getFirst());
	     class59_sub13 != null;
	     class59_sub13
		 = (Node_Sub13) Class76.aCyclicLinkedList_519.getNext()) {
	    if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
		!= null) {
		Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
		    (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968);
		((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968 = null;
	    }
	    if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3971
		!= null) {
		Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
		    (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3971);
		((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3971 = null;
	    }
	    class59_sub13.unlink();
	}
	if (argument_4_ > -27)
	    method1899(true, 78);
	if (argument) {
	    for (Node_Sub13 class59_sub13
		     = (Node_Sub13) Node_Sub31_Sub8.aCyclicLinkedList_5872
					   .getFirst();
		 class59_sub13 != null;
		 class59_sub13
		     = ((Node_Sub13)
			Node_Sub31_Sub8.aCyclicLinkedList_5872.getNext())) {
		if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) class59_sub13)
			 .aClass59_Sub9_Sub4_3968);
		    ((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
			= null;
		}
		class59_sub13.unlink();
	    }
	    for (Node_Sub13 class59_sub13
		     = (Node_Sub13) Class299.aJagexHashMap_2496.first(0);
		 class59_sub13 != null;
		 class59_sub13 = (Node_Sub13) Class299.aJagexHashMap_2496
						     .next()) {
		if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) class59_sub13)
			 .aClass59_Sub9_Sub4_3968);
		    ((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
			= null;
		}
		class59_sub13.unlink();
	    }
	}
    }
    
    DoublyLinkedNodeP2_Sub3(int argument_5_) {
	((DoublyLinkedNodeP2_Sub3) this).anInt4524 = argument_5_;
    }
}
