/* Class59_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub31 extends Node
{
    Class97 aClass97_4135;
    Node_Sub31[] aClass59_Sub31Array4136;
    Class341 aClass341_4137;
    boolean aBoolean4138;
    int anInt4139;
    
    final int[] method864(int argument_0_, int argument_1_, byte argument_2_) {
	if (((Node_Sub31)
	     ((Node_Sub31) this).aClass59_Sub31Array4136[argument_1_])
	    .aBoolean4138)
	    return ((Node_Sub31) this).aClass59_Sub31Array4136
		       [argument_1_].method867((byte) 115, argument_0_);
	return (((Node_Sub31) this).aClass59_Sub31Array4136[argument_1_]
		    .method870
		(argument_0_, (byte) -9)[0]);
    }
    
    void method865(boolean argument_3_) {
	/* empty */
    }
    
    void method866(int argument_4_, int argument_5_, int argument_6_) {
	int anLocalInt = (((Node_Sub31) this).anInt4139 != 255
			  ? ((Node_Sub31) this).anInt4139 : argument_5_);
	if (!((Node_Sub31) this).aBoolean4138)
	    ((Node_Sub31) this).aClass341_4137
		= new Class341(anLocalInt, argument_5_, argument_4_);
	else
	    ((Node_Sub31) this).aClass97_4135
		= new Class97(anLocalInt, argument_5_, argument_4_);
    }
    
    int[] method867(byte argument_7_, int argument_8_) {
	throw new IllegalStateException
		  ("This operation does not have a monochrome output");
    }
    
    void method868(Packet argument_9_, int argument_10_,
		   byte argument_11_) {
	/* empty */
    }
    
    final int[][] method869(int argument_12_, int argument_13_,
			    int argument_14_) {
	if (!((Node_Sub31) (((Node_Sub31) this).aClass59_Sub31Array4136
			       [argument_12_])).aBoolean4138)
	    return ((Node_Sub31) this).aClass59_Sub31Array4136
		       [argument_12_].method870(argument_14_, (byte) -9);
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass59_Sub31Array4136[argument_12_]
		  .method867((byte) 118, argument_14_);
	int[][] anLocalInts_15_ = new int[3][];
	anLocalInts_15_[1] = anLocalInts;
	anLocalInts_15_[0] = anLocalInts;
	anLocalInts_15_[2] = anLocalInts;
	return anLocalInts_15_;
    }
    
    int[][] method870(int argument_16_, byte argument_17_) {
	throw new IllegalStateException
		  ("This operation does not have a colour output");
    }
    
    int method871(byte argument_18_) {
	return -1;
    }
    
    int method872(byte argument_19_) {
	return -1;
    }
    
    void method873(int argument_20_) {
	if (((Node_Sub31) this).aBoolean4138) {
	    ((Node_Sub31) this).aClass97_4135.method1719((byte) 95);
	    ((Node_Sub31) this).aClass97_4135 = null;
	} else {
	    ((Node_Sub31) this).aClass341_4137.method3784(2);
	    ((Node_Sub31) this).aClass341_4137 = null;
	}
    }
    
    Node_Sub31(int argument_21_, boolean argument_22_) {
	((Node_Sub31) this).aBoolean4138 = argument_22_;
	((Node_Sub31) this).aClass59_Sub31Array4136
	    = new Node_Sub31[argument_21_];
    }
}
