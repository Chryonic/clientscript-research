/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class345
{
    static DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2[] aClass104_Sub2_Sub2_Sub5_Sub2Array2905
	= new DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2[2048];
    static int anInt2906;

    static final void method3802
	(int argument, int argument_0_, int argument_1_, int argument_2_,
	 int argument_3_, int argument_4_, int argument_5_, int argument_6_) {
	int anLocalInt = 0;
	int anLocalInt_7_ = argument_5_;
	int anLocalInt_8_ = 0;
	int anLocalInt_9_ = argument - argument_6_;
	int anLocalInt_10_ = argument_5_ - argument_6_;
	int anLocalInt_11_ = argument * argument;
	int anLocalInt_12_ = argument_5_ * argument_5_;
	int anLocalInt_13_ = anLocalInt_9_ * anLocalInt_9_;
	int anLocalInt_14_ = anLocalInt_10_ * anLocalInt_10_;
	int anLocalInt_15_ = anLocalInt_12_ << 1;
	int anLocalInt_16_ = anLocalInt_11_ << 1;
	int anLocalInt_17_ = anLocalInt_14_ << 1;
	int anLocalInt_18_ = anLocalInt_13_ << 1;
	int anLocalInt_19_ = argument_5_ << 1;
	int anLocalInt_20_ = anLocalInt_10_ << 1;
	int anLocalInt_21_
	    = anLocalInt_15_ + (1 - anLocalInt_19_) * anLocalInt_11_;
	int anLocalInt_22_
	    = -(anLocalInt_16_ * (anLocalInt_19_ - 1)) + anLocalInt_12_;
	int anLocalInt_23_
	    = anLocalInt_13_ * (-anLocalInt_20_ + 1) + anLocalInt_17_;
	int anLocalInt_24_
	    = -((anLocalInt_20_ - 1) * anLocalInt_18_) + anLocalInt_14_;
	int anLocalInt_25_ = anLocalInt_11_ << 2;
	int anLocalInt_26_ = anLocalInt_12_ << 2;
	int anLocalInt_27_ = anLocalInt_13_ << 2;
	int anLocalInt_28_ = anLocalInt_14_ << 2;
	int anLocalInt_29_ = anLocalInt_15_ * 3;
	int anLocalInt_30_ = (anLocalInt_19_ - 3) * anLocalInt_16_;
	int anLocalInt_31_ = argument_2_ * anLocalInt_17_;
	int anLocalInt_32_ = anLocalInt_18_ * (anLocalInt_20_ - 3);
	int anLocalInt_33_ = anLocalInt_26_;
	int anLocalInt_34_ = anLocalInt_25_ * (argument_5_ - 1);
	int anLocalInt_35_ = anLocalInt_28_;
	int anLocalInt_36_ = anLocalInt_27_ * (anLocalInt_10_ - 1);
	if (Class209.anInt1504 <= argument_4_
	    && argument_4_ <= Node_Sub31_Sub13.anInt5896) {
	    int[] anLocalInts = Class223.anIntArrayArray1562[argument_4_];
	    int anLocalInt_37_
		= Node_Sub31_Sub8.method897(-argument + argument_3_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_38_
		= Node_Sub31_Sub8.method897(argument_3_ + argument,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_39_
		= Node_Sub31_Sub8.method897(argument_3_ - anLocalInt_9_,
                Node_Sub35.anInt4156,
                124915076,
                Node_Sub9_Sub2.anInt5776);
	    int anLocalInt_40_
		= Node_Sub31_Sub8.method897(anLocalInt_9_ + argument_3_,
                Node_Sub35.anInt4156,
                argument_2_ + 124915073,
                Node_Sub9_Sub2.anInt5776);
	    Statics.method3364(anLocalInts, (byte) 94, anLocalInt_37_, anLocalInt_39_, argument_1_);
	    Statics.method3364(anLocalInts, (byte) -88, anLocalInt_39_, anLocalInt_40_, argument_0_);
	    Statics.method3364(anLocalInts, (byte) 124, anLocalInt_40_, anLocalInt_38_, argument_1_);
	}
	while (anLocalInt_7_ > 0) {
	    boolean anLocalBoolean = anLocalInt_10_ >= anLocalInt_7_;
	    if (anLocalBoolean) {
		if (anLocalInt_23_ < 0) {
		    while (anLocalInt_23_ < 0) {
			anLocalInt_24_ += anLocalInt_35_;
			anLocalInt_23_ += anLocalInt_31_;
			anLocalInt_35_ += anLocalInt_28_;
			anLocalInt_8_++;
			anLocalInt_31_ += anLocalInt_28_;
		    }
		}
		if (anLocalInt_24_ < 0) {
		    anLocalInt_24_ += anLocalInt_35_;
		    anLocalInt_23_ += anLocalInt_31_;
		    anLocalInt_35_ += anLocalInt_28_;
		    anLocalInt_31_ += anLocalInt_28_;
		    anLocalInt_8_++;
		}
		anLocalInt_23_ -= anLocalInt_36_;
		anLocalInt_24_ -= anLocalInt_32_;
		anLocalInt_36_ -= anLocalInt_27_;
		anLocalInt_32_ -= anLocalInt_27_;
	    }
	    if (anLocalInt_21_ < 0) {
		while (anLocalInt_21_ < 0) {
		    anLocalInt_21_ += anLocalInt_29_;
		    anLocalInt_22_ += anLocalInt_33_;
		    anLocalInt_33_ += anLocalInt_26_;
		    anLocalInt_29_ += anLocalInt_26_;
		    anLocalInt++;
		}
	    }
	    if (anLocalInt_22_ < 0) {
		anLocalInt_22_ += anLocalInt_33_;
		anLocalInt_21_ += anLocalInt_29_;
		anLocalInt_33_ += anLocalInt_26_;
		anLocalInt++;
		anLocalInt_29_ += anLocalInt_26_;
	    }
	    anLocalInt_21_ -= anLocalInt_34_;
	    anLocalInt_22_ -= anLocalInt_30_;
	    anLocalInt_7_--;
	    anLocalInt_30_ -= anLocalInt_25_;
	    anLocalInt_34_ -= anLocalInt_25_;
	    int anLocalInt_41_ = argument_4_ - anLocalInt_7_;
	    int anLocalInt_42_ = argument_4_ + anLocalInt_7_;
	    if (Class209.anInt1504 <= anLocalInt_42_
		&& Node_Sub31_Sub13.anInt5896 >= anLocalInt_41_) {
		int anLocalInt_43_
		    = Node_Sub31_Sub8.method897(anLocalInt + argument_3_,
                Node_Sub35.anInt4156,
                124915076,
                (Node_Sub9_Sub2
                        .anInt5776));
		int anLocalInt_44_
		    = Node_Sub31_Sub8.method897(argument_3_ - anLocalInt,
                Node_Sub35.anInt4156,
                124915076,
                (Node_Sub9_Sub2
                        .anInt5776));
		if (anLocalBoolean) {
		    int anLocalInt_45_
			= Node_Sub31_Sub8.method897((anLocalInt_8_
                    + argument_3_),
                    Node_Sub35.anInt4156,
                    124915076,
                    (Node_Sub9_Sub2
                            .anInt5776));
		    int anLocalInt_46_
			= Node_Sub31_Sub8.method897((argument_3_
                    - anLocalInt_8_),
                    Node_Sub35.anInt4156,
                    124915076,
                    (Node_Sub9_Sub2
                            .anInt5776));
		    if (anLocalInt_41_ >= Class209.anInt1504) {
			int[] anLocalInts
			    = Class223.anIntArrayArray1562[anLocalInt_41_];
			Statics.method3364(anLocalInts, (byte) -102, anLocalInt_44_, anLocalInt_46_, argument_1_);
			Statics.method3364(anLocalInts, (byte) 93, anLocalInt_46_, anLocalInt_45_, argument_0_);
			Statics.method3364(anLocalInts, (byte) 82, anLocalInt_45_, anLocalInt_43_, argument_1_);
		    }
		    if (Node_Sub31_Sub13.anInt5896 >= anLocalInt_42_) {
			int[] anLocalInts
			    = Class223.anIntArrayArray1562[anLocalInt_42_];
			Statics.method3364(anLocalInts, (byte) 87, anLocalInt_44_, anLocalInt_46_, argument_1_);
			Statics.method3364(anLocalInts, (byte) -67, anLocalInt_46_, anLocalInt_45_, argument_0_);
			Statics.method3364(anLocalInts, (byte) -72, anLocalInt_45_, anLocalInt_43_, argument_1_);
		    }
		} else {
		    if (anLocalInt_41_ >= Class209.anInt1504)
			Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_41_]), (byte) -41, anLocalInt_44_, anLocalInt_43_, argument_1_);
		    if (Node_Sub31_Sub13.anInt5896 >= anLocalInt_42_)
			Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_42_]), (byte) -123, anLocalInt_44_, anLocalInt_43_, argument_1_);
		}
	    }
	}
    }
    
    static final void method3803(boolean argument) {
	for (MenuAction class59_sub51_sub9
		 = ((MenuAction)
		    DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getFirst());
	     class59_sub51_sub9 != null;
	     class59_sub51_sub9
		 = ((MenuAction)
		    DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404.getNext())) {
	    if (Statics.method2568(((MenuAction) class59_sub51_sub9).action, (byte) -102))
		Class165.method2628(class59_sub51_sub9, (byte) -128);
	}
    }
    
    static final void method3804
	(int argument, int argument_47_, int argument_48_, int argument_49_,
	 int argument_50_, int argument_51_, int argument_52_,
	 int argument_53_, int argument_54_, int argument_55_) {
	if (argument_49_ != 11922)
	    client.clipboard = null;
	if (argument_48_ != argument_55_ || argument_51_ != argument_47_
	    || argument_53_ != argument || argument_50_ != argument_52_) {
	    int anLocalInt = argument_55_;
	    int anLocalInt_56_ = argument_51_;
	    int anLocalInt_57_ = argument_55_ * 3;
	    int anLocalInt_58_ = argument_51_ * 3;
	    int anLocalInt_59_ = argument_48_ * 3;
	    int anLocalInt_60_ = argument_47_ * 3;
	    int anLocalInt_61_ = argument_53_ * 3;
	    int anLocalInt_62_ = argument_52_ * 3;
	    int anLocalInt_63_
		= -argument_55_ + (anLocalInt_59_ + argument - anLocalInt_61_);
	    int anLocalInt_64_ = (argument_50_ - anLocalInt_62_
				  + anLocalInt_60_ - argument_51_);
	    int anLocalInt_65_ = (anLocalInt_57_ - anLocalInt_59_
				  + (-anLocalInt_59_ + anLocalInt_61_));
	    int anLocalInt_66_ = (anLocalInt_58_ - anLocalInt_60_
				  + anLocalInt_62_ - anLocalInt_60_);
	    int anLocalInt_67_ = anLocalInt_59_ - anLocalInt_57_;
	    int anLocalInt_68_ = -anLocalInt_58_ + anLocalInt_60_;
	    for (int anLocalInt_69_ = 128; anLocalInt_69_ <= 4096;
		 anLocalInt_69_ += 128) {
		int anLocalInt_70_ = anLocalInt_69_ * anLocalInt_69_ >> 12;
		int anLocalInt_71_ = anLocalInt_69_ * anLocalInt_70_ >> 12;
		int anLocalInt_72_ = anLocalInt_63_ * anLocalInt_71_;
		int anLocalInt_73_ = anLocalInt_64_ * anLocalInt_71_;
		int anLocalInt_74_ = anLocalInt_65_ * anLocalInt_70_;
		int anLocalInt_75_ = anLocalInt_70_ * anLocalInt_66_;
		int anLocalInt_76_ = anLocalInt_69_ * anLocalInt_67_;
		int anLocalInt_77_ = anLocalInt_69_ * anLocalInt_68_;
		int anLocalInt_78_
		    = (argument_55_
		       + (anLocalInt_76_ + (anLocalInt_72_ + anLocalInt_74_)
			  >> 12));
		int anLocalInt_79_
		    = (argument_51_
		       + (anLocalInt_75_ + anLocalInt_73_ + anLocalInt_77_
			  >> 12));
		Class92.method1690(105, anLocalInt_79_, anLocalInt_78_,
				   anLocalInt_56_, anLocalInt, argument_54_);
		anLocalInt = anLocalInt_78_;
		anLocalInt_56_ = anLocalInt_79_;
	    }
	} else
	    Class92.method1690(argument_49_ - 11808, argument_50_, argument,
			       argument_51_, argument_55_, argument_54_);
    }
    
    static final AbstractFont method3805(GraphicsToolkit argument, boolean argument_80_,
				    int argument_81_, int argument_82_) {
	Class363 class363
	    = Node_Sub31_Sub39.method1003(argument, argument_80_,
            argument_81_, (byte) 10);
	if (class363 == null)
	    return null;
	return ((Class363) class363).aAbstractFont_3062;
    }
    
    public static void method3806(int argument) {
	aClass104_Sub2_Sub2_Sub5_Sub2Array2905 = null;
	client.clipboard = null;
    }
    
    static {
	anInt2906 = 0;
    }
}
