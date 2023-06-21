import javax.swing.*;
import java.awt.*;

public class Regular_Event {
    public static void main(String[]args){
        JFrame frame = new JFrame("Regular Event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        JButton btnclose =new JButton("Close");
        container.add(btnclose);

        btnclose.addActionListener(e -> {System.exit(0);});

        frame.pack();
        frame.setVisible(true);
    }
}
