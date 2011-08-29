/* Class59_Sub49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub49 extends Node
{
    int anInt4289;
    static Class366 aClass366_4290;
    int anInt4291;
    static Js5Store aJs5Store_4292;
    static volatile boolean aBoolean4293 = true;

    static final void method1147(DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument,
				 int argument_0_, int argument_1_,
				 int argument_2_) {
	int[] anLocalInts = new int[4];
	JagStrings.memset(anLocalInts, 0, anLocalInts.length, argument_0_);
	Class78.method1567((byte) 33, argument, anLocalInts, argument_1_);
    }
    
    public static void method1148(byte argument) {
	Class211.aClass211_4294 = null;
	aJs5Store_4292 = null;
	aClass366_4290 = null;
    }
    
    static final void method1149(int argument) {
	Class51.method473(argument, -1, 255);
    }
    
    static final void method1150(boolean argument, Object[] argument_3_,
				 long[] argument_4_) {
	Class201.method2916(argument_3_, argument_4_.length - 1, 0,
			    argument_4_, 0);
    }
    
    static final void method1151(boolean argument, int argument_5_,
				 byte argument_6_, int argument_7_) {
	if (Node_Sub37_Sub1.aJagexHashMap_6114.get((long) argument_5_)
	    == null) {
	    if (Statics.aBoolean5038) {
		Node_Sub23 class59_sub23
		    = new Node_Sub23(argument_5_,
					new Class109_Sub1(4096,
							  (Class106
							   .aJs5Store_865),
							  argument_5_),
					argument_7_, argument);
		((Node_Sub23) class59_sub23).aClass109_Sub1_4050.method1978
		    (Class388.aStringArray3276[client.language], -2);
		Node_Sub37_Sub1.aJagexHashMap_6114
		    .put((long) argument_5_, class59_sub23);
	    } else
		Statics.method2861(82, argument_5_, argument);
	}
    }
    
    static final void method1152(DoublyLinkedNodeP2_Sub2 argument) {
	DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.aGraphicsToolkit6834.H
	    (((DoublyLinkedNodeP2_Sub2) argument).worldX,
	     (((DoublyLinkedNodeP2_Sub2) argument).anInt4511
	      + (argument.method1781(748449288) >> 1)),
	     ((DoublyLinkedNodeP2_Sub2) argument).worldZ, Class348.anIntArray2915);
	((DoublyLinkedNodeP2_Sub2) argument).anInt4510 = Class348.anIntArray2915[0];
	((DoublyLinkedNodeP2_Sub2) argument).anInt4514 = Class348.anIntArray2915[1];
	((DoublyLinkedNodeP2_Sub2) argument).anInt4516 = Class348.anIntArray2915[2];
    }
    
    static final void method1153(int argument, int argument_8_,
				 int argument_9_, byte argument_10_) {
	Class303.tileSettings
	    = new byte[argument][argument_9_][argument_8_];
    }
    
    static final void method1154(byte argument) {
	for (int anLocalInt = 0; anLocalInt < JagexStringEncoding.anInt128; anLocalInt++) {
	    int anLocalInt_11_
		= Node_Sub31_Sub24.anIntArray5950[anLocalInt];
	    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
		= (((Node_Sub35) (Node_Sub35)
		    Class294.aJagexHashMap_2453.get((long) anLocalInt_11_))
		   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
	    int anLocalInt_12_
		= Network.stream.g1();
	    if ((anLocalInt_12_ & 0x4) != 0)
		anLocalInt_12_
		    += (Network.stream.g1()
			<< 8);
	    if ((anLocalInt_12_ & 0x1000) != 0)
		anLocalInt_12_
		    += (Network.stream.g1()
			<< 16);
	    if ((anLocalInt_12_ & 0x40) != 0) {
		int[] anLocalInts = new int[4];
		for (int anLocalInt_13_ = 0; anLocalInt_13_ < 4;
		     anLocalInt_13_++) {
		    anLocalInts[anLocalInt_13_]
			= Network.stream
			      .g2i();
		    if (anLocalInts[anLocalInt_13_] == 65535)
			anLocalInts[anLocalInt_13_] = -1;
		}
		int anLocalInt_14_
		    = Network.stream.g1_128p();
		Class124.method2400(class104_sub2_sub2_sub5_sub1, anLocalInts,
				    anLocalInt_14_, false);
	    }
	    if ((anLocalInt_12_ & 0x20) != 0) {
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1)
			.aClass291_6832.method3495(true))
		    Class385.method4123(class104_sub2_sub2_sub5_sub1,
					(byte) 88);
		class104_sub2_sub2_sub5_sub1.method1851
		    ((DiskBackedCache.aClass26_2709.method343
		      ((byte) 123,
		       Network.stream.g2ip128())),
		     false);
		class104_sub2_sub2_sub5_sub1.method1838
		    (-1, ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				       class104_sub2_sub2_sub5_sub1)
				      .aClass291_6832)).anInt2344);
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6727
		    = ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				    class104_sub2_sub2_sub5_sub1)
				   .aClass291_6832)).anInt2345 << 3;
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1)
			.aClass291_6832.method3495(true))
		    Class245_Sub2.method3192((((Entity)
					       class104_sub2_sub2_sub5_sub1)
					      .pathX[0]),
					     (((Entity)
					       class104_sub2_sub2_sub5_sub1)
					      .pathZ[0]),
					     class104_sub2_sub2_sub5_sub1,
					     null, null, 0, -107,
					     (((DoublyLinkedNodeP2_Sub2)
					       class104_sub2_sub2_sub5_sub1)
					      .lightingHL));
	    }
	    if ((anLocalInt_12_ & 0x8000) != 0) {
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aByte6743
		    = Network.stream.p1m128();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aByte6775
		    = Network.stream.g1s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aByte6771
		    = Network.stream.g1s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aByte6781
		    = (byte) Network.stream
				 .g1();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6788
		    = (Class333.anInt2720
		       + Network.stream.g2ip128());
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6739
		    = Class333.anInt2720 + Network.stream
					       .g2i();
	    }
	    if ((anLocalInt_12_ & 0x40000) != 0) {
		int anLocalInt_15_
		    = Network.stream.g2();
		int anLocalInt_16_
		    = Network.stream.g4m();
		if (anLocalInt_15_ == 65535)
		    anLocalInt_15_ = -1;
		int anLocalInt_17_
		    = Network.stream.g1_128p();
		int anLocalInt_18_ = anLocalInt_17_ & 0x7;
		int anLocalInt_19_ = (anLocalInt_17_ & 0x7a) >> 3;
		if (anLocalInt_19_ == 15)
		    anLocalInt_19_ = -1;
		class104_sub2_sub2_sub5_sub1.method1827(anLocalInt_16_, 2,
							anLocalInt_15_,
							anLocalInt_19_,
							anLocalInt_18_, 0);
	    }
	    if ((anLocalInt_12_ & 0x80000) != 0) {
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		    .aString6825
		    = Network.stream.gstr();
		if ("".equals(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
			       class104_sub2_sub2_sub5_sub1).aString6825)
		    || (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
			 class104_sub2_sub2_sub5_sub1)
			    .aString6825.equals
			(((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				       class104_sub2_sub2_sub5_sub1)
				      .aClass291_6832)).aString2333)))
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).aString6825
			= ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					class104_sub2_sub2_sub5_sub1)
				       .aClass291_6832)).aString2333;
	    }
	    if ((anLocalInt_12_ & 0x2) != 0) {
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6725
		    = Network.stream.g2i();
		if ((((Entity) class104_sub2_sub2_sub5_sub1)
		     .anInt6725)
		    == 65535)
		    ((Entity) class104_sub2_sub2_sub5_sub1)
			.anInt6725
			= -1;
	    }
	    if ((anLocalInt_12_ & 0x800) != 0) {
		int anLocalInt_20_
		    = ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				    class104_sub2_sub2_sub5_sub1)
				   .aClass291_6832)).anIntArray2329.length;
		int anLocalInt_21_ = 0;
		if ((((Class291) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				  class104_sub2_sub2_sub5_sub1).aClass291_6832)
		     .aShortArray2364)
		    != null)
		    anLocalInt_21_
			= (((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					 class104_sub2_sub2_sub5_sub1)
					.aClass291_6832))
			   .aShortArray2364).length;
		int anLocalInt_22_ = 0;
		if ((((Class291) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				  class104_sub2_sub2_sub5_sub1).aClass291_6832)
		     .aShortArray2334)
		    != null)
		    anLocalInt_22_
			= (((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					 class104_sub2_sub2_sub5_sub1)
					.aClass291_6832))
			   .aShortArray2334).length;
		int anLocalInt_23_
		    = Network.stream.g1();
		if ((anLocalInt_23_ & 0x1) != 1) {
		    int[] anLocalInts = null;
		    if ((anLocalInt_23_ & 0x2) == 2) {
			anLocalInts = new int[anLocalInt_20_];
			for (int anLocalInt_24_ = 0;
			     anLocalInt_24_ < anLocalInt_20_; anLocalInt_24_++)
			    anLocalInts[anLocalInt_24_]
				= Network.stream
				      .g2m128();
		    }
		    short[] anLocalInts_25_ = null;
		    if ((anLocalInt_23_ & 0x4) == 4) {
			anLocalInts_25_ = new short[anLocalInt_21_];
			for (int anLocalInt_26_ = 0;
			     anLocalInt_26_ < anLocalInt_21_; anLocalInt_26_++)
			    anLocalInts_25_[anLocalInt_26_]
				= (short) Network.stream
					      .g2ip128();
		    }
		    short[] anLocalInts_27_ = null;
		    if ((anLocalInt_23_ & 0x8) == 8) {
			anLocalInts_27_ = new short[anLocalInt_22_];
			for (int anLocalInt_28_ = 0;
			     anLocalInt_22_ > anLocalInt_28_; anLocalInt_28_++)
			    anLocalInts_27_[anLocalInt_28_]
				= (short) Network.stream
					      .g2ip128();
		    }
		    long l = ((long) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				      class104_sub2_sub2_sub5_sub1).anInt6835++
			      << 32) | (long) anLocalInt_11_;
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).aClass8_6831
			= new Class8(l, anLocalInts, anLocalInts_25_,
				     anLocalInts_27_);
		} else
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).aClass8_6831
			= null;
	    }
	    if ((anLocalInt_12_ & 0x80) != 0) {
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		    .anInt6828
		    = Network.stream.g2m128();
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		    .anInt6826
		    = Network.stream.g2i();
	    }
	    if ((anLocalInt_12_ & 0x100) != 0) {
		int anLocalInt_29_
		    = Network.stream.g2m128();
		int anLocalInt_30_
		    = Network.stream.g4();
		if (anLocalInt_29_ == 65535)
		    anLocalInt_29_ = -1;
		int anLocalInt_31_
		    = Network.stream.g1_128p();
		int anLocalInt_32_ = anLocalInt_31_ & 0x7;
		int anLocalInt_33_ = (anLocalInt_31_ & 0x7e) >> 3;
		if (anLocalInt_33_ == 15)
		    anLocalInt_33_ = -1;
		class104_sub2_sub2_sub5_sub1.method1827(anLocalInt_30_, 1,
							anLocalInt_29_,
							anLocalInt_33_,
							anLocalInt_32_, 0);
	    }
	    if ((anLocalInt_12_ & 0x4000) != 0) {
		int anLocalInt_34_
		    = Network.stream.g1_128p();
		int[] anLocalInts = new int[anLocalInt_34_];
		int[] anLocalInts_35_ = new int[anLocalInt_34_];
		for (int anLocalInt_36_ = 0; anLocalInt_36_ < anLocalInt_34_;
		     anLocalInt_36_++) {
		    int anLocalInt_37_
			= Network.stream.g2ip128();
		    if ((anLocalInt_37_ & 0xc000) == 49152) {
			int anLocalInt_38_
			    = Network.stream.g2();
			anLocalInts[anLocalInt_36_]
			    = MathStatics.OR(anLocalInt_37_ << 16, anLocalInt_38_);
		    } else
			anLocalInts[anLocalInt_36_] = anLocalInt_37_;
		    anLocalInts_35_[anLocalInt_36_]
			= Network.stream.g2();
		}
		class104_sub2_sub2_sub5_sub1
		    .method1823((byte) -2, anLocalInts_35_, anLocalInts);
	    }
	    if ((anLocalInt_12_ & 0x8) != 0) {
		int anLocalInt_39_
		    = Network.stream.g2();
		if (anLocalInt_39_ == 65535)
		    anLocalInt_39_ = -1;
		int anLocalInt_40_
		    = Network.stream.g4();
		int anLocalInt_41_
		    = Network.stream.g1p128();
		int anLocalInt_42_ = anLocalInt_41_ & 0x7;
		int anLocalInt_43_ = anLocalInt_41_ >> 3 & 0xf;
		if (anLocalInt_43_ == 15)
		    anLocalInt_43_ = -1;
		class104_sub2_sub2_sub5_sub1.method1827(anLocalInt_40_, 0,
							anLocalInt_39_,
							anLocalInt_43_,
							anLocalInt_42_, 0);
	    }
	    if ((anLocalInt_12_ & 0x1) != 0) {
		int anLocalInt_44_
		    = Network.stream.g1n();
		if (anLocalInt_44_ > 0) {
		    for (int anLocalInt_45_ = 0;
			 anLocalInt_44_ > anLocalInt_45_; anLocalInt_45_++) {
			int anLocalInt_46_ = -1;
			int anLocalInt_47_ = -1;
			int anLocalInt_48_
			    = Network.stream.gsmart(-2);
			int anLocalInt_49_ = -1;
			if (anLocalInt_48_ == 32767) {
			    anLocalInt_48_ = Network
						 .stream
						 .gsmart(-2);
			    anLocalInt_47_ = Network
						 .stream
						 .gsmart(-2);
			    anLocalInt_46_ = Network
						 .stream
						 .gsmart(-2);
			    anLocalInt_49_ = Network
						 .stream
						 .gsmart(-2);
			} else if (anLocalInt_48_ == 32766)
			    anLocalInt_48_ = -1;
			else
			    anLocalInt_47_ = Network
						 .stream
						 .gsmart(-2);
			int anLocalInt_50_
			    = Network.stream.gsmart(-2);
			int anLocalInt_51_ = Network
						 .stream
						 .g1();
			class104_sub2_sub2_sub5_sub1.method1826
			    (-127, anLocalInt_50_, Class333.anInt2720,
			     anLocalInt_49_, anLocalInt_48_, anLocalInt_46_,
			     anLocalInt_47_, anLocalInt_51_);
		    }
		}
	    }
	    if ((anLocalInt_12_ & 0x2000) != 0) {
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6746
		    = Network.stream.g1p128s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6766
		    = Network.stream.g1s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6728
		    = Network.stream.g1p128s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6790
		    = Network.stream.g1p128s();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6762
		    = (Network.stream.g2()
		       + Class333.anInt2720);
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6737
		    = (Network.stream.g2ip128()
		       + Class333.anInt2720);
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6756
		    = Network.stream.g1n();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6790
		    += ((Entity)
			class104_sub2_sub2_sub5_sub1).pathZ[0];
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6728
		    += ((Entity)
			class104_sub2_sub2_sub5_sub1).pathX[0];
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6803
		    = 0;
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6746
		    += ((Entity)
			class104_sub2_sub2_sub5_sub1).pathX[0];
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6766
		    += ((Entity)
			class104_sub2_sub2_sub5_sub1).pathZ[0];
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6798
		    = 1;
	    }
	    if ((anLocalInt_12_ & 0x20000) != 0) {
		int anLocalInt_52_
		    = ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				    class104_sub2_sub2_sub5_sub1)
				   .aClass291_6832)).anIntArray2363.length;
		int anLocalInt_53_ = 0;
		if ((((Class291) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				  class104_sub2_sub2_sub5_sub1).aClass291_6832)
		     .aShortArray2364)
		    != null)
		    anLocalInt_53_
			= (((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					 class104_sub2_sub2_sub5_sub1)
					.aClass291_6832))
			   .aShortArray2364).length;
		int anLocalInt_54_ = 0;
		if ((((Class291) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				  class104_sub2_sub2_sub5_sub1).aClass291_6832)
		     .aShortArray2334)
		    != null)
		    anLocalInt_53_
			= (((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					 class104_sub2_sub2_sub5_sub1)
					.aClass291_6832))
			   .aShortArray2334).length;
		int anLocalInt_55_
		    = Network.stream.g1n();
		if ((anLocalInt_55_ & 0x1) != 1) {
		    int[] anLocalInts = null;
		    if ((anLocalInt_55_ & 0x2) == 2) {
			anLocalInts = new int[anLocalInt_52_];
			for (int anLocalInt_56_ = 0;
			     anLocalInt_52_ > anLocalInt_56_; anLocalInt_56_++)
			    anLocalInts[anLocalInt_56_]
				= Network.stream
				      .g2m128();
		    }
		    short[] anLocalInts_57_ = null;
		    if ((anLocalInt_55_ & 0x4) == 4) {
			anLocalInts_57_ = new short[anLocalInt_53_];
			for (int anLocalInt_58_ = 0;
			     anLocalInt_53_ > anLocalInt_58_; anLocalInt_58_++)
			    anLocalInts_57_[anLocalInt_58_]
				= (short) Network.stream
					      .g2ip128();
		    }
		    short[] anLocalInts_59_ = null;
		    if ((anLocalInt_55_ & 0x8) == 8) {
			anLocalInts_59_ = new short[anLocalInt_54_];
			for (int anLocalInt_60_ = 0;
			     anLocalInt_54_ > anLocalInt_60_; anLocalInt_60_++)
			    anLocalInts_59_[anLocalInt_60_]
				= (short) Network.stream
					      .g2ip128();
		    }
		    long l
			= ((long) anLocalInt_11_
			   | ((long) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
				      class104_sub2_sub2_sub5_sub1).anInt6830++
			      << 32));
		    new Class8(l, anLocalInts, anLocalInts_57_,
			       anLocalInts_59_);
		}
	    }
	    if ((anLocalInt_12_ & 0x10) != 0) {
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aString6733
		    = Network.stream.gstr();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6791
		    = 100;
	    }
	    if ((anLocalInt_12_ & 0x400) != 0) {
		int anLocalInt_61_
		    = Network.stream.g2m128();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6773
		    = Network.stream.g1();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6770
		    = Network.stream.g1();
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .aBoolean6777
		    = (anLocalInt_61_ & 0x8000) != 0;
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6768
		    = anLocalInt_61_ & 0x7fff;
		((Entity) class104_sub2_sub2_sub5_sub1)
		    .anInt6782
		    = (((Entity)
			class104_sub2_sub2_sub5_sub1).anInt6773
		       + (((Entity)
			   class104_sub2_sub2_sub5_sub1).anInt6768
			  + Class333.anInt2720));
	    }
	    if ((anLocalInt_12_ & 0x10000) != 0) {
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1) class104_sub2_sub2_sub5_sub1)
		    .anInt6833
		    = Network.stream.g2i();
		if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).anInt6833
		    == 65535)
		    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
		     class104_sub2_sub2_sub5_sub1).anInt6833
			= ((Class291) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1)
					class104_sub2_sub2_sub5_sub1)
				       .aClass291_6832)).anInt2340;
	    }
	    if ((anLocalInt_12_ & 0x200) != 0) {
		int anLocalInt_62_
		    = Network.stream.g1();
		int[] anLocalInts = new int[anLocalInt_62_];
		int[] anLocalInts_63_ = new int[anLocalInt_62_];
		int[] anLocalInts_64_ = new int[anLocalInt_62_];
		for (int anLocalInt_65_ = 0; anLocalInt_62_ > anLocalInt_65_;
		     anLocalInt_65_++) {
		    int anLocalInt_66_
			= Network.stream.g2m128();
		    if (anLocalInt_66_ == 65535)
			anLocalInt_66_ = -1;
		    anLocalInts[anLocalInt_65_] = anLocalInt_66_;
		    anLocalInts_63_[anLocalInt_65_]
			= Network.stream
			      .g1p128();
		    anLocalInts_64_[anLocalInt_65_]
			= Network.stream.g2ip128();
		}
		Class133_Sub1.method2447(anLocalInts,
					 class104_sub2_sub2_sub5_sub1, 3563,
					 anLocalInts_64_, anLocalInts_63_);
	    }
	}
    }
    
    public Node_Sub49() {
	/* empty */
    }
    
    static final void method1155(byte argument, int argument_67_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(8, 13175,
            (long) argument_67_);
	class59_sub51_sub3.method1181(585134072);
    }
    
    static final float method1156(float argument, int argument_68_,
				  float argument_69_, float argument_70_) {
	return argument + argument_69_ * (-argument + argument_70_);
    }
    
    static {
	aClass366_4290 = new Class366();
    }
}
