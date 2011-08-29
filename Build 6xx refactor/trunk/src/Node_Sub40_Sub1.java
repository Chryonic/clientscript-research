/* Class59_Sub40_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub40_Sub1 extends Node_Sub40
{
    boolean aBoolean6135;
    byte[] aByteArray6136;
    int anInt6137;
    int anInt6138;
    int anInt6139;
    
    final Node_Sub40_Sub1 method1074(Class213 argument_0_) {
	((Node_Sub40_Sub1) this).aByteArray6136
	    = argument_0_
		  .method2983(((Node_Sub40_Sub1) this).aByteArray6136, -86);
	((Node_Sub40_Sub1) this).anInt6139
	    = argument_0_.method2982(((Node_Sub40_Sub1) this).anInt6139,
				     (byte) 82);
	if (((Node_Sub40_Sub1) this).anInt6138
	    == ((Node_Sub40_Sub1) this).anInt6137)
	    ((Node_Sub40_Sub1) this).anInt6138
		= ((Node_Sub40_Sub1) this).anInt6137
		= argument_0_.method2984((byte) -128,
					 (((Node_Sub40_Sub1) this)
					  .anInt6138));
	else {
	    ((Node_Sub40_Sub1) this).anInt6138
		= argument_0_.method2984((byte) -112,
					 (((Node_Sub40_Sub1) this)
					  .anInt6138));
	    ((Node_Sub40_Sub1) this).anInt6137
		= argument_0_.method2984((byte) -101,
					 (((Node_Sub40_Sub1) this)
					  .anInt6137));
	    if (((Node_Sub40_Sub1) this).anInt6138
		== ((Node_Sub40_Sub1) this).anInt6137)
		((Node_Sub40_Sub1) this).anInt6138--;
	}
	return this;
    }
    
    Node_Sub40_Sub1(int argument_1_, byte[] argument_2_, int argument_3_,
                    int argument_4_) {
	((Node_Sub40_Sub1) this).anInt6139 = argument_1_;
	((Node_Sub40_Sub1) this).aByteArray6136 = argument_2_;
	((Node_Sub40_Sub1) this).anInt6138 = argument_3_;
	((Node_Sub40_Sub1) this).anInt6137 = argument_4_;
    }
    
    Node_Sub40_Sub1(int argument_5_, byte[] argument_6_, int argument_7_,
                    int argument_8_, boolean argument_9_) {
	((Node_Sub40_Sub1) this).anInt6139 = argument_5_;
	((Node_Sub40_Sub1) this).aByteArray6136 = argument_6_;
	((Node_Sub40_Sub1) this).anInt6138 = argument_7_;
	((Node_Sub40_Sub1) this).anInt6137 = argument_8_;
	((Node_Sub40_Sub1) this).aBoolean6135 = argument_9_;
    }
}
