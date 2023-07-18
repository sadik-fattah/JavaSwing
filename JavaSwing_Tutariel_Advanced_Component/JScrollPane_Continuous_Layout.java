import javax.swing.*;
import java.awt.*;

public class JScrollPane_Continuous_Layout extends JFrame {
    public JScrollPane_Continuous_Layout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel1 = new JPanel(new GridLayout(1,5));
for (int i = 0;i<5;i++){
    panel1.add(new JLabel("left" + i));
}
panel1.setPreferredSize(new Dimension(250,50));

///////
   JPanel panel2 = new JPanel(new GridLayout(1,5));
        for (int j = 0;j<5;j++){
            panel2.add(new JLabel("Right" + j));
        }
        panel2.setPreferredSize(new Dimension(250,50));


       final  JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel1,panel2);

       splitPane.setContinuousLayout(true);
       getContentPane().add(splitPane,BorderLayout.CENTER);


        pack();
        setSize(500, 100);
    }

    public static void main(String[] args) {
new JScrollPane_Continuous_Layout().setVisible(true);
    }
}
