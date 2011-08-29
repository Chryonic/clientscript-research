/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class328
{
    static final void method3696(String argument, Applet argument_0_,
				 int argument_1_) throws Throwable {
	JSObject.getWindow(argument_0_).eval(argument);
    }
    
    static final Object method3697(String argument, Object[] argument_2_,
				   int argument_3_,
				   Applet argument_4_) throws Throwable {
	return JSObject.getWindow(argument_4_).call(argument, argument_2_);
    }
    
    static final Object method3698(Applet argument, String argument_5_,
				   byte argument_6_) throws Throwable {
	return JSObject.getWindow(argument).call(argument_5_, null);
    }
}
