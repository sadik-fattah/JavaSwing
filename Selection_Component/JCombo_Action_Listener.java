import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCombo_Action_Listener extends JFrame {
    JComboBox comboBox = new JComboBox();
    public JCombo_Action_Listener() {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       comboBox.addItem("ب");
        comboBox.addItem("ي");
        comboBox.addItem("ن");

        comboBox.setEditable(true);
        System.out.println("#item" + comboBox.getItemCount());

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Select index" +
                        comboBox.getSelectedIndex()+"Select item" +
                        comboBox.getSelectedItem());
            }
        });
        getContentPane().add(comboBox);
        pack();
        setVisible(true);
    }

    public static void main(String arg[]) {
        new JCombo_Action_Listener();
    }


}
