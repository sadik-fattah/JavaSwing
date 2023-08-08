import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
class ShowAction extends AbstractAction{
    Component componentparent;
    public ShowAction(Component componentparent){
        super("About");
        putValue(Action.MNEMONIC_KEY,new Integer(KeyEvent.VK_A));
        this.componentparent = componentparent;
    }
    public void actionPerformed(ActionEvent actionEvent) {
        Runnable runnable = new Runnable() {
            public void run() {
              JOptionPane.showMessageDialog(componentparent,
                      "guercifzone for java swing",
                      "javaSwing tutariel",
                      JOptionPane.INFORMATION_MESSAGE);
            }
        };
        EventQueue.invokeLater(runnable);
    }
}
public class JMenu_Action_Objects {
    public static void main(final String args[]) {
        JFrame f = new JFrame("munu  example ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu filemenu = new JMenu("File");
        filemenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(filemenu);

        JMenuItem menuItemnew = new JMenuItem(new ShowAction(f));
        filemenu.add(menuItemnew);

        f.setJMenuBar(menuBar);
        f.setSize(350,250);
        f.setVisible(true);

    }
}
