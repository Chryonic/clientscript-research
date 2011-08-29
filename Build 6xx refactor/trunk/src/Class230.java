/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class230
{
    private int[] anIntArray1661;
    private int anInt1662;
    private int[] anIntArray1663 = new int[8191];
    private Interface4_Impl2 anInterface4_Impl2_1664;
    private DoublyLinkedNodeP2_Sub4_Sub1[][] aClass104_Sub4_Sub1ArrayArray1665;
    private Interface4_Impl2 anInterface4_Impl2_1666;
    private Class222 aClass222_1667;
    private Interface4_Impl1 anInterface4_Impl1_1668;
    private DoublyLinkedNodeP2_Sub4_Sub1[][] aClass104_Sub4_Sub1ArrayArray1669;
    private int[] anIntArray1670;
    
    static final boolean method3070(boolean argument, int argument_0_) {
	if (argument_0_ != 10 && argument_0_ != 11 && argument_0_ != 12)
	    return false;
	return true;
    }
    
    final void method3071(int argument_1_) {
	anInterface4_Impl2_1664.method44(487);
    }
    
    private final void method3072(int argument_2_, GraphicsToolkit_Sub2 argument_3_,
				  int argument_4_) {
	GlImageSkybox.aFloat827 = ((GraphicsToolkit_Sub2) argument_3_).ambientModelIntensity;
	argument_3_.method2124((float) argument_4_, (byte) 92);
	argument_3_.method2226(argument_2_ ^ ~0x40);
	argument_3_.method2194(false, argument_2_);
	argument_3_.method2212((byte) -20, false);
	argument_3_.method2166();
	if (argument_2_ != 64)
	    method3078(null, (byte) -5);
    }
    
    static final boolean method3073(String argument, int argument_5_) {
	return Statics.method1106(argument, -91, 10, true);
    }
    
    final void method3074(int argument_6_, Class72 argument_7_,
			  GraphicsToolkit_Sub2 argument_8_, byte argument_9_) {
	if (((GraphicsToolkit_Sub2) argument_8_).aClass350_Sub2_4696 != null) {
	    if (argument_6_ >= 0)
		method3072(64, argument_8_, argument_6_);
	    else
		method3077((byte) -106, argument_8_);
	    float f = (((Class350_Sub2)
			((GraphicsToolkit_Sub2) argument_8_).aClass350_Sub2_4696)
		       .aFloat5445);
	    float f_10_ = (((Class350_Sub2)
			    ((GraphicsToolkit_Sub2) argument_8_).aClass350_Sub2_4696)
			   .aFloat5448);
	    float f_11_ = (((Class350_Sub2)
			    ((GraphicsToolkit_Sub2) argument_8_).aClass350_Sub2_4696)
			   .aFloat5444);
	    float f_12_ = (((Class350_Sub2)
			    ((GraphicsToolkit_Sub2) argument_8_).aClass350_Sub2_4696)
			   .aFloat5443);
	    try {
		int anLocalInt = 0;
		int anLocalInt_13_ = 2147483647;
		int anLocalInt_14_ = 0;
		DoublyLinkedNodeP2_Sub4 class104_sub4
		    = (((Class119) ((Class72) argument_7_).aClass119_497)
		       .aClass104_Sub4_971);
		for (DoublyLinkedNodeP2_Sub4 class104_sub4_15_
			 = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
		     class104_sub4_15_ != class104_sub4;
		     class104_sub4_15_ = (((DoublyLinkedNodeP2_Sub4) class104_sub4_15_)
					  .aClass104_Sub4_4526)) {
		    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
			= (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_15_;
		    int anLocalInt_16_
			= (int) (f_10_ * (float) ((((DoublyLinkedNodeP2_Sub4_Sub1)
						    class104_sub4_sub1)
						   .anInt6430)
						  >> 12)
				 + (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					     class104_sub4_sub1).anInt6435
					    >> 12) * f
				 + f_11_ * (float) ((((DoublyLinkedNodeP2_Sub4_Sub1)
						      class104_sub4_sub1)
						     .anInt6432)
						    >> 12)
				 + f_12_);
		    anIntArray1663[anLocalInt++] = anLocalInt_16_;
		    if (anLocalInt_16_ > anLocalInt_14_)
			anLocalInt_14_ = anLocalInt_16_;
		    if (anLocalInt_16_ < anLocalInt_13_)
			anLocalInt_13_ = anLocalInt_16_;
		}
		int anLocalInt_17_ = anLocalInt_14_ - anLocalInt_13_;
		int anLocalInt_18_;
		if (anLocalInt_17_ + 2 > 1600) {
		    anLocalInt_18_
			= (DoublyLinkedNode_Sub51_Sub13.method1258(9761, anLocalInt_17_)
			   + 1 - Statics.anInt5744);
		    anLocalInt_17_ = (anLocalInt_17_ >> anLocalInt_18_) + 2;
		} else {
		    anLocalInt_18_ = 0;
		    anLocalInt_17_ += 2;
		}
		DoublyLinkedNodeP2_Sub4 class104_sub4_19_
		    = ((DoublyLinkedNodeP2_Sub4) class104_sub4).aClass104_Sub4_4526;
		anLocalInt = 0;
		int anLocalInt_20_ = -2;
		boolean anLocalBoolean = true;
		boolean anLocalBoolean_21_ = true;
		while (class104_sub4 != class104_sub4_19_) {
		    anInt1662 = 0;
		    for (int anLocalInt_22_ = 0;
			 anLocalInt_22_ < anLocalInt_17_; anLocalInt_22_++)
			anIntArray1661[anLocalInt_22_] = 0;
		    for (int anLocalInt_23_ = 0; anLocalInt_23_ < 64;
			 anLocalInt_23_++)
			anIntArray1670[anLocalInt_23_] = 0;
		    for (/**/; class104_sub4 != class104_sub4_19_;
			 class104_sub4_19_
			     = (((DoublyLinkedNodeP2_Sub4) class104_sub4_19_)
				.aClass104_Sub4_4526)) {
			DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
			    = (DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_19_;
			if (anLocalBoolean_21_) {
			    anLocalBoolean
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .aBoolean6440);
			    anLocalInt_20_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6438);
			    anLocalBoolean_21_ = false;
			}
			if (anLocalInt > 0
			    && ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				 .anInt6438) != anLocalInt_20_
				|| (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				    .aBoolean6440) == !anLocalBoolean)) {
			    anLocalBoolean_21_ = true;
			    break;
			}
			int anLocalInt_24_
			    = (anIntArray1663[anLocalInt++] - anLocalInt_13_
			       >> anLocalInt_18_);
			if (anLocalInt_24_ < 1600) {
			    if (anIntArray1661[anLocalInt_24_] >= 64) {
				if (anIntArray1661[anLocalInt_24_] == 64) {
				    if (anInt1662 == 64)
					continue;
				    anIntArray1661[anLocalInt_24_]
					+= anInt1662++ + 1;
				}
				aClass104_Sub4_Sub1ArrayArray1665
				    [anIntArray1661[anLocalInt_24_] - 64 - 1]
				    [anIntArray1670[(anIntArray1661
						     [anLocalInt_24_]) - 65]++]
				    = class104_sub4_sub1;
			    } else
				aClass104_Sub4_Sub1ArrayArray1669
				    [anLocalInt_24_]
				    [anIntArray1661[anLocalInt_24_]++]
				    = class104_sub4_sub1;
			}
		    }
		    argument_8_.method2215(false,
					   (anLocalInt_20_ >= 0
					    ? anLocalInt_20_ : -1),
					   false, (byte) -112);
		    if (anLocalBoolean
			&& (GlImageSkybox.aFloat827
			    != ((GraphicsToolkit_Sub2) argument_8_).ambientModelIntensity))
			argument_8_.setAmbientIntensity(GlImageSkybox.aFloat827);
		    else if (((GraphicsToolkit_Sub2) argument_8_).ambientModelIntensity != 1.0F)
			argument_8_.setAmbientIntensity(1.0F);
		    method3076(true, argument_8_, anLocalInt_17_);
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    method3078(argument_8_, (byte) 55);
	}
    }
    
    final void method3075(GraphicsToolkit_Sub2 argument_25_, int argument_26_) {
	anInterface4_Impl2_1664.method52(786336, 24, -10760);
    }
    
    private final void method3076
	(boolean argument_27_, GraphicsToolkit_Sub2 argument_28_, int argument_29_) {
	int anLocalInt = 0;
	Class350_Sub2 class350_sub2 = argument_28_.method2138(-1690);
	float f = ((Class350_Sub2) class350_sub2).v0;
	float f_30_ = ((Class350_Sub2) class350_sub2).v1;
	float f_31_ = ((Class350_Sub2) class350_sub2).v2;
	float f_32_ = ((Class350_Sub2) class350_sub2).v4;
	float f_33_ = ((Class350_Sub2) class350_sub2).v5;
	float f_34_ = ((Class350_Sub2) class350_sub2).v6;
	float f_35_ = f_32_ + f;
	float f_36_ = f_30_ + f_33_;
	float f_37_ = f_34_ + f_31_;
	float f_38_ = -f_32_ + f;
	float f_39_ = -f_33_ + f_30_;
	float f_40_ = -f_34_ + f_31_;
	float f_41_ = -f + f_32_;
	float f_42_ = -f_30_ + f_33_;
	float f_43_ = f_34_ - f_31_;
	Buffer buffer
	    = anInterface4_Impl2_1664.method50(true, argument_27_);
	if (buffer != null) {
	    Stream stream = argument_28_.method2116(9, buffer);
	    if (Stream.isBigEndian()) {
		for (int anLocalInt_44_ = argument_29_ - 1;
		     anLocalInt_44_ >= 0; anLocalInt_44_--) {
		    int anLocalInt_45_
			= (anIntArray1661[anLocalInt_44_] > 64 ? 64
			   : anIntArray1661[anLocalInt_44_]);
		    if (anLocalInt_45_ > 0) {
			for (int anLocalInt_46_ = anLocalInt_45_ - 1;
			     anLocalInt_46_ >= 0; anLocalInt_46_--) {
			    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				= (aClass104_Sub4_Sub1ArrayArray1669
				   [anLocalInt_44_][anLocalInt_46_]);
			    int anLocalInt_47_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6439);
			    byte anLocalInt_48_
				= (byte) (anLocalInt_47_ >> 16);
			    byte anLocalInt_49_ = (byte) (anLocalInt_47_ >> 8);
			    byte anLocalInt_50_ = (byte) anLocalInt_47_;
			    byte anLocalInt_51_
				= (byte) (anLocalInt_47_ >>> 24);
			    float f_52_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6435
					   >> 12);
			    float f_53_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6430
					   >> 12);
			    float f_54_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6432
					   >> 12);
			    int anLocalInt_55_
				= ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				    .anInt6431)
				   >> 12);
			    stream.writeFloatBE(f_52_ + ((float) -anLocalInt_55_ * f_35_));
			    stream.writeFloatBE(f_53_ + ((float) -anLocalInt_55_ * f_36_));
			    stream.writeFloatBE(f_54_ + (f_37_ * (float) -anLocalInt_55_));
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    else
				stream.writeRGBA(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    stream.writeFloatBE(0.0F);
			    stream.writeFloatBE(0.0F);
			    stream.writeFloatBE(f_38_ * (float) anLocalInt_55_ + f_52_);
			    stream.writeFloatBE(f_53_ + (f_39_ * (float) anLocalInt_55_));
			    stream.writeFloatBE(f_54_ + ((float) anLocalInt_55_ * f_40_));
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    else
				stream.writeRGBA(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    stream.writeFloatBE(1.0F);
			    stream.writeFloatBE(0.0F);
			    stream.writeFloatBE((float) anLocalInt_55_ * f_35_ + f_52_);
			    stream.writeFloatBE(f_53_ + (f_36_ * (float) anLocalInt_55_));
			    stream.writeFloatBE(f_54_ + ((float) anLocalInt_55_ * f_37_));
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 == 0)
				stream.writeRGBA(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    else
				stream.write4Bytes(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    stream.writeFloatBE(1.0F);
			    stream.writeFloatBE(1.0F);
			    stream.writeFloatBE(f_52_ + ((float) anLocalInt_55_ * f_41_));
			    stream.writeFloatBE(f_53_ + (f_42_ * (float) anLocalInt_55_));
			    stream.writeFloatBE((float) anLocalInt_55_ * f_43_ + f_54_);
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    else
				stream.writeRGBA(anLocalInt_48_, anLocalInt_49_, anLocalInt_50_, anLocalInt_51_);
			    stream.writeFloatBE(0.0F);
			    stream.writeFloatBE(1.0F);
			    anLocalInt++;
			}
			if (anIntArray1661[anLocalInt_44_] > 64) {
			    int anLocalInt_56_
				= anIntArray1661[anLocalInt_44_] - 64 - 1;
			    for (int anLocalInt_57_
				     = anIntArray1670[anLocalInt_56_] - 1;
				 anLocalInt_57_ >= 0; anLocalInt_57_--) {
				DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				    = (aClass104_Sub4_Sub1ArrayArray1665
				       [anLocalInt_56_][anLocalInt_57_]);
				int anLocalInt_58_ = (((DoublyLinkedNodeP2_Sub4_Sub1)
						       class104_sub4_sub1)
						      .anInt6439);
				byte anLocalInt_59_
				    = (byte) (anLocalInt_58_ >> 16);
				byte anLocalInt_60_
				    = (byte) (anLocalInt_58_ >> 8);
				byte anLocalInt_61_ = (byte) anLocalInt_58_;
				byte anLocalInt_62_
				    = (byte) (anLocalInt_58_ >>> 24);
				float f_63_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6435
					       >> 12);
				float f_64_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6430
					       >> 12);
				float f_65_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6432
					       >> 12);
				int anLocalInt_66_
				    = (((DoublyLinkedNodeP2_Sub4_Sub1)
					class104_sub4_sub1).anInt6431
				       >> 12);
				stream.writeFloatBE(f_63_ + f_35_ * (float) -anLocalInt_66_);
				stream.writeFloatBE((f_36_ * (float) -anLocalInt_66_) + f_64_);
				stream.writeFloatBE(((float) -anLocalInt_66_ * f_37_) + f_65_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    != 0)
				    stream.write4Bytes(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				else
				    stream.writeRGBA(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				stream.writeFloatBE(0.0F);
				stream.writeFloatBE(0.0F);
				stream.writeFloatBE(f_63_ + f_38_ * (float) anLocalInt_66_);
				stream.writeFloatBE((f_39_ * (float) anLocalInt_66_) + f_64_);
				stream.writeFloatBE(f_65_ + f_40_ * (float) anLocalInt_66_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    == 0)
				    stream.writeRGBA(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				else
				    stream.write4Bytes(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				stream.writeFloatBE(1.0F);
				stream.writeFloatBE(0.0F);
				stream.writeFloatBE(f_63_ + ((float) anLocalInt_66_ * f_35_));
				stream.writeFloatBE((f_36_ * (float) anLocalInt_66_) + f_64_);
				stream.writeFloatBE(f_65_ + ((float) anLocalInt_66_ * f_37_));
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    != 0)
				    stream.write4Bytes(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				else
				    stream.writeRGBA(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				stream.writeFloatBE(1.0F);
				stream.writeFloatBE(1.0F);
				stream.writeFloatBE(f_63_ + f_41_ * (float) anLocalInt_66_);
				stream.writeFloatBE(f_64_ + f_42_ * (float) anLocalInt_66_);
				stream.writeFloatBE(f_65_ + f_43_ * (float) anLocalInt_66_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    == 0)
				    stream.writeRGBA(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				else
				    stream.write4Bytes(anLocalInt_59_, anLocalInt_60_, anLocalInt_61_, anLocalInt_62_);
				stream.writeFloatBE(0.0F);
				anLocalInt++;
				stream.writeFloatBE(1.0F);
			    }
			}
		    }
		}
	    } else {
		for (int anLocalInt_67_ = argument_29_ - 1;
		     anLocalInt_67_ >= 0; anLocalInt_67_--) {
		    int anLocalInt_68_
			= (anIntArray1661[anLocalInt_67_] <= 64
			   ? anIntArray1661[anLocalInt_67_] : 64);
		    if (anLocalInt_68_ > 0) {
			for (int anLocalInt_69_ = anLocalInt_68_ - 1;
			     anLocalInt_69_ >= 0; anLocalInt_69_--) {
			    DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				= (aClass104_Sub4_Sub1ArrayArray1669
				   [anLocalInt_67_][anLocalInt_69_]);
			    int anLocalInt_70_
				= (((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				   .anInt6439);
			    byte anLocalInt_71_
				= (byte) (anLocalInt_70_ >> 16);
			    byte anLocalInt_72_ = (byte) (anLocalInt_70_ >> 8);
			    byte anLocalInt_73_ = (byte) anLocalInt_70_;
			    byte anLocalInt_74_
				= (byte) (anLocalInt_70_ >>> 24);
			    float f_75_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6435
					   >> 12);
			    float f_76_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6430
					   >> 12);
			    float f_77_
				= (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
					    class104_sub4_sub1).anInt6432
					   >> 12);
			    int anLocalInt_78_
				= ((((DoublyLinkedNodeP2_Sub4_Sub1) class104_sub4_sub1)
				    .anInt6431)
				   >> 12);
			    stream.writeFloatLE(f_35_ * (float) -anLocalInt_78_ + f_75_);
			    stream.writeFloatLE((float) -anLocalInt_78_ * f_36_ + f_76_);
			    stream.writeFloatLE(f_37_ * (float) -anLocalInt_78_ + f_77_);
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    else
				stream.writeRGBA(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    stream.writeFloatLE(0.0F);
			    stream.writeFloatLE(0.0F);
			    stream.writeFloatLE(f_75_ + (f_38_ * (float) anLocalInt_78_));
			    stream.writeFloatLE(f_76_ + ((float) anLocalInt_78_ * f_39_));
			    stream.writeFloatLE((float) anLocalInt_78_ * f_40_ + f_77_);
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 == 0)
				stream.writeRGBA(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    else
				stream.write4Bytes(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    stream.writeFloatLE(1.0F);
			    stream.writeFloatLE(0.0F);
			    stream.writeFloatLE(f_35_ * (float) anLocalInt_78_ + f_75_);
			    stream.writeFloatLE(f_76_ + ((float) anLocalInt_78_ * f_36_));
			    stream.writeFloatLE((float) anLocalInt_78_ * f_37_ + f_77_);
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    else
				stream.writeRGBA(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    stream.writeFloatLE(1.0F);
			    stream.writeFloatLE(1.0F);
			    stream.writeFloatLE((float) anLocalInt_78_ * f_41_ + f_75_);
			    stream.writeFloatLE(f_76_ + ((float) anLocalInt_78_ * f_42_));
			    stream.writeFloatLE(f_77_ + (f_43_ * (float) anLocalInt_78_));
			    if (((GraphicsToolkit_Sub2) argument_28_).anInt4774 != 0)
				stream.write4Bytes(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    else
				stream.writeRGBA(anLocalInt_71_, anLocalInt_72_, anLocalInt_73_, anLocalInt_74_);
			    stream.writeFloatLE(0.0F);
			    anLocalInt++;
			    stream.writeFloatLE(1.0F);
			}
			if (anIntArray1661[anLocalInt_67_] > 64) {
			    int anLocalInt_79_
				= anIntArray1661[anLocalInt_67_] - 65;
			    for (int anLocalInt_80_
				     = anIntArray1670[anLocalInt_79_] - 1;
				 anLocalInt_80_ >= 0; anLocalInt_80_--) {
				DoublyLinkedNodeP2_Sub4_Sub1 class104_sub4_sub1
				    = (aClass104_Sub4_Sub1ArrayArray1665
				       [anLocalInt_79_][anLocalInt_80_]);
				int anLocalInt_81_ = (((DoublyLinkedNodeP2_Sub4_Sub1)
						       class104_sub4_sub1)
						      .anInt6439);
				byte anLocalInt_82_
				    = (byte) (anLocalInt_81_ >> 16);
				byte anLocalInt_83_
				    = (byte) (anLocalInt_81_ >> 8);
				byte anLocalInt_84_ = (byte) anLocalInt_81_;
				byte anLocalInt_85_
				    = (byte) (anLocalInt_81_ >>> 24);
				float f_86_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6435
					       >> 12);
				float f_87_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6430
					       >> 12);
				float f_88_
				    = (float) (((DoublyLinkedNodeP2_Sub4_Sub1)
						class104_sub4_sub1).anInt6432
					       >> 12);
				int anLocalInt_89_
				    = (((DoublyLinkedNodeP2_Sub4_Sub1)
					class104_sub4_sub1).anInt6431
				       >> 12);
				stream.writeFloatLE(((float) -anLocalInt_89_ * f_35_) + f_86_);
				stream.writeFloatLE(((float) -anLocalInt_89_ * f_36_) + f_87_);
				stream.writeFloatLE(((float) -anLocalInt_89_ * f_37_) + f_88_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    != 0)
				    stream.write4Bytes(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				else
				    stream.writeRGBA(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				stream.writeFloatLE(0.0F);
				stream.writeFloatLE(0.0F);
				stream.writeFloatLE(f_86_ + ((float) anLocalInt_89_ * f_38_));
				stream.writeFloatLE(f_87_ + f_39_ * (float) anLocalInt_89_);
				stream.writeFloatLE(f_88_ + f_40_ * (float) anLocalInt_89_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    == 0)
				    stream.writeRGBA(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				else
				    stream.write4Bytes(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				stream.writeFloatLE(1.0F);
				stream.writeFloatLE(0.0F);
				stream.writeFloatLE(f_86_ + ((float) anLocalInt_89_ * f_35_));
				stream.writeFloatLE(f_87_ + ((float) anLocalInt_89_ * f_36_));
				stream.writeFloatLE(f_88_ + ((float) anLocalInt_89_ * f_37_));
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    != 0)
				    stream.write4Bytes(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				else
				    stream.writeRGBA(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				stream.writeFloatLE(1.0F);
				stream.writeFloatLE(1.0F);
				stream.writeFloatLE(f_86_ + ((float) anLocalInt_89_ * f_41_));
				stream.writeFloatLE(f_87_ + f_42_ * (float) anLocalInt_89_);
				stream.writeFloatLE(f_88_ + f_43_ * (float) anLocalInt_89_);
				if (((GraphicsToolkit_Sub2) argument_28_).anInt4774
				    == 0)
				    stream.writeRGBA(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				else
				    stream.write4Bytes(anLocalInt_82_, anLocalInt_83_, anLocalInt_84_, anLocalInt_85_);
				stream.writeFloatLE(0.0F);
				stream.writeFloatLE(1.0F);
				anLocalInt++;
			    }
			}
		    }
		}
	    }
	    stream.upload();
	    if (anInterface4_Impl2_1664.method53(10925)) {
		argument_28_.method2130(anInterface4_Impl2_1664, 0, 60);
		argument_28_.method2130(anInterface4_Impl2_1666, 1, -90);
		argument_28_.method2179(aClass222_1667, (byte) -63);
		argument_28_.method2131(anLocalInt * 2, 0,
					anInterface4_Impl1_1668, 0,
					anLocalInt * 4, argument_27_,
					Class232.aClass390_1684);
	    }
	}
    }
    
    private final void method3077(byte argument_90_,
				  GraphicsToolkit_Sub2 argument_91_) {
	int anLocalInt = -69 % ((-44 - argument_90_) / 58);
	GlImageSkybox.aFloat827 = ((GraphicsToolkit_Sub2) argument_91_).ambientModelIntensity;
	argument_91_.method2200(true);
	argument_91_.method2194(false, 64);
	argument_91_.method2212((byte) 124, false);
	argument_91_.method2166();
    }
    
    private final void method3078(GraphicsToolkit_Sub2 argument_92_,
				  byte argument_93_) {
	argument_92_.method2212((byte) 122, true);
	argument_92_.method2194(true, 64);
	if (GlImageSkybox.aFloat827 != ((GraphicsToolkit_Sub2) argument_92_).ambientModelIntensity)
	    argument_92_.setAmbientIntensity(GlImageSkybox.aFloat827);
	if (argument_93_ != 55)
	    anIntArray1661 = null;
    }
    
    Class230(GraphicsToolkit_Sub2 argument_94_) {
	anIntArray1661 = new int[1600];
	aClass104_Sub4_Sub1ArrayArray1669 = new DoublyLinkedNodeP2_Sub4_Sub1[1600][64];
	anIntArray1670 = new int[64];
	anInt1662 = 0;
	aClass104_Sub4_Sub1ArrayArray1665 = new DoublyLinkedNodeP2_Sub4_Sub1[64][768];
	aClass222_1667
	    = argument_94_.method2134((new Class289[]
				       { new Class289(new InterleavedArrayElementEnum[]
						      { InterleavedArrayElementEnum.VERTEX_POINTER,
							InterleavedArrayElementEnum.COLOUR_POINTER,
							(InterleavedArrayElementEnum
							 .TEXCOORD_2D_POINTER) }),
					 new Class289(InterleavedArrayElementEnum
						      .NORMAL_POINTER) }),
				      (byte) -21);
	anInterface4_Impl2_1664 = argument_94_.method2248(0, true);
	anInterface4_Impl2_1666 = argument_94_.method2248(0, false);
	anInterface4_Impl2_1666.method52(393168, 12, -10760);
	anInterface4_Impl1_1668 = argument_94_.method2142(-1, false);
	anInterface4_Impl1_1668.method45(49146, (byte) -73);
	Buffer buffer = anInterface4_Impl1_1668.method43(true, 3754);
	if (buffer != null) {
	    Stream stream = argument_94_.method2116(9, buffer);
	    if (!Stream.isBigEndian()) {
		for (int anLocalInt = 0; anLocalInt < 8191; anLocalInt++) {
		    int anLocalInt_95_ = anLocalInt * 4;
		    stream.writeShortLE(anLocalInt_95_);
		    stream.writeShortLE(anLocalInt_95_ + 1);
		    stream.writeShortLE(anLocalInt_95_ + 2);
		    stream.writeShortLE(anLocalInt_95_ + 2);
		    stream.writeShortLE(anLocalInt_95_ + 3);
		    stream.writeShortLE(anLocalInt_95_);
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < 8191; anLocalInt++) {
		    int anLocalInt_96_ = anLocalInt * 4;
		    stream.writeShortBE(anLocalInt_96_);
		    stream.writeShortBE(anLocalInt_96_ + 1);
		    stream.writeShortBE(anLocalInt_96_ + 2);
		    stream.writeShortBE(anLocalInt_96_ + 2);
		    stream.writeShortBE(anLocalInt_96_ + 3);
		    stream.writeShortBE(anLocalInt_96_);
		}
	    }
	    stream.upload();
	    anInterface4_Impl1_1668.method41(26937);
	}
	Buffer buffer_97_
	    = anInterface4_Impl2_1666.method50(true, true);
	if (buffer_97_ != null) {
	    Stream stream = argument_94_.method2116(9, buffer_97_);
	    if (Stream.isBigEndian()) {
		for (int anLocalInt = 0; anLocalInt < 8191; anLocalInt++) {
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(-1.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(-1.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(-1.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(0.0F);
		    stream.writeFloatBE(-1.0F);
		    stream.writeFloatBE(0.0F);
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < 8191; anLocalInt++) {
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(-1.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(-1.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(-1.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(0.0F);
		    stream.writeFloatLE(-1.0F);
		    stream.writeFloatLE(0.0F);
		}
	    }
	    stream.upload();
	    anInterface4_Impl2_1666.method53(10925);
	}
    }
}
