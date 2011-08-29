/* Class353_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class353_Sub9 extends Class353
{
    static int anInt5522;
    static int anInt5523;
    static int anInt5524;
    
    final void method3882(int argument_0_, GlTexture argument_1_,
			  int argument_2_) {
	((Class353) this).toolkit.bindTexture(argument_1_);
	if (argument_0_ != 9)
	    anInt5523 = 93;
	((Class353) this).toolkit.setCombineMode(argument_2_);
    }
    
    final void configure(int argument_3_, int argument_4_, int argument_5_) {
	if (argument_3_ < 122)
	    anInt5522 = 98;
    }
    
    static final void method3915(DoublyLinkedNodeP2_Sub10 argument, byte argument_6_) {
	((DoublyLinkedNodeP2_Sub10) argument).aClass104_Sub2_4596 = null;
	int anLocalInt
	    = ((DoublyLinkedNodeP2_Sub10) argument).aClass104_Sub9Array4595.length;
	for (int anLocalInt_7_ = 0; anLocalInt_7_ < anLocalInt;
	     anLocalInt_7_++)
	    ((DoublyLinkedNodeP2_Sub9) (((DoublyLinkedNodeP2_Sub10) argument)
			      .aClass104_Sub9Array4595
			      [anLocalInt_7_])).aBoolean4591
		= false;
	synchronized (Node_Sub31_Sub17.aClass366Array5915) {
	    if (anLocalInt < Node_Sub31_Sub17.aClass366Array5915.length
		&& Class350.anIntArray2924[anLocalInt] < 200) {
		Node_Sub31_Sub17.aClass366Array5915[anLocalInt]
		    .method3983(argument, (byte) 119);
		Class350.anIntArray2924[anLocalInt]++;
	    }
	}
    }
    
    final void method3891(int argument_8_) {
	if (argument_8_ == -1756)
	    ((Class353) this).toolkit.method2325(false);
    }
    
    final void bind(boolean argument_9_, boolean argument_10_) {
	((Class353) this).toolkit.method2325(true);
    }
    
    final void method3885(int argument_11_, boolean argument_12_) {
	if (argument_11_ != 0)
	    anInt5522 = -41;
    }
    
    final boolean method3890(int argument_13_) {
	if (argument_13_ != -6808)
	    method3885(119, false);
	return true;
    }
    
    public static void method3916(int argument) {
	ByteArrayManager.byteArrayPoolSizes = null;
    }
    
    static final void method3917(GraphicsToolkit argument, int argument_14_,
				 RsInterface argument_15_, int argument_16_,
				 int argument_17_) {
	Class_aa class_aa
	    = argument_15_.method3213(argument_17_ ^ argument_17_, argument);
	if (class_aa != null) {
	    argument.setClip(argument_14_, argument_16_ + ((RsInterface) argument_15_).renderHeight, ((RsInterface) argument_15_).renderWidth + argument_14_, argument_16_);
	    if (Node_Sub1.anInt3868 == 2 || Node_Sub1.anInt3868 == 5
		|| Node_Sub29.aClass368_4130 == null)
		argument.A(-16777216, class_aa, argument_14_, argument_16_);
	    else {
		int anLocalInt;
		int anLocalInt_18_;
		int anLocalInt_19_;
		int anLocalInt_20_;
		if (Statics.anInt1745 == 4) {
		    anLocalInt_18_ = Class167.anInt1224;
		    anLocalInt_19_ = 4096;
		    anLocalInt = Class61.anInt437;
		    anLocalInt_20_ = (int) -DoublyLinkedNodeP2_Sub6.aFloat4538 & 0x3fff;
		} else {
		    anLocalInt = (((DoublyLinkedNodeP2_Sub2)
				   Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				  .worldZ);
		    anLocalInt_18_
			= (((DoublyLinkedNodeP2_Sub2)
			    Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			   .worldX);
		    anLocalInt_19_ = 4096 - Node_Sub11.anInt3945 * 16;
		    anLocalInt_20_
			= (Class2_Sub10.anInt3824
			   + (int) -DoublyLinkedNodeP2_Sub6.aFloat4538) & 0x3fff;
		}
		int anLocalInt_21_
		    = (anLocalInt_18_ / 128
		       + (-((MapRelated.mapWidth - 104) * 2) + 48));
		int anLocalInt_22_
		    = (-(anLocalInt / 128) + 48
		       - (-(MapRelated.mapDepth * 4)
			  + (MapRelated.mapDepth - 104) * 2));
		Node_Sub29.aClass368_4130.method4015
		    (((float) argument_14_
		      + (float) ((RsInterface) argument_15_).renderWidth / 2.0F),
		     ((float) argument_16_
		      + (float) ((RsInterface) argument_15_).renderHeight / 2.0F),
		     (float) anLocalInt_21_, (float) anLocalInt_22_,
		     anLocalInt_19_, anLocalInt_20_ << 2, class_aa,
		     argument_14_, argument_16_);
		for (IntegerNode class59_sub54
			 = ((IntegerNode)
			    Class294.aCyclicLinkedList_2454.getFirst());
		     class59_sub54 != null;
		     class59_sub54 = (IntegerNode) Class294
							 .aCyclicLinkedList_2454
							 .getNext()) {
		    int anLocalInt_23_
			= ((IntegerNode) class59_sub54).value;
		    int anLocalInt_24_
			= ((((((Class114) Class303.aClass114_2567)
			      .anIntArray947[anLocalInt_23_])
			     & 0xfffd6c2)
			    >> 14)
			   - MapRelated.baseX);
		    int anLocalInt_25_ = ((((Class114) Class303.aClass114_2567)
					   .anIntArray947[anLocalInt_23_])
					  & 0x3fff) - MapRelated.baseZ;
		    int anLocalInt_26_
			= anLocalInt_24_ * 4 + 2 - anLocalInt_18_ / 128;
		    int anLocalInt_27_
			= anLocalInt_25_ * 4 + 2 - anLocalInt / 128;
		    Class141.method2474(argument_17_ + 245, anLocalInt_26_,
					class_aa, argument, anLocalInt_27_,
					argument_16_, argument_15_,
					argument_14_,
					(((Class114) Class303.aClass114_2567)
					 .anIntArray948[anLocalInt_23_]));
		}
		for (int anLocalInt_28_ = 0;
		     Class152.anInt1150 > anLocalInt_28_; anLocalInt_28_++) {
		    int anLocalInt_29_
			= (Class269.anIntArray2153[anLocalInt_28_] * 4 + 2
			   - anLocalInt_18_ / 128);
		    int anLocalInt_30_
			= (-(anLocalInt / 128)
			   + Node_Sub37.anIntArray4168[anLocalInt_28_] * 4
			   + 2);
		    Class266 class266
			= (Node_Sub31_Sub30.aClass257_5983.method3298
			   ((byte) 95, Class84.anIntArray600[anLocalInt_28_]));
		    if (((Class266) class266).anIntArray2067 != null) {
			class266
			    = class266.method3345(1, (ClientVariables
						      .instance));
			if (class266 == null
			    || ((Class266) class266).anInt2077 == -1)
			    continue;
		    }
		    Class141.method2474(255, anLocalInt_29_, class_aa,
					argument, anLocalInt_30_, argument_16_,
					argument_15_, argument_14_,
					((Class266) class266).anInt2077);
		}
		for (Node_Sub15 class59_sub15
			 = ((Node_Sub15)
			    tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658.first(0));
		     class59_sub15 != null;
		     class59_sub15
			 = (Node_Sub15) tia_sub_35_Sub1DoublyLinked.aJagexHashMap_6658
					       .next()) {
		    int anLocalInt_31_
			= (int) (((Node) class59_sub15).hash >> 28
				 & 0x3L);
		    if (anLocalInt_31_ == Class62_Sub19.anInt4428) {
			int anLocalInt_32_
			    = ((int) (((Node) class59_sub15).hash
				      & 0x3fffL)
			       - MapRelated.baseX);
			int anLocalInt_33_
			    = ((int) (((Node) class59_sub15).hash >> 14
				      & 0x3fffL)
			       - MapRelated.baseZ);
			int anLocalInt_34_
			    = anLocalInt_32_ * 4 + 2 - anLocalInt_18_ / 128;
			int anLocalInt_35_
			    = anLocalInt_33_ * 4 + 2 - anLocalInt / 128;
			Class128.method2420(anLocalInt_34_, anLocalInt_35_,
					    argument_16_, argument_15_,
					    class_aa,
					    (IOException_Sub1.aClass368Array40
					     [0]),
					    argument_14_, argument_17_ ^ 0x8);
		    }
		}
		for (int anLocalInt_36_ = 0;
		     dba_sub_772_Sub2.anInt6369 > anLocalInt_36_;
		     anLocalInt_36_++) {
		    Node_Sub35 class59_sub35
			= ((Node_Sub35)
			   (Class294.aJagexHashMap_2453.get((long) (DoublyLinkedNodeP2_Sub2_Sub2_Sub2.anIntArray6616[anLocalInt_36_]))));
		    if (class59_sub35 != null) {
			DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
			    = (((Node_Sub35) class59_sub35)
			       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
			if (class104_sub2_sub2_sub5_sub1
				.method1845(argument_17_ - 11)
			    && ((((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub1)
				 .lightingHL)
				== (((DoublyLinkedNodeP2_Sub2)
				     (Class308
				      .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				    .lightingHL))) {
			    Class291 class291
				= (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				    class104_sub2_sub2_sub5_sub1)
				   .aClass291_6832);
			    if (class291 != null
				&& (((Class291) class291).anIntArray2374
				    != null))
				class291
				    = (class291.method3485
				       (ClientVariables.instance,
					-1));
			    if (class291 != null
				&& ((Class291) class291).aBoolean2362
				&& ((Class291) class291).aBoolean2342) {
				int anLocalInt_37_
				    = ((((DoublyLinkedNodeP2_Sub2)
					 class104_sub2_sub2_sub5_sub1)
					.worldX) / 128
				       - anLocalInt_18_ / 128);
				int anLocalInt_38_
				    = ((((DoublyLinkedNodeP2_Sub2)
					 class104_sub2_sub2_sub5_sub1)
					.worldZ) / 128
				       - anLocalInt / 128);
				if (((Class291) class291).anInt2339 == -1)
				    Class128.method2420(anLocalInt_37_,
							anLocalInt_38_,
							argument_16_,
							argument_15_, class_aa,
							(IOException_Sub1
							 .aClass368Array40[1]),
							argument_14_, 2);
				else
				    Class141.method2474(argument_17_ ^ 0xf5,
							anLocalInt_37_,
							class_aa, argument,
							anLocalInt_38_,
							argument_16_,
							argument_15_,
							argument_14_,
							(((Class291) class291)
							 .anInt2339));
			    }
			}
		    }
		}
		int anLocalInt_39_ = Class224.anInt1578;
		int[] anLocalInts = Class242.anIntArray1769;
		for (int anLocalInt_40_ = 0; anLocalInt_40_ < anLocalInt_39_;
		     anLocalInt_40_++) {
		    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			= (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			   [anLocalInts[anLocalInt_40_]]);
		    if (class104_sub2_sub2_sub5_sub2 != null
			&& class104_sub2_sub2_sub5_sub2.method1860(-1)
			&& !((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			     class104_sub2_sub2_sub5_sub2).aBoolean6848
			&& (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587
			    != class104_sub2_sub2_sub5_sub2)
			&& ((((DoublyLinkedNodeP2_Sub2)
			      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			     .lightingHL)
			    == (((DoublyLinkedNodeP2_Sub2) class104_sub2_sub2_sub5_sub2)
				.lightingHL))) {
			int anLocalInt_41_ = (-(anLocalInt_18_ / 128)
					      + (((DoublyLinkedNodeP2_Sub2)
						  class104_sub2_sub2_sub5_sub2)
						 .worldX) / 128);
			int anLocalInt_42_ = (-(anLocalInt / 128)
					      + (((DoublyLinkedNodeP2_Sub2)
						  class104_sub2_sub2_sub5_sub2)
						 .worldZ) / 128);
			boolean anLocalBoolean = false;
			for (int anLocalInt_43_ = 0;
			     anLocalInt_43_ < Class257.anInt2013;
			     anLocalInt_43_++) {
			    if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  class104_sub2_sub2_sub5_sub2)
				     .aString6836.equals
				 (Class260.aStringArray2031[anLocalInt_43_]))
				&& (GraphicsToolkit.anIntArray941[anLocalInt_43_]
				    != 0)) {
				anLocalBoolean = true;
				break;
			    }
			}
			boolean anLocalBoolean_44_ = false;
			for (int anLocalInt_45_ = 0;
			     anLocalInt_45_ < Statics.anInt2724;
			     anLocalInt_45_++) {
			    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				 class104_sub2_sub2_sub5_sub2)
				    .aString6836.equals
				(((Class176) (Node_Sub13.aClass176Array3956
					      [anLocalInt_45_]))
				 .aString1303)) {
				anLocalBoolean_44_ = true;
				break;
			    }
			}
			boolean anLocalBoolean_46_ = false;
			if ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			      Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			     .anInt6860) != 0
			    && ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				class104_sub2_sub2_sub5_sub2).anInt6860 != 0
			    && ((((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .anInt6860)
				== ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				    class104_sub2_sub2_sub5_sub2).anInt6860))
			    anLocalBoolean_46_ = true;
			if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			     class104_sub2_sub2_sub5_sub2)
			    .aBoolean6852)
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[6]),
						argument_14_, 2);
			else if (anLocalBoolean_46_)
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[4]),
						argument_14_,
						argument_17_ ^ 0x8);
			else if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
				  class104_sub2_sub2_sub5_sub2)
				 .aBoolean6856)
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[7]),
						argument_14_,
						argument_17_ - 8);
			else if (anLocalBoolean)
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[3]),
						argument_14_,
						argument_17_ - 8);
			else if (anLocalBoolean_44_)
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[5]),
						argument_14_, 2);
			else
			    Class128.method2420(anLocalInt_41_, anLocalInt_42_,
						argument_16_, argument_15_,
						class_aa,
						(IOException_Sub1
						 .aClass368Array40[2]),
						argument_14_, 2);
		    }
		}
		Class124[] class124s = Class166.aClass124Array1216;
		for (int anLocalInt_47_ = 0; anLocalInt_47_ < class124s.length;
		     anLocalInt_47_++) {
		    Class124 class124 = class124s[anLocalInt_47_];
		    if (class124 != null
			&& ((Class124) class124).anInt1007 != 0
			&& Class333.anInt2720 % 20 < 10) {
			if (((Class124) class124).anInt1007 == 1) {
			    Node_Sub35 class59_sub35
				= ((Node_Sub35)
				   (Class294.aJagexHashMap_2453.get((long) ((Class124) class124).anInt1008)));
			    if (class59_sub35 != null) {
				DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				    = (((Node_Sub35) class59_sub35)
				       .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
				int anLocalInt_48_
				    = ((((DoublyLinkedNodeP2_Sub2)
					 class104_sub2_sub2_sub5_sub1)
					.worldX) / 128
				       - anLocalInt_18_ / 128);
				int anLocalInt_49_
				    = (-(anLocalInt / 128)
				       + (((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub1)
					  .worldZ) / 128);
				Class111_Sub1.method1994
				    (argument_15_, argument_16_, 360000L,
				     (byte) 115, anLocalInt_48_,
				     ((Class124) class124).anInt1009,
				     argument_14_, class_aa, anLocalInt_49_);
			    }
			}
			if (((Class124) class124).anInt1007 == 2) {
			    int anLocalInt_50_
				= (-(anLocalInt_18_ / 128)
				   + ((Class124) class124).anInt1010 / 128);
			    int anLocalInt_51_
				= (-(anLocalInt / 128)
				   + ((Class124) class124).anInt1006 / 128);
			    long l = (long) (((Class124) class124).anInt1004
					     << 7);
			    l *= l;
			    Class111_Sub1.method1994(argument_15_,
						     argument_16_, l,
						     (byte) 115,
						     anLocalInt_50_,
						     (((Class124) class124)
						      .anInt1009),
						     argument_14_, class_aa,
						     anLocalInt_51_);
			}
			if (((Class124) class124).anInt1007 == 10
			    && ((Class124) class124).anInt1008 >= 0
			    && ((Class345
				 .aClass104_Sub2_Sub2_Sub5_Sub2Array2905).length
				> ((Class124) class124).anInt1008)) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
				= (Class345
				   .aClass104_Sub2_Sub2_Sub5_Sub2Array2905
				   [((Class124) class124).anInt1008]);
			    if (class104_sub2_sub2_sub5_sub2 != null) {
				int anLocalInt_52_
				    = (-(anLocalInt_18_ / 128)
				       + (((DoublyLinkedNodeP2_Sub2)
					   class104_sub2_sub2_sub5_sub2)
					  .worldX) / 128);
				int anLocalInt_53_
				    = ((((DoublyLinkedNodeP2_Sub2)
					 class104_sub2_sub2_sub5_sub2)
					.worldZ) / 128
				       - anLocalInt / 128);
				Class111_Sub1.method1994
				    (argument_15_, argument_16_, 360000L,
				     (byte) 115, anLocalInt_52_,
				     ((Class124) class124).anInt1009,
				     argument_14_, class_aa, anLocalInt_53_);
			    }
			}
		    }
		}
		if (Statics.anInt1745 != 4) {
		    if (Class382.anInt3242 != 0) {
			int anLocalInt_54_
			    = (-(anLocalInt_18_ / 128)
			       + (Class382.anInt3242 * 4 - 2 + 2
				  + Class308
					.aClass104_Sub2_Sub2_Sub5_Sub2_2587
					.method1830(-128) * 2));
			int anLocalInt_55_
			    = (ModeWhatEnum.anInt2310 * 4 - anLocalInt / 128
			       + (Class308
				      .aClass104_Sub2_Sub2_Sub5_Sub2_2587
				      .method1830(-125)
				  - 1) * 2
			       + 2);
			Class128.method2420(anLocalInt_54_, anLocalInt_55_,
					    argument_16_, argument_15_,
					    class_aa,
					    (Class79.aClass368Array562
					     [Class18.aBoolean127 ? 1 : 0]),
					    argument_14_, argument_17_ ^ 0x8);
		    }
		    if (!((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .aBoolean6848)
			argument.method2020
			    (-5, 3,
			     (argument_16_
			      - (-(((RsInterface) argument_15_).renderHeight / 2)
				 + 1)),
			     3,
			     (argument_14_
			      + ((RsInterface) argument_15_).renderWidth / 2 - 1),
			     -1);
		}
	    }
	}
    }
    
    Class353_Sub9(GlToolkit argument_56_) {
	super(argument_56_);
    }
}
