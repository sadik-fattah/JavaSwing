import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBox_Share_Data {
    public static void main(String args[]) {
        final String labels[] = { "A", "B", "C", "D", "E", "F", "G" };

        final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);

        JFrame frame = new JFrame("Shared Data");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JComboBox comboBox1 = new JComboBox(model);
        comboBox1.setEditable(true);

        JComboBox comboBox2 = new JComboBox(model);
        comboBox2.setEditable(true);
        panel.add(comboBox1);
        panel.add(comboBox2);
        frame.add(panel, BorderLayout.NORTH);

        JButton button = new JButton("Add");
        frame.add(button, BorderLayout.SOUTH);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                model.addElement("New Added");
            }
        };
        button.addActionListener(actionListener);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
