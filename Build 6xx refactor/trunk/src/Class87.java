/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.lang.reflect.Field;

final class Class87 implements Interface8 {
    private Color aColor3544;
    private int anInt3545;
    private int anInt3546;
    private Image anImage3547;
    private Image anImage3548;
    private Image anImage3549;
    private Image anImage3550;
    static boolean aBoolean3551 = true;
    private int anInt3552;
    private Image anImage3553;
    private FontMetrics aFontMetrics3554;
    private Image anImage3555;
    private Image anImage3556;
    private int anInt3557;
    private int anInt3558;
    static double aDouble3559;
    static Class149 aClass149_3560;
    private boolean aBoolean3561;
    private int anInt3562;
    private Image anImage3563;
    private Image anImage3564;
    private int anInt3565;
    private int anInt3566;
    private boolean aBoolean3567;
    private Image anImage3569;
    private boolean useOldLoadingBar;
    private Font aFont3571;
    private int anInt3572;

    private final boolean method1633(String argument_0_, Object argument_1_, Class argument_2_, int argument_3_) throws IllegalAccessException, NoSuchFieldException {
        if (argument_3_ != 31245)
            anInt3557 = 12;
        Field field = argument_2_.getDeclaredField(argument_0_);
        return field.getBoolean(argument_1_);
    }

    public final void method36(boolean argument_4_) {
        Class260.method3319(26016);
        if (argument_4_ != true)
            anInt3565 = 67;
    }

    public final int method38(int argument_5_) {
        if (argument_5_ != -31784)
            method1636(-68, -76);
        return 100;
    }

    public static void method1634(int argument) {
        aClass149_3560 = null;
    }

    static final void method1635(int argument, Js5Store argument_6_, byte argument_7_, Js5Store argument_8_) {
        Class281.aJs5Store_2274 = argument_8_;
        Class391.aJs5Store_3290 = argument_6_;
    }

    private final int method1636(int argument_9_, int argument_10_) {
        if (argument_10_ >= -111)
            anInt3545 = 120;
        if (aBoolean3567)
            return (Applet_Sub1.canvasWidth - argument_9_) / 2;
        return 0;
    }

    private final int method1637(String argument_11_, Class argument_12_, Object argument_13_, byte argument_14_) throws IllegalAccessException, NoSuchFieldException {
        if (argument_14_ != 123)
            method1636(46, 80);
        Field field = argument_12_.getDeclaredField(argument_11_);
        return field.getInt(argument_13_);
    }

    private final Object method1638(Class argument_15_, String argument_16_, int argument_17_) throws IllegalAccessException, NoSuchFieldException {
        Field field = argument_15_.getDeclaredField(argument_16_);
        Object object = field.get(Signlink.mainapp);
        field.set(Signlink.mainapp, null);
        if (argument_17_ > -58)
            return null;
        return object;
    }

    private final void drawLoadingBar() {
        Applet_Sub1.drawLoadingBar(client.currentLoadingBar.getStartPercentage(), client.currentLoadingBar.getText(), client.loadingBarBorderColour[client.colourId], client.loadingBarFillColour[client.colourId], client.loadingBarTextColour[client.colourId]);
    }

    public final void method39(boolean argument_19_) {
        if (argument_19_ != true) {
            /* empty */
        }
    }

    private final int method1640(int argument_20_, byte argument_21_) {
        int anLocalInt = 106 % ((argument_21_ + 31) / 44);
        if (aBoolean3561)
            return (Applet_Sub1.canvasHeight - argument_20_) / 2;
        return 0;
    }

    public final boolean method37(int argument_22_, long argument_23_) {
        if (argument_22_ != -18419)
            method1635(-9, null, (byte) 29, null);
        return true;
    }

    public final int method35(int argument_24_) {
        if (argument_24_ != -4076)
            return -88;
        return 0;
    }

