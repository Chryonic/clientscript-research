/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

@SuppressWarnings({"FieldCanBeLocal"})
final class FileInformationTable {
    int[] subFileCount;
    NameTable nameTable;
    int fitCRC;
    private byte[] fitHash;
    int[] realSubFileCount;
    int[] fileCRC;
    byte[][] fileHash;
    int[][] subFileNameHashes;
    int[] realFilePtr;
    int[] nameHashes;
    int realFileCount;
    int unknown;
    int[] version;
    NameTable[] subFileNameTable;
    int[][] subFilePtr;
    int fileCount;

    private void readFIT(byte[] data) {
        Packet packet = new Packet(Js5Store.unpackContainer(data));
        int formatRevision = packet.g1();
        if (formatRevision < 5 || formatRevision > 6)
            throw new RuntimeException();
        if (formatRevision >= 6)
            this.unknown = packet.g4();
        else
            this.unknown = 0;
        int flags = packet.g1();
        boolean isNamed = (flags & 0x1) != 0;
        boolean useHashes = (flags & 0x2) != 0;
        this.fileCount = packet.g2();
        int totalCount = 0;
        int maxId = -1;
        this.realFilePtr = new int[this.fileCount];
        for (int anLocalInt_6_ = 0; this.fileCount > anLocalInt_6_; anLocalInt_6_++) {
            this.realFilePtr[anLocalInt_6_] = totalCount += packet.g2();
            if (maxId < this.realFilePtr[anLocalInt_6_])
                maxId = this.realFilePtr[anLocalInt_6_];
        }
        this.realFileCount = maxId + 1;
        if (useHashes)
            this.fileHash = new byte[this.realFileCount][];
        this.realSubFileCount = new int[this.realFileCount];
        this.fileCRC = new int[this.realFileCount];
        this.version = new int[this.realFileCount];
        this.subFilePtr = new int[this.realFileCount][];
        this.subFileCount = new int[this.realFileCount];
        if (isNamed) {
            this.nameHashes = new int[this.realFileCount];
            for (int _fileptr = 0; _fileptr < this.realFileCount; _fileptr++)
                this.nameHashes[_fileptr] = -1;
            for (int _fileptr = 0; _fileptr < this.fileCount; _fileptr++)
                this.nameHashes[(this.realFilePtr[_fileptr])] = packet.g4();
            this.nameTable = new NameTable(this.nameHashes);
        }
        for (int _fileptr = 0; _fileptr < this.fileCount; _fileptr++)
            this.fileCRC[(this.realFilePtr[_fileptr])] = packet.g4();
        if (useHashes) {
            for (int _fileptr = 0; this.fileCount > _fileptr; _fileptr++) {
                byte[] anLocalInts = new byte[64];
                packet.gbytes(anLocalInts, 0, 64);
                this.fileHash[this.realFilePtr[_fileptr]] = anLocalInts;
            }
        }
        for (int _fileptr = 0; this.fileCount > _fileptr; _fileptr++)
            this.version[(this.realFilePtr[_fileptr])] = packet.g4();
        for (int _fileptr = 0; this.fileCount > _fileptr; _fileptr++)
            this.subFileCount[(this.realFilePtr[_fileptr])] = packet.g2();
        for (int _fileptr = 0; _fileptr < this.fileCount; _fileptr++) {
            int realFilePtr = this.realFilePtr[_fileptr];
            int subFileCount = this.subFileCount[realFilePtr];
            totalCount = 0;
            this.subFilePtr[realFilePtr] = new int[subFileCount];
            int maxSubFileId = -1;
            for (int _subFilePtr = 0; _subFilePtr < subFileCount; _subFilePtr++) {
                int id = (this.subFilePtr[realFilePtr][_subFilePtr] = totalCount += packet.g2());
                if (maxSubFileId < id)
                    maxSubFileId = id;
            }
            this.realSubFileCount[realFilePtr] = maxSubFileId + 1;
            if (maxSubFileId + 1 == subFileCount)
                this.subFilePtr[realFilePtr] = null;
        }
        if (isNamed) {
            this.subFileNameTable = new NameTable[maxId + 1];
            this.subFileNameHashes = new int[maxId + 1][];
            for (int _fileptr = 0; _fileptr < this.fileCount; _fileptr++) {
                int _realptr = this.realFilePtr[_fileptr];
                int subfileCount = this.subFileCount[_realptr];
                this.subFileNameHashes[_realptr] = new int[this.realSubFileCount[_realptr]];
                for (int _subFilePtr = 0; (_subFilePtr < this.realSubFileCount[_realptr]); _subFilePtr++)
                    this.subFileNameHashes[_realptr][_subFilePtr] = -1;
                for (int _subFilePtr = 0; _subFilePtr < subfileCount; _subFilePtr++) {
                    int _realsfptr;
                    if (this.subFilePtr[_realptr] == null)
                        _realsfptr = _subFilePtr;
                    else
                        _realsfptr = (this.subFilePtr[_realptr][_subFilePtr]);
                    this.subFileNameHashes[_realptr][_realsfptr] = packet.g4();
                }
                this.subFileNameTable[_realptr] = new NameTable(this.subFileNameHashes[_realptr]);
            }
        }
    }

    FileInformationTable(byte[] fitData, int expectedCRC, byte[] fitHash) {
        if (!FileStore.DISABLE_USERVER){
            this.fitCRC = JagexCRCImpl.calculateCRC(fitData, fitData.length);
            if (expectedCRC != this.fitCRC)
                throw new RuntimeException();
            if (fitHash != null) {
                if (fitHash.length != 64)
                    throw new RuntimeException();
                this.fitHash = JagexHash.calculateJagexHash(0, fitData, fitData.length);
                for (int anLocalInt = 0; anLocalInt < 64; anLocalInt++) {
                    if (this.fitHash[anLocalInt] != fitHash[anLocalInt])
                        throw new RuntimeException();
                }
            }
        }
        readFIT(fitData);
    }

    static {
    }
}
