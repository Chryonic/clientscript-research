/* Class59_Sub51_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class StreamingDataRequest extends DataRequest {
    Packet data;
    byte startOffset;
    int chunkOffset;

    final int getProgress() {
        if (this.data == null)
            return 0;
        return this.data.pos * 100 / (this.data.data.length - this.startOffset);
    }

    final byte[] getData() {
        if (this.inProcessing || (this.data.pos < ((this.data.data).length - this.startOffset)))
            throw new RuntimeException();
        return (this.data.data);
    }
}
