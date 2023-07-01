import javax.swing.*;
import java.awt.*;

public class CJLb_Custom  extends JLabel {
    private Color color;

    private int rectWidth;

    private int rectHeight;

    private int offsetX;

    public CJLb_Custom() {
    }

    public CJLb_Custom(String text, Color color, int offsetX, int rectWidth, int rectHeight) {
        super(text);
        this.color = color;
        this.rectWidth = rectWidth;
        this.rectHeight = rectHeight;
        this.offsetX = offsetX;
        setPreferredSize(new Dimension(rectWidth + offsetX, rectHeight));
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        g.fillRect(offsetX, 0, rectWidth + offsetX, rectHeight);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new CJLb_Custom("Test", Color.BLUE, 40, 40, 40));
        f.pack();
        f.setVisible(true);
    }
}
