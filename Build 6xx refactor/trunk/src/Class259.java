/* Class259 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class259
{
    static int[] anIntArray2016 = new int[5];
    int anInt2017;
    int anInt2018;
    int anInt2019;
    static int[] anIntArray2020;
    static int anInt2022 = -1;
    int anInt2024;
    /*synthetic*/ static Class aClass2025;
    
    static final void method3305
	(String argument, Class_aa argument_0_, int argument_1_,
	 int argument_2_, RsInterface argument_3_, int argument_4_,
	 int argument_5_, Class76 argument_6_, AbstractFont argument_7_,
	 int argument_8_, int argument_9_, int argument_10_) {
	int anLocalInt;
	if (Statics.anInt1745 != 4)
	    anLocalInt
		= ((int) DoublyLinkedNodeP2_Sub6.aFloat4538 + Class2_Sub10.anInt3824
		   & 0x3fff);
	else
	    anLocalInt = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
	int anLocalInt_11_ = (Math.max(((RsInterface) argument_3_).renderWidth / 2,
				       ((RsInterface) argument_3_).renderHeight / 2)
			      + 10);
	int anLocalInt_12_
	    = argument_1_ * argument_1_ + argument_9_ * argument_9_;
	if (anLocalInt_12_ <= anLocalInt_11_ * anLocalInt_11_) {
	    int anLocalInt_13_ = Node_Sub6.SINETABLE[anLocalInt];
	    int anLocalInt_14_ = Node_Sub6.COSINETABLE[anLocalInt];
	    if (Statics.anInt1745 != 4) {
		anLocalInt_13_
		    = anLocalInt_13_ * 256 / (Node_Sub11.anInt3945 + 256);
		anLocalInt_14_
		    = anLocalInt_14_ * 256 / (Node_Sub11.anInt3945 + 256);
	    }
	    int anLocalInt_15_
		= (argument_9_ * anLocalInt_14_ + anLocalInt_13_ * argument_1_
		   >> 14);
	    int anLocalInt_16_ = ((-(anLocalInt_13_ * argument_9_)
				   + anLocalInt_14_ * argument_1_)
				  >> 14);
	    int anLocalInt_17_
		= argument_6_.method1557((byte) -121, argument, 100, null);
	    anLocalInt_15_ -= anLocalInt_17_ / 2;
	    int anLocalInt_18_
		= argument_6_.method1560(true, 100, argument, null, 0);
	    if (anLocalInt_15_ >= -((RsInterface) argument_3_).renderWidth
		&& anLocalInt_15_ <= ((RsInterface) argument_3_).renderWidth
		&& -((RsInterface) argument_3_).renderHeight <= anLocalInt_16_
		&& anLocalInt_16_ <= ((RsInterface) argument_3_).renderHeight)
		argument_7_.method498(argument, argument_4_, argument_8_, null,
				      (anLocalInt_15_
				       - (-argument_4_
					  - (((RsInterface) argument_3_).renderWidth
					     / 2))),
				      -1, argument_10_, 1, anLocalInt_17_, 50,
				      0, 0, 0, argument_0_, null,
				      (-anLocalInt_18_ - argument_2_
				       + (argument_8_
					  + (((RsInterface) argument_3_).renderHeight
					     / 2))
				       - anLocalInt_16_));
	}
    }
    
    static final boolean method3306(int argument, char argument_19_) {
	if ((argument_19_ < '0' || argument_19_ > '9')
	    && (argument_19_ < 'A' || argument_19_ > 'Z')
	    && (argument_19_ < 'a' || argument_19_ > 'z'))
	    return false;
	return true;
    }
    
    static final void method3307(boolean argument, byte argument_20_) {
	if (!argument || Class179.aClass59_Sub51_Sub13_1320 == null)
	    Class284.anInt2283 = -1;
	else
	    Class284.anInt2283
		= (((DoublyLinkedNode_Sub51_Sub13) Class179.aClass59_Sub51_Sub13_1320)
		   .anInt6299);
	Class179.aClass59_Sub51_Sub13_1320 = null;
	Class392.anInt3295 = 0;
	MultilanguageString.aRsInterface_2865 = null;
	Statics.aCyclicLinkedList_429 = null;
	Class179.method2814();
	Class179.aCyclicLinkedList_1329.clear();
	Class196.aClass244_1438 = null;
	Node_Sub31_Sub15.aClass244_5901 = null;
	Class217.aClass244_1528 = null;
	Class18.aClass368_125 = null;
	Statics.aClass244_363 = null;
	Node_Sub31_Sub25.aClass244_5953 = null;
	Class179.aClass114_1333 = null;
	Class55.anInt409 = -1;
	Statics.aClass244_4117 = null;
	Class97.aClass244_757 = null;
	Class62_Sub22.aClass244_4436 = null;
	Statics.anInt2726 = -1;
	if (Class179.aClass20_1324 != null) {
	    Class179.aClass20_1324.method316((byte) -116);
	    Class179.aClass20_1324.method314(128, 1, 64);
	}
	if (Class179.aClass374_1322 != null)
	    Class179.aClass374_1322.method4079(true, 64, 64);
	if (Class179.aClass257_1318 != null)
	    Class179.aClass257_1318.method3301(11, 64);
	ClientVariables.varbitSource.resizeCache(64);
    }
    
    public static void method3308(byte argument) {
	MapRelated.mapFileNId = null;
	anIntArray2016 = null;
	anIntArray2020 = null;
    }
    
    static final void method3309(int argument) {
	try {
	    Method method
		= (aClass2025 != null ? aClass2025
		   : (aClass2025 = method3310("java.lang.Runtime")))
		      .getMethod("availableProcessors", new Class[0]);
	    if (method != null) {
		try {
		    Runtime runtime = Runtime.getRuntime();
		    Integer integer = (Integer) method.invoke(runtime, null);
		    tia_sub_35_Sub2DoublyLinked.anInt6670 = integer.intValue();
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public Class259() {
	/* empty */
    }
    
    /*synthetic*/ static Class method3310(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	anIntArray2020 = new int[500];
    }
}
