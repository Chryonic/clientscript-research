/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Frame;

final class RsInterface {
    static Js5Store interfaceStore;
    static Js5Store aJs5Store_3759;
    static Js5Store aJs5Store_1092;
    static RsInterface[][] anInterfaces;
    static boolean[] empty;
    private short[] aShortArray1810;
    int anInt1811;
    int anInt1812 = -1;
    int anInt1813;
    int idHash;
    Object[] anObjectArray1815;
    int width;
    int[] anIntArray1817;
    int x;
    int[] anIntArray1819;
    byte horizontalResizeMode;
    int anInt1821;
    int anInt1822 = 1;
    int anInt1823;
    Object[] anObjectArray1824;
    int anInt1825;
    int anInt1826;
    byte[] aByteArray1827;
    Object[] anObjectArray1828;
    int anInt1829;
    int anInt1830;
    Object[] anObjectArray1831;
    Object[] anObjectArray1832;
    int anInt1833;
    int renderX;
    boolean aBoolean1835;
    int anInt1836;
    int anInt1837 = 0;
    int anInt1838;
    Object[] anObjectArray1839;
    int[] anIntArray1840;
    Object[] anObjectArray1841;
    DoublyLinkedNodeP2_Sub7 aClass104_Sub7_1842;
    int anInt1843;
    boolean aBoolean1844;
    String[] aStringArray1845;
    int renderY;
    int[] anIntArray1847;
    int anInt1848;
    int anInt1849;
    private JagexHashMap aJagexHashMap_1850;
    int[] anIntArray1851;
    int anInt1852;
    int anInt1853;
    boolean aBoolean1854;
    Object[] anObjectArray1855;
    Object[] anObjectArray1856;
    int anInt1857;
    int height;
    int anInt1859;
    Node_Sub18 aClass59_Sub18_1860;
    int anInt1861;
    boolean aBoolean1862;
    private short[] aShortArray1863;
    int anInt1864;
    int anInt1865;
    int anInt1866;
    int[] anIntArray1867;
    boolean aBoolean1868;
    int renderWidth;
    int anInt1870;
    boolean aBoolean1871;
    Object[] anObjectArray1872;
    byte verticalResizeMode;
    int anInt1874;
    RsInterface[] children;
    int colour;
    int anInt1877;
    Object[] anObjectArray1878;
    Object[] anObjectArray1879;
    Object[] anObjectArray1880;
    static int anInt1881;
    int anInt1882;
    int renderHeight;
    int anInt1884;
    int anInt1885;
    int anInt1886;
    int anInt1887;
    int anInt1888;
    int anInt1889;
    String aString1890;
    private short[] aShortArray1891;
    Object[] anObjectArray1892;
    Object[] anObjectArray1893;
    Object[] anObjectArray1894;
    String aString1895;
    String aString1896;
    int anInt1897;
    int anInt1898;
    int anInt1899;
    int subId;
    int anInt1901;
    int[] anIntArray1902;
    int anInt1903;
    int[] anIntArray1904;
    int anInt1905;
    int anInt1906;
    Object[] anObjectArray1907;
    boolean aBoolean1908;
    int anInt1909;
    int y;
    boolean aBoolean1911;
    boolean aBoolean1912;
    Object[] anObjectArray1913;
    Object[] anObjectArray1914;
    int[] anIntArray1915;
    int anInt1916;
    boolean aBoolean1917;
    int parentId;
    Object[] anObjectArray1919;
    Object[] anObjectArray1920;
    String aString1921;
    int anInt1922;
    boolean aBoolean1923;
    int anInt1924;
    int anInt1925;
    Object[] anObjectArray1926;
    int anInt1927;
    int anInt1928;
    int anInt1929;
    boolean aBoolean1930;
    Object[] resizeTrigger;
    int anInt1932;
    int anInt1933;
    int type;
    boolean aBoolean1935;
    Object[] anObjectArray1936;
    int anInt1937;
    int anInt1938;
    byte verticalRepositionMode;
    static int[] anIntArray1940 = new int[1];
    Object[] anObjectArray1941;
    boolean aBoolean1942;
    boolean aBoolean1943;
    int anInt1944;
    Object[] anObjectArray1945;
    Object[] anObjectArray1946;
    RsInterface aRsInterface_1947;
    int anInt1948;
    static boolean aBoolean1949 = false;
    int anInt1950;
    Object[] anObjectArray1951;
    Object[] anObjectArray1952;
    private short[] aShortArray1953;
    int anInt1954;
    Object[] anObjectArray1955;
    Object[] anObjectArray1956;
    Object[] anObjectArray1957;
    boolean aBoolean1958;
    Object[] anObjectArray1959;
    int anInt1960;
    int anInt1961;
    boolean aBoolean1962;
    int anInt1963;
    int[] anIntArray1964;
    byte horizontalRepositionMode;
    byte[] aByteArray1966;
    int anInt1967;
    String aString1968;

    static final void method3210(Signlink argument, int argument_0_, Frame argument_1_) {
        int anLocalInt = 72 / ((45 - argument_0_) / 47);
        for (; ; ) {
            SignlinkRequest signlinkRequest = argument.requestRestoreDisplayMode(argument_1_);
            while (signlinkRequest.status == 0)
                Timing.sleep(10L);
            if (signlinkRequest.status == 1)
                break;
            Timing.sleep(100L);
        }
        argument_1_.setVisible(false);
        argument_1_.dispose();
    }

    static final void initialize(Js5Store argument, Js5Store argument_0_, Js5Store _interfaceStore, Js5Store argument_3_) {
        interfaceStore = _interfaceStore;
        aJs5Store_3759 = argument_3_;
        aJs5Store_1092 = argument_0_;
        anInterfaces = new RsInterface[interfaceStore.getRealSubFileCount()][];
        empty = new boolean[interfaceStore.getRealSubFileCount()];
    }

