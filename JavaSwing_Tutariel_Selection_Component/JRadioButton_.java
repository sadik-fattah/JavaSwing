import javax.swing.*;
import java.awt.*;

public class JRadioButton_ extends JFrame {
    ButtonGroup genderGroup = new ButtonGroup();
    JRadioButton genderMale = new JRadioButton("Male");
    JRadioButton genderFemale = new JRadioButton("Female");
    JRadioButton genderUnknown = new JRadioButton("Unknown");

    public JRadioButton_() {
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
        JRadioButton_ bf = new JRadioButton_();
        bf.pack();
        bf.setVisible(true);
    }

}