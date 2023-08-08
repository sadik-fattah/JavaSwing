import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.URL;

public class JMenu_how_Look {
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
JMenuBar menuBar;
JMenu menu,submenu;
JMenuItem menuItem;
JRadioButtonMenuItem jRadioButtonMenuItem;
JCheckBoxMenuItem jCheckBoxMenuItem;

menuBar = new JMenuBar();

menu = new JMenu("A Menu");
menu.setMnemonic(KeyEvent.VK_A);
menu.getAccessibleContext().setAccessibleDescription(
        "The meu in this program that hjas menu item"
);
menuBar.add(menu);

menuItem = new JMenuItem("A text only menu Item", KeyEvent.VK_T);
menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,InputEvent.ALT_MASK));
menu.add(menuItem);

ImageIcon icon  = createImageIcon("at.png");
menuItem  = new JMenuItem("Both text and icon",icon);
menuItem.setMnemonic(KeyEvent.VK_B);
menu.add(menuItem);

menuItem= new JMenuItem(icon);
menuItem.setMnemonic(KeyEvent.VK_D);
menu.add(menuItem);

menu.addSeparator();
ButtonGroup group = new ButtonGroup();

jRadioButtonMenuItem = new JRadioButtonMenuItem("A radio Button menu item");
jRadioButtonMenuItem.setSelected(true);
jRadioButtonMenuItem.setMnemonic(KeyEvent.VK_N);

group.add(jRadioButtonMenuItem);
menu.add(jRadioButtonMenuItem);

menu.addSeparator();

jCheckBoxMenuItem = new JCheckBoxMenuItem("Another one");
jCheckBoxMenuItem.setMnemonic(KeyEvent.VK_C);
menu.add(jCheckBoxMenuItem);

jCheckBoxMenuItem= new JCheckBoxMenuItem("Another one");
        jCheckBoxMenuItem.setMnemonic(KeyEvent.VK_C);
        menu.add(jCheckBoxMenuItem);

        menu.addSeparator();
   submenu = new JMenu(" A Submenu");
   submenu.setMnemonic(KeyEvent.VK_S);

   menuItem = new JMenuItem("a item  in submenu");
   menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.ALT_MASK));
   submenu.add(menuItem);
   menuItem = new JMenuItem("Another menu item");
   submenu.add(menuItem);
   menu.add(submenu);

   menu = new JMenu("Another menu ");
   menu.setMnemonic(KeyEvent.VK_N);
   menu.getAccessibleContext().setAccessibleDescription(
           "this menu does  menu"
   );
   menuBar.add(menu);
   return menuBar;
    }

    public Container createContentPane() {
JPanel contentPane = new JPanel(new BorderLayout());
contentPane.setOpaque(true);

output =new JTextArea(5,30);
output.setEditable(false);
scrollPane = new JScrollPane(output);

contentPane.add(scrollPane,BorderLayout.CENTER);
return contentPane;
    }

    protected static ImageIcon createImageIcon(String path) {
        URL imgURL = JMenu_how_Look.class.getResource(path);
        if (imgURL != null){
            return new ImageIcon(imgURL);

        }else {
            System.out.println("Couldn't find file" + path);
            return null;
        }
    }


    private static void createAndShowGUI() {
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenu_how_Look rock = new JMenu_how_Look();
f.setJMenuBar(rock.createMenuBar());
f.setContentPane(rock.createContentPane());
f.setSize(450,260);
f.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }
}