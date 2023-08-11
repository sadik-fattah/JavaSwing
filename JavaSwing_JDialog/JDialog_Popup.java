import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialog_Popup extends JFrame {
    JDialog d = new JDialog(this, "Dialog title", true);

    public JDialog_Popup() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        d.getContentPane().add(new JLabel("Click the OK button"), BorderLayout.CENTER);
        JButton closeIt = new JButton("OK");
        closeIt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Closing dialog");
                d.dispose();
            }
        });
        d.getContentPane().add(closeIt, BorderLayout.SOUTH);
        d.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        d.pack();

        getContentPane().add(new JLabel("Placeholder label"));
        pack();
        setSize(200, 200);
        setVisible(true);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new JDialog_Popup();
    }
}