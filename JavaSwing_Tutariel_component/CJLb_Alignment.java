import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CJLb_Alignment {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Demo");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label= new JLabel("java2s.com");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Centered");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        f.add(label);
        f.setVisible(true);
    }
}
