import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class JSlider_Labeling_Positions {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tick Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider jSliderOne = new JSlider();

        jSliderOne.setPaintLabels(true);

        Hashtable<Integer, JLabel> table = new Hashtable<Integer, JLabel>();
        table.put (0, new JLabel(new ImageIcon("yourFile.gif")));
        table.put (10, new JLabel("Ten"));
        table.put (25, new JLabel("Twenty-Five"));
        table.put (34, new JLabel("Thirty-Four"));
        table.put (52, new JLabel("Fifty-Two"));
        table.put (70, new JLabel("Seventy"));
        table.put (82, new JLabel("Eighty-Two"));
        jSliderOne.setLabelTable (table);

        frame.add(jSliderOne, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
