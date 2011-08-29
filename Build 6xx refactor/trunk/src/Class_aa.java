/* Class_aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class_aa
{
    static Class166 aClass166_52 = new Class166(15, -1);
    static float[] aFloatArray54
	= { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F,
	    0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    static Class368[] aClass368Array55;
    
    static final void method159(RsInterface argument, byte argument_0_,
				GraphicsToolkit argument_1_, int argument_2_,
				int argument_3_) {
	int anLocalInt = 63;
	int anLocalInt_4_ = 7;
	for (int anLocalInt_5_ = 63; anLocalInt_5_ >= 0; anLocalInt_5_--) {
	    Node_Sub47_Sub1.method1116(true, false, true);
	    int anLocalInt_6_
		= anLocalInt & 0x7f | ((anLocalInt_5_ & 0x3f) << 10
				       | (anLocalInt_4_ & 0x7) << 7);
	    int anLocalInt_7_ = HslToRgb.table[anLocalInt_6_];
	    Class112.method2009(true, -11692, false);
	    argument_1_.fillRect(argument_3_, (((-anLocalInt_5_ + 63) * ((RsInterface) argument).renderHeight) >> 6) + argument_2_, ((RsInterface) argument).renderWidth, (((RsInterface) argument).renderHeight >> 6) + 1, anLocalInt_7_, 0);
	}
    }
    
    public static void method160(byte argument) {
	aClass166_52 = null;
	MapRelated.clippingMaps = null;
	aFloatArray54 = null;
	aClass368Array55 = null;
	GlImageSkybox.textureIds = null;
    }
    
    static final int method161(byte argument, int argument_8_,
			       int argument_9_) {
	if (argument_8_ == 1 || argument_8_ == 3)
	    return DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anIntArray6572[argument_9_ & 0x3];
	return Class227.anIntArray1644[argument_9_ & 0x3];
    }
    
    static final void method162
	(int argument, int argument_10_, int argument_11_, int argument_12_,
	 GraphicsToolkit argument_13_, MenuAction argument_14_,
	 int argument_15_, int argument_16_, int argument_17_,
	 int argument_18_, int argument_19_, boolean argument_20_) {
	if (argument_15_ > argument_17_
	    && argument_15_ < argument_17_ + argument
	    && argument_11_ > argument_10_ - 13
	    && argument_10_ + 3 > argument_11_
	    && ((MenuAction) argument_14_).aBoolean6273)
	    argument_18_ = argument_16_;
	int[] anLocalInts = null;
	if (!Class9.method243((byte) 6,
			      ((MenuAction) argument_14_).action)) {
	    if (((MenuAction) argument_14_).anInt6277 != -1)
		anLocalInts
		    = ((Class371) (Class253_Sub1_Sub1.aClass365_6632.method3975
				   (-111, (((MenuAction) argument_14_)
					   .anInt6277)))).anIntArray3155;
	    else if (!Statics.method3411((((MenuAction) argument_14_).action), -13)) {
		if (Class200.method2912((((MenuAction) argument_14_)
					 .action),
					-1)) {
		    Object object = null;
		    Class266 class266;
		    if (((MenuAction) argument_14_).action != 1008)
			class266
			    = (Node_Sub31_Sub30.aClass257_5983.method3298
			       ((byte) 58,
				(int) ((((MenuAction) argument_14_)
					.parameter1) >>> 32
				       & 0x7fffffffL)));
		    else
			class266
			    = (Node_Sub31_Sub30.aClass257_5983.method3298
			       ((byte) 41,
				(int) (((MenuAction) argument_14_)
				       .parameter1)));
		    if (((Class266) class266).anIntArray2067 != null)
			class266
			    = class266.method3345(1, (ClientVariables
						      .instance));
		    if (class266 != null)
			anLocalInts = ((Class266) class266).anIntArray2054;
		}
	    } else {
		Node_Sub35 class59_sub35
		    = ((Node_Sub35)
		       (Class294.aJagexHashMap_2453.get((long) (int) (((MenuAction) argument_14_).parameter1))));
		if (class59_sub35 != null) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			= (((Node_Sub35) class59_sub35)
			   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
		    Class291 class291 = (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					  class104_sub2_sub2_sub5_sub1)
					 .aClass291_6832);
		    if (((Class291) class291).anIntArray2374 != null)
			class291 = class291.method3485((ClientVariables
							.instance),
						       -1);
		    if (class291 != null)
			anLocalInts = ((Class291) class291).anIntArray2324;
		}
	    }
	} else
	    anLocalInts
		= ((Class371) (Class253_Sub1_Sub1.aClass365_6632.method3975
			       (-86, (int) (((MenuAction) argument_14_)
					    .parameter1)))).anIntArray3155;
	String string = Class298.method3519(argument_14_, false);
	if (anLocalInts != null)
	    string
		+= Node_Sub31_Sub15_Sub1.method923((byte) 115, anLocalInts);
	Class173.aAbstractFont_1286.method504(0, argument_18_, argument_10_,
					 Class283.anIntArray2277,
					 dba_sub_772_Sub2.aClass368Array6368,
					 argument_17_ + 3, string, 0);
	if (((MenuAction) argument_14_).aBoolean6266)
	    Class356.aClass368_3014.method4014((argument_17_
						+ Class37.aClass76_274
						      .method1552(string, 0)
						+ 5),
					       argument_10_ - 12);
    }
    
    public Class_aa() {
	/* empty */
    }
    
    static {
    }
}
