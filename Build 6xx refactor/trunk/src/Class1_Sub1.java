/* Class1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Buffer;

final class Class1_Sub1 extends Class1 implements Interface4_Impl1
{
    private DataType aDataType_5597;
    static Class207 aClass207_5598;
    static short[] aShortArray5599 = new short[256];
    static boolean[] aBooleanArray5600;
    static int[] anIntArray5601;
    
    public static void method176(int argument) {
	aShortArray5599 = null;
	anIntArray5601 = null;
	aBooleanArray5600 = null;
	aClass207_5598 = null;
    }
    
    public final boolean method41(int argument_0_) {
	if (argument_0_ != 26937)
	    return true;
	return super.method174(false,
			       (((GraphicsToolkit_Sub2_Sub1)
				 ((Class1) this).toolkit)
				.aMapBuffer__6468));
    }
    
    public final int getSize(byte argument_1_) {
	if (argument_1_ < 81)
	    return 88;
	return super.getSize((byte) 94);
    }
    
    public final DataType method42(int argument_2_) {
	if (argument_2_ != 21064)
	    return null;
	return aDataType_5597;
    }
    
    public final Buffer method43(boolean argument_3_, int argument_4_) {
	if (argument_4_ != 3754)
	    return null;
	return super.method173((((GraphicsToolkit_Sub2_Sub1)
				 ((Class1) this).toolkit)
				.aMapBuffer__6468),
			       argument_3_);
    }
    
    Class1_Sub1(GraphicsToolkit_Sub2_Sub1 argument_5_, DataType argument_6_,
		boolean argument_7_) {
	super(argument_5_, 34963, argument_7_);
	aDataType_5597 = argument_6_;
    }
    
    public final void setSize(int size_, byte argument_9_) {
	super.setSize(((DataType) aDataType_5597).length * size_, argument_9_);
    }
    
    public final void method44(int check_) {
	super.method44(check_);
    }

    public void method45(int argument_5_, byte argument_6_) {
        //To change body of implemented methods use File | JagexStringEncoding | File Templates.
    }

    static {
	aClass207_5598 = new Class207(67, -1);
	anIntArray5601 = new int[] { 1, 2, 4, 8 };
	aBooleanArray5600 = new boolean[100];
    }
}
