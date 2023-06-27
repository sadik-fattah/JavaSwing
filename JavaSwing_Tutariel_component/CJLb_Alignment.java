import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class CJLb_Alignment {

       
    public static void main(String [] args) {
        JFrame f = new JFrame("Label Demo");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label= new JLabel();
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));
        label.setText("Centered");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    Desktop.getDesktop().browse(new URI("https://guercifzone-ar.blogspot.com/"));
                }catch (URISyntaxException | IOException ex){
                    ex.printStackTrace();
                }
            }
        });
        f.add(label);
        f.setVisible(true);
    }

    }

