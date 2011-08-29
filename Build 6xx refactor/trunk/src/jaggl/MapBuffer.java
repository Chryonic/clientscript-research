/* NativeBuffer_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;
import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer
{
    private int anInt5736;
    
    public final void put(byte[] argument_0_, int argument_1_, int argument_2_, int argument_3_) {
	if (anInt5736 == 0)
	    throw new RuntimeException();
	super.put(argument_0_, argument_1_, argument_2_, argument_3_);
    }
    
    public final boolean method4153() {
	if (anInt5736 == 0)
	    return false;
	return true;
    }
    
    public final boolean method4154() {
	boolean anLocalBoolean = true;
	if (anInt5736 != 0) {
	    anLocalBoolean = OpenGL.glUnmapBufferARB(anInt5736);
	    this.method4152(0L, 0);
	    anInt5736 = 0;
	}
	return anLocalBoolean;
    }
    
    public final boolean method4155(int argument_4_, int argument_5_,
				    int argument_6_) {
	if (anInt5736 != 0)
	    return false;
	long l = OpenGL.glMapBufferARB(argument_4_, argument_6_);
	if (l == 0L)
	    return false;
	this.method4152(l, argument_5_);
	anInt5736 = argument_4_;
	return true;
    }
}
