/* Class303_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303_Sub1 extends Class303 {
    int anInt5407 = 99;
    static Js5Store aJs5Store_5408;
    static int[] anIntArray5409 = new int[13];
    /*synthetic*/ static Class aClass5410;

    final void method3577(ClipMap argument_0_, int argument_1_, GraphicsToolkit argument_2_, int argument_3_, byte argument_4_, int argument_5_, int argument_6_) {
        Interface2 interface2 = method3586(argument_5_, argument_6_, (byte) 95, argument_1_, argument_3_);
        if (argument_4_ != -102)
            anIntArray5409 = null;
        if (interface2 != null) {
            Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 126, interface2.method7(-23356));
            int anLocalInt = interface2.method2(-10908);
            int anLocalInt_7_ = interface2.method3(-2132);
            if (class266.method3339(argument_4_ ^ ~0x37))
                Class62_Sub17.method1423(argument_6_, argument_1_, false, class266, argument_3_);
            if (interface2.method6(argument_4_ + 196))
                interface2.method4(argument_2_, argument_4_ ^ 0x109b);
            if (argument_5_ != 0) {
                do {
                    if (argument_5_ != 1) {
                        if (argument_5_ == 2) {
                            dba_sub_772_Sub2.method1316(argument_6_, argument_1_, argument_3_, (aClass5410 != null ? aClass5410 : (aClass5410 = method3587("Interface2"))));
                            if (class266.anInt2068 != 0 && (this.mapWidth > (class266.anInt2128 + argument_1_)) && ((class266.anInt2128 + argument_3_) < this.mapDepth) && ((argument_1_ + class266.anInt2131) < this.mapWidth) && (this.mapDepth > (argument_3_ + class266.anInt2131)))
                                argument_0_.method3136((byte) 126, class266.anInt2128, class266.anInt2131, argument_3_, !class266.aBoolean2056, anLocalInt_7_, class266.aBoolean2085, argument_1_);
                            if (anLocalInt == 9) {
                                if ((anLocalInt_7_ & 0x1) != 0)
                                    Statics.method3260((byte) 69, argument_1_, 16, argument_6_, argument_3_);
                                else
                                    Statics.method3260((byte) 69, argument_1_, 8, argument_6_, argument_3_);
                            }
                        } else {
                            if (argument_5_ != 3)
                                break;
                            Class176.method2788(argument_6_, argument_1_, argument_3_);
                            if (class266.anInt2068 != 1)
                                break;
                            argument_0_.method3134(argument_1_, argument_3_, (byte) -121);
                        }
                        break;
                    }
                    Class179_Sub1.method2823(argument_6_, argument_1_, argument_3_);
                } while (false);
            } else {
                Class100.method1730(argument_6_, argument_1_, argument_3_);
                if (class266.anInt2068 != 0)
                    argument_0_.method3144(anLocalInt_7_, anLocalInt, argument_1_, (byte) -84, !class266.aBoolean2056, argument_3_, class266.aBoolean2085);
                if (class266.anInt2126 == 1) {
                    if (anLocalInt_7_ == 0)
                        Statics.method3260((byte) 69, argument_1_, 1, argument_6_, argument_3_);
                    else if (anLocalInt_7_ != 1) {
                        if (anLocalInt_7_ != 2) {
                            if (anLocalInt_7_ == 3)
                                Statics.method3260((byte) 69, argument_1_, 2, argument_6_, argument_3_);
                        } else
                            Statics.method3260((byte) 69, argument_1_ + 1, 1, argument_6_, argument_3_);
                    } else
                        Statics.method3260((byte) 69, argument_1_, 2, argument_6_, argument_3_ + 1);
                }
            }
        }
    }

    final void method3578(boolean argument_8_, GraphicsToolkit argument_9_, byte argument_10_) {
        Class305.method3592();
        if (!argument_8_) {
            if (this.mapHeight > 1) {
                for (int anLocalInt = 0; this.mapWidth > anLocalInt; anLocalInt++) {
                    for (int anLocalInt_11_ = 0; anLocalInt_11_ < this.mapDepth; anLocalInt_11_++) {
                        if (((tileSettings[1][anLocalInt][anLocalInt_11_]) & 0x2) == 2)
                            Node_Sub31_Sub21.method941(anLocalInt, anLocalInt_11_);
                    }
                }
            }
            for (int anLocalInt = 0; this.mapHeight > anLocalInt; anLocalInt++) {
                for (int anLocalInt_12_ = 0; this.mapDepth >= anLocalInt_12_; anLocalInt_12_++) {
                    for (int anLocalInt_13_ = 0; anLocalInt_13_ <= this.mapWidth; anLocalInt_13_++) {
                        if (((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_13_][anLocalInt_12_]) & 0x4) != 0) {
                            int anLocalInt_14_ = anLocalInt_13_;
                            int anLocalInt_15_ = anLocalInt_13_;
                            int anLocalInt_16_ = anLocalInt_12_;
                            int anLocalInt_17_ = anLocalInt_12_;
                            for (/**/; (anLocalInt_16_ > 0 && ((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_13_][anLocalInt_16_ - 1]) & 0x4) != 0); anLocalInt_16_--) {
                                if (anLocalInt_17_ - anLocalInt_16_ >= 10)
                                    break;
                            }
                            for (/**/; (this.mapDepth > anLocalInt_17_ && ((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_13_][anLocalInt_17_ + 1]) & 0x4) != 0); anLocalInt_17_++) {
                                if (-anLocalInt_16_ + anLocalInt_17_ >= 10)
                                    break;
                            }
                            while_220_:
                            for (/**/; anLocalInt_14_ > 0; anLocalInt_14_--) {
                                if (-anLocalInt_14_ + anLocalInt_15_ >= 10)
                                    break;
                                for (int anLocalInt_18_ = anLocalInt_16_; anLocalInt_18_ <= anLocalInt_17_; anLocalInt_18_++) {
                                    if (((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_14_ - 1][anLocalInt_18_]) & 0x4) == 0)
                                        break while_220_;
                                }
                            }
                            while_221_:
                            for (/**/; (anLocalInt_15_ < this.mapWidth && -anLocalInt_14_ + anLocalInt_15_ < 10); anLocalInt_15_++) {
                                for (int anLocalInt_19_ = anLocalInt_16_; anLocalInt_19_ <= anLocalInt_17_; anLocalInt_19_++) {
                                    if (((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_15_ + 1][anLocalInt_19_]) & 0x4) == 0)
                                        break while_221_;
                                }
                            }
                            if (((anLocalInt_17_ - anLocalInt_16_ + 1) * (-anLocalInt_14_ + anLocalInt_15_ + 1)) >= 4) {
                                int anLocalInt_20_ = (this.heightMap[anLocalInt][anLocalInt_14_][anLocalInt_16_]);
                                Class232.method3091(anLocalInt_20_, anLocalInt_20_, (anLocalInt_15_ << 9) + 512, (anLocalInt_17_ << 9) + 512, 4, anLocalInt_16_ << 9, (byte) 99, anLocalInt, anLocalInt_14_ << 9);
                                for (int anLocalInt_21_ = anLocalInt_14_; anLocalInt_15_ >= anLocalInt_21_; anLocalInt_21_++) {
                                    for (int anLocalInt_22_ = anLocalInt_16_; anLocalInt_22_ <= anLocalInt_17_; anLocalInt_22_++)
                                        ((Class303) this).aByteArrayArrayArray2558[anLocalInt][anLocalInt_21_][anLocalInt_22_] = (byte) (MathStatics.AND((this.aByteArrayArrayArray2558[anLocalInt][anLocalInt_21_][anLocalInt_22_]), -5));
                                }
                            }
                        }
                    }
                }
            }
            Statics.method3353((byte) -100);
        }
        ((Class303) this).aByteArrayArrayArray2558 = null;
    }

    final void readHDData(int mapLocalZ, Packet packet, GraphicsToolkit argument_25_, int mapLocalX, int[] argument_28_) {
        if (!this.aBoolean2561) {
            boolean anLocalBoolean = false;
            if (argument_28_ != null)
                argument_28_[0] = -1;
            AthmosphereDefinition athmosphereDefinition = null;
            while (packet.pos < packet.data.length) {
                int opcode = packet.g1();
                if (opcode == 0) {
                    athmosphereDefinition = new AthmosphereDefinition(packet);
                } else if (opcode == 1) {
                    int anLocalInt_44_ = packet.g1();
                    if (anLocalInt_44_ > 0) {
                        for (int anLocalInt_45_ = 0; anLocalInt_44_ > anLocalInt_45_; anLocalInt_45_++) {
                            VirtualLight virtualLight = new VirtualLight(argument_25_, packet);
                            if (virtualLight.anInt1995 == 31) {
                                Class223 class223 = (Class48.aClass73_343.method1539(packet.g2(), (byte) -59));
                                virtualLight.method3264(class223.anInt1559, class223.anInt1561, class223.anInt1560, false, class223.anInt1563);
                            }
                            if (argument_25_.method2016() > 0) {
                                HardwareLight class59_sub3 = (virtualLight.hardwareLight);
                                int anLocalInt_46_ = ((mapLocalX << 9) + class59_sub3.getX());
                                int anLocalInt_47_ = (class59_sub3.getZ() + (mapLocalZ << 9));
                                int anLocalInt_48_ = anLocalInt_46_ >> 9;
                                int anLocalInt_49_ = anLocalInt_47_ >> 9;
                                if (anLocalInt_48_ >= 0 && anLocalInt_49_ >= 0 && (this.mapWidth > anLocalInt_48_) && (anLocalInt_49_ < this.mapDepth)) {
                                    class59_sub3.setPosition(anLocalInt_46_, ((this.heightMap[(virtualLight.tileZ)][anLocalInt_48_][anLocalInt_49_]) - class59_sub3.getY()), anLocalInt_47_);
                                    LightingManager.addVirtualLight(virtualLight);
                                }
                            }
                        }
                    }
                } else if (opcode == 2) {
                    if (athmosphereDefinition == null)
                        athmosphereDefinition = new AthmosphereDefinition();
                    athmosphereDefinition.readUnknownValues(packet);
                } else if (opcode == 128) {
                    if (argument_28_ != null) {
                        argument_28_[0] = packet.g2();
                        argument_28_[1] = packet.g2s();
                        argument_28_[2] = packet.g2s();
                        argument_28_[3] = packet.g2s();
                        argument_28_[4] = packet.g2();
                    } else
                        packet.pos += 10;
                } else if (opcode == 129) {
                    if (this.aByteArrayArrayArray2553 == null)
                        ((Class303) this).aByteArrayArrayArray2553 = new byte[4][][];
                    for (int anLocalInt_29_ = 0; anLocalInt_29_ < 4; anLocalInt_29_++) {
                        byte anLocalInt_30_ = packet.g1s();
                        if (anLocalInt_30_ != 0 || (this.aByteArrayArrayArray2553[anLocalInt_29_]) == null) {
                            if (anLocalInt_30_ != 1) {
                                if (anLocalInt_30_ == 2) {
                                    if ((this.aByteArrayArrayArray2553[anLocalInt_29_]) == null)
                                        ((Class303) this).aByteArrayArrayArray2553[anLocalInt_29_] = (new byte
                                                [(this.mapWidth) + 1]
                                                [(this.mapDepth) + 1]);
                                    if (anLocalInt_29_ > 0) {
                                        int anLocalInt_31_ = mapLocalX;
                                        int anLocalInt_32_ = mapLocalX + 64;
                                        int anLocalInt_33_ = mapLocalZ;
                                        if (anLocalInt_33_ >= 0) {
                                            if (anLocalInt_33_ >= (this.mapDepth))
                                                anLocalInt_33_ = this.mapDepth;
                                        } else
                                            anLocalInt_33_ = 0;
                                        if (anLocalInt_31_ >= 0) {
                                            if ((this.mapWidth) <= anLocalInt_31_)
                                                anLocalInt_31_ = this.mapWidth;
                                        } else
                                            anLocalInt_31_ = 0;
                                        if (anLocalInt_32_ >= 0) {
                                            if (anLocalInt_32_ >= (this.mapWidth))
                                                anLocalInt_32_ = this.mapWidth;
                                        } else
                                            anLocalInt_32_ = 0;
                                        int anLocalInt_34_ = mapLocalZ + 64;
                                        if (anLocalInt_34_ < 0)
                                            anLocalInt_34_ = 0;
                                        else if ((this.mapDepth) <= anLocalInt_34_)
                                            anLocalInt_34_ = (this.mapDepth);
                                        for (/**/; (anLocalInt_31_ < anLocalInt_32_); anLocalInt_31_++) {
                                            for (/**/; (anLocalInt_34_ > anLocalInt_33_); anLocalInt_33_++)
                                                ((Class303) this).aByteArrayArrayArray2553[anLocalInt_29_][anLocalInt_31_][anLocalInt_33_] = (this.aByteArrayArrayArray2553[(anLocalInt_29_ - 1)][anLocalInt_31_][anLocalInt_33_]);
                                        }
                                    }
                                }
                            } else {
                                if ((this.aByteArrayArrayArray2553[anLocalInt_29_]) == null)
                                    ((Class303) this).aByteArrayArrayArray2553[anLocalInt_29_] = (new byte
                                            [(this.mapWidth) + 1]
                                            [(this.mapDepth) + 1]);
                                for (int anLocalInt_35_ = 0; anLocalInt_35_ < 64; anLocalInt_35_ += 4) {
                                    for (int anLocalInt_36_ = 0; anLocalInt_36_ < 64; anLocalInt_36_ += 4) {
                                        byte anLocalInt_37_ = (packet.g1s());
                                        for (int anLocalInt_38_ = (mapLocalX + anLocalInt_35_); ((mapLocalX + (anLocalInt_35_ + 4)) > anLocalInt_38_); anLocalInt_38_++) {
                                            for (int anLocalInt_39_ = (mapLocalZ + anLocalInt_36_); (anLocalInt_39_ < (anLocalInt_36_ + (mapLocalZ + 4))); anLocalInt_39_++) {
                                                if (anLocalInt_38_ >= 0 && ((this.mapWidth) > anLocalInt_38_) && (anLocalInt_39_ >= 0) && ((this.mapDepth) > anLocalInt_39_))
                                                    ((Class303) this).aByteArrayArrayArray2553[anLocalInt_29_][anLocalInt_38_][anLocalInt_39_] = anLocalInt_37_;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            int anLocalInt_40_ = mapLocalX;
                            int anLocalInt_41_ = mapLocalX + 64;
                            int anLocalInt_42_ = mapLocalZ;
                            if (anLocalInt_40_ < 0)
                                anLocalInt_40_ = 0;
                            else if (this.mapWidth <= anLocalInt_40_)
                                anLocalInt_40_ = this.mapWidth;
                            if (anLocalInt_41_ < 0)
                                anLocalInt_41_ = 0;
                            else if (this.mapWidth <= anLocalInt_41_)
                                anLocalInt_41_ = this.mapWidth;
                            int anLocalInt_43_ = mapLocalZ + 64;
                            if (anLocalInt_42_ < 0)
                                anLocalInt_42_ = 0;
                            else if (anLocalInt_42_ >= this.mapDepth)
                                anLocalInt_42_ = this.mapDepth;
                            if (anLocalInt_43_ < 0)
                                anLocalInt_43_ = 0;
                            else if (this.mapDepth <= anLocalInt_43_)
                                anLocalInt_43_ = this.mapDepth;
                            for (/**/; anLocalInt_41_ > anLocalInt_40_; anLocalInt_40_++) {
                                for (/**/; anLocalInt_42_ < anLocalInt_43_; anLocalInt_42_++)
                                    ((Class303) this).aByteArrayArrayArray2553[anLocalInt_29_][anLocalInt_40_][anLocalInt_42_] = (byte) 0;
                            }
                        }
                    }
                    anLocalBoolean = true;
                } else {
                    throw new IllegalStateException("");
                }
            }
            if (athmosphereDefinition != null) {
                for (int anLocalInt = 0; anLocalInt < 8; anLocalInt++) {
                    for (int anLocalInt_50_ = 0; anLocalInt_50_ < 8; anLocalInt_50_++) {
                        int x = anLocalInt + (mapLocalX >> 3);
                        int z = anLocalInt_50_ + (mapLocalZ >> 3);
                        if (x >= 0 && (this.mapWidth >> 3 > x) && z >= 0 && (this.mapDepth >> 3 > z))
                            AthmosphericConditions.setDefinitionForArea(athmosphereDefinition, x, z);
                    }
                }
            }
            if (!anLocalBoolean && this.aByteArrayArrayArray2553 != null) {
                for (int anLocalInt = 0; anLocalInt < 4; anLocalInt++) {
                    if (this.aByteArrayArrayArray2553[anLocalInt] != null) {
                        for (int anLocalInt_53_ = 0; anLocalInt_53_ < 16; anLocalInt_53_++) {
                            for (int anLocalInt_54_ = 0; anLocalInt_54_ < 16; anLocalInt_54_++) {
                                int anLocalInt_55_ = (mapLocalX >> 2) + anLocalInt_53_;
                                int anLocalInt_56_ = (mapLocalZ >> 2) + anLocalInt_54_;
                                if (anLocalInt_55_ >= 0 && anLocalInt_55_ < 26 && anLocalInt_56_ >= 0 && anLocalInt_56_ < 26)
                                    ((Class303) this).aByteArrayArrayArray2553[anLocalInt][anLocalInt_55_][anLocalInt_56_] = (byte) 0;
                            }
                        }
                    }
                }
            }
        }
    }

    static final boolean method3580(int argument_57_) {
        return !(argument_57_ != 0 && argument_57_ != 1 && argument_57_ != 2);
    }

    Class303_Sub1(int argument_58_, int argument_59_, int argument_60_, boolean argument_61_) {
        super(argument_58_, argument_59_, argument_60_, argument_61_, Statics.aClass51_1250, Statics.aClass297_3521);
    }

    final void loadObjectMapBlock(int argument_62_, ClipMap[] argument_63_, int argument_64_, int argument_65_, int argument_66_, GraphicsToolkit argument_67_, int argument_68_, int argument_69_, int argument_70_, int argument_71_, byte[] argument_72_) {
        Packet class59_sub28 = new Packet(argument_72_);
        int anLocalInt = argument_66_;
        for (; ; ) {
            int anLocalInt_73_ = class59_sub28.gmultismart(argument_66_ ^ 0x49e6);
            if (anLocalInt_73_ == 0)
                break;
            anLocalInt += anLocalInt_73_;
            int anLocalInt_74_ = 0;
            for (; ; ) {
                int anLocalInt_75_ = class59_sub28.gsmart(-2);
                if (anLocalInt_75_ == 0)
                    break;
                anLocalInt_74_ += anLocalInt_75_ - 1;
                int anLocalInt_76_ = anLocalInt_74_ & 0x3f;
                int anLocalInt_77_ = (anLocalInt_74_ & 0xfc8) >> 6;
                int anLocalInt_78_ = anLocalInt_74_ >> 12;
                int anLocalInt_79_ = class59_sub28.g1();
                int anLocalInt_80_ = anLocalInt_79_ >> 2;
                int anLocalInt_81_ = anLocalInt_79_ & 0x3;
                if (argument_62_ == anLocalInt_78_ && anLocalInt_77_ >= argument_69_ && anLocalInt_77_ < argument_69_ + 8 && argument_70_ <= anLocalInt_76_ && anLocalInt_76_ < argument_70_ + 8) {
                    Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 115, anLocalInt);
                    int anLocalInt_82_ = (argument_64_ + DoublyLinkedNodeP2_Sub6.method1917(anLocalInt_81_, argument_71_, argument_66_ ^ 0x3f, (class266.anInt2131), (class266.anInt2128), anLocalInt_77_ & 0x7, anLocalInt_76_ & 0x7));
                    int anLocalInt_83_ = (Class269.method3360(class266.anInt2131, anLocalInt_81_, argument_66_ ^ 0x2b, argument_71_, anLocalInt_77_ & 0x7, class266.anInt2128, anLocalInt_76_ & 0x7) + argument_65_);
                    if (anLocalInt_82_ > 0 && anLocalInt_83_ > 0 && anLocalInt_82_ < this.mapWidth - 1 && this.mapDepth - 1 > anLocalInt_83_) {
                        ClipMap clipMap = null;
                        if (!this.aBoolean2561) {
                            int anLocalInt_84_ = argument_68_;
                            if (((tileSettings[1][anLocalInt_82_][anLocalInt_83_]) & 0x2) == 2)
                                anLocalInt_84_--;
                            if (anLocalInt_84_ >= 0)
                                clipMap = argument_63_[anLocalInt_84_];
                        }
                        addObjectToRenderer(argument_67_, anLocalInt, argument_68_, anLocalInt_80_, true, anLocalInt_83_, -1, anLocalInt_81_ + argument_71_ & 0x3, argument_68_, anLocalInt_82_, clipMap);
                    }
                }
            }
        }
    }

    public static void method3582(int argument) {
        aJs5Store_5408 = null;
        anIntArray5409 = null;
    }

    final void loadObjectMap(GraphicsToolkit argument_85_, int mapLocalX, byte argument_87_, ClipMap[] argument_88_, byte[] data, int mapLocalZ) {
        Packet packet = new Packet(data);
        int objectId = -1;
        for (; ; ) {
            int objectIdDelta = packet.gmultismart(-18919);
            if (objectIdDelta == 0)
                break;
            objectId += objectIdDelta;
            int coordinateValue = 0;
            for (; ; ) {
                int coordinateDelta = packet.gsmart(argument_87_ + 60);
                if (coordinateDelta == 0)
                    break;
                coordinateValue += coordinateDelta - 1;
                int localZ = coordinateValue & 0x3f;
                int localX = (coordinateValue & 0xfc6) >> 6;
                int localY = coordinateValue >> 12;
                int settingsValue = packet.g1();
                int objectType = settingsValue >> 2;
                int objectRotation = settingsValue & 0x3;
                int x = mapLocalX + localX;
                int z = mapLocalZ + localZ;
                if (x > 0 && z > 0 && x < this.mapWidth - 1 && z < this.mapDepth - 1) {
                    ClipMap clipMap = null;
                    if (!this.aBoolean2561) {
                        int tileY = localY;
                        if (((tileSettings[1][x][z]) & 0x2) == 2)
                            tileY--;
                        if (tileY >= 0)
                            clipMap = argument_88_[tileY];
                    }
                    addObjectToRenderer(argument_85_, objectId, localY, objectType, true, z, -1, objectRotation, localY, x, clipMap);
                }
            }
        }
    }

    final void addObjectToRenderer(GraphicsToolkit argument_103_, int argument_104_, int argument_105_, int argument_106_, boolean argument_107_, int argument_108_, int argument_109_, int argument_110_, int argument_111_, int argument_112_, ClipMap argument_113_) {
        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub25_4332.method1458(36) != 0 || Class239.method3126(argument_108_, argument_112_, Statics.anInt136, false, argument_105_)) {
            if (this.anInt5407 > argument_111_)
                this.anInt5407 = argument_111_;
            Class266 class266 = Node_Sub31_Sub30.aClass257_5983.method3298((byte) 30, argument_104_);
            if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub19_4323.method1432(66) != 0 || !class266.aBoolean2064) {
                int anLocalInt;
                int anLocalInt_114_;
                if (argument_110_ != 1 && argument_110_ != 3) {
                    anLocalInt_114_ = class266.anInt2131;
                    anLocalInt = class266.anInt2128;
                } else {
                    anLocalInt = class266.anInt2131;
                    anLocalInt_114_ = class266.anInt2128;
                }
                int anLocalInt_115_;
                int anLocalInt_116_;
                if (anLocalInt + argument_112_ <= this.mapWidth) {
                    anLocalInt_116_ = argument_112_ + (anLocalInt + 1 >> 1);
                    anLocalInt_115_ = argument_112_ + (anLocalInt >> 1);
                } else {
                    anLocalInt_115_ = argument_112_;
                    anLocalInt_116_ = argument_112_ + 1;
                }
                int anLocalInt_117_;
                int anLocalInt_118_;
                if (this.mapDepth >= anLocalInt_114_ + argument_108_) {
                    anLocalInt_117_ = argument_108_ + (anLocalInt_114_ >> 1);
                    anLocalInt_118_ = (anLocalInt_114_ + 1 >> 1) + argument_108_;
                } else {
                    anLocalInt_117_ = argument_108_;
                    anLocalInt_118_ = argument_108_ + 1;
                }
                Class_s class_s = Node_Sub31_Sub5.aClass_sArray5858[argument_105_];
                int anLocalInt_119_ = ((class_s.method3534(anLocalInt_115_, !argument_107_, anLocalInt_117_) + class_s.method3534(anLocalInt_116_, false, anLocalInt_117_) + class_s.method3534(anLocalInt_115_, false, anLocalInt_118_) + class_s.method3534(anLocalInt_116_, !argument_107_, anLocalInt_118_)) >> 2);
                int anLocalInt_120_ = (argument_112_ << 9) + (anLocalInt << 8);
                int anLocalInt_121_ = (anLocalInt_114_ << 8) + (argument_108_ << 9);
                boolean anLocalBoolean = (Node_Sub31_Sub24.aBoolean5946 && !this.aBoolean2561 && class266.aBoolean2107);
                if (class266.method3339(57))
                    Class245_Sub2.method3192(argument_112_, argument_108_, null, class266, null, argument_110_, -109, argument_111_);
                boolean anLocalBoolean_122_ = (argument_109_ == -1 && class266.anInt2055 == -1 && class266.anIntArray2063 == null && class266.anIntArray2067 == null && !class266.aBoolean2087 && !class266.aBoolean2083);
                if (!Statics.aBoolean717 || ((!Statics.method767(-15931, argument_106_) || class266.anInt2126 == 1) && (!Class271.method3368((byte) 84, argument_106_) || class266.anInt2126 != 0))) {
                    if (argument_106_ == 22) {
                        if (AthmosphericConditions.aClass59_Sub50_116.aClass62_Sub7_4307.method1384(29) != 0 || class266.anInt2123 != 0 || class266.anInt2068 == 1 || class266.aBoolean2106) {
                            DoublyLinkedNodeP2_Sub2_Sub4 class104_sub2_sub4;
                            if (anLocalBoolean_122_) {
                                DoublyLinkedNodeP2_Sub2_Sub4_Sub2 class104_sub2_sub4_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub4_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_110_, anLocalBoolean));
                                if (class104_sub2_sub4_sub2.method6(75))
                                    class104_sub2_sub4_sub2.method8(argument_103_, -4947);
                                class104_sub2_sub4 = class104_sub2_sub4_sub2;
                            } else
                                class104_sub2_sub4 = (new DoublyLinkedNodeP2_Sub2_Sub4_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_110_, argument_109_));
                            Class100.method1732(argument_111_, argument_112_, argument_108_, class104_sub2_sub4);
                            if (class266.anInt2068 == 1 && argument_113_ != null)
                                argument_113_.method3129(argument_108_, argument_112_, 262144);
                        }
                    } else if (argument_106_ == 10 || argument_106_ == 11) {
                        DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2 = null;
                        DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2;
                        int anLocalInt_123_;
                        if (anLocalBoolean_122_) {
                            DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2_124_ = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, argument_112_ + (anLocalInt - 1), argument_108_, anLocalInt_114_ + argument_108_ - 1, argument_106_, argument_110_, anLocalBoolean));
                            anLocalInt_123_ = class104_sub2_sub2_sub2_124_.method1813((byte) -124);
                            class104_sub2_sub2 = class104_sub2_sub2_sub2_124_;
                            class104_sub2_sub2_sub2 = class104_sub2_sub2_sub2_124_;
                        } else {
                            class104_sub2_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub3(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, argument_112_ - 1 + anLocalInt, argument_108_, anLocalInt_114_ + argument_108_ - 1, argument_106_, argument_110_, argument_109_));
                            anLocalInt_123_ = 15;
                        }
                        if (Node_Sub47_Sub6.method1126(class104_sub2_sub2, false)) {
                            if (class104_sub2_sub2_sub2 != null && class104_sub2_sub2_sub2.method6(72))
                                class104_sub2_sub2_sub2.method8(argument_103_, -4947);
                            if (class266.aBoolean2082 && Node_Sub31_Sub24.aBoolean5946) {
                                if (anLocalInt_123_ > 30)
                                    anLocalInt_123_ = 30;
                                for (int anLocalInt_125_ = 0; anLocalInt >= anLocalInt_125_; anLocalInt_125_++) {
                                    for (int anLocalInt_126_ = 0; anLocalInt_126_ <= anLocalInt_114_; anLocalInt_126_++)
                                        class_s.ka((anLocalInt_125_ + argument_112_), (argument_108_ + anLocalInt_126_), anLocalInt_123_);
                                }
                            }
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3135(!class266.aBoolean2056, argument_108_, anLocalInt_114_, argument_112_, anLocalInt, class266.aBoolean2085);
                    } else if (argument_106_ >= 12 && argument_106_ <= 17 || argument_106_ >= 18 && argument_106_ <= 21) {
                        DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2;
                        if (anLocalBoolean_122_) {
                            DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, anLocalInt + (argument_112_ - 1), argument_108_, argument_108_ + anLocalInt_114_ - 1, argument_106_, argument_110_, anLocalBoolean));
                            if (class104_sub2_sub2_sub2.method6(112))
                                class104_sub2_sub2_sub2.method8(argument_103_, -4947);
                            class104_sub2_sub2 = class104_sub2_sub2_sub2;
                        } else
                            class104_sub2_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub3(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, argument_112_ + (anLocalInt - 1), argument_108_, argument_108_ + anLocalInt_114_ - 1, argument_106_, argument_110_, argument_109_));
                        Node_Sub47_Sub6.method1126(class104_sub2_sub2, false);
                        if (Node_Sub31_Sub24.aBoolean5946 && !this.aBoolean2561 && argument_106_ >= 12 && argument_106_ <= 17 && argument_106_ != 13 && argument_111_ > 0 && class266.anInt2126 != 0)
                            ((Class303) this).aByteArrayArrayArray2558[argument_111_][argument_112_][argument_108_] = (byte) (MathStatics.OR((this.aByteArrayArrayArray2558[argument_111_][argument_112_][argument_108_]), 4));
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3135(!class266.aBoolean2056, argument_108_, anLocalInt_114_, argument_112_, anLocalInt, class266.aBoolean2085);
                    } else if (argument_106_ == 0) {
                        int anLocalInt_127_ = class266.anInt2126;
                        if (dba_sub_772_Sub2.aBoolean6364 && class266.anInt2126 == -1)
                            anLocalInt_127_ = 1;
                        DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3;
                        if (!anLocalBoolean_122_)
                            class104_sub2_sub3 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, argument_109_));
                        else {
                            DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, anLocalBoolean));
                            if (class104_sub2_sub3_sub1.method6(91))
                                class104_sub2_sub3_sub1.method8(argument_103_, -4947);
                            class104_sub2_sub3 = class104_sub2_sub3_sub1;
                        }
                        DoublyLinkedNodeP2_Sub3.method1898(argument_111_, argument_112_, argument_108_, class104_sub2_sub3, null);
                        if (argument_110_ != 0) {
                            if (argument_110_ != 1) {
                                if (argument_110_ != 2) {
                                    if (argument_110_ == 3) {
                                        if (Node_Sub31_Sub24.aBoolean5946 && (class266.aBoolean2082)) {
                                            class_s.ka(argument_112_, argument_108_, 50);
                                            class_s.ka(argument_112_ + 1, argument_108_, 50);
                                        }
                                        if (anLocalInt_127_ == 1 && !this.aBoolean2561)
                                            Node_Sub31_Sub23.method951((class266.anInt2084), argument_111_, argument_108_, (class266.anInt2074), 2, argument_112_, -15768);
                                    }
                                } else {
                                    if (Node_Sub31_Sub24.aBoolean5946 && (class266.aBoolean2082)) {
                                        class_s.ka(argument_112_ + 1, argument_108_, 50);
                                        class_s.ka(argument_112_ + 1, argument_108_ + 1, 50);
                                    }
                                    if (anLocalInt_127_ == 1 && !this.aBoolean2561)
                                        Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, -class266.anInt2074, 1, argument_112_ + 1, -15768);
                                }
                            } else {
                                if (Node_Sub31_Sub24.aBoolean5946 && class266.aBoolean2082) {
                                    class_s.ka(argument_112_, argument_108_ + 1, 50);
                                    class_s.ka(argument_112_ + 1, argument_108_ + 1, 50);
                                }
                                if (anLocalInt_127_ == 1 && !this.aBoolean2561)
                                    Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_ + 1, -class266.anInt2074, 2, argument_112_, -15768);
                            }
                        } else {
                            if (Node_Sub31_Sub24.aBoolean5946 && class266.aBoolean2082) {
                                class_s.ka(argument_112_, argument_108_, 50);
                                class_s.ka(argument_112_, argument_108_ + 1, 50);
                            }
                            if (anLocalInt_127_ == 1 && !this.aBoolean2561)
                                Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, class266.anInt2074, 1, argument_112_, -15768);
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3133(argument_108_, (class266.aBoolean2085), argument_106_, -15874, !(class266.aBoolean2056), argument_110_, argument_112_);
                        if (class266.anInt2091 != 64)
                            Class256_Sub4.method3292(argument_111_, argument_112_, argument_108_, (class266.anInt2091));
                    } else if (argument_106_ == 1) {
                        DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3;
                        if (anLocalBoolean_122_) {
                            DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, anLocalBoolean));
                            class104_sub2_sub3 = class104_sub2_sub3_sub1;
                            if (class104_sub2_sub3_sub1.method6(74))
                                class104_sub2_sub3_sub1.method8(argument_103_, -4947);
                        } else
                            class104_sub2_sub3 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, argument_109_));
                        DoublyLinkedNodeP2_Sub3.method1898(argument_111_, argument_112_, argument_108_, class104_sub2_sub3, null);
                        if (class266.aBoolean2082 && Node_Sub31_Sub24.aBoolean5946) {
                            if (argument_110_ != 0) {
                                if (argument_110_ != 1) {
                                    if (argument_110_ == 2)
                                        class_s.ka(argument_112_ + 1, argument_108_, 50);
                                    else if (argument_110_ == 3)
                                        class_s.ka(argument_112_, argument_108_, 50);
                                } else
                                    class_s.ka(argument_112_ + 1, argument_108_ + 1, 50);
                            } else
                                class_s.ka(argument_112_, argument_108_ + 1, 50);
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3133(argument_108_, (class266.aBoolean2085), argument_106_, -15874, !(class266.aBoolean2056), argument_110_, argument_112_);
                    } else if (argument_106_ == 2) {
                        int anLocalInt_128_ = argument_110_ + 1 & 0x3;
                        DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3;
                        DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3_129_;
                        if (!anLocalBoolean_122_) {
                            class104_sub2_sub3 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_ + 4, argument_109_));
                            class104_sub2_sub3_129_ = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, anLocalInt_128_, argument_109_));
                        } else {
                            DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_ + 4, anLocalBoolean));
                            DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1_130_ = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, anLocalInt_128_, anLocalBoolean));
                            if (class104_sub2_sub3_sub1.method6(127))
                                class104_sub2_sub3_sub1.method8(argument_103_, -4947);
                            class104_sub2_sub3 = class104_sub2_sub3_sub1;
                            if (class104_sub2_sub3_sub1_130_.method6(81))
                                class104_sub2_sub3_sub1_130_.method8(argument_103_, -4947);
                            class104_sub2_sub3_129_ = class104_sub2_sub3_sub1_130_;
                        }
                        DoublyLinkedNodeP2_Sub3.method1898(argument_111_, argument_112_, argument_108_, class104_sub2_sub3, class104_sub2_sub3_129_);
                        if ((class266.anInt2126 == 1 || (dba_sub_772_Sub2.aBoolean6364 && class266.anInt2126 == -1)) && !this.aBoolean2561) {
                            if (argument_110_ != 0) {
                                if (argument_110_ != 1) {
                                    if (argument_110_ != 2) {
                                        if (argument_110_ == 3) {
                                            Node_Sub31_Sub23.method951((class266.anInt2084), argument_111_, argument_108_, (class266.anInt2074), 1, argument_112_, -15768);
                                            Node_Sub31_Sub23.method951((class266.anInt2084), argument_111_, argument_108_, (class266.anInt2074), 2, argument_112_, -15768);
                                        }
                                    } else {
                                        Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, class266.anInt2074, 1, argument_112_ + 1, -15768);
                                        Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, class266.anInt2074, 2, argument_112_, -15768);
                                    }
                                } else {
                                    Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, class266.anInt2074, 1, argument_112_ + 1, -15768);
                                    Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_ + 1, class266.anInt2074, 2, argument_112_, -15768);
                                }
                            } else {
                                Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, class266.anInt2074, 1, argument_112_, -15768);
                                Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_ + 1, class266.anInt2074, 2, argument_112_, -15768);
                            }
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3133(argument_108_, (class266.aBoolean2085), argument_106_, -15874, !(class266.aBoolean2056), argument_110_, argument_112_);
                        if (class266.anInt2091 != 64)
                            Class256_Sub4.method3292(argument_111_, argument_112_, argument_108_, (class266.anInt2091));
                    } else if (argument_106_ == 3) {
                        DoublyLinkedNodeP2_Sub2_Sub3 class104_sub2_sub3;
                        if (anLocalBoolean_122_) {
                            DoublyLinkedNodeP2_Sub2_Sub3_Sub1 class104_sub2_sub3_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, anLocalBoolean));
                            class104_sub2_sub3 = class104_sub2_sub3_sub1;
                            if (class104_sub2_sub3_sub1.method6(105))
                                class104_sub2_sub3_sub1.method8(argument_103_, -4947);
                        } else
                            class104_sub2_sub3 = (new DoublyLinkedNodeP2_Sub2_Sub3_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_106_, argument_110_, argument_109_));
                        DoublyLinkedNodeP2_Sub3.method1898(argument_111_, argument_112_, argument_108_, class104_sub2_sub3, null);
                        if (class266.aBoolean2082 && Node_Sub31_Sub24.aBoolean5946) {
                            if (argument_110_ != 0) {
                                if (argument_110_ == 1)
                                    class_s.ka(argument_112_ + 1, argument_108_ + 1, 50);
                                else if (argument_110_ != 2) {
                                    if (argument_110_ == 3)
                                        class_s.ka(argument_112_, argument_108_, 50);
                                } else
                                    class_s.ka(argument_112_ + 1, argument_108_, 50);
                            } else
                                class_s.ka(argument_112_, argument_108_ + 1, 50);
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3133(argument_108_, (class266.aBoolean2085), argument_106_, -15874, !(class266.aBoolean2056), argument_110_, argument_112_);
                    } else if (argument_106_ == 9) {
                        DoublyLinkedNodeP2_Sub2_Sub2 class104_sub2_sub2;
                        if (anLocalBoolean_122_) {
                            DoublyLinkedNodeP2_Sub2_Sub2_Sub2 class104_sub2_sub2_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, argument_112_, argument_108_, argument_108_, argument_106_, argument_110_, anLocalBoolean));
                            if (class104_sub2_sub2_sub2.method6(69))
                                class104_sub2_sub2_sub2.method8(argument_103_, -4947);
                            class104_sub2_sub2 = class104_sub2_sub2_sub2;
                        } else
                            class104_sub2_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub2_Sub3(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, argument_112_, argument_112_ + anLocalInt - 1, argument_108_, anLocalInt_114_ - 1 + argument_108_, argument_106_, argument_110_, argument_109_));
                        Node_Sub47_Sub6.method1126(class104_sub2_sub2, false);
                        if (class266.anInt2126 == 1 && !this.aBoolean2561) {
                            int anLocalInt_131_;
                            if ((argument_110_ & 0x1) == 0)
                                anLocalInt_131_ = 8;
                            else
                                anLocalInt_131_ = 16;
                            Node_Sub31_Sub23.method951(class266.anInt2084, argument_111_, argument_108_, 0, anLocalInt_131_, argument_112_, -15768);
                        }
                        if (class266.anInt2068 != 0 && argument_113_ != null)
                            argument_113_.method3135(!class266.aBoolean2056, argument_108_, anLocalInt_114_, argument_112_, anLocalInt, class266.aBoolean2085);
                        if (class266.anInt2091 != 64)
                            Class256_Sub4.method3292(argument_111_, argument_112_, argument_108_, (class266.anInt2091));
                    } else if (argument_107_ == true) {
                        if (argument_106_ == 4) {
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1;
                            if (anLocalBoolean_122_) {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, argument_110_));
                                class104_sub2_sub1 = class104_sub2_sub1_sub2;
                                if (class104_sub2_sub1_sub2.method6(68))
                                    class104_sub2_sub1_sub2.method8(argument_103_, -4947);
                            } else
                                class104_sub2_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, argument_110_, argument_109_));
                            Node_Sub31_Sub16.method927(argument_111_, argument_112_, argument_108_, class104_sub2_sub1, null);
                        } else if (argument_106_ == 5) {
                            int anLocalInt_132_ = 65;
                            Interface2 interface2 = ((Interface2) (Node_Sub31_Sub15_Sub1.method921(argument_111_, argument_112_, argument_108_)));
                            if (interface2 != null)
                                anLocalInt_132_ = (Node_Sub31_Sub30.aClass257_5983.method3298((byte) 23, interface2.method7(-23356)).anInt2091) + 1;
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1;
                            if (!anLocalBoolean_122_)
                                class104_sub2_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, (Class154.anIntArray3617[argument_110_] * anLocalInt_132_), (Class274.anIntArray2195[argument_110_] * anLocalInt_132_), argument_106_, argument_110_, argument_109_));
                            else {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, anLocalInt_132_ * (Class154.anIntArray3617[argument_110_]), anLocalInt_132_ * (Class274.anIntArray2195[argument_110_]), argument_106_, argument_110_));
                                if (class104_sub2_sub1_sub2.method6(126))
                                    class104_sub2_sub1_sub2.method8(argument_103_, -4947);
                                class104_sub2_sub1 = class104_sub2_sub1_sub2;
                            }
                            Node_Sub31_Sub16.method927(argument_111_, argument_112_, argument_108_, class104_sub2_sub1, null);
                        } else if (argument_106_ == 6) {
                            int anLocalInt_133_ = 33;
                            Interface2 interface2 = ((Interface2) (Node_Sub31_Sub15_Sub1.method921(argument_111_, argument_112_, argument_108_)));
                            if (interface2 != null)
                                anLocalInt_133_ = (Node_Sub31_Sub30.aClass257_5983.method3298((byte) 102, interface2.method7(-23356)).anInt2091) / 2 + 1;
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1;
                            if (!anLocalBoolean_122_)
                                class104_sub2_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, anLocalInt_133_ * (Class262.anIntArray2042[argument_110_]), (Class41.anIntArray307[argument_110_] * anLocalInt_133_), argument_106_, argument_110_ + 4, argument_109_));
                            else {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, anLocalInt_133_ * (Class154.anIntArray3617[argument_110_]), (Class274.anIntArray2195[argument_110_] * anLocalInt_133_), argument_106_, argument_110_ + 4));
                                if (class104_sub2_sub1_sub2.method6(60))
                                    class104_sub2_sub1_sub2.method8(argument_103_, -4947);
                                class104_sub2_sub1 = class104_sub2_sub1_sub2;
                            }
                            Node_Sub31_Sub16.method927(argument_111_, argument_112_, argument_108_, class104_sub2_sub1, null);
                        } else if (argument_106_ == 7) {
                            int anLocalInt_134_ = argument_110_ + 2 & 0x3;
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1;
                            if (anLocalBoolean_122_) {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, anLocalInt_134_ + 4));
                                class104_sub2_sub1 = class104_sub2_sub1_sub2;
                                if (class104_sub2_sub1_sub2.method6(127))
                                    class104_sub2_sub1_sub2.method8(argument_103_, -4947);
                            } else
                                class104_sub2_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, anLocalInt_134_ + 4, argument_109_));
                            Node_Sub31_Sub16.method927(argument_111_, argument_112_, argument_108_, class104_sub2_sub1, null);
                        } else if (argument_106_ == 8) {
                            int anLocalInt_135_ = argument_110_ + 2 & 0x3;
                            int anLocalInt_136_ = 33;
                            Interface2 interface2 = ((Interface2) (Node_Sub31_Sub15_Sub1.method921(argument_111_, argument_112_, argument_108_)));
                            if (interface2 != null)
                                anLocalInt_136_ = (Node_Sub31_Sub30.aClass257_5983.method3298((byte) 70, interface2.method7(-23356)).anInt2091) / 2 + 1;
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1;
                            DoublyLinkedNodeP2_Sub2_Sub1 class104_sub2_sub1_137_;
                            if (!anLocalBoolean_122_) {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub1 class104_sub2_sub1_sub1 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, anLocalInt_136_ * (Class262.anIntArray2042[argument_110_]), (Class41.anIntArray307[argument_110_] * anLocalInt_136_), argument_106_, argument_110_ + 4, argument_109_));
                                class104_sub2_sub1_137_ = class104_sub2_sub1_sub1;
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub1 class104_sub2_sub1_sub1_138_ = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub1(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, anLocalInt_135_ + 4, argument_109_));
                                class104_sub2_sub1 = class104_sub2_sub1_sub1_138_;
                            } else {
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2 = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, anLocalInt_136_ * (Class262.anIntArray2042[argument_110_]), anLocalInt_136_ * (Class41.anIntArray307[argument_110_]), argument_106_, argument_110_ + 4));
                                DoublyLinkedNodeP2_Sub2_Sub1_Sub2 class104_sub2_sub1_sub2_139_ = (new DoublyLinkedNodeP2_Sub2_Sub1_Sub2(argument_103_, class266, argument_111_, argument_105_, anLocalInt_120_, anLocalInt_119_, anLocalInt_121_, this.aBoolean2561, 0, 0, argument_106_, anLocalInt_135_ + 4));
                                if (class104_sub2_sub1_sub2.method6(64))
                                    class104_sub2_sub1_sub2.method8(argument_103_, -4947);
                                if (class104_sub2_sub1_sub2_139_.method6(119))
                                    class104_sub2_sub1_sub2_139_.method8(argument_103_, -4947);
                                class104_sub2_sub1 = class104_sub2_sub1_sub2_139_;
                                class104_sub2_sub1_137_ = class104_sub2_sub1_sub2;
                            }
                            Node_Sub31_Sub16.method927(argument_111_, argument_112_, argument_108_, class104_sub2_sub1_137_, class104_sub2_sub1);
                        }
                    }
                }
            }
        }
    }

    final void method3585(int argument_140_, boolean argument_141_, int _y, int[] argument_143_, int argument_144_, int argument_145_, Packet packet, int argument_147_, int argument_148_, int argument_149_, GraphicsToolkit argument_150_) {
        if (!this.aBoolean2561) {
            boolean anLocalBoolean = argument_141_;
            AthmosphereDefinition athmosphereDefinition = null;
            if (argument_143_ != null)
                argument_143_[0] = -1;
            int anLocalInt = (argument_147_ & 0x7) * 8;
            int anLocalInt_151_ = (argument_149_ & 0x7) * 8;
            while (packet.data.length > packet.pos) {
                int anLocalInt_152_ = packet.g1();
                if (anLocalInt_152_ != 0) {
                    if (anLocalInt_152_ != 1) {
                        if (anLocalInt_152_ != 2) {
                            if (anLocalInt_152_ != 128) {
                                if (anLocalInt_152_ == 129) {
                                    if ((this.aByteArrayArrayArray2553) == null)
                                        ((Class303) this).aByteArrayArrayArray2553 = new byte[4][][];
                                    for (int anLocalInt_153_ = 0; anLocalInt_153_ < 4; anLocalInt_153_++) {
                                        byte anLocalInt_154_ = packet.g1s();
                                        if (anLocalInt_154_ != 0 || (this.aByteArrayArrayArray2553[_y]) == null) {
                                            if (anLocalInt_154_ == 1) {
                                                if ((this.aByteArrayArrayArray2553[_y]) == null)
                                                    ((Class303) this).aByteArrayArrayArray2553[_y] = (new byte
                                                            [(this.mapWidth) + 1]
                                                            [(this.mapDepth) + 1]);
                                                for (int anLocalInt_155_ = 0; anLocalInt_155_ < 64; anLocalInt_155_ += 4) {
                                                    for (int anLocalInt_156_ = 0; anLocalInt_156_ < 64; anLocalInt_156_ += 4) {
                                                        byte anLocalInt_157_ = (packet.g1s());
                                                        if (anLocalInt_153_ <= argument_144_) {
                                                            for (int anLocalInt_158_ = anLocalInt_155_; ((anLocalInt_155_ + 4) > anLocalInt_158_); anLocalInt_158_++) {
                                                                for (int anLocalInt_159_ = anLocalInt_156_; ((anLocalInt_156_ + 4) > anLocalInt_159_); anLocalInt_159_++) {
                                                                    if ((anLocalInt_158_ >= anLocalInt) && (anLocalInt_158_ < anLocalInt + 8) && (anLocalInt_159_ >= anLocalInt_151_) && (anLocalInt_151_ < anLocalInt_151_ + 8)) {
                                                                        int anLocalInt_160_ = Node_Sub19.method716(anLocalInt_159_ & 0x7, -17020, anLocalInt_158_ & 0x7, argument_148_) + argument_145_;
                                                                        int anLocalInt_161_ = BufferedFile.method3770(argument_148_, anLocalInt_159_ & 0x7, anLocalInt_158_ & 0x7) + argument_140_;
                                                                        if ((anLocalInt_160_ >= 0) && anLocalInt_160_ < this.mapWidth && anLocalInt_161_ >= 0 && this.mapDepth > anLocalInt_161_)
                                                                            ((Class303) this).aByteArrayArrayArray2553[_y][anLocalInt_160_][anLocalInt_161_] = anLocalInt_157_;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (argument_144_ >= anLocalInt_153_) {
                                            int _x = argument_145_;
                                            int maxX = argument_145_ + 7;
                                            int _z = argument_140_;
                                            if (_x < 0)
                                                _x = 0;
                                            else if (_x >= (this.mapWidth))
                                                _x = (this.mapWidth);
                                            int maxZ = argument_140_ + 7;
                                            if (_z >= 0) {
                                                if (_z >= (this.mapDepth))
                                                    _z = (this.mapDepth);
                                            } else
                                                _z = 0;
                                            if (maxX >= 0) {
                                                if (maxX >= (this.mapWidth))
                                                    maxX = (this.mapWidth);
                                            } else
                                                maxX = 0;
                                            if (maxZ >= 0) {
                                                if (maxZ >= (this.mapDepth))
                                                    maxZ = (this.mapDepth);
                                            } else
                                                maxZ = 0;
                                            for (/**/; (_x < maxX); _x++) {
                                                for (/**/; (_z < maxZ); _z++)
                                                    ((Class303) this).aByteArrayArrayArray2553[_y][_x][_z] = (byte) 0;
                                            }
                                        }
                                    }
                                } else
                                    throw new IllegalStateException("");
                            } else if (argument_143_ == null)
                                packet.pos += 10;
                            else {
                                argument_143_[0] = packet.g2();
                                argument_143_[1] = packet.g2s();
                                argument_143_[2] = packet.g2s();
                                argument_143_[3] = packet.g2s();
                                argument_143_[4] = packet.g2();
                            }
                        } else {
                            if (athmosphereDefinition == null)
                                athmosphereDefinition = new AthmosphereDefinition();
                            athmosphereDefinition.readUnknownValues(packet);
                        }
                    } else {
                        int anLocalInt_166_ = packet.g1();
                        if (anLocalInt_166_ > 0) {
                            for (int anLocalInt_167_ = 0; anLocalInt_166_ > anLocalInt_167_; anLocalInt_167_++) {
                                VirtualLight virtualLight = new VirtualLight(argument_150_, packet);
                                if (virtualLight.anInt1995 == 31) {
                                    Class223 class223 = (Class48.aClass73_343.method1539(packet.g2(), (byte) -59));
                                    virtualLight.method3264(class223.anInt1559, class223.anInt1561, class223.anInt1560, false, class223.anInt1563);
                                }
                                if (argument_150_.method2016() > 0) {
                                    HardwareLight class59_sub3 = (virtualLight.hardwareLight);
                                    int anLocalInt_168_ = class59_sub3.getX() >> 9;
                                    int anLocalInt_169_ = (class59_sub3.getZ() >> 9);
                                    if ((argument_144_ == virtualLight.tileZ) && anLocalInt_168_ >= anLocalInt && anLocalInt_168_ < anLocalInt + 8 && anLocalInt_169_ >= anLocalInt_151_ && (anLocalInt_151_ + 8 > anLocalInt_169_)) {
                                        int anLocalInt_170_ = ((argument_145_ << 9) + (Class90.method1679((class59_sub3.getX() & 0xfff), false, argument_148_, (class59_sub3.getZ() & 0xfff))));
                                        anLocalInt_168_ = anLocalInt_170_ >> 9;
                                        int anLocalInt_171_ = ((argument_140_ << 9) + (Class353_Sub5.method3905((class59_sub3.getX() & 0xfff), argument_148_, (class59_sub3.getZ() & 0xfff), true)));
                                        anLocalInt_169_ = anLocalInt_171_ >> 9;
                                        if (anLocalInt_168_ >= 0 && anLocalInt_169_ >= 0 && (this.mapWidth > anLocalInt_168_) && (anLocalInt_169_ < (this.mapDepth))) {
                                            class59_sub3.setPosition(anLocalInt_170_, ((this.heightMap[argument_144_][anLocalInt_168_][anLocalInt_169_]) - class59_sub3.getY()), anLocalInt_171_);
                                            LightingManager.addVirtualLight(virtualLight);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else
                    athmosphereDefinition = new AthmosphereDefinition(packet);
            }
            if (athmosphereDefinition != null)
                AthmosphericConditions.setDefinitionForArea(athmosphereDefinition, argument_145_ >> 3, argument_140_ >> 3);
            if (!anLocalBoolean && this.aByteArrayArrayArray2553 != null && (this.aByteArrayArrayArray2553[_y] != null)) {
                int anLocalInt_172_ = argument_145_ + 7;
                int anLocalInt_173_ = argument_140_ + 7;
                for (int anLocalInt_174_ = argument_145_; anLocalInt_172_ > anLocalInt_174_; anLocalInt_174_++) {
                    for (int anLocalInt_175_ = argument_140_; anLocalInt_175_ < anLocalInt_173_; anLocalInt_175_++)
                        ((Class303) this).aByteArrayArrayArray2553[_y][anLocalInt_174_][anLocalInt_175_] = (byte) 0;
                }
            }
        }
    }

    final Interface2 method3586(int argument_176_, int argument_177_, byte argument_178_, int argument_179_, int argument_180_) {
        Interface2 interface2 = null;
        if (argument_176_ == 0)
            interface2 = ((Interface2) Node_Sub31_Sub15_Sub1.method921(argument_177_, argument_179_, argument_180_));
        if (argument_176_ == 1)
            interface2 = (Interface2) GlTexture_Sub2.method2492(argument_177_, argument_179_, argument_180_);
        if (argument_176_ == 2)
            interface2 = ((Interface2) LoadingBar.method2831(argument_177_, argument_179_, argument_180_, (aClass5410 != null ? aClass5410 : (aClass5410 = method3587("Interface2")))));
        if (argument_176_ == 3)
            interface2 = (Interface2) Statics.method1330(argument_177_, argument_179_, argument_180_);
        return interface2;
    }

    /*synthetic*/
    static Class method3587(String argument) {
        try {
            return Class.forName(argument);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
