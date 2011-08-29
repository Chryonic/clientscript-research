/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Random;

abstract class AbstractFont {
    static String aString416 = null;
    static int currentColour = 0;
    static int defaultColor = 0;
    static int underlineColour = -1;
    static int strikeThroughColour = -1;
    static int shadowColour = 0;
    static int defaultShadowColour = 0;
    private GraphicsToolkit toolkit;
    static int anInt418;
    private Class76 aClass76_419;
    static ClanChannel aClass59_Sub53_420;

    abstract void drawCharacter2(char character, int x, int y, int colour, boolean argument_4_);

    final void method492(int argument_5_, String argument_6_, int argument_7_, int argument_8_, int argument_9_, int argument_10_) {
        if (argument_6_ != null) {
            setDrawingParameters(argument_5_, argument_7_);
            method499(null, -aClass76_419.method1552(argument_6_, 0) + argument_8_, argument_6_, 0, null, 0, null, argument_9_);
        }
    }

    static final int method493(char argument, int argument_11_) {
        if ((~argument) <= argument_11_ && argument < Class107.anIntArray879.length)
            return Class107.anIntArray879[argument];
        return -1;
    }

    abstract void drawCharacter(char character, int x, int y, int argument_15_, boolean argument_16_, Class_aa argument_17_, int argument_18_, int argument_19_);

    final int method495(int argument_20_, int argument_21_, String argument_22_, Class368[] argument_23_, int argument_24_, Random argument_25_, int argument_26_, int argument_27_, int argument_28_, int[] argument_29_) {
        if (argument_22_ == null)
            return 0;
        argument_25_.setSeed((long) argument_20_);
        int anLocalInt = (argument_25_.nextInt() & 0x1f) + 192;
        setDrawingParameters(argument_28_ & 0xffffff | anLocalInt << 24, anLocalInt << 24 | argument_26_ & 0xffffff);
        int anLocalInt_30_ = argument_22_.length();
        int[] anLocalInts = new int[anLocalInt_30_];
        int anLocalInt_31_ = 0;
        for (int anLocalInt_32_ = 0; anLocalInt_30_ > anLocalInt_32_; anLocalInt_32_++) {
            anLocalInts[anLocalInt_32_] = anLocalInt_31_;
            if ((argument_25_.nextInt() & 0x3) == 0)
                anLocalInt_31_++;
        }
        method508(argument_22_, argument_27_, argument_29_, argument_24_, anLocalInts, argument_23_, null, -7654);
        return anLocalInt_31_;
    }

    private void parseFormatting(String stringg) {
        try {
            if (stringg.startsWith("col="))
                currentColour = (currentColour & ~0xffffff | JagexStringUtils.parseInt2(stringg.substring(4), 16) & 0xffffff);
            else if (stringg.equals("/col"))
                currentColour = (currentColour & ~0xffffff | defaultColor & 0xffffff);
            if (stringg.startsWith("argb=")) {
                currentColour = JagexStringUtils.parseInt2(stringg.substring(5), 16);
            } else if (stringg.equals("/argb"))
                currentColour = defaultColor;
            else if (stringg.startsWith("str="))
                strikeThroughColour = (currentColour & ~0xffffff | JagexStringUtils.parseInt2(stringg.substring(4), 16));
            else if (stringg.equals("str")) {
                strikeThroughColour = currentColour & ~0xffffff | 0x800000;
            } else if (stringg.equals("/str")) {
                strikeThroughColour = -1;
            } else if (stringg.startsWith("u="))
                underlineColour = (currentColour & ~0xffffff | (JagexStringUtils.parseInt2(stringg.substring(2), 16)));
            else if (stringg.equals("u"))
                underlineColour = currentColour & ~0xffffff;
            else if (stringg.equals("/u"))
                underlineColour = -1;
            else if (stringg.equalsIgnoreCase("shad=-1"))
                shadowColour = 0;
            else if (stringg.startsWith("shad="))
                shadowColour = (currentColour & ~0xffffff | (JagexStringUtils.parseInt2(stringg.substring(5), 16)));
            else if (stringg.equals("shad"))
                shadowColour = currentColour & ~0xffffff;
            else if (stringg.equals("/shad"))
                shadowColour = defaultShadowColour;
            else if (stringg.equals("br"))
                setDrawingParameters(defaultColor, defaultShadowColour);
        } catch (Exception exception) {
            /* empty */
        }
    }

