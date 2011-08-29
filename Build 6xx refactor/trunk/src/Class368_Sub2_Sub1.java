/* Class368_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class368_Sub2_Sub1 extends Class368_Sub2
{
    private int[] anIntArray6633;
    private byte[] aByteArray6634;
    
    final void method4012(int argument_0_, int argument_1_, int argument_2_,
			  int argument_3_, int argument_4_, int argument_5_,
			  int argument_6_, int argument_7_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	if (argument_2_ > 0 && argument_3_ > 0) {
	    int anLocalInt = 0;
	    int anLocalInt_8_ = 0;
	    int anLocalInt_9_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .width);
	    int anLocalInt_10_ = (((Class368_Sub2) this).anInt5698
				  + ((Class368_Sub2) this).width
				  + ((Class368_Sub2) this).anInt5715);
	    int anLocalInt_11_ = (((Class368_Sub2) this).anInt5719
				  + ((Class368_Sub2) this).height
				  + ((Class368_Sub2) this).anInt5708);
	    int anLocalInt_12_ = (anLocalInt_10_ << 16) / argument_2_;
	    int anLocalInt_13_ = (anLocalInt_11_ << 16) / argument_3_;
	    if (((Class368_Sub2) this).anInt5698 > 0) {
		int anLocalInt_14_ = (((((Class368_Sub2) this).anInt5698 << 16)
				       + anLocalInt_12_ - 1)
				      / anLocalInt_12_);
		argument_0_ += anLocalInt_14_;
		anLocalInt += (anLocalInt_14_ * anLocalInt_12_
			       - (((Class368_Sub2) this).anInt5698 << 16));
	    }
	    if (((Class368_Sub2) this).anInt5719 > 0) {
		int anLocalInt_15_ = (((((Class368_Sub2) this).anInt5719 << 16)
				       + anLocalInt_13_ - 1)
				      / anLocalInt_13_);
		argument_1_ += anLocalInt_15_;
		anLocalInt_8_ += (anLocalInt_15_ * anLocalInt_13_
				  - (((Class368_Sub2) this).anInt5719 << 16));
	    }
	    if (((Class368_Sub2) this).width < anLocalInt_10_)
		argument_2_
		    = ((((Class368_Sub2) this).width << 16) - anLocalInt
		       + anLocalInt_12_ - 1) / anLocalInt_12_;
	    if (((Class368_Sub2) this).height < anLocalInt_11_)
		argument_3_
		    = ((((Class368_Sub2) this).height << 16) - anLocalInt_8_
		       + anLocalInt_13_ - 1) / anLocalInt_13_;
	    int anLocalInt_16_ = argument_0_ + argument_1_ * anLocalInt_9_;
	    int anLocalInt_17_ = anLocalInt_9_ - argument_2_;
	    if (argument_1_ + argument_3_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipBottom))
		argument_3_
		    -= (argument_1_ + argument_3_
			- ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).clipBottom);
	    if (argument_1_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop)) {
		int anLocalInt_18_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipTop
		       - argument_1_);
		argument_3_ -= anLocalInt_18_;
		anLocalInt_16_ += anLocalInt_18_ * anLocalInt_9_;
		anLocalInt_8_ += anLocalInt_13_ * anLocalInt_18_;
	    }
	    if (argument_0_ + argument_2_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipRight)) {
		int anLocalInt_19_
		    = (argument_0_ + argument_2_
		       - ((JavaToolkit) (((Class368_Sub2) this)
					   .toolkit)).clipRight);
		argument_2_ -= anLocalInt_19_;
		anLocalInt_17_ += anLocalInt_19_;
	    }
	    if (argument_0_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft)) {
		int anLocalInt_20_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipLeft
		       - argument_0_);
		argument_2_ -= anLocalInt_20_;
		anLocalInt_16_ += anLocalInt_20_;
		anLocalInt += anLocalInt_12_ * anLocalInt_20_;
		anLocalInt_17_ += anLocalInt_20_;
	    }
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_6_ == 0) {
		if (argument_4_ == 1) {
		    int anLocalInt_21_ = anLocalInt;
		    for (int anLocalInt_22_ = -argument_3_; anLocalInt_22_ < 0;
			 anLocalInt_22_++) {
			int anLocalInt_23_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_24_ = -argument_2_;
			     anLocalInt_24_ < 0; anLocalInt_24_++) {
			    anLocalInts[anLocalInt_16_++]
				= (anIntArray6633
				   [((aByteArray6634
				      [(anLocalInt >> 16) + anLocalInt_23_])
				     & 0xff)]);
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_21_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 0) {
		    int anLocalInt_25_ = (argument_5_ & 0xff0000) >> 16;
		    int anLocalInt_26_ = (argument_5_ & 0xff00) >> 8;
		    int anLocalInt_27_ = argument_5_ & 0xff;
		    int anLocalInt_28_ = anLocalInt;
		    for (int anLocalInt_29_ = -argument_3_; anLocalInt_29_ < 0;
			 anLocalInt_29_++) {
			int anLocalInt_30_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_31_ = -argument_2_;
			     anLocalInt_31_ < 0; anLocalInt_31_++) {
			    int anLocalInt_32_
				= (anIntArray6633
				   [((aByteArray6634
				      [(anLocalInt >> 16) + anLocalInt_30_])
				     & 0xff)]);
			    int anLocalInt_33_
				= ((anLocalInt_32_ & 0xff0000) * anLocalInt_25_
				   & ~0xffffff);
			    int anLocalInt_34_
				= ((anLocalInt_32_ & 0xff00) * anLocalInt_26_
				   & 0xff0000);
			    int anLocalInt_35_
				= ((anLocalInt_32_ & 0xff) * anLocalInt_27_
				   & 0xff00);
			    anLocalInts[anLocalInt_16_++]
				= (anLocalInt_33_ | anLocalInt_34_
				   | anLocalInt_35_) >>> 8;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_28_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 3) {
		    int anLocalInt_36_ = anLocalInt;
		    for (int anLocalInt_37_ = -argument_3_; anLocalInt_37_ < 0;
			 anLocalInt_37_++) {
			int anLocalInt_38_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_39_ = -argument_2_;
			     anLocalInt_39_ < 0; anLocalInt_39_++) {
			    byte anLocalInt_40_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_38_]);
			    int anLocalInt_41_
				= (anLocalInt_40_ > 0
				   ? anIntArray6633[anLocalInt_40_] : 0);
			    int anLocalInt_42_ = anLocalInt_41_ + argument_5_;
			    int anLocalInt_43_ = ((anLocalInt_41_ & 0xff00ff)
						  + (argument_5_ & 0xff00ff));
			    int anLocalInt_44_
				= ((anLocalInt_43_ & 0x1000100)
				   + (anLocalInt_42_ - anLocalInt_43_
				      & 0x10000));
			    anLocalInts[anLocalInt_16_++]
				= (anLocalInt_42_ - anLocalInt_44_
				   | anLocalInt_44_ - (anLocalInt_44_ >>> 8));
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_36_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 2) {
		    int anLocalInt_45_ = argument_5_ >>> 24;
		    int anLocalInt_46_ = 256 - anLocalInt_45_;
		    int anLocalInt_47_
			= ((argument_5_ & 0xff00ff) * anLocalInt_46_
			   & ~0xff00ff);
		    int anLocalInt_48_
			= (argument_5_ & 0xff00) * anLocalInt_46_ & 0xff0000;
		    argument_5_ = (anLocalInt_47_ | anLocalInt_48_) >>> 8;
		    int anLocalInt_49_ = anLocalInt;
		    for (int anLocalInt_50_ = -argument_3_; anLocalInt_50_ < 0;
			 anLocalInt_50_++) {
			int anLocalInt_51_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_52_ = -argument_2_;
			     anLocalInt_52_ < 0; anLocalInt_52_++) {
			    int anLocalInt_53_
				= (anIntArray6633
				   [((aByteArray6634
				      [(anLocalInt >> 16) + anLocalInt_51_])
				     & 0xff)]);
			    anLocalInt_47_
				= ((anLocalInt_53_ & 0xff00ff) * anLocalInt_45_
				   & ~0xff00ff);
			    anLocalInt_48_
				= ((anLocalInt_53_ & 0xff00) * anLocalInt_45_
				   & 0xff0000);
			    anLocalInts[anLocalInt_16_++]
				= (((anLocalInt_47_ | anLocalInt_48_) >>> 8)
				   + argument_5_);
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_49_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_6_ == 1) {
		if (argument_4_ == 1) {
		    int anLocalInt_54_ = anLocalInt;
		    for (int anLocalInt_55_ = -argument_3_; anLocalInt_55_ < 0;
			 anLocalInt_55_++) {
			int anLocalInt_56_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_57_ = -argument_2_;
			     anLocalInt_57_ < 0; anLocalInt_57_++) {
			    int anLocalInt_58_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_56_]);
			    if (anLocalInt_58_ != 0)
				anLocalInts[anLocalInt_16_++]
				    = anIntArray6633[anLocalInt_58_ & 0xff];
			    else
				anLocalInt_16_++;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_54_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 0) {
		    int anLocalInt_59_ = anLocalInt;
		    if ((argument_5_ & 0xffffff) == 16777215) {
			int anLocalInt_60_ = argument_5_ >>> 24;
			int anLocalInt_61_ = 256 - anLocalInt_60_;
			for (int anLocalInt_62_ = -argument_3_;
			     anLocalInt_62_ < 0; anLocalInt_62_++) {
			    int anLocalInt_63_
				= ((anLocalInt_8_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_64_ = -argument_2_;
				 anLocalInt_64_ < 0; anLocalInt_64_++) {
				int anLocalInt_65_
				    = (aByteArray6634
				       [(anLocalInt >> 16) + anLocalInt_63_]);
				if (anLocalInt_65_ != 0) {
				    int anLocalInt_66_
					= (anIntArray6633
					   [anLocalInt_65_ & 0xff]);
				    int anLocalInt_67_
					= anLocalInts[anLocalInt_16_];
				    anLocalInts[anLocalInt_16_++]
					= (((((anLocalInt_66_ & 0xff00ff)
					      * anLocalInt_60_)
					     + ((anLocalInt_67_ & 0xff00ff)
						* anLocalInt_61_))
					    & ~0xff00ff)
					   + ((((anLocalInt_66_ & 0xff00)
						* anLocalInt_60_)
					       + ((anLocalInt_67_ & 0xff00)
						  * anLocalInt_61_))
					      & 0xff0000)) >> 8;
				} else
				    anLocalInt_16_++;
				anLocalInt += anLocalInt_12_;
			    }
			    anLocalInt_8_ += anLocalInt_13_;
			    anLocalInt = anLocalInt_59_;
			    anLocalInt_16_ += anLocalInt_17_;
			}
		    } else {
			int anLocalInt_68_ = (argument_5_ & 0xff0000) >> 16;
			int anLocalInt_69_ = (argument_5_ & 0xff00) >> 8;
			int anLocalInt_70_ = argument_5_ & 0xff;
			int anLocalInt_71_ = argument_5_ >>> 24;
			int anLocalInt_72_ = 256 - anLocalInt_71_;
			for (int anLocalInt_73_ = -argument_3_;
			     anLocalInt_73_ < 0; anLocalInt_73_++) {
			    int anLocalInt_74_
				= ((anLocalInt_8_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_75_ = -argument_2_;
				 anLocalInt_75_ < 0; anLocalInt_75_++) {
				int anLocalInt_76_
				    = (aByteArray6634
				       [(anLocalInt >> 16) + anLocalInt_74_]);
				if (anLocalInt_76_ != 0) {
				    int anLocalInt_77_
					= (anIntArray6633
					   [anLocalInt_76_ & 0xff]);
				    if (anLocalInt_71_ != 255) {
					int anLocalInt_78_
					    = (((anLocalInt_77_ & 0xff0000)
						* anLocalInt_68_)
					       & ~0xffffff);
					int anLocalInt_79_
					    = (((anLocalInt_77_ & 0xff00)
						* anLocalInt_69_)
					       & 0xff0000);
					int anLocalInt_80_
					    = (((anLocalInt_77_ & 0xff)
						* anLocalInt_70_)
					       & 0xff00);
					anLocalInt_77_
					    = (anLocalInt_78_ | anLocalInt_79_
					       | anLocalInt_80_) >>> 8;
					int anLocalInt_81_
					    = anLocalInts[anLocalInt_16_];
					anLocalInts[anLocalInt_16_++]
					    = (((((anLocalInt_77_ & 0xff00ff)
						  * anLocalInt_71_)
						 + ((anLocalInt_81_ & 0xff00ff)
						    * anLocalInt_72_))
						& ~0xff00ff)
					       + ((((anLocalInt_77_ & 0xff00)
						    * anLocalInt_71_)
						   + ((anLocalInt_81_ & 0xff00)
						      * anLocalInt_72_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_82_
					    = (((anLocalInt_77_ & 0xff0000)
						* anLocalInt_68_)
					       & ~0xffffff);
					int anLocalInt_83_
					    = (((anLocalInt_77_ & 0xff00)
						* anLocalInt_69_)
					       & 0xff0000);
					int anLocalInt_84_
					    = (((anLocalInt_77_ & 0xff)
						* anLocalInt_70_)
					       & 0xff00);
					anLocalInts[anLocalInt_16_++]
					    = (anLocalInt_82_ | anLocalInt_83_
					       | anLocalInt_84_) >>> 8;
				    }
				} else
				    anLocalInt_16_++;
				anLocalInt += anLocalInt_12_;
			    }
			    anLocalInt_8_ += anLocalInt_13_;
			    anLocalInt = anLocalInt_59_;
			    anLocalInt_16_ += anLocalInt_17_;
			}
			return;
		    }
		    return;
		}
		if (argument_4_ == 3) {
		    int anLocalInt_85_ = anLocalInt;
		    int anLocalInt_86_ = argument_5_ >>> 24;
		    int anLocalInt_87_ = 256 - anLocalInt_86_;
		    for (int anLocalInt_88_ = -argument_3_; anLocalInt_88_ < 0;
			 anLocalInt_88_++) {
			int anLocalInt_89_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_90_ = -argument_2_;
			     anLocalInt_90_ < 0; anLocalInt_90_++) {
			    byte anLocalInt_91_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_89_]);
			    int anLocalInt_92_
				= (anLocalInt_91_ > 0
				   ? anIntArray6633[anLocalInt_91_] : 0);
			    int anLocalInt_93_ = anLocalInt_92_ + argument_5_;
			    int anLocalInt_94_ = ((anLocalInt_92_ & 0xff00ff)
						  + (argument_5_ & 0xff00ff));
			    int anLocalInt_95_
				= ((anLocalInt_94_ & 0x1000100)
				   + (anLocalInt_93_ - anLocalInt_94_
				      & 0x10000));
			    anLocalInt_95_
				= (anLocalInt_93_ - anLocalInt_95_
				   | anLocalInt_95_ - (anLocalInt_95_ >>> 8));
			    if (anLocalInt_92_ == 0 && anLocalInt_86_ != 255) {
				anLocalInt_92_ = anLocalInt_95_;
				anLocalInt_95_ = anLocalInts[anLocalInt_16_];
				anLocalInt_95_
				    = (((((anLocalInt_92_ & 0xff00ff)
					  * anLocalInt_86_)
					 + ((anLocalInt_95_ & 0xff00ff)
					    * anLocalInt_87_))
					& ~0xff00ff)
				       + ((((anLocalInt_92_ & 0xff00)
					    * anLocalInt_86_)
					   + ((anLocalInt_95_ & 0xff00)
					      * anLocalInt_87_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts[anLocalInt_16_++] = anLocalInt_95_;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_85_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 2) {
		    int anLocalInt_96_ = argument_5_ >>> 24;
		    int anLocalInt_97_ = 256 - anLocalInt_96_;
		    int anLocalInt_98_
			= ((argument_5_ & 0xff00ff) * anLocalInt_97_
			   & ~0xff00ff);
		    int anLocalInt_99_
			= (argument_5_ & 0xff00) * anLocalInt_97_ & 0xff0000;
		    argument_5_ = (anLocalInt_98_ | anLocalInt_99_) >>> 8;
		    int anLocalInt_100_ = anLocalInt;
		    for (int anLocalInt_101_ = -argument_3_;
			 anLocalInt_101_ < 0; anLocalInt_101_++) {
			int anLocalInt_102_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_103_ = -argument_2_;
			     anLocalInt_103_ < 0; anLocalInt_103_++) {
			    int anLocalInt_104_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_102_]);
			    if (anLocalInt_104_ != 0) {
				int anLocalInt_105_
				    = anIntArray6633[anLocalInt_104_ & 0xff];
				anLocalInt_98_
				    = ((anLocalInt_105_ & 0xff00ff)
				       * anLocalInt_96_) & ~0xff00ff;
				anLocalInt_99_ = ((anLocalInt_105_ & 0xff00)
						  * anLocalInt_96_) & 0xff0000;
				anLocalInts[anLocalInt_16_++]
				    = ((anLocalInt_98_ | anLocalInt_99_)
				       >>> 8) + argument_5_;
			    } else
				anLocalInt_16_++;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_100_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_6_ == 2) {
		if (argument_4_ == 1) {
		    int anLocalInt_106_ = anLocalInt;
		    for (int anLocalInt_107_ = -argument_3_;
			 anLocalInt_107_ < 0; anLocalInt_107_++) {
			int anLocalInt_108_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_109_ = -argument_2_;
			     anLocalInt_109_ < 0; anLocalInt_109_++) {
			    int anLocalInt_110_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_108_]);
			    if (anLocalInt_110_ != 0) {
				int anLocalInt_111_
				    = anIntArray6633[anLocalInt_110_ & 0xff];
				int anLocalInt_112_
				    = anLocalInts[anLocalInt_16_];
				int anLocalInt_113_
				    = anLocalInt_111_ + anLocalInt_112_;
				int anLocalInt_114_
				    = ((anLocalInt_111_ & 0xff00ff)
				       + (anLocalInt_112_ & 0xff00ff));
				anLocalInt_112_
				    = ((anLocalInt_114_ & 0x1000100)
				       + (anLocalInt_113_ - anLocalInt_114_
					  & 0x10000));
				anLocalInts[anLocalInt_16_++]
				    = (anLocalInt_113_ - anLocalInt_112_
				       | anLocalInt_112_ - (anLocalInt_112_
							    >>> 8));
			    } else
				anLocalInt_16_++;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_106_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 0) {
		    int anLocalInt_115_ = anLocalInt;
		    int anLocalInt_116_ = (argument_5_ & 0xff0000) >> 16;
		    int anLocalInt_117_ = (argument_5_ & 0xff00) >> 8;
		    int anLocalInt_118_ = argument_5_ & 0xff;
		    for (int anLocalInt_119_ = -argument_3_;
			 anLocalInt_119_ < 0; anLocalInt_119_++) {
			int anLocalInt_120_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_121_ = -argument_2_;
			     anLocalInt_121_ < 0; anLocalInt_121_++) {
			    int anLocalInt_122_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_120_]);
			    if (anLocalInt_122_ != 0) {
				int anLocalInt_123_
				    = anIntArray6633[anLocalInt_122_ & 0xff];
				int anLocalInt_124_
				    = (((anLocalInt_123_ & 0xff0000)
					* anLocalInt_116_)
				       & ~0xffffff);
				int anLocalInt_125_
				    = (((anLocalInt_123_ & 0xff00)
					* anLocalInt_117_)
				       & 0xff0000);
				int anLocalInt_126_
				    = (((anLocalInt_123_ & 0xff)
					* anLocalInt_118_)
				       & 0xff00);
				anLocalInt_123_
				    = (anLocalInt_124_ | anLocalInt_125_
				       | anLocalInt_126_) >>> 8;
				int anLocalInt_127_
				    = anLocalInts[anLocalInt_16_];
				int anLocalInt_128_
				    = anLocalInt_123_ + anLocalInt_127_;
				int anLocalInt_129_
				    = ((anLocalInt_123_ & 0xff00ff)
				       + (anLocalInt_127_ & 0xff00ff));
				anLocalInt_127_
				    = ((anLocalInt_129_ & 0x1000100)
				       + (anLocalInt_128_ - anLocalInt_129_
					  & 0x10000));
				anLocalInts[anLocalInt_16_++]
				    = (anLocalInt_128_ - anLocalInt_127_
				       | anLocalInt_127_ - (anLocalInt_127_
							    >>> 8));
			    } else
				anLocalInt_16_++;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_115_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 3) {
		    int anLocalInt_130_ = anLocalInt;
		    for (int anLocalInt_131_ = -argument_3_;
			 anLocalInt_131_ < 0; anLocalInt_131_++) {
			int anLocalInt_132_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_133_ = -argument_2_;
			     anLocalInt_133_ < 0; anLocalInt_133_++) {
			    byte anLocalInt_134_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_132_]);
			    int anLocalInt_135_
				= (anLocalInt_134_ > 0
				   ? anIntArray6633[anLocalInt_134_] : 0);
			    int anLocalInt_136_
				= anLocalInt_135_ + argument_5_;
			    int anLocalInt_137_ = ((anLocalInt_135_ & 0xff00ff)
						   + (argument_5_ & 0xff00ff));
			    int anLocalInt_138_
				= ((anLocalInt_137_ & 0x1000100)
				   + (anLocalInt_136_ - anLocalInt_137_
				      & 0x10000));
			    anLocalInt_135_
				= (anLocalInt_136_ - anLocalInt_138_
				   | anLocalInt_138_ - (anLocalInt_138_
							>>> 8));
			    anLocalInt_138_ = anLocalInts[anLocalInt_16_];
			    anLocalInt_136_
				= anLocalInt_135_ + anLocalInt_138_;
			    anLocalInt_137_ = ((anLocalInt_135_ & 0xff00ff)
					       + (anLocalInt_138_ & 0xff00ff));
			    anLocalInt_138_
				= ((anLocalInt_137_ & 0x1000100)
				   + (anLocalInt_136_ - anLocalInt_137_
				      & 0x10000));
			    anLocalInts[anLocalInt_16_++]
				= (anLocalInt_136_ - anLocalInt_138_
				   | anLocalInt_138_ - (anLocalInt_138_
							>>> 8));
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_130_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_4_ == 2) {
		    int anLocalInt_139_ = argument_5_ >>> 24;
		    int anLocalInt_140_ = 256 - anLocalInt_139_;
		    int anLocalInt_141_
			= ((argument_5_ & 0xff00ff) * anLocalInt_140_
			   & ~0xff00ff);
		    int anLocalInt_142_
			= (argument_5_ & 0xff00) * anLocalInt_140_ & 0xff0000;
		    argument_5_ = (anLocalInt_141_ | anLocalInt_142_) >>> 8;
		    int anLocalInt_143_ = anLocalInt;
		    for (int anLocalInt_144_ = -argument_3_;
			 anLocalInt_144_ < 0; anLocalInt_144_++) {
			int anLocalInt_145_
			    = ((anLocalInt_8_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_146_ = -argument_2_;
			     anLocalInt_146_ < 0; anLocalInt_146_++) {
			    int anLocalInt_147_
				= (aByteArray6634
				   [(anLocalInt >> 16) + anLocalInt_145_]);
			    if (anLocalInt_147_ != 0) {
				int anLocalInt_148_
				    = anIntArray6633[anLocalInt_147_ & 0xff];
				anLocalInt_141_
				    = ((anLocalInt_148_ & 0xff00ff)
				       * anLocalInt_139_) & ~0xff00ff;
				anLocalInt_142_
				    = ((anLocalInt_148_ & 0xff00)
				       * anLocalInt_139_) & 0xff0000;
				anLocalInt_148_
				    = ((anLocalInt_141_ | anLocalInt_142_)
				       >>> 8) + argument_5_;
				int anLocalInt_149_
				    = anLocalInts[anLocalInt_16_];
				int anLocalInt_150_
				    = anLocalInt_148_ + anLocalInt_149_;
				int anLocalInt_151_
				    = ((anLocalInt_148_ & 0xff00ff)
				       + (anLocalInt_149_ & 0xff00ff));
				anLocalInt_149_
				    = ((anLocalInt_151_ & 0x1000100)
				       + (anLocalInt_150_ - anLocalInt_151_
					  & 0x10000));
				anLocalInts[anLocalInt_16_++]
				    = (anLocalInt_150_ - anLocalInt_149_
				       | anLocalInt_149_ - (anLocalInt_149_
							    >>> 8));
			    } else
				anLocalInt_16_++;
			    anLocalInt += anLocalInt_12_;
			}
			anLocalInt_8_ += anLocalInt_13_;
			anLocalInt = anLocalInt_143_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void method4030(int[] argument_152_, int[] argument_153_,
			  int argument_154_, int argument_155_) {
	int[] anLocalInts
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .pixels);
	if (Class368_Sub2.anInt5717 == 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_156_ = anLocalInt + argument_155_;
		    if (anLocalInt_156_ >= 0) {
			if (anLocalInt_156_ >= argument_152_.length)
			    break;
			int anLocalInt_157_ = Class368_Sub2.anInt5724;
			int anLocalInt_158_ = Class368_Sub2.anInt5710;
			int anLocalInt_159_ = Class368_Sub2.anInt5704;
			int anLocalInt_160_ = Class368_Sub2.anInt5713;
			if (anLocalInt_158_ >= 0 && anLocalInt_159_ >= 0
			    && (anLocalInt_158_
				- (((Class368_Sub2) this).width << 12)) < 0
			    && ((anLocalInt_159_
				 - (((Class368_Sub2) this).height << 12))
				< 0)) {
			    int anLocalInt_161_
				= (argument_152_[anLocalInt_156_]
				   - argument_154_);
			    int anLocalInt_162_
				= -argument_153_[anLocalInt_156_];
			    int anLocalInt_163_
				= (anLocalInt_161_
				   - (anLocalInt_157_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_163_ > 0) {
				anLocalInt_157_ += anLocalInt_163_;
				anLocalInt_160_ += anLocalInt_163_;
				anLocalInt_158_ += (Class368_Sub2.anInt5717
						    * anLocalInt_163_);
				anLocalInt_159_ += (Class368_Sub2.anInt5712
						    * anLocalInt_163_);
			    } else
				anLocalInt_162_ -= anLocalInt_163_;
			    if (anLocalInt_160_ < anLocalInt_162_)
				anLocalInt_160_ = anLocalInt_162_;
			    for (/**/; anLocalInt_160_ < 0;
				 anLocalInt_160_++) {
				int anLocalInt_164_
				    = (aByteArray6634
				       [(((anLocalInt_159_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_158_ >> 12))]);
				if (anLocalInt_164_ != 0)
				    anLocalInts[anLocalInt_157_++]
					= (anIntArray6633
					   [anLocalInt_164_ & 0xff]);
				else
				    anLocalInt_157_++;
			    }
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_165_ = anLocalInt + argument_155_;
		    if (anLocalInt_165_ >= 0) {
			if (anLocalInt_165_ >= argument_152_.length)
			    break;
			int anLocalInt_166_ = Class368_Sub2.anInt5724;
			int anLocalInt_167_ = Class368_Sub2.anInt5710;
			int anLocalInt_168_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_169_ = Class368_Sub2.anInt5713;
			if (anLocalInt_167_ >= 0
			    && ((anLocalInt_167_
				 - (((Class368_Sub2) this).width << 12))
				< 0)) {
			    int anLocalInt_170_;
			    if ((anLocalInt_170_
				 = (anLocalInt_168_
				    - (((Class368_Sub2) this).height
				       << 12)))
				>= 0) {
				anLocalInt_170_ = ((Class368_Sub2.anInt5712
						    - anLocalInt_170_)
						   / Class368_Sub2.anInt5712);
				anLocalInt_169_ += anLocalInt_170_;
				anLocalInt_168_ += (Class368_Sub2.anInt5712
						    * anLocalInt_170_);
				anLocalInt_166_ += anLocalInt_170_;
			    }
			    if ((anLocalInt_170_
				 = ((anLocalInt_168_ - Class368_Sub2.anInt5712)
				    / Class368_Sub2.anInt5712))
				> anLocalInt_169_)
				anLocalInt_169_ = anLocalInt_170_;
			    int anLocalInt_171_
				= (argument_152_[anLocalInt_165_]
				   - argument_154_);
			    int anLocalInt_172_
				= -argument_153_[anLocalInt_165_];
			    int anLocalInt_173_
				= (anLocalInt_171_
				   - (anLocalInt_166_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_173_ > 0) {
				anLocalInt_166_ += anLocalInt_173_;
				anLocalInt_169_ += anLocalInt_173_;
				anLocalInt_167_ += (Class368_Sub2.anInt5717
						    * anLocalInt_173_);
				anLocalInt_168_ += (Class368_Sub2.anInt5712
						    * anLocalInt_173_);
			    } else
				anLocalInt_172_ -= anLocalInt_173_;
			    if (anLocalInt_169_ < anLocalInt_172_)
				anLocalInt_169_ = anLocalInt_172_;
			    for (/**/; anLocalInt_169_ < 0;
				 anLocalInt_169_++) {
				int anLocalInt_174_
				    = (aByteArray6634
				       [(((anLocalInt_168_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_167_ >> 12))]);
				if (anLocalInt_174_ != 0)
				    anLocalInts[anLocalInt_166_++]
					= (anIntArray6633
					   [anLocalInt_174_ & 0xff]);
				else
				    anLocalInt_166_++;
				anLocalInt_168_ += Class368_Sub2.anInt5712;
			    }
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_175_ = anLocalInt + argument_155_;
		    if (anLocalInt_175_ >= 0) {
			if (anLocalInt_175_ >= argument_152_.length)
			    break;
			int anLocalInt_176_ = Class368_Sub2.anInt5724;
			int anLocalInt_177_ = Class368_Sub2.anInt5710;
			int anLocalInt_178_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_179_ = Class368_Sub2.anInt5713;
			if (anLocalInt_177_ >= 0
			    && ((anLocalInt_177_
				 - (((Class368_Sub2) this).width << 12))
				< 0)) {
			    if (anLocalInt_178_ < 0) {
				int anLocalInt_180_
				    = ((Class368_Sub2.anInt5712 - 1
					- anLocalInt_178_)
				       / Class368_Sub2.anInt5712);
				anLocalInt_179_ += anLocalInt_180_;
				anLocalInt_178_ += (Class368_Sub2.anInt5712
						    * anLocalInt_180_);
				anLocalInt_176_ += anLocalInt_180_;
			    }
			    int anLocalInt_181_;
			    if ((anLocalInt_181_
				 = ((anLocalInt_178_ + 1
				     - (((Class368_Sub2) this).height << 12)
				     - Class368_Sub2.anInt5712)
				    / Class368_Sub2.anInt5712))
				> anLocalInt_179_)
				anLocalInt_179_ = anLocalInt_181_;
			    int anLocalInt_182_
				= (argument_152_[anLocalInt_175_]
				   - argument_154_);
			    int anLocalInt_183_
				= -argument_153_[anLocalInt_175_];
			    int anLocalInt_184_
				= (anLocalInt_182_
				   - (anLocalInt_176_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_184_ > 0) {
				anLocalInt_176_ += anLocalInt_184_;
				anLocalInt_179_ += anLocalInt_184_;
				anLocalInt_177_ += (Class368_Sub2.anInt5717
						    * anLocalInt_184_);
				anLocalInt_178_ += (Class368_Sub2.anInt5712
						    * anLocalInt_184_);
			    } else
				anLocalInt_183_ -= anLocalInt_184_;
			    if (anLocalInt_179_ < anLocalInt_183_)
				anLocalInt_179_ = anLocalInt_183_;
			    for (/**/; anLocalInt_179_ < 0;
				 anLocalInt_179_++) {
				int anLocalInt_185_
				    = (aByteArray6634
				       [(((anLocalInt_178_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_177_ >> 12))]);
				if (anLocalInt_185_ != 0)
				    anLocalInts[anLocalInt_176_++]
					= (anIntArray6633
					   [anLocalInt_185_ & 0xff]);
				else
				    anLocalInt_176_++;
				anLocalInt_178_ += Class368_Sub2.anInt5712;
			    }
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    }
	} else if (Class368_Sub2.anInt5717 < 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_186_ = anLocalInt + argument_155_;
		    if (anLocalInt_186_ >= 0) {
			if (anLocalInt_186_ >= argument_152_.length)
			    break;
			int anLocalInt_187_ = Class368_Sub2.anInt5724;
			int anLocalInt_188_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_189_ = Class368_Sub2.anInt5704;
			int anLocalInt_190_ = Class368_Sub2.anInt5713;
			if (anLocalInt_189_ >= 0
			    && ((anLocalInt_189_
				 - (((Class368_Sub2) this).height << 12))
				< 0)) {
			    int anLocalInt_191_;
			    if ((anLocalInt_191_
				 = (anLocalInt_188_
				    - (((Class368_Sub2) this).width
				       << 12)))
				>= 0) {
				anLocalInt_191_ = ((Class368_Sub2.anInt5717
						    - anLocalInt_191_)
						   / Class368_Sub2.anInt5717);
				anLocalInt_190_ += anLocalInt_191_;
				anLocalInt_188_ += (Class368_Sub2.anInt5717
						    * anLocalInt_191_);
				anLocalInt_187_ += anLocalInt_191_;
			    }
			    if ((anLocalInt_191_
				 = ((anLocalInt_188_ - Class368_Sub2.anInt5717)
				    / Class368_Sub2.anInt5717))
				> anLocalInt_190_)
				anLocalInt_190_ = anLocalInt_191_;
			    int anLocalInt_192_
				= (argument_152_[anLocalInt_186_]
				   - argument_154_);
			    int anLocalInt_193_
				= -argument_153_[anLocalInt_186_];
			    int anLocalInt_194_
				= (anLocalInt_192_
				   - (anLocalInt_187_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_194_ > 0) {
				anLocalInt_187_ += anLocalInt_194_;
				anLocalInt_190_ += anLocalInt_194_;
				anLocalInt_188_ += (Class368_Sub2.anInt5717
						    * anLocalInt_194_);
				anLocalInt_189_ += (Class368_Sub2.anInt5712
						    * anLocalInt_194_);
			    } else
				anLocalInt_193_ -= anLocalInt_194_;
			    if (anLocalInt_190_ < anLocalInt_193_)
				anLocalInt_190_ = anLocalInt_193_;
			    for (/**/; anLocalInt_190_ < 0;
				 anLocalInt_190_++) {
				int anLocalInt_195_
				    = (aByteArray6634
				       [(((anLocalInt_189_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_188_ >> 12))]);
				if (anLocalInt_195_ != 0)
				    anLocalInts[anLocalInt_187_++]
					= (anIntArray6633
					   [anLocalInt_195_ & 0xff]);
				else
				    anLocalInt_187_++;
				anLocalInt_188_ += Class368_Sub2.anInt5717;
			    }
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_196_ = anLocalInt + argument_155_;
		    if (anLocalInt_196_ >= 0) {
			if (anLocalInt_196_ >= argument_152_.length)
			    break;
			int anLocalInt_197_ = Class368_Sub2.anInt5724;
			int anLocalInt_198_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_199_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_200_ = Class368_Sub2.anInt5713;
			int anLocalInt_201_;
			if ((anLocalInt_201_
			     = (anLocalInt_198_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_201_
				= ((Class368_Sub2.anInt5717 - anLocalInt_201_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_200_ += anLocalInt_201_;
			    anLocalInt_198_
				+= Class368_Sub2.anInt5717 * anLocalInt_201_;
			    anLocalInt_199_
				+= Class368_Sub2.anInt5712 * anLocalInt_201_;
			    anLocalInt_197_ += anLocalInt_201_;
			}
			if ((anLocalInt_201_
			     = ((anLocalInt_198_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_200_)
			    anLocalInt_200_ = anLocalInt_201_;
			if ((anLocalInt_201_
			     = (anLocalInt_199_
				- (((Class368_Sub2) this).height << 12)))
			    >= 0) {
			    anLocalInt_201_
				= ((Class368_Sub2.anInt5712 - anLocalInt_201_)
				   / Class368_Sub2.anInt5712);
			    anLocalInt_200_ += anLocalInt_201_;
			    anLocalInt_198_
				+= Class368_Sub2.anInt5717 * anLocalInt_201_;
			    anLocalInt_199_
				+= Class368_Sub2.anInt5712 * anLocalInt_201_;
			    anLocalInt_197_ += anLocalInt_201_;
			}
			if ((anLocalInt_201_
			     = ((anLocalInt_199_ - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_200_)
			    anLocalInt_200_ = anLocalInt_201_;
			int anLocalInt_202_
			    = argument_152_[anLocalInt_196_] - argument_154_;
			int anLocalInt_203_ = -argument_153_[anLocalInt_196_];
			int anLocalInt_204_
			    = (anLocalInt_202_
			       - (anLocalInt_197_ - Class368_Sub2.anInt5724));
			if (anLocalInt_204_ > 0) {
			    anLocalInt_197_ += anLocalInt_204_;
			    anLocalInt_200_ += anLocalInt_204_;
			    anLocalInt_198_
				+= Class368_Sub2.anInt5717 * anLocalInt_204_;
			    anLocalInt_199_
				+= Class368_Sub2.anInt5712 * anLocalInt_204_;
			} else
			    anLocalInt_203_ -= anLocalInt_204_;
			if (anLocalInt_200_ < anLocalInt_203_)
			    anLocalInt_200_ = anLocalInt_203_;
			for (/**/; anLocalInt_200_ < 0; anLocalInt_200_++) {
			    int anLocalInt_205_
				= (aByteArray6634
				   [(((anLocalInt_199_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_198_ >> 12))]);
			    if (anLocalInt_205_ != 0)
				anLocalInts[anLocalInt_197_++]
				    = anIntArray6633[anLocalInt_205_ & 0xff];
			    else
				anLocalInt_197_++;
			    anLocalInt_198_ += Class368_Sub2.anInt5717;
			    anLocalInt_199_ += Class368_Sub2.anInt5712;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_206_ = anLocalInt + argument_155_;
		    if (anLocalInt_206_ >= 0) {
			if (anLocalInt_206_ >= argument_152_.length)
			    break;
			int anLocalInt_207_ = Class368_Sub2.anInt5724;
			int anLocalInt_208_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_209_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_210_ = Class368_Sub2.anInt5713;
			int anLocalInt_211_;
			if ((anLocalInt_211_
			     = (anLocalInt_208_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_211_
				= ((Class368_Sub2.anInt5717 - anLocalInt_211_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_210_ += anLocalInt_211_;
			    anLocalInt_208_
				+= Class368_Sub2.anInt5717 * anLocalInt_211_;
			    anLocalInt_209_
				+= Class368_Sub2.anInt5712 * anLocalInt_211_;
			    anLocalInt_207_ += anLocalInt_211_;
			}
			if ((anLocalInt_211_
			     = ((anLocalInt_208_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_210_)
			    anLocalInt_210_ = anLocalInt_211_;
			if (anLocalInt_209_ < 0) {
			    anLocalInt_211_ = ((Class368_Sub2.anInt5712 - 1
						- anLocalInt_209_)
					       / Class368_Sub2.anInt5712);
			    anLocalInt_210_ += anLocalInt_211_;
			    anLocalInt_208_
				+= Class368_Sub2.anInt5717 * anLocalInt_211_;
			    anLocalInt_209_
				+= Class368_Sub2.anInt5712 * anLocalInt_211_;
			    anLocalInt_207_ += anLocalInt_211_;
			}
			if ((anLocalInt_211_
			     = ((anLocalInt_209_ + 1
				 - (((Class368_Sub2) this).height << 12)
				 - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_210_)
			    anLocalInt_210_ = anLocalInt_211_;
			int anLocalInt_212_
			    = argument_152_[anLocalInt_206_] - argument_154_;
			int anLocalInt_213_ = -argument_153_[anLocalInt_206_];
			int anLocalInt_214_
			    = (anLocalInt_212_
			       - (anLocalInt_207_ - Class368_Sub2.anInt5724));
			if (anLocalInt_214_ > 0) {
			    anLocalInt_207_ += anLocalInt_214_;
			    anLocalInt_210_ += anLocalInt_214_;
			    anLocalInt_208_
				+= Class368_Sub2.anInt5717 * anLocalInt_214_;
			    anLocalInt_209_
				+= Class368_Sub2.anInt5712 * anLocalInt_214_;
			} else
			    anLocalInt_213_ -= anLocalInt_214_;
			if (anLocalInt_210_ < anLocalInt_213_)
			    anLocalInt_210_ = anLocalInt_213_;
			for (/**/; anLocalInt_210_ < 0; anLocalInt_210_++) {
			    int anLocalInt_215_
				= (aByteArray6634
				   [(((anLocalInt_209_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_208_ >> 12))]);
			    if (anLocalInt_215_ != 0)
				anLocalInts[anLocalInt_207_++]
				    = anIntArray6633[anLocalInt_215_ & 0xff];
			    else
				anLocalInt_207_++;
			    anLocalInt_208_ += Class368_Sub2.anInt5717;
			    anLocalInt_209_ += Class368_Sub2.anInt5712;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    }
	} else if (Class368_Sub2.anInt5712 == 0) {
	    int anLocalInt = Class368_Sub2.anInt5700;
	    while (anLocalInt < 0) {
		int anLocalInt_216_ = anLocalInt + argument_155_;
		if (anLocalInt_216_ >= 0) {
		    if (anLocalInt_216_ >= argument_152_.length)
			break;
		    int anLocalInt_217_ = Class368_Sub2.anInt5724;
		    int anLocalInt_218_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_219_ = Class368_Sub2.anInt5704;
		    int anLocalInt_220_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_219_ >= 0
			&& anLocalInt_219_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			if (anLocalInt_218_ < 0) {
			    int anLocalInt_221_ = ((Class368_Sub2.anInt5717 - 1
						    - anLocalInt_218_)
						   / Class368_Sub2.anInt5717);
			    anLocalInt_220_ += anLocalInt_221_;
			    anLocalInt_218_
				+= Class368_Sub2.anInt5717 * anLocalInt_221_;
			    anLocalInt_217_ += anLocalInt_221_;
			}
			int anLocalInt_222_;
			if ((anLocalInt_222_
			     = ((anLocalInt_218_ + 1
				 - (((Class368_Sub2) this).width << 12)
				 - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_220_)
			    anLocalInt_220_ = anLocalInt_222_;
			int anLocalInt_223_
			    = argument_152_[anLocalInt_216_] - argument_154_;
			int anLocalInt_224_ = -argument_153_[anLocalInt_216_];
			int anLocalInt_225_
			    = (anLocalInt_223_
			       - (anLocalInt_217_ - Class368_Sub2.anInt5724));
			if (anLocalInt_225_ > 0) {
			    anLocalInt_217_ += anLocalInt_225_;
			    anLocalInt_220_ += anLocalInt_225_;
			    anLocalInt_218_
				+= Class368_Sub2.anInt5717 * anLocalInt_225_;
			    anLocalInt_219_
				+= Class368_Sub2.anInt5712 * anLocalInt_225_;
			} else
			    anLocalInt_224_ -= anLocalInt_225_;
			if (anLocalInt_220_ < anLocalInt_224_)
			    anLocalInt_220_ = anLocalInt_224_;
			for (/**/; anLocalInt_220_ < 0; anLocalInt_220_++) {
			    int anLocalInt_226_
				= (aByteArray6634
				   [(((anLocalInt_219_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_218_ >> 12))]);
			    if (anLocalInt_226_ != 0)
				anLocalInts[anLocalInt_217_++]
				    = anIntArray6633[anLocalInt_226_ & 0xff];
			    else
				anLocalInt_217_++;
			    anLocalInt_218_ += Class368_Sub2.anInt5717;
			}
		    }
		}
		anLocalInt++;
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	} else if (Class368_Sub2.anInt5712 < 0) {
	    int anLocalInt = Class368_Sub2.anInt5700;
	    while (anLocalInt < 0) {
		int anLocalInt_227_ = anLocalInt + argument_155_;
		if (anLocalInt_227_ >= 0) {
		    if (anLocalInt_227_ >= argument_152_.length)
			break;
		    int anLocalInt_228_ = Class368_Sub2.anInt5724;
		    int anLocalInt_229_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_230_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_231_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_229_ < 0) {
			int anLocalInt_232_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_229_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_231_ += anLocalInt_232_;
			anLocalInt_229_
			    += Class368_Sub2.anInt5717 * anLocalInt_232_;
			anLocalInt_230_
			    += Class368_Sub2.anInt5712 * anLocalInt_232_;
			anLocalInt_228_ += anLocalInt_232_;
		    }
		    int anLocalInt_233_;
		    if ((anLocalInt_233_
			 = ((anLocalInt_229_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_231_)
			anLocalInt_231_ = anLocalInt_233_;
		    if ((anLocalInt_233_
			 = anLocalInt_230_ - (((Class368_Sub2) this).height
					      << 12))
			>= 0) {
			anLocalInt_233_
			    = ((Class368_Sub2.anInt5712 - anLocalInt_233_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_231_ += anLocalInt_233_;
			anLocalInt_229_
			    += Class368_Sub2.anInt5717 * anLocalInt_233_;
			anLocalInt_230_
			    += Class368_Sub2.anInt5712 * anLocalInt_233_;
			anLocalInt_228_ += anLocalInt_233_;
		    }
		    if ((anLocalInt_233_
			 = ((anLocalInt_230_ - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_231_)
			anLocalInt_231_ = anLocalInt_233_;
		    int anLocalInt_234_
			= argument_152_[anLocalInt_227_] - argument_154_;
		    int anLocalInt_235_ = -argument_153_[anLocalInt_227_];
		    int anLocalInt_236_
			= (anLocalInt_234_
			   - (anLocalInt_228_ - Class368_Sub2.anInt5724));
		    if (anLocalInt_236_ > 0) {
			anLocalInt_228_ += anLocalInt_236_;
			anLocalInt_231_ += anLocalInt_236_;
			anLocalInt_229_
			    += Class368_Sub2.anInt5717 * anLocalInt_236_;
			anLocalInt_230_
			    += Class368_Sub2.anInt5712 * anLocalInt_236_;
		    } else
			anLocalInt_235_ -= anLocalInt_236_;
		    if (anLocalInt_231_ < anLocalInt_235_)
			anLocalInt_231_ = anLocalInt_235_;
		    for (/**/; anLocalInt_231_ < 0; anLocalInt_231_++) {
			int anLocalInt_237_
			    = (aByteArray6634
			       [(((anLocalInt_230_ >> 12)
				  * ((Class368_Sub2) this).width)
				 + (anLocalInt_229_ >> 12))]);
			if (anLocalInt_237_ != 0)
			    anLocalInts[anLocalInt_228_++]
				= anIntArray6633[anLocalInt_237_ & 0xff];
			else
			    anLocalInt_228_++;
			anLocalInt_229_ += Class368_Sub2.anInt5717;
			anLocalInt_230_ += Class368_Sub2.anInt5712;
		    }
		}
		anLocalInt++;
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	} else {
	    int anLocalInt = Class368_Sub2.anInt5700;
	    while (anLocalInt < 0) {
		int anLocalInt_238_ = anLocalInt + argument_155_;
		if (anLocalInt_238_ >= 0) {
		    if (anLocalInt_238_ >= argument_152_.length)
			break;
		    int anLocalInt_239_ = Class368_Sub2.anInt5724;
		    int anLocalInt_240_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_241_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_242_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_240_ < 0) {
			int anLocalInt_243_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_240_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_242_ += anLocalInt_243_;
			anLocalInt_240_
			    += Class368_Sub2.anInt5717 * anLocalInt_243_;
			anLocalInt_241_
			    += Class368_Sub2.anInt5712 * anLocalInt_243_;
			anLocalInt_239_ += anLocalInt_243_;
		    }
		    int anLocalInt_244_;
		    if ((anLocalInt_244_
			 = ((anLocalInt_240_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_242_)
			anLocalInt_242_ = anLocalInt_244_;
		    if (anLocalInt_241_ < 0) {
			anLocalInt_244_
			    = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_241_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_242_ += anLocalInt_244_;
			anLocalInt_240_
			    += Class368_Sub2.anInt5717 * anLocalInt_244_;
			anLocalInt_241_
			    += Class368_Sub2.anInt5712 * anLocalInt_244_;
			anLocalInt_239_ += anLocalInt_244_;
		    }
		    if ((anLocalInt_244_
			 = ((anLocalInt_241_ + 1
			     - (((Class368_Sub2) this).height << 12)
			     - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_242_)
			anLocalInt_242_ = anLocalInt_244_;
		    int anLocalInt_245_
			= argument_152_[anLocalInt_238_] - argument_154_;
		    int anLocalInt_246_ = -argument_153_[anLocalInt_238_];
		    int anLocalInt_247_
			= (anLocalInt_245_
			   - (anLocalInt_239_ - Class368_Sub2.anInt5724));
		    if (anLocalInt_247_ > 0) {
			anLocalInt_239_ += anLocalInt_247_;
			anLocalInt_242_ += anLocalInt_247_;
			anLocalInt_240_
			    += Class368_Sub2.anInt5717 * anLocalInt_247_;
			anLocalInt_241_
			    += Class368_Sub2.anInt5712 * anLocalInt_247_;
		    } else
			anLocalInt_246_ -= anLocalInt_247_;
		    if (anLocalInt_242_ < anLocalInt_246_)
			anLocalInt_242_ = anLocalInt_246_;
		    for (/**/; anLocalInt_242_ < 0; anLocalInt_242_++) {
			int anLocalInt_248_
			    = (aByteArray6634
			       [(((anLocalInt_241_ >> 12)
				  * ((Class368_Sub2) this).width)
				 + (anLocalInt_240_ >> 12))]);
			if (anLocalInt_248_ != 0)
			    anLocalInts[anLocalInt_239_++]
				= anIntArray6633[anLocalInt_248_ & 0xff];
			else
			    anLocalInt_239_++;
			anLocalInt_240_ += Class368_Sub2.anInt5717;
			anLocalInt_241_ += Class368_Sub2.anInt5712;
		    }
		}
		anLocalInt++;
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	}
    }
    
    final void method4003(int argument_249_, int argument_250_,
			  int argument_251_) {
	throw new IllegalStateException();
    }
    
    final void method4013(int argument_252_, int argument_253_,
			  int argument_254_, int argument_255_,
			  int argument_256_, int argument_257_) {
	throw new IllegalStateException();
    }
    
    final void method4031(int argument_258_, int argument_259_) {
	int[] anLocalInts
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .pixels);
	if (Class368_Sub2.anInt5717 == 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_260_ = Class368_Sub2.anInt5724;
		    int anLocalInt_261_ = Class368_Sub2.anInt5710;
		    int anLocalInt_262_ = Class368_Sub2.anInt5704;
		    int anLocalInt_263_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_261_ >= 0 && anLocalInt_262_ >= 0
			&& anLocalInt_261_ - (((Class368_Sub2) this).width
					      << 12) < 0
			&& anLocalInt_262_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			for (/**/; anLocalInt_263_ < 0; anLocalInt_263_++) {
			    int anLocalInt_264_
				= (((anLocalInt_262_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_261_ >> 12));
			    int anLocalInt_265_ = anLocalInt_260_++;
			    int[] anLocalInts_266_ = anLocalInts;
			    int anLocalInt_267_ = argument_258_;
			    int anLocalInt_268_ = argument_259_;
			    if (anLocalInt_268_ == 0) {
				if (anLocalInt_267_ == 1)
				    anLocalInts_266_[anLocalInt_265_]
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_264_]
					     & 0xff)]);
				else if (anLocalInt_267_ == 0) {
				    int anLocalInt_269_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_264_]
					     & 0xff)]);
				    int anLocalInt_270_
					= (((anLocalInt_269_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_271_
					= (((anLocalInt_269_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_272_
					= (((anLocalInt_269_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_266_[anLocalInt_265_]
					= (anLocalInt_270_ | anLocalInt_271_
					   | anLocalInt_272_) >>> 8;
				} else if (anLocalInt_267_ == 3) {
				    int anLocalInt_273_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_264_]
					     & 0xff)]);
				    int anLocalInt_274_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_275_
					= anLocalInt_273_ + anLocalInt_274_;
				    int anLocalInt_276_
					= ((anLocalInt_273_ & 0xff00ff)
					   + (anLocalInt_274_ & 0xff00ff));
				    int anLocalInt_277_
					= ((anLocalInt_276_ & 0x1000100)
					   + (anLocalInt_275_ - anLocalInt_276_
					      & 0x10000));
				    anLocalInts_266_[anLocalInt_265_]
					= (anLocalInt_275_ - anLocalInt_277_
					   | anLocalInt_277_ - (anLocalInt_277_
								>>> 8));
				} else if (anLocalInt_267_ == 2) {
				    int anLocalInt_278_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_264_]
					     & 0xff)]);
				    int anLocalInt_279_
					= (((anLocalInt_278_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_280_
					= (((anLocalInt_278_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_266_[anLocalInt_265_]
					= ((anLocalInt_279_ | anLocalInt_280_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_268_ == 1) {
				if (anLocalInt_267_ == 1) {
				    int anLocalInt_281_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_281_ != 0)
					anLocalInts_266_[anLocalInt_265_]
					    = (anIntArray6633
					       [anLocalInt_281_ & 0xff]);
				} else if (anLocalInt_267_ == 0) {
				    int anLocalInt_282_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_282_ != 0) {
					int anLocalInt_283_
					    = (anIntArray6633
					       [anLocalInt_282_ & 0xff]);
					if ((Class368_Sub2.anInt5693
					     & 0xffffff)
					    == 16777215) {
					    int anLocalInt_284_
						= (Class368_Sub2.anInt5693
						   >>> 24);
					    int anLocalInt_285_
						= 256 - anLocalInt_284_;
					    int anLocalInt_286_
						= (anLocalInts_266_
						   [anLocalInt_265_]);
					    anLocalInts_266_[anLocalInt_265_]
						= (((((anLocalInt_283_
						       & 0xff00ff)
						      * anLocalInt_284_)
						     + ((anLocalInt_286_
							 & 0xff00ff)
							* anLocalInt_285_))
						    & ~0xff00ff)
						   + ((((anLocalInt_283_
							 & 0xff00)
							* anLocalInt_284_)
						       + ((anLocalInt_286_
							   & 0xff00)
							  * anLocalInt_285_))
						      & 0xff0000)) >> 8;
					} else if (Class368_Sub2.anInt5695
						   != 255) {
					    int anLocalInt_287_
						= (((anLocalInt_283_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_288_
						= (((anLocalInt_283_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_289_
						= (((anLocalInt_283_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInt_283_
						= (anLocalInt_287_
						   | anLocalInt_288_
						   | anLocalInt_289_) >>> 8;
					    int anLocalInt_290_
						= (anLocalInts_266_
						   [anLocalInt_265_]);
					    anLocalInts_266_[anLocalInt_265_]
						= (((((anLocalInt_283_
						       & 0xff00ff)
						      * (Class368_Sub2
							 .anInt5695))
						     + ((anLocalInt_290_
							 & 0xff00ff)
							* (Class368_Sub2
							   .anInt5711)))
						    & ~0xff00ff)
						   + ((((anLocalInt_283_
							 & 0xff00)
							* (Class368_Sub2
							   .anInt5695))
						       + ((anLocalInt_290_
							   & 0xff00)
							  * (Class368_Sub2
							     .anInt5711)))
						      & 0xff0000)) >> 8;
					} else {
					    int anLocalInt_291_
						= (((anLocalInt_283_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_292_
						= (((anLocalInt_283_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_293_
						= (((anLocalInt_283_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInts_266_[anLocalInt_265_]
						= (anLocalInt_291_
						   | anLocalInt_292_
						   | anLocalInt_293_) >>> 8;
					}
				    }
				} else if (anLocalInt_267_ == 3) {
				    byte anLocalInt_294_
					= aByteArray6634[anLocalInt_264_];
				    int anLocalInt_295_
					= (anLocalInt_294_ > 0
					   ? anIntArray6633[anLocalInt_294_]
					   : 0);
				    int anLocalInt_296_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_297_
					= anLocalInt_295_ + anLocalInt_296_;
				    int anLocalInt_298_
					= ((anLocalInt_295_ & 0xff00ff)
					   + (anLocalInt_296_ & 0xff00ff));
				    int anLocalInt_299_
					= ((anLocalInt_298_ & 0x1000100)
					   + (anLocalInt_297_ - anLocalInt_298_
					      & 0x10000));
				    anLocalInt_299_
					= (anLocalInt_297_ - anLocalInt_299_
					   | anLocalInt_299_ - (anLocalInt_299_
								>>> 8));
				    if (anLocalInt_295_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_295_ = anLocalInt_299_;
					anLocalInt_299_ = (anLocalInts_266_
							   [anLocalInt_265_]);
					anLocalInt_299_
					    = (((((anLocalInt_295_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_299_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_295_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_299_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_266_[anLocalInt_265_]
					= anLocalInt_299_;
				} else if (anLocalInt_267_ == 2) {
				    int anLocalInt_300_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_300_ != 0) {
					int anLocalInt_301_
					    = (anIntArray6633
					       [anLocalInt_300_ & 0xff]);
					int anLocalInt_302_
					    = (((anLocalInt_301_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_303_
					    = (((anLocalInt_301_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInts_266_[anLocalInt_265_++]
					    = (((anLocalInt_302_
						 | anLocalInt_303_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_268_ == 2) {
				if (anLocalInt_267_ == 1) {
				    int anLocalInt_304_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_304_ != 0) {
					int anLocalInt_305_
					    = (anIntArray6633
					       [anLocalInt_304_ & 0xff]);
					int anLocalInt_306_
					    = (anLocalInts_266_
					       [anLocalInt_265_]);
					int anLocalInt_307_
					    = (anLocalInt_305_
					       + anLocalInt_306_);
					int anLocalInt_308_
					    = ((anLocalInt_305_ & 0xff00ff)
					       + (anLocalInt_306_ & 0xff00ff));
					anLocalInt_306_
					    = ((anLocalInt_308_ & 0x1000100)
					       + ((anLocalInt_307_
						   - anLocalInt_308_)
						  & 0x10000));
					anLocalInts_266_[anLocalInt_265_]
					    = ((anLocalInt_307_
						- anLocalInt_306_)
					       | (anLocalInt_306_
						  - (anLocalInt_306_ >>> 8)));
				    }
				} else if (anLocalInt_267_ == 0) {
				    int anLocalInt_309_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_309_ != 0) {
					int anLocalInt_310_
					    = (anIntArray6633
					       [anLocalInt_309_ & 0xff]);
					int anLocalInt_311_
					    = (((anLocalInt_310_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_312_
					    = (((anLocalInt_310_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_313_
					    = (((anLocalInt_310_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_310_
					    = (anLocalInt_311_
					       | anLocalInt_312_
					       | anLocalInt_313_) >>> 8;
					int anLocalInt_314_
					    = (anLocalInts_266_
					       [anLocalInt_265_]);
					int anLocalInt_315_
					    = (anLocalInt_310_
					       + anLocalInt_314_);
					int anLocalInt_316_
					    = ((anLocalInt_310_ & 0xff00ff)
					       + (anLocalInt_314_ & 0xff00ff));
					anLocalInt_314_
					    = ((anLocalInt_316_ & 0x1000100)
					       + ((anLocalInt_315_
						   - anLocalInt_316_)
						  & 0x10000));
					anLocalInts_266_[anLocalInt_265_]
					    = ((anLocalInt_315_
						- anLocalInt_314_)
					       | (anLocalInt_314_
						  - (anLocalInt_314_ >>> 8)));
				    }
				} else if (anLocalInt_267_ == 3) {
				    byte anLocalInt_317_
					= aByteArray6634[anLocalInt_264_];
				    int anLocalInt_318_
					= (anLocalInt_317_ > 0
					   ? anIntArray6633[anLocalInt_317_]
					   : 0);
				    int anLocalInt_319_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_320_
					= anLocalInt_318_ + anLocalInt_319_;
				    int anLocalInt_321_
					= ((anLocalInt_318_ & 0xff00ff)
					   + (anLocalInt_319_ & 0xff00ff));
				    int anLocalInt_322_
					= ((anLocalInt_321_ & 0x1000100)
					   + (anLocalInt_320_ - anLocalInt_321_
					      & 0x10000));
				    anLocalInt_322_
					= (anLocalInt_320_ - anLocalInt_322_
					   | anLocalInt_322_ - (anLocalInt_322_
								>>> 8));
				    if (anLocalInt_318_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_318_ = anLocalInt_322_;
					anLocalInt_322_ = (anLocalInts_266_
							   [anLocalInt_265_]);
					anLocalInt_322_
					    = (((((anLocalInt_318_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_322_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_318_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_322_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_266_[anLocalInt_265_]
					= anLocalInt_322_;
				} else if (anLocalInt_267_ == 2) {
				    int anLocalInt_323_
					= aByteArray6634[anLocalInt_264_];
				    if (anLocalInt_323_ != 0) {
					int anLocalInt_324_
					    = (anIntArray6633
					       [anLocalInt_323_ & 0xff]);
					int anLocalInt_325_
					    = (((anLocalInt_324_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_326_
					    = (((anLocalInt_324_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInt_324_
					    = (((anLocalInt_325_
						 | anLocalInt_326_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
					int anLocalInt_327_
					    = (anLocalInts_266_
					       [anLocalInt_265_]);
					int anLocalInt_328_
					    = (anLocalInt_324_
					       + anLocalInt_327_);
					int anLocalInt_329_
					    = ((anLocalInt_324_ & 0xff00ff)
					       + (anLocalInt_327_ & 0xff00ff));
					anLocalInt_327_
					    = ((anLocalInt_329_ & 0x1000100)
					       + ((anLocalInt_328_
						   - anLocalInt_329_)
						  & 0x10000));
					anLocalInts_266_[anLocalInt_265_]
					    = ((anLocalInt_328_
						- anLocalInt_327_)
					       | (anLocalInt_327_
						  - (anLocalInt_327_ >>> 8)));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_330_ = Class368_Sub2.anInt5724;
		    int anLocalInt_331_ = Class368_Sub2.anInt5710;
		    int anLocalInt_332_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_333_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_331_ >= 0
			&& anLocalInt_331_ - (((Class368_Sub2) this).width
					      << 12) < 0) {
			int anLocalInt_334_;
			if ((anLocalInt_334_
			     = (anLocalInt_332_
				- (((Class368_Sub2) this).height << 12)))
			    >= 0) {
			    anLocalInt_334_
				= ((Class368_Sub2.anInt5712 - anLocalInt_334_)
				   / Class368_Sub2.anInt5712);
			    anLocalInt_333_ += anLocalInt_334_;
			    anLocalInt_332_
				+= Class368_Sub2.anInt5712 * anLocalInt_334_;
			    anLocalInt_330_ += anLocalInt_334_;
			}
			if ((anLocalInt_334_
			     = ((anLocalInt_332_ - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_333_)
			    anLocalInt_333_ = anLocalInt_334_;
			for (/**/; anLocalInt_333_ < 0; anLocalInt_333_++) {
			    int anLocalInt_335_
				= (((anLocalInt_332_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_331_ >> 12));
			    int anLocalInt_336_ = anLocalInt_330_++;
			    int[] anLocalInts_337_ = anLocalInts;
			    int anLocalInt_338_ = argument_258_;
			    int anLocalInt_339_ = argument_259_;
			    if (anLocalInt_339_ == 0) {
				if (anLocalInt_338_ == 1)
				    anLocalInts_337_[anLocalInt_336_]
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_335_]
					     & 0xff)]);
				else if (anLocalInt_338_ == 0) {
				    int anLocalInt_340_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_335_]
					     & 0xff)]);
				    int anLocalInt_341_
					= (((anLocalInt_340_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_342_
					= (((anLocalInt_340_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_343_
					= (((anLocalInt_340_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_337_[anLocalInt_336_]
					= (anLocalInt_341_ | anLocalInt_342_
					   | anLocalInt_343_) >>> 8;
				} else if (anLocalInt_338_ == 3) {
				    int anLocalInt_344_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_335_]
					     & 0xff)]);
				    int anLocalInt_345_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_346_
					= anLocalInt_344_ + anLocalInt_345_;
				    int anLocalInt_347_
					= ((anLocalInt_344_ & 0xff00ff)
					   + (anLocalInt_345_ & 0xff00ff));
				    int anLocalInt_348_
					= ((anLocalInt_347_ & 0x1000100)
					   + (anLocalInt_346_ - anLocalInt_347_
					      & 0x10000));
				    anLocalInts_337_[anLocalInt_336_]
					= (anLocalInt_346_ - anLocalInt_348_
					   | anLocalInt_348_ - (anLocalInt_348_
								>>> 8));
				} else if (anLocalInt_338_ == 2) {
				    int anLocalInt_349_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_335_]
					     & 0xff)]);
				    int anLocalInt_350_
					= (((anLocalInt_349_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_351_
					= (((anLocalInt_349_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_337_[anLocalInt_336_]
					= ((anLocalInt_350_ | anLocalInt_351_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_339_ == 1) {
				if (anLocalInt_338_ == 1) {
				    int anLocalInt_352_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_352_ != 0)
					anLocalInts_337_[anLocalInt_336_]
					    = (anIntArray6633
					       [anLocalInt_352_ & 0xff]);
				} else if (anLocalInt_338_ == 0) {
				    int anLocalInt_353_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_353_ != 0) {
					int anLocalInt_354_
					    = (anIntArray6633
					       [anLocalInt_353_ & 0xff]);
					if ((Class368_Sub2.anInt5693
					     & 0xffffff)
					    == 16777215) {
					    int anLocalInt_355_
						= (Class368_Sub2.anInt5693
						   >>> 24);
					    int anLocalInt_356_
						= 256 - anLocalInt_355_;
					    int anLocalInt_357_
						= (anLocalInts_337_
						   [anLocalInt_336_]);
					    anLocalInts_337_[anLocalInt_336_]
						= (((((anLocalInt_354_
						       & 0xff00ff)
						      * anLocalInt_355_)
						     + ((anLocalInt_357_
							 & 0xff00ff)
							* anLocalInt_356_))
						    & ~0xff00ff)
						   + ((((anLocalInt_354_
							 & 0xff00)
							* anLocalInt_355_)
						       + ((anLocalInt_357_
							   & 0xff00)
							  * anLocalInt_356_))
						      & 0xff0000)) >> 8;
					} else if (Class368_Sub2.anInt5695
						   != 255) {
					    int anLocalInt_358_
						= (((anLocalInt_354_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_359_
						= (((anLocalInt_354_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_360_
						= (((anLocalInt_354_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInt_354_
						= (anLocalInt_358_
						   | anLocalInt_359_
						   | anLocalInt_360_) >>> 8;
					    int anLocalInt_361_
						= (anLocalInts_337_
						   [anLocalInt_336_]);
					    anLocalInts_337_[anLocalInt_336_]
						= (((((anLocalInt_354_
						       & 0xff00ff)
						      * (Class368_Sub2
							 .anInt5695))
						     + ((anLocalInt_361_
							 & 0xff00ff)
							* (Class368_Sub2
							   .anInt5711)))
						    & ~0xff00ff)
						   + ((((anLocalInt_354_
							 & 0xff00)
							* (Class368_Sub2
							   .anInt5695))
						       + ((anLocalInt_361_
							   & 0xff00)
							  * (Class368_Sub2
							     .anInt5711)))
						      & 0xff0000)) >> 8;
					} else {
					    int anLocalInt_362_
						= (((anLocalInt_354_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_363_
						= (((anLocalInt_354_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_364_
						= (((anLocalInt_354_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInts_337_[anLocalInt_336_]
						= (anLocalInt_362_
						   | anLocalInt_363_
						   | anLocalInt_364_) >>> 8;
					}
				    }
				} else if (anLocalInt_338_ == 3) {
				    byte anLocalInt_365_
					= aByteArray6634[anLocalInt_335_];
				    int anLocalInt_366_
					= (anLocalInt_365_ > 0
					   ? anIntArray6633[anLocalInt_365_]
					   : 0);
				    int anLocalInt_367_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_368_
					= anLocalInt_366_ + anLocalInt_367_;
				    int anLocalInt_369_
					= ((anLocalInt_366_ & 0xff00ff)
					   + (anLocalInt_367_ & 0xff00ff));
				    int anLocalInt_370_
					= ((anLocalInt_369_ & 0x1000100)
					   + (anLocalInt_368_ - anLocalInt_369_
					      & 0x10000));
				    anLocalInt_370_
					= (anLocalInt_368_ - anLocalInt_370_
					   | anLocalInt_370_ - (anLocalInt_370_
								>>> 8));
				    if (anLocalInt_366_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_366_ = anLocalInt_370_;
					anLocalInt_370_ = (anLocalInts_337_
							   [anLocalInt_336_]);
					anLocalInt_370_
					    = (((((anLocalInt_366_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_370_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_366_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_370_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_337_[anLocalInt_336_]
					= anLocalInt_370_;
				} else if (anLocalInt_338_ == 2) {
				    int anLocalInt_371_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_371_ != 0) {
					int anLocalInt_372_
					    = (anIntArray6633
					       [anLocalInt_371_ & 0xff]);
					int anLocalInt_373_
					    = (((anLocalInt_372_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_374_
					    = (((anLocalInt_372_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInts_337_[anLocalInt_336_++]
					    = (((anLocalInt_373_
						 | anLocalInt_374_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_339_ == 2) {
				if (anLocalInt_338_ == 1) {
				    int anLocalInt_375_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_375_ != 0) {
					int anLocalInt_376_
					    = (anIntArray6633
					       [anLocalInt_375_ & 0xff]);
					int anLocalInt_377_
					    = (anLocalInts_337_
					       [anLocalInt_336_]);
					int anLocalInt_378_
					    = (anLocalInt_376_
					       + anLocalInt_377_);
					int anLocalInt_379_
					    = ((anLocalInt_376_ & 0xff00ff)
					       + (anLocalInt_377_ & 0xff00ff));
					anLocalInt_377_
					    = ((anLocalInt_379_ & 0x1000100)
					       + ((anLocalInt_378_
						   - anLocalInt_379_)
						  & 0x10000));
					anLocalInts_337_[anLocalInt_336_]
					    = ((anLocalInt_378_
						- anLocalInt_377_)
					       | (anLocalInt_377_
						  - (anLocalInt_377_ >>> 8)));
				    }
				} else if (anLocalInt_338_ == 0) {
				    int anLocalInt_380_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_380_ != 0) {
					int anLocalInt_381_
					    = (anIntArray6633
					       [anLocalInt_380_ & 0xff]);
					int anLocalInt_382_
					    = (((anLocalInt_381_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_383_
					    = (((anLocalInt_381_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_384_
					    = (((anLocalInt_381_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_381_
					    = (anLocalInt_382_
					       | anLocalInt_383_
					       | anLocalInt_384_) >>> 8;
					int anLocalInt_385_
					    = (anLocalInts_337_
					       [anLocalInt_336_]);
					int anLocalInt_386_
					    = (anLocalInt_381_
					       + anLocalInt_385_);
					int anLocalInt_387_
					    = ((anLocalInt_381_ & 0xff00ff)
					       + (anLocalInt_385_ & 0xff00ff));
					anLocalInt_385_
					    = ((anLocalInt_387_ & 0x1000100)
					       + ((anLocalInt_386_
						   - anLocalInt_387_)
						  & 0x10000));
					anLocalInts_337_[anLocalInt_336_]
					    = ((anLocalInt_386_
						- anLocalInt_385_)
					       | (anLocalInt_385_
						  - (anLocalInt_385_ >>> 8)));
				    }
				} else if (anLocalInt_338_ == 3) {
				    byte anLocalInt_388_
					= aByteArray6634[anLocalInt_335_];
				    int anLocalInt_389_
					= (anLocalInt_388_ > 0
					   ? anIntArray6633[anLocalInt_388_]
					   : 0);
				    int anLocalInt_390_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_391_
					= anLocalInt_389_ + anLocalInt_390_;
				    int anLocalInt_392_
					= ((anLocalInt_389_ & 0xff00ff)
					   + (anLocalInt_390_ & 0xff00ff));
				    int anLocalInt_393_
					= ((anLocalInt_392_ & 0x1000100)
					   + (anLocalInt_391_ - anLocalInt_392_
					      & 0x10000));
				    anLocalInt_393_
					= (anLocalInt_391_ - anLocalInt_393_
					   | anLocalInt_393_ - (anLocalInt_393_
								>>> 8));
				    if (anLocalInt_389_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_389_ = anLocalInt_393_;
					anLocalInt_393_ = (anLocalInts_337_
							   [anLocalInt_336_]);
					anLocalInt_393_
					    = (((((anLocalInt_389_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_393_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_389_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_393_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_337_[anLocalInt_336_]
					= anLocalInt_393_;
				} else if (anLocalInt_338_ == 2) {
				    int anLocalInt_394_
					= aByteArray6634[anLocalInt_335_];
				    if (anLocalInt_394_ != 0) {
					int anLocalInt_395_
					    = (anIntArray6633
					       [anLocalInt_394_ & 0xff]);
					int anLocalInt_396_
					    = (((anLocalInt_395_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_397_
					    = (((anLocalInt_395_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInt_395_
					    = (((anLocalInt_396_
						 | anLocalInt_397_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
					int anLocalInt_398_
					    = (anLocalInts_337_
					       [anLocalInt_336_]);
					int anLocalInt_399_
					    = (anLocalInt_395_
					       + anLocalInt_398_);
					int anLocalInt_400_
					    = ((anLocalInt_395_ & 0xff00ff)
					       + (anLocalInt_398_ & 0xff00ff));
					anLocalInt_398_
					    = ((anLocalInt_400_ & 0x1000100)
					       + ((anLocalInt_399_
						   - anLocalInt_400_)
						  & 0x10000));
					anLocalInts_337_[anLocalInt_336_]
					    = ((anLocalInt_399_
						- anLocalInt_398_)
					       | (anLocalInt_398_
						  - (anLocalInt_398_ >>> 8)));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_332_ += Class368_Sub2.anInt5712;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_401_ = Class368_Sub2.anInt5724;
		    int anLocalInt_402_ = Class368_Sub2.anInt5710;
		    int anLocalInt_403_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_404_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_402_ >= 0
			&& anLocalInt_402_ - (((Class368_Sub2) this).width
					      << 12) < 0) {
			if (anLocalInt_403_ < 0) {
			    int anLocalInt_405_ = ((Class368_Sub2.anInt5712 - 1
						    - anLocalInt_403_)
						   / Class368_Sub2.anInt5712);
			    anLocalInt_404_ += anLocalInt_405_;
			    anLocalInt_403_
				+= Class368_Sub2.anInt5712 * anLocalInt_405_;
			    anLocalInt_401_ += anLocalInt_405_;
			}
			int anLocalInt_406_;
			if ((anLocalInt_406_
			     = ((anLocalInt_403_ + 1
				 - (((Class368_Sub2) this).height << 12)
				 - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_404_)
			    anLocalInt_404_ = anLocalInt_406_;
			for (/**/; anLocalInt_404_ < 0; anLocalInt_404_++) {
			    int anLocalInt_407_
				= (((anLocalInt_403_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_402_ >> 12));
			    int anLocalInt_408_ = anLocalInt_401_++;
			    int[] anLocalInts_409_ = anLocalInts;
			    int anLocalInt_410_ = argument_258_;
			    int anLocalInt_411_ = argument_259_;
			    if (anLocalInt_411_ == 0) {
				if (anLocalInt_410_ == 1)
				    anLocalInts_409_[anLocalInt_408_]
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_407_]
					     & 0xff)]);
				else if (anLocalInt_410_ == 0) {
				    int anLocalInt_412_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_407_]
					     & 0xff)]);
				    int anLocalInt_413_
					= (((anLocalInt_412_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_414_
					= (((anLocalInt_412_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_415_
					= (((anLocalInt_412_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_409_[anLocalInt_408_]
					= (anLocalInt_413_ | anLocalInt_414_
					   | anLocalInt_415_) >>> 8;
				} else if (anLocalInt_410_ == 3) {
				    int anLocalInt_416_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_407_]
					     & 0xff)]);
				    int anLocalInt_417_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_418_
					= anLocalInt_416_ + anLocalInt_417_;
				    int anLocalInt_419_
					= ((anLocalInt_416_ & 0xff00ff)
					   + (anLocalInt_417_ & 0xff00ff));
				    int anLocalInt_420_
					= ((anLocalInt_419_ & 0x1000100)
					   + (anLocalInt_418_ - anLocalInt_419_
					      & 0x10000));
				    anLocalInts_409_[anLocalInt_408_]
					= (anLocalInt_418_ - anLocalInt_420_
					   | anLocalInt_420_ - (anLocalInt_420_
								>>> 8));
				} else if (anLocalInt_410_ == 2) {
				    int anLocalInt_421_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_407_]
					     & 0xff)]);
				    int anLocalInt_422_
					= (((anLocalInt_421_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_423_
					= (((anLocalInt_421_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_409_[anLocalInt_408_]
					= ((anLocalInt_422_ | anLocalInt_423_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_411_ == 1) {
				if (anLocalInt_410_ == 1) {
				    int anLocalInt_424_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_424_ != 0)
					anLocalInts_409_[anLocalInt_408_]
					    = (anIntArray6633
					       [anLocalInt_424_ & 0xff]);
				} else if (anLocalInt_410_ == 0) {
				    int anLocalInt_425_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_425_ != 0) {
					int anLocalInt_426_
					    = (anIntArray6633
					       [anLocalInt_425_ & 0xff]);
					if ((Class368_Sub2.anInt5693
					     & 0xffffff)
					    == 16777215) {
					    int anLocalInt_427_
						= (Class368_Sub2.anInt5693
						   >>> 24);
					    int anLocalInt_428_
						= 256 - anLocalInt_427_;
					    int anLocalInt_429_
						= (anLocalInts_409_
						   [anLocalInt_408_]);
					    anLocalInts_409_[anLocalInt_408_]
						= (((((anLocalInt_426_
						       & 0xff00ff)
						      * anLocalInt_427_)
						     + ((anLocalInt_429_
							 & 0xff00ff)
							* anLocalInt_428_))
						    & ~0xff00ff)
						   + ((((anLocalInt_426_
							 & 0xff00)
							* anLocalInt_427_)
						       + ((anLocalInt_429_
							   & 0xff00)
							  * anLocalInt_428_))
						      & 0xff0000)) >> 8;
					} else if (Class368_Sub2.anInt5695
						   != 255) {
					    int anLocalInt_430_
						= (((anLocalInt_426_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_431_
						= (((anLocalInt_426_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_432_
						= (((anLocalInt_426_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInt_426_
						= (anLocalInt_430_
						   | anLocalInt_431_
						   | anLocalInt_432_) >>> 8;
					    int anLocalInt_433_
						= (anLocalInts_409_
						   [anLocalInt_408_]);
					    anLocalInts_409_[anLocalInt_408_]
						= (((((anLocalInt_426_
						       & 0xff00ff)
						      * (Class368_Sub2
							 .anInt5695))
						     + ((anLocalInt_433_
							 & 0xff00ff)
							* (Class368_Sub2
							   .anInt5711)))
						    & ~0xff00ff)
						   + ((((anLocalInt_426_
							 & 0xff00)
							* (Class368_Sub2
							   .anInt5695))
						       + ((anLocalInt_433_
							   & 0xff00)
							  * (Class368_Sub2
							     .anInt5711)))
						      & 0xff0000)) >> 8;
					} else {
					    int anLocalInt_434_
						= (((anLocalInt_426_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_435_
						= (((anLocalInt_426_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_436_
						= (((anLocalInt_426_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInts_409_[anLocalInt_408_]
						= (anLocalInt_434_
						   | anLocalInt_435_
						   | anLocalInt_436_) >>> 8;
					}
				    }
				} else if (anLocalInt_410_ == 3) {
				    byte anLocalInt_437_
					= aByteArray6634[anLocalInt_407_];
				    int anLocalInt_438_
					= (anLocalInt_437_ > 0
					   ? anIntArray6633[anLocalInt_437_]
					   : 0);
				    int anLocalInt_439_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_440_
					= anLocalInt_438_ + anLocalInt_439_;
				    int anLocalInt_441_
					= ((anLocalInt_438_ & 0xff00ff)
					   + (anLocalInt_439_ & 0xff00ff));
				    int anLocalInt_442_
					= ((anLocalInt_441_ & 0x1000100)
					   + (anLocalInt_440_ - anLocalInt_441_
					      & 0x10000));
				    anLocalInt_442_
					= (anLocalInt_440_ - anLocalInt_442_
					   | anLocalInt_442_ - (anLocalInt_442_
								>>> 8));
				    if (anLocalInt_438_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_438_ = anLocalInt_442_;
					anLocalInt_442_ = (anLocalInts_409_
							   [anLocalInt_408_]);
					anLocalInt_442_
					    = (((((anLocalInt_438_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_442_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_438_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_442_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_409_[anLocalInt_408_]
					= anLocalInt_442_;
				} else if (anLocalInt_410_ == 2) {
				    int anLocalInt_443_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_443_ != 0) {
					int anLocalInt_444_
					    = (anIntArray6633
					       [anLocalInt_443_ & 0xff]);
					int anLocalInt_445_
					    = (((anLocalInt_444_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_446_
					    = (((anLocalInt_444_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInts_409_[anLocalInt_408_++]
					    = (((anLocalInt_445_
						 | anLocalInt_446_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_411_ == 2) {
				if (anLocalInt_410_ == 1) {
				    int anLocalInt_447_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_447_ != 0) {
					int anLocalInt_448_
					    = (anIntArray6633
					       [anLocalInt_447_ & 0xff]);
					int anLocalInt_449_
					    = (anLocalInts_409_
					       [anLocalInt_408_]);
					int anLocalInt_450_
					    = (anLocalInt_448_
					       + anLocalInt_449_);
					int anLocalInt_451_
					    = ((anLocalInt_448_ & 0xff00ff)
					       + (anLocalInt_449_ & 0xff00ff));
					anLocalInt_449_
					    = ((anLocalInt_451_ & 0x1000100)
					       + ((anLocalInt_450_
						   - anLocalInt_451_)
						  & 0x10000));
					anLocalInts_409_[anLocalInt_408_]
					    = ((anLocalInt_450_
						- anLocalInt_449_)
					       | (anLocalInt_449_
						  - (anLocalInt_449_ >>> 8)));
				    }
				} else if (anLocalInt_410_ == 0) {
				    int anLocalInt_452_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_452_ != 0) {
					int anLocalInt_453_
					    = (anIntArray6633
					       [anLocalInt_452_ & 0xff]);
					int anLocalInt_454_
					    = (((anLocalInt_453_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_455_
					    = (((anLocalInt_453_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_456_
					    = (((anLocalInt_453_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_453_
					    = (anLocalInt_454_
					       | anLocalInt_455_
					       | anLocalInt_456_) >>> 8;
					int anLocalInt_457_
					    = (anLocalInts_409_
					       [anLocalInt_408_]);
					int anLocalInt_458_
					    = (anLocalInt_453_
					       + anLocalInt_457_);
					int anLocalInt_459_
					    = ((anLocalInt_453_ & 0xff00ff)
					       + (anLocalInt_457_ & 0xff00ff));
					anLocalInt_457_
					    = ((anLocalInt_459_ & 0x1000100)
					       + ((anLocalInt_458_
						   - anLocalInt_459_)
						  & 0x10000));
					anLocalInts_409_[anLocalInt_408_]
					    = ((anLocalInt_458_
						- anLocalInt_457_)
					       | (anLocalInt_457_
						  - (anLocalInt_457_ >>> 8)));
				    }
				} else if (anLocalInt_410_ == 3) {
				    byte anLocalInt_460_
					= aByteArray6634[anLocalInt_407_];
				    int anLocalInt_461_
					= (anLocalInt_460_ > 0
					   ? anIntArray6633[anLocalInt_460_]
					   : 0);
				    int anLocalInt_462_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_463_
					= anLocalInt_461_ + anLocalInt_462_;
				    int anLocalInt_464_
					= ((anLocalInt_461_ & 0xff00ff)
					   + (anLocalInt_462_ & 0xff00ff));
				    int anLocalInt_465_
					= ((anLocalInt_464_ & 0x1000100)
					   + (anLocalInt_463_ - anLocalInt_464_
					      & 0x10000));
				    anLocalInt_465_
					= (anLocalInt_463_ - anLocalInt_465_
					   | anLocalInt_465_ - (anLocalInt_465_
								>>> 8));
				    if (anLocalInt_461_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_461_ = anLocalInt_465_;
					anLocalInt_465_ = (anLocalInts_409_
							   [anLocalInt_408_]);
					anLocalInt_465_
					    = (((((anLocalInt_461_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_465_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_461_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_465_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_409_[anLocalInt_408_]
					= anLocalInt_465_;
				} else if (anLocalInt_410_ == 2) {
				    int anLocalInt_466_
					= aByteArray6634[anLocalInt_407_];
				    if (anLocalInt_466_ != 0) {
					int anLocalInt_467_
					    = (anIntArray6633
					       [anLocalInt_466_ & 0xff]);
					int anLocalInt_468_
					    = (((anLocalInt_467_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_469_
					    = (((anLocalInt_467_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInt_467_
					    = (((anLocalInt_468_
						 | anLocalInt_469_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
					int anLocalInt_470_
					    = (anLocalInts_409_
					       [anLocalInt_408_]);
					int anLocalInt_471_
					    = (anLocalInt_467_
					       + anLocalInt_470_);
					int anLocalInt_472_
					    = ((anLocalInt_467_ & 0xff00ff)
					       + (anLocalInt_470_ & 0xff00ff));
					anLocalInt_470_
					    = ((anLocalInt_472_ & 0x1000100)
					       + ((anLocalInt_471_
						   - anLocalInt_472_)
						  & 0x10000));
					anLocalInts_409_[anLocalInt_408_]
					    = ((anLocalInt_471_
						- anLocalInt_470_)
					       | (anLocalInt_470_
						  - (anLocalInt_470_ >>> 8)));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_403_ += Class368_Sub2.anInt5712;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    }
	} else if (Class368_Sub2.anInt5717 < 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_473_ = Class368_Sub2.anInt5724;
		    int anLocalInt_474_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_475_ = Class368_Sub2.anInt5704;
		    int anLocalInt_476_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_475_ >= 0
			&& anLocalInt_475_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			int anLocalInt_477_;
			if ((anLocalInt_477_
			     = (anLocalInt_474_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_477_
				= ((Class368_Sub2.anInt5717 - anLocalInt_477_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_476_ += anLocalInt_477_;
			    anLocalInt_474_
				+= Class368_Sub2.anInt5717 * anLocalInt_477_;
			    anLocalInt_473_ += anLocalInt_477_;
			}
			if ((anLocalInt_477_
			     = ((anLocalInt_474_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_476_)
			    anLocalInt_476_ = anLocalInt_477_;
			for (/**/; anLocalInt_476_ < 0; anLocalInt_476_++) {
			    int anLocalInt_478_
				= (((anLocalInt_475_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_474_ >> 12));
			    int anLocalInt_479_ = anLocalInt_473_++;
			    int[] anLocalInts_480_ = anLocalInts;
			    int anLocalInt_481_ = argument_258_;
			    int anLocalInt_482_ = argument_259_;
			    if (anLocalInt_482_ == 0) {
				if (anLocalInt_481_ == 1)
				    anLocalInts_480_[anLocalInt_479_]
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_478_]
					     & 0xff)]);
				else if (anLocalInt_481_ == 0) {
				    int anLocalInt_483_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_478_]
					     & 0xff)]);
				    int anLocalInt_484_
					= (((anLocalInt_483_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_485_
					= (((anLocalInt_483_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_486_
					= (((anLocalInt_483_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_480_[anLocalInt_479_]
					= (anLocalInt_484_ | anLocalInt_485_
					   | anLocalInt_486_) >>> 8;
				} else if (anLocalInt_481_ == 3) {
				    int anLocalInt_487_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_478_]
					     & 0xff)]);
				    int anLocalInt_488_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_489_
					= anLocalInt_487_ + anLocalInt_488_;
				    int anLocalInt_490_
					= ((anLocalInt_487_ & 0xff00ff)
					   + (anLocalInt_488_ & 0xff00ff));
				    int anLocalInt_491_
					= ((anLocalInt_490_ & 0x1000100)
					   + (anLocalInt_489_ - anLocalInt_490_
					      & 0x10000));
				    anLocalInts_480_[anLocalInt_479_]
					= (anLocalInt_489_ - anLocalInt_491_
					   | anLocalInt_491_ - (anLocalInt_491_
								>>> 8));
				} else if (anLocalInt_481_ == 2) {
				    int anLocalInt_492_
					= (anIntArray6633
					   [(aByteArray6634[anLocalInt_478_]
					     & 0xff)]);
				    int anLocalInt_493_
					= (((anLocalInt_492_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_494_
					= (((anLocalInt_492_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_480_[anLocalInt_479_]
					= ((anLocalInt_493_ | anLocalInt_494_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_482_ == 1) {
				if (anLocalInt_481_ == 1) {
				    int anLocalInt_495_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_495_ != 0)
					anLocalInts_480_[anLocalInt_479_]
					    = (anIntArray6633
					       [anLocalInt_495_ & 0xff]);
				} else if (anLocalInt_481_ == 0) {
				    int anLocalInt_496_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_496_ != 0) {
					int anLocalInt_497_
					    = (anIntArray6633
					       [anLocalInt_496_ & 0xff]);
					if ((Class368_Sub2.anInt5693
					     & 0xffffff)
					    == 16777215) {
					    int anLocalInt_498_
						= (Class368_Sub2.anInt5693
						   >>> 24);
					    int anLocalInt_499_
						= 256 - anLocalInt_498_;
					    int anLocalInt_500_
						= (anLocalInts_480_
						   [anLocalInt_479_]);
					    anLocalInts_480_[anLocalInt_479_]
						= (((((anLocalInt_497_
						       & 0xff00ff)
						      * anLocalInt_498_)
						     + ((anLocalInt_500_
							 & 0xff00ff)
							* anLocalInt_499_))
						    & ~0xff00ff)
						   + ((((anLocalInt_497_
							 & 0xff00)
							* anLocalInt_498_)
						       + ((anLocalInt_500_
							   & 0xff00)
							  * anLocalInt_499_))
						      & 0xff0000)) >> 8;
					} else if (Class368_Sub2.anInt5695
						   != 255) {
					    int anLocalInt_501_
						= (((anLocalInt_497_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_502_
						= (((anLocalInt_497_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_503_
						= (((anLocalInt_497_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInt_497_
						= (anLocalInt_501_
						   | anLocalInt_502_
						   | anLocalInt_503_) >>> 8;
					    int anLocalInt_504_
						= (anLocalInts_480_
						   [anLocalInt_479_]);
					    anLocalInts_480_[anLocalInt_479_]
						= (((((anLocalInt_497_
						       & 0xff00ff)
						      * (Class368_Sub2
							 .anInt5695))
						     + ((anLocalInt_504_
							 & 0xff00ff)
							* (Class368_Sub2
							   .anInt5711)))
						    & ~0xff00ff)
						   + ((((anLocalInt_497_
							 & 0xff00)
							* (Class368_Sub2
							   .anInt5695))
						       + ((anLocalInt_504_
							   & 0xff00)
							  * (Class368_Sub2
							     .anInt5711)))
						      & 0xff0000)) >> 8;
					} else {
					    int anLocalInt_505_
						= (((anLocalInt_497_
						     & 0xff0000)
						    * Class368_Sub2.anInt5702)
						   & ~0xffffff);
					    int anLocalInt_506_
						= (((anLocalInt_497_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
					    int anLocalInt_507_
						= (((anLocalInt_497_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
					    anLocalInts_480_[anLocalInt_479_]
						= (anLocalInt_505_
						   | anLocalInt_506_
						   | anLocalInt_507_) >>> 8;
					}
				    }
				} else if (anLocalInt_481_ == 3) {
				    byte anLocalInt_508_
					= aByteArray6634[anLocalInt_478_];
				    int anLocalInt_509_
					= (anLocalInt_508_ > 0
					   ? anIntArray6633[anLocalInt_508_]
					   : 0);
				    int anLocalInt_510_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_511_
					= anLocalInt_509_ + anLocalInt_510_;
				    int anLocalInt_512_
					= ((anLocalInt_509_ & 0xff00ff)
					   + (anLocalInt_510_ & 0xff00ff));
				    int anLocalInt_513_
					= ((anLocalInt_512_ & 0x1000100)
					   + (anLocalInt_511_ - anLocalInt_512_
					      & 0x10000));
				    anLocalInt_513_
					= (anLocalInt_511_ - anLocalInt_513_
					   | anLocalInt_513_ - (anLocalInt_513_
								>>> 8));
				    if (anLocalInt_509_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_509_ = anLocalInt_513_;
					anLocalInt_513_ = (anLocalInts_480_
							   [anLocalInt_479_]);
					anLocalInt_513_
					    = (((((anLocalInt_509_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_513_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_509_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_513_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_480_[anLocalInt_479_]
					= anLocalInt_513_;
				} else if (anLocalInt_481_ == 2) {
				    int anLocalInt_514_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_514_ != 0) {
					int anLocalInt_515_
					    = (anIntArray6633
					       [anLocalInt_514_ & 0xff]);
					int anLocalInt_516_
					    = (((anLocalInt_515_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_517_
					    = (((anLocalInt_515_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInts_480_[anLocalInt_479_++]
					    = (((anLocalInt_516_
						 | anLocalInt_517_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
				    }
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_482_ == 2) {
				if (anLocalInt_481_ == 1) {
				    int anLocalInt_518_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_518_ != 0) {
					int anLocalInt_519_
					    = (anIntArray6633
					       [anLocalInt_518_ & 0xff]);
					int anLocalInt_520_
					    = (anLocalInts_480_
					       [anLocalInt_479_]);
					int anLocalInt_521_
					    = (anLocalInt_519_
					       + anLocalInt_520_);
					int anLocalInt_522_
					    = ((anLocalInt_519_ & 0xff00ff)
					       + (anLocalInt_520_ & 0xff00ff));
					anLocalInt_520_
					    = ((anLocalInt_522_ & 0x1000100)
					       + ((anLocalInt_521_
						   - anLocalInt_522_)
						  & 0x10000));
					anLocalInts_480_[anLocalInt_479_]
					    = ((anLocalInt_521_
						- anLocalInt_520_)
					       | (anLocalInt_520_
						  - (anLocalInt_520_ >>> 8)));
				    }
				} else if (anLocalInt_481_ == 0) {
				    int anLocalInt_523_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_523_ != 0) {
					int anLocalInt_524_
					    = (anIntArray6633
					       [anLocalInt_523_ & 0xff]);
					int anLocalInt_525_
					    = (((anLocalInt_524_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_526_
					    = (((anLocalInt_524_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_527_
					    = (((anLocalInt_524_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_524_
					    = (anLocalInt_525_
					       | anLocalInt_526_
					       | anLocalInt_527_) >>> 8;
					int anLocalInt_528_
					    = (anLocalInts_480_
					       [anLocalInt_479_]);
					int anLocalInt_529_
					    = (anLocalInt_524_
					       + anLocalInt_528_);
					int anLocalInt_530_
					    = ((anLocalInt_524_ & 0xff00ff)
					       + (anLocalInt_528_ & 0xff00ff));
					anLocalInt_528_
					    = ((anLocalInt_530_ & 0x1000100)
					       + ((anLocalInt_529_
						   - anLocalInt_530_)
						  & 0x10000));
					anLocalInts_480_[anLocalInt_479_]
					    = ((anLocalInt_529_
						- anLocalInt_528_)
					       | (anLocalInt_528_
						  - (anLocalInt_528_ >>> 8)));
				    }
				} else if (anLocalInt_481_ == 3) {
				    byte anLocalInt_531_
					= aByteArray6634[anLocalInt_478_];
				    int anLocalInt_532_
					= (anLocalInt_531_ > 0
					   ? anIntArray6633[anLocalInt_531_]
					   : 0);
				    int anLocalInt_533_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_534_
					= anLocalInt_532_ + anLocalInt_533_;
				    int anLocalInt_535_
					= ((anLocalInt_532_ & 0xff00ff)
					   + (anLocalInt_533_ & 0xff00ff));
				    int anLocalInt_536_
					= ((anLocalInt_535_ & 0x1000100)
					   + (anLocalInt_534_ - anLocalInt_535_
					      & 0x10000));
				    anLocalInt_536_
					= (anLocalInt_534_ - anLocalInt_536_
					   | anLocalInt_536_ - (anLocalInt_536_
								>>> 8));
				    if (anLocalInt_532_ == 0
					&& Class368_Sub2.anInt5695 != 255) {
					anLocalInt_532_ = anLocalInt_536_;
					anLocalInt_536_ = (anLocalInts_480_
							   [anLocalInt_479_]);
					anLocalInt_536_
					    = (((((anLocalInt_532_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_536_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_532_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_536_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_480_[anLocalInt_479_]
					= anLocalInt_536_;
				} else if (anLocalInt_481_ == 2) {
				    int anLocalInt_537_
					= aByteArray6634[anLocalInt_478_];
				    if (anLocalInt_537_ != 0) {
					int anLocalInt_538_
					    = (anIntArray6633
					       [anLocalInt_537_ & 0xff]);
					int anLocalInt_539_
					    = (((anLocalInt_538_ & 0xff00ff)
						* Class368_Sub2.anInt5695)
					       & ~0xff00ff);
					int anLocalInt_540_
					    = (((anLocalInt_538_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       & 0xff0000);
					anLocalInt_538_
					    = (((anLocalInt_539_
						 | anLocalInt_540_)
						>>> 8)
					       + Class368_Sub2.anInt5697);
					int anLocalInt_541_
					    = (anLocalInts_480_
					       [anLocalInt_479_]);
					int anLocalInt_542_
					    = (anLocalInt_538_
					       + anLocalInt_541_);
					int anLocalInt_543_
					    = ((anLocalInt_538_ & 0xff00ff)
					       + (anLocalInt_541_ & 0xff00ff));
					anLocalInt_541_
					    = ((anLocalInt_543_ & 0x1000100)
					       + ((anLocalInt_542_
						   - anLocalInt_543_)
						  & 0x10000));
					anLocalInts_480_[anLocalInt_479_]
					    = ((anLocalInt_542_
						- anLocalInt_541_)
					       | (anLocalInt_541_
						  - (anLocalInt_541_ >>> 8)));
				    }
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_474_ += Class368_Sub2.anInt5717;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_544_ = Class368_Sub2.anInt5724;
		    int anLocalInt_545_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_546_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_547_ = Class368_Sub2.anInt5713;
		    int anLocalInt_548_;
		    if ((anLocalInt_548_
			 = anLocalInt_545_ - (((Class368_Sub2) this).width
					      << 12))
			>= 0) {
			anLocalInt_548_
			    = ((Class368_Sub2.anInt5717 - anLocalInt_548_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_547_ += anLocalInt_548_;
			anLocalInt_545_
			    += Class368_Sub2.anInt5717 * anLocalInt_548_;
			anLocalInt_546_
			    += Class368_Sub2.anInt5712 * anLocalInt_548_;
			anLocalInt_544_ += anLocalInt_548_;
		    }
		    if ((anLocalInt_548_
			 = ((anLocalInt_545_ - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_547_)
			anLocalInt_547_ = anLocalInt_548_;
		    if ((anLocalInt_548_
			 = anLocalInt_546_ - (((Class368_Sub2) this).height
					      << 12))
			>= 0) {
			anLocalInt_548_
			    = ((Class368_Sub2.anInt5712 - anLocalInt_548_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_547_ += anLocalInt_548_;
			anLocalInt_545_
			    += Class368_Sub2.anInt5717 * anLocalInt_548_;
			anLocalInt_546_
			    += Class368_Sub2.anInt5712 * anLocalInt_548_;
			anLocalInt_544_ += anLocalInt_548_;
		    }
		    if ((anLocalInt_548_
			 = ((anLocalInt_546_ - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_547_)
			anLocalInt_547_ = anLocalInt_548_;
		    for (/**/; anLocalInt_547_ < 0; anLocalInt_547_++) {
			int anLocalInt_549_
			    = (((anLocalInt_546_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_545_ >> 12));
			int anLocalInt_550_ = anLocalInt_544_++;
			int[] anLocalInts_551_ = anLocalInts;
			int anLocalInt_552_ = argument_258_;
			int anLocalInt_553_ = argument_259_;
			if (anLocalInt_553_ == 0) {
			    if (anLocalInt_552_ == 1)
				anLocalInts_551_[anLocalInt_550_]
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_549_]
					 & 0xff)]);
			    else if (anLocalInt_552_ == 0) {
				int anLocalInt_554_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_549_]
					 & 0xff)]);
				int anLocalInt_555_
				    = (((anLocalInt_554_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_556_
				    = (((anLocalInt_554_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_557_
				    = (((anLocalInt_554_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_551_[anLocalInt_550_]
				    = (anLocalInt_555_ | anLocalInt_556_
				       | anLocalInt_557_) >>> 8;
			    } else if (anLocalInt_552_ == 3) {
				int anLocalInt_558_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_549_]
					 & 0xff)]);
				int anLocalInt_559_ = Class368_Sub2.anInt5693;
				int anLocalInt_560_
				    = anLocalInt_558_ + anLocalInt_559_;
				int anLocalInt_561_
				    = ((anLocalInt_558_ & 0xff00ff)
				       + (anLocalInt_559_ & 0xff00ff));
				int anLocalInt_562_
				    = ((anLocalInt_561_ & 0x1000100)
				       + (anLocalInt_560_ - anLocalInt_561_
					  & 0x10000));
				anLocalInts_551_[anLocalInt_550_]
				    = (anLocalInt_560_ - anLocalInt_562_
				       | anLocalInt_562_ - (anLocalInt_562_
							    >>> 8));
			    } else if (anLocalInt_552_ == 2) {
				int anLocalInt_563_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_549_]
					 & 0xff)]);
				int anLocalInt_564_
				    = (((anLocalInt_563_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_565_
				    = (((anLocalInt_563_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_551_[anLocalInt_550_]
				    = ((anLocalInt_564_ | anLocalInt_565_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_553_ == 1) {
			    if (anLocalInt_552_ == 1) {
				int anLocalInt_566_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_566_ != 0)
				    anLocalInts_551_[anLocalInt_550_]
					= (anIntArray6633
					   [anLocalInt_566_ & 0xff]);
			    } else if (anLocalInt_552_ == 0) {
				int anLocalInt_567_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_567_ != 0) {
				    int anLocalInt_568_
					= (anIntArray6633
					   [anLocalInt_567_ & 0xff]);
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_569_
					    = Class368_Sub2.anInt5693 >>> 24;
					int anLocalInt_570_
					    = 256 - anLocalInt_569_;
					int anLocalInt_571_
					    = (anLocalInts_551_
					       [anLocalInt_550_]);
					anLocalInts_551_[anLocalInt_550_]
					    = (((((anLocalInt_568_ & 0xff00ff)
						  * anLocalInt_569_)
						 + ((anLocalInt_571_
						     & 0xff00ff)
						    * anLocalInt_570_))
						& ~0xff00ff)
					       + ((((anLocalInt_568_ & 0xff00)
						    * anLocalInt_569_)
						   + ((anLocalInt_571_
						       & 0xff00)
						      * anLocalInt_570_))
						  & 0xff0000)) >> 8;
				    } else if (Class368_Sub2.anInt5695
					       != 255) {
					int anLocalInt_572_
					    = (((anLocalInt_568_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_573_
					    = (((anLocalInt_568_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_574_
					    = (((anLocalInt_568_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_568_
					    = (anLocalInt_572_
					       | anLocalInt_573_
					       | anLocalInt_574_) >>> 8;
					int anLocalInt_575_
					    = (anLocalInts_551_
					       [anLocalInt_550_]);
					anLocalInts_551_[anLocalInt_550_]
					    = (((((anLocalInt_568_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_575_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_568_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_575_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_576_
					    = (((anLocalInt_568_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_577_
					    = (((anLocalInt_568_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_578_
					    = (((anLocalInt_568_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_551_[anLocalInt_550_]
					    = (anLocalInt_576_
					       | anLocalInt_577_
					       | anLocalInt_578_) >>> 8;
				    }
				}
			    } else if (anLocalInt_552_ == 3) {
				byte anLocalInt_579_
				    = aByteArray6634[anLocalInt_549_];
				int anLocalInt_580_
				    = (anLocalInt_579_ > 0
				       ? anIntArray6633[anLocalInt_579_] : 0);
				int anLocalInt_581_ = Class368_Sub2.anInt5693;
				int anLocalInt_582_
				    = anLocalInt_580_ + anLocalInt_581_;
				int anLocalInt_583_
				    = ((anLocalInt_580_ & 0xff00ff)
				       + (anLocalInt_581_ & 0xff00ff));
				int anLocalInt_584_
				    = ((anLocalInt_583_ & 0x1000100)
				       + (anLocalInt_582_ - anLocalInt_583_
					  & 0x10000));
				anLocalInt_584_
				    = (anLocalInt_582_ - anLocalInt_584_
				       | anLocalInt_584_ - (anLocalInt_584_
							    >>> 8));
				if (anLocalInt_580_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_580_ = anLocalInt_584_;
				    anLocalInt_584_
					= anLocalInts_551_[anLocalInt_550_];
				    anLocalInt_584_
					= (((((anLocalInt_580_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_584_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_580_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_584_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_551_[anLocalInt_550_]
				    = anLocalInt_584_;
			    } else if (anLocalInt_552_ == 2) {
				int anLocalInt_585_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_585_ != 0) {
				    int anLocalInt_586_
					= (anIntArray6633
					   [anLocalInt_585_ & 0xff]);
				    int anLocalInt_587_
					= (((anLocalInt_586_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_588_
					= (((anLocalInt_586_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_551_[anLocalInt_550_++]
					= ((anLocalInt_587_ | anLocalInt_588_)
					   >>> 8) + Class368_Sub2.anInt5697;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_553_ == 2) {
			    if (anLocalInt_552_ == 1) {
				int anLocalInt_589_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_589_ != 0) {
				    int anLocalInt_590_
					= (anIntArray6633
					   [anLocalInt_589_ & 0xff]);
				    int anLocalInt_591_
					= anLocalInts_551_[anLocalInt_550_];
				    int anLocalInt_592_
					= anLocalInt_590_ + anLocalInt_591_;
				    int anLocalInt_593_
					= ((anLocalInt_590_ & 0xff00ff)
					   + (anLocalInt_591_ & 0xff00ff));
				    anLocalInt_591_
					= ((anLocalInt_593_ & 0x1000100)
					   + (anLocalInt_592_ - anLocalInt_593_
					      & 0x10000));
				    anLocalInts_551_[anLocalInt_550_]
					= (anLocalInt_592_ - anLocalInt_591_
					   | anLocalInt_591_ - (anLocalInt_591_
								>>> 8));
				}
			    } else if (anLocalInt_552_ == 0) {
				int anLocalInt_594_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_594_ != 0) {
				    int anLocalInt_595_
					= (anIntArray6633
					   [anLocalInt_594_ & 0xff]);
				    int anLocalInt_596_
					= (((anLocalInt_595_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_597_
					= (((anLocalInt_595_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_598_
					= (((anLocalInt_595_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_595_
					= (anLocalInt_596_ | anLocalInt_597_
					   | anLocalInt_598_) >>> 8;
				    int anLocalInt_599_
					= anLocalInts_551_[anLocalInt_550_];
				    int anLocalInt_600_
					= anLocalInt_595_ + anLocalInt_599_;
				    int anLocalInt_601_
					= ((anLocalInt_595_ & 0xff00ff)
					   + (anLocalInt_599_ & 0xff00ff));
				    anLocalInt_599_
					= ((anLocalInt_601_ & 0x1000100)
					   + (anLocalInt_600_ - anLocalInt_601_
					      & 0x10000));
				    anLocalInts_551_[anLocalInt_550_]
					= (anLocalInt_600_ - anLocalInt_599_
					   | anLocalInt_599_ - (anLocalInt_599_
								>>> 8));
				}
			    } else if (anLocalInt_552_ == 3) {
				byte anLocalInt_602_
				    = aByteArray6634[anLocalInt_549_];
				int anLocalInt_603_
				    = (anLocalInt_602_ > 0
				       ? anIntArray6633[anLocalInt_602_] : 0);
				int anLocalInt_604_ = Class368_Sub2.anInt5693;
				int anLocalInt_605_
				    = anLocalInt_603_ + anLocalInt_604_;
				int anLocalInt_606_
				    = ((anLocalInt_603_ & 0xff00ff)
				       + (anLocalInt_604_ & 0xff00ff));
				int anLocalInt_607_
				    = ((anLocalInt_606_ & 0x1000100)
				       + (anLocalInt_605_ - anLocalInt_606_
					  & 0x10000));
				anLocalInt_607_
				    = (anLocalInt_605_ - anLocalInt_607_
				       | anLocalInt_607_ - (anLocalInt_607_
							    >>> 8));
				if (anLocalInt_603_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_603_ = anLocalInt_607_;
				    anLocalInt_607_
					= anLocalInts_551_[anLocalInt_550_];
				    anLocalInt_607_
					= (((((anLocalInt_603_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_607_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_603_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_607_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_551_[anLocalInt_550_]
				    = anLocalInt_607_;
			    } else if (anLocalInt_552_ == 2) {
				int anLocalInt_608_
				    = aByteArray6634[anLocalInt_549_];
				if (anLocalInt_608_ != 0) {
				    int anLocalInt_609_
					= (anIntArray6633
					   [anLocalInt_608_ & 0xff]);
				    int anLocalInt_610_
					= (((anLocalInt_609_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_611_
					= (((anLocalInt_609_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_609_
					= ((anLocalInt_610_ | anLocalInt_611_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_612_
					= anLocalInts_551_[anLocalInt_550_];
				    int anLocalInt_613_
					= anLocalInt_609_ + anLocalInt_612_;
				    int anLocalInt_614_
					= ((anLocalInt_609_ & 0xff00ff)
					   + (anLocalInt_612_ & 0xff00ff));
				    anLocalInt_612_
					= ((anLocalInt_614_ & 0x1000100)
					   + (anLocalInt_613_ - anLocalInt_614_
					      & 0x10000));
				    anLocalInts_551_[anLocalInt_550_]
					= (anLocalInt_613_ - anLocalInt_612_
					   | anLocalInt_612_ - (anLocalInt_612_
								>>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_545_ += Class368_Sub2.anInt5717;
			anLocalInt_546_ += Class368_Sub2.anInt5712;
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_615_ = Class368_Sub2.anInt5724;
		    int anLocalInt_616_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_617_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_618_ = Class368_Sub2.anInt5713;
		    int anLocalInt_619_;
		    if ((anLocalInt_619_
			 = anLocalInt_616_ - (((Class368_Sub2) this).width
					      << 12))
			>= 0) {
			anLocalInt_619_
			    = ((Class368_Sub2.anInt5717 - anLocalInt_619_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_618_ += anLocalInt_619_;
			anLocalInt_616_
			    += Class368_Sub2.anInt5717 * anLocalInt_619_;
			anLocalInt_617_
			    += Class368_Sub2.anInt5712 * anLocalInt_619_;
			anLocalInt_615_ += anLocalInt_619_;
		    }
		    if ((anLocalInt_619_
			 = ((anLocalInt_616_ - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_618_)
			anLocalInt_618_ = anLocalInt_619_;
		    if (anLocalInt_617_ < 0) {
			anLocalInt_619_
			    = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_617_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_618_ += anLocalInt_619_;
			anLocalInt_616_
			    += Class368_Sub2.anInt5717 * anLocalInt_619_;
			anLocalInt_617_
			    += Class368_Sub2.anInt5712 * anLocalInt_619_;
			anLocalInt_615_ += anLocalInt_619_;
		    }
		    if ((anLocalInt_619_
			 = ((anLocalInt_617_ + 1
			     - (((Class368_Sub2) this).height << 12)
			     - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_618_)
			anLocalInt_618_ = anLocalInt_619_;
		    for (/**/; anLocalInt_618_ < 0; anLocalInt_618_++) {
			int anLocalInt_620_
			    = (((anLocalInt_617_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_616_ >> 12));
			int anLocalInt_621_ = anLocalInt_615_++;
			int[] anLocalInts_622_ = anLocalInts;
			int anLocalInt_623_ = argument_258_;
			int anLocalInt_624_ = argument_259_;
			if (anLocalInt_624_ == 0) {
			    if (anLocalInt_623_ == 1)
				anLocalInts_622_[anLocalInt_621_]
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_620_]
					 & 0xff)]);
			    else if (anLocalInt_623_ == 0) {
				int anLocalInt_625_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_620_]
					 & 0xff)]);
				int anLocalInt_626_
				    = (((anLocalInt_625_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_627_
				    = (((anLocalInt_625_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_628_
				    = (((anLocalInt_625_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_622_[anLocalInt_621_]
				    = (anLocalInt_626_ | anLocalInt_627_
				       | anLocalInt_628_) >>> 8;
			    } else if (anLocalInt_623_ == 3) {
				int anLocalInt_629_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_620_]
					 & 0xff)]);
				int anLocalInt_630_ = Class368_Sub2.anInt5693;
				int anLocalInt_631_
				    = anLocalInt_629_ + anLocalInt_630_;
				int anLocalInt_632_
				    = ((anLocalInt_629_ & 0xff00ff)
				       + (anLocalInt_630_ & 0xff00ff));
				int anLocalInt_633_
				    = ((anLocalInt_632_ & 0x1000100)
				       + (anLocalInt_631_ - anLocalInt_632_
					  & 0x10000));
				anLocalInts_622_[anLocalInt_621_]
				    = (anLocalInt_631_ - anLocalInt_633_
				       | anLocalInt_633_ - (anLocalInt_633_
							    >>> 8));
			    } else if (anLocalInt_623_ == 2) {
				int anLocalInt_634_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_620_]
					 & 0xff)]);
				int anLocalInt_635_
				    = (((anLocalInt_634_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_636_
				    = (((anLocalInt_634_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_622_[anLocalInt_621_]
				    = ((anLocalInt_635_ | anLocalInt_636_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_624_ == 1) {
			    if (anLocalInt_623_ == 1) {
				int anLocalInt_637_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_637_ != 0)
				    anLocalInts_622_[anLocalInt_621_]
					= (anIntArray6633
					   [anLocalInt_637_ & 0xff]);
			    } else if (anLocalInt_623_ == 0) {
				int anLocalInt_638_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_638_ != 0) {
				    int anLocalInt_639_
					= (anIntArray6633
					   [anLocalInt_638_ & 0xff]);
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_640_
					    = Class368_Sub2.anInt5693 >>> 24;
					int anLocalInt_641_
					    = 256 - anLocalInt_640_;
					int anLocalInt_642_
					    = (anLocalInts_622_
					       [anLocalInt_621_]);
					anLocalInts_622_[anLocalInt_621_]
					    = (((((anLocalInt_639_ & 0xff00ff)
						  * anLocalInt_640_)
						 + ((anLocalInt_642_
						     & 0xff00ff)
						    * anLocalInt_641_))
						& ~0xff00ff)
					       + ((((anLocalInt_639_ & 0xff00)
						    * anLocalInt_640_)
						   + ((anLocalInt_642_
						       & 0xff00)
						      * anLocalInt_641_))
						  & 0xff0000)) >> 8;
				    } else if (Class368_Sub2.anInt5695
					       != 255) {
					int anLocalInt_643_
					    = (((anLocalInt_639_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_644_
					    = (((anLocalInt_639_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_645_
					    = (((anLocalInt_639_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_639_
					    = (anLocalInt_643_
					       | anLocalInt_644_
					       | anLocalInt_645_) >>> 8;
					int anLocalInt_646_
					    = (anLocalInts_622_
					       [anLocalInt_621_]);
					anLocalInts_622_[anLocalInt_621_]
					    = (((((anLocalInt_639_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_646_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_639_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_646_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_647_
					    = (((anLocalInt_639_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_648_
					    = (((anLocalInt_639_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_649_
					    = (((anLocalInt_639_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_622_[anLocalInt_621_]
					    = (anLocalInt_647_
					       | anLocalInt_648_
					       | anLocalInt_649_) >>> 8;
				    }
				}
			    } else if (anLocalInt_623_ == 3) {
				byte anLocalInt_650_
				    = aByteArray6634[anLocalInt_620_];
				int anLocalInt_651_
				    = (anLocalInt_650_ > 0
				       ? anIntArray6633[anLocalInt_650_] : 0);
				int anLocalInt_652_ = Class368_Sub2.anInt5693;
				int anLocalInt_653_
				    = anLocalInt_651_ + anLocalInt_652_;
				int anLocalInt_654_
				    = ((anLocalInt_651_ & 0xff00ff)
				       + (anLocalInt_652_ & 0xff00ff));
				int anLocalInt_655_
				    = ((anLocalInt_654_ & 0x1000100)
				       + (anLocalInt_653_ - anLocalInt_654_
					  & 0x10000));
				anLocalInt_655_
				    = (anLocalInt_653_ - anLocalInt_655_
				       | anLocalInt_655_ - (anLocalInt_655_
							    >>> 8));
				if (anLocalInt_651_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_651_ = anLocalInt_655_;
				    anLocalInt_655_
					= anLocalInts_622_[anLocalInt_621_];
				    anLocalInt_655_
					= (((((anLocalInt_651_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_655_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_651_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_655_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_622_[anLocalInt_621_]
				    = anLocalInt_655_;
			    } else if (anLocalInt_623_ == 2) {
				int anLocalInt_656_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_656_ != 0) {
				    int anLocalInt_657_
					= (anIntArray6633
					   [anLocalInt_656_ & 0xff]);
				    int anLocalInt_658_
					= (((anLocalInt_657_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_659_
					= (((anLocalInt_657_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_622_[anLocalInt_621_++]
					= ((anLocalInt_658_ | anLocalInt_659_)
					   >>> 8) + Class368_Sub2.anInt5697;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_624_ == 2) {
			    if (anLocalInt_623_ == 1) {
				int anLocalInt_660_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_660_ != 0) {
				    int anLocalInt_661_
					= (anIntArray6633
					   [anLocalInt_660_ & 0xff]);
				    int anLocalInt_662_
					= anLocalInts_622_[anLocalInt_621_];
				    int anLocalInt_663_
					= anLocalInt_661_ + anLocalInt_662_;
				    int anLocalInt_664_
					= ((anLocalInt_661_ & 0xff00ff)
					   + (anLocalInt_662_ & 0xff00ff));
				    anLocalInt_662_
					= ((anLocalInt_664_ & 0x1000100)
					   + (anLocalInt_663_ - anLocalInt_664_
					      & 0x10000));
				    anLocalInts_622_[anLocalInt_621_]
					= (anLocalInt_663_ - anLocalInt_662_
					   | anLocalInt_662_ - (anLocalInt_662_
								>>> 8));
				}
			    } else if (anLocalInt_623_ == 0) {
				int anLocalInt_665_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_665_ != 0) {
				    int anLocalInt_666_
					= (anIntArray6633
					   [anLocalInt_665_ & 0xff]);
				    int anLocalInt_667_
					= (((anLocalInt_666_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_668_
					= (((anLocalInt_666_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_669_
					= (((anLocalInt_666_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_666_
					= (anLocalInt_667_ | anLocalInt_668_
					   | anLocalInt_669_) >>> 8;
				    int anLocalInt_670_
					= anLocalInts_622_[anLocalInt_621_];
				    int anLocalInt_671_
					= anLocalInt_666_ + anLocalInt_670_;
				    int anLocalInt_672_
					= ((anLocalInt_666_ & 0xff00ff)
					   + (anLocalInt_670_ & 0xff00ff));
				    anLocalInt_670_
					= ((anLocalInt_672_ & 0x1000100)
					   + (anLocalInt_671_ - anLocalInt_672_
					      & 0x10000));
				    anLocalInts_622_[anLocalInt_621_]
					= (anLocalInt_671_ - anLocalInt_670_
					   | anLocalInt_670_ - (anLocalInt_670_
								>>> 8));
				}
			    } else if (anLocalInt_623_ == 3) {
				byte anLocalInt_673_
				    = aByteArray6634[anLocalInt_620_];
				int anLocalInt_674_
				    = (anLocalInt_673_ > 0
				       ? anIntArray6633[anLocalInt_673_] : 0);
				int anLocalInt_675_ = Class368_Sub2.anInt5693;
				int anLocalInt_676_
				    = anLocalInt_674_ + anLocalInt_675_;
				int anLocalInt_677_
				    = ((anLocalInt_674_ & 0xff00ff)
				       + (anLocalInt_675_ & 0xff00ff));
				int anLocalInt_678_
				    = ((anLocalInt_677_ & 0x1000100)
				       + (anLocalInt_676_ - anLocalInt_677_
					  & 0x10000));
				anLocalInt_678_
				    = (anLocalInt_676_ - anLocalInt_678_
				       | anLocalInt_678_ - (anLocalInt_678_
							    >>> 8));
				if (anLocalInt_674_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_674_ = anLocalInt_678_;
				    anLocalInt_678_
					= anLocalInts_622_[anLocalInt_621_];
				    anLocalInt_678_
					= (((((anLocalInt_674_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_678_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_674_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_678_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_622_[anLocalInt_621_]
				    = anLocalInt_678_;
			    } else if (anLocalInt_623_ == 2) {
				int anLocalInt_679_
				    = aByteArray6634[anLocalInt_620_];
				if (anLocalInt_679_ != 0) {
				    int anLocalInt_680_
					= (anIntArray6633
					   [anLocalInt_679_ & 0xff]);
				    int anLocalInt_681_
					= (((anLocalInt_680_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_682_
					= (((anLocalInt_680_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_680_
					= ((anLocalInt_681_ | anLocalInt_682_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_683_
					= anLocalInts_622_[anLocalInt_621_];
				    int anLocalInt_684_
					= anLocalInt_680_ + anLocalInt_683_;
				    int anLocalInt_685_
					= ((anLocalInt_680_ & 0xff00ff)
					   + (anLocalInt_683_ & 0xff00ff));
				    anLocalInt_683_
					= ((anLocalInt_685_ & 0x1000100)
					   + (anLocalInt_684_ - anLocalInt_685_
					      & 0x10000));
				    anLocalInts_622_[anLocalInt_621_]
					= (anLocalInt_684_ - anLocalInt_683_
					   | anLocalInt_683_ - (anLocalInt_683_
								>>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_616_ += Class368_Sub2.anInt5717;
			anLocalInt_617_ += Class368_Sub2.anInt5712;
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    }
	} else if (Class368_Sub2.anInt5712 == 0) {
	    int anLocalInt = Class368_Sub2.anInt5700;
	    while (anLocalInt < 0) {
		int anLocalInt_686_ = Class368_Sub2.anInt5724;
		int anLocalInt_687_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_688_ = Class368_Sub2.anInt5704;
		int anLocalInt_689_ = Class368_Sub2.anInt5713;
		if (anLocalInt_688_ >= 0
		    && anLocalInt_688_ - (((Class368_Sub2) this).height
					  << 12) < 0) {
		    if (anLocalInt_687_ < 0) {
			int anLocalInt_690_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_687_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_689_ += anLocalInt_690_;
			anLocalInt_687_
			    += Class368_Sub2.anInt5717 * anLocalInt_690_;
			anLocalInt_686_ += anLocalInt_690_;
		    }
		    int anLocalInt_691_;
		    if ((anLocalInt_691_
			 = ((anLocalInt_687_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_689_)
			anLocalInt_689_ = anLocalInt_691_;
		    for (/**/; anLocalInt_689_ < 0; anLocalInt_689_++) {
			int anLocalInt_692_
			    = (((anLocalInt_688_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_687_ >> 12));
			int anLocalInt_693_ = anLocalInt_686_++;
			int[] anLocalInts_694_ = anLocalInts;
			int anLocalInt_695_ = argument_258_;
			int anLocalInt_696_ = argument_259_;
			if (anLocalInt_696_ == 0) {
			    if (anLocalInt_695_ == 1)
				anLocalInts_694_[anLocalInt_693_]
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_692_]
					 & 0xff)]);
			    else if (anLocalInt_695_ == 0) {
				int anLocalInt_697_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_692_]
					 & 0xff)]);
				int anLocalInt_698_
				    = (((anLocalInt_697_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_699_
				    = (((anLocalInt_697_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_700_
				    = (((anLocalInt_697_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_694_[anLocalInt_693_]
				    = (anLocalInt_698_ | anLocalInt_699_
				       | anLocalInt_700_) >>> 8;
			    } else if (anLocalInt_695_ == 3) {
				int anLocalInt_701_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_692_]
					 & 0xff)]);
				int anLocalInt_702_ = Class368_Sub2.anInt5693;
				int anLocalInt_703_
				    = anLocalInt_701_ + anLocalInt_702_;
				int anLocalInt_704_
				    = ((anLocalInt_701_ & 0xff00ff)
				       + (anLocalInt_702_ & 0xff00ff));
				int anLocalInt_705_
				    = ((anLocalInt_704_ & 0x1000100)
				       + (anLocalInt_703_ - anLocalInt_704_
					  & 0x10000));
				anLocalInts_694_[anLocalInt_693_]
				    = (anLocalInt_703_ - anLocalInt_705_
				       | anLocalInt_705_ - (anLocalInt_705_
							    >>> 8));
			    } else if (anLocalInt_695_ == 2) {
				int anLocalInt_706_
				    = (anIntArray6633
				       [(aByteArray6634[anLocalInt_692_]
					 & 0xff)]);
				int anLocalInt_707_
				    = (((anLocalInt_706_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_708_
				    = (((anLocalInt_706_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_694_[anLocalInt_693_]
				    = ((anLocalInt_707_ | anLocalInt_708_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_696_ == 1) {
			    if (anLocalInt_695_ == 1) {
				int anLocalInt_709_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_709_ != 0)
				    anLocalInts_694_[anLocalInt_693_]
					= (anIntArray6633
					   [anLocalInt_709_ & 0xff]);
			    } else if (anLocalInt_695_ == 0) {
				int anLocalInt_710_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_710_ != 0) {
				    int anLocalInt_711_
					= (anIntArray6633
					   [anLocalInt_710_ & 0xff]);
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_712_
					    = Class368_Sub2.anInt5693 >>> 24;
					int anLocalInt_713_
					    = 256 - anLocalInt_712_;
					int anLocalInt_714_
					    = (anLocalInts_694_
					       [anLocalInt_693_]);
					anLocalInts_694_[anLocalInt_693_]
					    = (((((anLocalInt_711_ & 0xff00ff)
						  * anLocalInt_712_)
						 + ((anLocalInt_714_
						     & 0xff00ff)
						    * anLocalInt_713_))
						& ~0xff00ff)
					       + ((((anLocalInt_711_ & 0xff00)
						    * anLocalInt_712_)
						   + ((anLocalInt_714_
						       & 0xff00)
						      * anLocalInt_713_))
						  & 0xff0000)) >> 8;
				    } else if (Class368_Sub2.anInt5695
					       != 255) {
					int anLocalInt_715_
					    = (((anLocalInt_711_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_716_
					    = (((anLocalInt_711_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_717_
					    = (((anLocalInt_711_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_711_
					    = (anLocalInt_715_
					       | anLocalInt_716_
					       | anLocalInt_717_) >>> 8;
					int anLocalInt_718_
					    = (anLocalInts_694_
					       [anLocalInt_693_]);
					anLocalInts_694_[anLocalInt_693_]
					    = (((((anLocalInt_711_ & 0xff00ff)
						  * Class368_Sub2.anInt5695)
						 + ((anLocalInt_718_
						     & 0xff00ff)
						    * Class368_Sub2.anInt5711))
						& ~0xff00ff)
					       + ((((anLocalInt_711_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   + ((anLocalInt_718_
						       & 0xff00)
						      * (Class368_Sub2
							 .anInt5711)))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_719_
					    = (((anLocalInt_711_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_720_
					    = (((anLocalInt_711_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_721_
					    = (((anLocalInt_711_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_694_[anLocalInt_693_]
					    = (anLocalInt_719_
					       | anLocalInt_720_
					       | anLocalInt_721_) >>> 8;
				    }
				}
			    } else if (anLocalInt_695_ == 3) {
				byte anLocalInt_722_
				    = aByteArray6634[anLocalInt_692_];
				int anLocalInt_723_
				    = (anLocalInt_722_ > 0
				       ? anIntArray6633[anLocalInt_722_] : 0);
				int anLocalInt_724_ = Class368_Sub2.anInt5693;
				int anLocalInt_725_
				    = anLocalInt_723_ + anLocalInt_724_;
				int anLocalInt_726_
				    = ((anLocalInt_723_ & 0xff00ff)
				       + (anLocalInt_724_ & 0xff00ff));
				int anLocalInt_727_
				    = ((anLocalInt_726_ & 0x1000100)
				       + (anLocalInt_725_ - anLocalInt_726_
					  & 0x10000));
				anLocalInt_727_
				    = (anLocalInt_725_ - anLocalInt_727_
				       | anLocalInt_727_ - (anLocalInt_727_
							    >>> 8));
				if (anLocalInt_723_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_723_ = anLocalInt_727_;
				    anLocalInt_727_
					= anLocalInts_694_[anLocalInt_693_];
				    anLocalInt_727_
					= (((((anLocalInt_723_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_727_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_723_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_727_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_694_[anLocalInt_693_]
				    = anLocalInt_727_;
			    } else if (anLocalInt_695_ == 2) {
				int anLocalInt_728_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_728_ != 0) {
				    int anLocalInt_729_
					= (anIntArray6633
					   [anLocalInt_728_ & 0xff]);
				    int anLocalInt_730_
					= (((anLocalInt_729_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_731_
					= (((anLocalInt_729_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_694_[anLocalInt_693_++]
					= ((anLocalInt_730_ | anLocalInt_731_)
					   >>> 8) + Class368_Sub2.anInt5697;
				}
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_696_ == 2) {
			    if (anLocalInt_695_ == 1) {
				int anLocalInt_732_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_732_ != 0) {
				    int anLocalInt_733_
					= (anIntArray6633
					   [anLocalInt_732_ & 0xff]);
				    int anLocalInt_734_
					= anLocalInts_694_[anLocalInt_693_];
				    int anLocalInt_735_
					= anLocalInt_733_ + anLocalInt_734_;
				    int anLocalInt_736_
					= ((anLocalInt_733_ & 0xff00ff)
					   + (anLocalInt_734_ & 0xff00ff));
				    anLocalInt_734_
					= ((anLocalInt_736_ & 0x1000100)
					   + (anLocalInt_735_ - anLocalInt_736_
					      & 0x10000));
				    anLocalInts_694_[anLocalInt_693_]
					= (anLocalInt_735_ - anLocalInt_734_
					   | anLocalInt_734_ - (anLocalInt_734_
								>>> 8));
				}
			    } else if (anLocalInt_695_ == 0) {
				int anLocalInt_737_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_737_ != 0) {
				    int anLocalInt_738_
					= (anIntArray6633
					   [anLocalInt_737_ & 0xff]);
				    int anLocalInt_739_
					= (((anLocalInt_738_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_740_
					= (((anLocalInt_738_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_741_
					= (((anLocalInt_738_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_738_
					= (anLocalInt_739_ | anLocalInt_740_
					   | anLocalInt_741_) >>> 8;
				    int anLocalInt_742_
					= anLocalInts_694_[anLocalInt_693_];
				    int anLocalInt_743_
					= anLocalInt_738_ + anLocalInt_742_;
				    int anLocalInt_744_
					= ((anLocalInt_738_ & 0xff00ff)
					   + (anLocalInt_742_ & 0xff00ff));
				    anLocalInt_742_
					= ((anLocalInt_744_ & 0x1000100)
					   + (anLocalInt_743_ - anLocalInt_744_
					      & 0x10000));
				    anLocalInts_694_[anLocalInt_693_]
					= (anLocalInt_743_ - anLocalInt_742_
					   | anLocalInt_742_ - (anLocalInt_742_
								>>> 8));
				}
			    } else if (anLocalInt_695_ == 3) {
				byte anLocalInt_745_
				    = aByteArray6634[anLocalInt_692_];
				int anLocalInt_746_
				    = (anLocalInt_745_ > 0
				       ? anIntArray6633[anLocalInt_745_] : 0);
				int anLocalInt_747_ = Class368_Sub2.anInt5693;
				int anLocalInt_748_
				    = anLocalInt_746_ + anLocalInt_747_;
				int anLocalInt_749_
				    = ((anLocalInt_746_ & 0xff00ff)
				       + (anLocalInt_747_ & 0xff00ff));
				int anLocalInt_750_
				    = ((anLocalInt_749_ & 0x1000100)
				       + (anLocalInt_748_ - anLocalInt_749_
					  & 0x10000));
				anLocalInt_750_
				    = (anLocalInt_748_ - anLocalInt_750_
				       | anLocalInt_750_ - (anLocalInt_750_
							    >>> 8));
				if (anLocalInt_746_ == 0
				    && Class368_Sub2.anInt5695 != 255) {
				    anLocalInt_746_ = anLocalInt_750_;
				    anLocalInt_750_
					= anLocalInts_694_[anLocalInt_693_];
				    anLocalInt_750_
					= (((((anLocalInt_746_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_750_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_746_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_750_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_694_[anLocalInt_693_]
				    = anLocalInt_750_;
			    } else if (anLocalInt_695_ == 2) {
				int anLocalInt_751_
				    = aByteArray6634[anLocalInt_692_];
				if (anLocalInt_751_ != 0) {
				    int anLocalInt_752_
					= (anIntArray6633
					   [anLocalInt_751_ & 0xff]);
				    int anLocalInt_753_
					= (((anLocalInt_752_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_754_
					= (((anLocalInt_752_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_752_
					= ((anLocalInt_753_ | anLocalInt_754_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_755_
					= anLocalInts_694_[anLocalInt_693_];
				    int anLocalInt_756_
					= anLocalInt_752_ + anLocalInt_755_;
				    int anLocalInt_757_
					= ((anLocalInt_752_ & 0xff00ff)
					   + (anLocalInt_755_ & 0xff00ff));
				    anLocalInt_755_
					= ((anLocalInt_757_ & 0x1000100)
					   + (anLocalInt_756_ - anLocalInt_757_
					      & 0x10000));
				    anLocalInts_694_[anLocalInt_693_]
					= (anLocalInt_756_ - anLocalInt_755_
					   | anLocalInt_755_ - (anLocalInt_755_
								>>> 8));
				}
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_687_ += Class368_Sub2.anInt5717;
		    }
		}
		anLocalInt++;
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	} else if (Class368_Sub2.anInt5712 < 0) {
	    for (int anLocalInt = Class368_Sub2.anInt5700; anLocalInt < 0;
		 anLocalInt++) {
		int anLocalInt_758_ = Class368_Sub2.anInt5724;
		int anLocalInt_759_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_760_
		    = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		int anLocalInt_761_ = Class368_Sub2.anInt5713;
		if (anLocalInt_759_ < 0) {
		    int anLocalInt_762_
			= ((Class368_Sub2.anInt5717 - 1 - anLocalInt_759_)
			   / Class368_Sub2.anInt5717);
		    anLocalInt_761_ += anLocalInt_762_;
		    anLocalInt_759_
			+= Class368_Sub2.anInt5717 * anLocalInt_762_;
		    anLocalInt_760_
			+= Class368_Sub2.anInt5712 * anLocalInt_762_;
		    anLocalInt_758_ += anLocalInt_762_;
		}
		int anLocalInt_763_;
		if ((anLocalInt_763_
		     = (anLocalInt_759_ + 1
			- (((Class368_Sub2) this).width << 12)
			- Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)
		    > anLocalInt_761_)
		    anLocalInt_761_ = anLocalInt_763_;
		if ((anLocalInt_763_
		     = anLocalInt_760_ - (((Class368_Sub2) this).height
					  << 12))
		    >= 0) {
		    anLocalInt_763_
			= ((Class368_Sub2.anInt5712 - anLocalInt_763_)
			   / Class368_Sub2.anInt5712);
		    anLocalInt_761_ += anLocalInt_763_;
		    anLocalInt_759_
			+= Class368_Sub2.anInt5717 * anLocalInt_763_;
		    anLocalInt_760_
			+= Class368_Sub2.anInt5712 * anLocalInt_763_;
		    anLocalInt_758_ += anLocalInt_763_;
		}
		if ((anLocalInt_763_
		     = ((anLocalInt_760_ - Class368_Sub2.anInt5712)
			/ Class368_Sub2.anInt5712))
		    > anLocalInt_761_)
		    anLocalInt_761_ = anLocalInt_763_;
		for (/**/; anLocalInt_761_ < 0; anLocalInt_761_++) {
		    int anLocalInt_764_ = (((anLocalInt_760_ >> 12)
					    * ((Class368_Sub2) this).width)
					   + (anLocalInt_759_ >> 12));
		    int anLocalInt_765_ = anLocalInt_758_++;
		    int[] anLocalInts_766_ = anLocalInts;
		    int anLocalInt_767_ = argument_258_;
		    int anLocalInt_768_ = argument_259_;
		    if (anLocalInt_768_ == 0) {
			if (anLocalInt_767_ == 1)
			    anLocalInts_766_[anLocalInt_765_]
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_764_] & 0xff]);
			else if (anLocalInt_767_ == 0) {
			    int anLocalInt_769_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_764_] & 0xff]);
			    int anLocalInt_770_
				= (((anLocalInt_769_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_771_ = (((anLocalInt_769_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
			    int anLocalInt_772_ = (((anLocalInt_769_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
			    anLocalInts_766_[anLocalInt_765_]
				= (anLocalInt_770_ | anLocalInt_771_
				   | anLocalInt_772_) >>> 8;
			} else if (anLocalInt_767_ == 3) {
			    int anLocalInt_773_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_764_] & 0xff]);
			    int anLocalInt_774_ = Class368_Sub2.anInt5693;
			    int anLocalInt_775_
				= anLocalInt_773_ + anLocalInt_774_;
			    int anLocalInt_776_
				= ((anLocalInt_773_ & 0xff00ff)
				   + (anLocalInt_774_ & 0xff00ff));
			    int anLocalInt_777_
				= ((anLocalInt_776_ & 0x1000100)
				   + (anLocalInt_775_ - anLocalInt_776_
				      & 0x10000));
			    anLocalInts_766_[anLocalInt_765_]
				= (anLocalInt_775_ - anLocalInt_777_
				   | anLocalInt_777_ - (anLocalInt_777_
							>>> 8));
			} else if (anLocalInt_767_ == 2) {
			    int anLocalInt_778_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_764_] & 0xff]);
			    int anLocalInt_779_
				= (((anLocalInt_778_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_780_ = (((anLocalInt_778_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   & 0xff0000);
			    anLocalInts_766_[anLocalInt_765_]
				= (((anLocalInt_779_ | anLocalInt_780_) >>> 8)
				   + Class368_Sub2.anInt5697);
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_768_ == 1) {
			if (anLocalInt_767_ == 1) {
			    int anLocalInt_781_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_781_ != 0)
				anLocalInts_766_[anLocalInt_765_]
				    = anIntArray6633[anLocalInt_781_ & 0xff];
			} else if (anLocalInt_767_ == 0) {
			    int anLocalInt_782_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_782_ != 0) {
				int anLocalInt_783_
				    = anIntArray6633[anLocalInt_782_ & 0xff];
				if ((Class368_Sub2.anInt5693 & 0xffffff)
				    == 16777215) {
				    int anLocalInt_784_
					= Class368_Sub2.anInt5693 >>> 24;
				    int anLocalInt_785_
					= 256 - anLocalInt_784_;
				    int anLocalInt_786_
					= anLocalInts_766_[anLocalInt_765_];
				    anLocalInts_766_[anLocalInt_765_]
					= (((((anLocalInt_783_ & 0xff00ff)
					      * anLocalInt_784_)
					     + ((anLocalInt_786_ & 0xff00ff)
						* anLocalInt_785_))
					    & ~0xff00ff)
					   + ((((anLocalInt_783_ & 0xff00)
						* anLocalInt_784_)
					       + ((anLocalInt_786_ & 0xff00)
						  * anLocalInt_785_))
					      & 0xff0000)) >> 8;
				} else if (Class368_Sub2.anInt5695 != 255) {
				    int anLocalInt_787_
					= (((anLocalInt_783_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_788_
					= (((anLocalInt_783_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_789_
					= (((anLocalInt_783_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_783_
					= (anLocalInt_787_ | anLocalInt_788_
					   | anLocalInt_789_) >>> 8;
				    int anLocalInt_790_
					= anLocalInts_766_[anLocalInt_765_];
				    anLocalInts_766_[anLocalInt_765_]
					= (((((anLocalInt_783_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_790_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_783_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_790_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_791_
					= (((anLocalInt_783_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_792_
					= (((anLocalInt_783_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_793_
					= (((anLocalInt_783_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_766_[anLocalInt_765_]
					= (anLocalInt_791_ | anLocalInt_792_
					   | anLocalInt_793_) >>> 8;
				}
			    }
			} else if (anLocalInt_767_ == 3) {
			    byte anLocalInt_794_
				= aByteArray6634[anLocalInt_764_];
			    int anLocalInt_795_
				= (anLocalInt_794_ > 0
				   ? anIntArray6633[anLocalInt_794_] : 0);
			    int anLocalInt_796_ = Class368_Sub2.anInt5693;
			    int anLocalInt_797_
				= anLocalInt_795_ + anLocalInt_796_;
			    int anLocalInt_798_
				= ((anLocalInt_795_ & 0xff00ff)
				   + (anLocalInt_796_ & 0xff00ff));
			    int anLocalInt_799_
				= ((anLocalInt_798_ & 0x1000100)
				   + (anLocalInt_797_ - anLocalInt_798_
				      & 0x10000));
			    anLocalInt_799_
				= (anLocalInt_797_ - anLocalInt_799_
				   | anLocalInt_799_ - (anLocalInt_799_
							>>> 8));
			    if (anLocalInt_795_ == 0
				&& Class368_Sub2.anInt5695 != 255) {
				anLocalInt_795_ = anLocalInt_799_;
				anLocalInt_799_
				    = anLocalInts_766_[anLocalInt_765_];
				anLocalInt_799_
				    = (((((anLocalInt_795_ & 0xff00ff)
					  * Class368_Sub2.anInt5695)
					 + ((anLocalInt_799_ & 0xff00ff)
					    * Class368_Sub2.anInt5711))
					& ~0xff00ff)
				       + ((((anLocalInt_795_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   + ((anLocalInt_799_ & 0xff00)
					      * Class368_Sub2.anInt5711))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_766_[anLocalInt_765_]
				= anLocalInt_799_;
			} else if (anLocalInt_767_ == 2) {
			    int anLocalInt_800_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_800_ != 0) {
				int anLocalInt_801_
				    = anIntArray6633[anLocalInt_800_ & 0xff];
				int anLocalInt_802_
				    = (((anLocalInt_801_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_803_
				    = (((anLocalInt_801_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_766_[anLocalInt_765_++]
				    = ((anLocalInt_802_ | anLocalInt_803_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_768_ == 2) {
			if (anLocalInt_767_ == 1) {
			    int anLocalInt_804_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_804_ != 0) {
				int anLocalInt_805_
				    = anIntArray6633[anLocalInt_804_ & 0xff];
				int anLocalInt_806_
				    = anLocalInts_766_[anLocalInt_765_];
				int anLocalInt_807_
				    = anLocalInt_805_ + anLocalInt_806_;
				int anLocalInt_808_
				    = ((anLocalInt_805_ & 0xff00ff)
				       + (anLocalInt_806_ & 0xff00ff));
				anLocalInt_806_
				    = ((anLocalInt_808_ & 0x1000100)
				       + (anLocalInt_807_ - anLocalInt_808_
					  & 0x10000));
				anLocalInts_766_[anLocalInt_765_]
				    = (anLocalInt_807_ - anLocalInt_806_
				       | anLocalInt_806_ - (anLocalInt_806_
							    >>> 8));
			    }
			} else if (anLocalInt_767_ == 0) {
			    int anLocalInt_809_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_809_ != 0) {
				int anLocalInt_810_
				    = anIntArray6633[anLocalInt_809_ & 0xff];
				int anLocalInt_811_
				    = (((anLocalInt_810_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_812_
				    = (((anLocalInt_810_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_813_
				    = (((anLocalInt_810_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_810_
				    = (anLocalInt_811_ | anLocalInt_812_
				       | anLocalInt_813_) >>> 8;
				int anLocalInt_814_
				    = anLocalInts_766_[anLocalInt_765_];
				int anLocalInt_815_
				    = anLocalInt_810_ + anLocalInt_814_;
				int anLocalInt_816_
				    = ((anLocalInt_810_ & 0xff00ff)
				       + (anLocalInt_814_ & 0xff00ff));
				anLocalInt_814_
				    = ((anLocalInt_816_ & 0x1000100)
				       + (anLocalInt_815_ - anLocalInt_816_
					  & 0x10000));
				anLocalInts_766_[anLocalInt_765_]
				    = (anLocalInt_815_ - anLocalInt_814_
				       | anLocalInt_814_ - (anLocalInt_814_
							    >>> 8));
			    }
			} else if (anLocalInt_767_ == 3) {
			    byte anLocalInt_817_
				= aByteArray6634[anLocalInt_764_];
			    int anLocalInt_818_
				= (anLocalInt_817_ > 0
				   ? anIntArray6633[anLocalInt_817_] : 0);
			    int anLocalInt_819_ = Class368_Sub2.anInt5693;
			    int anLocalInt_820_
				= anLocalInt_818_ + anLocalInt_819_;
			    int anLocalInt_821_
				= ((anLocalInt_818_ & 0xff00ff)
				   + (anLocalInt_819_ & 0xff00ff));
			    int anLocalInt_822_
				= ((anLocalInt_821_ & 0x1000100)
				   + (anLocalInt_820_ - anLocalInt_821_
				      & 0x10000));
			    anLocalInt_822_
				= (anLocalInt_820_ - anLocalInt_822_
				   | anLocalInt_822_ - (anLocalInt_822_
							>>> 8));
			    if (anLocalInt_818_ == 0
				&& Class368_Sub2.anInt5695 != 255) {
				anLocalInt_818_ = anLocalInt_822_;
				anLocalInt_822_
				    = anLocalInts_766_[anLocalInt_765_];
				anLocalInt_822_
				    = (((((anLocalInt_818_ & 0xff00ff)
					  * Class368_Sub2.anInt5695)
					 + ((anLocalInt_822_ & 0xff00ff)
					    * Class368_Sub2.anInt5711))
					& ~0xff00ff)
				       + ((((anLocalInt_818_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   + ((anLocalInt_822_ & 0xff00)
					      * Class368_Sub2.anInt5711))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_766_[anLocalInt_765_]
				= anLocalInt_822_;
			} else if (anLocalInt_767_ == 2) {
			    int anLocalInt_823_
				= aByteArray6634[anLocalInt_764_];
			    if (anLocalInt_823_ != 0) {
				int anLocalInt_824_
				    = anIntArray6633[anLocalInt_823_ & 0xff];
				int anLocalInt_825_
				    = (((anLocalInt_824_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_826_
				    = (((anLocalInt_824_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_824_
				    = ((anLocalInt_825_ | anLocalInt_826_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_827_
				    = anLocalInts_766_[anLocalInt_765_];
				int anLocalInt_828_
				    = anLocalInt_824_ + anLocalInt_827_;
				int anLocalInt_829_
				    = ((anLocalInt_824_ & 0xff00ff)
				       + (anLocalInt_827_ & 0xff00ff));
				anLocalInt_827_
				    = ((anLocalInt_829_ & 0x1000100)
				       + (anLocalInt_828_ - anLocalInt_829_
					  & 0x10000));
				anLocalInts_766_[anLocalInt_765_]
				    = (anLocalInt_828_ - anLocalInt_827_
				       | anLocalInt_827_ - (anLocalInt_827_
							    >>> 8));
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    anLocalInt_759_ += Class368_Sub2.anInt5717;
		    anLocalInt_760_ += Class368_Sub2.anInt5712;
		}
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	} else {
	    for (int anLocalInt = Class368_Sub2.anInt5700; anLocalInt < 0;
		 anLocalInt++) {
		int anLocalInt_830_ = Class368_Sub2.anInt5724;
		int anLocalInt_831_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_832_
		    = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		int anLocalInt_833_ = Class368_Sub2.anInt5713;
		if (anLocalInt_831_ < 0) {
		    int anLocalInt_834_
			= ((Class368_Sub2.anInt5717 - 1 - anLocalInt_831_)
			   / Class368_Sub2.anInt5717);
		    anLocalInt_833_ += anLocalInt_834_;
		    anLocalInt_831_
			+= Class368_Sub2.anInt5717 * anLocalInt_834_;
		    anLocalInt_832_
			+= Class368_Sub2.anInt5712 * anLocalInt_834_;
		    anLocalInt_830_ += anLocalInt_834_;
		}
		int anLocalInt_835_;
		if ((anLocalInt_835_
		     = (anLocalInt_831_ + 1
			- (((Class368_Sub2) this).width << 12)
			- Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)
		    > anLocalInt_833_)
		    anLocalInt_833_ = anLocalInt_835_;
		if (anLocalInt_832_ < 0) {
		    anLocalInt_835_
			= ((Class368_Sub2.anInt5712 - 1 - anLocalInt_832_)
			   / Class368_Sub2.anInt5712);
		    anLocalInt_833_ += anLocalInt_835_;
		    anLocalInt_831_
			+= Class368_Sub2.anInt5717 * anLocalInt_835_;
		    anLocalInt_832_
			+= Class368_Sub2.anInt5712 * anLocalInt_835_;
		    anLocalInt_830_ += anLocalInt_835_;
		}
		if ((anLocalInt_835_
		     = (anLocalInt_832_ + 1
			- (((Class368_Sub2) this).height << 12)
			- Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)
		    > anLocalInt_833_)
		    anLocalInt_833_ = anLocalInt_835_;
		for (/**/; anLocalInt_833_ < 0; anLocalInt_833_++) {
		    int anLocalInt_836_ = (((anLocalInt_832_ >> 12)
					    * ((Class368_Sub2) this).width)
					   + (anLocalInt_831_ >> 12));
		    int anLocalInt_837_ = anLocalInt_830_++;
		    int[] anLocalInts_838_ = anLocalInts;
		    int anLocalInt_839_ = argument_258_;
		    int anLocalInt_840_ = argument_259_;
		    if (anLocalInt_840_ == 0) {
			if (anLocalInt_839_ == 1)
			    anLocalInts_838_[anLocalInt_837_]
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_836_] & 0xff]);
			else if (anLocalInt_839_ == 0) {
			    int anLocalInt_841_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_836_] & 0xff]);
			    int anLocalInt_842_
				= (((anLocalInt_841_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_843_ = (((anLocalInt_841_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
			    int anLocalInt_844_ = (((anLocalInt_841_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
			    anLocalInts_838_[anLocalInt_837_]
				= (anLocalInt_842_ | anLocalInt_843_
				   | anLocalInt_844_) >>> 8;
			} else if (anLocalInt_839_ == 3) {
			    int anLocalInt_845_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_836_] & 0xff]);
			    int anLocalInt_846_ = Class368_Sub2.anInt5693;
			    int anLocalInt_847_
				= anLocalInt_845_ + anLocalInt_846_;
			    int anLocalInt_848_
				= ((anLocalInt_845_ & 0xff00ff)
				   + (anLocalInt_846_ & 0xff00ff));
			    int anLocalInt_849_
				= ((anLocalInt_848_ & 0x1000100)
				   + (anLocalInt_847_ - anLocalInt_848_
				      & 0x10000));
			    anLocalInts_838_[anLocalInt_837_]
				= (anLocalInt_847_ - anLocalInt_849_
				   | anLocalInt_849_ - (anLocalInt_849_
							>>> 8));
			} else if (anLocalInt_839_ == 2) {
			    int anLocalInt_850_
				= (anIntArray6633
				   [aByteArray6634[anLocalInt_836_] & 0xff]);
			    int anLocalInt_851_
				= (((anLocalInt_850_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_852_ = (((anLocalInt_850_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   & 0xff0000);
			    anLocalInts_838_[anLocalInt_837_]
				= (((anLocalInt_851_ | anLocalInt_852_) >>> 8)
				   + Class368_Sub2.anInt5697);
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_840_ == 1) {
			if (anLocalInt_839_ == 1) {
			    int anLocalInt_853_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_853_ != 0)
				anLocalInts_838_[anLocalInt_837_]
				    = anIntArray6633[anLocalInt_853_ & 0xff];
			} else if (anLocalInt_839_ == 0) {
			    int anLocalInt_854_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_854_ != 0) {
				int anLocalInt_855_
				    = anIntArray6633[anLocalInt_854_ & 0xff];
				if ((Class368_Sub2.anInt5693 & 0xffffff)
				    == 16777215) {
				    int anLocalInt_856_
					= Class368_Sub2.anInt5693 >>> 24;
				    int anLocalInt_857_
					= 256 - anLocalInt_856_;
				    int anLocalInt_858_
					= anLocalInts_838_[anLocalInt_837_];
				    anLocalInts_838_[anLocalInt_837_]
					= (((((anLocalInt_855_ & 0xff00ff)
					      * anLocalInt_856_)
					     + ((anLocalInt_858_ & 0xff00ff)
						* anLocalInt_857_))
					    & ~0xff00ff)
					   + ((((anLocalInt_855_ & 0xff00)
						* anLocalInt_856_)
					       + ((anLocalInt_858_ & 0xff00)
						  * anLocalInt_857_))
					      & 0xff0000)) >> 8;
				} else if (Class368_Sub2.anInt5695 != 255) {
				    int anLocalInt_859_
					= (((anLocalInt_855_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_860_
					= (((anLocalInt_855_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_861_
					= (((anLocalInt_855_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_855_
					= (anLocalInt_859_ | anLocalInt_860_
					   | anLocalInt_861_) >>> 8;
				    int anLocalInt_862_
					= anLocalInts_838_[anLocalInt_837_];
				    anLocalInts_838_[anLocalInt_837_]
					= (((((anLocalInt_855_ & 0xff00ff)
					      * Class368_Sub2.anInt5695)
					     + ((anLocalInt_862_ & 0xff00ff)
						* Class368_Sub2.anInt5711))
					    & ~0xff00ff)
					   + ((((anLocalInt_855_ & 0xff00)
						* Class368_Sub2.anInt5695)
					       + ((anLocalInt_862_ & 0xff00)
						  * Class368_Sub2.anInt5711))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_863_
					= (((anLocalInt_855_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_864_
					= (((anLocalInt_855_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_865_
					= (((anLocalInt_855_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_838_[anLocalInt_837_]
					= (anLocalInt_863_ | anLocalInt_864_
					   | anLocalInt_865_) >>> 8;
				}
			    }
			} else if (anLocalInt_839_ == 3) {
			    byte anLocalInt_866_
				= aByteArray6634[anLocalInt_836_];
			    int anLocalInt_867_
				= (anLocalInt_866_ > 0
				   ? anIntArray6633[anLocalInt_866_] : 0);
			    int anLocalInt_868_ = Class368_Sub2.anInt5693;
			    int anLocalInt_869_
				= anLocalInt_867_ + anLocalInt_868_;
			    int anLocalInt_870_
				= ((anLocalInt_867_ & 0xff00ff)
				   + (anLocalInt_868_ & 0xff00ff));
			    int anLocalInt_871_
				= ((anLocalInt_870_ & 0x1000100)
				   + (anLocalInt_869_ - anLocalInt_870_
				      & 0x10000));
			    anLocalInt_871_
				= (anLocalInt_869_ - anLocalInt_871_
				   | anLocalInt_871_ - (anLocalInt_871_
							>>> 8));
			    if (anLocalInt_867_ == 0
				&& Class368_Sub2.anInt5695 != 255) {
				anLocalInt_867_ = anLocalInt_871_;
				anLocalInt_871_
				    = anLocalInts_838_[anLocalInt_837_];
				anLocalInt_871_
				    = (((((anLocalInt_867_ & 0xff00ff)
					  * Class368_Sub2.anInt5695)
					 + ((anLocalInt_871_ & 0xff00ff)
					    * Class368_Sub2.anInt5711))
					& ~0xff00ff)
				       + ((((anLocalInt_867_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   + ((anLocalInt_871_ & 0xff00)
					      * Class368_Sub2.anInt5711))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_838_[anLocalInt_837_]
				= anLocalInt_871_;
			} else if (anLocalInt_839_ == 2) {
			    int anLocalInt_872_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_872_ != 0) {
				int anLocalInt_873_
				    = anIntArray6633[anLocalInt_872_ & 0xff];
				int anLocalInt_874_
				    = (((anLocalInt_873_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_875_
				    = (((anLocalInt_873_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_838_[anLocalInt_837_++]
				    = ((anLocalInt_874_ | anLocalInt_875_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    }
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_840_ == 2) {
			if (anLocalInt_839_ == 1) {
			    int anLocalInt_876_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_876_ != 0) {
				int anLocalInt_877_
				    = anIntArray6633[anLocalInt_876_ & 0xff];
				int anLocalInt_878_
				    = anLocalInts_838_[anLocalInt_837_];
				int anLocalInt_879_
				    = anLocalInt_877_ + anLocalInt_878_;
				int anLocalInt_880_
				    = ((anLocalInt_877_ & 0xff00ff)
				       + (anLocalInt_878_ & 0xff00ff));
				anLocalInt_878_
				    = ((anLocalInt_880_ & 0x1000100)
				       + (anLocalInt_879_ - anLocalInt_880_
					  & 0x10000));
				anLocalInts_838_[anLocalInt_837_]
				    = (anLocalInt_879_ - anLocalInt_878_
				       | anLocalInt_878_ - (anLocalInt_878_
							    >>> 8));
			    }
			} else if (anLocalInt_839_ == 0) {
			    int anLocalInt_881_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_881_ != 0) {
				int anLocalInt_882_
				    = anIntArray6633[anLocalInt_881_ & 0xff];
				int anLocalInt_883_
				    = (((anLocalInt_882_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_884_
				    = (((anLocalInt_882_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_885_
				    = (((anLocalInt_882_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_882_
				    = (anLocalInt_883_ | anLocalInt_884_
				       | anLocalInt_885_) >>> 8;
				int anLocalInt_886_
				    = anLocalInts_838_[anLocalInt_837_];
				int anLocalInt_887_
				    = anLocalInt_882_ + anLocalInt_886_;
				int anLocalInt_888_
				    = ((anLocalInt_882_ & 0xff00ff)
				       + (anLocalInt_886_ & 0xff00ff));
				anLocalInt_886_
				    = ((anLocalInt_888_ & 0x1000100)
				       + (anLocalInt_887_ - anLocalInt_888_
					  & 0x10000));
				anLocalInts_838_[anLocalInt_837_]
				    = (anLocalInt_887_ - anLocalInt_886_
				       | anLocalInt_886_ - (anLocalInt_886_
							    >>> 8));
			    }
			} else if (anLocalInt_839_ == 3) {
			    byte anLocalInt_889_
				= aByteArray6634[anLocalInt_836_];
			    int anLocalInt_890_
				= (anLocalInt_889_ > 0
				   ? anIntArray6633[anLocalInt_889_] : 0);
			    int anLocalInt_891_ = Class368_Sub2.anInt5693;
			    int anLocalInt_892_
				= anLocalInt_890_ + anLocalInt_891_;
			    int anLocalInt_893_
				= ((anLocalInt_890_ & 0xff00ff)
				   + (anLocalInt_891_ & 0xff00ff));
			    int anLocalInt_894_
				= ((anLocalInt_893_ & 0x1000100)
				   + (anLocalInt_892_ - anLocalInt_893_
				      & 0x10000));
			    anLocalInt_894_
				= (anLocalInt_892_ - anLocalInt_894_
				   | anLocalInt_894_ - (anLocalInt_894_
							>>> 8));
			    if (anLocalInt_890_ == 0
				&& Class368_Sub2.anInt5695 != 255) {
				anLocalInt_890_ = anLocalInt_894_;
				anLocalInt_894_
				    = anLocalInts_838_[anLocalInt_837_];
				anLocalInt_894_
				    = (((((anLocalInt_890_ & 0xff00ff)
					  * Class368_Sub2.anInt5695)
					 + ((anLocalInt_894_ & 0xff00ff)
					    * Class368_Sub2.anInt5711))
					& ~0xff00ff)
				       + ((((anLocalInt_890_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   + ((anLocalInt_894_ & 0xff00)
					      * Class368_Sub2.anInt5711))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_838_[anLocalInt_837_]
				= anLocalInt_894_;
			} else if (anLocalInt_839_ == 2) {
			    int anLocalInt_895_
				= aByteArray6634[anLocalInt_836_];
			    if (anLocalInt_895_ != 0) {
				int anLocalInt_896_
				    = anIntArray6633[anLocalInt_895_ & 0xff];
				int anLocalInt_897_
				    = (((anLocalInt_896_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_898_
				    = (((anLocalInt_896_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_896_
				    = ((anLocalInt_897_ | anLocalInt_898_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_899_
				    = anLocalInts_838_[anLocalInt_837_];
				int anLocalInt_900_
				    = anLocalInt_896_ + anLocalInt_899_;
				int anLocalInt_901_
				    = ((anLocalInt_896_ & 0xff00ff)
				       + (anLocalInt_899_ & 0xff00ff));
				anLocalInt_899_
				    = ((anLocalInt_901_ & 0x1000100)
				       + (anLocalInt_900_ - anLocalInt_901_
					  & 0x10000));
				anLocalInts_838_[anLocalInt_837_]
				    = (anLocalInt_900_ - anLocalInt_899_
				       | anLocalInt_899_ - (anLocalInt_899_
							    >>> 8));
			    }
			}
		    } else
			throw new IllegalArgumentException();
		    anLocalInt_831_ += Class368_Sub2.anInt5717;
		    anLocalInt_832_ += Class368_Sub2.anInt5712;
		}
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	}
    }
    
    final void method4007(int argument_902_, int argument_903_,
			  Class_aa argument_904_, int argument_905_,
			  int argument_906_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	argument_902_ += ((Class368_Sub2) this).anInt5698;
	argument_903_ += ((Class368_Sub2) this).anInt5719;
	int anLocalInt = 0;
	int anLocalInt_907_
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .width);
	int anLocalInt_908_ = ((Class368_Sub2) this).width;
	int anLocalInt_909_ = ((Class368_Sub2) this).height;
	int anLocalInt_910_ = anLocalInt_907_ - anLocalInt_908_;
	int anLocalInt_911_ = 0;
	int anLocalInt_912_ = argument_902_ + argument_903_ * anLocalInt_907_;
	if (argument_903_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipTop)) {
	    int anLocalInt_913_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop) - argument_903_;
	    anLocalInt_909_ -= anLocalInt_913_;
	    argument_903_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop);
	    anLocalInt += anLocalInt_913_ * anLocalInt_908_;
	    anLocalInt_912_ += anLocalInt_913_ * anLocalInt_907_;
	}
	if (argument_903_ + anLocalInt_909_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipBottom))
	    anLocalInt_909_
		-= (argument_903_ + anLocalInt_909_
		    - ((JavaToolkit)
		       ((Class368_Sub2) this).toolkit).clipBottom);
	if (argument_902_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipLeft)) {
	    int anLocalInt_914_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft) - argument_902_;
	    anLocalInt_908_ -= anLocalInt_914_;
	    argument_902_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft);
	    anLocalInt += anLocalInt_914_;
	    anLocalInt_912_ += anLocalInt_914_;
	    anLocalInt_911_ += anLocalInt_914_;
	    anLocalInt_910_ += anLocalInt_914_;
	}
	if (argument_902_ + anLocalInt_908_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipRight)) {
	    int anLocalInt_915_
		= (argument_902_ + anLocalInt_908_
		   - ((JavaToolkit)
		      ((Class368_Sub2) this).toolkit).clipRight);
	    anLocalInt_908_ -= anLocalInt_915_;
	    anLocalInt_911_ += anLocalInt_915_;
	    anLocalInt_910_ += anLocalInt_915_;
	}
	if (anLocalInt_908_ > 0 && anLocalInt_909_ > 0) {
	    Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_904_;
	    int[] anLocalInts = ((Class_aa_Sub3) class_aa_sub3).anIntArray3757;
	    int[] anLocalInts_916_
		= ((Class_aa_Sub3) class_aa_sub3).anIntArray3755;
	    int[] anLocalInts_917_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    int anLocalInt_918_ = argument_903_;
	    if (argument_906_ > anLocalInt_918_) {
		anLocalInt_918_ = argument_906_;
		anLocalInt_912_
		    += (argument_906_ - argument_903_) * anLocalInt_907_;
		anLocalInt += ((argument_906_ - argument_903_)
			       * ((Class368_Sub2) this).width);
	    }
	    int anLocalInt_919_ = ((argument_906_ + anLocalInts.length
				    < argument_903_ + anLocalInt_909_)
				   ? argument_906_ + anLocalInts.length
				   : argument_903_ + anLocalInt_909_);
	    for (int anLocalInt_920_ = anLocalInt_918_;
		 anLocalInt_920_ < anLocalInt_919_; anLocalInt_920_++) {
		int anLocalInt_921_
		    = (anLocalInts[anLocalInt_920_ - argument_906_]
		       + argument_905_);
		int anLocalInt_922_
		    = anLocalInts_916_[anLocalInt_920_ - argument_906_];
		int anLocalInt_923_ = anLocalInt_908_;
		if (argument_902_ > anLocalInt_921_) {
		    int anLocalInt_924_ = argument_902_ - anLocalInt_921_;
		    if (anLocalInt_924_ >= anLocalInt_922_) {
			anLocalInt += anLocalInt_908_ + anLocalInt_911_;
			anLocalInt_912_ += anLocalInt_908_ + anLocalInt_910_;
			continue;
		    }
		    anLocalInt_922_ -= anLocalInt_924_;
		} else {
		    int anLocalInt_925_ = anLocalInt_921_ - argument_902_;
		    if (anLocalInt_925_ >= anLocalInt_908_) {
			anLocalInt += anLocalInt_908_ + anLocalInt_911_;
			anLocalInt_912_ += anLocalInt_908_ + anLocalInt_910_;
			continue;
		    }
		    anLocalInt += anLocalInt_925_;
		    anLocalInt_923_ -= anLocalInt_925_;
		    anLocalInt_912_ += anLocalInt_925_;
		}
		int anLocalInt_926_ = 0;
		if (anLocalInt_923_ < anLocalInt_922_)
		    anLocalInt_922_ = anLocalInt_923_;
		else
		    anLocalInt_926_ = anLocalInt_923_ - anLocalInt_922_;
		for (int anLocalInt_927_ = -anLocalInt_922_;
		     anLocalInt_927_ < 0; anLocalInt_927_++) {
		    int anLocalInt_928_ = aByteArray6634[anLocalInt++];
		    if (anLocalInt_928_ != 0)
			anLocalInts_917_[anLocalInt_912_++]
			    = anIntArray6633[anLocalInt_928_ & 0xff];
		    else
			anLocalInt_912_++;
		}
		anLocalInt += anLocalInt_926_ + anLocalInt_911_;
		anLocalInt_912_ += anLocalInt_926_ + anLocalInt_910_;
	    }
	}
    }
    
    final void method4032
	(int argument_929_, int argument_930_, int argument_931_,
	 int argument_932_, int argument_933_, int argument_934_,
	 int argument_935_, int argument_936_, int argument_937_) {
	if (argument_932_ > 0 && argument_933_ > 0) {
	    int anLocalInt = 0;
	    int anLocalInt_938_ = 0;
	    int anLocalInt_939_ = (((Class368_Sub2) this).anInt5698
				   + ((Class368_Sub2) this).width
				   + ((Class368_Sub2) this).anInt5715);
	    int anLocalInt_940_ = (((Class368_Sub2) this).anInt5719
				   + ((Class368_Sub2) this).height
				   + ((Class368_Sub2) this).anInt5708);
	    int anLocalInt_941_ = (anLocalInt_939_ << 16) / argument_932_;
	    int anLocalInt_942_ = (anLocalInt_940_ << 16) / argument_933_;
	    if (((Class368_Sub2) this).anInt5698 > 0) {
		int anLocalInt_943_
		    = (((((Class368_Sub2) this).anInt5698 << 16)
			+ anLocalInt_941_ - 1)
		       / anLocalInt_941_);
		argument_929_ += anLocalInt_943_;
		anLocalInt += (anLocalInt_943_ * anLocalInt_941_
			       - (((Class368_Sub2) this).anInt5698 << 16));
	    }
	    if (((Class368_Sub2) this).anInt5719 > 0) {
		int anLocalInt_944_
		    = (((((Class368_Sub2) this).anInt5719 << 16)
			+ anLocalInt_942_ - 1)
		       / anLocalInt_942_);
		argument_930_ += anLocalInt_944_;
		anLocalInt_938_
		    += (anLocalInt_944_ * anLocalInt_942_
			- (((Class368_Sub2) this).anInt5719 << 16));
	    }
	    if (((Class368_Sub2) this).width < anLocalInt_939_)
		argument_932_
		    = ((((Class368_Sub2) this).width << 16) - anLocalInt
		       + anLocalInt_941_ - 1) / anLocalInt_941_;
	    if (((Class368_Sub2) this).height < anLocalInt_940_)
		argument_933_ = (((((Class368_Sub2) this).height << 16)
				  - anLocalInt_938_ + anLocalInt_942_ - 1)
				 / anLocalInt_942_);
	    int anLocalInt_945_
		= (argument_929_
		   + argument_930_ * (((JavaToolkit) (((Class368_Sub2) this)
							.toolkit))
				      .width));
	    int anLocalInt_946_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .width) - argument_932_;
	    if (argument_930_ + argument_933_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipBottom))
		argument_933_
		    -= (argument_930_ + argument_933_
			- ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).clipBottom);
	    if (argument_930_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop)) {
		int anLocalInt_947_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipTop
		       - argument_930_);
		argument_933_ -= anLocalInt_947_;
		anLocalInt_945_
		    += (anLocalInt_947_
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width);
		anLocalInt_938_ += anLocalInt_942_ * anLocalInt_947_;
	    }
	    if (argument_929_ + argument_932_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipRight)) {
		int anLocalInt_948_
		    = (argument_929_ + argument_932_
		       - ((JavaToolkit) (((Class368_Sub2) this)
					   .toolkit)).clipRight);
		argument_932_ -= anLocalInt_948_;
		anLocalInt_946_ += anLocalInt_948_;
	    }
	    if (argument_929_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft)) {
		int anLocalInt_949_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipLeft
		       - argument_929_);
		argument_932_ -= anLocalInt_949_;
		anLocalInt_945_ += anLocalInt_949_;
		anLocalInt += anLocalInt_941_ * anLocalInt_949_;
		anLocalInt_946_ += anLocalInt_949_;
	    }
	    float[] fs
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .aFloatArray4667);
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_936_ == 0) {
		if (argument_934_ == 1) {
		    int anLocalInt_950_ = anLocalInt;
		    for (int anLocalInt_951_ = -argument_933_;
			 anLocalInt_951_ < 0; anLocalInt_951_++) {
			int anLocalInt_952_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_953_ = -argument_932_;
			     anLocalInt_953_ < 0; anLocalInt_953_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				anLocalInts[anLocalInt_945_]
				    = (anIntArray6633
				       [(aByteArray6634[((anLocalInt >> 16)
							 + anLocalInt_952_)]
					 & 0xff)]);
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_950_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 0) {
		    int anLocalInt_954_ = (argument_935_ & 0xff0000) >> 16;
		    int anLocalInt_955_ = (argument_935_ & 0xff00) >> 8;
		    int anLocalInt_956_ = argument_935_ & 0xff;
		    int anLocalInt_957_ = anLocalInt;
		    for (int anLocalInt_958_ = -argument_933_;
			 anLocalInt_958_ < 0; anLocalInt_958_++) {
			int anLocalInt_959_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_960_ = -argument_932_;
			     anLocalInt_960_ < 0; anLocalInt_960_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_961_
				    = (anIntArray6633
				       [(aByteArray6634[((anLocalInt >> 16)
							 + anLocalInt_959_)]
					 & 0xff)]);
				int anLocalInt_962_
				    = (((anLocalInt_961_ & 0xff0000)
					* anLocalInt_954_)
				       & ~0xffffff);
				int anLocalInt_963_
				    = (((anLocalInt_961_ & 0xff00)
					* anLocalInt_955_)
				       & 0xff0000);
				int anLocalInt_964_
				    = (((anLocalInt_961_ & 0xff)
					* anLocalInt_956_)
				       & 0xff00);
				anLocalInts[anLocalInt_945_]
				    = (anLocalInt_962_ | anLocalInt_963_
				       | anLocalInt_964_) >>> 8;
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_957_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 3) {
		    int anLocalInt_965_ = anLocalInt;
		    for (int anLocalInt_966_ = -argument_933_;
			 anLocalInt_966_ < 0; anLocalInt_966_++) {
			int anLocalInt_967_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_968_ = -argument_932_;
			     anLocalInt_968_ < 0; anLocalInt_968_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				byte anLocalInt_969_
				    = (aByteArray6634
				       [(anLocalInt >> 16) + anLocalInt_967_]);
				int anLocalInt_970_
				    = (anLocalInt_969_ > 0
				       ? anIntArray6633[anLocalInt_969_] : 0);
				int anLocalInt_971_
				    = anLocalInt_970_ + argument_935_;
				int anLocalInt_972_
				    = ((anLocalInt_970_ & 0xff00ff)
				       + (argument_935_ & 0xff00ff));
				int anLocalInt_973_
				    = ((anLocalInt_972_ & 0x1000100)
				       + (anLocalInt_971_ - anLocalInt_972_
					  & 0x10000));
				anLocalInts[anLocalInt_945_]
				    = (anLocalInt_971_ - anLocalInt_973_
				       | anLocalInt_973_ - (anLocalInt_973_
							    >>> 8));
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_965_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 2) {
		    int anLocalInt_974_ = argument_935_ >>> 24;
		    int anLocalInt_975_ = 256 - anLocalInt_974_;
		    int anLocalInt_976_
			= ((argument_935_ & 0xff00ff) * anLocalInt_975_
			   & ~0xff00ff);
		    int anLocalInt_977_
			= ((argument_935_ & 0xff00) * anLocalInt_975_
			   & 0xff0000);
		    argument_935_ = (anLocalInt_976_ | anLocalInt_977_) >>> 8;
		    int anLocalInt_978_ = anLocalInt;
		    for (int anLocalInt_979_ = -argument_933_;
			 anLocalInt_979_ < 0; anLocalInt_979_++) {
			int anLocalInt_980_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_981_ = -argument_932_;
			     anLocalInt_981_ < 0; anLocalInt_981_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_982_
				    = (anIntArray6633
				       [(aByteArray6634[((anLocalInt >> 16)
							 + anLocalInt_980_)]
					 & 0xff)]);
				anLocalInt_976_
				    = ((anLocalInt_982_ & 0xff00ff)
				       * anLocalInt_974_) & ~0xff00ff;
				anLocalInt_977_
				    = ((anLocalInt_982_ & 0xff00)
				       * anLocalInt_974_) & 0xff0000;
				anLocalInts[anLocalInt_945_]
				    = ((anLocalInt_976_ | anLocalInt_977_)
				       >>> 8) + argument_935_;
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_978_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_936_ == 1) {
		if (argument_934_ == 1) {
		    int anLocalInt_983_ = anLocalInt;
		    for (int anLocalInt_984_ = -argument_933_;
			 anLocalInt_984_ < 0; anLocalInt_984_++) {
			int anLocalInt_985_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_986_ = -argument_932_;
			     anLocalInt_986_ < 0; anLocalInt_986_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_987_
				    = (aByteArray6634
				       [(anLocalInt >> 16) + anLocalInt_985_]);
				if (anLocalInt_987_ != 0) {
				    anLocalInts[anLocalInt_945_]
					= (anIntArray6633
					   [anLocalInt_987_ & 0xff]);
				    fs[anLocalInt_945_]
					= (float) argument_931_;
				}
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_983_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 0) {
		    int anLocalInt_988_ = anLocalInt;
		    if ((argument_935_ & 0xffffff) == 16777215) {
			int anLocalInt_989_ = argument_935_ >>> 24;
			int anLocalInt_990_ = 256 - anLocalInt_989_;
			for (int anLocalInt_991_ = -argument_933_;
			     anLocalInt_991_ < 0; anLocalInt_991_++) {
			    int anLocalInt_992_
				= ((anLocalInt_938_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_993_ = -argument_932_;
				 anLocalInt_993_ < 0; anLocalInt_993_++) {
				if ((float) argument_931_
				    < fs[anLocalInt_945_]) {
				    int anLocalInt_994_
					= aByteArray6634[((anLocalInt >> 16)
							  + anLocalInt_992_)];
				    if (anLocalInt_994_ != 0) {
					int anLocalInt_995_
					    = (anIntArray6633
					       [anLocalInt_994_ & 0xff]);
					int anLocalInt_996_
					    = anLocalInts[anLocalInt_945_];
					anLocalInts[anLocalInt_945_]
					    = (((((anLocalInt_995_ & 0xff00ff)
						  * anLocalInt_989_)
						 + ((anLocalInt_996_
						     & 0xff00ff)
						    * anLocalInt_990_))
						& ~0xff00ff)
					       + ((((anLocalInt_995_ & 0xff00)
						    * anLocalInt_989_)
						   + ((anLocalInt_996_
						       & 0xff00)
						      * anLocalInt_990_))
						  & 0xff0000)) >> 8;
					fs[anLocalInt_945_]
					    = (float) argument_931_;
				    }
				}
				anLocalInt += anLocalInt_941_;
				anLocalInt_945_++;
			    }
			    anLocalInt_938_ += anLocalInt_942_;
			    anLocalInt = anLocalInt_988_;
			    anLocalInt_945_ += anLocalInt_946_;
			}
		    } else {
			int anLocalInt_997_ = (argument_935_ & 0xff0000) >> 16;
			int anLocalInt_998_ = (argument_935_ & 0xff00) >> 8;
			int anLocalInt_999_ = argument_935_ & 0xff;
			int anLocalInt_1000_ = argument_935_ >>> 24;
			int anLocalInt_1001_ = 256 - anLocalInt_1000_;
			for (int anLocalInt_1002_ = -argument_933_;
			     anLocalInt_1002_ < 0; anLocalInt_1002_++) {
			    int anLocalInt_1003_
				= ((anLocalInt_938_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_1004_ = -argument_932_;
				 anLocalInt_1004_ < 0; anLocalInt_1004_++) {
				if ((float) argument_931_
				    < fs[anLocalInt_945_]) {
				    int anLocalInt_1005_
					= aByteArray6634[((anLocalInt >> 16)
							  + anLocalInt_1003_)];
				    if (anLocalInt_1005_ != 0) {
					int anLocalInt_1006_
					    = (anIntArray6633
					       [anLocalInt_1005_ & 0xff]);
					if (anLocalInt_1000_ != 255) {
					    int anLocalInt_1007_
						= (((anLocalInt_1006_
						     & 0xff0000)
						    * anLocalInt_997_)
						   & ~0xffffff);
					    int anLocalInt_1008_
						= (((anLocalInt_1006_ & 0xff00)
						    * anLocalInt_998_)
						   & 0xff0000);
					    int anLocalInt_1009_
						= (((anLocalInt_1006_ & 0xff)
						    * anLocalInt_999_)
						   & 0xff00);
					    anLocalInt_1006_
						= (anLocalInt_1007_
						   | anLocalInt_1008_
						   | anLocalInt_1009_) >>> 8;
					    int anLocalInt_1010_
						= anLocalInts[anLocalInt_945_];
					    anLocalInts[anLocalInt_945_]
						= (((((anLocalInt_1006_
						       & 0xff00ff)
						      * anLocalInt_1000_)
						     + ((anLocalInt_1010_
							 & 0xff00ff)
							* anLocalInt_1001_))
						    & ~0xff00ff)
						   + ((((anLocalInt_1006_
							 & 0xff00)
							* anLocalInt_1000_)
						       + ((anLocalInt_1010_
							   & 0xff00)
							  * anLocalInt_1001_))
						      & 0xff0000)) >> 8;
					    fs[anLocalInt_945_]
						= (float) argument_931_;
					} else {
					    int anLocalInt_1011_
						= (((anLocalInt_1006_
						     & 0xff0000)
						    * anLocalInt_997_)
						   & ~0xffffff);
					    int anLocalInt_1012_
						= (((anLocalInt_1006_ & 0xff00)
						    * anLocalInt_998_)
						   & 0xff0000);
					    int anLocalInt_1013_
						= (((anLocalInt_1006_ & 0xff)
						    * anLocalInt_999_)
						   & 0xff00);
					    anLocalInts[anLocalInt_945_]
						= (anLocalInt_1011_
						   | anLocalInt_1012_
						   | anLocalInt_1013_) >>> 8;
					    fs[anLocalInt_945_]
						= (float) argument_931_;
					}
				    }
				}
				anLocalInt += anLocalInt_941_;
				anLocalInt_945_++;
			    }
			    anLocalInt_938_ += anLocalInt_942_;
			    anLocalInt = anLocalInt_988_;
			    anLocalInt_945_ += anLocalInt_946_;
			}
			return;
		    }
		    return;
		}
		if (argument_934_ == 3) {
		    int anLocalInt_1014_ = anLocalInt;
		    int anLocalInt_1015_ = argument_935_ >>> 24;
		    int anLocalInt_1016_ = 256 - anLocalInt_1015_;
		    for (int anLocalInt_1017_ = -argument_933_;
			 anLocalInt_1017_ < 0; anLocalInt_1017_++) {
			int anLocalInt_1018_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1019_ = -argument_932_;
			     anLocalInt_1019_ < 0; anLocalInt_1019_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				byte anLocalInt_1020_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1018_)];
				int anLocalInt_1021_
				    = (anLocalInt_1020_ > 0
				       ? anIntArray6633[anLocalInt_1020_] : 0);
				int anLocalInt_1022_
				    = anLocalInt_1021_ + argument_935_;
				int anLocalInt_1023_
				    = ((anLocalInt_1021_ & 0xff00ff)
				       + (argument_935_ & 0xff00ff));
				int anLocalInt_1024_
				    = ((anLocalInt_1023_ & 0x1000100)
				       + (anLocalInt_1022_ - anLocalInt_1023_
					  & 0x10000));
				anLocalInt_1024_
				    = (anLocalInt_1022_ - anLocalInt_1024_
				       | anLocalInt_1024_ - (anLocalInt_1024_
							     >>> 8));
				if (anLocalInt_1021_ == 0
				    && anLocalInt_1015_ != 255) {
				    anLocalInt_1021_ = anLocalInt_1024_;
				    anLocalInt_1024_
					= anLocalInts[anLocalInt_945_];
				    anLocalInt_1024_
					= (((((anLocalInt_1021_ & 0xff00ff)
					      * anLocalInt_1015_)
					     + ((anLocalInt_1024_ & 0xff00ff)
						* anLocalInt_1016_))
					    & ~0xff00ff)
					   + ((((anLocalInt_1021_ & 0xff00)
						* anLocalInt_1015_)
					       + ((anLocalInt_1024_ & 0xff00)
						  * anLocalInt_1016_))
					      & 0xff0000)) >> 8;
				}
				anLocalInts[anLocalInt_945_]
				    = anLocalInt_1024_;
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1014_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 2) {
		    int anLocalInt_1025_ = argument_935_ >>> 24;
		    int anLocalInt_1026_ = 256 - anLocalInt_1025_;
		    int anLocalInt_1027_
			= ((argument_935_ & 0xff00ff) * anLocalInt_1026_
			   & ~0xff00ff);
		    int anLocalInt_1028_
			= ((argument_935_ & 0xff00) * anLocalInt_1026_
			   & 0xff0000);
		    argument_935_
			= (anLocalInt_1027_ | anLocalInt_1028_) >>> 8;
		    int anLocalInt_1029_ = anLocalInt;
		    for (int anLocalInt_1030_ = -argument_933_;
			 anLocalInt_1030_ < 0; anLocalInt_1030_++) {
			int anLocalInt_1031_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1032_ = -argument_932_;
			     anLocalInt_1032_ < 0; anLocalInt_1032_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_1033_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1031_)];
				if (anLocalInt_1033_ != 0) {
				    int anLocalInt_1034_
					= (anIntArray6633
					   [anLocalInt_1033_ & 0xff]);
				    anLocalInt_1027_
					= ((anLocalInt_1034_ & 0xff00ff)
					   * anLocalInt_1025_) & ~0xff00ff;
				    anLocalInt_1028_
					= ((anLocalInt_1034_ & 0xff00)
					   * anLocalInt_1025_) & 0xff0000;
				    anLocalInts[anLocalInt_945_]
					= ((anLocalInt_1027_
					    | anLocalInt_1028_)
					   >>> 8) + argument_935_;
				    fs[anLocalInt_945_]
					= (float) argument_931_;
				}
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1029_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_936_ == 2) {
		if (argument_934_ == 1) {
		    int anLocalInt_1035_ = anLocalInt;
		    for (int anLocalInt_1036_ = -argument_933_;
			 anLocalInt_1036_ < 0; anLocalInt_1036_++) {
			int anLocalInt_1037_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1038_ = -argument_932_;
			     anLocalInt_1038_ < 0; anLocalInt_1038_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_1039_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1037_)];
				if (anLocalInt_1039_ != 0) {
				    int anLocalInt_1040_
					= (anIntArray6633
					   [anLocalInt_1039_ & 0xff]);
				    int anLocalInt_1041_
					= anLocalInts[anLocalInt_945_];
				    int anLocalInt_1042_
					= anLocalInt_1040_ + anLocalInt_1041_;
				    int anLocalInt_1043_
					= ((anLocalInt_1040_ & 0xff00ff)
					   + (anLocalInt_1041_ & 0xff00ff));
				    anLocalInt_1041_
					= ((anLocalInt_1043_ & 0x1000100)
					   + ((anLocalInt_1042_
					       - anLocalInt_1043_)
					      & 0x10000));
				    anLocalInts[anLocalInt_945_]
					= (anLocalInt_1042_ - anLocalInt_1041_
					   | (anLocalInt_1041_
					      - (anLocalInt_1041_ >>> 8)));
				    fs[anLocalInt_945_]
					= (float) argument_931_;
				}
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1035_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 0) {
		    int anLocalInt_1044_ = anLocalInt;
		    int anLocalInt_1045_ = (argument_935_ & 0xff0000) >> 16;
		    int anLocalInt_1046_ = (argument_935_ & 0xff00) >> 8;
		    int anLocalInt_1047_ = argument_935_ & 0xff;
		    for (int anLocalInt_1048_ = -argument_933_;
			 anLocalInt_1048_ < 0; anLocalInt_1048_++) {
			int anLocalInt_1049_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1050_ = -argument_932_;
			     anLocalInt_1050_ < 0; anLocalInt_1050_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_1051_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1049_)];
				if (anLocalInt_1051_ != 0) {
				    int anLocalInt_1052_
					= (anIntArray6633
					   [anLocalInt_1051_ & 0xff]);
				    int anLocalInt_1053_
					= (((anLocalInt_1052_ & 0xff0000)
					    * anLocalInt_1045_)
					   & ~0xffffff);
				    int anLocalInt_1054_
					= (((anLocalInt_1052_ & 0xff00)
					    * anLocalInt_1046_)
					   & 0xff0000);
				    int anLocalInt_1055_
					= (((anLocalInt_1052_ & 0xff)
					    * anLocalInt_1047_)
					   & 0xff00);
				    anLocalInt_1052_
					= (anLocalInt_1053_ | anLocalInt_1054_
					   | anLocalInt_1055_) >>> 8;
				    int anLocalInt_1056_
					= anLocalInts[anLocalInt_945_];
				    int anLocalInt_1057_
					= anLocalInt_1052_ + anLocalInt_1056_;
				    int anLocalInt_1058_
					= ((anLocalInt_1052_ & 0xff00ff)
					   + (anLocalInt_1056_ & 0xff00ff));
				    anLocalInt_1056_
					= ((anLocalInt_1058_ & 0x1000100)
					   + ((anLocalInt_1057_
					       - anLocalInt_1058_)
					      & 0x10000));
				    anLocalInts[anLocalInt_945_]
					= (anLocalInt_1057_ - anLocalInt_1056_
					   | (anLocalInt_1056_
					      - (anLocalInt_1056_ >>> 8)));
				    fs[anLocalInt_945_]
					= (float) argument_931_;
				}
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1044_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 3) {
		    int anLocalInt_1059_ = anLocalInt;
		    for (int anLocalInt_1060_ = -argument_933_;
			 anLocalInt_1060_ < 0; anLocalInt_1060_++) {
			int anLocalInt_1061_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1062_ = -argument_932_;
			     anLocalInt_1062_ < 0; anLocalInt_1062_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				byte anLocalInt_1063_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1061_)];
				int anLocalInt_1064_
				    = (anLocalInt_1063_ > 0
				       ? anIntArray6633[anLocalInt_1063_] : 0);
				int anLocalInt_1065_
				    = anLocalInt_1064_ + argument_935_;
				int anLocalInt_1066_
				    = ((anLocalInt_1064_ & 0xff00ff)
				       + (argument_935_ & 0xff00ff));
				int anLocalInt_1067_
				    = ((anLocalInt_1066_ & 0x1000100)
				       + (anLocalInt_1065_ - anLocalInt_1066_
					  & 0x10000));
				anLocalInt_1064_
				    = (anLocalInt_1065_ - anLocalInt_1067_
				       | anLocalInt_1067_ - (anLocalInt_1067_
							     >>> 8));
				anLocalInt_1067_
				    = anLocalInts[anLocalInt_945_];
				anLocalInt_1065_
				    = anLocalInt_1064_ + anLocalInt_1067_;
				anLocalInt_1066_
				    = ((anLocalInt_1064_ & 0xff00ff)
				       + (anLocalInt_1067_ & 0xff00ff));
				anLocalInt_1067_
				    = ((anLocalInt_1066_ & 0x1000100)
				       + (anLocalInt_1065_ - anLocalInt_1066_
					  & 0x10000));
				anLocalInts[anLocalInt_945_]
				    = (anLocalInt_1065_ - anLocalInt_1067_
				       | anLocalInt_1067_ - (anLocalInt_1067_
							     >>> 8));
				fs[anLocalInt_945_] = (float) argument_931_;
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1059_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		if (argument_934_ == 2) {
		    int anLocalInt_1068_ = argument_935_ >>> 24;
		    int anLocalInt_1069_ = 256 - anLocalInt_1068_;
		    int anLocalInt_1070_
			= ((argument_935_ & 0xff00ff) * anLocalInt_1069_
			   & ~0xff00ff);
		    int anLocalInt_1071_
			= ((argument_935_ & 0xff00) * anLocalInt_1069_
			   & 0xff0000);
		    argument_935_
			= (anLocalInt_1070_ | anLocalInt_1071_) >>> 8;
		    int anLocalInt_1072_ = anLocalInt;
		    for (int anLocalInt_1073_ = -argument_933_;
			 anLocalInt_1073_ < 0; anLocalInt_1073_++) {
			int anLocalInt_1074_
			    = ((anLocalInt_938_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1075_ = -argument_932_;
			     anLocalInt_1075_ < 0; anLocalInt_1075_++) {
			    if ((float) argument_931_ < fs[anLocalInt_945_]) {
				int anLocalInt_1076_
				    = aByteArray6634[((anLocalInt >> 16)
						      + anLocalInt_1074_)];
				if (anLocalInt_1076_ != 0) {
				    int anLocalInt_1077_
					= (anIntArray6633
					   [anLocalInt_1076_ & 0xff]);
				    anLocalInt_1070_
					= ((anLocalInt_1077_ & 0xff00ff)
					   * anLocalInt_1068_) & ~0xff00ff;
				    anLocalInt_1071_
					= ((anLocalInt_1077_ & 0xff00)
					   * anLocalInt_1068_) & 0xff0000;
				    anLocalInt_1077_ = ((anLocalInt_1070_
							 | anLocalInt_1071_)
							>>> 8) + argument_935_;
				    int anLocalInt_1078_
					= anLocalInts[anLocalInt_945_];
				    int anLocalInt_1079_
					= anLocalInt_1077_ + anLocalInt_1078_;
				    int anLocalInt_1080_
					= ((anLocalInt_1077_ & 0xff00ff)
					   + (anLocalInt_1078_ & 0xff00ff));
				    anLocalInt_1078_
					= ((anLocalInt_1080_ & 0x1000100)
					   + ((anLocalInt_1079_
					       - anLocalInt_1080_)
					      & 0x10000));
				    anLocalInts[anLocalInt_945_]
					= (anLocalInt_1079_ - anLocalInt_1078_
					   | (anLocalInt_1078_
					      - (anLocalInt_1078_ >>> 8)));
				    fs[anLocalInt_945_]
					= (float) argument_931_;
				}
			    }
			    anLocalInt += anLocalInt_941_;
			    anLocalInt_945_++;
			}
			anLocalInt_938_ += anLocalInt_942_;
			anLocalInt = anLocalInt_1072_;
			anLocalInt_945_ += anLocalInt_946_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void method4004(int argument_1081_, int argument_1082_,
			  int argument_1083_, int argument_1084_,
			  int argument_1085_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	int anLocalInt
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .width);
	argument_1081_ += ((Class368_Sub2) this).anInt5698;
	argument_1082_ += ((Class368_Sub2) this).anInt5719;
	int anLocalInt_1086_ = argument_1082_ * anLocalInt + argument_1081_;
	int anLocalInt_1087_ = 0;
	int anLocalInt_1088_ = ((Class368_Sub2) this).height;
	int anLocalInt_1089_ = ((Class368_Sub2) this).width;
	int anLocalInt_1090_ = anLocalInt - anLocalInt_1089_;
	int anLocalInt_1091_ = 0;
	if (argument_1082_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipTop)) {
	    int anLocalInt_1092_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop) - argument_1082_;
	    anLocalInt_1088_ -= anLocalInt_1092_;
	    argument_1082_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop);
	    anLocalInt_1087_ += anLocalInt_1092_ * anLocalInt_1089_;
	    anLocalInt_1086_ += anLocalInt_1092_ * anLocalInt;
	}
	if (argument_1082_ + anLocalInt_1088_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipBottom))
	    anLocalInt_1088_
		-= (argument_1082_ + anLocalInt_1088_
		    - ((JavaToolkit)
		       ((Class368_Sub2) this).toolkit).clipBottom);
	if (argument_1081_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipLeft)) {
	    int anLocalInt_1093_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft) - argument_1081_;
	    anLocalInt_1089_ -= anLocalInt_1093_;
	    argument_1081_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft);
	    anLocalInt_1087_ += anLocalInt_1093_;
	    anLocalInt_1086_ += anLocalInt_1093_;
	    anLocalInt_1091_ += anLocalInt_1093_;
	    anLocalInt_1090_ += anLocalInt_1093_;
	}
	if (argument_1081_ + anLocalInt_1089_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipRight)) {
	    int anLocalInt_1094_
		= (argument_1081_ + anLocalInt_1089_
		   - ((JavaToolkit)
		      ((Class368_Sub2) this).toolkit).clipRight);
	    anLocalInt_1089_ -= anLocalInt_1094_;
	    anLocalInt_1091_ += anLocalInt_1094_;
	    anLocalInt_1090_ += anLocalInt_1094_;
	}
	if (anLocalInt_1089_ > 0 && anLocalInt_1088_ > 0) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_1085_ == 0) {
		if (argument_1083_ == 1) {
		    for (int anLocalInt_1095_ = -anLocalInt_1088_;
			 anLocalInt_1095_ < 0; anLocalInt_1095_++) {
			int anLocalInt_1096_
			    = anLocalInt_1086_ + anLocalInt_1089_ - 3;
			while (anLocalInt_1086_ < anLocalInt_1096_) {
			    anLocalInts[anLocalInt_1086_++]
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    anLocalInts[anLocalInt_1086_++]
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    anLocalInts[anLocalInt_1086_++]
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    anLocalInts[anLocalInt_1086_++]
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			}
			anLocalInt_1096_ += 3;
			while (anLocalInt_1086_ < anLocalInt_1096_)
			    anLocalInts[anLocalInt_1086_++]
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 0) {
		    int anLocalInt_1097_ = (argument_1084_ & 0xff0000) >> 16;
		    int anLocalInt_1098_ = (argument_1084_ & 0xff00) >> 8;
		    int anLocalInt_1099_ = argument_1084_ & 0xff;
		    for (int anLocalInt_1100_ = -anLocalInt_1088_;
			 anLocalInt_1100_ < 0; anLocalInt_1100_++) {
			for (int anLocalInt_1101_ = -anLocalInt_1089_;
			     anLocalInt_1101_ < 0; anLocalInt_1101_++) {
			    int anLocalInt_1102_
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    int anLocalInt_1103_
				= (((anLocalInt_1102_ & 0xff0000)
				    * anLocalInt_1097_)
				   & ~0xffffff);
			    int anLocalInt_1104_
				= (((anLocalInt_1102_ & 0xff00)
				    * anLocalInt_1098_)
				   & 0xff0000);
			    int anLocalInt_1105_
				= ((anLocalInt_1102_ & 0xff) * anLocalInt_1099_
				   & 0xff00);
			    anLocalInts[anLocalInt_1086_++]
				= (anLocalInt_1103_ | anLocalInt_1104_
				   | anLocalInt_1105_) >>> 8;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 3) {
		    for (int anLocalInt_1106_ = -anLocalInt_1088_;
			 anLocalInt_1106_ < 0; anLocalInt_1106_++) {
			for (int anLocalInt_1107_ = -anLocalInt_1089_;
			     anLocalInt_1107_ < 0; anLocalInt_1107_++) {
			    int anLocalInt_1108_
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    int anLocalInt_1109_
				= anLocalInt_1108_ + argument_1084_;
			    int anLocalInt_1110_
				= ((anLocalInt_1108_ & 0xff00ff)
				   + (argument_1084_ & 0xff00ff));
			    int anLocalInt_1111_
				= ((anLocalInt_1110_ & 0x1000100)
				   + (anLocalInt_1109_ - anLocalInt_1110_
				      & 0x10000));
			    anLocalInts[anLocalInt_1086_++]
				= (anLocalInt_1109_ - anLocalInt_1111_
				   | anLocalInt_1111_ - (anLocalInt_1111_
							 >>> 8));
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 2) {
		    int anLocalInt_1112_ = argument_1084_ >>> 24;
		    int anLocalInt_1113_ = 256 - anLocalInt_1112_;
		    int anLocalInt_1114_
			= ((argument_1084_ & 0xff00ff) * anLocalInt_1113_
			   & ~0xff00ff);
		    int anLocalInt_1115_
			= ((argument_1084_ & 0xff00) * anLocalInt_1113_
			   & 0xff0000);
		    argument_1084_
			= (anLocalInt_1114_ | anLocalInt_1115_) >>> 8;
		    for (int anLocalInt_1116_ = -anLocalInt_1088_;
			 anLocalInt_1116_ < 0; anLocalInt_1116_++) {
			for (int anLocalInt_1117_ = -anLocalInt_1089_;
			     anLocalInt_1117_ < 0; anLocalInt_1117_++) {
			    int anLocalInt_1118_
				= (anIntArray6633
				   [(aByteArray6634[anLocalInt_1087_++]
				     & 0xff)]);
			    anLocalInt_1114_
				= ((anLocalInt_1118_ & 0xff00ff)
				   * anLocalInt_1112_) & ~0xff00ff;
			    anLocalInt_1115_ = ((anLocalInt_1118_ & 0xff00)
						* anLocalInt_1112_) & 0xff0000;
			    anLocalInts[anLocalInt_1086_++]
				= ((anLocalInt_1114_ | anLocalInt_1115_)
				   >>> 8) + argument_1084_;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_1085_ == 1) {
		if (argument_1083_ == 1) {
		    for (int anLocalInt_1119_ = -anLocalInt_1088_;
			 anLocalInt_1119_ < 0; anLocalInt_1119_++) {
			for (int anLocalInt_1120_ = -anLocalInt_1089_;
			     anLocalInt_1120_ < 0; anLocalInt_1120_++) {
			    int anLocalInt_1121_
				= aByteArray6634[anLocalInt_1087_++];
			    if (anLocalInt_1121_ != 0) {
				int anLocalInt_1122_
				    = (anIntArray6633[anLocalInt_1121_ & 0xff]
				       | ~0xffffff);
				int anLocalInt_1123_ = 255;
				int anLocalInt_1124_ = 0;
				int anLocalInt_1125_
				    = anLocalInts[anLocalInt_1086_];
				anLocalInts[anLocalInt_1086_++]
				    = ((((((anLocalInt_1122_ & 0xff00ff)
					   * anLocalInt_1123_)
					  + ((anLocalInt_1125_ & 0xff00ff)
					     * anLocalInt_1124_))
					 & ~0xff00ff)
					>> 8)
				       + ((((anLocalInt_1122_ & ~0xff00ff)
					    >>> 8) * anLocalInt_1123_
					   + ((anLocalInt_1125_ & ~0xff00ff)
					      >>> 8) * anLocalInt_1124_)
					  & ~0xff00ff));
			    } else
				anLocalInt_1086_++;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 0) {
		    if ((argument_1084_ & 0xffffff) == 16777215) {
			int anLocalInt_1126_ = argument_1084_ >>> 24;
			int anLocalInt_1127_ = 256 - anLocalInt_1126_;
			for (int anLocalInt_1128_ = -anLocalInt_1088_;
			     anLocalInt_1128_ < 0; anLocalInt_1128_++) {
			    for (int anLocalInt_1129_ = -anLocalInt_1089_;
				 anLocalInt_1129_ < 0; anLocalInt_1129_++) {
				int anLocalInt_1130_
				    = aByteArray6634[anLocalInt_1087_++];
				if (anLocalInt_1130_ != 0) {
				    int anLocalInt_1131_
					= (anIntArray6633
					   [anLocalInt_1130_ & 0xff]);
				    int anLocalInt_1132_
					= anLocalInts[anLocalInt_1086_];
				    anLocalInts[anLocalInt_1086_++]
					= (((((anLocalInt_1131_ & 0xff00ff)
					      * anLocalInt_1126_)
					     + ((anLocalInt_1132_ & 0xff00ff)
						* anLocalInt_1127_))
					    & ~0xff00ff)
					   + ((((anLocalInt_1131_ & 0xff00)
						* anLocalInt_1126_)
					       + ((anLocalInt_1132_ & 0xff00)
						  * anLocalInt_1127_))
					      & 0xff0000)) >> 8;
				} else
				    anLocalInt_1086_++;
			    }
			    anLocalInt_1086_ += anLocalInt_1090_;
			    anLocalInt_1087_ += anLocalInt_1091_;
			}
		    } else {
			int anLocalInt_1133_
			    = (argument_1084_ & 0xff0000) >> 16;
			int anLocalInt_1134_ = (argument_1084_ & 0xff00) >> 8;
			int anLocalInt_1135_ = argument_1084_ & 0xff;
			int anLocalInt_1136_ = argument_1084_ >>> 24;
			int anLocalInt_1137_ = 256 - anLocalInt_1136_;
			for (int anLocalInt_1138_ = -anLocalInt_1088_;
			     anLocalInt_1138_ < 0; anLocalInt_1138_++) {
			    for (int anLocalInt_1139_ = -anLocalInt_1089_;
				 anLocalInt_1139_ < 0; anLocalInt_1139_++) {
				int anLocalInt_1140_
				    = aByteArray6634[anLocalInt_1087_++];
				if (anLocalInt_1140_ != 0) {
				    int anLocalInt_1141_
					= (anIntArray6633
					   [anLocalInt_1140_ & 0xff]);
				    if (anLocalInt_1136_ != 255) {
					int anLocalInt_1142_
					    = (((anLocalInt_1141_ & 0xff0000)
						* anLocalInt_1133_)
					       & ~0xffffff);
					int anLocalInt_1143_
					    = (((anLocalInt_1141_ & 0xff00)
						* anLocalInt_1134_)
					       & 0xff0000);
					int anLocalInt_1144_
					    = (((anLocalInt_1141_ & 0xff)
						* anLocalInt_1135_)
					       & 0xff00);
					anLocalInt_1141_
					    = (anLocalInt_1142_
					       | anLocalInt_1143_
					       | anLocalInt_1144_) >>> 8;
					int anLocalInt_1145_
					    = anLocalInts[anLocalInt_1086_];
					anLocalInts[anLocalInt_1086_++]
					    = (((((anLocalInt_1141_ & 0xff00ff)
						  * anLocalInt_1136_)
						 + ((anLocalInt_1145_
						     & 0xff00ff)
						    * anLocalInt_1137_))
						& ~0xff00ff)
					       + ((((anLocalInt_1141_ & 0xff00)
						    * anLocalInt_1136_)
						   + ((anLocalInt_1145_
						       & 0xff00)
						      * anLocalInt_1137_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_1146_
					    = (((anLocalInt_1141_ & 0xff0000)
						* anLocalInt_1133_)
					       & ~0xffffff);
					int anLocalInt_1147_
					    = (((anLocalInt_1141_ & 0xff00)
						* anLocalInt_1134_)
					       & 0xff0000);
					int anLocalInt_1148_
					    = (((anLocalInt_1141_ & 0xff)
						* anLocalInt_1135_)
					       & 0xff00);
					anLocalInts[anLocalInt_1086_++]
					    = (anLocalInt_1146_
					       | anLocalInt_1147_
					       | anLocalInt_1148_) >>> 8;
				    }
				} else
				    anLocalInt_1086_++;
			    }
			    anLocalInt_1086_ += anLocalInt_1090_;
			    anLocalInt_1087_ += anLocalInt_1091_;
			}
			return;
		    }
		    return;
		}
		if (argument_1083_ == 3) {
		    int anLocalInt_1149_ = argument_1084_ >>> 24;
		    int anLocalInt_1150_ = 256 - anLocalInt_1149_;
		    for (int anLocalInt_1151_ = -anLocalInt_1088_;
			 anLocalInt_1151_ < 0; anLocalInt_1151_++) {
			for (int anLocalInt_1152_ = -anLocalInt_1089_;
			     anLocalInt_1152_ < 0; anLocalInt_1152_++) {
			    byte anLocalInt_1153_
				= aByteArray6634[anLocalInt_1087_++];
			    int anLocalInt_1154_
				= (anLocalInt_1153_ > 0
				   ? anIntArray6633[anLocalInt_1153_] : 0);
			    int anLocalInt_1155_
				= anLocalInt_1154_ + argument_1084_;
			    int anLocalInt_1156_
				= ((anLocalInt_1154_ & 0xff00ff)
				   + (argument_1084_ & 0xff00ff));
			    int anLocalInt_1157_
				= ((anLocalInt_1156_ & 0x1000100)
				   + (anLocalInt_1155_ - anLocalInt_1156_
				      & 0x10000));
			    anLocalInt_1157_
				= (anLocalInt_1155_ - anLocalInt_1157_
				   | anLocalInt_1157_ - (anLocalInt_1157_
							 >>> 8));
			    if (anLocalInt_1154_ == 0
				&& anLocalInt_1149_ != 255) {
				anLocalInt_1154_ = anLocalInt_1157_;
				anLocalInt_1157_
				    = anLocalInts[anLocalInt_1086_];
				anLocalInt_1157_
				    = (((((anLocalInt_1154_ & 0xff00ff)
					  * anLocalInt_1149_)
					 + ((anLocalInt_1157_ & 0xff00ff)
					    * anLocalInt_1150_))
					& ~0xff00ff)
				       + ((((anLocalInt_1154_ & 0xff00)
					    * anLocalInt_1149_)
					   + ((anLocalInt_1157_ & 0xff00)
					      * anLocalInt_1150_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts[anLocalInt_1086_++] = anLocalInt_1157_;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 2) {
		    int anLocalInt_1158_ = argument_1084_ >>> 24;
		    int anLocalInt_1159_ = 256 - anLocalInt_1158_;
		    int anLocalInt_1160_
			= ((argument_1084_ & 0xff00ff) * anLocalInt_1159_
			   & ~0xff00ff);
		    int anLocalInt_1161_
			= ((argument_1084_ & 0xff00) * anLocalInt_1159_
			   & 0xff0000);
		    argument_1084_
			= (anLocalInt_1160_ | anLocalInt_1161_) >>> 8;
		    for (int anLocalInt_1162_ = -anLocalInt_1088_;
			 anLocalInt_1162_ < 0; anLocalInt_1162_++) {
			for (int anLocalInt_1163_ = -anLocalInt_1089_;
			     anLocalInt_1163_ < 0; anLocalInt_1163_++) {
			    int anLocalInt_1164_
				= aByteArray6634[anLocalInt_1087_++];
			    if (anLocalInt_1164_ != 0) {
				int anLocalInt_1165_
				    = anIntArray6633[anLocalInt_1164_ & 0xff];
				anLocalInt_1160_
				    = ((anLocalInt_1165_ & 0xff00ff)
				       * anLocalInt_1158_) & ~0xff00ff;
				anLocalInt_1161_
				    = ((anLocalInt_1165_ & 0xff00)
				       * anLocalInt_1158_) & 0xff0000;
				anLocalInts[anLocalInt_1086_++]
				    = ((anLocalInt_1160_ | anLocalInt_1161_)
				       >>> 8) + argument_1084_;
			    } else
				anLocalInt_1086_++;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_1085_ == 2) {
		if (argument_1083_ == 1) {
		    for (int anLocalInt_1166_ = -anLocalInt_1088_;
			 anLocalInt_1166_ < 0; anLocalInt_1166_++) {
			for (int anLocalInt_1167_ = -anLocalInt_1089_;
			     anLocalInt_1167_ < 0; anLocalInt_1167_++) {
			    int anLocalInt_1168_
				= aByteArray6634[anLocalInt_1087_++];
			    if (anLocalInt_1168_ != 0) {
				int anLocalInt_1169_
				    = anIntArray6633[anLocalInt_1168_ & 0xff];
				int anLocalInt_1170_
				    = anLocalInts[anLocalInt_1086_];
				int anLocalInt_1171_
				    = anLocalInt_1169_ + anLocalInt_1170_;
				int anLocalInt_1172_
				    = ((anLocalInt_1169_ & 0xff00ff)
				       + (anLocalInt_1170_ & 0xff00ff));
				anLocalInt_1170_
				    = ((anLocalInt_1172_ & 0x1000100)
				       + (anLocalInt_1171_ - anLocalInt_1172_
					  & 0x10000));
				anLocalInts[anLocalInt_1086_++]
				    = (anLocalInt_1171_ - anLocalInt_1170_
				       | anLocalInt_1170_ - (anLocalInt_1170_
							     >>> 8));
			    } else
				anLocalInt_1086_++;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 0) {
		    int anLocalInt_1173_ = (argument_1084_ & 0xff0000) >> 16;
		    int anLocalInt_1174_ = (argument_1084_ & 0xff00) >> 8;
		    int anLocalInt_1175_ = argument_1084_ & 0xff;
		    for (int anLocalInt_1176_ = -anLocalInt_1088_;
			 anLocalInt_1176_ < 0; anLocalInt_1176_++) {
			for (int anLocalInt_1177_ = -anLocalInt_1089_;
			     anLocalInt_1177_ < 0; anLocalInt_1177_++) {
			    int anLocalInt_1178_
				= aByteArray6634[anLocalInt_1087_++];
			    if (anLocalInt_1178_ != 0) {
				int anLocalInt_1179_
				    = anIntArray6633[anLocalInt_1178_ & 0xff];
				int anLocalInt_1180_
				    = (((anLocalInt_1179_ & 0xff0000)
					* anLocalInt_1173_)
				       & ~0xffffff);
				int anLocalInt_1181_
				    = (((anLocalInt_1179_ & 0xff00)
					* anLocalInt_1174_)
				       & 0xff0000);
				int anLocalInt_1182_
				    = (((anLocalInt_1179_ & 0xff)
					* anLocalInt_1175_)
				       & 0xff00);
				anLocalInt_1179_
				    = (anLocalInt_1180_ | anLocalInt_1181_
				       | anLocalInt_1182_) >>> 8;
				int anLocalInt_1183_
				    = anLocalInts[anLocalInt_1086_];
				int anLocalInt_1184_
				    = anLocalInt_1179_ + anLocalInt_1183_;
				int anLocalInt_1185_
				    = ((anLocalInt_1179_ & 0xff00ff)
				       + (anLocalInt_1183_ & 0xff00ff));
				anLocalInt_1183_
				    = ((anLocalInt_1185_ & 0x1000100)
				       + (anLocalInt_1184_ - anLocalInt_1185_
					  & 0x10000));
				anLocalInts[anLocalInt_1086_++]
				    = (anLocalInt_1184_ - anLocalInt_1183_
				       | anLocalInt_1183_ - (anLocalInt_1183_
							     >>> 8));
			    } else
				anLocalInt_1086_++;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 3) {
		    for (int anLocalInt_1186_ = -anLocalInt_1088_;
			 anLocalInt_1186_ < 0; anLocalInt_1186_++) {
			for (int anLocalInt_1187_ = -anLocalInt_1089_;
			     anLocalInt_1187_ < 0; anLocalInt_1187_++) {
			    byte anLocalInt_1188_
				= aByteArray6634[anLocalInt_1087_++];
			    int anLocalInt_1189_
				= (anLocalInt_1188_ > 0
				   ? anIntArray6633[anLocalInt_1188_] : 0);
			    int anLocalInt_1190_
				= anLocalInt_1189_ + argument_1084_;
			    int anLocalInt_1191_
				= ((anLocalInt_1189_ & 0xff00ff)
				   + (argument_1084_ & 0xff00ff));
			    int anLocalInt_1192_
				= ((anLocalInt_1191_ & 0x1000100)
				   + (anLocalInt_1190_ - anLocalInt_1191_
				      & 0x10000));
			    anLocalInt_1189_
				= (anLocalInt_1190_ - anLocalInt_1192_
				   | anLocalInt_1192_ - (anLocalInt_1192_
							 >>> 8));
			    anLocalInt_1192_ = anLocalInts[anLocalInt_1086_];
			    anLocalInt_1190_
				= anLocalInt_1189_ + anLocalInt_1192_;
			    anLocalInt_1191_
				= ((anLocalInt_1189_ & 0xff00ff)
				   + (anLocalInt_1192_ & 0xff00ff));
			    anLocalInt_1192_
				= ((anLocalInt_1191_ & 0x1000100)
				   + (anLocalInt_1190_ - anLocalInt_1191_
				      & 0x10000));
			    anLocalInts[anLocalInt_1086_++]
				= (anLocalInt_1190_ - anLocalInt_1192_
				   | anLocalInt_1192_ - (anLocalInt_1192_
							 >>> 8));
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		if (argument_1083_ == 2) {
		    int anLocalInt_1193_ = argument_1084_ >>> 24;
		    int anLocalInt_1194_ = 256 - anLocalInt_1193_;
		    int anLocalInt_1195_
			= ((argument_1084_ & 0xff00ff) * anLocalInt_1194_
			   & ~0xff00ff);
		    int anLocalInt_1196_
			= ((argument_1084_ & 0xff00) * anLocalInt_1194_
			   & 0xff0000);
		    argument_1084_
			= (anLocalInt_1195_ | anLocalInt_1196_) >>> 8;
		    for (int anLocalInt_1197_ = -anLocalInt_1088_;
			 anLocalInt_1197_ < 0; anLocalInt_1197_++) {
			for (int anLocalInt_1198_ = -anLocalInt_1089_;
			     anLocalInt_1198_ < 0; anLocalInt_1198_++) {
			    int anLocalInt_1199_
				= aByteArray6634[anLocalInt_1087_++];
			    if (anLocalInt_1199_ != 0) {
				int anLocalInt_1200_
				    = anIntArray6633[anLocalInt_1199_ & 0xff];
				anLocalInt_1195_
				    = ((anLocalInt_1200_ & 0xff00ff)
				       * anLocalInt_1193_) & ~0xff00ff;
				anLocalInt_1196_
				    = ((anLocalInt_1200_ & 0xff00)
				       * anLocalInt_1193_) & 0xff0000;
				anLocalInt_1200_
				    = ((anLocalInt_1195_ | anLocalInt_1196_)
				       >>> 8) + argument_1084_;
				int anLocalInt_1201_
				    = anLocalInts[anLocalInt_1086_];
				int anLocalInt_1202_
				    = anLocalInt_1200_ + anLocalInt_1201_;
				int anLocalInt_1203_
				    = ((anLocalInt_1200_ & 0xff00ff)
				       + (anLocalInt_1201_ & 0xff00ff));
				anLocalInt_1201_
				    = ((anLocalInt_1203_ & 0x1000100)
				       + (anLocalInt_1202_ - anLocalInt_1203_
					  & 0x10000));
				anLocalInts[anLocalInt_1086_++]
				    = (anLocalInt_1202_ - anLocalInt_1201_
				       | anLocalInt_1201_ - (anLocalInt_1201_
							     >>> 8));
			    } else
				anLocalInt_1086_++;
			}
			anLocalInt_1086_ += anLocalInt_1090_;
			anLocalInt_1087_ += anLocalInt_1091_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    Class368_Sub2_Sub1(JavaToolkit argument_1204_, byte[] argument_1205_,
		       int[] argument_1206_, int argument_1207_,
		       int argument_1208_) {
	super(argument_1204_, argument_1207_, argument_1208_);
	aByteArray6634 = argument_1205_;
	anIntArray6633 = argument_1206_;
    }
}
