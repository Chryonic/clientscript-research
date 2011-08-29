/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagStrings {
    static final void memcpy(float[] source, int src_ptr, float[] dest, int dest_ptr, int length) {
        if (source == dest) {
            if (src_ptr == dest_ptr)
                return;
            if (dest_ptr > src_ptr && dest_ptr < src_ptr + length) {
                length--;
                src_ptr += length;
                dest_ptr += length;
                length = src_ptr - length;
                length += 7;
                while (src_ptr >= length) {
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                }
                length -= 7;
                while (src_ptr >= length)
                    dest[dest_ptr--] = source[src_ptr--];
                return;
            }
        }
        length += src_ptr;
        length -= 7;
        while (src_ptr < length) {
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
        }
        length += 7;
        while (src_ptr < length)
            dest[dest_ptr++] = source[src_ptr++];
    }

    static final void memcpy(byte[] source, int src_ptr, byte[] dest, int dest_ptr, int length) {
        if (source == dest) {
            if (src_ptr == dest_ptr)
                return;
            if (dest_ptr > src_ptr && dest_ptr < src_ptr + length) {
                length--;
                src_ptr += length;
                dest_ptr += length;
                length = src_ptr - length;
                length += 7;
                while (src_ptr >= length) {
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                }
                length -= 7;
                while (src_ptr >= length)
                    dest[dest_ptr--] = source[src_ptr--];
                return;
            }
        }
        length += src_ptr;
        length -= 7;
        while (src_ptr < length) {
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
        }
        length += 7;
        while (src_ptr < length)
            dest[dest_ptr++] = source[src_ptr++];
    }

    static final void memclr(int[] array, int offset, int length) {
        length = offset + length - 7;
        while (offset < length) {
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
            array[offset++] = 0;
        }
        length += 7;
        while (offset < length)
            array[offset++] = 0;
    }

    static final void memcpy(int[] source, int src_ptr, int[] dest, int dest_ptr, int length) {
        if (source == dest) {
            if (src_ptr == dest_ptr)
                return;
            if (dest_ptr > src_ptr && dest_ptr < src_ptr + length) {
                length--;
                src_ptr += length;
                dest_ptr += length;
                length = src_ptr - length;
                length += 7;
                while (src_ptr >= length) {
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                }
                length -= 7;
                while (src_ptr >= length)
                    dest[dest_ptr--] = source[src_ptr--];
                return;
            }
        }
        length += src_ptr;
        length -= 7;
        while (src_ptr < length) {
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
        }
        length += 7;
        while (src_ptr < length)
            dest[dest_ptr++] = source[src_ptr++];
    }

    static final void memcpy(Object[] src, int src_ptr, Object[] dest, int dest_ptr, int length) {
        if (src == dest) {
            if (src_ptr == dest_ptr)
                return;
            if (dest_ptr > src_ptr && dest_ptr < src_ptr + length) {
                length--;
                src_ptr += length;
                dest_ptr += length;
                length = src_ptr - length;
                length += 7;
                while (src_ptr >= length) {
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                    dest[dest_ptr--] = src[src_ptr--];
                }
                length -= 7;
                while (src_ptr >= length)
                    dest[dest_ptr--] = src[src_ptr--];
                return;
            }
        }
        length += src_ptr;
        length -= 7;
        while (src_ptr < length) {
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
            dest[dest_ptr++] = src[src_ptr++];
        }
        length += 7;
        while (src_ptr < length)
            dest[dest_ptr++] = src[src_ptr++];
    }

    static final void memcpy(short[] source, int source_ptr, short[] dest, int dest_ptr, int length) {
        if (source == dest) {
            if (source_ptr == dest_ptr)
                return;
            if (dest_ptr > source_ptr && dest_ptr < source_ptr + length) {
                length--;
                source_ptr += length;
                dest_ptr += length;
                length = source_ptr - length;
                length += 7;
                while (source_ptr >= length) {
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                    dest[dest_ptr--] = source[source_ptr--];
                }
                length -= 7;
                while (source_ptr >= length)
                    dest[dest_ptr--] = source[source_ptr--];
                return;
            }
        }
        length += source_ptr;
        length -= 7;
        while (source_ptr < length) {
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
            dest[dest_ptr++] = source[source_ptr++];
        }
        length += 7;
        while (source_ptr < length)
            dest[dest_ptr++] = source[source_ptr++];
    }

    static final void memcpy(long[] source, int src_ptr, long[] dest, int dest_ptr, int length) {
        if (source == dest) {
            if (src_ptr == dest_ptr)
                return;
            if (dest_ptr > src_ptr && dest_ptr < src_ptr + length) {
                length--;
                src_ptr += length;
                dest_ptr += length;
                length = src_ptr - length;
                length += 3;
                while (src_ptr >= length) {
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                    dest[dest_ptr--] = source[src_ptr--];
                }
                length -= 3;
                while (src_ptr >= length)
                    dest[dest_ptr--] = source[src_ptr--];
                return;
            }
        }
        length += src_ptr;
        length -= 3;
        while (src_ptr < length) {
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
            dest[dest_ptr++] = source[src_ptr++];
        }
        length += 3;
        while (src_ptr < length)
            dest[dest_ptr++] = source[src_ptr++];
    }

    static final void memset(int[] array, int offset, int length, int fill) {
        length = offset + length - 7;
        while (offset < length) {
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
            array[offset++] = fill;
        }
        length += 7;
        while (offset < length)
            array[offset++] = fill;
    }
}
