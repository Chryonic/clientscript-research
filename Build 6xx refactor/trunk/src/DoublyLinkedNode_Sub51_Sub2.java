/* Class59_Sub51_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub2 extends DoublyLinkedNode
{
    static float[] aFloatArray6224 = new float[16384];
    DoublyLinkedNodeP2_Sub2_Sub2_Sub4 aClass104_Sub2_Sub2_Sub4_6225;
    static float[] aFloatArray6226 = new float[16384];
    static int[] anIntArray6227;
    static Class140 aClass140_6228;

    public static void method1178(int argument) {
	aClass140_6228 = null;
	aFloatArray6224 = null;
	aFloatArray6226 = null;
	anIntArray6227 = null;
    }
    
    static final void method1179(int argument, int argument_2_,
				 byte argument_3_, int argument_4_,
				 int argument_5_) {
	if (argument_3_ != 53)
	    method1178(-46);
	int anLocalInt = 0;
	int anLocalInt_6_ = argument;
	int anLocalInt_7_ = -argument;
	int anLocalInt_8_ = -1;
	int anLocalInt_9_
	    = Node_Sub31_Sub8.method897(argument + argument_2_,
            Node_Sub35.anInt4156,
            argument_3_ + 124915023,
            Node_Sub9_Sub2.anInt5776);
	int anLocalInt_10_
	    = Node_Sub31_Sub8.method897(-argument + argument_2_,
            Node_Sub35.anInt4156,
            argument_3_ ^ 0x7720db1,
            Node_Sub9_Sub2.anInt5776);
	Statics.method3364(Class223.anIntArrayArray1562[argument_4_], (byte) -107, anLocalInt_10_, anLocalInt_9_, argument_5_);
	while (anLocalInt < anLocalInt_6_) {
	    anLocalInt_8_ += 2;
	    anLocalInt_7_ += anLocalInt_8_;
	    if (anLocalInt_7_ > 0) {
		anLocalInt_6_--;
		anLocalInt_7_ -= anLocalInt_6_ << 1;
		int anLocalInt_11_ = argument_4_ - anLocalInt_6_;
		int anLocalInt_12_ = argument_4_ + anLocalInt_6_;
		if (anLocalInt_12_ >= Class209.anInt1504
		    && Node_Sub31_Sub13.anInt5896 >= anLocalInt_11_) {
		    int anLocalInt_13_
			= (Node_Sub31_Sub8.method897
			   (argument_2_ + anLocalInt, Node_Sub35.anInt4156,
                       124915076, Node_Sub9_Sub2.anInt5776));
		    int anLocalInt_14_
			= (Node_Sub31_Sub8.method897
			   (argument_2_ - anLocalInt, Node_Sub35.anInt4156,
                       124915076, Node_Sub9_Sub2.anInt5776));
		    if (anLocalInt_12_ <= Node_Sub31_Sub13.anInt5896)
			Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_12_]), (byte) -87, anLocalInt_14_, anLocalInt_13_, argument_5_);
		    if (Class209.anInt1504 <= anLocalInt_11_)
			Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_11_]), (byte) 126, anLocalInt_14_, anLocalInt_13_, argument_5_);
		}
	    }
	    anLocalInt++;
	    int anLocalInt_15_ = argument_4_ - anLocalInt;
	    int anLocalInt_16_ = anLocalInt + argument_4_;
	    if (Class209.anInt1504 <= anLocalInt_16_
		&& Node_Sub31_Sub13.anInt5896 >= anLocalInt_15_) {
		int anLocalInt_17_
		    = Node_Sub31_Sub8.method897(argument_2_ + anLocalInt_6_,
                Node_Sub35.anInt4156,
                argument_3_ ^ 0x7720db1,
                (Node_Sub9_Sub2
                        .anInt5776));
		int anLocalInt_18_
		    = Node_Sub31_Sub8.method897(argument_2_ - anLocalInt_6_,
                Node_Sub35.anInt4156,
                124915076,
                (Node_Sub9_Sub2
                        .anInt5776));
		if (anLocalInt_16_ <= Node_Sub31_Sub13.anInt5896)
		    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_16_]), (byte) 98, anLocalInt_18_, anLocalInt_17_, argument_5_);
		if (Class209.anInt1504 <= anLocalInt_15_)
		    Statics.method3364((Class223.anIntArrayArray1562[anLocalInt_15_]), (byte) -109, anLocalInt_18_, anLocalInt_17_, argument_5_);
	    }
	}
    }
    
    DoublyLinkedNode_Sub51_Sub2(DoublyLinkedNodeP2_Sub2_Sub2_Sub4 argument_19_) {
	((DoublyLinkedNode_Sub51_Sub2) this).aClass104_Sub2_Sub2_Sub4_6225
	    = argument_19_;
    }
    
    static {
	double d = 3.834951969714103E-4;
	for (int anLocalInt = 0; anLocalInt < 16384; anLocalInt++) {
	    aFloatArray6224[anLocalInt]
		= (float) Math.sin(d * (double) anLocalInt);
	    aFloatArray6226[anLocalInt]
		= (float) Math.cos((double) anLocalInt * d);
	}
	anIntArray6227 = new int[3];
    }
}
