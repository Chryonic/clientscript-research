/* Class12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlElementArray extends GlArray implements GlElementBuffer {
    private int type;

    GlElementArray(GlToolkit toolkit, int type, byte[] data, int size) {
        super(toolkit, data, size);
        this.type = type;
    }

    public final int getType() {
        return type;
    }

    public final void setData(int size_, int type_, byte[] data_) {
        this.setData(data_, size_);
        type = type_;
    }

    public final long getAddress() {
        return this.data.getAddress();
    }

    public final int getARBPointer() {
        return 0;
    }

    static {
    }
}
