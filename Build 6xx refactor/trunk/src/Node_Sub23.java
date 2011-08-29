/* Class59_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub23 extends Node
{
    Class109_Sub1 aClass109_Sub1_4050;
    boolean aBoolean4051;
    boolean aBoolean4052;
    int anInt4053;
    boolean aBoolean4054;
    boolean aBoolean4055;
    static int anInt4056;
    static int anInt4057 = 0;
    int anInt4058;
    
    static final void method744(int argument) {
	Class316.method3638(11, 2);
	Statics.method770((byte) 121);
	System.gc();
    }
    
    static final void method745(int argument) {
	if (client.modeWhere != TestingStageEnum.LOCAL) {
	    try {
		Class328.method3698(client.clientInstance, "tbrefresh",
				    (byte) 123);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
    }
    
    Node_Sub23(int argument_0_, Class109_Sub1 argument_1_, int argument_2_,
               boolean argument_3_) {
	((Node_Sub23) this).aClass109_Sub1_4050 = argument_1_;
	((Node_Sub23) this).anInt4053 = argument_0_;
	((Node_Sub23) this).anInt4058 = argument_2_;
	((Node_Sub23) this).aBoolean4051 = argument_3_;
    }
    
    static {
	anInt4056 = -1;
    }
}
