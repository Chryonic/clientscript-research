/* Class104_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DoublyLinkedNodeP2_Sub2_Sub2 extends DoublyLinkedNodeP2_Sub2 {
    short top;
    byte aByte6408;
    short bottom;
    boolean aBoolean6411;
    short right;
    short left;

    void method1795(int argument_0_) {
        /* empty */
    }

    final int applyLighting(byte argument_1_, HardwareLight[] lights) {
        int hwLightId = 0;
        while_228_:
        for (int x = this.left; x <= this.right; x++) {
            for (int z = this.bottom; z <= this.top; z++) {
                long lightField = (LightingManager.virtualLightMap[this.lightingHL][x][z]);
                long shift = 0L;
                while_227_:
                while (shift <= 48L) {
                    int vLightId = (int) (lightField >>> (int) shift & 0xffffL);
                    if (vLightId <= 0) break;
                    VirtualLight virtualLight = (LightingManager.virtualLights[vLightId - 1]);
                    for (int _hwLightId = 0; _hwLightId < hwLightId; _hwLightId++) {
                        if (lights[_hwLightId] == virtualLight.hardwareLight) {
                            shift += 16L;
                            continue while_227_;
                        }
                    }
                    lights[hwLightId++] = virtualLight.hardwareLight;
                    if (hwLightId == 4) break while_228_;
                    shift += 16L;
                }
            }
        }
        for (int _hwLightID = hwLightId; _hwLightID < 4; _hwLightID++)
            lights[_hwLightID] = null;
        if (this.aByte6408 != 0) {
            int anLocalInt_9_ = (-Class189_Sub2.anInt5642 + this.left);
            int anLocalInt_10_ = this.bottom - Class311.anInt2592;
            short anLocalInt_11_;
            int anLocalInt_12_;
            int anLocalInt_13_;
            short anLocalInt_14_;
            if (this.aByte6408 == 1) {
                if (anLocalInt_9_ < anLocalInt_10_) {
                    anLocalInt_12_ = this.bottom - 1;
                    anLocalInt_13_ = this.left + 1;
                    anLocalInt_14_ = this.left;
                    anLocalInt_11_ = this.bottom;
                } else {
                    anLocalInt_12_ = this.bottom + 1;
                    anLocalInt_14_ = this.left;
                    anLocalInt_13_ = this.left - 1;
                    anLocalInt_11_ = this.bottom;
                }
            } else if (-anLocalInt_9_ < anLocalInt_10_) {
                anLocalInt_11_ = this.bottom;
                anLocalInt_12_ = this.bottom - 1;
                anLocalInt_13_ = this.left - 1;
                anLocalInt_14_ = this.left;
            } else {
                anLocalInt_13_ = this.left + 1;
                anLocalInt_14_ = this.left;
                anLocalInt_12_ = this.bottom + 1;
                anLocalInt_11_ = this.bottom;
            }
            int _hwLightId = 0;
            while_230_:
            for (/**/; _hwLightId < hwLightId; _hwLightId++) {
                long l = (LightingManager.virtualLightMap[this.lightingHL][anLocalInt_14_][anLocalInt_12_]);
                while (l != 0L) {
                    VirtualLight virtualLight = (LightingManager.virtualLights[(int) ((l & 0xffffL) + -1L)]);
                    l >>>= 16;
                    if (virtualLight.hardwareLight == lights[_hwLightId])
                        continue while_230_;
                }
                l = (LightingManager.virtualLightMap[this.lightingHL][anLocalInt_13_][anLocalInt_11_]);
                while (l != 0L) {
                    VirtualLight virtualLight = (LightingManager.virtualLights[(int) ((l & 0xffffL) + -1L)]);
                    l >>>= 16;
                    if (virtualLight.hardwareLight == lights[_hwLightId])
                        continue while_230_;
                }
                for (int anLocalInt_16_ = _hwLightId; anLocalInt_16_ < hwLightId - 1; anLocalInt_16_++)
                    lights[anLocalInt_16_] = lights[anLocalInt_16_ + 1];
                hwLightId--;
            }
        }
        return hwLightId;
    }

    final boolean method1765(int argument_18_) {
        if (argument_18_ < 103) return true;
        for (int anLocalInt = this.left; this.right >= anLocalInt; anLocalInt++) {
            for (int anLocalInt_19_ = this.bottom; anLocalInt_19_ <= this.top; anLocalInt_19_++) {
                int anLocalInt_20_ = (Node_Sub35.anInt4158 + anLocalInt - Class189_Sub2.anInt5642);
                if (anLocalInt_20_ >= 0 && (anLocalInt_20_ < Class242.aBooleanArrayArray1757.length)) {
                    int anLocalInt_21_ = (anLocalInt_19_ - Class311.anInt2592 + Node_Sub35.anInt4158);
                    if (anLocalInt_21_ >= 0 && (Class242.aBooleanArrayArray1757.length > anLocalInt_21_) && (Class242.aBooleanArrayArray1757[anLocalInt_20_][anLocalInt_21_]))
                        return true;
                }
            }
        }
        return false;
    }

    final boolean method1780(int argument_26_, GraphicsToolkit argument_27_) {
        if (argument_26_ != 101) return true;
        return Class122.method2388(this.right, -101, this.method1769(argument_27_, (byte) -126), this.bottom, this.top, this.aByte4509, this.left);
    }

    DoublyLinkedNodeP2_Sub2_Sub2(int argument_28_, int argument_29_, int argument_30_, int argument_31_, int argument_32_, int argument_33_, int argument_34_, int argument_35_, int argument_36_, boolean argument_37_, byte argument_38_) {
        ((DoublyLinkedNodeP2_Sub2) this).aByte4509 = (byte) argument_29_;
        ((DoublyLinkedNodeP2_Sub2) this).worldX = argument_30_;
        ((DoublyLinkedNodeP2_Sub2) this).lightingHL = (byte) argument_28_;
        this.aByte6408 = argument_38_;
        this.aBoolean6411 = argument_37_;
        this.bottom = (short) argument_35_;
        ((DoublyLinkedNodeP2_Sub2) this).anInt4511 = argument_31_;
        this.left = (short) argument_33_;
        ((DoublyLinkedNodeP2_Sub2) this).worldZ = argument_32_;
        this.top = (short) argument_36_;
        this.right = (short) argument_34_;
    }

    static {
    }
}
