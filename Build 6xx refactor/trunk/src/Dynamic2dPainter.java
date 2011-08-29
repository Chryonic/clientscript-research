/* Class59_Sub22_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Dynamic2dPainter extends Rs2DPainter implements ImageProducer {
    private ColorModel colourModel;
    private ImageConsumer myConsumer;
    private Image myImage;
    private Canvas myCanvas;

    private synchronized void updateImage(int x, int y, int w, int h) {
        if (myConsumer != null) {
            myConsumer.setPixels(x, y, w, h, colourModel, this.myPixels, x + y * this.width, this.width);
            myConsumer.imageComplete(2);
        }
    }

    public final void startProduction(ImageConsumer argument_5_) {
        addConsumer(argument_5_);
    }

    public final synchronized void addConsumer(ImageConsumer consumer) {
        myConsumer = consumer;
        consumer.setDimensions(this.width, this.height);
        consumer.setProperties(null);
        consumer.setColorModel(colourModel);
        consumer.setHints(14);
    }

    final void setup(Canvas canvas, int w, int h) {
        myCanvas = canvas;
        ((Rs2DPainter) this).width = w;
        ((Rs2DPainter) this).height = h;
        ((Rs2DPainter) this).myPixels = new int[(this.width * this.height)];
        colourModel = new DirectColorModel(32, 16711680, 65280, 255);
        myImage = myCanvas.createImage(this);
        updateImage();
        myCanvas.prepareImage(myImage, myCanvas);
        updateImage();
        myCanvas.prepareImage(myImage, myCanvas);
        updateImage();
        myCanvas.prepareImage(myImage, myCanvas);
    }

    final void draw(int x, int y, int w, int h, int xMargins, int yMargins, Graphics g) {
        updateImage(xMargins, yMargins, w, h);
        Shape shape = g.getClip();
        g.clipRect(x, y, w, h);
        g.drawImage(myImage, x + -xMargins, y + -yMargins, myCanvas);
        g.setClip(shape);
    }

    public final synchronized void removeConsumer(ImageConsumer consumer) {
        if (myConsumer == consumer)
            myConsumer = null;
    }

    public final synchronized boolean isConsumer(ImageConsumer consumer) {
        return myConsumer == consumer;
    }

    private synchronized void updateImage() {
        if (myConsumer != null) {
            myConsumer.setPixels(0, 0, this.width, this.height, colourModel, (this.myPixels), 0, this.width);
            myConsumer.imageComplete(2);
        }
    }

    public final void requestTopDownLeftRightResend(ImageConsumer argument_30_) {
        /* empty */
    }
}
