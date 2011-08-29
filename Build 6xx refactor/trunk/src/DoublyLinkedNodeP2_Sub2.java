/* Class104_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2 extends DoublyLinkedNodeP2 {
    boolean aBoolean4508;
    byte aByte4509;
    int anInt4510;
    int anInt4511;
    byte lightingHL;
    int anInt4514;
    DoublyLinkedNodeP2_Sub2 aClass104_Sub2_4515;
    int anInt4516;
    boolean aBoolean4517 = false;
    int worldX;
    int worldZ;

    final int setupLighting(int z, HardwareLight[] lights, int x) {
        long lightField = (LightingManager.virtualLightMap[this.lightingHL][x][z]);
        long shift = 0L;
        int hwLightPtr = 0;
        for (/**/; shift <= 48L; shift += 16L) {
            int vLightPtr = (int) (lightField >> (int) shift & 0xffffL);
            if (vLightPtr <= 0)
                break;
            lights[hwLightPtr++] = LightingManager.virtualLights[vLightPtr - 1].hardwareLight;
        }
        for (int lightPtr = hwLightPtr; lightPtr < 4; lightPtr++)
            lights[lightPtr] = null;
        return hwLightPtr;
    }

    abstract boolean method1765(int argument_7_);

    abstract boolean method1766(int argument_8_);

    abstract Class80 method1769(GraphicsToolkit argument_10_, byte argument_11_);

    abstract void method1770(int argument_12_);

    abstract boolean method1771(int argument_13_, int argument_14_, int argument_15_, GraphicsToolkit argument_16_);

    abstract boolean method1772(int argument_17_);

    abstract void method1773(byte argument_18_, GraphicsToolkit argument_19_);

    abstract int method1774(int argument_20_);

    abstract void method1775(GraphicsToolkit argument_21_, DoublyLinkedNodeP2_Sub2 argument_22_, boolean argument_23_, int argument_24_, int argument_25_, int argument_26_, int argument_27_);

    abstract DoublyLinkedNodeP2_Sub10 method1776(int argument_28_, GraphicsToolkit argument_29_);

    int method1779(boolean argument_38_) {
        return 0;
    }

    abstract boolean method1780(int argument_39_, GraphicsToolkit argument_40_);

    abstract int method1781(int argument_41_);

    abstract boolean method1782(int argument_42_);

    abstract int applyLighting(byte argument_43_, HardwareLight[] argument_44_);

    public DoublyLinkedNodeP2_Sub2() {
        /* empty */
    }
}
