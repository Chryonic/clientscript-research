/* Class62_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub6 extends Class62
{
    static Class166 aClass166_4385 = new Class166(50, 20);
    static long aLong4386;
    static Class166 aClass166_4387 = new Class166(62, 7);
    static Class226 aClass226_4388;
    static int anInt4389 = 0;
    
    static final void method1376(byte argument) {
	if (Class389.aGraphicsToolkit3281 != null) {
	    if (Class52.aBoolean391)
		Class222.method3032(8);
	    Class62_Sub20.aClass314_4431.method3628(0);
	    LightingManager.method945();
	    Class371.method4047(-91);
	    Statics.method457((byte) 95);
	    Node_Sub37_Sub3.method1063(-85);
	    AthmosphericConditions.cleanup();
	    if (Class_s.aClass195_2551 != null)
		Class_s.aClass195_2551.method2896((byte) -94);
	    Statics.method2458(96);
	    Class241.method3151((byte) 37);
	    Node_Sub5.method558(-98);
	    DoublyLinkedNodeP2_Sub2_Sub4.method1880(0);
	    Class259.method3307(false, (byte) -106);
	    for (int anLocalInt = 0; anLocalInt < 2048; anLocalInt++) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
		    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
		       [anLocalInt]);
		if (class104_sub2_sub2_sub5_sub2 != null) {
		    for (int anLocalInt_0_ = 0;
			 anLocalInt_0_ < (((Entity)
					   class104_sub2_sub2_sub5_sub2)
					  .aClass167Array6801).length;
			 anLocalInt_0_++)
			((Entity)
			 class104_sub2_sub2_sub5_sub2)
			    .aClass167Array6801[anLocalInt_0_]
			    = null;
		}
	    }
	    for (int anLocalInt = 0; Statics.anInt5573 > anLocalInt;
		 anLocalInt++) {
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		    = (((Node_Sub35) (Node_Sub31_Sub13
					 .aClass59_Sub35Array5900[anLocalInt]))
		       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		if (class104_sub2_sub2_sub5_sub1 != null) {
		    for (int anLocalInt_1_ = 0;
			 ((((Entity)
			    class104_sub2_sub2_sub5_sub1)
			   .aClass167Array6801).length
			  > anLocalInt_1_);
			 anLocalInt_1_++)
			((Entity)
			 class104_sub2_sub2_sub5_sub1)
			    .aClass167Array6801[anLocalInt_1_]
			    = null;
		}
	    }
	    Class41.aClass350_304 = null;
	    DoublyLinkedNodeP2_Sub10.aClass350_4594 = null;
	    Class389.aGraphicsToolkit3281.method2027((byte) -128);
	    Class389.aGraphicsToolkit3281 = null;
	}
    }
    
    final int method1344(byte argument_2_) {
	if (argument_2_ != 4)
	    return -78;
	return 0;
    }
    
    final int method1342(int argument_3_, byte argument_4_) {
	if (!Node_Sub31_Sub39.method1002(((Node_Sub50)
            (((Class62) this)
                    .aClass59_Sub50_440))
            .aClass62_Sub26_4295
            .method1464(61),
            (byte) 105))
	    return 3;
	return 1;
    }
    
    final int method1377(int argument_5_) {
	return ((Class62) this).anInt441;
    }
    
    public static void method1378(byte argument) {
	aClass166_4385 = null;
	aClass166_4387 = null;
	aClass226_4388 = null;
    }
    
    Class62_Sub6(int argument_6_, Node_Sub50 argument_7_) {
	super(argument_6_, argument_7_);
    }
    
    final void method1346(boolean argument_8_) {
	if (((Node_Sub50) ((Class62) this).aClass59_Sub50_440)
		.aClass62_Sub26_4295.method1462(8192)
	    && !Node_Sub31_Sub39.method1002(((Node_Sub50)
            (((Class62) this)
                    .aClass59_Sub50_440))
            .aClass62_Sub26_4295
            .method1464(29),
            (byte) 56))
	    ((Class62) this).anInt441 = 0;
	if (!argument_8_) {
	    if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 2)
		((Class62) this).anInt441 = method1344((byte) 4);
	}
    }
    
    final void method1343(int argument_9_, byte argument_10_) {
	if (argument_10_ == -107)
	    ((Class62) this).anInt441 = argument_9_;
    }
    
    Class62_Sub6(Node_Sub50 argument_11_) {
	super(argument_11_);
    }
    
    final boolean method1379(int argument_12_) {
	if (!Node_Sub31_Sub39.method1002(((Node_Sub50)
            (((Class62) this)
                    .aClass59_Sub50_440))
            .aClass62_Sub26_4295
            .method1464(72),
            (byte) 50))
	    return false;
	return true;
    }
}
