import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JProgressBar_Lengthy_Tasks {
    public static void main(String[] args) {
       final Timer timer;
       final JProgressBar progressBar =new JProgressBar();
       final JButton btn = new JButton("Start");

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
 f.add(progressBar);
 f.add(btn);
        ActionListener updatBar = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
               int val = progressBar.getValue();
               if (val >100){
                  // timer.stop();
                   btn.setText("End");
                   return;
               }
               progressBar.setValue(++val);
            }
        };
timer = new Timer(50,updatBar);
btn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent actionEvent) {
        if (timer.isRunning()){
            timer.stop();
            btn.setText("Start");
        }else if (btn.getText()!="End"){
          timer.start();
          btn.setText("stop");
        }
    }
});

        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
