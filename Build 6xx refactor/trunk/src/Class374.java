/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class374
{
    private Js5Store aJs5Store_3206;
    static int anInt3207;
    private Class149 aClass149_3208 = new Class149(64);
    Js5Store aJs5Store_3209;
    static boolean aBoolean3210 = false;
    Class149 aClass149_3211 = new Class149(64);
    
    final void method4077(byte argument_0_, int argument_1_) {
	synchronized (aClass149_3208) {
	    aClass149_3208.method2534(argument_1_, (byte) -8);
	}
	synchronized (((Class374) this).aClass149_3211) {
	    ((Class374) this).aClass149_3211.method2534(argument_1_,
							(byte) -8);
	}
    }
    
    final void method4078(byte argument_2_) {
	synchronized (aClass149_3208) {
	    aClass149_3208.method2540(argument_2_ ^ 0x17);
	}
	synchronized (((Class374) this).aClass149_3211) {
	    ((Class374) this).aClass149_3211.method2540(argument_2_ - 142);
	    if (argument_2_ != 24)
		aBoolean3210 = false;
	}
    }
    
    final void method4079(boolean argument_3_, int argument_4_,
			  int argument_5_) {
	aClass149_3208 = new Class149(argument_5_);
	((Class374) this).aClass149_3211 = new Class149(argument_4_);
    }
    
    final void method4080(boolean argument_6_) {
	synchronized (aClass149_3208) {
	    aClass149_3208.clear((byte) -3);
	}
	synchronized (((Class374) this).aClass149_3211) {
	    ((Class374) this).aClass149_3211.clear((byte) -3);
	}
    }
    
    static final boolean method4081(byte argument) {
	Hashtable hashtable = new Hashtable();
	Enumeration enumeration = Node_Sub2.classTable.keys();
	while (enumeration.hasMoreElements()) {
	    Object object = enumeration.nextElement();
	    hashtable.put(object, Node_Sub2.classTable.get(object));
	}
	try {
	    Class var_class
		= Class.forName("java.lang.reflect.AccessibleObject");
	    Class var_class_7_ = Class.forName("java.lang.ClassLoader");
	    Field field = var_class_7_.getDeclaredField("nativeLibraries");
	    Method method
		= var_class.getDeclaredMethod("setAccessible",
					      new Class[] { Boolean.TYPE });
	    method.invoke(field, new Object[] { Boolean.TRUE });
	    try {
		enumeration = Node_Sub2.classTable.keys();
		while (enumeration.hasMoreElements()) {
		    String string = (String) enumeration.nextElement();
		    try {
			File file = (File) Statics.fileTable.get(string);
			Class var_class_8_
			    = (Class) Node_Sub2.classTable.get(string);
			Vector vector
			    = ((Vector)
			       field.get(var_class_8_.getClassLoader()));
			for (int anLocalInt = 0; anLocalInt < vector.size();
			     anLocalInt++) {
			    try {
				Object object = vector.elementAt(anLocalInt);
				Field field_9_ = object.getClass()
						     .getDeclaredField("name");
				method.invoke(field_9_,
					      new Object[] { Boolean.TRUE });
				try {
				    String string_10_
					= (String) field_9_.get(object);
				    if (string_10_ != null
					&& (string_10_.equalsIgnoreCase
					    (file.getCanonicalPath()))) {
					Field field_11_
					    = object.getClass()
						  .getDeclaredField("handle");
					Method method_12_
					    = (object.getClass()
						   .getDeclaredMethod
					       ("finalize", new Class[0]));
					method.invoke(field_11_,
						      (new Object[]
						       { Boolean.TRUE }));
					method.invoke(method_12_,
						      (new Object[]
						       { Boolean.TRUE }));
					try {
					    method_12_.invoke(object,
							      new Object[0]);
					    field_11_.set(object,
							  new Integer(0));
					    hashtable.remove(string);
					} catch (Throwable throwable) {
					    /* empty */
					}
					method.invoke(method_12_,
						      (new Object[]
						       { Boolean.FALSE }));
					method.invoke(field_11_,
						      (new Object[]
						       { Boolean.FALSE }));
				    }
				} catch (Throwable throwable) {
				    /* empty */
				}
				method.invoke(field_9_,
					      new Object[] { Boolean.FALSE });
			    } catch (Throwable throwable) {
				/* empty */
			    }
			}
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    method.invoke(field, new Object[] { Boolean.FALSE });
	} catch (Throwable throwable) {
	    /* empty */
	}
	Node_Sub2.classTable = hashtable;
	return Node_Sub2.classTable.isEmpty();
    }

    final Class181 method4083(int argument_22_, byte argument_23_) {
	Class181 class181;
	synchronized (aClass149_3208) {
	    class181
		= (Class181) aClass149_3208.get((long) argument_22_);
	}
	if (class181 != null)
	    return class181;
	byte[] anLocalInts;
	synchronized (aJs5Store_3206) {
	    anLocalInts = aJs5Store_3206.getData(34, argument_22_);
	}
	class181 = new Class181();
	((Class181) class181).aClass374_1373 = this;
	if (anLocalInts != null)
	    class181.method2844((byte) -19, new Packet(anLocalInts));
	synchronized (aClass149_3208) {
	    aClass149_3208.put(class181, (long) argument_22_);
	}
	return class181;
    }
    
    Class374(GameEnum argument_24_, int argument_25_, Js5Store argument_26_,
	     Js5Store argument_27_) {
	aJs5Store_3206 = argument_26_;
	((Class374) this).aJs5Store_3209 = argument_27_;
	aJs5Store_3206.getSubFileCount(34);
    }
}
