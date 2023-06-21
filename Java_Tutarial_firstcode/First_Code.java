import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class First_Code {
    private JFrame frame;

    public First_Code() {
        frame = new JFrame();
        frame.setTitle("Hello World!");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("JFrame is opened.");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("JFrame is closing.");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("JFrame is closing.");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("JFrame is minimized.");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("JFrame is restored.");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("JFrame is activated.");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("JFrame is deactivated.");

            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("JFrame is closing.");
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }
}
