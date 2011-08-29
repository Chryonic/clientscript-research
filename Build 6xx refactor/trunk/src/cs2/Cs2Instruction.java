package cs2;

import java.util.StringTokenizer;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 10:19 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Instruction {
    private int opcode;
    private int intOperand;
    private String stringOperand;
    private long longOperand;

    public Cs2Instruction(int opcode, int intOperand, long longOperand, String stringOperand) {
        this.opcode = opcode;
        this.intOperand = intOperand;
        this.longOperand = longOperand;
        this.stringOperand = stringOperand;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getIntOperand() {
        return intOperand;
    }

    public String getStringOperand() {
        return stringOperand;
    }

    public long getLongOperand() {
        return longOperand;
    }

    public String toString(){
        if (opcode == 3)
            return Cs2ByteCode.name(opcode) + " \"" + stringOperand+"\"";
        if (opcode == 54)
            return Cs2ByteCode.name(opcode) + " " + longOperand;
        return Cs2ByteCode.name(opcode) + " " + intOperand;
    }
}
