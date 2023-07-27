import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
class MenuActionListener implements ActionListener {
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Selected: " + actionEvent.getActionCommand());
    }
}
public class JMenu_Mnemonic_key {
    public static void main(final String args[]) {
        ActionListener menuListener = new MenuActionListener();
        JFrame frame = new JFrame("MenuSample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        // File Menu, F - Mnemonic
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // File->New, N - Mnemonic
        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        newMenuItem.addActionListener(menuListener);
        fileMenu.add(newMenuItem);


        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
