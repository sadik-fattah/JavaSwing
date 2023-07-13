import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JComboBox_ShareData {
    public static void main(String args[]) {
        JFrame f = new JFrame("Shared Data");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        final  String labels[] = {"أ","ب","ت","ث","ج","ح","خ"};
        final DefaultComboBoxModel model = new DefaultComboBoxModel(labels);

        JComboBox comboBox1 = new JComboBox(model);
        comboBox1.setEditable(true);

       JComboBox comboBox2 =new JComboBox(model);
        comboBox2.setEditable(true);

        panel.add(comboBox1);
        panel.add(comboBox2);

        JButton btn =new JButton("إضافة");

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
          model.addElement("عنصر جديد");
          System.out.println(model);
            }
        };
        btn.addActionListener(actionListener);
        f.add(panel, BorderLayout.NORTH);
        f.add(btn,BorderLayout.SOUTH);

        f.setSize(300, 200);
        f.setVisible(true);
    }
}
