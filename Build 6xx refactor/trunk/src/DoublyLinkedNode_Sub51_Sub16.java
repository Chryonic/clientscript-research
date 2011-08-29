/* Class59_Sub51_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DoublyLinkedNode_Sub51_Sub16 extends DoublyLinkedNode
{
    Class66 aClass66_6321;
    private int[] anIntArray6322;
    boolean aBoolean6323 = true;
    static int anInt6324;
    int[] anIntArray6325;
    private String[] aStringArray6326;
    private int[][] anIntArrayArray6327;
    
    final void method1275(int argument_0_) {
	if (((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325 != null) {
	    for (int anLocalInt = 0;
		 (((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325.length
		  > anLocalInt);
		 anLocalInt++)
		((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325[anLocalInt]
		    = MathStatics.OR((((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325[anLocalInt]), 32768);
	}
    }
    
    final int method1276(byte argument_1_) {
	if (anIntArray6322 == null)
	    return 0;
	return anIntArray6322.length;
    }
    
    private final void method1277(Packet argument_2_, int argument_3_,
				  int argument_4_) {
	if (argument_4_ != 1) {
	    if (argument_4_ == 2) {
		int anLocalInt
		    = argument_2_.g1();
		((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325
		    = new int[anLocalInt];
		for (int anLocalInt_5_ = 0; anLocalInt_5_ < anLocalInt;
		     anLocalInt_5_++)
		    ((DoublyLinkedNode_Sub51_Sub16) this).anIntArray6325[anLocalInt_5_]
			= argument_2_.g2();
	    } else if (argument_4_ == 3) {
		int anLocalInt = argument_2_.g1();
		anIntArray6322 = new int[anLocalInt];
		anIntArrayArray6327 = new int[anLocalInt][];
		for (int anLocalInt_6_ = 0; anLocalInt_6_ < anLocalInt;
		     anLocalInt_6_++) {
		    int anLocalInt_7_ = argument_2_.g2();
		    Class217 class217
			= Class177.method2794(true, anLocalInt_7_);
		    if (class217 != null) {
			anIntArray6322[anLocalInt_6_] = anLocalInt_7_;
			anIntArrayArray6327[anLocalInt_6_]
			    = new int[((Class217) class217).anInt1525];
			for (int anLocalInt_8_ = 0;
			     anLocalInt_8_ < ((Class217) class217).anInt1525;
			     anLocalInt_8_++)
			    anIntArrayArray6327[anLocalInt_6_][anLocalInt_8_]
				= argument_2_.g2();
		    }
		}
	    } else if (argument_4_ == 4)
		((DoublyLinkedNode_Sub51_Sub16) this).aBoolean6323 = false;
	} else
	    aStringArray6326
		= JagexStringUtils.split(argument_2_.gstr(), argument_3_ ^ ~0x7876, '<');
	if (argument_3_ != -30839)
	    method1282(null, -96);
    }
    
    final String method1278(int argument_9_) {
	StringBuffer stringbuffer = new StringBuffer(argument_9_);
	if (aStringArray6326 == null)
	    return "";
	stringbuffer.append(aStringArray6326[0]);
	for (int anLocalInt = 1; anLocalInt < aStringArray6326.length;
	     anLocalInt++) {
	    stringbuffer.append("...");
	    stringbuffer.append(aStringArray6326[anLocalInt]);
	}
	return stringbuffer.toString();
    }
    
    final String method1279(Packet argument_10_, int argument_11_) {
	StringBuffer stringbuffer = new StringBuffer(80);
	if (anIntArray6322 != null) {
	    for (int anLocalInt = 0; anLocalInt < anIntArray6322.length;
		 anLocalInt++) {
		stringbuffer.append(aStringArray6326[anLocalInt]);
		stringbuffer.append(((DoublyLinkedNode_Sub51_Sub16) this)
					.aClass66_6321.method1492
				    (anIntArrayArray6327[anLocalInt],
				     (byte) -92, method1283(0, anLocalInt),
				     (argument_10_.gd
                             (
                                     (((Class217)
                                             Class177.method2794(true,
                                                     (anIntArray6322
                                                             [anLocalInt])))
                                             .anInt1531)))));
	    }
	}
	stringbuffer.append(aStringArray6326[aStringArray6326.length - 1]);
	return stringbuffer.toString();
    }
    
    final int method1280(int argument_12_, int argument_13_,
			 int argument_14_) {
	if (anIntArray6322 == null || argument_14_ < 0
	    || argument_14_ > anIntArray6322.length)
	    return -1;
	if (anIntArrayArray6327[argument_14_] == null || argument_12_ < 0
	    || anIntArrayArray6327[argument_14_].length < argument_12_)
	    return -1;
	return anIntArrayArray6327[argument_14_][argument_12_];
    }
    
    final void method1281(Packet argument_15_, int[] argument_16_,
			  int argument_17_) {
	if (anIntArray6322 != null) {
	    int anLocalInt = 0;
	while_226_:
	    do {
		for (;;) {
		    if (anLocalInt >= anIntArray6322.length)
			break while_226_;
		    if (anLocalInt >= argument_16_.length)
			break;
		    int anLocalInt_18_
			= ((Class217) method1283(0, anLocalInt)).anInt1526;
		    if (anLocalInt_18_ > 0)
			argument_15_.pd(anLocalInt_18_,
                    (long) argument_16_[anLocalInt]
            );
		    anLocalInt++;
		}
		break;
	    } while (false);
	}
    }
    
    final void method1282(Packet argument_19_, int argument_20_) {
	for (;;) {
	    int anLocalInt = argument_19_.g1();
	    if (anLocalInt == 0)
		break;
	    method1277(argument_19_, -30839, anLocalInt);
	}
    }
    
    final Class217 method1283(int argument_21_, int argument_22_) {
	if (anIntArray6322 == null || argument_22_ < 0
	    || argument_22_ > anIntArray6322.length)
	    return null;
	return Class177.method2794(true, anIntArray6322[argument_22_]);
    }
    
    public DoublyLinkedNode_Sub51_Sub16() {
	/* empty */
    }
}
