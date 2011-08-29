/* Class_s_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

final class Class_s_Sub2 extends Class_s
{
    short[][] aShortArrayArray5351;
    static int anInt5352;
    private Node_Sub20[][][] aClass59_Sub20ArrayArrayArray5353;
    int[][][] anIntArrayArrayArray5354;
    private int anInt5355;
    int[][][] anIntArrayArrayArray5356;
    private int anInt5357;
    private byte[][] aByteArrayArray5358;
    private int[][][] anIntArrayArrayArray5359;
    private CyclicLinkedList aCyclicLinkedList_5360 = new CyclicLinkedList();
    private int anInt5361;
    private int[][][] anIntArrayArrayArray5362;
    private Class273 aClass273_5363;
    static int anInt5364 = -1;
    int[][][] anIntArrayArrayArray5365;
    static String aString5366;
    static int anInt5367;
    private int[][][] anIntArrayArrayArray5368;
    private int anInt5369;
    GlToolkit aClass_ha_Sub3_5370;
    int anInt5371;
    private GlArrayBuffer anGlArrayBuffer_5372;
    GlInterleavedArray aGlInterleavedArray_5373;
    private int anInt5374;
    private GlInterleavedArray aGlInterleavedArray_5375;
    private float[][] aFloatArrayArray5376;
    private float[][] aFloatArrayArray5377;
    GlInterleavedArray aGlInterleavedArray_5378;
    GlInterleavedArray aGlInterleavedArray_5379;
    private float[][] aFloatArrayArray5380;
    private JagexHashMap aJagexHashMap_5381;
    private Node_Sub20[] aClass59_Sub20Array5382;
    private int anInt5383;
    private byte[][] aByteArrayArray5384;
    
    private final void method3549(int argument_0_, int argument_1_,
				  tia_sub_35_Sub2DoublyLinked argument_2_,
				  int argument_3_) {
	int anLocalInt = -123 % ((-33 - argument_0_) / 47);
	int[] anLocalInts = (((Class_s_Sub2) this).anIntArrayArrayArray5356
			     [argument_1_][argument_3_]);
	int[] anLocalInts_4_ = (((Class_s_Sub2) this).anIntArrayArrayArray5354
				[argument_1_][argument_3_]);
	int anLocalInt_5_ = anLocalInts.length;
	if ((((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
	     .anIntArray4997).length
	    < anLocalInt_5_) {
	    ((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		.anIntArray4999
		= new int[anLocalInt_5_];
	    ((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		.anIntArray4997
		= new int[anLocalInt_5_];
	}
	int[] anLocalInts_6_
	    = (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
	       .anIntArray4997);
	int[] anLocalInts_7_
	    = (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
	       .anIntArray4999);
	for (int anLocalInt_8_ = 0; anLocalInt_8_ < anLocalInt_5_;
	     anLocalInt_8_++) {
	    anLocalInts_6_[anLocalInt_8_]
		= (anLocalInts[anLocalInt_8_]
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	    anLocalInts_7_[anLocalInt_8_]
		= (anLocalInts_4_[anLocalInt_8_]
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	}
	int anLocalInt_9_ = 0;
	while (anLocalInt_5_ > anLocalInt_9_) {
	    int anLocalInt_10_ = anLocalInts_6_[anLocalInt_9_];
	    int anLocalInt_11_ = anLocalInts_7_[anLocalInt_9_++];
	    int anLocalInt_12_ = anLocalInts_6_[anLocalInt_9_];
	    int anLocalInt_13_ = anLocalInts_7_[anLocalInt_9_++];
	    int anLocalInt_14_ = anLocalInts_6_[anLocalInt_9_];
	    int anLocalInt_15_ = anLocalInts_7_[anLocalInt_9_++];
	    if ((-((-anLocalInt_11_ + anLocalInt_13_)
		   * (anLocalInt_14_ - anLocalInt_12_))
		 + (anLocalInt_13_ - anLocalInt_15_) * (anLocalInt_10_
							- anLocalInt_12_))
		> 0)
		argument_2_.method1225(false, anLocalInt_13_, anLocalInt_12_,
				       anLocalInt_14_, anLocalInt_15_,
				       anLocalInt_10_, anLocalInt_11_);
	}
    }
    
    final void method3539(int argument_16_, int argument_17_, int argument_18_,
			  boolean[][] argument_19_, boolean argument_20_,
			  int argument_21_, int argument_22_) {
	method3550(argument_19_, argument_22_, argument_20_, argument_17_, -93,
		   argument_18_, argument_16_, argument_21_);
    }
    
    final void wa(tia_sub_35DoublyLinked argument_23_, int argument_24_, int argument_25_,
		  int argument_26_, int argument_27_, boolean argument_28_) {
	if (aClass273_5363 != null && argument_23_ != null) {
	    int anLocalInt
		= (-(argument_25_ * (((GlToolkit) (((Class_s_Sub2) this)
						       .aClass_ha_Sub3_5370))
				     .anInt4886)
		     >> 8) + argument_24_
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	    int anLocalInt_29_
		= ((argument_26_
		    - (argument_25_ * (((GlToolkit) (((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
				       .anInt4930)
		       >> 8))
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	    aClass273_5363.method3382(84, argument_23_, anLocalInt_29_,
				      anLocalInt);
	}
    }
    
    final void YA() {
	if (anInt5383 <= 0)
	    aClass273_5363 = null;
	else {
	    byte[][] anLocalInts = (new byte[((Class_s) this).anInt2550 + 1]
				    [((Class_s) this).anInt2549 + 1]);
	    for (int anLocalInt = 1; ((Class_s) this).anInt2550 > anLocalInt;
		 anLocalInt++) {
		for (int anLocalInt_30_ = 1;
		     ((Class_s) this).anInt2549 > anLocalInt_30_;
		     anLocalInt_30_++)
		    anLocalInts[anLocalInt][anLocalInt_30_]
			= (byte) (((aByteArrayArray5384[anLocalInt]
				    [anLocalInt_30_])
				   >> 1)
				  + ((aByteArrayArray5384[anLocalInt]
				      [anLocalInt_30_ - 1])
				     >> 2)
				  + ((aByteArrayArray5384[anLocalInt - 1]
				      [anLocalInt_30_])
				     >> 2)
				  + (((aByteArrayArray5384[anLocalInt + 1]
				       [anLocalInt_30_])
				      >> 3)
				     + ((aByteArrayArray5384[anLocalInt]
					 [anLocalInt_30_ + 1])
					>> 3)));
	    }
	    aClass59_Sub20Array5382
		= new Node_Sub20[aJagexHashMap_5381.count()];
	    aJagexHashMap_5381.method1520(0, aClass59_Sub20Array5382);
	    for (int anLocalInt = 0;
		 anLocalInt < aClass59_Sub20Array5382.length; anLocalInt++)
		aClass59_Sub20Array5382[anLocalInt].method727(anInt5383,
							      -17605);
	    int anLocalInt = 24;
	    if (anIntArrayArrayArray5362 != null)
		anLocalInt += 4;
	    if ((((Class_s_Sub2) this).anInt5371 & 0x7) != 0)
		anLocalInt += 12;
	    NativeHeapBuffer nativeHeapBuffer
		= ((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		      .heap
		      .safeAllocateBuffer(anLocalInt * anInt5383, false);
	    Stream stream = new Stream(nativeHeapBuffer);
	    Node_Sub20[] class59_sub20s = new Node_Sub20[anInt5383];
	    int anLocalInt_31_ = Class392.method4142(anInt5383 / 4, false);
	    if (anLocalInt_31_ < 1)
		anLocalInt_31_ = 1;
	    JagexHashMap jagexHashMap = new JagexHashMap(anLocalInt_31_);
	    Node_Sub20[] class59_sub20s_32_ = new Node_Sub20[anInt5374];
	    for (int anLocalInt_33_ = 0;
		 anLocalInt_33_ < ((Class_s) this).anInt2550;
		 anLocalInt_33_++) {
		for (int anLocalInt_34_ = 0;
		     anLocalInt_34_ < ((Class_s) this).anInt2549;
		     anLocalInt_34_++) {
		    if ((((Class_s_Sub2) this).anIntArrayArrayArray5365
			 [anLocalInt_33_][anLocalInt_34_])
			!= null) {
			Node_Sub20[] class59_sub20s_35_
			    = (aClass59_Sub20ArrayArrayArray5353
			       [anLocalInt_33_][anLocalInt_34_]);
			int[] anLocalInts_36_
			    = (((Class_s_Sub2) this).anIntArrayArrayArray5356
			       [anLocalInt_33_][anLocalInt_34_]);
			int[] anLocalInts_37_
			    = (((Class_s_Sub2) this).anIntArrayArrayArray5354
			       [anLocalInt_33_][anLocalInt_34_]);
			int[] anLocalInts_38_
			    = (anIntArrayArrayArray5359[anLocalInt_33_]
			       [anLocalInt_34_]);
			int[] anLocalInts_39_
			    = (((Class_s_Sub2) this).anIntArrayArrayArray5365
			       [anLocalInt_33_][anLocalInt_34_]);
			int[] anLocalInts_40_
			    = (anIntArrayArrayArray5368 != null
			       ? (anIntArrayArrayArray5368[anLocalInt_33_]
				  [anLocalInt_34_])
			       : null);
			int[] anLocalInts_41_
			    = (anIntArrayArrayArray5362 == null ? null
			       : (anIntArrayArrayArray5362[anLocalInt_33_]
				  [anLocalInt_34_]));
			if (anLocalInts_38_ == null)
			    anLocalInts_38_ = anLocalInts_39_;
			float f = (aFloatArrayArray5377[anLocalInt_33_]
				   [anLocalInt_34_]);
			float f_42_ = (aFloatArrayArray5376[anLocalInt_33_]
				       [anLocalInt_34_]);
			float f_43_ = (aFloatArrayArray5380[anLocalInt_33_]
				       [anLocalInt_34_]);
			float f_44_ = (aFloatArrayArray5377[anLocalInt_33_]
				       [anLocalInt_34_ + 1]);
			float f_45_ = (aFloatArrayArray5376[anLocalInt_33_]
				       [anLocalInt_34_ + 1]);
			float f_46_ = (aFloatArrayArray5380[anLocalInt_33_]
				       [anLocalInt_34_ + 1]);
			float f_47_ = (aFloatArrayArray5377[anLocalInt_33_ + 1]
				       [anLocalInt_34_ + 1]);
			float f_48_ = (aFloatArrayArray5376[anLocalInt_33_ + 1]
				       [anLocalInt_34_ + 1]);
			float f_49_ = (aFloatArrayArray5380[anLocalInt_33_ + 1]
				       [anLocalInt_34_ + 1]);
			float f_50_ = (aFloatArrayArray5377[anLocalInt_33_ + 1]
				       [anLocalInt_34_]);
			float f_51_ = (aFloatArrayArray5376[anLocalInt_33_ + 1]
				       [anLocalInt_34_]);
			float f_52_ = (aFloatArrayArray5380[anLocalInt_33_ + 1]
				       [anLocalInt_34_]);
			int anLocalInt_53_
			    = (anLocalInts[anLocalInt_33_][anLocalInt_34_]
			       & 0xff);
			int anLocalInt_54_
			    = (anLocalInts[anLocalInt_33_][anLocalInt_34_ + 1]
			       & 0xff);
			int anLocalInt_55_ = ((anLocalInts[anLocalInt_33_ + 1]
					       [anLocalInt_34_ + 1])
					      & 0xff);
			int anLocalInt_56_
			    = (anLocalInts[anLocalInt_33_ + 1][anLocalInt_34_]
			       & 0xff);
			int anLocalInt_57_ = 0;
		    while_219_:
			for (int anLocalInt_58_ = 0;
			     anLocalInt_58_ < anLocalInts_39_.length;
			     anLocalInt_58_++) {
			    Node_Sub20 class59_sub20
				= class59_sub20s_35_[anLocalInt_58_];
			    for (int anLocalInt_59_ = 0;
				 anLocalInt_59_ < anLocalInt_57_;
				 anLocalInt_59_++) {
				if (class59_sub20s_32_[anLocalInt_59_]
				    == class59_sub20)
				    continue while_219_;
			    }
			    class59_sub20s_32_[anLocalInt_57_++]
				= class59_sub20;
			}
			short[] anLocalInts_60_
			    = (((Class_s_Sub2) this).aShortArrayArray5351
				   [(anLocalInt_33_
				     + (((Class_s) this).anInt2550
					* anLocalInt_34_))]
			       = new short[anLocalInts_39_.length]);
			for (int anLocalInt_61_ = 0;
			     anLocalInt_61_ < anLocalInts_39_.length;
			     anLocalInt_61_++) {
			    int anLocalInt_62_
				= ((anLocalInt_33_
				    << ((Class_s) this).anInt2548)
				   + anLocalInts_36_[anLocalInt_61_]);
			    int anLocalInt_63_
				= ((anLocalInt_34_
				    << ((Class_s) this).anInt2548)
				   + anLocalInts_37_[anLocalInt_61_]);
			    int anLocalInt_64_ = anLocalInt_62_ >> anInt5357;
			    int anLocalInt_65_ = anLocalInt_63_ >> anInt5357;
			    int anLocalInt_66_
				= anLocalInts_39_[anLocalInt_61_];
			    int anLocalInt_67_
				= anLocalInts_38_[anLocalInt_61_];
			    int anLocalInt_68_
				= (anLocalInts_40_ != null
				   ? anLocalInts_40_[anLocalInt_61_] : 0);
			    long l = ((long) anLocalInt_66_ << 32
				      | (long) anLocalInt_67_ << 48
				      | (long) (anLocalInt_64_ << 16)
				      | (long) anLocalInt_65_);
			    int anLocalInt_69_
				= anLocalInts_36_[anLocalInt_61_];
			    int anLocalInt_70_
				= anLocalInts_37_[anLocalInt_61_];
			    int anLocalInt_71_ = 74;
			    int anLocalInt_72_ = 0;
			    float f_73_ = 1.0F;
			    float f_74_;
			    float f_75_;
			    float f_76_;
			    if (anLocalInt_69_ == 0 && anLocalInt_70_ == 0) {
				f_74_ = f_42_;
				f_75_ = f;
				anLocalInt_71_ -= anLocalInt_53_;
				f_76_ = f_43_;
			    } else if (anLocalInt_69_ == 0
				       && (((Class_s) this).anInt2547
					   == anLocalInt_70_)) {
				f_74_ = f_45_;
				anLocalInt_71_ -= anLocalInt_54_;
				f_75_ = f_44_;
				f_76_ = f_46_;
			    } else if ((anLocalInt_69_
					!= ((Class_s) this).anInt2547)
				       || (((Class_s) this).anInt2547
					   != anLocalInt_70_)) {
				if ((((Class_s) this).anInt2547
				     == anLocalInt_69_)
				    && anLocalInt_70_ == 0) {
				    f_75_ = f_50_;
				    f_74_ = f_51_;
				    anLocalInt_71_ -= anLocalInt_56_;
				    f_76_ = f_52_;
				} else {
				    float f_77_ = ((float) anLocalInt_69_
						   / (float) (((Class_s) this)
							      .anInt2547));
				    float f_78_ = ((float) anLocalInt_70_
						   / (float) (((Class_s) this)
							      .anInt2547));
				    float f_79_ = f_77_ * (f_50_ - f) + f;
				    float f_80_
					= (f_51_ - f_42_) * f_77_ + f_42_;
				    float f_81_
					= f_43_ + f_77_ * (-f_43_ + f_52_);
				    float f_82_
					= f_44_ + (f_47_ - f_44_) * f_77_;
				    float f_83_
					= f_45_ + f_77_ * (-f_45_ + f_48_);
				    f_75_ = f_79_ + f_78_ * (-f_79_ + f_82_);
				    float f_84_
					= (-f_46_ + f_49_) * f_77_ + f_46_;
				    f_74_ = (f_83_ - f_80_) * f_78_ + f_80_;
				    f_76_ = (-f_81_ + f_84_) * f_78_ + f_81_;
				    int anLocalInt_85_
					= (anLocalInt_53_
					   + ((anLocalInt_69_
					       * (-anLocalInt_53_
						  + anLocalInt_56_))
					      >> ((Class_s) this).anInt2548));
				    int anLocalInt_86_
					= (anLocalInt_54_
					   + (((anLocalInt_55_
						- anLocalInt_54_)
					       * anLocalInt_69_)
					      >> ((Class_s) this).anInt2548));
				    anLocalInt_71_
					-= (anLocalInt_85_
					    + ((anLocalInt_70_
						* (anLocalInt_86_
						   - anLocalInt_85_))
					       >> ((Class_s) this).anInt2548));
				}
			    } else {
				f_75_ = f_47_;
				f_74_ = f_48_;
				anLocalInt_71_ -= anLocalInt_55_;
				f_76_ = f_49_;
			    }
			    if (anLocalInt_66_ != -1) {
				int anLocalInt_87_
				    = (anLocalInt_71_ * (anLocalInt_66_ & 0x7f)
				       >> 7);
				if (anLocalInt_87_ >= 2) {
				    if (anLocalInt_87_ > 126)
					anLocalInt_87_ = 126;
				} else
				    anLocalInt_87_ = 2;
				anLocalInt_72_
				    = (HslToRgb.table
				       [(anLocalInt_87_
					 | anLocalInt_66_ & 0xff80)]);
				if ((((Class_s_Sub2) this).anInt5371 & 0x7)
				    == 0) {
				    f_73_ = (f_75_ * (((GlToolkit)
						       (((Class_s_Sub2) this)
							.aClass_ha_Sub3_5370))
						      .sunDirection[0])
					     + (((GlToolkit)
						 (((Class_s_Sub2) this)
						  .aClass_ha_Sub3_5370))
						.sunDirection[1]) * f_74_
					     + (((GlToolkit)
						 (((Class_s_Sub2) this)
						  .aClass_ha_Sub3_5370))
						.sunDirection[2]) * f_76_);
				    f_73_
					= (f_73_ * (f_73_ > 0.0F
						    ? (((GlToolkit)
							(((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
						       .light1Intensity)
						    : (((GlToolkit)
							(((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
						       .light2NegIntensity))
					   + (((GlToolkit)
					       (((Class_s_Sub2) this)
						.aClass_ha_Sub3_5370))
					      .modelIntensity));
				}
			    }
			    Node node = null;
			    if ((anLocalInt_62_ & anInt5361 - 1) == 0
				&& (anInt5361 - 1 & anLocalInt_63_) == 0)
				node = jagexHashMap.get(l);
			    int anLocalInt_88_;
			    if (node != null) {
				anLocalInts_60_[anLocalInt_61_]
				    = ((Node_Sub39) (Node_Sub39)
                        node).aShort4197;
				anLocalInt_88_
				    = anLocalInts_60_[anLocalInt_61_] & 0xffff;
				if (anLocalInt_66_ != -1
				    && (((Node) (class59_sub20s_35_
						    [anLocalInt_61_])).hash
					< (((Node)
					    class59_sub20s[anLocalInt_88_])
					   .hash)))
				    class59_sub20s[anLocalInt_88_]
					= class59_sub20s_35_[anLocalInt_61_];
			    } else {
				int anLocalInt_89_;
				if (anLocalInt_67_ != anLocalInt_66_) {
				    int anLocalInt_90_
					= (((anLocalInt_67_ & 0x7f)
					    * anLocalInt_71_)
					   >> 7);
				    if (anLocalInt_90_ < 2)
					anLocalInt_90_ = 2;
				    else if (anLocalInt_90_ > 126)
					anLocalInt_90_ = 126;
				    anLocalInt_89_ = (HslToRgb.table
						      [(anLocalInt_67_ & 0xff80
							| anLocalInt_90_)]);
				    if ((((Class_s_Sub2) this).anInt5371 & 0x7)
					== 0) {
					float f_91_
					    = ((f_76_
						* (((GlToolkit)
						    (((Class_s_Sub2) this)
						     .aClass_ha_Sub3_5370))
						   .sunDirection[2]))
					       + ((f_75_
						   * (((GlToolkit)
						       (((Class_s_Sub2) this)
							.aClass_ha_Sub3_5370))
						      .sunDirection[0]))
						  + ((((GlToolkit)
						       (((Class_s_Sub2) this)
							.aClass_ha_Sub3_5370))
						      .sunDirection[1])
						     * f_74_)));
					f_91_ = ((((GlToolkit)
						   (((Class_s_Sub2) this)
						    .aClass_ha_Sub3_5370))
						  .modelIntensity)
						 + (!(f_73_ > 0.0F)
						    ? (((GlToolkit)
							(((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
						       .light2NegIntensity)
						    : (((GlToolkit)
							(((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
						       .light1Intensity)) * f_73_);
					int anLocalInt_92_
					    = anLocalInt_89_ >> 16 & 0xff;
					int anLocalInt_93_
					    = anLocalInt_89_ >> 8 & 0xff;
					int anLocalInt_94_
					    = anLocalInt_89_ & 0xff;
					anLocalInt_92_ *= f_91_;
					if (anLocalInt_92_ < 0)
					    anLocalInt_92_ = 0;
					else if (anLocalInt_92_ > 255)
					    anLocalInt_92_ = 255;
					anLocalInt_93_ *= f_91_;
					anLocalInt_94_ *= f_91_;
					if (anLocalInt_93_ < 0)
					    anLocalInt_93_ = 0;
					else if (anLocalInt_93_ > 255)
					    anLocalInt_93_ = 255;
					if (anLocalInt_94_ >= 0) {
					    if (anLocalInt_94_ > 255)
						anLocalInt_94_ = 255;
					} else
					    anLocalInt_94_ = 0;
					anLocalInt_89_ = (anLocalInt_92_ << 16
							  | anLocalInt_93_ << 8
							  | anLocalInt_94_);
				    }
				} else
				    anLocalInt_89_ = anLocalInt_72_;
				if (!((GlToolkit) (((Class_s_Sub2) this)
						       .aClass_ha_Sub3_5370))
				     .isBigEndian) {
				    stream.writeFloatLE((float) anLocalInt_62_);
				    stream.writeFloatLE((float) ((this.method3541(anLocalInt_63_, 0, anLocalInt_62_)) + anLocalInt_68_));
				    stream.writeFloatLE((float) anLocalInt_63_);
				    stream.writeByte((byte) (anLocalInt_89_ >> 16));
				    stream.writeByte((byte) (anLocalInt_89_ >> 8));
				    stream.writeByte((byte) anLocalInt_89_);
				    stream.writeByte(-1);
				    stream.writeFloatLE((float) anLocalInt_62_);
				    stream.writeFloatLE((float) anLocalInt_63_);
				    if (anIntArrayArrayArray5362 != null)
					stream.writeFloatLE((float) (anLocalInts_41_ == null ? 0 : ((anLocalInts_41_[anLocalInt_61_]) - 1)));
				    if ((((Class_s_Sub2) this).anInt5371 & 0x7)
					!= 0) {
					stream.writeFloatLE(f_75_);
					stream.writeFloatLE(f_74_);
					stream.writeFloatLE(f_76_);
				    }
				} else {
				    stream.writeFloatBE((float) anLocalInt_62_);
				    stream.writeFloatBE((float) (anLocalInt_68_ + (this.method3541(anLocalInt_63_, 0, anLocalInt_62_))));
				    stream.writeFloatBE((float) anLocalInt_63_);
				    stream.writeByte((byte) (anLocalInt_89_ >> 16));
				    stream.writeByte((byte) (anLocalInt_89_ >> 8));
				    stream.writeByte((byte) anLocalInt_89_);
				    stream.writeByte(-1);
				    stream.writeFloatBE((float) anLocalInt_62_);
				    stream.writeFloatBE((float) anLocalInt_63_);
				    if (anIntArrayArrayArray5362 != null)
					stream.writeFloatBE((float) (anLocalInts_41_ != null ? (anLocalInts_41_[anLocalInt_61_]) - 1 : 0));
				    if ((((Class_s_Sub2) this).anInt5371 & 0x7)
					!= 0) {
					stream.writeFloatBE(f_75_);
					stream.writeFloatBE(f_74_);
					stream.writeFloatBE(f_76_);
				    }
				}
				anLocalInt_88_ = anInt5369++;
				anLocalInts_60_[anLocalInt_61_]
				    = (short) anLocalInt_88_;
				if (anLocalInt_66_ != -1)
				    class59_sub20s[anLocalInt_88_]
					= class59_sub20s_35_[anLocalInt_61_];
				jagexHashMap.put(l, new Node_Sub39(anLocalInts_60_[anLocalInt_61_]));
			    }
			    for (int anLocalInt_95_ = 0;
				 anLocalInt_95_ < anLocalInt_57_;
				 anLocalInt_95_++)
				class59_sub20s_32_[anLocalInt_95_].method726
				    (anLocalInt_71_, anLocalInt_88_, 0,
				     anLocalInt_72_, f_73_);
			    anInt5355++;
			}
		    }
		}
	    }
	    for (int anLocalInt_96_ = 0; anLocalInt_96_ < anInt5369;
		 anLocalInt_96_++) {
		Node_Sub20 class59_sub20 = class59_sub20s[anLocalInt_96_];
		if (class59_sub20 != null)
		    class59_sub20.method724(anLocalInt_96_, (byte) -91);
	    }
	    for (int anLocalInt_97_ = 0;
		 anLocalInt_97_ < ((Class_s) this).anInt2550;
		 anLocalInt_97_++) {
		for (int anLocalInt_98_ = 0;
		     ((Class_s) this).anInt2549 > anLocalInt_98_;
		     anLocalInt_98_++) {
		    short[] anLocalInts_99_
			= (((Class_s_Sub2) this).aShortArrayArray5351
			   [(anLocalInt_97_
			     + ((Class_s) this).anInt2550 * anLocalInt_98_)]);
		    if (anLocalInts_99_ != null) {
			int anLocalInt_100_ = 0;
			int anLocalInt_101_ = 0;
			while (anLocalInts_99_.length > anLocalInt_101_) {
			    int anLocalInt_102_
				= anLocalInts_99_[anLocalInt_101_++] & 0xffff;
			    int anLocalInt_103_
				= anLocalInts_99_[anLocalInt_101_++] & 0xffff;
			    int anLocalInt_104_
				= anLocalInts_99_[anLocalInt_101_++] & 0xffff;
			    Node_Sub20 class59_sub20
				= class59_sub20s[anLocalInt_102_];
			    Node_Sub20 class59_sub20_105_
				= class59_sub20s[anLocalInt_103_];
			    Node_Sub20 class59_sub20_106_
				= class59_sub20s[anLocalInt_104_];
			    Node_Sub20 class59_sub20_107_ = null;
			    if (class59_sub20 != null) {
				class59_sub20_107_ = class59_sub20;
				class59_sub20.method723(anLocalInt_100_,
							anLocalInt_97_,
							anLocalInt_98_,
							1340270824);
			    }
			    if (class59_sub20_105_ != null) {
				class59_sub20_105_.method723(anLocalInt_100_,
							     anLocalInt_97_,
							     anLocalInt_98_,
							     1340270824);
				if (class59_sub20_107_ == null
				    || (((Node) class59_sub20_107_).hash
					> (((Node) class59_sub20_105_)
					   .hash)))
				    class59_sub20_107_ = class59_sub20_105_;
			    }
			    if (class59_sub20_106_ != null) {
				class59_sub20_106_.method723(anLocalInt_100_,
							     anLocalInt_97_,
							     anLocalInt_98_,
							     1340270824);
				if (class59_sub20_107_ == null
				    || (((Node) class59_sub20_106_).hash
					< (((Node) class59_sub20_107_)
					   .hash)))
				    class59_sub20_107_ = class59_sub20_106_;
			    }
			    if (class59_sub20_107_ != null) {
				if (class59_sub20 != null)
				    class59_sub20_107_.method724
					(anLocalInt_102_, (byte) -99);
				if (class59_sub20_105_ != null)
				    class59_sub20_107_.method724
					(anLocalInt_103_, (byte) -125);
				if (class59_sub20_106_ != null)
				    class59_sub20_107_.method724
					(anLocalInt_104_, (byte) -64);
				class59_sub20_107_.method723(anLocalInt_100_,
							     anLocalInt_97_,
							     anLocalInt_98_,
							     1340270824);
			    }
			    anLocalInt_100_++;
			}
		    }
		}
	    }
	    stream.upload();
	    anGlArrayBuffer_5372
		= (((Class_s_Sub2) this).aClass_ha_Sub3_5370.method2349
		   (nativeHeapBuffer, false, stream.method4164(), 7, anLocalInt));
	    ((Class_s_Sub2) this).aGlInterleavedArray_5378
		= new GlInterleavedArray(anGlArrayBuffer_5372, 5126, 3, 0);
	    aGlInterleavedArray_5375 = new GlInterleavedArray(anGlArrayBuffer_5372, 5121, 4, 12);
	    int anLocalInt_108_;
	    if (anIntArrayArrayArray5362 == null) {
		((Class_s_Sub2) this).aGlInterleavedArray_5379
		    = new GlInterleavedArray(anGlArrayBuffer_5372, 5126, 2, 16);
		anLocalInt_108_ = 24;
	    } else {
		((Class_s_Sub2) this).aGlInterleavedArray_5379
		    = new GlInterleavedArray(anGlArrayBuffer_5372, 5126, 3, 16);
		anLocalInt_108_ = 28;
	    }
	    if ((((Class_s_Sub2) this).anInt5371 & 0x7) != 0)
		((Class_s_Sub2) this).aGlInterleavedArray_5373
		    = new GlInterleavedArray(anGlArrayBuffer_5372, 5126, 3,
				   anLocalInt_108_);
	    long[] ls = new long[aClass59_Sub20Array5382.length];
	    for (int anLocalInt_109_ = 0;
		 anLocalInt_109_ < aClass59_Sub20Array5382.length;
		 anLocalInt_109_++) {
		Node_Sub20 class59_sub20
		    = aClass59_Sub20Array5382[anLocalInt_109_];
		ls[anLocalInt_109_] = ((Node) class59_sub20).hash;
		class59_sub20.method728(4, anInt5369);
	    }
	    Node_Sub49.method1150(false, aClass59_Sub20Array5382, ls);
	    if (aClass273_5363 != null)
		aClass273_5363.method3383(128);
	}
	anIntArrayArrayArray5362 = null;
	anIntArrayArrayArray5359 = null;
	aClass59_Sub20ArrayArrayArray5353 = null;
	aByteArrayArray5384 = null;
	aFloatArrayArray5377 = aFloatArrayArray5376 = aFloatArrayArray5380
	    = null;
	((Class_s_Sub2) this).anIntArrayArrayArray5365 = null;
	aJagexHashMap_5381 = null;
	anIntArrayArrayArray5368 = null;
	((Class_s_Sub2) this).anIntArrayArrayArray5356
	    = ((Class_s_Sub2) this).anIntArrayArrayArray5354 = null;
    }
    
    final void method3540(int argument_110_, int argument_111_) {
	/* empty */
    }
    
    final void method3536(HardwareLight argument_112_, int[] argument_113_) {
	aCyclicLinkedList_5360.add(new Node_Sub38((((Class_s_Sub2) this).aClass_ha_Sub3_5370), this, argument_112_, argument_113_));
    }
    
    final boolean method3542(tia_sub_35DoublyLinked argument_114_, int argument_115_,
			     int argument_116_, int argument_117_,
			     int argument_118_, boolean argument_119_) {
	if (aClass273_5363 == null || argument_114_ == null)
	    return false;
	int anLocalInt
	    = (-((((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		  .anInt4886) * argument_116_
		 >> 8) + argument_115_
	       >> (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .anInt4847));
	int anLocalInt_120_
	    = (-((((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		  .anInt4930) * argument_116_
		 >> 8) + argument_117_
	       >> (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .anInt4847));
	return aClass273_5363.method3378(argument_114_, 1, anLocalInt,
					 anLocalInt_120_);
    }
    
    private final void method3550(boolean[][] argument_121_, int argument_122_,
				  boolean argument_123_, int argument_124_,
				  int argument_125_, int argument_126_,
				  int argument_127_, int argument_128_) {
	if (argument_125_ >= -48)
	    anIntArrayArrayArray5359 = null;
	if (aClass59_Sub20Array5382 != null) {
	    int anLocalInt = argument_126_ + argument_126_ + 1;
	    anLocalInt *= anLocalInt;
	    if (anLocalInt
		> (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .anIntArray4998).length)
		((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		    .anIntArray4998
		    = new int[anLocalInt];
	    if (((Packet)
		 (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		  .aClass59_Sub28_Sub2_4957)).data.length
		< anInt5355 * 2)
		((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		    .aClass59_Sub28_Sub2_4957
		    = new FloatPacket(anInt5355 * 2);
	    int anLocalInt_129_ = argument_127_ - argument_126_;
	    int anLocalInt_130_ = anLocalInt_129_;
	    if (anLocalInt_129_ < 0)
		anLocalInt_129_ = 0;
	    int anLocalInt_131_ = -argument_126_ + argument_124_;
	    int anLocalInt_132_ = anLocalInt_131_;
	    if (anLocalInt_131_ < 0)
		anLocalInt_131_ = 0;
	    int anLocalInt_133_ = argument_126_ + argument_127_;
	    if (anLocalInt_133_ > ((Class_s) this).anInt2550 - 1)
		anLocalInt_133_ = ((Class_s) this).anInt2550 - 1;
	    int anLocalInt_134_ = argument_124_ + argument_126_;
	    if (((Class_s) this).anInt2549 - 1 < anLocalInt_134_)
		anLocalInt_134_ = ((Class_s) this).anInt2549 - 1;
	    int anLocalInt_135_ = 0;
	    int[] anLocalInts
		= (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .anIntArray4998);
	    for (int anLocalInt_136_ = anLocalInt_129_;
		 anLocalInt_133_ >= anLocalInt_136_; anLocalInt_136_++) {
		boolean[] anLocalBooleans
		    = argument_121_[-anLocalInt_130_ + anLocalInt_136_];
		for (int anLocalInt_137_ = anLocalInt_131_;
		     anLocalInt_137_ <= anLocalInt_134_; anLocalInt_137_++) {
		    if (anLocalBooleans[anLocalInt_137_ - anLocalInt_132_])
			anLocalInts[anLocalInt_135_++]
			    = (anLocalInt_137_ * ((Class_s) this).anInt2550
			       + anLocalInt_136_);
		}
	    }
	    if (argument_128_ == -1)
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setupConfig8();
	    else {
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .method2306((float) argument_128_);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .method2343();
	    }
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setLightingEnabled((((Class_s_Sub2) this).anInt5371 & 0x7) != 0);
	    for (int anLocalInt_138_ = 0;
		 aClass59_Sub20Array5382.length > anLocalInt_138_;
		 anLocalInt_138_++)
		aClass59_Sub20Array5382[anLocalInt_138_]
		    .method722(anLocalInts, anLocalInt_135_, (byte) -91);
	    if (!aCyclicLinkedList_5360.isEmpty()) {
		int anLocalInt_139_ = (((GlToolkit) (((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
				       .fogColour);
		int anLocalInt_140_ = (((GlToolkit) (((Class_s_Sub2) this)
							 .aClass_ha_Sub3_5370))
				       .anInt4896);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.setFog(0, anLocalInt_140_, ((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4932);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setLightingEnabled(false);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .method2276(false);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.setBlendingConfiguration(128);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.method2333(-2);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.bindTexture((((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370).aClass142_Sub4_4955));
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setCombineModes(7681, 8448);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .method2334(34166, 770, 0, 34192);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setTextureAlphaCombiners(0, 770, 34167);
		for (Node node = aCyclicLinkedList_5360.getFirst();
		     node != null;
		     node = aCyclicLinkedList_5360.getNext()) {
		    Node_Sub38 class59_sub38 = (Node_Sub38) node;
		    class59_sub38.method1068(121, argument_126_, argument_121_,
					     argument_127_, argument_124_);
		}
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.method2334(5890, 768,
								     0, 34192);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setTextureAlphaCombiners(0, 770, 5890);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.bind(null);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.setFog(anLocalInt_139_, anLocalInt_140_, ((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4932);
	    }
	    if (aClass273_5363 != null) {
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370.bindArrays(null, null, ((Class_s_Sub2) this).aGlInterleavedArray_5378, ((Class_s_Sub2) this).aGlInterleavedArray_5379);
		aClass273_5363.method3377(argument_127_, argument_124_,
					  argument_121_, argument_126_, true,
					  argument_123_);
		OpenGL.glPopMatrix();
	    }
	}
    }
    
    static final long method3551
	(int argument, int argument_141_, int argument_142_, int argument_143_,
	 int argument_144_, int argument_145_, int argument_146_) {
	Class212.aCalendar1506.clear();
	Class212.aCalendar1506.set(argument_144_, argument, argument_143_,
				   argument_142_, argument_146_,
				   argument_141_);
	return Class212.aCalendar1506.getTime().getTime();
    }
    
    final void U(int argument_147_, int argument_148_, int[] argument_149_,
		 int[] argument_150_, int[] argument_151_, int[] argument_152_,
		 int[] argument_153_, int[] argument_154_, int[] argument_155_,
		 int[] argument_156_, int argument_157_, int argument_158_,
		 int argument_159_, boolean argument_160_) {
	if (argument_150_ != null && anIntArrayArrayArray5368 == null)
	    anIntArrayArrayArray5368 = (new int[((Class_s) this).anInt2550]
					[((Class_s) this).anInt2549][]);
	if (argument_152_ != null && anIntArrayArrayArray5362 == null)
	    anIntArrayArrayArray5362 = (new int[((Class_s) this).anInt2550]
					[((Class_s) this).anInt2549][]);
	TextureSource textureSource
	    = (((GraphicsToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
	       .textureSource);
	((Class_s_Sub2) this).anIntArrayArrayArray5356[argument_147_]
	    [argument_148_]
	    = argument_149_;
	((Class_s_Sub2) this).anIntArrayArrayArray5354[argument_147_]
	    [argument_148_]
	    = argument_151_;
	((Class_s_Sub2) this).anIntArrayArrayArray5365[argument_147_]
	    [argument_148_]
	    = argument_153_;
	anIntArrayArrayArray5359[argument_147_][argument_148_] = argument_154_;
	if (anIntArrayArrayArray5362 != null)
	    anIntArrayArrayArray5362[argument_147_][argument_148_]
		= argument_152_;
	if (anIntArrayArrayArray5368 != null)
	    anIntArrayArrayArray5368[argument_147_][argument_148_]
		= argument_150_;
	Node_Sub20[] class59_sub20s
	    = (aClass59_Sub20ArrayArrayArray5353[argument_147_][argument_148_]
	       = new Node_Sub20[argument_153_.length]);
	for (int anLocalInt = 0; anLocalInt < argument_153_.length;
	     anLocalInt++) {
	    int anLocalInt_161_ = argument_155_[anLocalInt];
	    int anLocalInt_162_ = argument_156_[anLocalInt];
	    if ((((Class_s_Sub2) this).anInt5371 & 0x20) != 0
		&& anLocalInt_161_ != -1
		&& (((TextureDescriptor) textureSource.getDescriptor(anLocalInt_161_, true))
		    .aBoolean836)) {
		anLocalInt_161_ = -1;
		anLocalInt_162_ = 128;
	    }
	    long l = ((long) (anLocalInt_162_ << 14)
		      | ((long) argument_157_ << 28
			 | ((long) argument_158_ << 42
			    | (long) argument_159_ << 48))
		      | (long) anLocalInt_161_);
	    Node node;
	    for (node = aJagexHashMap_5381.get(l); node != null;
		 node = aJagexHashMap_5381.method1526()) {
		Node_Sub20 class59_sub20 = (Node_Sub20) node;
		if ((((Node_Sub20) class59_sub20).anInt4019
		     == anLocalInt_161_)
		    && ((float) anLocalInt_162_
			== ((Node_Sub20) class59_sub20).aFloat4024)
		    && (((Node_Sub20) class59_sub20).anInt4017
			== argument_157_)
		    && (((Node_Sub20) class59_sub20).anInt4015
			== argument_158_)
		    && (((Node_Sub20) class59_sub20).anInt4018
			== argument_159_))
		    break;
	    }
	    if (node == null) {
		class59_sub20s[anLocalInt]
		    = new Node_Sub20(this, anLocalInt_161_, anLocalInt_162_,
					argument_157_, argument_158_,
					argument_159_);
		aJagexHashMap_5381.put(l, class59_sub20s[anLocalInt]);
	    } else
		class59_sub20s[anLocalInt] = (Node_Sub20) node;
	}
	if (argument_160_)
	    aByteArrayArray5358[argument_147_][argument_148_]
		= (byte) MathStatics.OR((aByteArrayArray5358[argument_147_][argument_148_]), 1);
	if (anInt5374 < argument_153_.length)
	    anInt5374 = argument_153_.length;
	anInt5383 += argument_153_.length;
    }
    
    final void method3533(int argument_163_, int argument_164_,
			  int argument_165_, boolean[][] argument_166_,
			  boolean argument_167_, int argument_168_) {
	method3550(argument_166_, argument_168_, argument_167_, argument_164_,
		   -49, argument_165_, argument_163_, -1);
    }
    
    final tia_sub_35DoublyLinked fa(int argument_169_, int argument_170_,
			tia_sub_35DoublyLinked argument_171_) {
	if ((aByteArrayArray5358[argument_169_][argument_170_] & 0x1) == 0)
	    return null;
	int anLocalInt
	    = (((Class_s) this).anInt2547
	       >> (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .anInt4847));
	tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2 = (tia_sub_35_Sub2DoublyLinked) argument_171_;
	tia_sub_35_Sub2DoublyLinked var_tia_sub_35_Sub2_172_;
	if (var_tia_sub_35_Sub2 == null
	    || !var_tia_sub_35_Sub2.method1224(-111, anLocalInt, anLocalInt))
	    var_tia_sub_35_Sub2_172_
		= new tia_sub_35_Sub2DoublyLinked((((Class_s_Sub2) this)
				       .aClass_ha_Sub3_5370),
				      anLocalInt, anLocalInt);
	else {
	    var_tia_sub_35_Sub2_172_ = var_tia_sub_35_Sub2;
	    var_tia_sub_35_Sub2_172_.method1227(0);
	}
	var_tia_sub_35_Sub2_172_.method1228((byte) 57, 0, anLocalInt,
					    anLocalInt, 0);
	method3549(-112, argument_169_, var_tia_sub_35_Sub2_172_,
		   argument_170_);
	return var_tia_sub_35_Sub2_172_;
    }
    
    public static void method3552(int argument) {
	aString5366 = null;
    }
    
    Class_s_Sub2(GlToolkit argument_173_, int argument_174_,
		 int argument_175_, int argument_176_, int argument_177_,
		 int[][] argument_178_, int[][] argument_179_,
		 int argument_180_) {
	super(argument_176_, argument_177_, argument_180_, argument_178_);
	anInt5357 = ((Class_s) this).anInt2548 - 2;
	((Class_s_Sub2) this).aClass_ha_Sub3_5370 = argument_173_;
	aFloatArrayArray5376 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	((Class_s_Sub2) this).anIntArrayArrayArray5354
	    = new int[argument_176_][argument_177_][];
	anInt5361 = 1 << anInt5357;
	aFloatArrayArray5377 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	aClass59_Sub20ArrayArrayArray5353
	    = new Node_Sub20[argument_176_][argument_177_][];
	((Class_s_Sub2) this).anIntArrayArrayArray5356
	    = new int[argument_176_][argument_177_][];
	((Class_s_Sub2) this).anIntArrayArrayArray5365
	    = new int[argument_176_][argument_177_][];
	aByteArrayArray5384 = new byte[argument_176_ + 1][argument_177_ + 1];
	aByteArrayArray5358 = new byte[argument_176_][argument_177_];
	aFloatArrayArray5380 = (new float[((Class_s) this).anInt2550 + 1]
				[((Class_s) this).anInt2549 + 1]);
	anIntArrayArrayArray5368 = new int[argument_176_][argument_177_][];
	((Class_s_Sub2) this).aShortArrayArray5351
	    = new short[argument_176_ * argument_177_][];
	anIntArrayArrayArray5359 = new int[argument_176_][argument_177_][];
	((Class_s_Sub2) this).anInt5371 = argument_175_;
	for (int anLocalInt = 1; anLocalInt < ((Class_s) this).anInt2549;
	     anLocalInt++) {
	    for (int anLocalInt_181_ = 1;
		 anLocalInt_181_ < ((Class_s) this).anInt2550;
		 anLocalInt_181_++) {
		int anLocalInt_182_
		    = (-argument_179_[anLocalInt_181_ - 1][anLocalInt]
		       + argument_179_[anLocalInt_181_ + 1][anLocalInt]);
		int anLocalInt_183_
		    = (-argument_179_[anLocalInt_181_][anLocalInt - 1]
		       + argument_179_[anLocalInt_181_][anLocalInt + 1]);
		float f
		    = (float) (1.0
			       / Math.sqrt((double) ((anLocalInt_183_
						      * anLocalInt_183_)
						     + (anLocalInt_182_
							* anLocalInt_182_)
						     + (argument_180_ * 4
							* argument_180_))));
		aFloatArrayArray5377[anLocalInt_181_][anLocalInt]
		    = f * (float) anLocalInt_182_;
		aFloatArrayArray5376[anLocalInt_181_][anLocalInt]
		    = f * (float) (-argument_180_ * 2);
		aFloatArrayArray5380[anLocalInt_181_][anLocalInt]
		    = (float) anLocalInt_183_ * f;
	    }
	}
	aJagexHashMap_5381 = new JagexHashMap(128);
	if ((((Class_s_Sub2) this).anInt5371 & 0x10) != 0)
	    aClass273_5363
		= new Class273(((Class_s_Sub2) this).aClass_ha_Sub3_5370,
			       this);
    }
    
    final void method3538
	(int argument_184_, int argument_185_, int[] argument_186_,
	 int[] argument_187_, int[] argument_188_, int[] argument_189_,
	 int[] argument_190_, int[] argument_191_, int[] argument_192_,
	 int[] argument_193_, int[] argument_194_, int[] argument_195_,
	 int[] argument_196_, int argument_197_, int argument_198_,
	 int argument_199_, boolean argument_200_) {
	int anLocalInt = argument_193_.length;
	int[] anLocalInts = new int[anLocalInt * 3];
	int[] anLocalInts_201_ = new int[anLocalInt * 3];
	int[] anLocalInts_202_ = new int[anLocalInt * 3];
	int[] anLocalInts_203_ = new int[anLocalInt * 3];
	int[] anLocalInts_204_ = new int[anLocalInt * 3];
	int[] anLocalInts_205_ = new int[anLocalInt * 3];
	int[] anLocalInts_206_
	    = argument_187_ != null ? new int[anLocalInt * 3] : null;
	int[] anLocalInts_207_
	    = argument_189_ != null ? new int[anLocalInt * 3] : null;
	int anLocalInt_208_ = 0;
	for (int anLocalInt_209_ = 0; anLocalInt > anLocalInt_209_;
	     anLocalInt_209_++) {
	    int anLocalInt_210_ = argument_190_[anLocalInt_209_];
	    int anLocalInt_211_ = argument_191_[anLocalInt_209_];
	    int anLocalInt_212_ = argument_192_[anLocalInt_209_];
	    anLocalInts[anLocalInt_208_] = argument_186_[anLocalInt_210_];
	    anLocalInts_201_[anLocalInt_208_] = argument_188_[anLocalInt_210_];
	    anLocalInts_202_[anLocalInt_208_] = argument_193_[anLocalInt_209_];
	    anLocalInts_204_[anLocalInt_208_] = argument_195_[anLocalInt_209_];
	    anLocalInts_205_[anLocalInt_208_] = argument_196_[anLocalInt_209_];
	    anLocalInts_203_[anLocalInt_208_]
		= (argument_194_ != null ? argument_194_[anLocalInt_209_]
		   : argument_193_[anLocalInt_209_]);
	    if (argument_187_ != null)
		anLocalInts_206_[anLocalInt_208_]
		    = argument_187_[anLocalInt_210_];
	    if (argument_189_ != null)
		anLocalInts_207_[anLocalInt_208_]
		    = argument_189_[anLocalInt_210_];
	    anLocalInt_208_++;
	    anLocalInts[anLocalInt_208_] = argument_186_[anLocalInt_211_];
	    anLocalInts_201_[anLocalInt_208_] = argument_188_[anLocalInt_211_];
	    anLocalInts_202_[anLocalInt_208_] = argument_193_[anLocalInt_209_];
	    anLocalInts_204_[anLocalInt_208_] = argument_195_[anLocalInt_209_];
	    anLocalInts_205_[anLocalInt_208_] = argument_196_[anLocalInt_209_];
	    anLocalInts_203_[anLocalInt_208_]
		= (argument_194_ != null ? argument_194_[anLocalInt_209_]
		   : argument_193_[anLocalInt_209_]);
	    if (argument_187_ != null)
		anLocalInts_206_[anLocalInt_208_]
		    = argument_187_[anLocalInt_211_];
	    if (argument_189_ != null)
		anLocalInts_207_[anLocalInt_208_]
		    = argument_189_[anLocalInt_211_];
	    anLocalInt_208_++;
	    anLocalInts[anLocalInt_208_] = argument_186_[anLocalInt_212_];
	    anLocalInts_201_[anLocalInt_208_] = argument_188_[anLocalInt_212_];
	    anLocalInts_202_[anLocalInt_208_] = argument_193_[anLocalInt_209_];
	    anLocalInts_204_[anLocalInt_208_] = argument_195_[anLocalInt_209_];
	    anLocalInts_205_[anLocalInt_208_] = argument_196_[anLocalInt_209_];
	    anLocalInts_203_[anLocalInt_208_]
		= (argument_194_ == null ? argument_193_[anLocalInt_209_]
		   : argument_194_[anLocalInt_209_]);
	    if (argument_187_ != null)
		anLocalInts_206_[anLocalInt_208_]
		    = argument_187_[anLocalInt_212_];
	    if (argument_189_ != null)
		anLocalInts_207_[anLocalInt_208_]
		    = argument_189_[anLocalInt_212_];
	    anLocalInt_208_++;
	}
	U(argument_184_, argument_185_, anLocalInts, anLocalInts_206_,
	  anLocalInts_201_, anLocalInts_207_, anLocalInts_202_,
	  anLocalInts_203_, anLocalInts_204_, anLocalInts_205_, argument_197_,
	  argument_198_, argument_199_, argument_200_);
    }
    
    final void ka(int argument_213_, int argument_214_, int argument_215_) {
	if ((aByteArrayArray5384[argument_213_][argument_214_] & 0xff)
	    < argument_215_)
	    aByteArrayArray5384[argument_213_][argument_214_]
		= (byte) argument_215_;
    }
    
    static final Node_Sub9_Sub2 method3553(int argument) {
	return GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546;
    }
    
    final void CA(tia_sub_35DoublyLinked argument_216_, int argument_217_,
		  int argument_218_, int argument_219_, int argument_220_,
		  boolean argument_221_) {
	if (aClass273_5363 != null && argument_216_ != null) {
	    int anLocalInt
		= (argument_217_ - ((((GlToolkit) (((Class_s_Sub2) this)
						       .aClass_ha_Sub3_5370))
				     .anInt4886) * argument_218_
				    >> 8)
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	    int anLocalInt_222_
		= (argument_219_ - (argument_218_ * (((GlToolkit)
						      (((Class_s_Sub2) this)
						       .aClass_ha_Sub3_5370))
						     .anInt4930)
				    >> 8)
		   >> ((GlToolkit)
		       ((Class_s_Sub2) this).aClass_ha_Sub3_5370).anInt4847);
	    aClass273_5363.method3381(anLocalInt_222_, -27552, argument_216_,
				      anLocalInt);
	}
    }
    
    final void method3535(int argument_223_, int argument_224_,
			  int argument_225_, int argument_226_,
			  int argument_227_, int argument_228_,
			  int argument_229_, boolean[][] argument_230_) {
	if (anInt5383 > 0) {
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setMode0();
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setFogEnabled(false);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setLightingEnabled(false);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setDepthTestEnabled(false);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.method2276(false);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.setBlendingConfiguration(0);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.method2333(-2);
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.bind(null);
	    Class321.aFloatArray2638[9] = 0.0F;
	    Class321.aFloatArray2638[13]
		= 1.0F - (((float) (argument_229_ * argument_225_) / 128.0F
			   + (float) (argument_224_ * 2))
			  / (float) (((GlToolkit) (((Class_s_Sub2) this)
						       .aClass_ha_Sub3_5370))
				     .viewportH));
	    Class321.aFloatArray2638[12]
		= -1.0F - (((float) -(argument_223_ * 2)
			    + (float) (argument_226_ * argument_225_) / 128.0F)
			   / (float) (((GlToolkit) (((Class_s_Sub2) this)
							.aClass_ha_Sub3_5370))
				      .viewportW));
	    Class321.aFloatArray2638[2] = 0.0F;
	    Class321.aFloatArray2638[4] = 0.0F;
	    Class321.aFloatArray2638[0]
		= ((float) argument_225_
		   / ((float) (((GlToolkit)
				((Class_s_Sub2) this).aClass_ha_Sub3_5370)
			       .viewportW)
		      * ((float) ((Class_s) this).anInt2547 * 128.0F)));
	    Class321.aFloatArray2638[15] = 1.0F;
	    Class321.aFloatArray2638[11] = 0.0F;
	    Class321.aFloatArray2638[7] = 0.0F;
	    Class321.aFloatArray2638[5]
		= ((float) argument_225_
		   / ((float) ((Class_s) this).anInt2547 * 128.0F
		      * (float) (((GlToolkit)
				  ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
				 .viewportH)));
	    Class321.aFloatArray2638[14] = 0.0F;
	    Class321.aFloatArray2638[6] = 0.0F;
	    Class321.aFloatArray2638[8] = 0.0F;
	    Class321.aFloatArray2638[3] = 0.0F;
	    Class321.aFloatArray2638[10] = 0.0F;
	    Class321.aFloatArray2638[1] = 0.0F;
	    OpenGL.glMatrixMode(5889);
	    OpenGL.glLoadMatrixf(Class321.aFloatArray2638, 0);
	    Class321.aFloatArray2638[9] = 1.0F;
	    Class321.aFloatArray2638[11] = 0.0F;
	    Class321.aFloatArray2638[14] = 0.0F;
	    Class321.aFloatArray2638[1] = 0.0F;
	    Class321.aFloatArray2638[6] = 1.0F;
	    Class321.aFloatArray2638[12] = 0.0F;
	    Class321.aFloatArray2638[5] = 0.0F;
	    Class321.aFloatArray2638[10] = 0.0F;
	    Class321.aFloatArray2638[4] = 0.0F;
	    Class321.aFloatArray2638[8] = 0.0F;
	    Class321.aFloatArray2638[2] = 0.0F;
	    Class321.aFloatArray2638[15] = 1.0F;
	    Class321.aFloatArray2638[7] = 0.0F;
	    Class321.aFloatArray2638[3] = 0.0F;
	    Class321.aFloatArray2638[0] = 1.0F;
	    Class321.aFloatArray2638[13] = 0.0F;
	    OpenGL.glMatrixMode(5888);
	    OpenGL.glLoadMatrixf(Class321.aFloatArray2638, 0);
	    if ((((Class_s_Sub2) this).anInt5371 & 0x7) == 0)
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setLightingEnabled(false);
	    else {
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .setLightingEnabled(true);
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .loadLightPositions();
	    }
	    ((Class_s_Sub2) this).aClass_ha_Sub3_5370.bindArrays(((Class_s_Sub2) this).aGlInterleavedArray_5373, aGlInterleavedArray_5375, ((Class_s_Sub2) this).aGlInterleavedArray_5378, ((Class_s_Sub2) this).aGlInterleavedArray_5379);
	    if (anInt5355 * 2
		> ((Packet)
		   (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		    .aClass59_Sub28_Sub2_4957)).data.length)
		((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		    .aClass59_Sub28_Sub2_4957
		    = new FloatPacket(anInt5355 * 2);
	    else
		((Packet)
		 (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		  .aClass59_Sub28_Sub2_4957)).pos
		    = 0;
	    int anLocalInt = 0;
	    FloatPacket class59_sub28_sub2
		= (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		   .aClass59_Sub28_Sub2_4957);
	    if (((GlToolkit) ((Class_s_Sub2) this).aClass_ha_Sub3_5370)
		.isBigEndian) {
		for (int anLocalInt_231_ = argument_227_;
		     argument_229_ > anLocalInt_231_; anLocalInt_231_++) {
		    int anLocalInt_232_
			= (anLocalInt_231_ * ((Class_s) this).anInt2550
			   + argument_226_);
		    for (int anLocalInt_233_ = argument_226_;
			 argument_228_ > anLocalInt_233_; anLocalInt_233_++) {
			if (argument_230_[-argument_226_ + anLocalInt_233_]
			    [-argument_227_ + anLocalInt_231_]) {
			    short[] anLocalInts
				= (((Class_s_Sub2) this).aShortArrayArray5351
				   [anLocalInt_232_]);
			    if (anLocalInts != null) {
				for (int anLocalInt_234_ = 0;
				     anLocalInts.length > anLocalInt_234_;
				     anLocalInt_234_++) {
				    class59_sub28_sub2.p2
                            ((anLocalInts[anLocalInt_234_]
                                    & 0xffff));
				    anLocalInt++;
				}
			    }
			}
			anLocalInt_232_++;
		    }
		}
	    } else {
		for (int anLocalInt_235_ = argument_227_;
		     anLocalInt_235_ < argument_229_; anLocalInt_235_++) {
		    int anLocalInt_236_
			= (((Class_s) this).anInt2550 * anLocalInt_235_
			   + argument_226_);
		    for (int anLocalInt_237_ = argument_226_;
			 argument_228_ > anLocalInt_237_; anLocalInt_237_++) {
			if (argument_230_[anLocalInt_237_ - argument_226_]
			    [-argument_227_ + anLocalInt_235_]) {
			    short[] anLocalInts
				= (((Class_s_Sub2) this).aShortArrayArray5351
				   [anLocalInt_236_]);
			    if (anLocalInts != null) {
				for (int anLocalInt_238_ = 0;
				     anLocalInt_238_ < anLocalInts.length;
				     anLocalInt_238_++) {
				    class59_sub28_sub2.p2i
                            ((anLocalInts[anLocalInt_238_]
                                    & 0xffff));
				    anLocalInt++;
				}
			    }
			}
			anLocalInt_236_++;
		    }
		}
	    }
	    if (anLocalInt > 0) {
		GlElementArray class12_sub2
		    = (new GlElementArray
		       (((Class_s_Sub2) this).aClass_ha_Sub3_5370, 5123,
			((Packet) class59_sub28_sub2).data,
			((Packet) class59_sub28_sub2).pos));
		((Class_s_Sub2) this).aClass_ha_Sub3_5370
		    .drawElements(class12_sub2, anLocalInt, 4, 0);
	    }
	}
    }
    
    static final int method3554(byte argument) {
	int anLocalInt;
	if (ClanSettingsDelta.anInt1544 < 96) {
	    Statics.method413(true, (byte) -122);
	    anLocalInt = 1;
	} else {
	    int anLocalInt_239_ = Class26.method352(true);
	    if (anLocalInt_239_ > 100) {
		if (anLocalInt_239_ <= 500) {
		    anLocalInt = 3;
		    Node_Sub7.method569(0);
		} else if (anLocalInt_239_ <= 1000) {
		    Class62_Sub29.method1476(1);
		    anLocalInt = 2;
		} else {
		    Statics.method413(true, (byte) -108);
		    anLocalInt = 1;
		}
	    } else {
		anLocalInt = 4;
		Class2_Sub1.method199(-18861);
	    }
	}
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub26_4295.method1464(104)
	    != 0) {
	    AthmosphericConditions.aClass59_Sub50_116.method1159(0,
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub26_4316),
						  100);
	    Class215.method2991((byte) -41, false, 0);
	}
	Class251.method3240(false);
	return anLocalInt;
    }
}
