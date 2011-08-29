/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class218
{
    private int anInt1532;
    private static int[] anIntArray1533;
    private static int[] anIntArray1534 = { 256, 128, 86, 64 };
    private int[] anIntArray1535;
    private int[] anIntArray1536;
    private static float[] aFloatArray1537
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    private static boolean[] aBooleanArray1538;
    private static int[] anIntArray1539;
    private int[] anIntArray1540;
    private int[] anIntArray1541;
    private int[] anIntArray1542;
    private int[][] anIntArrayArray1543;
    
    final boolean method3016() {
	boolean anLocalBoolean = Node_Sub25.method754() != 0;
	if (!anLocalBoolean)
	    return false;
	int anLocalInt = anIntArray1541.length;
	for (int anLocalInt_0_ = 0; anLocalInt_0_ < anLocalInt;
	     anLocalInt_0_++)
	    anIntArray1533[anLocalInt_0_] = anIntArray1541[anLocalInt_0_];
	int anLocalInt_1_ = anIntArray1534[anInt1532 - 1];
	int anLocalInt_2_
	    = DoublyLinkedNode_Sub51_Sub13.method1258(9761, anLocalInt_1_ - 1);
	anIntArray1539[0] = Node_Sub25.method762(anLocalInt_2_);
	anIntArray1539[1] = Node_Sub25.method762(anLocalInt_2_);
	int anLocalInt_3_ = 2;
	for (int anLocalInt_4_ = 0; anLocalInt_4_ < anIntArray1536.length;
	     anLocalInt_4_++) {
	    int anLocalInt_5_ = anIntArray1536[anLocalInt_4_];
	    int anLocalInt_6_ = anIntArray1535[anLocalInt_5_];
	    int anLocalInt_7_ = anIntArray1540[anLocalInt_5_];
	    int anLocalInt_8_ = (1 << anLocalInt_7_) - 1;
	    int anLocalInt_9_ = 0;
	    if (anLocalInt_7_ > 0)
		anLocalInt_9_
		    = Node_Sub25.aClass386Array4078
			  [anIntArray1542[anLocalInt_5_]].method4124();
	    for (int anLocalInt_10_ = 0; anLocalInt_10_ < anLocalInt_6_;
		 anLocalInt_10_++) {
		int anLocalInt_11_ = (anIntArrayArray1543[anLocalInt_5_]
				      [anLocalInt_9_ & anLocalInt_8_]);
		anLocalInt_9_ >>>= anLocalInt_7_;
		anIntArray1539[anLocalInt_3_++]
		    = anLocalInt_11_ >= 0 ? Node_Sub25
						.aClass386Array4078
						[anLocalInt_11_]
						.method4124() : 0;
	    }
	}
	return true;
    }
    
    private static final int method3017(int[] argument, int argument_12_) {
	int anLocalInt = argument[argument_12_];
	int anLocalInt_13_ = -1;
	int anLocalInt_14_ = -2147483648;
	for (int anLocalInt_15_ = 0; anLocalInt_15_ < argument_12_;
	     anLocalInt_15_++) {
	    int anLocalInt_16_ = argument[anLocalInt_15_];
	    if (anLocalInt_16_ < anLocalInt
		&& anLocalInt_16_ > anLocalInt_14_) {
		anLocalInt_13_ = anLocalInt_15_;
		anLocalInt_14_ = anLocalInt_16_;
	    }
	}
	return anLocalInt_13_;
    }
    
    public static void method3018() {
	anIntArray1534 = null;
	aFloatArray1537 = null;
	anIntArray1533 = null;
	anIntArray1539 = null;
	aBooleanArray1538 = null;
    }
    
    private final int method3019(int argument_17_, int argument_18_,
				 int argument_19_, int argument_20_,
				 int argument_21_) {
	int anLocalInt = argument_20_ - argument_18_;
	int anLocalInt_22_ = argument_19_ - argument_17_;
	int anLocalInt_23_ = anLocalInt < 0 ? -anLocalInt : anLocalInt;
	int anLocalInt_24_ = anLocalInt_23_ * (argument_21_ - argument_17_);
	int anLocalInt_25_ = anLocalInt_24_ / anLocalInt_22_;
	if (anLocalInt < 0)
	    return argument_18_ - anLocalInt_25_;
	return argument_18_ + anLocalInt_25_;
    }
    
    private final void method3020(int argument_26_, int argument_27_,
				  int argument_28_, int argument_29_,
				  float[] argument_30_, int argument_31_) {
	int anLocalInt = argument_29_ - argument_27_;
	int anLocalInt_32_ = argument_28_ - argument_26_;
	int anLocalInt_33_ = anLocalInt < 0 ? -anLocalInt : anLocalInt;
	int anLocalInt_34_ = anLocalInt / anLocalInt_32_;
	int anLocalInt_35_ = argument_27_;
	int anLocalInt_36_ = 0;
	int anLocalInt_37_
	    = anLocalInt < 0 ? anLocalInt_34_ - 1 : anLocalInt_34_ + 1;
	anLocalInt_33_ = anLocalInt_33_ - (anLocalInt_34_ < 0 ? -anLocalInt_34_
					   : anLocalInt_34_) * anLocalInt_32_;
	argument_30_[argument_26_] *= aFloatArray1537[anLocalInt_35_];
	if (argument_28_ > argument_31_)
	    argument_28_ = argument_31_;
	for (int anLocalInt_38_ = argument_26_ + 1;
	     anLocalInt_38_ < argument_28_; anLocalInt_38_++) {
	    anLocalInt_36_ += anLocalInt_33_;
	    if (anLocalInt_36_ >= anLocalInt_32_) {
		anLocalInt_36_ -= anLocalInt_32_;
		anLocalInt_35_ += anLocalInt_37_;
	    } else
		anLocalInt_35_ += anLocalInt_34_;
	    argument_30_[anLocalInt_38_] *= aFloatArray1537[anLocalInt_35_];
	}
    }
    
    private static final int method3021(int[] argument, int argument_39_) {
	int anLocalInt = argument[argument_39_];
	int anLocalInt_40_ = -1;
	int anLocalInt_41_ = 2147483647;
	for (int anLocalInt_42_ = 0; anLocalInt_42_ < argument_39_;
	     anLocalInt_42_++) {
	    int anLocalInt_43_ = argument[anLocalInt_42_];
	    if (anLocalInt_43_ > anLocalInt
		&& anLocalInt_43_ < anLocalInt_41_) {
		anLocalInt_40_ = anLocalInt_42_;
		anLocalInt_41_ = anLocalInt_43_;
	    }
	}
	return anLocalInt_40_;
    }
    
    final void method3022(float[] argument_44_, int argument_45_) {
	int anLocalInt = anIntArray1541.length;
	int anLocalInt_46_ = anIntArray1534[anInt1532 - 1];
	aBooleanArray1538[0] = aBooleanArray1538[1] = true;
	for (int anLocalInt_47_ = 2; anLocalInt_47_ < anLocalInt;
	     anLocalInt_47_++) {
	    int anLocalInt_48_ = method3017(anIntArray1533, anLocalInt_47_);
	    int anLocalInt_49_ = method3021(anIntArray1533, anLocalInt_47_);
	    int anLocalInt_50_ = method3019(anIntArray1533[anLocalInt_48_],
					    anIntArray1539[anLocalInt_48_],
					    anIntArray1533[anLocalInt_49_],
					    anIntArray1539[anLocalInt_49_],
					    anIntArray1533[anLocalInt_47_]);
	    int anLocalInt_51_ = anIntArray1539[anLocalInt_47_];
	    int anLocalInt_52_ = anLocalInt_46_ - anLocalInt_50_;
	    int anLocalInt_53_ = anLocalInt_50_;
	    int anLocalInt_54_ = ((anLocalInt_52_ < anLocalInt_53_
				   ? anLocalInt_52_ : anLocalInt_53_)
				  << 1);
	    if (anLocalInt_51_ != 0) {
		aBooleanArray1538[anLocalInt_48_]
		    = aBooleanArray1538[anLocalInt_49_] = true;
		aBooleanArray1538[anLocalInt_47_] = true;
		if (anLocalInt_51_ >= anLocalInt_54_)
		    anIntArray1539[anLocalInt_47_]
			= (anLocalInt_52_ > anLocalInt_53_
			   ? anLocalInt_51_ - anLocalInt_53_ + anLocalInt_50_
			   : (anLocalInt_50_ - anLocalInt_51_ + anLocalInt_52_
			      - 1));
		else
		    anIntArray1539[anLocalInt_47_]
			= ((anLocalInt_51_ & 0x1) != 0
			   ? anLocalInt_50_ - (anLocalInt_51_ + 1) / 2
			   : anLocalInt_50_ + anLocalInt_51_ / 2);
	    } else {
		aBooleanArray1538[anLocalInt_47_] = false;
		anIntArray1539[anLocalInt_47_] = anLocalInt_50_;
	    }
	}
	method3023(0, anLocalInt - 1);
	int anLocalInt_55_ = 0;
	int anLocalInt_56_ = anIntArray1539[0] * anInt1532;
	for (int anLocalInt_57_ = 1; anLocalInt_57_ < anLocalInt;
	     anLocalInt_57_++) {
	    if (aBooleanArray1538[anLocalInt_57_]) {
		int anLocalInt_58_ = anIntArray1533[anLocalInt_57_];
		int anLocalInt_59_
		    = anIntArray1539[anLocalInt_57_] * anInt1532;
		method3020(anLocalInt_55_, anLocalInt_56_, anLocalInt_58_,
			   anLocalInt_59_, argument_44_, argument_45_);
		if (anLocalInt_58_ >= argument_45_)
		    return;
		anLocalInt_55_ = anLocalInt_58_;
		anLocalInt_56_ = anLocalInt_59_;
	    }
	}
	float f = aFloatArray1537[anLocalInt_56_];
	for (int anLocalInt_60_ = anLocalInt_55_;
	     anLocalInt_60_ < argument_45_; anLocalInt_60_++)
	    argument_44_[anLocalInt_60_] *= f;
    }
    
    private final void method3023(int argument_61_, int argument_62_) {
	if (argument_61_ < argument_62_) {
	    int anLocalInt = argument_61_;
	    int anLocalInt_63_ = anIntArray1533[anLocalInt];
	    int anLocalInt_64_ = anIntArray1539[anLocalInt];
	    boolean anLocalBoolean = aBooleanArray1538[anLocalInt];
	    for (int anLocalInt_65_ = argument_61_ + 1;
		 anLocalInt_65_ <= argument_62_; anLocalInt_65_++) {
		int anLocalInt_66_ = anIntArray1533[anLocalInt_65_];
		if (anLocalInt_66_ < anLocalInt_63_) {
		    anIntArray1533[anLocalInt] = anLocalInt_66_;
		    anIntArray1539[anLocalInt]
			= anIntArray1539[anLocalInt_65_];
		    aBooleanArray1538[anLocalInt]
			= aBooleanArray1538[anLocalInt_65_];
		    anLocalInt++;
		    anIntArray1533[anLocalInt_65_]
			= anIntArray1533[anLocalInt];
		    anIntArray1539[anLocalInt_65_]
			= anIntArray1539[anLocalInt];
		    aBooleanArray1538[anLocalInt_65_]
			= aBooleanArray1538[anLocalInt];
		}
	    }
	    anIntArray1533[anLocalInt] = anLocalInt_63_;
	    anIntArray1539[anLocalInt] = anLocalInt_64_;
	    aBooleanArray1538[anLocalInt] = anLocalBoolean;
	    method3023(argument_61_, anLocalInt - 1);
	    method3023(anLocalInt + 1, argument_62_);
	}
    }
    
    Class218() {
	int anLocalInt = Node_Sub25.method762(16);
	if (anLocalInt != 1)
	    throw new RuntimeException();
	int anLocalInt_67_ = Node_Sub25.method762(5);
	int anLocalInt_68_ = 0;
	anIntArray1536 = new int[anLocalInt_67_];
	for (int anLocalInt_69_ = 0; anLocalInt_69_ < anLocalInt_67_;
	     anLocalInt_69_++) {
	    int anLocalInt_70_ = Node_Sub25.method762(4);
	    anIntArray1536[anLocalInt_69_] = anLocalInt_70_;
	    if (anLocalInt_70_ >= anLocalInt_68_)
		anLocalInt_68_ = anLocalInt_70_ + 1;
	}
	anIntArray1535 = new int[anLocalInt_68_];
	anIntArray1540 = new int[anLocalInt_68_];
	anIntArray1542 = new int[anLocalInt_68_];
	anIntArrayArray1543 = new int[anLocalInt_68_][];
	for (int anLocalInt_71_ = 0; anLocalInt_71_ < anLocalInt_68_;
	     anLocalInt_71_++) {
	    anIntArray1535[anLocalInt_71_] = Node_Sub25.method762(3) + 1;
	    int anLocalInt_72_
		= anIntArray1540[anLocalInt_71_] = Node_Sub25.method762(2);
	    if (anLocalInt_72_ != 0)
		anIntArray1542[anLocalInt_71_] = Node_Sub25.method762(8);
	    anLocalInt_72_ = 1 << anLocalInt_72_;
	    int[] anLocalInts = new int[anLocalInt_72_];
	    anIntArrayArray1543[anLocalInt_71_] = anLocalInts;
	    for (int anLocalInt_73_ = 0; anLocalInt_73_ < anLocalInt_72_;
		 anLocalInt_73_++)
		anLocalInts[anLocalInt_73_] = Node_Sub25.method762(8) - 1;
	}
	anInt1532 = Node_Sub25.method762(2) + 1;
	int anLocalInt_74_ = Node_Sub25.method762(4);
	int anLocalInt_75_ = 2;
	for (int anLocalInt_76_ = 0; anLocalInt_76_ < anLocalInt_67_;
	     anLocalInt_76_++)
	    anLocalInt_75_ += anIntArray1535[anIntArray1536[anLocalInt_76_]];
	anIntArray1541 = new int[anLocalInt_75_];
	anIntArray1541[0] = 0;
	anIntArray1541[1] = 1 << anLocalInt_74_;
	anLocalInt_75_ = 2;
	for (int anLocalInt_77_ = 0; anLocalInt_77_ < anLocalInt_67_;
	     anLocalInt_77_++) {
	    int anLocalInt_78_ = anIntArray1536[anLocalInt_77_];
	    for (int anLocalInt_79_ = 0;
		 anLocalInt_79_ < anIntArray1535[anLocalInt_78_];
		 anLocalInt_79_++)
		anIntArray1541[anLocalInt_75_++]
		    = Node_Sub25.method762(anLocalInt_74_);
	}
	if (anIntArray1533 == null || anIntArray1533.length < anLocalInt_75_) {
	    anIntArray1533 = new int[anLocalInt_75_];
	    anIntArray1539 = new int[anLocalInt_75_];
	    aBooleanArray1538 = new boolean[anLocalInt_75_];
	}
    }
}
