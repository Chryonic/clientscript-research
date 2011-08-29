/* Class367 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class367
{
    private int[] anIntArray3091;
    int anInt3092;
    int[] anIntArray3093;
    int[] anIntArray3094;
    Class336 aClass336_3095;
    int[] anIntArray3096;
    int anInt3097;
    boolean aBoolean3098;
    int anInt3099 = 5;
    int[][] anIntArrayArray3100;
    static int anInt3101;
    boolean aBoolean3102;
    static int[] anIntArray3103 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    int anInt3104;
    int anInt3105;
    int anInt3106;
    int anInt3107;
    int[] anIntArray3108;
    int anInt3109;
    boolean aBoolean3110;
    int[] anIntArray3111;
    boolean aBoolean3112;
    boolean[] aBooleanArray3113;
    int anInt3114;
    
    private final void method3994(int argument_0_, Packet argument_1_,
				  int argument_2_) {
	if (argument_0_ != 1) {
	    if (argument_0_ == 2)
		((Class367) this).anInt3109 = argument_1_.g2();
	    else if (argument_0_ != 3) {
		if (argument_0_ != 5) {
		    if (argument_0_ != 6) {
			if (argument_0_ == 7)
			    ((Class367) this).anInt3097
				= argument_1_.g2();
			else if (argument_0_ == 8)
			    ((Class367) this).anInt3105
				= argument_1_.g1();
			else if (argument_0_ == 9)
			    ((Class367) this).anInt3092
				= argument_1_.g1();
			else if (argument_0_ == 10)
			    ((Class367) this).anInt3114
				= argument_1_.g1();
			else if (argument_0_ == 11)
			    ((Class367) this).anInt3106
				= argument_1_.g1();
			else if (argument_0_ == 12) {
			    int anLocalInt
				= argument_1_.g1();
			    anIntArray3091 = new int[anLocalInt];
			    for (int anLocalInt_3_ = 0;
				 anLocalInt_3_ < anLocalInt; anLocalInt_3_++)
				anIntArray3091[anLocalInt_3_]
				    = argument_1_.g2();
			    for (int anLocalInt_4_ = 0;
				 anLocalInt_4_ < anLocalInt; anLocalInt_4_++)
				anIntArray3091[anLocalInt_4_]
				    = ((argument_1_.g2() << 16)
				       + anIntArray3091[anLocalInt_4_]);
			} else if (argument_0_ == 13) {
			    int anLocalInt = argument_1_.g2();
			    ((Class367) this).anIntArrayArray3100
				= new int[anLocalInt][];
			    for (int anLocalInt_5_ = 0;
				 anLocalInt_5_ < anLocalInt; anLocalInt_5_++) {
				int anLocalInt_6_
				    = argument_1_.g1();
				if (anLocalInt_6_ > 0) {
				    ((Class367) this).anIntArrayArray3100
					[anLocalInt_5_]
					= new int[anLocalInt_6_];
				    ((Class367) this).anIntArrayArray3100
					[anLocalInt_5_][0]
					= argument_1_.g3_dupl();
				    for (int anLocalInt_7_ = 1;
					 anLocalInt_7_ < anLocalInt_6_;
					 anLocalInt_7_++)
					((Class367) this)
					    .anIntArrayArray3100[anLocalInt_5_]
					    [anLocalInt_7_]
					    = argument_1_.g2();
				}
			    }
			} else if (argument_0_ == 14)
			    ((Class367) this).aBoolean3112 = true;
			else if (argument_0_ != 15) {
			    if (argument_0_ == 16)
				((Class367) this).aBoolean3098 = true;
			    else if (argument_0_ == 18)
				((Class367) this).aBoolean3102 = true;
			    else if (argument_0_ != 19) {
				if (argument_0_ == 20) {
				    if ((((Class367) this).anIntArray3111
					 == null)
					|| (((Class367) this).anIntArray3093
					    == null)) {
					((Class367) this).anIntArray3111
					    = (new int
					       [(((Class367) this)
						 .anIntArrayArray3100).length]);
					((Class367) this).anIntArray3093
					    = (new int
					       [(((Class367) this)
						 .anIntArrayArray3100).length]);
					for (int anLocalInt = 0;
					     (anLocalInt
					      < (((Class367) this)
						 .anIntArrayArray3100).length);
					     anLocalInt++) {
					    ((Class367) this)
						.anIntArray3111[anLocalInt]
						= 256;
					    ((Class367) this)
						.anIntArray3093[anLocalInt]
						= 256;
					}
				    }
				    int anLocalInt
					= argument_1_.g1();
				    ((Class367) this).anIntArray3111
					[anLocalInt]
					= argument_1_.g2();
				    ((Class367) this).anIntArray3093
					[anLocalInt]
					= argument_1_.g2();
				}
			    } else {
				if (((Class367) this).anIntArray3108 == null) {
				    ((Class367) this).anIntArray3108
					= (new int
					   [(((Class367) this)
					     .anIntArrayArray3100).length]);
				    for (int anLocalInt = 0;
					 ((((Class367) this)
					   .anIntArrayArray3100).length
					  > anLocalInt);
					 anLocalInt++)
					((Class367) this).anIntArray3108
					    [anLocalInt]
					    = 255;
				}
				((Class367) this).anIntArray3108
				    [argument_1_.g1()]
				    = argument_1_.g1();
			    }
			} else
			    ((Class367) this).aBoolean3110 = true;
		    } else
			((Class367) this).anInt3107
			    = argument_1_.g2();
		} else
		    ((Class367) this).anInt3099
			= argument_1_.g1();
	    } else {
		((Class367) this).aBooleanArray3113 = new boolean[256];
		int anLocalInt = argument_1_.g1();
		for (int anLocalInt_8_ = 0; anLocalInt_8_ < anLocalInt;
		     anLocalInt_8_++)
		    ((Class367) this).aBooleanArray3113
			[argument_1_.g1()]
			= true;
	    }
	} else {
	    int anLocalInt = argument_1_.g2();
	    ((Class367) this).anIntArray3094 = new int[anLocalInt];
	    for (int anLocalInt_9_ = 0; anLocalInt > anLocalInt_9_;
		 anLocalInt_9_++)
		((Class367) this).anIntArray3094[anLocalInt_9_]
		    = argument_1_.g2();
	    ((Class367) this).anIntArray3096 = new int[anLocalInt];
	    for (int anLocalInt_10_ = 0; anLocalInt > anLocalInt_10_;
		 anLocalInt_10_++)
		((Class367) this).anIntArray3096[anLocalInt_10_]
		    = argument_1_.g2();
	    for (int anLocalInt_11_ = 0; anLocalInt > anLocalInt_11_;
		 anLocalInt_11_++)
		((Class367) this).anIntArray3096[anLocalInt_11_]
		    = ((argument_1_.g2() << 16)
		       + ((Class367) this).anIntArray3096[anLocalInt_11_]);
	}
	int anLocalInt = 9 / ((6 - argument_2_) / 47);
    }
    
    final void method3995(Packet argument_12_, int argument_13_) {
	for (;;) {
	    int anLocalInt = argument_12_.g1();
	    if (anLocalInt == 0)
		break;
	    method3994(anLocalInt, argument_12_, -55);
	}
    }
    
    final Class167 method3996(int argument_14_, int argument_15_,
			      int argument_16_, byte argument_17_,
			      Class167 argument_18_, int argument_19_,
			      int argument_20_, int argument_21_) {
	int anLocalInt = ((Class367) this).anIntArray3094[argument_21_];
	argument_21_ = ((Class367) this).anIntArray3096[argument_21_];
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6
	    = ((Class367) this).aClass336_3095.method3754(-4849,
							  argument_21_ >> 16);
	argument_21_ &= 0xffff;
	if (class59_sub51_sub6 == null)
	    return argument_18_.method2651(argument_17_, argument_14_, true);
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_22_ = null;
	if ((((Class367) this).aBoolean3110 || Node_Sub31_Sub9.aBoolean5877)
	    && argument_15_ != -1
	    && ((Class367) this).anIntArray3096.length > argument_15_) {
	    argument_15_ = ((Class367) this).anIntArray3096[argument_15_];
	    class59_sub51_sub6_22_
		= ((Class367) this).aClass336_3095
		      .method3754(-4849, argument_15_ >> 16);
	    argument_15_ &= 0xffff;
	}
	if (((Class367) this).aBoolean3112)
	    argument_14_ |= 0x200;
	if (class59_sub51_sub6.method1205((byte) -114, argument_21_))
	    argument_14_ |= 0x80;
	if (class59_sub51_sub6.method1206(false, argument_21_))
	    argument_14_ |= 0x100;
	if (class59_sub51_sub6.method1204(argument_21_, -1))
	    argument_14_ |= 0x400;
	if (argument_19_ != 256)
	    method3997(false, 99, -41, -57);
	if (class59_sub51_sub6_22_ != null) {
	    if (class59_sub51_sub6_22_.method1205((byte) -114, argument_15_))
		argument_14_ |= 0x80;
	    if (class59_sub51_sub6_22_.method1206(false, argument_15_))
		argument_14_ |= 0x100;
	    if (class59_sub51_sub6_22_.method1204(argument_15_,
						  argument_19_ ^ ~0x100))
		argument_14_ |= 0x400;
	}
	argument_14_ |= 0x20;
	Class167 class167
	    = argument_18_.method2651(argument_17_, argument_14_, true);
	class167.method2657(argument_20_, argument_21_, argument_16_ - 1,
			    ((Class367) this).aBoolean3112, class59_sub51_sub6,
			    argument_15_, anLocalInt, (byte) -44,
			    class59_sub51_sub6_22_);
	return class167;
    }
    
    final int method3997(boolean argument_23_, int argument_24_,
			 int argument_25_, int argument_26_) {
	int anLocalInt = 0;
	int anLocalInt_27_ = 0;
	if (argument_25_ != 27123)
	    method3996(-31, 74, 118, (byte) 8, null, -102, 81, -76);
	int anLocalInt_28_ = ((Class367) this).anIntArray3096[argument_26_];
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6 = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_29_
	    = ((Class367) this).aClass336_3095
		  .method3754(argument_25_ ^ ~0x7b03, anLocalInt_28_ >> 16);
	anLocalInt_28_ &= 0xffff;
	if (class59_sub51_sub6_29_ == null)
	    return anLocalInt;
	if ((((Class367) this).aBoolean3110 || Node_Sub31_Sub9.aBoolean5877)
	    && argument_24_ != -1
	    && argument_24_ < ((Class367) this).anIntArray3096.length) {
	    anLocalInt_27_ = ((Class367) this).anIntArray3096[argument_24_];
	    class59_sub51_sub6 = ((Class367) this).aClass336_3095
				     .method3754(-4849, anLocalInt_27_ >> 16);
	    anLocalInt_27_ &= 0xffff;
	}
	if (((Class367) this).aBoolean3112)
	    anLocalInt |= 0x200;
	if (class59_sub51_sub6_29_.method1205((byte) -114, anLocalInt_28_))
	    anLocalInt |= 0x80;
	if (class59_sub51_sub6_29_.method1206(false, anLocalInt_28_))
	    anLocalInt |= 0x100;
	if (class59_sub51_sub6_29_.method1204(anLocalInt_28_,
					      argument_25_ - 27124))
	    anLocalInt |= 0x400;
	if (class59_sub51_sub6 != null) {
	    if (class59_sub51_sub6.method1205((byte) -114, anLocalInt_27_))
		anLocalInt |= 0x80;
	    if (class59_sub51_sub6.method1206(false, anLocalInt_27_))
		anLocalInt |= 0x100;
	    if (class59_sub51_sub6.method1204(anLocalInt_27_, -1))
		anLocalInt |= 0x400;
	}
	if (anIntArray3091 != null && argument_23_) {
	    if (argument_26_ < anIntArray3091.length) {
		int anLocalInt_30_ = anIntArray3091[argument_26_];
		if (anLocalInt_30_ != 65535) {
		    DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_31_
			= ((Class367) this).aClass336_3095
			      .method3754(-4849, anLocalInt_30_ >> 16);
		    anLocalInt_30_ &= 0xffff;
		    if (class59_sub51_sub6_31_ != null) {
			if (class59_sub51_sub6_31_.method1205((byte) -114,
							      anLocalInt_30_))
			    anLocalInt |= 0x80;
			if (class59_sub51_sub6_31_.method1206(false,
							      anLocalInt_30_))
			    anLocalInt |= 0x100;
			if (class59_sub51_sub6_31_.method1204(anLocalInt_30_,
							      -1))
			    anLocalInt |= 0x400;
		    }
		}
	    }
	    if ((((Class367) this).aBoolean3110
		 || Node_Sub31_Sub9.aBoolean5877)
		&& argument_24_ != -1
		&& anIntArray3091.length > argument_24_) {
		int anLocalInt_32_ = anIntArray3091[argument_24_];
		if (anLocalInt_32_ != 65535) {
		    DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_33_
			= ((Class367) this).aClass336_3095
			      .method3754(-4849, anLocalInt_32_ >> 16);
		    anLocalInt_32_ &= 0xffff;
		    if (class59_sub51_sub6_33_ != null) {
			if (class59_sub51_sub6_33_.method1205((byte) -114,
							      anLocalInt_32_))
			    anLocalInt |= 0x80;
			if (class59_sub51_sub6_33_.method1206(false,
							      anLocalInt_32_))
			    anLocalInt |= 0x100;
			if (class59_sub51_sub6_33_.method1204(anLocalInt_32_,
							      -1))
			    anLocalInt |= 0x400;
		    }
		}
	    }
	}
	return anLocalInt | 0x20;
    }

    static final void method3998(String argument, int argument_35_, boolean argument_36_) {
        Class222.method3032(8);
        if (argument_35_ != 0) {
            GraphicsToolkit graphicsToolkit = null;
            if (argument != null) {
                graphicsToolkit = Class314.method3626(0, Statics.aJs5Store_4153, Class22.anTextureSource_142, (byte) -83, 0, Applet_Sub1.gameCanvas);
                graphicsToolkit.clear(0);
                Class76 class76 = Class349.method3820(0, client.fontCache, client.fontIndexP12full, (byte) 44);
                AbstractFont abstractFont = graphicsToolkit.method2083(class76, Class83.method1608((Class205.aJs5Store_1472), (client.fontIndexP12full), 0), true);
                Node_Sub31_Sub31.method970(true);
                Class62_Sub10.method1395(abstractFont, graphicsToolkit, class76, true, -118, argument);
            }
            try {
                Class389.aGraphicsToolkit3281 = Class314.method3626(argument_35_, Statics.aJs5Store_4153, Class22.anTextureSource_142, (byte) -83, ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub6_4296.method1377(75) * 2, Applet_Sub1.gameCanvas);
                if (argument != null) {
                    graphicsToolkit.clear(0);
                    Class76 class76 = Class349.method3820(0, client.fontCache, client.fontIndexP12full, (byte) 44);
                    AbstractFont abstractFont = (graphicsToolkit.method2083(class76, Class83.method1608(Class205.aJs5Store_1472, client.fontIndexP12full, 0), true));
                    Node_Sub31_Sub31.method970(true);
                    Class62_Sub10.method1395(abstractFont, graphicsToolkit, class76, true, -121, argument);
                }
                if (Class389.aGraphicsToolkit3281.method2042()) {
                    boolean anLocalBoolean = true;
                    try {
                        anLocalBoolean = (Statics.aClass59_Sub44_1064.anInt4246) > 256;
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    dba_sub_772 var_dba_sub_772;
                    if (anLocalBoolean)
                        var_dba_sub_772 = Class389.aGraphicsToolkit3281.method2037(146800640);
                    else
                        var_dba_sub_772 = Class389.aGraphicsToolkit3281.method2037(104857600);
                    Class389.aGraphicsToolkit3281.method2014(var_dba_sub_772);
                }
            } catch (Throwable throwable) {
                int anLocalInt = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295.method1464(48);
                if (anLocalInt == 2)
                    Class178.aBoolean1316 = true;
                AthmosphericConditions.aClass59_Sub50_116.method1159(0, (((Node_Sub50) (AthmosphericConditions.aClass59_Sub50_116)).aClass62_Sub26_4295), 80);
                method3998(argument, anLocalInt, argument_36_);
                return;
            } finally {
                if (graphicsToolkit != null) {
                    try {
                        graphicsToolkit.method2027((byte) -87);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
            }
        } else {
            Class389.aGraphicsToolkit3281 = Class314.method3626(0, Statics.aJs5Store_4153, Class22.anTextureSource_142, (byte) -83, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub6_4296.method1377(47) * 2), Applet_Sub1.gameCanvas);
            if (argument != null) {
                Class389.aGraphicsToolkit3281.clear(0);
                Class76 class76 = Class349.method3820(0, client.fontCache, client.fontIndexP12full, (byte) 44);
                AbstractFont abstractFont = (Class389.aGraphicsToolkit3281.method2083(class76, Class83.method1608(Class205.aJs5Store_1472, client.fontIndexP12full, 0), true));
                Node_Sub31_Sub31.method970(true);
                Class62_Sub10.method1395(abstractFont, Class389.aGraphicsToolkit3281, class76, true, -125, argument);
            }
        }
        ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295.method1460(!argument_36_, -23343);
        AthmosphericConditions.aClass59_Sub50_116.method1159(argument_35_, (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub26_4295), 118);
        Node_Sub47_Sub11.method1139(56);
        Class389.aGraphicsToolkit3281.method2017(10000);
        Class389.aGraphicsToolkit3281.X(32);
        Class41.aClass350_304 = Class389.aGraphicsToolkit3281.method2029();
        DoublyLinkedNodeP2_Sub10.aClass350_4594 = Class389.aGraphicsToolkit3281.method2029();
        Node_Sub37_Sub3.method1064((byte) -109);
        Class389.aGraphicsToolkit3281.method2073(((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub2_4315.method1353(24) == 1);
        if (Class389.aGraphicsToolkit3281.method2034())
            dba_sub_772_Sub2.method1315((byte) -35, ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub14_4327.method1414(15) == 1);
        AthmosphericConditions.initialize(MapRelated.mapWidth >> 3, MapRelated.mapDepth >> 3, Class389.aGraphicsToolkit3281);
        Class120.method2385((byte) 63);
        Node_Sub50.aBoolean4325 = true;
        Statics.aClass259Array5496 = null;
        Class152.aBoolean1149 = false;
        Node_Sub38.method1067(22);
    }
    
    final void method3999(int argument_37_) {
	if (((Class367) this).anInt3092 == -1) {
	    if (((Class367) this).aBooleanArray3113 != null)
		((Class367) this).anInt3092 = 2;
	    else
		((Class367) this).anInt3092 = 0;
	}
	if (((Class367) this).anInt3114 == -1) {
	    if (((Class367) this).aBooleanArray3113 != null)
		((Class367) this).anInt3114 = 2;
	    else
		((Class367) this).anInt3114 = 0;
	}
    }
    
    final Class167 method4000(int argument_38_, Class167 argument_39_,
			      boolean argument_40_, int argument_41_,
			      int argument_42_, int argument_43_) {
	int anLocalInt = ((Class367) this).anIntArray3094[argument_43_];
	int anLocalInt_44_ = ((Class367) this).anIntArray3096[argument_43_];
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6
	    = ((Class367) this).aClass336_3095
		  .method3754(-4849, anLocalInt_44_ >> 16);
	anLocalInt_44_ &= 0xffff;
	if (class59_sub51_sub6 == null)
	    return argument_39_.method2651((byte) 1, argument_42_, true);
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_45_ = null;
	if ((((Class367) this).aBoolean3110 || Node_Sub31_Sub9.aBoolean5877)
	    && argument_41_ != -1
	    && argument_41_ < ((Class367) this).anIntArray3096.length) {
	    argument_41_ = ((Class367) this).anIntArray3096[argument_41_];
	    class59_sub51_sub6_45_
		= ((Class367) this).aClass336_3095
		      .method3754(-4849, argument_41_ >> 16);
	    argument_41_ &= 0xffff;
	}
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_46_ = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_47_ = null;
	int anLocalInt_48_ = 0;
	int anLocalInt_49_ = 0;
	if (anIntArray3091 != null) {
	    if (anIntArray3091.length > argument_43_) {
		anLocalInt_48_ = anIntArray3091[argument_43_];
		if (anLocalInt_48_ != 65535) {
		    class59_sub51_sub6_46_
			= ((Class367) this).aClass336_3095
			      .method3754(-4849, anLocalInt_48_ >> 16);
		    anLocalInt_48_ &= 0xffff;
		}
	    }
	    if ((((Class367) this).aBoolean3110
		 || Node_Sub31_Sub9.aBoolean5877)
		&& argument_41_ != -1
		&& anIntArray3091.length > argument_41_) {
		anLocalInt_49_ = anIntArray3091[argument_41_];
		if (anLocalInt_49_ != 65535) {
		    class59_sub51_sub6_47_
			= ((Class367) this).aClass336_3095
			      .method3754(-4849, anLocalInt_49_ >> 16);
		    anLocalInt_49_ &= 0xffff;
		}
	    }
	}
	if (((Class367) this).aBoolean3112)
	    argument_42_ |= 0x200;
	if (class59_sub51_sub6.method1205((byte) -114, anLocalInt_44_))
	    argument_42_ |= 0x80;
	if (class59_sub51_sub6.method1206(argument_40_, anLocalInt_44_))
	    argument_42_ |= 0x100;
	if (class59_sub51_sub6.method1204(anLocalInt_44_, -1))
	    argument_42_ |= 0x400;
	if (class59_sub51_sub6_46_ != null) {
	    if (class59_sub51_sub6_46_.method1205((byte) -114, anLocalInt_48_))
		argument_42_ |= 0x80;
	    if (class59_sub51_sub6_46_.method1206(false, anLocalInt_48_))
		argument_42_ |= 0x100;
	    if (class59_sub51_sub6_46_.method1204(anLocalInt_48_, -1))
		argument_42_ |= 0x400;
	}
	if (class59_sub51_sub6_45_ != null) {
	    if (class59_sub51_sub6_45_.method1205((byte) -114, argument_41_))
		argument_42_ |= 0x80;
	    if (class59_sub51_sub6_45_.method1206(argument_40_, argument_41_))
		argument_42_ |= 0x100;
	    if (class59_sub51_sub6_45_.method1204(argument_41_, -1))
		argument_42_ |= 0x400;
	}
	if (class59_sub51_sub6_47_ != null) {
	    if (class59_sub51_sub6_47_.method1205((byte) -114, anLocalInt_49_))
		argument_42_ |= 0x80;
	    if (class59_sub51_sub6_47_.method1206(argument_40_,
						  anLocalInt_49_))
		argument_42_ |= 0x100;
	    if (class59_sub51_sub6_47_.method1204(anLocalInt_49_, -1))
		argument_42_ |= 0x400;
	}
	argument_42_ |= 0x20;
	Class167 class167
	    = argument_39_.method2651((byte) 1, argument_42_, true);
	class167.method2657(0, anLocalInt_44_, argument_38_ - 1,
			    ((Class367) this).aBoolean3112, class59_sub51_sub6,
			    argument_41_, anLocalInt, (byte) -51,
			    class59_sub51_sub6_45_);
	if (class59_sub51_sub6_46_ != null)
	    class167.method2657(0, anLocalInt_48_, argument_38_ - 1,
				((Class367) this).aBoolean3112,
				class59_sub51_sub6_46_, anLocalInt_49_,
				anLocalInt, (byte) -123,
				class59_sub51_sub6_47_);
	return class167;
    }
    
    public static void method4001(byte argument) {
	anIntArray3103 = null;
    }
    
    public Class367() {
	((Class367) this).anInt3092 = -1;
	((Class367) this).aBoolean3098 = false;
	((Class367) this).aBoolean3102 = false;
	((Class367) this).anInt3106 = 2;
	((Class367) this).anInt3097 = -1;
	((Class367) this).anInt3105 = 99;
	((Class367) this).anInt3109 = -1;
	((Class367) this).aBoolean3110 = false;
	((Class367) this).aBoolean3112 = false;
	((Class367) this).anInt3107 = -1;
	((Class367) this).anInt3114 = -1;
    }
    
    static {
	anInt3101 = 0;
    }
}
