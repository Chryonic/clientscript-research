/* Class62_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62_Sub21 extends Class62
{
    static int anInt4432;
    static int anInt4433 = 0;
    
    final int method1342(int argument_0_, byte argument_1_) {
	int anLocalInt = 68 / ((-53 - argument_1_) / 50);
	return 1;
    }
    
    final int method1440(int argument_2_) {
	return ((Class62) this).anInt441;
    }
    
    final void method1343(int argument_3_, byte argument_4_) {
	((Class62) this).anInt441 = argument_3_;
	if (argument_4_ != -107)
	    method1444(52);
    }
    
    final int method1344(byte argument_5_) {
	if (argument_5_ != 4)
	    return 86;
	return 0;
    }
    
    static final void method1441(Node argument, int argument_6_,
				 Node argument_7_) {
	if (((Node) argument).prev != null)
	    argument.unlink();
	((Node) argument).next = argument_7_;
	((Node) argument).prev
	    = ((Node) argument_7_).prev;
	((Node) ((Node) argument).prev).next = argument;
	((Node) ((Node) argument).next).prev = argument;
    }
    
    Class62_Sub21(Node_Sub50 argument_8_) {
	super(argument_8_);
    }
    
    static final void method1442(byte argument, int argument_9_,
				 int argument_10_) {
	if (RsInterface.isAvailable(argument_10_))
	    DoublyLinkedNode_Sub51_Sub11.method1248(-10943, argument_9_, (RsInterface.anInterfaces[argument_10_]));
    }
    
    final void method1346(boolean argument_11_) {
	if (((Class62) this).anInt441 < 0 || ((Class62) this).anInt441 > 4)
	    ((Class62) this).anInt441 = method1344((byte) 4);
	if (argument_11_)
	    anInt4432 = 113;
    }
    
    static final int method1443(int argument, int argument_12_,
				boolean argument_13_, boolean argument_14_,
				int argument_15_) {
	Node_Sub5 class59_sub5
	    = Class365.method3969((byte) 21, argument_12_, argument_13_);
	if (class59_sub5 == null)
	    return 0;
	int anLocalInt = argument_15_;
	for (int anLocalInt_16_ = 0;
	     (((Node_Sub5) class59_sub5).anIntArray3897.length
	      > anLocalInt_16_);
	     anLocalInt_16_++) {
	    if ((((Node_Sub5) class59_sub5).anIntArray3897[anLocalInt_16_]
		 >= 0)
		&& (((Class365) Class253_Sub1_Sub1.aClass365_6632).anInt3071
		    > (((Node_Sub5) class59_sub5).anIntArray3897
		       [anLocalInt_16_]))) {
		Class371 class371
		    = (Class253_Sub1_Sub1.aClass365_6632.method3975
		       (argument_15_ - 4, (((Node_Sub5) class59_sub5)
					   .anIntArray3897[anLocalInt_16_])));
		int anLocalInt_17_
		    = class371.method4053((((Class315)
					    Class62_Sub27.aClass362_4457
						.method3960(true, argument))
					   .anInt2607),
					  argument, argument_15_ - 1);
		if (argument_14_)
		    anLocalInt += (((Node_Sub5) class59_sub5).anIntArray3895
				   [anLocalInt_16_]) * anLocalInt_17_;
		else
		    anLocalInt += anLocalInt_17_;
	    }
	}
	return anLocalInt;
    }
    
    Class62_Sub21(int argument_18_, Node_Sub50 argument_19_) {
	super(argument_18_, argument_19_);
    }
    
    static final boolean method1444(int argument) {
	if (Statics.anInt5035 != 0)
	    return true;
	return GlTexture_Sub4_Sub1.aClass59_Sub9_Sub2_6546
		   .method602((byte) 122);
    }
}
