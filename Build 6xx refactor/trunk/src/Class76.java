/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76
{
    int anInt513;
    private byte[] aByteArray514;
    static String[] aStringArray515 = new String[100];
    static int anInt516 = -1;
    private byte[][] aByteArrayArray517;
    int anInt518;
    static CyclicLinkedList aCyclicLinkedList_519 = new CyclicLinkedList();
    int anInt520;

    final int method1552(String argument_0_, int argument_1_) {
	if (argument_1_ != 0)
	    return 127;
	return method1558(argument_1_ + 18700, null, argument_0_);
    }
    
    final int method1553(int argument_2_, Class368[] argument_3_,
			 String argument_4_, int argument_5_) {
	return method1562(argument_3_, Statics.aStringArray3599,
			  new int[] { argument_5_ }, argument_4_, -1);
    }
    
    final int method1554(char argument_6_, int argument_7_, int argument_8_) {
	if (aByteArrayArray517 != null)
	    return aByteArrayArray517[argument_7_][argument_6_];
	return 0;
    }
    
    final String method1555(int argument_9_, String argument_10_,
			    boolean argument_11_, Class368[] argument_12_) {
	if (argument_9_ >= method1558(18700, argument_12_, argument_10_))
	    return argument_10_;
	argument_9_ -= method1558(18700, null, "...");
	int anLocalInt = -1;
	int anLocalInt_13_ = -1;
	int anLocalInt_14_ = 0;
	int anLocalInt_15_ = argument_10_.length();
	String string = "";
	for (int anLocalInt_16_ = 0; anLocalInt_15_ > anLocalInt_16_;
	     anLocalInt_16_++) {
	    char anLocalChar = argument_10_.charAt(anLocalInt_16_);
	    if (anLocalChar == 60)
		anLocalInt = anLocalInt_16_;
	    else {
		if (anLocalChar == 62 && anLocalInt != -1) {
		    String string_17_ = argument_10_.substring(anLocalInt + 1,
							       anLocalInt_16_);
		    anLocalInt = -1;
		    if (string_17_.equals("lt"))
			anLocalChar = '<';
		    else if (string_17_.equals("gt"))
			anLocalChar = '>';
		    else if (string_17_.equals("nbsp"))
			anLocalChar = '\u00a0';
		    else if (string_17_.equals("shy"))
			anLocalChar = '\u00ad';
		    else if (string_17_.equals("times"))
			anLocalChar = '\u00d7';
		    else if (string_17_.equals("euro"))
			anLocalChar = '\u20ac';
		    else if (string_17_.equals("copy"))
			anLocalChar = '\u00a9';
		    else if (string_17_.equals("reg"))
			anLocalChar = '\u00ae';
		    else {
			if (string_17_.startsWith("img=")
			    && argument_12_ != null) {
			    try {
				int anLocalInt_18_
				    = JagexStringUtils.parseInt(string_17_.substring(4));
				anLocalInt_14_ += argument_12_
						      [anLocalInt_18_]
						      .getWidth();
				anLocalInt_13_ = -1;
				if (anLocalInt_14_ > argument_9_)
				    return string + "...";
				string = argument_10_
					     .substring(0, anLocalInt_16_ + 1);
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (anLocalInt == -1) {
		    anLocalInt_14_
			+= aByteArray514[(Class62_Sub18.method1426(-112,
								   anLocalChar)
					  & 0xff)] & 0xff;
		    if (aByteArrayArray517 != null && anLocalInt_13_ != -1)
			anLocalInt_14_
			    += aByteArrayArray517[anLocalInt_13_][anLocalChar];
		    anLocalInt_13_ = anLocalChar;
		    int anLocalInt_19_ = anLocalInt_14_;
		    if (aByteArrayArray517 != null)
			anLocalInt_19_ += aByteArrayArray517[anLocalChar][46];
		    if (anLocalInt_19_ > argument_9_)
			return string + "...";
		    string = argument_10_.substring(0, anLocalInt_16_ + 1);
		}
	    }
	}
	return argument_10_;
    }
    
    final int method1556(boolean argument_20_, int argument_21_) {
	return aByteArray514[argument_21_] & 0xff;
    }
    
    final int method1557(byte argument_22_, String argument_23_,
			 int argument_24_, Class368[] argument_25_) {
	if (argument_22_ != -121)
	    return 15;
	int anLocalInt = method1562(argument_25_, Statics.aStringArray3599,
				    new int[] { argument_24_ }, argument_23_,
				    argument_22_ ^ 0x78);
	int anLocalInt_26_ = 0;
	for (int anLocalInt_27_ = 0; anLocalInt_27_ < anLocalInt;
	     anLocalInt_27_++) {
	    int anLocalInt_28_
		= method1558(argument_22_ ^ ~0x4974, argument_25_,
			     Statics.aStringArray3599[anLocalInt_27_]);
	    if (anLocalInt_26_ < anLocalInt_28_)
		anLocalInt_26_ = anLocalInt_28_;
	}
	return anLocalInt_26_;
    }
    
    final int method1558(int argument_29_, Class368[] argument_30_,
			 String argument_31_) {
	if (argument_31_ == null)
	    return 0;
	int anLocalInt = -1;
	int anLocalInt_32_ = -1;
	if (argument_29_ != 18700)
	    ((Class76) this).anInt520 = 94;
	int anLocalInt_33_ = 0;
	int anLocalInt_34_ = argument_31_.length();
	for (int anLocalInt_35_ = 0; anLocalInt_35_ < anLocalInt_34_;
	     anLocalInt_35_++) {
	    char anLocalChar = argument_31_.charAt(anLocalInt_35_);
	    if (anLocalChar == 60)
		anLocalInt = anLocalInt_35_;
	    else {
		if (anLocalChar == 62 && anLocalInt != -1) {
		    String string = argument_31_.substring(anLocalInt + 1,
							   anLocalInt_35_);
		    anLocalInt = -1;
		    if (!string.equals("lt")) {
			if (!string.equals("gt")) {
			    if (!string.equals("nbsp")) {
				if (!string.equals("shy")) {
				    if (!string.equals("times")) {
					if (!string.equals("euro")) {
					    if (!string.equals("copy")) {
						if (string.equals("reg"))
						    anLocalChar = '\u00ae';
						else {
						    if (string
							    .startsWith("img=")
							&& (argument_30_
							    != null)) {
							try {
							    int anLocalInt_36_
								= (JagexStringUtils
								       .parseInt((string.substring(4))));
							    anLocalInt_33_
								+= argument_30_
								       [anLocalInt_36_]
								       .getWidth();
							    anLocalInt_32_
								= -1;
							} catch (Exception exception) {
							    /* empty */
							}
						    }
						    continue;
						}
					    } else
						anLocalChar = '\u00a9';
					} else
					    anLocalChar = '\u20ac';
				    } else
					anLocalChar = '\u00d7';
				} else
				    anLocalChar = '\u00ad';
			    } else
				anLocalChar = '\u00a0';
			} else
			    anLocalChar = '>';
		    } else
			anLocalChar = '<';
		}
		if (anLocalInt == -1) {
		    anLocalInt_33_
			+= ((aByteArray514
			     [Class62_Sub18.method1426(argument_29_ - 18816,
						       anLocalChar) & 0xff])
			    & 0xff);
		    if (aByteArrayArray517 != null && anLocalInt_32_ != -1)
			anLocalInt_33_
			    += aByteArrayArray517[anLocalInt_32_][anLocalChar];
		    anLocalInt_32_ = anLocalChar;
		}
	    }
	}
	return anLocalInt_33_;
    }
    
    static final void method1559(int argument, int argument_37_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(argument_37_, 13175,
            (long) argument);
	class59_sub51_sub3.method1181(585134072);
    }
    
    final int method1560(boolean argument_38_, int argument_39_,
			 String argument_40_, Class368[] argument_41_,
			 int argument_42_) {
	if (argument_42_ == 0)
	    argument_42_ = ((Class76) this).anInt513;
	int anLocalInt
	    = method1562(argument_41_, Statics.aStringArray3599,
			 new int[] { argument_39_ }, argument_40_, -1);
	int anLocalInt_43_ = argument_42_ * (anLocalInt - 1);
	return (anLocalInt_43_ + ((Class76) this).anInt520
		+ ((Class76) this).anInt518);
    }
    
    public static void method1561(byte argument) {
	aStringArray515 = null;
	aCyclicLinkedList_519 = null;
	MapRelated.underworldLData = null;
    }
    
    final int method1562(Class368[] argument_44_, String[] argument_45_,
			 int[] argument_46_, String argument_47_,
			 int argument_48_) {
	if (argument_47_ == null)
	    return 0;
	int anLocalInt = 0;
	int anLocalInt_49_ = 0;
	int anLocalInt_50_ = -1;
	int anLocalInt_51_ = 0;
	int anLocalInt_52_ = 0;
	int anLocalInt_53_ = argument_48_;
	int anLocalInt_54_ = -1;
	int anLocalInt_55_ = 0;
	int anLocalInt_56_ = argument_47_.length();
	for (int anLocalInt_57_ = 0; anLocalInt_57_ < anLocalInt_56_;
	     anLocalInt_57_++) {
	    int anLocalInt_58_
		= (Class62_Sub18
		       .method1426(-100, argument_47_.charAt(anLocalInt_57_))
		   & 0xff);
	    int anLocalInt_59_ = 0;
	    if (anLocalInt_58_ == 60)
		anLocalInt_53_ = anLocalInt_57_;
	    else {
		int anLocalInt_60_;
		if (anLocalInt_53_ == -1) {
		    anLocalInt_60_ = anLocalInt_57_;
		    anLocalInt_59_ += method1556(false, anLocalInt_58_);
		    if (aByteArrayArray517 != null && anLocalInt_54_ != -1)
			anLocalInt_59_ += (aByteArrayArray517[anLocalInt_54_]
					   [anLocalInt_58_]);
		    anLocalInt_54_ = anLocalInt_58_;
		} else {
		    if (anLocalInt_58_ != 62)
			continue;
		    anLocalInt_60_ = anLocalInt_53_;
		    String string = argument_47_.substring(anLocalInt_53_ + 1,
							   anLocalInt_57_);
		    anLocalInt_53_ = -1;
		    if (string.equals("br")) {
			argument_45_[anLocalInt_55_]
			    = argument_47_.substring(anLocalInt_49_,
						     anLocalInt_57_ + 1);
			anLocalInt_55_++;
			if (argument_45_.length <= anLocalInt_55_)
			    return 0;
			anLocalInt_50_ = -1;
			anLocalInt = 0;
			anLocalInt_49_ = anLocalInt_57_ + 1;
			anLocalInt_54_ = -1;
			continue;
		    }
		    if (string.equals("lt")) {
			anLocalInt_59_ += method1556(false, 60);
			if (aByteArrayArray517 != null && anLocalInt_54_ != -1)
			    anLocalInt_59_
				+= aByteArrayArray517[anLocalInt_54_][60];
			anLocalInt_54_ = 60;
		    } else if (string.equals("gt")) {
			anLocalInt_59_ += method1556(false, 62);
			if (aByteArrayArray517 != null && anLocalInt_54_ != -1)
			    anLocalInt_59_
				+= aByteArrayArray517[anLocalInt_54_][62];
			anLocalInt_54_ = 62;
		    } else if (string.equals("nbsp")) {
			anLocalInt_59_ += method1556(false, 160);
			if (aByteArrayArray517 != null && anLocalInt_54_ != -1)
			    anLocalInt_59_
				+= aByteArrayArray517[anLocalInt_54_][160];
			anLocalInt_54_ = 160;
		    } else if (!string.equals("shy")) {
			if (string.equals("times")) {
			    anLocalInt_59_ += method1556(false, 215);
			    if (aByteArrayArray517 != null
				&& anLocalInt_54_ != -1)
				anLocalInt_59_
				    += aByteArrayArray517[anLocalInt_54_][215];
			    anLocalInt_54_ = 215;
			} else if (!string.equals("euro")) {
			    if (string.equals("copy")) {
				anLocalInt_59_ += method1556(false, 169);
				if (aByteArrayArray517 != null
				    && anLocalInt_54_ != -1)
				    anLocalInt_59_ += (aByteArrayArray517
						       [anLocalInt_54_][169]);
				anLocalInt_54_ = 169;
			    } else if (string.equals("reg")) {
				anLocalInt_59_ += method1556(false, 174);
				if (aByteArrayArray517 != null
				    && anLocalInt_54_ != -1)
				    anLocalInt_59_ += (aByteArrayArray517
						       [anLocalInt_54_][174]);
				anLocalInt_54_ = 174;
			    } else if (string.startsWith("img=")
				       && argument_44_ != null) {
				try {
				    int anLocalInt_61_
					= JagexStringUtils.parseInt(string.substring(4));
				    anLocalInt_54_ = -1;
				    anLocalInt_59_
					+= argument_44_[anLocalInt_61_]
					       .getWidth();
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			} else {
			    anLocalInt_59_ += method1556(false, 8364);
			    if (aByteArrayArray517 != null
				&& anLocalInt_54_ != -1)
				anLocalInt_59_ += (aByteArrayArray517
						   [anLocalInt_54_][8364]);
			    anLocalInt_54_ = 8364;
			}
		    } else {
			anLocalInt_59_ += method1556(false, 173);
			if (aByteArrayArray517 != null && anLocalInt_54_ != -1)
			    anLocalInt_59_
				+= aByteArrayArray517[anLocalInt_54_][173];
			anLocalInt_54_ = 173;
		    }
		    anLocalInt_58_ = -1;
		}
		if (anLocalInt_59_ > 0) {
		    anLocalInt += anLocalInt_59_;
		    if (argument_46_ != null) {
			if (anLocalInt_58_ == 32) {
			    anLocalInt_52_ = 1;
			    anLocalInt_50_ = anLocalInt_57_;
			    anLocalInt_51_ = anLocalInt;
			}
			if (argument_46_[(anLocalInt_55_ >= argument_46_.length
					  ? argument_46_.length - 1
					  : anLocalInt_55_)]
			    < anLocalInt) {
			    if (anLocalInt_50_ < 0) {
				argument_45_[anLocalInt_55_]
				    = argument_47_.substring(anLocalInt_49_,
							     anLocalInt_60_);
				if (++anLocalInt_55_ >= argument_45_.length)
				    return 0;
				anLocalInt_50_ = -1;
				anLocalInt_54_ = -1;
				anLocalInt_49_ = anLocalInt_60_;
				anLocalInt = anLocalInt_59_;
			    } else {
				argument_45_[anLocalInt_55_]
				    = (argument_47_.substring
				       (anLocalInt_49_,
					anLocalInt_50_ + (1
							  - anLocalInt_52_)));
				anLocalInt_55_++;
				if (argument_45_.length <= anLocalInt_55_)
				    return 0;
				anLocalInt_49_ = anLocalInt_50_ + 1;
				anLocalInt -= anLocalInt_51_;
				anLocalInt_54_ = -1;
				anLocalInt_50_ = -1;
			    }
			}
			if (anLocalInt_58_ == 45) {
			    anLocalInt_51_ = anLocalInt;
			    anLocalInt_50_ = anLocalInt_57_;
			    anLocalInt_52_ = 0;
			}
		    }
		}
	    }
	}
	if (anLocalInt_49_ < argument_47_.length()) {
	    argument_45_[anLocalInt_55_]
		= argument_47_.substring(anLocalInt_49_,
					 argument_47_.length());
	    anLocalInt_55_++;
	}
	return anLocalInt_55_;
    }
    
    Class76(byte[] argument_62_) {
	Packet class59_sub28 = new Packet(argument_62_);
	int anLocalInt = class59_sub28.g1();
	if (anLocalInt != 0)
	    throw new RuntimeException("");
	boolean anLocalBoolean = class59_sub28.g1() == 1;
	aByteArray514 = new byte[256];
	class59_sub28.gbytes(aByteArray514, 0, 256);
	if (!anLocalBoolean)
	    ((Class76) this).anInt513 = class59_sub28.g1();
	else {
	    int[] anLocalInts = new int[256];
	    for (int anLocalInt_63_ = 0; anLocalInt_63_ < 256;
		 anLocalInt_63_++)
		anLocalInts[anLocalInt_63_]
		    = class59_sub28.g1();
	    int[] anLocalInts_64_ = new int[256];
	    for (int anLocalInt_65_ = 0; anLocalInt_65_ < 256;
		 anLocalInt_65_++)
		anLocalInts_64_[anLocalInt_65_]
		    = class59_sub28.g1();
	    byte[][] anLocalInts_66_ = new byte[256][];
	    for (int anLocalInt_67_ = 0; anLocalInt_67_ < 256;
		 anLocalInt_67_++) {
		anLocalInts_66_[anLocalInt_67_]
		    = new byte[anLocalInts[anLocalInt_67_]];
		byte anLocalInt_68_ = 0;
		for (int anLocalInt_69_ = 0;
		     anLocalInts_66_[anLocalInt_67_].length > anLocalInt_69_;
		     anLocalInt_69_++) {
		    anLocalInt_68_ += class59_sub28.g1s();
		    anLocalInts_66_[anLocalInt_67_][anLocalInt_69_]
			= anLocalInt_68_;
		}
	    }
	    byte[][] anLocalInts_70_ = new byte[256][];
	    for (int anLocalInt_71_ = 0; anLocalInt_71_ < 256;
		 anLocalInt_71_++) {
		anLocalInts_70_[anLocalInt_71_]
		    = new byte[anLocalInts[anLocalInt_71_]];
		byte anLocalInt_72_ = 0;
		for (int anLocalInt_73_ = 0;
		     anLocalInt_73_ < anLocalInts_70_[anLocalInt_71_].length;
		     anLocalInt_73_++) {
		    anLocalInt_72_ += class59_sub28.g1s();
		    anLocalInts_70_[anLocalInt_71_][anLocalInt_73_]
			= anLocalInt_72_;
		}
	    }
	    aByteArrayArray517 = new byte[256][256];
	    for (int anLocalInt_74_ = 0; anLocalInt_74_ < 256;
		 anLocalInt_74_++) {
		if (anLocalInt_74_ != 32 && anLocalInt_74_ != 160) {
		    for (int anLocalInt_75_ = 0; anLocalInt_75_ < 256;
			 anLocalInt_75_++) {
			if (anLocalInt_75_ != 32 && anLocalInt_75_ != 160)
			    aByteArrayArray517[anLocalInt_74_][anLocalInt_75_]
				= (byte) (Statics.method1190(anLocalInts, 2, anLocalInt_75_, aByteArray514, anLocalInt_74_, anLocalInts_66_, anLocalInts_64_, anLocalInts_70_));
		    }
		}
	    }
	    ((Class76) this).anInt513 = anLocalInts[32] + anLocalInts_64_[32];
	}
	class59_sub28.g1();
	class59_sub28.g1();
	((Class76) this).anInt520 = class59_sub28.g1();
	((Class76) this).anInt518 = class59_sub28.g1();
    }
}
