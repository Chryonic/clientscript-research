/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class Class373
{
    static Class166 aClass166_3199 = new Class166(104, 5);
    static float aFloat3200;
    static int anInt3201;
    static int[] anIntArray3202 = { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
    static int anInt3204;
    static int anInt3205;
    
    static final void method4072(Canvas argument, byte argument_0_) {
	Dimension dimension = argument.getSize();
	Class9.method244(dimension.height, (byte) 122, dimension.width);
	if (Class50.anInt365 == 1)
	    Statics.aGraphicsToolkit5822.setCanvas(argument, (dba_sub_772_Sub2.anInt6366), (Class189_Sub3.anInt5647));
	else
	    Statics.aGraphicsToolkit5822.setCanvas(argument, Class349.anInt2921, (Class353_Sub9.anInt5523));
    }
    
    static final boolean method4073(int argument, int argument_1_,
				    int argument_2_) {
	return (Statics.method2958(argument, (byte) -11, argument_2_)
		& Node_Sub13.method689(0, argument, argument_2_));
    }
    
    static final boolean method4074(int argument, int argument_3_,
				    int argument_4_) {
	if (!Node_Sub30.method863(argument, argument_4_, false)
	    && !Node_Sub50.method1166(argument, (byte) 0, argument_4_))
	    return false;
	return true;
    }
    
    public static void method4075(boolean argument) {
	aClass166_3199 = null;
	anIntArray3202 = null;
    }
    
    static final void method4076(byte argument) {
	if (argument == 9) {
	    for (Node_Sub23 class59_sub23
		     = (Node_Sub23) Node_Sub37_Sub1.aJagexHashMap_6114
					   .first(argument ^ 0x9);
		 class59_sub23 != null;
		 class59_sub23
		     = (Node_Sub23) Node_Sub37_Sub1.aJagexHashMap_6114
					   .next())
		Class389.method4135(101,
				    ((Node_Sub23) class59_sub23).anInt4053);
	}
    }
    
    static {
	anInt3201 = 1;
	anInt3204 = -1;
	anInt3205 = 0;
    }
}
