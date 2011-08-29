/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class112
{
    private int anInt918 = 32;
    private boolean aBoolean920 = false;
    static int[][] anIntArrayArray922
	= { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 },
	    { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 },
	    { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 },
	    { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 },
	    { 12, 12, 12, 12 } };
    int[] anIntArray923;
    private Node_Sub9 aClass59_Sub9_924;
    private long aLong925 = Applet_Sub1.getGameTime();
    private int anInt926;
    int anInt927;
    private int anInt928;
    private int anInt929 = 0;
    private Node_Sub9[] aClass59_Sub9Array930;
    private long aLong931;
    private Node_Sub9[] aClass59_Sub9Array932;
    private int anInt933;
    private boolean aBoolean934;
    private int anInt935;
    private long aLong936;
    int anInt937;
    
    int method1995() throws Exception {
	return ((Class112) this).anInt927;
    }
    
    void method1996() throws Exception {
	/* empty */
    }
    
    void method1997() {
	/* empty */
    }
    
    void method1998() throws Exception {
	/* empty */
    }
    
    void method1999(int argument_0_) throws Exception {
	/* empty */
    }
    
    private final void method2000(int[] argument_1_, int argument_2_) {
	int anLocalInt = argument_2_;
	if (Class62_Sub3.aBoolean4377)
	    anLocalInt <<= 1;
	JagStrings.memclr(argument_1_, 0, anLocalInt);
	anInt929 -= argument_2_;
	if (aClass59_Sub9_924 != null && anInt929 <= 0) {
	    anInt929 += Statics.anInt44 >> 4;
	    Class62_Sub23.method1448(aClass59_Sub9_924, 1);
	    method2007(aClass59_Sub9_924, aClass59_Sub9_924.method576(), 8);
	    int anLocalInt_3_ = 0;
	    int anLocalInt_4_ = 255;
	    int anLocalInt_5_ = 7;
	while_64_:
	    while (anLocalInt_4_ != 0) {
		int anLocalInt_6_;
		int anLocalInt_7_;
		if (anLocalInt_5_ < 0) {
		    anLocalInt_6_ = anLocalInt_5_ & 0x3;
		    anLocalInt_7_ = -(anLocalInt_5_ >> 2);
		} else {
		    anLocalInt_6_ = anLocalInt_5_;
		    anLocalInt_7_ = 0;
		}
		for (int anLocalInt_8_
			 = anLocalInt_4_ >>> anLocalInt_6_ & 0x11111111;
		     anLocalInt_8_ != 0; anLocalInt_8_ >>>= 4) {
		    if ((anLocalInt_8_ & 0x1) != 0) {
			anLocalInt_4_ &= 1 << anLocalInt_6_ ^ 0xffffffff;
			Node_Sub9 class59_sub9 = null;
			Node_Sub9 class59_sub9_9_
			    = aClass59_Sub9Array930[anLocalInt_6_];
			while (class59_sub9_9_ != null) {
			    Node_Sub40 class59_sub40
				= (((Node_Sub9) class59_sub9_9_)
				   .aClass59_Sub40_3930);
			    if (class59_sub40 != null
				&& (((Node_Sub40) class59_sub40).anInt4199
				    > anLocalInt_7_)) {
				anLocalInt_4_ |= 1 << anLocalInt_6_;
				class59_sub9 = class59_sub9_9_;
				class59_sub9_9_
				    = (((Node_Sub9) class59_sub9_9_)
				       .aClass59_Sub9_3932);
			    } else {
				((Node_Sub9) class59_sub9_9_).aBoolean3931
				    = true;
				int anLocalInt_10_
				    = class59_sub9_9_.method575();
				anLocalInt_3_ += anLocalInt_10_;
				if (class59_sub40 != null)
				    ((Node_Sub40) class59_sub40).anInt4199
					+= anLocalInt_10_;
				if (anLocalInt_3_ >= anInt918)
				    break while_64_;
				Node_Sub9 class59_sub9_11_
				    = class59_sub9_9_.method573();
				if (class59_sub9_11_ != null) {
				    int anLocalInt_12_
					= (((Node_Sub9) class59_sub9_9_)
					   .anInt3933);
				    for (/**/; class59_sub9_11_ != null;
					 class59_sub9_11_
					     = class59_sub9_9_.method577())
					method2007(class59_sub9_11_,
						   (anLocalInt_12_
						    * class59_sub9_11_
							  .method576()) >> 8,
						   8);
				}
				Node_Sub9 class59_sub9_13_
				    = (((Node_Sub9) class59_sub9_9_)
				       .aClass59_Sub9_3932);
				((Node_Sub9) class59_sub9_9_)
				    .aClass59_Sub9_3932
				    = null;
				if (class59_sub9 == null)
				    aClass59_Sub9Array930[anLocalInt_6_]
					= class59_sub9_13_;
				else
				    ((Node_Sub9) class59_sub9)
					.aClass59_Sub9_3932
					= class59_sub9_13_;
				if (class59_sub9_13_ == null)
				    aClass59_Sub9Array932[anLocalInt_6_]
					= class59_sub9;
				class59_sub9_9_ = class59_sub9_13_;
			    }
			}
		    }
		    anLocalInt_6_ += 4;
		    anLocalInt_7_++;
		}
		anLocalInt_5_--;
	    }
	    for (int anLocalInt_14_ = 0; anLocalInt_14_ < 8;
		 anLocalInt_14_++) {
		Node_Sub9 class59_sub9
		    = aClass59_Sub9Array930[anLocalInt_14_];
		aClass59_Sub9Array930[anLocalInt_14_]
		    = aClass59_Sub9Array932[anLocalInt_14_] = null;
		Node_Sub9 class59_sub9_15_;
		for (/**/; class59_sub9 != null;
		     class59_sub9 = class59_sub9_15_) {
		    class59_sub9_15_
			= ((Node_Sub9) class59_sub9).aClass59_Sub9_3932;
		    ((Node_Sub9) class59_sub9).aClass59_Sub9_3932 = null;
		}
	    }
	}
	if (anInt929 < 0)
	    anInt929 = 0;
	if (aClass59_Sub9_924 != null)
	    aClass59_Sub9_924.method578(argument_1_, 0, argument_2_);
	aLong925 = Applet_Sub1.getGameTime();
    }
    
    final synchronized void method2001(int argument_16_) {
	aBoolean934 = true;
	try {
	    method1998();
	} catch (Exception exception) {
	    method1997();
	    aLong936 = Applet_Sub1.getGameTime() + 2000L;
	}
    }
    
    final synchronized void method2002(byte argument_17_) {
	if (!aBoolean920) {
	    long l = Applet_Sub1.getGameTime();
	    try {
		if (l > aLong925 + 6000L)
		    aLong925 = l + -6000L;
		for (/**/; aLong925 + 5000L < l; l = Applet_Sub1.getGameTime()) {
		    method2004(-5798, 256);
		    aLong925 += (long) (256000 / Statics.anInt44);
		}
	    } catch (Exception exception) {
		aLong925 = l;
	    }
	    if (((Class112) this).anIntArray923 != null) {
		try {
		    if (aLong936 != 0L) {
			if (l < aLong936)
			    return;
			method1999(((Class112) this).anInt927);
			aLong936 = 0L;
			aBoolean934 = true;
		    }
		    int anLocalInt = method1995();
		    if (anInt926 < anInt933 - anLocalInt)
			anInt926 = -anLocalInt + anInt933;
		    int anLocalInt_18_ = anInt935 + ((Class112) this).anInt937;
		    if (anLocalInt_18_ + 256 > 16384)
			anLocalInt_18_ = 16128;
		    if (((Class112) this).anInt927 < anLocalInt_18_ + 256) {
			((Class112) this).anInt927 += 1024;
			if (((Class112) this).anInt927 > 16384)
			    ((Class112) this).anInt927 = 16384;
			method1997();
			method1999(((Class112) this).anInt927);
			anLocalInt = 0;
			aBoolean934 = true;
			if (((Class112) this).anInt927
			    < anLocalInt_18_ + 256) {
			    anLocalInt_18_ = ((Class112) this).anInt927 - 256;
			    anInt935
				= anLocalInt_18_ - ((Class112) this).anInt937;
			}
		    }
		    while (anLocalInt < anLocalInt_18_) {
			method2000(((Class112) this).anIntArray923, 256);
			anLocalInt += 256;
			method1996();
		    }
		    if (aLong931 < l) {
			if (aBoolean934)
			    aBoolean934 = false;
			else {
			    if (anInt926 == 0 && anInt928 == 0) {
				method1997();
				aLong936 = l + 2000L;
				return;
			    }
			    anInt935 = Math.min(anInt928, anInt926);
			    anInt928 = anInt926;
			}
			anInt926 = 0;
			aLong931 = l + 2000L;
		    }
		    anInt933 = anLocalInt;
		} catch (Exception exception) {
		    method1997();
		    aLong936 = l + 2000L;
		}
	    }
	}
    }
    
    final synchronized void method2003(Node_Sub9 argument_19_,
				       byte argument_20_) {
	aClass59_Sub9_924 = argument_19_;
    }
    
    private final void method2004(int argument_21_, int argument_22_) {
	if (argument_21_ != -5798)
	    anInt926 = -25;
	anInt929 -= argument_22_;
	if (anInt929 < 0)
	    anInt929 = 0;
	if (aClass59_Sub9_924 != null)
	    aClass59_Sub9_924.method574(argument_22_);
    }
    
    final synchronized void method2005(int argument_23_) {
	if (MultilanguageString.aClass146_2866 != null) {
	    boolean anLocalBoolean = true;
	    for (int anLocalInt = 0; anLocalInt < 2; anLocalInt++) {
		if (this == (((Class146) MultilanguageString.aClass146_2866)
			     .aClass112Array1109[anLocalInt]))
		    ((Class146) MultilanguageString.aClass146_2866).aClass112Array1109
			[anLocalInt]
			= null;
		if ((((Class146) MultilanguageString.aClass146_2866).aClass112Array1109
		     [anLocalInt])
		    != null)
		    anLocalBoolean = false;
	    }
	    if (anLocalBoolean) {
		((Class146) MultilanguageString.aClass146_2866).aBoolean1110 = true;
		while (((Class146) MultilanguageString.aClass146_2866).aBoolean1113)
		    Timing.sleep(50L);
		MultilanguageString.aClass146_2866 = null;
	    }
	}
	method1997();
	((Class112) this).anIntArray923 = null;
	aBoolean920 = true;
    }
    
    public static void method2006(int argument) {
	ByteArrayManager.byteArrayPoolSize100 = null;
	HslToRgb.table2 = null;
	anIntArrayArray922 = null;
    }
    
    private final void method2007(Node_Sub9 argument_24_, int argument_25_,
				  int argument_26_) {
	int anLocalInt = argument_25_ >> 5;
	Node_Sub9 class59_sub9 = aClass59_Sub9Array932[anLocalInt];
	if (class59_sub9 == null)
	    aClass59_Sub9Array930[anLocalInt] = argument_24_;
	else
	    ((Node_Sub9) class59_sub9).aClass59_Sub9_3932 = argument_24_;
	aClass59_Sub9Array932[anLocalInt] = argument_24_;
	if (argument_26_ == 8)
	    ((Node_Sub9) argument_24_).anInt3933 = argument_25_;
    }
    
    static final void method2008(int argument, int argument_27_) {
	DoublyLinkedNode_Sub51_Sub3 class59_sub51_sub3
	    = Node_Sub31_Sub15_Sub1.method922(2, 13175,
            (long) argument_27_);
	class59_sub51_sub3.method1181(585134072);
    }
    
    static final void method2009(boolean argument, int argument_28_,
				 boolean argument_29_) {
	if (argument_28_ != -11692)
	    method2008(125, -115);
	if (argument) {
	    Statics.anInt2580--;
	    if (Statics.anInt2580 == 0)
		HslToRgb.table = null;
	}
	if (argument_29_) {
	    Statics.anInt6650--;
	    if (Statics.anInt6650 == 0)
		HslToRgb.table2 = null;
	}
    }
    
    void method2010(Component argument_30_) throws Exception {
	/* empty */
    }
    
    public Class112() {
	anInt928 = 0;
	aLong931 = 0L;
	anInt926 = 0;
	aClass59_Sub9Array932 = new Node_Sub9[8];
	aBoolean934 = true;
	anInt933 = 0;
	aLong936 = 0L;
	aClass59_Sub9Array930 = new Node_Sub9[8];
    }
}
