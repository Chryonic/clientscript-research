/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class176
{
    String aString1303;
    String aString1304;
    String aString1305;
    String aString1306;
    int anInt1307;
    static int anInt1308;
    byte aByte1309;
    
    static final int method2787(boolean argument) {
	if (Class50.anInt365 == 1)
	    return dba_sub_772_Sub2.anInt6366;
	return Class349.anInt2921;
    }
    
    static final void method2788(int argument, int argument_0_,
				 int argument_1_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_0_][argument_1_]);
	if (class148 != null) {
	    Class191
		.method2886(((Class148) class148).aClass104_Sub2_Sub4_1134);
	    if (((Class148) class148).aClass104_Sub2_Sub4_1134 != null)
		((Class148) class148).aClass104_Sub2_Sub4_1134 = null;
	}
    }
    
    static final void method2789(int argument) {
	for (int anLocalInt = 0; Node_Sub32_Sub4.anInt6088 > anLocalInt;
	     anLocalInt++)
	    Node_Sub47_Sub5.aClass48Array6171[anLocalInt] = null;
	Node_Sub32_Sub4.anInt6088 = 0;
	for (int anLocalInt = 0; LightingManager.yMapSize > anLocalInt;
	     anLocalInt++) {
	    for (int anLocalInt_2_ = 0; LightingManager.xMapSize > anLocalInt_2_;
		 anLocalInt_2_++) {
		for (int anLocalInt_3_ = 0;
		     anLocalInt_3_ < LightingManager.zMapSize;
		     anLocalInt_3_++) {
		    Class148 class148
			= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			   [anLocalInt][anLocalInt_3_][anLocalInt_2_]);
		    if (class148 != null) {
			if (((Class148) class148).aShort1125 > 0)
			    ((Class148) class148).aShort1125 *= -1;
			if (((Class148) class148).aShort1130 > 0)
			    ((Class148) class148).aShort1130 *= -1;
		    }
		}
	    }
	}
	for (int anLocalInt = 0; anLocalInt < LightingManager.yMapSize;
	     anLocalInt++) {
	    for (int anLocalInt_4_ = 0; anLocalInt_4_ < LightingManager.xMapSize;
		 anLocalInt_4_++) {
		for (int anLocalInt_5_ = 0;
		     anLocalInt_5_ < LightingManager.zMapSize;
		     anLocalInt_5_++) {
		    Class148 class148
			= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			   [anLocalInt][anLocalInt_5_][anLocalInt_4_]);
		    if (class148 != null) {
			boolean anLocalBoolean
			    = ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
				[anLocalInt_5_][anLocalInt_4_]) != null
			       && (((Class148)
				    (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				     [0][anLocalInt_5_][anLocalInt_4_]))
				   .aClass148_1135) != null);
			if (((Class148) class148).aShort1125 < 0) {
			    int anLocalInt_6_ = anLocalInt_4_;
			    int anLocalInt_7_ = anLocalInt_4_;
			    int anLocalInt_8_ = anLocalInt;
			    int anLocalInt_9_ = anLocalInt;
			    Class148 class148_10_
				= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				   [anLocalInt][anLocalInt_5_]
				   [anLocalInt_6_ - 1]);
			    int anLocalInt_11_;
			    for (anLocalInt_11_
				     = (Statics.aClass_sArray2713
					    [anLocalInt].method3534
					(anLocalInt_5_, false, anLocalInt_4_));
				 (anLocalInt_6_ > 0 && class148_10_ != null
				  && ((Class148) class148_10_).aShort1125 < 0
				  && (((Class148) class148).aShort1125
				      == ((Class148) class148_10_).aShort1125)
				  && (((Class148) class148).aShort1127
				      == ((Class148) class148_10_).aShort1127)
				  && (Statics.aClass_sArray2713
					  [anLocalInt].method3534
				      (anLocalInt_5_, false,
				       anLocalInt_6_ - 1)) == anLocalInt_11_);
				 class148_10_ = (GraphicsToolkit_Sub2
						 .aClass148ArrayArrayArray4676
						 [anLocalInt][anLocalInt_5_]
						 [anLocalInt_6_ - 1])) {
				if (anLocalInt_6_ - 1 > 0
				    && (Statics.aClass_sArray2713
					    [anLocalInt].method3534
					(anLocalInt_5_, false,
					 anLocalInt_6_ - 2)) != anLocalInt_11_)
				    break;
				anLocalInt_6_--;
			    }
			    for (class148_10_ = (GraphicsToolkit_Sub2
						 .aClass148ArrayArrayArray4676
						 [anLocalInt][anLocalInt_5_]
						 [anLocalInt_7_ + 1]);
				 (anLocalInt_7_ < LightingManager.zMapSize
				  && class148_10_ != null
				  && ((Class148) class148_10_).aShort1125 < 0
				  && (((Class148) class148).aShort1125
				      == ((Class148) class148_10_).aShort1125)
				  && (((Class148) class148).aShort1127
				      == ((Class148) class148_10_).aShort1127)
				  && (Statics.aClass_sArray2713
					  [anLocalInt].method3534
				      (anLocalInt_5_, false,
				       anLocalInt_7_ + 1)) == anLocalInt_11_);
				 class148_10_ = (GraphicsToolkit_Sub2
						 .aClass148ArrayArrayArray4676
						 [anLocalInt][anLocalInt_5_]
						 [anLocalInt_7_ + 1])) {
				if ((anLocalInt_7_ + 1
				     < LightingManager.zMapSize)
				    && (Statics.aClass_sArray2713
					    [anLocalInt].method3534
					(anLocalInt_5_, false,
					 anLocalInt_7_ + 2)) != anLocalInt_11_)
				    break;
				anLocalInt_7_++;
			    }
			    int anLocalInt_12_
				= anLocalInt_9_ - anLocalInt_8_ + 1;
			    int anLocalInt_13_
				= (Statics.aClass_sArray2713
				       [(anLocalBoolean ? anLocalInt_8_ + 1
					 : anLocalInt_8_)]
				       .method3534
				   (anLocalInt_5_, false, anLocalInt_6_));
			    int anLocalInt_14_
				= ((((Class148) class148).aShort1125
				    * anLocalInt_12_)
				   + anLocalInt_13_);
			    int anLocalInt_15_
				= (Statics.aClass_sArray2713
				       [(!anLocalBoolean ? anLocalInt_8_
					 : anLocalInt_8_ + 1)]
				       .method3534
				   (anLocalInt_5_, false, anLocalInt_7_ + 1));
			    int anLocalInt_16_
				= ((anLocalInt_12_
				    * ((Class148) class148).aShort1125)
				   + anLocalInt_15_);
			    int anLocalInt_17_
				= anLocalInt_5_ << LightingManager.lightCoordRShift;
			    int anLocalInt_18_
				= anLocalInt_6_ << LightingManager.lightCoordRShift;
			    int anLocalInt_19_
				= ((anLocalInt_7_ << LightingManager.lightCoordRShift)
				   + Class110.anInt909);
			    Node_Sub47_Sub5.aClass48Array6171
				[Node_Sub32_Sub4.anInt6088++]
				= new Class48(1, anLocalInt_9_,
					      (anLocalInt_17_
					       + (((Class148) class148)
						  .aShort1127)),
					      (((Class148) class148).aShort1127
					       + anLocalInt_17_),
					      (((Class148) class148).aShort1127
					       + anLocalInt_17_),
					      (((Class148) class148).aShort1127
					       + anLocalInt_17_),
					      anLocalInt_13_, anLocalInt_15_,
					      anLocalInt_16_, anLocalInt_14_,
					      anLocalInt_18_, anLocalInt_19_,
					      anLocalInt_19_, anLocalInt_18_);
			    for (int anLocalInt_20_ = anLocalInt_8_;
				 anLocalInt_20_ <= anLocalInt_9_;
				 anLocalInt_20_++) {
				for (int anLocalInt_21_ = anLocalInt_6_;
				     anLocalInt_7_ >= anLocalInt_21_;
				     anLocalInt_21_++)
				    ((Class148) (GraphicsToolkit_Sub2
						 .aClass148ArrayArrayArray4676
						 [anLocalInt_20_]
						 [anLocalInt_5_]
						 [anLocalInt_21_])).aShort1125
					*= -1;
			    }
			}
			if (((Class148) class148).aShort1130 < 0) {
			    int anLocalInt_22_ = anLocalInt_5_;
			    int anLocalInt_23_ = anLocalInt_5_;
			    int anLocalInt_24_ = anLocalInt;
			    int anLocalInt_25_ = anLocalInt;
			    Class148 class148_26_
				= (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
				   [anLocalInt][anLocalInt_22_ - 1]
				   [anLocalInt_4_]);
			    int anLocalInt_27_;
			    for (anLocalInt_27_
				     = (Statics.aClass_sArray2713
					    [anLocalInt].method3534
					(anLocalInt_5_, false, anLocalInt_4_));
				 (anLocalInt_22_ > 0 && class148_26_ != null
				  && ((Class148) class148_26_).aShort1130 < 0
				  && (((Class148) class148).aShort1130
				      == ((Class148) class148_26_).aShort1130)
				  && (((Class148) class148).aShort1133
				      == ((Class148) class148_26_).aShort1133)
				  && (Statics.aClass_sArray2713
					  [anLocalInt].method3534
				      (anLocalInt_22_ - 1, false,
				       anLocalInt_4_)) == anLocalInt_27_);
				 class148_26_
				     = (GraphicsToolkit_Sub2
					.aClass148ArrayArrayArray4676
					[anLocalInt][anLocalInt_22_ - 1]
					[anLocalInt_4_])) {
				if (anLocalInt_22_ - 1 > 0
				    && (Statics.aClass_sArray2713
					    [anLocalInt].method3534
					(anLocalInt_22_ - 2, false,
					 anLocalInt_4_)) != anLocalInt_27_)
				    break;
				anLocalInt_22_--;
			    }
			    for (class148_26_
				     = (GraphicsToolkit_Sub2
					.aClass148ArrayArrayArray4676
					[anLocalInt][anLocalInt_23_ + 1]
					[anLocalInt_4_]);
				 (LightingManager.xMapSize > anLocalInt_23_
				  && class148_26_ != null
				  && ((Class148) class148_26_).aShort1130 < 0
				  && (((Class148) class148).aShort1130
				      == ((Class148) class148_26_).aShort1130)
				  && (((Class148) class148_26_).aShort1133
				      == ((Class148) class148).aShort1133)
				  && (Statics.aClass_sArray2713
					  [anLocalInt].method3534
				      (anLocalInt_23_ + 1, false,
				       anLocalInt_4_)) == anLocalInt_27_);
				 class148_26_
				     = (GraphicsToolkit_Sub2
					.aClass148ArrayArrayArray4676
					[anLocalInt][anLocalInt_23_ + 1]
					[anLocalInt_4_])) {
				if (LightingManager.xMapSize > anLocalInt_23_ + 1
				    && (anLocalInt_27_
					!= (Statics.aClass_sArray2713
						[anLocalInt].method3534
					    (anLocalInt_23_ + 2, false,
					     anLocalInt_4_))))
				    break;
				anLocalInt_23_++;
			    }
			    int anLocalInt_28_
				= anLocalInt_25_ - anLocalInt_24_ + 1;
			    int anLocalInt_29_
				= (Statics.aClass_sArray2713
				       [(anLocalBoolean ? anLocalInt_24_ + 1
					 : anLocalInt_24_)]
				       .method3534
				   (anLocalInt_22_, false, anLocalInt_4_));
			    int anLocalInt_30_
				= (anLocalInt_29_
				   + (anLocalInt_28_
				      * ((Class148) class148).aShort1130));
			    int anLocalInt_31_
				= (Statics.aClass_sArray2713
				       [(anLocalBoolean ? anLocalInt_24_ + 1
					 : anLocalInt_24_)]
				       .method3534
				   (anLocalInt_23_ + 1, false, anLocalInt_4_));
			    int anLocalInt_32_
				= ((((Class148) class148).aShort1130
				    * anLocalInt_28_)
				   + anLocalInt_31_);
			    int anLocalInt_33_
				= anLocalInt_22_ << LightingManager.lightCoordRShift;
			    int anLocalInt_34_
				= (Class110.anInt909
				   + (anLocalInt_23_ << LightingManager.lightCoordRShift));
			    int anLocalInt_35_
				= anLocalInt_4_ << LightingManager.lightCoordRShift;
			    Node_Sub47_Sub5.aClass48Array6171
				[Node_Sub32_Sub4.anInt6088++]
				= new Class48(2, anLocalInt_25_,
					      anLocalInt_33_, anLocalInt_34_,
					      anLocalInt_34_, anLocalInt_33_,
					      anLocalInt_29_, anLocalInt_31_,
					      anLocalInt_32_, anLocalInt_30_,
					      (anLocalInt_35_
					       + (((Class148) class148)
						  .aShort1133)),
					      (((Class148) class148).aShort1133
					       + anLocalInt_35_),
					      (anLocalInt_35_
					       + (((Class148) class148)
						  .aShort1133)),
					      (((Class148) class148).aShort1133
					       + anLocalInt_35_));
			    for (int anLocalInt_36_ = anLocalInt_24_;
				 anLocalInt_36_ <= anLocalInt_25_;
				 anLocalInt_36_++) {
				for (int anLocalInt_37_ = anLocalInt_22_;
				     anLocalInt_23_ >= anLocalInt_37_;
				     anLocalInt_37_++)
				    ((Class148) (GraphicsToolkit_Sub2
						 .aClass148ArrayArrayArray4676
						 [anLocalInt_36_]
						 [anLocalInt_37_]
						 [anLocalInt_4_])).aShort1130
					*= -1;
			    }
			}
		    }
		}
	    }
	}
	Class133_Sub1.aBoolean5008 = true;
    }
    
    public Class176() {
	/* empty */
    }
}
