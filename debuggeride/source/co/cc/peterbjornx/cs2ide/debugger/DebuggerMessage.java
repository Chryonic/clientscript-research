package co.cc.peterbjornx.cs2ide.debugger;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 12:24 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class DebuggerMessage {
    private int opcode;
    private int scriptId;
    private byte[] data;

    public DebuggerMessage(int opcode, int scriptId, byte[] data) {
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
