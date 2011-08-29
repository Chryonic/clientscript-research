/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

final class Class299
{
    private int anInt2477;
    String aString2478;
    int anInt2479;
    boolean aBoolean2480;
    byte[] aByteArray2481;
    boolean aBoolean2482;
    int anInt2483;
    int anInt2484;
    String aString2485;
    private int anInt2486;
    Class20 aClass20_2487;
    int anInt2488 = -1;
    private int anInt2489;
    int anInt2490 = -1;
    boolean aBoolean2491 = true;
    int anInt2492;
    private int anInt2493;
    int anInt2494;
    static int anInt2495;
    static JagexHashMap aJagexHashMap_2496 = new JagexHashMap(16);
    private JagexHashMap aJagexHashMap_2497;
    private int anInt2498;
    private int anInt2499;
    int anInt2500;
    int anInt2501;
    private int anInt2502;
    boolean aBoolean2503;
    int anInt2504;
    int anInt2505;
    private int anInt2506;
    String[] aStringArray2507;
    int anInt2508;
    int anInt2509;
    int anInt2510;
    int anInt2511;
    int[] anIntArray2512;
    int anInt2513;
    int anInt2514;
    private int anInt2515;
    int anInt2516;
    int anInt2517;
    int[] anIntArray2518;
    
    final String method3521(int argument_0_, byte argument_1_,
			    String argument_2_) {
	if (aJagexHashMap_2497 == null)
	    return argument_2_;
	if (argument_1_ >= -34)
	    method3522(null, 100, -82);
	StringNode class59_sub34
	    = (StringNode) aJagexHashMap_2497.get((long) argument_0_);
	if (class59_sub34 == null)
	    return argument_2_;
	return ((StringNode) class59_sub34).value;
    }
    
