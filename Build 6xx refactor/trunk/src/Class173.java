/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class173 {
    int anInt1282;
    int anInt1283;
    boolean aBoolean1284;
    int anInt1285;
    static AbstractFont aAbstractFont_1286;
    int anInt1287;
    short aShort1288;
    int anInt1289;
    byte aByte1291;
    short aShort1292;
    short aShort1293;

    public static void method2768(byte argument) {
        client.settingsString = null;
        aAbstractFont_1286 = null;
    }

    static final void method2769(boolean argument, String argument_3_, boolean argument_4_, int argument_5_, String argument_6_, byte argument_7_, boolean argument_8_, int p2, int actionId, long argument_11_, int argument_12_, int argument_13_, long p1) {
        if (!Node_Sub31_Sub39.aBoolean6055 && Class62_Sub12.anInt4402 < 500) {
            argument_13_ = argument_13_ != -1 ? argument_13_ : Class62_Sub10.anInt4399;
            MenuAction action = new MenuAction(argument_3_, argument_6_, argument_13_, actionId, argument_5_, p1, p2, argument_12_, argument_8_, argument, argument_11_, argument_4_);
            Class20.method318(1, action);
        }
    }

    Class173(int argument_15_, int argument_16_, int argument_17_, int argument_18_, int argument_19_, int argument_20_, int argument_21_, int argument_22_, int argument_23_, boolean argument_24_, boolean argument_25_, int argument_26_) {
        this.aByte1291 = (byte) argument_23_;
        this.anInt1282 = argument_15_;
        this.anInt1289 = argument_16_;
        this.aBoolean1284 = argument_25_;
        this.aShort1288 = (short) argument_20_;
        this.aShort1292 = (short) argument_21_;
        this.anInt1285 = argument_17_;
        this.anInt1287 = argument_26_;
        this.aShort1293 = (short) argument_19_;
        this.anInt1283 = argument_18_;
    }
}
