import javax.swing.*;
import java.awt.event.KeyEvent;

public class JMenu_AddSparator {
    public static void main(final String args[]) {
        JFrame f = new JFrame("MenuSample Separator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu filemenu = new JMenu("file");
        filemenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(filemenu);

        JMenuItem newmenuitem = new JMenuItem("new",KeyEvent.VK_N);
        filemenu.add(newmenuitem);

        filemenu.addSeparator();

        JMenuItem savemenuitem =  new JMenuItem("save" , KeyEvent.VK_S);
        filemenu.add(savemenuitem);


f.setJMenuBar(menuBar);
        f.setSize(350, 250);
        f.setVisible(true);
    }
}
