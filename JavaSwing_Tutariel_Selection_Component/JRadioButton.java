import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JRadioButton extends JFrame {
    ButtonGroup genderGroup = new ButtonGroup();
    JRadioButton genderMale = new JRadioButton("Male");
    JRadioButton genderFemale = new JRadioButton("Female");
    JRadioButton genderUnknown = new JRadioButton("Unknown");

    public JRadioButton() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);
        genderGroup.add(genderUnknown);

        Box b1 = Box.createVerticalBox();
        b1.add(genderMale);
        b1.add(genderFemale);
        b1.add(genderUnknown);

        Container contentPane = this.getContentPane();
        contentPane.add(b1, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JRadioButton bf = new JRadioButton();
        bf.pack();
        bf.setVisible(true);
    }


}
