/* Class59_Sub31_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Node_Sub31_Sub24 extends Node_Sub31
{
    static boolean aBoolean5946;
    static Class207 aClass207_5947 = new Class207(20, 8);
    static Random aRandom5948 = new Random();
    static int anInt5949 = 0;
    static int[] anIntArray5950 = new int[250];
    static Class221 aClass221_5951 = new Class221();
    
    public static void method953(int argument) {
	anIntArray5950 = null;
	aClass207_5947 = null;
	aClass221_5951 = null;
	aRandom5948 = null;
    }
    
    static final void method954(int argument, int argument_0_, int argument_1_,
				int argument_2_, int argument_3_) {
	int anLocalInt = 0;
	int anLocalInt_4_ = argument_2_;
	int anLocalInt_5_ = -argument_2_;
	Statics.method3364(Class223.anIntArrayArray1562[argument_1_], (byte) -46, argument - argument_2_, argument + argument_2_, argument_0_);
	int anLocalInt_6_ = -1;
	while (anLocalInt_4_ > anLocalInt) {
	    anLocalInt_6_ += 2;
	    anLocalInt++;
	    anLocalInt_5_ += anLocalInt_6_;
	    if (anLocalInt_5_ >= 0) {
		anLocalInt_4_--;
		anLocalInt_5_ -= anLocalInt_4_ << 1;
		int[] anLocalInts = (Class223.anIntArrayArray1562
				     [argument_1_ + anLocalInt_4_]);
		int[] anLocalInts_7_ = (Class223.anIntArrayArray1562
					[argument_1_ - anLocalInt_4_]);
		int anLocalInt_8_ = argument + anLocalInt;
		int anLocalInt_9_ = -anLocalInt + argument;
		Statics.method3364(anLocalInts, (byte) 109, anLocalInt_9_, anLocalInt_8_, argument_0_);
		Statics.method3364(anLocalInts_7_, (byte) -117, anLocalInt_9_, anLocalInt_8_, argument_0_);
	    }
	    int anLocalInt_10_ = anLocalInt_4_ + argument;
	    int anLocalInt_11_ = -anLocalInt_4_ + argument;
	    int[] anLocalInts
		= Class223.anIntArrayArray1562[anLocalInt + argument_1_];
	    int[] anLocalInts_12_
		= Class223.anIntArrayArray1562[-anLocalInt + argument_1_];
	    Statics.method3364(anLocalInts, (byte) 99, anLocalInt_11_, anLocalInt_10_, argument_0_);
	    Statics.method3364(anLocalInts_12_, (byte) -47, anLocalInt_11_, anLocalInt_10_, argument_0_);
	}
    }
    
    final int[] method867(byte argument_13_, int argument_14_) {
	if (argument_13_ < 21)
	    anIntArray5950 = null;
	int[] anLocalInts
	    = ((Node_Sub31) this).aClass97_4135.method1718(argument_14_,
							      -13476);
	if (((Class97) ((Node_Sub31) this).aClass97_4135).aBoolean758)
	    JagStrings.memset(anLocalInts, 0, Statics.anInt294, Class82.anIntArray585[argument_14_]);
	return anLocalInts;
    }
    
    public Node_Sub31_Sub24() {
	super(0, true);
    }
    
    static final int method955(Js5Store argument, int argument_15_) {
	int anLocalInt = 0;
	if (argument.isFlatFile(Class8.anInt81))
	    anLocalInt++;
	if (argument.isFlatFile(Class62_Sub14.anInt4412))
	    anLocalInt++;
	if (argument.isFlatFile(Class268.anInt2139))
	    anLocalInt++;
	if (argument_15_ != -1)
	    method953(49);
	if (argument.isFlatFile(Class96.anInt749))
	    anLocalInt++;
	if (argument.isFlatFile(Node_Sub31_Sub19.anInt5928))
	    anLocalInt++;
	if (argument.isFlatFile(Class151.anInt1143))
	    anLocalInt++;
	if (argument.isFlatFile(Statics.anInt1983))
	    anLocalInt++;
	if (argument.isFlatFile(Class234.anInt1715))
	    anLocalInt++;
	if (argument.isFlatFile(Node_Sub47.anInt4285))
	    anLocalInt++;
	if (argument.isFlatFile(Class16.anInt122))
	    anLocalInt++;
	if (argument.isFlatFile(Class62_Sub19.anInt4425))
	    anLocalInt++;
	if (argument.isFlatFile(Node_Sub37_Sub3.anInt6126))
	    anLocalInt++;
	if (argument.isFlatFile(Class374.anInt3207))
	    anLocalInt++;
	if (argument.isFlatFile(Class62_Sub17.anInt4420))
	    anLocalInt++;
	if (argument.isFlatFile(Node_Sub47_Sub10.anInt6205))
	    anLocalInt++;
	if (argument.isFlatFile(Class390.anInt3286))
	    anLocalInt++;
	return anLocalInt;
    }
}
