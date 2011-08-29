/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;

final class Class123
{
    private Interface4_Impl1 anInterface4_Impl1_987;
    private int anInt988;
    private int anInt989;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_990;
    private Interface7_Impl2 anInterface7_Impl2_991;
    private int anInt992;
    static Class166 aClass166_993 = new Class166(107, 4);
    private int anInt994 = -1;
    private Class232 aClass232_995;
    boolean aBoolean996 = true;
    private int anInt997;
    static int[] anIntArray998;
    int anInt999;
    static Class217 aClass217_1000 = new Class217(15, 0, 1, 0);
    static float aFloat1001;
    static int anInt1002 = 0;
    
    static final void method2392(int argument, RsInterface argument_0_,
				 int argument_1_, int argument_2_) {
	if (argument_0_ != null) {
	    if (((RsInterface) argument_0_).anObjectArray1815 != null) {
		Cs2Trigger class59_sub27 = new Cs2Trigger();
		((Cs2Trigger) class59_sub27).aRsInterface_4115 = argument_0_;
		((Cs2Trigger) class59_sub27).parameters
		    = ((RsInterface) argument_0_).anObjectArray1815;
		Cs2Runtime.executeTrigger(class59_sub27);
	    }
	    Statics.anInt1181 = ((RsInterface) argument_0_).subId;
	    Class297.anInt2472 = ((RsInterface) argument_0_).idHash;
	    Node_Sub31_Sub4.anInt5855 = argument_2_;
	    Statics.anInt4519 = ((RsInterface) argument_0_).anInt1870;
	    Class178.anInt1311 = argument;
	    Class353.aBoolean2953 = true;
	    Class262.anInt2040 = ((RsInterface) argument_0_).anInt1889;
	    Class62_Sub10.anInt4399 = ((RsInterface) argument_0_).anInt1897;
	    Class256.method3280(argument_0_, true);
	}
    }
    
