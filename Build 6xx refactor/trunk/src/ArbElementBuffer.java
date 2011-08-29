/* Class286_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ArbElementBuffer extends ArbBuffer implements GlElementBuffer {
    private int type;

    public final void setData(int size, int type, byte[] data) {
        this.setData(data, size);
        this.type = type;
    }

    public final int getType() {
        return type;
    }

    public final int getARBPointer() {
        return this.glPtr;
    }

    public final long getAddress() {
        return 0L;
    }

    ArbElementBuffer(GlToolkit toolkit, int argument_32_, byte[] data, int size, boolean stream) {
        super(toolkit, 34963, data, size, stream);
        type = argument_32_;
    }

    final void bind() {
        this.glToolkit.bind(this);
    }
}
