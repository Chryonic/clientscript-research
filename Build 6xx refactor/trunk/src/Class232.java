/* Class232 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class232
{
    private int anInt1683;
    static Class390 aClass390_1684 = new Class390();
    private int anInt1685;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_1686;
    private int anInt1687;
    private Class123[][] aClass123ArrayArray1688;
    int anInt1689;
    private Class_s_Sub1 aClass_s_Sub1_1690;
    byte[] aByteArray1691;
    static int anInt1692;
    static int anInt1694 = 0;
    private int anInt1695;
    
    final void method3087(int argument_0_) {
	aClass123ArrayArray1688 = new Class123[anInt1685][anInt1695];
	for (int anLocalInt = 0; anLocalInt < anInt1695; anLocalInt++) {
	    for (int anLocalInt_1_ = 0; anLocalInt_1_ < anInt1685;
		 anLocalInt_1_++) {
		aClass123ArrayArray1688[anLocalInt_1_][anLocalInt]
		    = new Class123(aClass_ha_Sub2_1686, this,
				   aClass_s_Sub1_1690, anLocalInt_1_,
				   anLocalInt, anInt1687,
				   anLocalInt_1_ * 128 + 1,
				   anLocalInt * 128 + 1);
		if (((Class123) (aClass123ArrayArray1688[anLocalInt_1_]
				 [anLocalInt])).anInt999
		    == 0)
		    aClass123ArrayArray1688[anLocalInt_1_][anLocalInt] = null;
	    }
	}
	int anLocalInt = 40 / ((argument_0_ + 53) / 32);
    }
    
    public static void method3088(byte argument) {
	client.demoServer = null;
	aClass390_1684 = null;
    }
    
    private final void method3089(int argument_2_, int argument_3_,
				  int argument_4_, int argument_5_,
				  int argument_6_) {
	if (aClass123ArrayArray1688 != null) {
	    int anLocalInt = argument_5_ - 1 >> 7;
	    if (argument_6_ != 28004)
		method3091(96, -101, -112, 37, -32, -123, (byte) 68, 105, -93);
	    int anLocalInt_7_ = argument_5_ - 1 - (-argument_4_ + 1) >> 7;
	    int anLocalInt_8_ = argument_2_ - 1 >> 7;
	    int anLocalInt_9_ = argument_2_ + argument_3_ - 2 >> 7;
	    for (int anLocalInt_10_ = anLocalInt;
		 anLocalInt_10_ <= anLocalInt_7_; anLocalInt_10_++) {
		Class123[] class123s = aClass123ArrayArray1688[anLocalInt_10_];
		for (int anLocalInt_11_ = anLocalInt_8_;
		     anLocalInt_9_ >= anLocalInt_11_; anLocalInt_11_++) {
		    if (class123s[anLocalInt_11_] != null)
			((Class123) class123s[anLocalInt_11_]).aBoolean996
			    = true;
		}
	    }
	}
    }
    
    final void method3090(int argument_12_, int argument_13_, int argument_14_,
			  tia_sub_35DoublyLinked argument_15_) {
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1 = (tia_sub_35_Sub1DoublyLinked) argument_15_;
	argument_14_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6655 + 1;
	argument_13_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6653 + 1;
	int anLocalInt
	    = argument_13_ + argument_14_ * ((Class232) this).anInt1689;
	int anLocalInt_16_ = 0;
	int anLocalInt_17_ = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6654;
	int anLocalInt_18_ = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6656;
	int anLocalInt_19_ = ((Class232) this).anInt1689 - anLocalInt_18_;
	if (argument_14_ <= 0) {
	    int anLocalInt_20_ = 1 - argument_14_;
	    argument_14_ = 1;
	    anLocalInt += ((Class232) this).anInt1689 * anLocalInt_20_;
	    anLocalInt_17_ -= anLocalInt_20_;
	    anLocalInt_16_ += anLocalInt_18_ * anLocalInt_20_;
	}
	int anLocalInt_21_ = 0;
	if (anInt1683 <= anLocalInt_17_ + argument_14_) {
	    int anLocalInt_22_
		= anLocalInt_17_ + (argument_14_ + (1 - anInt1683));
	    anLocalInt_17_ -= anLocalInt_22_;
	}
	if (argument_13_ <= 0) {
	    int anLocalInt_23_ = 1 - argument_13_;
	    anLocalInt_16_ += anLocalInt_23_;
	    argument_13_ = 1;
	    anLocalInt += anLocalInt_23_;
	    anLocalInt_18_ -= anLocalInt_23_;
	    anLocalInt_19_ += anLocalInt_23_;
	    anLocalInt_21_ += anLocalInt_23_;
	}
	if (argument_13_ + anLocalInt_18_ >= ((Class232) this).anInt1689) {
	    int anLocalInt_24_ = (-((Class232) this).anInt1689 + 1
				  + (anLocalInt_18_ + argument_13_));
	    anLocalInt_18_ -= anLocalInt_24_;
	    anLocalInt_19_ += anLocalInt_24_;
	    anLocalInt_21_ += anLocalInt_24_;
	}
	if (anLocalInt_18_ > 0 && anLocalInt_17_ > 0) {
	    int anLocalInt_25_ = -70 % ((argument_12_ + 5) / 55);
	    Statics.method1175(anLocalInt_17_, true, ((Class232) this).aByteArray1691, anLocalInt_18_, anLocalInt, anLocalInt_16_, (((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).aByteArray6657), anLocalInt_21_, anLocalInt_19_);
	    method3089(argument_14_, anLocalInt_17_, anLocalInt_18_,
		       argument_13_, 28004);
	}
    }
    
    static final void method3091
	(int argument, int argument_26_, int argument_27_, int argument_28_,
	 int argument_29_, int argument_30_, byte argument_31_,
	 int argument_32_, int argument_33_) {
	Class114.aClass48Array943[DoublyLinkedNodeP2_Sub6.anInt4547++]
	    = new Class48(argument_29_, argument_32_, argument_33_,
			  argument_27_, argument_27_, argument_33_,
			  argument_26_, argument, argument, argument_26_,
			  argument_30_, argument_30_, argument_28_,
			  argument_28_);
    }
    
    final void method3092(byte argument_34_, boolean argument_35_,
			  int argument_36_, int argument_37_,
			  boolean[][] argument_38_, int argument_39_) {
	aClass_ha_Sub2_1686.method2172((byte) -68, false);
	aClass_ha_Sub2_1686.method2212((byte) -24, false);
	aClass_ha_Sub2_1686.method2147(0, 1);
	aClass_ha_Sub2_1686.method2216((byte) -127, 1);
	aClass_ha_Sub2_1686.method2215(false, -2, false, (byte) -112);
	float f
	    = 1.0F / (float) (((GraphicsToolkit_Sub2) aClass_ha_Sub2_1686).anInt4778
			      * 128);
	if (!argument_35_) {
	    for (int anLocalInt = 0; anLocalInt < anInt1695; anLocalInt++) {
		int anLocalInt_40_ = anLocalInt << anInt1687;
		int anLocalInt_41_ = anLocalInt + 1 << anInt1687;
		for (int anLocalInt_42_ = 0; anLocalInt_42_ < anInt1685;
		     anLocalInt_42_++) {
		    Class123 class123
			= aClass123ArrayArray1688[anLocalInt_42_][anLocalInt];
		    if (class123 != null) {
			Interface4_Impl1 interface4_impl1
			    = aClass_ha_Sub2_1686.method2199((byte) 31,
							     (((Class123)
							       class123)
							      .anInt999) * 3);
			Buffer buffer
			    = interface4_impl1.method43(true, 3754);
			if (buffer != null) {
			    Stream stream
				= aClass_ha_Sub2_1686.method2116(9,
                        buffer);
			    int anLocalInt_43_ = 0;
			    int anLocalInt_44_ = anLocalInt_42_ << anInt1687;
			    int anLocalInt_45_
				= anLocalInt_42_ + 1 << anInt1687;
			    for (int anLocalInt_46_ = anLocalInt_40_;
				 anLocalInt_46_ < anLocalInt_41_;
				 anLocalInt_46_++) {
				if ((-argument_39_
				     <= anLocalInt_46_ - argument_36_)
				    && (argument_39_
					>= -argument_36_ + anLocalInt_46_)) {
				    int anLocalInt_47_
					= (anLocalInt_44_
					   + (((Class_s) aClass_s_Sub1_1690)
					      .anInt2550) * anLocalInt_46_);
				    for (int anLocalInt_48_ = anLocalInt_44_;
					 anLocalInt_48_ < anLocalInt_45_;
					 anLocalInt_48_++) {
					if ((-argument_37_ + anLocalInt_48_
					     >= -argument_39_)
					    && (anLocalInt_48_ - argument_37_
						<= argument_39_)
					    && (argument_38_
						[(argument_39_
						  + (-argument_37_
						     + anLocalInt_48_))]
						[(anLocalInt_46_
						  + (-argument_36_
						     + argument_39_))])) {
					    short[] anLocalInts
						= (((Class_s_Sub1)
						    aClass_s_Sub1_1690)
						   .aShortArrayArray5330
						   [anLocalInt_47_]);
					    if (anLocalInts != null) {
						if (!Stream.isBigEndian()) {
						    for (int anLocalInt_49_
							     = 0;
							 (anLocalInt_49_
							  < anLocalInts.length);
							 anLocalInt_49_++) {
							anLocalInt_43_++;
							stream.writeShortLE((anLocalInts[anLocalInt_49_]) & 0xffff);
						    }
						} else {
						    for (int anLocalInt_50_
							     = 0;
							 (anLocalInt_50_
							  < anLocalInts.length);
							 anLocalInt_50_++) {
							stream.writeShortBE((anLocalInts[anLocalInt_50_]) & 0xffff);
							anLocalInt_43_++;
						    }
						}
					    }
					}
					anLocalInt_47_++;
				    }
				}
			    }
			    stream.upload();
			    if (interface4_impl1.method41(26937)
				&& anLocalInt_43_ > 0) {
				Class350_Sub2 class350_sub2
				    = aClass_ha_Sub2_1686
					  .method2219((byte) -107);
				class350_sub2.method3853((byte) -122, f, 1.0F,
							 f);
				class350_sub2.method3835(-anLocalInt_42_,
							 -anLocalInt, 0);
				aClass_ha_Sub2_1686
				    .method2171(59, Class95.aClass81_723);
				class123.method2394(interface4_impl1, false,
						    anLocalInt_43_ / 3);
			    }
			}
		    }
		}
	    }
	} else {
	    for (int anLocalInt = 0; anLocalInt < anInt1695; anLocalInt++) {
		int anLocalInt_51_ = anLocalInt << anInt1687;
		int anLocalInt_52_ = anLocalInt + 1 << anInt1687;
		for (int anLocalInt_53_ = 0; anLocalInt_53_ < anInt1685;
		     anLocalInt_53_++) {
		    if (aClass123ArrayArray1688[anLocalInt_53_][anLocalInt]
			!= null) {
			int anLocalInt_54_ = anLocalInt_53_ << anInt1687;
			int anLocalInt_55_ = anLocalInt_53_ + 1 << anInt1687;
		    while_66_:
			for (int anLocalInt_56_ = anLocalInt_54_;
			     anLocalInt_55_ > anLocalInt_56_;
			     anLocalInt_56_++) {
			    if (-argument_37_ + anLocalInt_56_ >= -argument_39_
				&& (argument_39_
				    >= -argument_37_ + anLocalInt_56_)) {
				for (int anLocalInt_57_ = anLocalInt_51_;
				     anLocalInt_52_ > anLocalInt_57_;
				     anLocalInt_57_++) {
				    if ((-argument_39_
					 <= -argument_36_ + anLocalInt_57_)
					&& (argument_39_
					    >= -argument_36_ + anLocalInt_57_)
					&& (argument_38_
					    [-argument_37_ + (anLocalInt_56_
							      + argument_39_)]
					    [(argument_39_
					      + (-argument_36_
						 + anLocalInt_57_))])) {
					Class350_Sub2 class350_sub2
					    = aClass_ha_Sub2_1686
						  .method2219((byte) -117);
					class350_sub2.method3853((byte) -97, f,
								 1.0F, f);
					class350_sub2.method3835
					    (-anLocalInt_53_, -anLocalInt, 0);
					aClass_ha_Sub2_1686.method2171
					    (114, Class95.aClass81_723);
					aClass123ArrayArray1688
					    [anLocalInt_53_][anLocalInt]
					    .method2396((byte) 8);
					break while_66_;
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	aClass_ha_Sub2_1686.method2217((byte) -57);
    }
    
    final void method3093(int argument_58_, tia_sub_35DoublyLinked argument_59_,
			  boolean argument_60_, int argument_61_) {
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1 = (tia_sub_35_Sub1DoublyLinked) argument_59_;
	argument_61_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6653 + 1;
	argument_58_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6655 + 1;
	int anLocalInt
	    = argument_61_ + ((Class232) this).anInt1689 * argument_58_;
	int anLocalInt_62_ = 0;
	int anLocalInt_63_ = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6654;
	int anLocalInt_64_ = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6656;
	int anLocalInt_65_ = ((Class232) this).anInt1689 - anLocalInt_64_;
	int anLocalInt_66_ = 0;
	if (argument_58_ <= 0) {
	    int anLocalInt_67_ = 1 - argument_58_;
	    anLocalInt_63_ -= anLocalInt_67_;
	    anLocalInt += ((Class232) this).anInt1689 * anLocalInt_67_;
	    anLocalInt_62_ += anLocalInt_64_ * anLocalInt_67_;
	    argument_58_ = 1;
	}
	if (anInt1683 <= argument_58_ + anLocalInt_63_) {
	    int anLocalInt_68_
		= -anInt1683 + 1 + anLocalInt_63_ + argument_58_;
	    anLocalInt_63_ -= anLocalInt_68_;
	}
	if (argument_61_ <= 0) {
	    int anLocalInt_69_ = -argument_61_ + 1;
	    anLocalInt += anLocalInt_69_;
	    argument_61_ = 1;
	    anLocalInt_62_ += anLocalInt_69_;
	    anLocalInt_65_ += anLocalInt_69_;
	    anLocalInt_64_ -= anLocalInt_69_;
	    anLocalInt_66_ += anLocalInt_69_;
	}
	if (argument_61_ + anLocalInt_64_ >= ((Class232) this).anInt1689) {
	    int anLocalInt_70_ = (-((Class232) this).anInt1689
				  + (argument_61_ + 1) + anLocalInt_64_);
	    anLocalInt_65_ += anLocalInt_70_;
	    anLocalInt_64_ -= anLocalInt_70_;
	    anLocalInt_66_ += anLocalInt_70_;
	}
	if (anLocalInt_64_ > 0 && anLocalInt_63_ > 0) {
	    GlImageSkybox.method1757((((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).aByteArray6657), anLocalInt_65_, anLocalInt_66_, ((Class232) this).aByteArray1691, anLocalInt, anLocalInt_64_, anLocalInt_62_, anLocalInt_63_, false);
	    method3089(argument_58_, anLocalInt_63_, anLocalInt_64_,
		       argument_61_, 28004);
	}
    }
    
    static final void method3094(Class329 argument, int argument_71_) {
	if (dba_sub_772_Sub2.aClass329_6365 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_72_ = anLocalInt >> 2;
	    int anLocalInt_73_ = anLocalInt & 0x3;
	    int anLocalInt_74_ = Node_Sub38.anIntArray4195[anLocalInt_72_];
	    int anLocalInt_75_
		= Network.stream.g1n();
	    int anLocalInt_76_
		= Class208.anInt1494 + ((anLocalInt_75_ & 0x7d) >> 4);
	    int anLocalInt_77_
		= (anLocalInt_75_ & 0x7) + Node_Sub31_Sub37.anInt6032;
	    if (Class154_Sub1.method2579(25757, MapRelated.anInt5582)
		|| (anLocalInt_76_ >= 0 && anLocalInt_77_ >= 0
		    && anLocalInt_76_ < MapRelated.mapWidth
		    && MapRelated.mapDepth > anLocalInt_77_))
		Node_Sub47_Sub3.method1120(anLocalInt_72_,
                Class379.anInt3227,
                anLocalInt_73_, 2899, -1,
                anLocalInt_77_, anLocalInt_76_,
                anLocalInt_74_);
	} else if (argument == Class133_Sub4.aClass329_5028) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_78_ = (anLocalInt >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_79_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_80_
		= Network.stream.g2();
	    if (anLocalInt_80_ == 65535)
		anLocalInt_80_ = -1;
	    int anLocalInt_81_
		= Network.stream.g1();
	    int anLocalInt_82_ = (anLocalInt_81_ & 0xfe) >> 4;
	    int anLocalInt_83_ = anLocalInt_81_ & 0x7;
	    int anLocalInt_84_
		= Network.stream.g1();
	    int anLocalInt_85_
		= Network.stream.g1();
	    int anLocalInt_86_
		= Network.stream.g2();
	    if (anLocalInt_78_ >= 0 && anLocalInt_79_ >= 0
		&& MapRelated.mapWidth > anLocalInt_78_
		&& MapRelated.mapDepth > anLocalInt_79_) {
		int anLocalInt_87_ = anLocalInt_82_ + 1;
		if ((((Entity)
		      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		     .pathX[0]) >= anLocalInt_78_ - anLocalInt_87_
		    && (anLocalInt_78_ + anLocalInt_87_
			>= (((Entity)
			     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			    .pathX[0]))
		    && (((Entity)
			 Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			.pathZ[0]) >= -anLocalInt_87_ + anLocalInt_79_
		    && (((Entity)
			 Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			.pathZ[0]) <= anLocalInt_79_ + anLocalInt_87_)
		    Class321.method3649(anLocalInt_85_, anLocalInt_83_, 50,
					anLocalInt_84_, anLocalInt_80_,
					((anLocalInt_78_ << 16)
					 + ((Class379.anInt3227 << 24)
					    + ((anLocalInt_79_ << 8)
					       + anLocalInt_82_))),
					anLocalInt_86_, false);
	    }
	} else if (argument == Statics.aClass329_719) {
	    int anLocalInt = Network.stream.g1n();
	    int anLocalInt_88_
		= Node_Sub31_Sub37.anInt6032 + (anLocalInt & 0x7);
	    int anLocalInt_89_ = MapRelated.baseZ + anLocalInt_88_;
	    int anLocalInt_90_
		= ((anLocalInt & 0x7e) >> 4) + Class208.anInt1494;
	    int anLocalInt_91_ = MapRelated.baseX + anLocalInt_90_;
	    int anLocalInt_92_
		= Network.stream.g2ip128();
	    Node_Sub15 class59_sub15
		= ((Node_Sub15)
		   (tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.get((long) (anLocalInt_91_ | (Class379.anInt3227 << 28 | anLocalInt_89_ << 14)))));
	    if (class59_sub15 != null) {
		for (Node_Sub10 class59_sub10
			 = (Node_Sub10) ((Node_Sub15) class59_sub15)
					       .aCyclicLinkedList_3993
					       .getFirst();
		     class59_sub10 != null;
		     class59_sub10
			 = (Node_Sub10) ((Node_Sub15) class59_sub15)
					       .aCyclicLinkedList_3993
					       .getNext()) {
		    if (((Node_Sub10) class59_sub10).anInt3934
			== (anLocalInt_92_ & 0x7fff)) {
			class59_sub10.unlink();
			break;
		    }
		}
		if (((Node_Sub15) class59_sub15).aCyclicLinkedList_3993
			.isEmpty())
		    class59_sub15.unlink();
		if (anLocalInt_90_ >= 0 && anLocalInt_88_ >= 0
		    && MapRelated.mapWidth > anLocalInt_90_
		    && MapRelated.mapDepth > anLocalInt_88_)
		    DoublyLinkedNode_Sub51_Sub8.method1229(127, anLocalInt_88_, Class379.anInt3227, anLocalInt_90_);
	    }
	} else if (Statics.aClass329_2294 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_93_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_94_ = anLocalInt_93_ + MapRelated.baseZ;
	    int anLocalInt_95_
		= ((anLocalInt & 0x7a) >> 4) + Class208.anInt1494;
	    int anLocalInt_96_ = MapRelated.baseX + anLocalInt_95_;
	    int anLocalInt_97_
		= Network.stream.g2();
	    int anLocalInt_98_
		= Network.stream.g2();
	    int anLocalInt_99_
		= Network.stream.g2();
	    if (tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658 != null) {
		Node_Sub15 class59_sub15
		    = ((Node_Sub15)
		       (tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.get((long) (anLocalInt_96_ | (anLocalInt_94_ << 14 | Class379.anInt3227 << 28)))));
		if (class59_sub15 != null) {
		    for (Node_Sub10 class59_sub10
			     = (Node_Sub10) ((Node_Sub15) class59_sub15)
						   .aCyclicLinkedList_3993
						   .getFirst();
			 class59_sub10 != null;
			 class59_sub10
			     = (Node_Sub10) ((Node_Sub15) class59_sub15)
						   .aCyclicLinkedList_3993
						   .getNext()) {
			if ((((Node_Sub10) class59_sub10).anInt3934
			     == (anLocalInt_97_ & 0x7fff))
			    && anLocalInt_98_ == ((Node_Sub10)
						  class59_sub10).anInt3936) {
			    class59_sub10.unlink();
			    ((Node_Sub10) class59_sub10).anInt3936
				= anLocalInt_99_;
			    DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1873(anLocalInt_94_,
							       (Class379
								.anInt3227),
							       class59_sub10,
							       -1,
							       anLocalInt_96_);
			    break;
			}
		    }
		    if (anLocalInt_95_ >= 0 && anLocalInt_93_ >= 0
			&& anLocalInt_95_ < MapRelated.mapWidth
			&& anLocalInt_93_ < MapRelated.mapDepth)
			DoublyLinkedNode_Sub51_Sub8.method1229(123, anLocalInt_93_, Class379.anInt3227, anLocalInt_95_);
		}
	    }
	} else if (argument == Class53.aClass329_394) {
	    int anLocalInt = Network.stream.g2ip128();
	    int anLocalInt_100_
		= Network.stream.g2m128();
	    int anLocalInt_101_
		= Network.stream.g1n();
	    int anLocalInt_102_
		= Node_Sub31_Sub37.anInt6032 + (anLocalInt_101_ & 0x7);
	    int anLocalInt_103_ = anLocalInt_102_ + MapRelated.baseZ;
	    int anLocalInt_104_
		= (anLocalInt_101_ >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_105_ = anLocalInt_104_ + MapRelated.baseX;
	    boolean anLocalBoolean
		= (anLocalInt_104_ >= 0 && anLocalInt_102_ >= 0
		   && anLocalInt_104_ < MapRelated.mapWidth
		   && MapRelated.mapDepth > anLocalInt_102_);
	    if (anLocalBoolean
		|| Class154_Sub1.method2579(25757, MapRelated.anInt5582)) {
		DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1873
		    (anLocalInt_103_, Class379.anInt3227,
		     new Node_Sub10(anLocalInt, anLocalInt_100_), -1,
		     anLocalInt_105_);
		if (anLocalBoolean)
		    DoublyLinkedNode_Sub51_Sub8.method1229(118, anLocalInt_102_, Class379.anInt3227, anLocalInt_104_);
	    }
	} else if (Class353_Sub2.aClass329_5480 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_106_
		= ((anLocalInt & 0xff) >> 4) + Class208.anInt1494 * 2;
	    int anLocalInt_107_
		= Node_Sub31_Sub37.anInt6032 * 2 + (anLocalInt & 0xf);
	    int anLocalInt_108_
		= Network.stream.g1();
	    boolean anLocalBoolean = (anLocalInt_108_ & 0x1) != 0;
	    boolean anLocalBoolean_109_ = (anLocalInt_108_ & 0x2) != 0;
	    int anLocalInt_110_
		= anLocalBoolean_109_ ? anLocalInt_108_ >> 2 : -1;
	    int anLocalInt_111_
		= (anLocalInt_106_
		   + Network.stream.g1s());
	    int anLocalInt_112_
		= (Network.stream.g1s()
		   + anLocalInt_107_);
	    int anLocalInt_113_
		= Network.stream.g2s();
	    int anLocalInt_114_
		= Network.stream.g2s();
	    int anLocalInt_115_
		= Network.stream.g2();
	    int anLocalInt_116_
		= Network.stream.g1();
	    if (anLocalBoolean_109_)
		anLocalInt_116_ = (byte) anLocalInt_116_;
	    else
		anLocalInt_116_ *= 4;
	    int anLocalInt_117_
		= Network.stream.g1() * 4;
	    int anLocalInt_118_
		= Network.stream.g2();
	    int anLocalInt_119_
		= Network.stream.g2();
	    int anLocalInt_120_
		= Network.stream.g1();
	    if (anLocalInt_120_ == 255)
		anLocalInt_120_ = -1;
	    int anLocalInt_121_
		= Network.stream.g2();
	    if (anLocalInt_106_ >= 0 && anLocalInt_107_ >= 0
		&& MapRelated.mapWidth * 2 > anLocalInt_106_
		&& anLocalInt_107_ < MapRelated.mapWidth * 2
		&& anLocalInt_111_ >= 0 && anLocalInt_112_ >= 0
		&& anLocalInt_111_ < MapRelated.mapDepth * 2
		&& MapRelated.mapDepth * 2 > anLocalInt_112_
		&& anLocalInt_115_ != 65535) {
		anLocalInt_107_ *= 256;
		anLocalInt_106_ *= 256;
		anLocalInt_117_ <<= 2;
		anLocalInt_121_ <<= 2;
		anLocalInt_111_ *= 256;
		anLocalInt_112_ *= 256;
		anLocalInt_116_ <<= 2;
		if (anLocalInt_113_ != 0 && anLocalInt_110_ != -1) {
		    Entity entity = null;
		    if (anLocalInt_113_ >= 0) {
			int anLocalInt_122_ = anLocalInt_113_ - 1;
			Node_Sub35 class59_sub35
			    = ((Node_Sub35)
			       Class294.aJagexHashMap_2453
				   .get((long) anLocalInt_122_));
			if (class59_sub35 != null)
			    entity
				= (((Node_Sub35) class59_sub35)
				   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    } else {
			int anLocalInt_123_ = -anLocalInt_113_ - 1;
			if (Class64.anInt451 == anLocalInt_123_)
			    entity
				= Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587;
			else
			    entity
				= (Class345
				   .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
				   [anLocalInt_123_]);
		    }
		    if (entity != null) {
			Class354 class354
			    = entity.method1831();
			if (((Class354) class354).anIntArrayArray2958 != null
			    && (((Class354) class354).anIntArrayArray2958
				[anLocalInt_110_]) != null)
			    anLocalInt_116_
				-= (((Class354) class354).anIntArrayArray2958
				    [anLocalInt_110_][1]);
			if (((Class354) class354).anIntArrayArray3001 != null
			    && (((Class354) class354).anIntArrayArray3001
				[anLocalInt_110_]) != null)
			    anLocalInt_116_
				-= (((Class354) class354).anIntArrayArray3001
				    [anLocalInt_110_][1]);
		    }
		}
		DoublyLinkedNodeP2_Sub2_Sub2_Sub1 class104_sub2_sub2_sub1
		    = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub1
		       (anLocalInt_115_, Class379.anInt3227,
			Class379.anInt3227, anLocalInt_106_, anLocalInt_107_,
			anLocalInt_116_, anLocalInt_118_ + Class333.anInt2720,
			anLocalInt_119_ + Class333.anInt2720, anLocalInt_120_,
			anLocalInt_121_, anLocalInt_113_, anLocalInt_114_,
			anLocalInt_117_, anLocalBoolean, anLocalInt_110_));
		class104_sub2_sub2_sub1.method1802
		    (anLocalInt_118_ + Class333.anInt2720, (byte) -4,
		     anLocalInt_111_,
		     (Node_Sub31_Sub36.method993(Class379.anInt3227,
                     anLocalInt_111_, -12040,
                     anLocalInt_112_)
		      - anLocalInt_117_),
		     anLocalInt_112_);
		Node_Sub31_Sub3.aCyclicLinkedList_5850.add(new DoublyLinkedNode_Sub51_Sub14(class104_sub2_sub2_sub1));
	    }
	} else if (argument == Statics.aClass329_1046) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_124_ = (anLocalInt >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_125_
		= Node_Sub31_Sub37.anInt6032 + (anLocalInt & 0x7);
	    int anLocalInt_126_
		= Network.stream.g1p128();
	    int anLocalInt_127_ = anLocalInt_126_ >> 2;
	    int anLocalInt_128_ = anLocalInt_126_ & 0x3;
	    int anLocalInt_129_
		= Node_Sub38.anIntArray4195[anLocalInt_127_];
	    int anLocalInt_130_
		= Network.stream.g2();
	    if (anLocalInt_130_ == 65535)
		anLocalInt_130_ = -1;
	    Class359.method3943(anLocalInt_125_, anLocalInt_127_, (byte) -8,
				anLocalInt_129_, anLocalInt_128_,
				Class379.anInt3227, anLocalInt_124_,
				anLocalInt_130_);
	} else if (Class117.aClass329_966 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_131_
		= ((anLocalInt & 0x72) >> 4) + Class208.anInt1494;
	    int anLocalInt_132_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_133_
		= Network.stream.g2();
	    int anLocalInt_134_
		= Network.stream.g1();
	    int anLocalInt_135_
		= Network.stream.g2();
	    int anLocalInt_136_
		= Network.stream.g1();
	    if (anLocalInt_131_ >= 0 && anLocalInt_132_ >= 0
		&& MapRelated.mapWidth > anLocalInt_131_
		&& anLocalInt_132_ < MapRelated.mapDepth) {
		int anLocalInt_137_ = anLocalInt_131_ * 512 + 256;
		int anLocalInt_138_ = anLocalInt_132_ * 512 + 256;
		int anLocalInt_139_ = Class379.anInt3227;
		if (anLocalInt_139_ < 3
		    && Class274.method3388(anLocalInt_131_, anLocalInt_132_,
					   1))
		    anLocalInt_139_++;
		DoublyLinkedNodeP2_Sub2_Sub2_Sub4 class104_sub2_sub2_sub4
		    = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub4
		       (anLocalInt_133_, anLocalInt_135_, Class333.anInt2720,
			Class379.anInt3227, anLocalInt_139_, anLocalInt_137_,
			(-anLocalInt_134_
			 + Node_Sub31_Sub36.method993(Class379.anInt3227,
                    anLocalInt_137_,
                    -12040,
                    anLocalInt_138_)),
			anLocalInt_138_, anLocalInt_131_, anLocalInt_131_,
			anLocalInt_132_, anLocalInt_132_, anLocalInt_136_));
		Class305.aCyclicLinkedList_3640.add(new DoublyLinkedNode_Sub51_Sub2(class104_sub2_sub2_sub4));
	    }
	} else if (Node_Sub31_Sub31.aClass329_5994 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    boolean anLocalBoolean = (anLocalInt & 0x80) != 0;
	    int anLocalInt_140_
		= ((anLocalInt & 0x3d) >> 3) + Class208.anInt1494;
	    int anLocalInt_141_
		= Node_Sub31_Sub37.anInt6032 + (anLocalInt & 0x7);
	    int anLocalInt_142_
		= (Network.stream.g1s()
		   + anLocalInt_140_);
	    int anLocalInt_143_
		= (anLocalInt_141_
		   + Network.stream.g1s());
	    int anLocalInt_144_
		= Network.stream.g2s();
	    int anLocalInt_145_
		= Network.stream.g2();
	    int anLocalInt_146_
		= Network.stream.g1() * 4;
	    int anLocalInt_147_
		= Network.stream.g1() * 4;
	    int anLocalInt_148_
		= Network.stream.g2();
	    int anLocalInt_149_
		= Network.stream.g2();
	    int anLocalInt_150_
		= Network.stream.g1();
	    if (anLocalInt_150_ == 255)
		anLocalInt_150_ = -1;
	    int anLocalInt_151_
		= Network.stream.g2();
	    if (anLocalInt_140_ >= 0 && anLocalInt_141_ >= 0
		&& anLocalInt_140_ < MapRelated.mapWidth
		&& anLocalInt_141_ < MapRelated.mapDepth
		&& anLocalInt_142_ >= 0 && anLocalInt_143_ >= 0
		&& MapRelated.mapWidth > anLocalInt_142_
		&& MapRelated.mapDepth > anLocalInt_143_
		&& anLocalInt_145_ != 65535) {
		anLocalInt_143_ = anLocalInt_143_ * 512 + 256;
		anLocalInt_146_ <<= 2;
		anLocalInt_142_ = anLocalInt_142_ * 512 + 256;
		anLocalInt_147_ <<= 2;
		anLocalInt_141_ = anLocalInt_141_ * 512 + 256;
		anLocalInt_140_ = anLocalInt_140_ * 512 + 256;
		anLocalInt_151_ <<= 2;
		DoublyLinkedNodeP2_Sub2_Sub2_Sub1 class104_sub2_sub2_sub1
		    = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub1
		       (anLocalInt_145_, Class379.anInt3227,
			Class379.anInt3227, anLocalInt_140_, anLocalInt_141_,
			anLocalInt_146_, Class333.anInt2720 + anLocalInt_148_,
			Class333.anInt2720 + anLocalInt_149_, anLocalInt_150_,
			anLocalInt_151_, 0, anLocalInt_144_, anLocalInt_147_,
			anLocalBoolean, -1));
		class104_sub2_sub2_sub1.method1802
		    (Class333.anInt2720 + anLocalInt_148_, (byte) -4,
		     anLocalInt_142_,
		     (Node_Sub31_Sub36.method993(Class379.anInt3227,
                     anLocalInt_142_, -12040,
                     anLocalInt_143_)
		      - anLocalInt_147_),
		     anLocalInt_143_);
		Node_Sub31_Sub3.aCyclicLinkedList_5850.add(new DoublyLinkedNode_Sub51_Sub14(class104_sub2_sub2_sub1));
	    }
	} else if (argument == tia_sub_35DoublyLinked.aClass329_6252) {
	    int anLocalInt
		= Network.stream.g2i();
	    int anLocalInt_152_
		= Network.stream.g2i();
	    int anLocalInt_153_
		= Network.stream.g1n();
	    int anLocalInt_154_
		= (anLocalInt_153_ & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_155_ = anLocalInt_154_ + MapRelated.baseZ;
	    int anLocalInt_156_
		= Class208.anInt1494 + (anLocalInt_153_ >> 4 & 0x7);
	    int anLocalInt_157_ = MapRelated.baseX + anLocalInt_156_;
	    int anLocalInt_158_
		= Network.stream.g2i();
	    if (Class64.anInt451 != anLocalInt_158_) {
		boolean anLocalBoolean
		    = (anLocalInt_156_ >= 0 && anLocalInt_154_ >= 0
		       && MapRelated.mapWidth > anLocalInt_156_
		       && anLocalInt_154_ < MapRelated.mapDepth);
		if (anLocalBoolean
		    || Class154_Sub1.method2579(25757,
						MapRelated.anInt5582)) {
		    DoublyLinkedNodeP2_Sub2_Sub3_Sub2.method1873
			(anLocalInt_155_, Class379.anInt3227,
			 new Node_Sub10(anLocalInt_152_, anLocalInt), -1,
			 anLocalInt_157_);
		    if (anLocalBoolean)
			DoublyLinkedNode_Sub51_Sub8.method1229(125, anLocalInt_154_, Class379.anInt3227, anLocalInt_156_);
		}
	    }
	} else if (argument == Class66.aClass329_463) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_159_ = anLocalInt >> 2;
	    int anLocalInt_160_
		= Node_Sub38.anIntArray4195[anLocalInt_159_];
	    int anLocalInt_161_
		= Network.stream.g2();
	    Class266 class266 = Node_Sub31_Sub30.aClass257_5983
				    .method3298((byte) 55, anLocalInt_161_);
	    int anLocalInt_162_
		= Network.stream.g1p128();
	    int anLocalInt_163_
		= Network.stream.g1n();
	    int anLocalInt_164_
		= (anLocalInt_163_ >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_165_
		= (anLocalInt_163_ & 0x7) + Node_Sub31_Sub37.anInt6032;
	    if (anLocalInt_159_ == 11)
		anLocalInt_159_ = 10;
	    int anLocalInt_166_ = 0;
	    if (((Class266) class266).aByteArray2111 != null) {
		int anLocalInt_167_ = -1;
		for (int anLocalInt_168_ = 0;
		     (((Class266) class266).aByteArray2111.length
		      > anLocalInt_168_);
		     anLocalInt_168_++) {
		    if (((Class266) class266).aByteArray2111[anLocalInt_168_]
			== anLocalInt_159_) {
			anLocalInt_167_ = anLocalInt_168_;
			break;
		    }
		}
		anLocalInt_166_ = (((Class266) class266).anIntArrayArray2100
				   [anLocalInt_167_]).length;
	    }
	    int anLocalInt_169_ = 0;
	    if (((Class266) class266).aShortArray2093 != null)
		anLocalInt_169_ = ((Class266) class266).aShortArray2093.length;
	    int anLocalInt_170_ = 0;
	    if (((Class266) class266).aShortArray2078 != null)
		anLocalInt_170_ = ((Class266) class266).aShortArray2078.length;
	    if ((anLocalInt_162_ & 0x1) != 1) {
		int[] anLocalInts = null;
		if ((anLocalInt_162_ & 0x2) == 2) {
		    anLocalInts = new int[anLocalInt_166_];
		    for (int anLocalInt_171_ = 0;
			 anLocalInt_166_ > anLocalInt_171_; anLocalInt_171_++)
			anLocalInts[anLocalInt_171_]
			    = Network.stream.g2();
		}
		short[] anLocalInts_172_ = null;
		if ((anLocalInt_162_ & 0x4) == 4) {
		    anLocalInts_172_ = new short[anLocalInt_169_];
		    for (int anLocalInt_173_ = 0;
			 anLocalInt_173_ < anLocalInt_169_; anLocalInt_173_++)
			anLocalInts_172_[anLocalInt_173_]
			    = (short) Network.stream
					  .g2();
		}
		short[] anLocalInts_174_ = null;
		if ((anLocalInt_162_ & 0x8) == 8) {
		    anLocalInts_174_ = new short[anLocalInt_170_];
		    for (int anLocalInt_175_ = 0;
			 anLocalInt_170_ > anLocalInt_175_; anLocalInt_175_++)
			anLocalInts_174_[anLocalInt_175_]
			    = (short) Network.stream
					  .g2();
		}
		DoublyLinkedNode_Sub51_Sub5.method1200(anLocalInt_165_, anLocalInt_164_, new Class120(Class23.aLong154++, anLocalInts, anLocalInts_172_, anLocalInts_174_), 9288, anLocalInt_160_, Class379.anInt3227);
	    } else
		DoublyLinkedNode_Sub51_Sub5.method1200(anLocalInt_165_, anLocalInt_164_, null, 9288, anLocalInt_160_, Class379.anInt3227);
	} else if (argument == Class217.aClass329_1523) {
	    Network.stream.g1();
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_176_
		= ((anLocalInt & 0x7a) >> 4) + Class208.anInt1494;
	    int anLocalInt_177_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_178_
		= Network.stream.g2();
	    int anLocalInt_179_
		= Network.stream.g1();
	    int anLocalInt_180_
		= Network.stream.g3_dupl();
	    String string
		= Network.stream.gstr();
	    Node_Sub31_Sub17.method929(anLocalInt_178_, Class379.anInt3227,
                anLocalInt_176_, false,
                anLocalInt_177_, anLocalInt_179_,
                anLocalInt_180_, string);
	} else if (Class365.aClass329_3075 == argument) {
	    int anLocalInt
		= Network.stream.g1();
	    int anLocalInt_181_ = (anLocalInt >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_182_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_183_
		= Network.stream.g2();
	    if (anLocalInt_183_ == 65535)
		anLocalInt_183_ = -1;
	    int anLocalInt_184_
		= Network.stream.g1();
	    int anLocalInt_185_ = (anLocalInt_184_ & 0xf0) >> 4;
	    int anLocalInt_186_ = anLocalInt_184_ & 0x7;
	    int anLocalInt_187_
		= Network.stream.g1();
	    int anLocalInt_188_
		= Network.stream.g1();
	    int anLocalInt_189_
		= Network.stream.g2();
	    if (anLocalInt_181_ >= 0 && anLocalInt_182_ >= 0
		&& MapRelated.mapWidth > anLocalInt_181_
		&& MapRelated.mapDepth > anLocalInt_182_) {
		int anLocalInt_190_ = anLocalInt_185_ + 1;
		if ((((Entity)
		      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		     .pathX[0]) >= anLocalInt_181_ - anLocalInt_190_
		    && ((((Entity)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .pathX[0])
			<= anLocalInt_190_ + anLocalInt_181_)
		    && ((((Entity)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .pathZ[0])
			>= -anLocalInt_190_ + anLocalInt_182_)
		    && (anLocalInt_190_ + anLocalInt_182_
			>= (((Entity)
			     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			    .pathZ[0])))
		    dba_sub_772_Sub1.method1310(anLocalInt_186_,
						anLocalInt_188_,
						anLocalInt_189_,
						anLocalInt_187_, true,
						(anLocalInt_185_
						 + ((Class379.anInt3227 << 24)
						    + (anLocalInt_181_ << 16))
						 + (anLocalInt_182_ << 8)),
						anLocalInt_183_);
	    }
	} else if (argument == Class62_Sub2.aClass329_4366) {
	    int anLocalInt = Network.stream.g1_128p();
	    int anLocalInt_191_ = (anLocalInt >> 4 & 0x7) + Class208.anInt1494;
	    int anLocalInt_192_
		= (anLocalInt & 0x7) + Node_Sub31_Sub37.anInt6032;
	    int anLocalInt_193_
		= Network.stream.g2m128();
	    int anLocalInt_194_
		= Network.stream.g1_128p();
	    int anLocalInt_195_ = anLocalInt_194_ >> 2;
	    int anLocalInt_196_ = anLocalInt_194_ & 0x3;
	    int anLocalInt_197_
		= Node_Sub38.anIntArray4195[anLocalInt_195_];
	    if (Class154_Sub1.method2579(25757, MapRelated.anInt5582)
		|| (anLocalInt_191_ >= 0 && anLocalInt_192_ >= 0
		    && anLocalInt_191_ < MapRelated.mapWidth
		    && MapRelated.mapDepth > anLocalInt_192_))
		Node_Sub47_Sub3.method1120(anLocalInt_195_,
                Class379.anInt3227,
                anLocalInt_196_, 2899,
                anLocalInt_193_, anLocalInt_192_,
                anLocalInt_191_,
                anLocalInt_197_);
	} else if (argument == Node_Sub13.aClass329_3982) {
	    int anLocalInt = Network.stream.g2();
	    int anLocalInt_198_
		= Network.stream.g1();
	    Node_Sub31_Sub30.aClass257_5983.method3298
		((byte) 113, anLocalInt).method3347(0, anLocalInt_198_);
	} else {
	    ErrorReporting.reportError("T3 - " + argument, null);
	    Class44.method429(48, false);
	}
    }
    
    final boolean method3095(int argument_199_, int argument_200_,
			     tia_sub_35DoublyLinked argument_201_, int argument_202_) {
	tia_sub_35_Sub1DoublyLinked var_tia_sub_35_Sub1 = (tia_sub_35_Sub1DoublyLinked) argument_201_;
	argument_199_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6653 + 1;
	argument_200_ += ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6655 + 1;
	int anLocalInt
	    = argument_200_ * ((Class232) this).anInt1689 + argument_199_;
	int anLocalInt_203_
	    = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6654;
	int anLocalInt_204_
	    = ((tia_sub_35_Sub1DoublyLinked) var_tia_sub_35_Sub1).anInt6656;
	int anLocalInt_205_ = -anLocalInt_204_ + ((Class232) this).anInt1689;
	if (argument_200_ <= 0) {
	    int anLocalInt_206_ = -argument_200_ + 1;
	    argument_200_ = 1;
	    anLocalInt += anLocalInt_206_ * ((Class232) this).anInt1689;
	    anLocalInt_203_ -= anLocalInt_206_;
	}
	if (anInt1683 <= anLocalInt_203_ + argument_200_) {
	    int anLocalInt_207_
		= -anInt1683 + 1 + (argument_200_ + anLocalInt_203_);
	    anLocalInt_203_ -= anLocalInt_207_;
	}
	if (argument_199_ <= 0) {
	    int anLocalInt_208_ = 1 - argument_199_;
	    anLocalInt_205_ += anLocalInt_208_;
	    anLocalInt_204_ -= anLocalInt_208_;
	    argument_199_ = 1;
	    anLocalInt += anLocalInt_208_;
	}
	if (((Class232) this).anInt1689 <= anLocalInt_204_ + argument_199_) {
	    int anLocalInt_209_ = (-((Class232) this).anInt1689 + argument_199_
				   - (-anLocalInt_204_ - 1));
	    anLocalInt_204_ -= anLocalInt_209_;
	    anLocalInt_205_ += anLocalInt_209_;
	}
	if (anLocalInt_204_ <= 0 || anLocalInt_203_ <= 0)
	    return false;
	int anLocalInt_210_ = 8;
	anLocalInt_205_ += (anLocalInt_210_ - 1) * ((Class232) this).anInt1689;
	return Node_Sub31_Sub35.method990(anLocalInt_204_, anLocalInt_203_,
            anLocalInt_210_, anLocalInt_205_,
            anLocalInt, 31292,
            ((Class232) this).aByteArray1691);
    }
    
    Class232(GraphicsToolkit_Sub2 argument_211_, Class_s_Sub1 argument_212_) {
	aClass_s_Sub1_1690 = argument_212_;
	aClass_ha_Sub2_1686 = argument_211_;
	((Class232) this).anInt1689
	    = 2 + ((((Class_s) aClass_s_Sub1_1690).anInt2547
		    * ((Class_s) aClass_s_Sub1_1690).anInt2550)
		   >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_1686).anInt4701);
	anInt1683 = ((((Class_s) aClass_s_Sub1_1690).anInt2547
		      * ((Class_s) aClass_s_Sub1_1690).anInt2549)
		     >> ((GraphicsToolkit_Sub2) aClass_ha_Sub2_1686).anInt4701) + 2;
	anInt1687 = (-((Class_s) aClass_s_Sub1_1690).anInt2548
		     + (((GraphicsToolkit_Sub2) aClass_ha_Sub2_1686).anInt4701 + 7));
	((Class232) this).aByteArray1691
	    = new byte[((Class232) this).anInt1689 * anInt1683];
	anInt1685 = ((Class_s) aClass_s_Sub1_1690).anInt2550 >> anInt1687;
	anInt1695 = ((Class_s) aClass_s_Sub1_1690).anInt2549 >> anInt1687;
    }
}
