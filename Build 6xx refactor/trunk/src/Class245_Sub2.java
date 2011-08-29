/* Class245_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class245_Sub2 extends Class245
{
    private int anInt5308;
    private int anInt5309;
    static Class85 aClass85_5310 = new Class85();
    private int anInt5311;
    private int anInt5313;
    private int anInt5314;
    static int anInt5315;
    private int anInt5316;
    private byte[] aByteArray5317;
    private int anInt5318;
    private int anInt5319;
    
    final void method3171(int argument_0_, int argument_1_, int argument_2_) {
	if (argument_2_ == argument_0_) {
	    anInt5309
		= -(argument_1_ >= 0 ? argument_1_ : -argument_1_) + anInt5311;
	    anInt5309 = anInt5309 * anInt5309 >> 12;
	    anInt5314 = 4096;
	    anInt5308 = anInt5309;
	} else {
	    anInt5314 = anInt5309 * anInt5318 >> 12;
	    anInt5309
		= anInt5311 - (argument_1_ < 0 ? -argument_1_ : argument_1_);
	    if (anInt5314 < 0)
		anInt5314 = 0;
	    else if (anInt5314 > 4096)
		anInt5314 = 4096;
	    anInt5309 = anInt5309 * anInt5309 >> 12;
	    anInt5309 = anInt5309 * anInt5314 >> 12;
	    anInt5308 += anInt5319 * anInt5309 >> 12;
	    anInt5319 = anInt5313 * anInt5319 >> 12;
	}
    }
    
    static final void method3187(DoublyLinkedNodeP2_Sub2[] argument, int argument_3_,
				 int argument_4_) {
	if (argument_3_ < argument_4_) {
	    int anLocalInt = (argument_3_ + argument_4_) / 2;
	    int anLocalInt_5_ = argument_3_;
	    DoublyLinkedNodeP2_Sub2 class104_sub2 = argument[anLocalInt];
	    argument[anLocalInt] = argument[argument_4_];
	    argument[argument_4_] = class104_sub2;
	    int anLocalInt_6_ = ((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4516;
	    for (int anLocalInt_7_ = argument_3_; anLocalInt_7_ < argument_4_;
		 anLocalInt_7_++) {
		if (((DoublyLinkedNodeP2_Sub2) argument[anLocalInt_7_]).anInt4516
		    < anLocalInt_6_ + (anLocalInt_7_ & 0x1)) {
		    DoublyLinkedNodeP2_Sub2 class104_sub2_8_ = argument[anLocalInt_7_];
		    argument[anLocalInt_7_] = argument[anLocalInt_5_];
		    argument[anLocalInt_5_++] = class104_sub2_8_;
		}
	    }
	    argument[argument_4_] = argument[anLocalInt_5_];
	    argument[anLocalInt_5_] = class104_sub2;
	    method3187(argument, argument_3_, anLocalInt_5_ - 1);
	    method3187(argument, anLocalInt_5_ + 1, argument_4_);
	}
    }
    
    public static void method3188(int argument) {
	client.js5client = null;
	aClass85_5310 = null;
    }
    
    void method3189(boolean argument_9_, int argument_10_, byte argument_11_) {
	aByteArray5317[argument_10_] = argument_11_;
	if (argument_9_ != true)
	    anInt5315 = -30;
    }
    
    static final void method3190(int argument) {
	for (DoublyLinkedNodeP2_Sub5 class104_sub5
		 = (DoublyLinkedNodeP2_Sub5) Class70.aClass366_481.method3988((byte) -7);
	     class104_sub5 != null;
	     class104_sub5
		 = (DoublyLinkedNodeP2_Sub5) Class70.aClass366_481.method3988((byte) -7))
	    Node_Sub33.method1037(class104_sub5, 56);
	int anLocalInt;
	int anLocalInt_12_;
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub25_4332.method1458(60)
	    != 1)
	    anLocalInt_12_ = anLocalInt = Statics.anInt136;
	else {
	    anLocalInt = 3;
	    anLocalInt_12_ = 0;
	}
	client.method106();
	for (int anLocalInt_13_ = anLocalInt_12_; anLocalInt_13_ <= anLocalInt;
	     anLocalInt_13_++) {
	    client.method109();
	    client.method117(anLocalInt_13_);
	    client.method111(anLocalInt_13_);
	}
	client.method116();
	client.method120();
    }
    
    static final boolean method3191(int argument, int argument_14_,
				    byte argument_15_) {
	if (!Class168.method2729(argument, false, argument_14_))
	    return false;
	if (Class178.method2798((byte) -29, argument, argument_14_)
	    | (argument & 0x9000) != 0
	    | Class46.method435(-1, argument_14_, argument))
	    return true;
	return ((argument_14_ & 0x37) == 0
		& (DoublyLinkedNode_Sub51_Sub8.method1232((byte) -84, argument, argument_14_)
		   | (argument & 0x2000) != 0
		   | Statics.method549(argument, argument_14_, true)));
    }
    
    Class245_Sub2(int argument_16_, int argument_17_, int argument_18_,
		  int argument_19_, int argument_20_, float argument_21_,
		  float argument_22_, float argument_23_) {
	super(argument_16_, argument_17_, argument_18_, argument_19_,
	      argument_20_);
	anInt5311 = (int) (argument_22_ * 4096.0F);
	anInt5318 = (int) (argument_23_ * 4096.0F);
	anInt5319 = anInt5313
	    = (int) (Math.pow(0.5, (double) -argument_21_) * 4096.0);
    }
    
    static final void method3192
	(int argument, int argument_24_,
	 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument_25_, Class266 argument_26_,
	 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_27_, int argument_28_,
	 int argument_29_, int argument_30_) {
	Node_Sub13 class59_sub13 = new Node_Sub13();
	((Node_Sub13) class59_sub13).anInt3981 = argument << 9;
	((Node_Sub13) class59_sub13).anInt3969 = argument_24_ << 9;
	((Node_Sub13) class59_sub13).anInt3973 = argument_30_;
	if (argument_26_ != null) {
	    ((Node_Sub13) class59_sub13).aClass266_3951 = argument_26_;
	    int anLocalInt = ((Class266) argument_26_).anInt2128;
	    int anLocalInt_31_ = ((Class266) argument_26_).anInt2131;
	    if (argument_28_ == 1 || argument_28_ == 3) {
		anLocalInt = ((Class266) argument_26_).anInt2131;
		anLocalInt_31_ = ((Class266) argument_26_).anInt2128;
	    }
	    ((Node_Sub13) class59_sub13).anInt3972
		= ((Class266) argument_26_).anInt2132 << 9;
	    ((Node_Sub13) class59_sub13).anInt3980
		= ((Class266) argument_26_).anInt2114;
	    ((Node_Sub13) class59_sub13).anInt3955
		= argument_24_ + anLocalInt_31_ << 9;
	    ((Node_Sub13) class59_sub13).anInt3964
		= ((Class266) argument_26_).anInt2081 << 9;
	    ((Node_Sub13) class59_sub13).anInt3952
		= ((Class266) argument_26_).anInt2095;
	    ((Node_Sub13) class59_sub13).anInt3970
		= ((Class266) argument_26_).anInt2109;
	    ((Node_Sub13) class59_sub13).anInt3950
		= ((Class266) argument_26_).anInt2110;
	    ((Node_Sub13) class59_sub13).aBoolean3961
		= ((Class266) argument_26_).aBoolean2116;
	    ((Node_Sub13) class59_sub13).anInt3965
		= ((Class266) argument_26_).anInt2113;
	    ((Node_Sub13) class59_sub13).anInt3962
		= argument + anLocalInt << 9;
	    ((Node_Sub13) class59_sub13).anIntArray3975
		= ((Class266) argument_26_).anIntArray2108;
	    ((Node_Sub13) class59_sub13).anInt3960
		= ((Class266) argument_26_).anInt2097;
	    ((Node_Sub13) class59_sub13).aBoolean3953
		= ((Class266) argument_26_).aBoolean2080;
	    if (((Class266) argument_26_).anIntArray2067 != null) {
		((Node_Sub13) class59_sub13).aBoolean3979 = true;
		class59_sub13.method691((byte) 31);
	    }
	    if (((Node_Sub13) class59_sub13).anIntArray3975 != null)
		((Node_Sub13) class59_sub13).anInt3957
		    = ((int) (Math.random()
			      * (double) (-(((Node_Sub13) class59_sub13)
					    .anInt3980)
					  + (((Node_Sub13) class59_sub13)
					     .anInt3960)))
		       + ((Node_Sub13) class59_sub13).anInt3980);
	    Class76.aCyclicLinkedList_519.add(class59_sub13);
	} else if (argument_25_ != null) {
	    ((Node_Sub13) class59_sub13).aClass104_Sub2_Sub2_Sub5_Sub1_3974
		= argument_25_;
	    Class291 class291
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_25_).aClass291_6832;
	    if (((Class291) class291).anIntArray2374 != null) {
		((Node_Sub13) class59_sub13).aBoolean3979 = true;
		class291 = class291.method3485((ClientVariables
						.instance),
					       -1);
	    }
	    if (class291 != null) {
		((Node_Sub13) class59_sub13).anInt3955
		    = argument_24_ + ((Class291) class291).anInt2344 << 9;
		((Node_Sub13) class59_sub13).anInt3962
		    = ((Class291) class291).anInt2344 + argument << 9;
		((Node_Sub13) class59_sub13).anInt3950
		    = DoublyLinkedNode_Sub51_Sub18.method1290(argument_25_, -98);
		((Node_Sub13) class59_sub13).anInt3964
		    = ((Class291) class291).anInt2358 << 9;
		((Node_Sub13) class59_sub13).anInt3972
		    = ((Class291) class291).anInt2346 << 9;
		((Node_Sub13) class59_sub13).anInt3970
		    = ((Class291) class291).anInt2356;
		((Node_Sub13) class59_sub13).anInt3952
		    = ((Class291) class291).anInt2331;
		((Node_Sub13) class59_sub13).anInt3965
		    = ((Class291) class291).anInt2335;
		((Node_Sub13) class59_sub13).aBoolean3953
		    = ((Class291) class291).aBoolean2365;
	    }
	    Node_Sub31_Sub8.aCyclicLinkedList_5872.add(class59_sub13);
	} else if (argument_27_ != null) {
	    ((Node_Sub13) class59_sub13).aClass104_Sub2_Sub2_Sub5_Sub2_3967
		= argument_27_;
	    ((Node_Sub13) class59_sub13).anInt3962
		= argument_27_.method1830(-128) + argument << 9;
	    ((Node_Sub13) class59_sub13).anInt3955
		= argument_27_.method1830(-125) + argument_24_ << 9;
	    ((Node_Sub13) class59_sub13).anInt3950
		= Class169.method2731((byte) -109, argument_27_);
	    ((Node_Sub13) class59_sub13).anInt3972
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_27_).anInt6863 << 9;
	    ((Node_Sub13) class59_sub13).aBoolean3953
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_27_).aBoolean6857;
	    ((Node_Sub13) class59_sub13).anInt3965 = 256;
	    ((Node_Sub13) class59_sub13).anInt3952
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_27_).anInt6871;
	    ((Node_Sub13) class59_sub13).anInt3970 = 256;
	    ((Node_Sub13) class59_sub13).anInt3964 = 0;
	    Class299.aJagexHashMap_2496.put((long) ((Entity) argument_27_).anInt6745, class59_sub13);
	}
    }
    
    final void method3173(int argument_32_) {
	if (argument_32_ != 29373)
	    anInt5316 = -63;
	anInt5308 = 0;
	anInt5316 = 0;
    }
    
    final void method3169(int argument_33_) {
	anInt5308 >>= 4;
	anInt5319 = anInt5313;
	if (anInt5308 >= 0) {
	    if (anInt5308 > 255)
		anInt5308 = 255;
	} else
	    anInt5308 = 0;
	method3189(true, anInt5316++, (byte) anInt5308);
	anInt5308 = 0;
	if (argument_33_ != 1029024876)
	    client.js5client = null;
    }
}
