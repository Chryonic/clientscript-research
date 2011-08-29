/* Class59_Sub51_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.sun.imageio.spi.OutputStreamImageOutputStreamSpi;

import java.io.OutputStream;

final class Cs2Script extends DoublyLinkedNode {
    static Js5Store scriptStore;
    static Class165 scriptCache = new Class165(128);
    int integerArgumentCount;
    int longVariableCount;
    JagexHashMap[] switchBlocks;
    String[] stringOperands;
    int stringArgumentCount;
    long[] longOperands;
    int longArgumentCount;
    int integerVariableCount;
    int stringVariableCount;
    int[] opcodes;
    Class211 aClass211_6339;
    String name;
    int[] integerOperands;

    public Cs2Script() {
        /* empty */
    }

    public static void decompileall(){
        int c = scriptStore.getFileCount();
        for (int i = 0; i < c;i++)
            try{
            Cs2Runtime.decompile(i);
            } catch (Exception e){
                System.err.println("error dec:"+i);
            }
    }

    static final Cs2Script get(int id) {
        Cs2Script script = (Cs2Script) scriptCache.get((long) id, 67);
        if (script != null)
            return script;
        byte[] data = scriptStore.getData(id, 0);
        if (data == null || data.length <= 1)
            return null;
        try {
            script = decode(data);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + id);
        }
        scriptCache.put(script, 120, (long) id);
        return script;
    }

    static final Cs2Script decode(byte[] data) {
        Cs2Script script = new Cs2Script();
        Packet packet = new Packet(data);
        packet.pos = packet.data.length - 2;
        int anLocalInt = packet.g2();
        int footerPos = (packet.data.length - anLocalInt - 16 - 2);
        packet.pos = footerPos;
        int instructionCount = packet.g4();
        script.integerVariableCount = packet.g2();
        script.stringVariableCount = packet.g2();
        script.longVariableCount = packet.g2();
        script.integerArgumentCount = packet.g2();
        script.stringArgumentCount = packet.g2();
        script.longArgumentCount = packet.g2();
        int switchBlockCount = packet.g1();      //17
        if (switchBlockCount > 0) {
            script.switchBlocks = new JagexHashMap[switchBlockCount];
            for (int switchBlockPtr = 0; switchBlockPtr < switchBlockCount; switchBlockPtr++) {
                int caseCount = packet.g2();
                JagexHashMap jagexHashMap = new JagexHashMap(MathStatics.method2589(caseCount));
                script.switchBlocks[switchBlockPtr] = jagexHashMap;
                while (caseCount-- > 0) {
                    int value = packet.g4();
                    int offset = packet.g4();
                    jagexHashMap.put((long) value, new IntegerNode(offset));
                }
            }
        }
        packet.pos = 0;
        script.name = packet.fastgstr((byte) 105);
        script.opcodes = new int[instructionCount];
        int instructionPointer = 0;
        while (packet.pos < footerPos) {
            int opcode = packet.g2();
            if (opcode == 3) {
                if ((script.stringOperands) == null)
                    script.stringOperands = new String[instructionCount];
                script.stringOperands[instructionPointer] = packet.gstr().intern();
            } else if (opcode == 54) {
                if ((script.longOperands) == null)
                    script.longOperands = new long[instructionCount];
                script.longOperands[instructionPointer] = packet.g8();
            } else {
                if ((script.integerOperands) == null)
                    script.integerOperands = new int[instructionCount];
                if (opcode >= 150 || opcode == 21 || opcode == 38 || opcode == 39)
                    script.integerOperands[instructionPointer] = packet.g1();
                else
                    script.integerOperands[instructionPointer] = packet.g4();
            }
            script.opcodes[instructionPointer++] = opcode;
        }
        return script;
    }

    static final Cs2Script get(int argument, int argument_8_, Class211 actionType) {
        int id = argument_8_ << 10 | actionType.anInt3600;
        Cs2Script script = ((Cs2Script) scriptCache.get((long) id << 16, 47));
        if (script != null)
            return script;
        byte[] data = (scriptStore.getFlatData(scriptStore.getID(id)));
        if (data != null) {
            if (data.length <= 1)
                return null;
            try {
                script = decode(data);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + id);
            }
            script.aClass211_6339 = actionType;
            scriptCache.put(script, 115, (long) id << 16);
            return script;
        }
        id = argument + 65536 << 10 | actionType.anInt3600;
        script = ((Cs2Script) scriptCache.get((long) id << 16, 55));
        if (script != null)
            return script;
        data = (scriptStore.getFlatData(scriptStore.getID(id)));
        if (data != null) {
            if (data.length <= 1)
                return null;
            try {
                script = decode(data);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + id);
            }
            script.aClass211_6339 = actionType;
            scriptCache.put(script, 123, (long) id << 16);
            return script;
        }
        id = actionType.anInt3600 | 0x3fffc00;
        script = ((Cs2Script) scriptCache.get((long) id << 16, 24));
        if (script != null)
            return script;
        data = (scriptStore.getFlatData(scriptStore.getID(id)));
        if (data != null) {
            if (data.length <= 1)
                return null;
            try {
                script = decode(data);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: " + id);
            }
            script.aClass211_6339 = actionType;
            scriptCache.put(script, 117, (long) id << 16);
            return script;
        }
        return null;
    }
}
