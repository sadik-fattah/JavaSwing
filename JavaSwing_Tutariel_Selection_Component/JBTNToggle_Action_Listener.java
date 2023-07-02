import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBTNToggle_Action_Listener {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Selecting Toggle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToggleButton toggleButton = new JToggleButton("Toggle Button");

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                boolean selected = abstractButton.getModel().isSelected();
                System.out.println("Action - selected=" + selected + "\n");
            }
        };

        toggleButton.addActionListener(actionListener);
        frame.add(toggleButton, BorderLayout.NORTH);
        frame.setSize(300, 125);
        frame.setVisible(true);
    }
}
