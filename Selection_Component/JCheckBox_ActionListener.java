import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBox_ActionListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Iconizing CheckBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     JCheckBox checkBox = new JCheckBox("Check  me ");
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton)actionEvent.getSource();
                boolean select= abstractButton.getModel().isSelected();
                System.out.println(select);
            }
        };
        checkBox.addActionListener(actionListener);
        frame.add(checkBox);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
