/* Class353 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class353
{
    GlToolkit toolkit;
    static Class368[] aClass368Array2952;
    static boolean aBoolean2953 = false;
    
    abstract void method3882(int argument_0_, GlTexture argument_1_,
			     int argument_2_);
    
    static boolean method3883(boolean argument, boolean argument_3_) {
	return argument | argument_3_;
    }
    
    abstract void bind(boolean argument_4_, boolean argument_5_);
    
    Class353(GlToolkit argument_6_) {
	((Class353) this).toolkit = argument_6_;
    }
    
    abstract void method3885(int argument_7_, boolean argument_8_);
    
    abstract void configure(int argument_9_, int argument_10_, int argument_11_);
    
    static final int method3887(byte argument, String argument_12_) {
	int anLocalInt = argument_12_.length();
	int anLocalInt_13_ = 0;
	for (int anLocalInt_14_ = 0; anLocalInt > anLocalInt_14_;
	     anLocalInt_14_++)
	    anLocalInt_13_
		= -anLocalInt_13_ + ((anLocalInt_13_ << 5)
				     + argument_12_.charAt(anLocalInt_14_));
	return anLocalInt_13_;
    }
    
    static final void method3888(int argument, int argument_15_) {
	if (Statics.anInt1652 == 7) {
	    if (argument_15_ != -2030)
		method3888(-60, -15);
	    if (DoublyLinkedNode_Sub51_Sub12.anInt6286 == 0
		&& Class245.anInt1784 == 0) {
		Node_Sub13.anInt3978 = argument;
		Class316.method3638(9, argument_15_ ^ ~0x7ef);
	    }
	}
    }
    
    public static void method3889(int argument) {
	aClass368Array2952 = null;
    }
    
    abstract boolean method3890(int argument_16_);
    
    abstract void method3891(int argument_17_);
}
