import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MenuActionListener implements ActionListener{
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Selected  " +actionEvent.getActionCommand());
    }
}
public class JMenu_Mnemonic_key {
    public static void main(final String args[]) {
        ActionListener menuListener = new MenuActionListener();
        JFrame f = new JFrame("MenuSample Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

JMenu fileMenu = new JMenu("file");
fileMenu.setMnemonic(KeyEvent.VK_F);
menuBar.add(fileMenu);

JMenuItem newMenuItem = new JMenuItem(" new",KeyEvent.VK_N);
newMenuItem.addActionListener(menuListener);
fileMenu.add(newMenuItem);


        f.setJMenuBar(menuBar);
        f.setSize(350, 250);
        f.setVisible(true);
    }
}
