package co.cc.peterbjornx.cs2ide.re;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 10:14 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class Cs2Function {
    static HashMap<Long,Cs2Function> cache = new HashMap<Long, Cs2Function>();
    int integerArgumentCount;
    int longVariableCount;
    HashMap[] switchBlocks;
    String[] stringOperands;
    int stringArgumentCount;
    long[] longOperands;
    int longArgumentCount;
    int integerVariableCount;
    int stringVariableCount;
    int[] opcodes;
    String name;
    int[] integerOperands;
    int id;

    static Cs2Function get(int id) {
        Cs2Function script = cache.get((long) id);
        if (script != null)
            return script;
        byte[] data = getScriptData(id);
        if (data == null || data.length <= 1)
            return null;
        try {
            script = decode(data);
            script.id = id;
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + id);
        }
        cache.put((long) id, script);
        return script;
    }

    private static byte[] getScriptData(int id) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("../cs2bin/"+id+".csbin"));
            byte[] d = new byte[dis.available()];
            dis.readFully(d);
            return d;
        } catch (IOException e) {
            return null;
        }
    }

    public static String getString(ByteBuffer b){
        String s = "";
        while (true) {
            char c = (char) (b.get() & 0xff);
            if (c == '\0')
                return s;
            s += c;
        }
    }

    static Cs2Function decode(byte[] data) {
        Cs2Function script = new Cs2Function();
        ByteBuffer packet = ByteBuffer.wrap(data);
        packet.position(data.length - 2);
        int anLocalInt = packet.getShort();
        int footerPos = (data.length - anLocalInt - 16 - 2);
        packet.position(footerPos);
        int instructionCount = packet.getInt();
        script.integerVariableCount = packet.getShort()&0xFFFF;
        script.stringVariableCount = packet.getShort()&0xFFFF;
        script.longVariableCount = packet.getShort()&0xFFFF;
        script.integerArgumentCount = packet.getShort()&0xFFFF;
        script.stringArgumentCount = packet.getShort()&0xFFFF;
        script.longArgumentCount = packet.getShort()&0xFFFF;
        int switchBlockCount = packet.get()&0xFF;      //17
        if (switchBlockCount > 0) {
            script.switchBlocks = new HashMap[switchBlockCount];
            for (int switchBlockPtr = 0; switchBlockPtr < switchBlockCount; switchBlockPtr++) {
                int caseCount = packet.getShort() & 0xFFFF;
                HashMap jagexHashMap = new HashMap(caseCount);
                script.switchBlocks[switchBlockPtr] = jagexHashMap;
                while (caseCount-- > 0) {
                    int value = packet.getInt();
                    int offset = packet.getInt();
                    jagexHashMap.put((long) value, offset);
                }
            }
        }
        packet.position(0);
        script.name = getString(packet);
        script.opcodes = new int[instructionCount];
        int instructionPointer = 0;
        while (packet.position() < footerPos) {
            int opcode = packet.getShort()&0xFF;
            if (opcode == 3) {
                if ((script.stringOperands) == null)
                    script.stringOperands = new String[instructionCount];
                script.stringOperands[instructionPointer] = getString(packet).intern();
            } else if (opcode == 54) {
                if ((script.longOperands) == null)
                    script.longOperands = new long[instructionCount];
                script.longOperands[instructionPointer] = packet.getLong();
            } else {
                if ((script.integerOperands) == null)
                    script.integerOperands = new int[instructionCount];
                if (opcode >= 150 || opcode == 21 || opcode == 38 || opcode == 39)
                    script.integerOperands[instructionPointer] = packet.get()&0xff;
                else
                    script.integerOperands[instructionPointer] = packet.getInt();
            }
            script.opcodes[instructionPointer++] = opcode;
        }
        return script;
    }
}
