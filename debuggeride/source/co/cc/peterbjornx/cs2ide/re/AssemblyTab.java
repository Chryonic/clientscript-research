package co.cc.peterbjornx.cs2ide.re;

import co.cc.peterbjornx.cs2ide.debugger.State;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

/**
 * Created by IntelliJ IDEA.
 * User: Peter
 * Date: 1/31/11
 * Time: 9:44 PM
 * Computer: Peterbjornx-PC.rootdomain.asn.local (192.168.178.27)
 */
public class AssemblyTab implements MouseMotionListener{
    private JEditorPane epane;
    private JPanel panel1;
    private DisasmFunction disasmFunction;
    private co.cc.peterbjornx.cs2ide.debugger.State state;

    public AssemblyTab() {
        epane.addMouseMotionListener(this);
    }

    public void setState(State state) {
        this.state = state;
        this.disasmFunction = new DisasmFunction(Cs2Function.get(Integer.parseInt(state.getScript().replaceAll("function",""))));
        epane.setText(disasmFunction.getListing());
        for (int l = 0;l < disasmFunction.getLineCount();l++)
            if (disasmFunction.getLineAddress()[l] == state.getPc())
                epane.setCaretPosition(epane.viewToModel(new Point(0,l*epane.getFontMetrics(epane.getFont()).getHeight())));
    }

    /**
     * Invoked when a mouse button is pressed on a component and then
     * dragged.  <code>MOUSE_DRAGGED</code> events will continue to be
     * delivered to the component where the drag originated until the
     * mouse button is released (regardless of whether the mouse position
     * is within the bounds of the component).
     * <p/>
     * Due to platform-dependent Drag&Drop implementations,
     * <code>MOUSE_DRAGGED</code> events may not be delivered during a native
     * Drag&Drop operation.
     */
    public void mouseDragged(MouseEvent e) {
    }

    private void showTooltip(String text,MouseEvent e){
        ((JComponent)e.getComponent()).setToolTipText(text);
        ToolTipManager.sharedInstance().mouseMoved(e);
    }
    /**
     * Invoked when the mouse cursor has been moved onto a component
     * but no buttons have been pushed.
     */
    public void mouseMoved(MouseEvent e) {
        if (disasmFunction == null)
            return;
        JEditorPane editor = (JEditorPane) e.getSource();
        if (! editor.isEditable()) {
            int lineHeight = editor.getFontMetrics(editor.getFont()).getHeight();
            int line = e.getY() / lineHeight;
            if (line > disasmFunction.getLineCount())
                return;
            if (disasmFunction.getLineOperand()[line] == null)
                return;
            int pc = disasmFunction.getLineAddress()[line];
            int op = disasmFunction.getCs2Function().opcodes[pc];
            Object or = disasmFunction.getLineOperandV()[line];
            switch (disasmFunction.getLineOperand()[line]){
                case None:
                    return;
                case Immediate:
                    if (or instanceof Long)
                        showTooltip("0x"+Long.toHexString((Long)or),e);
                    else if (or instanceof Integer)
                        showTooltip("0x"+Integer.toHexString((Integer)or),e);
                    break;
                case IntLocalPtr:
                    showTooltip("localInt"+or+" = "+ state.getIntegerVariables()[(Integer)or],e);
                    break;
                case StringLocalPtr:
                    showTooltip("localString"+or+" = "+ state.getStringVariables()[(Integer)or],e);
                    break;
                case LongLocalPtr:
                    showTooltip("localLong"+or+" = "+ state.getLongVariables()[(Integer)or],e);
                    break;
                default:
                    showTooltip("NOT YET IMPLEMENTED",e);
                    break;
            }

        }
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
