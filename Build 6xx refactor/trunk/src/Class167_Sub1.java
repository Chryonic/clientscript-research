/* Class167_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167_Sub1 extends Class167
{
    static int anInt5055 = 4096;
    private int[] anIntArray5056;
    private static int anInt5057 = 0;
    private int[] anIntArray5058;
    private byte[] aByteArray5059;
    static int anInt5060 = 4096;
    private int[] anIntArray5061;
    private short[] aShortArray5062;
    private Class167_Sub1 aClass167_Sub1_5063;
    private boolean aBoolean5064 = false;
    private int anInt5065;
    private Class205[] aClass205Array5066;
    private int[][] anIntArrayArray5067;
    private Class167_Sub1 aClass167_Sub1_5068;
    private int anInt5069;
    private int anInt5070;
    private float[][] aFloatArrayArray5071;
    private short[] aShortArray5072;
    private int anInt5073;
    private Class167_Sub1 aClass167_Sub1_5074;
    private int[] anIntArray5075;
    private Class56[] aClass56Array5076;
    private int[] anIntArray5077;
    private int[] anIntArray5078;
    private Class38[] aClass38Array5079;
    private short aShort5080;
    private int anInt5081;
    private Class312[] aClass312Array5082;
    private boolean aBoolean5083;
    private int[] anIntArray5084;
    private int[] anIntArray5085;
    private int[][] anIntArrayArray5086;
    private Class167_Sub1 aClass167_Sub1_5087;
    private int[] anIntArray5088;
    private JavaToolkit aClass_ha__5089;
    private short aShort5090;
    private int[] anIntArray5091;
    private Class35[] aClass35Array5092;
    private boolean aBoolean5093;
    private int anInt5094;
    private short[] aShortArray5095;
    private int[] anIntArray5096;
    private boolean aBoolean5097 = false;
    private float[][] aFloatArrayArray5098;
    private Class167_Sub1 aClass167_Sub1_5099;
    private Class167_Sub1 aClass167_Sub1_5100;
    private int[] anIntArray5101;
    private boolean aBoolean5102;
    private Class185[] aClass185Array5103;
    private short[] aShortArray5104;
    private byte[] aByteArray5105;
    private Class293 aClass293_5106;
    private short aShort5107;
    private short aShort5108;
    private int[] anIntArray5109;
    private short[] aShortArray5110;
    private int[] anIntArray5111;
    private short[] aShortArray5112;
    private int[] anIntArray5113;
    private boolean aBoolean5114;
    private int[] anIntArray5115;
    private short[] aShortArray5116;
    private int anInt5117;
    private Class293 aClass293_5118;
    private int[] anIntArray5119;
    private Class167_Sub1 aClass167_Sub1_5120;
    private int anInt5121;
    private Class167_Sub1 aClass167_Sub1_5122;
    private short aShort5123;
    private int[] anIntArray5124;
    private Class350_Sub1 aClass350_Sub1_5125;
    private int[] anIntArray5126;
    private short aShort5127;
    private short[] aShortArray5128;
    private Class167_Sub1 aClass167_Sub1_5129;
    private int[] anIntArray5130;
    private boolean aBoolean5131;
    private byte[] aByteArray5132;
    private short aShort5133;
    private Class89 aClass89_5134;
    private Class167_Sub1 aClass167_Sub1_5135;
    private int anInt5136;
    private int[] anIntArray5137;
    private Class56[] aClass56Array5138;
    private int[][] anIntArrayArray5139;
    private int anInt5140;
    private short aShort5141;
    private int anInt5142;
    private int[] anIntArray5143;
    private int[] anIntArray5144;
    
    final boolean method2645(int argument_0_, int argument_1_,
			     Class350 argument_2_, boolean argument_3_,
			     int argument_4_) {
	return method2674(argument_0_, argument_1_, argument_2_, argument_3_,
			  argument_4_, -1);
    }
    
    final int V() {
	if (!aBoolean5064)
	    method2693();
	return aShort5108;
    }
    
    private final void method2662(int argument_5_) {
	int anLocalInt = 0;
	int anLocalInt_6_ = ((JavaToolkit) aClass_ha__5089).anInt4643;
	short anLocalInt_7_ = aShortArray5095[argument_5_];
	short anLocalInt_8_ = aShortArray5112[argument_5_];
	short anLocalInt_9_ = aShortArray5110[argument_5_];
	int anLocalInt_10_ = anIntArray5088[anLocalInt_7_];
	int anLocalInt_11_ = anIntArray5088[anLocalInt_8_];
	int anLocalInt_12_ = anIntArray5088[anLocalInt_9_];
	if (aByteArray5105 == null)
	    ((Class89) aClass89_5134).anInt646 = 0;
	else
	    ((Class89) aClass89_5134).anInt646
		= aByteArray5105[argument_5_] & 0xff;
	if (anLocalInt_10_ >= anLocalInt_6_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_7_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_7_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_7_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5058[argument_5_] & 0xffff;
	} else {
	    int anLocalInt_13_ = anIntArray5109[anLocalInt_7_];
	    int anLocalInt_14_ = anIntArray5111[anLocalInt_7_];
	    int anLocalInt_15_ = anIntArray5058[argument_5_] & 0xffff;
	    if (anLocalInt_12_ >= anLocalInt_6_) {
		int anLocalInt_16_
		    = ((anLocalInt_6_ - anLocalInt_10_)
		       * (65536 / (anLocalInt_12_ - anLocalInt_10_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_13_
			   + (((anIntArray5109[anLocalInt_9_] - anLocalInt_13_)
			       * anLocalInt_16_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_14_
			   + (((anIntArray5111[anLocalInt_9_] - anLocalInt_14_)
			       * anLocalInt_16_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_15_ + (((anIntArray5126[argument_5_] & 0xffff)
					 - anLocalInt_15_) * anLocalInt_16_
					>> 16);
	    }
	    if (anLocalInt_11_ >= anLocalInt_6_) {
		int anLocalInt_17_
		    = ((anLocalInt_6_ - anLocalInt_10_)
		       * (65536 / (anLocalInt_11_ - anLocalInt_10_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_13_
			   + (((anIntArray5109[anLocalInt_8_] - anLocalInt_13_)
			       * anLocalInt_17_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_14_
			   + (((anIntArray5111[anLocalInt_8_] - anLocalInt_14_)
			       * anLocalInt_17_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_15_ + (((anIntArray5115[argument_5_] & 0xffff)
					 - anLocalInt_15_) * anLocalInt_17_
					>> 16);
	    }
	}
	if (anLocalInt_11_ >= anLocalInt_6_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_8_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_8_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_8_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5115[argument_5_] & 0xffff;
	} else {
	    int anLocalInt_18_ = anIntArray5109[anLocalInt_8_];
	    int anLocalInt_19_ = anIntArray5111[anLocalInt_8_];
	    int anLocalInt_20_ = anIntArray5115[argument_5_] & 0xffff;
	    if (anLocalInt_10_ >= anLocalInt_6_) {
		int anLocalInt_21_
		    = ((anLocalInt_6_ - anLocalInt_11_)
		       * (65536 / (anLocalInt_10_ - anLocalInt_11_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_18_
			   + (((anIntArray5109[anLocalInt_7_] - anLocalInt_18_)
			       * anLocalInt_21_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_19_
			   + (((anIntArray5111[anLocalInt_7_] - anLocalInt_19_)
			       * anLocalInt_21_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_20_ + (((anIntArray5058[argument_5_] & 0xffff)
					 - anLocalInt_20_) * anLocalInt_21_
					>> 16);
	    }
	    if (anLocalInt_12_ >= anLocalInt_6_) {
		int anLocalInt_22_
		    = ((anLocalInt_6_ - anLocalInt_11_)
		       * (65536 / (anLocalInt_12_ - anLocalInt_11_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_18_
			   + (((anIntArray5109[anLocalInt_9_] - anLocalInt_18_)
			       * anLocalInt_22_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_19_
			   + (((anIntArray5111[anLocalInt_9_] - anLocalInt_19_)
			       * anLocalInt_22_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_20_ + (((anIntArray5126[argument_5_] & 0xffff)
					 - anLocalInt_20_) * anLocalInt_22_
					>> 16);
	    }
	}
	if (anLocalInt_12_ >= anLocalInt_6_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_9_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_9_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_9_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5126[argument_5_] & 0xffff;
	} else {
	    int anLocalInt_23_ = anIntArray5109[anLocalInt_9_];
	    int anLocalInt_24_ = anIntArray5111[anLocalInt_9_];
	    int anLocalInt_25_ = anIntArray5126[argument_5_] & 0xffff;
	    if (anLocalInt_11_ >= anLocalInt_6_) {
		int anLocalInt_26_
		    = ((anLocalInt_6_ - anLocalInt_12_)
		       * (65536 / (anLocalInt_11_ - anLocalInt_12_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_23_
			   + (((anIntArray5109[anLocalInt_8_] - anLocalInt_23_)
			       * anLocalInt_26_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_24_
			   + (((anIntArray5111[anLocalInt_8_] - anLocalInt_24_)
			       * anLocalInt_26_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_25_ + (((anIntArray5115[argument_5_] & 0xffff)
					 - anLocalInt_25_) * anLocalInt_26_
					>> 16);
	    }
	    if (anLocalInt_10_ >= anLocalInt_6_) {
		int anLocalInt_27_
		    = ((anLocalInt_6_ - anLocalInt_12_)
		       * (65536 / (anLocalInt_10_ - anLocalInt_12_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_23_
			   + (((anIntArray5109[anLocalInt_7_] - anLocalInt_23_)
			       * anLocalInt_27_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_6_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_24_
			   + (((anIntArray5111[anLocalInt_7_] - anLocalInt_24_)
			       * anLocalInt_27_)
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_6_));
		anIntArray5113[anLocalInt] = anLocalInt_6_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_25_ + (((anIntArray5058[argument_5_] & 0xffff)
					 - anLocalInt_25_) * anLocalInt_27_
					>> 16);
	    }
	}
	int anLocalInt_28_ = anIntArray5077[0];
	int anLocalInt_29_ = anIntArray5077[1];
	int anLocalInt_30_ = anIntArray5077[2];
	int anLocalInt_31_ = anIntArray5137[0];
	int anLocalInt_32_ = anIntArray5137[1];
	int anLocalInt_33_ = anIntArray5137[2];
	anLocalInt_10_ = anIntArray5113[0];
	anLocalInt_11_ = anIntArray5113[1];
	anLocalInt_12_ = anIntArray5113[2];
	((Class89) aClass89_5134).aBoolean661 = false;
	if (anLocalInt == 3) {
	    if (anLocalInt_28_ < 0 || anLocalInt_29_ < 0 || anLocalInt_30_ < 0
		|| anLocalInt_28_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_29_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_30_ > ((Class293) aClass293_5118).anInt2422)
		((Class89) aClass89_5134).aBoolean661 = true;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_5_] == -1) {
		if (anIntArray5126[argument_5_] == -1)
		    aClass89_5134.method1654
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_,
			 (HslToRgb.table2
			  [anIntArray5058[argument_5_] & 0xffff]));
		else
		    aClass89_5134.method1667
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_, (float) anIntArray5056[0],
			 (float) anIntArray5056[1], (float) anIntArray5056[2]);
	    } else {
		int anLocalInt_34_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_34_
			= 255 - (aByteArray5105[argument_5_] & 0xff) << 24;
		int anLocalInt_35_
		    = anLocalInt_34_ | anIntArray5058[argument_5_] & 0xffffff;
		if (anIntArray5126[argument_5_] == -1)
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_,
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_35_,
			 anLocalInt_35_, anLocalInt_35_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
		else
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_,
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_35_,
			 anLocalInt_35_, anLocalInt_35_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
	    }
	}
	if (anLocalInt == 4) {
	    if (anLocalInt_28_ < 0 || anLocalInt_29_ < 0 || anLocalInt_30_ < 0
		|| anLocalInt_28_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_29_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_30_ > ((Class293) aClass293_5118).anInt2422
		|| anIntArray5077[3] < 0
		|| anIntArray5077[3] > ((Class293) aClass293_5118).anInt2422)
		((Class89) aClass89_5134).aBoolean661 = true;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_5_] == -1) {
		if (anIntArray5126[argument_5_] == -1) {
		    int anLocalInt_36_
			= (HslToRgb.table2
			   [anIntArray5058[argument_5_] & 0xffff]);
		    aClass89_5134.method1654((float) anLocalInt_31_,
					     (float) anLocalInt_32_,
					     (float) anLocalInt_33_,
					     (float) anLocalInt_28_,
					     (float) anLocalInt_29_,
					     (float) anLocalInt_30_,
					     (float) anLocalInt_10_,
					     (float) anLocalInt_11_,
					     (float) anLocalInt_12_,
					     anLocalInt_36_);
		    aClass89_5134.method1654((float) anLocalInt_31_,
					     (float) anLocalInt_33_,
					     (float) anIntArray5137[3],
					     (float) anLocalInt_28_,
					     (float) anLocalInt_30_,
					     (float) anIntArray5077[3],
					     (float) anLocalInt_10_,
					     (float) anLocalInt_11_,
					     (float) anIntArray5113[3],
					     anLocalInt_36_);
		} else {
		    aClass89_5134.method1667
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_, (float) anIntArray5056[0],
			 (float) anIntArray5056[1], (float) anIntArray5056[2]);
		    aClass89_5134.method1667
			((float) anLocalInt_31_, (float) anLocalInt_33_,
			 (float) anIntArray5137[3], (float) anLocalInt_28_,
			 (float) anLocalInt_30_, (float) anIntArray5077[3],
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anIntArray5113[3], (float) anIntArray5056[0],
			 (float) anIntArray5056[2], (float) anIntArray5056[3]);
		}
	    } else {
		int anLocalInt_37_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_37_
			= 255 - (aByteArray5105[argument_5_] & 0xff) << 24;
		int anLocalInt_38_
		    = anLocalInt_37_ | anIntArray5058[argument_5_] & 0xffffff;
		if (anIntArray5126[argument_5_] == -1) {
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_,
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_38_,
			 anLocalInt_38_, anLocalInt_38_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_33_,
			 (float) anIntArray5137[3], (float) anLocalInt_28_,
			 (float) anLocalInt_30_, (float) anIntArray5077[3],
			 (float) anLocalInt_10_, (float) anLocalInt_12_,
			 (float) anIntArray5113[3],
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_38_,
			 anLocalInt_38_, anLocalInt_38_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
		} else {
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_32_,
			 (float) anLocalInt_33_, (float) anLocalInt_28_,
			 (float) anLocalInt_29_, (float) anLocalInt_30_,
			 (float) anLocalInt_10_, (float) anLocalInt_11_,
			 (float) anLocalInt_12_,
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_38_,
			 anLocalInt_38_, anLocalInt_38_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
		    aClass89_5134.method1664
			((float) anLocalInt_31_, (float) anLocalInt_33_,
			 (float) anIntArray5137[3], (float) anLocalInt_28_,
			 (float) anLocalInt_30_, (float) anIntArray5077[3],
			 (float) anLocalInt_10_, (float) anLocalInt_12_,
			 (float) anIntArray5113[3],
			 aFloatArrayArray5098[argument_5_][0],
			 aFloatArrayArray5098[argument_5_][1],
			 aFloatArrayArray5098[argument_5_][2],
			 aFloatArrayArray5071[argument_5_][0],
			 aFloatArrayArray5071[argument_5_][1],
			 aFloatArrayArray5071[argument_5_][2], anLocalInt_38_,
			 anLocalInt_38_, anLocalInt_38_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_5_]);
		}
	    }
	}
    }
    
    final int RA() {
	if (!aBoolean5064)
	    method2693();
	return aShort5090;
    }
    
    private final boolean method2663(int argument_39_) {
	if (aByteArray5105 == null)
	    return false;
	if (aByteArray5105[argument_39_] == 0)
	    return false;
	return true;
    }
    
    private final void method2664(Class350 argument_40_,
				  DoublyLinkedNodeP2_Sub9 argument_41_, int argument_42_,
				  int argument_43_) {
	if (anInt5142 >= 1) {
	    aClass350_Sub1_5125 = (Class350_Sub1) argument_40_;
	    Class350_Sub1 class350_sub1
		= ((JavaToolkit) aClass_ha__5089).aClass350_Sub1_4648;
	    if (!aBoolean5064)
		method2693();
	    boolean anLocalBoolean = false;
	    if (((Class350_Sub1) aClass350_Sub1_5125).aFloat5421 == 16384.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425 == 0.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428 == 0.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5420 == 0.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5430 == 16384.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5429 == 0.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5418 == 0.0F
		&& ((Class350_Sub1) aClass350_Sub1_5125).aFloat5422 == 0.0F
		&& (((Class350_Sub1) aClass350_Sub1_5125).aFloat5419
		    == 16384.0F))
		anLocalBoolean = true;
	    float f = (((Class350_Sub1) class350_sub1).aFloat5427
		       + (((Class350_Sub1) class350_sub1).aFloat5418
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		       + (((Class350_Sub1) class350_sub1).aFloat5422
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		       + (((Class350_Sub1) class350_sub1).aFloat5419
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427));
	    float f_44_
		= (anLocalBoolean ? ((Class350_Sub1) class350_sub1).aFloat5422
		   : ((((Class350_Sub1) class350_sub1).aFloat5418
		       * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
		      + (((Class350_Sub1) class350_sub1).aFloat5422
			 * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5430)
		      + (((Class350_Sub1) class350_sub1).aFloat5419
			 * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5422)));
	    int anLocalInt = (int) (f + (float) aShort5127 * f_44_);
	    int anLocalInt_45_ = (int) (f + (float) aShort5123 * f_44_);
	    int anLocalInt_46_;
	    int anLocalInt_47_;
	    if (anLocalInt > anLocalInt_45_) {
		anLocalInt_46_ = anLocalInt_45_ - aShort5141;
		anLocalInt_47_ = anLocalInt + aShort5141;
	    } else {
		anLocalInt_46_ = anLocalInt - aShort5141;
		anLocalInt_47_ = anLocalInt_45_ + aShort5141;
	    }
	    if ((anLocalInt_46_
		 < ((JavaToolkit) aClass_ha__5089).anInt4641)
		&& (anLocalInt_47_
		    > ((JavaToolkit) aClass_ha__5089).anInt4643)) {
		float f_48_
		    = (((Class350_Sub1) class350_sub1).aFloat5426
		       + (((Class350_Sub1) class350_sub1).aFloat5421
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		       + (((Class350_Sub1) class350_sub1).aFloat5425
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		       + (((Class350_Sub1) class350_sub1).aFloat5428
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427));
		float f_49_
		    = (anLocalBoolean
		       ? ((Class350_Sub1) class350_sub1).aFloat5425
		       : ((((Class350_Sub1) class350_sub1).aFloat5421
			   * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
			  + (((Class350_Sub1) class350_sub1).aFloat5425
			     * (((Class350_Sub1) aClass350_Sub1_5125)
				.aFloat5430))
			  + (((Class350_Sub1) class350_sub1).aFloat5428
			     * (((Class350_Sub1) aClass350_Sub1_5125)
				.aFloat5422))));
		int anLocalInt_50_
		    = (int) (f_48_ + (float) aShort5127 * f_49_);
		int anLocalInt_51_
		    = (int) (f_48_ + (float) aShort5123 * f_49_);
		int anLocalInt_52_;
		int anLocalInt_53_;
		if (anLocalInt_50_ > anLocalInt_51_) {
		    anLocalInt_52_
			= ((anLocalInt_51_ - aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4653);
		    anLocalInt_53_
			= ((anLocalInt_50_ + aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4653);
		} else {
		    anLocalInt_52_
			= ((anLocalInt_50_ - aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4653);
		    anLocalInt_53_
			= ((anLocalInt_51_ + aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4653);
		}
		if (argument_42_ == -1) {
		    if ((anLocalInt_52_ / anLocalInt_47_
			 >= ((JavaToolkit) aClass_ha__5089).anInt4638)
			|| (anLocalInt_53_ / anLocalInt_47_
			    <= (((JavaToolkit) aClass_ha__5089)
				.anInt4635)))
			return;
		} else if ((anLocalInt_52_ / argument_42_
			    >= ((JavaToolkit) aClass_ha__5089).anInt4638)
			   || (anLocalInt_53_ / argument_42_
			       <= (((JavaToolkit) aClass_ha__5089)
				   .anInt4635)))
		    return;
		float f_54_
		    = (((Class350_Sub1) class350_sub1).aFloat5424
		       + (((Class350_Sub1) class350_sub1).aFloat5420
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		       + (((Class350_Sub1) class350_sub1).aFloat5430
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		       + (((Class350_Sub1) class350_sub1).aFloat5429
			  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427));
		float f_55_
		    = (anLocalBoolean
		       ? ((Class350_Sub1) class350_sub1).aFloat5430
		       : ((((Class350_Sub1) class350_sub1).aFloat5420
			   * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
			  + (((Class350_Sub1) class350_sub1).aFloat5430
			     * (((Class350_Sub1) aClass350_Sub1_5125)
				.aFloat5430))
			  + (((Class350_Sub1) class350_sub1).aFloat5429
			     * (((Class350_Sub1) aClass350_Sub1_5125)
				.aFloat5422))));
		int anLocalInt_56_
		    = (int) (f_54_ + (float) aShort5127 * f_55_);
		int anLocalInt_57_
		    = (int) (f_54_ + (float) aShort5123 * f_55_);
		int anLocalInt_58_;
		int anLocalInt_59_;
		if (anLocalInt_56_ > anLocalInt_57_) {
		    anLocalInt_58_
			= ((anLocalInt_57_ - aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4645);
		    anLocalInt_59_
			= ((anLocalInt_56_ + aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4645);
		} else {
		    anLocalInt_58_
			= ((anLocalInt_56_ - aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4645);
		    anLocalInt_59_
			= ((anLocalInt_57_ + aShort5141)
			   * ((JavaToolkit) aClass_ha__5089).anInt4645);
		}
		if (argument_42_ == -1) {
		    if ((anLocalInt_58_ / anLocalInt_47_
			 >= ((JavaToolkit) aClass_ha__5089).anInt4652)
			|| (anLocalInt_59_ / anLocalInt_47_
			    <= (((JavaToolkit) aClass_ha__5089)
				.anInt4633)))
			return;
		} else if ((anLocalInt_58_ / argument_42_
			    >= ((JavaToolkit) aClass_ha__5089).anInt4652)
			   || (anLocalInt_59_ / argument_42_
			       <= (((JavaToolkit) aClass_ha__5089)
				   .anInt4633)))
		    return;
		float f_60_;
		float f_61_;
		float f_62_;
		float f_63_;
		float f_64_;
		float f_65_;
		if (anLocalBoolean) {
		    f_60_ = ((Class350_Sub1) class350_sub1).aFloat5421;
		    f_61_ = ((Class350_Sub1) class350_sub1).aFloat5420;
		    f_62_ = ((Class350_Sub1) class350_sub1).aFloat5418;
		    f_63_ = ((Class350_Sub1) class350_sub1).aFloat5428;
		    f_64_ = ((Class350_Sub1) class350_sub1).aFloat5429;
		    f_65_ = ((Class350_Sub1) class350_sub1).aFloat5419;
		} else {
		    f_60_
			= ((((Class350_Sub1) class350_sub1).aFloat5421
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
			   + (((Class350_Sub1) class350_sub1).aFloat5425
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5420))
			   + (((Class350_Sub1) class350_sub1).aFloat5428
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5418)));
		    f_61_
			= ((((Class350_Sub1) class350_sub1).aFloat5420
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
			   + (((Class350_Sub1) class350_sub1).aFloat5430
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5420))
			   + (((Class350_Sub1) class350_sub1).aFloat5429
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5418)));
		    f_62_
			= ((((Class350_Sub1) class350_sub1).aFloat5418
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
			   + (((Class350_Sub1) class350_sub1).aFloat5422
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5420))
			   + (((Class350_Sub1) class350_sub1).aFloat5419
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5418)));
		    f_63_
			= ((((Class350_Sub1) class350_sub1).aFloat5421
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
			   + (((Class350_Sub1) class350_sub1).aFloat5425
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5429))
			   + (((Class350_Sub1) class350_sub1).aFloat5428
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5419)));
		    f_64_
			= ((((Class350_Sub1) class350_sub1).aFloat5420
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
			   + (((Class350_Sub1) class350_sub1).aFloat5430
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5429))
			   + (((Class350_Sub1) class350_sub1).aFloat5429
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5419)));
		    f_65_
			= ((((Class350_Sub1) class350_sub1).aFloat5418
			    * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
			   + (((Class350_Sub1) class350_sub1).aFloat5422
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5429))
			   + (((Class350_Sub1) class350_sub1).aFloat5419
			      * (((Class350_Sub1) aClass350_Sub1_5125)
				 .aFloat5419)));
		}
		if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
		    synchronized (this) {
			while (aBoolean5102) {
			    try {
				this.wait();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
			aBoolean5102 = true;
		    }
		}
		method2676(Thread.currentThread());
		if ((argument_43_ & 0x2) != 0)
		    aClass89_5134.method1669(true);
		else
		    aClass89_5134.method1669(false);
		boolean anLocalBoolean_66_ = false;
		boolean anLocalBoolean_67_
		    = (anLocalInt_46_
		       <= ((JavaToolkit) aClass_ha__5089).anInt4643);
		boolean anLocalBoolean_68_
		    = (anLocalBoolean_67_ || aClass38Array5079 != null
		       || aClass185Array5103 != null);
		((Class293) aClass293_5118).anInt2422
		    = ((Class89) aClass89_5134).anInt650;
		((Class293) aClass293_5118).anInt2436
		    = ((Class89) aClass89_5134).anInt655;
		((Class293) aClass293_5118).anInt2437
		    = ((Class89) aClass89_5134).anInt648;
		int anLocalInt_69_
		    = ((JavaToolkit) aClass_ha__5089).anInt4653;
		int anLocalInt_70_
		    = ((JavaToolkit) aClass_ha__5089).anInt4645;
		int anLocalInt_71_
		    = ((JavaToolkit) aClass_ha__5089).anInt4643;
		if (argument_42_ == -1) {
		    for (int anLocalInt_72_ = 0; anLocalInt_72_ < anInt5136;
			 anLocalInt_72_++) {
			int anLocalInt_73_ = anIntArray5124[anLocalInt_72_];
			int anLocalInt_74_ = anIntArray5130[anLocalInt_72_];
			int anLocalInt_75_ = anIntArray5075[anLocalInt_72_];
			float f_76_ = (f_48_ + f_60_ * (float) anLocalInt_73_
				       + f_49_ * (float) anLocalInt_74_
				       + f_63_ * (float) anLocalInt_75_);
			float f_77_ = (f_54_ + f_61_ * (float) anLocalInt_73_
				       + f_55_ * (float) anLocalInt_74_
				       + f_64_ * (float) anLocalInt_75_);
			float f_78_ = (f + f_62_ * (float) anLocalInt_73_
				       + f_44_ * (float) anLocalInt_74_
				       + f_65_ * (float) anLocalInt_75_);
			anIntArray5144[anLocalInt_72_] = (int) f_78_;
			if (f_78_ >= (float) anLocalInt_71_) {
			    anIntArray5084[anLocalInt_72_]
				= (((Class293) aClass293_5118).anInt2436
				   + (int) (f_76_ * (float) anLocalInt_69_
					    / f_78_));
			    anIntArray5078[anLocalInt_72_]
				= (((Class293) aClass293_5118).anInt2437
				   + (int) (f_77_ * (float) anLocalInt_70_
					    / f_78_));
			} else {
			    anIntArray5084[anLocalInt_72_] = -5000;
			    anLocalBoolean_66_ = true;
			}
			if (anLocalBoolean_68_) {
			    anIntArray5109[anLocalInt_72_] = (int) f_76_;
			    anIntArray5111[anLocalInt_72_] = (int) f_77_;
			    anIntArray5088[anLocalInt_72_] = (int) f_78_;
			}
			if (((Class293) aClass293_5118).aBoolean2412)
			    anIntArray5085[anLocalInt_72_]
				= (int) ((((Class350_Sub1) aClass350_Sub1_5125)
					  .aFloat5424)
					 + ((((Class350_Sub1)
					      aClass350_Sub1_5125).aFloat5420
					     * (float) anLocalInt_73_)
					    + (((Class350_Sub1)
						aClass350_Sub1_5125).aFloat5430
					       * (float) anLocalInt_74_)
					    + (((Class350_Sub1)
						aClass350_Sub1_5125).aFloat5429
					       * (float) anLocalInt_75_)));
		    }
		    if (aClass35Array5092 != null) {
			for (int anLocalInt_79_ = 0;
			     anLocalInt_79_ < anInt5069; anLocalInt_79_++) {
			    Class35 class35
				= aClass35Array5092[anLocalInt_79_];
			    Class205 class205
				= aClass205Array5066[anLocalInt_79_];
			    short anLocalInt_80_
				= (aShortArray5095
				   [((Class35) class35).anInt258]);
			    short anLocalInt_81_
				= (aShortArray5112
				   [((Class35) class35).anInt258]);
			    short anLocalInt_82_
				= (aShortArray5110
				   [((Class35) class35).anInt258]);
			    int anLocalInt_83_
				= ((anIntArray5124[anLocalInt_80_]
				    + anIntArray5124[anLocalInt_81_]
				    + anIntArray5124[anLocalInt_82_])
				   / 3);
			    int anLocalInt_84_
				= ((anIntArray5130[anLocalInt_80_]
				    + anIntArray5130[anLocalInt_81_]
				    + anIntArray5130[anLocalInt_82_])
				   / 3);
			    int anLocalInt_85_
				= ((anIntArray5075[anLocalInt_80_]
				    + anIntArray5075[anLocalInt_81_]
				    + anIntArray5075[anLocalInt_82_])
				   / 3);
			    float f_86_
				= ((float) ((Class205) class205).anInt1462
				   + (f_48_ + f_60_ * (float) anLocalInt_83_
				      + f_49_ * (float) anLocalInt_84_
				      + f_63_ * (float) anLocalInt_85_));
			    float f_87_
				= ((float) ((Class205) class205).anInt1461
				   + (f_54_ + f_61_ * (float) anLocalInt_83_
				      + f_55_ * (float) anLocalInt_84_
				      + f_64_ * (float) anLocalInt_85_));
			    float f_88_ = (f + f_62_ * (float) anLocalInt_83_
					   + f_44_ * (float) anLocalInt_84_
					   + f_65_ * (float) anLocalInt_85_);
			    if (f_88_
				> (float) ((JavaToolkit) aClass_ha__5089).anInt4643) {
				((Class205) class205).anInt1466
				    = ((((JavaToolkit) aClass_ha__5089)
					.anInt4668)
				       + (int) (f_86_ * (float) anLocalInt_69_
						/ f_88_));
				((Class205) class205).anInt1460
				    = ((((JavaToolkit) aClass_ha__5089)
					.anInt4642)
				       + (int) (f_87_ * (float) anLocalInt_70_
						/ f_88_));
				((Class205) class205).anInt1475
				    = ((int) f_88_
				       - ((Class35) class35).anInt257);
				((Class205) class205).anInt1468
				    = (int) ((float) ((((Class205) class205)
						       .anInt1465)
						      * (((Class35) class35)
							 .aShort260)
						      * anLocalInt_69_)
					     / (f_88_ * 128.0F));
				((Class205) class205).anInt1464
				    = (int) ((float) ((((Class205) class205)
						       .anInt1463)
						      * (((Class35) class35)
							 .aShort256)
						      * anLocalInt_70_)
					     / (f_88_ * 128.0F));
			    } else
				((Class205) class205).anInt1468
				    = ((Class205) class205).anInt1464 = 0;
			}
		    }
		} else {
		    for (int anLocalInt_89_ = 0; anLocalInt_89_ < anInt5136;
			 anLocalInt_89_++) {
			int anLocalInt_90_ = anIntArray5124[anLocalInt_89_];
			int anLocalInt_91_ = anIntArray5130[anLocalInt_89_];
			int anLocalInt_92_ = anIntArray5075[anLocalInt_89_];
			float f_93_ = (f_48_ + f_60_ * (float) anLocalInt_90_
				       + f_49_ * (float) anLocalInt_91_
				       + f_63_ * (float) anLocalInt_92_);
			float f_94_ = (f_54_ + f_61_ * (float) anLocalInt_90_
				       + f_55_ * (float) anLocalInt_91_
				       + f_64_ * (float) anLocalInt_92_);
			float f_95_ = (f + f_62_ * (float) anLocalInt_90_
				       + f_44_ * (float) anLocalInt_91_
				       + f_65_ * (float) anLocalInt_92_);
			anIntArray5144[anLocalInt_89_] = (int) f_95_;
			anIntArray5084[anLocalInt_89_]
			    = (((Class293) aClass293_5118).anInt2436
			       + (int) (f_93_ * (float) anLocalInt_69_
					/ (float) argument_42_));
			anIntArray5078[anLocalInt_89_]
			    = (((Class293) aClass293_5118).anInt2437
			       + (int) (f_94_ * (float) anLocalInt_70_
					/ (float) argument_42_));
			if (anLocalBoolean_68_) {
			    anIntArray5109[anLocalInt_89_] = (int) f_93_;
			    anIntArray5111[anLocalInt_89_] = (int) f_94_;
			    anIntArray5088[anLocalInt_89_] = argument_42_;
			}
			if (((Class293) aClass293_5118).aBoolean2412)
			    anIntArray5085[anLocalInt_89_]
				= (int) ((((Class350_Sub1) aClass350_Sub1_5125)
					  .aFloat5424)
					 + ((((Class350_Sub1)
					      aClass350_Sub1_5125).aFloat5420
					     * (float) anLocalInt_90_)
					    + (((Class350_Sub1)
						aClass350_Sub1_5125).aFloat5430
					       * (float) anLocalInt_91_)
					    + (((Class350_Sub1)
						aClass350_Sub1_5125).aFloat5429
					       * (float) anLocalInt_92_)));
		    }
		    if (aClass35Array5092 != null) {
			for (int anLocalInt_96_ = 0;
			     anLocalInt_96_ < anInt5069; anLocalInt_96_++) {
			    Class35 class35
				= aClass35Array5092[anLocalInt_96_];
			    Class205 class205
				= aClass205Array5066[anLocalInt_96_];
			    short anLocalInt_97_
				= (aShortArray5095
				   [((Class35) class35).anInt258]);
			    short anLocalInt_98_
				= (aShortArray5112
				   [((Class35) class35).anInt258]);
			    short anLocalInt_99_
				= (aShortArray5110
				   [((Class35) class35).anInt258]);
			    int anLocalInt_100_
				= ((anIntArray5124[anLocalInt_97_]
				    + anIntArray5124[anLocalInt_98_]
				    + anIntArray5124[anLocalInt_99_])
				   / 3);
			    int anLocalInt_101_
				= ((anIntArray5130[anLocalInt_97_]
				    + anIntArray5130[anLocalInt_98_]
				    + anIntArray5130[anLocalInt_99_])
				   / 3);
			    int anLocalInt_102_
				= ((anIntArray5075[anLocalInt_97_]
				    + anIntArray5075[anLocalInt_98_]
				    + anIntArray5075[anLocalInt_99_])
				   / 3);
			    float f_103_
				= (f_48_ + f_60_ * (float) anLocalInt_100_
				   + f_49_ * (float) anLocalInt_101_
				   + f_63_ * (float) anLocalInt_102_);
			    float f_104_
				= (f_54_ + f_61_ * (float) anLocalInt_100_
				   + f_55_ * (float) anLocalInt_101_
				   + f_64_ * (float) anLocalInt_102_);
			    float f_105_ = (f + f_62_ * (float) anLocalInt_100_
					    + f_44_ * (float) anLocalInt_101_
					    + f_65_ * (float) anLocalInt_102_);
			    ((Class205) class205).anInt1466
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4668)
				   + (int) (f_103_ * (float) anLocalInt_69_
					    / (float) argument_42_));
			    ((Class205) class205).anInt1460
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4642)
				   + (int) (f_104_ * (float) anLocalInt_70_
					    / (float) argument_42_));
			    ((Class205) class205).anInt1475
				= argument_42_ - ((Class35) class35).anInt257;
			    ((Class205) class205).anInt1468
				= (((Class205) class205).anInt1465
				   * ((Class35) class35).aShort260
				   * anLocalInt_69_ / (argument_42_ << 7));
			    ((Class205) class205).anInt1464
				= (((Class205) class205).anInt1463
				   * ((Class35) class35).aShort256
				   * anLocalInt_70_ / (argument_42_ << 7));
			}
		    }
		}
		if (argument_41_ != null) {
		    boolean anLocalBoolean_106_ = false;
		    boolean anLocalBoolean_107_ = true;
		    int anLocalInt_108_ = aShort5108 + aShort5090 >> 1;
		    int anLocalInt_109_ = aShort5133 + aShort5080 >> 1;
		    int anLocalInt_110_ = anLocalInt_108_;
		    short anLocalInt_111_ = aShort5127;
		    int anLocalInt_112_ = anLocalInt_109_;
		    float f_113_ = (f_48_ + f_60_ * (float) anLocalInt_110_
				    + f_49_ * (float) anLocalInt_111_
				    + f_63_ * (float) anLocalInt_112_);
		    float f_114_ = (f_54_ + f_61_ * (float) anLocalInt_110_
				    + f_55_ * (float) anLocalInt_111_
				    + f_64_ * (float) anLocalInt_112_);
		    float f_115_ = (f + f_62_ * (float) anLocalInt_110_
				    + f_44_ * (float) anLocalInt_111_
				    + f_65_ * (float) anLocalInt_112_);
		    if (f_115_ >= (float) anLocalInt_71_) {
			int anLocalInt_116_ = (int) f_115_;
			if (argument_42_ != -1)
			    anLocalInt_116_ = argument_42_;
			((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4588
			    = (((JavaToolkit) aClass_ha__5089).anInt4668
			       + (int) (f_113_ * (float) anLocalInt_69_
					/ (float) anLocalInt_116_));
			((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4589
			    = (((JavaToolkit) aClass_ha__5089).anInt4642
			       + (int) (f_114_ * (float) anLocalInt_70_
					/ (float) anLocalInt_116_));
		    } else
			anLocalBoolean_106_ = true;
		    anLocalInt_110_ = anLocalInt_108_;
		    anLocalInt_111_ = aShort5123;
		    anLocalInt_112_ = anLocalInt_109_;
		    float f_117_ = (f_48_ + f_60_ * (float) anLocalInt_110_
				    + f_49_ * (float) anLocalInt_111_
				    + f_63_ * (float) anLocalInt_112_);
		    float f_118_ = (f_54_ + f_61_ * (float) anLocalInt_110_
				    + f_55_ * (float) anLocalInt_111_
				    + f_64_ * (float) anLocalInt_112_);
		    float f_119_ = (f + f_62_ * (float) anLocalInt_110_
				    + f_44_ * (float) anLocalInt_111_
				    + f_65_ * (float) anLocalInt_112_);
		    if (f_119_ >= (float) anLocalInt_71_) {
			int anLocalInt_120_ = (int) f_119_;
			if (argument_42_ != -1)
			    anLocalInt_120_ = argument_42_;
			((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4590
			    = (((JavaToolkit) aClass_ha__5089).anInt4668
			       + (int) (f_117_ * (float) anLocalInt_69_
					/ (float) anLocalInt_120_));
			((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4587
			    = (((JavaToolkit) aClass_ha__5089).anInt4642
			       + (int) (f_118_ * (float) anLocalInt_70_
					/ (float) anLocalInt_120_));
		    } else
			anLocalBoolean_106_ = true;
		    if (anLocalBoolean_106_) {
			if (f_115_ < (float) anLocalInt_71_
			    && f_119_ < (float) anLocalInt_71_)
			    anLocalBoolean_107_ = false;
			else if (f_115_ < (float) anLocalInt_71_) {
			    float f_121_
				= ((f_119_
				    - (float) ((JavaToolkit) aClass_ha__5089).anInt4643)
				   / (f_119_ - f_115_));
			    int anLocalInt_122_
				= (int) (f_117_ + (f_117_ - f_113_) * f_121_);
			    int anLocalInt_123_
				= (int) (f_118_ + (f_118_ - f_114_) * f_121_);
			    int anLocalInt_124_ = anLocalInt_71_;
			    if (argument_42_ != -1)
				anLocalInt_124_ = argument_42_;
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4588
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4668)
				   + (anLocalInt_122_ * anLocalInt_69_
				      / anLocalInt_124_));
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4589
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4642)
				   + (anLocalInt_123_ * anLocalInt_70_
				      / anLocalInt_124_));
			} else if (f_119_ < (float) anLocalInt_71_) {
			    float f_125_ = ((f_115_ - (float) anLocalInt_71_)
					    / (f_115_ - f_119_));
			    int anLocalInt_126_
				= (int) (f_113_ + (f_113_ - f_117_) * f_125_);
			    int anLocalInt_127_
				= (int) (f_114_ + (f_114_ - f_118_) * f_125_);
			    int anLocalInt_128_ = anLocalInt_71_;
			    if (argument_42_ != -1)
				anLocalInt_128_ = argument_42_;
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4588
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4668)
				   + (anLocalInt_126_ * anLocalInt_69_
				      / anLocalInt_128_));
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4589
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4642)
				   + (anLocalInt_127_ * anLocalInt_70_
				      / anLocalInt_128_));
			}
		    }
		    if (anLocalBoolean_107_) {
			if (f_115_ > f_119_) {
			    int anLocalInt_129_ = (int) f_115_;
			    if (argument_42_ != -1)
				anLocalInt_129_ = argument_42_;
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4586
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4668)
				   + (int) ((f_113_ + (float) aShort5141)
					    * (float) anLocalInt_69_
					    / (float) anLocalInt_129_)
				   - ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4588);
			} else {
			    int anLocalInt_130_ = (int) f_119_;
			    if (argument_42_ != -1)
				anLocalInt_130_ = argument_42_;
			    ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4586
				= ((((JavaToolkit) aClass_ha__5089)
				    .anInt4668)
				   + (int) ((f_117_ + (float) aShort5141)
					    * (float) anLocalInt_69_
					    / (float) anLocalInt_130_)
				   - ((DoublyLinkedNodeP2_Sub9) argument_41_).anInt4590);
			}
			((DoublyLinkedNodeP2_Sub9) argument_41_).aBoolean4591 = true;
		    }
		}
		method2666(true);
		((Class89) aClass89_5134).aBoolean647
		    = (argument_43_ & 0x1) == 0;
		((Class89) aClass89_5134).aBoolean659 = false;
		try {
		    boolean anLocalBoolean_131_ = (argument_43_ & 0x4) != 0;
		    if (anLocalBoolean_131_)
			method2683(anLocalBoolean_66_,
				   ((((Class293) aClass293_5118).aBoolean2409
				     && (anLocalInt_47_
					 > (((Class293) aClass293_5118)
					    .anInt2405)))
				    || (((Class293) aClass293_5118)
					.aBoolean2412)),
				   anLocalInt_46_,
				   anLocalInt_47_ - anLocalInt_46_);
		    else
			method2684(anLocalBoolean_66_,
				   ((((Class293) aClass293_5118).aBoolean2409
				     && (anLocalInt_47_
					 > (((Class293) aClass293_5118)
					    .anInt2405)))
				    || (((Class293) aClass293_5118)
					.aBoolean2412)),
				   anLocalInt_46_,
				   anLocalInt_47_ - anLocalInt_46_);
		} catch (Exception exception) {
		    /* empty */
		}
		if (aClass35Array5092 != null) {
		    for (int anLocalInt_132_ = 0; anLocalInt_132_ < anInt5070;
			 anLocalInt_132_++)
			anIntArray5096[anLocalInt_132_] = -1;
		}
		aClass89_5134 = null;
		if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
		    synchronized (this) {
			aBoolean5102 = false;
			this.notifyAll();
		    }
		}
	    }
	}
    }
    
    private final void method2665(int argument_133_) {
	short anLocalInt = aShortArray5095[argument_133_];
	short anLocalInt_134_ = aShortArray5112[argument_133_];
	short anLocalInt_135_ = aShortArray5110[argument_133_];
	if (aShortArray5104 == null || aShortArray5104[argument_133_] == -1) {
	    if (aByteArray5105 == null)
		((Class89) aClass89_5134).anInt646 = 0;
	    else
		((Class89) aClass89_5134).anInt646
		    = aByteArray5105[argument_133_] & 0xff;
	    if (anIntArray5126[argument_133_] == -1)
		aClass89_5134.method1660
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_134_],
		     (float) anIntArray5078[anLocalInt_135_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_134_],
		     (float) anIntArray5084[anLocalInt_135_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_134_],
		     (float) anIntArray5144[anLocalInt_135_],
		     (HslToRgb.table2
		      [anIntArray5058[argument_133_] & 0xffff]));
	    else
		aClass89_5134.method1663
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_134_],
		     (float) anIntArray5078[anLocalInt_135_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_134_],
		     (float) anIntArray5084[anLocalInt_135_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_134_],
		     (float) anIntArray5144[anLocalInt_135_],
		     (float) (anIntArray5058[argument_133_] & 0xffff),
		     (float) (anIntArray5115[argument_133_] & 0xffff),
		     (float) (anIntArray5126[argument_133_] & 0xffff));
	} else {
	    int anLocalInt_136_ = -16777216;
	    if (aByteArray5105 != null)
		anLocalInt_136_
		    = 255 - (aByteArray5105[argument_133_] & 0xff) << 24;
	    if (anIntArray5126[argument_133_] == -1) {
		int anLocalInt_137_
		    = (anLocalInt_136_
		       | anIntArray5058[argument_133_] & 0xffffff);
		aClass89_5134.method1668
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_134_],
		     (float) anIntArray5078[anLocalInt_135_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_134_],
		     (float) anIntArray5084[anLocalInt_135_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_134_],
		     (float) anIntArray5144[anLocalInt_135_],
		     aFloatArrayArray5098[argument_133_][0],
		     aFloatArrayArray5098[argument_133_][1],
		     aFloatArrayArray5098[argument_133_][2],
		     aFloatArrayArray5071[argument_133_][0],
		     aFloatArrayArray5071[argument_133_][1],
		     aFloatArrayArray5071[argument_133_][2], anLocalInt_137_,
		     anLocalInt_137_, anLocalInt_137_,
		     ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
		     aShortArray5104[argument_133_]);
	    } else
		aClass89_5134.method1668
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_134_],
		     (float) anIntArray5078[anLocalInt_135_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_134_],
		     (float) anIntArray5084[anLocalInt_135_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_134_],
		     (float) anIntArray5144[anLocalInt_135_],
		     aFloatArrayArray5098[argument_133_][0],
		     aFloatArrayArray5098[argument_133_][1],
		     aFloatArrayArray5098[argument_133_][2],
		     aFloatArrayArray5071[argument_133_][0],
		     aFloatArrayArray5071[argument_133_][1],
		     aFloatArrayArray5071[argument_133_][2],
		     (anLocalInt_136_
		      | anIntArray5058[argument_133_] & 0xffffff),
		     (anLocalInt_136_
		      | anIntArray5115[argument_133_] & 0xffffff),
		     (anLocalInt_136_
		      | anIntArray5126[argument_133_] & 0xffffff),
		     ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
		     aShortArray5104[argument_133_]);
	}
    }
    
    final void I(int argument_138_, int[] argument_139_, int argument_140_,
		 int argument_141_, int argument_142_, boolean argument_143_,
		 int argument_144_, int[] argument_145_) {
	int anLocalInt = argument_139_.length;
	if (argument_138_ == 0) {
	    argument_140_ <<= 4;
	    argument_141_ <<= 4;
	    argument_142_ <<= 4;
	    if (!aBoolean5083) {
		for (int anLocalInt_146_ = 0; anLocalInt_146_ < anInt5136;
		     anLocalInt_146_++) {
		    anIntArray5124[anLocalInt_146_] <<= 4;
		    anIntArray5130[anLocalInt_146_] <<= 4;
		    anIntArray5075[anLocalInt_146_] <<= 4;
		}
		aBoolean5083 = true;
	    }
	    int anLocalInt_147_ = 0;
	    anInt5073 = 0;
	    anInt5121 = 0;
	    anInt5094 = 0;
	    for (int anLocalInt_148_ = 0; anLocalInt_148_ < anLocalInt;
		 anLocalInt_148_++) {
		int anLocalInt_149_ = argument_139_[anLocalInt_148_];
		if (anLocalInt_149_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_149_];
		    for (int anLocalInt_150_ = 0;
			 anLocalInt_150_ < anLocalInts.length;
			 anLocalInt_150_++) {
			int anLocalInt_151_ = anLocalInts[anLocalInt_150_];
			if (aShortArray5072 == null
			    || (argument_144_
				& aShortArray5072[anLocalInt_151_]) != 0) {
			    anInt5073 += anIntArray5124[anLocalInt_151_];
			    anInt5121 += anIntArray5130[anLocalInt_151_];
			    anInt5094 += anIntArray5075[anLocalInt_151_];
			    anLocalInt_147_++;
			}
		    }
		}
	    }
	    if (anLocalInt_147_ > 0) {
		anInt5073 = anInt5073 / anLocalInt_147_ + argument_140_;
		anInt5121 = anInt5121 / anLocalInt_147_ + argument_141_;
		anInt5094 = anInt5094 / anLocalInt_147_ + argument_142_;
		aBoolean5114 = true;
	    } else {
		anInt5073 = argument_140_;
		anInt5121 = argument_141_;
		anInt5094 = argument_142_;
	    }
	} else if (argument_138_ == 1) {
	    if (argument_145_ != null) {
		int anLocalInt_152_
		    = ((argument_145_[0] * argument_140_
			+ argument_145_[1] * argument_141_
			+ argument_145_[2] * argument_142_ + 8192)
		       >> 14);
		int anLocalInt_153_
		    = ((argument_145_[3] * argument_140_
			+ argument_145_[4] * argument_141_
			+ argument_145_[5] * argument_142_ + 8192)
		       >> 14);
		int anLocalInt_154_
		    = ((argument_145_[6] * argument_140_
			+ argument_145_[7] * argument_141_
			+ argument_145_[8] * argument_142_ + 8192)
		       >> 14);
		argument_140_ = anLocalInt_152_;
		argument_141_ = anLocalInt_153_;
		argument_142_ = anLocalInt_154_;
	    }
	    argument_140_ <<= 4;
	    argument_141_ <<= 4;
	    argument_142_ <<= 4;
	    if (!aBoolean5083) {
		for (int anLocalInt_155_ = 0; anLocalInt_155_ < anInt5136;
		     anLocalInt_155_++) {
		    anIntArray5124[anLocalInt_155_] <<= 4;
		    anIntArray5130[anLocalInt_155_] <<= 4;
		    anIntArray5075[anLocalInt_155_] <<= 4;
		}
		aBoolean5083 = true;
	    }
	    for (int anLocalInt_156_ = 0; anLocalInt_156_ < anLocalInt;
		 anLocalInt_156_++) {
		int anLocalInt_157_ = argument_139_[anLocalInt_156_];
		if (anLocalInt_157_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_157_];
		    for (int anLocalInt_158_ = 0;
			 anLocalInt_158_ < anLocalInts.length;
			 anLocalInt_158_++) {
			int anLocalInt_159_ = anLocalInts[anLocalInt_158_];
			if (aShortArray5072 == null
			    || (argument_144_
				& aShortArray5072[anLocalInt_159_]) != 0) {
			    anIntArray5124[anLocalInt_159_] += argument_140_;
			    anIntArray5130[anLocalInt_159_] += argument_141_;
			    anIntArray5075[anLocalInt_159_] += argument_142_;
			}
		    }
		}
	    }
	} else if (argument_138_ == 2) {
	    if (argument_145_ != null) {
		if (!aBoolean5083) {
		    for (int anLocalInt_160_ = 0; anLocalInt_160_ < anInt5136;
			 anLocalInt_160_++) {
			anIntArray5124[anLocalInt_160_] <<= 4;
			anIntArray5130[anLocalInt_160_] <<= 4;
			anIntArray5075[anLocalInt_160_] <<= 4;
		    }
		    aBoolean5083 = true;
		}
		int anLocalInt_161_ = argument_145_[9] << 4;
		int anLocalInt_162_ = argument_145_[10] << 4;
		int anLocalInt_163_ = argument_145_[11] << 4;
		int anLocalInt_164_ = argument_145_[12] << 4;
		int anLocalInt_165_ = argument_145_[13] << 4;
		int anLocalInt_166_ = argument_145_[14] << 4;
		if (aBoolean5114) {
		    int anLocalInt_167_
			= ((argument_145_[0] * anInt5073
			    + argument_145_[3] * anInt5121
			    + argument_145_[6] * anInt5094 + 8192)
			   >> 14);
		    int anLocalInt_168_
			= ((argument_145_[1] * anInt5073
			    + argument_145_[4] * anInt5121
			    + argument_145_[7] * anInt5094 + 8192)
			   >> 14);
		    int anLocalInt_169_
			= ((argument_145_[2] * anInt5073
			    + argument_145_[5] * anInt5121
			    + argument_145_[8] * anInt5094 + 8192)
			   >> 14);
		    anLocalInt_167_ += anLocalInt_164_;
		    anLocalInt_168_ += anLocalInt_165_;
		    anLocalInt_169_ += anLocalInt_166_;
		    anInt5073 = anLocalInt_167_;
		    anInt5121 = anLocalInt_168_;
		    anInt5094 = anLocalInt_169_;
		    aBoolean5114 = false;
		}
		int[] anLocalInts = new int[9];
		int anLocalInt_170_
		    = Node_Sub6.COSINETABLE[argument_140_];
		int anLocalInt_171_
		    = Node_Sub6.SINETABLE[argument_140_];
		int anLocalInt_172_
		    = Node_Sub6.COSINETABLE[argument_141_];
		int anLocalInt_173_
		    = Node_Sub6.SINETABLE[argument_141_];
		int anLocalInt_174_
		    = Node_Sub6.COSINETABLE[argument_142_];
		int anLocalInt_175_
		    = Node_Sub6.SINETABLE[argument_142_];
		int anLocalInt_176_
		    = anLocalInt_171_ * anLocalInt_174_ + 8192 >> 14;
		int anLocalInt_177_
		    = anLocalInt_171_ * anLocalInt_175_ + 8192 >> 14;
		anLocalInts[0]
		    = (anLocalInt_172_ * anLocalInt_174_
		       + anLocalInt_173_ * anLocalInt_177_ + 8192) >> 14;
		anLocalInts[1]
		    = (-anLocalInt_172_ * anLocalInt_175_
		       + anLocalInt_173_ * anLocalInt_176_ + 8192) >> 14;
		anLocalInts[2]
		    = anLocalInt_173_ * anLocalInt_170_ + 8192 >> 14;
		anLocalInts[3]
		    = anLocalInt_170_ * anLocalInt_175_ + 8192 >> 14;
		anLocalInts[4]
		    = anLocalInt_170_ * anLocalInt_174_ + 8192 >> 14;
		anLocalInts[5] = -anLocalInt_171_;
		anLocalInts[6]
		    = (-anLocalInt_173_ * anLocalInt_174_
		       + anLocalInt_172_ * anLocalInt_177_ + 8192) >> 14;
		anLocalInts[7]
		    = (anLocalInt_173_ * anLocalInt_175_
		       + anLocalInt_172_ * anLocalInt_176_ + 8192) >> 14;
		anLocalInts[8]
		    = anLocalInt_172_ * anLocalInt_170_ + 8192 >> 14;
		int anLocalInt_178_ = ((anLocalInts[0] * -anInt5073
					+ anLocalInts[1] * -anInt5121
					+ anLocalInts[2] * -anInt5094 + 8192)
				       >> 14);
		int anLocalInt_179_ = ((anLocalInts[3] * -anInt5073
					+ anLocalInts[4] * -anInt5121
					+ anLocalInts[5] * -anInt5094 + 8192)
				       >> 14);
		int anLocalInt_180_ = ((anLocalInts[6] * -anInt5073
					+ anLocalInts[7] * -anInt5121
					+ anLocalInts[8] * -anInt5094 + 8192)
				       >> 14);
		int anLocalInt_181_ = anLocalInt_178_ + anInt5073;
		int anLocalInt_182_ = anLocalInt_179_ + anInt5121;
		int anLocalInt_183_ = anLocalInt_180_ + anInt5094;
		int[] anLocalInts_184_ = new int[9];
		for (int anLocalInt_185_ = 0; anLocalInt_185_ < 3;
		     anLocalInt_185_++) {
		    for (int anLocalInt_186_ = 0; anLocalInt_186_ < 3;
			 anLocalInt_186_++) {
			int anLocalInt_187_ = 0;
			for (int anLocalInt_188_ = 0; anLocalInt_188_ < 3;
			     anLocalInt_188_++)
			    anLocalInt_187_
				+= ((anLocalInts
				     [anLocalInt_185_ * 3 + anLocalInt_188_])
				    * argument_145_[(anLocalInt_186_ * 3
						     + anLocalInt_188_)]);
			anLocalInts_184_[anLocalInt_185_ * 3 + anLocalInt_186_]
			    = anLocalInt_187_ + 8192 >> 14;
		    }
		}
		int anLocalInt_189_
		    = ((anLocalInts[0] * anLocalInt_164_
			+ anLocalInts[1] * anLocalInt_165_
			+ anLocalInts[2] * anLocalInt_166_ + 8192)
		       >> 14);
		int anLocalInt_190_
		    = ((anLocalInts[3] * anLocalInt_164_
			+ anLocalInts[4] * anLocalInt_165_
			+ anLocalInts[5] * anLocalInt_166_ + 8192)
		       >> 14);
		int anLocalInt_191_
		    = ((anLocalInts[6] * anLocalInt_164_
			+ anLocalInts[7] * anLocalInt_165_
			+ anLocalInts[8] * anLocalInt_166_ + 8192)
		       >> 14);
		anLocalInt_189_ += anLocalInt_181_;
		anLocalInt_190_ += anLocalInt_182_;
		anLocalInt_191_ += anLocalInt_183_;
		int[] anLocalInts_192_ = new int[9];
		for (int anLocalInt_193_ = 0; anLocalInt_193_ < 3;
		     anLocalInt_193_++) {
		    for (int anLocalInt_194_ = 0; anLocalInt_194_ < 3;
			 anLocalInt_194_++) {
			int anLocalInt_195_ = 0;
			for (int anLocalInt_196_ = 0; anLocalInt_196_ < 3;
			     anLocalInt_196_++)
			    anLocalInt_195_
				+= ((argument_145_
				     [anLocalInt_193_ * 3 + anLocalInt_196_])
				    * (anLocalInts_184_
				       [(anLocalInt_194_
					 + anLocalInt_196_ * 3)]));
			anLocalInts_192_[anLocalInt_193_ * 3 + anLocalInt_194_]
			    = anLocalInt_195_ + 8192 >> 14;
		    }
		}
		int anLocalInt_197_
		    = ((argument_145_[0] * anLocalInt_189_
			+ argument_145_[1] * anLocalInt_190_
			+ argument_145_[2] * anLocalInt_191_ + 8192)
		       >> 14);
		int anLocalInt_198_
		    = ((argument_145_[3] * anLocalInt_189_
			+ argument_145_[4] * anLocalInt_190_
			+ argument_145_[5] * anLocalInt_191_ + 8192)
		       >> 14);
		int anLocalInt_199_
		    = ((argument_145_[6] * anLocalInt_189_
			+ argument_145_[7] * anLocalInt_190_
			+ argument_145_[8] * anLocalInt_191_ + 8192)
		       >> 14);
		anLocalInt_197_ += anLocalInt_161_;
		anLocalInt_198_ += anLocalInt_162_;
		anLocalInt_199_ += anLocalInt_163_;
		for (int anLocalInt_200_ = 0; anLocalInt_200_ < anLocalInt;
		     anLocalInt_200_++) {
		    int anLocalInt_201_ = argument_139_[anLocalInt_200_];
		    if (anLocalInt_201_ < anIntArrayArray5086.length) {
			int[] anLocalInts_202_
			    = anIntArrayArray5086[anLocalInt_201_];
			for (int anLocalInt_203_ = 0;
			     anLocalInt_203_ < anLocalInts_202_.length;
			     anLocalInt_203_++) {
			    int anLocalInt_204_
				= anLocalInts_202_[anLocalInt_203_];
			    if (aShortArray5072 == null
				|| (argument_144_
				    & aShortArray5072[anLocalInt_204_]) != 0) {
				int anLocalInt_205_
				    = (((anLocalInts_192_[0]
					 * anIntArray5124[anLocalInt_204_])
					+ (anLocalInts_192_[1]
					   * anIntArray5130[anLocalInt_204_])
					+ (anLocalInts_192_[2]
					   * anIntArray5075[anLocalInt_204_])
					+ 8192)
				       >> 14);
				int anLocalInt_206_
				    = (((anLocalInts_192_[3]
					 * anIntArray5124[anLocalInt_204_])
					+ (anLocalInts_192_[4]
					   * anIntArray5130[anLocalInt_204_])
					+ (anLocalInts_192_[5]
					   * anIntArray5075[anLocalInt_204_])
					+ 8192)
				       >> 14);
				int anLocalInt_207_
				    = (((anLocalInts_192_[6]
					 * anIntArray5124[anLocalInt_204_])
					+ (anLocalInts_192_[7]
					   * anIntArray5130[anLocalInt_204_])
					+ (anLocalInts_192_[8]
					   * anIntArray5075[anLocalInt_204_])
					+ 8192)
				       >> 14);
				anLocalInt_205_ += anLocalInt_197_;
				anLocalInt_206_ += anLocalInt_198_;
				anLocalInt_207_ += anLocalInt_199_;
				anIntArray5124[anLocalInt_204_]
				    = anLocalInt_205_;
				anIntArray5130[anLocalInt_204_]
				    = anLocalInt_206_;
				anIntArray5075[anLocalInt_204_]
				    = anLocalInt_207_;
			    }
			}
		    }
		}
	    } else {
		for (int anLocalInt_208_ = 0; anLocalInt_208_ < anLocalInt;
		     anLocalInt_208_++) {
		    int anLocalInt_209_ = argument_139_[anLocalInt_208_];
		    if (anLocalInt_209_ < anIntArrayArray5086.length) {
			int[] anLocalInts
			    = anIntArrayArray5086[anLocalInt_209_];
			for (int anLocalInt_210_ = 0;
			     anLocalInt_210_ < anLocalInts.length;
			     anLocalInt_210_++) {
			    int anLocalInt_211_ = anLocalInts[anLocalInt_210_];
			    if (aShortArray5072 == null
				|| (argument_144_
				    & aShortArray5072[anLocalInt_211_]) != 0) {
				anIntArray5124[anLocalInt_211_] -= anInt5073;
				anIntArray5130[anLocalInt_211_] -= anInt5121;
				anIntArray5075[anLocalInt_211_] -= anInt5094;
				if (argument_142_ != 0) {
				    int anLocalInt_212_
					= (Node_Sub6.SINETABLE
					   [argument_142_]);
				    int anLocalInt_213_
					= (Node_Sub6.COSINETABLE
					   [argument_142_]);
				    int anLocalInt_214_
					= (((anIntArray5130[anLocalInt_211_]
					     * anLocalInt_212_)
					    + (anIntArray5124[anLocalInt_211_]
					       * anLocalInt_213_)
					    + 16383)
					   >> 14);
				    anIntArray5130[anLocalInt_211_]
					= ((anIntArray5130[anLocalInt_211_]
					    * anLocalInt_213_)
					   - (anIntArray5124[anLocalInt_211_]
					      * anLocalInt_212_)
					   + 16383) >> 14;
				    anIntArray5124[anLocalInt_211_]
					= anLocalInt_214_;
				}
				if (argument_140_ != 0) {
				    int anLocalInt_215_
					= (Node_Sub6.SINETABLE
					   [argument_140_]);
				    int anLocalInt_216_
					= (Node_Sub6.COSINETABLE
					   [argument_140_]);
				    int anLocalInt_217_
					= (((anIntArray5130[anLocalInt_211_]
					     * anLocalInt_216_)
					    - (anIntArray5075[anLocalInt_211_]
					       * anLocalInt_215_)
					    + 16383)
					   >> 14);
				    anIntArray5075[anLocalInt_211_]
					= ((anIntArray5130[anLocalInt_211_]
					    * anLocalInt_215_)
					   + (anIntArray5075[anLocalInt_211_]
					      * anLocalInt_216_)
					   + 16383) >> 14;
				    anIntArray5130[anLocalInt_211_]
					= anLocalInt_217_;
				}
				if (argument_141_ != 0) {
				    int anLocalInt_218_
					= (Node_Sub6.SINETABLE
					   [argument_141_]);
				    int anLocalInt_219_
					= (Node_Sub6.COSINETABLE
					   [argument_141_]);
				    int anLocalInt_220_
					= (((anIntArray5075[anLocalInt_211_]
					     * anLocalInt_218_)
					    + (anIntArray5124[anLocalInt_211_]
					       * anLocalInt_219_)
					    + 16383)
					   >> 14);
				    anIntArray5075[anLocalInt_211_]
					= ((anIntArray5075[anLocalInt_211_]
					    * anLocalInt_219_)
					   - (anIntArray5124[anLocalInt_211_]
					      * anLocalInt_218_)
					   + 16383) >> 14;
				    anIntArray5124[anLocalInt_211_]
					= anLocalInt_220_;
				}
				anIntArray5124[anLocalInt_211_] += anInt5073;
				anIntArray5130[anLocalInt_211_] += anInt5121;
				anIntArray5075[anLocalInt_211_] += anInt5094;
			    }
			}
		    }
		}
	    }
	} else if (argument_138_ == 3) {
	    if (argument_145_ != null) {
		if (!aBoolean5083) {
		    for (int anLocalInt_221_ = 0; anLocalInt_221_ < anInt5136;
			 anLocalInt_221_++) {
			anIntArray5124[anLocalInt_221_] <<= 4;
			anIntArray5130[anLocalInt_221_] <<= 4;
			anIntArray5075[anLocalInt_221_] <<= 4;
		    }
		    aBoolean5083 = true;
		}
		int anLocalInt_222_ = argument_145_[9] << 4;
		int anLocalInt_223_ = argument_145_[10] << 4;
		int anLocalInt_224_ = argument_145_[11] << 4;
		int anLocalInt_225_ = argument_145_[12] << 4;
		int anLocalInt_226_ = argument_145_[13] << 4;
		int anLocalInt_227_ = argument_145_[14] << 4;
		if (aBoolean5114) {
		    int anLocalInt_228_
			= ((argument_145_[0] * anInt5073
			    + argument_145_[3] * anInt5121
			    + argument_145_[6] * anInt5094 + 8192)
			   >> 14);
		    int anLocalInt_229_
			= ((argument_145_[1] * anInt5073
			    + argument_145_[4] * anInt5121
			    + argument_145_[7] * anInt5094 + 8192)
			   >> 14);
		    int anLocalInt_230_
			= ((argument_145_[2] * anInt5073
			    + argument_145_[5] * anInt5121
			    + argument_145_[8] * anInt5094 + 8192)
			   >> 14);
		    anLocalInt_228_ += anLocalInt_225_;
		    anLocalInt_229_ += anLocalInt_226_;
		    anLocalInt_230_ += anLocalInt_227_;
		    anInt5073 = anLocalInt_228_;
		    anInt5121 = anLocalInt_229_;
		    anInt5094 = anLocalInt_230_;
		    aBoolean5114 = false;
		}
		int anLocalInt_231_ = argument_140_ << 15 >> 7;
		int anLocalInt_232_ = argument_141_ << 15 >> 7;
		int anLocalInt_233_ = argument_142_ << 15 >> 7;
		int anLocalInt_234_
		    = anLocalInt_231_ * -anInt5073 + 8192 >> 14;
		int anLocalInt_235_
		    = anLocalInt_232_ * -anInt5121 + 8192 >> 14;
		int anLocalInt_236_
		    = anLocalInt_233_ * -anInt5094 + 8192 >> 14;
		int anLocalInt_237_ = anLocalInt_234_ + anInt5073;
		int anLocalInt_238_ = anLocalInt_235_ + anInt5121;
		int anLocalInt_239_ = anLocalInt_236_ + anInt5094;
		int[] anLocalInts = new int[9];
		anLocalInts[0]
		    = anLocalInt_231_ * argument_145_[0] + 8192 >> 14;
		anLocalInts[1]
		    = anLocalInt_231_ * argument_145_[3] + 8192 >> 14;
		anLocalInts[2]
		    = anLocalInt_231_ * argument_145_[6] + 8192 >> 14;
		anLocalInts[3]
		    = anLocalInt_232_ * argument_145_[1] + 8192 >> 14;
		anLocalInts[4]
		    = anLocalInt_232_ * argument_145_[4] + 8192 >> 14;
		anLocalInts[5]
		    = anLocalInt_232_ * argument_145_[7] + 8192 >> 14;
		anLocalInts[6]
		    = anLocalInt_233_ * argument_145_[2] + 8192 >> 14;
		anLocalInts[7]
		    = anLocalInt_233_ * argument_145_[5] + 8192 >> 14;
		anLocalInts[8]
		    = anLocalInt_233_ * argument_145_[8] + 8192 >> 14;
		int anLocalInt_240_
		    = anLocalInt_231_ * anLocalInt_225_ + 8192 >> 14;
		int anLocalInt_241_
		    = anLocalInt_232_ * anLocalInt_226_ + 8192 >> 14;
		int anLocalInt_242_
		    = anLocalInt_233_ * anLocalInt_227_ + 8192 >> 14;
		anLocalInt_240_ += anLocalInt_237_;
		anLocalInt_241_ += anLocalInt_238_;
		anLocalInt_242_ += anLocalInt_239_;
		int[] anLocalInts_243_ = new int[9];
		for (int anLocalInt_244_ = 0; anLocalInt_244_ < 3;
		     anLocalInt_244_++) {
		    for (int anLocalInt_245_ = 0; anLocalInt_245_ < 3;
			 anLocalInt_245_++) {
			int anLocalInt_246_ = 0;
			for (int anLocalInt_247_ = 0; anLocalInt_247_ < 3;
			     anLocalInt_247_++)
			    anLocalInt_246_
				+= ((argument_145_
				     [anLocalInt_244_ * 3 + anLocalInt_247_])
				    * anLocalInts[(anLocalInt_245_
						   + anLocalInt_247_ * 3)]);
			anLocalInts_243_[anLocalInt_244_ * 3 + anLocalInt_245_]
			    = anLocalInt_246_ + 8192 >> 14;
		    }
		}
		int anLocalInt_248_
		    = ((argument_145_[0] * anLocalInt_240_
			+ argument_145_[1] * anLocalInt_241_
			+ argument_145_[2] * anLocalInt_242_ + 8192)
		       >> 14);
		int anLocalInt_249_
		    = ((argument_145_[3] * anLocalInt_240_
			+ argument_145_[4] * anLocalInt_241_
			+ argument_145_[5] * anLocalInt_242_ + 8192)
		       >> 14);
		int anLocalInt_250_
		    = ((argument_145_[6] * anLocalInt_240_
			+ argument_145_[7] * anLocalInt_241_
			+ argument_145_[8] * anLocalInt_242_ + 8192)
		       >> 14);
		anLocalInt_248_ += anLocalInt_222_;
		anLocalInt_249_ += anLocalInt_223_;
		anLocalInt_250_ += anLocalInt_224_;
		for (int anLocalInt_251_ = 0; anLocalInt_251_ < anLocalInt;
		     anLocalInt_251_++) {
		    int anLocalInt_252_ = argument_139_[anLocalInt_251_];
		    if (anLocalInt_252_ < anIntArrayArray5086.length) {
			int[] anLocalInts_253_
			    = anIntArrayArray5086[anLocalInt_252_];
			for (int anLocalInt_254_ = 0;
			     anLocalInt_254_ < anLocalInts_253_.length;
			     anLocalInt_254_++) {
			    int anLocalInt_255_
				= anLocalInts_253_[anLocalInt_254_];
			    if (aShortArray5072 == null
				|| (argument_144_
				    & aShortArray5072[anLocalInt_255_]) != 0) {
				int anLocalInt_256_
				    = (((anLocalInts_243_[0]
					 * anIntArray5124[anLocalInt_255_])
					+ (anLocalInts_243_[1]
					   * anIntArray5130[anLocalInt_255_])
					+ (anLocalInts_243_[2]
					   * anIntArray5075[anLocalInt_255_])
					+ 8192)
				       >> 14);
				int anLocalInt_257_
				    = (((anLocalInts_243_[3]
					 * anIntArray5124[anLocalInt_255_])
					+ (anLocalInts_243_[4]
					   * anIntArray5130[anLocalInt_255_])
					+ (anLocalInts_243_[5]
					   * anIntArray5075[anLocalInt_255_])
					+ 8192)
				       >> 14);
				int anLocalInt_258_
				    = (((anLocalInts_243_[6]
					 * anIntArray5124[anLocalInt_255_])
					+ (anLocalInts_243_[7]
					   * anIntArray5130[anLocalInt_255_])
					+ (anLocalInts_243_[8]
					   * anIntArray5075[anLocalInt_255_])
					+ 8192)
				       >> 14);
				anLocalInt_256_ += anLocalInt_248_;
				anLocalInt_257_ += anLocalInt_249_;
				anLocalInt_258_ += anLocalInt_250_;
				anIntArray5124[anLocalInt_255_]
				    = anLocalInt_256_;
				anIntArray5130[anLocalInt_255_]
				    = anLocalInt_257_;
				anIntArray5075[anLocalInt_255_]
				    = anLocalInt_258_;
			    }
			}
		    }
		}
	    } else {
		for (int anLocalInt_259_ = 0; anLocalInt_259_ < anLocalInt;
		     anLocalInt_259_++) {
		    int anLocalInt_260_ = argument_139_[anLocalInt_259_];
		    if (anLocalInt_260_ < anIntArrayArray5086.length) {
			int[] anLocalInts
			    = anIntArrayArray5086[anLocalInt_260_];
			for (int anLocalInt_261_ = 0;
			     anLocalInt_261_ < anLocalInts.length;
			     anLocalInt_261_++) {
			    int anLocalInt_262_ = anLocalInts[anLocalInt_261_];
			    if (aShortArray5072 == null
				|| (argument_144_
				    & aShortArray5072[anLocalInt_262_]) != 0) {
				anIntArray5124[anLocalInt_262_] -= anInt5073;
				anIntArray5130[anLocalInt_262_] -= anInt5121;
				anIntArray5075[anLocalInt_262_] -= anInt5094;
				anIntArray5124[anLocalInt_262_]
				    = (anIntArray5124[anLocalInt_262_]
				       * argument_140_ / 128);
				anIntArray5130[anLocalInt_262_]
				    = (anIntArray5130[anLocalInt_262_]
				       * argument_141_ / 128);
				anIntArray5075[anLocalInt_262_]
				    = (anIntArray5075[anLocalInt_262_]
				       * argument_142_ / 128);
				anIntArray5124[anLocalInt_262_] += anInt5073;
				anIntArray5130[anLocalInt_262_] += anInt5121;
				anIntArray5075[anLocalInt_262_] += anInt5094;
			    }
			}
		    }
		}
	    }
	} else if (argument_138_ == 5) {
	    if (anIntArrayArray5067 != null && aByteArray5105 != null) {
		for (int anLocalInt_263_ = 0; anLocalInt_263_ < anLocalInt;
		     anLocalInt_263_++) {
		    int anLocalInt_264_ = argument_139_[anLocalInt_263_];
		    if (anLocalInt_264_ < anIntArrayArray5067.length) {
			int[] anLocalInts
			    = anIntArrayArray5067[anLocalInt_264_];
			for (int anLocalInt_265_ = 0;
			     anLocalInt_265_ < anLocalInts.length;
			     anLocalInt_265_++) {
			    int anLocalInt_266_ = anLocalInts[anLocalInt_265_];
			    if (aShortArray5128 == null
				|| (argument_144_
				    & aShortArray5128[anLocalInt_266_]) != 0) {
				int anLocalInt_267_
				    = ((aByteArray5105[anLocalInt_266_] & 0xff)
				       + argument_140_ * 8);
				if (anLocalInt_267_ < 0)
				    anLocalInt_267_ = 0;
				else if (anLocalInt_267_ > 255)
				    anLocalInt_267_ = 255;
				aByteArray5105[anLocalInt_266_]
				    = (byte) anLocalInt_267_;
			    }
			}
		    }
		}
		if (aClass35Array5092 != null) {
		    for (int anLocalInt_268_ = 0; anLocalInt_268_ < anInt5069;
			 anLocalInt_268_++) {
			Class35 class35 = aClass35Array5092[anLocalInt_268_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_268_];
			((Class205) class205).anInt1459
			    = (((Class205) class205).anInt1459 & 0xffffff
			       | 255 - ((aByteArray5105
					 [((Class35) class35).anInt258])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (argument_138_ == 7) {
	    if (anIntArrayArray5067 != null) {
		for (int anLocalInt_269_ = 0; anLocalInt_269_ < anLocalInt;
		     anLocalInt_269_++) {
		    int anLocalInt_270_ = argument_139_[anLocalInt_269_];
		    if (anLocalInt_270_ < anIntArrayArray5067.length) {
			int[] anLocalInts
			    = anIntArrayArray5067[anLocalInt_270_];
			for (int anLocalInt_271_ = 0;
			     anLocalInt_271_ < anLocalInts.length;
			     anLocalInt_271_++) {
			    int anLocalInt_272_ = anLocalInts[anLocalInt_271_];
			    if (aShortArray5128 == null
				|| (argument_144_
				    & aShortArray5128[anLocalInt_272_]) != 0) {
				int anLocalInt_273_
				    = (aShortArray5116[anLocalInt_272_]
				       & 0xffff);
				int anLocalInt_274_
				    = anLocalInt_273_ >> 10 & 0x3f;
				int anLocalInt_275_
				    = anLocalInt_273_ >> 7 & 0x7;
				int anLocalInt_276_ = anLocalInt_273_ & 0x7f;
				anLocalInt_274_
				    = anLocalInt_274_ + argument_140_ & 0x3f;
				anLocalInt_275_ += argument_141_;
				if (anLocalInt_275_ < 0)
				    anLocalInt_275_ = 0;
				else if (anLocalInt_275_ > 7)
				    anLocalInt_275_ = 7;
				anLocalInt_276_ += argument_142_;
				if (anLocalInt_276_ < 0)
				    anLocalInt_276_ = 0;
				else if (anLocalInt_276_ > 127)
				    anLocalInt_276_ = 127;
				aShortArray5116[anLocalInt_272_]
				    = (short) (anLocalInt_274_ << 10
					       | anLocalInt_275_ << 7
					       | anLocalInt_276_);
			    }
			}
			aBoolean5093 = true;
		    }
		}
		if (aClass35Array5092 != null) {
		    for (int anLocalInt_277_ = 0; anLocalInt_277_ < anInt5069;
			 anLocalInt_277_++) {
			Class35 class35 = aClass35Array5092[anLocalInt_277_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_277_];
			((Class205) class205).anInt1459
			    = (((Class205) class205).anInt1459 & ~0xffffff
			       | ((HslToRgb.table2
				   [HslToRgb.method3452(((aShortArray5116[(((Class35) class35).anInt258)]) & 0xffff)) & 0xffff])
				  & 0xffffff));
		    }
		}
	    }
	} else if (argument_138_ == 8) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_278_ = 0; anLocalInt_278_ < anLocalInt;
		     anLocalInt_278_++) {
		    int anLocalInt_279_ = argument_139_[anLocalInt_278_];
		    if (anLocalInt_279_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_279_];
			for (int anLocalInt_280_ = 0;
			     anLocalInt_280_ < anLocalInts.length;
			     anLocalInt_280_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_280_]]);
			    ((Class205) class205).anInt1462 += argument_140_;
			    ((Class205) class205).anInt1461 += argument_141_;
			}
		    }
		}
	    }
	} else if (argument_138_ == 10) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_281_ = 0; anLocalInt_281_ < anLocalInt;
		     anLocalInt_281_++) {
		    int anLocalInt_282_ = argument_139_[anLocalInt_281_];
		    if (anLocalInt_282_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_282_];
			for (int anLocalInt_283_ = 0;
			     anLocalInt_283_ < anLocalInts.length;
			     anLocalInt_283_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_283_]]);
			    ((Class205) class205).anInt1465
				= (((Class205) class205).anInt1465
				   * argument_140_) >> 7;
			    ((Class205) class205).anInt1463
				= (((Class205) class205).anInt1463
				   * argument_141_) >> 7;
			}
		    }
		}
	    }
	} else if (argument_138_ == 9) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_284_ = 0; anLocalInt_284_ < anLocalInt;
		     anLocalInt_284_++) {
		    int anLocalInt_285_ = argument_139_[anLocalInt_284_];
		    if (anLocalInt_285_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_285_];
			for (int anLocalInt_286_ = 0;
			     anLocalInt_286_ < anLocalInts.length;
			     anLocalInt_286_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_286_]]);
			    ((Class205) class205).anInt1469
				= (((Class205) class205).anInt1469
				   + argument_140_) & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    final void C(int argument_287_) {
	if ((anInt5140 & 0x1000) != 4096)
	    throw new IllegalStateException();
	anInt5081 = argument_287_;
	anInt5065 = 0;
    }
    
    private final void method2666(boolean argument_288_) {
	if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
	    synchronized (this) {
		method2686(argument_288_);
	    }
	} else
	    method2686(argument_288_);
    }
    
    private final void method2667(int argument_289_) {
	if (!((Class293) aClass293_5118).aBoolean2412) {
	    short anLocalInt = aShortArray5095[argument_289_];
	    short anLocalInt_290_ = aShortArray5112[argument_289_];
	    short anLocalInt_291_ = aShortArray5110[argument_289_];
	    int anLocalInt_292_ = (anIntArray5144[anLocalInt]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_292_ > 255)
		anLocalInt_292_ = 255;
	    else if (anLocalInt_292_ < 0)
		anLocalInt_292_ = 0;
	    int anLocalInt_293_ = (anIntArray5144[anLocalInt_290_]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_293_ > 255)
		anLocalInt_293_ = 255;
	    else if (anLocalInt_293_ < 0)
		anLocalInt_293_ = 0;
	    int anLocalInt_294_ = (anIntArray5144[anLocalInt_291_]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_294_ > 255)
		anLocalInt_294_ = 255;
	    else if (anLocalInt_294_ < 0)
		anLocalInt_294_ = 0;
	    int anLocalInt_295_
		= anLocalInt_292_ + anLocalInt_293_ + anLocalInt_294_;
	    if (anLocalInt_295_ != 765) {
		if (anLocalInt_295_ == 0)
		    method2690(argument_289_);
		else {
		    if (aByteArray5105 == null)
			((Class89) aClass89_5134).anInt646 = 0;
		    else
			((Class89) aClass89_5134).anInt646
			    = aByteArray5105[argument_289_] & 0xff;
		    if (aShortArray5104 == null
			|| aShortArray5104[argument_289_] == -1) {
			if (anIntArray5126[argument_289_] == -1)
			    aClass89_5134.method1670
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_290_],
				 (float) anIntArray5078[anLocalInt_291_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_290_],
				 (float) anIntArray5084[anLocalInt_291_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_290_],
				 (float) anIntArray5144[anLocalInt_291_],
				 (Statics.method2255((anLocalInt_292_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_289_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_293_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_289_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_294_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_289_] & 0xffff)]))));
			else
			    aClass89_5134.method1670
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_290_],
				 (float) anIntArray5078[anLocalInt_291_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_290_],
				 (float) anIntArray5084[anLocalInt_291_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_290_],
				 (float) anIntArray5144[anLocalInt_291_],
				 (Statics.method2255((anLocalInt_292_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_289_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_293_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5115[argument_289_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_294_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5126[argument_289_] & 0xffff)]))));
		    } else {
			int anLocalInt_296_ = -16777216;
			if (aByteArray5105 != null)
			    anLocalInt_296_
				= (255 - (aByteArray5105[argument_289_] & 0xff)
				   << 24);
			if (anIntArray5126[argument_289_] == -1) {
			    int anLocalInt_297_
				= (anLocalInt_296_
				   | anIntArray5058[argument_289_] & 0xffffff);
			    aClass89_5134.method1664
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_290_],
				 (float) anIntArray5078[anLocalInt_291_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_290_],
				 (float) anIntArray5084[anLocalInt_291_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_290_],
				 (float) anIntArray5144[anLocalInt_291_],
				 aFloatArrayArray5098[argument_289_][0],
				 aFloatArrayArray5098[argument_289_][1],
				 aFloatArrayArray5098[argument_289_][2],
				 aFloatArrayArray5071[argument_289_][0],
				 aFloatArrayArray5071[argument_289_][1],
				 aFloatArrayArray5071[argument_289_][2],
				 anLocalInt_297_, anLocalInt_297_,
				 anLocalInt_297_,
				 ((Class293) aClass293_5118).anInt2408,
				 anLocalInt_292_, anLocalInt_293_,
				 anLocalInt_294_,
				 aShortArray5104[argument_289_]);
			} else
			    aClass89_5134.method1664
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_290_],
				 (float) anIntArray5078[anLocalInt_291_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_290_],
				 (float) anIntArray5084[anLocalInt_291_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_290_],
				 (float) anIntArray5144[anLocalInt_291_],
				 aFloatArrayArray5098[argument_289_][0],
				 aFloatArrayArray5098[argument_289_][1],
				 aFloatArrayArray5098[argument_289_][2],
				 aFloatArrayArray5071[argument_289_][0],
				 aFloatArrayArray5071[argument_289_][1],
				 aFloatArrayArray5071[argument_289_][2],
				 (anLocalInt_296_
				  | anIntArray5058[argument_289_] & 0xffffff),
				 (anLocalInt_296_
				  | anIntArray5115[argument_289_] & 0xffffff),
				 (anLocalInt_296_
				  | anIntArray5126[argument_289_] & 0xffffff),
				 ((Class293) aClass293_5118).anInt2408,
				 anLocalInt_292_, anLocalInt_293_,
				 anLocalInt_294_,
				 aShortArray5104[argument_289_]);
		    }
		}
	    }
	} else {
	    short anLocalInt = aShortArray5095[argument_289_];
	    short anLocalInt_298_ = aShortArray5112[argument_289_];
	    short anLocalInt_299_ = aShortArray5110[argument_289_];
	    int anLocalInt_300_ = 0;
	    int anLocalInt_301_ = 0;
	    int anLocalInt_302_ = 0;
	    if (anIntArray5085[anLocalInt]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_300_ = 255;
	    else if (anIntArray5085[anLocalInt]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_300_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (anIntArray5085[anLocalInt_298_]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_301_ = 255;
	    else if (anIntArray5085[anLocalInt_298_]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_301_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt_298_])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (anIntArray5085[anLocalInt_299_]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_302_ = 255;
	    else if (anIntArray5085[anLocalInt_299_]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_302_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt_299_])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (aByteArray5105 == null)
		((Class89) aClass89_5134).anInt646 = 0;
	    else
		((Class89) aClass89_5134).anInt646
		    = aByteArray5105[argument_289_] & 0xff;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_289_] == -1) {
		if (anIntArray5126[argument_289_] == -1)
		    aClass89_5134.method1670
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_298_],
			 (float) anIntArray5078[anLocalInt_299_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_298_],
			 (float) anIntArray5084[anLocalInt_299_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_298_],
			 (float) anIntArray5144[anLocalInt_299_],
			 (Statics.method2255((anLocalInt_300_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_289_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_301_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_289_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_302_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_289_] & 0xffff]))));
		else
		    aClass89_5134.method1670
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_298_],
			 (float) anIntArray5078[anLocalInt_299_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_298_],
			 (float) anIntArray5084[anLocalInt_299_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_298_],
			 (float) anIntArray5144[anLocalInt_299_],
			 (Statics.method2255((anLocalInt_300_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_289_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_301_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5115[argument_289_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_302_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5126[argument_289_] & 0xffff]))));
	    } else {
		int anLocalInt_303_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_303_
			= 255 - (aByteArray5105[argument_289_] & 0xff) << 24;
		if (anIntArray5126[argument_289_] == -1) {
		    int anLocalInt_304_
			= (anLocalInt_303_
			   | anIntArray5058[argument_289_] & 0xffffff);
		    aClass89_5134.method1664
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_298_],
			 (float) anIntArray5078[anLocalInt_299_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_298_],
			 (float) anIntArray5084[anLocalInt_299_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_298_],
			 (float) anIntArray5144[anLocalInt_299_],
			 aFloatArrayArray5098[argument_289_][0],
			 aFloatArrayArray5098[argument_289_][1],
			 aFloatArrayArray5098[argument_289_][2],
			 aFloatArrayArray5071[argument_289_][0],
			 aFloatArrayArray5071[argument_289_][1],
			 aFloatArrayArray5071[argument_289_][2],
			 anLocalInt_304_, anLocalInt_304_, anLocalInt_304_,
			 ((Class293) aClass293_5118).anInt2408,
			 anLocalInt_300_, anLocalInt_301_, anLocalInt_302_,
			 aShortArray5104[argument_289_]);
		} else
		    aClass89_5134.method1664
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_298_],
			 (float) anIntArray5078[anLocalInt_299_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_298_],
			 (float) anIntArray5084[anLocalInt_299_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_298_],
			 (float) anIntArray5144[anLocalInt_299_],
			 aFloatArrayArray5098[argument_289_][0],
			 aFloatArrayArray5098[argument_289_][1],
			 aFloatArrayArray5098[argument_289_][2],
			 aFloatArrayArray5071[argument_289_][0],
			 aFloatArrayArray5071[argument_289_][1],
			 aFloatArrayArray5071[argument_289_][2],
			 (anLocalInt_303_
			  | anIntArray5058[argument_289_] & 0xffffff),
			 (anLocalInt_303_
			  | anIntArray5115[argument_289_] & 0xffffff),
			 (anLocalInt_303_
			  | anIntArray5126[argument_289_] & 0xffffff),
			 ((Class293) aClass293_5118).anInt2408,
			 anLocalInt_300_, anLocalInt_301_, anLocalInt_302_,
			 aShortArray5104[argument_289_]);
	    }
	}
    }
    
    private final void method2668(int argument_305_) {
	if (!((Class293) aClass293_5118).aBoolean2412) {
	    short anLocalInt = aShortArray5095[argument_305_];
	    short anLocalInt_306_ = aShortArray5112[argument_305_];
	    short anLocalInt_307_ = aShortArray5110[argument_305_];
	    int anLocalInt_308_ = (anIntArray5144[anLocalInt]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_308_ > 255)
		anLocalInt_308_ = 255;
	    else if (anLocalInt_308_ < 0)
		anLocalInt_308_ = 0;
	    int anLocalInt_309_ = (anIntArray5144[anLocalInt_306_]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_309_ > 255)
		anLocalInt_309_ = 255;
	    else if (anLocalInt_309_ < 0)
		anLocalInt_309_ = 0;
	    int anLocalInt_310_ = (anIntArray5144[anLocalInt_307_]
				   - ((Class293) aClass293_5118).anInt2405);
	    if (anLocalInt_310_ > 255)
		anLocalInt_310_ = 255;
	    else if (anLocalInt_310_ < 0)
		anLocalInt_310_ = 0;
	    int anLocalInt_311_
		= anLocalInt_308_ + anLocalInt_309_ + anLocalInt_310_;
	    if (anLocalInt_311_ != 765) {
		if (anLocalInt_311_ == 0)
		    method2665(argument_305_);
		else {
		    if (aByteArray5105 == null)
			((Class89) aClass89_5134).anInt646 = 0;
		    else
			((Class89) aClass89_5134).anInt646
			    = aByteArray5105[argument_305_] & 0xff;
		    if (aShortArray5104 == null
			|| aShortArray5104[argument_305_] == -1) {
			if (anIntArray5126[argument_305_] == -1)
			    aClass89_5134.method1656
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_306_],
				 (float) anIntArray5078[anLocalInt_307_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_306_],
				 (float) anIntArray5084[anLocalInt_307_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_306_],
				 (float) anIntArray5144[anLocalInt_307_],
				 (Statics.method2255((anLocalInt_308_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_305_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_309_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_305_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_310_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_305_] & 0xffff)]))));
			else
			    aClass89_5134.method1656
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_306_],
				 (float) anIntArray5078[anLocalInt_307_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_306_],
				 (float) anIntArray5084[anLocalInt_307_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_306_],
				 (float) anIntArray5144[anLocalInt_307_],
				 (Statics.method2255((anLocalInt_308_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5058[argument_305_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_309_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5115[argument_305_] & 0xffff)]))),
				 (Statics.method2255((anLocalInt_310_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[(anIntArray5126[argument_305_] & 0xffff)]))));
		    } else {
			int anLocalInt_312_ = -16777216;
			if (aByteArray5105 != null)
			    anLocalInt_312_
				= (255 - (aByteArray5105[argument_305_] & 0xff)
				   << 24);
			if (anIntArray5126[argument_305_] == -1) {
			    int anLocalInt_313_
				= (anLocalInt_312_
				   | anIntArray5058[argument_305_] & 0xffffff);
			    aClass89_5134.method1668
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_306_],
				 (float) anIntArray5078[anLocalInt_307_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_306_],
				 (float) anIntArray5084[anLocalInt_307_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_306_],
				 (float) anIntArray5144[anLocalInt_307_],
				 aFloatArrayArray5098[argument_305_][0],
				 aFloatArrayArray5098[argument_305_][1],
				 aFloatArrayArray5098[argument_305_][2],
				 aFloatArrayArray5071[argument_305_][0],
				 aFloatArrayArray5071[argument_305_][1],
				 aFloatArrayArray5071[argument_305_][2],
				 anLocalInt_313_, anLocalInt_313_,
				 anLocalInt_313_,
				 ((Class293) aClass293_5118).anInt2408,
				 anLocalInt_308_, anLocalInt_309_,
				 anLocalInt_310_,
				 aShortArray5104[argument_305_]);
			} else
			    aClass89_5134.method1668
				((float) anIntArray5078[anLocalInt],
				 (float) anIntArray5078[anLocalInt_306_],
				 (float) anIntArray5078[anLocalInt_307_],
				 (float) anIntArray5084[anLocalInt],
				 (float) anIntArray5084[anLocalInt_306_],
				 (float) anIntArray5084[anLocalInt_307_],
				 (float) anIntArray5144[anLocalInt],
				 (float) anIntArray5144[anLocalInt_306_],
				 (float) anIntArray5144[anLocalInt_307_],
				 aFloatArrayArray5098[argument_305_][0],
				 aFloatArrayArray5098[argument_305_][1],
				 aFloatArrayArray5098[argument_305_][2],
				 aFloatArrayArray5071[argument_305_][0],
				 aFloatArrayArray5071[argument_305_][1],
				 aFloatArrayArray5071[argument_305_][2],
				 (anLocalInt_312_
				  | anIntArray5058[argument_305_] & 0xffffff),
				 (anLocalInt_312_
				  | anIntArray5115[argument_305_] & 0xffffff),
				 (anLocalInt_312_
				  | anIntArray5126[argument_305_] & 0xffffff),
				 ((Class293) aClass293_5118).anInt2408,
				 anLocalInt_308_, anLocalInt_309_,
				 anLocalInt_310_,
				 aShortArray5104[argument_305_]);
		    }
		}
	    }
	} else {
	    short anLocalInt = aShortArray5095[argument_305_];
	    short anLocalInt_314_ = aShortArray5112[argument_305_];
	    short anLocalInt_315_ = aShortArray5110[argument_305_];
	    int anLocalInt_316_ = 0;
	    int anLocalInt_317_ = 0;
	    int anLocalInt_318_ = 0;
	    if (anIntArray5085[anLocalInt]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_316_ = 255;
	    else if (anIntArray5085[anLocalInt]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_316_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (anIntArray5085[anLocalInt_314_]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_317_ = 255;
	    else if (anIntArray5085[anLocalInt_314_]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_317_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt_314_])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (anIntArray5085[anLocalInt_315_]
		> ((Class293) aClass293_5118).anInt2407)
		anLocalInt_318_ = 255;
	    else if (anIntArray5085[anLocalInt_315_]
		     > ((Class293) aClass293_5118).anInt2413)
		anLocalInt_318_
		    = ((((Class293) aClass293_5118).anInt2413
			- anIntArray5085[anLocalInt_315_])
		       * 255
		       / (((Class293) aClass293_5118).anInt2413
			  - ((Class293) aClass293_5118).anInt2407));
	    if (aByteArray5105 == null)
		((Class89) aClass89_5134).anInt646 = 0;
	    else
		((Class89) aClass89_5134).anInt646
		    = aByteArray5105[argument_305_] & 0xff;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_305_] == -1) {
		if (anIntArray5126[argument_305_] == -1)
		    aClass89_5134.method1656
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_314_],
			 (float) anIntArray5078[anLocalInt_315_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_314_],
			 (float) anIntArray5084[anLocalInt_315_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_314_],
			 (float) anIntArray5144[anLocalInt_315_],
			 (Statics.method2255((anLocalInt_316_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_305_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_317_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_305_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_318_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_305_] & 0xffff]))));
		else
		    aClass89_5134.method1656
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_314_],
			 (float) anIntArray5078[anLocalInt_315_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_314_],
			 (float) anIntArray5084[anLocalInt_315_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_314_],
			 (float) anIntArray5144[anLocalInt_315_],
			 (Statics.method2255((anLocalInt_316_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5058[argument_305_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_317_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5115[argument_305_] & 0xffff]))),
			 (Statics.method2255((anLocalInt_318_ << 24 | ((Class293) aClass293_5118).anInt2408), (HslToRgb.table2[anIntArray5126[argument_305_] & 0xffff]))));
	    } else {
		int anLocalInt_319_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_319_
			= 255 - (aByteArray5105[argument_305_] & 0xff) << 24;
		if (anIntArray5126[argument_305_] == -1) {
		    int anLocalInt_320_
			= (anLocalInt_319_
			   | anIntArray5058[argument_305_] & 0xffffff);
		    aClass89_5134.method1668
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_314_],
			 (float) anIntArray5078[anLocalInt_315_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_314_],
			 (float) anIntArray5084[anLocalInt_315_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_314_],
			 (float) anIntArray5144[anLocalInt_315_],
			 aFloatArrayArray5098[argument_305_][0],
			 aFloatArrayArray5098[argument_305_][1],
			 aFloatArrayArray5098[argument_305_][2],
			 aFloatArrayArray5071[argument_305_][0],
			 aFloatArrayArray5071[argument_305_][1],
			 aFloatArrayArray5071[argument_305_][2],
			 anLocalInt_320_, anLocalInt_320_, anLocalInt_320_,
			 ((Class293) aClass293_5118).anInt2408,
			 anLocalInt_316_, anLocalInt_317_, anLocalInt_318_,
			 aShortArray5104[argument_305_]);
		} else
		    aClass89_5134.method1668
			((float) anIntArray5078[anLocalInt],
			 (float) anIntArray5078[anLocalInt_314_],
			 (float) anIntArray5078[anLocalInt_315_],
			 (float) anIntArray5084[anLocalInt],
			 (float) anIntArray5084[anLocalInt_314_],
			 (float) anIntArray5084[anLocalInt_315_],
			 (float) anIntArray5144[anLocalInt],
			 (float) anIntArray5144[anLocalInt_314_],
			 (float) anIntArray5144[anLocalInt_315_],
			 aFloatArrayArray5098[argument_305_][0],
			 aFloatArrayArray5098[argument_305_][1],
			 aFloatArrayArray5098[argument_305_][2],
			 aFloatArrayArray5071[argument_305_][0],
			 aFloatArrayArray5071[argument_305_][1],
			 aFloatArrayArray5071[argument_305_][2],
			 (anLocalInt_319_
			  | anIntArray5058[argument_305_] & 0xffffff),
			 (anLocalInt_319_
			  | anIntArray5115[argument_305_] & 0xffffff),
			 (anLocalInt_319_
			  | anIntArray5126[argument_305_] & 0xffffff),
			 ((Class293) aClass293_5118).anInt2408,
			 anLocalInt_316_, anLocalInt_317_, anLocalInt_318_,
			 aShortArray5104[argument_305_]);
	    }
	}
    }
    
    final int ua() {
	return anInt5140;
    }
    
    final Class38[] method2641() {
	return aClass38Array5079;
    }
    
    final boolean F() {
	return aBoolean5131;
    }
    
    private final void method2669() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++) {
		int anLocalInt_321_ = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = -anLocalInt_321_;
		if (aClass56Array5138[anLocalInt] != null) {
		    anLocalInt_321_
			= ((Class56) aClass56Array5138[anLocalInt]).anInt410;
		    ((Class56) aClass56Array5138[anLocalInt]).anInt410
			= ((Class56) aClass56Array5138[anLocalInt]).anInt411;
		    ((Class56) aClass56Array5138[anLocalInt]).anInt411
			= -anLocalInt_321_;
		}
	    }
	    if (aClass312Array5082 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (aClass312Array5082[anLocalInt] != null) {
			int anLocalInt_322_
			    = (((Class312) aClass312Array5082[anLocalInt])
			       .anInt2593);
			((Class312) aClass312Array5082[anLocalInt]).anInt2593
			    = (((Class312) aClass312Array5082[anLocalInt])
			       .anInt2595);
			((Class312) aClass312Array5082[anLocalInt]).anInt2595
			    = -anLocalInt_322_;
		    }
		}
	    }
	    for (int anLocalInt = anInt5142; anLocalInt < anInt5136;
		 anLocalInt++) {
		int anLocalInt_323_ = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = -anLocalInt_323_;
	    }
	    anInt5065 = 0;
	    aBoolean5064 = false;
	}
    }
    
    final void method2660(Class167 argument_324_, int argument_325_,
			  int argument_326_, int argument_327_,
			  boolean argument_328_) {
	Class167_Sub1 class167_sub1 = (Class167_Sub1) argument_324_;
	if ((anInt5140 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	if ((class167_sub1.anInt5140 & 0x10000) != 65536)
	    throw new IllegalStateException("");
	method2676(Thread.currentThread());
	method2693();
	method2689();
	class167_sub1.method2693();
	class167_sub1.method2689();
	anInt5057++;
	int anLocalInt = 0;
	int[] anLocalInts = class167_sub1.anIntArray5124;
	int anLocalInt_329_ = class167_sub1.anInt5142;
	for (int anLocalInt_330_ = 0; anLocalInt_330_ < anInt5142;
	     anLocalInt_330_++) {
	    Class56 class56 = aClass56Array5138[anLocalInt_330_];
	    if (((Class56) class56).anInt412 != 0) {
		int anLocalInt_331_
		    = anIntArray5130[anLocalInt_330_] - argument_326_;
		if (anLocalInt_331_ >= class167_sub1.aShort5127
		    && anLocalInt_331_ <= class167_sub1.aShort5123) {
		    int anLocalInt_332_
			= anIntArray5124[anLocalInt_330_] - argument_325_;
		    if (anLocalInt_332_ >= class167_sub1.aShort5108
			&& anLocalInt_332_ <= class167_sub1.aShort5090) {
			int anLocalInt_333_
			    = anIntArray5075[anLocalInt_330_] - argument_327_;
			if (anLocalInt_333_ >= class167_sub1.aShort5133
			    && anLocalInt_333_ <= class167_sub1.aShort5080) {
			    for (int anLocalInt_334_ = 0;
				 anLocalInt_334_ < anLocalInt_329_;
				 anLocalInt_334_++) {
				Class56 class56_335_
				    = (class167_sub1.aClass56Array5138
				       [anLocalInt_334_]);
				if ((anLocalInt_332_
				     == anLocalInts[anLocalInt_334_])
				    && anLocalInt_333_ == (class167_sub1
							   .anIntArray5075
							   [anLocalInt_334_])
				    && anLocalInt_331_ == (class167_sub1
							   .anIntArray5130
							   [anLocalInt_334_])
				    && (((Class56) class56_335_).anInt412
					!= 0)) {
				    if (aClass56Array5076 == null)
					aClass56Array5076
					    = new Class56[anInt5142];
				    if (class167_sub1.aClass56Array5076
					== null)
					class167_sub1.aClass56Array5076
					    = new Class56[anLocalInt_329_];
				    Class56 class56_336_
					= aClass56Array5076[anLocalInt_330_];
				    if (class56_336_ == null)
					class56_336_
					    = aClass56Array5076
						  [anLocalInt_330_]
					    = new Class56(class56);
				    Class56 class56_337_
					= (class167_sub1.aClass56Array5076
					   [anLocalInt_334_]);
				    if (class56_337_ == null)
					class56_337_
					    = class167_sub1
						  .aClass56Array5076
						  [anLocalInt_334_]
					    = new Class56(class56_335_);
				    ((Class56) class56_336_).anInt411
					+= ((Class56) class56_335_).anInt411;
				    ((Class56) class56_336_).anInt413
					+= ((Class56) class56_335_).anInt413;
				    ((Class56) class56_336_).anInt410
					+= ((Class56) class56_335_).anInt410;
				    ((Class56) class56_336_).anInt412
					+= ((Class56) class56_335_).anInt412;
				    ((Class56) class56_337_).anInt411
					+= ((Class56) class56).anInt411;
				    ((Class56) class56_337_).anInt413
					+= ((Class56) class56).anInt413;
				    ((Class56) class56_337_).anInt410
					+= ((Class56) class56).anInt410;
				    ((Class56) class56_337_).anInt412
					+= ((Class56) class56).anInt412;
				    anLocalInt++;
				    anIntArray5143[anLocalInt_330_]
					= anInt5057;
				    anIntArray5061[anLocalInt_334_]
					= anInt5057;
				}
			    }
			}
		    }
		}
	    }
	}
	if (anLocalInt >= 3 && argument_328_) {
	    for (int anLocalInt_338_ = 0; anLocalInt_338_ < anInt5070;
		 anLocalInt_338_++) {
		if ((anIntArray5143[aShortArray5095[anLocalInt_338_]]
		     == anInt5057)
		    && (anIntArray5143[aShortArray5112[anLocalInt_338_]]
			== anInt5057)
		    && (anIntArray5143[aShortArray5110[anLocalInt_338_]]
			== anInt5057)) {
		    if (aByteArray5132 == null)
			aByteArray5132 = new byte[anInt5070];
		    aByteArray5132[anLocalInt_338_] = (byte) 2;
		}
	    }
	    for (int anLocalInt_339_ = 0;
		 anLocalInt_339_ < class167_sub1.anInt5070;
		 anLocalInt_339_++) {
		if (anIntArray5061[(class167_sub1.aShortArray5095
				    [anLocalInt_339_])] == anInt5057
		    && anIntArray5061[(class167_sub1.aShortArray5112
				       [anLocalInt_339_])] == anInt5057
		    && anIntArray5061[(class167_sub1.aShortArray5110
				       [anLocalInt_339_])] == anInt5057) {
		    if (class167_sub1.aByteArray5132 == null)
			class167_sub1.aByteArray5132
			    = new byte[class167_sub1.anInt5070];
		    class167_sub1.aByteArray5132[anLocalInt_339_] = (byte) 2;
		}
	    }
	}
    }
    
    private final void method2670() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		int anLocalInt_340_ = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = -anLocalInt_340_;
	    }
	    method2672();
	}
    }
    
    private final void method2671(int argument_341_) {
	int anLocalInt = 0;
	int anLocalInt_342_ = ((JavaToolkit) aClass_ha__5089).anInt4643;
	short anLocalInt_343_ = aShortArray5095[argument_341_];
	short anLocalInt_344_ = aShortArray5112[argument_341_];
	short anLocalInt_345_ = aShortArray5110[argument_341_];
	int anLocalInt_346_ = anIntArray5088[anLocalInt_343_];
	int anLocalInt_347_ = anIntArray5088[anLocalInt_344_];
	int anLocalInt_348_ = anIntArray5088[anLocalInt_345_];
	if (aByteArray5105 == null)
	    ((Class89) aClass89_5134).anInt646 = 0;
	else
	    ((Class89) aClass89_5134).anInt646
		= aByteArray5105[argument_341_] & 0xff;
	if (anLocalInt_346_ >= anLocalInt_342_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_343_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_343_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_343_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5058[argument_341_] & 0xffff;
	} else {
	    int anLocalInt_349_ = anIntArray5109[anLocalInt_343_];
	    int anLocalInt_350_ = anIntArray5111[anLocalInt_343_];
	    int anLocalInt_351_ = anIntArray5058[argument_341_] & 0xffff;
	    if (anLocalInt_348_ >= anLocalInt_342_) {
		int anLocalInt_352_
		    = ((anLocalInt_342_ - anLocalInt_346_)
		       * (65536 / (anLocalInt_348_ - anLocalInt_346_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_349_
			   + ((anIntArray5109[anLocalInt_345_]
			       - anLocalInt_349_) * anLocalInt_352_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_350_
			   + ((anIntArray5111[anLocalInt_345_]
			       - anLocalInt_350_) * anLocalInt_352_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_351_ + (((anIntArray5126[argument_341_]
					   & 0xffff)
					  - anLocalInt_351_) * anLocalInt_352_
					 >> 16);
	    }
	    if (anLocalInt_347_ >= anLocalInt_342_) {
		int anLocalInt_353_
		    = ((anLocalInt_342_ - anLocalInt_346_)
		       * (65536 / (anLocalInt_347_ - anLocalInt_346_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_349_
			   + ((anIntArray5109[anLocalInt_344_]
			       - anLocalInt_349_) * anLocalInt_353_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_350_
			   + ((anIntArray5111[anLocalInt_344_]
			       - anLocalInt_350_) * anLocalInt_353_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_351_ + (((anIntArray5115[argument_341_]
					   & 0xffff)
					  - anLocalInt_351_) * anLocalInt_353_
					 >> 16);
	    }
	}
	if (anLocalInt_347_ >= anLocalInt_342_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_344_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_344_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_344_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5115[argument_341_] & 0xffff;
	} else {
	    int anLocalInt_354_ = anIntArray5109[anLocalInt_344_];
	    int anLocalInt_355_ = anIntArray5111[anLocalInt_344_];
	    int anLocalInt_356_ = anIntArray5115[argument_341_] & 0xffff;
	    if (anLocalInt_346_ >= anLocalInt_342_) {
		int anLocalInt_357_
		    = ((anLocalInt_342_ - anLocalInt_347_)
		       * (65536 / (anLocalInt_346_ - anLocalInt_347_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_354_
			   + ((anIntArray5109[anLocalInt_343_]
			       - anLocalInt_354_) * anLocalInt_357_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_355_
			   + ((anIntArray5111[anLocalInt_343_]
			       - anLocalInt_355_) * anLocalInt_357_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_356_ + (((anIntArray5058[argument_341_]
					   & 0xffff)
					  - anLocalInt_356_) * anLocalInt_357_
					 >> 16);
	    }
	    if (anLocalInt_348_ >= anLocalInt_342_) {
		int anLocalInt_358_
		    = ((anLocalInt_342_ - anLocalInt_347_)
		       * (65536 / (anLocalInt_348_ - anLocalInt_347_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_354_
			   + ((anIntArray5109[anLocalInt_345_]
			       - anLocalInt_354_) * anLocalInt_358_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_355_
			   + ((anIntArray5111[anLocalInt_345_]
			       - anLocalInt_355_) * anLocalInt_358_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_356_ + (((anIntArray5126[argument_341_]
					   & 0xffff)
					  - anLocalInt_356_) * anLocalInt_358_
					 >> 16);
	    }
	}
	if (anLocalInt_348_ >= anLocalInt_342_) {
	    anIntArray5077[anLocalInt] = anIntArray5084[anLocalInt_345_];
	    anIntArray5137[anLocalInt] = anIntArray5078[anLocalInt_345_];
	    anIntArray5113[anLocalInt] = anIntArray5144[anLocalInt_345_];
	    anIntArray5056[anLocalInt++]
		= anIntArray5126[argument_341_] & 0xffff;
	} else {
	    int anLocalInt_359_ = anIntArray5109[anLocalInt_345_];
	    int anLocalInt_360_ = anIntArray5111[anLocalInt_345_];
	    int anLocalInt_361_ = anIntArray5126[argument_341_] & 0xffff;
	    if (anLocalInt_347_ >= anLocalInt_342_) {
		int anLocalInt_362_
		    = ((anLocalInt_342_ - anLocalInt_348_)
		       * (65536 / (anLocalInt_347_ - anLocalInt_348_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_359_
			   + ((anIntArray5109[anLocalInt_344_]
			       - anLocalInt_359_) * anLocalInt_362_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_360_
			   + ((anIntArray5111[anLocalInt_344_]
			       - anLocalInt_360_) * anLocalInt_362_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_361_ + (((anIntArray5115[argument_341_]
					   & 0xffff)
					  - anLocalInt_361_) * anLocalInt_362_
					 >> 16);
	    }
	    if (anLocalInt_346_ >= anLocalInt_342_) {
		int anLocalInt_363_
		    = ((anLocalInt_342_ - anLocalInt_348_)
		       * (65536 / (anLocalInt_346_ - anLocalInt_348_)));
		anIntArray5077[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2436
		       + ((anLocalInt_359_
			   + ((anIntArray5109[anLocalInt_343_]
			       - anLocalInt_359_) * anLocalInt_363_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4653
			  / anLocalInt_342_));
		anIntArray5137[anLocalInt]
		    = (((Class293) aClass293_5118).anInt2437
		       + ((anLocalInt_360_
			   + ((anIntArray5111[anLocalInt_343_]
			       - anLocalInt_360_) * anLocalInt_363_
			      >> 16))
			  * ((JavaToolkit) aClass_ha__5089).anInt4645
			  / anLocalInt_342_));
		anIntArray5113[anLocalInt] = anLocalInt_342_;
		anIntArray5056[anLocalInt++]
		    = anLocalInt_361_ + (((anIntArray5058[argument_341_]
					   & 0xffff)
					  - anLocalInt_361_) * anLocalInt_363_
					 >> 16);
	    }
	}
	int anLocalInt_364_ = anIntArray5077[0];
	int anLocalInt_365_ = anIntArray5077[1];
	int anLocalInt_366_ = anIntArray5077[2];
	int anLocalInt_367_ = anIntArray5137[0];
	int anLocalInt_368_ = anIntArray5137[1];
	int anLocalInt_369_ = anIntArray5137[2];
	anLocalInt_346_ = anIntArray5113[0];
	anLocalInt_347_ = anIntArray5113[1];
	anLocalInt_348_ = anIntArray5113[2];
	((Class89) aClass89_5134).aBoolean661 = false;
	if (anLocalInt == 3) {
	    if (anLocalInt_364_ < 0 || anLocalInt_365_ < 0
		|| anLocalInt_366_ < 0
		|| anLocalInt_364_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_365_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_366_ > ((Class293) aClass293_5118).anInt2422)
		((Class89) aClass89_5134).aBoolean661 = true;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_341_] == -1) {
		if (anIntArray5126[argument_341_] == -1)
		    aClass89_5134.method1660
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_,
			 (HslToRgb.table2
			  [anIntArray5058[argument_341_] & 0xffff]));
		else
		    aClass89_5134.method1663
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_, (float) anIntArray5056[0],
			 (float) anIntArray5056[1], (float) anIntArray5056[2]);
	    } else {
		int anLocalInt_370_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_370_
			= 255 - (aByteArray5105[argument_341_] & 0xff) << 24;
		int anLocalInt_371_
		    = (anLocalInt_370_
		       | anIntArray5058[argument_341_] & 0xffffff);
		if (anIntArray5126[argument_341_] == -1)
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_,
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_371_, anLocalInt_371_, anLocalInt_371_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
		else
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_,
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_371_, anLocalInt_371_, anLocalInt_371_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
	    }
	}
	if (anLocalInt == 4) {
	    if (anLocalInt_364_ < 0 || anLocalInt_365_ < 0
		|| anLocalInt_366_ < 0
		|| anLocalInt_364_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_365_ > ((Class293) aClass293_5118).anInt2422
		|| anLocalInt_366_ > ((Class293) aClass293_5118).anInt2422
		|| anIntArray5077[3] < 0
		|| anIntArray5077[3] > ((Class293) aClass293_5118).anInt2422)
		((Class89) aClass89_5134).aBoolean661 = true;
	    if (aShortArray5104 == null
		|| aShortArray5104[argument_341_] == -1) {
		if (anIntArray5126[argument_341_] == -1) {
		    int anLocalInt_372_
			= (HslToRgb.table2
			   [anIntArray5058[argument_341_] & 0xffff]);
		    aClass89_5134.method1660((float) anLocalInt_367_,
					     (float) anLocalInt_368_,
					     (float) anLocalInt_369_,
					     (float) anLocalInt_364_,
					     (float) anLocalInt_365_,
					     (float) anLocalInt_366_,
					     (float) anLocalInt_346_,
					     (float) anLocalInt_347_,
					     (float) anLocalInt_348_,
					     anLocalInt_372_);
		    aClass89_5134.method1660((float) anLocalInt_367_,
					     (float) anLocalInt_369_,
					     (float) anIntArray5137[3],
					     (float) anLocalInt_364_,
					     (float) anLocalInt_366_,
					     (float) anIntArray5077[3],
					     (float) anLocalInt_346_,
					     (float) anLocalInt_347_,
					     (float) anIntArray5113[3],
					     anLocalInt_372_);
		} else {
		    aClass89_5134.method1663
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_, (float) anIntArray5056[0],
			 (float) anIntArray5056[1], (float) anIntArray5056[2]);
		    aClass89_5134.method1663
			((float) anLocalInt_367_, (float) anLocalInt_369_,
			 (float) anIntArray5137[3], (float) anLocalInt_364_,
			 (float) anLocalInt_366_, (float) anIntArray5077[3],
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anIntArray5113[3], (float) anIntArray5056[0],
			 (float) anIntArray5056[2], (float) anIntArray5056[3]);
		}
	    } else {
		int anLocalInt_373_ = -16777216;
		if (aByteArray5105 != null)
		    anLocalInt_373_
			= 255 - (aByteArray5105[argument_341_] & 0xff) << 24;
		int anLocalInt_374_
		    = (anLocalInt_373_
		       | anIntArray5058[argument_341_] & 0xffffff);
		if (anIntArray5126[argument_341_] == -1) {
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_,
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_374_, anLocalInt_374_, anLocalInt_374_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_369_,
			 (float) anIntArray5137[3], (float) anLocalInt_364_,
			 (float) anLocalInt_366_, (float) anIntArray5077[3],
			 (float) anLocalInt_346_, (float) anLocalInt_348_,
			 (float) anIntArray5113[3],
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_374_, anLocalInt_374_, anLocalInt_374_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
		} else {
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_368_,
			 (float) anLocalInt_369_, (float) anLocalInt_364_,
			 (float) anLocalInt_365_, (float) anLocalInt_366_,
			 (float) anLocalInt_346_, (float) anLocalInt_347_,
			 (float) anLocalInt_348_,
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_374_, anLocalInt_374_, anLocalInt_374_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
		    aClass89_5134.method1668
			((float) anLocalInt_367_, (float) anLocalInt_369_,
			 (float) anIntArray5137[3], (float) anLocalInt_364_,
			 (float) anLocalInt_366_, (float) anIntArray5077[3],
			 (float) anLocalInt_346_, (float) anLocalInt_348_,
			 (float) anIntArray5113[3],
			 aFloatArrayArray5098[argument_341_][0],
			 aFloatArrayArray5098[argument_341_][1],
			 aFloatArrayArray5098[argument_341_][2],
			 aFloatArrayArray5071[argument_341_][0],
			 aFloatArrayArray5071[argument_341_][1],
			 aFloatArrayArray5071[argument_341_][2],
			 anLocalInt_374_, anLocalInt_374_, anLocalInt_374_,
			 ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
			 aShortArray5104[argument_341_]);
		}
	    }
	}
    }
    
    private final void method2672() {
	aClass56Array5138 = null;
	aClass56Array5076 = null;
	aClass312Array5082 = null;
	aBoolean5064 = false;
    }
    
    final void LA(int argument_375_) {
	if ((anInt5140 & 0x2000) != 8192)
	    throw new IllegalStateException();
	anInt5117 = argument_375_;
	anInt5065 = 0;
    }
    
    final boolean r() {
	return aBoolean5097;
    }
    
    final void aa(short argument_376_, short argument_377_) {
	if (aShortArray5104 != null) {
	    if (!aBoolean5097 && argument_377_ >= 0) {
		TextureDescriptor textureDescriptor
		    = ((GraphicsToolkit) aClass_ha__5089).textureSource
			  .getDescriptor(argument_377_ & 0xffff, true);
		if (((TextureDescriptor) textureDescriptor).aByte845 != 0
		    || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
		    aBoolean5097 = true;
	    }
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		if (aShortArray5104[anLocalInt] == argument_376_)
		    aShortArray5104[anLocalInt] = argument_377_;
	    }
	}
    }
    
    final int G() {
	if (!aBoolean5064)
	    method2693();
	return aShort5080;
    }
    
    final void FA(int argument_378_) {
	if ((anInt5140 & 0x6) != 6)
	    throw new IllegalStateException();
	int anLocalInt = Node_Sub6.SINETABLE[argument_378_];
	int anLocalInt_379_ = Node_Sub6.COSINETABLE[argument_378_];
	synchronized (this) {
	    for (int anLocalInt_380_ = 0; anLocalInt_380_ < anInt5136;
		 anLocalInt_380_++) {
		int anLocalInt_381_
		    = ((anIntArray5130[anLocalInt_380_] * anLocalInt_379_
			- anIntArray5075[anLocalInt_380_] * anLocalInt)
		       >> 14);
		anIntArray5075[anLocalInt_380_]
		    = ((anIntArray5130[anLocalInt_380_] * anLocalInt
			+ anIntArray5075[anLocalInt_380_] * anLocalInt_379_)
		       >> 14);
		anIntArray5130[anLocalInt_380_] = anLocalInt_381_;
	    }
	    method2672();
	}
    }
    
    private final void method2673() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++) {
		anIntArray5124[anLocalInt] = -anIntArray5124[anLocalInt];
		anIntArray5075[anLocalInt] = -anIntArray5075[anLocalInt];
		if (aClass56Array5138[anLocalInt] != null) {
		    ((Class56) aClass56Array5138[anLocalInt]).anInt411
			= -((Class56) aClass56Array5138[anLocalInt]).anInt411;
		    ((Class56) aClass56Array5138[anLocalInt]).anInt410
			= -((Class56) aClass56Array5138[anLocalInt]).anInt410;
		}
	    }
	    if (aClass312Array5082 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (aClass312Array5082[anLocalInt] != null) {
			((Class312) aClass312Array5082[anLocalInt]).anInt2595
			    = -(((Class312) aClass312Array5082[anLocalInt])
				.anInt2595);
			((Class312) aClass312Array5082[anLocalInt]).anInt2593
			    = -(((Class312) aClass312Array5082[anLocalInt])
				.anInt2593);
		    }
		}
	    }
	    for (int anLocalInt = anInt5142; anLocalInt < anInt5136;
		 anLocalInt++) {
		anIntArray5124[anLocalInt] = -anIntArray5124[anLocalInt];
		anIntArray5075[anLocalInt] = -anIntArray5075[anLocalInt];
	    }
	    anInt5065 = 0;
	    aBoolean5064 = false;
	}
    }
    
    final int ma() {
	if (!aBoolean5064)
	    method2693();
	return aShort5107;
    }
    
    final int na() {
	if (!aBoolean5064)
	    method2693();
	return aShort5141;
    }
    
    final int HA() {
	if (!aBoolean5064)
	    method2693();
	return aShort5133;
    }
    
    final void wa() {
	if (aBoolean5083) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt]
		    = anIntArray5124[anLocalInt] + 7 >> 4;
		anIntArray5130[anLocalInt]
		    = anIntArray5130[anLocalInt] + 7 >> 4;
		anIntArray5075[anLocalInt]
		    = anIntArray5075[anLocalInt] + 7 >> 4;
	    }
	    aBoolean5083 = false;
	}
	if (aBoolean5093) {
	    method2680();
	    aBoolean5093 = false;
	}
	aBoolean5064 = false;
    }
    
    private final boolean method2674
	(int argument_382_, int argument_383_, Class350 argument_384_,
	 boolean argument_385_, int argument_386_, int argument_387_) {
	aClass350_Sub1_5125 = (Class350_Sub1) argument_384_;
	Class350_Sub1 class350_sub1
	    = ((JavaToolkit) aClass_ha__5089).aClass350_Sub1_4648;
	float f = (((Class350_Sub1) class350_sub1).aFloat5426
		   + ((((Class350_Sub1) class350_sub1).aFloat5421
		       * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		      + (((Class350_Sub1) class350_sub1).aFloat5425
			 * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		      + (((Class350_Sub1) class350_sub1).aFloat5428
			 * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427)));
	float f_388_
	    = (((Class350_Sub1) class350_sub1).aFloat5424
	       + ((((Class350_Sub1) class350_sub1).aFloat5420
		   * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		  + (((Class350_Sub1) class350_sub1).aFloat5430
		     * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		  + (((Class350_Sub1) class350_sub1).aFloat5429
		     * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427)));
	float f_389_
	    = (((Class350_Sub1) class350_sub1).aFloat5427
	       + ((((Class350_Sub1) class350_sub1).aFloat5418
		   * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5426)
		  + (((Class350_Sub1) class350_sub1).aFloat5422
		     * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5424)
		  + (((Class350_Sub1) class350_sub1).aFloat5419
		     * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5427)));
	float f_390_
	    = ((((Class350_Sub1) class350_sub1).aFloat5421
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
	       + (((Class350_Sub1) class350_sub1).aFloat5425
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5420)
	       + (((Class350_Sub1) class350_sub1).aFloat5428
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5418));
	float f_391_
	    = ((((Class350_Sub1) class350_sub1).aFloat5421
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
	       + (((Class350_Sub1) class350_sub1).aFloat5425
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5430)
	       + (((Class350_Sub1) class350_sub1).aFloat5428
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5422));
	float f_392_
	    = ((((Class350_Sub1) class350_sub1).aFloat5421
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
	       + (((Class350_Sub1) class350_sub1).aFloat5425
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5429)
	       + (((Class350_Sub1) class350_sub1).aFloat5428
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5419));
	float f_393_
	    = ((((Class350_Sub1) class350_sub1).aFloat5420
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
	       + (((Class350_Sub1) class350_sub1).aFloat5430
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5420)
	       + (((Class350_Sub1) class350_sub1).aFloat5429
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5418));
	float f_394_
	    = ((((Class350_Sub1) class350_sub1).aFloat5420
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
	       + (((Class350_Sub1) class350_sub1).aFloat5430
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5430)
	       + (((Class350_Sub1) class350_sub1).aFloat5429
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5422));
	float f_395_
	    = ((((Class350_Sub1) class350_sub1).aFloat5420
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
	       + (((Class350_Sub1) class350_sub1).aFloat5430
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5429)
	       + (((Class350_Sub1) class350_sub1).aFloat5429
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5419));
	float f_396_
	    = ((((Class350_Sub1) class350_sub1).aFloat5418
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5421)
	       + (((Class350_Sub1) class350_sub1).aFloat5422
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5420)
	       + (((Class350_Sub1) class350_sub1).aFloat5419
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5418));
	float f_397_
	    = ((((Class350_Sub1) class350_sub1).aFloat5418
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5425)
	       + (((Class350_Sub1) class350_sub1).aFloat5422
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5430)
	       + (((Class350_Sub1) class350_sub1).aFloat5419
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5422));
	float f_398_
	    = ((((Class350_Sub1) class350_sub1).aFloat5418
		* ((Class350_Sub1) aClass350_Sub1_5125).aFloat5428)
	       + (((Class350_Sub1) class350_sub1).aFloat5422
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5429)
	       + (((Class350_Sub1) class350_sub1).aFloat5419
		  * ((Class350_Sub1) aClass350_Sub1_5125).aFloat5419));
	boolean anLocalBoolean = false;
	int anLocalInt = ((JavaToolkit) aClass_ha__5089).anInt4668;
	int anLocalInt_399_ = ((JavaToolkit) aClass_ha__5089).anInt4642;
	int anLocalInt_400_ = ((JavaToolkit) aClass_ha__5089).anInt4653;
	int anLocalInt_401_ = ((JavaToolkit) aClass_ha__5089).anInt4645;
	int anLocalInt_402_ = 2147483647;
	int anLocalInt_403_ = -2147483648;
	int anLocalInt_404_ = 2147483647;
	int anLocalInt_405_ = -2147483648;
	method2676(Thread.currentThread());
	if (!aBoolean5064)
	    method2693();
	int anLocalInt_406_ = aShort5090 - aShort5108 >> 1;
	int anLocalInt_407_ = aShort5123 - aShort5127 >> 1;
	int anLocalInt_408_ = aShort5080 - aShort5133 >> 1;
	int anLocalInt_409_ = aShort5108 + anLocalInt_406_;
	int anLocalInt_410_ = aShort5127 + anLocalInt_407_;
	int anLocalInt_411_ = aShort5133 + anLocalInt_408_;
	int anLocalInt_412_
	    = anLocalInt_409_ - (anLocalInt_406_ << argument_386_);
	int anLocalInt_413_
	    = anLocalInt_410_ - (anLocalInt_407_ << argument_386_);
	int anLocalInt_414_
	    = anLocalInt_411_ - (anLocalInt_408_ << argument_386_);
	int anLocalInt_415_
	    = anLocalInt_409_ + (anLocalInt_406_ << argument_386_);
	int anLocalInt_416_
	    = anLocalInt_410_ + (anLocalInt_407_ << argument_386_);
	int anLocalInt_417_
	    = anLocalInt_411_ + (anLocalInt_408_ << argument_386_);
	anIntArray5091[0] = anLocalInt_412_;
	anIntArray5101[0] = anLocalInt_413_;
	anIntArray5119[0] = anLocalInt_414_;
	anIntArray5091[1] = anLocalInt_415_;
	anIntArray5101[1] = anLocalInt_413_;
	anIntArray5119[1] = anLocalInt_414_;
	anIntArray5091[2] = anLocalInt_412_;
	anIntArray5101[2] = anLocalInt_416_;
	anIntArray5119[2] = anLocalInt_414_;
	anIntArray5091[3] = anLocalInt_415_;
	anIntArray5101[3] = anLocalInt_416_;
	anIntArray5119[3] = anLocalInt_414_;
	anIntArray5091[4] = anLocalInt_412_;
	anIntArray5101[4] = anLocalInt_413_;
	anIntArray5119[4] = anLocalInt_417_;
	anIntArray5091[5] = anLocalInt_415_;
	anIntArray5101[5] = anLocalInt_413_;
	anIntArray5119[5] = anLocalInt_417_;
	anIntArray5091[6] = anLocalInt_412_;
	anIntArray5101[6] = anLocalInt_416_;
	anIntArray5119[6] = anLocalInt_417_;
	anIntArray5091[7] = anLocalInt_415_;
	anIntArray5101[7] = anLocalInt_416_;
	anIntArray5119[7] = anLocalInt_417_;
	for (int anLocalInt_418_ = 0; anLocalInt_418_ < 8; anLocalInt_418_++) {
	    int anLocalInt_419_ = anIntArray5091[anLocalInt_418_];
	    int anLocalInt_420_ = anIntArray5101[anLocalInt_418_];
	    int anLocalInt_421_ = anIntArray5119[anLocalInt_418_];
	    float f_422_ = f + (f_390_ * (float) anLocalInt_419_
				+ f_391_ * (float) anLocalInt_420_
				+ f_392_ * (float) anLocalInt_421_);
	    float f_423_ = f_388_ + (f_393_ * (float) anLocalInt_419_
				     + f_394_ * (float) anLocalInt_420_
				     + f_395_ * (float) anLocalInt_421_);
	    float f_424_ = f_389_ + (f_396_ * (float) anLocalInt_419_
				     + f_397_ * (float) anLocalInt_420_
				     + f_398_ * (float) anLocalInt_421_);
	    if (f_424_
		>= (float) ((JavaToolkit) aClass_ha__5089).anInt4643) {
		if (argument_387_ > 0)
		    f_424_ = (float) argument_387_;
		int anLocalInt_425_
		    = (anLocalInt
		       + (int) (f_422_ * (float) anLocalInt_400_ / f_424_));
		int anLocalInt_426_
		    = (anLocalInt_399_
		       + (int) (f_423_ * (float) anLocalInt_401_ / f_424_));
		if (anLocalInt_425_ < anLocalInt_402_)
		    anLocalInt_402_ = anLocalInt_425_;
		if (anLocalInt_425_ > anLocalInt_403_)
		    anLocalInt_403_ = anLocalInt_425_;
		if (anLocalInt_426_ < anLocalInt_404_)
		    anLocalInt_404_ = anLocalInt_426_;
		if (anLocalInt_426_ > anLocalInt_405_)
		    anLocalInt_405_ = anLocalInt_426_;
		anLocalBoolean = true;
	    }
	}
	if (anLocalBoolean && argument_382_ > anLocalInt_402_
	    && argument_382_ < anLocalInt_403_
	    && argument_383_ > anLocalInt_404_
	    && argument_383_ < anLocalInt_405_) {
	    if (argument_385_)
		return true;
	    for (int anLocalInt_427_ = 0; anLocalInt_427_ < anInt5136;
		 anLocalInt_427_++) {
		int anLocalInt_428_ = anIntArray5124[anLocalInt_427_];
		int anLocalInt_429_ = anIntArray5130[anLocalInt_427_];
		int anLocalInt_430_ = anIntArray5075[anLocalInt_427_];
		float f_431_ = f + (f_390_ * (float) anLocalInt_428_
				    + f_391_ * (float) anLocalInt_429_
				    + f_392_ * (float) anLocalInt_430_);
		float f_432_ = f_388_ + (f_393_ * (float) anLocalInt_428_
					 + f_394_ * (float) anLocalInt_429_
					 + f_395_ * (float) anLocalInt_430_);
		float f_433_ = f_389_ + (f_396_ * (float) anLocalInt_428_
					 + f_397_ * (float) anLocalInt_429_
					 + f_398_ * (float) anLocalInt_430_);
		if (f_433_ >= (float) (((JavaToolkit) aClass_ha__5089)
				       .anInt4643)) {
		    if (argument_387_ > 0)
			f_433_ = (float) argument_387_;
		    anIntArray5084[anLocalInt_427_]
			= anLocalInt + (int) (f_431_ * (float) anLocalInt_400_
					      / f_433_);
		    anIntArray5078[anLocalInt_427_]
			= anLocalInt_399_ + (int) (f_432_
						   * (float) anLocalInt_401_
						   / f_433_);
		} else
		    anIntArray5084[anLocalInt_427_] = -999999;
	    }
	    for (int anLocalInt_434_ = 0; anLocalInt_434_ < anInt5070;
		 anLocalInt_434_++) {
		if (anIntArray5084[aShortArray5095[anLocalInt_434_]] != -999999
		    && (anIntArray5084[aShortArray5112[anLocalInt_434_]]
			!= -999999)
		    && (anIntArray5084[aShortArray5110[anLocalInt_434_]]
			!= -999999)
		    && (method2694
			(argument_382_, argument_383_,
			 anIntArray5078[aShortArray5095[anLocalInt_434_]],
			 anIntArray5078[aShortArray5112[anLocalInt_434_]],
			 anIntArray5078[aShortArray5110[anLocalInt_434_]],
			 anIntArray5084[aShortArray5095[anLocalInt_434_]],
			 anIntArray5084[aShortArray5112[anLocalInt_434_]],
			 anIntArray5084[aShortArray5110[anLocalInt_434_]])))
		    return true;
	    }
	}
	return false;
    }
    
    final tia_sub_35DoublyLinked ba(tia_sub_35DoublyLinked argument_435_) {
	return null;
    }
    
    private final void method2675(int argument_436_, boolean argument_437_,
				  boolean argument_438_) {
	if (anIntArray5126[argument_436_] != -2) {
	    short anLocalInt = aShortArray5095[argument_436_];
	    short anLocalInt_439_ = aShortArray5112[argument_436_];
	    short anLocalInt_440_ = aShortArray5110[argument_436_];
	    int anLocalInt_441_ = anIntArray5084[anLocalInt];
	    int anLocalInt_442_ = anIntArray5084[anLocalInt_439_];
	    int anLocalInt_443_ = anIntArray5084[anLocalInt_440_];
	    if (argument_437_
		&& (anLocalInt_441_ == -5000 || anLocalInt_442_ == -5000
		    || anLocalInt_443_ == -5000)) {
		int anLocalInt_444_ = anIntArray5109[anLocalInt];
		int anLocalInt_445_ = anIntArray5109[anLocalInt_439_];
		int anLocalInt_446_ = anIntArray5109[anLocalInt_440_];
		int anLocalInt_447_ = anIntArray5111[anLocalInt];
		int anLocalInt_448_ = anIntArray5111[anLocalInt_439_];
		int anLocalInt_449_ = anIntArray5111[anLocalInt_440_];
		int anLocalInt_450_ = anIntArray5088[anLocalInt];
		int anLocalInt_451_ = anIntArray5088[anLocalInt_439_];
		int anLocalInt_452_ = anIntArray5088[anLocalInt_440_];
		anLocalInt_444_ -= anLocalInt_445_;
		anLocalInt_446_ -= anLocalInt_445_;
		anLocalInt_447_ -= anLocalInt_448_;
		anLocalInt_449_ -= anLocalInt_448_;
		anLocalInt_450_ -= anLocalInt_451_;
		anLocalInt_452_ -= anLocalInt_451_;
		int anLocalInt_453_ = (anLocalInt_447_ * anLocalInt_452_
				       - anLocalInt_450_ * anLocalInt_449_);
		int anLocalInt_454_ = (anLocalInt_450_ * anLocalInt_446_
				       - anLocalInt_444_ * anLocalInt_452_);
		int anLocalInt_455_ = (anLocalInt_444_ * anLocalInt_449_
				       - anLocalInt_447_ * anLocalInt_446_);
		if ((anLocalInt_445_ * anLocalInt_453_
		     + anLocalInt_448_ * anLocalInt_454_
		     + anLocalInt_451_ * anLocalInt_455_)
		    > 0)
		    method2662(argument_436_);
	    } else if (anIntArray5096[argument_436_] != -1
		       || (((anLocalInt_441_ - anLocalInt_442_)
			    * (anIntArray5078[anLocalInt_440_]
			       - anIntArray5078[anLocalInt_439_]))
			   - ((anIntArray5078[anLocalInt]
			       - anIntArray5078[anLocalInt_439_])
			      * (anLocalInt_443_ - anLocalInt_442_))) > 0) {
		if (anLocalInt_441_ < 0 || anLocalInt_442_ < 0
		    || anLocalInt_443_ < 0
		    || anLocalInt_441_ > ((Class293) aClass293_5118).anInt2422
		    || anLocalInt_442_ > ((Class293) aClass293_5118).anInt2422
		    || anLocalInt_443_ > ((Class293) aClass293_5118).anInt2422)
		    ((Class89) aClass89_5134).aBoolean661 = true;
		else
		    ((Class89) aClass89_5134).aBoolean661 = false;
		if (argument_438_) {
		    int anLocalInt_456_ = anIntArray5096[argument_436_];
		    if (anLocalInt_456_ == -1
			|| !(((Class35) aClass35Array5092[anLocalInt_456_])
			     .aBoolean253))
			method2667(argument_436_);
		} else {
		    int anLocalInt_457_ = anIntArray5096[argument_436_];
		    if (anLocalInt_457_ != -1) {
			Class35 class35 = aClass35Array5092[anLocalInt_457_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_457_];
			if (!((Class35) class35).aBoolean253)
			    method2690(argument_436_);
			aClass_ha__5089.method2114
			    (((Class205) class205).anInt1466,
			     ((Class205) class205).anInt1460,
			     ((Class205) class205).anInt1475,
			     ((Class205) class205).anInt1468,
			     ((Class205) class205).anInt1464,
			     ((Class205) class205).anInt1469,
			     ((Class35) class35).aShort259 & 0xffff,
			     ((Class205) class205).anInt1459,
			     ((Class35) class35).aByte255,
			     ((Class35) class35).aByte254);
		    } else
			method2690(argument_436_);
		}
	    }
	}
    }
    
    final void method2654() {
	if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
	    synchronized (this) {
		((Class167) this).aBoolean1220 = false;
		this.notifyAll();
	    }
	}
    }
    
    private final void method2676(Thread argument_458_) {
	Class293 class293 = aClass_ha__5089.method2112(argument_458_);
	aClass89_5134 = ((Class293) class293).aClass89_2448;
	if (class293 != aClass293_5118) {
	    aClass293_5118 = class293;
	    anIntArray5085 = ((Class293) aClass293_5118).anIntArray2420;
	    anIntArray5109 = ((Class293) aClass293_5118).anIntArray2433;
	    anIntArray5111 = ((Class293) aClass293_5118).anIntArray2440;
	    anIntArray5088 = ((Class293) aClass293_5118).anIntArray2424;
	    anIntArray5084 = ((Class293) aClass293_5118).anIntArray2425;
	    anIntArray5078 = ((Class293) aClass293_5118).anIntArray2447;
	    anIntArray5144 = ((Class293) aClass293_5118).anIntArray2435;
	    anIntArray5091 = ((Class293) aClass293_5118).anIntArray2421;
	    anIntArray5101 = ((Class293) aClass293_5118).anIntArray2418;
	    anIntArray5119 = ((Class293) aClass293_5118).anIntArray2442;
	    anIntArray5077 = ((Class293) aClass293_5118).anIntArray2430;
	    anIntArray5137 = ((Class293) aClass293_5118).anIntArray2438;
	    anIntArray5113 = ((Class293) aClass293_5118).anIntArray2441;
	    anIntArray5056 = ((Class293) aClass293_5118).anIntArray2439;
	    anIntArray5143 = ((Class293) aClass293_5118).anIntArray2445;
	    anIntArray5061 = ((Class293) aClass293_5118).anIntArray2449;
	    anIntArray5096 = ((Class293) aClass293_5118).anIntArray2416;
	}
    }
    
    final void p(int argument_459_, int argument_460_, Class_s argument_461_,
		 Class_s argument_462_, int argument_463_, int argument_464_,
		 int argument_465_) {
	if (argument_459_ == 3) {
	    if ((anInt5140 & 0x7) != 7)
		throw new IllegalStateException();
	} else if ((anInt5140 & 0x2) != 2)
	    throw new IllegalStateException();
	if (!aBoolean5064)
	    method2693();
	int anLocalInt = argument_463_ + aShort5108;
	int anLocalInt_466_ = argument_463_ + aShort5090;
	int anLocalInt_467_ = argument_465_ + aShort5133;
	int anLocalInt_468_ = argument_465_ + aShort5080;
	if (argument_459_ == 4
	    || (anLocalInt >= 0
		&& ((anLocalInt_466_ + ((Class_s) argument_461_).anInt2547
		     >> ((Class_s) argument_461_).anInt2548)
		    < ((Class_s) argument_461_).anInt2550)
		&& anLocalInt_467_ >= 0
		&& ((anLocalInt_468_ + ((Class_s) argument_461_).anInt2547
		     >> ((Class_s) argument_461_).anInt2548)
		    < ((Class_s) argument_461_).anInt2549))) {
	    int[][] anLocalInts
		= ((Class_s) (Class_s_Sub3) argument_461_).anIntArrayArray2546;
	    int[][] anLocalInts_469_ = null;
	    if (argument_462_ != null)
		anLocalInts_469_ = (((Class_s) (Class_s_Sub3) argument_462_)
				    .anIntArrayArray2546);
	    if (argument_459_ == 4 || argument_459_ == 5) {
		if (argument_462_ == null
		    || (anLocalInt < 0
			|| (((anLocalInt_466_
			      + ((Class_s) argument_462_).anInt2547)
			     >> ((Class_s) argument_462_).anInt2548)
			    >= ((Class_s) argument_462_).anInt2550)
			|| anLocalInt_467_ < 0
			|| (((anLocalInt_468_
			      + ((Class_s) argument_462_).anInt2547)
			     >> ((Class_s) argument_462_).anInt2548)
			    >= ((Class_s) argument_462_).anInt2549)))
		    return;
	    } else {
		anLocalInt >>= ((Class_s) argument_461_).anInt2548;
		anLocalInt_466_
		    = (anLocalInt_466_ + (((Class_s) argument_461_).anInt2547
					  - 1)
		       >> ((Class_s) argument_461_).anInt2548);
		anLocalInt_467_ >>= ((Class_s) argument_461_).anInt2548;
		anLocalInt_468_
		    = (anLocalInt_468_ + (((Class_s) argument_461_).anInt2547
					  - 1)
		       >> ((Class_s) argument_461_).anInt2548);
		if (anLocalInts[anLocalInt][anLocalInt_467_] == argument_464_
		    && (anLocalInts[anLocalInt_466_][anLocalInt_467_]
			== argument_464_)
		    && (anLocalInts[anLocalInt][anLocalInt_468_]
			== argument_464_)
		    && (anLocalInts[anLocalInt_466_][anLocalInt_468_]
			== argument_464_))
		    return;
	    }
	    synchronized (this) {
		if (argument_459_ == 1) {
		    int anLocalInt_470_
			= ((Class_s) argument_461_).anInt2547 - 1;
		    for (int anLocalInt_471_ = 0; anLocalInt_471_ < anInt5142;
			 anLocalInt_471_++) {
			int anLocalInt_472_
			    = anIntArray5124[anLocalInt_471_] + argument_463_;
			int anLocalInt_473_
			    = anIntArray5075[anLocalInt_471_] + argument_465_;
			int anLocalInt_474_
			    = anLocalInt_472_ & anLocalInt_470_;
			int anLocalInt_475_
			    = anLocalInt_473_ & anLocalInt_470_;
			int anLocalInt_476_
			    = (anLocalInt_472_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_477_
			    = (anLocalInt_473_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_478_
			    = (((anLocalInts[anLocalInt_476_][anLocalInt_477_]
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_474_))
				+ (anLocalInts[anLocalInt_476_ + 1]
				   [anLocalInt_477_]) * anLocalInt_474_)
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_479_
			    = ((((anLocalInts[anLocalInt_476_]
				  [anLocalInt_477_ + 1])
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_474_))
				+ (anLocalInts[anLocalInt_476_ + 1]
				   [anLocalInt_477_ + 1]) * anLocalInt_474_)
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_480_
			    = (((anLocalInt_478_
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_475_))
				+ anLocalInt_479_ * anLocalInt_475_)
			       >> ((Class_s) argument_461_).anInt2548);
			anIntArray5130[anLocalInt_471_]
			    = (anIntArray5130[anLocalInt_471_]
			       + anLocalInt_480_ - argument_464_);
		    }
		    for (int anLocalInt_481_ = anInt5142;
			 anLocalInt_481_ < anInt5136; anLocalInt_481_++) {
			int anLocalInt_482_
			    = anIntArray5124[anLocalInt_481_] + argument_463_;
			int anLocalInt_483_
			    = anIntArray5075[anLocalInt_481_] + argument_465_;
			int anLocalInt_484_
			    = anLocalInt_482_ & anLocalInt_470_;
			int anLocalInt_485_
			    = anLocalInt_483_ & anLocalInt_470_;
			int anLocalInt_486_
			    = (anLocalInt_482_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_487_
			    = (anLocalInt_483_
			       >> ((Class_s) argument_461_).anInt2548);
			if (anLocalInt_486_ >= 0
			    && anLocalInt_486_ < anLocalInts.length - 1
			    && anLocalInt_487_ >= 0
			    && anLocalInt_487_ < anLocalInts[0].length - 1) {
			    int anLocalInt_488_
				= ((((anLocalInts[anLocalInt_486_]
				      [anLocalInt_487_])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_484_))
				    + (anLocalInts[anLocalInt_486_ + 1]
				       [anLocalInt_487_]) * anLocalInt_484_)
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_489_
				= ((((anLocalInts[anLocalInt_486_]
				      [anLocalInt_487_ + 1])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_484_))
				    + ((anLocalInts[anLocalInt_486_ + 1]
					[anLocalInt_487_ + 1])
				       * anLocalInt_484_))
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_490_
				= (((anLocalInt_488_
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_485_))
				    + anLocalInt_489_ * anLocalInt_485_)
				   >> ((Class_s) argument_461_).anInt2548);
			    anIntArray5130[anLocalInt_481_]
				= (anIntArray5130[anLocalInt_481_]
				   + anLocalInt_490_ - argument_464_);
			}
		    }
		} else if (argument_459_ == 2) {
		    int anLocalInt_491_
			= ((Class_s) argument_461_).anInt2547 - 1;
		    for (int anLocalInt_492_ = 0; anLocalInt_492_ < anInt5142;
			 anLocalInt_492_++) {
			int anLocalInt_493_
			    = ((anIntArray5130[anLocalInt_492_] << 16)
			       / aShort5127);
			if (anLocalInt_493_ < argument_460_) {
			    int anLocalInt_494_
				= (anIntArray5124[anLocalInt_492_]
				   + argument_463_);
			    int anLocalInt_495_
				= (anIntArray5075[anLocalInt_492_]
				   + argument_465_);
			    int anLocalInt_496_
				= anLocalInt_494_ & anLocalInt_491_;
			    int anLocalInt_497_
				= anLocalInt_495_ & anLocalInt_491_;
			    int anLocalInt_498_
				= (anLocalInt_494_
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_499_
				= (anLocalInt_495_
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_500_
				= ((((anLocalInts[anLocalInt_498_]
				      [anLocalInt_499_])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_496_))
				    + (anLocalInts[anLocalInt_498_ + 1]
				       [anLocalInt_499_]) * anLocalInt_496_)
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_501_
				= ((((anLocalInts[anLocalInt_498_]
				      [anLocalInt_499_ + 1])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_496_))
				    + ((anLocalInts[anLocalInt_498_ + 1]
					[anLocalInt_499_ + 1])
				       * anLocalInt_496_))
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_502_
				= (((anLocalInt_500_
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_497_))
				    + anLocalInt_501_ * anLocalInt_497_)
				   >> ((Class_s) argument_461_).anInt2548);
			    anIntArray5130[anLocalInt_492_]
				= (anIntArray5130[anLocalInt_492_]
				   + ((anLocalInt_502_ - argument_464_)
				      * (argument_460_ - anLocalInt_493_)
				      / argument_460_));
			} else
			    anIntArray5130[anLocalInt_492_]
				= anIntArray5130[anLocalInt_492_];
		    }
		    for (int anLocalInt_503_ = anInt5142;
			 anLocalInt_503_ < anInt5136; anLocalInt_503_++) {
			int anLocalInt_504_
			    = ((anIntArray5130[anLocalInt_503_] << 16)
			       / aShort5127);
			if (anLocalInt_504_ < argument_460_) {
			    int anLocalInt_505_
				= (anIntArray5124[anLocalInt_503_]
				   + argument_463_);
			    int anLocalInt_506_
				= (anIntArray5075[anLocalInt_503_]
				   + argument_465_);
			    int anLocalInt_507_
				= anLocalInt_505_ & anLocalInt_491_;
			    int anLocalInt_508_
				= anLocalInt_506_ & anLocalInt_491_;
			    int anLocalInt_509_
				= (anLocalInt_505_
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_510_
				= (anLocalInt_506_
				   >> ((Class_s) argument_461_).anInt2548);
			    if (anLocalInt_509_ >= 0
				&& (anLocalInt_509_
				    < ((Class_s) argument_461_).anInt2550 - 1)
				&& anLocalInt_510_ >= 0
				&& anLocalInt_510_ < (((Class_s) argument_461_)
						      .anInt2549) - 1) {
				int anLocalInt_511_
				    = ((((anLocalInts[anLocalInt_509_]
					  [anLocalInt_510_])
					 * (((Class_s) argument_461_).anInt2547
					    - anLocalInt_507_))
					+ ((anLocalInts[anLocalInt_509_ + 1]
					    [anLocalInt_510_])
					   * anLocalInt_507_))
				       >> ((Class_s) argument_461_).anInt2548);
				int anLocalInt_512_
				    = ((((anLocalInts[anLocalInt_509_]
					  [anLocalInt_510_ + 1])
					 * (((Class_s) argument_461_).anInt2547
					    - anLocalInt_507_))
					+ ((anLocalInts[anLocalInt_509_ + 1]
					    [anLocalInt_510_ + 1])
					   * anLocalInt_507_))
				       >> ((Class_s) argument_461_).anInt2548);
				int anLocalInt_513_
				    = (((anLocalInt_511_
					 * (((Class_s) argument_461_).anInt2547
					    - anLocalInt_508_))
					+ anLocalInt_512_ * anLocalInt_508_)
				       >> ((Class_s) argument_461_).anInt2548);
				anIntArray5130[anLocalInt_503_]
				    = (anIntArray5130[anLocalInt_503_]
				       + ((anLocalInt_513_ - argument_464_)
					  * (argument_460_ - anLocalInt_504_)
					  / argument_460_));
			    }
			} else
			    anIntArray5130[anLocalInt_503_]
				= anIntArray5130[anLocalInt_503_];
		    }
		} else if (argument_459_ == 3) {
		    int anLocalInt_514_ = (argument_460_ & 0xff) * 4;
		    int anLocalInt_515_ = (argument_460_ >> 8 & 0xff) * 4;
		    int anLocalInt_516_ = (argument_460_ >> 16 & 0xff) << 6;
		    int anLocalInt_517_ = (argument_460_ >> 24 & 0xff) << 6;
		    if (argument_463_ - (anLocalInt_514_ >> 1) < 0
			|| ((argument_463_ + (anLocalInt_514_ >> 1)
			     + ((Class_s) argument_461_).anInt2547)
			    >= (((Class_s) argument_461_).anInt2550
				<< ((Class_s) argument_461_).anInt2548))
			|| argument_465_ - (anLocalInt_515_ >> 1) < 0
			|| ((argument_465_ + (anLocalInt_515_ >> 1)
			     + ((Class_s) argument_461_).anInt2547)
			    >= (((Class_s) argument_461_).anInt2549
				<< ((Class_s) argument_461_).anInt2548)))
			return;
		    this.method2642(argument_464_, argument_461_, -100,
				    anLocalInt_516_, anLocalInt_517_,
				    anLocalInt_514_, anLocalInt_515_,
				    argument_463_, argument_465_);
		} else if (argument_459_ == 4) {
		    int anLocalInt_518_
			= ((Class_s) argument_462_).anInt2547 - 1;
		    int anLocalInt_519_ = aShort5123 - aShort5127;
		    for (int anLocalInt_520_ = 0; anLocalInt_520_ < anInt5142;
			 anLocalInt_520_++) {
			int anLocalInt_521_
			    = anIntArray5124[anLocalInt_520_] + argument_463_;
			int anLocalInt_522_
			    = anIntArray5075[anLocalInt_520_] + argument_465_;
			int anLocalInt_523_
			    = anLocalInt_521_ & anLocalInt_518_;
			int anLocalInt_524_
			    = anLocalInt_522_ & anLocalInt_518_;
			int anLocalInt_525_
			    = (anLocalInt_521_
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_526_
			    = (anLocalInt_522_
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_527_
			    = ((((anLocalInts_469_[anLocalInt_525_]
				  [anLocalInt_526_])
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_523_))
				+ (anLocalInts_469_[anLocalInt_525_ + 1]
				   [anLocalInt_526_]) * anLocalInt_523_)
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_528_
			    = ((((anLocalInts_469_[anLocalInt_525_]
				  [anLocalInt_526_ + 1])
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_523_))
				+ (anLocalInts_469_[anLocalInt_525_ + 1]
				   [anLocalInt_526_ + 1]) * anLocalInt_523_)
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_529_
			    = (((anLocalInt_527_
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_524_))
				+ anLocalInt_528_ * anLocalInt_524_)
			       >> ((Class_s) argument_462_).anInt2548);
			anIntArray5130[anLocalInt_520_]
			    = (anIntArray5130[anLocalInt_520_]
			       + (anLocalInt_529_ - argument_464_)
			       + anLocalInt_519_);
		    }
		    for (int anLocalInt_530_ = anInt5142;
			 anLocalInt_530_ < anInt5136; anLocalInt_530_++) {
			int anLocalInt_531_
			    = anIntArray5124[anLocalInt_530_] + argument_463_;
			int anLocalInt_532_
			    = anIntArray5075[anLocalInt_530_] + argument_465_;
			int anLocalInt_533_
			    = anLocalInt_531_ & anLocalInt_518_;
			int anLocalInt_534_
			    = anLocalInt_532_ & anLocalInt_518_;
			int anLocalInt_535_
			    = (anLocalInt_531_
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_536_
			    = (anLocalInt_532_
			       >> ((Class_s) argument_462_).anInt2548);
			if (anLocalInt_535_ >= 0
			    && (anLocalInt_535_
				< ((Class_s) argument_462_).anInt2550 - 1)
			    && anLocalInt_536_ >= 0
			    && (anLocalInt_536_
				< ((Class_s) argument_462_).anInt2549 - 1)) {
			    int anLocalInt_537_
				= ((((anLocalInts_469_[anLocalInt_535_]
				      [anLocalInt_536_])
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_533_))
				    + (anLocalInts_469_[anLocalInt_535_ + 1]
				       [anLocalInt_536_]) * anLocalInt_533_)
				   >> ((Class_s) argument_462_).anInt2548);
			    int anLocalInt_538_
				= ((((anLocalInts_469_[anLocalInt_535_]
				      [anLocalInt_536_ + 1])
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_533_))
				    + ((anLocalInts_469_[anLocalInt_535_ + 1]
					[anLocalInt_536_ + 1])
				       * anLocalInt_533_))
				   >> ((Class_s) argument_462_).anInt2548);
			    int anLocalInt_539_
				= (((anLocalInt_537_
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_534_))
				    + anLocalInt_538_ * anLocalInt_534_)
				   >> ((Class_s) argument_462_).anInt2548);
			    anIntArray5130[anLocalInt_530_]
				= (anIntArray5130[anLocalInt_530_]
				   + (anLocalInt_539_ - argument_464_)
				   + anLocalInt_519_);
			}
		    }
		} else if (argument_459_ == 5) {
		    int anLocalInt_540_
			= ((Class_s) argument_462_).anInt2547 - 1;
		    int anLocalInt_541_ = aShort5123 - aShort5127;
		    for (int anLocalInt_542_ = 0; anLocalInt_542_ < anInt5142;
			 anLocalInt_542_++) {
			int anLocalInt_543_
			    = anIntArray5124[anLocalInt_542_] + argument_463_;
			int anLocalInt_544_
			    = anIntArray5075[anLocalInt_542_] + argument_465_;
			int anLocalInt_545_
			    = anLocalInt_543_ & anLocalInt_540_;
			int anLocalInt_546_
			    = anLocalInt_544_ & anLocalInt_540_;
			int anLocalInt_547_
			    = (anLocalInt_543_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_548_
			    = (anLocalInt_544_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_549_
			    = (((anLocalInts[anLocalInt_547_][anLocalInt_548_]
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_545_))
				+ (anLocalInts[anLocalInt_547_ + 1]
				   [anLocalInt_548_]) * anLocalInt_545_)
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_550_
			    = ((((anLocalInts[anLocalInt_547_]
				  [anLocalInt_548_ + 1])
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_545_))
				+ (anLocalInts[anLocalInt_547_ + 1]
				   [anLocalInt_548_ + 1]) * anLocalInt_545_)
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_551_
			    = (((anLocalInt_549_
				 * (((Class_s) argument_461_).anInt2547
				    - anLocalInt_546_))
				+ anLocalInt_550_ * anLocalInt_546_)
			       >> ((Class_s) argument_461_).anInt2548);
			anLocalInt_549_
			    = ((((anLocalInts_469_[anLocalInt_547_]
				  [anLocalInt_548_])
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_545_))
				+ (anLocalInts_469_[anLocalInt_547_ + 1]
				   [anLocalInt_548_]) * anLocalInt_545_)
			       >> ((Class_s) argument_462_).anInt2548);
			anLocalInt_550_
			    = ((((anLocalInts_469_[anLocalInt_547_]
				  [anLocalInt_548_ + 1])
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_545_))
				+ (anLocalInts_469_[anLocalInt_547_ + 1]
				   [anLocalInt_548_ + 1]) * anLocalInt_545_)
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_552_
			    = (((anLocalInt_549_
				 * (((Class_s) argument_462_).anInt2547
				    - anLocalInt_546_))
				+ anLocalInt_550_ * anLocalInt_546_)
			       >> ((Class_s) argument_462_).anInt2548);
			int anLocalInt_553_
			    = (anLocalInt_551_ - anLocalInt_552_
			       - argument_460_);
			anIntArray5130[anLocalInt_542_]
			    = (((anIntArray5130[anLocalInt_542_] << 8)
				/ anLocalInt_541_ * anLocalInt_553_)
			       >> 8) - (argument_464_ - anLocalInt_551_);
		    }
		    for (int anLocalInt_554_ = anInt5142;
			 anLocalInt_554_ < anInt5136; anLocalInt_554_++) {
			int anLocalInt_555_
			    = anIntArray5124[anLocalInt_554_] + argument_463_;
			int anLocalInt_556_
			    = anIntArray5075[anLocalInt_554_] + argument_465_;
			int anLocalInt_557_
			    = anLocalInt_555_ & anLocalInt_540_;
			int anLocalInt_558_
			    = anLocalInt_556_ & anLocalInt_540_;
			int anLocalInt_559_
			    = (anLocalInt_555_
			       >> ((Class_s) argument_461_).anInt2548);
			int anLocalInt_560_
			    = (anLocalInt_556_
			       >> ((Class_s) argument_461_).anInt2548);
			if (anLocalInt_559_ >= 0
			    && (anLocalInt_559_
				< ((Class_s) argument_461_).anInt2550 - 1)
			    && (anLocalInt_559_
				< ((Class_s) argument_462_).anInt2550 - 1)
			    && anLocalInt_560_ >= 0
			    && (anLocalInt_560_
				< ((Class_s) argument_461_).anInt2549 - 1)
			    && (anLocalInt_560_
				< ((Class_s) argument_462_).anInt2549 - 1)) {
			    int anLocalInt_561_
				= ((((anLocalInts[anLocalInt_559_]
				      [anLocalInt_560_])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_557_))
				    + (anLocalInts[anLocalInt_559_ + 1]
				       [anLocalInt_560_]) * anLocalInt_557_)
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_562_
				= ((((anLocalInts[anLocalInt_559_]
				      [anLocalInt_560_ + 1])
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_557_))
				    + ((anLocalInts[anLocalInt_559_ + 1]
					[anLocalInt_560_ + 1])
				       * anLocalInt_557_))
				   >> ((Class_s) argument_461_).anInt2548);
			    int anLocalInt_563_
				= (((anLocalInt_561_
				     * (((Class_s) argument_461_).anInt2547
					- anLocalInt_558_))
				    + anLocalInt_562_ * anLocalInt_558_)
				   >> ((Class_s) argument_461_).anInt2548);
			    anLocalInt_561_
				= ((((anLocalInts_469_[anLocalInt_559_]
				      [anLocalInt_560_])
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_557_))
				    + (anLocalInts_469_[anLocalInt_559_ + 1]
				       [anLocalInt_560_]) * anLocalInt_557_)
				   >> ((Class_s) argument_462_).anInt2548);
			    anLocalInt_562_
				= ((((anLocalInts_469_[anLocalInt_559_]
				      [anLocalInt_560_ + 1])
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_557_))
				    + ((anLocalInts_469_[anLocalInt_559_ + 1]
					[anLocalInt_560_ + 1])
				       * anLocalInt_557_))
				   >> ((Class_s) argument_462_).anInt2548);
			    int anLocalInt_564_
				= (((anLocalInt_561_
				     * (((Class_s) argument_462_).anInt2547
					- anLocalInt_558_))
				    + anLocalInt_562_ * anLocalInt_558_)
				   >> ((Class_s) argument_462_).anInt2548);
			    int anLocalInt_565_
				= (anLocalInt_563_ - anLocalInt_564_
				   - argument_460_);
			    anIntArray5130[anLocalInt_554_]
				= (((anIntArray5130[anLocalInt_554_] << 8)
				    / anLocalInt_541_ * anLocalInt_565_)
				   >> 8) - (argument_464_ - anLocalInt_563_);
			}
		    }
		}
		aBoolean5064 = false;
	    }
	}
    }
    
    private final int method2677(int argument_566_) {
	if (argument_566_ < 2)
	    argument_566_ = 2;
	else if (argument_566_ > 126)
	    argument_566_ = 126;
	return argument_566_;
    }
    
    final void v() {
	if ((anInt5140 & 0x10) != 16)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++)
		anIntArray5075[anLocalInt] = -anIntArray5075[anLocalInt];
	    if (aClass56Array5138 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5142;
		     anLocalInt++) {
		    if (aClass56Array5138[anLocalInt] != null)
			((Class56) aClass56Array5138[anLocalInt]).anInt410
			    = -(((Class56) aClass56Array5138[anLocalInt])
				.anInt410);
		}
	    }
	    if (aClass56Array5076 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5142;
		     anLocalInt++) {
		    if (aClass56Array5076[anLocalInt] != null)
			((Class56) aClass56Array5076[anLocalInt]).anInt410
			    = -(((Class56) aClass56Array5076[anLocalInt])
				.anInt410);
		}
	    }
	    if (aClass312Array5082 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (aClass312Array5082[anLocalInt] != null)
			((Class312) aClass312Array5082[anLocalInt]).anInt2593
			    = -(((Class312) aClass312Array5082[anLocalInt])
				.anInt2593);
		}
	    }
	    short[] anLocalInts = aShortArray5095;
	    aShortArray5095 = aShortArray5110;
	    aShortArray5110 = anLocalInts;
	    if (aFloatArrayArray5098 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (aFloatArrayArray5098[anLocalInt] != null) {
			float f = aFloatArrayArray5098[anLocalInt][0];
			aFloatArrayArray5098[anLocalInt][0]
			    = aFloatArrayArray5098[anLocalInt][2];
			aFloatArrayArray5098[anLocalInt][2] = f;
		    }
		    if (aFloatArrayArray5071[anLocalInt] != null) {
			float f = aFloatArrayArray5071[anLocalInt][0];
			aFloatArrayArray5071[anLocalInt][0]
			    = aFloatArrayArray5071[anLocalInt][2];
			aFloatArrayArray5071[anLocalInt][2] = f;
		    }
		}
	    }
	    aBoolean5064 = false;
	    anInt5065 = 0;
	}
    }
    
    private final boolean method2678(int argument_567_) {
	if (anIntArray5096 == null)
	    return false;
	if (anIntArray5096[argument_567_] == -1)
	    return false;
	return true;
    }
    
    private final void method2679(Thread argument_568_) {
	Class293 class293 = aClass_ha__5089.method2112(argument_568_);
	if (class293 != aClass293_5106) {
	    aClass293_5106 = class293;
	    aClass167_Sub1_5099
		= ((Class293) aClass293_5106).aClass167_Sub1_2423;
	    aClass167_Sub1_5122
		= ((Class293) aClass293_5106).aClass167_Sub1_2450;
	    aClass167_Sub1_5087
		= ((Class293) aClass293_5106).aClass167_Sub1_2429;
	    aClass167_Sub1_5120
		= ((Class293) aClass293_5106).aClass167_Sub1_2427;
	    aClass167_Sub1_5135
		= ((Class293) aClass293_5106).aClass167_Sub1_2451;
	    aClass167_Sub1_5074
		= ((Class293) aClass293_5106).aClass167_Sub1_2419;
	    aClass167_Sub1_5068
		= ((Class293) aClass293_5106).aClass167_Sub1_2428;
	    aClass167_Sub1_5100
		= ((Class293) aClass293_5106).aClass167_Sub1_2443;
	    aClass167_Sub1_5063
		= ((Class293) aClass293_5106).aClass167_Sub1_2446;
	    aClass167_Sub1_5129
		= ((Class293) aClass293_5106).aClass167_Sub1_2431;
	}
    }
    
    private final void method2680() {
	if (anInt5065 == 0)
	    method2666(false);
	else if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
	    synchronized (this) {
		method2681();
	    }
	} else
	    method2681();
    }
    
    final void method2643(Class350 argument_569_, int argument_570_,
			  boolean argument_571_) {
	if (aShortArray5072 != null) {
	    int[] anLocalInts = new int[3];
	    for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++) {
		if ((argument_570_ & aShortArray5072[anLocalInt]) != 0) {
		    if (argument_571_)
			argument_569_.method3831(anIntArray5124[anLocalInt],
						 anIntArray5130[anLocalInt],
						 anIntArray5075[anLocalInt],
						 anLocalInts);
		    else
			argument_569_.method3829(anIntArray5124[anLocalInt],
						 anIntArray5130[anLocalInt],
						 anIntArray5075[anLocalInt],
						 anLocalInts);
		    anIntArray5124[anLocalInt] = anLocalInts[0];
		    anIntArray5130[anLocalInt] = anLocalInts[1];
		    anIntArray5075[anLocalInt] = anLocalInts[2];
		}
	    }
	}
    }
    
    final void k(int argument_572_) {
	if ((anInt5140 & 0xd) != 13)
	    throw new IllegalStateException();
	if (aClass56Array5138 != null) {
	    if (argument_572_ == 4096)
		method2688();
	    else if (argument_572_ == 8192)
		method2673();
	    else if (argument_572_ == 12288)
		method2669();
	    else {
		int anLocalInt = Node_Sub6.SINETABLE[argument_572_];
		int anLocalInt_573_
		    = Node_Sub6.COSINETABLE[argument_572_];
		synchronized (this) {
		    for (int anLocalInt_574_ = 0; anLocalInt_574_ < anInt5142;
			 anLocalInt_574_++) {
			int anLocalInt_575_
			    = ((anIntArray5075[anLocalInt_574_] * anLocalInt
				+ (anIntArray5124[anLocalInt_574_]
				   * anLocalInt_573_))
			       >> 14);
			anIntArray5075[anLocalInt_574_]
			    = (((anIntArray5075[anLocalInt_574_]
				 * anLocalInt_573_)
				- anIntArray5124[anLocalInt_574_] * anLocalInt)
			       >> 14);
			anIntArray5124[anLocalInt_574_] = anLocalInt_575_;
			if (aClass56Array5138[anLocalInt_574_] != null) {
			    anLocalInt_575_
				= ((((Class56) (aClass56Array5138
						[anLocalInt_574_])).anInt410
				    * anLocalInt)
				   + (((Class56) (aClass56Array5138
						  [anLocalInt_574_])).anInt411
				      * anLocalInt_573_)) >> 14;
			    ((Class56) aClass56Array5138[anLocalInt_574_])
				.anInt410
				= ((((Class56) (aClass56Array5138
						[anLocalInt_574_])).anInt410
				    * anLocalInt_573_)
				   - (((Class56) (aClass56Array5138
						  [anLocalInt_574_])).anInt411
				      * anLocalInt)) >> 14;
			    ((Class56) aClass56Array5138[anLocalInt_574_])
				.anInt411
				= anLocalInt_575_;
			}
		    }
		    if (aClass312Array5082 != null) {
			for (int anLocalInt_576_ = 0;
			     anLocalInt_576_ < anInt5070; anLocalInt_576_++) {
			    if (aClass312Array5082[anLocalInt_576_] != null) {
				int anLocalInt_577_
				    = (((((Class312)
					  aClass312Array5082[anLocalInt_576_])
					 .anInt2593) * anLocalInt
					+ (((Class312) (aClass312Array5082
							[anLocalInt_576_]))
					   .anInt2595) * anLocalInt_573_)
				       >> 14);
				((Class312)
				 aClass312Array5082[anLocalInt_576_]).anInt2593
				    = ((((Class312)
					 aClass312Array5082[anLocalInt_576_])
					.anInt2593) * anLocalInt_573_
				       - (((Class312)
					   aClass312Array5082[anLocalInt_576_])
					  .anInt2595) * anLocalInt) >> 14;
				((Class312)
				 aClass312Array5082[anLocalInt_576_]).anInt2595
				    = anLocalInt_577_;
			    }
			}
		    }
		    for (int anLocalInt_578_ = anInt5142;
			 anLocalInt_578_ < anInt5136; anLocalInt_578_++) {
			int anLocalInt_579_
			    = ((anIntArray5075[anLocalInt_578_] * anLocalInt
				+ (anIntArray5124[anLocalInt_578_]
				   * anLocalInt_573_))
			       >> 14);
			anIntArray5075[anLocalInt_578_]
			    = (((anIntArray5075[anLocalInt_578_]
				 * anLocalInt_573_)
				- anIntArray5124[anLocalInt_578_] * anLocalInt)
			       >> 14);
			anIntArray5124[anLocalInt_578_] = anLocalInt_579_;
		    }
		    anInt5065 = 0;
		    aBoolean5064 = false;
		}
	    }
	} else
	    a(argument_572_);
    }
    
    final void method2659(int argument_580_, int[] argument_581_,
			  int argument_582_, int argument_583_,
			  int argument_584_, int argument_585_,
			  boolean argument_586_) {
	int anLocalInt = argument_581_.length;
	if (argument_580_ == 0) {
	    argument_582_ <<= 4;
	    argument_583_ <<= 4;
	    argument_584_ <<= 4;
	    if (!aBoolean5083) {
		for (int anLocalInt_587_ = 0; anLocalInt_587_ < anInt5136;
		     anLocalInt_587_++) {
		    anIntArray5124[anLocalInt_587_] <<= 4;
		    anIntArray5130[anLocalInt_587_] <<= 4;
		    anIntArray5075[anLocalInt_587_] <<= 4;
		}
		aBoolean5083 = true;
	    }
	    int anLocalInt_588_ = 0;
	    anInt5073 = 0;
	    anInt5121 = 0;
	    anInt5094 = 0;
	    for (int anLocalInt_589_ = 0; anLocalInt_589_ < anLocalInt;
		 anLocalInt_589_++) {
		int anLocalInt_590_ = argument_581_[anLocalInt_589_];
		if (anLocalInt_590_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_590_];
		    for (int anLocalInt_591_ = 0;
			 anLocalInt_591_ < anLocalInts.length;
			 anLocalInt_591_++) {
			int anLocalInt_592_ = anLocalInts[anLocalInt_591_];
			anInt5073 += anIntArray5124[anLocalInt_592_];
			anInt5121 += anIntArray5130[anLocalInt_592_];
			anInt5094 += anIntArray5075[anLocalInt_592_];
			anLocalInt_588_++;
		    }
		}
	    }
	    if (anLocalInt_588_ > 0) {
		anInt5073 = anInt5073 / anLocalInt_588_ + argument_582_;
		anInt5121 = anInt5121 / anLocalInt_588_ + argument_583_;
		anInt5094 = anInt5094 / anLocalInt_588_ + argument_584_;
	    } else {
		anInt5073 = argument_582_;
		anInt5121 = argument_583_;
		anInt5094 = argument_584_;
	    }
	} else if (argument_580_ == 1) {
	    argument_582_ <<= 4;
	    argument_583_ <<= 4;
	    argument_584_ <<= 4;
	    if (!aBoolean5083) {
		for (int anLocalInt_593_ = 0; anLocalInt_593_ < anInt5136;
		     anLocalInt_593_++) {
		    anIntArray5124[anLocalInt_593_] <<= 4;
		    anIntArray5130[anLocalInt_593_] <<= 4;
		    anIntArray5075[anLocalInt_593_] <<= 4;
		}
		aBoolean5083 = true;
	    }
	    for (int anLocalInt_594_ = 0; anLocalInt_594_ < anLocalInt;
		 anLocalInt_594_++) {
		int anLocalInt_595_ = argument_581_[anLocalInt_594_];
		if (anLocalInt_595_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_595_];
		    for (int anLocalInt_596_ = 0;
			 anLocalInt_596_ < anLocalInts.length;
			 anLocalInt_596_++) {
			int anLocalInt_597_ = anLocalInts[anLocalInt_596_];
			anIntArray5124[anLocalInt_597_] += argument_582_;
			anIntArray5130[anLocalInt_597_] += argument_583_;
			anIntArray5075[anLocalInt_597_] += argument_584_;
		    }
		}
	    }
	} else if (argument_580_ == 2) {
	    for (int anLocalInt_598_ = 0; anLocalInt_598_ < anLocalInt;
		 anLocalInt_598_++) {
		int anLocalInt_599_ = argument_581_[anLocalInt_598_];
		if (anLocalInt_599_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_599_];
		    if ((argument_585_ & 0x1) == 0) {
			for (int anLocalInt_600_ = 0;
			     anLocalInt_600_ < anLocalInts.length;
			     anLocalInt_600_++) {
			    int anLocalInt_601_ = anLocalInts[anLocalInt_600_];
			    anIntArray5124[anLocalInt_601_] -= anInt5073;
			    anIntArray5130[anLocalInt_601_] -= anInt5121;
			    anIntArray5075[anLocalInt_601_] -= anInt5094;
			    if (argument_584_ != 0) {
				int anLocalInt_602_
				    = (Node_Sub6.SINETABLE
				       [argument_584_]);
				int anLocalInt_603_
				    = (Node_Sub6.COSINETABLE
				       [argument_584_]);
				int anLocalInt_604_
				    = (((anIntArray5130[anLocalInt_601_]
					 * anLocalInt_602_)
					+ (anIntArray5124[anLocalInt_601_]
					   * anLocalInt_603_)
					+ 16383)
				       >> 14);
				anIntArray5130[anLocalInt_601_]
				    = ((anIntArray5130[anLocalInt_601_]
					* anLocalInt_603_)
				       - (anIntArray5124[anLocalInt_601_]
					  * anLocalInt_602_)
				       + 16383) >> 14;
				anIntArray5124[anLocalInt_601_]
				    = anLocalInt_604_;
			    }
			    if (argument_582_ != 0) {
				int anLocalInt_605_
				    = (Node_Sub6.SINETABLE
				       [argument_582_]);
				int anLocalInt_606_
				    = (Node_Sub6.COSINETABLE
				       [argument_582_]);
				int anLocalInt_607_
				    = (((anIntArray5130[anLocalInt_601_]
					 * anLocalInt_606_)
					- (anIntArray5075[anLocalInt_601_]
					   * anLocalInt_605_)
					+ 16383)
				       >> 14);
				anIntArray5075[anLocalInt_601_]
				    = ((anIntArray5130[anLocalInt_601_]
					* anLocalInt_605_)
				       + (anIntArray5075[anLocalInt_601_]
					  * anLocalInt_606_)
				       + 16383) >> 14;
				anIntArray5130[anLocalInt_601_]
				    = anLocalInt_607_;
			    }
			    if (argument_583_ != 0) {
				int anLocalInt_608_
				    = (Node_Sub6.SINETABLE
				       [argument_583_]);
				int anLocalInt_609_
				    = (Node_Sub6.COSINETABLE
				       [argument_583_]);
				int anLocalInt_610_
				    = (((anIntArray5075[anLocalInt_601_]
					 * anLocalInt_608_)
					+ (anIntArray5124[anLocalInt_601_]
					   * anLocalInt_609_)
					+ 16383)
				       >> 14);
				anIntArray5075[anLocalInt_601_]
				    = ((anIntArray5075[anLocalInt_601_]
					* anLocalInt_609_)
				       - (anIntArray5124[anLocalInt_601_]
					  * anLocalInt_608_)
				       + 16383) >> 14;
				anIntArray5124[anLocalInt_601_]
				    = anLocalInt_610_;
			    }
			    anIntArray5124[anLocalInt_601_] += anInt5073;
			    anIntArray5130[anLocalInt_601_] += anInt5121;
			    anIntArray5075[anLocalInt_601_] += anInt5094;
			}
		    } else {
			for (int anLocalInt_611_ = 0;
			     anLocalInt_611_ < anLocalInts.length;
			     anLocalInt_611_++) {
			    int anLocalInt_612_ = anLocalInts[anLocalInt_611_];
			    anIntArray5124[anLocalInt_612_] -= anInt5073;
			    anIntArray5130[anLocalInt_612_] -= anInt5121;
			    anIntArray5075[anLocalInt_612_] -= anInt5094;
			    if (argument_582_ != 0) {
				int anLocalInt_613_
				    = (Node_Sub6.SINETABLE
				       [argument_582_]);
				int anLocalInt_614_
				    = (Node_Sub6.COSINETABLE
				       [argument_582_]);
				int anLocalInt_615_
				    = (((anIntArray5130[anLocalInt_612_]
					 * anLocalInt_614_)
					- (anIntArray5075[anLocalInt_612_]
					   * anLocalInt_613_)
					+ 16383)
				       >> 14);
				anIntArray5075[anLocalInt_612_]
				    = ((anIntArray5130[anLocalInt_612_]
					* anLocalInt_613_)
				       + (anIntArray5075[anLocalInt_612_]
					  * anLocalInt_614_)
				       + 16383) >> 14;
				anIntArray5130[anLocalInt_612_]
				    = anLocalInt_615_;
			    }
			    if (argument_584_ != 0) {
				int anLocalInt_616_
				    = (Node_Sub6.SINETABLE
				       [argument_584_]);
				int anLocalInt_617_
				    = (Node_Sub6.COSINETABLE
				       [argument_584_]);
				int anLocalInt_618_
				    = (((anIntArray5130[anLocalInt_612_]
					 * anLocalInt_616_)
					+ (anIntArray5124[anLocalInt_612_]
					   * anLocalInt_617_)
					+ 16383)
				       >> 14);
				anIntArray5130[anLocalInt_612_]
				    = ((anIntArray5130[anLocalInt_612_]
					* anLocalInt_617_)
				       - (anIntArray5124[anLocalInt_612_]
					  * anLocalInt_616_)
				       + 16383) >> 14;
				anIntArray5124[anLocalInt_612_]
				    = anLocalInt_618_;
			    }
			    if (argument_583_ != 0) {
				int anLocalInt_619_
				    = (Node_Sub6.SINETABLE
				       [argument_583_]);
				int anLocalInt_620_
				    = (Node_Sub6.COSINETABLE
				       [argument_583_]);
				int anLocalInt_621_
				    = (((anIntArray5075[anLocalInt_612_]
					 * anLocalInt_619_)
					+ (anIntArray5124[anLocalInt_612_]
					   * anLocalInt_620_)
					+ 16383)
				       >> 14);
				anIntArray5075[anLocalInt_612_]
				    = ((anIntArray5075[anLocalInt_612_]
					* anLocalInt_620_)
				       - (anIntArray5124[anLocalInt_612_]
					  * anLocalInt_619_)
				       + 16383) >> 14;
				anIntArray5124[anLocalInt_612_]
				    = anLocalInt_621_;
			    }
			    anIntArray5124[anLocalInt_612_] += anInt5073;
			    anIntArray5130[anLocalInt_612_] += anInt5121;
			    anIntArray5075[anLocalInt_612_] += anInt5094;
			}
		    }
		}
	    }
	} else if (argument_580_ == 3) {
	    for (int anLocalInt_622_ = 0; anLocalInt_622_ < anLocalInt;
		 anLocalInt_622_++) {
		int anLocalInt_623_ = argument_581_[anLocalInt_622_];
		if (anLocalInt_623_ < anIntArrayArray5086.length) {
		    int[] anLocalInts = anIntArrayArray5086[anLocalInt_623_];
		    for (int anLocalInt_624_ = 0;
			 anLocalInt_624_ < anLocalInts.length;
			 anLocalInt_624_++) {
			int anLocalInt_625_ = anLocalInts[anLocalInt_624_];
			anIntArray5124[anLocalInt_625_] -= anInt5073;
			anIntArray5130[anLocalInt_625_] -= anInt5121;
			anIntArray5075[anLocalInt_625_] -= anInt5094;
			anIntArray5124[anLocalInt_625_]
			    = (anIntArray5124[anLocalInt_625_] * argument_582_
			       / 128);
			anIntArray5130[anLocalInt_625_]
			    = (anIntArray5130[anLocalInt_625_] * argument_583_
			       / 128);
			anIntArray5075[anLocalInt_625_]
			    = (anIntArray5075[anLocalInt_625_] * argument_584_
			       / 128);
			anIntArray5124[anLocalInt_625_] += anInt5073;
			anIntArray5130[anLocalInt_625_] += anInt5121;
			anIntArray5075[anLocalInt_625_] += anInt5094;
		    }
		}
	    }
	} else if (argument_580_ == 5) {
	    if (anIntArrayArray5067 != null && aByteArray5105 != null) {
		for (int anLocalInt_626_ = 0; anLocalInt_626_ < anLocalInt;
		     anLocalInt_626_++) {
		    int anLocalInt_627_ = argument_581_[anLocalInt_626_];
		    if (anLocalInt_627_ < anIntArrayArray5067.length) {
			int[] anLocalInts
			    = anIntArrayArray5067[anLocalInt_627_];
			for (int anLocalInt_628_ = 0;
			     anLocalInt_628_ < anLocalInts.length;
			     anLocalInt_628_++) {
			    int anLocalInt_629_ = anLocalInts[anLocalInt_628_];
			    int anLocalInt_630_
				= ((aByteArray5105[anLocalInt_629_] & 0xff)
				   + argument_582_ * 8);
			    if (anLocalInt_630_ < 0)
				anLocalInt_630_ = 0;
			    else if (anLocalInt_630_ > 255)
				anLocalInt_630_ = 255;
			    aByteArray5105[anLocalInt_629_]
				= (byte) anLocalInt_630_;
			}
		    }
		}
		if (aClass35Array5092 != null) {
		    for (int anLocalInt_631_ = 0; anLocalInt_631_ < anInt5069;
			 anLocalInt_631_++) {
			Class35 class35 = aClass35Array5092[anLocalInt_631_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_631_];
			((Class205) class205).anInt1459
			    = (((Class205) class205).anInt1459 & 0xffffff
			       | 255 - ((aByteArray5105
					 [((Class35) class35).anInt258])
					& 0xff) << 24);
		    }
		}
	    }
	} else if (argument_580_ == 7) {
	    if (anIntArrayArray5067 != null) {
		for (int anLocalInt_632_ = 0; anLocalInt_632_ < anLocalInt;
		     anLocalInt_632_++) {
		    int anLocalInt_633_ = argument_581_[anLocalInt_632_];
		    if (anLocalInt_633_ < anIntArrayArray5067.length) {
			int[] anLocalInts
			    = anIntArrayArray5067[anLocalInt_633_];
			for (int anLocalInt_634_ = 0;
			     anLocalInt_634_ < anLocalInts.length;
			     anLocalInt_634_++) {
			    int anLocalInt_635_ = anLocalInts[anLocalInt_634_];
			    int anLocalInt_636_
				= aShortArray5116[anLocalInt_635_] & 0xffff;
			    int anLocalInt_637_ = anLocalInt_636_ >> 10 & 0x3f;
			    int anLocalInt_638_ = anLocalInt_636_ >> 7 & 0x7;
			    int anLocalInt_639_ = anLocalInt_636_ & 0x7f;
			    anLocalInt_637_
				= anLocalInt_637_ + argument_582_ & 0x3f;
			    anLocalInt_638_ += argument_583_;
			    if (anLocalInt_638_ < 0)
				anLocalInt_638_ = 0;
			    else if (anLocalInt_638_ > 7)
				anLocalInt_638_ = 7;
			    anLocalInt_639_ += argument_584_;
			    if (anLocalInt_639_ < 0)
				anLocalInt_639_ = 0;
			    else if (anLocalInt_639_ > 127)
				anLocalInt_639_ = 127;
			    aShortArray5116[anLocalInt_635_]
				= (short) (anLocalInt_637_ << 10
					   | anLocalInt_638_ << 7
					   | anLocalInt_639_);
			}
			aBoolean5093 = true;
		    }
		}
		if (aClass35Array5092 != null) {
		    for (int anLocalInt_640_ = 0; anLocalInt_640_ < anInt5069;
			 anLocalInt_640_++) {
			Class35 class35 = aClass35Array5092[anLocalInt_640_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_640_];
			((Class205) class205).anInt1459
			    = (((Class205) class205).anInt1459 & ~0xffffff
			       | ((HslToRgb.table2
				   [HslToRgb.method3452(((aShortArray5116[(((Class35) class35).anInt258)]) & 0xffff)) & 0xffff])
				  & 0xffffff));
		    }
		}
	    }
	} else if (argument_580_ == 8) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_641_ = 0; anLocalInt_641_ < anLocalInt;
		     anLocalInt_641_++) {
		    int anLocalInt_642_ = argument_581_[anLocalInt_641_];
		    if (anLocalInt_642_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_642_];
			for (int anLocalInt_643_ = 0;
			     anLocalInt_643_ < anLocalInts.length;
			     anLocalInt_643_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_643_]]);
			    ((Class205) class205).anInt1462 += argument_582_;
			    ((Class205) class205).anInt1461 += argument_583_;
			}
		    }
		}
	    }
	} else if (argument_580_ == 10) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_644_ = 0; anLocalInt_644_ < anLocalInt;
		     anLocalInt_644_++) {
		    int anLocalInt_645_ = argument_581_[anLocalInt_644_];
		    if (anLocalInt_645_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_645_];
			for (int anLocalInt_646_ = 0;
			     anLocalInt_646_ < anLocalInts.length;
			     anLocalInt_646_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_646_]]);
			    ((Class205) class205).anInt1465
				= (((Class205) class205).anInt1465
				   * argument_582_) >> 7;
			    ((Class205) class205).anInt1463
				= (((Class205) class205).anInt1463
				   * argument_583_) >> 7;
			}
		    }
		}
	    }
	} else if (argument_580_ == 9) {
	    if (anIntArrayArray5139 != null) {
		for (int anLocalInt_647_ = 0; anLocalInt_647_ < anLocalInt;
		     anLocalInt_647_++) {
		    int anLocalInt_648_ = argument_581_[anLocalInt_647_];
		    if (anLocalInt_648_ < anIntArrayArray5139.length) {
			int[] anLocalInts
			    = anIntArrayArray5139[anLocalInt_648_];
			for (int anLocalInt_649_ = 0;
			     anLocalInt_649_ < anLocalInts.length;
			     anLocalInt_649_++) {
			    Class205 class205
				= (aClass205Array5066
				   [anLocalInts[anLocalInt_649_]]);
			    ((Class205) class205).anInt1469
				= (((Class205) class205).anInt1469
				   + argument_582_) & 0x3fff;
			}
		    }
		}
	    }
	}
    }
    
    final void ia(short argument_650_, short argument_651_) {
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    if (aShortArray5116[anLocalInt] == argument_650_)
		aShortArray5116[anLocalInt] = argument_651_;
	}
	if (aClass35Array5092 != null) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class35 class35 = aClass35Array5092[anLocalInt];
		Class205 class205 = aClass205Array5066[anLocalInt];
		((Class205) class205).anInt1459
		    = (((Class205) class205).anInt1459 & ~0xffffff
		       | ((HslToRgb.table2
			   [HslToRgb.method3452((aShortArray5116[(((Class35) class35).anInt258)])) & 0xffff])
			  & 0xffffff));
	    }
	}
	if (anInt5065 == 2)
	    anInt5065 = 1;
    }
    
    private final void method2681() {
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    short anLocalInt_652_
		= (aShortArray5104 != null ? aShortArray5104[anLocalInt]
		   : (short) -1);
	    if (anLocalInt_652_ == -1) {
		int anLocalInt_653_ = aShortArray5116[anLocalInt] & 0xffff;
		int anLocalInt_654_
		    = (anLocalInt_653_ & 0x7f) * anInt5081 >> 7;
		short anLocalInt_655_
		    = HslToRgb.method3452((anLocalInt_653_ & ~0x7f | anLocalInt_654_));
		if (anIntArray5126[anLocalInt] == -1) {
		    int anLocalInt_656_
			= anIntArray5058[anLocalInt] & ~0x1ffff;
		    anIntArray5058[anLocalInt]
			= (anLocalInt_656_
			   | Class383.method4111(anLocalInt_656_ >> 17,
						 anLocalInt_655_, (byte) -5));
		} else if (anIntArray5126[anLocalInt] != -2) {
		    int anLocalInt_657_
			= anIntArray5058[anLocalInt] & ~0x1ffff;
		    anIntArray5058[anLocalInt]
			= (anLocalInt_657_
			   | Class383.method4111(anLocalInt_657_ >> 17,
						 anLocalInt_655_, (byte) -86));
		    anLocalInt_657_ = anIntArray5115[anLocalInt] & ~0x1ffff;
		    anIntArray5115[anLocalInt]
			= (anLocalInt_657_
			   | Class383.method4111(anLocalInt_657_ >> 17,
						 anLocalInt_655_, (byte) -27));
		    anLocalInt_657_ = anIntArray5126[anLocalInt] & ~0x1ffff;
		    anIntArray5126[anLocalInt]
			= (anLocalInt_657_
			   | Class383.method4111(anLocalInt_657_ >> 17,
						 anLocalInt_655_,
						 (byte) -103));
		}
	    }
	}
	anInt5065 = 2;
    }
    
    private final int method2682(int argument_658_, int argument_659_) {
	argument_659_ = argument_659_ * (argument_658_ & 0x7f) >> 7;
	if (argument_659_ < 2)
	    argument_659_ = 2;
	else if (argument_659_ > 126)
	    argument_659_ = 126;
	return (argument_658_ & 0xff80) + argument_659_;
    }
    
    private final void method2683(boolean argument_660_, boolean argument_661_,
				  int argument_662_, int argument_663_) {
	if (aClass35Array5092 != null) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class35 class35 = aClass35Array5092[anLocalInt];
		anIntArray5096[((Class35) class35).anInt258] = anLocalInt;
	    }
	}
	if (aBoolean5131 || aClass35Array5092 != null) {
	    if ((anInt5140 & 0x100) == 0 && aShortArray5062 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    short anLocalInt_664_ = aShortArray5062[anLocalInt];
		    method2675(anLocalInt_664_, argument_660_, argument_661_);
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (!method2663(anLocalInt) && !method2678(anLocalInt))
			method2675(anLocalInt, argument_660_, argument_661_);
		}
		if (aByteArray5059 == null) {
		    for (int anLocalInt = 0; anLocalInt < anInt5070;
			 anLocalInt++) {
			if (method2663(anLocalInt) || method2678(anLocalInt))
			    method2675(anLocalInt, argument_660_,
				       argument_661_);
		    }
		} else {
		    for (int anLocalInt = 0; anLocalInt < 12; anLocalInt++) {
			for (int anLocalInt_665_ = 0;
			     anLocalInt_665_ < anInt5070; anLocalInt_665_++) {
			    if (aByteArray5059[anLocalInt_665_] == anLocalInt
				&& (method2663(anLocalInt_665_)
				    || method2678(anLocalInt_665_)))
				method2675(anLocalInt_665_, argument_660_,
					   argument_661_);
			}
		    }
		}
	    }
	} else {
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		method2675(anLocalInt, argument_660_, argument_661_);
	}
    }
    
    final void method2647() {
	if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
	    synchronized (this) {
		while (((Class167) this).aBoolean1220) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
		((Class167) this).aBoolean1220 = true;
	    }
	}
    }
    
    final void a(int argument_666_) {
	if ((anInt5140 & 0x5) != 5)
	    throw new IllegalStateException();
	if (argument_666_ == 4096)
	    method2685();
	else if (argument_666_ == 8192)
	    method2687();
	else if (argument_666_ == 12288)
	    method2670();
	else {
	    int anLocalInt = Node_Sub6.SINETABLE[argument_666_];
	    int anLocalInt_667_ = Node_Sub6.COSINETABLE[argument_666_];
	    synchronized (this) {
		for (int anLocalInt_668_ = 0; anLocalInt_668_ < anInt5136;
		     anLocalInt_668_++) {
		    int anLocalInt_669_
			= ((anIntArray5075[anLocalInt_668_] * anLocalInt
			    + (anIntArray5124[anLocalInt_668_]
			       * anLocalInt_667_))
			   >> 14);
		    anIntArray5075[anLocalInt_668_]
			= ((anIntArray5075[anLocalInt_668_] * anLocalInt_667_
			    - anIntArray5124[anLocalInt_668_] * anLocalInt)
			   >> 14);
		    anIntArray5124[anLocalInt_668_] = anLocalInt_669_;
		}
		method2672();
	    }
	}
    }
    
    final void s(int argument_670_) {
	if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
	    synchronized (this) {
		if ((anInt5140 & 0x10000) == 65536
		    && (argument_670_ & 0x10000) == 0)
		    method2666(true);
		anInt5140 = argument_670_;
	    }
	} else {
	    if ((anInt5140 & 0x10000) == 65536
		&& (argument_670_ & 0x10000) == 0)
		method2666(true);
	    anInt5140 = argument_670_;
	}
    }
    
    final int EA() {
	if (!aBoolean5064)
	    method2693();
	return aShort5123;
    }
    
    private final void method2684(boolean argument_671_, boolean argument_672_,
				  int argument_673_, int argument_674_) {
	if (aClass35Array5092 != null) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class35 class35 = aClass35Array5092[anLocalInt];
		anIntArray5096[((Class35) class35).anInt258] = anLocalInt;
	    }
	}
	if (aBoolean5131 || aClass35Array5092 != null) {
	    if ((anInt5140 & 0x100) == 0 && aShortArray5062 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    short anLocalInt_675_ = aShortArray5062[anLocalInt];
		    method2692(anLocalInt_675_, argument_671_, argument_672_);
		}
	    } else {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (!method2663(anLocalInt) && !method2678(anLocalInt))
			method2692(anLocalInt, argument_671_, argument_672_);
		}
		if (aByteArray5059 == null) {
		    for (int anLocalInt = 0; anLocalInt < anInt5070;
			 anLocalInt++) {
			if (method2663(anLocalInt) || method2678(anLocalInt))
			    method2692(anLocalInt, argument_671_,
				       argument_672_);
		    }
		} else {
		    for (int anLocalInt = 0; anLocalInt < 12; anLocalInt++) {
			for (int anLocalInt_676_ = 0;
			     anLocalInt_676_ < anInt5070; anLocalInt_676_++) {
			    if (aByteArray5059[anLocalInt_676_] == anLocalInt
				&& (method2663(anLocalInt_676_)
				    || method2678(anLocalInt_676_)))
				method2692(anLocalInt_676_, argument_671_,
					   argument_672_);
			}
		    }
		}
	    }
	} else {
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		method2692(anLocalInt, argument_671_, argument_672_);
	}
    }
    
    final void method2652() {
	/* empty */
    }
    
    private final void method2685() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		int anLocalInt_677_ = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = -anLocalInt_677_;
	    }
	    method2672();
	}
    }
    
    private final void method2686(boolean argument_678_) {
	if (anInt5065 == 1)
	    method2680();
	else if (anInt5065 == 2) {
	    if ((anInt5140 & 0x97098) == 0 && aFloatArrayArray5098 == null)
		aShortArray5116 = null;
	    if (argument_678_)
		aByteArray5132 = null;
	} else {
	    method2689();
	    int anLocalInt = ((JavaToolkit) aClass_ha__5089).anInt4646;
	    int anLocalInt_679_
		= ((JavaToolkit) aClass_ha__5089).anInt4632;
	    int anLocalInt_680_
		= ((JavaToolkit) aClass_ha__5089).anInt4661;
	    int anLocalInt_681_
		= ((JavaToolkit) aClass_ha__5089).anInt4634 >> 8;
	    int anLocalInt_682_
		= (((JavaToolkit) aClass_ha__5089).anInt4665 * 768
		   / anInt5117);
	    int anLocalInt_683_
		= (((JavaToolkit) aClass_ha__5089).anInt4651 * 768
		   / anInt5117);
	    if (anIntArray5058 == null) {
		anIntArray5058 = new int[anInt5070];
		anIntArray5115 = new int[anInt5070];
		anIntArray5126 = new int[anInt5070];
	    }
	    for (int anLocalInt_684_ = 0; anLocalInt_684_ < anInt5070;
		 anLocalInt_684_++) {
		byte anLocalInt_685_;
		if (aByteArray5132 == null)
		    anLocalInt_685_ = (byte) 0;
		else
		    anLocalInt_685_ = aByteArray5132[anLocalInt_684_];
		byte anLocalInt_686_;
		if (aByteArray5105 == null)
		    anLocalInt_686_ = (byte) 0;
		else
		    anLocalInt_686_ = aByteArray5105[anLocalInt_684_];
		short anLocalInt_687_;
		if (aShortArray5104 == null)
		    anLocalInt_687_ = (short) -1;
		else
		    anLocalInt_687_ = aShortArray5104[anLocalInt_684_];
		if (anLocalInt_686_ == -2)
		    anLocalInt_685_ = (byte) 3;
		if (anLocalInt_686_ == -1)
		    anLocalInt_685_ = (byte) 2;
		if (anLocalInt_687_ == -1) {
		    if (anLocalInt_685_ == 0) {
			int anLocalInt_688_
			    = aShortArray5116[anLocalInt_684_] & 0xffff;
			int anLocalInt_689_
			    = (anLocalInt_688_ & 0x7f) * anInt5081 >> 7;
			short anLocalInt_690_
			    = HslToRgb.method3452((anLocalInt_688_ & ~0x7f | anLocalInt_689_));
			Class56 class56;
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5095[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5095[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5095[anLocalInt_684_]]);
			int anLocalInt_691_
			    = (((anLocalInt * ((Class56) class56).anInt411
				 + (anLocalInt_679_
				    * ((Class56) class56).anInt413)
				 + (anLocalInt_680_
				    * ((Class56) class56).anInt410))
				/ ((Class56) class56).anInt412)
			       >> 16);
			int anLocalInt_692_
			    = (anLocalInt_691_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			int anLocalInt_693_
			    = ((anLocalInt_681_ >> 1)
			       + (anLocalInt_692_ * anLocalInt_691_ >> 17));
			anIntArray5058[anLocalInt_684_]
			    = (anLocalInt_693_ << 17
			       | Class383.method4111(anLocalInt_693_,
						     anLocalInt_690_,
						     (byte) -17));
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5112[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5112[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5112[anLocalInt_684_]]);
			anLocalInt_691_
			    = ((anLocalInt * ((Class56) class56).anInt411
				+ (anLocalInt_679_
				   * ((Class56) class56).anInt413)
				+ (anLocalInt_680_
				   * ((Class56) class56).anInt410))
			       / ((Class56) class56).anInt412) >> 16;
			anLocalInt_692_
			    = (anLocalInt_691_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			anLocalInt_693_
			    = ((anLocalInt_681_ >> 1)
			       + (anLocalInt_692_ * anLocalInt_691_ >> 17));
			anIntArray5115[anLocalInt_684_]
			    = (anLocalInt_693_ << 17
			       | Class383.method4111(anLocalInt_693_,
						     anLocalInt_690_,
						     (byte) -64));
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5110[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5110[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5110[anLocalInt_684_]]);
			anLocalInt_691_
			    = ((anLocalInt * ((Class56) class56).anInt411
				+ (anLocalInt_679_
				   * ((Class56) class56).anInt413)
				+ (anLocalInt_680_
				   * ((Class56) class56).anInt410))
			       / ((Class56) class56).anInt412) >> 16;
			anLocalInt_692_
			    = (anLocalInt_691_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			anLocalInt_693_
			    = ((anLocalInt_681_ >> 1)
			       + (anLocalInt_692_ * anLocalInt_691_ >> 17));
			anIntArray5126[anLocalInt_684_]
			    = (anLocalInt_693_ << 17
			       | Class383.method4111(anLocalInt_693_,
						     anLocalInt_690_,
						     (byte) -66));
		    } else if (anLocalInt_685_ == 1) {
			int anLocalInt_694_
			    = aShortArray5116[anLocalInt_684_] & 0xffff;
			int anLocalInt_695_
			    = (anLocalInt_694_ & 0x7f) * anInt5081 >> 7;
			short anLocalInt_696_
			    = HslToRgb.method3452((anLocalInt_694_ & ~0x7f | anLocalInt_695_));
			Class312 class312
			    = aClass312Array5082[anLocalInt_684_];
			int anLocalInt_697_
			    = ((anLocalInt * ((Class312) class312).anInt2595
				+ (anLocalInt_679_
				   * ((Class312) class312).anInt2594)
				+ (anLocalInt_680_
				   * ((Class312) class312).anInt2593))
			       >> 16);
			int anLocalInt_698_
			    = (anLocalInt_697_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			int anLocalInt_699_
			    = ((anLocalInt_681_ >> 1)
			       + (anLocalInt_698_ * anLocalInt_697_ >> 17));
			anIntArray5058[anLocalInt_684_]
			    = (anLocalInt_699_ << 17
			       | Class383.method4111(anLocalInt_699_,
						     anLocalInt_696_,
						     (byte) -66));
			anIntArray5126[anLocalInt_684_] = -1;
		    } else if (anLocalInt_685_ == 3) {
			anIntArray5058[anLocalInt_684_] = 128;
			anIntArray5126[anLocalInt_684_] = -1;
		    } else
			anIntArray5126[anLocalInt_684_] = -2;
		} else {
		    int anLocalInt_700_
			= aShortArray5116[anLocalInt_684_] & 0xffff;
		    if (anLocalInt_685_ == 0) {
			Class56 class56;
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5095[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5095[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5095[anLocalInt_684_]]);
			int anLocalInt_701_
			    = (((anLocalInt * ((Class56) class56).anInt411
				 + (anLocalInt_679_
				    * ((Class56) class56).anInt413)
				 + (anLocalInt_680_
				    * ((Class56) class56).anInt410))
				/ ((Class56) class56).anInt412)
			       >> 16);
			int anLocalInt_702_
			    = (anLocalInt_701_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			int anLocalInt_703_
			    = method2677((anLocalInt_681_ >> 2)
					 + (anLocalInt_702_ * anLocalInt_701_
					    >> 18));
			anIntArray5058[anLocalInt_684_]
			    = (anLocalInt_703_ << 24
			       | method2696(anLocalInt_700_, anLocalInt_687_,
					    anLocalInt_703_));
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5112[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5112[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5112[anLocalInt_684_]]);
			anLocalInt_701_
			    = ((anLocalInt * ((Class56) class56).anInt411
				+ (anLocalInt_679_
				   * ((Class56) class56).anInt413)
				+ (anLocalInt_680_
				   * ((Class56) class56).anInt410))
			       / ((Class56) class56).anInt412) >> 16;
			anLocalInt_702_
			    = (anLocalInt_701_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			anLocalInt_703_
			    = method2677((anLocalInt_681_ >> 2)
					 + (anLocalInt_702_ * anLocalInt_701_
					    >> 18));
			anIntArray5115[anLocalInt_684_]
			    = (anLocalInt_703_ << 24
			       | method2696(anLocalInt_700_, anLocalInt_687_,
					    anLocalInt_703_));
			if (aClass56Array5076 != null
			    && (aClass56Array5076
				[aShortArray5110[anLocalInt_684_]]) != null)
			    class56 = (aClass56Array5076
				       [aShortArray5110[anLocalInt_684_]]);
			else
			    class56 = (aClass56Array5138
				       [aShortArray5110[anLocalInt_684_]]);
			anLocalInt_701_
			    = ((anLocalInt * ((Class56) class56).anInt411
				+ (anLocalInt_679_
				   * ((Class56) class56).anInt413)
				+ (anLocalInt_680_
				   * ((Class56) class56).anInt410))
			       / ((Class56) class56).anInt412) >> 16;
			anLocalInt_702_
			    = (anLocalInt_701_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			anLocalInt_703_
			    = method2677((anLocalInt_681_ >> 2)
					 + (anLocalInt_702_ * anLocalInt_701_
					    >> 18));
			anIntArray5126[anLocalInt_684_]
			    = (anLocalInt_703_ << 24
			       | method2696(anLocalInt_700_, anLocalInt_687_,
					    anLocalInt_703_));
		    } else if (anLocalInt_685_ == 1) {
			Class312 class312
			    = aClass312Array5082[anLocalInt_684_];
			int anLocalInt_704_
			    = ((anLocalInt * ((Class312) class312).anInt2595
				+ (anLocalInt_679_
				   * ((Class312) class312).anInt2594)
				+ (anLocalInt_680_
				   * ((Class312) class312).anInt2593))
			       >> 16);
			int anLocalInt_705_
			    = (anLocalInt_704_ > 256 ? anLocalInt_682_
			       : anLocalInt_683_);
			int anLocalInt_706_
			    = method2677((anLocalInt_681_ >> 2)
					 + (anLocalInt_705_ * anLocalInt_704_
					    >> 18));
			anIntArray5058[anLocalInt_684_]
			    = (anLocalInt_706_ << 24
			       | method2696(anLocalInt_700_, anLocalInt_687_,
					    anLocalInt_706_));
			anIntArray5126[anLocalInt_684_] = -1;
		    } else
			anIntArray5126[anLocalInt_684_] = -2;
		}
	    }
	    aClass56Array5138 = null;
	    aClass56Array5076 = null;
	    aClass312Array5082 = null;
	    if ((anInt5140 & 0x97098) == 0 && aFloatArrayArray5098 == null)
		aShortArray5116 = null;
	    if (argument_678_)
		aByteArray5132 = null;
	    anInt5065 = 2;
	}
    }
    
    private final void method2687() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt] = -anIntArray5124[anLocalInt];
		anIntArray5075[anLocalInt] = -anIntArray5075[anLocalInt];
	    }
	    method2672();
	}
    }
    
    final void O(int argument_707_, int argument_708_, int argument_709_) {
	if (argument_707_ != 128 && (anInt5140 & 0x1) != 1)
	    throw new IllegalStateException();
	if (argument_708_ != 128 && (anInt5140 & 0x2) != 2)
	    throw new IllegalStateException();
	if (argument_709_ != 128 && (anInt5140 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt]
		    = anIntArray5124[anLocalInt] * argument_707_ >> 7;
		anIntArray5130[anLocalInt]
		    = anIntArray5130[anLocalInt] * argument_708_ >> 7;
		anIntArray5075[anLocalInt]
		    = anIntArray5075[anLocalInt] * argument_709_ >> 7;
	    }
	    aBoolean5064 = false;
	}
    }
    
    final void H(int argument_710_, int argument_711_, int argument_712_) {
	if (argument_710_ != 0 && (anInt5140 & 0x1) != 1)
	    throw new IllegalStateException();
	if (argument_711_ != 0 && (anInt5140 & 0x2) != 2)
	    throw new IllegalStateException();
	if (argument_712_ != 0 && (anInt5140 & 0x4) != 4)
	    throw new IllegalStateException();
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt] += argument_710_;
		anIntArray5130[anLocalInt] += argument_711_;
		anIntArray5075[anLocalInt] += argument_712_;
	    }
	}
    }
    
    final void VA(int argument_713_) {
	if ((anInt5140 & 0x3) != 3)
	    throw new IllegalStateException();
	int anLocalInt = Node_Sub6.SINETABLE[argument_713_];
	int anLocalInt_714_ = Node_Sub6.COSINETABLE[argument_713_];
	synchronized (this) {
	    for (int anLocalInt_715_ = 0; anLocalInt_715_ < anInt5136;
		 anLocalInt_715_++) {
		int anLocalInt_716_
		    = ((anIntArray5130[anLocalInt_715_] * anLocalInt
			+ anIntArray5124[anLocalInt_715_] * anLocalInt_714_)
		       >> 14);
		anIntArray5130[anLocalInt_715_]
		    = (anIntArray5130[anLocalInt_715_] * anLocalInt_714_
		       - anIntArray5124[anLocalInt_715_] * anLocalInt) >> 14;
		anIntArray5124[anLocalInt_715_] = anLocalInt_716_;
	    }
	    method2672();
	}
    }
    
    final void method2646(Class350 argument_717_, DoublyLinkedNodeP2_Sub9 argument_718_,
			  int argument_719_, int argument_720_) {
	method2664(argument_717_, argument_718_, argument_719_, argument_720_);
    }
    
    final int WA() {
	return anInt5081;
    }
    
    private final void method2688() {
	synchronized (this) {
	    for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++) {
		int anLocalInt_721_ = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = -anLocalInt_721_;
		if (aClass56Array5138[anLocalInt] != null) {
		    anLocalInt_721_
			= ((Class56) aClass56Array5138[anLocalInt]).anInt411;
		    ((Class56) aClass56Array5138[anLocalInt]).anInt411
			= ((Class56) aClass56Array5138[anLocalInt]).anInt410;
		    ((Class56) aClass56Array5138[anLocalInt]).anInt410
			= -anLocalInt_721_;
		}
	    }
	    if (aClass312Array5082 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    if (aClass312Array5082[anLocalInt] != null) {
			int anLocalInt_722_
			    = (((Class312) aClass312Array5082[anLocalInt])
			       .anInt2595);
			((Class312) aClass312Array5082[anLocalInt]).anInt2595
			    = (((Class312) aClass312Array5082[anLocalInt])
			       .anInt2593);
			((Class312) aClass312Array5082[anLocalInt]).anInt2593
			    = -anLocalInt_722_;
		    }
		}
	    }
	    for (int anLocalInt = anInt5142; anLocalInt < anInt5136;
		 anLocalInt++) {
		int anLocalInt_723_ = anIntArray5124[anLocalInt];
		anIntArray5124[anLocalInt] = anIntArray5075[anLocalInt];
		anIntArray5075[anLocalInt] = -anLocalInt_723_;
	    }
	    anInt5065 = 0;
	    aBoolean5064 = false;
	}
    }
    
    final int da() {
	return anInt5117;
    }
    
    final boolean method2637(int argument_724_, int argument_725_,
			     Class350 argument_726_, boolean argument_727_,
			     int argument_728_, int argument_729_) {
	return method2674(argument_724_, argument_725_, argument_726_,
			  argument_727_, argument_728_, argument_729_);
    }
    
    private final void method2689() {
	if (anInt5065 == 0 && aClass56Array5138 == null) {
	    if (((JavaToolkit) aClass_ha__5089).anInt4659 > 1) {
		synchronized (this) {
		    method2695();
		}
	    } else
		method2695();
	}
    }
    
    private final void method2690(int argument_730_) {
	short anLocalInt = aShortArray5095[argument_730_];
	short anLocalInt_731_ = aShortArray5112[argument_730_];
	short anLocalInt_732_ = aShortArray5110[argument_730_];
	if (aShortArray5104 == null || aShortArray5104[argument_730_] == -1) {
	    if (aByteArray5105 == null)
		((Class89) aClass89_5134).anInt646 = 0;
	    else
		((Class89) aClass89_5134).anInt646
		    = aByteArray5105[argument_730_] & 0xff;
	    if (anIntArray5126[argument_730_] == -1)
		aClass89_5134.method1654
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_731_],
		     (float) anIntArray5078[anLocalInt_732_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_731_],
		     (float) anIntArray5084[anLocalInt_732_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_731_],
		     (float) anIntArray5144[anLocalInt_732_],
		     (HslToRgb.table2
		      [anIntArray5058[argument_730_] & 0xffff]));
	    else
		aClass89_5134.method1667
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_731_],
		     (float) anIntArray5078[anLocalInt_732_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_731_],
		     (float) anIntArray5084[anLocalInt_732_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_731_],
		     (float) anIntArray5144[anLocalInt_732_],
		     (float) (anIntArray5058[argument_730_] & 0xffff),
		     (float) (anIntArray5115[argument_730_] & 0xffff),
		     (float) (anIntArray5126[argument_730_] & 0xffff));
	} else {
	    int anLocalInt_733_ = -16777216;
	    if (aByteArray5105 != null)
		anLocalInt_733_
		    = 255 - (aByteArray5105[argument_730_] & 0xff) << 24;
	    if (anIntArray5126[argument_730_] == -1) {
		int anLocalInt_734_
		    = (anLocalInt_733_
		       | anIntArray5058[argument_730_] & 0xffffff);
		aClass89_5134.method1664
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_731_],
		     (float) anIntArray5078[anLocalInt_732_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_731_],
		     (float) anIntArray5084[anLocalInt_732_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_731_],
		     (float) anIntArray5144[anLocalInt_732_],
		     aFloatArrayArray5098[argument_730_][0],
		     aFloatArrayArray5098[argument_730_][1],
		     aFloatArrayArray5098[argument_730_][2],
		     aFloatArrayArray5071[argument_730_][0],
		     aFloatArrayArray5071[argument_730_][1],
		     aFloatArrayArray5071[argument_730_][2], anLocalInt_734_,
		     anLocalInt_734_, anLocalInt_734_,
		     ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
		     aShortArray5104[argument_730_]);
	    } else
		aClass89_5134.method1664
		    ((float) anIntArray5078[anLocalInt],
		     (float) anIntArray5078[anLocalInt_731_],
		     (float) anIntArray5078[anLocalInt_732_],
		     (float) anIntArray5084[anLocalInt],
		     (float) anIntArray5084[anLocalInt_731_],
		     (float) anIntArray5084[anLocalInt_732_],
		     (float) anIntArray5144[anLocalInt],
		     (float) anIntArray5144[anLocalInt_731_],
		     (float) anIntArray5144[anLocalInt_732_],
		     aFloatArrayArray5098[argument_730_][0],
		     aFloatArrayArray5098[argument_730_][1],
		     aFloatArrayArray5098[argument_730_][2],
		     aFloatArrayArray5071[argument_730_][0],
		     aFloatArrayArray5071[argument_730_][1],
		     aFloatArrayArray5071[argument_730_][2],
		     (anLocalInt_733_
		      | anIntArray5058[argument_730_] & 0xffffff),
		     (anLocalInt_733_
		      | anIntArray5115[argument_730_] & 0xffffff),
		     (anLocalInt_733_
		      | anIntArray5126[argument_730_] & 0xffffff),
		     ((Class293) aClass293_5118).anInt2408, 0, 0, 0,
		     aShortArray5104[argument_730_]);
	}
    }
    
    private final Class167 method2691
	(Class167_Sub1 argument_735_, Class167_Sub1 argument_736_,
	 int argument_737_, boolean argument_738_, boolean argument_739_) {
	argument_735_.aBoolean5064 = aBoolean5064;
	if (aBoolean5064) {
	    argument_735_.aShort5090 = aShort5090;
	    argument_735_.aShort5123 = aShort5123;
	    argument_735_.aShort5080 = aShort5080;
	    argument_735_.aShort5108 = aShort5108;
	    argument_735_.aShort5127 = aShort5127;
	    argument_735_.aShort5133 = aShort5133;
	    argument_735_.aShort5141 = aShort5141;
	    argument_735_.aShort5107 = aShort5107;
	}
	argument_735_.anInt5081 = anInt5081;
	argument_735_.anInt5117 = anInt5117;
	argument_735_.anInt5136 = anInt5136;
	argument_735_.anInt5142 = anInt5142;
	argument_735_.anInt5070 = anInt5070;
	argument_735_.anInt5069 = anInt5069;
	if ((argument_737_ & 0x100) != 0)
	    argument_735_.aBoolean5131 = true;
	else
	    argument_735_.aBoolean5131 = aBoolean5131;
	argument_735_.aBoolean5097 = aBoolean5097;
	boolean anLocalBoolean
	    = (argument_737_ & 0x7) == 7 | (argument_737_ & 0x20) != 0;
	boolean anLocalBoolean_740_
	    = anLocalBoolean || (argument_737_ & 0x1) != 0;
	boolean anLocalBoolean_741_
	    = anLocalBoolean || (argument_737_ & 0x2) != 0;
	boolean anLocalBoolean_742_
	    = (anLocalBoolean || (argument_737_ & 0x4) != 0
	       || (argument_737_ & 0x10) != 0);
	if (anLocalBoolean_740_ || anLocalBoolean_741_
	    || anLocalBoolean_742_) {
	    if (anLocalBoolean_740_) {
		if (argument_736_.anIntArray5124 == null
		    || argument_736_.anIntArray5124.length < anInt5136)
		    argument_735_.anIntArray5124
			= argument_736_.anIntArray5124 = new int[anInt5136];
		else
		    argument_735_.anIntArray5124
			= argument_736_.anIntArray5124;
		for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++)
		    argument_735_.anIntArray5124[anLocalInt]
			= anIntArray5124[anLocalInt];
	    } else
		argument_735_.anIntArray5124 = anIntArray5124;
	    if (anLocalBoolean_741_) {
		if (argument_736_.anIntArray5130 == null
		    || argument_736_.anIntArray5130.length < anInt5136)
		    argument_735_.anIntArray5130
			= argument_736_.anIntArray5130 = new int[anInt5136];
		else
		    argument_735_.anIntArray5130
			= argument_736_.anIntArray5130;
		for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++)
		    argument_735_.anIntArray5130[anLocalInt]
			= anIntArray5130[anLocalInt];
	    } else
		argument_735_.anIntArray5130 = anIntArray5130;
	    if (anLocalBoolean_742_) {
		if (argument_736_.anIntArray5075 == null
		    || argument_736_.anIntArray5075.length < anInt5136)
		    argument_735_.anIntArray5075
			= argument_736_.anIntArray5075 = new int[anInt5136];
		else
		    argument_735_.anIntArray5075
			= argument_736_.anIntArray5075;
		for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++)
		    argument_735_.anIntArray5075[anLocalInt]
			= anIntArray5075[anLocalInt];
	    } else
		argument_735_.anIntArray5075 = anIntArray5075;
	} else {
	    argument_735_.anIntArray5124 = anIntArray5124;
	    argument_735_.anIntArray5130 = anIntArray5130;
	    argument_735_.anIntArray5075 = anIntArray5075;
	}
	if ((argument_737_ & 0x84080) != 0) {
	    if (argument_736_.aShortArray5116 == null
		|| argument_736_.aShortArray5116.length < anInt5070) {
		int anLocalInt = anInt5070;
		argument_735_.aShortArray5116
		    = argument_736_.aShortArray5116 = new short[anLocalInt];
	    } else
		argument_735_.aShortArray5116 = argument_736_.aShortArray5116;
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		argument_735_.aShortArray5116[anLocalInt]
		    = aShortArray5116[anLocalInt];
	} else
	    argument_735_.aShortArray5116 = aShortArray5116;
	if ((argument_737_ & 0x97018) != 0) {
	    argument_735_.anInt5065 = 0;
	    argument_735_.anIntArray5058 = argument_735_.anIntArray5115
		= argument_735_.anIntArray5126 = null;
	} else if ((argument_737_ & 0x80) != 0) {
	    if (argument_739_)
		method2666(false);
	    if (anIntArray5058 != null) {
		if (argument_736_.anIntArray5058 == null
		    || argument_736_.anIntArray5058.length < anInt5070) {
		    int anLocalInt = anInt5070;
		    argument_735_.anIntArray5058
			= argument_736_.anIntArray5058 = new int[anLocalInt];
		    argument_735_.anIntArray5115
			= argument_736_.anIntArray5115 = new int[anLocalInt];
		    argument_735_.anIntArray5126
			= argument_736_.anIntArray5126 = new int[anLocalInt];
		} else {
		    argument_735_.anIntArray5058
			= argument_736_.anIntArray5058;
		    argument_735_.anIntArray5115
			= argument_736_.anIntArray5115;
		    argument_735_.anIntArray5126
			= argument_736_.anIntArray5126;
		}
		for (int anLocalInt = 0; anLocalInt < anInt5070;
		     anLocalInt++) {
		    argument_735_.anIntArray5058[anLocalInt]
			= anIntArray5058[anLocalInt];
		    argument_735_.anIntArray5115[anLocalInt]
			= anIntArray5115[anLocalInt];
		    argument_735_.anIntArray5126[anLocalInt]
			= anIntArray5126[anLocalInt];
		}
	    }
	    argument_735_.anInt5065 = anInt5065;
	} else {
	    if (argument_739_)
		method2666(false);
	    argument_735_.anIntArray5058 = anIntArray5058;
	    argument_735_.anIntArray5115 = anIntArray5115;
	    argument_735_.anIntArray5126 = anIntArray5126;
	    argument_735_.anInt5065 = anInt5065;
	}
	if ((argument_737_ & 0x100) != 0) {
	    if (argument_736_.aByteArray5105 == null
		|| argument_736_.aByteArray5105.length < anInt5070) {
		int anLocalInt = anInt5070;
		argument_735_.aByteArray5105 = argument_736_.aByteArray5105
		    = new byte[anLocalInt];
	    } else
		argument_735_.aByteArray5105 = argument_736_.aByteArray5105;
	    if (aByteArray5105 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		    argument_735_.aByteArray5105[anLocalInt]
			= aByteArray5105[anLocalInt];
	    } else {
		for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		    argument_735_.aByteArray5105[anLocalInt] = (byte) 0;
	    }
	} else
	    argument_735_.aByteArray5105 = aByteArray5105;
	if ((argument_737_ & 0x8) != 0 || (argument_737_ & 0x10) != 0) {
	    if (argument_736_.aClass56Array5138 == null
		|| argument_736_.aClass56Array5138.length < anInt5142) {
		int anLocalInt = anInt5142;
		argument_735_.aClass56Array5138
		    = argument_736_.aClass56Array5138
		    = new Class56[anLocalInt];
	    } else
		argument_735_.aClass56Array5138
		    = argument_736_.aClass56Array5138;
	    if (aClass56Array5138 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++)
		    argument_735_.aClass56Array5138[anLocalInt]
			= new Class56(aClass56Array5138[anLocalInt]);
	    } else
		argument_735_.aClass56Array5138 = null;
	    if (aClass312Array5082 != null) {
		if (argument_736_.aClass312Array5082 == null
		    || argument_736_.aClass312Array5082.length < anInt5070) {
		    int anLocalInt = anInt5070;
		    argument_735_.aClass312Array5082
			= argument_736_.aClass312Array5082
			= new Class312[anLocalInt];
		} else
		    argument_735_.aClass312Array5082
			= argument_736_.aClass312Array5082;
		for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		    argument_735_.aClass312Array5082[anLocalInt]
			= (aClass312Array5082[anLocalInt] != null
			   ? new Class312(aClass312Array5082[anLocalInt])
			   : null);
	    } else
		argument_735_.aClass312Array5082 = null;
	} else {
	    if (argument_739_)
		method2689();
	    argument_735_.aClass56Array5138 = aClass56Array5138;
	    argument_735_.aClass312Array5082 = aClass312Array5082;
	}
	if ((argument_737_ & 0x8000) != 0) {
	    if (aShortArray5104 == null)
		argument_735_.aShortArray5104 = null;
	    else {
		if (argument_736_.aShortArray5104 == null
		    || argument_736_.aShortArray5104.length < anInt5070) {
		    int anLocalInt = anInt5070;
		    argument_735_.aShortArray5104
			= argument_736_.aShortArray5104
			= new short[anLocalInt];
		} else
		    argument_735_.aShortArray5104
			= argument_736_.aShortArray5104;
		for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		    argument_735_.aShortArray5104[anLocalInt]
			= aShortArray5104[anLocalInt];
	    }
	} else
	    argument_735_.aShortArray5104 = aShortArray5104;
	if ((argument_737_ & 0x10000) != 0) {
	    if (aByteArray5132 == null)
		argument_735_.aByteArray5132 = null;
	    else {
		if (argument_736_.aByteArray5132 == null
		    || argument_736_.aByteArray5132.length < anInt5070) {
		    int anLocalInt
			= argument_738_ ? anInt5070 + 100 : anInt5070;
		    argument_735_.aByteArray5132
			= argument_736_.aByteArray5132 = new byte[anLocalInt];
		} else
		    argument_735_.aByteArray5132
			= argument_736_.aByteArray5132;
		for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		    argument_735_.aByteArray5132[anLocalInt]
			= aByteArray5132[anLocalInt];
	    }
	} else
	    argument_735_.aByteArray5132 = aByteArray5132;
	if ((argument_737_ & 0xc580) != 0) {
	    if (argument_736_.aClass205Array5066 == null
		|| argument_736_.aClass205Array5066.length < anInt5069) {
		int anLocalInt = anInt5069;
		argument_735_.aClass205Array5066
		    = argument_736_.aClass205Array5066
		    = new Class205[anLocalInt];
		for (int anLocalInt_743_ = 0; anLocalInt_743_ < anInt5069;
		     anLocalInt_743_++)
		    argument_735_.aClass205Array5066[anLocalInt_743_]
			= aClass205Array5066[anLocalInt_743_]
			      .method2938(31738);
	    } else {
		argument_735_.aClass205Array5066
		    = argument_736_.aClass205Array5066;
		for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++)
		    argument_735_.aClass205Array5066[anLocalInt]
			.method2940(6264, aClass205Array5066[anLocalInt]);
	    }
	} else
	    argument_735_.aClass205Array5066 = aClass205Array5066;
	if (aFloatArrayArray5098 != null && (argument_737_ & 0x10) != 0) {
	    if (argument_736_.aFloatArrayArray5098 == null
		|| argument_736_.aFloatArrayArray5098.length < anInt5070) {
		int anLocalInt = argument_738_ ? anInt5070 + 100 : anInt5070;
		argument_735_.aFloatArrayArray5098
		    = argument_736_.aFloatArrayArray5098
		    = new float[anLocalInt][3];
	    } else
		argument_735_.aFloatArrayArray5098
		    = argument_736_.aFloatArrayArray5098;
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		if (aFloatArrayArray5098[anLocalInt] != null) {
		    argument_735_.aFloatArrayArray5098[anLocalInt][0]
			= aFloatArrayArray5098[anLocalInt][0];
		    argument_735_.aFloatArrayArray5098[anLocalInt][1]
			= aFloatArrayArray5098[anLocalInt][1];
		    argument_735_.aFloatArrayArray5098[anLocalInt][2]
			= aFloatArrayArray5098[anLocalInt][2];
		}
	    }
	    if (argument_736_.aFloatArrayArray5071 == null
		|| argument_736_.aFloatArrayArray5071.length < anInt5070) {
		int anLocalInt = argument_738_ ? anInt5070 + 100 : anInt5070;
		argument_735_.aFloatArrayArray5071
		    = argument_736_.aFloatArrayArray5071
		    = new float[anLocalInt][3];
	    } else
		argument_735_.aFloatArrayArray5071
		    = argument_736_.aFloatArrayArray5071;
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		if (aFloatArrayArray5071[anLocalInt] != null) {
		    argument_735_.aFloatArrayArray5071[anLocalInt][0]
			= aFloatArrayArray5071[anLocalInt][0];
		    argument_735_.aFloatArrayArray5071[anLocalInt][1]
			= aFloatArrayArray5071[anLocalInt][1];
		    argument_735_.aFloatArrayArray5071[anLocalInt][2]
			= aFloatArrayArray5071[anLocalInt][2];
		}
	    }
	} else {
	    argument_735_.aFloatArrayArray5098 = aFloatArrayArray5098;
	    argument_735_.aFloatArrayArray5071 = aFloatArrayArray5071;
	}
	argument_735_.anIntArrayArray5086 = anIntArrayArray5086;
	argument_735_.anIntArrayArray5067 = anIntArrayArray5067;
	argument_735_.anIntArrayArray5139 = anIntArrayArray5139;
	argument_735_.aShortArray5072 = aShortArray5072;
	argument_735_.aShortArray5128 = aShortArray5128;
	argument_735_.aByteArray5059 = aByteArray5059;
	argument_735_.aShortArray5095 = aShortArray5095;
	argument_735_.aShortArray5112 = aShortArray5112;
	argument_735_.aShortArray5110 = aShortArray5110;
	argument_735_.aClass38Array5079 = aClass38Array5079;
	argument_735_.aClass185Array5103 = aClass185Array5103;
	argument_735_.aClass35Array5092 = aClass35Array5092;
	argument_735_.aShortArray5062 = aShortArray5062;
	argument_735_.anInt5140 = argument_737_;
	return argument_735_;
    }
    
    final boolean method2653() {
	if (aShortArray5104 == null)
	    return true;
	for (int anLocalInt = 0; anLocalInt < aShortArray5104.length;
	     anLocalInt++) {
	    if (aShortArray5104[anLocalInt] != -1
		&& !aClass_ha__5089
			.method2113(aShortArray5104[anLocalInt]))
		return false;
	}
	return true;
    }
    
    private final void method2692(int argument_744_, boolean argument_745_,
				  boolean argument_746_) {
	if (anIntArray5126[argument_744_] != -2) {
	    short anLocalInt = aShortArray5095[argument_744_];
	    short anLocalInt_747_ = aShortArray5112[argument_744_];
	    short anLocalInt_748_ = aShortArray5110[argument_744_];
	    int anLocalInt_749_ = anIntArray5084[anLocalInt];
	    int anLocalInt_750_ = anIntArray5084[anLocalInt_747_];
	    int anLocalInt_751_ = anIntArray5084[anLocalInt_748_];
	    if (argument_745_
		&& (anLocalInt_749_ == -5000 || anLocalInt_750_ == -5000
		    || anLocalInt_751_ == -5000)) {
		int anLocalInt_752_ = anIntArray5109[anLocalInt];
		int anLocalInt_753_ = anIntArray5109[anLocalInt_747_];
		int anLocalInt_754_ = anIntArray5109[anLocalInt_748_];
		int anLocalInt_755_ = anIntArray5111[anLocalInt];
		int anLocalInt_756_ = anIntArray5111[anLocalInt_747_];
		int anLocalInt_757_ = anIntArray5111[anLocalInt_748_];
		int anLocalInt_758_ = anIntArray5088[anLocalInt];
		int anLocalInt_759_ = anIntArray5088[anLocalInt_747_];
		int anLocalInt_760_ = anIntArray5088[anLocalInt_748_];
		anLocalInt_752_ -= anLocalInt_753_;
		anLocalInt_754_ -= anLocalInt_753_;
		anLocalInt_755_ -= anLocalInt_756_;
		anLocalInt_757_ -= anLocalInt_756_;
		anLocalInt_758_ -= anLocalInt_759_;
		anLocalInt_760_ -= anLocalInt_759_;
		int anLocalInt_761_ = (anLocalInt_755_ * anLocalInt_760_
				       - anLocalInt_758_ * anLocalInt_757_);
		int anLocalInt_762_ = (anLocalInt_758_ * anLocalInt_754_
				       - anLocalInt_752_ * anLocalInt_760_);
		int anLocalInt_763_ = (anLocalInt_752_ * anLocalInt_757_
				       - anLocalInt_755_ * anLocalInt_754_);
		if ((anLocalInt_753_ * anLocalInt_761_
		     + anLocalInt_756_ * anLocalInt_762_
		     + anLocalInt_759_ * anLocalInt_763_)
		    > 0)
		    method2671(argument_744_);
	    } else if (anIntArray5096[argument_744_] != -1
		       || (((anLocalInt_749_ - anLocalInt_750_)
			    * (anIntArray5078[anLocalInt_748_]
			       - anIntArray5078[anLocalInt_747_]))
			   - ((anIntArray5078[anLocalInt]
			       - anIntArray5078[anLocalInt_747_])
			      * (anLocalInt_751_ - anLocalInt_750_))) > 0) {
		if (anLocalInt_749_ < 0 || anLocalInt_750_ < 0
		    || anLocalInt_751_ < 0
		    || anLocalInt_749_ > ((Class293) aClass293_5118).anInt2422
		    || anLocalInt_750_ > ((Class293) aClass293_5118).anInt2422
		    || anLocalInt_751_ > ((Class293) aClass293_5118).anInt2422)
		    ((Class89) aClass89_5134).aBoolean661 = true;
		else
		    ((Class89) aClass89_5134).aBoolean661 = false;
		if (argument_746_) {
		    int anLocalInt_764_ = anIntArray5096[argument_744_];
		    if (anLocalInt_764_ == -1
			|| !(((Class35) aClass35Array5092[anLocalInt_764_])
			     .aBoolean253))
			method2668(argument_744_);
		} else {
		    int anLocalInt_765_ = anIntArray5096[argument_744_];
		    if (anLocalInt_765_ != -1) {
			Class35 class35 = aClass35Array5092[anLocalInt_765_];
			Class205 class205
			    = aClass205Array5066[anLocalInt_765_];
			if (!((Class35) class35).aBoolean253)
			    method2665(argument_744_);
			aClass_ha__5089.method2114
			    (((Class205) class205).anInt1466,
			     ((Class205) class205).anInt1460,
			     ((Class205) class205).anInt1475,
			     ((Class205) class205).anInt1468,
			     ((Class205) class205).anInt1464,
			     ((Class205) class205).anInt1469,
			     ((Class35) class35).aShort259 & 0xffff,
			     ((Class205) class205).anInt1459,
			     ((Class35) class35).aByte255,
			     ((Class35) class35).aByte254);
		    } else
			method2665(argument_744_);
		}
	    }
	}
    }
    
    final void method2640(Class350 argument_766_, DoublyLinkedNodeP2_Sub9 argument_767_,
			  int argument_768_) {
	method2664(argument_766_, argument_767_, -1, argument_768_);
    }
    
    private final void method2693() {
	if (!aBoolean5064) {
	    int anLocalInt = 0;
	    int anLocalInt_769_ = 0;
	    int anLocalInt_770_ = 32767;
	    int anLocalInt_771_ = 32767;
	    int anLocalInt_772_ = 32767;
	    int anLocalInt_773_ = -32768;
	    int anLocalInt_774_ = -32768;
	    int anLocalInt_775_ = -32768;
	    for (int anLocalInt_776_ = 0; anLocalInt_776_ < anInt5142;
		 anLocalInt_776_++) {
		int anLocalInt_777_ = anIntArray5124[anLocalInt_776_];
		int anLocalInt_778_ = anIntArray5130[anLocalInt_776_];
		int anLocalInt_779_ = anIntArray5075[anLocalInt_776_];
		if (anLocalInt_777_ < anLocalInt_770_)
		    anLocalInt_770_ = anLocalInt_777_;
		if (anLocalInt_777_ > anLocalInt_773_)
		    anLocalInt_773_ = anLocalInt_777_;
		if (anLocalInt_778_ < anLocalInt_771_)
		    anLocalInt_771_ = anLocalInt_778_;
		if (anLocalInt_778_ > anLocalInt_774_)
		    anLocalInt_774_ = anLocalInt_778_;
		if (anLocalInt_779_ < anLocalInt_772_)
		    anLocalInt_772_ = anLocalInt_779_;
		if (anLocalInt_779_ > anLocalInt_775_)
		    anLocalInt_775_ = anLocalInt_779_;
		int anLocalInt_780_ = (anLocalInt_777_ * anLocalInt_777_
				       + anLocalInt_779_ * anLocalInt_779_);
		if (anLocalInt_780_ > anLocalInt)
		    anLocalInt = anLocalInt_780_;
		anLocalInt_780_ += anLocalInt_778_ * anLocalInt_778_;
		if (anLocalInt_780_ > anLocalInt_769_)
		    anLocalInt_769_ = anLocalInt_780_;
	    }
	    aShort5108 = (short) anLocalInt_770_;
	    aShort5090 = (short) anLocalInt_773_;
	    aShort5127 = (short) anLocalInt_771_;
	    aShort5123 = (short) anLocalInt_774_;
	    aShort5133 = (short) anLocalInt_772_;
	    aShort5080 = (short) anLocalInt_775_;
	    aShort5141 = (short) (int) (Math.sqrt((double) anLocalInt) + 0.99);
	    aShort5107
		= (short) (int) (Math.sqrt((double) anLocalInt_769_) + 0.99);
	    aBoolean5064 = true;
	}
    }
    
    private final boolean method2694(int argument_781_, int argument_782_,
				     int argument_783_, int argument_784_,
				     int argument_785_, int argument_786_,
				     int argument_787_, int argument_788_) {
	if (argument_782_ < argument_783_ && argument_782_ < argument_784_
	    && argument_782_ < argument_785_)
	    return false;
	if (argument_782_ > argument_783_ && argument_782_ > argument_784_
	    && argument_782_ > argument_785_)
	    return false;
	if (argument_781_ < argument_786_ && argument_781_ < argument_787_
	    && argument_781_ < argument_788_)
	    return false;
	if (argument_781_ > argument_786_ && argument_781_ > argument_787_
	    && argument_781_ > argument_788_)
	    return false;
	return true;
    }
    
    private final void method2695() {
	aClass56Array5138 = new Class56[anInt5142];
	for (int anLocalInt = 0; anLocalInt < anInt5142; anLocalInt++)
	    aClass56Array5138[anLocalInt] = new Class56();
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    short anLocalInt_789_ = aShortArray5095[anLocalInt];
	    short anLocalInt_790_ = aShortArray5112[anLocalInt];
	    short anLocalInt_791_ = aShortArray5110[anLocalInt];
	    int anLocalInt_792_ = (anIntArray5124[anLocalInt_790_]
				   - anIntArray5124[anLocalInt_789_]);
	    int anLocalInt_793_ = (anIntArray5130[anLocalInt_790_]
				   - anIntArray5130[anLocalInt_789_]);
	    int anLocalInt_794_ = (anIntArray5075[anLocalInt_790_]
				   - anIntArray5075[anLocalInt_789_]);
	    int anLocalInt_795_ = (anIntArray5124[anLocalInt_791_]
				   - anIntArray5124[anLocalInt_789_]);
	    int anLocalInt_796_ = (anIntArray5130[anLocalInt_791_]
				   - anIntArray5130[anLocalInt_789_]);
	    int anLocalInt_797_ = (anIntArray5075[anLocalInt_791_]
				   - anIntArray5075[anLocalInt_789_]);
	    int anLocalInt_798_ = (anLocalInt_793_ * anLocalInt_797_
				   - anLocalInt_796_ * anLocalInt_794_);
	    int anLocalInt_799_ = (anLocalInt_794_ * anLocalInt_795_
				   - anLocalInt_797_ * anLocalInt_792_);
	    int anLocalInt_800_;
	    for (anLocalInt_800_ = (anLocalInt_792_ * anLocalInt_796_
				    - anLocalInt_795_ * anLocalInt_793_);
		 (anLocalInt_798_ > 8192 || anLocalInt_799_ > 8192
		  || anLocalInt_800_ > 8192 || anLocalInt_798_ < -8192
		  || anLocalInt_799_ < -8192 || anLocalInt_800_ < -8192);
		 anLocalInt_800_ >>= 1) {
		anLocalInt_798_ >>= 1;
		anLocalInt_799_ >>= 1;
	    }
	    int anLocalInt_801_
		= (int) Math.sqrt((double) (anLocalInt_798_ * anLocalInt_798_
					    + anLocalInt_799_ * anLocalInt_799_
					    + (anLocalInt_800_
					       * anLocalInt_800_)));
	    if (anLocalInt_801_ <= 0)
		anLocalInt_801_ = 1;
	    anLocalInt_798_ = anLocalInt_798_ * 256 / anLocalInt_801_;
	    anLocalInt_799_ = anLocalInt_799_ * 256 / anLocalInt_801_;
	    anLocalInt_800_ = anLocalInt_800_ * 256 / anLocalInt_801_;
	    byte anLocalInt_802_;
	    if (aByteArray5132 == null)
		anLocalInt_802_ = (byte) 0;
	    else
		anLocalInt_802_ = aByteArray5132[anLocalInt];
	    if (anLocalInt_802_ == 0) {
		Class56 class56 = aClass56Array5138[anLocalInt_789_];
		((Class56) class56).anInt411 += anLocalInt_798_;
		((Class56) class56).anInt413 += anLocalInt_799_;
		((Class56) class56).anInt410 += anLocalInt_800_;
		((Class56) class56).anInt412++;
		class56 = aClass56Array5138[anLocalInt_790_];
		((Class56) class56).anInt411 += anLocalInt_798_;
		((Class56) class56).anInt413 += anLocalInt_799_;
		((Class56) class56).anInt410 += anLocalInt_800_;
		((Class56) class56).anInt412++;
		class56 = aClass56Array5138[anLocalInt_791_];
		((Class56) class56).anInt411 += anLocalInt_798_;
		((Class56) class56).anInt413 += anLocalInt_799_;
		((Class56) class56).anInt410 += anLocalInt_800_;
		((Class56) class56).anInt412++;
	    } else if (anLocalInt_802_ == 1) {
		if (aClass312Array5082 == null)
		    aClass312Array5082 = new Class312[anInt5070];
		Class312 class312
		    = aClass312Array5082[anLocalInt] = new Class312();
		((Class312) class312).anInt2595 = anLocalInt_798_;
		((Class312) class312).anInt2594 = anLocalInt_799_;
		((Class312) class312).anInt2593 = anLocalInt_800_;
	    }
	}
    }
    
    final int fa() {
	if (!aBoolean5064)
	    method2693();
	return aShort5127;
    }
    
    final void P(int argument_803_, int argument_804_, int argument_805_,
		 int argument_806_) {
	if (argument_803_ == 0) {
	    int anLocalInt = 0;
	    anInt5073 = 0;
	    anInt5121 = 0;
	    anInt5094 = 0;
	    for (int anLocalInt_807_ = 0; anLocalInt_807_ < anInt5136;
		 anLocalInt_807_++) {
		anInt5073 += anIntArray5124[anLocalInt_807_];
		anInt5121 += anIntArray5130[anLocalInt_807_];
		anInt5094 += anIntArray5075[anLocalInt_807_];
		anLocalInt++;
	    }
	    if (anLocalInt > 0) {
		anInt5073 = anInt5073 / anLocalInt + argument_804_;
		anInt5121 = anInt5121 / anLocalInt + argument_805_;
		anInt5094 = anInt5094 / anLocalInt + argument_806_;
	    } else {
		anInt5073 = argument_804_;
		anInt5121 = argument_805_;
		anInt5094 = argument_806_;
	    }
	} else if (argument_803_ == 1) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt] += argument_804_;
		anIntArray5130[anLocalInt] += argument_805_;
		anIntArray5075[anLocalInt] += argument_806_;
	    }
	} else if (argument_803_ == 2) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt] -= anInt5073;
		anIntArray5130[anLocalInt] -= anInt5121;
		anIntArray5075[anLocalInt] -= anInt5094;
		if (argument_806_ != 0) {
		    int anLocalInt_808_
			= Node_Sub6.SINETABLE[argument_806_];
		    int anLocalInt_809_
			= Node_Sub6.COSINETABLE[argument_806_];
		    int anLocalInt_810_
			= ((anIntArray5130[anLocalInt] * anLocalInt_808_
			    + anIntArray5124[anLocalInt] * anLocalInt_809_
			    + 16383)
			   >> 14);
		    anIntArray5130[anLocalInt]
			= (anIntArray5130[anLocalInt] * anLocalInt_809_
			   - anIntArray5124[anLocalInt] * anLocalInt_808_
			   + 16383) >> 14;
		    anIntArray5124[anLocalInt] = anLocalInt_810_;
		}
		if (argument_804_ != 0) {
		    int anLocalInt_811_
			= Node_Sub6.SINETABLE[argument_804_];
		    int anLocalInt_812_
			= Node_Sub6.COSINETABLE[argument_804_];
		    int anLocalInt_813_
			= ((anIntArray5130[anLocalInt] * anLocalInt_812_
			    - anIntArray5075[anLocalInt] * anLocalInt_811_
			    + 16383)
			   >> 14);
		    anIntArray5075[anLocalInt]
			= (anIntArray5130[anLocalInt] * anLocalInt_811_
			   + anIntArray5075[anLocalInt] * anLocalInt_812_
			   + 16383) >> 14;
		    anIntArray5130[anLocalInt] = anLocalInt_813_;
		}
		if (argument_805_ != 0) {
		    int anLocalInt_814_
			= Node_Sub6.SINETABLE[argument_805_];
		    int anLocalInt_815_
			= Node_Sub6.COSINETABLE[argument_805_];
		    int anLocalInt_816_
			= ((anIntArray5075[anLocalInt] * anLocalInt_814_
			    + anIntArray5124[anLocalInt] * anLocalInt_815_
			    + 16383)
			   >> 14);
		    anIntArray5075[anLocalInt]
			= (anIntArray5075[anLocalInt] * anLocalInt_815_
			   - anIntArray5124[anLocalInt] * anLocalInt_814_
			   + 16383) >> 14;
		    anIntArray5124[anLocalInt] = anLocalInt_816_;
		}
		anIntArray5124[anLocalInt] += anInt5073;
		anIntArray5130[anLocalInt] += anInt5121;
		anIntArray5075[anLocalInt] += anInt5094;
	    }
	} else if (argument_803_ == 3) {
	    for (int anLocalInt = 0; anLocalInt < anInt5136; anLocalInt++) {
		anIntArray5124[anLocalInt] -= anInt5073;
		anIntArray5130[anLocalInt] -= anInt5121;
		anIntArray5075[anLocalInt] -= anInt5094;
		anIntArray5124[anLocalInt]
		    = anIntArray5124[anLocalInt] * argument_804_ / 128;
		anIntArray5130[anLocalInt]
		    = anIntArray5130[anLocalInt] * argument_805_ / 128;
		anIntArray5075[anLocalInt]
		    = anIntArray5075[anLocalInt] * argument_806_ / 128;
		anIntArray5124[anLocalInt] += anInt5073;
		anIntArray5130[anLocalInt] += anInt5121;
		anIntArray5075[anLocalInt] += anInt5094;
	    }
	} else if (argument_803_ == 5) {
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		int anLocalInt_817_
		    = (aByteArray5105[anLocalInt] & 0xff) + argument_804_ * 8;
		if (anLocalInt_817_ < 0)
		    anLocalInt_817_ = 0;
		else if (anLocalInt_817_ > 255)
		    anLocalInt_817_ = 255;
		aByteArray5105[anLocalInt] = (byte) anLocalInt_817_;
	    }
	    if (aClass35Array5092 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5069;
		     anLocalInt++) {
		    Class35 class35 = aClass35Array5092[anLocalInt];
		    Class205 class205 = aClass205Array5066[anLocalInt];
		    ((Class205) class205).anInt1459
			= (((Class205) class205).anInt1459 & 0xffffff
			   | (255
			      - (aByteArray5105[((Class35) class35).anInt258]
				 & 0xff)) << 24);
		}
	    }
	} else if (argument_803_ == 7) {
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		int anLocalInt_818_ = aShortArray5116[anLocalInt] & 0xffff;
		int anLocalInt_819_ = anLocalInt_818_ >> 10 & 0x3f;
		int anLocalInt_820_ = anLocalInt_818_ >> 7 & 0x7;
		int anLocalInt_821_ = anLocalInt_818_ & 0x7f;
		anLocalInt_819_ = anLocalInt_819_ + argument_804_ & 0x3f;
		anLocalInt_820_ += argument_805_;
		if (anLocalInt_820_ < 0)
		    anLocalInt_820_ = 0;
		else if (anLocalInt_820_ > 7)
		    anLocalInt_820_ = 7;
		anLocalInt_821_ += argument_806_;
		if (anLocalInt_821_ < 0)
		    anLocalInt_821_ = 0;
		else if (anLocalInt_821_ > 127)
		    anLocalInt_821_ = 127;
		aShortArray5116[anLocalInt]
		    = (short) (anLocalInt_819_ << 10 | anLocalInt_820_ << 7
			       | anLocalInt_821_);
	    }
	    aBoolean5093 = true;
	    if (aClass35Array5092 != null) {
		for (int anLocalInt = 0; anLocalInt < anInt5069;
		     anLocalInt++) {
		    Class35 class35 = aClass35Array5092[anLocalInt];
		    Class205 class205 = aClass205Array5066[anLocalInt];
		    ((Class205) class205).anInt1459
			= (((Class205) class205).anInt1459 & ~0xffffff
			   | ((HslToRgb.table2
			       [HslToRgb.method3452((aShortArray5116[(((Class35) class35).anInt258)]) & 0xffff) & 0xffff])
			      & 0xffffff));
		}
	    }
	} else if (argument_803_ == 8) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class205 class205 = aClass205Array5066[anLocalInt];
		((Class205) class205).anInt1462 += argument_804_;
		((Class205) class205).anInt1461 += argument_805_;
	    }
	} else if (argument_803_ == 10) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class205 class205 = aClass205Array5066[anLocalInt];
		((Class205) class205).anInt1465
		    = ((Class205) class205).anInt1465 * argument_804_ >> 7;
		((Class205) class205).anInt1463
		    = ((Class205) class205).anInt1463 * argument_805_ >> 7;
	    }
	} else if (argument_803_ == 9) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class205 class205 = aClass205Array5066[anLocalInt];
		((Class205) class205).anInt1469
		    = ((Class205) class205).anInt1469 + argument_804_ & 0x3fff;
	    }
	}
    }
    
    final Class185[] method2655() {
	return aClass185Array5103;
    }
    
    final void method2649(int argument_822_, int argument_823_,
			  int argument_824_, int argument_825_) {
	if ((anInt5140 & 0x80000) != 524288)
	    throw new IllegalStateException("FMT");
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    int anLocalInt_826_ = aShortArray5116[anLocalInt] & 0xffff;
	    int anLocalInt_827_ = anLocalInt_826_ >> 10 & 0x3f;
	    int anLocalInt_828_ = anLocalInt_826_ >> 7 & 0x7;
	    int anLocalInt_829_ = anLocalInt_826_ & 0x7f;
	    if (argument_822_ != -1)
		anLocalInt_827_
		    += (argument_822_ - anLocalInt_827_) * argument_825_ >> 7;
	    if (argument_823_ != -1)
		anLocalInt_828_
		    += (argument_823_ - anLocalInt_828_) * argument_825_ >> 7;
	    if (argument_824_ != -1)
		anLocalInt_829_
		    += (argument_824_ - anLocalInt_829_) * argument_825_ >> 7;
	    aShortArray5116[anLocalInt]
		= (short) (anLocalInt_827_ << 10 | anLocalInt_828_ << 7
			   | anLocalInt_829_);
	}
	if (aClass35Array5092 != null) {
	    for (int anLocalInt = 0; anLocalInt < anInt5069; anLocalInt++) {
		Class35 class35 = aClass35Array5092[anLocalInt];
		Class205 class205 = aClass205Array5066[anLocalInt];
		((Class205) class205).anInt1459
		    = (((Class205) class205).anInt1459 & ~0xffffff
		       | (HslToRgb.table2
			  [HslToRgb.method3452((aShortArray5116[(((Class35) class35).anInt258)]) & 0xffff)]) & 0xffffff);
	    }
	}
	if (anInt5065 == 2)
	    anInt5065 = 1;
    }
    
    final boolean NA() {
	if (anIntArrayArray5086 == null)
	    return false;
	anInt5073 = 0;
	anInt5121 = 0;
	anInt5094 = 0;
	return true;
    }
    
    final Class167 method2651(byte argument_830_, int argument_831_,
			      boolean argument_832_) {
	method2679(Thread.currentThread());
	Class167_Sub1 class167_sub1;
	Class167_Sub1 class167_sub1_833_;
	if (argument_830_ == 1) {
	    class167_sub1 = aClass167_Sub1_5074;
	    class167_sub1_833_ = aClass167_Sub1_5099;
	} else if (argument_830_ == 2) {
	    class167_sub1 = aClass167_Sub1_5068;
	    class167_sub1_833_ = aClass167_Sub1_5122;
	} else if (argument_830_ == 3) {
	    class167_sub1 = aClass167_Sub1_5100;
	    class167_sub1_833_ = aClass167_Sub1_5087;
	} else if (argument_830_ == 4) {
	    class167_sub1 = aClass167_Sub1_5063;
	    class167_sub1_833_ = aClass167_Sub1_5120;
	} else if (argument_830_ == 5) {
	    class167_sub1 = aClass167_Sub1_5129;
	    class167_sub1_833_ = aClass167_Sub1_5135;
	} else
	    class167_sub1_833_ = class167_sub1
		= new Class167_Sub1(aClass_ha__5089);
	return method2691(class167_sub1_833_, class167_sub1, argument_831_,
			  argument_830_ != 0, argument_832_);
    }
    
    final void method2656(Class350 argument_834_) {
	Class350_Sub1 class350_sub1 = (Class350_Sub1) argument_834_;
	if (aClass38Array5079 != null) {
	    for (int anLocalInt = 0; anLocalInt < aClass38Array5079.length;
		 anLocalInt++) {
		Class38 class38 = aClass38Array5079[anLocalInt];
		Class38 class38_835_ = class38;
		if (((Class38) class38).aClass38_278 != null)
		    class38_835_ = ((Class38) class38).aClass38_278;
		((Class38) class38_835_).anInt282
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5426
			     + ((((Class350_Sub1) class350_sub1).aFloat5421
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5425
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5428
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt286)]))));
		((Class38) class38_835_).anInt279
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5424
			     + ((((Class350_Sub1) class350_sub1).aFloat5420
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5430
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5429
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt286)]))));
		((Class38) class38_835_).anInt280
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5427
			     + ((((Class350_Sub1) class350_sub1).aFloat5418
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5422
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt286]))
				+ (((Class350_Sub1) class350_sub1).aFloat5419
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt286)]))));
		((Class38) class38_835_).anInt283
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5426
			     + ((((Class350_Sub1) class350_sub1).aFloat5421
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5425
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5428
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt284)]))));
		((Class38) class38_835_).anInt276
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5424
			     + ((((Class350_Sub1) class350_sub1).aFloat5420
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5430
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5429
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt284)]))));
		((Class38) class38_835_).anInt289
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5427
			     + ((((Class350_Sub1) class350_sub1).aFloat5418
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5422
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt284]))
				+ (((Class350_Sub1) class350_sub1).aFloat5419
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt284)]))));
		((Class38) class38_835_).anInt277
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5426
			     + ((((Class350_Sub1) class350_sub1).aFloat5421
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5425
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5428
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt281)]))));
		((Class38) class38_835_).anInt288
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5424
			     + ((((Class350_Sub1) class350_sub1).aFloat5420
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5430
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5429
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt281)]))));
		((Class38) class38_835_).anInt290
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5427
			     + ((((Class350_Sub1) class350_sub1).aFloat5418
				 * (float) (anIntArray5124
					    [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5422
				   * (float) (anIntArray5130
					      [((Class38) class38).anInt281]))
				+ (((Class350_Sub1) class350_sub1).aFloat5419
				   * (float) (anIntArray5075
					      [(((Class38) class38)
						.anInt281)]))));
	    }
	}
	if (aClass185Array5103 != null) {
	    for (int anLocalInt = 0; anLocalInt < aClass185Array5103.length;
		 anLocalInt++) {
		Class185 class185 = aClass185Array5103[anLocalInt];
		Class185 class185_836_ = class185;
		if (((Class185) class185).aClass185_1387 != null)
		    class185_836_ = ((Class185) class185).aClass185_1387;
		if (((Class185) class185).aClass350_1383 != null)
		    ((Class185) class185).aClass350_1383
			.method3838(class350_sub1);
		else
		    ((Class185) class185).aClass350_1383
			= class350_sub1.method3826();
		((Class185) class185_836_).anInt1384
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5426
			     + ((((Class350_Sub1) class350_sub1).aFloat5421
				 * (float) (anIntArray5124
					    [((Class185) class185).anInt1389]))
				+ (((Class350_Sub1) class350_sub1).aFloat5425
				   * (float) (anIntArray5130
					      [(((Class185) class185)
						.anInt1389)]))
				+ (((Class350_Sub1) class350_sub1).aFloat5428
				   * (float) (anIntArray5075
					      [(((Class185) class185)
						.anInt1389)]))));
		((Class185) class185_836_).anInt1388
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5424
			     + ((((Class350_Sub1) class350_sub1).aFloat5420
				 * (float) (anIntArray5124
					    [((Class185) class185).anInt1389]))
				+ (((Class350_Sub1) class350_sub1).aFloat5430
				   * (float) (anIntArray5130
					      [(((Class185) class185)
						.anInt1389)]))
				+ (((Class350_Sub1) class350_sub1).aFloat5429
				   * (float) (anIntArray5075
					      [(((Class185) class185)
						.anInt1389)]))));
		((Class185) class185_836_).anInt1385
		    = (int) (((Class350_Sub1) class350_sub1).aFloat5427
			     + ((((Class350_Sub1) class350_sub1).aFloat5418
				 * (float) (anIntArray5124
					    [((Class185) class185).anInt1389]))
				+ (((Class350_Sub1) class350_sub1).aFloat5422
				   * (float) (anIntArray5130
					      [(((Class185) class185)
						.anInt1389)]))
				+ (((Class350_Sub1) class350_sub1).aFloat5419
				   * (float) (anIntArray5075
					      [(((Class185) class185)
						.anInt1389)]))));
	    }
	}
    }
    
    Class167_Sub1(JavaToolkit argument_837_) {
	anInt5070 = 0;
	aBoolean5083 = false;
	aBoolean5102 = false;
	anInt5065 = 0;
	aBoolean5131 = false;
	anInt5136 = 0;
	anInt5142 = 0;
	aBoolean5114 = false;
	aClass_ha__5089 = argument_837_;
    }
    
    private final int method2696(int argument_838_, short argument_839_,
				 int argument_840_) {
	int anLocalInt = (HslToRgb.table
			  [method2682(argument_838_, argument_840_)]);
	TextureDescriptor textureDescriptor = ((GraphicsToolkit) aClass_ha__5089)
				.textureSource
				.getDescriptor(argument_839_ & 0xffff, true);
	int anLocalInt_841_ = ((TextureDescriptor) textureDescriptor).aByte840 & 0xff;
	if (anLocalInt_841_ != 0) {
	    int anLocalInt_842_ = argument_840_ * 131586;
	    if (anLocalInt_841_ == 256)
		anLocalInt = anLocalInt_842_;
	    else {
		int anLocalInt_843_ = anLocalInt_841_;
		int anLocalInt_844_ = 256 - anLocalInt_841_;
		anLocalInt = ((((anLocalInt_842_ & 0xff00ff) * anLocalInt_843_
				+ (anLocalInt & 0xff00ff) * anLocalInt_844_)
			       & ~0xff00ff)
			      + (((anLocalInt_842_ & 0xff00) * anLocalInt_843_
				  + (anLocalInt & 0xff00) * anLocalInt_844_)
				 & 0xff0000)) >> 8;
	    }
	}
	int anLocalInt_845_ = ((TextureDescriptor) textureDescriptor).aByte828 & 0xff;
	if (anLocalInt_845_ != 0) {
	    anLocalInt_845_ += 256;
	    int anLocalInt_846_
		= ((anLocalInt & 0xff0000) >> 16) * anLocalInt_845_;
	    if (anLocalInt_846_ > 65535)
		anLocalInt_846_ = 65535;
	    int anLocalInt_847_
		= ((anLocalInt & 0xff00) >> 8) * anLocalInt_845_;
	    if (anLocalInt_847_ > 65535)
		anLocalInt_847_ = 65535;
	    int anLocalInt_848_ = (anLocalInt & 0xff) * anLocalInt_845_;
	    if (anLocalInt_848_ > 65535)
		anLocalInt_848_ = 65535;
	    anLocalInt
		= ((anLocalInt_846_ << 8 & 0xff0000)
		   + (anLocalInt_847_ & 0xff00) + (anLocalInt_848_ >> 8));
	}
	return anLocalInt;
    }
    
    Class167_Sub1(JavaToolkit argument_849_, Class101 argument_850_,
		  int argument_851_, int argument_852_, int argument_853_,
		  int argument_854_) {
	anInt5070 = 0;
	aBoolean5083 = false;
	aBoolean5102 = false;
	anInt5065 = 0;
	aBoolean5131 = false;
	anInt5136 = 0;
	anInt5142 = 0;
	aBoolean5114 = false;
	aClass_ha__5089 = argument_849_;
	anInt5140 = argument_851_;
	anInt5081 = argument_852_;
	anInt5117 = argument_853_;
	TextureSource textureSource
	    = ((GraphicsToolkit) aClass_ha__5089).textureSource;
	anInt5136 = ((Class101) argument_850_).anInt792;
	anInt5142 = ((Class101) argument_850_).anInt797;
	anIntArray5124 = ((Class101) argument_850_).anIntArray814;
	anIntArray5130 = ((Class101) argument_850_).anIntArray810;
	anIntArray5075 = ((Class101) argument_850_).anIntArray785;
	anInt5070 = ((Class101) argument_850_).anInt795;
	aShortArray5095 = ((Class101) argument_850_).aShortArray798;
	aShortArray5112 = ((Class101) argument_850_).aShortArray807;
	aShortArray5110 = ((Class101) argument_850_).aShortArray793;
	aByteArray5059 = ((Class101) argument_850_).aByteArray790;
	aShortArray5116 = ((Class101) argument_850_).aShortArray783;
	aByteArray5105 = ((Class101) argument_850_).aByteArray816;
	aShortArray5128 = ((Class101) argument_850_).aShortArray794;
	aByteArray5132 = ((Class101) argument_850_).aByteArray813;
	aClass38Array5079 = ((Class101) argument_850_).aClass38Array787;
	aClass185Array5103 = ((Class101) argument_850_).aClass185Array817;
	aShortArray5072 = ((Class101) argument_850_).aShortArray789;
	int[] anLocalInts = new int[anInt5070];
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
	    anLocalInts[anLocalInt] = anLocalInt;
	long[] ls = new long[anInt5070];
	boolean anLocalBoolean = (anInt5140 & 0x100) != 0;
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    int anLocalInt_855_ = anLocalInts[anLocalInt];
	    TextureDescriptor textureDescriptor = null;
	    int anLocalInt_856_ = 0;
	    int anLocalInt_857_ = 0;
	    int anLocalInt_858_ = 0;
	    int anLocalInt_859_ = 0;
	    if (((Class101) argument_850_).aClass147Array784 != null) {
		boolean anLocalBoolean_860_ = false;
		for (int anLocalInt_861_ = 0;
		     (anLocalInt_861_
		      < ((Class101) argument_850_).aClass147Array784.length);
		     anLocalInt_861_++) {
		    Class147 class147 = (((Class101) argument_850_)
					 .aClass147Array784[anLocalInt_861_]);
		    if (anLocalInt_855_ == ((Class147) class147).anInt1115) {
			Class125 class125
			    = Node_Sub31_Sub4.method887((byte) 113,
                    (((Class147)
                            class147)
                            .anInt1118));
			if (((Class125) class125).aBoolean1016)
			    anLocalBoolean_860_ = true;
			if (((Class125) class125).anInt1014 != -1) {
			    TextureDescriptor textureDescriptor_862_
				= textureSource.getDescriptor((((Class125) class125).anInt1014), true);
			    if (((TextureDescriptor) textureDescriptor_862_).anInt830 == 2)
				aBoolean5131 = true;
			}
		    }
		}
		if (anLocalBoolean_860_)
		    ls[anLocalInt] = 9223372036854775807L;
	    }
	    int anLocalInt_863_ = -1;
	    if (((Class101) argument_850_).aShortArray815 != null) {
		anLocalInt_863_ = (((Class101) argument_850_).aShortArray815
				   [anLocalInt_855_]);
		if (anLocalInt_863_ != -1) {
		    textureDescriptor = textureSource.getDescriptor(anLocalInt_863_ & 0xffff, true);
		    if ((argument_854_ & 0x40) == 0
			|| !((TextureDescriptor) textureDescriptor).aBoolean836) {
			anLocalInt_858_ = ((TextureDescriptor) textureDescriptor).aByte834;
			anLocalInt_859_ = ((TextureDescriptor) textureDescriptor).aByte842;
		    } else
			anLocalInt_863_ = -1;
		}
	    }
	    boolean anLocalBoolean_864_
		= ((aByteArray5105 != null
		    && aByteArray5105[anLocalInt_855_] != 0)
		   || textureDescriptor != null && ((TextureDescriptor) textureDescriptor).anInt830 == 2);
	    if ((anLocalBoolean || anLocalBoolean_864_)
		&& aByteArray5059 != null)
		anLocalInt_856_ += aByteArray5059[anLocalInt_855_] << 17;
	    if (anLocalBoolean_864_)
		anLocalInt_856_ += 65536;
	    anLocalInt_856_ += (anLocalInt_858_ & 0xff) << 8;
	    anLocalInt_856_ += anLocalInt_859_ & 0xff;
	    anLocalInt_857_ += (anLocalInt_863_ & 0xffff) << 16;
	    anLocalInt_857_ += anLocalInt & 0xffff;
	    ls[anLocalInt]
		= ((long) anLocalInt_856_ << 32) + (long) anLocalInt_857_;
	    aBoolean5131 |= anLocalBoolean_864_;
	}
	Class62_Sub16.method1419(anLocalInts, (byte) -68, ls);
	if (((Class101) argument_850_).aClass147Array784 != null) {
	    anInt5069 = ((Class101) argument_850_).aClass147Array784.length;
	    aClass35Array5092 = new Class35[anInt5069];
	    aClass205Array5066 = new Class205[anInt5069];
	    for (int anLocalInt = 0;
		 (anLocalInt
		  < ((Class101) argument_850_).aClass147Array784.length);
		 anLocalInt++) {
		Class147 class147
		    = ((Class101) argument_850_).aClass147Array784[anLocalInt];
		Class125 class125
		    = Node_Sub31_Sub4.method887((byte) 113,
                (((Class147) class147)
                        .anInt1118));
		int anLocalInt_865_
		    = ((HslToRgb.table2
			[(((Class101) argument_850_).aShortArray783
			  [((Class147) class147).anInt1115]) & 0xffff])
		       & 0xffffff);
		anLocalInt_865_
		    = (anLocalInt_865_
		       | (255
			  - (((Class101) argument_850_).aByteArray816 != null
			     ? (((Class101) argument_850_).aByteArray816
				[((Class147) class147).anInt1115]) & 0xff
			     : 0)) << 24);
		aClass35Array5092[anLocalInt]
		    = new Class35(((Class147) class147).anInt1115,
				  (((Class101) argument_850_).aShortArray798
				   [((Class147) class147).anInt1115]),
				  (((Class101) argument_850_).aShortArray807
				   [((Class147) class147).anInt1115]),
				  (((Class101) argument_850_).aShortArray793
				   [((Class147) class147).anInt1115]),
				  ((Class125) class125).anInt1018,
				  ((Class125) class125).anInt1019,
				  ((Class125) class125).anInt1014,
				  ((Class125) class125).anInt1017,
				  ((Class125) class125).anInt1015,
				  ((Class125) class125).aBoolean1016,
				  ((Class147) class147).anInt1114);
		aClass205Array5066[anLocalInt] = new Class205(anLocalInt_865_);
	    }
	}
	aFloatArrayArray5098 = new float[anInt5070][];
	aFloatArrayArray5071 = new float[anInt5070][];
	Class358 class358
	    = Statics.method2485(argument_850_, true, anInt5070, anLocalInts);
	Class293 class293
	    = aClass_ha__5089.method2112(Thread.currentThread());
	float[] fs = ((Class293) class293).aFloatArray2444;
	boolean anLocalBoolean_866_ = false;
	for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
	    int anLocalInt_867_ = anLocalInts[anLocalInt];
	    int anLocalInt_868_;
	    if (((Class101) argument_850_).aByteArray818 == null)
		anLocalInt_868_ = -1;
	    else
		anLocalInt_868_ = (((Class101) argument_850_).aByteArray818
				   [anLocalInt_867_]);
	    int anLocalInt_869_
		= (((Class101) argument_850_).aShortArray815 == null ? (int) -1
		   : (((Class101) argument_850_).aShortArray815
		      [anLocalInt_867_]));
	    if (anLocalInt_869_ != -1 && (argument_854_ & 0x40) != 0) {
		TextureDescriptor textureDescriptor
		    = textureSource.getDescriptor(anLocalInt_869_ & 0xffff, true);
		if (((TextureDescriptor) textureDescriptor).aBoolean836)
		    anLocalInt_869_ = -1;
	    }
	    if (anLocalInt_869_ != -1) {
		anLocalBoolean_866_ = true;
		float[] fs_870_
		    = aFloatArrayArray5098[anLocalInt_867_] = new float[3];
		float[] fs_871_
		    = aFloatArrayArray5071[anLocalInt_867_] = new float[3];
		boolean anLocalBoolean_872_ = false;
		if (anLocalInt_868_ == -1) {
		    fs_870_[0] = 0.0F;
		    fs_871_[0] = 1.0F;
		    fs_870_[1] = 1.0F;
		    fs_871_[1] = 1.0F;
		    fs_870_[2] = 0.0F;
		    fs_871_[2] = 0.0F;
		} else {
		    anLocalInt_868_ &= 0xff;
		    byte anLocalInt_873_ = (((Class101) argument_850_)
					    .aByteArray800[anLocalInt_868_]);
		    if (anLocalInt_873_ == 0) {
			short anLocalInt_874_
			    = aShortArray5095[anLocalInt_867_];
			short anLocalInt_875_
			    = aShortArray5112[anLocalInt_867_];
			short anLocalInt_876_
			    = aShortArray5110[anLocalInt_867_];
			short anLocalInt_877_
			    = (((Class101) argument_850_).aShortArray821
			       [anLocalInt_868_]);
			short anLocalInt_878_
			    = (((Class101) argument_850_).aShortArray803
			       [anLocalInt_868_]);
			short anLocalInt_879_
			    = (((Class101) argument_850_).aShortArray799
			       [anLocalInt_868_]);
			float f = (float) anIntArray5124[anLocalInt_877_];
			float f_880_ = (float) anIntArray5130[anLocalInt_877_];
			float f_881_ = (float) anIntArray5075[anLocalInt_877_];
			float f_882_
			    = (float) anIntArray5124[anLocalInt_878_] - f;
			float f_883_
			    = (float) anIntArray5130[anLocalInt_878_] - f_880_;
			float f_884_
			    = (float) anIntArray5075[anLocalInt_878_] - f_881_;
			float f_885_
			    = (float) anIntArray5124[anLocalInt_879_] - f;
			float f_886_
			    = (float) anIntArray5130[anLocalInt_879_] - f_880_;
			float f_887_
			    = (float) anIntArray5075[anLocalInt_879_] - f_881_;
			float f_888_
			    = (float) anIntArray5124[anLocalInt_874_] - f;
			float f_889_
			    = (float) anIntArray5130[anLocalInt_874_] - f_880_;
			float f_890_
			    = (float) anIntArray5075[anLocalInt_874_] - f_881_;
			float f_891_
			    = (float) anIntArray5124[anLocalInt_875_] - f;
			float f_892_
			    = (float) anIntArray5130[anLocalInt_875_] - f_880_;
			float f_893_
			    = (float) anIntArray5075[anLocalInt_875_] - f_881_;
			float f_894_
			    = (float) anIntArray5124[anLocalInt_876_] - f;
			float f_895_
			    = (float) anIntArray5130[anLocalInt_876_] - f_880_;
			float f_896_
			    = (float) anIntArray5075[anLocalInt_876_] - f_881_;
			float f_897_ = f_883_ * f_887_ - f_884_ * f_886_;
			float f_898_ = f_884_ * f_885_ - f_882_ * f_887_;
			float f_899_ = f_882_ * f_886_ - f_883_ * f_885_;
			float f_900_ = f_886_ * f_899_ - f_887_ * f_898_;
			float f_901_ = f_887_ * f_897_ - f_885_ * f_899_;
			float f_902_ = f_885_ * f_898_ - f_886_ * f_897_;
			float f_903_
			    = 1.0F / (f_900_ * f_882_ + f_901_ * f_883_
				      + f_902_ * f_884_);
			fs_870_[0] = (f_900_ * f_888_ + f_901_ * f_889_
				      + f_902_ * f_890_) * f_903_;
			fs_870_[1] = (f_900_ * f_891_ + f_901_ * f_892_
				      + f_902_ * f_893_) * f_903_;
			fs_870_[2] = (f_900_ * f_894_ + f_901_ * f_895_
				      + f_902_ * f_896_) * f_903_;
			f_900_ = f_883_ * f_899_ - f_884_ * f_898_;
			f_901_ = f_884_ * f_897_ - f_882_ * f_899_;
			f_902_ = f_882_ * f_898_ - f_883_ * f_897_;
			f_903_ = 1.0F / (f_900_ * f_885_ + f_901_ * f_886_
					 + f_902_ * f_887_);
			fs_871_[0] = (f_900_ * f_888_ + f_901_ * f_889_
				      + f_902_ * f_890_) * f_903_;
			fs_871_[1] = (f_900_ * f_891_ + f_901_ * f_892_
				      + f_902_ * f_893_) * f_903_;
			fs_871_[2] = (f_900_ * f_894_ + f_901_ * f_895_
				      + f_902_ * f_896_) * f_903_;
		    } else {
			short anLocalInt_904_
			    = aShortArray5095[anLocalInt_867_];
			short anLocalInt_905_
			    = aShortArray5112[anLocalInt_867_];
			short anLocalInt_906_
			    = aShortArray5110[anLocalInt_867_];
			int anLocalInt_907_
			    = (((Class358) class358).anIntArray3034
			       [anLocalInt_868_]);
			int anLocalInt_908_
			    = (((Class358) class358).anIntArray3035
			       [anLocalInt_868_]);
			int anLocalInt_909_
			    = (((Class358) class358).anIntArray3030
			       [anLocalInt_868_]);
			float[] fs_910_
			    = (((Class358) class358).aFloatArrayArray3032
			       [anLocalInt_868_]);
			byte anLocalInt_911_
			    = (((Class101) argument_850_).aByteArray786
			       [anLocalInt_868_]);
			float f = ((float) (((Class101) argument_850_)
					    .anIntArray819[anLocalInt_868_])
				   / 256.0F);
			if (anLocalInt_873_ == 1) {
			    float f_912_
				= ((float) (((Class101) argument_850_)
					    .anIntArray791[anLocalInt_868_])
				   / 1024.0F);
			    Node_Sub16.method699
                        (anLocalInt_907_, fs_910_, anLocalInt_911_, f,
                                anLocalInt_908_,
                                anIntArray5130[anLocalInt_904_], f_912_,
                                anLocalInt_909_,
                                anIntArray5075[anLocalInt_904_], fs,
                                anIntArray5124[anLocalInt_904_], -110);
			    fs_870_[0] = fs[0];
			    fs_871_[0] = fs[1];
			    Node_Sub16.method699
                        (anLocalInt_907_, fs_910_, anLocalInt_911_, f,
                                anLocalInt_908_,
                                anIntArray5130[anLocalInt_905_], f_912_,
                                anLocalInt_909_,
                                anIntArray5075[anLocalInt_905_], fs,
                                anIntArray5124[anLocalInt_905_], -118);
			    fs_870_[1] = fs[0];
			    fs_871_[1] = fs[1];
			    Node_Sub16.method699
                        (anLocalInt_907_, fs_910_, anLocalInt_911_, f,
                                anLocalInt_908_,
                                anIntArray5130[anLocalInt_906_], f_912_,
                                anLocalInt_909_,
                                anIntArray5075[anLocalInt_906_], fs,
                                anIntArray5124[anLocalInt_906_], -116);
			    fs_870_[2] = fs[0];
			    fs_871_[2] = fs[1];
			    float f_913_ = f_912_ / 2.0F;
			    if ((anLocalInt_911_ & 0x1) == 0) {
				if (fs_870_[1] - fs_870_[0] > f_913_)
				    fs_870_[1] -= f_912_;
				else if (fs_870_[0] - fs_870_[1] > f_913_)
				    fs_870_[1] += f_912_;
				if (fs_870_[2] - fs_870_[0] > f_913_)
				    fs_870_[2] -= f_912_;
				else if (fs_870_[0] - fs_870_[2] > f_913_)
				    fs_870_[2] += f_912_;
			    } else {
				if (fs_871_[1] - fs_871_[0] > f_913_)
				    fs_871_[1] -= f_912_;
				else if (fs_871_[0] - fs_871_[1] > f_913_)
				    fs_871_[1] += f_912_;
				if (fs_871_[2] - fs_871_[0] > f_913_)
				    fs_871_[2] -= f_912_;
				else if (fs_871_[0] - fs_871_[2] > f_913_)
				    fs_871_[2] += f_912_;
			    }
			} else if (anLocalInt_873_ == 2) {
			    float f_914_
				= ((float) (((Class101) argument_850_)
					    .anIntArray805[anLocalInt_868_])
				   / 256.0F);
			    float f_915_
				= ((float) (((Class101) argument_850_)
					    .anIntArray801[anLocalInt_868_])
				   / 256.0F);
			    int anLocalInt_916_
				= (anIntArray5124[anLocalInt_905_]
				   - anIntArray5124[anLocalInt_904_]);
			    int anLocalInt_917_
				= (anIntArray5130[anLocalInt_905_]
				   - anIntArray5130[anLocalInt_904_]);
			    int anLocalInt_918_
				= (anIntArray5075[anLocalInt_905_]
				   - anIntArray5075[anLocalInt_904_]);
			    int anLocalInt_919_
				= (anIntArray5124[anLocalInt_906_]
				   - anIntArray5124[anLocalInt_904_]);
			    int anLocalInt_920_
				= (anIntArray5130[anLocalInt_906_]
				   - anIntArray5130[anLocalInt_904_]);
			    int anLocalInt_921_
				= (anIntArray5075[anLocalInt_906_]
				   - anIntArray5075[anLocalInt_904_]);
			    int anLocalInt_922_
				= (anLocalInt_917_ * anLocalInt_921_
				   - anLocalInt_920_ * anLocalInt_918_);
			    int anLocalInt_923_
				= (anLocalInt_918_ * anLocalInt_919_
				   - anLocalInt_921_ * anLocalInt_916_);
			    int anLocalInt_924_
				= (anLocalInt_916_ * anLocalInt_920_
				   - anLocalInt_919_ * anLocalInt_917_);
			    float f_925_
				= 64.0F / (float) (((Class101) argument_850_)
						   .anIntArray804
						   [anLocalInt_868_]);
			    float f_926_
				= 64.0F / (float) (((Class101) argument_850_)
						   .anIntArray811
						   [anLocalInt_868_]);
			    float f_927_
				= 64.0F / (float) (((Class101) argument_850_)
						   .anIntArray791
						   [anLocalInt_868_]);
			    float f_928_
				= (((float) anLocalInt_922_ * fs_910_[0]
				    + (float) anLocalInt_923_ * fs_910_[1]
				    + (float) anLocalInt_924_ * fs_910_[2])
				   / f_925_);
			    float f_929_
				= (((float) anLocalInt_922_ * fs_910_[3]
				    + (float) anLocalInt_923_ * fs_910_[4]
				    + (float) anLocalInt_924_ * fs_910_[5])
				   / f_926_);
			    float f_930_
				= (((float) anLocalInt_922_ * fs_910_[6]
				    + (float) anLocalInt_923_ * fs_910_[7]
				    + (float) anLocalInt_924_ * fs_910_[8])
				   / f_927_);
			    int anLocalInt_931_
				= Class60.method1337(f_928_, f_929_, f_930_,
						     -12855);
			    Class92.method1689(anLocalInt_931_, fs,
					       anLocalInt_911_,
					       anLocalInt_908_,
					       anLocalInt_909_,
					       anIntArray5124[anLocalInt_904_],
					       anLocalInt_907_, 0, fs_910_,
					       f_915_,
					       anIntArray5075[anLocalInt_904_],
					       anIntArray5130[anLocalInt_904_],
					       f, f_914_);
			    fs_870_[0] = fs[0];
			    fs_871_[0] = fs[1];
			    Class92.method1689(anLocalInt_931_, fs,
					       anLocalInt_911_,
					       anLocalInt_908_,
					       anLocalInt_909_,
					       anIntArray5124[anLocalInt_905_],
					       anLocalInt_907_, 0, fs_910_,
					       f_915_,
					       anIntArray5075[anLocalInt_905_],
					       anIntArray5130[anLocalInt_905_],
					       f, f_914_);
			    fs_870_[1] = fs[0];
			    fs_871_[1] = fs[1];
			    Class92.method1689(anLocalInt_931_, fs,
					       anLocalInt_911_,
					       anLocalInt_908_,
					       anLocalInt_909_,
					       anIntArray5124[anLocalInt_906_],
					       anLocalInt_907_, 0, fs_910_,
					       f_915_,
					       anIntArray5075[anLocalInt_906_],
					       anIntArray5130[anLocalInt_906_],
					       f, f_914_);
			    fs_870_[2] = fs[0];
			    fs_871_[2] = fs[1];
			} else if (anLocalInt_873_ == 3) {
			    Class5.method226(fs, anLocalInt_907_,
					     anIntArray5124[anLocalInt_904_],
					     anLocalInt_908_,
					     anIntArray5075[anLocalInt_904_],
					     anIntArray5130[anLocalInt_904_],
					     fs_910_, anLocalInt_909_, true,
					     anLocalInt_911_, f);
			    fs_870_[0] = fs[0];
			    fs_871_[0] = fs[1];
			    Class5.method226(fs, anLocalInt_907_,
					     anIntArray5124[anLocalInt_905_],
					     anLocalInt_908_,
					     anIntArray5075[anLocalInt_905_],
					     anIntArray5130[anLocalInt_905_],
					     fs_910_, anLocalInt_909_, true,
					     anLocalInt_911_, f);
			    fs_870_[1] = fs[0];
			    fs_871_[1] = fs[1];
			    Class5.method226(fs, anLocalInt_907_,
					     anIntArray5124[anLocalInt_906_],
					     anLocalInt_908_,
					     anIntArray5075[anLocalInt_906_],
					     anIntArray5130[anLocalInt_906_],
					     fs_910_, anLocalInt_909_, true,
					     anLocalInt_911_, f);
			    fs_870_[2] = fs[0];
			    fs_871_[2] = fs[1];
			    if ((anLocalInt_911_ & 0x1) == 0) {
				if (fs_870_[1] - fs_870_[0] > 0.5F)
				    fs_870_[1]--;
				else if (fs_870_[0] - fs_870_[1] > 0.5F)
				    fs_870_[1]++;
				if (fs_870_[2] - fs_870_[0] > 0.5F)
				    fs_870_[2]--;
				else if (fs_870_[0] - fs_870_[2] > 0.5F)
				    fs_870_[2]++;
			    } else {
				if (fs_871_[1] - fs_871_[0] > 0.5F)
				    fs_871_[1]--;
				else if (fs_871_[0] - fs_871_[1] > 0.5F)
				    fs_871_[1]++;
				if (fs_871_[2] - fs_871_[0] > 0.5F)
				    fs_871_[2]--;
				else if (fs_871_[0] - fs_871_[2] > 0.5F)
				    fs_871_[2]++;
			    }
			}
		    }
		}
	    }
	}
	if (!anLocalBoolean_866_)
	    aFloatArrayArray5098 = aFloatArrayArray5071 = null;
	if (((Class101) argument_850_).anIntArray796 != null
	    && (anInt5140 & 0x20) != 0)
	    anIntArrayArray5086 = argument_850_.method1743(0, true);
	if (((Class101) argument_850_).anIntArray809 != null
	    && (anInt5140 & 0x180) != 0)
	    anIntArrayArray5067 = argument_850_.method1744((byte) -56);
	if (((Class101) argument_850_).aClass147Array784 != null
	    && (anInt5140 & 0x400) != 0)
	    anIntArrayArray5139 = argument_850_.method1737(-126);
	if (((Class101) argument_850_).aShortArray815 != null) {
	    aShortArray5104 = new short[anInt5070];
	    boolean anLocalBoolean_932_ = false;
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++) {
		short anLocalInt_933_
		    = ((Class101) argument_850_).aShortArray815[anLocalInt];
		if (anLocalInt_933_ != -1) {
		    TextureDescriptor textureDescriptor
			= ((GraphicsToolkit) aClass_ha__5089)
			      .textureSource
			      .getDescriptor(anLocalInt_933_, true);
		    if ((argument_854_ & 0x40) == 0
			|| !((TextureDescriptor) textureDescriptor).aBoolean836) {
			aShortArray5104[anLocalInt] = anLocalInt_933_;
			anLocalBoolean_932_ = true;
			if (((TextureDescriptor) textureDescriptor).anInt830 == 2)
			    aBoolean5131 = true;
			if (((TextureDescriptor) textureDescriptor).aByte845 != 0
			    || ((TextureDescriptor) textureDescriptor).aByte849 != 0)
			    aBoolean5097 = true;
		    } else
			aShortArray5104[anLocalInt] = (short) -1;
		} else
		    aShortArray5104[anLocalInt] = (short) -1;
	    }
	    if (!anLocalBoolean_932_)
		aShortArray5104 = null;
	} else
	    aShortArray5104 = null;
	if (aBoolean5131 || aClass35Array5092 != null) {
	    aShortArray5062 = new short[anInt5070];
	    for (int anLocalInt = 0; anLocalInt < anInt5070; anLocalInt++)
		aShortArray5062[anLocalInt] = (short) anLocalInts[anLocalInt];
	}
    }
}
