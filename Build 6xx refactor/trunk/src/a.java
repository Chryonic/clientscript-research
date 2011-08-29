/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class a implements Interface3
{
    private i anI3444;
    long aLong3445;
    private i anI3446;
    private i anI3447;
    private i anI3448;
    private i anI3449;
    private i anI3450;
    private i anI3451;
    Runnable aRunnable3452;
    private i anI3453;
    private i anI3454;
    private NativeToolkit anNativeToolkit3455;
    private i anI3456;
    
    private final native void M(long argument_0_);
    
    final void method143(Class167 argument_1_, Class167 argument_2_,
			 int argument_3_, int argument_4_, int argument_5_,
			 boolean argument_6_) {
	r(((a) this).aLong3445, ((i) (i) argument_1_).aLong3458,
	  ((i) (i) argument_2_).aLong3458, argument_3_, argument_4_,
	  argument_5_, argument_6_);
    }
    
    final void method144(Class_s argument_7_, int argument_8_, int argument_9_,
			 int argument_10_, int argument_11_, int argument_12_,
			 int argument_13_, int argument_14_,
			 boolean[][] argument_15_) {
	ta(((a) this).aLong3445, ((t) (t) argument_7_).aLong3497, argument_8_,
	   argument_9_, argument_10_, argument_11_, argument_12_, argument_13_,
	   argument_14_, argument_15_);
    }
    
    private final native void O(long argument_16_, GraphicsToolkit argument_17_,
				int[] argument_18_, int[] argument_19_,
				int[] argument_20_, short[] argument_21_,
				int argument_22_);
    
    private final native void na
	(long argument_23_, GraphicsToolkit argument_24_, int argument_25_,
	 int argument_26_, int argument_27_, int argument_28_,
	 int argument_29_, int argument_30_, int argument_31_);
    
    private final native void H(long argument_32_, long argument_33_,
				int argument_34_, int argument_35_);
    
    final void method145(Class_s argument_36_, int argument_37_,
			 int argument_38_) {
	H(((a) this).aLong3445, ((t) (t) argument_36_).aLong3497, argument_37_,
	  argument_38_);
    }
    
    private final native void f(long argument_39_, long argument_40_,
				long argument_41_, int[] argument_42_,
				int argument_43_, int argument_44_);
    
    private final native void E(long argument_45_, boolean argument_46_);
    
    private final native boolean n(long argument_47_, long argument_48_,
				   int argument_49_, int argument_50_,
				   long argument_51_, boolean argument_52_,
				   int argument_53_);
    
    final void method146() {
	((a) this).aRunnable3452 = Thread.currentThread();
	method155();
    }
    
    public final void w(boolean argument_54_) {
	E(((a) this).aLong3445, argument_54_);
    }
    
    final void method147() {
	((a) this).aRunnable3452 = null;
	method153();
    }
    
    protected final void finalize() {
	if (((a) this).aLong3445 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    final Class167 method148(i argument_55_, byte argument_56_,
			     int argument_57_, boolean argument_58_) {
	i var_i;
	i var_i_59_;
	if (argument_56_ == 1) {
	    var_i = anI3451;
	    var_i_59_ = anI3453;
	} else if (argument_56_ == 2) {
	    var_i = anI3449;
	    var_i_59_ = anI3456;
	} else if (argument_56_ == 3) {
	    var_i = anI3448;
	    var_i_59_ = anI3446;
	} else if (argument_56_ == 4) {
	    var_i = anI3450;
	    var_i_59_ = anI3447;
	} else if (argument_56_ == 5) {
	    var_i = anI3454;
	    var_i_59_ = anI3444;
	} else
	    var_i_59_ = var_i = new i(anNativeToolkit3455);
	argument_55_.ZA(var_i_59_, var_i, argument_57_, argument_56_ != 0,
			argument_58_);
	((i) var_i_59_).aClass38Array3460
	    = ((i) argument_55_).aClass38Array3460;
	((i) var_i_59_).aClass185Array3459
	    = ((i) argument_55_).aClass185Array3459;
	return var_i_59_;
    }
    
    private final native void ta(long argument_60_, long argument_61_,
				 int argument_62_, int argument_63_,
				 int argument_64_, int argument_65_,
				 int argument_66_, int argument_67_,
				 int argument_68_, boolean[][] argument_69_);
    
    final void method149(Class167 argument_70_, int[] argument_71_,
			 Class350 argument_72_) {
	e(((a) this).aLong3445, ((i) (i) argument_70_).aLong3458, argument_71_,
	  ((ja) (ja) argument_72_).aLong3463);
    }
    
    private final native void e(long argument_73_, long argument_74_,
				int[] argument_75_, long argument_76_);
    
    final void method150(Class167 argument_77_, Class350 argument_78_,
			 int[] argument_79_, int argument_80_) {
	UA(((a) this).aLong3445, ((i) (i) argument_77_).aLong3458,
	   ((ja) (ja) argument_78_).aLong3463, argument_79_, argument_80_);
    }
    
    final void method151(GraphicsToolkit argument_81_, int argument_82_,
			 int argument_83_, int argument_84_, int argument_85_,
			 int argument_86_, int argument_87_,
			 int argument_88_) {
	na(((a) this).aLong3445, argument_81_, argument_82_, argument_83_,
	   argument_84_, argument_85_, argument_86_, argument_87_,
	   argument_88_);
    }
    
    final void method152(Class167 argument_89_, Class350 argument_90_,
			 int[] argument_91_, int argument_92_,
			 int argument_93_) {
	f(((a) this).aLong3445, ((i) (i) argument_89_).aLong3458,
	  ((ja) (ja) argument_90_).aLong3463, argument_91_, argument_92_,
	  argument_93_);
    }
    
    private final void method153() {
	W(((a) this).aLong3445);
    }
    
    private final native boolean R(long argument_94_, long argument_95_,
				   int argument_96_, int argument_97_,
				   long argument_98_, boolean argument_99_);
    
    final boolean method154(Class167 argument_100_, int argument_101_,
			    int argument_102_, Class350 argument_103_,
			    boolean argument_104_, int argument_105_) {
	return n(((a) this).aLong3445, ((i) (i) argument_100_).aLong3458,
		 argument_101_, argument_102_,
		 ((ja) (ja) argument_103_).aLong3463, argument_104_,
		 argument_105_);
    }
    
    private final native void HA(long argument_106_, GraphicsToolkit argument_107_,
				 int argument_108_, int argument_109_);
    
    private final void method155() {
	M(((a) this).aLong3445);
    }
    
    private final native void r(long argument_110_, long argument_111_,
				long argument_112_, int argument_113_,
				int argument_114_, int argument_115_,
				boolean argument_116_);
    
    final void method156(Class_s argument_117_, int argument_118_,
			 int argument_119_, int argument_120_) {
	Z(((a) this).aLong3445, ((t) (t) argument_117_).aLong3497,
	  argument_118_, argument_119_, argument_120_);
    }
    
    private final native void Z(long argument_121_, long argument_122_,
				int argument_123_, int argument_124_,
				int argument_125_);
    
    private final native void W(long argument_126_);
    
    final void method157(GraphicsToolkit argument_127_, int[] argument_128_,
			 int[] argument_129_, int[] argument_130_,
			 short[] argument_131_, int argument_132_) {
	O(((a) this).aLong3445, argument_127_, argument_128_, argument_129_,
	  argument_130_, argument_131_, argument_132_);
    }
    
    private final native void UA(long argument_133_, long argument_134_,
				 long argument_135_, int[] argument_136_,
				 int argument_137_);
    
    final boolean method158(Class167 argument_138_, int argument_139_,
			    int argument_140_, Class350 argument_141_,
			    boolean argument_142_) {
	return R(((a) this).aLong3445, ((i) (i) argument_138_).aLong3458,
		 argument_139_, argument_140_,
		 ((ja) (ja) argument_141_).aLong3463, argument_142_);
    }
    
    a(NativeToolkit argument_143_, int argument_144_, int argument_145_) {
	anNativeToolkit3455 = argument_143_;
	anI3453 = new i(anNativeToolkit3455);
	anI3456 = new i(anNativeToolkit3455);
	anI3446 = new i(anNativeToolkit3455);
	anI3447 = new i(anNativeToolkit3455);
	anI3444 = new i(anNativeToolkit3455);
	anI3451 = new i(anNativeToolkit3455);
	anI3449 = new i(anNativeToolkit3455);
	anI3448 = new i(anNativeToolkit3455);
	anI3450 = new i(anNativeToolkit3455);
	anI3454 = new i(anNativeToolkit3455);
	HA(((a) this).aLong3445, argument_143_, argument_144_, argument_145_);
    }
}
