/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class361
{
    static boolean[] aBooleanArray3051 = new boolean[8];
    static Class166 aClass166_3052;
    static int[] anIntArray3053
	= { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
    static Class368 aClass368_3054;
    static int anInt3055;
    static Js5Store aJs5Store_3056;
    static GraphicsToolkit aGraphicsToolkit3057;
    
    public static void method3954(int argument) {
	aGraphicsToolkit3057 = null;
	aBooleanArray3051 = null;
	aClass166_3052 = null;
	AthmosphericConditions.skybox = null;
	aClass368_3054 = null;
	aJs5Store_3056 = null;
	anIntArray3053 = null;
    }
    
    static final void method3955(GraphicsToolkit argument, int argument_0_) {
	if ((Class62_Sub12.anInt4402 >= 2 || Class353.aBoolean2953)
	    && dba_sub_772.aRsInterface_4345 == null) {
	    String string;
	    if (!Class353.aBoolean2953 || Class62_Sub12.anInt4402 >= 2) {
		if (!Statics.aBoolean1392
		    || !client.keyHandler.isKeyDown(81)
		    || Class62_Sub12.anInt4402 <= 2) {
		    MenuAction class59_sub51_sub9
			= Class84.aClass59_Sub51_Sub9_601;
		    if (class59_sub51_sub9 == null)
			return;
		    string = Class298.method3519(class59_sub51_sub9, false);
		    int[] anLocalInts = null;
		    if (Class9.method243((byte) 6,
					 ((MenuAction)
					  class59_sub51_sub9).action))
			anLocalInts
			    = (((Class371)
				(Class253_Sub1_Sub1.aClass365_6632.method3975
				 (-99, (int) ((MenuAction)
					      class59_sub51_sub9).parameter1)))
			       .anIntArray3155);
		    else if ((((MenuAction) class59_sub51_sub9)
			      .anInt6277)
			     != -1)
			anLocalInts
			    = ((Class371)
			       (Class253_Sub1_Sub1.aClass365_6632.method3975
				(-100,
				 (((MenuAction) class59_sub51_sub9)
				  .anInt6277)))).anIntArray3155;
		    else if (Statics.method3411((((MenuAction) class59_sub51_sub9).action), -13)) {
			Node_Sub35 class59_sub35
			    = ((Node_Sub35)
			       (Class294.aJagexHashMap_2453.get((long) (int) ((MenuAction) class59_sub51_sub9).parameter1)));
			if (class59_sub35 != null) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				= (((Node_Sub35) class59_sub35)
				   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
			    Class291 class291
				= (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				    class104_sub2_sub2_sub5_sub1)
				   .aClass291_6832);
			    if (((Class291) class291).anIntArray2374 != null)
				class291
				    = (class291.method3485
				       (ClientVariables.instance,
					-1));
			    if (class291 != null)
				anLocalInts
				    = ((Class291) class291).anIntArray2324;
			}
		    } else if (Class200.method2912((((MenuAction)
						     class59_sub51_sub9)
						    .action),
						   -1)) {
			Object object = null;
			Class266 class266;
			if (((MenuAction) class59_sub51_sub9).action
			    != 1008)
			    class266
				= (Node_Sub31_Sub30.aClass257_5983
				       .method3298
				   ((byte) 28, (int) ((((MenuAction)
							class59_sub51_sub9)
						       .parameter1) >>> 32
						      & 0x7fffffffL)));
			else
			    class266
				= (Node_Sub31_Sub30.aClass257_5983
				       .method3298
				   ((byte) 93,
				    (int) ((MenuAction)
					   class59_sub51_sub9).parameter1));
			if (((Class266) class266).anIntArray2067 != null)
			    class266
				= class266.method3345(1,
						      (ClientVariables
						       .instance));
			if (class266 != null)
			    anLocalInts = ((Class266) class266).anIntArray2054;
		    }
		    if (anLocalInts != null)
			string
			    += Node_Sub31_Sub15_Sub1.method923((byte) -91,
                    anLocalInts);
		} else
		    string
			= Class298.method3519(Class84.aClass59_Sub51_Sub9_601,
					      false);
	    } else
		string
		    = (AbstractFont.aString416
		       + MultilanguageString.SPACE_OR_COLON.getLocalizedString(
                client.language)
		       + Statics.aString6376 + " ->");
	    if (Class62_Sub12.anInt4402 > 2)
		string += ("<col=ffffff> / " + (Class62_Sub12.anInt4402 - 2)
			   + MultilanguageString.MORE_OPTIONS
				 .getLocalizedString(client.language));
	    if (Node_Sub47_Sub8.aRsInterface_6196 == null) {
		if (Node_Sub45.aRsInterface_4277 != null
		    && client.selectedGame == GameEnum.RUNESCAPE) {
		    int anLocalInt
			= (Class173.aAbstractFont_1286.method495
			   (DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anInt6604, 59, string,
			    dba_sub_772_Sub2.aClass368Array6368,
			    Class373.anInt3204 + 16,
			    Node_Sub31_Sub24.aRandom5948, 0,
			    DoublyLinkedNode_Sub51_Sub6.anInt6245 + 4, 16777215,
			    Class283.anIntArray2277));
		    Class344.method3801(-2409,
					DoublyLinkedNode_Sub51_Sub6.anInt6245 + 4, 16,
					Class373.anInt3204,
					(anLocalInt
					 + Class37.aClass76_274
					       .method1552(string, 0)));
		}
	    } else {
		AbstractFont abstractFont
		    = Node_Sub47_Sub8.aRsInterface_6196.method3221(-99,
								   argument);
		if (abstractFont == null)
		    abstractFont = Class173.aAbstractFont_1286;
		abstractFont.method505
		    ((byte) -101,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).renderWidth,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).anInt1823,
		     dba_sub_772_Sub2.aClass368Array6368,
		     Statics.anInt5262,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).renderHeight,
		     Class225.anInt1634, Class8.anIntArray78,
		     Node_Sub31_Sub24.aRandom5948, string,
		     DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anInt6604,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).colour,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).anInt1852,
		     Class283.anIntArray2277,
		     ((RsInterface) Node_Sub47_Sub8.aRsInterface_6196).anInt1933);
		Class344.method3801(-2409, Class8.anIntArray78[0],
				    Class8.anIntArray78[3],
				    Class8.anIntArray78[1],
				    Class8.anIntArray78[2]);
	    }
	}
    }
    
    static final boolean method3956(int argument, int argument_1_,
				    boolean argument_2_) {
	if ((argument_1_ & 0x84080) == 0)
	    return false;
	return true;
    }
    
    static final void method3957(int argument) {
	Node_Sub47_Sub3.aBoolean6165 = false;
	Class305.method3596(0);
    }
    
    static final void method3958(int argument, int argument_3_,
				 int argument_4_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(7, 13175, (long) argument);
	class59_sub51_sub3.method1182(-78);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_4_;
    }
    
    static {
	aClass166_3052 = new Class166(99, 6);
    }
}
