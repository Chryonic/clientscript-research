/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

abstract class Class109
{
    private boolean aBoolean893;
    private boolean aBoolean894;
    private Node_Sub32_Sub4 aClass59_Sub32_Sub4_895;
    private OggPacket anOggPacket896;
    private boolean aBoolean897;
    private String aString898;
    private OggSyncState anOggSyncState899;
    private JagexHashMap aJagexHashMap_900;
    private Node_Sub32_Sub2 aClass59_Sub32_Sub2_901;
    private OggPage anOggPage902;
    static int anInt904 = 0;
    private boolean aBoolean905;
    private Node_Sub32_Sub3 aClass59_Sub32_Sub3_906;
    private byte[] aByteArray907;
    static Js5Store aJs5Store_908;
    
    final void method1965(int argument_0_) throws IOException {
	if (argument_0_ == -2 && !aBoolean905) {
	    while (!aBoolean893) {
		Node_Sub32 class59_sub32;
		if (aBoolean897)
		    class59_sub32 = ((Node_Sub32)
				     (aJagexHashMap_900.get((long) anOggPage902.getSerialNumber())));
		else {
		    class59_sub32 = method1980((byte) -92);
		    if (class59_sub32 == null) {
			if (aBoolean894)
			    method1972(argument_0_ - 13864);
			break;
		    }
		    if (class59_sub32 == null)
			throw new IllegalStateException();
		    aBoolean897 = true;
		}
		if (class59_sub32 != aClass59_Sub32_Sub4_895) {
		    if (!(class59_sub32 instanceof Node_Sub32_Sub3)) {
			if (aClass59_Sub32_Sub2_901 == class59_sub32) {
			    if (aClass59_Sub32_Sub4_895 == null
				&& !aBoolean905) {
				for (int anLocalInt = 0;
				     anLocalInt < 10 && method1974((byte) 125);
				     anLocalInt++) {
				    method1976(21);
				    if (aBoolean893)
					break;
				}
				break;
			    }
			} else {
			    while (((Node_Sub32) class59_sub32)
				       .anOggStreamState4142
				       .packetOut(anOggPacket896)
				   == 1) {
				if ((((Node_Sub32) class59_sub32).anInt4141
				     == 1)
				    && (class59_sub32
					instanceof Node_Sub32_Sub3))
				    method1978(aString898, -2);
				class59_sub32.method1014(true, anOggPacket896);
			    }
			}
		    } else
			method1981(8);
		} else {
		    if (aClass59_Sub32_Sub4_895.method1035(105) >= 50)
			break;
		    while (((Node_Sub32) aClass59_Sub32_Sub4_895)
			       .anOggStreamState4142.packetOut(anOggPacket896)
			   == 1) {
			aClass59_Sub32_Sub4_895.method1014(true,
							   anOggPacket896);
			method1981(8);
			if (aClass59_Sub32_Sub2_901 != null) {
			    double d = aClass59_Sub32_Sub2_901.method1018(-1);
			    for (int anLocalInt = 0;
				 anLocalInt < 10 && method1974((byte) 47);
				 anLocalInt++) {
				method1976(19);
				if (aBoolean893)
				    return;
			    }
			    if (d < aClass59_Sub32_Sub2_901
					.method1018(argument_0_ + 1))
				return;
			}
			if (aClass59_Sub32_Sub4_895
				.method1035(argument_0_ ^ ~0x71)
			    >= 50)
			    return;
		    }
		}
		aBoolean897 = false;
	    }
	}
    }
    
    final void method1966(int argument_1_) {
	if (!aBoolean893) {
	    for (Node_Sub32 class59_sub32
		     = (Node_Sub32) aJagexHashMap_900.first(0);
		 class59_sub32 != null;
		 class59_sub32
		     = (Node_Sub32) aJagexHashMap_900.next()) {
		class59_sub32.method1012(-30243);
		((Node_Sub32) class59_sub32).anOggStreamState4142
		    .method4215();
	    }
	    anOggPacket896.method4215();
	    anOggPage902.method4215();
	    anOggSyncState899.method4215();
	    aBoolean893 = true;
	}
    }
    
    final boolean method1967(boolean argument_2_) {
	if (!aBoolean893 && !aBoolean894)
	    return false;
	if (aClass59_Sub32_Sub4_895 != null
	    && aClass59_Sub32_Sub4_895.method1035(108) > 0)
	    return false;
	return true;
    }
    
    final Node_Sub32_Sub2 method1968(int argument_3_) {
	return aClass59_Sub32_Sub2_901;
    }
    
