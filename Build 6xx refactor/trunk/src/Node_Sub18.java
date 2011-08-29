/* Class59_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub18 extends Node
{
    int anInt4005;
    static int anInt4006;
    int anInt4008;
    
    final boolean method706(byte argument_0_) {
	if ((((Node_Sub18) this).anInt4005 >> 21 & 0x1) == 0)
	    return false;
	return true;
    }
    
    final boolean method707(int argument_1_) {
	if ((((Node_Sub18) this).anInt4005 >> 22 & 0x1) == 0)
	    return false;
	return true;
    }
    
    final int method708(int argument_2_) {
	return (((Node_Sub18) this).anInt4005 & 0x1d47f7) >> 18;
    }
    
    final int method709(int argument_3_) {
	return Class185.method2856(17356, ((Node_Sub18) this).anInt4005);
    }
    
    final boolean method710(byte argument_4_) {
	if ((((Node_Sub18) this).anInt4005 & 0x1) == 0)
	    return false;
	return true;
    }
    
    public static void method711(byte argument) {
	RsInterface.anInterfaces = null;
    }
    
    Node_Sub18(int argument_5_, int argument_6_) {
	((Node_Sub18) this).anInt4008 = argument_6_;
	((Node_Sub18) this).anInt4005 = argument_5_;
    }
    
    final boolean method712(int argument_7_, int argument_8_) {
	if ((((Node_Sub18) this).anInt4005 >> argument_8_ + 1 & 0x1) == 0)
	    return false;
	return true;
    }
}
