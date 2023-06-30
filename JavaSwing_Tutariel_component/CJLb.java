import javax.swing.*;
import java.awt.*;

public class CJLb {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Demo");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("testing.gif");

        JLabel label= new JLabel("GUERCIFZONE-AR.BLOGSPOT.COM");
        JLabel label1 = new JLabel("<html>firstLine <br> nextLine</html>");
        JLabel label2 = new JLabel(imageIcon);
        JLabel label3 = new JLabel("J@k!NZ0");
        JLabel label4= new JLabel("GUERCIFZONE");

        label4.setEnabled(false);
        label3.setFont(new Font("Courier New", Font.ITALIC, 18));

        f.add(label4);
        f.add(label3);
        f.add(label2);
        f.add(label1);
        f.add(label);
        f.pack();
        f.setVisible(true);
    }
}


