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
          @Override
          public void menuSelected(MenuEvent menuEvent) {
              System.out.println("menuSelected");
          }

          @Override
          public void menuDeselected(MenuEvent menuEvent) {
              System.out.println("menuDeselected");
          }

          @Override
          public void menuCanceled(MenuEvent menuEvent) {
              System.out.println("menuCanceled");
          }
      });


        frame.setJMenuBar(menuBar);
        frame.setSize(350, 250);
        frame.setVisible(true);
    }
}