    public final void method40(boolean argument_25_, boolean argument_26_) {
        if (!useOldLoadingBar) {
            if (Signlink.mainapp != null) {
                if (aFont3571 == null) {
                    try {
                        method1641((byte) -128);
                    } catch (Exception exception) {
                        useOldLoadingBar = true;
                    }
                }
            } else
                useOldLoadingBar = true;
        }
        if (useOldLoadingBar)
            drawLoadingBar();
        else if (argument_25_) {
            Graphics graphics = Applet_Sub1.gameCanvas.getGraphics();
            if (graphics == null)
                Applet_Sub1.gameCanvas.repaint();
            else {
                try {
                    int anLocalInt = client.currentLoadingBar.getStartPercentage();
                    String string = client.currentLoadingBar.getText();
                    if (Applet_Sub1.backBuffer == null)
                        Applet_Sub1.backBuffer = Applet_Sub1.gameCanvas.createImage((Applet_Sub1.canvasWidth), (Applet_Sub1.canvasHeight));
                    Graphics graphics_27_ = Applet_Sub1.backBuffer.getGraphics();
                    graphics_27_.clearRect(0, 0, Applet_Sub1.canvasWidth, Applet_Sub1.canvasHeight);
                    int anLocalInt_28_ = anImage3569.getWidth(null);
                    int anLocalInt_29_ = anImage3550.getWidth(null);
                    int anLocalInt_30_ = anImage3556.getWidth(null);
                    int anLocalInt_31_ = anImage3569.getHeight(null);
                    int anLocalInt_32_ = anImage3550.getHeight(null);
                    int anLocalInt_33_ = anImage3556.getHeight(null);
                    graphics_27_.drawImage(anImage3569, (method1636(anLocalInt_28_, -128) + anInt3566 - anInt3557 / 2), method1640(anLocalInt_31_, (byte) -127) + anInt3565, null);
                    int anLocalInt_34_ = -(anInt3557 / 2) + anInt3566 + anLocalInt_28_;
                    int anLocalInt_35_ = anInt3557 / 2 + anInt3566;
                    for (int anLocalInt_36_ = anLocalInt_34_; anLocalInt_35_ >= anLocalInt_36_; anLocalInt_36_ += anLocalInt_30_)
                        graphics_27_.drawImage(anImage3556, (anLocalInt_36_ + method1636(anLocalInt_28_, -117) + anInt3566), (method1640(anLocalInt_33_, (byte) -79) + anInt3565), null);
                    graphics_27_.drawImage(anImage3550, (method1636(anLocalInt_29_, -112) + anInt3566 + anInt3557 / 2), method1640(anLocalInt_32_, (byte) -128) + anInt3565, null);
                    int anLocalInt_37_ = anImage3564.getWidth(null);
                    int anLocalInt_38_ = anImage3564.getHeight(null);
                    int anLocalInt_39_ = anImage3549.getWidth(null);
                    int anLocalInt_40_ = anImage3549.getHeight(null);
                    int anLocalInt_41_ = anImage3547.getHeight(null);
                    int anLocalInt_42_ = anImage3563.getWidth(null);
                    int anLocalInt_43_ = anImage3563.getHeight(null);
                    int anLocalInt_44_ = anImage3547.getWidth(null);
                    int anLocalInt_45_ = anImage3548.getWidth(null);
                    int anLocalInt_46_ = anImage3555.getWidth(null);
                    int anLocalInt_47_ = method1636(anInt3562, -126) + anInt3558;
                    int anLocalInt_48_ = method1640(anInt3546, (byte) -100) + anInt3545;
                    graphics_27_.drawImage(anImage3564, anLocalInt_47_, ((-anLocalInt_38_ + anInt3546) / 2 + anLocalInt_48_), null);
                    graphics_27_.drawImage(anImage3549, (anLocalInt_47_ + anInt3562 - anLocalInt_39_), ((-anLocalInt_40_ + anInt3546) / 2 + anLocalInt_48_), null);
                    if (anImage3553 == null)
                        anImage3553 = (Applet_Sub1.gameCanvas.createImage(anInt3562 - (anLocalInt_37_ + anLocalInt_39_), anInt3546));
                    Graphics graphics_49_ = anImage3553.getGraphics();
                    for (int anLocalInt_50_ = 0; (anLocalInt_50_ < anInt3562 - anLocalInt_37_ - anLocalInt_39_); anLocalInt_50_ += anLocalInt_42_)
                        graphics_49_.drawImage(anImage3563, anLocalInt_50_, 0, null);
                    for (int anLocalInt_51_ = 0; (-anLocalInt_37_ + anInt3562 - anLocalInt_39_ > anLocalInt_51_); anLocalInt_51_ += anLocalInt_44_)
                        graphics_49_.drawImage(anImage3547, anLocalInt_51_, anInt3546 - anLocalInt_41_, null);
                    int anLocalInt_52_ = (anLocalInt * (anInt3562 - (anLocalInt_37_ + anLocalInt_39_)) / 100);
                    if (anLocalInt_52_ > 0) {
                        Image image = Applet_Sub1.gameCanvas.createImage(anLocalInt_52_, (-anLocalInt_41_ - anLocalInt_43_ + anInt3546));
                        int anLocalInt_53_ = image.getWidth(null);
                        Graphics graphics_54_ = image.getGraphics();
                        int anLocalInt_55_ = (anInt3552 * Class208.method2952(13363) / 10 % anLocalInt_45_);
                        for (int anLocalInt_56_ = -anLocalInt_45_ + anLocalInt_55_; anLocalInt_53_ > anLocalInt_56_; anLocalInt_56_ += anLocalInt_45_)
                            graphics_54_.drawImage(anImage3548, anLocalInt_56_, 0, null);
                        graphics_49_.drawImage(image, 0, anLocalInt_43_, null);
                    }
                    int anLocalInt_57_ = anLocalInt_52_;
                    anLocalInt_52_ = (-anLocalInt_39_ - anLocalInt_37_ + (anInt3562 - anLocalInt_52_));
                    if (anLocalInt_52_ > 0) {
                        Image image = Applet_Sub1.gameCanvas.createImage(anLocalInt_52_, (-anLocalInt_41_ - anLocalInt_43_ + anInt3546));
                        int anLocalInt_58_ = image.getWidth(null);
                        Graphics graphics_59_ = image.getGraphics();
                        for (int anLocalInt_60_ = 0; anLocalInt_60_ < anLocalInt_58_; anLocalInt_60_ += anLocalInt_46_)
                            graphics_59_.drawImage(anImage3555, anLocalInt_60_, 0, null);
                        graphics_49_.drawImage(image, anLocalInt_57_, anLocalInt_43_, null);
                    }
                    graphics_27_.drawImage(anImage3553, anLocalInt_37_ + anLocalInt_47_, anLocalInt_48_, null);
                    graphics_27_.setFont(aFont3571);
                    graphics_27_.setColor(aColor3544);
                    graphics_27_.drawString(string, (anLocalInt_47_ + ((anInt3562 - aFontMetrics3554.stringWidth(string)) / 2)), anInt3572 + (anLocalInt_48_ + anInt3546 / 2 + 4));
                    graphics.drawImage(Applet_Sub1.backBuffer, 0, 0, null);
                } catch (Exception exception) {
                    useOldLoadingBar = true;
                }
            }
        }
    }

