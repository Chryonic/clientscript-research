/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanVarbitSource {
    private Class149 hashmap = new Class149(64);
    private Js5Store store;

    final ClanVarbit get(int id) {
        ClanVarbit clanVarbit;
        synchronized (hashmap) {
            clanVarbit = (ClanVarbit) hashmap.get((long) id);
        }
        if (clanVarbit != null)
            return clanVarbit;
        byte[] data;
        synchronized (store) {
            data = store.getData(54, id);
        }
        clanVarbit = new ClanVarbit();
        if (data != null)
            clanVarbit.read(new Packet(data));
        synchronized (hashmap) {
            hashmap.put(clanVarbit, (long) id);
        }
        return clanVarbit;
    }

    final void clearCache() {
        synchronized (hashmap) {
            hashmap.clear((byte) -3);
        }
    }

    final void method2863() {
        synchronized (hashmap) {
            hashmap.method2540(14);
        }
    }

    final void method2864(int argument_7_) {
        synchronized (hashmap) {
            hashmap.method2534(argument_7_, (byte) -8);
        }
    }

    ClanVarbitSource(GameEnum argument_8_, Js5Store argument_10_) {
        store = argument_10_;
        if (store != null)
            store.getSubFileCount(54);
    }

}
