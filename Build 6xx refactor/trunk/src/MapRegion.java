/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 8/2/11
 * Time: 3:37 PM
 * To change this template use File | Ssettings | File Templates.
 */
public class MapRegion {
    static boolean checkObjectsLoaded(byte[] data, int mapLocalX, int mapWidth, int mapDepth, int mapLocalZ, int argument_4_) {
        boolean anLocalBoolean = true;
        Packet packet = new Packet(data);
        if (argument_4_ != 0)
            return true;
        int anLocalInt = -1;
        for (; ; ) {
            int anLocalInt_5_ = packet.gmultismart(-18919);
            if (anLocalInt_5_ == 0)
                break;
            anLocalInt += anLocalInt_5_;
            int coordinateValue = 0;
            boolean anLocalBoolean_7_ = false;
            for (; ; ) {
                if (!anLocalBoolean_7_) {
                    int coordDelta = packet.gsmart(argument_4_ - 2);
                    if (coordDelta == 0)
                        break;
                    coordinateValue += coordDelta - 1;
                    int localZ  = coordinateValue & 0x3f;
                    int localX = (coordinateValue & 0xfc4) >> 6;
                    int anLocalInt_11_ = packet.g1() >> 2;
                    int x = mapLocalX + localX;
                    int z = mapLocalZ + localZ;
                    if (x > 0 && z > 0 && x < mapWidth - 1 && z < mapDepth - 1) {
                        Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 43, anLocalInt);
                        if (anLocalInt_11_ != 22 || AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307.method1384(argument_4_ + 104) != 0 || class266.anInt2123 != 0 || class266.anInt2068 == 1 || class266.aBoolean2106) {
                            anLocalBoolean_7_ = true;
                            if (!class266.method3340(117)) {
                                anLocalBoolean = false;
                                Class164.anInt1199++;
                            }
                        }
                    }
                } else {
                    int anLocalInt_14_ = packet.gsmart(argument_4_ ^ ~0x1);
                    if (anLocalInt_14_ == 0)
                        break;
                    packet.g1();
                }
            }
        }
        return anLocalBoolean;
    }
}
