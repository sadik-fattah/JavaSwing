import javax.swing.*;
import java.awt.*;

public class NumFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());

        for (int i = 1; i <= 5; i++) {
            contentPane.add(new JButton("Button  " + i));
        }

        frame.pack();
        frame.setVisible(true);
    }
}
