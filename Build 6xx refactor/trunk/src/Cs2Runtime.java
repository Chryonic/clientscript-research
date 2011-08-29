/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import sun.org.mozilla.javascript.internal.Script;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

final class Cs2Runtime {
    private static int stringStackCounter;
    private static RsInterface staticInterface;
    private static long[] longLocalVariables;
    private static RsInterface instanceInterface;
    static int anInt2643;
    private static int longStackCounter;
    private static Cs2CallStackEntry[] callStack;
    private static int[][] arrayVariables;
    private static int integerStackCounter;
    private static Class379 aClass379_2648;
    static int anInt2649;
    private static int callStackCounter;
    static Class149 aClass149_2651;
    private static int[] arrayLength;
    private static ClanChannel aClass59_Sub53_2653;
    private static int[] integerStack = new int[1000];
    private static ClanSettings currentClanSettings;
    private static String[] stringStack;
    private static long[] longStack;
    private static int[] anIntArray2658;
    private static int[] integerLocalVariables;
    private static String[] stringLocalVariables;
    private static int anInt2661;
    static int[] integerGlobalVariables;
    static String[] stringGlobalVariable;
    private static Cs2DebuggerServer debugger = new Cs2DebuggerServer();

    private static void writeState(DataOutputStream dOS,int pc,Cs2Script scrpt) throws IOException {
        dOS.writeInt(pc);
        dOS.writeInt(integerStackCounter);
        dOS.writeInt(stringStackCounter);
        dOS.writeInt(longStackCounter);
        dOS.writeInt(callStackCounter);
        /*dOS.writeInt(scrpt.integerVariableCount);
        dOS.writeInt(scrpt.stringVariableCount);
        dOS.writeInt(scrpt.longVariableCount);
        dOS.writeInt(callStackCounter);
        for (int i = 0;i < integerStackCounter;i++)
            dOS.writeInt(integerStack[i]);
        for (int i = 0;i < stringStackCounter;i++)
            dOS.writeUTF(stringStack[i]);
        for (int i = 0;i < longStackCounter;i++)
            dOS.writeLong(longStack[i]);
        for (int i = 0;i < scrpt.integerVariableCount;i++)
            dOS.writeInt(integerLocalVariables[i]);
        for (int i = 0;i < scrpt.stringVariableCount;i++)
            dOS.writeUTF(stringLocalVariables[i]);
        for (int i = 0;i < scrpt.longVariableCount;i++)
            dOS.writeLong(longLocalVariables[i]);
        for (int i = 0;i < callStackCounter;i++)
            callStack[i].writeState(dOS);   */
    }

    public static void method3651() {
        integerLocalVariables = null;
        stringLocalVariables = null;
        longLocalVariables = null;
        arrayLength = null;
        arrayVariables = null;
        integerStack = null;
        stringStack = null;
        longStack = null;
        callStack = null;
        staticInterface = null;
        instanceInterface = null;
        aClass379_2648 = null;
        currentClanSettings = null;
        aClass59_Sub53_2653 = null;
        anIntArray2658 = null;
        aClass149_2651 = null;
    }

    private static int isValidChar(char argument) {
        if (RsInterface.isValidChar(argument))
            return 1;
        return 0;
    }

