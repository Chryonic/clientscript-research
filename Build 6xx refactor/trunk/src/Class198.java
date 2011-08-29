/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class198
{
    private Class292[] aClass292Array1440;
    private int anInt1441;
    private int anInt1442;
    
    static final Class198 method2906(Js5Store argument, int argument_0_,
				     int argument_1_) {
	byte[] anLocalInts = argument.getData(argument_0_, argument_1_);
	if (anLocalInts == null)
	    return null;
	return new Class198(new Packet(anLocalInts));
    }
    
    final int method2907() {
	int anLocalInt = 9999999;
	for (int anLocalInt_2_ = 0; anLocalInt_2_ < 10; anLocalInt_2_++) {
	    if (aClass292Array1440[anLocalInt_2_] != null
		&& (((Class292) aClass292Array1440[anLocalInt_2_]).anInt2381
		    / 20) < anLocalInt)
		anLocalInt
		    = (((Class292) aClass292Array1440[anLocalInt_2_]).anInt2381
		       / 20);
	}
	if (anInt1441 < anInt1442 && anInt1441 / 20 < anLocalInt)
	    anLocalInt = anInt1441 / 20;
	if (anLocalInt == 9999999 || anLocalInt == 0)
	    return 0;
	for (int anLocalInt_3_ = 0; anLocalInt_3_ < 10; anLocalInt_3_++) {
	    if (aClass292Array1440[anLocalInt_3_] != null)
		((Class292) aClass292Array1440[anLocalInt_3_]).anInt2381
		    -= anLocalInt * 20;
	}
	if (anInt1441 < anInt1442) {
	    anInt1441 -= anLocalInt * 20;
	    anInt1442 -= anLocalInt * 20;
	}
	return anLocalInt;
    }
    
    private final byte[] method2908() {
	int anLocalInt = 0;
	for (int anLocalInt_4_ = 0; anLocalInt_4_ < 10; anLocalInt_4_++) {
	    if (aClass292Array1440[anLocalInt_4_] != null
		&& (((Class292) aClass292Array1440[anLocalInt_4_]).anInt2380
		    + (((Class292) aClass292Array1440[anLocalInt_4_])
		       .anInt2381)) > anLocalInt)
		anLocalInt
		    = (((Class292) aClass292Array1440[anLocalInt_4_]).anInt2380
		       + (((Class292) aClass292Array1440[anLocalInt_4_])
			  .anInt2381));
	}
	if (anLocalInt == 0)
	    return new byte[0];
	int anLocalInt_5_ = anLocalInt * 22050 / 1000;
	byte[] anLocalInts = new byte[anLocalInt_5_];
	for (int anLocalInt_6_ = 0; anLocalInt_6_ < 10; anLocalInt_6_++) {
	    if (aClass292Array1440[anLocalInt_6_] != null) {
		int anLocalInt_7_
		    = (((Class292) aClass292Array1440[anLocalInt_6_]).anInt2380
		       * 22050 / 1000);
		int anLocalInt_8_
		    = (((Class292) aClass292Array1440[anLocalInt_6_]).anInt2381
		       * 22050 / 1000);
		int[] anLocalInts_9_
		    = (aClass292Array1440[anLocalInt_6_].method3497
		       (anLocalInt_7_,
			(((Class292) aClass292Array1440[anLocalInt_6_])
			 .anInt2380)));
		for (int anLocalInt_10_ = 0; anLocalInt_10_ < anLocalInt_7_;
		     anLocalInt_10_++) {
		    int anLocalInt_11_
			= (anLocalInts[anLocalInt_10_ + anLocalInt_8_]
			   + (anLocalInts_9_[anLocalInt_10_] >> 8));
		    if ((anLocalInt_11_ + 128 & ~0xff) != 0)
			anLocalInt_11_ = anLocalInt_11_ >> 31 ^ 0x7f;
		    anLocalInts[anLocalInt_10_ + anLocalInt_8_]
			= (byte) anLocalInt_11_;
		}
	    }
	}
	return anLocalInts;
    }
    
    final Node_Sub40_Sub1 method2909() {
	byte[] anLocalInts = method2908();
	return new Node_Sub40_Sub1(22050, anLocalInts,
				      anInt1441 * 22050 / 1000,
				      anInt1442 * 22050 / 1000);
    }
    
    private Class198(Packet argument_12_) {
	aClass292Array1440 = new Class292[10];
	for (int anLocalInt = 0; anLocalInt < 10; anLocalInt++) {
	    int anLocalInt_13_ = argument_12_.g1();
	    if (anLocalInt_13_ != 0) {
		((Packet) argument_12_).pos--;
		aClass292Array1440[anLocalInt] = new Class292();
		aClass292Array1440[anLocalInt].method3499(argument_12_);
	    }
	}
	anInt1441 = argument_12_.g2();
	anInt1442 = argument_12_.g2();
    }
    
    private Class198() {
	aClass292Array1440 = new Class292[10];
    }
}
