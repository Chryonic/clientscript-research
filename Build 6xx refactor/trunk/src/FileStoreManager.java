/* Class248 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.math.BigInteger;

final class FileStoreManager {
    private BigInteger n;
    private StreamingDataRequest metaFITRequest;
    private Js5Client js5Client;
    private ThreadSafeDiskBackedCache threadSafeDiskBackedCache;
    private FileStore[] fileStores;
    private BigInteger d;
    private Packet metaFITPacket;

    private FileStore createFileStore(boolean argument_0_, int cacheId, DiskBackedCache fitCache, DiskBackedCache fileCache) {
        if (metaFITPacket == null && !FileStore.DISABLE_USERVER)
            throw new RuntimeException();
        if (cacheId < 0 || fileStores.length <= cacheId)
            throw new RuntimeException();
        if (fileStores[cacheId] != null)
            return fileStores[cacheId];
        int fitCRC = 0,fitLength = 0;
        byte[] hashBytes = null;
        if (!FileStore.DISABLE_USERVER){
            metaFITPacket.pos = cacheId * 72 + 6;
            fitCRC = metaFITPacket.g4();
            fitLength = metaFITPacket.g4();
            hashBytes = new byte[64];
            metaFITPacket.gbytes(hashBytes, 0, 64);
        }
        FileStore fileStore
                = new FileStore(cacheId, fileCache, fitCache, js5Client, threadSafeDiskBackedCache, fitCRC,
                hashBytes, fitLength, argument_0_);
        fileStores[cacheId] = fileStore;
        return fileStore;
    }

    final boolean processMetaFIT() {
        if (FileStore.DISABLE_USERVER)
            fileStores = new FileStore[37];
        if (metaFITPacket != null || FileStore.DISABLE_USERVER)
            return true;
        if (metaFITRequest == null) {
            if (js5Client.request0QueueFull())
                return false;
            metaFITRequest = js5Client.requestData(255, 255, true, (byte) 0);//What noobs call uKeys
        }
        if (metaFITRequest.inProcessing)
            return false;
        Packet metaFIT = new Packet(metaFITRequest.getData());
        metaFIT.pos = 5;
        int indexCount = metaFIT.g1();
        metaFIT.pos += indexCount * 72;
        byte[] encryptedBytes = new byte[metaFIT.data.length - metaFIT.pos];
        metaFIT.gbytes(encryptedBytes, 0, encryptedBytes.length);
        byte[] decryptedBytes;
        if (d != null && n != null) {
            BigInteger c = new BigInteger(encryptedBytes);
            BigInteger m = c.modPow(d, n);
            decryptedBytes = m.toByteArray();
        } else
            decryptedBytes = encryptedBytes;
        if (decryptedBytes.length != 65)
            throw new RuntimeException();
        byte[] someHashBytes = JagexHash.calculateJagexHash(5, metaFIT.data, metaFIT.pos - encryptedBytes.length - 5);
        for (int _pos = 0; _pos < 64; _pos++) {
            if (someHashBytes[_pos] != decryptedBytes[_pos + 1])
                throw new RuntimeException();
        }
        metaFITPacket = metaFIT;
        fileStores = new FileStore[indexCount];
        return true;
    }

    final FileStore createFileStore(int cacheId, DiskBackedCache fileCache, DiskBackedCache fitCache) {
        return createFileStore(true, cacheId, fileCache, fitCache);
    }

    final void method3209() {
        if (fileStores != null) {
            for (int anLocalInt = 0;
                 fileStores.length > anLocalInt; anLocalInt++) {
                if (fileStores[anLocalInt] != null)
                    fileStores[anLocalInt].processRequests();
            }
            for (int anLocalInt = 0;
                 fileStores.length > anLocalInt; anLocalInt++) {
                if (fileStores[anLocalInt] != null)
                    fileStores[anLocalInt].processFiles();
            }
        }
    }

    FileStoreManager(Js5Client js5Client, ThreadSafeDiskBackedCache threadSafeDiskBackedCache, BigInteger d, BigInteger n) {
        this.n = n;
        this.js5Client = js5Client;
        this.d = d;
        this.threadSafeDiskBackedCache = threadSafeDiskBackedCache;
        if (!this.js5Client.request0QueueFull())
            metaFITRequest = this.js5Client.requestData(255, 255, true, (byte) 0);
    }
}
