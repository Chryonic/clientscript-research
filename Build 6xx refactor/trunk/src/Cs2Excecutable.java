import cs2.Cs2ByteCode;
import cs2.Cs2Instruction;
import sun.text.normalizer.IntTrie;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.rmi.registry.Registry;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/22/11
 * Time: 8:50 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Excecutable {
    private String name;
    private long id;
    private HashMap<Long, Integer>[] cases;
    private Cs2Signature signature;
    private int integerVariableCount;
    private int longVariableCount;
    private int stringVariableCount;
    private Cs2Instruction instructions[];

    public Cs2Excecutable(Cs2Script script){
        name = script.name;
        id = script.hash;
        signature = new Cs2Signature(script.integerArgumentCount,script.longArgumentCount,script.stringArgumentCount,0,0,0);
        integerVariableCount = script.integerVariableCount;
        longVariableCount = script.longVariableCount;
        stringVariableCount = script.stringVariableCount;
        if (script.switchBlocks != null) {
            cases = new HashMap[script.switchBlocks.length];
            JagexHashMap[] switchBlocks = script.switchBlocks;
            for (int i = 0, switchBlocksLength = switchBlocks.length; i < switchBlocksLength; i++) {
                JagexHashMap switchBlock = switchBlocks[i];
                cases[i] = new HashMap<Long, Integer>();
                for (IntegerNode req = (IntegerNode) switchBlock.first(0); req != null; req = ((IntegerNode) switchBlock.next()))
                    cases[i].put(req.hash,req.value);
            }
        }
        instructions = new Cs2Instruction[script.opcodes.length];
        for (int i1 = 0, opcodesLength = script.opcodes.length; i1 < opcodesLength; i1++)
            instructions[i1] = new Cs2Instruction(script.opcodes[i1],
                    script.integerOperands == null ? -1   : script.integerOperands[i1],
                    script.longOperands == null    ? -1   : script.longOperands[i1],
                    script.stringOperands == null  ? null : script.stringOperands[i1]);
        try {
            PrintStream p = new PrintStream("../cs2asm/" + toString()+".s");
            p.println(disassemble());
            p.flush();
            p.close();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    public String disassemble(){
        StringBuilder b = new StringBuilder();
        b.append(toString()).append("(").append(signature.toAsmParList()).append(")\n");
        HashMap<Integer,String> labels = new HashMap<Integer, String>();
        for (int i = 0, instructionsLength = instructions.length; i < instructionsLength; i++) {
            Cs2Instruction instr = instructions[i];
            int opcode = instr.getOpcode();
            if ((opcode >= 6 && opcode <= 10) || (opcode >= 68 && opcode <= 73) || opcode == 86 || opcode == 87 || opcode == 31 || opcode == 32)
            {
                if (!labels.containsKey(i+1+instr.getIntOperand()))
                    labels.put(i+1+instr.getIntOperand(),"label" + labels.size());
            } else if (opcode == 51){
                HashMap<Long,Integer> switchs = cases[instr.getIntOperand()];
                for (long l : switchs.keySet()){
                    labels.put(i+1+switchs.get(l),"switch"+instr.getIntOperand()+"case"+l);
                }
            }
        }
        for (int i = 0, instructionsLength = instructions.length; i < instructionsLength; i++) {
            Cs2Instruction instr = instructions[i];
            if (labels.containsKey(i))
                b.append(labels.get(i)).append(":\n");
            int opcode = instr.getOpcode();
            b.append("\t");
            if ((opcode >= 6 && opcode <= 10) || (opcode >= 68 && opcode <= 73) || opcode == 86 || opcode == 87 || opcode == 31 || opcode == 32)
                b.append(Cs2ByteCode.name(opcode)).append(" ").append(labels.get(i + 1 + instr.getIntOperand()));
            else
                b.append(instr.toString());
            b.append("\n");
        }
        return b.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public HashMap<Long, Integer>[] getCases() {
        return cases;
    }

    public void setCases(HashMap<Long, Integer>[] cases) {
        this.cases = cases;
    }

    public Cs2Signature getSignature() {
        return signature;
    }

    public void setSignature(Cs2Signature signature) {
        this.signature = signature;
    }

    public int getIntegerVariableCount() {
        return integerVariableCount;
    }

    public void setIntegerVariableCount(int integerVariableCount) {
        this.integerVariableCount = integerVariableCount;
    }

    public int getLongVariableCount() {
        return longVariableCount;
    }

    public void setLongVariableCount(int longVariableCount) {
        this.longVariableCount = longVariableCount;
    }

    public int getStringVariableCount() {
        return stringVariableCount;
    }

    public void setStringVariableCount(int stringVariableCount) {
        this.stringVariableCount = stringVariableCount;
    }

    public Cs2Instruction[] getInstructions(){
        return instructions;
    }

    public String toString(){
        return name == null ? ("function"+id) : name;
    }
}
