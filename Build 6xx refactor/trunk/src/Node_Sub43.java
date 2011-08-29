/* Class59_Sub43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub43 extends Node
{
    int anInt4207;
    int anInt4208;
    int anInt4209;
    int anInt4210;
    int anInt4211;
    int anInt4212;
    int anInt4213;
    int anInt4214;
    int anInt4215;
    int anInt4216;
    Class384 aClass384_4217;
    int anInt4218;
    int anInt4219;
    static Class316 aClass316_4220;
    int anInt4221;
    int anInt4222;
    int anInt4223;
    Node_Sub6 aClass59_Sub6_4224;
    int anInt4225;
    Node_Sub9_Sub4 aClass59_Sub9_Sub4_4226;
    Node_Sub40_Sub1 aClass59_Sub40_Sub1_4227;
    int anInt4228;
    static int[] anIntArray4229;
    
    public static void method1080(int argument) {
	anIntArray4229 = null;
	aClass316_4220 = null;
    }
    
    final void method1081(byte argument_0_) {
	((Node_Sub43) this).aClass384_4217 = null;
	((Node_Sub43) this).aClass59_Sub6_4224 = null;
	((Node_Sub43) this).aClass59_Sub9_Sub4_4226 = null;
	((Node_Sub43) this).aClass59_Sub40_Sub1_4227 = null;
    }
    
    static final void method1082(int argument, boolean argument_1_,
				 int argument_2_) {
	if (Class179.aFloat1328 > Class179.aFloat1335) {
	    Class179.aFloat1335 += (double) Class179.aFloat1335 / 30.0;
	    if (Class179.aFloat1335 > Class179.aFloat1328)
		Class179.aFloat1335 = Class179.aFloat1328;
	    Class279.method3417((byte) 108);
	    Class179.anInt1332 = (int) Class179.aFloat1335 >> 1;
	    Class179.aByteArrayArrayArray1326
		= GlTexture_Sub4_Sub1.method2507(Class179.anInt1332, 8);
	} else if (Class179.aFloat1328 < Class179.aFloat1335) {
	    Class179.aFloat1335 -= (double) Class179.aFloat1335 / 30.0;
	    if (Class179.aFloat1328 > Class179.aFloat1335)
		Class179.aFloat1335 = Class179.aFloat1328;
	    Class279.method3417((byte) 87);
	    Class179.anInt1332 = (int) Class179.aFloat1335 >> 1;
	    Class179.aByteArrayArrayArray1326
		= GlTexture_Sub4_Sub1.method2507(Class179.anInt1332, 8);
	}
	if (Statics.anInt2726 != -1 && Class55.anInt409 != -1) {
	    int anLocalInt
		= -Node_Sub31_Sub21.anInt5930 + Statics.anInt2726;
	    if (anLocalInt < 2 || anLocalInt > 2)
		anLocalInt /= 8;
	    int anLocalInt_3_ = -AbstractFont.anInt418 + Class55.anInt409;
	    Node_Sub31_Sub21.anInt5930
		= anLocalInt + Node_Sub31_Sub21.anInt5930;
	    if (anLocalInt_3_ < 2 || anLocalInt_3_ > 2)
		anLocalInt_3_ /= 8;
	    AbstractFont.anInt418 += anLocalInt_3_;
	    if (anLocalInt == 0 && anLocalInt_3_ == 0) {
		Statics.anInt2726 = -1;
		Class55.anInt409 = -1;
	    }
	    Class279.method3417((byte) 83);
	}
	if (Class68.anInt3583 <= 0) {
	    Class20.anInt131 = -1;
	    Statics.anInt1080 = -1;
	} else {
	    Node_Sub31_Sub39.anInt6051--;
	    if (Node_Sub31_Sub39.anInt6051 == 0) {
		Class68.anInt3583--;
		Node_Sub31_Sub39.anInt6051 = 100;
	    }
	}
	if (Class62_Sub18.aBoolean4423 && Statics.aCyclicLinkedList_429 != null) {
	    for (Node_Sub8 class59_sub8
		     = ((Node_Sub8)
			Statics.aCyclicLinkedList_429.getFirst());
		 class59_sub8 != null;
		 class59_sub8
		     = (Node_Sub8) Statics.aCyclicLinkedList_429.getNext()) {
		Class299 class299
		    = Class179.aClass20_1324.method312((((Node_Sub7)
							 (((Node_Sub8)
							   class59_sub8)
							  .aClass59_Sub7_3926))
							.anInt3910),
						       93);
		if (!class59_sub8.method572(argument_2_, (byte) -45,
					    argument)) {
		    if (((Node_Sub7)
			 ((Node_Sub8) class59_sub8).aClass59_Sub7_3926)
			.aBoolean3913) {
			((Node_Sub7) (((Node_Sub8) class59_sub8)
					 .aClass59_Sub7_3926)).aBoolean3913
			    = false;
			Cs2Runtime.executeActionScript(Class211.aClass211_3715, ((Node_Sub7) (((Node_Sub8) class59_sub8).aClass59_Sub7_3926)).anInt3910, ((Class299) class299).anInt2490);
		    }
		} else {
		    if (((Class299) class299).aStringArray2507 != null) {
			if (((Class299) class299).aStringArray2507[4] != null)
			    Class173.method2769
				(false,
				 ((Class299) class299).aStringArray2507[4],
				 false, -1, ((Class299) class299).aString2485,
				 (byte) -84, true,
				 ((Class299) class299).anInt2490, 1007,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910,
				 0, -1,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910);
			if (((Class299) class299).aStringArray2507[3] != null)
			    Class173.method2769
				(false,
				 ((Class299) class299).aStringArray2507[3],
				 false, -1, ((Class299) class299).aString2485,
				 (byte) -91, true,
				 ((Class299) class299).anInt2490, 1006,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910,
				 0, -1,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910);
			if (((Class299) class299).aStringArray2507[2] != null)
			    Class173.method2769
				(false,
				 ((Class299) class299).aStringArray2507[2],
				 false, -1, ((Class299) class299).aString2485,
				 (byte) -115, true,
				 ((Class299) class299).anInt2490, 1011,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910,
				 0, -1,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910);
			if (((Class299) class299).aStringArray2507[1] != null)
			    Class173.method2769
				(false,
				 ((Class299) class299).aStringArray2507[1],
				 false, -1, ((Class299) class299).aString2485,
				 (byte) 86, true,
				 ((Class299) class299).anInt2490, 1002,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910,
				 0, -1,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910);
			if (((Class299) class299).aStringArray2507[0] != null)
			    Class173.method2769
				(false,
				 ((Class299) class299).aStringArray2507[0],
				 false, -1, ((Class299) class299).aString2485,
				 (byte) -100, true,
				 ((Class299) class299).anInt2490, 1010,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910,
				 0, -1,
				 (long) ((Node_Sub7)
					 (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).anInt3910);
		    }
		    if (!((Node_Sub7) (((Node_Sub8) class59_sub8)
					  .aClass59_Sub7_3926)).aBoolean3913) {
			((Node_Sub7) (((Node_Sub8) class59_sub8)
					 .aClass59_Sub7_3926)).aBoolean3913
			    = true;
			Cs2Runtime.executeActionScript(Class211.aClass211_6309, ((Node_Sub7) (((Node_Sub8) class59_sub8).aClass59_Sub7_3926)).anInt3910, ((Class299) class299).anInt2490);
		    }
		    if (((Node_Sub7)
			 ((Node_Sub8) class59_sub8).aClass59_Sub7_3926)
			.aBoolean3913)
			Cs2Runtime.executeActionScript(Class211.aClass211_1160, ((Node_Sub7) (((Node_Sub8) class59_sub8).aClass59_Sub7_3926)).anInt3910, ((Class299) class299).anInt2490);
		}
	    }
	}
    }
}
