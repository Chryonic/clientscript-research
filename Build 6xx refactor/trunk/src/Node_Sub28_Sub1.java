/* Class59_Sub28_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub28_Sub1 extends Packet
{
    private int anInt5828;
    private Class372 aClass372_5829;
    static Class166 aClass166_5830 = new Class166(14, 4);
    static String[] aStringArray5831 = new String[8];

    static final void method838(RsInterface argument, int argument_0_) {
	if (((RsInterface) argument).type == 5
	    && ((RsInterface) argument).anInt1870 != -1)
	    Class62_Sub3.method1358(Class389.aGraphicsToolkit3281, argument, false);
    }
    
    final void method839(byte argument_1_, int[] argument_2_) {
	aClass372_5829 = new Class372(argument_2_);
    }
    
    final void method840(int argument_3_, int argument_4_) {
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (aClass372_5829.method4070(-112) + argument_4_);
    }
    
    Node_Sub28_Sub1(int argument_5_) {
	super(argument_5_);
    }
    
    final void method841(int argument_6_) {
	((Packet) this).pos = (anInt5828 + 7) / 8;
    }
    
    final boolean method842(int argument_7_) {
	int anLocalInt = (((((Packet) this).data
			    [((Packet) this).pos])
			   - aClass372_5829.method4068(86))
			  & 0xff);
	if (anLocalInt < 128)
	    return false;
	return true;
    }
    
    final int method843(int argument_8_, int argument_9_) {
	return -anInt5828 + argument_8_ * 8;
    }
    
    final int method844(int argument_10_) {
	int anLocalInt = (((((Packet) this).data
			    [((Packet) this).pos++])
			   - aClass372_5829.method4070(-76))
			  & 0xff);
	if (anLocalInt < 128)
	    return anLocalInt;
	return ((anLocalInt - 128 << 8)
		+ (((((Packet) this).data
		     [((Packet) this).pos++])
		    - aClass372_5829.method4070(-50))
		   & 0xff));
    }
    
    final void method845(Class372 argument_11_, int argument_12_) {
	aClass372_5829 = argument_11_;
    }
    
    static final void method846() {
	for (int anLocalInt = 0; anLocalInt < Class51.anInt383; anLocalInt++) {
	    DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2
		= DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522[anLocalInt];
	    Class189_Sub1.method2874(class104_sub2_sub2, true);
	    DoublyLinkedNodeP2_Sub3.aClass104_Sub2_Sub2Array4522[anLocalInt] = null;
	}
	Class51.anInt383 = 0;
    }
    
    final void method847(boolean argument_13_) {
	anInt5828 = ((Packet) this).pos * 8;
    }
    
    final void method848(int argument_14_, int argument_15_, byte argument_16_,
			 byte[] argument_17_) {
	for (int anLocalInt = 0; anLocalInt < argument_14_; anLocalInt++)
	    argument_17_[anLocalInt + argument_15_]
		= (byte) ((((Packet) this).data
			   [((Packet) this).pos++])
			  - aClass372_5829.method4070(-122));
    }
    
    public static void method849(byte argument) {
	aClass166_5830 = null;
	aStringArray5831 = null;
    }
    
    final int method850(int argument_18_, int argument_19_) {
	int anLocalInt = anInt5828 >> 3;
	int anLocalInt_20_ = -(anInt5828 & 0x7) + 8;
	int anLocalInt_21_ = 0;
	anInt5828 += argument_19_;
	for (/**/; argument_19_ > anLocalInt_20_; anLocalInt_20_ = 8) {
	    anLocalInt_21_
		+= ((((Packet) this).data[anLocalInt++]
		     & Class159.anIntArray3675[anLocalInt_20_])
		    << -anLocalInt_20_ + argument_19_);
	    argument_19_ -= anLocalInt_20_;
	}
	if (argument_19_ == anLocalInt_20_)
	    anLocalInt_21_
		+= (((Packet) this).data[anLocalInt]
		    & Class159.anIntArray3675[anLocalInt_20_]);
	else
	    anLocalInt_21_
		+= ((((Packet) this).data[anLocalInt]
		     >> -argument_19_ + anLocalInt_20_)
		    & Class159.anIntArray3675[argument_19_]);
	return anLocalInt_21_;
    }
}
