import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolbars_Quick_Access {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        menubar.add(file);
        f.setJMenuBar(menubar);

        JToolBar toolbar = new JToolBar();
        ImageIcon icon = new ImageIcon("exit.png");
        JButton exit = new JButton(icon);
        toolbar.add(exit);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        f.add(toolbar, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
