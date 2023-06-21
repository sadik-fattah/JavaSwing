import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class NumBorderLayout {



    public  static void main(String []args){
        JFrame frame = new JFrame("BorderLayout");
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container container = frame.getContentPane();
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("west"), BorderLayout.WEST);
        container.add(new JButton("Center"),BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);

    }
}
