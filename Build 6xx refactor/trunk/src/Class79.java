/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79
{
    static Class115 aClass115_561;
    static Class368[] aClass368Array562;
    static int anInt563;
    static JagexSocket aJagexSocket_564;
    static char[] aCharArray565
	= { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
	    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
	    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    int anInt566 = 0;
    
    public static void method1579(int argument) {
	aClass115_561 = null;
	aClass368Array562 = null;
	aJagexSocket_564 = null;
	aCharArray565 = null;
    }
    
    final void method1580(byte argument_0_, Packet argument_1_) {
	for (;;) {
	    int anLocalInt = argument_1_.g1();
	    if (anLocalInt == 0)
		break;
	    method1581(anLocalInt, -13991, argument_1_);
	}
    }
    
    private final void method1581(int argument_2_, int argument_3_,
				  Packet argument_4_) {
	if (argument_3_ != -13991)
	    method1580((byte) 61, null);
	if (argument_2_ == 5)
	    ((Class79) this).anInt566 = argument_4_.g2();
    }

    static final void method1583(byte argument) {
	Node_Sub23.anInt4057 = 0;
	int anLocalInt
	    = (MapRelated.baseX
	       + (((DoublyLinkedNodeP2_Sub2)
		   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).worldX
		  >> 9));
	int anLocalInt_8_
	    = (((((DoublyLinkedNodeP2_Sub2) Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
		 .worldZ)
		>> 9)
	       + MapRelated.baseZ);
	if (anLocalInt >= 3053 && anLocalInt <= 3156 && anLocalInt_8_ >= 3056
	    && anLocalInt_8_ <= 3136)
	    Node_Sub23.anInt4057 = 1;
	if (anLocalInt >= 3072 && anLocalInt <= 3118 && anLocalInt_8_ >= 9492
	    && anLocalInt_8_ <= 9535)
	    Node_Sub23.anInt4057 = 1;
	if (Node_Sub23.anInt4057 == 1 && anLocalInt >= 3139
	    && anLocalInt <= 3199 && anLocalInt_8_ >= 3008
	    && anLocalInt_8_ <= 3062)
	    Node_Sub23.anInt4057 = 0;
    }
    
    static final void method1584(byte argument,
				 Node_Sub28_Sub1 argument_9_) {
	for (int anLocalInt = 0;
	     anLocalInt < DoublyLinkedNodeP2_Sub2_Sub1_Sub2.anInt6562; anLocalInt++) {
	    int anLocalInt_10_ = Class256_Sub1.anIntArray5620[anLocalInt];
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		   [anLocalInt_10_]);
	    int anLocalInt_11_ = argument_9_.g1();
	    if ((anLocalInt_11_ & 0x10) != 0)
		anLocalInt_11_ += argument_9_.g1() << 8;
	    if ((anLocalInt_11_ & 0x800) != 0)
		anLocalInt_11_ += argument_9_.g1() << 16;
	    Class266.method3351(argument_9_, anLocalInt_10_,
				class104_sub2_sub2_sub5_sub2, anLocalInt_11_,
				(byte) -90);
	}
    }
    
    public Class79() {
	/* empty */
    }
    
    static {
	anInt563 = 500;
    }
}
