/* Class62_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub18 extends Class62
{
    static boolean aBoolean4423 = false;
    static short aShort4424 = 32767;
    
    final int method1342(int argument_0_, byte argument_1_) {
	int anLocalInt = -108 % ((argument_1_ + 53) / 50);
	return 1;
    }
    
    static final byte method1426(int argument, char argument_2_) {
	if (argument > -98)
	    return (byte) 89;
	byte anLocalInt;
	if (argument_2_ > 0 && argument_2_ < '\u0080'
	    || argument_2_ >= '\u00a0' && argument_2_ <= '\u00ff')
	    anLocalInt = (byte) argument_2_;
	else if (argument_2_ != '\u20ac') {
	    if (argument_2_ != '\u201a') {
		if (argument_2_ != '\u0192') {
		    if (argument_2_ != '\u201e') {
			if (argument_2_ == '\u2026')
			    anLocalInt = (byte) -123;
			else if (argument_2_ == '\u2020')
			    anLocalInt = (byte) -122;
			else if (argument_2_ == '\u2021')
			    anLocalInt = (byte) -121;
			else if (argument_2_ == '\u02c6')
			    anLocalInt = (byte) -120;
			else if (argument_2_ == '\u2030')
			    anLocalInt = (byte) -119;
			else if (argument_2_ != '\u0160') {
			    if (argument_2_ == '\u2039')
				anLocalInt = (byte) -117;
			    else if (argument_2_ != '\u0152') {
				if (argument_2_ == '\u017d')
				    anLocalInt = (byte) -114;
				else if (argument_2_ == '\u2018')
				    anLocalInt = (byte) -111;
				else if (argument_2_ != '\u2019') {
				    if (argument_2_ == '\u201c')
					anLocalInt = (byte) -109;
				    else if (argument_2_ == '\u201d')
					anLocalInt = (byte) -108;
				    else if (argument_2_ != '\u2022') {
					if (argument_2_ == '\u2013')
					    anLocalInt = (byte) -106;
					else if (argument_2_ == '\u2014')
					    anLocalInt = (byte) -105;
					else if (argument_2_ != '\u02dc') {
					    if (argument_2_ != '\u2122') {
						if (argument_2_ == '\u0161')
						    anLocalInt = (byte) -102;
						else if (argument_2_
							 == '\u203a')
						    anLocalInt = (byte) -101;
						else if (argument_2_
							 != '\u0153') {
						    if (argument_2_
							!= '\u017e') {
							if (argument_2_
							    == '\u0178')
							    anLocalInt
								= (byte) -97;
							else
							    anLocalInt
								= (byte) 63;
						    } else
							anLocalInt
							    = (byte) -98;
						} else
						    anLocalInt = (byte) -100;
					    } else
						anLocalInt = (byte) -103;
					} else
					    anLocalInt = (byte) -104;
				    } else
					anLocalInt = (byte) -107;
				} else
				    anLocalInt = (byte) -110;
			    } else
				anLocalInt = (byte) -116;
			} else
			    anLocalInt = (byte) -118;
		    } else
			anLocalInt = (byte) -124;
		} else
		    anLocalInt = (byte) -125;
	    } else
		anLocalInt = (byte) -126;
	} else
	    anLocalInt = (byte) -128;
	return anLocalInt;
    }
    
    final void method1343(int argument_3_, byte argument_4_) {
	if (argument_4_ != -107)
	    method1342(-78, (byte) 84);
	((Class62) this).anInt441 = argument_3_;
    }
    
    final int method1344(byte argument_5_) {
	if (argument_5_ != 4)
	    method1346(true);
	return 1;
    }
    
    Class62_Sub18(int argument_6_, Node_Sub50 argument_7_) {
	super(argument_6_, argument_7_);
    }
    
    final void method1346(boolean argument_8_) {
	if (((Class62) this).anInt441 != 1 && ((Class62) this).anInt441 != 0)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_8_)
	    method1426(29, '4');
    }
    
    Class62_Sub18(Node_Sub50 argument_9_) {
	super(argument_9_);
    }
    
    final int method1427(int argument_10_) {
	return ((Class62) this).anInt441;
    }
    
    static final boolean method1428(int argument, boolean argument_11_,
				    int argument_12_, int argument_13_,
				    DoublyLinkedNodeP2_Sub2_Sub3 argument_14_) {
	if (!DoublyLinkedNode_Sub51_Sub1.aBoolean6223 || !Class384.aBoolean3255)
	    return false;
	if (Class253_Sub3.anInt5675 < 100)
	    return false;
	if (!Node_Sub29.method856(argument_12_, argument, argument_13_,
            19322))
	    return false;
	int anLocalInt = argument_12_ << LightingManager.lightCoordRShift;
	int anLocalInt_15_ = argument << LightingManager.lightCoordRShift;
	int anLocalInt_16_
	    = (Node_Sub31_Sub5.aClass_sArray5858[argument_13_]
		   .method3534(argument_12_, false, argument)
	       - 1);
	int anLocalInt_17_
	    = anLocalInt_16_ + argument_14_.method1781(748449288);
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 1) {
	    if (!Class5.method221(anLocalInt_16_, anLocalInt, anLocalInt_17_,
				  anLocalInt, anLocalInt, anLocalInt_15_, 1,
				  anLocalInt_17_, anLocalInt_15_,
				  Class110.anInt909 + anLocalInt_15_))
		return false;
	    if (!Class5.method221(anLocalInt_16_, anLocalInt, anLocalInt_16_,
				  anLocalInt, anLocalInt, anLocalInt_15_, 1,
				  anLocalInt_17_,
				  anLocalInt_15_ + Class110.anInt909,
				  anLocalInt_15_ + Class110.anInt909))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 2) {
	    if (!Class5.method221(anLocalInt_16_, anLocalInt, anLocalInt_17_,
				  Class110.anInt909 + anLocalInt, anLocalInt,
				  Class110.anInt909 + anLocalInt_15_, 1,
				  anLocalInt_17_,
				  anLocalInt_15_ + Class110.anInt909,
				  Class110.anInt909 + anLocalInt_15_))
		return false;
	    if (!Class5.method221(anLocalInt_16_,
				  anLocalInt + Class110.anInt909,
				  anLocalInt_17_,
				  anLocalInt + Class110.anInt909, anLocalInt,
				  anLocalInt_15_ + Class110.anInt909, 1,
				  anLocalInt_16_,
				  Class110.anInt909 + anLocalInt_15_,
				  anLocalInt_15_ + Class110.anInt909))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 4) {
	    if (!Class5.method221(anLocalInt_16_,
				  anLocalInt + Class110.anInt909,
				  anLocalInt_17_,
				  anLocalInt + Class110.anInt909,
				  Class110.anInt909 + anLocalInt,
				  anLocalInt_15_, 1, anLocalInt_17_,
				  anLocalInt_15_,
				  anLocalInt_15_ + Class110.anInt909))
		return false;
	    if (!Class5.method221(anLocalInt_16_,
				  Class110.anInt909 + anLocalInt,
				  anLocalInt_16_,
				  anLocalInt + Class110.anInt909,
				  Class110.anInt909 + anLocalInt,
				  anLocalInt_15_, 1, anLocalInt_17_,
				  Class110.anInt909 + anLocalInt_15_,
				  Class110.anInt909 + anLocalInt_15_))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 8) {
	    if (!Class5.method221(anLocalInt_16_, anLocalInt, anLocalInt_17_,
				  Class110.anInt909 + anLocalInt, anLocalInt,
				  anLocalInt_15_, 1, anLocalInt_17_,
				  anLocalInt_15_, anLocalInt_15_))
		return false;
	    if (!Class5.method221(anLocalInt_16_,
				  Class110.anInt909 + anLocalInt,
				  anLocalInt_17_,
				  Class110.anInt909 + anLocalInt, anLocalInt,
				  anLocalInt_15_, 1, anLocalInt_16_,
				  anLocalInt_15_, anLocalInt_15_))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 16) {
	    if (!Class53.method483(anLocalInt_16_, anLocalInt_17_,
				   LightingManager.attenuationOffset, LightingManager.attenuationOffset,
				   -7515, LightingManager.attenuationOffset + anLocalInt_15_,
				   anLocalInt))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 32) {
	    if (!Class53.method483(anLocalInt_16_, anLocalInt_17_,
				   LightingManager.attenuationOffset, LightingManager.attenuationOffset,
				   -7515, LightingManager.attenuationOffset + anLocalInt_15_,
				   anLocalInt + LightingManager.attenuationOffset))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 64) {
	    if (!Class53.method483(anLocalInt_16_, anLocalInt_17_,
				   LightingManager.attenuationOffset, LightingManager.attenuationOffset,
				   -7515, anLocalInt_15_,
				   LightingManager.attenuationOffset + anLocalInt))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub3) argument_14_).aShort6419 == 128) {
	    if (!Class53.method483(anLocalInt_16_, anLocalInt_17_,
				   LightingManager.attenuationOffset, LightingManager.attenuationOffset,
				   -7515, anLocalInt_15_, anLocalInt))
		return false;
	    Node_Sub31_Sub2.anInt5847++;
	    return true;
	}
	return true;
    }
    
    static final float[] method1429(int argument, float[] argument_18_,
				    int argument_19_) {
	float[] fs = new float[argument_19_];
	JagStrings.memcpy(argument_18_, 0, fs, 0, argument_19_);
	return fs;
    }
    
    public static void method1430(boolean argument) {
	CombineModeEnum.REPLACE = null;
    }
    
    static {
    }
}
