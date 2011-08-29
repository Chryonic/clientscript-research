/* Class183_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class183_Sub1 extends Class183
{
    private ByteBuffer aByteBuffer5272;

    static final Object wrap(byte[] argument, boolean argument_4_, int argument_5_) {
	if (argument == null)
	    return null;
	if ((argument.length ^ 0xffffffff) < argument_5_
	    && !Class387.aBoolean3270) {
	    try {
		Class183 class183
		    = (Class183) Class.forName("Class183_Sub1").newInstance();
		class183.method2849(13, argument);
		return class183;
	    } catch (Throwable throwable) {
		Class387.aBoolean3270 = true;
	    }
	}
	if (argument_4_)
	    return Class2_Sub8.method210((byte) 100, argument);
	return argument;
    }

    static final byte[] unwrap(Object argument, boolean argument_0_, int argument_1_) {
	if (argument == null)
	    return null;
	if (argument instanceof byte[]) {
	    byte[] anLocalInts = (byte[]) argument;
	    if (argument_0_)
		return Class2_Sub8.method210((byte) 121, anLocalInts);
	    return anLocalInts;
	}
	if (argument instanceof Class183) {
	    Class183 class183 = (Class183) argument;
	    return class183.method2852(-103);
	}
	throw new IllegalArgumentException();
    }

    final void method2849(int argument_0_, byte[] argument_1_) {
	if (argument_0_ != 13)
	    aByteBuffer5272 = null;
	aByteBuffer5272 = ByteBuffer.allocateDirect(argument_1_.length);
	aByteBuffer5272.position(0);
	aByteBuffer5272.put(argument_1_);
    }
    
    final byte[] method2852(int argument_2_) {
	byte[] anLocalInts = new byte[aByteBuffer5272.capacity()];
	aByteBuffer5272.position(0);
	aByteBuffer5272.get(anLocalInts);
	if (argument_2_ > -83)
	    aByteBuffer5272 = null;
	return anLocalInts;
    }
    
    final byte[] method2851(int argument_3_, int argument_4_,
			    int argument_5_) {
	byte[] anLocalInts = new byte[argument_3_];
	int anLocalInt = -19 / ((argument_5_ + 73) / 34);
	aByteBuffer5272.position(argument_4_);
	aByteBuffer5272.get(anLocalInts, 0, argument_3_);
	return anLocalInts;
    }
}
