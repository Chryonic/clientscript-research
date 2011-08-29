/* Class368_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class368_Sub2_Sub2 extends Class368_Sub2
{
    int[] anIntArray6635;
    
    final void method4032(int argument_0_, int argument_1_, int argument_2_,
			  int argument_3_, int argument_4_, int argument_5_,
			  int argument_6_, int argument_7_, int argument_8_) {
	if (argument_3_ > 0 && argument_4_ > 0) {
	    int anLocalInt = 0;
	    int anLocalInt_9_ = 0;
	    int anLocalInt_10_ = (((Class368_Sub2) this).anInt5698
				  + ((Class368_Sub2) this).width
				  + ((Class368_Sub2) this).anInt5715);
	    int anLocalInt_11_ = (((Class368_Sub2) this).anInt5719
				  + ((Class368_Sub2) this).height
				  + ((Class368_Sub2) this).anInt5708);
	    int anLocalInt_12_ = (anLocalInt_10_ << 16) / argument_3_;
	    int anLocalInt_13_ = (anLocalInt_11_ << 16) / argument_4_;
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
		anLocalInt_9_ += (anLocalInt_15_ * anLocalInt_13_
				  - (((Class368_Sub2) this).anInt5719 << 16));
	    }
	    if (((Class368_Sub2) this).width < anLocalInt_10_)
		argument_3_
		    = ((((Class368_Sub2) this).width << 16) - anLocalInt
		       + anLocalInt_12_ - 1) / anLocalInt_12_;
	    if (((Class368_Sub2) this).height < anLocalInt_11_)
		argument_4_
		    = ((((Class368_Sub2) this).height << 16) - anLocalInt_9_
		       + anLocalInt_13_ - 1) / anLocalInt_13_;
	    int anLocalInt_16_
		= (argument_0_
		   + argument_1_ * (((JavaToolkit) (((Class368_Sub2) this)
						      .toolkit))
				    .width));
	    int anLocalInt_17_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .width) - argument_3_;
	    if (argument_1_ + argument_4_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipBottom))
		argument_4_
		    -= (argument_1_ + argument_4_
			- ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).clipBottom);
	    if (argument_1_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop)) {
		int anLocalInt_18_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipTop
		       - argument_1_);
		argument_4_ -= anLocalInt_18_;
		anLocalInt_16_
		    += (anLocalInt_18_
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width);
		anLocalInt_9_ += anLocalInt_13_ * anLocalInt_18_;
	    }
	    if (argument_0_ + argument_3_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipRight)) {
		int anLocalInt_19_
		    = (argument_0_ + argument_3_
		       - ((JavaToolkit) (((Class368_Sub2) this)
					   .toolkit)).clipRight);
		argument_3_ -= anLocalInt_19_;
		anLocalInt_17_ += anLocalInt_19_;
	    }
	    if (argument_0_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft)) {
		int anLocalInt_20_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipLeft
		       - argument_0_);
		argument_3_ -= anLocalInt_20_;
		anLocalInt_16_ += anLocalInt_20_;
		anLocalInt += anLocalInt_12_ * anLocalInt_20_;
		anLocalInt_17_ += anLocalInt_20_;
	    }
	    float[] fs
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .aFloatArray4667);
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_7_ == 0) {
		if (argument_5_ == 1) {
		    int anLocalInt_21_ = anLocalInt;
		    for (int anLocalInt_22_ = -argument_4_; anLocalInt_22_ < 0;
			 anLocalInt_22_++) {
			int anLocalInt_23_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_24_ = -argument_3_;
			     anLocalInt_24_ < 0; anLocalInt_24_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				anLocalInts[anLocalInt_16_]
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_23_]);
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_21_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 0) {
		    int anLocalInt_25_ = (argument_6_ & 0xff0000) >> 16;
		    int anLocalInt_26_ = (argument_6_ & 0xff00) >> 8;
		    int anLocalInt_27_ = argument_6_ & 0xff;
		    int anLocalInt_28_ = anLocalInt;
		    for (int anLocalInt_29_ = -argument_4_; anLocalInt_29_ < 0;
			 anLocalInt_29_++) {
			int anLocalInt_30_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_31_ = -argument_3_;
			     anLocalInt_31_ < 0; anLocalInt_31_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_32_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_30_]);
				int anLocalInt_33_
				    = (((anLocalInt_32_ & 0xff0000)
					* anLocalInt_25_)
				       & ~0xffffff);
				int anLocalInt_34_
				    = (((anLocalInt_32_ & 0xff00)
					* anLocalInt_26_)
				       & 0xff0000);
				int anLocalInt_35_
				    = ((anLocalInt_32_ & 0xff) * anLocalInt_27_
				       & 0xff00);
				anLocalInts[anLocalInt_16_]
				    = (anLocalInt_33_ | anLocalInt_34_
				       | anLocalInt_35_) >>> 8;
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_28_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 3) {
		    int anLocalInt_36_ = anLocalInt;
		    for (int anLocalInt_37_ = -argument_4_; anLocalInt_37_ < 0;
			 anLocalInt_37_++) {
			int anLocalInt_38_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_39_ = -argument_3_;
			     anLocalInt_39_ < 0; anLocalInt_39_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_40_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_38_]);
				int anLocalInt_41_
				    = anLocalInt_40_ + argument_6_;
				int anLocalInt_42_
				    = ((anLocalInt_40_ & 0xff00ff)
				       + (argument_6_ & 0xff00ff));
				int anLocalInt_43_
				    = ((anLocalInt_42_ & 0x1000100)
				       + (anLocalInt_41_ - anLocalInt_42_
					  & 0x10000));
				anLocalInts[anLocalInt_16_]
				    = (anLocalInt_41_ - anLocalInt_43_
				       | anLocalInt_43_ - (anLocalInt_43_
							   >>> 8));
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_36_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 2) {
		    int anLocalInt_44_ = argument_6_ >>> 24;
		    int anLocalInt_45_ = 256 - anLocalInt_44_;
		    int anLocalInt_46_
			= ((argument_6_ & 0xff00ff) * anLocalInt_45_
			   & ~0xff00ff);
		    int anLocalInt_47_
			= (argument_6_ & 0xff00) * anLocalInt_45_ & 0xff0000;
		    argument_6_ = (anLocalInt_46_ | anLocalInt_47_) >>> 8;
		    int anLocalInt_48_ = anLocalInt;
		    for (int anLocalInt_49_ = -argument_4_; anLocalInt_49_ < 0;
			 anLocalInt_49_++) {
			int anLocalInt_50_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_51_ = -argument_3_;
			     anLocalInt_51_ < 0; anLocalInt_51_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_52_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_50_]);
				anLocalInt_46_
				    = ((anLocalInt_52_ & 0xff00ff)
				       * anLocalInt_44_) & ~0xff00ff;
				anLocalInt_47_ = ((anLocalInt_52_ & 0xff00)
						  * anLocalInt_44_) & 0xff0000;
				anLocalInts[anLocalInt_16_]
				    = ((anLocalInt_46_ | anLocalInt_47_)
				       >>> 8) + argument_6_;
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_48_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_7_ == 1) {
		if (argument_5_ == 1) {
		    int anLocalInt_53_ = anLocalInt;
		    for (int anLocalInt_54_ = -argument_4_; anLocalInt_54_ < 0;
			 anLocalInt_54_++) {
			int anLocalInt_55_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_56_ = -argument_3_;
			     anLocalInt_56_ < 0; anLocalInt_56_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_57_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_55_]);
				int anLocalInt_58_ = anLocalInt_57_ >>> 24;
				int anLocalInt_59_ = 256 - anLocalInt_58_;
				int anLocalInt_60_
				    = anLocalInts[anLocalInt_16_];
				anLocalInts[anLocalInt_16_]
				    = ((((((anLocalInt_57_ & 0xff00ff)
					   * anLocalInt_58_)
					  + ((anLocalInt_60_ & 0xff00ff)
					     * anLocalInt_59_))
					 & ~0xff00ff)
					>> 8)
				       + ((((anLocalInt_57_ & ~0xff00ff)
					    >>> 8) * anLocalInt_58_
					   + ((anLocalInt_60_ & ~0xff00ff)
					      >>> 8) * anLocalInt_59_)
					  & ~0xff00ff));
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_53_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 0) {
		    int anLocalInt_61_ = anLocalInt;
		    if ((argument_6_ & 0xffffff) == 16777215) {
			for (int anLocalInt_62_ = -argument_4_;
			     anLocalInt_62_ < 0; anLocalInt_62_++) {
			    int anLocalInt_63_
				= ((anLocalInt_9_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_64_ = -argument_3_;
				 anLocalInt_64_ < 0; anLocalInt_64_++) {
				if ((float) argument_2_ < fs[anLocalInt_16_]) {
				    int anLocalInt_65_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635
					   [((anLocalInt >> 16)
					     + anLocalInt_63_)]);
				    int anLocalInt_66_
					= (((anLocalInt_65_ >>> 24)
					    * (argument_6_ >>> 24))
					   >> 8);
				    int anLocalInt_67_ = 256 - anLocalInt_66_;
				    int anLocalInt_68_
					= anLocalInts[anLocalInt_16_];
				    anLocalInts[anLocalInt_16_]
					= (((((anLocalInt_65_ & 0xff00ff)
					      * anLocalInt_66_)
					     + ((anLocalInt_68_ & 0xff00ff)
						* anLocalInt_67_))
					    & ~0xff00ff)
					   + ((((anLocalInt_65_ & 0xff00)
						* anLocalInt_66_)
					       + ((anLocalInt_68_ & 0xff00)
						  * anLocalInt_67_))
					      & 0xff0000)) >> 8;
				    fs[anLocalInt_16_] = (float) argument_2_;
				}
				anLocalInt += anLocalInt_12_;
				anLocalInt_16_++;
			    }
			    anLocalInt_9_ += anLocalInt_13_;
			    anLocalInt = anLocalInt_61_;
			    anLocalInt_16_ += anLocalInt_17_;
			}
		    } else {
			int anLocalInt_69_ = (argument_6_ & 0xff0000) >> 16;
			int anLocalInt_70_ = (argument_6_ & 0xff00) >> 8;
			int anLocalInt_71_ = argument_6_ & 0xff;
			for (int anLocalInt_72_ = -argument_4_;
			     anLocalInt_72_ < 0; anLocalInt_72_++) {
			    int anLocalInt_73_
				= ((anLocalInt_9_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_74_ = -argument_3_;
				 anLocalInt_74_ < 0; anLocalInt_74_++) {
				if ((float) argument_2_ < fs[anLocalInt_16_]) {
				    int anLocalInt_75_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635
					   [((anLocalInt >> 16)
					     + anLocalInt_73_)]);
				    int anLocalInt_76_
					= (((anLocalInt_75_ >>> 24)
					    * (argument_6_ >>> 24))
					   >> 8);
				    int anLocalInt_77_ = 256 - anLocalInt_76_;
				    if (anLocalInt_76_ != 255) {
					int anLocalInt_78_
					    = (((anLocalInt_75_ & 0xff0000)
						* anLocalInt_69_)
					       & ~0xffffff);
					int anLocalInt_79_
					    = (((anLocalInt_75_ & 0xff00)
						* anLocalInt_70_)
					       & 0xff0000);
					int anLocalInt_80_
					    = (((anLocalInt_75_ & 0xff)
						* anLocalInt_71_)
					       & 0xff00);
					anLocalInt_75_
					    = (anLocalInt_78_ | anLocalInt_79_
					       | anLocalInt_80_) >>> 8;
					int anLocalInt_81_
					    = anLocalInts[anLocalInt_16_];
					anLocalInts[anLocalInt_16_]
					    = (((((anLocalInt_75_ & 0xff00ff)
						  * anLocalInt_76_)
						 + ((anLocalInt_81_ & 0xff00ff)
						    * anLocalInt_77_))
						& ~0xff00ff)
					       + ((((anLocalInt_75_ & 0xff00)
						    * anLocalInt_76_)
						   + ((anLocalInt_81_ & 0xff00)
						      * anLocalInt_77_))
						  & 0xff0000)) >> 8;
					fs[anLocalInt_16_]
					    = (float) argument_2_;
				    } else {
					int anLocalInt_82_
					    = (((anLocalInt_75_ & 0xff0000)
						* anLocalInt_69_)
					       & ~0xffffff);
					int anLocalInt_83_
					    = (((anLocalInt_75_ & 0xff00)
						* anLocalInt_70_)
					       & 0xff0000);
					int anLocalInt_84_
					    = (((anLocalInt_75_ & 0xff)
						* anLocalInt_71_)
					       & 0xff00);
					anLocalInts[anLocalInt_16_]
					    = (anLocalInt_82_ | anLocalInt_83_
					       | anLocalInt_84_) >>> 8;
					fs[anLocalInt_16_]
					    = (float) argument_2_;
				    }
				}
				anLocalInt += anLocalInt_12_;
				anLocalInt_16_++;
			    }
			    anLocalInt_9_ += anLocalInt_13_;
			    anLocalInt = anLocalInt_61_;
			    anLocalInt_16_ += anLocalInt_17_;
			}
			return;
		    }
		    return;
		}
		if (argument_5_ == 3) {
		    int anLocalInt_85_ = anLocalInt;
		    for (int anLocalInt_86_ = -argument_4_; anLocalInt_86_ < 0;
			 anLocalInt_86_++) {
			int anLocalInt_87_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_88_ = -argument_3_;
			     anLocalInt_88_ < 0; anLocalInt_88_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_89_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_87_]);
				int anLocalInt_90_
				    = anLocalInt_89_ + argument_6_;
				int anLocalInt_91_
				    = ((anLocalInt_89_ & 0xff00ff)
				       + (argument_6_ & 0xff00ff));
				int anLocalInt_92_
				    = ((anLocalInt_91_ & 0x1000100)
				       + (anLocalInt_90_ - anLocalInt_91_
					  & 0x10000));
				anLocalInt_92_
				    = (anLocalInt_90_ - anLocalInt_92_
				       | anLocalInt_92_ - (anLocalInt_92_
							   >>> 8));
				int anLocalInt_93_
				    = ((anLocalInt_92_ >>> 24) * (argument_6_
								  >>> 24)
				       >> 8);
				int anLocalInt_94_ = 256 - anLocalInt_93_;
				if (anLocalInt_93_ != 255) {
				    anLocalInt_89_ = anLocalInt_92_;
				    anLocalInt_92_
					= anLocalInts[anLocalInt_16_];
				    anLocalInt_92_
					= (((((anLocalInt_89_ & 0xff00ff)
					      * anLocalInt_93_)
					     + ((anLocalInt_92_ & 0xff00ff)
						* anLocalInt_94_))
					    & ~0xff00ff)
					   + ((((anLocalInt_89_ & 0xff00)
						* anLocalInt_93_)
					       + ((anLocalInt_92_ & 0xff00)
						  * anLocalInt_94_))
					      & 0xff0000)) >> 8;
				}
				anLocalInts[anLocalInt_16_] = anLocalInt_92_;
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_85_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 2) {
		    int anLocalInt_95_ = argument_6_ >>> 24;
		    int anLocalInt_96_ = 256 - anLocalInt_95_;
		    int anLocalInt_97_
			= ((argument_6_ & 0xff00ff) * anLocalInt_96_
			   & ~0xff00ff);
		    int anLocalInt_98_
			= (argument_6_ & 0xff00) * anLocalInt_96_ & 0xff0000;
		    argument_6_ = (anLocalInt_97_ | anLocalInt_98_) >>> 8;
		    int anLocalInt_99_ = anLocalInt;
		    for (int anLocalInt_100_ = -argument_4_;
			 anLocalInt_100_ < 0; anLocalInt_100_++) {
			int anLocalInt_101_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_102_ = -argument_3_;
			     anLocalInt_102_ < 0; anLocalInt_102_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_103_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_101_]);
				int anLocalInt_104_ = anLocalInt_103_ >>> 24;
				int anLocalInt_105_ = 256 - anLocalInt_104_;
				anLocalInt_97_
				    = ((anLocalInt_103_ & 0xff00ff)
				       * anLocalInt_95_) & ~0xff00ff;
				anLocalInt_98_ = ((anLocalInt_103_ & 0xff00)
						  * anLocalInt_95_) & 0xff0000;
				anLocalInt_103_
				    = ((anLocalInt_97_ | anLocalInt_98_)
				       >>> 8) + argument_6_;
				int anLocalInt_106_
				    = anLocalInts[anLocalInt_16_];
				anLocalInts[anLocalInt_16_]
				    = (((((anLocalInt_103_ & 0xff00ff)
					  * anLocalInt_104_)
					 + ((anLocalInt_106_ & 0xff00ff)
					    * anLocalInt_105_))
					& ~0xff00ff)
				       + ((((anLocalInt_103_ & 0xff00)
					    * anLocalInt_104_)
					   + ((anLocalInt_106_ & 0xff00)
					      * anLocalInt_105_))
					  & 0xff0000)) >> 8;
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_99_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_7_ == 2) {
		if (argument_5_ == 1) {
		    int anLocalInt_107_ = anLocalInt;
		    for (int anLocalInt_108_ = -argument_4_;
			 anLocalInt_108_ < 0; anLocalInt_108_++) {
			int anLocalInt_109_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_110_ = -argument_3_;
			     anLocalInt_110_ < 0; anLocalInt_110_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_111_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_109_]);
				if (anLocalInt_111_ != 0) {
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
				    anLocalInts[anLocalInt_16_]
					= (anLocalInt_113_ - anLocalInt_112_
					   | anLocalInt_112_ - (anLocalInt_112_
								>>> 8));
				    fs[anLocalInt_16_] = (float) argument_2_;
				}
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_107_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 0) {
		    int anLocalInt_115_ = anLocalInt;
		    int anLocalInt_116_ = (argument_6_ & 0xff0000) >> 16;
		    int anLocalInt_117_ = (argument_6_ & 0xff00) >> 8;
		    int anLocalInt_118_ = argument_6_ & 0xff;
		    for (int anLocalInt_119_ = -argument_4_;
			 anLocalInt_119_ < 0; anLocalInt_119_++) {
			int anLocalInt_120_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_121_ = -argument_3_;
			     anLocalInt_121_ < 0; anLocalInt_121_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_122_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_120_]);
				if (anLocalInt_122_ != 0) {
				    int anLocalInt_123_
					= (((anLocalInt_122_ & 0xff0000)
					    * anLocalInt_116_)
					   & ~0xffffff);
				    int anLocalInt_124_
					= (((anLocalInt_122_ & 0xff00)
					    * anLocalInt_117_)
					   & 0xff0000);
				    int anLocalInt_125_
					= (((anLocalInt_122_ & 0xff)
					    * anLocalInt_118_)
					   & 0xff00);
				    anLocalInt_122_
					= (anLocalInt_123_ | anLocalInt_124_
					   | anLocalInt_125_) >>> 8;
				    int anLocalInt_126_
					= anLocalInts[anLocalInt_16_];
				    int anLocalInt_127_
					= anLocalInt_122_ + anLocalInt_126_;
				    int anLocalInt_128_
					= ((anLocalInt_122_ & 0xff00ff)
					   + (anLocalInt_126_ & 0xff00ff));
				    anLocalInt_126_
					= ((anLocalInt_128_ & 0x1000100)
					   + (anLocalInt_127_ - anLocalInt_128_
					      & 0x10000));
				    anLocalInts[anLocalInt_16_]
					= (anLocalInt_127_ - anLocalInt_126_
					   | anLocalInt_126_ - (anLocalInt_126_
								>>> 8));
				    fs[anLocalInt_16_] = (float) argument_2_;
				}
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_115_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 3) {
		    int anLocalInt_129_ = anLocalInt;
		    for (int anLocalInt_130_ = -argument_4_;
			 anLocalInt_130_ < 0; anLocalInt_130_++) {
			int anLocalInt_131_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_132_ = -argument_3_;
			     anLocalInt_132_ < 0; anLocalInt_132_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_133_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_131_]);
				int anLocalInt_134_
				    = anLocalInt_133_ + argument_6_;
				int anLocalInt_135_
				    = ((anLocalInt_133_ & 0xff00ff)
				       + (argument_6_ & 0xff00ff));
				int anLocalInt_136_
				    = ((anLocalInt_135_ & 0x1000100)
				       + (anLocalInt_134_ - anLocalInt_135_
					  & 0x10000));
				anLocalInt_133_
				    = (anLocalInt_134_ - anLocalInt_136_
				       | anLocalInt_136_ - (anLocalInt_136_
							    >>> 8));
				anLocalInt_136_ = anLocalInts[anLocalInt_16_];
				anLocalInt_134_
				    = anLocalInt_133_ + anLocalInt_136_;
				anLocalInt_135_
				    = ((anLocalInt_133_ & 0xff00ff)
				       + (anLocalInt_136_ & 0xff00ff));
				anLocalInt_136_
				    = ((anLocalInt_135_ & 0x1000100)
				       + (anLocalInt_134_ - anLocalInt_135_
					  & 0x10000));
				anLocalInts[anLocalInt_16_]
				    = (anLocalInt_134_ - anLocalInt_136_
				       | anLocalInt_136_ - (anLocalInt_136_
							    >>> 8));
				fs[anLocalInt_16_] = (float) argument_2_;
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_129_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		if (argument_5_ == 2) {
		    int anLocalInt_137_ = argument_6_ >>> 24;
		    int anLocalInt_138_ = 256 - anLocalInt_137_;
		    int anLocalInt_139_
			= ((argument_6_ & 0xff00ff) * anLocalInt_138_
			   & ~0xff00ff);
		    int anLocalInt_140_
			= (argument_6_ & 0xff00) * anLocalInt_138_ & 0xff0000;
		    argument_6_ = (anLocalInt_139_ | anLocalInt_140_) >>> 8;
		    int anLocalInt_141_ = anLocalInt;
		    for (int anLocalInt_142_ = -argument_4_;
			 anLocalInt_142_ < 0; anLocalInt_142_++) {
			int anLocalInt_143_
			    = ((anLocalInt_9_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_144_ = -argument_3_;
			     anLocalInt_144_ < 0; anLocalInt_144_++) {
			    if ((float) argument_2_ < fs[anLocalInt_16_]) {
				int anLocalInt_145_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(anLocalInt >> 16) + anLocalInt_143_]);
				if (anLocalInt_145_ != 0) {
				    anLocalInt_139_
					= ((anLocalInt_145_ & 0xff00ff)
					   * anLocalInt_137_) & ~0xff00ff;
				    anLocalInt_140_
					= ((anLocalInt_145_ & 0xff00)
					   * anLocalInt_137_) & 0xff0000;
				    anLocalInt_145_
					= ((anLocalInt_139_ | anLocalInt_140_)
					   >>> 8) + argument_6_;
				    int anLocalInt_146_
					= anLocalInts[anLocalInt_16_];
				    int anLocalInt_147_
					= anLocalInt_145_ + anLocalInt_146_;
				    int anLocalInt_148_
					= ((anLocalInt_145_ & 0xff00ff)
					   + (anLocalInt_146_ & 0xff00ff));
				    anLocalInt_146_
					= ((anLocalInt_148_ & 0x1000100)
					   + (anLocalInt_147_ - anLocalInt_148_
					      & 0x10000));
				    anLocalInts[anLocalInt_16_]
					= (anLocalInt_147_ - anLocalInt_146_
					   | anLocalInt_146_ - (anLocalInt_146_
								>>> 8));
				    fs[anLocalInt_16_] = (float) argument_2_;
				}
			    }
			    anLocalInt += anLocalInt_12_;
			    anLocalInt_16_++;
			}
			anLocalInt_9_ += anLocalInt_13_;
			anLocalInt = anLocalInt_141_;
			anLocalInt_16_ += anLocalInt_17_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void method4003(int argument_149_, int argument_150_,
			  int argument_151_) {
	if (argument_151_ == 0) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class368_Sub2) this).height; anLocalInt++) {
		int anLocalInt_152_
		    = anLocalInt * ((Class368_Sub2) this).width;
		int anLocalInt_153_
		    = (((argument_150_ + anLocalInt)
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width)
		       + argument_149_);
		for (int anLocalInt_154_ = 0;
		     anLocalInt_154_ < ((Class368_Sub2) this).width;
		     anLocalInt_154_++)
		    ((Class368_Sub2_Sub2) this).anIntArray6635
			[anLocalInt_152_ + anLocalInt_154_]
			= ((((Class368_Sub2_Sub2) this).anIntArray6635
			    [anLocalInt_152_ + anLocalInt_154_]) & 0xffffff
			   | (anLocalInts[anLocalInt_153_ + anLocalInt_154_]
			      << 8) & ~0xffffff);
	    }
	} else if (argument_151_ == 1) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class368_Sub2) this).height; anLocalInt++) {
		int anLocalInt_155_
		    = anLocalInt * ((Class368_Sub2) this).width;
		int anLocalInt_156_
		    = (((argument_150_ + anLocalInt)
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width)
		       + argument_149_);
		for (int anLocalInt_157_ = 0;
		     anLocalInt_157_ < ((Class368_Sub2) this).width;
		     anLocalInt_157_++)
		    ((Class368_Sub2_Sub2) this).anIntArray6635
			[anLocalInt_155_ + anLocalInt_157_]
			= ((((Class368_Sub2_Sub2) this).anIntArray6635
			    [anLocalInt_155_ + anLocalInt_157_]) & 0xffffff
			   | (anLocalInts[anLocalInt_156_ + anLocalInt_157_]
			      << 16) & ~0xffffff);
	    }
	} else if (argument_151_ == 2) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class368_Sub2) this).height; anLocalInt++) {
		int anLocalInt_158_
		    = anLocalInt * ((Class368_Sub2) this).width;
		int anLocalInt_159_
		    = (((argument_150_ + anLocalInt)
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width)
		       + argument_149_);
		for (int anLocalInt_160_ = 0;
		     anLocalInt_160_ < ((Class368_Sub2) this).width;
		     anLocalInt_160_++)
		    ((Class368_Sub2_Sub2) this).anIntArray6635
			[anLocalInt_158_ + anLocalInt_160_]
			= ((((Class368_Sub2_Sub2) this).anIntArray6635
			    [anLocalInt_158_ + anLocalInt_160_]) & 0xffffff
			   | (anLocalInts[anLocalInt_159_ + anLocalInt_160_]
			      << 24) & ~0xffffff);
	    }
	} else if (argument_151_ == 3) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class368_Sub2) this).height; anLocalInt++) {
		int anLocalInt_161_
		    = anLocalInt * ((Class368_Sub2) this).width;
		int anLocalInt_162_
		    = (((argument_150_ + anLocalInt)
			* ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).width)
		       + argument_149_);
		for (int anLocalInt_163_ = 0;
		     anLocalInt_163_ < ((Class368_Sub2) this).width;
		     anLocalInt_163_++)
		    ((Class368_Sub2_Sub2) this).anIntArray6635
			[anLocalInt_161_ + anLocalInt_163_]
			= ((((Class368_Sub2_Sub2) this).anIntArray6635
			    [anLocalInt_161_ + anLocalInt_163_]) & 0xffffff
			   | ((anLocalInts[anLocalInt_162_ + anLocalInt_163_]
			       != 0)
			      ? -16777216 : 0));
	    }
	}
    }
    
    Class368_Sub2_Sub2(JavaToolkit argument_164_, int[] argument_165_,
		       int argument_166_, int argument_167_, int argument_168_,
		       int argument_169_, boolean argument_170_) {
	super(argument_164_, argument_168_, argument_169_);
	if (argument_170_)
	    ((Class368_Sub2_Sub2) this).anIntArray6635
		= new int[argument_168_ * argument_169_];
	else
	    ((Class368_Sub2_Sub2) this).anIntArray6635 = argument_165_;
	argument_167_ -= ((Class368_Sub2) this).width;
	int anLocalInt = 0;
	for (int anLocalInt_171_ = 0; anLocalInt_171_ < argument_169_;
	     anLocalInt_171_++) {
	    for (int anLocalInt_172_ = 0; anLocalInt_172_ < argument_168_;
		 anLocalInt_172_++)
		((Class368_Sub2_Sub2) this).anIntArray6635[anLocalInt++]
		    = argument_165_[argument_166_++];
	    argument_166_ += argument_167_;
	}
    }
    
    Class368_Sub2_Sub2(JavaToolkit argument_173_, int[] argument_174_,
		       int argument_175_, int argument_176_) {
	super(argument_173_, argument_175_, argument_176_);
	((Class368_Sub2_Sub2) this).anIntArray6635 = argument_174_;
    }
    
    final void method4013(int argument_177_, int argument_178_,
			  int argument_179_, int argument_180_,
			  int argument_181_, int argument_182_) {
	int[] anLocalInts
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .pixels);
	for (int anLocalInt = 0; anLocalInt < argument_180_; anLocalInt++) {
	    int anLocalInt_183_
		= (argument_178_ + anLocalInt) * argument_179_ + argument_177_;
	    int anLocalInt_184_
		= (argument_182_ + anLocalInt) * argument_179_ + argument_181_;
	    for (int anLocalInt_185_ = 0; anLocalInt_185_ < argument_179_;
		 anLocalInt_185_++)
		((Class368_Sub2_Sub2) this).anIntArray6635[(anLocalInt_183_
							    + anLocalInt_185_)]
		    = (anLocalInts[anLocalInt_184_ + anLocalInt_185_]
		       & 0xffffff);
	}
    }
    
    final void method4004(int argument_186_, int argument_187_,
			  int argument_188_, int argument_189_,
			  int argument_190_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	int anLocalInt
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .width);
	argument_186_ += ((Class368_Sub2) this).anInt5698;
	argument_187_ += ((Class368_Sub2) this).anInt5719;
	int anLocalInt_191_ = argument_187_ * anLocalInt + argument_186_;
	int anLocalInt_192_ = 0;
	int anLocalInt_193_ = ((Class368_Sub2) this).height;
	int anLocalInt_194_ = ((Class368_Sub2) this).width;
	int anLocalInt_195_ = anLocalInt - anLocalInt_194_;
	int anLocalInt_196_ = 0;
	if (argument_187_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipTop)) {
	    int anLocalInt_197_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop) - argument_187_;
	    anLocalInt_193_ -= anLocalInt_197_;
	    argument_187_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop);
	    anLocalInt_192_ += anLocalInt_197_ * anLocalInt_194_;
	    anLocalInt_191_ += anLocalInt_197_ * anLocalInt;
	}
	if (argument_187_ + anLocalInt_193_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipBottom))
	    anLocalInt_193_
		-= (argument_187_ + anLocalInt_193_
		    - ((JavaToolkit)
		       ((Class368_Sub2) this).toolkit).clipBottom);
	if (argument_186_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipLeft)) {
	    int anLocalInt_198_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft) - argument_186_;
	    anLocalInt_194_ -= anLocalInt_198_;
	    argument_186_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft);
	    anLocalInt_192_ += anLocalInt_198_;
	    anLocalInt_191_ += anLocalInt_198_;
	    anLocalInt_196_ += anLocalInt_198_;
	    anLocalInt_195_ += anLocalInt_198_;
	}
	if (argument_186_ + anLocalInt_194_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipRight)) {
	    int anLocalInt_199_
		= (argument_186_ + anLocalInt_194_
		   - ((JavaToolkit)
		      ((Class368_Sub2) this).toolkit).clipRight);
	    anLocalInt_194_ -= anLocalInt_199_;
	    anLocalInt_196_ += anLocalInt_199_;
	    anLocalInt_195_ += anLocalInt_199_;
	}
	if (anLocalInt_194_ > 0 && anLocalInt_193_ > 0) {
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_190_ == 0) {
		if (argument_188_ == 1) {
		    for (int anLocalInt_200_ = -anLocalInt_193_;
			 anLocalInt_200_ < 0; anLocalInt_200_++) {
			int anLocalInt_201_
			    = anLocalInt_191_ + anLocalInt_194_ - 3;
			while (anLocalInt_191_ < anLocalInt_201_) {
			    anLocalInts[anLocalInt_191_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    anLocalInts[anLocalInt_191_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    anLocalInts[anLocalInt_191_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    anLocalInts[anLocalInt_191_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			}
			anLocalInt_201_ += 3;
			while (anLocalInt_191_ < anLocalInt_201_)
			    anLocalInts[anLocalInt_191_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 0) {
		    int anLocalInt_202_ = (argument_189_ & 0xff0000) >> 16;
		    int anLocalInt_203_ = (argument_189_ & 0xff00) >> 8;
		    int anLocalInt_204_ = argument_189_ & 0xff;
		    for (int anLocalInt_205_ = -anLocalInt_193_;
			 anLocalInt_205_ < 0; anLocalInt_205_++) {
			for (int anLocalInt_206_ = -anLocalInt_194_;
			     anLocalInt_206_ < 0; anLocalInt_206_++) {
			    int anLocalInt_207_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_208_
				= (((anLocalInt_207_ & 0xff0000)
				    * anLocalInt_202_)
				   & ~0xffffff);
			    int anLocalInt_209_
				= ((anLocalInt_207_ & 0xff00) * anLocalInt_203_
				   & 0xff0000);
			    int anLocalInt_210_
				= ((anLocalInt_207_ & 0xff) * anLocalInt_204_
				   & 0xff00);
			    anLocalInts[anLocalInt_191_++]
				= (anLocalInt_208_ | anLocalInt_209_
				   | anLocalInt_210_) >>> 8;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 3) {
		    for (int anLocalInt_211_ = -anLocalInt_193_;
			 anLocalInt_211_ < 0; anLocalInt_211_++) {
			for (int anLocalInt_212_ = -anLocalInt_194_;
			     anLocalInt_212_ < 0; anLocalInt_212_++) {
			    int anLocalInt_213_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_214_
				= anLocalInt_213_ + argument_189_;
			    int anLocalInt_215_
				= ((anLocalInt_213_ & 0xff00ff)
				   + (argument_189_ & 0xff00ff));
			    int anLocalInt_216_
				= ((anLocalInt_215_ & 0x1000100)
				   + (anLocalInt_214_ - anLocalInt_215_
				      & 0x10000));
			    anLocalInts[anLocalInt_191_++]
				= (anLocalInt_214_ - anLocalInt_216_
				   | anLocalInt_216_ - (anLocalInt_216_
							>>> 8));
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 2) {
		    int anLocalInt_217_ = argument_189_ >>> 24;
		    int anLocalInt_218_ = 256 - anLocalInt_217_;
		    int anLocalInt_219_
			= ((argument_189_ & 0xff00ff) * anLocalInt_218_
			   & ~0xff00ff);
		    int anLocalInt_220_
			= ((argument_189_ & 0xff00) * anLocalInt_218_
			   & 0xff0000);
		    argument_189_ = (anLocalInt_219_ | anLocalInt_220_) >>> 8;
		    for (int anLocalInt_221_ = -anLocalInt_193_;
			 anLocalInt_221_ < 0; anLocalInt_221_++) {
			for (int anLocalInt_222_ = -anLocalInt_194_;
			     anLocalInt_222_ < 0; anLocalInt_222_++) {
			    int anLocalInt_223_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    anLocalInt_219_ = ((anLocalInt_223_ & 0xff00ff)
					       * anLocalInt_217_) & ~0xff00ff;
			    anLocalInt_220_
				= ((anLocalInt_223_ & 0xff00) * anLocalInt_217_
				   & 0xff0000);
			    anLocalInts[anLocalInt_191_++]
				= (((anLocalInt_219_ | anLocalInt_220_) >>> 8)
				   + argument_189_);
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_190_ == 1) {
		if (argument_188_ == 1) {
		    for (int anLocalInt_224_ = -anLocalInt_193_;
			 anLocalInt_224_ < 0; anLocalInt_224_++) {
			for (int anLocalInt_225_ = -anLocalInt_194_;
			     anLocalInt_225_ < 0; anLocalInt_225_++) {
			    int anLocalInt_226_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_227_ = anLocalInt_226_ >>> 24;
			    int anLocalInt_228_ = 256 - anLocalInt_227_;
			    int anLocalInt_229_ = anLocalInts[anLocalInt_191_];
			    anLocalInts[anLocalInt_191_++]
				= ((((((anLocalInt_226_ & 0xff00ff)
				       * anLocalInt_227_)
				      + ((anLocalInt_229_ & 0xff00ff)
					 * anLocalInt_228_))
				     & ~0xff00ff)
				    >> 8)
				   + (((((anLocalInt_226_ & ~0xff00ff) >>> 8)
					* anLocalInt_227_)
				       + (((anLocalInt_229_ & ~0xff00ff) >>> 8)
					  * anLocalInt_228_))
				      & ~0xff00ff));
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 0) {
		    if ((argument_189_ & 0xffffff) == 16777215) {
			for (int anLocalInt_230_ = -anLocalInt_193_;
			     anLocalInt_230_ < 0; anLocalInt_230_++) {
			    for (int anLocalInt_231_ = -anLocalInt_194_;
				 anLocalInt_231_ < 0; anLocalInt_231_++) {
				int anLocalInt_232_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_192_++]);
				int anLocalInt_233_
				    = (anLocalInt_232_ >>> 24) * (argument_189_
								  >>> 24) >> 8;
				int anLocalInt_234_ = 256 - anLocalInt_233_;
				int anLocalInt_235_
				    = anLocalInts[anLocalInt_191_];
				anLocalInts[anLocalInt_191_++]
				    = (((((anLocalInt_232_ & 0xff00ff)
					  * anLocalInt_233_)
					 + ((anLocalInt_235_ & 0xff00ff)
					    * anLocalInt_234_))
					& ~0xff00ff)
				       + ((((anLocalInt_232_ & 0xff00)
					    * anLocalInt_233_)
					   + ((anLocalInt_235_ & 0xff00)
					      * anLocalInt_234_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInt_191_ += anLocalInt_195_;
			    anLocalInt_192_ += anLocalInt_196_;
			}
		    } else {
			int anLocalInt_236_ = (argument_189_ & 0xff0000) >> 16;
			int anLocalInt_237_ = (argument_189_ & 0xff00) >> 8;
			int anLocalInt_238_ = argument_189_ & 0xff;
			for (int anLocalInt_239_ = -anLocalInt_193_;
			     anLocalInt_239_ < 0; anLocalInt_239_++) {
			    for (int anLocalInt_240_ = -anLocalInt_194_;
				 anLocalInt_240_ < 0; anLocalInt_240_++) {
				int anLocalInt_241_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_192_++]);
				int anLocalInt_242_
				    = (anLocalInt_241_ >>> 24) * (argument_189_
								  >>> 24) >> 8;
				int anLocalInt_243_ = 256 - anLocalInt_242_;
				if (anLocalInt_242_ != 255) {
				    int anLocalInt_244_
					= (((anLocalInt_241_ & 0xff0000)
					    * anLocalInt_236_)
					   & ~0xffffff);
				    int anLocalInt_245_
					= (((anLocalInt_241_ & 0xff00)
					    * anLocalInt_237_)
					   & 0xff0000);
				    int anLocalInt_246_
					= (((anLocalInt_241_ & 0xff)
					    * anLocalInt_238_)
					   & 0xff00);
				    anLocalInt_241_
					= (anLocalInt_244_ | anLocalInt_245_
					   | anLocalInt_246_) >>> 8;
				    int anLocalInt_247_
					= anLocalInts[anLocalInt_191_];
				    anLocalInts[anLocalInt_191_++]
					= (((((anLocalInt_241_ & 0xff00ff)
					      * anLocalInt_242_)
					     + ((anLocalInt_247_ & 0xff00ff)
						* anLocalInt_243_))
					    & ~0xff00ff)
					   + ((((anLocalInt_241_ & 0xff00)
						* anLocalInt_242_)
					       + ((anLocalInt_247_ & 0xff00)
						  * anLocalInt_243_))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_248_
					= (((anLocalInt_241_ & 0xff0000)
					    * anLocalInt_236_)
					   & ~0xffffff);
				    int anLocalInt_249_
					= (((anLocalInt_241_ & 0xff00)
					    * anLocalInt_237_)
					   & 0xff0000);
				    int anLocalInt_250_
					= (((anLocalInt_241_ & 0xff)
					    * anLocalInt_238_)
					   & 0xff00);
				    anLocalInts[anLocalInt_191_++]
					= (anLocalInt_248_ | anLocalInt_249_
					   | anLocalInt_250_) >>> 8;
				}
			    }
			    anLocalInt_191_ += anLocalInt_195_;
			    anLocalInt_192_ += anLocalInt_196_;
			}
			return;
		    }
		    return;
		}
		if (argument_188_ == 3) {
		    for (int anLocalInt_251_ = -anLocalInt_193_;
			 anLocalInt_251_ < 0; anLocalInt_251_++) {
			for (int anLocalInt_252_ = -anLocalInt_194_;
			     anLocalInt_252_ < 0; anLocalInt_252_++) {
			    int anLocalInt_253_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_254_
				= anLocalInt_253_ + argument_189_;
			    int anLocalInt_255_
				= ((anLocalInt_253_ & 0xff00ff)
				   + (argument_189_ & 0xff00ff));
			    int anLocalInt_256_
				= ((anLocalInt_255_ & 0x1000100)
				   + (anLocalInt_254_ - anLocalInt_255_
				      & 0x10000));
			    anLocalInt_256_
				= (anLocalInt_254_ - anLocalInt_256_
				   | anLocalInt_256_ - (anLocalInt_256_
							>>> 8));
			    int anLocalInt_257_
				= ((anLocalInt_256_ >>> 24) * (argument_189_
							       >>> 24)
				   >> 8);
			    int anLocalInt_258_ = 256 - anLocalInt_257_;
			    if (anLocalInt_257_ != 255) {
				anLocalInt_253_ = anLocalInt_256_;
				anLocalInt_256_ = anLocalInts[anLocalInt_191_];
				anLocalInt_256_
				    = (((((anLocalInt_253_ & 0xff00ff)
					  * anLocalInt_257_)
					 + ((anLocalInt_256_ & 0xff00ff)
					    * anLocalInt_258_))
					& ~0xff00ff)
				       + ((((anLocalInt_253_ & 0xff00)
					    * anLocalInt_257_)
					   + ((anLocalInt_256_ & 0xff00)
					      * anLocalInt_258_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts[anLocalInt_191_++] = anLocalInt_256_;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 2) {
		    int anLocalInt_259_ = argument_189_ >>> 24;
		    int anLocalInt_260_ = 256 - anLocalInt_259_;
		    int anLocalInt_261_
			= ((argument_189_ & 0xff00ff) * anLocalInt_260_
			   & ~0xff00ff);
		    int anLocalInt_262_
			= ((argument_189_ & 0xff00) * anLocalInt_260_
			   & 0xff0000);
		    argument_189_ = (anLocalInt_261_ | anLocalInt_262_) >>> 8;
		    for (int anLocalInt_263_ = -anLocalInt_193_;
			 anLocalInt_263_ < 0; anLocalInt_263_++) {
			for (int anLocalInt_264_ = -anLocalInt_194_;
			     anLocalInt_264_ < 0; anLocalInt_264_++) {
			    int anLocalInt_265_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_266_ = anLocalInt_265_ >>> 24;
			    int anLocalInt_267_ = 256 - anLocalInt_266_;
			    anLocalInt_261_ = ((anLocalInt_265_ & 0xff00ff)
					       * anLocalInt_259_) & ~0xff00ff;
			    anLocalInt_262_
				= ((anLocalInt_265_ & 0xff00) * anLocalInt_259_
				   & 0xff0000);
			    anLocalInt_265_
				= (((anLocalInt_261_ | anLocalInt_262_) >>> 8)
				   + argument_189_);
			    int anLocalInt_268_ = anLocalInts[anLocalInt_191_];
			    anLocalInts[anLocalInt_191_++]
				= (((((anLocalInt_265_ & 0xff00ff)
				      * anLocalInt_266_)
				     + ((anLocalInt_268_ & 0xff00ff)
					* anLocalInt_267_))
				    & ~0xff00ff)
				   + ((((anLocalInt_265_ & 0xff00)
					* anLocalInt_266_)
				       + ((anLocalInt_268_ & 0xff00)
					  * anLocalInt_267_))
				      & 0xff0000)) >> 8;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_190_ == 2) {
		if (argument_188_ == 1) {
		    for (int anLocalInt_269_ = -anLocalInt_193_;
			 anLocalInt_269_ < 0; anLocalInt_269_++) {
			for (int anLocalInt_270_ = -anLocalInt_194_;
			     anLocalInt_270_ < 0; anLocalInt_270_++) {
			    int anLocalInt_271_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    if (anLocalInt_271_ != 0) {
				int anLocalInt_272_
				    = anLocalInts[anLocalInt_191_];
				int anLocalInt_273_
				    = anLocalInt_271_ + anLocalInt_272_;
				int anLocalInt_274_
				    = ((anLocalInt_271_ & 0xff00ff)
				       + (anLocalInt_272_ & 0xff00ff));
				anLocalInt_272_
				    = ((anLocalInt_274_ & 0x1000100)
				       + (anLocalInt_273_ - anLocalInt_274_
					  & 0x10000));
				anLocalInts[anLocalInt_191_++]
				    = (anLocalInt_273_ - anLocalInt_272_
				       | anLocalInt_272_ - (anLocalInt_272_
							    >>> 8));
			    } else
				anLocalInt_191_++;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 0) {
		    int anLocalInt_275_ = (argument_189_ & 0xff0000) >> 16;
		    int anLocalInt_276_ = (argument_189_ & 0xff00) >> 8;
		    int anLocalInt_277_ = argument_189_ & 0xff;
		    for (int anLocalInt_278_ = -anLocalInt_193_;
			 anLocalInt_278_ < 0; anLocalInt_278_++) {
			for (int anLocalInt_279_ = -anLocalInt_194_;
			     anLocalInt_279_ < 0; anLocalInt_279_++) {
			    int anLocalInt_280_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    if (anLocalInt_280_ != 0) {
				int anLocalInt_281_
				    = (((anLocalInt_280_ & 0xff0000)
					* anLocalInt_275_)
				       & ~0xffffff);
				int anLocalInt_282_
				    = (((anLocalInt_280_ & 0xff00)
					* anLocalInt_276_)
				       & 0xff0000);
				int anLocalInt_283_
				    = (((anLocalInt_280_ & 0xff)
					* anLocalInt_277_)
				       & 0xff00);
				anLocalInt_280_
				    = (anLocalInt_281_ | anLocalInt_282_
				       | anLocalInt_283_) >>> 8;
				int anLocalInt_284_
				    = anLocalInts[anLocalInt_191_];
				int anLocalInt_285_
				    = anLocalInt_280_ + anLocalInt_284_;
				int anLocalInt_286_
				    = ((anLocalInt_280_ & 0xff00ff)
				       + (anLocalInt_284_ & 0xff00ff));
				anLocalInt_284_
				    = ((anLocalInt_286_ & 0x1000100)
				       + (anLocalInt_285_ - anLocalInt_286_
					  & 0x10000));
				anLocalInts[anLocalInt_191_++]
				    = (anLocalInt_285_ - anLocalInt_284_
				       | anLocalInt_284_ - (anLocalInt_284_
							    >>> 8));
			    } else
				anLocalInt_191_++;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 3) {
		    for (int anLocalInt_287_ = -anLocalInt_193_;
			 anLocalInt_287_ < 0; anLocalInt_287_++) {
			for (int anLocalInt_288_ = -anLocalInt_194_;
			     anLocalInt_288_ < 0; anLocalInt_288_++) {
			    int anLocalInt_289_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    int anLocalInt_290_
				= anLocalInt_289_ + argument_189_;
			    int anLocalInt_291_
				= ((anLocalInt_289_ & 0xff00ff)
				   + (argument_189_ & 0xff00ff));
			    int anLocalInt_292_
				= ((anLocalInt_291_ & 0x1000100)
				   + (anLocalInt_290_ - anLocalInt_291_
				      & 0x10000));
			    anLocalInt_289_
				= (anLocalInt_290_ - anLocalInt_292_
				   | anLocalInt_292_ - (anLocalInt_292_
							>>> 8));
			    anLocalInt_292_ = anLocalInts[anLocalInt_191_];
			    anLocalInt_290_
				= anLocalInt_289_ + anLocalInt_292_;
			    anLocalInt_291_ = ((anLocalInt_289_ & 0xff00ff)
					       + (anLocalInt_292_ & 0xff00ff));
			    anLocalInt_292_
				= ((anLocalInt_291_ & 0x1000100)
				   + (anLocalInt_290_ - anLocalInt_291_
				      & 0x10000));
			    anLocalInts[anLocalInt_191_++]
				= (anLocalInt_290_ - anLocalInt_292_
				   | anLocalInt_292_ - (anLocalInt_292_
							>>> 8));
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		if (argument_188_ == 2) {
		    int anLocalInt_293_ = argument_189_ >>> 24;
		    int anLocalInt_294_ = 256 - anLocalInt_293_;
		    int anLocalInt_295_
			= ((argument_189_ & 0xff00ff) * anLocalInt_294_
			   & ~0xff00ff);
		    int anLocalInt_296_
			= ((argument_189_ & 0xff00) * anLocalInt_294_
			   & 0xff0000);
		    argument_189_ = (anLocalInt_295_ | anLocalInt_296_) >>> 8;
		    for (int anLocalInt_297_ = -anLocalInt_193_;
			 anLocalInt_297_ < 0; anLocalInt_297_++) {
			for (int anLocalInt_298_ = -anLocalInt_194_;
			     anLocalInt_298_ < 0; anLocalInt_298_++) {
			    int anLocalInt_299_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_192_++]);
			    if (anLocalInt_299_ != 0) {
				anLocalInt_295_
				    = ((anLocalInt_299_ & 0xff00ff)
				       * anLocalInt_293_) & ~0xff00ff;
				anLocalInt_296_
				    = ((anLocalInt_299_ & 0xff00)
				       * anLocalInt_293_) & 0xff0000;
				anLocalInt_299_
				    = ((anLocalInt_295_ | anLocalInt_296_)
				       >>> 8) + argument_189_;
				int anLocalInt_300_
				    = anLocalInts[anLocalInt_191_];
				int anLocalInt_301_
				    = anLocalInt_299_ + anLocalInt_300_;
				int anLocalInt_302_
				    = ((anLocalInt_299_ & 0xff00ff)
				       + (anLocalInt_300_ & 0xff00ff));
				anLocalInt_300_
				    = ((anLocalInt_302_ & 0x1000100)
				       + (anLocalInt_301_ - anLocalInt_302_
					  & 0x10000));
				anLocalInts[anLocalInt_191_++]
				    = (anLocalInt_301_ - anLocalInt_300_
				       | anLocalInt_300_ - (anLocalInt_300_
							    >>> 8));
			    } else
				anLocalInt_191_++;
			}
			anLocalInt_191_ += anLocalInt_195_;
			anLocalInt_192_ += anLocalInt_196_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    Class368_Sub2_Sub2(JavaToolkit argument_303_, int argument_304_,
		       int argument_305_) {
	super(argument_303_, argument_304_, argument_305_);
	((Class368_Sub2_Sub2) this).anIntArray6635
	    = new int[argument_304_ * argument_305_];
    }
    
    final void method4030(int[] argument_306_, int[] argument_307_,
			  int argument_308_, int argument_309_) {
	int[] anLocalInts
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .pixels);
	if (Class368_Sub2.anInt5717 == 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_310_ = anLocalInt + argument_309_;
		    if (anLocalInt_310_ >= 0) {
			if (anLocalInt_310_ >= argument_306_.length)
			    break;
			int anLocalInt_311_ = Class368_Sub2.anInt5724;
			int anLocalInt_312_ = Class368_Sub2.anInt5710;
			int anLocalInt_313_ = Class368_Sub2.anInt5704;
			int anLocalInt_314_ = Class368_Sub2.anInt5713;
			if (anLocalInt_312_ >= 0 && anLocalInt_313_ >= 0
			    && (anLocalInt_312_
				- (((Class368_Sub2) this).width << 12)) < 0
			    && ((anLocalInt_313_
				 - (((Class368_Sub2) this).height << 12))
				< 0)) {
			    int anLocalInt_315_
				= (argument_306_[anLocalInt_310_]
				   - argument_308_);
			    int anLocalInt_316_
				= -argument_307_[anLocalInt_310_];
			    int anLocalInt_317_
				= (anLocalInt_315_
				   - (anLocalInt_311_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_317_ > 0) {
				anLocalInt_311_ += anLocalInt_317_;
				anLocalInt_314_ += anLocalInt_317_;
				anLocalInt_312_ += (Class368_Sub2.anInt5717
						    * anLocalInt_317_);
				anLocalInt_313_ += (Class368_Sub2.anInt5712
						    * anLocalInt_317_);
			    } else
				anLocalInt_316_ -= anLocalInt_317_;
			    if (anLocalInt_314_ < anLocalInt_316_)
				anLocalInt_314_ = anLocalInt_316_;
			    for (/**/; anLocalInt_314_ < 0;
				 anLocalInt_314_++) {
				int anLocalInt_318_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(((anLocalInt_313_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_312_ >> 12))]);
				int anLocalInt_319_ = anLocalInt_318_ >>> 24;
				int anLocalInt_320_ = 256 - anLocalInt_319_;
				int anLocalInt_321_
				    = anLocalInts[anLocalInt_311_];
				anLocalInts[anLocalInt_311_++]
				    = (((((anLocalInt_318_ & 0xff00ff)
					  * anLocalInt_319_)
					 + ((anLocalInt_321_ & 0xff00ff)
					    * anLocalInt_320_))
					& ~0xff00ff)
				       + ((((anLocalInt_318_ & 0xff00)
					    * anLocalInt_319_)
					   + ((anLocalInt_321_ & 0xff00)
					      * anLocalInt_320_))
					  & 0xff0000)) >> 8;
			    }
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_322_ = anLocalInt + argument_309_;
		    if (anLocalInt_322_ >= 0) {
			if (anLocalInt_322_ >= argument_306_.length)
			    break;
			int anLocalInt_323_ = Class368_Sub2.anInt5724;
			int anLocalInt_324_ = Class368_Sub2.anInt5710;
			int anLocalInt_325_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_326_ = Class368_Sub2.anInt5713;
			if (anLocalInt_324_ >= 0
			    && ((anLocalInt_324_
				 - (((Class368_Sub2) this).width << 12))
				< 0)) {
			    int anLocalInt_327_;
			    if ((anLocalInt_327_
				 = (anLocalInt_325_
				    - (((Class368_Sub2) this).height
				       << 12)))
				>= 0) {
				anLocalInt_327_ = ((Class368_Sub2.anInt5712
						    - anLocalInt_327_)
						   / Class368_Sub2.anInt5712);
				anLocalInt_326_ += anLocalInt_327_;
				anLocalInt_325_ += (Class368_Sub2.anInt5712
						    * anLocalInt_327_);
				anLocalInt_323_ += anLocalInt_327_;
			    }
			    if ((anLocalInt_327_
				 = ((anLocalInt_325_ - Class368_Sub2.anInt5712)
				    / Class368_Sub2.anInt5712))
				> anLocalInt_326_)
				anLocalInt_326_ = anLocalInt_327_;
			    int anLocalInt_328_
				= (argument_306_[anLocalInt_322_]
				   - argument_308_);
			    int anLocalInt_329_
				= -argument_307_[anLocalInt_322_];
			    int anLocalInt_330_
				= (anLocalInt_328_
				   - (anLocalInt_323_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_330_ > 0) {
				anLocalInt_323_ += anLocalInt_330_;
				anLocalInt_326_ += anLocalInt_330_;
				anLocalInt_324_ += (Class368_Sub2.anInt5717
						    * anLocalInt_330_);
				anLocalInt_325_ += (Class368_Sub2.anInt5712
						    * anLocalInt_330_);
			    } else
				anLocalInt_329_ -= anLocalInt_330_;
			    if (anLocalInt_326_ < anLocalInt_329_)
				anLocalInt_326_ = anLocalInt_329_;
			    for (/**/; anLocalInt_326_ < 0;
				 anLocalInt_326_++) {
				int anLocalInt_331_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(((anLocalInt_325_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_324_ >> 12))]);
				int anLocalInt_332_ = anLocalInt_331_ >>> 24;
				int anLocalInt_333_ = 256 - anLocalInt_332_;
				int anLocalInt_334_
				    = anLocalInts[anLocalInt_323_];
				anLocalInts[anLocalInt_323_++]
				    = (((((anLocalInt_331_ & 0xff00ff)
					  * anLocalInt_332_)
					 + ((anLocalInt_334_ & 0xff00ff)
					    * anLocalInt_333_))
					& ~0xff00ff)
				       + ((((anLocalInt_331_ & 0xff00)
					    * anLocalInt_332_)
					   + ((anLocalInt_334_ & 0xff00)
					      * anLocalInt_333_))
					  & 0xff0000)) >> 8;
				anLocalInt_325_ += Class368_Sub2.anInt5712;
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
		    int anLocalInt_335_ = anLocalInt + argument_309_;
		    if (anLocalInt_335_ >= 0) {
			if (anLocalInt_335_ >= argument_306_.length)
			    break;
			int anLocalInt_336_ = Class368_Sub2.anInt5724;
			int anLocalInt_337_ = Class368_Sub2.anInt5710;
			int anLocalInt_338_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_339_ = Class368_Sub2.anInt5713;
			if (anLocalInt_337_ >= 0
			    && ((anLocalInt_337_
				 - (((Class368_Sub2) this).width << 12))
				< 0)) {
			    if (anLocalInt_338_ < 0) {
				int anLocalInt_340_
				    = ((Class368_Sub2.anInt5712 - 1
					- anLocalInt_338_)
				       / Class368_Sub2.anInt5712);
				anLocalInt_339_ += anLocalInt_340_;
				anLocalInt_338_ += (Class368_Sub2.anInt5712
						    * anLocalInt_340_);
				anLocalInt_336_ += anLocalInt_340_;
			    }
			    int anLocalInt_341_;
			    if ((anLocalInt_341_
				 = ((anLocalInt_338_ + 1
				     - (((Class368_Sub2) this).height << 12)
				     - Class368_Sub2.anInt5712)
				    / Class368_Sub2.anInt5712))
				> anLocalInt_339_)
				anLocalInt_339_ = anLocalInt_341_;
			    int anLocalInt_342_
				= (argument_306_[anLocalInt_335_]
				   - argument_308_);
			    int anLocalInt_343_
				= -argument_307_[anLocalInt_335_];
			    int anLocalInt_344_
				= (anLocalInt_342_
				   - (anLocalInt_336_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_344_ > 0) {
				anLocalInt_336_ += anLocalInt_344_;
				anLocalInt_339_ += anLocalInt_344_;
				anLocalInt_337_ += (Class368_Sub2.anInt5717
						    * anLocalInt_344_);
				anLocalInt_338_ += (Class368_Sub2.anInt5712
						    * anLocalInt_344_);
			    } else
				anLocalInt_343_ -= anLocalInt_344_;
			    if (anLocalInt_339_ < anLocalInt_343_)
				anLocalInt_339_ = anLocalInt_343_;
			    for (/**/; anLocalInt_339_ < 0;
				 anLocalInt_339_++) {
				int anLocalInt_345_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(((anLocalInt_338_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_337_ >> 12))]);
				int anLocalInt_346_ = anLocalInt_345_ >>> 24;
				int anLocalInt_347_ = 256 - anLocalInt_346_;
				int anLocalInt_348_
				    = anLocalInts[anLocalInt_336_];
				anLocalInts[anLocalInt_336_++]
				    = (((((anLocalInt_345_ & 0xff00ff)
					  * anLocalInt_346_)
					 + ((anLocalInt_348_ & 0xff00ff)
					    * anLocalInt_347_))
					& ~0xff00ff)
				       + ((((anLocalInt_345_ & 0xff00)
					    * anLocalInt_346_)
					   + ((anLocalInt_348_ & 0xff00)
					      * anLocalInt_347_))
					  & 0xff0000)) >> 8;
				anLocalInt_338_ += Class368_Sub2.anInt5712;
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
		    int anLocalInt_349_ = anLocalInt + argument_309_;
		    if (anLocalInt_349_ >= 0) {
			if (anLocalInt_349_ >= argument_306_.length)
			    break;
			int anLocalInt_350_ = Class368_Sub2.anInt5724;
			int anLocalInt_351_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_352_ = Class368_Sub2.anInt5704;
			int anLocalInt_353_ = Class368_Sub2.anInt5713;
			if (anLocalInt_352_ >= 0
			    && ((anLocalInt_352_
				 - (((Class368_Sub2) this).height << 12))
				< 0)) {
			    int anLocalInt_354_;
			    if ((anLocalInt_354_
				 = (anLocalInt_351_
				    - (((Class368_Sub2) this).width
				       << 12)))
				>= 0) {
				anLocalInt_354_ = ((Class368_Sub2.anInt5717
						    - anLocalInt_354_)
						   / Class368_Sub2.anInt5717);
				anLocalInt_353_ += anLocalInt_354_;
				anLocalInt_351_ += (Class368_Sub2.anInt5717
						    * anLocalInt_354_);
				anLocalInt_350_ += anLocalInt_354_;
			    }
			    if ((anLocalInt_354_
				 = ((anLocalInt_351_ - Class368_Sub2.anInt5717)
				    / Class368_Sub2.anInt5717))
				> anLocalInt_353_)
				anLocalInt_353_ = anLocalInt_354_;
			    int anLocalInt_355_
				= (argument_306_[anLocalInt_349_]
				   - argument_308_);
			    int anLocalInt_356_
				= -argument_307_[anLocalInt_349_];
			    int anLocalInt_357_
				= (anLocalInt_355_
				   - (anLocalInt_350_
				      - Class368_Sub2.anInt5724));
			    if (anLocalInt_357_ > 0) {
				anLocalInt_350_ += anLocalInt_357_;
				anLocalInt_353_ += anLocalInt_357_;
				anLocalInt_351_ += (Class368_Sub2.anInt5717
						    * anLocalInt_357_);
				anLocalInt_352_ += (Class368_Sub2.anInt5712
						    * anLocalInt_357_);
			    } else
				anLocalInt_356_ -= anLocalInt_357_;
			    if (anLocalInt_353_ < anLocalInt_356_)
				anLocalInt_353_ = anLocalInt_356_;
			    for (/**/; anLocalInt_353_ < 0;
				 anLocalInt_353_++) {
				int anLocalInt_358_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [(((anLocalInt_352_ >> 12)
					  * ((Class368_Sub2) this).width)
					 + (anLocalInt_351_ >> 12))]);
				int anLocalInt_359_ = anLocalInt_358_ >>> 24;
				int anLocalInt_360_ = 256 - anLocalInt_359_;
				int anLocalInt_361_
				    = anLocalInts[anLocalInt_350_];
				anLocalInts[anLocalInt_350_++]
				    = (((((anLocalInt_358_ & 0xff00ff)
					  * anLocalInt_359_)
					 + ((anLocalInt_361_ & 0xff00ff)
					    * anLocalInt_360_))
					& ~0xff00ff)
				       + ((((anLocalInt_358_ & 0xff00)
					    * anLocalInt_359_)
					   + ((anLocalInt_361_ & 0xff00)
					      * anLocalInt_360_))
					  & 0xff0000)) >> 8;
				anLocalInt_351_ += Class368_Sub2.anInt5717;
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
		    int anLocalInt_362_ = anLocalInt + argument_309_;
		    if (anLocalInt_362_ >= 0) {
			if (anLocalInt_362_ >= argument_306_.length)
			    break;
			int anLocalInt_363_ = Class368_Sub2.anInt5724;
			int anLocalInt_364_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_365_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_366_ = Class368_Sub2.anInt5713;
			int anLocalInt_367_;
			if ((anLocalInt_367_
			     = (anLocalInt_364_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_367_
				= ((Class368_Sub2.anInt5717 - anLocalInt_367_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_366_ += anLocalInt_367_;
			    anLocalInt_364_
				+= Class368_Sub2.anInt5717 * anLocalInt_367_;
			    anLocalInt_365_
				+= Class368_Sub2.anInt5712 * anLocalInt_367_;
			    anLocalInt_363_ += anLocalInt_367_;
			}
			if ((anLocalInt_367_
			     = ((anLocalInt_364_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_366_)
			    anLocalInt_366_ = anLocalInt_367_;
			if ((anLocalInt_367_
			     = (anLocalInt_365_
				- (((Class368_Sub2) this).height << 12)))
			    >= 0) {
			    anLocalInt_367_
				= ((Class368_Sub2.anInt5712 - anLocalInt_367_)
				   / Class368_Sub2.anInt5712);
			    anLocalInt_366_ += anLocalInt_367_;
			    anLocalInt_364_
				+= Class368_Sub2.anInt5717 * anLocalInt_367_;
			    anLocalInt_365_
				+= Class368_Sub2.anInt5712 * anLocalInt_367_;
			    anLocalInt_363_ += anLocalInt_367_;
			}
			if ((anLocalInt_367_
			     = ((anLocalInt_365_ - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_366_)
			    anLocalInt_366_ = anLocalInt_367_;
			int anLocalInt_368_
			    = argument_306_[anLocalInt_362_] - argument_308_;
			int anLocalInt_369_ = -argument_307_[anLocalInt_362_];
			int anLocalInt_370_
			    = (anLocalInt_368_
			       - (anLocalInt_363_ - Class368_Sub2.anInt5724));
			if (anLocalInt_370_ > 0) {
			    anLocalInt_363_ += anLocalInt_370_;
			    anLocalInt_366_ += anLocalInt_370_;
			    anLocalInt_364_
				+= Class368_Sub2.anInt5717 * anLocalInt_370_;
			    anLocalInt_365_
				+= Class368_Sub2.anInt5712 * anLocalInt_370_;
			} else
			    anLocalInt_369_ -= anLocalInt_370_;
			if (anLocalInt_366_ < anLocalInt_369_)
			    anLocalInt_366_ = anLocalInt_369_;
			for (/**/; anLocalInt_366_ < 0; anLocalInt_366_++) {
			    int anLocalInt_371_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(((anLocalInt_365_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_364_ >> 12))]);
			    int anLocalInt_372_ = anLocalInt_371_ >>> 24;
			    int anLocalInt_373_ = 256 - anLocalInt_372_;
			    int anLocalInt_374_ = anLocalInts[anLocalInt_363_];
			    anLocalInts[anLocalInt_363_++]
				= (((((anLocalInt_371_ & 0xff00ff)
				      * anLocalInt_372_)
				     + ((anLocalInt_374_ & 0xff00ff)
					* anLocalInt_373_))
				    & ~0xff00ff)
				   + ((((anLocalInt_371_ & 0xff00)
					* anLocalInt_372_)
				       + ((anLocalInt_374_ & 0xff00)
					  * anLocalInt_373_))
				      & 0xff0000)) >> 8;
			    anLocalInt_364_ += Class368_Sub2.anInt5717;
			    anLocalInt_365_ += Class368_Sub2.anInt5712;
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
		    int anLocalInt_375_ = anLocalInt + argument_309_;
		    if (anLocalInt_375_ >= 0) {
			if (anLocalInt_375_ >= argument_306_.length)
			    break;
			int anLocalInt_376_ = Class368_Sub2.anInt5724;
			int anLocalInt_377_ = (Class368_Sub2.anInt5710
					       + Class368_Sub2.anInt5721);
			int anLocalInt_378_ = (Class368_Sub2.anInt5704
					       + Class368_Sub2.anInt5725);
			int anLocalInt_379_ = Class368_Sub2.anInt5713;
			int anLocalInt_380_;
			if ((anLocalInt_380_
			     = (anLocalInt_377_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_380_
				= ((Class368_Sub2.anInt5717 - anLocalInt_380_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_379_ += anLocalInt_380_;
			    anLocalInt_377_
				+= Class368_Sub2.anInt5717 * anLocalInt_380_;
			    anLocalInt_378_
				+= Class368_Sub2.anInt5712 * anLocalInt_380_;
			    anLocalInt_376_ += anLocalInt_380_;
			}
			if ((anLocalInt_380_
			     = ((anLocalInt_377_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_379_)
			    anLocalInt_379_ = anLocalInt_380_;
			if (anLocalInt_378_ < 0) {
			    anLocalInt_380_ = ((Class368_Sub2.anInt5712 - 1
						- anLocalInt_378_)
					       / Class368_Sub2.anInt5712);
			    anLocalInt_379_ += anLocalInt_380_;
			    anLocalInt_377_
				+= Class368_Sub2.anInt5717 * anLocalInt_380_;
			    anLocalInt_378_
				+= Class368_Sub2.anInt5712 * anLocalInt_380_;
			    anLocalInt_376_ += anLocalInt_380_;
			}
			if ((anLocalInt_380_
			     = ((anLocalInt_378_ + 1
				 - (((Class368_Sub2) this).height << 12)
				 - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_379_)
			    anLocalInt_379_ = anLocalInt_380_;
			int anLocalInt_381_
			    = argument_306_[anLocalInt_375_] - argument_308_;
			int anLocalInt_382_ = -argument_307_[anLocalInt_375_];
			int anLocalInt_383_
			    = (anLocalInt_381_
			       - (anLocalInt_376_ - Class368_Sub2.anInt5724));
			if (anLocalInt_383_ > 0) {
			    anLocalInt_376_ += anLocalInt_383_;
			    anLocalInt_379_ += anLocalInt_383_;
			    anLocalInt_377_
				+= Class368_Sub2.anInt5717 * anLocalInt_383_;
			    anLocalInt_378_
				+= Class368_Sub2.anInt5712 * anLocalInt_383_;
			} else
			    anLocalInt_382_ -= anLocalInt_383_;
			if (anLocalInt_379_ < anLocalInt_382_)
			    anLocalInt_379_ = anLocalInt_382_;
			for (/**/; anLocalInt_379_ < 0; anLocalInt_379_++) {
			    int anLocalInt_384_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(((anLocalInt_378_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_377_ >> 12))]);
			    int anLocalInt_385_ = anLocalInt_384_ >>> 24;
			    int anLocalInt_386_ = 256 - anLocalInt_385_;
			    int anLocalInt_387_ = anLocalInts[anLocalInt_376_];
			    anLocalInts[anLocalInt_376_++]
				= (((((anLocalInt_384_ & 0xff00ff)
				      * anLocalInt_385_)
				     + ((anLocalInt_387_ & 0xff00ff)
					* anLocalInt_386_))
				    & ~0xff00ff)
				   + ((((anLocalInt_384_ & 0xff00)
					* anLocalInt_385_)
				       + ((anLocalInt_387_ & 0xff00)
					  * anLocalInt_386_))
				      & 0xff0000)) >> 8;
			    anLocalInt_377_ += Class368_Sub2.anInt5717;
			    anLocalInt_378_ += Class368_Sub2.anInt5712;
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
		int anLocalInt_388_ = anLocalInt + argument_309_;
		if (anLocalInt_388_ >= 0) {
		    if (anLocalInt_388_ >= argument_306_.length)
			break;
		    int anLocalInt_389_ = Class368_Sub2.anInt5724;
		    int anLocalInt_390_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_391_ = Class368_Sub2.anInt5704;
		    int anLocalInt_392_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_391_ >= 0
			&& anLocalInt_391_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			if (anLocalInt_390_ < 0) {
			    int anLocalInt_393_ = ((Class368_Sub2.anInt5717 - 1
						    - anLocalInt_390_)
						   / Class368_Sub2.anInt5717);
			    anLocalInt_392_ += anLocalInt_393_;
			    anLocalInt_390_
				+= Class368_Sub2.anInt5717 * anLocalInt_393_;
			    anLocalInt_389_ += anLocalInt_393_;
			}
			int anLocalInt_394_;
			if ((anLocalInt_394_
			     = ((anLocalInt_390_ + 1
				 - (((Class368_Sub2) this).width << 12)
				 - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_392_)
			    anLocalInt_392_ = anLocalInt_394_;
			int anLocalInt_395_
			    = argument_306_[anLocalInt_388_] - argument_308_;
			int anLocalInt_396_ = -argument_307_[anLocalInt_388_];
			int anLocalInt_397_
			    = (anLocalInt_395_
			       - (anLocalInt_389_ - Class368_Sub2.anInt5724));
			if (anLocalInt_397_ > 0) {
			    anLocalInt_389_ += anLocalInt_397_;
			    anLocalInt_392_ += anLocalInt_397_;
			    anLocalInt_390_
				+= Class368_Sub2.anInt5717 * anLocalInt_397_;
			    anLocalInt_391_
				+= Class368_Sub2.anInt5712 * anLocalInt_397_;
			} else
			    anLocalInt_396_ -= anLocalInt_397_;
			if (anLocalInt_392_ < anLocalInt_396_)
			    anLocalInt_392_ = anLocalInt_396_;
			for (/**/; anLocalInt_392_ < 0; anLocalInt_392_++) {
			    int anLocalInt_398_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(((anLocalInt_391_ >> 12)
				      * ((Class368_Sub2) this).width)
				     + (anLocalInt_390_ >> 12))]);
			    int anLocalInt_399_ = anLocalInt_398_ >>> 24;
			    int anLocalInt_400_ = 256 - anLocalInt_399_;
			    int anLocalInt_401_ = anLocalInts[anLocalInt_389_];
			    anLocalInts[anLocalInt_389_++]
				= (((((anLocalInt_398_ & 0xff00ff)
				      * anLocalInt_399_)
				     + ((anLocalInt_401_ & 0xff00ff)
					* anLocalInt_400_))
				    & ~0xff00ff)
				   + ((((anLocalInt_398_ & 0xff00)
					* anLocalInt_399_)
				       + ((anLocalInt_401_ & 0xff00)
					  * anLocalInt_400_))
				      & 0xff0000)) >> 8;
			    anLocalInt_390_ += Class368_Sub2.anInt5717;
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
		int anLocalInt_402_ = anLocalInt + argument_309_;
		if (anLocalInt_402_ >= 0) {
		    if (anLocalInt_402_ >= argument_306_.length)
			break;
		    int anLocalInt_403_ = Class368_Sub2.anInt5724;
		    int anLocalInt_404_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_405_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_406_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_404_ < 0) {
			int anLocalInt_407_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_404_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_406_ += anLocalInt_407_;
			anLocalInt_404_
			    += Class368_Sub2.anInt5717 * anLocalInt_407_;
			anLocalInt_405_
			    += Class368_Sub2.anInt5712 * anLocalInt_407_;
			anLocalInt_403_ += anLocalInt_407_;
		    }
		    int anLocalInt_408_;
		    if ((anLocalInt_408_
			 = ((anLocalInt_404_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_406_)
			anLocalInt_406_ = anLocalInt_408_;
		    if ((anLocalInt_408_
			 = anLocalInt_405_ - (((Class368_Sub2) this).height
					      << 12))
			>= 0) {
			anLocalInt_408_
			    = ((Class368_Sub2.anInt5712 - anLocalInt_408_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_406_ += anLocalInt_408_;
			anLocalInt_404_
			    += Class368_Sub2.anInt5717 * anLocalInt_408_;
			anLocalInt_405_
			    += Class368_Sub2.anInt5712 * anLocalInt_408_;
			anLocalInt_403_ += anLocalInt_408_;
		    }
		    if ((anLocalInt_408_
			 = ((anLocalInt_405_ - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_406_)
			anLocalInt_406_ = anLocalInt_408_;
		    int anLocalInt_409_
			= argument_306_[anLocalInt_402_] - argument_308_;
		    int anLocalInt_410_ = -argument_307_[anLocalInt_402_];
		    int anLocalInt_411_
			= (anLocalInt_409_
			   - (anLocalInt_403_ - Class368_Sub2.anInt5724));
		    if (anLocalInt_411_ > 0) {
			anLocalInt_403_ += anLocalInt_411_;
			anLocalInt_406_ += anLocalInt_411_;
			anLocalInt_404_
			    += Class368_Sub2.anInt5717 * anLocalInt_411_;
			anLocalInt_405_
			    += Class368_Sub2.anInt5712 * anLocalInt_411_;
		    } else
			anLocalInt_410_ -= anLocalInt_411_;
		    if (anLocalInt_406_ < anLocalInt_410_)
			anLocalInt_406_ = anLocalInt_410_;
		    for (/**/; anLocalInt_406_ < 0; anLocalInt_406_++) {
			int anLocalInt_412_
			    = (((Class368_Sub2_Sub2) this).anIntArray6635
			       [(((anLocalInt_405_ >> 12)
				  * ((Class368_Sub2) this).width)
				 + (anLocalInt_404_ >> 12))]);
			int anLocalInt_413_ = anLocalInt_412_ >>> 24;
			int anLocalInt_414_ = 256 - anLocalInt_413_;
			int anLocalInt_415_ = anLocalInts[anLocalInt_403_];
			anLocalInts[anLocalInt_403_++]
			    = ((((anLocalInt_412_ & 0xff00ff) * anLocalInt_413_
				 + ((anLocalInt_415_ & 0xff00ff)
				    * anLocalInt_414_))
				& ~0xff00ff)
			       + (((anLocalInt_412_ & 0xff00) * anLocalInt_413_
				   + ((anLocalInt_415_ & 0xff00)
				      * anLocalInt_414_))
				  & 0xff0000)) >> 8;
			anLocalInt_404_ += Class368_Sub2.anInt5717;
			anLocalInt_405_ += Class368_Sub2.anInt5712;
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
		int anLocalInt_416_ = anLocalInt + argument_309_;
		if (anLocalInt_416_ >= 0) {
		    if (anLocalInt_416_ >= argument_306_.length)
			break;
		    int anLocalInt_417_ = Class368_Sub2.anInt5724;
		    int anLocalInt_418_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_419_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_420_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_418_ < 0) {
			int anLocalInt_421_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_418_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_420_ += anLocalInt_421_;
			anLocalInt_418_
			    += Class368_Sub2.anInt5717 * anLocalInt_421_;
			anLocalInt_419_
			    += Class368_Sub2.anInt5712 * anLocalInt_421_;
			anLocalInt_417_ += anLocalInt_421_;
		    }
		    int anLocalInt_422_;
		    if ((anLocalInt_422_
			 = ((anLocalInt_418_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_420_)
			anLocalInt_420_ = anLocalInt_422_;
		    if (anLocalInt_419_ < 0) {
			anLocalInt_422_
			    = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_419_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_420_ += anLocalInt_422_;
			anLocalInt_418_
			    += Class368_Sub2.anInt5717 * anLocalInt_422_;
			anLocalInt_419_
			    += Class368_Sub2.anInt5712 * anLocalInt_422_;
			anLocalInt_417_ += anLocalInt_422_;
		    }
		    if ((anLocalInt_422_
			 = ((anLocalInt_419_ + 1
			     - (((Class368_Sub2) this).height << 12)
			     - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_420_)
			anLocalInt_420_ = anLocalInt_422_;
		    int anLocalInt_423_
			= argument_306_[anLocalInt_416_] - argument_308_;
		    int anLocalInt_424_ = -argument_307_[anLocalInt_416_];
		    int anLocalInt_425_
			= (anLocalInt_423_
			   - (anLocalInt_417_ - Class368_Sub2.anInt5724));
		    if (anLocalInt_425_ > 0) {
			anLocalInt_417_ += anLocalInt_425_;
			anLocalInt_420_ += anLocalInt_425_;
			anLocalInt_418_
			    += Class368_Sub2.anInt5717 * anLocalInt_425_;
			anLocalInt_419_
			    += Class368_Sub2.anInt5712 * anLocalInt_425_;
		    } else
			anLocalInt_424_ -= anLocalInt_425_;
		    if (anLocalInt_420_ < anLocalInt_424_)
			anLocalInt_420_ = anLocalInt_424_;
		    for (/**/; anLocalInt_420_ < 0; anLocalInt_420_++) {
			int anLocalInt_426_
			    = (((Class368_Sub2_Sub2) this).anIntArray6635
			       [(((anLocalInt_419_ >> 12)
				  * ((Class368_Sub2) this).width)
				 + (anLocalInt_418_ >> 12))]);
			int anLocalInt_427_ = anLocalInt_426_ >>> 24;
			int anLocalInt_428_ = 256 - anLocalInt_427_;
			int anLocalInt_429_ = anLocalInts[anLocalInt_417_];
			anLocalInts[anLocalInt_417_++]
			    = ((((anLocalInt_426_ & 0xff00ff) * anLocalInt_427_
				 + ((anLocalInt_429_ & 0xff00ff)
				    * anLocalInt_428_))
				& ~0xff00ff)
			       + (((anLocalInt_426_ & 0xff00) * anLocalInt_427_
				   + ((anLocalInt_429_ & 0xff00)
				      * anLocalInt_428_))
				  & 0xff0000)) >> 8;
			anLocalInt_418_ += Class368_Sub2.anInt5717;
			anLocalInt_419_ += Class368_Sub2.anInt5712;
		    }
		}
		anLocalInt++;
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	}
    }
    
    final void method4031(int argument_430_, int argument_431_) {
	int[] anLocalInts
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .pixels);
	if (Class368_Sub2.anInt5717 == 0) {
	    if (Class368_Sub2.anInt5712 == 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_432_ = Class368_Sub2.anInt5724;
		    int anLocalInt_433_ = Class368_Sub2.anInt5710;
		    int anLocalInt_434_ = Class368_Sub2.anInt5704;
		    int anLocalInt_435_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_433_ >= 0 && anLocalInt_434_ >= 0
			&& anLocalInt_433_ - (((Class368_Sub2) this).width
					      << 12) < 0
			&& anLocalInt_434_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			for (/**/; anLocalInt_435_ < 0; anLocalInt_435_++) {
			    int anLocalInt_436_
				= (((anLocalInt_434_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_433_ >> 12));
			    int anLocalInt_437_ = anLocalInt_432_++;
			    int[] anLocalInts_438_ = anLocalInts;
			    int anLocalInt_439_ = argument_430_;
			    int anLocalInt_440_ = argument_431_;
			    if (anLocalInt_440_ == 0) {
				if (anLocalInt_439_ == 1)
				    anLocalInts_438_[anLocalInt_437_]
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				else if (anLocalInt_439_ == 0) {
				    int anLocalInt_441_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_++]);
				    int anLocalInt_442_
					= (((anLocalInt_441_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_443_
					= (((anLocalInt_441_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_444_
					= (((anLocalInt_441_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_442_ | anLocalInt_443_
					   | anLocalInt_444_) >>> 8;
				} else if (anLocalInt_439_ == 3) {
				    int anLocalInt_445_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_++]);
				    int anLocalInt_446_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_447_
					= anLocalInt_445_ + anLocalInt_446_;
				    int anLocalInt_448_
					= ((anLocalInt_445_ & 0xff00ff)
					   + (anLocalInt_446_ & 0xff00ff));
				    int anLocalInt_449_
					= ((anLocalInt_448_ & 0x1000100)
					   + (anLocalInt_447_ - anLocalInt_448_
					      & 0x10000));
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_447_ - anLocalInt_449_
					   | anLocalInt_449_ - (anLocalInt_449_
								>>> 8));
				} else if (anLocalInt_439_ == 2) {
				    int anLocalInt_450_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_451_
					= (((anLocalInt_450_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_452_
					= (((anLocalInt_450_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_438_[anLocalInt_437_]
					= ((anLocalInt_451_ | anLocalInt_452_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_440_ == 1) {
				if (anLocalInt_439_ == 1) {
				    int anLocalInt_453_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_454_
					= anLocalInt_453_ >>> 24;
				    int anLocalInt_455_
					= 256 - anLocalInt_454_;
				    int anLocalInt_456_
					= anLocalInts_438_[anLocalInt_437_];
				    anLocalInts_438_[anLocalInt_437_]
					= (((((anLocalInt_453_ & 0xff00ff)
					      * anLocalInt_454_)
					     + ((anLocalInt_456_ & 0xff00ff)
						* anLocalInt_455_))
					    & ~0xff00ff)
					   + ((((anLocalInt_453_ & 0xff00)
						* anLocalInt_454_)
					       + ((anLocalInt_456_ & 0xff00)
						  * anLocalInt_455_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_439_ == 0) {
				    int anLocalInt_457_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_458_
					= (((anLocalInt_457_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_459_
					= 256 - anLocalInt_458_;
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_460_
					    = (anLocalInts_438_
					       [anLocalInt_437_]);
					anLocalInts_438_[anLocalInt_437_]
					    = (((((anLocalInt_457_ & 0xff00ff)
						  * anLocalInt_458_)
						 + ((anLocalInt_460_
						     & 0xff00ff)
						    * anLocalInt_459_))
						& ~0xff00ff)
					       + ((((anLocalInt_457_ & 0xff00)
						    * anLocalInt_458_)
						   + ((anLocalInt_460_
						       & 0xff00)
						      * anLocalInt_459_))
						  & 0xff0000)) >> 8;
				    } else if (anLocalInt_458_ != 255) {
					int anLocalInt_461_
					    = (((anLocalInt_457_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_462_
					    = (((anLocalInt_457_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_463_
					    = (((anLocalInt_457_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_457_
					    = (anLocalInt_461_
					       | anLocalInt_462_
					       | anLocalInt_463_) >>> 8;
					int anLocalInt_464_
					    = (anLocalInts_438_
					       [anLocalInt_437_]);
					anLocalInts_438_[anLocalInt_437_]
					    = (((((anLocalInt_457_ & 0xff00ff)
						  * anLocalInt_458_)
						 + ((anLocalInt_464_
						     & 0xff00ff)
						    * anLocalInt_459_))
						& ~0xff00ff)
					       + ((((anLocalInt_457_ & 0xff00)
						    * anLocalInt_458_)
						   + ((anLocalInt_464_
						       & 0xff00)
						      * anLocalInt_459_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_465_
					    = (((anLocalInt_457_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_466_
					    = (((anLocalInt_457_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_467_
					    = (((anLocalInt_457_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_438_[anLocalInt_437_]
					    = (anLocalInt_465_
					       | anLocalInt_466_
					       | anLocalInt_467_) >>> 8;
				    }
				} else if (anLocalInt_439_ == 3) {
				    int anLocalInt_468_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_469_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_470_
					= anLocalInt_468_ + anLocalInt_469_;
				    int anLocalInt_471_
					= ((anLocalInt_468_ & 0xff00ff)
					   + (anLocalInt_469_ & 0xff00ff));
				    int anLocalInt_472_
					= ((anLocalInt_471_ & 0x1000100)
					   + (anLocalInt_470_ - anLocalInt_471_
					      & 0x10000));
				    anLocalInt_472_
					= (anLocalInt_470_ - anLocalInt_472_
					   | anLocalInt_472_ - (anLocalInt_472_
								>>> 8));
				    int anLocalInt_473_
					= (((anLocalInt_468_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_474_
					= 256 - anLocalInt_473_;
				    if (anLocalInt_473_ != 255) {
					anLocalInt_468_ = anLocalInt_472_;
					anLocalInt_472_ = (anLocalInts_438_
							   [anLocalInt_437_]);
					anLocalInt_472_
					    = (((((anLocalInt_468_ & 0xff00ff)
						  * anLocalInt_473_)
						 + ((anLocalInt_472_
						     & 0xff00ff)
						    * anLocalInt_474_))
						& ~0xff00ff)
					       + ((((anLocalInt_468_ & 0xff00)
						    * anLocalInt_473_)
						   + ((anLocalInt_472_
						       & 0xff00)
						      * anLocalInt_474_))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_438_[anLocalInt_437_]
					= anLocalInt_472_;
				} else if (anLocalInt_439_ == 2) {
				    int anLocalInt_475_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_476_
					= anLocalInt_475_ >>> 24;
				    int anLocalInt_477_
					= 256 - anLocalInt_476_;
				    int anLocalInt_478_
					= (((anLocalInt_475_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_479_
					= (((anLocalInt_475_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_475_
					= ((anLocalInt_478_ | anLocalInt_479_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_480_
					= anLocalInts_438_[anLocalInt_437_];
				    anLocalInts_438_[anLocalInt_437_]
					= (((((anLocalInt_475_ & 0xff00ff)
					      * anLocalInt_476_)
					     + ((anLocalInt_480_ & 0xff00ff)
						* anLocalInt_477_))
					    & ~0xff00ff)
					   + ((((anLocalInt_475_ & 0xff00)
						* anLocalInt_476_)
					       + ((anLocalInt_480_ & 0xff00)
						  * anLocalInt_477_))
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_440_ == 2) {
				if (anLocalInt_439_ == 1) {
				    int anLocalInt_481_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_482_
					= anLocalInts_438_[anLocalInt_437_];
				    int anLocalInt_483_
					= anLocalInt_481_ + anLocalInt_482_;
				    int anLocalInt_484_
					= ((anLocalInt_481_ & 0xff00ff)
					   + (anLocalInt_482_ & 0xff00ff));
				    anLocalInt_482_
					= ((anLocalInt_484_ & 0x1000100)
					   + (anLocalInt_483_ - anLocalInt_484_
					      & 0x10000));
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_483_ - anLocalInt_482_
					   | anLocalInt_482_ - (anLocalInt_482_
								>>> 8));
				} else if (anLocalInt_439_ == 0) {
				    int anLocalInt_485_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_486_
					= (((anLocalInt_485_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_487_
					= (((anLocalInt_485_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_488_
					= (((anLocalInt_485_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_485_
					= (anLocalInt_486_ | anLocalInt_487_
					   | anLocalInt_488_) >>> 8;
				    int anLocalInt_489_
					= anLocalInts_438_[anLocalInt_437_];
				    int anLocalInt_490_
					= anLocalInt_485_ + anLocalInt_489_;
				    int anLocalInt_491_
					= ((anLocalInt_485_ & 0xff00ff)
					   + (anLocalInt_489_ & 0xff00ff));
				    anLocalInt_489_
					= ((anLocalInt_491_ & 0x1000100)
					   + (anLocalInt_490_ - anLocalInt_491_
					      & 0x10000));
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_490_ - anLocalInt_489_
					   | anLocalInt_489_ - (anLocalInt_489_
								>>> 8));
				} else if (anLocalInt_439_ == 3) {
				    int anLocalInt_492_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_493_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_494_
					= anLocalInt_492_ + anLocalInt_493_;
				    int anLocalInt_495_
					= ((anLocalInt_492_ & 0xff00ff)
					   + (anLocalInt_493_ & 0xff00ff));
				    int anLocalInt_496_
					= ((anLocalInt_495_ & 0x1000100)
					   + (anLocalInt_494_ - anLocalInt_495_
					      & 0x10000));
				    anLocalInt_492_
					= (anLocalInt_494_ - anLocalInt_496_
					   | anLocalInt_496_ - (anLocalInt_496_
								>>> 8));
				    anLocalInt_496_
					= anLocalInts_438_[anLocalInt_437_];
				    anLocalInt_494_
					= anLocalInt_492_ + anLocalInt_496_;
				    anLocalInt_495_
					= ((anLocalInt_492_ & 0xff00ff)
					   + (anLocalInt_496_ & 0xff00ff));
				    anLocalInt_496_
					= ((anLocalInt_495_ & 0x1000100)
					   + (anLocalInt_494_ - anLocalInt_495_
					      & 0x10000));
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_494_ - anLocalInt_496_
					   | anLocalInt_496_ - (anLocalInt_496_
								>>> 8));
				} else if (anLocalInt_439_ == 2) {
				    int anLocalInt_497_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_436_]);
				    int anLocalInt_498_
					= (((anLocalInt_497_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_499_
					= (((anLocalInt_497_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_497_
					= ((anLocalInt_498_ | anLocalInt_499_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_500_
					= anLocalInts_438_[anLocalInt_437_];
				    int anLocalInt_501_
					= anLocalInt_497_ + anLocalInt_500_;
				    int anLocalInt_502_
					= ((anLocalInt_497_ & 0xff00ff)
					   + (anLocalInt_500_ & 0xff00ff));
				    anLocalInt_500_
					= ((anLocalInt_502_ & 0x1000100)
					   + (anLocalInt_501_ - anLocalInt_502_
					      & 0x10000));
				    anLocalInts_438_[anLocalInt_437_]
					= (anLocalInt_501_ - anLocalInt_500_
					   | anLocalInt_500_ - (anLocalInt_500_
								>>> 8));
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
		    int anLocalInt_503_ = Class368_Sub2.anInt5724;
		    int anLocalInt_504_ = Class368_Sub2.anInt5710;
		    int anLocalInt_505_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_506_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_504_ >= 0
			&& anLocalInt_504_ - (((Class368_Sub2) this).width
					      << 12) < 0) {
			int anLocalInt_507_;
			if ((anLocalInt_507_
			     = (anLocalInt_505_
				- (((Class368_Sub2) this).height << 12)))
			    >= 0) {
			    anLocalInt_507_
				= ((Class368_Sub2.anInt5712 - anLocalInt_507_)
				   / Class368_Sub2.anInt5712);
			    anLocalInt_506_ += anLocalInt_507_;
			    anLocalInt_505_
				+= Class368_Sub2.anInt5712 * anLocalInt_507_;
			    anLocalInt_503_ += anLocalInt_507_;
			}
			if ((anLocalInt_507_
			     = ((anLocalInt_505_ - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_506_)
			    anLocalInt_506_ = anLocalInt_507_;
			for (/**/; anLocalInt_506_ < 0; anLocalInt_506_++) {
			    int anLocalInt_508_
				= (((anLocalInt_505_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_504_ >> 12));
			    int anLocalInt_509_ = anLocalInt_503_++;
			    int[] anLocalInts_510_ = anLocalInts;
			    int anLocalInt_511_ = argument_430_;
			    int anLocalInt_512_ = argument_431_;
			    if (anLocalInt_512_ == 0) {
				if (anLocalInt_511_ == 1)
				    anLocalInts_510_[anLocalInt_509_]
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				else if (anLocalInt_511_ == 0) {
				    int anLocalInt_513_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_++]);
				    int anLocalInt_514_
					= (((anLocalInt_513_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_515_
					= (((anLocalInt_513_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_516_
					= (((anLocalInt_513_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_514_ | anLocalInt_515_
					   | anLocalInt_516_) >>> 8;
				} else if (anLocalInt_511_ == 3) {
				    int anLocalInt_517_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_++]);
				    int anLocalInt_518_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_519_
					= anLocalInt_517_ + anLocalInt_518_;
				    int anLocalInt_520_
					= ((anLocalInt_517_ & 0xff00ff)
					   + (anLocalInt_518_ & 0xff00ff));
				    int anLocalInt_521_
					= ((anLocalInt_520_ & 0x1000100)
					   + (anLocalInt_519_ - anLocalInt_520_
					      & 0x10000));
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_519_ - anLocalInt_521_
					   | anLocalInt_521_ - (anLocalInt_521_
								>>> 8));
				} else if (anLocalInt_511_ == 2) {
				    int anLocalInt_522_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_523_
					= (((anLocalInt_522_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_524_
					= (((anLocalInt_522_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_510_[anLocalInt_509_]
					= ((anLocalInt_523_ | anLocalInt_524_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_512_ == 1) {
				if (anLocalInt_511_ == 1) {
				    int anLocalInt_525_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_526_
					= anLocalInt_525_ >>> 24;
				    int anLocalInt_527_
					= 256 - anLocalInt_526_;
				    int anLocalInt_528_
					= anLocalInts_510_[anLocalInt_509_];
				    anLocalInts_510_[anLocalInt_509_]
					= (((((anLocalInt_525_ & 0xff00ff)
					      * anLocalInt_526_)
					     + ((anLocalInt_528_ & 0xff00ff)
						* anLocalInt_527_))
					    & ~0xff00ff)
					   + ((((anLocalInt_525_ & 0xff00)
						* anLocalInt_526_)
					       + ((anLocalInt_528_ & 0xff00)
						  * anLocalInt_527_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_511_ == 0) {
				    int anLocalInt_529_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_530_
					= (((anLocalInt_529_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_531_
					= 256 - anLocalInt_530_;
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_532_
					    = (anLocalInts_510_
					       [anLocalInt_509_]);
					anLocalInts_510_[anLocalInt_509_]
					    = (((((anLocalInt_529_ & 0xff00ff)
						  * anLocalInt_530_)
						 + ((anLocalInt_532_
						     & 0xff00ff)
						    * anLocalInt_531_))
						& ~0xff00ff)
					       + ((((anLocalInt_529_ & 0xff00)
						    * anLocalInt_530_)
						   + ((anLocalInt_532_
						       & 0xff00)
						      * anLocalInt_531_))
						  & 0xff0000)) >> 8;
				    } else if (anLocalInt_530_ != 255) {
					int anLocalInt_533_
					    = (((anLocalInt_529_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_534_
					    = (((anLocalInt_529_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_535_
					    = (((anLocalInt_529_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_529_
					    = (anLocalInt_533_
					       | anLocalInt_534_
					       | anLocalInt_535_) >>> 8;
					int anLocalInt_536_
					    = (anLocalInts_510_
					       [anLocalInt_509_]);
					anLocalInts_510_[anLocalInt_509_]
					    = (((((anLocalInt_529_ & 0xff00ff)
						  * anLocalInt_530_)
						 + ((anLocalInt_536_
						     & 0xff00ff)
						    * anLocalInt_531_))
						& ~0xff00ff)
					       + ((((anLocalInt_529_ & 0xff00)
						    * anLocalInt_530_)
						   + ((anLocalInt_536_
						       & 0xff00)
						      * anLocalInt_531_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_537_
					    = (((anLocalInt_529_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_538_
					    = (((anLocalInt_529_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_539_
					    = (((anLocalInt_529_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_510_[anLocalInt_509_]
					    = (anLocalInt_537_
					       | anLocalInt_538_
					       | anLocalInt_539_) >>> 8;
				    }
				} else if (anLocalInt_511_ == 3) {
				    int anLocalInt_540_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_541_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_542_
					= anLocalInt_540_ + anLocalInt_541_;
				    int anLocalInt_543_
					= ((anLocalInt_540_ & 0xff00ff)
					   + (anLocalInt_541_ & 0xff00ff));
				    int anLocalInt_544_
					= ((anLocalInt_543_ & 0x1000100)
					   + (anLocalInt_542_ - anLocalInt_543_
					      & 0x10000));
				    anLocalInt_544_
					= (anLocalInt_542_ - anLocalInt_544_
					   | anLocalInt_544_ - (anLocalInt_544_
								>>> 8));
				    int anLocalInt_545_
					= (((anLocalInt_540_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_546_
					= 256 - anLocalInt_545_;
				    if (anLocalInt_545_ != 255) {
					anLocalInt_540_ = anLocalInt_544_;
					anLocalInt_544_ = (anLocalInts_510_
							   [anLocalInt_509_]);
					anLocalInt_544_
					    = (((((anLocalInt_540_ & 0xff00ff)
						  * anLocalInt_545_)
						 + ((anLocalInt_544_
						     & 0xff00ff)
						    * anLocalInt_546_))
						& ~0xff00ff)
					       + ((((anLocalInt_540_ & 0xff00)
						    * anLocalInt_545_)
						   + ((anLocalInt_544_
						       & 0xff00)
						      * anLocalInt_546_))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_510_[anLocalInt_509_]
					= anLocalInt_544_;
				} else if (anLocalInt_511_ == 2) {
				    int anLocalInt_547_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_548_
					= anLocalInt_547_ >>> 24;
				    int anLocalInt_549_
					= 256 - anLocalInt_548_;
				    int anLocalInt_550_
					= (((anLocalInt_547_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_551_
					= (((anLocalInt_547_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_547_
					= ((anLocalInt_550_ | anLocalInt_551_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_552_
					= anLocalInts_510_[anLocalInt_509_];
				    anLocalInts_510_[anLocalInt_509_]
					= (((((anLocalInt_547_ & 0xff00ff)
					      * anLocalInt_548_)
					     + ((anLocalInt_552_ & 0xff00ff)
						* anLocalInt_549_))
					    & ~0xff00ff)
					   + ((((anLocalInt_547_ & 0xff00)
						* anLocalInt_548_)
					       + ((anLocalInt_552_ & 0xff00)
						  * anLocalInt_549_))
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_512_ == 2) {
				if (anLocalInt_511_ == 1) {
				    int anLocalInt_553_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_554_
					= anLocalInts_510_[anLocalInt_509_];
				    int anLocalInt_555_
					= anLocalInt_553_ + anLocalInt_554_;
				    int anLocalInt_556_
					= ((anLocalInt_553_ & 0xff00ff)
					   + (anLocalInt_554_ & 0xff00ff));
				    anLocalInt_554_
					= ((anLocalInt_556_ & 0x1000100)
					   + (anLocalInt_555_ - anLocalInt_556_
					      & 0x10000));
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_555_ - anLocalInt_554_
					   | anLocalInt_554_ - (anLocalInt_554_
								>>> 8));
				} else if (anLocalInt_511_ == 0) {
				    int anLocalInt_557_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_558_
					= (((anLocalInt_557_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_559_
					= (((anLocalInt_557_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_560_
					= (((anLocalInt_557_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_557_
					= (anLocalInt_558_ | anLocalInt_559_
					   | anLocalInt_560_) >>> 8;
				    int anLocalInt_561_
					= anLocalInts_510_[anLocalInt_509_];
				    int anLocalInt_562_
					= anLocalInt_557_ + anLocalInt_561_;
				    int anLocalInt_563_
					= ((anLocalInt_557_ & 0xff00ff)
					   + (anLocalInt_561_ & 0xff00ff));
				    anLocalInt_561_
					= ((anLocalInt_563_ & 0x1000100)
					   + (anLocalInt_562_ - anLocalInt_563_
					      & 0x10000));
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_562_ - anLocalInt_561_
					   | anLocalInt_561_ - (anLocalInt_561_
								>>> 8));
				} else if (anLocalInt_511_ == 3) {
				    int anLocalInt_564_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_565_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_566_
					= anLocalInt_564_ + anLocalInt_565_;
				    int anLocalInt_567_
					= ((anLocalInt_564_ & 0xff00ff)
					   + (anLocalInt_565_ & 0xff00ff));
				    int anLocalInt_568_
					= ((anLocalInt_567_ & 0x1000100)
					   + (anLocalInt_566_ - anLocalInt_567_
					      & 0x10000));
				    anLocalInt_564_
					= (anLocalInt_566_ - anLocalInt_568_
					   | anLocalInt_568_ - (anLocalInt_568_
								>>> 8));
				    anLocalInt_568_
					= anLocalInts_510_[anLocalInt_509_];
				    anLocalInt_566_
					= anLocalInt_564_ + anLocalInt_568_;
				    anLocalInt_567_
					= ((anLocalInt_564_ & 0xff00ff)
					   + (anLocalInt_568_ & 0xff00ff));
				    anLocalInt_568_
					= ((anLocalInt_567_ & 0x1000100)
					   + (anLocalInt_566_ - anLocalInt_567_
					      & 0x10000));
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_566_ - anLocalInt_568_
					   | anLocalInt_568_ - (anLocalInt_568_
								>>> 8));
				} else if (anLocalInt_511_ == 2) {
				    int anLocalInt_569_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_508_]);
				    int anLocalInt_570_
					= (((anLocalInt_569_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_571_
					= (((anLocalInt_569_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_569_
					= ((anLocalInt_570_ | anLocalInt_571_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_572_
					= anLocalInts_510_[anLocalInt_509_];
				    int anLocalInt_573_
					= anLocalInt_569_ + anLocalInt_572_;
				    int anLocalInt_574_
					= ((anLocalInt_569_ & 0xff00ff)
					   + (anLocalInt_572_ & 0xff00ff));
				    anLocalInt_572_
					= ((anLocalInt_574_ & 0x1000100)
					   + (anLocalInt_573_ - anLocalInt_574_
					      & 0x10000));
				    anLocalInts_510_[anLocalInt_509_]
					= (anLocalInt_573_ - anLocalInt_572_
					   | anLocalInt_572_ - (anLocalInt_572_
								>>> 8));
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_505_ += Class368_Sub2.anInt5712;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_575_ = Class368_Sub2.anInt5724;
		    int anLocalInt_576_ = Class368_Sub2.anInt5710;
		    int anLocalInt_577_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_578_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_576_ >= 0
			&& anLocalInt_576_ - (((Class368_Sub2) this).width
					      << 12) < 0) {
			if (anLocalInt_577_ < 0) {
			    int anLocalInt_579_ = ((Class368_Sub2.anInt5712 - 1
						    - anLocalInt_577_)
						   / Class368_Sub2.anInt5712);
			    anLocalInt_578_ += anLocalInt_579_;
			    anLocalInt_577_
				+= Class368_Sub2.anInt5712 * anLocalInt_579_;
			    anLocalInt_575_ += anLocalInt_579_;
			}
			int anLocalInt_580_;
			if ((anLocalInt_580_
			     = ((anLocalInt_577_ + 1
				 - (((Class368_Sub2) this).height << 12)
				 - Class368_Sub2.anInt5712)
				/ Class368_Sub2.anInt5712))
			    > anLocalInt_578_)
			    anLocalInt_578_ = anLocalInt_580_;
			for (/**/; anLocalInt_578_ < 0; anLocalInt_578_++) {
			    int anLocalInt_581_
				= (((anLocalInt_577_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_576_ >> 12));
			    int anLocalInt_582_ = anLocalInt_575_++;
			    int[] anLocalInts_583_ = anLocalInts;
			    int anLocalInt_584_ = argument_430_;
			    int anLocalInt_585_ = argument_431_;
			    if (anLocalInt_585_ == 0) {
				if (anLocalInt_584_ == 1)
				    anLocalInts_583_[anLocalInt_582_]
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				else if (anLocalInt_584_ == 0) {
				    int anLocalInt_586_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_++]);
				    int anLocalInt_587_
					= (((anLocalInt_586_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_588_
					= (((anLocalInt_586_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_589_
					= (((anLocalInt_586_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_587_ | anLocalInt_588_
					   | anLocalInt_589_) >>> 8;
				} else if (anLocalInt_584_ == 3) {
				    int anLocalInt_590_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_++]);
				    int anLocalInt_591_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_592_
					= anLocalInt_590_ + anLocalInt_591_;
				    int anLocalInt_593_
					= ((anLocalInt_590_ & 0xff00ff)
					   + (anLocalInt_591_ & 0xff00ff));
				    int anLocalInt_594_
					= ((anLocalInt_593_ & 0x1000100)
					   + (anLocalInt_592_ - anLocalInt_593_
					      & 0x10000));
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_592_ - anLocalInt_594_
					   | anLocalInt_594_ - (anLocalInt_594_
								>>> 8));
				} else if (anLocalInt_584_ == 2) {
				    int anLocalInt_595_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_596_
					= (((anLocalInt_595_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_597_
					= (((anLocalInt_595_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_583_[anLocalInt_582_]
					= ((anLocalInt_596_ | anLocalInt_597_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_585_ == 1) {
				if (anLocalInt_584_ == 1) {
				    int anLocalInt_598_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_599_
					= anLocalInt_598_ >>> 24;
				    int anLocalInt_600_
					= 256 - anLocalInt_599_;
				    int anLocalInt_601_
					= anLocalInts_583_[anLocalInt_582_];
				    anLocalInts_583_[anLocalInt_582_]
					= (((((anLocalInt_598_ & 0xff00ff)
					      * anLocalInt_599_)
					     + ((anLocalInt_601_ & 0xff00ff)
						* anLocalInt_600_))
					    & ~0xff00ff)
					   + ((((anLocalInt_598_ & 0xff00)
						* anLocalInt_599_)
					       + ((anLocalInt_601_ & 0xff00)
						  * anLocalInt_600_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_584_ == 0) {
				    int anLocalInt_602_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_603_
					= (((anLocalInt_602_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_604_
					= 256 - anLocalInt_603_;
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_605_
					    = (anLocalInts_583_
					       [anLocalInt_582_]);
					anLocalInts_583_[anLocalInt_582_]
					    = (((((anLocalInt_602_ & 0xff00ff)
						  * anLocalInt_603_)
						 + ((anLocalInt_605_
						     & 0xff00ff)
						    * anLocalInt_604_))
						& ~0xff00ff)
					       + ((((anLocalInt_602_ & 0xff00)
						    * anLocalInt_603_)
						   + ((anLocalInt_605_
						       & 0xff00)
						      * anLocalInt_604_))
						  & 0xff0000)) >> 8;
				    } else if (anLocalInt_603_ != 255) {
					int anLocalInt_606_
					    = (((anLocalInt_602_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_607_
					    = (((anLocalInt_602_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_608_
					    = (((anLocalInt_602_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_602_
					    = (anLocalInt_606_
					       | anLocalInt_607_
					       | anLocalInt_608_) >>> 8;
					int anLocalInt_609_
					    = (anLocalInts_583_
					       [anLocalInt_582_]);
					anLocalInts_583_[anLocalInt_582_]
					    = (((((anLocalInt_602_ & 0xff00ff)
						  * anLocalInt_603_)
						 + ((anLocalInt_609_
						     & 0xff00ff)
						    * anLocalInt_604_))
						& ~0xff00ff)
					       + ((((anLocalInt_602_ & 0xff00)
						    * anLocalInt_603_)
						   + ((anLocalInt_609_
						       & 0xff00)
						      * anLocalInt_604_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_610_
					    = (((anLocalInt_602_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_611_
					    = (((anLocalInt_602_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_612_
					    = (((anLocalInt_602_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_583_[anLocalInt_582_]
					    = (anLocalInt_610_
					       | anLocalInt_611_
					       | anLocalInt_612_) >>> 8;
				    }
				} else if (anLocalInt_584_ == 3) {
				    int anLocalInt_613_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_614_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_615_
					= anLocalInt_613_ + anLocalInt_614_;
				    int anLocalInt_616_
					= ((anLocalInt_613_ & 0xff00ff)
					   + (anLocalInt_614_ & 0xff00ff));
				    int anLocalInt_617_
					= ((anLocalInt_616_ & 0x1000100)
					   + (anLocalInt_615_ - anLocalInt_616_
					      & 0x10000));
				    anLocalInt_617_
					= (anLocalInt_615_ - anLocalInt_617_
					   | anLocalInt_617_ - (anLocalInt_617_
								>>> 8));
				    int anLocalInt_618_
					= (((anLocalInt_613_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_619_
					= 256 - anLocalInt_618_;
				    if (anLocalInt_618_ != 255) {
					anLocalInt_613_ = anLocalInt_617_;
					anLocalInt_617_ = (anLocalInts_583_
							   [anLocalInt_582_]);
					anLocalInt_617_
					    = (((((anLocalInt_613_ & 0xff00ff)
						  * anLocalInt_618_)
						 + ((anLocalInt_617_
						     & 0xff00ff)
						    * anLocalInt_619_))
						& ~0xff00ff)
					       + ((((anLocalInt_613_ & 0xff00)
						    * anLocalInt_618_)
						   + ((anLocalInt_617_
						       & 0xff00)
						      * anLocalInt_619_))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_583_[anLocalInt_582_]
					= anLocalInt_617_;
				} else if (anLocalInt_584_ == 2) {
				    int anLocalInt_620_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_621_
					= anLocalInt_620_ >>> 24;
				    int anLocalInt_622_
					= 256 - anLocalInt_621_;
				    int anLocalInt_623_
					= (((anLocalInt_620_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_624_
					= (((anLocalInt_620_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_620_
					= ((anLocalInt_623_ | anLocalInt_624_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_625_
					= anLocalInts_583_[anLocalInt_582_];
				    anLocalInts_583_[anLocalInt_582_]
					= (((((anLocalInt_620_ & 0xff00ff)
					      * anLocalInt_621_)
					     + ((anLocalInt_625_ & 0xff00ff)
						* anLocalInt_622_))
					    & ~0xff00ff)
					   + ((((anLocalInt_620_ & 0xff00)
						* anLocalInt_621_)
					       + ((anLocalInt_625_ & 0xff00)
						  * anLocalInt_622_))
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_585_ == 2) {
				if (anLocalInt_584_ == 1) {
				    int anLocalInt_626_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_627_
					= anLocalInts_583_[anLocalInt_582_];
				    int anLocalInt_628_
					= anLocalInt_626_ + anLocalInt_627_;
				    int anLocalInt_629_
					= ((anLocalInt_626_ & 0xff00ff)
					   + (anLocalInt_627_ & 0xff00ff));
				    anLocalInt_627_
					= ((anLocalInt_629_ & 0x1000100)
					   + (anLocalInt_628_ - anLocalInt_629_
					      & 0x10000));
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_628_ - anLocalInt_627_
					   | anLocalInt_627_ - (anLocalInt_627_
								>>> 8));
				} else if (anLocalInt_584_ == 0) {
				    int anLocalInt_630_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_631_
					= (((anLocalInt_630_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_632_
					= (((anLocalInt_630_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_633_
					= (((anLocalInt_630_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_630_
					= (anLocalInt_631_ | anLocalInt_632_
					   | anLocalInt_633_) >>> 8;
				    int anLocalInt_634_
					= anLocalInts_583_[anLocalInt_582_];
				    int anLocalInt_635_
					= anLocalInt_630_ + anLocalInt_634_;
				    int anLocalInt_636_
					= ((anLocalInt_630_ & 0xff00ff)
					   + (anLocalInt_634_ & 0xff00ff));
				    anLocalInt_634_
					= ((anLocalInt_636_ & 0x1000100)
					   + (anLocalInt_635_ - anLocalInt_636_
					      & 0x10000));
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_635_ - anLocalInt_634_
					   | anLocalInt_634_ - (anLocalInt_634_
								>>> 8));
				} else if (anLocalInt_584_ == 3) {
				    int anLocalInt_637_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_638_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_639_
					= anLocalInt_637_ + anLocalInt_638_;
				    int anLocalInt_640_
					= ((anLocalInt_637_ & 0xff00ff)
					   + (anLocalInt_638_ & 0xff00ff));
				    int anLocalInt_641_
					= ((anLocalInt_640_ & 0x1000100)
					   + (anLocalInt_639_ - anLocalInt_640_
					      & 0x10000));
				    anLocalInt_637_
					= (anLocalInt_639_ - anLocalInt_641_
					   | anLocalInt_641_ - (anLocalInt_641_
								>>> 8));
				    anLocalInt_641_
					= anLocalInts_583_[anLocalInt_582_];
				    anLocalInt_639_
					= anLocalInt_637_ + anLocalInt_641_;
				    anLocalInt_640_
					= ((anLocalInt_637_ & 0xff00ff)
					   + (anLocalInt_641_ & 0xff00ff));
				    anLocalInt_641_
					= ((anLocalInt_640_ & 0x1000100)
					   + (anLocalInt_639_ - anLocalInt_640_
					      & 0x10000));
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_639_ - anLocalInt_641_
					   | anLocalInt_641_ - (anLocalInt_641_
								>>> 8));
				} else if (anLocalInt_584_ == 2) {
				    int anLocalInt_642_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_581_]);
				    int anLocalInt_643_
					= (((anLocalInt_642_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_644_
					= (((anLocalInt_642_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_642_
					= ((anLocalInt_643_ | anLocalInt_644_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_645_
					= anLocalInts_583_[anLocalInt_582_];
				    int anLocalInt_646_
					= anLocalInt_642_ + anLocalInt_645_;
				    int anLocalInt_647_
					= ((anLocalInt_642_ & 0xff00ff)
					   + (anLocalInt_645_ & 0xff00ff));
				    anLocalInt_645_
					= ((anLocalInt_647_ & 0x1000100)
					   + (anLocalInt_646_ - anLocalInt_647_
					      & 0x10000));
				    anLocalInts_583_[anLocalInt_582_]
					= (anLocalInt_646_ - anLocalInt_645_
					   | anLocalInt_645_ - (anLocalInt_645_
								>>> 8));
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_577_ += Class368_Sub2.anInt5712;
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
		    int anLocalInt_648_ = Class368_Sub2.anInt5724;
		    int anLocalInt_649_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_650_ = Class368_Sub2.anInt5704;
		    int anLocalInt_651_ = Class368_Sub2.anInt5713;
		    if (anLocalInt_650_ >= 0
			&& anLocalInt_650_ - (((Class368_Sub2) this).height
					      << 12) < 0) {
			int anLocalInt_652_;
			if ((anLocalInt_652_
			     = (anLocalInt_649_
				- (((Class368_Sub2) this).width << 12)))
			    >= 0) {
			    anLocalInt_652_
				= ((Class368_Sub2.anInt5717 - anLocalInt_652_)
				   / Class368_Sub2.anInt5717);
			    anLocalInt_651_ += anLocalInt_652_;
			    anLocalInt_649_
				+= Class368_Sub2.anInt5717 * anLocalInt_652_;
			    anLocalInt_648_ += anLocalInt_652_;
			}
			if ((anLocalInt_652_
			     = ((anLocalInt_649_ - Class368_Sub2.anInt5717)
				/ Class368_Sub2.anInt5717))
			    > anLocalInt_651_)
			    anLocalInt_651_ = anLocalInt_652_;
			for (/**/; anLocalInt_651_ < 0; anLocalInt_651_++) {
			    int anLocalInt_653_
				= (((anLocalInt_650_ >> 12)
				    * ((Class368_Sub2) this).width)
				   + (anLocalInt_649_ >> 12));
			    int anLocalInt_654_ = anLocalInt_648_++;
			    int[] anLocalInts_655_ = anLocalInts;
			    int anLocalInt_656_ = argument_430_;
			    int anLocalInt_657_ = argument_431_;
			    if (anLocalInt_657_ == 0) {
				if (anLocalInt_656_ == 1)
				    anLocalInts_655_[anLocalInt_654_]
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				else if (anLocalInt_656_ == 0) {
				    int anLocalInt_658_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_++]);
				    int anLocalInt_659_
					= (((anLocalInt_658_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_660_
					= (((anLocalInt_658_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_661_
					= (((anLocalInt_658_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_659_ | anLocalInt_660_
					   | anLocalInt_661_) >>> 8;
				} else if (anLocalInt_656_ == 3) {
				    int anLocalInt_662_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_++]);
				    int anLocalInt_663_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_664_
					= anLocalInt_662_ + anLocalInt_663_;
				    int anLocalInt_665_
					= ((anLocalInt_662_ & 0xff00ff)
					   + (anLocalInt_663_ & 0xff00ff));
				    int anLocalInt_666_
					= ((anLocalInt_665_ & 0x1000100)
					   + (anLocalInt_664_ - anLocalInt_665_
					      & 0x10000));
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_664_ - anLocalInt_666_
					   | anLocalInt_666_ - (anLocalInt_666_
								>>> 8));
				} else if (anLocalInt_656_ == 2) {
				    int anLocalInt_667_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_668_
					= (((anLocalInt_667_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_669_
					= (((anLocalInt_667_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInts_655_[anLocalInt_654_]
					= ((anLocalInt_668_ | anLocalInt_669_)
					   >>> 8) + Class368_Sub2.anInt5697;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_657_ == 1) {
				if (anLocalInt_656_ == 1) {
				    int anLocalInt_670_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_671_
					= anLocalInt_670_ >>> 24;
				    int anLocalInt_672_
					= 256 - anLocalInt_671_;
				    int anLocalInt_673_
					= anLocalInts_655_[anLocalInt_654_];
				    anLocalInts_655_[anLocalInt_654_]
					= (((((anLocalInt_670_ & 0xff00ff)
					      * anLocalInt_671_)
					     + ((anLocalInt_673_ & 0xff00ff)
						* anLocalInt_672_))
					    & ~0xff00ff)
					   + ((((anLocalInt_670_ & 0xff00)
						* anLocalInt_671_)
					       + ((anLocalInt_673_ & 0xff00)
						  * anLocalInt_672_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_656_ == 0) {
				    int anLocalInt_674_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_675_
					= (((anLocalInt_674_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_676_
					= 256 - anLocalInt_675_;
				    if ((Class368_Sub2.anInt5693 & 0xffffff)
					== 16777215) {
					int anLocalInt_677_
					    = (anLocalInts_655_
					       [anLocalInt_654_]);
					anLocalInts_655_[anLocalInt_654_]
					    = (((((anLocalInt_674_ & 0xff00ff)
						  * anLocalInt_675_)
						 + ((anLocalInt_677_
						     & 0xff00ff)
						    * anLocalInt_676_))
						& ~0xff00ff)
					       + ((((anLocalInt_674_ & 0xff00)
						    * anLocalInt_675_)
						   + ((anLocalInt_677_
						       & 0xff00)
						      * anLocalInt_676_))
						  & 0xff0000)) >> 8;
				    } else if (anLocalInt_675_ != 255) {
					int anLocalInt_678_
					    = (((anLocalInt_674_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_679_
					    = (((anLocalInt_674_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_680_
					    = (((anLocalInt_674_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInt_674_
					    = (anLocalInt_678_
					       | anLocalInt_679_
					       | anLocalInt_680_) >>> 8;
					int anLocalInt_681_
					    = (anLocalInts_655_
					       [anLocalInt_654_]);
					anLocalInts_655_[anLocalInt_654_]
					    = (((((anLocalInt_674_ & 0xff00ff)
						  * anLocalInt_675_)
						 + ((anLocalInt_681_
						     & 0xff00ff)
						    * anLocalInt_676_))
						& ~0xff00ff)
					       + ((((anLocalInt_674_ & 0xff00)
						    * anLocalInt_675_)
						   + ((anLocalInt_681_
						       & 0xff00)
						      * anLocalInt_676_))
						  & 0xff0000)) >> 8;
				    } else {
					int anLocalInt_682_
					    = (((anLocalInt_674_ & 0xff0000)
						* Class368_Sub2.anInt5702)
					       & ~0xffffff);
					int anLocalInt_683_
					    = (((anLocalInt_674_ & 0xff00)
						* Class368_Sub2.anInt5714)
					       & 0xff0000);
					int anLocalInt_684_
					    = (((anLocalInt_674_ & 0xff)
						* Class368_Sub2.anInt5701)
					       & 0xff00);
					anLocalInts_655_[anLocalInt_654_]
					    = (anLocalInt_682_
					       | anLocalInt_683_
					       | anLocalInt_684_) >>> 8;
				    }
				} else if (anLocalInt_656_ == 3) {
				    int anLocalInt_685_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_686_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_687_
					= anLocalInt_685_ + anLocalInt_686_;
				    int anLocalInt_688_
					= ((anLocalInt_685_ & 0xff00ff)
					   + (anLocalInt_686_ & 0xff00ff));
				    int anLocalInt_689_
					= ((anLocalInt_688_ & 0x1000100)
					   + (anLocalInt_687_ - anLocalInt_688_
					      & 0x10000));
				    anLocalInt_689_
					= (anLocalInt_687_ - anLocalInt_689_
					   | anLocalInt_689_ - (anLocalInt_689_
								>>> 8));
				    int anLocalInt_690_
					= (((anLocalInt_685_ >>> 24)
					    * Class368_Sub2.anInt5695)
					   >> 8);
				    int anLocalInt_691_
					= 256 - anLocalInt_690_;
				    if (anLocalInt_690_ != 255) {
					anLocalInt_685_ = anLocalInt_689_;
					anLocalInt_689_ = (anLocalInts_655_
							   [anLocalInt_654_]);
					anLocalInt_689_
					    = (((((anLocalInt_685_ & 0xff00ff)
						  * anLocalInt_690_)
						 + ((anLocalInt_689_
						     & 0xff00ff)
						    * anLocalInt_691_))
						& ~0xff00ff)
					       + ((((anLocalInt_685_ & 0xff00)
						    * anLocalInt_690_)
						   + ((anLocalInt_689_
						       & 0xff00)
						      * anLocalInt_691_))
						  & 0xff0000)) >> 8;
				    }
				    anLocalInts_655_[anLocalInt_654_]
					= anLocalInt_689_;
				} else if (anLocalInt_656_ == 2) {
				    int anLocalInt_692_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_693_
					= anLocalInt_692_ >>> 24;
				    int anLocalInt_694_
					= 256 - anLocalInt_693_;
				    int anLocalInt_695_
					= (((anLocalInt_692_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_696_
					= (((anLocalInt_692_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_692_
					= ((anLocalInt_695_ | anLocalInt_696_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_697_
					= anLocalInts_655_[anLocalInt_654_];
				    anLocalInts_655_[anLocalInt_654_]
					= (((((anLocalInt_692_ & 0xff00ff)
					      * anLocalInt_693_)
					     + ((anLocalInt_697_ & 0xff00ff)
						* anLocalInt_694_))
					    & ~0xff00ff)
					   + ((((anLocalInt_692_ & 0xff00)
						* anLocalInt_693_)
					       + ((anLocalInt_697_ & 0xff00)
						  * anLocalInt_694_))
					      & 0xff0000)) >> 8;
				} else
				    throw new IllegalArgumentException();
			    } else if (anLocalInt_657_ == 2) {
				if (anLocalInt_656_ == 1) {
				    int anLocalInt_698_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_699_
					= anLocalInts_655_[anLocalInt_654_];
				    int anLocalInt_700_
					= anLocalInt_698_ + anLocalInt_699_;
				    int anLocalInt_701_
					= ((anLocalInt_698_ & 0xff00ff)
					   + (anLocalInt_699_ & 0xff00ff));
				    anLocalInt_699_
					= ((anLocalInt_701_ & 0x1000100)
					   + (anLocalInt_700_ - anLocalInt_701_
					      & 0x10000));
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_700_ - anLocalInt_699_
					   | anLocalInt_699_ - (anLocalInt_699_
								>>> 8));
				} else if (anLocalInt_656_ == 0) {
				    int anLocalInt_702_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_703_
					= (((anLocalInt_702_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_704_
					= (((anLocalInt_702_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_705_
					= (((anLocalInt_702_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_702_
					= (anLocalInt_703_ | anLocalInt_704_
					   | anLocalInt_705_) >>> 8;
				    int anLocalInt_706_
					= anLocalInts_655_[anLocalInt_654_];
				    int anLocalInt_707_
					= anLocalInt_702_ + anLocalInt_706_;
				    int anLocalInt_708_
					= ((anLocalInt_702_ & 0xff00ff)
					   + (anLocalInt_706_ & 0xff00ff));
				    anLocalInt_706_
					= ((anLocalInt_708_ & 0x1000100)
					   + (anLocalInt_707_ - anLocalInt_708_
					      & 0x10000));
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_707_ - anLocalInt_706_
					   | anLocalInt_706_ - (anLocalInt_706_
								>>> 8));
				} else if (anLocalInt_656_ == 3) {
				    int anLocalInt_709_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_710_
					= Class368_Sub2.anInt5693;
				    int anLocalInt_711_
					= anLocalInt_709_ + anLocalInt_710_;
				    int anLocalInt_712_
					= ((anLocalInt_709_ & 0xff00ff)
					   + (anLocalInt_710_ & 0xff00ff));
				    int anLocalInt_713_
					= ((anLocalInt_712_ & 0x1000100)
					   + (anLocalInt_711_ - anLocalInt_712_
					      & 0x10000));
				    anLocalInt_709_
					= (anLocalInt_711_ - anLocalInt_713_
					   | anLocalInt_713_ - (anLocalInt_713_
								>>> 8));
				    anLocalInt_713_
					= anLocalInts_655_[anLocalInt_654_];
				    anLocalInt_711_
					= anLocalInt_709_ + anLocalInt_713_;
				    anLocalInt_712_
					= ((anLocalInt_709_ & 0xff00ff)
					   + (anLocalInt_713_ & 0xff00ff));
				    anLocalInt_713_
					= ((anLocalInt_712_ & 0x1000100)
					   + (anLocalInt_711_ - anLocalInt_712_
					      & 0x10000));
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_711_ - anLocalInt_713_
					   | anLocalInt_713_ - (anLocalInt_713_
								>>> 8));
				} else if (anLocalInt_656_ == 2) {
				    int anLocalInt_714_
					= (((Class368_Sub2_Sub2) this)
					   .anIntArray6635[anLocalInt_653_]);
				    int anLocalInt_715_
					= (((anLocalInt_714_ & 0xff00ff)
					    * Class368_Sub2.anInt5695)
					   & ~0xff00ff);
				    int anLocalInt_716_
					= (((anLocalInt_714_ & 0xff00)
					    * Class368_Sub2.anInt5695)
					   & 0xff0000);
				    anLocalInt_714_
					= ((anLocalInt_715_ | anLocalInt_716_)
					   >>> 8) + Class368_Sub2.anInt5697;
				    int anLocalInt_717_
					= anLocalInts_655_[anLocalInt_654_];
				    int anLocalInt_718_
					= anLocalInt_714_ + anLocalInt_717_;
				    int anLocalInt_719_
					= ((anLocalInt_714_ & 0xff00ff)
					   + (anLocalInt_717_ & 0xff00ff));
				    anLocalInt_717_
					= ((anLocalInt_719_ & 0x1000100)
					   + (anLocalInt_718_ - anLocalInt_719_
					      & 0x10000));
				    anLocalInts_655_[anLocalInt_654_]
					= (anLocalInt_718_ - anLocalInt_717_
					   | anLocalInt_717_ - (anLocalInt_717_
								>>> 8));
				}
			    } else
				throw new IllegalArgumentException();
			    anLocalInt_649_ += Class368_Sub2.anInt5717;
			}
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else if (Class368_Sub2.anInt5712 < 0) {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_720_ = Class368_Sub2.anInt5724;
		    int anLocalInt_721_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_722_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_723_ = Class368_Sub2.anInt5713;
		    int anLocalInt_724_;
		    if ((anLocalInt_724_
			 = anLocalInt_721_ - (((Class368_Sub2) this).width
					      << 12))
			>= 0) {
			anLocalInt_724_
			    = ((Class368_Sub2.anInt5717 - anLocalInt_724_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_723_ += anLocalInt_724_;
			anLocalInt_721_
			    += Class368_Sub2.anInt5717 * anLocalInt_724_;
			anLocalInt_722_
			    += Class368_Sub2.anInt5712 * anLocalInt_724_;
			anLocalInt_720_ += anLocalInt_724_;
		    }
		    if ((anLocalInt_724_
			 = ((anLocalInt_721_ - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_723_)
			anLocalInt_723_ = anLocalInt_724_;
		    if ((anLocalInt_724_
			 = anLocalInt_722_ - (((Class368_Sub2) this).height
					      << 12))
			>= 0) {
			anLocalInt_724_
			    = ((Class368_Sub2.anInt5712 - anLocalInt_724_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_723_ += anLocalInt_724_;
			anLocalInt_721_
			    += Class368_Sub2.anInt5717 * anLocalInt_724_;
			anLocalInt_722_
			    += Class368_Sub2.anInt5712 * anLocalInt_724_;
			anLocalInt_720_ += anLocalInt_724_;
		    }
		    if ((anLocalInt_724_
			 = ((anLocalInt_722_ - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_723_)
			anLocalInt_723_ = anLocalInt_724_;
		    for (/**/; anLocalInt_723_ < 0; anLocalInt_723_++) {
			int anLocalInt_725_
			    = (((anLocalInt_722_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_721_ >> 12));
			int anLocalInt_726_ = anLocalInt_720_++;
			int[] anLocalInts_727_ = anLocalInts;
			int anLocalInt_728_ = argument_430_;
			int anLocalInt_729_ = argument_431_;
			if (anLocalInt_729_ == 0) {
			    if (anLocalInt_728_ == 1)
				anLocalInts_727_[anLocalInt_726_]
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
			    else if (anLocalInt_728_ == 0) {
				int anLocalInt_730_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_++]);
				int anLocalInt_731_
				    = (((anLocalInt_730_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_732_
				    = (((anLocalInt_730_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_733_
				    = (((anLocalInt_730_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_731_ | anLocalInt_732_
				       | anLocalInt_733_) >>> 8;
			    } else if (anLocalInt_728_ == 3) {
				int anLocalInt_734_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_++]);
				int anLocalInt_735_ = Class368_Sub2.anInt5693;
				int anLocalInt_736_
				    = anLocalInt_734_ + anLocalInt_735_;
				int anLocalInt_737_
				    = ((anLocalInt_734_ & 0xff00ff)
				       + (anLocalInt_735_ & 0xff00ff));
				int anLocalInt_738_
				    = ((anLocalInt_737_ & 0x1000100)
				       + (anLocalInt_736_ - anLocalInt_737_
					  & 0x10000));
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_736_ - anLocalInt_738_
				       | anLocalInt_738_ - (anLocalInt_738_
							    >>> 8));
			    } else if (anLocalInt_728_ == 2) {
				int anLocalInt_739_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_740_
				    = (((anLocalInt_739_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_741_
				    = (((anLocalInt_739_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_727_[anLocalInt_726_]
				    = ((anLocalInt_740_ | anLocalInt_741_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_729_ == 1) {
			    if (anLocalInt_728_ == 1) {
				int anLocalInt_742_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_743_ = anLocalInt_742_ >>> 24;
				int anLocalInt_744_ = 256 - anLocalInt_743_;
				int anLocalInt_745_
				    = anLocalInts_727_[anLocalInt_726_];
				anLocalInts_727_[anLocalInt_726_]
				    = (((((anLocalInt_742_ & 0xff00ff)
					  * anLocalInt_743_)
					 + ((anLocalInt_745_ & 0xff00ff)
					    * anLocalInt_744_))
					& ~0xff00ff)
				       + ((((anLocalInt_742_ & 0xff00)
					    * anLocalInt_743_)
					   + ((anLocalInt_745_ & 0xff00)
					      * anLocalInt_744_))
					  & 0xff0000)) >> 8;
			    } else if (anLocalInt_728_ == 0) {
				int anLocalInt_746_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_747_
				    = (((anLocalInt_746_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_748_ = 256 - anLocalInt_747_;
				if ((Class368_Sub2.anInt5693 & 0xffffff)
				    == 16777215) {
				    int anLocalInt_749_
					= anLocalInts_727_[anLocalInt_726_];
				    anLocalInts_727_[anLocalInt_726_]
					= (((((anLocalInt_746_ & 0xff00ff)
					      * anLocalInt_747_)
					     + ((anLocalInt_749_ & 0xff00ff)
						* anLocalInt_748_))
					    & ~0xff00ff)
					   + ((((anLocalInt_746_ & 0xff00)
						* anLocalInt_747_)
					       + ((anLocalInt_749_ & 0xff00)
						  * anLocalInt_748_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_747_ != 255) {
				    int anLocalInt_750_
					= (((anLocalInt_746_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_751_
					= (((anLocalInt_746_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_752_
					= (((anLocalInt_746_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_746_
					= (anLocalInt_750_ | anLocalInt_751_
					   | anLocalInt_752_) >>> 8;
				    int anLocalInt_753_
					= anLocalInts_727_[anLocalInt_726_];
				    anLocalInts_727_[anLocalInt_726_]
					= (((((anLocalInt_746_ & 0xff00ff)
					      * anLocalInt_747_)
					     + ((anLocalInt_753_ & 0xff00ff)
						* anLocalInt_748_))
					    & ~0xff00ff)
					   + ((((anLocalInt_746_ & 0xff00)
						* anLocalInt_747_)
					       + ((anLocalInt_753_ & 0xff00)
						  * anLocalInt_748_))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_754_
					= (((anLocalInt_746_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_755_
					= (((anLocalInt_746_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_756_
					= (((anLocalInt_746_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_727_[anLocalInt_726_]
					= (anLocalInt_754_ | anLocalInt_755_
					   | anLocalInt_756_) >>> 8;
				}
			    } else if (anLocalInt_728_ == 3) {
				int anLocalInt_757_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_758_ = Class368_Sub2.anInt5693;
				int anLocalInt_759_
				    = anLocalInt_757_ + anLocalInt_758_;
				int anLocalInt_760_
				    = ((anLocalInt_757_ & 0xff00ff)
				       + (anLocalInt_758_ & 0xff00ff));
				int anLocalInt_761_
				    = ((anLocalInt_760_ & 0x1000100)
				       + (anLocalInt_759_ - anLocalInt_760_
					  & 0x10000));
				anLocalInt_761_
				    = (anLocalInt_759_ - anLocalInt_761_
				       | anLocalInt_761_ - (anLocalInt_761_
							    >>> 8));
				int anLocalInt_762_
				    = (((anLocalInt_757_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_763_ = 256 - anLocalInt_762_;
				if (anLocalInt_762_ != 255) {
				    anLocalInt_757_ = anLocalInt_761_;
				    anLocalInt_761_
					= anLocalInts_727_[anLocalInt_726_];
				    anLocalInt_761_
					= (((((anLocalInt_757_ & 0xff00ff)
					      * anLocalInt_762_)
					     + ((anLocalInt_761_ & 0xff00ff)
						* anLocalInt_763_))
					    & ~0xff00ff)
					   + ((((anLocalInt_757_ & 0xff00)
						* anLocalInt_762_)
					       + ((anLocalInt_761_ & 0xff00)
						  * anLocalInt_763_))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_727_[anLocalInt_726_]
				    = anLocalInt_761_;
			    } else if (anLocalInt_728_ == 2) {
				int anLocalInt_764_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_765_ = anLocalInt_764_ >>> 24;
				int anLocalInt_766_ = 256 - anLocalInt_765_;
				int anLocalInt_767_
				    = (((anLocalInt_764_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_768_
				    = (((anLocalInt_764_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_764_
				    = ((anLocalInt_767_ | anLocalInt_768_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_769_
				    = anLocalInts_727_[anLocalInt_726_];
				anLocalInts_727_[anLocalInt_726_]
				    = (((((anLocalInt_764_ & 0xff00ff)
					  * anLocalInt_765_)
					 + ((anLocalInt_769_ & 0xff00ff)
					    * anLocalInt_766_))
					& ~0xff00ff)
				       + ((((anLocalInt_764_ & 0xff00)
					    * anLocalInt_765_)
					   + ((anLocalInt_769_ & 0xff00)
					      * anLocalInt_766_))
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_729_ == 2) {
			    if (anLocalInt_728_ == 1) {
				int anLocalInt_770_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_771_
				    = anLocalInts_727_[anLocalInt_726_];
				int anLocalInt_772_
				    = anLocalInt_770_ + anLocalInt_771_;
				int anLocalInt_773_
				    = ((anLocalInt_770_ & 0xff00ff)
				       + (anLocalInt_771_ & 0xff00ff));
				anLocalInt_771_
				    = ((anLocalInt_773_ & 0x1000100)
				       + (anLocalInt_772_ - anLocalInt_773_
					  & 0x10000));
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_772_ - anLocalInt_771_
				       | anLocalInt_771_ - (anLocalInt_771_
							    >>> 8));
			    } else if (anLocalInt_728_ == 0) {
				int anLocalInt_774_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_775_
				    = (((anLocalInt_774_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_776_
				    = (((anLocalInt_774_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_777_
				    = (((anLocalInt_774_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_774_
				    = (anLocalInt_775_ | anLocalInt_776_
				       | anLocalInt_777_) >>> 8;
				int anLocalInt_778_
				    = anLocalInts_727_[anLocalInt_726_];
				int anLocalInt_779_
				    = anLocalInt_774_ + anLocalInt_778_;
				int anLocalInt_780_
				    = ((anLocalInt_774_ & 0xff00ff)
				       + (anLocalInt_778_ & 0xff00ff));
				anLocalInt_778_
				    = ((anLocalInt_780_ & 0x1000100)
				       + (anLocalInt_779_ - anLocalInt_780_
					  & 0x10000));
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_779_ - anLocalInt_778_
				       | anLocalInt_778_ - (anLocalInt_778_
							    >>> 8));
			    } else if (anLocalInt_728_ == 3) {
				int anLocalInt_781_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_782_ = Class368_Sub2.anInt5693;
				int anLocalInt_783_
				    = anLocalInt_781_ + anLocalInt_782_;
				int anLocalInt_784_
				    = ((anLocalInt_781_ & 0xff00ff)
				       + (anLocalInt_782_ & 0xff00ff));
				int anLocalInt_785_
				    = ((anLocalInt_784_ & 0x1000100)
				       + (anLocalInt_783_ - anLocalInt_784_
					  & 0x10000));
				anLocalInt_781_
				    = (anLocalInt_783_ - anLocalInt_785_
				       | anLocalInt_785_ - (anLocalInt_785_
							    >>> 8));
				anLocalInt_785_
				    = anLocalInts_727_[anLocalInt_726_];
				anLocalInt_783_
				    = anLocalInt_781_ + anLocalInt_785_;
				anLocalInt_784_
				    = ((anLocalInt_781_ & 0xff00ff)
				       + (anLocalInt_785_ & 0xff00ff));
				anLocalInt_785_
				    = ((anLocalInt_784_ & 0x1000100)
				       + (anLocalInt_783_ - anLocalInt_784_
					  & 0x10000));
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_783_ - anLocalInt_785_
				       | anLocalInt_785_ - (anLocalInt_785_
							    >>> 8));
			    } else if (anLocalInt_728_ == 2) {
				int anLocalInt_786_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_725_]);
				int anLocalInt_787_
				    = (((anLocalInt_786_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_788_
				    = (((anLocalInt_786_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_786_
				    = ((anLocalInt_787_ | anLocalInt_788_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_789_
				    = anLocalInts_727_[anLocalInt_726_];
				int anLocalInt_790_
				    = anLocalInt_786_ + anLocalInt_789_;
				int anLocalInt_791_
				    = ((anLocalInt_786_ & 0xff00ff)
				       + (anLocalInt_789_ & 0xff00ff));
				anLocalInt_789_
				    = ((anLocalInt_791_ & 0x1000100)
				       + (anLocalInt_790_ - anLocalInt_791_
					  & 0x10000));
				anLocalInts_727_[anLocalInt_726_]
				    = (anLocalInt_790_ - anLocalInt_789_
				       | anLocalInt_789_ - (anLocalInt_789_
							    >>> 8));
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_721_ += Class368_Sub2.anInt5717;
			anLocalInt_722_ += Class368_Sub2.anInt5712;
		    }
		    anLocalInt++;
		    Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		    Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		    Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
		}
	    } else {
		int anLocalInt = Class368_Sub2.anInt5700;
		while (anLocalInt < 0) {
		    int anLocalInt_792_ = Class368_Sub2.anInt5724;
		    int anLocalInt_793_
			= Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		    int anLocalInt_794_
			= Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		    int anLocalInt_795_ = Class368_Sub2.anInt5713;
		    int anLocalInt_796_;
		    if ((anLocalInt_796_
			 = anLocalInt_793_ - (((Class368_Sub2) this).width
					      << 12))
			>= 0) {
			anLocalInt_796_
			    = ((Class368_Sub2.anInt5717 - anLocalInt_796_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_795_ += anLocalInt_796_;
			anLocalInt_793_
			    += Class368_Sub2.anInt5717 * anLocalInt_796_;
			anLocalInt_794_
			    += Class368_Sub2.anInt5712 * anLocalInt_796_;
			anLocalInt_792_ += anLocalInt_796_;
		    }
		    if ((anLocalInt_796_
			 = ((anLocalInt_793_ - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_795_)
			anLocalInt_795_ = anLocalInt_796_;
		    if (anLocalInt_794_ < 0) {
			anLocalInt_796_
			    = ((Class368_Sub2.anInt5712 - 1 - anLocalInt_794_)
			       / Class368_Sub2.anInt5712);
			anLocalInt_795_ += anLocalInt_796_;
			anLocalInt_793_
			    += Class368_Sub2.anInt5717 * anLocalInt_796_;
			anLocalInt_794_
			    += Class368_Sub2.anInt5712 * anLocalInt_796_;
			anLocalInt_792_ += anLocalInt_796_;
		    }
		    if ((anLocalInt_796_
			 = ((anLocalInt_794_ + 1
			     - (((Class368_Sub2) this).height << 12)
			     - Class368_Sub2.anInt5712)
			    / Class368_Sub2.anInt5712))
			> anLocalInt_795_)
			anLocalInt_795_ = anLocalInt_796_;
		    for (/**/; anLocalInt_795_ < 0; anLocalInt_795_++) {
			int anLocalInt_797_
			    = (((anLocalInt_794_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_793_ >> 12));
			int anLocalInt_798_ = anLocalInt_792_++;
			int[] anLocalInts_799_ = anLocalInts;
			int anLocalInt_800_ = argument_430_;
			int anLocalInt_801_ = argument_431_;
			if (anLocalInt_801_ == 0) {
			    if (anLocalInt_800_ == 1)
				anLocalInts_799_[anLocalInt_798_]
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
			    else if (anLocalInt_800_ == 0) {
				int anLocalInt_802_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_++]);
				int anLocalInt_803_
				    = (((anLocalInt_802_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_804_
				    = (((anLocalInt_802_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_805_
				    = (((anLocalInt_802_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_803_ | anLocalInt_804_
				       | anLocalInt_805_) >>> 8;
			    } else if (anLocalInt_800_ == 3) {
				int anLocalInt_806_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_++]);
				int anLocalInt_807_ = Class368_Sub2.anInt5693;
				int anLocalInt_808_
				    = anLocalInt_806_ + anLocalInt_807_;
				int anLocalInt_809_
				    = ((anLocalInt_806_ & 0xff00ff)
				       + (anLocalInt_807_ & 0xff00ff));
				int anLocalInt_810_
				    = ((anLocalInt_809_ & 0x1000100)
				       + (anLocalInt_808_ - anLocalInt_809_
					  & 0x10000));
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_808_ - anLocalInt_810_
				       | anLocalInt_810_ - (anLocalInt_810_
							    >>> 8));
			    } else if (anLocalInt_800_ == 2) {
				int anLocalInt_811_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_812_
				    = (((anLocalInt_811_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_813_
				    = (((anLocalInt_811_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_799_[anLocalInt_798_]
				    = ((anLocalInt_812_ | anLocalInt_813_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_801_ == 1) {
			    if (anLocalInt_800_ == 1) {
				int anLocalInt_814_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_815_ = anLocalInt_814_ >>> 24;
				int anLocalInt_816_ = 256 - anLocalInt_815_;
				int anLocalInt_817_
				    = anLocalInts_799_[anLocalInt_798_];
				anLocalInts_799_[anLocalInt_798_]
				    = (((((anLocalInt_814_ & 0xff00ff)
					  * anLocalInt_815_)
					 + ((anLocalInt_817_ & 0xff00ff)
					    * anLocalInt_816_))
					& ~0xff00ff)
				       + ((((anLocalInt_814_ & 0xff00)
					    * anLocalInt_815_)
					   + ((anLocalInt_817_ & 0xff00)
					      * anLocalInt_816_))
					  & 0xff0000)) >> 8;
			    } else if (anLocalInt_800_ == 0) {
				int anLocalInt_818_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_819_
				    = (((anLocalInt_818_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_820_ = 256 - anLocalInt_819_;
				if ((Class368_Sub2.anInt5693 & 0xffffff)
				    == 16777215) {
				    int anLocalInt_821_
					= anLocalInts_799_[anLocalInt_798_];
				    anLocalInts_799_[anLocalInt_798_]
					= (((((anLocalInt_818_ & 0xff00ff)
					      * anLocalInt_819_)
					     + ((anLocalInt_821_ & 0xff00ff)
						* anLocalInt_820_))
					    & ~0xff00ff)
					   + ((((anLocalInt_818_ & 0xff00)
						* anLocalInt_819_)
					       + ((anLocalInt_821_ & 0xff00)
						  * anLocalInt_820_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_819_ != 255) {
				    int anLocalInt_822_
					= (((anLocalInt_818_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_823_
					= (((anLocalInt_818_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_824_
					= (((anLocalInt_818_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_818_
					= (anLocalInt_822_ | anLocalInt_823_
					   | anLocalInt_824_) >>> 8;
				    int anLocalInt_825_
					= anLocalInts_799_[anLocalInt_798_];
				    anLocalInts_799_[anLocalInt_798_]
					= (((((anLocalInt_818_ & 0xff00ff)
					      * anLocalInt_819_)
					     + ((anLocalInt_825_ & 0xff00ff)
						* anLocalInt_820_))
					    & ~0xff00ff)
					   + ((((anLocalInt_818_ & 0xff00)
						* anLocalInt_819_)
					       + ((anLocalInt_825_ & 0xff00)
						  * anLocalInt_820_))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_826_
					= (((anLocalInt_818_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_827_
					= (((anLocalInt_818_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_828_
					= (((anLocalInt_818_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_799_[anLocalInt_798_]
					= (anLocalInt_826_ | anLocalInt_827_
					   | anLocalInt_828_) >>> 8;
				}
			    } else if (anLocalInt_800_ == 3) {
				int anLocalInt_829_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_830_ = Class368_Sub2.anInt5693;
				int anLocalInt_831_
				    = anLocalInt_829_ + anLocalInt_830_;
				int anLocalInt_832_
				    = ((anLocalInt_829_ & 0xff00ff)
				       + (anLocalInt_830_ & 0xff00ff));
				int anLocalInt_833_
				    = ((anLocalInt_832_ & 0x1000100)
				       + (anLocalInt_831_ - anLocalInt_832_
					  & 0x10000));
				anLocalInt_833_
				    = (anLocalInt_831_ - anLocalInt_833_
				       | anLocalInt_833_ - (anLocalInt_833_
							    >>> 8));
				int anLocalInt_834_
				    = (((anLocalInt_829_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_835_ = 256 - anLocalInt_834_;
				if (anLocalInt_834_ != 255) {
				    anLocalInt_829_ = anLocalInt_833_;
				    anLocalInt_833_
					= anLocalInts_799_[anLocalInt_798_];
				    anLocalInt_833_
					= (((((anLocalInt_829_ & 0xff00ff)
					      * anLocalInt_834_)
					     + ((anLocalInt_833_ & 0xff00ff)
						* anLocalInt_835_))
					    & ~0xff00ff)
					   + ((((anLocalInt_829_ & 0xff00)
						* anLocalInt_834_)
					       + ((anLocalInt_833_ & 0xff00)
						  * anLocalInt_835_))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_799_[anLocalInt_798_]
				    = anLocalInt_833_;
			    } else if (anLocalInt_800_ == 2) {
				int anLocalInt_836_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_837_ = anLocalInt_836_ >>> 24;
				int anLocalInt_838_ = 256 - anLocalInt_837_;
				int anLocalInt_839_
				    = (((anLocalInt_836_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_840_
				    = (((anLocalInt_836_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_836_
				    = ((anLocalInt_839_ | anLocalInt_840_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_841_
				    = anLocalInts_799_[anLocalInt_798_];
				anLocalInts_799_[anLocalInt_798_]
				    = (((((anLocalInt_836_ & 0xff00ff)
					  * anLocalInt_837_)
					 + ((anLocalInt_841_ & 0xff00ff)
					    * anLocalInt_838_))
					& ~0xff00ff)
				       + ((((anLocalInt_836_ & 0xff00)
					    * anLocalInt_837_)
					   + ((anLocalInt_841_ & 0xff00)
					      * anLocalInt_838_))
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_801_ == 2) {
			    if (anLocalInt_800_ == 1) {
				int anLocalInt_842_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_843_
				    = anLocalInts_799_[anLocalInt_798_];
				int anLocalInt_844_
				    = anLocalInt_842_ + anLocalInt_843_;
				int anLocalInt_845_
				    = ((anLocalInt_842_ & 0xff00ff)
				       + (anLocalInt_843_ & 0xff00ff));
				anLocalInt_843_
				    = ((anLocalInt_845_ & 0x1000100)
				       + (anLocalInt_844_ - anLocalInt_845_
					  & 0x10000));
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_844_ - anLocalInt_843_
				       | anLocalInt_843_ - (anLocalInt_843_
							    >>> 8));
			    } else if (anLocalInt_800_ == 0) {
				int anLocalInt_846_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_847_
				    = (((anLocalInt_846_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_848_
				    = (((anLocalInt_846_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_849_
				    = (((anLocalInt_846_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_846_
				    = (anLocalInt_847_ | anLocalInt_848_
				       | anLocalInt_849_) >>> 8;
				int anLocalInt_850_
				    = anLocalInts_799_[anLocalInt_798_];
				int anLocalInt_851_
				    = anLocalInt_846_ + anLocalInt_850_;
				int anLocalInt_852_
				    = ((anLocalInt_846_ & 0xff00ff)
				       + (anLocalInt_850_ & 0xff00ff));
				anLocalInt_850_
				    = ((anLocalInt_852_ & 0x1000100)
				       + (anLocalInt_851_ - anLocalInt_852_
					  & 0x10000));
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_851_ - anLocalInt_850_
				       | anLocalInt_850_ - (anLocalInt_850_
							    >>> 8));
			    } else if (anLocalInt_800_ == 3) {
				int anLocalInt_853_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_854_ = Class368_Sub2.anInt5693;
				int anLocalInt_855_
				    = anLocalInt_853_ + anLocalInt_854_;
				int anLocalInt_856_
				    = ((anLocalInt_853_ & 0xff00ff)
				       + (anLocalInt_854_ & 0xff00ff));
				int anLocalInt_857_
				    = ((anLocalInt_856_ & 0x1000100)
				       + (anLocalInt_855_ - anLocalInt_856_
					  & 0x10000));
				anLocalInt_853_
				    = (anLocalInt_855_ - anLocalInt_857_
				       | anLocalInt_857_ - (anLocalInt_857_
							    >>> 8));
				anLocalInt_857_
				    = anLocalInts_799_[anLocalInt_798_];
				anLocalInt_855_
				    = anLocalInt_853_ + anLocalInt_857_;
				anLocalInt_856_
				    = ((anLocalInt_853_ & 0xff00ff)
				       + (anLocalInt_857_ & 0xff00ff));
				anLocalInt_857_
				    = ((anLocalInt_856_ & 0x1000100)
				       + (anLocalInt_855_ - anLocalInt_856_
					  & 0x10000));
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_855_ - anLocalInt_857_
				       | anLocalInt_857_ - (anLocalInt_857_
							    >>> 8));
			    } else if (anLocalInt_800_ == 2) {
				int anLocalInt_858_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_797_]);
				int anLocalInt_859_
				    = (((anLocalInt_858_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_860_
				    = (((anLocalInt_858_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_858_
				    = ((anLocalInt_859_ | anLocalInt_860_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_861_
				    = anLocalInts_799_[anLocalInt_798_];
				int anLocalInt_862_
				    = anLocalInt_858_ + anLocalInt_861_;
				int anLocalInt_863_
				    = ((anLocalInt_858_ & 0xff00ff)
				       + (anLocalInt_861_ & 0xff00ff));
				anLocalInt_861_
				    = ((anLocalInt_863_ & 0x1000100)
				       + (anLocalInt_862_ - anLocalInt_863_
					  & 0x10000));
				anLocalInts_799_[anLocalInt_798_]
				    = (anLocalInt_862_ - anLocalInt_861_
				       | anLocalInt_861_ - (anLocalInt_861_
							    >>> 8));
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_793_ += Class368_Sub2.anInt5717;
			anLocalInt_794_ += Class368_Sub2.anInt5712;
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
		int anLocalInt_864_ = Class368_Sub2.anInt5724;
		int anLocalInt_865_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_866_ = Class368_Sub2.anInt5704;
		int anLocalInt_867_ = Class368_Sub2.anInt5713;
		if (anLocalInt_866_ >= 0
		    && anLocalInt_866_ - (((Class368_Sub2) this).height
					  << 12) < 0) {
		    if (anLocalInt_865_ < 0) {
			int anLocalInt_868_
			    = ((Class368_Sub2.anInt5717 - 1 - anLocalInt_865_)
			       / Class368_Sub2.anInt5717);
			anLocalInt_867_ += anLocalInt_868_;
			anLocalInt_865_
			    += Class368_Sub2.anInt5717 * anLocalInt_868_;
			anLocalInt_864_ += anLocalInt_868_;
		    }
		    int anLocalInt_869_;
		    if ((anLocalInt_869_
			 = ((anLocalInt_865_ + 1
			     - (((Class368_Sub2) this).width << 12)
			     - Class368_Sub2.anInt5717)
			    / Class368_Sub2.anInt5717))
			> anLocalInt_867_)
			anLocalInt_867_ = anLocalInt_869_;
		    for (/**/; anLocalInt_867_ < 0; anLocalInt_867_++) {
			int anLocalInt_870_
			    = (((anLocalInt_866_ >> 12)
				* ((Class368_Sub2) this).width)
			       + (anLocalInt_865_ >> 12));
			int anLocalInt_871_ = anLocalInt_864_++;
			int[] anLocalInts_872_ = anLocalInts;
			int anLocalInt_873_ = argument_430_;
			int anLocalInt_874_ = argument_431_;
			if (anLocalInt_874_ == 0) {
			    if (anLocalInt_873_ == 1)
				anLocalInts_872_[anLocalInt_871_]
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
			    else if (anLocalInt_873_ == 0) {
				int anLocalInt_875_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_++]);
				int anLocalInt_876_
				    = (((anLocalInt_875_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_877_
				    = (((anLocalInt_875_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_878_
				    = (((anLocalInt_875_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_876_ | anLocalInt_877_
				       | anLocalInt_878_) >>> 8;
			    } else if (anLocalInt_873_ == 3) {
				int anLocalInt_879_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_++]);
				int anLocalInt_880_ = Class368_Sub2.anInt5693;
				int anLocalInt_881_
				    = anLocalInt_879_ + anLocalInt_880_;
				int anLocalInt_882_
				    = ((anLocalInt_879_ & 0xff00ff)
				       + (anLocalInt_880_ & 0xff00ff));
				int anLocalInt_883_
				    = ((anLocalInt_882_ & 0x1000100)
				       + (anLocalInt_881_ - anLocalInt_882_
					  & 0x10000));
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_881_ - anLocalInt_883_
				       | anLocalInt_883_ - (anLocalInt_883_
							    >>> 8));
			    } else if (anLocalInt_873_ == 2) {
				int anLocalInt_884_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_885_
				    = (((anLocalInt_884_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_886_
				    = (((anLocalInt_884_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInts_872_[anLocalInt_871_]
				    = ((anLocalInt_885_ | anLocalInt_886_)
				       >>> 8) + Class368_Sub2.anInt5697;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_874_ == 1) {
			    if (anLocalInt_873_ == 1) {
				int anLocalInt_887_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_888_ = anLocalInt_887_ >>> 24;
				int anLocalInt_889_ = 256 - anLocalInt_888_;
				int anLocalInt_890_
				    = anLocalInts_872_[anLocalInt_871_];
				anLocalInts_872_[anLocalInt_871_]
				    = (((((anLocalInt_887_ & 0xff00ff)
					  * anLocalInt_888_)
					 + ((anLocalInt_890_ & 0xff00ff)
					    * anLocalInt_889_))
					& ~0xff00ff)
				       + ((((anLocalInt_887_ & 0xff00)
					    * anLocalInt_888_)
					   + ((anLocalInt_890_ & 0xff00)
					      * anLocalInt_889_))
					  & 0xff0000)) >> 8;
			    } else if (anLocalInt_873_ == 0) {
				int anLocalInt_891_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_892_
				    = (((anLocalInt_891_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_893_ = 256 - anLocalInt_892_;
				if ((Class368_Sub2.anInt5693 & 0xffffff)
				    == 16777215) {
				    int anLocalInt_894_
					= anLocalInts_872_[anLocalInt_871_];
				    anLocalInts_872_[anLocalInt_871_]
					= (((((anLocalInt_891_ & 0xff00ff)
					      * anLocalInt_892_)
					     + ((anLocalInt_894_ & 0xff00ff)
						* anLocalInt_893_))
					    & ~0xff00ff)
					   + ((((anLocalInt_891_ & 0xff00)
						* anLocalInt_892_)
					       + ((anLocalInt_894_ & 0xff00)
						  * anLocalInt_893_))
					      & 0xff0000)) >> 8;
				} else if (anLocalInt_892_ != 255) {
				    int anLocalInt_895_
					= (((anLocalInt_891_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_896_
					= (((anLocalInt_891_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_897_
					= (((anLocalInt_891_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInt_891_
					= (anLocalInt_895_ | anLocalInt_896_
					   | anLocalInt_897_) >>> 8;
				    int anLocalInt_898_
					= anLocalInts_872_[anLocalInt_871_];
				    anLocalInts_872_[anLocalInt_871_]
					= (((((anLocalInt_891_ & 0xff00ff)
					      * anLocalInt_892_)
					     + ((anLocalInt_898_ & 0xff00ff)
						* anLocalInt_893_))
					    & ~0xff00ff)
					   + ((((anLocalInt_891_ & 0xff00)
						* anLocalInt_892_)
					       + ((anLocalInt_898_ & 0xff00)
						  * anLocalInt_893_))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_899_
					= (((anLocalInt_891_ & 0xff0000)
					    * Class368_Sub2.anInt5702)
					   & ~0xffffff);
				    int anLocalInt_900_
					= (((anLocalInt_891_ & 0xff00)
					    * Class368_Sub2.anInt5714)
					   & 0xff0000);
				    int anLocalInt_901_
					= (((anLocalInt_891_ & 0xff)
					    * Class368_Sub2.anInt5701)
					   & 0xff00);
				    anLocalInts_872_[anLocalInt_871_]
					= (anLocalInt_899_ | anLocalInt_900_
					   | anLocalInt_901_) >>> 8;
				}
			    } else if (anLocalInt_873_ == 3) {
				int anLocalInt_902_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_903_ = Class368_Sub2.anInt5693;
				int anLocalInt_904_
				    = anLocalInt_902_ + anLocalInt_903_;
				int anLocalInt_905_
				    = ((anLocalInt_902_ & 0xff00ff)
				       + (anLocalInt_903_ & 0xff00ff));
				int anLocalInt_906_
				    = ((anLocalInt_905_ & 0x1000100)
				       + (anLocalInt_904_ - anLocalInt_905_
					  & 0x10000));
				anLocalInt_906_
				    = (anLocalInt_904_ - anLocalInt_906_
				       | anLocalInt_906_ - (anLocalInt_906_
							    >>> 8));
				int anLocalInt_907_
				    = (((anLocalInt_902_ >>> 24)
					* Class368_Sub2.anInt5695)
				       >> 8);
				int anLocalInt_908_ = 256 - anLocalInt_907_;
				if (anLocalInt_907_ != 255) {
				    anLocalInt_902_ = anLocalInt_906_;
				    anLocalInt_906_
					= anLocalInts_872_[anLocalInt_871_];
				    anLocalInt_906_
					= (((((anLocalInt_902_ & 0xff00ff)
					      * anLocalInt_907_)
					     + ((anLocalInt_906_ & 0xff00ff)
						* anLocalInt_908_))
					    & ~0xff00ff)
					   + ((((anLocalInt_902_ & 0xff00)
						* anLocalInt_907_)
					       + ((anLocalInt_906_ & 0xff00)
						  * anLocalInt_908_))
					      & 0xff0000)) >> 8;
				}
				anLocalInts_872_[anLocalInt_871_]
				    = anLocalInt_906_;
			    } else if (anLocalInt_873_ == 2) {
				int anLocalInt_909_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_910_ = anLocalInt_909_ >>> 24;
				int anLocalInt_911_ = 256 - anLocalInt_910_;
				int anLocalInt_912_
				    = (((anLocalInt_909_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_913_
				    = (((anLocalInt_909_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_909_
				    = ((anLocalInt_912_ | anLocalInt_913_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_914_
				    = anLocalInts_872_[anLocalInt_871_];
				anLocalInts_872_[anLocalInt_871_]
				    = (((((anLocalInt_909_ & 0xff00ff)
					  * anLocalInt_910_)
					 + ((anLocalInt_914_ & 0xff00ff)
					    * anLocalInt_911_))
					& ~0xff00ff)
				       + ((((anLocalInt_909_ & 0xff00)
					    * anLocalInt_910_)
					   + ((anLocalInt_914_ & 0xff00)
					      * anLocalInt_911_))
					  & 0xff0000)) >> 8;
			    } else
				throw new IllegalArgumentException();
			} else if (anLocalInt_874_ == 2) {
			    if (anLocalInt_873_ == 1) {
				int anLocalInt_915_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_916_
				    = anLocalInts_872_[anLocalInt_871_];
				int anLocalInt_917_
				    = anLocalInt_915_ + anLocalInt_916_;
				int anLocalInt_918_
				    = ((anLocalInt_915_ & 0xff00ff)
				       + (anLocalInt_916_ & 0xff00ff));
				anLocalInt_916_
				    = ((anLocalInt_918_ & 0x1000100)
				       + (anLocalInt_917_ - anLocalInt_918_
					  & 0x10000));
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_917_ - anLocalInt_916_
				       | anLocalInt_916_ - (anLocalInt_916_
							    >>> 8));
			    } else if (anLocalInt_873_ == 0) {
				int anLocalInt_919_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_920_
				    = (((anLocalInt_919_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_921_
				    = (((anLocalInt_919_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_922_
				    = (((anLocalInt_919_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_919_
				    = (anLocalInt_920_ | anLocalInt_921_
				       | anLocalInt_922_) >>> 8;
				int anLocalInt_923_
				    = anLocalInts_872_[anLocalInt_871_];
				int anLocalInt_924_
				    = anLocalInt_919_ + anLocalInt_923_;
				int anLocalInt_925_
				    = ((anLocalInt_919_ & 0xff00ff)
				       + (anLocalInt_923_ & 0xff00ff));
				anLocalInt_923_
				    = ((anLocalInt_925_ & 0x1000100)
				       + (anLocalInt_924_ - anLocalInt_925_
					  & 0x10000));
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_924_ - anLocalInt_923_
				       | anLocalInt_923_ - (anLocalInt_923_
							    >>> 8));
			    } else if (anLocalInt_873_ == 3) {
				int anLocalInt_926_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_927_ = Class368_Sub2.anInt5693;
				int anLocalInt_928_
				    = anLocalInt_926_ + anLocalInt_927_;
				int anLocalInt_929_
				    = ((anLocalInt_926_ & 0xff00ff)
				       + (anLocalInt_927_ & 0xff00ff));
				int anLocalInt_930_
				    = ((anLocalInt_929_ & 0x1000100)
				       + (anLocalInt_928_ - anLocalInt_929_
					  & 0x10000));
				anLocalInt_926_
				    = (anLocalInt_928_ - anLocalInt_930_
				       | anLocalInt_930_ - (anLocalInt_930_
							    >>> 8));
				anLocalInt_930_
				    = anLocalInts_872_[anLocalInt_871_];
				anLocalInt_928_
				    = anLocalInt_926_ + anLocalInt_930_;
				anLocalInt_929_
				    = ((anLocalInt_926_ & 0xff00ff)
				       + (anLocalInt_930_ & 0xff00ff));
				anLocalInt_930_
				    = ((anLocalInt_929_ & 0x1000100)
				       + (anLocalInt_928_ - anLocalInt_929_
					  & 0x10000));
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_928_ - anLocalInt_930_
				       | anLocalInt_930_ - (anLocalInt_930_
							    >>> 8));
			    } else if (anLocalInt_873_ == 2) {
				int anLocalInt_931_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635[anLocalInt_870_]);
				int anLocalInt_932_
				    = (((anLocalInt_931_ & 0xff00ff)
					* Class368_Sub2.anInt5695)
				       & ~0xff00ff);
				int anLocalInt_933_
				    = (((anLocalInt_931_ & 0xff00)
					* Class368_Sub2.anInt5695)
				       & 0xff0000);
				anLocalInt_931_
				    = ((anLocalInt_932_ | anLocalInt_933_)
				       >>> 8) + Class368_Sub2.anInt5697;
				int anLocalInt_934_
				    = anLocalInts_872_[anLocalInt_871_];
				int anLocalInt_935_
				    = anLocalInt_931_ + anLocalInt_934_;
				int anLocalInt_936_
				    = ((anLocalInt_931_ & 0xff00ff)
				       + (anLocalInt_934_ & 0xff00ff));
				anLocalInt_934_
				    = ((anLocalInt_936_ & 0x1000100)
				       + (anLocalInt_935_ - anLocalInt_936_
					  & 0x10000));
				anLocalInts_872_[anLocalInt_871_]
				    = (anLocalInt_935_ - anLocalInt_934_
				       | anLocalInt_934_ - (anLocalInt_934_
							    >>> 8));
			    }
			} else
			    throw new IllegalArgumentException();
			anLocalInt_865_ += Class368_Sub2.anInt5717;
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
		int anLocalInt_937_ = Class368_Sub2.anInt5724;
		int anLocalInt_938_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_939_
		    = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		int anLocalInt_940_ = Class368_Sub2.anInt5713;
		if (anLocalInt_938_ < 0) {
		    int anLocalInt_941_
			= ((Class368_Sub2.anInt5717 - 1 - anLocalInt_938_)
			   / Class368_Sub2.anInt5717);
		    anLocalInt_940_ += anLocalInt_941_;
		    anLocalInt_938_
			+= Class368_Sub2.anInt5717 * anLocalInt_941_;
		    anLocalInt_939_
			+= Class368_Sub2.anInt5712 * anLocalInt_941_;
		    anLocalInt_937_ += anLocalInt_941_;
		}
		int anLocalInt_942_;
		if ((anLocalInt_942_
		     = (anLocalInt_938_ + 1
			- (((Class368_Sub2) this).width << 12)
			- Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)
		    > anLocalInt_940_)
		    anLocalInt_940_ = anLocalInt_942_;
		if ((anLocalInt_942_
		     = anLocalInt_939_ - (((Class368_Sub2) this).height
					  << 12))
		    >= 0) {
		    anLocalInt_942_
			= ((Class368_Sub2.anInt5712 - anLocalInt_942_)
			   / Class368_Sub2.anInt5712);
		    anLocalInt_940_ += anLocalInt_942_;
		    anLocalInt_938_
			+= Class368_Sub2.anInt5717 * anLocalInt_942_;
		    anLocalInt_939_
			+= Class368_Sub2.anInt5712 * anLocalInt_942_;
		    anLocalInt_937_ += anLocalInt_942_;
		}
		if ((anLocalInt_942_
		     = ((anLocalInt_939_ - Class368_Sub2.anInt5712)
			/ Class368_Sub2.anInt5712))
		    > anLocalInt_940_)
		    anLocalInt_940_ = anLocalInt_942_;
		for (/**/; anLocalInt_940_ < 0; anLocalInt_940_++) {
		    int anLocalInt_943_ = (((anLocalInt_939_ >> 12)
					    * ((Class368_Sub2) this).width)
					   + (anLocalInt_938_ >> 12));
		    int anLocalInt_944_ = anLocalInt_937_++;
		    int[] anLocalInts_945_ = anLocalInts;
		    int anLocalInt_946_ = argument_430_;
		    int anLocalInt_947_ = argument_431_;
		    if (anLocalInt_947_ == 0) {
			if (anLocalInt_946_ == 1)
			    anLocalInts_945_[anLocalInt_944_]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			else if (anLocalInt_946_ == 0) {
			    int anLocalInt_948_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_++]);
			    int anLocalInt_949_
				= (((anLocalInt_948_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_950_ = (((anLocalInt_948_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
			    int anLocalInt_951_ = (((anLocalInt_948_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_949_ | anLocalInt_950_
				   | anLocalInt_951_) >>> 8;
			} else if (anLocalInt_946_ == 3) {
			    int anLocalInt_952_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_++]);
			    int anLocalInt_953_ = Class368_Sub2.anInt5693;
			    int anLocalInt_954_
				= anLocalInt_952_ + anLocalInt_953_;
			    int anLocalInt_955_
				= ((anLocalInt_952_ & 0xff00ff)
				   + (anLocalInt_953_ & 0xff00ff));
			    int anLocalInt_956_
				= ((anLocalInt_955_ & 0x1000100)
				   + (anLocalInt_954_ - anLocalInt_955_
				      & 0x10000));
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_954_ - anLocalInt_956_
				   | anLocalInt_956_ - (anLocalInt_956_
							>>> 8));
			} else if (anLocalInt_946_ == 2) {
			    int anLocalInt_957_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_958_
				= (((anLocalInt_957_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_959_ = (((anLocalInt_957_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   & 0xff0000);
			    anLocalInts_945_[anLocalInt_944_]
				= (((anLocalInt_958_ | anLocalInt_959_) >>> 8)
				   + Class368_Sub2.anInt5697);
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_947_ == 1) {
			if (anLocalInt_946_ == 1) {
			    int anLocalInt_960_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_961_ = anLocalInt_960_ >>> 24;
			    int anLocalInt_962_ = 256 - anLocalInt_961_;
			    int anLocalInt_963_
				= anLocalInts_945_[anLocalInt_944_];
			    anLocalInts_945_[anLocalInt_944_]
				= (((((anLocalInt_960_ & 0xff00ff)
				      * anLocalInt_961_)
				     + ((anLocalInt_963_ & 0xff00ff)
					* anLocalInt_962_))
				    & ~0xff00ff)
				   + ((((anLocalInt_960_ & 0xff00)
					* anLocalInt_961_)
				       + ((anLocalInt_963_ & 0xff00)
					  * anLocalInt_962_))
				      & 0xff0000)) >> 8;
			} else if (anLocalInt_946_ == 0) {
			    int anLocalInt_964_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_965_ = (((anLocalInt_964_ >>> 24)
						    * Class368_Sub2.anInt5695)
						   >> 8);
			    int anLocalInt_966_ = 256 - anLocalInt_965_;
			    if ((Class368_Sub2.anInt5693 & 0xffffff)
				== 16777215) {
				int anLocalInt_967_
				    = anLocalInts_945_[anLocalInt_944_];
				anLocalInts_945_[anLocalInt_944_]
				    = (((((anLocalInt_964_ & 0xff00ff)
					  * anLocalInt_965_)
					 + ((anLocalInt_967_ & 0xff00ff)
					    * anLocalInt_966_))
					& ~0xff00ff)
				       + ((((anLocalInt_964_ & 0xff00)
					    * anLocalInt_965_)
					   + ((anLocalInt_967_ & 0xff00)
					      * anLocalInt_966_))
					  & 0xff0000)) >> 8;
			    } else if (anLocalInt_965_ != 255) {
				int anLocalInt_968_
				    = (((anLocalInt_964_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_969_
				    = (((anLocalInt_964_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_970_
				    = (((anLocalInt_964_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_964_
				    = (anLocalInt_968_ | anLocalInt_969_
				       | anLocalInt_970_) >>> 8;
				int anLocalInt_971_
				    = anLocalInts_945_[anLocalInt_944_];
				anLocalInts_945_[anLocalInt_944_]
				    = (((((anLocalInt_964_ & 0xff00ff)
					  * anLocalInt_965_)
					 + ((anLocalInt_971_ & 0xff00ff)
					    * anLocalInt_966_))
					& ~0xff00ff)
				       + ((((anLocalInt_964_ & 0xff00)
					    * anLocalInt_965_)
					   + ((anLocalInt_971_ & 0xff00)
					      * anLocalInt_966_))
					  & 0xff0000)) >> 8;
			    } else {
				int anLocalInt_972_
				    = (((anLocalInt_964_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_973_
				    = (((anLocalInt_964_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_974_
				    = (((anLocalInt_964_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_945_[anLocalInt_944_]
				    = (anLocalInt_972_ | anLocalInt_973_
				       | anLocalInt_974_) >>> 8;
			    }
			} else if (anLocalInt_946_ == 3) {
			    int anLocalInt_975_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_976_ = Class368_Sub2.anInt5693;
			    int anLocalInt_977_
				= anLocalInt_975_ + anLocalInt_976_;
			    int anLocalInt_978_
				= ((anLocalInt_975_ & 0xff00ff)
				   + (anLocalInt_976_ & 0xff00ff));
			    int anLocalInt_979_
				= ((anLocalInt_978_ & 0x1000100)
				   + (anLocalInt_977_ - anLocalInt_978_
				      & 0x10000));
			    anLocalInt_979_
				= (anLocalInt_977_ - anLocalInt_979_
				   | anLocalInt_979_ - (anLocalInt_979_
							>>> 8));
			    int anLocalInt_980_ = (((anLocalInt_975_ >>> 24)
						    * Class368_Sub2.anInt5695)
						   >> 8);
			    int anLocalInt_981_ = 256 - anLocalInt_980_;
			    if (anLocalInt_980_ != 255) {
				anLocalInt_975_ = anLocalInt_979_;
				anLocalInt_979_
				    = anLocalInts_945_[anLocalInt_944_];
				anLocalInt_979_
				    = (((((anLocalInt_975_ & 0xff00ff)
					  * anLocalInt_980_)
					 + ((anLocalInt_979_ & 0xff00ff)
					    * anLocalInt_981_))
					& ~0xff00ff)
				       + ((((anLocalInt_975_ & 0xff00)
					    * anLocalInt_980_)
					   + ((anLocalInt_979_ & 0xff00)
					      * anLocalInt_981_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_945_[anLocalInt_944_]
				= anLocalInt_979_;
			} else if (anLocalInt_946_ == 2) {
			    int anLocalInt_982_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_983_ = anLocalInt_982_ >>> 24;
			    int anLocalInt_984_ = 256 - anLocalInt_983_;
			    int anLocalInt_985_
				= (((anLocalInt_982_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_986_ = (((anLocalInt_982_ & 0xff00)
						    * Class368_Sub2.anInt5695)
						   & 0xff0000);
			    anLocalInt_982_
				= (((anLocalInt_985_ | anLocalInt_986_) >>> 8)
				   + Class368_Sub2.anInt5697);
			    int anLocalInt_987_
				= anLocalInts_945_[anLocalInt_944_];
			    anLocalInts_945_[anLocalInt_944_]
				= (((((anLocalInt_982_ & 0xff00ff)
				      * anLocalInt_983_)
				     + ((anLocalInt_987_ & 0xff00ff)
					* anLocalInt_984_))
				    & ~0xff00ff)
				   + ((((anLocalInt_982_ & 0xff00)
					* anLocalInt_983_)
				       + ((anLocalInt_987_ & 0xff00)
					  * anLocalInt_984_))
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_947_ == 2) {
			if (anLocalInt_946_ == 1) {
			    int anLocalInt_988_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_989_
				= anLocalInts_945_[anLocalInt_944_];
			    int anLocalInt_990_
				= anLocalInt_988_ + anLocalInt_989_;
			    int anLocalInt_991_
				= ((anLocalInt_988_ & 0xff00ff)
				   + (anLocalInt_989_ & 0xff00ff));
			    anLocalInt_989_
				= ((anLocalInt_991_ & 0x1000100)
				   + (anLocalInt_990_ - anLocalInt_991_
				      & 0x10000));
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_990_ - anLocalInt_989_
				   | anLocalInt_989_ - (anLocalInt_989_
							>>> 8));
			} else if (anLocalInt_946_ == 0) {
			    int anLocalInt_992_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_993_
				= (((anLocalInt_992_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_994_ = (((anLocalInt_992_ & 0xff00)
						    * Class368_Sub2.anInt5714)
						   & 0xff0000);
			    int anLocalInt_995_ = (((anLocalInt_992_ & 0xff)
						    * Class368_Sub2.anInt5701)
						   & 0xff00);
			    anLocalInt_992_
				= (anLocalInt_993_ | anLocalInt_994_
				   | anLocalInt_995_) >>> 8;
			    int anLocalInt_996_
				= anLocalInts_945_[anLocalInt_944_];
			    int anLocalInt_997_
				= anLocalInt_992_ + anLocalInt_996_;
			    int anLocalInt_998_
				= ((anLocalInt_992_ & 0xff00ff)
				   + (anLocalInt_996_ & 0xff00ff));
			    anLocalInt_996_
				= ((anLocalInt_998_ & 0x1000100)
				   + (anLocalInt_997_ - anLocalInt_998_
				      & 0x10000));
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_997_ - anLocalInt_996_
				   | anLocalInt_996_ - (anLocalInt_996_
							>>> 8));
			} else if (anLocalInt_946_ == 3) {
			    int anLocalInt_999_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_1000_ = Class368_Sub2.anInt5693;
			    int anLocalInt_1001_
				= anLocalInt_999_ + anLocalInt_1000_;
			    int anLocalInt_1002_
				= ((anLocalInt_999_ & 0xff00ff)
				   + (anLocalInt_1000_ & 0xff00ff));
			    int anLocalInt_1003_
				= ((anLocalInt_1002_ & 0x1000100)
				   + (anLocalInt_1001_ - anLocalInt_1002_
				      & 0x10000));
			    anLocalInt_999_
				= (anLocalInt_1001_ - anLocalInt_1003_
				   | anLocalInt_1003_ - (anLocalInt_1003_
							 >>> 8));
			    anLocalInt_1003_
				= anLocalInts_945_[anLocalInt_944_];
			    anLocalInt_1001_
				= anLocalInt_999_ + anLocalInt_1003_;
			    anLocalInt_1002_
				= ((anLocalInt_999_ & 0xff00ff)
				   + (anLocalInt_1003_ & 0xff00ff));
			    anLocalInt_1003_
				= ((anLocalInt_1002_ & 0x1000100)
				   + (anLocalInt_1001_ - anLocalInt_1002_
				      & 0x10000));
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_1001_ - anLocalInt_1003_
				   | anLocalInt_1003_ - (anLocalInt_1003_
							 >>> 8));
			} else if (anLocalInt_946_ == 2) {
			    int anLocalInt_1004_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_943_]);
			    int anLocalInt_1005_
				= (((anLocalInt_1004_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_1006_
				= (((anLocalInt_1004_ & 0xff00)
				    * Class368_Sub2.anInt5695)
				   & 0xff0000);
			    anLocalInt_1004_
				= ((anLocalInt_1005_ | anLocalInt_1006_)
				   >>> 8) + Class368_Sub2.anInt5697;
			    int anLocalInt_1007_
				= anLocalInts_945_[anLocalInt_944_];
			    int anLocalInt_1008_
				= anLocalInt_1004_ + anLocalInt_1007_;
			    int anLocalInt_1009_
				= ((anLocalInt_1004_ & 0xff00ff)
				   + (anLocalInt_1007_ & 0xff00ff));
			    anLocalInt_1007_
				= ((anLocalInt_1009_ & 0x1000100)
				   + (anLocalInt_1008_ - anLocalInt_1009_
				      & 0x10000));
			    anLocalInts_945_[anLocalInt_944_]
				= (anLocalInt_1008_ - anLocalInt_1007_
				   | anLocalInt_1007_ - (anLocalInt_1007_
							 >>> 8));
			}
		    } else
			throw new IllegalArgumentException();
		    anLocalInt_938_ += Class368_Sub2.anInt5717;
		    anLocalInt_939_ += Class368_Sub2.anInt5712;
		}
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	} else {
	    for (int anLocalInt = Class368_Sub2.anInt5700; anLocalInt < 0;
		 anLocalInt++) {
		int anLocalInt_1010_ = Class368_Sub2.anInt5724;
		int anLocalInt_1011_
		    = Class368_Sub2.anInt5710 + Class368_Sub2.anInt5721;
		int anLocalInt_1012_
		    = Class368_Sub2.anInt5704 + Class368_Sub2.anInt5725;
		int anLocalInt_1013_ = Class368_Sub2.anInt5713;
		if (anLocalInt_1011_ < 0) {
		    int anLocalInt_1014_
			= ((Class368_Sub2.anInt5717 - 1 - anLocalInt_1011_)
			   / Class368_Sub2.anInt5717);
		    anLocalInt_1013_ += anLocalInt_1014_;
		    anLocalInt_1011_
			+= Class368_Sub2.anInt5717 * anLocalInt_1014_;
		    anLocalInt_1012_
			+= Class368_Sub2.anInt5712 * anLocalInt_1014_;
		    anLocalInt_1010_ += anLocalInt_1014_;
		}
		int anLocalInt_1015_;
		if ((anLocalInt_1015_
		     = (anLocalInt_1011_ + 1
			- (((Class368_Sub2) this).width << 12)
			- Class368_Sub2.anInt5717) / Class368_Sub2.anInt5717)
		    > anLocalInt_1013_)
		    anLocalInt_1013_ = anLocalInt_1015_;
		if (anLocalInt_1012_ < 0) {
		    anLocalInt_1015_
			= ((Class368_Sub2.anInt5712 - 1 - anLocalInt_1012_)
			   / Class368_Sub2.anInt5712);
		    anLocalInt_1013_ += anLocalInt_1015_;
		    anLocalInt_1011_
			+= Class368_Sub2.anInt5717 * anLocalInt_1015_;
		    anLocalInt_1012_
			+= Class368_Sub2.anInt5712 * anLocalInt_1015_;
		    anLocalInt_1010_ += anLocalInt_1015_;
		}
		if ((anLocalInt_1015_
		     = (anLocalInt_1012_ + 1
			- (((Class368_Sub2) this).height << 12)
			- Class368_Sub2.anInt5712) / Class368_Sub2.anInt5712)
		    > anLocalInt_1013_)
		    anLocalInt_1013_ = anLocalInt_1015_;
		for (/**/; anLocalInt_1013_ < 0; anLocalInt_1013_++) {
		    int anLocalInt_1016_
			= (((anLocalInt_1012_ >> 12)
			    * ((Class368_Sub2) this).width)
			   + (anLocalInt_1011_ >> 12));
		    int anLocalInt_1017_ = anLocalInt_1010_++;
		    int[] anLocalInts_1018_ = anLocalInts;
		    int anLocalInt_1019_ = argument_430_;
		    int anLocalInt_1020_ = argument_431_;
		    if (anLocalInt_1020_ == 0) {
			if (anLocalInt_1019_ == 1)
			    anLocalInts_1018_[anLocalInt_1017_]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			else if (anLocalInt_1019_ == 0) {
			    int anLocalInt_1021_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_++]);
			    int anLocalInt_1022_
				= (((anLocalInt_1021_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_1023_
				= (((anLocalInt_1021_ & 0xff00)
				    * Class368_Sub2.anInt5714)
				   & 0xff0000);
			    int anLocalInt_1024_ = (((anLocalInt_1021_ & 0xff)
						     * Class368_Sub2.anInt5701)
						    & 0xff00);
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1022_ | anLocalInt_1023_
				   | anLocalInt_1024_) >>> 8;
			} else if (anLocalInt_1019_ == 3) {
			    int anLocalInt_1025_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_++]);
			    int anLocalInt_1026_ = Class368_Sub2.anInt5693;
			    int anLocalInt_1027_
				= anLocalInt_1025_ + anLocalInt_1026_;
			    int anLocalInt_1028_
				= ((anLocalInt_1025_ & 0xff00ff)
				   + (anLocalInt_1026_ & 0xff00ff));
			    int anLocalInt_1029_
				= ((anLocalInt_1028_ & 0x1000100)
				   + (anLocalInt_1027_ - anLocalInt_1028_
				      & 0x10000));
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1027_ - anLocalInt_1029_
				   | anLocalInt_1029_ - (anLocalInt_1029_
							 >>> 8));
			} else if (anLocalInt_1019_ == 2) {
			    int anLocalInt_1030_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1031_
				= (((anLocalInt_1030_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_1032_
				= (((anLocalInt_1030_ & 0xff00)
				    * Class368_Sub2.anInt5695)
				   & 0xff0000);
			    anLocalInts_1018_[anLocalInt_1017_]
				= ((anLocalInt_1031_ | anLocalInt_1032_)
				   >>> 8) + Class368_Sub2.anInt5697;
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_1020_ == 1) {
			if (anLocalInt_1019_ == 1) {
			    int anLocalInt_1033_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1034_ = anLocalInt_1033_ >>> 24;
			    int anLocalInt_1035_ = 256 - anLocalInt_1034_;
			    int anLocalInt_1036_
				= anLocalInts_1018_[anLocalInt_1017_];
			    anLocalInts_1018_[anLocalInt_1017_]
				= (((((anLocalInt_1033_ & 0xff00ff)
				      * anLocalInt_1034_)
				     + ((anLocalInt_1036_ & 0xff00ff)
					* anLocalInt_1035_))
				    & ~0xff00ff)
				   + ((((anLocalInt_1033_ & 0xff00)
					* anLocalInt_1034_)
				       + ((anLocalInt_1036_ & 0xff00)
					  * anLocalInt_1035_))
				      & 0xff0000)) >> 8;
			} else if (anLocalInt_1019_ == 0) {
			    int anLocalInt_1037_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1038_ = (((anLocalInt_1037_ >>> 24)
						     * Class368_Sub2.anInt5695)
						    >> 8);
			    int anLocalInt_1039_ = 256 - anLocalInt_1038_;
			    if ((Class368_Sub2.anInt5693 & 0xffffff)
				== 16777215) {
				int anLocalInt_1040_
				    = anLocalInts_1018_[anLocalInt_1017_];
				anLocalInts_1018_[anLocalInt_1017_]
				    = (((((anLocalInt_1037_ & 0xff00ff)
					  * anLocalInt_1038_)
					 + ((anLocalInt_1040_ & 0xff00ff)
					    * anLocalInt_1039_))
					& ~0xff00ff)
				       + ((((anLocalInt_1037_ & 0xff00)
					    * anLocalInt_1038_)
					   + ((anLocalInt_1040_ & 0xff00)
					      * anLocalInt_1039_))
					  & 0xff0000)) >> 8;
			    } else if (anLocalInt_1038_ != 255) {
				int anLocalInt_1041_
				    = (((anLocalInt_1037_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_1042_
				    = (((anLocalInt_1037_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_1043_
				    = (((anLocalInt_1037_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInt_1037_
				    = (anLocalInt_1041_ | anLocalInt_1042_
				       | anLocalInt_1043_) >>> 8;
				int anLocalInt_1044_
				    = anLocalInts_1018_[anLocalInt_1017_];
				anLocalInts_1018_[anLocalInt_1017_]
				    = (((((anLocalInt_1037_ & 0xff00ff)
					  * anLocalInt_1038_)
					 + ((anLocalInt_1044_ & 0xff00ff)
					    * anLocalInt_1039_))
					& ~0xff00ff)
				       + ((((anLocalInt_1037_ & 0xff00)
					    * anLocalInt_1038_)
					   + ((anLocalInt_1044_ & 0xff00)
					      * anLocalInt_1039_))
					  & 0xff0000)) >> 8;
			    } else {
				int anLocalInt_1045_
				    = (((anLocalInt_1037_ & 0xff0000)
					* Class368_Sub2.anInt5702)
				       & ~0xffffff);
				int anLocalInt_1046_
				    = (((anLocalInt_1037_ & 0xff00)
					* Class368_Sub2.anInt5714)
				       & 0xff0000);
				int anLocalInt_1047_
				    = (((anLocalInt_1037_ & 0xff)
					* Class368_Sub2.anInt5701)
				       & 0xff00);
				anLocalInts_1018_[anLocalInt_1017_]
				    = (anLocalInt_1045_ | anLocalInt_1046_
				       | anLocalInt_1047_) >>> 8;
			    }
			} else if (anLocalInt_1019_ == 3) {
			    int anLocalInt_1048_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1049_ = Class368_Sub2.anInt5693;
			    int anLocalInt_1050_
				= anLocalInt_1048_ + anLocalInt_1049_;
			    int anLocalInt_1051_
				= ((anLocalInt_1048_ & 0xff00ff)
				   + (anLocalInt_1049_ & 0xff00ff));
			    int anLocalInt_1052_
				= ((anLocalInt_1051_ & 0x1000100)
				   + (anLocalInt_1050_ - anLocalInt_1051_
				      & 0x10000));
			    anLocalInt_1052_
				= (anLocalInt_1050_ - anLocalInt_1052_
				   | anLocalInt_1052_ - (anLocalInt_1052_
							 >>> 8));
			    int anLocalInt_1053_ = (((anLocalInt_1048_ >>> 24)
						     * Class368_Sub2.anInt5695)
						    >> 8);
			    int anLocalInt_1054_ = 256 - anLocalInt_1053_;
			    if (anLocalInt_1053_ != 255) {
				anLocalInt_1048_ = anLocalInt_1052_;
				anLocalInt_1052_
				    = anLocalInts_1018_[anLocalInt_1017_];
				anLocalInt_1052_
				    = (((((anLocalInt_1048_ & 0xff00ff)
					  * anLocalInt_1053_)
					 + ((anLocalInt_1052_ & 0xff00ff)
					    * anLocalInt_1054_))
					& ~0xff00ff)
				       + ((((anLocalInt_1048_ & 0xff00)
					    * anLocalInt_1053_)
					   + ((anLocalInt_1052_ & 0xff00)
					      * anLocalInt_1054_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts_1018_[anLocalInt_1017_]
				= anLocalInt_1052_;
			} else if (anLocalInt_1019_ == 2) {
			    int anLocalInt_1055_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1056_ = anLocalInt_1055_ >>> 24;
			    int anLocalInt_1057_ = 256 - anLocalInt_1056_;
			    int anLocalInt_1058_
				= (((anLocalInt_1055_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_1059_
				= (((anLocalInt_1055_ & 0xff00)
				    * Class368_Sub2.anInt5695)
				   & 0xff0000);
			    anLocalInt_1055_
				= ((anLocalInt_1058_ | anLocalInt_1059_)
				   >>> 8) + Class368_Sub2.anInt5697;
			    int anLocalInt_1060_
				= anLocalInts_1018_[anLocalInt_1017_];
			    anLocalInts_1018_[anLocalInt_1017_]
				= (((((anLocalInt_1055_ & 0xff00ff)
				      * anLocalInt_1056_)
				     + ((anLocalInt_1060_ & 0xff00ff)
					* anLocalInt_1057_))
				    & ~0xff00ff)
				   + ((((anLocalInt_1055_ & 0xff00)
					* anLocalInt_1056_)
				       + ((anLocalInt_1060_ & 0xff00)
					  * anLocalInt_1057_))
				      & 0xff0000)) >> 8;
			} else
			    throw new IllegalArgumentException();
		    } else if (anLocalInt_1020_ == 2) {
			if (anLocalInt_1019_ == 1) {
			    int anLocalInt_1061_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1062_
				= anLocalInts_1018_[anLocalInt_1017_];
			    int anLocalInt_1063_
				= anLocalInt_1061_ + anLocalInt_1062_;
			    int anLocalInt_1064_
				= ((anLocalInt_1061_ & 0xff00ff)
				   + (anLocalInt_1062_ & 0xff00ff));
			    anLocalInt_1062_
				= ((anLocalInt_1064_ & 0x1000100)
				   + (anLocalInt_1063_ - anLocalInt_1064_
				      & 0x10000));
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1063_ - anLocalInt_1062_
				   | anLocalInt_1062_ - (anLocalInt_1062_
							 >>> 8));
			} else if (anLocalInt_1019_ == 0) {
			    int anLocalInt_1065_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1066_
				= (((anLocalInt_1065_ & 0xff0000)
				    * Class368_Sub2.anInt5702)
				   & ~0xffffff);
			    int anLocalInt_1067_
				= (((anLocalInt_1065_ & 0xff00)
				    * Class368_Sub2.anInt5714)
				   & 0xff0000);
			    int anLocalInt_1068_ = (((anLocalInt_1065_ & 0xff)
						     * Class368_Sub2.anInt5701)
						    & 0xff00);
			    anLocalInt_1065_
				= (anLocalInt_1066_ | anLocalInt_1067_
				   | anLocalInt_1068_) >>> 8;
			    int anLocalInt_1069_
				= anLocalInts_1018_[anLocalInt_1017_];
			    int anLocalInt_1070_
				= anLocalInt_1065_ + anLocalInt_1069_;
			    int anLocalInt_1071_
				= ((anLocalInt_1065_ & 0xff00ff)
				   + (anLocalInt_1069_ & 0xff00ff));
			    anLocalInt_1069_
				= ((anLocalInt_1071_ & 0x1000100)
				   + (anLocalInt_1070_ - anLocalInt_1071_
				      & 0x10000));
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1070_ - anLocalInt_1069_
				   | anLocalInt_1069_ - (anLocalInt_1069_
							 >>> 8));
			} else if (anLocalInt_1019_ == 3) {
			    int anLocalInt_1072_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1073_ = Class368_Sub2.anInt5693;
			    int anLocalInt_1074_
				= anLocalInt_1072_ + anLocalInt_1073_;
			    int anLocalInt_1075_
				= ((anLocalInt_1072_ & 0xff00ff)
				   + (anLocalInt_1073_ & 0xff00ff));
			    int anLocalInt_1076_
				= ((anLocalInt_1075_ & 0x1000100)
				   + (anLocalInt_1074_ - anLocalInt_1075_
				      & 0x10000));
			    anLocalInt_1072_
				= (anLocalInt_1074_ - anLocalInt_1076_
				   | anLocalInt_1076_ - (anLocalInt_1076_
							 >>> 8));
			    anLocalInt_1076_
				= anLocalInts_1018_[anLocalInt_1017_];
			    anLocalInt_1074_
				= anLocalInt_1072_ + anLocalInt_1076_;
			    anLocalInt_1075_
				= ((anLocalInt_1072_ & 0xff00ff)
				   + (anLocalInt_1076_ & 0xff00ff));
			    anLocalInt_1076_
				= ((anLocalInt_1075_ & 0x1000100)
				   + (anLocalInt_1074_ - anLocalInt_1075_
				      & 0x10000));
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1074_ - anLocalInt_1076_
				   | anLocalInt_1076_ - (anLocalInt_1076_
							 >>> 8));
			} else if (anLocalInt_1019_ == 2) {
			    int anLocalInt_1077_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [anLocalInt_1016_]);
			    int anLocalInt_1078_
				= (((anLocalInt_1077_ & 0xff00ff)
				    * Class368_Sub2.anInt5695)
				   & ~0xff00ff);
			    int anLocalInt_1079_
				= (((anLocalInt_1077_ & 0xff00)
				    * Class368_Sub2.anInt5695)
				   & 0xff0000);
			    anLocalInt_1077_
				= ((anLocalInt_1078_ | anLocalInt_1079_)
				   >>> 8) + Class368_Sub2.anInt5697;
			    int anLocalInt_1080_
				= anLocalInts_1018_[anLocalInt_1017_];
			    int anLocalInt_1081_
				= anLocalInt_1077_ + anLocalInt_1080_;
			    int anLocalInt_1082_
				= ((anLocalInt_1077_ & 0xff00ff)
				   + (anLocalInt_1080_ & 0xff00ff));
			    anLocalInt_1080_
				= ((anLocalInt_1082_ & 0x1000100)
				   + (anLocalInt_1081_ - anLocalInt_1082_
				      & 0x10000));
			    anLocalInts_1018_[anLocalInt_1017_]
				= (anLocalInt_1081_ - anLocalInt_1080_
				   | anLocalInt_1080_ - (anLocalInt_1080_
							 >>> 8));
			}
		    } else
			throw new IllegalArgumentException();
		    anLocalInt_1011_ += Class368_Sub2.anInt5717;
		    anLocalInt_1012_ += Class368_Sub2.anInt5712;
		}
		Class368_Sub2.anInt5710 += Class368_Sub2.anInt5709;
		Class368_Sub2.anInt5704 += Class368_Sub2.anInt5723;
		Class368_Sub2.anInt5724 += Class368_Sub2.anInt5696;
	    }
	}
    }
    
    final void method4012(int argument_1083_, int argument_1084_,
			  int argument_1085_, int argument_1086_,
			  int argument_1087_, int argument_1088_,
			  int argument_1089_, int argument_1090_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	if (argument_1085_ > 0 && argument_1086_ > 0) {
	    int anLocalInt = 0;
	    int anLocalInt_1091_ = 0;
	    int anLocalInt_1092_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .width);
	    int anLocalInt_1093_ = (((Class368_Sub2) this).anInt5698
				    + ((Class368_Sub2) this).width
				    + ((Class368_Sub2) this).anInt5715);
	    int anLocalInt_1094_ = (((Class368_Sub2) this).anInt5719
				    + ((Class368_Sub2) this).height
				    + ((Class368_Sub2) this).anInt5708);
	    int anLocalInt_1095_ = (anLocalInt_1093_ << 16) / argument_1085_;
	    int anLocalInt_1096_ = (anLocalInt_1094_ << 16) / argument_1086_;
	    if (((Class368_Sub2) this).anInt5698 > 0) {
		int anLocalInt_1097_
		    = (((((Class368_Sub2) this).anInt5698 << 16)
			+ anLocalInt_1095_ - 1)
		       / anLocalInt_1095_);
		argument_1083_ += anLocalInt_1097_;
		anLocalInt += (anLocalInt_1097_ * anLocalInt_1095_
			       - (((Class368_Sub2) this).anInt5698 << 16));
	    }
	    if (((Class368_Sub2) this).anInt5719 > 0) {
		int anLocalInt_1098_
		    = (((((Class368_Sub2) this).anInt5719 << 16)
			+ anLocalInt_1096_ - 1)
		       / anLocalInt_1096_);
		argument_1084_ += anLocalInt_1098_;
		anLocalInt_1091_
		    += (anLocalInt_1098_ * anLocalInt_1096_
			- (((Class368_Sub2) this).anInt5719 << 16));
	    }
	    if (((Class368_Sub2) this).width < anLocalInt_1093_)
		argument_1085_
		    = ((((Class368_Sub2) this).width << 16) - anLocalInt
		       + anLocalInt_1095_ - 1) / anLocalInt_1095_;
	    if (((Class368_Sub2) this).height < anLocalInt_1094_)
		argument_1086_ = (((((Class368_Sub2) this).height << 16)
				   - anLocalInt_1091_ + anLocalInt_1096_ - 1)
				  / anLocalInt_1096_);
	    int anLocalInt_1099_
		= argument_1083_ + argument_1084_ * anLocalInt_1092_;
	    int anLocalInt_1100_ = anLocalInt_1092_ - argument_1085_;
	    if (argument_1084_ + argument_1086_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipBottom))
		argument_1086_
		    -= (argument_1084_ + argument_1086_
			- ((JavaToolkit) (((Class368_Sub2) this)
					    .toolkit)).clipBottom);
	    if (argument_1084_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop)) {
		int anLocalInt_1101_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipTop
		       - argument_1084_);
		argument_1086_ -= anLocalInt_1101_;
		anLocalInt_1099_ += anLocalInt_1101_ * anLocalInt_1092_;
		anLocalInt_1091_ += anLocalInt_1096_ * anLocalInt_1101_;
	    }
	    if (argument_1083_ + argument_1085_
		> (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipRight)) {
		int anLocalInt_1102_
		    = (argument_1083_ + argument_1085_
		       - ((JavaToolkit) (((Class368_Sub2) this)
					   .toolkit)).clipRight);
		argument_1085_ -= anLocalInt_1102_;
		anLocalInt_1100_ += anLocalInt_1102_;
	    }
	    if (argument_1083_
		< (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft)) {
		int anLocalInt_1103_
		    = (((JavaToolkit)
			((Class368_Sub2) this).toolkit).clipLeft
		       - argument_1083_);
		argument_1085_ -= anLocalInt_1103_;
		anLocalInt_1099_ += anLocalInt_1103_;
		anLocalInt += anLocalInt_1095_ * anLocalInt_1103_;
		anLocalInt_1100_ += anLocalInt_1103_;
	    }
	    int[] anLocalInts
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    if (argument_1089_ == 0) {
		if (argument_1087_ == 1) {
		    int anLocalInt_1104_ = anLocalInt;
		    for (int anLocalInt_1105_ = -argument_1086_;
			 anLocalInt_1105_ < 0; anLocalInt_1105_++) {
			int anLocalInt_1106_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1107_ = -argument_1085_;
			     anLocalInt_1107_ < 0; anLocalInt_1107_++) {
			    anLocalInts[anLocalInt_1099_++]
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1106_]);
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1104_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 0) {
		    int anLocalInt_1108_ = (argument_1088_ & 0xff0000) >> 16;
		    int anLocalInt_1109_ = (argument_1088_ & 0xff00) >> 8;
		    int anLocalInt_1110_ = argument_1088_ & 0xff;
		    int anLocalInt_1111_ = anLocalInt;
		    for (int anLocalInt_1112_ = -argument_1086_;
			 anLocalInt_1112_ < 0; anLocalInt_1112_++) {
			int anLocalInt_1113_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1114_ = -argument_1085_;
			     anLocalInt_1114_ < 0; anLocalInt_1114_++) {
			    int anLocalInt_1115_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1113_]);
			    int anLocalInt_1116_
				= (((anLocalInt_1115_ & 0xff0000)
				    * anLocalInt_1108_)
				   & ~0xffffff);
			    int anLocalInt_1117_
				= (((anLocalInt_1115_ & 0xff00)
				    * anLocalInt_1109_)
				   & 0xff0000);
			    int anLocalInt_1118_
				= ((anLocalInt_1115_ & 0xff) * anLocalInt_1110_
				   & 0xff00);
			    anLocalInts[anLocalInt_1099_++]
				= (anLocalInt_1116_ | anLocalInt_1117_
				   | anLocalInt_1118_) >>> 8;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1111_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 3) {
		    int anLocalInt_1119_ = anLocalInt;
		    for (int anLocalInt_1120_ = -argument_1086_;
			 anLocalInt_1120_ < 0; anLocalInt_1120_++) {
			int anLocalInt_1121_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1122_ = -argument_1085_;
			     anLocalInt_1122_ < 0; anLocalInt_1122_++) {
			    int anLocalInt_1123_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1121_]);
			    int anLocalInt_1124_
				= anLocalInt_1123_ + argument_1088_;
			    int anLocalInt_1125_
				= ((anLocalInt_1123_ & 0xff00ff)
				   + (argument_1088_ & 0xff00ff));
			    int anLocalInt_1126_
				= ((anLocalInt_1125_ & 0x1000100)
				   + (anLocalInt_1124_ - anLocalInt_1125_
				      & 0x10000));
			    anLocalInts[anLocalInt_1099_++]
				= (anLocalInt_1124_ - anLocalInt_1126_
				   | anLocalInt_1126_ - (anLocalInt_1126_
							 >>> 8));
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1119_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 2) {
		    int anLocalInt_1127_ = argument_1088_ >>> 24;
		    int anLocalInt_1128_ = 256 - anLocalInt_1127_;
		    int anLocalInt_1129_
			= ((argument_1088_ & 0xff00ff) * anLocalInt_1128_
			   & ~0xff00ff);
		    int anLocalInt_1130_
			= ((argument_1088_ & 0xff00) * anLocalInt_1128_
			   & 0xff0000);
		    argument_1088_
			= (anLocalInt_1129_ | anLocalInt_1130_) >>> 8;
		    int anLocalInt_1131_ = anLocalInt;
		    for (int anLocalInt_1132_ = -argument_1086_;
			 anLocalInt_1132_ < 0; anLocalInt_1132_++) {
			int anLocalInt_1133_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1134_ = -argument_1085_;
			     anLocalInt_1134_ < 0; anLocalInt_1134_++) {
			    int anLocalInt_1135_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1133_]);
			    anLocalInt_1129_
				= ((anLocalInt_1135_ & 0xff00ff)
				   * anLocalInt_1127_) & ~0xff00ff;
			    anLocalInt_1130_ = ((anLocalInt_1135_ & 0xff00)
						* anLocalInt_1127_) & 0xff0000;
			    anLocalInts[anLocalInt_1099_++]
				= ((anLocalInt_1129_ | anLocalInt_1130_)
				   >>> 8) + argument_1088_;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1131_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_1089_ == 1) {
		if (argument_1087_ == 1) {
		    int anLocalInt_1136_ = anLocalInt;
		    for (int anLocalInt_1137_ = -argument_1086_;
			 anLocalInt_1137_ < 0; anLocalInt_1137_++) {
			int anLocalInt_1138_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1139_ = -argument_1085_;
			     anLocalInt_1139_ < 0; anLocalInt_1139_++) {
			    int anLocalInt_1140_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1138_]);
			    int anLocalInt_1141_ = anLocalInt_1140_ >>> 24;
			    int anLocalInt_1142_ = 256 - anLocalInt_1141_;
			    int anLocalInt_1143_
				= anLocalInts[anLocalInt_1099_];
			    anLocalInts[anLocalInt_1099_++]
				= ((((((anLocalInt_1140_ & 0xff00ff)
				       * anLocalInt_1141_)
				      + ((anLocalInt_1143_ & 0xff00ff)
					 * anLocalInt_1142_))
				     & ~0xff00ff)
				    >> 8)
				   + (((((anLocalInt_1140_ & ~0xff00ff) >>> 8)
					* anLocalInt_1141_)
				       + ((anLocalInt_1143_ & ~0xff00ff)
					  >>> 8) * anLocalInt_1142_)
				      & ~0xff00ff));
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1136_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 0) {
		    int anLocalInt_1144_ = anLocalInt;
		    if ((argument_1088_ & 0xffffff) == 16777215) {
			for (int anLocalInt_1145_ = -argument_1086_;
			     anLocalInt_1145_ < 0; anLocalInt_1145_++) {
			    int anLocalInt_1146_
				= ((anLocalInt_1091_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_1147_ = -argument_1085_;
				 anLocalInt_1147_ < 0; anLocalInt_1147_++) {
				int anLocalInt_1148_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [((anLocalInt >> 16)
					 + anLocalInt_1146_)]);
				int anLocalInt_1149_
				    = (((anLocalInt_1148_ >>> 24)
					* (argument_1088_ >>> 24))
				       >> 8);
				int anLocalInt_1150_ = 256 - anLocalInt_1149_;
				int anLocalInt_1151_
				    = anLocalInts[anLocalInt_1099_];
				anLocalInts[anLocalInt_1099_++]
				    = (((((anLocalInt_1148_ & 0xff00ff)
					  * anLocalInt_1149_)
					 + ((anLocalInt_1151_ & 0xff00ff)
					    * anLocalInt_1150_))
					& ~0xff00ff)
				       + ((((anLocalInt_1148_ & 0xff00)
					    * anLocalInt_1149_)
					   + ((anLocalInt_1151_ & 0xff00)
					      * anLocalInt_1150_))
					  & 0xff0000)) >> 8;
				anLocalInt += anLocalInt_1095_;
			    }
			    anLocalInt_1091_ += anLocalInt_1096_;
			    anLocalInt = anLocalInt_1144_;
			    anLocalInt_1099_ += anLocalInt_1100_;
			}
		    } else {
			int anLocalInt_1152_
			    = (argument_1088_ & 0xff0000) >> 16;
			int anLocalInt_1153_ = (argument_1088_ & 0xff00) >> 8;
			int anLocalInt_1154_ = argument_1088_ & 0xff;
			for (int anLocalInt_1155_ = -argument_1086_;
			     anLocalInt_1155_ < 0; anLocalInt_1155_++) {
			    int anLocalInt_1156_
				= ((anLocalInt_1091_ >> 16)
				   * ((Class368_Sub2) this).width);
			    for (int anLocalInt_1157_ = -argument_1085_;
				 anLocalInt_1157_ < 0; anLocalInt_1157_++) {
				int anLocalInt_1158_
				    = (((Class368_Sub2_Sub2) this)
				       .anIntArray6635
				       [((anLocalInt >> 16)
					 + anLocalInt_1156_)]);
				int anLocalInt_1159_
				    = (((anLocalInt_1158_ >>> 24)
					* (argument_1088_ >>> 24))
				       >> 8);
				int anLocalInt_1160_ = 256 - anLocalInt_1159_;
				if (anLocalInt_1159_ != 255) {
				    int anLocalInt_1161_
					= (((anLocalInt_1158_ & 0xff0000)
					    * anLocalInt_1152_)
					   & ~0xffffff);
				    int anLocalInt_1162_
					= (((anLocalInt_1158_ & 0xff00)
					    * anLocalInt_1153_)
					   & 0xff0000);
				    int anLocalInt_1163_
					= (((anLocalInt_1158_ & 0xff)
					    * anLocalInt_1154_)
					   & 0xff00);
				    anLocalInt_1158_
					= (anLocalInt_1161_ | anLocalInt_1162_
					   | anLocalInt_1163_) >>> 8;
				    int anLocalInt_1164_
					= anLocalInts[anLocalInt_1099_];
				    anLocalInts[anLocalInt_1099_++]
					= (((((anLocalInt_1158_ & 0xff00ff)
					      * anLocalInt_1159_)
					     + ((anLocalInt_1164_ & 0xff00ff)
						* anLocalInt_1160_))
					    & ~0xff00ff)
					   + ((((anLocalInt_1158_ & 0xff00)
						* anLocalInt_1159_)
					       + ((anLocalInt_1164_ & 0xff00)
						  * anLocalInt_1160_))
					      & 0xff0000)) >> 8;
				} else {
				    int anLocalInt_1165_
					= (((anLocalInt_1158_ & 0xff0000)
					    * anLocalInt_1152_)
					   & ~0xffffff);
				    int anLocalInt_1166_
					= (((anLocalInt_1158_ & 0xff00)
					    * anLocalInt_1153_)
					   & 0xff0000);
				    int anLocalInt_1167_
					= (((anLocalInt_1158_ & 0xff)
					    * anLocalInt_1154_)
					   & 0xff00);
				    anLocalInts[anLocalInt_1099_++]
					= (anLocalInt_1165_ | anLocalInt_1166_
					   | anLocalInt_1167_) >>> 8;
				}
				anLocalInt += anLocalInt_1095_;
			    }
			    anLocalInt_1091_ += anLocalInt_1096_;
			    anLocalInt = anLocalInt_1144_;
			    anLocalInt_1099_ += anLocalInt_1100_;
			}
			return;
		    }
		    return;
		}
		if (argument_1087_ == 3) {
		    int anLocalInt_1168_ = anLocalInt;
		    for (int anLocalInt_1169_ = -argument_1086_;
			 anLocalInt_1169_ < 0; anLocalInt_1169_++) {
			int anLocalInt_1170_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1171_ = -argument_1085_;
			     anLocalInt_1171_ < 0; anLocalInt_1171_++) {
			    int anLocalInt_1172_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1170_]);
			    int anLocalInt_1173_
				= anLocalInt_1172_ + argument_1088_;
			    int anLocalInt_1174_
				= ((anLocalInt_1172_ & 0xff00ff)
				   + (argument_1088_ & 0xff00ff));
			    int anLocalInt_1175_
				= ((anLocalInt_1174_ & 0x1000100)
				   + (anLocalInt_1173_ - anLocalInt_1174_
				      & 0x10000));
			    anLocalInt_1175_
				= (anLocalInt_1173_ - anLocalInt_1175_
				   | anLocalInt_1175_ - (anLocalInt_1175_
							 >>> 8));
			    int anLocalInt_1176_
				= ((anLocalInt_1175_ >>> 24) * (argument_1088_
								>>> 24)
				   >> 8);
			    int anLocalInt_1177_ = 256 - anLocalInt_1176_;
			    if (anLocalInt_1176_ != 255) {
				anLocalInt_1172_ = anLocalInt_1175_;
				anLocalInt_1175_
				    = anLocalInts[anLocalInt_1099_];
				anLocalInt_1175_
				    = (((((anLocalInt_1172_ & 0xff00ff)
					  * anLocalInt_1176_)
					 + ((anLocalInt_1175_ & 0xff00ff)
					    * anLocalInt_1177_))
					& ~0xff00ff)
				       + ((((anLocalInt_1172_ & 0xff00)
					    * anLocalInt_1176_)
					   + ((anLocalInt_1175_ & 0xff00)
					      * anLocalInt_1177_))
					  & 0xff0000)) >> 8;
			    }
			    anLocalInts[anLocalInt_1099_++] = anLocalInt_1175_;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1168_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 2) {
		    int anLocalInt_1178_ = argument_1088_ >>> 24;
		    int anLocalInt_1179_ = 256 - anLocalInt_1178_;
		    int anLocalInt_1180_
			= ((argument_1088_ & 0xff00ff) * anLocalInt_1179_
			   & ~0xff00ff);
		    int anLocalInt_1181_
			= ((argument_1088_ & 0xff00) * anLocalInt_1179_
			   & 0xff0000);
		    argument_1088_
			= (anLocalInt_1180_ | anLocalInt_1181_) >>> 8;
		    int anLocalInt_1182_ = anLocalInt;
		    for (int anLocalInt_1183_ = -argument_1086_;
			 anLocalInt_1183_ < 0; anLocalInt_1183_++) {
			int anLocalInt_1184_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1185_ = -argument_1085_;
			     anLocalInt_1185_ < 0; anLocalInt_1185_++) {
			    int anLocalInt_1186_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1184_]);
			    int anLocalInt_1187_ = anLocalInt_1186_ >>> 24;
			    int anLocalInt_1188_ = 256 - anLocalInt_1187_;
			    anLocalInt_1180_
				= ((anLocalInt_1186_ & 0xff00ff)
				   * anLocalInt_1178_) & ~0xff00ff;
			    anLocalInt_1181_ = ((anLocalInt_1186_ & 0xff00)
						* anLocalInt_1178_) & 0xff0000;
			    anLocalInt_1186_
				= ((anLocalInt_1180_ | anLocalInt_1181_)
				   >>> 8) + argument_1088_;
			    int anLocalInt_1189_
				= anLocalInts[anLocalInt_1099_];
			    anLocalInts[anLocalInt_1099_++]
				= (((((anLocalInt_1186_ & 0xff00ff)
				      * anLocalInt_1187_)
				     + ((anLocalInt_1189_ & 0xff00ff)
					* anLocalInt_1188_))
				    & ~0xff00ff)
				   + ((((anLocalInt_1186_ & 0xff00)
					* anLocalInt_1187_)
				       + ((anLocalInt_1189_ & 0xff00)
					  * anLocalInt_1188_))
				      & 0xff0000)) >> 8;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1182_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    if (argument_1089_ == 2) {
		if (argument_1087_ == 1) {
		    int anLocalInt_1190_ = anLocalInt;
		    for (int anLocalInt_1191_ = -argument_1086_;
			 anLocalInt_1191_ < 0; anLocalInt_1191_++) {
			int anLocalInt_1192_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1193_ = -argument_1085_;
			     anLocalInt_1193_ < 0; anLocalInt_1193_++) {
			    int anLocalInt_1194_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1192_]);
			    if (anLocalInt_1194_ != 0) {
				int anLocalInt_1195_
				    = anLocalInts[anLocalInt_1099_];
				int anLocalInt_1196_
				    = anLocalInt_1194_ + anLocalInt_1195_;
				int anLocalInt_1197_
				    = ((anLocalInt_1194_ & 0xff00ff)
				       + (anLocalInt_1195_ & 0xff00ff));
				anLocalInt_1195_
				    = ((anLocalInt_1197_ & 0x1000100)
				       + (anLocalInt_1196_ - anLocalInt_1197_
					  & 0x10000));
				anLocalInts[anLocalInt_1099_++]
				    = (anLocalInt_1196_ - anLocalInt_1195_
				       | anLocalInt_1195_ - (anLocalInt_1195_
							     >>> 8));
			    } else
				anLocalInt_1099_++;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1190_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 0) {
		    int anLocalInt_1198_ = anLocalInt;
		    int anLocalInt_1199_ = (argument_1088_ & 0xff0000) >> 16;
		    int anLocalInt_1200_ = (argument_1088_ & 0xff00) >> 8;
		    int anLocalInt_1201_ = argument_1088_ & 0xff;
		    for (int anLocalInt_1202_ = -argument_1086_;
			 anLocalInt_1202_ < 0; anLocalInt_1202_++) {
			int anLocalInt_1203_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1204_ = -argument_1085_;
			     anLocalInt_1204_ < 0; anLocalInt_1204_++) {
			    int anLocalInt_1205_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1203_]);
			    if (anLocalInt_1205_ != 0) {
				int anLocalInt_1206_
				    = (((anLocalInt_1205_ & 0xff0000)
					* anLocalInt_1199_)
				       & ~0xffffff);
				int anLocalInt_1207_
				    = (((anLocalInt_1205_ & 0xff00)
					* anLocalInt_1200_)
				       & 0xff0000);
				int anLocalInt_1208_
				    = (((anLocalInt_1205_ & 0xff)
					* anLocalInt_1201_)
				       & 0xff00);
				anLocalInt_1205_
				    = (anLocalInt_1206_ | anLocalInt_1207_
				       | anLocalInt_1208_) >>> 8;
				int anLocalInt_1209_
				    = anLocalInts[anLocalInt_1099_];
				int anLocalInt_1210_
				    = anLocalInt_1205_ + anLocalInt_1209_;
				int anLocalInt_1211_
				    = ((anLocalInt_1205_ & 0xff00ff)
				       + (anLocalInt_1209_ & 0xff00ff));
				anLocalInt_1209_
				    = ((anLocalInt_1211_ & 0x1000100)
				       + (anLocalInt_1210_ - anLocalInt_1211_
					  & 0x10000));
				anLocalInts[anLocalInt_1099_++]
				    = (anLocalInt_1210_ - anLocalInt_1209_
				       | anLocalInt_1209_ - (anLocalInt_1209_
							     >>> 8));
			    } else
				anLocalInt_1099_++;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1198_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 3) {
		    int anLocalInt_1212_ = anLocalInt;
		    for (int anLocalInt_1213_ = -argument_1086_;
			 anLocalInt_1213_ < 0; anLocalInt_1213_++) {
			int anLocalInt_1214_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1215_ = -argument_1085_;
			     anLocalInt_1215_ < 0; anLocalInt_1215_++) {
			    int anLocalInt_1216_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1214_]);
			    int anLocalInt_1217_
				= anLocalInt_1216_ + argument_1088_;
			    int anLocalInt_1218_
				= ((anLocalInt_1216_ & 0xff00ff)
				   + (argument_1088_ & 0xff00ff));
			    int anLocalInt_1219_
				= ((anLocalInt_1218_ & 0x1000100)
				   + (anLocalInt_1217_ - anLocalInt_1218_
				      & 0x10000));
			    anLocalInt_1216_
				= (anLocalInt_1217_ - anLocalInt_1219_
				   | anLocalInt_1219_ - (anLocalInt_1219_
							 >>> 8));
			    anLocalInt_1219_ = anLocalInts[anLocalInt_1099_];
			    anLocalInt_1217_
				= anLocalInt_1216_ + anLocalInt_1219_;
			    anLocalInt_1218_
				= ((anLocalInt_1216_ & 0xff00ff)
				   + (anLocalInt_1219_ & 0xff00ff));
			    anLocalInt_1219_
				= ((anLocalInt_1218_ & 0x1000100)
				   + (anLocalInt_1217_ - anLocalInt_1218_
				      & 0x10000));
			    anLocalInts[anLocalInt_1099_++]
				= (anLocalInt_1217_ - anLocalInt_1219_
				   | anLocalInt_1219_ - (anLocalInt_1219_
							 >>> 8));
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1212_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		if (argument_1087_ == 2) {
		    int anLocalInt_1220_ = argument_1088_ >>> 24;
		    int anLocalInt_1221_ = 256 - anLocalInt_1220_;
		    int anLocalInt_1222_
			= ((argument_1088_ & 0xff00ff) * anLocalInt_1221_
			   & ~0xff00ff);
		    int anLocalInt_1223_
			= ((argument_1088_ & 0xff00) * anLocalInt_1221_
			   & 0xff0000);
		    argument_1088_
			= (anLocalInt_1222_ | anLocalInt_1223_) >>> 8;
		    int anLocalInt_1224_ = anLocalInt;
		    for (int anLocalInt_1225_ = -argument_1086_;
			 anLocalInt_1225_ < 0; anLocalInt_1225_++) {
			int anLocalInt_1226_
			    = ((anLocalInt_1091_ >> 16)
			       * ((Class368_Sub2) this).width);
			for (int anLocalInt_1227_ = -argument_1085_;
			     anLocalInt_1227_ < 0; anLocalInt_1227_++) {
			    int anLocalInt_1228_
				= (((Class368_Sub2_Sub2) this).anIntArray6635
				   [(anLocalInt >> 16) + anLocalInt_1226_]);
			    if (anLocalInt_1228_ != 0) {
				anLocalInt_1222_
				    = ((anLocalInt_1228_ & 0xff00ff)
				       * anLocalInt_1220_) & ~0xff00ff;
				anLocalInt_1223_
				    = ((anLocalInt_1228_ & 0xff00)
				       * anLocalInt_1220_) & 0xff0000;
				anLocalInt_1228_
				    = ((anLocalInt_1222_ | anLocalInt_1223_)
				       >>> 8) + argument_1088_;
				int anLocalInt_1229_
				    = anLocalInts[anLocalInt_1099_];
				int anLocalInt_1230_
				    = anLocalInt_1228_ + anLocalInt_1229_;
				int anLocalInt_1231_
				    = ((anLocalInt_1228_ & 0xff00ff)
				       + (anLocalInt_1229_ & 0xff00ff));
				anLocalInt_1229_
				    = ((anLocalInt_1231_ & 0x1000100)
				       + (anLocalInt_1230_ - anLocalInt_1231_
					  & 0x10000));
				anLocalInts[anLocalInt_1099_++]
				    = (anLocalInt_1230_ - anLocalInt_1229_
				       | anLocalInt_1229_ - (anLocalInt_1229_
							     >>> 8));
			    } else
				anLocalInt_1099_++;
			    anLocalInt += anLocalInt_1095_;
			}
			anLocalInt_1091_ += anLocalInt_1096_;
			anLocalInt = anLocalInt_1224_;
			anLocalInt_1099_ += anLocalInt_1100_;
		    }
		    return;
		}
		throw new IllegalArgumentException();
	    }
	    throw new IllegalArgumentException();
	}
    }
    
    final void method4007(int argument_1232_, int argument_1233_,
			  Class_aa argument_1234_, int argument_1235_,
			  int argument_1236_) {
	if (((Class368_Sub2) this).toolkit.method2100())
	    throw new IllegalStateException();
	argument_1232_ += ((Class368_Sub2) this).anInt5698;
	argument_1233_ += ((Class368_Sub2) this).anInt5719;
	int anLocalInt = 0;
	int anLocalInt_1237_
	    = (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .width);
	int anLocalInt_1238_ = ((Class368_Sub2) this).width;
	int anLocalInt_1239_ = ((Class368_Sub2) this).height;
	int anLocalInt_1240_ = anLocalInt_1237_ - anLocalInt_1238_;
	int anLocalInt_1241_ = 0;
	int anLocalInt_1242_
	    = argument_1232_ + argument_1233_ * anLocalInt_1237_;
	if (argument_1233_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipTop)) {
	    int anLocalInt_1243_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop) - argument_1233_;
	    anLocalInt_1239_ -= anLocalInt_1243_;
	    argument_1233_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipTop);
	    anLocalInt += anLocalInt_1243_ * anLocalInt_1238_;
	    anLocalInt_1242_ += anLocalInt_1243_ * anLocalInt_1237_;
	}
	if (argument_1233_ + anLocalInt_1239_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipBottom))
	    anLocalInt_1239_
		-= (argument_1233_ + anLocalInt_1239_
		    - ((JavaToolkit)
		       ((Class368_Sub2) this).toolkit).clipBottom);
	if (argument_1232_
	    < (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipLeft)) {
	    int anLocalInt_1244_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft) - argument_1232_;
	    anLocalInt_1238_ -= anLocalInt_1244_;
	    argument_1232_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .clipLeft);
	    anLocalInt += anLocalInt_1244_;
	    anLocalInt_1242_ += anLocalInt_1244_;
	    anLocalInt_1241_ += anLocalInt_1244_;
	    anLocalInt_1240_ += anLocalInt_1244_;
	}
	if (argument_1232_ + anLocalInt_1238_
	    > (((JavaToolkit) ((Class368_Sub2) this).toolkit)
	       .clipRight)) {
	    int anLocalInt_1245_
		= (argument_1232_ + anLocalInt_1238_
		   - ((JavaToolkit)
		      ((Class368_Sub2) this).toolkit).clipRight);
	    anLocalInt_1238_ -= anLocalInt_1245_;
	    anLocalInt_1241_ += anLocalInt_1245_;
	    anLocalInt_1240_ += anLocalInt_1245_;
	}
	if (anLocalInt_1238_ > 0 && anLocalInt_1239_ > 0) {
	    Class_aa_Sub3 class_aa_sub3 = (Class_aa_Sub3) argument_1234_;
	    int[] anLocalInts = ((Class_aa_Sub3) class_aa_sub3).anIntArray3757;
	    int[] anLocalInts_1246_
		= ((Class_aa_Sub3) class_aa_sub3).anIntArray3755;
	    int[] anLocalInts_1247_
		= (((JavaToolkit) ((Class368_Sub2) this).toolkit)
		   .pixels);
	    int anLocalInt_1248_ = argument_1233_;
	    if (argument_1236_ > anLocalInt_1248_) {
		anLocalInt_1248_ = argument_1236_;
		anLocalInt_1242_
		    += (argument_1236_ - argument_1233_) * anLocalInt_1237_;
		anLocalInt += ((argument_1236_ - argument_1233_)
			       * ((Class368_Sub2) this).width);
	    }
	    int anLocalInt_1249_ = ((argument_1236_ + anLocalInts.length
				     < argument_1233_ + anLocalInt_1239_)
				    ? argument_1236_ + anLocalInts.length
				    : argument_1233_ + anLocalInt_1239_);
	    for (int anLocalInt_1250_ = anLocalInt_1248_;
		 anLocalInt_1250_ < anLocalInt_1249_; anLocalInt_1250_++) {
		int anLocalInt_1251_
		    = (anLocalInts[anLocalInt_1250_ - argument_1236_]
		       + argument_1235_);
		int anLocalInt_1252_
		    = anLocalInts_1246_[anLocalInt_1250_ - argument_1236_];
		int anLocalInt_1253_ = anLocalInt_1238_;
		if (argument_1232_ > anLocalInt_1251_) {
		    int anLocalInt_1254_ = argument_1232_ - anLocalInt_1251_;
		    if (anLocalInt_1254_ >= anLocalInt_1252_) {
			anLocalInt += anLocalInt_1238_ + anLocalInt_1241_;
			anLocalInt_1242_
			    += anLocalInt_1238_ + anLocalInt_1240_;
			continue;
		    }
		    anLocalInt_1252_ -= anLocalInt_1254_;
		} else {
		    int anLocalInt_1255_ = anLocalInt_1251_ - argument_1232_;
		    if (anLocalInt_1255_ >= anLocalInt_1238_) {
			anLocalInt += anLocalInt_1238_ + anLocalInt_1241_;
			anLocalInt_1242_
			    += anLocalInt_1238_ + anLocalInt_1240_;
			continue;
		    }
		    anLocalInt += anLocalInt_1255_;
		    anLocalInt_1253_ -= anLocalInt_1255_;
		    anLocalInt_1242_ += anLocalInt_1255_;
		}
		int anLocalInt_1256_ = 0;
		if (anLocalInt_1253_ < anLocalInt_1252_)
		    anLocalInt_1252_ = anLocalInt_1253_;
		else
		    anLocalInt_1256_ = anLocalInt_1253_ - anLocalInt_1252_;
		for (int anLocalInt_1257_ = -anLocalInt_1252_;
		     anLocalInt_1257_ < 0; anLocalInt_1257_++) {
		    int anLocalInt_1258_ = (((Class368_Sub2_Sub2) this)
					    .anIntArray6635[anLocalInt++]);
		    int anLocalInt_1259_ = anLocalInt_1258_ >>> 24;
		    int anLocalInt_1260_ = 256 - anLocalInt_1259_;
		    int anLocalInt_1261_ = anLocalInts_1247_[anLocalInt_1242_];
		    anLocalInts_1247_[anLocalInt_1242_++]
			= ((((anLocalInt_1258_ & 0xff00ff) * anLocalInt_1259_
			     + ((anLocalInt_1261_ & 0xff00ff)
				* anLocalInt_1260_))
			    & ~0xff00ff)
			   + (((anLocalInt_1258_ & 0xff00) * anLocalInt_1259_
			       + ((anLocalInt_1261_ & 0xff00)
				  * anLocalInt_1260_))
			      & 0xff0000)) >> 8;
		}
		anLocalInt += anLocalInt_1256_ + anLocalInt_1241_;
		anLocalInt_1242_ += anLocalInt_1256_ + anLocalInt_1240_;
	    }
	}
    }
}
