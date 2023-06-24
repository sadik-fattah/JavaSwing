import javax.swing.*;
import java.awt.*;

public class CJLb_Mnemonic {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField nameTextField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setDisplayedMnemonic('N');
        nameLabel.setLabelFor(nameTextField);

        frame.add(nameLabel, BorderLayout.WEST);
        frame.add(nameTextField, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
