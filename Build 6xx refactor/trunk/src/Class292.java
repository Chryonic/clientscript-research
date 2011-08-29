/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class292
{
    private static int[] anIntArray2379 = new int[32768];
    int anInt2380;
    int anInt2381;
    private Class357 aClass357_2382;
    private int[] anIntArray2383 = new int[5];
    private Class357 aClass357_2384;
    private Class229 aClass229_2385;
    private Class357 aClass357_2386;
    private int[] anIntArray2387;
    private Class357 aClass357_2388;
    private Class357 aClass357_2389;
    private static int[] anIntArray2390;
    private static int[] anIntArray2391;
    private int anInt2392;
    private int[] anIntArray2393;
    private Class357 aClass357_2394;
    private Class357 aClass357_2395;
    private int anInt2396;
    private Class357 aClass357_2397;
    private Class357 aClass357_2398;
    private static int[] anIntArray2399;
    private static int[] anIntArray2400;
    private static int[] anIntArray2401;
    private static int[] anIntArray2402;
    private static int[] anIntArray2403;
    
    private final int method3496(int argument_0_, int argument_1_,
				 int argument_2_) {
	if (argument_2_ == 1) {
	    if ((argument_0_ & 0x7fff) < 16384)
		return argument_1_;
	    return -argument_1_;
	}
	if (argument_2_ == 2)
	    return anIntArray2390[argument_0_ & 0x7fff] * argument_1_ >> 14;
	if (argument_2_ == 3)
	    return ((argument_0_ & 0x7fff) * argument_1_ >> 14) - argument_1_;
	if (argument_2_ == 4)
	    return anIntArray2379[argument_0_ / 2607 & 0x7fff] * argument_1_;
	return 0;
    }
    
    final int[] method3497(int argument_3_, int argument_4_) {
	JagStrings.memclr(anIntArray2391, 0, argument_3_);
	if (argument_4_ < 10)
	    return anIntArray2391;
	double d = (double) argument_3_ / ((double) argument_4_ + 0.0);
	aClass357_2382.method3940();
	aClass357_2388.method3940();
	int anLocalInt = 0;
	int anLocalInt_5_ = 0;
	int anLocalInt_6_ = 0;
	if (aClass357_2395 != null) {
	    aClass357_2395.method3940();
	    aClass357_2394.method3940();
	    anLocalInt
		= (int) ((double) (((Class357) aClass357_2395).anInt3021
				   - ((Class357) aClass357_2395).anInt3024)
			 * 32.768 / d);
	    anLocalInt_5_
		= (int) ((double) ((Class357) aClass357_2395).anInt3024
			 * 32.768 / d);
	}
	int anLocalInt_7_ = 0;
	int anLocalInt_8_ = 0;
	int anLocalInt_9_ = 0;
	if (aClass357_2398 != null) {
	    aClass357_2398.method3940();
	    aClass357_2389.method3940();
	    anLocalInt_7_
		= (int) ((double) (((Class357) aClass357_2398).anInt3021
				   - ((Class357) aClass357_2398).anInt3024)
			 * 32.768 / d);
	    anLocalInt_8_
		= (int) ((double) ((Class357) aClass357_2398).anInt3024
			 * 32.768 / d);
	}
	for (int anLocalInt_10_ = 0; anLocalInt_10_ < 5; anLocalInt_10_++) {
	    if (anIntArray2393[anLocalInt_10_] != 0) {
		anIntArray2399[anLocalInt_10_] = 0;
		anIntArray2401[anLocalInt_10_]
		    = (int) ((double) anIntArray2383[anLocalInt_10_] * d);
		anIntArray2403[anLocalInt_10_]
		    = (anIntArray2393[anLocalInt_10_] << 14) / 100;
		anIntArray2400[anLocalInt_10_]
		    = (int) ((double) (((Class357) aClass357_2382).anInt3021
				       - ((Class357) aClass357_2382).anInt3024)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) (anIntArray2387
						  [anLocalInt_10_]))
			     / d);
		anIntArray2402[anLocalInt_10_]
		    = (int) ((double) ((Class357) aClass357_2382).anInt3024
			     * 32.768 / d);
	    }
	}
	for (int anLocalInt_11_ = 0; anLocalInt_11_ < argument_3_;
	     anLocalInt_11_++) {
	    int anLocalInt_12_ = aClass357_2382.method3939(argument_3_);
	    int anLocalInt_13_ = aClass357_2388.method3939(argument_3_);
	    if (aClass357_2395 != null) {
		int anLocalInt_14_ = aClass357_2395.method3939(argument_3_);
		int anLocalInt_15_ = aClass357_2394.method3939(argument_3_);
		anLocalInt_12_
		    += method3496(anLocalInt_6_, anLocalInt_15_,
				  ((Class357) aClass357_2395).anInt3019) >> 1;
		anLocalInt_6_
		    += (anLocalInt_14_ * anLocalInt >> 16) + anLocalInt_5_;
	    }
	    if (aClass357_2398 != null) {
		int anLocalInt_16_ = aClass357_2398.method3939(argument_3_);
		int anLocalInt_17_ = aClass357_2389.method3939(argument_3_);
		anLocalInt_13_
		    = (anLocalInt_13_
		       * ((method3496(anLocalInt_9_, anLocalInt_17_,
				      ((Class357) aClass357_2398).anInt3019)
			   >> 1)
			  + 32768)) >> 15;
		anLocalInt_9_
		    += (anLocalInt_16_ * anLocalInt_7_ >> 16) + anLocalInt_8_;
	    }
	    for (int anLocalInt_18_ = 0; anLocalInt_18_ < 5;
		 anLocalInt_18_++) {
		if (anIntArray2393[anLocalInt_18_] != 0) {
		    int anLocalInt_19_
			= anLocalInt_11_ + anIntArray2401[anLocalInt_18_];
		    if (anLocalInt_19_ < argument_3_) {
			anIntArray2391[anLocalInt_19_]
			    += method3496(anIntArray2399[anLocalInt_18_],
					  ((anLocalInt_13_
					    * anIntArray2403[anLocalInt_18_])
					   >> 15),
					  (((Class357) aClass357_2382)
					   .anInt3019));
			anIntArray2399[anLocalInt_18_]
			    += (anLocalInt_12_ * anIntArray2400[anLocalInt_18_]
				>> 16) + anIntArray2402[anLocalInt_18_];
		    }
		}
	    }
	}
	if (aClass357_2384 != null) {
	    aClass357_2384.method3940();
	    aClass357_2397.method3940();
	    int anLocalInt_20_ = 0;
	    boolean anLocalBoolean = false;
	    boolean anLocalBoolean_21_ = true;
	    for (int anLocalInt_22_ = 0; anLocalInt_22_ < argument_3_;
		 anLocalInt_22_++) {
		int anLocalInt_23_ = aClass357_2384.method3939(argument_3_);
		int anLocalInt_24_ = aClass357_2397.method3939(argument_3_);
		int anLocalInt_25_;
		if (anLocalBoolean_21_)
		    anLocalInt_25_
			= (((Class357) aClass357_2384).anInt3024
			   + (((((Class357) aClass357_2384).anInt3021
				- ((Class357) aClass357_2384).anInt3024)
			       * anLocalInt_23_)
			      >> 8));
		else
		    anLocalInt_25_
			= (((Class357) aClass357_2384).anInt3024
			   + (((((Class357) aClass357_2384).anInt3021
				- ((Class357) aClass357_2384).anInt3024)
			       * anLocalInt_24_)
			      >> 8));
		anLocalInt_20_ += 256;
		if (anLocalInt_20_ >= anLocalInt_25_) {
		    anLocalInt_20_ = 0;
		    anLocalBoolean_21_ = !anLocalBoolean_21_;
		}
		if (anLocalBoolean_21_)
		    anIntArray2391[anLocalInt_22_] = 0;
	    }
	}
	if (anInt2396 > 0 && anInt2392 > 0) {
	    int anLocalInt_26_ = (int) ((double) anInt2396 * d);
	    for (int anLocalInt_27_ = anLocalInt_26_;
		 anLocalInt_27_ < argument_3_; anLocalInt_27_++)
		anIntArray2391[anLocalInt_27_]
		    += (anIntArray2391[anLocalInt_27_ - anLocalInt_26_]
			* anInt2392 / 100);
	}
	if (((Class229) aClass229_2385).anIntArray1658[0] > 0
	    || ((Class229) aClass229_2385).anIntArray1658[1] > 0) {
	    aClass357_2386.method3940();
	    int anLocalInt_28_ = aClass357_2386.method3939(argument_3_ + 1);
	    int anLocalInt_29_
		= aClass229_2385.method3065(0,
					    (float) anLocalInt_28_ / 65536.0F);
	    int anLocalInt_30_
		= aClass229_2385.method3065(1,
					    (float) anLocalInt_28_ / 65536.0F);
	    if (argument_3_ >= anLocalInt_29_ + anLocalInt_30_) {
		int anLocalInt_31_ = 0;
		int anLocalInt_32_ = anLocalInt_30_;
		if (anLocalInt_32_ > argument_3_ - anLocalInt_29_)
		    anLocalInt_32_ = argument_3_ - anLocalInt_29_;
		for (/**/; anLocalInt_31_ < anLocalInt_32_; anLocalInt_31_++) {
		    int anLocalInt_33_
			= (int) (((long) (anIntArray2391
					  [anLocalInt_31_ + anLocalInt_29_])
				  * (long) Class229.anInt1655)
				 >> 16);
		    for (int anLocalInt_34_ = 0;
			 anLocalInt_34_ < anLocalInt_29_; anLocalInt_34_++)
			anLocalInt_33_
			    += (int) (((long) (anIntArray2391
					       [(anLocalInt_31_
						 + anLocalInt_29_ - 1
						 - anLocalInt_34_)])
				       * (long) (Class229.anIntArrayArray1657
						 [0][anLocalInt_34_]))
				      >> 16);
		    for (int anLocalInt_35_ = 0;
			 anLocalInt_35_ < anLocalInt_31_; anLocalInt_35_++)
			anLocalInt_33_
			    -= (int) (((long) (anIntArray2391
					       [(anLocalInt_31_ - 1
						 - anLocalInt_35_)])
				       * (long) (Class229.anIntArrayArray1657
						 [1][anLocalInt_35_]))
				      >> 16);
		    anIntArray2391[anLocalInt_31_] = anLocalInt_33_;
		    anLocalInt_28_
			= aClass357_2386.method3939(argument_3_ + 1);
		}
		anLocalInt_32_ = 128;
		for (;;) {
		    if (anLocalInt_32_ > argument_3_ - anLocalInt_29_)
			anLocalInt_32_ = argument_3_ - anLocalInt_29_;
		    for (/**/; anLocalInt_31_ < anLocalInt_32_;
			 anLocalInt_31_++) {
			int anLocalInt_36_
			    = (int) (((long) anIntArray2391[(anLocalInt_31_
							     + anLocalInt_29_)]
				      * (long) Class229.anInt1655)
				     >> 16);
			for (int anLocalInt_37_ = 0;
			     anLocalInt_37_ < anLocalInt_29_; anLocalInt_37_++)
			    anLocalInt_36_
				+= (int) (((long) (anIntArray2391
						   [(anLocalInt_31_
						     + anLocalInt_29_ - 1
						     - anLocalInt_37_)])
					   * (long) (Class229
						     .anIntArrayArray1657[0]
						     [anLocalInt_37_]))
					  >> 16);
			for (int anLocalInt_38_ = 0;
			     anLocalInt_38_ < anLocalInt_30_; anLocalInt_38_++)
			    anLocalInt_36_
				-= (int) (((long) (anIntArray2391
						   [(anLocalInt_31_ - 1
						     - anLocalInt_38_)])
					   * (long) (Class229
						     .anIntArrayArray1657[1]
						     [anLocalInt_38_]))
					  >> 16);
			anIntArray2391[anLocalInt_31_] = anLocalInt_36_;
			anLocalInt_28_
			    = aClass357_2386.method3939(argument_3_ + 1);
		    }
		    if (anLocalInt_31_ >= argument_3_ - anLocalInt_29_)
			break;
		    anLocalInt_29_
			= aClass229_2385.method3065(0, ((float) anLocalInt_28_
							/ 65536.0F));
		    anLocalInt_30_
			= aClass229_2385.method3065(1, ((float) anLocalInt_28_
							/ 65536.0F));
		    anLocalInt_32_ += 128;
		}
		for (/**/; anLocalInt_31_ < argument_3_; anLocalInt_31_++) {
		    int anLocalInt_39_ = 0;
		    for (int anLocalInt_40_
			     = anLocalInt_31_ + anLocalInt_29_ - argument_3_;
			 anLocalInt_40_ < anLocalInt_29_; anLocalInt_40_++)
			anLocalInt_39_
			    += (int) (((long) (anIntArray2391
					       [(anLocalInt_31_
						 + anLocalInt_29_ - 1
						 - anLocalInt_40_)])
				       * (long) (Class229.anIntArrayArray1657
						 [0][anLocalInt_40_]))
				      >> 16);
		    for (int anLocalInt_41_ = 0;
			 anLocalInt_41_ < anLocalInt_30_; anLocalInt_41_++)
			anLocalInt_39_
			    -= (int) (((long) (anIntArray2391
					       [(anLocalInt_31_ - 1
						 - anLocalInt_41_)])
				       * (long) (Class229.anIntArrayArray1657
						 [1][anLocalInt_41_]))
				      >> 16);
		    anIntArray2391[anLocalInt_31_] = anLocalInt_39_;
		    anLocalInt_28_
			= aClass357_2386.method3939(argument_3_ + 1);
		}
	    }
	}
	for (int anLocalInt_42_ = 0; anLocalInt_42_ < argument_3_;
	     anLocalInt_42_++) {
	    if (anIntArray2391[anLocalInt_42_] < -32768)
		anIntArray2391[anLocalInt_42_] = -32768;
	    if (anIntArray2391[anLocalInt_42_] > 32767)
		anIntArray2391[anLocalInt_42_] = 32767;
	}
	return anIntArray2391;
    }
    
    public static void method3498() {
	anIntArray2391 = null;
	anIntArray2379 = null;
	anIntArray2390 = null;
	anIntArray2399 = null;
	anIntArray2401 = null;
	anIntArray2403 = null;
	anIntArray2400 = null;
	anIntArray2402 = null;
    }
    
    final void method3499(Packet argument_43_) {
	aClass357_2382 = new Class357();
	aClass357_2382.method3938(argument_43_);
	aClass357_2388 = new Class357();
	aClass357_2388.method3938(argument_43_);
	int anLocalInt = argument_43_.g1();
	if (anLocalInt != 0) {
	    ((Packet) argument_43_).pos--;
	    aClass357_2395 = new Class357();
	    aClass357_2395.method3938(argument_43_);
	    aClass357_2394 = new Class357();
	    aClass357_2394.method3938(argument_43_);
	}
	anLocalInt = argument_43_.g1();
	if (anLocalInt != 0) {
	    ((Packet) argument_43_).pos--;
	    aClass357_2398 = new Class357();
	    aClass357_2398.method3938(argument_43_);
	    aClass357_2389 = new Class357();
	    aClass357_2389.method3938(argument_43_);
	}
	anLocalInt = argument_43_.g1();
	if (anLocalInt != 0) {
	    ((Packet) argument_43_).pos--;
	    aClass357_2384 = new Class357();
	    aClass357_2384.method3938(argument_43_);
	    aClass357_2397 = new Class357();
	    aClass357_2397.method3938(argument_43_);
	}
	for (int anLocalInt_44_ = 0; anLocalInt_44_ < 10; anLocalInt_44_++) {
	    int anLocalInt_45_ = argument_43_.gsmart(-2);
	    if (anLocalInt_45_ == 0)
		break;
	    anIntArray2393[anLocalInt_44_] = anLocalInt_45_;
	    anIntArray2387[anLocalInt_44_] = argument_43_.gsmarts();
	    anIntArray2383[anLocalInt_44_] = argument_43_.gsmart(-2);
	}
	anInt2396 = argument_43_.gsmart(-2);
	anInt2392 = argument_43_.gsmart(-2);
	((Class292) this).anInt2380 = argument_43_.g2();
	((Class292) this).anInt2381 = argument_43_.g2();
	aClass229_2385 = new Class229();
	aClass357_2386 = new Class357();
	aClass229_2385.method3067(argument_43_, aClass357_2386);
    }
    
    public Class292() {
	((Class292) this).anInt2380 = 500;
	((Class292) this).anInt2381 = 0;
	anIntArray2393 = new int[5];
	anInt2392 = 100;
	anIntArray2387 = new int[5];
	anInt2396 = 0;
    }
    
    static {
	Random random = new Random(0L);
	for (int anLocalInt = 0; anLocalInt < 32768; anLocalInt++)
	    anIntArray2379[anLocalInt] = (random.nextInt() & 0x2) - 1;
	anIntArray2390 = new int[32768];
	for (int anLocalInt = 0; anLocalInt < 32768; anLocalInt++)
	    anIntArray2390[anLocalInt]
		= (int) (Math.sin((double) anLocalInt / 5215.1903) * 16384.0);
	anIntArray2391 = new int[220500];
	anIntArray2399 = new int[5];
	anIntArray2400 = new int[5];
	anIntArray2402 = new int[5];
	anIntArray2403 = new int[5];
	anIntArray2401 = new int[5];
    }
}
