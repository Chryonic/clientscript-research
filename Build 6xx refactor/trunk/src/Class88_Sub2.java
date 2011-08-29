/* Class88_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class88_Sub2 extends Class88
{
    private long aLong4489 = 0L;
    private long aLong4490 = 0L;
    private int anInt4491 = 0;
    private long aLong4492 = 0L;
    private long[] aLongArray4493 = new long[10];
    private int anInt4494 = 1;
    
    final long method1648(byte argument_0_) {
	if (argument_0_ <= 63)
	    return -114L;
	return aLong4490;
    }
    
    private final long method1651(byte argument_1_) {
	long l = jagmisc.nanoTime();
	long l_2_ = -aLong4492 + l;
	aLong4492 = l;
	if (argument_1_ != 112)
	    method1645((byte) 78);
	if (l_2_ > -5000000000L && l_2_ < 5000000000L) {
	    aLongArray4493[anInt4491] = l_2_;
	    anInt4491 = (anInt4491 + 1) % 10;
	    if (anInt4494 < 1)
		anInt4494++;
	}
	long l_3_ = 0L;
	for (int anLocalInt = 1; anLocalInt <= anInt4494; anLocalInt++)
	    l_3_ += aLongArray4493[(-anLocalInt + anInt4491 + 10) % 10];
	return l_3_ / (long) anInt4494;
    }
    
    final void method1645(byte argument_4_) {
	aLong4492 = 0L;
	int anLocalInt = -26 / ((17 - argument_4_) / 54);
	if (aLong4490 < aLong4489)
	    aLong4490 += aLong4489 + -aLong4490;
    }
    
    final int method1644(long argument_5_, int argument_6_) {
	if (argument_6_ != -21626)
	    aLong4492 = 7L;
	if (aLong4490 < aLong4489) {
	    aLong4492 += -aLong4490 + aLong4489;
	    aLong4490 += aLong4489 - aLong4490;
	    aLong4489 += argument_5_;
	    return 1;
	}
	int anLocalInt = 0;
	do
	    aLong4489 += argument_5_;
	while (++anLocalInt < 10 && aLong4490 > aLong4489);
	if (aLong4489 < aLong4490)
	    aLong4489 = aLong4490;
	return anLocalInt;
    }
    
    final long method1646(byte argument_7_) {
	if (argument_7_ != -96)
	    method1651((byte) -35);
	aLong4490 += method1651((byte) 112);
	if (aLong4489 > aLong4490)
	    return (-aLong4490 + aLong4489) / 1000000L;
	return 0L;
    }
    
    Class88_Sub2() {
	aLong4489 = aLong4490 = jagmisc.nanoTime();
	if (aLong4490 == 0L)
	    throw new RuntimeException();
    }
}
