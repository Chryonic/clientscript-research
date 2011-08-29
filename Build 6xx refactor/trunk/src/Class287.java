/* Class287 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Method;

final class Class287
{
    static Class207 aClass207_2296;
    static int anInt2297 = 0;
    static int anInt2299;
    /*synthetic*/ static Class aClass2300;
    
    public static void method3469(int argument) {
	aClass207_2296 = null;
	RsInterface.empty = null;
    }
    
    static final void method3470(int argument, boolean argument_0_,
				 File argument_1_) {
	if (Class52.anObject392 == null)
	    Class392.method4144(false);
	try {
	    Class var_class
		= Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
	    Method method
		= (var_class.getDeclaredMethod
		   ("dumpHeap",
		    new Class[] { (aClass2300 != null ? aClass2300
				   : (aClass2300
				      = method3471("java.lang.String"))),
				  Boolean.TYPE }));
	    method.invoke(Class52.anObject392,
			  new Object[] { argument_1_.getAbsolutePath(),
					 new Boolean(argument_0_) });
	} catch (Exception exception) {
	    System.out.println("HeapDump error:");
	    exception.printStackTrace();
	}
    }
    
    /*synthetic*/ static Class method3471(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
    
    static {
	aClass207_2296 = new Class207(61, -1);
    }
}