    private final void method3522(Packet argument_3_, int argument_4_,
				  int argument_5_) {
	if (argument_5_ != 1) {
	    if (argument_5_ == 2)
		((Class299) this).anInt2501
		    = argument_3_.g2();
	    else if (argument_5_ == 3)
		((Class299) this).aString2478
		    = argument_3_.gstr();
	    else if (argument_5_ != 4) {
		if (argument_5_ == 5)
		    ((Class299) this).anInt2508
			= argument_3_.g3_dupl();
		else if (argument_5_ != 6) {
		    if (argument_5_ != 7) {
			if (argument_5_ == 8)
			    ((Class299) this).aBoolean2482
				= argument_3_.g1() == 1;
			else if (argument_5_ == 9) {
			    anInt2499
				= argument_3_.g2();
			    if (anInt2499 == 65535)
				anInt2499 = -1;
			    anInt2506 = argument_3_.g2();
			    if (anInt2506 == 65535)
				anInt2506 = -1;
			    anInt2502
				= argument_3_.g4();
			    anInt2515 = argument_3_.g4();
			} else if (argument_5_ >= 10 && argument_5_ <= 14)
			    ((Class299) this).aStringArray2507[(argument_5_
								- 10)]
				= argument_3_.gstr();
			else if (argument_5_ != 15) {
			    if (argument_5_ == 16)
				((Class299) this).aBoolean2503 = false;
			    else if (argument_5_ == 17)
				((Class299) this).aString2485
				    = argument_3_.gstr();
			    else if (argument_5_ != 18) {
				if (argument_5_ == 19)
				    ((Class299) this).anInt2490
					= argument_3_.g2();
				else if (argument_5_ != 20) {
				    if (argument_5_ == 21)
					((Class299) this).anInt2511
					    = argument_3_.g4();
				    else if (argument_5_ == 22)
					((Class299) this).anInt2516
					    = argument_3_.g4();
				    else if (argument_5_ != 23) {
					if (argument_5_ != 24) {
					    if (argument_5_ == 249) {
						int anLocalInt
						    = (argument_3_.g1
                                ());
						if (aJagexHashMap_2497 == null) {
						    int anLocalInt_6_
							= (MathStatics.method2589(anLocalInt));
						    aJagexHashMap_2497
							= (new JagexHashMap
							   (anLocalInt_6_));
						}
						for (int anLocalInt_7_ = 0;
						     (anLocalInt_7_
						      < anLocalInt);
						     anLocalInt_7_++) {
						    boolean anLocalBoolean
							= ((argument_3_
								.g1
                                        ())
							   == 1);
						    int anLocalInt_8_
							= (argument_3_
							       .g3_dupl
                                           ());
						    Node node;
						    if (!anLocalBoolean)
							node
							    = (new IntegerNode
							       (argument_3_
								    .g4
                                            ()));
						    else
							node
							    = (new StringNode
							       (argument_3_
								    .gstr
                                            ()));
						    aJagexHashMap_2497.put((long) anLocalInt_8_, node);
						}
					    }
					} else {
					    ((Class299) this).anInt2505
						= (argument_3_.g2s
                                ());
					    ((Class299) this).anInt2479
						= (argument_3_.g2s
                                ());
					}
				    } else {
					((Class299) this).anInt2504
					    = argument_3_
						  .g1();
					((Class299) this).anInt2488
					    = (argument_3_.g1
                            ());
					((Class299) this).anInt2513
					    = argument_3_
						  .g1();
				    }
				} else {
				    anInt2498 = argument_3_.g2();
				    if (anInt2498 == 65535)
					anInt2498 = -1;
				    anInt2486 = argument_3_.g2();
				    if (anInt2486 == 65535)
					anInt2486 = -1;
				    anInt2489 = argument_3_.g4();
				    anInt2477 = argument_3_.g4();
				}
			    } else
				anInt2493 = argument_3_.g2();
			} else {
			    int anLocalInt
				= argument_3_.g1();
			    ((Class299) this).anIntArray2512
				= new int[anLocalInt * 2];
			    for (int anLocalInt_9_ = 0;
				 anLocalInt_9_ < anLocalInt * 2;
				 anLocalInt_9_++)
				((Class299) this).anIntArray2512[anLocalInt_9_]
				    = argument_3_.g2s();
			    ((Class299) this).anInt2500
				= argument_3_.g4();
			    int anLocalInt_10_
				= argument_3_
				      .g1();
			    ((Class299) this).anIntArray2518
				= new int[anLocalInt_10_];
			    for (int anLocalInt_11_ = 0;
				 (anLocalInt_11_
				  < ((Class299) this).anIntArray2518.length);
				 anLocalInt_11_++)
				((Class299) this).anIntArray2518
				    [anLocalInt_11_]
				    = (argument_3_.g4
                        ());
			    ((Class299) this).aByteArray2481
				= new byte[anLocalInt];
			    for (int anLocalInt_12_ = 0;
				 anLocalInt_12_ < anLocalInt; anLocalInt_12_++)
				((Class299) this).aByteArray2481
				    [anLocalInt_12_]
				    = argument_3_.g1s();
			}
		    } else {
			int anLocalInt
			    = argument_3_.g1();
			if ((anLocalInt & 0x2) == 2)
			    ((Class299) this).aBoolean2480 = true;
			if ((anLocalInt & 0x1) == 0)
			    ((Class299) this).aBoolean2491 = false;
		    }
		} else
		    ((Class299) this).anInt2514
			= argument_3_.g1();
	    } else
		((Class299) this).anInt2510
		    = argument_3_.g3_dupl();
	} else
	    ((Class299) this).anInt2509 = argument_3_.g2();
	if (argument_4_ != -23)
	    method3527(false, -102, null);
    }
    
    final void method3523(int argument_13_) {
	if (((Class299) this).anIntArray2512 != null) {
	    for (int anLocalInt = 0;
		 anLocalInt < ((Class299) this).anIntArray2512.length;
		 anLocalInt += 2) {
		if (((Class299) this).anIntArray2512[anLocalInt]
		    < ((Class299) this).anInt2494)
		    ((Class299) this).anInt2494
			= ((Class299) this).anIntArray2512[anLocalInt];
		else if (((Class299) this).anInt2517
			 < ((Class299) this).anIntArray2512[anLocalInt])
		    ((Class299) this).anInt2517
			= ((Class299) this).anIntArray2512[anLocalInt];
		if (((Class299) this).anIntArray2512[anLocalInt + 1]
		    >= ((Class299) this).anInt2492) {
		    if (((Class299) this).anIntArray2512[anLocalInt + 1]
			> ((Class299) this).anInt2483)
			((Class299) this).anInt2483
			    = ((Class299) this).anIntArray2512[anLocalInt + 1];
		} else
		    ((Class299) this).anInt2492
			= ((Class299) this).anIntArray2512[anLocalInt + 1];
	    }
	}
    }
    
    final int method3524(int argument_14_, int argument_15_,
			 int argument_16_) {
	if (aJagexHashMap_2497 == null)
	    return argument_14_;
	IntegerNode class59_sub54
	    = ((IntegerNode)
	       aJagexHashMap_2497.get((long) argument_15_));
	if (class59_sub54 == null)
	    return argument_14_;
	return ((IntegerNode) class59_sub54).value;
    }
    
