import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_Action_Listener  extends JFrame {
    JComboBox combo = new JComboBox();

    public JComboBox_Action_Listener() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        combo.addItem("A");
        combo.addItem("H");
        combo.addItem("P");
        combo.setEditable(true);
        System.out.println("#items=" + combo.getItemCount());

        combo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected index=" + combo.getSelectedIndex()
                        + " Selected item=" + combo.getSelectedItem());
            }
        });

        getContentPane().add(combo);
        pack();
        setVisible(true);
    }

    public static void main(String arg[]) {
        new JComboBox_Action_Listener();
    }
}
