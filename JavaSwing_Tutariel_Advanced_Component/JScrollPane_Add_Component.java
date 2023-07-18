import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class JScrollPane_Add_Component {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tabbed Pane Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel label = new JLabel("label");
label.setPreferredSize(new Dimension(1000,1000));
JScrollPane jScrollPane = new JScrollPane(label);

JButton jButton = new JButton();

jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
jScrollPane.setViewportBorder(new LineBorder(Color.RED));
jScrollPane.getViewport().add(jButton,null);
frame.add(jScrollPane,BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}
