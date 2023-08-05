import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;

public class JMenu_Events_ChangeListener {
    public static void main(final String args[]) {
        JFrame frame = new JFrame("changelistener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

JMenu filemenu =new JMenu("file");
filemenu.setMnemonic(KeyEvent.VK_F);
menuBar.add(filemenu);

filemenu.addChangeListener(new ChangeListener() {
    public void stateChanged(ChangeEvent changeEvent) {
        System.out.println("File new is  changed");
    }
});
JMenuItem newjmenuItem = new JMenuItem("new");
filemenu.add(newjmenuItem);


newjmenuItem.addChangeListener(new ChangeListener() {

    public void stateChanged(ChangeEvent changeEvent) {
        System.out.println("new menu item is change");
    }
});
        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