    final void method497(int argument_35_, int argument_36_, int argument_37_, int argument_38_, String argument_39_, int argument_40_, int argument_41_) {
        if (argument_39_ != null) {
            setDrawingParameters(argument_36_, argument_37_);
            int anLocalInt = argument_39_.length();
            int[] anLocalInts = new int[anLocalInt];
            int[] anLocalInts_42_ = new int[anLocalInt];
            for (int anLocalInt_43_ = 0; anLocalInt > anLocalInt_43_; anLocalInt_43_++) {
                anLocalInts[anLocalInt_43_] = (int) (Math.sin((double) anLocalInt_43_ / 5.0 + (double) argument_41_ / 5.0) * 5.0);
                anLocalInts_42_[anLocalInt_43_] = (int) (Math.sin((double) anLocalInt_43_ / 3.0 + (double) argument_41_ / 5.0) * 5.0);
            }
            method508(argument_39_, (-(aClass76_419.method1552(argument_39_, 0) / 2) + argument_35_), null, argument_38_, anLocalInts, null, anLocalInts_42_, -7654);
        }
    }

    final int method498(String argument_44_, int argument_45_, int argument_46_, Class368[] argument_47_, int argument_48_, int argument_49_, int argument_50_, int argument_51_, int argument_52_, int argument_53_, int argument_54_, int argument_55_, int argument_56_, Class_aa argument_57_, int[] argument_58_, int argument_59_) {
        return method506(argument_59_, argument_55_, 0, argument_54_, argument_52_, argument_48_, argument_56_, argument_51_, argument_44_, argument_57_, argument_50_, argument_47_, argument_45_, argument_46_, 0, argument_58_, argument_53_);
    }

    private final void method499(int[] argument_60_, int x, String text, int argument_64_, Class368[] argument_65_, int argument_66_, Class_aa argument_67_, int y) {

        y -= aClass76_419.anInt513;
        int openBracketIndex = -1;
        int anLocalInt_69_ = -1;
        int stringLength = text.length();
        for (int index = 0; index < stringLength; index++) {
            char charToRender = (char) (Class62_Sub18.method1426(-115, text.charAt(index)) & 0xff);
            if (charToRender == 60)     //<
                openBracketIndex = index;
            else {
                if (charToRender == 62 && openBracketIndex != -1) {  //>
                    String tag = text.substring(openBracketIndex + 1, index);
                    openBracketIndex = -1;
                    if (tag.equals("lt"))
                        charToRender = '<';
                    else if (tag.equals("gt"))
                        charToRender = '>';
                    else if (tag.equals("nbsp")) {
                        charToRender = '\u00a0';// . .
                    } else if (tag.equals("shy"))
                        charToRender = '\u00ad';// soft hyphen
                    else if (tag.equals("times"))
                        charToRender = '\u00d7';
                    else if (tag.equals("euro"))
                        charToRender = '\u20ac';
                    else if (tag.equals("copy"))
                        charToRender = '\u00a9';
                    else if (tag.equals("reg"))
                        charToRender = '\u00ae';
                    else {
                        if (tag.startsWith("img=")) {
                            try {
                                int imageId = JagexStringUtils.parseInt(tag.substring(4));
                                Class368 class368 = argument_65_[imageId];
                                int anLocalInt_73_ = (argument_60_ == null ? class368.method4018() : argument_60_[imageId]);
                                if ((currentColour & ~0xffffff) != -16777216)
                                    class368.method4004(x, (-anLocalInt_73_ + (aClass76_419.anInt513) + y), 0, (((currentColour) & ~0xffffff) | 0xffffff), 1);
                                else
                                    class368.method4004(x, (-anLocalInt_73_ + ((aClass76_419.anInt513) + y)), 1, 0, 1);
                                anLocalInt_69_ = -1;
                                x += argument_65_[imageId].getWidth();
                            } catch (Exception exception) {
                                /* empty */
                            }
                        } else
                            parseFormatting(tag);
                        continue;
                    }
                }
                if (openBracketIndex == -1) {
                    if (anLocalInt_69_ != -1)
                        x += aClass76_419.method1554(charToRender, anLocalInt_69_, 0);
                    if (charToRender != 32) { // space
                        if (argument_67_ != null) {
                            if ((shadowColour & ~0xffffff) != 0)
                                drawCharacter(charToRender, x + 1, y + 1, shadowColour, true, argument_67_, argument_66_, argument_64_);
                            drawCharacter(charToRender, x, y, currentColour, false, argument_67_, argument_66_, argument_64_);
                        } else {
                            if ((shadowColour & ~0xffffff) != 0)
                                drawCharacter2(charToRender, x + 1, y + 1, shadowColour, true);
                            drawCharacter2(charToRender, x, y, currentColour, false);
                        }
                    } else if (Statics.anInt5277 > 0) {
                        Class64.anInt449 += Statics.anInt5277;
                        x += Class64.anInt449 >> 8;
                        Class64.anInt449 &= 0xff;
                    }
                    int anLocalInt_74_ = aClass76_419.method1556(false, charToRender);
                    if (strikeThroughColour != -1)
                        toolkit.method2061((int) ((double) (aClass76_419.anInt513) * 0.7) + y, x, strikeThroughColour, anLocalInt_74_, (byte) -55);
                    if (underlineColour != -1)
                        toolkit.method2061((y - (-(aClass76_419.anInt513) - 1)), x, underlineColour, anLocalInt_74_, (byte) -66);
                    anLocalInt_69_ = charToRender;
                    x += anLocalInt_74_;
                }
            }
        }
    }

