/* Class59_Sub32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

final class Node_Sub32_Sub2 extends Node_Sub32
{
    private int anInt6058;
    private TheoraComment aTheoraComment6059;
    private DecoderContext aDecoderContext6060;
    private boolean aBoolean6061;
    private int anInt6062;
    static Class368[] aClass368Array6063;
    private Frame aFrame6064;
    private boolean aBoolean6065;
    private boolean aBoolean6066;
    private long aLong6067;
    static Class207 aClass207_6068 = new Class207(23, -1);
    private GranulePos aGranulePos6069;
    private Class368 aClass368_6070;
    private SetupInfo aSetupInfo6071 = new SetupInfo();
    private double aDouble6072;
    private boolean aBoolean6073;
    private TheoraInfo aTheoraInfo6074 = new TheoraInfo();
    
    final float method1017(byte argument_0_) {
	if (!aBoolean6073 || aTheoraInfo6074.method4214())
	    return 0.0F;
	return ((float) aTheoraInfo6074.anInt5541
		/ (float) aTheoraInfo6074.anInt5544);
    }
    
    final double method1018(int argument_1_) {
	return aDouble6072;
    }
    
    private final void method1019(boolean argument_2_, int argument_3_) {
	if (argument_2_)
	    aBoolean6061 = false;
	anInt6058 = argument_3_;
	if (aBoolean6073) {
	    if (anInt6058 > anInt6062)
		anInt6058 = anInt6062;
	    if (anInt6058 < 0)
		anInt6058 = 0;
	    aDecoderContext6060.setPostProcessingLevel(anInt6058);
	}
    }
    
    final boolean method1020(boolean argument_4_) {
	return aBoolean6073;
    }
    
    Node_Sub32_Sub2(OggStreamState argument_5_) {
	super(argument_5_);
	aTheoraComment6059 = new TheoraComment();
    }
    
    final void method1010(OggPacket argument_6_, byte argument_7_) {
	if (argument_7_ != -13)
	    method1022(false);
	if (!aBoolean6073) {
	    int anLocalInt
		= aSetupInfo6071.decodeHeader(aTheoraInfo6074,
					      aTheoraComment6059, argument_6_);
	    if (anLocalInt == 0) {
		aBoolean6073 = true;
		if (aTheoraInfo6074.anInt5546 > 2048
		    || aTheoraInfo6074.anInt5540 > 1024)
		    throw new IllegalStateException();
		aDecoderContext6060
		    = new DecoderContext(aTheoraInfo6074, aSetupInfo6071);
		aGranulePos6069 = new GranulePos();
		aFrame6064 = new Frame(aTheoraInfo6074.anInt5546,
				       aTheoraInfo6074.anInt5540);
		anInt6062 = aDecoderContext6060.getMaxPostProcessingLevel();
		method1019(false, anInt6058);
	    } else if (anLocalInt < 0)
		throw new IllegalStateException(String.valueOf(anLocalInt));
	} else {
	    aLong6067 = Applet_Sub1.getGameTime();
	    int anLocalInt
		= aDecoderContext6060.decodePacketIn(argument_6_,
						     aGranulePos6069);
	    if (anLocalInt < 0)
		throw new IllegalStateException(String.valueOf(anLocalInt));
	    aDecoderContext6060.granuleFrame(aGranulePos6069);
	    aDouble6072 = aDecoderContext6060.granuleTime(aGranulePos6069);
	    if (aBoolean6065) {
		boolean anLocalBoolean = argument_6_.isKeyFrame() == 1;
		if (anLocalBoolean)
		    aBoolean6065 = false;
		else
		    return;
	    }
	    if (!aBoolean6066 || argument_6_.isKeyFrame() == 1) {
		if (aDecoderContext6060.decodeFrame(aFrame6064) != 0)
		    throw new IllegalStateException(String
							.valueOf(anLocalInt));
		aBoolean6061 = true;
	    }
	}
    }
    
    final Class368 method1021(int argument_8_, GraphicsToolkit argument_9_) {
	if (aFrame6064 == null)
	    return null;
	if (!aBoolean6061 && aClass368_6070 != null)
	    return aClass368_6070;
	aClass368_6070 = argument_9_.method2082(aFrame6064.anIntArray5537, 0,
						aFrame6064.anInt5536,
						aFrame6064.anInt5536,
						aFrame6064.anInt5538, false);
	aBoolean6061 = false;
	return aClass368_6070;
    }
    
    final long method1022(boolean argument_10_) {
	return aLong6067;
    }
    
    final void method1012(int argument_11_) {
	if (aFrame6064 != null)
	    aFrame6064.method4215();
	if (aDecoderContext6060 != null) {
	    aDecoderContext6060.method4215();
	    aDecoderContext6060 = null;
	}
	if (aGranulePos6069 != null) {
	    aGranulePos6069.method4215();
	    aGranulePos6069 = null;
	}
	if (argument_11_ != -30243)
	    method1017((byte) 100);
	aTheoraInfo6074.method4215();
	aTheoraComment6059.method4215();
	aSetupInfo6071.method4215();
    }
    
    public static void method1023(int argument) {
	aClass368Array6063 = null;
	aClass207_6068 = null;
    }
}
