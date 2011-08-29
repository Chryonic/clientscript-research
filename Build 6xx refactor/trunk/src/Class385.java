/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class385 implements Interface9
{
    static int anInt3573;
    int anInt3574;
    static int anInt3575 = -1;
    boolean aBoolean3576;
    int anInt3577;
    int anInt3578;
    int anInt3579;
    int anInt3580;
    int anInt3581;
    
    public final long method46(boolean argument_0_) {
	if (argument_0_)
	    return 14L;
	long[] ls = Class1.aLongArray3504;
	long l = -1L;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) ((Class385) this).anInt3581)
				& 0xffL)];
	l = ls[(int) ((l ^ (long) (((Class385) this).anInt3580 >> 8))
		      & 0xffL)] ^ l >>> 8;
	l = (ls[(int) (((long) ((Class385) this).anInt3580 ^ l) & 0xffL)]
	     ^ l >>> 8);
	l = ls[(int) ((l ^ (long) (((Class385) this).anInt3579 >> 24))
		      & 0xffL)] ^ l >>> 8;
	l = ls[(int) (((long) (((Class385) this).anInt3579 >> 16) ^ l)
		      & 0xffL)] ^ l >>> 8;
	l = ls[(int) (((long) (((Class385) this).anInt3579 >> 8) ^ l)
		      & 0xffL)] ^ l >>> 8;
	l = l >>> 8 ^ ls[(int) ((l ^ (long) ((Class385) this).anInt3579)
				& 0xffL)];
	l = (ls[(int) (((long) ((Class385) this).anInt3577 ^ l) & 0xffL)]
	     ^ l >>> 8);
	l = ls[(int) (((long) (((Class385) this).anInt3578 >> 24) ^ l)
		      & 0xffL)] ^ l >>> 8;
	l = ls[(int) (((long) (((Class385) this).anInt3578 >> 16) ^ l)
		      & 0xffL)] ^ l >>> 8;
	l = ls[(int) ((l ^ (long) (((Class385) this).anInt3578 >> 8))
		      & 0xffL)] ^ l >>> 8;
	l = (ls[(int) ((l ^ (long) ((Class385) this).anInt3578) & 0xffL)]
	     ^ l >>> 8);
	l = (ls[(int) (((long) ((Class385) this).anInt3574 ^ l) & 0xffL)]
	     ^ l >>> 8);
	l = (l >>> 8
	     ^ ls[(int) (((long) (((Class385) this).aBoolean3576 ? 1 : 0) ^ l)
			 & 0xffL)]);
	return l;
    }
    
    static final void method4120(int argument) {
	try {
	    ((Js5Store) Statics.aJs5Store_1153).discardUnpacked = 1;
	    Class342.method3787(false);
	    Class154_Sub1.anInt5637 = 0;
	    Node_Sub10.anInt3935 = 0;
	    Class46_Sub3_Sub1.anInt5739 = 0;
	    Node_Sub31_Sub27.anInt5962 = 0;
	    Node_Sub31_Sub18.anInt5919 = 0;
	    Class246.anInt1793 = 0;
	    Class354.anInt2974 = 0;
	    Class62_Sub28.anInt4458 = 0;
	    Class151.anInt1148 = 0;
	    Cs2Runtime.anInt2643 = 0;
	    Cs2Runtime.anInt2649 = 0;
	    Node_Sub47_Sub6.anInt6185 = 0;
	    boolean anLocalBoolean = false;
	    Class87.aBoolean3551 = true;
	    Node_Sub31_Sub31.aBoolean5990 = true;
	    Statics.method2865((byte) -93);
	    for (int anLocalInt = 0;
		 anLocalInt < Class166.aClass124Array1216.length; anLocalInt++)
		Class166.aClass124Array1216[anLocalInt] = null;
	    Class353.aBoolean2953 = false;
	    Node_Sub31_Sub12.method912(0);
	    DoublyLinkedNodeP2_Sub6.aFloat4538
		= (float) (-80 + (int) (160.0 * Math.random()) & 0x3fff);
	    Node_Sub11.anInt3945 = -20 + (int) (Math.random() * 30.0);
	    Class366.anInt3089 = (int) (100.0 * Math.random()) - 50;
	    Node_Sub31_Sub4.anInt5852 = (int) (Math.random() * 80.0) + -40;
	    Class2_Sub10.anInt3824 = (int) (Math.random() * 120.0) + -60;
	    Node_Sub31_Sub36.anInt6014
		= -55 + (int) (110.0 * Math.random());
	    DoublyLinkedNode_Sub51_Sub19.method1295(108);
	    for (int anLocalInt = 0; anLocalInt < 2048; anLocalInt++)
		Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt]
		    = null;
	    dba_sub_772_Sub2.anInt6369 = 0;
	    Statics.anInt5573 = 0;
	    Class294.aJagexHashMap_2453.method1527(0);
	    Node_Sub31_Sub3.aCyclicLinkedList_5850.clear();
	    Class305.aCyclicLinkedList_3640.clear();
	    Node_Sub49.aClass366_4290.method3990(argument);
	    tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.method1527(0);
	    Statics.aCyclicLinkedList_3722 = new CyclicLinkedList();
	    Class88.aCyclicLinkedList_643 = new CyclicLinkedList();
	    ClientVariables.instance.resetAll();
	    Class101.method1735((byte) -90);
	    Class47.anInt336 = 0;
	    Class353_Sub5.anInt5499 = 0;
	    Class298.anInt2475 = 0;
	    Class120.anInt980 = 0;
	    InputStream_Sub2.anInt38 = 0;
	    Class311.anInt2591 = 0;
	    Class299.anInt2495 = 0;
	    Class182.anInt1378 = 0;
	    Class391.anInt3291 = 0;
	    Class317.anInt2623 = 0;
	    for (int anLocalInt = 0;
		 ((Cs2Runtime.integerGlobalVariables.length ^ 0xffffffff)
		  < (anLocalInt ^ 0xffffffff));
		 anLocalInt++) {
		if (Class273.aBooleanArray2184[anLocalInt] == false)
		    Cs2Runtime.integerGlobalVariables[anLocalInt] = -1;
	    }
	    if (Class66.anInt467 != -1)
		Node_Sub9_Sub1.method580(48, Class66.anInt467);
	    for (Node_Sub49 class59_sub49
		     = (Node_Sub49) Class2_Sub5.aJagexHashMap_3787.first(0);
		 class59_sub49 != null;
		 class59_sub49
		     = ((Node_Sub49)
			Class2_Sub5.aJagexHashMap_3787.next())) {
		if (class59_sub49.isLinked() == false) {
		    class59_sub49 = ((Node_Sub49)
				     Class2_Sub5.aJagexHashMap_3787.first(0));
		    if (class59_sub49 == null)
			break;
		}
		Class222_Sub2.method3037(false, true, class59_sub49,
					 -86709072);
	    }
	    Class66.anInt467 = -1;
	    Class2_Sub5.aJagexHashMap_3787 = new JagexHashMap(8);
	    RsInterface.method729(103);
	    Gl2Water0.aRsInterface_3801 = null;
	    for (int anLocalInt = 0; (anLocalInt ^ 0xffffffff) > -9;
		 anLocalInt++) {
		Node_Sub28_Sub1.aStringArray5831[anLocalInt] = null;
		Node_Sub31_Sub16.aBooleanArray5908[anLocalInt] = false;
		RuntimeException_Sub2.anIntArray3425[anLocalInt] = -1;
	    }
	    Class284.method3455(3);
	    Class281.aBoolean2273 = true;
	    for (int anLocalInt = 0; anLocalInt < 100; anLocalInt++)
		Class109_Sub1.aBooleanArray4604[anLocalInt] = true;
	    for (int anLocalInt = 0; anLocalInt < 6; anLocalInt++)
		Class128.aClass272Array1043[anLocalInt] = new Class272();
	    for (int anLocalInt = 0; (anLocalInt ^ 0xffffffff) > -26;
		 anLocalInt++) {
		Class_aa_Sub3.anIntArray3756[anLocalInt] = 0;
		Class156.anIntArray3686[anLocalInt] = 0;
		Node_Sub31_Sub37.anIntArray6034[anLocalInt] = 0;
	    }
	    Class120.method2385((byte) 45);
	    Class_aa_Sub2.aShortArray3754 = Class1_Sub1.aShortArray5599
		= Class62_Sub27.aShortArray4449 = Class70.aShortArray483
		= new short[256];
	    Statics.aBoolean3513 = true;
	    Class316.aString2615
		= MultilanguageString.WALK_HERE.getLocalizedString(client.language);
	    AthmosphericConditions.aClass59_Sub50_116.method1159(((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						      .aClass62_Sub29_4310
						      .method1477(51),
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub29_4328),
						  argument ^ 0x7b);
	    AthmosphericConditions.aClass59_Sub50_116.method1159(((Node_Sub50)
						   AthmosphericConditions.aClass59_Sub50_116)
						      .aClass62_Sub25_4321
						      .method1458(40),
						  (((Node_Sub50)
						    AthmosphericConditions.aClass59_Sub50_116)
						   .aClass62_Sub25_4332),
						  111);
	    Class345.anInt2906 = 0;
	    Class353_Sub2.method3898(argument + 97);
	    Class245_Sub1_Sub1.method3182(1624);
	    Class269.aClass59_Sub1_2154 = null;
	    ((Js5Store) Statics.aJs5Store_1153).discardUnpacked = 2;
	    Statics.aLong2229 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw GameEnum.method1753(runtimeexception,
                "wj.C(" + argument + ')');
	}
    }
    
    static final boolean method4121(int argument, int argument_1_,
				    int argument_2_) {
	if ((argument & 0x180) == 0)
	    return false;
	return true;
    }
    
    static final int method4122(int argument, int argument_3_, int argument_4_,
				int argument_5_, int argument_6_) {
	int anLocalInt
	    = ((-Node_Sub6.COSINETABLE[argument * 8192 / argument_4_]
		+ argument_5_)
	       >> 1);
	return (((65536 - anLocalInt) * argument_3_ >> 16)
		+ (anLocalInt * argument_6_ >> 16));
    }
    
    public final boolean method47(Interface9 argument_7_, int argument_8_) {
	if (!(argument_7_ instanceof Class385))
	    return false;
	Class385 class385 = (Class385) argument_7_;
	if (argument_8_ != -29327)
	    return true;
	if (((Class385) class385).anInt3581 != ((Class385) this).anInt3581)
	    return false;
	if (((Class385) this).anInt3580 != ((Class385) class385).anInt3580)
	    return false;
	if (((Class385) this).anInt3579 != ((Class385) class385).anInt3579)
	    return false;
	if (((Class385) class385).anInt3577 != ((Class385) this).anInt3577)
	    return false;
	if (((Class385) class385).anInt3578 != ((Class385) this).anInt3578)
	    return false;
	if (((Class385) class385).anInt3574 != ((Class385) this).anInt3574)
	    return false;
	if (((Class385) class385).aBoolean3576
	    != ((Class385) this).aBoolean3576)
	    return false;
	return true;
    }
    
    static final void method4123(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument,
				 byte argument_9_) {
	for (Node_Sub13 class59_sub13
		 = ((Node_Sub13)
		    Node_Sub31_Sub8.aCyclicLinkedList_5872.getFirst());
	     class59_sub13 != null;
	     class59_sub13 = (Node_Sub13) Node_Sub31_Sub8
						 .aCyclicLinkedList_5872
						 .getNext()) {
	    if (argument == (((Node_Sub13) class59_sub13)
			     .aClass104_Sub2_Sub2_Sub5_Sub1_3974)) {
		if (((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
		    != null) {
		    Class353_Sub2.aClass59_Sub9_Sub3_5483.method626
			(((Node_Sub13) class59_sub13)
			 .aClass59_Sub9_Sub4_3968);
		    ((Node_Sub13) class59_sub13).aClass59_Sub9_Sub4_3968
			= null;
		}
		class59_sub13.unlink();
		break;
	    }
	}
    }
}