    final void method500(int argument_75_, int argument_76_, String argument_77_, int argument_78_, int argument_79_, int argument_80_, int argument_81_) {
        if (argument_77_ != null) {
            setDrawingParameters(argument_78_, argument_79_);
            int anLocalInt = argument_77_.length();
            int[] anLocalInts = new int[anLocalInt];
            for (int anLocalInt_82_ = 0; anLocalInt_82_ < anLocalInt; anLocalInt_82_++)
                anLocalInts[anLocalInt_82_] = (int) (Math.sin((double) anLocalInt_82_ / 2.0 + (double) argument_75_ / 5.0) * 5.0);
            method508(argument_77_, (argument_81_ - (aClass76_419.method1552(argument_77_, argument_80_ ^ 0x2) / argument_80_)), null, argument_76_, null, null, anLocalInts, -7654);
        }
    }

    private final void method501(int argument_83_, String argument_84_, int argument_85_) {
        int anLocalInt = 0;
        boolean anLocalBoolean = false;
        for (int anLocalInt_86_ = 0; argument_84_.length() > anLocalInt_86_; anLocalInt_86_++) {
            char anLocalChar = argument_84_.charAt(anLocalInt_86_);
            if (anLocalChar != '<') {
                if (anLocalChar != '>') {
                    if (!anLocalBoolean && anLocalChar == ' ')
                        anLocalInt++;
                } else
                    anLocalBoolean = false;
            } else
                anLocalBoolean = true;
        }
        if (anLocalInt > 0)
            Statics.anInt5277 = (argument_83_ - aClass76_419.method1552(argument_84_, 0) << 8) / anLocalInt;
        if (argument_85_ != 62)
            aClass59_Sub53_420 = null;
    }

    final void method502(int argument_87_, int argument_88_, int argument_89_, int argument_90_, byte argument_91_, int argument_92_, int argument_93_, String argument_94_) {
        if (argument_94_ != null) {
            setDrawingParameters(argument_92_, argument_88_);
            double d = 7.0 - (double) argument_90_ / 8.0;
            if (d < 0.0)
                d = 0.0;
            int anLocalInt = argument_94_.length();
            int[] anLocalInts = new int[anLocalInt];
            for (int anLocalInt_95_ = 0; anLocalInt > anLocalInt_95_; anLocalInt_95_++)
                anLocalInts[anLocalInt_95_] = (int) (d * Math.sin((double) argument_89_ + (double) anLocalInt_95_ / 1.5));
            method508(argument_94_, (argument_87_ - aClass76_419.method1552(argument_94_, 0) / 2), null, argument_93_, null, null, anLocalInts, -7654);
        }
    }

    final void method503(int argument_96_, int argument_97_, int argument_98_, byte argument_99_, String argument_100_, int argument_101_) {
        if (argument_100_ != null) {
            setDrawingParameters(argument_98_, argument_97_);
            method499(null, (-(aClass76_419.method1552(argument_100_, 0) / 2) + argument_96_), argument_100_, 0, null, 0, null, argument_101_);
        }
    }

    final void method504(int argument_102_, int argument_103_, int argument_104_, int[] argument_105_, Class368[] argument_106_, int argument_107_, String argument_108_, int argument_109_) {
        if (argument_108_ != null) {
            setDrawingParameters(argument_103_, argument_109_);
            method499(argument_105_, argument_107_, argument_108_, argument_102_, argument_106_, 0, null, argument_104_);
        }
    }

