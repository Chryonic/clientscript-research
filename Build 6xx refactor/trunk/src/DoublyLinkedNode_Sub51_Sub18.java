/* Class59_Sub51_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub18 extends DoublyLinkedNode
{
    static String aString6343 = null;
    static Class303_Sub1 aClass303_Sub1_6344;
    int anInt6345;
    int anInt6346;
    int anInt6347;
    Class185 aClass185_6348;
    Class47 aClass47_6349;
    int anInt6350;
    int anInt6351;

    final void method1289(byte argument_4_) {
	((DoublyLinkedNode_Sub51_Sub18) this).anInt6347
	    = (((Class185) ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348)
	       .anInt1385);
	((DoublyLinkedNode_Sub51_Sub18) this).anInt6345
	    = (((Class185) ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348)
	       .anInt1388);
	((DoublyLinkedNode_Sub51_Sub18) this).anInt6351
	    = (((Class185) ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348)
	       .anInt1384);
	if ((((Class185) ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348)
	     .aClass350_1383)
	    != null)
	    ((Class185) ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348)
		.aClass350_1383.method3830
		((((Class47) ((DoublyLinkedNode_Sub51_Sub18) this).aClass47_6349)
		  .anInt333),
		 (((Class47) ((DoublyLinkedNode_Sub51_Sub18) this).aClass47_6349)
		  .anInt323),
		 (((Class47) ((DoublyLinkedNode_Sub51_Sub18) this).aClass47_6349)
		  .anInt322),
		 Node_Sub31_Sub37.anIntArray6020);
	((DoublyLinkedNode_Sub51_Sub18) this).anInt6350
	    = Node_Sub31_Sub37.anIntArray6020[2];
	((DoublyLinkedNode_Sub51_Sub18) this).anInt6346
	    = Node_Sub31_Sub37.anIntArray6020[0];
    }
    
    static final int method1290(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 argument,
				int argument_5_) {
	Class291 class291
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) argument).aClass291_6832;
	if (((Class291) class291).anIntArray2374 != null) {
	    class291
		= class291.method3485(ClientVariables.instance,
				      -1);
	    if (class291 == null)
		return -1;
	}
	int anLocalInt = ((Class291) class291).anInt2315;
	Class354 class354 = argument.method1831();
	if (((Entity) argument).anInt6731 == -1
	    || ((Entity) argument).aBoolean6753)
	    anLocalInt = ((Class291) class291).anInt2352;
	else if ((((Entity) argument).anInt6731
		  != ((Class354) class354).anInt2999)
		 && (((Class354) class354).anInt2980
		     != ((Entity) argument).anInt6731)
		 && (((Class354) class354).anInt2973
		     != ((Entity) argument).anInt6731)
		 && (((Class354) class354).anInt2975
		     != ((Entity) argument).anInt6731)) {
	    if ((((Class354) class354).anInt2956
		 == ((Entity) argument).anInt6731)
		|| (((Entity) argument).anInt6731
		    == ((Class354) class354).anInt2964)
		|| (((Entity) argument).anInt6731
		    == ((Class354) class354).anInt2966)
		|| (((Entity) argument).anInt6731
		    == ((Class354) class354).anInt2988))
		anLocalInt = ((Class291) class291).anInt2330;
	} else
	    anLocalInt = ((Class291) class291).anInt2338;
	return anLocalInt;
    }
    
    static final Class306 method1291(int argument, int argument_6_) {
	Class306[] class306s = Class110.method1986((byte) 104);
	for (int anLocalInt = 0; anLocalInt < class306s.length; anLocalInt++) {
	    Class306 class306 = class306s[anLocalInt];
	    if (((Class306) class306).anInt2584 == argument)
		return class306;
	}
	return null;
    }
    
    static final void method1292(int argument) {
	Class28.anInt205 = argument;
    }
    
    public static void method1293(byte argument) {
	aClass303_Sub1_6344 = null;
	aString6343 = null;
    }
    
    DoublyLinkedNode_Sub51_Sub18(Class185 argument_7_, DoublyLinkedNodeP2_Sub7 argument_8_) {
	((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348 = argument_7_;
	((DoublyLinkedNode_Sub51_Sub18) this).aClass47_6349
	    = ((DoublyLinkedNode_Sub51_Sub18) this).aClass185_6348.method2859(1);
	method1289((byte) -98);
    }
}
