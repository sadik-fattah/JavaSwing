import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class ScrollBarSample implements ChangeListener{

    public void stateChanged(ChangeEvent changeEvent) {
        Object source = changeEvent.getSource();
        if (source instanceof BoundedRangeModel){
            BoundedRangeModel amodel = (BoundedRangeModel) source;
       if (!amodel.getValueIsAdjusting()){
           System.out.println("changed: " +amodel.getValue());
       }
        }else {
            System.out.println("Somthing change : " +source);
        }

    }
}
public class JScrollBarEventsChangeListener {
    public static void main(String args[]) {
        ChangeListener changeListener =(ChangeListener)new ScrollBarSample();
        JScrollBar jScrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        BoundedRangeModel model = jScrollBar.getModel();
        model.addChangeListener(changeListener);
        JFrame f = new JFrame("ScrollBars R Us");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(jScrollBar, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}