    private static void method3653(int opcode, boolean isInstance) {
        if (opcode < 300) {
            if (opcode == 150) {//cc_create
                integerStackCounter -= 3;
                int idHash = integerStack[integerStackCounter];
                int type = integerStack[integerStackCounter + 1];
                int index = integerStack[integerStackCounter + 2];
                if (type == 0)
                    throw new RuntimeException();
                RsInterface rsInterface = RsInterface.getByHash(idHash);
                if (rsInterface.children == null)
                    rsInterface.children = new RsInterface[index + 1];
                if (rsInterface.children.length <= index) {
                    RsInterface[] rsInterfaces = new RsInterface[index + 1];
                    System.arraycopy(rsInterface.children, 0, rsInterfaces, 0, rsInterface.children.length);
                    rsInterface.children = rsInterfaces;
                }
                if (index > 0 && (rsInterface.children[index - 1]) == null)
                    throw new RuntimeException("Gap at:" + (index - 1));
                RsInterface child = new RsInterface();
                child.type = type;
                child.parentId = child.idHash = rsInterface.idHash;
                child.subId = index;
                rsInterface.children[index] = child;
                if (isInstance)
                    instanceInterface = child;
                else
                    staticInterface = child;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 151) {//cc_delete
                RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                if (rsInterface.subId == -1) {
                    if (isInstance)
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                RsInterface rsInterface_5_ = RsInterface.getByHash(rsInterface.idHash);
                rsInterface_5_.children[rsInterface.subId] = null;
                Class256.method3280(rsInterface_5_, true);
                return;
            }
            if (opcode == 152) { //cc_delete_all
                RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                rsInterface.children = null;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 200) { // cc_load
                integerStackCounter -= 2;
                int parentHash = integerStack[integerStackCounter];
                int childIndex = integerStack[integerStackCounter + 1];
                RsInterface rsInterface = RsInterface.getCreatedChild(parentHash, childIndex);
                if (rsInterface != null && childIndex != -1) {
                    integerStack[integerStackCounter++] = 1;
                    if (isInstance)
                        instanceInterface = rsInterface;
                    else
                        staticInterface = rsInterface;
                } else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (opcode == 201) {  //if_load
                int anLocalInt = integerStack[--integerStackCounter];
                RsInterface rsInterface = RsInterface.getByHash(anLocalInt);
                if (rsInterface != null) {
                    integerStack[integerStackCounter++] = 1;
                    if (isInstance)
                        instanceInterface = rsInterface;
                    else
                        staticInterface = rsInterface;
                } else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (opcode == 202) {
                int anLocalInt = integerStack[--integerStackCounter];
                createCustomInterfacePTB(anLocalInt);
                return;
            }
            if (opcode == 203) {
                int anLocalInt = integerStack[--integerStackCounter];
                createCustomInterfacePTF(anLocalInt);
                return;
            }
        } else if (opcode < 500) {
            if (opcode == 403) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_7_ = integerStack[integerStackCounter + 1];
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854 != null) {
                    for (int anLocalInt_8_ = 0; anLocalInt_8_ < Class264.anIntArray2044.length; anLocalInt_8_++) {
                        if (Class264.anIntArray2044[anLocalInt_8_] == anLocalInt) {
                            Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.method329(anLocalInt_7_, DoublyLinkedNodeP2_Sub5.aClass383_4536, false, anLocalInt_8_);
                            return;
                        }
                    }
                    for (int anLocalInt_9_ = 0; anLocalInt_9_ < Statics.anIntArray2235.length; anLocalInt_9_++) {
                        if (Statics.anIntArray2235[anLocalInt_9_] == anLocalInt) {
                            Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.method329(anLocalInt_7_, DoublyLinkedNodeP2_Sub5.aClass383_4536, false, anLocalInt_9_);
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            if (opcode == 404) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_10_ = integerStack[integerStackCounter + 1];
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854 != null) {
                    Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.method330(anLocalInt, (byte) -41, anLocalInt_10_);
                    return;
                }
                return;
            }
            if (opcode == 410) {
                boolean anLocalBoolean = integerStack[--integerStackCounter] != 0;
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854 != null) {
                    Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.method332(anLocalBoolean, (byte) -54);
                    return;
                }
                return;
            }
            if (opcode == 411) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_11_ = integerStack[integerStackCounter + 1];
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854 != null) {
                    Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.method324(Class253_Sub1_Sub1.aClass365_6632, (byte) 65, anLocalInt, anLocalInt_11_);
                    return;
                }
                return;
            }
        } else if (opcode >= 1000 && opcode < 1100 || opcode >= 2000 && opcode < 2100) {
            RsInterface rsInterface;
            if (opcode >= 2000) {
                opcode -= 1000;
                rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
            } else
                rsInterface = isInstance ? instanceInterface : staticInterface;
            if (opcode == 1000) {
                integerStackCounter -= 4;
                rsInterface.x = integerStack[integerStackCounter];
                rsInterface.y = integerStack[integerStackCounter + 1];
                int hMode = integerStack[integerStackCounter + 2];
                if (hMode < 0)
                    hMode = 0;
                else if (hMode > 5)
                    hMode = 5;
                int vMode = integerStack[integerStackCounter + 3];
                if (vMode < 0)
                    vMode = 0;
                else if (vMode > 5)
                    vMode = 5;
                rsInterface.horizontalRepositionMode = (byte) hMode;
                rsInterface.verticalRepositionMode = (byte) vMode;
                Class256.method3280(rsInterface, true);
                RsInterface.doAutoLayout(rsInterface);
                if (rsInterface.subId == -1)
                    Class101.method1746(rsInterface.idHash);
                return;
            }
            if (opcode == 1001) {
                integerStackCounter -= 4;
                rsInterface.width = integerStack[integerStackCounter];
                rsInterface.height = integerStack[integerStackCounter + 1];
                rsInterface.anInt1886 = 0;
                rsInterface.anInt1938 = 0;
                int hMode = integerStack[integerStackCounter + 2];
                if (hMode < 0)
                    hMode = 0;
                else if (hMode > 4)
                    hMode = 4;
                int vMode = integerStack[integerStackCounter + 3];
                if (vMode < 0)
                    vMode = 0;
                else if (vMode > 4)
                    vMode = 4;
                rsInterface.horizontalResizeMode = (byte) hMode;
                rsInterface.verticalResizeMode = (byte) vMode;
                Class256.method3280(rsInterface, true);
                RsInterface.doAutoLayout(rsInterface);
                if (rsInterface.type == 0)
                    RsInterface.autoLayoutChildren(false, rsInterface);
                return;
            }
            if (opcode == 1003) {
                boolean anLocalBoolean = integerStack[--integerStackCounter] == 1;
                if (rsInterface.aBoolean1854 != anLocalBoolean) {
                    rsInterface.aBoolean1854 = anLocalBoolean;
                    Class256.method3280(rsInterface, true);
                }
                if (rsInterface.subId == -1)
                    Class368_Sub1.method4027(rsInterface.idHash, 7);
                return;
            }
            if (opcode == 1004) {
                integerStackCounter -= 2;
                rsInterface.anInt1944 = integerStack[integerStackCounter];
                rsInterface.anInt1813 = integerStack[integerStackCounter + 1];
                Class256.method3280(rsInterface, true);
                RsInterface.doAutoLayout(rsInterface);
                if (rsInterface.type == 0)
                    RsInterface.autoLayoutChildren(false, rsInterface);
                return;
            }
            if (opcode == 1005) {
                rsInterface.aBoolean1942 = integerStack[--integerStackCounter] == 1;
                return;
            }
        } else if (opcode >= 1100 && opcode < 1200 || opcode >= 2100 && opcode < 2200) {
            RsInterface rsInterface;
            if (opcode >= 2000) {
                opcode -= 1000;
                rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
            } else
                rsInterface = isInstance ? instanceInterface : staticInterface;
            if (opcode == 1100) {
                integerStackCounter -= 2;
                rsInterface.anInt1950 = integerStack[integerStackCounter];
                if (rsInterface.anInt1950 > (rsInterface.anInt1829 - rsInterface.renderWidth))
                    rsInterface.anInt1950 = (rsInterface.anInt1829 - rsInterface.renderWidth);
                if (rsInterface.anInt1950 < 0)
                    rsInterface.anInt1950 = 0;
                rsInterface.anInt1838 = integerStack[integerStackCounter + 1];
                if (rsInterface.anInt1838 > (rsInterface.anInt1882 - rsInterface.renderHeight))
                    rsInterface.anInt1838 = (rsInterface.anInt1882 - rsInterface.renderHeight);
                if (rsInterface.anInt1838 < 0)
                    rsInterface.anInt1838 = 0;
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1)
                    Class245_Sub1_Sub1.method3179(12, rsInterface.idHash);
                return;
            }
            if (opcode == 1101) {
                rsInterface.colour = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1)
                    Class256_Sub3.method3288(rsInterface.idHash, 6);
                return;
            }
            if (opcode == 1102) {
                rsInterface.aBoolean1912 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1103) {
                rsInterface.anInt1967 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1104) {
                rsInterface.anInt1928 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1105) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (rsInterface.anInt1864 != anLocalInt) {
                    rsInterface.anInt1864 = anLocalInt;
                    Class256.method3280(rsInterface, true);
                }
                if (rsInterface.subId == -1)
                    Node_Sub31_Sub16.method928(rsInterface.idHash, 12691);
                return;
            }
            if (opcode == 1106) {
                rsInterface.anInt1849 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1107) {
                rsInterface.aBoolean1868 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1108) {
                rsInterface.anInt1822 = 1;
                rsInterface.anInt1929 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -122);
                return;
            }
            if (opcode == 1109) {
                integerStackCounter -= 6;
                rsInterface.anInt1937 = integerStack[integerStackCounter];
                rsInterface.anInt1811 = integerStack[integerStackCounter + 1];
                rsInterface.anInt1885 = integerStack[integerStackCounter + 2];
                rsInterface.anInt1884 = integerStack[integerStackCounter + 3];
                rsInterface.anInt1837 = integerStack[integerStackCounter + 4];
                rsInterface.anInt1906 = integerStack[integerStackCounter + 5];
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1) {
                    Node_Sub49.method1155((byte) 116, rsInterface.idHash);
                    Node_Sub6.method565(rsInterface.idHash, (byte) 27);
                }
                return;
            }
            if (opcode == 1110) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (rsInterface.anInt1812 != anLocalInt) {
                    rsInterface.anInt1812 = anLocalInt;
                    rsInterface.anInt1853 = 0;
                    rsInterface.anInt1898 = 1;
                    rsInterface.anInt1905 = 0;
                    Class367 class367 = (rsInterface.anInt1812 == -1 ? null : (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758(rsInterface.anInt1812, 0)));
                    if (class367 != null)
                        Node_Sub47_Sub11.method1138(0, (rsInterface.anInt1853), class367);
                    Class256.method3280(rsInterface, true);
                }
                if (rsInterface.subId == -1)
                    Class336.method3756(true, rsInterface.idHash);
                return;
            }
            if (opcode == 1111) {
                rsInterface.aBoolean1835 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1112) {
                String string = stringStack[--stringStackCounter];
                if (!string.equals(rsInterface.aString1921)) {
                    rsInterface.aString1921 = string;
                    Class256.method3280(rsInterface, true);
                }
                if (rsInterface.subId == -1)
                    Class305.method3595(3, rsInterface.idHash);
                return;
            }
            if (opcode == 1113) {
                rsInterface.anInt1887 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1)
                    Class351.method3875(rsInterface.idHash, (byte) 81);
                return;
            }
            if (opcode == 1114) {
                integerStackCounter -= 3;
                rsInterface.anInt1852 = integerStack[integerStackCounter];
                rsInterface.anInt1933 = integerStack[integerStackCounter + 1];
                rsInterface.anInt1903 = integerStack[integerStackCounter + 2];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1115) {
                rsInterface.aBoolean1844 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1116) {
                rsInterface.anInt1826 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1117) {
                rsInterface.anInt1823 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1118) {
                rsInterface.aBoolean1935 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1119) {
                rsInterface.aBoolean1930 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1120) {
                integerStackCounter -= 2;
                rsInterface.anInt1829 = integerStack[integerStackCounter];
                rsInterface.anInt1882 = integerStack[integerStackCounter + 1];
                Class256.method3280(rsInterface, true);
                if (rsInterface.type == 0)
                    RsInterface.autoLayoutChildren(false, rsInterface);
                return;
            }
            if (opcode == 1122) {
                rsInterface.aBoolean1962 = integerStack[--integerStackCounter] == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1123) {
                rsInterface.anInt1906 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                if (rsInterface.subId == -1)
                    Node_Sub49.method1155((byte) 121, rsInterface.idHash);
                return;
            }
            if (opcode == 1124) {
                int anLocalInt = integerStack[--integerStackCounter];
                rsInterface.aBoolean1871 = anLocalInt == 1;
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1125) {
                integerStackCounter -= 2;
                rsInterface.anInt1848 = integerStack[integerStackCounter];
                rsInterface.anInt1888 = integerStack[integerStackCounter + 1];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1126) {
                rsInterface.anInt1874 = integerStack[--integerStackCounter];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1127) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_14_ = integerStack[integerStackCounter + 1];
                Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt);
                if (anLocalInt_14_ != class315.anInt2607)
                    rsInterface.method3220(anLocalInt_14_, (byte) 36, anLocalInt);
                else {
                    rsInterface.method3212(false, anLocalInt);
                    return;
                }
                return;
            }
            if (opcode == 1128) {
                int anLocalInt = integerStack[--integerStackCounter];
                String string = stringStack[--stringStackCounter];
                Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt);
                if (!class315.aString2606.equals(string))
                    rsInterface.method3228(string, 87, anLocalInt);
                else {
                    rsInterface.method3212(false, anLocalInt);
                    return;
                }
                return;
            }
            if (opcode == 1129 || opcode == 1130) {
                int anLocalInt = integerStack[--integerStackCounter];
                if ((rsInterface.type == 5 || opcode != 1129) && (rsInterface.type == 4 || opcode != 1130)) {
                    if (rsInterface.anInt1833 != anLocalInt) {
                        rsInterface.anInt1833 = anLocalInt;
                        Class256.method3280(rsInterface, true);
                    }
                    if (rsInterface.subId == -1)
                        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub1.method1843((rsInterface.idHash), (byte) 80);
                    return;
                }
                return;
            }
            if (opcode == 1131) {
                integerStackCounter -= 3;
                int anLocalInt = integerStack[integerStackCounter];
                short anLocalInt_15_ = (short) integerStack[integerStackCounter + 1];
                short anLocalInt_16_ = (short) integerStack[integerStackCounter + 2];
                if (anLocalInt >= 0 && anLocalInt < 5) {
                    rsInterface.method3214(anLocalInt, anLocalInt_16_, (byte) -82, anLocalInt_15_);
                    Class256.method3280(rsInterface, true);
                    if (rsInterface.subId == -1)
                        Applet_Sub1.method101(rsInterface.idHash, (byte) 125, anLocalInt);
                    return;
                }
                return;
            }
            if (opcode == 1132) {
                integerStackCounter -= 3;
                int anLocalInt = integerStack[integerStackCounter];
                short anLocalInt_17_ = (short) integerStack[integerStackCounter + 1];
                short anLocalInt_18_ = (short) integerStack[integerStackCounter + 2];
                if (anLocalInt >= 0 && anLocalInt < 5) {
                    rsInterface.method3227(anLocalInt, anLocalInt_18_, false, anLocalInt_17_);
                    Class256.method3280(rsInterface, true);
                    if (rsInterface.subId == -1)
                        Statics.method3647(rsInterface.idHash, anLocalInt, (byte) 85);
                    return;
                }
                return;
            }
        } else if (opcode >= 1200 && opcode < 1300 || opcode >= 2200 && opcode < 2300) {
            RsInterface rsInterface;
            if (opcode >= 2000) {
                opcode -= 1000;
                rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
            } else
                rsInterface = isInstance ? instanceInterface : staticInterface;
            Class256.method3280(rsInterface, true);
            if (opcode == 1200 || opcode == 1205 || opcode == 1208 || opcode == 1209 || opcode == 1212 || opcode == 1213) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_19_ = integerStack[integerStackCounter + 1];
                if (rsInterface.subId == -1) {
                    Class_s_Sub1.method3546(rsInterface.idHash, (byte) -115);
                    Node_Sub49.method1155((byte) -102, rsInterface.idHash);
                    Node_Sub6.method565(rsInterface.idHash, (byte) 50);
                }
                if (anLocalInt == -1) {
                    rsInterface.anInt1822 = 1;
                    rsInterface.anInt1929 = -1;
                    rsInterface.anInt1870 = -1;
                } else {
                    rsInterface.anInt1870 = anLocalInt;
                    rsInterface.anInt1925 = anLocalInt_19_;
                    if (opcode == 1208 || opcode == 1209)
                        rsInterface.aBoolean1862 = true;
                    else
                        rsInterface.aBoolean1862 = false;
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(-123, anLocalInt);
                    rsInterface.anInt1885 = class371.anInt3153;
                    rsInterface.anInt1884 = class371.anInt3123;
                    rsInterface.anInt1837 = class371.anInt3132;
                    rsInterface.anInt1937 = class371.anInt3146;
                    rsInterface.anInt1811 = class371.anInt3172;
                    rsInterface.anInt1906 = class371.anInt3166;
                    if (opcode == 1205 || opcode == 1209)
                        rsInterface.anInt1857 = 0;
                    else if (opcode == 1212 || opcode == 1213)
                        rsInterface.anInt1857 = 1;
                    else
                        rsInterface.anInt1857 = 2;
                    if (rsInterface.anInt1886 > 0)
                        rsInterface.anInt1906 = (rsInterface.anInt1906 * 32 / rsInterface.anInt1886);
                    else {
                        if (rsInterface.width > 0)
                            rsInterface.anInt1906 = (rsInterface.anInt1906 * 32 / rsInterface.width);
                        return;
                    }
                    return;
                }
                return;
            }
            if (opcode == 1201) {
                rsInterface.anInt1822 = 2;
                rsInterface.anInt1929 = integerStack[--integerStackCounter];
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -124);
                return;
            }
            if (opcode == 1202) {
                rsInterface.anInt1822 = 3;
                rsInterface.anInt1929 = -1;
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -127);
                return;
            }
            if (opcode == 1203) {
                rsInterface.anInt1822 = 6;
                rsInterface.anInt1929 = integerStack[--integerStackCounter];
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -126);
                return;
            }
            if (opcode == 1204) {
                rsInterface.anInt1822 = 5;
                rsInterface.anInt1929 = integerStack[--integerStackCounter];
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -127);
                return;
            }
            if (opcode == 1206) {
                integerStackCounter -= 4;
                rsInterface.anInt1909 = integerStack[integerStackCounter];
                rsInterface.anInt1922 = integerStack[integerStackCounter + 1];
                rsInterface.anInt1866 = integerStack[integerStackCounter + 2];
                rsInterface.anInt1836 = integerStack[integerStackCounter + 3];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1207) {
                integerStackCounter -= 2;
                rsInterface.anInt1865 = integerStack[integerStackCounter];
                rsInterface.anInt1843 = integerStack[integerStackCounter + 1];
                Class256.method3280(rsInterface, true);
                return;
            }
            if (opcode == 1210) {
                integerStackCounter -= 4;
                rsInterface.anInt1929 = integerStack[integerStackCounter];
                rsInterface.anInt1861 = integerStack[integerStackCounter + 1];
                if (integerStack[integerStackCounter + 2] == 1)
                    rsInterface.anInt1822 = 9;
                else
                    rsInterface.anInt1822 = 8;
                if (integerStack[integerStackCounter + 3] == 1)
                    rsInterface.aBoolean1862 = true;
                else
                    rsInterface.aBoolean1862 = false;
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -127);
                return;
            }
            if (opcode == 1211) {
                rsInterface.anInt1822 = 5;
                rsInterface.anInt1929 = Class64.anInt451;
                rsInterface.anInt1861 = 0;
                if (rsInterface.subId == -1)
                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1302(rsInterface.idHash, -122);
                return;
            }
        } else if (opcode >= 1300 && opcode < 1400 || opcode >= 2300 && opcode < 2400) {
            RsInterface rsInterface;
            if (opcode >= 2000) {
                opcode -= 1000;
                rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
            } else
                rsInterface = isInstance ? instanceInterface : staticInterface;
            if (opcode == 1300) {
                int anLocalInt = integerStack[--integerStackCounter] - 1;
                if (anLocalInt < 0 || anLocalInt > 9)
                    stringStackCounter--;
                else {
                    rsInterface.method3219(stringStack[--stringStackCounter], (byte) -14, anLocalInt);
                    return;
                }
                return;
            }
            if (opcode == 1301) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_20_ = integerStack[integerStackCounter + 1];
                if (anLocalInt == -1 && anLocalInt_20_ == -1)
                    rsInterface.aRsInterface_1947 = null;
                else {
                    rsInterface.aRsInterface_1947 = RsInterface.getCreatedChild(anLocalInt, anLocalInt_20_);
                    return;
                }
                return;
            }
            if (opcode == 1302) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt == Class268.anInt2141 || anLocalInt == Class2_Sub11.anInt3826 || anLocalInt == DoublyLinkedNodeP2_Sub2_Sub1_Sub1.anInt6558) {
                    rsInterface.anInt1825 = anLocalInt;
                    return;
                }
                return;
            }
            if (opcode == 1303) {
                rsInterface.anInt1901 = integerStack[--integerStackCounter];
                return;
            }
            if (opcode == 1304) {
                rsInterface.anInt1961 = integerStack[--integerStackCounter];
                return;
            }
            if (opcode == 1305) {
                rsInterface.aString1968 = stringStack[--stringStackCounter];
                return;
            }
            if (opcode == 1306) {
                rsInterface.aString1895 = stringStack[--stringStackCounter];
                return;
            }
            if (opcode == 1307) {
                rsInterface.aStringArray1845 = null;
                return;
            }
            if (opcode == 1308) {
                rsInterface.anInt1897 = integerStack[--integerStackCounter];
                rsInterface.anInt1889 = integerStack[--integerStackCounter];
                return;
            }
            if (opcode == 1309) {
                int anLocalInt = integerStack[--integerStackCounter];
                int anLocalInt_21_ = integerStack[--integerStackCounter];
                if (anLocalInt_21_ >= 1 && anLocalInt_21_ <= 10)
                    rsInterface.method3224(anLocalInt, anLocalInt_21_ - 1, 5964);
                return;
            }
            if (opcode == 1310) {
                rsInterface.aString1890 = stringStack[--stringStackCounter];
                return;
            }
            if (opcode == 1311) {
                rsInterface.anInt1948 = integerStack[--integerStackCounter];
                return;
            }
            if (opcode == 1312 || opcode == 1313) {
                int anLocalInt;
                int anLocalInt_22_;
                int anLocalInt_23_;
                if (opcode == 1312) {
                    integerStackCounter -= 3;
                    anLocalInt = integerStack[integerStackCounter] - 1;
                    anLocalInt_22_ = integerStack[integerStackCounter + 1];
                    anLocalInt_23_ = integerStack[integerStackCounter + 2];
                    if (anLocalInt < 0 || anLocalInt > 9)
                        throw new RuntimeException("IOR13121313");
                } else {
                    integerStackCounter -= 2;
                    anLocalInt = 10;
                    anLocalInt_22_ = integerStack[integerStackCounter];
                    anLocalInt_23_ = integerStack[integerStackCounter + 1];
                }
                if (rsInterface.aByteArray1827 == null) {
                    if (anLocalInt_22_ != 0) {
                        rsInterface.aByteArray1827 = new byte[11];
                        rsInterface.aByteArray1966 = new byte[11];
                        rsInterface.anIntArray1964 = new int[11];
                    } else
                        return;
                }
                rsInterface.aByteArray1827[anLocalInt] = (byte) anLocalInt_22_;
                if (anLocalInt_22_ != 0)
                    rsInterface.aBoolean1923 = true;
                else {
                    rsInterface.aBoolean1923 = false;
                    for (int anLocalInt_24_ = 0; (anLocalInt_24_ < rsInterface.aByteArray1827.length); anLocalInt_24_++) {
                        if ((rsInterface.aByteArray1827[anLocalInt_24_]) != 0) {
                            rsInterface.aBoolean1923 = true;
                            break;
                        }
                    }
                }
                rsInterface.aByteArray1966[anLocalInt] = (byte) anLocalInt_23_;
                return;
            }
            if (opcode == 1314) {
                rsInterface.anInt1927 = integerStack[--integerStackCounter];
                return;
            }
        } else {
            if (opcode >= 1400 && opcode < 1500 || opcode >= 2400 && opcode < 2500) {
                RsInterface rsInterface;
                if (opcode >= 2000) {
                    opcode -= 1000;
                    rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                } else
                    rsInterface = isInstance ? instanceInterface : staticInterface;
                if (opcode == 1499)
                    rsInterface.method3223(-121);
                else {
                    String string = stringStack[--stringStackCounter];
                    int[] anLocalInts = null;
                    if (string.length() > 0 && string.charAt(string.length() - 1) == 'Y') {
                        int anLocalInt = integerStack[--integerStackCounter];
                        if (anLocalInt > 0) {
                            anLocalInts = new int[anLocalInt];
                            while (anLocalInt-- > 0)
                                anLocalInts[anLocalInt] = integerStack[--integerStackCounter];
                        }
                        string = string.substring(0, string.length() - 1);
                    }
                    Object[] objects = new Object[string.length() + 1];
                    for (int anLocalInt = objects.length - 1; anLocalInt >= 1; anLocalInt--) {
                        if (string.charAt(anLocalInt - 1) == 's')
                            objects[anLocalInt] = stringStack[--stringStackCounter];
                        else if (string.charAt(anLocalInt - 1) == '\u00a7')
                            objects[anLocalInt] = new Long(longStack[--longStackCounter]);
                        else
                            objects[anLocalInt] = new Integer(integerStack[--integerStackCounter]);
                    }
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (anLocalInt != -1)
                        objects[0] = new Integer(anLocalInt);
                    else
                        objects = null;
                    if (opcode == 1400)
                        rsInterface.anObjectArray1926 = objects;
                    else if (opcode == 1401)
                        rsInterface.anObjectArray1880 = objects;
                    else if (opcode == 1402)
                        rsInterface.anObjectArray1894 = objects;
                    else if (opcode == 1403)
                        rsInterface.anObjectArray1832 = objects;
                    else if (opcode == 1404)
                        rsInterface.anObjectArray1872 = objects;
                    else if (opcode == 1405)
                        rsInterface.anObjectArray1879 = objects;
                    else if (opcode == 1406)
                        rsInterface.anObjectArray1828 = objects;
                    else if (opcode == 1407) {
                        rsInterface.anObjectArray1907 = objects;
                        rsInterface.anIntArray1847 = anLocalInts;
                    } else if (opcode == 1408)
                        rsInterface.anObjectArray1941 = objects;
                    else if (opcode == 1409)
                        rsInterface.anObjectArray1841 = objects;
                    else if (opcode == 1410)
                        rsInterface.anObjectArray1839 = objects;
                    else if (opcode == 1411)
                        rsInterface.anObjectArray1945 = objects;
                    else if (opcode == 1412)
                        rsInterface.anObjectArray1878 = objects;
                    else if (opcode == 1414) {
                        rsInterface.anObjectArray1936 = objects;
                        rsInterface.anIntArray1819 = anLocalInts;
                    } else if (opcode == 1415) {
                        rsInterface.anObjectArray1914 = objects;
                        rsInterface.anIntArray1904 = anLocalInts;
                    } else if (opcode == 1416)
                        rsInterface.anObjectArray1815 = objects;
                    else if (opcode == 1417)
                        rsInterface.anObjectArray1955 = objects;
                    else if (opcode == 1418)
                        rsInterface.anObjectArray1892 = objects;
                    else if (opcode == 1419)
                        rsInterface.anObjectArray1959 = objects;
                    else if (opcode == 1420)
                        rsInterface.anObjectArray1957 = objects;
                    else if (opcode == 1421)
                        rsInterface.anObjectArray1920 = objects;
                    else if (opcode == 1422)
                        rsInterface.anObjectArray1952 = objects;
                    else if (opcode == 1423)
                        rsInterface.anObjectArray1956 = objects;
                    else if (opcode == 1424)
                        rsInterface.anObjectArray1824 = objects;
                    else if (opcode == 1425)
                        rsInterface.anObjectArray1855 = objects;
                    else if (opcode == 1426)
                        rsInterface.anObjectArray1919 = objects;
                    else if (opcode == 1427)
                        rsInterface.resizeTrigger = objects;
                    else if (opcode == 1428) {
                        rsInterface.anObjectArray1856 = objects;
                        rsInterface.anIntArray1851 = anLocalInts;
                    } else if (opcode == 1429) {
                        rsInterface.anObjectArray1951 = objects;
                        rsInterface.anIntArray1867 = anLocalInts;
                    } else if (opcode == 1430)
                        rsInterface.anObjectArray1831 = objects;
                    else if (opcode == 1431)
                        rsInterface.anObjectArray1913 = objects;
                    else if (opcode == 1432)
                        rsInterface.anObjectArray1893 = objects;
                    rsInterface.aBoolean1908 = true;
                    return;
                }
                return;
            }
            if (opcode < 1600) {
                RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                if (opcode == 1500) {
                    integerStack[integerStackCounter++] = rsInterface.renderX;
                    return;
                }
                if (opcode == 1501) {
                    integerStack[integerStackCounter++] = rsInterface.renderY;
                    return;
                }
                if (opcode == 1502) {
                    integerStack[integerStackCounter++] = rsInterface.renderWidth;
                    return;
                }
                if (opcode == 1503) {
                    integerStack[integerStackCounter++] = rsInterface.renderHeight;
                    return;
                }
                if (opcode == 1504) {
                    integerStack[integerStackCounter++] = rsInterface.aBoolean1854 ? 1 : 0;
                    return;
                }
                if (opcode == 1505) {
                    integerStack[integerStackCounter++] = rsInterface.parentId;
                    return;
                }
                if (opcode == 1506) {
                    RsInterface rsInterface_25_ = RsInterface.getParent(1, rsInterface);
                    integerStack[integerStackCounter++] = (rsInterface_25_ == null ? -1 : rsInterface_25_.idHash);
                    return;
                }
            } else if (opcode < 1700) {
                RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                if (opcode == 1600) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1950;
                    return;
                }
                if (opcode == 1601) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1838;
                    return;
                }
                if (opcode == 1602) {
                    stringStack[stringStackCounter++] = rsInterface.aString1921;
                    return;
                }
                if (opcode == 1603) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1829;
                    return;
                }
                if (opcode == 1604) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1882;
                    return;
                }
                if (opcode == 1605) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1906;
                    return;
                }
                if (opcode == 1606) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1885;
                    return;
                }
                if (opcode == 1607) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1837;
                    return;
                }
                if (opcode == 1608) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1884;
                    return;
                }
                if (opcode == 1609) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1967;
                    return;
                }
                if (opcode == 1610) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1937;
                    return;
                }
                if (opcode == 1611) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1811;
                    return;
                }
                if (opcode == 1612) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1864;
                    return;
                }
                if (opcode == 1613) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = rsInterface.method3216(anLocalInt, (class315.aString2606), -96);
                    else {
                        integerStack[integerStackCounter++] = rsInterface.method3211((class315.anInt2607), anLocalInt, (byte) 82);
                        return;
                    }
                    return;
                }
                if (opcode == 1614) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1849;
                    return;
                }
                if (opcode == 2614) {
                    integerStack[integerStackCounter++] = (rsInterface.anInt1822 == 1 ? rsInterface.anInt1929 : -1);
                    return;
                }
            } else if (opcode < 1800) {
                RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                if (opcode == 1700) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1870;
                    return;
                }
                if (opcode == 1701) {
                    if (rsInterface.anInt1870 != -1)
                        integerStack[integerStackCounter++] = rsInterface.anInt1925;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 1702) {
                    integerStack[integerStackCounter++] = rsInterface.subId;
                    return;
                }
            } else if (opcode < 1900) {
                RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                if (opcode == 1800) {
                    integerStack[integerStackCounter++] = client.method122(rsInterface).method709(0);
                    return;
                }
                if (opcode == 1801) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    anLocalInt--;
                    if (rsInterface.aStringArray1845 == null || (anLocalInt >= rsInterface.aStringArray1845.length) || (rsInterface.aStringArray1845[anLocalInt] == null))
                        stringStack[stringStackCounter++] = "";
                    else {
                        stringStack[stringStackCounter++] = (rsInterface.aStringArray1845[anLocalInt]);
                        return;
                    }
                    return;
                }
                if (opcode == 1802) {
                    if (rsInterface.aString1968 == null)
                        stringStack[stringStackCounter++] = "";
                    else {
                        stringStack[stringStackCounter++] = rsInterface.aString1968;
                        return;
                    }
                    return;
                }
            } else if (opcode < 2000 || opcode >= 2900 && opcode < 3000) {
                RsInterface rsInterface;
                if (opcode >= 2000) {
                    rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                    opcode -= 1000;
                } else
                    rsInterface = isInstance ? instanceInterface : staticInterface;
                if (anInt2661 >= 10)
                    throw new RuntimeException("C29xx-1");
                if (opcode == 1927) {
                    if (rsInterface.resizeTrigger != null) {
                        Cs2Trigger class59_sub27 = new Cs2Trigger();
                        class59_sub27.aRsInterface_4115 = rsInterface;
                        class59_sub27.parameters = rsInterface.resizeTrigger;
                        class59_sub27.anInt4112 = anInt2661 + 1;
                        DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
                        return;
                    }
                    return;
                }
            } else if (opcode < 2600) {
                RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                if (opcode == 2500) {
                    integerStack[integerStackCounter++] = rsInterface.renderX;
                    return;
                }
                if (opcode == 2501) {
                    integerStack[integerStackCounter++] = rsInterface.renderY;
                    return;
                }
                if (opcode == 2502) {
                    integerStack[integerStackCounter++] = rsInterface.renderWidth;
                    return;
                }
                if (opcode == 2503) {
                    integerStack[integerStackCounter++] = rsInterface.renderHeight;
                    return;
                }
                if (opcode == 2504) {
                    integerStack[integerStackCounter++] = rsInterface.aBoolean1854 ? 1 : 0;
                    return;
                }
                if (opcode == 2505) {
                    integerStack[integerStackCounter++] = rsInterface.parentId;
                    return;
                }
                if (opcode == 1506) {
                    RsInterface rsInterface_26_ = RsInterface.getParent(1, rsInterface);
                    integerStack[integerStackCounter++] = (rsInterface_26_ == null ? -1 : rsInterface_26_.idHash);
                    return;
                }
            } else if (opcode < 2700) {
                RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                if (opcode == 2600) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1950;
                    return;
                }
                if (opcode == 2601) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1838;
                    return;
                }
                if (opcode == 2602) {
                    stringStack[stringStackCounter++] = rsInterface.aString1921;
                    return;
                }
                if (opcode == 2603) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1829;
                    return;
                }
                if (opcode == 2604) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1882;
                    return;
                }
                if (opcode == 2605) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1906;
                    return;
                }
                if (opcode == 2606) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1885;
                    return;
                }
                if (opcode == 2607) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1837;
                    return;
                }
                if (opcode == 2608) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1884;
                    return;
                }
                if (opcode == 2609) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1967;
                    return;
                }
                if (opcode == 2610) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1937;
                    return;
                }
                if (opcode == 2611) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1811;
                    return;
                }
                if (opcode == 2612) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1864;
                    return;
                }
                if (opcode == 2613) {
                    integerStack[integerStackCounter++] = rsInterface.anInt1849;
                    return;
                }
                if (opcode == 2614) {
                    integerStack[integerStackCounter++] = (rsInterface.anInt1822 == 1 ? rsInterface.anInt1929 : -1);
                    return;
                }
            } else if (opcode < 2800) {
                if (opcode == 2700) {
                    RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                    integerStack[integerStackCounter++] = rsInterface.anInt1870;
                    return;
                }
                if (opcode == 2701) {
                    RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                    if (rsInterface.anInt1870 != -1)
                        integerStack[integerStackCounter++] = rsInterface.anInt1925;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 2702) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
                    if (class59_sub49 != null)
                        integerStack[integerStackCounter++] = 1;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 2703) {
                    RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                    if (rsInterface.children == null)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        int anLocalInt = rsInterface.children.length;
                        for (int anLocalInt_27_ = 0; anLocalInt_27_ < (rsInterface.children).length; anLocalInt_27_++) {
                            if ((rsInterface.children[anLocalInt_27_]) == null) {
                                anLocalInt = anLocalInt_27_;
                                break;
                            }
                        }
                        integerStack[integerStackCounter++] = anLocalInt;
                        return;
                    }
                    return;
                }
                if (opcode == 2704 || opcode == 2705) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_28_ = integerStack[integerStackCounter + 1];
                    Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
                    if (class59_sub49 != null && (class59_sub49.anInt4291 == anLocalInt_28_))
                        integerStack[integerStackCounter++] = 1;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
            } else if (opcode < 2900) {
                RsInterface rsInterface = RsInterface.getByHash(integerStack[--integerStackCounter]);
                if (opcode == 2800) {
                    integerStack[integerStackCounter++] = client.method122(rsInterface).method709(0);
                    return;
                }
                if (opcode == 2801) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    anLocalInt--;
                    if (rsInterface.aStringArray1845 == null || (anLocalInt >= rsInterface.aStringArray1845.length) || (rsInterface.aStringArray1845[anLocalInt] == null))
                        stringStack[stringStackCounter++] = "";
                    else {
                        stringStack[stringStackCounter++] = (rsInterface.aStringArray1845[anLocalInt]);
                        return;
                    }
                    return;
                }
                if (opcode == 2802) {
                    if (rsInterface.aString1968 == null)
                        stringStack[stringStackCounter++] = "";
                    else {
                        stringStack[stringStackCounter++] = rsInterface.aString1968;
                        return;
                    }
                    return;
                }
            } else if (opcode < 3200) {
                if (opcode == 3100) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub31_Sub29.method966((byte) 51, string);
                    return;
                }
                if (opcode == 3101) {
                    integerStackCounter -= 2;
                    Node_Sub49.method1147(Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587, integerStack[integerStackCounter], integerStack[integerStackCounter + 1], -1);
                    return;
                }
                if (opcode == 3103) {
                    Statics.method1510(true, (byte) 81);
                    return;
                }
                if (opcode == 3104) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = 0;
                    if (Class230.method3073(string, 0))
                        anLocalInt = JagexStringUtils.parseInt(string);
                    anInt2649++;
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 106, (Node_Sub31_Sub16.aClass372_5910), (DoublyLinkedNodeP2_Sub4_Sub1.aClass207_6429));
                    class59_sub29.aClass59_Sub28_Sub1_4129.p4(anLocalInt);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                if (opcode == 3105) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 104, (Node_Sub31_Sub16.aClass372_5910), Class169.aClass207_1233);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p1(string.length() + 1);
                    class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                if (opcode == 3106) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 43, (Node_Sub31_Sub16.aClass372_5910), Class1_Sub1.aClass207_5598);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p1(string.length() + 1);
                    class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                if (opcode == 3107) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    String string = stringStack[--stringStackCounter];
                    DoublyLinkedNodeP2_Sub2_Sub1_Sub2.method1788(anLocalInt, 89, string);
                    return;
                }
                if (opcode == 3108) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_29_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_30_ = integerStack[integerStackCounter + 2];
                    RsInterface rsInterface = RsInterface.getByHash(anLocalInt_30_);
                    Statics.method411(anLocalInt_29_, anLocalInt, rsInterface, 119);
                    return;
                }
                if (opcode == 3109) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_31_ = integerStack[integerStackCounter + 1];
                    RsInterface rsInterface = isInstance ? instanceInterface : staticInterface;
                    Statics.method411(anLocalInt_31_, anLocalInt, rsInterface, 124);
                    return;
                }
                if (opcode == 3110) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 95, (Node_Sub31_Sub16.aClass372_5910), Class261.aClass207_2039);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p2(anLocalInt);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                if (opcode == 3111) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_32_ = integerStack[integerStackCounter + 1];
                    Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
                    if (class59_sub49 != null)
                        Class222_Sub2.method3037(true, (class59_sub49.anInt4291 != anLocalInt_32_), class59_sub49, -86709072);
                    Statics.method2567(anLocalInt_32_, anLocalInt, true, (byte) 19, 3);
                    return;
                }
                if (opcode == 3112) {
                    integerStackCounter--;
                    int anLocalInt = integerStack[integerStackCounter];
                    Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.get((long) anLocalInt));
                    if (class59_sub49 != null && class59_sub49.anInt4289 == 3)
                        Class222_Sub2.method3037(true, true, class59_sub49, -86709072);
                    return;
                }
                if (opcode == 3113) {
                    Class126.method2409(stringStack[--stringStackCounter], 24);
                    return;
                }
                if (opcode == 3114) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_33_ = integerStack[integerStackCounter + 1];
                    String string = stringStack[--stringStackCounter];
                    Class62_Sub12.method1403(anLocalInt, "", "", string, anLocalInt_33_, "", 16773);
                    return;
                }
                if (opcode == 3115) {
                    integerStackCounter -= 11;
                    Class349[] class349s = JagexHashMap.method1522();
                    Class44[] class44s = Class225.method3051(-1);
                    Statics.method289(integerStack[integerStackCounter + 10], integerStack[integerStackCounter + 5], integerStack[integerStackCounter + 3], integerStack[integerStackCounter + 6], integerStack[integerStackCounter + 8], integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 9], integerStack[integerStackCounter + 4], integerStack[integerStackCounter + 7], class44s[integerStack[integerStackCounter + 1]], class349s[integerStack[integerStackCounter]], false);
                    return;
                }
                if (opcode == 3116) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    anInt2649++;
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 102, (Node_Sub31_Sub16.aClass372_5910), Class321.aClass207_2636);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p2(anLocalInt);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                if (opcode == 3117) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 89, (Node_Sub31_Sub16.aClass372_5910), Class332.aClass207_2717);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p1(string.length() + 1);
                    class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
            } else if (opcode < 3300) {
                if (opcode == 3200) {
                    integerStackCounter -= 3;
                    Class165.method2629(255, integerStack[integerStackCounter], integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], 256, 2760);
                    return;
                }
                if (opcode == 3201) {
                    Node_Sub31_Sub8.method898(-93, 255, 50, integerStack[--integerStackCounter]);
                    return;
                }
                if (opcode == 3202) {
                    integerStackCounter -= 2;
                    DoublyLinkedNodeP2_Sub10.method1945(integerStack[integerStackCounter], 255, (byte) -124, integerStack[integerStackCounter + 1]);
                    return;
                }
                if (opcode == 3203) {
                    integerStackCounter -= 4;
                    Class165.method2629(integerStack[integerStackCounter + 3], integerStack[integerStackCounter], integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], 256, 2760);
                    return;
                }
                if (opcode == 3204) {
                    integerStackCounter -= 3;
                    Node_Sub31_Sub8.method898(99, integerStack[integerStackCounter + 1], integerStack[integerStackCounter + 2], integerStack[integerStackCounter]);
                    return;
                }
                if (opcode == 3205) {
                    integerStackCounter -= 3;
                    DoublyLinkedNodeP2_Sub10.method1945(integerStack[integerStackCounter], integerStack[integerStackCounter + 2], (byte) -126, integerStack[integerStackCounter + 1]);
                    return;
                }
                if (opcode == 3206) {
                    integerStackCounter -= 4;
                    Statics.method2520(false, integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], -107, integerStack[integerStackCounter], integerStack[integerStackCounter + 3], 256);
                    return;
                }
                if (opcode == 3207) {
                    integerStackCounter -= 4;
                    Statics.method2520(true, integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], 99, integerStack[integerStackCounter], integerStack[integerStackCounter + 3], 256);
                    return;
                }
                if (opcode == 3208) {
                    integerStackCounter -= 5;
                    Class165.method2629(integerStack[integerStackCounter + 3], integerStack[integerStackCounter], integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], integerStack[integerStackCounter + 4], 2760);
                    return;
                }
                if (opcode == 3209) {
                    integerStackCounter -= 5;
                    Statics.method2520(false, integerStack[integerStackCounter + 2], integerStack[integerStackCounter + 1], -37, integerStack[integerStackCounter], integerStack[integerStackCounter + 3], integerStack[integerStackCounter + 4]);
                    return;
                }
            } else if (opcode < 3400) {
                if (opcode == 3300) {
                    integerStack[integerStackCounter++] = Class333.anInt2720;
                    return;
                }
                if (opcode == 3301) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_34_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Statics.method2973(false, anLocalInt_34_, 13490, anLocalInt);
                    return;
                }
                if (opcode == 3302) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_35_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class315.method3630(anLocalInt_35_, false, 0, anLocalInt);
                    return;
                }
                if (opcode == 3303) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_36_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class62_Sub20.method1434(anLocalInt_36_, anLocalInt, -99, false);
                    return;
                }
                if (opcode == 3304) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = DoublyLinkedNode_Sub51_Sub2.aClass140_6228.method2472((byte) 102, anLocalInt).anInt6241;
                    return;
                }
                if (opcode == 3305) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Class_aa_Sub3.anIntArray3756[anLocalInt];
                    return;
                }
                if (opcode == 3306) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Class156.anIntArray3686[anLocalInt];
                    return;
                }
                if (opcode == 3307) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Node_Sub31_Sub37.anIntArray6034[anLocalInt];
                    return;
                }
                if (opcode == 3308) {
                    int anLocalInt = (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.lightingHL);
                    int anLocalInt_37_ = (((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.worldX) >> 9) + MapRelated.baseX);
                    int anLocalInt_38_ = (((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.worldZ) >> 9) + MapRelated.baseZ);
                    integerStack[integerStackCounter++] = ((anLocalInt << 28) + (anLocalInt_37_ << 14) + anLocalInt_38_);
                    return;
                }
                if (opcode == 3309) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = anLocalInt >> 14 & 0x3fff;
                    return;
                }
                if (opcode == 3310) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = anLocalInt >> 28;
                    return;
                }
                if (opcode == 3311) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = anLocalInt & 0x3fff;
                    return;
                }
                if (opcode == 3312) {
                    integerStack[integerStackCounter++] = Statics.aBoolean5559 ? 1 : 0;
                    return;
                }
                if (opcode == 3313) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_39_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Statics.method2973(true, anLocalInt_39_, 13490, anLocalInt);
                    return;
                }
                if (opcode == 3314) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_40_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class315.method3630(anLocalInt_40_, true, 0, anLocalInt);
                    return;
                }
                if (opcode == 3315) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_41_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class62_Sub20.method1434(anLocalInt_41_, anLocalInt, -66, true);
                    return;
                }
                if (opcode == 3316) {
                    if (Class15.anInt120 >= 2)
                        integerStack[integerStackCounter++] = Class15.anInt120;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3317) {
                    integerStack[integerStackCounter++] = DoublyLinkedNode_Sub51_Sub14.anInt6305;
                    return;
                }
                if (opcode == 3318) {
                    integerStack[integerStackCounter++] = (Statics.aGameServer_6149.id);
                    return;
                }
                if (opcode == 3321) {
                    integerStack[integerStackCounter++] = Class58.anInt422;
                    return;
                }
                if (opcode == 3322) {
                    integerStack[integerStackCounter++] = Cs2CallStackEntry.anInt510;
                    return;
                }
                if (opcode == 3323) {
                    if (Class128.anInt1044 >= 5 && Class128.anInt1044 <= 9)
                        integerStack[integerStackCounter++] = 1;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3324) {
                    if (Class128.anInt1044 >= 5 && Class128.anInt1044 <= 9)
                        integerStack[integerStackCounter++] = Class128.anInt1044;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3325) {
                    integerStack[integerStackCounter++] = Node_Sub31_Sub10.aBoolean5880 ? 1 : 0;
                    return;
                }
                if (opcode == 3326) {
                    integerStack[integerStackCounter++] = (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.anInt6855);
                    return;
                }
                if (opcode == 3327) {
                    integerStack[integerStackCounter++] = ((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854) != null && Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.aBoolean137) ? 1 : 0;
                    return;
                }
                if (opcode == 3329) {
                    integerStack[integerStackCounter++] = Class128.aBoolean1042 ? 1 : 0;
                    return;
                }
                if (opcode == 3330) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = BufferedFile.method3765(125, anLocalInt, false);
                    return;
                }
                if (opcode == 3331) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_42_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class62_Sub21.method1443(anLocalInt_42_, anLocalInt, false, false, 0);
                    return;
                }
                if (opcode == 3332) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_43_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = Class62_Sub21.method1443(anLocalInt_43_, anLocalInt, false, true, 0);
                    return;
                }
                if (opcode == 3333) {
                    integerStack[integerStackCounter++] = Class37.method387((byte) 122);
                    return;
                }
                if (opcode == 3335) {
                    integerStack[integerStackCounter++] = client.language;
                    return;
                }
                if (opcode == 3336) {
                    integerStackCounter -= 4;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_44_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_45_ = integerStack[integerStackCounter + 2];
                    int anLocalInt_46_ = integerStack[integerStackCounter + 3];
                    anLocalInt += anLocalInt_44_ << 14;
                    anLocalInt += anLocalInt_45_ << 28;
                    anLocalInt += anLocalInt_46_;
                    integerStack[integerStackCounter++] = anLocalInt;
                    return;
                }
                if (opcode == 3337) {
                    integerStack[integerStackCounter++] = client.affiliateId;
                    return;
                }
                if (opcode == 3338) {
                    integerStack[integerStackCounter++] = Class26.method352(true);
                    return;
                }
                if (opcode == 3339) {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                if (opcode == 3340) {
                    integerStack[integerStackCounter++] = Node_Sub31_Sub31.aBoolean5990 ? 1 : 0;
                    return;
                }
                if (opcode == 3341) {
                    integerStack[integerStackCounter++] = client.fromBilling ? 1 : 0;
                    return;
                }
                if (opcode == 3342) {
                    integerStack[integerStackCounter++] = client.mouseHandler.getX();
                    return;
                }
                if (opcode == 3343) {
                    integerStack[integerStackCounter++] = client.mouseHandler.getY();
                    return;
                }
                if (opcode == 3344) {
                    stringStack[stringStackCounter++] = ClanChannel.method1327(-595);
                    return;
                }
                if (opcode == 3345) {
                    stringStack[stringStackCounter++] = Statics.method2741(-24940);
                    return;
                }
                if (opcode == 3346) {
                    integerStack[integerStackCounter++] = Class325.method3682(-123);
                    return;
                }
                if (opcode == 3347) {
                    integerStack[integerStackCounter++] = Node_Sub31_Sub6.anInt5863;
                    return;
                }
                if (opcode == 3349) {
                    integerStack[integerStackCounter++] = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass271_6780.method3372(2) >> 3;
                    return;
                }
            } else if (opcode < 3500) {
                if (opcode == 3400) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_47_ = integerStack[integerStackCounter + 1];
                    Class323 class323 = Class62_Sub14.aClass220_4409.method3028((byte) 120, anLocalInt);
                    stringStack[stringStackCounter++] = class323.method3674(25851, anLocalInt_47_);
                    return;
                }
                if (opcode == 3408) {
                    integerStackCounter -= 4;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_48_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_49_ = integerStack[integerStackCounter + 2];
                    int anLocalInt_50_ = integerStack[integerStackCounter + 3];
                    Class323 class323 = Class62_Sub14.aClass220_4409.method3028((byte) -31, anLocalInt_49_);
                    if (class323.aChar2663 != anLocalInt || class323.aChar2662 != anLocalInt_48_)
                        throw new RuntimeException("C3408-1 " + anLocalInt_49_ + "-" + anLocalInt_50_);
                    if (anLocalInt_48_ == 115)
                        stringStack[stringStackCounter++] = class323.method3674(25851, anLocalInt_50_);
                    else {
                        integerStack[integerStackCounter++] = class323.method3669(anLocalInt_50_, (byte) 124);
                        return;
                    }
                    return;
                }
                if (opcode == 3409) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_51_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_52_ = integerStack[integerStackCounter + 2];
                    if (anLocalInt_51_ == -1)
                        throw new RuntimeException("C3409-2");
                    Class323 class323 = Class62_Sub14.aClass220_4409.method3028((byte) -8, anLocalInt_51_);
                    if (class323.aChar2662 != anLocalInt)
                        throw new RuntimeException("C3409-1");
                    integerStack[integerStackCounter++] = class323.method3675(anLocalInt_52_, -4) ? 1 : 0;
                    return;
                }
                if (opcode == 3410) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    String string = stringStack[--stringStackCounter];
                    if (anLocalInt == -1)
                        throw new RuntimeException("C3410-2");
                    Class323 class323 = Class62_Sub14.aClass220_4409.method3028((byte) -38, anLocalInt);
                    if (class323.aChar2662 != 's')
                        throw new RuntimeException("C3410-1");
                    integerStack[integerStackCounter++] = class323.method3677(string, 121) ? 1 : 0;
                    return;
                }
                if (opcode == 3411) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class323 class323 = Class62_Sub14.aClass220_4409.method3028((byte) 116, anLocalInt);
                    integerStack[integerStackCounter++] = class323.aJagexHashMap_2666.count();
                    return;
                }
            } else if (opcode < 3700) {
                if (opcode == 3600) {
                    if (Class6.anInt72 == 0)
                        integerStack[integerStackCounter++] = -2;
                    else {
                        if (Class6.anInt72 == 1)
                            integerStack[integerStackCounter++] = -1;
                        else {
                            integerStack[integerStackCounter++] = Class257.anInt2013;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (opcode == 3601) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 == 2 && anLocalInt < Class257.anInt2013) {
                        stringStack[stringStackCounter++] = Class260.aStringArray2031[anLocalInt];
                        if (Statics.aStringArray4827[anLocalInt] != null)
                            stringStack[stringStackCounter++] = Statics.aStringArray4827[anLocalInt];
                        else
                            stringStack[stringStackCounter++] = "";
                    } else {
                        stringStack[stringStackCounter++] = "";
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3602) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 == 2 && anLocalInt < Class257.anInt2013)
                        integerStack[integerStackCounter++] = GraphicsToolkit.anIntArray941[anLocalInt];
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3603) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 == 2 && anLocalInt < Class257.anInt2013)
                        integerStack[integerStackCounter++] = dba_sub_772_Sub2.anIntArray6370[anLocalInt];
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3604) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    DoublyLinkedNodeP2_Sub4.method1900(anLocalInt, 1706, string);
                    return;
                }
                if (opcode == 3605) {
                    String string = stringStack[--stringStackCounter];
                    Class182.method2846(122, string);
                    return;
                }
                if (opcode == 3606) {
                    String string = stringStack[--stringStackCounter];
                    Class20.method313(string, -1);
                    return;
                }
                if (opcode == 3607) {
                    String string = stringStack[--stringStackCounter];
                    Class177.method2793(string, false, (byte) 112);
                    return;
                }
                if (opcode == 3608) {
                    String string = stringStack[--stringStackCounter];
                    Class189_Sub1.method2876(0, string);
                    return;
                }
                if (opcode == 3609) {
                    String string = stringStack[--stringStackCounter];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    integerStack[integerStackCounter++] = Statics.method355(string, (byte) -96) ? 1 : 0;
                    return;
                }
                if (opcode == 3610) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 == 2 && anLocalInt < Class257.anInt2013)
                        stringStack[stringStackCounter++] = DoublyLinkedNodeP2_Sub10.aStringArray4601[anLocalInt];
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3611) {
                    if (Statics.aString2287 != null)
                        stringStack[stringStackCounter++] = Statics.method529((byte) 63, Statics.aString2287);
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3612) {
                    if (Statics.aString2287 != null)
                        integerStack[integerStackCounter++] = Statics.anInt2724;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3613) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Statics.aString2287 != null && anLocalInt < Statics.anInt2724)
                        stringStack[stringStackCounter++] = Node_Sub13.aClass176Array3956[anLocalInt].aString1304;
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3614) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Statics.aString2287 != null && anLocalInt < Statics.anInt2724)
                        integerStack[integerStackCounter++] = Node_Sub13.aClass176Array3956[anLocalInt].anInt1307;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3615) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Statics.aString2287 != null && anLocalInt < Statics.anInt2724)
                        integerStack[integerStackCounter++] = Node_Sub13.aClass176Array3956[anLocalInt].aByte1309;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3616) {
                    integerStack[integerStackCounter++] = Statics.aByte853;
                    return;
                }
                if (opcode == 3617) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub31_Sub4.method890(string, (byte) 112);
                    return;
                }
                if (opcode == 3618) {
                    integerStack[integerStackCounter++] = Class72.aByte496;
                    return;
                }
                if (opcode == 3619) {
                    String string = stringStack[--stringStackCounter];
                    Node_Sub31_Sub11.method905(string, -108);
                    return;
                }
                if (opcode == 3620) {
                    Class350.method3827(0);
                    return;
                }
                if (opcode == 3621) {
                    if (Class6.anInt72 == 0)
                        integerStack[integerStackCounter++] = -1;
                    else {
                        integerStack[integerStackCounter++] = Class60.anInt436;
                        return;
                    }
                    return;
                }
                if (opcode == 3622) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 != 0 && anLocalInt < Class60.anInt436) {
                        stringStack[stringStackCounter++] = Class76.aStringArray515[anLocalInt];
                        if (DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt] != null)
                            stringStack[stringStackCounter++] = DoublyLinkedNodeP2_Sub4.aStringArray4528[anLocalInt];
                        else
                            stringStack[stringStackCounter++] = "";
                    } else {
                        stringStack[stringStackCounter++] = "";
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3623) {
                    String string = stringStack[--stringStackCounter];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    integerStack[integerStackCounter++] = Class356.method3933(123, string) ? 1 : 0;
                    return;
                }
                if (opcode == 3624) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Node_Sub13.aClass176Array3956 != null && anLocalInt < Statics.anInt2724 && (Node_Sub13.aClass176Array3956[anLocalInt].aString1303.equalsIgnoreCase(Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aString6836)))
                        integerStack[integerStackCounter++] = 1;
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3625) {
                    if (Class307_Sub1.aString5416 != null)
                        stringStack[stringStackCounter++] = Class307_Sub1.aString5416;
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3626) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Statics.aString2287 != null && anLocalInt < Statics.anInt2724)
                        stringStack[stringStackCounter++] = Node_Sub13.aClass176Array3956[anLocalInt].aString1306;
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3627) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 == 2 && anLocalInt >= 0 && anLocalInt < Class257.anInt2013)
                        integerStack[integerStackCounter++] = (Statics.aBooleanArray4340[anLocalInt] ? 1 : 0);
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3628) {
                    String string = stringStack[--stringStackCounter];
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>"))
                        string = string.substring(7);
                    integerStack[integerStackCounter++] = Class354.method3924(string, -19496);
                    return;
                }
                if (opcode == 3629) {
                    integerStack[integerStackCounter++] = client.country;
                    return;
                }
                if (opcode == 3630) {
                    String string = stringStack[--stringStackCounter];
                    Class177.method2793(string, true, (byte) 125);
                    return;
                }
                if (opcode == 3631) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Node_Sub6.aBooleanArray3907[anLocalInt] ? 1 : 0;
                    return;
                }
                if (opcode == 3632) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Statics.aString2287 != null && anLocalInt < Statics.anInt2724)
                        stringStack[stringStackCounter++] = Node_Sub13.aClass176Array3956[anLocalInt].aString1303;
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 3633) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class6.anInt72 != 0 && anLocalInt < Class60.anInt436)
                        stringStack[stringStackCounter++] = (DoublyLinkedNode_Sub51_Sub19_Sub1.aStringArray6676[anLocalInt]);
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
            } else if (opcode < 3800) {
                if (opcode == 3700) {
                    if (Node_Sub31_Sub13.aClanSettings_5899 != null) {
                        integerStack[integerStackCounter++] = 1;
                        currentClanSettings = Node_Sub31_Sub13.aClanSettings_5899;
                    } else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3701) {
                    if (Node_Sub32.aClanSettings_4143 != null) {
                        integerStack[integerStackCounter++] = 1;
                        currentClanSettings = Node_Sub32.aClanSettings_4143;
                    } else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3702) {
                    stringStack[stringStackCounter++] = currentClanSettings.aString1274;
                    return;
                }
                if (opcode == 3703) {
                    integerStack[integerStackCounter++] = currentClanSettings.aBoolean1263 ? 1 : 0;
                    return;
                }
                if (opcode == 3704) {
                    integerStack[integerStackCounter++] = currentClanSettings.aByte1265;
                    return;
                }
                if (opcode == 3705) {
                    integerStack[integerStackCounter++] = currentClanSettings.aByte1264;
                    return;
                }
                if (opcode == 3706) {
                    integerStack[integerStackCounter++] = currentClanSettings.aByte1272;
                    return;
                }
                if (opcode == 3707) {
                    integerStack[integerStackCounter++] = currentClanSettings.aByte1261;
                    return;
                }
                if (opcode == 3709) {
                    integerStack[integerStackCounter++] = currentClanSettings.memberCount;
                    return;
                }
                if (opcode == 3710) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = (currentClanSettings.memberDisplayNames[anLocalInt]);
                    return;
                }
                if (opcode == 3711) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (currentClanSettings.aByteArray1267[anLocalInt]);
                    return;
                }
                if (opcode == 3712) {
                    integerStack[integerStackCounter++] = currentClanSettings.anInt1278;
                    return;
                }
                if (opcode == 3713) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = (currentClanSettings.aStringArray1257[anLocalInt]);
                    return;
                }
                if (opcode == 3714) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_53_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_54_ = integerStack[integerStackCounter + 2];
                    integerStack[integerStackCounter++] = currentClanSettings.method2755(anLocalInt_54_, anLocalInt, anLocalInt_53_);
                    return;
                }
                if (opcode == 3715) {
                    integerStack[integerStackCounter++] = currentClanSettings.anInt1256;
                    return;
                }
                if (opcode == 3716) {
                    integerStack[integerStackCounter++] = currentClanSettings.anInt1275;
                    return;
                }
                if (opcode == 3717) {
                    integerStack[integerStackCounter++] = currentClanSettings.method2759((byte) -47, (stringStack[--stringStackCounter]));
                    return;
                }
                if (opcode == 3718) {
                    integerStack[integerStackCounter - 1] = (currentClanSettings.method2746(-127)[integerStack[integerStackCounter - 1]]);
                    return;
                }
                if (opcode == 3750) {
                    if (GameEnum.aClass59_Sub53_825 != null) {
                        integerStack[integerStackCounter++] = 1;
                        aClass59_Sub53_2653 = GameEnum.aClass59_Sub53_825;
                    } else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3751) {
                    if (AbstractFont.aClass59_Sub53_420 != null) {
                        integerStack[integerStackCounter++] = 1;
                        aClass59_Sub53_2653 = AbstractFont.aClass59_Sub53_420;
                    } else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 3752) {
                    stringStack[stringStackCounter++] = aClass59_Sub53_2653.aString4357;
                    return;
                }
                if (opcode == 3753) {
                    integerStack[integerStackCounter++] = aClass59_Sub53_2653.aByte4358;
                    return;
                }
                if (opcode == 3754) {
                    integerStack[integerStackCounter++] = aClass59_Sub53_2653.aByte4352;
                    return;
                }
                if (opcode == 3755) {
                    integerStack[integerStackCounter++] = aClass59_Sub53_2653.anInt4350;
                    return;
                }
                if (opcode == 3756) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = (aClass59_Sub53_2653.aClass388Array4354[anLocalInt].aString3272);
                    return;
                }
                if (opcode == 3757) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (aClass59_Sub53_2653.aClass388Array4354[anLocalInt].aByte3274);
                    return;
                }
                if (opcode == 3758) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (aClass59_Sub53_2653.aClass388Array4354[anLocalInt].anInt3275);
                    return;
                }
                if (opcode == 3759) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class38.method397(anLocalInt, (aClass59_Sub53_2653 == AbstractFont.aClass59_Sub53_420), (byte) -73);
                    return;
                }
                if (opcode == 3760) {
                    integerStack[integerStackCounter++] = aClass59_Sub53_2653.method1321((stringStack[--stringStackCounter]), 14844);
                    return;
                }
                if (opcode == 3761) {
                    integerStack[integerStackCounter - 1] = (aClass59_Sub53_2653.method1320((byte) 46)[integerStack[integerStackCounter - 1]]);
                    return;
                }
            } else if (opcode < 4000) {
                if (opcode == 3903) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Class128.aClass272Array1043[anLocalInt].method3374((byte) 23);
                    return;
                }
                if (opcode == 3904) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class128.aClass272Array1043[anLocalInt].anInt2172);
                    return;
                }
                if (opcode == 3905) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class128.aClass272Array1043[anLocalInt].anInt2173);
                    return;
                }
                if (opcode == 3906) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class128.aClass272Array1043[anLocalInt].anInt2168);
                    return;
                }
                if (opcode == 3907) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class128.aClass272Array1043[anLocalInt].anInt2170);
                    return;
                }
                if (opcode == 3908) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class128.aClass272Array1043[anLocalInt].anInt2169);
                    return;
                }
                if (opcode == 3910) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    int anLocalInt_55_ = Class128.aClass272Array1043[anLocalInt].method3373(false);
                    integerStack[integerStackCounter++] = anLocalInt_55_ == 0 ? 1 : 0;
                    return;
                }
                if (opcode == 3911) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    int anLocalInt_56_ = Class128.aClass272Array1043[anLocalInt].method3373(false);
                    integerStack[integerStackCounter++] = anLocalInt_56_ == 2 ? 1 : 0;
                    return;
                }
                if (opcode == 3912) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    int anLocalInt_57_ = Class128.aClass272Array1043[anLocalInt].method3373(false);
                    integerStack[integerStackCounter++] = anLocalInt_57_ == 5 ? 1 : 0;
                    return;
                }
                if (opcode == 3913) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    int anLocalInt_58_ = Class128.aClass272Array1043[anLocalInt].method3373(false);
                    integerStack[integerStackCounter++] = anLocalInt_58_ == 1 ? 1 : 0;
                    return;
                }
            } else if (opcode < 4100) {
                if (opcode == 4000) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_59_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt + anLocalInt_59_;
                    return;
                }
                if (opcode == 4001) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_60_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt - anLocalInt_60_;
                    return;
                }
                if (opcode == 4002) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_61_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt * anLocalInt_61_;
                    return;
                }
                if (opcode == 4003) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_62_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt / anLocalInt_62_;
                    return;
                }
                if (opcode == 4004) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (int) (Math.random() * (double) anLocalInt);
                    return;
                }
                if (opcode == 4005) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (int) (Math.random() * (double) (anLocalInt + 1));
                    return;
                }
                if (opcode == 4006) {
                    integerStackCounter -= 5;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_63_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_64_ = integerStack[integerStackCounter + 2];
                    int anLocalInt_65_ = integerStack[integerStackCounter + 3];
                    int anLocalInt_66_ = integerStack[integerStackCounter + 4];
                    integerStack[integerStackCounter++] = anLocalInt + ((anLocalInt_63_ - anLocalInt) * (anLocalInt_66_ - anLocalInt_64_) / (anLocalInt_65_ - anLocalInt_64_));
                    return;
                }
                if (opcode == 4007) {
                    integerStackCounter -= 2;
                    long l = (long) integerStack[integerStackCounter];
                    long l_67_ = (long) integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = (int) (l + l * l_67_ / 100L);
                    return;
                }
                if (opcode == 4008) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_68_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt | 1 << anLocalInt_68_;
                    return;
                }
                if (opcode == 4009) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_69_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt & -1 - (1 << anLocalInt_69_);
                    return;
                }
                if (opcode == 4010) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_70_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = (anLocalInt & 1 << anLocalInt_70_) != 0 ? 1 : 0;
                    return;
                }
                if (opcode == 4011) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_71_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt % anLocalInt_71_;
                    return;
                }
                if (opcode == 4012) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_72_ = integerStack[integerStackCounter + 1];
                    if (anLocalInt == 0)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        integerStack[integerStackCounter++] = (int) Math.pow((double) anLocalInt, (double) anLocalInt_72_);
                        return;
                    }
                    return;
                }
                if (opcode == 4013) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_73_ = integerStack[integerStackCounter + 1];
                    if (anLocalInt == 0)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        if (anLocalInt_73_ == 0)
                            integerStack[integerStackCounter++] = 2147483647;
                        else {
                            integerStack[integerStackCounter++] = (int) Math.pow((double) anLocalInt, (1.0 / (double) anLocalInt_73_));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (opcode == 4014) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_74_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt & anLocalInt_74_;
                    return;
                }
                if (opcode == 4015) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_75_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = anLocalInt | anLocalInt_75_;
                    return;
                }
                if (opcode == 4016) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_76_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = (anLocalInt < anLocalInt_76_ ? anLocalInt : anLocalInt_76_);
                    return;
                }
                if (opcode == 4017) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_77_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = (anLocalInt > anLocalInt_77_ ? anLocalInt : anLocalInt_77_);
                    return;
                }
                if (opcode == 4018) {
                    integerStackCounter -= 3;
                    long l = (long) integerStack[integerStackCounter];
                    long l_78_ = (long) integerStack[integerStackCounter + 1];
                    long l_79_ = (long) integerStack[integerStackCounter + 2];
                    integerStack[integerStackCounter++] = (int) (l * l_79_ / l_78_);
                    return;
                }
                if (opcode == 4019) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_80_ = integerStack[integerStackCounter + 1];
                    if (anLocalInt > 700 || anLocalInt_80_ > 700)
                        integerStack[integerStackCounter++] = 256;
                    double d = ((Math.random() * (double) (anLocalInt_80_ + anLocalInt) - (double) anLocalInt + 800.0) / 100.0);
                    integerStack[integerStackCounter++] = (int) (Math.pow(2.0, d) + 0.5);
                    return;
                }
                if (opcode == 4020) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (HslToRgb.table2[(HslToRgb.method3452(anLocalInt) & 0xffff)]);
                    return;
                }
            } else if (opcode < 4200) {
                if (opcode == 4100) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = string + anLocalInt;
                    return;
                }
                if (opcode == 4101) {
                    stringStackCounter -= 2;
                    String string = stringStack[stringStackCounter];
                    String string_81_ = stringStack[stringStackCounter + 1];
                    stringStack[stringStackCounter++] = string + string_81_;
                    return;
                }
                if (opcode == 4102) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = string + Statics.method1499(anLocalInt, 16051, true);
                    return;
                }
                if (opcode == 4103) {
                    String string = stringStack[--stringStackCounter];
                    stringStack[stringStackCounter++] = string.toLowerCase();
                    return;
                }
                if (opcode == 4104) {
                    stringStack[stringStackCounter++] = (Class144.method2515(client.language, true, Node_Sub2.method534(integerStack[--integerStackCounter], -96)));
                    return;
                }
                if (opcode == 4105) {
                    stringStackCounter -= 2;
                    String string = stringStack[stringStackCounter];
                    String string_82_ = stringStack[stringStackCounter + 1];
                    if ((Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854) != null && Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854.aBoolean137)
                        stringStack[stringStackCounter++] = string_82_;
                    else {
                        stringStack[stringStackCounter++] = string;
                        return;
                    }
                    return;
                }
                if (opcode == 4106) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = Integer.toString(anLocalInt);
                    return;
                }
                if (opcode == 4107) {
                    stringStackCounter -= 2;
                    integerStack[integerStackCounter++] = Class212.method2976(stringStack[stringStackCounter], false, stringStack[stringStackCounter + 1], client.language);
                    return;
                }
                if (opcode == 4108) {
                    String string = stringStack[--stringStackCounter];
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_83_ = integerStack[integerStackCounter + 1];
                    Class76 class76 = Class349.method3820(0, client.fontCache, anLocalInt_83_, (byte) 44);
                    integerStack[integerStackCounter++] = class76.method1553(-62, Class33.aClass368Array222, string, anLocalInt);
                    return;
                }
                if (opcode == 4109) {
                    String string = stringStack[--stringStackCounter];
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_84_ = integerStack[integerStackCounter + 1];
                    Class76 class76 = Class349.method3820(0, client.fontCache, anLocalInt_84_, (byte) 44);
                    integerStack[integerStackCounter++] = class76.method1557((byte) -121, string, anLocalInt, Class33.aClass368Array222);
                    return;
                }
                if (opcode == 4110) {
                    stringStackCounter -= 2;
                    String string = stringStack[stringStackCounter];
                    String string_85_ = stringStack[stringStackCounter + 1];
                    if (integerStack[--integerStackCounter] == 1)
                        stringStack[stringStackCounter++] = string;
                    else {
                        stringStack[stringStackCounter++] = string_85_;
                        return;
                    }
                    return;
                }
                if (opcode == 4111) {
                    String string = stringStack[--stringStackCounter];
                    stringStack[stringStackCounter++] = Node_Sub31_Sub1.method878((byte) -10, string);
                    return;
                }
                if (opcode == 4112) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (anLocalInt == -1)
                        throw new RuntimeException("null char");
                    stringStack[stringStackCounter++] = string + (char) anLocalInt;
                    return;
                }
                if (opcode == 4113) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = isValidChar((char) anLocalInt);
                    return;
                }
                if (opcode == 4114) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Class259.method3306(64, (char) anLocalInt) ? 1 : 0;
                    return;
                }
                if (opcode == 4115) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = JagexHash.method3086((char) anLocalInt, -98) ? 1 : 0;
                    return;
                }
                if (opcode == 4116) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class46_Sub2.method441(28855, (char) anLocalInt) ? 1 : 0);
                    return;
                }
                if (opcode == 4117) {
                    String string = stringStack[--stringStackCounter];
                    if (string != null)
                        integerStack[integerStackCounter++] = string.length();
                    else {
                        integerStack[integerStackCounter++] = 0;
                        return;
                    }
                    return;
                }
                if (opcode == 4118) {
                    String string = stringStack[--stringStackCounter];
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_86_ = integerStack[integerStackCounter + 1];
                    stringStack[stringStackCounter++] = string.substring(anLocalInt, anLocalInt_86_);
                    return;
                }
                if (opcode == 4119) {
                    String string = stringStack[--stringStackCounter];
                    StringBuffer stringbuffer = new StringBuffer(string.length());
                    boolean anLocalBoolean = false;
                    for (int anLocalInt = 0; anLocalInt < string.length(); anLocalInt++) {
                        char anLocalChar = string.charAt(anLocalInt);
                        if (anLocalChar == '<')
                            anLocalBoolean = true;
                        else if (anLocalChar == '>')
                            anLocalBoolean = false;
                        else if (!anLocalBoolean)
                            stringbuffer.append(anLocalChar);
                    }
                    stringStack[stringStackCounter++] = stringbuffer.toString();
                    return;
                }
                if (opcode == 4120) {
                    String string = stringStack[--stringStackCounter];
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_87_ = integerStack[integerStackCounter + 1];
                    integerStack[integerStackCounter++] = string.indexOf(anLocalInt, anLocalInt_87_);
                    return;
                }
                if (opcode == 4121) {
                    stringStackCounter -= 2;
                    String string = stringStack[stringStackCounter];
                    String string_88_ = stringStack[stringStackCounter + 1];
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = string.indexOf(string_88_, anLocalInt);
                    return;
                }
                if (opcode == 4122) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Character.toLowerCase((char) anLocalInt);
                    return;
                }
                if (opcode == 4123) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = Character.toUpperCase((char) anLocalInt);
                    return;
                }
                if (opcode == 4124) {
                    boolean anLocalBoolean = integerStack[--integerStackCounter] != 0;
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = Class368_Sub3.method4035(anLocalBoolean, (long) anLocalInt, client.language, 0, -1262897456);
                    return;
                }
                if (opcode == 4125) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class76 class76 = Class349.method3820(0, client.fontCache, anLocalInt, (byte) 44);
                    integerStack[integerStackCounter++] = class76.method1558(18700, Class33.aClass368Array222, string);
                    return;
                }
                if (opcode == 4126) {
                    stringStack[stringStackCounter++] = Node_Sub31_Sub14.method915(true, client.language, ((long) (integerStack[--integerStackCounter]) * 60000L), -116) + " UTC";
                    return;
                }
                if (opcode == 4127) {
                    long l = longStack[--longStackCounter];
                    stringStack[stringStackCounter++] = l == -1L ? "" : Long.toString(l, 36).toUpperCase();
                    return;
                }
            } else if (opcode < 4300) {
                if (opcode == 4200) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    stringStack[stringStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(-33, anLocalInt).aString3160);
                    return;
                }
                if (opcode == 4201) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_89_ = integerStack[integerStackCounter + 1];
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(-55, anLocalInt);
                    if (anLocalInt_89_ >= 1 && anLocalInt_89_ <= 5 && (class371.aStringArray3136[anLocalInt_89_ - 1]) != null)
                        stringStack[stringStackCounter++] = (class371.aStringArray3136[anLocalInt_89_ - 1]);
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 4202) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_90_ = integerStack[integerStackCounter + 1];
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(127, anLocalInt);
                    if (anLocalInt_90_ >= 1 && anLocalInt_90_ <= 5 && (class371.aStringArray3143[anLocalInt_90_ - 1]) != null)
                        stringStack[stringStackCounter++] = (class371.aStringArray3143[anLocalInt_90_ - 1]);
                    else {
                        stringStack[stringStackCounter++] = "";
                        return;
                    }
                    return;
                }
                if (opcode == 4203) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(121, anLocalInt).anInt3129);
                    return;
                }
                if (opcode == 4204) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(-4, anLocalInt).anInt3152) == 1 ? 1 : 0;
                    return;
                }
                if (opcode == 4205) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(121, anLocalInt);
                    if (class371.anInt3138 == -1 && class371.anInt3189 >= 0)
                        integerStack[integerStackCounter++] = class371.anInt3189;
                    else {
                        integerStack[integerStackCounter++] = anLocalInt;
                        return;
                    }
                    return;
                }
                if (opcode == 4206) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(-109, anLocalInt);
                    if (class371.anInt3138 >= 0 && class371.anInt3189 >= 0)
                        integerStack[integerStackCounter++] = class371.anInt3189;
                    else {
                        integerStack[integerStackCounter++] = anLocalInt;
                        return;
                    }
                    return;
                }
                if (opcode == 4207) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(-2, anLocalInt).aBoolean3131) ? 1 : 0;
                    return;
                }
                if (opcode == 4208) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_91_ = integerStack[integerStackCounter + 1];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt_91_);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(126, anLocalInt).method4052(anLocalInt_91_, class315.aString2606, (byte) -107));
                    else {
                        integerStack[integerStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(-60, anLocalInt).method4053(class315.anInt2607, anLocalInt_91_, -1));
                        return;
                    }
                    return;
                }
                if (opcode == 4209) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_92_ = integerStack[integerStackCounter + 1] - 1;
                    Class371 class371 = Class253_Sub1_Sub1.aClass365_6632.method3975(123, anLocalInt);
                    if (class371.anInt3141 == anLocalInt_92_)
                        integerStack[integerStackCounter++] = class371.anInt3148;
                    else {
                        if (class371.anInt3139 == anLocalInt_92_)
                            integerStack[integerStackCounter++] = class371.anInt3171;
                        else {
                            integerStack[integerStackCounter++] = -1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (opcode == 4210) {
                    String string = stringStack[--stringStackCounter];
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class245_Sub1_Sub2.method3185(-1, anLocalInt == 1, string);
                    integerStack[integerStackCounter++] = Class62_Sub26.anInt4447;
                    return;
                }
                if (opcode == 4211) {
                    if (Node_Sub47_Sub6.aShortArray6178 == null || Class276.anInt2218 >= Class62_Sub26.anInt4447)
                        integerStack[integerStackCounter++] = -1;
                    else {
                        integerStack[integerStackCounter++] = (Node_Sub47_Sub6.aShortArray6178[Class276.anInt2218++]) & 0xffff;
                        return;
                    }
                    return;
                }
                if (opcode == 4212) {
                    Class276.anInt2218 = 0;
                    return;
                }
                if (opcode == 4213) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = (Class253_Sub1_Sub1.aClass365_6632.method3975(125, anLocalInt).anInt3162);
                    return;
                }
                if (opcode == 4214) {
                    String string = stringStack[--stringStackCounter];
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_93_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_94_ = integerStack[integerStackCounter + 2];
                    Statics.method2583(anLocalInt_93_, 1, string, anLocalInt_94_, anLocalInt == 1);
                    integerStack[integerStackCounter++] = Class62_Sub26.anInt4447;
                    return;
                }
                if (opcode == 4215) {
                    stringStackCounter -= 2;
                    integerStackCounter -= 2;
                    String string = stringStack[stringStackCounter];
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_95_ = integerStack[integerStackCounter + 1];
                    String string_96_ = stringStack[stringStackCounter + 1];
                    Statics.method4097(string, string_96_, anLocalInt_95_, anLocalInt == 1, (byte) 85);
                    integerStack[integerStackCounter++] = Class62_Sub26.anInt4447;
                    return;
                }
            } else if (opcode < 4400) {
                if (opcode == 4300) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_97_ = integerStack[integerStackCounter + 1];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt_97_);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = (DiskBackedCache.aClass26_2709.method343((byte) 93, anLocalInt).method3489(anLocalInt_97_, class315.aString2606, (byte) 100));
                    else {
                        integerStack[integerStackCounter++] = (DiskBackedCache.aClass26_2709.method343((byte) -116, anLocalInt).method3488(anLocalInt_97_, class315.anInt2607, (byte) 111));
                        return;
                    }
                    return;
                }
            } else if (opcode < 4500) {
                if (opcode == 4400) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_98_ = integerStack[integerStackCounter + 1];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt_98_);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = (Node_Sub31_Sub30.aClass257_5983.method3298((byte) 39, anLocalInt).method3337(anLocalInt_98_, (byte) 120, class315.aString2606));
                    else {
                        integerStack[integerStackCounter++] = (Node_Sub31_Sub30.aClass257_5983.method3298((byte) 88, anLocalInt).method3335(anLocalInt_98_, 1312515360, class315.anInt2607));
                        return;
                    }
                    return;
                }
            } else if (opcode < 4600) {
                if (opcode == 4500) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_99_ = integerStack[integerStackCounter + 1];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt_99_);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = (Class86.aClass264_638.method3332(anLocalInt, -125).method1252(26689, class315.aString2606, anLocalInt_99_));
                    else {
                        integerStack[integerStackCounter++] = (Class86.aClass264_638.method3332(anLocalInt, 105).method1246(class315.anInt2607, 97, anLocalInt_99_));
                        return;
                    }
                    return;
                }
            } else if (opcode < 4700) {
                if (opcode == 4600) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class354 class354 = Class157.aClass41_1159.method421((byte) -75, anLocalInt);
                    if (class354.anIntArray2960 != null && class354.anIntArray2960.length > 0) {
                        int anLocalInt_100_ = 0;
                        int anLocalInt_101_ = class354.anIntArray2983[0];
                        for (int anLocalInt_102_ = 1; (anLocalInt_102_ < class354.anIntArray2960.length); anLocalInt_102_++) {
                            if ((class354.anIntArray2983[anLocalInt_102_]) > anLocalInt_101_) {
                                anLocalInt_100_ = anLocalInt_102_;
                                anLocalInt_101_ = (class354.anIntArray2983[anLocalInt_102_]);
                            }
                        }
                        integerStack[integerStackCounter++] = (class354.anIntArray2960[anLocalInt_100_]);
                    } else {
                        integerStack[integerStackCounter++] = class354.anInt2976;
                        return;
                    }
                    return;
                }
            } else if (opcode < 4800) {
                if (opcode == 4700) {
                    integerStack[integerStackCounter++] = tia_sub_35_Sub2DoublyLinked.aBoolean6662 ? 1 : 0;
                    return;
                }
                if (opcode == 4701) {
                    String string = stringStack[--stringStackCounter];
                    if (Statics.anInt1652 != 7 || Class303.method3574(-1))
                        Class282.aByte2275 = (byte) -5;
                    else {
                        if (string.length() > 20)
                            Class282.aByte2275 = (byte) -4;
                        else {
                            Class282.aByte2275 = (byte) -1;
                            Node_Sub29 class59_sub29 = Class91.method1683((byte) 64, (Node_Sub31_Sub16.aClass372_5910), (Class350_Sub3.aClass207_5454));
                            class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                            int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                            class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                            class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos - anLocalInt));
                            Class251.method3243(class59_sub29, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (opcode == 4702) {
                    integerStack[integerStackCounter++] = Class282.aByte2275;
                    if (Class282.aByte2275 != -1)
                        Class282.aByte2275 = (byte) -6;
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(opcode));
    }

    private static void executeScript(Cs2Script excecutingScript, int argument_103_) {
        integerStackCounter = 0;
        stringStackCounter = 0;
        int instructionCounter = -1;
        int[] opcodes = excecutingScript.opcodes;
        int[] integerOperands = excecutingScript.integerOperands;
        int opcode = -1;
        callStackCounter = 0;
        Cs2Decompiler.decompile(excecutingScript);
        try {
            int anLocalInt_106_ = 0;
            for (; ; ) {
                if (++anLocalInt_106_ > argument_103_)
                    throw new RuntimeException("slow");
                opcode = opcodes[++instructionCounter];
                if (debugger != null && debugger.isBreakpoint((int) excecutingScript.hash,instructionCounter)){
                    try {
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        DataOutputStream dOS = new DataOutputStream(bos);
                        writeState(dOS,instructionCounter,excecutingScript);
                        dOS.flush();
                        bos.flush();
                        debugger.submitMessage(new Cs2DebuggerMessage(1, (int) excecutingScript.hash,bos.toByteArray()));
                    } catch (IOException e) {
                        System.err.println("[CS2DEBUGGER] Error sending breakpoint state");
                    }
                    debugger.waitBreakpoint();
                }
                if (opcode < 150) {
                    switch (opcode) {
                        case 0:
                            integerStack[integerStackCounter++] = integerOperands[instructionCounter];
                            break;
                        case 1:
                            int operand = integerOperands[instructionCounter];
                            integerStack[integerStackCounter++] = (ClientVariables.instance.values[operand]);
                            break;
                        case 2:
                            operand = integerOperands[instructionCounter];
                            ClientVariables.instance.set(operand, integerStack[--integerStackCounter]);
                            break;
                        case 3:
                            stringStack[stringStackCounter++] = (excecutingScript.stringOperands[instructionCounter]);
                            break;
                        case 6:
                            instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 7:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] != integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 8:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] == integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 9:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] < integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 10:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] > integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 21: {
                            if (callStackCounter == 0)
                                return;
                            Cs2CallStackEntry cs2CallStackEntry = callStack[--callStackCounter];
                            excecutingScript = cs2CallStackEntry.caller;
                            opcodes = excecutingScript.opcodes;
                            integerOperands = excecutingScript.integerOperands;
                            instructionCounter = cs2CallStackEntry.instructionCounter;
                            integerLocalVariables = cs2CallStackEntry.integerLocalVariables;
                            stringLocalVariables = cs2CallStackEntry.stringLocalVariables;
                            longLocalVariables = cs2CallStackEntry.longLocalVariables;
                            break;
                        }
                        case 25:
                            int anLocalInt_109_ = integerOperands[instructionCounter];
                            integerStack[integerStackCounter++] = ClientVariables.instance.getVarbit(anLocalInt_109_, 14194);
                            break;
                        case 27:
                            int anLocalInt_110_ = integerOperands[instructionCounter];
                            ClientVariables.instance.setVarbit(anLocalInt_110_, integerStack[--integerStackCounter], 0);
                            break;
                        case 31:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] <= integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 32:
                            integerStackCounter -= 2;
                            if (integerStack[integerStackCounter] >= integerStack[integerStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 33:
                            integerStack[integerStackCounter++] = integerLocalVariables[integerOperands[instructionCounter]];
                            break;
                        case 34:
                            Cs2Runtime.integerLocalVariables[integerOperands[instructionCounter]] = integerStack[--integerStackCounter];
                            break;
                        case 35:
                            stringStack[stringStackCounter++] = stringLocalVariables[integerOperands[instructionCounter]];
                            break;
                        case 36:
                            stringLocalVariables[integerOperands[instructionCounter]] = stringStack[--stringStackCounter];
                            break;
                        case 37: {
                            int count = integerOperands[instructionCounter];
                            stringStackCounter -= count;
                            String string = JagexStringUtils.concatenate(stringStack, stringStackCounter, count);
                            stringStack[stringStackCounter++] = string;
                            break;
                        }
                        case 38:
                            integerStackCounter--;
                            break;
                        case 39:
                            stringStackCounter--;
                            break;
                        case 40: {
                            int calleeId = integerOperands[instructionCounter];
                            Cs2Script callee = Cs2Script.get(calleeId);
                            if (callee == null)
                                throw new RuntimeException();
                            int[] calleeIntegerVariables = (new int[(callee.integerVariableCount)]);
                            String[] calleeStringVariables = (new String[(callee.stringVariableCount)]);
                            long[] calleeLongVariables = new long[callee.longVariableCount];
                            System.arraycopy(integerStack, integerStackCounter - callee.integerArgumentCount, calleeIntegerVariables, 0, callee.integerArgumentCount);
                            System.arraycopy(stringStack, stringStackCounter - callee.stringArgumentCount, calleeStringVariables, 0, callee.stringArgumentCount);
                            System.arraycopy(longStack, longStackCounter - callee.longArgumentCount, calleeLongVariables, 0, callee.longArgumentCount);
                            integerStackCounter -= callee.integerArgumentCount;
                            stringStackCounter -= callee.stringArgumentCount;
                            longStackCounter -= callee.longArgumentCount;
                            Cs2CallStackEntry cs2CallStackEntry = new Cs2CallStackEntry();
                            cs2CallStackEntry.caller = excecutingScript;
                            cs2CallStackEntry.instructionCounter = instructionCounter;
                            cs2CallStackEntry.integerLocalVariables = integerLocalVariables;
                            cs2CallStackEntry.stringLocalVariables = stringLocalVariables;
                            cs2CallStackEntry.longLocalVariables = longLocalVariables;
                            if (callStackCounter >= callStack.length)
                                throw new RuntimeException();
                            callStack[callStackCounter++] = cs2CallStackEntry;
                            excecutingScript = callee;
                            opcodes = excecutingScript.opcodes;
                            integerOperands = excecutingScript.integerOperands;
                            instructionCounter = -1;
                            integerLocalVariables = calleeIntegerVariables;
                            stringLocalVariables = calleeStringVariables;
                            longLocalVariables = calleeLongVariables;
                            break;
                        }
                        case 42:
                            integerStack[integerStackCounter++] = (integerGlobalVariables[integerOperands[instructionCounter]]);
                            break;
                        case 43:
                            int variableIndex = integerOperands[instructionCounter];
                            integerGlobalVariables[variableIndex] = integerStack[--integerStackCounter];
                            Class76.method1559(variableIndex, 1);
                            Class242.aBoolean1771 |= Class273.aBooleanArray2184[variableIndex];
                            break;
                        case 44:
                            int operandHigh = integerOperands[instructionCounter] >> 16;
                            int operandLow = integerOperands[instructionCounter] & 0xffff;
                            int stackEntry = integerStack[--integerStackCounter];
                            if (stackEntry < 0 || stackEntry > 5000)
                                throw new RuntimeException();
                            arrayLength[operandHigh] = stackEntry;
                            int initializationValue = -1;
                            if (operandLow == 105)
                                initializationValue = 0;
                            for (int ptr = 0; ptr < stackEntry; ptr++)
                                arrayVariables[operandHigh][ptr] = initializationValue;
                            break;
                        case 45: {
                            int arrayId = integerOperands[instructionCounter];
                            int index = integerStack[--integerStackCounter];
                            if (index < 0 || (index >= arrayLength[arrayId]))
                                throw new RuntimeException();
                            integerStack[integerStackCounter++] = (arrayVariables[arrayId][index]);
                            break;
                        }
                        case 46: {
                            int arrayId = integerOperands[instructionCounter];
                            integerStackCounter -= 2;
                            int index = integerStack[integerStackCounter];
                            if (index < 0 || (index >= arrayLength[arrayId]))
                                throw new RuntimeException();
                            arrayVariables[arrayId][index] = integerStack[integerStackCounter + 1];
                            break;
                        }
                        case 47: {
                            String string = (stringGlobalVariable[integerOperands[instructionCounter]]);
                            if (string == null)
                                string = "null";
                            stringStack[stringStackCounter++] = string;
                            break;
                        }
                        case 48:
                            variableIndex = integerOperands[instructionCounter];
                            stringGlobalVariable[variableIndex] = stringStack[--stringStackCounter];
                            Class112.method2008(118, variableIndex);
                            break;
                        case 51:
                            JagexHashMap jagexHashMap = (excecutingScript.switchBlocks[integerOperands[instructionCounter]]);
                            IntegerNode caseLabel = ((IntegerNode) jagexHashMap.get((long) (integerStack[--integerStackCounter])));
                            if (caseLabel != null)
                                instructionCounter += caseLabel.value;
                            break;
                        case 54:
                            longStack[longStackCounter++] = (excecutingScript.longOperands[instructionCounter]);
                            break;
                        case 55:
                            longStackCounter--;
                            break;
                        case 66:
                            longStack[longStackCounter++] = longLocalVariables[integerOperands[instructionCounter]];
                            break;
                        case 67:
                            longLocalVariables[integerOperands[instructionCounter]] = longStack[--longStackCounter];
                            break;
                        case 68:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] != longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 69:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] == longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 70:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] < longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 71:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] > longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 72:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] <= longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 73:
                            longStackCounter -= 2;
                            if (longStack[longStackCounter] >= longStack[longStackCounter + 1])
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 86:
                            if (integerStack[--integerStackCounter] == 1)
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 87:
                            if (integerStack[--integerStackCounter] == 0)
                                instructionCounter += integerOperands[instructionCounter];
                            break;
                        case 112:
                            integerStack[integerStackCounter++] = getIntClanSetting(integerOperands[instructionCounter]);
                            break;
                        case 113:
                            integerStack[integerStackCounter++] = getBitClanSetting(integerOperands[instructionCounter]);
                            break;
                        case 114:
                            longStack[longStackCounter++] = getLongClanSetting(integerOperands[instructionCounter]);
                            break;
                        case 115:
                            stringStack[stringStackCounter++] = getStringClanSetting(integerOperands[instructionCounter]);
                            break;
                    }
                } else {
                    boolean anLocalBoolean;
                    if (integerOperands[instructionCounter] == 1)
                        anLocalBoolean = true;
                    else
                        anLocalBoolean = false;
                    if (opcode >= 150 && opcode < 5000)
                        method3653(opcode, anLocalBoolean);
                    else {
                        if (opcode < 5000 || opcode >= 10000)
                            break;
                        method3663(opcode);
                    }
                }
            }
            throw new IllegalStateException("Command: " + opcode);
        } catch (Exception exception) {
            if (excecutingScript.name != null) {
                Class214.method2986((byte) 121, ("Clientscript error in: " + (excecutingScript.name)), 4);
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("Clientscript error in: ").append(excecutingScript.name).append("\n");
                for (int callStackPointer = callStackCounter - 1; callStackPointer >= 0; callStackPointer--)
                    stringbuffer.append("via: ").append(callStack[callStackPointer].caller.name).append("\n");
                stringbuffer.append("Op: ").append(opcode).append("\n");
                String string = exception.getMessage();
                if (string != null && string.length() > 0)
                    stringbuffer.append("Message: ").append(string).append("\n");
                ErrorReporting.reportError(stringbuffer.toString(), exception);
                Statics.method2425((byte) -113, stringbuffer.toString());
            } else {
                StringBuffer stringbuffer = new StringBuffer(30);
                stringbuffer.append("CS2: ").append(excecutingScript.hash).append(" ");
                for (int callStackPointer = callStackCounter - 1; callStackPointer >= 0; callStackPointer--)
                    stringbuffer.append("v: ").append(callStack[callStackPointer].caller.hash).append(" ");
                stringbuffer.append("op: ").append(opcode);
                ErrorReporting.reportError(stringbuffer.toString(), exception);
            }
            if (debugger != null){
                try {
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    DataOutputStream dOS = new DataOutputStream(bos);
                    dOS.writeUTF(exception.getMessage());
                    writeState(dOS,instructionCounter,excecutingScript);
                    dOS.flush();
                    bos.flush();
                    debugger.submitMessage(new Cs2DebuggerMessage(0, (int) excecutingScript.hash,bos.toByteArray()));
                } catch (IOException e) {
                    System.err.println("[CS2DEBUGGER] Error sending exception state");
                }
            }
        }
    }

    private static void createCustomInterfacePTB(int argument) {
        RsInterface rsInterface = RsInterface.getByHash(argument);
        if (rsInterface != null) {
            int sourcePid = argument >>> 16;
            RsInterface[] rsInterfaces = Packet.aRsInterfaceArrayArray4123[sourcePid];
            if (rsInterfaces == null) {
                RsInterface[] sourceInterface = RsInterface.anInterfaces[sourcePid];
                int childCount = sourceInterface.length;
                rsInterfaces = Packet.aRsInterfaceArrayArray4123[sourcePid] = new RsInterface[childCount];
                JagStrings.memcpy(sourceInterface, 0, rsInterfaces, 0, sourceInterface.length);
            }
            int argumentSid;
            for (argumentSid = 0; argumentSid < rsInterfaces.length; argumentSid++) {
                if (rsInterfaces[argumentSid] == rsInterface)
                    break;
            }
            if (argumentSid < rsInterfaces.length) {
                JagStrings.memcpy(rsInterfaces, argumentSid + 1, rsInterfaces, argumentSid, rsInterfaces.length - argumentSid - 1);
                rsInterfaces[rsInterfaces.length - 1] = rsInterface;              //Push to back >!>!!>t
            }
        }
    }

    static final void method3656(int argument) {
        if (argument != -1 && RsInterface.isAvailable(argument)) {
            RsInterface[] rsInterfaces = RsInterface.anInterfaces[argument];
            for (int anLocalInt = 0; anLocalInt < rsInterfaces.length; anLocalInt++) {
                RsInterface rsInterface = rsInterfaces[anLocalInt];
                if (rsInterface.anObjectArray1946 != null) {
                    Cs2Trigger trigger = new Cs2Trigger();
                    trigger.aRsInterface_4115 = rsInterface;
                    trigger.parameters = rsInterface.anObjectArray1946;
                    executeTrigger(trigger, 2000000);
                }
            }
        }
    }

    private static void sendChatMessage(String argument) {
        if (Class15.anInt120 != 0 || ((!Class207.aBoolean1485 || Class190.aBoolean1395) && !Class128.aBoolean1042)) {
            String string = argument.toLowerCase();
            int anLocalInt = 0;
            if (string.startsWith(MultilanguageString.YELLOW_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 0;
                argument = argument.substring(MultilanguageString.YELLOW_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.RED_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 1;
                argument = argument.substring(MultilanguageString.RED_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.GREEN_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 2;
                argument = argument.substring(MultilanguageString.GREEN_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.CYAN_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 3;
                argument = argument.substring(MultilanguageString.CYAN_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.PURPLE_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 4;
                argument = argument.substring(MultilanguageString.PURPLE_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.WHITE_CHATCOLOUR.getLocalizedString(0))) {
                anLocalInt = 5;
                argument = argument.substring(MultilanguageString.WHITE_CHATCOLOUR.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.FLASH1_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 6;
                argument = argument.substring(MultilanguageString.FLASH1_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.FLASH2_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 7;
                argument = argument.substring(MultilanguageString.FLASH2_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.FLASH3_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 8;
                argument = argument.substring(MultilanguageString.FLASH3_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.GLOW1_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 9;
                argument = argument.substring(MultilanguageString.GLOW1_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.GLOW2_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 10;
                argument = argument.substring(MultilanguageString.GLOW2_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.GLOW3_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt = 11;
                argument = argument.substring(MultilanguageString.GLOW3_CHATEFFECT.getLocalizedString(0).length());
            } else if (client.language != 0) {
                if (string.startsWith(MultilanguageString.YELLOW_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 0;
                    argument = argument.substring(MultilanguageString.YELLOW_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.RED_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 1;
                    argument = argument.substring(MultilanguageString.RED_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.GREEN_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 2;
                    argument = argument.substring(MultilanguageString.GREEN_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.CYAN_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 3;
                    argument = argument.substring(MultilanguageString.CYAN_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.PURPLE_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 4;
                    argument = argument.substring(MultilanguageString.PURPLE_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.WHITE_CHATCOLOUR.getLocalizedString(client.language))) {
                    anLocalInt = 5;
                    argument = argument.substring(MultilanguageString.WHITE_CHATCOLOUR.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.FLASH1_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 6;
                    argument = argument.substring(MultilanguageString.FLASH1_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.FLASH2_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 7;
                    argument = argument.substring(MultilanguageString.FLASH2_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.FLASH3_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 8;
                    argument = argument.substring(MultilanguageString.FLASH3_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.GLOW1_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 9;
                    argument = argument.substring(MultilanguageString.GLOW1_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.GLOW2_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 10;
                    argument = argument.substring(MultilanguageString.GLOW2_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.GLOW3_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt = 11;
                    argument = argument.substring(MultilanguageString.GLOW3_CHATEFFECT.getLocalizedString(client.language).length());
                }
            }
            string = argument.toLowerCase();
            int anLocalInt_134_ = 0;
            if (string.startsWith(MultilanguageString.WAVE_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt_134_ = 1;
                argument = argument.substring(MultilanguageString.WAVE_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.WAVE2_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt_134_ = 2;
                argument = argument.substring(MultilanguageString.WAVE2_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.SHAKE_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt_134_ = 3;
                argument = argument.substring(MultilanguageString.SHAKE_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.SCROLL_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt_134_ = 4;
                argument = argument.substring(MultilanguageString.SCROLL_CHATEFFECT.getLocalizedString(0).length());
            } else if (string.startsWith(MultilanguageString.SLIDE_CHATEFFECT.getLocalizedString(0))) {
                anLocalInt_134_ = 5;
                argument = argument.substring(MultilanguageString.SLIDE_CHATEFFECT.getLocalizedString(0).length());
            } else if (client.language != 0) {
                if (string.startsWith(MultilanguageString.WAVE_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt_134_ = 1;
                    argument = argument.substring(MultilanguageString.WAVE_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.WAVE2_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt_134_ = 2;
                    argument = argument.substring(MultilanguageString.WAVE2_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.SHAKE_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt_134_ = 3;
                    argument = argument.substring(MultilanguageString.SHAKE_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.SCROLL_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt_134_ = 4;
                    argument = argument.substring(MultilanguageString.SCROLL_CHATEFFECT.getLocalizedString(client.language).length());
                } else if (string.startsWith(MultilanguageString.SLIDE_CHATEFFECT.getLocalizedString(client.language))) {
                    anLocalInt_134_ = 5;
                    argument = argument.substring(MultilanguageString.SLIDE_CHATEFFECT.getLocalizedString(client.language).length());
                }
            }
            Node_Sub29 class59_sub29 = Class91.method1683((byte) 110, Node_Sub31_Sub16.aClass372_5910, Statics.aClass207_6381);
            class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
            int anLocalInt_135_ = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
            class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt);
            class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt_134_);
            Statics.method2599((class59_sub29.aClass59_Sub28_Sub1_4129), argument, (byte) 17);
            class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos - anLocalInt_135_));
            Class251.method3243(class59_sub29, true);
        }
    }

    public static void decompile(int id){
        Cs2Decompiler.decompile(Cs2Script.get(id));
    }

    private static void executeTrigger(Cs2Trigger argument, int argument_136_) {
        Object[] parameters = argument.parameters;
        int anLocalInt = (Integer) parameters[0];
        Cs2Script script = Cs2Script.get(anLocalInt);
        if (script != null) {
            integerLocalVariables = (new int[script.integerVariableCount]);
            int varPointer = 0;
            stringLocalVariables = (new String[script.stringVariableCount]);
            int stringVarPointer = 0;
            longLocalVariables = (new long[script.longVariableCount]);
            int longVarPointer = 0;
            for (int paramPtr = 1; paramPtr < parameters.length; paramPtr++) {
                if (parameters[paramPtr] instanceof Integer) {
                    int value = (Integer) parameters[paramPtr];
                    if (value == 0x80000001)
                        value = argument.anInt4105;
                    if (value == 0x80000002)
                        value = argument.anInt4108;
                    if (value == 0x80000003)
                        value = ((argument.aRsInterface_4115 != null) ? argument.aRsInterface_4115.idHash : -1);
                    if (value == 0x80000004)
                        value = argument.anInt4109;
                    if (value == 0x80000005)
                        value = ((argument.aRsInterface_4115 != null) ? argument.aRsInterface_4115.subId : -1);
                    if (value == 0x80000006)
                        value = ((argument.aRsInterface_4114 != null) ? argument.aRsInterface_4114.idHash : -1);
                    if (value == 0x80000007)
                        value = ((argument.aRsInterface_4114 != null) ? argument.aRsInterface_4114.subId : -1);
                    if (value == 0x80000008)
                        value = argument.anInt4116;
                    if (value == 0x80000009)
                        value = argument.anInt4110;
                    integerLocalVariables[varPointer++] = value;
                } else if (parameters[paramPtr] instanceof String) {
                    String string = (String) parameters[paramPtr];
                    if (string.equals("event_opbase"))
                        string = argument.event_opbase;
                    stringLocalVariables[stringVarPointer++] = string;
                } else if (parameters[paramPtr] instanceof Long) {
                    long l = (Long) parameters[paramPtr];
                    longLocalVariables[longVarPointer++] = l;
                }
            }
            anInt2661 = argument.anInt4112;
            executeScript(script, argument_136_);
        }
    }

    private static int getBitClanSetting(int argument) {
        ClanVarbit clanVarbit = Class111.aClanVarbitSource_916.get(argument);
        if (clanVarbit == null)
            throw new RuntimeException("sr-c113");
        Integer integer = currentClanSettings.getBitSetting(clanVarbit.shift1, clanVarbit.shift2, ((client.selectedGame.id) << 16 | clanVarbit.index));
        if (integer == null)
            return 0;
        return integer;
    }

    private static long getLongClanSetting(int argument) {
        Long var_long = currentClanSettings.getLongSetting((client.selectedGame.id) << 16 | argument);
        if (var_long == null)
            return -1L;
        return var_long;
    }

    private static int getIntClanSetting(int class36id) {
        ClanVarbit clanVarbit = Class111.aClanVarbitSource_916.get(class36id);
        if (clanVarbit == null)
            throw new RuntimeException("sr-c112");
        Integer integer = currentClanSettings.getIntSetting((client.selectedGame.id) << 16 | class36id);
        if (integer == null) {
            if (clanVarbit.type == 'i' || clanVarbit.type == '1')
                return 0;
            return -1;
        }
        return integer;
    }

    static final void empty3662() {
        /* empty */
    }

    private static void method3663(int argument) {
        if (argument < 5100) {
            if (argument == 5000) {
                integerStack[integerStackCounter++] = Class72.anInt495;
                return;
            }
            if (argument == 5001) {
                integerStackCounter -= 3;
                Class72.anInt495 = integerStack[integerStackCounter];
                Class307_Sub1.aClass306_5412 = DoublyLinkedNode_Sub51_Sub18.method1291(integerStack[integerStackCounter + 1], 31);
                if (Class307_Sub1.aClass306_5412 == null)
                    Class307_Sub1.aClass306_5412 = Class41.aClass306_301;
                DoublyLinkedNodeP2_Sub10.anInt4598 = integerStack[integerStackCounter + 2];
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 88, Node_Sub31_Sub16.aClass372_5910, Class84.aClass207_597);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(Class72.anInt495);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(Class307_Sub1.aClass306_5412.anInt2584);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(DoublyLinkedNodeP2_Sub10.anInt4598);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5002) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_144_ = stringStack[stringStackCounter + 1];
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_145_ = integerStack[integerStackCounter + 1];
                if (string_144_ == null)
                    string_144_ = "";
                if (string_144_.length() > 80)
                    string_144_ = string_144_.substring(0, 80);
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 110, Node_Sub31_Sub16.aClass372_5910, Node_Sub32_Sub2.aClass207_6068);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1((JagexStringUtils.strlenp1(string, (byte) 86) + 2 + JagexStringUtils.strlenp1(string_144_, (byte) 104)));
                class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt - 1);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt_145_);
                class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string_144_);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5003) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                String string = "";
                if (class77 != null && class77.aString529 != null)
                    string = class77.aString529;
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5004) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                int anLocalInt_146_ = -1;
                if (class77 != null)
                    anLocalInt_146_ = class77.anInt534;
                integerStack[integerStackCounter++] = anLocalInt_146_;
                return;
            }
            if (argument == 5005) {
                if (Class307_Sub1.aClass306_5412 == null)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = Class307_Sub1.aClass306_5412.anInt2584;
                    return;
                }
                return;
            }
            if (argument == 5006) {
                int anLocalInt = integerStack[--integerStackCounter];
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 118, Node_Sub31_Sub16.aClass372_5910, DoublyLinkedNode_Sub51_Sub1.aClass207_6221);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5008) {
                String string = stringStack[--stringStackCounter];
                sendChatMessage(string);
                return;
            }
            if (argument == 5009) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_147_ = stringStack[stringStackCounter + 1];
                if (Class15.anInt120 != 0 || ((!Class207.aBoolean1485 || Class190.aBoolean1395) && !Class128.aBoolean1042)) {
                    Node_Sub29 class59_sub29 = Class91.method1683((byte) 103, (Node_Sub31_Sub16.aClass372_5910), Statics.aClass207_1276);
                    class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                    int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                    class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                    Statics.method2599((class59_sub29.aClass59_Sub28_Sub1_4129), string_147_, (byte) 17);
                    class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                    Class251.method3243(class59_sub29, true);
                    return;
                }
                return;
            }
            if (argument == 5010) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                String string = "";
                if (class77 != null && class77.aString522 != null)
                    string = class77.aString522;
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5011) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                String string = "";
                if (class77 != null && class77.aString524 != null)
                    string = class77.aString524;
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5012) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                int anLocalInt_148_ = -1;
                if (class77 != null)
                    anLocalInt_148_ = class77.anInt530;
                integerStack[integerStackCounter++] = anLocalInt_148_;
                return;
            }
            if (argument == 5015) {
                String string;
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 != null && (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aString6847) != null)
                    string = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.method1855(true, -1075074040);
                else
                    string = "";
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5016) {
                integerStack[integerStackCounter++] = DoublyLinkedNodeP2_Sub10.anInt4598;
                return;
            }
            if (argument == 5017) {
                integerStack[integerStackCounter++] = Node_Sub16.method700(true);
                return;
            }
            if (argument == 5018) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                int anLocalInt_149_ = 0;
                if (class77 != null)
                    anLocalInt_149_ = class77.anInt527;
                integerStack[integerStackCounter++] = anLocalInt_149_;
                return;
            }
            if (argument == 5019) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                String string = "";
                if (class77 != null && class77.aString531 != null)
                    string = class77.aString531;
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5020) {
                String string;
                if (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587 != null && (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aString6847) != null)
                    string = Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.method1862(false, -12628);
                else
                    string = "";
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5023) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                int anLocalInt_150_ = -1;
                if (class77 != null)
                    anLocalInt_150_ = class77.anInt525;
                integerStack[integerStackCounter++] = anLocalInt_150_;
                return;
            }
            if (argument == 5024) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                int anLocalInt_151_ = -1;
                if (class77 != null)
                    anLocalInt_151_ = class77.anInt528;
                integerStack[integerStackCounter++] = anLocalInt_151_;
                return;
            }
            if (argument == 5025) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class77 class77 = Class2_Sub6.method204(anLocalInt, -4847);
                String string = "";
                if (class77 != null && class77.aString523 != null)
                    string = class77.aString523;
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5050) {
                int anLocalInt = integerStack[--integerStackCounter];
                stringStack[stringStackCounter++] = (Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).aString6257);
                return;
            }
            if (argument == 5051) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub8 class59_sub51_sub8 = Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt);
                if (class59_sub51_sub8.anIntArray6255 == null)
                    integerStack[integerStackCounter++] = 0;
                else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub8.anIntArray6255).length;
                    return;
                }
                return;
            }
            if (argument == 5052) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_152_ = integerStack[integerStackCounter + 1];
                DoublyLinkedNode_Sub51_Sub8 class59_sub51_sub8 = Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt);
                int anLocalInt_153_ = (class59_sub51_sub8.anIntArray6255[anLocalInt_152_]);
                integerStack[integerStackCounter++] = anLocalInt_153_;
                return;
            }
            if (argument == 5053) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub8 class59_sub51_sub8 = Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt);
                if (class59_sub51_sub8.anIntArray6260 == null)
                    integerStack[integerStackCounter++] = 0;
                else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub8.anIntArray6260).length;
                    return;
                }
                return;
            }
            if (argument == 5054) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_154_ = integerStack[integerStackCounter + 1];
                integerStack[integerStackCounter++] = (Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).anIntArray6260[anLocalInt_154_]);
                return;
            }
            if (argument == 5055) {
                int anLocalInt = integerStack[--integerStackCounter];
                stringStack[stringStackCounter++] = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408).method1278(80);
                return;
            }
            if (argument == 5056) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub16 class59_sub51_sub16 = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408);
                if (class59_sub51_sub16.anIntArray6325 == null)
                    integerStack[integerStackCounter++] = 0;
                else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub16.anIntArray6325).length;
                    return;
                }
                return;
            }
            if (argument == 5057) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_155_ = integerStack[integerStackCounter + 1];
                integerStack[integerStackCounter++] = (DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408).anIntArray6325[anLocalInt_155_]);
                return;
            }
            if (argument == 5058) {
                aClass379_2648 = new Class379();
                aClass379_2648.anInt3229 = integerStack[--integerStackCounter];
                aClass379_2648.aClass59_Sub51_Sub16_3226 = (DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(aClass379_2648.anInt3229, 17408));
                aClass379_2648.anIntArray3228 = new int[aClass379_2648.aClass59_Sub51_Sub16_3226.method1276((byte) -26)];
                return;
            }
            if (argument == 5059) {
                anInt2643++;
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 89, Node_Sub31_Sub16.aClass372_5910, Class287.aClass207_2296);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                class59_sub29.aClass59_Sub28_Sub1_4129.p2(aClass379_2648.anInt3229);
                aClass379_2648.aClass59_Sub51_Sub16_3226.method1281(class59_sub29.aClass59_Sub28_Sub1_4129, aClass379_2648.anIntArray3228, 60);
                class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5060) {
                String string = stringStack[--stringStackCounter];
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 108, Node_Sub31_Sub16.aClass372_5910, DoublyLinkedNodeP2_Sub2_Sub1.aClass207_6399);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                class59_sub29.aClass59_Sub28_Sub1_4129.p2(aClass379_2648.anInt3229);
                aClass379_2648.aClass59_Sub51_Sub16_3226.method1281(class59_sub29.aClass59_Sub28_Sub1_4129, aClass379_2648.anIntArray3228, 60);
                class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5061) {
                anInt2643++;
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 54, Node_Sub31_Sub16.aClass372_5910, Class287.aClass207_2296);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(1);
                class59_sub29.aClass59_Sub28_Sub1_4129.p2(aClass379_2648.anInt3229);
                aClass379_2648.aClass59_Sub51_Sub16_3226.method1281(class59_sub29.aClass59_Sub28_Sub1_4129, aClass379_2648.anIntArray3228, 60);
                class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5062) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_156_ = integerStack[integerStackCounter + 1];
                integerStack[integerStackCounter++] = (Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).aCharArray6256[anLocalInt_156_]);
                return;
            }
            if (argument == 5063) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_157_ = integerStack[integerStackCounter + 1];
                integerStack[integerStackCounter++] = (Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).aCharArray6258[anLocalInt_157_]);
                return;
            }
            if (argument == 5064) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_158_ = integerStack[integerStackCounter + 1];
                if (anLocalInt_158_ == -1)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).method1236(-29329, (char) anLocalInt_158_);
                    return;
                }
                return;
            }
            if (argument == 5065) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_159_ = integerStack[integerStackCounter + 1];
                if (anLocalInt_159_ == -1)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = Node_Sub43.aClass316_4220.method3634((byte) -96, anLocalInt).method1230((char) anLocalInt_159_, 95);
                    return;
                }
                return;
            }
            if (argument == 5066) {
                int anLocalInt = integerStack[--integerStackCounter];
                integerStack[integerStackCounter++] = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408).method1276((byte) -26);
                return;
            }
            if (argument == 5067) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_160_ = integerStack[integerStackCounter + 1];
                int anLocalInt_161_ = (DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408).method1283(0, anLocalInt_160_).anInt1524);
                integerStack[integerStackCounter++] = anLocalInt_161_;
                return;
            }
            if (argument == 5068) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_162_ = integerStack[integerStackCounter + 1];
                aClass379_2648.anIntArray3228[anLocalInt] = anLocalInt_162_;
                return;
            }
            if (argument == 5069) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_163_ = integerStack[integerStackCounter + 1];
                aClass379_2648.anIntArray3228[anLocalInt] = anLocalInt_163_;
                return;
            }
            if (argument == 5070) {
                integerStackCounter -= 3;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_164_ = integerStack[integerStackCounter + 1];
                int anLocalInt_165_ = integerStack[integerStackCounter + 2];
                DoublyLinkedNode_Sub51_Sub16 class59_sub51_sub16 = DoublyLinkedNode_Sub51_Sub5.aClass66_6242.method1496(anLocalInt, 17408);
                if (class59_sub51_sub16.method1283(0, anLocalInt_164_).anInt1524 != 0)
                    throw new RuntimeException("bad command");
                integerStack[integerStackCounter++] = class59_sub51_sub16.method1280(anLocalInt_165_, -1, anLocalInt_164_);
                return;
            }
            if (argument == 5071) {
                String string = stringStack[--stringStackCounter];
                boolean anLocalBoolean = integerStack[--integerStackCounter] == 1;
                Node_Sub39.method1072(string, 18123, anLocalBoolean);
                integerStack[integerStackCounter++] = Class62_Sub26.anInt4447;
                return;
            }
            if (argument == 5072) {
                if (Node_Sub47_Sub6.aShortArray6178 == null || Class276.anInt2218 >= Class62_Sub26.anInt4447)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = (Node_Sub47_Sub6.aShortArray6178[Class276.anInt2218++]) & 0xffff;
                    return;
                }
                return;
            }
            if (argument == 5073) {
                Class276.anInt2218 = 0;
                return;
            }
            if (argument == 5074) {
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 40, Node_Sub31_Sub16.aClass372_5910, Class287.aClass207_2296);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(2);
                class59_sub29.aClass59_Sub28_Sub1_4129.p2(aClass379_2648.anInt3229);
                aClass379_2648.aClass59_Sub51_Sub16_3226.method1281(class59_sub29.aClass59_Sub28_Sub1_4129, aClass379_2648.anIntArray3228, 60);
                class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5075) {
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 36, Node_Sub31_Sub16.aClass372_5910, Class287.aClass207_2296);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(0);
                int anLocalInt = (class59_sub29.aClass59_Sub28_Sub1_4129.pos);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(3);
                class59_sub29.aClass59_Sub28_Sub1_4129.p2(aClass379_2648.anInt3229);
                aClass379_2648.aClass59_Sub51_Sub16_3226.method1281(class59_sub29.aClass59_Sub28_Sub1_4129, aClass379_2648.anIntArray3228, 60);
                class59_sub29.aClass59_Sub28_Sub1_4129.psize1((class59_sub29.aClass59_Sub28_Sub1_4129.pos) - anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
        } else if (argument < 5200) {
            if (argument == 5100) {
                if (client.keyHandler.isKeyDown(86))
                    integerStack[integerStackCounter++] = 1;
                else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5101) {
                if (client.keyHandler.isKeyDown(82))
                    integerStack[integerStackCounter++] = 1;
                else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5102) {
                if (client.keyHandler.isKeyDown(81))
                    integerStack[integerStackCounter++] = 1;
                else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
        } else if (argument < 5300) {
            if (argument == 5200) {
                Node_Sub31_Sub23.method948(200, integerStack[--integerStackCounter]);
                return;
            }
            if (argument == 5201) {
                integerStack[integerStackCounter++] = Class99.method1725(65);
                return;
            }
            if (argument == 5205) {
                Class281.method3444(integerStack[--integerStackCounter], -1, -1, false, false);
                return;
            }
            if (argument == 5206) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class179.method2800(anLocalInt >> 14 & 0x3fff, anLocalInt & 0x3fff);
                if (class59_sub51_sub13 == null)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub13.anInt6299);
                    return;
                }
                return;
            }
            if (argument == 5207) {
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class179.method2809(integerStack[--integerStackCounter]);
                if (class59_sub51_sub13 == null || (class59_sub51_sub13.aString6302 == null))
                    stringStack[stringStackCounter++] = "";
                else {
                    stringStack[stringStackCounter++] = (class59_sub51_sub13.aString6302);
                    return;
                }
                return;
            }
            if (argument == 5208) {
                integerStack[integerStackCounter++] = Class42.anInt3542;
                integerStack[integerStackCounter++] = Node_Sub47_Sub5.anInt6172;
                return;
            }
            if (argument == 5209) {
                integerStack[integerStackCounter++] = Node_Sub31_Sub21.anInt5930 + Class179.anInt1353;
                integerStack[integerStackCounter++] = AbstractFont.anInt418 + Class179.anInt1340;
                return;
            }
            if (argument == 5210) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class179.method2809(anLocalInt);
                if (class59_sub51_sub13 == null) {
                    integerStack[integerStackCounter++] = 0;
                    integerStack[integerStackCounter++] = 0;
                } else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub13.anInt6298) >> 14 & 0x3fff;
                    integerStack[integerStackCounter++] = (class59_sub51_sub13.anInt6298) & 0x3fff;
                    return;
                }
                return;
            }
            if (argument == 5211) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class179.method2809(anLocalInt);
                if (class59_sub51_sub13 == null) {
                    integerStack[integerStackCounter++] = 0;
                    integerStack[integerStackCounter++] = 0;
                } else {
                    integerStack[integerStackCounter++] = ((class59_sub51_sub13.anInt6300) - (class59_sub51_sub13.anInt6290));
                    integerStack[integerStackCounter++] = ((class59_sub51_sub13.anInt6301) - (class59_sub51_sub13.anInt6303));
                    return;
                }
                return;
            }
            if (argument == 5212) {
                Node_Sub7 class59_sub7 = Class177.method2790(-63);
                if (class59_sub7 == null) {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = -1;
                } else {
                    integerStack[integerStackCounter++] = class59_sub7.anInt3910;
                    int anLocalInt = (class59_sub7.anInt3912 << 28 | (class59_sub7.anInt3918 + Class179.anInt1353) << 14 | (class59_sub7.anInt3911 + Class179.anInt1340));
                    integerStack[integerStackCounter++] = anLocalInt;
                    return;
                }
                return;
            }
            if (argument == 5213) {
                Node_Sub7 class59_sub7 = Cs2CallStackEntry.method1548(-10100);
                if (class59_sub7 == null) {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = -1;
                } else {
                    integerStack[integerStackCounter++] = class59_sub7.anInt3910;
                    int anLocalInt = (class59_sub7.anInt3912 << 28 | (class59_sub7.anInt3918 + Class179.anInt1353) << 14 | (class59_sub7.anInt3911 + Class179.anInt1340));
                    integerStack[integerStackCounter++] = anLocalInt;
                    return;
                }
                return;
            }
            if (argument == 5214) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class97.method1720(-101);
                if (class59_sub51_sub13 != null) {
                    boolean anLocalBoolean = (class59_sub51_sub13.method1260(-44, anLocalInt & 0x3fff, anLocalInt >> 14 & 0x3fff, anIntArray2658, anLocalInt >> 28 & 0x3));
                    if (anLocalBoolean)
                        Node_Sub31_Sub38.method999(112, anIntArray2658[2], anIntArray2658[1]);
                }
                return;
            }
            if (argument == 5215) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_166_ = integerStack[integerStackCounter + 1];
                DCyclicLinkedList DCyclicLinkedList = Class179.method2821(anLocalInt >> 14 & 0x3fff, anLocalInt & 0x3fff);
                boolean anLocalBoolean = false;
                for (DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = (DoublyLinkedNode_Sub51_Sub13) DCyclicLinkedList.getFirst(); class59_sub51_sub13 != null; class59_sub51_sub13 = (DoublyLinkedNode_Sub51_Sub13) DCyclicLinkedList.getNext()) {
                    if (class59_sub51_sub13.anInt6299 == anLocalInt_166_) {
                        anLocalBoolean = true;
                        break;
                    }
                }
                if (anLocalBoolean)
                    integerStack[integerStackCounter++] = 1;
                else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5218) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class179.method2809(anLocalInt);
                if (class59_sub51_sub13 == null)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = (class59_sub51_sub13.anInt6304);
                    return;
                }
                return;
            }
            if (argument == 5220) {
                integerStack[integerStackCounter++] = Class392.anInt3295 == 100 ? 1 : 0;
                return;
            }
            if (argument == 5221) {
                int anLocalInt = integerStack[--integerStackCounter];
                Node_Sub31_Sub38.method999(108, anLocalInt & 0x3fff, anLocalInt >> 14 & 0x3fff);
                return;
            }
            if (argument == 5222) {
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class97.method1720(-72);
                if (class59_sub51_sub13 != null) {
                    boolean anLocalBoolean = (class59_sub51_sub13.method1268(AbstractFont.anInt418 + Class179.anInt1340, anIntArray2658, Node_Sub31_Sub21.anInt5930 + Class179.anInt1353, (byte) 96));
                    if (anLocalBoolean) {
                        integerStack[integerStackCounter++] = anIntArray2658[1];
                        integerStack[integerStackCounter++] = anIntArray2658[2];
                    } else {
                        integerStack[integerStackCounter++] = -1;
                        integerStack[integerStackCounter++] = -1;
                    }
                } else {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = -1;
                    return;
                }
                return;
            }
            if (argument == 5223) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_167_ = integerStack[integerStackCounter + 1];
                Class281.method3444(anLocalInt, anLocalInt_167_ >> 14 & 0x3fff, anLocalInt_167_ & 0x3fff, false, false);
                return;
            }
            if (argument == 5224) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class97.method1720(-88);
                if (class59_sub51_sub13 != null) {
                    boolean anLocalBoolean = (class59_sub51_sub13.method1260(-110, anLocalInt & 0x3fff, anLocalInt >> 14 & 0x3fff, anIntArray2658, anLocalInt >> 28 & 0x3));
                    if (anLocalBoolean) {
                        integerStack[integerStackCounter++] = anIntArray2658[1];
                        integerStack[integerStackCounter++] = anIntArray2658[2];
                    } else {
                        integerStack[integerStackCounter++] = -1;
                        integerStack[integerStackCounter++] = -1;
                    }
                } else {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = -1;
                    return;
                }
                return;
            }
            if (argument == 5225) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNode_Sub51_Sub13 class59_sub51_sub13 = Class97.method1720(-90);
                if (class59_sub51_sub13 != null) {
                    boolean anLocalBoolean = class59_sub51_sub13.method1268(anLocalInt & 0x3fff, anIntArray2658, (anLocalInt >> 14 & 0x3fff), (byte) -56);
                    if (anLocalBoolean) {
                        integerStack[integerStackCounter++] = anIntArray2658[1];
                        integerStack[integerStackCounter++] = anIntArray2658[2];
                    } else {
                        integerStack[integerStackCounter++] = -1;
                        integerStack[integerStackCounter++] = -1;
                    }
                } else {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = -1;
                    return;
                }
                return;
            }
            if (argument == 5226) {
                Class137.method2461(integerStack[--integerStackCounter], (byte) 51);
                return;
            }
            if (argument == 5227) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_168_ = integerStack[integerStackCounter + 1];
                Class281.method3444(anLocalInt, anLocalInt_168_ >> 14 & 0x3fff, anLocalInt_168_ & 0x3fff, true, false);
                return;
            }
            if (argument == 5228) {
                Class252.aBoolean1978 = integerStack[--integerStackCounter] == 1;
                return;
            }
            if (argument == 5229) {
                integerStack[integerStackCounter++] = Class252.aBoolean1978 ? 1 : 0;
                return;
            }
            if (argument == 5230) {
                int anLocalInt = integerStack[--integerStackCounter];
                DoublyLinkedNodeP2_Sub4_Sub1.method1904(-108, anLocalInt);
                return;
            }
            if (argument == 5231) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                boolean anLocalBoolean = integerStack[integerStackCounter + 1] == 1;
                if (DoublyLinkedNodeP2_Sub2_Sub3.aJagexHashMap_6418 != null) {
                    Node node = DoublyLinkedNodeP2_Sub2_Sub3.aJagexHashMap_6418.get((long) anLocalInt);
                    if (node != null && !anLocalBoolean)
                        node.unlink();
                    else if (node == null && anLocalBoolean) {
                        node = new Node();
                        DoublyLinkedNodeP2_Sub2_Sub3.aJagexHashMap_6418.put((long) anLocalInt, node);
                    }
                }
                return;
            }
            if (argument == 5232) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (DoublyLinkedNodeP2_Sub2_Sub3.aJagexHashMap_6418 != null) {
                    Node node = DoublyLinkedNodeP2_Sub2_Sub3.aJagexHashMap_6418.get((long) anLocalInt);
                    integerStack[integerStackCounter++] = node != null ? 1 : 0;
                } else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5233) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                boolean anLocalBoolean = integerStack[integerStackCounter + 1] == 1;
                if (Statics.aJagexHashMap_4281 != null) {
                    Node node = Statics.aJagexHashMap_4281.get((long) anLocalInt);
                    if (node != null && !anLocalBoolean)
                        node.unlink();
                    else if (node == null && anLocalBoolean) {
                        node = new Node();
                        Statics.aJagexHashMap_4281.put((long) anLocalInt, node);
                    }
                }
                return;
            }
            if (argument == 5234) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (Statics.aJagexHashMap_4281 != null) {
                    Node node = Statics.aJagexHashMap_4281.get((long) anLocalInt);
                    integerStack[integerStackCounter++] = node != null ? 1 : 0;
                } else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5235) {
                integerStack[integerStackCounter++] = (Class179.aClass59_Sub51_Sub13_1320 != null ? Class179.aClass59_Sub51_Sub13_1320.anInt6299 : -1);
                return;
            }
            if (argument == 5236) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_169_ = integerStack[integerStackCounter + 1];
                int anLocalInt_170_ = anLocalInt_169_ >> 14 & 0x3fff;
                int anLocalInt_171_ = anLocalInt_169_ & 0x3fff;
                int anLocalInt_172_ = Class289.method3480(anLocalInt_170_, anLocalInt, anLocalInt_171_, 12835);
                if (anLocalInt_172_ < 0)
                    integerStack[integerStackCounter++] = -1;
                else {
                    integerStack[integerStackCounter++] = anLocalInt_172_;
                    return;
                }
                return;
            }
            if (argument == 5237) {
                Node_Sub23.method744(-86);
                return;
            }
        } else if (argument < 5400) {
            if (argument == 5300) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_173_ = integerStack[integerStackCounter + 1];
                Class127.method2418(anLocalInt, -352753888, 3, anLocalInt_173_, false);
                integerStack[integerStackCounter++] = Applet_Sub1.overridingFrame != null ? 1 : 0;
                return;
            }
            if (argument == 5301) {
                if (Applet_Sub1.overridingFrame != null)
                    Class127.method2418(-1, -352753888, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(47), -1, false);
                return;
            }
            if (argument == 5302) {
                Class259[] class259s = Class30.method359((byte) 108);
                integerStack[integerStackCounter++] = class259s.length;
                return;
            }
            if (argument == 5303) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class259[] class259s = Class30.method359((byte) 68);
                integerStack[integerStackCounter++] = class259s[anLocalInt].anInt2019;
                integerStack[integerStackCounter++] = class259s[anLocalInt].anInt2018;
                return;
            }
            if (argument == 5305) {
                int anLocalInt = Node_Sub9_Sub2.anInt5777;
                int anLocalInt_174_ = Class_aa_Sub1.anInt3750;
                int anLocalInt_175_ = -1;
                Class259[] class259s = Class30.method359((byte) 51);
                for (int anLocalInt_176_ = 0; anLocalInt_176_ < class259s.length; anLocalInt_176_++) {
                    Class259 class259 = class259s[anLocalInt_176_];
                    if (class259.anInt2019 == anLocalInt && (class259.anInt2018 == anLocalInt_174_)) {
                        anLocalInt_175_ = anLocalInt_176_;
                        break;
                    }
                }
                integerStack[integerStackCounter++] = anLocalInt_175_;
                return;
            }
            if (argument == 5306) {
                integerStack[integerStackCounter++] = DoublyLinkedNode_Sub51_Sub13.method1262(98);
                return;
            }
            if (argument == 5307) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt >= 1 && anLocalInt <= 2) {
                    Class127.method2418(-1, -352753888, anLocalInt, -1, false);
                    return;
                }
                return;
            }
            if (argument == 5308) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(113);
                return;
            }
            if (argument == 5309) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt >= 1 && anLocalInt <= 2) {
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300), 93);
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4302), 87);
                    Class251.method3240(false);
                    return;
                }
                return;
            }
        } else if (argument < 5500) {
            if (argument == 5400) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_177_ = stringStack[stringStackCounter + 1];
                int anLocalInt = integerStack[--integerStackCounter];
                Node_Sub29 class59_sub29 = Class91.method1683((byte) 43, Node_Sub31_Sub16.aClass372_5910, Statics.aClass207_5576);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1((JagexStringUtils.strlenp1(string, (byte) 91) + JagexStringUtils.strlenp1(string_177_, (byte) 73) + 1));
                class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string);
                class59_sub29.aClass59_Sub28_Sub1_4129.pjstr(string_177_);
                class59_sub29.aClass59_Sub28_Sub1_4129.p1(anLocalInt);
                Class251.method3243(class59_sub29, true);
                return;
            }
            if (argument == 5401) {
                integerStackCounter -= 2;
                Class_aa_Sub2.aShortArray3754[integerStack[integerStackCounter]] = (short) Class128.method2422((integerStack[integerStackCounter + 1]), 20973);
                Class253_Sub1_Sub1.aClass365_6632.method3980((byte) 108);
                Class253_Sub1_Sub1.aClass365_6632.method3977(122);
                DiskBackedCache.aClass26_2709.method345((byte) -31);
                Class305.method3596(0);
                return;
            }
            if (argument == 5405) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_178_ = integerStack[integerStackCounter + 1];
                if (anLocalInt >= 0 && anLocalInt < 2)
                    Class164.anIntArrayArrayArray1198[anLocalInt] = new int[anLocalInt_178_ << 1][4];
                return;
            }
            if (argument == 5406) {
                integerStackCounter -= 7;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_179_ = integerStack[integerStackCounter + 1] << 1;
                int anLocalInt_180_ = integerStack[integerStackCounter + 2];
                int anLocalInt_181_ = integerStack[integerStackCounter + 3];
                int anLocalInt_182_ = integerStack[integerStackCounter + 4];
                int anLocalInt_183_ = integerStack[integerStackCounter + 5];
                int anLocalInt_184_ = integerStack[integerStackCounter + 6];
                if (anLocalInt >= 0 && anLocalInt < 2 && Class164.anIntArrayArrayArray1198[anLocalInt] != null && anLocalInt_179_ >= 0 && anLocalInt_179_ < (Class164.anIntArrayArrayArray1198[anLocalInt]).length) {
                    Class164.anIntArrayArrayArray1198[anLocalInt][anLocalInt_179_] = new int[]{(anLocalInt_180_ >> 14 & 0x3fff) << 9, anLocalInt_181_ << 2, (anLocalInt_180_ & 0x3fff) << 9, anLocalInt_184_};
                    Class164.anIntArrayArrayArray1198[anLocalInt][anLocalInt_179_ + 1] = new int[]{(anLocalInt_182_ >> 14 & 0x3fff) << 9, anLocalInt_183_ << 2, (anLocalInt_182_ & 0x3fff) << 9};
                }
                return;
            }
            if (argument == 5407) {
                int anLocalInt = ((Class164.anIntArrayArrayArray1198[integerStack[--integerStackCounter]]).length >> 1);
                integerStack[integerStackCounter++] = anLocalInt;
                return;
            }
            if (argument == 5411) {
                if (Applet_Sub1.overridingFrame != null)
                    Class127.method2418(-1, -352753888, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(57), -1, false);
                if (Applet_Sub1.gameFrame != null) {
                    Node_Sub47_Sub7.method1130((byte) 9);
                    System.exit(0);
                } else {
                    String string = (client.quitURL != null ? client.quitURL : Class182.method2847((byte) 124));
                    Class127.method2416(AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(43) == 1, -22283, false, string, Applet_Sub1.baseSignlink);
                    return;
                }
                return;
            }
            if (argument == 5419) {
                String string = "";
                if (Class62_Sub2.aSignlinkRequest_4365 != null) {
                    if (Class62_Sub2.aSignlinkRequest_4365.result != null)
                        string = (String) Class62_Sub2.aSignlinkRequest_4365.result;
                    else
                        string = Statics.formatIP((Class62_Sub2.aSignlinkRequest_4365.intParameter1));
                }
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5420) {
                integerStack[integerStackCounter++] = (Applet_Sub1.baseSignlink.useCache ? 0 : 1);
                return;
            }
            if (argument == 5421) {
                if (Applet_Sub1.overridingFrame != null)
                    Class127.method2418(-1, -352753888, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub4_4300.method1368(63), -1, false);
                String string = stringStack[--stringStackCounter];
                boolean anLocalBoolean = integerStack[--integerStackCounter] == 1;
                String string_185_ = Class182.method2847((byte) 122) + string;
                Class127.method2416((AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(50) == 1), -22283, anLocalBoolean, string_185_, Applet_Sub1.baseSignlink);
                return;
            }
            if (argument == 5422) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_186_ = stringStack[stringStackCounter + 1];
                int anLocalInt = integerStack[--integerStackCounter];
                if (string.length() > 0) {
                    if (Class130.aStringArray1050 == null)
                        Class130.aStringArray1050 = new String[(Class185.anIntArray1382[(client.selectedGame.id)])];
                    Class130.aStringArray1050[anLocalInt] = string;
                }
                if (string_186_.length() > 0) {
                    if (Class62_Sub4.aStringArray4378 == null)
                        Class62_Sub4.aStringArray4378 = new String[(Class185.anIntArray1382[(client.selectedGame.id)])];
                    Class62_Sub4.aStringArray4378[anLocalInt] = string_186_;
                }
                return;
            }
            if (argument == 5423) {
                System.out.println(stringStack[--stringStackCounter]);
                return;
            }
            if (argument == 5424) {
                integerStackCounter -= 11;
                Class245_Sub1.anInt5302 = integerStack[integerStackCounter];
                Node_Sub37.anInt4165 = integerStack[integerStackCounter + 1];
                Class301.anInt2528 = integerStack[integerStackCounter + 2];
                Class9.anInt84 = integerStack[integerStackCounter + 3];
                Class350.anInt2928 = integerStack[integerStackCounter + 4];
                Node_Sub47_Sub5.anInt6173 = integerStack[integerStackCounter + 5];
                Class73.anInt501 = integerStack[integerStackCounter + 6];
                Class62_Sub23.anInt4437 = integerStack[integerStackCounter + 7];
                Class62_Sub14.anInt4411 = integerStack[integerStackCounter + 8];
                Class93.anInt716 = integerStack[integerStackCounter + 9];
                DxSkybox.anInt4472 = integerStack[integerStackCounter + 10];
                Class205.aJs5Store_1472.isFlatFile(Class350.anInt2928);
                Class205.aJs5Store_1472.isFlatFile(Node_Sub47_Sub5.anInt6173);
                Class205.aJs5Store_1472.isFlatFile(Class73.anInt501);
                Class205.aJs5Store_1472.isFlatFile(Class62_Sub23.anInt4437);
                Class205.aJs5Store_1472.isFlatFile(Class62_Sub14.anInt4411);
                Class195.aClass368_1431 = Node_Sub47_Sub3.aClass368_6163 = Class162.aClass368_1187 = null;
                Statics.aClass368_6450 = Class178.aClass368_1312 = Class361.aClass368_3054 = null;
                Node_Sub32_Sub3.aClass368_6080 = Class178.aClass368_1314 = null;
                Class344.aBoolean3593 = true;
                return;
            }
            if (argument == 5425) {
                Statics.method457((byte) 95);
                Class344.aBoolean3593 = false;
                return;
            }
            if (argument == 5426) {
                integerStackCounter -= 2;
                Class350_Sub3.anInt5468 = integerStack[integerStackCounter];
                Class133_Sub2.anInt5017 = integerStack[integerStackCounter + 1];
                return;
            }
            if (argument == 5427) {
                integerStackCounter -= 2;
                DoublyLinkedNode_Sub51_Sub3.anInt6235 = integerStack[integerStackCounter + 1];
                return;
            }
            if (argument == 5428) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_187_ = integerStack[integerStackCounter + 1];
                integerStack[integerStackCounter++] = (Statics.method3356(anLocalInt_187_, 28649, anLocalInt) ? 1 : 0);
                return;
            }
            if (argument == 5429) {
                Class207.method2948(stringStack[--stringStackCounter], false, false, -1);
                return;
            }
            if (argument == 5430) {
                try {
                    Class328.method3698(Signlink.mainapp, "accountcreated", (byte) 117);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (argument == 5431) {
                try {
                    Class328.method3698(Signlink.mainapp, "accountcreatestarted", (byte) 126);
                } catch (Throwable throwable) {
                    /* empty */
                }
                return;
            }
            if (argument == 5432) {
                String string = "";
                if (client.clipboard != null) {
                    Transferable transferable = client.clipboard.getContents(null);
                    if (transferable != null) {
                        try {
                            string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
                            if (string == null)
                                string = "";
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                }
                stringStack[stringStackCounter++] = string;
                return;
            }
            if (argument == 5433) {
                Statics.anInt4835 = integerStack[--integerStackCounter];
                return;
            }
            if (argument == 5435) {
                integerStack[integerStackCounter++] = Applet_Sub1.useJavaScript ? 1 : 0;
                return;
            }
        } else if (argument < 5600) {
            if (argument == 5500) {
                integerStackCounter -= 4;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_188_ = integerStack[integerStackCounter + 1];
                int anLocalInt_189_ = integerStack[integerStackCounter + 2];
                int anLocalInt_190_ = integerStack[integerStackCounter + 3];
                Class243.method3159(false, ((anLocalInt >> 14 & 0x3fff) - MapRelated.baseX), false, (anLocalInt & 0x3fff) - MapRelated.baseZ, anLocalInt_189_, anLocalInt_188_ << 2, anLocalInt_190_);
                return;
            }
            if (argument == 5501) {
                integerStackCounter -= 4;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_191_ = integerStack[integerStackCounter + 1];
                int anLocalInt_192_ = integerStack[integerStackCounter + 2];
                int anLocalInt_193_ = integerStack[integerStackCounter + 3];
                Class217.method3012(anLocalInt_193_, ((anLocalInt >> 14 & 0x3fff) - MapRelated.baseX), (anLocalInt & 0x3fff) - MapRelated.baseZ, anLocalInt_192_, anLocalInt_191_ << 2, -28384);
                return;
            }
            if (argument == 5502) {
                integerStackCounter -= 6;
                int anLocalInt = integerStack[integerStackCounter];
                if (anLocalInt >= 2)
                    throw new RuntimeException();
                Class146.anInt1111 = anLocalInt;
                int anLocalInt_194_ = integerStack[integerStackCounter + 1];
                if (anLocalInt_194_ + 1 >= (Class164.anIntArrayArrayArray1198[Class146.anInt1111]).length >> 1)
                    throw new RuntimeException();
                DoublyLinkedNode_Sub51_Sub19.anInt6354 = anLocalInt_194_;
                Statics.anInt1081 = 0;
                DoublyLinkedNodeP2_Sub4_Sub1.anInt6433 = integerStack[integerStackCounter + 2];
                Node_Sub47_Sub11.anInt6209 = integerStack[integerStackCounter + 3];
                int anLocalInt_195_ = integerStack[integerStackCounter + 4];
                if (anLocalInt_195_ >= 2)
                    throw new RuntimeException();
                Class76.anInt516 = anLocalInt_195_;
                int anLocalInt_196_ = integerStack[integerStackCounter + 5];
                if (anLocalInt_196_ + 1 >= (Class164.anIntArrayArrayArray1198[Class76.anInt516]).length >> 1)
                    throw new RuntimeException();
                Class137.anInt1084 = anLocalInt_196_;
                Statics.anInt1745 = 3;
                DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
                return;
            }
            if (argument == 5503) {
                Class80.method1586(27315);
                return;
            }
            if (argument == 5504) {
                integerStackCounter -= 2;
                Node_Sub6.method560(integerStack[integerStackCounter], 0, integerStack[integerStackCounter + 1], false);
                return;
            }
            if (argument == 5505) {
                integerStack[integerStackCounter++] = (int) DoublyLinkedNodeP2_Sub2_Sub2_Sub3.aFloat6623 >> 3;
                return;
            }
            if (argument == 5506) {
                integerStack[integerStackCounter++] = (int) DoublyLinkedNodeP2_Sub6.aFloat4538 >> 3;
                return;
            }
            if (argument == 5507) {
                Class222_Sub2.method3036(-1);
                return;
            }
            if (argument == 5508) {
                Class193.method2889(121);
                return;
            }
            if (argument == 5509) {
                Statics.method1797(6817);
                return;
            }
            if (argument == 5510) {
                Class25.method341(-1);
                return;
            }
            if (argument == 5511) {
                int anLocalInt = integerStack[--integerStackCounter];
                int anLocalInt_197_ = anLocalInt >> 14 & 0x3fff;
                int anLocalInt_198_ = anLocalInt & 0x3fff;
                anLocalInt_197_ -= MapRelated.baseX;
                if (anLocalInt_197_ < 0)
                    anLocalInt_197_ = 0;
                else if (anLocalInt_197_ >= MapRelated.mapWidth)
                    anLocalInt_197_ = MapRelated.mapWidth;
                anLocalInt_198_ -= MapRelated.baseZ;
                if (anLocalInt_198_ < 0)
                    anLocalInt_198_ = 0;
                else if (anLocalInt_198_ >= MapRelated.mapDepth)
                    anLocalInt_198_ = MapRelated.mapDepth;
                Class167.anInt1224 = (anLocalInt_197_ << 9) + 256;
                Class61.anInt437 = (anLocalInt_198_ << 9) + 256;
                Statics.anInt1745 = 4;
                DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = Class85.anInt607 = -1;
                return;
            }
            if (argument == 5512) {
                tia_sub_35_Sub1DoublyLinked.method1222((byte) -44);
                return;
            }
            if (argument == 5514) {
                Class390.anInt3284 = integerStack[--integerStackCounter];
                return;
            }
            if (argument == 5516) {
                integerStack[integerStackCounter++] = Class390.anInt3284;
                return;
            }
            if (argument == 5517) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt == -1) {
                    int anLocalInt_199_ = anLocalInt >> 14 & 0x3fff;
                    int anLocalInt_200_ = anLocalInt & 0x3fff;
                    anLocalInt_199_ -= MapRelated.baseX;
                    if (anLocalInt_199_ < 0)
                        anLocalInt_199_ = 0;
                    else if (anLocalInt_199_ >= MapRelated.mapWidth)
                        anLocalInt_199_ = MapRelated.mapWidth;
                    anLocalInt_200_ -= MapRelated.baseZ;
                    if (anLocalInt_200_ < 0)
                        anLocalInt_200_ = 0;
                    else if (anLocalInt_200_ >= MapRelated.mapDepth)
                        anLocalInt_200_ = MapRelated.mapDepth;
                    DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = (anLocalInt_199_ << 9) + 256;
                    Class85.anInt607 = (anLocalInt_200_ << 9) + 256;
                } else {
                    DoublyLinkedNodeP2_Sub2_Sub4_Sub1.anInt6573 = -1;
                    Class85.anInt607 = -1;
                    return;
                }
                return;
            }
        } else if (argument < 5700) {
            if (argument == 5600) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_201_ = stringStack[stringStackCounter + 1];
                int anLocalInt = integerStack[--integerStackCounter];
                Class366.method3991(string_201_, anLocalInt, 6, string);
                return;
            }
            if (argument == 5601) {
                Class62_Sub14.method1409((byte) -122);
                return;
            }
            if (argument == 5602) {
                if (!Class303.method3574(-1))
                    Class126.method2407((byte) -109);
                return;
            }
            if (argument == 5604) {
                stringStackCounter--;
                if (Statics.anInt1652 == 3 && (!Class303.method3574(-1) && Class245.anInt1784 == 0)) {
                    Node_Sub37.method1056(stringStack[stringStackCounter], 28690);
                    return;
                }
                return;
            }
            if (argument == 5605) {
                stringStackCounter -= 2;
                integerStackCounter -= 2;
                if (Statics.anInt1652 == 3 && (!Class303.method3574(-1) && Class245.anInt1784 == 0)) {
                    Class234.method3111(integerStack[integerStackCounter], integerStack[integerStackCounter + 1] == 1, (byte) -91, stringStack[stringStackCounter + 1], stringStack[stringStackCounter]);
                    return;
                }
                return;
            }
            if (argument == 5606) {
                if (Class245.anInt1784 == 0)
                    MenuAction.anInt6282 = -2;
                return;
            }
            if (argument == 5607) {
                integerStack[integerStackCounter++] = Node_Sub47.anInt4283;
                return;
            }
            if (argument == 5608) {
                integerStack[integerStackCounter++] = Class245_Sub1_Sub1.anInt6513;
                return;
            }
            if (argument == 5609) {
                integerStack[integerStackCounter++] = MenuAction.anInt6282;
                return;
            }
            if (argument == 5611) {
                integerStack[integerStackCounter++] = Node_Sub16.anInt3995;
                return;
            }
            if (argument == 5612) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class353.method3888(anLocalInt, -2030);
                return;
            }
            if (argument == 5613) {
                integerStack[integerStackCounter++] = Node_Sub47.anInt4283;
                return;
            }
            if (argument == 5615) {
                stringStackCounter -= 2;
                String string = stringStack[stringStackCounter];
                String string_202_ = stringStack[stringStackCounter + 1];
                Class62_Sub25.method1457(string_202_, (byte) 123, string);
                return;
            }
            if (argument == 5616) {
                Class44.method429(92, false);
                return;
            }
            if (argument == 5617) {
                integerStack[integerStackCounter++] = Class264.anInt2046;
                return;
            }
            if (argument == 5618) {
                integerStackCounter--;
                return;
            }
            if (argument == 5619) {
                integerStackCounter--;
                return;
            }
            if (argument == 5620) {
                integerStack[integerStackCounter++] = 0;
                return;
            }
            if (argument == 5621) {
                stringStackCounter -= 2;
                integerStackCounter -= 2;
                return;
            }
            if (argument == 5622)
                return;
            if (argument == 5623) {
                if (Class201.aByteArray1448 != null)
                    integerStack[integerStackCounter++] = 1;
                else {
                    integerStack[integerStackCounter++] = 0;
                    return;
                }
                return;
            }
            if (argument == 5624) {
                integerStack[integerStackCounter++] = (int) (client.userFlow >> 32);
                integerStack[integerStackCounter++] = (int) (client.userFlow & 0xffffffffffffffffL);
                return;
            }
            if (argument == 5625) {
                integerStack[integerStackCounter++] = client.aBoolean2950 ? 1 : 0;
                return;
            }
            if (argument == 5626) {
                client.aBoolean2950 = true;
                Statics.method3465((byte) -105);
                return;
            }
            if (argument == 5628) {
                integerStack[integerStackCounter++] = Class303.method3574(-1) ? 1 : 0;
                return;
            }
            if (argument == 5630) {
                Class368_Sub3.method4042((byte) 126);
                return;
            }
            if (argument == 5631) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_203_ = integerStack[integerStackCounter + 1];
                Class62_Sub11.method1398(anLocalInt_203_, anLocalInt, 123);
                return;
            }
            if (argument == 5632) {
                int anLocalInt = integerStack[--integerStackCounter];
                Node_Sub16.method701(8, anLocalInt);
                return;
            }
        } else if (argument < 6100) {
            if (argument == 6001) {
                int anLocalInt = integerStack[--integerStackCounter];
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub11_4301), 97);
                Class109_Sub1.method1985(-77);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6002) {
                boolean anLocalBoolean = integerStack[--integerStackCounter] == 1;
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalBoolean ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4321), 120);
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalBoolean ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332), 76);
                Class109_Sub1.method1985(-99);
                Node_Sub31_Sub1.method875(-4);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6003) {
                boolean anLocalBoolean = integerStack[--integerStackCounter] == 1;
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalBoolean ? 2 : 1, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub29_4310), 73);
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalBoolean ? 2 : 1, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub29_4328), 113);
                Node_Sub31_Sub1.method875(-4);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6005) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307), 90);
                Class109_Sub1.method1985(-44);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6007) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub24_4299), 92);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6008) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub18_4304), 94);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6010) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub27_4330), 93);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6011) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331), 113);
                Class109_Sub1.method1985(-37);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6012) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub16_4308), 105);
                Class353_Sub2.method3896(false);
                Class120.method2385((byte) 66);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6014) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 2 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334), 76);
                Class109_Sub1.method1985(-115);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6015) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub13_4329), 101);
                Class109_Sub1.method1985(-83);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6016) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4296), 95);
                Class215.method2991((byte) -41, false, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(72));
                Class251.method3240(false);
                return;
            }
            if (argument == 6017) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub12_4313), 78);
                Statics.method1762(1);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6018) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4298), 93);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6019) {
                int anLocalInt = integerStack[--integerStackCounter];
                int anLocalInt_204_ = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4319.method1446(115);
                if (anLocalInt != anLocalInt_204_) {
                    if (Class230.method3070(true, Statics.anInt1652)) {
                        if (anLocalInt_204_ == 0 && Statics.anInt3514 != -1) {
                            Statics.method545(false, Statics.anInt3514, anLocalInt, 0, Class341.aJs5Store_2881, (byte) -65);
                            Node_Sub49.method1149(0);
                            Class154.aBoolean3618 = false;
                        } else if (anLocalInt == 0) {
                            Class88.method1643(0);
                            Class154.aBoolean3618 = false;
                        } else
                            Node_Sub50.method1168(true, anLocalInt);
                    }
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4319), 119);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                }
                return;
            }
            if (argument == 6020) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4303), 84);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6021) {
                int anLocalInt = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub29_4310.method1477(125);
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 0 : anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub29_4328), 126);
                Node_Sub31_Sub1.method875(-4);
                return;
            }
            if (argument == 6023) {
                int anLocalInt = integerStack[--integerStackCounter];
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub1_4297), 102);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6024) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4317), 101);
                Class251.method3240(false);
                return;
            }
            if (argument == 6025) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub5_4314), 71);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6027) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt < 0 || anLocalInt > 1)
                    anLocalInt = 0;
                dba_sub_772_Sub2.method1315((byte) -31, anLocalInt == 1);
                return;
            }
            if (argument == 6028) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] != 0 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub28_4305), 74);
                Class251.method3240(false);
                return;
            }
            if (argument == 6029) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub24_4299), 101);
                Class251.method3240(false);
                return;
            }
            if (argument == 6030) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] != 0 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub3_4318), 107);
                Class251.method3240(false);
                Class109_Sub1.method1985(-65);
                return;
            }
            if (argument == 6031) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt < 0 || anLocalInt > 5)
                    anLocalInt = 2;
                Class215.method2991((byte) -41, false, anLocalInt);
                return;
            }
            if (argument == 6032) {
                integerStackCounter -= 2;
                int anLocalInt = integerStack[integerStackCounter];
                boolean anLocalBoolean = integerStack[integerStackCounter + 1] == 1;
                AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316), 126);
                if (!anLocalBoolean)
                    AthmosphericConditions.aClass59_Sub50_116.method1159(0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub21_4326), 79);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6033) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub17_4320), 120);
                Class251.method3240(false);
                return;
            }
            if (argument == 6034) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : 0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323), 79);
                Class251.method3240(false);
                Class353_Sub2.method3896(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6035) {
                int anLocalInt = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4321.method1458(85);
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter] == 1 ? 1 : anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332), 86);
                Class109_Sub1.method1985(-68);
                Node_Sub31_Sub1.method875(-4);
                return;
            }
            if (argument == 6036) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub23_4311), 98);
                Class251.method3240(false);
                Node_Sub50.aBoolean4325 = true;
                return;
            }
            if (argument == 6037) {
                AthmosphericConditions.aClass59_Sub50_116.method1159(integerStack[--integerStackCounter], (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4333), 119);
                Class251.method3240(false);
                Class152.aBoolean1149 = false;
                return;
            }
            if (argument == 6038) {
                int anLocalInt = integerStack[--integerStackCounter];
                int anLocalInt_205_ = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4324.method1446(57);
                if (anLocalInt != anLocalInt_205_ && Statics.anInt3514 == Statics.anInt472) {
                    if (!Class230.method3070(true, Statics.anInt1652)) {
                        if (anLocalInt_205_ == 0) {
                            Statics.method545(false, Statics.anInt3514, anLocalInt, 0, Class341.aJs5Store_2881, (byte) -65);
                            Node_Sub49.method1149(0);
                            Class154.aBoolean3618 = false;
                        } else if (anLocalInt == 0) {
                            Class88.method1643(0);
                            Class154.aBoolean3618 = false;
                        } else
                            Node_Sub50.method1168(true, anLocalInt);
                    }
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4324), 100);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                }
                return;
            }
            if (argument == 6039) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt > 255 || anLocalInt < 0)
                    anLocalInt = 0;
                if (anLocalInt != AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub9_4309.method1392(42)) {
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub9_4309), 94);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                }
                return;
            }
            if (argument == 6040) {
                int anLocalInt = integerStack[--integerStackCounter];
                if (anLocalInt != AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub10_4335.method1393(26)) {
                    AthmosphericConditions.aClass59_Sub50_116.method1159(anLocalInt, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub10_4335), 105);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    Node_Sub38.method1067(71);
                }
                return;
            }
        } else if (argument < 6200) {
            if (argument == 6101) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub11_4301.getAnInt441();
                return;
            }
            if (argument == 6102) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4321.method1458(87) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6103) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub29_4310.method1477(73) == 2 ? 1 : 0;
                return;
            }
            if (argument == 6105) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307.method1384(85) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6107) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub24_4299.method1451(107);
                return;
            }
            if (argument == 6108) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub18_4304.method1427(127) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6110) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub27_4330.method1467(29) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6111) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331.method1388(104);
                return;
            }
            if (argument == 6112) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub16_4308.method1421(124) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6114) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1435(11) == 2 ? 1 : 0;
                return;
            }
            if (argument == 6115) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub13_4329.method1405(69) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6116) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4296.method1377(32);
                return;
            }
            if (argument == 6117) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub12_4313.method1401(79) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6118) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4298.method1446(47);
                return;
            }
            if (argument == 6119) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4319.method1446(53);
                return;
            }
            if (argument == 6120) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4303.method1446(42);
                return;
            }
            if (argument == 6123) {
                integerStack[integerStackCounter++] = Class285.method3460(113);
                return;
            }
            if (argument == 6124) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4317.method1377(81);
                return;
            }
            if (argument == 6125) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub5_4314.method1371(10);
                return;
            }
            if (argument == 6127) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub14_4327.method1414(13) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6128) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub28_4305.method1470(95) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6129) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub24_4299.method1451(112);
                return;
            }
            if (argument == 6130) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub3_4318.method1365(47) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6131) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(71);
                return;
            }
            if (argument == 6132) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316.method1464(23);
                return;
            }
            if (argument == 6133) {
                integerStack[integerStackCounter++] = ((Applet_Sub1.baseSignlink.useCache && !Applet_Sub1.baseSignlink.useWin32) ? 1 : 0);
                return;
            }
            if (argument == 6135) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub17_4320.method1422(69);
                return;
            }
            if (argument == 6136) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1432(112) == 1 ? 1 : 0;
                return;
            }
            if (argument == 6138) {
                integerStack[integerStackCounter++] = Class51.method470(200, (byte) 28, AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(48));
                return;
            }
            if (argument == 6139) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub23_4311.method1449(112);
                return;
            }
            if (argument == 6142) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4333.method1446(9);
                return;
            }
            if (argument == 6143) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub22_4324.method1446(65);
                return;
            }
            if (argument == 6144) {
                integerStack[integerStackCounter++] = Statics.aBoolean6373 ? 1 : 0;
                return;
            }
            if (argument == 6145) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub9_4309.method1392(122);
                return;
            }
            if (argument == 6146) {
                integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub10_4335.method1393(76);
                return;
            }
            if (argument == 6147) {
                integerStack[integerStackCounter++] = ((Statics.aClass59_Sub44_1064.anInt4246) < 512 || Statics.aBoolean6373 || Class178.aBoolean1316) ? 1 : 0;
                return;
            }
            if (argument == 6148) {
                integerStack[integerStackCounter++] = GlInterleavedArray.aBoolean3224 ? 1 : 0;
                return;
            }
        } else if (argument < 6300) {
            if (argument == 6200) {
                integerStackCounter -= 2;
                Class350_Sub1.aShort5435 = (short) integerStack[integerStackCounter];
                if (Class350_Sub1.aShort5435 <= 0)
                    Class350_Sub1.aShort5435 = (short) 256;
                ClanSettingsDelta.aShort1547 = (short) integerStack[integerStackCounter + 1];
                if (ClanSettingsDelta.aShort1547 <= 0)
                    ClanSettingsDelta.aShort1547 = (short) 205;
                return;
            }
            if (argument == 6201) {
                integerStackCounter -= 2;
                Class25.aShort165 = (short) integerStack[integerStackCounter];
                if (Class25.aShort165 <= 0)
                    Class25.aShort165 = (short) 256;
                Class245_Sub1_Sub1.aShort6515 = (short) integerStack[integerStackCounter + 1];
                if (Class245_Sub1_Sub1.aShort6515 <= 0)
                    Class245_Sub1_Sub1.aShort6515 = (short) 320;
                return;
            }
            if (argument == 6202) {
                integerStackCounter -= 4;
                Node_Sub32_Sub4.aShort6094 = (short) integerStack[integerStackCounter];
                if (Node_Sub32_Sub4.aShort6094 <= 0)
                    Node_Sub32_Sub4.aShort6094 = (short) 1;
                Class276.aShort2216 = (short) integerStack[integerStackCounter + 1];
                if (Class276.aShort2216 <= 0)
                    Class276.aShort2216 = (short) 32767;
                else if (Class276.aShort2216 < Node_Sub32_Sub4.aShort6094)
                    Class276.aShort2216 = Node_Sub32_Sub4.aShort6094;
                Class308.aShort2586 = (short) integerStack[integerStackCounter + 2];
                if (Class308.aShort2586 <= 0)
                    Class308.aShort2586 = (short) 1;
                Class62_Sub18.aShort4424 = (short) integerStack[integerStackCounter + 3];
                if (Class62_Sub18.aShort4424 <= 0)
                    Class62_Sub18.aShort4424 = (short) 32767;
                else {
                    if (Class62_Sub18.aShort4424 < Class308.aShort2586)
                        Class62_Sub18.aShort4424 = Class308.aShort2586;
                    return;
                }
                return;
            }
            if (argument == 6203) {
                Class111.method1990((Class133.aRsInterface_1065.renderWidth), (Class133.aRsInterface_1065.renderHeight), 6680, 0, 0, false);
                integerStack[integerStackCounter++] = Class127.anInt1038;
                integerStack[integerStackCounter++] = Class287.anInt2297;
                return;
            }
            if (argument == 6204) {
                integerStack[integerStackCounter++] = Class25.aShort165;
                integerStack[integerStackCounter++] = Class245_Sub1_Sub1.aShort6515;
                return;
            }
            if (argument == 6205) {
                integerStack[integerStackCounter++] = Class350_Sub1.aShort5435;
                integerStack[integerStackCounter++] = ClanSettingsDelta.aShort1547;
                return;
            }
        } else if (argument < 6400) {
            if (argument == 6300) {
                integerStack[integerStackCounter++] = (int) (Applet_Sub1.getGameTime() / 60000L);
                return;
            }
            if (argument == 6301) {
                integerStack[integerStackCounter++] = (int) (Applet_Sub1.getGameTime() / 86400000L) - 11745;
                return;
            }
            if (argument == 6302) {
                integerStackCounter -= 3;
                int anLocalInt = integerStack[integerStackCounter];
                int anLocalInt_206_ = integerStack[integerStackCounter + 1];
                int anLocalInt_207_ = integerStack[integerStackCounter + 2];
                long l = Class_s_Sub2.method3551(anLocalInt_206_, 0, 12, anLocalInt, anLocalInt_207_, 0, 0);
                int anLocalInt_208_ = Class91.method1686(l, (byte) 91);
                if (anLocalInt_207_ < 1970)
                    anLocalInt_208_--;
                integerStack[integerStackCounter++] = anLocalInt_208_;
                return;
            }
            if (argument == 6303) {
                integerStack[integerStackCounter++] = Class91.method1687(127, Applet_Sub1.getGameTime());
                return;
            }
            if (argument == 6304) {
                int anLocalInt = integerStack[--integerStackCounter];
                boolean anLocalBoolean = true;
                if (anLocalInt < 0)
                    anLocalBoolean = (anLocalInt + 1) % 4 == 0;
                else if (anLocalInt < 1582)
                    anLocalBoolean = anLocalInt % 4 == 0;
                else if (anLocalInt % 4 != 0)
                    anLocalBoolean = false;
                else if (anLocalInt % 100 != 0)
                    anLocalBoolean = true;
                else if (anLocalInt % 400 != 0)
                    anLocalBoolean = false;
                integerStack[integerStackCounter++] = anLocalBoolean ? 1 : 0;
                return;
            }
            if (argument == 6305) {
                int anLocalInt = integerStack[--integerStackCounter];
                int[] anLocalInts = Statics.method3646((byte) 92, anLocalInt);
                JagStrings.memcpy(anLocalInts, 0, integerStack, integerStackCounter, 3);
                integerStackCounter += 3;
                return;
            }
            if (argument == 6306) {
                int anLocalInt = integerStack[--integerStackCounter];
                integerStack[integerStackCounter++] = (int) (Node_Sub2.method534(anLocalInt, -80) / 60000L);
                return;
            }
        } else if (argument < 6500) {
            if (argument == 6405) {
                integerStack[integerStackCounter++] = DoublyLinkedNodeP2_Sub10.method1947(-28747) ? 1 : 0;
                return;
            }
            if (argument == 6406) {
                integerStack[integerStackCounter++] = Class42.method422((byte) -58) ? 1 : 0;
                return;
            }
        } else if (argument < 6600) {
            if (argument == 6500) {
                if (Statics.anInt1652 != 7 || Class303.method3574(-1) || Class245.anInt1784 != 0)
                    integerStack[integerStackCounter++] = 1;
                else {
                    if (Class158.aBoolean1164)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        if (Class189_Sub1.aLong5641 > Applet_Sub1.getGameTime() - 1000L)
                            integerStack[integerStackCounter++] = 1;
                        else {
                            Class158.aBoolean1164 = true;
                            Node_Sub29 class59_sub29 = Class91.method1683((byte) 111, (Node_Sub31_Sub16.aClass372_5910), Class197.aClass207_1439);
                            class59_sub29.aClass59_Sub28_Sub1_4129.p4(Class46_Sub1.anInt3836);
                            Class251.method3243(class59_sub29, true);
                            integerStack[integerStackCounter++] = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (argument == 6501) {
                Class84_Sub1 class84_sub1 = Skybox_Sub2_Sub1.method1515(false);
                if (class84_sub1 != null) {
                    integerStack[integerStackCounter++] = class84_sub1.anInt4481;
                    integerStack[integerStackCounter++] = class84_sub1.anInt595;
                    stringStack[stringStackCounter++] = class84_sub1.aString4478;
                    Class168 class168 = class84_sub1.method1622(-1);
                    integerStack[integerStackCounter++] = class168.anInt1231;
                    stringStack[stringStackCounter++] = class168.aString1232;
                    integerStack[integerStackCounter++] = class84_sub1.anInt596;
                    integerStack[integerStackCounter++] = class84_sub1.anInt4479;
                    stringStack[stringStackCounter++] = class84_sub1.aString4482;
                } else {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    return;
                }
                return;
            }
            if (argument == 6502) {
                Class84_Sub1 class84_sub1 = Class38.method394(92);
                if (class84_sub1 != null) {
                    integerStack[integerStackCounter++] = class84_sub1.anInt4481;
                    integerStack[integerStackCounter++] = class84_sub1.anInt595;
                    stringStack[stringStackCounter++] = class84_sub1.aString4478;
                    Class168 class168 = class84_sub1.method1622(-1);
                    integerStack[integerStackCounter++] = class168.anInt1231;
                    stringStack[stringStackCounter++] = class168.aString1232;
                    integerStack[integerStackCounter++] = class84_sub1.anInt596;
                    integerStack[integerStackCounter++] = class84_sub1.anInt4479;
                    stringStack[stringStackCounter++] = class84_sub1.aString4482;
                } else {
                    integerStack[integerStackCounter++] = -1;
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    return;
                }
                return;
            }
            if (argument == 6503) {
                int anLocalInt = integerStack[--integerStackCounter];
                String string = stringStack[--stringStackCounter];
                if (Statics.anInt1652 != 7 || Class303.method3574(-1) || Class245.anInt1784 != 0)
                    integerStack[integerStackCounter++] = 0;
                else {
                    integerStack[integerStackCounter++] = (Node_Sub7.method568(string, anLocalInt, false) ? 1 : 0);
                    return;
                }
                return;
            }
            if (argument == 6506) {
                int anLocalInt = integerStack[--integerStackCounter];
                Class84_Sub1 class84_sub1 = Class115.method2369(anLocalInt, 46);
                if (class84_sub1 != null) {
                    integerStack[integerStackCounter++] = class84_sub1.anInt595;
                    stringStack[stringStackCounter++] = class84_sub1.aString4478;
                    Class168 class168 = class84_sub1.method1622(-1);
                    integerStack[integerStackCounter++] = class168.anInt1231;
                    stringStack[stringStackCounter++] = class168.aString1232;
                    integerStack[integerStackCounter++] = class84_sub1.anInt596;
                    integerStack[integerStackCounter++] = class84_sub1.anInt4479;
                    stringStack[stringStackCounter++] = class84_sub1.aString4482;
                } else {
                    integerStack[integerStackCounter++] = -1;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    integerStack[integerStackCounter++] = 0;
                    integerStack[integerStackCounter++] = 0;
                    stringStack[stringStackCounter++] = "";
                    return;
                }
                return;
            }
            if (argument == 6507) {
                integerStackCounter -= 4;
                int anLocalInt = integerStack[integerStackCounter];
                boolean anLocalBoolean = integerStack[integerStackCounter + 1] == 1;
                int anLocalInt_209_ = integerStack[integerStackCounter + 2];
                boolean anLocalBoolean_210_ = integerStack[integerStackCounter + 3] == 1;
                Class233.method3097(-108, anLocalInt_209_, anLocalBoolean, anLocalBoolean_210_, anLocalInt);
                return;
            }
            if (argument == 6508) {
                Class109_Sub1.method1983(37);
                return;
            }
            if (argument == 6509) {
                if (Statics.anInt1652 == 7) {
                    Class260.aBoolean2026 = integerStack[--integerStackCounter] == 1;
                    return;
                }
                return;
            }
            if (argument == 6510) {
                integerStack[integerStackCounter++] = client.worldFlags;
                return;
            }
        } else if (argument >= 6700) {
            if (argument < 6800 && client.modeWhat == ModeWhatEnum.WIP) {
                if (argument == 6700) {
                    int anLocalInt = Class2_Sub5.aJagexHashMap_3787.count();
                    if (Class66.anInt467 != -1)
                        anLocalInt++;
                    integerStack[integerStackCounter++] = anLocalInt;
                    return;
                }
                if (argument == 6701) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (Class66.anInt467 != -1) {
                        if (anLocalInt == 0) {
                            integerStack[integerStackCounter++] = Class66.anInt467;
                            return;
                        }
                        anLocalInt--;
                    }
                    Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.first(0));
                    while (anLocalInt-- > 0)
                        class59_sub49 = (Node_Sub49) Class2_Sub5.aJagexHashMap_3787.next();
                    integerStack[integerStackCounter++] = class59_sub49.anInt4291;
                    return;
                }
                if (argument == 6702) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (RsInterface.anInterfaces[anLocalInt] == null)
                        stringStack[stringStackCounter++] = "";
                    else {
                        String string = (RsInterface.anInterfaces[anLocalInt][0].aString1896);
                        if (string == null)
                            stringStack[stringStackCounter++] = "";
                        else {
                            stringStack[stringStackCounter++] = string.substring(0, string.indexOf(':'));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (argument == 6703) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (RsInterface.anInterfaces[anLocalInt] == null)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        integerStack[integerStackCounter++] = (RsInterface.anInterfaces[anLocalInt]).length;
                        return;
                    }
                    return;
                }
                if (argument == 6704) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_211_ = integerStack[integerStackCounter + 1];
                    if (RsInterface.anInterfaces[anLocalInt] == null)
                        stringStack[stringStackCounter++] = "";
                    else {
                        String string = (RsInterface.anInterfaces[anLocalInt][anLocalInt_211_].aString1896);
                        if (string == null)
                            stringStack[stringStackCounter++] = "";
                        else {
                            stringStack[stringStackCounter++] = string;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (argument == 6705) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_212_ = integerStack[integerStackCounter + 1];
                    if (RsInterface.anInterfaces[anLocalInt] == null)
                        integerStack[integerStackCounter++] = 0;
                    else {
                        integerStack[integerStackCounter++] = RsInterface.anInterfaces[anLocalInt][anLocalInt_212_].anInt1916;
                        return;
                    }
                    return;
                }
                if (argument == 6706)
                    return;
                if (argument == 6707) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_213_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_214_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_214_, (anLocalInt << 16 | anLocalInt_213_), "", 1);
                    return;
                }
                if (argument == 6708) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_215_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_216_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_216_, (anLocalInt << 16 | anLocalInt_215_), "", 2);
                    return;
                }
                if (argument == 6709) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_217_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_218_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_218_, (anLocalInt << 16 | anLocalInt_217_), "", 3);
                    return;
                }
                if (argument == 6710) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_219_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_220_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_220_, (anLocalInt << 16 | anLocalInt_219_), "", 4);
                    return;
                }
                if (argument == 6711) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_221_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_222_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_222_, (anLocalInt << 16 | anLocalInt_221_), "", 5);
                    return;
                }
                if (argument == 6712) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_223_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_224_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_224_, (anLocalInt << 16 | anLocalInt_223_), "", 6);
                    return;
                }
                if (argument == 6713) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_225_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_226_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_226_, (anLocalInt << 16 | anLocalInt_225_), "", 7);
                    return;
                }
                if (argument == 6714) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_227_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_228_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_228_, (anLocalInt << 16 | anLocalInt_227_), "", 8);
                    return;
                }
                if (argument == 6715) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_229_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_230_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_230_, (anLocalInt << 16 | anLocalInt_229_), "", 9);
                    return;
                }
                if (argument == 6716) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_231_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_232_ = integerStack[integerStackCounter + 2];
                    Node_Sub47.method1111(true, anLocalInt_232_, (anLocalInt << 16 | anLocalInt_231_), "", 10);
                    return;
                }
                if (argument == 6717) {
                    integerStackCounter -= 3;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_233_ = integerStack[integerStackCounter + 1];
                    int anLocalInt_234_ = integerStack[integerStackCounter + 2];
                    RsInterface rsInterface = RsInterface.getCreatedChild((anLocalInt << 16 | anLocalInt_233_), anLocalInt_234_);
                    Class362.method3964(0);
                    Node_Sub18 class59_sub18 = client.method122(rsInterface);
                    Class123.method2392((class59_sub18.anInt4008), rsInterface, -111, class59_sub18.method709(0));
                    return;
                }
            } else if (argument < 6900) {
                if (argument == 6800) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class299 class299 = Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, -102);
                    if (class299.aString2478 == null)
                        stringStack[stringStackCounter++] = "";
                    else {
                        stringStack[stringStackCounter++] = class299.aString2478;
                        return;
                    }
                    return;
                }
                if (argument == 6801) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class299 class299 = Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, -97);
                    integerStack[integerStackCounter++] = class299.anInt2509;
                    return;
                }
                if (argument == 6802) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class299 class299 = Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, -89);
                    integerStack[integerStackCounter++] = class299.anInt2514;
                    return;
                }
                if (argument == 6803) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    Class299 class299 = Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, 105);
                    integerStack[integerStackCounter++] = class299.anInt2490;
                    return;
                }
                if (argument == 6804) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_235_ = integerStack[integerStackCounter + 1];
                    Class315 class315 = Class62_Sub27.aClass362_4457.method3960(true, anLocalInt_235_);
                    if (class315.method3631(0))
                        stringStack[stringStackCounter++] = (Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, -41).method3521(anLocalInt_235_, (byte) -35, class315.aString2606));
                    else {
                        integerStack[integerStackCounter++] = (Node_Sub31_Sub13.aClass20_5897.method312(anLocalInt, 82).method3524(class315.anInt2607, anLocalInt_235_, 17110));
                        return;
                    }
                    return;
                }
            } else if (argument < 7000) {
                if (argument == 6900) {
                    integerStack[integerStackCounter++] = (Class207.aBoolean1485 && !Class190.aBoolean1395 ? 1 : 0);
                    return;
                }
                if (argument == 6901) {
                    integerStack[integerStackCounter++] = (int) (Class143.aLong1102 / 60000L);
                    integerStack[integerStackCounter++] = (int) ((Class143.aLong1102 - Applet_Sub1.getGameTime() - Class147.aLong1120) / 60000L);
                    integerStack[integerStackCounter++] = Class383.aBoolean3243 ? 1 : 0;
                    return;
                }
                if (argument == 6902) {
                    integerStack[integerStackCounter++] = Class387.anInt3269;
                    return;
                }
                if (argument == 6903) {
                    integerStack[integerStackCounter++] = Class353_Sub5.anInt5500;
                    return;
                }
                if (argument == 6904) {
                    integerStack[integerStackCounter++] = Node_Sub2.anInt3885;
                    return;
                }
                if (argument == 6905) {
                    String string = "";
                    if (Class62_Sub2.aSignlinkRequest_4365 != null) {
                        if (Class62_Sub2.aSignlinkRequest_4365.result != null)
                            string = ((String) Class62_Sub2.aSignlinkRequest_4365.result);
                        else
                            string = Statics.formatIP((Class62_Sub2.aSignlinkRequest_4365.intParameter1));
                    }
                    stringStack[stringStackCounter++] = string;
                    return;
                }
                if (argument == 6906) {
                    integerStack[integerStackCounter++] = DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.anInt6861;
                    return;
                }
                if (argument == 6907) {
                    integerStack[integerStackCounter++] = Class269.anInt2155;
                    return;
                }
                if (argument == 6908) {
                    integerStack[integerStackCounter++] = IOException_Sub1.anInt39;
                    return;
                }
                if (argument == 6909) {
                    integerStack[integerStackCounter++] = Node_Sub35.aBoolean4159 ? 1 : 0;
                    return;
                }
                if (argument == 6910) {
                    integerStack[integerStackCounter++] = Class289.anInt2303;
                    return;
                }
                if (argument == 6911) {
                    integerStack[integerStackCounter++] = Class221.anInt1554;
                    return;
                }
                if (argument == 6912) {
                    integerStack[integerStackCounter++] = Statics.anInt6447;
                    return;
                }
                if (argument == 6913) {
                    integerStack[integerStackCounter++] = Class205.anInt1473;
                    return;
                }
            } else if (argument < 7100) {
                if (argument == 7000) {
                    int anLocalInt = Statics.method128((byte) 60);
                    integerStack[integerStackCounter++] = Statics.anInt5240 = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4295.method1464(29);
                    integerStack[integerStackCounter++] = anLocalInt;
                    Class109_Sub1.method1985(-57);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7001) {
                    Class2_Sub1.method199(-18861);
                    Class109_Sub1.method1985(-92);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7002) {
                    Node_Sub7.method569(0);
                    Class109_Sub1.method1985(-82);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7003) {
                    Class62_Sub29.method1476(1);
                    Class109_Sub1.method1985(-52);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7004) {
                    Statics.method413(true, (byte) -67);
                    Class109_Sub1.method1985(-29);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7005) {
                    AthmosphericConditions.aClass59_Sub50_116.method1159(0, (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub21_4326), 111);
                    Class251.method3240(false);
                    Class152.aBoolean1149 = false;
                    return;
                }
                if (argument == 7006) {
                    if (Statics.anInt5240 == 2)
                        Class159.aBoolean3673 = true;
                    else {
                        if (Statics.anInt5240 == 1)
                            Node_Sub47.aBoolean4286 = true;
                        else {
                            if (Statics.anInt5240 == 3)
                                DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2.aBoolean6869 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (argument == 7007) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub21_4326.method1440(111);
                    return;
                }
            } else if (argument < 7200) {
                if (argument == 7100) {
                    integerStackCounter -= 2;
                    int anLocalInt = integerStack[integerStackCounter];
                    int anLocalInt_236_ = integerStack[integerStackCounter + 1];
                    if (anLocalInt != -1) {
                        if (anLocalInt_236_ > 255)
                            anLocalInt_236_ = 255;
                        else if (anLocalInt_236_ < 0)
                            anLocalInt_236_ = 0;
                        Node_Sub49.method1151(false, anLocalInt, (byte) -2, anLocalInt_236_);
                    }
                    return;
                }
                if (argument == 7101) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (anLocalInt != -1)
                        Class389.method4135(70, anLocalInt);
                    return;
                }
                if (argument == 7102) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (anLocalInt != -1)
                        Node_Sub31_Sub11.method903(51, anLocalInt);
                    return;
                }
                if (argument == 7103) {
                    integerStack[integerStackCounter++] = (Class368_Sub3.method4041("jagtheora", (byte) -118) ? 1 : 0);
                    return;
                }
            } else if (argument < 7300) {
                if (argument == 7201) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307.method1381(118) ? 1 : 0;
                    return;
                }
                if (argument == 7202) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub27_4330.method1468(113) ? 1 : 0;
                    return;
                }
                if (argument == 7203) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331.method1386(-38) ? 1 : 0;
                    return;
                }
                if (argument == 7204) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1437(-74) ? 1 : 0;
                    return;
                }
                if (argument == 7205) {
                    integerStack[integerStackCounter++] = (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4317.method1379(110) && Class389.aGraphicsToolkit3281.method2039()) ? 1 : 0;
                    return;
                }
                if (argument == 7206) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub1_4297.method1348(109) ? 1 : 0;
                    return;
                }
                if (argument == 7207) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub5_4314.method1374(-101) ? 1 : 0;
                    return;
                }
                if (argument == 7208) {
                    integerStack[integerStackCounter++] = (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub14_4327.method1408(-81) && Class389.aGraphicsToolkit3281.method2034()) ? 1 : 0;
                    return;
                }
                if (argument == 7209) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub3_4318.method1357(125) ? 1 : 0;
                    return;
                }
                if (argument == 7210) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1433(-25) ? 1 : 0;
                    return;
                }
                if (argument == 7211) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub23_4311.method1450(-90) ? 1 : 0;
                    return;
                }
                if (argument == 7212) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub13_4329.method1406(119) ? 1 : 0;
                    return;
                }
                if (argument == 7213) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub10_4335.method1396(2) ? 1 : 0;
                    return;
                }
                if (argument == 7214) {
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316.method1461(-43) ? 1 : 0;
                    return;
                }
            } else if (argument < 7400) {
                if (argument == 7301) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307.method1342(anLocalInt, (byte) -115);
                    return;
                }
                if (argument == 7302) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub27_4330.method1342(anLocalInt, (byte) 21);
                    return;
                }
                if (argument == 7303) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub8_4331.method1342(anLocalInt, (byte) 52);
                    return;
                }
                if (argument == 7304) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub20_4334.method1342(anLocalInt, (byte) 41);
                    return;
                }
                if (argument == 7305) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (!Class389.aGraphicsToolkit3281.method2039())
                        integerStack[integerStackCounter++] = 3;
                    else {
                        integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub6_4317.method1342(anLocalInt, (byte) -1);
                        return;
                    }
                    return;
                }
                if (argument == 7306) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub1_4297.method1342(anLocalInt, (byte) 62);
                    return;
                }
                if (argument == 7307) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub5_4314.method1342(anLocalInt, (byte) -116);
                    return;
                }
                if (argument == 7308) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    if (!Class389.aGraphicsToolkit3281.method2034())
                        integerStack[integerStackCounter++] = 3;
                    else {
                        integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub14_4327.method1342(anLocalInt, (byte) -128);
                        return;
                    }
                    return;
                }
                if (argument == 7309) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub3_4318.method1342(anLocalInt, (byte) 79);
                    return;
                }
                if (argument == 7310) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1342(anLocalInt, (byte) -107);
                    return;
                }
                if (argument == 7311) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub23_4311.method1342(anLocalInt, (byte) 124);
                    return;
                }
                if (argument == 7312) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub13_4329.method1342(anLocalInt, (byte) 61);
                    return;
                }
                if (argument == 7313) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub10_4335.method1342(anLocalInt, (byte) 49);
                    return;
                }
                if (argument == 7314) {
                    int anLocalInt = integerStack[--integerStackCounter];
                    integerStack[integerStackCounter++] = AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub26_4316.method1342(anLocalInt, (byte) 117);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(argument));
    }

    static final void empty3664() {
        /* empty */
    }

    static final void executeTrigger(Cs2Trigger argument) {
        executeTrigger(argument, 200000);
    }

    private static String getStringClanSetting(int argument) {
        String string = currentClanSettings.getStringSetting((client.selectedGame.id) << 16 | argument);
        if (string == null)
            return "";
        return string;
    }

    private static void createCustomInterfacePTF(int hash) {
        RsInterface rsInterface = RsInterface.getByHash(hash);
        if (rsInterface != null) {
            int pid = hash >>> 16;
            RsInterface[] rsInterfaces = Packet.aRsInterfaceArrayArray4123[pid];
            if (rsInterfaces == null) {
                RsInterface[] class249s_237_ = RsInterface.anInterfaces[pid];
                int anLocalInt_238_ = class249s_237_.length;
                rsInterfaces = Packet.aRsInterfaceArrayArray4123[pid] = new RsInterface[anLocalInt_238_];
                JagStrings.memcpy(class249s_237_, 0, rsInterfaces, 0, class249s_237_.length);
            }
            int anLocalInt_239_;
            for (anLocalInt_239_ = 0; anLocalInt_239_ < rsInterfaces.length; anLocalInt_239_++) {
                if (rsInterfaces[anLocalInt_239_] == rsInterface)
                    break;
            }
            if (anLocalInt_239_ < rsInterfaces.length) {
                JagStrings.memcpy(rsInterfaces, 0, rsInterfaces, 1, anLocalInt_239_);
                rsInterfaces[0] = rsInterface;
            }
        }
    }

    static final void executeActionScript(Class211 actionType, int argument_240_, int argument_241_) {
        Cs2Script script = Cs2Script.get(argument_241_, argument_240_, actionType);
        if (script != null) {
            integerLocalVariables = (new int[script.integerVariableCount]);
            stringLocalVariables = (new String[script.stringVariableCount]);
            if ((script.aClass211_6339 == Class211.aClass211_6309) || (script.aClass211_6339 == Class211.aClass211_1160) || (script.aClass211_6339 == Class211.aClass211_3715)) {
                int xOffset = 0;
                int yOffset = 0;
                if (MultilanguageString.aRsInterface_2865 != null) {
                    xOffset = MultilanguageString.aRsInterface_2865.renderX;
                    yOffset = MultilanguageString.aRsInterface_2865.renderY;
                }
                integerLocalVariables[0] = client.mouseHandler.getX() - xOffset;
                integerLocalVariables[1] = client.mouseHandler.getY() - yOffset;
            }
            executeScript(script, 200000);
        }
    }

    static {
        arrayVariables = new int[5][5000];
        callStack = new Cs2CallStackEntry[50];
        stringStackCounter = 0;
        integerStackCounter = 0;
        stringStack = new String[1000];
        longStackCounter = 0;
        anIntArray2658 = new int[3];
        arrayLength = new int[5];
        longStack = new long[1000];
        callStackCounter = 0;
        aClass149_2651 = new Class149(4);
        anInt2661 = 0;
    }

    static final void method1473(int p2, int p1, int action) {
        switch (action) {
            case 1010:
                executeActionScript(Class211.aClass211_1991, p1, p2);
                break;
            case 1002:
                executeActionScript(Class211.aClass211_5665, p1, p2);
                break;
            case 1011:
                executeActionScript(Class211.aClass211_6556, p1, p2);
                break;
            case 1006:
                executeActionScript(Class211.aClass211_6156, p1, p2);
                break;
            case 1007:
                executeActionScript(Class211.aClass211_3221, p1, p2);
                break;
        }
    }
}
