import java.io.File;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/27/11
 * Time: 8:12 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class NativeManager {
    static final void method4095(String argument_5_, File argument_6_) {
	    Statics.fileTable.put(argument_5_, argument_6_);
    }

    static final boolean method460(String libname, Class someclass) {
        Class var_class = (Class) Node_Sub2.classTable.get(libname);
        if (var_class != null) {
            return var_class.getClassLoader() == someclass.getClassLoader();
        }
        File file = null;
        if (file == null)
            file = (File) Statics.fileTable.get(libname);
        if (file != null) {
            try {
                file = new File(file.getCanonicalPath());
                Class runtime = Class.forName("java.lang.Runtime");
                Class accessibleObj = Class.forName("java.lang.reflect.AccessibleObject");
                Method setAccessible = accessibleObj.getDeclaredMethod("setAccessible", (new Class[]{Boolean.TYPE}));
                Method load0 = (runtime.getDeclaredMethod("load0", new Class[]{Class.forName("java.lang.Class"), Class.forName("java.lang.String")}));
                setAccessible.invoke(load0, true);
                load0.invoke(Runtime.getRuntime(), someclass, file.getPath());
                setAccessible.invoke(load0, false);
                Node_Sub2.classTable.put(libname, someclass);
                return true;
            } catch (NoSuchMethodException nosuchmethodexception) {
                System.load(file.getPath());
                Node_Sub2.classTable.put(libname, (Class50.aClass381 != null ? Class50.aClass381 : (Class50.aClass381 = Class50.method467("Class252"))));
                return true;
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        return false;
    }

    static final boolean method2978(String libname) {
	return method460(libname, (Class212.aClass1510 != null ? Class212.aClass1510 : (Class212.aClass1510 = Class212.method2979("Class252"))));
    }

    static final boolean method2427(int argument) {
	if (!method2978("jaclib"))
	    return false;
	return method2978("hw3d");
    }

    static final String method1618(int argument, String argument_3_) {
	if (Class62_Sub5.osName.startsWith("win"))
	    return argument_3_ + ".dll";
	if (!Class62_Sub5.osName.startsWith("linux")) {
	    if (Class62_Sub5.osName.startsWith("mac"))
		return "lib" + argument_3_ + ".dylib";
	} else
	    return "lib" + argument_3_ + ".so";
	return null;
    }
}
