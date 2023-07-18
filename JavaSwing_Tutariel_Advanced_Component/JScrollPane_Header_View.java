import javax.swing.*;
import java.awt.*;

public class JScrollPane_Header_View extends JFrame {
    public JScrollPane_Header_View() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = new JPanel(new GridLayout(5,10));
for (int i= 0;i<50;i++){
    panel.add(new JLabel("Label" + i));
}
JScrollPane scrolled = new JScrollPane(panel);
scrolled.setRowHeaderView(new JLabel("labels :"));
getContentPane().add(scrolled,BorderLayout.CENTER);
        pack();
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JScrollPane_Header_View();
    }
}
