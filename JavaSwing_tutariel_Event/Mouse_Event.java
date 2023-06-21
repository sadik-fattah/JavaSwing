import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse_Event {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

        JButton closeButton = new JButton("Close");
        contentPane.add(closeButton);

        closeButton.addActionListener(e -> System.exit(0));
        // Add a MouseListener to the JButton
        closeButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                closeButton.setText("Mouse has  entered!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                closeButton.setText("Mouse has  exited!");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}
