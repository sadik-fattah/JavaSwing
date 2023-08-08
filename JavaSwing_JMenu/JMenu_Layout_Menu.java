import javax.swing.*;
import java.awt.*;

class HorisontalMunu extends JMenu{
    HorisontalMunu(String label){
        super(label);
        JPopupMenu pm = getPopupMenu();
        pm.setLayout(new BoxLayout(pm, BoxLayout.LINE_AXIS));

    }
    public Dimension getMinimusize(){
        return getPreferredSize();
    }
    public Dimension getMaximusize(){
        return getPreferredSize();
    }
    public void setPopupMenuVisible(boolean b) {
       boolean isVisible = isPopupMenuVisible();
       if (b != isVisible){
           if ((b== true) && isShowing()){
               int x = 0;
               int y = 0 ;
               Container parent = getParent();
               if (parent instanceof  JPopupMenu){
                   x= 0;
                   y = getHeight();
               }else {
                   x= getWidth();
                   y = 0;
               }
               getPopupMenu().show(this,x,y);

           }else {
               getPopupMenu().setVisible(false);
           }
       }
    }
}
public class JMenu_Layout_Menu {
    public JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new BoxLayout(menuBar,BoxLayout.PAGE_AXIS));
        menuBar.add(createMenu("Menu 1"));
        menuBar.add(createMenu("Menu 2"));
        menuBar.add(createMenu("Menu 3"));

        menuBar.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Color.BLACK));
        return menuBar;
    }
public JMenu createMenu(String title){
      JMenu m  = new HorisontalMunu(title);
      m.add("Menu item #1 in "+ title);
    m.add("Menu item #2 in "+ title);
    m.add("Menu item #3 in "+ title);

    JMenu submenu = new HorisontalMunu("Submenu");
    submenu.add("Menu item #1");
    submenu.add("Menu item #2");

    m.add(submenu);
    return m;
}

    private static void CreateGui(){
        JFrame f = new JFrame("layout demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenu_Layout_Menu mydemo = new JMenu_Layout_Menu();
        Container contantPane = f.getContentPane();
        contantPane.setBackground(Color.WHITE);
        contantPane.add(mydemo.createMenuBar(),BorderLayout.LINE_START);
        f.setSize(300,150);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CreateGui();
            }
        });
    }
}

