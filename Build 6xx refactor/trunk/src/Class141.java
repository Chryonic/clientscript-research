/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class141
{
    static int anInt1099 = -1;
    static int anInt1100;
    
    static final void method2474
	(int argument, int argument_0_, Class_aa argument_1_,
	 GraphicsToolkit argument_2_, int argument_3_, int argument_4_,
	 RsInterface argument_5_, int argument_6_, int argument_7_) {
	Class299 class299
	    = Node_Sub31_Sub13.aClass20_5897.method312(argument_7_,
							  argument ^ ~0xc4);
	if (class299 != null && ((Class299) class299).aBoolean2480
	    && class299.method3525((byte) -125,
				   ClientVariables.instance)) {
	    if (((Class299) class299).anIntArray2512 != null) {
		int[] anLocalInts
		    = new int[((Class299) class299).anIntArray2512.length];
		for (int anLocalInt = 0; anLocalInts.length / 2 > anLocalInt;
		     anLocalInt++) {
		    int anLocalInt_8_;
		    if (Statics.anInt1745 != 4)
			anLocalInt_8_ = ((int) DoublyLinkedNodeP2_Sub6.aFloat4538
					 + Class2_Sub10.anInt3824) & 0x3fff;
		    else
			anLocalInt_8_
			    = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
		    int anLocalInt_9_
			= Node_Sub6.SINETABLE[anLocalInt_8_];
		    int anLocalInt_10_
			= Node_Sub6.COSINETABLE[anLocalInt_8_];
		    if (Statics.anInt1745 != 4) {
			anLocalInt_10_
			    = anLocalInt_10_ * 256 / (Node_Sub11.anInt3945
						      + 256);
			anLocalInt_9_
			    = anLocalInt_9_ * 256 / (Node_Sub11.anInt3945
						     + 256);
		    }
		    anLocalInts[anLocalInt * 2]
			= (((anLocalInt_9_ * (argument_3_
					      + (((Class299) class299)
						 .anIntArray2512
						 [anLocalInt * 2 + 1]) * 4)
			     + anLocalInt_10_ * ((((Class299) class299)
						  .anIntArray2512
						  [anLocalInt * 2]) * 4
						 + argument_0_))
			    >> 14)
			   + (((RsInterface) argument_5_).renderWidth / 2
			      + argument_6_));
		    anLocalInts[anLocalInt * 2 + 1]
			= (-((-(anLocalInt_9_
				* (argument_0_
				   + (((Class299) class299).anIntArray2512
				      [anLocalInt * 2]) * 4))
			      + anLocalInt_10_ * ((((Class299) class299)
						   .anIntArray2512
						   [anLocalInt * 2 + 1]) * 4
						  + argument_3_))
			     >> 14)
			   + ((RsInterface) argument_5_).renderHeight / 2
			   + argument_4_);
		}
		Class326.method3686(argument_2_, anLocalInts,
				    ((Class299) class299).anInt2500,
				    ((RsInterface) argument_5_).anIntArray1902,
				    ((RsInterface) argument_5_).anIntArray1840);
		if (((Class299) class299).anInt2504 > 0) {
		    for (int anLocalInt = 0;
			 anLocalInt < anLocalInts.length / 2 - 1;
			 anLocalInt++) {
			int anLocalInt_11_ = anLocalInts[anLocalInt * 2];
			int anLocalInt_12_ = anLocalInts[anLocalInt * 2 + 1];
			int anLocalInt_13_ = anLocalInts[(anLocalInt + 1) * 2];
			int anLocalInt_14_
			    = anLocalInts[(anLocalInt + 1) * 2 + 1];
			if (anLocalInt_11_ <= anLocalInt_13_) {
			    if (anLocalInt_13_ == anLocalInt_11_
				&& anLocalInt_14_ < anLocalInt_12_) {
				int anLocalInt_15_ = anLocalInt_12_;
				anLocalInt_12_ = anLocalInt_14_;
				anLocalInt_14_ = anLocalInt_15_;
			    }
			} else {
			    int anLocalInt_16_ = anLocalInt_11_;
			    int anLocalInt_17_ = anLocalInt_12_;
			    anLocalInt_11_ = anLocalInt_13_;
			    anLocalInt_12_ = anLocalInt_14_;
			    anLocalInt_13_ = anLocalInt_16_;
			    anLocalInt_14_ = anLocalInt_17_;
			}
			argument_2_.method2068(anLocalInt_11_, anLocalInt_12_,
					       anLocalInt_13_, anLocalInt_14_,
					       (((Class299) class299)
						.anIntArray2518
						[((((Class299) class299)
						   .aByteArray2481[anLocalInt])
						  & 0xff)]),
					       1, argument_1_, argument_6_,
					       argument_4_,
					       ((Class299) class299).anInt2504,
					       ((Class299) class299).anInt2488,
					       (((Class299) class299)
						.anInt2513));
		    }
		    int anLocalInt = anLocalInts[anLocalInts.length - 2];
		    int anLocalInt_18_ = anLocalInts[anLocalInts.length - 1];
		    int anLocalInt_19_ = anLocalInts[0];
		    int anLocalInt_20_ = anLocalInts[1];
		    if (anLocalInt_19_ >= anLocalInt) {
			if (anLocalInt_19_ == anLocalInt
			    && anLocalInt_20_ < anLocalInt_18_) {
			    int anLocalInt_21_ = anLocalInt_18_;
			    anLocalInt_18_ = anLocalInt_20_;
			    anLocalInt_20_ = anLocalInt_21_;
			}
		    } else {
			int anLocalInt_22_ = anLocalInt;
			anLocalInt = anLocalInt_19_;
			int anLocalInt_23_ = anLocalInt_18_;
			anLocalInt_18_ = anLocalInt_20_;
			anLocalInt_19_ = anLocalInt_22_;
			anLocalInt_20_ = anLocalInt_23_;
		    }
		    argument_2_.method2068
			(anLocalInt, anLocalInt_18_, anLocalInt_19_,
			 anLocalInt_20_,
			 (((Class299) class299).anIntArray2518
			  [((((Class299) class299).aByteArray2481
			     [((Class299) class299).aByteArray2481.length - 1])
			    & 0xff)]),
			 1, argument_1_, argument_6_, argument_4_,
			 ((Class299) class299).anInt2504,
			 ((Class299) class299).anInt2488,
			 ((Class299) class299).anInt2513);
		} else {
		    for (int anLocalInt = 0;
			 anLocalInt < anLocalInts.length / 2 - 1; anLocalInt++)
			argument_2_.method2031(anLocalInts[anLocalInt * 2],
					       anLocalInts[anLocalInt * 2 + 1],
					       anLocalInts[anLocalInt * 2 + 2],
					       (anLocalInts
						[anLocalInt * 2 + 2 + 1]),
					       (((Class299) class299)
						.anIntArray2518
						[((((Class299) class299)
						   .aByteArray2481[anLocalInt])
						  & 0xff)]),
					       1, argument_1_, argument_6_,
					       argument_4_);
		    argument_2_.method2031
			(anLocalInts[anLocalInts.length - 2],
			 anLocalInts[anLocalInts.length - 1], anLocalInts[0],
			 anLocalInts[1],
			 (((Class299) class299).anIntArray2518
			  [((((Class299) class299).aByteArray2481
			     [((Class299) class299).aByteArray2481.length - 1])
			    & 0xff)]),
			 1, argument_1_, argument_6_, argument_4_);
		}
	    }
	    Class368 class368 = null;
	    if (((Class299) class299).anInt2509 != -1) {
		class368
		    = class299.method3527(false, argument - 255, argument_2_);
		if (class368 != null)
		    Class128.method2420(argument_0_, argument_3_, argument_4_,
					argument_5_, argument_1_, class368,
					argument_6_, 2);
	    }
	    if (((Class299) class299).aString2478 != null) {
		int anLocalInt = 0;
		if (class368 != null)
		    anLocalInt = class368.method4022();
		AbstractFont abstractFont = Class226.aAbstractFont_1641;
		Class76 class76 = BufferedFile.aClass76_2753;
		if (((Class299) class299).anInt2514 == 1) {
		    abstractFont = Node_Sub47_Sub9.aAbstractFont_6203;
		    class76 = Statics.aClass76_3433;
		}
		if (((Class299) class299).anInt2514 == 2) {
		    abstractFont = Class173.aAbstractFont_1286;
		    class76 = Class37.aClass76_274;
		}
		Class259.method3305(((Class299) class299).aString2478,
				    argument_1_, argument_3_, anLocalInt,
				    argument_5_, argument_6_, 68, class76, abstractFont, argument_4_, argument_0_,
				    ((Class299) class299).anInt2510);
	    }
	}
	if (argument != 255)
	    method2474(-25, 12, null, null, -119, -60, null, -10, 78);
    }
}
