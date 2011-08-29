/* Class199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class199
{
    static int anInt1443;
    static Class367[] aClass367Array1445 = new Class367[14];
    
    public static void method2910(byte argument) {
	HslToRgb.table = null;
	aClass367Array1445 = null;
    }
    
    static final void method2911(boolean argument,
				 DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 argument_0_) {
	Node_Sub13 class59_sub13
	    = ((Node_Sub13)
	       (Class299.aJagexHashMap_2496.get((long) ((Entity) argument_0_).anInt6745)));
	if (class59_sub13 == null)
	    Class245_Sub2.method3192((((Entity) argument_0_)
				      .pathX[0]),
				     (((Entity) argument_0_)
				      .pathZ[0]),
				     null, null, argument_0_, 0, -119,
				     ((DoublyLinkedNodeP2_Sub2) argument_0_).lightingHL);
	else
	    class59_sub13.method691((byte) 31);
    }
    
    static {
	anInt1443 = 0;
    }
}
