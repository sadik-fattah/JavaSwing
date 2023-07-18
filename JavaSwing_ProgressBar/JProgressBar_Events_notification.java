import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
//JProgressBar Events: notification of data model changes through a ChangeListener
class BoundedChangeListener implements ChangeListener {
    public void stateChanged(ChangeEvent changeEvent) {
        Object source = changeEvent.getSource();
        if (source instanceof JProgressBar) {
            JProgressBar theJProgressBar = (JProgressBar) source;
            System.out.println("ProgressBar changed: " + theJProgressBar.getValue());
        } else {
            System.out.println("Something changed: " + source);
        }
    }
}
public class JProgressBar_Events_notification {
    public static void main(String args[]) throws Exception {
        JFrame frame = new JFrame("JProgressBar Events");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JProgressBar aJProgressBar = new JProgressBar(JProgressBar.VERTICAL);
        aJProgressBar.setStringPainted(true);

        aJProgressBar.addChangeListener(new BoundedChangeListener());

        for (int i = 0; i < 10; i++) {
            aJProgressBar.setValue(i++);
            Thread.sleep(100);
        }

        frame.add(aJProgressBar, BorderLayout.NORTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
