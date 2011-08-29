/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class266
{
    int[] anIntArray2054;
    int anInt2055;
    boolean aBoolean2056;
    private int anInt2057;
    int anInt2058;
    int anInt2059;
    static Class306 aClass306_2060;
    private byte aByte2061;
    private int anInt2062;
    int[] anIntArray2063;
    boolean aBoolean2064;
    private int anInt2065;
    private short[] aShortArray2066;
    int[] anIntArray2067;
    int anInt2068;
    private int anInt2069;
    int anInt2070;
    private byte aByte2071 = 0;
    int anInt2072 = 0;
    Class257 aClass257_2073;
    int anInt2074;
    int anInt2075;
    int anInt2076;
    int anInt2077;
    short[] aShortArray2078;
    private int anInt2079;
    boolean aBoolean2080;
    int anInt2081;
    boolean aBoolean2082;
    boolean aBoolean2083;
    int anInt2084;
    boolean aBoolean2085 = true;
    int anInt2086;
    boolean aBoolean2087;
    boolean aBoolean2088;
    private short[] aShortArray2089;
    boolean aBoolean2090;
    int anInt2091;
    int anInt2092;
    short[] aShortArray2093;
    private int anInt2094;
    int anInt2095;
    String[] aStringArray2096;
    int anInt2097;
    boolean aBoolean2098;
    int anInt2099;
    int[][] anIntArrayArray2100;
    boolean aBoolean2101;
    private byte aByte2102;
    private byte aByte2103;
    private byte[] aByteArray2104;
    static boolean aBoolean2105 = false;
    boolean aBoolean2106;
    boolean aBoolean2107;
    int[] anIntArray2108;
    int anInt2109;
    int anInt2110;
    byte[] aByteArray2111;
    private byte aByte2112;
    int anInt2113;
    int anInt2114;
    private int anInt2115;
    boolean aBoolean2116;
    private int anInt2117;
    int anInt2118;
    private int anInt2119;
    private int[] anIntArray2120;
    private int anInt2121;
    private JagexHashMap aJagexHashMap_2122;
    int anInt2123;
    private int anInt2124;
    private int anInt2125;
    int anInt2126;
    private int anInt2127;
    int anInt2128;
    String aString2129;
    boolean aBoolean2130;
    int anInt2131;
    int anInt2132;
    boolean aBoolean2133;
    private int anInt2134;
    private int anInt2135;
    static Class207 aClass207_2136;
    static Class143 aClass143_2137;
    
    private final void method3333(int argument_0_, Packet argument_1_) {
	int anLocalInt = -63 % ((argument_0_ + 9) / 40);
	int anLocalInt_2_ = argument_1_.g1();
	for (int anLocalInt_3_ = 0; anLocalInt_2_ > anLocalInt_3_;
	     anLocalInt_3_++) {
	    ((Packet) argument_1_).pos++;
	    int anLocalInt_4_ = argument_1_.g1();
	    ((Packet) argument_1_).pos += anLocalInt_4_ * 2;
	}
    }
    
    final Class118 method3334
	(int argument_5_, Class_s argument_6_, int argument_7_,
	 Class_s argument_8_, Class120 argument_9_, int argument_10_,
	 int argument_11_, boolean argument_12_, int argument_13_,
	 byte argument_14_, int argument_15_, GraphicsToolkit argument_16_) {
	if (Statics.method1108(-73, argument_10_))
	    argument_10_ = 4;
	long l = (long) ((argument_10_ << 3)
			 + (((Class266) this).anInt2059 << 10) + argument_7_);
	l |= (long) (((GraphicsToolkit) argument_16_).anInt939 << 29);
	if (argument_9_ != null)
	    l |= ((Class120) argument_9_).aLong975 << 32;
	int anLocalInt = argument_11_;
	if (aByte2103 == 3)
	    anLocalInt |= 0x7;
	else {
	    if (aByte2103 != 0 || anInt2117 != 0)
		anLocalInt |= 0x2;
	    if (anInt2062 != 0)
		anLocalInt |= 0x1;
	    if (anInt2115 != 0)
		anLocalInt |= 0x4;
	}
	if (argument_12_)
	    anLocalInt |= 0x40000;
	Class118 class118;
	synchronized (((Class257) ((Class266) this).aClass257_2073)
		      .aClass149_2012) {
	    class118 = (Class118) ((Class257) ((Class266) this).aClass257_2073)
				      .aClass149_2012.get(l);
	}
	Class167 class167
	    = class118 != null ? ((Class118) class118).aClass167_969 : null;
	tia_sub_35DoublyLinked var_tia_sub_35 = null;
	if (class167 == null
	    || argument_16_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt
		    = argument_16_.or(anLocalInt, class167.ua());
	    int anLocalInt_17_ = anLocalInt;
	    if (argument_10_ == 10 && argument_7_ > 3)
		anLocalInt_17_ |= 0x5;
	    class167 = method3336(argument_16_, argument_7_, argument_9_, -103,
				  anLocalInt_17_, argument_10_);
	    if (class167 == null)
		return null;
	    if (argument_10_ == 10 && argument_7_ > 3)
		class167.a(2048);
	    if (argument_12_)
		var_tia_sub_35 = class167.ba(null);
	    class167.s(anLocalInt);
	    class118 = new Class118();
	    ((Class118) class118).aTia_sub_35_968 = var_tia_sub_35;
	    ((Class118) class118).aClass167_969 = class167;
	    synchronized (((Class257) ((Class266) this).aClass257_2073)
			  .aClass149_2012) {
		((Class257) ((Class266) this).aClass257_2073)
		    .aClass149_2012.put(class118, l);
	    }
	} else {
	    var_tia_sub_35 = ((Class118) class118).aTia_sub_35_968;
	    class167 = ((Class118) class118).aClass167_969;
	    if (argument_12_ && var_tia_sub_35 == null)
		var_tia_sub_35 = ((Class118) class118).aTia_sub_35_968
		    = class167.ba(null);
	}
	boolean anLocalBoolean
	    = aByte2103 != 0 && (argument_8_ != null || argument_6_ != null);
	boolean anLocalBoolean_18_
	    = anInt2062 != 0 || anInt2117 != 0 || anInt2115 != 0;
	if (!anLocalBoolean && !anLocalBoolean_18_)
	    class167 = class167.method2651((byte) 0, argument_11_, true);
	else {
	    class167 = class167.method2651((byte) 0, anLocalInt, true);
	    if (anLocalBoolean)
		class167.p(aByte2103, anInt2127, argument_8_, argument_6_,
			   argument_13_, argument_5_, argument_15_);
	    if (anLocalBoolean_18_)
		class167.H(anInt2062, anInt2117, anInt2115);
	    class167.s(argument_11_);
	}
	((Class118) Class276.aClass118_2214).aTia_sub_35_968 = var_tia_sub_35;
	((Class118) Class276.aClass118_2214).aClass167_969 = class167;
	return Class276.aClass118_2214;
    }
    
    final int method3335(int argument_19_, int argument_20_,
			 int argument_21_) {
	if (aJagexHashMap_2122 == null)
	    return argument_21_;
	IntegerNode class59_sub54
	    = ((IntegerNode)
	       aJagexHashMap_2122.get((long) argument_19_));
	if (argument_20_ != 1312515360)
	    return 53;
	if (class59_sub54 == null)
	    return argument_21_;
	return ((IntegerNode) class59_sub54).value;
    }
    
    private final Class167 method3336(GraphicsToolkit argument_22_, int argument_23_,
				      Class120 argument_24_, int argument_25_,
				      int argument_26_, int argument_27_) {
	int anLocalInt = anInt2057 + 64;
	int anLocalInt_28_ = anInt2124 + 850;
	int anLocalInt_29_ = argument_26_;
	boolean anLocalBoolean = (((Class266) this).aBoolean2088
				  || argument_27_ == 2 && argument_23_ > 3);
	if (anLocalBoolean)
	    argument_26_ |= 0x10;
	if (argument_23_ == 0) {
	    if (anInt2125 != 128 || anInt2134 != 0)
		argument_26_ |= 0x1;
	    if (anInt2119 != 128 || anInt2135 != 0)
		argument_26_ |= 0x4;
	} else
	    argument_26_ |= 0xd;
	if (anInt2094 != 128 || anInt2121 != 0)
	    argument_26_ |= 0x2;
	if (aShortArray2066 != null)
	    argument_26_ |= 0x4000;
	if (aShortArray2089 != null)
	    argument_26_ |= 0x8000;
	if (aByte2071 != 0)
	    argument_26_ |= 0x80000;
	Class167 class167 = null;
	if (((Class266) this).aByteArray2111 == null)
	    return null;
	int anLocalInt_30_ = -1;
	int anLocalInt_31_ = -6 % ((30 - argument_25_) / 50);
	for (int anLocalInt_32_ = 0;
	     ((Class266) this).aByteArray2111.length > anLocalInt_32_;
	     anLocalInt_32_++) {
	    if (((Class266) this).aByteArray2111[anLocalInt_32_]
		== argument_27_) {
		anLocalInt_30_ = anLocalInt_32_;
		break;
	    }
	}
	if (anLocalInt_30_ == -1)
	    return null;
	int[] anLocalInts
	    = ((argument_24_ != null
		&& ((Class120) argument_24_).anIntArray979 != null)
	       ? ((Class120) argument_24_).anIntArray979
	       : ((Class266) this).anIntArrayArray2100[anLocalInt_30_]);
	int anLocalInt_33_ = anLocalInts.length;
	if (anLocalInt_33_ > 0) {
	    long l = (long) ((GraphicsToolkit) argument_22_).anInt939;
	    for (int anLocalInt_34_ = 0; anLocalInt_33_ > anLocalInt_34_;
		 anLocalInt_34_++)
		l = (long) anLocalInts[anLocalInt_34_] + l * 67783L;
	    synchronized (((Class257) ((Class266) this).aClass257_2073)
			  .aClass149_2011) {
		class167
		    = (Class167) ((Class257) ((Class266) this).aClass257_2073)
				     .aClass149_2011.get(l);
	    }
	    if (class167 != null) {
		if (class167.WA() != anLocalInt)
		    argument_26_ |= 0x1000;
		if (anLocalInt_28_ != class167.da())
		    argument_26_ |= 0x2000;
	    }
	    if (class167 == null
		|| argument_22_.andPow(class167.ua(), argument_26_) != 0) {
		int anLocalInt_35_ = argument_26_ | 0x1f01f;
		if (class167 != null)
		    anLocalInt_35_ = argument_22_.or(anLocalInt_35_, class167.ua());
		Class101 class101 = null;
		synchronized (DoublyLinkedNodeP2_Sub2_Sub5.aClass101Array6427) {
		    for (int anLocalInt_36_ = 0;
			 anLocalInt_33_ > anLocalInt_36_; anLocalInt_36_++) {
			synchronized (((Class257)
				       ((Class266) this).aClass257_2073)
				      .aJs5Store_2005) {
			    class101
				= (tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class257) ((Class266) this).aClass257_2073).aJs5Store_2005), anLocalInts[anLocalInt_36_] & 0xffff, 0));
			}
			if (class101 == null)
			    return null;
			if (((Class101) class101).anInt820 < 13)
			    class101.method1733(17496, 2);
			if (anLocalInt_33_ > 1)
			    DoublyLinkedNodeP2_Sub2_Sub5.aClass101Array6427
				[anLocalInt_36_]
				= class101;
		    }
		    if (anLocalInt_33_ > 1)
			class101 = new Class101((DoublyLinkedNodeP2_Sub2_Sub5
						 .aClass101Array6427),
						anLocalInt_33_);
		}
		class167
		    = argument_22_.method2057(class101, anLocalInt_35_,
					      (((Class257) (((Class266) this)
							    .aClass257_2073))
					       .anInt2015),
					      anLocalInt, anLocalInt_28_);
		synchronized (((Class257) ((Class266) this).aClass257_2073)
			      .aClass149_2011) {
		    ((Class257) ((Class266) this).aClass257_2073)
			.aClass149_2011.put(class167, l);
		}
	    }
	}
	if (class167 == null)
	    return null;
	Class167 class167_37_
	    = class167.method2651((byte) 0, argument_26_, true);
	if (anLocalInt != class167.WA())
	    class167_37_.C(anLocalInt);
	if (anLocalInt_28_ != class167.da())
	    class167_37_.LA(anLocalInt_28_);
	if (anLocalBoolean)
	    class167_37_.v();
	if (argument_27_ == 4 && argument_23_ > 3) {
	    class167_37_.k(2048);
	    class167_37_.H(180, 0, -180);
	}
	argument_23_ &= 0x3;
	if (argument_23_ != 1) {
	    if (argument_23_ != 2) {
		if (argument_23_ == 3)
		    class167_37_.k(12288);
	    } else
		class167_37_.k(8192);
	} else
	    class167_37_.k(4096);
	if (aShortArray2066 != null) {
	    short[] anLocalInts_38_;
	    if (argument_24_ != null
		&& ((Class120) argument_24_).aShortArray976 != null)
		anLocalInts_38_ = ((Class120) argument_24_).aShortArray976;
	    else
		anLocalInts_38_ = ((Class266) this).aShortArray2093;
	    for (int anLocalInt_39_ = 0;
		 anLocalInt_39_ < aShortArray2066.length; anLocalInt_39_++) {
		if (aByteArray2104 != null
		    && aByteArray2104.length > anLocalInt_39_)
		    class167_37_.ia(aShortArray2066[anLocalInt_39_],
				    (Class1_Sub1.aShortArray5599
				     [aByteArray2104[anLocalInt_39_] & 0xff]));
		else
		    class167_37_.ia(aShortArray2066[anLocalInt_39_],
				    anLocalInts_38_[anLocalInt_39_]);
	    }
	}
	if (aShortArray2089 != null) {
	    short[] anLocalInts_40_;
	    if (argument_24_ != null
		&& ((Class120) argument_24_).aShortArray974 != null)
		anLocalInts_40_ = ((Class120) argument_24_).aShortArray974;
	    else
		anLocalInts_40_ = ((Class266) this).aShortArray2078;
	    for (int anLocalInt_41_ = 0;
		 anLocalInt_41_ < aShortArray2089.length; anLocalInt_41_++)
		class167_37_.aa(aShortArray2089[anLocalInt_41_],
				anLocalInts_40_[anLocalInt_41_]);
	}
	if (aByte2071 != 0)
	    class167_37_.method2649(aByte2112, aByte2102, aByte2061,
				    aByte2071 & 0xff);
	if (anInt2125 != 128 || anInt2094 != 128 || anInt2119 != 128)
	    class167_37_.O(anInt2125, anInt2094, anInt2119);
	if (anInt2134 != 0 || anInt2121 != 0 || anInt2135 != 0)
	    class167_37_.H(anInt2134, anInt2121, anInt2135);
	class167_37_.s(anLocalInt_29_);
	return class167_37_;
    }
    
    final String method3337(int argument_42_, byte argument_43_,
			    String argument_44_) {
	if (aJagexHashMap_2122 == null)
	    return argument_44_;
	StringNode class59_sub34
	    = ((StringNode)
	       aJagexHashMap_2122.get((long) argument_42_));
	if (class59_sub34 == null)
	    return argument_44_;
	return ((StringNode) class59_sub34).value;
    }
    
    final void method3338(byte argument_45_) {
	if (((Class266) this).anInt2123 == -1) {
	    ((Class266) this).anInt2123 = 0;
	    if (((Class266) this).aByteArray2111 != null
		&& ((Class266) this).aByteArray2111.length == 1
		&& ((Class266) this).aByteArray2111[0] == 10)
		((Class266) this).anInt2123 = 1;
	    for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++) {
		if (((Class266) this).aStringArray2096[anLocalInt] != null) {
		    ((Class266) this).anInt2123 = 1;
		    break;
		}
	    }
	}
	if (((Class266) this).anInt2055 != -1 || ((Class266) this).aBoolean2087
	    || ((Class266) this).anIntArray2067 != null)
	    ((Class266) this).aBoolean2083 = true;
	if (((Class266) this).anInt2092 == -1)
	    ((Class266) this).anInt2092
		= ((Class266) this).anInt2068 == 0 ? 0 : 1;
    }
    
    final boolean method3339(int argument_46_) {
	if (((Class266) this).anIntArray2067 == null) {
	    if (((Class266) this).anInt2110 == -1
		&& ((Class266) this).anIntArray2108 == null)
		return false;
	    return true;
	}
	for (int anLocalInt = 0;
	     ((Class266) this).anIntArray2067.length > anLocalInt;
	     anLocalInt++) {
	    if (((Class266) this).anIntArray2067[anLocalInt] != -1) {
		Class266 class266
		    = (((Class266) this).aClass257_2073.method3298
		       ((byte) 60,
			((Class266) this).anIntArray2067[anLocalInt]));
		if (((Class266) class266).anInt2110 != -1
		    || ((Class266) class266).anIntArray2108 != null)
		    return true;
	    }
	}
	return false;
    }
    
    final boolean method3340(int argument_47_) {
	if (((Class266) this).anIntArrayArray2100 == null)
	    return true;
	boolean anLocalBoolean = true;
	synchronized (((Class257) ((Class266) this).aClass257_2073)
		      .aJs5Store_2005) {
	    for (int anLocalInt = 0;
		 ((Class266) this).anIntArrayArray2100.length > anLocalInt;
		 anLocalInt++) {
		for (int anLocalInt_48_ = 0;
		     anLocalInt_48_ < (((Class266) this).anIntArrayArray2100
				       [anLocalInt]).length;
		     anLocalInt_48_++)
		    anLocalBoolean
			&= (((Class257) ((Class266) this).aClass257_2073)
				.aJs5Store_2005.isLoaded((((Class266) this).anIntArrayArray2100[anLocalInt][anLocalInt_48_]), 0));
	    }
	}
	return anLocalBoolean;
    }
    
    public static void method3341(int argument) {
	aClass143_2137 = null;
	aClass207_2136 = null;
	aClass306_2060 = null;
    }
    
    final void method3342(int argument_49_, Packet argument_50_) {
	if (argument_49_ != 0)
	    ((Class266) this).anInt2118 = -53;
	for (;;) {
	    int anLocalInt = argument_50_.g1();
	    if (anLocalInt == 0)
		break;
	    method3349(argument_50_, (byte) 95, anLocalInt);
	}
    }
    
    static final void method3343
	(int argument, boolean argument_51_, String argument_52_,
	 String argument_53_, int argument_54_, String argument_55_,
	 int argument_56_, String argument_57_, String argument_58_) {
	Class77 class77 = Class62_Sub1.aClass77Array4363[99];
	for (int anLocalInt = 99; anLocalInt > 0; anLocalInt--)
	    Class62_Sub1.aClass77Array4363[anLocalInt]
		= Class62_Sub1.aClass77Array4363[anLocalInt - 1];
	if (class77 != null)
	    class77.method1564(argument_58_, argument, argument_57_,
			       (byte) -125, argument_54_, argument_55_,
			       argument_52_, argument_56_, argument_53_);
	else
	    class77 = new Class77(argument, argument_56_, argument_52_,
				  argument_55_, argument_53_, argument_58_,
				  argument_54_, argument_57_);
	Class118.anInt967++;
	Class356.anInt3015 = Class359.anInt3038;
	Class62_Sub1.aClass77Array4363[0] = class77;
    }
    
    final Class167 method3344
	(int argument_59_, Class367 argument_60_, byte argument_61_,
	 int argument_62_, int argument_63_, Class_s argument_64_,
	 int argument_65_, Class120 argument_66_, int argument_67_,
	 int argument_68_, Class_s argument_69_, int argument_70_,
	 int argument_71_, int argument_72_, GraphicsToolkit argument_73_) {
	if (Statics.method1108(-8, argument_59_))
	    argument_59_ = 4;
	long l
	    = (long) (argument_63_ + ((argument_59_ << 3)
				      + (((Class266) this).anInt2059 << 10)));
	int anLocalInt = argument_62_;
	l |= (long) (((GraphicsToolkit) argument_73_).anInt939 << 29);
	if (argument_66_ != null)
	    l |= ((Class120) argument_66_).aLong975 << 32;
	if (argument_60_ != null)
	    argument_62_ |= argument_60_.method3997(false, argument_67_, 27123,
						    argument_68_);
	if (aByte2103 != 3) {
	    if (aByte2103 != 0 || anInt2117 != 0)
		argument_62_ |= 0x2;
	    if (anInt2062 != 0)
		argument_62_ |= 0x1;
	    if (anInt2115 != 0)
		argument_62_ |= 0x4;
	} else
	    argument_62_ |= 0x7;
	if (argument_59_ == 10 && argument_63_ > 3)
	    argument_62_ |= 0x5;
	Class167 class167;
	synchronized (((Class257) ((Class266) this).aClass257_2073)
		      .aClass149_2014) {
	    class167 = (Class167) ((Class257) ((Class266) this).aClass257_2073)
				      .aClass149_2014.get(l);
	}
	if (class167 == null
	    || argument_73_.andPow(class167.ua(), argument_62_) != 0) {
	    if (class167 != null)
		argument_62_
		    = argument_73_.or(argument_62_, class167.ua());
	    class167 = method3336(argument_73_, argument_63_, argument_66_,
				  -65, argument_62_, argument_59_);
	    if (class167 == null)
		return null;
	    synchronized (((Class257) ((Class266) this).aClass257_2073)
			  .aClass149_2014) {
		((Class257) ((Class266) this).aClass257_2073)
		    .aClass149_2014.put(class167, l);
	    }
	}
	boolean anLocalBoolean = false;
	if (argument_60_ != null) {
	    class167
		= argument_60_.method3996(argument_62_, argument_67_,
					  argument_72_, (byte) 1, class167,
					  256, argument_63_ & 0x3,
					  argument_68_);
	    anLocalBoolean = true;
	}
	if (argument_59_ == 10 && argument_63_ > 3) {
	    if (!anLocalBoolean) {
		anLocalBoolean = true;
		class167 = class167.method2651((byte) 3, argument_62_, true);
	    }
	    class167.a(2048);
	}
	if (aByte2103 != 0) {
	    if (!anLocalBoolean) {
		class167 = class167.method2651((byte) 3, argument_62_, true);
		anLocalBoolean = true;
	    }
	    class167.p(aByte2103, anInt2127, argument_69_, argument_64_,
		       argument_65_, argument_71_, argument_70_);
	}
	if (anInt2062 != 0 || anInt2117 != 0 || anInt2115 != 0) {
	    if (!anLocalBoolean) {
		anLocalBoolean = true;
		class167 = class167.method2651((byte) 3, argument_62_, true);
	    }
	    class167.H(anInt2062, anInt2117, anInt2115);
	}
	if (anLocalBoolean)
	    class167.s(anLocalInt);
	return class167;
    }
    
    final Class266 method3345(int argument_74_, VariableValueSource argument_75_) {
	if (argument_74_ != 1)
	    method3336(null, 68, null, -94, -8, 3);
	int anLocalInt = -1;
	if (anInt2079 == -1) {
	    if (anInt2069 != -1)
		anLocalInt = argument_75_.get(0, anInt2069);
	} else
	    anLocalInt
		= argument_75_.getVarbit(anInt2079, argument_74_ + 14193);
	if (anLocalInt < 0
	    || anLocalInt >= ((Class266) this).anIntArray2067.length - 1
	    || ((Class266) this).anIntArray2067[anLocalInt] == -1) {
	    int anLocalInt_76_
		= (((Class266) this).anIntArray2067
		   [((Class266) this).anIntArray2067.length - 1]);
	    if (anLocalInt_76_ != -1)
		return ((Class266) this).aClass257_2073
			   .method3298((byte) 99, anLocalInt_76_);
	    return null;
	}
	return ((Class266) this).aClass257_2073.method3298((byte) 84,
							   (((Class266) this)
							    .anIntArray2067
							    [anLocalInt]));
    }
    
    final int method3346(int argument_77_) {
	if (((Class266) this).anIntArray2063 != null) {
	    int anLocalInt = (int) (Math.random() * (double) anInt2065);
	    int anLocalInt_78_;
	    for (anLocalInt_78_ = 0;
		 anLocalInt >= anIntArray2120[anLocalInt_78_];
		 anLocalInt_78_++)
		anLocalInt -= anIntArray2120[anLocalInt_78_];
	    return ((Class266) this).anIntArray2063[anLocalInt_78_];
	}
	if (argument_77_ != -31735)
	    ((Class266) this).anInt2074 = 122;
	return -1;
    }
    
    final boolean method3347(int argument_79_, int argument_80_) {
	if (((Class266) this).anIntArrayArray2100 == null)
	    return true;
	synchronized (((Class257) ((Class266) this).aClass257_2073)
		      .aJs5Store_2005) {
	    for (int anLocalInt = argument_79_;
		 ((Class266) this).aByteArray2111.length > anLocalInt;
		 anLocalInt++) {
		if (argument_80_
		    == ((Class266) this).aByteArray2111[anLocalInt]) {
		    for (int anLocalInt_81_ = 0;
			 ((((Class266) this).anIntArrayArray2100
			   [anLocalInt]).length
			  > anLocalInt_81_);
			 anLocalInt_81_++) {
			if (!((Class257) ((Class266) this).aClass257_2073)
				 .aJs5Store_2005.isLoaded((((Class266) this).anIntArrayArray2100[anLocalInt][anLocalInt_81_]), 0))
			    return false;
		    }
		    return true;
		}
	    }
	}
	return true;
    }
    
    static final void method3348(byte argument) {
	if (argument != -11)
	    method3343(121, false, null, null, -95, null, -20, null, null);
	synchronized (Class167_Sub2.aClass149_5165) {
	    Class167_Sub2.aClass149_5165.method2540(argument - 117);
	}
    }
    
    private final void method3349(Packet argument_82_,
				  byte argument_83_, int argument_84_) {
	if (argument_83_ != 95)
	    ((Class266) this).aBoolean2087 = false;
	if (argument_84_ != 1 && argument_84_ != 5) {
	    if (argument_84_ != 2) {
		if (argument_84_ != 14) {
		    if (argument_84_ != 15) {
			if (argument_84_ != 17) {
			    if (argument_84_ == 18)
				((Class266) this).aBoolean2085 = false;
			    else if (argument_84_ != 19) {
				if (argument_84_ == 21)
				    aByte2103 = (byte) 1;
				else if (argument_84_ != 22) {
				    if (argument_84_ == 23)
					((Class266) this).anInt2126 = 1;
				    else if (argument_84_ != 24) {
					if (argument_84_ == 27)
					    ((Class266) this).anInt2068 = 1;
					else if (argument_84_ == 28)
					    ((Class266) this).anInt2091
						= (argument_82_
						       .g1()
						   << 2);
					else if (argument_84_ == 29)
					    anInt2057
						= argument_82_
						      .g1s();
					else if (argument_84_ == 39)
					    anInt2124
						= (argument_82_
						       .g1s()
						   * 5);
					else if (argument_84_ < 30
						 || argument_84_ >= 35) {
					    if (argument_84_ == 40) {
						int anLocalInt
						    = (argument_82_.g1
                                ());
						aShortArray2066
						    = new short[anLocalInt];
						((Class266) this)
						    .aShortArray2093
						    = new short[anLocalInt];
						for (int anLocalInt_85_ = 0;
						     (anLocalInt
						      > anLocalInt_85_);
						     anLocalInt_85_++) {
						    aShortArray2066
							[anLocalInt_85_]
							= (short) (argument_82_
								       .g2
                                               ());
						    ((Class266) this)
							.aShortArray2093
							[anLocalInt_85_]
							= (short) (argument_82_
								       .g2
                                               ());
						}
					    } else if (argument_84_ != 41) {
						if (argument_84_ == 42) {
						    int anLocalInt
							= (argument_82_
							       .g1
                                           ());
						    aByteArray2104
							= new byte[anLocalInt];
						    for (int anLocalInt_86_
							     = 0;
							 (anLocalInt
							  > anLocalInt_86_);
							 anLocalInt_86_++)
							aByteArray2104
							    [anLocalInt_86_]
							    = (argument_82_
								   .g1s
                                           ());
						} else if (argument_84_ == 62)
						    ((Class266) this)
							.aBoolean2088
							= true;
						else if (argument_84_ != 64) {
						    if (argument_84_ == 65)
							anInt2125
							    = (argument_82_
								   .g2
                                           ());
						    else if (argument_84_
							     != 66) {
							if (argument_84_ == 67)
							    anInt2119
								= (argument_82_
								       .g2
                                               ());
							else if (argument_84_
								 != 69) {
							    if (argument_84_
								!= 70) {
								if (argument_84_
								    != 71) {
								    if (argument_84_
									!= 72) {
									if (argument_84_
									    == 73)
									    ((Class266)
									     this).aBoolean2106
										= true;
									else if (argument_84_ != 74) {
									    if (argument_84_ == 75)
										((Class266) this).anInt2092 = argument_82_.g1();
									    else if (argument_84_ != 77 && argument_84_ != 92) {
										if (argument_84_ == 78) {
										    ((Class266) this).anInt2110 = argument_82_.g2();
										    ((Class266) this).anInt2132 = argument_82_.g1();
										} else if (argument_84_ != 79) {
										    if (argument_84_ == 81) {
											aByte2103 = (byte) 2;
											anInt2127 = argument_82_.g1() * 256;
										    } else if (argument_84_ != 82) {
											if (argument_84_ != 88) {
											    if (argument_84_ != 89) {
												if (argument_84_ != 91) {
												    if (argument_84_ != 93) {
													if (argument_84_ != 94) {
													    if (argument_84_ != 95) {
														if (argument_84_ == 97)
														    ((Class266) this).aBoolean2098 = true;
														else if (argument_84_ != 98) {
														    if (argument_84_ == 99) {
															((Class266) this).anInt2099 = argument_82_.g1();
															((Class266) this).anInt2118 = argument_82_.g2();
														    } else if (argument_84_ == 100) {
															((Class266) this).anInt2076 = argument_82_.g1();
															((Class266) this).anInt2086 = argument_82_.g2();
														    } else if (argument_84_ == 101)
															((Class266) this).anInt2072 = argument_82_.g1();
														    else if (argument_84_ != 102) {
															if (argument_84_ == 103)
															    ((Class266) this).anInt2126 = 0;
															else if (argument_84_ == 104)
															    ((Class266) this).anInt2095 = argument_82_.g1();
															else if (argument_84_ != 105) {
															    if (argument_84_ == 106) {
																int anLocalInt = argument_82_.g1();
																((Class266) this).anIntArray2063 = new int[anLocalInt];
																anIntArray2120 = new int[anLocalInt];
																for (int anLocalInt_87_ = 0; anLocalInt_87_ < anLocalInt; anLocalInt_87_++) {
																    ((Class266) this).anIntArray2063[anLocalInt_87_] = argument_82_.g2();
																    int anLocalInt_88_ = argument_82_.g1();
																    anIntArray2120[anLocalInt_87_] = anLocalInt_88_;
																    anInt2065 += anLocalInt_88_;
																}
															    } else if (argument_84_ != 107) {
																if (argument_84_ < 150 || argument_84_ >= 155) {
																    if (argument_84_ == 160) {
																	int anLocalInt = argument_82_.g1();
																	((Class266) this).anIntArray2054 = new int[anLocalInt];
																	for (int anLocalInt_89_ = 0; anLocalInt_89_ < anLocalInt; anLocalInt_89_++)
																	    ((Class266) this).anIntArray2054[anLocalInt_89_] = argument_82_.g2();
																    } else if (argument_84_ == 162) {
																	aByte2103 = (byte) 3;
																	anInt2127 = argument_82_.g4();
																    } else if (argument_84_ != 163) {
																	if (argument_84_ == 164)
																	    anInt2062 = argument_82_.g2s();
																	else if (argument_84_ == 165)
																	    anInt2117 = argument_82_.g2s();
																	else if (argument_84_ != 166) {
																	    if (argument_84_ == 167)
																		((Class266) this).anInt2070 = argument_82_.g2();
																	    else if (argument_84_ == 168)
																		((Class266) this).aBoolean2080 = true;
																	    else if (argument_84_ != 169) {
																		if (argument_84_ != 170) {
																		    if (argument_84_ != 171) {
																			if (argument_84_ == 173) {
																			    ((Class266) this).anInt2113 = argument_82_.g2();
																			    ((Class266) this).anInt2109 = argument_82_.g2();
																			} else if (argument_84_ != 177) {
																			    if (argument_84_ != 178) {
																				if (argument_84_ == 249) {
																				    int anLocalInt = argument_82_.g1();
																				    if (aJagexHashMap_2122 == null) {
																					int anLocalInt_90_ = MathStatics.method2589(anLocalInt);
																					aJagexHashMap_2122 = new JagexHashMap(anLocalInt_90_);
																				    }
																				    for (int anLocalInt_91_ = 0; anLocalInt_91_ < anLocalInt; anLocalInt_91_++) {
																					boolean anLocalBoolean = argument_82_.g1() == 1;
																					int anLocalInt_92_ = argument_82_.g3_dupl();
																					Node node;
																					if (anLocalBoolean)
																					    node = new StringNode(argument_82_.gstr());
																					else
																					    node = new IntegerNode(argument_82_.g4());
																					aJagexHashMap_2122.put((long) anLocalInt_92_, node);
																				    }
																				}
																			    } else
																				((Class266) this).anInt2081 = argument_82_.g1();
																			} else
																			    ((Class266) this).aBoolean2083 = true;
																		    } else
																			((Class266) this).anInt2074 = argument_82_.gsmart(argument_83_ - 97);
																		} else
																		    ((Class266) this).anInt2084 = argument_82_.gsmart(-2);
																	    } else
																		((Class266) this).aBoolean2116 = true;
																	} else
																	    anInt2115 = argument_82_.g2s();
																    } else {
																	aByte2112 = argument_82_.g1s();
																	aByte2102 = argument_82_.g1s();
																	aByte2061 = argument_82_.g1s();
																	aByte2071 = argument_82_.g1s();
																    }
																} else {
																    ((Class266) this).aStringArray2096[argument_84_ - 150] = argument_82_.gstr();
																    if (!((Class257) ((Class266) this).aClass257_2073).aBoolean2008)
																	((Class266) this).aStringArray2096[argument_84_ - 150] = null;
																}
															    } else
																((Class266) this).anInt2077 = argument_82_.g2();
															} else
															    ((Class266) this).aBoolean2101 = true;
														    } else
															((Class266) this).anInt2058 = argument_82_.g2();
														} else
														    ((Class266) this).aBoolean2087 = true;
													    } else {
														aByte2103 = (byte) 5;
														anInt2127 = argument_82_.g2s();
													    }
													} else
													    aByte2103 = (byte) 4;
												    } else {
													aByte2103 = (byte) 3;
													anInt2127 = argument_82_.g2();
												    }
												} else
												    ((Class266) this).aBoolean2090 = true;
											    } else
												((Class266) this).aBoolean2133 = false;
											} else
											    ((Class266) this).aBoolean2130 = false;
										    } else
											((Class266) this).aBoolean2064 = true;
										} else {
										    ((Class266) this).anInt2114 = argument_82_.g2();
										    ((Class266) this).anInt2097 = argument_82_.g2();
										    ((Class266) this).anInt2132 = argument_82_.g1();
										    int anLocalInt = argument_82_.g1();
										    ((Class266) this).anIntArray2108 = new int[anLocalInt];
										    for (int anLocalInt_93_ = 0; anLocalInt > anLocalInt_93_; anLocalInt_93_++)
											((Class266) this).anIntArray2108[anLocalInt_93_] = argument_82_.g2();
										}
									    } else {
										anInt2079 = argument_82_.g2();
										if (anInt2079 == 65535)
										    anInt2079 = -1;
										anInt2069 = argument_82_.g2();
										if (anInt2069 == 65535)
										    anInt2069 = -1;
										int anLocalInt = -1;
										if (argument_84_ == 92) {
										    anLocalInt = argument_82_.g2();
										    if (anLocalInt == 65535)
											anLocalInt = -1;
										}
										int anLocalInt_94_ = argument_82_.g1();
										((Class266) this).anIntArray2067 = new int[anLocalInt_94_ + 2];
										for (int anLocalInt_95_ = 0; anLocalInt_94_ >= anLocalInt_95_; anLocalInt_95_++) {
										    ((Class266) this).anIntArray2067[anLocalInt_95_] = argument_82_.g2();
										    if (((Class266) this).anIntArray2067[anLocalInt_95_] == 65535)
											((Class266) this).anIntArray2067[anLocalInt_95_] = -1;
										}
										((Class266) this).anIntArray2067[anLocalInt_94_ + 1] = anLocalInt;
									    }
									} else
									    ((Class266)
									     this).aBoolean2056
										= true;
								    } else
									anInt2135
									    = argument_82_.g2s() << 2;
								} else
								    anInt2121
									= ((argument_82_.g2s
                                            ())
									   << 2);
							    } else
								anInt2134
								    = ((argument_82_
									    .g2s
                                                ())
								       << 2);
							} else
							    ((Class266) this)
								.anInt2075
								= (argument_82_
								       .g1
                                               ());
						    } else
							anInt2094
							    = (argument_82_
								   .g2
                                           ());
						} else
						    ((Class266) this)
							.aBoolean2082
							= false;
					    } else {
						int anLocalInt
						    = (argument_82_.g1
                                ());
						aShortArray2089
						    = new short[anLocalInt];
						((Class266) this)
						    .aShortArray2078
						    = new short[anLocalInt];
						for (int anLocalInt_96_ = 0;
						     (anLocalInt
						      > anLocalInt_96_);
						     anLocalInt_96_++) {
						    aShortArray2089
							[anLocalInt_96_]
							= (short) (argument_82_
								       .g2
                                               ());
						    ((Class266) this)
							.aShortArray2078
							[anLocalInt_96_]
							= (short) (argument_82_
								       .g2
                                               ());
						}
					    }
					} else
					    ((Class266) this)
						.aStringArray2096
						[argument_84_ - 30]
						= argument_82_
						      .gstr();
				    } else {
					((Class266) this).anInt2055
					    = argument_82_.g2();
					if (((Class266) this).anInt2055
					    == 65535)
					    ((Class266) this).anInt2055 = -1;
				    }
				} else
				    ((Class266) this).aBoolean2107 = true;
			    } else
				((Class266) this).anInt2123
				    = argument_82_.g1();
			} else {
			    ((Class266) this).aBoolean2085 = false;
			    ((Class266) this).anInt2068 = 0;
			}
		    } else
			((Class266) this).anInt2131
			    = argument_82_
				  .g1();
		} else
		    ((Class266) this).anInt2128
			= argument_82_.g1();
	    } else
		((Class266) this).aString2129
		    = argument_82_.gstr();
	} else {
	    if (argument_84_ == 5
		&& ((Class257) ((Class266) this).aClass257_2073).aBoolean2003)
		method3333(53, argument_82_);
	    int anLocalInt = argument_82_.g1();
	    ((Class266) this).anIntArrayArray2100 = new int[anLocalInt][];
	    ((Class266) this).aByteArray2111 = new byte[anLocalInt];
	    for (int anLocalInt_97_ = 0; anLocalInt > anLocalInt_97_;
		 anLocalInt_97_++) {
		((Class266) this).aByteArray2111[anLocalInt_97_]
		    = argument_82_.g1s();
		int anLocalInt_98_ = argument_82_.g1();
		((Class266) this).anIntArrayArray2100[anLocalInt_97_]
		    = new int[anLocalInt_98_];
		for (int anLocalInt_99_ = 0; anLocalInt_99_ < anLocalInt_98_;
		     anLocalInt_99_++)
		    ((Class266) this).anIntArrayArray2100[anLocalInt_97_]
			[anLocalInt_99_]
			= argument_82_.g2();
	    }
	    if (argument_84_ == 5
		&& !((Class257) ((Class266) this).aClass257_2073).aBoolean2003)
		method3333(69, argument_82_);
	}
    }
    
    final boolean method3350(int argument_100_, int argument_101_) {
	if (argument_101_ == -1)
	    return false;
	if (argument_101_ == ((Class266) this).anInt2055)
	    return true;
	if (((Class266) this).anIntArray2063 != null) {
	    for (int anLocalInt = 0;
		 ((Class266) this).anIntArray2063.length > anLocalInt;
		 anLocalInt++) {
		if (argument_101_
		    == ((Class266) this).anIntArray2063[anLocalInt])
		    return true;
	    }
	}
	return false;
    }
    
    static final void method3351(Node_Sub28_Sub1 argument,
				 int argument_102_,
				 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_103_,
				 int argument_104_, byte argument_105_) {
	if ((argument_104_ & 0x40) != 0) {
	    int anLocalInt = argument.g2();
	    if (anLocalInt == 65535)
		anLocalInt = -1;
	    ((Entity) argument_103_).anInt6725 = anLocalInt;
	}
	byte anLocalInt = -1;
	if ((argument_104_ & 0x80) != 0) {
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6862
		= argument.g2();
	    if (((Entity) argument_103_).anInt6798 == 0) {
		argument_103_.method1824(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					  argument_103_).anInt6862,
					 (byte) 122);
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6862 = -1;
	    }
	}
	if ((argument_104_ & 0x2000) != 0) {
	    int anLocalInt_106_ = argument.g2();
	    ((Entity) argument_103_).anInt6773
		= argument.g1_128p();
	    ((Entity) argument_103_).anInt6770
		= argument.g1n();
	    ((Entity) argument_103_).aBoolean6777
		= (anLocalInt_106_ & 0x8000) != 0;
	    ((Entity) argument_103_).anInt6768
		= anLocalInt_106_ & 0x7fff;
	    ((Entity) argument_103_).anInt6782
		= (Class333.anInt2720
		   + (((Entity) argument_103_).anInt6768
		      + ((Entity) argument_103_).anInt6773));
	}
	if ((argument_104_ & 0x20) != 0)
	    DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570[argument_102_]
		= argument.p1m128();
	if ((argument_104_ & 0x4000) != 0) {
	    int anLocalInt_107_ = argument.g1();
	    int[] anLocalInts = new int[anLocalInt_107_];
	    int[] anLocalInts_108_ = new int[anLocalInt_107_];
	    int[] anLocalInts_109_ = new int[anLocalInt_107_];
	    for (int anLocalInt_110_ = 0; anLocalInt_110_ < anLocalInt_107_;
		 anLocalInt_110_++) {
		int anLocalInt_111_ = argument.g2ip128();
		if (anLocalInt_111_ == 65535)
		    anLocalInt_111_ = -1;
		anLocalInts[anLocalInt_110_] = anLocalInt_111_;
		anLocalInts_108_[anLocalInt_110_]
		    = argument.g1p128();
		anLocalInts_109_[anLocalInt_110_] = argument.g2();
	    }
	    Statics.method1962(anLocalInts_109_, anLocalInts_108_, 6, anLocalInts, argument_103_);
	}
	if ((argument_104_ & 0x10000) != 0)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).aBoolean6856
		= argument.g1p128() == 1;
	if ((argument_104_ & 0x1) != 0) {
	    int anLocalInt_112_ = argument.g2ip128();
	    int anLocalInt_113_ = argument.g4m();
	    if (anLocalInt_112_ == 65535)
		anLocalInt_112_ = -1;
	    int anLocalInt_114_ = argument.g1();
	    int anLocalInt_115_ = anLocalInt_114_ & 0x7;
	    int anLocalInt_116_ = anLocalInt_114_ >> 3 & 0xf;
	    if (anLocalInt_116_ == 15)
		anLocalInt_116_ = -1;
	    argument_103_.method1827(anLocalInt_113_, 0, anLocalInt_112_,
				     anLocalInt_116_, anLocalInt_115_, 0);
	}
	int anLocalInt_117_ = -32 / ((argument_105_ + 4) / 53);
	if ((argument_104_ & 0x20000) != 0) {
	    int anLocalInt_118_ = argument.g2();
	    if (anLocalInt_118_ == 65535)
		anLocalInt_118_ = -1;
	    int anLocalInt_119_ = argument.g4m2143();
	    int anLocalInt_120_ = argument.g1n();
	    int anLocalInt_121_ = anLocalInt_120_ & 0x7;
	    int anLocalInt_122_ = anLocalInt_120_ >> 3 & 0xf;
	    if (anLocalInt_122_ == 15)
		anLocalInt_122_ = -1;
	    argument_103_.method1827(anLocalInt_119_, 2, anLocalInt_118_,
				     anLocalInt_122_, anLocalInt_121_, 0);
	}
	if ((argument_104_ & 0x8000) != 0)
	    anLocalInt = argument.g1s();
	if ((argument_104_ & 0x1000) != 0) {
	    ((Entity) argument_103_).aString6733
		= argument.gstr();
	    if (((Entity) argument_103_).aString6733.charAt(0)
		== '~') {
		((Entity) argument_103_).aString6733
		    = ((Entity) argument_103_).aString6733
			  .substring(1);
		Class62_Sub12.method1403
		    (2,
		     (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
		      .aString6847),
		     argument_103_.method1862(false, -12628),
		     ((Entity) argument_103_).aString6733, 0,
		     argument_103_.method1855(true, -1075074040), 16773);
	    } else if (argument_103_
		       == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		Class62_Sub12.method1403
		    (2,
		     (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
		      .aString6847),
		     argument_103_.method1862(false, -12628),
		     ((Entity) argument_103_).aString6733, 0,
		     argument_103_.method1855(true, -1075074040), 16773);
	    ((Entity) argument_103_).anInt6791 = 150;
	    ((Entity) argument_103_).anInt6736 = 0;
	    ((Entity) argument_103_).anInt6776 = 0;
	}
	if ((argument_104_ & 0x100) != 0) {
	    ((Entity) argument_103_).anInt6746
		= argument.p1m128();
	    ((Entity) argument_103_).anInt6766
		= argument.g1ns();
	    ((Entity) argument_103_).anInt6728
		= argument.g1ns();
	    ((Entity) argument_103_).anInt6790
		= argument.g1p128s();
	    ((Entity) argument_103_).anInt6762
		= argument.g2m128() + Class333.anInt2720;
	    ((Entity) argument_103_).anInt6737
		= argument.g2i() + Class333.anInt2720;
	    ((Entity) argument_103_).anInt6756
		= argument.g1n();
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).aBoolean6864) {
		((Entity) argument_103_).anInt6728
		    += (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
			.anInt6849);
		((Entity) argument_103_).anInt6790
		    += (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
			.anInt6845);
		((Entity) argument_103_).anInt6766
		    += (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
			.anInt6845);
		((Entity) argument_103_).anInt6798 = 0;
		((Entity) argument_103_).anInt6746
		    += (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_)
			.anInt6849);
	    } else {
		((Entity) argument_103_).anInt6728
		    += (((Entity) argument_103_)
			.pathX[0]);
		((Entity) argument_103_).anInt6766
		    += (((Entity) argument_103_)
			.pathZ[0]);
		((Entity) argument_103_).anInt6798 = 1;
		((Entity) argument_103_).anInt6746
		    += (((Entity) argument_103_)
			.pathX[0]);
		((Entity) argument_103_).anInt6790
		    += (((Entity) argument_103_)
			.pathZ[0]);
	    }
	    ((Entity) argument_103_).anInt6803 = 0;
	}
	if ((argument_104_ & 0x400) != 0) {
	    int anLocalInt_123_ = argument.g2m128();
	    int anLocalInt_124_ = argument.g4m();
	    if (anLocalInt_123_ == 65535)
		anLocalInt_123_ = -1;
	    int anLocalInt_125_ = argument.g1n();
	    int anLocalInt_126_ = anLocalInt_125_ & 0x7;
	    int anLocalInt_127_ = anLocalInt_125_ >> 3 & 0xf;
	    if (anLocalInt_127_ == 15)
		anLocalInt_127_ = -1;
	    argument_103_.method1827(anLocalInt_124_, 1, anLocalInt_123_,
				     anLocalInt_127_, anLocalInt_126_, 0);
	}
	if ((argument_104_ & 0x80000) != 0) {
	    ((Entity) argument_103_).aByte6743
		= argument.g1s();
	    ((Entity) argument_103_).aByte6775
		= argument.p1m128();
	    ((Entity) argument_103_).aByte6771
		= argument.g1s();
	    ((Entity) argument_103_).aByte6781
		= (byte) argument.g1n();
	    ((Entity) argument_103_).anInt6788
		= Class333.anInt2720 + argument.g2m128();
	    ((Entity) argument_103_).anInt6739
		= Class333.anInt2720 + argument.g2();
	}
	if ((argument_104_ & 0x200) != 0)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).aBoolean6852
		= argument.g1p128() == 1;
	if ((argument_104_ & 0x2) != 0) {
	    int[] anLocalInts = new int[4];
	    for (int anLocalInt_128_ = 0; anLocalInt_128_ < 4;
		 anLocalInt_128_++) {
		anLocalInts[anLocalInt_128_] = argument.g2ip128();
		if (anLocalInts[anLocalInt_128_] == 65535)
		    anLocalInts[anLocalInt_128_] = -1;
	    }
	    int anLocalInt_129_ = argument.g1p128();
	    Class78.method1567((byte) 10, argument_103_, anLocalInts,
			       anLocalInt_129_);
	}
	if ((argument_104_ & 0x8) != 0) {
	    int anLocalInt_130_ = argument.g1p128();
	    if (anLocalInt_130_ > 0) {
		for (int anLocalInt_131_ = 0;
		     anLocalInt_130_ > anLocalInt_131_; anLocalInt_131_++) {
		    int anLocalInt_132_ = -1;
		    int anLocalInt_133_ = -1;
		    int anLocalInt_134_ = -1;
		    int anLocalInt_135_ = argument.gsmart(-2);
		    if (anLocalInt_135_ != 32767) {
			if (anLocalInt_135_ == 32766)
			    anLocalInt_135_ = -1;
			else
			    anLocalInt_133_ = argument.gsmart(-2);
		    } else {
			anLocalInt_135_ = argument.gsmart(-2);
			anLocalInt_133_ = argument.gsmart(-2);
			anLocalInt_132_ = argument.gsmart(-2);
			anLocalInt_134_ = argument.gsmart(-2);
		    }
		    int anLocalInt_136_ = argument.gsmart(-2);
		    int anLocalInt_137_ = argument.g1_128p();
		    argument_103_.method1826(-120, anLocalInt_136_,
					     Class333.anInt2720,
					     anLocalInt_134_, anLocalInt_135_,
					     anLocalInt_132_, anLocalInt_133_,
					     anLocalInt_137_);
		}
	    }
	}
	if ((argument_104_ & 0x40000) != 0) {
	    int anLocalInt_138_ = argument.g1();
	    int[] anLocalInts = new int[anLocalInt_138_];
	    int[] anLocalInts_139_ = new int[anLocalInt_138_];
	    for (int anLocalInt_140_ = 0; anLocalInt_138_ > anLocalInt_140_;
		 anLocalInt_140_++) {
		int anLocalInt_141_ = argument.g2i();
		if ((anLocalInt_141_ & 0xc000) != 49152)
		    anLocalInts[anLocalInt_140_] = anLocalInt_141_;
		else {
		    int anLocalInt_142_ = argument.g2();
		    anLocalInts[anLocalInt_140_]
			= MathStatics.OR(anLocalInt_141_ << 16, anLocalInt_142_);
		}
		anLocalInts_139_[anLocalInt_140_] = argument.g2ip128();
	    }
	    argument_103_.method1823((byte) -2, anLocalInts_139_, anLocalInts);
	}
	if ((argument_104_ & 0x4) != 0) {
	    int anLocalInt_143_ = argument.g1_128p();
	    byte[] anLocalInts = new byte[anLocalInt_143_];
	    Packet class59_sub28 = new Packet(anLocalInts);
	    argument.gbytes(anLocalInts, 0, anLocalInt_143_);
	    DoublyLinkedNode_Sub51_Sub7.aClass59_Sub28Array6247[argument_102_]
		= class59_sub28;
	    argument_103_.method1856(class59_sub28, true);
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).aBoolean6864) {
	    if (anLocalInt != 127) {
		byte anLocalInt_144_;
		if (anLocalInt != -1)
		    anLocalInt_144_ = anLocalInt;
		else
		    anLocalInt_144_ = (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aByteArray6570
				       [argument_102_]);
		Class123.method2395(argument_103_, anLocalInt_144_, -25478);
		argument_103_.method1859
		    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6849,
		     -111,
		     ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6845,
		     anLocalInt_144_);
	    } else
		argument_103_.method1865
		    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6849,
		     ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_103_).anInt6845,
		     false);
	}
    }
    
    public Class266() {
	((Class266) this).anInt2070 = 0;
	((Class266) this).anInt2084 = 960;
	anInt2062 = 0;
	((Class266) this).anInt2058 = -1;
	((Class266) this).aBoolean2087 = false;
	anInt2057 = 0;
	anInt2079 = -1;
	((Class266) this).anInt2099 = -1;
	((Class266) this).anInt2055 = -1;
	((Class266) this).aBoolean2101 = false;
	((Class266) this).aStringArray2096 = new String[5];
	((Class266) this).anInt2091 = 64;
	((Class266) this).aBoolean2064 = false;
	anInt2065 = 0;
	((Class266) this).anInt2095 = 255;
	((Class266) this).aBoolean2090 = false;
	anInt2069 = -1;
	aByte2103 = (byte) 0;
	((Class266) this).anInt2097 = 0;
	((Class266) this).anInt2110 = -1;
	anInt2117 = 0;
	((Class266) this).anInt2074 = 0;
	((Class266) this).anInt2081 = 0;
	((Class266) this).aBoolean2107 = false;
	anInt2121 = 0;
	((Class266) this).anInt2114 = 0;
	anInt2119 = 128;
	anInt2094 = 128;
	((Class266) this).anInt2109 = 256;
	((Class266) this).anInt2128 = 1;
	anIntArray2120 = null;
	((Class266) this).anInt2126 = -1;
	((Class266) this).aBoolean2088 = false;
	anInt2124 = 0;
	((Class266) this).anInt2068 = 2;
	anInt2125 = 128;
	((Class266) this).aBoolean2083 = false;
	anInt2127 = -1;
	((Class266) this).aBoolean2056 = false;
	((Class266) this).aBoolean2080 = false;
	((Class266) this).anInt2118 = -1;
	((Class266) this).aString2129 = "null";
	((Class266) this).aBoolean2106 = false;
	((Class266) this).aBoolean2116 = false;
	((Class266) this).aBoolean2130 = true;
	((Class266) this).anInt2076 = -1;
	((Class266) this).anInt2113 = 256;
	((Class266) this).anInt2131 = 1;
	((Class266) this).anInt2092 = -1;
	anInt2115 = 0;
	((Class266) this).aBoolean2098 = false;
	((Class266) this).aBoolean2082 = true;
	((Class266) this).anIntArray2063 = null;
	((Class266) this).anInt2123 = -1;
	((Class266) this).anInt2132 = 0;
	((Class266) this).aBoolean2133 = true;
	((Class266) this).anInt2077 = -1;
	((Class266) this).anInt2086 = -1;
	anInt2134 = 0;
	anInt2135 = 0;
	((Class266) this).anInt2075 = 0;
    }
    
    static {
	aClass306_2060 = new Class306(0);
	aClass207_2136 = new Class207(21, 3);
	aClass143_2137 = FloatPacket.method852((byte) 97);
    }
}