    final boolean method3525(byte argument_17_, VariableValueSource argument_18_) {
	int anLocalInt;
	if (anInt2506 != -1)
	    anLocalInt = argument_18_.get(0, anInt2506);
	else {
	    if (anInt2499 == -1)
		return true;
	    anLocalInt = argument_18_.getVarbit(anInt2499, 14194);
	}
	if (anLocalInt < anInt2502 || anInt2515 < anLocalInt)
	    return false;
	boolean anLocalBoolean = false;
	int anLocalInt_19_;
	if (anInt2486 != -1)
	    anLocalInt_19_ = argument_18_.get(0, anInt2486);
	else {
	    if (anInt2498 == -1)
		return true;
	    anLocalInt_19_ = argument_18_.getVarbit(anInt2498, 14194);
	}
	if (anLocalInt_19_ < anInt2489 || anLocalInt_19_ > anInt2477)
	    return false;
	return true;
    }
    
    final void method3526(int argument_20_, Packet argument_21_) {
	for (;;) {
	    int anLocalInt = argument_21_.g1();
	    if (anLocalInt == 0)
		break;
	    method3522(argument_21_, argument_20_ - 23, anLocalInt);
	}
	if (argument_20_ != 0)
	    ((Class299) this).aBoolean2482 = true;
    }
    
    final Class368 method3527(boolean argument_22_, int argument_23_,
			      GraphicsToolkit argument_24_) {
	int anLocalInt = (!argument_22_ ? ((Class299) this).anInt2509
			  : ((Class299) this).anInt2501);
	int anLocalInt_25_
	    = ((GraphicsToolkit) argument_24_).anInt939 << 29 | anLocalInt;
	Class368 class368
	    = ((Class368)
	       ((Class20) ((Class299) this).aClass20_2487).aClass149_133
		   .get((long) anLocalInt_25_));
	if (class368 != null)
	    return class368;
	if (!((Class20) ((Class299) this).aClass20_2487).aJs5Store_132
		 .isFlatFile(anLocalInt))
	    return null;
	Class83 class83
	    = Class83.method1612((((Class20) ((Class299) this).aClass20_2487)
				  .aJs5Store_132),
				 anLocalInt, argument_23_);
	if (class83 != null) {
	    class368 = argument_24_.method2033(class83, true);
	    ((Class20) ((Class299) this).aClass20_2487).aClass149_133
		.put(class368, (long) anLocalInt_25_);
	}
	return class368;
    }
    
    final Class368 method3528(GraphicsToolkit argument_26_, byte argument_27_) {
	Class368 class368
	    = ((Class368)
	       (((Class20) ((Class299) this).aClass20_2487).aClass149_133
		    .get((long) (anInt2493 | 0x20000 | ((GraphicsToolkit) argument_26_).anInt939 << 29))));
	if (class368 != null)
	    return class368;
	((Class20) ((Class299) this).aClass20_2487).aJs5Store_132
	    .isFlatFile(anInt2493);
	Class83 class83
	    = Class83.method1612((((Class20) ((Class299) this).aClass20_2487)
				  .aJs5Store_132),
				 anInt2493, 0);
	if (argument_27_ != 2)
	    return null;
	if (class83 != null) {
	    class368 = argument_26_.method2033(class83, true);
	    ((Class20) ((Class299) this).aClass20_2487).aClass149_133
		.put(class368, (long) (anInt2493 | 0x20000 | ((GraphicsToolkit) argument_26_).anInt939 << 29));
	}
	return class368;
    }
    
    public Class299() {
	((Class299) this).aBoolean2482 = true;
	((Class299) this).aBoolean2480 = false;
	anInt2498 = -1;
	anInt2486 = -1;
	((Class299) this).aBoolean2503 = true;
	((Class299) this).aStringArray2507 = new String[5];
	((Class299) this).anInt2494 = 2147483647;
	anInt2506 = -1;
	anInt2499 = -1;
	((Class299) this).anInt2492 = 2147483647;
	((Class299) this).anInt2501 = -1;
	((Class299) this).anInt2504 = -1;
	((Class299) this).anInt2513 = -1;
	anInt2493 = -1;
	((Class299) this).anInt2483 = -2147483648;
	((Class299) this).anInt2509 = -1;
	((Class299) this).anInt2514 = 0;
	((Class299) this).anInt2517 = -2147483648;
	((Class299) this).anInt2508 = -1;
    }
    
    public static void method3529(byte argument) {
	aJagexHashMap_2496 = null;
    }
    
    static {
	new BitSet(65536);
    }
}
