import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


class  ScrollBarSample  implements ChangeListener {
    public void stateChanged(ChangeEvent changeEvent) {
        Object source = changeEvent.getSource();
        if (source instanceof BoundedRangeModel) {
            BoundedRangeModel aModel = (BoundedRangeModel) source;
            if (!aModel.getValueIsAdjusting()) {
                System.out.println("Changed: " + aModel.getValue());
            }
        } else {
            System.out.println("Something changed: " + source);
        }
    }
}

public class JScrollBarEventsChangeListener {
    public static void main(String args[]) {
        ChangeListener changeListener = (ChangeListener) new ScrollBarSample();
        JScrollBar aJScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        BoundedRangeModel model = aJScrollBar.getModel();
        model.addChangeListener(changeListener);

        JFrame frame = new JFrame("ScrollBars R Us");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(aJScrollBar, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

