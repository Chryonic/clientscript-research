/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class157
{
    static Class41 aClass41_1159;
    static int[][][] anIntArrayArrayArray1162;
    /*synthetic*/ static Class aClass1163;
    
    static final void method2588
	(byte argument, int[] argument_0_, int argument_1_,
	 byte[][][] argument_2_, int argument_3_, int[] argument_4_,
	 int argument_5_, int[] argument_6_, int argument_7_, int argument_8_,
	 int[] argument_9_, int argument_10_, boolean argument_11_,
	 boolean argument_12_, int[] argument_13_, int argument_14_,
	 int argument_15_, int argument_16_) {
	if (Class50.anInt365 != -1) {
	    int[] anLocalInts = Statics.aGraphicsToolkit5822.Y();
	    int anLocalInt = anLocalInts[0];
	    int anLocalInt_17_ = anLocalInts[1];
	    int anLocalInt_18_ = anLocalInts[2];
	    int anLocalInt_19_ = anLocalInts[3];
	    int anLocalInt_20_ = anLocalInt_18_;
	    int anLocalInt_21_ = anLocalInt_19_;
	    if (Class50.anInt365 == 1) {
		anLocalInt_20_ = (int) ((double) Class353_Sub9.anInt5523
					* (double) anLocalInt_18_
					/ (double) Class189_Sub3.anInt5647);
		anLocalInt_21_ = (int) ((double) Class353_Sub9.anInt5523
					* (double) anLocalInt_19_
					/ (double) Class189_Sub3.anInt5647);
	    }
	    if (!Class18.aBoolean124) {
		if (Class50.anInt365 == 1)
		    Statics.method281((byte) 27);
		int anLocalInt_22_ = argument_16_ - DoublyLinkedNodeP2_Sub6.anInt4543;
		int anLocalInt_23_ = -Class106.anInt864 + argument_1_;
		int anLocalInt_24_ = argument_3_ - Class158.anInt1166;
		int anLocalInt_25_
		    = (int) (((Node_Sub44.aDouble4253
			       * (double) anLocalInt_23_)
			      + ((double) anLocalInt_22_
				 * Node_Sub31_Sub28.aDouble5977)
			      + Class110.aDouble910 * (double) anLocalInt_24_)
			     * (double) anLocalInt_20_ / (double) argument_5_);
		int anLocalInt_26_ = (int) ((double) anLocalInt_21_
					    * ((Statics.aDouble5742
						* (double) anLocalInt_22_)
					       + (Class148.aDouble1121
						  * (double) anLocalInt_23_)
					       + (Class274.aDouble2196
						  * (double) anLocalInt_24_))
					    / (double) argument_5_);
		double d
		    = ((double) anLocalInt_22_ * Class62_Sub27.aDouble4456
		       + Class62_Sub29.aDouble4465 * (double) anLocalInt_23_
		       + Class183.aDouble1379 * (double) anLocalInt_24_);
		int anLocalInt_27_
		    = (-GraphicsToolkit.anInt940
		       + (anLocalInt_25_ + Node_Sub18.anInt4006));
		int anLocalInt_28_
		    = -Statics.anInt582 + Class344.anInt3590 + anLocalInt_26_;
		int anLocalInt_29_ = anLocalInt_27_ + Class349.anInt2921;
		int anLocalInt_30_ = Class353_Sub9.anInt5523 + anLocalInt_28_;
		if ((anLocalInt_27_ >= 0 && anLocalInt_28_ >= 0
		     && anLocalInt_29_ <= dba_sub_772_Sub2.anInt6366
		     && anLocalInt_30_ <= Class189_Sub3.anInt5647)
		    || Class50.anInt365 == 2) {
		    Statics.anInt3831 = anLocalInt_27_;
		    Class272.anInt2174 = anLocalInt_28_;
		    if (Class50.anInt365 == 2)
			Class194.aDouble1415 = -d;
		} else if (anLocalInt_29_ <= 0 || anLocalInt_30_ <= 0
			   || anLocalInt_27_ >= dba_sub_772_Sub2.anInt6366
			   || anLocalInt_28_ >= Class189_Sub3.anInt5647)
		    Class18.aBoolean124 = true;
		else {
		    int anLocalInt_31_
			= -Node_Sub18.anInt4006 + anLocalInt_27_;
		    int anLocalInt_32_ = -Class344.anInt3590 + anLocalInt_28_;
		    int anLocalInt_33_ = 0;
		    int anLocalInt_34_ = 0;
		    int anLocalInt_35_ = 0;
		    int anLocalInt_36_ = 0;
		    double d_37_ = 0.0;
		    if (Class50.anInt365 == 0) {
			d_37_ = Class194.aDouble1415 + d;
			anLocalInt_33_ = anLocalInt_31_;
			anLocalInt_34_ = anLocalInt_32_;
		    } else if (Class50.anInt365 == 1) {
			anLocalInt_35_
			    = anLocalInt_31_ / Node_Sub31_Sub2.anInt5844;
			anLocalInt_36_ = anLocalInt_32_ / Class5.anInt67;
			anLocalInt_34_ = anLocalInt_36_ * Class5.anInt67;
			anLocalInt_33_
			    = Node_Sub31_Sub2.anInt5844 * anLocalInt_35_;
			d_37_
			    = ((Class194.aDouble1415 + d)
			       * (double) (anLocalInt_33_ * anLocalInt_31_
					   + anLocalInt_34_ * anLocalInt_32_)
			       / (double) (anLocalInt_31_ * anLocalInt_31_
					   + anLocalInt_32_ * anLocalInt_32_));
		    }
		    d_37_ = -d_37_;
		    int anLocalInt_38_ = 0;
		    int anLocalInt_39_ = 0;
		    int anLocalInt_40_ = 0;
		    int anLocalInt_41_ = 0;
		    int anLocalInt_42_ = 0;
		    int anLocalInt_43_ = 0;
		    int anLocalInt_44_;
		    int anLocalInt_45_;
		    int anLocalInt_46_;
		    int anLocalInt_47_;
		    if (anLocalInt_33_ >= 0) {
			anLocalInt_46_ = 0;
			anLocalInt_44_
			    = -anLocalInt_33_ + dba_sub_772_Sub2.anInt6366;
			if (Class50.anInt365 == 1) {
			    anLocalInt_42_ = anLocalInt_35_;
			    anLocalInt_40_ = Class85.anInt604 - anLocalInt_35_;
			}
			anLocalInt_47_ = anLocalInt_33_;
			anLocalInt_45_ = anLocalInt_44_;
		    } else {
			anLocalInt_44_
			    = dba_sub_772_Sub2.anInt6366 + anLocalInt_33_;
			anLocalInt_45_ = 0;
			anLocalInt_46_ = -anLocalInt_33_;
			if (Class50.anInt365 == 1) {
			    anLocalInt_42_ = -anLocalInt_35_;
			    anLocalInt_40_ = 0;
			}
			anLocalInt_47_ = anLocalInt_46_;
		    }
		    int anLocalInt_48_;
		    int anLocalInt_49_;
		    int anLocalInt_50_;
		    int anLocalInt_51_;
		    int anLocalInt_52_;
		    int anLocalInt_53_;
		    if (anLocalInt_34_ >= 0) {
			anLocalInt_49_
			    = -anLocalInt_34_ + Class189_Sub3.anInt5647;
			anLocalInt_50_ = 0;
			anLocalInt_52_ = 0;
			if (Class50.anInt365 == 1) {
			    anLocalInt_41_ = 0;
			    anLocalInt_38_ = Class24.anInt161 - anLocalInt_36_;
			    anLocalInt_39_ = anLocalInt_36_;
			    anLocalInt_43_ = anLocalInt_38_;
			}
			anLocalInt_53_ = anLocalInt_49_;
			anLocalInt_51_ = anLocalInt_34_;
			anLocalInt_48_ = anLocalInt_49_;
		    } else {
			anLocalInt_48_ = 0;
			anLocalInt_49_
			    = anLocalInt_34_ + Class189_Sub3.anInt5647;
			anLocalInt_50_ = -anLocalInt_34_;
			anLocalInt_51_ = anLocalInt_50_;
			if (Class50.anInt365 == 1) {
			    anLocalInt_39_ = -anLocalInt_36_;
			    anLocalInt_38_ = 0;
			    anLocalInt_43_ = Class24.anInt161 + anLocalInt_36_;
			    anLocalInt_41_ = anLocalInt_39_;
			}
			anLocalInt_52_ = anLocalInt_51_;
			anLocalInt_53_ = anLocalInt_49_;
		    }
		    Class366 class366
			= ((Class314) Class15.aClass314_121).aClass366_2600;
		    for (DoublyLinkedNodeP2_Sub10 class104_sub10
			     = (DoublyLinkedNodeP2_Sub10) class366.method3986(0);
			 class104_sub10 != null;
			 class104_sub10 = ((DoublyLinkedNodeP2_Sub10)
					   class366.method3992((byte) -107))) {
			DoublyLinkedNodeP2_Sub9[] class104_sub9s
			    = (((DoublyLinkedNodeP2_Sub10) class104_sub10)
			       .aClass104_Sub9Array4595);
			boolean anLocalBoolean = true;
			for (int anLocalInt_54_ = 0;
			     anLocalInt_54_ < class104_sub9s.length;
			     anLocalInt_54_++) {
			    DoublyLinkedNodeP2_Sub9 class104_sub9
				= class104_sub9s[anLocalInt_54_];
			    int anLocalInt_55_
				= ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4588;
			    int anLocalInt_56_
				= ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4589;
			    int anLocalInt_57_
				= ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4590;
			    int anLocalInt_58_
				= ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4587;
			    ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4588
				= anLocalInt_55_ -= anLocalInt_33_;
			    int anLocalInt_59_
				= ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4586;
			    ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4589
				= anLocalInt_56_ -= anLocalInt_34_;
			    ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4590
				= anLocalInt_57_
				= -anLocalInt_33_ + anLocalInt_57_;
			    ((DoublyLinkedNodeP2_Sub9) class104_sub9).anInt4587
				= anLocalInt_58_ -= anLocalInt_34_;
			    if (anLocalBoolean) {
				int anLocalInt_60_
				    = ((anLocalInt_55_ < anLocalInt_57_
					? anLocalInt_55_ : anLocalInt_57_)
				       - anLocalInt_59_);
				if (dba_sub_772_Sub2.anInt6366
				    >= anLocalInt_60_) {
				    int anLocalInt_61_
					= ((anLocalInt_58_ <= anLocalInt_56_
					    ? anLocalInt_58_ : anLocalInt_56_)
					   - anLocalInt_59_);
				    if (anLocalInt_61_
					<= Class189_Sub3.anInt5647) {
					int anLocalInt_62_
					    = (((anLocalInt_57_
						 <= anLocalInt_55_)
						? anLocalInt_55_
						: anLocalInt_57_)
					       + anLocalInt_59_);
					if (anLocalInt_62_ >= 0) {
					    int anLocalInt_63_
						= (((anLocalInt_58_
						     <= anLocalInt_56_)
						    ? anLocalInt_56_
						    : anLocalInt_58_)
						   + anLocalInt_59_);
					    if (anLocalInt_63_ >= 0)
						anLocalBoolean = false;
					}
				    }
				}
			    }
			}
			if (anLocalBoolean) {
			    class104_sub10.unlink();
			    Class353_Sub9.method3915(class104_sub10,
						     (byte) 72);
			}
		    }
		    if (Class50.anInt365 == 0)
			Statics.aGraphicsToolkit5822.method2087
			    (Node_Sub31_Sub16.anInterface15_5912);
		    Statics.aGraphicsToolkit5822.F(-anLocalInt_33_,
						       -anLocalInt_34_);
		    Statics.aGraphicsToolkit5822.b(anLocalInt_46_,
						       anLocalInt_50_,
						       anLocalInt_44_,
						       anLocalInt_49_, d_37_);
		    Node_Sub30.method861((byte) -53,
                    Class194.aDouble1415 + d_37_);
		    Class87.aDouble3559 = d_37_ + Class194.aDouble1415;
		    if (Class50.anInt365 != 1) {
			Class284.anInt2279 = anLocalInt_21_;
			Node_Sub52.anInt4348
			    = (-GraphicsToolkit.anInt940 + Node_Sub18.anInt4006
			       + anLocalInt - anLocalInt_33_);
			Node_Sub31_Sub4.anInt5851
			    = (anLocalInt_17_
			       - (-Class344.anInt3590 + Statics.anInt582)
			       - anLocalInt_34_);
			Node_Sub36.anInt4164 = anLocalInt_20_;
			Statics.aGraphicsToolkit5822.DA
			    (Node_Sub52.anInt4348,
			     Node_Sub31_Sub4.anInt5851,
			     Node_Sub36.anInt4164, Class284.anInt2279);
		    } else {
			Class284.anInt2279 = anLocalInt_21_;
			Node_Sub36.anInt4164 = anLocalInt_20_;
			Node_Sub31_Sub4.anInt5851
			    = anLocalInt_17_ - (Statics.anInt582
						+ anLocalInt_34_);
			Node_Sub52.anInt4348
			    = -GraphicsToolkit.anInt940 + anLocalInt - anLocalInt_33_;
			Statics.aGraphicsToolkit5822.DA
			    (Node_Sub52.anInt4348,
			     Node_Sub31_Sub4.anInt5851,
			     Node_Sub36.anInt4164, Class284.anInt2279);
		    }
		    Node_Sub37.method1057(Class15.aClass314_121);
		    if (anLocalInt_51_ > 0) {
			Statics.aGraphicsToolkit5822.setClip(0, anLocalInt_51_ + anLocalInt_48_, dba_sub_772_Sub2.anInt6366, anLocalInt_48_);
			Statics.aGraphicsToolkit5822.clearDepthBuffer();
			Statics.aGraphicsToolkit5822
			    .clear(Class2_Sub11.anInt3827);
			Class90.method1676(argument_10_, argument_16_,
					   argument_1_, argument_3_,
					   argument_2_, argument_4_,
					   argument_13_, argument_9_,
					   argument_0_, argument_6_,
					   argument_7_, argument, argument_8_,
					   argument_14_, argument_12_,
					   argument_11_, argument_5_, 1,
					   false);
		    }
		    if (anLocalInt_47_ > 0) {
			Statics.aGraphicsToolkit5822.setClip(anLocalInt_45_, anLocalInt_52_ + anLocalInt_53_, anLocalInt_47_ + anLocalInt_45_, anLocalInt_52_);
			Statics.aGraphicsToolkit5822.clearDepthBuffer();
			Statics.aGraphicsToolkit5822
			    .clear(Class2_Sub11.anInt3827);
			Class90.method1676(argument_10_, argument_16_,
					   argument_1_, argument_3_,
					   argument_2_, argument_4_,
					   argument_13_, argument_9_,
					   argument_0_, argument_6_,
					   argument_7_, argument, argument_8_,
					   argument_14_, argument_12_,
					   argument_11_, argument_5_, 1,
					   false);
		    }
		    Statics.aGraphicsToolkit5822.clearClip();
		    Class256.method3278();
		    if (Class50.anInt365 == 0)
			Statics.aGraphicsToolkit5822.method2058();
		    GraphicsToolkit.anInt940 += anLocalInt_33_;
		    Statics.anInt582 += anLocalInt_34_;
		    Class194.aDouble1415 += d_37_;
		    Class272.anInt2174
			= -Statics.anInt582 + (anLocalInt_26_
					       + Class344.anInt3590);
		    Statics.anInt3831
			= -GraphicsToolkit.anInt940 + (Node_Sub18.anInt4006
						+ anLocalInt_25_);
		    if (Class50.anInt365 == 1) {
			Node_Sub45.anInt4264 += anLocalInt_36_;
			Class2_Sub2.anInt3768 += anLocalInt_35_;
			for (int anLocalInt_64_ = 0;
			     anLocalInt_64_ < Class24.anInt161;
			     anLocalInt_64_++) {
			    int anLocalInt_65_
				= (Class243.method3155(Class24.anInt161,
						       (Node_Sub45.anInt4264
							+ anLocalInt_64_),
						       -126)
				   * Class85.anInt604);
			    for (int anLocalInt_66_ = 0;
				 anLocalInt_66_ < Class85.anInt604;
				 anLocalInt_66_++) {
				int anLocalInt_67_
				    = (anLocalInt_65_
				       + Class243.method3155(Class85.anInt604,
							     (anLocalInt_66_
							      + (Class2_Sub2
								 .anInt3768)),
							     -127));
				boolean anLocalBoolean
				    = ((anLocalInt_38_ <= anLocalInt_64_
					&& (anLocalInt_64_
					    < anLocalInt_39_ + anLocalInt_38_))
				       || (anLocalInt_64_ >= anLocalInt_41_
					   && (anLocalInt_64_
					       < (anLocalInt_43_
						  + anLocalInt_41_))
					   && anLocalInt_66_ >= anLocalInt_40_
					   && (anLocalInt_40_ + anLocalInt_42_
					       > anLocalInt_66_)));
				Class301.anInterface15Array2529
				    [anLocalInt_67_].method60
				    ((anLocalInt_66_
				      * Node_Sub31_Sub2.anInt5844),
				     Class5.anInt67 * anLocalInt_64_,
				     Node_Sub31_Sub2.anInt5844,
				     Class5.anInt67, 0, 0, anLocalBoolean,
				     true);
			    }
			}
		    }
		}
	    }
	    if (Class18.aBoolean124) {
		DoublyLinkedNodeP2_Sub6.anInt4543 = argument_16_;
		GraphicsToolkit.anInt940 = 0;
		Class194.aDouble1415 = 0.0;
		Class158.anInt1166 = argument_3_;
		Statics.anInt582 = 0;
		Class106.anInt864 = argument_1_;
		Statics.anInt3831 = Node_Sub18.anInt4006;
		Class272.anInt2174 = Class344.anInt3590;
		if (Class50.anInt365 == 0)
		    Statics.aGraphicsToolkit5822
			.method2087(Node_Sub31_Sub16.anInterface15_5912);
		Statics.aGraphicsToolkit5822.clearClip();
		Statics.aGraphicsToolkit5822.clearDepthBuffer();
		Statics.aGraphicsToolkit5822.clear(Class2_Sub11.anInt3827);
		Statics.aClass350_1255.method3828(DoublyLinkedNodeP2_Sub6.anInt4543,
						   Class106.anInt864,
						   Class158.anInt1166,
						   DoublyLinkedNodeP2_Sub8.anInt4581,
						   Class323.anInt2670,
						   Class257.anInt2007);
		Statics.aGraphicsToolkit5822
		    .method2069(Statics.aClass350_1255);
		if (Class50.anInt365 == 1) {
		    Class284.anInt2279 = anLocalInt_21_;
		    Node_Sub36.anInt4164 = anLocalInt_20_;
		    Node_Sub31_Sub4.anInt5851 = anLocalInt_17_;
		    Node_Sub52.anInt4348 = anLocalInt;
		    Statics.aGraphicsToolkit5822.DA
			(Node_Sub52.anInt4348, Node_Sub31_Sub4.anInt5851,
			 Node_Sub36.anInt4164, Class284.anInt2279);
		} else {
		    Node_Sub31_Sub4.anInt5851
			= anLocalInt_17_ + Class344.anInt3590;
		    Class284.anInt2279 = anLocalInt_21_;
		    Node_Sub52.anInt4348
			= Node_Sub18.anInt4006 + anLocalInt;
		    Node_Sub36.anInt4164 = anLocalInt_20_;
		    Statics.aGraphicsToolkit5822.DA
			(Node_Sub52.anInt4348, Node_Sub31_Sub4.anInt5851,
			 Node_Sub36.anInt4164, Class284.anInt2279);
		}
		Class87.aDouble3559 = 0.0;
		Class15.aClass314_121.method3628(0);
		Node_Sub37.method1057(Class15.aClass314_121);
		Class90.method1676(argument_10_, argument_16_, argument_1_,
				   argument_3_, argument_2_, argument_4_,
				   argument_13_, argument_9_, argument_0_,
				   argument_6_, argument_7_, argument,
				   argument_8_, argument_14_, argument_12_,
				   argument_11_, argument_5_, 1, false);
		Class256.method3278();
		Class18.aBoolean124 = false;
		if (Class50.anInt365 == 0)
		    Statics.aGraphicsToolkit5822.method2058();
		if (Class50.anInt365 == 1)
		    Node_Sub31_Sub15_Sub1.method925(15696);
	    }
	    if (Class50.anInt365 == 0)
		Node_Sub31_Sub16.anInterface15_5912.method61
		    (Statics.anInt3831, Class272.anInt2174,
		     Class349.anInt2921, Class353_Sub9.anInt5523, 0, 0, true,
		     true);
	    Class392.anInt3293++;
	    Node_Sub30.method861((byte) -114, Class194.aDouble1415);
	    Class245.aDouble1780 = Class194.aDouble1415;
	    if (Class50.anInt365 != argument_15_ && Class50.anInt365 != 2) {
		if (Class50.anInt365 == 1) {
		    Class353_Sub9.anInt5522 = anLocalInt_20_;
		    Node_Sub47.anInt4288
			= anLocalInt_17_ - Statics.anInt582;
		    Statics.anInt5032 = -GraphicsToolkit.anInt940 + anLocalInt;
		    Class_aa_Sub2.anInt3753 = anLocalInt_21_;
		    Statics.aGraphicsToolkit5822.DA
			(Statics.anInt5032, Node_Sub47.anInt4288,
			 Class353_Sub9.anInt5522, Class_aa_Sub2.anInt3753);
		    Statics.aGraphicsToolkit5822.setClip(Statics.anInt3831, Class353_Sub9.anInt5523 + Class272.anInt2174, Class349.anInt2921 + Statics.anInt3831, Class272.anInt2174);
		}
	    } else {
		if (Class50.anInt365 == 2) {
		    Statics.aGraphicsToolkit5822
			.clear(Class2_Sub11.anInt3827);
		    Statics.aGraphicsToolkit5822.clearDepthBuffer();
		}
		Statics.anInt5032
		    = (-Statics.anInt3831
		       + (anLocalInt + Node_Sub18.anInt4006)
		       - GraphicsToolkit.anInt940);
		Node_Sub47.anInt4288
		    = (-Class272.anInt2174 + Class344.anInt3590
		       + (anLocalInt_17_ - Statics.anInt582));
		Class353_Sub9.anInt5522 = anLocalInt_20_;
		Class_aa_Sub2.anInt3753 = anLocalInt_21_;
		Statics.aGraphicsToolkit5822.DA(Statics.anInt5032,
						    Node_Sub47.anInt4288,
						    Class353_Sub9.anInt5522,
						    Class_aa_Sub2.anInt3753);
	    }
	    Class90.method1676(argument_10_, argument_16_, argument_1_,
			       argument_3_, argument_2_, argument_4_,
			       argument_13_, argument_9_, argument_0_,
			       argument_6_, argument_7_, argument, argument_8_,
			       argument_14_, argument_12_, argument_11_,
			       argument_5_, Class50.anInt365 == 2 ? 0 : 2,
			       Class50.anInt365 == 1);
	    Statics.aGraphicsToolkit5822.clearClip();
	    Statics.aGraphicsToolkit5822.DA(anLocalInt, anLocalInt_17_,
						anLocalInt_18_,
						anLocalInt_19_);
	}
    }

    public static void method2590(boolean argument) {
	anIntArrayArrayArray1162 = null;
	aClass41_1159 = null;
	Class211.aClass211_1160 = null;
    }
    
    static final void method2591(Node_Sub2 argument, int argument_69_) {
	if (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 != null) {
	    Interface2 interface2 = null;
	    if (((Node_Sub2) argument).anInt3881 == 0)
		interface2
		    = (Interface2) (Node_Sub31_Sub15_Sub1.method921
                (((Node_Sub2) argument).anInt3871,
                        ((Node_Sub2) argument).anInt3883,
                        ((Node_Sub2) argument).anInt3882));
	    if (((Node_Sub2) argument).anInt3881 == 1)
		interface2
		    = (Interface2) (GlTexture_Sub2.method2492(((Node_Sub2) argument).anInt3871, ((Node_Sub2) argument).anInt3883, ((Node_Sub2) argument).anInt3882));
	    if (((Node_Sub2) argument).anInt3881 == 2)
		interface2
		    = ((Interface2)
		       LoadingBar.method2831(((Node_Sub2) argument).anInt3871, ((Node_Sub2) argument).anInt3883, ((Node_Sub2) argument).anInt3882, (aClass1163 != null ? aClass1163 : (aClass1163 = method2593("Interface2")))));
	    if (((Node_Sub2) argument).anInt3881 == 3)
		interface2
		    = (Interface2) (Statics.method1330(((Node_Sub2) argument).anInt3871, ((Node_Sub2) argument).anInt3883, ((Node_Sub2) argument).anInt3882));
	    if (interface2 != null) {
		((Node_Sub2) argument).anInt3880
		    = interface2.method7(-23356);
		((Node_Sub2) argument).anInt3878
		    = interface2.method2(-10908);
		((Node_Sub2) argument).anInt3872
		    = interface2.method3(-2132);
	    } else {
		((Node_Sub2) argument).anInt3872 = 0;
		((Node_Sub2) argument).anInt3880 = -1;
		((Node_Sub2) argument).anInt3878 = 0;
	    }
	}
    }
    
    static final int method2592(int argument, Class320 argument_70_) {
	if (argument_70_ != Class196.aClass320_1437) {
	    if (argument_70_ != Applet_Sub1.aClass320_9) {
		if (Node_Sub31_Sub23.aClass320_5942 != argument_70_) {
		    if (argument_70_ != Class62_Sub19.aClass320_4426) {
			if (Class188.aClass320_1394 == argument_70_)
			    return 6410;
			if (Node_Sub5.aClass320_3896 == argument_70_)
			    return 6145;
		    } else
			return 6409;
		} else
		    return 6406;
	    } else
		return 6408;
	} else
	    return 6407;
	throw new IllegalStateException();
    }
    
    /*synthetic*/ static Class method2593(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
