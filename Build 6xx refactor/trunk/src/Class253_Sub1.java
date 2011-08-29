/* Class253_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class253_Sub1 extends Class253
{
    static Class207 aClass207_5656 = new Class207(47, 3);
    int anInt5657;
    int anInt5658;
    int anInt5659;
    int anInt5660;
    int anInt5661;
    int anInt5662;
    static int anInt5663 = -1;
    static int anInt5666 = 0;
    
    Class253_Sub1(Class349 argument_0_, Class44 argument_1_, int argument_2_,
		  int argument_3_, int argument_4_, int argument_5_,
		  int argument_6_, int argument_7_, int argument_8_,
		  int argument_9_, int argument_10_, int argument_11_,
		  int argument_12_, int argument_13_, int argument_14_) {
	super(argument_0_, argument_1_, argument_2_, argument_3_, argument_4_,
	      argument_5_, argument_6_, argument_7_, argument_8_);
	((Class253_Sub1) this).anInt5661 = argument_11_;
	((Class253_Sub1) this).anInt5658 = argument_9_;
	((Class253_Sub1) this).anInt5657 = argument_10_;
	((Class253_Sub1) this).anInt5659 = argument_12_;
	((Class253_Sub1) this).anInt5660 = argument_14_;
	((Class253_Sub1) this).anInt5662 = argument_13_;
    }
    
    public static void method3247(int argument) {
	Class211.aClass211_5665 = null;
	client.modeWhere = null;
	aClass207_5656 = null;
    }
    
    static final void method3248(byte argument, GraphicsToolkit argument_15_) {
	for (DoublyLinkedNodeP2_Sub7 class104_sub7
		 = (DoublyLinkedNodeP2_Sub7) Statics.aClass366_5518.method3986(0);
	     class104_sub7 != null;
	     class104_sub7 = (DoublyLinkedNodeP2_Sub7) Statics.aClass366_5518
						 .method3992((byte) 50)) {
	    if (((DoublyLinkedNodeP2_Sub7) class104_sub7).aBoolean4571)
		class104_sub7.method1924(argument_15_);
	}
    }
    
    public Class128 method68(byte argument_16_) {
	if (argument_16_ >= -35)
	    return null;
	return Class245_Sub1_Sub1.aClass128_6511;
    }
    
    static final Node_Sub29 method3249(int argument) {
	Node_Sub29 class59_sub29 = Node_Sub31_Sub11.method910(-2);
	((Node_Sub29) class59_sub29).anInt4125 = 0;
	((Node_Sub29) class59_sub29).aClass207_4128 = null;
	((Node_Sub29) class59_sub29).aClass59_Sub28_Sub1_4129
	    = new Node_Sub28_Sub1(5000);
	return class59_sub29;
    }
}
