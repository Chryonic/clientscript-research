/* Class104_Sub2_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Entity extends DoublyLinkedNodeP2_Sub2_Sub2 {
    int anInt6725;
    int[] anIntArray6726 = new int[Class62_Sub27.anInt4453];
    int anInt6727;
    int anInt6728;
    int anInt6729;
    int anInt6730;
    int anInt6731;
    int anInt6732;
    String aString6733;
    int[] anIntArray6735 = null;
    int anInt6736;
    int anInt6737;
    int anInt6738;
    int anInt6739;
    int anInt6740;
    int anInt6741;
    int anInt6742;
    byte aByte6743;
    int[] anIntArray6744;
    int anInt6745;
    int anInt6746;
    int anInt6747;
    int[] anIntArray6748;
    int anInt6749;
    int anInt6750;
    boolean aBoolean6751;
    boolean aBoolean6753;
    int anInt6754;
    int anInt6755;
    int anInt6756;
    int anInt6757;
    int[] anIntArray6758;
    Class269[] aClass269Array6759;
    int anInt6760;
    int anInt6761;
    int anInt6762;
    private byte aByte6763;
    int anInt6764;
    int anInt6765;
    int anInt6766;
    int[] anIntArray6767;
    int anInt6768;
    int anInt6769;
    int anInt6770;
    byte aByte6771;
    private int anInt6772;
    int anInt6773;
    int anInt6774;
    byte aByte6775;
    int anInt6776;
    boolean aBoolean6777;
    int[] anIntArray6778;
    Class91[] aClass91Array6779;
    Class271 aClass271_6780;
    byte aByte6781;
    int anInt6782;
    int[] anIntArray6783;
    int anInt6784;
    int anInt6785;
    int anInt6786;
    int anInt6787;
    int anInt6788;
    int anInt6789;
    int anInt6790;
    int anInt6791;
    int[] anIntArray6792;
    private Class271 aClass271_6793;
    private Class271 aClass271_6794;
    boolean aBoolean6795;
    int anInt6796;
    boolean aBoolean6797;
    int anInt6798;
    int[] pathZ;
    private int anInt6800;
    Class167[] aClass167Array6801;
    byte[] aByteArray6802;
    int anInt6803;
    DoublyLinkedNodeP2_Sub7 aClass104_Sub7_6804;
    int[] pathX;

    final void method1821(int argument_0_, byte argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_) {
        int anLocalInt = ((this.left + this.right) >> 1);
        int anLocalInt_6_ = ((this.top + this.bottom) >> 1);
        int anLocalInt_7_ = Node_Sub6.SINETABLE[argument_3_];
        int anLocalInt_8_ = Node_Sub6.COSINETABLE[argument_3_];
        int anLocalInt_9_ = -argument_5_ / 2;
        int anLocalInt_10_ = -argument_2_ / 2;
        int anLocalInt_11_ = (anLocalInt_9_ * anLocalInt_8_ + anLocalInt_7_ * anLocalInt_10_ >> 14);
        int anLocalInt_12_ = (anLocalInt_8_ * anLocalInt_10_ - anLocalInt_9_ * anLocalInt_7_ >> 14);
        int anLocalInt_13_ = Class354.method3926(anLocalInt, false, this.lightingHL, anLocalInt_6_, (this.worldX + anLocalInt_11_), (this.worldZ + anLocalInt_12_));
        int anLocalInt_14_ = argument_5_ / 2;
        int anLocalInt_15_ = -argument_2_ / 2;
        int anLocalInt_16_ = (anLocalInt_14_ * anLocalInt_8_ + anLocalInt_15_ * anLocalInt_7_ >> 14);
        int anLocalInt_17_ = (anLocalInt_15_ * anLocalInt_8_ - anLocalInt_7_ * anLocalInt_14_ >> 14);
        int anLocalInt_18_ = Class354.method3926(anLocalInt, false, this.lightingHL, anLocalInt_6_, (anLocalInt_16_ + this.worldX), (this.worldZ + anLocalInt_17_));
        int anLocalInt_19_ = -argument_5_ / 2;
        int anLocalInt_20_ = argument_2_ / 2;
        int anLocalInt_21_ = (anLocalInt_19_ * anLocalInt_8_ + anLocalInt_7_ * anLocalInt_20_ >> 14);
        int anLocalInt_22_ = (anLocalInt_8_ * anLocalInt_20_ - anLocalInt_19_ * anLocalInt_7_ >> 14);
        int anLocalInt_23_ = Class354.method3926(anLocalInt, false, this.lightingHL, anLocalInt_6_, (anLocalInt_21_ + this.worldX), (this.worldZ + anLocalInt_22_));
        int anLocalInt_24_ = argument_5_ / 2;
        int anLocalInt_25_ = argument_2_ / 2;
        int anLocalInt_26_ = (anLocalInt_24_ * anLocalInt_8_ + anLocalInt_7_ * anLocalInt_25_ >> 14);
        int anLocalInt_27_ = ((-(anLocalInt_24_ * anLocalInt_7_) + anLocalInt_8_ * anLocalInt_25_) >> 14);
        int anLocalInt_28_ = Class354.method3926(anLocalInt, false, this.lightingHL, anLocalInt_6_, (anLocalInt_26_ + this.worldX), (anLocalInt_27_ + this.worldZ));
        int anLocalInt_29_ = (anLocalInt_18_ > anLocalInt_13_ ? anLocalInt_13_ : anLocalInt_18_);
        int anLocalInt_30_ = (anLocalInt_28_ > anLocalInt_23_ ? anLocalInt_23_ : anLocalInt_28_);
        int anLocalInt_31_ = (anLocalInt_18_ >= anLocalInt_28_ ? anLocalInt_28_ : anLocalInt_18_);
        this.anInt6764 = (int) (Math.atan2((double) (anLocalInt_29_ - anLocalInt_30_), (double) argument_2_) * 2607.5945876176133) & 0x3fff;
        int anLocalInt_32_ = (anLocalInt_23_ > anLocalInt_13_ ? anLocalInt_13_ : anLocalInt_23_);
        this.anInt6741 = (int) (Math.atan2((double) (anLocalInt_32_ - anLocalInt_31_), (double) argument_5_) * 2607.5945876176133) & 0x3fff;
        if (this.anInt6764 != 0 && argument_0_ != 0) {
            int anLocalInt_33_ = 16384 - argument_0_;
            if (this.anInt6764 <= 8192) {
                if (argument_0_ < this.anInt6764)
                    this.anInt6764 = argument_0_;
            } else if (this.anInt6764 < anLocalInt_33_)
                this.anInt6764 = anLocalInt_33_;
        }
        if (this.anInt6741 != 0 && argument_4_ != 0) {
            int anLocalInt_34_ = 16384 - argument_4_;
            if (this.anInt6741 <= 8192) {
                if (argument_4_ < this.anInt6741)
                    this.anInt6741 = argument_4_;
            } else if (this.anInt6741 < anLocalInt_34_)
                this.anInt6741 = anLocalInt_34_;
        }
        this.anInt6760 = anLocalInt_13_ + anLocalInt_28_;
        if (this.anInt6760 > anLocalInt_18_ + anLocalInt_23_)
            this.anInt6760 = anLocalInt_18_ + anLocalInt_23_;
        this.anInt6760 = (-this.anInt4511 + (this.anInt6760 >> 1));
    }

    public Entity() {
        super(0, 0, 0, 0, 0, 0, 0, 0, 0, false, (byte) 0);
        this.anInt6725 = -1;
        this.anInt6731 = -1;
        this.anInt6738 = 0;
        this.anInt6729 = -1;
        this.anInt6727 = 256;
        this.anInt6749 = 0;
        this.anIntArray6748 = new int[Class62_Sub27.anInt4453];
        this.anInt6747 = 0;
        this.anInt6755 = 0;
        this.anIntArray6744 = new int[Class62_Sub27.anInt4453];
        this.aString6733 = null;
        this.anInt6730 = -32768;
        this.anInt6750 = 0;
        anInt6772 = 1;
        aByte6763 = (byte) 0;
        this.anInt6774 = -1000;
        this.aBoolean6777 = false;
        this.anInt6732 = 0;
        this.anInt6739 = -1;
        this.aBoolean6753 = false;
        this.anInt6742 = 0;
        this.anIntArray6767 = new int[Class62_Sub27.anInt4453];
        this.anInt6776 = 0;
        this.anInt6761 = 0;
        this.anInt6754 = -1;
        this.aByte6781 = (byte) 0;
        this.anIntArray6778 = new int[Class62_Sub27.anInt4453];
        this.anInt6736 = 0;
        this.anInt6788 = -1;
        this.anInt6786 = 0;
        this.aBoolean6751 = true;
        this.anInt6765 = -1;
        this.anInt6787 = -1;
        this.anInt6769 = 0;
        this.anInt6791 = 100;
        this.anInt6789 = 0;
        this.anInt6740 = 0;
        this.anInt6782 = -1000;
        this.anIntArray6758 = new int[Class62_Sub27.anInt4453];
        this.aClass271_6780 = new Class271();
        aClass271_6793 = new Class271();
        aClass271_6794 = new Class271();
        this.anInt6796 = 0;
        anInt6800 = 0;
        this.pathZ = new int[10];
        this.aBoolean6797 = false;
        this.aBoolean6795 = false;
        this.anInt6798 = 0;
        this.aByteArray6802 = new byte[10];
        this.pathX = new int[10];
        this.anInt6803 = 0;
        this.aClass167Array6801 = new Class167[4];
        this.aClass269Array6759 = new Class269[3];
        for (int anLocalInt = 0; anLocalInt < 3; anLocalInt++)
            this.aClass269Array6759[anLocalInt] = new Class269(this);
        this.aClass91Array6779 = (new Class91
                [Statics.aClass61_2002.anIntArray439.length]);
    }

    final int method1822(int argument_35_) {
        Class354 class354 = method1831();
        int anLocalInt = (this.aClass271_6780.anInt2166);
        boolean anLocalBoolean;
        if (class354.anInt2981 != 0)
            anLocalBoolean = (this.aClass271_6780.method3370(class354.anInt2981, this.anInt6784, class354.anInt2985, (byte) 71));
        else
            anLocalBoolean = (this.aClass271_6780.method3370(this.anInt6727, this.anInt6784, this.anInt6727, (byte) -120));
        int anLocalInt_36_ = ((this.aClass271_6780.anInt2166) - anLocalInt);
        if (anLocalInt_36_ == 0) {
            this.anInt6738 = 0;
            this.aClass271_6780.method3371(this.anInt6784, (byte) 93);
        } else
            this.anInt6738++;
        if (!anLocalBoolean) {
            if (class354.anInt2967 == 0)
                aClass271_6793.method3371(0, (byte) 62);
            else
                aClass271_6793.method3370(class354.anInt2967, 0, class354.anInt2962, (byte) 88);
            if (class354.anInt2963 == 0)
                aClass271_6794.method3371(0, (byte) 73);
            else
                aClass271_6794.method3370(class354.anInt2963, 0, class354.anInt2986, (byte) -112);
        } else {
            if (class354.anInt2967 != 0) {
                if (anLocalInt_36_ <= 0)
                    aClass271_6793.method3370(class354.anInt2967, -class354.anInt2997, class354.anInt2962, (byte) -122);
                else
                    aClass271_6793.method3370(class354.anInt2967, class354.anInt2997, class354.anInt2962, (byte) 71);
            }
            if (class354.anInt2963 != 0)
                aClass271_6794.method3370(class354.anInt2963, class354.anInt2969, class354.anInt2986, (byte) 88);
        }
        return anLocalInt_36_;
    }

    final void method1823(byte argument_37_, int[] argument_38_, int[] argument_39_) {
        if (this.anIntArray6783 == null && argument_39_ != null)
            this.anIntArray6783 = (new int
                    [Statics.aClass61_2002.anIntArray439.length]);
        else if (argument_39_ == null) {
            this.anIntArray6783 = null;
            return;
        }
        for (int anLocalInt = 0; (this.anIntArray6783.length > anLocalInt); anLocalInt++)
            this.anIntArray6783[anLocalInt] = -1;
        for (int anLocalInt = 0; argument_39_.length > anLocalInt; anLocalInt++) {
            int anLocalInt_40_ = argument_38_[anLocalInt];
            int anLocalInt_41_ = 0;
            while (anLocalInt_41_ < this.anIntArray6783.length) {
                if ((anLocalInt_40_ & 0x1) != 0)
                    this.anIntArray6783[anLocalInt_41_] = argument_39_[anLocalInt];
                anLocalInt_41_++;
                anLocalInt_40_ >>= 1;
            }
        }
    }

    final boolean method1766(int argument_42_) {
        if (argument_42_ >= -87)
            return true;
        return false;
    }

    final void method1824(int argument_43_, byte argument_44_) {
        Class354 class354 = method1831();
        if (class354.anInt2981 != 0 || this.anInt6727 != 0) {
            this.aClass271_6780.method3369(91);
            int anLocalInt = (argument_43_ - this.aClass271_6780.anInt2166 & 0x3fff);
            if (anLocalInt > 8192)
                this.anInt6784 = (anLocalInt - 16384 + this.aClass271_6780.anInt2166);
            else
                this.anInt6784 = (anLocalInt + this.aClass271_6780.anInt2166);
        }
    }

    protected final void finalize() {
        if (this.aClass104_Sub7_6804 != null)
            this.aClass104_Sub7_6804.method1930();
    }

    final void method1825(GraphicsToolkit argument_45_, Class354 argument_46_, byte argument_47_, int argument_48_, int argument_49_, int argument_50_, int argument_51_) {
        for (int anLocalInt = 0; (this.aClass269Array6759.length > anLocalInt); anLocalInt++) {
            byte anLocalInt_52_ = 0;
            if (anLocalInt != 0) {
                if (anLocalInt != 1) {
                    if (anLocalInt == 2)
                        anLocalInt_52_ = (byte) 1;
                } else
                    anLocalInt_52_ = (byte) 5;
            } else
                anLocalInt_52_ = (byte) 2;
            Class269 class269 = (this.aClass269Array6759[anLocalInt]);
            if (class269.anInt2150 != -1 && class269.anInt2159 != -1) {
                Class126 class126 = Class194.aClass225_1414.method3054((byte) 115, (class269.anInt2150));
                boolean anLocalBoolean = (class126.aByte1022 == 3 && (argument_49_ != 0 || argument_50_ != 0));
                int anLocalInt_53_ = argument_51_;
                if (anLocalBoolean)
                    anLocalInt_53_ |= 0x7;
                else {
                    if (class269.anInt2151 != 0)
                        anLocalInt_53_ |= 0x5;
                    if (class269.anInt2146 != 0)
                        anLocalInt_53_ |= 0x2;
                    if (class269.anInt2158 >= 0)
                        anLocalInt_53_ |= 0x7;
                }
                Class167 class167 = (this.aClass167Array6801[anLocalInt + 1] = class126.method2411(0, anLocalInt_52_, argument_45_, class269.anInt2159, class269.anInt2148, DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425, anLocalInt_53_, class269.anInt2156));
                if (class167 != null) {
                    if (class269.anInt2158 >= 0 && (argument_46_.anIntArrayArray2958 != null) && (argument_46_.anIntArrayArray2958[class269.anInt2158]) != null) {
                        int anLocalInt_54_ = 0;
                        int anLocalInt_55_ = 0;
                        int anLocalInt_56_ = 0;
                        if ((argument_46_.anIntArrayArray2958 != null) && (argument_46_.anIntArrayArray2958[class269.anInt2158]) != null) {
                            anLocalInt_55_ += (argument_46_.anIntArrayArray2958[class269.anInt2158][1]);
                            anLocalInt_56_ += (argument_46_.anIntArrayArray2958[class269.anInt2158][2]);
                            anLocalInt_54_ += (argument_46_.anIntArrayArray2958[class269.anInt2158][0]);
                        }
                        if ((argument_46_.anIntArrayArray3001 != null) && (argument_46_.anIntArrayArray3001[class269.anInt2158]) != null) {
                            anLocalInt_54_ += (argument_46_.anIntArrayArray3001[class269.anInt2158][0]);
                            anLocalInt_56_ += (argument_46_.anIntArrayArray3001[class269.anInt2158][2]);
                            anLocalInt_55_ += (argument_46_.anIntArrayArray3001[class269.anInt2158][1]);
                        }
                        if (anLocalInt_56_ != 0 || anLocalInt_54_ != 0) {
                            int anLocalInt_57_ = argument_48_;
                            if ((this.anIntArray6792) != null && (this.anIntArray6792[class269.anInt2158]) != -1)
                                anLocalInt_57_ = (this.anIntArray6792[class269.anInt2158]);
                            int anLocalInt_58_ = (-argument_48_ + (anLocalInt_57_ + (class269.anInt2151) * 2048) & 0x3fff);
                            if (anLocalInt_58_ != 0)
                                class167.a(anLocalInt_58_);
                            int anLocalInt_59_ = Node_Sub6.SINETABLE[anLocalInt_58_];
                            int anLocalInt_60_ = Node_Sub6.COSINETABLE[anLocalInt_58_];
                            int anLocalInt_61_ = ((anLocalInt_54_ * anLocalInt_60_ + anLocalInt_56_ * anLocalInt_59_) >> 14);
                            anLocalInt_56_ = (anLocalInt_56_ * anLocalInt_60_ - anLocalInt_59_ * anLocalInt_54_) >> 14;
                            anLocalInt_54_ = anLocalInt_61_;
                        }
                        class167.H(anLocalInt_54_, anLocalInt_55_, anLocalInt_56_);
                    } else if (class269.anInt2151 != 0)
                        class167.a(class269.anInt2151 * 2048);
                    if (class269.anInt2146 != 0)
                        class167.H(0, -class269.anInt2146 << 2, 0);
                    if (anLocalBoolean) {
                        if (this.anInt6764 != 0)
                            class167.FA(this.anInt6764);
                        if (this.anInt6741 != 0)
                            class167.VA(this.anInt6741);
                        if (this.anInt6760 != 0)
                            class167.H(0, (this.anInt6760), 0);
                    }
                }
            } else
                this.aClass167Array6801[(anLocalInt + 1)] = null;
        }
    }

    final void method1826(int argument_62_, int argument_63_, int argument_64_, int argument_65_, int argument_66_, int argument_67_, int argument_68_, int argument_69_) {
        boolean anLocalBoolean = true;
        boolean anLocalBoolean_70_ = true;
        for (int anLocalInt = 0; Class62_Sub27.anInt4453 > anLocalInt; anLocalInt++) {
            if (argument_64_ < this.anIntArray6778[anLocalInt])
                anLocalBoolean = false;
            else
                anLocalBoolean_70_ = false;
        }
        int anLocalInt = -1;
        int anLocalInt_71_ = -1;
        int anLocalInt_72_ = 0;
        if (argument_66_ >= 0) {
            Class234 class234 = Class79.aClass115_561.method2368(argument_66_, -18112);
            anLocalInt_71_ = class234.anInt1708;
            anLocalInt_72_ = class234.anInt1711;
        }
        if (anLocalBoolean_70_) {
            if (anLocalInt_71_ == -1)
                return;
            anLocalInt = 0;
            int anLocalInt_73_ = 0;
            if (anLocalInt_71_ == 0)
                anLocalInt_73_ = this.anIntArray6778[0];
            else if (anLocalInt_71_ == 1)
                anLocalInt_73_ = this.anIntArray6744[0];
            for (int anLocalInt_74_ = 1; anLocalInt_74_ < Class62_Sub27.anInt4453; anLocalInt_74_++) {
                if (anLocalInt_71_ == 0) {
                    if (anLocalInt_73_ > (this.anIntArray6778[anLocalInt_74_])) {
                        anLocalInt_73_ = (this.anIntArray6778[anLocalInt_74_]);
                        anLocalInt = anLocalInt_74_;
                    }
                } else if (anLocalInt_71_ == 1 && (anLocalInt_73_ > (this.anIntArray6744[anLocalInt_74_]))) {
                    anLocalInt_73_ = (this.anIntArray6744[anLocalInt_74_]);
                    anLocalInt = anLocalInt_74_;
                }
            }
            if (anLocalInt_71_ == 1 && anLocalInt_73_ >= argument_68_)
                return;
        } else {
            if (anLocalBoolean)
                aByte6763 = (byte) 0;
            for (int anLocalInt_75_ = 0; Class62_Sub27.anInt4453 > anLocalInt_75_; anLocalInt_75_++) {
                int anLocalInt_76_ = aByte6763;
                aByte6763 = (byte) ((aByte6763 + 1) % Class62_Sub27.anInt4453);
                if (argument_64_ >= (this.anIntArray6778[anLocalInt_76_])) {
                    anLocalInt = anLocalInt_76_;
                    break;
                }
            }
        }
        if (anLocalInt >= 0) {
            this.anIntArray6758[anLocalInt] = argument_66_;
            this.anIntArray6744[anLocalInt] = argument_68_;
            this.anIntArray6748[anLocalInt] = argument_67_;
            this.anIntArray6726[anLocalInt] = argument_65_;
            this.anIntArray6778[anLocalInt] = argument_64_ + (anLocalInt_72_ + argument_63_);
            this.anIntArray6767[anLocalInt] = argument_69_;
        }
    }

    final void method1827(int argument_77_, int argument_78_, int argument_79_, int argument_80_, int argument_81_, int argument_82_) {
        Class269 class269 = (this.aClass269Array6759[argument_78_]);
        int anLocalInt = class269.anInt2150;
        if (argument_79_ != -1 && anLocalInt != -1) {
            if (argument_79_ != anLocalInt) {
                Class126 class126 = Class194.aClass225_1414.method3054((byte) 127, argument_79_);
                Class126 class126_83_ = Class194.aClass225_1414.method3054((byte) 88, anLocalInt);
                if (class126.anInt1034 != -1 && class126_83_.anInt1034 != -1) {
                    Class367 class367 = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(class126.anInt1034, argument_82_));
                    Class367 class367_84_ = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(class126_83_.anInt1034, 0));
                    if (class367.anInt3099 < class367_84_.anInt3099)
                        return;
                }
            } else {
                Class126 class126 = Class194.aClass225_1414.method3054((byte) 106, argument_79_);
                if (class126.aBoolean1035 && class126.anInt1034 != -1) {
                    Class367 class367 = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(class126.anInt1034, argument_82_));
                    int anLocalInt_85_ = class367.anInt3106;
                    if (anLocalInt_85_ != 0) {
                        if (anLocalInt_85_ == 2) {
                            class269.anInt2152 = 0;
                            return;
                        }
                    } else
                        return;
                }
            }
        }
        class269.anInt2146 = argument_77_ >> 16;
        class269.anInt2150 = argument_79_;
        class269.anInt2158 = argument_80_;
        int anLocalInt_86_ = Class333.anInt2720;
        class269.anInt2157 = anLocalInt_86_ + (argument_77_ & 0xffff);
        class269.anInt2151 = argument_81_;
        class269.anInt2159 = argument_82_;
        class269.anInt2148 = 1;
        class269.anInt2156 = 0;
        if (anLocalInt_86_ < class269.anInt2157)
            class269.anInt2159 = -1;
        if (class269.anInt2150 != -1 && anLocalInt_86_ == class269.anInt2157) {
            int anLocalInt_87_ = (Class194.aClass225_1414.method3054((byte) 102, (class269.anInt2150)).anInt1034);
            if (anLocalInt_87_ != -1) {
                Class367 class367 = DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(anLocalInt_87_, 0);
                if (class367 != null && class367.anIntArray3096 != null && !this.aBoolean6751)
                    Class313.method3622(this, 0, class367, 0);
            }
        }
    }

    static void method1828(boolean argument, Entity argument_88_, boolean argument_89_) {
        Class354 class354 = argument_88_.method1831();
        if (argument_88_.anInt6798 == 0) {
            Class55.anInt408 = -1;
            Class_aa_Sub1.anInt3748 = 0;
            argument_88_.anInt6796 = 0;
        } else {
            if (argument_88_.anInt6754 != -1 && argument_88_.anInt6755 == 0) {
                Class367 class367 = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(argument_88_.anInt6754, 0));
                if (argument_88_.anInt6803 > 0 && class367.anInt3092 == 0) {
                    argument_88_.anInt6796++;
                    Class_aa_Sub1.anInt3748 = 0;
                    Class55.anInt408 = -1;
                    return;
                }
                if (argument_88_.anInt6803 <= 0 && class367.anInt3114 == 0) {
                    argument_88_.anInt6796++;
                    Class55.anInt408 = -1;
                    Class_aa_Sub1.anInt3748 = 0;
                    return;
                }
            }
            for (int anLocalInt = 0; anLocalInt < (argument_88_.aClass269Array6759).length; anLocalInt++) {
                if ((argument_88_.aClass269Array6759[anLocalInt].anInt2150 != -1) && (argument_88_.aClass269Array6759[anLocalInt].anInt2157) <= Class333.anInt2720) {
                    Class126 class126 = (Class194.aClass225_1414.method3054((byte) 109, argument_88_.aClass269Array6759[anLocalInt].anInt2150));
                    if (class126.aBoolean1035 && class126.anInt1034 != -1) {
                        Class367 class367 = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(class126.anInt1034, 0));
                        if ((argument_88_.anInt6803 > 0) && class367.anInt3092 == 0) {
                            Class_aa_Sub1.anInt3748 = 0;
                            argument_88_.anInt6796++;
                            Class55.anInt408 = -1;
                            return;
                        }
                        if ((argument_88_.anInt6803 <= 0) && class367.anInt3114 == 0) {
                            Class_aa_Sub1.anInt3748 = 0;
                            argument_88_.anInt6796++;
                            Class55.anInt408 = -1;
                            return;
                        }
                    }
                }
            }
            int anLocalInt = argument_88_.worldX;
            int anLocalInt_90_ = argument_88_.worldZ;
            int anLocalInt_91_ = (((argument_88_.pathX[argument_88_.anInt6798 - 1]) * 512) + argument_88_.method1830(-128) * 256);
            int anLocalInt_92_ = (((argument_88_.pathZ[argument_88_.anInt6798 - 1]) * 512) + argument_88_.method1830(-126) * 256);
            if (anLocalInt >= anLocalInt_91_) {
                if (anLocalInt_91_ >= anLocalInt) {
                    if (anLocalInt_92_ <= anLocalInt_90_) {
                        if (anLocalInt_90_ > anLocalInt_92_)
                            argument_88_.method1824(0, (byte) 111);
                    } else
                        argument_88_.method1824(8192, (byte) 75);
                } else if (anLocalInt_92_ > anLocalInt_90_)
                    argument_88_.method1824(6144, (byte) 127);
                else if (anLocalInt_92_ >= anLocalInt_90_)
                    argument_88_.method1824(4096, (byte) 87);
                else
                    argument_88_.method1824(2048, (byte) 76);
            } else if (anLocalInt_92_ <= anLocalInt_90_) {
                if (anLocalInt_90_ > anLocalInt_92_)
                    argument_88_.method1824(14336, (byte) 120);
                else
                    argument_88_.method1824(12288, (byte) 76);
            } else
                argument_88_.method1824(10240, (byte) 86);
            byte anLocalInt_93_ = (argument_88_.aByteArray6802[argument_88_.anInt6798 - 1]);
            if (!argument_89_ && (-anLocalInt + anLocalInt_91_ > 1024 || anLocalInt_91_ - anLocalInt < -1024 || -anLocalInt_90_ + anLocalInt_92_ > 1024 || -anLocalInt_90_ + anLocalInt_92_ < -1024)) {
                ((DoublyLinkedNodeP2_Sub2) argument_88_).worldZ = anLocalInt_92_;
                ((DoublyLinkedNodeP2_Sub2) argument_88_).worldX = anLocalInt_91_;
                argument_88_.method1840(16383, false, argument_88_.anInt6784);
                if (argument_88_.anInt6803 > 0)
                    argument_88_.anInt6803--;
                Class_aa_Sub1.anInt3748 = 0;
                Class55.anInt408 = -1;
                argument_88_.anInt6798--;
            } else {
                int anLocalInt_94_ = 16;
                boolean anLocalBoolean = argument;
                if (argument_88_ instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
                    anLocalBoolean = (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_88_).aClass291_6832.aBoolean2376);
                if (!anLocalBoolean) {
                    if (!argument_89_ && (argument_88_.anInt6798 > 1))
                        anLocalInt_94_ = 24;
                    if (!argument_89_ && (argument_88_.anInt6798 > 2))
                        anLocalInt_94_ = 32;
                } else {
                    int anLocalInt_95_ = (-(argument_88_.aClass271_6780.anInt2166) + (argument_88_.anInt6784));
                    if (anLocalInt_95_ != 0 && (argument_88_.anInt6725 == -1) && (argument_88_.anInt6727 != 0))
                        anLocalInt_94_ = 8;
                    if (!argument_89_ && (argument_88_.anInt6798 > 2))
                        anLocalInt_94_ = 24;
                    if (!argument_89_ && (argument_88_.anInt6798 > 3))
                        anLocalInt_94_ = 32;
                }
                if (argument_88_.anInt6796 > 0 && (argument_88_.anInt6798 > 1)) {
                    anLocalInt_94_ = 32;
                    argument_88_.anInt6796--;
                }
                if (anLocalInt_93_ == 2)
                    anLocalInt_94_ <<= 1;
                else if (anLocalInt_93_ == 0)
                    anLocalInt_94_ >>= 1;
                if (class354.anInt2998 != -1) {
                    anLocalInt_94_ <<= 9;
                    if (argument_88_.anInt6798 == 1) {
                        int anLocalInt_96_ = argument_88_.anInt6800 * argument_88_.anInt6800;
                        int anLocalInt_97_ = (((argument_88_.worldX > anLocalInt_91_) ? (-anLocalInt_91_ + argument_88_.worldX) : (-argument_88_.worldX + anLocalInt_91_)) << 9);
                        int anLocalInt_98_ = (((argument_88_.worldZ > anLocalInt_92_) ? (argument_88_.worldZ - anLocalInt_92_) : (anLocalInt_92_ - argument_88_.worldZ)) << 9);
                        int anLocalInt_99_ = (anLocalInt_97_ <= anLocalInt_98_ ? anLocalInt_98_ : anLocalInt_97_);
                        int anLocalInt_100_ = (class354.anInt2998 * 2 * anLocalInt_99_);
                        if (anLocalInt_96_ <= anLocalInt_100_) {
                            if (anLocalInt_99_ >= anLocalInt_96_ / 2) {
                                if (anLocalInt_94_ > argument_88_.anInt6800) {
                                    argument_88_.anInt6800 += class354.anInt2998;
                                    if (anLocalInt_94_ < argument_88_.anInt6800)
                                        argument_88_.anInt6800 = anLocalInt_94_;
                                }
                            } else {
                                argument_88_.anInt6800 -= class354.anInt2998;
                                if (argument_88_.anInt6800 < 0)
                                    argument_88_.anInt6800 = 0;
                            }
                        } else
                            argument_88_.anInt6800 /= 2;
                    } else if (anLocalInt_94_ > argument_88_.anInt6800) {
                        argument_88_.anInt6800 += class354.anInt2998;
                        if (argument_88_.anInt6800 > anLocalInt_94_)
                            argument_88_.anInt6800 = anLocalInt_94_;
                    } else if (argument_88_.anInt6800 > 0) {
                        argument_88_.anInt6800 -= class354.anInt2998;
                        if (argument_88_.anInt6800 < 0)
                            argument_88_.anInt6800 = 0;
                    }
                    anLocalInt_94_ = argument_88_.anInt6800 >> 9;
                    if (anLocalInt_94_ < 1)
                        anLocalInt_94_ = 1;
                }
                Class_aa_Sub1.anInt3748 = 0;
                if (anLocalInt_91_ == anLocalInt && anLocalInt_90_ == anLocalInt_92_)
                    Class55.anInt408 = -1;
                else {
                    if (anLocalInt_91_ <= anLocalInt) {
                        if (anLocalInt > anLocalInt_91_) {
                            ((DoublyLinkedNodeP2_Sub2) argument_88_).worldX -= anLocalInt_94_;
                            Class_aa_Sub1.anInt3748 |= 0x8;
                            if (anLocalInt_91_ > argument_88_.worldX)
                                ((DoublyLinkedNodeP2_Sub2) argument_88_).worldX = anLocalInt_91_;
                        }
                    } else {
                        ((DoublyLinkedNodeP2_Sub2) argument_88_).worldX += anLocalInt_94_;
                        Class_aa_Sub1.anInt3748 |= 0x4;
                        if (argument_88_.worldX > anLocalInt_91_)
                            ((DoublyLinkedNodeP2_Sub2) argument_88_).worldX = anLocalInt_91_;
                    }
                    if (anLocalInt_92_ > anLocalInt_90_) {
                        ((DoublyLinkedNodeP2_Sub2) argument_88_).worldZ += anLocalInt_94_;
                        Class_aa_Sub1.anInt3748 |= 0x1;
                        if (anLocalInt_92_ < argument_88_.worldZ)
                            ((DoublyLinkedNodeP2_Sub2) argument_88_).worldZ = anLocalInt_92_;
                    } else if (anLocalInt_90_ > anLocalInt_92_) {
                        ((DoublyLinkedNodeP2_Sub2) argument_88_).worldZ -= anLocalInt_94_;
                        Class_aa_Sub1.anInt3748 |= 0x2;
                        if (anLocalInt_92_ > argument_88_.worldZ)
                            ((DoublyLinkedNodeP2_Sub2) argument_88_).worldZ = anLocalInt_92_;
                    }
                    if (anLocalInt_94_ < 32)
                        Class55.anInt408 = anLocalInt_93_;
                    else
                        Class55.anInt408 = 2;
                }
                if (argument_88_.worldX == anLocalInt_91_ && (argument_88_.worldZ == anLocalInt_92_)) {
                    if (argument_88_.anInt6803 > 0)
                        argument_88_.anInt6803--;
                    argument_88_.anInt6798--;
                }
            }
        }
    }

    final void method1795(int argument_101_) {
        int anLocalInt = (anInt6772 - 1 << 8) + 240;
        ((DoublyLinkedNodeP2_Sub2_Sub2) this).bottom = (short) (this.worldZ - anLocalInt >> 9);
        ((DoublyLinkedNodeP2_Sub2_Sub2) this).right = (short) (this.worldX + anLocalInt >> 9);
        ((DoublyLinkedNodeP2_Sub2_Sub2) this).left = (short) (-anLocalInt + this.worldX >> 9);
        ((DoublyLinkedNodeP2_Sub2_Sub2) this).top = (short) (anLocalInt + this.worldZ >> 9);
    }

    int method1830(int argument_102_) {
        return anInt6772;
    }

    final Class354 method1831() {
        int anLocalInt = method1839(true);
        if (anLocalInt == -1)
            return DoublyLinkedNodeP2_Sub2_Sub4.aClass354_6423;
        return Class157.aClass41_1159.method421((byte) -75, anLocalInt);
    }

    final boolean method1832(int argument_104_, byte argument_105_, int argument_106_) {
        if (argument_105_ != 71)
            this.aBoolean6753 = true;
        if (this.anIntArray6792 == null) {
            if (argument_106_ == -1)
                return true;
            this.anIntArray6792 = (new int
                    [Statics.aClass61_2002.anIntArray439.length]);
            for (int anLocalInt = 0; (Statics.aClass61_2002.anIntArray439.length > anLocalInt); anLocalInt++)
                this.anIntArray6792[anLocalInt] = -1;
        }
        Class354 class354 = method1831();
        int anLocalInt = 256;
        if (class354.anIntArray2957 != null && class354.anIntArray2957[argument_104_] > 0)
            anLocalInt = class354.anIntArray2957[argument_104_];
        if (argument_106_ != -1) {
            if (this.anIntArray6792[argument_104_] == -1)
                this.anIntArray6792[argument_104_] = (this.aClass271_6780.method3372(MathStatics.XOR(argument_105_, 69)));
            int anLocalInt_107_ = (this.anIntArray6792[argument_104_]);
            int anLocalInt_108_ = argument_106_ - anLocalInt_107_;
            if (-anLocalInt <= anLocalInt_108_ && anLocalInt >= anLocalInt_108_) {
                this.anIntArray6792[argument_104_] = argument_106_;
                return true;
            }
            if ((anLocalInt_108_ <= 0 || anLocalInt_108_ > 8192) && anLocalInt_108_ > -8192)
                this.anIntArray6792[argument_104_] = MathStatics.AND(anLocalInt_107_ - anLocalInt, 16383);
            else
                this.anIntArray6792[argument_104_] = MathStatics.AND(16383, anLocalInt_107_ + anLocalInt);
            return false;
        }
        if (this.anIntArray6792[argument_104_] == -1)
            return true;
        int anLocalInt_109_ = this.aClass271_6780.method3372(argument_105_ ^ 0x45);
        int anLocalInt_110_ = this.anIntArray6792[argument_104_];
        int anLocalInt_111_ = anLocalInt_109_ - anLocalInt_110_;
        if (anLocalInt_111_ >= -anLocalInt && anLocalInt >= anLocalInt_111_) {
            this.anIntArray6792[argument_104_] = -1;
            for (int anLocalInt_112_ = 0; (Statics.aClass61_2002.anIntArray439.length > anLocalInt_112_); anLocalInt_112_++) {
                if ((this.anIntArray6792[anLocalInt_112_]) != -1)
                    return true;
            }
            this.anIntArray6792 = null;
            return true;
        }
        if ((anLocalInt_111_ <= 0 || anLocalInt_111_ > 8192) && anLocalInt_111_ > -8192)
            this.anIntArray6792[argument_104_] = MathStatics.AND(anLocalInt_110_ - anLocalInt, 16383);
        else
            this.anIntArray6792[argument_104_] = MathStatics.AND(anLocalInt_110_ + anLocalInt, 16383);
        return false;
    }

    final void method1833(Class167[] argument_113_, int argument_114_, GraphicsToolkit argument_115_, Class350 argument_116_, boolean argument_117_) {
        if (!argument_117_) {
            int anLocalInt = 0;
            int anLocalInt_118_ = 0;
            int anLocalInt_119_ = 0;
            int anLocalInt_120_ = 0;
            int anLocalInt_121_ = -1;
            int anLocalInt_122_ = -1;
            Class38[][] class38s = new Class38[argument_113_.length][];
            Class185[][] class185s = new Class185[argument_113_.length][];
            for (int anLocalInt_123_ = 0; argument_113_.length > anLocalInt_123_; anLocalInt_123_++) {
                if (argument_113_[anLocalInt_123_] != null) {
                    argument_113_[anLocalInt_123_].method2656(argument_116_);
                    class38s[anLocalInt_123_] = argument_113_[anLocalInt_123_].method2641();
                    class185s[anLocalInt_123_] = argument_113_[anLocalInt_123_].method2655();
                    if (class38s[anLocalInt_123_] != null) {
                        anLocalInt_118_++;
                        anLocalInt_121_ = anLocalInt_123_;
                        anLocalInt += class38s[anLocalInt_123_].length;
                    }
                    if (class185s[anLocalInt_123_] != null) {
                        anLocalInt_119_ += class185s[anLocalInt_123_].length;
                        anLocalInt_122_ = anLocalInt_123_;
                        anLocalInt_120_++;
                    }
                }
            }
            if ((this.aClass104_Sub7_6804 == null || this.aClass104_Sub7_6804.aBoolean4563) && (anLocalInt_118_ > 0 || anLocalInt_120_ > 0))
                this.aClass104_Sub7_6804 = DoublyLinkedNodeP2_Sub7.method1931(Class333.anInt2720, true);
            if (this.aClass104_Sub7_6804 != null) {
                Object object = null;
                Class38[] class38s_124_;
                if (anLocalInt_118_ == 1)
                    class38s_124_ = class38s[anLocalInt_121_];
                else {
                    class38s_124_ = new Class38[anLocalInt];
                    int anLocalInt_125_ = 0;
                    for (int anLocalInt_126_ = 0; anLocalInt_126_ < argument_113_.length; anLocalInt_126_++) {
                        if (class38s[anLocalInt_126_] != null) {
                            JagStrings.memcpy(class38s[anLocalInt_126_], 0, class38s_124_, anLocalInt_125_, (class38s[anLocalInt_126_]).length);
                            anLocalInt_125_ += class38s[anLocalInt_126_].length;
                        }
                    }
                }
                Object object_127_ = null;
                Class185[] class185s_128_;
                if (anLocalInt_120_ == 1)
                    class185s_128_ = class185s[anLocalInt_122_];
                else {
                    class185s_128_ = new Class185[anLocalInt_119_];
                    int anLocalInt_129_ = 0;
                    for (int anLocalInt_130_ = 0; anLocalInt_130_ < argument_113_.length; anLocalInt_130_++) {
                        if (class185s[anLocalInt_130_] != null) {
                            JagStrings.memcpy(class185s[anLocalInt_130_], 0, class185s_128_, anLocalInt_129_, (class185s[anLocalInt_130_]).length);
                            anLocalInt_129_ += class185s[anLocalInt_130_].length;
                        }
                    }
                }
                this.aClass104_Sub7_6804.method1925(argument_115_, (long) Class333.anInt2720, class38s_124_, class185s_128_, false);
                this.aBoolean6795 = true;
            }
        } else if (this.aClass104_Sub7_6804 != null)
            this.aClass104_Sub7_6804.method1922((long) Class333.anInt2720);
        if (this.aClass104_Sub7_6804 != null)
            this.aClass104_Sub7_6804.method1929(this.lightingHL, this.left, this.right, this.bottom, this.top);
    }

    final int method1774(int argument_131_) {
        if (argument_131_ != -13878)
            this.anInt6789 = -120;
        return this.anInt6789;
    }

    abstract int method1834(int argument_132_);

    final void method1835(int argument_133_) {
        this.anInt6798 = 0;
        this.anInt6803 = 0;
    }

    final void method1836(int argument_134_, Class167 argument_135_) {
        int anLocalInt = aClass271_6793.anInt2166;
        int anLocalInt_136_ = aClass271_6794.anInt2166;
        if (anLocalInt != 0 || anLocalInt_136_ != 0) {
            int anLocalInt_137_ = argument_135_.fa() / 2;
            argument_135_.H(0, -anLocalInt_137_, 0);
            argument_135_.VA(anLocalInt & 0x3fff);
            argument_135_.FA(anLocalInt_136_ & 0x3fff);
            argument_135_.H(0, anLocalInt_137_, 0);
        }
    }

    int method1837(byte argument_138_) {
        Class354 class354 = method1831();
        int anLocalInt;
        if (class354.anInt2994 != -1)
            anLocalInt = class354.anInt2994;
        else if (this.anInt6730 == -32768)
            anLocalInt = 200;
        else
            anLocalInt = -this.anInt6730;
        Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676[this.lightingHL][this.worldX >> LightingManager.lightCoordRShift][this.worldZ >> LightingManager.lightCoordRShift]);
        if (class148 != null && class148.aClass104_Sub2_Sub4_1134 != null)
            return (class148.aClass104_Sub2_Sub4_1134.aShort6424 + anLocalInt);
        return anLocalInt;
    }

    final void method1838(int argument_139_, int argument_140_) {
        anInt6772 = argument_140_;
    }

    final boolean method1772(int argument_141_) {
        if (argument_141_ != 0)
            method1822(0);
        return this.aBoolean6797;
    }

    abstract int method1839(boolean argument_142_);

    final int method1781(int argument_143_) {
        if (argument_143_ != 748449288)
            method1822(16);
        if (this.anInt6730 == -32768)
            return 0;
        return this.anInt6730;
    }

    final void method1840(int argument_144_, boolean argument_145_, int argument_146_) {
        Class354 class354 = method1831();
        if (argument_145_ || class354.anInt2981 != 0 || this.anInt6727 != 0) {
            this.anInt6784 = argument_146_ & argument_144_;
            this.aClass271_6780.method3371(this.anInt6784, (byte) 92);
        }
    }
}
