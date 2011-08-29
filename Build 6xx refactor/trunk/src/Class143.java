/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class143
{
    static Class166 aClass166_1101 = new Class166(5, 2);
    static long aLong1102;

    public static void method2509(byte argument) {
	aClass166_1101 = null;
    }
    
    static final boolean method2510(int argument, byte argument_5_,
				    int argument_6_) {
	if (argument_5_ != 27)
	    method2509((byte) 75);
	if (!((argument_6_ & 0x60000) != 0
	      | Statics.method2958(argument_6_, (byte) -11, argument))
	    && !Node_Sub47_Sub11.method1140(argument, argument_5_ - 27,
            argument_6_)
	    && !Class373.method4073(argument_6_, 3, argument))
	    return false;
	return true;
    }
    
    abstract DoublyLinkedNode_Sub51_Sub19 method2511(int argument_7_,
					    DoublyLinkedNode_Sub51_Sub19 argument_8_);

}
