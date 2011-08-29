/* Class392 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class392
{
    static int anInt3293 = 1;
    static Class83 aClass83_3294;
    static int anInt3295 = 0;
    /*synthetic*/ static Class aClass3296;
    /*synthetic*/ static Class aClass3297;
    
    static final int method4142(int argument, boolean argument_0_) {
	int anLocalInt = argument >>> 1;
	anLocalInt |= anLocalInt >>> 1;
	anLocalInt |= anLocalInt >>> 2;
	anLocalInt |= anLocalInt >>> 4;
	anLocalInt |= anLocalInt >>> 8;
	anLocalInt |= anLocalInt >>> 16;
	return (anLocalInt ^ 0xffffffff) & argument;
    }
    
    public static void method4143(int argument) {
	aClass83_3294 = null;
    }
    
    static final synchronized void method4144(boolean argument) {
	if (Class52.anObject392 == null) {
	    try {
		Class var_class
		    = Class.forName("java.lang.management.ManagementFactory");
		Method method
		    = var_class.getDeclaredMethod("getPlatformMBeanServer",
						  null);
		Object object = method.invoke(null, null);
		Method method_1_
		    = (var_class.getMethod
		       ("newPlatformMXBeanProxy",
			(new Class[]
			 { (Class.forName
			    ("javax.management.MBeanServerConnection")),
			   (aClass3296 != null ? aClass3296
			    : (aClass3296 = method4146("java.lang.String"))),
			   (aClass3297 != null ? aClass3297
			    : (aClass3297
			       = method4146("java.lang.Class"))) })));
		Class52.anObject392
		    = (method_1_.invoke
		       (null,
			(new Object[]
			 { object, "com.sun.management:type=HotSpotDiagnostic",
			   (Class.forName
			    ("com.sun.management.HotSpotDiagnosticMXBean")) })));
	    } catch (Exception exception) {
		System.out.println("HeapDump setup error:");
		exception.printStackTrace();
	    }
	}
    }

    /*synthetic*/ static Class method4146(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
