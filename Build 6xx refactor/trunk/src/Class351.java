/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class351
{
    int anInt2931 = -1;
    private String[] aStringArray2932;
    private int[][] anIntArrayArray2933;
    private int[] anIntArray2934;
    private String aString2935;
    private String aString2936;
    private int[] anIntArray2937;
    private int[][] anIntArrayArray2938;
    private int[] anIntArray2939;
    private String[] aStringArray2940;
    private int[] anIntArray2941;
    private int[] anIntArray2942;
    private int[] anIntArray2943;
    private int[][] anIntArrayArray2944;
    private int[] anIntArray2945;
    private JagexHashMap aJagexHashMap_2946;
    private int[] anIntArray2947;
    
    static final void method3875(int argument, byte argument_0_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(16, 13175, (long) argument);
	if (argument_0_ != 81)
	    method3875(-56, (byte) 105);
	class59_sub51_sub3.method1181(argument_0_ + 585133991);
    }
    
    private final void method3876(int argument_1_, byte argument_2_,
				  Packet argument_3_) {
	if (argument_1_ == 1)
	    aString2936 = argument_3_.gjstr2();
	else if (argument_1_ == 2)
	    aString2935 = argument_3_.gjstr2();
	else if (argument_1_ != 3) {
	    if (argument_1_ != 4) {
		if (argument_1_ != 5) {
		    if (argument_1_ == 6)
			argument_3_.g1();
		    else if (argument_1_ != 7) {
			if (argument_1_ != 8) {
			    if (argument_1_ != 9) {
				if (argument_1_ == 10) {
				    int anLocalInt
					= argument_3_.g1();
				    anIntArray2934 = new int[anLocalInt];
				    for (int anLocalInt_4_ = 0;
					 anLocalInt_4_ < anLocalInt;
					 anLocalInt_4_++)
					anIntArray2934[anLocalInt_4_]
					    = (argument_3_.g4
                            ());
				} else if (argument_1_ != 12) {
				    if (argument_1_ != 13) {
					if (argument_1_ != 14) {
					    if (argument_1_ == 15)
						argument_3_.g2();
					    else if (argument_1_ == 17)
						((Class351) this).anInt2931
						    = argument_3_
							  .g2();
					    else if (argument_1_ != 18) {
						if (argument_1_ != 19) {
						    if (argument_1_ == 249) {
							int anLocalInt
							    = (argument_3_
								   .g1
                                           ());
							if (aJagexHashMap_2946
							    == null) {
							    int anLocalInt_5_
								= (MathStatics
								       .method2589(anLocalInt));
							    aJagexHashMap_2946
								= (new JagexHashMap
								   (anLocalInt_5_));
							}
							for (int anLocalInt_6_
								 = 0;
							     (anLocalInt_6_
							      < anLocalInt);
							     anLocalInt_6_++) {
							    boolean anLocalBoolean
								= ((argument_3_
									.g1
                                            ())
								   == 1);
							    int anLocalInt_7_
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
							    aJagexHashMap_2946
								.put((long) anLocalInt_7_, node);
							}
						    }
						} else {
						    int anLocalInt
							= (argument_3_
							       .g1
                                           ());
						    anIntArray2941
							= new int[anLocalInt];
						    aStringArray2940
							= (new String
							   [anLocalInt]);
						    anIntArray2939
							= new int[anLocalInt];
						    anIntArray2937
							= new int[anLocalInt];
						    for (int anLocalInt_8_ = 0;
							 (anLocalInt_8_
							  < anLocalInt);
							 anLocalInt_8_++) {
							anIntArray2941
							    [anLocalInt_8_]
							    = (argument_3_
								   .g4
                                           ());
							anIntArray2939
							    [anLocalInt_8_]
							    = (argument_3_
								   .g4
                                           ());
							anIntArray2937
							    [anLocalInt_8_]
							    = (argument_3_
								   .g4
                                           ());
							aStringArray2940
							    [anLocalInt_8_]
							    = (argument_3_
								   .gstr
                                           ());
						    }
						}
					    } else {
						int anLocalInt
						    = (argument_3_.g1
                                ());
						anIntArray2943
						    = new int[anLocalInt];
						anIntArray2942
						    = new int[anLocalInt];
						aStringArray2932
						    = new String[anLocalInt];
						anIntArray2947
						    = new int[anLocalInt];
						for (int anLocalInt_9_ = 0;
						     (anLocalInt
						      > anLocalInt_9_);
						     anLocalInt_9_++) {
						    anIntArray2942
							[anLocalInt_9_]
							= argument_3_
							      .g4();
						    anIntArray2943
							[anLocalInt_9_]
							= (argument_3_
							       .g4
                                           ());
						    anIntArray2947
							[anLocalInt_9_]
							= argument_3_
							      .g4();
						    aStringArray2932
							[anLocalInt_9_]
							= (argument_3_
							       .gstr
                                           ());
						}
					    }
					} else {
					    int anLocalInt
						= argument_3_
						      .g1();
					    anIntArrayArray2944
						= new int[anLocalInt][2];
					    for (int anLocalInt_10_ = 0;
						 anLocalInt_10_ < anLocalInt;
						 anLocalInt_10_++) {
						anIntArrayArray2944
						    [anLocalInt_10_][0]
						    = (argument_3_.g1
                                ());
						anIntArrayArray2944
						    [anLocalInt_10_][1]
						    = (argument_3_.g1
                                ());
					    }
					}
				    } else {
					int anLocalInt
					    = argument_3_
						  .g1();
					anIntArray2945 = new int[anLocalInt];
					for (int anLocalInt_11_ = 0;
					     anLocalInt > anLocalInt_11_;
					     anLocalInt_11_++)
					    anIntArray2945[anLocalInt_11_]
						= argument_3_.g2();
				    }
				} else
				    argument_3_.g4();
			    } else
				argument_3_.g1();
			}
		    } else
			argument_3_.g1();
		} else
		    argument_3_.g2();
	    } else {
		int anLocalInt = argument_3_.g1();
		anIntArrayArray2933 = new int[anLocalInt][3];
		for (int anLocalInt_12_ = 0; anLocalInt > anLocalInt_12_;
		     anLocalInt_12_++) {
		    anIntArrayArray2933[anLocalInt_12_][0]
			= argument_3_.g2();
		    anIntArrayArray2933[anLocalInt_12_][1]
			= argument_3_.g4();
		    anIntArrayArray2933[anLocalInt_12_][2]
			= argument_3_.g4();
		}
	    }
	} else {
	    int anLocalInt = argument_3_.g1();
	    anIntArrayArray2938 = new int[anLocalInt][3];
	    for (int anLocalInt_13_ = 0; anLocalInt > anLocalInt_13_;
		 anLocalInt_13_++) {
		anIntArrayArray2938[anLocalInt_13_][0]
		    = argument_3_.g2();
		anIntArrayArray2938[anLocalInt_13_][1]
		    = argument_3_.g4();
		anIntArrayArray2938[anLocalInt_13_][2]
		    = argument_3_.g4();
	    }
	}
	if (argument_2_ != -14)
	    anIntArray2947 = null;
    }
    
    final void method3877(Packet argument_14_, boolean argument_15_) {
	for (;;) {
	    int anLocalInt = argument_14_.g1();
	    if (anLocalInt == 0)
		break;
	    method3876(anLocalInt, (byte) -14, argument_14_);
	}
    }
    
    public Class351() {
	/* empty */
    }
    
    final void method3878(int argument_16_) {
	if (aString2935 == null)
	    aString2935 = aString2936;
    }
}
