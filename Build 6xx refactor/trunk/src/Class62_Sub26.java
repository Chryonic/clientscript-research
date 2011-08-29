/* Class62_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class62_Sub26 extends Class62
{
    boolean aBoolean4445 = false;
    private boolean aBoolean4446 = true;
    static int anInt4447;
    static Class207 aClass207_4448 = new Class207(5, 4);
    
    static final void method1459(int argument) {
	Node_Sub31_Sub24.aBoolean5946 = true;
    }
    
    Class62_Sub26(Node_Sub50 argument_0_) {
	super(argument_0_);
    }
    
    final void method1460(boolean argument_1_, int argument_2_) {
	aBoolean4446 = argument_1_;
    }
    
    final int method1342(int argument_3_, byte argument_4_) {
	if (!((Class62) this).aClass59_Sub50_440.method1157(-113)
		 .method235((byte) -37))
	    return 3;
	if (argument_3_ == 3 && !Node_Sub31_Sub23.method947("jagdx", 4096))
	    return 3;
	return 2;
    }
    
    final boolean method1461(int argument_5_) {
	if (!((Class62) this).aClass59_Sub50_440.method1157(-113)
		 .method235((byte) -37))
	    return false;
	return true;
    }
    
    final boolean method1462(int argument_6_) {
	return aBoolean4446;
    }
    
    final int method1344(byte argument_7_) {
	((Class62_Sub26) this).aBoolean4445 = true;
	if (argument_7_ != 4)
	    ((Class62_Sub26) this).aBoolean4445 = true;
	if (!((Class62) this).aClass59_Sub50_440.method1157(118)
		 .method235((byte) -37))
	    return 0;
	return 2;
    }
    
    static final void method1463(int argument, int argument_8_,
				 int argument_9_, Node_Sub13 argument_10_,
				 int argument_11_, int argument_12_) {
	if (((Node_Sub13) argument_10_).anInt3950 != -1
	    || ((Node_Sub13) argument_10_).anIntArray3975 != null) {
	    int anLocalInt = 0;
	    int anLocalInt_13_
		= ((((Node_Sub13) argument_10_).anInt3952
		    * ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			  .aClass62_Sub22_4303.method1446(78))
		   >> 8);
	    if (argument > ((Node_Sub13) argument_10_).anInt3962)
		anLocalInt
		    += -((Node_Sub13) argument_10_).anInt3962 + argument;
	    else if (argument < ((Node_Sub13) argument_10_).anInt3981)
		anLocalInt
		    += ((Node_Sub13) argument_10_).anInt3981 - argument;
	    if (argument_12_ > ((Node_Sub13) argument_10_).anInt3955)
		anLocalInt
		    += argument_12_ - ((Node_Sub13) argument_10_).anInt3955;
	    else if (((Node_Sub13) argument_10_).anInt3969 > argument_12_)
		anLocalInt
		    += ((Node_Sub13) argument_10_).anInt3969 - argument_12_;
	    if (((Node_Sub13) argument_10_).anInt3972 == 0
		|| ((Node_Sub13) argument_10_).anInt3972 < anLocalInt - 256
		|| ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		       .aClass62_Sub22_4303.method1446(69) == 0
		|| argument_11_ != ((Node_Sub13) argument_10_).anInt3973) {
		if (((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3968
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) argument_10_)
			 .aClass59_Sub9_Sub4_3968);
		    ((Node_Sub13) argument_10_).aClass59_Sub40_Sub1_3958
			= null;
		    ((Node_Sub13) argument_10_).aClass59_Sub25_3954 = null;
		    ((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3968
			= null;
		}
		if (((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3971
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) argument_10_)
			 .aClass59_Sub9_Sub4_3971);
		    ((Node_Sub13) argument_10_).aClass59_Sub25_3966 = null;
		    ((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3971
			= null;
		    ((Node_Sub13) argument_10_).aClass59_Sub40_Sub1_3976
			= null;
		}
	    } else {
		anLocalInt -= 256;
		if (anLocalInt < 0)
		    anLocalInt = 0;
		int anLocalInt_14_
		    = (-((Node_Sub13) argument_10_).anInt3964
		       + ((Node_Sub13) argument_10_).anInt3972);
		if (anLocalInt_14_ < 0)
		    anLocalInt_14_ = ((Node_Sub13) argument_10_).anInt3972;
		int anLocalInt_15_ = anLocalInt_13_;
		int anLocalInt_16_
		    = anLocalInt - ((Node_Sub13) argument_10_).anInt3964;
		if (anLocalInt_16_ > 0 && anLocalInt_14_ > 0)
		    anLocalInt_15_
			= (anLocalInt_13_ * (anLocalInt_14_ - anLocalInt_16_)
			   / anLocalInt_14_);
		Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.method1830(-127);
		int anLocalInt_17_ = 8192;
		int anLocalInt_18_
		    = ((((Node_Sub13) argument_10_).anInt3981
			+ ((Node_Sub13) argument_10_).anInt3962) / 2
		       - argument);
		int anLocalInt_19_
		    = (-argument_12_
		       + (((Node_Sub13) argument_10_).anInt3955
			  + ((Node_Sub13) argument_10_).anInt3969) / 2);
		if (anLocalInt_18_ != 0 || anLocalInt_19_ != 0) {
		    int anLocalInt_20_
			= ((-Node_Sub47_Sub3.anInt6167 - 4096
			    - (int) (Math.atan2((double) anLocalInt_18_,
						(double) anLocalInt_19_)
				     * 2607.5945876176133))
			   & 0x3fff);
		    if (anLocalInt_20_ > 8192)
			anLocalInt_20_ = -anLocalInt_20_ + 16384;
		    int anLocalInt_21_;
		    if (anLocalInt <= 0)
			anLocalInt_21_ = 8192;
		    else if (anLocalInt < 4096)
			anLocalInt_21_ = 8192 + anLocalInt * 8192 / 4096;
		    else
			anLocalInt_21_ = 16384;
		    anLocalInt_17_ = (anLocalInt_20_ * anLocalInt_21_ / 8192
				      + (16384 - anLocalInt_21_ >> 1));
		}
		if (((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3968
		    == null) {
		    if (((Node_Sub13) argument_10_).anInt3950 >= 0) {
			int anLocalInt_22_
			    = ((((Node_Sub13) argument_10_).anInt3970 == 256
				&& (((Node_Sub13) argument_10_).anInt3965
				    == 256))
			       ? 256
			       : Class384.method4119(((Node_Sub13)
						      argument_10_).anInt3965,
						     ((Node_Sub13)
						      argument_10_).anInt3970,
						     2));
			if (((Node_Sub13) argument_10_).aBoolean3953) {
			    if ((((Node_Sub13) argument_10_)
				 .aClass59_Sub25_3954)
				== null)
				((Node_Sub13) argument_10_)
				    .aClass59_Sub25_3954
				    = Node_Sub25.method755((ClanSettingsDelta
                        .aJs5Store_1546),
                        (((Node_Sub13)
                                argument_10_)
                                .anInt3950));
			    if ((((Node_Sub13) argument_10_)
				 .aClass59_Sub25_3954)
				!= null) {
				if ((((Node_Sub13) argument_10_)
				     .aClass59_Sub40_Sub1_3958)
				    == null)
				    ((Node_Sub13) argument_10_)
					.aClass59_Sub40_Sub1_3958
					= ((Node_Sub13) argument_10_)
					      .aClass59_Sub25_3954
					      .method758(new int[] { 22050 });
				if ((((Node_Sub13) argument_10_)
				     .aClass59_Sub40_Sub1_3958)
				    != null) {
				    Node_Sub9_Sub4 class59_sub9_sub4
					= (Node_Sub9_Sub4.method631
                            ((((Node_Sub13) argument_10_)
                                    .aClass59_Sub40_Sub1_3958),
                                    anLocalInt_22_,
                                    anLocalInt_15_ << 6,
                                    anLocalInt_17_));
				    class59_sub9_sub4.method664(-1);
				    Class353_Sub2.aClass59_Sub9_Sub3_5483
					.method629(class59_sub9_sub4);
				    ((Node_Sub13) argument_10_)
					.aClass59_Sub9_Sub4_3968
					= class59_sub9_sub4;
				}
			    }
			} else {
			    Class198 class198
				= Class198.method2906(Class314.aJs5Store_2603,
						      ((Node_Sub13)
						       argument_10_).anInt3950,
						      0);
			    if (class198 != null) {
				Node_Sub40_Sub1 class59_sub40_sub1
				    = class198.method2909()
					  .method1074(Class23.aClass213_155);
				Node_Sub9_Sub4 class59_sub9_sub4
				    = (Node_Sub9_Sub4.method631
                        (class59_sub40_sub1, anLocalInt_22_,
                                anLocalInt_15_ << 6, anLocalInt_17_));
				class59_sub9_sub4.method664(-1);
				Class353_Sub2.aClass59_Sub9_Sub3_5483
				    .method629(class59_sub9_sub4);
				((Node_Sub13) argument_10_)
				    .aClass59_Sub9_Sub4_3968
				    = class59_sub9_sub4;
			    }
			}
		    }
		} else {
		    ((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3968
			.method660(anLocalInt_15_);
		    ((Node_Sub13) argument_10_).aClass59_Sub9_Sub4_3968
			.method665(anLocalInt_17_);
		}
	    while_108_:
		do {
		    do {
			if ((((Node_Sub13) argument_10_)
			     .aClass59_Sub9_Sub4_3971)
			    == null) {
			    if ((((Node_Sub13) argument_10_).anIntArray3975
				 != null)
				&& (((Node_Sub13) argument_10_).anInt3957
				    -= argument_8_) <= 0) {
				int anLocalInt_23_
				    = (((((Node_Sub13) argument_10_)
					 .anInt3970) != 256
					|| (((Node_Sub13) argument_10_)
					    .anInt3965) != 256)
				       ? ((int) (Math.random()
						 * (double) (-(((Node_Sub13)
								argument_10_)
							       .anInt3965)
							     + (((Node_Sub13)
								 argument_10_)
								.anInt3970)))
					  + (((Node_Sub13) argument_10_)
					     .anInt3965))
				       : 256);
				if (((Node_Sub13) argument_10_)
				    .aBoolean3961) {
				    if ((((Node_Sub13) argument_10_)
					 .aClass59_Sub25_3966)
					== null) {
					int anLocalInt_24_
					    = (int) ((double) (((Node_Sub13)
								argument_10_)
							       .anIntArray3975).length
						     * Math.random());
					((Node_Sub13) argument_10_)
					    .aClass59_Sub25_3966
					    = (Node_Sub25.method755
                            (ClanSettingsDelta.aJs5Store_1546,
                                    (((Node_Sub13) argument_10_)
                                            .anIntArray3975
                                            [anLocalInt_24_])));
				    }
				    if ((((Node_Sub13) argument_10_)
					 .aClass59_Sub25_3966)
					!= null) {
					if ((((Node_Sub13) argument_10_)
					     .aClass59_Sub40_Sub1_3976)
					    == null)
					    ((Node_Sub13) argument_10_)
						.aClass59_Sub40_Sub1_3976
						= (((Node_Sub13)
						    argument_10_)
						       .aClass59_Sub25_3966
						       .method758
						   (new int[] { 22050 }));
					if ((((Node_Sub13) argument_10_)
					     .aClass59_Sub40_Sub1_3976)
					    != null) {
					    Node_Sub9_Sub4 class59_sub9_sub4
						= (Node_Sub9_Sub4.method631
                                ((((Node_Sub13)
                                        argument_10_)
                                        .aClass59_Sub40_Sub1_3976),
                                        anLocalInt_23_,
                                        anLocalInt_15_ << 6,
                                        anLocalInt_17_));
					    class59_sub9_sub4.method664(0);
					    Class353_Sub2
						.aClass59_Sub9_Sub3_5483
						.method629(class59_sub9_sub4);
					    ((Node_Sub13) argument_10_)
						.anInt3957
						= (((Node_Sub13)
						    argument_10_).anInt3980
						   + (int) ((double) ((((Node_Sub13)
									argument_10_)
								       .anInt3960)
								      - (((Node_Sub13)
									  argument_10_)
									 .anInt3980))
							    * Math.random()));
					    ((Node_Sub13) argument_10_)
						.aClass59_Sub9_Sub4_3971
						= class59_sub9_sub4;
					}
				    }
				} else {
				    int anLocalInt_25_
					= (int) (Math.random()
						 * (double) (((Node_Sub13)
							      argument_10_)
							     .anIntArray3975).length);
				    Class198 class198
					= (Class198.method2906
					   (Class314.aJs5Store_2603,
					    (((Node_Sub13) argument_10_)
					     .anIntArray3975[anLocalInt_25_]),
					    0));
				    if (class198 == null)
					break;
				    Node_Sub40_Sub1 class59_sub40_sub1
					= (class198.method2909().method1074
					   (Class23.aClass213_155));
				    Node_Sub9_Sub4 class59_sub9_sub4
					= (Node_Sub9_Sub4.method631
                            (class59_sub40_sub1, anLocalInt_23_,
                                    anLocalInt_15_ << 6,
                                    anLocalInt_17_));
				    class59_sub9_sub4.method664(0);
				    Class353_Sub2.aClass59_Sub9_Sub3_5483
					.method629(class59_sub9_sub4);
				    ((Node_Sub13) argument_10_)
					.aClass59_Sub9_Sub4_3971
					= class59_sub9_sub4;
				    ((Node_Sub13) argument_10_).anInt3957
					= ((((Node_Sub13) argument_10_)
					    .anInt3980)
					   + (int) ((double) (-(((Node_Sub13)
								 argument_10_)
								.anInt3980)
							      + (((Node_Sub13)
								  argument_10_)
								 .anInt3960))
						    * Math.random()));
				}
				break;
			    }
			} else {
			    ((Node_Sub13) argument_10_)
				.aClass59_Sub9_Sub4_3971
				.method660(anLocalInt_15_);
			    ((Node_Sub13) argument_10_)
				.aClass59_Sub9_Sub4_3971
				.method665(anLocalInt_17_);
			    if (((Node_Sub13) argument_10_)
				    .aClass59_Sub9_Sub4_3971.isLinked())
				break while_108_;
			    ((Node_Sub13) argument_10_)
				.aClass59_Sub9_Sub4_3971
				= null;
			    ((Node_Sub13) argument_10_)
				.aClass59_Sub40_Sub1_3976
				= null;
			    ((Node_Sub13) argument_10_).aClass59_Sub25_3966
				= null;
			}
		    } while (false);
		    break;
		} while (false);
	    }
	}
    }
    
    Class62_Sub26(int argument_26_, Node_Sub50 argument_27_) {
	super(argument_26_, argument_27_);
    }
    
    final int method1464(int argument_28_) {
	if (argument_28_ < 3)
	    method1464(26);
	return ((Class62) this).anInt441;
    }
    
    final void method1343(int argument_29_, byte argument_30_) {
	if (argument_30_ != -107)
	    aClass207_4448 = null;
	((Class62) this).anInt441 = argument_29_;
	((Class62_Sub26) this).aBoolean4445 = false;
    }
    
    public static void method1465(int argument) {
	aClass207_4448 = null;
    }
    
    final void method1346(boolean argument_31_) {
	if (argument_31_)
	    ((Class62_Sub26) this).aBoolean4445 = true;
	if (!((Class62) this).aClass59_Sub50_440.method1157(67)
		 .method235((byte) -37))
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 5)
	    ((Class62) this).anInt441 = method1344((byte) 4);
    }
    
    static final void method1466(int argument, int[] argument_32_,
				 int argument_33_, int argument_34_,
				 int argument_35_, int argument_36_,
				 int argument_37_, int argument_38_) {
	if (argument_33_ > 0 && !Class2_Sub1.method198(argument_33_))
	    throw new IllegalArgumentException("");
	if (argument_34_ > 0 && !Class2_Sub1.method198(argument_34_))
	    throw new IllegalArgumentException("");
	if (argument_35_ != 32993)
	    throw new IllegalArgumentException("");
	int anLocalInt = 0;
	int anLocalInt_39_
	    = argument_33_ >= argument_34_ ? argument_34_ : argument_33_;
	int anLocalInt_40_ = argument_33_ >> 1;
	int anLocalInt_41_ = argument_34_ >> 1;
	int[] anLocalInts = argument_32_;
	int[] anLocalInts_42_ = new int[anLocalInt_41_ * anLocalInt_40_];
	for (;;) {
	    OpenGL.glTexImage2Di(argument, anLocalInt, argument_38_,
				 argument_33_, argument_34_, 0, argument_35_,
				 argument_36_, anLocalInts, 0);
	    if (anLocalInt_39_ <= 1)
		break;
	    int anLocalInt_43_ = 0;
	    int anLocalInt_44_ = 0;
	    int anLocalInt_45_ = argument_33_ + anLocalInt_44_;
	    int[] anLocalInts_46_ = anLocalInts_42_;
	    for (int anLocalInt_47_ = 0; anLocalInt_47_ < anLocalInt_41_;
		 anLocalInt_47_++) {
		for (int anLocalInt_48_ = 0; anLocalInt_48_ < anLocalInt_40_;
		     anLocalInt_48_++) {
		    int anLocalInt_49_ = anLocalInts[anLocalInt_44_++];
		    int anLocalInt_50_ = anLocalInts[anLocalInt_45_++];
		    int anLocalInt_51_ = anLocalInts[anLocalInt_44_++];
		    int anLocalInt_52_ = anLocalInt_49_ >> 16 & 0xff;
		    int anLocalInt_53_ = anLocalInts[anLocalInt_45_++];
		    int anLocalInt_54_ = anLocalInt_49_ >> 8 & 0xff;
		    int anLocalInt_55_ = anLocalInt_49_ & 0xff;
		    int anLocalInt_56_ = anLocalInt_49_ >> 24 & 0xff;
		    anLocalInt_55_ += anLocalInt_51_ & 0xff;
		    anLocalInt_56_ += anLocalInt_51_ >> 24 & 0xff;
		    anLocalInt_54_ += (anLocalInt_51_ & 0xffe3) >> 8;
		    anLocalInt_52_ += anLocalInt_51_ >> 16 & 0xff;
		    anLocalInt_56_ += anLocalInt_50_ >> 24 & 0xff;
		    anLocalInt_54_ += (anLocalInt_50_ & 0xffd5) >> 8;
		    anLocalInt_52_ += anLocalInt_50_ >> 16 & 0xff;
		    anLocalInt_55_ += anLocalInt_50_ & 0xff;
		    anLocalInt_54_ += anLocalInt_53_ >> 8 & 0xff;
		    anLocalInt_55_ += anLocalInt_53_ & 0xff;
		    anLocalInt_52_ += anLocalInt_53_ >> 16 & 0xff;
		    anLocalInt_56_ += anLocalInt_53_ >> 24 & 0xff;
		    anLocalInts_42_[anLocalInt_43_++]
			= (MathStatics.OR
			   (MathStatics.AND(anLocalInt_55_, 1020) >> 2, (MathStatics.OR((MathStatics.OR(MathStatics.AND(anLocalInt_52_ << 14, 16711680), (MathStatics.AND(1020, anLocalInt_56_) << 22))), MathStatics.AND(65280, anLocalInt_54_ << 6)))));
		}
		anLocalInt_44_ += argument_33_;
		anLocalInt_45_ += argument_33_;
	    }
	    anLocalInts_42_ = anLocalInts;
	    argument_34_ = anLocalInt_41_;
	    anLocalInts = anLocalInts_46_;
	    argument_33_ = anLocalInt_40_;
	    anLocalInt++;
	    anLocalInt_40_ >>= 1;
	    anLocalInt_39_ >>= 1;
	    anLocalInt_41_ >>= 1;
	}
    }
}
