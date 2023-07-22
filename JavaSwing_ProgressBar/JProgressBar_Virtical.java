import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Barthered extends Thread{
    private  static int DELAY = 500;
    JProgressBar progressBar;
    public Barthered(JProgressBar bar){
        progressBar = bar;
    }
    public void run(){
        int minimum = progressBar.getMinimum();
        int maximum = progressBar.getMaximum();
        for (int i = minimum;i< maximum;i++){
            try {
                int value = progressBar.getValue();
                progressBar.setValue(value + 1);
                Thread.sleep(DELAY);
            }catch (InterruptedException ignor){

            }
        }
    }
}

public class JProgressBar_Virtical {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Stepping Progress");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
final JProgressBar ajProgressBar = new JProgressBar(JProgressBar.VERTICAL);
ajProgressBar.setStringPainted(true);
final JButton ajButton = new JButton("Start");
        ActionListener actionListener = new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                ajButton.setEnabled(false);
                Thread setupper = new Barthered(ajProgressBar);
                setupper.start();
            }
        };
        ajButton.addActionListener(actionListener);
        frame.add(ajProgressBar, BorderLayout.NORTH);
        frame.add(BorderLayout.SOUTH,ajButton);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
