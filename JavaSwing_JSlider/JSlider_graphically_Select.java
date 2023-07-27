import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSlider_graphically_Select {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JSlider jSlider = new JSlider(0,150,0);

        jSlider.setPreferredSize(new Dimension(150,30));
        jSlider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
               int value = jSlider.getValue();
               if(value == 0){
                   System.out.println("0");
               } else if (value > 0 && value<= 30) {
                   System.out.println("value > 0 && value <= 30");
               }else if (value > 30 && value < 80){
                   System.out.println("value > 30 && value < 80");
               }else {
                   System.out.println("Max");
               }
            }
        });

        f.add(jSlider);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
