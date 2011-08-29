/* Class59_Sub31_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub1 extends Node_Sub31
{
    private int anInt5836;
    static String aString5837 = "";
    private int anInt5838 = 4096;
    private int anInt5839;
    private int anInt5840 = 8192;
    private int anInt5841;
    private int anInt5842;
    private int anInt5843;
    
    public Node_Sub31_Sub1() {
	super(0, true);
	anInt5836 = 2048;
	anInt5839 = 2048;
	anInt5841 = 0;
	anInt5842 = 0;
	anInt5843 = 12288;
    }
    
    private final boolean method874(byte argument_0_, int argument_1_,
				    int argument_2_) {
	if (argument_0_ != 94)
	    return false;
	int anLocalInt = (argument_2_ - argument_1_) * anInt5843 >> 12;
	int anLocalInt_3_
	    = Class62_Sub7.anIntArray4392[anLocalInt * 255 >> 12 & 0xff];
	anLocalInt_3_ = (anLocalInt_3_ << 12) / anInt5843;
	anLocalInt_3_ = (anLocalInt_3_ << 12) / anInt5840;
	anLocalInt_3_ = anLocalInt_3_ * anInt5838 >> 12;
	if (argument_2_ + argument_1_ >= anLocalInt_3_
	    || argument_2_ + argument_1_ <= -anLocalInt_3_)
	    return false;
	return true;
    }
    
    static final void method875(int argument) {
	int anLocalInt = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
			     .aClass62_Sub29_4328.method1477(17);
	if (anLocalInt != 0) {
	    if (anLocalInt == 1) {
		Statics.method3259((byte) 120, (byte) 0);
		Class105.method1950((byte) -82, 512);
		if (Class303.tileSettings != null)
		    Class256.method3269(-124);
	    } else {
		Statics.method3259((byte) 113, (byte) (Statics.anInt264 - 4 & 0xff));
		Class105.method1950((byte) -82, 2);
	    }
	} else {
	    Statics.aByteArrayArrayArray1279 = null;
	    Class105.method1950((byte) -82, 0);
	}
	Class253_Sub1.anInt5663 = Class176.anInt1308;
    }
    
    static final Class253 method876(Packet argument,
				    boolean argument_4_) {
	Class349 class349
	    = JagexHashMap.method1522()[argument.g1()];
	Class44 class44
	    = Class225.method3051(-1)[argument.g1()];
	int anLocalInt = argument.g2s();
	int anLocalInt_5_ = argument.g2s();
	int anLocalInt_6_ = argument.g2();
	int anLocalInt_7_ = argument.g2();
	int anLocalInt_8_ = argument.g2s();
	int anLocalInt_9_ = argument.g4();
	int anLocalInt_10_ = argument.g4();
	return new Class253(class349, class44, anLocalInt, anLocalInt_5_,
			    anLocalInt_6_, anLocalInt_7_, anLocalInt_8_,
			    anLocalInt_9_, anLocalInt_10_);
    }
    
    private final boolean method877(int argument_11_, int argument_12_,
				    int argument_13_) {
	int anLocalInt = anInt5843 * (argument_13_ + argument_11_) >> 12;
	int anLocalInt_14_
	    = Class62_Sub7.anIntArray4392[anLocalInt * 255 >> 12 & 0xff];
	anLocalInt_14_ = (anLocalInt_14_ << 12) / anInt5843;
	anLocalInt_14_ = (anLocalInt_14_ << 12) / anInt5840;
	anLocalInt_14_ = anLocalInt_14_ * anInt5838 >> 12;
	if (argument_12_ >= -52)
	    return true;
	if (anLocalInt_14_ <= argument_13_ - argument_11_
	    || -argument_11_ + argument_13_ <= -anLocalInt_14_)
	    return false;
	return true;
    }
    
    static final String method878(byte argument, String argument_15_) {
	int anLocalInt = argument_15_.length();
	int anLocalInt_16_ = 0;
	for (int anLocalInt_17_ = 0; anLocalInt > anLocalInt_17_;
	     anLocalInt_17_++) {
	    char anLocalChar = argument_15_.charAt(anLocalInt_17_);
	    if (anLocalChar == '<' || anLocalChar == '>')
		anLocalInt_16_ += 3;
	}
	StringBuffer stringbuffer
	    = new StringBuffer(anLocalInt_16_ + anLocalInt);
	for (int anLocalInt_18_ = 0; anLocalInt_18_ < anLocalInt;
	     anLocalInt_18_++) {
	    char anLocalChar = argument_15_.charAt(anLocalInt_18_);
	    if (anLocalChar == '<')
		stringbuffer.append("<lt>");
	    else if (anLocalChar != '>')
		stringbuffer.append(anLocalChar);
	    else
		stringbuffer.append("<gt>");
	}
	return stringbuffer.toString();
    }
    
    final void method868(Packet argument_19_, int argument_20_,
			 byte argument_21_) {
	int anLocalInt = argument_20_;
    while_125_:
	do {
	while_124_:
	    do {
	    while_123_:
		do {
		while_122_:
		    do {
		    while_121_:
			do {
			    do {
				if (anLocalInt != 0) {
				    if (anLocalInt != 1) {
					if (anLocalInt != 2) {
					    if (anLocalInt != 3) {
						if (anLocalInt != 4) {
						    if (anLocalInt != 5) {
							if (anLocalInt == 6)
							    break while_124_;
							break while_125_;
						    }
						} else
						    break while_122_;
						break while_123_;
					    }
					} else
					    break;
					break while_121_;
				    }
				} else {
				    anInt5836 = argument_19_.g2();
				    break while_125_;
				}
				anInt5842 = argument_19_.g2();
				break while_125_;
			    } while (false);
			    anInt5841 = argument_19_.g2();
			    break while_125_;
			} while (false);
			anInt5839 = argument_19_.g2();
			break while_125_;
		    } while (false);
		    anInt5843 = argument_19_.g2();
		    break while_125_;
		} while (false);
		anInt5838 = argument_19_.g2();
		break while_125_;
	    } while (false);
	    anInt5840 = argument_19_.g2();
	} while (false);
	if (argument_21_ > -41)
	    anInt5843 = -2;
    }
    
    public static void method879(byte argument) {
	AthmosphericConditions.previousSkybox = null;
	aString5837 = null;
    }
    
    static final void method880(boolean argument,
				DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument_22_,
				byte argument_23_) {
	if (Class62_Sub12.anInt4402 < 400) {
	    Class291 class291
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_22_).aClass291_6832;
	    String string
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_22_).aString6825;
	    if (((Class291) class291).anIntArray2374 != null) {
		class291 = class291.method3485((ClientVariables
						.instance),
					       -1);
		if (class291 == null)
		    return;
		string = ((Class291) class291).aString2333;
	    }
	    if (((Class291) class291).aBoolean2342) {
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_22_).anInt6833
		    != 0) {
		    String string_24_
			= (client.selectedGame == GameEnum.STELLARDAWN
			   ? MultilanguageString.RATING
				 .getLocalizedString(client.language)
			   : MultilanguageString.LEVEL
				 .getLocalizedString(client.language));
		    string += ((Class50.method462
				(9,
				 (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .anInt6855),
				 (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_22_)
				  .anInt6833)))
			       + " (" + (String) string_24_
			       + (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_22_)
				  .anInt6833)
			       + ")");
		}
		if (Class353.aBoolean2953 && !argument) {
		    Class315 class315
			= (Class178.anInt1311 == -1 ? null
			   : Class62_Sub27.aClass362_4457
				 .method3960(true, Class178.anInt1311));
		    if ((Node_Sub31_Sub4.anInt5855 & 0x2) != 0
			&& (class315 == null
			    || (class291.method3488(Class178.anInt1311,
						    (((Class315) class315)
						     .anInt2607),
						    (byte) 111)
				!= ((Class315) class315).anInt2607)))
			Class173.method2769(false, AbstractFont.aString416, false,
					    -1,
					    (Statics.aString6376
					     + " -> <col=ffff00>" + string),
					    (byte) 61, true, 0, 5,
					    (long) ((Entity)
						    argument_22_).anInt6745,
					    0, Class262.anInt2040,
					    (long) ((Entity)
						    argument_22_).anInt6745);
		}
		if (!argument) {
		    String[] strings = ((Class291) class291).aStringArray2354;
		    if (Class275.aBoolean2204)
			strings = Class6.method234(true, strings);
		    if (strings != null) {
			for (int anLocalInt = 4; anLocalInt >= 0;
			     anLocalInt--) {
			    if (strings[anLocalInt] != null
				&& (((Class291) class291).aByte2322 == 0
				    || !(strings[anLocalInt].equalsIgnoreCase
					 (MultilanguageString.ATTACK.getLocalizedString
                             (client.language))))) {
				int anLocalInt_25_ = 0;
				if (anLocalInt == 0)
				    anLocalInt_25_ = 12;
				int anLocalInt_26_ = Class133_Sub2.anInt5017;
				if (anLocalInt == 1)
				    anLocalInt_25_ = 45;
				if (anLocalInt == 2)
				    anLocalInt_25_ = 50;
				if (anLocalInt == 3)
				    anLocalInt_25_ = 9;
				if (anLocalInt
				    == ((Class291) class291).anInt2357)
				    anLocalInt_26_
					= ((Class291) class291).anInt2360;
				if (anLocalInt == 4)
				    anLocalInt_25_ = 25;
				if (anLocalInt
				    == ((Class291) class291).anInt2313)
				    anLocalInt_26_
					= ((Class291) class291).anInt2337;
				Class173.method2769
				    (false, strings[anLocalInt], false, -1,
				     "<col=ffff00>" + string, (byte) -98, true,
				     0, anLocalInt_25_,
				     (long) ((Entity)
					     argument_22_).anInt6745,
				     0,
				     (!(strings[anLocalInt].equalsIgnoreCase
					(MultilanguageString.ATTACK.getLocalizedString
                            (client.language)))
				      ? anLocalInt_26_
				      : ((Class291) class291).anInt2368),
				     (long) ((Entity)
					     argument_22_).anInt6745);
			    }
			}
		    }
		    if (((Class291) class291).aByte2322 == 1
			&& strings != null) {
			for (int anLocalInt = 4; anLocalInt >= 0;
			     anLocalInt--) {
			    if (strings[anLocalInt] != null
				&& (strings[anLocalInt].equalsIgnoreCase
				    (MultilanguageString.ATTACK.getLocalizedString
                            (
                                    client.language)))) {
				short anLocalInt_27_ = 0;
				if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .anInt6855)
				    < ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				       argument_22_).anInt6833)
				    anLocalInt_27_ = (short) 2000;
				short anLocalInt_28_ = 0;
				if (anLocalInt == 0)
				    anLocalInt_28_ = (short) 12;
				if (anLocalInt == 1)
				    anLocalInt_28_ = (short) 45;
				if (anLocalInt == 2)
				    anLocalInt_28_ = (short) 50;
				if (anLocalInt == 3)
				    anLocalInt_28_ = (short) 9;
				if (anLocalInt == 4)
				    anLocalInt_28_ = (short) 25;
				if (anLocalInt_28_ != 0)
				    anLocalInt_28_ += anLocalInt_27_;
				Class173.method2769
				    (false, strings[anLocalInt], false, -1,
				     "<col=ffff00>" + string, (byte) -97, true,
				     0, anLocalInt_28_,
				     (long) ((Entity)
					     argument_22_).anInt6745,
				     0, ((Class291) class291).anInt2368,
				     (long) ((Entity)
					     argument_22_).anInt6745);
			    }
			}
		    }
		}
		Class173.method2769
		    (argument,
		     MultilanguageString.EXAMINE.getLocalizedString(
                     client.language),
		     false, -1, "<col=ffff00>" + string, (byte) 100, true, 0,
		     1009,
		     (long) ((Entity) argument_22_).anInt6745,
		     0, DoublyLinkedNode_Sub51_Sub3.anInt6235,
		     (long) (((Entity) argument_22_)
			     .anInt6745));
		if (argument_23_ != 16)
		    AthmosphericConditions.previousSkybox = null;
	    }
	}
    }
    
    static final void method881(int argument, int argument_29_,
				int argument_30_, int argument_31_,
				int argument_32_) {
	if (argument <= argument_29_)
	    Statics.method3364(Class223.anIntArrayArray1562[argument_32_], (byte) 123, argument, argument_29_, argument_31_);
	else
	    Statics.method3364(Class223.anIntArrayArray1562[argument_32_], (byte) 93, argument_29_, argument, argument_31_);
    }
    
    final int[] method867(byte argument_33_, int argument_34_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_34_,
							      -13476);
	if (argument_33_ <= 21)
	    anInt5843 = 84;
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758) {
	    int anLocalInt = Class82.anIntArray585[argument_34_] - 2048;
	    for (int anLocalInt_35_ = 0; anLocalInt_35_ < Statics.anInt294;
		 anLocalInt_35_++) {
		int anLocalInt_36_
		    = Class130.anIntArray1053[anLocalInt_35_] - 2048;
		int anLocalInt_37_ = anLocalInt_36_ + anInt5836;
		anLocalInt_37_ = (anLocalInt_37_ < -2048
				  ? anLocalInt_37_ + 4096 : anLocalInt_37_);
		anLocalInt_37_ = (anLocalInt_37_ <= 2048 ? anLocalInt_37_
				  : anLocalInt_37_ - 4096);
		int anLocalInt_38_ = anInt5842 + anLocalInt;
		anLocalInt_38_ = (anLocalInt_38_ >= -2048 ? anLocalInt_38_
				  : anLocalInt_38_ + 4096);
		anLocalInt_38_ = (anLocalInt_38_ <= 2048 ? anLocalInt_38_
				  : anLocalInt_38_ - 4096);
		int anLocalInt_39_ = anInt5841 + anLocalInt_36_;
		anLocalInt_39_ = (anLocalInt_39_ < -2048
				  ? anLocalInt_39_ + 4096 : anLocalInt_39_);
		anLocalInt_39_ = (anLocalInt_39_ > 2048 ? anLocalInt_39_ - 4096
				  : anLocalInt_39_);
		int anLocalInt_40_ = anInt5839 + anLocalInt;
		anLocalInt_40_ = (anLocalInt_40_ < -2048
				  ? anLocalInt_40_ + 4096 : anLocalInt_40_);
		anLocalInt_40_ = (anLocalInt_40_ <= 2048 ? anLocalInt_40_
				  : anLocalInt_40_ - 4096);
		anLocalInts[anLocalInt_35_]
		    = ((method874((byte) 94, anLocalInt_37_, anLocalInt_38_)
			|| method877(anLocalInt_39_, -78, anLocalInt_40_))
		       ? 4096 : 0);
	    }
	}
	return anLocalInts;
    }
    
    final void method865(boolean argument_41_) {
	Class344.method3799(argument_41_);
    }
    
    static final void method882(int argument, GraphicsToolkit argument_42_) {
	Class226.aAbstractFont_1641
	    = Class345.method3805(argument_42_, true, client.fontIndexP11full, 0);
	BufferedFile.aClass76_2753
	    = DoublyLinkedNodeP2_Sub2_Sub5.method1893(client.fontIndexP11full, true,
					    argument_42_);
	Node_Sub47_Sub9.aAbstractFont_6203
	    = Class345.method3805(argument_42_, true, client.fontIndexP12full, 0);
	Statics.aClass76_3433
	    = DoublyLinkedNodeP2_Sub2_Sub5.method1893(client.fontIndexP12full, true,
					    argument_42_);
	Class173.aAbstractFont_1286
	    = Class345.method3805(argument_42_, true, client.fontIndexB12full, 0);
	Class37.aClass76_274
	    = DoublyLinkedNodeP2_Sub2_Sub5.method1893(client.fontIndexB12full, true,
					    argument_42_);
    }
}
