import javax.swing.*;
import java.awt.*;

public class NumGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 0));

        for (int i = 1; i <= 9; i++) {
            buttonPanel.add(new JButton("Button  " + i));
        }

        contentPane.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
