

import javax.swing.*;
import java.awt.*;

public class CJpnl  extends  JPanel{
    public CJpnl() {

    }
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.RED);
        g.drawOval(1, 1, width, height);
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("Oval Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CJpnl());
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
