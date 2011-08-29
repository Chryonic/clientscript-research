/* Class59_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;

final class Node_Sub45 extends Node
{
    static int[] anIntArray4256;
    private Class_s_Sub1 aClass_s_Sub1_4257;
    int anInt4258;
    static int[] anIntArray4259;
    int anInt4260;
    static int anInt4261;
    float aFloat4262;
    static String[] aStringArray4263;
    static int anInt4264;
    static DoublyLinkedNode_Sub51_Sub6[] aClass59_Sub51_Sub6Array4265
	= new DoublyLinkedNode_Sub51_Sub6[14];
    int anInt4266;
    static int[] anIntArray4267;
    static int[] anIntArray4268;
    private int[] anIntArray4269;
    static boolean aBoolean4270;
    static int[] anIntArray4272;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_4273;
    int anInt4274 = 0;
    static int[] anIntArray4275;
    int anInt4276;
    static RsInterface aRsInterface_4277;
    private Interface4_Impl2 anInterface4_Impl2_4278;
    private Stream aStream4279;
    private NativeHeapBuffer aNativeHeapBuffer_4280;
    
    final void method1088(int argument_0_, int[] argument_1_,
			  int argument_2_) {
	if (argument_0_ != -31861)
	    aRsInterface_4277 = null;
	Interface4_Impl1 interface4_impl1
	    = aClass_ha_Sub2_4273
		  .method2199((byte) 31, ((Node_Sub45) this).anInt4274 * 3);
	Buffer buffer = interface4_impl1.method43(true, 3754);
	if (buffer != null) {
	    Stream stream = aClass_ha_Sub2_4273.method2116(9, buffer);
	    int anLocalInt = 0;
	    int anLocalInt_3_ = 32767;
	    int anLocalInt_4_ = -32768;
	    if (!Stream.isBigEndian()) {
		for (int anLocalInt_5_ = 0; anLocalInt_5_ < argument_2_;
		     anLocalInt_5_++) {
		    int anLocalInt_6_ = argument_1_[anLocalInt_5_];
		    int anLocalInt_7_ = anIntArray4269[anLocalInt_6_];
		    short[] anLocalInts
			= (((Class_s_Sub1) aClass_s_Sub1_4257)
			   .aShortArrayArray5330[anLocalInt_6_]);
		    if (anLocalInt_7_ != 0 && anLocalInts != null) {
			int anLocalInt_8_ = 0;
			int anLocalInt_9_ = 0;
			while (anLocalInt_9_ < anLocalInts.length) {
			    if ((anLocalInt_7_ & 1 << anLocalInt_8_++) != 0) {
				for (int anLocalInt_10_ = 0;
				     anLocalInt_10_ < 3; anLocalInt_10_++) {
				    int anLocalInt_11_
					= (anLocalInts[anLocalInt_9_++]
					   & 0xffff);
				    if (anLocalInt_11_ > anLocalInt_4_)
					anLocalInt_4_ = anLocalInt_11_;
				    if (anLocalInt_11_ < anLocalInt_3_)
					anLocalInt_3_ = anLocalInt_11_;
				    stream.writeShortLE(anLocalInt_11_);
				}
				anLocalInt++;
			    } else
				anLocalInt_9_ += 3;
			}
		    }
		}
	    } else {
		for (int anLocalInt_12_ = 0; anLocalInt_12_ < argument_2_;
		     anLocalInt_12_++) {
		    int anLocalInt_13_ = argument_1_[anLocalInt_12_];
		    int anLocalInt_14_ = anIntArray4269[anLocalInt_13_];
		    short[] anLocalInts
			= (((Class_s_Sub1) aClass_s_Sub1_4257)
			   .aShortArrayArray5330[anLocalInt_13_]);
		    if (anLocalInt_14_ != 0 && anLocalInts != null) {
			int anLocalInt_15_ = 0;
			int anLocalInt_16_ = 0;
			while (anLocalInt_16_ < anLocalInts.length) {
			    if ((anLocalInt_14_ & 1 << anLocalInt_15_++) == 0)
				anLocalInt_16_ += 3;
			    else {
				anLocalInt++;
				for (int anLocalInt_17_ = 0;
				     anLocalInt_17_ < 3; anLocalInt_17_++) {
				    int anLocalInt_18_
					= (anLocalInts[anLocalInt_16_++]
					   & 0xffff);
				    stream.writeShortBE(anLocalInt_18_);
				    if (anLocalInt_18_ < anLocalInt_3_)
					anLocalInt_3_ = anLocalInt_18_;
				    if (anLocalInt_18_ > anLocalInt_4_)
					anLocalInt_4_ = anLocalInt_18_;
				}
			    }
			}
		    }
		}
	    }
	    stream.upload();
	    if (interface4_impl1.method41(26937) && anLocalInt > 0) {
		aClass_ha_Sub2_4273.method2215
		    (((((Class_s_Sub1) aClass_s_Sub1_4257).anInt5322 & 0x8)
		      != 0),
		     ((Node_Sub45) this).anInt4260,
		     ((((Class_s_Sub1) aClass_s_Sub1_4257).anInt5322 & 0x7)
		      != 0),
		     (byte) -112);
		if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_4273).aBoolean4703)
		    aClass_ha_Sub2_4273.EA(2147483647,
					   ((Node_Sub45) this).anInt4266,
					   ((Node_Sub45) this).anInt4276,
					   ((Node_Sub45) this).anInt4258);
		Class350_Sub2 class350_sub2
		    = aClass_ha_Sub2_4273.method2219((byte) -108);
		class350_sub2.method3853
		    ((byte) 108, 1.0F / ((Node_Sub45) this).aFloat4262,
		     1.0F, 1.0F / ((Node_Sub45) this).aFloat4262);
		aClass_ha_Sub2_4273.method2171(argument_0_ + 31905,
					       Class95.aClass81_723);
		aClass_ha_Sub2_4273.method2130(anInterface4_Impl2_4278, 1, 36);
		aClass_ha_Sub2_4273.method2179((((Class_s_Sub1)
						 aClass_s_Sub1_4257)
						.aClass222_5348),
					       (byte) -63);
		aClass_ha_Sub2_4273.method2131(anLocalInt, 0, interface4_impl1,
					       anLocalInt_3_,
					       (anLocalInt_4_ - anLocalInt_3_
						+ 1),
					       true, Class232.aClass390_1684);
		aClass_ha_Sub2_4273.method2217((byte) -57);
	    }
	}
    }
    
    static final boolean method1089(byte argument) {
	if (Statics.anInt1652 < 1)
	    return false;
	return true;
    }
    
    public static void method1090(byte argument) {
	anIntArray4272 = null;
	anIntArray4275 = null;
	anIntArray4256 = null;
	anIntArray4268 = null;
	anIntArray4267 = null;
	aClass59_Sub51_Sub6Array4265 = null;
	aStringArray4263 = null;
	client.fontCache = null;
	aRsInterface_4277 = null;
	anIntArray4259 = null;
    }
    
    final void method1091(int argument_19_, int argument_20_) {
	aNativeHeapBuffer_4280
	    = aClass_ha_Sub2_4273.allocateBuffer(true, argument_20_ * 4);
	aStream4279 = new Stream(aNativeHeapBuffer_4280, 0, argument_20_ * 4);
    }
    
    final void method1092(int argument_21_, int argument_22_) {
	aStream4279.upload();
	anInterface4_Impl2_4278 = aClass_ha_Sub2_4273.method2248(0, false);
	anInterface4_Impl2_4278.method51(argument_22_ * 4, argument_21_, -959,
            aNativeHeapBuffer_4280);
	aStream4279 = null;
	aNativeHeapBuffer_4280 = null;
    }
    
    final void method1093(int argument_23_, int argument_24_) {
	aStream4279.method4165(argument_24_ * 4 + 3);
	aStream4279.writeByte(-1);
    }
    
    final void method1094(int argument_25_, int argument_26_, int argument_27_,
			  int argument_28_) {
	anIntArray4269[(argument_28_
			+ (argument_25_
			   * ((Class_s) aClass_s_Sub1_4257).anInt2550))]
	    = MathStatics.OR((anIntArray4269[(argument_28_ + (argument_25_ * (((Class_s) aClass_s_Sub1_4257).anInt2550)))]), 1 << argument_27_);
	((Node_Sub45) this).anInt4274++;
    }
    
    static final void method1095(int argument) {
	DoublyLinkedNode_Sub51_Sub14 class59_sub51_sub14
	    = ((DoublyLinkedNode_Sub51_Sub14)
	       Node_Sub31_Sub3.aCyclicLinkedList_5850.getFirst());
	if (argument == 0) {
	    for (/**/; class59_sub51_sub14 != null;
		 class59_sub51_sub14
		     = ((DoublyLinkedNode_Sub51_Sub14)
			Node_Sub31_Sub3.aCyclicLinkedList_5850.getNext())) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub1 class104_sub2_sub2_sub1
		    = (((DoublyLinkedNode_Sub51_Sub14) class59_sub51_sub14)
		       .aClass104_Sub2_Sub2_Sub1_6306);
		if (Class333.anInt2720
		    <= (((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) class104_sub2_sub2_sub1)
			.anInt6692)) {
		    if (Class333.anInt2720
			>= (((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) class104_sub2_sub2_sub1)
			    .anInt6702)) {
			class104_sub2_sub2_sub1.method1803(0);
			if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub1)
			     class104_sub2_sub2_sub1).anInt6699
			    > 0) {
			    Node_Sub35 class59_sub35
				= ((Node_Sub35)
				   (Class294.aJagexHashMap_2453.get((long) ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub1) class104_sub2_sub2_sub1).anInt6699) - 1))));
			    if (class59_sub35 != null) {
				DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				    = (((Node_Sub35) class59_sub35)
				       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
				if ((((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub1).worldX
				     >= 0)
				    && (MapRelated.mapWidth * 512
					> (((DoublyLinkedNodeP2_Sub2)
					    class104_sub2_sub2_sub5_sub1)
					   .worldX))
				    && (((DoublyLinkedNodeP2_Sub2)
					 class104_sub2_sub2_sub5_sub1)
					.worldZ) >= 0
				    && (MapRelated.mapDepth * 512
					> (((DoublyLinkedNodeP2_Sub2)
					    class104_sub2_sub2_sub5_sub1)
					   .worldZ)))
				    class104_sub2_sub2_sub1.method1802
					(Class333.anInt2720, (byte) -4,
					 (((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub1)
					  .worldX),
					 ((Node_Sub31_Sub36.method993
                             ((((DoublyLinkedNodeP2_Sub2)
                                     class104_sub2_sub2_sub1)
                                     .lightingHL),
                                     (((DoublyLinkedNodeP2_Sub2)
                                             class104_sub2_sub2_sub5_sub1)
                                             .worldX),
                                     argument - 12040,
                                     (((DoublyLinkedNodeP2_Sub2)
                                             class104_sub2_sub2_sub5_sub1)
                                             .worldZ)))
					  - (((DoublyLinkedNodeP2_Sub2_Sub2_Sub1)
					      class104_sub2_sub2_sub1)
					     .anInt6705)),
					 (((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub1)
					  .worldZ));
			    }
			}
			if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub1)
			     class104_sub2_sub2_sub1).anInt6699
			    < 0) {
			    int anLocalInt
				= (-((DoublyLinkedNodeP2_Sub2_Sub2_Sub1)
				     class104_sub2_sub2_sub1).anInt6699
				   - 1);
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2;
			    if (anLocalInt != Class64.anInt451)
				class104_sub2_sub2_sub5_sub2
				    = (Class345
				       .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
				       [anLocalInt]);
			    else
				class104_sub2_sub2_sub5_sub2
				    = (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587);
			    if (class104_sub2_sub2_sub5_sub2 != null
				&& (((DoublyLinkedNodeP2_Sub2)
				     class104_sub2_sub2_sub5_sub2).worldX
				    >= 0)
				&& (MapRelated.mapWidth * 512
				    > ((DoublyLinkedNodeP2_Sub2)
				       class104_sub2_sub2_sub5_sub2).worldX)
				&& (((DoublyLinkedNodeP2_Sub2)
				     class104_sub2_sub2_sub5_sub2).worldZ
				    >= 0)
				&& (MapRelated.mapDepth * 512
				    > (((DoublyLinkedNodeP2_Sub2)
					class104_sub2_sub2_sub5_sub2)
				       .worldZ)))
				class104_sub2_sub2_sub1.method1802
				    (Class333.anInt2720, (byte) -4,
				     ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldX,
				     ((Node_Sub31_Sub36.method993
                             (((DoublyLinkedNodeP2_Sub2)
                                     class104_sub2_sub2_sub1).lightingHL,
                                     (((DoublyLinkedNodeP2_Sub2)
                                             class104_sub2_sub2_sub5_sub2)
                                             .worldX),
                                     -12040,
                                     (((DoublyLinkedNodeP2_Sub2)
                                             class104_sub2_sub2_sub5_sub2)
                                             .worldZ)))
				      - ((DoublyLinkedNodeP2_Sub2_Sub2_Sub1)
					 class104_sub2_sub2_sub1).anInt6705),
				     ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldZ);
			}
			class104_sub2_sub2_sub1.method1804(16383,
							   Class350.anInt2930);
			Node_Sub47_Sub6.method1126(class104_sub2_sub2_sub1,
                    true);
		    }
		} else {
		    class59_sub51_sub14.unlink();
		    class104_sub2_sub2_sub1.method1807((byte) 55);
		}
	    }
	}
    }
    
    final void method1096(float argument_29_, int argument_30_,
			  int argument_31_, int argument_32_,
			  int argument_33_) {
	if (((Node_Sub45) this).anInt4260 != -1) {
	    TextureDescriptor textureDescriptor
		= ((GraphicsToolkit) aClass_ha_Sub2_4273).textureSource
		      .getDescriptor(((Node_Sub45) this).anInt4260, true);
	    int anLocalInt = ((TextureDescriptor) textureDescriptor).aByte840 & 0xff;
	    if (anLocalInt != 0 && ((TextureDescriptor) textureDescriptor).aByte834 != 4) {
		int anLocalInt_34_;
		if (argument_30_ >= 0) {
		    if (argument_30_ <= 127)
			anLocalInt_34_ = argument_30_ * 131586;
		    else
			anLocalInt_34_ = 16777215;
		} else
		    anLocalInt_34_ = 0;
		if (anLocalInt != 256) {
		    int anLocalInt_35_ = anLocalInt;
		    int anLocalInt_36_ = 256 - anLocalInt;
		    argument_31_
			= (((anLocalInt_36_ * (argument_31_ & 0xff00ff)
			     + (anLocalInt_34_ & 0xff00ff) * anLocalInt_35_)
			    & ~0xff00ff)
			   + ((anLocalInt_36_ * (argument_31_ & 0xff00)
			       + (anLocalInt_34_ & 0xff00) * anLocalInt_35_)
			      & 0xff0000)) >> 8;
		} else
		    argument_31_ = anLocalInt_34_;
	    }
	    int anLocalInt_37_ = ((TextureDescriptor) textureDescriptor).aByte828 & 0xff;
	    if (anLocalInt_37_ != 0) {
		anLocalInt_37_ += 256;
		int anLocalInt_38_
		    = (argument_31_ >> 16 & 0xff) * anLocalInt_37_;
		if (anLocalInt_38_ > 65535)
		    anLocalInt_38_ = 65535;
		int anLocalInt_39_
		    = anLocalInt_37_ * ((argument_31_ & 0xff00) >> 8);
		if (anLocalInt_39_ > 65535)
		    anLocalInt_39_ = 65535;
		int anLocalInt_40_ = (argument_31_ & 0xff) * anLocalInt_37_;
		if (anLocalInt_40_ > 65535)
		    anLocalInt_40_ = 65535;
		argument_31_
		    = (anLocalInt_40_ >> 8) + ((anLocalInt_39_ & 0xff00)
					       + ((anLocalInt_38_ & 0x7200ff00)
						  << 8));
	    }
	}
	aStream4279.method4165(argument_33_ * 4);
	if (argument_29_ != 1.0F) {
	    int anLocalInt = argument_31_ >> 16 & 0xff;
	    int anLocalInt_41_ = (argument_31_ & 0xff65) >> 8;
	    int anLocalInt_42_ = argument_31_ & 0xff;
	    anLocalInt *= argument_29_;
	    if (anLocalInt >= 0) {
		if (anLocalInt > 255)
		    anLocalInt = 255;
	    } else
		anLocalInt = 0;
	    anLocalInt_41_ *= argument_29_;
	    if (anLocalInt_41_ >= 0) {
		if (anLocalInt_41_ > 255)
		    anLocalInt_41_ = 255;
	    } else
		anLocalInt_41_ = 0;
	    anLocalInt_42_ *= argument_29_;
	    if (anLocalInt_42_ < 0)
		anLocalInt_42_ = 0;
	    else if (anLocalInt_42_ > 255)
		anLocalInt_42_ = 255;
	    argument_31_
		= anLocalInt_42_ | (anLocalInt_41_ << 8 | anLocalInt << 16);
	}
	if (((GraphicsToolkit_Sub2) aClass_ha_Sub2_4273).anInt4774 != 0) {
	    aStream4279.writeByte((byte) (argument_31_ >> 16));
	    aStream4279.writeByte((byte) (argument_31_ >> 8));
	    aStream4279.writeByte((byte) argument_31_);
	} else {
	    aStream4279.writeByte((byte) argument_31_);
	    aStream4279.writeByte((byte) (argument_31_ >> 8));
	    aStream4279.writeByte((byte) (argument_31_ >> 16));
	}
    }
    
    Node_Sub45(Class_s_Sub1 argument_43_, int argument_44_,
               int argument_45_, int argument_46_, int argument_47_,
               int argument_48_) {
	aClass_s_Sub1_4257 = argument_43_;
	((Node_Sub45) this).anInt4260 = argument_44_;
	anIntArray4269 = new int[(((Class_s) aClass_s_Sub1_4257).anInt2549
				  * ((Class_s) aClass_s_Sub1_4257).anInt2550)];
	((Node_Sub45) this).anInt4266 = argument_46_;
	((Node_Sub45) this).anInt4258 = argument_48_;
	aClass_ha_Sub2_4273
	    = ((Class_s_Sub1) aClass_s_Sub1_4257).aClass_ha_Sub2_5321;
	((Node_Sub45) this).aFloat4262 = (float) argument_45_;
	((Node_Sub45) this).anInt4276 = argument_47_;
    }
    
    static {
	anInt4261 = 50;
	anIntArray4268 = new int[anInt4261];
	anIntArray4267 = new int[anInt4261];
	aBoolean4270 = false;
	anIntArray4256 = new int[anInt4261];
	anIntArray4259 = new int[anInt4261];
	aStringArray4263 = new String[anInt4261];
	aRsInterface_4277 = null;
	anIntArray4272 = new int[anInt4261];
	anIntArray4275 = new int[anInt4261];
    }
}
