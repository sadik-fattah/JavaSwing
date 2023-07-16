import javax.swing.*;
import java.awt.*;

public class JScrollPane_Continuous_Layout extends JFrame {
    public JScrollPane_Continuous_Layout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel(new GridLayout(1, 5));
        for (int i = 0; i < 5; i++) {
            panel1.add(new JLabel("Left " + i));
        }
        panel1.setPreferredSize(new Dimension(250, 50));

        JPanel panel2 = new JPanel(new GridLayout(1, 5));
        for (int i = 0; i < 5; i++) {
            panel2.add(new JLabel("Right " + i));
        }
        panel2.setPreferredSize(new Dimension(250, 50));

        final JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                panel1, panel2);
        split.setContinuousLayout(true);
        getContentPane().add(split, BorderLayout.CENTER);
        pack();
        setSize(500, 100);
    }

    public static void main(String[] args) {
        new JScrollPane_Continuous_Layout().setVisible(true);
    }
}
