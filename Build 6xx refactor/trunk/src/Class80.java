/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class80
{
    int anInt567;
    private int anInt568;
    static Class166 aClass166_569;
    private int anInt570;
    private int anInt571;
    int anInt572;
    int anInt573;
    static boolean aBoolean574 = false;
    private int anInt575;
    int anInt576;
    int anInt577;
    int anInt578;
    static int anInt579;
    
    static final void method1585(int argument, int argument_0_,
				 Entity argument_1_) {
	int anLocalInt = -1;
	int anLocalInt_2_ = 0;
	if (Class333.anInt2720
	    < ((Entity) argument_1_).anInt6762)
	    Node_Sub20.method718(127, argument_1_);
	else if (((Entity) argument_1_).anInt6737
		 >= Class333.anInt2720)
	    Statics.method3468((byte) 75, argument_1_);
	else {
	    Entity.method1828(true, argument_1_, false);
	    anLocalInt_2_ = Class_aa_Sub1.anInt3748;
	    anLocalInt = Class55.anInt408;
	}
	if (((DoublyLinkedNodeP2_Sub2) argument_1_).worldX < 512
	    || ((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ < 512
	    || (((DoublyLinkedNodeP2_Sub2) argument_1_).worldX
		>= MapRelated.mapWidth * 512 - 512)
	    || (MapRelated.mapDepth * 512 - 512
		<= ((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ)) {
	    ((Entity) argument_1_).anInt6737 = 0;
	    ((Entity) argument_1_).anInt6762 = 0;
	    anLocalInt = -1;
	    anLocalInt_2_ = 0;
	    ((Entity) argument_1_).anIntArray6735 = null;
	    ((Entity) argument_1_).anInt6754 = -1;
	    ((DoublyLinkedNodeP2_Sub2) argument_1_).worldX
		= (((Entity) argument_1_).pathX[0]
		   * 512) + argument_1_.method1830(-126) * 256;
	    ((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ
		= (((Entity) argument_1_).pathZ[0]
		   * 512) + argument_1_.method1830(-128) * 256;
	    argument_1_.method1835(100);
	    for (int anLocalInt_3_ = 0;
		 anLocalInt_3_ < (((Entity) argument_1_)
				  .aClass269Array6759).length;
		 anLocalInt_3_++)
		((Class269) (((Entity) argument_1_)
			     .aClass269Array6759[anLocalInt_3_])).anInt2150
		    = -1;
	}
	if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 == argument_1_
	    && (((DoublyLinkedNodeP2_Sub2) argument_1_).worldX < 6144
		|| ((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ < 6144
		|| (((DoublyLinkedNodeP2_Sub2) argument_1_).worldX
		    >= MapRelated.mapWidth * 512 - 6144)
		|| (((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ
		    >= MapRelated.mapDepth * 512 - 6144))) {
	    ((Entity) argument_1_).anInt6737 = 0;
	    anLocalInt = -1;
	    anLocalInt_2_ = 0;
	    ((Entity) argument_1_).anInt6762 = 0;
	    ((Entity) argument_1_).anInt6754 = -1;
	    ((Entity) argument_1_).anIntArray6735 = null;
	    ((DoublyLinkedNodeP2_Sub2) argument_1_).worldX
		= (((Entity) argument_1_).pathX[0]
		   * 512) + argument_1_.method1830(-128) * 256;
	    ((DoublyLinkedNodeP2_Sub2) argument_1_).worldZ
		= (((Entity) argument_1_).pathZ[0]
		   * 512) + argument_1_.method1830(-126) * 256;
	    argument_1_.method1835(-81);
	    for (int anLocalInt_4_ = 0;
		 anLocalInt_4_ < (((Entity) argument_1_)
				  .aClass269Array6759).length;
		 anLocalInt_4_++)
		((Class269) (((Entity) argument_1_)
			     .aClass269Array6759[anLocalInt_4_])).anInt2150
		    = -1;
	}
	int anLocalInt_5_ = Class46_Sub2.method443(argument_1_, -21);
	Node_Sub31_Sub35.method987(-126, argument_1_);
	Class62_Sub16.method1420((byte) 69, anLocalInt_5_, argument_1_,
				 anLocalInt, anLocalInt_2_);
	Class123.method2395(argument_1_, anLocalInt, -25478);
	Node_Sub2.method532(argument_1_, -1);
    }
    
    static final void method1586(int argument) {
	for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++)
	    Class291.aBooleanArray2366[anLocalInt] = false;
	Class146.anInt1111 = -1;
	Class76.anInt516 = -1;
	DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
	Class47.anInt336 = 0;
	Class391.anInt3291 = 0;
	Statics.anInt1745 = 1;
    }
    
    public static void method1587(int argument) {
	aClass166_569 = null;
    }
    
    final void method1588(int argument_6_, int argument_7_, int argument_8_,
			  int argument_9_, int argument_10_, int argument_11_,
			  int argument_12_, int argument_13_, int argument_14_,
			  int argument_15_, int argument_16_) {
	anInt575 = argument_12_ * argument_12_;
	anInt568 = argument_14_;
	anInt570 = argument_15_;
	anInt571 = argument_7_;
	((Class80) this).anInt567 = anInt568 + argument_13_;
	((Class80) this).anInt577 = anInt570 + argument_11_;
	((Class80) this).anInt572 = anInt570 + argument_16_;
	((Class80) this).anInt576 = argument_9_ + anInt568;
	((Class80) this).anInt578 = anInt571 + argument_6_;
	((Class80) this).anInt573 = anInt571 + argument_10_;
    }
    
    final boolean method1589(int argument_17_, int argument_18_,
			     byte argument_19_, int argument_20_) {
	if (((Class80) this).anInt567 > argument_20_
	    || ((Class80) this).anInt576 < argument_20_)
	    return false;
	if (argument_18_ < ((Class80) this).anInt578
	    || ((Class80) this).anInt573 < argument_18_)
	    return false;
	if (argument_17_ < ((Class80) this).anInt577
	    || ((Class80) this).anInt572 < argument_17_)
	    return false;
	int anLocalInt = argument_20_ - anInt568;
	int anLocalInt_21_ = -anInt570 + argument_17_;
	if (anInt575
	    <= anLocalInt_21_ * anLocalInt_21_ + anLocalInt * anLocalInt)
	    return false;
	return true;
    }
    
    static final void method1590(int argument, Packet argument_22_) {
	int anLocalInt = argument_22_.gsmart(argument ^ ~0x1);
	Node_Sub37_Sub2.aClass168Array6121 = new Class168[anLocalInt];
	for (int anLocalInt_23_ = argument; anLocalInt_23_ < anLocalInt;
	     anLocalInt_23_++) {
	    Node_Sub37_Sub2.aClass168Array6121[anLocalInt_23_]
		= new Class168();
	    ((Class168) Node_Sub37_Sub2.aClass168Array6121[anLocalInt_23_])
		.anInt1231
		= argument_22_.gsmart(argument ^ ~0x1);
	    ((Class168) Node_Sub37_Sub2.aClass168Array6121[anLocalInt_23_])
		.aString1232
		= argument_22_.gjstr2();
	}
	DoublyLinkedNode_Sub51_Sub10.anInt5585 = argument_22_.gsmart(argument - 2);
	Class62_Sub25.anInt4444 = argument_22_.gsmart(-2);
	Class141.anInt1100 = argument_22_.gsmart(-2);
	Statics.aClass84_Sub1Array6752
	    = (new Class84_Sub1
	       [-DoublyLinkedNode_Sub51_Sub10.anInt5585 + Class62_Sub25.anInt4444 + 1]);
	for (int anLocalInt_24_ = 0; Class141.anInt1100 > anLocalInt_24_;
	     anLocalInt_24_++) {
	    int anLocalInt_25_ = argument_22_.gsmart(-2);
	    Class84_Sub1 class84_sub1
		= (Statics.aClass84_Sub1Array6752
		       [anLocalInt_25_]
		   = new Class84_Sub1());
	    ((Class84) class84_sub1).anInt598
		= argument_22_.g1();
	    ((Class84) class84_sub1).anInt595 = argument_22_.g4();
	    ((Class84_Sub1) class84_sub1).anInt4481
		= DoublyLinkedNode_Sub51_Sub10.anInt5585 + anLocalInt_25_;
	    ((Class84_Sub1) class84_sub1).aString4478
		= argument_22_.gjstr2();
	    ((Class84_Sub1) class84_sub1).aString4482
		= argument_22_.gjstr2();
	}
	Class46_Sub1.anInt3836 = argument_22_.g4();
	Class183.aBoolean1381 = true;
    }
    
    Class80(int argument_26_, int argument_27_, int argument_28_,
	    int argument_29_, int argument_30_, int argument_31_,
	    int argument_32_, int argument_33_, int argument_34_,
	    int argument_35_) {
	anInt568 = argument_26_;
	anInt570 = argument_28_;
	anInt571 = argument_27_;
	anInt575 = argument_29_ * argument_29_;
	((Class80) this).anInt577 = anInt570 + argument_34_;
	((Class80) this).anInt572 = argument_35_ + anInt570;
	((Class80) this).anInt578 = anInt571 + argument_32_;
	((Class80) this).anInt576 = argument_31_ + anInt568;
	((Class80) this).anInt573 = anInt571 + argument_33_;
	((Class80) this).anInt567 = anInt568 + argument_30_;
    }
    
    static {
	aClass166_569 = new Class166(79, -1);
    }
}
