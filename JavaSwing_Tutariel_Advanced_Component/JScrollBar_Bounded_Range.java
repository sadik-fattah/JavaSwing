import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBar_Bounded_Range {
    public static void main(String args[]) {
        AdjustmentListener adjustmentListener = new AdjustmentListener() {

            public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent) {
               System.out.println("Adjusted"+ adjustmentEvent.getValue());
            }
        };
        JScrollBar jScrollBarone = new JScrollBar(JScrollBar.HORIZONTAL);
        jScrollBarone.addAdjustmentListener(adjustmentListener);

        JFrame f = new JFrame("ScrollBars R Us");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(jScrollBarone, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
