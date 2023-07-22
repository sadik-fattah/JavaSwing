import javax.swing.*;
import java.awt.*;

public class JSlider_Setting_ThumbIcon {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Tick Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // No Ticks
        JSlider jSliderOne = new JSlider();
        Icon icon = new ImageIcon("yourFile.gif");
        UIDefaults defaults = UIManager.getDefaults();
        defaults.put("Slider.horizontalThumbIcon", icon);

        frame.add(jSliderOne, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
