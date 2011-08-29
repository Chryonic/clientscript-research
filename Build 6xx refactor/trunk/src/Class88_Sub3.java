/* Class88_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88_Sub3 extends Class88
{
    private long aLong4495 = 0L;
    private long aLong4496 = 0L;
    private int anInt4497 = 1;
    private long[] aLongArray4498;
    private int anInt4499 = 0;
    private long aLong4500;
    
    final void method1645(byte argument_0_) {
	aLong4496 = 0L;
	if (aLong4500 < aLong4495)
	    aLong4500 += -aLong4500 + aLong4495;
	int anLocalInt = -84 % ((argument_0_ - 17) / 54);
    }
    
    final long method1646(byte argument_1_) {
	if (argument_1_ != -96)
	    aLongArray4498 = null;
	aLong4500 += method1652(true);
	if (aLong4500 < aLong4495)
	    return (-aLong4500 + aLong4495) / 1000000L;
	return 0L;
    }
    
    private final long method1652(boolean argument_2_) {
	long l = Applet_Sub1.getGameTime() * 1000000L;
	long l_3_ = l - aLong4496;
	aLong4496 = l;
	if (argument_2_ != true)
	    method1652(false);
	if (l_3_ > -5000000000L && l_3_ < 5000000000L) {
	    aLongArray4498[anInt4499] = l_3_;
	    anInt4499 = (anInt4499 + 1) % 10;
	    if (anInt4497 < 10)
		anInt4497++;
	}
	long l_4_ = 0L;
	for (int anLocalInt = 1; anInt4497 >= anLocalInt; anLocalInt++)
	    l_4_ += aLongArray4498[(anInt4499 - anLocalInt + 10) % 10];
	return l_4_ / (long) anInt4497;
    }
    
    final int method1644(long argument_5_, int argument_6_) {
	if (argument_6_ != -21626)
	    return 6;
	if (aLong4500 < aLong4495) {
	    aLong4496 += aLong4495 - aLong4500;
	    aLong4500 += aLong4495 + -aLong4500;
	    aLong4495 += argument_5_;
	    return 1;
	}
	int anLocalInt = 0;
	do
	    aLong4495 += argument_5_;
	while (++anLocalInt < 10 && aLong4495 < aLong4500);
	if (aLong4500 > aLong4495)
	    aLong4495 = aLong4500;
	return anLocalInt;
    }
    
    final long method1648(byte argument_7_) {
	if (argument_7_ < 63)
	    anInt4497 = 118;
	return aLong4500;
    }
    
    Class88_Sub3() {
	aLongArray4498 = new long[10];
	aLong4500 = 0L;
    }
}
