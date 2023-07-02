import javax.swing.*;
import java.awt.*;

public class JComboBox_KeyEvent {
    public static void main(String args[]) {
        String labels[] = { "A", "B", "C", "D", "E", "F" };
        JFrame frame = new JFrame("Selecting JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox comboBox = new JComboBox(labels);
        frame.add(comboBox, BorderLayout.SOUTH);

        JComboBox.KeySelectionManager manager =
                new JComboBox.KeySelectionManager() {
                    public int selectionForKey(char aKey, ComboBoxModel aModel) {
                        System.out.println(aKey);
                        return -1;
                    }
                };
        comboBox.setKeySelectionManager(manager);

        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
