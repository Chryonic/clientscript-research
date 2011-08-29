/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/16/11
 * Time: 5:41 AM
 * To change this template use File | JagexStringEncoding | File Templates.
 */
public class Timing {
    static void sleep(long millis) {
        if (millis > 0L) {
            if (millis % 10L == 0L) {
                interruptibleSleep(millis - 1L);
                interruptibleSleep(1L);
            } else
                interruptibleSleep(millis);
        }
    }

    static void interruptibleSleep(long argument) {
        try {
            Thread.sleep(argument);
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
    }
}
