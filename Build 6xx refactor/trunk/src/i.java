/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class i extends Class167 implements Interface3
{
    long aLong3458;
    Class185[] aClass185Array3459;
    Class38[] aClass38Array3460;
    private ya aYa3461;
    private NativeToolkit anNativeToolkit3462;
    
    final boolean method2645(int argument_0_, int argument_1_,
			     Class350 argument_2_, boolean argument_3_,
			     int argument_4_) {
	return anNativeToolkit3462.method2357().method158(this, argument_0_, argument_1_,
					       argument_2_, argument_3_);
    }
    
    final void method2640(Class350 argument_5_, DoublyLinkedNodeP2_Sub9 argument_6_,
			  int argument_7_) {
	if (argument_6_ == null)
	    anNativeToolkit3462.method2357().method150(this, argument_5_, null,
					    argument_7_);
	else {
	    NativeToolkit.anIntArray3471[5] = 0;
	    anNativeToolkit3462.method2357().method150(this, argument_5_,
					    NativeToolkit.anIntArray3471, argument_7_);
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).anInt4588 = NativeToolkit.anIntArray3471[0];
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).anInt4589 = NativeToolkit.anIntArray3471[1];
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).anInt4590 = NativeToolkit.anIntArray3471[2];
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).anInt4587 = NativeToolkit.anIntArray3471[3];
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).anInt4586 = NativeToolkit.anIntArray3471[4];
	    ((DoublyLinkedNodeP2_Sub9) argument_6_).aBoolean4591
		= NativeToolkit.anIntArray3471[5] != 0;
	}
    }
    
    final void method2649(int argument_8_, int argument_9_, int argument_10_,
			  int argument_11_) {
	/* empty */
    }
    
    final native int HA();
    
    public final native void w(boolean argument_12_);
    
    final native void s(int argument_13_);
    
    final void method2656(Class350 argument_14_) {
	method2661(NativeToolkit.anIntArray3482, argument_14_);
	int anLocalInt = 0;
	if (((i) this).aClass38Array3460 != null) {
	    for (int anLocalInt_15_ = 0;
		 anLocalInt_15_ < ((i) this).aClass38Array3460.length;
		 anLocalInt_15_++) {
		Class38 class38 = ((i) this).aClass38Array3460[anLocalInt_15_];
		((Class38) class38).anInt282 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt279 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt280 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt283 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt276 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt289 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt277 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt288 = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class38) class38).anInt290 = NativeToolkit.anIntArray3482[anLocalInt++];
	    }
	}
	if (((i) this).aClass185Array3459 != null) {
	    for (int anLocalInt_16_ = 0;
		 anLocalInt_16_ < ((i) this).aClass185Array3459.length;
		 anLocalInt_16_++) {
		Class185 class185
		    = ((i) this).aClass185Array3459[anLocalInt_16_];
		Class185 class185_17_ = class185;
		if (((Class185) class185).aClass185_1387 != null)
		    class185_17_ = ((Class185) class185).aClass185_1387;
		if (((Class185) class185).aClass350_1383 != null)
		    ((Class185) class185).aClass350_1383
			.method3838(argument_14_);
		else
		    ((Class185) class185).aClass350_1383
			= argument_14_.method3826();
		((Class185) class185_17_).anInt1384
		    = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class185) class185_17_).anInt1388
		    = NativeToolkit.anIntArray3482[anLocalInt++];
		((Class185) class185_17_).anInt1385
		    = NativeToolkit.anIntArray3482[anLocalInt++];
	    }
	}
    }
    
    final void method2660(Class167 argument_18_, int argument_19_,
			  int argument_20_, int argument_21_,
			  boolean argument_22_) {
	anNativeToolkit3462.method2357().method143(this, argument_18_, argument_19_,
					argument_20_, argument_21_,
					argument_22_);
    }
    
    final Class167 method2651(byte argument_23_, int argument_24_,
			      boolean argument_25_) {
	return anNativeToolkit3462.method2357().method148(this, argument_23_,
					       argument_24_, argument_25_);
    }
    
    final native void aa(short argument_26_, short argument_27_);
    
    final void method2646(Class350 argument_28_, DoublyLinkedNodeP2_Sub9 argument_29_,
			  int argument_30_, int argument_31_) {
	if (argument_29_ == null)
	    anNativeToolkit3462.method2357().method152(this, argument_28_, null,
					    argument_30_, argument_31_);
	else {
	    NativeToolkit.anIntArray3471[5] = 0;
	    anNativeToolkit3462.method2357().method152(this, argument_28_,
					    NativeToolkit.anIntArray3471, argument_30_,
					    argument_31_);
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).anInt4588 = NativeToolkit.anIntArray3471[0];
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).anInt4589 = NativeToolkit.anIntArray3471[1];
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).anInt4590 = NativeToolkit.anIntArray3471[2];
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).anInt4587 = NativeToolkit.anIntArray3471[3];
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).anInt4586 = NativeToolkit.anIntArray3471[4];
	    ((DoublyLinkedNodeP2_Sub9) argument_29_).aBoolean4591
		= NativeToolkit.anIntArray3471[5] != 0;
	}
    }
    
    protected final void finalize() {
	if (((i) this).aLong3458 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    final void method2647() {
	if (((NativeToolkit) anNativeToolkit3462).anInt3489 > 1) {
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
    
    private final void method2661(int[] argument_32_, Class350 argument_33_) {
	anNativeToolkit3462.method2357().method149(this, argument_32_, argument_33_);
    }
    
    final native void I(int argument_34_, int[] argument_35_, int argument_36_,
			int argument_37_, int argument_38_,
			boolean argument_39_, int argument_40_,
			int[] argument_41_);
    
    final native int da();
    
    final native void wa();
    
    final native void ia(short argument_42_, short argument_43_);
    
    final native void k(int argument_44_);
    
    final Class185[] method2655() {
	return ((i) this).aClass185Array3459;
    }
    
    final native int WA();
    
    private final native void K(long argument_45_, int argument_46_,
				boolean argument_47_);
    
    final boolean method2637(int argument_48_, int argument_49_,
			     Class350 argument_50_, boolean argument_51_,
			     int argument_52_, int argument_53_) {
	return anNativeToolkit3462.method2357().method154(this, argument_48_,
					       argument_49_, argument_50_,
					       argument_51_, argument_53_);
    }
    
    final void method2659(int argument_54_, int[] argument_55_,
			  int argument_56_, int argument_57_, int argument_58_,
			  int argument_59_, boolean argument_60_) {
	l(((i) this).aLong3458, argument_54_, argument_55_, argument_56_,
	  argument_57_, argument_58_, argument_59_, argument_60_);
    }
    
    final native void H(int argument_61_, int argument_62_, int argument_63_);
    
    private final native void R
	(NativeToolkit argument_64_, ya argument_65_, int argument_66_, int argument_67_,
	 int[] argument_68_, int[] argument_69_, int[] argument_70_,
	 int[] argument_71_, short[] argument_72_, int argument_73_,
	 short[] argument_74_, short[] argument_75_, short[] argument_76_,
	 byte[] argument_77_, byte[] argument_78_, byte[] argument_79_,
	 byte[] argument_80_, short[] argument_81_, short[] argument_82_,
	 int[] argument_83_, byte argument_84_, short[] argument_85_,
	 int argument_86_, byte[] argument_87_, short[] argument_88_,
	 short[] argument_89_, short[] argument_90_, int[] argument_91_,
	 int[] argument_92_, int[] argument_93_, byte[] argument_94_,
	 byte[] argument_95_, int[] argument_96_, int[] argument_97_,
	 int[] argument_98_, int[] argument_99_, int argument_100_,
	 int argument_101_, int argument_102_, int argument_103_,
	 int argument_104_, int argument_105_, int[] argument_106_);
    
    final native int na();
    
    final native int RA();
    
    final native boolean r();
    
    final native void O(int argument_107_, int argument_108_,
			int argument_109_);
    
    private final native void oa(NativeToolkit argument_110_);
    
    final void method2643(Class350 argument_111_, int argument_112_,
			  boolean argument_113_) {
	K(((ja) (ja) argument_111_).aLong3463, argument_112_, argument_113_);
    }
    
    final native void p(int argument_114_, int argument_115_,
			Class_s argument_116_, Class_s argument_117_,
			int argument_118_, int argument_119_,
			int argument_120_);
    
    final native tia_sub_35DoublyLinked ba(tia_sub_35DoublyLinked argument_121_);
    
    private final native void l(long argument_122_, int argument_123_,
				int[] argument_124_, int argument_125_,
				int argument_126_, int argument_127_,
				int argument_128_, boolean argument_129_);
    
    final native void ZA(i argument_130_, i argument_131_, int argument_132_,
			 boolean argument_133_, boolean argument_134_);
    
    final native int ua();
    
    final native boolean F();
    
    final native int V();
    
    final void method2654() {
	if (((NativeToolkit) anNativeToolkit3462).anInt3489 > 1) {
	    synchronized (this) {
		((Class167) this).aBoolean1220 = false;
		this.notifyAll();
	    }
	}
    }
    
    final native void a(int argument_135_);
    
    final native int G();
    
    final native void FA(int argument_136_);
    
    final native boolean NA();
    
    final boolean method2653() {
	return true;
    }
    
    final native void P(int argument_137_, int argument_138_,
			int argument_139_, int argument_140_);
    
    final native int fa();
    
    final native void VA(int argument_141_);
    
    final void method2652() {
	/* empty */
    }
    
    final native int EA();
    
    i(NativeToolkit argument_142_, ya argument_143_, Class101 argument_144_,
      int argument_145_, int argument_146_, int argument_147_,
      int argument_148_) {
	anNativeToolkit3462 = argument_142_;
	aYa3461 = argument_143_;
	((i) this).aClass38Array3460
	    = ((Class101) argument_144_).aClass38Array787;
	((i) this).aClass185Array3459
	    = ((Class101) argument_144_).aClass185Array817;
	int anLocalInt
	    = (((Class101) argument_144_).aClass38Array787 == null ? 0
	       : ((Class101) argument_144_).aClass38Array787.length);
	int anLocalInt_149_
	    = (((Class101) argument_144_).aClass185Array817 == null ? 0
	       : ((Class101) argument_144_).aClass185Array817.length);
	int anLocalInt_150_ = 0;
	int[] anLocalInts = new int[anLocalInt * 3 + anLocalInt_149_];
	for (int anLocalInt_151_ = 0; anLocalInt_151_ < anLocalInt;
	     anLocalInt_151_++) {
	    anLocalInts[anLocalInt_150_++]
		= (((Class38) ((i) this).aClass38Array3460[anLocalInt_151_])
		   .anInt286);
	    anLocalInts[anLocalInt_150_++]
		= (((Class38) ((i) this).aClass38Array3460[anLocalInt_151_])
		   .anInt284);
	    anLocalInts[anLocalInt_150_++]
		= (((Class38) ((i) this).aClass38Array3460[anLocalInt_151_])
		   .anInt281);
	}
	for (int anLocalInt_152_ = 0; anLocalInt_152_ < anLocalInt_149_;
	     anLocalInt_152_++)
	    anLocalInts[anLocalInt_150_++]
		= (((Class185) ((i) this).aClass185Array3459[anLocalInt_152_])
		   .anInt1389);
	int anLocalInt_153_
	    = (((Class101) argument_144_).aClass147Array784 == null ? 0
	       : ((Class101) argument_144_).aClass147Array784.length);
	int[] anLocalInts_154_ = new int[anLocalInt_153_ * 8];
	int anLocalInt_155_ = 0;
	for (int anLocalInt_156_ = 0; anLocalInt_156_ < anLocalInt_153_;
	     anLocalInt_156_++) {
	    Class147 class147 = (((Class101) argument_144_).aClass147Array784
				 [anLocalInt_156_]);
	    Class125 class125
		= Node_Sub31_Sub4
		      .method887((byte) 113, ((Class147) class147).anInt1118);
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class147) class147).anInt1115;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).anInt1018;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).anInt1019;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).anInt1014;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).anInt1017;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).anInt1015;
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class125) class125).aBoolean1016 ? -1 : 0;
	}
	for (int anLocalInt_157_ = 0; anLocalInt_157_ < anLocalInt_153_;
	     anLocalInt_157_++) {
	    Class147 class147 = (((Class101) argument_144_).aClass147Array784
				 [anLocalInt_157_]);
	    anLocalInts_154_[anLocalInt_155_++]
		= ((Class147) class147).anInt1119;
	}
	R(anNativeToolkit3462, aYa3461, ((Class101) argument_144_).anInt792,
	  ((Class101) argument_144_).anInt797,
	  ((Class101) argument_144_).anIntArray814,
	  ((Class101) argument_144_).anIntArray810,
	  ((Class101) argument_144_).anIntArray785,
	  ((Class101) argument_144_).anIntArray796,
	  ((Class101) argument_144_).aShortArray789,
	  ((Class101) argument_144_).anInt795,
	  ((Class101) argument_144_).aShortArray798,
	  ((Class101) argument_144_).aShortArray807,
	  ((Class101) argument_144_).aShortArray793,
	  ((Class101) argument_144_).aByteArray813,
	  ((Class101) argument_144_).aByteArray790,
	  ((Class101) argument_144_).aByteArray816,
	  ((Class101) argument_144_).aByteArray818,
	  ((Class101) argument_144_).aShortArray783,
	  ((Class101) argument_144_).aShortArray815,
	  ((Class101) argument_144_).anIntArray809,
	  ((Class101) argument_144_).aByte806,
	  ((Class101) argument_144_).aShortArray794,
	  ((Class101) argument_144_).anInt812,
	  ((Class101) argument_144_).aByteArray800,
	  ((Class101) argument_144_).aShortArray821,
	  ((Class101) argument_144_).aShortArray803,
	  ((Class101) argument_144_).aShortArray799,
	  ((Class101) argument_144_).anIntArray804,
	  ((Class101) argument_144_).anIntArray811,
	  ((Class101) argument_144_).anIntArray791,
	  ((Class101) argument_144_).aByteArray802,
	  ((Class101) argument_144_).aByteArray786,
	  ((Class101) argument_144_).anIntArray819,
	  ((Class101) argument_144_).anIntArray805,
	  ((Class101) argument_144_).anIntArray801, anLocalInts, anLocalInt,
	  anLocalInt_149_, argument_145_, argument_146_, argument_147_,
	  argument_148_, anLocalInts_154_);
    }
    
    i(NativeToolkit argument_158_) {
	anNativeToolkit3462 = argument_158_;
	aYa3461 = null;
	oa(argument_158_);
    }
    
    final native int ma();
    
    final native void v();
    
    final Class38[] method2641() {
	return ((i) this).aClass38Array3460;
    }
    
    final native void C(int argument_159_);
    
    final native void LA(int argument_160_);
}
