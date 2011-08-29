/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class279
{
    private int anInt2236;
    Class241 aClass241_2237;
    int anInt2238;
    int anInt2239;
    
    static final SignlinkRequest method3416(byte argument, String argument_0_,
				    Signlink argument_1_, String argument_2_,
				    int argument_3_) {
	if (argument_3_ == 0)
	    return argument_1_.requestWebpageOpen(argument_0_);
	if (argument_3_ == 1) {
	    try {
		Object object
		    = Class328.method3697(argument_2_,
					  (new Object[]
					   { new URL
						 (Signlink.mainapp
						      .getCodeBase(),
						  argument_0_)
						 .toString() }),
					  31580, Signlink.mainapp);
		if (object == null)
		    throw new RuntimeException();
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 1;
		return signlinkRequest;
	    } catch (Throwable throwable) {
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 2;
		return signlinkRequest;
	    }
	}
	if (argument_3_ == 2) {
	    try {
		Signlink.mainapp.getAppletContext().showDocument
		    (new URL(Signlink.mainapp.getCodeBase(), argument_0_),
		     "_blank");
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 1;
		return signlinkRequest;
	    } catch (Exception exception) {
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 2;
		return signlinkRequest;
	    }
	}
	if (argument_3_ == 3) {
	    try {
		Class328.method3698(Signlink.mainapp, "loggedout",
				    (byte) 114);
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    try {
		Signlink.mainapp.getAppletContext().showDocument
		    (new URL(Signlink.mainapp.getCodeBase(), argument_0_),
		     "_top");
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 1;
		return signlinkRequest;
	    } catch (Exception exception) {
		SignlinkRequest signlinkRequest = new SignlinkRequest();
		signlinkRequest.status = 2;
		return signlinkRequest;
	    }
	}
	throw new IllegalArgumentException();
    }
    
    static final void method3417(byte argument) {
	if (Node_Sub31_Sub21.anInt5930 < 0) {
	    Node_Sub31_Sub21.anInt5930 = 0;
	    Class55.anInt409 = -1;
	    Statics.anInt2726 = -1;
	}
	if (Node_Sub31_Sub21.anInt5930 > Class179.anInt1354) {
	    Node_Sub31_Sub21.anInt5930 = Class179.anInt1354;
	    Class55.anInt409 = -1;
	    Statics.anInt2726 = -1;
	}
	if (AbstractFont.anInt418 < 0) {
	    Statics.anInt2726 = -1;
	    AbstractFont.anInt418 = 0;
	    Class55.anInt409 = -1;
	}
	if (AbstractFont.anInt418 > Class179.anInt1342) {
	    AbstractFont.anInt418 = Class179.anInt1342;
	    Statics.anInt2726 = -1;
	    Class55.anInt409 = -1;
	}
    }
    
    private final void method3418(Packet argument_4_, int argument_5_,
				  int argument_6_) {
	if (argument_6_ == 1)
	    anInt2236 = argument_4_.g2();
	else if (argument_6_ == 2) {
	    ((Class279) this).anInt2239 = argument_4_.g1();
	    ((Class279) this).anInt2238 = argument_4_.g1();
	}
	if (argument_5_ != -3)
	    anInt2236 = 1;
    }
    
    static final void method3419(int argument, boolean argument_7_,
				 byte argument_8_, int argument_9_) {
	if (argument_9_ < 8000 || argument_9_ > 48000)
	    throw new IllegalArgumentException();
	Statics.anInt44 = argument_9_;
	Node_Sub31_Sub16.anInt5909 = argument;
	Class62_Sub3.aBoolean4377 = argument_7_;
    }
    
    final void method3420(Packet argument_10_, int argument_11_) {
	if (argument_11_ != -1)
	    ((Class279) this).anInt2239 = -10;
	for (;;) {
	    int anLocalInt = argument_10_.g1();
	    if (anLocalInt == 0)
		break;
	    method3418(argument_10_, argument_11_ - 2, anLocalInt);
	}
    }
    
    final synchronized Class83 method3421(int argument_12_) {
	Class83 class83
	    = (Class83) ((Class241) ((Class279) this).aClass241_2237)
			    .aClass149_1754.get((long) anInt2236);
	if (class83 != null)
	    return class83;
	class83
	    = Class83.method1612((((Class241) ((Class279) this).aClass241_2237)
				  .aJs5Store_1753),
				 anInt2236, argument_12_);
	if (class83 != null)
	    ((Class241) ((Class279) this).aClass241_2237).aClass149_1754
		.put(class83, (long) anInt2236);
	return class83;
    }
    
    public Class279() {
	/* empty */
    }
}
