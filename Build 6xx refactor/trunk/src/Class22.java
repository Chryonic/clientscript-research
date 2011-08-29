/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22
{
    boolean aBoolean137;
    private long aLong139;
    static int anInt140;
    private int[] anIntArray141;
    static TextureSource anTextureSource_142;
    int anInt143 = -1;
    static int[][] anIntArrayArray146
	= { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 },
	    { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 },
	    { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 },
	    { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    private Class4[] aClass4Array147;
    private long aLong148;
    private int anInt149;
    int[] anIntArray150;
    
    final void method324(Class365 argument_0_, byte argument_1_,
			 int argument_2_, int argument_3_) {
	if (argument_3_ == -1)
	    anIntArray141[argument_2_] = 0;
	else if (argument_0_.method3975(26, argument_3_) != null) {
	    anIntArray141[argument_2_]
		= MathStatics.OR(1073741824, argument_3_);
	    method327((byte) -103);
	}
    }
    
    final Class167 method325
	(Class383 argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int argument_9_, byte argument_10_,
	 Class336 argument_11_, int argument_12_, int argument_13_,
	 Class367 argument_14_, GraphicsToolkit argument_15_) {
	int anLocalInt = argument_7_;
	if (argument_14_ != null) {
	    boolean anLocalBoolean = false;
	    boolean anLocalBoolean_16_ = false;
	    boolean anLocalBoolean_17_ = false;
	    boolean anLocalBoolean_18_ = false;
	    int anLocalInt_19_ = -1;
	    int anLocalInt_20_ = -1;
	    Object object = null;
	    Object object_21_ = null;
	    anLocalInt_19_
		= ((Class367) argument_14_).anIntArray3096[argument_12_];
	    anLocalInt |= 0x20;
	    int anLocalInt_22_ = anLocalInt_19_ >>> 16;
	    anLocalInt_19_ &= 0xffff;
	    DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6
		= argument_11_.method3754(-4849, anLocalInt_22_);
	    if (class59_sub51_sub6 != null) {
		anLocalBoolean_16_
		    |= class59_sub51_sub6.method1205((byte) -114,
						     anLocalInt_19_);
		anLocalBoolean
		    |= class59_sub51_sub6.method1206(false, anLocalInt_19_);
		anLocalBoolean_18_
		    |= class59_sub51_sub6.method1204(anLocalInt_19_, -1);
		anLocalBoolean_17_ |= ((Class367) argument_14_).aBoolean3112;
	    }
	    if ((((Class367) argument_14_).aBoolean3110
		 || Node_Sub31_Sub9.aBoolean5877)
		&& argument_9_ != -1
		&& (argument_9_
		    < ((Class367) argument_14_).anIntArray3096.length)) {
		anLocalInt_20_
		    = ((Class367) argument_14_).anIntArray3096[argument_9_];
		int anLocalInt_23_ = anLocalInt_20_ >>> 16;
		anLocalInt_20_ &= 0xffff;
		DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_24_;
		if (anLocalInt_22_ == anLocalInt_23_)
		    class59_sub51_sub6_24_ = class59_sub51_sub6;
		else
		    class59_sub51_sub6_24_
			= argument_11_.method3754(-4849,
						  anLocalInt_20_ >>> 16);
		if (class59_sub51_sub6_24_ != null) {
		    anLocalBoolean_16_
			|= class59_sub51_sub6_24_.method1205((byte) -114,
							     anLocalInt_20_);
		    anLocalBoolean
			|= class59_sub51_sub6_24_.method1206(false,
							     anLocalInt_20_);
		    anLocalBoolean_18_
			|= class59_sub51_sub6_24_.method1204(anLocalInt_20_,
							     -1);
		}
	    }
	    if (anLocalBoolean_16_)
		anLocalInt |= 0x80;
	    if (anLocalBoolean)
		anLocalInt |= 0x100;
	    if (anLocalBoolean_17_)
		anLocalInt |= 0x200;
	    if (anLocalBoolean_18_)
		anLocalInt |= 0x400;
	}
	long l = ((long) argument_13_
		  | ((long) (argument_8_ << 16) | (long) argument_6_ << 32));
	Class167 class167;
	synchronized (Class165.aClass149_1210) {
	    class167 = (Class167) Class165.aClass149_1210.get(l);
	}
	if (class167 == null
	    || argument_15_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt
		    = argument_15_.or(anLocalInt, class167.ua());
	    int anLocalInt_25_ = anLocalInt;
	    Class101[] class101s = new Class101[3];
	    int anLocalInt_26_ = 0;
	    if (!argument_4_.method4114(argument_13_, 2).method1728(true)
		|| !argument_4_.method4114(argument_8_, 2).method1728(true)
		|| !argument_4_.method4114(argument_6_, 2).method1728(true))
		return null;
	    Class101 class101
		= argument_4_.method4114(argument_13_, 2).method1727(-13439);
	    if (class101 != null)
		class101s[anLocalInt_26_++] = class101;
	    class101
		= argument_4_.method4114(argument_8_, 2).method1727(-13439);
	    if (class101 != null)
		class101s[anLocalInt_26_++] = class101;
	    class101
		= argument_4_.method4114(argument_6_, 2).method1727(-13439);
	    if (class101 != null)
		class101s[anLocalInt_26_++] = class101;
	    anLocalInt_25_ |= 0x4000;
	    class101 = new Class101(class101s, anLocalInt_26_);
	    class167
		= argument_15_.method2057(class101, anLocalInt_25_,
					  Class62_Sub21.anInt4432, 64, 768);
	    for (int anLocalInt_27_ = 0; anLocalInt_27_ < 5;
		 anLocalInt_27_++) {
		for (int anLocalInt_28_ = 0;
		     Statics.aShortArrayArrayArray270.length > anLocalInt_28_;
		     anLocalInt_28_++) {
		    if (((Class22) this).anIntArray150[anLocalInt_27_]
			< (Statics.aShortArrayArrayArray270[anLocalInt_28_]
			   [anLocalInt_27_]).length)
			class167.ia((Class42.aShortArrayArray3543
				     [anLocalInt_28_][anLocalInt_27_]),
				    (Statics.aShortArrayArrayArray270
				     [anLocalInt_28_][anLocalInt_27_]
				     [(((Class22) this).anIntArray150
				       [anLocalInt_27_])]));
		}
	    }
	    class167.s(anLocalInt);
	    synchronized (Class165.aClass149_1210) {
		Class165.aClass149_1210.put(class167, l);
	    }
	}
	if (argument_14_ == null)
	    return class167;
	class167 = class167.method2651((byte) 4, anLocalInt, true);
	class167
	    = argument_14_.method4000(argument_5_, class167, false,
				      argument_9_, argument_7_, argument_12_);
	return class167;
    }
    
    final void method326(boolean argument_29_, int argument_30_,
			 int argument_31_, byte argument_32_,
			 int[] argument_33_, int[] argument_34_,
			 Class4[] argument_35_) {
	((Class22) this).anInt143 = argument_30_;
	((Class22) this).aBoolean137 = argument_29_;
	anIntArray141 = argument_33_;
	if (argument_31_ != anInt149)
	    anInt149 = argument_31_;
	((Class22) this).anIntArray150 = argument_34_;
	aClass4Array147 = argument_35_;
	method327((byte) -93);
    }
    
    private final void method327(byte argument_36_) {
	aLong148 = -1L;
	long[] ls = Class1.aLongArray3504;
	aLong148
	    = aLong148 >>> 8 ^ ls[(int) ((aLong148 ^ (long) (anInt149 >> 8))
					 & 0xffL)];
	aLong148 = (ls[(int) (((long) anInt149 ^ aLong148) & 0xffL)]
		    ^ aLong148 >>> 8);
	if (argument_36_ > -92)
	    method325(null, -6, -94, -3, -59, -95, (byte) 33, null, -103, 97,
		      null, null);
	for (int anLocalInt = 0; anIntArray141.length > anLocalInt;
	     anLocalInt++) {
	    aLong148 = ls[(int) (((long) (anIntArray141[anLocalInt] >> 24)
				  ^ aLong148)
				 & 0xffL)] ^ aLong148 >>> 8;
	    aLong148
		= (aLong148 >>> 8
		   ^ ls[(int) ((aLong148
				^ (long) (anIntArray141[anLocalInt] >> 16))
			       & 0xffL)]);
	    aLong148 = ls[(int) ((aLong148
				  ^ (long) (anIntArray141[anLocalInt] >> 8))
				 & 0xffL)] ^ aLong148 >>> 8;
	    aLong148 = ls[(int) (((long) anIntArray141[anLocalInt] ^ aLong148)
				 & 0xffL)] ^ aLong148 >>> 8;
	}
	if (aClass4Array147 != null) {
	    for (int anLocalInt = 0; aClass4Array147.length > anLocalInt;
		 anLocalInt++) {
		if (aClass4Array147[anLocalInt] != null) {
		    int[] anLocalInts;
		    int[] anLocalInts_37_;
		    if (((Class22) this).aBoolean137) {
			anLocalInts = (((Class4) aClass4Array147[anLocalInt])
				       .anIntArray62);
			anLocalInts_37_
			    = (((Class4) aClass4Array147[anLocalInt])
			       .anIntArray63);
		    } else {
			anLocalInts = (((Class4) aClass4Array147[anLocalInt])
				       .anIntArray57);
			anLocalInts_37_
			    = (((Class4) aClass4Array147[anLocalInt])
			       .anIntArray58);
		    }
		    if (anLocalInts_37_ != null) {
			for (int anLocalInt_38_ = 0;
			     anLocalInts_37_.length > anLocalInt_38_;
			     anLocalInt_38_++) {
			    aLong148 = (aLong148 >>> 8
					^ ls[(int) (((long) ((anLocalInts_37_
							      [anLocalInt_38_])
							     >> 8)
						     ^ aLong148)
						    & 0xffL)]);
			    aLong148 = ls[(int) ((aLong148
						  ^ (long) (anLocalInts_37_
							    [anLocalInt_38_]))
						 & 0xffL)] ^ aLong148 >>> 8;
			}
		    }
		    if (anLocalInts != null) {
			for (int anLocalInt_39_ = 0;
			     anLocalInt_39_ < anLocalInts.length;
			     anLocalInt_39_++) {
			    aLong148 = ls[(int) ((aLong148
						  ^ (long) ((anLocalInts
							     [anLocalInt_39_])
							    >> 8))
						 & 0xffL)] ^ aLong148 >>> 8;
			    aLong148 = ls[(int) ((aLong148
						  ^ (long) (anLocalInts
							    [anLocalInt_39_]))
						 & 0xffL)] ^ aLong148 >>> 8;
			}
		    }
		    if (((Class4) aClass4Array147[anLocalInt]).aShortArray61
			!= null) {
			for (int anLocalInt_40_ = 0;
			     ((((Class4) aClass4Array147[anLocalInt])
			       .aShortArray61).length
			      > anLocalInt_40_);
			     anLocalInt_40_++) {
			    aLong148 = ls[(int) (((long) ((((Class4)
							    (aClass4Array147
							     [anLocalInt]))
							   .aShortArray61
							   [anLocalInt_40_])
							  >> 8)
						  ^ aLong148)
						 & 0xffL)] ^ aLong148 >>> 8;
			    aLong148
				= (aLong148 >>> 8
				   ^ ls[(int) ((aLong148
						^ (long) (((Class4)
							   (aClass4Array147
							    [anLocalInt]))
							  .aShortArray61
							  [anLocalInt_40_]))
					       & 0xffL)]);
			}
		    }
		    if (((Class4) aClass4Array147[anLocalInt]).aShortArray64
			!= null) {
			for (int anLocalInt_41_ = 0;
			     (anLocalInt_41_
			      < (((Class4) aClass4Array147[anLocalInt])
				 .aShortArray64).length);
			     anLocalInt_41_++) {
			    aLong148 = (aLong148 >>> 8
					^ ls[(int) (((long) ((((Class4)
							       (aClass4Array147
								[anLocalInt]))
							      .aShortArray64
							      [anLocalInt_41_])
							     >> 8)
						     ^ aLong148)
						    & 0xffL)]);
			    aLong148
				= (aLong148 >>> 8
				   ^ ls[(int) ((aLong148
						^ (long) (((Class4)
							   (aClass4Array147
							    [anLocalInt]))
							  .aShortArray64
							  [anLocalInt_41_]))
					       & 0xffL)]);
			}
		    }
		}
	    }
	}
	for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++)
	    aLong148
		= ls[(int) (((long) ((Class22) this).anIntArray150[anLocalInt]
			     ^ aLong148)
			    & 0xffL)] ^ aLong148 >>> 8;
	aLong148 = ls[(int) ((aLong148
			      ^ (long) (((Class22) this).aBoolean137 ? 1 : 0))
			     & 0xffL)] ^ aLong148 >>> 8;
    }
    
    final Class167 method328
	(Class367 argument_42_, Class26 argument_43_, int argument_44_,
	 Class383 argument_45_, GraphicsToolkit argument_46_, int argument_47_,
	 VariableValueSource argument_48_, boolean argument_49_, int argument_50_,
	 int argument_51_, Class336 argument_52_, Class365 argument_53_) {
	if (((Class22) this).anInt143 != -1)
	    return (argument_43_.method343
			((byte) 117, ((Class22) this).anInt143).method3487
		    (argument_44_, (byte) -32, argument_50_, argument_47_,
		     argument_48_, argument_46_, null, argument_52_,
		     argument_51_, argument_42_));
	int anLocalInt = argument_50_;
	if (argument_42_ != null) {
	    boolean anLocalBoolean = false;
	    boolean anLocalBoolean_54_ = false;
	    boolean anLocalBoolean_55_ = false;
	    boolean anLocalBoolean_56_ = false;
	    int anLocalInt_57_ = -1;
	    int anLocalInt_58_ = -1;
	    Object object = null;
	    anLocalInt_57_
		= ((Class367) argument_42_).anIntArray3096[argument_51_];
	    Object object_59_ = null;
	    anLocalInt |= 0x20;
	    int anLocalInt_60_ = anLocalInt_57_ >>> 16;
	    anLocalInt_57_ &= 0xffff;
	    DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6
		= argument_52_.method3754(-4849, anLocalInt_60_);
	    if (class59_sub51_sub6 != null) {
		anLocalBoolean_54_
		    |= class59_sub51_sub6.method1205((byte) -114,
						     anLocalInt_57_);
		anLocalBoolean
		    |= class59_sub51_sub6.method1206(false, anLocalInt_57_);
		anLocalBoolean_56_
		    |= class59_sub51_sub6.method1204(anLocalInt_57_, -1);
		anLocalBoolean_55_ |= ((Class367) argument_42_).aBoolean3112;
	    }
	    if ((((Class367) argument_42_).aBoolean3110
		 || Node_Sub31_Sub9.aBoolean5877)
		&& argument_47_ != -1
		&& (((Class367) argument_42_).anIntArray3096.length
		    > argument_47_)) {
		anLocalInt_58_
		    = ((Class367) argument_42_).anIntArray3096[argument_47_];
		int anLocalInt_61_ = anLocalInt_58_ >>> 16;
		anLocalInt_58_ &= 0xffff;
		DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_62_
		    = (anLocalInt_60_ == anLocalInt_61_ ? class59_sub51_sub6
		       : argument_52_.method3754(-4849, anLocalInt_61_));
		if (class59_sub51_sub6_62_ != null) {
		    anLocalBoolean_54_
			|= class59_sub51_sub6_62_.method1205((byte) -114,
							     anLocalInt_58_);
		    anLocalBoolean
			|= class59_sub51_sub6_62_.method1206(false,
							     anLocalInt_58_);
		    anLocalBoolean_56_
			|= class59_sub51_sub6_62_.method1204(anLocalInt_58_,
							     -1);
		}
	    }
	    if (anLocalBoolean_54_)
		anLocalInt |= 0x80;
	    if (anLocalBoolean)
		anLocalInt |= 0x100;
	    if (anLocalBoolean_55_)
		anLocalInt |= 0x200;
	    if (anLocalBoolean_56_)
		anLocalInt |= 0x400;
	}
	Class167 class167;
	synchronized (Class165.aClass149_1210) {
	    class167
		= (Class167) Class165.aClass149_1210.get(aLong148);
	}
	if (class167 == null
	    || argument_46_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt
		    = argument_46_.or(anLocalInt, class167.ua());
	    int anLocalInt_63_ = anLocalInt;
	    boolean anLocalBoolean = false;
	    for (int anLocalInt_64_ = 0; anIntArray141.length > anLocalInt_64_;
		 anLocalInt_64_++) {
		int anLocalInt_65_ = anIntArray141[anLocalInt_64_];
		Class4 class4 = null;
		if ((anLocalInt_65_ & 0x40000000) != 0) {
		    if (aClass4Array147 != null
			&& aClass4Array147[anLocalInt_64_] != null)
			class4 = aClass4Array147[anLocalInt_64_];
		    if (!argument_53_.method3975
			     (122, anLocalInt_65_ & 0x3fffffff).method4064
			 (((Class22) this).aBoolean137, class4, (byte) 118))
			anLocalBoolean = true;
		} else if ((anLocalInt_65_ & ~0x7fffffff) != 0
			   && !argument_45_.method4114
				   (anLocalInt_65_ & 0x3fffffff, 2)
				   .method1728(true))
		    anLocalBoolean = true;
	    }
	    if (anLocalBoolean)
		return null;
	    Class101[] class101s = new Class101[anIntArray141.length];
	    int anLocalInt_66_ = 0;
	    for (int anLocalInt_67_ = 0; anIntArray141.length > anLocalInt_67_;
		 anLocalInt_67_++) {
		int anLocalInt_68_ = anIntArray141[anLocalInt_67_];
		Class4 class4 = null;
		if ((anLocalInt_68_ & 0x40000000) != 0) {
		    if (aClass4Array147 != null
			&& aClass4Array147[anLocalInt_67_] != null)
			class4 = aClass4Array147[anLocalInt_67_];
		    Class101 class101
			= (argument_53_.method3975
			       (122, anLocalInt_68_ & 0x3fffffff).method4058
			   (!argument_49_, ((Class22) this).aBoolean137,
			    class4));
		    if (class101 != null)
			class101s[anLocalInt_66_++] = class101;
		} else if ((anLocalInt_68_ & ~0x7fffffff) != 0) {
		    Class101 class101 = argument_45_.method4114
					    (anLocalInt_68_ & 0x3fffffff, 2)
					    .method1727(-13439);
		    if (class101 != null)
			class101s[anLocalInt_66_++] = class101;
		}
	    }
	    anLocalInt_63_ |= 0x4000;
	    Class101 class101 = new Class101(class101s, anLocalInt_66_);
	    class167
		= argument_46_.method2057(class101, anLocalInt_63_,
					  Class62_Sub21.anInt4432, 64, 768);
	    for (int anLocalInt_69_ = 0; anLocalInt_69_ < 5;
		 anLocalInt_69_++) {
		for (int anLocalInt_70_ = 0;
		     anLocalInt_70_ < Statics.aShortArrayArrayArray270.length;
		     anLocalInt_70_++) {
		    if ((Statics.aShortArrayArrayArray270[anLocalInt_70_]
			 [anLocalInt_69_]).length
			> ((Class22) this).anIntArray150[anLocalInt_69_])
			class167.ia((Class42.aShortArrayArray3543
				     [anLocalInt_70_][anLocalInt_69_]),
				    (Statics.aShortArrayArrayArray270
				     [anLocalInt_70_][anLocalInt_69_]
				     [(((Class22) this).anIntArray150
				       [anLocalInt_69_])]));
		}
	    }
	    class167.s(anLocalInt);
	    synchronized (Class165.aClass149_1210) {
		Class165.aClass149_1210.put(class167, aLong148);
	    }
	}
	if (argument_42_ == null)
	    return class167;
	Class167 class167_71_
	    = class167.method2651((byte) 4, anLocalInt, true);
	class167_71_ = argument_42_.method4000(argument_44_, class167,
					       argument_49_, argument_47_,
					       argument_50_, argument_51_);
	return class167_71_;
    }
    
    final void method329(int argument_72_, Class383 argument_73_,
			 boolean argument_74_, int argument_75_) {
	int anLocalInt = Class257.anIntArray2010[argument_75_];
	if (argument_73_.method4114(argument_72_, 2) != null) {
	    anIntArray141[anLocalInt]
		= MathStatics.OR(argument_72_, -2147483648);
	    method327((byte) -112);
	}
    }
    
    final void method330(int argument_76_, byte argument_77_,
			 int argument_78_) {
	((Class22) this).anIntArray150[argument_76_] = argument_78_;
	method327((byte) -120);
    }
    
    public static void method331(boolean argument) {
	anTextureSource_142 = null;
	client.lobbyServer = null;
	anIntArrayArray146 = null;
	client.store33 = null;
    }
    
    public Class22() {
	/* empty */
    }
    
    final void method332(boolean argument_79_, byte argument_80_) {
	((Class22) this).aBoolean137 = argument_79_;
	method327((byte) -125);
    }
    
    final Class167 method333
	(Class336 argument_81_, Class41 argument_82_, VariableValueSource argument_83_,
	 int argument_84_, Class383 argument_85_, Class26 argument_86_,
	 Class365 argument_87_, int argument_88_, int argument_89_,
	 int argument_90_, byte argument_91_, Class91[] argument_92_,
	 int argument_93_, Class367 argument_94_, int argument_95_,
	 Class367 argument_96_, GraphicsToolkit argument_97_, int argument_98_,
	 boolean argument_99_, int argument_100_, int[] argument_101_) {
	if (((Class22) this).anInt143 != -1)
	    return (argument_86_.method343
			((byte) 100, ((Class22) this).anInt143).method3493
		    (argument_94_, argument_83_, argument_84_, argument_97_,
		     argument_92_, argument_81_, argument_90_, argument_101_,
		     argument_82_, argument_88_, argument_98_, null, 82,
		     argument_95_, argument_96_, argument_93_, argument_89_,
		     argument_100_));
	int anLocalInt = argument_93_;
	long l = aLong148;
	int[] anLocalInts = anIntArray141;
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_102_ = false;
	if (argument_94_ != null
	    && (((Class367) argument_94_).anInt3107 >= 0
		|| ((Class367) argument_94_).anInt3097 >= 0)) {
	    anLocalInts = new int[anIntArray141.length];
	    for (int anLocalInt_103_ = 0; anLocalInt_103_ < anLocalInts.length;
		 anLocalInt_103_++)
		anLocalInts[anLocalInt_103_] = anIntArray141[anLocalInt_103_];
	    if (((Class367) argument_94_).anInt3107 >= 0) {
		if (((Class367) argument_94_).anInt3107 != 65535) {
		    anLocalInts[5]
			= MathStatics.OR(((Class367) argument_94_).anInt3107, 1073741824);
		    l ^= (long) anLocalInts[5] << 32;
		} else {
		    anLocalBoolean = true;
		    l ^= ~0xffffffffL;
		    anLocalInts[5] = 0;
		}
	    }
	    if (((Class367) argument_94_).anInt3097 >= 0) {
		if (((Class367) argument_94_).anInt3097 == 65535) {
		    anLocalInts[3] = 0;
		    l ^= 0xffffffffL;
		} else {
		    anLocalInts[3]
			= MathStatics.OR(1073741824, (((Class367) argument_94_).anInt3097));
		    l ^= (long) anLocalInts[3];
		}
		anLocalBoolean_102_ = true;
	    }
	}
	boolean anLocalBoolean_104_ = false;
	boolean anLocalBoolean_105_ = false;
	boolean anLocalBoolean_106_ = false;
	boolean anLocalBoolean_107_
	    = argument_94_ != null || argument_96_ != null;
	int anLocalInt_108_ = argument_92_ == null ? 0 : argument_92_.length;
	for (int anLocalInt_109_ = 0; anLocalInt_109_ < anLocalInt_108_;
	     anLocalInt_109_++) {
	    Statics.aClass59_Sub51_Sub6Array4360[anLocalInt_109_] = null;
	    if (argument_92_[anLocalInt_109_] != null) {
		Class367 class367
		    = argument_81_.method3758((((Class91)
						argument_92_[anLocalInt_109_])
					       .anInt704),
					      0);
		if (((Class367) class367).anIntArray3096 != null) {
		    Class199.aClass367Array1445[anLocalInt_109_] = class367;
		    anLocalBoolean_107_ = true;
		    int anLocalInt_110_
			= ((Class91) argument_92_[anLocalInt_109_]).anInt698;
		    int anLocalInt_111_
			= ((Class91) argument_92_[anLocalInt_109_]).anInt700;
		    int anLocalInt_112_ = (((Class367) class367).anIntArray3096
					   [anLocalInt_110_]);
		    Statics.aClass59_Sub51_Sub6Array4360[anLocalInt_109_]
			= argument_81_.method3754(-4849,
						  anLocalInt_112_ >>> 16);
		    anLocalInt_112_ &= 0xffff;
		    Node_Sub32_Sub3.anIntArray6084[anLocalInt_109_]
			= anLocalInt_112_;
		    if ((Statics.aClass59_Sub51_Sub6Array4360
			 [anLocalInt_109_])
			!= null) {
			anLocalBoolean_105_
			    |= Statics.aClass59_Sub51_Sub6Array4360
				   [anLocalInt_109_]
				   .method1205((byte) -114, anLocalInt_112_);
			anLocalBoolean_104_
			    |= Statics.aClass59_Sub51_Sub6Array4360
				   [anLocalInt_109_]
				   .method1206(false, anLocalInt_112_);
			anLocalBoolean_106_
			    |= Statics.aClass59_Sub51_Sub6Array4360
				   [anLocalInt_109_]
				   .method1204(anLocalInt_112_, -1);
		    }
		    if ((((Class367) class367).aBoolean3110
			 || Node_Sub31_Sub9.aBoolean5877)
			&& anLocalInt_111_ != -1
			&& (anLocalInt_111_
			    < ((Class367) class367).anIntArray3096.length)) {
			Class320.anIntArray2634[anLocalInt_109_]
			    = (((Class367) class367).anIntArray3094
			       [anLocalInt_110_]);
			Class26.anIntArray173[anLocalInt_109_]
			    = (((Class91) argument_92_[anLocalInt_109_])
			       .anInt702);
			int anLocalInt_113_
			    = (((Class367) class367).anIntArray3096
			       [anLocalInt_111_]);
			Class85.aClass59_Sub51_Sub6Array603[anLocalInt_109_]
			    = argument_81_.method3754(-4849,
						      anLocalInt_113_ >>> 16);
			anLocalInt_113_ &= 0xffff;
			Class245_Sub1_Sub1.anIntArray6516[anLocalInt_109_]
			    = anLocalInt_113_;
			if ((Class85.aClass59_Sub51_Sub6Array603
			     [anLocalInt_109_])
			    != null) {
			    anLocalBoolean_105_
				|= (Class85.aClass59_Sub51_Sub6Array603
					[anLocalInt_109_].method1205
				    ((byte) -114, anLocalInt_113_));
			    anLocalBoolean_104_
				|= Class85.aClass59_Sub51_Sub6Array603
				       [anLocalInt_109_]
				       .method1206(false, anLocalInt_113_);
			    anLocalBoolean_106_
				|= Class85.aClass59_Sub51_Sub6Array603
				       [anLocalInt_109_]
				       .method1204(anLocalInt_113_, -1);
			}
		    } else {
			Class320.anIntArray2634[anLocalInt_109_] = 0;
			Class26.anIntArray173[anLocalInt_109_] = 0;
			Class85.aClass59_Sub51_Sub6Array603[anLocalInt_109_]
			    = null;
			Class245_Sub1_Sub1.anIntArray6516[anLocalInt_109_]
			    = -1;
		    }
		}
	    }
	}
	int anLocalInt_114_ = -1;
	int anLocalInt_115_ = -1;
	int anLocalInt_116_ = 0;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6 = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_117_ = null;
	int anLocalInt_118_ = -1;
	int anLocalInt_119_ = -1;
	int anLocalInt_120_ = 0;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_121_ = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_122_ = null;
	if (anLocalBoolean_107_) {
	    if (argument_94_ != null) {
		anLocalInt_114_
		    = ((Class367) argument_94_).anIntArray3096[argument_84_];
		int anLocalInt_123_ = anLocalInt_114_ >>> 16;
		anLocalInt_114_ &= 0xffff;
		class59_sub51_sub6
		    = argument_81_.method3754(-4849, anLocalInt_123_);
		if (class59_sub51_sub6 != null) {
		    anLocalBoolean_105_
			|= class59_sub51_sub6.method1205((byte) -114,
							 anLocalInt_114_);
		    anLocalBoolean_104_
			|= class59_sub51_sub6.method1206(false,
							 anLocalInt_114_);
		    anLocalBoolean_106_
			|= class59_sub51_sub6.method1204(anLocalInt_114_, -1);
		}
		if ((((Class367) argument_94_).aBoolean3110
		     || Node_Sub31_Sub9.aBoolean5877)
		    && argument_88_ != -1
		    && (argument_88_
			< ((Class367) argument_94_).anIntArray3096.length)) {
		    anLocalInt_115_ = (((Class367) argument_94_).anIntArray3096
				       [argument_88_]);
		    anLocalInt_116_ = (((Class367) argument_94_).anIntArray3094
				       [argument_84_]);
		    int anLocalInt_124_ = anLocalInt_115_ >>> 16;
		    class59_sub51_sub6_117_
			= (anLocalInt_124_ == anLocalInt_123_
			   ? class59_sub51_sub6
			   : argument_81_.method3754(-4849, anLocalInt_124_));
		    anLocalInt_115_ &= 0xffff;
		    if (class59_sub51_sub6_117_ != null) {
			anLocalBoolean_105_
			    |= class59_sub51_sub6_117_
				   .method1205((byte) -114, anLocalInt_115_);
			anLocalBoolean_104_
			    |= class59_sub51_sub6_117_
				   .method1206(false, anLocalInt_115_);
			anLocalBoolean_106_
			    |= class59_sub51_sub6_117_
				   .method1204(anLocalInt_115_, -1);
		    }
		}
	    }
	    anLocalInt |= 0x20;
	    if (argument_96_ != null) {
		anLocalInt_118_
		    = ((Class367) argument_96_).anIntArray3096[argument_90_];
		int anLocalInt_125_ = anLocalInt_118_ >>> 16;
		class59_sub51_sub6_121_
		    = argument_81_.method3754(-4849, anLocalInt_125_);
		anLocalInt_118_ &= 0xffff;
		if (class59_sub51_sub6_121_ != null) {
		    anLocalBoolean_105_
			|= class59_sub51_sub6_121_.method1205((byte) -114,
							      anLocalInt_118_);
		    anLocalBoolean_104_
			|= class59_sub51_sub6_121_.method1206(false,
							      anLocalInt_118_);
		    anLocalBoolean_106_
			|= class59_sub51_sub6_121_.method1204(anLocalInt_118_,
							      -1);
		}
		if ((((Class367) argument_96_).aBoolean3110
		     || Node_Sub31_Sub9.aBoolean5877)
		    && argument_89_ != -1
		    && (argument_89_
			< ((Class367) argument_96_).anIntArray3096.length)) {
		    anLocalInt_120_ = (((Class367) argument_96_).anIntArray3094
				       [argument_90_]);
		    anLocalInt_119_ = (((Class367) argument_96_).anIntArray3096
				       [argument_89_]);
		    int anLocalInt_126_ = anLocalInt_119_ >>> 16;
		    class59_sub51_sub6_122_
			= (anLocalInt_125_ != anLocalInt_126_
			   ? argument_81_.method3754(-4849, anLocalInt_126_)
			   : class59_sub51_sub6_121_);
		    anLocalInt_119_ &= 0xffff;
		    if (class59_sub51_sub6_122_ != null) {
			anLocalBoolean_105_
			    |= class59_sub51_sub6_122_
				   .method1205((byte) -114, anLocalInt_119_);
			anLocalBoolean_104_
			    |= class59_sub51_sub6_122_
				   .method1206(false, anLocalInt_119_);
			anLocalBoolean_106_
			    |= class59_sub51_sub6_122_
				   .method1204(anLocalInt_119_, -1);
		    }
		}
	    }
	    if (anLocalBoolean_105_)
		anLocalInt |= 0x80;
	    if (anLocalBoolean_104_)
		anLocalInt |= 0x100;
	    if (anLocalBoolean_106_)
		anLocalInt |= 0x400;
	}
	Class167 class167;
	synchronized (Node_Sub38.aClass149_4190) {
	    class167
		= (Class167) Node_Sub38.aClass149_4190.get(l);
	}
	Class354 class354 = null;
	if (anInt149 != -1)
	    class354 = argument_82_.method421((byte) -75, anInt149);
	if (class167 == null
	    || argument_97_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt
		    = argument_97_.or(anLocalInt, class167.ua());
	    int anLocalInt_127_ = anLocalInt;
	    boolean anLocalBoolean_128_ = false;
	    for (int anLocalInt_129_ = 0; anLocalInt_129_ < anLocalInts.length;
		 anLocalInt_129_++) {
		int anLocalInt_130_ = anLocalInts[anLocalInt_129_];
		Class4 class4 = null;
		boolean anLocalBoolean_131_
		    = (anLocalInt_129_ == 5 && anLocalBoolean
		       || anLocalInt_129_ == 3 && anLocalBoolean_102_);
		if ((anLocalInt_130_ & 0x40000000) == 0) {
		    if ((anLocalInt_130_ & ~0x7fffffff) != 0
			&& !argument_85_.method4114
				(anLocalInt_130_ & 0x3fffffff, 2)
				.method1723(126))
			anLocalBoolean_128_ = true;
		} else {
		    if (!anLocalBoolean_131_ && aClass4Array147 != null
			&& aClass4Array147[anLocalInt_129_] != null)
			class4 = aClass4Array147[anLocalInt_129_];
		    if (!argument_87_.method3975
			     (-66, anLocalInt_130_ & 0x3fffffff).method4062
			 (((Class22) this).aBoolean137, -1, class4))
			anLocalBoolean_128_ = true;
		}
	    }
	    if (!anLocalBoolean_128_) {
		Class101[] class101s = new Class101[anLocalInts.length];
		for (int anLocalInt_132_ = 0;
		     anLocalInt_132_ < anLocalInts.length; anLocalInt_132_++) {
		    int anLocalInt_133_ = anLocalInts[anLocalInt_132_];
		    Class4 class4 = null;
		    boolean anLocalBoolean_134_
			= (anLocalInt_132_ == 5 && anLocalBoolean
			   || anLocalInt_132_ == 3 && anLocalBoolean_102_);
		    if ((anLocalInt_133_ & 0x40000000) == 0) {
			if ((anLocalInt_133_ & ~0x7fffffff) != 0) {
			    Class101 class101
				= argument_85_.method4114
				      (anLocalInt_133_ & 0x3fffffff, 2)
				      .method1729(true);
			    if (class101 != null)
				class101s[anLocalInt_132_] = class101;
			}
		    } else {
			if (!anLocalBoolean_134_ && aClass4Array147 != null
			    && aClass4Array147[anLocalInt_132_] != null)
			    class4 = aClass4Array147[anLocalInt_132_];
			Class101 class101
			    = (argument_87_.method3975
				   (-3, anLocalInt_133_ & 0x3fffffff)
				   .method4048
			       (class4, ((Class22) this).aBoolean137, 76));
			if (class101 != null)
			    class101s[anLocalInt_132_] = class101;
		    }
		}
		if (class354 != null
		    && ((Class354) class354).anIntArrayArray2958 != null) {
		    for (int anLocalInt_135_ = 0;
			 (anLocalInt_135_
			  < ((Class354) class354).anIntArrayArray2958.length);
			 anLocalInt_135_++) {
			if (class101s[anLocalInt_135_] != null) {
			    int anLocalInt_136_ = 0;
			    int anLocalInt_137_ = 0;
			    int anLocalInt_138_ = 0;
			    int anLocalInt_139_ = 0;
			    int anLocalInt_140_ = 0;
			    int anLocalInt_141_ = 0;
			    if ((((Class354) class354).anIntArrayArray2958
				 [anLocalInt_135_])
				!= null) {
				anLocalInt_136_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][0]);
				anLocalInt_139_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][3]) << 3;
				anLocalInt_138_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][2]);
				anLocalInt_137_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][1]);
				anLocalInt_141_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][5]) << 3;
				anLocalInt_140_ = (((Class354) class354)
						   .anIntArrayArray2958
						   [anLocalInt_135_][4]) << 3;
			    }
			    if (anLocalInt_139_ != 0 || anLocalInt_140_ != 0
				|| anLocalInt_141_ != 0)
				class101s[anLocalInt_135_].method1738
				    (anLocalInt_140_, 1046089902,
				     anLocalInt_139_, anLocalInt_141_);
			    if (anLocalInt_136_ != 0 || anLocalInt_137_ != 0
				|| anLocalInt_138_ != 0)
				class101s[anLocalInt_135_].method1752
				    (anLocalInt_138_, anLocalInt_136_,
				     anLocalInt_137_, -78);
			}
		    }
		}
		Class101 class101 = new Class101(class101s, class101s.length);
		anLocalInt_127_ |= 0x4000;
		class167 = argument_97_.method2057(class101, anLocalInt_127_,
						   Class62_Sub21.anInt4432, 64,
						   850);
		for (int anLocalInt_142_ = 0; anLocalInt_142_ < 5;
		     anLocalInt_142_++) {
		    for (int anLocalInt_143_ = 0;
			 (anLocalInt_143_
			  < Statics.aShortArrayArrayArray270.length);
			 anLocalInt_143_++) {
			if ((Statics.aShortArrayArrayArray270[anLocalInt_143_]
			     [anLocalInt_142_]).length
			    > ((Class22) this).anIntArray150[anLocalInt_142_])
			    class167.ia((Class42.aShortArrayArray3543
					 [anLocalInt_143_][anLocalInt_142_]),
					(Statics.aShortArrayArrayArray270
					 [anLocalInt_143_][anLocalInt_142_]
					 [(((Class22) this).anIntArray150
					   [anLocalInt_142_])]));
		    }
		}
		if (argument_99_) {
		    class167.s(anLocalInt);
		    synchronized (Node_Sub38.aClass149_4190) {
			Node_Sub38.aClass149_4190.put(class167, l);
		    }
		    aLong139 = l;
		}
	    } else {
		if (aLong139 != -1L) {
		    synchronized (Node_Sub38.aClass149_4190) {
			class167 = (Class167) Node_Sub38.aClass149_4190
						  .get(aLong139);
		    }
		}
		if (class167 == null
		    || argument_97_.andPow(class167.ua(), anLocalInt) != 0)
		    return null;
	    }
	}
	Class167 class167_144_
	    = class167.method2651((byte) 4, anLocalInt, true);
	boolean anLocalBoolean_145_ = false;
	if (argument_101_ != null) {
	    for (int anLocalInt_146_ = 0;
		 argument_101_.length > anLocalInt_146_; anLocalInt_146_++) {
		if (argument_101_[anLocalInt_146_] != -1)
		    anLocalBoolean_145_ = true;
	    }
	}
	if (!anLocalBoolean_107_ && !anLocalBoolean_145_)
	    return class167_144_;
	Class350[] class350s = null;
	if (class354 != null)
	    class350s = class354.method3920(110, argument_97_);
	if (anLocalBoolean_145_ && class350s != null) {
	    for (int anLocalInt_147_ = 0;
		 anLocalInt_147_ < argument_101_.length; anLocalInt_147_++) {
		if (class350s[anLocalInt_147_] != null)
		    class167_144_.method2643(class350s[anLocalInt_147_],
					     1 << anLocalInt_147_, true);
	    }
	}
	int anLocalInt_148_ = 0;
	int anLocalInt_149_ = 1;
	while (anLocalInt_108_ > anLocalInt_148_) {
	    if (Statics.aClass59_Sub51_Sub6Array4360[anLocalInt_148_]
		!= null)
		class167_144_.method2644
		    (0, false, Class26.anIntArray173[anLocalInt_148_] - 1,
		     anLocalInt_149_, null,
		     Class320.anIntArray2634[anLocalInt_148_], true,
		     Class85.aClass59_Sub51_Sub6Array603[anLocalInt_148_],
		     Node_Sub32_Sub3.anIntArray6084[anLocalInt_148_],
		     Class245_Sub1_Sub1.anIntArray6516[anLocalInt_148_],
		     (Statics.aClass59_Sub51_Sub6Array4360
		      [anLocalInt_148_]));
	    anLocalInt_148_++;
	    anLocalInt_149_ <<= 1;
	}
	if (anLocalBoolean_145_) {
	    for (int anLocalInt_150_ = 0;
		 anLocalInt_150_ < argument_101_.length; anLocalInt_150_++) {
		if (argument_101_[anLocalInt_150_] != -1) {
		    int anLocalInt_151_
			= argument_101_[anLocalInt_150_] - argument_95_;
		    anLocalInt_151_ &= 0x3fff;
		    Class350 class350 = argument_97_.method2029();
		    class350.method3824(anLocalInt_151_);
		    class167_144_.method2643(class350, 1 << anLocalInt_150_,
					     false);
		}
	    }
	}
	if (anLocalBoolean_145_ && class350s != null) {
	    for (int anLocalInt_152_ = 0;
		 anLocalInt_152_ < argument_101_.length; anLocalInt_152_++) {
		if (class350s[anLocalInt_152_] != null)
		    class167_144_.method2643(class350s[anLocalInt_152_],
					     1 << anLocalInt_152_, false);
	    }
	}
	if (class59_sub51_sub6 == null || class59_sub51_sub6_121_ == null) {
	    if (class59_sub51_sub6 != null)
		class167_144_.method2657(0, anLocalInt_114_, argument_100_ - 1,
					 false, class59_sub51_sub6,
					 anLocalInt_115_, anLocalInt_116_,
					 (byte) -93, class59_sub51_sub6_117_);
	    else if (class59_sub51_sub6_121_ != null)
		class167_144_.method2657(0, anLocalInt_118_, argument_98_ - 1,
					 false, class59_sub51_sub6_121_,
					 anLocalInt_119_, anLocalInt_120_,
					 (byte) -51, class59_sub51_sub6_122_);
	} else
	    class167_144_.method2658(class59_sub51_sub6,
				     class59_sub51_sub6_122_,
				     (((Class367) argument_94_)
				      .aBooleanArray3113),
				     (byte) -86, anLocalInt_114_,
				     anLocalInt_116_, class59_sub51_sub6_121_,
				     anLocalInt_118_, anLocalInt_119_,
				     class59_sub51_sub6_117_, anLocalInt_115_,
				     false, argument_100_ - 1,
				     argument_98_ - 1, anLocalInt_120_);
	for (int anLocalInt_153_ = 0; anLocalInt_108_ > anLocalInt_153_;
	     anLocalInt_153_++) {
	    Statics.aClass59_Sub51_Sub6Array4360[anLocalInt_153_] = null;
	    Class85.aClass59_Sub51_Sub6Array603[anLocalInt_153_] = null;
	    Class199.aClass367Array1445[anLocalInt_153_] = null;
	}
	return class167_144_;
    }
    
    static {
	anInt140 = -1;
    }
}
