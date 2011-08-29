/* Class214_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class214_Sub1 extends Class214
{
    int anInt5652;
    static Class149 aClass149_5653 = new Class149(4);
    static DoublyLinkedNode_Sub51_Sub6[] aClass59_Sub51_Sub6Array5655
	= new DoublyLinkedNode_Sub51_Sub6[14];
    
    static final void method2987(int argument, int argument_0_,
				 int argument_1_, int argument_2_,
				 int argument_3_) {
	if (argument_0_ >= Node_Sub35.anInt4156
	    && Node_Sub9_Sub2.anInt5776 >= argument_0_) {
	    argument
		= Node_Sub31_Sub8.method897(argument, Class209.anInt1504,
                124915076,
                Node_Sub31_Sub13.anInt5896);
	    argument_3_
		= Node_Sub31_Sub8.method897(argument_3_, Class209.anInt1504,
                124915076,
                Node_Sub31_Sub13.anInt5896);
	    Class376.method4090(argument_3_, true, argument_1_, argument_0_,
				argument);
	}
    }
    
    Class214_Sub1(int argument_4_, Class349 argument_5_, Class44 argument_6_,
		  int argument_7_, int argument_8_, int argument_9_) {
	super(argument_4_, argument_5_, argument_6_, argument_7_, argument_8_);
	((Class214_Sub1) this).anInt5652 = argument_9_;
    }
    
    static final void method2988(Node_Sub28_Sub1 argument, int argument_10_,
				 int argument_11_) {
	DoublyLinkedNodeP2_Sub2_Sub1_Sub2.anInt6562 = 0;
	Node_Sub31_Sub34.aBoolean6006 = false;
	Class256_Sub1.method3281(argument, (byte) 38);
	Class79.method1584((byte) -65, argument);
	if (Node_Sub31_Sub34.aBoolean6006)
	    System.out.println("---endgpp---");
	if (((Packet) argument).pos != argument_10_)
	    throw new RuntimeException("gpi1 pos:"
				       + ((Packet) argument).pos
				       + " psize:" + argument_10_);
    }
    
    public final Class128 method68(byte argument_12_) {
	if (argument_12_ >= -35)
	    method2988(null, -81, 102);
	return Node_Sub31_Sub31.aClass128_5995;
    }
    
    public static void method2989(boolean argument) {
	GlToolkitNr1Program.resultsArray = null;
	aClass149_5653 = null;
	aClass59_Sub51_Sub6Array5655 = null;
    }
}
