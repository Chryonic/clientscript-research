/* Class112_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

final class Class112_Sub2 extends Class112
{
    private boolean aBoolean4617 = false;
    private AudioFormat anAudioFormat4618;
    private SourceDataLine aSourceDataLine4619;
    private byte[] aByteArray4620;
    private int anInt4621;
    static Class aClass4622;
    
    final void method2010(Component argument_0_) {
	Mixer.Info[] infos = AudioSystem.getMixerInfo();
	if (infos != null) {
	    Mixer.Info[] infos_1_ = infos;
	    for (int anLocalInt = 0; anLocalInt < infos_1_.length;
		 anLocalInt++) {
		Mixer.Info info = infos_1_[anLocalInt];
		if (info != null) {
		    String string = info.getName();
		    if (string != null
			&& string.toLowerCase().indexOf("soundmax") >= 0)
			aBoolean4617 = true;
		}
	    }
	}
	anAudioFormat4618
	    = new AudioFormat((float) Statics.anInt44, 16,
			      Class62_Sub3.aBoolean4377 ? 2 : 1, true, false);
	aByteArray4620 = new byte[256 << (!Class62_Sub3.aBoolean4377 ? 1 : 2)];
    }
    
    final void method1996() {
	int anLocalInt = 256;
	if (Class62_Sub3.aBoolean4377)
	    anLocalInt <<= 1;
	for (int anLocalInt_2_ = 0; anLocalInt_2_ < anLocalInt;
	     anLocalInt_2_++) {
	    int anLocalInt_3_
		= ((Class112_Sub2) this).anIntArray923[anLocalInt_2_];
	    if ((anLocalInt_3_ + 8388608 & ~0xffffff) != 0)
		anLocalInt_3_ = 0x7fffff ^ anLocalInt_3_ >> 31;
	    aByteArray4620[anLocalInt_2_ * 2] = (byte) (anLocalInt_3_ >> 8);
	    aByteArray4620[anLocalInt_2_ * 2 + 1]
		= (byte) (anLocalInt_3_ >> 16);
	}
	aSourceDataLine4619.write(aByteArray4620, 0, anLocalInt << 1);
    }
    
    final void method1999(int argument_4_) throws LineUnavailableException {
	try {
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass4622 == null
		     ? (aClass4622
			= method2012("javax.sound.sampled.SourceDataLine"))
		     : aClass4622),
		    anAudioFormat4618,
		    argument_4_ << (!Class62_Sub3.aBoolean4377 ? 1 : 2)));
	    aSourceDataLine4619 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine4619.open();
	    aSourceDataLine4619.start();
	    anInt4621 = argument_4_;
	} catch (LineUnavailableException lineunavailableexception) {
	    if (DoublyLinkedNodeP2_Sub2_Sub5.method1890(argument_4_, 2) != 1)
		method1999(MathStatics.method2589(argument_4_));
	    else {
		aSourceDataLine4619 = null;
		throw lineunavailableexception;
	    }
	}
    }
    
    final void method1998() throws LineUnavailableException {
	aSourceDataLine4619.flush();
	if (aBoolean4617) {
	    aSourceDataLine4619.close();
	    aSourceDataLine4619 = null;
	    DataLine.Info info
		= (new DataLine.Info
		   ((aClass4622 == null
		     ? (aClass4622
			= method2012("javax.sound.sampled.SourceDataLine"))
		     : aClass4622),
		    anAudioFormat4618,
		    anInt4621 << (!Class62_Sub3.aBoolean4377 ? 1 : 2)));
	    aSourceDataLine4619 = (SourceDataLine) AudioSystem.getLine(info);
	    aSourceDataLine4619.open();
	    aSourceDataLine4619.start();
	}
    }
    
    final void method1997() {
	if (aSourceDataLine4619 != null) {
	    aSourceDataLine4619.close();
	    aSourceDataLine4619 = null;
	}
    }
    
    final int method1995() {
	return anInt4621 - (aSourceDataLine4619.available()
			    >> (Class62_Sub3.aBoolean4377 ? 2 : 1));
    }
    
    static Class method2012(String argument) {
	Class var_class;
	try {
	    var_class = Class.forName(argument);
	} catch (ClassNotFoundException classnotfoundexception) {
	    throw new RuntimeException(classnotfoundexception);
	}
	return var_class;
    }
}
