/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15
{
    static Class207 aClass207_115 = new Class207(31, -1);
    int anInt117;
    int anInt118;
    int anInt119;
    static int anInt120 = 0;
    static Class314 aClass314_121 = new Class314(true);
    
    static final void method301(int argument, int argument_0_,
				int argument_1_) {
	boolean anLocalBoolean
	    = ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0][argument_0_]
		[argument_1_]) != null
	       && (((Class148) (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[0]
				[argument_0_][argument_1_])).aClass148_1135
		   != null));
	for (int anLocalInt = argument; anLocalInt >= 0; anLocalInt--) {
	    if ((GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[anLocalInt]
		 [argument_0_][argument_1_])
		== null) {
		Class148 class148 = (GraphicsToolkit_Sub2
					 .aClass148ArrayArrayArray4676
					 [anLocalInt][argument_0_][argument_1_]
				     = new Class148(anLocalInt));
		if (anLocalBoolean)
		    ((Class148) class148).aByte1129++;
	    }
	}
    }
    
    static final void method302(byte argument, int argument_2_,
				int argument_3_, GraphicsToolkit argument_4_) {
	if (argument_2_ >= 0 && argument_3_ >= 0 && Class41.anInt298 != 0
	    && Class385.anInt3573 != 0) {
	    int anLocalInt;
	    int anLocalInt_5_;
	    int anLocalInt_6_;
	    int anLocalInt_7_;
	    Class350 class350;
	    int anLocalInt_8_;
	    int anLocalInt_9_;
	    if (Class52.aBoolean391) {
		Class38.method398(false, (byte) -92);
		class350 = argument_4_.method2096();
		int[] anLocalInts = argument_4_.Y();
		anLocalInt_5_ = anLocalInts[1];
		anLocalInt_6_ = anLocalInts[0];
		anLocalInt = anLocalInts[2];
		anLocalInt_7_ = anLocalInts[3];
		anLocalInt_9_
		    = (Node_Sub31_Sub22.method943(false, (byte) 110)
		       + argument_2_);
		anLocalInt_8_
		    = argument_3_ + Class_aa_Sub2.method166(false, (byte) -58);
	    } else {
		argument_4_.DA(Class217.anInt1530, Node_Sub9_Sub2.anInt5769,
			       Class41.anInt298, Class385.anInt3573);
		anLocalInt = Class41.anInt298;
		anLocalInt_5_ = Node_Sub9_Sub2.anInt5769;
		anLocalInt_6_ = Class217.anInt1530;
		anLocalInt_7_ = Class385.anInt3573;
		argument_4_.setClip(DoublyLinkedNode_Sub51_Sub6.anInt6245, Class385.anInt3573, Class41.anInt298, Class373.anInt3204);
		class350 = argument_4_.method2029();
		class350.method3828(Class32.anInt213, Class86.anInt642,
				    Class387.anInt3268, Statics.anInt1748,
				    Class353_Sub9.anInt5524,
				    Node_Sub31_Sub21.anInt5929);
		anLocalInt_8_ = argument_3_;
		anLocalInt_9_ = argument_2_;
		argument_4_.method2069(class350);
	    }
	    if (anLocalInt == 0)
		anLocalInt = 1;
	    if (anLocalInt_7_ == 0)
		anLocalInt_7_ = 1;
	    DoublyLinkedNodeP2_Sub4_Sub2.method1913(true, (byte) -102);
	    if (Statics.aClass_sArray2713 != null
		&& (!Class353.aBoolean2953
		    || (Node_Sub31_Sub4.anInt5855 & 0x40) != 0)) {
		int anLocalInt_10_ = -1;
		int anLocalInt_11_ = -1;
		int anLocalInt_12_ = argument_4_.i();
		int anLocalInt_13_ = argument_4_.XA();
		int anLocalInt_14_;
		int anLocalInt_15_;
		int anLocalInt_16_;
		int anLocalInt_17_;
		if (!DoublyLinkedNodeP2_Sub3.aBoolean4523) {
		    anLocalInt_17_ = ((-anLocalInt_6_ + anLocalInt_9_)
				      * anLocalInt_13_ / anLocalInt);
		    anLocalInt_14_
			= (anLocalInt_12_ * (-anLocalInt_5_ + anLocalInt_8_)
			   / anLocalInt_7_);
		    anLocalInt_16_
			= (anLocalInt_12_ * (-anLocalInt_6_ + anLocalInt_9_)
			   / anLocalInt);
		    anLocalInt_15_ = ((-anLocalInt_5_ + anLocalInt_8_)
				      * anLocalInt_13_ / anLocalInt_7_);
		} else {
		    anLocalInt_14_ = anLocalInt_15_
			= ((anLocalInt_8_ - anLocalInt_5_) * Class390.anInt3285
			   / anLocalInt_7_);
		    anLocalInt_16_ = anLocalInt_17_
			= ((-anLocalInt_6_ + anLocalInt_9_)
			   * Class390.anInt3285 / anLocalInt);
		}
		int[] anLocalInts
		    = { anLocalInt_16_, anLocalInt_14_, anLocalInt_12_ };
		class350.method3832(anLocalInts);
		int[] anLocalInts_18_
		    = { anLocalInt_17_, anLocalInt_15_, anLocalInt_13_ };
		class350.method3832(anLocalInts_18_);
		float f = Class234.method3109(45, (float) anLocalInts_18_[1],
					      (float) anLocalInts[2],
					      (float) anLocalInts[1],
					      (float) anLocalInts_18_[2],
					      (float) anLocalInts[0], 4,
					      (float) anLocalInts_18_[0]);
		if (f > 0.0F) {
		    int anLocalInt_19_ = anLocalInts_18_[0] - anLocalInts[0];
		    int anLocalInt_20_ = anLocalInts_18_[2] - anLocalInts[2];
		    int anLocalInt_21_ = (int) ((float) anLocalInts[0]
						+ (float) anLocalInt_19_ * f);
		    int anLocalInt_22_ = (int) ((float) anLocalInt_20_ * f
						+ (float) anLocalInts[2]);
		    anLocalInt_10_
			= (anLocalInt_21_
			   + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
				  .method1830(-125) - 1
			      << 8)) >> 9;
		    anLocalInt_11_
			= (anLocalInt_22_
			   + (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
				  .method1830(-125) - 1
			      << 8)) >> 9;
		    int anLocalInt_23_
			= (((DoublyLinkedNodeP2_Sub2)
			    Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			   .lightingHL);
		    if (anLocalInt_23_ < 3
			&& ((Class303.tileSettings[1]
			     [anLocalInt_21_ >> 9][anLocalInt_22_ >> 9])
			    & 0x2) != 0)
			anLocalInt_23_++;
		}
		if (anLocalInt_10_ != -1 && anLocalInt_11_ != -1) {
		    if (Class353.aBoolean2953
			&& (Node_Sub31_Sub4.anInt5855 & 0x40) != 0) {
			RsInterface rsInterface
			    = RsInterface.getCreatedChild(Class297.anInt2472, Statics.anInt1181);
			if (rsInterface != null)
			    Class173.method2769(false, AbstractFont.aString416,
						true, -1, " ->", (byte) -101,
						true, anLocalInt_10_, 2,
						(long) (anLocalInt_11_
							| anLocalInt_10_ << 0),
						anLocalInt_11_,
						Class262.anInt2040, 0L);
			else
			    Class362.method3964(0);
		    } else {
			if (DoublyLinkedNodeP2_Sub2_Sub3.aBoolean6420)
			    Class173.method2769
				(false,
				 MultilanguageString.FACE_HERE
				     .getLocalizedString(client.language),
				 true, -1, "", (byte) -102, true,
				 anLocalInt_10_, 57,
				 (long) (anLocalInt_10_ << 0 | anLocalInt_11_),
				 anLocalInt_11_, -1, 0L);
			Class173.method2769(false, Class316.aString2615, true,
					    -1, "", (byte) -91, true,
					    anLocalInt_10_, 51,
					    (long) (anLocalInt_10_ << 0
						    | anLocalInt_11_),
					    anLocalInt_11_, Class8.anInt82,
					    0L);
		    }
		}
	    }
	    if (Class52.aBoolean391)
		RsInterface.method3232(-15443);
	    for (int anLocalInt_24_ = 0;
		 anLocalInt_24_ < (!Class52.aBoolean391 ? 1 : 2);
		 anLocalInt_24_++) {
		boolean anLocalBoolean = anLocalInt_24_ == 0;
		Class314 class314 = (!anLocalBoolean ? aClass314_121
				     : Class62_Sub20.aClass314_4431);
		int anLocalInt_25_ = argument_2_;
		int anLocalInt_26_ = argument_3_;
		if (Class52.aBoolean391) {
		    Class38.method398(anLocalBoolean, (byte) -92);
		    anLocalInt_25_
			+= Node_Sub31_Sub22.method943(anLocalBoolean,
                    (byte) 121);
		    anLocalInt_26_
			+= Class_aa_Sub2.method166(anLocalBoolean, (byte) -52);
		}
		Class366 class366 = ((Class314) class314).aClass366_2600;
		for (DoublyLinkedNodeP2_Sub10 class104_sub10
			 = (DoublyLinkedNodeP2_Sub10) class366.method3986(0);
		     class104_sub10 != null;
		     class104_sub10
			 = (DoublyLinkedNodeP2_Sub10) class366.method3992((byte) -95)) {
		    if ((Class360.aBoolean3045
			 || (((DoublyLinkedNodeP2_Sub2)
			      (((DoublyLinkedNodeP2_Sub10) class104_sub10)
			       .aClass104_Sub2_4596)).lightingHL
			     == (((DoublyLinkedNodeP2_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .lightingHL)))
			&& class104_sub10.method1943(anLocalInt_25_, 5,
						     anLocalInt_26_,
						     argument_4_)) {
			boolean anLocalBoolean_27_ = false;
			boolean anLocalBoolean_28_ = false;
			int anLocalInt_29_;
			int anLocalInt_30_;
			if (!((((DoublyLinkedNodeP2_Sub10) class104_sub10)
			       .aClass104_Sub2_4596)
			      instanceof DoublyLinkedNodeP2_Sub2_Sub2)) {
			    anLocalInt_29_
				= ((DoublyLinkedNodeP2_Sub2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596)).worldX >> 9;
			    anLocalInt_30_
				= ((DoublyLinkedNodeP2_Sub2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596)).worldZ >> 9;
			} else {
			    anLocalInt_29_
				= ((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596)).left;
			    anLocalInt_30_
				= ((DoublyLinkedNodeP2_Sub2_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596)).bottom;
			}
			if ((((DoublyLinkedNodeP2_Sub10) class104_sub10)
			     .aClass104_Sub2_4596)
			    instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
				= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596));
			    int anLocalInt_31_ = class104_sub2_sub2_sub5_sub2
						     .method1830(-128);
			    if (((anLocalInt_31_ & 0x1) == 0
				 && (((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldX
				     & 0x1ff) == 0
				 && (((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldZ
				     & 0x1ff) == 0)
				|| ((anLocalInt_31_ & 0x1) == 1
				    && ((((DoublyLinkedNodeP2_Sub2)
					  class104_sub2_sub2_sub5_sub2)
					 .worldX)
					& 0x1ff) == 256
				    && ((((DoublyLinkedNodeP2_Sub2)
					  class104_sub2_sub2_sub5_sub2)
					 .worldZ)
					& 0x1ff) == 256)) {
				int anLocalInt_32_
				    = (((DoublyLinkedNodeP2_Sub2)
					class104_sub2_sub2_sub5_sub2).worldX
				       - (class104_sub2_sub2_sub5_sub2
					      .method1830(-128) - 1
					  << 8));
				int anLocalInt_33_
				    = (((DoublyLinkedNodeP2_Sub2)
					class104_sub2_sub2_sub5_sub2).worldZ
				       - (class104_sub2_sub2_sub5_sub2
					      .method1830(-128) - 1
					  << 8));
				for (int anLocalInt_34_ = 0;
				     (anLocalInt_34_
				      < dba_sub_772_Sub2.anInt6369);
				     anLocalInt_34_++) {
				    Node_Sub35 class59_sub35
					= ((Node_Sub35)
					   (Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_34_]))));
				    if (class59_sub35 != null) {
					DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
					    = (((Node_Sub35) class59_sub35)
					       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
					if ((((Entity)
					      class104_sub2_sub2_sub5_sub1)
					     .anInt6729) != Class333.anInt2720
					    && (((Entity)
						 class104_sub2_sub2_sub5_sub1)
						.aBoolean6751)) {
					    int anLocalInt_35_
						= (-((((Class291)
						       (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							 class104_sub2_sub2_sub5_sub1)
							.aClass291_6832))
						      .anInt2344) - 1
						     << 8)
						   + (((DoublyLinkedNodeP2_Sub2)
						       class104_sub2_sub2_sub5_sub1)
						      .worldX));
					    int anLocalInt_36_
						= (-((((Class291)
						       (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							 class104_sub2_sub2_sub5_sub1)
							.aClass291_6832))
						      .anInt2344) - 1
						     << 8)
						   + (((DoublyLinkedNodeP2_Sub2)
						       class104_sub2_sub2_sub5_sub1)
						      .worldZ));
					    if ((anLocalInt_35_
						 >= anLocalInt_32_)
						&& (((Class291)
						     (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
						       class104_sub2_sub2_sub5_sub1)
						      .aClass291_6832)).anInt2344
						    <= (-((anLocalInt_35_
							   - anLocalInt_32_)
							  >> 9)
							+ (class104_sub2_sub2_sub5_sub2
							       .method1830
							   (-126))))
						&& (anLocalInt_33_
						    <= anLocalInt_36_)
						&& (((Class291)
						     (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
						       class104_sub2_sub2_sub5_sub1)
						      .aClass291_6832)).anInt2344
						    <= (-((-anLocalInt_33_
							   + anLocalInt_36_)
							  >> 9)
							+ (class104_sub2_sub2_sub5_sub2
							       .method1830
							   (-125))))) {
						Node_Sub31_Sub1.method880
                                (((((DoublyLinkedNodeP2_Sub2)
                                        (((DoublyLinkedNodeP2_Sub10)
                                                class104_sub10)
                                                .aClass104_Sub2_4596))
                                        .lightingHL)
                                        != (((DoublyLinkedNodeP2_Sub2)
                                        (Class308
                                                .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
                                        .lightingHL)),
                                        class104_sub2_sub2_sub5_sub1,
                                        (byte) 16);
						((Entity)
						 class104_sub2_sub2_sub5_sub1)
						    .anInt6729
						    = Class333.anInt2720;
					    }
					}
				    }
				}
				int anLocalInt_37_ = Class224.anInt1578;
				int[] anLocalInts = Class242.anIntArray1769;
				for (int anLocalInt_38_ = 0;
				     anLocalInt_38_ < anLocalInt_37_;
				     anLocalInt_38_++) {
				    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2_39_
					= (Class345
					   .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
					   [anLocalInts[anLocalInt_38_]]);
				    if ((class104_sub2_sub2_sub5_sub2_39_
					 != null)
					&& (((Entity)
					     class104_sub2_sub2_sub5_sub2_39_)
					    .anInt6729) != Class333.anInt2720
					&& (class104_sub2_sub2_sub5_sub2
					    != class104_sub2_sub2_sub5_sub2_39_)
					&& (((Entity)
					     class104_sub2_sub2_sub5_sub2_39_)
					    .aBoolean6751)) {
					int anLocalInt_40_
					    = ((((DoublyLinkedNodeP2_Sub2)
						 class104_sub2_sub2_sub5_sub2_39_)
						.worldX)
					       - (class104_sub2_sub2_sub5_sub2_39_
						      .method1830(-125) - 1
						  << 8));
					int anLocalInt_41_
					    = ((((DoublyLinkedNodeP2_Sub2)
						 class104_sub2_sub2_sub5_sub2_39_)
						.worldZ)
					       - (class104_sub2_sub2_sub5_sub2_39_
						      .method1830(-126) - 1
						  << 8));
					if (anLocalInt_32_ <= anLocalInt_40_
					    && (class104_sub2_sub2_sub5_sub2_39_
						    .method1830(-126)
						<= (class104_sub2_sub2_sub5_sub2
							.method1830(-126)
						    - ((anLocalInt_40_
							- anLocalInt_32_)
						       >> 9)))
					    && anLocalInt_33_ <= anLocalInt_41_
					    && (class104_sub2_sub2_sub5_sub2_39_
						    .method1830(-126)
						<= (-((-anLocalInt_33_
						       + anLocalInt_41_)
						      >> 9)
						    + class104_sub2_sub2_sub5_sub2
							  .method1830(-125)))) {
					    Skybox_Sub2_Sub1.method1514((byte) 77, class104_sub2_sub2_sub5_sub2_39_, ((((DoublyLinkedNodeP2_Sub2) (((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub2_4596)).lightingHL) != (((DoublyLinkedNodeP2_Sub2) (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)).lightingHL)));
					    ((Entity)
					     class104_sub2_sub2_sub5_sub2_39_)
						.anInt6729
						= Class333.anInt2720;
					}
				    }
				}
			    }
			    if (((Entity)
				 class104_sub2_sub2_sub5_sub2).anInt6729
				== Class333.anInt2720)
				continue;
			    Skybox_Sub2_Sub1.method1514((byte) 77, class104_sub2_sub2_sub5_sub2, (((DoublyLinkedNodeP2_Sub2) (((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub2_4596)).lightingHL != (((DoublyLinkedNodeP2_Sub2) (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)).lightingHL)));
			    ((Entity)
			     class104_sub2_sub2_sub5_sub2).anInt6729
				= Class333.anInt2720;
			}
			if ((((DoublyLinkedNodeP2_Sub10) class104_sub10)
			     .aClass104_Sub2_4596)
			    instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596));
			    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				 class104_sub2_sub2_sub5_sub1).aClass291_6832
				!= null) {
				if (((((Class291)
				       (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					 class104_sub2_sub2_sub5_sub1)
					.aClass291_6832)).anInt2344
				      & 0x1) == 0
				     && ((((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub1)
					  .worldX)
					 & 0x1ff) == 0
				     && ((((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub1)
					  .worldZ)
					 & 0x1ff) == 0)
				    || ((((Class291)
					  (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					    class104_sub2_sub2_sub5_sub1)
					   .aClass291_6832)).anInt2344
					 & 0x1) == 1
					&& ((((DoublyLinkedNodeP2_Sub2)
					      class104_sub2_sub2_sub5_sub1)
					     .worldX)
					    & 0x1ff) == 256
					&& ((((DoublyLinkedNodeP2_Sub2)
					      class104_sub2_sub2_sub5_sub1)
					     .worldZ)
					    & 0x1ff) == 256)) {
				    int anLocalInt_42_
					= ((((DoublyLinkedNodeP2_Sub2)
					     class104_sub2_sub2_sub5_sub1)
					    .worldX)
					   - (((Class291)
					       (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
						 class104_sub2_sub2_sub5_sub1)
						.aClass291_6832)).anInt2344 - 1
					      << 8));
				    int anLocalInt_43_
					= (-(((Class291)
					      (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
						class104_sub2_sub2_sub5_sub1)
					       .aClass291_6832)).anInt2344 - 1
					     << 8)
					   + (((DoublyLinkedNodeP2_Sub2)
					       class104_sub2_sub2_sub5_sub1)
					      .worldZ));
				    for (int anLocalInt_44_ = 0;
					 (anLocalInt_44_
					  < dba_sub_772_Sub2.anInt6369);
					 anLocalInt_44_++) {
					Node_Sub35 class59_sub35
					    = ((Node_Sub35)
					       (Class294.aJagexHashMap_2453
						    .get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_44_]))));
					if (class59_sub35 != null) {
					    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1_45_
						= (((Node_Sub35)
						    class59_sub35)
						   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
					    if ((Class333.anInt2720
						 != (((Entity)
						      class104_sub2_sub2_sub5_sub1_45_)
						     .anInt6729))
						&& (class104_sub2_sub2_sub5_sub1
						    != class104_sub2_sub2_sub5_sub1_45_)
						&& (((Entity)
						     class104_sub2_sub2_sub5_sub1_45_)
						    .aBoolean6751)) {
						int anLocalInt_46_
						    = (-((((Class291)
							   (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							     class104_sub2_sub2_sub5_sub1_45_)
							    .aClass291_6832))
							  .anInt2344) - 1
							 << 8)
						       + (((DoublyLinkedNodeP2_Sub2)
							   class104_sub2_sub2_sub5_sub1_45_)
							  .worldX));
						int anLocalInt_47_
						    = (-((((Class291)
							   (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							     class104_sub2_sub2_sub5_sub1_45_)
							    .aClass291_6832))
							  .anInt2344) - 1
							 << 8)
						       + (((DoublyLinkedNodeP2_Sub2)
							   class104_sub2_sub2_sub5_sub1_45_)
							  .worldZ));
						if ((anLocalInt_46_
						     >= anLocalInt_42_)
						    && ((((Class291)
							  (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							    class104_sub2_sub2_sub5_sub1_45_)
							   .aClass291_6832))
							 .anInt2344)
							<= (-((-anLocalInt_42_
							       + anLocalInt_46_)
							      >> 9)
							    + (((Class291)
								(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
								  class104_sub2_sub2_sub5_sub1)
								 .aClass291_6832))
							       .anInt2344)))
						    && (anLocalInt_47_
							>= anLocalInt_43_)
						    && ((((Class291)
							  (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							    class104_sub2_sub2_sub5_sub1_45_)
							   .aClass291_6832))
							 .anInt2344)
							<= ((((Class291)
							      (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
								class104_sub2_sub2_sub5_sub1)
							       .aClass291_6832))
							     .anInt2344)
							    - ((anLocalInt_47_
								- anLocalInt_43_)
							       >> 9)))) {
						    Node_Sub31_Sub1
							.method880
                                    (((((DoublyLinkedNodeP2_Sub2)
                                            (Class308
                                                    .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
                                            .lightingHL)
                                            != (((DoublyLinkedNodeP2_Sub2)
                                            (((DoublyLinkedNodeP2_Sub10)
                                                    class104_sub10)
                                                    .aClass104_Sub2_4596))
                                            .lightingHL)),
                                            class104_sub2_sub2_sub5_sub1_45_,
                                            (byte) 16);
						    ((Entity)
						     class104_sub2_sub2_sub5_sub1_45_)
							.anInt6729
							= Class333.anInt2720;
						}
					    }
					}
				    }
				    int anLocalInt_48_ = Class224.anInt1578;
				    int[] anLocalInts
					= Class242.anIntArray1769;
				    for (int anLocalInt_49_ = 0;
					 anLocalInt_48_ > anLocalInt_49_;
					 anLocalInt_49_++) {
					DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
					    = (Class345
					       .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
					       [anLocalInts[anLocalInt_49_]]);
					if ((class104_sub2_sub2_sub5_sub2
					     != null)
					    && (Class333.anInt2720
						!= (((Entity)
						     class104_sub2_sub2_sub5_sub2)
						    .anInt6729))
					    && (((Entity)
						 class104_sub2_sub2_sub5_sub2)
						.aBoolean6751)) {
					    int anLocalInt_50_
						= ((((DoublyLinkedNodeP2_Sub2)
						     class104_sub2_sub2_sub5_sub2)
						    .worldX)
						   - (class104_sub2_sub2_sub5_sub2
							  .method1830(-125) - 1
						      << 8));
					    int anLocalInt_51_
						= ((((DoublyLinkedNodeP2_Sub2)
						     class104_sub2_sub2_sub5_sub2)
						    .worldZ)
						   - (class104_sub2_sub2_sub5_sub2
							  .method1830(-128) - 1
						      << 8));
					    if ((anLocalInt_50_
						 >= anLocalInt_42_)
						&& (class104_sub2_sub2_sub5_sub2
							.method1830(-125)
						    <= (-((anLocalInt_50_
							   - anLocalInt_42_)
							  >> 9)
							+ (((Class291)
							    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							      class104_sub2_sub2_sub5_sub1)
							     .aClass291_6832))
							   .anInt2344)))
						&& (anLocalInt_43_
						    <= anLocalInt_51_)
						&& (class104_sub2_sub2_sub5_sub2
							.method1830(-126)
						    <= (-((-anLocalInt_43_
							   + anLocalInt_51_)
							  >> 9)
							+ (((Class291)
							    (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
							      class104_sub2_sub2_sub5_sub1)
							     .aClass291_6832))
							   .anInt2344)))) {
						Skybox_Sub2_Sub1.method1514((byte) 77, class104_sub2_sub2_sub5_sub2, ((((DoublyLinkedNodeP2_Sub2) (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)).lightingHL) != (((DoublyLinkedNodeP2_Sub2) (((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub2_4596)).lightingHL)));
						((Entity)
						 class104_sub2_sub2_sub5_sub2)
						    .anInt6729
						    = Class333.anInt2720;
					    }
					}
				    }
				}
				if (Class333.anInt2720
				    == (((Entity)
					 class104_sub2_sub2_sub5_sub1)
					.anInt6729))
				    continue;
				Node_Sub31_Sub1.method880
                        ((((DoublyLinkedNodeP2_Sub2)
                                (((DoublyLinkedNodeP2_Sub10) class104_sub10)
                                        .aClass104_Sub2_4596)).lightingHL
                                != (((DoublyLinkedNodeP2_Sub2)
                                (Class308
                                        .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
                                .lightingHL)),
                                class104_sub2_sub2_sub5_sub1, (byte) 16);
				((Entity)
				 class104_sub2_sub2_sub5_sub1).anInt6729
				    = Class333.anInt2720;
			    }
			}
			if ((((DoublyLinkedNodeP2_Sub10) class104_sub10)
			     .aClass104_Sub2_4596)
			    instanceof DoublyLinkedNodeP2_Sub2_Sub5_Sub1) {
			    int anLocalInt_52_
				= anLocalInt_29_ + MapRelated.baseX;
			    int anLocalInt_53_
				= anLocalInt_30_ + MapRelated.baseZ;
			    Node_Sub15 class59_sub15
				= ((Node_Sub15)
				   (tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.get((long) (anLocalInt_52_ | (anLocalInt_53_ << 14 | (((DoublyLinkedNodeP2_Sub2) (((DoublyLinkedNodeP2_Sub10) class104_sub10).aClass104_Sub2_4596)).lightingHL) << 28)))));
			    if (class59_sub15 != null) {
				int anLocalInt_54_ = 0;
				for (Node_Sub10 class59_sub10
					 = ((Node_Sub10)
					    ((Node_Sub15) class59_sub15)
						.aCyclicLinkedList_3993
						.getEnd());
				     class59_sub10 != null;
				     class59_sub10
					 = ((Node_Sub10)
					    ((Node_Sub15) class59_sub15)
						.aCyclicLinkedList_3993
						.get())) {
				    Class371 class371
					= (Class253_Sub1_Sub1
					       .aClass365_6632.method3975
					   (121,
					    (((Node_Sub10) class59_sub10)
					     .anInt3934)));
				    if (Class353.aBoolean2953
					&& ((((DoublyLinkedNodeP2_Sub2)
					      (Class308
					       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					     .lightingHL)
					    == (((DoublyLinkedNodeP2_Sub2)
						 (((DoublyLinkedNodeP2_Sub10)
						   class104_sub10)
						  .aClass104_Sub2_4596))
						.lightingHL))) {
					Class315 class315
					    = (Class178.anInt1311 == -1 ? null
					       : (Class62_Sub27
						      .aClass362_4457
						      .method3960
						  (true, Class178.anInt1311)));
					if ((Node_Sub31_Sub4.anInt5855
					     & 0x1) != 0
					    && (class315 == null
						|| ((class371.method4053
						     ((((Class315) class315)
						       .anInt2607),
						      Class178.anInt1311, -1))
						    != (((Class315) class315)
							.anInt2607))))
					    Class173.method2769
						(false, AbstractFont.aString416,
						 false, -1,
						 (Statics.aString6376
						  + " -> <col=ff9040>"
						  + (((Class371) class371)
						     .aString3160)),
						 (byte) -90, true,
						 anLocalInt_29_, 10,
						 (long) anLocalInt_54_,
						 anLocalInt_30_,
						 Class262.anInt2040,
						 (long) (((Node_Sub10)
							  class59_sub10)
							 .anInt3934));
				    }
				    if ((((DoublyLinkedNodeP2_Sub2)
					  (Class308
					   .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					 .lightingHL)
					== (((DoublyLinkedNodeP2_Sub2)
					     (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					      .aClass104_Sub2_4596))
					    .lightingHL)) {
					String[] strings
					    = (((Class371) class371)
					       .aStringArray3136);
					for (int anLocalInt_55_ = 4;
					     anLocalInt_55_ >= 0;
					     anLocalInt_55_--) {
					    if (strings != null
						&& (strings[anLocalInt_55_]
						    != null)) {
						int anLocalInt_56_ = 0;
						int anLocalInt_57_
						    = Class133_Sub2.anInt5017;
						if (anLocalInt_55_ == 0)
						    anLocalInt_56_ = 44;
						if (anLocalInt_55_ == 1)
						    anLocalInt_56_ = 3;
						if (anLocalInt_55_ == 2)
						    anLocalInt_56_ = 46;
						if (anLocalInt_55_ == 3)
						    anLocalInt_56_ = 48;
						if (anLocalInt_55_ == 4)
						    anLocalInt_56_ = 53;
						if ((((Class371) class371)
						     .anInt3127)
						    == anLocalInt_55_)
						    anLocalInt_57_
							= ((Class371)
							   class371).anInt3137;
						if ((((Class371) class371)
						     .anInt3186)
						    == anLocalInt_55_)
						    anLocalInt_57_
							= ((Class371)
							   class371).anInt3185;
						Class173.method2769
						    (false,
						     strings[anLocalInt_55_],
						     false, -1,
						     ("<col=ff9040>"
						      + (((Class371) class371)
							 .aString3160)),
						     (byte) 125, true,
						     anLocalInt_29_,
						     anLocalInt_56_,
						     (long) anLocalInt_54_,
						     anLocalInt_30_,
						     anLocalInt_57_,
						     (long) (((Node_Sub10)
							      class59_sub10)
							     .anInt3934));
					    }
					}
				    }
				    Class173.method2769
					((((DoublyLinkedNodeP2_Sub2)
					   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					    .aClass104_Sub2_4596)).lightingHL
					  != (((DoublyLinkedNodeP2_Sub2)
					       (Class308
						.aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					      .lightingHL)),
					 (MultilanguageString.EXAMINE.getLocalizedString
                             (client.language)),
					 false, -1,
					 ("<col=ff9040>"
					  + ((Class371) class371).aString3160),
					 (byte) 58, true, anLocalInt_29_, 1003,
					 (long) anLocalInt_54_, anLocalInt_30_,
					 DoublyLinkedNode_Sub51_Sub3.anInt6235,
					 (long) ((Node_Sub10)
						 class59_sub10).anInt3934);
				    anLocalInt_54_++;
				}
			    }
			}
			if ((((DoublyLinkedNodeP2_Sub10) class104_sub10)
			     .aClass104_Sub2_4596)
			    instanceof Interface2) {
			    Interface2 interface2
				= ((Interface2)
				   (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				    .aClass104_Sub2_4596));
			    Class266 class266
				= (Node_Sub31_Sub30.aClass257_5983
				       .method3298
				   ((byte) 48, interface2.method7(-23356)));
			    if (((Class266) class266).anIntArray2067 != null)
				class266 = (class266.method3345
					    (1, (ClientVariables
						 .instance)));
			    if (class266 != null) {
				if (Class353.aBoolean2953
				    && (((DoublyLinkedNodeP2_Sub2)
					 (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					  .aClass104_Sub2_4596)).lightingHL
					== (((DoublyLinkedNodeP2_Sub2)
					     (Class308
					      .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					    .lightingHL))) {
				    Class315 class315
					= (Class178.anInt1311 == -1 ? null
					   : (Class62_Sub27.aClass362_4457
						  .method3960
					      (true, Class178.anInt1311)));
				    if (((Node_Sub31_Sub4.anInt5855 & 0x4)
					 != 0)
					&& (class315 == null
					    || ((class266.method3335
						 (Class178.anInt1311,
						  1312515360,
						  (((Class315) class315)
						   .anInt2607)))
						!= (((Class315) class315)
						    .anInt2607))))
					Class173.method2769
					    (false, AbstractFont.aString416, false,
					     -1,
					     (Statics.aString6376
					      + " -> <col=00ffff>"
					      + (((Class266) class266)
						 .aString2129)),
					     (byte) -74, true, anLocalInt_29_,
					     22, (long) interface2.hashCode(),
					     anLocalInt_30_,
					     Class262.anInt2040,
					     (Class46.method434
					      (0, interface2, anLocalInt_29_,
					       anLocalInt_30_)));
				}
				if (((DoublyLinkedNodeP2_Sub2)
				     (((DoublyLinkedNodeP2_Sub10) class104_sub10)
				      .aClass104_Sub2_4596)).lightingHL
				    == (((DoublyLinkedNodeP2_Sub2)
					 (Class308
					  .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					.lightingHL)) {
				    String[] strings = (((Class266) class266)
							.aStringArray2096);
				    if (strings != null) {
					for (int anLocalInt_58_ = 4;
					     anLocalInt_58_ >= 0;
					     anLocalInt_58_--) {
					    if (strings[anLocalInt_58_]
						!= null) {
						int anLocalInt_59_ = 0;
						int anLocalInt_60_
						    = Class133_Sub2.anInt5017;
						if (anLocalInt_58_ == 0)
						    anLocalInt_59_ = 13;
						if (anLocalInt_58_ == 1)
						    anLocalInt_59_ = 58;
						if (anLocalInt_58_ == 2)
						    anLocalInt_59_ = 23;
						if (anLocalInt_58_ == 3)
						    anLocalInt_59_ = 17;
						if (anLocalInt_58_ == 4)
						    anLocalInt_59_ = 1012;
						if (anLocalInt_58_
						    == (((Class266) class266)
							.anInt2099))
						    anLocalInt_60_
							= ((Class266)
							   class266).anInt2118;
						if (anLocalInt_58_
						    == (((Class266) class266)
							.anInt2076))
						    anLocalInt_60_
							= ((Class266)
							   class266).anInt2086;
						Class173.method2769
						    (false,
						     strings[anLocalInt_58_],
						     false, -1,
						     ("<col=00ffff>"
						      + (((Class266) class266)
							 .aString2129)),
						     (byte) -72, true,
						     anLocalInt_29_,
						     anLocalInt_59_,
						     (long) interface2
								.hashCode(),
						     anLocalInt_30_,
						     anLocalInt_60_,
						     (Class46.method434
						      (0, interface2,
						       anLocalInt_29_,
						       anLocalInt_30_)));
					    }
					}
				    }
				    Class173.method2769
					(((((DoublyLinkedNodeP2_Sub2)
					    (Class308
					     .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					   .lightingHL)
					  != (((DoublyLinkedNodeP2_Sub2)
					       (((DoublyLinkedNodeP2_Sub10)
						 class104_sub10)
						.aClass104_Sub2_4596))
					      .lightingHL)),
					 (MultilanguageString.EXAMINE.getLocalizedString
                             (client.language)),
					 false, -1,
					 ("<col=00ffff>"
					  + ((Class266) class266).aString2129),
					 (byte) 90, true, anLocalInt_29_, 1008,
					 (long) interface2.hashCode(),
					 anLocalInt_30_,
					 DoublyLinkedNode_Sub51_Sub3.anInt6235,
					 (long) (((Class266) class266)
						 .anInt2059));
				}
			    }
			}
		    }
		}
		if (Class52.aBoolean391)
		    RsInterface.method3232(-15443);
	    }
	    DoublyLinkedNodeP2_Sub4_Sub2.method1913(false, (byte) -102);
	}
    }
    
    public static void method303(byte argument) {
	AthmosphericConditions.aClass59_Sub50_116 = null;
	aClass207_115 = null;
	aClass314_121 = null;
    }
    
    public Class15() {
	/* empty */
    }
}