    static final boolean isAvailable(int id) {
        if (empty[id])
            return true;
        if (!interfaceStore.isLoaded(id))
            return false;
        int subInterfaceCount = interfaceStore.getSubFileCount(id);
        if (subInterfaceCount == 0) {
            empty[id] = true;
            return true;
        }
        if (anInterfaces[id] == null)
            anInterfaces[id] = new RsInterface[subInterfaceCount];
        for (int subInterfaceId = 0; subInterfaceCount > subInterfaceId; subInterfaceId++) {
            if ((anInterfaces[id][subInterfaceId]) == null) {
                byte[] data = interfaceStore.getData(id, subInterfaceId);
                if (data != null) {
                    RsInterface subInterface = (anInterfaces[id][subInterfaceId] = new RsInterface());
                    subInterface.idHash = (id << 16) + subInterfaceId;
                    if (data[0] != -1)
                        throw new IllegalStateException("if1");
                    subInterface.readNewFormat(new Packet(data));
                }
            }
        }
        empty[id] = true;
        return true;
    }

    static final RsInterface getByHash(int argument) {
        int anLocalInt = argument >> 16;
        int anLocalInt_1_ = argument & 0xffff;
        if (anInterfaces[anLocalInt] == null || (anInterfaces[anLocalInt][anLocalInt_1_]) == null) {
            boolean anLocalBoolean = isAvailable(anLocalInt);
            if (!anLocalBoolean)
                return null;
        }
        return (anInterfaces[anLocalInt][anLocalInt_1_]);
    }

    static final RsInterface getCreatedChild(int hash, int id) {
        RsInterface rsInterface = getByHash(hash);
        if (id == -1)
            return rsInterface;
        if (rsInterface == null || rsInterface.children == null || id >= rsInterface.children.length)
            return null;
        return rsInterface.children[id];
    }

    static final void method729(int argument) {
        anInterfaces = new RsInterface[interfaceStore.getRealSubFileCount()][];
        Packet.aRsInterfaceArrayArray4123 = new RsInterface[interfaceStore.getRealSubFileCount()][];
        empty = new boolean[interfaceStore.getRealSubFileCount()];
    }

    static final void doAutoPosition(RsInterface argument, int parentHeight, int parentWidth) {
        switch (argument.verticalRepositionMode) {
            case 0:
                argument.renderY = argument.y;
                break;
            case 1:
                argument.renderY = ((parentHeight - argument.renderHeight) / 2 + argument.y);
                break;
            case 2:
                argument.renderY = (parentHeight - argument.renderHeight - argument.y);
                break;
            case 3:
                argument.renderY = argument.y * parentHeight >> 14;
                break;
            case 4:
                argument.renderY = ((parentHeight * argument.y >> 14) + (parentHeight - argument.renderHeight) / 2);
                break;
            default:
                argument.renderY = (-(argument.y * parentHeight >> 14) + (parentHeight - argument.renderHeight));
                break;
        }
        switch (argument.horizontalRepositionMode) {
            case 0:
                argument.renderX = argument.x;
                break;
            case 1:
                argument.renderX = ((-argument.renderWidth + parentWidth) / 2 + argument.x);
                break;
            case 2:
                argument.renderX = (-argument.renderWidth + (parentWidth - argument.x));
                break;
            case 3:
                argument.renderX = argument.x * parentWidth >> 14;
                break;
            case 4:
                argument.renderX = ((parentWidth - argument.renderWidth) / 2 + (parentWidth * argument.x >> 14));
                break;
            default:
                argument.renderX = (parentWidth + (-argument.renderWidth - (parentWidth * argument.x >> 14)));
                break;
        }
        if (dba_sub_772_Sub2.aBoolean6372) {
            if (client.method122(argument).anInt4005 != 0 || argument.type == 0) {
                if (argument.renderY < 0)
                    argument.renderY = 0;
                else if ((argument.renderY + argument.renderHeight) > parentHeight)
                    argument.renderY = -argument.renderHeight + parentHeight;
                if (argument.renderX >= 0) {
                    if ((argument.renderX + argument.renderWidth) > parentWidth)
                        argument.renderX = parentWidth - argument.renderWidth;
                } else
                    argument.renderX = 0;
            }
        }
    }

    static final void doAutoSize(RsInterface argument, boolean trigger, int argument_13_, int argument_14_) {
        int oldWidth = argument.renderWidth;
        switch (argument.horizontalResizeMode) {
            case 0:
                argument.renderWidth = argument.width;
                break;
            case 1:
                argument.renderWidth = -argument.width + argument_14_;
                break;
            case 2:
                argument.renderWidth = argument_14_ * argument.width >> 14;
                break;
            case 4:
                argument.renderWidth = (argument.renderHeight * argument.anInt1944 / argument.anInt1813);
                break;
        }
        int oldHeight = argument.renderHeight;
        switch (argument.verticalResizeMode) {
            case 0:
                argument.renderHeight = argument.height;
                break;
            case 1:
                argument.renderHeight = -argument.height + argument_13_;
                break;
            case 2:
                argument.renderHeight = argument_13_ * argument.height >> 14;
                break;
            case 4:
                argument.renderHeight = (argument.anInt1813 * argument.renderWidth / argument.anInt1944);
                break;
        }
        if (dba_sub_772_Sub2.aBoolean6372 && (client.method122(argument).anInt4005 != 0 || argument.type == 0)) {
            if (argument.renderHeight < 5 && argument.renderWidth < 5) {
                argument.renderHeight = 5;
                argument.renderWidth = 5;
            } else {
                if (argument.renderHeight <= 0)
                    argument.renderHeight = 5;
                if (argument.renderWidth <= 0)
                    argument.renderWidth = 5;
            }
        }
        if (argument.anInt1859 == Class283.anInt2276)
            Class133.aRsInterface_1065 = argument;
        if (trigger && argument.resizeTrigger != null) {
            if (argument.renderWidth != oldWidth || oldHeight != argument.renderHeight) {
                Cs2Trigger class59_sub27 = new Cs2Trigger();
                class59_sub27.aRsInterface_4115 = argument;
                class59_sub27.parameters = argument.resizeTrigger;
                DoublyLinkedNode_Sub51_Sub19.triggerQueue.add(class59_sub27);
            }
        }
    }

    static final void doAutoLayout(RsInterface theInterface) {
        RsInterface rsInterface = getParent(1, theInterface);
        int parentWidth;
        int parentHeight;
        if (rsInterface != null) {
            parentHeight = rsInterface.renderWidth;
            parentWidth = rsInterface.renderHeight;
        } else {
            parentWidth = Applet_Sub1.canvasHeight;
            parentHeight = Applet_Sub1.canvasWidth;
        }
        doAutoSize(theInterface, false, parentWidth, parentHeight);
        doAutoPosition(theInterface, parentWidth, parentHeight);
    }

