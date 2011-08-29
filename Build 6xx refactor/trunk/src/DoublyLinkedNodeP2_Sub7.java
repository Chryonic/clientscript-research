/* Class104_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub7 extends DoublyLinkedNodeP2
{
    DoublyLinkedNodeP2_Sub4_Sub1_Sub1[] aClass104_Sub4_Sub1_Sub1Array4559;
    private boolean aBoolean4560;
    private static boolean[] aBooleanArray4561 = new boolean[8];
    private static boolean[] aBooleanArray4562 = new boolean[32];
    boolean aBoolean4563 = false;
    int anInt4564;
    private long aLong4565;
    private long aLong4566;
    private Class366 aClass366_4567;
    private int anInt4568;
    CyclicLinkedList aCyclicLinkedList_4569;
    int anInt4570;
    boolean aBoolean4571;
    Class72 aClass72_4572;
    private boolean aBoolean4573;
    private int anInt4574;
    
    public static void method1921() {
	aBooleanArray4562 = null;
	aBooleanArray4561 = null;
    }
    
    final void method1922(long argument_0_) {
	aLong4566 = argument_0_;
    }
    
    final void method1923() {
	aBoolean4573 = true;
    }
    
    final void method1924(GraphicsToolkit argument_1_) {
	((Class72) ((DoublyLinkedNodeP2_Sub7) this).aClass72_4572).aClass119_497
	    .method2380(32362);
	for (DoublyLinkedNodeP2_Sub6 class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3986(0);
	     class104_sub6 != null;
	     class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3992((byte) 5))
	    class104_sub6.method1919((byte) -107, aLong4565, argument_1_);
    }
    
    final void method1925(GraphicsToolkit argument_2_, long argument_3_,
			  Class38[] argument_4_, Class185[] argument_5_,
			  boolean argument_6_) {
	if (!((DoublyLinkedNodeP2_Sub7) this).aBoolean4563) {
	    method1933(argument_2_, argument_4_, argument_6_);
	    method1927(argument_5_, argument_6_);
	    aLong4566 = argument_3_;
	}
    }
    
    final void method1926() {
	((DoublyLinkedNodeP2_Sub7) this).aBoolean4563 = true;
	for (DoublyLinkedNode_Sub51_Sub18 class59_sub51_sub18
		 = (DoublyLinkedNode_Sub51_Sub18) ((DoublyLinkedNodeP2_Sub7) this)
					     .aCyclicLinkedList_4569
					     .getFirst();
	     class59_sub51_sub18 != null;
	     class59_sub51_sub18
		 = ((DoublyLinkedNode_Sub51_Sub18)
		    ((DoublyLinkedNodeP2_Sub7) this).aCyclicLinkedList_4569.getNext())) {
	    if (((Class47) (((DoublyLinkedNode_Sub51_Sub18) class59_sub51_sub18)
			    .aClass47_6349)).anInt334
		== 1)
		class59_sub51_sub18.unlinkD();
	}
	for (int anLocalInt = 0;
	     anLocalInt < (((DoublyLinkedNodeP2_Sub7) this)
			   .aClass104_Sub4_Sub1_Sub1Array4559).length;
	     anLocalInt++) {
	    if ((((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		 [anLocalInt])
		!= null) {
		((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		    [anLocalInt].method1908();
		((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		    [anLocalInt]
		    = null;
	    }
	}
	((DoublyLinkedNodeP2_Sub7) this).anInt4564 = 0;
	aClass366_4567 = new Class366();
	anInt4568 = 0;
	((DoublyLinkedNodeP2_Sub7) this).aCyclicLinkedList_4569 = new CyclicLinkedList();
	anInt4574 = 0;
	this.unlink();
	Class62_Sub5.aClass104_Sub7Array4384[Statics.anInt1997] = this;
	Statics.anInt1997
	    = (Statics.anInt1997 + 1
	       & Class166.anIntArray1217[Node_Sub21.anInt4035]);
    }
    
    private final void method1927(Class185[] argument_7_,
				  boolean argument_8_) {
	for (int anLocalInt = 0; anLocalInt < 8; anLocalInt++)
	    aBooleanArray4561[anLocalInt] = false;
    while_114_:
	for (DoublyLinkedNode_Sub51_Sub18 class59_sub51_sub18
		 = (DoublyLinkedNode_Sub51_Sub18) ((DoublyLinkedNodeP2_Sub7) this)
					     .aCyclicLinkedList_4569
					     .getFirst();
	     class59_sub51_sub18 != null;
	     class59_sub51_sub18
		 = ((DoublyLinkedNode_Sub51_Sub18)
		    ((DoublyLinkedNodeP2_Sub7) this).aCyclicLinkedList_4569.getNext())) {
	    if (argument_7_ != null) {
		for (int anLocalInt = 0; anLocalInt < argument_7_.length;
		     anLocalInt++) {
		    if ((((DoublyLinkedNode_Sub51_Sub18) class59_sub51_sub18)
			 .aClass185_6348) == argument_7_[anLocalInt]
			|| ((((DoublyLinkedNode_Sub51_Sub18) class59_sub51_sub18)
			     .aClass185_6348)
			    == (((Class185) argument_7_[anLocalInt])
				.aClass185_1387))) {
			aBooleanArray4561[anLocalInt] = true;
			class59_sub51_sub18.method1289((byte) -50);
			continue while_114_;
		    }
		}
	    }
	    if (!argument_8_) {
		class59_sub51_sub18.unlink();
		anInt4574--;
		if (class59_sub51_sub18.isLinkedD()) {
		    class59_sub51_sub18.unlinkD();
		    Class62_Sub21.anInt4433--;
		}
	    }
	}
	if (argument_7_ != null) {
	    for (int anLocalInt = 0; anLocalInt < argument_7_.length;
		 anLocalInt++) {
		if (anLocalInt == 8 || anInt4574 == 8)
		    break;
		if (!aBooleanArray4561[anLocalInt]) {
		    DoublyLinkedNode_Sub51_Sub18 class59_sub51_sub18 = null;
		    if ((((Class47) argument_7_[anLocalInt].method2859(1))
			 .anInt334) == 1
			&& Class62_Sub21.anInt4433 < 32) {
			class59_sub51_sub18
			    = new DoublyLinkedNode_Sub51_Sub18(argument_7_[anLocalInt],
						      this);
			Node_Sub47_Sub12.aClass325_6217.method3684
			    (class59_sub51_sub18, (byte) -93,
			     (long) (((Class185) argument_7_[anLocalInt])
				     .anInt1386));
			Class62_Sub21.anInt4433++;
		    }
		    if (class59_sub51_sub18 == null)
			class59_sub51_sub18
			    = new DoublyLinkedNode_Sub51_Sub18(argument_7_[anLocalInt],
						      this);
		    ((DoublyLinkedNodeP2_Sub7) this).aCyclicLinkedList_4569
			.add(class59_sub51_sub18);
		    anInt4574++;
		    aBooleanArray4561[anLocalInt] = true;
		}
	    }
	}
    }
    
    final boolean method1928(GraphicsToolkit argument_9_, long argument_10_) {
	if (aLong4566 != aLong4565)
	    method1930();
	else
	    method1934();
	if (argument_10_ - aLong4566 > 750L) {
	    method1926();
	    return false;
	}
	int anLocalInt = (int) (argument_10_ - aLong4565);
	if (aBoolean4573) {
	    for (DoublyLinkedNodeP2_Sub6 class104_sub6
		     = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3986(0);
		 class104_sub6 != null;
		 class104_sub6
		     = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3992((byte) -92)) {
		for (int anLocalInt_11_ = 0;
		     (anLocalInt_11_
		      < ((Class224) (((DoublyLinkedNodeP2_Sub6) class104_sub6)
				     .aClass224_4549)).anInt1564);
		     anLocalInt_11_++)
		    class104_sub6.method1920(argument_9_, 1, -80863512,
					     argument_10_, !aBoolean4560);
	    }
	    aBoolean4573 = false;
	}
	for (DoublyLinkedNodeP2_Sub6 class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3986(0);
	     class104_sub6 != null;
	     class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3992((byte) 74))
	    class104_sub6.method1920(argument_9_, anLocalInt, -80863512,
				     argument_10_, !aBoolean4560);
	aLong4565 = argument_10_;
	return true;
    }
    
    final void method1929(int argument_12_, int argument_13_, int argument_14_,
			  int argument_15_, int argument_16_) {
	((DoublyLinkedNodeP2_Sub7) this).anInt4570 = argument_12_;
    }
    
    final void method1930() {
	aBoolean4560 = true;
    }
    
    static final DoublyLinkedNodeP2_Sub7 method1931(int argument, boolean argument_17_) {
	if (Statics.anInt1997 != Statics.anInt860) {
	    DoublyLinkedNodeP2_Sub7 class104_sub7
		= Class62_Sub5.aClass104_Sub7Array4384[Statics.anInt860];
	    Statics.anInt860
		= (Statics.anInt860 + 1
		   & Class166.anIntArray1217[Node_Sub21.anInt4035]);
	    class104_sub7.method1935(argument, argument_17_);
	    return class104_sub7;
	}
	return new DoublyLinkedNodeP2_Sub7(argument, argument_17_);
    }
    
    final Class72 method1932() {
	return ((DoublyLinkedNodeP2_Sub7) this).aClass72_4572;
    }
    
    private final void method1933
	(GraphicsToolkit argument_18_, Class38[] argument_19_, boolean argument_20_) {
	for (int anLocalInt = 0; anLocalInt < 32; anLocalInt++)
	    aBooleanArray4562[anLocalInt] = false;
    while_116_:
	for (DoublyLinkedNodeP2_Sub6 class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3986(0);
	     class104_sub6 != null;
	     class104_sub6
		 = (DoublyLinkedNodeP2_Sub6) aClass366_4567.method3992((byte) 112)) {
	    if (argument_19_ != null) {
		for (int anLocalInt = 0; anLocalInt < argument_19_.length;
		     anLocalInt++) {
		    if ((((DoublyLinkedNodeP2_Sub6) class104_sub6).aClass38_4542
			 == argument_19_[anLocalInt])
			|| (((DoublyLinkedNodeP2_Sub6) class104_sub6).aClass38_4542
			    == (((Class38) argument_19_[anLocalInt])
				.aClass38_278))) {
			aBooleanArray4562[anLocalInt] = true;
			class104_sub6.method1916((byte) -94);
			((DoublyLinkedNodeP2_Sub6) class104_sub6).aBoolean4545 = false;
			continue while_116_;
		    }
		}
	    }
	    if (!argument_20_) {
		if (((DoublyLinkedNodeP2_Sub6) class104_sub6).anInt4548 == 0) {
		    class104_sub6.unlink();
		    anInt4568--;
		} else
		    ((DoublyLinkedNodeP2_Sub6) class104_sub6).aBoolean4545 = true;
	    }
	}
	if (argument_19_ != null) {
	    for (int anLocalInt = 0; anLocalInt < argument_19_.length;
		 anLocalInt++) {
		if (anLocalInt == 32 || anInt4568 == 32)
		    break;
		if (!aBooleanArray4562[anLocalInt]) {
		    DoublyLinkedNodeP2_Sub6 class104_sub6
			= new DoublyLinkedNodeP2_Sub6(argument_18_,
					    argument_19_[anLocalInt], this,
					    aLong4566);
		    aClass366_4567.method3983(class104_sub6, (byte) 119);
		    anInt4568++;
		    aBooleanArray4562[anLocalInt] = true;
		}
	    }
	}
    }
    
    private final void method1934() {
	aBoolean4560 = false;
    }
    
    private final void method1935(int argument_21_, boolean argument_22_) {
	Statics.aClass366_5518.method3983(this, (byte) 119);
	aLong4566 = (long) argument_21_;
	aLong4565 = (long) argument_21_;
	aBoolean4573 = true;
	((DoublyLinkedNodeP2_Sub7) this).aBoolean4571 = argument_22_;
    }
    
    final Class72 method1936() {
	((Class72) ((DoublyLinkedNodeP2_Sub7) this).aClass72_4572).aClass119_497
	    .method2380(32362);
	for (int anLocalInt = 0;
	     anLocalInt < (((DoublyLinkedNodeP2_Sub7) this)
			   .aClass104_Sub4_Sub1_Sub1Array4559).length;
	     anLocalInt++) {
	    if ((((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		 [anLocalInt]) != null
		&& ((DoublyLinkedNodeP2_Sub4_Sub1_Sub1)
		    (((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		     [anLocalInt])).aClass104_Sub6_6824 != null)
		((Class72) ((DoublyLinkedNodeP2_Sub7) this).aClass72_4572)
		    .aClass119_497.method2377
		    ((byte) 45,
		     (((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
		      [anLocalInt]));
	}
	return ((DoublyLinkedNodeP2_Sub7) this).aClass72_4572;
    }
    
    private DoublyLinkedNodeP2_Sub7(int argument_23_, boolean argument_24_) {
	aBoolean4560 = false;
	((DoublyLinkedNodeP2_Sub7) this).anInt4564 = 0;
	aClass366_4567 = new Class366();
	anInt4568 = 0;
	((DoublyLinkedNodeP2_Sub7) this).aCyclicLinkedList_4569 = new CyclicLinkedList();
	((DoublyLinkedNodeP2_Sub7) this).aBoolean4571 = false;
	aBoolean4573 = false;
	anInt4574 = 0;
	((DoublyLinkedNodeP2_Sub7) this).aClass72_4572 = new Class72();
	((DoublyLinkedNodeP2_Sub7) this).aClass104_Sub4_Sub1_Sub1Array4559
	    = new DoublyLinkedNodeP2_Sub4_Sub1_Sub1[8192];
	method1935(argument_23_, argument_24_);
    }
}
