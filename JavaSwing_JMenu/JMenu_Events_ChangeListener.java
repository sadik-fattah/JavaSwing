import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;

public class JMenu_Events_ChangeListener {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("MenuSample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        fileMenu.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                System.out.println("File Menu Changed");

            }
        });

        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);

        newMenuItem.addChangeListener(new ChangeListener() {

            public void stateChanged(ChangeEvent e) {
                System.out.println("new menu item changed");

            }
        });

        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