    static final RsInterface getParent(int argument, RsInterface theinterface) {
        if (theinterface.parentId != -1)
            return getByHash(theinterface.parentId);
        int interfacePid = theinterface.idHash >>> 16;
        Class391 class391 = new Class391(Class2_Sub5.aJagexHashMap_3787);
        for (Node_Sub49 class59_sub49 = (Node_Sub49) class391.method4141(72); class59_sub49 != null; class59_sub49 = (Node_Sub49) class391.method4137((byte) -15)) {
            if (class59_sub49.anInt4291 == interfacePid)
                return getByHash((int) (class59_sub49.hash));
        }
        return null;
    }

    static final void autoLayoutChildren(boolean fireTrigger, RsInterface argument_14_) {
        int w = (argument_14_.anInt1829 != 0 ? argument_14_.anInt1829 : argument_14_.renderWidth);
        int h = (argument_14_.anInt1882 == 0 ? argument_14_.renderHeight : argument_14_.anInt1882);
        doAutoLayout(argument_14_.idHash, w, (anInterfaces[(argument_14_.idHash >> 16)]), h, fireTrigger);
        if (argument_14_.children != null)
            doAutoLayout(argument_14_.idHash, w, (argument_14_.children), h, fireTrigger);
        Node_Sub49 class59_sub49 = ((Node_Sub49) Class2_Sub5.aJagexHashMap_3787.get((long) (argument_14_.idHash)));
        if (class59_sub49 != null)
            Statics.method1192(h, w, (class59_sub49.anInt4291), fireTrigger);
    }

    static void doAutoLayout(int parentId, int parentW, RsInterface[] interfaces, int parentH, boolean fireTrigger) {
        for (RsInterface rsInterface : interfaces) {
            if (rsInterface != null && rsInterface.parentId == parentId) {
                doAutoSize(rsInterface, fireTrigger, parentH, parentW);
                doAutoPosition(rsInterface, parentH, parentW);
                if ((-rsInterface.renderWidth + rsInterface.anInt1829) < rsInterface.anInt1950)
                    rsInterface.anInt1950 = (-rsInterface.renderWidth + rsInterface.anInt1829);
                if (rsInterface.anInt1838 > (rsInterface.anInt1882 - rsInterface.renderHeight))
                    rsInterface.anInt1838 = (rsInterface.anInt1882 - rsInterface.renderHeight);
                if (rsInterface.anInt1950 < 0)
                    rsInterface.anInt1950 = 0;
                if (rsInterface.anInt1838 < 0)
                    rsInterface.anInt1838 = 0;
                if (rsInterface.type == 0)
                    autoLayoutChildren(fireTrigger, rsInterface);
            }
        }
    }

    final int method3211(int argument_2_, int argument_3_, byte argument_4_) {
        if (argument_4_ != 82)
            this.anInt1865 = -95;
        if (aJagexHashMap_1850 == null)
            return argument_2_;
        IntegerNode class59_sub54 = ((IntegerNode) aJagexHashMap_1850.get((long) argument_3_));
        if (class59_sub54 == null)
            return argument_2_;
        return class59_sub54.value;
    }

    final void method3212(boolean argument_5_, int argument_6_) {
        if (aJagexHashMap_1850 != null) {
            Node node = aJagexHashMap_1850.get((long) argument_6_);
            if (node != null)
                node.unlink();
        }
    }

    final Class_aa method3213(int argument_7_, GraphicsToolkit argument_8_) {
        Class_aa class_aa = ((Class_aa) Node_Sub44.aClass149_4250.get((long) this.idHash));
        if (class_aa != null)
            return class_aa;
        Class83 class83 = Class83.method1612(aJs5Store_1092, this.anInt1864, argument_7_);
        if (class83 == null)
            return null;
        int anLocalInt = (class83.anInt588 + class83.anInt593 + class83.anInt590);
        int anLocalInt_9_ = (class83.anInt594 + class83.anInt587 + class83.anInt589);
        this.anIntArray1840 = new int[anLocalInt_9_];
        this.anIntArray1902 = new int[anLocalInt_9_];
        for (int anLocalInt_10_ = 0; class83.anInt587 > anLocalInt_10_; anLocalInt_10_++) {
            int anLocalInt_11_ = 0;
            int anLocalInt_12_ = anLocalInt;
            for (int anLocalInt_13_ = 0; class83.anInt590 > anLocalInt_13_; anLocalInt_13_++) {
                if ((class83.aByteArray591[(class83.anInt590 * anLocalInt_10_ + anLocalInt_13_)]) != 0) {
                    anLocalInt_11_ = anLocalInt_13_;
                    break;
                }
            }
            for (int anLocalInt_14_ = anLocalInt_11_; anLocalInt_14_ < class83.anInt590; anLocalInt_14_++) {
                if ((class83.aByteArray591[(anLocalInt_14_ + class83.anInt590 * anLocalInt_10_)]) == 0) {
                    anLocalInt_12_ = anLocalInt_14_;
                    break;
                }
            }
            this.anIntArray1902[(anLocalInt_10_ + class83.anInt589)] = anLocalInt_11_ + class83.anInt593;
            this.anIntArray1840[(class83.anInt589 + anLocalInt_10_)] = anLocalInt_12_ - anLocalInt_11_;
        }
        class_aa = argument_8_.method2066(anLocalInt, anLocalInt_9_, this.anIntArray1902, this.anIntArray1840);
        Node_Sub44.aClass149_4250.put(class_aa, (long) this.idHash);
        return class_aa;
    }

    final void method3214(int argument_15_, short argument_16_, byte argument_17_, short argument_18_) {
        if (argument_15_ < 5) {
            if (aShortArray1810 == null) {
                aShortArray1863 = new short[5];
                aShortArray1810 = new short[5];
            }
            aShortArray1810[argument_15_] = argument_18_;
            aShortArray1863[argument_15_] = argument_16_;
        }
    }

