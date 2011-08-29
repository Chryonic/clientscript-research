/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class118
{
    static int anInt967;
    tia_sub_35DoublyLinked aTia_sub_35_968;
    Class167 aClass167_969;
    
    static final void method2376() {
	int anLocalInt = 10;
	int anLocalInt_0_ = 30;
	if (Class28.anInt205 != 0 && Class1.aAbstractFont_3510 != null) {
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834
		.getScissor(DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605);
	    for (int anLocalInt_1_ = 0;
		 anLocalInt_1_ < Class62_Sub3.anIntArray4373.length;
		 anLocalInt_1_++)
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2050
		    ((DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[3]
		      - DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[1]),
		     44,
		     (Class62_Sub3.anIntArray4373[anLocalInt_1_]
		      + IOException_Sub1.anIntArray41[anLocalInt_1_]),
		     DoublyLinkedNodeP2_Sub2_Sub3_Sub2.anIntArray6605[1], -256);
	    for (int anLocalInt_2_ = 0; anLocalInt_2_ < Class186.anInt1390;
		 anLocalInt_2_++) {
		Class48 class48 = Class245.aClass48Array1791[anLocalInt_2_];
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.H
		    (((Class48) class48).anIntArray347[0],
		     ((Class48) class48).anIntArray348[0],
		     ((Class48) class48).anIntArray345[0],
		     Class62_Sub3.anIntArray4376);
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.H
		    (((Class48) class48).anIntArray347[1],
		     ((Class48) class48).anIntArray348[1],
		     ((Class48) class48).anIntArray345[1],
		     Class342.anIntArray2886);
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.H
		    (((Class48) class48).anIntArray347[2],
		     ((Class48) class48).anIntArray348[2],
		     ((Class48) class48).anIntArray345[2],
		     Class353_Sub2.anIntArray5482);
		DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.H
		    (((Class48) class48).anIntArray347[3],
		     ((Class48) class48).anIntArray348[3],
		     ((Class48) class48).anIntArray345[3],
		     Node_Sub31_Sub34.anIntArray6008);
		if (Class62_Sub3.anIntArray4376[2] != -1
		    && Class342.anIntArray2886[2] != -1
		    && Class353_Sub2.anIntArray5482[2] != -1
		    && Node_Sub31_Sub34.anIntArray6008[2] != -1) {
		    int anLocalInt_3_ = -65536;
		    if (((Class48) class48).aByte341 == 4)
			anLocalInt_3_ = -16776961;
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2035
			(anLocalInt_3_, (byte) -94,
			 Class62_Sub3.anIntArray4376[1],
			 Class342.anIntArray2886[0],
			 Class342.anIntArray2886[1],
			 Class62_Sub3.anIntArray4376[0]);
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2035
			(anLocalInt_3_, (byte) -72, Class342.anIntArray2886[1],
			 Class353_Sub2.anIntArray5482[0],
			 Class353_Sub2.anIntArray5482[1],
			 Class342.anIntArray2886[0]);
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2035
			(anLocalInt_3_, (byte) -42,
			 Class353_Sub2.anIntArray5482[1],
			 Node_Sub31_Sub34.anIntArray6008[0],
			 Node_Sub31_Sub34.anIntArray6008[1],
			 Class353_Sub2.anIntArray5482[0]);
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2035
			(anLocalInt_3_, (byte) -44,
			 Node_Sub31_Sub34.anIntArray6008[1],
			 Class62_Sub3.anIntArray4376[0],
			 Class62_Sub3.anIntArray4376[1],
			 Node_Sub31_Sub34.anIntArray6008[0]);
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2035
			(anLocalInt_3_, (byte) -53,
			 Class62_Sub3.anIntArray4376[1],
			 Class353_Sub2.anIntArray5482[0],
			 Class353_Sub2.anIntArray5482[1],
			 Class62_Sub3.anIntArray4376[0]);
		}
	    }
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 45,
					   -16777216,
					   ("Dynamic: " + Class51.anInt383
					    + "/" + 5000),
					   -256, anLocalInt);
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 60,
					   -16777216,
					   ("Total Opaque Onscreen: "
					    + DoublyLinkedNode_Sub51_Sub3.anInt6229
					    + "/" + 10000),
					   -256, anLocalInt);
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 75,
					   -16777216,
					   ("Total Trans Onscreen: "
					    + FileOnDisk.anInt1453 + "/" + 5000),
					   -256, anLocalInt);
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 90,
					   -16777216,
					   ("Occluders: "
					    + (DoublyLinkedNodeP2_Sub6.anInt4547
					       + Node_Sub32_Sub4.anInt6088)
					    + " Active: "
					    + Class186.anInt1390),
					   -256, anLocalInt);
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 105,
					   -16777216,
					   ("Occluded: Ground:"
					    + Class353_Sub5.anInt5504
					    + " Walls: "
					    + Node_Sub31_Sub2.anInt5847
					    + " CPs: " + Class356.anInt3011
					    + " Pixels: "
					    + Class253_Sub3.anInt5675),
					   -256, anLocalInt);
	    Class1.aAbstractFont_3510.method507((byte) 56, anLocalInt_0_ + 120,
					   -16777216,
					   ("Occlude Calc Took: "
					    + Class305.aLong3642 / 1000L
					    + "us"),
					   -256, anLocalInt);
	    if (Class28.anInt205 == 2
		&& DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406 != null) {
		for (int anLocalInt_4_ = 0;
		     anLocalInt_4_ < DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406.length;
		     anLocalInt_4_++) {
		    float f = (float) (DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406
				       [anLocalInt_4_]);
		    f /= 4194304.0F;
		    if (f > 1.0F)
			f = 1.0F;
		    f *= 255.0F;
		    f = 255.0F - f;
		    int anLocalInt_5_ = (int) f;
		    DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406[anLocalInt_4_]
			= (anLocalInt_5_ | anLocalInt_5_ << 8
			   | anLocalInt_5_ << 16 | ~0xffffff);
		}
		Class368 class368
		    = (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.method2047
		       (Class25.anInt164, DoublyLinkedNodeP2_Sub2_Sub1.anIntArray6406, 0, Class62_Sub16.anInt4414, Class25.anInt164));
		class368.method4004(anLocalInt, 170, 1, 0, 0);
	    }
	}
    }
    
    public Class118() {
	/* empty */
    }
}
