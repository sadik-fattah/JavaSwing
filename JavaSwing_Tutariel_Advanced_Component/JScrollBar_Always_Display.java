import javax.swing.*;
import java.awt.*;

public class JScrollBar_Always_Display extends JFrame {
    JTextArea textArea;

    public JScrollBar_Always_Display() {
        super();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        textArea = new JTextArea();
        JScrollPane pane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        contentPane.add(pane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame f = new JScrollBar_Always_Display();
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
