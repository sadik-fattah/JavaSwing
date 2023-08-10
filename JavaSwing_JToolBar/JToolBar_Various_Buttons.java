import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JToolBar_Various_Buttons  extends  JFrame{

    public JToolBar_Various_Buttons(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,300);

        JToolBar toolbar = new JToolBar();
        ImageIcon icon = new ImageIcon(new ImageIcon("save.png").getImage().getScaledInstance(20,30,Image.SCALE_DEFAULT));

        Action action = new AbstractAction("Button Label", icon) {
            public void actionPerformed(ActionEvent evt) {

            }
        };
        JButton c1 = new JButton(action);
        c1.setText(null);
        c1.setMargin(new Insets(0, 0, 0, 0));
        toolbar.add(c1);

        JToggleButton c2 = new JToggleButton(action);
        c2.setText(null);
        c2.setMargin(new Insets(0, 0, 0, 0));
        toolbar.add(c2);

        JComboBox c3 = new JComboBox(new String[] { "A", "B", "C" });
        c3.setMaximumSize(c3.getMinimumSize());
        toolbar.add(c3);

        add(c1,BorderLayout.NORTH);
        add(c2,BorderLayout.CENTER);
        add(c3,BorderLayout.SOUTH);
    }
    public static void main(String[] argv) throws Exception {
JToolBar_Various_Buttons jvb = new JToolBar_Various_Buttons();
jvb.setVisible(true);
    }
}
