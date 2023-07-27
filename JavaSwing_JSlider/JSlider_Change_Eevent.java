import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;


public class JSlider_Change_Eevent extends JFrame {
JSlider jSlider1 = new JSlider();
JSlider jSlider2 = new JSlider(JSlider.HORIZONTAL,-100,100,0);

    public JSlider_Change_Eevent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2, 1));
jSlider1.addChangeListener(new ChangeListener() {
    public void stateChanged(ChangeEvent changeEvent) {
        System.out.println("Slider1" + jSlider1.getValue());
    }
});
getContentPane().add(jSlider1);

jSlider2.setPaintTicks(true);
jSlider2.setMajorTickSpacing(50);
jSlider2.setMinorTickSpacing(10);
jSlider2.setPaintLabels(true);
        Hashtable ht = jSlider2.createStandardLabels(50);
        jSlider2.setLabelTable(ht);
jSlider2.addChangeListener(new ChangeListener() {
    public void stateChanged(ChangeEvent changeEvent) {
        System.out.println("Slider2" + jSlider2.getValue());
    }
});
        getContentPane().add(jSlider2);
        pack();
    }
    public static void main(String[] args) {
new JSlider_Change_Eevent().setVisible(true);
    }
}
