/* Class59_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Node_Sub8 extends Node {
    int anInt3921 = -2147483648;
    int anInt3922 = -2147483648;
    int anInt3923;
    int anInt3924 = 2147483647;
    int anInt3925;
    Node_Sub7 aClass59_Sub7_3926;
    int anInt3927;
    int anInt3928;
    int anInt3929;

    static final void method570(int argument, boolean argument_0_, int argument_1_, int argument_2_, int argument_3_, int argument_4_, int argument_5_, int argument_6_, int argument_7_, int argument_8_, RsInterface[] argument_9_) {
        Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
        for (int anLocalInt = 0; argument_9_.length > anLocalInt; anLocalInt++) {
            RsInterface rsInterface = argument_9_[anLocalInt];
            if (rsInterface != null && (rsInterface.parentId == argument_5_ || (argument_5_ == -1412584499 && rsInterface == dba_sub_772.aRsInterface_4345))) {
                int anLocalInt_10_ = argument_7_ + rsInterface.renderX;
                int anLocalInt_11_ = argument_6_ + rsInterface.renderY;
                int anLocalInt_12_ = rsInterface.renderWidth + anLocalInt_10_ + 1;
                int anLocalInt_13_ = rsInterface.renderHeight + 1 + anLocalInt_11_;
                int anLocalInt_14_;
                if (argument_8_ != -1)
                    anLocalInt_14_ = argument_8_;
                else {
                    Class_s.aRectangleArray2545[Node_Sub47_Sub8.anInt6193].setBounds(argument_7_ + rsInterface.renderX, rsInterface.renderY + argument_6_, rsInterface.renderWidth, rsInterface.renderHeight);
                    anLocalInt_14_ = Node_Sub47_Sub8.anInt6193++;
                }
                rsInterface.anInt1924 = Class333.anInt2720;
                rsInterface.anInt1932 = anLocalInt_14_;
                if (!client.method108(rsInterface)) {
                    if (rsInterface.anInt1859 != 0)
                        Node_Sub32_Sub4.method1032(rsInterface, (byte) 9);
                    int x = argument_7_ + rsInterface.renderX;
                    int y = rsInterface.renderY + argument_6_;
                    int anLocalInt_17_ = 0;
                    int anLocalInt_18_ = 0;
                    if (Class52.aBoolean391) {
                        anLocalInt_17_ = Node_Sub52.method1319(99);
                        anLocalInt_18_ = Class82.method1596(-2);
                    }
                    int alpha = rsInterface.anInt1967;
                    if (dba_sub_772_Sub2.aBoolean6372 && ((client.method122(rsInterface).anInt4005) != 0 || rsInterface.type == 0) && alpha > 127)
                        alpha = 127;
                    if (rsInterface == dba_sub_772.aRsInterface_4345) {
                        if (argument_5_ != -1412584499 && ((DoublyLinkedNodeP2_Sub2_Sub1_Sub1.anInt6558 == rsInterface.anInt1825) || (rsInterface.anInt1825 == Class268.anInt2141))) {
                            Node_Sub33.anInt4145 = argument_7_;
                            Class48.aRsInterfaceArray344 = argument_9_;
                            Statics.anInt360 = argument_6_;
                            continue;
                        }
                        if (Packet.aBoolean4121 && GlImageSkybox.aBoolean829) {
                            int anLocalInt_20_ = (anLocalInt_17_ + client.mouseHandler.getX());
                            int anLocalInt_21_ = (client.mouseHandler.getY() + anLocalInt_18_);
                            anLocalInt_20_ -= Node_Sub31_Sub15_Sub1.anInt6637;
                            anLocalInt_21_ -= GlImageSkybox.anInt839;
                            if (Statics.anInt3517 > anLocalInt_20_)
                                anLocalInt_20_ = Statics.anInt3517;
                            if ((Class235.aRsInterface_1717.renderWidth + Statics.anInt3517) < (rsInterface.renderWidth + anLocalInt_20_))
                                anLocalInt_20_ = (-rsInterface.renderWidth + ((Class235.aRsInterface_1717.renderWidth) + Statics.anInt3517));
                            if (Class22.anInt140 > anLocalInt_21_)
                                anLocalInt_21_ = Class22.anInt140;
                            x = anLocalInt_20_;
                            if ((rsInterface.renderHeight + anLocalInt_21_) > (Class235.aRsInterface_1717.renderHeight) + Class22.anInt140)
                                anLocalInt_21_ = (Class22.anInt140 + (Class235.aRsInterface_1717.renderHeight) - rsInterface.renderHeight);
                            y = anLocalInt_21_;
                        }
                        if (rsInterface.anInt1825 == Class268.anInt2141)
                            alpha = 128;
                    }
                    int anLocalInt_22_;
                    int anLocalInt_23_;
                    int anLocalInt_24_;
                    int anLocalInt_25_;
                    if (rsInterface.type != 2) {
                        int anLocalInt_26_ = rsInterface.renderWidth + x;
                        int anLocalInt_27_ = rsInterface.renderHeight + y;
                        anLocalInt_22_ = (y <= argument_1_ ? argument_1_ : y);
                        if (rsInterface.type == 9) {
                            anLocalInt_27_++;
                            anLocalInt_26_++;
                        }
                        anLocalInt_25_ = (x > argument_2_ ? x : argument_2_);
                        anLocalInt_24_ = (anLocalInt_27_ >= argument ? argument : anLocalInt_27_);
                        anLocalInt_23_ = (argument_4_ <= anLocalInt_26_ ? argument_4_ : anLocalInt_26_);
                    } else {
                        anLocalInt_22_ = argument_1_;
                        anLocalInt_23_ = argument_4_;
                        anLocalInt_24_ = argument;
                        anLocalInt_25_ = argument_2_;
                    }
                    if (anLocalInt_23_ > anLocalInt_25_ && anLocalInt_22_ < anLocalInt_24_) {
                        if (rsInterface.anInt1859 != 0) {
                            if ((rsInterface.anInt1859 == Class283.anInt2276) || (DoublyLinkedNodeP2_Sub2_Sub5.anInt6426 == rsInterface.anInt1859)) {
                                Class376.method4091(x, y, 55, rsInterface);
                                if (!Class52.aBoolean391) {
                                    Node_Sub31_Sub39.method1008((byte) 44, x, (rsInterface.anInt1859 == DoublyLinkedNodeP2_Sub2_Sub5.anInt6426), y, rsInterface.renderWidth, rsInterface.renderHeight);
                                    Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                }
                                Class109_Sub1.aBooleanArray4604[anLocalInt_14_] = true;
                                continue;
                            }
                            if (rsInterface.anInt1859 == Node_Sub39.anInt4198) {
                                if (rsInterface.method3213(0, Class389.aGraphicsToolkit3281) != null) {
                                    Class47.method453((byte) -89);
                                    Class353_Sub9.method3917((Class389.aGraphicsToolkit3281), x, rsInterface, y, 10);
                                    Class189_Sub3.aBooleanArray5651[anLocalInt_14_] = true;
                                    Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                    if (Class52.aBoolean391) {
                                        if (!argument_0_)
                                            DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                        else
                                            Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    }
                                }
                                continue;
                            }
                            if (Class52.anInt393 == rsInterface.anInt1859) {
                                Class_aa.method159(rsInterface, (byte) -33, Class389.aGraphicsToolkit3281, y, x);
                                continue;
                            }
                            if (Packet.anInt4119 == rsInterface.anInt1859) {
                                Class62_Sub4.method1369(x, Class389.aGraphicsToolkit3281, false, (rsInterface.colour) % 64, rsInterface, y);
                                continue;
                            }
                            if (Statics.anInt1726 == rsInterface.anInt1859) {
                                if (rsInterface.method3213(argument_3_ ^ 0x7800, Class389.aGraphicsToolkit3281) != null) {
                                    Class82.method1595(x, false, rsInterface, y);
                                    Class189_Sub3.aBooleanArray5651[anLocalInt_14_] = true;
                                    Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                    if (Class52.aBoolean391) {
                                        if (!argument_0_)
                                            DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                        else
                                            Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    }
                                }
                                continue;
                            }
                            if (Class32.anInt214 == rsInterface.anInt1859) {
                                Class70.method1517(Class22.anTextureSource_142, (byte) 127, x, (rsInterface.renderHeight), Class389.aGraphicsToolkit3281, (rsInterface.renderWidth), y);
                                Class109_Sub1.aBooleanArray4604[anLocalInt_14_] = true;
                                Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                continue;
                            }
                            if (Class107.anInt878 == rsInterface.anInt1859) {
                                Node_Sub31_Sub39.method1005(121, y, Class389.aGraphicsToolkit3281, x, rsInterface.renderWidth, rsInterface.renderHeight);
                                Class109_Sub1.aBooleanArray4604[anLocalInt_14_] = true;
                                Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                continue;
                            }
                            if (Class306.anInt2583 == rsInterface.anInt1859) {
                                if (Node_Sub31_Sub27.aBoolean5959 || Class62.aBoolean444) {
                                    int anLocalInt_28_ = (x + rsInterface.renderWidth);
                                    if (Class52.aBoolean391) {
                                        if (argument_0_)
                                            Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                        else
                                            DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                    }
                                    int anLocalInt_29_ = y + 15;
                                    if (Node_Sub31_Sub27.aBoolean5959) {
                                        int anLocalInt_30_ = -256;
                                        if (Class350_Sub1.anInt5433 < 20)
                                            anLocalInt_30_ = -65536;
                                        Node_Sub47_Sub9.aAbstractFont_6203.method492(anLocalInt_30_, "Fps:" + Class350_Sub1.anInt5433, -1, anLocalInt_28_, anLocalInt_29_, -1);
                                        anLocalInt_29_ += 15;
                                        Runtime runtime = Runtime.getRuntime();
                                        int anLocalInt_31_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                                        int anLocalInt_32_ = -256;
                                        if (anLocalInt_31_ > 98304) {
                                            if (client.force64MB) {
                                                Node_Sub5.method556(false);
                                                for (int anLocalInt_33_ = 0; anLocalInt_33_ < 10; anLocalInt_33_++)
                                                    System.gc();
                                                anLocalInt_31_ = (int) (((runtime.totalMemory()) + -(runtime.freeMemory())) / 1024L);
                                                if (anLocalInt_31_ > 65536)
                                                    Class214.method2986((byte) 96, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4);
                                            }
                                            anLocalInt_32_ = -65536;
                                        }
                                        Node_Sub47_Sub9.aAbstractFont_6203.method492(anLocalInt_32_, "Mem:" + anLocalInt_31_ + "k", -1, anLocalInt_28_, anLocalInt_29_, -1);
                                        anLocalInt_29_ += 15;
                                        Node_Sub47_Sub9.aAbstractFont_6203.method492(-256, ("In:" + Packet.anInt4120 + "B/s Out:" + Node_Sub39.anInt4196 + "B/s"), -1, anLocalInt_28_, anLocalInt_29_, -1);
                                        anLocalInt_29_ += 15;
                                        int anLocalInt_34_ = (Class389.aGraphicsToolkit3281.getMemoryUsage() / 1024);
                                        Node_Sub47_Sub9.aAbstractFont_6203.method492((anLocalInt_34_ > 65536 ? -65536 : -256), "Offheap:" + anLocalInt_34_ + "k", -1, anLocalInt_28_, anLocalInt_29_, -1);
                                        anLocalInt_29_ += 15;
                                        int anLocalInt_35_ = 0;
                                        int anLocalInt_36_ = 0;
                                        int anLocalInt_37_ = 0;
                                        for (int anLocalInt_38_ = 0; anLocalInt_38_ < 37; anLocalInt_38_++) {
                                            if ((client.fileStores[anLocalInt_38_]) != null) {
                                                anLocalInt_35_ += (client.fileStores[anLocalInt_38_].getFileCount());
                                                anLocalInt_36_ += (client.fileStores[anLocalInt_38_].getCompleteFileCount());
                                                anLocalInt_37_ += (client.fileStores[anLocalInt_38_].getHighestCompleteFile());
                                            }
                                        }
                                        int anLocalInt_39_ = (anLocalInt_37_ * 100 / anLocalInt_35_);
                                        int anLocalInt_40_ = (anLocalInt_36_ * 10000 / anLocalInt_35_);
                                        String string = ("Cache:" + (Class368_Sub3.method4035(true, (long) anLocalInt_40_, 0, 2, -1262897456)) + "% (" + anLocalInt_39_ + "%)");
                                        Class226.aAbstractFont_1641.method492(-256, string, -1, anLocalInt_28_, anLocalInt_29_, argument_3_ - 30721);
                                        anLocalInt_29_ += 12;
                                    }
                                    if (Class62_Sub8.anInt4395 > 0)
                                        Class226.aAbstractFont_1641.method492(-256, ("Particles: " + Class367.anInt3101 + " / " + Class62_Sub8.anInt4395), -1, anLocalInt_28_, anLocalInt_29_, argument_3_ ^ ~0x7800);
                                    anLocalInt_29_ += 12;
                                    if (Class62.aBoolean444) {
                                        Class226.aAbstractFont_1641.method492(-256, ("Polys: " + Class389.aGraphicsToolkit3281.I() + " Models: " + Class389.aGraphicsToolkit3281.M()), -1, anLocalInt_28_, anLocalInt_29_, -1);
                                        anLocalInt_29_ += 12;
                                        Class226.aAbstractFont_1641.method492(-256, ("Ls: " + Class126.anInt1032 + " La: " + Class2_Sub8.anInt3803 + " NPC: " + Class233.anInt1696 + " Pl: " + Node_Sub1.anInt3870), -1, anLocalInt_28_, anLocalInt_29_, argument_3_ ^ ~0x7800);
                                        Class236.method3116(91);
                                        anLocalInt_29_ += 12;
                                    }
                                    Class109_Sub1.aBooleanArray4604[anLocalInt_14_] = true;
                                }
                                continue;
                            }
                        }
                        if (rsInterface.type == 0) {
                            if ((rsInterface.anInt1859 == Class_s_Sub1.anInt5331) && Class389.aGraphicsToolkit3281.method2019())
                                Class389.aGraphicsToolkit3281.method2062(x, y, rsInterface.renderWidth, rsInterface.renderHeight);
                            method570(anLocalInt_24_, argument_0_, anLocalInt_22_, anLocalInt_25_, 30720, anLocalInt_23_, rsInterface.idHash, (-rsInterface.anInt1838 + y), (x - rsInterface.anInt1950), anLocalInt_14_, argument_9_);
                            if (rsInterface.children != null)
                                method570(anLocalInt_24_, argument_0_, anLocalInt_22_, anLocalInt_25_, 30720, anLocalInt_23_, rsInterface.idHash, (-rsInterface.anInt1838 + y), (x - rsInterface.anInt1950), anLocalInt_14_, (rsInterface.children));
                            Node_Sub49 class59_sub49 = ((Node_Sub49) (Class2_Sub5.aJagexHashMap_3787.get((long) rsInterface.idHash)));
                            if (class59_sub49 != null)
                                Class85.method1624(anLocalInt_24_, anLocalInt_25_, anLocalInt_23_, argument_3_ ^ 0x7800, anLocalInt_14_, class59_sub49.anInt4291, x, anLocalInt_22_, y);
                            if ((Class_s_Sub1.anInt5331 == rsInterface.anInt1859) && Class389.aGraphicsToolkit3281.method2019())
                                Class389.aGraphicsToolkit3281.method2098();
                            Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                        }
                        if (Class1_Sub1.aBooleanArray5600[anLocalInt_14_] || Class371.anInt3190 > 1) {
                            if (rsInterface.type == 3) {
                                if (alpha != 0) {
                                    if (!rsInterface.aBoolean1912)
                                        Class389.aGraphicsToolkit3281.drawRect(x, y, rsInterface.renderWidth, rsInterface.renderHeight, ((-(alpha & 0xff) + 255 << 24) | (rsInterface.colour) & 0xffffff), 1);
                                    else
                                        Class389.aGraphicsToolkit3281.fillRect(x, y, rsInterface.renderWidth, rsInterface.renderHeight, ((rsInterface.colour & 0xffffff) | (-(alpha & 0xff) + 255 << 24)), 1);
                                } else if (rsInterface.aBoolean1912)
                                    Class389.aGraphicsToolkit3281.fillRect(x, y, rsInterface.renderWidth, rsInterface.renderHeight, rsInterface.colour, 0);
                                else
                                    Class389.aGraphicsToolkit3281.drawRect(x, y, rsInterface.renderWidth, rsInterface.renderHeight, rsInterface.colour, 0);
                                if (Class52.aBoolean391) {
                                    if (argument_0_)
                                        Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    else
                                        DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                }
                            } else if (rsInterface.type == 4) {
                                AbstractFont abstractFont = rsInterface.method3221((argument_3_ ^ ~0x785a), (Class389.aGraphicsToolkit3281));
                                if (abstractFont == null) {
                                    if (Statics.aBoolean5745)
                                        Class256.method3280(rsInterface, true);
                                } else {
                                    int anLocalInt_41_ = rsInterface.colour;
                                    String string = rsInterface.aString1921;
                                    if (rsInterface.anInt1870 != -1) {
                                        Class371 class371 = (Class253_Sub1_Sub1.aClass365_6632.method3975(120, (rsInterface.anInt1870)));
                                        string = (class371.aString3160);
                                        if (string == null)
                                            string = "null";
                                        if (((class371.anInt3152 == 1) || (rsInterface.anInt1925) != 1) && (rsInterface.anInt1925 != -1))
                                            string = ("<col=ff9040>" + string + "</col> x" + (Class9.method242((rsInterface.anInt1925), true)));
                                    }
                                    if (rsInterface.anInt1833 != -1) {
                                        string = (Node_Sub31_Sub27.method960((rsInterface.anInt1833), 85));
                                        if (string == null)
                                            string = "";
                                    }
                                    if (rsInterface == Gl2Water0.aRsInterface_3801) {
                                        string = (MultilanguageString.PLEASE_WAIT.getLocalizedString(client.language));
                                        anLocalInt_41_ = rsInterface.colour;
                                    }
                                    if (Class62_Sub28.aBoolean4462)
                                        Class389.aGraphicsToolkit3281.T(x, y, (rsInterface.renderWidth + x), (rsInterface.renderHeight + y));
                                    abstractFont.method506(y, rsInterface.anInt1933, rsInterface.anInt1874, rsInterface.anInt1903, rsInterface.renderWidth, x, (rsInterface.aBoolean1844 ? (-(alpha & 0xff) + 255 << 24) : -1), rsInterface.anInt1852, string, null, (anLocalInt_41_ | (-(alpha & 0xff) + 255 << 24)), Class33.aClass368Array222, 0, 0, 0, null, rsInterface.renderHeight);
                                    if (Class62_Sub28.aBoolean4462)
                                        Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                    if (string.trim().length() > 0) {
                                        if (Class62_Sub28.aBoolean4462) {
                                            if (Class52.aBoolean391) {
                                                if (argument_0_)
                                                    Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                                else
                                                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                            }
                                        } else {
                                            Class76 class76 = (DoublyLinkedNodeP2_Sub2_Sub5.method1893((rsInterface.anInt1887), true, Class389.aGraphicsToolkit3281));
                                            int anLocalInt_42_ = (class76.method1557((byte) -121, string, (rsInterface.renderWidth), (Class33.aClass368Array222)));
                                            int anLocalInt_43_ = (class76.method1560(true, (rsInterface.renderWidth), string, Class33.aClass368Array222, (rsInterface.anInt1903)));
                                            if (Class52.aBoolean391) {
                                                if (!argument_0_)
                                                    DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, x, (x + anLocalInt_42_), (y + anLocalInt_43_), y);
                                                else
                                                    Canvas_Sub1.method125((x + anLocalInt_42_), (byte) -102, (anLocalInt_43_ + y), y, x);
                                            }
                                        }
                                    }
                                }
                            } else if (rsInterface.type == 5) {
                                if (rsInterface.anInt1909 < 0) {
                                    Class368 class368;
                                    if (rsInterface.anInt1870 == -1) {
                                        if (rsInterface.anInt1833 == -1)
                                            class368 = (rsInterface.method3226((byte) -112, Class389.aGraphicsToolkit3281));
                                        else
                                            class368 = method571((rsInterface.anInt1833), 31214, (Class389.aGraphicsToolkit3281));
                                    } else {
                                        Class22 class22 = ((rsInterface.aBoolean1862) ? (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854) : null);
                                        class368 = (Class253_Sub1_Sub1.aClass365_6632.method3982((rsInterface.anInt1857), (rsInterface.anInt1826), (byte) 16, class22, (rsInterface.anInt1823) | ~0xffffff, (rsInterface.anInt1925), Class389.aGraphicsToolkit3281, (rsInterface.anInt1870)));
                                    }
                                    if (class368 == null) {
                                        if (Statics.aBoolean5745)
                                            Class256.method3280(rsInterface, true);
                                    } else {
                                        int anLocalInt_44_ = class368.getWidth();
                                        int anLocalInt_45_ = class368.method4018();
                                        int anLocalInt_46_ = (((rsInterface.colour) != 0 ? (rsInterface.colour) & 0xffffff : 16777215) | (-(alpha & 0xff) + 255) << 24);
                                        if (rsInterface.aBoolean1868) {
                                            Class389.aGraphicsToolkit3281.T(x, y, (rsInterface.renderWidth) + x, ((rsInterface.renderHeight) + y));
                                            if (rsInterface.anInt1849 == 0) {
                                                if ((rsInterface.colour) != 0 || alpha != 0)
                                                    class368.method4002(x, y, (rsInterface.renderWidth), (rsInterface.renderHeight), 0, anLocalInt_46_, 1);
                                                else
                                                    class368.method4023(x, y, (rsInterface.renderWidth), (rsInterface.renderHeight));
                                            } else {
                                                int anLocalInt_47_ = (((rsInterface.renderWidth) + anLocalInt_44_ - 1) / anLocalInt_44_);
                                                int anLocalInt_48_ = (anLocalInt_45_ + (rsInterface.renderHeight) - 1) / anLocalInt_45_;
                                                for (int anLocalInt_49_ = 0; (anLocalInt_49_ < anLocalInt_47_); anLocalInt_49_++) {
                                                    for (int anLocalInt_50_ = 0; (anLocalInt_50_ < anLocalInt_48_); anLocalInt_50_++) {
                                                        if ((rsInterface.colour) != 0)
                                                            class368.method4006((((float) anLocalInt_44_ / 2.0F) + (float) (anLocalInt_49_ * anLocalInt_44_ + x)), (((float) anLocalInt_45_ / 2.0F) + (float) (anLocalInt_45_ * anLocalInt_50_ + y)), 4096, (rsInterface.anInt1849), 0, anLocalInt_46_, 1);
                                                        else
                                                            class368.method4021(((float) ((anLocalInt_44_ * anLocalInt_49_) + x) + ((float) anLocalInt_44_ / 2.0F)), ((float) ((anLocalInt_50_ * anLocalInt_45_) + y) + ((float) anLocalInt_45_ / 2.0F)), 4096, (rsInterface.anInt1849));
                                                    }
                                                }
                                            }
                                            Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                        } else if ((rsInterface.colour) != 0 || alpha != 0) {
                                            if (rsInterface.anInt1849 != 0)
                                                class368.method4006((((float) (rsInterface.renderWidth) / 2.0F) + (float) x), ((float) y + ((float) (rsInterface.renderHeight) / 2.0F)), ((rsInterface.renderWidth) * 4096 / anLocalInt_44_), (rsInterface.anInt1849), 0, anLocalInt_46_, 1);
                                            else if ((anLocalInt_44_ != (rsInterface.renderWidth)) || ((rsInterface.renderHeight) != anLocalInt_45_))
                                                class368.method4016(x, y, (rsInterface.renderWidth), (rsInterface.renderHeight), 0, anLocalInt_46_, 1);
                                            else
                                                class368.method4004(x, y, 0, anLocalInt_46_, 1);
                                        } else if ((rsInterface.anInt1849) == 0) {
                                            if ((rsInterface.renderWidth) == anLocalInt_44_ && ((rsInterface.renderHeight) == anLocalInt_45_))
                                                class368.method4014(x, y);
                                            else
                                                class368.method4011(x, y, (rsInterface.renderWidth), (rsInterface.renderHeight));
                                        } else
                                            class368.method4021(((float) x + ((float) (rsInterface.renderWidth) / 2.0F)), ((float) y + ((float) (rsInterface.renderHeight) / 2.0F)), ((rsInterface.renderWidth) * 4096 / anLocalInt_44_), (rsInterface.anInt1849));
                                    }
                                } else
                                    rsInterface.method3229(Statics.aClass333_2631, InputStream_Sub2.aClass64_35, -65536).method2897(-105, rsInterface.anInt1865 << 3, Class389.aGraphicsToolkit3281, 0, x, rsInterface.anInt1843 << 3, rsInterface.renderWidth, y, rsInterface.renderHeight, 0);
                                if (Class52.aBoolean391) {
                                    if (argument_0_)
                                        Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    else
                                        DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                }
                            } else if (rsInterface.type == 6) {
                                AthmosphericConditions.loadDefaults();
                                Class8 class8 = null;
                                Class167 class167 = null;
                                int anLocalInt_51_ = 0;
                                if (rsInterface.anInt1870 != -1) {
                                    Class371 class371 = (Class253_Sub1_Sub1.aClass365_6632.method3975(120, rsInterface.anInt1870));
                                    if (class371 != null) {
                                        class371 = class371.method4055((rsInterface.anInt1925), (byte) 31);
                                        Class367 class367 = ((rsInterface.anInt1812 != -1) ? (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758((rsInterface.anInt1812), argument_3_ ^ 0x7800)) : null);
                                        Class22 class22 = (!(rsInterface.aBoolean1862) ? null : (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854));
                                        class167 = (class371.method4057(2048, (rsInterface.anInt1898), argument_3_ ^ 0x7805, class367, (rsInterface.anInt1905), (rsInterface.anInt1853), Class389.aGraphicsToolkit3281, class22, 1));
                                        if (class167 == null)
                                            Class256.method3280(rsInterface, true);
                                        else
                                            anLocalInt_51_ = -class167.fa() >> 1;
                                    }
                                } else if (rsInterface.anInt1822 != 5) {
                                    if (rsInterface.anInt1822 != 8 && (rsInterface.anInt1822 != 9)) {
                                        if (rsInterface.anInt1812 == -1) {
                                            class167 = (rsInterface.method3231((DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425), Class389.aGraphicsToolkit3281, (byte) 42, DiskBackedCache.aClass26_2709, 0, null, (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854), Class157.aClass41_1159, class8, (Class253_Sub1_Sub1.aClass365_6632), -1, 2048, (ClientVariables.instance), (DoublyLinkedNodeP2_Sub5.aClass383_4536), -1));
                                            if (class167 == null && (Statics.aBoolean5745))
                                                Class256.method3280(rsInterface, true);
                                        } else {
                                            Class367 class367 = (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758((rsInterface.anInt1812), 0));
                                            class167 = (rsInterface.method3231((DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425), Class389.aGraphicsToolkit3281, (byte) 72, DiskBackedCache.aClass26_2709, (rsInterface.anInt1905), class367, (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854), Class157.aClass41_1159, class8, (Class253_Sub1_Sub1.aClass365_6632), (rsInterface.anInt1853), 2048, (ClientVariables.instance), (DoublyLinkedNodeP2_Sub5.aClass383_4536), (rsInterface.anInt1898)));
                                            if (class167 == null && (Statics.aBoolean5745))
                                                Class256.method3280(rsInterface, true);
                                        }
                                    } else {
                                        Node_Sub5 class59_sub5 = Class365.method3969((byte) 24, (rsInterface.anInt1929), false);
                                        Class367 class367 = ((rsInterface.anInt1812 != -1) ? (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758((rsInterface.anInt1812), argument_3_ - 30720)) : null);
                                        if (class59_sub5 != null) {
                                            Class22 class22 = (!(rsInterface.aBoolean1862) ? null : (Class308.aClass104_Sub2_Sub2_Sub5_Sub2_2587.aClass22_6854));
                                            class167 = (class59_sub5.method554(2048, (rsInterface.anInt1905), true, (rsInterface.anInt1861), (rsInterface.anInt1898), class367, (rsInterface.anInt1822) == 9, class22, Class389.aGraphicsToolkit3281, (rsInterface.anInt1853)));
                                        }
                                    }
                                } else {
                                    int anLocalInt_52_ = rsInterface.anInt1929;
                                    if (anLocalInt_52_ >= 0 && anLocalInt_52_ < 2048) {
                                        DoublyLinkedNodeP2_Sub2_Sub2_Sub5_Sub2 class104_sub2_sub2_sub5_sub2 = (Class345.aClass104_Sub2_Sub2_Sub5_Sub2Array2905[anLocalInt_52_]);
                                        Class367 class367 = ((rsInterface.anInt1812 == -1) ? null : (DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425.method3758((rsInterface.anInt1812), argument_3_ - 30720)));
                                        if ((class104_sub2_sub2_sub5_sub2 != null) && ((Class64.anInt451 == anLocalInt_52_) || ((Class353.method3887((byte) -128, (class104_sub2_sub2_sub5_sub2.aString6836))) == (rsInterface.anInt1861))))
                                            class167 = (class104_sub2_sub2_sub5_sub2.aClass22_6854.method333((DoublyLinkedNodeP2_Sub2_Sub4.aClass336_6425), Class157.aClass41_1159, (ClientVariables.instance), (rsInterface.anInt1853), (DoublyLinkedNodeP2_Sub5.aClass383_4536), DiskBackedCache.aClass26_2709, (Class253_Sub1_Sub1.aClass365_6632), (rsInterface.anInt1898), -1, 0, (byte) 56, null, 2048, class367, 0, null, Class389.aGraphicsToolkit3281, 0, true, (rsInterface.anInt1905), null));
                                    }
                                }
                                if (class167 != null) {
                                    int anLocalInt_53_;
                                    if (rsInterface.anInt1886 <= 0)
                                        anLocalInt_53_ = 512;
                                    else
                                        anLocalInt_53_ = ((rsInterface.renderWidth << 9) / (rsInterface.anInt1886));
                                    int anLocalInt_54_;
                                    if (rsInterface.anInt1938 > 0)
                                        anLocalInt_54_ = ((rsInterface.renderHeight << 9) / (rsInterface.anInt1938));
                                    else
                                        anLocalInt_54_ = 512;
                                    int anLocalInt_55_ = (x + (rsInterface.renderWidth / 2));
                                    int anLocalInt_56_ = (y + (rsInterface.renderHeight / 2));
                                    if (!rsInterface.aBoolean1943) {
                                        anLocalInt_55_ += (rsInterface.anInt1848 * anLocalInt_53_) >> 9;
                                        anLocalInt_56_ += (rsInterface.anInt1888 * anLocalInt_54_) >> 9;
                                    }
                                    Class41.aClass350_304.method3840();
                                    Class389.aGraphicsToolkit3281.method2069(Class41.aClass350_304);
                                    Class389.aGraphicsToolkit3281.DA(anLocalInt_55_, anLocalInt_56_, anLocalInt_53_, anLocalInt_54_);
                                    Class389.aGraphicsToolkit3281.clearDepthBuffer();
                                    if (rsInterface.aBoolean1917)
                                        Class389.aGraphicsToolkit3281.C(false);
                                    if (!rsInterface.aBoolean1943) {
                                        int anLocalInt_57_ = ((rsInterface.anInt1906 << 2) * (Node_Sub6.SINETABLE[(rsInterface.anInt1885) << 3])) >> 14;
                                        int anLocalInt_58_ = ((rsInterface.anInt1906 << 2) * (Node_Sub6.COSINETABLE[(rsInterface.anInt1885) << 3])) >> 14;
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3839(-rsInterface.anInt1837 << 3);
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3834(rsInterface.anInt1884 << 3);
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3835((rsInterface.anInt1937 << 2), (anLocalInt_57_ + (((rsInterface.anInt1811) << 2) + anLocalInt_51_)), (anLocalInt_58_ + ((rsInterface.anInt1811) << 2)));
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3833(rsInterface.anInt1885 << 3);
                                    } else {
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3841(rsInterface.anInt1885);
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3834(rsInterface.anInt1884);
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3837(rsInterface.anInt1837);
                                        DoublyLinkedNodeP2_Sub10.aClass350_4594.method3835(rsInterface.anInt1848, rsInterface.anInt1888, rsInterface.anInt1960);
                                    }
                                    rsInterface.method3225(Class389.aGraphicsToolkit3281, class167, (byte) 90, (DoublyLinkedNodeP2_Sub10.aClass350_4594), Class333.anInt2720);
                                    if (Class62_Sub28.aBoolean4462)
                                        Class389.aGraphicsToolkit3281.T(x, y, (x + (rsInterface.renderWidth)), (y + (rsInterface.renderHeight)));
                                    if (!rsInterface.aBoolean1943) {
                                        if (rsInterface.aBoolean1835)
                                            class167.method2646(DoublyLinkedNodeP2_Sub10.aClass350_4594, null, (rsInterface.anInt1906) << 2, 1);
                                        else {
                                            class167.method2640(DoublyLinkedNodeP2_Sub10.aClass350_4594, null, 1);
                                            if ((rsInterface.aClass104_Sub7_1842) != null)
                                                Class389.aGraphicsToolkit3281.method2067(rsInterface.aClass104_Sub7_1842.method1936());
                                        }
                                    } else if (!rsInterface.aBoolean1835) {
                                        class167.method2640((DoublyLinkedNodeP2_Sub10.aClass350_4594), null, 1);
                                        if ((rsInterface.aClass104_Sub7_1842) != null)
                                            Class389.aGraphicsToolkit3281.method2067(rsInterface.aClass104_Sub7_1842.method1936());
                                    } else
                                        class167.method2646(DoublyLinkedNodeP2_Sub10.aClass350_4594, null, rsInterface.anInt1906, 1);
                                    if (Class62_Sub28.aBoolean4462)
                                        Class389.aGraphicsToolkit3281.setClip(argument_2_, argument, argument_4_, argument_1_);
                                    if (rsInterface.aBoolean1917)
                                        Class389.aGraphicsToolkit3281.C(true);
                                }
                                if (Class52.aBoolean391) {
                                    if (argument_0_)
                                        Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    else
                                        DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                }
                            } else if (rsInterface.type == 9) {
                                int anLocalInt_59_;
                                int anLocalInt_60_;
                                int anLocalInt_61_;
                                int anLocalInt_62_;
                                if (!rsInterface.aBoolean1871) {
                                    anLocalInt_62_ = (rsInterface.renderWidth + x);
                                    anLocalInt_60_ = y;
                                    anLocalInt_61_ = (y + rsInterface.renderHeight);
                                    anLocalInt_59_ = x;
                                } else {
                                    anLocalInt_59_ = x;
                                    anLocalInt_60_ = (rsInterface.renderHeight + y);
                                    anLocalInt_61_ = y;
                                    anLocalInt_62_ = (rsInterface.renderWidth + x);
                                }
                                if (rsInterface.anInt1928 != 1)
                                    Class389.aGraphicsToolkit3281.method2095(anLocalInt_59_, anLocalInt_60_, anLocalInt_62_, anLocalInt_61_, rsInterface.colour, rsInterface.anInt1928, 0);
                                else
                                    Class389.aGraphicsToolkit3281.drawLine(anLocalInt_59_, anLocalInt_60_, anLocalInt_62_, anLocalInt_61_, rsInterface.colour, 0);
                                if (Class52.aBoolean391) {
                                    if (argument_0_)
                                        Canvas_Sub1.method125(anLocalInt_12_, (byte) -102, anLocalInt_13_, anLocalInt_11_, anLocalInt_10_);
                                    else
                                        DoublyLinkedNode_Sub51_Sub19_Sub1.method1301(false, anLocalInt_10_, anLocalInt_12_, anLocalInt_13_, anLocalInt_11_);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (argument_3_ != 30720)
            method570(121, false, 93, 32, 41, 103, 22, -4, -6, -91, null);
    }

    private static final Class368 method571(int argument, int argument_63_, GraphicsToolkit argument_64_) {
        if (argument_63_ != 31214)
            method571(15, 6, null);
        Node_Sub23 class59_sub23 = ((Node_Sub23) Node_Sub37_Sub1.aJagexHashMap_6114.get((long) argument));
        if (class59_sub23 != null) {
            Node_Sub32_Sub2 class59_sub32_sub2 = class59_sub23.aClass109_Sub1_4050.method1968(38);
            class59_sub23.aBoolean4052 = true;
            if (class59_sub32_sub2 != null)
                return class59_sub32_sub2.method1021(96, argument_64_);
        }
        return null;
    }

    final boolean method572(int argument_65_, byte argument_66_, int argument_67_) {
        if (argument_67_ >= this.anInt3925 && argument_67_ <= this.anInt3921 && this.anInt3927 <= argument_65_ && this.anInt3922 >= argument_65_)
            return true;
        if (this.anInt3929 <= argument_67_ && argument_67_ <= this.anInt3923 && this.anInt3924 <= argument_65_ && this.anInt3928 >= argument_65_)
            return true;
        return false;
    }

    Node_Sub8(Node_Sub7 argument_68_) {
        this.anInt3923 = -2147483648;
        this.anInt3928 = -2147483648;
        this.anInt3925 = 2147483647;
        this.anInt3929 = 2147483647;
        this.anInt3927 = 2147483647;
        this.aClass59_Sub7_3926 = argument_68_;
    }
}
