/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.lang.reflect.Method;

final class Class258
{
    static final GraphicsToolkit method3304(Js5Store argument, Canvas argument_0_,
				     int argument_1_, int argument_2_,
				     TextureSource argument_3_) {
	GraphicsToolkit graphicsToolkit;
	try {
	    if (!NativeManager.method2427(-2500))
		throw new RuntimeException("");
	    if (!NativeManager.method2978("jagdx"))
		throw new RuntimeException("");
	    if (argument_1_ != -8992)
		method3304(null, null, -125, -78, null);
	    Class var_class = Class.forName("GraphicsToolkit_Sub2_Sub2");
	    Method method
		= (var_class.getDeclaredMethod
		   ("method2260",
		    new Class[] { Class.forName("java.awt.Canvas"),
				  Class.forName("TextureSource"),
				  Class.forName("Js5Store"),
				  Class.forName("java.lang.Integer") }));
	    graphicsToolkit
		= ((GraphicsToolkit)
		   method.invoke(null,
				 new Object[] { argument_0_, argument_3_,
						argument,
						new Integer(argument_2_) }));
	} catch (Throwable throwable) {
	    throw new RuntimeException("");
	}
	return graphicsToolkit;
    }
}
