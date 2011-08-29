/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class291
{
    boolean aBoolean2311;
    private byte aByte2312;
    int anInt2313;
    short aShort2314;
    int anInt2315;
    private byte aByte2316;
    boolean aBoolean2317 = false;
    int anInt2318;
    private byte aByte2319;
    int anInt2320;
    boolean aBoolean2321;
    byte aByte2322 = -1;
    private int anInt2323;
    int[] anIntArray2324;
    int anInt2325;
    byte aByte2326;
    private short[] aShortArray2327;
    short aShort2328;
    int[] anIntArray2329;
    int anInt2330;
    int anInt2331;
    int anInt2332;
    String aString2333;
    short[] aShortArray2334;
    int anInt2335;
    private int anInt2336;
    int anInt2337;
    int anInt2338;
    int anInt2339;
    int anInt2340;
    int anInt2341;
    boolean aBoolean2342;
    private byte[] aByteArray2343;
    int anInt2344;
    int anInt2345;
    int anInt2346;
    private JagexHashMap aJagexHashMap_2347;
    int anInt2348;
    static Class366 aClass366_2349 = new Class366();
    byte aByte2350;
    private int anInt2351;
    int anInt2352;
    private int anInt2353;
    String[] aStringArray2354;
    private int anInt2355;
    int anInt2356;
    int anInt2357;
    int anInt2358;
    private int[][] anIntArrayArray2359;
    int anInt2360;
    int anInt2361;
    boolean aBoolean2362;
    int[] anIntArray2363;
    short[] aShortArray2364;
    boolean aBoolean2365;
    static boolean[] aBooleanArray2366 = new boolean[5];
    byte aByte2367;
    int anInt2368;
    Class26 aClass26_2369;
    private int anInt2370;
    boolean aBoolean2371;
    byte aByte2372;
    private byte aByte2373;
    int[] anIntArray2374;
    int anInt2375;
    boolean aBoolean2376;
    private short[] aShortArray2377;
    int anInt2378;
    
    private final void method3484(int argument_0_, Packet argument_1_,
				  int argument_2_) {
	if (argument_2_ != 1) {
	    if (argument_2_ == 2)
		((Class291) this).aString2333
		    = argument_1_.gstr();
	    else if (argument_2_ != 12) {
		if (argument_2_ >= 30 && argument_2_ < 35)
		    ((Class291) this).aStringArray2354[argument_2_ - 30]
			= argument_1_.gstr();
		else if (argument_2_ == 40) {
		    int anLocalInt = argument_1_.g1();
		    aShortArray2327 = new short[anLocalInt];
		    ((Class291) this).aShortArray2364 = new short[anLocalInt];
		    for (int anLocalInt_3_ = 0; anLocalInt > anLocalInt_3_;
			 anLocalInt_3_++) {
			aShortArray2327[anLocalInt_3_]
			    = (short) (argument_1_.g2
                    ());
			((Class291) this).aShortArray2364[anLocalInt_3_]
			    = (short) argument_1_.g2();
		    }
		} else if (argument_2_ != 41) {
		    if (argument_2_ != 42) {
			if (argument_2_ == 60) {
			    int anLocalInt
				= argument_1_.g1();
			    ((Class291) this).anIntArray2363
				= new int[anLocalInt];
			    for (int anLocalInt_4_ = 0;
				 anLocalInt_4_ < anLocalInt; anLocalInt_4_++)
				((Class291) this).anIntArray2363[anLocalInt_4_]
				    = argument_1_.g2();
			} else if (argument_2_ == 93)
			    ((Class291) this).aBoolean2362 = false;
			else if (argument_2_ == 95)
			    ((Class291) this).anInt2340
				= argument_1_.g2();
			else if (argument_2_ == 97)
			    anInt2370
				= argument_1_.g2();
			else if (argument_2_ == 98)
			    anInt2351
				= argument_1_.g2();
			else if (argument_2_ == 99)
			    ((Class291) this).aBoolean2321 = true;
			else if (argument_2_ != 100) {
			    if (argument_2_ != 101) {
				if (argument_2_ == 102)
				    ((Class291) this).anInt2325
					= argument_1_
					      .g2();
				else if (argument_2_ != 103) {
				    if (argument_2_ == 106
					|| argument_2_ == 118) {
					anInt2355 = argument_1_.g2();
					if (anInt2355 == 65535)
					    anInt2355 = -1;
					anInt2323 = argument_1_.g2();
					if (anInt2323 == 65535)
					    anInt2323 = -1;
					int anLocalInt = -1;
					if (argument_2_ == 118) {
					    anLocalInt
						= argument_1_.g2();
					    if (anLocalInt == 65535)
						anLocalInt = -1;
					}
					int anLocalInt_5_
					    = (argument_1_.g1
                            ());
					((Class291) this).anIntArray2374
					    = new int[anLocalInt_5_ + 2];
					for (int anLocalInt_6_ = 0;
					     anLocalInt_5_ >= anLocalInt_6_;
					     anLocalInt_6_++) {
					    ((Class291) this)
						.anIntArray2374[anLocalInt_6_]
						= argument_1_.g2();
					    if ((((Class291) this)
						 .anIntArray2374
						 [anLocalInt_6_])
						== 65535)
						((Class291) this)
						    .anIntArray2374
						    [anLocalInt_6_]
						    = -1;
					}
					((Class291) this).anIntArray2374
					    [anLocalInt_5_ + 1]
					    = anLocalInt;
				    } else if (argument_2_ == 107)
					((Class291) this).aBoolean2342 = false;
				    else if (argument_2_ != 109) {
					if (argument_2_ != 111) {
					    if (argument_2_ == 113) {
						((Class291) this).aShort2314
						    = (short) (argument_1_
								   .g2
                                           ());
						((Class291) this).aShort2328
						    = (short) (argument_1_
								   .g2
                                           ());
					    } else if (argument_2_ != 114) {
						if (argument_2_ != 119) {
						    if (argument_2_ != 121) {
							if (argument_2_ == 122)
							    ((Class291) this)
								.anInt2348
								= (argument_1_
								       .g2
                                               ());
							else if (argument_2_
								 == 123)
							    ((Class291) this)
								.anInt2318
								= (argument_1_
								       .g2
                                               ());
							else if (argument_2_
								 == 125)
							    ((Class291) this)
								.aByte2372
								= (argument_1_
								       .g1s
                                               ());
							else if (argument_2_
								 == 127)
							    ((Class291) this)
								.anInt2361
								= (argument_1_
								       .g2
                                               ());
							else if (argument_2_
								 != 128) {
							    if (argument_2_
								!= 134) {
								if (argument_2_
								    != 135) {
								    if (argument_2_
									== 136) {
									((Class291)
									 this)
									    .anInt2313
									    = argument_1_.g1();
									((Class291)
									 this)
									    .anInt2337
									    = argument_1_.g2();
								    } else if (argument_2_
									       != 137) {
									if (argument_2_
									    == 138)
									    ((Class291)
									     this).anInt2378
										= argument_1_.g2();
									else if (argument_2_ == 139)
									    ((Class291)
									     this).anInt2332
										= argument_1_.g2();
									else if (argument_2_ == 140)
									    ((Class291)
									     this).anInt2331
										= argument_1_.g1();
									else if (argument_2_ != 141) {
									    if (argument_2_ == 142)
										((Class291) this).anInt2339 = argument_1_.g2();
									    else if (argument_2_ == 143)
										((Class291) this).aBoolean2317 = true;
									    else if (argument_2_ >= 150 && argument_2_ < 155) {
										((Class291) this).aStringArray2354[argument_2_ - 150] = argument_1_.gstr();
										if (!((Class26) ((Class291) this).aClass26_2369).aBoolean175)
										    ((Class291) this).aStringArray2354[argument_2_ - 150] = null;
									    } else if (argument_2_ == 155) {
										aByte2373 = argument_1_.g1s();
										aByte2316 = argument_1_.g1s();
										aByte2312 = argument_1_.g1s();
										aByte2319 = argument_1_.g1s();
									    } else if (argument_2_ != 158) {
										if (argument_2_ == 159)
										    ((Class291) this).aByte2322 = (byte) 0;
										else if (argument_2_ != 160) {
										    if (argument_2_ != 162) {
											if (argument_2_ == 163)
											    ((Class291) this).anInt2341 = argument_1_.g1();
											else if (argument_2_ == 164) {
											    ((Class291) this).anInt2335 = argument_1_.g2();
											    ((Class291) this).anInt2356 = argument_1_.g2();
											} else if (argument_2_ == 165)
											    ((Class291) this).anInt2320 = argument_1_.g1();
											else if (argument_2_ == 168)
											    ((Class291) this).anInt2358 = argument_1_.g1();
											else if (argument_2_ == 249) {
											    int anLocalInt = argument_1_.g1();
											    if (aJagexHashMap_2347 == null) {
												int anLocalInt_7_ = MathStatics.method2589(anLocalInt);
												aJagexHashMap_2347 = new JagexHashMap(anLocalInt_7_);
											    }
											    for (int anLocalInt_8_ = 0; anLocalInt > anLocalInt_8_; anLocalInt_8_++) {
												boolean anLocalBoolean = argument_1_.g1() == 1;
												int anLocalInt_9_ = argument_1_.g3_dupl();
												Node node;
												if (!anLocalBoolean)
												    node = new IntegerNode(argument_1_.g4());
												else
												    node = new StringNode(argument_1_.gstr());
												aJagexHashMap_2347.put((long) anLocalInt_9_, node);
											    }
											}
										    } else
											((Class291) this).aBoolean2365 = true;
										} else {
										    int anLocalInt = argument_1_.g1();
										    ((Class291) this).anIntArray2324 = new int[anLocalInt];
										    for (int anLocalInt_10_ = 0; anLocalInt > anLocalInt_10_; anLocalInt_10_++)
											((Class291) this).anIntArray2324[anLocalInt_10_] = argument_1_.g2();
										}
									    } else
										((Class291) this).aByte2322 = (byte) 1;
									} else
									    ((Class291)
									     this).aBoolean2311
										= true;
								    } else
									((Class291)
									 this)
									    .anInt2368
									    = argument_1_.g2();
								} else {
								    ((Class291)
								     this)
									.anInt2357
									= (argument_1_.g1
                                            ());
								    ((Class291)
								     this)
									.anInt2360
									= (argument_1_.g2
                                            ());
								}
							    } else {
								((Class291)
								 this)
								    .anInt2352
								    = (argument_1_
									   .g2
                                               ());
								if ((((Class291)
								      this)
								     .anInt2352)
								    == 65535)
								    ((Class291)
								     this)
									.anInt2352
									= -1;
								((Class291)
								 this)
								    .anInt2330
								    = (argument_1_
									   .g2
                                               ());
								if ((((Class291)
								      this)
								     .anInt2330)
								    == 65535)
								    ((Class291)
								     this)
									.anInt2330
									= -1;
								((Class291)
								 this)
								    .anInt2315
								    = (argument_1_
									   .g2
                                               ());
								if ((((Class291)
								      this)
								     .anInt2315)
								    == 65535)
								    ((Class291)
								     this)
									.anInt2315
									= -1;
								((Class291)
								 this)
								    .anInt2338
								    = (argument_1_
									   .g2
                                               ());
								if ((((Class291)
								      this)
								     .anInt2338)
								    == 65535)
								    ((Class291)
								     this)
									.anInt2338
									= -1;
								((Class291)
								 this)
								    .anInt2346
								    = (argument_1_
									   .g1
                                               ());
							    }
							} else
							    argument_1_
								.g1
                                        ();
						    } else {
							anIntArrayArray2359
							    = (new int
							       [(((Class291)
								  this)
								 .anIntArray2329).length]
							       []);
							int anLocalInt
							    = (argument_1_
								   .g1
                                           ());
							for (int anLocalInt_11_
								 = 0;
							     (anLocalInt
							      > anLocalInt_11_);
							     anLocalInt_11_++) {
							    int anLocalInt_12_
								= (argument_1_
								       .g1
                                               ());
							    int[] anLocalInts
								= (anIntArrayArray2359
								       [anLocalInt_12_]
								   = (new int
								      [3]));
							    anLocalInts[0]
								= (argument_1_
								       .g1s
                                               ());
							    anLocalInts[1]
								= (argument_1_
								       .g1s
                                               ());
							    anLocalInts[2]
								= (argument_1_
								       .g1s
                                               ());
							}
						    }
						} else
						    ((Class291) this).aByte2367
							= (argument_1_
							       .g1s
                                           ());
					    } else {
						((Class291) this).aByte2350
						    = (argument_1_.g1s
                                ());
						((Class291) this).aByte2326
						    = (argument_1_.g1s
                                ());
					    }
					} else
					    ((Class291) this).aBoolean2371
						= false;
				    } else
					((Class291) this).aBoolean2376 = false;
				} else
				    ((Class291) this).anInt2345
					= argument_1_
					      .g2();
			    } else
				anInt2353
				    = argument_1_.g1s() * 5;
			} else
			    anInt2336 = argument_1_.g1s();
		    } else {
			int anLocalInt = argument_1_.g1();
			aByteArray2343 = new byte[anLocalInt];
			for (int anLocalInt_13_ = 0;
			     anLocalInt > anLocalInt_13_; anLocalInt_13_++)
			    aByteArray2343[anLocalInt_13_]
				= argument_1_.g1s();
		    }
		} else {
		    int anLocalInt
			= argument_1_.g1();
		    aShortArray2377 = new short[anLocalInt];
		    ((Class291) this).aShortArray2334 = new short[anLocalInt];
		    for (int anLocalInt_14_ = 0; anLocalInt > anLocalInt_14_;
			 anLocalInt_14_++) {
			aShortArray2377[anLocalInt_14_]
			    = (short) argument_1_.g2();
			((Class291) this).aShortArray2334[anLocalInt_14_]
			    = (short) argument_1_.g2();
		    }
		}
	    } else
		((Class291) this).anInt2344
		    = argument_1_.g1();
	} else {
	    int anLocalInt = argument_1_.g1();
	    ((Class291) this).anIntArray2329 = new int[anLocalInt];
	    for (int anLocalInt_15_ = 0; anLocalInt > anLocalInt_15_;
		 anLocalInt_15_++) {
		((Class291) this).anIntArray2329[anLocalInt_15_]
		    = argument_1_.g2();
		if (((Class291) this).anIntArray2329[anLocalInt_15_] == 65535)
		    ((Class291) this).anIntArray2329[anLocalInt_15_] = -1;
	    }
	}
	if (argument_0_ != 168)
	    method3492((byte) -99);
    }
    
    final Class291 method3485(VariableValueSource argument_16_, int argument_17_) {
	int anLocalInt = argument_17_;
	if (anInt2355 == -1) {
	    if (anInt2323 != -1)
		anLocalInt
		    = argument_16_.get(argument_17_ + 1, anInt2323);
	} else
	    anLocalInt = argument_16_.getVarbit(anInt2355, 14194);
	if (anLocalInt < 0
	    || anLocalInt >= ((Class291) this).anIntArray2374.length - 1
	    || ((Class291) this).anIntArray2374[anLocalInt] == -1) {
	    int anLocalInt_18_
		= (((Class291) this).anIntArray2374
		   [((Class291) this).anIntArray2374.length - 1]);
	    if (anLocalInt_18_ == -1)
		return null;
	    return ((Class291) this).aClass26_2369.method343((byte) -86,
							     anLocalInt_18_);
	}
	return ((Class291) this).aClass26_2369.method343((byte) -115,
							 (((Class291) this)
							  .anIntArray2374
							  [anLocalInt]));
    }
    
    final void method3486(byte argument_19_) {
	if (((Class291) this).aByte2322 == -1) {
	    if (((Class26) ((Class291) this).aClass26_2369).aGameEnum_170
		== GameEnum.RUNESCAPE)
		((Class291) this).aByte2322 = (byte) 1;
	    else
		((Class291) this).aByte2322 = (byte) 0;
	}
	if (((Class291) this).anIntArray2329 == null)
	    ((Class291) this).anIntArray2329 = new int[0];
    }
    
    final Class167 method3487(int argument_20_, byte argument_21_,
			      int argument_22_, int argument_23_,
			      VariableValueSource argument_24_, GraphicsToolkit argument_25_,
			      Class8 argument_26_, Class336 argument_27_,
			      int argument_28_, Class367 argument_29_) {
	if (((Class291) this).anIntArray2374 != null) {
	    Class291 class291 = method3485(argument_24_, -1);
	    if (class291 == null)
		return null;
	    return class291.method3487(argument_20_, (byte) -32, argument_22_,
				       argument_23_, argument_24_,
				       argument_25_, argument_26_,
				       argument_27_, argument_28_,
				       argument_29_);
	}
	if (((Class291) this).anIntArray2363 == null
	    && (argument_26_ == null
		|| ((Class8) argument_26_).anIntArray79 == null))
	    return null;
	if (argument_21_ != -32)
	    return null;
	int anLocalInt = argument_22_;
	if (argument_29_ != null && argument_28_ != -1)
	    anLocalInt |= argument_29_.method3997(true, argument_23_, 27123,
						  argument_28_);
	long l = (long) (((GraphicsToolkit) argument_25_).anInt939 << 16
			 | ((Class291) this).anInt2375);
	if (argument_26_ != null)
	    l |= ((Class8) argument_26_).aLong83 << 24;
	Class167 class167;
	synchronized (((Class26) ((Class291) this).aClass26_2369)
		      .aClass149_181) {
	    class167 = (Class167) ((Class26) ((Class291) this).aClass26_2369)
				      .aClass149_181.get(l);
	}
	if (class167 == null || anLocalInt != (class167.ua() & anLocalInt)) {
	    if (class167 != null)
		anLocalInt |= class167.ua();
	    int anLocalInt_30_ = anLocalInt;
	    int[] anLocalInts
		= ((argument_26_ == null
		    || ((Class8) argument_26_).anIntArray79 == null)
		   ? ((Class291) this).anIntArray2363
		   : ((Class8) argument_26_).anIntArray79);
	    boolean anLocalBoolean = false;
	    synchronized (((Class26) ((Class291) this).aClass26_2369)
			  .aJs5Store_171) {
		for (int anLocalInt_31_ = 0;
		     anLocalInts.length > anLocalInt_31_; anLocalInt_31_++) {
		    if (!((Class26) ((Class291) this).aClass26_2369)
			     .aJs5Store_171.isLoaded(anLocalInts[anLocalInt_31_], 0))
			anLocalBoolean = true;
		}
	    }
	    if (anLocalBoolean)
		return null;
	    Class101[] class101s = new Class101[anLocalInts.length];
	    synchronized (((Class26) ((Class291) this).aClass26_2369)
			  .aJs5Store_171) {
		for (int anLocalInt_32_ = 0;
		     anLocalInts.length > anLocalInt_32_; anLocalInt_32_++)
		    class101s[anLocalInt_32_]
			= (tia_sub_35_Sub1DoublyLinked.method1219(argument_21_ + 2085750800, (((Class26) ((Class291) this).aClass26_2369).aJs5Store_171), anLocalInts[anLocalInt_32_], 0));
	    }
	    for (int anLocalInt_33_ = 0; anLocalInts.length > anLocalInt_33_;
		 anLocalInt_33_++) {
		if (class101s[anLocalInt_33_] != null
		    && ((Class101) class101s[anLocalInt_33_]).anInt820 < 13)
		    class101s[anLocalInt_33_].method1733(17496, 2);
	    }
	    Class101 class101;
	    if (class101s.length == 1)
		class101 = class101s[0];
	    else
		class101 = new Class101(class101s, class101s.length);
	    if (aShortArray2327 != null)
		anLocalInt_30_ |= 0x4000;
	    if (aShortArray2377 != null)
		anLocalInt_30_ |= 0x8000;
	    if (aByte2319 != 0)
		anLocalInt_30_ |= 0x80000;
	    class167 = argument_25_.method2057(class101, anLocalInt_30_,
					       (((Class26) (((Class291) this)
							    .aClass26_2369))
						.anInt182),
					       64, 768);
	    if (aShortArray2327 != null) {
		short[] anLocalInts_34_;
		if (argument_26_ == null
		    || ((Class8) argument_26_).aShortArray76 == null)
		    anLocalInts_34_ = ((Class291) this).aShortArray2364;
		else
		    anLocalInts_34_ = ((Class8) argument_26_).aShortArray76;
		for (int anLocalInt_35_ = 0;
		     anLocalInt_35_ < aShortArray2327.length;
		     anLocalInt_35_++) {
		    if (aByteArray2343 == null
			|| anLocalInt_35_ >= aByteArray2343.length)
			class167.ia(aShortArray2327[anLocalInt_35_],
				    anLocalInts_34_[anLocalInt_35_]);
		    else
			class167.ia(aShortArray2327[anLocalInt_35_],
				    (Class62_Sub27.aShortArray4449
				     [aByteArray2343[anLocalInt_35_] & 0xff]));
		}
	    }
	    if (aShortArray2377 != null) {
		short[] anLocalInts_36_;
		if (argument_26_ != null
		    && ((Class8) argument_26_).aShortArray80 != null)
		    anLocalInts_36_ = ((Class8) argument_26_).aShortArray80;
		else
		    anLocalInts_36_ = ((Class291) this).aShortArray2334;
		for (int anLocalInt_37_ = 0;
		     anLocalInt_37_ < aShortArray2377.length; anLocalInt_37_++)
		    class167.aa(aShortArray2377[anLocalInt_37_],
				anLocalInts_36_[anLocalInt_37_]);
	    }
	    if (aByte2319 != 0)
		class167.method2649(aByte2373, aByte2316, aByte2312,
				    aByte2319 & 0xff);
	    class167.s(anLocalInt);
	    synchronized (((Class26) ((Class291) this).aClass26_2369)
			  .aClass149_181) {
		((Class26) ((Class291) this).aClass26_2369).aClass149_181
		    .put(class167, l);
	    }
	}
	if (argument_29_ != null && argument_28_ != -1)
	    class167 = argument_29_.method4000(argument_20_, class167, false,
					       argument_23_, anLocalInt,
					       argument_28_);
	class167.s(argument_22_);
	return class167;
    }
    
    final int method3488(int argument_38_, int argument_39_,
			 byte argument_40_) {
	if (aJagexHashMap_2347 == null)
	    return argument_39_;
	IntegerNode class59_sub54
	    = ((IntegerNode)
	       aJagexHashMap_2347.get((long) argument_38_));
	if (class59_sub54 == null)
	    return argument_39_;
	return ((IntegerNode) class59_sub54).value;
    }
    
    final String method3489(int argument_41_, String argument_42_,
			    byte argument_43_) {
	if (argument_43_ != 100)
	    ((Class291) this).anInt2320 = 19;
	if (aJagexHashMap_2347 == null)
	    return argument_42_;
	StringNode class59_sub34
	    = (StringNode) aJagexHashMap_2347.get((long) argument_41_);
	if (class59_sub34 == null)
	    return argument_42_;
	return ((StringNode) class59_sub34).value;
    }
    
    final void method3490(int argument_44_, Packet argument_45_) {
	for (;;) {
	    int anLocalInt = argument_45_.g1();
	    if (anLocalInt == 0)
		break;
	    method3484(168, argument_45_, anLocalInt);
	}
    }
    
    final boolean method3491(VariableValueSource argument_46_, int argument_47_) {
	if (((Class291) this).anIntArray2374 == null)
	    return true;
	int anLocalInt = -1;
	if (anInt2355 != -1)
	    anLocalInt = argument_46_.getVarbit(anInt2355, 14194);
	else if (anInt2323 != -1)
	    anLocalInt = argument_46_.get(0, anInt2323);
	if (anLocalInt < 0
	    || ((Class291) this).anIntArray2374.length - 1 <= anLocalInt
	    || ((Class291) this).anIntArray2374[anLocalInt] == -1) {
	    int anLocalInt_48_
		= (((Class291) this).anIntArray2374
		   [((Class291) this).anIntArray2374.length - 1]);
	    if (anLocalInt_48_ != -1)
		return true;
	    return false;
	}
	return true;
    }
    
    public static void method3492(byte argument) {
	aBooleanArray2366 = null;
	aClass366_2349 = null;
    }
    
    final Class167 method3493
	(Class367 argument_49_, VariableValueSource argument_50_, int argument_51_,
	 GraphicsToolkit argument_52_, Class91[] argument_53_, Class336 argument_54_,
	 int argument_55_, int[] argument_56_, Class41 argument_57_,
	 int argument_58_, int argument_59_, Class8 argument_60_,
	 int argument_61_, int argument_62_, Class367 argument_63_,
	 int argument_64_, int argument_65_, int argument_66_) {
	if (((Class291) this).anIntArray2374 != null) {
	    Class291 class291 = method3485(argument_50_, -1);
	    if (class291 == null)
		return null;
	    return class291.method3493(argument_49_, argument_50_,
				       argument_51_, argument_52_,
				       argument_53_, argument_54_,
				       argument_55_, argument_56_,
				       argument_57_, argument_58_,
				       argument_59_, argument_60_, 103,
				       argument_62_, argument_63_,
				       argument_64_, argument_65_,
				       argument_66_);
	}
	int anLocalInt = argument_64_;
	if (anInt2351 != 128)
	    anLocalInt |= 0x2;
	if (anInt2370 != 128)
	    anLocalInt |= 0x5;
	boolean anLocalBoolean = argument_49_ != null || argument_63_ != null;
	boolean anLocalBoolean_67_ = false;
	boolean anLocalBoolean_68_ = false;
	boolean anLocalBoolean_69_ = false;
	boolean anLocalBoolean_70_ = false;
	int anLocalInt_71_ = argument_53_ == null ? 0 : argument_53_.length;
	for (int anLocalInt_72_ = 0; anLocalInt_71_ > anLocalInt_72_;
	     anLocalInt_72_++) {
	    Class214_Sub1.aClass59_Sub51_Sub6Array5655[anLocalInt_72_] = null;
	    if (argument_53_[anLocalInt_72_] != null) {
		Class367 class367
		    = argument_54_.method3758((((Class91)
						argument_53_[anLocalInt_72_])
					       .anInt704),
					      0);
		if (((Class367) class367).anIntArray3096 != null) {
		    Canvas_Sub1.aClass367Array32[anLocalInt_72_] = class367;
		    anLocalBoolean = true;
		    int anLocalInt_73_
			= ((Class91) argument_53_[anLocalInt_72_]).anInt698;
		    int anLocalInt_74_
			= ((Class91) argument_53_[anLocalInt_72_]).anInt700;
		    int anLocalInt_75_
			= ((Class367) class367).anIntArray3096[anLocalInt_73_];
		    Class214_Sub1.aClass59_Sub51_Sub6Array5655[anLocalInt_72_]
			= argument_54_.method3754(-4849,
						  anLocalInt_75_ >>> 16);
		    anLocalInt_75_ &= 0xffff;
		    Class235.anIntArray1718[anLocalInt_72_] = anLocalInt_75_;
		    if ((Class214_Sub1.aClass59_Sub51_Sub6Array5655
			 [anLocalInt_72_])
			!= null) {
			anLocalBoolean_68_
			    |= Class214_Sub1.aClass59_Sub51_Sub6Array5655
				   [anLocalInt_72_]
				   .method1205((byte) -114, anLocalInt_75_);
			anLocalBoolean_67_
			    |= Class214_Sub1.aClass59_Sub51_Sub6Array5655
				   [anLocalInt_72_]
				   .method1206(false, anLocalInt_75_);
			anLocalBoolean_70_
			    |= Class214_Sub1.aClass59_Sub51_Sub6Array5655
				   [anLocalInt_72_]
				   .method1204(anLocalInt_75_, -1);
			anLocalBoolean_69_
			    |= ((Class367) class367).aBoolean3112;
		    }
		    if ((!((Class367) class367).aBoolean3110
			 && !Node_Sub31_Sub9.aBoolean5877)
			|| anLocalInt_74_ == -1
			|| (((Class367) class367).anIntArray3096.length
			    <= anLocalInt_74_)) {
			JagexHashMap.anIntArray488[anLocalInt_72_] = 0;
			Cs2CallStackEntry.anIntArray511[anLocalInt_72_] = 0;
			Node_Sub45.aClass59_Sub51_Sub6Array4265
			    [anLocalInt_72_]
			    = null;
			Class264.anIntArray2048[anLocalInt_72_] = -1;
		    } else {
			JagexHashMap.anIntArray488[anLocalInt_72_]
			    = (((Class367) class367).anIntArray3094
			       [anLocalInt_73_]);
			Cs2CallStackEntry.anIntArray511[anLocalInt_72_]
			    = (((Class91) argument_53_[anLocalInt_72_])
			       .anInt702);
			int anLocalInt_76_ = (((Class367) class367)
					      .anIntArray3096[anLocalInt_74_]);
			Node_Sub45.aClass59_Sub51_Sub6Array4265
			    [anLocalInt_72_]
			    = argument_54_.method3754(-4849,
						      anLocalInt_76_ >>> 16);
			anLocalInt_76_ &= 0xffff;
			Class264.anIntArray2048[anLocalInt_72_]
			    = anLocalInt_76_;
			if ((Node_Sub45.aClass59_Sub51_Sub6Array4265
			     [anLocalInt_72_])
			    != null) {
			    anLocalBoolean_68_
				|= (Node_Sub45
					.aClass59_Sub51_Sub6Array4265
					[anLocalInt_72_].method1205
				    ((byte) -114, anLocalInt_76_));
			    anLocalBoolean_67_
				|= Node_Sub45
				       .aClass59_Sub51_Sub6Array4265
				       [anLocalInt_72_]
				       .method1206(false, anLocalInt_76_);
			    anLocalBoolean_70_
				|= Node_Sub45
				       .aClass59_Sub51_Sub6Array4265
				       [anLocalInt_72_]
				       .method1204(anLocalInt_76_, -1);
			}
		    }
		}
	    }
	}
	int anLocalInt_77_ = -1;
	int anLocalInt_78_ = -1;
	int anLocalInt_79_ = 0;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6 = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_80_ = null;
	int anLocalInt_81_ = -1;
	int anLocalInt_82_ = -1;
	int anLocalInt_83_ = 0;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_84_ = null;
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6_85_ = null;
	if (anLocalBoolean) {
	    anLocalInt |= 0x20;
	    if (argument_49_ != null) {
		anLocalInt_77_
		    = ((Class367) argument_49_).anIntArray3096[argument_51_];
		int anLocalInt_86_ = anLocalInt_77_ >>> 16;
		class59_sub51_sub6
		    = argument_54_.method3754(-4849, anLocalInt_86_);
		anLocalInt_77_ &= 0xffff;
		if (class59_sub51_sub6 != null) {
		    anLocalBoolean_68_
			|= class59_sub51_sub6.method1205((byte) -114,
							 anLocalInt_77_);
		    anLocalBoolean_67_
			|= class59_sub51_sub6.method1206(false,
							 anLocalInt_77_);
		    anLocalBoolean_70_
			|= class59_sub51_sub6.method1204(anLocalInt_77_, -1);
		    anLocalBoolean_69_
			|= ((Class367) argument_49_).aBoolean3112;
		}
		if ((((Class367) argument_49_).aBoolean3110
		     || Node_Sub31_Sub9.aBoolean5877)
		    && argument_58_ != -1
		    && (((Class367) argument_49_).anIntArray3096.length
			> argument_58_)) {
		    anLocalInt_78_ = (((Class367) argument_49_).anIntArray3096
				      [argument_58_]);
		    anLocalInt_79_ = (((Class367) argument_49_).anIntArray3094
				      [argument_51_]);
		    int anLocalInt_87_ = anLocalInt_78_ >>> 16;
		    if (anLocalInt_87_ != anLocalInt_86_)
			class59_sub51_sub6_80_
			    = argument_54_.method3754(-4849, anLocalInt_87_);
		    else
			class59_sub51_sub6_80_ = class59_sub51_sub6;
		    anLocalInt_78_ &= 0xffff;
		    if (class59_sub51_sub6_80_ != null) {
			anLocalBoolean_68_
			    |= class59_sub51_sub6_80_
				   .method1205((byte) -114, anLocalInt_78_);
			anLocalBoolean_67_
			    |= class59_sub51_sub6_80_
				   .method1206(false, anLocalInt_78_);
			anLocalBoolean_70_
			    |= class59_sub51_sub6_80_
				   .method1204(anLocalInt_78_, -1);
		    }
		}
	    }
	    if (argument_63_ != null) {
		anLocalInt_81_
		    = ((Class367) argument_63_).anIntArray3096[argument_55_];
		int anLocalInt_88_ = anLocalInt_81_ >>> 16;
		anLocalInt_81_ &= 0xffff;
		class59_sub51_sub6_84_
		    = argument_54_.method3754(-4849, anLocalInt_88_);
		if (class59_sub51_sub6_84_ != null) {
		    anLocalBoolean_68_
			|= class59_sub51_sub6_84_.method1205((byte) -114,
							     anLocalInt_81_);
		    anLocalBoolean_67_
			|= class59_sub51_sub6_84_.method1206(false,
							     anLocalInt_81_);
		    anLocalBoolean_70_
			|= class59_sub51_sub6_84_.method1204(anLocalInt_81_,
							     -1);
		    anLocalBoolean_69_
			|= ((Class367) argument_63_).aBoolean3112;
		}
		if ((((Class367) argument_63_).aBoolean3110
		     || Node_Sub31_Sub9.aBoolean5877)
		    && argument_65_ != -1
		    && (((Class367) argument_63_).anIntArray3096.length
			> argument_65_)) {
		    anLocalInt_82_ = (((Class367) argument_63_).anIntArray3096
				      [argument_65_]);
		    anLocalInt_83_ = (((Class367) argument_63_).anIntArray3094
				      [argument_55_]);
		    int anLocalInt_89_ = anLocalInt_82_ >>> 16;
		    if (anLocalInt_89_ == anLocalInt_88_)
			class59_sub51_sub6_85_ = class59_sub51_sub6_84_;
		    else
			class59_sub51_sub6_85_
			    = argument_54_.method3754(-4849, anLocalInt_89_);
		    anLocalInt_82_ &= 0xffff;
		    if (class59_sub51_sub6_85_ != null) {
			anLocalBoolean_68_
			    |= class59_sub51_sub6_85_
				   .method1205((byte) -114, anLocalInt_82_);
			anLocalBoolean_67_
			    |= class59_sub51_sub6_85_
				   .method1206(false, anLocalInt_82_);
			anLocalBoolean_70_
			    |= class59_sub51_sub6_85_
				   .method1204(anLocalInt_82_, -1);
		    }
		}
	    }
	    if (anLocalBoolean_68_)
		anLocalInt |= 0x80;
	    if (anLocalBoolean_67_)
		anLocalInt |= 0x100;
	    if (anLocalBoolean_69_)
		anLocalInt |= 0x200;
	    if (anLocalBoolean_70_)
		anLocalInt |= 0x400;
	}
	long l = (long) (((Class291) this).anInt2375
			 | ((GraphicsToolkit) argument_52_).anInt939 << 16);
	if (argument_60_ != null)
	    l |= ((Class8) argument_60_).aLong83 << 24;
	Class167 class167;
	synchronized (((Class26) ((Class291) this).aClass26_2369)
		      .aClass149_179) {
	    class167 = (Class167) ((Class26) ((Class291) this).aClass26_2369)
				      .aClass149_179.get(l);
	}
	Class354 class354 = null;
	if (((Class291) this).anInt2361 != -1)
	    class354 = argument_57_.method421((byte) -75,
					      ((Class291) this).anInt2361);
	if (class167 == null || (class167.ua() & anLocalInt) != anLocalInt) {
	    if (class167 != null)
		anLocalInt |= class167.ua();
	    int anLocalInt_90_ = anLocalInt;
	    int[] anLocalInts
		= ((argument_60_ == null
		    || ((Class8) argument_60_).anIntArray79 == null)
		   ? ((Class291) this).anIntArray2329
		   : ((Class8) argument_60_).anIntArray79);
	    boolean anLocalBoolean_91_ = false;
	    synchronized (((Class26) ((Class291) this).aClass26_2369)
			  .aJs5Store_171) {
		for (int anLocalInt_92_ = 0;
		     anLocalInts.length > anLocalInt_92_; anLocalInt_92_++) {
		    if (anLocalInts[anLocalInt_92_] != -1
			&& !(((Class26) ((Class291) this).aClass26_2369)
				 .aJs5Store_171.isLoaded(anLocalInts[anLocalInt_92_], 0)))
			anLocalBoolean_91_ = true;
		}
	    }
	    if (anLocalBoolean_91_)
		return null;
	    Class101[] class101s = new Class101[anLocalInts.length];
	    for (int anLocalInt_93_ = 0; anLocalInts.length > anLocalInt_93_;
		 anLocalInt_93_++) {
		if (anLocalInts[anLocalInt_93_] != -1) {
		    synchronized (((Class26) ((Class291) this).aClass26_2369)
				  .aJs5Store_171) {
			class101s[anLocalInt_93_]
			    = (tia_sub_35_Sub1DoublyLinked.method1219(2085750768, (((Class26) ((Class291) this).aClass26_2369).aJs5Store_171), anLocalInts[anLocalInt_93_], 0));
		    }
		    if (class101s[anLocalInt_93_] != null) {
			if (((Class101) class101s[anLocalInt_93_]).anInt820
			    < 13)
			    class101s[anLocalInt_93_].method1733(17496, 2);
			if (anIntArrayArray2359 != null
			    && anIntArrayArray2359[anLocalInt_93_] != null)
			    class101s[anLocalInt_93_].method1752
				(anIntArrayArray2359[anLocalInt_93_][2],
				 anIntArrayArray2359[anLocalInt_93_][0],
				 anIntArrayArray2359[anLocalInt_93_][1], -19);
		    }
		}
	    }
	    if (class354 != null
		&& ((Class354) class354).anIntArrayArray2958 != null) {
		for (int anLocalInt_94_ = 0;
		     (((Class354) class354).anIntArrayArray2958.length
		      > anLocalInt_94_);
		     anLocalInt_94_++) {
		    if (anLocalInt_94_ < class101s.length
			&& class101s[anLocalInt_94_] != null) {
			int anLocalInt_95_ = 0;
			int anLocalInt_96_ = 0;
			int anLocalInt_97_ = 0;
			int anLocalInt_98_ = 0;
			int anLocalInt_99_ = 0;
			int anLocalInt_100_ = 0;
			if ((((Class354) class354).anIntArrayArray2958
			     [anLocalInt_94_])
			    != null) {
			    anLocalInt_95_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][0]);
			    anLocalInt_99_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][4]) << 3;
			    anLocalInt_97_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][2]);
			    anLocalInt_98_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][3]) << 3;
			    anLocalInt_96_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][1]);
			    anLocalInt_100_
				= (((Class354) class354).anIntArrayArray2958
				   [anLocalInt_94_][5]) << 3;
			}
			if (anLocalInt_98_ != 0 || anLocalInt_99_ != 0
			    || anLocalInt_100_ != 0)
			    class101s[anLocalInt_94_].method1738
				(anLocalInt_99_, 1046089902, anLocalInt_98_,
				 anLocalInt_100_);
			if (anLocalInt_95_ != 0 || anLocalInt_96_ != 0
			    || anLocalInt_97_ != 0)
			    class101s[anLocalInt_94_].method1752
				(anLocalInt_97_, anLocalInt_95_,
				 anLocalInt_96_, -78);
		    }
		}
	    }
	    Class101 class101;
	    if (class101s.length == 1)
		class101 = class101s[0];
	    else
		class101 = new Class101(class101s, class101s.length);
	    if (aShortArray2327 != null)
		anLocalInt_90_ |= 0x4000;
	    if (aShortArray2377 != null)
		anLocalInt_90_ |= 0x8000;
	    if (aByte2319 != 0)
		anLocalInt_90_ |= 0x80000;
	    class167
		= argument_52_.method2057(class101, anLocalInt_90_,
					  (((Class26)
					    ((Class291) this).aClass26_2369)
					   .anInt182),
					  anInt2336 + 64, anInt2353 + 850);
	    if (aShortArray2327 != null) {
		short[] anLocalInts_101_;
		if (argument_60_ == null
		    || ((Class8) argument_60_).aShortArray76 == null)
		    anLocalInts_101_ = ((Class291) this).aShortArray2364;
		else
		    anLocalInts_101_ = ((Class8) argument_60_).aShortArray76;
		for (int anLocalInt_102_ = 0;
		     anLocalInt_102_ < aShortArray2327.length;
		     anLocalInt_102_++) {
		    if (aByteArray2343 != null
			&& anLocalInt_102_ < aByteArray2343.length)
			class167.ia(aShortArray2327[anLocalInt_102_],
				    (Class62_Sub27.aShortArray4449
				     [(aByteArray2343[anLocalInt_102_]
				       & 0xff)]));
		    else
			class167.ia(aShortArray2327[anLocalInt_102_],
				    anLocalInts_101_[anLocalInt_102_]);
		}
	    }
	    if (aShortArray2377 != null) {
		short[] anLocalInts_103_;
		if (argument_60_ != null
		    && ((Class8) argument_60_).aShortArray80 != null)
		    anLocalInts_103_ = ((Class8) argument_60_).aShortArray80;
		else
		    anLocalInts_103_ = ((Class291) this).aShortArray2334;
		for (int anLocalInt_104_ = 0;
		     aShortArray2377.length > anLocalInt_104_;
		     anLocalInt_104_++)
		    class167.aa(aShortArray2377[anLocalInt_104_],
				anLocalInts_103_[anLocalInt_104_]);
	    }
	    if (aByte2319 != 0)
		class167.method2649(aByte2373, aByte2316, aByte2312,
				    aByte2319 & 0xff);
	    class167.s(anLocalInt);
	    synchronized (((Class26) ((Class291) this).aClass26_2369)
			  .aClass149_179) {
		((Class26) ((Class291) this).aClass26_2369).aClass149_179
		    .put(class167, l);
	    }
	}
	Class167 class167_105_
	    = class167.method2651((byte) 4, anLocalInt, true);
	boolean anLocalBoolean_106_ = false;
	if (argument_56_ != null) {
	    for (int anLocalInt_107_ = 0; anLocalInt_107_ < 12;
		 anLocalInt_107_++) {
		if (argument_56_[anLocalInt_107_] != -1)
		    anLocalBoolean_106_ = true;
	    }
	}
	if (!anLocalBoolean && !anLocalBoolean_106_)
	    return class167_105_;
	Class350[] class350s = null;
	if (class354 != null)
	    class350s = class354.method3920(117, argument_52_);
	if (anLocalBoolean_106_ && class350s != null) {
	    for (int anLocalInt_108_ = 0; anLocalInt_108_ < 12;
		 anLocalInt_108_++) {
		if (class350s[anLocalInt_108_] != null)
		    class167_105_.method2643(class350s[anLocalInt_108_],
					     1 << anLocalInt_108_, true);
	    }
	}
	int anLocalInt_109_ = 0;
	int anLocalInt_110_ = 1;
	for (/**/; anLocalInt_71_ > anLocalInt_109_; anLocalInt_109_++) {
	    if (Class214_Sub1.aClass59_Sub51_Sub6Array5655[anLocalInt_109_]
		!= null)
		class167_105_.method2644
		    (0,
		     ((Class367) (Canvas_Sub1.aClass367Array32
				  [anLocalInt_109_])).aBoolean3112,
		     Cs2CallStackEntry.anIntArray511[anLocalInt_109_] - 1,
		     anLocalInt_110_, null,
		     JagexHashMap.anIntArray488[anLocalInt_109_], true,
		     (Node_Sub45.aClass59_Sub51_Sub6Array4265
		      [anLocalInt_109_]),
		     Class235.anIntArray1718[anLocalInt_109_],
		     Class264.anIntArray2048[anLocalInt_109_],
		     (Class214_Sub1.aClass59_Sub51_Sub6Array5655
		      [anLocalInt_109_]));
	    anLocalInt_110_ <<= 1;
	}
	if (anLocalBoolean_106_) {
	    for (int anLocalInt_111_ = 0; anLocalInt_111_ < 12;
		 anLocalInt_111_++) {
		if (argument_56_[anLocalInt_111_] != -1) {
		    int anLocalInt_112_
			= -argument_62_ + argument_56_[anLocalInt_111_];
		    anLocalInt_112_ &= 0x3fff;
		    Class350 class350 = argument_52_.method2029();
		    class350.method3824(anLocalInt_112_);
		    class167_105_.method2643(class350, 1 << anLocalInt_111_,
					     false);
		}
	    }
	}
	if (anLocalBoolean_106_ && class350s != null) {
	    for (int anLocalInt_113_ = 0; anLocalInt_113_ < 12;
		 anLocalInt_113_++) {
		if (class350s[anLocalInt_113_] != null)
		    class167_105_.method2643(class350s[anLocalInt_113_],
					     1 << anLocalInt_113_, false);
	    }
	}
	if (class59_sub51_sub6 != null && class59_sub51_sub6_84_ != null)
	    class167_105_.method2658
		(class59_sub51_sub6, class59_sub51_sub6_85_,
		 ((Class367) argument_49_).aBooleanArray3113, (byte) -108,
		 anLocalInt_77_, anLocalInt_79_, class59_sub51_sub6_84_,
		 anLocalInt_81_, anLocalInt_82_, class59_sub51_sub6_80_,
		 anLocalInt_78_,
		 (((Class367) argument_49_).aBoolean3112
		  | ((Class367) argument_63_).aBoolean3112),
		 argument_66_ - 1, argument_59_ - 1, anLocalInt_83_);
	else if (class59_sub51_sub6 != null)
	    class167_105_.method2657(0, anLocalInt_77_, argument_66_ - 1,
				     ((Class367) argument_49_).aBoolean3112,
				     class59_sub51_sub6, anLocalInt_78_,
				     anLocalInt_79_, (byte) -122,
				     class59_sub51_sub6_80_);
	else if (class59_sub51_sub6_84_ != null)
	    class167_105_.method2657(0, anLocalInt_81_, argument_59_ - 1,
				     ((Class367) argument_63_).aBoolean3112,
				     class59_sub51_sub6_84_, anLocalInt_82_,
				     anLocalInt_83_, (byte) -120,
				     class59_sub51_sub6_85_);
	for (int anLocalInt_114_ = 0; anLocalInt_114_ < anLocalInt_71_;
	     anLocalInt_114_++) {
	    Class214_Sub1.aClass59_Sub51_Sub6Array5655[anLocalInt_114_] = null;
	    Node_Sub45.aClass59_Sub51_Sub6Array4265[anLocalInt_114_] = null;
	    Canvas_Sub1.aClass367Array32[anLocalInt_114_] = null;
	}
	if (anInt2370 != 128 || anInt2351 != 128)
	    class167_105_.O(anInt2370, anInt2351, anInt2370);
	class167_105_.s(argument_64_);
	return class167_105_;
    }
    
    static final void method3494(boolean argument) {
	for (int anLocalInt = 0; Class105.anInt861 > anLocalInt;
	     anLocalInt++) {
	    Class169 class169 = Class131.aClass169Array1059[anLocalInt];
	    boolean anLocalBoolean = false;
	    if (((Class169) class169).aClass59_Sub9_Sub4_1240 != null) {
		if (!((Class169) class169).aClass59_Sub9_Sub4_1240
			 .isLinked())
		    anLocalBoolean = true;
	    } else {
		((Class169) class169).anInt1236--;
		if (((Class169) class169).anInt1236
		    < (!class169.method2732((byte) 89) ? -10 : -1500))
		    anLocalBoolean = true;
		else {
		    if (((Class169) class169).aByte1241 != 1
			|| ((Class169) class169).aClass198_1246 != null) {
			if (class169.method2732((byte) 101)
			    && ((((Class169) class169).aClass59_Sub25_1234
				 == null)
				|| (((Class169) class169)
				    .aClass59_Sub40_Sub1_1243) == null)) {
			    if (((Class169) class169).aClass59_Sub25_1234
				== null)
				((Class169) class169).aClass59_Sub25_1234
				    = Node_Sub25.method755((ClanSettingsDelta
                        .aJs5Store_1546),
                        (((Class169)
                                class169)
                                .anInt1242));
			    if (((Class169) class169).aClass59_Sub25_1234
				== null)
				continue;
			    if (((Class169) class169).aClass59_Sub40_Sub1_1243
				== null) {
				((Class169) class169).aClass59_Sub40_Sub1_1243
				    = ((Class169) class169)
					  .aClass59_Sub25_1234
					  .method758(new int[] { 22050 });
				if ((((Class169) class169)
				     .aClass59_Sub40_Sub1_1243)
				    == null)
				    continue;
			    }
			}
		    } else {
			((Class169) class169).aClass198_1246
			    = Class198.method2906(Class314.aJs5Store_2603,
						  (((Class169) class169)
						   .anInt1242),
						  0);
			if (((Class169) class169).aClass198_1246 == null)
			    continue;
			((Class169) class169).anInt1236
			    += ((Class169) class169).aClass198_1246
				   .method2907();
		    }
		    if (((Class169) class169).anInt1236 < 0) {
			int anLocalInt_115_ = 8192;
			int anLocalInt_116_;
			if (((Class169) class169).anInt1237 == 0)
			    anLocalInt_116_
				= (((Class169) class169).anInt1238
				   * (((Class169) class169).aByte1241 == 3
				      ? ((Node_Sub50)
					 AthmosphericConditions.aClass59_Sub50_116)
					    .aClass62_Sub22_4333.method1446(27)
				      : ((Node_Sub50)
					 AthmosphericConditions.aClass59_Sub50_116)
					    .aClass62_Sub22_4298
					    .method1446(124))) >> 2;
			else {
			    int anLocalInt_117_
				= ((((Class169) class169).anInt1237
				    & 0x3e013b9)
				   >> 24);
			    if ((((DoublyLinkedNodeP2_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .lightingHL)
				!= anLocalInt_117_)
				anLocalInt_116_ = 0;
			    else {
				int anLocalInt_118_
				    = ((((Class169) class169).anInt1237 & 0xff)
				       << 9);
				int anLocalInt_119_
				    = (Class308
					   .aClass104_Sub2_Sub2_Sub5_Sub2_2587
					   .method1830(-126)
				       << 8);
				int anLocalInt_120_
				    = ((((Class169) class169).anInt1237
					& 0xffd323)
				       >> 16);
				int anLocalInt_121_
				    = (-(((DoublyLinkedNodeP2_Sub2)
					  (Class308
					   .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					 .worldX)
				       + (anLocalInt_120_ << 9)
				       + (256 + anLocalInt_119_));
				int anLocalInt_122_
				    = ((((Class169) class169).anInt1237
					& 0xffdd)
				       >> 8);
				int anLocalInt_123_
				    = ((anLocalInt_122_ << 9) + 256
				       + (-(((DoublyLinkedNodeP2_Sub2)
					     (Class308
					      .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					    .worldZ)
					  + anLocalInt_119_));
				int anLocalInt_124_
				    = (Math.abs(anLocalInt_121_)
				       + (Math.abs(anLocalInt_123_) - 512));
				if (anLocalInt_118_ < anLocalInt_124_) {
				    ((Class169) class169).anInt1236 = -99999;
				    continue;
				}
				if (anLocalInt_124_ < 0)
				    anLocalInt_124_ = 0;
				anLocalInt_116_
				    = ((anLocalInt_118_ - anLocalInt_124_)
				       * ((Node_Sub50)
					  AthmosphericConditions.aClass59_Sub50_116)
					     .aClass62_Sub22_4303
					     .method1446(61)
				       * ((Class169) class169).anInt1238
				       / anLocalInt_118_) >> 2;
				if ((((Class169) class169).aClass104_Sub2_1245
				     != null)
				    && ((((Class169) class169)
					 .aClass104_Sub2_1245)
					instanceof DoublyLinkedNodeP2_Sub2_Sub2)) {
				    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
					= ((DoublyLinkedNodeP2_Sub2_Sub2)
					   (((Class169) class169)
					    .aClass104_Sub2_1245));
				    short anLocalInt_125_
					= (((DoublyLinkedNodeP2_Sub2_Sub2)
					    class104_sub2_sub2)
					   .bottom);
				    short anLocalInt_126_
					= (((DoublyLinkedNodeP2_Sub2_Sub2)
					    class104_sub2_sub2)
					   .left);
				}
				if (anLocalInt_121_ != 0
				    || anLocalInt_123_ != 0) {
				    int anLocalInt_127_
					= (-Node_Sub47_Sub3.anInt6167
					   - ((int) ((Math.atan2
						      ((double) anLocalInt_121_,
						       (double) anLocalInt_123_))
						     * 2607.5945876176133)
					      + 4096)) & 0x3fff;
				    if (anLocalInt_127_ > 8192)
					anLocalInt_127_
					    = 16384 - anLocalInt_127_;
				    int anLocalInt_128_;
				    if (anLocalInt_124_ > 0) {
					if (anLocalInt_124_ >= 4096)
					    anLocalInt_128_ = 16384;
					else
					    anLocalInt_128_
						= 8192 + (-anLocalInt_124_
							  + 8192) / 4096;
				    } else
					anLocalInt_128_ = 8192;
				    anLocalInt_115_
					= ((anLocalInt_127_ * anLocalInt_128_
					    / 8192)
					   + (16384 - anLocalInt_128_ >> 1));
				}
			    }
			}
			if (anLocalInt_116_ > 0) {
			    Node_Sub40_Sub1 class59_sub40_sub1 = null;
			    if (((Class169) class169).aByte1241 != 1) {
				if (class169.method2732((byte) 123))
				    class59_sub40_sub1
					= (((Class169) class169)
					   .aClass59_Sub40_Sub1_1243);
			    } else
				class59_sub40_sub1
				    = ((Class169) class169).aClass198_1246
					  .method2909
					  ().method1074(Class23.aClass213_155);
			    Node_Sub9_Sub4 class59_sub9_sub4
				= (((Class169) class169)
				       .aClass59_Sub9_Sub4_1240
				   = (Node_Sub9_Sub4.method631
                        (class59_sub40_sub1,
                                ((Class169) class169).anInt1239,
                                anLocalInt_116_, anLocalInt_115_)));
			    class59_sub9_sub4.method664((((Class169) class169)
							 .anInt1244) - 1);
			    Class353_Sub2.aClass59_Sub9_Sub3_5483
				.method629(class59_sub9_sub4);
			}
		    }
		}
	    }
	    if (anLocalBoolean) {
		Class105.anInt861--;
		for (int anLocalInt_129_ = anLocalInt;
		     Class105.anInt861 > anLocalInt_129_; anLocalInt_129_++)
		    Class131.aClass169Array1059[anLocalInt_129_]
			= Class131.aClass169Array1059[anLocalInt_129_ + 1];
		anLocalInt--;
	    }
	}
	if (Class154.aBoolean3618 && !Class62_Sub21.method1444(-83)) {
	    if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		    .aClass62_Sub22_4319.method1446(78) != 0
		&& Statics.anInt3514 != -1) {
		if (Statics.aClass59_Sub9_Sub2_6647 == null)
		    Statics.method545(false, Statics.anInt3514, ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116).aClass62_Sub22_4319.method1446(54), 0, Class341.aJs5Store_2881, (byte) -65);
		else
		    Class268.method3358(0, Class341.aJs5Store_2881,
					(Statics
					 .aClass59_Sub9_Sub2_6647),
					Statics.anInt3514, true,
					((Node_Sub50)
					 AthmosphericConditions.aClass59_Sub50_116)
					    .aClass62_Sub22_4319
					    .method1446(46),
					false);
	    }
	    Class154.aBoolean3618 = false;
	    Statics.aClass59_Sub9_Sub2_6647 = null;
	} else if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		       .aClass62_Sub22_4319.method1446(23) != 0
		   && Statics.anInt3514 != -1
		   && !Class62_Sub21.method1444(-118)) {
	    Node_Sub29 class59_sub29
		= Class91.method1683((byte) 32,
				     Node_Sub31_Sub16.aClass372_5910,
				     Node_Sub31_Sub7.aClass207_5867);
	    ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
		.p4(Statics.anInt3514);
	    Class251.method3243(class59_sub29, true);
	    Statics.anInt3514 = -1;
	}
    }
    
    final boolean method3495(boolean argument_130_) {
	if (((Class291) this).anIntArray2374 == null) {
	    if (((Class291) this).anInt2352 == -1
		&& ((Class291) this).anInt2315 == -1
		&& ((Class291) this).anInt2338 == -1)
		return false;
	    return true;
	}
	for (int anLocalInt = 0;
	     ((Class291) this).anIntArray2374.length > anLocalInt;
	     anLocalInt++) {
	    if (((Class291) this).anIntArray2374[anLocalInt] != -1) {
		Class291 class291
		    = (((Class291) this).aClass26_2369.method343
		       ((byte) 106,
			((Class291) this).anIntArray2374[anLocalInt]));
		if (((Class291) class291).anInt2352 != -1
		    || ((Class291) class291).anInt2315 != -1
		    || ((Class291) class291).anInt2338 != -1)
		    return true;
	    }
	}
	return false;
    }
    
    public Class291() {
	((Class291) this).anInt2315 = -1;
	anInt2323 = -1;
	((Class291) this).aBoolean2321 = false;
	((Class291) this).anInt2325 = -1;
	((Class291) this).aByte2326 = (byte) -16;
	((Class291) this).anInt2318 = -1;
	((Class291) this).anInt2335 = 256;
	anInt2353 = 0;
	((Class291) this).anInt2346 = 0;
	((Class291) this).anInt2345 = 32;
	((Class291) this).anInt2337 = -1;
	((Class291) this).aShort2314 = (short) 0;
	((Class291) this).anInt2313 = -1;
	anInt2355 = -1;
	((Class291) this).anInt2344 = 1;
	((Class291) this).anInt2348 = -1;
	anInt2336 = 0;
	((Class291) this).anInt2356 = 256;
	((Class291) this).aString2333 = "null";
	((Class291) this).anInt2331 = 255;
	((Class291) this).aByte2350 = (byte) -96;
	((Class291) this).anInt2330 = -1;
	aByte2319 = (byte) 0;
	((Class291) this).aShort2328 = (short) 0;
	((Class291) this).anInt2358 = 0;
	((Class291) this).aBoolean2362 = true;
	((Class291) this).aBoolean2342 = true;
	((Class291) this).anInt2357 = -1;
	((Class291) this).anInt2320 = 0;
	((Class291) this).aBoolean2311 = false;
	((Class291) this).anInt2368 = -1;
	((Class291) this).anInt2360 = -1;
	((Class291) this).anInt2341 = -1;
	((Class291) this).aByte2367 = (byte) 0;
	((Class291) this).anInt2338 = -1;
	((Class291) this).anInt2340 = -1;
	anInt2351 = 128;
	((Class291) this).anInt2352 = -1;
	((Class291) this).anInt2361 = -1;
	((Class291) this).aByte2372 = (byte) 4;
	((Class291) this).aStringArray2354 = new String[5];
	((Class291) this).anInt2339 = -1;
	anInt2370 = 128;
	((Class291) this).aBoolean2376 = true;
	((Class291) this).anInt2332 = -1;
	((Class291) this).aBoolean2371 = true;
	((Class291) this).anInt2378 = -1;
    }
}
