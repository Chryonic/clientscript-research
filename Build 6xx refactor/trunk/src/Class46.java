/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class46
{
    static final short[] method433(int argument, short[] argument_0_) {
	if (argument_0_ == null)
	    return null;
	short[] anLocalInts = new short[argument_0_.length];
	JagStrings.memcpy(argument_0_, 0, anLocalInts, 0, argument_0_.length);
	return anLocalInts;
    }
    
    static final long method434(int argument, Interface2 argument_1_,
				int argument_2_, int argument_3_) {
	long l = 4194304L;
	long l_4_ = -9223372036854775808L;
	Class266 class266
	    = Node_Sub31_Sub30.aClass257_5983
		  .method3298((byte) 67, argument_1_.method7(-23356));
	long l_5_ = (long) (argument_2_ | argument_3_ << 7
			    | argument_1_.method2(argument ^ ~0x2a9b) << 14
			    | argument_1_.method3(argument - 2132) << 20
			    | 0x40000000);
	if (((Class266) class266).anInt2123 == argument)
	    l_5_ |= l_4_;
	if (((Class266) class266).anInt2092 == 1)
	    l_5_ |= l;
	l_5_ |= (long) argument_1_.method7(-23356) << 32;
	return l_5_;
    }
    
    static final boolean method435(int argument, int argument_6_,
				   int argument_7_) {
	if ((argument_7_ & 0x100) == 0)
	    return false;
	return true;
    }
}
