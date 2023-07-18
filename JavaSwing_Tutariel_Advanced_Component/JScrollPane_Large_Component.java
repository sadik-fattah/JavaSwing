import javax.swing.*;
import java.awt.*;

public class JScrollPane_Large_Component {
    public static   void main(String args[]) {
        JFrame f = new JFrame("Tabbed Pane Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel label = new JLabel("ldfldfldf");
label.setPreferredSize(new Dimension(1000,1000));
JScrollPane jScrollPane = new JScrollPane();
jScrollPane.setViewportView(label);

f.add(jScrollPane,BorderLayout.CENTER);
        f.setSize(400, 150);
        f.setVisible(true);
    }
}
