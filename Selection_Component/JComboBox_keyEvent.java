import javax.swing.*;
import java.awt.*;

public class JComboBox_keyEvent {
    public static void main(String args[]) {
        String labels[] = { "أ", "ب", "ت", "ج", "خ", "ح" };
        JFrame f = new JFrame("كومبو بوكس");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox comboBox = new JComboBox(labels);
    f.add(comboBox,BorderLayout.SOUTH);

    JComboBox.KeySelectionManager manager =
            new JComboBox.KeySelectionManager() {
        @Override
        public int selectionForKey(char cKey, ComboBoxModel aModel) {
           System.out.println(cKey);

            return -1;
        }
    };

comboBox.setKeySelectionManager(manager);
        f.setSize(300, 100);
        f.setVisible(true);
    }
}