    final void method1969(boolean argument_4_, int argument_5_) {
	if (aClass59_Sub32_Sub4_895 != null) {
	    Node_Sub9_Sub5 class59_sub9_sub5
		= aClass59_Sub32_Sub4_895.method1030((byte) -96);
	    if (class59_sub9_sub5 != null)
		class59_sub9_sub5.method682(argument_4_, 109);
	}
	aBoolean905 = !aBoolean905;
    }
    
    final Node_Sub32_Sub3 method1970(int argument_6_) {
	return aClass59_Sub32_Sub3_906;
    }
    
    abstract int method1971(byte[] argument_7_, byte argument_8_)
	throws IOException;
    
    private final void method1972(int argument_9_) {
	if (argument_9_ != -13866)
	    anInt904 = 26;
	for (Node_Sub32 class59_sub32
		 = (Node_Sub32) aJagexHashMap_900.first(0);
	     class59_sub32 != null;
	     class59_sub32
		 = (Node_Sub32) aJagexHashMap_900.next()) {
	    if (aClass59_Sub32_Sub2_901 != class59_sub32) {
		while (((Node_Sub32) class59_sub32).anOggStreamState4142
			   .packetOut()
		       == 1)
		    class59_sub32.method1014(true, anOggPacket896);
	    }
	}
	if (aClass59_Sub32_Sub2_901 != null) {
	    int anLocalInt = 0;
	while_63_:
	    do {
		for (;;) {
		    if (anLocalInt >= 10)
			break while_63_;
		    if (!method1974((byte) 93))
			break;
		    if (((Node_Sub32) aClass59_Sub32_Sub2_901)
			    .anOggStreamState4142.packetOut()
			!= 1) {
			method1966(argument_9_ + 13864);
			break;
		    }
		    aClass59_Sub32_Sub2_901.method1014(true, anOggPacket896);
		    anLocalInt++;
		}
		break;
	    } while (false);
	}
    }
    
    final Node_Sub32_Sub4 method1973(int argument_10_) {
	return aClass59_Sub32_Sub4_895;
    }
    
    private final boolean method1974(byte argument_11_) {
	if (argument_11_ <= 37)
	    aBoolean897 = true;
	if (aClass59_Sub32_Sub4_895 == null) {
	    double d = (double) aClass59_Sub32_Sub2_901.method1017((byte) -24);
	    if (d != 0.0 && !((double) Applet_Sub1.getGameTime()
			      >= 1000.0 / d + (double) aClass59_Sub32_Sub2_901
							   .method1022(false)))
		return false;
	    return true;
	}
	if (aClass59_Sub32_Sub2_901.method1020(false)
	    && !(method1979(0) > aClass59_Sub32_Sub2_901.method1018(-1)))
	    return false;
	return true;
    }
    
    static final int method1975(int argument, int argument_12_) {
	return argument >>> 8;
    }
    
    private final void method1976(int argument_13_) throws IOException {
	while (((Node_Sub32) aClass59_Sub32_Sub2_901)
		   .anOggStreamState4142.packetOut(anOggPacket896)
	       != 1) {
	    Node_Sub32 class59_sub32 = method1980((byte) 104);
	    if (class59_sub32 == null) {
		if (aBoolean894)
		    method1972(-13866);
		return;
	    }
	    if (class59_sub32 == aClass59_Sub32_Sub3_906)
		method1981(8);
	}
	aClass59_Sub32_Sub2_901.method1014(true, anOggPacket896);
	if (argument_13_ <= 10)
	    method1970(-29);
    }
    
    public static void method1977(boolean argument) {
	aJs5Store_908 = null;
	GlMultiTexSourceEnum.PRIMARY_COLOUR = null;
    }
    
    final void method1978(String argument_14_, int argument_15_) {
	aString898 = argument_14_;
	if (aString898 == null)
	    aClass59_Sub32_Sub3_906 = null;
	else {
	    if (aClass59_Sub32_Sub3_906 != null
		&& !aString898.equals(aClass59_Sub32_Sub3_906.method1028(-61)))
		aClass59_Sub32_Sub3_906 = null;
	    if (aClass59_Sub32_Sub3_906 == null) {
		for (Node_Sub32 class59_sub32
			 = ((Node_Sub32)
			    aJagexHashMap_900.first(argument_15_ + 2));
		     class59_sub32 != null;
		     class59_sub32 = ((Node_Sub32)
				      aJagexHashMap_900.next())) {
		    if (class59_sub32 instanceof Node_Sub32_Sub3) {
			Node_Sub32_Sub3 class59_sub32_sub3
			    = (Node_Sub32_Sub3) class59_sub32;
			if (aString898
				.equals(class59_sub32_sub3.method1028(-127))) {
			    aClass59_Sub32_Sub3_906 = class59_sub32_sub3;
			    return;
			}
		    }
		}
	    }
	    if (argument_15_ != -2)
		method1974((byte) 45);
	}
    }
    