    final void readNewFormat(Packet packet) {
        int anLocalInt = packet.g1();
        this.type = packet.g1();
        if (anLocalInt == 255)
            anLocalInt = -1;
        if ((this.type & 0x80) != 0) {
            this.type &= 0x7f;
            this.aString1896 = packet.gstr();
        }
        this.anInt1859 = packet.g2();
        this.x = packet.g2s();
        this.y = packet.g2s();
        this.width = packet.g2();
        this.height = packet.g2();
        this.horizontalResizeMode = packet.g1s();
        this.verticalResizeMode = packet.g1s();
        this.horizontalRepositionMode = packet.g1s();
        this.verticalRepositionMode = packet.g1s();
        this.parentId = packet.g2();
        if (this.parentId != 65535)
            this.parentId = ((this.idHash & ~0xffff) + this.parentId);
        else
            this.parentId = -1;
        int anLocalInt_21_ = packet.g1();
        if (anLocalInt >= 0)
            this.aBoolean1942 = (anLocalInt_21_ & 0x2) != 0;
        this.aBoolean1854 = (anLocalInt_21_ & 0x1) != 0;
        if (this.type == 0) {
            this.anInt1829 = packet.g2();
            this.anInt1882 = packet.g2();
            if (anLocalInt < 0)
                this.aBoolean1942 = packet.g1() == 1;
        }
        if (this.type == 5) {
            this.anInt1864 = packet.g4();
            this.anInt1849 = packet.g2();
            int anLocalInt_22_ = packet.g1();
            this.aBoolean1868 = (anLocalInt_22_ & 0x1) != 0;
            this.aBoolean1962 = (anLocalInt_22_ & 0x2) != 0;
            this.anInt1967 = packet.g1();
            this.anInt1826 = packet.g1();
            this.anInt1823 = packet.g4();
            this.aBoolean1935 = packet.g1() == 1;
            this.aBoolean1930 = packet.g1() == 1;
            this.colour = packet.g4();
        }
        if (this.type == 6) {
            this.anInt1822 = 1;
            this.anInt1929 = packet.g2();
            if (this.anInt1929 == 65535)
                this.anInt1929 = -1;
            int anLocalInt_23_ = packet.g1();
            this.aBoolean1917 = (anLocalInt_23_ & 0x8) == 8;
            boolean anLocalBoolean = (anLocalInt_23_ & 0x1) == 1;
            this.aBoolean1943 = (anLocalInt_23_ & 0x2) == 2;
            this.aBoolean1835 = (anLocalInt_23_ & 0x4) == 4;
            if (anLocalBoolean) {
                this.anInt1848 = packet.g2s();
                this.anInt1888 = packet.g2s();
                this.anInt1885 = packet.g2();
                this.anInt1884 = packet.g2();
                this.anInt1837 = packet.g2();
                this.anInt1906 = packet.g2();
            } else if (this.aBoolean1943) {
                this.anInt1848 = packet.g2s();
                this.anInt1888 = packet.g2s();
                this.anInt1960 = packet.g2s();
                this.anInt1885 = packet.g2();
                this.anInt1884 = packet.g2();
                this.anInt1837 = packet.g2();
                this.anInt1906 = packet.g2s();
            }
            this.anInt1812 = packet.g2();
            if (this.anInt1812 == 65535)
                this.anInt1812 = -1;
            if (this.horizontalResizeMode != 0)
                this.anInt1886 = packet.g2();
            if (this.verticalResizeMode != 0)
                this.anInt1938 = packet.g2();
        }
        if (this.type == 4) {
            this.anInt1887 = packet.g2();
            if (this.anInt1887 == 65535)
                this.anInt1887 = -1;
            this.aString1921 = packet.gstr();
            this.anInt1903 = packet.g1();
            this.anInt1852 = packet.g1();
            this.anInt1933 = packet.g1();
            this.aBoolean1844 = packet.g1() == 1;
            this.colour = packet.g4();
            this.anInt1967 = packet.g1();
            if (anLocalInt >= 0)
                this.anInt1874 = packet.g1();
        }
        if (this.type == 3) {
            this.colour = packet.g4();
            this.aBoolean1912 = packet.g1() == 1;
            this.anInt1967 = packet.g1();
        }
        if (this.type == 9) {
            this.anInt1928 = packet.g1();
            this.colour = packet.g4();
            this.aBoolean1871 = packet.g1() == 1;
        }
        int anLocalInt_24_ = packet.g3_dupl();
        int anLocalInt_25_ = packet.g1();
        if (anLocalInt_25_ != 0) {
            this.anIntArray1964 = new int[11];
            this.aByteArray1827 = new byte[11];
            this.aByteArray1966 = new byte[11];
            for (/**/; anLocalInt_25_ != 0; anLocalInt_25_ = packet.g1()) {
                int anLocalInt_26_ = (anLocalInt_25_ >> 4) - 1;
                anLocalInt_25_ = (packet.g1() | anLocalInt_25_ << 8);
                anLocalInt_25_ &= 0xfff;
                if (anLocalInt_25_ == 4095)
                    anLocalInt_25_ = -1;
                byte anLocalInt_27_ = packet.g1s();
                if (anLocalInt_27_ != 0)
                    this.aBoolean1923 = true;
                byte anLocalInt_28_ = packet.g1s();
                this.anIntArray1964[anLocalInt_26_] = anLocalInt_25_;
                this.aByteArray1827[anLocalInt_26_] = anLocalInt_27_;
                this.aByteArray1966[anLocalInt_26_] = anLocalInt_28_;
            }
        }
        this.aString1968 = packet.gstr();
        int anLocalInt_29_ = packet.g1();
        int anLocalInt_30_ = anLocalInt_29_ & 0xf;
        if (anLocalInt_30_ > 0) {
            this.aStringArray1845 = new String[anLocalInt_30_];
            for (int anLocalInt_31_ = 0; anLocalInt_31_ < anLocalInt_30_; anLocalInt_31_++)
                this.aStringArray1845[anLocalInt_31_] = packet.gstr();
        }
        int anLocalInt_32_ = anLocalInt_29_ >> 4;
        if (anLocalInt_32_ > 0) {
            int anLocalInt_33_ = packet.g1();
            this.anIntArray1817 = new int[anLocalInt_33_ + 1];
            for (int anLocalInt_34_ = 0; anLocalInt_34_ < this.anIntArray1817.length; anLocalInt_34_++)
                this.anIntArray1817[anLocalInt_34_] = -1;
            this.anIntArray1817[anLocalInt_33_] = packet.g2();
        }
        if (anLocalInt_32_ > 1) {
            int anLocalInt_35_ = packet.g1();
            this.anIntArray1817[anLocalInt_35_] = packet.g2();
        }
        this.aString1890 = packet.gstr();
        if (this.aString1890.equals(""))
            this.aString1890 = null;
        this.anInt1901 = packet.g1();
        this.anInt1961 = packet.g1();
        this.anInt1825 = packet.g1();
        this.aString1895 = packet.gstr();
        int anLocalInt_36_ = -1;
        if (Class185.method2856(17356, anLocalInt_24_) != 0) {
            anLocalInt_36_ = packet.g2();
            this.anInt1889 = packet.g2();
            if (anLocalInt_36_ == 65535)
                anLocalInt_36_ = -1;
            if (this.anInt1889 == 65535)
                this.anInt1889 = -1;
            this.anInt1897 = packet.g2();
            if (this.anInt1897 == 65535)
                this.anInt1897 = -1;
        }
        if (anLocalInt >= 0) {
            this.anInt1927 = packet.g2();
            if (this.anInt1927 == 65535)
                this.anInt1927 = -1;
        }
        this.aClass59_Sub18_1860 = new Node_Sub18(anLocalInt_24_, anLocalInt_36_);
        if (anLocalInt >= 0) {
            int anLocalInt_37_ = packet.g1();
            for (int anLocalInt_38_ = 0; anLocalInt_37_ > anLocalInt_38_; anLocalInt_38_++) {
                int anLocalInt_39_ = packet.g3_dupl();
                int anLocalInt_40_ = packet.g4();
                aJagexHashMap_1850.put((long) anLocalInt_39_, new IntegerNode(anLocalInt_40_));
            }
            int anLocalInt_41_ = packet.g1();
            for (int anLocalInt_42_ = 0; anLocalInt_42_ < anLocalInt_41_; anLocalInt_42_++) {
                int anLocalInt_43_ = packet.g3_dupl();
                String string = packet.gjstr2();
                aJagexHashMap_1850.put((long) anLocalInt_43_, new StringNode(string));
            }
        }
        this.anObjectArray1946 = method3222(0, packet);
        this.anObjectArray1832 = method3222(0, packet);
        this.anObjectArray1872 = method3222(0, packet);
        this.anObjectArray1828 = method3222(0, packet);
        this.anObjectArray1815 = method3222(0, packet);
        this.anObjectArray1907 = method3222(0, packet);
        this.anObjectArray1936 = method3222(0, packet);
        this.anObjectArray1914 = method3222(0, packet);
        this.anObjectArray1941 = method3222(0, packet);
        this.anObjectArray1841 = method3222(0, packet);
        if (anLocalInt >= 0)
            this.anObjectArray1831 = method3222(0, packet);
        this.anObjectArray1878 = method3222(0, packet);
        this.anObjectArray1926 = method3222(0, packet);
        this.anObjectArray1945 = method3222(0, packet);
        this.anObjectArray1894 = method3222(0, packet);
        this.anObjectArray1880 = method3222(0, packet);
        this.anObjectArray1879 = method3222(0, packet);
        this.anObjectArray1839 = method3222(0, packet);
        this.anObjectArray1955 = method3222(0, packet);
        this.anObjectArray1856 = method3222(0, packet);
        this.anObjectArray1951 = method3222(0, packet);
        this.anIntArray1847 = method3217((byte) -11, packet);
        this.anIntArray1819 = method3217((byte) -11, packet);
        this.anIntArray1904 = method3217((byte) -11, packet);
        this.anIntArray1851 = method3217((byte) -11, packet);
        this.anIntArray1867 = method3217((byte) -11, packet);
    }