    final int method505(byte argument_110_, int argument_111_, int argument_112_, Class368[] argument_113_, int argument_114_, int argument_115_, int argument_116_, int[] argument_117_, Random argument_118_, String argument_119_, int argument_120_, int argument_121_, int argument_122_, int[] argument_123_, int argument_124_) {
        if (argument_119_ == null)
            return 0;
        argument_118_.setSeed((long) argument_120_);
        int anLocalInt = (argument_118_.nextInt() & 0x1f) + 192;
        setDrawingParameters(argument_121_ & 0xffffff | anLocalInt << 24, argument_112_ & 0xffffff | anLocalInt << 24);
        int anLocalInt_125_ = argument_119_.length();
        int[] anLocalInts = new int[anLocalInt_125_];
        int anLocalInt_126_ = 0;
        for (int anLocalInt_127_ = 0; anLocalInt_127_ < anLocalInt_125_; anLocalInt_127_++) {
            anLocalInts[anLocalInt_127_] = anLocalInt_126_;
            if ((argument_118_.nextInt() & 0x3) == 0)
                anLocalInt_126_++;
        }
        int anLocalInt_128_ = argument_114_;
        int anLocalInt_129_ = argument_116_ + aClass76_419.anInt520;
        if (argument_124_ != 1) {
            if (argument_124_ == 2)
                anLocalInt_129_ = -aClass76_419.anInt518 + (argument_116_ + argument_115_);
        } else
            anLocalInt_129_ += (argument_115_ - (aClass76_419.anInt520 + aClass76_419.anInt518)) / 2;
        int anLocalInt_130_ = -1;
        if (argument_122_ == 1) {
            anLocalInt_130_ = anLocalInt_126_ + aClass76_419.method1552(argument_119_, 0);
            anLocalInt_128_ += (-anLocalInt_130_ + argument_111_) / 2;
        } else if (argument_122_ == 2) {
            anLocalInt_130_ = aClass76_419.method1552(argument_119_, 0) + anLocalInt_126_;
            anLocalInt_128_ += argument_111_ - anLocalInt_130_;
        }
        method508(argument_119_, anLocalInt_128_, argument_123_, anLocalInt_129_, anLocalInts, argument_113_, null, -7654);
        if (argument_117_ != null) {
            if (anLocalInt_130_ == -1)
                anLocalInt_130_ = anLocalInt_126_ + aClass76_419.method1552(argument_119_, 0);
            argument_117_[2] = anLocalInt_130_;
            argument_117_[3] = (aClass76_419.anInt518 + aClass76_419.anInt520);
            argument_117_[1] = anLocalInt_129_ - aClass76_419.anInt520;
            argument_117_[0] = anLocalInt_128_;
        }
        return anLocalInt_126_;
    }

