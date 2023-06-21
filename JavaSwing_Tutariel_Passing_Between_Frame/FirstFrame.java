import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class FirstFrame  extends JFrame {
    public FirstFrame(){
        this.setUndecorated(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(200, 200);

        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 200, 100);
        Rectangle2D.Double rect = new Rectangle2D.Double(0, 100, 200, 200);

        Path2D path = new Path2D.Double();
        path.append(rect, true);
        path.append(ellipse, true);
        this.setShape(path);
        JButton closeButton = new JButton("Close");
        this.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(e -> System.exit(0));
    }
    public  static  void main(String[]args){
        SwingUtilities.invokeLater(() -> {
            FirstFrame frame = new FirstFrame();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
