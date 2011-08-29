/* Class274 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

final class Class274 implements Runnable
{
    private int anInt2186 = 0;
    private int anInt2187 = 0;
    private byte[] aByteArray2188;
    private InputStream anInputStream2189;
    private Thread aThread2190;
    static Class217 aClass217_2191 = new Class217(13, 0, 1, 0);
    private IOException anIOException2192;
    private int anInt2193;
    static Class166 aClass166_2194 = new Class166(92, -2);
    static int[] anIntArray2195 = { 0, -1, 0, 1 };
    static double aDouble2196;
    static Js5Store aJs5Store_2197;
    
    public static void method3384(byte argument) {
	aJs5Store_2197 = null;
	anIntArray2195 = null;
	aClass217_2191 = null;
	aClass166_2194 = null;
    }
    
    final void method3385(int argument_0_) {
	anInputStream2189 = new InputStream_Sub2();
    }
    
    public final void run() {
	for (;;) {
	    int anLocalInt;
	    synchronized (this) {
		for (;;) {
		    if (anIOException2192 != null)
			return;
		    if (anInt2187 == 0)
			anLocalInt = anInt2193 + (-anInt2186 - 1);
		    else if (anInt2187 <= anInt2186)
			anLocalInt = anInt2193 - anInt2186;
		    else
			anLocalInt = anInt2187 - anInt2186 - 1;
		    if (anLocalInt > 0)
			break;
		    try {
			this.wait();
		    } catch (InterruptedException interruptedexception) {
			/* empty */
		    }
		}
	    }
	    int anLocalInt_1_;
	    try {
		anLocalInt_1_ = anInputStream2189.read(aByteArray2188,
						       anInt2186, anLocalInt);
		if (anLocalInt_1_ == -1)
		    throw new EOFException();
	    } catch (IOException ioexception) {
		synchronized (this) {
		    anIOException2192 = ioexception;
		    break;
		}
	    }
	    synchronized (this) {
		anInt2186 = (anInt2186 + anLocalInt_1_) % anInt2193;
	    }
	}
    }
    
    final void method3386(boolean argument_2_) {
	synchronized (this) {
	    if (anIOException2192 == null)
		anIOException2192 = new IOException("");
	    this.notifyAll();
	}
	try {
	    aThread2190.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
    }
    
    static final int method3387(boolean argument, byte argument_3_) {
	if (Class298.anIntArray2476 == null)
	    return 0;
	if (!argument && Node_Sub35.aClass363Array4160 != null)
	    return Class298.anIntArray2476.length * 2;
	int anLocalInt = 0;
	for (int anLocalInt_4_ = 0;
	     anLocalInt_4_ < Class298.anIntArray2476.length; anLocalInt_4_++) {
	    int anLocalInt_5_ = Class298.anIntArray2476[anLocalInt_4_];
	    if (Statics.aJs5Store_5741.isFlatFile(anLocalInt_5_))
		anLocalInt++;
	    if (Node_Sub33.aJs5Store_4149.isFlatFile(anLocalInt_5_))
		anLocalInt++;
	}
	int anLocalInt_6_ = 72 / ((48 - argument_3_) / 37);
	return anLocalInt;
    }
    
    static final boolean method3388(int argument, int argument_7_,
				    int argument_8_) {
	if (argument < 0 || argument_7_ < 0
	    || argument >= Class303.tileSettings[1].length
	    || (argument_7_
		>= Class303.tileSettings[1][argument].length))
	    return false;
	if (((Class303.tileSettings[argument_8_][argument]
	      [argument_7_])
	     & 0x2)
	    != 0)
	    return true;
	return false;
    }
    
    final boolean method3389(int argument_9_, int argument_10_)
	throws IOException {
	if (argument_9_ >= argument_10_ || anInt2193 <= argument_10_)
	    throw new IOException();
	synchronized (this) {
	    int anLocalInt;
	    if (anInt2187 <= anInt2186)
		anLocalInt = -anInt2187 + anInt2186;
	    else
		anLocalInt = -anInt2187 + anInt2193 + anInt2186;
	    if (argument_10_ > anLocalInt) {
		if (anIOException2192 != null)
		    throw new IOException(anIOException2192.toString());
		this.notifyAll();
		return false;
	    }
	    return true;
	}
    }
    
    static final void method3390(int argument, int argument_11_,
				 int argument_12_, byte argument_13_,
				 int argument_14_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(19, 13175,
            ((long) argument_11_ << 32
                    | (long) argument));
	class59_sub51_sub3.method1182(argument_13_ - 49);
	((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6231 = argument_12_;
	if (argument_13_ == -63)
	    ((DoublyLinkedNode_Sub51_Sub3) class59_sub51_sub3).anInt6233 = argument_14_;
    }
    
    final int method3391(int argument_15_, int argument_16_,
			 byte[] argument_17_,
			 byte argument_18_) throws IOException {
	if (argument_16_ < 0 || argument_15_ < 0
	    || argument_16_ + argument_15_ > argument_17_.length)
	    throw new IOException();
	synchronized (this) {
	    int anLocalInt;
	    if (anInt2186 >= anInt2187)
		anLocalInt = anInt2186 - anInt2187;
	    else
		anLocalInt = anInt2186 + (anInt2193 - anInt2187);
	    if (anLocalInt < argument_16_)
		argument_16_ = anLocalInt;
	    if (argument_16_ == 0 && anIOException2192 != null)
		throw new IOException(anIOException2192.toString());
	    if (anInt2187 + argument_16_ > anInt2193) {
		int anLocalInt_19_ = anInt2193 - anInt2187;
		JagStrings.memcpy(aByteArray2188, anInt2187, argument_17_, argument_15_, anLocalInt_19_);
		JagStrings.memcpy(aByteArray2188, 0, argument_17_, argument_15_ + anLocalInt_19_, -anLocalInt_19_ + argument_16_);
	    } else
		JagStrings.memcpy(aByteArray2188, anInt2187, argument_17_, argument_15_, argument_16_);
	    anInt2187 = (argument_16_ + anInt2187) % anInt2193;
	    this.notifyAll();
	    if (argument_18_ != -110)
		return -22;
	    return argument_16_;
	}
    }
    
    static final GlTexture_Sub4_Sub1 method3392
	(int argument, int[] argument_20_, boolean argument_21_,
	 int argument_22_, int argument_23_, GlToolkit argument_24_,
	 int argument_25_, byte argument_26_) {
	if (((GlToolkit) argument_24_).aBoolean4927
	    || (Class2_Sub1.method198(argument)
		&& Class2_Sub1.method198(argument_23_)))
	    return new GlTexture_Sub4_Sub1(argument_24_, 3553, argument,
					  argument_23_, argument_21_,
					  argument_20_, argument_22_,
					  argument_25_);
	if (((GlToolkit) argument_24_).haveTextureRectangle)
	    return new GlTexture_Sub4_Sub1(argument_24_, 34037, argument,
					  argument_23_, argument_21_,
					  argument_20_, argument_22_,
					  argument_25_);
	return new GlTexture_Sub4_Sub1(argument_24_, argument, argument_23_,
				      MathStatics.method2589(argument),
				      MathStatics.method2589(argument_23_),
				      argument_20_);
    }
    
    Class274(InputStream argument_27_, int argument_28_) {
	anInt2193 = argument_28_ + 1;
	anInputStream2189 = argument_27_;
	aByteArray2188 = new byte[anInt2193];
	aThread2190 = new Thread(this);
	aThread2190.setDaemon(true);
	aThread2190.start();
    }
}
