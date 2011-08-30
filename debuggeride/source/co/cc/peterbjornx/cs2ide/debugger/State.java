package co.cc.peterbjornx.cs2ide.debugger;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 1:01 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class State {
    private int pc;
    private String script;
    private int integerStackCounter;
    private int stringStackCounter;
    private int longStackCounter;
    private int callStackCounter;
    private int integerVariableCount;
    private int stringVariableCount;
    private int longVariableCount;
    private int[] integerStack;
    private String[] stringStack;
    private long[] longStack;
    private int[] integerVariables;
    private String[] stringVariables;
    private long[] longVariables;
    private State[] callStack;

    public State(DataInputStream in) throws IOException {
        this(in,false);
    }

    public State(DataInputStream in,boolean cs) throws IOException {
        if (!cs){
            script = in.readUTF();
            pc = in.readInt();
            integerStackCounter = in.readInt();
            stringStackCounter = in.readInt();
            longStackCounter = in.readInt();
            callStackCounter = in.readInt();
            integerVariableCount = in.readInt();
            stringVariableCount = in.readInt();
            longVariableCount = in.readInt();

            integerStack = new int[integerStackCounter];
            stringStack = new String[stringStackCounter];
            longStack = new long[longStackCounter];

            integerVariables = new int[integerVariableCount];
            stringVariables = new String[stringVariableCount];
            longVariables = new long[longVariableCount];

            callStack = new State[callStackCounter];

            for (int i = 0;i < integerStackCounter;i++)
                integerStack[i] = in.readInt();
            for (int i = 0;i < stringStackCounter;i++)
                stringStack[i] = in.readUTF();
            for (int i = 0;i < longStackCounter;i++)
                longStack[i] = in.readLong();

            for (int i = 0;i < integerVariableCount;i++)
                integerVariables[i] = in.readInt();
            for (int i = 0;i < stringVariableCount;i++)
                stringVariables[i] = in.readUTF();
            for (int i = 0;i < longVariableCount;i++)
                longVariables[i] = in.readLong();

            for (int i = 0;i < callStackCounter;i++)
                callStack[i] = new State(in,true);
        } else {
            script = in.readUTF();
            pc = in.readInt();
            integerVariableCount = in.readInt();
            stringVariableCount = in.readInt();
            longVariableCount = in.readInt();
            integerVariables = new int[integerVariableCount];
            stringVariables = new String[stringVariableCount];
            longVariables = new long[longVariableCount];
            for (int i = 0;i < integerVariableCount;i++)
                integerVariables[i] = in.readInt();
            for (int i = 0;i < stringVariableCount;i++)
                stringVariables[i] = in.readUTF();
            for (int i = 0;i < longVariableCount;i++)
                longVariables[i] = in.readLong();
        }
    }

    public int getPc() {
        return pc;
    }

    public int getIntegerStackCounter() {
        return integerStackCounter;
    }

    public int getStringStackCounter() {
        return stringStackCounter;
    }

    public int getLongStackCounter() {
        return longStackCounter;
    }

    public int getCallStackCounter() {
        return callStackCounter;
    }

    public int getIntegerVariableCount() {
        return integerVariableCount;
    }

    public int getStringVariableCount() {
        return stringVariableCount;
    }

    public int getLongVariableCount() {
        return longVariableCount;
    }

    public int[] getIntegerStack() {
        return integerStack;
    }

    public String[] getStringStack() {
        return stringStack;
    }

    public long[] getLongStack() {
        return longStack;
    }

    public int[] getIntegerVariables() {
        return integerVariables;
    }

    public String[] getStringVariables() {
        return stringVariables;
    }

    public long[] getLongVariables() {
        return longVariables;
    }

    public State[] getCallStack() {
        return callStack;
    }

    public String getScript() {
        return script;
    }
}