    final String method3216(int argument_44_, String argument_45_, int argument_46_) {
        if (aJagexHashMap_1850 == null)
            return argument_45_;
        StringNode class59_sub34 = ((StringNode) aJagexHashMap_1850.get((long) argument_44_));
        if (class59_sub34 == null)
            return argument_45_;
        return class59_sub34.value;
    }

    private final int[] method3217(byte argument_47_, Packet argument_48_) {
        int anLocalInt = argument_48_.g1();
        if (anLocalInt == 0)
            return null;
        int[] anLocalInts = new int[anLocalInt];
        int anLocalInt_49_ = 0;
        if (argument_47_ != -11)
            method3216(18, null, 96);
        for (/**/; anLocalInt > anLocalInt_49_; anLocalInt_49_++)
            anLocalInts[anLocalInt_49_] = argument_48_.g4();
        return anLocalInts;
    }

    public static void method3218(byte argument) {
        anIntArray1940 = null;
    }

    final void method3219(String argument_50_, byte argument_51_, int argument_52_) {
        if (this.aStringArray1845 == null || this.aStringArray1845.length <= argument_52_) {
            String[] strings = new String[argument_52_ + 1];
            if (this.aStringArray1845 != null) {
                for (int anLocalInt = 0; anLocalInt < this.aStringArray1845.length; anLocalInt++)
                    strings[anLocalInt] = this.aStringArray1845[anLocalInt];
            }
            this.aStringArray1845 = strings;
        }
        this.aStringArray1845[argument_52_] = argument_50_;
    }

    final void method3220(int argument_53_, byte argument_54_, int argument_55_) {
        if (argument_54_ <= 10)
            method3217((byte) -64, null);
        if (aJagexHashMap_1850 == null) {
            aJagexHashMap_1850 = new JagexHashMap(16);
            aJagexHashMap_1850.put((long) argument_55_, new IntegerNode(argument_53_));
        } else {
            IntegerNode class59_sub54 = ((IntegerNode) aJagexHashMap_1850.get((long) argument_55_));
            if (class59_sub54 != null)
                class59_sub54.value = argument_53_;
            else
                aJagexHashMap_1850.put((long) argument_55_, new IntegerNode(argument_53_));
        }
    }

    final AbstractFont method3221(int argument_56_, GraphicsToolkit argument_57_) {
        AbstractFont abstractFont = Class345.method3805(argument_57_, false, this.anInt1887, 0);
        Statics.aBoolean5745 = abstractFont == null;
        return abstractFont;
    }

