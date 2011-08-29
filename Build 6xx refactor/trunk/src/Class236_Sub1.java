/* Class236_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class Class236_Sub1 extends Class236
{
    private ProxySelector aProxySelector5298 = ProxySelector.getDefault();
    static Class aClass5299;
    static Class aClass5300;
    
    private final Socket method3119(int argument_0_, Proxy argument_1_)
	throws IOException {
	if (argument_1_.type() == Proxy.Type.DIRECT)
	    return method3117(false);
	java.net.SocketAddress socketaddress = argument_1_.address();
	if (argument_0_ != 0)
	    return null;
	if (!(socketaddress instanceof InetSocketAddress))
	    return null;
	InetSocketAddress inetsocketaddress
	    = (InetSocketAddress) socketaddress;
	if (argument_1_.type() == Proxy.Type.HTTP) {
	    String string = null;
	    try {
		Class var_class
		    = (Class.forName
		       ("sun.net.www.protocol.http.AuthenticationInfo"));
		Method method
		    = (var_class.getDeclaredMethod
		       ("getProxyAuth",
			(new Class[]
			 { (aClass5299 == null
			    ? aClass5299 = method3121("java.lang.String")
			    : aClass5299),
			   Integer.TYPE })));
		method.setAccessible(true);
		Object object
		    = method.invoke(null, (new Object[]
					   { inetsocketaddress.getHostName(),
					     new Integer(inetsocketaddress
							     .getPort()) }));
		if (object != null) {
		    Method method_2_
			= (var_class.getDeclaredMethod
			   ("supportsPreemptiveAuthorization", new Class[0]));
		    method_2_.setAccessible(true);
		    if (((Boolean) method_2_.invoke(object, new Object[0]))
			    .booleanValue()) {
			Method method_3_
			    = var_class.getDeclaredMethod("getHeaderName",
							  new Class[0]);
			method_3_.setAccessible(true);
			Method method_4_
			    = (var_class.getDeclaredMethod
			       ("getHeaderValue",
				(new Class[]
				 { (aClass5300 == null
				    ? aClass5300 = method3121("java.net.URL")
				    : aClass5300),
				   (aClass5299 == null
				    ? (aClass5299
				       = method3121("java.lang.String"))
				    : aClass5299) })));
			method_4_.setAccessible(true);
			String string_5_
			    = (String) method_3_.invoke(object, new Object[0]);
			String string_6_
			    = ((String)
			       method_4_.invoke(object,
						(new Object[]
						 { new URL("https://"
							   + ((Class236_Sub1)
							      this).aString1721
							   + "/"),
						   "https" })));
			string = string_5_ + ": " + string_6_;
		    }
		}
	    } catch (Exception exception) {
		/* empty */
	    }
	    return method3120(inetsocketaddress.getHostName(),
			      inetsocketaddress.getPort(), string);
	}
	if (argument_1_.type() == Proxy.Type.SOCKS) {
	    Socket socket = new Socket(argument_1_);
	    socket.connect(new InetSocketAddress((((Class236_Sub1) this)
						  .aString1721),
						 (((Class236_Sub1) this)
						  .anInt1720)));
	    return socket;
	}
	return null;
    }
    
    final Socket method3118(int argument_7_) throws IOException {
	int anLocalInt = -43 / ((-36 - argument_7_) / 49);
	boolean anLocalBoolean
	    = (Boolean.parseBoolean
	       (System.getProperty("java.net.useSystemProxies")));
	if (!anLocalBoolean)
	    System.setProperty("java.net.useSystemProxies", "true");
	boolean anLocalBoolean_8_ = ((Class236_Sub1) this).anInt1720 == 443;
	List list;
	List list_9_;
	try {
	    list = aProxySelector5298.select(new URI((!anLocalBoolean_8_
						      ? "http" : "https")
						     + "://"
						     + (((Class236_Sub1) this)
							.aString1721)));
	    list_9_
		= aProxySelector5298.select(new URI((!anLocalBoolean_8_
						     ? "https" : "http")
						    + "://"
						    + (((Class236_Sub1) this)
						       .aString1721)));
	} catch (URISyntaxException urisyntaxexception) {
	    return method3117(false);
	}
	list.addAll(list_9_);
	Object[] objects = list.toArray();
	IOException_Sub1 ioexception_sub1 = null;
	Object[] objects_10_ = objects;
	for (int anLocalInt_11_ = 0; anLocalInt_11_ < objects_10_.length;
	     anLocalInt_11_++) {
	    Object object = objects_10_[anLocalInt_11_];
	    Proxy proxy = (Proxy) object;
	    Socket socket;
	    try {
		Socket socket_12_ = method3119(0, proxy);
		if (socket_12_ == null)
		    continue;
		socket = socket_12_;
	    } catch (IOException_Sub1 ioexception_sub1_13_) {
		ioexception_sub1 = ioexception_sub1_13_;
		continue;
	    } catch (IOException ioexception) {
		continue;
	    }
	    return socket;
	}
	if (ioexception_sub1 != null)
	    throw ioexception_sub1;
	return method3117(false);
    }
    
    private final Socket method3120(String argument_14_, int argument_15_,
				    String argument_16_) throws IOException {
	Socket socket = new Socket(argument_14_, argument_15_);
	socket.setSoTimeout(10000);
	OutputStream outputstream = socket.getOutputStream();
	if (argument_16_ == null)
	    outputstream.write(("CONNECT " + ((Class236_Sub1) this).aString1721
				+ ":" + ((Class236_Sub1) this).anInt1720
				+ " HTTP/1.0\n\n")
				   .getBytes(Charset.forName("ISO-8859-1")));
	else
	    outputstream.write(("CONNECT " + ((Class236_Sub1) this).aString1721
				+ ":" + ((Class236_Sub1) this).anInt1720
				+ " HTTP/1.0\n" + argument_16_ + "\n\n")
				   .getBytes(Charset.forName("ISO-8859-1")));
	outputstream.flush();
	BufferedReader bufferedreader
	    = new BufferedReader(new InputStreamReader(socket
							   .getInputStream()));
	String string = bufferedreader.readLine();
	if (string != null) {
	    if (string.startsWith("HTTP/1.0 200")
		|| string.startsWith("HTTP/1.1 200"))
		return socket;
	    if (string.startsWith("HTTP/1.0 407")
		|| string.startsWith("HTTP/1.1 407")) {
		int anLocalInt = 0;
		string = bufferedreader.readLine();
		String string_17_ = "proxy-authenticate: ";
		for (/**/; string != null && anLocalInt < 50; anLocalInt++) {
		    if (string.toLowerCase().startsWith(string_17_)) {
			string = string.substring(string_17_.length()).trim();
			int anLocalInt_18_ = string.indexOf(' ');
			if (anLocalInt_18_ != -1)
			    string = string.substring(0, anLocalInt_18_);
			throw new IOException_Sub1(string);
		    }
		    string = bufferedreader.readLine();
		}
		throw new IOException_Sub1("");
	    }
	}
	outputstream.close();
	bufferedreader.close();
	socket.close();
	return null;
    }
    
    static Class method3121(String argument) {
	Class var_class;
	try {
	    var_class = Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new RuntimeException (classnotfoundexception);
	}
	return var_class;
    }
}
