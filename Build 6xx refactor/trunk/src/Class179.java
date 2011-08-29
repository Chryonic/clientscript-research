/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class179
{
    static Js5Store aJs5Store_1317;
    static Class257 aClass257_1318;
    private static Class51 aClass51_1319;
    static DoublyLinkedNode_Sub51_Sub13 aClass59_Sub51_Sub13_1320;
    private static Class297 aClass297_1321;
    static Class374 aClass374_1322;
    private static JagexHashMap aJagexHashMap_1323 = new JagexHashMap(16);
    static Class20 aClass20_1324;
    static VariableValueSource anInterface13_1325;
    static byte[][][] aByteArrayArrayArray1326;
    static int anInt1327;
    static float aFloat1328;
    static CyclicLinkedList aCyclicLinkedList_1329;
    static int anInt1330 = (int) (Math.random() * 11.0) - 5;
    private static short[] aShortArray1331;
    static int anInt1332;
    static Class114 aClass114_1333;
    private static byte[] aByteArray1334 = new byte[1];
    static float aFloat1335;
    static int anInt1336;
    private static byte[] aByteArray1337;
    static int anInt1338;
    static int anInt1339;
    static int anInt1340;
    static int anInt1341;
    static int anInt1342;
    private static JagexHashMap aJagexHashMap_1343;
    private static short[] aShortArray1344;
    private static byte[] aByteArray1345;
    static int anInt1346;
    static int anInt1347;
    static int anInt1348;
    private static int[] anIntArray1349;
    private static Class366[][][] aClass366ArrayArrayArray1350;
    private static byte[] aByteArray1351;
    private static byte[] aByteArray1352;
    static int anInt1353;
    static int anInt1354;
    private static byte[] aByteArray1355;
    static int anInt1356;
    private static short[] aShortArray1357;
    
    private static final int method2799(TextureSource argument, int argument_0_,
					int argument_1_, int argument_2_) {
	Class50 class50 = aClass51_1319.method476(argument_0_, (byte) 83);
	if (class50 == null)
	    return 0;
	int anLocalInt = ((Class50) class50).anInt369;
	if (anLocalInt >= 0
	    && ((TextureDescriptor) argument.getDescriptor(anLocalInt, true)).aBoolean836)
	    anLocalInt = -1;
	int anLocalInt_3_;
	if (((Class50) class50).anInt378 >= 0) {
	    int anLocalInt_4_ = ((Class50) class50).anInt378;
	    int anLocalInt_5_ = (anLocalInt_4_ & 0x7f) + argument_2_;
	    if (anLocalInt_5_ < 0)
		anLocalInt_5_ = 0;
	    else if (anLocalInt_5_ > 127)
		anLocalInt_5_ = 127;
	    int anLocalInt_6_ = ((anLocalInt_4_ + argument_1_ & 0xfc00)
				 + (anLocalInt_4_ & 0x380) + anLocalInt_5_);
	    anLocalInt_3_
		= (HslToRgb.table2
		   [HslToRgb.method3452(Statics.method3680(anLocalInt_6_, -117, 96)) & 0xffff]) | ~0xffffff;
	} else if (anLocalInt >= 0)
	    anLocalInt_3_
		= (HslToRgb.table2
		   [(HslToRgb.method3452(Statics.method3680(((TextureDescriptor) argument.getDescriptor(anLocalInt, true)).aShort831, -112, 96))) & 0xffff]) | ~0xffffff;
	else if (((Class50) class50).anInt376 == -1)
	    anLocalInt_3_ = 0;
	else {
	    int anLocalInt_7_ = ((Class50) class50).anInt376;
	    int anLocalInt_8_ = (anLocalInt_7_ & 0x7f) + argument_2_;
	    if (anLocalInt_8_ < 0)
		anLocalInt_8_ = 0;
	    else if (anLocalInt_8_ > 127)
		anLocalInt_8_ = 127;
	    int anLocalInt_9_ = ((anLocalInt_7_ + argument_1_ & 0xfc00)
				 + (anLocalInt_7_ & 0x380) + anLocalInt_8_);
	    anLocalInt_3_
		= (HslToRgb.table2
		   [HslToRgb.method3452(Statics.method3680(anLocalInt_9_, -116, 96)) & 0xffff]) | ~0xffffff;
	}
	return anLocalInt_3_;
    }
    
    static final DoublyLinkedNode_Sub51_Sub13 method2800(int x,
						int z) {
	for (DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13
		 = (DoublyLinkedNode_Sub51_Sub13) aJagexHashMap_1323.first(0);
	     class59_sub51_sub13 != null;
	     class59_sub51_sub13 = ((DoublyLinkedNode_Sub51_Sub13)
				    aJagexHashMap_1323.next())) {
	    if (class59_sub51_sub13.aBoolean6294
		&& class59_sub51_sub13.method1267(x, -30, z))
            System.out.println("A"+x+"_"+z+" - "+class59_sub51_sub13.aString6291+" "+class59_sub51_sub13.aString6302);
		return class59_sub51_sub13;
	}
	return null;
    }
    
    static final void method2801(GraphicsToolkit argument) {
	int anLocalInt = anInt1346 - anInt1338;
	int anLocalInt_11_ = anInt1339 - anInt1347;
	int anLocalInt_12_ = (anInt1348 - anInt1341 << 16) / anLocalInt;
	int anLocalInt_13_ = (anInt1356 - anInt1336 << 16) / anLocalInt_11_;
	method2802(argument, anLocalInt_12_, anLocalInt_13_, 0, 0);
    }
    
    private static final void method2802(GraphicsToolkit argument, int argument_14_,
					 int argument_15_, int argument_16_,
					 int argument_17_) {
	int anLocalInt = anInt1346 - anInt1338;
	int anLocalInt_18_ = anInt1339 - anInt1347;
	if (anInt1346 < anInt1354)
	    anLocalInt++;
	if (anInt1339 < anInt1342)
	    anLocalInt_18_++;
	for (int anLocalInt_19_ = 0; anLocalInt_19_ < anLocalInt;
	     anLocalInt_19_++) {
	    int anLocalInt_20_
		= ((argument_16_ + argument_14_ * anLocalInt_19_ >> 16)
		   + anInt1341);
	    int anLocalInt_21_
		= ((argument_16_ + argument_14_ * (anLocalInt_19_ + 1) >> 16)
		   + anInt1341);
	    int anLocalInt_22_ = anLocalInt_21_ - anLocalInt_20_;
	    if (anLocalInt_22_ > 0) {
		int anLocalInt_23_ = anInt1338 + anLocalInt_19_;
		if (anLocalInt_23_ < 0 || anLocalInt_23_ >= anInt1354) {
		    for (int anLocalInt_24_ = 0;
			 anLocalInt_24_ < anLocalInt_18_; anLocalInt_24_++) {
			int anLocalInt_25_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * (anLocalInt_24_
								 + 1)
				  >> 16));
			int anLocalInt_26_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * anLocalInt_24_
				  >> 16));
			int anLocalInt_27_ = anLocalInt_26_ - anLocalInt_25_;
			int anLocalInt_28_;
			if ((((DoublyLinkedNode_Sub51_Sub13) aClass59_Sub51_Sub13_1320)
			     .anInt6293)
			    != -1)
			    anLocalInt_28_ = (((DoublyLinkedNode_Sub51_Sub13)
					       aClass59_Sub51_Sub13_1320)
					      .anInt6293) | ~0xffffff;
			else if ((anLocalInt_19_ + anInt1338 & 0x4)
				 != (anLocalInt_24_ + anInt1339 & 0x4))
			    anLocalInt_28_ = -11840664;
			else
			    anLocalInt_28_
				= (anIntArray1349
				   [((Class51) aClass51_1319).anInt389 + 1]);
			if (anLocalInt_28_ == 0)
			    anLocalInt_28_ = -16777216;
			argument.fillRect(anLocalInt_20_, anLocalInt_25_, anLocalInt_22_, anLocalInt_27_, anLocalInt_28_, 0);
		    }
		} else {
		    for (int anLocalInt_29_ = 0;
			 anLocalInt_29_ < anLocalInt_18_; anLocalInt_29_++) {
			int anLocalInt_30_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * (anLocalInt_29_
								 + 1)
				  >> 16));
			int anLocalInt_31_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * anLocalInt_29_
				  >> 16));
			int anLocalInt_32_ = anLocalInt_31_ - anLocalInt_30_;
			if (anLocalInt_32_ > 0) {
			    int anLocalInt_33_ = anLocalInt_29_ + anInt1347;
			    int anLocalInt_34_
				= anLocalInt_23_ + anLocalInt_33_ * anInt1354;
			    int anLocalInt_35_ = 0;
			    int anLocalInt_36_ = 0;
			    int anLocalInt_37_ = 0;
			    if (anLocalInt_33_ >= 0
				&& anLocalInt_33_ < anInt1342) {
				anLocalInt_35_
				    = (((aByteArray1337[anLocalInt_34_] & 0xff)
					<< 16)
				       | (aShortArray1344[anLocalInt_34_]
					  & 0xffff));
				if (anLocalInt_35_ != 0)
				    anLocalInt_35_ |= ~0xffffff;
				anLocalInt_36_
				    = aByteArray1351[anLocalInt_34_] & 0xff;
				anLocalInt_37_
				    = aShortArray1357[anLocalInt_34_] & 0xffff;
			    }
			    if (anLocalInt_35_ == 0 && anLocalInt_36_ == 0
				&& anLocalInt_37_ == 0) {
				if (((DoublyLinkedNode_Sub51_Sub13)
				     aClass59_Sub51_Sub13_1320).anInt6293
				    != -1)
				    anLocalInt_35_
					= (((DoublyLinkedNode_Sub51_Sub13)
					    aClass59_Sub51_Sub13_1320)
					   .anInt6293) | ~0xffffff;
				else if ((anLocalInt_19_ + anInt1338 & 0x4)
					 != (anLocalInt_29_ + anInt1339 & 0x4))
				    anLocalInt_35_ = -11840664;
				else
				    anLocalInt_35_
					= (anIntArray1349
					   [(((Class51) aClass51_1319).anInt389
					     + 1)]);
				if (anLocalInt_35_ == 0)
				    anLocalInt_35_ = -16777216;
				argument.fillRect(anLocalInt_20_, anLocalInt_30_, anLocalInt_22_, anLocalInt_32_, anLocalInt_35_, 0);
			    } else if (anLocalInt_37_ > 0) {
				if (anLocalInt_37_ == 65535) {
				    Node_Sub12 class59_sub12
					= ((Node_Sub12)
					   (aJagexHashMap_1343.get((long) (anLocalInt_23_ << 16 | anLocalInt_33_))));
				    if (class59_sub12 != null)
					method2822
					    (argument, anLocalInt_20_,
					     anLocalInt_30_, anLocalInt_22_,
					     anLocalInt_32_, anLocalInt_35_,
					     anLocalInt_36_,
					     aByteArray1355[anLocalInt_34_],
					     (((Node_Sub12) class59_sub12)
					      .aShortArray3949),
					     (((Node_Sub12) class59_sub12)
					      .aByteArray3948),
					     true);
				} else {
				    aShortArray1331[0]
					= (short) (anLocalInt_37_ - 1);
				    aByteArray1334[0]
					= aByteArray1345[anLocalInt_34_];
				    method2822(argument, anLocalInt_20_,
					       anLocalInt_30_, anLocalInt_22_,
					       anLocalInt_32_, anLocalInt_35_,
					       anLocalInt_36_,
					       aByteArray1355[anLocalInt_34_],
					       aShortArray1331, aByteArray1334,
					       true);
				}
			    } else
				method2822(argument, anLocalInt_20_,
					   anLocalInt_30_, anLocalInt_22_,
					   anLocalInt_32_, anLocalInt_35_,
					   anLocalInt_36_,
					   aByteArray1355[anLocalInt_34_],
					   null, null, true);
			}
		    }
		}
	    }
	}
	for (int anLocalInt_38_ = -16; anLocalInt_38_ < anLocalInt + 16;
	     anLocalInt_38_++) {
	    int anLocalInt_39_
		= ((argument_16_ + argument_14_ * anLocalInt_38_ >> 16)
		   + anInt1341);
	    int anLocalInt_40_
		= ((argument_16_ + argument_14_ * (anLocalInt_38_ + 1) >> 16)
		   + anInt1341);
	    int anLocalInt_41_ = anLocalInt_40_ - anLocalInt_39_;
	    if (anLocalInt_41_ > 0) {
		int anLocalInt_42_ = anLocalInt_38_ + anInt1338;
		if (anLocalInt_42_ >= 0 && anLocalInt_42_ < anInt1354) {
		    for (int anLocalInt_43_ = -16;
			 anLocalInt_43_ < anLocalInt_18_ + 16;
			 anLocalInt_43_++) {
			int anLocalInt_44_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * (anLocalInt_43_
								 + 1)
				  >> 16));
			int anLocalInt_45_
			    = (anInt1356
			       - (argument_17_ + argument_15_ * anLocalInt_43_
				  >> 16));
			int anLocalInt_46_ = anLocalInt_45_ - anLocalInt_44_;
			if (anLocalInt_46_ > 0) {
			    int anLocalInt_47_ = anLocalInt_43_ + anInt1347;
			    if (anLocalInt_47_ >= 0
				&& anLocalInt_47_ < anInt1342) {
				int anLocalInt_48_
				    = ((aShortArray1357
					[(anLocalInt_42_
					  + anLocalInt_47_ * anInt1354)])
				       & 0xffff);
				if (anLocalInt_48_ > 0) {
				    if (anLocalInt_48_ == 65535) {
					Node_Sub12 class59_sub12
					    = ((Node_Sub12)
					       (aJagexHashMap_1343.get((long) (anLocalInt_42_ << 16 | anLocalInt_47_))));
					if (class59_sub12 != null)
					    method2805(argument,
						       anLocalInt_39_,
						       anLocalInt_44_,
						       anLocalInt_41_,
						       anLocalInt_46_,
						       (((Node_Sub12)
							 class59_sub12)
							.aShortArray3949),
						       (((Node_Sub12)
							 class59_sub12)
							.aByteArray3948));
				    } else {
					aShortArray1331[0]
					    = (short) (anLocalInt_48_ - 1);
					aByteArray1334[0]
					    = (aByteArray1345
					       [(anLocalInt_42_
						 + (anLocalInt_47_
						    * anInt1354))]);
					method2805(argument, anLocalInt_39_,
						   anLocalInt_44_,
						   anLocalInt_41_,
						   anLocalInt_46_,
						   aShortArray1331,
						   aByteArray1334);
				    }
				} else
				    method2805(argument, anLocalInt_39_,
					       anLocalInt_44_, anLocalInt_41_,
					       anLocalInt_46_, null, null);
			    }
			}
		    }
		}
	    }
	}
	int anLocalInt_49_ = anInt1338 >> 6;
	int anLocalInt_50_ = anInt1347 >> 6;
	if (anLocalInt_49_ < 0)
	    anLocalInt_49_ = 0;
	if (anLocalInt_50_ < 0)
	    anLocalInt_50_ = 0;
	int anLocalInt_51_ = anInt1346 >> 6;
	int anLocalInt_52_ = anInt1339 >> 6;
	if (anLocalInt_51_ >= aClass366ArrayArrayArray1350[0].length)
	    anLocalInt_51_ = aClass366ArrayArrayArray1350[0].length - 1;
	if (anLocalInt_52_ >= aClass366ArrayArrayArray1350[0][0].length)
	    anLocalInt_52_ = aClass366ArrayArrayArray1350[0][0].length - 1;
	for (int anLocalInt_53_ = 0; anLocalInt_53_ < 3; anLocalInt_53_++) {
	    for (int anLocalInt_54_ = anLocalInt_49_;
		 anLocalInt_54_ <= anLocalInt_51_; anLocalInt_54_++) {
		for (int anLocalInt_55_ = anLocalInt_50_;
		     anLocalInt_55_ <= anLocalInt_52_; anLocalInt_55_++) {
		    Class366 class366
			= (aClass366ArrayArrayArray1350[anLocalInt_53_]
			   [anLocalInt_54_][anLocalInt_55_]);
		    if (class366 != null) {
			int anLocalInt_56_
			    = (anLocalInt_54_ + (anInt1353 >> 6)) * 64;
			int anLocalInt_57_
			    = (anLocalInt_55_ + (anInt1340 >> 6)) * 64;
			for (DoublyLinkedNodeP2_Sub1 class104_sub1
				 = (DoublyLinkedNodeP2_Sub1) class366.method3986(0);
			     class104_sub1 != null;
			     class104_sub1
				 = ((DoublyLinkedNodeP2_Sub1)
				    class366.method3992((byte) 32))) {
			    int anLocalInt_58_
				= (anLocalInt_56_
				   + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4501
				   - anInt1353 - anInt1338);
			    int anLocalInt_59_
				= (anLocalInt_57_
				   + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4504
				   - anInt1340 - anInt1347);
			    int anLocalInt_60_
				= (argument_16_ + argument_14_ * anLocalInt_58_
				   >> 16) + anInt1341;
			    int anLocalInt_61_
				= (((argument_16_
				     + argument_14_ * (anLocalInt_58_ + 1))
				    >> 16)
				   + anInt1341);
			    int anLocalInt_62_
				= (anInt1356
				   - ((argument_17_
				       + argument_15_ * (anLocalInt_59_ + 1))
				      >> 16));
			    int anLocalInt_63_
				= (anInt1356
				   - ((argument_17_
				       + argument_15_ * anLocalInt_59_)
				      >> 16));
			    method2822
				(argument, anLocalInt_60_, anLocalInt_62_,
				 anLocalInt_61_ - anLocalInt_60_,
				 anLocalInt_63_ - anLocalInt_62_,
				 ((DoublyLinkedNodeP2_Sub1) class104_sub1).anInt4505,
				 (((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4503
				  & 0xff),
				 ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4502,
				 (((DoublyLinkedNodeP2_Sub1) class104_sub1)
				  .aShortArray4507),
				 (((DoublyLinkedNodeP2_Sub1) class104_sub1)
				  .aByteArray4506),
				 false);
			}
		    }
		}
	    }
	    for (int anLocalInt_64_ = anLocalInt_49_;
		 anLocalInt_64_ <= anLocalInt_51_; anLocalInt_64_++) {
		for (int anLocalInt_65_ = anLocalInt_50_;
		     anLocalInt_65_ <= anLocalInt_52_; anLocalInt_65_++) {
		    Class366 class366
			= (aClass366ArrayArrayArray1350[anLocalInt_53_]
			   [anLocalInt_64_][anLocalInt_65_]);
		    if (class366 != null) {
			int anLocalInt_66_
			    = (anLocalInt_64_ + (anInt1353 >> 6)) * 64;
			int anLocalInt_67_
			    = (anLocalInt_65_ + (anInt1340 >> 6)) * 64;
			for (DoublyLinkedNodeP2_Sub1 class104_sub1
				 = (DoublyLinkedNodeP2_Sub1) class366.method3986(0);
			     class104_sub1 != null;
			     class104_sub1
				 = ((DoublyLinkedNodeP2_Sub1)
				    class366.method3992((byte) -101))) {
			    int anLocalInt_68_
				= (anLocalInt_66_
				   + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4501
				   - anInt1353 - anInt1338);
			    int anLocalInt_69_
				= (anLocalInt_67_
				   + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4504
				   - anInt1340 - anInt1347);
			    int anLocalInt_70_
				= (argument_16_ + argument_14_ * anLocalInt_68_
				   >> 16) + anInt1341;
			    int anLocalInt_71_
				= (((argument_16_
				     + argument_14_ * (anLocalInt_68_ + 1))
				    >> 16)
				   + anInt1341);
			    int anLocalInt_72_
				= (anInt1356
				   - ((argument_17_
				       + argument_15_ * (anLocalInt_69_ + 1))
				      >> 16));
			    int anLocalInt_73_
				= (anInt1356
				   - ((argument_17_
				       + argument_15_ * anLocalInt_69_)
				      >> 16));
			    method2805(argument, anLocalInt_70_,
				       anLocalInt_72_,
				       anLocalInt_71_ - anLocalInt_70_,
				       anLocalInt_73_ - anLocalInt_72_,
				       (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					.aShortArray4507),
				       (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					.aByteArray4506));
			}
		    }
		}
	    }
	}
    }
    
    static final void method2803(Js5Store argument, Class51 argument_74_,
				 Class297 argument_75_, Class257 argument_76_,
				 Class20 argument_77_, Class374 argument_78_,
				 VariableValueSource argument_79_) {
	aJs5Store_1317 = argument;
	aClass51_1319 = argument_74_;
	aClass297_1321 = argument_75_;
	aClass257_1318 = argument_76_;
	aClass20_1324 = argument_77_;
	aClass374_1322 = argument_78_;
	anInterface13_1325 = argument_79_;
	aJagexHashMap_1323.method1527(0);
	int anLocalInt = aJs5Store_1317.getID("details");
	int[] anLocalInts = aJs5Store_1317.getSubFilePtr(anLocalInt);
	if (anLocalInts != null) {
	    for (int anLocalInt_80_ = 0; anLocalInt_80_ < anLocalInts.length;
		 anLocalInt_80_++) {
		DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13
		    = Node_Sub32.method1009(0, aJs5Store_1317,
                anLocalInts[anLocalInt_80_],
                anLocalInt);
		aJagexHashMap_1323.put((long) (((DoublyLinkedNode_Sub51_Sub13) class59_sub51_sub13).anInt6299), class59_sub51_sub13);
	    }
	}
	Node_Sub47_Sub1.method1116(false, true, true);
    }
    
    static final void method2804() {
	aByteArray1352 = new byte[anInt1354 * anInt1342];
	aByteArray1351 = new byte[anInt1354 * anInt1342];
	aByteArray1355 = new byte[anInt1354 * anInt1342];
	aShortArray1357 = new short[anInt1354 * anInt1342];
	aByteArray1345 = new byte[anInt1354 * anInt1342];
	aJagexHashMap_1343 = new JagexHashMap(1024);
	aClass366ArrayArrayArray1350
	    = new Class366[3][anInt1354 >> 6][anInt1342 >> 6];
	anIntArray1349 = new int[((Class51) aClass51_1319).anInt382 + 1];
    }
    
    private static final void method2805
	(GraphicsToolkit argument, int argument_81_, int argument_82_,
	 int argument_83_, int argument_84_, short[] argument_85_,
	 byte[] argument_86_) {
	if (argument_85_ != null) {
	    for (int anLocalInt = 0; anLocalInt < argument_85_.length;
		 anLocalInt++) {
		Class266 class266
		    = aClass257_1318.method3298((byte) 86,
						(argument_85_[anLocalInt]
						 & 0xffff));
		int anLocalInt_87_ = ((Class266) class266).anInt2058;
		if (anLocalInt_87_ != -1) {
		    Class181 class181
			= aClass374_1322.method4083(anLocalInt_87_,
						    (byte) -104);
		    Class368 class368
			= (class181.method2840
			   ((((Class266) class266).aBoolean2098
			     ? argument_86_[anLocalInt] >> 6 & 0x3 : 0),
			    -14563,
			    (((Class266) class266).aBoolean2101
			     ? ((Class266) class266).aBoolean2088 : false),
			    argument));
		    if (class368 != null) {
			int anLocalInt_88_
			    = argument_83_ * class368.getWidth() >> 2;
			int anLocalInt_89_
			    = argument_84_ * class368.method4018() >> 2;
			if (((Class181) class181).aBoolean1374) {
			    int anLocalInt_90_
				= ((Class266) class266).anInt2128;
			    int anLocalInt_91_
				= ((Class266) class266).anInt2131;
			    if ((argument_86_[anLocalInt] >> 6 & 0x1) == 1) {
				int anLocalInt_92_ = anLocalInt_90_;
				anLocalInt_90_ = anLocalInt_91_;
				anLocalInt_91_ = anLocalInt_92_;
			    }
			    anLocalInt_88_ = anLocalInt_90_ * argument_83_;
			    anLocalInt_89_ = anLocalInt_91_ * argument_84_;
			}
			if (anLocalInt_88_ != 0 && anLocalInt_89_ != 0) {
			    if (((Class181) class181).anInt1372 != 0)
				class368.method4016(argument_81_,
						    (argument_82_
						     - anLocalInt_89_
						     + argument_84_),
						    anLocalInt_88_,
						    anLocalInt_89_, 0,
						    (((Class181) class181)
						     .anInt1372) | ~0xffffff,
						    1);
			    else
				class368.method4011(argument_81_,
						    (argument_82_
						     - anLocalInt_89_
						     + argument_84_),
						    anLocalInt_88_,
						    anLocalInt_89_);
			}
		    }
		}
	    }
	}
    }
    
    static final void method2806() {
	int[] anLocalInts = new int[3];
	for (int anLocalInt = 0;
	     anLocalInt < ((Class114) aClass114_1333).anInt946; anLocalInt++) {
	    boolean anLocalBoolean
		= (aClass59_Sub51_Sub13_1320.method1260
		   (-33,
		    (((Class114) aClass114_1333).anIntArray947[anLocalInt]
		     & 0x3fff),
		    (((Class114) aClass114_1333).anIntArray947[anLocalInt]
		     >> 14) & 0x3fff,
		    anLocalInts,
		    (((Class114) aClass114_1333).anIntArray947[anLocalInt]
		     >> 28) & 0x3));
	    if (anLocalBoolean) {
		Node_Sub7 class59_sub7
		    = new Node_Sub7(((Class114) aClass114_1333)
				       .anIntArray948[anLocalInt]);
		((Node_Sub7) class59_sub7).anInt3918
		    = anLocalInts[1] - anInt1353;
		((Node_Sub7) class59_sub7).anInt3911
		    = anLocalInts[2] - anInt1340;
		aCyclicLinkedList_1329.add(class59_sub7);
	    }
	}
    }
    
    private static final void method2807() {
	for (int anLocalInt = 0; anLocalInt < anInt1354; anLocalInt++) {
	    for (int anLocalInt_93_ = 0; anLocalInt_93_ < anInt1342;
		 anLocalInt_93_++) {
		int anLocalInt_94_
		    = (aShortArray1357[anLocalInt + anLocalInt_93_ * anInt1354]
		       & 0xffff);
		if (anLocalInt_94_ != 0) {
		    if (anLocalInt_94_ == 65535) {
			Node_Sub12 class59_sub12
			    = ((Node_Sub12)
			       (aJagexHashMap_1343.get((long) (anLocalInt << 16 | anLocalInt_93_))));
			if (class59_sub12 != null) {
			    for (int anLocalInt_95_ = 0;
				 (anLocalInt_95_
				  < (((Node_Sub12) class59_sub12)
				     .aShortArray3949).length);
				 anLocalInt_95_++) {
				Class266 class266
				    = (aClass257_1318.method3298
				       ((byte) 83,
					((((Node_Sub12) class59_sub12)
					  .aShortArray3949[anLocalInt_95_])
					 & 0xffff)));
				int anLocalInt_96_
				    = ((Class266) class266).anInt2077;
				if (((Class266) class266).anIntArray2067
				    != null) {
				    class266 = (class266.method3345
						(1, anInterface13_1325));
				    if (class266 != null)
					anLocalInt_96_
					    = ((Class266) class266).anInt2077;
				}
				if (anLocalInt_96_ != -1) {
				    Node_Sub7 class59_sub7
					= new Node_Sub7(anLocalInt_96_);
				    ((Node_Sub7) class59_sub7).anInt3918
					= anLocalInt;
				    ((Node_Sub7) class59_sub7).anInt3911
					= anLocalInt_93_;
				    aCyclicLinkedList_1329.add(class59_sub7);
				}
			    }
			}
		    } else {
			Class266 class266
			    = aClass257_1318.method3298((byte) 122,
							anLocalInt_94_ - 1);
			int anLocalInt_97_ = ((Class266) class266).anInt2077;
			if (((Class266) class266).anIntArray2067 != null) {
			    class266
				= class266.method3345(1, anInterface13_1325);
			    if (class266 != null)
				anLocalInt_97_
				    = ((Class266) class266).anInt2077;
			}
			if (anLocalInt_97_ != -1) {
			    Node_Sub7 class59_sub7
				= new Node_Sub7(anLocalInt_97_);
			    ((Node_Sub7) class59_sub7).anInt3918
				= anLocalInt;
			    ((Node_Sub7) class59_sub7).anInt3911
				= anLocalInt_93_;
			    aCyclicLinkedList_1329.add(class59_sub7);
			}
		    }
		}
	    }
	}
	for (int anLocalInt = 0; anLocalInt < 3; anLocalInt++) {
	    for (int anLocalInt_98_ = 0;
		 anLocalInt_98_ < aClass366ArrayArrayArray1350[0].length;
		 anLocalInt_98_++) {
		for (int anLocalInt_99_ = 0;
		     (anLocalInt_99_
		      < aClass366ArrayArrayArray1350[0][0].length);
		     anLocalInt_99_++) {
		    Class366 class366
			= (aClass366ArrayArrayArray1350[anLocalInt]
			   [anLocalInt_98_][anLocalInt_99_]);
		    if (class366 != null) {
			for (DoublyLinkedNodeP2_Sub1 class104_sub1
				 = (DoublyLinkedNodeP2_Sub1) class366.method3986(0);
			     class104_sub1 != null;
			     class104_sub1
				 = ((DoublyLinkedNodeP2_Sub1)
				    class366.method3992((byte) -112))) {
			    if (((DoublyLinkedNodeP2_Sub1) class104_sub1).aShortArray4507
				!= null) {
				for (int anLocalInt_100_ = 0;
				     (anLocalInt_100_
				      < (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					 .aShortArray4507).length);
				     anLocalInt_100_++) {
				    Class266 class266
					= (aClass257_1318.method3298
					   ((byte) 24,
					    (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					     .aShortArray4507
					     [anLocalInt_100_]) & 0xffff));
				    int anLocalInt_101_
					= ((Class266) class266).anInt2077;
				    if (((Class266) class266).anIntArray2067
					!= null) {
					class266 = (class266.method3345
						    (1, anInterface13_1325));
					if (class266 != null)
					    anLocalInt_101_
						= (((Class266) class266)
						   .anInt2077);
				    }
				    if (anLocalInt_101_ != -1) {
					Node_Sub7 class59_sub7
					    = (new Node_Sub7
					       (anLocalInt_101_));
					((Node_Sub7) class59_sub7).anInt3918
					    = ((anLocalInt_98_
						+ (anInt1353 >> 6)) * 64
					       + ((DoublyLinkedNodeP2_Sub1)
						  class104_sub1).aByte4501
					       - anInt1353);
					((Node_Sub7) class59_sub7).anInt3911
					    = ((anLocalInt_99_
						+ (anInt1340 >> 6)) * 64
					       + ((DoublyLinkedNodeP2_Sub1)
						  class104_sub1).aByte4504
					       - anInt1340);
					aCyclicLinkedList_1329
					    .add(class59_sub7);
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method2808() {
	aClass51_1319 = null;
	aClass297_1321 = null;
	aClass257_1318 = null;
	aClass20_1324 = null;
	aClass374_1322 = null;
	anInterface13_1325 = null;
	aClass59_Sub51_Sub13_1320 = null;
	aJs5Store_1317 = null;
	aJagexHashMap_1323 = null;
	aByteArrayArrayArray1326 = null;
	aShortArray1331 = null;
	aByteArray1334 = null;
	aClass114_1333 = null;
	aCyclicLinkedList_1329 = null;
	anIntArray1349 = null;
	aByteArray1352 = null;
	aByteArray1337 = null;
	aShortArray1344 = null;
	aByteArray1351 = null;
	aByteArray1355 = null;
	aShortArray1357 = null;
	aByteArray1345 = null;
	aJagexHashMap_1343 = null;
	aClass366ArrayArrayArray1350 = null;
    }
    
    static final DoublyLinkedNode_Sub51_Sub13 method2809(int argument) {
	return ((DoublyLinkedNode_Sub51_Sub13)
		aJagexHashMap_1323.get((long) argument));
    }
    
    static final void method2810(int argument) {
	aClass59_Sub51_Sub13_1320
	    = (DoublyLinkedNode_Sub51_Sub13) aJagexHashMap_1323.get((long) argument);
    }
    
    private static final void method2811
	(byte[] argument, byte[] argument_102_, short[] argument_103_,
	 int argument_104_, int argument_105_) {
	int[] anLocalInts = new int[anInt1342];
	int[] anLocalInts_106_ = new int[anInt1342];
	int[] anLocalInts_107_ = new int[anInt1342];
	int[] anLocalInts_108_ = new int[anInt1342];
	int[] anLocalInts_109_ = new int[anInt1342];
	for (int anLocalInt = -5; anLocalInt < anInt1354; anLocalInt++) {
	    int anLocalInt_110_ = anLocalInt + 5;
	    int anLocalInt_111_ = anLocalInt - 5;
	    for (int anLocalInt_112_ = 0; anLocalInt_112_ < anInt1342;
		 anLocalInt_112_++) {
		if (anLocalInt_110_ < anInt1354) {
		    int anLocalInt_113_
			= ((argument
			    [anLocalInt_110_ + anLocalInt_112_ * anInt1354])
			   & 0xff);
		    if (anLocalInt_113_ > 0) {
			Class260 class260
			    = aClass297_1321.method3512(18912,
							anLocalInt_113_ - 1);
			anLocalInts[anLocalInt_112_]
			    += ((Class260) class260).anInt2030;
			anLocalInts_106_[anLocalInt_112_]
			    += ((Class260) class260).anInt2036;
			anLocalInts_107_[anLocalInt_112_]
			    += ((Class260) class260).anInt2028;
			anLocalInts_108_[anLocalInt_112_]
			    += ((Class260) class260).anInt2033;
			anLocalInts_109_[anLocalInt_112_]++;
		    }
		}
		if (anLocalInt_111_ >= 0) {
		    int anLocalInt_114_
			= ((argument
			    [anLocalInt_111_ + anLocalInt_112_ * anInt1354])
			   & 0xff);
		    if (anLocalInt_114_ > 0) {
			Class260 class260
			    = aClass297_1321.method3512(18912,
							anLocalInt_114_ - 1);
			anLocalInts[anLocalInt_112_]
			    -= ((Class260) class260).anInt2030;
			anLocalInts_106_[anLocalInt_112_]
			    -= ((Class260) class260).anInt2036;
			anLocalInts_107_[anLocalInt_112_]
			    -= ((Class260) class260).anInt2028;
			anLocalInts_108_[anLocalInt_112_]
			    -= ((Class260) class260).anInt2033;
			anLocalInts_109_[anLocalInt_112_]--;
		    }
		}
	    }
	    if (anLocalInt >= 0) {
		int anLocalInt_115_ = 0;
		int anLocalInt_116_ = 0;
		int anLocalInt_117_ = 0;
		int anLocalInt_118_ = 0;
		int anLocalInt_119_ = 0;
		for (int anLocalInt_120_ = -5; anLocalInt_120_ < anInt1342;
		     anLocalInt_120_++) {
		    int anLocalInt_121_ = anLocalInt_120_ + 5;
		    if (anLocalInt_121_ < anInt1342) {
			anLocalInt_115_ += anLocalInts[anLocalInt_121_];
			anLocalInt_116_ += anLocalInts_106_[anLocalInt_121_];
			anLocalInt_117_ += anLocalInts_107_[anLocalInt_121_];
			anLocalInt_118_ += anLocalInts_108_[anLocalInt_121_];
			anLocalInt_119_ += anLocalInts_109_[anLocalInt_121_];
		    }
		    int anLocalInt_122_ = anLocalInt_120_ - 5;
		    if (anLocalInt_122_ >= 0) {
			anLocalInt_115_ -= anLocalInts[anLocalInt_122_];
			anLocalInt_116_ -= anLocalInts_106_[anLocalInt_122_];
			anLocalInt_117_ -= anLocalInts_107_[anLocalInt_122_];
			anLocalInt_118_ -= anLocalInts_108_[anLocalInt_122_];
			anLocalInt_119_ -= anLocalInts_109_[anLocalInt_122_];
		    }
		    if (anLocalInt_120_ >= 0 && anLocalInt_119_ > 0) {
			if ((argument[anLocalInt + anLocalInt_120_ * anInt1354]
			     & 0xff)
			    == 0) {
			    int anLocalInt_123_
				= anLocalInt + anLocalInt_120_ * anInt1354;
			    argument_102_[anLocalInt_123_] = (byte) 0;
			    argument_103_[anLocalInt_123_] = (short) 0;
			} else {
			    int anLocalInt_124_
				= (anLocalInt_118_ == 0 ? 0
				   : (Node_Sub31_Sub22.method944
                        (anLocalInt_117_ / anLocalInt_119_,
                                anLocalInt_115_ * 256 / anLocalInt_118_,
                                (byte) -39,
                                anLocalInt_116_ / anLocalInt_119_)));
			    int anLocalInt_125_
				= (anLocalInt_124_ & 0x7f) + argument_105_;
			    if (anLocalInt_125_ < 0)
				anLocalInt_125_ = 0;
			    else if (anLocalInt_125_ > 127)
				anLocalInt_125_ = 127;
			    int anLocalInt_126_
				= ((anLocalInt_124_ + argument_104_ & 0xfc00)
				   + (anLocalInt_124_ & 0x380)
				   + anLocalInt_125_);
			    int anLocalInt_127_
				= anLocalInt + anLocalInt_120_ * anInt1354;
			    int anLocalInt_128_
				= (HslToRgb.table2
				   [(HslToRgb.method3452(Class51.method469(27743, 96, anLocalInt_126_))) & 0xffff]);
			    argument_102_[anLocalInt_127_]
				= (byte) (anLocalInt_128_ >> 16 & 0xff);
			    argument_103_[anLocalInt_127_]
				= (short) (anLocalInt_128_ & 0xffff);
			}
		    }
		}
	    }
	}
    }
    
    private static final void method2812
	(GraphicsToolkit argument, Packet argument_129_, int argument_130_,
	 int argument_131_, int argument_132_, int argument_133_,
	 int[] argument_134_, int[] argument_135_) {
	int anLocalInt = argument_129_.g1();
	if ((anLocalInt & 0x1) == 0) {
	    boolean anLocalBoolean = (anLocalInt & 0x2) == 0;
	    int anLocalInt_136_ = anLocalInt >> 2 & 0x3f;
	    if (anLocalInt_136_ != 62) {
		if (anLocalInt_136_ == 63)
		    anLocalInt_136_ = argument_129_.g1();
		else if (anLocalBoolean)
		    anLocalInt_136_ = argument_134_[anLocalInt_136_];
		else
		    anLocalInt_136_ = argument_135_[anLocalInt_136_];
		if (anLocalBoolean) {
		    aByteArray1352[argument_132_ + argument_133_ * anInt1354]
			= (byte) anLocalInt_136_;
		    aByteArray1351[argument_132_ + argument_133_ * anInt1354]
			= (byte) 0;
		} else {
		    aByteArray1351[argument_132_ + argument_133_ * anInt1354]
			= (byte) anLocalInt_136_;
		    aByteArray1355[argument_132_ + argument_133_ * anInt1354]
			= (byte) 0;
		    aByteArray1352[argument_132_ + argument_133_ * anInt1354]
			= argument_129_.g1s();
		}
	    }
	} else {
	    int anLocalInt_137_ = (anLocalInt >> 1 & 0x3) + 1;
	    boolean anLocalBoolean = (anLocalInt & 0x8) != 0;
	    boolean anLocalBoolean_138_ = (anLocalInt & 0x10) != 0;
	    for (int anLocalInt_139_ = 0; anLocalInt_139_ < anLocalInt_137_;
		 anLocalInt_139_++) {
		int anLocalInt_140_ = argument_129_.g1();
		int anLocalInt_141_ = 0;
		int anLocalInt_142_ = 0;
		if (anLocalBoolean) {
		    anLocalInt_141_ = argument_129_.g1();
		    anLocalInt_142_ = argument_129_.g1();
		}
		int anLocalInt_143_ = 0;
		if (anLocalBoolean_138_)
		    anLocalInt_143_ = argument_129_.g1();
		if (anLocalInt_139_ == 0) {
		    aByteArray1352[argument_132_ + argument_133_ * anInt1354]
			= (byte) anLocalInt_140_;
		    aByteArray1351[argument_132_ + argument_133_ * anInt1354]
			= (byte) anLocalInt_141_;
		    aByteArray1355[argument_132_ + argument_133_ * anInt1354]
			= (byte) anLocalInt_142_;
		    if (anLocalInt_143_ == 1) {
			aShortArray1357[(argument_132_
					 + argument_133_ * anInt1354)]
			    = (short) (argument_129_.g2() + 1);
			aByteArray1345[(argument_132_
					+ argument_133_ * anInt1354)]
			    = argument_129_.g1s();
		    } else if (anLocalInt_143_ > 1) {
			aShortArray1357[(argument_132_
					 + argument_133_ * anInt1354)]
			    = (short) -1;
			short[] anLocalInts = new short[anLocalInt_143_];
			byte[] anLocalInts_144_ = new byte[anLocalInt_143_];
			for (int anLocalInt_145_ = 0;
			     anLocalInt_145_ < anLocalInt_143_;
			     anLocalInt_145_++) {
			    anLocalInts[anLocalInt_145_]
				= (short) argument_129_.g2();
			    anLocalInts_144_[anLocalInt_145_]
				= argument_129_.g1s();
			}
			aJagexHashMap_1343.put((long) (argument_132_ << 16 | argument_133_), new Node_Sub12(anLocalInts, anLocalInts_144_));
		    }
		} else {
		    short[] anLocalInts = null;
		    byte[] anLocalInts_146_ = null;
		    if (anLocalInt_143_ > 0) {
			anLocalInts = new short[anLocalInt_143_];
			anLocalInts_146_ = new byte[anLocalInt_143_];
			for (int anLocalInt_147_ = 0;
			     anLocalInt_147_ < anLocalInt_143_;
			     anLocalInt_147_++) {
			    anLocalInts[anLocalInt_147_]
				= (short) argument_129_.g2();
			    anLocalInts_146_[anLocalInt_147_]
				= argument_129_.g1s();
			}
		    }
		    if ((aClass366ArrayArrayArray1350[anLocalInt_139_ - 1]
			 [argument_130_ - (anInt1353 >> 6)]
			 [argument_131_ - (anInt1340 >> 6)])
			== null)
			aClass366ArrayArrayArray1350[anLocalInt_139_ - 1]
			    [argument_130_ - (anInt1353 >> 6)]
			    [argument_131_ - (anInt1340 >> 6)]
			    = new Class366();
		    DoublyLinkedNodeP2_Sub1 class104_sub1
			= new DoublyLinkedNodeP2_Sub1(argument_132_ & 0x3f,
					    argument_133_ & 0x3f,
					    anLocalInt_140_, anLocalInt_141_,
					    anLocalInt_142_, anLocalInts,
					    anLocalInts_146_);
		    aClass366ArrayArrayArray1350[anLocalInt_139_ - 1]
			[argument_130_ - (anInt1353 >> 6)]
			[argument_131_ - (anInt1340 >> 6)]
			.method3983(class104_sub1, (byte) 119);
		}
	    }
	}
    }
    
    static final CyclicLinkedList method2813(GraphicsToolkit argument) {
	int anLocalInt = anInt1346 - anInt1338;
	int anLocalInt_148_ = anInt1339 - anInt1347;
	int anLocalInt_149_ = (anInt1348 - anInt1341 << 16) / anLocalInt;
	int anLocalInt_150_ = (anInt1356 - anInt1336 << 16) / anLocalInt_148_;
	return method2817(argument, anLocalInt_149_, anLocalInt_150_, 0, 0);
    }
    
    static final void method2814() {
	aByteArray1352 = null;
	aByteArray1337 = null;
	aShortArray1344 = null;
	aByteArray1351 = null;
	aByteArray1355 = null;
	aShortArray1357 = null;
	aByteArray1345 = null;
	aJagexHashMap_1343 = null;
	aClass366ArrayArrayArray1350 = null;
	anIntArray1349 = null;
    }
    
    static final void method2815(GraphicsToolkit argument, Node_Sub7 argument_151_,
				 Class299 argument_152_) {
	if (((Class299) argument_152_).anIntArray2512 != null) {
	    int[] anLocalInts
		= new int[((Class299) argument_152_).anIntArray2512.length];
	    for (int anLocalInt = 0; anLocalInt < anLocalInts.length / 2;
		 anLocalInt++) {
		int anLocalInt_153_
		    = ((((Class299) argument_152_).anIntArray2512
			[anLocalInt * 2])
		       + ((Node_Sub7) argument_151_).anInt3918);
		int anLocalInt_154_
		    = ((((Class299) argument_152_).anIntArray2512
			[anLocalInt * 2 + 1])
		       + ((Node_Sub7) argument_151_).anInt3911);
		anLocalInts[anLocalInt * 2]
		    = anInt1341 + ((anInt1348 - anInt1341)
				   * (anLocalInt_153_ - anInt1338)
				   / (anInt1346 - anInt1338));
		anLocalInts[anLocalInt * 2 + 1]
		    = anInt1356 - ((anInt1356 - anInt1336)
				   * (anLocalInt_154_ - anInt1347)
				   / (anInt1339 - anInt1347));
	    }
	    Class326.method3689(argument, anLocalInts,
				((Class299) argument_152_).anInt2500);
	    if (((Class299) argument_152_).anInt2504 > 0) {
		for (int anLocalInt = 0;
		     anLocalInt < anLocalInts.length / 2 - 1; anLocalInt++) {
		    int anLocalInt_155_ = anLocalInts[anLocalInt * 2];
		    int anLocalInt_156_ = anLocalInts[anLocalInt * 2 + 1];
		    int anLocalInt_157_ = anLocalInts[(anLocalInt + 1) * 2];
		    int anLocalInt_158_
			= anLocalInts[(anLocalInt + 1) * 2 + 1];
		    if (anLocalInt_157_ < anLocalInt_155_) {
			int anLocalInt_159_ = anLocalInt_155_;
			int anLocalInt_160_ = anLocalInt_156_;
			anLocalInt_155_ = anLocalInt_157_;
			anLocalInt_156_ = anLocalInt_158_;
			anLocalInt_157_ = anLocalInt_159_;
			anLocalInt_158_ = anLocalInt_160_;
		    } else if (anLocalInt_157_ == anLocalInt_155_
			       && anLocalInt_158_ < anLocalInt_156_) {
			int anLocalInt_161_ = anLocalInt_156_;
			anLocalInt_156_ = anLocalInt_158_;
			anLocalInt_158_ = anLocalInt_161_;
		    }
		    argument.method2054(anLocalInt_155_, anLocalInt_156_,
					anLocalInt_157_, anLocalInt_158_,
					(((Class299) argument_152_)
					 .anIntArray2518
					 [((((Class299) argument_152_)
					    .aByteArray2481[anLocalInt])
					   & 0xff)]),
					1,
					((Class299) argument_152_).anInt2504,
					((Class299) argument_152_).anInt2488,
					((Class299) argument_152_).anInt2513);
		}
		int anLocalInt = anLocalInts[anLocalInts.length - 2];
		int anLocalInt_162_ = anLocalInts[anLocalInts.length - 1];
		int anLocalInt_163_ = anLocalInts[0];
		int anLocalInt_164_ = anLocalInts[1];
		if (anLocalInt_163_ < anLocalInt) {
		    int anLocalInt_165_ = anLocalInt;
		    int anLocalInt_166_ = anLocalInt_162_;
		    anLocalInt = anLocalInt_163_;
		    anLocalInt_162_ = anLocalInt_164_;
		    anLocalInt_163_ = anLocalInt_165_;
		    anLocalInt_164_ = anLocalInt_166_;
		} else if (anLocalInt_163_ == anLocalInt
			   && anLocalInt_164_ < anLocalInt_162_) {
		    int anLocalInt_167_ = anLocalInt_162_;
		    anLocalInt_162_ = anLocalInt_164_;
		    anLocalInt_164_ = anLocalInt_167_;
		}
		argument.method2054(anLocalInt, anLocalInt_162_,
				    anLocalInt_163_, anLocalInt_164_,
				    (((Class299) argument_152_).anIntArray2518
				     [((((Class299) argument_152_)
					.aByteArray2481
					[(((Class299) argument_152_)
					  .aByteArray2481).length - 1])
				       & 0xff)]),
				    1, ((Class299) argument_152_).anInt2504,
				    ((Class299) argument_152_).anInt2488,
				    ((Class299) argument_152_).anInt2513);
	    } else {
		for (int anLocalInt = 0;
		     anLocalInt < anLocalInts.length / 2 - 1; anLocalInt++)
		    argument.method2035((((Class299) argument_152_)
					 .anIntArray2518
					 [((((Class299) argument_152_)
					    .aByteArray2481[anLocalInt])
					   & 0xff)]),
					(byte) -55,
					anLocalInts[anLocalInt * 2 + 1],
					anLocalInts[(anLocalInt + 1) * 2],
					anLocalInts[(anLocalInt + 1) * 2 + 1],
					anLocalInts[anLocalInt * 2]);
		argument.method2035((((Class299) argument_152_).anIntArray2518
				     [((((Class299) argument_152_)
					.aByteArray2481
					[(((Class299) argument_152_)
					  .aByteArray2481).length - 1])
				       & 0xff)]),
				    (byte) -29,
				    anLocalInts[anLocalInts.length - 1],
				    anLocalInts[0], anLocalInts[1],
				    anLocalInts[anLocalInts.length - 2]);
	    }
	}
    }
    
    private static final void method2816
	(GraphicsToolkit argument, Node_Sub7 argument_168_, int argument_169_,
	 int argument_170_, int argument_171_, int argument_172_) {
	((Node_Sub7) argument_168_).anInt3916
	    = (anInt1341
	       + ((argument_171_
		   + argument_169_ * (((Node_Sub7) argument_168_).anInt3918
				      - anInt1338))
		  >> 16));
	((Node_Sub7) argument_168_).anInt3919
	    = (anInt1356
	       - ((argument_172_
		   + argument_170_ * (((Node_Sub7) argument_168_).anInt3911
				      - anInt1347))
		  >> 16));
    }
    
    private static final CyclicLinkedList method2817
	(GraphicsToolkit argument, int argument_173_, int argument_174_,
	 int argument_175_, int argument_176_) {
	for (Node_Sub7 class59_sub7
		 = (Node_Sub7) aCyclicLinkedList_1329.getFirst();
	     class59_sub7 != null;
	     class59_sub7 = (Node_Sub7) aCyclicLinkedList_1329.getNext())
	    method2816(argument, class59_sub7, argument_173_, argument_174_,
		       argument_175_, argument_176_);
	return aCyclicLinkedList_1329;
    }
    
    static final void method2818(GraphicsToolkit argument, int argument_177_,
				 int argument_178_) {
	Packet class59_sub28
	    = (new Packet
	       (aJs5Store_1317.getData((((DoublyLinkedNode_Sub51_Sub13) aClass59_Sub51_Sub13_1320).aString6291), "area")));
	int anLocalInt = class59_sub28.g1();
	int[] anLocalInts = new int[anLocalInt];
	for (int anLocalInt_179_ = 0; anLocalInt_179_ < anLocalInt;
	     anLocalInt_179_++)
	    anLocalInts[anLocalInt_179_]
		= class59_sub28.g1();
	int anLocalInt_180_ = class59_sub28.g1();
	int[] anLocalInts_181_ = new int[anLocalInt_180_];
	for (int anLocalInt_182_ = 0; anLocalInt_182_ < anLocalInt_180_;
	     anLocalInt_182_++)
	    anLocalInts_181_[anLocalInt_182_]
		= class59_sub28.g1();
	while (((Packet) class59_sub28).pos
	       < ((Packet) class59_sub28).data.length) {
	    if (class59_sub28.g1() == 0) {
		int anLocalInt_183_ = class59_sub28.g1();
		int anLocalInt_184_ = class59_sub28.g1();
		for (int anLocalInt_185_ = 0; anLocalInt_185_ < 64;
		     anLocalInt_185_++) {
		    for (int anLocalInt_186_ = 0; anLocalInt_186_ < 64;
			 anLocalInt_186_++) {
			int anLocalInt_187_ = (anLocalInt_183_ * 64
					       + anLocalInt_185_ - anInt1353);
			int anLocalInt_188_ = (anLocalInt_184_ * 64
					       + anLocalInt_186_ - anInt1340);
			method2812(argument, class59_sub28, anLocalInt_183_,
				   anLocalInt_184_, anLocalInt_187_,
				   anLocalInt_188_, anLocalInts,
				   anLocalInts_181_);
		    }
		}
	    } else {
		int anLocalInt_189_ = class59_sub28.g1();
		int anLocalInt_190_ = class59_sub28.g1();
		int anLocalInt_191_ = class59_sub28.g1();
		int anLocalInt_192_ = class59_sub28.g1();
		for (int anLocalInt_193_ = 0; anLocalInt_193_ < 8;
		     anLocalInt_193_++) {
		    for (int anLocalInt_194_ = 0; anLocalInt_194_ < 8;
			 anLocalInt_194_++) {
			int anLocalInt_195_
			    = (anLocalInt_189_ * 64 + anLocalInt_191_ * 8
			       + anLocalInt_193_ - anInt1353);
			int anLocalInt_196_
			    = (anLocalInt_190_ * 64 + anLocalInt_192_ * 8
			       + anLocalInt_194_ - anInt1340);
			method2812(argument, class59_sub28, anLocalInt_189_,
				   anLocalInt_190_, anLocalInt_195_,
				   anLocalInt_196_, anLocalInts,
				   anLocalInts_181_);
		    }
		}
	    }
	}
	Object object = null;
	aByteArray1337 = new byte[anInt1354 * anInt1342];
	aShortArray1344 = new short[anInt1354 * anInt1342];
	for (int anLocalInt_197_ = 0; anLocalInt_197_ < 3; anLocalInt_197_++) {
	    byte[] anLocalInts_198_ = new byte[anInt1354 * anInt1342];
	    for (int anLocalInt_199_ = 0;
		 (anLocalInt_199_
		  < aClass366ArrayArrayArray1350[anLocalInt_197_].length);
		 anLocalInt_199_++) {
		for (int anLocalInt_200_ = 0;
		     anLocalInt_200_ < (aClass366ArrayArrayArray1350
					[anLocalInt_197_][0]).length;
		     anLocalInt_200_++) {
		    Class366 class366
			= (aClass366ArrayArrayArray1350[anLocalInt_197_]
			   [anLocalInt_199_][anLocalInt_200_]);
		    if (class366 != null) {
			for (DoublyLinkedNodeP2_Sub1 class104_sub1
				 = (DoublyLinkedNodeP2_Sub1) class366.method3986(0);
			     class104_sub1 != null;
			     class104_sub1 = ((DoublyLinkedNodeP2_Sub1)
					      class366.method3992((byte) 114)))
			    anLocalInts_198_
				[(anLocalInt_199_ * 64
				  + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4501
				  + (anLocalInt_200_ * 64
				     + (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					.aByte4504)) * anInt1354)]
				= (byte) (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					  .anInt4505);
		    }
		}
	    }
	    method2811(anLocalInts_198_, aByteArray1337, aShortArray1344,
		       argument_177_, argument_178_);
	    for (int anLocalInt_201_ = 0;
		 (anLocalInt_201_
		  < aClass366ArrayArrayArray1350[anLocalInt_197_].length);
		 anLocalInt_201_++) {
		for (int anLocalInt_202_ = 0;
		     anLocalInt_202_ < (aClass366ArrayArrayArray1350
					[anLocalInt_197_][0]).length;
		     anLocalInt_202_++) {
		    Class366 class366
			= (aClass366ArrayArrayArray1350[anLocalInt_197_]
			   [anLocalInt_201_][anLocalInt_202_]);
		    if (class366 != null) {
			for (DoublyLinkedNodeP2_Sub1 class104_sub1
				 = (DoublyLinkedNodeP2_Sub1) class366.method3986(0);
			     class104_sub1 != null;
			     class104_sub1
				 = ((DoublyLinkedNodeP2_Sub1)
				    class366.method3992((byte) -107))) {
			    int anLocalInt_203_
				= (anLocalInt_201_ * 64
				   + ((DoublyLinkedNodeP2_Sub1) class104_sub1).aByte4501
				   + (anLocalInt_202_ * 64
				      + (((DoublyLinkedNodeP2_Sub1) class104_sub1)
					 .aByte4504)) * anInt1354);
			    ((DoublyLinkedNodeP2_Sub1) class104_sub1).anInt4505
				= (((aByteArray1337[anLocalInt_203_] & 0xff)
				    << 16)
				   | (aShortArray1344[anLocalInt_203_]
				      & 0xffff));
			    if (((DoublyLinkedNodeP2_Sub1) class104_sub1).anInt4505 != 0)
				((DoublyLinkedNodeP2_Sub1) class104_sub1).anInt4505
				    |= ~0xffffff;
			}
		    }
		}
	    }
	}
	method2811(aByteArray1352, aByteArray1337, aShortArray1344,
		   argument_177_, argument_178_);
	aByteArray1352 = null;
	method2807();
    }
    
    static final void method2819(int argument, int argument_204_,
				 int argument_205_, int argument_206_,
				 int argument_207_, int argument_208_,
				 int argument_209_, int argument_210_) {
	anInt1338 = argument - anInt1353;
	anInt1339 = argument_204_ - anInt1340;
	anInt1346 = argument_205_ - anInt1353;
	anInt1347 = argument_206_ - anInt1340;
	anInt1341 = argument_207_;
	anInt1336 = argument_208_;
	anInt1348 = argument_209_;
	anInt1356 = argument_210_;
    }
    
    static final void method2820(TextureSource argument, int argument_211_,
				 int argument_212_) {
	for (int anLocalInt = 0;
	     anLocalInt < ((Class51) aClass51_1319).anInt382; anLocalInt++)
	    anIntArray1349[anLocalInt + 1]
		= method2799(argument, anLocalInt, argument_211_,
			     argument_212_);
    }
    
    static final DCyclicLinkedList method2821(int argument, int argument_213_) {
	DCyclicLinkedList DCyclicLinkedList = new DCyclicLinkedList();
	for (DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13
		 = (DoublyLinkedNode_Sub51_Sub13) aJagexHashMap_1323.first(0);
	     class59_sub51_sub13 != null;
	     class59_sub51_sub13 = ((DoublyLinkedNode_Sub51_Sub13)
				    aJagexHashMap_1323.next())) {
	    if (((DoublyLinkedNode_Sub51_Sub13) class59_sub51_sub13).aBoolean6294
		&& class59_sub51_sub13.method1267(argument, -11,
						  argument_213_))
		DCyclicLinkedList.add(class59_sub51_sub13);
	}
	return DCyclicLinkedList;
    }
    
    private static final void method2822
	(GraphicsToolkit argument, int argument_214_, int argument_215_,
	 int argument_216_, int argument_217_, int argument_218_,
	 int argument_219_, int argument_220_, short[] argument_221_,
	 byte[] argument_222_, boolean argument_223_) {
	if (argument_223_ || argument_218_ != 0 || argument_219_ > 0) {
	    if (argument_219_ == 0)
		argument.fillRect(argument_214_, argument_215_, argument_216_, argument_217_, argument_218_, 0);
	    else {
		int anLocalInt = argument_220_ & 0x3f;
		if (anLocalInt == 0 || argument_216_ <= 1
		    || argument_217_ <= 1) {
		    int anLocalInt_224_ = anIntArray1349[argument_219_];
		    if (argument_223_ || anLocalInt_224_ != 0)
			argument.fillRect(argument_214_, argument_215_, argument_216_, argument_217_, anLocalInt_224_, 0);
		} else {
		    int anLocalInt_225_ = argument_223_ ? 0 : 1;
		    Class360.method3951(anInt1332, argument_215_,
					argument_218_,
					anIntArray1349[argument_219_],
					anLocalInt, aByteArrayArrayArray1326,
					argument_220_ >> 6 & 0x3,
					argument_217_, -10, argument,
					anLocalInt_225_, argument_216_,
					argument_214_);
		}
	    }
	}
	if (argument_221_ != null) {
	    int anLocalInt;
	    if (argument_216_ == 1)
		anLocalInt = argument_214_;
	    else
		anLocalInt = argument_214_ + argument_216_ - 1;
	    int anLocalInt_226_;
	    if (argument_217_ == 1)
		anLocalInt_226_ = argument_215_;
	    else
		anLocalInt_226_ = argument_215_ + argument_217_ - 1;
	    for (int anLocalInt_227_ = 0;
		 anLocalInt_227_ < argument_221_.length; anLocalInt_227_++) {
		int anLocalInt_228_ = argument_222_[anLocalInt_227_] & 0x3f;
		if (anLocalInt_228_ == 0 || anLocalInt_228_ == 2
		    || anLocalInt_228_ == 3 || anLocalInt_228_ == 9) {
		    Class266 class266
			= aClass257_1318.method3298((byte) 25,
						    ((argument_221_
						      [anLocalInt_227_])
						     & 0xffff));
		    if (((Class266) class266).anInt2058 == -1) {
			int anLocalInt_229_ = -3355444;
			if (((Class266) class266).anInt2123 == 1)
			    anLocalInt_229_ = -3407872;
			int anLocalInt_230_
			    = argument_222_[anLocalInt_227_] >> 6 & 0x3;
			if (anLocalInt_228_ == 0) {
			    if (anLocalInt_230_ == 0)
				argument.drawVLine(argument_214_, argument_215_, argument_217_, anLocalInt_229_, 0);
			    else if (anLocalInt_230_ == 1)
				argument.drawHLine(argument_214_, argument_215_, argument_216_, anLocalInt_229_, 0);
			    else if (anLocalInt_230_ == 2)
				argument.drawVLine(anLocalInt, argument_215_, argument_217_, anLocalInt_229_, 0);
			    else
				argument.drawHLine(argument_214_, anLocalInt_226_, argument_216_, anLocalInt_229_, 0);
			} else if (anLocalInt_228_ == 2) {
			    if (anLocalInt_230_ == 0) {
				argument.drawVLine(argument_214_, argument_215_, argument_217_, -1, 0);
				argument.drawHLine(argument_214_, argument_215_, argument_216_, anLocalInt_229_, 0);
			    } else if (anLocalInt_230_ == 1) {
				argument.drawVLine(anLocalInt, argument_215_, argument_217_, -1, 0);
				argument.drawHLine(argument_214_, argument_215_, argument_216_, anLocalInt_229_, 0);
			    } else if (anLocalInt_230_ == 2) {
				argument.drawVLine(anLocalInt, argument_215_, argument_217_, -1, 0);
				argument.drawHLine(argument_214_, anLocalInt_226_, argument_216_, anLocalInt_229_, 0);
			    } else {
				argument.drawVLine(argument_214_, argument_215_, argument_217_, -1, 0);
				argument.drawHLine(argument_214_, anLocalInt_226_, argument_216_, anLocalInt_229_, 0);
			    }
			} else if (anLocalInt_228_ == 3) {
			    if (anLocalInt_230_ == 0)
				argument.drawHLine(argument_214_, argument_215_, 1, anLocalInt_229_, 0);
			    else if (anLocalInt_230_ == 1)
				argument.drawHLine(anLocalInt, argument_215_, 1, anLocalInt_229_, 0);
			    else if (anLocalInt_230_ == 2)
				argument.drawHLine(anLocalInt, anLocalInt_226_, 1, anLocalInt_229_, 0);
			    else
				argument.drawHLine(argument_214_, anLocalInt_226_, 1, anLocalInt_229_, 0);
			} else if (anLocalInt_228_ == 9) {
			    if (anLocalInt_230_ == 0 || anLocalInt_230_ == 2) {
				for (int anLocalInt_231_ = 0;
				     anLocalInt_231_ < argument_217_;
				     anLocalInt_231_++)
				    argument.drawHLine(argument_214_ + anLocalInt_231_, (anLocalInt_226_ - anLocalInt_231_), 1, anLocalInt_229_, 0);
			    } else {
				for (int anLocalInt_232_ = 0;
				     anLocalInt_232_ < argument_217_;
				     anLocalInt_232_++)
				    argument.drawHLine(argument_214_ + anLocalInt_232_, argument_215_ + anLocalInt_232_, 1, anLocalInt_229_, 0);
			    }
			}
		    }
		}
	    }
	}
    }
    
    static {
	anInt1327 = (int) (Math.random() * 17.0) - 8;
	aShortArray1331 = new short[1];
	aCyclicLinkedList_1329 = new CyclicLinkedList();
    }
}
