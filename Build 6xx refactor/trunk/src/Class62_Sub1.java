/* Class62_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class62_Sub1 extends Class62
{
    static Class166 aClass166_4361 = new Class166(122, 1);
    static BigInteger aBigInteger4362;
    static Class77[] aClass77Array4363 = new Class77[100];
    static float aFloat4364;
    
    final boolean method1348(int argument_0_) {
	if (((Class62) this).aClass59_Sub50_440.method1157(-103).method229(114)
	    < 96)
	    return false;
	return true;
    }
    
    Class62_Sub1(Node_Sub50 argument_1_) {
	super(argument_1_);
	Class184.method2855(((Class62) this).anInt441, (byte) -69);
    }
    
    final int method1344(byte argument_2_) {
	if (argument_2_ != 4)
	    method1349(26, 7, 47);
	if (((Class62) this).aClass59_Sub50_440.method1157
		(argument_2_ ^ 0x19).method229(122)
	    < 96)
	    return 0;
	return 2;
    }
    
    final void method1346(boolean argument_3_) {
	if (((Class62) this).aClass59_Sub50_440.method1157(-120).method229(118)
	    < 96)
	    ((Class62) this).anInt441 = 0;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 2)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_3_)
	    method1349(-62, -77, -101);
    }
    
    static final boolean method1349(int argument, int argument_4_,
				    int argument_5_) {
	if (!(Class62_Sub17.method1424(argument_5_, argument_4_, false)
	      | (argument_5_ & 0x800) != 0)
	    && !Class245_Sub2.method3191(argument_5_, argument_4_, (byte) -49))
	    return false;
	return true;
    }
    
    final int method1342(int argument_6_, byte argument_7_) {
	if (((Class62) this).aClass59_Sub50_440.method1157(-110).method229(110)
	    < 96)
	    return 3;
	return 1;
    }
    
    Class62_Sub1(int argument_8_, Node_Sub50 argument_9_) {
	super(argument_8_, argument_9_);
	Class184.method2855(((Class62) this).anInt441, (byte) -108);
    }
    
    final void method1343(int argument_10_, byte argument_11_) {
	((Class62) this).anInt441 = argument_10_;
	if (argument_11_ == -107)
	    Class184.method2855(((Class62) this).anInt441, (byte) -102);
    }
    
    public static void method1350(byte argument) {
	aClass166_4361 = null;
	aBigInteger4362 = null;
	aClass77Array4363 = null;
    }
    
    final int method1351(int argument_12_) {
	return ((Class62) this).anInt441;
    }
    
    static {
	aBigInteger4362 = new BigInteger("10001", 16);
    }
}
