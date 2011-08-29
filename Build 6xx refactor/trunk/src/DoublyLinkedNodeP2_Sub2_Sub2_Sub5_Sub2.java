/* Class104_Sub2_Sub2_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 extends Entity
{
    String aString6836;
    int anInt6837;
    int anInt6838 = -1;
    private byte aByte6839 = 0;
    int anInt6840 = -1;
    int anInt6841;
    int anInt6843;
    int anInt6844;
    int anInt6845;
    boolean aBoolean6846;
    String aString6847;
    boolean aBoolean6848 = false;
    int anInt6849;
    int anInt6850;
    int anInt6851;
    boolean aBoolean6852;
    static Class166 aClass166_6853;
    Class22 aClass22_6854;
    int anInt6855;
    boolean aBoolean6856;
    boolean aBoolean6857;
    private int anInt6858;
    static int[] anIntArray6859;
    int anInt6860;
    static int anInt6861;
    int anInt6862;
    int anInt6863;
    boolean aBoolean6864;
    static boolean aBoolean6865 = true;
    private byte aByte6866;
    private byte aByte6868;
    static boolean aBoolean6869 = false;
    int anInt6870;
    int anInt6871;
    
    static final void method1852(byte argument) {
	MultilanguageString.anIntArray2863
	    = Class50.method463(true, 0.4F, 35, 4, 8, 8, -15, 2048);
    }
    
    final void method1853(int argument_0_, byte argument_1_, int argument_2_,
			  int argument_3_) {
	if (((Entity) this).anInt6798 < 9)
	    ((Entity) this).anInt6798++;
	for (int anLocalInt = ((Entity) this).anInt6798;
	     anLocalInt > 0; anLocalInt--) {
	    ((Entity) this).pathX[anLocalInt]
		= (((Entity) this).pathX
		   [anLocalInt - 1]);
	    ((Entity) this).pathZ[anLocalInt]
		= (((Entity) this).pathZ
		   [anLocalInt - 1]);
	    ((Entity) this).aByteArray6802[anLocalInt]
		= (((Entity) this).aByteArray6802
		   [anLocalInt - 1]);
	}
	((Entity) this).pathX[0] = argument_0_;
	((Entity) this).aByteArray6802[0] = argument_1_;
	((Entity) this).pathZ[0] = argument_2_;
    }
    
    private final boolean method1854(GraphicsToolkit argument_4_, int argument_5_,
				     int argument_6_) {
	int anLocalInt = argument_6_;
	Class354 class354 = this.method1831();
	Class367 class367
	    = ((((Entity) this).anInt6754 != -1
		&& ((Entity) this).anInt6755 == 0)
	       ? DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
		     .method3758(((Entity) this).anInt6754, 0)
	       : null);
	Class367 class367_7_
	    = ((((Entity) this).anInt6731 != -1
		&& !((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6846
		&& (!((Entity) this).aBoolean6753
		    || class367 == null))
	       ? DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
		     .method3758(((Entity) this).anInt6731, 0)
	       : null);
	int anLocalInt_8_ = ((Class354) class354).anInt2996;
	int anLocalInt_9_ = ((Class354) class354).anInt2993;
	if ((anLocalInt_8_ ^ 0xffffffff) != argument_5_ || anLocalInt_9_ != 0
	    || ((Class354) class354).anInt2997 != 0
	    || ((Class354) class354).anInt2969 != 0)
	    argument_6_ |= 0x7;
	int anLocalInt_10_
	    = ((Entity) this).aClass271_6780.method3372(2);
	boolean anLocalBoolean
	    = (((Entity) this).aByte6781 != 0
	       && (Class333.anInt2720
		   >= ((Entity) this).anInt6788)
	       && (((Entity) this).anInt6739
		   > Class333.anInt2720));
	if (anLocalBoolean)
	    argument_6_ |= 0x80000;
	Class167 class167
	    = (((Entity) this).aClass167Array6801[0]
	       = (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854.method333
		  (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425, Class157.aClass41_1159,
		   ClientVariables.instance,
		   ((Entity) this).anInt6732,
		   DoublyLinkedNodeP2_Sub5.aClass383_4536, DiskBackedCache.aClass26_2709,
		   Class253_Sub1_Sub1.aClass365_6632,
		   ((Entity) this).anInt6787,
		   ((Entity) this).anInt6765,
		   ((Entity) this).anInt6742, (byte) 105,
		   ((Entity) this).aClass91Array6779,
		   argument_6_, class367, anLocalInt_10_, class367_7_,
		   argument_4_, ((Entity) this).anInt6761,
		   true, ((Entity) this).anInt6740,
		   ((Entity) this).anIntArray6792)));
	int anLocalInt_11_
	    = Node_Sub31_Sub32.method976(argument_5_ ^ ~0x7625);
	if (ClanSettingsDelta.anInt1544 < 96 && anLocalInt_11_ > 50)
	    Class317.method3639(-53);
	if (client.modeWhere != TestingStageEnum.LIVE
	    && anLocalInt_11_ < 50) {
	    int anLocalInt_12_;
	    for (anLocalInt_12_ = -anLocalInt_11_ + 50;
		 anLocalInt_12_ > Statics.anInt1994; Statics.anInt1994++)
		Class166.aByteArrayArray1214[Statics.anInt1994]
		    = new byte[102400];
	    while (Statics.anInt1994 > anLocalInt_12_) {
		Statics.anInt1994--;
		Class166.aByteArrayArray1214[Statics.anInt1994] = null;
	    }
	} else if (TestingStageEnum.LIVE != client.modeWhere) {
	    Class166.aByteArrayArray1214 = new byte[50][];
	    Statics.anInt1994 = 0;
	}
	if (class167 == null)
	    return false;
	((Entity) this).anInt6730 = class167.fa();
	((Entity) this).anInt6789 = class167.ma();
	this.method1836(-1000, class167);
	if (anLocalInt_8_ == 0 && anLocalInt_9_ == 0)
	    this.method1821(0, (byte) 125, method1830(-126) << 9,
			    anLocalInt_10_, 0, method1830(-127) << 9);
	else {
	    this.method1821(((Class354) class354).anInt3005, (byte) 98,
			    anLocalInt_9_, anLocalInt_10_,
			    ((Class354) class354).anInt2965, anLocalInt_8_);
	    if (((Entity) this).anInt6764 != 0)
		class167.FA(((Entity) this).anInt6764);
	    if (((Entity) this).anInt6741 != 0)
		class167.VA(((Entity) this).anInt6741);
	    if (((Entity) this).anInt6760 != 0)
		class167.H(0, ((Entity) this).anInt6760, 0);
	}
	if (anLocalBoolean)
	    class167.method2649(((Entity) this).aByte6743,
				((Entity) this).aByte6775,
				((Entity) this).aByte6771,
				(((Entity) this).aByte6781
				 & 0xff));
	if (!((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6846)
	    this.method1825(argument_4_, class354, (byte) -98, anLocalInt_10_,
			    anLocalInt_8_, anLocalInt_9_, anLocalInt);
	return true;
    }
    
    final boolean method1782(int argument_13_) {
	if (argument_13_ != -1)
	    method1830(93);
	return false;
    }
    
    final String method1855(boolean argument_14_, int argument_15_) {
	String string = "";
	if (Class130.aStringArray1050 != null)
	    string += Class130.aStringArray1050[aByte6868];
	int[] anLocalInts;
	if (aByte6866 == 1 && Statics.anIntArray5746 != null)
	    anLocalInts = Statics.anIntArray5746;
	else
	    anLocalInts = Statics.anIntArray1154;
	if (anLocalInts != null && anLocalInts[aByte6868] != -1) {
	    Class323 class323
		= Class62_Sub14.aClass220_4409
		      .method3028((byte) 116, anLocalInts[aByte6868]);
	    if (((Class323) class323).aChar2662 != 's') {
		ErrorReporting.reportError("gdn1", new Throwable());
		anLocalInts[aByte6868] = -1;
	    } else
		string += class323.method3674(25851, aByte6839 & 0xff);
	}
	if (!argument_14_)
	    string += ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6836;
	else
	    string += ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6847;
	if (Class62_Sub4.aStringArray4378 != null)
	    string += Class62_Sub4.aStringArray4378[aByte6868];
	return string;
    }
    
    final DoublyLinkedNodeP2_Sub10 method1776(int argument_16_, GraphicsToolkit argument_17_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 == null
	    || !method1854(argument_17_, -1, 2048))
	    return null;
	Class350 class350 = argument_17_.method2015();
	int anLocalInt
	    = ((Entity) this).aClass271_6780.method3372(2);
	class350.method3824(anLocalInt);
	Class148 class148
	    = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
	       [((DoublyLinkedNodeP2_Sub2) this).lightingHL]
	       [((DoublyLinkedNodeP2_Sub2) this).worldX >> LightingManager.lightCoordRShift]
	       [((DoublyLinkedNodeP2_Sub2) this).worldZ >> LightingManager.lightCoordRShift]);
	if (class148 == null
	    || ((Class148) class148).aClass104_Sub2_Sub4_1134 == null)
	    ((Entity) this).anInt6750
		-= (float) ((Entity) this).anInt6750 / 10.0F;
	else {
	    int anLocalInt_18_
		= (-((DoublyLinkedNodeP2_Sub2_Sub4)
		     ((Class148) class148).aClass104_Sub2_Sub4_1134).aShort6424
		   + ((Entity) this).anInt6750);
	    ((Entity) this).anInt6750
		-= (float) anLocalInt_18_ / 10.0F;
	}
	class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    (-((Entity) this).anInt6750
			     + (((DoublyLinkedNodeP2_Sub2) this).anInt4511 - 20)),
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	DoublyLinkedNodeP2_Sub10 class104_sub10 = null;
	((Entity) this).aBoolean6797 = false;
	if (((Node_Sub50) AthmosphericConditions.aClass59_Sub50_116)
		.aClass62_Sub27_4330.method1467(argument_16_ ^ ~0x7b)
	    == 1) {
	    Class354 class354 = this.method1831();
	    if (((Class354) class354).aBoolean2984
		&& (((Class22) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this)
				.aClass22_6854)).anInt143 == -1
		    || (((Class291)
			 (DiskBackedCache.aClass26_2709.method343
			  ((byte) 97,
			   ((Class22) (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this)
				       .aClass22_6854)).anInt143)))
			.aBoolean2371))) {
		Class367 class367
		    = ((((Entity) this).anInt6754 == -1
			|| ((Entity) this).anInt6755 != 0)
		       ? null
		       : (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
			  (((Entity) this).anInt6754, 0)));
		Class367 class367_19_
		    = ((((Entity) this).anInt6731 == -1
			|| ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6846
			|| (((Entity) this).aBoolean6753
			    && class367 != null))
		       ? null
		       : (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
			  (((Entity) this).anInt6731, 0)));
		Class167 class167
		    = (Class166.method2634
		       (anLocalInt, ((Entity) this).anInt6764,
			((Entity) this).aClass167Array6801[0],
			((Entity) this).anInt6760,
			class367_19_ == null ? class367 : class367_19_, 0,
			(class367_19_ == null
			 ? ((Entity) this).anInt6732
			 : ((Entity) this).anInt6742),
			argument_17_, 160,
			((Entity) this).anInt6741, true, 0,
			240, 1));
		if (class167 != null) {
		    class104_sub10
			= Class3.method216(true, 0,
					   (((Entity) this)
					    .aClass167Array6801).length + 1);
		    ((Entity) this).aBoolean6797 = true;
		    argument_17_.C(false);
		    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
			class167.method2646(class350,
					    (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					     .aClass104_Sub9Array4595
					     [(((Entity) this)
					       .aClass167Array6801).length]),
					    Class390.anInt3285, 0);
		    else
			class167.method2640(class350,
					    (((DoublyLinkedNodeP2_Sub10) class104_sub10)
					     .aClass104_Sub9Array4595
					     [(((Entity) this)
					       .aClass167Array6801).length]),
					    0);
		    argument_17_.C(true);
		}
	    }
	}
	if (this == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587) {
	    for (int anLocalInt_20_ = Class166.aClass124Array1216.length - 1;
		 anLocalInt_20_ >= 0; anLocalInt_20_--) {
		Class124 class124
		    = Class166.aClass124Array1216[anLocalInt_20_];
		if (class124 != null
		    && ((Class124) class124).anInt1005 != -1) {
		    if (((Class124) class124).anInt1007 == 1) {
			Node_Sub35 class59_sub35
			    = ((Node_Sub35)
			       (Class294.aJagexHashMap_2453.get((long) ((Class124) class124).anInt1008)));
			if (class59_sub35 != null) {
			    DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1 class104_sub2_sub2_sub5_sub1
				= (((Node_Sub35) class59_sub35)
				   .aClass104_Sub2_Sub2_Sub5_Sub1_4157);
			    int anLocalInt_21_
				= (-(((DoublyLinkedNodeP2_Sub2)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .worldX)
				   + ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub1).worldX);
			    int anLocalInt_22_
				= (-(((DoublyLinkedNodeP2_Sub2)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .worldZ)
				   + ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub1).worldZ);
			    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
				method1858((((Entity) this)
					    .aClass167Array6801[0]),
					   argument_17_, class350, (byte) 121,
					   anLocalInt_22_,
					   ((Class124) class124).anInt1005,
					   anLocalInt_21_, 92160000);
			    else
				method1863(370, anLocalInt_22_, argument_17_,
					   class350, 92160000,
					   ((Class124) class124).anInt1005,
					   Class390.anInt3285,
					   (((Entity) this)
					    .aClass167Array6801[0]),
					   anLocalInt_21_);
			}
		    }
		    if (((Class124) class124).anInt1007 == 2) {
			int anLocalInt_23_
			    = (-(((DoublyLinkedNodeP2_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .worldX)
			       + ((Class124) class124).anInt1010);
			int anLocalInt_24_
			    = (-(((DoublyLinkedNodeP2_Sub2)
				  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
				 .worldZ)
			       + ((Class124) class124).anInt1006);
			int anLocalInt_25_
			    = ((Class124) class124).anInt1004 << 9;
			anLocalInt_25_ *= anLocalInt_25_;
			if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
			    method1858((((Entity) this)
					.aClass167Array6801[0]),
				       argument_17_, class350, (byte) 116,
				       anLocalInt_24_,
				       ((Class124) class124).anInt1005,
				       anLocalInt_23_, anLocalInt_25_);
			else
			    method1863(argument_16_ + 380, anLocalInt_24_,
				       argument_17_, class350, anLocalInt_25_,
				       ((Class124) class124).anInt1005,
				       Class390.anInt3285,
				       (((Entity) this)
					.aClass167Array6801[0]),
				       anLocalInt_23_);
		    }
		    if (((Class124) class124).anInt1007 == 10
			&& ((Class124) class124).anInt1008 >= 0
			&& ((Class345
			     .aClass104_Sub2_Sub2_Sub5_Sub2Array2905).length
			    > ((Class124) class124).anInt1008)) {
			DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2
			    = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905
			       [((Class124) class124).anInt1008]);
			if (class104_sub2_sub2_sub5_sub2 != null) {
			    int anLocalInt_26_
				= (-(((DoublyLinkedNodeP2_Sub2)
				      (Class308
				       .aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				     .worldX)
				   + ((DoublyLinkedNodeP2_Sub2)
				      class104_sub2_sub2_sub5_sub2).worldX);
			    int anLocalInt_27_
				= (((DoublyLinkedNodeP2_Sub2)
				    class104_sub2_sub2_sub5_sub2).worldZ
				   - (((DoublyLinkedNodeP2_Sub2)
				       (Class308
					.aClass104_Sub2_Sub2_Sub5_Sub2_2587))
				      .worldZ));
			    if (!DoublyLinkedNodeP2_Sub3.aBoolean4523)
				method1858((((Entity) this)
					    .aClass167Array6801[0]),
					   argument_17_, class350, (byte) 97,
					   anLocalInt_27_,
					   ((Class124) class124).anInt1005,
					   anLocalInt_26_, 92160000);
			    else
				method1863(370, anLocalInt_27_, argument_17_,
					   class350, 92160000,
					   ((Class124) class124).anInt1005,
					   Class390.anInt3285,
					   (((Entity) this)
					    .aClass167Array6801[0]),
					   anLocalInt_26_);
			}
		    }
		}
	    }
	    class350.method3824(anLocalInt);
	    class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	}
	class350.method3824(anLocalInt);
	class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    (((DoublyLinkedNodeP2_Sub2) this).anInt4511 - 5
			     - ((Entity) this).anInt6750),
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	if (class104_sub10 == null)
	    class104_sub10
		= Class3.method216(true, 0, (((Entity) this)
					     .aClass167Array6801).length);
	this.method1833(((Entity) this).aClass167Array6801,
			32, argument_17_, class350, false);
	if (!DoublyLinkedNodeP2_Sub3.aBoolean4523) {
	    for (int anLocalInt_28_ = 0;
		 anLocalInt_28_ < (((Entity) this)
				   .aClass167Array6801).length;
		 anLocalInt_28_++) {
		if ((((Entity) this).aClass167Array6801
		     [anLocalInt_28_])
		    != null)
		    ((Entity) this).aClass167Array6801
			[anLocalInt_28_].method2640
			(class350,
			 (((DoublyLinkedNodeP2_Sub10) class104_sub10)
			  .aClass104_Sub9Array4595[anLocalInt_28_]),
			 (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 == this
			  ? 1 : 0));
	    }
	} else {
	    for (int anLocalInt_29_ = 0;
		 (((Entity) this).aClass167Array6801.length
		  > anLocalInt_29_);
		 anLocalInt_29_++) {
		if ((((Entity) this).aClass167Array6801
		     [anLocalInt_29_])
		    != null)
		    ((Entity) this).aClass167Array6801
			[anLocalInt_29_].method2646
			(class350,
			 (((DoublyLinkedNodeP2_Sub10) class104_sub10)
			  .aClass104_Sub9Array4595[anLocalInt_29_]),
			 Class390.anInt3285,
			 (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 == this
			  ? 1 : 0));
	    }
	}
	if (((Entity) this).aClass104_Sub7_6804 != null) {
	    Class72 class72 = ((Entity) this)
				  .aClass104_Sub7_6804.method1932();
	    if (DoublyLinkedNodeP2_Sub3.aBoolean4523)
		argument_17_.method2074(class72, Class390.anInt3285);
	    else
		argument_17_.method2067(class72);
	}
	for (int anLocalInt_30_ = 0;
	     (anLocalInt_30_
	      < ((Entity) this).aClass167Array6801.length);
	     anLocalInt_30_++) {
	    if ((((Entity) this).aClass167Array6801
		 [anLocalInt_30_])
		!= null)
		((Entity) this).aBoolean6797
		    |= ((Entity) this).aClass167Array6801
			   [anLocalInt_30_].F();
	    ((Entity) this).aClass167Array6801[anLocalInt_30_]
		= null;
	}
	if (argument_16_ != -10)
	    MapRelated.mapFileLData = null;
	((Entity) this).anInt6757 = Statics.anInt264;
	return class104_sub10;
    }
    
    final void method1856(Packet argument_31_, boolean argument_32_) {
	((Packet) argument_31_).pos = 0;
	int anLocalInt = argument_31_.g1();
	aByte6866 = (byte) (anLocalInt & 0x1);
	boolean anLocalBoolean
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6857;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6857
	    = (anLocalInt & 0x2) != 0;
	boolean anLocalBoolean_33_ = (anLocalInt & 0x4) != 0;
	int anLocalInt_34_ = super.method1830(-127);
	this.method1838(-1, ((anLocalInt & 0x38) >> 3) + 1);
	aByte6868 = (byte) (anLocalInt >> 6 & 0x3);
	((DoublyLinkedNodeP2_Sub2) this).worldX
	    += method1830(-127) - anLocalInt_34_ << 8;
	((DoublyLinkedNodeP2_Sub2) this).worldZ
	    += method1830(-126) - anLocalInt_34_ << 8;
	aByte6839 = argument_31_.g1s();
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6843
	    = argument_31_.g1s();
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6840
	    = argument_31_.g1s();
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6848
	    = argument_31_.g1s() == 1;
	if (TestingStageEnum.LIVE == client.modeWhere
	    && Class15.anInt120 >= 2)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6848 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6860 = 0;
	int anLocalInt_35_ = -1;
	int[] anLocalInts
	    = new int[((Class61) Statics.aClass61_2002).anIntArray439.length];
	Class4[] class4s
	    = (new Class4
	       [((Class61) Statics.aClass61_2002).anIntArray439.length]);
	Class371[] class371s
	    = (new Class371
	       [((Class61) Statics.aClass61_2002).anIntArray439.length]);
	for (int anLocalInt_36_ = 0;
	     (anLocalInt_36_
	      < ((Class61) Statics.aClass61_2002).anIntArray439.length);
	     anLocalInt_36_++) {
	    if ((((Class61) Statics.aClass61_2002).anIntArray439
		 [anLocalInt_36_])
		!= 1) {
		int anLocalInt_37_ = argument_31_.g1();
		if (anLocalInt_37_ == 0)
		    anLocalInts[anLocalInt_36_] = 0;
		else {
		    int anLocalInt_38_ = argument_31_.g1();
		    int anLocalInt_39_
			= anLocalInt_38_ + (anLocalInt_37_ << 8);
		    if (anLocalInt_36_ == 0 && anLocalInt_39_ == 65535) {
			anLocalInt_35_ = argument_31_.g2();
			((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6860
			    = argument_31_.g1();
			break;
		    }
		    if (anLocalInt_39_ >= 32768) {
			anLocalInt_39_ = (Node_Sub36_Sub1.anIntArray6102
					  [anLocalInt_39_ - 32768]);
			anLocalInts[anLocalInt_36_]
			    = MathStatics.OR(anLocalInt_39_, 1073741824);
			class371s[anLocalInt_36_]
			    = Class253_Sub1_Sub1.aClass365_6632
				  .method3975(125, anLocalInt_39_);
			int anLocalInt_40_
			    = ((Class371) class371s[anLocalInt_36_]).anInt3181;
			if (anLocalInt_40_ != 0)
			    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6860
				= anLocalInt_40_;
		    } else
			anLocalInts[anLocalInt_36_]
			    = MathStatics.OR(-2147483648, (anLocalInt_39_ - 256));
		}
	    }
	}
	if (anLocalInt_35_ == -1) {
	    int anLocalInt_41_ = argument_31_.g2();
	    int anLocalInt_42_ = 0;
	    for (int anLocalInt_43_ = 0;
		 (((Class61) Statics.aClass61_2002).anIntArray439.length
		  > anLocalInt_43_);
		 anLocalInt_43_++) {
		if ((((Class61) Statics.aClass61_2002).anIntArray439
		     [anLocalInt_43_])
		    == 0) {
		    if ((1 << anLocalInt_42_ & anLocalInt_41_) != 0)
			class4s[anLocalInt_43_]
			    = Statics.method3410(class371s[anLocalInt_43_], argument_31_, 55);
		    anLocalInt_42_++;
		}
	    }
	}
	int[] anLocalInts_44_ = new int[5];
	for (int anLocalInt_45_ = 0; anLocalInt_45_ < 5; anLocalInt_45_++) {
	    int anLocalInt_46_ = argument_31_.g1();
	    if (Statics.aShortArrayArrayArray270.length < 1
		|| anLocalInt_46_ < 0
		|| anLocalInt_46_ >= (Statics.aShortArrayArrayArray270[0]
				      [anLocalInt_45_]).length)
		anLocalInt_46_ = 0;
	    anLocalInts_44_[anLocalInt_45_] = anLocalInt_46_;
	}
	anInt6858 = argument_31_.g2();
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6847
	    = argument_31_.gstr();
	if (this == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
	    Exception_Sub1.aString47
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6847;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6836
	    = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6847;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6855
	    = argument_31_.g1();
	if (!anLocalBoolean_33_) {
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6844 = 0;
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6841
		= argument_31_.g1();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6850
		= argument_31_.g1();
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6850 == 255)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6850 = -1;
	} else {
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6844
		= argument_31_.g2();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6841
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6855;
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6844 == 65535)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6844 = -1;
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6850 = -1;
	}
	int anLocalInt_47_ = ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6863;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6863
	    = argument_31_.g1();
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6863 == 0)
	    Statics.method1505(this, -9269);
	else {
	    int anLocalInt_48_
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6837;
	    int anLocalInt_49_
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6870;
	    int anLocalInt_50_
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6838;
	    int anLocalInt_51_
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6851;
	    int anLocalInt_52_
		= ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6871;
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6837
		= argument_31_.g2();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6870
		= argument_31_.g2();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6838
		= argument_31_.g2();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6851
		= argument_31_.g2();
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6871
		= argument_31_.g1();
	    if ((!anLocalBoolean
		 == ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6857)
		|| (anLocalInt_47_
		    != ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6863)
		|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6837
		    != anLocalInt_48_)
		|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6870
		    != anLocalInt_49_)
		|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6838
		    != anLocalInt_50_)
		|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6851
		    != anLocalInt_51_)
		|| (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6871
		    != anLocalInt_52_))
		Class199.method2911(true, this);
	}
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 == null)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854
		= new Class22();
	int anLocalInt_53_
	    = (((Class22) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854)
	       .anInt143);
	int[] anLocalInts_54_
	    = (((Class22) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854)
	       .anIntArray150);
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854.method326
	    (aByte6866 == 1, anLocalInt_35_, method1839(argument_32_),
	     (byte) 126, anLocalInts, anLocalInts_44_, class4s);
	if (anLocalInt_35_ != anLocalInt_53_) {
	    ((DoublyLinkedNodeP2_Sub2) this).worldX
		= ((((Entity) this).pathX[0] << 9)
		   + (method1830(-127) << 8));
	    ((DoublyLinkedNodeP2_Sub2) this).worldZ
		= ((((Entity) this).pathZ[0] << 9)
		   + (method1830(-125) << 8));
	}
	if (Class64.anInt451 == ((Entity) this).anInt6745
	    && anLocalInts_54_ != null) {
	    for (int anLocalInt_55_ = 0;
		 anLocalInt_55_ < anLocalInts_44_.length; anLocalInt_55_++) {
		if (anLocalInts_54_[anLocalInt_55_]
		    != anLocalInts_44_[anLocalInt_55_]) {
		    Class253_Sub1_Sub1.aClass365_6632.method3977(121);
		    break;
		}
	    }
	}
	if (((Entity) this).aClass104_Sub7_6804 != null)
	    ((Entity) this).aClass104_Sub7_6804.method1923();
	if (((Entity) this).anInt6731 != -1
	    && ((Entity) this).aBoolean6753) {
	    Class354 class354 = this.method1831();
	    if (!class354.method3918((byte) 60,
				     (((Entity) this)
				      .anInt6731))) {
		((Entity) this).aBoolean6753 = false;
		((Entity) this).anInt6731 = -1;
	    }
	}
    }
    
    final int method1839(boolean argument_56_) {
	if (argument_56_ != true)
	    method1852((byte) 57);
	return anInt6858;
    }

    final void method1773(byte argument_58_, GraphicsToolkit argument_59_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 != null
	    && (((Entity) this).aBoolean6795
		|| method1854(argument_59_, -1, 0))) {
	    Class350 class350 = argument_59_.method2015();
	    class350.method3824(((Entity) this)
				    .aClass271_6780.method3372(2));
	    class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
				((DoublyLinkedNodeP2_Sub2) this).anInt4511 - 5,
				((DoublyLinkedNodeP2_Sub2) this).worldZ);
	    this.method1833((((Entity) this)
			     .aClass167Array6801),
			    32, argument_59_, class350,
			    ((Entity) this).aBoolean6795);
	    if (argument_58_ <= 69)
		((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6838 = -11;
	    for (int anLocalInt = 0;
		 anLocalInt < (((Entity) this)
			       .aClass167Array6801).length;
		 anLocalInt++)
		((Entity) this).aClass167Array6801[anLocalInt]
		    = null;
	}
    }
    
    private final void method1858(Class167 argument_60_, GraphicsToolkit argument_61_,
				  Class350 argument_62_, byte argument_63_,
				  int argument_64_, int argument_65_,
				  int argument_66_, int argument_67_) {
	int anLocalInt
	    = argument_66_ * argument_66_ + argument_64_ * argument_64_;
	if (argument_63_ < 61)
	    method1862(true, -95);
	if (anLocalInt >= 262144 && anLocalInt <= argument_67_) {
	    int anLocalInt_68_
		= ((int) ((Math.atan2((double) argument_66_,
				      (double) argument_64_)
			   * 2607.5945876176133)
			  - (double) ((Entity) this)
					 .aClass271_6780.method3372(2))
		   & 0x3fff);
	    Class167 class167
		= (DoublyLinkedNode_Sub51_Sub5.method1202(((Entity) this).anInt6760, ((Entity) this).anInt6764, ((Entity) this).anInt6741, (byte) 118, argument_65_, anLocalInt_68_, argument_61_));
	    if (class167 != null) {
		argument_61_.C(false);
		class167.method2640(argument_62_, null, 0);
		argument_61_.C(true);
	    }
	}
    }
    
    final void method1859(int argument_69_, int argument_70_, int argument_71_,
			  byte argument_72_) {
	if (((Entity) this).anInt6754 != -1
	    && (((Class367) (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758
			     (((Entity) this).anInt6754, 0)))
		.anInt3114) == 1) {
	    ((Entity) this).anInt6754 = -1;
	    ((Entity) this).anIntArray6735 = null;
	}
	for (int anLocalInt = 0;
	     (anLocalInt
	      < ((Entity) this).aClass269Array6759.length);
	     anLocalInt++) {
	    if (((Class269) (((Entity) this)
			     .aClass269Array6759[anLocalInt])).anInt2150
		!= -1) {
		Class126 class126
		    = (Class194.aClass225_1414.method3054
		       ((byte) 79,
			(((Class269) (((Entity) this)
				      .aClass269Array6759[anLocalInt]))
			 .anInt2150)));
		if (((Class126) class126).aBoolean1035
		    && ((Class126) class126).anInt1034 != -1
		    && (((Class367)
			 DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
			     .method3758(((Class126) class126).anInt1034, 0))
			.anInt3114) == 1)
		    ((Class269) (((Entity) this)
				 .aClass269Array6759[anLocalInt])).anInt2150
			= -1;
	    }
	}
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6862 = -1;
	if (argument_69_ < 0 || argument_69_ >= MapRelated.mapWidth
	    || argument_71_ < 0
	    || MapRelated.mapDepth <= argument_71_)
	    method1865(argument_69_, argument_71_, false);
	else if (((Entity) this).pathX[0] < 0
		 || (MapRelated.mapWidth
		     <= ((Entity) this).pathX[0])
		 || ((Entity) this).pathZ[0] < 0
		 || (MapRelated.mapDepth
		     <= ((Entity) this).pathZ[0]))
	    method1865(argument_69_, argument_71_, false);
	else {
	    if (argument_72_ == 2)
		Class200.method2913(this, (byte) 2, argument_71_, 124,
				    argument_69_);
	    method1853(argument_69_, argument_72_, argument_71_, 4);
	}
    }
    
    final boolean method1860(int argument_73_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 == null)
	    return false;
	return true;
    }
    
    public static void method1861(int argument) {
	aClass166_6853 = null;
	anIntArray6859 = null;
	AthmosphericConditions.athmosphereDefinitions = null;
	MapRelated.mapFileLData = null;
    }
    
    final void method1775(GraphicsToolkit argument_74_, DoublyLinkedNodeP2_Sub2 argument_75_,
			  boolean argument_76_, int argument_77_,
			  int argument_78_, int argument_79_,
			  int argument_80_) {
	if (argument_77_ > -16)
	    method1771(22, 0, 4, null);
	throw new IllegalStateException();
    }
    
    final String method1862(boolean argument_81_, int argument_82_) {
	if (argument_81_)
	    return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6847;
	return ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aString6836;
    }
    
    private final void method1863
	(int argument_83_, int argument_84_, GraphicsToolkit argument_85_,
	 Class350 argument_86_, int argument_87_, int argument_88_,
	 int argument_89_, Class167 argument_90_, int argument_91_) {
	int anLocalInt
	    = argument_84_ * argument_84_ + argument_91_ * argument_91_;
	if (anLocalInt >= 262144 && argument_87_ >= anLocalInt) {
	    int anLocalInt_92_
		= ((int) ((Math.atan2((double) argument_91_,
				      (double) argument_84_)
			   * 2607.5945876176133)
			  - (double) ((Entity) this)
					 .aClass271_6780.method3372(2))
		   & 0x3fff);
	    Class167 class167
		= (DoublyLinkedNode_Sub51_Sub5.method1202(((Entity) this).anInt6760, ((Entity) this).anInt6764, ((Entity) this).anInt6741, (byte) -69, argument_88_, anLocalInt_92_, argument_85_));
	    if (class167 != null) {
		argument_85_.C(false);
		class167.method2646(argument_86_, null, argument_89_, 0);
		argument_85_.C(true);
	    }
	    if (argument_83_ != 370)
		method1864(-49, (byte) 116, 36);
	}
    }
    
    final int method1834(int argument_93_) {
	if (argument_93_ != -1)
	    ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6852 = true;
	return -1;
    }
    
    static final boolean method1864(int argument, byte argument_94_,
				    int argument_95_) {
	if ((argument_95_ & 0x400) == 0)
	    return false;
	return true;
    }
    
    final void method1865(int argument_96_, int argument_97_,
			  boolean argument_98_) {
	((Entity) this).anInt6803 = 0;
	((Entity) this).pathX[0] = argument_96_;
	((Entity) this).anInt6798 = 0;
	((Entity) this).anInt6796 = 0;
	((Entity) this).pathZ[0] = argument_97_;
	int anLocalInt = method1830(-127);
	((DoublyLinkedNodeP2_Sub2) this).worldZ
	    = (anLocalInt * 256
	       + ((Entity) this).pathZ[0] * 512);
	((DoublyLinkedNodeP2_Sub2) this).worldX
	    = (anLocalInt * 256
	       + ((Entity) this).pathX[0] * 512);
	if (this == Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
	    Class120.method2385((byte) 120);
	if (((Entity) this).aClass104_Sub7_6804 != null)
	    ((Entity) this).aClass104_Sub7_6804.method1923();
    }
    
    final int method1830(int argument_99_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 != null
	    && (((Class22) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854)
		.anInt143) != -1)
	    return (((Class291) (DiskBackedCache.aClass26_2709.method343
				 ((byte) 97,
				  ((Class22) ((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
					      this).aClass22_6854).anInt143)))
		    .anInt2344);
	return super.method1830(-127);
    }
    
    final boolean method1771(int argument_100_, int argument_101_,
			     int argument_102_, GraphicsToolkit argument_103_) {
	if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aClass22_6854 == null
	    || !method1854(argument_103_, argument_100_ - 4162, 131072))
	    return false;
	if (argument_100_ != 4161)
	    return false;
	Class350 class350 = argument_103_.method2015();
	int anLocalInt
	    = ((Entity) this).aClass271_6780.method3372(2);
	class350.method3824(anLocalInt);
	class350.method3835(((DoublyLinkedNodeP2_Sub2) this).worldX,
			    ((DoublyLinkedNodeP2_Sub2) this).anInt4511,
			    ((DoublyLinkedNodeP2_Sub2) this).worldZ);
	boolean anLocalBoolean = false;
	for (int anLocalInt_104_ = 0;
	     (((Entity) this).aClass167Array6801.length
	      > anLocalInt_104_);
	     anLocalInt_104_++) {
	    if ((((Entity) this).aClass167Array6801
		 [anLocalInt_104_]) != null
		&& (DoublyLinkedNodeP2_Sub3.aBoolean4523
		    ? (((Entity) this).aClass167Array6801
			   [anLocalInt_104_].method2637
		       (argument_102_, argument_101_, class350, true, 0,
			Class390.anInt3285))
		    : (((Entity) this).aClass167Array6801
			   [anLocalInt_104_].method2645
		       (argument_102_, argument_101_, class350, true, 0)))) {
		anLocalBoolean = true;
		break;
	    }
	}
	((Entity) this).aClass167Array6801[0]
	    = ((Entity) this).aClass167Array6801[1]
	    = ((Entity) this).aClass167Array6801[2] = null;
	return anLocalBoolean;
    }
    
    final Class80 method1769(GraphicsToolkit argument_105_, byte argument_106_) {
	if (argument_106_ != -126)
	    return null;
	return null;
    }
    
    final void method1770(int argument_107_) {
	if (argument_107_ != -13514)
	    TestingStageEnum.forId(124);
	throw new IllegalStateException();
    }
    
    static final boolean method1866(int argument, int argument_108_,
				    int argument_109_) {
	if (!((argument & 0x70000) != 0
	      | Class62_Sub12.method1402(argument, true, argument_109_))
	    && !Statics.method544(argument_109_, argument, 0))
	    return false;
	return true;
    }
    
    public DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2() {
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6841 = 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6852 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6843 = -1;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6844 = 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6862 = -1;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6846 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6855 = 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6856 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6860 = 0;
	aByte6866 = (byte) 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6863 = 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6850 = -1;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6837 = -1;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6851 = -1;
	aByte6868 = (byte) 0;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6857 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).aBoolean6864 = false;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6871 = 255;
	((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2) this).anInt6870 = -1;
    }
    
    static {
	aClass166_6853 = new Class166(129, 4);
    }
}
