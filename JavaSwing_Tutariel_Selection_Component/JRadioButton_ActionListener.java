import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButton_ActionListener  {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Grouping Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(0, 1));

        ButtonGroup group = new ButtonGroup();
        JRadioButton aRadioButton = new JRadioButton("A");
        JRadioButton bRadioButton = new JRadioButton("B");

        ActionListener sliceActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                AbstractButton aButton = (AbstractButton) actionEvent.getSource();
                System.out.println("Selected: " + aButton.getText());
            }
        };

        panel.add(aRadioButton);
        group.add(aRadioButton);
        panel.add(bRadioButton);
        group.add(bRadioButton);

        aRadioButton.addActionListener(sliceActionListener);
        bRadioButton.addActionListener(sliceActionListener);


        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
