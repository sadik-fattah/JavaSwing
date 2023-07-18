import javax.swing.*;
import java.awt.*;

public class JProgressBar_Indeterminate {
    public static void main(String args[]) {
    JFrame frame = new JFrame("Stepping Progress");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    final JProgressBar aJProgressBar = new JProgressBar(JProgressBar.VERTICAL);
    aJProgressBar.setStringPainted(true);
    aJProgressBar.setIndeterminate(true);

    frame.add(aJProgressBar, BorderLayout.NORTH);
    frame.setSize(300, 200);
    frame.setVisible(true);
}
}
