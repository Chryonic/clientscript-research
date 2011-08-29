/* Class59_Sub46_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ScrolllessMouseMessage extends AbstractMouseMessage {
    int action;
    long eventTime;
    int clickCount;
    int x;
    int y;

    final int getClickCount() {
        return this.clickCount;
    }

    final long getEventTime() {
        return this.eventTime;
    }

    final int getX() {
        return this.x;
    }

    final int getY() {
        return this.y;
    }

    final int getAction() {
        return this.action;
    }
}
