/* t - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class t extends Class_s implements Interface3
{
    private CyclicLinkedList aCyclicLinkedList_3496 = new CyclicLinkedList();
    long aLong3497;
    private NativeToolkit anNativeToolkit3498;
    private int anInt3499 = -1;
    
    protected final void finalize() {
	if (((t) this).aLong3497 != 0L)
	    Class346.method3809(this, (byte) 20);
    }
    
    final native tia_sub_35DoublyLinked fa(int argument_0_, int argument_1_,
			       tia_sub_35DoublyLinked argument_2_);
    
    private final native void V
	(int argument_3_, int argument_4_, int argument_5_, int argument_6_,
	 int argument_7_, int argument_8_, int[] argument_9_);
    
    final void method3539(int argument_10_, int argument_11_, int argument_12_,
			  boolean[][] argument_13_, boolean argument_14_,
			  int argument_15_, int argument_16_) {
	anInt3499 = argument_15_;
	int anLocalInt = 0;
	float[] fs = new float[aCyclicLinkedList_3496.getSize()];
	for (HardwareLight class59_sub3
		 = (HardwareLight) aCyclicLinkedList_3496.getFirst();
	     class59_sub3 != null;
	     class59_sub3 = (HardwareLight) aCyclicLinkedList_3496.getNext())
	    fs[anLocalInt++] = class59_sub3.getColourIntensity();
	q(fs);
	for (int anLocalInt_17_ = 0;
	     anLocalInt_17_ < argument_12_ + argument_12_; anLocalInt_17_++) {
	    for (int anLocalInt_18_ = 0;
		 anLocalInt_18_ < argument_12_ + argument_12_;
		 anLocalInt_18_++) {
		if (argument_13_[anLocalInt_17_][anLocalInt_18_]) {
		    int anLocalInt_19_
			= argument_10_ - argument_12_ + anLocalInt_17_;
		    int anLocalInt_20_
			= argument_11_ - argument_12_ + anLocalInt_18_;
		    if (anLocalInt_19_ >= 0
			&& anLocalInt_19_ < ((Class_s) this).anInt2550
			&& anLocalInt_20_ >= 0
			&& anLocalInt_20_ < ((Class_s) this).anInt2549)
			method3540(anLocalInt_19_, anLocalInt_20_);
		}
	    }
	}
    }
    
    final boolean method3542(tia_sub_35DoublyLinked argument_21_, int argument_22_,
			     int argument_23_, int argument_24_,
			     int argument_25_, boolean argument_26_) {
	return true;
    }
    
    final void method3533(int argument_27_, int argument_28_, int argument_29_,
			  boolean[][] argument_30_, boolean argument_31_,
			  int argument_32_) {
	anInt3499 = -1;
	int anLocalInt = 0;
	float[] fs = new float[aCyclicLinkedList_3496.getSize()];
	for (HardwareLight class59_sub3
		 = (HardwareLight) aCyclicLinkedList_3496.getFirst();
	     class59_sub3 != null;
	     class59_sub3 = (HardwareLight) aCyclicLinkedList_3496.getNext())
	    fs[anLocalInt++] = class59_sub3.getColourIntensity();
	q(fs);
	for (int anLocalInt_33_ = 0;
	     anLocalInt_33_ < argument_29_ + argument_29_; anLocalInt_33_++) {
	    for (int anLocalInt_34_ = 0;
		 anLocalInt_34_ < argument_29_ + argument_29_;
		 anLocalInt_34_++) {
		if (argument_30_[anLocalInt_33_][anLocalInt_34_]) {
		    int anLocalInt_35_
			= argument_27_ - argument_29_ + anLocalInt_33_;
		    int anLocalInt_36_
			= argument_28_ - argument_29_ + anLocalInt_34_;
		    if (anLocalInt_35_ >= 0
			&& anLocalInt_35_ < ((Class_s) this).anInt2550
			&& anLocalInt_36_ >= 0
			&& anLocalInt_36_ < ((Class_s) this).anInt2549)
			method3540(anLocalInt_35_, anLocalInt_36_);
		}
	    }
	}
    }
    
    final void method3538
	(int argument_37_, int argument_38_, int[] argument_39_,
	 int[] argument_40_, int[] argument_41_, int[] argument_42_,
	 int[] argument_43_, int[] argument_44_, int[] argument_45_,
	 int[] argument_46_, int[] argument_47_, int[] argument_48_,
	 int[] argument_49_, int argument_50_, int argument_51_,
	 int argument_52_, boolean argument_53_) {
	boolean anLocalBoolean = false;
	if (argument_46_ != null) {
	    int[] anLocalInts = argument_46_;
	    for (int anLocalInt = 0; anLocalInt < anLocalInts.length;
		 anLocalInt++) {
		int anLocalInt_54_ = anLocalInts[anLocalInt];
		if (anLocalInt_54_ != -1) {
		    anLocalBoolean = true;
		    break;
		}
	    }
	}
	int anLocalInt = argument_46_.length;
	int[] anLocalInts = new int[anLocalInt * 3];
	int[] anLocalInts_55_ = new int[anLocalInt * 3];
	int[] anLocalInts_56_ = new int[anLocalInt * 3];
	int[] anLocalInts_57_ = new int[anLocalInt * 3];
	int[] anLocalInts_58_ = new int[anLocalInt * 3];
	int[] anLocalInts_59_
	    = argument_47_ != null ? new int[anLocalInt * 3] : null;
	int[] anLocalInts_60_
	    = argument_40_ != null ? new int[anLocalInt * 3] : null;
	int[] anLocalInts_61_
	    = argument_42_ != null ? new int[anLocalInt * 3] : null;
	int anLocalInt_62_ = 0;
	for (int anLocalInt_63_ = 0; anLocalInt_63_ < anLocalInt;
	     anLocalInt_63_++) {
	    int anLocalInt_64_ = argument_43_[anLocalInt_63_];
	    int anLocalInt_65_ = argument_44_[anLocalInt_63_];
	    int anLocalInt_66_ = argument_45_[anLocalInt_63_];
	    anLocalInts[anLocalInt_62_] = argument_39_[anLocalInt_64_];
	    anLocalInts_55_[anLocalInt_62_] = argument_41_[anLocalInt_64_];
	    anLocalInts_56_[anLocalInt_62_] = argument_46_[anLocalInt_63_];
	    anLocalInts_57_[anLocalInt_62_] = argument_48_[anLocalInt_63_];
	    anLocalInts_58_[anLocalInt_62_] = argument_49_[anLocalInt_63_];
	    if (argument_47_ != null)
		anLocalInts_59_[anLocalInt_62_] = argument_47_[anLocalInt_63_];
	    if (argument_40_ != null)
		anLocalInts_60_[anLocalInt_62_] = argument_40_[anLocalInt_64_];
	    if (argument_42_ != null)
		anLocalInts_61_[anLocalInt_62_] = argument_42_[anLocalInt_64_];
	    anLocalInt_62_++;
	    anLocalInts[anLocalInt_62_] = argument_39_[anLocalInt_65_];
	    anLocalInts_55_[anLocalInt_62_] = argument_41_[anLocalInt_65_];
	    anLocalInts_56_[anLocalInt_62_] = argument_46_[anLocalInt_63_];
	    anLocalInts_57_[anLocalInt_62_] = argument_48_[anLocalInt_63_];
	    anLocalInts_58_[anLocalInt_62_] = argument_49_[anLocalInt_63_];
	    if (argument_47_ != null)
		anLocalInts_59_[anLocalInt_62_] = argument_47_[anLocalInt_63_];
	    if (argument_40_ != null)
		anLocalInts_60_[anLocalInt_62_] = argument_40_[anLocalInt_65_];
	    if (argument_42_ != null)
		anLocalInts_61_[anLocalInt_62_] = argument_42_[anLocalInt_65_];
	    anLocalInt_62_++;
	    anLocalInts[anLocalInt_62_] = argument_39_[anLocalInt_66_];
	    anLocalInts_55_[anLocalInt_62_] = argument_41_[anLocalInt_66_];
	    anLocalInts_56_[anLocalInt_62_] = argument_46_[anLocalInt_63_];
	    anLocalInts_57_[anLocalInt_62_] = argument_48_[anLocalInt_63_];
	    anLocalInts_58_[anLocalInt_62_] = argument_49_[anLocalInt_63_];
	    if (argument_47_ != null)
		anLocalInts_59_[anLocalInt_62_] = argument_47_[anLocalInt_63_];
	    if (argument_40_ != null)
		anLocalInts_60_[anLocalInt_62_] = argument_40_[anLocalInt_66_];
	    if (argument_42_ != null)
		anLocalInts_61_[anLocalInt_62_] = argument_42_[anLocalInt_66_];
	    anLocalInt_62_++;
	}
	if (anLocalBoolean || anLocalInts_59_ != null)
	    U(argument_37_, argument_38_, anLocalInts, anLocalInts_60_,
	      anLocalInts_55_, anLocalInts_61_, anLocalInts_56_,
	      anLocalInts_59_, anLocalInts_57_, anLocalInts_58_, argument_50_,
	      argument_51_, argument_52_, argument_53_);
    }
    
    final native void wa(tia_sub_35DoublyLinked argument_67_, int argument_68_,
			 int argument_69_, int argument_70_, int argument_71_,
			 boolean argument_72_);
    
    final void method3536(HardwareLight argument_73_, int[] argument_74_) {
	aCyclicLinkedList_3496.add(argument_73_);
	V(argument_73_.hashCode(), argument_73_.getX(),
	  argument_73_.getY(), argument_73_.getZ(),
	  argument_73_.getRadius(), argument_73_.getColour(),
	  argument_74_);
    }
    
    final native void YA();
    
    final native void CA(tia_sub_35DoublyLinked argument_75_, int argument_76_,
			 int argument_77_, int argument_78_, int argument_79_,
			 boolean argument_80_);
    
    public final native void w(boolean argument_81_);
    
    final native void ka(int argument_82_, int argument_83_, int argument_84_);
    
    private final native void ga
	(NativeToolkit argument_85_, ya argument_86_, int argument_87_, int argument_88_,
	 int[][] argument_89_, int[][] argument_90_, int argument_91_,
	 int argument_92_, int argument_93_);
    
    final void method3540(int argument_94_, int argument_95_) {
	if (anInt3499 < 0)
	    anNativeToolkit3498.method2357().method145(this, argument_94_, argument_95_);
	else
	    anNativeToolkit3498.method2357().method156(this, argument_94_, argument_95_,
					    anInt3499);
    }
    
    t(NativeToolkit argument_96_, ya argument_97_, int argument_98_, int argument_99_,
      int[][] argument_100_, int[][] argument_101_, int argument_102_,
      int argument_103_, int argument_104_) {
	super(argument_98_, argument_99_, argument_102_, argument_100_);
	anNativeToolkit3498 = argument_96_;
	ga(anNativeToolkit3498, argument_97_, argument_98_, argument_99_,
	   ((Class_s) this).anIntArrayArray2546, argument_101_, argument_102_,
	   argument_103_, argument_104_);
    }
    
    final void method3535(int argument_105_, int argument_106_,
			  int argument_107_, int argument_108_,
			  int argument_109_, int argument_110_,
			  int argument_111_, boolean[][] argument_112_) {
	anNativeToolkit3498.method2357().method144(this, argument_105_, argument_106_,
					argument_107_, argument_108_,
					argument_109_, argument_110_,
					argument_111_, argument_112_);
    }
    
    private final native void q(float[] argument_113_);
    
    final native void U
	(int argument_114_, int argument_115_, int[] argument_116_,
	 int[] argument_117_, int[] argument_118_, int[] argument_119_,
	 int[] argument_120_, int[] argument_121_, int[] argument_122_,
	 int[] argument_123_, int argument_124_, int argument_125_,
	 int argument_126_, boolean argument_127_);
}
