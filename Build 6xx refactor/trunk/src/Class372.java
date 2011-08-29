/* Class372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class372
{
    private int anInt3192;
    static boolean aBoolean3193;
    private int anInt3194;
    private int anInt3195;
    private int[] anIntArray3196;
    private int anInt3197;
    private int[] anIntArray3198;
    
    final int method4068(int argument_0_) {
	if (anInt3195 == 0) {
	    method4069(-61);
	    anInt3195 = 256;
	}
	if (argument_0_ <= 8)
	    method4069(-31);
	return anIntArray3198[anInt3195 - 1];
    }
    
    private final void method4069(int argument_1_) {
	if (argument_1_ >= -59)
	    anInt3195 = 52;
	anInt3197 += ++anInt3192;
	for (int anLocalInt = 0; anLocalInt < 256; anLocalInt++) {
	    int anLocalInt_2_ = anIntArray3196[anLocalInt];
	    if ((anLocalInt & 0x2) == 0) {
		if ((anLocalInt & 0x1) == 0)
		    anInt3194 ^= anInt3194 << 13;
		else
		    anInt3194 ^= anInt3194 >>> 6;
	    } else if ((anLocalInt & 0x1) == 0)
		anInt3194 ^= anInt3194 << 2;
	    else
		anInt3194 ^= anInt3194 >>> 16;
	    anInt3194 += anIntArray3196[anLocalInt + 128 & 0xff];
	    int anLocalInt_3_;
	    anIntArray3196[anLocalInt] = anLocalInt_3_
		= (anIntArray3196[MathStatics.AND(255, anLocalInt_2_ >> 2)]
		   + (anInt3194 + anInt3197));
	    anIntArray3198[anLocalInt] = anInt3197
		= anIntArray3196[(MathStatics.AND(261213, anLocalInt_3_)
				  >> 8 >> 2)] + anLocalInt_2_;
	}
    }
    
    final int method4070(int argument_4_) {
	if (anInt3195 == 0) {
	    method4069(-103);
	    anInt3195 = 256;
	}
	return anIntArray3198[--anInt3195];
    }
    
    private final void method4071(boolean argument_5_) {
	if (argument_5_ != true)
	    anIntArray3198 = null;
	int anLocalInt_6_;
	int anLocalInt_7_;
	int anLocalInt_8_;
	int anLocalInt_9_;
	int anLocalInt_10_;
	int anLocalInt_11_;
	int anLocalInt_12_;
	int anLocalInt = (anLocalInt_6_ = anLocalInt_7_ = anLocalInt_8_
			  = anLocalInt_9_ = anLocalInt_10_ = anLocalInt_11_
			  = anLocalInt_12_ = -1640531527);
	for (int anLocalInt_13_ = 0; anLocalInt_13_ < 4; anLocalInt_13_++) {
	    anLocalInt ^= anLocalInt_6_ << 11;
	    anLocalInt_6_ += anLocalInt_7_;
	    anLocalInt_8_ += anLocalInt;
	    anLocalInt_6_ ^= anLocalInt_7_ >>> 2;
	    anLocalInt_9_ += anLocalInt_6_;
	    anLocalInt_7_ += anLocalInt_8_;
	    anLocalInt_7_ ^= anLocalInt_8_ << 8;
	    anLocalInt_8_ += anLocalInt_9_;
	    anLocalInt_10_ += anLocalInt_7_;
	    anLocalInt_8_ ^= anLocalInt_9_ >>> 16;
	    anLocalInt_11_ += anLocalInt_8_;
	    anLocalInt_9_ += anLocalInt_10_;
	    anLocalInt_9_ ^= anLocalInt_10_ << 10;
	    anLocalInt_10_ += anLocalInt_11_;
	    anLocalInt_12_ += anLocalInt_9_;
	    anLocalInt_10_ ^= anLocalInt_11_ >>> 4;
	    anLocalInt += anLocalInt_10_;
	    anLocalInt_11_ += anLocalInt_12_;
	    anLocalInt_11_ ^= anLocalInt_12_ << 8;
	    anLocalInt_6_ += anLocalInt_11_;
	    anLocalInt_12_ += anLocalInt;
	    anLocalInt_12_ ^= anLocalInt >>> 9;
	    anLocalInt += anLocalInt_6_;
	    anLocalInt_7_ += anLocalInt_12_;
	}
	for (int anLocalInt_14_ = 0; anLocalInt_14_ < 256;
	     anLocalInt_14_ += 8) {
	    anLocalInt_12_ += anIntArray3198[anLocalInt_14_ + 7];
	    anLocalInt_6_ += anIntArray3198[anLocalInt_14_ + 1];
	    anLocalInt_10_ += anIntArray3198[anLocalInt_14_ + 5];
	    anLocalInt_8_ += anIntArray3198[anLocalInt_14_ + 3];
	    anLocalInt += anIntArray3198[anLocalInt_14_];
	    anLocalInt_7_ += anIntArray3198[anLocalInt_14_ + 2];
	    anLocalInt_9_ += anIntArray3198[anLocalInt_14_ + 4];
	    anLocalInt_11_ += anIntArray3198[anLocalInt_14_ + 6];
	    anLocalInt ^= anLocalInt_6_ << 11;
	    anLocalInt_8_ += anLocalInt;
	    anLocalInt_6_ += anLocalInt_7_;
	    anLocalInt_6_ ^= anLocalInt_7_ >>> 2;
	    anLocalInt_7_ += anLocalInt_8_;
	    anLocalInt_9_ += anLocalInt_6_;
	    anLocalInt_7_ ^= anLocalInt_8_ << 8;
	    anLocalInt_8_ += anLocalInt_9_;
	    anLocalInt_10_ += anLocalInt_7_;
	    anLocalInt_8_ ^= anLocalInt_9_ >>> 16;
	    anLocalInt_11_ += anLocalInt_8_;
	    anLocalInt_9_ += anLocalInt_10_;
	    anLocalInt_9_ ^= anLocalInt_10_ << 10;
	    anLocalInt_12_ += anLocalInt_9_;
	    anLocalInt_10_ += anLocalInt_11_;
	    anLocalInt_10_ ^= anLocalInt_11_ >>> 4;
	    anLocalInt += anLocalInt_10_;
	    anLocalInt_11_ += anLocalInt_12_;
	    anLocalInt_11_ ^= anLocalInt_12_ << 8;
	    anLocalInt_6_ += anLocalInt_11_;
	    anLocalInt_12_ += anLocalInt;
	    anLocalInt_12_ ^= anLocalInt >>> 9;
	    anLocalInt_7_ += anLocalInt_12_;
	    anLocalInt += anLocalInt_6_;
	    anIntArray3196[anLocalInt_14_] = anLocalInt;
	    anIntArray3196[anLocalInt_14_ + 1] = anLocalInt_6_;
	    anIntArray3196[anLocalInt_14_ + 2] = anLocalInt_7_;
	    anIntArray3196[anLocalInt_14_ + 3] = anLocalInt_8_;
	    anIntArray3196[anLocalInt_14_ + 4] = anLocalInt_9_;
	    anIntArray3196[anLocalInt_14_ + 5] = anLocalInt_10_;
	    anIntArray3196[anLocalInt_14_ + 6] = anLocalInt_11_;
	    anIntArray3196[anLocalInt_14_ + 7] = anLocalInt_12_;
	}
	for (int anLocalInt_15_ = 0; anLocalInt_15_ < 256;
	     anLocalInt_15_ += 8) {
	    anLocalInt_6_ += anIntArray3196[anLocalInt_15_ + 1];
	    anLocalInt_12_ += anIntArray3196[anLocalInt_15_ + 7];
	    anLocalInt_9_ += anIntArray3196[anLocalInt_15_ + 4];
	    anLocalInt_8_ += anIntArray3196[anLocalInt_15_ + 3];
	    anLocalInt_10_ += anIntArray3196[anLocalInt_15_ + 5];
	    anLocalInt_7_ += anIntArray3196[anLocalInt_15_ + 2];
	    anLocalInt += anIntArray3196[anLocalInt_15_];
	    anLocalInt_11_ += anIntArray3196[anLocalInt_15_ + 6];
	    anLocalInt ^= anLocalInt_6_ << 11;
	    anLocalInt_6_ += anLocalInt_7_;
	    anLocalInt_8_ += anLocalInt;
	    anLocalInt_6_ ^= anLocalInt_7_ >>> 2;
	    anLocalInt_7_ += anLocalInt_8_;
	    anLocalInt_9_ += anLocalInt_6_;
	    anLocalInt_7_ ^= anLocalInt_8_ << 8;
	    anLocalInt_10_ += anLocalInt_7_;
	    anLocalInt_8_ += anLocalInt_9_;
	    anLocalInt_8_ ^= anLocalInt_9_ >>> 16;
	    anLocalInt_11_ += anLocalInt_8_;
	    anLocalInt_9_ += anLocalInt_10_;
	    anLocalInt_9_ ^= anLocalInt_10_ << 10;
	    anLocalInt_10_ += anLocalInt_11_;
	    anLocalInt_12_ += anLocalInt_9_;
	    anLocalInt_10_ ^= anLocalInt_11_ >>> 4;
	    anLocalInt += anLocalInt_10_;
	    anLocalInt_11_ += anLocalInt_12_;
	    anLocalInt_11_ ^= anLocalInt_12_ << 8;
	    anLocalInt_6_ += anLocalInt_11_;
	    anLocalInt_12_ += anLocalInt;
	    anLocalInt_12_ ^= anLocalInt >>> 9;
	    anLocalInt_7_ += anLocalInt_12_;
	    anLocalInt += anLocalInt_6_;
	    anIntArray3196[anLocalInt_15_] = anLocalInt;
	    anIntArray3196[anLocalInt_15_ + 1] = anLocalInt_6_;
	    anIntArray3196[anLocalInt_15_ + 2] = anLocalInt_7_;
	    anIntArray3196[anLocalInt_15_ + 3] = anLocalInt_8_;
	    anIntArray3196[anLocalInt_15_ + 4] = anLocalInt_9_;
	    anIntArray3196[anLocalInt_15_ + 5] = anLocalInt_10_;
	    anIntArray3196[anLocalInt_15_ + 6] = anLocalInt_11_;
	    anIntArray3196[anLocalInt_15_ + 7] = anLocalInt_12_;
	}
	method4069(-87);
	anInt3195 = 256;
    }
    
    private Class372() {
	/* empty */
    }
    
    Class372(int[] argument_16_) {
	anIntArray3198 = new int[256];
	anIntArray3196 = new int[256];
	for (int anLocalInt = 0; anLocalInt < argument_16_.length;
	     anLocalInt++)
	    anIntArray3198[anLocalInt] = argument_16_[anLocalInt];
	method4071(true);
    }
}
