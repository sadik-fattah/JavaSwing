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
        ImageIcon icon = new ImageIcon(new ImageIcon("save.png").getImage().getScaledInstance(20,30,Image.SCALE_DEFAULT));
        JButton exit = new JButton(icon);
        toolbar.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        f.add(toolbar, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
