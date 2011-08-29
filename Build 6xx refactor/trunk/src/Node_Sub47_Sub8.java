/* Class59_Sub47_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub8 extends Node_Sub47
{
    static int anInt6193 = 0;
    static int anInt6194;
    private byte aByte6195;
    static RsInterface aRsInterface_6196 = null;
    private int anInt6197 = -1;
    static int anInt6198;
    
    final void method1110(int argument_0_, Packet argument_1_) {
	anInt6197 = argument_1_.g2();
	aByte6195 = argument_1_.g1s();
	if (argument_0_ > -56)
	    anInt6198 = 88;
    }
    
    final void method1109(ClanSettings argument_2_, int argument_3_) {
	argument_2_.method2766(anInt6197, aByte6195, (byte) 125);
	if (argument_3_ != 5)
	    method1110(-118, null);
    }
    
    static final void method1131(long argument, GraphicsToolkit argument_4_,
				 byte argument_5_) {
	GlTexture_Sub3.anInt5570 = Class62_Sub8.anInt4395;
	if (argument_5_ == -2) {
	    Class170.anInt1248 = 0;
	    Class367.anInt3101 = 0;
	    Class62_Sub8.anInt4395 = 0;
	    long l = Applet_Sub1.getGameTime();
	    for (DoublyLinkedNodeP2_Sub7 class104_sub7
		     = ((DoublyLinkedNodeP2_Sub7)
			Statics.aClass366_5518.method3986(0));
		 class104_sub7 != null;
		 class104_sub7 = (DoublyLinkedNodeP2_Sub7) Statics
						     .aClass366_5518
						     .method3992((byte) 47)) {
		if (class104_sub7.method1928(argument_4_, argument))
		    Class367.anInt3101++;
	    }
	    if (Statics.aBoolean471 && argument % 100L == 0L) {
		System.out.println("Particle system count: "
				   + Statics.aClass366_5518
					 .method3989(1318812549)
				   + ", running: " + Class367.anInt3101);
		System.out.println("Emitters: " + Class170.anInt1248
				   + " Particles: " + Class62_Sub8.anInt4395
				   + ". Time taken: "
				   + (Applet_Sub1.getGameTime()
				      - l)
				   + "ms");
	    }
	}
    }
    
    static final void method1132(int argument, int argument_6_,
				 byte[] argument_7_, int argument_8_,
				 int argument_9_, int argument_10_) {
	if (argument_9_ < argument_10_) {
	    argument_6_ = -argument_9_ + argument_10_ >> 2;
	    argument_8_ += argument_9_;
	    while (--argument_6_ >= 0) {
		argument_7_[argument_8_++] = (byte) 1;
		argument_7_[argument_8_++] = (byte) 1;
		argument_7_[argument_8_++] = (byte) 1;
		argument_7_[argument_8_++] = (byte) 1;
	    }
	    argument_6_ = argument_10_ - argument_9_ & 0x3;
	    while (--argument_6_ >= 0)
		argument_7_[argument_8_++] = (byte) 1;
	}
    }
    
    public static void method1133(boolean argument) {
	aRsInterface_6196 = null;
    }
}
