import javax.swing.*;
import java.awt.event.KeyEvent;

public class JMenu_AddSparator {
    public static void main(final String args[]) {
        JFrame f = new JFrame("MenuSample Separator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);


        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        fileMenu.add(newMenuItem);


        fileMenu.addSeparator();


        JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
        fileMenu.add(saveMenuItem);

        f.setJMenuBar(menuBar);
        f.setSize(350, 250);
        f.setVisible(true);
    }
}
