/* Class1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;

final class Class1_Sub2 extends Class1 implements Interface4_Impl2 {
    private byte stride;

    public final boolean method51(int argument_0_, int argument_1_, int argument_2_, Source argument_3_) {
        stride = (byte) argument_1_;
        if (argument_2_ != -959)
            return true;
        super.setData(argument_0_, argument_3_);
        return true;
    }

    public final boolean method53(int argument_4_) {
        if (argument_4_ != 10925)
            method50(true, false);
        return super.method174(false, (this.toolkit.aMapBuffer__6470));
    }

    public final boolean method52(int argument_16_, int argument_17_, int argument_18_) {
        stride = (byte) argument_17_;
        super.setSize(argument_16_, (byte) -73);
        if (argument_18_ != -10760)
            return true;
        return true;
    }

    final int getStride() {
        return stride;
    }

    public final Buffer method50(boolean argument_23_, boolean argument_24_) {
        return super.method173((this.toolkit.aMapBuffer__6470), argument_24_);
    }

    public final void method44(int check_) {
        super.method44(check_);
    }

    public final int getSize(byte argument_36_) {
        return super.getSize((byte) 100);
    }

    Class1_Sub2(GraphicsToolkit_Sub2_Sub1 argument_41_, boolean argument_42_) {
        super(argument_41_, 34962, argument_42_);
    }
}
