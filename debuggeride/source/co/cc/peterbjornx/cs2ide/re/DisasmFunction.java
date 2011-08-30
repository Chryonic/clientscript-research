package co.cc.peterbjornx.cs2ide.re;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 10:50 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class DisasmFunction {
    private int[] lineAddress;
    private String[] line;
    private Cs2OperandUse[] lineOperand;
    private int[] lineOperandIndex;
    private int lineCount = 0;
    private Object lineOperandV[];
    private String name;
    private Cs2Function cs2Function;

    public DisasmFunction(Cs2Function f){
        cs2Function = f;
        HashMap<Integer,String> labels = new HashMap<Integer, String>();
        for (int pc = 0;pc < f.opcodes.length;pc++){
            int l = f.integerOperands[pc] + pc + 1;
            if (Cs2ByteCode.getOperand(f.opcodes[pc]) == Cs2OperandUse.CodeOffset && !labels.containsKey(l))
                labels.put(l,"label"+labels.size());
            if (Cs2ByteCode.getOperand(f.opcodes[pc]) == Cs2OperandUse.SwitchBlockPtr){
                for (Object c : f.switchBlocks[f.integerOperands[pc]].keySet()){
                    int cc = (Integer) c;
                    labels.put(pc + 1 + (Integer) f.switchBlocks[f.integerOperands[pc]].get((long)cc),"switch"+f.integerOperands[pc]+"case"+cc);
                }
            }
        }
        lineCount = labels.size() + f.opcodes.length;
        lineAddress = new int[lineCount];
        line = new String[lineCount];
        lineOperand = new Cs2OperandUse[lineCount];
        lineOperandIndex = new int[lineCount];
        lineOperandV= new Object[lineCount];
        name = f.name == null ? ("function"+f.id) : f.name;
        int lineptr = 0;
        for (int pc = 0;pc < f.opcodes.length;pc++){
            lineAddress[lineptr] = pc;
            if (labels.containsKey(pc))
                line[lineptr++] = labels.get(pc)+":";
            lineAddress[lineptr] = pc;
                int opc = f.opcodes[pc];
                lineOperand[lineptr] = Cs2ByteCode.getOperand(opc);
                Object oper = f.integerOperands[pc];
                if (opc == 3)
                    oper = '"'+f.stringOperands[pc]+'"';
                else if (opc == 54)
                    oper = f.longOperands[pc];
                if(lineOperand[lineptr] == Cs2OperandUse.CodeOffset)
                    oper = labels.get(f.integerOperands[pc] + 1 + pc);
                line[lineptr] = Cs2ByteCode.name(opc) + (lineOperand[lineptr] == Cs2OperandUse.None ? "" : (" " + oper));
                lineOperandIndex[lineptr] = line[lineptr].indexOf(' ');
                lineOperandV[lineptr] = oper;
                lineptr++;
        }
    }

    public String getListing(){
        String le = "";
        for (int l = 0;l < lineCount;l++)
            le+=line[l]+"\n";
        return le;
    }

    public int[] getLineAddress() {
        return lineAddress;
    }

    public String[] getLine() {
        return line;
    }

    public Cs2OperandUse[] getLineOperand() {
        return lineOperand;
    }

    public int[] getLineOperandIndex() {
        return lineOperandIndex;
    }

    public int getLineCount() {
        return lineCount;
    }

    public String getName() {
        return name;
    }

    public Cs2Function getCs2Function() {
        return cs2Function;
    }

    public Object[] getLineOperandV() {
        return lineOperandV;
    }
}
