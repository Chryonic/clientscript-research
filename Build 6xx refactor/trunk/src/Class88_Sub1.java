/* Class88_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88_Sub1 extends Class88
{
    private long aLong4483 = 0L;
    private long aLong4484 = 0L;
    private long[] aLongArray4485;
    private int anInt4486 = 0;
    private int anInt4487;
    private long aLong4488;
    
    private final long method1650(int argument_0_) {
	long l = System.nanoTime();
	long l_1_ = l - aLong4488;
	aLong4488 = l;
	if (l_1_ > -5000000000L && l_1_ < 5000000000L) {
	    aLongArray4485[anInt4486] = l_1_;
	    if (anInt4487 < 1)
		anInt4487++;
	    anInt4486 = (anInt4486 + 1) % 10;
	}
	long l_2_ = (long) argument_0_;
	for (int anLocalInt = 1; anInt4487 >= anLocalInt; anLocalInt++)
	    l_2_ += aLongArray4485[(anInt4486 - anLocalInt + 10) % 10];
	return l_2_ / (long) anInt4487;
    }
    
    final void method1645(byte argument_3_) {
	aLong4488 = 0L;
	int anLocalInt = -87 % ((17 - argument_3_) / 54);
	if (aLong4484 > aLong4483)
	    aLong4483 += aLong4484 + -aLong4483;
    }
    
    final long method1648(byte argument_4_) {
	if (argument_4_ < 63)
	    return -61L;
	return aLong4483;
    }
    
    final int method1644(long argument_5_, int argument_6_) {
	if (argument_6_ != -21626)
	    return -11;
	if (aLong4483 < aLong4484) {
	    aLong4488 += aLong4484 - aLong4483;
	    aLong4483 += aLong4484 + -aLong4483;
	    aLong4484 += argument_5_;
	    return 1;
	}
	int anLocalInt = 0;
	do
	    aLong4484 += argument_5_;
	while (++anLocalInt < 10 && aLong4483 > aLong4484);
	if (aLong4484 < aLong4483)
	    aLong4484 = aLong4483;
	return anLocalInt;
    }
    
    final long method1646(byte argument_7_) {
	aLong4483 += method1650(0);
	if (aLong4484 > aLong4483)
	    return (-aLong4483 + aLong4484) / 1000000L;
	if (argument_7_ != -96)
	    aLong4484 = 77L;
	return 0L;
    }
    
    Class88_Sub1() {
	aLongArray4485 = new long[10];
	anInt4487 = 1;
	aLong4488 = 0L;
	aLong4483 = System.nanoTime();
	aLong4484 = System.nanoTime();
    }
}
