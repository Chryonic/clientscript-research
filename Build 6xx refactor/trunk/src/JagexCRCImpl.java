/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 7/14/11
 * Time: 1:36 PM
 * To change this template use File | JagexStringEncoding | File Templates.
 */
public class JagexCRCImpl {

    static final int calculateCRC(byte[] data, int startOffset, int endOffset) {
	int anLocalInt = -1;
	for (int anLocalInt_9_ = startOffset; anLocalInt_9_ < endOffset;
	     anLocalInt_9_++)
	    anLocalInt
		= (anLocalInt >>> 8
		   ^ (Statics.anIntArray2672
		      [(anLocalInt ^ data[anLocalInt_9_]) & 0xff]));
	anLocalInt ^= 0xffffffff;
	return anLocalInt;
    }

    static final int calculateCRC(byte[] argument_1_, int argument_0_) {
	    return calculateCRC(argument_1_, 0, argument_0_);
    }
}
