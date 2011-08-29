/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class246
{
    static int anInt1792 = 0;
    static int anInt1793;
    
    static final byte[] method3199(byte argument, int argument_0_,
				   int argument_1_, Object argument_2_) {
	if (argument_2_ == null)
	    return null;
	if (argument_2_ instanceof byte[]) {
	    byte[] anLocalInts = (byte[]) argument_2_;
	    return Class295.method3506(19691, anLocalInts, argument_0_,
				       argument_1_);
	}
	if (argument_2_ instanceof Class183) {
	    Class183 class183 = (Class183) argument_2_;
	    return class183.method2851(argument_0_, argument_1_, 127);
	}
	throw new IllegalArgumentException();
    }
    
    static final void method3200(int argument,
				 Entity argument_3_) {
	if (argument_3_ instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		= (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument_3_;
	    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		 .aClass291_6832)
		!= null)
		Node_Sub31_Sub1.method880
                ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1).lightingHL
                        != (((DoublyLinkedNodeP2_Sub2)
                        Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
                        .lightingHL)),
                        class104_sub2_sub2_sub5_sub1, (byte) 16);
	} else if (argument_3_ instanceof DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_3_;
	    Skybox_Sub2_Sub1.method1514((byte) 77, class104_sub2_sub2_sub5_sub2, (((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2).lightingHL != ((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).lightingHL));
	}
    }
}
