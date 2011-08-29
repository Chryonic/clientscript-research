/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/30/11
 * Time: 10:49 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2DebuggerMessage {
    private int opcode;
    private int scriptId;
    private byte[] data;

    public Cs2DebuggerMessage(int opcode, int scriptId, byte[] data) {
        this.opcode = opcode;
        this.scriptId = scriptId;
        this.data = data;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getScriptId() {
        return scriptId;
    }

    public byte[] getData() {
        return data;
    }
}
