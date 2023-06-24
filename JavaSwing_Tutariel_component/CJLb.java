import javax.swing.*;
import java.awt.*;

public class CJLb {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Demo");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label4= new JLabel("java2s.com");
        label4.setEnabled(false);
        JLabel label3 = new JLabel("First Name");
        label3.setFont(new Font("Courier New", Font.ITALIC, 18));
        label3.setForeground(Color.RED);
        ImageIcon imageIcon = new ImageIcon("icon.gif");
        JLabel label2 = new JLabel(imageIcon);
        JLabel label1 = new JLabel("<html>bold <br> plain</html>");
        f.add(label1);
        JLabel label= new JLabel("java2s.com");
        f.add(label);
        f.setVisible(true);
    }
}


