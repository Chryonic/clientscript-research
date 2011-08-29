import java.io.*;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/16/11
 * Time: 5:45 AM
 * To change this template use File | Ssettings | File Templates.
 */
public class ErrorReporting {
    static void reportError(String argument_13_, Throwable argument_14_) {
            try {
                String string = "";
                if (argument_14_ != null)
                    string = encodeStackTrace(argument_14_);
                if (argument_13_ != null) {
                    if (argument_14_ != null)
                        string += " | ";
                    string += argument_13_;
                }
                logError(string);
                string = JagexStringUtils.replaceAll(string, ":", "%3a");
                string = JagexStringUtils.replaceAll(string, "@", "%40");
                string = JagexStringUtils.replaceAll(string, "&", "%26");
                string = JagexStringUtils.replaceAll(string, "#", "%23");
                if (Applet_Sub1.anApplet5957 != null) {
                    SignlinkRequest signlinkRequest = (Statics.aSignlink_1105.requestURLDataInputStream(new URL(Applet_Sub1.anApplet5957.getCodeBase(), ("clienterror.ws?c=" + Applet_Sub1.gameRevision + "&u=" + (Exception_Sub1.aString47 != null ? Exception_Sub1.aString47 : String.valueOf(Class43.aLong309)) + "&v1=" + Signlink.javaVendor + "&v2=" + Signlink.javaVersion + "&e=" + string))));
                    while (signlinkRequest.status == 0)
                        Timing.sleep(1L);
                    if (signlinkRequest.status != 1)
                        return;
                    DataInputStream datainputstream = (DataInputStream) signlinkRequest.result;
                    //noinspection ResultOfMethodCallIgnored
                    datainputstream.read();
                    datainputstream.close();
                }
            } catch (Exception exception) {
                /* empty */
            }
    }

    static String encodeStackTrace(Throwable exception) throws IOException {
        String string;
        if (!(exception instanceof RuntimeException_Sub2))
            string = "";
        else {
            RuntimeException_Sub2 runtimeexception_sub2 = (RuntimeException_Sub2) exception;
            string = (runtimeexception_sub2.aString3424 + " | ");
            exception = (runtimeexception_sub2.aThrowable3426);
        }

        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        exception.printStackTrace(printwriter);
        printwriter.close();
        String stackTrace = stringwriter.toString();

        BufferedReader bufferedreader = new BufferedReader(new StringReader(stackTrace));
        String firstLine = bufferedreader.readLine();
        for (; ; ) {
            String stackElementLine = bufferedreader.readLine();
            if (stackElementLine == null)
                break;
            int oBracketIndex = stackElementLine.indexOf('(');
            int cBracketIndex = stackElementLine.indexOf(')', oBracketIndex + 1);
            String methodFQN;
            if (oBracketIndex != -1)
                methodFQN = stackElementLine.substring(0, oBracketIndex);
            else
                methodFQN = stackElementLine;
            methodFQN = methodFQN.trim();
            methodFQN = methodFQN.substring(methodFQN.lastIndexOf(' ') + 1);
            methodFQN = methodFQN.substring(methodFQN.lastIndexOf('\t') + 1);
            string += methodFQN;
            if (oBracketIndex != -1 && cBracketIndex != -1) {
                int lineNumber = stackElementLine.indexOf(".java:", oBracketIndex);
                if (lineNumber >= 0)
                    string += stackElementLine.substring(lineNumber + 5, cBracketIndex);
            }
            string += " :-: ";
        }
        string += "| " + firstLine;
        return string;
    }

    static void logError(String argument_1_) {
        argument_1_ = JagexStringUtils.replaceAll(argument_1_," :-: ","\n");
        argument_1_ = JagexStringUtils.replaceAll(argument_1_,"| ","\n");
	System.out.println("Error: " + JagexStringUtils.replaceAll(argument_1_, "%0a", "\n"));
    }
}
