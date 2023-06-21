import javax.swing.*;
import java.awt.*;

public class NumBoxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout  Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();

         JPanel hPanel =new JPanel();
         BoxLayout boxLayout = new BoxLayout(hPanel,BoxLayout.X_AXIS);
         hPanel.setLayout(boxLayout);

         for (int i = 1; i <=5;i++){
             hPanel.add(new JButton("Button" +i));

         }
         contentPane.add(hPanel,BorderLayout.SOUTH);


        frame.pack();
        frame.setVisible(true);
    }
}
