/* Class67_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Skybox_Sub2_Sub1 extends DxSkybox
{
    private int anInt6390;
    private GraphicsToolkit_Sub2 aClass_ha_Sub2_6391;
    private Interface7_Impl3 anInterface7_Impl3_6392;
    private int anInt6393;
    static int anInt6394 = 0;
    private int anInt6395;
    private int anInt6396;
    private int anInt6397;
    private int anInt6398;
    
    static final void method1514(byte argument,
				 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_0_,
				 boolean argument_1_) {
	if (Class62_Sub12.anInt4402 < 400) {
	    if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 == argument_0_) {
		if (Class353.aBoolean2953
		    && (Node_Sub31_Sub4.anInt5855 & 0x10) != 0)
		    Class173.method2769
			(false, AbstractFont.aString416, false, -1,
			 (Statics.aString6376 + " -> <col=ffffff>"
			  + MultilanguageString.SELF
				.getLocalizedString(client.language)),
			 (byte) 84, true, 0, 60,
			 (long) (((Entity) argument_0_)
				 .anInt6745),
			 0, Class262.anInt2040, 0L);
	    } else {
		if (argument != 77)
		    method1514((byte) -125, null, true);
		String string;
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6844
		    == 0) {
		    boolean anLocalBoolean = true;
		    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .anInt6850) != -1
			&& (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
			    .anInt6850) != -1) {
			int anLocalInt
			    = (((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .anInt6850)
				>= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				    argument_0_).anInt6850)
			       ? (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
				  .anInt6850)
			       : (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .anInt6850));
			int anLocalInt_2_
			    = (-(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
				 .anInt6855)
			       + (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .anInt6855));
			if (anLocalInt_2_ < 0)
			    anLocalInt_2_ = -anLocalInt_2_;
			if (anLocalInt < anLocalInt_2_)
			    anLocalBoolean = false;
		    }
		    String string_3_
			= (GameEnum.STELLARDAWN != client.selectedGame
			   ? MultilanguageString.LEVEL
				 .getLocalizedString(client.language)
			   : MultilanguageString.RATING
				 .getLocalizedString(client.language));
		    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_).anInt6855
			< (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
			   .anInt6841))
			string
			    = (argument_0_.method1855(true,
						      argument - 1075074117)
			       + (!anLocalBoolean ? "<col=ffffff>"
				  : (Class50.method462
				     (argument - 68,
				      (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					(Class308
					 .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				       .anInt6855),
				      ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				       argument_0_).anInt6855)))
			       + " (" + string_3_
			       + (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
				  .anInt6855)
			       + "+"
			       + (-((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				    argument_0_).anInt6855
				  + ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				     argument_0_).anInt6841)
			       + ")");
		    else
			string
			    = (argument_0_.method1855(true,
						      argument - 1075074117)
			       + (!anLocalBoolean ? "<col=ffffff>"
				  : (Class50.method462
				     (9,
				      (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					(Class308
					 .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				       .anInt6855),
				      ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				       argument_0_).anInt6855)))
			       + " (" + string_3_
			       + (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
				  .anInt6855)
			       + ")");
		} else if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
			    .anInt6844)
			   != -1)
		    string
			= (argument_0_.method1855(true, -1075074040) + " ("
			   + MultilanguageString.SKILL.getLocalizedString(
                    (client
                            .language))
			   + (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) argument_0_)
			      .anInt6844)
			   + ")");
		else
		    string = argument_0_.method1855(true, -1075074040);
		if (Class353.aBoolean2953 && !argument_1_
		    && (Node_Sub31_Sub4.anInt5855 & 0x8) != 0)
		    Class173.method2769(false, AbstractFont.aString416, false, -1,
					(Statics.aString6376
					 + " -> <col=ffffff>" + string),
					(byte) -79, true, 0, 49,
					(long) ((Entity)
						argument_0_).anInt6745,
					0, Class262.anInt2040,
					(long) ((Entity)
						argument_0_).anInt6745);
		if (!argument_1_) {
		    for (int anLocalInt = 7; anLocalInt >= 0; anLocalInt--) {
			if (Node_Sub28_Sub1.aStringArray5831[anLocalInt]
			    != null) {
			    short anLocalInt_4_ = 0;
			    if ((GameEnum.RUNESCAPE
				 == client.selectedGame)
				&& (Node_Sub28_Sub1.aStringArray5831
					[anLocalInt].equalsIgnoreCase
				    (MultilanguageString.ATTACK.getLocalizedString
                            (client.language)))) {
				if (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.aBoolean6865
				    && (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					 argument_0_).anInt6855
					> (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					    (Class308
					     .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					   .anInt6855)))
				    anLocalInt_4_ = (short) 2000;
				if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .anInt6860) != 0
				    && ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					argument_0_).anInt6860 != 0) {
				    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					 argument_0_).anInt6860
					== (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					     (Class308
					      .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
					    .anInt6860))
					anLocalInt_4_ = (short) 2000;
				    else
					anLocalInt_4_ = (short) 0;
				} else if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					    argument_0_)
					   .aBoolean6856)
				    anLocalInt_4_ = (short) 2000;
			    } else if (Node_Sub31_Sub16.aBooleanArray5908
				       [anLocalInt])
				anLocalInt_4_ = (short) 2000;
			    short anLocalInt_5_
				= (short) (anLocalInt_4_
					   + (Class381.aShortArray3240
					      [anLocalInt]));
			    int anLocalInt_6_
				= ((RuntimeException_Sub2.anIntArray3425
				    [anLocalInt]) == -1
				   ? Class133_Sub2.anInt5017
				   : (RuntimeException_Sub2.anIntArray3425
				      [anLocalInt]));
			    Class173.method2769
				(false,
				 (Node_Sub28_Sub1.aStringArray5831
				  [anLocalInt]),
				 false, -1, "<col=ffffff>" + string,
				 (byte) -98, true, 0, anLocalInt_5_,
				 (long) ((Entity)
					 argument_0_).anInt6745,
				 0, anLocalInt_6_,
				 (long) ((Entity)
					 argument_0_).anInt6745);
			}
		    }
		} else
		    Class173.method2769(true, "<col=cccccc>" + string, false,
					0, "", (byte) -99, false, 0, -1,
					(long) ((Entity)
						argument_0_).anInt6745,
					0, -1, 0L);
		if (!argument_1_) {
		    for (MenuAction class59_sub51_sub9
			     = ((MenuAction)
				DoublyLinkedNodeP2_Sub2_Sub1.aCyclicLinkedList_6404
				    .getFirst());
			 class59_sub51_sub9 != null;
			 class59_sub51_sub9
			     = (MenuAction) DoublyLinkedNodeP2_Sub2_Sub1
							.aCyclicLinkedList_6404
							.getNext()) {
			if (((MenuAction) class59_sub51_sub9).action
			    == 51) {
			    ((MenuAction) class59_sub51_sub9)
				.aString6274
				= "<col=ffffff>" + string;
			    break;
			}
		    }
		}
	    }
	}
    }
    
    static final Class84_Sub1 method1515(boolean argument) {
	Statics.anInt5560 = 0;
	return Class38.method394(107);
    }
    
    final Interface7_Impl3 method1513(int argument_7_) {
	if (argument_7_ != 22113)
	    method1515(true);
	if (anInterface7_Impl3_6392 == null) {
	    TextureSource textureSource
		= ((GraphicsToolkit) aClass_ha_Sub2_6391).textureSource;
	    Statics.anIntArray3604[0] = anInt6390;
	    Statics.anIntArray3604[4] = anInt6398;
	    Statics.anIntArray3604[5] = anInt6395;
	    Statics.anIntArray3604[1] = anInt6393;
	    Statics.anIntArray3604[2] = anInt6396;
	    Statics.anIntArray3604[3] = anInt6397;
	    boolean anLocalBoolean = false;
	    int anLocalInt = 0;
	    for (int anLocalInt_8_ = 0; anLocalInt_8_ < 6; anLocalInt_8_++) {
		if (!textureSource
			 .method9(true, Statics.anIntArray3604[anLocalInt_8_]))
		    return null;
		TextureDescriptor textureDescriptor
		    = textureSource.getDescriptor((Statics.anIntArray3604[anLocalInt_8_]), true);
		int anLocalInt_9_
		    = ((TextureDescriptor) textureDescriptor).isHalfSize ? 64 : 128;
		if (anLocalInt < anLocalInt_9_)
		    anLocalInt = anLocalInt_9_;
		if (((TextureDescriptor) textureDescriptor).aByte846 > 0)
		    anLocalBoolean = true;
	    }
	    for (int anLocalInt_10_ = 0; anLocalInt_10_ < 6; anLocalInt_10_++)
		DoublyLinkedNodeP2_Sub4_Sub2.anIntArrayArray6445[anLocalInt_10_]
		    = textureSource.method13(anLocalInt, false, anLocalInt,
					    1.0F,
					    (Statics.anIntArray3604
					     [anLocalInt_10_]),
					    (byte) -112);
	    anInterface7_Impl3_6392
		= aClass_ha_Sub2_6391.method2220((byte) 102, anLocalBoolean,
						 anLocalInt,
						 (DoublyLinkedNodeP2_Sub4_Sub2
						  .anIntArrayArray6445));
	}
	return anInterface7_Impl3_6392;
    }
    
    Skybox_Sub2_Sub1(GraphicsToolkit_Sub2 argument_11_, int argument_12_, int argument_13_, int argument_14_, int argument_15_, int argument_16_, int argument_17_) {
	anInt6393 = argument_13_;
	anInt6390 = argument_12_;
	anInt6396 = argument_14_;
	anInt6398 = argument_16_;
	aClass_ha_Sub2_6391 = argument_11_;
	anInt6395 = argument_17_;
	anInt6397 = argument_15_;
    }
}
