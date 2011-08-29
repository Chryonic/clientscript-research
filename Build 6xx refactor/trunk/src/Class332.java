/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class332
{
    static Class207 aClass207_2715 = new Class207(72, 16);
    static int anInt2716;
    static Class207 aClass207_2717 = new Class207(19, -1);
    /*synthetic*/ static Class aClass2718;
    
    public static void method3722(boolean argument) {
	aClass207_2717 = null;
	aClass207_2715 = null;
    }
    
    static final void method3723(int argument) {
	if (((Signlink) Applet_Sub1.baseSignlink).useWin32)
	    ClanSettingsDelta.anInt1544 = 96;
	else {
	    try {
		Method method
		    = (aClass2718 != null ? aClass2718
		       : (aClass2718 = method3724("java.lang.Runtime")))
			  .getMethod("maxMemory", new Class[0]);
		if (method != null) {
		    try {
			Runtime runtime = Runtime.getRuntime();
			Long var_long = (Long) method.invoke(runtime, null);
			ClanSettingsDelta.anInt1544
			    = (int) (var_long.longValue() / 1048576L) + 1;
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	}
    }
    
    /*synthetic*/ static Class method3724(String argument) {
	try {
	    return Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new NoClassDefFoundError(classnotfoundexception
					       .getMessage());
	}
    }
}
