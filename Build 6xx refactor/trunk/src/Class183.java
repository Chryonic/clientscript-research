/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class183
{
    static double aDouble1379;
    static int anInt1380;
    static boolean aBoolean1381 = false;
    
    abstract void method2849(int argument_0_, byte[] argument_1_);
    
    static final void method2850
	(int argument, int argument_2_, GraphicsToolkit argument_3_, int argument_4_,
	 int argument_5_, int argument_6_, int argument_7_, int argument_8_,
	 int argument_9_, DoublyLinkedNode_Sub51_Sub7 argument_10_, int argument_11_,
	 boolean argument_12_) {
	if (argument_4_ < argument_9_
	    && argument_9_ < argument_4_ + argument_7_
	    && argument_11_ - 13 < argument && argument_11_ + 3 > argument)
	    argument_6_ = argument_5_;
	String string = DoublyLinkedNode_Sub51_Sub6.method1207(argument_10_, 115);
	Class173.aAbstractFont_1286.method504(0, argument_6_, argument_11_,
					 Class283.anIntArray2277,
					 dba_sub_772_Sub2.aClass368Array6368,
					 argument_4_ + 3, string, 0);
    }
    
    abstract byte[] method2851(int argument_13_, int argument_14_,
			       int argument_15_);
    
    abstract byte[] method2852(int argument_16_);
    
    static final int method2853(int argument, boolean argument_17_) {
	return argument >>> 7;
    }
}
