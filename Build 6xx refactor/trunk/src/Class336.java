/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class336
{
    private Js5Store aJs5Store_2746;
    private Class149 aClass149_2747 = new Class149(64);
    private Class149 aClass149_2749 = new Class149(100);
    
    final void method3750(int argument_0_) {
	synchronized (aClass149_2747) {
	    aClass149_2747.method2540(101);
	}
	synchronized (aClass149_2749) {
	    aClass149_2749.method2540(90);
	}
    }
    
    public static void method3751(int argument) {
	client.loadingStatusCollection = null;
    }
    
    final void method3752(int argument_1_, byte argument_2_) {
	synchronized (aClass149_2747) {
	    aClass149_2747.method2534(argument_1_, (byte) -8);
	}
	synchronized (aClass149_2749) {
	    aClass149_2749.method2534(argument_1_, (byte) -8);
	}
    }
    
    static final void method3753(byte argument, int argument_3_,
				 Class48 argument_4_, GraphicsToolkit argument_5_) {
	if (DoublyLinkedNode_Sub51_Sub8.anIntArray6263 != null
	    && argument_3_ <= ((Class48) argument_4_).aByte354) {
	    for (int anLocalInt = 0;
		 anLocalInt < DoublyLinkedNode_Sub51_Sub8.anIntArray6263.length;
		 anLocalInt++) {
		if (DoublyLinkedNode_Sub51_Sub8.anIntArray6263[anLocalInt] != -1000000
		    && ((DoublyLinkedNode_Sub51_Sub8.anIntArray6263[anLocalInt]
			 >= ((Class48) argument_4_).anIntArray348[0])
			|| (DoublyLinkedNode_Sub51_Sub8.anIntArray6263[anLocalInt]
			    >= ((Class48) argument_4_).anIntArray348[1])
			|| (((Class48) argument_4_).anIntArray348[2]
			    <= DoublyLinkedNode_Sub51_Sub8.anIntArray6263[anLocalInt])
			|| (((Class48) argument_4_).anIntArray348[3]
			    <= DoublyLinkedNode_Sub51_Sub8.anIntArray6263[anLocalInt]))
		    && ((Class368_Sub3.anIntArray5728[anLocalInt]
			 >= ((Class48) argument_4_).anIntArray347[0])
			|| (Class368_Sub3.anIntArray5728[anLocalInt]
			    >= ((Class48) argument_4_).anIntArray347[1])
			|| (Class368_Sub3.anIntArray5728[anLocalInt]
			    >= ((Class48) argument_4_).anIntArray347[2])
			|| (Class368_Sub3.anIntArray5728[anLocalInt]
			    >= ((Class48) argument_4_).anIntArray347[3]))
		    && ((((Class48) argument_4_).anIntArray347[0]
			 >= Class294.anIntArray2452[anLocalInt])
			|| (Class294.anIntArray2452[anLocalInt]
			    <= ((Class48) argument_4_).anIntArray347[1])
			|| (Class294.anIntArray2452[anLocalInt]
			    <= ((Class48) argument_4_).anIntArray347[2])
			|| (Class294.anIntArray2452[anLocalInt]
			    <= ((Class48) argument_4_).anIntArray347[3]))
		    && ((((Class48) argument_4_).anIntArray345[0]
			 <= Node_Sub43.anIntArray4229[anLocalInt])
			|| (Node_Sub43.anIntArray4229[anLocalInt]
			    >= ((Class48) argument_4_).anIntArray345[1])
			|| (((Class48) argument_4_).anIntArray345[2]
			    <= Node_Sub43.anIntArray4229[anLocalInt])
			|| (((Class48) argument_4_).anIntArray345[3]
			    <= Node_Sub43.anIntArray4229[anLocalInt]))
		    && ((((Class48) argument_4_).anIntArray345[0]
			 >= Node_Sub47_Sub12.anIntArray6214[anLocalInt])
			|| (((Class48) argument_4_).anIntArray345[1]
			    >= Node_Sub47_Sub12.anIntArray6214[anLocalInt])
			|| (Node_Sub47_Sub12.anIntArray6214[anLocalInt]
			    <= ((Class48) argument_4_).anIntArray345[2])
			|| (Node_Sub47_Sub12.anIntArray6214[anLocalInt]
			    <= ((Class48) argument_4_).anIntArray345[3])))
		    return;
	    }
	}
	if (((Class48) argument_4_).aByte341 == 1) {
	    int anLocalInt
		= Node_Sub35.anInt4158 + (((Class48) argument_4_).aShort352
					     - Class189_Sub2.anInt5642);
	    if (anLocalInt >= 0
		&& (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
		    >= anLocalInt)) {
		int anLocalInt_6_
		    = -Class311.anInt2592 + (((Class48) argument_4_).aShort353
					     + Node_Sub35.anInt4158);
		if (anLocalInt_6_ < 0)
		    anLocalInt_6_ = 0;
		else if (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
			 < anLocalInt_6_)
		    return;
		int anLocalInt_7_ = (Node_Sub35.anInt4158
				     + (-Class311.anInt2592
					+ ((Class48) argument_4_).aShort340));
		if (anLocalInt_7_
		    > Node_Sub35.anInt4158 + Node_Sub35.anInt4158)
		    anLocalInt_7_
			= Node_Sub35.anInt4158 + Node_Sub35.anInt4158;
		else if (anLocalInt_7_ < 0)
		    return;
		boolean anLocalBoolean = false;
		while (anLocalInt_6_ <= anLocalInt_7_) {
		    if (Class242.aBooleanArrayArray1757[anLocalInt]
			[anLocalInt_6_++]) {
			anLocalBoolean = true;
			break;
		    }
		}
		if (anLocalBoolean) {
		    float f
			= (float) (Class320.anInt2635
				   - ((Class48) argument_4_).anIntArray347[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!(f < (float) Class101.anInt822)
			&& Class234.method3108(0, 93, argument_4_)
			&& Class234.method3108(1, 93, argument_4_)
			&& Class234.method3108(2, -102, argument_4_)
			&& Class234.method3108(3, 77, argument_4_))
			Class245.aClass48Array1791[Class186.anInt1390++]
			    = argument_4_;
		}
	    }
	} else if (((Class48) argument_4_).aByte341 == 2) {
	    int anLocalInt = (((Class48) argument_4_).aShort353
			      - Class311.anInt2592 + Node_Sub35.anInt4158);
	    if (anLocalInt >= 0
		&& (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
		    >= anLocalInt)) {
		int anLocalInt_8_ = (-Class189_Sub2.anInt5642
				     + (((Class48) argument_4_).aShort352
					+ Node_Sub35.anInt4158));
		if (anLocalInt_8_ >= 0) {
		    if (anLocalInt_8_
			> Node_Sub35.anInt4158 + Node_Sub35.anInt4158)
			return;
		} else
		    anLocalInt_8_ = 0;
		int anLocalInt_9_ = (-Class189_Sub2.anInt5642
				     + ((Class48) argument_4_).aShort350
				     + Node_Sub35.anInt4158);
		if (anLocalInt_9_
		    <= Node_Sub35.anInt4158 + Node_Sub35.anInt4158) {
		    if (anLocalInt_9_ < 0)
			return;
		} else
		    anLocalInt_9_
			= Node_Sub35.anInt4158 + Node_Sub35.anInt4158;
		boolean anLocalBoolean = false;
		while (anLocalInt_9_ >= anLocalInt_8_) {
		    if (Class242.aBooleanArrayArray1757[anLocalInt_8_++]
			[anLocalInt]) {
			anLocalBoolean = true;
			break;
		    }
		}
		if (anLocalBoolean) {
		    float f
			= (float) (Class277.anInt2220
				   - ((Class48) argument_4_).anIntArray345[0]);
		    if (f < 0.0F)
			f *= -1.0F;
		    if (!((float) Class101.anInt822 > f)
			&& Class234.method3108(0, 73, argument_4_)
			&& Class234.method3108(1, -113, argument_4_)
			&& Class234.method3108(2, 125, argument_4_)
			&& Class234.method3108(3, 92, argument_4_))
			Class245.aClass48Array1791[Class186.anInt1390++]
			    = argument_4_;
		}
	    }
	} else if (((Class48) argument_4_).aByte341 == 16
		   || ((Class48) argument_4_).aByte341 == 8) {
	    int anLocalInt
		= (((Class48) argument_4_).aShort352
		   - (Class189_Sub2.anInt5642 - Node_Sub35.anInt4158));
	    if (anLocalInt >= 0
		&& (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
		    >= anLocalInt)) {
		int anLocalInt_10_ = (Node_Sub35.anInt4158
				      + (((Class48) argument_4_).aShort353
					 - Class311.anInt2592));
		if (anLocalInt_10_ >= 0
		    && (anLocalInt_10_
			<= Node_Sub35.anInt4158 + Node_Sub35.anInt4158)
		    && (Class242.aBooleanArrayArray1757[anLocalInt]
			[anLocalInt_10_])) {
		    float f
			= (float) (-((Class48) argument_4_).anIntArray347[0]
				   + Class320.anInt2635);
		    if (f < 0.0F)
			f *= -1.0F;
		    float f_11_
			= (float) (Class277.anInt2220
				   - ((Class48) argument_4_).anIntArray345[0]);
		    if (f_11_ < 0.0F)
			f_11_ *= -1.0F;
		    if ((!((float) Class101.anInt822 > f)
			 || !((float) Class101.anInt822 > f_11_))
			&& Class234.method3108(0, 113, argument_4_)
			&& Class234.method3108(1, -52, argument_4_)
			&& Class234.method3108(2, -95, argument_4_)
			&& Class234.method3108(3, -53, argument_4_))
			Class245.aClass48Array1791[Class186.anInt1390++]
			    = argument_4_;
		}
	    }
	} else if (((Class48) argument_4_).aByte341 == 4) {
	    float f = (float) (-Class252.anInt1977
			       + ((Class48) argument_4_).anIntArray348[0]);
	    if (!((float) Class262.anInt2043 >= f)) {
		int anLocalInt = (Node_Sub35.anInt4158
				  + (((Class48) argument_4_).aShort353
				     - Class311.anInt2592));
		if (anLocalInt < 0)
		    anLocalInt = 0;
		else if (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
			 < anLocalInt)
		    return;
		int anLocalInt_12_
		    = (-Class311.anInt2592 + ((Class48) argument_4_).aShort340
		       + Node_Sub35.anInt4158);
		if (anLocalInt_12_
		    > Node_Sub35.anInt4158 + Node_Sub35.anInt4158)
		    anLocalInt_12_
			= Node_Sub35.anInt4158 + Node_Sub35.anInt4158;
		else if (anLocalInt_12_ < 0)
		    return;
		int anLocalInt_13_ = (Node_Sub35.anInt4158
				      + ((Class48) argument_4_).aShort352
				      - Class189_Sub2.anInt5642);
		if (anLocalInt_13_ < 0)
		    anLocalInt_13_ = 0;
		else if (Node_Sub35.anInt4158 + Node_Sub35.anInt4158
			 < anLocalInt_13_)
		    return;
		int anLocalInt_14_ = (Node_Sub35.anInt4158
				      + (((Class48) argument_4_).aShort350
					 - Class189_Sub2.anInt5642));
		if (anLocalInt_14_
		    <= Node_Sub35.anInt4158 + Node_Sub35.anInt4158) {
		    if (anLocalInt_14_ < 0)
			return;
		} else
		    anLocalInt_14_
			= Node_Sub35.anInt4158 + Node_Sub35.anInt4158;
		boolean anLocalBoolean = false;
	    while_91_:
		for (int anLocalInt_15_ = anLocalInt_13_;
		     anLocalInt_14_ >= anLocalInt_15_; anLocalInt_15_++) {
		    for (int anLocalInt_16_ = anLocalInt;
			 anLocalInt_16_ <= anLocalInt_12_; anLocalInt_16_++) {
			if (Class242.aBooleanArrayArray1757[anLocalInt_15_]
			    [anLocalInt_16_]) {
			    anLocalBoolean = true;
			    break while_91_;
			}
		    }
		}
		if (anLocalBoolean && Class234.method3108(0, -84, argument_4_)
		    && Class234.method3108(1, 73, argument_4_)
		    && Class234.method3108(2, -34, argument_4_)
		    && Class234.method3108(3, -124, argument_4_))
		    Class245.aClass48Array1791[Class186.anInt1390++]
			= argument_4_;
	    }
	}
    }
    
    final DoublyLinkedNode_Sub51_Sub6 method3754(int argument_17_, int argument_18_) {
	DoublyLinkedNode_Sub51_Sub6 class59_sub51_sub6;
	synchronized (aClass149_2749) {
	    if (argument_17_ != -4849)
		method3750(-122);
	    class59_sub51_sub6
		= ((DoublyLinkedNode_Sub51_Sub6)
		   aClass149_2749.get((long) argument_18_));
	    if (class59_sub51_sub6 == null) {
		class59_sub51_sub6 = new DoublyLinkedNode_Sub51_Sub6(argument_18_);
		aClass149_2749.put(class59_sub51_sub6, (long) argument_18_);
	    }
	    if (!class59_sub51_sub6.method1208((byte) -61))
		return null;
	}
	return class59_sub51_sub6;
    }
    
    final void method3755(byte argument_19_) {
	synchronized (aClass149_2747) {
	    aClass149_2747.clear((byte) -3);
	}
	synchronized (aClass149_2749) {
	    aClass149_2749.clear((byte) -3);
	}
    }
    
    static final void method3756(boolean argument, int argument_20_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(5, 13175,
            (long) argument_20_);
	class59_sub51_sub3.method1181(585134072);
    }
    
    static final void method3757(byte argument, int argument_21_) {
	Class316.anInt2617 = 0;
	Class281.anInt2272 = -1;
	Statics.anInt5035 = 1;
	Statics.aBoolean4155 = false;
	Class350_Sub1.aJs5Store_5432 = null;
	Class256_Sub3.aClass59_Sub9_Sub2_5631 = null;
	Statics.anInt3525 = -1;
	DoublyLinkedNode_Sub51_Sub16.anInt6324 = argument_21_;
    }
    
    final Class367 method3758(int argument_22_, int argument_23_) {
	Class367 class367;
	synchronized (aClass149_2747) {
	    class367
		= (Class367) aClass149_2747.get((long) argument_22_);
	}
	if (class367 != null)
	    return class367;
	byte[] anLocalInts;
	synchronized (aJs5Store_2746) {
	    anLocalInts
		= aJs5Store_2746.getData(Class183.method2853(argument_22_, false), Class338.method3775((byte) 28, argument_22_));
	}
	class367 = new Class367();
	((Class367) class367).aClass336_3095 = this;
	((Class367) class367).anInt3104 = argument_22_;
	if (anLocalInts != null)
	    class367.method3995(new Packet(anLocalInts), -59);
	class367.method3999(-29692);
	synchronized (aClass149_2747) {
	    aClass149_2747.put(class367, (long) argument_22_);
	}
	return class367;
    }
    
    Class336(GameEnum argument_24_, int argument_25_, Js5Store argument_26_,
	     Js5Store argument_27_, Js5Store argument_28_) {
	aJs5Store_2746 = argument_26_;
	if (aJs5Store_2746 != null) {
	    int anLocalInt = aJs5Store_2746.getRealSubFileCount() - 1;
	    aJs5Store_2746.getSubFileCount(anLocalInt);
	}
	Class87.method1635(2, argument_28_, (byte) -32, argument_27_);
    }
}