    final int method506(int argument_131_, int argument_132_, int argument_133_, int argument_134_, int argument_135_, int argument_136_, int argument_137_, int argument_138_, String argument_139_, Class_aa argument_140_, int argument_141_, Class368[] argument_142_, int argument_143_, int argument_144_, int argument_145_, int[] argument_146_, int argument_147_) {
        if (argument_139_ == null)
            return 0;
        setDrawingParameters(argument_141_, argument_137_);
        if (argument_145_ == argument_134_)
            argument_134_ = aClass76_419.anInt513;
        int[] anLocalInts;
        if (argument_147_ >= (argument_134_ + aClass76_419.anInt518 + aClass76_419.anInt520) || argument_147_ >= argument_134_ + argument_134_)
            anLocalInts = new int[]{argument_135_};
        else
            anLocalInts = null;
        if (argument_133_ == -1) {
            argument_133_ = argument_147_ / argument_134_;
            if (argument_133_ <= 0)
                argument_133_ = 1;
        }
        int anLocalInt = aClass76_419.method1562(argument_142_, Class217.aStringArray1527, anLocalInts, argument_139_, -1);
        if (argument_133_ > 0 && anLocalInt >= argument_133_) {
            Class217.aStringArray1527[argument_133_ - 1] = aClass76_419.method1555(argument_135_, (Class217.aStringArray1527[argument_133_ - 1]), true, argument_142_);
            anLocalInt = argument_133_;
        }
        if (argument_132_ == 3 && anLocalInt == 1)
            argument_132_ = 1;
        int anLocalInt_148_;
        if (argument_132_ == 0)
            anLocalInt_148_ = aClass76_419.anInt520 + argument_131_;
        else if (argument_132_ == 1)
            anLocalInt_148_ = ((-(argument_134_ * (anLocalInt - 1)) - aClass76_419.anInt518 + (-aClass76_419.anInt520 + argument_147_)) / 2 + argument_131_ + aClass76_419.anInt520);
        else if (argument_132_ == 2)
            anLocalInt_148_ = (-(argument_134_ * (anLocalInt - 1)) - aClass76_419.anInt518 + (argument_147_ + argument_131_));
        else {
            int anLocalInt_149_ = ((-(argument_134_ * (anLocalInt - 1)) - aClass76_419.anInt518 - aClass76_419.anInt520 + argument_147_) / (anLocalInt + 1));
            if (anLocalInt_149_ < 0)
                anLocalInt_149_ = 0;
            argument_134_ += anLocalInt_149_;
            anLocalInt_148_ = argument_131_ - (-aClass76_419.anInt520 - anLocalInt_149_);
        }
        for (int anLocalInt_150_ = 0; anLocalInt > anLocalInt_150_; anLocalInt_150_++) {
            if (argument_138_ != 0) {
                if (argument_138_ == 1)
                    method499(argument_146_, (argument_136_ + (-aClass76_419.method1552((Class217.aStringArray1527[anLocalInt_150_]), 0) + argument_135_) / 2), Class217.aStringArray1527[anLocalInt_150_], argument_144_, argument_142_, argument_143_, argument_140_, anLocalInt_148_);
                else if (argument_138_ != 2) {
                    if (anLocalInt - 1 == anLocalInt_150_)
                        method499(argument_146_, argument_136_, Class217.aStringArray1527[anLocalInt_150_], argument_144_, argument_142_, argument_143_, argument_140_, anLocalInt_148_);
                    else {
                        method501(argument_135_, Class217.aStringArray1527[anLocalInt_150_], 62);
                        method499(argument_146_, argument_136_, Class217.aStringArray1527[anLocalInt_150_], argument_144_, argument_142_, argument_143_, argument_140_, anLocalInt_148_);
                        Statics.anInt5277 = 0;
                    }
                } else
                    method499(argument_146_, argument_136_ + (argument_135_ - (aClass76_419.method1552((Class217.aStringArray1527[anLocalInt_150_]), 0))), Class217.aStringArray1527[anLocalInt_150_], argument_144_, argument_142_, argument_143_, argument_140_, anLocalInt_148_);
            } else
                method499(argument_146_, argument_136_, Class217.aStringArray1527[anLocalInt_150_], argument_144_, argument_142_, argument_143_, argument_140_, anLocalInt_148_);
            anLocalInt_148_ += argument_134_;
        }
        return anLocalInt;
    }

    final void method507(byte argument_151_, int argument_152_, int argument_153_, String argument_154_, int argument_155_, int argument_156_) {
        if (argument_154_ != null) {
            setDrawingParameters(argument_155_, argument_153_);
            method499(null, argument_156_, argument_154_, 0, null, 0, null, argument_152_);
        }
    }

    AbstractFont(GraphicsToolkit argument_157_, Class76 argument_158_) {
        toolkit = argument_157_;
        aClass76_419 = argument_158_;
    }

