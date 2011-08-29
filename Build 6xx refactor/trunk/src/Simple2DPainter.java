/* Class59_Sub22_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

final class Simple2DPainter extends Rs2DPainter {
    private Image myImage;
    private Rectangle clipRectangle;
    private Canvas myCanvas;

    final void setup(Canvas canvas, int w, int h) {
        myCanvas = canvas;
        clipRectangle = new Rectangle();
        this.width = w;
        this.height = h;
        this.myPixels = new int[(this.height * this.width)];
        DataBufferInt databufferint = new DataBufferInt(this.myPixels, (this.myPixels).length);
        DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel((this.width), (this.height))), databufferint, null);
        myImage = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
    }

    final void draw(int x, int y, int w, int h, int xMargin, int yMargin, Graphics g) {
        Shape oldClip = g.getClip();
        clipRectangle.y = y;
        clipRectangle.height = h;
        clipRectangle.width = w;
        clipRectangle.x = x;
        g.setClip(clipRectangle);
        g.drawImage(myImage, x - xMargin, y - yMargin, myCanvas);
        g.setClip(oldClip);
    }
}
