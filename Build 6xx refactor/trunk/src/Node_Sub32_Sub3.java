/* Class59_Sub32_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Node_Sub32_Sub3 extends Node_Sub32
{
    private int anInt6075;
    private int anInt6076;
    private String aString6077;
    private String aString6078;
    static Class207 aClass207_6079;
    static Class368 aClass368_6080;
    private float aFloat6081;
    private String aString6082;
    private float aFloat6083;
    static int[] anIntArray6084 = new int[14];
    
    Node_Sub32_Sub3(OggStreamState argument_0_) {
	super(argument_0_);
    }
    
    final void method1012(int argument_1_) {
	if (argument_1_ != -30243)
	    anIntArray6084 = null;
    }
    
    public static void method1024(int argument) {
	aClass368_6080 = null;
	aClass207_6079 = null;
	anIntArray6084 = null;
    }
    
    static final void method1025
	(Js5Store argument, int argument_2_, int argument_3_, long argument_4_,
	 byte argument_5_, boolean argument_6_, int argument_7_) {
	Statics.method458(argument, argument_7_, argument_6_, -17838, argument_4_, argument_2_, argument_3_, 0);
    }
    
    final float method1026(byte argument_8_) {
	return aFloat6081;
    }
    
    final String method1027(boolean argument_9_) {
	return aString6078;
    }
    
    final void method1010(OggPacket argument_10_, byte argument_11_) {
	if (((Node_Sub32) this).anInt4141 <= 0
	    || aString6082.equals("SUB")) {
	    Packet class59_sub28
		= new Packet(argument_10_.getData());
	    if (argument_11_ != -13)
		aFloat6081 = 0.46147597F;
	    int anLocalInt = class59_sub28.g1();
	    do {
		if (((Node_Sub32) this).anInt4141 > 8) {
		    if (anLocalInt == 0) {
			long l = class59_sub28.g8i();
			long l_12_ = class59_sub28.g8i();
			long l_13_ = class59_sub28.g8i();
			if (l < 0L || l_12_ < 0L || l_13_ < 0L || l < l_13_)
			    throw new IllegalStateException();
			aFloat6083 = ((float) (l * (long) anInt6075)
				      / (float) anInt6076);
			aFloat6081 = ((float) ((long) anInt6075 * (l + l_12_))
				      / (float) anInt6076);
			int anLocalInt_14_
			    = class59_sub28.g4i();
			if (anLocalInt_14_ < 0
			    || (anLocalInt_14_
				> (-((Packet) class59_sub28).pos
				   + (((Packet) class59_sub28)
				      .data).length)))
			    throw new IllegalStateException();
			aString6078
			    = LoadingStatus.method374(((Packet)
                    class59_sub28).data,
                    anLocalInt_14_,
                    ((Packet)
                            class59_sub28).pos,
                    7956);
		    }
		    if ((anLocalInt | 0x80) != 0)
			break;
		} else {
		    if ((anLocalInt | 0x80) == 0)
			throw new IllegalStateException();
		    if (((Node_Sub32) this).anInt4141 != 0)
			break;
		    ((Packet) class59_sub28).pos += 23;
		    anInt6076 = class59_sub28.g4i();
		    anInt6075 = class59_sub28.g4i();
		    if (anInt6076 == 0 || anInt6075 == 0)
			throw new IllegalStateException();
		    Packet class59_sub28_15_ = new Packet(16);
		    class59_sub28.gbytes((((Packet)
              class59_sub28_15_)
             .data), 0, 16
            );
		    aString6077 = class59_sub28_15_.gstr();
		    ((Packet) class59_sub28_15_).pos = 0;
		    class59_sub28.gbytes((((Packet)
              class59_sub28_15_)
             .data), 0, 16
            );
		    aString6082 = class59_sub28_15_.gstr();
		}
		break;
	    } while (false);
	}
    }
    
    final String method1028(int argument_16_) {
	return aString6077;
    }
    
    final float method1029(byte argument_17_) {
	return aFloat6083;
    }
    
    static {
	aClass207_6079 = new Class207(43, -1);
    }
}
