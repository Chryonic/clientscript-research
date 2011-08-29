/* Class59_Sub31_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub8 extends Node_Sub31
{
    static CyclicLinkedList aCyclicLinkedList_5872 = new CyclicLinkedList();
    private Class133[] aClass133Array5873;
    
    static final int method897(int argument, int argument_0_, int argument_1_,
			       int argument_2_) {
	if (argument < argument_0_)
	    return argument_0_;
	if (argument <= argument_2_)
	    return argument;
	return argument_2_;
    }
    
    final void method868(Packet argument_3_, int argument_4_,
			 byte argument_5_) {
	if (argument_4_ != 0) {
	    if (argument_4_ == 1)
		((Node_Sub31) this).aBoolean4138
		    = argument_3_.g1() == 1;
	} else {
	    aClass133Array5873
		= new Class133[argument_3_.g1()];
	    int anLocalInt = 0;
	while_131_:
	    for (/**/; aClass133Array5873.length > anLocalInt; anLocalInt++) {
		int anLocalInt_6_ = argument_3_.g1();
		int anLocalInt_7_ = anLocalInt_6_;
	    while_129_:
		do {
		    do {
			if (anLocalInt_7_ != 0) {
			    if (anLocalInt_7_ != 1) {
				if (anLocalInt_7_ != 2) {
				    if (anLocalInt_7_ != 3)
					continue while_131_;
				} else
				    break;
				break while_129_;
			    }
			} else {
			    aClass133Array5873[anLocalInt]
				= Statics.method1592(argument_3_, -1);
			    continue while_131_;
			}
			aClass133Array5873[anLocalInt]
			    = Class16.method304(argument_3_, (byte) 102);
			continue while_131_;
		    } while (false);
		    aClass133Array5873[anLocalInt]
			= DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.method1848(argument_3_,
								  0);
		    continue while_131_;
		} while (false);
		aClass133Array5873[anLocalInt]
		    = Class4.method219((byte) -88, argument_3_);
	    }
	}
	if (argument_5_ > -41)
	    aCyclicLinkedList_5872 = null;
    }
    
    static final void method898(int argument, int argument_8_, int argument_9_,
				int argument_10_) {
	argument_8_
	    = ((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		  .aClass62_Sub22_4319.method1446(19) * argument_8_ >> 8;
	if (argument_10_ != -1 || Class154.aBoolean3618) {
	    if (argument_10_ != -1
		&& (Statics.anInt3514 != argument_10_
		    || !Class62_Sub21.method1444(122))
		&& argument_8_ != 0 && !Class154.aBoolean3618) {
		Class306.method3599(0, false, argument_9_,
				    Class341.aJs5Store_2881, argument_8_, -118,
				    argument_10_);
		Node_Sub49.method1149(0);
	    }
	} else
	    Class88.method1643(0);
	if (Statics.anInt3514 != argument_10_)
	    Statics.aClass59_Sub9_Sub2_6647 = null;
	Statics.anInt3514 = argument_10_;
    }
    
    final int[] method867(byte argument_11_, int argument_12_) {
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_12_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758)
	    method900(((Node_Sub31) this).aClass97_4135.method1717(0), -82);
	if (argument_11_ <= 21)
	    return null;
	return anLocalInts;
    }
    
    public Node_Sub31_Sub8() {
	super(0, true);
    }
    
    public static void method899(int argument) {
	aCyclicLinkedList_5872 = null;
    }
    
    private final void method900(int[][] argument_13_, int argument_14_) {
	if (argument_14_ > -69)
	    aClass133Array5873 = null;
	int anLocalInt = Statics.anInt294;
	int anLocalInt_15_ = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711;
	Class152.method2551(argument_13_, (byte) -110);
	DoublyLinkedNodeP2_Sub8.method1937(0, Statics.anInt1269, 0,
				 Exception_Sub1.anInt49, 0);
	if (aClass133Array5873 != null) {
	    for (int anLocalInt_16_ = 0;
		 aClass133Array5873.length > anLocalInt_16_;
		 anLocalInt_16_++) {
		Class133 class133 = aClass133Array5873[anLocalInt_16_];
		int anLocalInt_17_ = ((Class133) class133).anInt1069;
		int anLocalInt_18_ = ((Class133) class133).anInt1067;
		if (anLocalInt_17_ < 0) {
		    if (anLocalInt_18_ >= 0)
			class133.method2441((byte) 101, anLocalInt_15_,
					    anLocalInt);
		} else if (anLocalInt_18_ < 0)
		    class133.method2439(anLocalInt, anLocalInt_15_, -7895);
		else
		    class133.method2444((byte) 85, anLocalInt_15_, anLocalInt);
	    }
	}
    }
    
    final int[][] method870(int argument_19_, byte argument_20_) {
	if (argument_20_ != -9)
	    return null;
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 78,
							       argument_19_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882) {
	    int anLocalInt = Statics.anInt294;
	    int anLocalInt_21_ = DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711;
	    int[][] anLocalInts_22_ = new int[anLocalInt_21_][anLocalInt];
	    int[][][] anLocalInts_23_ = ((Node_Sub31) this)
					    .aClass341_4137
					    .method3783((byte) -126);
	    method900(anLocalInts_22_, argument_20_ - 76);
	    for (int anLocalInt_24_ = 0;
		 DoublyLinkedNodeP2_Sub2_Sub2_Sub4.anInt6711 > anLocalInt_24_;
		 anLocalInt_24_++) {
		int[] anLocalInts_25_ = anLocalInts_22_[anLocalInt_24_];
		int[][] anLocalInts_26_ = anLocalInts_23_[anLocalInt_24_];
		int[] anLocalInts_27_ = anLocalInts_26_[0];
		int[] anLocalInts_28_ = anLocalInts_26_[1];
		int[] anLocalInts_29_ = anLocalInts_26_[2];
		for (int anLocalInt_30_ = 0; Statics.anInt294 > anLocalInt_30_;
		     anLocalInt_30_++) {
		    int anLocalInt_31_ = anLocalInts_25_[anLocalInt_30_];
		    anLocalInts_29_[anLocalInt_30_]
			= MathStatics.AND(4080, anLocalInt_31_ << 4);
		    anLocalInts_28_[anLocalInt_30_]
			= MathStatics.AND(65280, anLocalInt_31_) >> 4;
		    anLocalInts_27_[anLocalInt_30_]
			= (MathStatics.AND(16711680, anLocalInt_31_)
			   >> 12);
		}
	    }
	}
	return anLocalInts;
    }
}