    private final Object[] method3222(int argument_58_, Packet argument_59_) {
        int anLocalInt = argument_59_.g1();
        if (anLocalInt == 0)
            return null;
        Object[] objects = new Object[anLocalInt];
        for (int anLocalInt_60_ = argument_58_; anLocalInt > anLocalInt_60_; anLocalInt_60_++) {
            int anLocalInt_61_ = argument_59_.g1();
            if (anLocalInt_61_ != 0) {
                if (anLocalInt_61_ == 1)
                    objects[anLocalInt_60_] = argument_59_.gstr();
            } else
                objects[anLocalInt_60_] = new Integer(argument_59_.g4());
        }
        this.aBoolean1908 = true;
        return objects;
    }

    final void method3223(int argument_62_) {
        this.anObjectArray1828 = null;
        this.anObjectArray1831 = null;
        this.resizeTrigger = null;
        this.anObjectArray1920 = null;
        this.anObjectArray1955 = null;
        this.anObjectArray1855 = null;
        this.anObjectArray1878 = null;
        this.anObjectArray1936 = null;
        this.anIntArray1851 = null;
        this.anObjectArray1832 = null;
        this.anIntArray1867 = null;
        this.anObjectArray1914 = null;
        this.anObjectArray1879 = null;
        this.anObjectArray1839 = null;
        this.anObjectArray1941 = null;
        this.anObjectArray1894 = null;
        this.anObjectArray1880 = null;
        this.anObjectArray1956 = null;
        this.anObjectArray1926 = null;
        this.anObjectArray1856 = null;
        this.anIntArray1847 = null;
        this.anObjectArray1892 = null;
        this.anObjectArray1841 = null;
        this.anObjectArray1957 = null;
        this.anObjectArray1945 = null;
        this.anObjectArray1815 = null;
        this.anObjectArray1951 = null;
        this.anObjectArray1946 = null;
        this.anObjectArray1952 = null;
        this.anObjectArray1824 = null;
        this.anIntArray1819 = null;
        this.anObjectArray1919 = null;
        this.anObjectArray1913 = null;
        this.anObjectArray1959 = null;
        this.anObjectArray1872 = null;
        this.anObjectArray1907 = null;
        this.anIntArray1904 = null;
    }

    final void method3224(int argument_63_, int argument_64_, int argument_65_) {
        if (this.anIntArray1817 == null || this.anIntArray1817.length <= argument_64_) {
            int[] anLocalInts = new int[argument_64_ + 1];
            if (this.anIntArray1817 != null) {
                for (int anLocalInt = 0; anLocalInt < this.anIntArray1817.length; anLocalInt++)
                    anLocalInts[anLocalInt] = this.anIntArray1817[anLocalInt];
                for (int anLocalInt = this.anIntArray1817.length; argument_64_ > anLocalInt; anLocalInt++)
                    anLocalInts[anLocalInt] = -1;
            }
            this.anIntArray1817 = anLocalInts;
        }
        this.anIntArray1817[argument_64_] = argument_63_;
    }

    final void method3225(GraphicsToolkit argument_66_, Class167 argument_67_, byte argument_68_, Class350 argument_69_, int argument_70_) {
        argument_67_.method2656(argument_69_);
        Class38[] class38s = argument_67_.method2641();
        Class185[] class185s = argument_67_.method2655();
        if ((this.aClass104_Sub7_1842 == null || (this.aClass104_Sub7_1842.aBoolean4563)) && (class38s != null || class185s != null))
            this.aClass104_Sub7_1842 = DoublyLinkedNodeP2_Sub7.method1931(argument_70_, false);
        if (this.aClass104_Sub7_1842 != null)
            this.aClass104_Sub7_1842.method1925(argument_66_, (long) argument_70_, class38s, class185s, false);
    }

    final Class368 method3226(byte argument_71_, GraphicsToolkit argument_72_) {
        Statics.aBoolean5745 = false;
        long l = (((this.aBoolean1930 ? 1L : 0L) << 39) + ((!this.aBoolean1935 ? 0L : 1L) << 38) + (((this.aBoolean1962 ? 1L : 0L) << 35) + ((long) this.anInt1864 + ((long) this.anInt1826 << 36))) + ((long) this.anInt1823 << 40));
        Class368 class368 = (Class368) Statics.aClass149_1252.get(l);
        if (class368 != null)
            return class368;
        Class83 class83 = Class83.method1612(aJs5Store_1092, this.anInt1864, 0);
        if (class83 == null) {
            Statics.aBoolean5745 = true;
            return null;
        }
        if (this.aBoolean1935)
            class83.method1611();
        if (this.aBoolean1930)
            class83.method1604();
        if (this.anInt1826 <= 0) {
            if (this.anInt1823 != 0)
                class83.method1603(1);
        } else
            class83.method1603(this.anInt1826);
        if (this.anInt1826 >= 1)
            class83.method1607(1);
        if (this.anInt1826 >= 2)
            class83.method1607(16777215);
        if (this.anInt1823 != 0)
            class83.method1601(this.anInt1823 | ~0xffffff);
        class368 = argument_72_.method2033(class83, true);
        Statics.aClass149_1252.method2536(0, class368, l, (class368.method4019() * class368.method4022() * 4));
        return class368;
    }

    final void method3227(int argument_73_, short argument_74_, boolean argument_75_, short argument_76_) {
        if (argument_73_ < 5) {
            if (aShortArray1891 == null) {
                aShortArray1953 = new short[5];
                aShortArray1891 = new short[5];
            }
            aShortArray1891[argument_73_] = argument_76_;
            aShortArray1953[argument_73_] = argument_74_;
        }
    }

    final void method3228(String argument_77_, int argument_78_, int argument_79_) {
        if (aJagexHashMap_1850 == null) {
            aJagexHashMap_1850 = new JagexHashMap(16);
            aJagexHashMap_1850.put((long) argument_79_, new StringNode(argument_77_));
        } else {
            StringNode class59_sub34 = ((StringNode) aJagexHashMap_1850.get((long) argument_79_));
            if (class59_sub34 != null)
                class59_sub34.value = argument_77_;
            else
                aJagexHashMap_1850.put((long) argument_79_, new StringNode(argument_77_));
        }
    }

