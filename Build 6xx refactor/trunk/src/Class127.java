/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127
{
    static int anInt1038 = 0;
    
    static final void method2415(int argument, int argument_0_,
				 int argument_1_, int argument_2_,
				 byte argument_3_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(18, 13175,
            ((long) argument << 32
                    | (long) argument_1_));
	class59_sub51_sub3.method1182(argument_3_ - 36);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_0_;
	if (argument_3_ == -52)
	    ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_2_;
    }
    
    static final void method2416(boolean argument, int argument_4_,
				 boolean argument_5_, String argument_6_,
				 Signlink argument_7_) {
	Statics.method3262(0, argument_5_, argument_7_, "openjs", argument_6_, argument);
    }
    
    static final boolean method2417(int argument, int argument_8_,
				    int argument_9_) {
	if (argument_9_ == 11)
	    argument_9_ = 10;
	Class266 class266
	    = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 52,
							    argument_8_);
	if (argument_9_ >= 5 && argument_9_ <= 8)
	    argument_9_ = 4;
	return class266.method3347(0, argument_9_);
    }
    
    static final void method2418(int argument, int argument_10_,
				 int argument_11_, int argument_12_,
				 boolean argument_13_) {
	if (argument_10_ != -352753888)
	    anInt1038 = -10;
	Node_Sub38.method1067(109);
	Class60.aLong433 = 0L;
	int anLocalInt = DoublyLinkedNode_Sub51_Sub13.method1262(-116);
	if (argument_11_ == 3 || anLocalInt == 3)
	    argument_13_ = true;
	if (!Class389.aGraphicsToolkit3281.method2049())
	    argument_13_ = true;
	Class381.method4106(argument_10_ ^ ~0x150698b7, anLocalInt,
			    argument_13_, argument, argument_11_,
			    argument_12_);
    }
}
