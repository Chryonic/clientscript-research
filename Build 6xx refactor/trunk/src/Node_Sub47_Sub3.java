/* Class59_Sub47_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub3 extends Node_Sub47
{
    static Class368 aClass368_6163;
    static int anInt6164;
    static boolean aBoolean6165 = false;
    private long memberhash = -1L;
    static int anInt6167;
    private String membername = null;
    
    public static void method1119(int argument) {
	aClass368_6163 = null;
    }
    
    final void method1110(int argument_0_, Packet argument_1_) {
	if (argument_1_.g1() != 255) {
	    ((Packet) argument_1_).pos--;
	    memberhash = argument_1_.g8();
	}
	if (argument_0_ > -56)
	    method1109(null, 79);
	membername = argument_1_.fastgstr((byte) 89);
	if (Class195.aBoolean1424)
	    System.out.println("memberhash:" + memberhash + " membername:"
			       + membername);
    }
    
    static final void method1120
	(int argument, int argument_2_, int argument_3_, int argument_4_,
	 int argument_5_, int argument_6_, int argument_7_, int argument_8_) {
	Node_Sub2 class59_sub2 = null;
	if (argument_4_ == 2899) {
	    for (Node_Sub2 class59_sub2_9_
		     = ((Node_Sub2)
			Statics.aCyclicLinkedList_3722.getFirst());
		 class59_sub2_9_ != null;
		 class59_sub2_9_ = (Node_Sub2) Statics
						      .aCyclicLinkedList_3722
						      .getNext()) {
		if (((Node_Sub2) class59_sub2_9_).anInt3871 == argument_2_
		    && (((Node_Sub2) class59_sub2_9_).anInt3883
			== argument_7_)
		    && (((Node_Sub2) class59_sub2_9_).anInt3882
			== argument_6_)
		    && (argument_8_
			== ((Node_Sub2) class59_sub2_9_).anInt3881)) {
		    class59_sub2 = class59_sub2_9_;
		    break;
		}
	    }
	    if (class59_sub2 == null) {
		class59_sub2 = new Node_Sub2();
		((Node_Sub2) class59_sub2).anInt3871 = argument_2_;
		((Node_Sub2) class59_sub2).anInt3882 = argument_6_;
		((Node_Sub2) class59_sub2).anInt3883 = argument_7_;
		((Node_Sub2) class59_sub2).anInt3881 = argument_8_;
		if (argument_7_ >= 0 && argument_6_ >= 0
		    && argument_7_ < MapRelated.mapWidth
		    && MapRelated.mapDepth > argument_6_)
		    Class157.method2591(class59_sub2, argument_4_ ^ ~0x673);
		Statics.aCyclicLinkedList_3722.add(class59_sub2);
	    }
	    ((Node_Sub2) class59_sub2).aBoolean3875 = true;
	    ((Node_Sub2) class59_sub2).anInt3884 = argument;
	    ((Node_Sub2) class59_sub2).anInt3874 = argument_5_;
	    ((Node_Sub2) class59_sub2).anInt3876 = argument_3_;
	    ((Node_Sub2) class59_sub2).aBoolean3873 = false;
	}
    }
    
    final void method1109(ClanSettings argument_10_, int argument_11_) {
	if (argument_11_ != 5)
	    anInt6164 = 106;
	argument_10_.addMember(memberhash, membername);
    }
    
    static final boolean method1121
	(int argument, boolean argument_12_, int argument_13_,
	 int argument_14_, Class148[][][] argument_15_, int argument_16_) {
	byte anLocalInt
	    = argument_12_ ? (byte) 1 : (byte) (Statics.anInt264 & 0xff);
	if (anLocalInt == (Statics.aByteArrayArrayArray1279
			   [Class176.anInt1308][argument_16_][argument_13_]))
	    return false;
	if (((Class303.tileSettings[Class176.anInt1308][argument_16_]
	      [argument_13_])
	     & 0x4)
	    == 0)
	    return false;
	int anLocalInt_17_ = 0;
	int anLocalInt_18_ = 0;
	Class62_Sub27.anIntArray4452[anLocalInt_17_] = argument_16_;
	Class35.anIntArray263[anLocalInt_17_++] = argument_13_;
	Statics.aByteArrayArrayArray1279[Class176.anInt1308][argument_16_]
	    [argument_13_]
	    = anLocalInt;
	while (anLocalInt_18_ != anLocalInt_17_) {
	    int anLocalInt_19_
		= Class62_Sub27.anIntArray4452[anLocalInt_18_] & 0xffff;
	    int anLocalInt_20_
		= ((Class62_Sub27.anIntArray4452[anLocalInt_18_] & 0xff5ef4)
		   >> 16);
	    int anLocalInt_21_
		= Class62_Sub27.anIntArray4452[anLocalInt_18_] >> 24 & 0xff;
	    int anLocalInt_22_
		= Class35.anIntArray263[anLocalInt_18_] & 0xffff;
	    int anLocalInt_23_
		= (Class35.anIntArray263[anLocalInt_18_] & 0xff9514) >> 16;
	    anLocalInt_18_ = anLocalInt_18_ + 1 & 0xfff;
	    boolean anLocalBoolean = false;
	    if (((Class303.tileSettings[Class176.anInt1308]
		  [anLocalInt_19_][anLocalInt_22_])
		 & 0x4)
		== 0)
		anLocalBoolean = true;
	    boolean anLocalBoolean_24_ = false;
	    if (argument_15_ != null) {
		int anLocalInt_25_ = Class176.anInt1308 + 1;
	    while_214_:
		for (/**/; anLocalInt_25_ <= 3; anLocalInt_25_++) {
		    if (argument_15_[anLocalInt_25_] != null
			&& ((Class303.tileSettings[anLocalInt_25_]
			     [anLocalInt_19_][anLocalInt_22_])
			    & 0x8) == 0) {
			if (anLocalBoolean
			    && (argument_15_[anLocalInt_25_][anLocalInt_19_]
				[anLocalInt_22_]) != null) {
			    if ((((Class148) (argument_15_[anLocalInt_25_]
					      [anLocalInt_19_]
					      [anLocalInt_22_]))
				 .aClass104_Sub2_Sub3_1124)
				!= null) {
				int anLocalInt_26_
				    = Class62_Sub7.method1382(anLocalInt_20_,
							      -127);
				if ((anLocalInt_26_
				     == (((DoublyLinkedNodeP2_Sub2_Sub3)
					  (((Class148)
					    (argument_15_[anLocalInt_25_]
					     [anLocalInt_19_][anLocalInt_22_]))
					   .aClass104_Sub2_Sub3_1124))
					 .aShort6419))
				    || ((((Class148)
					  (argument_15_[anLocalInt_25_]
					   [anLocalInt_19_][anLocalInt_22_]))
					 .aClass104_Sub2_Sub3_1123) != null
					&& (((DoublyLinkedNodeP2_Sub2_Sub3)
					     (((Class148) (argument_15_
							   [anLocalInt_25_]
							   [anLocalInt_19_]
							   [anLocalInt_22_]))
					      .aClass104_Sub2_Sub3_1123))
					    .aShort6419) == anLocalInt_26_))
				    continue;
				if (anLocalInt_21_ != 0) {
				    int anLocalInt_27_
					= (Class62_Sub7.method1382
					   (anLocalInt_21_, -124));
				    if ((((DoublyLinkedNodeP2_Sub2_Sub3)
					  (((Class148)
					    (argument_15_[anLocalInt_25_]
					     [anLocalInt_19_][anLocalInt_22_]))
					   .aClass104_Sub2_Sub3_1124))
					 .aShort6419) == anLocalInt_27_
					|| ((((Class148) (argument_15_
							  [anLocalInt_25_]
							  [anLocalInt_19_]
							  [anLocalInt_22_]))
					     .aClass104_Sub2_Sub3_1123) != null
					    && ((((DoublyLinkedNodeP2_Sub2_Sub3)
						  (((Class148)
						    (argument_15_
						     [anLocalInt_25_]
						     [anLocalInt_19_]
						     [anLocalInt_22_]))
						   .aClass104_Sub2_Sub3_1123))
						 .aShort6419)
						== anLocalInt_27_)))
					continue;
				}
				if (anLocalInt_23_ != 0) {
				    int anLocalInt_28_
					= (Class62_Sub7.method1382
					   (anLocalInt_23_, -125));
				    if ((((DoublyLinkedNodeP2_Sub2_Sub3)
					  (((Class148)
					    (argument_15_[anLocalInt_25_]
					     [anLocalInt_19_][anLocalInt_22_]))
					   .aClass104_Sub2_Sub3_1124))
					 .aShort6419) == anLocalInt_28_
					|| ((((Class148) (argument_15_
							  [anLocalInt_25_]
							  [anLocalInt_19_]
							  [anLocalInt_22_]))
					     .aClass104_Sub2_Sub3_1123) != null
					    && (anLocalInt_28_
						== (((DoublyLinkedNodeP2_Sub2_Sub3)
						     (((Class148)
						       (argument_15_
							[anLocalInt_25_]
							[anLocalInt_19_]
							[anLocalInt_22_]))
						      .aClass104_Sub2_Sub3_1123))
						    .aShort6419))))
					continue;
				}
			    }
			    Class148 class148
				= (argument_15_[anLocalInt_25_][anLocalInt_19_]
				   [anLocalInt_22_]);
			    if (((Class148) class148).aClass110_1126 != null) {
				for (Class110 class110 = (((Class148) class148)
							  .aClass110_1126);
				     class110 != null;
				     class110 = (((Class110) class110)
						 .aClass110_912)) {
				    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
					= (((Class110) class110)
					   .aClass104_Sub2_Sub2_911);
				    if (class104_sub2_sub2
					instanceof Interface2) {
					Interface2 interface2
					    = (Interface2) class104_sub2_sub2;
					int anLocalInt_29_
					    = interface2.method2(-10908);
					int anLocalInt_30_
					    = interface2.method3(-2132);
					if (anLocalInt_29_ == 21)
					    anLocalInt_29_ = 19;
					int anLocalInt_31_
					    = (anLocalInt_30_ << 6
					       | anLocalInt_29_);
					if (anLocalInt_31_ == anLocalInt_20_
					    || (anLocalInt_21_ != 0
						&& (anLocalInt_31_
						    == anLocalInt_21_))
					    || (anLocalInt_23_ != 0
						&& (anLocalInt_31_
						    == anLocalInt_23_)))
					    continue while_214_;
				    }
				}
			    }
			}
			Class148 class148 = (argument_15_[anLocalInt_25_]
					     [anLocalInt_19_][anLocalInt_22_]);
			if (class148 != null
			    && ((Class148) class148).aClass110_1126 != null) {
			    for (Class110 class110
				     = ((Class148) class148).aClass110_1126;
				 class110 != null;
				 class110
				     = ((Class110) class110).aClass110_912) {
				DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
				    = (((Class110) class110)
				       .aClass104_Sub2_Sub2_911);
				if (((((DoublyLinkedNodeP2_Sub2_Sub2) class104_sub2_sub2)
				      .right)
				     != ((DoublyLinkedNodeP2_Sub2_Sub2)
					 class104_sub2_sub2).left)
				    || (((DoublyLinkedNodeP2_Sub2_Sub2)
					 class104_sub2_sub2).top
					!= ((DoublyLinkedNodeP2_Sub2_Sub2)
					    class104_sub2_sub2).bottom)) {
				    for (int anLocalInt_32_
					     = ((DoublyLinkedNodeP2_Sub2_Sub2)
						class104_sub2_sub2).left;
					 (((DoublyLinkedNodeP2_Sub2_Sub2)
					   class104_sub2_sub2).right
					  >= anLocalInt_32_);
					 anLocalInt_32_++) {
					for (int anLocalInt_33_
						 = (((DoublyLinkedNodeP2_Sub2_Sub2)
						     class104_sub2_sub2)
						    .bottom);
					     (((DoublyLinkedNodeP2_Sub2_Sub2)
					       class104_sub2_sub2).top
					      >= anLocalInt_33_);
					     anLocalInt_33_++)
					    Statics
						.aByteArrayArrayArray1279
						[anLocalInt_25_]
						[anLocalInt_32_]
						[anLocalInt_33_]
						= anLocalInt;
				    }
				}
			    }
			}
			Statics.aByteArrayArrayArray1279[anLocalInt_25_]
			    [anLocalInt_19_][anLocalInt_22_]
			    = anLocalInt;
			anLocalBoolean_24_ = true;
		    }
		}
	    }
	    if (anLocalBoolean_24_) {
		int anLocalInt_34_
		    = Node_Sub31_Sub5.aClass_sArray5858
			  [Class176.anInt1308 + 1]
			  .method3534(anLocalInt_19_, false, anLocalInt_22_);
		if (anLocalInt_34_ > Class227.anIntArray1642[argument])
		    Class227.anIntArray1642[argument] = anLocalInt_34_;
		int anLocalInt_35_ = anLocalInt_19_ << 9;
		if (Statics.anIntArray1179[argument] <= anLocalInt_35_) {
		    if (DiskBackedCache.anIntArray2706[argument] < anLocalInt_35_)
			DiskBackedCache.anIntArray2706[argument] = anLocalInt_35_;
		} else
		    Statics.anIntArray1179[argument] = anLocalInt_35_;
		int anLocalInt_36_ = anLocalInt_22_ << 9;
		if (DxSkybox.anIntArray4477[argument] > anLocalInt_36_)
		    DxSkybox.anIntArray4477[argument] = anLocalInt_36_;
		else if (Class60.anIntArray435[argument] < anLocalInt_36_)
		    Class60.anIntArray435[argument] = anLocalInt_36_;
	    }
	    if (!anLocalBoolean) {
		if (anLocalInt_19_ >= 1
		    && (Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			[anLocalInt_19_ - 1][anLocalInt_22_]) != anLocalInt) {
		    Class62_Sub27.anIntArray4452[anLocalInt_17_]
			= (MathStatics.OR
			   (MathStatics.OR(1179648, anLocalInt_19_ - 1), -754974720));
		    Class35.anIntArray263[anLocalInt_17_]
			= MathStatics.OR(anLocalInt_22_, 1245184);
		    anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			[anLocalInt_19_ - 1][anLocalInt_22_]
			= anLocalInt;
		}
		if (MapRelated.mapDepth > ++anLocalInt_22_) {
		    if (anLocalInt_19_ - 1 >= 0
			&& anLocalInt != (Statics.aByteArrayArrayArray1279
					  [Class176.anInt1308]
					  [anLocalInt_19_ - 1][anLocalInt_22_])
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_]
			     [anLocalInt_22_])
			    & 0x4) == 0
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_ - 1]
			     [anLocalInt_22_ - 1])
			    & 0x4) == 0) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (1375731712, MathStatics.OR(1179648, anLocalInt_19_ - 1)));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(1245184, anLocalInt_22_);
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_ - 1]
			    [anLocalInt_22_]
			    = anLocalInt;
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    }
		    if ((Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			 [anLocalInt_19_][anLocalInt_22_])
			!= anLocalInt) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (318767104, MathStatics.OR(5373952, anLocalInt_19_)));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(anLocalInt_22_, 5439488);
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_]
			    [anLocalInt_22_]
			    = anLocalInt;
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    }
		    if (MapRelated.mapWidth > anLocalInt_19_ + 1
			&& anLocalInt != (Statics.aByteArrayArrayArray1279
					  [Class176.anInt1308]
					  [anLocalInt_19_ + 1][anLocalInt_22_])
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_]
			     [anLocalInt_22_])
			    & 0x4) == 0
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_ + 1]
			     [anLocalInt_22_ - 1])
			    & 0x4) == 0) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (MathStatics.OR(anLocalInt_19_ + 1, 5373952), -1845493760));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(anLocalInt_22_, 5439488);
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_ + 1]
			    [anLocalInt_22_]
			    = anLocalInt;
		    }
		}
		anLocalInt_22_--;
		if (anLocalInt_19_ + 1 < MapRelated.mapWidth
		    && (Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			[anLocalInt_19_ + 1][anLocalInt_22_]) != anLocalInt) {
		    Class62_Sub27.anIntArray4452[anLocalInt_17_]
			= (MathStatics.OR
			   (MathStatics.OR(anLocalInt_19_ + 1, 9568256), 1392508928));
		    Class35.anIntArray263[anLocalInt_17_]
			= MathStatics.OR(9633792, anLocalInt_22_);
		    anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			[anLocalInt_19_ + 1][anLocalInt_22_]
			= anLocalInt;
		}
		if (--anLocalInt_22_ >= 0) {
		    if (anLocalInt_19_ - 1 >= 0
			&& (Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_ - 1]
			    [anLocalInt_22_]) != anLocalInt
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_]
			     [anLocalInt_22_])
			    & 0x4) == 0
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_ - 1]
			     [anLocalInt_22_ + 1])
			    & 0x4) == 0) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (MathStatics.OR(anLocalInt_19_ - 1, 13762560), 301989888));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(anLocalInt_22_, 13828096);
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_ - 1]
			    [anLocalInt_22_]
			    = anLocalInt;
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    }
		    if ((Statics.aByteArrayArrayArray1279[Class176.anInt1308]
			 [anLocalInt_19_][anLocalInt_22_])
			!= anLocalInt) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (MathStatics.OR(13762560, anLocalInt_19_), -1828716544));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(13828096, anLocalInt_22_);
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_]
			    [anLocalInt_22_]
			    = anLocalInt;
		    }
		    if (anLocalInt_19_ + 1 < MapRelated.mapWidth
			&& anLocalInt != (Statics.aByteArrayArrayArray1279
					  [Class176.anInt1308]
					  [anLocalInt_19_ + 1][anLocalInt_22_])
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_]
			     [anLocalInt_22_])
			    & 0x4) == 0
			&& ((Class303.tileSettings
			     [Class176.anInt1308][anLocalInt_19_ + 1]
			     [anLocalInt_22_ + 1])
			    & 0x4) == 0) {
			Class62_Sub27.anIntArray4452[anLocalInt_17_]
			    = (MathStatics.OR
			       (-771751936, MathStatics.OR(anLocalInt_19_ + 1, 9568256)));
			Class35.anIntArray263[anLocalInt_17_]
			    = MathStatics.OR(anLocalInt_22_, 9633792);
			Statics.aByteArrayArrayArray1279
			    [Class176.anInt1308][anLocalInt_19_ + 1]
			    [anLocalInt_22_]
			    = anLocalInt;
			anLocalInt_17_ = anLocalInt_17_ + 1 & 0xfff;
		    }
		}
	    }
	}
	if (Class227.anIntArray1642[argument] != -1000000) {
	    Class227.anIntArray1642[argument] += 40;
	    Statics.anIntArray1179[argument] -= 512;
	    DiskBackedCache.anIntArray2706[argument] += 512;
	    Class60.anIntArray435[argument] += 512;
	    DxSkybox.anIntArray4477[argument] -= 512;
	}
	return true;
    }
    
    static {
	anInt6164 = 0;
    }
}
