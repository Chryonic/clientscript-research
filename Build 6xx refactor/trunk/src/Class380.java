/* Class380 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class380 implements Runnable
{
    private int anInt3230;
    private volatile boolean aBoolean3231;
    private HardwareLight[] aClass59_Sub3Array3232;
    private volatile boolean aBoolean3233 = true;
    private GraphicsToolkit aGraphicsToolkit3234;
    private long aLong3235;
    private int[] anIntArray3236;
    private Class130 aClass130_3237;
    private volatile boolean aBoolean3238;
    
    final void method4099(Class130 argument_0_) {
	if (aClass130_3237 != null)
	    aClass130_3237.method2428(null, (byte) 80);
	aClass130_3237 = argument_0_;
	if (aClass130_3237 != null)
	    aClass130_3237.method2428(this, (byte) 120);
    }
    
    final long method4100() {
	return aLong3235;
    }
    
    public final void run() {
	while (aBoolean3238)
	    method4105();
    }
    
    final void method4101() {
	aBoolean3233 = false;
	synchronized (this) {
	    this.notify();
	}
    }
    
    final void method4102() {
	aBoolean3233 = false;
	aBoolean3238 = false;
	synchronized (this) {
	    this.notify();
	}
    }
    
    final boolean method4103() {
	if (aClass130_3237 != null
	    && (aBoolean3231 || !aClass130_3237.method2432(-1)))
	    return false;
	return true;
    }
    
    final void method4104() {
	aBoolean3233 = true;
	synchronized (this) {
	    this.notify();
	}
    }
    
    private final void method4105() {
	aGraphicsToolkit3234.assignThread(anInt3230);
	while (!aBoolean3233 && aBoolean3238) {
	    if (aClass130_3237 != null && !aClass130_3237.method2432(-1)) {
		aBoolean3231 = true;
		DoublyLinkedNodeP2 class104 = aClass130_3237.method2429((byte) 98);
		if (class104 instanceof DoublyLinkedNodeP2_Sub2) {
		    DoublyLinkedNodeP2_Sub2 class104_sub2 = (DoublyLinkedNodeP2_Sub2) class104;
		    if (((DoublyLinkedNodeP2_Sub2) class104_sub2).aBoolean4508)
			class104_sub2.method1773((byte) 84,
						 (DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
						  .aGraphicsToolkit6834));
		    else {
			LightingManager.method3620(class104_sub2, aClass59_Sub3Array3232);
			if (Class1.aAbstractFont_3510 != null)
			    Class1.aAbstractFont_3510.method507
				((byte) 56,
				 ((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4514,
				 -16777216,
				 ((Class130) aClass130_3237).aString1051, -256,
				 ((DoublyLinkedNodeP2_Sub2) class104_sub2).anInt4510);
		    }
		} else {
		    int anLocalInt
			= ((DoublyLinkedNodeP2_Sub3) (DoublyLinkedNodeP2_Sub3) class104).anInt4524;
		    if (anLocalInt >= 1 && anLocalInt <= 4) {
			Class_s class_s = (Node_Sub31_Sub5.aClass_sArray5858
					   [anLocalInt - 1]);
			for (int anLocalInt_1_ = 0;
			     anLocalInt_1_ < (Node_Sub35.anInt4158
					      + Node_Sub35.anInt4158);
			     anLocalInt_1_++) {
			    for (int anLocalInt_2_ = 0;
				 anLocalInt_2_ < (Node_Sub35.anInt4158
						  + Node_Sub35.anInt4158);
				 anLocalInt_2_++) {
				if (Class62_Sub22.aBooleanArrayArrayArray4435
				    [anLocalInt - 1][anLocalInt_1_]
				    [anLocalInt_2_]) {
				    int anLocalInt_3_
					= (Class189_Sub2.anInt5642
					   - Node_Sub35.anInt4158
					   + anLocalInt_1_);
				    int anLocalInt_4_
					= (Class311.anInt2592
					   - Node_Sub35.anInt4158
					   + anLocalInt_2_);
				    if (anLocalInt_3_ >= 0
					&& (anLocalInt_3_
					    < ((Class_s) class_s).anInt2550)
					&& anLocalInt_4_ >= 0
					&& (anLocalInt_4_
					    < ((Class_s) class_s).anInt2549)) {
					DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1
					    .aGraphicsToolkit6834.H
					    ((anLocalInt_3_
					      << LightingManager.lightCoordRShift),
					     class_s.method3534(anLocalInt_3_,
								false,
								anLocalInt_4_),
					     (anLocalInt_4_
					      << LightingManager.lightCoordRShift),
					     anIntArray3236);
					if (Exception_Sub1
						.method140(anIntArray3236[0])
					    == anInt3230 - 1)
					    class_s.method3540(anLocalInt_3_,
							       anLocalInt_4_);
				    }
				}
			    }
			}
		    }
		}
	    } else {
		aBoolean3231 = false;
		aLong3235 = Class350_Sub2.aClass75_5451.method1550((byte) 9);
		synchronized (this) {
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	}
	aGraphicsToolkit3234.method2043(anInt3230);
	while (aBoolean3233 && aBoolean3238) {
	    synchronized (this) {
		try {
		    this.wait();
		} catch (InterruptedException interruptedexception) {
		    /* empty */
		}
	    }
	}
    }
    
    Class380(int argument_5_, GraphicsToolkit argument_6_) {
	aClass59_Sub3Array3232 = new HardwareLight[8];
	anIntArray3236 = new int[3];
	aBoolean3238 = true;
	aBoolean3231 = false;
	anInt3230 = argument_5_;
	aGraphicsToolkit3234 = argument_6_;
    }
}
