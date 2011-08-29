/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InterleavedArrayElementEnum
{
    private int size;
    private DataType type;
    int byteSize;
    int id;
    static InterleavedArrayElementEnum VERTEX_POINTER = new InterleavedArrayElementEnum(0, 3, DataType.FLOAT);
    static InterleavedArrayElementEnum NORMAL_POINTER = new InterleavedArrayElementEnum(1, 3, DataType.FLOAT);
    static InterleavedArrayElementEnum COLOUR_POINTER = new InterleavedArrayElementEnum(2, 4, DataType.BYTE);
    static InterleavedArrayElementEnum TEXCOORD_1D_POINTER = new InterleavedArrayElementEnum(3, 1, DataType.FLOAT);
    static InterleavedArrayElementEnum TEXCOORD_2D_POINTER = new InterleavedArrayElementEnum(4, 2, DataType.FLOAT);
    static InterleavedArrayElementEnum TEXCOORD_3D_POINTER = new InterleavedArrayElementEnum(5, 3, DataType.FLOAT);
    static InterleavedArrayElementEnum TEXCOORD_4D_POINTER = new InterleavedArrayElementEnum(6, 4, DataType.FLOAT);
    static Class207 aClass207_892 = new Class207(36, 8);

    static final InterleavedArrayElementEnum forID(byte argument, int argument_9_) {
	int anLocalInt = argument_9_;
    while_62_:
	do {
	while_61_:
	    do {
	    while_60_:
		do {
		while_59_:
		    do {
		    while_58_:
			do {
			    do {
				if (anLocalInt != 0) {
				    if (anLocalInt != 1) {
					if (anLocalInt != 2) {
					    if (anLocalInt != 3) {
						if (anLocalInt != 4) {
						    if (anLocalInt != 5) {
							if (anLocalInt == 6)
							    break while_61_;
							break while_62_;
						    }
						} else
						    break while_59_;
						break while_60_;
					    }
					} else
					    break;
					break while_58_;
				    }
				} else
				    return VERTEX_POINTER;
				return NORMAL_POINTER;
			    } while (false);
			    return COLOUR_POINTER;
			} while (false);
			return TEXCOORD_1D_POINTER;
		    } while (false);
		    return TEXCOORD_2D_POINTER;
		} while (false);
		return TEXCOORD_3D_POINTER;
	    } while (false);
	    return TEXCOORD_4D_POINTER;
	} while (false);
	anLocalInt = 11 / ((42 - argument) / 35);
	return null;
    }

    public final String toString() {
	throw new IllegalStateException();
    }

    private InterleavedArrayElementEnum(int id, int size, DataType argument_12_) {
	this.id = id;
	type = argument_12_;
	this.size = size;
	this.byteSize = this.size * type.length;
	if (this.id >= 16)
	    throw new RuntimeException();
    }
}
