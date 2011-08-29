/* Class59_Sub47_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub47_Sub7 extends Node_Sub47
{
    private String aString6186;
    static int[] anIntArray6187 = new int[6];
    static MenuAction aClass59_Sub51_Sub9_6188;
    private long aLong6189 = -1L;
    static Class166 aClass166_6190 = new Class166(47, 3);
    static Class112 aClass112_6191;
    static int[] anIntArray6192 = new int[13];
    
    final void method1109(ClanSettings argument_0_, int argument_1_) {
	if (argument_1_ == 5)
	    argument_0_.method2764(aString6186, aLong6189);
    }
    
    final void method1110(int argument_2_, Packet argument_3_) {
	if (argument_3_.g1() != 255) {
	    ((Packet) argument_3_).pos--;
	    aLong6189 = argument_3_.g8();
	}
	if (argument_2_ >= -56)
	    aClass166_6190 = null;
	aString6186 = argument_3_.fastgstr((byte) 110);
    }
    
    static final Class368 method1128(int argument, Js5Store argument_4_,
				     int argument_5_) {
	if (argument != 47)
	    aClass59_Sub51_Sub9_6188 = null;
	Class368 class368
	    = ((Class368)
	       Class134.aClass149_3607.get((long) argument_5_));
	if (class368 == null) {
	    if (client.useOldBootData)
		class368
		    = (Class389.aGraphicsToolkit3281.method2033
		       (Class83.method1609(argument_4_, argument_5_), true));
	    else
		class368 = (DoublyLinkedNode_Sub51_Sub10.method1245(argument_4_.getFlatData(argument_5_)));
	    Class134.aClass149_3607.put(class368, (long) argument_5_);
	}
	return class368;
    }
    
    public static void method1129(int argument) {
	anIntArray6187 = null;
	anIntArray6192 = null;
	aClass166_6190 = null;
	aClass59_Sub51_Sub9_6188 = null;
	aClass112_6191 = null;
    }
    
    static final void method1130(byte argument) {
	FileOnDisk fileOnDisk = null;
	try {
	    fileOnDisk = Signlink.getPreferencesFile("2");
	    Packet class59_sub28
		= new Packet(Statics.anInt1152 * 6 + 3);
	    class59_sub28.p1(1);
	    class59_sub28.p2(Statics.anInt1152);
	    for (int anLocalInt = 0;
		 anLocalInt < Cs2Runtime.integerGlobalVariables.length; anLocalInt++) {
		if (Class273.aBooleanArray2184[anLocalInt]) {
		    class59_sub28.p2(anLocalInt);
		    class59_sub28.p4((Cs2Runtime.integerGlobalVariables
                    [anLocalInt])
            );
		}
	    }
	    fileOnDisk.write(((Packet) class59_sub28).data, 0,
                ((Packet) class59_sub28).pos);
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (fileOnDisk != null)
		fileOnDisk.close();
	} catch (Exception exception) {
	    /* empty */
	}
	Node_Sub47_Sub4.aLong6169 = Applet_Sub1.getGameTime();
	Class242.aBoolean1771 = false;
    }
    
    Node_Sub47_Sub7() {
	aString6186 = null;
    }
}
