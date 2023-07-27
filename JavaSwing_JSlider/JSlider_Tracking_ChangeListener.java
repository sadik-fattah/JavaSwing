import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class BoundedChangeListener implements ChangeListener{
    public void stateChanged(ChangeEvent changeEvent) {
        Object source = changeEvent.getSource();
        if (source instanceof BoundedRangeModel){
            BoundedRangeModel amodel  = (BoundedRangeModel)source;
            if (!amodel.getValueIsAdjusting()){
                System.out.println("Change : " + amodel.getValue());
            }
        } else if (source instanceof  JSlider) {
            JSlider thejSlider = (JSlider) source;
            if (!thejSlider.getValueIsAdjusting()){
                System.out.println("something is change :" + source);
            }
        }
    }
}

public class JSlider_Tracking_ChangeListener {
    public static void main(String args[]) {
        JFrame f = new JFrame("Tick Slider");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider jSlider = new JSlider();
        jSlider.addChangeListener(new  BoundedChangeListener());
f.add(jSlider, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
