/* Class59_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub9_Sub1 extends Node_Sub9
{
    private Node_Sub9_Sub2 aClass59_Sub9_Sub2_5748;
    static boolean aBoolean5749 = false;
    CyclicLinkedList aCyclicLinkedList_5750 = new CyclicLinkedList();
    Node_Sub9_Sub3 aClass59_Sub9_Sub3_5751 = new Node_Sub9_Sub3();
    
    static final void method580(int argument, int argument_0_) {
	if (argument_0_ != -1 && RsInterface.empty[argument_0_]) {
	    RsInterface.interfaceStore.clearSubFileBuffer(argument_0_);
	    RsInterface.anInterfaces[argument_0_] = null;
	    Packet.aRsInterfaceArrayArray4123[argument_0_] = null;
	    RsInterface.empty[argument_0_] = false;
	}
    }
    
    final Node_Sub9 method577() {
	Node_Sub43 class59_sub43;
	do {
	    class59_sub43
		= ((Node_Sub43)
		   ((Node_Sub9_Sub1) this).aCyclicLinkedList_5750.getNext());
	    if (class59_sub43 == null)
		return null;
	} while (((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226
		 == null);
	return ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226;
    }
    
    private final void method581
	(int argument_1_, int argument_2_, int argument_3_, int argument_4_,
	 Node_Sub43 argument_5_, int[] argument_6_) {
	if (argument_1_ != 262144)
	    method574(44);
	if (((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748).anIntArray5765
	      [((Node_Sub43) argument_5_).anInt4228])
	     & 0x4) != 0
	    && ((Node_Sub43) argument_5_).anInt4223 < 0) {
	    int anLocalInt
		= ((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748)
		    .anIntArray5758[((Node_Sub43) argument_5_).anInt4228])
		   / Statics.anInt44);
	    for (;;) {
		int anLocalInt_7_
		    = ((anLocalInt + 1048575
			- ((Node_Sub43) argument_5_).anInt4213)
		       / anLocalInt);
		if (argument_3_ < anLocalInt_7_)
		    break;
		((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
		    .method578(argument_6_, argument_2_, anLocalInt_7_);
		((Node_Sub43) argument_5_).anInt4213
		    += anLocalInt * anLocalInt_7_ - 1048576;
		argument_2_ += anLocalInt_7_;
		argument_3_ -= anLocalInt_7_;
		int anLocalInt_8_ = Statics.anInt44 / 100;
		int anLocalInt_9_ = 262144 / anLocalInt;
		if (anLocalInt_9_ < anLocalInt_8_)
		    anLocalInt_8_ = anLocalInt_9_;
		Node_Sub9_Sub4 class59_sub9_sub4
		    = ((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226;
		if ((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748)
		     .anIntArray5752[((Node_Sub43) argument_5_).anInt4228])
		    != 0) {
		    ((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
			= (Node_Sub9_Sub4.method631
                    ((((Node_Sub43) argument_5_)
                            .aClass59_Sub40_Sub1_4227),
                            class59_sub9_sub4.method659(), 0,
                            class59_sub9_sub4.method662()));
		    aClass59_Sub9_Sub2_5748.method585
			(argument_1_ ^ 0x46148,
			 (((Node_Sub6)
			   ((Node_Sub43) argument_5_).aClass59_Sub6_4224)
			  .aShortArray3908
			  [((Node_Sub43) argument_5_).anInt4207]) < 0,
			 argument_5_);
		    ((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
			.method643
			(anLocalInt_8_, class59_sub9_sub4.method644());
		} else
		    ((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
			= (Node_Sub9_Sub4.method631
                    ((((Node_Sub43) argument_5_)
                            .aClass59_Sub40_Sub1_4227),
                            class59_sub9_sub4.method659(),
                            class59_sub9_sub4.method644(),
                            class59_sub9_sub4.method662()));
		if ((((Node_Sub6)
		      ((Node_Sub43) argument_5_).aClass59_Sub6_4224)
		     .aShortArray3908[((Node_Sub43) argument_5_).anInt4207])
		    < 0)
		    ((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
			.method664(-1);
		class59_sub9_sub4.method668(anLocalInt_8_);
		class59_sub9_sub4.method578(argument_6_, argument_2_,
					    -argument_2_ + argument_4_);
		if (class59_sub9_sub4.method669())
		    ((Node_Sub9_Sub1) this).aClass59_Sub9_Sub3_5751
			.method629(class59_sub9_sub4);
	    }
	    ((Node_Sub43) argument_5_).anInt4213
		+= argument_3_ * anLocalInt;
	}
	((Node_Sub43) argument_5_).aClass59_Sub9_Sub4_4226
	    .method578(argument_6_, argument_2_, argument_3_);
    }
    
    final int method575() {
	return 0;
    }
    
    static final void method582(Class148[][][] argument, int argument_10_) {
	for (int anLocalInt = argument_10_; anLocalInt < argument.length;
	     anLocalInt++) {
	    Class148[][] class148s = argument[anLocalInt];
	    for (int anLocalInt_11_ = 0; class148s.length > anLocalInt_11_;
		 anLocalInt_11_++) {
		for (int anLocalInt_12_ = 0;
		     anLocalInt_12_ < class148s[anLocalInt_11_].length;
		     anLocalInt_12_++) {
		    Class148 class148
			= class148s[anLocalInt_11_][anLocalInt_12_];
		    if (class148 != null) {
			if (((Class148) class148).aClass104_Sub2_Sub4_1134
			    instanceof Interface2)
			    ((Interface2)
			     ((Class148) class148).aClass104_Sub2_Sub4_1134)
				.method5(14667);
			if (((Class148) class148).aClass104_Sub2_Sub1_1131
			    instanceof Interface2)
			    ((Interface2)
			     ((Class148) class148).aClass104_Sub2_Sub1_1131)
				.method5(14667);
			if (((Class148) class148).aClass104_Sub2_Sub1_1128
			    instanceof Interface2)
			    ((Interface2)
			     ((Class148) class148).aClass104_Sub2_Sub1_1128)
				.method5(14667);
			if (((Class148) class148).aClass104_Sub2_Sub3_1124
			    instanceof Interface2)
			    ((Interface2)
			     ((Class148) class148).aClass104_Sub2_Sub3_1124)
				.method5(14667);
			if (((Class148) class148).aClass104_Sub2_Sub3_1123
			    instanceof Interface2)
			    ((Interface2)
			     ((Class148) class148).aClass104_Sub2_Sub3_1123)
				.method5(14667);
			for (Class110 class110
				 = ((Class148) class148).aClass110_1126;
			     class110 != null;
			     class110 = ((Class110) class110).aClass110_912) {
			    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
				= (((Class110) class110)
				   .aClass104_Sub2_Sub2_911);
			    if (class104_sub2_sub2 instanceof Interface2)
				((Interface2) class104_sub2_sub2)
				    .method5(14667);
			}
		    }
		}
	    }
	}
    }
    
    final void method578(int[] argument_13_, int argument_14_,
			 int argument_15_) {
	((Node_Sub9_Sub1) this).aClass59_Sub9_Sub3_5751
	    .method578(argument_13_, argument_14_, argument_15_);
    while_223_:
	for (Node_Sub43 class59_sub43
		 = (Node_Sub43) ((Node_Sub9_Sub1) this)
				       .aCyclicLinkedList_5750.getFirst();
	     class59_sub43 != null;
	     class59_sub43
		 = (Node_Sub43) ((Node_Sub9_Sub1) this)
				       .aCyclicLinkedList_5750.getNext()) {
	    if (!aClass59_Sub9_Sub2_5748.method609(class59_sub43, 29302)) {
		int anLocalInt = argument_15_;
		int anLocalInt_16_ = argument_14_;
		while (((Node_Sub43) class59_sub43).anInt4210
		       < anLocalInt) {
		    method581(262144, anLocalInt_16_,
			      ((Node_Sub43) class59_sub43).anInt4210,
			      anLocalInt + anLocalInt_16_, class59_sub43,
			      argument_13_);
		    anLocalInt -= ((Node_Sub43) class59_sub43).anInt4210;
		    anLocalInt_16_
			+= ((Node_Sub43) class59_sub43).anInt4210;
		    if (aClass59_Sub9_Sub2_5748.method620(class59_sub43,
							  anLocalInt_16_,
							  argument_13_,
							  anLocalInt, -12))
			continue while_223_;
		}
		method581(262144, anLocalInt_16_, anLocalInt,
			  anLocalInt_16_ + anLocalInt, class59_sub43,
			  argument_13_);
		((Node_Sub43) class59_sub43).anInt4210 -= anLocalInt;
	    }
	}
    }
    
    final Node_Sub9 method573() {
	Node_Sub43 class59_sub43
	    = (Node_Sub43) ((Node_Sub9_Sub1) this).aCyclicLinkedList_5750
				  .getFirst();
	if (class59_sub43 == null)
	    return null;
	if (((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226 != null)
	    return ((Node_Sub43) class59_sub43).aClass59_Sub9_Sub4_4226;
	return method577();
    }
    
    private final void method583(int argument_17_, int argument_18_,
				 Node_Sub43 argument_19_) {
	if (((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748).anIntArray5765
	      [((Node_Sub43) argument_19_).anInt4228])
	     & 0x4) != 0
	    && ((Node_Sub43) argument_19_).anInt4223 < 0) {
	    int anLocalInt
		= ((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748)
		    .anIntArray5758[((Node_Sub43) argument_19_).anInt4228])
		   / Statics.anInt44);
	    int anLocalInt_20_ = ((anLocalInt + 1048575
				   - ((Node_Sub43) argument_19_).anInt4213)
				  / anLocalInt);
	    ((Node_Sub43) argument_19_).anInt4213
		= (anLocalInt * argument_18_
		   + ((Node_Sub43) argument_19_).anInt4213) & 0xfffff;
	    if (argument_18_ >= anLocalInt_20_) {
		if ((((Node_Sub9_Sub2) aClass59_Sub9_Sub2_5748)
		     .anIntArray5752[((Node_Sub43) argument_19_).anInt4228])
		    == 0)
		    ((Node_Sub43) argument_19_).aClass59_Sub9_Sub4_4226
			= (Node_Sub9_Sub4.method631
                    ((((Node_Sub43) argument_19_)
                            .aClass59_Sub40_Sub1_4227),
                            ((Node_Sub43) argument_19_)
                                    .aClass59_Sub9_Sub4_4226.method659(),
                            ((Node_Sub43) argument_19_)
                                    .aClass59_Sub9_Sub4_4226.method644(),
                            ((Node_Sub43) argument_19_)
                                    .aClass59_Sub9_Sub4_4226.method662()));
		else {
		    ((Node_Sub43) argument_19_).aClass59_Sub9_Sub4_4226
			= (Node_Sub9_Sub4.method631
                    ((((Node_Sub43) argument_19_)
                            .aClass59_Sub40_Sub1_4227),
                            ((Node_Sub43) argument_19_)
                                    .aClass59_Sub9_Sub4_4226.method659(),
                            0,
                            ((Node_Sub43) argument_19_)
                                    .aClass59_Sub9_Sub4_4226.method662()));
		    aClass59_Sub9_Sub2_5748.method585
			(24904,
			 (((Node_Sub6)
			   ((Node_Sub43) argument_19_).aClass59_Sub6_4224)
			  .aShortArray3908
			  [((Node_Sub43) argument_19_).anInt4207]) < 0,
			 argument_19_);
		}
		if ((((Node_Sub6)
		      ((Node_Sub43) argument_19_).aClass59_Sub6_4224)
		     .aShortArray3908
		     [((Node_Sub43) argument_19_).anInt4207])
		    < 0)
		    ((Node_Sub43) argument_19_).aClass59_Sub9_Sub4_4226
			.method664(-1);
		argument_18_
		    = ((Node_Sub43) argument_19_).anInt4213 / anLocalInt;
	    }
	}
	if (argument_17_ != 22981)
	    method573();
	((Node_Sub43) argument_19_).aClass59_Sub9_Sub4_4226
	    .method574(argument_18_);
    }
    
    final void method574(int argument_21_) {
	((Node_Sub9_Sub1) this).aClass59_Sub9_Sub3_5751
	    .method574(argument_21_);
    while_225_:
	for (Node_Sub43 class59_sub43
		 = (Node_Sub43) ((Node_Sub9_Sub1) this)
				       .aCyclicLinkedList_5750.getFirst();
	     class59_sub43 != null;
	     class59_sub43
		 = (Node_Sub43) ((Node_Sub9_Sub1) this)
				       .aCyclicLinkedList_5750.getNext()) {
	    if (!aClass59_Sub9_Sub2_5748.method609(class59_sub43, 29302)) {
		int anLocalInt = argument_21_;
		while (anLocalInt
		       > ((Node_Sub43) class59_sub43).anInt4210) {
		    method583(22981, ((Node_Sub43) class59_sub43).anInt4210,
			      class59_sub43);
		    anLocalInt -= ((Node_Sub43) class59_sub43).anInt4210;
		    if (aClass59_Sub9_Sub2_5748.method620(class59_sub43, 0,
							  null, anLocalInt,
							  -12))
			continue while_225_;
		}
		method583(22981, anLocalInt, class59_sub43);
		((Node_Sub43) class59_sub43).anInt4210 -= anLocalInt;
	    }
	}
    }
    
    Node_Sub9_Sub1(Node_Sub9_Sub2 argument_22_) {
	aClass59_Sub9_Sub2_5748 = argument_22_;
    }
}
