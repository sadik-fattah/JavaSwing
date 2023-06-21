import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;

public class NextFrame extends  JFrame {


    public NextFrame(){
        super();
        initialize();
    }

    private  void initialize(){
        JButton closBtn = new JButton("close");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        this.setOpacity(0.80f);
        this.setTitle("Transparent window");
        this.setSize(800,400);
        this.setLocationRelativeTo(null);
        this.add(closBtn, BorderLayout.SOUTH);
        closBtn.addActionListener(e -> System.exit(0));

    }
    public  void  showWindow(){
        SwingUtilities.invokeLater(()->{
            NextFrame frame = new NextFrame();
            frame.setVisible(true);
        });

    }
}
