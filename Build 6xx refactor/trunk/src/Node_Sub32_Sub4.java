/* Class59_Sub32_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

final class Node_Sub32_Sub4 extends Node_Sub32
{
    static Class380[] aClass380Array6085;
    private VorbisComment aVorbisComment6086;
    static MenuAction aClass59_Sub51_Sub9_6087;
    static int anInt6088;
    private double aDouble6089;
    private Node_Sub9_Sub5 aClass59_Sub9_Sub5_6090;
    static int[] anIntArray6091 = { 28, 35, 40, 44 };
    private Class213 aClass213_6092;
    private VorbisBlock aVorbisBlock6093;
    static short aShort6094 = 1;
    private VorbisInfo aVorbisInfo6095 = new VorbisInfo();
    private DSPState aDSPState6096;
    private int anInt6097;
    
    final Node_Sub9_Sub5 method1030(byte argument_0_) {
	return aClass59_Sub9_Sub5_6090;
    }
    
    final void method1012(int argument_1_) {
	if (argument_1_ != -30243)
	    aClass213_6092 = null;
	if (aVorbisBlock6093 != null)
	    aVorbisBlock6093.method4215();
	if (aDSPState6096 != null)
	    aDSPState6096.method4215();
	aVorbisComment6086.method4215();
	aVorbisInfo6095.method4215();
	if (aClass59_Sub9_Sub5_6090 != null)
	    aClass59_Sub9_Sub5_6090.method674(-15521);
    }
    
    final void method1010(OggPacket argument_2_, byte argument_3_) {
	if (argument_3_ == -13) {
	    if (((Node_Sub32) this).anInt4141 < 3) {
		int anLocalInt = aVorbisInfo6095.headerIn(aVorbisComment6086,
							  argument_2_);
		if (anLocalInt < 0)
		    throw new IllegalStateException(String
							.valueOf(anLocalInt));
		if (((Node_Sub32) this).anInt4141 == 2) {
		    if (aVorbisInfo6095.anInt5555 > 2
			|| aVorbisInfo6095.anInt5555 < 1)
			throw new RuntimeException
				  (String.valueOf(aVorbisInfo6095.anInt5555));
		    aDSPState6096 = new DSPState(aVorbisInfo6095);
		    aVorbisBlock6093 = new VorbisBlock(aDSPState6096);
		    aClass213_6092 = new Class213(aVorbisInfo6095.anInt5556,
						  Statics.anInt44);
		    aClass59_Sub9_Sub5_6090
			= new Node_Sub9_Sub5(aVorbisInfo6095.anInt5555);
		}
	    } else {
		if (aVorbisBlock6093.synthesis(argument_2_) == 0)
		    aDSPState6096.blockIn(aVorbisBlock6093);
		float[][] fs = aDSPState6096.pcmOut(aVorbisInfo6095.anInt5555);
		aDouble6089 = aDSPState6096.granuleTime();
		if (aDouble6089 == -1.0)
		    aDouble6089
			= (double) ((float) anInt6097
				    / (float) aVorbisInfo6095.anInt5556);
		aDSPState6096.read(fs[0].length);
		anInt6097 += fs[0].length;
		DoublyLinkedNode_Sub51_Sub20 class59_sub51_sub20
		    = aClass59_Sub9_Sub5_6090.method671(12398, aDouble6089,
							fs[0].length);
		Class205.method2939(fs,
				    ((DoublyLinkedNode_Sub51_Sub20)
				     class59_sub51_sub20).aShortArrayArray6357,
				    (byte) 95);
		for (int anLocalInt = 0;
		     aVorbisInfo6095.anInt5555 > anLocalInt; anLocalInt++)
		    ((DoublyLinkedNode_Sub51_Sub20) class59_sub51_sub20)
			.aShortArrayArray6357[anLocalInt]
			= aClass213_6092.method2980((((DoublyLinkedNode_Sub51_Sub20)
						      class59_sub51_sub20)
						     .aShortArrayArray6357
						     [anLocalInt]),
						    992);
		aClass59_Sub9_Sub5_6090.method678(argument_3_ - 77,
						  class59_sub51_sub20);
	    }
	}
    }
    
    Node_Sub32_Sub4(OggStreamState argument_4_) {
	super(argument_4_);
	aVorbisComment6086 = new VorbisComment();
    }
    
    public static void method1031(boolean argument) {
	aClass59_Sub51_Sub9_6087 = null;
	anIntArray6091 = null;
	aClass380Array6085 = null;
    }
    
    static final void method1032(RsInterface argument, byte argument_5_) {
	if (Statics.anInt2629 == ((RsInterface) argument).anInt1859) {
	    if (((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
		 Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).aString6836
		== null) {
		((RsInterface) argument).anInt1929 = 0;
		((RsInterface) argument).anInt1861 = 0;
	    } else {
		((RsInterface) argument).anInt1885 = 150;
		((RsInterface) argument).anInt1884
		    = (int) (Math.sin((double) Class333.anInt2720 / 40.0)
			     * 256.0) & 0x7ff;
		((RsInterface) argument).anInt1929 = Class64.anInt451;
		((RsInterface) argument).anInt1822 = 5;
		((RsInterface) argument).anInt1861
		    = (Class353.method3887
		       ((byte) -126,
			(((DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2)
			  Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587)
			 .aString6836)));
		((RsInterface) argument).anInt1853
		    = ((Entity)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).anInt6742;
		((RsInterface) argument).anInt1905 = 0;
		((RsInterface) argument).anInt1898
		    = ((Entity)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).anInt6765;
		((RsInterface) argument).anInt1812
		    = ((Entity)
		       Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587).anInt6731;
		Class367 class367
		    = (((RsInterface) argument).anInt1812 != -1
		       ? DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425
			     .method3758(((RsInterface) argument).anInt1812, 0)
		       : null);
		if (class367 != null)
		    Node_Sub47_Sub11.method1138(0, (((RsInterface) argument)
                    .anInt1853), class367);
	    }
	}
    }
    
    static final void method1033(boolean argument) {
	Statics.aClass149_1252.clear((byte) -3);
	Class371.aClass149_3191.clear((byte) -3);
	Node_Sub44.aClass149_4250.clear((byte) -3);
	Class214_Sub1.aClass149_5653.clear((byte) -3);
    }
    
    final double method1034(int argument_6_) {
	if (argument_6_ != -22940)
	    anIntArray6091 = null;
	double d = aDouble6089;
	if (aClass59_Sub9_Sub5_6090 != null) {
	    d = aClass59_Sub9_Sub5_6090.method679(argument_6_ + 22940);
	    if (d < 0.0)
		d = aDouble6089;
	}
	return d - (double) (256.0F / (float) Statics.anInt44);
    }
    
    final int method1035(int argument_7_) {
	if (aClass59_Sub9_Sub5_6090 == null)
	    return 0;
	return aClass59_Sub9_Sub5_6090.method673((byte) -110);
    }
}
