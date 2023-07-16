import javax.swing.*;
import java.awt.*;

public class JScrollBar_Always_Display extends JFrame {
JTextArea jTextArea;
    public JScrollBar_Always_Display() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        jTextArea = new JTextArea();
        JScrollPane jpane = new JScrollPane(jTextArea
        ,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS
        ,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        container.add(jpane,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        JFrame f = new JScrollBar_Always_Display();
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
