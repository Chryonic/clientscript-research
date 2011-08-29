/* Class59_Sub51_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CacheDataRequest extends DataRequest
{
    byte[] data;
    DiskBackedCache cache;
    int action;

    final byte[] getData() {
        if (this.inProcessing)
            throw new RuntimeException();
        return this.data;
    }

    final int getProgress() {
        if (this.inProcessing)
            return 0;
        return 100;
    }
    
    public CacheDataRequest() {
	/* empty */
    }
}
