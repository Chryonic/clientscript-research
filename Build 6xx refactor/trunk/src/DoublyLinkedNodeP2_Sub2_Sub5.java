/* Class104_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2_Sub5 extends DoublyLinkedNodeP2_Sub2
{
    static int anInt6426 = 1403;
    static Class101[] aClass101Array6427 = new Class101[4];
    
    static final int method1890(int argument, int argument_0_) {
	argument = (argument & 0x55555555) + ((argument & ~0x55555555) >>> 1);
	argument = (argument & 0x33333333) + ((argument & ~0x33333331) >>> 2);
	argument = argument + (argument >>> 4) & 0xf0f0f0f;
	argument += argument >>> 8;
	argument += argument >>> 16;
	return argument & 0xff;
    }
    
    final void method1770(int argument_1_) {
	if (argument_1_ != -13514)
	    applyLighting((byte) 39, null);
	throw new IllegalStateException();
    }
    
    final boolean method1765(int argument_2_) {
	if (argument_2_ < 103)
	    return false;
	return (Class242.aBooleanArrayArray1757
		[Node_Sub35.anInt4158 + (-Class189_Sub2.anInt5642
					    + (((DoublyLinkedNodeP2_Sub2) this).worldX
					       >> LightingManager.lightCoordRShift))]
		[Node_Sub35.anInt4158 + (-Class311.anInt2592
					    + (((DoublyLinkedNodeP2_Sub2) this).worldZ
					       >> LightingManager.lightCoordRShift))]);
    }
    
    final boolean method1782(int argument_3_) {
	if (argument_3_ != -1)
	    method1775(null, null, false, -36, 27, 114, -57);
	return false;
    }
    
    static final void method1891
	(int argument, int[] argument_4_, int argument_5_, float[] argument_6_,
	 int argument_7_, float[] argument_8_, int argument_9_,
	 int[] argument_10_, int argument_11_, int argument_12_,
	 int argument_13_, int argument_14_, int argument_15_) {
	int anLocalInt = argument_7_ * argument_12_ + argument_11_;
	int anLocalInt_16_ = argument_9_ + argument * argument_15_;
	int anLocalInt_17_ = argument_7_ - argument_13_;
	int anLocalInt_18_ = argument_15_ - argument_13_;
	if (argument_10_ == null) {
	    for (int anLocalInt_19_ = 0; anLocalInt_19_ < argument_14_;
		 anLocalInt_19_++) {
		int anLocalInt_20_ = anLocalInt + argument_13_;
		while (anLocalInt_20_ > anLocalInt)
		    argument_8_[anLocalInt_16_++] = argument_6_[anLocalInt++];
		anLocalInt_16_ += anLocalInt_18_;
		anLocalInt += anLocalInt_17_;
	    }
	} else if (argument_6_ == null) {
	    for (int anLocalInt_21_ = 0; argument_14_ > anLocalInt_21_;
		 anLocalInt_21_++) {
		int anLocalInt_22_ = argument_13_ + anLocalInt;
		while (anLocalInt < anLocalInt_22_)
		    argument_4_[anLocalInt_16_++] = argument_10_[anLocalInt++];
		anLocalInt_16_ += anLocalInt_18_;
		anLocalInt += anLocalInt_17_;
	    }
	} else {
	    for (int anLocalInt_23_ = 0; anLocalInt_23_ < argument_14_;
		 anLocalInt_23_++) {
		int anLocalInt_24_ = argument_13_ + anLocalInt;
		while (anLocalInt_24_ > anLocalInt) {
		    argument_4_[anLocalInt_16_] = argument_10_[anLocalInt];
		    argument_8_[anLocalInt_16_++] = argument_6_[anLocalInt++];
		}
		anLocalInt += anLocalInt_17_;
		anLocalInt_16_ += anLocalInt_18_;
	    }
	}
    }
    
    final boolean method1780(int argument_25_, GraphicsToolkit argument_26_) {
	if (argument_25_ != 101)
	    aClass101Array6427 = null;
	Class110 class110
	    = Class222_Sub2.method3035(((DoublyLinkedNodeP2_Sub2) this).lightingHL,
				       (((DoublyLinkedNodeP2_Sub2) this).worldX
					>> LightingManager.lightCoordRShift),
				       (((DoublyLinkedNodeP2_Sub2) this).worldZ
					>> LightingManager.lightCoordRShift));
	if (class110 == null
	    || !((DoublyLinkedNodeP2_Sub2_Sub2)
		 ((Class110) class110).aClass104_Sub2_Sub2_911).aBoolean6411)
	    return Node_Sub29.method856((((DoublyLinkedNodeP2_Sub2) this).worldX
                >> LightingManager.lightCoordRShift),
                (((DoublyLinkedNodeP2_Sub2) this).worldZ
                        >> LightingManager.lightCoordRShift),
                ((DoublyLinkedNodeP2_Sub2) this).lightingHL,
                19322);
	return (Class225.method3052
		(((Class110) class110).aClass104_Sub2_Sub2_911
		     .method1781(748449288) + this.method1781(748449288),
		 ((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift,
		 ((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift,
		 ((DoublyLinkedNodeP2_Sub2) this).lightingHL, (byte) -32));
    }
    
    public static void method1892(int argument) {
	aClass101Array6427 = null;
    }
    
    static final Class76 method1893(int argument, boolean argument_27_,
				    GraphicsToolkit argument_28_) {
	Class363 class363
	    = Node_Sub31_Sub39.method1003(argument_28_, argument_27_,
            argument, (byte) 10);
	if (class363 == null)
	    return null;
	return ((Class363) class363).aClass76_3066;
    }
    
    static final void method1894
	(int argument, int argument_29_, int argument_30_, int argument_31_,
	 int argument_32_, int argument_33_, int argument_34_) {
	int anLocalInt = Class224.anInt1578;
	int[] anLocalInts = Class242.anIntArray1769;
	Class64.anInt450 = 0;
	for (int anLocalInt_35_ = 0;
	     anLocalInt + dba_sub_772_Sub2.anInt6369 > anLocalInt_35_;
	     anLocalInt_35_++) {
	    Class291 class291 = null;
	    Entity entity;
	    if (anLocalInt_35_ >= anLocalInt) {
		entity
		    = ((Node_Sub35) (Node_Sub35)
		       (Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_35_ - anLocalInt])))).aClass104_Sub2_Sub2_Sub5_Sub1_4157;
		class291 = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
			    (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) entity).aClass291_6832;
		if (((Class291) class291).anIntArray2374 != null) {
		    class291 = class291.method3485((ClientVariables
						    .instance),
						   -1);
		    if (class291 == null)
			continue;
		}
	    } else
		entity
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [anLocalInts[anLocalInt_35_]]);
	    if ((((Entity) entity).anInt6786
		 >= 0)
		&& (Statics.anInt264 == ((Entity) entity).anInt6757
		    || (((DoublyLinkedNodeP2_Sub2) entity).lightingHL
			== (((DoublyLinkedNodeP2_Sub2)
			     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			    .lightingHL)))) {
		Class128.method2421(argument_32_ >> 1, argument_30_,
				    entity
					.method1837((byte) -126),
				    argument_34_ >> 1, entity,
				    (byte) 119, argument_33_);
		if (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] >= 0) {
		    if ((((Entity) entity)
			 .aString6733) != null
			&& (anLocalInt_35_ >= anLocalInt
			    || Class72.anInt495 == 0 || Class72.anInt495 == 3
			    || (Class72.anInt495 == 1
				&& (Statics.method355(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) entity).aString6836, (byte) -96))))
			&& Node_Sub45.anInt4261 > Class64.anInt450) {
			Node_Sub45.anIntArray4256[Class64.anInt450]
			    = (Class37.aClass76_274.method1552
			       (((Entity) entity).aString6733,
				0)) / 2;
			Node_Sub45.anIntArray4259[Class64.anInt450]
			    = DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0];
			Node_Sub45.anIntArray4267[Class64.anInt450]
			    = DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1];
			Node_Sub45.anIntArray4275[Class64.anInt450]
			    = ((Entity) entity).anInt6736;
			Node_Sub45.anIntArray4268[Class64.anInt450]
			    = ((Entity) entity).anInt6776;
			Node_Sub45.anIntArray4272[Class64.anInt450]
			    = ((Entity) entity).anInt6791;
			Node_Sub45.aStringArray4263[Class64.anInt450]
			    = ((Entity) entity).aString6733;
			Class64.anInt450++;
		    }
		    int anLocalInt_36_
			= DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1] + argument;
		    if (!(((Entity) entity)
			  .aBoolean6751)
			&& (((Entity) entity)
			    .anInt6774) > Class333.anInt2720) {
			int anLocalInt_37_ = -1;
			int anLocalInt_38_ = 1;
			if (anLocalInt > anLocalInt_35_) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
				= (Class345
				   .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
				   [anLocalInts[anLocalInt_35_]]);
			    anLocalInt_37_
				= (((Class354) entity
						   .method1831())
				   .anInt3003);
			    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				 class104_sub2_sub2_sub5_sub2)
				.aBoolean6852)
				anLocalInt_38_ = 2;
			} else {
			    anLocalInt_37_ = ((Class291) class291).anInt2348;
			    if (anLocalInt_37_ == -1)
				anLocalInt_37_
				    = (((Class354) entity
						       .method1831())
				       .anInt3003);
			}
			Class368[] class368s = Class353.aClass368Array2952;
			if (anLocalInt_37_ != -1) {
			    Class368[] class368s_39_
				= ((Class368[])
				   (Rs2DPainter.aClass149_4048.get((long) anLocalInt_37_)));
			    if (class368s_39_ == null) {
				Class83[] class83s
				    = Class83.method1608((Class205
							  .aJs5Store_1472),
							 anLocalInt_37_, 0);
				if (class83s != null) {
				    class368s_39_
					= new Class368[class83s.length];
				    for (int anLocalInt_40_ = 0;
					 class83s.length > anLocalInt_40_;
					 anLocalInt_40_++)
					class368s_39_[anLocalInt_40_]
					    = (Class389.aGraphicsToolkit3281
						   .method2033
					       (class83s[anLocalInt_40_],
						true));
				    Rs2DPainter.aClass149_4048.put(class368s_39_, (long) anLocalInt_37_);
				}
			    }
			    if (class368s_39_ != null
				&& class368s_39_.length >= 2)
				class368s = class368s_39_;
			}
			if (class368s.length <= anLocalInt_38_)
			    anLocalInt_38_ = 1;
			Class368 class368 = class368s[0];
			Class368 class368_41_ = class368s[anLocalInt_38_];
			anLocalInt_36_
			    -= Math.max((((Class76) Class37.aClass76_274)
					 .anInt520),
					class368.method4022());
			int anLocalInt_42_
			    = (argument_29_
			       + DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
			       - (class368.method4019() >> 1));
			int anLocalInt_43_
			    = (class368.method4019()
			       * ((Entity) entity).anInt6785
			       / 255);
			int anLocalInt_44_ = class368.method4022();
			if (((Entity) entity).anInt6785 > 0
			    && anLocalInt_43_ < 2)
			    anLocalInt_43_ = 2;
			class368.method4014(anLocalInt_42_, anLocalInt_36_);
			Class389.aGraphicsToolkit3281.T(anLocalInt_42_,
						 anLocalInt_36_,
						 (anLocalInt_43_
						  + anLocalInt_42_),
						 (anLocalInt_36_
						  + anLocalInt_44_));
			class368_41_.method4014(anLocalInt_42_,
						anLocalInt_36_);
			Class389.aGraphicsToolkit3281.setClip(argument_29_, argument_32_ + argument, argument_29_ + argument_34_, argument);
			Canvas_Sub1.method125((class368.getWidth()
					       + anLocalInt_42_),
					      (byte) -102,
					      anLocalInt_36_ + anLocalInt_44_,
					      anLocalInt_36_, anLocalInt_42_);
		    } else
			anLocalInt_36_
			    -= Math.max((((Class76) Class37.aClass76_274)
					 .anInt520),
					Class353.aClass368Array2952[0]
					    .method4022());
		    anLocalInt_36_ -= 2;
		    if (!((Entity) entity)
			 .aBoolean6751) {
			if (((Entity) entity).anInt6782
			    > Class333.anInt2720) {
			    Class368 class368 = (Class_aa.aClass368Array55
						 [!(((Entity) entity)
						    .aBoolean6777) ? 0 : 2]);
			    Class368 class368_45_
				= (Class_aa.aClass368Array55
				   [(((Entity) entity).aBoolean6777
				     ? 3 : 1)]);
			    int anLocalInt_46_ = -1;
			    if (!(entity
				  instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1))
				anLocalInt_46_
				    = (((Class354) entity
						       .method1831())
				       .anInt2991);
			    else {
				anLocalInt_46_
				    = ((Class291) class291).anInt2332;
				if (anLocalInt_46_ == -1)
				    anLocalInt_46_
					= (((Class354)
					    entity
						.method1831())
					   .anInt2991);
			    }
			    if (anLocalInt_46_ != -1) {
				Class368[] class368s
				    = ((Class368[])
				       (Class165.aClass149_1208.get((long) anLocalInt_46_)));
				if (class368s == null) {
				    Class83[] class83s
					= Class83.method1608((Class205
							      .aJs5Store_1472),
							     anLocalInt_46_,
							     0);
				    if (class83s != null) {
					class368s
					    = new Class368[class83s.length];
					for (int anLocalInt_47_ = 0;
					     class83s.length > anLocalInt_47_;
					     anLocalInt_47_++)
					    class368s[anLocalInt_47_]
						= (Class389.aGraphicsToolkit3281
						       .method2033
						   (class83s[anLocalInt_47_],
						    true));
					Class165.aClass149_1208.put(class368s, (long) anLocalInt_46_);
				    }
				}
				if (class368s != null
				    && class368s.length == 4) {
				    class368 = (class368s
						[!(((Entity) entity)
						   .aBoolean6777) ? 0 : 2]);
				    class368_45_
					= (class368s
					   [!(((Entity) entity)
					      .aBoolean6777) ? 1 : 3]);
				}
			    }
			    int anLocalInt_48_
				= (-Class333.anInt2720
				   + ((Entity) entity).anInt6782);
			    int anLocalInt_49_;
			    if (((Entity) entity).anInt6773
				< anLocalInt_48_) {
				anLocalInt_48_
				    -= ((Entity) entity).anInt6773;
				int anLocalInt_50_
				    = (((Entity) entity).anInt6770 == 0
				       ? 0
				       : ((-anLocalInt_48_
					   + (((Entity) entity)
					      .anInt6768))
					  / ((Entity) entity).anInt6770
					  * (((Entity) entity)
					     .anInt6770)));
				anLocalInt_49_
				    = (anLocalInt_50_ * class368.method4019()
				       / ((Entity) entity).anInt6768);
			    } else
				anLocalInt_49_ = class368.method4019();
			    int anLocalInt_51_ = class368.method4022();
			    anLocalInt_36_ -= anLocalInt_51_;
			    int anLocalInt_52_
				= (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				   + argument_29_
				   - (class368.method4019() >> 1));
			    class368.method4014(anLocalInt_52_,
						anLocalInt_36_);
			    Class389.aGraphicsToolkit3281.T(anLocalInt_52_,
						     anLocalInt_36_,
						     (anLocalInt_52_
						      + anLocalInt_49_),
						     (anLocalInt_36_
						      + anLocalInt_51_));
			    class368_45_.method4014(anLocalInt_52_,
						    anLocalInt_36_);
			    Class389.aGraphicsToolkit3281.setClip(argument_29_, argument + argument_32_, (argument_29_ + argument_34_), argument);
			    Canvas_Sub1.method125
				(class368.getWidth() + anLocalInt_52_,
				 (byte) -102, anLocalInt_36_ + anLocalInt_51_,
				 anLocalInt_36_, anLocalInt_52_);
			    anLocalInt_36_ -= 2;
			}
			if (anLocalInt > anLocalInt_35_) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
				= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) entity);
			    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				 class104_sub2_sub2_sub5_sub2).anInt6843
				!= -1) {
				anLocalInt_36_ -= 25;
				Class368 class368
				    = (Class43.aClass368Array310
				       [(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					  class104_sub2_sub2_sub5_sub2)
					 .anInt6843)]);
				class368.method4014(((DoublyLinkedNode_Sub51_Sub2
						      .anIntArray6227[0])
						     + argument_29_ - 12),
						    anLocalInt_36_);
				Canvas_Sub1.method125
				    ((DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] - 12
				      + (argument_29_
					 + class368.getWidth())),
				     (byte) -102,
				     class368.method4018() + anLocalInt_36_,
				     anLocalInt_36_,
				     (argument_29_
				      + DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				      - 12));
				anLocalInt_36_ -= 2;
			    }
			    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				 class104_sub2_sub2_sub5_sub2).anInt6840
				!= -1) {
				anLocalInt_36_ -= 25;
				Class368 class368
				    = (Class353_Sub6.aClass368Array5508
				       [(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					  class104_sub2_sub2_sub5_sub2)
					 .anInt6840)]);
				class368.method4014(((DoublyLinkedNode_Sub51_Sub2
						      .anIntArray6227[0])
						     + argument_29_ - 12),
						    anLocalInt_36_);
				Canvas_Sub1.method125
				    ((DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] - 12
				      + (argument_29_
					 + class368.getWidth())),
				     (byte) -102,
				     class368.method4018() + anLocalInt_36_,
				     anLocalInt_36_,
				     (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				      + (argument_29_ - 12)));
				anLocalInt_36_ -= 2;
			    }
			} else if (((Class291) class291).anInt2325 >= 0
				   && (Class353_Sub6.aClass368Array5508.length
				       > ((Class291) class291).anInt2325)) {
			    anLocalInt_36_ -= 25;
			    Class368 class368
				= (Class353_Sub6.aClass368Array5508
				   [((Class291) class291).anInt2325]);
			    class368.method4014((argument_29_
						 + ((DoublyLinkedNode_Sub51_Sub2
						     .anIntArray6227[0])
						    - (class368.method4019()
						       >> 1))),
						anLocalInt_36_);
			    Canvas_Sub1.method125
				((argument_29_
				  + DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				  + (-(class368.method4019() >> 1)
				     + class368.getWidth())),
				 (byte) -102,
				 anLocalInt_36_ + class368.method4018(),
				 anLocalInt_36_,
				 (argument_29_
				  + DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				  - (class368.method4019() >> 1)));
			    anLocalInt_36_ -= 2;
			}
		    }
		    if (!(entity
			  instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)) {
			int anLocalInt_53_ = 0;
			Class124[] class124s = Class166.aClass124Array1216;
			for (int anLocalInt_54_ = 0;
			     class124s.length > anLocalInt_54_;
			     anLocalInt_54_++) {
			    Class124 class124 = class124s[anLocalInt_54_];
			    if (class124 != null
				&& ((Class124) class124).anInt1007 == 1
				&& ((DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616
				     [anLocalInt_35_ - anLocalInt])
				    == ((Class124) class124).anInt1008)) {
				Class368 class368
				    = (Class17.aClass368Array123
				       [((Class124) class124).anInt1009]);
				if (anLocalInt_53_ < class368.method4022())
				    anLocalInt_53_ = class368.method4022();
				if (Class333.anInt2720 % 20 < 10) {
				    class368.method4014((argument_29_
							 + ((DoublyLinkedNode_Sub51_Sub2
							     .anIntArray6227
							     [0])
							    - 12)),
							(anLocalInt_36_
							 - class368
							       .method4022()));
				    Canvas_Sub1.method125
					((argument_29_
					  + ((DoublyLinkedNode_Sub51_Sub2.anIntArray6227
					      [0])
					     + class368.getWidth())
					  - 12),
					 (byte) -102,
					 (anLocalInt_36_
					  - class368.method4022()
					  + class368.method4018()),
					 (-class368.method4022()
					  + anLocalInt_36_),
					 (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
					  + argument_29_ - 12));
				}
			    }
			}
			if (anLocalInt_53_ > 0)
			    anLocalInt_36_ -= anLocalInt_53_ + 2;
		    } else if (anLocalInt_35_ >= 0) {
			int anLocalInt_55_ = 0;
			Class124[] class124s = Class166.aClass124Array1216;
			for (int anLocalInt_56_ = 0;
			     anLocalInt_56_ < class124s.length;
			     anLocalInt_56_++) {
			    Class124 class124 = class124s[anLocalInt_56_];
			    if (class124 != null
				&& ((Class124) class124).anInt1007 == 10
				&& (anLocalInts[anLocalInt_35_]
				    == ((Class124) class124).anInt1008)) {
				Class368 class368
				    = (Class17.aClass368Array123
				       [((Class124) class124).anInt1009]);
				if (anLocalInt_55_ < class368.method4022())
				    anLocalInt_55_ = class368.method4022();
				class368.method4014(((DoublyLinkedNode_Sub51_Sub2
						      .anIntArray6227[0])
						     + argument_29_ - 12),
						    (-class368.method4022()
						     + anLocalInt_36_));
				Canvas_Sub1.method125
				    ((DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				      + (argument_29_
					 - (12 - class368.getWidth()))),
				     (byte) -102,
				     (-class368.method4022()
				      + (anLocalInt_36_
					 + class368.method4018())),
				     anLocalInt_36_ - class368.method4022(),
				     (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0] - 12
				      + argument_29_));
			    }
			}
			if (anLocalInt_55_ > 0)
			    anLocalInt_36_ -= anLocalInt_55_ + 2;
		    }
		    int anLocalInt_57_ = 0;
		    for (/**/; Class62_Sub27.anInt4453 > anLocalInt_57_;
			 anLocalInt_57_++) {
			int anLocalInt_58_ = (((Entity) entity)
					      .anIntArray6778[anLocalInt_57_]);
			int anLocalInt_59_ = (((Entity) entity)
					      .anIntArray6758[anLocalInt_57_]);
			Class234 class234 = null;
			int anLocalInt_60_ = 0;
			if (anLocalInt_59_ >= 0) {
			    if (anLocalInt_58_ <= Class333.anInt2720)
				continue;
			    class234 = (Class79.aClass115_561.method2368
					((((Entity) entity)
					  .anIntArray6758[anLocalInt_57_]),
					 -18112));
			    anLocalInt_60_ = ((Class234) class234).anInt1711;
			} else if (anLocalInt_58_ < 0)
			    continue;
			int anLocalInt_61_ = (((Entity) entity)
					      .anIntArray6748[anLocalInt_57_]);
			Class234 class234_62_ = null;
			if (anLocalInt_61_ >= 0)
			    class234_62_
				= Class79.aClass115_561
				      .method2368(anLocalInt_61_, -18112);
			if (Class333.anInt2720
			    >= anLocalInt_58_ - anLocalInt_60_) {
			    int anLocalInt_63_
				= (((Entity) entity)
				   .anIntArray6767[anLocalInt_57_]);
			    if (anLocalInt_63_ >= 0) {
				((Entity) entity).anInt6774
				    = Class333.anInt2720 + 300;
				((Entity) entity).anInt6785
				    = anLocalInt_63_;
				((Entity) entity)
				    .anIntArray6767[anLocalInt_57_]
				    = -1;
			    }
			    if (class234 == null)
				((Entity) entity)
				    .anIntArray6778[anLocalInt_57_]
				    = -1;
			    else {
				int anLocalInt_64_
				    = (entity
					   .method1837((byte) -119)
				       / 2);
				Class128.method2421(argument_32_ >> 1,
						    argument_30_,
						    anLocalInt_64_,
						    argument_34_ >> 1, entity,
						    (byte) 119, argument_33_);
				if (DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
				    > -1) {
				    DoublyLinkedNode_Sub51_Sub2.anIntArray6227[0]
					+= (Node_Sub10.anIntArray3938
					    [anLocalInt_57_]);
				    DoublyLinkedNode_Sub51_Sub2.anIntArray6227[1]
					+= (Class215.anIntArray1522
					    [anLocalInt_57_]);
				    Object object = null;
				    Object object_65_ = null;
				    Object object_66_ = null;
				    Object object_67_ = null;
				    int anLocalInt_68_ = 0;
				    int anLocalInt_69_ = 0;
				    int anLocalInt_70_ = 0;
				    int anLocalInt_71_ = 0;
				    int anLocalInt_72_ = 0;
				    int anLocalInt_73_ = 0;
				    int anLocalInt_74_ = 0;
				    int anLocalInt_75_ = 0;
				    Class368 class368 = null;
				    Class368 class368_76_ = null;
				    Class368 class368_77_ = null;
				    Class368 class368_78_ = null;
				    int anLocalInt_79_ = 0;
				    int anLocalInt_80_ = 0;
				    int anLocalInt_81_ = 0;
				    int anLocalInt_82_ = 0;
				    int anLocalInt_83_ = 0;
				    int anLocalInt_84_ = 0;
				    int anLocalInt_85_ = 0;
				    int anLocalInt_86_ = 0;
				    int anLocalInt_87_ = 0;
				    Class368 class368_88_
					= (class234.method3106
					   (-21380, Class389.aGraphicsToolkit3281));
				    if (class368_88_ != null) {
					anLocalInt_68_
					    = class368_88_.method4019();
					int anLocalInt_89_
					    = class368_88_.method4022();
					class368_88_.method4017
					    (Class149.anIntArray1141);
					if (anLocalInt_87_ < anLocalInt_89_)
					    anLocalInt_87_ = anLocalInt_89_;
					anLocalInt_72_
					    = Class149.anIntArray1141[0];
				    }
				    Class368 class368_90_
					= class234.method3103((Class389
							       .aGraphicsToolkit3281),
							      0);
				    if (class368_90_ != null) {
					anLocalInt_69_
					    = class368_90_.method4019();
					int anLocalInt_91_
					    = class368_90_.method4022();
					class368_90_.method4017
					    (Class149.anIntArray1141);
					if (anLocalInt_91_ > anLocalInt_87_)
					    anLocalInt_87_ = anLocalInt_91_;
					anLocalInt_73_
					    = Class149.anIntArray1141[0];
				    }
				    Class368 class368_92_
					= class234.method3110((Class389
							       .aGraphicsToolkit3281),
							      -1);
				    if (class368_92_ != null) {
					anLocalInt_70_
					    = class368_92_.method4019();
					int anLocalInt_93_
					    = class368_92_.method4022();
					if (anLocalInt_93_ > anLocalInt_87_)
					    anLocalInt_87_ = anLocalInt_93_;
					class368_92_.method4017
					    (Class149.anIntArray1141);
					anLocalInt_74_
					    = Class149.anIntArray1141[0];
				    }
				    Class368 class368_94_
					= class234.method3101((Class389
							       .aGraphicsToolkit3281),
							      0);
				    if (class368_94_ != null) {
					anLocalInt_71_
					    = class368_94_.method4019();
					int anLocalInt_95_
					    = class368_94_.method4022();
					class368_94_.method4017
					    (Class149.anIntArray1141);
					if (anLocalInt_95_ > anLocalInt_87_)
					    anLocalInt_87_ = anLocalInt_95_;
					anLocalInt_75_
					    = Class149.anIntArray1141[0];
				    }
				    if (class234_62_ != null) {
					class368 = (class234_62_.method3106
						    (-21380,
						     Class389.aGraphicsToolkit3281));
					if (class368 != null) {
					    anLocalInt_79_
						= class368.method4019();
					    int anLocalInt_96_
						= class368.method4022();
					    if (anLocalInt_96_
						> anLocalInt_87_)
						anLocalInt_87_
						    = anLocalInt_96_;
					    class368.method4017
						(Class149.anIntArray1141);
					    anLocalInt_83_
						= Class149.anIntArray1141[0];
					}
					class368_76_
					    = (class234_62_.method3103
					       (Class389.aGraphicsToolkit3281, 0));
					if (class368_76_ != null) {
					    anLocalInt_80_
						= class368_76_.method4019();
					    int anLocalInt_97_
						= class368_76_.method4022();
					    class368_76_.method4017
						(Class149.anIntArray1141);
					    if (anLocalInt_97_
						> anLocalInt_87_)
						anLocalInt_87_
						    = anLocalInt_97_;
					    anLocalInt_84_
						= Class149.anIntArray1141[0];
					}
					class368_77_
					    = (class234_62_.method3110
					       (Class389.aGraphicsToolkit3281, -1));
					if (class368_77_ != null) {
					    anLocalInt_81_
						= class368_77_.method4019();
					    int anLocalInt_98_
						= class368_77_.method4022();
					    if (anLocalInt_87_
						< anLocalInt_98_)
						anLocalInt_87_
						    = anLocalInt_98_;
					    class368_77_.method4017
						(Class149.anIntArray1141);
					    anLocalInt_85_
						= Class149.anIntArray1141[0];
					}
					class368_78_
					    = (class234_62_.method3101
					       (Class389.aGraphicsToolkit3281, 0));
					if (class368_78_ != null) {
					    anLocalInt_82_
						= class368_78_.method4019();
					    int anLocalInt_99_
						= class368_78_.method4022();
					    class368_78_.method4017
						(Class149.anIntArray1141);
					    if (anLocalInt_87_
						< anLocalInt_99_)
						anLocalInt_87_
						    = anLocalInt_99_;
					    anLocalInt_86_
						= Class149.anIntArray1141[0];
					}
				    }
				    AbstractFont abstractFont = Class226.aAbstractFont_1641;
				    AbstractFont abstractFont_100_
					= Class226.aAbstractFont_1641;
				    Class76 class76 = BufferedFile.aClass76_2753;
				    int anLocalInt_101_
					= ((Class234) class234).anInt1709;
				    Class76 class76_102_
					= BufferedFile.aClass76_2753;
				    if (anLocalInt_101_ >= 0) {
					AbstractFont abstractFont_103_
					    = (Class345.method3805
					       (Class389.aGraphicsToolkit3281, true,
						anLocalInt_101_, 0));
					Class76 class76_104_
					    = method1893(anLocalInt_101_, true,
							 (Class389
							  .aGraphicsToolkit3281));
					if (abstractFont_103_ != null
					    && class76_104_ != null) {
					    class76 = class76_104_;
					    abstractFont = abstractFont_103_;
					}
				    }
				    if (class234_62_ != null) {
					anLocalInt_101_
					    = (((Class234) class234_62_)
					       .anInt1709);
					if (anLocalInt_101_ >= 0) {
					    AbstractFont abstractFont_105_
						= (Class345.method3805
						   (Class389.aGraphicsToolkit3281,
						    true, anLocalInt_101_, 0));
					    Class76 class76_106_
						= method1893(anLocalInt_101_,
							     true,
							     (Class389
							      .aGraphicsToolkit3281));
					    if (abstractFont_105_ != null
						&& class76_106_ != null) {
						class76_102_ = class76_106_;
						abstractFont_100_ = abstractFont_105_;
					    }
					}
				    }
				    Object object_107_ = null;
				    String string = null;
				    boolean anLocalBoolean = false;
				    int anLocalInt_108_ = 0;
				    String string_109_
					= (class234.method3102
					   ((byte) -83,
					    (((Entity) entity)
					     .anIntArray6744
					     [anLocalInt_57_])));
				    int anLocalInt_110_
					= class76.method1552(string_109_, 0);
				    if (class234_62_ != null) {
					string = (class234_62_.method3102
						  ((byte) 100,
						   (((Entity) entity)
						    .anIntArray6726
						    [anLocalInt_57_])));
					anLocalInt_108_
					    = class76_102_.method1552(string,
								      0);
				    }
				    int anLocalInt_111_ = 0;
				    int anLocalInt_112_ = 0;
				    if (anLocalInt_69_ > 0)
					anLocalInt_111_
					    = (anLocalInt_110_ / anLocalInt_69_
					       + 1);
				    if (class234_62_ != null
					&& anLocalInt_80_ > 0)
					anLocalInt_112_
					    = (anLocalInt_108_ / anLocalInt_80_
					       + 1);
				    int anLocalInt_113_ = 0;
				    int anLocalInt_114_ = anLocalInt_113_;
				    if (anLocalInt_68_ > 0)
					anLocalInt_113_ += anLocalInt_68_;
				    anLocalInt_113_ += 2;
				    int anLocalInt_115_ = anLocalInt_113_;
				    if (anLocalInt_70_ > 0)
					anLocalInt_113_ += anLocalInt_70_;
				    int anLocalInt_116_ = anLocalInt_113_;
				    int anLocalInt_117_ = anLocalInt_113_;
				    if (anLocalInt_69_ > 0) {
					int anLocalInt_118_
					    = anLocalInt_69_ * anLocalInt_111_;
					anLocalInt_117_
					    += (-anLocalInt_110_
						+ anLocalInt_118_) / 2;
					anLocalInt_113_ += anLocalInt_118_;
				    } else
					anLocalInt_113_ += anLocalInt_110_;
				    int anLocalInt_119_ = anLocalInt_113_;
				    if (anLocalInt_71_ > 0)
					anLocalInt_113_ += anLocalInt_71_;
				    int anLocalInt_120_ = 0;
				    int anLocalInt_121_ = 0;
				    int anLocalInt_122_ = 0;
				    int anLocalInt_123_ = 0;
				    int anLocalInt_124_ = 0;
				    if (class234_62_ != null) {
					anLocalInt_113_ += 2;
					anLocalInt_120_ = anLocalInt_113_;
					if (anLocalInt_79_ > 0)
					    anLocalInt_113_ += anLocalInt_79_;
					anLocalInt_113_ += 2;
					anLocalInt_121_ = anLocalInt_113_;
					if (anLocalInt_81_ > 0)
					    anLocalInt_113_ += anLocalInt_81_;
					anLocalInt_122_ = anLocalInt_113_;
					anLocalInt_124_ = anLocalInt_113_;
					if (anLocalInt_80_ > 0) {
					    int anLocalInt_125_
						= (anLocalInt_112_
						   * anLocalInt_80_);
					    anLocalInt_113_ += anLocalInt_125_;
					    anLocalInt_124_
						+= (-anLocalInt_108_
						    + anLocalInt_125_) / 2;
					} else
					    anLocalInt_113_ += anLocalInt_108_;
					anLocalInt_123_ = anLocalInt_113_;
					if (anLocalInt_82_ > 0)
					    anLocalInt_113_ += anLocalInt_82_;
				    }
				    int anLocalInt_126_
					= ((((Entity) entity)
					    .anIntArray6778[anLocalInt_57_])
					   - Class333.anInt2720);
				    int anLocalInt_127_
					= (((Class234) class234).anInt1704
					   - (((Class234) class234).anInt1704
					      * anLocalInt_126_
					      / (((Class234) class234)
						 .anInt1711)));
				    int anLocalInt_128_
					= ((((Class234) class234).anInt1707
					    * anLocalInt_126_
					    / ((Class234) class234).anInt1711)
					   - ((Class234) class234).anInt1707);
				    int anLocalInt_129_
					= (-(anLocalInt_113_ >> 1)
					   + argument_29_
					   - (-(DoublyLinkedNode_Sub51_Sub2
						.anIntArray6227[0])
					      - anLocalInt_127_));
				    int anLocalInt_130_
					= (anLocalInt_128_ - 12
					   + (argument
					      + (DoublyLinkedNode_Sub51_Sub2
						 .anIntArray6227[1])));
				    int anLocalInt_131_ = anLocalInt_130_;
				    int anLocalInt_132_
					= anLocalInt_87_ + anLocalInt_130_;
				    int anLocalInt_133_
					= (((Class234) class234).anInt1700
					   + anLocalInt_130_ + 15);
				    int anLocalInt_134_
					= (anLocalInt_133_
					   - ((Class76) class76).anInt520);
				    if (anLocalInt_131_ > anLocalInt_134_)
					anLocalInt_131_ = anLocalInt_134_;
				    int anLocalInt_135_
					= (((Class76) class76).anInt518
					   + anLocalInt_133_);
				    if (anLocalInt_132_ < anLocalInt_135_)
					anLocalInt_132_ = anLocalInt_135_;
				    int anLocalInt_136_ = 0;
				    if (class234_62_ != null) {
					anLocalInt_136_
					    = ((((Class234) class234_62_)
						.anInt1700)
					       + anLocalInt_130_ + 15);
					int anLocalInt_137_
					    = (-(((Class76) class76_102_)
						 .anInt520)
					       + anLocalInt_136_);
					if (anLocalInt_137_ < anLocalInt_131_)
					    anLocalInt_131_ = anLocalInt_137_;
					int anLocalInt_138_
					    = ((((Class76) class76_102_)
						.anInt518)
					       + anLocalInt_136_);
					if (anLocalInt_138_ > anLocalInt_132_)
					    anLocalInt_132_ = anLocalInt_138_;
				    }
				    int anLocalInt_139_ = 255;
				    if (((Class234) class234).anInt1714 >= 0)
					anLocalInt_139_
					    = ((anLocalInt_126_ << 8)
					       / (-(((Class234) class234)
						    .anInt1714)
						  + (((Class234) class234)
						     .anInt1711)));
				    if (anLocalInt_139_ < 0
					|| anLocalInt_139_ >= 255) {
					if (class368_88_ != null)
					    class368_88_.method4014
						((-anLocalInt_72_
						  + anLocalInt_114_
						  + anLocalInt_129_),
						 anLocalInt_130_);
					if (class368_92_ != null)
					    class368_92_.method4014
						((anLocalInt_129_
						  + anLocalInt_115_
						  - anLocalInt_74_),
						 anLocalInt_130_);
					if (class368_90_ != null) {
					    for (int anLocalInt_140_ = 0;
						 (anLocalInt_111_
						  > anLocalInt_140_);
						 anLocalInt_140_++)
						class368_90_.method4014
						    ((-anLocalInt_73_
						      + (anLocalInt_129_
							 + anLocalInt_116_)
						      + (anLocalInt_140_
							 * anLocalInt_69_)),
						     anLocalInt_130_);
					}
					if (class368_94_ != null)
					    class368_94_.method4014
						((anLocalInt_129_
						  + anLocalInt_119_
						  - anLocalInt_75_),
						 anLocalInt_130_);
					abstractFont.method507((byte) 56,
							  anLocalInt_133_, 0,
							  string_109_,
							  (((Class234)
							    class234).anInt1713
							   | ~0xffffff),
							  (anLocalInt_117_
							   + anLocalInt_129_));
					if (class234_62_ != null) {
					    if (class368 != null)
						class368.method4014
						    ((-anLocalInt_83_
						      + anLocalInt_120_
						      + anLocalInt_129_),
						     anLocalInt_130_);
					    if (class368_77_ != null)
						class368_77_.method4014
						    ((anLocalInt_121_
						      + (anLocalInt_129_
							 - anLocalInt_85_)),
						     anLocalInt_130_);
					    if (class368_76_ != null) {
						for (int anLocalInt_141_ = 0;
						     (anLocalInt_112_
						      > anLocalInt_141_);
						     anLocalInt_141_++)
						    class368_76_.method4014
							((anLocalInt_122_
							  + anLocalInt_129_
							  - (anLocalInt_84_
							     - (anLocalInt_141_
								* anLocalInt_80_))),
							 anLocalInt_130_);
					    }
					    if (class368_78_ != null)
						class368_78_.method4014
						    ((anLocalInt_129_
						      + anLocalInt_123_
						      - anLocalInt_86_),
						     anLocalInt_130_);
					    abstractFont_100_.method507
						((byte) 56, anLocalInt_136_, 0,
						 string,
						 (((Class234) class234_62_)
						  .anInt1713) | ~0xffffff,
						 (anLocalInt_124_
						  + anLocalInt_129_));
					}
				    } else {
					int anLocalInt_142_
					    = anLocalInt_139_ << 24;
					int anLocalInt_143_
					    = anLocalInt_142_ | 0xffffff;
					if (class368_88_ != null)
					    class368_88_.method4004
						((-anLocalInt_72_
						  + (anLocalInt_114_
						     + anLocalInt_129_)),
						 anLocalInt_130_, 0,
						 anLocalInt_143_, 1);
					if (class368_92_ != null)
					    class368_92_.method4004
						((anLocalInt_115_
						  + anLocalInt_129_
						  - anLocalInt_74_),
						 anLocalInt_130_, 0,
						 anLocalInt_143_, 1);
					if (class368_90_ != null) {
					    for (int anLocalInt_144_ = 0;
						 (anLocalInt_111_
						  > anLocalInt_144_);
						 anLocalInt_144_++)
						class368_90_.method4004
						    ((anLocalInt_116_
						      + (anLocalInt_129_
							 + (-anLocalInt_73_
							    + (anLocalInt_144_
							       * anLocalInt_69_)))),
						     anLocalInt_130_, 0,
						     anLocalInt_143_, 1);
					}
					if (class368_94_ != null)
					    class368_94_.method4004
						((-anLocalInt_75_
						  + anLocalInt_119_
						  + anLocalInt_129_),
						 anLocalInt_130_, 0,
						 anLocalInt_143_, 1);
					abstractFont.method507((byte) 56,
							  anLocalInt_133_, 0,
							  string_109_,
							  (((Class234)
							    class234).anInt1713
							   | anLocalInt_142_),
							  (anLocalInt_117_
							   + anLocalInt_129_));
					if (class234_62_ != null) {
					    if (class368 != null)
						class368.method4004
						    ((-anLocalInt_83_
						      + (anLocalInt_129_
							 + anLocalInt_120_)),
						     anLocalInt_130_, 0,
						     anLocalInt_143_, 1);
					    if (class368_77_ != null)
						class368_77_.method4004
						    ((anLocalInt_129_
						      - (-anLocalInt_121_
							 + anLocalInt_85_)),
						     anLocalInt_130_, 0,
						     anLocalInt_143_, 1);
					    if (class368_76_ != null) {
						for (int anLocalInt_145_ = 0;
						     (anLocalInt_145_
						      < anLocalInt_112_);
						     anLocalInt_145_++)
						    class368_76_.method4004
							((-anLocalInt_84_
							  + (anLocalInt_122_
							     + anLocalInt_129_
							     + (anLocalInt_145_
								* anLocalInt_80_))),
							 anLocalInt_130_, 0,
							 anLocalInt_143_, 1);
					    }
					    if (class368_78_ != null)
						class368_78_.method4004
						    ((-anLocalInt_86_
						      + (anLocalInt_129_
							 + anLocalInt_123_)),
						     anLocalInt_130_, 0,
						     anLocalInt_143_, 1);
					    abstractFont_100_.method507
						((byte) 56, anLocalInt_136_, 0,
						 string,
						 (anLocalInt_142_
						  | (((Class234) class234_62_)
						     .anInt1713)),
						 (anLocalInt_124_
						  + anLocalInt_129_));
					}
				    }
				    Canvas_Sub1.method125((anLocalInt_129_
							   + anLocalInt_113_),
							  (byte) -102,
							  anLocalInt_132_ + 1,
							  anLocalInt_131_,
							  anLocalInt_129_);
				}
			    }
			}
		    }
		}
	    }
	}
	for (int anLocalInt_146_ = 0; Class24.anInt163 > anLocalInt_146_;
	     anLocalInt_146_++) {
	    int anLocalInt_147_
		= Node_Sub29.anIntArray4126[anLocalInt_146_];
	    Entity entity;
	    if (anLocalInt_147_ < 2048)
		entity
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [anLocalInt_147_]);
	    else
		entity
		    = (((Node_Sub35) (Node_Sub35)
			Class294.aJagexHashMap_2453
			    .get((long) (anLocalInt_147_ - 2048)))
		       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    int anLocalInt_148_ = Class259.anIntArray2020[anLocalInt_146_];
	    Entity entity_149_;
	    if (anLocalInt_148_ < 2048)
		entity_149_
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [anLocalInt_148_]);
	    else
		entity_149_
		    = (((Node_Sub35) (Node_Sub35)
			Class294.aJagexHashMap_2453
			    .get((long) (anLocalInt_148_ - 2048)))
		       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    Class124.method2399(entity, argument,
				argument_29_, (byte) -124, argument_30_,
				--((Entity) entity).anInt6749,
				argument_34_, argument_32_, argument_33_, entity_149_);
	}
	int anLocalInt_150_ = (((Class76) Class37.aClass76_274).anInt520 + 2
			       + ((Class76) Class37.aClass76_274).anInt518);
	for (int anLocalInt_151_ = 0; anLocalInt_151_ < Class64.anInt450;
	     anLocalInt_151_++) {
	    int anLocalInt_152_
		= Node_Sub45.anIntArray4259[anLocalInt_151_];
	    int anLocalInt_153_
		= Node_Sub45.anIntArray4267[anLocalInt_151_];
	    int anLocalInt_154_
		= Node_Sub45.anIntArray4256[anLocalInt_151_];
	    boolean anLocalBoolean = true;
	    while (anLocalBoolean) {
		anLocalBoolean = false;
		for (int anLocalInt_155_ = 0;
		     anLocalInt_151_ > anLocalInt_155_; anLocalInt_155_++) {
		    if ((anLocalInt_153_ + 2
			 > (Node_Sub45.anIntArray4267[anLocalInt_155_]
			    - anLocalInt_150_))
			&& (Node_Sub45.anIntArray4267[anLocalInt_155_] + 2
			    > -anLocalInt_150_ + anLocalInt_153_)
			&& (-anLocalInt_154_ + anLocalInt_152_
			    < (Node_Sub45.anIntArray4256[anLocalInt_155_]
			       + (Node_Sub45.anIntArray4259
				  [anLocalInt_155_])))
			&& (anLocalInt_152_ + anLocalInt_154_
			    > (Node_Sub45.anIntArray4259[anLocalInt_155_]
			       - (Node_Sub45.anIntArray4256
				  [anLocalInt_155_])))
			&& (Node_Sub45.anIntArray4267[anLocalInt_155_]
			    - anLocalInt_150_) < anLocalInt_153_) {
			anLocalInt_153_
			    = (Node_Sub45.anIntArray4267[anLocalInt_155_]
			       - anLocalInt_150_);
			anLocalBoolean = true;
		    }
		}
	    }
	    Node_Sub45.anIntArray4267[anLocalInt_151_] = anLocalInt_153_;
	    String string = Node_Sub45.aStringArray4263[anLocalInt_151_];
	    int anLocalInt_156_ = Class37.aClass76_274.method1552(string, 0);
	    int anLocalInt_157_ = argument_29_ + anLocalInt_152_;
	    int anLocalInt_158_ = (-((Class76) Class37.aClass76_274).anInt520
				   + argument + anLocalInt_153_);
	    int anLocalInt_159_ = anLocalInt_157_ + anLocalInt_156_;
	    int anLocalInt_160_
		= (argument + anLocalInt_153_
		   + ((Class76) Class37.aClass76_274).anInt518);
	    if (Class26.anInt180 != 0) {
		Class173.aAbstractFont_1286.method503((argument_29_
						  + anLocalInt_152_),
						 -16777216, -256, (byte) 41,
						 string,
						 argument + anLocalInt_153_);
		anLocalInt_159_ -= anLocalInt_156_ >> 1;
		anLocalInt_157_ -= anLocalInt_156_ >> 1;
	    } else {
		int anLocalInt_161_ = 16776960;
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] < 6)
		    anLocalInt_161_
			= (Node_Sub31_Sub26.anIntArray5955
			   [Node_Sub45.anIntArray4275[anLocalInt_151_]]);
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 6)
		    anLocalInt_161_
			= Statics.anInt264 % 20 < 10 ? 16711680 : 16776960;
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 7)
		    anLocalInt_161_
			= Statics.anInt264 % 20 >= 10 ? 65535 : 255;
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 8)
		    anLocalInt_161_
			= Statics.anInt264 % 20 >= 10 ? 8454016 : 45056;
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 9) {
		    int anLocalInt_162_
			= -Node_Sub45.anIntArray4272[anLocalInt_151_] + 150;
		    if (anLocalInt_162_ < 50)
			anLocalInt_161_ = anLocalInt_162_ * 1280 + 16711680;
		    else if (anLocalInt_162_ >= 100) {
			if (anLocalInt_162_ < 150)
			    anLocalInt_161_
				= 65280 - (-(anLocalInt_162_ * 5) + 500);
		    } else
			anLocalInt_161_
			    = 16776960 - (anLocalInt_162_ - 50) * 327680;
		}
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 10) {
		    int anLocalInt_163_
			= 150 - Node_Sub45.anIntArray4272[anLocalInt_151_];
		    if (anLocalInt_163_ < 50)
			anLocalInt_161_ = anLocalInt_163_ * 5 + 16711680;
		    else if (anLocalInt_163_ < 100)
			anLocalInt_161_
			    = 16384000 - (anLocalInt_163_ * 327680 - 16711935);
		    else if (anLocalInt_163_ < 150)
			anLocalInt_161_
			    = (500 - (anLocalInt_163_ * 5 - 255)
			       + (anLocalInt_163_ * 327680 - 32768000));
		}
		if (Node_Sub45.anIntArray4275[anLocalInt_151_] == 11) {
		    int anLocalInt_164_
			= -Node_Sub45.anIntArray4272[anLocalInt_151_] + 150;
		    if (anLocalInt_164_ >= 50) {
			if (anLocalInt_164_ >= 100) {
			    if (anLocalInt_164_ < 150)
				anLocalInt_161_ = -((anLocalInt_164_ - 100)
						    * 327680) + 16777215;
			} else
			    anLocalInt_161_
				= (anLocalInt_164_ - 50) * 327685 + 65280;
		    } else
			anLocalInt_161_
			    = -(anLocalInt_164_ * 327685) + 16777215;
		}
		int anLocalInt_165_ = anLocalInt_161_ | ~0xffffff;
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 0) {
		    anLocalInt_157_ -= anLocalInt_156_ >> 1;
		    Class173.aAbstractFont_1286.method503
			(argument_29_ + anLocalInt_152_, -16777216,
			 anLocalInt_165_, (byte) 60, string,
			 anLocalInt_153_ + argument);
		    anLocalInt_159_ -= anLocalInt_156_ >> 1;
		}
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 1) {
		    anLocalInt_159_ -= anLocalInt_156_ >> 1;
		    anLocalInt_158_ -= 5;
		    anLocalInt_157_ -= anLocalInt_156_ >> 1;
		    Class173.aAbstractFont_1286.method500
			(Statics.anInt264, argument + anLocalInt_153_, string,
			 anLocalInt_165_, -16777216, 2,
			 anLocalInt_152_ + argument_29_);
		    anLocalInt_160_ += 5;
		}
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 2) {
		    anLocalInt_159_ -= (anLocalInt_156_ >> 1) - 5;
		    anLocalInt_160_ += 5;
		    anLocalInt_157_ -= (anLocalInt_156_ >> 1) + 5;
		    Class173.aAbstractFont_1286.method497
			(argument_29_ + anLocalInt_152_, anLocalInt_165_,
			 -16777216, argument + anLocalInt_153_, string, 124,
			 Statics.anInt264);
		    anLocalInt_158_ -= 5;
		}
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 3) {
		    anLocalInt_158_ -= 7;
		    anLocalInt_159_ -= anLocalInt_156_ >> 1;
		    anLocalInt_160_ += 7;
		    Class173.aAbstractFont_1286.method502
			(argument_29_ + anLocalInt_152_, -16777216,
			 Statics.anInt264,
			 -Node_Sub45.anIntArray4272[anLocalInt_151_] + 150,
			 (byte) -101, anLocalInt_165_,
			 anLocalInt_153_ + argument, string);
		    anLocalInt_157_ -= anLocalInt_156_ >> 1;
		}
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 4) {
		    int anLocalInt_166_
			= ((150
			    - Node_Sub45.anIntArray4272[anLocalInt_151_])
			   * (Class37.aClass76_274.method1552(string, 0) + 100)
			   / 150);
		    Class389.aGraphicsToolkit3281.T((argument_29_ - 50
					      + anLocalInt_152_),
					     argument,
					     (anLocalInt_152_ + argument_29_
					      + 50),
					     argument_32_ + argument);
		    anLocalInt_159_ += 50 - anLocalInt_166_;
		    Class173.aAbstractFont_1286.method507
			((byte) 56, anLocalInt_153_ + argument, -16777216,
			 string, anLocalInt_165_,
			 argument_29_ + anLocalInt_152_ + (50
							   - anLocalInt_166_));
		    anLocalInt_157_ += -anLocalInt_166_ + 50;
		    Class389.aGraphicsToolkit3281.setClip(argument_29_, argument + argument_32_, argument_29_ + argument_34_, argument);
		}
		if (Node_Sub45.anIntArray4268[anLocalInt_151_] == 5) {
		    int anLocalInt_167_
			= -Node_Sub45.anIntArray4272[anLocalInt_151_] + 150;
		    int anLocalInt_168_ = 0;
		    if (anLocalInt_167_ >= 25) {
			if (anLocalInt_167_ > 125)
			    anLocalInt_168_ = anLocalInt_167_ - 125;
		    } else
			anLocalInt_168_ = anLocalInt_167_ - 25;
		    int anLocalInt_169_
			= (((Class76) Class37.aClass76_274).anInt518
			   + ((Class76) Class37.aClass76_274).anInt520);
		    Class389.aGraphicsToolkit3281.T(argument_29_,
					     (argument
					      + (anLocalInt_153_
						 - anLocalInt_169_)
					      - 1),
					     argument_29_ + argument_34_,
					     argument - (-anLocalInt_153_
							 - 5));
		    anLocalInt_160_ += anLocalInt_168_;
		    Class173.aAbstractFont_1286.method503
			(anLocalInt_152_ + argument_29_, -16777216,
			 anLocalInt_165_, (byte) 34, string,
			 anLocalInt_153_ + argument + anLocalInt_168_);
		    anLocalInt_157_ -= anLocalInt_156_ >> 1;
		    anLocalInt_159_ -= anLocalInt_156_ >> 1;
		    anLocalInt_158_ += anLocalInt_168_;
		    Class389.aGraphicsToolkit3281.setClip(argument_29_, argument_32_ + argument, argument_29_ + argument_34_, argument);
		}
	    }
	    Canvas_Sub1.method125(anLocalInt_159_ + 1, (byte) -102,
				  anLocalInt_160_ + 1, anLocalInt_158_,
				  anLocalInt_157_);
	}
    }
    
    static final int[][] method1895
	(int argument, boolean argument_170_, int argument_171_,
	 int argument_172_, int argument_173_, int argument_174_,
	 byte argument_175_, int argument_176_, float argument_177_) {
	int[][] anLocalInts = new int[argument_173_][argument_174_];
	Node_Sub31_Sub37 class59_sub31_sub37 = new Node_Sub31_Sub37();
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6019
	    = (int) (argument_177_ * 4096.0F);
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6024 = argument_176_;
	((Node_Sub31_Sub37) class59_sub31_sub37).aBoolean6018
	    = argument_170_;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6031 = argument_172_;
	((Node_Sub31_Sub37) class59_sub31_sub37).anInt6025 = argument;
	class59_sub31_sub37.method865(true);
	Class122.method2391(argument_174_, argument_173_, -106);
	for (int anLocalInt = 0; anLocalInt < argument_173_; anLocalInt++)
	    class59_sub31_sub37.method996(106, anLocalInts[anLocalInt],
					  anLocalInt);
	return anLocalInts;
    }
    
    final void method1775(GraphicsToolkit argument_178_, DoublyLinkedNodeP2_Sub2 argument_179_,
			  boolean argument_180_, int argument_181_,
			  int argument_182_, int argument_183_,
			  int argument_184_) {
	if (argument_181_ <= -16)
	    throw new IllegalStateException();
    }
    
    final int applyLighting(byte argument_185_, HardwareLight[] argument_186_) {
	if (argument_185_ >= -20)
	    method1890(94, 56);
	return this.setupLighting((((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift), argument_186_, (((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift));
    }
    
    DoublyLinkedNodeP2_Sub2_Sub5(int argument_187_, int argument_188_, int argument_189_,
		       int argument_190_, int argument_191_) {
	((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_191_;
	((DoublyLinkedNodeP2_Sub2) this).lightingHL = (byte) argument_190_;
	((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_189_;
	((DoublyLinkedNodeP2_Sub2) this).worldX = argument_187_;
	((DoublyLinkedNodeP2_Sub2) this).anInt4511 = argument_188_;
    }
}
