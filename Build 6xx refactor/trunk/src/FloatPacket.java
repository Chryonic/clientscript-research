/* Class59_Sub28_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;

final class FloatPacket extends Packet
{
    static Class166 aClass166_5833 = new Class166(85, -2);
    static int[] anIntArray5834;
    
    public static void method851(int argument) {
	anIntArray5834 = null;
	aClass166_5833 = null;
    }
    
    static final Class143 method852(byte argument) {
	try {
	    return (Class143) Class.forName("Class143_Sub1").newInstance();
	} catch (Throwable throwable) {
	    return null;
	}
    }
    
    FloatPacket(int argument_0_) {
	super(argument_0_);
    }
    
    final void pfloat(float argument_2_) {
	int anLocalInt = Stream.floatToRawIntBits(argument_2_);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 24);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 16);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 8);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) anLocalInt;
    }
    
    final void ipfloat(float argument_4_) {
	int anLocalInt = Stream.floatToRawIntBits(argument_4_);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) anLocalInt;
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 8);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 16);
	((Packet) this).data
	    [((Packet) this).pos++]
	    = (byte) (anLocalInt >> 24);
    }
}
