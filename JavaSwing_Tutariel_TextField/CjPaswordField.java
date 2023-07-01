import javax.swing.*;
import java.awt.*;

public class CjPaswordField {
    public static void main(String args[]) {
        JFrame f = new JFrame("JPasswordField Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = f.getContentPane();
        content.setLayout(new BorderLayout());
        Box rowOne = Box.createHorizontalBox();
        rowOne.add(new JLabel("Username"));
        rowOne.add(new JTextField());
        Box rowTwo = Box.createHorizontalBox();
        rowTwo.add(new JLabel("Password"));
        rowTwo.add(new JPasswordField());
        content.add(rowOne, BorderLayout.NORTH);
        content.add(rowTwo, BorderLayout.SOUTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
