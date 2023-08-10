import javax.swing.*;

public class JToolBar_Costumize {
    public static void main(String[] a) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JToolBar toolBar = new JToolBar("Still Driggbale");

toolBar.setFloatable(false);
toolBar.setRollover(true);

toolBar.add(new JButton("new"));
frame.add(toolBar,"North");

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
