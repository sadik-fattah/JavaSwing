import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class JSlider_Labeling_Positions {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tick Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JSlider jSlider =new JSlider();
jSlider.setPaintLabels(true);
ImageIcon imageIcon = new ImageIcon(new ImageIcon("myFile.gif").getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT));

        Hashtable<Integer, JLabel> table = new Hashtable<>();
        table.put(0,new JLabel(imageIcon));
        table.put(10,new JLabel("عشرة"));
        table.put(20,new JLabel("عشرون"));
        table.put(50,new JLabel("خمسون"));
        table.put(70,new JLabel("سبعون"));
        table.put(82,new JLabel("إثنان وتمانون"));
        jSlider.setLabelTable(table);
frame.add(jSlider,BorderLayout.NORTH);
        frame.setSize(1000, 200);
        frame.setVisible(true);
    }
}
