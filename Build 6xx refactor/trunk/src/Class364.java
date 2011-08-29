/* Class364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class364 implements Interface15
{
    float[] aFloatArray3646;
    int anInt3648;
    private Class159 aClass159_3649;
    int anInt3650;
    private JavaToolkit aClass_ha__3651;
    int[] anIntArray3652;
    
    public final void method61(int argument_0_, int argument_1_,
			       int argument_2_, int argument_3_,
			       int argument_4_, int argument_5_,
			       boolean argument_6_, boolean argument_7_) {
	DoublyLinkedNodeP2_Sub2_Sub5.method1891
	    (argument_5_,
	     ((Rs2DPainter) (((JavaToolkit) aClass_ha__3651)
			       .currentPainter)).myPixels,
	     109, argument_7_ ? ((Class364) this).aFloatArray3646 : null,
	     ((Class364) this).anInt3650,
	     (argument_7_
	      ? ((JavaToolkit) aClass_ha__3651).aFloatArray4644 : null),
	     argument_4_,
	     argument_6_ ? ((Class364) this).anIntArray3652 : null,
	     argument_0_, argument_1_, argument_2_, argument_3_,
	     ((Rs2DPainter) (((JavaToolkit) aClass_ha__3651)
			       .currentPainter)).width);
    }
    
    public static void method3968(int argument) {
	MapRelated.mapGenerationArray = null;
    }
    
    public final void method60(int argument_8_, int argument_9_,
			       int argument_10_, int argument_11_,
			       int argument_12_, int argument_13_,
			       boolean argument_14_, boolean argument_15_) {
	DoublyLinkedNodeP2_Sub2_Sub5.method1891
	    (argument_13_, ((Class364) this).anIntArray3652, 76,
	     (!argument_15_ ? null
	      : ((JavaToolkit) aClass_ha__3651).aFloatArray4644),
	     ((Rs2DPainter) (((JavaToolkit) aClass_ha__3651)
			       .currentPainter)).width,
	     argument_15_ ? ((Class364) this).aFloatArray3646 : null,
	     argument_12_,
	     (!argument_14_ ? null
	      : ((Rs2DPainter) (((JavaToolkit) aClass_ha__3651)
				  .currentPainter)).myPixels),
	     argument_8_, argument_9_, argument_10_, argument_11_,
	     ((Class364) this).anInt3650);
    }
    
    Class364(JavaToolkit argument_16_, Class368 argument_17_,
	     Class159 argument_18_) {
	aClass_ha__3651 = argument_16_;
	if (!(argument_17_ instanceof java_sprite_24)) {
	    if (!(argument_17_ instanceof Class368_Sub2_Sub2))
		throw new RuntimeException();
	    Class368_Sub2_Sub2 class368_sub2_sub2
		= (Class368_Sub2_Sub2) argument_17_;
	    ((Class364) this).anInt3650
		= ((Class368_Sub2) class368_sub2_sub2).width;
	    ((Class364) this).anIntArray3652
		= ((Class368_Sub2_Sub2) class368_sub2_sub2).anIntArray6635;
	    ((Class364) this).anInt3648
		= ((Class368_Sub2) class368_sub2_sub2).height;
	} else {
	    java_sprite_24 javasprite24
		= (java_sprite_24) argument_17_;
	    ((Class364) this).anIntArray3652
		= ((java_sprite_24) javasprite24).pixels;
	    ((Class364) this).anInt3648
		= ((Class368_Sub2) javasprite24).height;
	    ((Class364) this).anInt3650
		= ((Class368_Sub2) javasprite24).width;
	}
	if (argument_18_ != null) {
	    aClass159_3649 = argument_18_;
	    if ((((Class364) this).anInt3650
		 != ((Class159) aClass159_3649).anInt3669)
		|| (((Class364) this).anInt3648
		    != ((Class159) aClass159_3649).anInt3672))
		throw new RuntimeException();
	    ((Class364) this).aFloatArray3646
		= ((Class159) aClass159_3649).aFloatArray3674;
	}
    }
}
