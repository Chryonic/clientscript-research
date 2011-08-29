/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class149
{
    private DCyclicLinkedList aDCyclicLinkedList_1136 = new DCyclicLinkedList();
    private int anInt1137;
    private int anInt1139;
    static String aString1140;
    static int[] anIntArray1141 = new int[4];
    private JagexHashMap aJagexHashMap_1142;
    
    final Object get(long argument_1_) {
	DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
	    = ((DoublyLinkedNode_Sub51_Sub19)
	       aJagexHashMap_1142.get(argument_1_));
	if (class59_sub51_sub19 == null)
	    return null;
	Object object = class59_sub51_sub19.method1296((byte) 20);
	if (object == null) {
	    class59_sub51_sub19.unlink();
	    class59_sub51_sub19.unlinkD();
	    anInt1139 += ((DoublyLinkedNode_Sub51_Sub19) class59_sub51_sub19).anInt6355;
	    return null;
	}
	if (class59_sub51_sub19.method1299(14391)) {
	    DoublyLinkedNode_Sub51_Sub19_Sub1 class59_sub51_sub19_sub1
		= new DoublyLinkedNode_Sub51_Sub19_Sub1(object, (((DoublyLinkedNode_Sub51_Sub19)
							 class59_sub51_sub19)
							.anInt6355));
	    aJagexHashMap_1142.put(((Node) class59_sub51_sub19).hash, class59_sub51_sub19_sub1);
	    aDCyclicLinkedList_1136.add(class59_sub51_sub19_sub1);
	    ((DoublyLinkedNode) class59_sub51_sub19_sub1).id = 0L;
	    class59_sub51_sub19.unlink();
	    class59_sub51_sub19.unlinkD();
	} else {
	    aDCyclicLinkedList_1136.add(class59_sub51_sub19);
	    ((DoublyLinkedNode) class59_sub51_sub19).id = 0L;
	}
	return object;
    }
    
    public static void method2530(int argument) {
	anIntArray1141 = null;
	aString1140 = null;
    }
    
    final Object method2531(int argument_2_) {
	DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
	    = (DoublyLinkedNode_Sub51_Sub19) aJagexHashMap_1142.next();
	while (class59_sub51_sub19 != null) {
	    Object object = class59_sub51_sub19.method1296((byte) 20);
	    if (object == null) {
		DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19_3_
		    = class59_sub51_sub19;
		class59_sub51_sub19 = ((DoublyLinkedNode_Sub51_Sub19)
				       aJagexHashMap_1142.next());
		class59_sub51_sub19_3_.unlink();
		class59_sub51_sub19_3_.unlinkD();
		anInt1139 += (((DoublyLinkedNode_Sub51_Sub19) class59_sub51_sub19_3_)
			      .anInt6355);
	    } else
		return object;
	}
	return null;
    }
    
    final void put(Object argument_5_, long argument_6_) {
	method2536(0, argument_5_, argument_6_, 1);
    }
    
    private final void method2533(DoublyLinkedNode_Sub51_Sub19 argument_7_,
				  boolean argument_8_) {
	if (argument_8_)
	    method2530(73);
	if (argument_7_ != null) {
	    argument_7_.unlink();
	    argument_7_.unlinkD();
	    anInt1139 += ((DoublyLinkedNode_Sub51_Sub19) argument_7_).anInt6355;
	}
    }
    
    final void method2534(int argument_9_, byte argument_10_) {
	if (Class266.aClass143_2137 != null) {
	    for (DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
		     = (DoublyLinkedNode_Sub51_Sub19) aDCyclicLinkedList_1136.getFirst();
		 class59_sub51_sub19 != null;
		 class59_sub51_sub19
		     = (DoublyLinkedNode_Sub51_Sub19) aDCyclicLinkedList_1136.getNext()) {
		if (!class59_sub51_sub19.method1299(14391)) {
		    if (++((DoublyLinkedNode) class59_sub51_sub19).id
			> (long) argument_9_) {
			DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19_11_
			    = Class266.aClass143_2137
				  .method2511(0, class59_sub51_sub19);
			aJagexHashMap_1142.put((((Node) class59_sub51_sub19).hash), class59_sub51_sub19_11_);
			OutputStream_Sub2.method139(class59_sub51_sub19, false,
						    class59_sub51_sub19_11_);
			class59_sub51_sub19.unlink();
			class59_sub51_sub19.unlinkD();
		    }
		} else if (class59_sub51_sub19.method1296((byte) 20) == null) {
		    class59_sub51_sub19.unlink();
		    class59_sub51_sub19.unlinkD();
		    anInt1139 += (((DoublyLinkedNode_Sub51_Sub19) class59_sub51_sub19)
				  .anInt6355);
		}
	    }
	}
	if (argument_10_ != -8)
	    anIntArray1141 = null;
    }
    
    final int method2535(int argument_12_) {
	return anInt1139;
    }
    
    final void method2536(int argument_13_, Object argument_14_,
			  long argument_15_, int argument_16_) {
	if (anInt1137 < argument_16_)
	    throw new IllegalStateException("s>cs");
	method2538(-122, argument_15_);
	anInt1139 -= argument_16_;
	while (anInt1139 < 0) {
	    DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
		= ((DoublyLinkedNode_Sub51_Sub19)
		   aDCyclicLinkedList_1136.remove());
	    method2533(class59_sub51_sub19, false);
	}
	DoublyLinkedNode_Sub51_Sub19_Sub1 class59_sub51_sub19_sub1
	    = new DoublyLinkedNode_Sub51_Sub19_Sub1(argument_14_, argument_16_);
	aJagexHashMap_1142.put(argument_15_, class59_sub51_sub19_sub1);
	aDCyclicLinkedList_1136.add(class59_sub51_sub19_sub1);
	((DoublyLinkedNode) class59_sub51_sub19_sub1).id
	    = (long) argument_13_;
    }
    
    Class149(int argument_17_) {
	this(argument_17_, argument_17_);
    }
    
    static final void method2537
	(GraphicsToolkit argument, int argument_18_, Class244 argument_19_,
	 int argument_20_, int argument_21_, Class299 argument_22_,
	 boolean argument_23_, Node_Sub7 argument_24_, int argument_25_) {
	int anLocalInt = -(argument_25_ / 2) - 5 + argument_21_;
	int anLocalInt_26_ = argument_18_ + 2;
	if (((Class299) argument_22_).anInt2516 != 0)
	    argument.method2020(74, argument_25_ + 10, anLocalInt_26_,
				(-anLocalInt_26_ + argument_18_ + 1
				 + argument_20_ * argument_19_.method3161()),
				anLocalInt,
				((Class299) argument_22_).anInt2516);
	if (((Class299) argument_22_).anInt2511 != 0)
	    argument.method2028(anLocalInt_26_, (byte) 40,
				(-anLocalInt_26_
				 + (argument_18_
				    + argument_19_.method3161() * argument_20_)
				 + 1),
				((Class299) argument_22_).anInt2511,
				anLocalInt, argument_25_ + 10);
	int anLocalInt_27_ = ((Class299) argument_22_).anInt2510;
	if (((Node_Sub7) argument_24_).aBoolean3913
	    && ((Class299) argument_22_).anInt2508 != -1)
	    anLocalInt_27_ = ((Class299) argument_22_).anInt2508;
	for (int anLocalInt_28_ = 0; argument_20_ > anLocalInt_28_;
	     anLocalInt_28_++) {
	    String string = DxSkybox.aStringArray4476[anLocalInt_28_];
	    if (argument_20_ - 1 > anLocalInt_28_)
		string = string.substring(0, string.length() - 4);
	    argument_19_.method3164(argument, string, argument_21_,
				    argument_18_, anLocalInt_27_, true);
	    argument_18_ += argument_19_.method3161();
	}
    }
    
    private final void method2538(int argument_29_, long argument_30_) {
	DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
	    = (DoublyLinkedNode_Sub51_Sub19) aJagexHashMap_1142.get(argument_30_);
	method2533(class59_sub51_sub19, false);
	if (argument_29_ >= -19)
	    method2542(false);
    }
    
    final int method2539(int argument_31_) {
	int anLocalInt = 0;
	for (DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
		 = ((DoublyLinkedNode_Sub51_Sub19)
		    aDCyclicLinkedList_1136.getFirst());
	     class59_sub51_sub19 != null;
	     class59_sub51_sub19
		 = (DoublyLinkedNode_Sub51_Sub19) aDCyclicLinkedList_1136.getNext()) {
	    if (!class59_sub51_sub19.method1299(14391))
		anLocalInt++;
	}
	return anLocalInt;
    }
    
    final void method2540(int argument_32_) {
	for (DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
		 = (DoublyLinkedNode_Sub51_Sub19) aDCyclicLinkedList_1136.getFirst();
	     class59_sub51_sub19 != null;
	     class59_sub51_sub19
		 = (DoublyLinkedNode_Sub51_Sub19) aDCyclicLinkedList_1136.getNext()) {
	    if (class59_sub51_sub19.method1299(14391)) {
		class59_sub51_sub19.unlink();
		class59_sub51_sub19.unlinkD();
		anInt1139
		    += ((DoublyLinkedNode_Sub51_Sub19) class59_sub51_sub19).anInt6355;
	    }
	}
    }
    
    final int method2541(int argument_33_) {
	return anInt1137;
    }
    
    final Object method2542(boolean argument_34_) {
	DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19
	    = (DoublyLinkedNode_Sub51_Sub19) aJagexHashMap_1142.first(0);
	while (class59_sub51_sub19 != null) {
	    Object object = class59_sub51_sub19.method1296((byte) 20);
	    if (object == null) {
		DoublyLinkedNode_Sub51_Sub19 class59_sub51_sub19_35_
		    = class59_sub51_sub19;
		class59_sub51_sub19 = ((DoublyLinkedNode_Sub51_Sub19)
				       aJagexHashMap_1142.next());
		class59_sub51_sub19_35_.unlink();
		class59_sub51_sub19_35_.unlinkD();
		anInt1139 += (((DoublyLinkedNode_Sub51_Sub19) class59_sub51_sub19_35_)
			      .anInt6355);
	    } else
		return object;
	}
	return null;
    }
    
    Class149(int argument_36_, int argument_37_) {
	anInt1137 = argument_36_;
	anInt1139 = argument_36_;
	int anLocalInt;
	for (anLocalInt = 1;
	     (argument_36_ > anLocalInt + anLocalInt
	      && anLocalInt < argument_37_);
	     anLocalInt += anLocalInt) {
	    /* empty */
	}
	aJagexHashMap_1142 = new JagexHashMap(anLocalInt);
    }
    
    final void clear(byte argument_38_) {
	aDCyclicLinkedList_1136.clear();
	aJagexHashMap_1142.method1527(0);
	anInt1139 = anInt1137;
    }
}
