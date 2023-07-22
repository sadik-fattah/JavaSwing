import javax.swing.*;
import java.awt.*;

public class JSlider_Displaying_TickMarks {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tick Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider jSliderOne = new JSlider();

        // Major Tick 25 - Minor 5
        jSliderOne.setMinorTickSpacing(5);
        jSliderOne.setMajorTickSpacing(25);
        jSliderOne.setPaintTicks(true);
        jSliderOne.setSnapToTicks(true);

        frame.add(jSliderOne, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
