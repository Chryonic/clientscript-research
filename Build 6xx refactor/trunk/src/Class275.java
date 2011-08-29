/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class275
{
    private GlElementBuffer anGlElementBuffer_2198;
    private GlElementArray aClass12_Sub2_2199;
    private GlToolkit aClass_ha_Sub3_2200;
    boolean aBoolean2201 = true;
    private GlTexture_Sub4 aClass142_Sub4_2202;
    static int[] anIntArray2203 = new int[4096];
    static boolean aBoolean2204 = false;
    private int anInt2205;
    static Object anObject2206;
    private int anInt2207;
    private int anInt2208 = -1;
    private int anInt2209;
    private Class273 aClass273_2210;
    
    static final String method3393(long argument, boolean argument_0_) {
	if (argument <= 0L || argument >= 6582952005840035281L)
	    return null;
	if (argument % 37L == 0L)
	    return null;
	int anLocalInt = 0;
	long l = argument;
	while (l != 0L) {
	    l /= 37L;
	    anLocalInt++;
	}
	StringBuffer stringbuffer = new StringBuffer(anLocalInt);
	while (argument != 0L) {
	    long l_1_ = argument;
	    argument /= 37L;
	    char anLocalChar
		= Class79.aCharArray565[(int) (l_1_ + -(argument * 37L))];
	    if (anLocalChar == '_') {
		int anLocalInt_2_ = stringbuffer.length() - 1;
		anLocalChar = '\u00a0';
		stringbuffer.setCharAt(anLocalInt_2_,
				       (Character.toUpperCase
					(stringbuffer.charAt(anLocalInt_2_))));
	    }
	    stringbuffer.append(anLocalChar);
	}
	stringbuffer.reverse();
	stringbuffer.setCharAt(0,
			       Character.toUpperCase(stringbuffer.charAt(0)));
	return stringbuffer.toString();
    }
    
    final void method3394(int argument_3_) {
	method3398(anGlElementBuffer_2198, anInt2209, 4);
    }
    
    final void method3395(int argument_4_, int argument_5_, int argument_6_,
			  byte[] argument_7_) {
	if (argument_5_ != 28752)
	    aClass12_Sub2_2199 = null;
	aClass12_Sub2_2199.setData(argument_6_ * aClass_ha_Sub3_2200.sizeofPoly(argument_4_), argument_4_, argument_7_);
	method3398(aClass12_Sub2_2199, argument_6_, 4);
    }
    
    public static void method3396(int argument) {
	anObject2206 = null;
	anIntArray2203 = null;
    }
    
    private final void method3397(int argument_8_) {
	if (((Class275) this).aBoolean2201) {
	    ((Class275) this).aBoolean2201 = false;
	    byte[] anLocalInts = ((Class273) aClass273_2210).aByteArray2183;
	    byte[] anLocalInts_9_
		= ((GlToolkit) aClass_ha_Sub3_2200).aByteArray5000;
	    int anLocalInt = 0;
	    int anLocalInt_10_ = ((Class273) aClass273_2210).anInt2182;
	    int anLocalInt_11_
		= (anInt2205 * ((Class273) aClass273_2210).anInt2182
		   + anInt2207);
	    for (int anLocalInt_12_ = -128; anLocalInt_12_ < 0;
		 anLocalInt_12_++) {
		anLocalInt = (anLocalInt << 8) - anLocalInt;
		for (int anLocalInt_13_ = -128; anLocalInt_13_ < 0;
		     anLocalInt_13_++) {
		    if (anLocalInts[anLocalInt_11_++] != 0)
			anLocalInt++;
		}
		anLocalInt_11_ += anLocalInt_10_ - 128;
	    }
	    if (aClass142_Sub4_2202 != null && anInt2208 == anLocalInt)
		((Class275) this).aBoolean2201 = false;
	    else {
		anInt2208 = anLocalInt;
		anLocalInt_11_ = anInt2205 * anLocalInt_10_ + anInt2207;
		int anLocalInt_14_ = 0;
		for (int anLocalInt_15_ = -128; anLocalInt_15_ < 0;
		     anLocalInt_15_++) {
		    for (int anLocalInt_16_ = -128; anLocalInt_16_ < 0;
			 anLocalInt_16_++) {
			if (anLocalInts[anLocalInt_11_] == 0) {
			    int anLocalInt_17_ = 0;
			    if (anLocalInts[anLocalInt_11_ - 1] != 0)
				anLocalInt_17_++;
			    if (anLocalInts[anLocalInt_11_ + 1] != 0)
				anLocalInt_17_++;
			    if (anLocalInts[anLocalInt_11_ - anLocalInt_10_]
				!= 0)
				anLocalInt_17_++;
			    if (anLocalInts[anLocalInt_11_ + anLocalInt_10_]
				!= 0)
				anLocalInt_17_++;
			    anLocalInts_9_[anLocalInt_14_++]
				= (byte) (anLocalInt_17_ * 17);
			} else
			    anLocalInts_9_[anLocalInt_14_++] = (byte) 68;
			anLocalInt_11_++;
		    }
		    anLocalInt_11_
			+= ((Class273) aClass273_2210).anInt2182 - 128;
		}
		if (argument_8_ < 93)
		    method3393(-13L, true);
		if (aClass142_Sub4_2202 != null)
		    aClass142_Sub4_2202.method2501(128, 0, false, 126, 128,
						   (((GlToolkit)
						     aClass_ha_Sub3_2200)
						    .aByteArray5000),
						   6406, 0, 0, 0);
		else {
		    aClass142_Sub4_2202
			= new GlTexture_Sub4(aClass_ha_Sub3_2200, 3553, 6406,
					    128, 128, false,
					    (((GlToolkit)
					      aClass_ha_Sub3_2200)
					     .aByteArray5000),
					    6406, false);
		    aClass142_Sub4_2202.setWrappingMode(false, false);
		    aClass142_Sub4_2202.setLinearMagnification(true);
		}
	    }
	}
    }
    
    private final void method3398(GlElementBuffer argument_18_, int argument_19_,
				  int argument_20_) {
	if (argument_19_ != 0) {
	    method3397(101);
	    aClass_ha_Sub3_2200.bindTexture(aClass142_Sub4_2202);
	    aClass_ha_Sub3_2200.drawElements(argument_18_, argument_19_, argument_20_, 0);
	}
    }
    
    Class275(GlToolkit argument_21_, Class273 argument_22_,
	     Class_s_Sub2 argument_23_, int argument_24_, int argument_25_,
	     int argument_26_, int argument_27_, int argument_28_) {
	aClass273_2210 = argument_22_;
	aClass_ha_Sub3_2200 = argument_21_;
	anInt2205 = argument_28_;
	anInt2207 = argument_27_;
	int anLocalInt = 1 << argument_26_;
	int anLocalInt_29_ = 0;
	int anLocalInt_30_ = argument_24_ << argument_26_;
	int anLocalInt_31_ = argument_25_ << argument_26_;
	for (int anLocalInt_32_ = 0; anLocalInt > anLocalInt_32_;
	     anLocalInt_32_++) {
	    int anLocalInt_33_
		= (anLocalInt_30_
		   + ((Class_s) argument_23_).anInt2550 * (anLocalInt_31_
							   + anLocalInt_32_));
	    for (int anLocalInt_34_ = 0; anLocalInt > anLocalInt_34_;
		 anLocalInt_34_++) {
		short[] anLocalInts
		    = (((Class_s_Sub2) argument_23_).aShortArrayArray5351
		       [anLocalInt_33_++]);
		if (anLocalInts != null)
		    anLocalInt_29_ += anLocalInts.length;
	    }
	}
	anInt2209 = anLocalInt_29_;
	if (anLocalInt_29_ > 0) {
	    Packet class59_sub28
		= new Packet(anLocalInt_29_ * 2);
	    if (((GlToolkit) aClass_ha_Sub3_2200).isBigEndian) {
		for (int anLocalInt_35_ = 0; anLocalInt > anLocalInt_35_;
		     anLocalInt_35_++) {
		    int anLocalInt_36_
			= (anLocalInt_30_
			   + (((Class_s) argument_23_).anInt2550
			      * (anLocalInt_31_ + anLocalInt_35_)));
		    for (int anLocalInt_37_ = 0; anLocalInt_37_ < anLocalInt;
			 anLocalInt_37_++) {
			short[] anLocalInts
			    = (((Class_s_Sub2) argument_23_)
			       .aShortArrayArray5351[anLocalInt_36_++]);
			if (anLocalInts != null) {
			    for (int anLocalInt_38_ = 0;
				 anLocalInt_38_ < anLocalInts.length;
				 anLocalInt_38_++)
				class59_sub28.p2(
                        ((anLocalInts
                                [anLocalInt_38_])
                                & 0xffff));
			}
		    }
		}
	    } else {
		for (int anLocalInt_39_ = 0; anLocalInt_39_ < anLocalInt;
		     anLocalInt_39_++) {
		    int anLocalInt_40_
			= (anLocalInt_30_
			   + ((anLocalInt_39_ + anLocalInt_31_)
			      * ((Class_s) argument_23_).anInt2550));
		    for (int anLocalInt_41_ = 0; anLocalInt > anLocalInt_41_;
			 anLocalInt_41_++) {
			short[] anLocalInts
			    = (((Class_s_Sub2) argument_23_)
			       .aShortArrayArray5351[anLocalInt_40_++]);
			if (anLocalInts != null) {
			    for (int anLocalInt_42_ = 0;
				 anLocalInt_42_ < anLocalInts.length;
				 anLocalInt_42_++)
				class59_sub28.p2i(
                        ((anLocalInts
                                [anLocalInt_42_])
                                & 0xffff));
			}
		    }
		}
	    }
	    anGlElementBuffer_2198
		= (aClass_ha_Sub3_2200.method2290
		   (((Packet) class59_sub28).pos, false, 5123,
		    false, ((Packet) class59_sub28).data));
	    aClass12_Sub2_2199
		= new GlElementArray(aClass_ha_Sub3_2200, 5123, null, 1);
	} else
	    aClass142_Sub4_2202 = null;
    }
}
