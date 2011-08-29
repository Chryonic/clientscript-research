/* Class62_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub10 extends Class62
{
    static int anInt4399 = -1;
    static Class83 aClass83_4400;
    
    Class62_Sub10(int argument_0_, Node_Sub50 argument_1_) {
	super(argument_0_, argument_1_);
    }
    
    final void method1346(boolean argument_2_) {
	if (method1397((byte) 109)) {
	    if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		    .aClass62_Sub26_4295.method1462(8192)
		&& !Class138.method2464(-54,
					((Node_Sub50)
					 ((Class62) this).aClass59_Sub50_440)
					    .aClass62_Sub26_4295
					    .method1464(12)))
		((Class62) this).anInt441 = 1;
	    if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		    .aClass62_Sub4_4302.method1368(96)
		== 1)
		((Class62) this).anInt441 = 1;
	}
	if (((Class62) this).anInt441 == 3)
	    ((Class62) this).anInt441 = 2;
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 3)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_2_)
	    method1397((byte) 113);
    }
    
    final int method1393(int argument_3_) {
	return ((Class62) this).anInt441;
    }
    
    public static void method1394(int argument) {
	aClass83_4400 = null;
    }
    
    static final void method1395(AbstractFont argument, GraphicsToolkit argument_4_,
				 Class76 argument_5_, boolean argument_6_,
				 int argument_7_, String argument_8_) {
	boolean anLocalBoolean
	    = !DoublyLinkedNode_Sub51_Sub8.aBoolean6262 || client.method112(-26);
	if (argument_7_ > -64)
	    method1394(-17);
	if (anLocalBoolean) {
	    if (DoublyLinkedNode_Sub51_Sub8.aBoolean6262 && anLocalBoolean) {
		argument_5_ = Class167.aClass76_1221;
		argument = argument_4_.method2083(argument_5_,
						  (Statics
						   .aClass83Array6378),
						  true);
		int anLocalInt
		    = argument_5_.method1557((byte) -121, argument_8_, 250,
					     null);
		int anLocalInt_9_
		    = argument_5_.method1560(true, 250, argument_8_, null,
					     ((Class76) argument_5_).anInt513);
		int anLocalInt_10_
		    = ((Class83) Class392.aClass83_3294).anInt590;
		int anLocalInt_11_ = anLocalInt_10_ + 4;
		anLocalInt += anLocalInt_11_ * 2;
		anLocalInt_9_ += anLocalInt_11_ * 2;
		if (Class369.anInt3117 > anLocalInt_9_)
		    anLocalInt_9_ = Class369.anInt3117;
		if (anLocalInt < Class269.anInt2147)
		    anLocalInt = Class269.anInt2147;
		int anLocalInt_12_
		    = ((Class277.aClass349_2221.method3823
			(anLocalInt, client.gameWidth,
			 (byte) -91))
		       + GlTexture_Sub4_Sub1.anInt6548);
		int anLocalInt_13_
		    = (Class77.aClass44_533.method431(0,
						      client.gameHeight,
						      anLocalInt_9_)
		       + Class_s_Sub2.anInt5352);
		if (Class52.aBoolean391) {
		    anLocalInt_12_ += Node_Sub52.method1319(99);
		    anLocalInt_13_ += Class82.method1596(-2);
		}
		argument_4_.method2033(JagexHash.aClass83_1676, false)
		    .method4002
		    (((Class83) aClass83_4400).anInt590 + anLocalInt_12_,
		     ((Class83) aClass83_4400).anInt587 + anLocalInt_13_,
		     -(((Class83) aClass83_4400).anInt590 * 2) + anLocalInt,
		     anLocalInt_9_ - ((Class83) aClass83_4400).anInt587 * 2, 1,
		     0, 0);
		argument_4_.method2033(aClass83_4400, true)
		    .method4014(anLocalInt_12_, anLocalInt_13_);
		aClass83_4400.method1604();
		argument_4_.method2033(aClass83_4400, true).method4014
		    (anLocalInt_12_ + (anLocalInt - anLocalInt_10_),
		     anLocalInt_13_);
		aClass83_4400.method1611();
		argument_4_.method2033(aClass83_4400, true).method4014
		    (-anLocalInt_10_ + (anLocalInt + anLocalInt_12_),
		     anLocalInt_9_ + (anLocalInt_13_ - anLocalInt_10_));
		aClass83_4400.method1604();
		argument_4_.method2033(aClass83_4400, true).method4014
		    (anLocalInt_12_,
		     anLocalInt_9_ + anLocalInt_13_ - anLocalInt_10_);
		aClass83_4400.method1611();
		argument_4_.method2033(Class392.aClass83_3294, true).method4023
		    (anLocalInt_12_,
		     ((Class83) aClass83_4400).anInt587 + anLocalInt_13_,
		     anLocalInt_10_,
		     anLocalInt_9_ - ((Class83) aClass83_4400).anInt587 * 2);
		Class392.aClass83_3294.method1610();
		argument_4_.method2033(Class392.aClass83_3294, true).method4023
		    (((Class83) aClass83_4400).anInt590 + anLocalInt_12_,
		     anLocalInt_13_,
		     anLocalInt - ((Class83) aClass83_4400).anInt590 * 2,
		     anLocalInt_10_);
		Class392.aClass83_3294.method1610();
		argument_4_.method2033(Class392.aClass83_3294, true).method4023
		    (-anLocalInt_10_ + (anLocalInt + anLocalInt_12_),
		     ((Class83) aClass83_4400).anInt587 + anLocalInt_13_,
		     anLocalInt_10_,
		     anLocalInt_9_ - ((Class83) aClass83_4400).anInt587 * 2);
		Class392.aClass83_3294.method1610();
		argument_4_.method2033(Class392.aClass83_3294, true).method4023
		    (((Class83) aClass83_4400).anInt590 + anLocalInt_12_,
		     -anLocalInt_10_ + (anLocalInt_13_ + anLocalInt_9_),
		     -(((Class83) aClass83_4400).anInt590 * 2) + anLocalInt,
		     anLocalInt_10_);
		Class392.aClass83_3294.method1610();
		argument.method498(argument_8_, 0, 0, null,
				   anLocalInt_11_ + anLocalInt_12_, -1,
				   Class201.anInt1449 | ~0xffffff, 1,
				   -(anLocalInt_11_ * 2) + anLocalInt,
				   anLocalInt_9_ - anLocalInt_11_ * 2, 0, 1,
				   -1, null, null,
				   anLocalInt_13_ + anLocalInt_11_);
		Class344.method3801(-2409, anLocalInt_12_, anLocalInt_9_,
				    anLocalInt_13_, anLocalInt);
	    } else {
		int anLocalInt
		    = argument_5_.method1557((byte) -121, argument_8_, 250,
					     null);
		int anLocalInt_14_
		    = argument_5_.method1553(-50, null, argument_8_, 250) * 13;
		int anLocalInt_15_ = 4;
		int anLocalInt_16_ = anLocalInt_15_ + 6;
		int anLocalInt_17_ = anLocalInt_15_ + 6;
		argument_4_.fillRect(anLocalInt_16_ - anLocalInt_15_, anLocalInt_17_ - anLocalInt_15_, anLocalInt_15_ + (anLocalInt + anLocalInt_15_), (anLocalInt_15_ + anLocalInt_14_ + anLocalInt_15_), -16777216, 0);
		argument_4_.drawRect(-anLocalInt_15_ + anLocalInt_16_, anLocalInt_17_ - anLocalInt_15_, anLocalInt_15_ + (anLocalInt + anLocalInt_15_), anLocalInt_15_ + (anLocalInt_15_ + anLocalInt_14_), -1, 0);
		argument.method498(argument_8_, 0, 0, null, anLocalInt_16_, -1,
				   -1, 1, anLocalInt, anLocalInt_14_, 0, 1, -1,
				   null, null, anLocalInt_17_);
		Class344.method3801(-2409, -anLocalInt_15_ + anLocalInt_16_,
				    (anLocalInt_14_ + anLocalInt_15_
				     + anLocalInt_15_),
				    anLocalInt_17_ - anLocalInt_15_,
				    anLocalInt - (-anLocalInt_15_
						  - anLocalInt_15_));
	    }
	    if (argument_6_) {
		try {
		    if (Class52.aBoolean391)
			Statics.method2502((byte) 113);
		    else
			argument_4_.method2086((byte) -91);
		} catch (Exception_Sub1 exception_sub1) {
		    /* empty */
		}
	    }
	}
    }
    
    final void method1343(int argument_18_, byte argument_19_) {
	if (argument_19_ == -107)
	    ((Class62) this).anInt441 = argument_18_;
    }
    
    final int method1344(byte argument_20_) {
	if (argument_20_ != 4)
	    method1344((byte) -54);
	return 0;
    }
    
    Class62_Sub10(Node_Sub50 argument_21_) {
	super(argument_21_);
    }
    
    final int method1342(int argument_22_, byte argument_23_) {
	int anLocalInt = 68 / ((argument_23_ + 53) / 50);
	if (DoublyLinkedNode_Sub51_Sub20.method1303((byte) -43, argument_22_)) {
	    if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		    .aClass62_Sub26_4295.method1462(8192)
		&& !Class138.method2464(-50,
					((Node_Sub50)
					 ((Class62) this).aClass59_Sub50_440)
					    .aClass62_Sub26_4295
					    .method1464(25)))
		return 3;
	    if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		    .aClass62_Sub4_4302.method1368(119)
		== 1)
		return 3;
	}
	if (argument_22_ == 3)
	    return 3;
	if (DoublyLinkedNode_Sub51_Sub20.method1303((byte) -54, argument_22_))
	    return 2;
	return 1;
    }
    
    final boolean method1396(int argument_24_) {
	return true;
    }
    
    final boolean method1397(byte argument_25_) {
	return DoublyLinkedNode_Sub51_Sub20.method1303((byte) -32, ((Class62) this).anInt441);
    }
}
