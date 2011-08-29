/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ClanSettings {
    int anInt1256 = -1;
    String[] aStringArray1257;
    private long[] aLongArray1258;
    private boolean useUserHashes;
    String[] memberDisplayNames;
    byte aByte1261;
    int memberCount;
    boolean aBoolean1263;
    byte aByte1264;
    byte aByte1265;
    private JagexHashMap settings;
    byte[] aByteArray1267;
    private int anInt1268;
    private int[] anIntArray1270;
    private boolean useDisplayNames;
    byte aByte1272;
    int updateNum;
    String aString1274 = null;
    int anInt1275;
    private long[] memberHashes;
    int anInt1278;
    long owner;
    private int[] anIntArray1281;

    final Integer getIntSetting(int id) {
        if (settings == null)
            return null;
        Node node = settings.get((long) id);
        if (node == null || !(node instanceof IntegerNode))
            return null;
        return ((IntegerNode) node).value;
    }

    final boolean method2744(int argument_5_, int argument_7_) {
        if (settings != null) {
            Node node = settings.get((long) argument_5_);
            if (node != null) {
                if (node instanceof IntegerNode) {
                    IntegerNode class59_sub54 = (IntegerNode) node;
                    if (argument_7_ == class59_sub54.value)
                        return false;
                    class59_sub54.value = argument_7_;
                    return true;
                }
                node.unlink();
            }
        } else
            settings = new JagexHashMap(4);
        settings.put((long) argument_5_, new IntegerNode(argument_7_));
        return true;
    }

    final int method2745(int argument_8_, int argument_9_, int argument_11_, int argument_12_) {
        int anLocalInt = (1 << argument_9_) - 1;
        int anLocalInt_13_ = argument_11_ != 31 ? (1 << argument_11_ + 1) - 1 : -1;
        int anLocalInt_14_ = anLocalInt_13_ ^ anLocalInt;
        argument_12_ <<= argument_9_;
        argument_12_ &= anLocalInt_14_;
        int anLocalInt_15_ = anIntArray1281[argument_8_];
        if (argument_12_ == (anLocalInt_15_ & anLocalInt_14_))
            return -1;
        anLocalInt_15_ &= anLocalInt_14_ ^ 0xffffffff;
        anIntArray1281[argument_8_] = MathStatics.OR(anLocalInt_15_, argument_12_);
        return argument_8_;
    }

    final int[] method2746(int argument_16_) {
        if (anIntArray1270 == null) {
            anIntArray1270 = new int[this.memberCount];
            String[] strings = new String[this.memberCount];
            for (int anLocalInt = 0; anLocalInt < this.memberCount; anLocalInt++) {
                strings[anLocalInt] = this.memberDisplayNames[anLocalInt];
                anIntArray1270[anLocalInt] = anLocalInt;
            }
            Class329.method3702(anIntArray1270, true, strings);
        }
        return anIntArray1270;
    }

    final Integer getBitSetting(int shift, int shift2, int index) {
        if (settings == null)
            return null;
        Node node = settings.get((long) index);
        if (node == null || !(node instanceof IntegerNode))
            return null;
        int mask = shift != 31 ? (1 << shift + 1) - 1 : -1;
        return (mask & (((IntegerNode) node).value)) >>> shift2;
    }

    final void addMember(long userhash, String displayname) {
        if (displayname != null && displayname.length() == 0)
            displayname = null;
        if (userhash > 0L == !useUserHashes)
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + useUserHashes + " but userhash:" + userhash);
        if (useDisplayNames != (displayname != null))
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + useDisplayNames + " but displayname:" + displayname);
        if ((userhash > 0L && (memberHashes == null || this.memberCount >= memberHashes.length)) || (displayname != null && (this.memberDisplayNames == null || (this.memberCount >= this.memberDisplayNames.length))))
            method2765(this.memberCount + 5, 0);
        if (memberHashes != null)
            memberHashes[this.memberCount] = userhash;
        if (this.memberDisplayNames != null)
            this.memberDisplayNames[this.memberCount] = displayname;
        if (this.anInt1256 == -1) {
            this.anInt1256 = this.memberCount;
            this.aByteArray1267[this.memberCount] = (byte) 126;
        } else
            this.aByteArray1267[this.memberCount] = (byte) 0;
        anIntArray1281[this.memberCount] = 0;
        this.memberCount++;
        anIntArray1270 = null;
    }

    private final void method2749(int argument_24_) {
        if (this.memberCount == 0) {
            this.anInt1275 = -1;
            this.anInt1256 = -1;
        } else {
            this.anInt1275 = -1;
            this.anInt1256 = -1;
            int anLocalInt = 0;
            byte anLocalInt_25_ = this.aByteArray1267[0];
            for (int anLocalInt_26_ = 1; anLocalInt_26_ < this.memberCount; anLocalInt_26_++) {
                if (anLocalInt_25_ >= this.aByteArray1267[anLocalInt_26_]) {
                    if (this.anInt1275 == -1 && (this.aByteArray1267[anLocalInt_26_] == 125))
                        this.anInt1275 = anLocalInt_26_;
                } else {
                    if (anLocalInt_25_ == 125)
                        this.anInt1275 = anLocalInt;
                    anLocalInt = anLocalInt_26_;
                    anLocalInt_25_ = this.aByteArray1267[anLocalInt_26_];
                }
            }
            this.anInt1256 = anLocalInt;
            if (this.anInt1256 != -1)
                this.aByteArray1267[this.anInt1256] = (byte) 126;
            if (argument_24_ != -5321)
                useDisplayNames = false;
        }
    }

    final Long getLongSetting(int argument_27_) {
        if (settings == null)
            return null;
        Node node = settings.get((long) argument_27_);
        if (node == null || !(node instanceof LongNode))
            return null;
        return new Long(((LongNode) node).value);
    }

    final boolean method2751(String argument_30_, int argument_31_) {
        if (argument_30_ == null)
            argument_30_ = "";
        else if (argument_30_.length() > 80)
            argument_30_ = argument_30_.substring(0, 80);
        if (settings != null) {
            Node node = settings.get((long) argument_31_);
            if (node != null) {
                if (node instanceof StringNode) {
                    StringNode class59_sub34 = (StringNode) node;
                    if (class59_sub34.value.equals(argument_30_))
                        return false;
                    class59_sub34.value = argument_30_;
                    return true;
                }
                node.unlink();
            }
        } else
            settings = new JagexHashMap(4);
        settings.put((long) argument_31_, new StringNode(argument_30_));
        return true;
    }

    final void method2752(int argument_33_) {
        this.anInt1278--;
        if (this.anInt1278 == 0) {
            aLongArray1258 = null;
            this.aStringArray1257 = null;
        } else {
            if (aLongArray1258 != null)
                JagStrings.memcpy(aLongArray1258, argument_33_ + 1, aLongArray1258, argument_33_, (-argument_33_ + this.anInt1278));
            if (this.aStringArray1257 != null)
                JagStrings.memcpy(this.aStringArray1257, argument_33_ + 1, this.aStringArray1257, argument_33_, (this.anInt1278 - argument_33_));
        }
    }

    private final void decode(Packet packet) {
        int version = packet.g1();
        if (version < 1 || version > 4)
            throw new RuntimeException("Unsupported ClanSettings version: " + version);
        int anLocalInt_36_ = packet.g1();
        if ((anLocalInt_36_ & 0x2) != 0)
            useDisplayNames = true;
        if ((anLocalInt_36_ & 0x1) != 0)
            useUserHashes = true;
        if (!useDisplayNames) {
            this.memberDisplayNames = null;
            this.aStringArray1257 = null;
        }
        if (!useUserHashes) {
            memberHashes = null;
            aLongArray1258 = null;
        }
        this.updateNum = packet.g4();
        anInt1268 = packet.g4();
        if (version <= 3 && anInt1268 != 0)
            anInt1268 += 16912800;
        this.memberCount = packet.g2();
        this.anInt1278 = packet.g1();
        this.aString1274 = packet.gstr();
        if (version >= 4)
            packet.g4();
        this.aBoolean1263 = packet.g1() == 1;
        this.aByte1265 = packet.g1s();
        this.aByte1264 = packet.g1s();
        this.aByte1272 = packet.g1s();
        this.aByte1261 = packet.g1s();
        if (this.memberCount > 0) {
            if (useUserHashes && (memberHashes == null || this.memberCount > memberHashes.length))
                memberHashes = new long[this.memberCount];
            if (useDisplayNames && (this.memberDisplayNames == null || (this.memberDisplayNames.length < this.memberCount)))
                this.memberDisplayNames = new String[this.memberCount];
            if (this.aByteArray1267 == null || (this.aByteArray1267.length < this.memberCount))
                this.aByteArray1267 = new byte[this.memberCount];
            if (anIntArray1281 == null || this.memberCount > anIntArray1281.length)
                anIntArray1281 = new int[this.memberCount];
            for (int anLocalInt_38_ = 0; anLocalInt_38_ < this.memberCount; anLocalInt_38_++) {
                if (useUserHashes)
                    memberHashes[anLocalInt_38_] = packet.g8();
                if (useDisplayNames)
                    this.memberDisplayNames[anLocalInt_38_] = packet.fastgstr((byte) 117);
                this.aByteArray1267[anLocalInt_38_] = packet.g1s();
                if (version >= 2)
                    anIntArray1281[anLocalInt_38_] = packet.g4();
            }
            method2749(-5321);
        }
        if (this.anInt1278 > 0) {
            if (useUserHashes && (aLongArray1258 == null || this.anInt1278 > aLongArray1258.length))
                aLongArray1258 = new long[this.anInt1278];
            if (useDisplayNames && (this.aStringArray1257 == null || (this.aStringArray1257.length < this.anInt1278)))
                this.aStringArray1257 = new String[this.anInt1278];
            for (int anLocalInt_39_ = 0; this.anInt1278 > anLocalInt_39_; anLocalInt_39_++) {
                if (useUserHashes)
                    aLongArray1258[anLocalInt_39_] = packet.g8();
                if (useDisplayNames)
                    this.aStringArray1257[anLocalInt_39_] = packet.fastgstr((byte) 106);
            }
        }
        if (version >= 3) {
            int anLocalInt_40_ = packet.g2();
            if (anLocalInt_40_ > 0) {
                settings = new JagexHashMap(anLocalInt_40_ < 16 ? MathStatics.method2589(anLocalInt_40_) : 16);
                while (anLocalInt_40_-- > 0) {
                    int anLocalInt_41_ = packet.g4();
                    int anLocalInt_42_ = anLocalInt_41_ & 0x3fffffff;
                    int anLocalInt_43_ = anLocalInt_41_ >>> 30;
                    if (anLocalInt_43_ != 0) {
                        if (anLocalInt_43_ == 1) {
                            long l = packet.g8();
                            settings.put((long) anLocalInt_42_, new LongNode(l));
                        } else if (anLocalInt_43_ == 2) {
                            String string = packet.gstr();
                            settings.put((long) anLocalInt_42_, new StringNode(string));
                        }
                    } else {
                        int anLocalInt_44_ = packet.g4();
                        settings.put((long) anLocalInt_42_, new IntegerNode(anLocalInt_44_));
                    }
                }
            }
        }
    }

    private final void method2754(int argument_45_, int argument_46_) {
        if (useUserHashes) {
            if (aLongArray1258 == null)
                aLongArray1258 = new long[argument_45_];
            else
                JagStrings.memcpy(aLongArray1258, 0, aLongArray1258 = new long[argument_45_], 0, this.anInt1278);
        }
        if (argument_46_ > -103)
            method2755(25, 88, 93);
        if (useDisplayNames) {
            if (this.aStringArray1257 != null)
                JagStrings.memcpy(this.aStringArray1257, 0, (this.aStringArray1257 = new String[argument_45_]), 0, this.anInt1278);
            else
                this.aStringArray1257 = new String[argument_45_];
        }
    }

    final int method2755(int argument_47_, int argument_48_, int argument_50_) {
        int anLocalInt = argument_47_ == 31 ? -1 : (1 << argument_47_ + 1) - 1;
        return (anIntArray1281[argument_48_] & anLocalInt) >>> argument_50_;
    }

    final String getStringSetting(int argument_51_) {
        if (settings == null)
            return null;
        Node node = settings.get((long) argument_51_);
        if (node == null || !(node instanceof StringNode))
            return null;
        return ((StringNode) node).value;
    }

    final boolean method2758(long argument_53_, int argument_54_, int argument_55_) {
        if (argument_54_ <= 61)
            memberHashes = null;
        if (settings != null) {
            Node node = settings.get((long) argument_55_);
            if (node != null) {
                if (node instanceof LongNode) {
                    LongNode longNode = (LongNode) node;
                    if (argument_53_ == longNode.value)
                        return false;
                    longNode.value = argument_53_;
                    return true;
                }
                node.unlink();
            }
        } else
            settings = new JagexHashMap(4);
        settings.put((long) argument_55_, new LongNode(argument_53_));
        return true;
    }

    final int method2759(byte argument_56_, String argument_57_) {
        if (argument_57_ == null || argument_57_.length() == 0)
            return -1;
        for (int anLocalInt = 0; anLocalInt < this.memberCount; anLocalInt++) {
            if (this.memberDisplayNames[anLocalInt].equals(argument_57_))
                return anLocalInt;
        }
        return -1;
    }

    final void doDeleteMember(int pos) {
        if (pos < 0 || this.memberCount <= pos)
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + pos + " memberCount:" + this.memberCount);
        anIntArray1270 = null;
        this.memberCount--;
        if (this.memberCount == 0) {
            this.anInt1275 = -1;
            this.memberDisplayNames = null;
            this.aByteArray1267 = null;
            memberHashes = null;
            anIntArray1281 = null;
            this.anInt1256 = -1;
        } else {
            JagStrings.memcpy(this.aByteArray1267, pos + 1, this.aByteArray1267, pos, this.memberCount - pos);
            JagStrings.memcpy(anIntArray1281, pos + 1, anIntArray1281, pos, this.memberCount - pos);
            if (memberHashes != null)
                JagStrings.memcpy(memberHashes, pos + 1, memberHashes, pos, (-pos + this.memberCount));
            if (this.memberDisplayNames != null)
                JagStrings.memcpy(this.memberDisplayNames, pos + 1, this.memberDisplayNames, pos, (-pos + this.memberCount));
            if (pos == this.anInt1256 || pos == this.anInt1275)
                method2749(-5321);
        }
    }

    final boolean method2763(int argument_60_, int argument_61_, int argument_62_, boolean argument_63_, int argument_64_) {
        int anLocalInt = (1 << argument_64_) - 1;
        int anLocalInt_65_ = argument_62_ == 31 ? -1 : (1 << argument_62_ + 1) - 1;
        argument_61_ <<= argument_64_;
        int anLocalInt_66_ = anLocalInt_65_ ^ anLocalInt;
        argument_61_ &= anLocalInt_66_;
        if (settings != null) {
            Node node = settings.get((long) argument_60_);
            if (node != null) {
                if (node instanceof IntegerNode) {
                    IntegerNode class59_sub54 = (IntegerNode) node;
                    if ((class59_sub54.value & anLocalInt_66_) == argument_61_)
                        return false;
                    class59_sub54.value &= anLocalInt_66_ ^ 0xffffffff;
                    class59_sub54.value |= argument_61_;
                    return true;
                }
                node.unlink();
            }
        } else
            settings = new JagexHashMap(4);
        settings.put((long) argument_60_, new IntegerNode(argument_61_));
        return true;
    }

    final void method2764(String displayname, long userhash) {
        if (displayname != null && displayname.length() == 0)
            displayname = null;
        if (!useUserHashes != userhash <= 0L)
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + useUserHashes + " but userhash:" + userhash);
        if ((displayname != null) == !useDisplayNames)
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + useDisplayNames + " but displayname:" + displayname);
        if ((userhash > 0L && (aLongArray1258 == null || aLongArray1258.length <= this.anInt1278)) || (displayname != null && (this.aStringArray1257 == null || (this.anInt1278 >= this.aStringArray1257.length))))
            method2754(this.anInt1278 + 5, -122);
        if (aLongArray1258 != null)
            aLongArray1258[this.anInt1278] = userhash;
        if (this.aStringArray1257 != null)
            this.aStringArray1257[this.anInt1278] = displayname;
        this.anInt1278++;
    }

    private final void method2765(int argument_70_, int argument_71_) {
        if (argument_71_ == 0) {
            if (useUserHashes) {
                if (memberHashes == null)
                    memberHashes = new long[argument_70_];
                else
                    JagStrings.memcpy(memberHashes, 0, (memberHashes = new long[argument_70_]), 0, this.memberCount);
            }
            if (useDisplayNames) {
                if (this.memberDisplayNames != null)
                    JagStrings.memcpy(this.memberDisplayNames, 0, (this.memberDisplayNames = new String[argument_70_]), 0, this.memberCount);
                else
                    this.memberDisplayNames = new String[argument_70_];
            }
            if (this.aByteArray1267 == null)
                this.aByteArray1267 = new byte[argument_70_];
            else
                JagStrings.memcpy(this.aByteArray1267, 0, (this.aByteArray1267 = new byte[argument_70_]), 0, this.memberCount);
            if (anIntArray1281 == null)
                anIntArray1281 = new int[argument_70_];
            else
                JagStrings.memcpy(anIntArray1281, 0, anIntArray1281 = new int[argument_70_], 0, this.memberCount);
        }
    }

    final int method2766(int argument_72_, byte argument_73_, byte argument_74_) {
        if (argument_74_ != 125)
            Statics.method2760((byte) 14);
        if (argument_73_ == 126 || argument_73_ == 127)
            return -1;
        if (argument_72_ == this.anInt1256 && (this.anInt1275 == -1 || (this.aByteArray1267[this.anInt1275]) < 125))
            return -1;
        if (this.aByteArray1267[argument_72_] == argument_73_)
            return -1;
        this.aByteArray1267[argument_72_] = argument_73_;
        method2749(argument_74_ - 5446);
        return argument_72_;
    }

    ClanSettings(Packet argument_75_) {
        anInt1268 = 0;
        this.updateNum = 0;
        this.anInt1275 = -1;
        decode(argument_75_);
    }

    private ClanSettings() {
        anInt1268 = 0;
        this.updateNum = 0;
        this.anInt1275 = -1;
    }
}
