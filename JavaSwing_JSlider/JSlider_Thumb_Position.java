import javax.swing.*;
import java.awt.*;

public class JSlider_Thumb_Position {
    public static void main(String args[]) {
        JFrame f = new JFrame("Tick Slider");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     JSlider jSlider = new JSlider();

     jSlider.setMinorTickSpacing(5);
     jSlider.setMajorTickSpacing(25);
jSlider.setPaintTicks(true);
jSlider.setSnapToTicks(true);
        f.add(jSlider,BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
