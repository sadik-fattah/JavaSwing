import javax.swing.*;
import java.awt.*;

public class JProgressBar_Indeterminate {
    public static void main(String args[]) {
    JFrame f = new JFrame("Stepping Progress");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    final JProgressBar jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL);
    jProgressBar.setIndeterminate(true);
    jProgressBar.setStringPainted(true);


    f.add(jProgressBar, BorderLayout.NORTH);
    f.setSize(300, 200);
    f.setVisible(true);
}
}
