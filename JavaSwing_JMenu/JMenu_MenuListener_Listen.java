import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.event.KeyEvent;

public class JMenu_MenuListener_Listen {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("MenuSample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        fileMenu.addMenuListener(new MenuListener() {

            public void menuSelected(MenuEvent e) {
                System.out.println("menuSelected");
            }

            public void menuDeselected(MenuEvent e) {
                System.out.println("menuDeselected");

            }

            public void menuCanceled(MenuEvent e) {
                System.out.println("menuCanceled");

            }
        });

        JMenuItem newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);

        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
