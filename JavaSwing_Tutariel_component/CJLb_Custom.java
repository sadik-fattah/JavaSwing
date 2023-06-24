import javax.swing.*;
import java.awt.Graphics;
import java.awt.Rectangle;
public class CJLb_Custom  extends JLabel {
    public CJLb_Custom() {
        this("");
    }

    public CJLb_Custom(String text) {
        super(text);
    }

    public void paint(Graphics g) {
        Rectangle r;
        super.paint(g);
        r = g.getClipBounds();
        g.drawLine(0, r.height - getFontMetrics(getFont()).getDescent(), getFontMetrics(getFont())
                .stringWidth(getText()), r.height - getFontMetrics(getFont()).getDescent());
    }
}
