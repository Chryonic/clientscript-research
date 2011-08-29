/* Class59_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub37 extends Node
{
    static int anInt4165;
    static int[] anIntArray4167
	= { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
    static int[] anIntArray4168 = new int[1000];
    
    public static void method1055(int argument) {
	anIntArray4167 = null;
	anIntArray4168 = null;
	ArbBuffer.genArray = null;
    }
    
    static final void method1056(String argument, int argument_0_) {
	Node_Sub29 class59_sub29 = Class253_Sub1.method3249(93);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.p1
            (((Class212) Class245_Sub2_Sub2.aClass212_6535).anInt1505);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(0);
	int anLocalInt = (((Packet) (((Node_Sub29) class59_sub29)
					    .aClass59_Sub28_Sub1_4129))
			  .pos);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p2(649);
	int[] anLocalInts
	    = Node_Sub31_Sub34.method981((byte) 27, class59_sub29);
	int anLocalInt_1_ = (((Packet) (((Node_Sub29) class59_sub29)
					       .aClass59_Sub28_Sub1_4129))
			     .pos);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .pjstr(argument);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    .p1(client.language);
	((Packet)
	 ((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129).pos
	    += 7;
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.decryptXTEA
	    (
                anLocalInt_1_, ((Packet) (((Node_Sub29) class59_sub29)
                .aClass59_Sub28_Sub1_4129)).pos,
                anLocalInts);
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129.psize2
            (-anLocalInt + (((Packet) (((Node_Sub29) class59_sub29)
                    .aClass59_Sub28_Sub1_4129))
                    .pos)
            );
	Class251.method3243(class59_sub29, true);
	Class62_Sub3.anInt4372 = 0;
	Class245.anInt1784 = 1;
	Skybox_Sub2_Sub1.anInt6394 = 0;
	MenuAction.anInt6282 = -3;
    }
    
    static final void method1057(Class314 argument) {
	Class62_Sub20.aClass314_4431 = argument;
    }
    
    abstract void method1058(int argument_2_, Packet argument_3_);
    
    abstract void method1059(byte argument_4_, ClanChannel argument_5_);
}
