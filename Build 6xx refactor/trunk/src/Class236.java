/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class236
{
    int anInt1720;
    String aString1721;
    
    static final void method3116(int argument) {
	Class126.anInt1032 = Class2_Sub8.anInt3803 = Class233.anInt1696
	    = Node_Sub1.anInt3870 = 0;
    }
    
    final Socket method3117(boolean argument_0_) throws IOException {
	return new Socket(((Class236) this).aString1721,
			  ((Class236) this).anInt1720);
    }
    
    public Class236() {
	/* empty */
    }
    
    abstract Socket method3118(int argument_1_) throws IOException;
}
