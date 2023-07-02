import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBox_Action_Listener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Iconizing CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox aCheckBox4 = new JCheckBox("Stuffed Crust");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                System.out.println(selected);
                // abstractButton.setText(newLabel);
            }
        };
        aCheckBox4.addActionListener(actionListener);
        frame.add(aCheckBox4);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
