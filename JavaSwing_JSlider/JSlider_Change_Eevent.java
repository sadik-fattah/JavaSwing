import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;

public class JSlider_Change_Eevent extends JFrame {
    JSlider slider1 = new JSlider();
    JSlider slider2 = new JSlider(JSlider.HORIZONTAL, -100, 100, 0);
    public JSlider_Change_Eevent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2, 1));

        slider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Slider1: " + slider1.getValue());
            }
        });
        getContentPane().add(slider1);

        slider2.setPaintTicks(true);
        slider2.setMajorTickSpacing(50);
        slider2.setMinorTickSpacing(10);
        slider2.setPaintLabels(true);
        Hashtable ht = slider2.createStandardLabels(50);
        slider2.setLabelTable(ht);

        slider2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Slider2: " + slider2.getValue());
            }
        });
        getContentPane().add(slider2);
        pack();
    }
    public static void main(String[] args) {
        new JSlider_Change_Eevent().setVisible(true);
    }
}
