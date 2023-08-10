import javax.swing.*;
import javax.swing.text.TextAction;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBar_Various_Buttons  extends  JFrame{

    public JToolBar_Various_Buttons(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,300);
        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);
        ImageIcon icon = new ImageIcon(new ImageIcon("save.png").getImage().getScaledInstance(20,30,Image.SCALE_DEFAULT));


        JButton c1 = new JButton(icon);

c1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("btn click c1");
    }
});
        c1.setText(null);
        c1.setMargin(new Insets(0,0,0,0));
        toolbar.add(c1);

        JToggleButton c2 = new JToggleButton(icon);
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("btn  click c2");
            }
        });
        c2.setText(null);
        c2.setMargin(new Insets(0,0,0,0));
        toolbar.add(c2);

        JComboBox c3 = new JComboBox(new String[]{"A","B","C"});
        c3.setMaximumSize(c3.getMinimumSize());
        toolbar.add(c3);

        toolbar.addSeparator();
     
        add(toolbar);
    }
    public static void main(String[] argv) throws Exception {
JToolBar_Various_Buttons jvb = new JToolBar_Various_Buttons();
jvb.setVisible(true);
    }
}
