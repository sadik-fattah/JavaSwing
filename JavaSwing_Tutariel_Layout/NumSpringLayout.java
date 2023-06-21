import javax.swing.*;
import java.awt.*;

public class NumSpringLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();


        SpringLayout springLayout = new SpringLayout();
        contentPane.setLayout(springLayout);


        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Little Bigger   Button   2");
        contentPane.add(b1);
        contentPane.add(b2);

        frame.pack();
        frame.setVisible(true);
    }
}
