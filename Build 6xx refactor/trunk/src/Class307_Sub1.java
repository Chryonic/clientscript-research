/* Class307_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class307_Sub1 extends Class307
{
    private Class274 aClass274_5411;
    static Class306 aClass306_5412;
    private Socket aSocket5413;
    private Class92 aClass92_5414;
    static float aFloat5415;
    static String aString5416 = null;
    static long aLong5417 = 0L;
    
    final void method3602(int argument_0_, int argument_1_, int argument_2_,
			  byte[] argument_3_) throws IOException {
	if (argument_2_ != 55)
	    aClass92_5414 = null;
	aClass92_5414.method1692(argument_0_, argument_3_, 0, argument_1_);
    }
    
    final boolean method3603(int argument_4_, int argument_5_)
	throws IOException {
	if (argument_5_ != 55)
	    method3604(-40);
	return aClass274_5411.method3389(0, argument_4_);
    }
    
    public static void method3607(int argument) {
	aString5416 = null;
	aClass306_5412 = null;
    }
    
    protected final void finalize() {
	method3601(2);
    }
    
    final void method3601(int argument_6_) {
	try {
	    aSocket5413.close();
	} catch (IOException ioexception) {
	    /* empty */
	}
	if (argument_6_ != 2)
	    method3604(103);
	aClass274_5411.method3386(false);
	aClass92_5414.method1691((byte) 40);
    }
    
    final int method3606(int argument_7_, int argument_8_, byte[] argument_9_,
			 int argument_10_) throws IOException {
	int anLocalInt = -14 / ((10 - argument_7_) / 58);
	return aClass274_5411.method3391(argument_10_, argument_8_,
					 argument_9_, (byte) -110);
    }
    
    final void method3604(int argument_11_) {
	aClass274_5411.method3385(1160472800);
	if (argument_11_ < -71)
	    aClass92_5414.method1693(-56);
    }
    
    Class307_Sub1(Socket argument_12_, int argument_13_) throws IOException {
	aSocket5413 = argument_12_;
	aSocket5413.setSoTimeout(30000);
	aSocket5413.setTcpNoDelay(true);
	aClass274_5411
	    = new Class274(aSocket5413.getInputStream(), argument_13_);
	aClass92_5414
	    = new Class92(aSocket5413.getOutputStream(), argument_13_);
    }
}
