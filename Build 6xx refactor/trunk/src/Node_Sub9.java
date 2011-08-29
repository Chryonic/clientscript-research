/* Class59_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub9 extends Node
{
    Node_Sub40 aClass59_Sub40_3930;
    volatile boolean aBoolean3931 = true;
    Node_Sub9 aClass59_Sub9_3932;
    int anInt3933;
    
    abstract Node_Sub9 method573();
    
    abstract void method574(int argument_0_);
    
    abstract int method575();
    
    int method576() {
	return 255;
    }
    
    abstract Node_Sub9 method577();
    
    abstract void method578(int[] argument_1_, int argument_2_,
			    int argument_3_);
    
    final void method579(int[] argument_4_, int argument_5_, int argument_6_) {
	if (((Node_Sub9) this).aBoolean3931)
	    method578(argument_4_, argument_5_, argument_6_);
	else
	    method574(argument_6_);
    }
    
    public Node_Sub9() {
	/* empty */
    }
}
