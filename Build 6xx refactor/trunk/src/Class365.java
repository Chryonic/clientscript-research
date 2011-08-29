/* Class365 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class365
{
    int anInt3069;
    private boolean aBoolean3070;
    int anInt3071;
    private Js5Store aJs5Store_3072;
    private Class149 aClass149_3073 = new Class149(64);
    Js5Store aJs5Store_3074;
    static Class329 aClass329_3075 = new Class329(6, 8);
    Class149 aClass149_3076 = new Class149(50);
    static int anInt3079 = 1;
    Class162 aClass162_3080 = new Class162(250);
    private Class385 aClass385_3081 = new Class385();
    private String[] aStringArray3082;
    private Class362 aClass362_3083;
    private String[] aStringArray3084;
    int anInt3085;
    
    static final Node_Sub5 method3969(byte argument, int argument_0_,
					 boolean argument_1_) {
	long l = (long) ((argument_1_ ? -2147483648 : 0) | argument_0_);
	return (Node_Sub5) Class23.aJagexHashMap_153.get(l);
    }
    
    static final void method3970(int argument, int argument_2_,
				 int argument_3_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(1, 13175, (long) argument_2_);
	class59_sub51_sub3.method1182(argument_3_ - 55);
	if (argument_3_ != 0)
	    GlTexture.buffer = null;
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument;
    }
    
    static final void method3971(int argument) {
	if (Statics.anInt1652 != 9) {
	    if (Statics.anInt1652 != 5 && Statics.anInt1652 != 6) {
		if (Statics.anInt1652 == 12)
		    Class316.method3638(3, 2);
	    } else
		Class316.method3638(3, 2);
	} else
	    Class316.method3638(5, 2);
    }
    
    final void method3972(int argument_4_, boolean argument_5_) {
	synchronized (aClass149_3073) {
	    aClass149_3073.method2534(argument_4_, (byte) -8);
	}
	synchronized (((Class365) this).aClass149_3076) {
	    ((Class365) this).aClass149_3076.method2534(argument_4_,
							(byte) -8);
	}
	synchronized (((Class365) this).aClass162_3080) {
	    ((Class365) this).aClass162_3080.method2608(-127, argument_4_);
	}
    }
    
    final void method3973(byte argument_6_) {
	synchronized (aClass149_3073) {
	    aClass149_3073.method2540(65);
	}
	synchronized (((Class365) this).aClass149_3076) {
	    ((Class365) this).aClass149_3076.method2540(18);
	}
	synchronized (((Class365) this).aClass162_3080) {
	    ((Class365) this).aClass162_3080.method2616(true);
	}
    }
    
    final void method3974(boolean argument_7_, byte argument_8_) {
	if (aBoolean3070 != argument_7_) {
	    aBoolean3070 = argument_7_;
	    method3976(1);
	}
    }
    
    final Class371 method3975(int argument_9_, int argument_10_) {
	Class371 class371;
	synchronized (aClass149_3073) {
	    class371
		= (Class371) aClass149_3073.get((long) argument_10_);
	}
	if (class371 != null)
	    return class371;
	byte[] anLocalInts;
	synchronized (aJs5Store_3072) {
	    anLocalInts
		= aJs5Store_3072.getData(Class109.method1975(argument_10_, -7562), DiskBackedCache.andFF(argument_10_));
	}
	class371 = new Class371();
	((Class371) class371).aClass365_3188 = this;
	((Class371) class371).anInt3140 = argument_10_;
	((Class371) class371).aStringArray3136
	    = new String[] { null, null,
			     MultilanguageString.TAKE
				 .getLocalizedString(((Class365) this).anInt3069),
			     null, null };
	((Class371) class371).aStringArray3143
	    = (new String[]
	       { null, null, null, null,
		 MultilanguageString.DROP
		     .getLocalizedString(((Class365) this).anInt3069) });
	if (anLocalInts != null)
	    class371.method4063(83, new Packet(anLocalInts));
	class371.method4066(-12);
	if (((Class371) class371).anInt3138 != -1)
	    class371.method4054(method3975(-91,
					   ((Class371) class371).anInt3138),
				method3975(-64,
					   ((Class371) class371).anInt3189),
				(byte) -107);
	if (((Class371) class371).anInt3151 != -1)
	    class371.method4061(0,
				method3975(-97,
					   ((Class371) class371).anInt3177),
				method3975(125,
					   ((Class371) class371).anInt3151));
	if (((Class371) class371).anInt3157 != -1)
	    class371.method4056(method3975(121,
					   ((Class371) class371).anInt3135),
				-23141,
				method3975(127,
					   ((Class371) class371).anInt3157));
	if (!aBoolean3070 && ((Class371) class371).aBoolean3131) {
	    ((Class371) class371).aString3160
		= MultilanguageString.MEMBERS_OBJECT
		      .getLocalizedString(((Class365) this).anInt3069);
	    ((Class371) class371).aStringArray3143 = aStringArray3084;
	    ((Class371) class371).anInt3181 = 0;
	    ((Class371) class371).aBoolean3176 = false;
	    ((Class371) class371).anIntArray3155 = null;
	    ((Class371) class371).aStringArray3136 = aStringArray3082;
	    if (((Class371) class371).aJagexHashMap_3173 != null) {
		boolean anLocalBoolean = false;
		for (Node node
			 = ((Class371) class371).aJagexHashMap_3173.first(0);
		     node != null;
		     node = ((Class371) class371).aJagexHashMap_3173
				   .next()) {
		    Class315 class315
			= aClass362_3083.method3960(true,
						    (int) (((Node) node)
							   .hash));
		    if (!((Class315) class315).aBoolean2605)
			anLocalBoolean = true;
		    else
			node.unlink();
		}
		if (!anLocalBoolean)
		    ((Class371) class371).aJagexHashMap_3173 = null;
	    }
	}
	synchronized (aClass149_3073) {
	    aClass149_3073.put(class371, (long) argument_10_);
	}
	return class371;
    }
    
    final void method3976(int argument_11_) {
	synchronized (aClass149_3073) {
	    aClass149_3073.clear((byte) -3);
	}
	synchronized (((Class365) this).aClass149_3076) {
	    ((Class365) this).aClass149_3076.clear((byte) -3);
	}
	synchronized (((Class365) this).aClass162_3080) {
	    ((Class365) this).aClass162_3080.method2609((byte) 117);
	}
    }
    
    final void method3977(int argument_12_) {
	synchronized (((Class365) this).aClass162_3080) {
	    ((Class365) this).aClass162_3080.method2609((byte) 55);
	}
    }
    
    final Class368 method3978
	(int argument_13_, boolean argument_14_, Class22 argument_15_,
	 int argument_16_, int argument_17_, AbstractFont argument_18_,
	 GraphicsToolkit argument_19_, boolean argument_20_, int argument_21_,
	 int argument_22_, GraphicsToolkit argument_23_, int argument_24_) {
	Class368 class368
	    = method3982(argument_22_, argument_21_, (byte) 16, argument_15_,
			 argument_17_, argument_16_, argument_19_,
			 argument_13_);
	if (class368 != null)
	    return class368;
	if (argument_24_ != -25958)
	    return null;
	Class371 class371 = method3975(argument_24_ + 25837, argument_13_);
	if (argument_16_ > 1 && ((Class371) class371).anIntArray3163 != null) {
	    int anLocalInt = -1;
	    for (int anLocalInt_25_ = 0; anLocalInt_25_ < 10;
		 anLocalInt_25_++) {
		if ((((Class371) class371).anIntArray3168[anLocalInt_25_]
		     <= argument_16_)
		    && (((Class371) class371).anIntArray3168[anLocalInt_25_]
			!= 0))
		    anLocalInt
			= ((Class371) class371).anIntArray3163[anLocalInt_25_];
	    }
	    if (anLocalInt != -1)
		class371 = method3975(122, anLocalInt);
	}
	int[] anLocalInts
	    = class371.method4051(argument_21_, argument_14_, argument_22_,
				  argument_23_, argument_19_, (byte) -89,
				  argument_17_, argument_16_, argument_15_,
				  argument_18_);
	if (anLocalInts == null)
	    return null;
	Class368 class368_26_;
	if (!argument_20_)
	    class368_26_
		= argument_19_.method2047(36, anLocalInts, 0, 32, 36);
	else
	    class368_26_
		= argument_23_.method2047(36, anLocalInts, 0, 32, 36);
	if (!argument_20_) {
	    Class385 class385 = new Class385();
	    ((Class385) class385).anInt3578 = argument_17_;
	    ((Class385) class385).anInt3581
		= ((GraphicsToolkit) argument_19_).anInt939;
	    ((Class385) class385).anInt3579 = argument_16_;
	    ((Class385) class385).anInt3577 = argument_21_;
	    ((Class385) class385).anInt3580 = argument_13_;
	    ((Class385) class385).aBoolean3576 = argument_15_ != null;
	    ((Class385) class385).anInt3574 = argument_22_;
	    ((Class365) this).aClass162_3080.method2613(class368_26_, class385,
							(byte) -121);
	}
	return class368_26_;
    }
    
    public static void method3979(boolean argument) {
	GlTexture.buffer = null;
	aClass329_3075 = null;
    }
    
    final void method3980(byte argument_27_) {
	synchronized (((Class365) this).aClass149_3076) {
	    ((Class365) this).aClass149_3076.clear((byte) -3);
	}
    }
    
    final void method3981(int argument_28_, byte argument_29_) {
	((Class365) this).anInt3085 = argument_28_;
	synchronized (((Class365) this).aClass149_3076) {
	    ((Class365) this).aClass149_3076.clear((byte) -3);
	}
    }
    
    final Class368 method3982(int argument_30_, int argument_31_,
			      byte argument_32_, Class22 argument_33_,
			      int argument_34_, int argument_35_,
			      GraphicsToolkit argument_36_, int argument_37_) {
	((Class385) aClass385_3081).anInt3578 = argument_34_;
	((Class385) aClass385_3081).anInt3581
	    = ((GraphicsToolkit) argument_36_).anInt939;
	((Class385) aClass385_3081).anInt3580 = argument_37_;
	((Class385) aClass385_3081).anInt3579 = argument_35_;
	((Class385) aClass385_3081).anInt3574 = argument_30_;
	((Class385) aClass385_3081).anInt3577 = argument_31_;
	((Class385) aClass385_3081).aBoolean3576 = argument_33_ != null;
	return ((Class368)
		((Class365) this).aClass162_3080.method2611(7,
							    aClass385_3081));
    }
    
    Class365(GameEnum argument_38_, int argument_39_, boolean argument_40_,
	     Class362 argument_41_, Js5Store argument_42_,
	     Js5Store argument_43_) {
	((Class365) this).anInt3069 = argument_39_;
	((Class365) this).aJs5Store_3074 = argument_43_;
	aClass362_3083 = argument_41_;
	aJs5Store_3072 = argument_42_;
	aBoolean3070 = argument_40_;
	if (aJs5Store_3072 == null)
	    ((Class365) this).anInt3071 = 0;
	else {
	    int anLocalInt = aJs5Store_3072.getRealSubFileCount() - 1;
	    ((Class365) this).anInt3071
		= (aJs5Store_3072.getSubFileCount(anLocalInt)
		   + anLocalInt * 256);
	}
	aStringArray3082
	    = new String[] { null, null,
			     MultilanguageString.TAKE
				 .getLocalizedString(((Class365) this).anInt3069),
			     null, null };
	aStringArray3084
	    = (new String[]
	       { null, null, null, null,
		 MultilanguageString.DROP
		     .getLocalizedString(((Class365) this).anInt3069) });
    }
}
