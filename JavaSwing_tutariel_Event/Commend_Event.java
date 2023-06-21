import javax.swing.*;
import java.awt.*;

public class Commend_Event {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();


        JButton closeButton = new JButton("Close");
        contentPane.add(closeButton);

        closeButton.addActionListener(e ->{
            System.out.println(e.getActionCommand());
            System.exit(0);
        } );

        frame.pack();
        frame.setVisible(true);
    }
}
