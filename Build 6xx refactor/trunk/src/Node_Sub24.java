/* Class59_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub24 extends Node
{
    private int anInt4059;
    int anInt4060;
    private int anInt4061;
    int anInt4062;
    static Class31 aClass31_4063 = new Class31();
    private int anInt4064;
    int anInt4065;
    private int anInt4066;
    int anInt4067;
    private int anInt4068;
    
    final void method746(int argument_0_, int[] argument_1_, byte argument_2_,
			 int argument_3_) {
	argument_1_[2]
	    = -((Node_Sub24) this).anInt4060 + anInt4068 + argument_0_;
	argument_1_[1]
	    = anInt4059 + (-((Node_Sub24) this).anInt4065 + argument_3_);
	argument_1_[0] = anInt4061;
    }
    
    static final void method747(Class266 argument, GraphicsToolkit argument_4_,
				int argument_5_, int argument_6_,
				int argument_7_, int argument_8_) {
	Class181 class181
	    = Class206.aClass374_1482
		  .method4083(((Class266) argument).anInt2058, (byte) -104);
	if (((Class181) class181).anInt1371 != -1) {
	    if (!((Class266) argument).aBoolean2098)
		argument_5_ = 0;
	    else {
		argument_5_ += ((Class266) argument).anInt2072;
		argument_5_ &= 0x3;
	    }
	    Class368 class368
		= class181.method2840(argument_5_, -14563,
				      ((Class266) argument).aBoolean2101,
				      argument_4_);
	    if (class368 != null) {
		int anLocalInt = ((Class266) argument).anInt2128;
		int anLocalInt_9_ = ((Class266) argument).anInt2131;
		if ((argument_5_ & 0x1) == 1) {
		    anLocalInt = ((Class266) argument).anInt2131;
		    anLocalInt_9_ = ((Class266) argument).anInt2128;
		}
		int anLocalInt_10_ = class368.getWidth();
		int anLocalInt_11_ = class368.method4018();
		if (((Class181) class181).aBoolean1374) {
		    anLocalInt_10_ = anLocalInt * 4;
		    anLocalInt_11_ = anLocalInt_9_ * 4;
		}
		if (((Class181) class181).anInt1372 != 0)
		    class368.method4016(argument_8_,
					argument_6_ + 4 - anLocalInt_9_ * 4,
					anLocalInt_10_, anLocalInt_11_, 0,
					(((Class181) class181).anInt1372
					 | ~0xffffff),
					1);
		else
		    class368.method4011(argument_8_,
					-(anLocalInt_9_ * 4) + 4 + argument_6_,
					anLocalInt_10_, anLocalInt_11_);
	    }
	}
    }
    
    final void method748(int argument_12_, int[] argument_13_,
			 int argument_14_, int argument_15_) {
	argument_13_[0] = 0;
	argument_13_[1]
	    = -anInt4059 + ((Node_Sub24) this).anInt4065 + argument_12_;
	argument_13_[2]
	    = argument_14_ + (((Node_Sub24) this).anInt4060 - anInt4068);
    }
    
    public static void method749(byte argument) {
	aClass31_4063 = null;
    }
    
    final boolean method750(int argument_16_, int argument_17_,
			    int argument_18_, int argument_19_) {
	if (anInt4061 != argument_19_ || argument_17_ < anInt4059
	    || anInt4066 < argument_17_ || anInt4068 > argument_16_
	    || anInt4064 < argument_16_)
	    return false;
	return true;
    }
    
    final boolean method751(int argument_20_, int argument_21_,
			    int argument_22_) {
	if (argument_21_ < ((Node_Sub24) this).anInt4065
	    || argument_21_ > ((Node_Sub24) this).anInt4062
	    || argument_20_ < ((Node_Sub24) this).anInt4060
	    || ((Node_Sub24) this).anInt4067 < argument_20_)
	    return false;
	return true;
    }
    
    final boolean method752(int argument_23_, byte argument_24_,
			    int argument_25_) {
	if (argument_23_ >= anInt4059 && anInt4066 >= argument_23_
	    && anInt4068 <= argument_25_ && argument_25_ <= anInt4064)
	    return true;
	return false;
    }
    
    static final boolean method753(int argument, int argument_26_,
				   int argument_27_, int argument_28_) {
	Statics.aClass350_2673.method3829(argument_27_, argument_26_,
					   argument,
					   DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405);
	int anLocalInt = DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2];
	if (anLocalInt < 50)
	    return false;
	DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0]
	    = Class_aa_Sub1.anInt3749 + (DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[0]
					 * Exception_Sub1.anInt50
					 / anLocalInt);
	DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[argument_28_]
	    = (Class245_Sub1_Sub1.anInt6517
	       + (DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[1] * Class332.anInt2716
		  / anLocalInt));
	DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6405[2] = anLocalInt;
	return true;
    }
    
    Node_Sub24(int argument_29_, int argument_30_, int argument_31_,
               int argument_32_, int argument_33_, int argument_34_,
               int argument_35_, int argument_36_, int argument_37_) {
	anInt4061 = argument_29_;
	((Node_Sub24) this).anInt4060 = argument_35_;
	anInt4068 = argument_31_;
	anInt4066 = argument_32_;
	((Node_Sub24) this).anInt4065 = argument_34_;
	((Node_Sub24) this).anInt4062 = argument_36_;
	((Node_Sub24) this).anInt4067 = argument_37_;
	anInt4059 = argument_30_;
	anInt4064 = argument_33_;
    }
}
