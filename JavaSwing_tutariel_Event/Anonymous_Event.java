import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anonymous_Event {
    static int counter;
    public static void main(String[]args){
        JFrame frame = new JFrame("Anonymous Event");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();

        JButton counterButton = new JButton("Clicked #0");
        JButton closeButton = new JButton("Close");
        frame.setLayout(new FlowLayout());
        container.add(closeButton);
        container.add(counterButton);

        counterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                counterButton.setText("Clicked #" + counter++);
            }
        });

        counterButton.addActionListener(e -> {System.exit(0);});
        frame.pack();
        frame.setVisible(true);
    }
}