    private final void method508(String argument_159_, int argument_160_, int[] argument_161_, int argument_162_, int[] argument_163_, Class368[] argument_164_, int[] argument_165_, int argument_166_) {
        argument_162_ -= aClass76_419.anInt513;
        int anLocalInt = -1;
        int anLocalInt_167_ = -1;
        int anLocalInt_168_ = 0;
        int anLocalInt_169_ = argument_159_.length();
        if (argument_166_ != -7654)
            drawCharacter('-', 109, 6, -76, false, null, -5, -30);
        for (int anLocalInt_170_ = 0; anLocalInt_169_ > anLocalInt_170_; anLocalInt_170_++) {
            char anLocalChar = (char) ((Class62_Sub18.method1426(argument_166_ ^ 0x1d89, argument_159_.charAt(anLocalInt_170_))) & 0xff);
            if (anLocalChar == 60)
                anLocalInt = anLocalInt_170_;
            else {
                if (anLocalChar == 62 && anLocalInt != -1) {
                    String string = argument_159_.substring(anLocalInt + 1, anLocalInt_170_);
                    anLocalInt = -1;
                    if (string.equals("lt"))
                        anLocalChar = '<';
                    else if (string.equals("gt"))
                        anLocalChar = '>';
                    else if (string.equals("nbsp"))
                        anLocalChar = '\u00a0';
                    else if (string.equals("shy"))
                        anLocalChar = '\u00ad';
                    else if (!string.equals("times")) {
                        if (string.equals("euro"))
                            anLocalChar = '\u20ac';
                        else if (!string.equals("copy")) {
                            if (!string.equals("reg")) {
                                if (string.startsWith("img=")) {
                                    try {
                                        int anLocalInt_171_;
                                        if (argument_163_ == null)
                                            anLocalInt_171_ = 0;
                                        else
                                            anLocalInt_171_ = (argument_163_[anLocalInt_168_]);
                                        int anLocalInt_172_;
                                        if (argument_165_ == null)
                                            anLocalInt_172_ = 0;
                                        else
                                            anLocalInt_172_ = (argument_165_[anLocalInt_168_]);
                                        anLocalInt_168_++;
                                        int anLocalInt_173_ = (JagexStringUtils.parseInt(string.substring(4)));
                                        Class368 class368 = argument_164_[anLocalInt_173_];
                                        int anLocalInt_174_ = (argument_161_ != null ? argument_161_[anLocalInt_173_] : class368.method4018());
                                        class368.method4004((anLocalInt_171_ + argument_160_), (anLocalInt_172_ - anLocalInt_174_ + (aClass76_419.anInt513) + argument_162_), 1, 0, 1);
                                        argument_160_ += argument_164_[anLocalInt_173_].getWidth();
                                        anLocalInt_167_ = -1;
                                    } catch (Exception exception) {
                                        /* empty */
                                    }
                                } else
                                    parseFormatting(string);
                                continue;
                            }
                            anLocalChar = '\u00ae';
                        } else
                            anLocalChar = '\u00a9';
                    } else
                        anLocalChar = '\u00d7';
                }
                if (anLocalInt == -1) {
                    if (anLocalInt_167_ != -1)
                        argument_160_ += aClass76_419.method1554(anLocalChar, anLocalInt_167_, 0);
                    int anLocalInt_175_;
                    if (argument_163_ == null)
                        anLocalInt_175_ = 0;
                    else
                        anLocalInt_175_ = argument_163_[anLocalInt_168_];
                    int anLocalInt_176_;
                    if (argument_165_ != null)
                        anLocalInt_176_ = argument_165_[anLocalInt_168_];
                    else
                        anLocalInt_176_ = 0;
                    anLocalInt_168_++;
                    if (anLocalChar != 32) {
                        if ((shadowColour & ~0xffffff) != 0)
                            drawCharacter2(anLocalChar, argument_160_ - (-1 - anLocalInt_175_), anLocalInt_176_ + 1 + argument_162_, shadowColour, true);
                        drawCharacter2(anLocalChar, anLocalInt_175_ + argument_160_, argument_162_ + anLocalInt_176_, currentColour, false);
                    } else if (Statics.anInt5277 > 0) {
                        Class64.anInt449 += Statics.anInt5277;
                        argument_160_ += Class64.anInt449 >> 8;
                        Class64.anInt449 &= 0xff;
                    }
                    int anLocalInt_177_ = aClass76_419.method1556(false, anLocalChar);
                    if (strikeThroughColour != -1)
                        toolkit.method2061((argument_162_ + (int) ((double) (aClass76_419.anInt513) * 0.7)), argument_160_, strikeThroughColour, anLocalInt_177_, (byte) -91);
                    if (underlineColour != -1)
                        toolkit.method2061((argument_162_ + (aClass76_419.anInt513)), argument_160_, underlineColour, anLocalInt_177_, (byte) -80);
                    argument_160_ += anLocalInt_177_;
                    anLocalInt_167_ = anLocalChar;
                }
            }
        }
    }

    public static void method509() {
        Class303.tileSettings = null;
        aClass59_Sub53_420 = null;
        AthmosphericConditions.toolkit = null;
        aString416 = null;
    }

    private void setDrawingParameters(int textColour, int shadowColour) {
        Class64.anInt449 = 0;
        underlineColour = -1;
        strikeThroughColour = -1;
        Statics.anInt5277 = 0;
        currentColour = defaultColor = textColour;
        if (shadowColour == -1)
            shadowColour = 0;
        this.shadowColour = defaultShadowColour = shadowColour;
    }
}
