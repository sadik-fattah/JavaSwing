import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

class ShowAction extends AbstractAction {
    Component parentComponent;

    public ShowAction(Component parentComponent) {
        super("About");
        putValue(Action.MNEMONIC_KEY, new Integer(KeyEvent.VK_A));
        this.parentComponent = parentComponent;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        Runnable runnable = new Runnable() {
            public void run() {
                JOptionPane.showMessageDialog(parentComponent, "About Swing", "About Box V2.0",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        };
        EventQueue.invokeLater(runnable);
    }
}
public class JMenu_Action_Objects {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("MenuSample Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        // File Menu, F - Mnemonic
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        // File->New, N - Mnemonic
        JMenuItem newMenuItem = new JMenuItem(new ShowAction(frame));
        fileMenu.add(newMenuItem);

        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