    public Class87() {
        /* empty */
    }

    private final void method1641(byte argument_61_) throws IllegalAccessException, NoSuchFieldException {
        Class var_class = Signlink.mainapp.getClass();
        anImage3548 = (Image) method1638(var_class, "bar", -79);
        anImage3555 = (Image) method1638(var_class, "background", -117);
        anImage3564 = (Image) method1638(var_class, "left", -127);
        anImage3549 = (Image) method1638(var_class, "right", -110);
        anImage3563 = (Image) method1638(var_class, "top", -116);
        anImage3547 = (Image) method1638(var_class, "bottom", -68);
        anImage3569 = (Image) method1638(var_class, "bodyLeft", -98);
        anImage3550 = (Image) method1638(var_class, "bodyRight", -76);
        anImage3556 = (Image) method1638(var_class, "bodyFill", -108);
        if (argument_61_ <= -86) {
            aFont3571 = (Font) method1638(var_class, "bf", -120);
            aFontMetrics3554 = (FontMetrics) method1638(var_class, "bfm", -90);
            aColor3544 = (Color) method1638(var_class, "colourtext", -88);
            Object object = method1638(var_class, "lb", -112);
            Class var_class_62_ = object.getClass();
            aBoolean3567 = method1633("xMiddle", object, var_class_62_, 31245);
            aBoolean3561 = method1633("yMiddle", object, var_class_62_, 31245);
            anInt3558 = method1637("xOffset", var_class_62_, object, (byte) 123);
            anInt3545 = method1637("yOffset", var_class_62_, object, (byte) 123);
            anInt3562 = method1637("width", var_class_62_, object, (byte) 123);
            anInt3546 = method1637("height", var_class_62_, object, (byte) 123);
            anInt3566 = method1637("boxXOffset", var_class_62_, object, (byte) 123);
            anInt3565 = method1637("boxYOffset", var_class_62_, object, (byte) 123);
            anInt3557 = method1637("boxWidth", var_class_62_, object, (byte) 123);
            anInt3572 = method1637("textYOffset", var_class_62_, object, (byte) 123);
            anInt3552 = method1637("offsetPerTenCycles", var_class_62_, object, (byte) 123);
        }
    }

    static {
        aClass149_3560 = new Class149(64);
    }
}
