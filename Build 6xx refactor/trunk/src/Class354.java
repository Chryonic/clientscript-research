/* Class354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class354
{
    private int anInt2954;
    Class41 aClass41_2955;
    int anInt2956;
    int[] anIntArray2957;
    int[][] anIntArrayArray2958;
    int anInt2959 = -1;
    int[] anIntArray2960;
    private int anInt2961;
    int anInt2962;
    int anInt2963;
    int anInt2964;
    int anInt2965;
    int anInt2966;
    int anInt2967;
    int anInt2968;
    int anInt2969;
    int anInt2970;
    int anInt2971;
    int anInt2972;
    int anInt2973;
    static int anInt2974;
    int anInt2975;
    int anInt2976;
    int anInt2977;
    int anInt2978;
    int[] anIntArray2979;
    int anInt2980;
    int anInt2981;
    private Class350[] aClass350Array2982;
    int[] anIntArray2983;
    boolean aBoolean2984;
    int anInt2985;
    int anInt2986;
    int anInt2987;
    int anInt2988;
    int anInt2989;
    int anInt2990;
    int anInt2991;
    int anInt2992;
    int anInt2993;
    int anInt2994;
    int anInt2995;
    int anInt2996;
    int anInt2997;
    int anInt2998;
    int anInt2999;
    static Class166 aClass166_3000 = new Class166(128, -1);
    int[][] anIntArrayArray3001;
    static Node_Sub33 aClass59_Sub33_3002 = new Node_Sub33(0, 0);
    int anInt3003;
    static int[] anIntArray3004 = new int[1];
    int anInt3005;
    
    final boolean method3918(byte argument_0_, int argument_1_) {
	if (argument_1_ == -1)
	    return false;
	if (argument_1_ == ((Class354) this).anInt2976)
	    return true;
	if (((Class354) this).anIntArray2960 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class354) this).anIntArray2960.length;
		 anLocalInt++) {
		if (((Class354) this).anIntArray2960[anLocalInt]
		    == argument_1_)
		    return true;
	    }
	}
	return false;
    }
    
    private final void method3919(int argument_2_, int argument_3_,
				  Packet argument_4_) {
	if (argument_3_ == 37) {
	    if (argument_2_ != 1) {
		if (argument_2_ != 2) {
		    if (argument_2_ != 3) {
			if (argument_2_ == 4)
			    ((Class354) this).anInt2988
				= argument_4_.g2();
			else if (argument_2_ != 5) {
			    if (argument_2_ == 6)
				((Class354) this).anInt2999
				    = argument_4_.g2();
			    else if (argument_2_ == 7)
				((Class354) this).anInt2980
				    = argument_4_.g2();
			    else if (argument_2_ == 8)
				((Class354) this).anInt2975
				    = argument_4_.g2();
			    else if (argument_2_ != 9) {
				if (argument_2_ == 26) {
				    ((Class354) this).anInt2996
					= (short) (argument_4_
						       .g1()
						   * 4);
				    ((Class354) this).anInt2993
					= (short) (argument_4_
						       .g1()
						   * 4);
				} else if (argument_2_ != 27) {
				    if (argument_2_ != 28) {
					if (argument_2_ == 29)
					    ((Class354) this).anInt2981
						= argument_4_
						      .g1();
					else if (argument_2_ != 30) {
					    if (argument_2_ == 31)
						((Class354) this).anInt2967
						    = (argument_4_.g1
                                ());
					    else if (argument_2_ == 32)
						((Class354) this).anInt2962
						    = argument_4_
							  .g2();
					    else if (argument_2_ == 33)
						((Class354) this).anInt2997
						    = argument_4_.g2s();
					    else if (argument_2_ == 34)
						((Class354) this).anInt2963
						    = (argument_4_.g1
                                ());
					    else if (argument_2_ != 35) {
						if (argument_2_ != 36) {
						    if (argument_2_ != 37) {
							if (argument_2_
							    != 38) {
							    if (argument_2_
								== 39)
								((Class354)
								 this)
								    .anInt2987
								    = (argument_4_
									   .g2
                                               ());
							    else if (argument_2_
								     == 40)
								((Class354)
								 this)
								    .anInt2970
								    = (argument_4_
									   .g2
                                               ());
							    else if (argument_2_
								     != 41) {
								if (argument_2_
								    != 42) {
								    if (argument_2_
									!= 43) {
									if (argument_2_
									    != 44) {
									    if (argument_2_ != 45) {
										if (argument_2_ != 46) {
										    if (argument_2_ == 47)
											((Class354) this).anInt2992 = argument_4_.g2();
										    else if (argument_2_ == 48)
											((Class354) this).anInt2977 = argument_4_.g2();
										    else if (argument_2_ != 49) {
											if (argument_2_ == 50)
											    ((Class354) this).anInt2972 = argument_4_.g2();
											else if (argument_2_ == 51)
											    ((Class354) this).anInt2989 = argument_4_.g2();
											else if (argument_2_ == 52) {
											    int anLocalInt = argument_4_.g1();
											    ((Class354) this).anIntArray2960 = new int[anLocalInt];
											    ((Class354) this).anIntArray2983 = new int[anLocalInt];
											    for (int anLocalInt_5_ = 0; anLocalInt_5_ < anLocalInt; anLocalInt_5_++) {
												((Class354) this).anIntArray2960[anLocalInt_5_] = argument_4_.g2();
												int anLocalInt_6_ = argument_4_.g1();
												((Class354) this).anIntArray2983[anLocalInt_5_] = anLocalInt_6_;
												anInt2961 += anLocalInt_6_;
											    }
											} else if (argument_2_ != 53) {
											    if (argument_2_ != 54) {
												if (argument_2_ != 55) {
												    if (argument_2_ == 56) {
													if (((Class354) this).anIntArrayArray3001 == null)
													    ((Class354) this).anIntArrayArray3001 = new int[((Class61) ((Class41) ((Class354) this).aClass41_2955).aClass61_305).anIntArray439.length][];
													int anLocalInt = argument_4_.g1();
													((Class354) this).anIntArrayArray3001[anLocalInt] = new int[3];
													for (int anLocalInt_7_ = 0; anLocalInt_7_ < 3; anLocalInt_7_++)
													    ((Class354) this).anIntArrayArray3001[anLocalInt][anLocalInt_7_] = argument_4_.g2s();
												    }
												} else {
												    if (((Class354) this).anIntArray2957 == null)
													((Class354) this).anIntArray2957 = new int[((Class61) ((Class41) ((Class354) this).aClass41_2955).aClass61_305).anIntArray439.length];
												    int anLocalInt = argument_4_.g1();
												    ((Class354) this).anIntArray2957[anLocalInt] = argument_4_.g2();
												}
											    } else {
												((Class354) this).anInt3005 = argument_4_.g1() << 6;
												((Class354) this).anInt2965 = argument_4_.g1() << 6;
											    }
											} else
											    ((Class354) this).aBoolean2984 = false;
										    } else
											((Class354) this).anInt2990 = argument_4_.g2();
										} else
										    ((Class354) this).anInt2978 = argument_4_.g2();
									    } else
										((Class354) this).anInt2994 = argument_4_.g2();
									} else
									    ((Class354)
									     this).anInt2991
										= argument_4_.g2();
								    } else
									((Class354)
									 this)
									    .anInt3003
									    = argument_4_.g2();
								} else
								    ((Class354)
								     this)
									.anInt2995
									= (argument_4_.g2
                                            ());
							    } else
								((Class354)
								 this)
								    .anInt2968
								    = (argument_4_
									   .g2
                                               ());
							} else
							    ((Class354) this)
								.anInt2971
								= (argument_4_
								       .g2
                                               ());
						    } else
							((Class354) this)
							    .anInt2998
							    = (argument_4_
								   .g1
                                           ());
						} else
						    ((Class354) this).anInt2969
							= argument_4_
							      .g2s();
					    } else
						((Class354) this).anInt2986
						    = argument_4_
							  .g2();
					} else
					    ((Class354) this).anInt2985
						= argument_4_.g2();
				    } else {
					int anLocalInt
					    = argument_4_
						  .g1();
					((Class354) this).anIntArray2979
					    = new int[anLocalInt];
					for (int anLocalInt_8_ = 0;
					     anLocalInt > anLocalInt_8_;
					     anLocalInt_8_++) {
					    ((Class354) this)
						.anIntArray2979[anLocalInt_8_]
						= argument_4_
						      .g1();
					    if ((((Class354) this)
						 .anIntArray2979
						 [anLocalInt_8_])
						== 255)
						((Class354) this)
						    .anIntArray2979
						    [anLocalInt_8_]
						    = -1;
					}
				    }
				} else {
				    if (((Class354) this).anIntArrayArray2958
					== null)
					((Class354) this).anIntArrayArray2958
					    = (new int
					       [(((Class61)
						  (((Class41)
						    (((Class354) this)
						     .aClass41_2955))
						   .aClass61_305))
						 .anIntArray439).length]
					       []);
				    int anLocalInt
					= argument_4_.g1();
				    ((Class354) this).anIntArrayArray2958
					[anLocalInt]
					= new int[6];
				    for (int anLocalInt_9_ = 0;
					 anLocalInt_9_ < 6; anLocalInt_9_++)
					((Class354) this)
					    .anIntArrayArray2958[anLocalInt]
					    [anLocalInt_9_]
					    = argument_4_
						  .g2s();
				}
			    } else
				((Class354) this).anInt2973
				    = argument_4_.g2();
			} else
			    ((Class354) this).anInt2966
				= argument_4_.g2();
		    } else
			((Class354) this).anInt2964
			    = argument_4_.g2();
		} else
		    ((Class354) this).anInt2956 = argument_4_.g2();
	    } else {
		((Class354) this).anInt2976 = argument_4_.g2();
		((Class354) this).anInt2959 = argument_4_.g2();
		if (((Class354) this).anInt2976 == 65535)
		    ((Class354) this).anInt2976 = -1;
		if (((Class354) this).anInt2959 == 65535)
		    ((Class354) this).anInt2959 = -1;
	    }
	}
    }
    
    final Class350[] method3920(int argument_10_, GraphicsToolkit argument_11_) {
	if (aClass350Array2982 != null
	    && ((GraphicsToolkit) argument_11_).anInt939 == anInt2954)
	    return aClass350Array2982;
	if (((Class354) this).anIntArrayArray2958 == null)
	    return null;
	aClass350Array2982
	    = new Class350[((Class354) this).anIntArrayArray2958.length];
	for (int anLocalInt = 0;
	     ((Class354) this).anIntArrayArray2958.length > anLocalInt;
	     anLocalInt++) {
	    int anLocalInt_12_ = 0;
	    int anLocalInt_13_ = 0;
	    int anLocalInt_14_ = 0;
	    int anLocalInt_15_ = 0;
	    int anLocalInt_16_ = 0;
	    int anLocalInt_17_ = 0;
	    if (((Class354) this).anIntArrayArray2958[anLocalInt] != null) {
		anLocalInt_15_
		    = (((Class354) this).anIntArrayArray2958[anLocalInt][3]
		       << 3);
		anLocalInt_14_
		    = ((Class354) this).anIntArrayArray2958[anLocalInt][2];
		anLocalInt_17_
		    = (((Class354) this).anIntArrayArray2958[anLocalInt][5]
		       << 3);
		anLocalInt_12_
		    = ((Class354) this).anIntArrayArray2958[anLocalInt][0];
		anLocalInt_16_
		    = (((Class354) this).anIntArrayArray2958[anLocalInt][4]
		       << 3);
		anLocalInt_13_
		    = ((Class354) this).anIntArrayArray2958[anLocalInt][1];
	    }
	    if (anLocalInt_12_ != 0 || anLocalInt_13_ != 0
		|| anLocalInt_14_ != 0 || anLocalInt_15_ != 0
		|| anLocalInt_16_ != 0 || anLocalInt_17_ != 0) {
		Class350 class350 = (aClass350Array2982[anLocalInt]
				     = argument_11_.method2029());
		if (anLocalInt_17_ != 0)
		    class350.method3837(anLocalInt_17_);
		if (anLocalInt_15_ != 0)
		    class350.method3833(anLocalInt_15_);
		if (anLocalInt_16_ != 0)
		    class350.method3834(anLocalInt_16_);
		class350.method3835(anLocalInt_12_, anLocalInt_13_,
				    anLocalInt_14_);
	    }
	}
	return aClass350Array2982;
    }
    
    static final void method3921
	(int argument, int argument_18_, float argument_19_,
	 byte[] argument_20_, int argument_21_, Class111 argument_22_,
	 float argument_23_, int argument_24_, float argument_25_,
	 int argument_26_, int argument_27_, float argument_28_,
	 float argument_29_) {
	for (int anLocalInt = 0; anLocalInt < argument_21_; anLocalInt++) {
	    ClanChannel.method1324(argument_25_, argument_27_, true, argument_19_, argument, argument_21_, argument_24_, argument_22_, argument_29_, argument_20_, argument_23_, anLocalInt, argument_28_, argument_18_);
	    argument_18_ += argument * argument_27_;
	}
    }
    
    public static void method3922(byte argument) {
	anIntArray3004 = null;
	aClass59_Sub33_3002 = null;
	aClass166_3000 = null;
    }
    
    final int method3923(byte argument_30_) {
	if (((Class354) this).anInt2976 != -1)
	    return ((Class354) this).anInt2976;
	if (((Class354) this).anIntArray2960 != null) {
	    int anLocalInt = (int) (Math.random() * (double) anInt2961);
	    int anLocalInt_31_;
	    for (anLocalInt_31_ = 0;
		 (anLocalInt
		  >= ((Class354) this).anIntArray2983[anLocalInt_31_]);
		 anLocalInt_31_++)
		anLocalInt -= ((Class354) this).anIntArray2983[anLocalInt_31_];
	    return ((Class354) this).anIntArray2960[anLocalInt_31_];
	}
	return -1;
    }
    
    static final int method3924(String argument, int argument_32_) {
	if (argument == null)
	    return -1;
	for (int anLocalInt = 0; Class257.anInt2013 > anLocalInt;
	     anLocalInt++) {
	    if (argument
		    .equalsIgnoreCase(Class260.aStringArray2031[anLocalInt]))
		return anLocalInt;
	}
	return -1;
    }
    
    final void method3925(int argument_33_, Packet argument_34_) {
	for (;;) {
	    int anLocalInt = argument_34_.g1();
	    if (anLocalInt == 0)
		break;
	    method3919(anLocalInt, 37, argument_34_);
	}
    }
    
    static final int method3926(int argument, boolean argument_35_,
				int argument_36_, int argument_37_,
				int argument_38_, int argument_39_) {
	if (Node_Sub31_Sub5.aClass_sArray5858 == null)
	    return 0;
	if (argument_36_ < 3) {
	    int anLocalInt = argument_38_ >> 9;
	    int anLocalInt_40_ = argument_39_ >> 9;
	    if (argument < 0 || argument_37_ < 0
		|| MapRelated.mapWidth - 1 < argument
		|| argument_37_ > MapRelated.mapDepth - 1)
		return 0;
	    if (anLocalInt < 1 || anLocalInt_40_ < 1
		|| MapRelated.mapWidth - 1 < anLocalInt
		|| anLocalInt_40_ > MapRelated.mapDepth - 1)
		return 0;
	    boolean anLocalBoolean = (((Class303.tileSettings[1]
					[argument_38_ >> 9][argument_39_ >> 9])
				       & 0x2)
				      != 0);
	    if ((argument_38_ & 0x1ff) == 0) {
		boolean anLocalBoolean_41_
		    = (((Class303.tileSettings[1][anLocalInt - 1]
			 [argument_39_ >> 9])
			& 0x2)
		       != 0);
		boolean anLocalBoolean_42_
		    = (((Class303.tileSettings[1][anLocalInt]
			 [argument_39_ >> 9])
			& 0x2)
		       != 0);
		if (anLocalBoolean_41_ != anLocalBoolean_42_)
		    anLocalBoolean = ((Class303.tileSettings[1]
				       [argument][argument_37_])
				      & 0x2) != 0;
	    }
	    if ((argument_39_ & 0x1ff) == 0) {
		boolean anLocalBoolean_43_
		    = (((Class303.tileSettings[1][argument_38_ >> 9]
			 [anLocalInt_40_ - 1])
			& 0x2)
		       != 0);
		boolean anLocalBoolean_44_
		    = (((Class303.tileSettings[1][argument_38_ >> 9]
			 [anLocalInt_40_])
			& 0x2)
		       != 0);
		if (anLocalBoolean_44_ == !anLocalBoolean_43_)
		    anLocalBoolean = ((Class303.tileSettings[1]
				       [argument][argument_37_])
				      & 0x2) != 0;
	    }
	    if (anLocalBoolean)
		argument_36_++;
	}
	return Node_Sub31_Sub5.aClass_sArray5858[argument_36_]
		   .method3541(argument_39_, 0, argument_38_);
    }
    
    public Class354() {
	((Class354) this).anInt2956 = -1;
	((Class354) this).anInt2971 = -1;
	((Class354) this).anInt2968 = -1;
	((Class354) this).anInt2973 = -1;
	((Class354) this).anInt2965 = 0;
	((Class354) this).anIntArray2960 = null;
	((Class354) this).anInt2964 = -1;
	anInt2961 = 0;
	((Class354) this).anInt2980 = -1;
	((Class354) this).anInt2978 = -1;
	((Class354) this).anInt2966 = -1;
	((Class354) this).anInt2972 = -1;
	((Class354) this).anInt2977 = -1;
	((Class354) this).anInt2985 = 0;
	((Class354) this).anInt2989 = -1;
	((Class354) this).anIntArray2983 = null;
	((Class354) this).anInt2990 = -1;
	((Class354) this).anInt2993 = 0;
	((Class354) this).aBoolean2984 = true;
	((Class354) this).anInt2987 = -1;
	((Class354) this).anInt2970 = -1;
	((Class354) this).anInt2981 = 0;
	((Class354) this).anInt2962 = 0;
	((Class354) this).anInt2975 = -1;
	((Class354) this).anInt2988 = -1;
	((Class354) this).anInt2976 = -1;
	((Class354) this).anInt2994 = -1;
	((Class354) this).anInt2967 = 0;
	((Class354) this).anInt2996 = 0;
	((Class354) this).anInt2992 = -1;
	((Class354) this).anInt2995 = -1;
	((Class354) this).anInt2998 = -1;
	anInt2954 = -1;
	((Class354) this).anInt2997 = 0;
	((Class354) this).anInt2986 = 0;
	((Class354) this).anInt2963 = 0;
	((Class354) this).anInt2969 = 0;
	((Class354) this).anInt2991 = -1;
	((Class354) this).anInt2999 = -1;
	((Class354) this).anInt3003 = -1;
	((Class354) this).anInt3005 = 0;
    }
}
