/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145
{
    private Js5Store aJs5Store_1104;
    private Class348 aClass348_1107;
    private Js5Store aJs5Store_1108;
    
    final Interface14 method2516(Interface18 argument_0_) {
	if (argument_0_ == null)
	    return null;
	Class128 class128 = argument_0_.method68((byte) -103);
	if (class128 == Statics.aClass128_859)
	    return new Class305((Class10) argument_0_);
	if (class128 == Class84.aClass128_599)
	    return new Class263(method2519(80), (Class184) argument_0_);
	if (DoublyLinkedNode_Sub51_Sub1.aClass128_6219 == class128)
	    return new Class154(aJs5Store_1108, (Class214) argument_0_);
	if (class128 == Node_Sub31_Sub31.aClass128_5995)
	    return new Class154_Sub1(aJs5Store_1108,
				     (Class214_Sub1) argument_0_);
	if (Node_Sub15.aClass128_3992 == class128)
	    return new Class189_Sub2(aJs5Store_1108, aJs5Store_1104,
				     (Class253_Sub2) argument_0_);
	if (class128 == Class_aa_Sub1.aClass128_3747)
	    return new Class189_Sub1(aJs5Store_1108, aJs5Store_1104,
				     (Class253_Sub3) argument_0_);
	if (Class245_Sub1_Sub1.aClass128_6511 == class128)
	    return new Class189_Sub3(aJs5Store_1108, aJs5Store_1104,
				     (Class253_Sub1) argument_0_);
	if (Class276.aClass128_2211 == class128)
	    return new Class285(aJs5Store_1108, aJs5Store_1104,
				(Class156) argument_0_);
	if (class128 == Class107.aClass128_874)
	    return new Class134(aJs5Store_1108, (Class150) argument_0_);
	if (Class28.aClass128_203 == class128)
	    return new Class189_Sub3_Sub1(aJs5Store_1108, aJs5Store_1104,
					  (Class253_Sub1_Sub1) argument_0_);
	return null;
    }

    private final Class348 method2519(int argument_3_) {
	if (aClass348_1107 == null)
	    aClass348_1107 = new Class348();
	return aClass348_1107;
    }

    Class145(Js5Store argument_12_, Js5Store argument_13_) {
	    aJs5Store_1108 = argument_12_;
	    aJs5Store_1104 = argument_13_;
    }
}
