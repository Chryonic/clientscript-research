/* Class59_Sub31_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Node_Sub31_Sub39 extends Node_Sub31
{
    private int anInt6045;
    private int anInt6046;
    private int anInt6047 = 409;
    private int anInt6048;
    private int anInt6049 = 1024;
    private int anInt6050;
    static int anInt6051;
    private int anInt6052;
    private int anInt6053;
    private int anInt6054;
    static boolean aBoolean6055 = false;
    private int anInt6056;
    
    final void method868(Packet argument_0_, int argument_1_,
			 byte argument_2_) {
	int anLocalInt = argument_1_;
    while_212_:
	do {
	while_211_:
	    do {
	    while_210_:
		do {
		while_209_:
		    do {
		    while_208_:
			do {
			while_207_:
			    do {
			    while_206_:
				do {
				    do {
					if (anLocalInt != 0) {
					    if (anLocalInt != 1) {
						if (anLocalInt != 2) {
						    if (anLocalInt != 3) {
							if (anLocalInt != 4) {
							    if (anLocalInt
								!= 5) {
								if (anLocalInt
								    != 6) {
								    if (anLocalInt
									!= 7) {
									if (anLocalInt
									    == 8)
									    break while_211_;
									break while_212_;
								    }
								} else
								    break while_209_;
								break while_210_;
							    }
							} else
							    break while_207_;
							break while_208_;
						    }
						} else
						    break;
						break while_206_;
					    }
					} else {
					    anInt6048
						= argument_0_
						      .g1();
					    break while_212_;
					}
					anInt6052 = argument_0_.g2();
					break while_212_;
				    } while (false);
				    anInt6046 = argument_0_.g2();
				    break while_212_;
				} while (false);
				anInt6047 = argument_0_.g2();
				break while_212_;
			    } while (false);
			    anInt6053 = argument_0_.g2();
			    break while_212_;
			} while (false);
			anInt6045 = argument_0_.g2();
			break while_212_;
		    } while (false);
		    anInt6050 = argument_0_.g1();
		    break while_212_;
		} while (false);
		anInt6049 = argument_0_.g2();
		break while_212_;
	    } while (false);
	    anInt6056 = argument_0_.g2();
	} while (false);
	if (argument_2_ > -41)
	    anInt6046 = -46;
    }
    
    private final void method1001(int argument_3_, int argument_4_,
				  int[][] argument_5_, Random argument_6_,
				  int argument_7_, int argument_8_,
				  int argument_9_) {
	int anLocalInt
	    = (anInt6056 <= 0 ? 4096
	       : -Class207.method2945(argument_6_, -121, anInt6056) + 4096);
	int anLocalInt_10_ = anInt6054 * anInt6049 >> 12;
	int anLocalInt_11_
	    = (anInt6054
	       - (anLocalInt_10_ > 0
		  ? Class207.method2945(argument_6_, 120, anLocalInt_10_)
		  : 0));
	if (Statics.anInt294 <= argument_9_)
	    argument_9_ -= Statics.anInt294;
	if (argument_3_ != 2)
	    method1005(-101, 20, null, -19, -12, -91);
	if (anLocalInt_11_ <= 0) {
	    if (Statics.anInt294 >= argument_7_ + argument_9_) {
		for (int anLocalInt_12_ = 0; argument_8_ > anLocalInt_12_;
		     anLocalInt_12_++)
		    JagStrings.memset((argument_5_[argument_4_ + anLocalInt_12_]), argument_9_, argument_7_, anLocalInt);
	    } else {
		int anLocalInt_13_ = -argument_9_ + Statics.anInt294;
		for (int anLocalInt_14_ = 0; argument_8_ > anLocalInt_14_;
		     anLocalInt_14_++) {
		    int[] anLocalInts
			= argument_5_[argument_4_ + anLocalInt_14_];
		    JagStrings.memset(anLocalInts, argument_9_, anLocalInt_13_, anLocalInt);
		    JagStrings.memset(anLocalInts, 0, argument_7_ - anLocalInt_13_, anLocalInt);
		}
	    }
	} else if (argument_8_ > 0 && argument_7_ > 0) {
	    int anLocalInt_15_ = argument_7_ / 2;
	    int anLocalInt_16_ = argument_8_ / 2;
	    int anLocalInt_17_ = (anLocalInt_11_ > anLocalInt_15_
				  ? anLocalInt_15_ : anLocalInt_11_);
	    int anLocalInt_18_ = (anLocalInt_11_ <= anLocalInt_16_
				  ? anLocalInt_11_ : anLocalInt_16_);
	    int anLocalInt_19_ = argument_9_ + anLocalInt_17_;
	    int anLocalInt_20_ = argument_7_ - anLocalInt_17_ * 2;
	    for (int anLocalInt_21_ = 0; argument_8_ > anLocalInt_21_;
		 anLocalInt_21_++) {
		int[] anLocalInts = argument_5_[anLocalInt_21_ + argument_4_];
		if (anLocalInt_21_ < anLocalInt_18_) {
		    int anLocalInt_22_
			= anLocalInt * anLocalInt_21_ / anLocalInt_18_;
		    if (anInt6050 != 0) {
			for (int anLocalInt_23_ = 0;
			     anLocalInt_17_ > anLocalInt_23_;
			     anLocalInt_23_++) {
			    int anLocalInt_24_
				= anLocalInt_23_ * anLocalInt / anLocalInt_17_;
			    anLocalInts[MathStatics.AND((anLocalInt_23_ + argument_9_), (Statics.anInt1269))]
				= anLocalInts[(MathStatics.AND(argument_7_ + (argument_9_ - anLocalInt_23_ - 1), Statics.anInt1269))]
				= (anLocalInt_22_ > anLocalInt_24_
				   ? anLocalInt_24_ : anLocalInt_22_);
			}
		    } else {
			for (int anLocalInt_25_ = 0;
			     anLocalInt_25_ < anLocalInt_17_;
			     anLocalInt_25_++) {
			    int anLocalInt_26_
				= anLocalInt * anLocalInt_25_ / anLocalInt_17_;
			    anLocalInts
				[MathStatics.AND(Statics.anInt1269, (argument_9_ + anLocalInt_25_))]
				= anLocalInts[(MathStatics.AND((argument_7_ + (argument_9_ - anLocalInt_25_) - 1), Statics.anInt1269))]
				= anLocalInt_22_ * anLocalInt_26_ >> 12;
			}
		    }
		    if (anLocalInt_20_ + anLocalInt_19_ <= Statics.anInt294)
			JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_20_, anLocalInt_22_);
		    else {
			int anLocalInt_27_
			    = -anLocalInt_19_ + Statics.anInt294;
			JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_27_, anLocalInt_22_);
			JagStrings.memset(anLocalInts, 0, anLocalInt_20_ - anLocalInt_27_, anLocalInt_22_);
		    }
		} else {
		    int anLocalInt_28_ = -anLocalInt_21_ + argument_8_ - 1;
		    if (anLocalInt_28_ < anLocalInt_18_) {
			int anLocalInt_29_
			    = anLocalInt * anLocalInt_28_ / anLocalInt_18_;
			if (anInt6050 == 0) {
			    for (int anLocalInt_30_ = 0;
				 anLocalInt_30_ < anLocalInt_17_;
				 anLocalInt_30_++) {
				int anLocalInt_31_
				    = (anLocalInt_30_ * anLocalInt
				       / anLocalInt_17_);
				anLocalInts
				    [MathStatics.AND((anLocalInt_30_ + argument_9_), Statics.anInt1269)]
				    = anLocalInts[(MathStatics.AND((argument_9_ + argument_7_ - anLocalInt_30_ - 1), Statics.anInt1269))]
				    = anLocalInt_31_ * anLocalInt_29_ >> 12;
			    }
			} else {
			    for (int anLocalInt_32_ = 0;
				 anLocalInt_17_ > anLocalInt_32_;
				 anLocalInt_32_++) {
				int anLocalInt_33_
				    = (anLocalInt * anLocalInt_32_
				       / anLocalInt_17_);
				anLocalInts
				    [MathStatics.AND(Statics.anInt1269, (anLocalInt_32_ + argument_9_))]
				    = anLocalInts[(MathStatics.AND((argument_7_ + (argument_9_ + (-anLocalInt_32_ - 1))), Statics.anInt1269))]
				    = (anLocalInt_29_ <= anLocalInt_33_
				       ? anLocalInt_29_ : anLocalInt_33_);
			    }
			}
			if (Statics.anInt294
			    >= anLocalInt_20_ + anLocalInt_19_)
			    JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_20_, anLocalInt_29_);
			else {
			    int anLocalInt_34_
				= -anLocalInt_19_ + Statics.anInt294;
			    JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_34_, anLocalInt_29_);
			    JagStrings.memset(anLocalInts, 0, (-anLocalInt_34_ + anLocalInt_20_), anLocalInt_29_);
			}
		    } else {
			for (int anLocalInt_35_ = 0;
			     anLocalInt_17_ > anLocalInt_35_; anLocalInt_35_++)
			    anLocalInts[MathStatics.AND((Statics.anInt1269), (anLocalInt_35_ + argument_9_))]
				= anLocalInts[(MathStatics.AND((argument_9_ + argument_7_ - 1 - anLocalInt_35_), Statics.anInt1269))]
				= anLocalInt_35_ * anLocalInt / anLocalInt_17_;
			if (Statics.anInt294
			    >= anLocalInt_20_ + anLocalInt_19_)
			    JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_20_, anLocalInt);
			else {
			    int anLocalInt_36_
				= -anLocalInt_19_ + Statics.anInt294;
			    JagStrings.memset(anLocalInts, anLocalInt_19_, anLocalInt_36_, anLocalInt);
			    JagStrings.memset(anLocalInts, 0, (anLocalInt_20_ - anLocalInt_36_), anLocalInt);
			}
		    }
		}
	    }
	}
    }
    
    static final boolean method1002(int argument, byte argument_37_) {
	if (argument != 1 && argument != 3 && argument != 5)
	    return false;
	return true;
    }
    
    static final Class363 method1003(GraphicsToolkit argument, boolean argument_38_,
				     int argument_39_, byte argument_40_) {
	if (argument_39_ == -1)
	    return null;
	if (Class298.anIntArray2476 != null) {
	    for (int anLocalInt = 0;
		 Class298.anIntArray2476.length > anLocalInt; anLocalInt++) {
		if (Class298.anIntArray2476[anLocalInt] == argument_39_)
		    return Node_Sub35.aClass363Array4160[anLocalInt];
	    }
	}
	Class363 class363
	    = ((Class363)
	       Class251.aClass149_1974.get((long) argument_39_));
	if (class363 != null) {
	    if (argument_38_ && ((Class363) class363).aClass76_3066 == null) {
		Class76 class76
		    = Class359.method3944(Node_Sub33.aJs5Store_4149,
					  argument_40_ ^ ~0x1640,
					  argument_39_);
		if (class76 == null)
		    return null;
		((Class363) class363).aClass76_3066 = class76;
	    }
	    return class363;
	}
	Class83[] class83s
	    = Class83.method1605(Statics.aJs5Store_5741,
				 argument_39_);
	if (class83s == null)
	    return null;
	if (argument_40_ != 10)
	    return null;
	Class76 class76 = Class359.method3944(Node_Sub33.aJs5Store_4149,
					      -5707, argument_39_);
	if (class76 == null)
	    return null;
	if (argument_38_)
	    class363
		= new Class363(argument.method2083(class76, class83s, true),
			       class76);
	else
	    class363
		= new Class363(argument.method2083(class76, class83s, true));
	Class251.aClass149_1974.put(class363, (long) argument_39_);
	return class363;
    }
    
    static final byte method1004(int argument, byte argument_41_,
				 int argument_42_) {
	if (argument_41_ != 110)
	    aBoolean6055 = false;
	if (argument_42_ != 9)
	    return (byte) 0;
	if ((argument & 0x1) != 0)
	    return (byte) 2;
	return (byte) 1;
    }
    
    public Node_Sub31_Sub39() {
	super(0, true);
	anInt6046 = 2048;
	anInt6048 = 0;
	anInt6052 = 1024;
	anInt6050 = 0;
	anInt6045 = 1024;
	anInt6056 = 1024;
	anInt6053 = 819;
    }
    
    static final void method1005(int argument, int argument_43_,
				 GraphicsToolkit argument_44_, int argument_45_,
				 int argument_46_, int argument_47_) {
	argument_44_.setClip(argument_45_, argument_47_ + argument_43_, argument_45_ + argument_46_, argument_43_);
	argument_44_.method2020(51, argument_46_, argument_43_, argument_47_,
				argument_45_, -16777216);
	if (Class392.anInt3295 >= 100) {
	    float f = (float) Class179.anInt1342 / (float) Class179.anInt1354;
	    int anLocalInt = argument_46_;
	    int anLocalInt_48_ = argument_47_;
	    if (!(f < 1.0F))
		anLocalInt = (int) ((float) argument_47_ / f);
	    else
		anLocalInt_48_ = (int) ((float) argument_46_ * f);
	    argument_43_ += (argument_47_ - anLocalInt_48_) / 2;
	    argument_45_ += (-anLocalInt + argument_46_) / 2;
	    if (Class18.aClass368_125 == null
		|| argument_46_ != Class18.aClass368_125.method4019()
		|| argument_47_ != Class18.aClass368_125.method4022()) {
		Class179.method2819(Class179.anInt1353,
				    Class179.anInt1342 + Class179.anInt1340,
				    Class179.anInt1353 + Class179.anInt1354,
				    Class179.anInt1340, argument_45_,
				    argument_43_, anLocalInt + argument_45_,
				    anLocalInt_48_ + argument_43_);
		Class179.method2801(argument_44_);
		Class18.aClass368_125
		    = argument_44_.method2094(argument_45_, argument_43_,
					      anLocalInt, anLocalInt_48_,
					      false);
	    }
	    Class18.aClass368_125.method4014(argument_45_, argument_43_);
	    int anLocalInt_49_
		= Class42.anInt3542 * anLocalInt / Class179.anInt1354;
	    int anLocalInt_50_ = (Node_Sub47_Sub5.anInt6172 * anLocalInt_48_
				  / Class179.anInt1342);
	    int anLocalInt_51_
		= argument_45_ + (Node_Sub47_Sub8.anInt6198 * anLocalInt
				  / Class179.anInt1354);
	    int anLocalInt_52_
		= (-(Class99.anInt778 * anLocalInt_48_ / Class179.anInt1342)
		   + (anLocalInt_48_ + argument_43_ - anLocalInt_50_));
	    int anLocalInt_53_ = -1996554240;
	    if (GameEnum.STELLARDAWN == client.selectedGame)
		anLocalInt_53_ = -1996488705;
	    argument_44_.fillRect(anLocalInt_51_, anLocalInt_52_, anLocalInt_49_, anLocalInt_50_, anLocalInt_53_, 1);
	    argument_44_.drawRect(anLocalInt_51_, anLocalInt_52_, anLocalInt_49_, anLocalInt_50_, anLocalInt_53_, 0);
	    if (Class68.anInt3583 > 0) {
		int anLocalInt_54_;
		if (anInt6051 > 50)
		    anLocalInt_54_ = (100 - anInt6051) * 5;
		else
		    anLocalInt_54_ = anInt6051 * 5;
		for (Node_Sub7 class59_sub7
			 = ((Node_Sub7)
			    Class179.aCyclicLinkedList_1329.getFirst());
		     class59_sub7 != null;
		     class59_sub7 = (Node_Sub7) Class179.aCyclicLinkedList_1329
						       .getNext()) {
		    Class299 class299
			= Class179.aClass20_1324.method312((((Node_Sub7)
							     class59_sub7)
							    .anInt3910),
							   -99);
		    if (Statics.method1039(class299, -2080)) {
			if (Statics.anInt1080
			    == ((Node_Sub7) class59_sub7).anInt3910) {
			    int anLocalInt_55_
				= ((anLocalInt
				    * ((Node_Sub7) class59_sub7).anInt3918
				    / Class179.anInt1354)
				   + argument_45_);
			    int anLocalInt_56_
				= (argument_43_
				   + ((-((Node_Sub7) class59_sub7).anInt3911
				       + Class179.anInt1342)
				      * anLocalInt_48_ / Class179.anInt1342));
			    argument_44_.method2020(-126, 4,
						    anLocalInt_56_ - 2, 4,
						    anLocalInt_55_ - 2,
						    (anLocalInt_54_ << 24
						     | 0xffff00));
			} else if (Class20.anInt131 != -1
				   && (((Class299) class299).anInt2490
				       == Class20.anInt131)) {
			    int anLocalInt_57_
				= ((anLocalInt
				    * ((Node_Sub7) class59_sub7).anInt3918
				    / Class179.anInt1354)
				   + argument_45_);
			    int anLocalInt_58_
				= (argument_43_
				   + ((-((Node_Sub7) class59_sub7).anInt3911
				       + Class179.anInt1342)
				      * anLocalInt_48_ / Class179.anInt1342));
			    argument_44_.method2020(-125, 4,
						    anLocalInt_58_ - 2, 4,
						    anLocalInt_57_ - 2,
						    (anLocalInt_54_ << 24
						     | 0xffff00));
			}
		    }
		}
	    }
	}
    }

    static final void method1007(int argument, byte[] argument_61_) {
	Packet class59_sub28 = new Packet(argument_61_);
	if (argument != 1412)
	    method1004(-19, (byte) 31, -50);
	boolean anLocalBoolean = false;
	for (;;) {
	    int anLocalInt = class59_sub28.g1();
	    if (anLocalInt == 0)
		break;
	    if (anLocalInt == 1) {
		if (Node_Sub10.anIntArray3938 == null) {
		    Class62_Sub27.anInt4453 = 4;
		    Node_Sub10.anIntArray3938 = new int[4];
		    Class215.anIntArray1522 = new int[4];
		}
		anLocalBoolean = true;
		for (int anLocalInt_62_ = 0;
		     Node_Sub10.anIntArray3938.length > anLocalInt_62_;
		     anLocalInt_62_++) {
		    Node_Sub10.anIntArray3938[anLocalInt_62_]
			= class59_sub28.g2s();
		    Class215.anIntArray1522[anLocalInt_62_]
			= class59_sub28.g2s();
		}
	    } else if (anLocalInt == 2)
		GlTexture_Sub4_Sub1.anInt6551
		    = class59_sub28.g2();
	    else if (anLocalInt == 3) {
		Class62_Sub27.anInt4453 = class59_sub28.g1();
		Node_Sub10.anIntArray3938
		    = new int[Class62_Sub27.anInt4453];
		Class215.anIntArray1522 = new int[Class62_Sub27.anInt4453];
	    }
	}
	if (!anLocalBoolean) {
	    if (Node_Sub10.anIntArray3938 == null) {
		Class62_Sub27.anInt4453 = 4;
		Class215.anIntArray1522 = new int[4];
		Node_Sub10.anIntArray3938 = new int[4];
	    }
	    for (int anLocalInt = 0;
		 Node_Sub10.anIntArray3938.length > anLocalInt;
		 anLocalInt++) {
		Node_Sub10.anIntArray3938[anLocalInt] = 0;
		Class215.anIntArray1522[anLocalInt] = anLocalInt * 20;
	    }
	}
    }
    
    static final void method1008(byte argument, int argument_63_,
				 boolean argument_64_, int argument_65_,
				 int argument_66_, int argument_67_) {
	if (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676 == null)
	    Class389.aGraphicsToolkit3281.method2020(71, argument_66_, argument_65_,
					      argument_67_, argument_63_,
					      -16777216);
	else if ((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		  .worldX) < 0
		 || (MapRelated.mapWidth * 512
		     <= (((DoublyLinkedNodeP2_Sub2)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .worldX))
		 || ((DoublyLinkedNodeP2_Sub2)
		     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ < 0
		 || (MapRelated.mapDepth * 512
		     <= (((DoublyLinkedNodeP2_Sub2)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .worldZ)))
	    Class389.aGraphicsToolkit3281.method2020(-128, argument_66_, argument_65_,
					      argument_67_, argument_63_,
					      -16777216);
	else {
	    Statics.anInt264++;
	    if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 != null
		&& (((DoublyLinkedNodeP2_Sub2)
		     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX
		    - (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			   .method1830(-128)
		       - 1) * 256) >> 9 == Class382.anInt3242
		&& (((DoublyLinkedNodeP2_Sub2)
		     Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ
		    - (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			   .method1830(-126)
		       - 1) * 256) >> 9 == ModeWhatEnum.anInt2310) {
		Class382.anInt3242 = -1;
		ModeWhatEnum.anInt2310 = -1;
		Class353_Sub1.method3892(-77);
	    }
	    Class245_Sub2.method3190(0);
	    if (!argument_64_)
		Node_Sub45.method1095(0);
	    GraphicsToolkit_Sub2.method2164((byte) 14);
	    Class111.method1990(argument_66_, argument_67_, 6680, argument_63_,
				argument_65_, true);
	    argument_66_ = Class127.anInt1038;
	    argument_67_ = Class287.anInt2297;
	    argument_63_ = Class350_Sub2.anInt5446;
	    argument_65_ = Class96.anInt748;
	    Class390.anInt3285 = Class390.anInt3284;
	    if (Statics.anInt1745 == 1) {
		int anLocalInt = (int) DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6623;
		if (anLocalInt < Class64.anInt448 >> 8)
		    anLocalInt = Class64.anInt448 >> 8;
		if (Class291.aBooleanArray2366[4]
		    && anLocalInt < Class259.anIntArray2016[4] + 128)
		    anLocalInt = Class259.anIntArray2016[4] + 128;
		int anLocalInt_68_ = (((int) DoublyLinkedNodeP2_Sub6.aFloat4538
				       + Node_Sub31_Sub4.anInt5852)
				      & 0x3fff);
		DoublyLinkedNode_Sub51_Sub5.method1198
		    (Statics.anInt1411, anLocalInt_68_, (Node_Sub31_Sub36.method993(Class176.anInt1308, ((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX, -12040, (((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ))) - 200, anLocalInt, argument_67_, tia_sub_35_Sub2DoublyLinked.anInt6665, (anLocalInt >> 3) * 3 + 600 << 2, (byte) 87);
	    } else if (Statics.anInt1745 == 4) {
		int anLocalInt = (int) DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6623;
		if (Class64.anInt448 >> 8 > anLocalInt)
		    anLocalInt = Class64.anInt448 >> 8;
		if (Class291.aBooleanArray2366[4]
		    && Class259.anIntArray2016[4] + 128 > anLocalInt)
		    anLocalInt = Class259.anIntArray2016[4] + 128;
		int anLocalInt_69_ = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
		DoublyLinkedNode_Sub51_Sub5.method1198
		    (Statics.anInt1411, anLocalInt_69_, Node_Sub31_Sub36.method993(Class176.anInt1308, Class167.anInt1224, -12040, Class61.anInt437) - 200, anLocalInt, argument_67_, tia_sub_35_Sub2DoublyLinked.anInt6665, (anLocalInt >> 3) * 3 + 600 << 2, (byte) 87);
	    } else if (Statics.anInt1745 == 5)
		Statics.method183(argument_67_, (byte) 8);
	    int anLocalInt = Class287.anInt2299;
	    int anLocalInt_70_ = Class2_Sub2.anInt3763;
	    int anLocalInt_71_ = Node_Sub31_Sub30.anInt5987;
	    int anLocalInt_72_ = Class293.anInt2404;
	    int anLocalInt_73_ = Node_Sub47_Sub3.anInt6167;
	    for (int anLocalInt_74_ = 0; anLocalInt_74_ < 5;
		 anLocalInt_74_++) {
		if (Class291.aBooleanArray2366[anLocalInt_74_]) {
		    int anLocalInt_75_
			= (int) ((double) -(Class321.anIntArray2637
					    [anLocalInt_74_])
				 + (double) ((Class321.anIntArray2637
					      [anLocalInt_74_]) * 2
					     + 1) * Math.random()
				 + (Math.sin((double) (Statics
						       .anIntArray5574
						       [anLocalInt_74_])
					     / 100.0
					     * (double) (Statics.anIntArray583
							 [anLocalInt_74_]))
				    * (double) (Class259.anIntArray2016
						[anLocalInt_74_])));
		    if (anLocalInt_74_ == 1)
			Class2_Sub2.anInt3763 += anLocalInt_75_ << 2;
		    if (anLocalInt_74_ == 3)
			Node_Sub47_Sub3.anInt6167
			    = (Node_Sub47_Sub3.anInt6167 + anLocalInt_75_
			       & 0x3fff);
		    if (anLocalInt_74_ == 2)
			Node_Sub31_Sub30.anInt5987 += anLocalInt_75_ << 2;
		    if (anLocalInt_74_ == 0)
			Class287.anInt2299 += anLocalInt_75_ << 2;
		    if (anLocalInt_74_ == 4) {
			Class293.anInt2404 += anLocalInt_75_;
			if (Class293.anInt2404 >= 1024) {
			    if (Class293.anInt2404 > 3072)
				Class293.anInt2404 = 3072;
			} else
			    Class293.anInt2404 = 1024;
		    }
		}
	    }
	    if (Class287.anInt2299 < 0)
		Class287.anInt2299 = 0;
	    if (Node_Sub31_Sub30.anInt5987 < 0)
		Node_Sub31_Sub30.anInt5987 = 0;
	    if (Class287.anInt2299 > (LightingManager.xMapSize << 9) - 1)
		Class287.anInt2299 = (LightingManager.xMapSize << 9) - 1;
	    int anLocalInt_76_ = -79 / ((argument + 68) / 55);
	    if (Node_Sub31_Sub30.anInt5987
		> (LightingManager.zMapSize << 9) - 1)
		Node_Sub31_Sub30.anInt5987
		    = (LightingManager.zMapSize << 9) - 1;
	    Node_Sub47_Sub9.method1134(94);
	    DoublyLinkedNodeP2_Sub8.method1938(1204339692);
	    Class389.aGraphicsToolkit3281.setClip(argument_63_, argument_67_ + argument_65_, argument_66_ + argument_63_, argument_65_);
	    DoublyLinkedNodeP2_Sub4_Sub2.method1913(true, (byte) -102);
	    if (!Class52.aBoolean391) {
		Class389.aGraphicsToolkit3281.clearDepthBuffer();
		int anLocalInt_77_ = AthmosphericConditions.fogColour;
		if (Class_s.aClass195_2551 == null)
		    Class389.aGraphicsToolkit3281.clear(anLocalInt_77_);
		else
		    Class_s.aClass195_2551.method2897
			(-121, Class293.anInt2404, Class389.aGraphicsToolkit3281,
			 Statics.anInt6416 << 3, argument_63_,
			 Node_Sub47_Sub3.anInt6167, argument_66_,
			 argument_65_, argument_67_, anLocalInt_77_);
	    } else {
		Statics.method282(AthmosphericConditions.fogColour, (byte) 6);
		if (Node_Sub31_Sub33.anInt6003 != Class390.anInt3285)
		    Class18.aBoolean124 = true;
		Node_Sub31_Sub33.anInt6003 = Class390.anInt3285;
	    }
	    Class47.method453((byte) -68);
	    Class41.aClass350_304.method3828(Class287.anInt2299,
					     Class2_Sub2.anInt3763,
					     Node_Sub31_Sub30.anInt5987,
					     -Class293.anInt2404 & 0x3fff,
					     (-Node_Sub47_Sub3.anInt6167
					      & 0x3fff),
					     -Class361.anInt3055 & 0x3fff);
	    Class389.aGraphicsToolkit3281.method2069(Class41.aClass350_304);
	    Class389.aGraphicsToolkit3281.DA(argument_66_ / 2 + argument_63_,
				      argument_65_ + argument_67_ / 2,
				      Class62_Sub13.anInt4406 << 1,
				      Class62_Sub13.anInt4406 << 1);
	    Statics.method1798(argument_63_ + argument_66_ / 2, argument_65_ + argument_67_ / 2, 3, Class62_Sub13.anInt4406 << 1, Class62_Sub13.anInt4406 << 1);
	    Statics.method1107(-Class293.anInt2404 & 0x3fff, (-Node_Sub47_Sub3.anInt6167 & 0x3fff), -Class361.anInt3055 & 0x3fff, (byte) 110, Class287.anInt2299, Node_Sub31_Sub30.anInt5987, Class2_Sub2.anInt3763);
	    byte anLocalInt_78_ = (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
				       .aClass62_Sub29_4328.method1477(9) == 2
				   ? (byte) Statics.anInt264 : (byte) 1);
	    if (Class52.aBoolean391) {
		RsInterface.method3233(-Class293.anInt2404 & 0x3fff, -Class361.anInt3055 & 0x3fff, (byte) 66, -Node_Sub47_Sub3.anInt6167 & 0x3fff);
		Class157.method2588
		    (anLocalInt_78_, Class60.anIntArray435,
		     Class2_Sub2.anInt3763, Statics.aByteArrayArrayArray1279,
		     Node_Sub31_Sub30.anInt5987, Class227.anIntArray1642,
		     Class390.anInt3285, DxSkybox.anIntArray4477,
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL
		      + 1),
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX
		      >> 9),
		     DiskBackedCache.anIntArray2706, Class333.anInt2720, true,
		     ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			 .aClass62_Sub18_4304.method1427(42) == 0,
		     Statics.anIntArray1179,
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ
		      >> 9),
		     0, Class287.anInt2299);
	    } else
		Class90.method1676
		    (Class333.anInt2720, Class287.anInt2299,
		     Class2_Sub2.anInt3763, Node_Sub31_Sub30.anInt5987,
		     Statics.aByteArrayArrayArray1279,
		     Class227.anIntArray1642, Statics.anIntArray1179,
		     DiskBackedCache.anIntArray2706, Class60.anIntArray435,
		     DxSkybox.anIntArray4477,
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL
		      + 1),
		     anLocalInt_78_,
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX
		      >> 9),
		     (((DoublyLinkedNodeP2_Sub2)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldZ
		      >> 9),
		     ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			 .aClass62_Sub18_4304.method1427(95) == 0,
		     true,
		     !DoublyLinkedNodeP2_Sub3.aBoolean4523 ? -1 : Class390.anInt3285, 0,
		     false);
	    Class47.method453((byte) -110);
	    if (Statics.anInt1652 == 10) {
		Class107.method1954(256, argument_67_, 2, argument_63_,
				    argument_66_, argument_65_, 256);
		DoublyLinkedNodeP2_Sub2_Sub5.method1894(argument_65_, argument_63_, 256,
					      -80, argument_67_, 256,
					      argument_66_);
		Class195.method2900(256, argument_63_, 1780724097,
				    argument_67_, argument_66_, 256,
				    argument_65_);
		Node_Sub9_Sub2.method613(argument_66_, argument_67_,
                argument_65_, -8, argument_63_);
	    }
	    Node_Sub28_Sub1.method846();
	    Class2_Sub2.anInt3763 = anLocalInt_70_;
	    Node_Sub47_Sub3.anInt6167 = anLocalInt_73_;
	    Node_Sub31_Sub30.anInt5987 = anLocalInt_71_;
	    Class287.anInt2299 = anLocalInt;
	    Class293.anInt2404 = anLocalInt_72_;
	    if (Class281.aBoolean2273
		&& client.js5client.type0RequestCount() == 0)
		Class281.aBoolean2273 = false;
	    if (Class281.aBoolean2273) {
		Class389.aGraphicsToolkit3281.method2020(-126, argument_66_,
						  argument_65_, argument_67_,
						  argument_63_, -16777216);
		Class62_Sub10.method1395
		    (Node_Sub47_Sub9.aAbstractFont_6203, Class389.aGraphicsToolkit3281,
		     Statics.aClass76_3433, false, -67,
		     MultilanguageString.LOADING_PLEASE_WAIT.getLocalizedString(
                     client.language));
	    }
	    DoublyLinkedNodeP2_Sub4_Sub2.method1913(false, (byte) -102);
	}
    }
    
    final int[] method867(byte argument_79_, int argument_80_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_80_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int[][] anLocalInts_81_
		= ((Node_Sub31) this).aClass97_4135.method1717(0);
	    int anLocalInt = 0;
	    int anLocalInt_82_ = 0;
	    int anLocalInt_83_ = 0;
	    int anLocalInt_84_ = 0;
	    int anLocalInt_85_ = 0;
	    boolean anLocalBoolean = true;
	    boolean anLocalBoolean_86_ = true;
	    int anLocalInt_87_ = 0;
	    int anLocalInt_88_ = 0;
	    int anLocalInt_89_ = anInt6052 * Statics.anInt294 >> 12;
	    int anLocalInt_90_ = Statics.anInt294 * anInt6046 >> 12;
	    int anLocalInt_91_
		= anInt6047 * DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 >> 12;
	    int anLocalInt_92_
		= DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 * anInt6053 >> 12;
	    if (anLocalInt_92_ <= 1)
		return anLocalInts_81_[argument_80_];
	    anInt6054 = Statics.anInt294 / 8 * anInt6045 >> 12;
	    int anLocalInt_93_ = Statics.anInt294 / anLocalInt_89_ + 1;
	    int[][] anLocalInts_94_ = new int[anLocalInt_93_][3];
	    int[][] anLocalInts_95_ = new int[anLocalInt_93_][3];
	    Random random = new Random((long) anInt6048);
	    for (;;) {
		int anLocalInt_96_
		    = (anLocalInt_89_
		       + Class207.method2945(random, -110,
					     anLocalInt_90_ - anLocalInt_89_));
		int anLocalInt_97_
		    = (Class207.method2945(random, 36,
					   anLocalInt_92_ - anLocalInt_91_)
		       + anLocalInt_91_);
		int anLocalInt_98_ = anLocalInt_84_ + anLocalInt_96_;
		if (Statics.anInt294 < anLocalInt_98_) {
		    anLocalInt_96_ = Statics.anInt294 - anLocalInt_84_;
		    anLocalInt_98_ = Statics.anInt294;
		}
		int anLocalInt_99_;
		if (anLocalBoolean_86_)
		    anLocalInt_99_ = 0;
		else {
		    int anLocalInt_100_ = anLocalInt_85_;
		    int[] anLocalInts_101_ = anLocalInts_95_[anLocalInt_85_];
		    int anLocalInt_102_ = 0;
		    int anLocalInt_103_ = anLocalInt + anLocalInt_98_;
		    if (anLocalInt_103_ < 0)
			anLocalInt_103_ += Statics.anInt294;
		    if (Statics.anInt294 < anLocalInt_103_)
			anLocalInt_103_ -= Statics.anInt294;
		    anLocalInt_99_ = anLocalInts_101_[2];
		    for (;;) {
			int[] anLocalInts_104_
			    = anLocalInts_95_[anLocalInt_100_];
			if (anLocalInts_104_[0] <= anLocalInt_103_
			    && anLocalInts_104_[1] >= anLocalInt_103_)
			    break;
			if (anLocalInt_87_ <= ++anLocalInt_100_)
			    anLocalInt_100_ = 0;
			anLocalInt_102_++;
		    }
		    if (anLocalInt_100_ != anLocalInt_85_) {
			int anLocalInt_105_ = anLocalInt_84_ + anLocalInt;
			if (anLocalInt_105_ < 0)
			    anLocalInt_105_ += Statics.anInt294;
			if (anLocalInt_105_ > Statics.anInt294)
			    anLocalInt_105_ -= Statics.anInt294;
			for (int anLocalInt_106_ = 1;
			     anLocalInt_102_ >= anLocalInt_106_;
			     anLocalInt_106_++) {
			    int[] anLocalInts_107_
				= (anLocalInts_95_
				   [((anLocalInt_85_ + anLocalInt_106_)
				     % anLocalInt_87_)]);
			    anLocalInt_99_ = Math.max(anLocalInt_99_,
						      anLocalInts_107_[2]);
			}
			for (int anLocalInt_108_ = 0;
			     anLocalInt_108_ <= anLocalInt_102_;
			     anLocalInt_108_++) {
			    int[] anLocalInts_109_
				= (anLocalInts_95_
				   [((anLocalInt_85_ + anLocalInt_108_)
				     % anLocalInt_87_)]);
			    int anLocalInt_110_ = anLocalInts_109_[2];
			    if (anLocalInt_110_ != anLocalInt_99_) {
				int anLocalInt_111_ = anLocalInts_109_[0];
				int anLocalInt_112_ = anLocalInts_109_[1];
				int anLocalInt_113_;
				int anLocalInt_114_;
				if (anLocalInt_105_ >= anLocalInt_103_) {
				    if (anLocalInt_111_ != 0) {
					anLocalInt_113_
					    = Math.max(anLocalInt_105_,
						       anLocalInt_111_);
					anLocalInt_114_ = Statics.anInt294;
				    } else {
					anLocalInt_114_
					    = Math.min(anLocalInt_103_,
						       anLocalInt_112_);
					anLocalInt_113_ = 0;
				    }
				} else {
				    anLocalInt_113_
					= Math.max(anLocalInt_105_,
						   anLocalInt_111_);
				    anLocalInt_114_
					= Math.min(anLocalInt_103_,
						   anLocalInt_112_);
				}
				method1001(2, anLocalInt_110_, anLocalInts_81_,
					   random,
					   anLocalInt_114_ - anLocalInt_113_,
					   -anLocalInt_110_ + anLocalInt_99_,
					   anLocalInt_113_ + anLocalInt_83_);
			    }
			}
		    }
		    anLocalInt_85_ = anLocalInt_100_;
		}
		if (DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711
		    >= anLocalInt_99_ + anLocalInt_97_)
		    anLocalBoolean = false;
		else
		    anLocalInt_97_
			= -anLocalInt_99_ + DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711;
		if (Statics.anInt294 == anLocalInt_98_) {
		    method1001(2, anLocalInt_99_, anLocalInts_81_, random,
			       anLocalInt_96_, anLocalInt_97_,
			       anLocalInt_82_ + anLocalInt_84_);
		    if (anLocalBoolean)
			break;
		    anLocalBoolean = true;
		    int[] anLocalInts_115_ = anLocalInts_94_[anLocalInt_88_++];
		    anLocalInts_115_[2] = anLocalInt_97_ + anLocalInt_99_;
		    anLocalInts_115_[1] = anLocalInt_98_;
		    anLocalInts_115_[0] = anLocalInt_84_;
		    int[][] anLocalInts_116_ = anLocalInts_95_;
		    anLocalInts_95_ = anLocalInts_94_;
		    anLocalInt_87_ = anLocalInt_88_;
		    anLocalInts_94_ = anLocalInts_116_;
		    anLocalInt_83_ = anLocalInt_82_;
		    anLocalInt_88_ = 0;
		    anLocalInt_82_
			= Class207.method2945(random, -120, Statics.anInt294);
		    anLocalInt = anLocalInt_82_ - anLocalInt_83_;
		    anLocalInt_84_ = 0;
		    int anLocalInt_117_ = anLocalInt;
		    if (anLocalInt_117_ < 0)
			anLocalInt_117_ += Statics.anInt294;
		    if (anLocalInt_117_ > Statics.anInt294)
			anLocalInt_117_ -= Statics.anInt294;
		    anLocalInt_85_ = 0;
		    anLocalBoolean_86_ = false;
		    for (;;) {
			int[] anLocalInts_118_
			    = anLocalInts_95_[anLocalInt_85_];
			if (anLocalInts_118_[0] <= anLocalInt_117_
			    && anLocalInt_117_ <= anLocalInts_118_[1])
			    break;
			if (anLocalInt_87_ <= ++anLocalInt_85_)
			    anLocalInt_85_ = 0;
		    }
		} else {
		    int[] anLocalInts_119_ = anLocalInts_94_[anLocalInt_88_++];
		    anLocalInts_119_[0] = anLocalInt_84_;
		    anLocalInts_119_[1] = anLocalInt_98_;
		    anLocalInts_119_[2] = anLocalInt_97_ + anLocalInt_99_;
		    method1001(2, anLocalInt_99_, anLocalInts_81_, random,
			       anLocalInt_96_, anLocalInt_97_,
			       anLocalInt_84_ + anLocalInt_82_);
		    anLocalInt_84_ = anLocalInt_98_;
		}
	    }
	}
	if (argument_79_ < 21)
	    return null;
	return anLocalInts;
    }
    
    final void method865(boolean argument_120_) {
	if (argument_120_ != true)
	    anInt6051 = -124;
    }
}