    final Class195 method3229(Class333 argument_80_, Class64 argument_81_, int argument_82_) {
        if (this.anInt1909 == -1)
            return null;
        if (argument_82_ != -65536)
            this.anInt1870 = -51;
        long l = (65535L << 16 & (long) this.anInt1836 << 16 | ((long) this.anInt1866 << 32 & 65535L << 32 | 65535L << 48 & (long) this.anInt1922 << 48) | (long) this.anInt1909 & 0xffffL);
        Class195 class195 = (Class195) Class214_Sub1.aClass149_5653.get(l);
        if (class195 == null) {
            class195 = argument_80_.method3727(argument_82_ + 47451, this.anInt1866, argument_81_, this.anInt1836, this.anInt1922, this.anInt1909);
            Class214_Sub1.aClass149_5653.put(class195, l);
        }
        return class195;
    }

    static final boolean isValidChar(char argument_83_) {
        if (argument_83_ >= ' ' && argument_83_ <= '~')
            return true;
        if (argument_83_ >= '\u00a0' && argument_83_ <= '\u00ff')
            return true;
        if (argument_83_ == '\u20ac' || argument_83_ == '\u0152' || argument_83_ == '\u2014' || argument_83_ == '\u0153' || argument_83_ == '\u0178')
            return true;
        return false;
    }

