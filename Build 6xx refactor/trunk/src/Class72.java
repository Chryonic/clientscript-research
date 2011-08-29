/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class72
{
    static BigInteger updateServerN;
    static int anInt495 = 0;
    static byte aByte496;
    Class119 aClass119_497 = new Class119();
    /*synthetic*/ static Class aClass498;
    
    static final DoublyLinkedNodeP2_Sub2_Sub5 method1532(int argument, int argument_0_,
					       int argument_1_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 == null)
	    return null;
	DoublyLinkedNodeP2_Sub2_Sub5 class104_sub2_sub5
	    = ((Class148) class148).aClass104_Sub2_Sub5_1132;
	((Class148) class148).aClass104_Sub2_Sub5_1132 = null;
	Class191.method2886(class104_sub2_sub5);
	return class104_sub2_sub5;
    }
    
    static final boolean method1533(int argument, int argument_2_,
				    int argument_3_) {
	if ((argument_2_ & 0x10000) == 0)
	    return false;
	return true;
    }
    
    static final Class356 method1534(int argument, int argument_4_) {
	Class356 class356 = new Class356(argument_4_, false);
	return class356;
    }
    
    static final boolean method1535(GraphicsToolkit argument, int argument_5_,
				    int argument_6_) {
	int anLocalInt = (MapRelated.mapWidth - 104) / 2;
	int anLocalInt_7_ = (MapRelated.mapDepth - 104) / 2;
	boolean anLocalBoolean = true;
	for (int anLocalInt_8_ = anLocalInt; anLocalInt_8_ < anLocalInt + 104;
	     anLocalInt_8_++) {
	    for (int anLocalInt_9_ = anLocalInt_7_;
		 anLocalInt_9_ < anLocalInt_7_ + 104; anLocalInt_9_++) {
		for (int anLocalInt_10_ = argument_5_; anLocalInt_10_ <= 3;
		     anLocalInt_10_++) {
		    if (Class239.method3126(anLocalInt_9_, anLocalInt_8_,
					    argument_5_, false,
					    anLocalInt_10_)) {
			int anLocalInt_11_ = anLocalInt_10_;
			if (Class274.method3388(anLocalInt_8_, anLocalInt_9_,
						1))
			    anLocalInt_11_--;
			if (anLocalInt_11_ >= 0)
			    anLocalBoolean
				&= Class241.method3146(64, anLocalInt_9_,
						       anLocalInt_8_,
						       anLocalInt_11_);
		    }
		}
	    }
	}
	if (!anLocalBoolean)
	    return false;
	int[] anLocalInts = new int[262144];
	for (int anLocalInt_12_ = 0; anLocalInts.length > anLocalInt_12_;
	     anLocalInt_12_++)
	    anLocalInts[anLocalInt_12_] = -16777216;
	Node_Sub29.aClass368_4130
	    = argument.method2047(512, anLocalInts, 0, 512, 512);
	AthmosphericConditions.loadDefaults();
	int anLocalInt_13_
	    = ((((int) (Math.random() * 20.0) - 10 + 238 << 16)
		+ (((int) (Math.random() * 20.0) - 10 + 238 << 8)
		   - (-(int) (Math.random() * 20.0) - 238) - 10))
	       | ~0xffffff);
	int anLocalInt_14_
	    = 238 + (int) (Math.random() * 20.0) - 10 << 16 | ~0xffffff;
	if (argument_6_ != -3)
	    method1536(49);
	int anLocalInt_15_ = ((int) (Math.random() * 8.0) << 8
			      | (int) (Math.random() * 8.0) << 16
			      | (int) (Math.random() * 8.0));
	boolean[][] anLocalBooleans
	    = new boolean[Statics.anInt2225 + 1 + 2][Statics.anInt2225 + 3];
	for (int anLocalInt_16_ = anLocalInt;
	     anLocalInt + 104 > anLocalInt_16_;
	     anLocalInt_16_ += Statics.anInt2225) {
	    for (int anLocalInt_17_ = anLocalInt_7_;
		 anLocalInt_7_ + 104 > anLocalInt_17_;
		 anLocalInt_17_ += Statics.anInt2225) {
		int anLocalInt_18_ = 0;
		int anLocalInt_19_ = 0;
		int anLocalInt_20_ = anLocalInt_16_;
		if (anLocalInt_20_ > 0) {
		    anLocalInt_18_ += 4;
		    anLocalInt_20_--;
		}
		int anLocalInt_21_ = anLocalInt_17_;
		if (anLocalInt_21_ > 0)
		    anLocalInt_21_--;
		int anLocalInt_22_ = anLocalInt_16_ + Statics.anInt2225;
		if (anLocalInt_22_ < 104)
		    anLocalInt_22_++;
		int anLocalInt_23_ = anLocalInt_17_ + Statics.anInt2225;
		if (anLocalInt_23_ < 104) {
		    anLocalInt_23_++;
		    anLocalInt_19_ += 4;
		}
		argument.setClip(0, anLocalInt_19_ + Statics.anInt2225 * 4, anLocalInt_18_ + Statics.anInt2225 * 4, 0);
		argument.clear(-16777216);
		for (int anLocalInt_24_ = argument_5_; anLocalInt_24_ <= 3;
		     anLocalInt_24_++) {
		    for (int anLocalInt_25_ = 0;
			 Statics.anInt2225 >= anLocalInt_25_;
			 anLocalInt_25_++) {
			for (int anLocalInt_26_ = 0;
			     Statics.anInt2225 >= anLocalInt_26_;
			     anLocalInt_26_++)
			    anLocalBooleans[anLocalInt_25_][anLocalInt_26_]
				= Class239.method3126((anLocalInt_21_
						       + anLocalInt_26_),
						      (anLocalInt_20_
						       + anLocalInt_25_),
						      argument_5_, false,
						      anLocalInt_24_);
		    }
		    Statics.aClass_sArray2713[anLocalInt_24_].method3535
			(0, 0, 1024, anLocalInt_20_, anLocalInt_21_,
			 anLocalInt_22_, anLocalInt_23_, anLocalBooleans);
		    if (!DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6566) {
			for (int anLocalInt_27_ = -4;
			     Statics.anInt2225 > anLocalInt_27_;
			     anLocalInt_27_++) {
			    for (int anLocalInt_28_ = -4;
				 Statics.anInt2225 > anLocalInt_28_;
				 anLocalInt_28_++) {
				int anLocalInt_29_
				    = anLocalInt_16_ + anLocalInt_27_;
				int anLocalInt_30_
				    = anLocalInt_17_ + anLocalInt_28_;
				if (anLocalInt_29_ >= anLocalInt
				    && anLocalInt_30_ >= anLocalInt_7_
				    && Class239.method3126(anLocalInt_30_,
							   anLocalInt_29_,
							   argument_5_, false,
							   anLocalInt_24_)) {
				    int anLocalInt_31_ = anLocalInt_24_;
				    if (Class274.method3388(anLocalInt_29_,
							    anLocalInt_30_, 1))
					anLocalInt_31_--;
				    if (anLocalInt_31_ >= 0)
					Class284.method3453
					    (anLocalInt_30_,
					     (anLocalInt_18_
					      + anLocalInt_27_ * 4),
					     argument,
					     (anLocalInt_19_
					      + (-anLocalInt_28_
						 + Statics.anInt2225) * 4
					      - 4),
					     anLocalInt_31_, anLocalInt_29_,
					     anLocalInt_13_, -4,
					     anLocalInt_14_);
				}
			    }
			}
		    }
		}
		if (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6566) {
		    ClipMap clipMap = MapRelated.clippingMaps[argument_5_];
		    for (int anLocalInt_32_ = 0;
			 anLocalInt_32_ < Statics.anInt2225;
			 anLocalInt_32_++) {
			for (int anLocalInt_33_ = 0;
			     Statics.anInt2225 > anLocalInt_33_;
			     anLocalInt_33_++) {
			    int anLocalInt_34_
				= anLocalInt_32_ + anLocalInt_16_;
			    int anLocalInt_35_
				= anLocalInt_17_ + anLocalInt_33_;
			    int anLocalInt_36_
				= (((ClipMap) clipMap).anIntArrayArray1750
				   [(anLocalInt_34_
				     - ((ClipMap) clipMap).anInt1746)]
				   [(anLocalInt_35_
				     - ((ClipMap) clipMap).anInt1743)]);
			    if ((anLocalInt_36_ & 0x40240000) != 0)
				argument.method2020(-119, 4,
						    (anLocalInt_19_
						     + ((-anLocalInt_33_
							 + Statics.anInt2225)
							* 4)
						     - 4),
						    4,
						    (anLocalInt_18_
						     + anLocalInt_32_ * 4),
						    -1713569622);
			    else if ((anLocalInt_36_ & 0x800000) != 0)
				argument.method2061((anLocalInt_19_
						     + ((-anLocalInt_33_
							 + Statics.anInt2225)
							* 4)
						     - 4),
						    (anLocalInt_32_ * 4
						     + anLocalInt_18_),
						    -1713569622, 4,
						    (byte) -92);
			    else if ((anLocalInt_36_ & 0x2000000) == 0) {
				if ((anLocalInt_36_ & 0x8000000) != 0)
				    argument.method2061((anLocalInt_19_
							 + (-anLocalInt_33_
							    + (Statics
							       .anInt2225)) * 4
							 - 4 + 3),
							(anLocalInt_32_ * 4
							 + anLocalInt_18_),
							-1713569622, 4,
							(byte) -86);
				else if ((anLocalInt_36_ & 0x20000000) != 0)
				    argument.method2050(4, 107,
							(anLocalInt_32_ * 4
							 + anLocalInt_18_),
							((Statics.anInt2225
							  - anLocalInt_33_) * 4
							 - 4 + anLocalInt_19_),
							-1713569622);
			    } else
				argument.method2050(4, argument_6_ ^ 0x7e,
						    (anLocalInt_18_
						     + (anLocalInt_32_ * 4
							+ 3)),
						    (anLocalInt_19_
						     + (Statics.anInt2225
							- anLocalInt_33_) * 4
						     - 4),
						    -1713569622);
			}
		    }
		}
		argument.fillRect(anLocalInt_18_, anLocalInt_19_, Statics.anInt2225 * 4, Statics.anInt2225 * 4, anLocalInt_15_, 2);
		Node_Sub29.aClass368_4130.method4013
		    (48 + (anLocalInt_16_ - anLocalInt) * 4,
		     (-((-anLocalInt_7_ + anLocalInt_17_) * 4)
		      - Statics.anInt2225 * 4 + 464),
		     Statics.anInt2225 * 4, Statics.anInt2225 * 4,
		     anLocalInt_18_, anLocalInt_19_);
	    }
	}
	argument.clearClip();
	argument.clear(-16777215);
	Class305.method3596(0);
	Class152.anInt1150 = 0;
	Class294.aCyclicLinkedList_2454.clear();
	if (!DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6566) {
	    for (int anLocalInt_37_ = anLocalInt;
		 anLocalInt_37_ < anLocalInt + 104; anLocalInt_37_++) {
		for (int anLocalInt_38_ = anLocalInt_7_;
		     anLocalInt_38_ < anLocalInt_7_ + 104; anLocalInt_38_++) {
		    for (int anLocalInt_39_ = argument_5_;
			 (argument_5_ + 1 >= anLocalInt_39_
			  && anLocalInt_39_ <= 3);
			 anLocalInt_39_++) {
			if (Class239.method3126(anLocalInt_38_, anLocalInt_37_,
						argument_5_, false,
						anLocalInt_39_)) {
			    Interface2 interface2
				= ((Interface2)
				   Statics.method1330(anLocalInt_39_, anLocalInt_37_, anLocalInt_38_));
			    if (interface2 == null)
				interface2
				    = ((Interface2)
				       (LoadingBar.method2831(anLocalInt_39_, anLocalInt_37_, anLocalInt_38_, (aClass498 != null ? aClass498 : (aClass498 = method1537("Interface2"))))));
			    if (interface2 == null)
				interface2
				    = ((Interface2)
				       (Node_Sub31_Sub15_Sub1.method921
                               (anLocalInt_39_, anLocalInt_37_,
                                       anLocalInt_38_)));
			    if (interface2 == null)
				interface2
				    = (Interface2) (GlTexture_Sub2.method2492(anLocalInt_39_, anLocalInt_37_, anLocalInt_38_));
			    if (interface2 != null) {
				Class266 class266
				    = (Node_Sub31_Sub30.aClass257_5983
					   .method3298
				       ((byte) 92,
					interface2.method7(-23356)));
				if (!((Class266) class266).aBoolean2090
				    || Statics.aBoolean5559) {
				    int anLocalInt_40_
					= ((Class266) class266).anInt2077;
				    if (((Class266) class266).anIntArray2067
					!= null) {
					for (int anLocalInt_41_ = 0;
					     ((((Class266) class266)
					       .anIntArray2067).length
					      > anLocalInt_41_);
					     anLocalInt_41_++) {
					    if ((((Class266) class266)
						 .anIntArray2067
						 [anLocalInt_41_])
						!= -1) {
						Class266 class266_42_
						    = (Node_Sub31_Sub30
							   .aClass257_5983
							   .method3298
						       ((byte) 52,
							(((Class266) class266)
							 .anIntArray2067
							 [anLocalInt_41_])));
						if ((((Class266) class266_42_)
						     .anInt2077)
						    >= 0)
						    anLocalInt_40_
							= (((Class266)
							    class266_42_)
							   .anInt2077);
					    }
					}
				    }
				    if (anLocalInt_40_ >= 0) {
					boolean anLocalBoolean_43_ = false;
					if (anLocalInt_40_ >= 0) {
					    Class299 class299
						= (Node_Sub31_Sub13
						       .aClass20_5897.method312
						   (anLocalInt_40_, -127));
					    if (class299 != null
						&& (((Class299) class299)
						    .aBoolean2482))
						anLocalBoolean_43_ = true;
					}
					int anLocalInt_44_ = anLocalInt_37_;
					int anLocalInt_45_ = anLocalInt_38_;
					if (anLocalBoolean_43_) {
					    int[][] anLocalInts_46_
						= (((ClipMap)
						    (MapRelated.clippingMaps
						     [anLocalInt_39_]))
						   .anIntArrayArray1750);
					    int anLocalInt_47_
						= (((ClipMap)
						    (MapRelated.clippingMaps
						     [anLocalInt_39_]))
						   .anInt1746);
					    int anLocalInt_48_
						= (((ClipMap)
						    (MapRelated.clippingMaps
						     [anLocalInt_39_]))
						   .anInt1743);
					    for (int anLocalInt_49_ = 0;
						 anLocalInt_49_ < 10;
						 anLocalInt_49_++) {
						int anLocalInt_50_
						    = (int) (Math.random()
							     * 4.0);
						if (anLocalInt_50_ == 0
						    && (anLocalInt_44_
							> anLocalInt)
						    && (anLocalInt_37_ - 3
							< anLocalInt_44_)
						    && ((anLocalInts_46_
							 [(anLocalInt_44_ - 1
							   - anLocalInt_47_)]
							 [(anLocalInt_45_
							   - anLocalInt_48_)])
							& 0x2c0108) == 0)
						    anLocalInt_44_--;
						if (anLocalInt_50_ == 1
						    && (anLocalInt + 103
							> anLocalInt_44_)
						    && (anLocalInt_37_ + 3
							> anLocalInt_44_)
						    && ((anLocalInts_46_
							 [(-anLocalInt_47_ + 1
							   + anLocalInt_44_)]
							 [(anLocalInt_45_
							   - anLocalInt_48_)])
							& 0x2c0180) == 0)
						    anLocalInt_44_++;
						if (anLocalInt_50_ == 2
						    && (anLocalInt_7_
							< anLocalInt_45_)
						    && (anLocalInt_38_ - 3
							< anLocalInt_45_)
						    && ((anLocalInts_46_
							 [(-anLocalInt_47_
							   + anLocalInt_44_)]
							 [(anLocalInt_45_ - 1
							   - anLocalInt_48_)])
							& 0x2c0102) == 0)
						    anLocalInt_45_--;
						if (anLocalInt_50_ == 3
						    && (anLocalInt_45_
							< anLocalInt_7_ + 103)
						    && (anLocalInt_38_ + 3
							> anLocalInt_45_)
						    && ((anLocalInts_46_
							 [(-anLocalInt_47_
							   + anLocalInt_44_)]
							 [(-anLocalInt_48_
							   + (anLocalInt_45_
							      + 1))])
							& 0x2c0120) == 0)
						    anLocalInt_45_++;
					    }
					}
					Class84.anIntArray600[(Class152
							       .anInt1150)]
					    = ((Class266) class266).anInt2059;
					Class269.anIntArray2153[(Class152
								 .anInt1150)]
					    = anLocalInt_44_;
					Node_Sub37.anIntArray4168
					    [Class152.anInt1150]
					    = anLocalInt_45_;
					Class152.anInt1150++;
				    }
				}
			    }
			}
		    }
		}
	    }
	    if (Class303.aClass114_2567 != null) {
		((Js5Store) Statics.aJs5Store_1153).discardUnpacked = 1;
		Node_Sub31_Sub13.aClass20_5897.method314(1024, 1, 64);
		for (int anLocalInt_51_ = 0;
		     (anLocalInt_51_
		      < ((Class114) Class303.aClass114_2567).anInt946);
		     anLocalInt_51_++) {
		    int anLocalInt_52_ = (((Class114) Class303.aClass114_2567)
					  .anIntArray947[anLocalInt_51_]);
		    if (anLocalInt_52_ >> 28
			== (((DoublyLinkedNodeP2_Sub2)
			     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			    .lightingHL)) {
			int anLocalInt_53_
			    = (-MapRelated.baseX
			       + ((anLocalInt_52_ & 0xfffee16) >> 14));
			int anLocalInt_54_
			    = (anLocalInt_52_ & 0x3fff) - MapRelated.baseZ;
			if (anLocalInt_53_ >= 0
			    && MapRelated.mapWidth > anLocalInt_53_
			    && anLocalInt_54_ >= 0
			    && anLocalInt_54_ < MapRelated.mapDepth)
			    Class294.aCyclicLinkedList_2454.add(new IntegerNode(anLocalInt_51_));
			else {
			    Class299 class299
				= (Node_Sub31_Sub13.aClass20_5897.method312
				   ((((Class114) Class303.aClass114_2567)
				     .anIntArray948[anLocalInt_51_]),
				    101));
			    if (((Class299) class299).anIntArray2512 != null
				&& (((Class299) class299).anInt2517
				    + anLocalInt_53_) >= 0
				&& (MapRelated.mapWidth
				    > (((Class299) class299).anInt2494
				       + anLocalInt_53_))
				&& (anLocalInt_54_
				    + ((Class299) class299).anInt2483) >= 0
				&& ((((Class299) class299).anInt2492
				     + anLocalInt_54_)
				    < MapRelated.mapDepth))
				Class294.aCyclicLinkedList_2454.add(new IntegerNode(anLocalInt_51_));
			}
		    }
		}
		Node_Sub31_Sub13.aClass20_5897
		    .method314(128, argument_6_ ^ ~0x3, 64);
		((Js5Store) Statics.aJs5Store_1153).discardUnpacked = 2;
		Statics.aJs5Store_1153.forceClearSubFileBuffer();
	    }
	}
	return true;
    }
    
    public static void method1536(int argument) {
	updateServerN = null;
    }
    
    public Class72() {
	/* empty */
    }
    
    /*synthetic*/ static Class method1537(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	updateServerN
	    = (new BigInteger
	       ("952b9b4dee13fb995ac5e3e88183d143c3c5988d3af155e9c1134ba1ce36408d087d06fcd09fa6a2b7209a1348ccc35af3b440db87c92aab0eb4455d5f8007fbbd9d5d074a61ef0a1c53d869805e6d64ed52ea9b11853dcac93ac258cc2284a311e5688b1312bec6e9c2025f9f9758faa6cc0f96849d2727dd5f0f139a872a106cd5ff5fda8612c79cef29a0511e25449bb476c8fd37e79d097c3294563d9922d37d1dcc48268e0654dd9baf8f825865489976cfa0ca9c511cb4813284732a6f3ea79483c6815f5dfef27ab45c3195988f29b3a10d7a1b6891ae488274d9247a6a75faab92dd000a50f7836ebdcc76923e21881f0388ace393022a436183b177dba0b47dc1eee7293f76ae015a0dc5438b77e3146b55b489d744ac6bbb2551f5d60a11e4be3c97a2ed3bc3652f07ec97be74001a3d2c573efef1f855fdc0fe3a725863de691b5d7e9523915c880133df49171f97e90235f7fc621dde2bab861f6fea708217f1bb8e243b24a999a018c6abe3763f36b99fa73fa1becfe3938dd9c2a689ec07d1b7d8f51f597de5188a57117b127d8520fdd463c0029700e02f62900a6a6610d58a5e498b19963df41614388a92485892791d03f2371485486b9f375753adface025134647eeaa31268ef7cbaaae2abaca42a3fe2cede731d47ecbaf59b19a1daa6eef8c0635740686f896db83539abe835815103b63b17c7554f",
		16));
    }
}
