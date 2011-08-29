/* Class59_Sub31_Sub15_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub31_Sub15_Sub1 extends Node_Sub31_Sub15
{
    static int anInt6637;
    static String[] aStringArray6638
	= { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
	    "Oct", "Nov", "Dec" };
    static Class85 aClass85_6639;
    static Class239[] aClass239Array6640;
    
    static final void method919(int argument, int argument_0_) {
	if (Exception_Sub1.anIntArray48 == null
	    || Exception_Sub1.anIntArray48.length < argument_0_)
	    Exception_Sub1.anIntArray48 = new int[argument_0_];
    }
    
    static final void method920(DoublyLinkedNodeP2_Sub2 argument, int argument_1_,
				int argument_2_, int argument_3_,
				int argument_4_, int argument_5_) {
	boolean anLocalBoolean = true;
	int anLocalInt = argument_2_;
	int anLocalInt_6_ = argument_2_ + argument_4_;
	int anLocalInt_7_ = argument_3_ - 1;
	int anLocalInt_8_ = argument_3_ + argument_5_;
	for (int anLocalInt_9_ = argument_1_; anLocalInt_9_ <= argument_1_ + 1;
	     anLocalInt_9_++) {
	    if (anLocalInt_9_ != LightingManager.yMapSize) {
		for (int anLocalInt_10_ = anLocalInt;
		     anLocalInt_10_ <= anLocalInt_6_; anLocalInt_10_++) {
		    if (anLocalInt_10_ >= 0
			&& anLocalInt_10_ < LightingManager.xMapSize) {
			for (int anLocalInt_11_ = anLocalInt_7_;
			     anLocalInt_11_ <= anLocalInt_8_;
			     anLocalInt_11_++) {
			    if (anLocalInt_11_ >= 0
				&& anLocalInt_11_ < LightingManager.zMapSize
				&& (!anLocalBoolean
				    || anLocalInt_10_ >= anLocalInt_6_
				    || anLocalInt_11_ >= anLocalInt_8_
				    || (anLocalInt_11_ < argument_3_
					&& anLocalInt_10_ != argument_2_))) {
				Class148 class148
				    = (GraphicsToolkit_Sub2
				       .aClass148ArrayArrayArray4676
				       [anLocalInt_9_][anLocalInt_10_]
				       [anLocalInt_11_]);
				if (class148 != null) {
				    int anLocalInt_12_
					= (((Node_Sub31_Sub5
						 .aClass_sArray5858
						 [anLocalInt_9_].method3534
					     (anLocalInt_10_, false,
					      anLocalInt_11_))
					    + (Node_Sub31_Sub5
						   .aClass_sArray5858
						   [anLocalInt_9_].method3534
					       (anLocalInt_10_ + 1, false,
						anLocalInt_11_))
					    + (Node_Sub31_Sub5
						   .aClass_sArray5858
						   [anLocalInt_9_].method3534
					       (anLocalInt_10_, false,
						anLocalInt_11_ + 1))
					    + (Node_Sub31_Sub5
						   .aClass_sArray5858
						   [anLocalInt_9_].method3534
					       (anLocalInt_10_ + 1, false,
						anLocalInt_11_ + 1))) / 4
					   - ((Node_Sub31_Sub5
						   .aClass_sArray5858
						   [argument_1_].method3534
					       (argument_2_, false,
						argument_3_))
					      + (Node_Sub31_Sub5
						     .aClass_sArray5858
						     [argument_1_].method3534
						 (argument_2_ + 1, false,
						  argument_3_))
					      + (Node_Sub31_Sub5
						     .aClass_sArray5858
						     [argument_1_].method3534
						 (argument_2_, false,
						  argument_3_ + 1))
					      + (Node_Sub31_Sub5
						     .aClass_sArray5858
						     [argument_1_].method3534
						 (argument_2_ + 1, false,
						  argument_3_ + 1))) / 4);
				    DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3
					= (((Class148) class148)
					   .aClass104_Sub2_Sub3_1124);
				    DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3_13_
					= (((Class148) class148)
					   .aClass104_Sub2_Sub3_1123);
				    if (class104_sub2_sub3 != null
					&& class104_sub2_sub3.method1782(-1))
					argument.method1775
					    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
					      .aGraphicsToolkit6834),
					     class104_sub2_sub3,
					     anLocalBoolean, -73,
					     (((anLocalInt_10_ - argument_2_)
					       * Class110.anInt909)
					      + ((1 - argument_4_)
						 * LightingManager.attenuationOffset)),
					     anLocalInt_12_,
					     (((anLocalInt_11_ - argument_3_)
					       * Class110.anInt909)
					      + ((1 - argument_5_)
						 * LightingManager.attenuationOffset)));
				    if (class104_sub2_sub3_13_ != null
					&& class104_sub2_sub3_13_
					       .method1782(-1))
					argument.method1775
					    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
					      .aGraphicsToolkit6834),
					     class104_sub2_sub3_13_,
					     anLocalBoolean, -120,
					     (((anLocalInt_10_ - argument_2_)
					       * Class110.anInt909)
					      + ((1 - argument_4_)
						 * LightingManager.attenuationOffset)),
					     anLocalInt_12_,
					     (((anLocalInt_11_ - argument_3_)
					       * Class110.anInt909)
					      + ((1 - argument_5_)
						 * LightingManager.attenuationOffset)));
				    for (Class110 class110
					     = (((Class148) class148)
						.aClass110_1126);
					 class110 != null;
					 class110 = (((Class110) class110)
						     .aClass110_912)) {
					DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
					    = (((Class110) class110)
					       .aClass104_Sub2_Sub2_911);
					if (class104_sub2_sub2 != null
					    && class104_sub2_sub2
						   .method1782(-1)
					    && ((anLocalInt_10_
						 == (((DoublyLinkedNodeP2_Sub2_Sub2)
						      class104_sub2_sub2)
						     .left))
						|| (anLocalInt_10_
						    == anLocalInt))
					    && ((anLocalInt_11_
						 == (((DoublyLinkedNodeP2_Sub2_Sub2)
						      class104_sub2_sub2)
						     .bottom))
						|| (anLocalInt_11_
						    == anLocalInt_7_))) {
					    int anLocalInt_14_
						= ((((DoublyLinkedNodeP2_Sub2_Sub2)
						     class104_sub2_sub2)
						    .right)
						   - (((DoublyLinkedNodeP2_Sub2_Sub2)
						       class104_sub2_sub2)
						      .left)
						   + 1);
					    int anLocalInt_15_
						= ((((DoublyLinkedNodeP2_Sub2_Sub2)
						     class104_sub2_sub2)
						    .top)
						   - (((DoublyLinkedNodeP2_Sub2_Sub2)
						       class104_sub2_sub2)
						      .bottom)
						   + 1);
					    argument.method1775
						((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
						  .aGraphicsToolkit6834),
						 class104_sub2_sub2,
						 anLocalBoolean, -118,
						 ((((((DoublyLinkedNodeP2_Sub2_Sub2)
						      class104_sub2_sub2)
						     .left)
						    - argument_2_)
						   * Class110.anInt909)
						  + ((anLocalInt_14_
						      - argument_4_)
						     * LightingManager.attenuationOffset)),
						 anLocalInt_12_,
						 ((((((DoublyLinkedNodeP2_Sub2_Sub2)
						      class104_sub2_sub2)
						     .bottom)
						    - argument_3_)
						   * Class110.anInt909)
						  + ((anLocalInt_15_
						      - argument_5_)
						     * LightingManager.attenuationOffset)));
					}
				    }
				}
			    }
			}
		    }
		}
		anLocalInt--;
		anLocalBoolean = false;
	    }
	}
    }
    
    static final DoublyLinkedNodeP2_Sub2_Sub3 method921(int argument, int argument_16_,
					      int argument_17_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_16_][argument_17_]);
	if (class148 == null)
	    return null;
	return ((Class148) class148).aClass104_Sub2_Sub3_1124;
    }
    
    static final DoublyLinkedNode_Sub51_Sub3 method922(int argument, int argument_18_,
					      long argument_19_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = ((DoublyLinkedNode_Sub51_Sub3)
	       Class133_Sub1.aJagexHashMap_5007
		   .get((long) argument << 56 | argument_19_));
	if (class59_sub51_sub3 == null) {
	    class59_sub51_sub3
		= new DoublyLinkedNode_Sub51_Sub3(argument, argument_19_);
	    Class133_Sub1.aJagexHashMap_5007.put((((Node) class59_sub51_sub3).hash), class59_sub51_sub3);
	}
	return class59_sub51_sub3;
    }
    
    static final String method923(byte argument, int[] argument_20_) {
	StringBuffer stringbuffer = new StringBuffer();
	int anLocalInt = Node_Sub47.anInt4287;
	for (int anLocalInt_21_ = 0; argument_20_.length > anLocalInt_21_;
	     anLocalInt_21_++) {
	    Class351 class351
		= Class349.aClass313_2918
		      .method3623((byte) -18, argument_20_[anLocalInt_21_]);
	    if (((Class351) class351).anInt2931 != -1) {
		Class368 class368
		    = ((Class368)
		       (Class350_Sub1.aClass149_5423.get((long) ((Class351) class351).anInt2931)));
		if (class368 == null) {
		    Class83 class83
			= Class83.method1612(Class205.aJs5Store_1472,
					     ((Class351) class351).anInt2931,
					     0);
		    if (class83 != null) {
			class368
			    = Class389.aGraphicsToolkit3281.method2033(class83, true);
			Class350_Sub1.aClass149_5423.put(class368, (long) ((Class351) class351).anInt2931);
		    }
		}
		if (class368 != null) {
		    dba_sub_772_Sub2.aClass368Array6368[anLocalInt] = class368;
		    stringbuffer.append(" <img=").append(anLocalInt)
			.append(">");
		    anLocalInt++;
		}
	    }
	}
	return stringbuffer.toString();
    }
    
    public static void method924(boolean argument) {
	aClass239Array6640 = null;
	aClass85_6639 = null;
	aStringArray6638 = null;
    }
    
    final int[][] method870(int argument_22_, byte argument_23_) {
	int[][] anLocalInts
	    = ((Node_Sub31) this).aClass341_4137.method3785((byte) 69,
							       argument_22_);
	if (((Class341) ((Node_Sub31) this).aClass341_4137).aBoolean2882
	    && this.method917(-26298)) {
	    int[] anLocalInts_24_ = anLocalInts[0];
	    int[] anLocalInts_25_ = anLocalInts[1];
	    int[] anLocalInts_26_ = anLocalInts[2];
	    int anLocalInt
		= (argument_22_ % ((Node_Sub31_Sub15) this).anInt5903
		   * ((Node_Sub31_Sub15) this).anInt5903);
	    for (int anLocalInt_27_ = 0; Statics.anInt294 > anLocalInt_27_;
		 anLocalInt_27_++) {
		int anLocalInt_28_
		    = (((Node_Sub31_Sub15) this).anIntArray5905
		       [anLocalInt + anLocalInt_27_ % ((Node_Sub31_Sub15)
						       this).anInt5904]);
		anLocalInts_26_[anLocalInt_27_]
		    = MathStatics.AND(255, anLocalInt_28_) << 4;
		anLocalInts_25_[anLocalInt_27_]
		    = MathStatics.AND(65280, anLocalInt_28_) >> 4;
		anLocalInts_24_[anLocalInt_27_]
		    = MathStatics.AND(anLocalInt_28_, 16711680) >> 12;
	    }
	}
	if (argument_23_ != -9)
	    return null;
	return anLocalInts;
    }
    
    public Node_Sub31_Sub15_Sub1() {
	/* empty */
    }
    
    static final void method925(int argument) {
	Class2_Sub2.anInt3768 = 0;
	Node_Sub45.anInt4264 = 0;
	for (int anLocalInt = 0; anLocalInt < Class24.anInt161; anLocalInt++) {
	    int anLocalInt_29_ = anLocalInt * Class85.anInt604;
	    for (int anLocalInt_30_ = 0; anLocalInt_30_ < Class85.anInt604;
		 anLocalInt_30_++) {
		int anLocalInt_31_ = anLocalInt_30_ + anLocalInt_29_;
		Class301.anInterface15Array2529[anLocalInt_31_].method60
		    (Node_Sub31_Sub2.anInt5844 * anLocalInt_30_,
		     Class5.anInt67 * anLocalInt, Node_Sub31_Sub2.anInt5844,
		     Class5.anInt67, 0, 0, true, true);
	    }
	}
    }
    
    static {
	anInt6637 = 0;
	aClass85_6639 = new Class85();
	aClass239Array6640 = new Class239[2048];
    }
}
