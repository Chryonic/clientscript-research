/* Class323 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class323
{
    char aChar2662;
    char aChar2663;
    private int anInt2664;
    static Class207 aClass207_2665 = new Class207(0, 3);
    JagexHashMap aJagexHashMap_2666;
    private String aString2667 = "null";
    private JagexHashMap aJagexHashMap_2668;
    static int anInt2669;
    static int anInt2670 = -1;
    private int anInt2671;
    
    final int method3669(int argument_0_, byte argument_1_) {
	if (((Class323) this).aJagexHashMap_2666 == null)
	    return anInt2671;
	IntegerNode class59_sub54
	    = ((IntegerNode)
	       ((Class323) this).aJagexHashMap_2666.get((long) argument_0_));
	if (class59_sub54 == null)
	    return anInt2671;
	return ((IntegerNode) class59_sub54).value;
    }
    
    private final void method3670(byte argument_2_) {
	aJagexHashMap_2668 = new JagexHashMap(((Class323) this).aJagexHashMap_2666
					.method1524());
	if (argument_2_ > 97) {
	    for (StringNode class59_sub34
		     = ((StringNode)
			((Class323) this).aJagexHashMap_2666.first(0));
		 class59_sub34 != null;
		 class59_sub34
		     = (StringNode) ((Class323) this).aJagexHashMap_2666
					   .next()) {
		Node_Sub30 class59_sub30
		    = new Node_Sub30((((StringNode) class59_sub34)
					 .value),
					(int) (((Node) class59_sub34)
					       .hash));
		aJagexHashMap_2668.put(Class245.method3167((((StringNode) class59_sub34).value), 1009120652), class59_sub30);
	    }
	}
    }
    
    final void method3671(byte argument_3_, Packet argument_4_) {
	for (;;) {
	    int anLocalInt = argument_4_.g1();
	    if (anLocalInt == 0)
		break;
	    method3673(4, argument_4_, anLocalInt);
	}
    }
    
    public static void method3672(int argument) {
	aClass207_2665 = null;
    }
    
    private final void method3673(int argument_5_, Packet argument_6_,
				  int argument_7_) {
	if (argument_7_ == 1)
	    ((Class323) this).aChar2663
		= JagexStringUtils.parseCharacter(argument_6_.g1s());
	else if (argument_7_ == 2)
	    ((Class323) this).aChar2662
		= JagexStringUtils.parseCharacter(argument_6_.g1s());
	else if (argument_7_ != 3) {
	    if (argument_7_ != 4) {
		if (argument_7_ == 5 || argument_7_ == 6) {
		    anInt2664 = argument_6_.g2();
		    ((Class323) this).aJagexHashMap_2666
			= new JagexHashMap(MathStatics.method2589(anInt2664));
		    for (int anLocalInt = 0; anLocalInt < anInt2664;
			 anLocalInt++) {
			int anLocalInt_8_ = argument_6_.g4();
			Node node;
			if (argument_7_ == 5)
			    node
				= new StringNode(argument_6_
							.gstr());
			else
			    node
				= new IntegerNode(argument_6_.g4());
			((Class323) this).aJagexHashMap_2666
			    .put((long) anLocalInt_8_, node);
		    }
		}
	    } else
		anInt2671 = argument_6_.g4();
	} else
	    aString2667 = argument_6_.gstr();
	if (argument_5_ != 4) {
	    /* empty */
	}
    }
    
    final String method3674(int argument_9_, int argument_10_) {
	if (((Class323) this).aJagexHashMap_2666 == null)
	    return aString2667;
	StringNode class59_sub34
	    = ((StringNode)
	       ((Class323) this).aJagexHashMap_2666.get((long) argument_10_));
	if (class59_sub34 == null)
	    return aString2667;
	return ((StringNode) class59_sub34).value;
    }
    
    final boolean method3675(int argument_11_, int argument_12_) {
	if (((Class323) this).aJagexHashMap_2666 == null)
	    return false;
	if (aJagexHashMap_2668 == null)
	    method3676((byte) 113);
	IntegerNode class59_sub54
	    = (IntegerNode) aJagexHashMap_2668.get((long) argument_11_);
	if (class59_sub54 == null)
	    return false;
	if (argument_12_ != -4)
	    return false;
	return true;
    }
    
    private final void method3676(byte argument_13_) {
	aJagexHashMap_2668 = new JagexHashMap(((Class323) this).aJagexHashMap_2666
					.method1524());
	if (argument_13_ != 113)
	    method3671((byte) -48, null);
	for (IntegerNode class59_sub54 = (IntegerNode) ((Class323) this)
							       .aJagexHashMap_2666
							       .first(0);
	     class59_sub54 != null;
	     class59_sub54 = (IntegerNode) ((Class323) this)
						 .aJagexHashMap_2666
						 .next()) {
	    IntegerNode class59_sub54_14_
		= new IntegerNode((int) ((Node) class59_sub54).hash);
	    aJagexHashMap_2668.put((long) (((IntegerNode) class59_sub54).value), class59_sub54_14_);
	}
    }
    
    final boolean method3677(String argument_15_, int argument_16_) {
	if (((Class323) this).aJagexHashMap_2666 == null)
	    return false;
	if (aJagexHashMap_2668 == null)
	    method3670((byte) 99);
	for (Node_Sub30 class59_sub30
		 = ((Node_Sub30)
		    aJagexHashMap_2668.get(Class245.method3167(argument_15_, 1009120652)));
	     class59_sub30 != null;
	     class59_sub30
		 = (Node_Sub30) aJagexHashMap_2668.method1526()) {
	    if (((Node_Sub30) class59_sub30).aString4133
		    .equals(argument_15_))
		return true;
	}
	return false;
    }
    
    public Class323() {
	/* empty */
    }
}
