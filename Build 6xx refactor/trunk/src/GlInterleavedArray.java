/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GlInterleavedArray {
    byte offset;
    byte size;
    GlArrayBuffer arrayBuffer;
    short type;
    static boolean aBoolean3224 = false;

    GlInterleavedArray(GlArrayBuffer buffer, int argument_5_, int argument_6_, int argument_7_) {
        this.offset = (byte) argument_7_;
        this.arrayBuffer = buffer;
        this.type = (short) argument_5_;
        this.size = (byte) argument_6_;
    }
}
