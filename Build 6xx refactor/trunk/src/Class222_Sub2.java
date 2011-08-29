/* Class222_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class222_Sub2 extends Class222
{
    Class289[] aClass289Array5295;
    static Class166 aClass166_5297 = new Class166(43, 3);
    
    static final boolean method3033(int argument, boolean argument_0_,
				    int argument_1_) {
	if ((argument_1_ & 0x180) == 0)
	    return false;
	return true;
    }
    
    Class222_Sub2(Class289[] argument_2_) {
	((Class222_Sub2) this).aClass289Array5295 = argument_2_;
    }
    
    public static void method3034(byte argument) {
	aClass166_5297 = null;
	MapRelated.mapFileMId = null;
    }
    
    static final Class110 method3035(int argument, int argument_3_,
				     int argument_4_) {
	Class148 class148 = (GraphicsToolkit_Sub2.aClass148ArrayArrayArray4676
			     [argument][argument_3_][argument_4_]);
	if (class148 == null)
	    return null;
	return ((Class148) class148).aClass110_1126;
    }
    
    static final void method3036(int argument) {
	if (!Class266.aBoolean2105) {
	    Statics.aFloat4338
		+= (12.0F - Statics.aFloat4338) / 2.0F;
	    Statics.aBoolean3513 = true;
	    Class266.aBoolean2105 = true;
	}
    }
    
    static final void method3037(boolean argument, boolean argument_5_,
				 Node_Sub49 argument_6_, int argument_7_) {
	int anLocalInt = ((Node_Sub49) argument_6_).anInt4291;
	int anLocalInt_8_ = (int) ((Node) argument_6_).hash;
	argument_6_.unlink();
	if (argument_5_)
	    Node_Sub9_Sub1.method580(argument_7_ ^ ~0x52b1374, anLocalInt);
	Class88.method1647(anLocalInt, 0);
	RsInterface rsInterface = RsInterface.getByHash(anLocalInt_8_);
	if (rsInterface != null)
	    Class256.method3280(rsInterface, true);
	Class345.method3803(true);
	if (!argument && Class66.anInt467 != -1)
	    Class62_Sub21.method1442((byte) -47, 1, Class66.anInt467);
	if (argument_7_ != -86709072)
	    method3037(false, true, null, -26);
	Class391 class391 = new Class391(Class2_Sub5.aJagexHashMap_3787);
	for (Node_Sub49 class59_sub49
		 = (Node_Sub49) class391.method4141(51);
	     class59_sub49 != null;
	     class59_sub49
		 = (Node_Sub49) class391.method4137((byte) -121)) {
	    if (!class59_sub49.isLinked()) {
		class59_sub49 = ((Node_Sub49)
				 class391.method4141(argument_7_ + 86709125));
		if (class59_sub49 == null)
		    break;
	    }
	    if (((Node_Sub49) class59_sub49).anInt4289 == 3) {
		int anLocalInt_9_ = (int) ((Node) class59_sub49).hash;
		if (anLocalInt == anLocalInt_9_ >>> 16)
		    method3037(argument, true, class59_sub49, argument_7_);
	    }
	}
    }
    
    static final void method3038(int argument, byte argument_10_) {
	Class55.anInt409 = -1;
	AbstractFont.anInt418 = argument;
	Class55.anInt409 = -1;
	Class279.method3417((byte) 96);
    }
}
