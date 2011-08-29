/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class78
{
    private int anInt535 = 0;
    private int anInt536 = -1;
    private int anInt537;
    private Class367 aClass367_538;
    private byte aByte539;
    private boolean aBoolean540;
    private Class120 aClass120_541;
    private boolean aBoolean542;
    private int anInt543 = 0;
    DoublyLinkedNodeP2_Sub7 aClass104_Sub7_544;
    int anInt545;
    private int anInt546;
    private int anInt547;
    int anInt548;
    private DoublyLinkedNodeP2_Sub2 aClass104_Sub2_549;
    private tia_sub_35DoublyLinked aTia_sub_35_550;
    static Class166 aClass166_551;
    private int anInt552;
    static long[] aLongArray553 = new long[32];
    private byte aByte554;
    int anInt555;
    private boolean[] aBooleanArray556;
    private int anInt557;
    private boolean aBoolean558;
    private int anInt559;
    private Class167 aClass167_560;
    
    final Class167 method1566(boolean argument_0_, GraphicsToolkit argument_1_,
			      boolean argument_2_, int argument_3_,
			      boolean argument_4_) {
	Class266 class266
	    = Node_Sub31_Sub30.aClass257_5983
		  .method3298((byte) 83, ((Class78) this).anInt545);
	if (((Class266) class266).anIntArray2067 != null)
	    class266
		= class266.method3345(1,
				      ClientVariables.instance);
	if (class266 == null) {
	    method1575(13959, argument_1_);
	    anInt537 = -1;
	    anInt536 = -1;
	    anInt557 = -1;
	    return null;
	}
	if (!aBoolean558 && ((Class266) class266).anInt2059 != anInt536) {
	    aClass167_560 = null;
	    method1571(-1, -1);
	}
	method1570(aClass104_Sub2_549, 1);
	if (argument_2_) {
	    argument_2_
		= argument_2_ & (aBoolean540
				 & ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				       .aClass62_Sub8_4331
				       .method1388(21) != 0);
	    argument_2_
		= (argument_2_
		   & (((Class266) class266).anInt2059 != anInt557
		      || (aClass367_538 != null
			  && ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				 .aClass62_Sub8_4331.method1388(77) >= 2
			  && (anInt537 != anInt559
			      || ((((Class367) aClass367_538).aBoolean3098
				   || Node_Sub31_Sub9.aBoolean5877)
				  && anInt546 != anInt559)))));
	}
	if (argument_4_ && !argument_2_) {
	    anInt536 = ((Class266) class266).anInt2059;
	    return null;
	}
	if (argument_2_) {
	    Node_Sub21.method731(aTia_sub_35_550, aByte539,
                (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
                        .worldX),
                (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
                        .worldZ),
                aBooleanArray556);
	    anInt557 = -1;
	    anInt537 = -1;
	}
	Class_s class_s = Node_Sub31_Sub5.aClass_sArray5858[aByte539];
	Class_s class_s_5_;
	if (!aBoolean542)
	    class_s_5_
		= (aByte539 >= 3 ? null
		   : Node_Sub31_Sub5.aClass_sArray5858[aByte539 + 1]);
	else
	    class_s_5_ = Statics.aClass_sArray2713[0];
	Class167 class167 = null;
	if (aClass367_538 != null) {
	    if (argument_2_)
		argument_3_ |= 0x40000;
	    class167
		= (class266.method3344
		   ((((Class78) this).anInt548 == 11 ? 10
		     : ((Class78) this).anInt548),
		    aClass367_538, (byte) -54, argument_3_,
		    (((Class78) this).anInt548 != 11
		     ? ((Class78) this).anInt555
		     : ((Class78) this).anInt555 + 4),
		    class_s_5_, ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldX,
		    aClass120_541, anInt546, anInt559, class_s,
		    ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldZ,
		    class_s.method3541((((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
					.worldZ),
				       0,
				       (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
					.worldX)),
		    anInt552, argument_1_));
	    if (class167 == null) {
		aTia_sub_35_550 = null;
		anInt543 = 0;
		anInt535 = 0;
		aBooleanArray556 = null;
	    } else {
		if (argument_2_) {
		    if (aBooleanArray556 == null)
			aBooleanArray556 = new boolean[4];
		    aTia_sub_35_550 = class167.ba(aTia_sub_35_550);
		    Statics.method1777(aTia_sub_35_550, aByte539, ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldX, ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldZ, aBooleanArray556);
		    anInt557 = ((Class266) class266).anInt2059;
		    anInt537 = anInt559;
		}
		anInt543 = class167.fa();
		anInt535 = class167.ma();
	    }
	    aClass167_560 = null;
	} else if (aClass167_560 == null
		   || argument_3_ != (argument_3_ & aClass167_560.ua())
		   || ((Class266) class266).anInt2059 != anInt536) {
	    if (aClass167_560 != null)
		argument_3_ |= aClass167_560.ua();
	    Class118 class118
		= (class266.method3334
		   (class_s.method3541((((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
					.worldZ),
				       0,
				       (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
					.worldX)),
		    class_s_5_,
		    (((Class78) this).anInt548 == 11
		     ? ((Class78) this).anInt555 + 4
		     : ((Class78) this).anInt555),
		    class_s, aClass120_541,
		    (((Class78) this).anInt548 != 11
		     ? ((Class78) this).anInt548 : 10),
		    argument_3_, argument_2_,
		    ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldX, (byte) 53,
		    ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldZ,
		    argument_1_));
	    if (class118 != null) {
		aClass167_560 = class167 = ((Class118) class118).aClass167_969;
		if (argument_2_) {
		    aTia_sub_35_550 = ((Class118) class118).aTia_sub_35_968;
		    aBooleanArray556 = null;
		    Statics.method1777(aTia_sub_35_550, aByte539, ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldX, ((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549).worldZ, null);
		    anInt557 = ((Class266) class266).anInt2059;
		    anInt537 = -1;
		}
		anInt543 = class167.fa();
		anInt535 = class167.ma();
	    } else {
		anInt535 = 0;
		anInt543 = 0;
		aTia_sub_35_550 = null;
		aClass167_560 = null;
		aBooleanArray556 = null;
	    }
	} else
	    class167 = aClass167_560;
	anInt536 = ((Class266) class266).anInt2059;
	return class167;
    }
    
    static final void method1567(byte argument,
				 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_6_,
				 int[] argument_7_, int argument_8_) {
	if (((Entity) argument_6_).anIntArray6735 != null) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0;
		 (((Entity) argument_6_).anIntArray6735.length
		  > anLocalInt);
		 anLocalInt++) {
		if (argument_7_[anLocalInt]
		    != (((Entity) argument_6_).anIntArray6735
			[anLocalInt])) {
		    anLocalBoolean = false;
		    break;
		}
	    }
	    if (anLocalBoolean
		&& ((Entity) argument_6_).anInt6754 != -1) {
		Class367 class367
		    = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
		       (((Entity) argument_6_).anInt6754, 0));
		int anLocalInt = ((Class367) class367).anInt3106;
		if (anLocalInt == 1) {
		    ((Entity) argument_6_).anInt6747 = 0;
		    ((Entity) argument_6_).anInt6755
			= argument_8_;
		    ((Entity) argument_6_).anInt6740 = 0;
		    ((Entity) argument_6_).anInt6787 = 1;
		    ((Entity) argument_6_).anInt6732 = 0;
		    if (!((Entity) argument_6_).aBoolean6751)
			Class313.method3622(argument_6_, 0, class367,
					    ((Entity)
					     argument_6_).anInt6732);
		}
		if (anLocalInt == 2)
		    ((Entity) argument_6_).anInt6747 = 0;
	    }
	}
	boolean anLocalBoolean = true;
	for (int anLocalInt = 0; argument_7_.length > anLocalInt;
	     anLocalInt++) {
	    if (argument_7_[anLocalInt] != -1)
		anLocalBoolean = false;
	    if (((Entity) argument_6_).anIntArray6735 == null
		|| (((Entity) argument_6_).anIntArray6735
		    [anLocalInt]) == -1
		|| ((((Class367) DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
				     .method3758(argument_7_[anLocalInt], 0))
		     .anInt3099)
		    >= ((Class367) (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
					.method3758
				    ((((Entity) argument_6_)
				      .anIntArray6735[anLocalInt]),
				     0))).anInt3099)) {
		((Entity) argument_6_).anIntArray6735
		    = argument_7_;
		((Entity) argument_6_).anInt6755
		    = argument_8_;
		break;
	    }
	}
	if (anLocalBoolean) {
	    ((Entity) argument_6_).anInt6755 = argument_8_;
	    ((Entity) argument_6_).anIntArray6735
		= argument_7_;
	}
    }
    
    final int method1568(byte argument_9_) {
	return anInt543;
    }
    
    final int method1569(byte argument_10_) {
	return anInt535;
    }
    
    private final void method1570(DoublyLinkedNodeP2_Sub2 argument_11_,
				  int argument_12_) {
	if (argument_12_ != 1)
	    finalize();
	int anLocalInt;
    while_48_:
	for (;;) {
	    if (aClass367_538 == null) {
		if (aBoolean558)
		    return;
		method1571(-1, -1);
		if (aClass367_538 == null)
		    return;
	    }
	    anLocalInt = -anInt547 + Class333.anInt2720;
	    if (anLocalInt > 100 && ((Class367) aClass367_538).anInt3109 > 0) {
		int anLocalInt_13_;
		for (anLocalInt_13_ = (-((Class367) aClass367_538).anInt3109
				       + (((Class367) aClass367_538)
					  .anIntArray3096).length);
		     (anLocalInt_13_ > anInt559
		      && anLocalInt > (((Class367) aClass367_538)
				       .anIntArray3094[anInt559]));
		     anInt559++)
		    anLocalInt
			-= ((Class367) aClass367_538).anIntArray3094[anInt559];
		if (anInt559 >= anLocalInt_13_) {
		    int anLocalInt_14_ = 0;
		    for (int anLocalInt_15_ = anLocalInt_13_;
			 (((Class367) aClass367_538).anIntArray3096.length
			  > anLocalInt_15_);
			 anLocalInt_15_++)
			anLocalInt_14_ += (((Class367) aClass367_538)
					   .anIntArray3094[anLocalInt_15_]);
		    anLocalInt %= anLocalInt_14_;
		}
		anInt546 = anInt559 + 1;
		if (anInt546
		    >= ((Class367) aClass367_538).anIntArray3096.length) {
		    anInt546 -= ((Class367) aClass367_538).anInt3109;
		    if (anInt546 < 0
			|| (((Class367) aClass367_538).anIntArray3096.length
			    <= anInt546))
			anInt546 = -1;
		}
	    }
	    for (;;) {
		if (((Class367) aClass367_538).anIntArray3094[anInt559]
		    >= anLocalInt)
		    break while_48_;
		Class313.method3622(argument_11_, 0, aClass367_538, anInt559);
		anLocalInt
		    -= ((Class367) aClass367_538).anIntArray3094[anInt559];
		anInt559++;
		if (anInt559
		    >= ((Class367) aClass367_538).anIntArray3096.length) {
		    anInt559 -= ((Class367) aClass367_538).anInt3109;
		    if (anInt559 < 0
			|| (((Class367) aClass367_538).anIntArray3096.length
			    <= anInt559)) {
			aClass367_538 = null;
			break;
		    }
		}
		anInt546 = anInt559 + 1;
		if (((Class367) aClass367_538).anIntArray3096.length
		    <= anInt546) {
		    anInt546 -= ((Class367) aClass367_538).anInt3109;
		    if (anInt546 < 0
			|| (((Class367) aClass367_538).anIntArray3096.length
			    <= anInt546))
			anInt546 = -1;
		}
	    }
	}
	anInt552 = anLocalInt;
	anInt547 = -anLocalInt + Class333.anInt2720;
    }
    
    private final void method1571(int argument_16_, int argument_17_) {
	int anLocalInt = argument_17_;
	boolean anLocalBoolean = false;
	if (anLocalInt == -1) {
	    Class266 class266
		= Node_Sub31_Sub30.aClass257_5983
		      .method3298((byte) 44, ((Class78) this).anInt545);
	    Class266 class266_18_ = class266;
	    if (((Class266) class266).anIntArray2067 != null)
		class266 = class266.method3345(argument_16_ + 2,
					       (ClientVariables
						.instance));
	    if (class266 == null)
		return;
	    if (class266 == class266_18_)
		class266_18_ = null;
	    if (((Class266) class266).anIntArray2063 != null) {
		if (aClass367_538 != null
		    && class266.method3350(4, (((Class367) aClass367_538)
					       .anInt3104)))
		    return;
		anLocalInt = class266.method3346(argument_16_ - 31734);
		if (anInt536 != ((Class266) class266).anInt2059)
		    anLocalBoolean = ((Class266) class266).aBoolean2133;
	    } else if (((Class266) class266).anInt2055 == -1) {
		if (class266_18_ != null
		    && ((Class266) class266_18_).anIntArray2063 != null) {
		    if (aClass367_538 != null
			&& class266_18_.method3350(-24,
						   (((Class367) aClass367_538)
						    .anInt3104)))
			return;
		    anLocalInt = class266_18_.method3346(-31735);
		    if (anInt536 != ((Class266) class266_18_).anInt2059)
			anLocalBoolean
			    = ((Class266) class266_18_).aBoolean2133;
		} else if (class266_18_ != null
			   && ((Class266) class266_18_).anInt2055 != -1
			   && (anInt536
			       != ((Class266) class266_18_).anInt2059)) {
		    anLocalInt = ((Class266) class266_18_).anInt2055;
		    anLocalBoolean = ((Class266) class266_18_).aBoolean2133;
		}
	    } else if (anInt536 != ((Class266) class266).anInt2059) {
		anLocalBoolean = ((Class266) class266).aBoolean2133;
		anLocalInt = ((Class266) class266).anInt2055;
	    }
	}
	if (anLocalInt == -1)
	    aClass367_538 = null;
	else {
	    aClass167_560 = null;
	    if (aClass367_538 != null
		&& anLocalInt == ((Class367) aClass367_538).anInt3104) {
		if (((Class367) aClass367_538).anInt3106 == 0)
		    return;
	    } else
		aClass367_538
		    = DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(anLocalInt,
								   0);
	    if (((Class367) aClass367_538).anIntArray3096 == null)
		aClass367_538 = null;
	    else {
		if (!anLocalBoolean) {
		    anInt559 = 0;
		    anInt552 = 1;
		} else {
		    anInt559 = (int) ((double) (((Class367) aClass367_538)
						.anIntArray3096).length
				      * Math.random());
		    anInt552 = (int) ((double) (((Class367) aClass367_538)
						.anIntArray3094[anInt559])
				      * Math.random()) + 1;
		}
		anInt546 = anInt559 - argument_16_;
		if (anInt546 < 0 || anInt546 >= (((Class367) aClass367_538)
						 .anIntArray3096).length)
		    anInt546 = -1;
		anInt547 = -anInt552 + Class333.anInt2720;
	    }
	}
    }
    
    final void method1572(int argument_19_, Class120 argument_20_) {
	aClass167_560 = null;
	aClass120_541 = argument_20_;
    }
    
    final void method1573(GraphicsToolkit argument_21_, boolean argument_22_,
			  int argument_23_, int argument_24_, int argument_25_,
			  int argument_26_, Class350 argument_27_,
			  Class167 argument_28_, byte argument_29_) {
	Class38[] class38s = argument_28_.method2641();
	Class185[] class185s = argument_28_.method2655();
	if ((((Class78) this).aClass104_Sub7_544 == null
	     || (((DoublyLinkedNodeP2_Sub7) ((Class78) this).aClass104_Sub7_544)
		 .aBoolean4563))
	    && (class38s != null || class185s != null)) {
	    Class266 class266
		= Node_Sub31_Sub30.aClass257_5983
		      .method3298((byte) 47, ((Class78) this).anInt545);
	    if (((Class266) class266).anIntArray2067 != null)
		class266 = class266.method3345(1, (ClientVariables
						   .instance));
	    if (class266 != null)
		((Class78) this).aClass104_Sub7_544
		    = DoublyLinkedNodeP2_Sub7.method1931(Class333.anInt2720, true);
	}
	if (((Class78) this).aClass104_Sub7_544 != null) {
	    argument_28_.method2656(argument_27_);
	    if (argument_22_)
		((Class78) this).aClass104_Sub7_544.method1925
		    (argument_21_, (long) Class333.anInt2720, class38s,
		     class185s, false);
	    else
		((Class78) this).aClass104_Sub7_544
		    .method1922((long) Class333.anInt2720);
	    ((Class78) this).aClass104_Sub7_544.method1929(aByte554,
							   argument_26_,
							   argument_23_,
							   argument_25_,
							   argument_24_);
	}
    }
    
    public static void method1574(boolean argument) {
	aLongArray553 = null;
	aClass166_551 = null;
    }
    
    final void method1575(int argument_30_, GraphicsToolkit argument_31_) {
	if (aTia_sub_35_550 != null) {
	    Node_Sub21.method731(aTia_sub_35_550, aByte539,
                (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
                        .worldX),
                (((DoublyLinkedNodeP2_Sub2) aClass104_Sub2_549)
                        .worldZ),
                aBooleanArray556);
	    aBooleanArray556 = null;
	    aTia_sub_35_550 = null;
	}
	if (argument_30_ != 13959)
	    aBooleanArray556 = null;
    }
    
    final void method1576(int argument_32_, boolean argument_33_) {
	aBoolean558 = true;
	method1571(-1, argument_32_);
    }
    
    final boolean method1577(int argument_34_) {
	return aBoolean540;
    }
    
    protected final void finalize() {
	if (((Class78) this).aClass104_Sub7_544 != null)
	    ((Class78) this).aClass104_Sub7_544.method1930();
    }
    
    final void method1578(byte argument_35_, GraphicsToolkit argument_36_) {
	method1566(true, argument_36_, true, 262144, true);
    }
    
    Class78(GraphicsToolkit argument_37_, Class266 argument_38_, int argument_39_,
	    int argument_40_, int argument_41_, int argument_42_,
	    DoublyLinkedNodeP2_Sub2 argument_43_, boolean argument_44_,
	    int argument_45_) {
	aBoolean542 = false;
	anInt537 = -1;
	aBoolean558 = false;
	anInt557 = -1;
	aClass104_Sub2_549 = argument_43_;
	aBoolean542 = argument_44_;
	((Class78) this).anInt548 = argument_39_;
	aByte554 = (byte) argument_41_;
	aByte539 = (byte) argument_42_;
	((Class78) this).anInt545 = ((Class266) argument_38_).anInt2059;
	((Class78) this).anInt555 = argument_40_;
	aBoolean540
	    = (argument_37_.method2038()
	       && ((Class266) argument_38_).aBoolean2130 && !aBoolean542);
	if (argument_45_ != -1)
	    aBoolean558 = true;
	method1571(-1, argument_45_);
    }
    
    static {
	aClass166_551 = new Class166(4, 7);
    }
}
