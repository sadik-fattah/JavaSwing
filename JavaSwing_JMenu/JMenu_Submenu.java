import javax.swing.*;
import java.awt.event.KeyEvent;


public class JMenu_Submenu {
    public static void main(final String args[]) {
        JFrame f = new JFrame("MenuSample Example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

JMenu fileMenu = new JMenu("file");
fileMenu.setMnemonic(KeyEvent.VK_F);
menuBar.add(fileMenu);

JMenuItem menuItemnew = new JMenuItem("New",KeyEvent.VK_N);
fileMenu.add(menuItemnew);

JMenu findOptionMenu = new JMenu("Options");
Icon aticon = new ImageIcon("at.jpg");
findOptionMenu.setIcon(aticon);
findOptionMenu.setMnemonic(KeyEvent.VK_O);
fileMenu.add(findOptionMenu);

ButtonGroup derictionGroup = new ButtonGroup();


JRadioButtonMenuItem fowardMenuItem = new JRadioButtonMenuItem("Foward",true);
fowardMenuItem.setMnemonic(KeyEvent.VK_F);
findOptionMenu.add(fowardMenuItem);
derictionGroup.add(fowardMenuItem);

        JRadioButtonMenuItem backwardMenuItem = new JRadioButtonMenuItem("Backward",true);
        backwardMenuItem.setMnemonic(KeyEvent.VK_B);
        findOptionMenu.add(backwardMenuItem);
        derictionGroup.add(backwardMenuItem);

        f.setJMenuBar(menuBar);
        f.setSize(350, 250);
        f.setVisible(true);
    }
}
