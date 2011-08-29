/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class StubInputStream extends InputStream
{

    public final int read() {
        Timing.sleep(30000L);
        return -1;
    }

}
