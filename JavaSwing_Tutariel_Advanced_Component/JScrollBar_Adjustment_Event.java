import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBar_Adjustment_Event {
JScrollBar jScrollBarVertical = new JScrollBar();
JScrollBar jScrollBarHoresontal = new JScrollBar(Adjustable.HORIZONTAL);
    JScrollBar_Adjustment_Event() {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(280, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jScrollBarVertical.setPreferredSize(new Dimension(20,200));
       jScrollBarHoresontal.setPreferredSize(new Dimension(200,20));
        jScrollBarHoresontal.setValue(50);

        jScrollBarVertical.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent aE) {
               if (jScrollBarVertical.getValueIsAdjusting())
                   return;
               System.out.println("value horesontal Scrolling bar :"+aE.getValue());
            }
        });
        jScrollBarHoresontal.addAdjustmentListener(new AdjustmentListener() {

            public void adjustmentValueChanged(AdjustmentEvent aE) {
                System.out.println("value voresontal Scrolling bar :"+aE.getValue());

            }
        });
        f.add(jScrollBarVertical);
        f.add(jScrollBarHoresontal);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JScrollBar_Adjustment_Event();
    }
}
