/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class20
{
    private Class149 aClass149_129 = new Class149(128);
    private Js5Store aJs5Store_130;
    static int anInt131 = -1;
    Js5Store aJs5Store_132;
    Class149 aClass149_133 = new Class149(64);
    
    final Class299 method312(int argument_0_, int argument_1_) {
	Class299 class299;
	synchronized (aClass149_129) {
	    class299
		= (Class299) aClass149_129.get((long) argument_0_);
	}
	if (class299 != null)
	    return class299;
	byte[] anLocalInts;
	synchronized (aJs5Store_130) {
	    anLocalInts = aJs5Store_130.getData(36, argument_0_);
	}
	class299 = new Class299();
	((Class299) class299).aClass20_2487 = this;
	((Class299) class299).anInt2484 = argument_0_;
	if (anLocalInts != null)
	    class299.method3526(0, new Packet(anLocalInts));
	class299.method3523(-124);
	synchronized (aClass149_129) {
	    aClass149_129.put(class299, (long) argument_0_);
	}
	return class299;
    }
    
    static final void method313(String argument, int argument_2_) {
	if (argument != null) {
	    if (argument_2_ != -1)
		anInt131 = -26;
	    if (argument.startsWith("*"))
		argument = argument.substring(1);
	    String string = Class359.method3948(argument_2_ + 18124, argument);
	    if (string != null) {
		for (int anLocalInt = 0; Class257.anInt2013 > anLocalInt;
		     anLocalInt++) {
		    String string_3_ = Class260.aStringArray2031[anLocalInt];
		    if (string_3_.startsWith("*"))
			string_3_ = string_3_.substring(1);
		    string_3_ = Class359.method3948(18123, string_3_);
		    if (string_3_ != null && string_3_.equals(string)) {
			Class257.anInt2013--;
			for (int anLocalInt_4_ = anLocalInt;
			     Class257.anInt2013 > anLocalInt_4_;
			     anLocalInt_4_++) {
			    Class260.aStringArray2031[anLocalInt_4_]
				= Class260.aStringArray2031[anLocalInt_4_ + 1];
			    Statics.aStringArray4827[anLocalInt_4_]
				= (Statics.aStringArray4827
				   [anLocalInt_4_ + 1]);
			    GraphicsToolkit.anIntArray941[anLocalInt_4_]
				= GraphicsToolkit.anIntArray941[anLocalInt_4_ + 1];
			    DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt_4_]
				= (DoublyLinkedNodeP2_Sub10.aStringArray4601
				   [anLocalInt_4_ + 1]);
			    dba_sub_772_Sub2.anIntArray6370[anLocalInt_4_]
				= (dba_sub_772_Sub2.anIntArray6370
				   [anLocalInt_4_ + 1]);
			    Statics.aBooleanArray4340[anLocalInt_4_]
				= (Statics.aBooleanArray4340
				   [anLocalInt_4_ + 1]);
			}
			Class45.anInt316 = Class359.anInt3038;
			Node_Sub29 class59_sub29
			    = Class91.method1683((byte) 69,
						 (Node_Sub31_Sub16
						  .aClass372_5910),
						 (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
						  .aClass207_6829));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.p1
                    (
                            JagexStringUtils.strlenp1(argument, (byte) 124));
			((Node_Sub29) class59_sub29)
			    .aClass59_Sub28_Sub1_4129.pjstr(argument);
			Class251.method3243(class59_sub29, true);
			break;
		    }
		}
	    }
	}
    }
    
    final void method314(int argument_5_, int argument_6_, int argument_7_) {
	aClass149_129 = new Class149(argument_5_);
	((Class20) this).aClass149_133 = new Class149(argument_7_);
    }
    
    final void method315(byte argument_8_, int argument_9_) {
	synchronized (aClass149_129) {
	    aClass149_129.method2534(argument_9_, (byte) -8);
	}
	synchronized (((Class20) this).aClass149_133) {
	    ((Class20) this).aClass149_133.method2534(argument_9_, (byte) -8);
	}
    }
    
    final void method316(byte argument_10_) {
	synchronized (aClass149_129) {
	    aClass149_129.clear((byte) -3);
	}
	synchronized (((Class20) this).aClass149_133) {
	    ((Class20) this).aClass149_133.clear((byte) -3);
	}
    }
    
    final void method317(byte argument_11_) {
	synchronized (aClass149_129) {
	    aClass149_129.method2540(47);
	}
	synchronized (((Class20) this).aClass149_133) {
	    ((Class20) this).aClass149_133.method2540(-126);
	}
    }
    
    static final void method318(int argument,
				MenuAction argument_12_) {
	if (argument_12_ != null) {
	    DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.add(argument_12_);
	    Class62_Sub12.anInt4402++;
	    Object object = null;
	    DoublyLinkedNode_Sub51_Sub7 class59_sub51_sub7;
	    if (!((MenuAction) argument_12_).aBoolean6265
		&& !"".equals(((MenuAction) argument_12_)
			      .aString6276)) {
		long l = ((MenuAction) argument_12_).aLong6279;
		for (class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Class205.aJagexHashMap_1470.get(l));
		     class59_sub51_sub7 != null;
		     class59_sub51_sub7
			 = ((DoublyLinkedNode_Sub51_Sub7)
			    Class205.aJagexHashMap_1470.method1526())) {
		    if (((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
			    .aString6248.equals
			(((MenuAction) argument_12_).aString6276))
			break;
		}
		if (class59_sub51_sub7 == null) {
		    class59_sub51_sub7
			= ((DoublyLinkedNode_Sub51_Sub7)
			   Class111_Sub1.aClass149_4614.get(l));
		    if (class59_sub51_sub7 != null
			&& !(((DoublyLinkedNode_Sub51_Sub7) class59_sub51_sub7)
				 .aString6248.equals
			     (((MenuAction) argument_12_)
			      .aString6276)))
			class59_sub51_sub7 = null;
		    if (class59_sub51_sub7 == null)
			class59_sub51_sub7
			    = new DoublyLinkedNode_Sub51_Sub7(((MenuAction)
						      argument_12_)
						     .aString6276);
		    Class205.aJagexHashMap_1470.put(l, class59_sub51_sub7);
		    Class62_Sub8.anInt4394++;
		}
	    } else {
		class59_sub51_sub7
		    = new DoublyLinkedNode_Sub51_Sub7(((MenuAction)
					      argument_12_).aString6276);
		Class62_Sub8.anInt4394++;
	    }
	    if (argument == 1) {
		if (class59_sub51_sub7.method1213(-103, argument_12_))
		    Node_Sub50.method1160(class59_sub51_sub7, (byte) 3);
	    }
	}
    }
    
    Class20(GameEnum argument_13_, int argument_14_, Js5Store argument_15_,
	    Js5Store argument_16_) {
	aJs5Store_130 = argument_15_;
	((Class20) this).aJs5Store_132 = argument_16_;
	aJs5Store_130.getSubFileCount(36);
    }
}