    final Class167 method3231(Class336 argument_84_, GraphicsToolkit argument_85_, byte argument_86_, Class26 argument_87_, int argument_88_, Class367 argument_89_, Class22 argument_90_, Class41 argument_91_, Class8 argument_92_, Class365 argument_93_, int argument_94_, int argument_95_, VariableValueSource argument_96_, Class383 argument_97_, int argument_98_) {
        Statics.aBoolean5745 = false;
        if (this.anInt1822 == 0)
            return null;
        if (this.anInt1822 == 1 && this.anInt1929 == -1)
            return null;
        if (this.anInt1822 == 1) {
            int anLocalInt = argument_95_;
            if (argument_89_ != null)
                argument_95_ |= argument_89_.method3997(true, argument_98_, 27123, argument_94_);
            long l = -1L;
            long[] ls = Class1.aLongArray3504;
            if (aShortArray1810 != null) {
                argument_95_ |= 0x4000;
                for (int anLocalInt_99_ = 0; aShortArray1810.length > anLocalInt_99_; anLocalInt_99_++) {
                    l = (l >>> 8 ^ ls[(int) (((long) (aShortArray1810[anLocalInt_99_] >> 8) ^ l) & 0xffL)]);
                    l = ls[(int) ((l ^ (long) aShortArray1810[anLocalInt_99_]) & 0xffL)] ^ l >>> 8;
                    l = ls[(int) ((l ^ (long) (aShortArray1863[anLocalInt_99_] >> 8)) & 0xffL)] ^ l >>> 8;
                    l = ls[(int) ((l ^ (long) aShortArray1863[anLocalInt_99_]) & 0xffL)] ^ l >>> 8;
                }
            }
            if (aShortArray1891 != null) {
                argument_95_ |= 0x8000;
                for (int anLocalInt_100_ = 0; aShortArray1891.length > anLocalInt_100_; anLocalInt_100_++) {
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) ((aShortArray1891[anLocalInt_100_]) >> 8)) & 0xffL)];
                    l = l >>> 8 ^ ls[(int) ((l ^ (long) (aShortArray1891[anLocalInt_100_])) & 0xffL)];
                    l = ls[(int) ((l ^ (long) (aShortArray1953[anLocalInt_100_] >> 8)) & 0xffL)] ^ l >>> 8;
                    l = ls[(int) ((l ^ (long) aShortArray1953[anLocalInt_100_]) & 0xffL)] ^ l >>> 8;
                }
            }
            long l_101_ = ((long) this.anInt1929 << 38 | ((long) argument_85_.anInt939 << 59 | (long) this.anInt1822 << 54) | l & 0x3fffffffffL);
            Class167 class167 = (Class167) Class371.aClass149_3191.get(l_101_);
            if (class167 == null || argument_85_.andPow(class167.ua(), argument_95_) != 0) {
                if (class167 != null)
                    argument_95_ = argument_85_.or(argument_95_, class167.ua());
                Class101 class101 = tia_sub_35_Sub1DoublyLinked.method1219(2085750768, aJs5Store_3759, this.anInt1929, 0);
                if (class101 == null) {
                    Statics.aBoolean5745 = true;
                    return null;
                }
                if (class101.anInt820 < 13)
                    class101.method1733(17496, 2);
                class167 = argument_85_.method2057(class101, argument_95_, Class276.anInt2219, 64, 768);
                if (aShortArray1810 != null) {
                    for (int anLocalInt_102_ = 0; aShortArray1810.length > anLocalInt_102_; anLocalInt_102_++)
                        class167.ia(aShortArray1810[anLocalInt_102_], aShortArray1863[anLocalInt_102_]);
                }
                if (aShortArray1891 != null) {
                    for (int anLocalInt_103_ = 0; aShortArray1891.length > anLocalInt_103_; anLocalInt_103_++)
                        class167.aa(aShortArray1891[anLocalInt_103_], aShortArray1953[anLocalInt_103_]);
                }
                Class371.aClass149_3191.put(class167, l_101_);
            }
            if (argument_89_ != null)
                class167 = argument_89_.method4000(argument_88_, class167, false, argument_98_, argument_95_, argument_94_);
            class167.s(anLocalInt);
            return class167;
        }
        if (this.anInt1822 == 2) {
            Class167 class167 = (argument_87_.method343((byte) 101, this.anInt1929).method3487(argument_88_, (byte) -32, argument_95_, argument_98_, argument_96_, argument_85_, argument_92_, argument_84_, argument_94_, argument_89_));
            if (class167 == null) {
                Statics.aBoolean5745 = true;
                return null;
            }
            return class167;
        }
        if (this.anInt1822 == 3) {
            if (argument_90_ == null)
                return null;
            Class167 class167 = argument_90_.method328(argument_89_, argument_87_, argument_88_, argument_97_, argument_85_, argument_98_, argument_96_, false, argument_95_, argument_94_, argument_84_, argument_93_);
            if (class167 == null) {
                Statics.aBoolean5745 = true;
                return null;
            }
            return class167;
        }
        if (this.anInt1822 == 4) {
            Class371 class371 = argument_93_.method3975(124, this.anInt1929);
            Class167 class167 = class371.method4057(argument_95_, argument_98_, 5, argument_89_, argument_88_, argument_94_, argument_85_, argument_90_, 10);
            if (class167 == null) {
                Statics.aBoolean5745 = true;
                return null;
            }
            return class167;
        }
        if (this.anInt1822 == 6) {
            Class167 class167 = (argument_87_.method343((byte) 98, this.anInt1929).method3493(argument_89_, argument_96_, argument_94_, argument_85_, null, argument_84_, 0, null, argument_91_, argument_98_, 0, argument_92_, 48, 0, null, argument_95_, 0, argument_88_));
            if (class167 == null) {
                Statics.aBoolean5745 = true;
                return null;
            }
            return class167;
        }
        if (this.anInt1822 == 7) {
            if (argument_90_ == null)
                return null;
            int anLocalInt = this.anInt1929 >>> 16;
            int anLocalInt_104_ = this.anInt1929 & 0xffff;
            int anLocalInt_105_ = this.anInt1861;
            Class167 class167 = argument_90_.method325(argument_97_, argument_88_, anLocalInt_105_, argument_95_, anLocalInt_104_, argument_98_, (byte) 104, argument_84_, argument_94_, anLocalInt, argument_89_, argument_85_);
            if (class167 == null) {
                Statics.aBoolean5745 = true;
                return null;
            }
            return class167;
        }
        return null;
    }

    static final void method3232(int argument) {
        Statics.aGraphicsToolkit5822.method2069(DoublyLinkedNodeP2_Sub4_Sub1.aClass350_6437);
        Statics.aGraphicsToolkit5822.DA(Node_Sub7.anInt3909, Statics.anInt6456, Class62_Sub16.anInt4417, Class47.anInt331);
    }

    static final void method3233(int argument, int argument_106_, byte argument_107_, int argument_108_) {
        if (argument != DoublyLinkedNodeP2_Sub8.anInt4581 || Class323.anInt2670 != argument_108_ || argument_106_ != Class257.anInt2007) {
            DoublyLinkedNodeP2_Sub8.anInt4581 = argument;
            Class323.anInt2670 = argument_108_;
            Class257.anInt2007 = argument_106_;
            Class18.aBoolean124 = true;
            double d = -((double) (argument * 2) * 3.141592653589793) / 16384.0;
            double d_109_ = (-((double) (argument_108_ * 2) * 3.141592653589793) / 16384.0);
            double d_110_ = Math.cos(d_109_);
            double d_111_ = Math.sin(d_109_);
            double d_112_ = Math.cos(d);
            double d_113_ = Math.sin(d);
            Node_Sub31_Sub28.aDouble5977 = d_110_;
            Statics.aDouble5742 = d_113_ * d_111_;
            Class62_Sub27.aDouble4456 = -d_111_ * d_112_;
            Node_Sub44.aDouble4253 = 0.0;
            Class183.aDouble1379 = d_110_ * d_112_;
            Class148.aDouble1121 = d_112_;
            Class62_Sub29.aDouble4465 = d_113_;
            Class274.aDouble2196 = -d_110_ * d_113_;
            Class110.aDouble910 = d_111_;
        }
    }

    public RsInterface() {
        this.anInt1811 = 0;
        this.anInt1826 = 0;
        this.anInt1825 = Class268.anInt2141;
        this.anInt1853 = 0;
        this.renderX = 0;
        this.anInt1849 = 0;
        this.aBoolean1868 = false;
        this.anInt1874 = 0;
        this.anInt1813 = 1;
        this.anInt1821 = 0;
        this.colour = 0;
        this.anInt1823 = 0;
        this.anInt1830 = 0;
        this.horizontalResizeMode = (byte) 0;
        this.anInt1852 = 0;
        this.anInt1870 = -1;
        this.aBoolean1835 = false;
        this.anInt1899 = 0;
        this.aClass59_Sub18_1860 = Statics.aClass59_Sub18_6329;
        this.anInt1888 = 0;
        this.anInt1861 = -1;
        this.anInt1906 = 100;
        this.anInt1903 = 0;
        this.renderY = 0;
        this.x = 0;
        this.anInt1889 = -1;
        this.anInt1886 = 0;
        this.anInt1909 = -1;
        this.anInt1887 = -1;
        this.anInt1838 = 0;
        this.aBoolean1908 = false;
        this.anInt1885 = 0;
        this.anInt1905 = 0;
        this.aString1921 = "";
        this.anInt1859 = 0;
        this.anInt1882 = 0;
        this.anInt1829 = 0;
        this.width = 0;
        this.aBoolean1917 = false;
        this.anInt1927 = -1;
        this.aBoolean1912 = false;
        this.anInt1864 = -1;
        this.renderWidth = 0;
        this.anInt1833 = -1;
        this.anInt1848 = 0;
        this.anInt1897 = -1;
        this.anInt1884 = 0;
        this.anInt1901 = 0;
        this.anInt1925 = 0;
        this.parentId = -1;
        this.anInt1898 = 1;
        this.aBoolean1911 = false;
        this.anInt1933 = 0;
        this.anInt1932 = -1;
        this.aBoolean1923 = false;
        this.anInt1937 = 0;
        this.aRsInterface_1947 = null;
        this.aBoolean1854 = false;
        this.anInt1924 = -1;
        this.idHash = -1;
        this.anInt1877 = 0;
        this.y = 0;
        this.anInt1857 = 2;
        this.anInt1948 = -1;
        this.verticalRepositionMode = (byte) 0;
        this.aBoolean1844 = false;
        this.aString1895 = "";
        this.aBoolean1862 = false;
        this.height = 0;
        this.aBoolean1871 = false;
        this.aBoolean1942 = false;
        this.subId = -1;
        this.aBoolean1958 = false;
        this.verticalResizeMode = (byte) 0;
        this.anInt1938 = 0;
        this.anInt1944 = 1;
        this.anInt1950 = 0;
        this.anInt1961 = 0;
        this.anInt1963 = -1;
        this.renderHeight = 0;
        this.anInt1928 = 1;
        this.anInt1960 = 0;
        this.anInt1954 = 0;
        this.aBoolean1962 = false;
        this.anInt1967 = 0;
        this.horizontalRepositionMode = (byte) 0;
        this.aString1968 = "";
    }

    static {
        anInt1881 = 0;
    }
}
