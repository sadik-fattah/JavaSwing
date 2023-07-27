import javax.swing.*;
import java.awt.*;

public class JSlider_Client_Properties {
    public static void main(String args[]) {
        JFrame f = new JFrame("Tick Slider");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider jSlider1 = new JSlider();
        jSlider1.putClientProperty("jslider.isfilled" , Boolean.TRUE);
        JSlider jSlider2 = new JSlider();
        jSlider2.putClientProperty("jslider.isfilled" , Boolean.FALSE);

        f.add(jSlider1,BorderLayout.NORTH);
        f.add(jSlider2,BorderLayout.SOUTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
