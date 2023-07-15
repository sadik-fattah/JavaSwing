import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBar_Adjustment_Event {
    JScrollBar scrollBarVertical = new JScrollBar();
    JScrollBar scrollbarHorizontal = new JScrollBar(Adjustable.HORIZONTAL);

    JScrollBar_Adjustment_Event() {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        f.setSize(280, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        scrollBarVertical.setPreferredSize(new Dimension(20, 200));
        scrollbarHorizontal.setPreferredSize(new Dimension(200, 20));

        scrollbarHorizontal.setValue(50);

        scrollBarVertical.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                if (scrollBarVertical.getValueIsAdjusting())
                    return;
                System.out.println("Value of vertical scroll bar: " + ae.getValue());
            }
        });

        scrollbarHorizontal.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent ae) {
                System.out.println("Value of horizontal scroll bar: " + ae.getValue());
            }
        });

        f.add(scrollBarVertical);
        f.add(scrollbarHorizontal);

        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JScrollBar_Adjustment_Event();
    }
}
