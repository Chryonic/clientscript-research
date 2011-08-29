/* jagmisc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.jagmisc;

public class jagmisc
{
    public static native long getAvailablePhysicalMemory();
    
    public static native long nanoTime();
    
    public static void quit() {
	Quit0();
    }
    
    private static native void Quit0();
    
    public static native long getTotalPhysicalMemory();
    
    private static native int ping0(byte argument, byte argument_0_,
				    byte argument_1_, byte argument_2_,
				    long argument_3_);
    
    public static native boolean init();
    
    public static int ping(byte argument, byte argument_4_,
                           byte argument_5_, byte argument_6_,
                           long argument_7_) throws Throwable {
	int anLocalInt = ping0(argument, argument_4_, argument_5_, argument_6_,
			       argument_7_);
	if (anLocalInt < 0)
	    throw new Exception(String.valueOf(anLocalInt));
	return anLocalInt;
    }
}
