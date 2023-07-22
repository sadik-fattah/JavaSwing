import javax.swing.*;
import java.awt.*;

public class JSlider_Client_Properties {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tick Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider oneJSlider = new JSlider();
        oneJSlider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
        JSlider anotherJSlider = new JSlider();
        // Set to default setting
        anotherJSlider.putClientProperty("JSlider.isFilled", Boolean.FALSE);

        frame.add(oneJSlider, BorderLayout.NORTH);
        frame.add(anotherJSlider, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
