package co.cc.peterbjornx.cs2ide.re;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/24/11
 * Time: 10:36 AM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2ByteCode {
    private static HashMap<Integer, String> opcodes = new HashMap<Integer, String>();
    private static HashMap<Integer, Cs2OperandUse> operands = new HashMap<Integer, Cs2OperandUse>();
    private static HashMap<Integer, String> setters = new HashMap<Integer, String>();

    public static String name(int opcode){
        if (opcodes.containsKey(opcode))
            return opcodes.get(opcode);
        if (setters.containsKey(opcode))
            return setters.get(opcode);
        return "OP"+opcode;
    }

    public static boolean isSetter(int op){
        return setters.containsKey(op);
    }

    public static Cs2OperandUse getOperand(int key) {
        if (operands.containsKey(key))
            return operands.get(key);
        else
            return Cs2OperandUse.Immediate;
    }

    static {
        opcodes.put(0,"PUSH");
        operands.put(0,Cs2OperandUse.Immediate);
        opcodes.put(1,"PUSHC");
        operands.put(1,Cs2OperandUse.IntConfigPtr);
        opcodes.put(2,"POPC");
        operands.put(2,Cs2OperandUse.IntConfigPtr);
        opcodes.put(3,"PUSH");
        operands.put(3,Cs2OperandUse.Immediate);
        opcodes.put(6,"JUMP");
        operands.put(6,Cs2OperandUse.CodeOffset);
        opcodes.put(7,"BNE");
        operands.put(7,Cs2OperandUse.CodeOffset);
        opcodes.put(8,"BEQ");
        operands.put(8,Cs2OperandUse.CodeOffset);
        opcodes.put(9,"BLT");
        operands.put(9,Cs2OperandUse.CodeOffset);
        opcodes.put(10,"BGT");
        operands.put(10,Cs2OperandUse.CodeOffset);
        opcodes.put(21,"RET");
        operands.put(21,Cs2OperandUse.None);
        opcodes.put(25,"PUSHB");
        operands.put(25,Cs2OperandUse.BitConfigPtr);
        opcodes.put(27,"POPB");
        operands.put(27,Cs2OperandUse.BitConfigPtr);
        opcodes.put(31,"BLE");
        operands.put(31,Cs2OperandUse.CodeOffset);
        opcodes.put(32,"BGE");
        operands.put(32,Cs2OperandUse.CodeOffset);
        opcodes.put(33,"PUSHLI");
        operands.put(33,Cs2OperandUse.IntLocalPtr);
        opcodes.put(34,"POPLI");
        operands.put(34,Cs2OperandUse.IntLocalPtr);
        opcodes.put(35,"PUSHLS");
        operands.put(35,Cs2OperandUse.StringLocalPtr);
        opcodes.put(36,"POPLS");
        operands.put(36,Cs2OperandUse.StringLocalPtr);
        opcodes.put(37,"CAT");
        operands.put(37,Cs2OperandUse.StringStackDepth);
        opcodes.put(38,"POPI");
        operands.put(38,Cs2OperandUse.None);
        opcodes.put(39,"POPS");
        operands.put(39,Cs2OperandUse.None);
        opcodes.put(40,"CALL");
        operands.put(40,Cs2OperandUse.FunctionPtr);
        opcodes.put(42,"PUSHGI");
        operands.put(42,Cs2OperandUse.IntGlobalPtr);
        opcodes.put(43,"POPGI");
        operands.put(43,Cs2OperandUse.IntGlobalPtr);
        opcodes.put(44,"DIMA");
        operands.put(44,Cs2OperandUse.Immediate);
        opcodes.put(45,"PUSHA");
        operands.put(45,Cs2OperandUse.ArrayGlobalPtr);
        opcodes.put(46,"POPA");
        operands.put(46,Cs2OperandUse.ArrayGlobalPtr);
        opcodes.put(47,"PUSHGS");
        operands.put(47,Cs2OperandUse.StringGlobalPtr);
        opcodes.put(48,"POPGS");
        operands.put(48,Cs2OperandUse.StringGlobalPtr);
        opcodes.put(51,"Switch");
        operands.put(51,Cs2OperandUse.SwitchBlockPtr);

        opcodes.put(54,"PUSHL");
        operands.put(54,Cs2OperandUse.Immediate);
        opcodes.put(55,"POPL");
        operands.put(55,Cs2OperandUse.None);
        opcodes.put(66,"PUSHLL");
        operands.put(66,Cs2OperandUse.LongLocalPtr);
        opcodes.put(67,"POPLL");
        operands.put(67,Cs2OperandUse.LongLocalPtr);
        opcodes.put(68,"BNEL");
        operands.put(68,Cs2OperandUse.CodeOffset);
        opcodes.put(69,"BEQL");
        operands.put(69,Cs2OperandUse.CodeOffset);
        opcodes.put(70,"BLTL");
        operands.put(70,Cs2OperandUse.CodeOffset);
        opcodes.put(71,"BGTL");
        operands.put(71,Cs2OperandUse.CodeOffset);
        opcodes.put(72,"BLEL");
        operands.put(72,Cs2OperandUse.CodeOffset);
        opcodes.put(73,"BGEL");
        operands.put(73,Cs2OperandUse.CodeOffset);

        opcodes.put(86,"BNZ");
        operands.put(86,Cs2OperandUse.CodeOffset);
        opcodes.put(87,"BZ");
        operands.put(87,Cs2OperandUse.CodeOffset);

        opcodes.put(101,"cc_delete");
        opcodes.put(200,"cc_load_i");
        opcodes.put(201,"cc_load_rsh");
        opcodes.put(102,"cc_reset");
        opcodes.put(100,"cc_create");
        opcodes.put(1000,"cc_position");
        opcodes.put(1001,"cc_size");
        opcodes.put(1300,"AddMenuAction");
        opcodes.put(1117,"PopMask");
        opcodes.put(1105,"PushDImage");
        opcodes.put(1414,"SetScriptParamA");
        opcodes.put(4200,"PushItemName");
        opcodes.put(3110,"SendPacket195");
        opcodes.put(2800,"PushOptionMask");
        opcodes.put(2801,"PushMenuAction");
        opcodes.put(2600,"PushScrollposH");
        opcodes.put(2601,"PushScrollposV");
        opcodes.put(2602,"PushDText");
        opcodes.put(1112,"PopDText");
        opcodes.put(2603,"PushScrollmaxH");
        opcodes.put(2604,"PushScrollmaxV");
        opcodes.put(1120,"PopScrollMaxes");
        opcodes.put(2500,"PushAX");
        opcodes.put(2501,"PushAY");
        opcodes.put(2502,"PushAWidth");
        opcodes.put(2503,"PushAHeight");
        opcodes.put(1122,"cc_setSLM");
        opcodes.put(2000,"cc_positionX");
        opcodes.put(2300,"AddMenuActionX");
        opcodes.put(2117,"PopMaskX");
        opcodes.put(2105,"PushDImageX");
        opcodes.put(2414,"SetScriptParamAX");
        opcodes.put(2112,"PopDTextX");
        opcodes.put(2120,"PopScrollMaxesX");
        opcodes.put(2001,"cc_sizeX");
        opcodes.put(2122,"cc_setSLMX");
        opcodes.put(3408,"PushDataFile");
        opcodes.put(4000,"AddStack");
        opcodes.put(4001,"MinStack");
        opcodes.put(4002,"MultiplyStack");
        opcodes.put(4003,"DivideStack");
        opcodes.put(4004,"RndStack");
        opcodes.put(4005,"RmdStackA");
        opcodes.put(4006,"WF1Stack");
        opcodes.put(4007,"WF2Stack");
        opcodes.put(4011,"ModStack");
        opcodes.put(4012,"PowStack");
        opcodes.put(4013,"PowBZStack");
        opcodes.put(4014,"AndStack");
        opcodes.put(4015,"OrStack");
        opcodes.put(4016,"BiggestQStack");
        opcodes.put(4017,"BiggestStack");
        opcodes.put(4018,"MulDivStack");
        setters.put(1407,"ConfigReset");
        setters.put(1410,"LeftClick");
        setters.put(1411,"MouseDragged");
        setters.put(1412,"MouseMoved");
        setters.put(1415,"SkillChanged");
        setters.put(1428,"ConfigChanged");
        setters.put(1429,"StringPoolChanged");
        setters.put(1411,"MouseDragged");
        setters.put(1416,"IDK0");
        setters.put(1417,"IDK1");
        setters.put(1418,"IDK2");
        setters.put(1419,"KeyPressed");
        setters.put(1414,"InvChanged");
        setters.put(1404,"MouseLeaved");
        setters.put(1403,"MouseEntered");
        setters.put(1402,"MouseReleased");
        setters.put(1401,"MouseDraggedOver");
        setters.put(1400,"MousePressed");
    }
}
