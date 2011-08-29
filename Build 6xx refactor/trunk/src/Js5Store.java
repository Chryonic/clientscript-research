/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Js5Store {
    private Object[][] subFileBuffer;
    private boolean useArrayBuffers;
    private AbstractFileStore myFileStore;
    private Object[] fileBuffer;
    int discardUnpacked;
    private FileInformationTable myFIT = null;

    static byte[] unpackContainer(byte[] data) {
        Packet packet = new Packet(data);
        int compression = packet.g1();
        int compressedSize = packet.g4();
        if (compressedSize < 0 || (Statics.anInt5577 != 0 && compressedSize > Statics.anInt5577))
            throw new RuntimeException();
        if (compression == 0) {
            byte[] decompressedBytes = new byte[compressedSize];
            packet.gbytes(decompressedBytes, 0, compressedSize);
            return decompressedBytes;
        }
        int decompressedSize = packet.g4();
        if (decompressedSize < 0 || (Statics.anInt5577 != 0
                      && Statics.anInt5577 < decompressedSize))
            throw new RuntimeException();
        byte[] decompressedBytes = new byte[decompressedSize];
        if (compression != 1) {
            //noinspection SynchronizeOnNonFinalField
            synchronized (client.gzipInflater) {
                client.gzipInflater.inflate(decompressedBytes, packet);
            }
        } else
            Bzip2Decompressor.decompressBzip2(decompressedBytes, decompressedSize, data, compressedSize, 9);
        return decompressedBytes;
    }

    final boolean isLoaded(int fileId) {
        if (!isFileIdValid(fileId))
            return false;
        if (fileBuffer[fileId] != null)
            return true;
        loadFileToBuffer(fileId);
        return fileBuffer[fileId] != null;
    }

    private boolean isFITAvailable() {
        if (myFIT == null) {
            myFIT = myFileStore.getFIT();
            if (myFIT == null)
                return false;
            fileBuffer = new Object[myFIT.realFileCount];
            subFileBuffer = new Object[myFIT.realFileCount][];
        }
        return true;
    }

    final int getSubFileCount(int argument_4_) {
        if (!isFileIdValid(argument_4_))
            return 0;
        return myFIT.realSubFileCount[argument_4_];
    }

    final int getID(String name) {
        try{
        if (!isFITAvailable())
            return -1;
        name = name.toLowerCase();
        int id = myFIT.nameTable.getIDForHash(client.calcStringHash(name));
        if (!isFileIdValid(id))
            return -1;
        return id;
        }catch (RuntimeException e) {
            throw e;
        }
    }

    final void clearFileBuffer() {
        if (fileBuffer != null) {
            for (int _fileptr = 0; _fileptr < fileBuffer.length; _fileptr++)
                fileBuffer[_fileptr] = null;
        }
    }

    final int getRealSubFileCount() {
        if (!isFITAvailable())
            return -1;
        return myFIT.realSubFileCount.length;
    }

    final byte[] getData(int fileId, int subFileId) {
        return getData(fileId, subFileId, null);
    }

    final void clearFeatures(boolean clearSubFiles, boolean clearNameHashes) {
        if (isFITAvailable()) {
            if (clearSubFiles) {
                myFIT.subFileNameTable = null;
                myFIT.subFileNameHashes = null;
            }
            if (clearNameHashes) {
                //myFIT.nameHashes = null;
                //myFIT.nameTable = null;
            }
        }
    }

    private void loadFileToBuffer(int fileId) {
        if (!useArrayBuffers)
            fileBuffer[fileId] = Class183_Sub1.wrap(myFileStore.getFile(fileId), false, -137);
        else
            fileBuffer[fileId] = myFileStore.getFile(fileId);
    }

    final boolean fileExists(String name) {
        if (!isFITAvailable())
            return false;
        name = name.toLowerCase();
        int id = myFIT.nameTable.getIDForHash(client.calcStringHash(name));
        return id >= 0;
    }

    private void request(int id) {
        myFileStore.request(id);
    }

    final int getID(int hash) {
        if (!isFITAvailable())
            return -1;
        int id = myFIT.nameTable.getIDForHash(hash);
        if (!isFileIdValid(id))
            return -1;
        return id;
    }

    private boolean isFileIdValid(int fileId, int subFileId) {
        if (!isFITAvailable())
            return false;
        if (fileId < 0 || subFileId < 0 || fileId >= myFIT.realSubFileCount.length || (myFIT.realSubFileCount[fileId] <= subFileId)) {
            if (!DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6567)
                return false;
            throw new IllegalArgumentException(String.valueOf(fileId) + "," + subFileId);
        }
        return true;
    }

    final void request(String name) {
        if (isFITAvailable()) {
            name = name.toLowerCase();
            int id = (myFIT.nameTable.getIDForHash(client.calcStringHash(name)));
            request(id);
        }
    }

    final int getProgress() {
        if (!isFITAvailable())
            return 0;
        int divider = 0;
        int total = 0;
        for (int fileId = 0; fileId < fileBuffer.length; fileId++) {
            if (myFIT.subFileCount[fileId] > 0) {
                divider += 100;
                total += getFileProgress(fileId);
            }
        }
        if (divider == 0)
            return 100;
        return total * 100 / divider;
    }

    final boolean isFlatFile(int fileId) {
        if (!isFITAvailable())
            return false;
        if (myFIT.realSubFileCount.length == 1)
            return isLoaded(0, fileId);
        if (!isFileIdValid(fileId))
            return false;
        if (myFIT.realSubFileCount[fileId] == 1)
            return isLoaded(fileId, 0);
        throw new RuntimeException();
    }

    final boolean fileExists(String name, String subName) {
        if (!isFITAvailable())
            return false;
        name = name.toLowerCase();
        subName = subName.toLowerCase();
        int id = myFIT.nameTable.getIDForHash(client.calcStringHash(name));
        if (id < 0)
            return false;
        int subid = myFIT.subFileNameTable[id].getIDForHash(client.calcStringHash(subName));
        return subid >= 0;
    }

    private boolean isLoaded(String name, String subName) {
        if (!isFITAvailable())
            return false;
        name = name.toLowerCase();
        subName = subName.toLowerCase();
        int mainId = (myFIT.nameTable.getIDForHash(client.calcStringHash(name)));
        if (!isFileIdValid(mainId))
            return false;
        int subId = myFIT.subFileNameTable[mainId].getIDForHash(client.calcStringHash(subName));
        return isLoaded(mainId, subId);
    }

    private int getFileProgress(int fileId) {
        if (!isFileIdValid(fileId))
            return 0;
        if (fileBuffer[fileId] != null)
            return 100;
        return myFileStore.getFileProgress(fileId);
    }

    final int[] getSubFilePtr(int fileId) {
        if (!isFileIdValid(fileId))
            return null;
        int[] subFileIds = myFIT.subFilePtr[fileId];
        if (subFileIds == null) {
            subFileIds = new int[myFIT.subFileCount[fileId]];
            for (int subFileId = 0; subFileId < subFileIds.length; subFileId++)
                subFileIds[subFileId] = subFileId;
        }
        return subFileIds;
    }

    final byte[] getData(int fileId, int subId, int[] keys) {
        if (!isFileIdValid(fileId, subId))
            return null;
        if (subFileBuffer[fileId] == null || subFileBuffer[fileId][subId] == null) {
            boolean succeeded = unpackFile(fileId, subId, keys);
            if (!succeeded) {
                loadFileToBuffer(fileId);
                succeeded = unpackFile(fileId, subId, keys);
                if (!succeeded)
                    return null;
            }
        }
        byte[] subFileData = Class183_Sub1.unwrap((subFileBuffer[fileId][subId]), false, -2 ^ ~0x11);
        if (this.discardUnpacked == 1) {
            subFileBuffer[fileId][subId] = null;
            if (myFIT.realSubFileCount[fileId] == 1)
                subFileBuffer[fileId] = null;
        } else if (this.discardUnpacked == 2)
            subFileBuffer[fileId] = null;
        return subFileData;
    }

    final boolean isLoaded(String name) {
        if (!isFITAvailable())
            return false;
        name = name.toLowerCase();
        int id = myFIT.nameTable.getIDForHash(client.calcStringHash(name));
        return isLoaded(id);
    }

    final byte[] getData(String name, String subName) {
        if (!isFITAvailable())
            return null;
        name = name.toLowerCase();
        subName = subName.toLowerCase();
        int id = (myFIT.nameTable.getIDForHash(client.calcStringHash(name)));
        if (!isFileIdValid(id))
            return null;
        int subId = myFIT.subFileNameTable[id].getIDForHash(client.calcStringHash(subName));
        return getData(id, subId);
    }

    final int getFitCRC() {
        if (!isFITAvailable())
            throw new IllegalStateException("");
        return myFIT.fitCRC;
    }

    final boolean preloadAll() {
        if (!isFITAvailable())
            return false;
        boolean allLoaded = true;
        for (int fileId = 0; myFIT.realFilePtr.length > fileId; fileId++) {
            int rFileId = myFIT.realFilePtr[fileId];
            if (fileBuffer[rFileId] == null) {
                loadFileToBuffer(rFileId);
                if (fileBuffer[rFileId] == null)
                    allLoaded = false;
            }
        }
        return allLoaded;
    }

    final byte[] getFlatData(int fileId) {
        if (!isFITAvailable())
            return null;
        if (myFIT.realSubFileCount.length == 1)
            return getData(0, fileId);
        if (!isFileIdValid(fileId))
            return null;
        if (myFIT.realSubFileCount[fileId] == 1)
            return getData(fileId, 0);
        throw new RuntimeException();
    }

    final boolean exists(String argument_65_) {
        int emptyId = getID("");
        if (emptyId != -1)
            return isLoaded("", argument_65_);
        return isLoaded(argument_65_, "");
    }

    final int getFileProgress(String name) {
        if (!isFITAvailable())
            return 0;
        name = name.toLowerCase();
        int anLocalInt = myFIT.nameTable.getIDForHash(client.calcStringHash(name));
        return getFileProgress(anLocalInt);
    }

    final void clearSubFileBuffer(int fileId) {
        if (isFileIdValid(fileId)) {
            if (subFileBuffer != null)
                subFileBuffer[fileId] = null;
        }
    }

    private boolean unpackFile(int fileId, int subId, int[] keys) {
        if (!isFileIdValid(fileId))
            return false;
        if (fileBuffer[fileId] == null)
            return false;
        int subFileCount = myFIT.subFileCount[fileId];
        int[] subFilePtr = myFIT.subFilePtr[fileId];
        if (subFileBuffer[fileId] == null)
            subFileBuffer[fileId] = (new Object[myFIT.realSubFileCount[fileId]]);
        Object[] subFileBuffer = this.subFileBuffer[fileId];
        boolean fileComplete = true;
        for (int subFileId = 0; subFileId < subFileCount; subFileId++) {
            int rSubFileId;
            if (subFilePtr == null)
                rSubFileId = subFileId;
            else
                rSubFileId = subFilePtr[subFileId];
            if (subFileBuffer[rSubFileId] == null) {
                fileComplete = false;
                break;
            }
        }
        if (fileComplete)
            return true;
        byte[] decodedData;
        if (keys == null || (keys[0] == 0 && keys[1] == 0 && keys[2] == 0 && keys[3] == 0))
            decodedData = Class183_Sub1.unwrap(fileBuffer[fileId], false, 16);
        else {
            decodedData = Class183_Sub1.unwrap(fileBuffer[fileId], true, 16);
            Packet decodePkt = new Packet(decodedData);
            decodePkt.decodeXTEA(5, (decodePkt.data).length, keys);
        }
        byte[] decompressedData = unpackContainer(decodedData);
        if (useArrayBuffers)
            fileBuffer[fileId] = null;
        if (subFileCount <= 1) {
            int rSubFileId;
            if (subFilePtr == null)
                rSubFileId = 0;
            else
                rSubFileId = subFilePtr[0];
            if (this.discardUnpacked == 0)
                subFileBuffer[rSubFileId] = Class183_Sub1.wrap(decompressedData, false, -137);
            else
                subFileBuffer[rSubFileId] = decompressedData;
        } else if (this.discardUnpacked == 2) {
            int dataPos = decompressedData.length;
            int chunkCount = decompressedData[--dataPos] & 0xff;
            dataPos -= subFileCount * 4 * chunkCount;
            Packet packet = new Packet(decompressedData);
            int subFileLength = 0;
            packet.pos = dataPos;
            int tSubFileId = 0;
            for (int somePtr = 0; somePtr  < chunkCount; somePtr ++) {
                int blockLength = 0;
                for (int subFileId = 0; subFileId < subFileCount; subFileId++) {
                    blockLength += packet.g4();
                    int rSubFileId;
                    if (subFilePtr != null)
                        rSubFileId = subFilePtr[subFileId];
                    else
                        rSubFileId = subFileId;
                    if (subId == rSubFileId) {
                        tSubFileId = rSubFileId;
                        subFileLength += blockLength;
                    }
                }
            }
            if (subFileLength == 0)
                return true;
            byte[] subFileData = new byte[subFileLength];
            subFileLength = 0;
            packet.pos = dataPos;
            int inPos = 0;
            for (int chunkPtr = 0; chunkCount > chunkPtr; chunkPtr++) {
                int blockSize = 0;
                for (int subFileId = 0; subFileId < subFileCount; subFileId++) {
                    blockSize += packet.g4();
                    int rSubFileId;
                    if (subFilePtr != null)
                        rSubFileId = subFilePtr[subFileId];
                    else
                        rSubFileId = subFileId;
                    if (subId == rSubFileId) {
                        JagStrings.memcpy(decompressedData, inPos, subFileData, subFileLength, blockSize);
                        subFileLength += blockSize;
                    }
                    inPos += blockSize;
                }
            }
            subFileBuffer[tSubFileId] = subFileData;
        } else {
            int dataPos = decompressedData.length;
            int chunkCount = decompressedData[--dataPos] & 0xff;
            dataPos -= subFileCount * chunkCount * 4;
            Packet packet = new Packet(decompressedData);
            packet.pos = dataPos;
            int[] subFileLengths = new int[subFileCount];
            for (int anLocalInt_96_ = 0; chunkCount > anLocalInt_96_; anLocalInt_96_++) {
                int blockSize = 0;
                for (int subFileId = 0; subFileId < subFileCount; subFileId++) {
                    blockSize += packet.g4();
                    subFileLengths[subFileId] += blockSize;
                }
            }
            byte[][] subFileBuffer2 = new byte[subFileCount][];
            for (int subFileId = 0; subFileId < subFileCount; subFileId++) {
                subFileBuffer2[subFileId] = new byte[subFileLengths[subFileId]];
                subFileLengths[subFileId] = 0;
            }
            packet.pos = dataPos;
            int readPos = 0;
            for (int anLocalInt_102_ = 0; anLocalInt_102_ < chunkCount; anLocalInt_102_++) {
                int blockLength = 0;
                for (int subFileId = 0; subFileCount > subFileId; subFileId++) {
                    blockLength += packet.g4();
                    JagStrings.memcpy(decompressedData, readPos, subFileBuffer2[subFileId], subFileLengths[subFileId], blockLength);
                    subFileLengths[subFileId] += blockLength;
                    readPos += blockLength;
                }
            }
            for (int subFileId = 0; subFileCount > subFileId; subFileId++) {
                int rSubFileId;
                if (subFilePtr != null)
                    rSubFileId = subFilePtr[subFileId];
                else
                    rSubFileId = subFileId;
                if (this.discardUnpacked == 0)
                    subFileBuffer[rSubFileId] = Class183_Sub1.wrap(subFileBuffer2[subFileId], false, -137);
                else
                    subFileBuffer[rSubFileId] = subFileBuffer2[subFileId];
            }
        }
        return true;
    }

    final void forceClearSubFileBuffer() {
        if (subFileBuffer != null) {
            for (int anLocalInt = 0; anLocalInt < subFileBuffer.length; anLocalInt++)
                subFileBuffer[anLocalInt] = null;
        }
    }

    final boolean isLoaded(int fileId, int subFileId) {
        if (!isFileIdValid(fileId, subFileId))
            return false;
        if (subFileBuffer[fileId] != null && subFileBuffer[fileId][subFileId] != null)
            return true;
        if (fileBuffer[fileId] != null)
            return true;
        loadFileToBuffer(fileId);
        return fileBuffer[fileId] != null;
    }

    private boolean isFileIdValid(int fileId) {
        if (!isFITAvailable())
            return false;
        if (fileId < 0 || fileId >= myFIT.realSubFileCount.length || myFIT.realSubFileCount[fileId] == 0) {
            if (DoublyLinkedNodeP2_Sub2_Sub1_Sub2.aBoolean6567)
                throw new IllegalArgumentException(Integer.toString(fileId));
            return false;
        }
        return true;
    }

    Js5Store(AbstractFileStore argument_113_, boolean useArrayBuffers, int discardunpacked) {
        if (discardunpacked < 0 || discardunpacked > 2)
            throw new IllegalArgumentException("js5: Invalid value " + discardunpacked + " supplied for discardunpacked");
        this.discardUnpacked = discardunpacked;
        this.useArrayBuffers = useArrayBuffers;
        myFileStore = argument_113_;
    }

    public int getFileCount(){
        return myFIT.fileCount;
    }
}
