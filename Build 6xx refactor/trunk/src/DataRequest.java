/* Class59_Sub51_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DataRequest extends DoublyLinkedNode
{
    volatile boolean inProcessing = true;
    boolean aBoolean6238;
    boolean aBoolean6239;

    abstract byte[] getData();

    abstract int getProgress();

    public DataRequest() {
	/* empty */
    }
}