    private final void method2393(int argument_3_) {
	if (((Class123) this).aBoolean996) {
	    ((Class123) this).aBoolean996 = false;
	    byte[] anLocalInts = ((Class232) aClass232_995).aByteArray1691;
	    int anLocalInt = 0;
	    int anLocalInt_4_ = ((Class232) aClass232_995).anInt1689;
	    int anLocalInt_5_
		= ((Class232) aClass232_995).anInt1689 * anInt992 + anInt997;
	    for (int anLocalInt_6_ = -128; anLocalInt_6_ < 0;
		 anLocalInt_6_++) {
		anLocalInt = -anLocalInt + (anLocalInt << 8);
		for (int anLocalInt_7_ = -128; anLocalInt_7_ < 0;
		     anLocalInt_7_++) {
		    if (anLocalInts[anLocalInt_5_++] != 0)
			anLocalInt++;
		}
		anLocalInt_5_ += anLocalInt_4_ - 128;
	    }
	    if (anInterface7_Impl2_991 != null && anInt994 == anLocalInt)
		((Class123) this).aBoolean996 = false;
	    else {
		anInt994 = anLocalInt;
		anLocalInt_5_ = anInt997 + anInt992 * anLocalInt_4_;
		int anLocalInt_8_ = 0;
		if (argument_3_ == 128) {
		    if (!aClass_ha_Sub2_990.method2132((Node_Sub31_Sub23
							.aClass320_5942),
						       -2,
						       (DataType
							.BYTE))) {
			if (Class269.anIntArray2149 == null)
			    Class269.anIntArray2149 = new int[16384];
			int[] anLocalInts_9_ = Class269.anIntArray2149;
			for (int anLocalInt_10_ = -128; anLocalInt_10_ < 0;
			     anLocalInt_10_++) {
			    for (int anLocalInt_11_ = -128; anLocalInt_11_ < 0;
				 anLocalInt_11_++) {
				if (anLocalInts[anLocalInt_5_] == 0) {
				    int anLocalInt_12_ = 0;
				    if (anLocalInts[anLocalInt_5_ - 1] != 0)
					anLocalInt_12_++;
				    if (anLocalInts[anLocalInt_5_ + 1] != 0)
					anLocalInt_12_++;
				    if ((anLocalInts
					 [-anLocalInt_4_ + anLocalInt_5_])
					!= 0)
					anLocalInt_12_++;
				    if ((anLocalInts
					 [anLocalInt_5_ + anLocalInt_4_])
					!= 0)
					anLocalInt_12_++;
				    anLocalInts_9_[anLocalInt_8_++]
					= anLocalInt_12_ * 17 << 24;
				} else
				    anLocalInts_9_[anLocalInt_8_++]
					= 1140850688;
				anLocalInt_5_++;
			    }
			    anLocalInt_5_
				+= ((Class232) aClass232_995).anInt1689 - 128;
			}
			if (anInterface7_Impl2_991 != null)
			    anInterface7_Impl2_991.method15(0, (byte) 113, 128,
							    (Class269
							     .anIntArray2149),
							    128, 128, 0, 0);
			else {
			    anInterface7_Impl2_991
				= (aClass_ha_Sub2_990.method2233
				   ((byte) -116, 128, 128, false,
				    Class269.anIntArray2149));
			    anInterface7_Impl2_991.method19(false, false,
							    30135);
			}
		    } else {
			if (DoublyLinkedNode_Sub51_Sub12.aByteArray6287 == null)
			    DoublyLinkedNode_Sub51_Sub12.aByteArray6287
				= new byte[16384];
			byte[] anLocalInts_13_
			    = DoublyLinkedNode_Sub51_Sub12.aByteArray6287;
			for (int anLocalInt_14_ = -128; anLocalInt_14_ < 0;
			     anLocalInt_14_++) {
			    for (int anLocalInt_15_ = -128; anLocalInt_15_ < 0;
				 anLocalInt_15_++) {
				if (anLocalInts[anLocalInt_5_] == 0) {
				    int anLocalInt_16_ = 0;
				    if (anLocalInts[anLocalInt_5_ - 1] != 0)
					anLocalInt_16_++;
				    if (anLocalInts[anLocalInt_5_ + 1] != 0)
					anLocalInt_16_++;
				    if ((anLocalInts
					 [anLocalInt_5_ - anLocalInt_4_])
					!= 0)
					anLocalInt_16_++;
				    if ((anLocalInts
					 [anLocalInt_4_ + anLocalInt_5_])
					!= 0)
					anLocalInt_16_++;
				    anLocalInts_13_[anLocalInt_8_++]
					= (byte) (anLocalInt_16_ * 17);
				} else
				    anLocalInts_13_[anLocalInt_8_++]
					= (byte) 68;
				anLocalInt_5_++;
			    }
			    anLocalInt_5_
				+= ((Class232) aClass232_995).anInt1689 - 128;
			}
			if (anInterface7_Impl2_991 != null)
			    anInterface7_Impl2_991.method21
				(Node_Sub31_Sub23.aClass320_5942, 5259, 0,
				 0, 128, DoublyLinkedNode_Sub51_Sub12.aByteArray6287, 0,
				 128, 128);
			else {
			    anInterface7_Impl2_991
				= (aClass_ha_Sub2_990.method2153
				   (DoublyLinkedNode_Sub51_Sub12.aByteArray6287, 128,
				    128, (byte) -62, false,
				    Node_Sub31_Sub23.aClass320_5942));
			    anInterface7_Impl2_991.method19(false, false,
							    30135);
			}
		    }
		}
	    }
	}
    }
    
    final void method2394(Interface4_Impl1 argument_17_, boolean argument_18_,
			  int argument_19_) {
	if (!argument_18_) {
	    if (argument_19_ > 0) {
		method2393(128);
		aClass_ha_Sub2_990.method2237(true, anInterface7_Impl2_991);
		aClass_ha_Sub2_990.method2131(argument_19_, 0, argument_17_,
					      anInt989,
					      anInt988 + 1 - anInt989, true,
					      Class232.aClass390_1684);
	    }
	}
    }
    
    static final void method2395(Entity argument,
				 int argument_20_, int argument_21_) {
	if (((Entity) argument).anIntArray6735 != null) {
	    int anLocalInt = (((Entity) argument)
			      .anIntArray6735[argument_20_ + 1]);
	    if (anLocalInt != ((Entity) argument).anInt6754) {
		((Entity) argument).anInt6754 = anLocalInt;
		((Entity) argument).anInt6803
		    = ((Entity) argument).anInt6798;
		((Entity) argument).anInt6747 = 0;
		((Entity) argument).anInt6732 = 0;
		((Entity) argument).anInt6740 = 0;
		((Entity) argument).anInt6787 = 1;
		if (((Entity) argument).anInt6754 != -1)
		    Class313.method3622
			(argument, 0,
			 (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
			  (((Entity) argument).anInt6754, 0)),
			 ((Entity) argument).anInt6732);
	    }
	}
    }
    
    final void method2396(byte argument_22_) {
	method2394(anInterface4_Impl1_987, false, ((Class123) this).anInt999);
    }
    
    public static void method2397(int argument) {
	aClass166_993 = null;
	aClass217_1000 = null;
	anIntArray998 = null;
    }
    
