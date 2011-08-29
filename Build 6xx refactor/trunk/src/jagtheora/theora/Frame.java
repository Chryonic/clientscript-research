/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer
{
    public int anInt5536;
    public int[] anIntArray5537;
    public int anInt5538;
    
    private static final native void init();
    
    protected final native void clear();
    
    public Frame(int argument_0_, int argument_1_) {
	anInt5536 = argument_0_;
	anInt5538 = argument_1_;
	anIntArray5537 = new int[anInt5536 * anInt5538];
    }
    
    static {
	init();
    }
}
