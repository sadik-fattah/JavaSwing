import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class JComboBox_Select_Event extends JFrame {
    public JComboBox_Select_Event() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] sList = new String[] { "Spring", "Summer", "Fall", "Winter" };
        JComboBox<String> seasons = new JComboBox<>(sList);

        seasons.addItemListener((ItemEvent e) -> {
            Object item = e.getItem();
            if (e.getStateChange() == ItemEvent.SELECTED) {
                // Item has been selected
                System.out.println(item + "  has  been  selected");
            } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                // Item has been deselected
                System.out.println(item + "  has  been  deselected");
            }
        });

        Container contentPane = this.getContentPane();
        contentPane.add(seasons, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JComboBox_Select_Event bf = new JComboBox_Select_Event();
        bf.pack();
        bf.setVisible(true);
    }
}
