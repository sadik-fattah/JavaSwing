import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBar_FirstCode extends JFrame {
JProgressBar bar = new JProgressBar();
JButton step = new JButton("step");



    public JProgressBar_FirstCode() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      step.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent actionEvent) {
              int value = bar.getValue() + 50;
          if (value > bar.getMaximum()){
              value = bar.getMaximum();
          }
          bar.setValue(value);
          }
      });
getContentPane().add(bar, BorderLayout.NORTH);
getContentPane().add(step,BorderLayout.EAST);


        pack();
        setVisible(true);
    }

    public static void main(String arg[]) {
        new JProgressBar_FirstCode();
    }
}
