/* Class216_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.zip.CRC32;

final class FileStore extends AbstractFileStore {
    static CRC32 crc = new CRC32();
    private byte[] fitHash;
    private Js5Client myJs5Client;
    private JagexHashMap requestHashmap;
    private FileInformationTable fileInformationTable;
    private byte[] fileStatus;
    private int fitCRC;
    private int fitSize;
    private ThreadSafeDiskBackedCache myThreadSafeDiskBackedCache;
    private int completeFiles = 0;
    private DiskBackedCache fitCache;
    private DataRequest fitRequest;
    private int storeId;
    private DiskBackedCache fileCache;
    private int maxLoadedFile;
    private CyclicLinkedList requestQueue;
    private boolean aBoolean5289;
    private CyclicLinkedList completedFiles;
    private boolean aBoolean5291;
    private boolean finiteRetention;
    private long nextGC;

    public static final boolean DISABLE_USERVER = true;

    final void processRequests() {
        if (completedFiles != null && getFIT() != null) {
            for (Node node = requestQueue.getFirst(); node != null; node = requestQueue.getNext()) {
                int fileId = (int) node.hash;
                if (fileId < 0 || fileId >= fileInformationTable.realFileCount || (fileInformationTable.subFileCount[fileId] == 0))
                    node.unlink();
                else {
                    if (fileStatus[fileId] == 0)
                        processFile(fileId, 1);
                    if (fileStatus[fileId] == -1)
                        processFile(fileId, 2);
                    if (fileStatus[fileId] == 1)
                        node.unlink();
                }
            }
        }
    }

    final int getCompleteFileCount() {
        return completeFiles;
    }

    final byte[] getFile(int id) {
        DataRequest request = processFile(id, 0);
        if (request == null)
            return null;
        byte[] data = request.getData();
        request.unlink();
        return data;
    }

    final int getHighestCompleteFile() {
        if (fileInformationTable == null)
            return 0;
        if (!aBoolean5289)
            return fileInformationTable.fileCount;
        Node node = completedFiles.getFirst();
        if (node == null)
            return 0;
        return (int) node.hash;
    }

    final void reset() {
        if (fileCache != null) {
            aBoolean5291 = true;
            if (completedFiles == null)
                completedFiles = new CyclicLinkedList();
        }
    }

    final int getFileProgress(int id) {
        DataRequest req = ((DataRequest) requestHashmap.get((long) id));
        if (req != null)
            return req.getProgress();
        return 0;
    }

    final void processFiles() {
        if (completedFiles != null) {
            if (getFIT() == null)
                return;
            if (!aBoolean5289) {
                if (aBoolean5291) {
                    boolean anLocalBoolean = true;
                    for (Node node = completedFiles.getFirst(); node != null; node = completedFiles.getNext()) {
                        int anLocalInt = (int) node.hash;
                        if (fileStatus[anLocalInt] != 1)
                            processFile(anLocalInt, 2);
                        if (fileStatus[anLocalInt] != 1)
                            anLocalBoolean = false;
                        else
                            node.unlink();
                    }
                    while (maxLoadedFile < (fileInformationTable.subFileCount).length) {
                        if ((fileInformationTable.subFileCount[maxLoadedFile]) == 0)
                            maxLoadedFile++;
                        else {
                            if (myJs5Client.request1QueueFull()) {
                                anLocalBoolean = false;
                                break;
                            }
                            if (fileStatus[maxLoadedFile] != 1)
                                processFile(maxLoadedFile, 2);
                            if (fileStatus[maxLoadedFile] != 1) {
                                Node node = new Node();
                                node.hash = (long) maxLoadedFile;
                                anLocalBoolean = false;
                                completedFiles.add(node);
                            }
                            maxLoadedFile++;
                        }
                    }
                    if (anLocalBoolean) {
                        aBoolean5291 = false;
                        maxLoadedFile = 0;
                    }
                } else
                    completedFiles = null;
            } else {
                boolean anLocalBoolean = true;
                for (Node node = completedFiles.getFirst(); node != null; node = completedFiles.getNext()) {
                    int fileId = (int) node.hash;
                    if (fileStatus[fileId] == 0)
                        processFile(fileId, 1);
                    if (fileStatus[fileId] == 0)
                        anLocalBoolean = false;
                    else
                        node.unlink();
                }
                while (maxLoadedFile < fileInformationTable.subFileCount.length) {
                    if (fileInformationTable.subFileCount[maxLoadedFile] == 0)
                        maxLoadedFile++;
                    else {
                        if (myThreadSafeDiskBackedCache.remainingRequests >= 250) {
                            anLocalBoolean = false;
                            break;
                        }
                        if (fileStatus[maxLoadedFile] == 0)
                            processFile(maxLoadedFile, 1);
                        if (fileStatus[maxLoadedFile] == 0) {
                            Node node = new Node();
                            node.hash = (long) maxLoadedFile;
                            completedFiles.add(node);
                            anLocalBoolean = false;
                        }
                        maxLoadedFile++;
                    }
                }
                if (anLocalBoolean) {
                    aBoolean5289 = false;
                    maxLoadedFile = 0;
                }
            }
        }
        if (finiteRetention && Applet_Sub1.getGameTime() >= nextGC) {
            for (DataRequest req = (DataRequest) requestHashmap.first(0); req != null; req = ((DataRequest) requestHashmap.next())) {
                if (!req.inProcessing) {
                    if (req.aBoolean6239) {
                        if (!req.aBoolean6238)
                            throw new RuntimeException();
                        req.unlink();
                    } else
                        req.aBoolean6239 = true;
                }
            }
            nextGC = Applet_Sub1.getGameTime() + 1000L;
        }
    }

    final int getFileCount() {
        if (fileInformationTable == null)
            return 0;
        return fileInformationTable.fileCount;
    }

    final FileInformationTable getFIT() {
        if (fileInformationTable != null)
            return fileInformationTable;
        if (fitRequest == null) {
            if (myJs5Client.request0QueueFull())
                return null;
            fitRequest = myJs5Client.requestData(255, storeId, true, (byte) 0);
        }
        if (fitRequest.inProcessing)
            return null;
        byte[] fitData = fitRequest.getData();
        do {
            if (fitRequest instanceof CacheDataRequest) {
                try {
                    if (fitData == null)
                        throw new RuntimeException();
                    if (storeId == 3)
                        System.out.println("orly");
                    fileInformationTable = new FileInformationTable(fitData, fitCRC, fitHash);
                    if (storeId == 3)
                        System.out.println("orly");
                    if (fileInformationTable.unknown != fitSize && !FileStore.DISABLE_USERVER)
                        throw new RuntimeException();
                    break;
                } catch (RuntimeException runtimeexception) {
                    fileInformationTable = null;
                    if (myJs5Client.request0QueueFull())
                        fitRequest = null;
                    else
                        fitRequest = myJs5Client.requestData(255, storeId, true, (byte) 0);
                    return null;
                }
            }
            try {
                if (fitData == null)
                    throw new RuntimeException();
                fileInformationTable = new FileInformationTable(fitData, fitCRC, fitHash);
            } catch (RuntimeException runtimeexception) {
                myJs5Client.setupXORCipher();
                fileInformationTable = null;
                if (myJs5Client.request0QueueFull())
                    fitRequest = null;
                else
                    fitRequest = myJs5Client.requestData(255, storeId, true, (byte) 0);
                return null;
            }
            if (fitCache != null)
                myThreadSafeDiskBackedCache.requestPut(fitCache, storeId, fitData);
        } while (false);
        fitRequest = null;
        if (fileCache != null) {
            fileStatus = new byte[fileInformationTable.realFileCount];
            completeFiles = 0;
        }
        return fileInformationTable;
    }

    final void request(int id) {
        if (fileCache != null) {
            Node node = requestQueue.getFirst();
            for (/**/; node != null; node = requestQueue.getNext()) {
                if ((long) id == node.hash)
                    return;
            }
            Node node_15_ = new Node();
            node_15_.hash = (long) id;
            requestQueue.add(node_15_);
        }
    }

    final int getFITProgress() {
        if (getFIT() == null) {
            if (fitRequest == null)
                return 0;
            return fitRequest.getProgress();
        }
        return 100;
    }

    private DataRequest processFile(int id, int action) {
        DataRequest request = ((DataRequest) requestHashmap.get((long) id));
        if (request != null && action == 0 && !request.aBoolean6238 && request.inProcessing) {
            request.unlink();
            request = null;
        }
        if (request == null) {
            switch (action) {
                case 0:
                    if (fileCache == null || fileStatus[id] == -1) {
                        if (!myJs5Client.request0QueueFull())
                            request = myJs5Client.requestData(storeId, id, true, (byte) 2);
                        else
                            return null;
                    } else
                        request = myThreadSafeDiskBackedCache.requestGet(fileCache, id);
                    break;
                case 1:
                    if (fileCache == null)
                        throw new RuntimeException();
                    request = myThreadSafeDiskBackedCache.requestCacheAccess(3, fileCache, id);
                    break;
                case 2:
                    if (fileCache == null)
                        throw new RuntimeException();
                    if (fileStatus[id] != -1)
                        throw new RuntimeException();
                    if (myJs5Client.request1QueueFull())
                        return null;
                    request = myJs5Client.requestData(storeId, id, false, (byte) 2);
                    break;
                default:
                    throw new RuntimeException();
            }
            requestHashmap.put((long) id, request);
        }
        if (request.inProcessing)
            return null;
        byte[] data = request.getData();
        if (!(request instanceof CacheDataRequest)) {
            try {
                if (data == null || data.length <= 2)
                    throw new RuntimeException();
                crc.reset();
                crc.update(data, 0, data.length - 2);
                int fileCRC = (int) crc.getValue();
                if (fileCRC != fileInformationTable.fileCRC[id] && !FileStore.DISABLE_USERVER)
                    throw new RuntimeException();
                if (fileInformationTable.fileHash != null && (fileInformationTable.fileHash[id]) != null) {
                    byte[] expectedHash = (fileInformationTable.fileHash[id]);
                    byte[] factualHash = JagexHash.calculateJagexHash(0, data, data.length - 2);
                    for (int _hashptr = 0; _hashptr < 64; _hashptr++) {
                        if (expectedHash[_hashptr] != factualHash[_hashptr] && !FileStore.DISABLE_USERVER)
                            throw new RuntimeException();
                    }
                }
                myJs5Client.exceptionCount = 0;
                myJs5Client.status = 0;
            } catch (RuntimeException runtimeexception) {
                myJs5Client.setupXORCipher();
                request.unlink();
                if (request.aBoolean6238 && !myJs5Client.request0QueueFull()) {
                    StreamingDataRequest request1 = myJs5Client.requestData(storeId, id, true, (byte) 2);
                    requestHashmap.put((long) id, request1);
                }
                return null;
            }
            data[data.length - 2] = (byte) (fileInformationTable.version[id] >>> 8);
            data[data.length - 1] = (byte) fileInformationTable.version[id];
            if (fileCache != null) {
                myThreadSafeDiskBackedCache.requestPut(fileCache, id, data);
                if (fileStatus[id] != 1) {
                    completeFiles++;
                    fileStatus[id] = (byte) 1;
                }
            }
            if (!request.aBoolean6238)
                request.unlink();
            return request;
        }
        try {
            if (data == null || data.length <= 2)
                throw new RuntimeException();
            crc.reset();
            crc.update(data, 0, data.length - 2);
            int fileCRC = (int) crc.getValue();
            if (fileCRC != fileInformationTable.fileCRC[id] && !FileStore.DISABLE_USERVER)
                throw new RuntimeException();
            if (fileInformationTable.fileHash != null && (fileInformationTable.fileHash[id] != null)) {
                byte[] expectedHash = (fileInformationTable.fileHash[id]);
                byte[] factualHash = JagexHash.calculateJagexHash(0, data, data.length - 2);
                for (int _hashptr = 0; _hashptr < 64; _hashptr++) {
                    if (expectedHash[_hashptr] != factualHash[_hashptr] && !FileStore.DISABLE_USERVER)
                        throw new RuntimeException();
                }
            }
            int version = ((data[data.length - 1] & 0xff) + (data[data.length - 2] << 8 & 0xff00));
            if (version != (fileInformationTable.version[id] & 0xffff) && !FileStore.DISABLE_USERVER)
                throw new RuntimeException();
            if (fileStatus[id] != 1) {
                completeFiles++;
                fileStatus[id] = (byte) 1;
            }
            if (!request.aBoolean6238)
                request.unlink();
            return request;
        } catch (Exception exception) {
            fileStatus[id] = (byte) -1;
            request.unlink();
            if (request.aBoolean6238 && !myJs5Client.request0QueueFull()) {
                StreamingDataRequest request1 = myJs5Client.requestData(storeId, id, true, (byte) 2);
                requestHashmap.put((long) id, request1);
            }
            return null;
        }
    }

    FileStore(int storeId, DiskBackedCache fileCache, DiskBackedCache fitCache, Js5Client js5client, ThreadSafeDiskBackedCache tsdbc, int fitCRC, byte[] fitHash, int fitSize, boolean argument_37_) {
        requestHashmap = new JagexHashMap(16);
        maxLoadedFile = 0;
        requestQueue = new CyclicLinkedList();
        nextGC = 0L;
        this.storeId = storeId;
        this.fileCache = fileCache;
        if (this.fileCache != null) {
            aBoolean5289 = true;
            completedFiles = new CyclicLinkedList();
        } else
            aBoolean5289 = false;
        this.fitCRC = fitCRC;
        myThreadSafeDiskBackedCache = tsdbc;
        this.fitSize = fitSize;
        myJs5Client = js5client;
        this.fitHash = fitHash;
        this.fitCache = fitCache;
        finiteRetention = argument_37_;
        if (this.fitCache != null)
            fitRequest = myThreadSafeDiskBackedCache.requestGet(this.fitCache, this.storeId);
    }
}
