/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClientVariables implements VariableValueSource {
    static VarbitSource varbitSource;
    static ClientVariables instance;
    private int[] defaultValues;
    int[] values;
    private JagexHashMap resetTimes = new JagexHashMap(128);

    final int resetOld(boolean argument_0_) {
        long time = Applet_Sub1.getGameTime();
        for (LongNode longNode = (!argument_0_ ? (LongNode) resetTimes.next() : (LongNode) resetTimes.first(0)); longNode != null; longNode = (LongNode) resetTimes.next()) {
            if (time > (longNode.value & 0x3fffffffffffffffL)) {
                if ((longNode.value & 0x4000000000000000L) == 0L)
                    longNode.unlink();
                else {
                    int index = (int) longNode.hash;
                    this.values[index] = defaultValues[index];
                    longNode.unlink();
                    return index;
                }
            }
        }
        return -1;
    }

    final void setVarbitDefault(int varbitId, int value) {
        VarBit varbit = varbitSource.get(varbitId);
        int index = varbit.index;
        int startBit = varbit.startBitIndex;
        int endBit = varbit.endBitIndex;
        int mask = Class359.bitMasks[endBit - startBit];
        if (value < 0 || mask < value)
            value = 0;
        mask <<= startBit;
        setDefault(index, (defaultValues[index] & (~mask) | mask & value << startBit));
    }

    final void set(int index, int value) {
        this.values[index] = value;
        LongNode longNode = (LongNode) resetTimes.get((long) index);
        if (longNode != null)
            longNode.value = Applet_Sub1.getGameTime() + 500L;
        else {
            longNode = new LongNode(Applet_Sub1.getGameTime() + 500L);
            resetTimes.put((long) index, longNode);
        }
    }

    final void resetAll() {
        for (int index = 0; index < JagexHash.aClass58_1682.anInt424; index++) {
            Class79 class79 = JagexHash.aClass58_1682.method521(index, (byte) -125);
            if (class79 != null && class79.anInt566 == 0) {
                defaultValues[index] = 0;
                this.values[index] = 0;
            }
        }
        resetTimes = new JagexHashMap(128);
    }

    public final int getVarbit(int varbitId, int argument_13_) {
        VarBit varbit = varbitSource.get(varbitId);
        int index = varbit.index;
        int startBit = varbit.startBitIndex;
        int endBit = varbit.endBitIndex;
        int and = Class359.bitMasks[endBit - startBit];
        return (this.values[index] >> startBit & and);
    }

    public final int get(int argument_17_, int index) {
        return this.values[index];
    }

    final void setDefault(int index, int value) {
        defaultValues[index] = value;
        LongNode longNode = ((LongNode) resetTimes.get((long) index));
        if (longNode == null) {
            longNode = new LongNode(4611686018427387905L);
            resetTimes.put((long) index, longNode);
        } else if (longNode.value != 4611686018427387905L)
            longNode.value = Applet_Sub1.getGameTime() + 500L | 0x4000000000000000L;
    }

    final void setVarbit(int varbitId, int value, int argument_24_) {
        VarBit varbit = varbitSource.get(varbitId);
        int index = varbit.index;
        int startBit = varbit.startBitIndex;
        int endBit = varbit.endBitIndex;
        int mask = Class359.bitMasks[endBit - startBit];
        if (argument_24_ > value || value > mask)
            value = 0;
        mask <<= startBit;
        set(index, ((this.values[index] & (~mask)) | value << startBit & mask));
    }

    public ClientVariables() {
        defaultValues = new int[JagexHash.aClass58_1682.anInt424];
        this.values = new int[JagexHash.aClass58_1682.anInt424];
    }
}
