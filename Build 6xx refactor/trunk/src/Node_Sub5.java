/* Class59_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub5 extends Node
{
    int[] anIntArray3895 = new int[1];
    static Class320 aClass320_3896 = new Class320(1);
    int[] anIntArray3897 = { -1 };
    
    final Class167 method554(int argument_0_, int argument_1_,
			     boolean argument_2_, int argument_3_,
			     int argument_4_, Class367 argument_5_,
			     boolean argument_6_, Class22 argument_7_,
			     GraphicsToolkit argument_8_, int argument_9_) {
	Class167 class167 = null;
	int anLocalInt = argument_0_;
	Class354 class354 = null;
	if (argument_3_ != -1)
	    class354
		= Class157.aClass41_1159.method421((byte) -75, argument_3_);
	int[] anLocalInts = ((Node_Sub5) this).anIntArray3897;
	if (class354 != null && ((Class354) class354).anIntArray2979 != null) {
	    anLocalInts = new int[((Class354) class354).anIntArray2979.length];
	    for (int anLocalInt_10_ = 0;
		 ((Class354) class354).anIntArray2979.length > anLocalInt_10_;
		 anLocalInt_10_++) {
		int anLocalInt_11_
		    = ((Class354) class354).anIntArray2979[anLocalInt_10_];
		if (anLocalInt_11_ >= 0
		    && (((Node_Sub5) this).anIntArray3897.length
			> anLocalInt_11_))
		    anLocalInts[anLocalInt_10_]
			= ((Node_Sub5) this).anIntArray3897[anLocalInt_11_];
		else
		    anLocalInts[anLocalInt_10_] = -1;
	    }
	}
	boolean anLocalBoolean = false;
	boolean anLocalBoolean_12_ = false;
	boolean anLocalBoolean_13_ = false;
	boolean anLocalBoolean_14_ = false;
	int anLocalInt_15_ = -1;
	int anLocalInt_16_ = -1;
	int anLocalInt_17_ = 0;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6 = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_18_ = null;
	if (argument_5_ != null) {
	    anLocalInt_15_
		= ((Class367) argument_5_).anIntArray3096[argument_9_];
	    anLocalInt |= 0x20;
	    int anLocalInt_19_ = anLocalInt_15_ >>> 16;
	    class59_sub51_sub6
		= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3754(-4849,
							       anLocalInt_19_);
	    anLocalInt_15_ &= 0xffff;
	    if (class59_sub51_sub6 != null) {
		anLocalBoolean_12_
		    |= class59_sub51_sub6.method1205((byte) -114,
						     anLocalInt_15_);
		anLocalBoolean
		    = (anLocalBoolean
		       | class59_sub51_sub6.method1206(!argument_2_,
						       anLocalInt_15_));
		anLocalBoolean_14_
		    |= class59_sub51_sub6.method1204(anLocalInt_15_, -1);
		anLocalBoolean_13_ |= ((Class367) argument_5_).aBoolean3112;
	    }
	    if ((((Class367) argument_5_).aBoolean3110
		 || Node_Sub31_Sub9.aBoolean5877)
		&& argument_4_ != -1
		&& (argument_4_
		    < ((Class367) argument_5_).anIntArray3096.length)) {
		anLocalInt_16_
		    = ((Class367) argument_5_).anIntArray3096[argument_4_];
		anLocalInt_17_
		    = ((Class367) argument_5_).anIntArray3094[argument_9_];
		int anLocalInt_20_ = anLocalInt_16_ >>> 16;
		anLocalInt_16_ &= 0xffff;
		if (anLocalInt_19_ == anLocalInt_20_)
		    class59_sub51_sub6_18_ = class59_sub51_sub6;
		else
		    class59_sub51_sub6_18_
			= DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
			      .method3754(-4849, anLocalInt_16_ >>> 16);
		if (class59_sub51_sub6_18_ != null) {
		    anLocalBoolean_12_
			|= class59_sub51_sub6_18_.method1205((byte) -114,
							     anLocalInt_16_);
		    anLocalBoolean
			|= class59_sub51_sub6_18_.method1206(false,
							     anLocalInt_16_);
		    anLocalBoolean_14_
			|= class59_sub51_sub6_18_.method1204(anLocalInt_16_,
							     -1);
		}
	    }
	    if (anLocalBoolean_12_)
		anLocalInt |= 0x80;
	    if (anLocalBoolean)
		anLocalInt |= 0x100;
	    if (anLocalBoolean_13_)
		anLocalInt |= 0x200;
	    if (anLocalBoolean_14_)
		anLocalInt |= 0x400;
	}
	long l = method555((argument_7_ != null
			    ? ((Class22) argument_7_).anIntArray150 : null),
			   argument_6_, 5, argument_3_, anLocalInts);
	if (Class62_Sub5.aClass149_4383 != null)
	    class167
		= (Class167) Class62_Sub5.aClass149_4383.get(l);
	if (class167 == null
	    || argument_8_.andPow(class167.ua(), anLocalInt) != 0) {
	    if (class167 != null)
		anLocalInt = argument_8_.or(anLocalInt, class167.ua());
	    int anLocalInt_21_ = anLocalInt;
	    boolean anLocalBoolean_22_ = false;
	    for (int anLocalInt_23_ = 0; anLocalInt_23_ < anLocalInts.length;
		 anLocalInt_23_++) {
		if (anLocalInts[anLocalInt_23_] != -1
		    && !Class253_Sub1_Sub1.aClass365_6632.method3975
			    (126, anLocalInts[anLocalInt_23_])
			    .method4062(argument_6_, -1, null))
		    anLocalBoolean_22_ = true;
	    }
	    if (anLocalBoolean_22_)
		return null;
	    Class101[] class101s = new Class101[anLocalInts.length];
	    for (int anLocalInt_24_ = 0; anLocalInts.length > anLocalInt_24_;
		 anLocalInt_24_++) {
		if (anLocalInts[anLocalInt_24_] != -1)
		    class101s[anLocalInt_24_]
			= Class253_Sub1_Sub1.aClass365_6632.method3975
			      (125, anLocalInts[anLocalInt_24_])
			      .method4048(null, argument_6_, -28);
	    }
	    if (class354 != null
		&& ((Class354) class354).anIntArrayArray2958 != null) {
		for (int anLocalInt_25_ = 0;
		     (anLocalInt_25_
		      < ((Class354) class354).anIntArrayArray2958.length);
		     anLocalInt_25_++) {
		    if ((((Class354) class354).anIntArrayArray2958
			 [anLocalInt_25_]) != null
			&& class101s[anLocalInt_25_] != null) {
			int anLocalInt_26_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][0]);
			int anLocalInt_27_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][1]);
			int anLocalInt_28_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][2]);
			int anLocalInt_29_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][3]);
			int anLocalInt_30_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][4]);
			int anLocalInt_31_
			    = (((Class354) class354).anIntArrayArray2958
			       [anLocalInt_25_][5]);
			if (anLocalInt_29_ != 0 || anLocalInt_30_ != 0
			    || anLocalInt_31_ != 0)
			    class101s[anLocalInt_25_].method1738
				(anLocalInt_30_, 1046089902, anLocalInt_29_,
				 anLocalInt_31_);
			if (anLocalInt_26_ != 0 || anLocalInt_27_ != 0
			    || anLocalInt_28_ != 0)
			    class101s[anLocalInt_25_].method1752
				(anLocalInt_28_, anLocalInt_26_,
				 anLocalInt_27_, 103);
		    }
		}
	    }
	    Class101 class101 = new Class101(class101s, class101s.length);
	    if (argument_7_ != null)
		anLocalInt_21_ |= 0x4000;
	    class167 = argument_8_.method2057(class101, anLocalInt_21_,
					      Class341.anInt2876, 64, 850);
	    if (argument_7_ != null) {
		for (int anLocalInt_32_ = 0; anLocalInt_32_ < 5;
		     anLocalInt_32_++) {
		    for (int anLocalInt_33_ = 0;
			 (Statics.aShortArrayArrayArray270.length
			  > anLocalInt_33_);
			 anLocalInt_33_++) {
			if ((((Class22) argument_7_).anIntArray150
			     [anLocalInt_32_])
			    < (Statics.aShortArrayArrayArray270[anLocalInt_33_]
			       [anLocalInt_32_]).length)
			    class167.ia((Class42.aShortArrayArray3543
					 [anLocalInt_33_][anLocalInt_32_]),
					(Statics.aShortArrayArrayArray270
					 [anLocalInt_33_][anLocalInt_32_]
					 [(((Class22) argument_7_)
					   .anIntArray150[anLocalInt_32_])]));
		    }
		}
	    }
	    if (Class62_Sub5.aClass149_4383 != null) {
		class167.s(anLocalInt);
		Class62_Sub5.aClass149_4383.put(class167, l);
	    }
	}
	if (argument_5_ == null || class59_sub51_sub6 == null)
	    return class167;
	Class167 class167_34_
	    = class167.method2651((byte) 1, anLocalInt, argument_2_);
	class167_34_.method2657(0, anLocalInt_15_, argument_1_ - 1,
				((Class367) argument_5_).aBoolean3112,
				class59_sub51_sub6, anLocalInt_16_,
				anLocalInt_17_, (byte) -97,
				class59_sub51_sub6_18_);
	return class167_34_;
    }
    
    private final long method555(int[] argument_35_, boolean argument_36_,
				 int argument_37_, int argument_38_,
				 int[] argument_39_) {
	long[] ls = Class1.aLongArray3504;
	if (argument_37_ != 5)
	    return 81L;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) (argument_38_ >> 8)) & 0xffL)];
	l = ls[(int) ((l ^ (long) argument_38_) & 0xffL)] ^ l >>> 8;
	for (int anLocalInt = 0; anLocalInt < argument_39_.length;
	     anLocalInt++) {
	    l = l >>> 8 ^ ls[(int) (((long) (argument_39_[anLocalInt] >> 24)
				     ^ l)
				    & 0xffL)];
	    l = l >>> 8 ^ ls[(int) ((l
				     ^ (long) (argument_39_[anLocalInt] >> 16))
				    & 0xffL)];
	    l = ls[(int) ((l ^ (long) (argument_39_[anLocalInt] >> 8))
			  & 0xffL)] ^ l >>> 8;
	    l = l >>> 8 ^ ls[(int) ((l ^ (long) argument_39_[anLocalInt])
				    & 0xffL)];
	}
	if (argument_35_ != null) {
	    for (int anLocalInt = 0; anLocalInt < 5; anLocalInt++)
		l = l >>> 8 ^ ls[(int) (((long) argument_35_[anLocalInt] ^ l)
					& 0xffL)];
	}
	l = ls[(int) (((long) (argument_36_ ? 1 : 0) ^ l) & 0xffL)] ^ l >>> 8;
	return l;
    }
    
    static final void method556(boolean argument) {
	Statics.aClass51_1250.method474((byte) -85);
	Statics.aClass297_3521.method3515(1);
	DoublyLinkedNodeP2_Sub5.aClass383_4536.method4113(-121);
	Node_Sub31_Sub30.aClass257_5983.method3302((byte) -46);
	DiskBackedCache.aClass26_2709.method347((byte) -128);
	Class253_Sub1_Sub1.aClass365_6632.method3973((byte) -63);
	DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3750(0);
	Class194.aClass225_1414.method3048((byte) 100);
	ClientVariables.varbitSource.method1697();
	JagexHash.aClass58_1682.method524((byte) -86);
	Class111.aClanVarbitSource_916.method2863();
	Class157.aClass41_1159.method419(false);
	Class206.aClass374_1482.method4078((byte) 24);
	Node_Sub31_Sub13.aClass20_5897.method317((byte) 65);
	Class349.aClass313_2918.method3619((byte) 48);
	Class62_Sub27.aClass362_4457.method3963(-103);
	Statics.aClass333_2631.method3726(-18300);
	InputStream_Sub2.aClass64_35.method1486(4681);
	Class48.aClass73_343.method1544(true);
	Class363.aClass241_3064.method3147(0);
	Class86.aClass264_638.method3328((byte) -82);
	Class79.aClass115_561.method2370(-120);
	Class92.method1688((byte) -100);
	Class62_Sub3.method1363(-29152);
	Node_Sub31_Sub11.method909(1);
	Class201.method2917((byte) 39);
	Class266.method3348((byte) -11);
	Rs2DPainter.aClass149_4048.method2540(-119);
	Class165.aClass149_1208.method2540(13);
	Statics.aClass149_4512.method2540(-120);
	Class350_Sub1.aClass149_5423.method2540(45);
	Cs2Runtime.aClass149_2651.method2540(-127);
    }
    
    public static void method557(boolean argument) {
	aClass320_3896 = null;
    }
    
    static final void method558(int argument) {
	Class_aa.aClass368Array55 = null;
	Class79.aClass368Array562 = null;
	Class42.aClass368Array3536 = null;
	Class43.aClass368Array310 = null;
	IOException_Sub1.aClass368Array40 = null;
	Class17.aClass368Array123 = null;
	Class173.aAbstractFont_1286 = null;
	Node_Sub47_Sub9.aAbstractFont_6203 = null;
	Class341.aClass368Array2878 = null;
	Node_Sub32_Sub2.aClass368Array6063 = null;
	Class356.aClass368_3014 = null;
	Class33.aClass368Array222 = null;
	Class388.aClass368Array3279 = null;
	Class353_Sub6.aClass368Array5508 = null;
	Class62_Sub3.aClass368Array4370 = null;
	tia_sub_35_Sub1DoublyLinked.aClass368_6660 = null;
	Class353.aClass368Array2952 = null;
	Class226.aAbstractFont_1641 = null;
    }
    
    public Node_Sub5() {
	/* empty */
    }
}