    final double method1979(int argument_16_) {
	if (aClass59_Sub32_Sub4_895 != null)
	    return aClass59_Sub32_Sub4_895.method1034(-22940);
	if (aClass59_Sub32_Sub2_901 != null)
	    return aClass59_Sub32_Sub2_901.method1018(-1);
	return 0.0;
    }
    
    private final Node_Sub32 method1980(byte argument_17_)
	throws IOException {
	if (aBoolean893)
	    throw new IllegalStateException();
	if (aBoolean894)
	    return null;
	while (anOggSyncState899.pageOut(anOggPage902) <= 0) {
	    int anLocalInt = method1971(aByteArray907, (byte) -59);
	    if (anLocalInt == -1) {
		aBoolean894 = true;
		return null;
	    }
	    if (anLocalInt == 0)
		return null;
	    if (!anOggSyncState899.write(aByteArray907, anLocalInt))
		throw new RuntimeException("");
	}
	int anLocalInt = 69 % ((-13 - argument_17_) / 39);
	int anLocalInt_18_ = anOggPage902.getSerialNumber();
	if (!anOggPage902.isBOS()) {
	    Node_Sub32 class59_sub32
		= ((Node_Sub32)
		   aJagexHashMap_900.get((long) anLocalInt_18_));
	    if (!((Node_Sub32) class59_sub32).anOggStreamState4142
		     .pageIn(anOggPage902))
		throw new IllegalStateException();
	    return class59_sub32;
	}
	OggStreamState oggstreamstate = new OggStreamState(anLocalInt_18_);
	if (!oggstreamstate.pageIn(anOggPage902))
	    throw new IllegalStateException();
	if (oggstreamstate.packetPeek(anOggPacket896) != 1)
	    throw new IllegalStateException();
	Node_Sub32 class59_sub32;
	if (aClass59_Sub32_Sub2_901 != null || !anOggPacket896.isTheora()) {
	    if (aClass59_Sub32_Sub4_895 == null && anOggPacket896.isVorbis()) {
		aClass59_Sub32_Sub4_895
		    = new Node_Sub32_Sub4(oggstreamstate);
		class59_sub32 = aClass59_Sub32_Sub4_895;
	    } else {
		byte[] anLocalInts = anOggPacket896.getData();
		StringBuffer stringbuffer = new StringBuffer();
		for (int anLocalInt_19_ = 1;
		     anLocalInt_19_ < anLocalInts.length; anLocalInt_19_++) {
		    if (!Character.isLetterOrDigit((char) anLocalInts
							  [anLocalInt_19_]))
			break;
		    stringbuffer.append((char) anLocalInts[anLocalInt_19_]);
		}
		String string = stringbuffer.toString();
		if (string.equals("kate"))
		    class59_sub32 = new Node_Sub32_Sub3(oggstreamstate);
		else
		    class59_sub32 = new Node_Sub32_Sub1(oggstreamstate);
	    }
	} else {
	    aClass59_Sub32_Sub2_901 = new Node_Sub32_Sub2(oggstreamstate);
	    class59_sub32 = aClass59_Sub32_Sub2_901;
	}
	aJagexHashMap_900.put((long) anLocalInt_18_, class59_sub32);
	return class59_sub32;
    }
    
    private final void method1981(int argument_20_) {
	for (Node_Sub32 class59_sub32
		 = (Node_Sub32) aJagexHashMap_900.first(0);
	     class59_sub32 != null;
	     class59_sub32
		 = (Node_Sub32) aJagexHashMap_900.next()) {
	    if (class59_sub32 instanceof Node_Sub32_Sub3) {
		Node_Sub32_Sub3 class59_sub32_sub3
		    = (Node_Sub32_Sub3) class59_sub32;
		while (((Node_Sub32) class59_sub32_sub3).anInt4141 <= 8
		       || (method1979(argument_20_ ^ 0x8)
			   > (double) class59_sub32_sub3
					  .method1026((byte) 76))) {
		    if (((Node_Sub32) class59_sub32_sub3)
			    .anOggStreamState4142.packetOut(anOggPacket896)
			!= 1)
			break;
		    class59_sub32_sub3.method1014(true, anOggPacket896);
		}
	    }
	}
	if (argument_20_ != 8)
	    method1967(true);
	method1978(aString898, argument_20_ - 10);
    }
    
    Class109(int argument_21_) {
	if (!NativeManager.method2978("jagtheora"))
	    throw new RuntimeException("Failed to load jagtheora library");
	aByteArray907 = new byte[argument_21_];
	anOggSyncState899 = new OggSyncState();
	anOggPage902 = new OggPage();
	anOggPacket896 = new OggPacket();
	aJagexHashMap_900 = new JagexHashMap(8);
    }
}
