/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer
{
    public int anInt5540;
    public int anInt5541;
    public int anInt5542;
    public int anInt5543;
    public int anInt5544;
    public byte aByte5545;
    public int anInt5546;
    public int anInt5547;
    public byte aByte5548;
    public byte aByte5549;
    public int anInt5550;
    public int anInt5551;
    public int anInt5552;
    public int anInt5553;
    public int anInt5554;
    
    protected final native void clear();
    
    private static final native void initFields();
    
    private final native void init();
    
    public TheoraInfo() {
	init();
	if (this.method4214())
	    throw new IllegalStateException();
    }
    
    static {
	initFields();
    }
}
