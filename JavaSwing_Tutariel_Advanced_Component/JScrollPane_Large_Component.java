import javax.swing.*;
import java.awt.*;

public class JScrollPane_Large_Component {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tabbed Pane Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel label = new JLabel("Label");
        label.setPreferredSize(new Dimension(1000,1000));
        JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(label);

        frame.add(jScrollPane, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}
