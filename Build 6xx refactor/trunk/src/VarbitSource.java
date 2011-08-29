/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */


final class VarbitSource {
    private Class149 hashmap = new Class149(64);
    private Js5Store varbitStore;

    final void method1696(int argument_0_) {
        synchronized (hashmap) {
            hashmap.method2534(argument_0_, (byte) -8);
        }
    }

    final void method1697() {
        synchronized (hashmap) {
            hashmap.method2540(-124);
        }
    }

    final VarBit get(int val) {
        VarBit varbit;
        synchronized (hashmap) {
            varbit = (VarBit) hashmap.get((long) val);
        }
        if (varbit != null)
            return varbit;
        byte[] data;
        synchronized (varbitStore) {
            data = (varbitStore.getData(MathStatics.shl10(val), MathStatics.and3ff(val)));
        }
        varbit = new VarBit();
        if (data != null)
            varbit.read(new Packet(data));
        synchronized (hashmap) {
            hashmap.put(varbit, (long) val);
        }
        return varbit;
    }

    final void resizeCache(int size) {
        synchronized (hashmap) {
            hashmap.clear((byte) -3);
            hashmap = new Class149(size);
        }
    }

    final void clearCache() {
        synchronized (hashmap) {
            hashmap.clear((byte) -3);
        }
    }

    VarbitSource(GameEnum argument_8_, Js5Store store) {
        varbitStore = store;
        if (varbitStore != null) {
            int lastFile = varbitStore.getRealSubFileCount() - 1;
            varbitStore.getSubFileCount(lastFile);
        }
    }
}
