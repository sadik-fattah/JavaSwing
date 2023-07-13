import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggle_ActionListener {
    public static void main(String args[]) {
        JFrame frame = new JFrame(" action listener ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToggleButton jToggleButton = new JToggleButton("Selecting Toggle");

        ActionListener actionListener =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                System.out.println("Action - selected = "+ selected+"\n");

            }
        };
jToggleButton.addActionListener(actionListener);
frame.add(jToggleButton,BorderLayout.NORTH);
        frame.setSize(300, 125);
        frame.setVisible(true);
    }
}