    Class123(GraphicsToolkit_Sub2 argument_23_, Class232 argument_24_,
	     Class_s_Sub1 argument_25_, int argument_26_, int argument_27_,
	     int argument_28_, int argument_29_, int argument_30_) {
	aClass_ha_Sub2_990 = argument_23_;
	anInt997 = argument_29_;
	aClass232_995 = argument_24_;
	anInt992 = argument_30_;
	int anLocalInt = 1 << argument_28_;
	int anLocalInt_31_ = 0;
	int anLocalInt_32_ = argument_26_ << argument_28_;
	int anLocalInt_33_ = argument_27_ << argument_28_;
	for (int anLocalInt_34_ = 0; anLocalInt > anLocalInt_34_;
	     anLocalInt_34_++) {
	    int anLocalInt_35_
		= anLocalInt_32_ + ((anLocalInt_33_ + anLocalInt_34_)
				    * ((Class_s) argument_25_).anInt2550);
	    for (int anLocalInt_36_ = 0; anLocalInt_36_ < anLocalInt;
		 anLocalInt_36_++) {
		short[] anLocalInts
		    = (((Class_s_Sub1) argument_25_).aShortArrayArray5330
		       [anLocalInt_35_++]);
		if (anLocalInts != null)
		    anLocalInt_31_ += anLocalInts.length;
	    }
	}
	if (anLocalInt_31_ > 0) {
	    anInt988 = -2147483648;
	    anInt989 = 2147483647;
	    anInterface4_Impl1_987 = aClass_ha_Sub2_990.method2142(-1, false);
	    anInterface4_Impl1_987.method45(anLocalInt_31_, (byte) -73);
	    for (int anLocalInt_37_ = 0; anLocalInt_37_ < 4;
		 anLocalInt_37_++) {
		Buffer buffer
		    = anInterface4_Impl1_987.method43(true, 3754);
		if (buffer != null) {
		    Stream stream
			= aClass_ha_Sub2_990.method2116(9, buffer);
		    if (Stream.isBigEndian()) {
			for (int anLocalInt_38_ = 0;
			     anLocalInt > anLocalInt_38_; anLocalInt_38_++) {
			    int anLocalInt_39_
				= ((((Class_s) argument_25_).anInt2550
				    * (anLocalInt_33_ + anLocalInt_38_))
				   + anLocalInt_32_);
			    for (int anLocalInt_40_ = 0;
				 anLocalInt_40_ < anLocalInt;
				 anLocalInt_40_++) {
				short[] anLocalInts
				    = (((Class_s_Sub1) argument_25_)
				       .aShortArrayArray5330
				       [anLocalInt_39_++]);
				if (anLocalInts != null) {
				    for (int anLocalInt_41_ = 0;
					 anLocalInts.length > anLocalInt_41_;
					 anLocalInt_41_++) {
					int anLocalInt_42_
					    = (anLocalInts[anLocalInt_41_]
					       & 0xffff);
					if (anInt989 > anLocalInt_42_)
					    anInt989 = anLocalInt_42_;
					if (anInt988 < anLocalInt_42_)
					    anInt988 = anLocalInt_42_;
					stream.writeShortBE(anLocalInt_42_);
				    }
				}
			    }
			}
		    } else {
			for (int anLocalInt_43_ = 0;
			     anLocalInt_43_ < anLocalInt; anLocalInt_43_++) {
			    int anLocalInt_44_
				= (anLocalInt_32_
				   + ((anLocalInt_43_ + anLocalInt_33_)
				      * ((Class_s) argument_25_).anInt2550));
			    for (int anLocalInt_45_ = 0;
				 anLocalInt > anLocalInt_45_;
				 anLocalInt_45_++) {
				short[] anLocalInts
				    = (((Class_s_Sub1) argument_25_)
				       .aShortArrayArray5330
				       [anLocalInt_44_++]);
				if (anLocalInts != null) {
				    for (int anLocalInt_46_ = 0;
					 anLocalInts.length > anLocalInt_46_;
					 anLocalInt_46_++) {
					int anLocalInt_47_
					    = (anLocalInts[anLocalInt_46_]
					       & 0xffff);
					if (anLocalInt_47_ > anInt988)
					    anInt988 = anLocalInt_47_;
					if (anLocalInt_47_ < anInt989)
					    anInt989 = anLocalInt_47_;
					stream.writeShortLE(anLocalInt_47_);
				    }
				}
			    }
			}
		    }
		    stream.upload();
		    if (anInterface4_Impl1_987.method41(26937))
			break;
		}
	    }
	    ((Class123) this).anInt999 = anLocalInt_31_ / 3;
	} else {
	    ((Class123) this).anInt999 = 0;
	    anInterface7_Impl2_991 = null;
	}
    }
}
