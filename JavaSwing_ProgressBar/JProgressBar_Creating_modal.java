import javax.swing.*;
import java.awt.*;

public class JProgressBar_Creating_modal {
    public static void main(String[] args) {
        JFrame parentFram = new JFrame();
        parentFram.setSize(500, 150);
        JLabel jLabel = new JLabel();
        jLabel.setText("Count : 0");

        parentFram.add(BorderLayout.CENTER, jLabel);
        parentFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFram.setVisible(true);

        final JDialog dialog = new JDialog(parentFram, "ProgressBar Dialog", true);
        JProgressBar jProgressBar = new JProgressBar(0, 500);
        dialog.add(BorderLayout.CENTER, jProgressBar);
        dialog.add(BorderLayout.NORTH, new JLabel("ProgressBar..."));
        dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        dialog.setSize(300, 75);
        dialog.setLocationRelativeTo(parentFram);

        Thread t = new Thread(new Runnable() {
            public void run() {
                dialog.setVisible(true);
            }
        });
        t.start();
        for (int i = 0; i <= 500; i++) {
            jLabel.setText("Count:" + i);
            jProgressBar.setValue(i);
            if (jProgressBar.getValue() == 500) {
                jProgressBar.setVisible(false);
                System.exit(0);
            }
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            jProgressBar.setVisible(true);
        }
        }


    }


