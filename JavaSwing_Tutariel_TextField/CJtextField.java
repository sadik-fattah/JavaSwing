import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CJtextField {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("Name: ");
        label.setDisplayedMnemonic(KeyEvent.VK_N);
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.CENTER) ;

        label.setLabelFor(textField);
        panel.add(label, BorderLayout.WEST);
        panel.add(textField, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        frame.setSize(250, 150);
        frame.setVisible(true);
    }
}
