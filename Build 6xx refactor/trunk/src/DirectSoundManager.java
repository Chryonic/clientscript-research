/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.com.ComFailException;
import com.ms.directX.DSBufferDesc;
import com.ms.directX.DSCursors;
import com.ms.directX.DirectSound;
import com.ms.directX.DirectSoundBuffer;
import com.ms.directX.WaveFormatEx;

public final class DirectSoundManager implements Interface16
{
    private DSCursors[] aDSCursorsArray3656 = new DSCursors[2];
    private DirectSoundBuffer[] aDirectSoundBufferArray3657
	= new DirectSoundBuffer[2];
    private int anInt3658;
    private int[] anIntArray3659 = new int[2];
    private int anInt3660;
    private int anInt3661;
    private WaveFormatEx aWaveFormatEx3662;
    private DirectSound aDirectSound3663;
    private boolean[] aBooleanArray3664;
    private int[] anIntArray3665 = new int[2];
    private int[] anIntArray3666;
    private DSBufferDesc[] aDSBufferDescArray3667;
    private byte[][] aByteArrayArray3668;
    
    public final void method64(int argument_0_, boolean argument_1_) {
	if (aDirectSoundBufferArray3657[argument_0_] != null) {
	    try {
		aDirectSoundBufferArray3657[argument_0_].stop();
	    } catch (com.ms.com.ComFailException comfailexception) {
		/* empty */
	    }
	    aDirectSoundBufferArray3657[argument_0_] = null;
	}
	if (argument_1_)
	    method63(-12, null);
    }
    
    public final void method62
	(int argument_2_, int argument_3_, int argument_4_) throws Exception {
	if (anInt3658 == 0 || aDirectSoundBufferArray3657[argument_2_] != null)
	    throw new IllegalStateException();
	int anLocalInt = anInt3661 * 65536;
	if (aByteArrayArray3668[argument_2_] == null
	    || anLocalInt != aByteArrayArray3668[argument_2_].length) {
	    aByteArrayArray3668[argument_2_] = new byte[anLocalInt];
	    aDSBufferDescArray3667[argument_2_].bufferBytes = anLocalInt;
	}
	if (argument_3_ != -3227)
	    method67(68, -126);
	aDirectSoundBufferArray3657[argument_2_]
	    = aDirectSound3663.createSoundBuffer((aDSBufferDescArray3667
						  [argument_2_]),
						 aWaveFormatEx3662);
	aBooleanArray3664[argument_2_] = false;
	anIntArray3665[argument_2_] = 0;
	anIntArray3659[argument_2_] = argument_4_;
    }
    
    public final int method65(int argument_5_, int argument_6_) {
	if (!aBooleanArray3664[argument_6_])
	    return 0;
	aDirectSoundBufferArray3657[argument_6_]
	    .getCurrentPosition(aDSCursorsArray3656[argument_6_]);
	int anLocalInt = aDSCursorsArray3656[argument_6_].write / anInt3661;
	int anLocalInt_7_ = -anLocalInt + anIntArray3665[argument_6_] & 0xffff;
	if (argument_5_ != 0)
	    method64(12, false);
	if (anIntArray3659[argument_6_] < anLocalInt_7_) {
	    int anLocalInt_8_
		= -anIntArray3665[argument_6_] + anLocalInt & 0xffff;
	    while (anLocalInt_8_ > 0) {
		anLocalInt_8_ -= 256;
		method63(argument_6_, anIntArray3666);
	    }
	    anLocalInt_7_ = -anLocalInt + anIntArray3665[argument_6_] & 0xffff;
	}
	return anLocalInt_7_;
    }
    
    public final void method66(int argument_9_, int argument_10_,
			       boolean argument_11_,
			       Component argument_12_) throws Exception {
	if (anInt3658 == 0) {
	    if (argument_9_ < argument_10_ || argument_9_ > 48000)
		throw new IllegalArgumentException();
	    anInt3661 = !argument_11_ ? 2 : 4;
	    anInt3660 = argument_11_ ? 2 : 1;
	    anIntArray3666 = new int[anInt3660 * 256];
	    aDirectSound3663.initialize(null);
	    aDirectSound3663.setCooperativeLevel(argument_12_, 2);
	    for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++)
		aDSBufferDescArray3667[anLocalInt].flags = 16384;
	    aWaveFormatEx3662.formatTag = 1;
	    aWaveFormatEx3662.bitsPerSample = 16;
	    aWaveFormatEx3662.samplesPerSec = argument_9_;
	    anInt3658 = argument_9_;
	    aWaveFormatEx3662.channels = anInt3660;
	    aWaveFormatEx3662.avgBytesPerSec = argument_9_ * anInt3661;
	    aWaveFormatEx3662.blockAlign = anInt3661;
	}
    }
    
    public final void method63(int argument_13_, int[] argument_14_) {
	int anLocalInt = argument_14_.length;
	if (anLocalInt != anInt3660 * 256)
	    throw new IllegalArgumentException();
	int anLocalInt_15_ = anIntArray3665[argument_13_] * anInt3661;
	for (int anLocalInt_16_ = 0; anLocalInt_16_ < anLocalInt;
	     anLocalInt_16_++) {
	    int anLocalInt_17_ = argument_14_[anLocalInt_16_];
	    if ((anLocalInt_17_ + 8388608 & ~0xffffff) != 0)
		anLocalInt_17_ = 0x7fffff ^ anLocalInt_17_ >> 31;
	    aByteArrayArray3668[argument_13_][(anLocalInt_15_
					       + anLocalInt_16_ * 2)]
		= (byte) (anLocalInt_17_ >> 8);
	    aByteArrayArray3668[argument_13_][(anLocalInt_15_
					       + anLocalInt_16_ * 2 + 1)]
		= (byte) (anLocalInt_17_ >> 16);
	}
	aDirectSoundBufferArray3657[argument_13_].writeBuffer
	    (anLocalInt_15_, anLocalInt * 2, aByteArrayArray3668[argument_13_],
	     0);
	anIntArray3665[argument_13_]
	    = anIntArray3665[argument_13_] + anLocalInt / anInt3660 & 0xffff;
	if (!aBooleanArray3664[argument_13_]) {
	    aDirectSoundBufferArray3657[argument_13_].play(1);
	    aBooleanArray3664[argument_13_] = true;
	}
    }
    
    public final void method67(int argument_18_, int argument_19_) {
        try {
            aDirectSoundBufferArray3657[argument_18_].stop();
        } catch (ComFailException e) {
            throw new RuntimeException(e);
        }
        aBooleanArray3664[argument_18_] = false;
	aDirectSoundBufferArray3657[argument_18_]
	    .setCurrentPosition(argument_19_);
	anIntArray3665[argument_18_] = 0;
    }
    
    public DirectSoundManager() throws Exception {
	aBooleanArray3664 = new boolean[2];
	aDSBufferDescArray3667 = new DSBufferDesc[2];
	aByteArrayArray3668 = new byte[2][];
	aDirectSound3663 = new DirectSound();
	aWaveFormatEx3662 = new WaveFormatEx();
	for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++)
	    aDSBufferDescArray3667[anLocalInt] = new DSBufferDesc();
	for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++)
	    aDSCursorsArray3656[anLocalInt] = new DSCursors();
    }
}
