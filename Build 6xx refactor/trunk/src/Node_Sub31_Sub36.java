/* Class59_Sub31_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub36 extends Node_Sub31
{
    static int anInt6014 = 0;
    private static char[] aCharArray6015 = new char[64];
    private int anInt6016 = 6;
    
    final int[] method867(byte argument_0_, int argument_1_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_1_,
							      -13476);
	if (argument_0_ <= 21)
	    anInt6014 = -34;
    while_177_:
	do {
	    if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
		int[] anLocalInts_2_
		    = this.method864(argument_1_, 0, (byte) 33);
		int[] anLocalInts_3_
		    = this.method864(argument_1_, 1, (byte) 33);
		int anLocalInt = anInt6016;
	    while_176_:
		do {
		while_175_:
		    do {
		    while_174_:
			do {
			while_173_:
			    do {
			    while_172_:
				do {
				while_171_:
				    do {
				    while_170_:
					do {
					while_169_:
					    do {
					    while_168_:
						do {
						    do {
							if (anLocalInt != 1) {
							    if (anLocalInt
								!= 2) {
								if (anLocalInt
								    != 3) {
								    if (anLocalInt
									!= 4) {
									if (anLocalInt
									    != 5) {
									    if (anLocalInt != 6) {
										if (anLocalInt != 7) {
										    if (anLocalInt != 8) {
											if (anLocalInt != 9) {
											    if (anLocalInt != 10) {
												if (anLocalInt != 11) {
												    if (anLocalInt != 12)
													break while_177_;
												} else
												    break while_175_;
												break while_176_;
											    }
											} else
											    break while_173_;
											break while_174_;
										    }
										} else
										    break while_171_;
										break while_172_;
									    }
									} else
									    break while_169_;
									break while_170_;
								    }
								} else
								    break;
								break while_168_;
							    }
							} else {
							    for (anLocalInt
								     = 0;
								 ((Statics
								   .anInt294)
								  > anLocalInt);
								 anLocalInt++)
								anLocalInts
								    [anLocalInt]
								    = ((anLocalInts_2_
									[anLocalInt])
								       + (anLocalInts_3_
									  [anLocalInt]));
							    break while_177_;
							}
							for (anLocalInt = 0;
							     (anLocalInt
							      < (Statics
								 .anInt294));
							     anLocalInt++)
							    anLocalInts
								[anLocalInt]
								= (-(anLocalInts_3_
								     [anLocalInt])
								   + (anLocalInts_2_
								      [anLocalInt]));
							break while_177_;
						    } while (false);
						    for (anLocalInt = 0;
							 (anLocalInt
							  < Statics.anInt294);
							 anLocalInt++)
							anLocalInts[anLocalInt]
							    = (((anLocalInts_3_
								 [anLocalInt])
								* (anLocalInts_2_
								   [anLocalInt]))
							       >> 12);
						    break while_177_;
						} while (false);
						for (anLocalInt = 0;
						     (anLocalInt
						      < Statics.anInt294);
						     anLocalInt++) {
						    int anLocalInt_4_
							= (anLocalInts_3_
							   [anLocalInt]);
						    anLocalInts[anLocalInt]
							= (anLocalInt_4_ != 0
							   ? (((anLocalInts_2_
								[anLocalInt])
							       << 12)
							      / anLocalInt_4_)
							   : 4096);
						}
						break while_177_;
					    } while (false);
					    for (anLocalInt = 0;
						 anLocalInt < Statics.anInt294;
						 anLocalInt++)
						anLocalInts[anLocalInt]
						    = -(((-(anLocalInts_3_
							    [anLocalInt])
							  + 4096)
							 * (-(anLocalInts_2_
							      [anLocalInt])
							    + 4096))
							>> 12) + 4096;
					    break while_177_;
					} while (false);
					for (anLocalInt = 0;
					     Statics.anInt294 > anLocalInt;
					     anLocalInt++) {
					    int anLocalInt_5_
						= anLocalInts_3_[anLocalInt];
					    anLocalInts[anLocalInt]
						= (anLocalInt_5_ < 2048
						   ? (anLocalInt_5_
						      * (anLocalInts_2_
							 [anLocalInt])) >> 11
						   : -(((-anLocalInt_5_ + 4096)
							* (-(anLocalInts_2_
							     [anLocalInt])
							   + 4096))
						       >> 11) + 4096);
					}
					break while_177_;
				    } while (false);
				    for (anLocalInt = 0;
					 Statics.anInt294 > anLocalInt;
					 anLocalInt++) {
					int anLocalInt_6_
					    = anLocalInts_2_[anLocalInt];
					anLocalInts[anLocalInt]
					    = (anLocalInt_6_ == 4096 ? 4096
					       : ((anLocalInts_3_[anLocalInt]
						   << 12)
						  / (-anLocalInt_6_ + 4096)));
				    }
				    break while_177_;
				} while (false);
				for (anLocalInt = 0;
				     anLocalInt < Statics.anInt294;
				     anLocalInt++) {
				    int anLocalInt_7_
					= anLocalInts_2_[anLocalInt];
				    anLocalInts[anLocalInt]
					= (anLocalInt_7_ == 0 ? 0
					   : -(((-anLocalInts_3_[anLocalInt]
						 + 4096)
						<< 12)
					       / anLocalInt_7_) + 4096);
				}
				break while_177_;
			    } while (false);
			    for (anLocalInt = 0; anLocalInt < Statics.anInt294;
				 anLocalInt++) {
				int anLocalInt_8_ = anLocalInts_2_[anLocalInt];
				int anLocalInt_9_ = anLocalInts_3_[anLocalInt];
				anLocalInts[anLocalInt]
				    = (anLocalInt_8_ < anLocalInt_9_
				       ? anLocalInt_8_ : anLocalInt_9_);
			    }
			    break while_177_;
			} while (false);
			for (anLocalInt = 0; Statics.anInt294 > anLocalInt;
			     anLocalInt++) {
			    int anLocalInt_10_ = anLocalInts_2_[anLocalInt];
			    int anLocalInt_11_ = anLocalInts_3_[anLocalInt];
			    anLocalInts[anLocalInt]
				= (anLocalInt_10_ <= anLocalInt_11_
				   ? anLocalInt_11_ : anLocalInt_10_);
			}
			break while_177_;
		    } while (false);
		    for (anLocalInt = 0; anLocalInt < Statics.anInt294;
			 anLocalInt++) {
			int anLocalInt_12_ = anLocalInts_3_[anLocalInt];
			int anLocalInt_13_ = anLocalInts_2_[anLocalInt];
			anLocalInts[anLocalInt]
			    = (anLocalInt_12_ < anLocalInt_13_
			       ? anLocalInt_13_ - anLocalInt_12_
			       : anLocalInt_12_ - anLocalInt_13_);
		    }
		    break while_177_;
		} while (false);
		for (anLocalInt = 0; Statics.anInt294 > anLocalInt;
		     anLocalInt++) {
		    int anLocalInt_14_ = anLocalInts_3_[anLocalInt];
		    int anLocalInt_15_ = anLocalInts_2_[anLocalInt];
		    anLocalInts[anLocalInt]
			= (-(anLocalInt_14_ * anLocalInt_15_ >> 11)
			   + (anLocalInt_14_ + anLocalInt_15_));
		}
	    }
	} while (false);
	return anLocalInts;
    }
    
    final int[][] method870(int argument_16_, byte argument_17_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 58,
							       argument_16_);
    while_187_:
	do {
	    if (((Class341) ((Node_Sub31) this).aClass341_4137)
		.aBoolean2882) {
		int[][] anLocalInts_18_
		    = this.method869(0, argument_17_ + 10, argument_16_);
		int[][] anLocalInts_19_
		    = this.method869(1, argument_17_ + 10, argument_16_);
		int[] anLocalInts_20_ = anLocalInts[0];
		int[] anLocalInts_21_ = anLocalInts[1];
		int[] anLocalInts_22_ = anLocalInts[2];
		int[] anLocalInts_23_ = anLocalInts_18_[0];
		int[] anLocalInts_24_ = anLocalInts_18_[1];
		int[] anLocalInts_25_ = anLocalInts_18_[2];
		int[] anLocalInts_26_ = anLocalInts_19_[0];
		int[] anLocalInts_27_ = anLocalInts_19_[1];
		int[] anLocalInts_28_ = anLocalInts_19_[2];
		int anLocalInt = anInt6016;
	    while_186_:
		do {
		while_185_:
		    do {
		    while_184_:
			do {
			while_183_:
			    do {
			    while_182_:
				do {
				while_181_:
				    do {
				    while_180_:
					do {
					while_179_:
					    do {
					    while_178_:
						do {
						    do {
							if (anLocalInt != 1) {
							    if (anLocalInt
								!= 2) {
								if (anLocalInt
								    != 3) {
								    if (anLocalInt
									!= 4) {
									if (anLocalInt
									    != 5) {
									    if (anLocalInt != 6) {
										if (anLocalInt != 7) {
										    if (anLocalInt != 8) {
											if (anLocalInt != 9) {
											    if (anLocalInt != 10) {
												if (anLocalInt != 11) {
												    if (anLocalInt != 12)
													break while_187_;
												} else
												    break while_185_;
												break while_186_;
											    }
											} else
											    break while_183_;
											break while_184_;
										    }
										} else
										    break while_181_;
										break while_182_;
									    }
									} else
									    break while_179_;
									break while_180_;
								    }
								} else
								    break;
								break while_178_;
							    }
							} else {
							    for (anLocalInt
								     = 0;
								 (anLocalInt
								  < (Statics
								     .anInt294));
								 anLocalInt++) {
								anLocalInts_20_
								    [anLocalInt]
								    = ((anLocalInts_23_
									[anLocalInt])
								       + (anLocalInts_26_
									  [anLocalInt]));
								anLocalInts_21_
								    [anLocalInt]
								    = ((anLocalInts_27_
									[anLocalInt])
								       + (anLocalInts_24_
									  [anLocalInt]));
								anLocalInts_22_
								    [anLocalInt]
								    = ((anLocalInts_25_
									[anLocalInt])
								       + (anLocalInts_28_
									  [anLocalInt]));
							    }
							    break while_187_;
							}
							for (anLocalInt = 0;
							     (anLocalInt
							      < (Statics
								 .anInt294));
							     anLocalInt++) {
							    anLocalInts_20_
								[anLocalInt]
								= ((anLocalInts_23_
								    [anLocalInt])
								   - (anLocalInts_26_
								      [anLocalInt]));
							    anLocalInts_21_
								[anLocalInt]
								= (-(anLocalInts_27_
								     [anLocalInt])
								   + (anLocalInts_24_
								      [anLocalInt]));
							    anLocalInts_22_
								[anLocalInt]
								= (-(anLocalInts_28_
								     [anLocalInt])
								   + (anLocalInts_25_
								      [anLocalInt]));
							}
							break while_187_;
						    } while (false);
						    for (anLocalInt = 0;
							 (Statics.anInt294
							  > anLocalInt);
							 anLocalInt++) {
							anLocalInts_20_
							    [anLocalInt]
							    = (((anLocalInts_26_
								 [anLocalInt])
								* (anLocalInts_23_
								   [anLocalInt]))
							       >> 12);
							anLocalInts_21_
							    [anLocalInt]
							    = (((anLocalInts_24_
								 [anLocalInt])
								* (anLocalInts_27_
								   [anLocalInt]))
							       >> 12);
							anLocalInts_22_
							    [anLocalInt]
							    = (((anLocalInts_25_
								 [anLocalInt])
								* (anLocalInts_28_
								   [anLocalInt]))
							       >> 12);
						    }
						    break while_187_;
						} while (false);
						for (anLocalInt = 0;
						     (Statics.anInt294
						      > anLocalInt);
						     anLocalInt++) {
						    int anLocalInt_29_
							= (anLocalInts_27_
							   [anLocalInt]);
						    int anLocalInt_30_
							= (anLocalInts_26_
							   [anLocalInt]);
						    int anLocalInt_31_
							= (anLocalInts_28_
							   [anLocalInt]);
						    anLocalInts_20_[anLocalInt]
							= (anLocalInt_30_ == 0
							   ? 4096
							   : (((anLocalInts_23_
								[anLocalInt])
							       << 12)
							      / anLocalInt_30_));
						    anLocalInts_21_[anLocalInt]
							= (anLocalInt_29_ == 0
							   ? 4096
							   : (((anLocalInts_24_
								[anLocalInt])
							       << 12)
							      / anLocalInt_29_));
						    anLocalInts_22_[anLocalInt]
							= (anLocalInt_31_ == 0
							   ? 4096
							   : (((anLocalInts_25_
								[anLocalInt])
							       << 12)
							      / anLocalInt_31_));
						}
						break while_187_;
					    } while (false);
					    for (anLocalInt = 0;
						 Statics.anInt294 > anLocalInt;
						 anLocalInt++) {
						anLocalInts_20_[anLocalInt]
						    = -(((-(anLocalInts_23_
							    [anLocalInt])
							  + 4096)
							 * (-(anLocalInts_26_
							      [anLocalInt])
							    + 4096))
							>> 12) + 4096;
						anLocalInts_21_[anLocalInt]
						    = -(((-(anLocalInts_24_
							    [anLocalInt])
							  + 4096)
							 * (-(anLocalInts_27_
							      [anLocalInt])
							    + 4096))
							>> 12) + 4096;
						anLocalInts_22_[anLocalInt]
						    = (4096
						       - (((4096
							    - (anLocalInts_28_
							       [anLocalInt]))
							   * (4096
							      - (anLocalInts_25_
								 [anLocalInt])))
							  >> 12));
					    }
					    break while_187_;
					} while (false);
					for (anLocalInt = 0;
					     Statics.anInt294 > anLocalInt;
					     anLocalInt++) {
					    int anLocalInt_32_
						= anLocalInts_28_[anLocalInt];
					    int anLocalInt_33_
						= anLocalInts_26_[anLocalInt];
					    int anLocalInt_34_
						= anLocalInts_27_[anLocalInt];
					    anLocalInts_20_[anLocalInt]
						= (anLocalInt_33_ >= 2048
						   ? (4096
						      - (((-anLocalInt_33_
							   + 4096)
							  * (-(anLocalInts_23_
							       [anLocalInt])
							     + 4096))
							 >> 11))
						   : (anLocalInt_33_
						      * (anLocalInts_23_
							 [anLocalInt])) >> 11);
					    anLocalInts_21_[anLocalInt]
						= (anLocalInt_34_ >= 2048
						   ? -(((-anLocalInt_34_
							 + 4096)
							* (4096
							   - (anLocalInts_24_
							      [anLocalInt])))
						       >> 11) + 4096
						   : (anLocalInt_34_
						      * (anLocalInts_24_
							 [anLocalInt])) >> 11);
					    anLocalInts_22_[anLocalInt]
						= (anLocalInt_32_ >= 2048
						   ? -(((-(anLocalInts_25_
							   [anLocalInt])
							 + 4096)
							* (-anLocalInt_32_
							   + 4096))
						       >> 11) + 4096
						   : ((anLocalInts_25_
						       [anLocalInt])
						      * anLocalInt_32_) >> 11);
					}
					break while_187_;
				    } while (false);
				    for (anLocalInt = 0;
					 Statics.anInt294 > anLocalInt;
					 anLocalInt++) {
					int anLocalInt_35_
					    = anLocalInts_24_[anLocalInt];
					int anLocalInt_36_
					    = anLocalInts_25_[anLocalInt];
					int anLocalInt_37_
					    = anLocalInts_23_[anLocalInt];
					anLocalInts_20_[anLocalInt]
					    = (anLocalInt_37_ == 4096 ? 4096
					       : ((anLocalInts_26_[anLocalInt]
						   << 12)
						  / (-anLocalInt_37_ + 4096)));
					anLocalInts_21_[anLocalInt]
					    = (anLocalInt_35_ != 4096
					       ? ((anLocalInts_27_[anLocalInt]
						   << 12)
						  / (-anLocalInt_35_ + 4096))
					       : 4096);
					anLocalInts_22_[anLocalInt]
					    = (anLocalInt_36_ == 4096 ? 4096
					       : ((anLocalInts_28_[anLocalInt]
						   << 12)
						  / (-anLocalInt_36_ + 4096)));
				    }
				    break while_187_;
				} while (false);
				for (anLocalInt = 0;
				     Statics.anInt294 > anLocalInt;
				     anLocalInt++) {
				    int anLocalInt_38_
					= anLocalInts_24_[anLocalInt];
				    int anLocalInt_39_
					= anLocalInts_25_[anLocalInt];
				    int anLocalInt_40_
					= anLocalInts_23_[anLocalInt];
				    anLocalInts_20_[anLocalInt]
					= (anLocalInt_40_ == 0 ? 0
					   : -(((-anLocalInts_26_[anLocalInt]
						 + 4096)
						<< 12)
					       / anLocalInt_40_) + 4096);
				    anLocalInts_21_[anLocalInt]
					= (anLocalInt_38_ != 0
					   ? -(((4096
						 - anLocalInts_27_[anLocalInt])
						<< 12)
					       / anLocalInt_38_) + 4096
					   : 0);
				    anLocalInts_22_[anLocalInt]
					= (anLocalInt_39_ == 0 ? 0
					   : -(((-anLocalInts_28_[anLocalInt]
						 + 4096)
						<< 12)
					       / anLocalInt_39_) + 4096);
				}
				break while_187_;
			    } while (false);
			    for (anLocalInt = 0; Statics.anInt294 > anLocalInt;
				 anLocalInt++) {
				int anLocalInt_41_
				    = anLocalInts_24_[anLocalInt];
				int anLocalInt_42_
				    = anLocalInts_23_[anLocalInt];
				int anLocalInt_43_
				    = anLocalInts_25_[anLocalInt];
				int anLocalInt_44_
				    = anLocalInts_28_[anLocalInt];
				int anLocalInt_45_
				    = anLocalInts_27_[anLocalInt];
				int anLocalInt_46_
				    = anLocalInts_26_[anLocalInt];
				anLocalInts_20_[anLocalInt]
				    = (anLocalInt_46_ > anLocalInt_42_
				       ? anLocalInt_42_ : anLocalInt_46_);
				anLocalInts_21_[anLocalInt]
				    = (anLocalInt_41_ >= anLocalInt_45_
				       ? anLocalInt_45_ : anLocalInt_41_);
				anLocalInts_22_[anLocalInt]
				    = (anLocalInt_44_ > anLocalInt_43_
				       ? anLocalInt_43_ : anLocalInt_44_);
			    }
			    break while_187_;
			} while (false);
			for (anLocalInt = 0; Statics.anInt294 > anLocalInt;
			     anLocalInt++) {
			    int anLocalInt_47_ = anLocalInts_28_[anLocalInt];
			    int anLocalInt_48_ = anLocalInts_27_[anLocalInt];
			    int anLocalInt_49_ = anLocalInts_24_[anLocalInt];
			    int anLocalInt_50_ = anLocalInts_25_[anLocalInt];
			    int anLocalInt_51_ = anLocalInts_26_[anLocalInt];
			    int anLocalInt_52_ = anLocalInts_23_[anLocalInt];
			    anLocalInts_20_[anLocalInt]
				= (anLocalInt_51_ < anLocalInt_52_
				   ? anLocalInt_52_ : anLocalInt_51_);
			    anLocalInts_21_[anLocalInt]
				= (anLocalInt_48_ >= anLocalInt_49_
				   ? anLocalInt_48_ : anLocalInt_49_);
			    anLocalInts_22_[anLocalInt]
				= (anLocalInt_50_ <= anLocalInt_47_
				   ? anLocalInt_47_ : anLocalInt_50_);
			}
			break while_187_;
		    } while (false);
		    for (anLocalInt = 0; Statics.anInt294 > anLocalInt;
			 anLocalInt++) {
			int anLocalInt_53_ = anLocalInts_23_[anLocalInt];
			int anLocalInt_54_ = anLocalInts_24_[anLocalInt];
			int anLocalInt_55_ = anLocalInts_25_[anLocalInt];
			int anLocalInt_56_ = anLocalInts_28_[anLocalInt];
			int anLocalInt_57_ = anLocalInts_26_[anLocalInt];
			int anLocalInt_58_ = anLocalInts_27_[anLocalInt];
			anLocalInts_20_[anLocalInt]
			    = (anLocalInt_57_ >= anLocalInt_53_
			       ? -anLocalInt_53_ + anLocalInt_57_
			       : -anLocalInt_57_ + anLocalInt_53_);
			anLocalInts_21_[anLocalInt]
			    = (anLocalInt_54_ <= anLocalInt_58_
			       ? anLocalInt_58_ - anLocalInt_54_
			       : anLocalInt_54_ - anLocalInt_58_);
			anLocalInts_22_[anLocalInt]
			    = (anLocalInt_56_ < anLocalInt_55_
			       ? anLocalInt_55_ - anLocalInt_56_
			       : -anLocalInt_55_ + anLocalInt_56_);
		    }
		    break while_187_;
		} while (false);
		for (anLocalInt = 0; anLocalInt < Statics.anInt294;
		     anLocalInt++) {
		    int anLocalInt_59_ = anLocalInts_25_[anLocalInt];
		    int anLocalInt_60_ = anLocalInts_27_[anLocalInt];
		    int anLocalInt_61_ = anLocalInts_24_[anLocalInt];
		    int anLocalInt_62_ = anLocalInts_23_[anLocalInt];
		    int anLocalInt_63_ = anLocalInts_28_[anLocalInt];
		    int anLocalInt_64_ = anLocalInts_26_[anLocalInt];
		    anLocalInts_20_[anLocalInt]
			= (anLocalInt_62_ + anLocalInt_64_
			   - (anLocalInt_64_ * anLocalInt_62_ >> 11));
		    anLocalInts_21_[anLocalInt]
			= anLocalInt_60_ + (anLocalInt_61_
					    - (anLocalInt_61_ * anLocalInt_60_
					       >> 11));
		    anLocalInts_22_[anLocalInt]
			= (anLocalInt_59_ + anLocalInt_63_
			   - (anLocalInt_59_ * anLocalInt_63_ >> 11));
		}
	    }
	} while (false);
	if (argument_17_ != -9)
	    return null;
	return anLocalInts;
    }
    
    public static void method992(byte argument) {
	aCharArray6015 = null;
    }
    
    final void method868(Packet argument_65_, int argument_66_,
			 byte argument_67_) {
	if (argument_67_ > -41)
	    method870(-100, (byte) -16);
	int anLocalInt = argument_66_;
	do {
	    if (anLocalInt != 0) {
		if (anLocalInt != 1)
		    break;
	    } else {
		anInt6016 = argument_65_.g1();
		break;
	    }
	    ((Node_Sub31) this).aBoolean4138
		= argument_65_.g1() == 1;
	    break;
	} while (false);
    }
    
    static final int method993(int argument, int argument_68_,
			       int argument_69_, int argument_70_) {
	if (Node_Sub31_Sub5.aClass_sArray5858 == null)
	    return 0;
	int anLocalInt = argument_68_ >> 9;
	int anLocalInt_71_ = argument_70_ >> 9;
	if (anLocalInt < 0 || anLocalInt_71_ < 0
	    || MapRelated.mapWidth - 1 < anLocalInt
	    || anLocalInt_71_ > MapRelated.mapDepth - 1)
	    return 0;
	int anLocalInt_72_ = argument;
	if (anLocalInt_72_ < 3
	    && (Class303.tileSettings[1][anLocalInt][anLocalInt_71_]
		& 0x2) != 0)
	    anLocalInt_72_++;
	return Node_Sub31_Sub5.aClass_sArray5858[anLocalInt_72_]
		   .method3541(argument_70_, 0, argument_68_);
    }
    
    public Node_Sub31_Sub36() {
	super(2, false);
    }
    
    static {
	for (int anLocalInt = 0; anLocalInt < 26; anLocalInt++)
	    aCharArray6015[anLocalInt] = (char) (anLocalInt + 65);
	for (int anLocalInt = 26; anLocalInt < 52; anLocalInt++)
	    aCharArray6015[anLocalInt] = (char) (anLocalInt - 26 + 97);
	for (int anLocalInt = 52; anLocalInt < 62; anLocalInt++)
	    aCharArray6015[anLocalInt] = (char) (anLocalInt - 4);
	aCharArray6015[62] = '*';
	aCharArray6015[63] = '-';
    }
}
