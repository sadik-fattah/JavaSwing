import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

class BoundChangeListener implements ChangeListener{

    public void stateChanged(ChangeEvent changeEvent) {
        Object source = changeEvent.getSource();
        if (source instanceof JProgressBar){
            JProgressBar progressBarte = (JProgressBar) source;
            System.out.println("Progressbar changed :" + progressBarte.getValue());
        }else {
            System.out.println("Progressbar changed :" + source);
        }
    }
}
public class JProgressBar_Events_notification {
    public static void main(String args[]) throws Exception {
        JFrame f = new JFrame("JProgressBar Events");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JProgressBar jProgressBar = new JProgressBar(JProgressBar.VERTICAL);
        jProgressBar.setStringPainted(true);

jProgressBar.addChangeListener(new BoundChangeListener());

for (int i = 0;i<80;i++){
    jProgressBar.setValue(i++);
    Thread.sleep(100);
}

        f.add(jProgressBar, BorderLayout.NORTH);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
